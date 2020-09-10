package pbandk.gen

open class CodeGenerator(
    val file: File,
    val kotlinTypeMappings: Map<String, String>,
    @Suppress("unused") val params: Map<String, String>
) {
    protected val bld = StringBuilder()
    protected var indent = ""

    fun generate(): String {
        line("@file:OptIn(pbandk.PublicForGeneratedCode::class)").line()
        file.kotlinPackageName?.let { line("package $it") }
        file.types.forEach { writeType(it) }
        file.types.filterIsInstance<File.Type.Message>().forEach { writeMessageExtensions(it) }
        return bld.toString()
    }

    protected fun line() = also { bld.append("\n") }
    protected fun line(str: String) = also { bld.append(indent).append(str).append("\n") }
    protected fun lineBegin(str: String = "") = also { bld.append(indent).append(str) }
    protected fun lineMid(str: String) = also { bld.append(str) }
    protected fun lineEnd(str: String = "") = also { bld.append(str).append("\n") }
    protected fun indented(fn: () -> Any?) = also {
        indent += "    "
        fn().also { indent = indent.dropLast(4) }
    }

    protected fun writeType(type: File.Type, parentType: String? = null) = when (type) {
        is File.Type.Enum -> writeEnumType(type, parentType)
        is File.Type.Message -> writeMessageType(type, parentType)
    }

    protected fun writeEnumType(type: File.Type.Enum, parentType: String? = null) {
        val parentPrefix = parentType?.let { "${it}." }.orEmpty()
        val typeName = "${parentPrefix}${type.kotlinTypeName}"
        // Enums are sealed classes w/ a value and a name, and a companion object with all values
        line().line("sealed class ${type.kotlinTypeName}(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {").indented {
            line("override fun equals(other: kotlin.Any?) = other is ${typeName} && other.value == value")
            line("override fun hashCode() = value.hashCode()")
            line("override fun toString() = \"${typeName}.\${name ?: \"UNRECOGNIZED\"}(value=\$value)\"")
            line()
            type.values.forEach { line("object ${it.kotlinValueTypeName} : ${type.kotlinTypeName}(${it.number}, \"${it.name}\")") }
            line("class UNRECOGNIZED(value: Int) : ${typeName}(value)")
            line()
            line("companion object : pbandk.Message.Enum.Companion<${typeName}> {").indented {
                line("val values: List<${typeName}> by lazy { listOf(${type.values.joinToString(", ") { it.kotlinValueTypeName }}) }")
                line("override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)")
                line("override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException(\"No ${type.kotlinTypeName} with name: \$name\")")
            }.line("}")
        }.line("}")
    }

    protected fun writeMessageType(type: File.Type.Message, parentType: String? = null) {
        val parentPrefix = parentType?.let { "${it}." }.orEmpty()
        val typeName = "${parentPrefix}${type.kotlinTypeName}"
        var extends = "pbandk.Message"
        if (type.mapEntry) extends += ", Map.Entry<${type.mapEntryKeyKotlinType}, ${type.mapEntryValueKotlinType}>"

        line().line("data class ${type.kotlinTypeName}(").indented {
            val fieldBegin = if (type.mapEntry) "override " else ""
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Numbered -> lineBegin(fieldBegin).writeConstructorField(field, true).lineEnd(",")
                    is File.Field.OneOf -> line("val ${field.kotlinFieldName}: ${field.kotlinTypeName}<*>? = null,")
                }
            }
            // The unknown fields
            line("override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")
        }.line(") : $extends {").indented {
            // One-ofs as sealed class hierarchies
            type.fields.filterIsInstance<File.Field.OneOf>().forEach(::writeOneOfType)

            line("override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)")
            line("override val descriptor get() = Companion.descriptor")
            line("override val protoSize by lazy { super.protoSize }")

            // Companion object
            line("companion object : pbandk.Message.Companion<${typeName}> {").indented {
                line("val defaultInstance by lazy { ${typeName}() }")
                line("override fun decodeWith(u: pbandk.MessageDecoder) = ${typeName}.decodeWithImpl(u)")
                line()
                writeMessageDescriptor(type, typeName)
            }.line("}")

            // Nested enums and types
            type.nestedTypes.forEach { writeType(it, typeName) }
        }.line("}")
    }

    protected fun writeConstructorField(field: File.Field.Numbered, nullableIfMessage: Boolean): CodeGenerator {
        lineMid("val ${field.kotlinFieldName}: ${field.kotlinValueType(nullableIfMessage)}")
        if (field.type != File.Field.Type.MESSAGE || nullableIfMessage) lineMid(" = ${field.defaultValue}")
        return this
    }

    protected fun writeOneOfType(oneOf: File.Field.OneOf) {
        line("sealed class ${oneOf.kotlinTypeName}<V>(value: V) : pbandk.Message.OneOf<V>(value) {").indented {
            oneOf.fields.forEach { field ->
                lineBegin("class ${oneOf.kotlinFieldTypeNames[field.name]}(")
                lineMid("${field.kotlinFieldName}: ${field.kotlinValueType(false)}")
                if (field.type != File.Field.Type.MESSAGE) lineMid(" = ${field.defaultValue}")
                lineEnd(") : ${oneOf.kotlinTypeName}<${field.kotlinValueType(false)}>(${field.kotlinFieldName})")
            }
        }.line("}").line()

        oneOf.fields.forEach { field ->
            line("val ${field.kotlinFieldName}: ${field.kotlinValueType(false)}?").indented {
                lineBegin("get() = ")
                lineMid("(${oneOf.kotlinFieldName} as? ${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]})")
                lineEnd("?.value")
            }
        }
        line()
    }

    protected fun writeMessageDescriptor(type: File.Type.Message, fullTypeName: String) {
        // Messages can have circular references to each other (e.g. `pbandk.wkt.Struct` includes a `pbandk.wkt.Value`
        // field, but `pbandk.wkt.Value` includes a `pbandk.wkt.Struct` field). On Kotlin/Native the companion object
        // (e.g. `pbandk.wkt.Value.Companion`) is automatically frozen because it's a singleton. But Kotlin/Native
        // doesn't allow cyclic frozen structures:
        // https://kotlinlang.org/docs/reference/native/concurrency.html#global-variables-and-singletons. In order to
        // break the circular references, `descriptor` needs to be a `lazy` field.
        line("override val descriptor: pbandk.MessageDescriptor<$fullTypeName> by lazy {").indented {
            line("pbandk.MessageDescriptor(").indented {
                line("messageClass = $fullTypeName::class,")
                line("messageCompanion = this,")
                line("fields = listOf(").indented {
                    val allFields = type.sortedStandardFieldsWithOneOfs()
                    allFields.forEachIndexed { i, (field, oneof) ->
                        line("pbandk.FieldDescriptor(").indented {
                            line("messageDescriptor = this::descriptor,")
                            line("name = \"${field.name}\",")
                            line("number = ${field.number},")
                            line("type = ${field.fieldDescriptorType(oneof != null)},")
                            oneof?.let { line("oneofMember = true,") }
                            field.jsonName?.let { line("jsonName = \"$it\",") }
                            line("value = $fullTypeName::${field.kotlinFieldName}")
                        }.line(if (i == allFields.lastIndex) ")" else "),")
                    }
                }.line(")")
            }.line(")")
        }.line("}")
    }

    fun writeMessageExtensions(type: File.Type.Message, parentType: String? = null) {
        val fullTypeName = if (parentType == null) type.kotlinTypeName else "$parentType.${type.kotlinTypeName}"
        writeMessageOrDefaultExtension(type, fullTypeName)
        writeMessageMergeExtension(type, fullTypeName)
        writeMessageDecodeWithExtension(type, fullTypeName)
        type.nestedTypes.filterIsInstance<File.Type.Message>().forEach { writeMessageExtensions(it, fullTypeName) }
    }

    protected fun writeMessageOrDefaultExtension(
        @Suppress("UNUSED_PARAMETER") type: File.Type.Message,
        fullTypeName: String
    ) {
        line()
        line("fun $fullTypeName?.orDefault() = this ?: $fullTypeName.defaultInstance")
    }

    protected fun writeMessageMergeExtension(type: File.Type.Message, fullTypeName: String) {
        fun mergeStandard(field: File.Field.Numbered.Standard) {
            if (field.repeated) {
                line("${field.kotlinFieldName} = ${field.kotlinFieldName} + plus.${field.kotlinFieldName},")
            } else if (field.type == File.Field.Type.MESSAGE) {
                line("${field.kotlinFieldName} = " +
                    "${field.kotlinFieldName}?.plus(plus.${field.kotlinFieldName}) ?: plus.${field.kotlinFieldName},")
            } else if (field.hasPresence) {
                line("${field.kotlinFieldName} = plus.${field.kotlinFieldName} ?: ${field.kotlinFieldName},")
            }
        }
        fun mergeWrapper(field: File.Field.Numbered.Wrapper) {
            if (field.repeated) {
                line("${field.kotlinFieldName} = ${field.kotlinFieldName} + plus.${field.kotlinFieldName},")
            } else {
                line("${field.kotlinFieldName} = plus.${field.kotlinFieldName} ?: ${field.kotlinFieldName},")
            }
        }
        fun mergeOneOf(oneOf: File.Field.OneOf) {
            val fieldsToMerge = oneOf.fields.filter { it.repeated || it.type == File.Field.Type.MESSAGE }
            if (fieldsToMerge.isEmpty()) {
                line("${oneOf.kotlinFieldName} = plus.${oneOf.kotlinFieldName} ?: ${oneOf.kotlinFieldName},")
            } else {
                line("${oneOf.kotlinFieldName} = when {").indented {
                    fieldsToMerge.forEach { subField ->
                        val subTypeName = "$fullTypeName." +
                                "${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[subField.name]}"
                        line("${oneOf.kotlinFieldName} is $subTypeName && " +
                                "plus.${oneOf.kotlinFieldName} is $subTypeName ->").indented {
                            line("$subTypeName(${oneOf.kotlinFieldName}.value + " +
                                "plus.${oneOf.kotlinFieldName}.value)")
                        }
                    }
                    line("else ->").indented {
                        line("plus.${oneOf.kotlinFieldName} ?: ${oneOf.kotlinFieldName}")
                    }
                }.line("},")
            }
        }

        line()
        line("private fun $fullTypeName.protoMergeImpl(plus: pbandk.Message?): $fullTypeName = (plus as? $fullTypeName)?.copy(").indented {
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Numbered.Standard -> mergeStandard(field)
                    is File.Field.Numbered.Wrapper -> mergeWrapper(field)
                    is File.Field.OneOf -> mergeOneOf(field)
                }
            }
            line("unknownFields = unknownFields + plus.unknownFields")
        }.line(") ?: this")
    }

    protected fun writeMessageDecodeWithExtension(type: File.Type.Message, fullTypeName: String) {
        val lineStr = "private fun $fullTypeName.Companion." +
                "decodeWithImpl(u: pbandk.MessageDecoder): $fullTypeName {"
        line().line("@Suppress(\"UNCHECKED_CAST\")").line(lineStr).indented {
            // A bunch of locals for each field, initialized with defaults
            val doneKotlinFields = type.fields.map {
                when (it) {
                    is File.Field.Numbered.Standard -> {
                        line(it.decodeWithVarDecl)
                        it.decodeWithVarDone
                    }
                    is File.Field.Numbered.Wrapper -> {
                        line(it.decodeWithVarDecl)
                        it.decodeWithVarDone
                    }
                    is File.Field.OneOf -> {
                        line("var ${it.kotlinFieldName}: $fullTypeName.${it.kotlinTypeName}<*>? = null")
                        it.kotlinFieldName
                    }
                }
            }

            // Now loop reading each field and check fields in order
            line().lineBegin("val unknownFields = u.readMessage(this) { ")
            type.sortedStandardFieldsWithOneOfs().takeIf { it.isNotEmpty() }?.let { fields ->
                lineEnd("_fieldNumber, _fieldValue ->").indented {
                    line("when (_fieldNumber) {").indented {
                        fields.forEach { (field, oneOf) ->
                            lineBegin("${field.number} -> ")
                            if (oneOf == null) {
                                lineMid("${field.kotlinFieldName} = ")
                                val kotlinType = when (field) {
                                    is File.Field.Numbered.Standard -> field.kotlinQualifiedTypeName
                                    is File.Field.Numbered.Wrapper -> field.wrappedType.standardTypeName
                                }
                                when {
                                    field is File.Field.Numbered.Standard && field.map -> {
                                        val mapEntry = field.mapEntry()!!
                                        lineEnd("(${field.kotlinFieldName} ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>> }")
                                    }
                                    field.repeated -> {
                                        // TODO update ListWithSize.protoSize as each field is read
                                        // or maybe just make the field lazy and computed the first time it's accessed?
                                        lineEnd("(${field.kotlinFieldName} ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<$kotlinType> }")
                                    }
                                    else -> {
                                        // TODO: for message types, merge multiple instances of the same field
                                        // see https://developers.google.com/protocol-buffers/docs/encoding#optional
                                        lineEnd("_fieldValue as $kotlinType")
                                    }
                                }
                            } else {
                                val oneOfTyp =
                                    "$fullTypeName.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                                require(field is File.Field.Numbered.Standard && !field.repeated)
                                lineEnd("${oneOf.kotlinFieldName} = $oneOfTyp(_fieldValue as ${field.kotlinQualifiedTypeName})")
                            }
                        }
                    }.line("}")
                }.line("}")
            } ?: lineEnd("_, _ -> }")

            // Wrap the params to the class and return it
            lineBegin("return $fullTypeName(")
            val chunkedDoneFields = doneKotlinFields.chunked(4)
            chunkedDoneFields.forEachIndexed { index, doneFieldSet ->
                val doneFieldStr = doneFieldSet.joinToString(", ", postfix = ",")
                if (index == 0 && chunkedDoneFields.size == 1) lineMid(doneFieldStr)
                else if (index == 0) lineEnd(doneFieldStr)
                else if (index == chunkedDoneFields.size - 1) indented { lineBegin(doneFieldStr) }
                else indented { line(doneFieldStr) }
            }
            if (chunkedDoneFields.isNotEmpty()) lineMid(" ")
            lineEnd("unknownFields)")
        }.line("}")
    }

    protected fun findLocalType(protoName: String, parent: File.Type.Message? = null): File.Type? {
        // Get the set to look in and the type name
        val (lookIn, typeName) =
            if (parent == null) file.types to protoName.removePrefix(".${file.packageName}.")
            else parent.nestedTypes to protoName
        // Go deeper if there's a dot
        typeName.indexOf('.').let {
            if (it == -1) return lookIn.find { it.name == typeName }
            return findLocalType(typeName.substring(it + 1), typeName.substring(0, it).let { parentTypeName ->
                lookIn.find { it.name == parentTypeName } as? File.Type.Message
            } ?: return null)
        }
    }

    protected fun File.Type.Message.sortedStandardFieldsWithOneOfs() =
        fields.flatMap {
            when (it) {
                is File.Field.Numbered.Standard -> listOf(it to null)
                is File.Field.Numbered.Wrapper -> listOf(it to null)
                is File.Field.OneOf -> it.fields.map { f -> f to it }
            }
        }.sortedBy { it.first.number }
    protected val File.Type.Message.mapEntryKeyField get() =
        if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard)
    protected val File.Type.Message.mapEntryValueField get() =
        if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard)
    protected val File.Type.Message.mapEntryKeyKotlinType get() =
        if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard).kotlinValueType(false)
    protected val File.Type.Message.mapEntryValueKotlinType get() =
        if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard).kotlinValueType(true)

    protected fun File.Field.Numbered.kotlinValueType(nullableIfMessage: Boolean) = when (this) {
        is File.Field.Numbered.Standard -> kotlinValueType(nullableIfMessage)
        is File.Field.Numbered.Wrapper -> kotlinValueType(nullableIfMessage)
    }
    protected val File.Field.Numbered.defaultValue get() = when (this) {
        is File.Field.Numbered.Standard -> defaultValue
        is File.Field.Numbered.Wrapper -> defaultValue
    }

    protected fun File.Field.Numbered.fieldDescriptorType(isOneOfMember: Boolean = false): String {
        return "pbandk.FieldDescriptor.Type." + when (this) {
            is File.Field.Numbered.Standard -> when {
                map -> {
                    val mapEntry = mapEntry()!!
                    "Map<${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>(" +
                            "keyType = ${mapEntry.mapEntryKeyField!!.fieldDescriptorType()}, " +
                            "valueType = ${mapEntry.mapEntryValueField!!.fieldDescriptorType()}" +
                            ")"
                }
                repeated -> "Repeated<$kotlinQualifiedTypeName>(valueType = ${copy(repeated = false).fieldDescriptorType()}${if (packed) ", packed = true" else ""})"
                type == File.Field.Type.MESSAGE -> "Message(messageCompanion = $kotlinQualifiedTypeName.Companion)"
                type == File.Field.Type.ENUM -> "Enum(enumCompanion = $kotlinQualifiedTypeName.Companion" + (if (hasPresence || isOneOfMember) ", hasPresence = true" else "") + ")"
                else -> "Primitive.${type.string.capitalize()}(" + (if (hasPresence || isOneOfMember) "hasPresence = true" else "") + ")"
            }
            is File.Field.Numbered.Wrapper -> when {
                repeated -> "Repeated<${wrappedType.standardTypeName}>(valueType = ${copy(repeated = false).fieldDescriptorType()})"
                else -> "Message(messageCompanion = ${wrappedType.wrapperKotlinTypeName}.Companion)"
            }
        }
    }

    protected val File.Field.Numbered.Standard.hasPresence get() = (file.version == 2 && optional)
    protected fun File.Field.Numbered.Standard.mapEntry() =
        if (!map) null else (localType as? File.Type.Message)?.takeIf { it.mapEntry }
    protected val File.Field.Numbered.Standard.localType get() = localTypeName?.let { findLocalType(it) }
    protected val File.Field.Numbered.Standard.kotlinQualifiedTypeName get() =
        kotlinLocalTypeName ?:
            localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find mapping for $it") } } ?:
            type.standardTypeName
    protected val File.Field.Numbered.Standard.decodeWithVarDecl get() = when {
        repeated -> mapEntry().let { mapEntry ->
            if (mapEntry == null) "var $kotlinFieldName: pbandk.ListWithSize.Builder<$kotlinQualifiedTypeName>? = null"
            else "var $kotlinFieldName: pbandk.MessageMap.Builder<" +
                    "${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>? = null"
        }
        requiresExplicitTypeWithVal -> "var $kotlinFieldName: ${kotlinValueType(true)} = $defaultValue"
        else -> "var $kotlinFieldName = $defaultValue"
    }
    protected val File.Field.Numbered.Standard.decodeWithVarDone get() =
        if (map) "pbandk.MessageMap.Builder.fixed($kotlinFieldName)"
        else if (repeated) "pbandk.ListWithSize.Builder.fixed($kotlinFieldName)"
        else kotlinFieldName
    protected fun File.Field.Numbered.Standard.kotlinValueType(nullableIfMessage: Boolean): String = when {
        map -> mapEntry()!!.let { "Map<${it.mapEntryKeyKotlinType}, ${it.mapEntryValueKotlinType}>" }
        repeated -> "List<$kotlinQualifiedTypeName>"
        hasPresence || (type == File.Field.Type.MESSAGE && nullableIfMessage) ->
            "$kotlinQualifiedTypeName?"
        else -> kotlinQualifiedTypeName
    }
    protected val File.Field.Numbered.Standard.defaultValue get() = when {
        map -> "emptyMap()"
        repeated -> "emptyList()"
        hasPresence -> "null"
        type == File.Field.Type.ENUM -> "$kotlinQualifiedTypeName.fromValue(0)"
        else -> type.defaultValue
    }
    protected val File.Field.Numbered.Standard.requiresExplicitTypeWithVal get() =
        repeated || hasPresence || type.requiresExplicitTypeWithVal

    protected val File.Field.Numbered.Wrapper.decodeWithVarDecl get() = when {
        repeated -> "var $kotlinFieldName: pbandk.ListWithSize.Builder<${wrappedType.standardTypeName}>? = null"
        else -> "var $kotlinFieldName: ${wrappedType.standardTypeName}? = $defaultValue"
    }
    protected val File.Field.Numbered.Wrapper.decodeWithVarDone get() = when {
        repeated -> "pbandk.ListWithSize.Builder.fixed($kotlinFieldName)"
        else -> kotlinFieldName
    }
    protected fun File.Field.Numbered.Wrapper.kotlinValueType(nullableIfMessage: Boolean) = when {
        repeated -> "List<${wrappedType.standardTypeName}>"
        else -> wrappedType.standardTypeName + if (nullableIfMessage) "?" else ""
    }
    protected val File.Field.Numbered.Wrapper.defaultValue get() = when {
        repeated -> "emptyList()"
        else -> "null"
    }

    protected val File.Field.Type.string get() = when (this) {
        File.Field.Type.BOOL -> "bool"
        File.Field.Type.BYTES -> "bytes"
        File.Field.Type.DOUBLE -> "double"
        File.Field.Type.ENUM -> "enum"
        File.Field.Type.FIXED32 -> "fixed32"
        File.Field.Type.FIXED64 -> "fixed64"
        File.Field.Type.FLOAT -> "float"
        File.Field.Type.INT32 -> "int32"
        File.Field.Type.INT64 -> "int64"
        File.Field.Type.MESSAGE -> "message"
        File.Field.Type.SFIXED32 -> "sFixed32"
        File.Field.Type.SFIXED64 -> "sFixed64"
        File.Field.Type.SINT32 -> "sInt32"
        File.Field.Type.SINT64 -> "sInt64"
        File.Field.Type.STRING -> "string"
        File.Field.Type.UINT32 -> "uInt32"
        File.Field.Type.UINT64 -> "uInt64"
    }
    protected val File.Field.Type.standardTypeName get() = when (this) {
        File.Field.Type.BOOL -> "Boolean"
        File.Field.Type.BYTES -> "pbandk.ByteArr"
        File.Field.Type.DOUBLE -> "Double"
        File.Field.Type.ENUM -> error("No standard type name for enums")
        File.Field.Type.FIXED32 -> "Int"
        File.Field.Type.FIXED64 -> "Long"
        File.Field.Type.FLOAT -> "Float"
        File.Field.Type.INT32 -> "Int"
        File.Field.Type.INT64 -> "Long"
        File.Field.Type.MESSAGE -> error("No standard type name for messages")
        File.Field.Type.SFIXED32 -> "Int"
        File.Field.Type.SFIXED64 -> "Long"
        File.Field.Type.SINT32 -> "Int"
        File.Field.Type.SINT64 -> "Long"
        File.Field.Type.STRING -> "String"
        File.Field.Type.UINT32 -> "Int"
        File.Field.Type.UINT64 -> "Long"
    }
    protected val File.Field.Type.defaultValue get() = when (this) {
        File.Field.Type.BOOL -> "false"
        File.Field.Type.BYTES -> "pbandk.ByteArr.empty"
        File.Field.Type.DOUBLE -> "0.0"
        File.Field.Type.ENUM -> error("No generic default value for enums")
        File.Field.Type.FIXED32, File.Field.Type.INT32, File.Field.Type.SFIXED32,
            File.Field.Type.SINT32, File.Field.Type.UINT32 -> "0"
        File.Field.Type.FIXED64, File.Field.Type.INT64, File.Field.Type.SFIXED64,
            File.Field.Type.SINT64, File.Field.Type.UINT64 -> "0L"
        File.Field.Type.FLOAT -> "0.0F"
        File.Field.Type.MESSAGE -> "null"
        File.Field.Type.STRING -> "\"\""
    }
    protected val File.Field.Type.requiresExplicitTypeWithVal get() =
        this == File.Field.Type.BYTES || this == File.Field.Type.ENUM || this == File.Field.Type.MESSAGE
    protected val File.Field.Type.wrapperKotlinTypeName get() =
        kotlinTypeMappings[wrapperTypeName] ?: error("No Kotlin type found for wrapper")
}

package pbandk.gen

import pbandk.UnknownField
import pbandk.wkt.FieldOptions

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
        file.extensions.forEach { writeExtension(it) }
        file.types.filterIsInstance<File.Type.Message>().forEach { writeMessageExtensions(it) }
        return bld.toString()
    }

    protected fun line() = also { bld.appendLine() }
    protected fun line(str: String) = also { bld.append(indent).appendLine(str) }
    protected fun lineBegin(str: String = "") = also { bld.append(indent).append(str) }
    protected fun lineMid(str: String) = also { bld.append(str) }
    protected fun lineEnd(str: String = "") = also { bld.appendLine(str) }
    protected fun indented(fn: () -> Any?) = also {
        indent += "    "
        fn().also { indent = indent.dropLast(4) }
    }

    private fun writeExtension(field: File.Field) {
        when (field) {
            is File.Field.Numbered -> {
                line()
                addDeprecatedAnnotation(field)
                line(
                    "val ${field.extendeeKotlinType}.${field.kotlinFieldName}: ${
                        field.kotlinValueType(true)
                    } "
                ).indented {
                    line("get() = getExtension(${file.kotlinPackageName}.${field.kotlinFieldName})")
                }.line()
                line("@pbandk.Export")
                addDeprecatedAnnotation(field)
                line("val ${field.kotlinFieldName} = pbandk.FieldDescriptor(").indented {
                    generateFieldDescriptorConstructorValues(
                        field,
                        field.extendeeKotlinType!!,
                        null,
                        "${field.extendeeKotlinType}.Companion::descriptor"
                    )
                }
                line(")")
            }
        }
    }

    protected fun writeType(
        type: File.Type,
        nested: Boolean = false
    ) = when (type) {
        is File.Type.Enum -> writeEnumType(type, nested)
        is File.Type.Message -> writeMessageType(type, nested)
    }

    protected fun writeEnumType(type: File.Type.Enum, nested: Boolean = false) {
        line()
        // Only mark top-level classes for export, internal classes will be exported transitively
        if (!nested) line("@pbandk.Export")
        // Enums are sealed classes w/ a value and a name, and a companion object with all values
        line("sealed class ${type.kotlinTypeName}(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {")
            .indented {
                line("override fun equals(other: kotlin.Any?) = other is ${type.kotlinFullTypeName} && other.value == value")
                line("override fun hashCode() = value.hashCode()")
                line("override fun toString() = \"${type.kotlinFullTypeName}.\${name ?: \"UNRECOGNIZED\"}(value=\$value)\"")
                line()
                type.values.forEach { line("object ${it.kotlinValueTypeName} : ${type.kotlinTypeName}(${it.number}, \"${it.name}\")") }
                line("class UNRECOGNIZED(value: Int) : ${type.kotlinTypeName}(value)")
                line()
                line("companion object : pbandk.Message.Enum.Companion<${type.kotlinFullTypeName}> {").indented {
                    line("val values: List<${type.kotlinFullTypeName}> by lazy { listOf(${type.values.joinToString(", ") { it.kotlinValueTypeName }}) }")
                    line("override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)")
                    line("override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException(\"No ${type.kotlinTypeName} with name: \$name\")")
                }.line("}")
            }.line("}")
    }

    protected fun writeMessageType(type: File.Type.Message, nested: Boolean = false) {
        var messageInterface = if (type.extensionRange.isNotEmpty()) "pbandk.ExtendableMessage" else "pbandk.Message"

        if (type.mapEntry) messageInterface += ", Map.Entry<${type.mapEntryKeyKotlinType}, ${type.mapEntryValueKotlinType}>"

        line()
        // Only mark top-level classes for export, internal classes will be exported transitively
        if (!nested) line("@pbandk.Export")
        line("data class ${type.kotlinTypeName}(").indented {
            val fieldBegin = if (type.mapEntry) "override " else ""
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Numbered -> {
                        addDeprecatedAnnotation(field)
                        lineBegin(fieldBegin).writeConstructorField(field, true).lineEnd(",")
                    }
                    is File.Field.OneOf -> line("val ${field.kotlinFieldName}: ${field.kotlinTypeName}<*>? = null,")
                }
            }
            // The unknown fields
            lineBegin("override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")

            if (messageInterface.startsWith("pbandk.ExtendableMessage")) {
                lineEnd(",")
                // The binary-compatibility-validator plugin doesn't correctly exclude properties with a non-public
                // annotation from the API dump unless the property's getter (& setter for mutable properties) is also
                // annotated. See https://github.com/Kotlin/binary-compatibility-validator/issues/36.
                line("@pbandk.PbandkInternal")
                line("@get:pbandk.PbandkInternal")
                line("override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()")
            } else {
                lineEnd()
            }
        }.line(") : $messageInterface {").indented {
            // One-ofs as sealed class hierarchies
            type.fields.filterIsInstance<File.Field.OneOf>().forEach(::writeOneOfType)

            line("override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)")
            line("override val descriptor get() = Companion.descriptor")
            line("override val protoSize by lazy { super.protoSize }")

            // Companion object
            line("companion object : pbandk.Message.Companion<${type.kotlinTypeNameWithPackage}> {").indented {
                line("val defaultInstance by lazy { ${type.kotlinTypeNameWithPackage}() }")
                line("override fun decodeWith(u: pbandk.MessageDecoder) = ${type.kotlinTypeNameWithPackage}.decodeWithImpl(u)")
                line()
                writeMessageDescriptor(type)
            }.line("}")

            // Nested enums and types
            type.nestedTypes.forEach { writeType(it, true) }
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
                addDeprecatedAnnotation(field)
                lineBegin("class ${oneOf.kotlinFieldTypeNames[field.name]}(")
                lineMid("${field.kotlinFieldName}: ${field.kotlinValueType(false)}")
                if (field.type != File.Field.Type.MESSAGE) lineMid(" = ${field.defaultValue}")
                lineEnd(") : ${oneOf.kotlinTypeName}<${field.kotlinValueType(false)}>(${field.kotlinFieldName})")
            }
        }.line("}").line()

        oneOf.fields.forEach { field ->
            addDeprecatedAnnotation(field)
            line("val ${field.kotlinFieldName}: ${field.kotlinValueType(false)}?").indented {
                lineBegin("get() = ")
                lineMid("(${oneOf.kotlinFieldName} as? ${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]})")
                lineEnd("?.value")
            }
        }
        line()
    }

    protected fun writeMessageDescriptor(type: File.Type.Message) {
        val allFields = type.sortedStandardFieldsWithOneOfs()
        val chunkSize = 200
        val needToChunk = allFields.size > chunkSize

        // Messages can have circular references to each other (e.g. `pbandk.wkt.Struct` includes a `pbandk.wkt.Value`
        // field, but `pbandk.wkt.Value` includes a `pbandk.wkt.Struct` field). On Kotlin/Native the companion object
        // (e.g. `pbandk.wkt.Value.Companion`) is automatically frozen because it's a singleton. But Kotlin/Native
        // doesn't allow cyclic frozen structures:
        // https://kotlinlang.org/docs/reference/native/concurrency.html#global-variables-and-singletons. In order to
        // break the circular references, `descriptor` needs to be a `lazy` field.
        line("override val descriptor: pbandk.MessageDescriptor<${type.kotlinTypeNameWithPackage}> by lazy {").indented {
            // XXX: When a message has lots of fields (e.g. `TestAllTypesProto3`), declaring the list of field
            // descriptors directly in the [MessageDescriptor] constructor can cause a
            // `java.lang.OutOfMemoryError: Java heap space` error in the Kotlin compiler (as of Kotlin 1.4.20).
            // As a workaround, we generate methods to generate each fieldDescriptor in chunks, as many as needed, with
            // a max size of $chunkSize to limit the size of the methods.
            line("val fieldsList = ArrayList<pbandk.FieldDescriptor<${type.kotlinTypeNameWithPackage}, *>>(${allFields.size})")
            if (needToChunk) {
                allFields.chunked(chunkSize).forEachIndexed { index, _ ->
                    line("addFields${index}(fieldsList)")
                }
            } else {
                addFields(allFields, type.kotlinTypeNameWithPackage)
            }

            line("pbandk.MessageDescriptor(").indented {
                line("fullName = \"${type.fullName}\",")
                line("messageClass = ${type.kotlinTypeNameWithPackage}::class,")
                line("messageCompanion = this,")
                line("fields = fieldsList")
            }.line(")")
        }.line("}")

        if (needToChunk) {
            allFields.chunked(chunkSize).forEachIndexed { index, chunk ->
                line("fun addFields${index}(fieldsList: ArrayList<pbandk.FieldDescriptor<${type.kotlinTypeNameWithPackage}, *>>) {").indented {
                    addFields(chunk, type.kotlinTypeNameWithPackage)
                }.line("}")
            }
        }
    }

    private fun addFields(
        chunk: List<Pair<File.Field.Numbered, File.Field.OneOf?>>,
        fullTypeName: String
    ) {
        line("fieldsList.apply {").indented {
            chunk.forEach { (field, oneof) ->
                if (field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
                line("add(").indented {
                    line("pbandk.FieldDescriptor(").indented {
                        generateFieldDescriptorConstructorValues(
                            field,
                            fullTypeName,
                            oneof,
                            "this@Companion::descriptor"
                        )
                    }.line(")")
                }.line(")")
            }
        }.line("}")
    }

    private fun generateFieldOptions(fieldOptions: FieldOptions) {
        // We don't use/support other field option values currently. Once we support all of the options, this check
        // should change to `fieldOptions != FieldOptions.defaultInstance`
        if (fieldOptions.deprecated != null || fieldOptions.unknownFields.isNotEmpty()) {
            line("options = pbandk.wkt.FieldOptions(").indented {
                fieldOptions.deprecated?.let {
                    lineBegin("deprecated = $it")
                    if (fieldOptions.unknownFields.isEmpty()) lineEnd() else lineEnd(",")
                }
                if (fieldOptions.unknownFields.isNotEmpty()) {
                    generateUnknownFields(fieldOptions.unknownFields)
                }
            }.line("),")
        }
    }

    private fun generateUnknownFields(unknownFields: Map<Int, UnknownField>) {
        line("unknownFields = mapOf(").indented {
            val lastFieldIndex = unknownFields.size - 1
            unknownFields.values.forEachIndexed { fieldIndex, field ->
                line("${field.fieldNum} to pbandk.UnknownField(").indented {
                    line("fieldNum = ${field.fieldNum},")
                    val lastValueIndex = field.values.size - 1
                    line("values = listOf(").indented {
                        field.values.forEachIndexed { valueIndex, value ->
                            lineBegin("pbandk.UnknownField.Value(")
                            lineMid("wireType = ${value.wireType}, ")
                            lineMid("rawBytes = byteArrayOf(${value.rawBytes.array.joinToString()})")
                            lineMid(")")
                            if (valueIndex != lastValueIndex) lineEnd(",") else lineEnd()
                        }
                    }.line(")")
                }.lineBegin(")")
                if (fieldIndex != lastFieldIndex) lineEnd(",") else lineEnd()
            }
        }.line(")")
    }

    fun writeMessageExtensions(type: File.Type.Message) {
        writeMessageOrDefaultExtension(type)
        writeMessageMergeExtension(type)
        writeMessageDecodeWithExtension(type)
        type.nestedTypes.filterIsInstance<File.Type.Message>().forEach { writeMessageExtensions(it) }
    }

    protected fun writeMessageOrDefaultExtension(type: File.Type.Message) {
        line()
        // There can be multiple differently-typed `orDefault` functions in the same scope which
        // Kotlin/JS cannot handle unfortunately. We have to annotate each of them with a unique
        // name so that Kotlin/JS knows which name to choose.
        //
        // Also, if current type is an inner class, `fullTypeName` will contains dots which we
        // have to get rid of (i.e. `Person.AddressBook` becomes `PersonAddressBook`).
        line("@pbandk.Export")
        line("@pbandk.JsName(\"orDefaultFor${type.kotlinFullTypeName.replace(".", "")}\")")
        line("fun ${type.kotlinFullTypeName}?.orDefault() = this ?: ${type.kotlinFullTypeName}.defaultInstance")
    }

    protected fun writeMessageMergeExtension(type: File.Type.Message) {
        fun mergeStandard(field: File.Field.Numbered.Standard) {
            if (field.repeated) {
                line("${field.kotlinFieldName} = ${field.kotlinFieldName} + plus.${field.kotlinFieldName},")
            } else if (field.type == File.Field.Type.MESSAGE) {
                line(
                    "${field.kotlinFieldName} = " +
                        "${field.kotlinFieldName}?.plus(plus.${field.kotlinFieldName}) ?: plus.${field.kotlinFieldName},"
                )
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
                        val subTypeName = "${type.kotlinFullTypeName}." +
                            "${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[subField.name]}"
                        line(
                            "${oneOf.kotlinFieldName} is $subTypeName && " +
                                "plus.${oneOf.kotlinFieldName} is $subTypeName ->"
                        ).indented {
                            line(
                                "$subTypeName(${oneOf.kotlinFieldName}.value + " +
                                    "plus.${oneOf.kotlinFieldName}.value)"
                            )
                        }
                    }
                    line("else ->").indented {
                        line("plus.${oneOf.kotlinFieldName} ?: ${oneOf.kotlinFieldName}")
                    }
                }.line("},")
            }
        }

        line()
        line("private fun ${type.kotlinFullTypeName}.protoMergeImpl(plus: pbandk.Message?): ${type.kotlinFullTypeName} = (plus as? ${type.kotlinFullTypeName})?.let {").indented {
            if (type.fields.filterIsInstance<File.Field.Numbered>().any { it.options.deprecated == true }) {
                line("@Suppress(\"DEPRECATION\")")
            }
            line("it.copy(").indented {
                type.fields.forEach { field ->
                    when (field) {
                        is File.Field.Numbered.Standard -> mergeStandard(field)
                        is File.Field.Numbered.Wrapper -> mergeWrapper(field)
                        is File.Field.OneOf -> mergeOneOf(field)
                    }
                }
                line("unknownFields = unknownFields + plus.unknownFields")
            }.line(")")

        }.line("} ?: this")
    }

    protected fun writeMessageDecodeWithExtension(type: File.Type.Message) {
        val lineStr = "private fun ${type.kotlinFullTypeName}.Companion." +
            "decodeWithImpl(u: pbandk.MessageDecoder): ${type.kotlinFullTypeName} {"
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
                        line("var ${it.kotlinFieldName}: ${type.kotlinFullTypeName}.${it.kotlinTypeName}<*>? = null")
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
                                    "${type.kotlinFullTypeName}.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                                require(field is File.Field.Numbered.Standard && !field.repeated)
                                lineEnd("${oneOf.kotlinFieldName} = $oneOfTyp(_fieldValue as ${field.kotlinQualifiedTypeName})")
                            }
                        }
                    }.line("}")
                }.line("}")
            } ?: lineEnd("_, _ -> }")

            // Wrap the params to the class and return it
            lineBegin("return ${type.kotlinFullTypeName}(")
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

    protected val File.Type.kotlinTypeNameWithPackage
        get() = file.kotlinPackageName?.let { "$it." }.orEmpty() + kotlinFullTypeName

    protected fun File.Type.Message.sortedStandardFieldsWithOneOfs() =
        fields.flatMap {
            when (it) {
                is File.Field.Numbered.Standard -> listOf(it to null)
                is File.Field.Numbered.Wrapper -> listOf(it to null)
                is File.Field.OneOf -> it.fields.map { f -> f to it }
            }
        }.sortedBy { it.first.number }

    protected val File.Type.Message.mapEntryKeyField
        get() =
            if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard)
    protected val File.Type.Message.mapEntryValueField
        get() =
            if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard)
    protected val File.Type.Message.mapEntryKeyKotlinType
        get() =
            if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard).kotlinValueType(false)
    protected val File.Type.Message.mapEntryValueKotlinType
        get() =
            if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard).kotlinValueType(true)

    protected fun File.Field.Numbered.kotlinValueType(nullableIfMessage: Boolean) = when (this) {
        is File.Field.Numbered.Standard -> kotlinValueType(nullableIfMessage)
        is File.Field.Numbered.Wrapper -> kotlinValueType(nullableIfMessage)
    }

    protected val File.Field.Numbered.extendeeKotlinType
        get() = extendee?.let { kotlinTypeMappings[it] }

    protected val File.Field.Numbered.defaultValue
        get() = when (this) {
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
    protected val File.Field.Numbered.Standard.kotlinQualifiedTypeName
        get() =
            kotlinLocalTypeName
                ?: localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find mapping for $it") } }
                ?: type.standardTypeName
    protected val File.Field.Numbered.Standard.decodeWithVarDecl
        get() = when {
            repeated -> mapEntry().let { mapEntry ->
                if (mapEntry == null) "var $kotlinFieldName: pbandk.ListWithSize.Builder<$kotlinQualifiedTypeName>? = null"
                else "var $kotlinFieldName: pbandk.MessageMap.Builder<" +
                    "${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>? = null"
            }
            requiresExplicitTypeWithVal -> "var $kotlinFieldName: ${kotlinValueType(true)} = $defaultValue"
            else -> "var $kotlinFieldName = $defaultValue"
        }
    protected val File.Field.Numbered.Standard.decodeWithVarDone
        get() =
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

    protected val File.Field.Numbered.Standard.defaultValue
        get() = when {
            map -> "emptyMap()"
            repeated -> "emptyList()"
            hasPresence -> "null"
            type == File.Field.Type.ENUM -> "$kotlinQualifiedTypeName.fromValue(0)"
            else -> type.defaultValue
        }
    protected val File.Field.Numbered.Standard.requiresExplicitTypeWithVal
        get() =
            repeated || hasPresence || type.requiresExplicitTypeWithVal

    protected val File.Field.Numbered.Wrapper.decodeWithVarDecl
        get() = when {
            repeated -> "var $kotlinFieldName: pbandk.ListWithSize.Builder<${wrappedType.standardTypeName}>? = null"
            else -> "var $kotlinFieldName: ${wrappedType.standardTypeName}? = $defaultValue"
        }
    protected val File.Field.Numbered.Wrapper.decodeWithVarDone
        get() = when {
            repeated -> "pbandk.ListWithSize.Builder.fixed($kotlinFieldName)"
            else -> kotlinFieldName
        }

    protected fun File.Field.Numbered.Wrapper.kotlinValueType(nullableIfMessage: Boolean) = when {
        repeated -> "List<${wrappedType.standardTypeName}>"
        else -> wrappedType.standardTypeName + if (nullableIfMessage) "?" else ""
    }

    protected val File.Field.Numbered.Wrapper.defaultValue
        get() = when {
            repeated -> "emptyList()"
            else -> "null"
        }

    protected val File.Field.Type.string
        get() = when (this) {
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
    protected val File.Field.Type.standardTypeName
        get() = when (this) {
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
    protected val File.Field.Type.defaultValue
        get() = when (this) {
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
    protected val File.Field.Type.requiresExplicitTypeWithVal
        get() =
            this == File.Field.Type.BYTES || this == File.Field.Type.ENUM || this == File.Field.Type.MESSAGE
    protected val File.Field.Type.wrapperKotlinTypeName
        get() =
            kotlinTypeMappings[wrapperTypeName] ?: error("No Kotlin type found for wrapper")

    private fun generateFieldDescriptorConstructorValues(
        field: File.Field.Numbered,
        fullTypeName: String,
        oneof: File.Field.OneOf?,
        messageDescriptorCompanion: String
    ) {
        line("messageDescriptor = ${messageDescriptorCompanion},")
        line("name = \"${field.name}\",")
        line("number = ${field.number},")
        line("type = ${field.fieldDescriptorType(oneof != null)},")
        oneof?.let { line("oneofMember = true,") }
        field.jsonName?.let { line("jsonName = \"$it\",") }
        generateFieldOptions(field.options)
        line("value = $fullTypeName::${field.kotlinFieldName}")
    }

    private fun addDeprecatedAnnotation(field: File.Field) {
        when (field) {
            is File.Field.Numbered -> if(field.options.deprecated == true) line("@Deprecated(message = \"Field marked deprecated in ${file.name}\")")
        }
    }
}

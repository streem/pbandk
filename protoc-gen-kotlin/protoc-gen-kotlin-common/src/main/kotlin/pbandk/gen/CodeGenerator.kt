package pbandk.gen

open class CodeGenerator(val file: File, val kotlinTypeMappings: Map<String, String>, val params: Map<String, String>) {
    protected val bld = StringBuilder()
    protected var indent = ""

    protected val jsonUseProtoNames = params["json_use_proto_names"]?.toBoolean() ?: false

    fun generate(): String {
        line("@file:UseSerializers(pbandk.ser.TimestampSerializer::class)")
        line()
        file.kotlinPackageName?.let { line("package $it") }
        line()
        line("import kotlinx.serialization.*")
        line("import kotlinx.serialization.json.*")
        file.types.forEach(::writeType)
        file.types.mapNotNull { it as? File.Type.Message }.forEach { writeMessageExtensions(it) }
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

    protected fun writeType(type: File.Type) = when (type) {
        is File.Type.Enum -> writeEnumType(type)
        is File.Type.Message -> writeMessageType(type)
    }

    protected fun writeEnumType(type: File.Type.Enum) {
        // Enums are sealed classes w/ a value and a name, and a companion object with all values
        line().line("sealed class ${type.kotlinTypeName}(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {").indented {
            line("override fun equals(other: kotlin.Any?) = other is ${type.kotlinTypeName} && other.value == value")
            line("override fun hashCode() = value.hashCode()")
            line("override fun toString() = \"${type.kotlinTypeName}.\${name ?: \"UNRECOGNIZED\"}(value=\$value)\"")
            line()
            type.values.forEach { line("object ${it.kotlinValueTypeName} : ${type.kotlinTypeName}(${it.number}, \"${it.name}\")") }
            line("class UNRECOGNIZED(value: Int) : ${type.kotlinTypeName}(value)")
            line()
            line("companion object : pbandk.Message.Enum.Companion<${type.kotlinTypeName}> {").indented {
                line("val values: List<${type.kotlinTypeName}> by lazy { listOf(${type.values.joinToString(", ") { it.kotlinValueTypeName }}) }")
                line("override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)")
                line("override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException(\"No ${type.kotlinTypeName} with name: \$name\")")
            }.line("}")
        }.line("}")
    }

    protected fun writeMessageType(type: File.Type.Message) {
        var extends = "pbandk.Message<${type.kotlinTypeName}>"
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
            line("val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")
        }.line(") : $extends {").indented {
            // One-ofs as sealed class hierarchies
            type.fields.mapNotNull { it as? File.Field.OneOf }.forEach(::writeOneOfType)
            // IO helpers
            line("override operator fun plus(other: ${type.kotlinTypeName}?) = protoMergeImpl(other)")
            line("override val protoSize by lazy { protoSizeImpl() }")
            line("override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)")
            line("override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)")
            line("fun toJsonMapper() = toJsonMapperImpl()")
            line("companion object : pbandk.Message.Companion<${type.kotlinTypeName}> {").indented {
                line("val defaultInstance by lazy { ${type.kotlinTypeName}() }")
                line("override fun protoUnmarshal(u: pbandk.Unmarshaller) = ${type.kotlinTypeName}.protoUnmarshalImpl(u)")
                line("override fun jsonUnmarshal(json: Json, data: String) = ${type.kotlinTypeName}.jsonUnmarshalImpl(json, data)")
            }.line("}")
            line()
            writeJsonMapperClass(type)
            // Nested enums and types
            type.nestedTypes.forEach(::writeType)
        }.line("}")
    }

    protected fun writeConstructorField(field: File.Field.Numbered, nullableIfMessage: Boolean): CodeGenerator {
        lineMid("val ${field.kotlinFieldName}: ${field.kotlinValueType(nullableIfMessage)}")
        if (field.type != File.Field.Type.MESSAGE || nullableIfMessage) lineMid(" = ${field.defaultValue}")
        return this
    }

    protected fun writeJsonMapperConstructorField(field: File.Field.Numbered, nullableIfMessage: Boolean): CodeGenerator {
        lineMid("val ${field.kotlinFieldName}: ${field.kotlinValueType(nullableIfMessage, true)}")
        when {
            field is File.Field.Numbered.Standard && field.map -> lineMid(" = emptyMap()")
            field.repeated -> lineMid(" = emptyList()")
            else -> lineMid(" = null")
        }
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

    private fun writeJsonMapperClass(type: File.Type.Message) {
        line("@Serializable")
        if (type.fields.isEmpty()) {
            line("class JsonMapper {").indented {
                line("fun toMessage() = toMessageImpl()")
            }.line("}")
        }
        else {
            line("data class JsonMapper (").indented {
                val allFields = type.sortedStandardFieldsWithOneOfs()
                allFields.forEachIndexed { i, (field, _) ->
                    val fieldName = if (jsonUseProtoNames) field.name else underscoreToCamelCase(field.name)
                    line("@SerialName(\"$fieldName\")")
                    lineBegin()
                    writeJsonMapperConstructorField(field, true)
                    lineEnd(if (i == allFields.lastIndex) "" else ",")
                }
            }.line(") {").indented {
                line("fun toMessage() = toMessageImpl()")
            }.line("}")
        }
    }

    fun writeMessageExtensions(type: File.Type.Message, parentType: String? = null) {
        val fullTypeName = if (parentType == null) type.kotlinTypeName else "$parentType.${type.kotlinTypeName}"
        writeMessageOrDefaultExtension(type, fullTypeName)
        writeMessageMergeExtension(type, fullTypeName)
        writeMessageSizeExtension(type, fullTypeName)
        writeMessageProtoMarshalExtension(type, fullTypeName)
        writeMessageProtoUnmarshalExtension(type, fullTypeName)
        writeMessageToJsonMapperExtension(type, fullTypeName)
        writeJsonMapperToMessageExtension(type, fullTypeName)
        writeMessageJsonMarshalExtension(type, fullTypeName)
        writeMessageJsonUnmarshalExtension(type, fullTypeName)
        type.nestedTypes.mapNotNull { it as? File.Type.Message }.forEach { writeMessageExtensions(it, fullTypeName) }
    }

    protected fun writeMessageOrDefaultExtension(type: File.Type.Message, fullTypeName: String) {
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
            } else if (file.version == 2 && field.optional) {
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
        line("private fun $fullTypeName.protoMergeImpl(plus: $fullTypeName?): $fullTypeName = plus?.copy(").indented {
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

    protected fun writeMessageSizeExtension(type: File.Type.Message, fullTypeName: String) {
        line().line("private fun $fullTypeName.protoSizeImpl(): Int {").indented {
            line("var protoSize = 0")
            // Go over each field doing size check
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Numbered.Standard ->
                        line("if (${field.nonDefaultCheckExpr}) protoSize += ${field.sizeExpr()}")
                    is File.Field.Numbered.Wrapper ->
                        line("if (${field.nonDefaultCheckExpr}) protoSize += ${field.sizeExpr()}")
                    is File.Field.OneOf -> {
                        line("when (${field.kotlinFieldName}) {").indented {
                            field.fields.forEach { subField ->
                                val subFieldTypeName = field.kotlinFieldTypeNames[subField.name]
                                line("is $fullTypeName.${field.kotlinTypeName}.$subFieldTypeName -> protoSize += " +
                                    subField.sizeExpr("${field.kotlinFieldName}.value"))
                            }
                        }.line("}")
                    }
                }
            }
            // Add the unknown fields and return
            line("protoSize += unknownFields.entries.sumBy { it.value.size() }")
            line("return protoSize")
        }.line("}")
    }

    protected fun writeMessageProtoMarshalExtension(type: File.Type.Message, fullTypeName: String) {
        line().line("private fun $fullTypeName.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {").indented {
            // Go over each and write each if it's not default
            type.sortedStandardFieldsWithOneOfs().forEach { (field, oneOf) ->
                if (oneOf == null) {
                    line("if (${field.nonDefaultCheckExpr}) ${field.writeExpr()}")
                } else {
                    // We acknowledge several unnecessary instanceof's here, however it's worth it to keep the fields
                    // in order and keep the code simple.
                    val subClassName = "$fullTypeName.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                    line("if (${oneOf.kotlinFieldName} is $subClassName) " +
                        field.writeExpr("${oneOf.kotlinFieldName}.value"))
                }
            }
            // Also persist unknown fields
            line("if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)")
        }.line("}")
    }

    protected fun writeMessageProtoUnmarshalExtension(type: File.Type.Message, fullTypeName: String) {
        val lineStr = "private fun $fullTypeName.Companion." +
            "protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): $fullTypeName {"
        line().line(lineStr).indented {
            // A bunch of locals for each field, initialized with defaults
            val doneKotlinFields = type.fields.map {
                when (it) {
                    is File.Field.Numbered.Standard -> {
                        line(it.unmarshalVarDecl)
                        it.unmarshalVarDone
                    }
                    is File.Field.Numbered.Wrapper -> {
                        line(it.unmarshalVarDecl)
                        it.unmarshalVarDone
                    }
                    is File.Field.OneOf -> {
                        line("var ${it.kotlinFieldName}: $fullTypeName.${it.kotlinTypeName}<*>? = null")
                        it.kotlinFieldName
                    }
                }
            }
            // Now loop reading the tag and check fields in order
            line("while (true) when (protoUnmarshal.readTag()) {").indented {
                // Tag 0 means done. Wrap the params to the class.
                lineBegin("0 -> return $fullTypeName(")
                val chunkedDoneFields = doneKotlinFields.chunked(4)
                chunkedDoneFields.forEachIndexed { index, doneFieldSet ->
                    val doneFieldStr = doneFieldSet.joinToString(", ", postfix = ",")
                    if (index == 0 && chunkedDoneFields.size == 1) lineMid(doneFieldStr)
                    else if (index == 0) lineEnd(doneFieldStr)
                    else if (index == chunkedDoneFields.size - 1) indented { lineBegin(doneFieldStr) }
                    else indented { line(doneFieldStr) }
                }
                if (chunkedDoneFields.isNotEmpty()) lineMid(" ")
                lineEnd("protoUnmarshal.unknownFields())")
                // Each field tag
                type.sortedStandardFieldsWithOneOfs().forEach { (field, oneOf) ->
                    val tags = mutableListOf(field.tag)
                    // As a special case for repeateds, we have to also catch the other (packed or non-packed) versions.
                    if (field is File.Field.Numbered.Standard && field.repeated) {
                        val tag = ((field.number shl 3) or if (field.packed) field.type.wireFormat else 2)
                        if (field.tag != tag) tags += tag
                    }
                    lineBegin(tags.joinToString(", ") + " -> ")
                    if (oneOf == null) {
                        when (field) {
                            is File.Field.Numbered.Standard -> lineEnd("${field.kotlinFieldName} = ${field.unmarshalReadExpr}")
                            is File.Field.Numbered.Wrapper -> lineEnd("${field.kotlinFieldName} = ${field.unmarshalReadExpr}")
                        }
                    } else {
                        val oneOfTyp = "$fullTypeName.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                        require(field is File.Field.Numbered.Standard && !field.repeated)
                        lineEnd("${oneOf.kotlinFieldName} = $oneOfTyp(${field.unmarshalReadExpr})")
                    }
                }
                // Unknown field
                line("else -> protoUnmarshal.unknownField()")
            }.line("}")
        }.line("}")
    }

    protected fun writeMessageToJsonMapperExtension(type: File.Type.Message, fullTypeName: String) {
        line().line("private fun $fullTypeName.toJsonMapperImpl(): $fullTypeName.JsonMapper =").indented {
            line("$fullTypeName.JsonMapper(").indented {
                val allFields = type.sortedStandardFieldsWithOneOfs()
                allFields.forEachIndexed { i, (field, _) ->
                    when (field) {
                        is File.Field.Numbered.Standard -> when (field.type) {
                            File.Field.Type.ENUM -> {
                                when {
                                    field.repeated -> lineBegin("${field.kotlinFieldName}.mapNotNull { it.name }")
                                    else -> lineBegin("${field.kotlinFieldName}?.name")
                                }
                            }
                            File.Field.Type.MESSAGE -> {
                                when {
                                    field.map -> {
                                        when {
                                            field.mapEntry()!!.mapEntryValueIsMessage -> lineBegin("${field.kotlinFieldName}.mapValues { it.value?.toJsonMapper() }")
                                            field.mapEntry()!!.mapEntryValueIsEnum -> lineBegin("${field.kotlinFieldName}.mapValues { it.value?.name }")
                                            else -> lineBegin(field.kotlinFieldName)
                                        }
                                    }
                                    field.repeated -> lineBegin("${field.kotlinFieldName}.map { it.toJsonMapper() }")
                                    else -> lineBegin("${field.kotlinFieldName}?.toJsonMapper()")
                                }
                            }
                            else -> {
                                when {
                                    field.map || field.repeated -> lineBegin(field.kotlinFieldName)
                                    file.version == 2 && field.optional -> lineBegin(field.kotlinFieldName)
                                    field.type != File.Field.Type.STRING -> lineBegin(field.kotlinFieldName)
                                    else -> lineBegin("${field.kotlinFieldName}.takeIf { it != ${field.defaultValue} }")
                                }
                            }
                        }
                        is File.Field.Numbered.Wrapper -> lineBegin(field.kotlinFieldName)
                    }
                    lineEnd(if (i == allFields.lastIndex) "" else ",")
                }
            }.line(")")
        }
    }

    protected fun writeJsonMapperToMessageExtension(type: File.Type.Message, fullTypeName: String) {
        fun oneOfFieldToMessage(i: Int, field: File.Field.OneOf) {
            line("${field.kotlinFieldName} = ").indented {
                field.fields.forEachIndexed { j, oneOfField ->
                    val prefix = if (j == 0) "" else " ?: "
                    val suffix = if (j == field.fields.lastIndex && i != type.fields.lastIndex) "," else ""
                    line(prefix +
                            "${oneOfField.kotlinFieldName}?.let { value -> " +
                            "$fullTypeName.${field.kotlinTypeName}.${field.kotlinFieldTypeNames[oneOfField.name]}(" +
                            when (oneOfField.type) {
                                File.Field.Type.ENUM -> {
                                    when {
                                        oneOfField.repeated -> "value.map { ${oneOfField.kotlinQualifiedTypeName}.fromName(it) }"
                                        else -> "value.let { ${oneOfField.kotlinQualifiedTypeName}.fromName(it) }"
                                    }
                                }
                                File.Field.Type.MESSAGE -> {
                                    when {
                                        oneOfField.map -> {
                                            when {
                                                oneOfField.mapEntry()!!.mapEntryValueIsMessage -> "value.mapValues { it.value?.toMessage() }"
                                                oneOfField.mapEntry()!!.mapEntryValueIsEnum -> "value.mapValues { ${oneOfField.mapEntry()!!.mapEntryValueKotlinType}.fromName(it.value!!) }"
                                                else -> "value.mapValues { it.value }"
                                            }
                                        }
                                        oneOfField.repeated -> "value.map { it.toMessage() }"
                                        else -> "value.toMessage()"
                                    }
                                }
                                else -> "value"
                            } +
                            ") " +
                            "}" +
                            suffix
                    )
                }
            }
        }

        fun standardFieldToMessage(i: Int, field: File.Field.Numbered.Standard) {
            lineBegin("${field.kotlinFieldName} = ")
            when (field.type) {
                File.Field.Type.ENUM -> {
                    when {
                        field.repeated -> lineMid("${field.kotlinFieldName}.map { ${field.kotlinQualifiedTypeName}.fromName(it) }")
                        else -> lineMid("${field.kotlinFieldName}?.let { ${field.kotlinQualifiedTypeName}.fromName(it) } ?: ${field.defaultValue}")
                    }
                }
                File.Field.Type.MESSAGE -> {
                    when {
                        field.map -> {
                            when {
                                field.mapEntry()!!.mapEntryValueIsMessage -> lineMid("${field.kotlinFieldName}.mapValues { it.value?.toMessage() }")
                                field.mapEntry()!!.mapEntryValueIsEnum -> lineMid("${field.kotlinFieldName}.mapValues { ${field.mapEntry()!!.mapEntryValueKotlinType}.fromName(it.value!!) }")
                                else -> lineMid("${field.kotlinFieldName}.mapValues { it.value ?: ${field.mapEntry()!!.mapEntryValueDefaultValue} }")
                            }
                        }
                        field.repeated -> lineMid("${field.kotlinFieldName}.map { it.toMessage() }")
                        else -> lineMid("${field.kotlinFieldName}?.toMessage()")
                    }
                }
                else -> lineMid("${field.kotlinFieldName} ?: ${field.defaultValue}")
            }
            lineEnd(if (i == type.fields.lastIndex) "" else ",")
        }

        fun wrapperFieldToMessage(i: Int, field: File.Field.Numbered.Wrapper) {
            lineBegin("${field.kotlinFieldName} = ${field.kotlinFieldName}")
            lineEnd(if (i == type.fields.lastIndex) "" else ",")
        }

        line().line("private fun $fullTypeName.JsonMapper.toMessageImpl(): $fullTypeName =").indented {
            line("$fullTypeName(").indented {
                type.fields.forEachIndexed { i, field ->
                    when (field) {
                        is File.Field.OneOf -> oneOfFieldToMessage(i, field)
                        is File.Field.Numbered.Standard -> standardFieldToMessage(i, field)
                        is File.Field.Numbered.Wrapper -> wrapperFieldToMessage(i, field)
                    }
                }
            }.line(")")
        }
    }

    protected fun writeMessageJsonMarshalExtension(type: File.Type.Message, fullTypeName: String) {
        line().line("private fun $fullTypeName.jsonMarshalImpl(json: Json): String =").indented {
            line("json.stringify($fullTypeName.JsonMapper.serializer(), toJsonMapper())")
        }
    }

    protected fun writeMessageJsonUnmarshalExtension(type: File.Type.Message, fullTypeName: String) {
        line().line("private fun $fullTypeName.Companion.jsonUnmarshalImpl(json: Json, data: String): $fullTypeName {").indented {
            line("val mapper = json.parse($fullTypeName.JsonMapper.serializer(), data)")
            line("return mapper.toMessage()")
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
    protected val File.Type.Message.mapEntryKeyKotlinType get() =
        if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard).kotlinValueType(false)
    protected val File.Type.Message.mapEntryValueKotlinType get() =
        if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard).kotlinValueType(true)
    protected val File.Type.Message.mapEntryValueKotlinJsonType get() =
        if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard).kotlinValueType(true, true)
    protected val File.Type.Message.mapEntryValueIsMessage get() =
        if (!mapEntry) false else (fields[1] as File.Field.Numbered.Standard).type == File.Field.Type.MESSAGE
    protected val File.Type.Message.mapEntryValueIsEnum get() =
        if (!mapEntry) false else (fields[1] as File.Field.Numbered.Standard).type == File.Field.Type.ENUM
    protected val File.Type.Message.mapEntryValueDefaultValue get() =
        if (!mapEntry) false else (fields[1] as File.Field.Numbered.Standard).defaultValue

    protected fun File.Field.Numbered.kotlinValueType(nullableIfMessage: Boolean, forJson: Boolean = false) = when (this) {
        is File.Field.Numbered.Standard -> kotlinValueType(nullableIfMessage, forJson)
        is File.Field.Numbered.Wrapper -> kotlinValueType(nullableIfMessage, forJson)
    }
    protected val File.Field.Numbered.defaultValue get() = when (this) {
        is File.Field.Numbered.Standard -> defaultValue
        is File.Field.Numbered.Wrapper -> defaultValue
    }
    protected val File.Field.Numbered.tag get() = when (this) {
        is File.Field.Numbered.Standard -> tag
        is File.Field.Numbered.Wrapper -> tag
    }
    protected fun File.Field.Numbered.writeExpr(ref: String = kotlinFieldName) = when (this) {
        is File.Field.Numbered.Standard -> writeExpr(ref)
        is File.Field.Numbered.Wrapper -> writeExpr(ref)
    }
    protected val File.Field.Numbered.nonDefaultCheckExpr get() = when (this) {
        is File.Field.Numbered.Standard -> nonDefaultCheckExpr
        is File.Field.Numbered.Wrapper -> nonDefaultCheckExpr
    }

    protected fun File.Field.Numbered.Standard.mapEntry() =
        if (!map) null else (localType as? File.Type.Message)?.takeIf { it.mapEntry }
    protected val File.Field.Numbered.Standard.localType get() = localTypeName?.let { findLocalType(it) }
    protected val File.Field.Numbered.Standard.kotlinQualifiedTypeConstructorRef get() = kotlinQualifiedTypeName.let { type ->
        type.lastIndexOf('.').let { if (it == -1) "::$type" else type.substring(0, it) + "::" + type.substring(it + 1) }
    }
    protected val File.Field.Numbered.Standard.kotlinQualifiedTypeName get() =
        kotlinLocalTypeName ?:
            localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find mapping for $it") } } ?:
            type.standardTypeName
    protected val File.Field.Numbered.Standard.kotlinQualifiedJsonTypeName get() =
        kotlinLocalTypeName ?:
            localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find json mapping for $it") } }?.let {
                if (type == File.Field.Type.ENUM) it else "$it.JsonMapper"
            } ?:
            type.standardTypeName
    protected val File.Field.Numbered.Standard.unmarshalReadExpr get() = type.neverPacked.let { neverPacked ->
        val repEnd = if (neverPacked) ", true" else ", false"
        when (type) {
            File.Field.Type.ENUM ->
                if (repeated) "protoUnmarshal.readRepeatedEnum($kotlinFieldName, $kotlinQualifiedTypeName.Companion)"
                else "protoUnmarshal.readEnum($kotlinQualifiedTypeName.Companion)"
            File.Field.Type.MESSAGE ->
                if (!repeated) "protoUnmarshal.readMessage($kotlinQualifiedTypeName.Companion)"
                else if (map) "protoUnmarshal.readMap($kotlinFieldName, $kotlinQualifiedTypeName.Companion$repEnd)"
                else "protoUnmarshal.readRepeatedMessage($kotlinFieldName, $kotlinQualifiedTypeName.Companion$repEnd)"
            else -> {
                if (repeated) "protoUnmarshal.readRepeated($kotlinFieldName, protoUnmarshal::${type.readMethod}$repEnd)"
                else "protoUnmarshal.${type.readMethod}()"
            }
        }
    }
    protected val File.Field.Numbered.Standard.unmarshalVarDecl get() = when {
        repeated -> mapEntry().let { mapEntry ->
            if (mapEntry == null) "var $kotlinFieldName: pbandk.ListWithSize.Builder<$kotlinQualifiedTypeName>? = null"
            else "var $kotlinFieldName: pbandk.MessageMap.Builder<" +
                    "${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>? = null"
        }
        requiresExplicitTypeWithVal -> "var $kotlinFieldName: ${kotlinValueType(true)} = $defaultValue"
        else -> "var $kotlinFieldName = $defaultValue"
    }
    protected val File.Field.Numbered.Standard.unmarshalVarDone get() =
        if (map) "pbandk.MessageMap.Builder.fixed($kotlinFieldName)"
        else if (repeated) "pbandk.ListWithSize.Builder.fixed($kotlinFieldName)"
        else kotlinFieldName
    protected fun File.Field.Numbered.Standard.kotlinValueType(nullableIfMessage: Boolean, forJson: Boolean = false): String {
        val typeName = when {
            forJson && type == File.Field.Type.ENUM -> "String"
            forJson -> kotlinQualifiedJsonTypeName
            else -> kotlinQualifiedTypeName
        }
        return when {
            map -> mapEntry()!!.let { "Map<${it.mapEntryKeyKotlinType}, ${if (forJson) it.mapEntryValueKotlinJsonType else it.mapEntryValueKotlinType}>" }
            repeated -> "List<$typeName>"
            (file.version == 2 && optional) || (type == File.Field.Type.MESSAGE && nullableIfMessage) ->
                "$typeName?"
            else -> typeName + if (forJson) "?" else ""
        }
    }
    protected val File.Field.Numbered.Standard.defaultValue get() = when {
        map -> "emptyMap()"
        repeated -> "emptyList()"
        file.version == 2 && optional -> "null"
        type == File.Field.Type.ENUM -> "$kotlinQualifiedTypeName.fromValue(0)"
        else -> type.defaultValue
    }
    protected val File.Field.Numbered.Standard.tag get() = (number shl 3) or when {
        repeated && packed -> 2
        else -> type.wireFormat
    }
    protected fun File.Field.Numbered.Standard.sizeExpr(ref: String = kotlinFieldName) = when {
        map ->
            "pbandk.Sizer.mapSize($number, $ref, $kotlinQualifiedTypeConstructorRef)"
        repeated && packed ->
            "pbandk.Sizer.tagSize($number) + pbandk.Sizer.packedRepeatedSize($ref, pbandk.Sizer::${type.sizeMethod})"
        repeated ->
            "(pbandk.Sizer.tagSize($number) * $ref.size) + $ref.sumBy(pbandk.Sizer::${type.sizeMethod})"
        else ->
            "pbandk.Sizer.tagSize($number) + pbandk.Sizer.${type.sizeMethod}($ref)"
    }
    protected fun File.Field.Numbered.Standard.writeExpr(ref: String = kotlinFieldName) = when {
        map ->
            "protoMarshal.writeMap($tag, $ref, $kotlinQualifiedTypeConstructorRef)"
        repeated && packed ->
            "protoMarshal.writeTag($tag).writePackedRepeated(" +
                "$ref, pbandk.Sizer::${type.sizeMethod}, protoMarshal::${type.writeMethod})"
        repeated -> "$ref.forEach { protoMarshal.writeTag($tag).${type.writeMethod}(it) }"
        else -> "protoMarshal.writeTag($tag).${type.writeMethod}($ref)"
    }
    protected val File.Field.Numbered.Standard.nonDefaultCheckExpr get() = when {
        repeated -> "$kotlinFieldName.isNotEmpty()"
        file.version == 2 && optional -> "$kotlinFieldName != null"
        else -> type.nonDefaultCheck(kotlinFieldName)
    }
    protected val File.Field.Numbered.Standard.requiresExplicitTypeWithVal get() =
        repeated || (file.version == 2 && optional) || type.requiresExplicitTypeWithVal

    protected val File.Field.Numbered.Wrapper.unmarshalReadExpr get() = when {
        repeated -> "protoUnmarshal.readRepeated($kotlinFieldName, { protoUnmarshal.readMessage(${wrappedType.wrapperKotlinTypeName}.Companion).value }, true)"
        else -> "protoUnmarshal.readMessage(${wrappedType.wrapperKotlinTypeName}.Companion)"
    }
    protected val File.Field.Numbered.Wrapper.unmarshalVarDecl get() = when {
        repeated -> "var $kotlinFieldName: pbandk.ListWithSize.Builder<${wrappedType.standardTypeName}>? = null"
        else -> "var $kotlinFieldName: ${wrappedType.wrapperKotlinTypeName}? = $defaultValue"
    }
    protected val File.Field.Numbered.Wrapper.unmarshalVarDone get() = when {
        repeated -> "pbandk.ListWithSize.Builder.fixed($kotlinFieldName)"
        else -> "$kotlinFieldName?.value"
    }
    protected fun File.Field.Numbered.Wrapper.kotlinValueType(nullableIfMessage: Boolean, forJson: Boolean = false) = when {
        repeated -> "List<${wrappedType.standardTypeName}>"
        else -> wrappedType.standardTypeName + if (nullableIfMessage || forJson) "?" else ""
    }
    protected val File.Field.Numbered.Wrapper.defaultValue get() = when {
        repeated -> "emptyList()"
        else -> "null"
    }
    protected val File.Field.Numbered.Wrapper.tag get() = (number shl 3) or type.wireFormat
    protected fun File.Field.Numbered.Wrapper.sizeExpr(ref: String = kotlinFieldName) = when {
        repeated -> "(pbandk.Sizer.tagSize($number) * $ref.size) + $ref.sumBy { pbandk.Sizer.${type.sizeMethod}(${wrappedType.wrapperKotlinTypeName}(it)) }"
        else -> "pbandk.Sizer.tagSize($number) + pbandk.Sizer.${type.sizeMethod}(${wrappedType.wrapperKotlinTypeName}($ref))"
    }
    protected fun File.Field.Numbered.Wrapper.writeExpr(ref: String = kotlinFieldName) = when {
        repeated -> "$ref.forEach { protoMarshal.writeTag($tag).${type.writeMethod}(${wrappedType.wrapperKotlinTypeName}(it)) }"
        else -> "protoMarshal.writeTag($tag).${type.writeMethod}(${wrappedType.wrapperKotlinTypeName}($ref))"
    }
    protected val File.Field.Numbered.Wrapper.nonDefaultCheckExpr get() = when {
        repeated -> "$kotlinFieldName.isNotEmpty()"
        else -> "$kotlinFieldName != $defaultValue"
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
    protected val File.Field.Type.sizeMethod get() = string + "Size"
    protected val File.Field.Type.readMethod get() = "read" + string.capitalize()
    protected val File.Field.Type.writeMethod get() = "write" + string.capitalize()
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
    protected val File.Field.Type.wireFormat get() = when (this) {
        File.Field.Type.BOOL, File.Field.Type.ENUM, File.Field.Type.INT32, File.Field.Type.INT64,
            File.Field.Type.SINT32, File.Field.Type.SINT64, File.Field.Type.UINT32, File.Field.Type.UINT64 -> 0
        File.Field.Type.BYTES, File.Field.Type.MESSAGE, File.Field.Type.STRING -> 2
        File.Field.Type.DOUBLE, File.Field.Type.FIXED64, File.Field.Type.SFIXED64 -> 1
        File.Field.Type.FIXED32, File.Field.Type.FLOAT, File.Field.Type.SFIXED32 -> 5
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
    protected fun File.Field.Type.nonDefaultCheck(varName: String) = when (this) {
        File.Field.Type.BOOL -> varName
        File.Field.Type.BYTES -> "$varName.array.isNotEmpty()"
        File.Field.Type.ENUM -> "$varName.value != 0"
        File.Field.Type.STRING -> "$varName.isNotEmpty()"
        else -> "$varName != $defaultValue"
    }
    protected val File.Field.Type.wrapperKotlinTypeName get() =
        kotlinTypeMappings[wrapperTypeName] ?: error("No Kotlin type found for wrapper")
}

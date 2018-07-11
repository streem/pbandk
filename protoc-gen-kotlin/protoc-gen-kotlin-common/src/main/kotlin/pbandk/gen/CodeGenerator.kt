package pbandk.gen

open class CodeGenerator(val file: File, val kotlinTypeMappings: Map<String, String>) {
    protected val bld = StringBuilder()
    protected var indent = ""

    fun generate(): String {
        file.kotlinPackageName?.let { line("package $it") }
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
        // Enums are data classes w/ a single value and a companion object with known values
        line().line("data class ${type.kotlinTypeName}(override val value: Int) : pbandk.Message.Enum {").indented {
            line("companion object : pbandk.Message.Enum.Companion<${type.kotlinTypeName}> {").indented {
                type.values.forEach { line("val ${it.kotlinValueName} = ${type.kotlinTypeName}(${it.number})") }
                line()
                line("override fun fromValue(value: Int) = when (value) {").indented {
                    type.values.forEach { line("${it.number} -> ${it.kotlinValueName}") }
                    line("else -> ${type.kotlinTypeName}(value)")
                }.line("}")
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
                    is File.Field.Standard -> lineBegin(fieldBegin).writeConstructorField(field, true).lineEnd(",")
                    is File.Field.OneOf -> line("val ${field.kotlinFieldName}: ${field.kotlinTypeName}? = null,")
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
            line("companion object : pbandk.Message.Companion<${type.kotlinTypeName}> {").indented {
                line("override fun protoUnmarshal(u: pbandk.Unmarshaller) = " +
                    "${type.kotlinTypeName}.protoUnmarshalImpl(u)")
            }.line("}")
            // Nested enums and types
            type.nestedTypes.forEach(::writeType)
        }.line("}")
    }

    protected fun writeConstructorField(field: File.Field.Standard, nullableIfMessage: Boolean): CodeGenerator {
        lineMid("val ${field.kotlinFieldName}: ${field.kotlinValueType(nullableIfMessage)}")
        if (field.type != File.Field.Type.MESSAGE || nullableIfMessage) lineMid(" = ${field.defaultValue}")
        return this
    }

    protected fun writeOneOfType(oneOf: File.Field.OneOf) {
        line("sealed class ${oneOf.kotlinTypeName} {").indented {
            oneOf.fields.forEach { field ->
                lineBegin("data class ${oneOf.kotlinFieldTypeNames[field.name]}(")
                writeConstructorField(field, false)
                lineEnd(") : ${oneOf.kotlinTypeName}()")
            }
        }.line("}").line()
    }

    fun writeMessageExtensions(type: File.Type.Message, parentType: String? = null) {
        val fullTypeName = if (parentType == null) type.kotlinTypeName else "$parentType.${type.kotlinTypeName}"
        writeMessageMergeExtension(type, fullTypeName)
        writeMessageSizeExtension(type, fullTypeName)
        writeMessageMarshalExtension(type, fullTypeName)
        writeMessageUnmarshalExtension(type, fullTypeName)
        type.nestedTypes.mapNotNull { it as? File.Type.Message }.forEach { writeMessageExtensions(it, fullTypeName) }
    }

    protected fun writeMessageMergeExtension(type: File.Type.Message, fullTypeName: String) {
        fun mergeStandard(field: File.Field.Standard) {
            if (field.repeated) {
                line("${field.kotlinFieldName} = ${field.kotlinFieldName} + plus.${field.kotlinFieldName},")
            } else if (field.type == File.Field.Type.MESSAGE) {
                line("${field.kotlinFieldName} = " +
                    "${field.kotlinFieldName}?.plus(plus.${field.kotlinFieldName}) ?: plus.${field.kotlinFieldName},")
            } else if (file.version == 2 && field.optional) {
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
                            line("$subTypeName(${oneOf.kotlinFieldName}.${subField.kotlinFieldName} + " +
                                "plus.${oneOf.kotlinFieldName}.${subField.kotlinFieldName})")
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
                    is File.Field.Standard -> mergeStandard(field)
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
                    is File.Field.Standard ->
                        line("if (${field.nonDefaultCheckExpr}) protoSize += ${field.sizeExpr()}")
                    is File.Field.OneOf -> {
                        line("when (${field.kotlinFieldName}) {").indented {
                            field.fields.forEach { subField ->
                                val subFieldTypeName = field.kotlinFieldTypeNames[subField.name]
                                line("is $fullTypeName.${field.kotlinTypeName}.$subFieldTypeName -> protoSize += " +
                                    subField.sizeExpr("${field.kotlinFieldName}.${subField.fieldRef}"))
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

    protected fun writeMessageMarshalExtension(type: File.Type.Message, fullTypeName: String) {
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
                        field.writeExpr("${oneOf.kotlinFieldName}.${field.fieldRef}"))
                }
            }
            // Also persist unknown fields
            line("if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)")
        }.line("}")
    }

    protected fun writeMessageUnmarshalExtension(type: File.Type.Message, fullTypeName: String) {
        val lineStr = "private fun $fullTypeName.Companion." +
            "protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): $fullTypeName {"
        line().line(lineStr).indented {
            // A bunch of locals for each field, initialized with defaults
            val doneKotlinFields = type.fields.map {
                when (it) {
                    is File.Field.Standard -> {
                        line(it.unmarshalVarDecl)
                        it.unmarshalVarDone
                    }
                    is File.Field.OneOf -> {
                        line("var ${it.kotlinFieldName}: $fullTypeName.${it.kotlinTypeName}? = null")
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
                    var tags = listOf(field.tag)
                    // As a special case for repeateds, we have to also catch the other (packed or non-packed) versions.
                    if (field.repeated) ((field.number shl 3) or if (field.packed) field.type.wireFormat else 2).also {
                        if (field.tag != it) tags += it
                    }
                    lineBegin(tags.joinToString(", ") + " -> ")
                    if (oneOf == null) {
                        lineEnd("${field.kotlinFieldName} = ${field.unmarshalReadExpr}")
                    } else {
                        val oneOfTyp = "$fullTypeName.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                        require(!field.repeated)
                        lineEnd("${oneOf.kotlinFieldName} = $oneOfTyp(${field.unmarshalReadExpr})")
                    }
                }
                // Unknown field
                line("else -> protoUnmarshal.unknownField()")
            }.line("}")
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
                is File.Field.Standard -> listOf(it to null)
                is File.Field.OneOf -> it.fields.map { f -> f to it }
            }
        }.sortedBy { it.first.number }
    protected val File.Type.Message.mapEntryKeyKotlinType get() =
        if (!mapEntry) null else (fields[0] as File.Field.Standard).kotlinValueType(false)
    protected val File.Type.Message.mapEntryValueKotlinType get() =
        if (!mapEntry) null else (fields[1] as File.Field.Standard).kotlinValueType(true)

    protected val File.Field.Standard.fieldRef get() = kotlinFieldName
    protected fun File.Field.Standard.mapEntry() =
        if (!map) null else (localType as? File.Type.Message)?.takeIf { it.mapEntry }
    protected val File.Field.Standard.localType get() = localTypeName?.let { findLocalType(it) }
    protected val File.Field.Standard.kotlinQualifiedTypeConstructorRef get() = kotlinQualifiedTypeName.let { type ->
        type.lastIndexOf('.').let { if (it == -1) "::$type" else type.substring(0, it) + "::" + type.substring(it + 1) }
    }
    protected val File.Field.Standard.kotlinQualifiedTypeName get() =
        kotlinLocalTypeName ?:
            localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find mapping for $it") } } ?:
            type.standardTypeName
    protected val File.Field.Standard.unmarshalReadExpr get() = type.neverPacked.let { neverPacked ->
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
    protected val File.Field.Standard.unmarshalVarDecl get() = when {
        repeated -> mapEntry().let { mapEntry ->
            if (mapEntry == null) "var $kotlinFieldName: pbandk.ListWithSize.Builder<$kotlinQualifiedTypeName>? = null"
            else "var $kotlinFieldName: pbandk.MapWithSize.Builder<" +
                "${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>? = null"
        }
        requiresExplicitTypeWithVal -> "var $kotlinFieldName: ${kotlinValueType(true)} = $defaultValue"
        else -> "var $kotlinFieldName = $defaultValue"
    }
    protected val File.Field.Standard.unmarshalVarDone get() =
        if (map) "pbandk.MapWithSize.Builder.fixed($kotlinFieldName)"
        else if (repeated) "pbandk.ListWithSize.Builder.fixed($kotlinFieldName)"
        else kotlinFieldName
    protected fun File.Field.Standard.kotlinValueType(nullableIfMessage: Boolean): String = when {
        map -> mapEntry()!!.let { "Map<${it.mapEntryKeyKotlinType}, ${it.mapEntryValueKotlinType}>" }
        repeated -> "List<$kotlinQualifiedTypeName>"
        (file.version == 2 && optional) || (type == File.Field.Type.MESSAGE && nullableIfMessage) ->
            "$kotlinQualifiedTypeName?"
        else -> kotlinQualifiedTypeName
    }
    protected val File.Field.Standard.defaultValue get() = when {
        map -> "emptyMap()"
        repeated -> "emptyList()"
        file.version == 2 && optional -> "null"
        type == File.Field.Type.ENUM -> "$kotlinQualifiedTypeName.fromValue(0)"
        else -> type.defaultValue
    }
    protected val File.Field.Standard.tag get() = (number shl 3) or when {
        repeated && packed -> 2
        else -> type.wireFormat
    }
    protected fun File.Field.Standard.sizeExpr(ref: String = fieldRef) = when {
        map ->
            "pbandk.Sizer.tagSize($number) + pbandk.Sizer.mapSize($ref, $kotlinQualifiedTypeConstructorRef)"
        repeated && packed ->
            "pbandk.Sizer.tagSize($number) + pbandk.Sizer.packedRepeatedSize($ref, pbandk.Sizer::${type.sizeMethod})"
        repeated ->
            "(pbandk.Sizer.tagSize($number) * $ref.size) + $ref.sumBy(pbandk.Sizer::${type.sizeMethod})"
        else ->
            "pbandk.Sizer.tagSize($number) + pbandk.Sizer.${type.sizeMethod}($ref)"
    }
    protected fun File.Field.Standard.writeExpr(ref: String = fieldRef) = when {
        map ->
            "protoMarshal.writeTag($tag).writeMap($ref, $kotlinQualifiedTypeConstructorRef)"
        repeated && packed ->
            "protoMarshal.writeTag($tag).writePackedRepeated(" +
                "$ref, pbandk.Sizer::${type.sizeMethod}, protoMarshal::${type.writeMethod})"
        repeated -> "$ref.forEach { protoMarshal.writeTag($tag).${type.writeMethod}(it) }"
        else -> "protoMarshal.writeTag($tag).${type.writeMethod}($ref)"
    }
    protected val File.Field.Standard.nonDefaultCheckExpr get() = when {
        repeated -> "$fieldRef.isNotEmpty()"
        file.version == 2 && optional -> "$fieldRef != null"
        else -> type.nonDefaultCheck(fieldRef)
    }
    protected val File.Field.Standard.requiresExplicitTypeWithVal get() =
        repeated || (file.version == 2 && optional) || type.requiresExplicitTypeWithVal

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
        File.Field.Type.MESSAGE -> error("No standard type name for enums")
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
}
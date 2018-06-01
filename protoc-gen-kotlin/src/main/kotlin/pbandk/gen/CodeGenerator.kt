package pbandk.gen

open class CodeGenerator {
    protected val bld = StringBuilder()
    protected var indent = ""

    fun generate(file: File): String {
        if (file.version != 3) TODO("Only proto3 currently supported")
        file.packageName?.let { line("package $it") }
        line()
        file.types.forEach(::writeType)
        file.types.mapNotNull { it as? File.Type.Message }.forEach { writeMessageExtensions(it) }
        return bld.toString()
    }

    protected fun line() = also { bld.appendln() }
    protected fun line(str: String) = also { bld.append(indent).appendln(str) }
    protected fun lineBegin(str: String = "") = also { bld.append(indent).append(str) }
    protected fun lineMid(str: String) = also { bld.append(str) }
    protected fun lineEnd(str: String = "") = also { bld.appendln(str) }
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
        line("data class ${type.kotlinTypeName}(val value: Int) {").indented {
            line("companion object {").indented {
                type.values.forEach { line("val ${it.kotlinValueName} = ${type.kotlinTypeName}(${it.number})") }
                line()
                line("fun fromValue(value: Int) = when (value) {").indented {
                    type.values.forEach { line("${it.number} -> ${it.kotlinValueName}") }
                    line("else -> ${type.kotlinTypeName}(value)")
                }.line("}")
            }.line("}")
        }.line("}").line()
    }

    protected fun writeMessageType(type: File.Type.Message) {
        // No fields means it's an object
        if (type.fields.isEmpty()) TODO("Handle empty field set as an object")
        line("data class ${type.kotlinTypeName}(").indented {
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Standard -> lineBegin().writeConstructorField(field).lineEnd(",")
                    is File.Field.OneOf -> line("val ${field.kotlinFieldName}: ${field.kotlinTypeName}? = null,")
                }
            }
            // The unknown fields
            line("val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")
        }.line(") : pbandk.Message {").indented {
            // One-ofs as sealed class hierarchies
            type.fields.mapNotNull { it as? File.Field.OneOf }.forEach(::writeOneOfType)
            // IO helpers
            line("override val protoSize by lazy { protoSizeImpl() }")
            line("override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)")
            line("companion object : pbandk.Message.Companion<${type.kotlinTypeName}> {").indented {
                line("override fun protoUnmarshal(u: Unmarshaller) = ${type.kotlinTypeName}.protoUnmarshalImpl(u)")
            }.line("}")
            // Nested enums and types
            type.nestedTypes.forEach(::writeType)
        }.line("}").line()
    }

    protected fun writeConstructorField(field: File.Field.Standard): CodeGenerator {
        val defaultValue =
            if (field.type == File.Field.Type.ENUM) "${field.kotlinLocalTypeName}.valueOf(0)"
            else field.type.defaultValue
        return lineMid("val ${field.kotlinFieldName}: ${field.kotlinValueTypeName} = $defaultValue")
    }

    protected fun writeOneOfType(oneOf: File.Field.OneOf) {
        TODO()
    }

    fun writeMessageExtensions(type: File.Type.Message, parentType: String? = null) {
        val fullTypeName = if (parentType == null) type.kotlinTypeName else "$parentType.${type.kotlinTypeName}"
        writeMessageSizeExtension(type, fullTypeName)
        writeMessageMarshalExtension(type, fullTypeName)
        writeMessageUnmarshalExtension(type, fullTypeName)
    }

    protected fun writeMessageSizeExtension(type: File.Type.Message, fullTypeName: String) {
        line("internal fun $fullTypeName.protoSizeImpl(): Int {").indented {
            line("var protoSize = 0")
            // Go over each field doing size check
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Standard -> field.fieldRef().also { fieldRef ->
                        line("if (${field.type.nonDefaultCheck(fieldRef)})").indented {
                            line("protoSize += Sizer.tagSize(${field.number}) + " +
                                "Sizer.${field.type.sizeMethod}($fieldRef)")
                        }
                    }
                    is File.Field.OneOf -> {
                        line("when (${field.kotlinFieldName}) {").indented {
                            field.fields.forEach { subField ->
                                val subFieldRef = subField.fieldRef()
                                val subFieldTypeName = field.kotlinFieldTypeNames[subField.name]
                                line("is $fullTypeName.${field.kotlinTypeName}.$subFieldTypeName ->").indented {
                                    line("protoSize += Sizer.tagSize(${subField.number}) + " +
                                        "Sizer.${subField.type.sizeMethod}(${field.kotlinFieldName}.$subFieldRef)")
                                }
                            }
                        }.line("}")
                    }
                }
            }
            // Add the unknown fields and return
            line("protoSize += unknownFields.entries.sumBy { it.value.size() }")
            line("return protoSize")
        }.line("}").line()
    }

    protected fun writeMessageMarshalExtension(type: File.Type.Message, fullTypeName: String) {
        line("internal fun $fullTypeName.protoMarshalImpl(protoMarshal: Marshaller) {").indented {
            // Go over each and write each if it's not default
            type.sortedStandardFieldsWithOneOfs().forEach { (field, oneOf) ->
                val fieldRef = field.fieldRef()
                if (oneOf == null) {
                    line("if (${field.type.nonDefaultCheck(fieldRef)})").indented {
                        line("protoMarshal.writeTag(${field.tag}).${field.type.writeMethod}($fieldRef)")
                    }
                } else {
                    // We acknowledge several unnecessary instanceof's here, however it's worth it to keep the fields
                    // in order and keep the code simple.
                    val subClassName = "$fullTypeName.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                    line("if (${oneOf.kotlinFieldName} is $subClassName)").indented {
                        line("protoMarshal.writeTag(${field.tag})." +
                            "${field.type.writeMethod}(${oneOf.kotlinFieldName}.$fieldRef)")
                    }
                }
            }
            // Also persist unknown fields
            line("if (unknownFields.isNotEmpty())").indented {
                line("protoMarshal.writeUnknownFields(unknownFields)")
            }
        }.line("}").line()
    }

    protected fun writeMessageUnmarshalExtension(type: File.Type.Message, fullTypeName: String) {
        val lineStr = "internal fun $fullTypeName.Companion." +
            "protoUnmarshalImpl(protoUnmarshal: Unmarshaller): $fullTypeName {"
        line(lineStr).indented {
            // A bunch of locals for each field, initialized with defaults
            val kotlinFields = type.fields.map {
                lineBegin("var ${it.kotlinFieldName}: ")
                when (it) {
                    is File.Field.Standard -> lineEnd("${it.kotlinValueTypeName} = ${it.type.defaultValue}")
                    is File.Field.OneOf -> lineEnd("$fullTypeName.${it.kotlinTypeName}? = null")
                }
                it.kotlinFieldName
            }
            // Now loop reading the tag and check fields in order
            line("while (true) when (protoUnmarshal.readTag()) {").indented {
                // Tag of 0 means we're done
                line("0 -> return $fullTypeName(${kotlinFields.joinToString(", ")}, protoUnmarshal.unknownFields())")
                // Each field tag
                type.sortedStandardFieldsWithOneOfs().forEach { (field, oneOf) ->
                    lineBegin("${field.tag} -> ")
                    if (oneOf == null) {
                        lineEnd("${field.kotlinFieldName} = ${field.unmarshalReadExpr}")
                    } else {
                        val oneOfTyp = "$fullTypeName.${oneOf.kotlinTypeName}.${oneOf.kotlinFieldTypeNames[field.name]}"
                        lineEnd("${oneOf.kotlinFieldName} = $oneOfTyp(${field.unmarshalReadExpr})")
                    }
                }
                // Unknown field
                line("else -> protoUnmarshal.unknownField()")
            }.line("}")
        }.line("}").line()
    }

    protected fun File.Type.Message.sortedStandardFieldsWithOneOfs() =
        fields.flatMap {
            when (it) {
                is File.Field.Standard -> listOf(it to null)
                is File.Field.OneOf -> it.fields.map { f -> f to it }
            }
        }.sortedBy { it.first.number }
    protected fun File.Field.Standard.fieldRef() =
        if (type == File.Field.Type.ENUM) "$kotlinFieldName.value" else kotlinFieldName
    protected val File.Field.Standard.unmarshalReadExpr get()= when (type) {
        File.Field.Type.ENUM -> "$kotlinLocalTypeName.valueOf(protoUnmarshal.readEnum())"
        File.Field.Type.MESSAGE -> "protoUnmarshal.readMessage($kotlinLocalTypeName.Companion)"
        else -> "protoUnmarshal.${type.readMethod}()"
    }
    protected val File.Field.Standard.kotlinValueTypeName get() =
        kotlinLocalTypeName?.plus("?") ?: type.standardTypeName
    protected val File.Field.Standard.tag get() = (number shl 3) or type.wireFormat
    protected val File.Field.Type.string get() = when (this) {
        File.Field.Type.BOOL -> "bool"
        File.Field.Type.BYTES -> "bytes"
        File.Field.Type.DOUBLE -> "double"
        File.Field.Type.ENUM -> "enum"
        File.Field.Type.FIXED32 -> "fixed32"
        File.Field.Type.FIXED64 -> "fixed64"
        File.Field.Type.FLOAT -> "float"
        File.Field.Type.GROUP -> TODO()
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
        File.Field.Type.GROUP -> TODO()
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
        File.Field.Type.GROUP -> 3
    }
    protected val File.Field.Type.defaultValue get() = when (this) {
        File.Field.Type.BOOL -> "false"
        File.Field.Type.BYTES -> "pbandk.ByteArr.empty"
        File.Field.Type.ENUM -> error("No generic default value for enums")
        File.Field.Type.GROUP -> TODO()
        File.Field.Type.MESSAGE -> "null"
        File.Field.Type.STRING -> "\"\""
        else -> "0"
    }
    protected fun File.Field.Type.nonDefaultCheck(varName: String) = when (this) {
        File.Field.Type.BOOL -> "!$varName"
        File.Field.Type.BYTES -> "$varName.array.isNotEmpty()"
        File.Field.Type.GROUP -> TODO()
        File.Field.Type.MESSAGE -> "$varName != null"
        File.Field.Type.STRING -> "$varName.isNotEmpty()"
        else -> "$varName != 0"
    }
}
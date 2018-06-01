package pbandk.gen

open class CodeGenerator {
    protected val bld = StringBuilder()
    protected var indent = ""

    fun generate(file: File): String {
        if (file.version != 3) TODO("Only proto3 currently supported")
        line("package ${file.packageName}")
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
        val typeName = type.name.safeTypeName
        // Enums are data classes w/ a single value and a companion object with known values
        line("data class $typeName(val value: Int) {").indented {
            line("companion object {").indented {
                type.values.forEach { (number, name) ->
                    line("val ${name.safeEnumValueName} = $typeName($number)")
                }
                line()
                line("fun fromValue(value: Int) = when (value) {").indented {
                    type.values.forEach { (number, name) ->
                        line("$number -> ${name.safeEnumValueName}")
                    }
                    line("else -> $typeName(value)")
                }.line("}")
            }.line("}")
        }.line("}")
    }

    protected fun writeMessageType(type: File.Type.Message) {
        val typeName = type.name.safeTypeName
        // No fields means it's an object
        if (type.fields.isEmpty()) TODO("Handle empty field set as an object")
        line("data class $typeName(").indented {
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Standard ->
                        lineBegin().writeConstructorField(field).lineEnd(",")
                    is File.Field.OneOf ->
                        line("val ${field.name.safeFieldName}: ${field.name.safeTypeName}? = null,")
                }
            }
            // The unknown fields
            line("val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")
        }.line(") : pbandk.Message {").indented {
            // One-ofs as sealed class hierarchies
            type.fields.mapNotNull { it as? File.Field.OneOf }.forEach(::writeOneOfType)
            // IO helpers
            line("override val size by lazy { sizeImpl() }")
            line("override fun marshal(m: pbandk.Marshaller) = marshalImpl(m)")
            line("companion object : pbandk.Message.Companion<$typeName> {").indented {
                line("override fun unmarshal(u: Unmarshaller) = $typeName.unmarshalImpl(u)")
            }.line("}")
            // Nested enums and types
            type.nestedTypes.forEach(::writeType)
        }.line("}")
    }

    protected fun writeConstructorField(field: File.Field.Standard): CodeGenerator {
        TODO()
    }

    protected fun writeOneOfType(oneOf: File.Field.OneOf) {
        TODO()
    }

    fun writeMessageExtensions(type: File.Type.Message, parentType: String? = null) {
        var fullTypeName = type.name.safeTypeName
        if (parentType != null) fullTypeName = "$parentType.$fullTypeName"
        writeMessageSizeExtension(type, fullTypeName)
        writeMessageMarshalExtension(type, fullTypeName)
        writeMessageUnmarshalExtension(type, fullTypeName)
    }

    protected fun writeMessageSizeExtension(type: File.Type.Message, fullTypeName: String) {
        line("internal fun $fullTypeName.sizeImpl(): Int {").indented {
            line("var size = 0")
            // Go over each field doing size check
            type.fields.forEach { field ->
                when (field) {
                    is File.Field.Standard -> field.fieldRef().also { fieldRef ->
                        line("if (${field.type.nonDefaultCheck(fieldRef)})").indented {
                            line("size += Sizer.tagSize(${field.number}) + Sizer.${field.type.sizeMethod}($fieldRef)")
                        }
                    }
                    is File.Field.OneOf -> {
                        val oneOfTypeName = field.name.safeTypeName
                        val oneOfFieldName = field.name.safeFieldName
                        line("when ($oneOfFieldName) {").indented {
                            field.fields.forEach { subField ->
                                val subFieldRef = subField.fieldRef()
                                line("is $fullTypeName.$oneOfTypeName.${subField.name.safeTypeName} ->").indented {
                                    line("size += Sizer.tagSize(${subField.number}) + " +
                                        "Sizer.${subField.type.sizeMethod}($oneOfFieldName.$subFieldRef)")
                                }
                            }
                        }.line("}")
                    }
                }
            }
            // Add the unknown fields and return
            line("size += unknownFields.entries.sumBy { it.value.size() }")
            line("return size")
        }.line("}")
    }

    protected fun writeMessageMarshalExtension(type: File.Type.Message, fullTypeName: String) {
        TODO()
    }

    protected fun writeMessageUnmarshalExtension(type: File.Type.Message, fullTypeName: String) {
        TODO()
    }

    protected val String.safeTypeName get() = this
    protected val String.safeFieldName get() = this
    protected val String.safeEnumValueName get() = this
    protected fun File.Field.Standard.fieldRef() =
        if (type == File.Field.Type.ENUM) "${name.safeFieldName}.value" else name.safeFieldName
    protected val File.Field.Type.sizeMethod get() = when (this) {
        File.Field.Type.BOOL -> "boolSize"
        File.Field.Type.BYTES -> "byteArrSize"
        File.Field.Type.DOUBLE -> "doubleSize"
        File.Field.Type.ENUM -> "enumSize"
        File.Field.Type.FIXED32 -> "fixed32Size"
        File.Field.Type.FIXED64 -> "fixed64Size"
        File.Field.Type.FLOAT -> "floatSize"
        File.Field.Type.GROUP -> TODO()
        File.Field.Type.INT32 -> "int32Size"
        File.Field.Type.INT64 -> "int64Size"
        File.Field.Type.MESSAGE -> error("Not handled here")
        File.Field.Type.SFIXED32 -> "sFixed32Size"
        File.Field.Type.SFIXED64 -> "sFixed64Size"
        File.Field.Type.SINT32 -> "sInt32Size"
        File.Field.Type.SINT64 -> "sInt64Size"
        File.Field.Type.STRING -> "stringSize"
        File.Field.Type.UINT32 -> "uInt32Size"
        File.Field.Type.UINT64 -> "uInt64Size"
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
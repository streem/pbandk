package pbandk.gen

import com.google.protobuf.DescriptorProtos

open class FileBuilder {

    fun fromProto(fileDesc: DescriptorProtos.FileDescriptorProto) = File(
        name = fileDesc.name,
        packageName = packageName(fileDesc),
        version = fileDesc.syntax.removePrefix("proto").toInt(),
        types = fileDesc.enumTypeList.map { fromProto(it) } + fileDesc.messageTypeList.map { fromProto(it) }
    )

    protected fun packageName(fileDesc: DescriptorProtos.FileDescriptorProto): String {
        var packageName = fileDesc.options.uninterpretedOptionList.find {
            it.nameList.singleOrNull()?.namePart == "kotlin_package"
        }?.stringValue?.toStringUtf8() ?: ""
        if (packageName.isEmpty()) packageName = fileDesc.options.javaPackage
        if (packageName.isEmpty()) packageName = fileDesc.`package`
        return packageName
    }

    protected fun fromProto(enumDesc: DescriptorProtos.EnumDescriptorProto) = File.Type.Enum(
        name = enumDesc.name,
        values = enumDesc.valueList.map { it.number to it.name }
    )

    protected fun fromProto(msgDesc: DescriptorProtos.DescriptorProto): File.Type.Message = File.Type.Message(
        name = msgDesc.name,
        fields = fieldsFromProto(msgDesc),
        nestedTypes = msgDesc.enumTypeList.map { fromProto(it) } + msgDesc.nestedTypeList.map { fromProto(it) }
    )

    protected fun fieldsFromProto(msgDesc: DescriptorProtos.DescriptorProto) = mutableSetOf<Int>().let { seenOneOfIndexes ->
        msgDesc.fieldList.mapNotNull { field ->
            if (!field.hasOneofIndex()) fromProto(field)
            else if (seenOneOfIndexes.add(field.oneofIndex)) File.Field.OneOf(
                name = msgDesc.oneofDeclList[field.oneofIndex].name,
                fields = msgDesc.fieldList.filter {
                    it.hasOneofIndex() && it.oneofIndex == field.oneofIndex
                }.map { fromProto(it) }
            ) else null
        }
    }

    protected fun fromProto(fieldDesc: DescriptorProtos.FieldDescriptorProto) = File.Field.Standard(
        number = fieldDesc.number,
        name = fieldDesc.name,
        type = when (fieldDesc.type!!) {
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_BOOL -> File.Field.Type.BOOL
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES -> File.Field.Type.BYTES
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE -> File.Field.Type.DOUBLE
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_ENUM -> File.Field.Type.ENUM
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_FIXED32 -> File.Field.Type.FIXED32
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_FIXED64 -> File.Field.Type.FIXED64
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_FLOAT -> File.Field.Type.FLOAT
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_GROUP -> File.Field.Type.GROUP
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_INT32 -> File.Field.Type.INT32
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_INT64 -> File.Field.Type.INT64
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_MESSAGE -> File.Field.Type.MESSAGE
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_SFIXED32 -> File.Field.Type.SFIXED32
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_SFIXED64 -> File.Field.Type.SFIXED64
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_SINT32 -> File.Field.Type.SINT32
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_SINT64 -> File.Field.Type.SINT64
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_STRING -> File.Field.Type.STRING
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_UINT32 -> File.Field.Type.UINT32
            DescriptorProtos.FieldDescriptorProto.Type.TYPE_UINT64 -> File.Field.Type.UINT64
        },
        typeName = if (fieldDesc.hasTypeName()) fieldDesc.typeName else null
    )

    companion object : FileBuilder()
}
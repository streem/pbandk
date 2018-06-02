package pbandk.gen

import com.google.protobuf.DescriptorProtos

open class FileBuilder(val namer: Namer = Namer.Standard) {

    fun fromProto(fileDesc: DescriptorProtos.FileDescriptorProto, params: Map<String, String>) = File(
        name = fileDesc.name,
        packageName = packageName(fileDesc, params),
        version = fileDesc.syntax?.removePrefix("proto")?.toIntOrNull() ?: 2,
        types = typesFromProto(fileDesc.enumTypeList, fileDesc.messageTypeList)
    )

    protected fun packageName(fileDesc: DescriptorProtos.FileDescriptorProto, params: Map<String, String>) =
        params["kotlin_package"] ?: fileDesc.options.uninterpretedOptionList.find {
            it.nameList.singleOrNull()?.namePart == "kotlin_package"
        }?.stringValue?.toStringUtf8() ?: fileDesc.`package`?.takeIf { it.isNotEmpty() }

    protected fun typesFromProto(
        enumTypes: List<DescriptorProtos.EnumDescriptorProto>,
        msgTypes: List<DescriptorProtos.DescriptorProto>
    ) = mutableSetOf<String>().let { usedTypeNames ->
        enumTypes.map { fromProto(it, usedTypeNames) } + msgTypes.map { fromProto(it, usedTypeNames) }
    }

    protected fun fromProto(
        enumDesc: DescriptorProtos.EnumDescriptorProto,
        usedTypeNames: MutableSet<String>
    ) = File.Type.Enum(
        name = enumDesc.name,
        values = mutableSetOf<String>().let { usedValueNames ->
            enumDesc.valueList.map {
                File.Type.Enum.Value(it.number, it.name, namer.newEnumValueName(it.name, usedValueNames))
            }
        },
        kotlinTypeName = namer.newTypeName(enumDesc.name, usedTypeNames)
    )

    protected fun fromProto(
        msgDesc: DescriptorProtos.DescriptorProto,
        usedTypeNames: MutableSet<String>
    ): File.Type.Message = File.Type.Message(
        name = msgDesc.name,
        fields = fieldsFromProto(msgDesc, usedTypeNames),
        nestedTypes = typesFromProto(msgDesc.enumTypeList, msgDesc.nestedTypeList),
        kotlinTypeName = namer.newTypeName(msgDesc.name, usedTypeNames)
    )

    protected fun fieldsFromProto(
        msgDesc: DescriptorProtos.DescriptorProto,
        usedTypeNames: MutableSet<String>
    ) = mutableSetOf<Int>().let { seenOneOfIndexes ->
        val usedFieldNames = mutableSetOf<String>()
        msgDesc.fieldList.mapNotNull { field ->
            if (!field.hasOneofIndex()) fromProto(field, usedFieldNames)
            else if (seenOneOfIndexes.add(field.oneofIndex)) msgDesc.oneofDeclList[field.oneofIndex].name.let { name ->
                val fieldTypeNames = mutableMapOf<String, String>()
                File.Field.OneOf(
                    name = name,
                    fields = mutableSetOf<String>().let { usedFieldTypeNames ->
                        msgDesc.fieldList.filter { it.hasOneofIndex() && it.oneofIndex == field.oneofIndex }.map {
                            fieldTypeNames += it.name to namer.newTypeName(it.name, usedFieldTypeNames)
                            fromProto(it, mutableSetOf())
                        }
                    },
                    kotlinFieldTypeNames = fieldTypeNames,
                    kotlinFieldName = namer.newFieldName(name, usedFieldNames),
                    kotlinTypeName = namer.newTypeName(name, usedTypeNames)
                )
            } else null
        }
    }

    protected fun fromProto(
        fieldDesc: DescriptorProtos.FieldDescriptorProto,
        usedFieldNames: MutableSet<String>
    ) = File.Field.Standard(
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
        localTypeName = if (!fieldDesc.hasTypeName()) null else fieldDesc.typeName,
        kotlinFieldName = namer.newFieldName(fieldDesc.name, usedFieldNames),
        kotlinLocalTypeName = if (!fieldDesc.hasTypeName()) null else fieldDesc.typeName.split('.').joinToString(".") {
            // TODO: this is not good enough, we need to keep a mapping to real name value
            if (it.isEmpty()) it else namer.newTypeName(it, mutableSetOf())
        }
    )

    companion object : FileBuilder()
}
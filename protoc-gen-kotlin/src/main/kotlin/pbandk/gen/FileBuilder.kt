package pbandk.gen

import com.google.protobuf.DescriptorProtos

open class FileBuilder(
    val namer: Namer = Namer.Standard,
    val supportMaps: Boolean = true
) {

    fun buildFile(ctx: Context) = File(
        name = ctx.fileDesc.name,
        packageName = ctx.fileDesc.`package`?.takeIf { it.isNotEmpty() },
        kotlinPackageName = packageName(ctx),
        version = ctx.fileDesc.syntax?.removePrefix("proto")?.toIntOrNull() ?: 2,
        types = typesFromProto(ctx, ctx.fileDesc.enumTypeList, ctx.fileDesc.messageTypeList)
    )

    protected fun packageName(ctx: Context) =
        ctx.params["kotlin_package"] ?: ctx.fileDesc.options.uninterpretedOptionList.find {
            it.nameList.singleOrNull()?.namePart == "kotlin_package"
        }?.stringValue?.toStringUtf8() ?: ctx.fileDesc.`package`?.takeIf { it.isNotEmpty() }

    protected fun typesFromProto(
        ctx: Context,
        enumTypes: List<DescriptorProtos.EnumDescriptorProto>,
        msgTypes: List<DescriptorProtos.DescriptorProto>
    ) = mutableSetOf<String>().let { usedTypeNames ->
        enumTypes.map { fromProto(it, usedTypeNames) } + msgTypes.map { fromProto(ctx, it, usedTypeNames) }
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
        ctx: Context,
        msgDesc: DescriptorProtos.DescriptorProto,
        usedTypeNames: MutableSet<String>
    ): File.Type.Message = File.Type.Message(
        name = msgDesc.name,
        fields = fieldsFromProto(ctx, msgDesc, usedTypeNames),
        nestedTypes = typesFromProto(ctx, msgDesc.enumTypeList, msgDesc.nestedTypeList),
        mapEntry = supportMaps && msgDesc.options?.mapEntry == true,
        kotlinTypeName = namer.newTypeName(msgDesc.name, usedTypeNames)
    )

    protected fun fieldsFromProto(
        ctx: Context,
        msgDesc: DescriptorProtos.DescriptorProto,
        usedTypeNames: MutableSet<String>
    ) = mutableSetOf<Int>().let { seenOneOfIndexes ->
        val usedFieldNames = mutableSetOf<String>()
        msgDesc.fieldList.mapNotNull { field ->
            // Exclude any group fields
            if (field.type == DescriptorProtos.FieldDescriptorProto.Type.TYPE_GROUP) null
            else if (!field.hasOneofIndex()) fromProto(ctx, field, usedFieldNames)
            else if (seenOneOfIndexes.add(field.oneofIndex)) msgDesc.oneofDeclList[field.oneofIndex].name.let { name ->
                val fieldTypeNames = mutableMapOf<String, String>()
                File.Field.OneOf(
                    name = name,
                    fields = mutableSetOf<String>().let { usedFieldTypeNames ->
                        msgDesc.fieldList.filter { it.hasOneofIndex() && it.oneofIndex == field.oneofIndex }.map {
                            fieldTypeNames += it.name to namer.newTypeName(it.name, usedFieldTypeNames)
                            fromProto(ctx, it, mutableSetOf())
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
        ctx: Context,
        fieldDesc: DescriptorProtos.FieldDescriptorProto,
        usedFieldNames: MutableSet<String>
    ) = File.Field.Standard(
        number = fieldDesc.number,
        name = fieldDesc.name,
        type = fromProto(fieldDesc.type!!),
        localTypeName = if (!fieldDesc.hasTypeName()) null else fieldDesc.typeName,
        repeated = fieldDesc.label == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED,
        packed = ctx.fileDesc.syntax == "proto3" || fieldDesc.options?.packed == true,
        map = supportMaps &&
            fieldDesc.label == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED &&
            fieldDesc.type == DescriptorProtos.FieldDescriptorProto.Type.TYPE_MESSAGE &&
            ctx.findLocalMessage(fieldDesc.typeName)?.options?.mapEntry == true,
        kotlinFieldName = namer.newFieldName(fieldDesc.name, usedFieldNames),
        kotlinLocalTypeName =
            if (!fieldDesc.hasTypeName() || fieldDesc.typeName.startsWith('.')) null
            else namer.newTypeName(fieldDesc.typeName, mutableSetOf())
    )

    protected fun fromProto(type: DescriptorProtos.FieldDescriptorProto.Type) = when (type) {
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_BOOL -> File.Field.Type.BOOL
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_BYTES -> File.Field.Type.BYTES
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_DOUBLE -> File.Field.Type.DOUBLE
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_ENUM -> File.Field.Type.ENUM
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_FIXED32 -> File.Field.Type.FIXED32
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_FIXED64 -> File.Field.Type.FIXED64
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_FLOAT -> File.Field.Type.FLOAT
        DescriptorProtos.FieldDescriptorProto.Type.TYPE_GROUP -> TODO("Group types not supported")
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
    }

    data class Context(
        val fileDesc: DescriptorProtos.FileDescriptorProto,
        val params: Map<String, String>
    ) {
        fun findLocalMessage(
            name: String,
            parent: DescriptorProtos.DescriptorProto? = null
        ): DescriptorProtos.DescriptorProto? {
            // Get the set to look in and the type name
            val (lookIn, typeName) =
                    if (parent == null) fileDesc.messageTypeList to name.removePrefix(".${fileDesc.`package`}.")
                    else parent.nestedTypeList to name
            // Go deeper if there's a dot
            typeName.indexOf('.').let {
                if (it == -1) return lookIn.find { it.name == typeName }
                return findLocalMessage(typeName.substring(it + 1), typeName.substring(0, it).let { parentTypeName ->
                    lookIn.find { it.name == parentTypeName }
                } ?: return null)
            }
        }
    }

    companion object : FileBuilder()
}
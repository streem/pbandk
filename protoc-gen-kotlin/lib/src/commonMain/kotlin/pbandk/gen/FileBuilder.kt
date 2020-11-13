package pbandk.gen

import pbandk.PbandkInternal
import pbandk.internal.Util
import pbandk.wkt.DescriptorProto
import pbandk.wkt.EnumDescriptorProto
import pbandk.wkt.FieldDescriptorProto
import pbandk.wkt.FileDescriptorProto

open class FileBuilder(val namer: Namer = Namer.Standard, val supportMaps: Boolean = true) {
    fun buildFile(ctx: Context) = File(
        name = ctx.fileDesc.name!!,
        packageName = ctx.fileDesc.`package`?.takeIf { it.isNotEmpty() },
        kotlinPackageName = packageName(ctx),
        version = ctx.fileDesc.syntax?.removePrefix("proto")?.toIntOrNull() ?: 2,
        types = typesFromProto(ctx, ctx.fileDesc.enumType, ctx.fileDesc.messageType, mutableSetOf()),
        extensions = ctx.fileDesc.extension.map { numberedFieldFromProto(ctx, it, mutableSetOf()) }
    )

    @OptIn(PbandkInternal::class)
    protected fun packageName(ctx: Context) =
        ctx.params["kotlin_package"]
            ?: ctx.fileDesc.options?.uninterpretedOption?.find {
                it.name.singleOrNull()?.namePart == "kotlin_package"
            }?.stringValue?.array?.let(Util::utf8ToString)
            ?: ctx.packageMappings[ctx.fileDesc.`package`]
            ?: ctx.fileDesc.options?.javaPackage?.takeIf { it.isNotEmpty() }
            ?: ctx.fileDesc.`package`?.takeIf { it.isNotEmpty() }

    protected fun typesFromProto(
        ctx: Context,
        enumTypes: List<EnumDescriptorProto>,
        msgTypes: List<DescriptorProto>,
        usedTypeNames: MutableSet<String>
    ) = enumTypes.map { fromProto(it, usedTypeNames) } + msgTypes.map { fromProto(ctx, it, usedTypeNames) }

    protected fun fromProto(enumDesc: EnumDescriptorProto, usedTypeNames: MutableSet<String>) = File.Type.Enum(
        name = enumDesc.name!!,
        values = enumDesc.value.fold(listOf()) { values, value ->
            values + File.Type.Enum.Value(
                number = value.number!!,
                name = value.name!!,
                kotlinValueTypeName = namer.newEnumValueTypeName(
                    enumDesc.name!!,
                    value.name!!,
                    values.map { it.kotlinValueTypeName })
            )
        },
        kotlinTypeName = namer.newTypeName(enumDesc.name!!, usedTypeNames).also {
            usedTypeNames += it
        }
    )

    protected fun fromProto(
        ctx: Context,
        msgDesc: DescriptorProto,
        usedTypeNames: MutableSet<String>
    ): File.Type.Message {
        val usedNestedTypeNames = mutableSetOf<String>()
        return File.Type.Message(
            name = msgDesc.name!!,
            fields = fieldsFromProto(ctx, msgDesc, usedNestedTypeNames),
            nestedTypes = typesFromProto(
                ctx,
                msgDesc.enumType,
                msgDesc.nestedType,
                usedNestedTypeNames
            ),
            mapEntry = supportMaps && msgDesc.options?.mapEntry == true,
            kotlinTypeName = namer.newTypeName(msgDesc.name!!, usedTypeNames).also {
                usedTypeNames += it
            },
            extensionRange = msgDesc.extensionRange
        )
    }

    protected fun fieldsFromProto(
        ctx: Context,
        msgDesc: DescriptorProto,
        usedTypeNames: MutableSet<String>
    ): List<File.Field> {
        val usedFieldNames = mutableSetOf<String>()
        return msgDesc.field
            // Exclude any group fields
            .filterNot { it.type == FieldDescriptorProto.Type.GROUP }
            // Handle fields that are part of a oneof specially
            .partition { it.oneofIndex == null }
            .let { (standardFields, oneofFields) ->
                standardFields.map {
                    numberedFieldFromProto(ctx, it, usedFieldNames)
                } + oneofFields.groupBy {
                    it.oneofIndex!!
                }.mapNotNull { (oneofIndex, fields) ->
                    msgDesc.oneofDecl[oneofIndex].name?.let { oneofName ->
                        oneofFieldFromProto(ctx, oneofName, fields, usedFieldNames, usedTypeNames)
                    }
                }
            }
    }

    protected fun oneofFieldFromProto(
        ctx: Context,
        oneofName: String,
        oneofFields: List<FieldDescriptorProto>,
        usedFieldNames: MutableSet<String>,
        usedTypeNames: MutableSet<String>
    ): File.Field.OneOf {
        val fields = oneofFields.map {
            // wrapper fields are not supposed to be used inside of oneof's
            numberedFieldFromProto(ctx, it, mutableSetOf(), true) as File.Field.Numbered.Standard
        }
        return File.Field.OneOf(
            name = oneofName,
            fields = fields,
            kotlinFieldTypeNames = fields.fold(mapOf()) { typeNames, field ->
                typeNames + (field.name to namer.newTypeName(field.name, typeNames.values))
            },
            kotlinFieldName = namer.newFieldName(oneofName, usedFieldNames).also {
                usedFieldNames += it
            },
            kotlinTypeName = namer.newTypeName(oneofName, usedTypeNames).also {
                usedTypeNames += it
            }
        )
    }

    protected fun numberedFieldFromProto(
        ctx: Context,
        fieldDesc: FieldDescriptorProto,
        usedFieldNames: MutableSet<String>,
        alwaysRequired: Boolean = false
    ): File.Field.Numbered {
        val type = fromProto(fieldDesc.type ?: error("Missing field type"))
        val wrappedType = fieldDesc.typeName
            ?.takeIf { type == File.Field.Type.MESSAGE }
            ?.let { File.Field.Type.WRAPPER_TYPE_NAME_TO_TYPE[it] }

        return if (wrappedType != null) {
            File.Field.Numbered.Wrapper(
                number = fieldDesc.number!!,
                name = fieldDesc.name!!,
                kotlinFieldName = namer.newFieldName(fieldDesc.name!!, usedFieldNames).also {
                    usedFieldNames += it
                },
                repeated = fieldDesc.label == FieldDescriptorProto.Label.REPEATED,
                jsonName = fieldDesc.jsonName,
                wrappedType = wrappedType,
                options = fieldDesc.options,
                extendee = fieldDesc.extendee
            )
        } else {
            File.Field.Numbered.Standard(
                number = fieldDesc.number!!,
                name = fieldDesc.name!!,
                type = type,
                localTypeName = fieldDesc.typeName,
                repeated = fieldDesc.label == FieldDescriptorProto.Label.REPEATED,
                jsonName = fieldDesc.jsonName,
                optional = !alwaysRequired && fieldDesc.label == FieldDescriptorProto.Label.OPTIONAL,
                packed = !type.neverPacked && (fieldDesc.options?.packed ?: (ctx.fileDesc.syntax == "proto3")),
                map = supportMaps &&
                        fieldDesc.label == FieldDescriptorProto.Label.REPEATED &&
                        fieldDesc.type == FieldDescriptorProto.Type.MESSAGE &&
                        ctx.findLocalMessage(fieldDesc.typeName!!)?.options?.mapEntry == true,
                kotlinFieldName = namer.newFieldName(fieldDesc.name!!, usedFieldNames).also {
                    usedFieldNames += it
                },
                kotlinLocalTypeName = fieldDesc.typeName?.takeUnless { it.startsWith('.') }?.let {
                    namer.newTypeName(it, emptySet())
                },
                options = fieldDesc.options,
                extendee = fieldDesc.extendee
            )
        }
    }

    protected fun fromProto(type: FieldDescriptorProto.Type) = when (type) {
        FieldDescriptorProto.Type.BOOL -> File.Field.Type.BOOL
        FieldDescriptorProto.Type.BYTES -> File.Field.Type.BYTES
        FieldDescriptorProto.Type.DOUBLE -> File.Field.Type.DOUBLE
        FieldDescriptorProto.Type.ENUM -> File.Field.Type.ENUM
        FieldDescriptorProto.Type.FIXED32 -> File.Field.Type.FIXED32
        FieldDescriptorProto.Type.FIXED64 -> File.Field.Type.FIXED64
        FieldDescriptorProto.Type.FLOAT -> File.Field.Type.FLOAT
        FieldDescriptorProto.Type.GROUP -> TODO("Group types not supported")
        FieldDescriptorProto.Type.INT32 -> File.Field.Type.INT32
        FieldDescriptorProto.Type.INT64 -> File.Field.Type.INT64
        FieldDescriptorProto.Type.MESSAGE -> File.Field.Type.MESSAGE
        FieldDescriptorProto.Type.SFIXED32 -> File.Field.Type.SFIXED32
        FieldDescriptorProto.Type.SFIXED64 -> File.Field.Type.SFIXED64
        FieldDescriptorProto.Type.SINT32 -> File.Field.Type.SINT32
        FieldDescriptorProto.Type.SINT64 -> File.Field.Type.SINT64
        FieldDescriptorProto.Type.STRING -> File.Field.Type.STRING
        FieldDescriptorProto.Type.UINT32 -> File.Field.Type.UINT32
        FieldDescriptorProto.Type.UINT64 -> File.Field.Type.UINT64
        else -> error("Unknown type: $type")
    }

    data class Context(val fileDesc: FileDescriptorProto, val params: Map<String, String>) {
        // Support option kotlin_package_mapping=from.package1->to.package1;from.package2->to.package2
        val packageMappings = params["kotlin_package_mapping"]
            ?.split(";")
            ?.map { it.substringBefore("->") to it.substringAfter("->", "") }
            ?.toMap()
            ?: emptyMap()

        fun findLocalMessage(name: String, parent: DescriptorProto? = null): DescriptorProto? {
            // Get the set to look in and the type name
            val (lookIn, typeName) =
                if (parent == null) fileDesc.messageType to name.removePrefix(".${fileDesc.`package`}.")
                else parent.nestedType to name
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

package pbandk.gen

import pbandk.wkt.DescriptorProto
import pbandk.wkt.EnumDescriptorProto
import pbandk.wkt.FieldDescriptorProto
import pbandk.wkt.FieldOptions
import pbandk.wkt.FileDescriptorProto

internal open class FileBuilder(val namer: Namer = Namer.Standard, val supportMaps: Boolean = true) {
    fun buildFile(ctx: Context): File {
        return File(
            name = ctx.fileDesc.name!!,
            packageName = ctx.packageName,
            kotlinPackageName = ctx.kotlinPackageName,
            version = ctx.fileDesc.syntax?.removePrefix("proto")?.toIntOrNull() ?: 2,
            types = typesFromProto(ctx, ctx.fileDesc.enumType, ctx.fileDesc.messageType),
            extensions = ctx.fileDesc.extension.map {
                numberedFieldFromProto(
                    ctx,
                    null,
                    null,
                    it,
                    mutableSetOf()
                )
            }
        )
    }

    protected fun typesFromProto(
        ctx: Context,
        enumTypes: List<EnumDescriptorProto>,
        msgTypes: List<DescriptorProto>,
        parentName: Name? = null,
        parentKotlinName: Name? = null,
        usedTypeNames: MutableSet<String> = mutableSetOf(),
    ) = enumTypes.map { fromProto(ctx, it, parentName, parentKotlinName, usedTypeNames) } +
            msgTypes.map { fromProto(ctx, it, parentName, parentKotlinName, usedTypeNames) }

    protected fun fromProto(
        @Suppress("UNUSED_PARAMETER") ctx: Context,
        enumDesc: EnumDescriptorProto,
        parentName: Name?,
        parentKotlinName: Name?,
        usedTypeNames: MutableSet<String>,
    ): File.Type.Enum {
        val kotlinTypeName = namer.newTypeName(enumDesc.name!!, usedTypeNames).also {
            usedTypeNames += it
        }

        return File.Type.Enum(
            name = Name(simple = enumDesc.name!!, packageName = ctx.packageName, parent = parentName),
            values = enumDesc.value.fold(listOf()) { values, value ->
                values + File.Type.Enum.Value(
                    number = value.number!!,
                    name = value.name!!,
                    kotlinName = namer.newEnumValueTypeName(
                        enumDesc.name!!,
                        value.name!!,
                        values.map { it.kotlinName })
                )
            },
            kotlinName = Name(simple = kotlinTypeName, packageName = ctx.kotlinPackageName, parent = parentKotlinName),
        )
    }

    protected fun fromProto(
        ctx: Context,
        msgDesc: DescriptorProto,
        parentName: Name?,
        parentKotlinName: Name?,
        usedTypeNames: MutableSet<String>,
    ): File.Type.Message {
        val kotlinTypeName = namer.newTypeName(msgDesc.name!!, usedTypeNames).also {
            usedTypeNames += it
        }
        val name = Name(simple = msgDesc.name!!, packageName = ctx.packageName, parent = parentName)
        val kotlinName = Name(simple = kotlinTypeName, packageName = ctx.kotlinPackageName, parent = parentKotlinName)

        val usedFieldNames = mutableSetOf<String>()
        val usedNestedTypeNames = mutableSetOf<String>()
        return File.Type.Message(
            name = name,
            fields = fieldsFromProto(ctx, msgDesc, name, kotlinName, usedFieldNames, usedNestedTypeNames),
            nestedTypes = typesFromProto(
                ctx,
                msgDesc.enumType,
                msgDesc.nestedType,
                name,
                kotlinName,
                usedNestedTypeNames
            ),
            mapEntry = supportMaps && msgDesc.options?.mapEntry == true,
            kotlinName = kotlinName,
            extensionRange = msgDesc.extensionRange,
            extensions = msgDesc.extension.map {
                numberedFieldFromProto(
                    ctx,
                    name,
                    kotlinName,
                    it,
                    usedFieldNames,
                )
            }
        )
    }

    protected fun fieldsFromProto(
        ctx: Context,
        msgDesc: DescriptorProto,
        msgName: Name,
        msgKotlinName: Name,
        usedFieldNames: MutableSet<String>,
        usedTypeNames: MutableSet<String>
    ): List<File.Field> {
        return msgDesc.field
            // Exclude any group fields
            .filterNot { it.type == FieldDescriptorProto.Type.GROUP }
            // Handle fields that are part of a oneof specially
            .partition { it.oneofIndex == null }
            .let { (standardFields, oneofFields) ->
                standardFields.map {
                    numberedFieldFromProto(ctx, msgName, msgKotlinName, it, usedFieldNames)
                } + oneofFields.groupBy { it.oneofIndex!! }
                    .mapNotNull { (oneofIndex, fields) ->
                        // "Every proto3 optional field is placed into a one-field oneof.
                        // We call this a "synthetic" oneof, as it was not present in the source .proto file."
                        // https://github.com/protocolbuffers/protobuf/blob/master/docs/implementing_proto3_presence.md#background
                        val synthetic = fields.size == 1 && (fields[0].proto3Optional ?: false)
                        if (synthetic) {
                            numberedFieldFromProto(ctx, msgName, msgKotlinName, fields[0], usedFieldNames)
                        } else {
                            msgDesc.oneofDecl[oneofIndex].name?.let { oneofName ->
                                oneofFieldFromProto(ctx, msgName, msgKotlinName, oneofName, fields, usedFieldNames, usedTypeNames)
                            }
                        }
                    }
            }
    }

    protected fun oneofFieldFromProto(
        ctx: Context,
        msgName: Name,
        msgKotlinName: Name,
        oneofName: String,
        oneofFields: List<FieldDescriptorProto>,
        usedFieldNames: MutableSet<String>,
        usedTypeNames: MutableSet<String>
    ): File.Field.OneOf {
        val fields = oneofFields.map {
            numberedFieldFromProto(ctx, msgName, msgKotlinName, it, mutableSetOf(), oneofField = true)
        }
        val kotlinTypeName = Name(msgKotlinName, namer.newTypeName(oneofName, usedTypeNames).also {
            usedTypeNames += it
        })
        return File.Field.OneOf(
            name = Name(msgName, oneofName),
            fields = fields,
            kotlinFieldNames = fields.fold(mapOf()) { typeNames, field ->
                typeNames + (field.name.simple to Name(kotlinTypeName, namer.newTypeName(field.name.simple, typeNames.values.map { it.simple })))
            },
            kotlinName = Name(msgKotlinName, namer.newFieldName(oneofName, usedFieldNames).also {
                usedFieldNames += it
            }),
            kotlinTypeName = kotlinTypeName,
        )
    }

    protected fun numberedFieldFromProto(
        ctx: Context,
        msgName: Name?,
        msgKotlinName: Name?,
        fieldDesc: FieldDescriptorProto,
        usedFieldNames: MutableSet<String>,
        oneofField: Boolean = false
    ): File.Field.Numbered {
        val type = fromProto(fieldDesc.type ?: error("Missing field type"))
        val wrappedKotlinType = fieldDesc.typeName
            ?.takeIf { type == File.Field.Type.MESSAGE && it.startsWith(".google.protobuf") }
            ?.let {
                File.Type.Message.CustomKotlinTypeMappings[
                    Name(".google.protobuf", it.removePrefix(".google.protobuf."))
                ]
            }
        val simpleKotlinName = namer.newFieldName(fieldDesc.name!!, usedFieldNames).also {
            usedFieldNames += it
        }

        return if (wrappedKotlinType != null) {
            // TODO deal with wrapped messages inside of oneofs
            File.Field.Numbered.Wrapper(
                number = fieldDesc.number!!,
                name = msgName?.let { Name(it, fieldDesc.name!!) } ?: Name(ctx.packageName, fieldDesc.name!!),
                kotlinName = msgKotlinName?.let { Name(it, simpleKotlinName) } ?: Name(
                    ctx.kotlinPackageName,
                    simpleKotlinName
                ),
                repeated = fieldDesc.label == FieldDescriptorProto.Label.REPEATED,
                jsonName = fieldDesc.jsonName!!,
                hasPresence = fieldDesc.label != FieldDescriptorProto.Label.REPEATED,
                required = fieldDesc.label == FieldDescriptorProto.Label.REQUIRED,
                options = fieldDesc.options ?: FieldOptions.defaultInstance,
                extendee = fieldDesc.extendee,
                localTypeName = fieldDesc.typeName!!,
                wrappedKotlinType = wrappedKotlinType,
            )
        } else {
            File.Field.Numbered.Standard(
                number = fieldDesc.number!!,
                name = msgName?.let { Name(it, fieldDesc.name!!) } ?: Name(ctx.packageName, fieldDesc.name!!),
                kotlinName = msgKotlinName?.let { Name(it, simpleKotlinName) } ?: Name(
                    ctx.kotlinPackageName,
                    simpleKotlinName
                ),
                repeated = fieldDesc.label == FieldDescriptorProto.Label.REPEATED,
                jsonName = fieldDesc.jsonName!!,
                hasPresence = (fieldDesc.label != FieldDescriptorProto.Label.REPEATED) &&
                        (ctx.fileDesc.usesProto2Syntax ||
                                oneofField ||
                                // Extension fields follow the rules of the message they're extending, regardless of
                                // whether the extension field is defined in a proto2 or proto3 file. Since only proto2
                                // messages can be extended, non-repeated extension fields should always have presence
                                // (just like other proto2 fields) even if they're in a proto3 file.
                                (fieldDesc.extendee != null) ||
                                (fieldDesc.proto3Optional ?: false) ||
                                (type == File.Field.Type.MESSAGE)),
                required = fieldDesc.label == FieldDescriptorProto.Label.REQUIRED,
                options = fieldDesc.options ?: FieldOptions.defaultInstance,
                extendee = fieldDesc.extendee,
                localTypeName = fieldDesc.typeName,
                kotlinLocalTypeName = fieldDesc.typeName?.takeUnless { it.startsWith('.') }?.let {
                    namer.newTypeName(it, emptySet())
                },
                type = type,
                map = supportMaps &&
                        fieldDesc.label == FieldDescriptorProto.Label.REPEATED &&
                        fieldDesc.type == FieldDescriptorProto.Type.MESSAGE &&
                        ctx.findLocalMessage(fieldDesc.typeName!!)?.options?.mapEntry == true,
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
        val packageName = '.' + fileDesc.`package`.orEmpty()

        // Support option kotlin_package_mapping=from.package1->to.package1;from.package2->to.package2
        // or kotlin_package_mapping="from.*->to.*"
        val packageMappings = params["kotlin_package_mapping"]
            ?.split(";")
            ?.associate { it.substringBefore("->") to it.substringAfter("->", "") }
            ?: emptyMap()

        private fun mapPackageName(packageName: String?): String? {
            if (packageName == null) return null

            if (packageMappings[fileDesc.`package`] != null) return packageMappings[fileDesc.`package`]

            val mappedPackageName = packageMappings
                .filterKeys { it.endsWith("*") }
                .firstNotNullOfOrNull { (from, to) ->
                    val prefixToMatch = from.substringBefore("*")
                    if (packageName.startsWith(prefixToMatch)) {
                        if (to.contains("*")) {
                            val prefixToReplaceWith = to.replace("*", "")
                            packageName.replaceFirst(prefixToMatch, prefixToReplaceWith)
                        } else {
                            to
                        }
                    } else {
                        null
                    }
                }
            return mappedPackageName ?: packageName
        }

        val kotlinPackageName = mapPackageName(
            params["kotlin_package"]
                ?: fileDesc.options?.uninterpretedOption?.find {
                    it.name.singleOrNull()?.namePart == "kotlin_package"
                }?.stringValue?.array?.decodeToString()
                ?: fileDesc.options?.javaPackage?.takeIf { it.isNotEmpty() }
                ?: fileDesc.`package`?.takeIf { it.isNotEmpty() }
        )

        fun findLocalMessage(name: String, parent: DescriptorProto? = null): DescriptorProto? {
            // Get the set to look in and the type name
            val (lookIn, typeName) =
                if (parent == null) fileDesc.messageType to name.removePrefix(".${fileDesc.`package`}.")
                else parent.nestedType to name
            // Go deeper if there's a dot
            typeName.indexOf('.').let { index ->
                if (index == -1) return lookIn.find { it.name == typeName }
                return findLocalMessage(
                    name = typeName.substring(index + 1),
                    parent = typeName.substring(0, index).let { parentTypeName ->
                        lookIn.find { it.name == parentTypeName }
                    } ?: return null
                )
            }
        }
    }

    companion object : FileBuilder()
}

private val FileDescriptorProto.usesProto2Syntax: Boolean get() = syntax == null || syntax == "proto2"

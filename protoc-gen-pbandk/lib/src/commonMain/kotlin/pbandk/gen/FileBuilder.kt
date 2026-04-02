package pbandk.gen

import pbandk.wkt.DescriptorProto
import pbandk.wkt.EnumDescriptorProto
import pbandk.wkt.FieldDescriptorProto
import pbandk.wkt.FieldOptions
import pbandk.wkt.FileDescriptorProto
import pbandk.wkt.SourceCodeInfo

internal open class FileBuilder(val namer: Namer = Namer.Standard, val supportMaps: Boolean = true) {
    fun buildFile(ctx: Context): File {
        val packageName = ctx.fileDesc.`package`?.takeIf { it.isNotEmpty() }
        val sourceLocations = sourceCodeLocationIndex(ctx.fileDesc)
        return File(
            name = ctx.fileDesc.name!!,
            packageName = packageName,
            kotlinPackageName = ctx.kotlinPackageName,
            version = ctx.fileDesc.syntax?.removePrefix("proto")?.toIntOrNull() ?: 2,
            types = typesFromProto(
                ctx,
                ctx.fileDesc.enumType,
                ctx.fileDesc.messageType,
                packageName,
                null,
                mutableSetOf(),
                parentDescriptorPath = emptyList(),
                enumFieldNumber = 5, // FileDescriptorProto.enum_type
                messageFieldNumber = 4, // FileDescriptorProto.message_type
                sourceLocations = sourceLocations
            ),
            extensions = ctx.fileDesc.extension.mapIndexed { index, fieldDesc ->
                numberedFieldFromProto(
                    ctx,
                    fieldDesc,
                    mutableSetOf(),
                    descriptorPath = listOf(7, index), // FileDescriptorProto.extension
                    sourceLocations = sourceLocations
                )
            }
        )
    }

    protected fun typesFromProto(
        ctx: Context,
        enumTypes: List<EnumDescriptorProto>,
        msgTypes: List<DescriptorProto>,
        parentFullName: String?,
        parentKotlinFullName: String?,
        usedTypeNames: MutableSet<String>,
        parentDescriptorPath: List<Int>,
        enumFieldNumber: Int,
        messageFieldNumber: Int,
        sourceLocations: Map<PathKey, SourceCodeInfo.Location>
    ) = enumTypes.mapIndexed { index, enumDesc ->
        fromProto(
            ctx,
            enumDesc,
            parentFullName,
            parentKotlinFullName,
            usedTypeNames,
            descriptorPath = parentDescriptorPath + listOf(enumFieldNumber, index),
            sourceLocations = sourceLocations
        )
    } + msgTypes.mapIndexed { index, msgDesc ->
        fromProto(
            ctx,
            msgDesc,
            parentFullName,
            parentKotlinFullName,
            usedTypeNames,
            descriptorPath = parentDescriptorPath + listOf(messageFieldNumber, index),
            sourceLocations = sourceLocations
        )
    }

    protected fun fromProto(
        @Suppress("UNUSED_PARAMETER") ctx: Context,
        enumDesc: EnumDescriptorProto,
        parentFullName: String?,
        parentKotlinFullName: String?,
        usedTypeNames: MutableSet<String>,
        descriptorPath: List<Int>,
        sourceLocations: Map<PathKey, SourceCodeInfo.Location>,
    ): File.Type.Enum {
        val kotlinTypeName = namer.newTypeName(enumDesc.name!!, usedTypeNames).also {
            usedTypeNames += it
        }

        return File.Type.Enum(
            name = enumDesc.name!!,
            fullName = parentFullName?.let { "$it." }.orEmpty() + enumDesc.name!!,
            values = enumDesc.value.foldIndexed(emptyList()) { index, values, value ->
                values + File.Type.Enum.Value(
                    number = value.number!!,
                    name = value.name!!,
                    kotlinValueTypeName = namer.newEnumValueTypeName(
                        enumDesc.name!!,
                        value.name!!,
                        values.map { it.kotlinValueTypeName }
                    ),
                    kdoc = kdocForPath(descriptorPath + listOf(2, index), sourceLocations) // EnumDescriptorProto.value
                )
            },
            kotlinTypeName = kotlinTypeName,
            kotlinFullTypeName = parentKotlinFullName?.let { "${it}." }.orEmpty() + kotlinTypeName,
            kdoc = kdocForPath(descriptorPath, sourceLocations),
        )
    }

    protected fun fromProto(
        ctx: Context,
        msgDesc: DescriptorProto,
        parentFullName: String?,
        parentKotlinFullName: String?,
        usedTypeNames: MutableSet<String>,
        descriptorPath: List<Int>,
        sourceLocations: Map<PathKey, SourceCodeInfo.Location>,
    ): File.Type.Message {
        val fullName = parentFullName?.let { "$it." }.orEmpty() + msgDesc.name!!
        val kotlinTypeName = namer.newTypeName(msgDesc.name!!, usedTypeNames).also {
            usedTypeNames += it
        }
        val kotlinFullTypeName = parentKotlinFullName?.let { "${it}." }.orEmpty() + kotlinTypeName

        val usedNestedTypeNames = mutableSetOf<String>()
        return File.Type.Message(
            name = msgDesc.name!!,
            fullName = fullName,
            fields = fieldsFromProto(ctx, msgDesc, usedNestedTypeNames, descriptorPath, sourceLocations),
            nestedTypes = typesFromProto(
                ctx,
                msgDesc.enumType,
                msgDesc.nestedType,
                fullName,
                kotlinFullTypeName,
                usedNestedTypeNames,
                parentDescriptorPath = descriptorPath,
                enumFieldNumber = 4, // DescriptorProto.enum_type
                messageFieldNumber = 3, // DescriptorProto.nested_type
                sourceLocations = sourceLocations
            ),
            mapEntry = supportMaps && msgDesc.options?.mapEntry == true,
            kotlinTypeName = kotlinTypeName,
            kotlinFullTypeName = kotlinFullTypeName,
            extensionRange = msgDesc.extensionRange,
            kdoc = kdocForPath(descriptorPath, sourceLocations)
        )
    }

    protected fun fieldsFromProto(
        ctx: Context,
        msgDesc: DescriptorProto,
        usedTypeNames: MutableSet<String>,
        messageDescriptorPath: List<Int>,
        sourceLocations: Map<PathKey, SourceCodeInfo.Location>
    ): List<File.Field> {
        val usedFieldNames = mutableSetOf<String>()
        val standardFields = mutableListOf<Pair<Int, FieldDescriptorProto>>()
        val oneofFieldsByIndex = linkedMapOf<Int, MutableList<Pair<Int, FieldDescriptorProto>>>()

        msgDesc.field.forEachIndexed { index, fieldDesc ->
            val oneofIndex = fieldDesc.oneofIndex
            if (oneofIndex == null) {
                standardFields += index to fieldDesc
            } else {
                oneofFieldsByIndex.getOrPut(oneofIndex) { mutableListOf() } += index to fieldDesc
            }
        }

        return standardFields.map { (index, fieldDesc) ->
            numberedFieldFromProto(
                ctx,
                fieldDesc,
                usedFieldNames,
                descriptorPath = messageDescriptorPath + listOf(2, index), // DescriptorProto.field
                sourceLocations = sourceLocations
            )
        } + oneofFieldsByIndex.mapNotNull { (oneofIndex, fields) ->
            // "Every proto3 optional field is placed into a one-field oneof.
            // We call this a "synthetic" oneof, as it was not present in the source .proto file."
            // https://github.com/protocolbuffers/protobuf/blob/master/docs/implementing_proto3_presence.md#background
            val synthetic = fields.size == 1 && (fields[0].second.proto3Optional ?: false)
            if (synthetic) {
                val (index, fieldDesc) = fields[0]
                numberedFieldFromProto(
                    ctx,
                    fieldDesc,
                    usedFieldNames,
                    descriptorPath = messageDescriptorPath + listOf(2, index), // DescriptorProto.field
                    sourceLocations = sourceLocations
                )
            } else {
                msgDesc.oneofDecl.getOrNull(oneofIndex)?.name?.let { oneofName ->
                    oneofFieldFromProto(
                        ctx,
                        oneofName,
                        oneofIndex,
                        fields,
                        usedFieldNames,
                        usedTypeNames,
                        messageDescriptorPath,
                        sourceLocations
                    )
                }
            }
        }
    }

    protected fun oneofFieldFromProto(
        ctx: Context,
        oneofName: String,
        oneofIndex: Int,
        oneofFields: List<Pair<Int, FieldDescriptorProto>>,
        usedFieldNames: MutableSet<String>,
        usedTypeNames: MutableSet<String>,
        messageDescriptorPath: List<Int>,
        sourceLocations: Map<PathKey, SourceCodeInfo.Location>
    ): File.Field.OneOf {
        val fields = oneofFields.map { (fieldIndex, fieldDesc) ->
            // wrapper fields are not supposed to be used inside of oneof's
            numberedFieldFromProto(
                ctx,
                fieldDesc,
                mutableSetOf(),
                oneofField = true,
                descriptorPath = messageDescriptorPath + listOf(2, fieldIndex), // DescriptorProto.field
                sourceLocations = sourceLocations
            ) as File.Field.Numbered.Standard
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
            },
            kdoc = kdocForPath(messageDescriptorPath + listOf(8, oneofIndex), sourceLocations) // DescriptorProto.oneof_decl
        )
    }

    protected fun numberedFieldFromProto(
        ctx: Context,
        fieldDesc: FieldDescriptorProto,
        usedFieldNames: MutableSet<String>,
        oneofField: Boolean = false,
        descriptorPath: List<Int>,
        sourceLocations: Map<PathKey, SourceCodeInfo.Location>
    ): File.Field.Numbered {
        val type = fromProto(fieldDesc.type ?: error("Missing field type"))
        val wrappedType = fieldDesc.typeName
            ?.takeIf { type == File.Field.Type.MESSAGE }
            ?.let { File.Field.Type.WRAPPER_TYPE_NAME_TO_TYPE[it] }
        val kdoc = kdocForPath(descriptorPath, sourceLocations)

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
                options = fieldDesc.options ?: FieldOptions.defaultInstance,
                extendee = fieldDesc.extendee,
                kdoc = kdoc
            )
        } else {
            File.Field.Numbered.Standard(
                number = fieldDesc.number!!,
                name = fieldDesc.name!!,
                type = type,
                localTypeName = fieldDesc.typeName,
                repeated = fieldDesc.label == FieldDescriptorProto.Label.REPEATED,
                jsonName = fieldDesc.jsonName,
                hasPresence = (fieldDesc.label != FieldDescriptorProto.Label.REPEATED) &&
                        (ctx.fileDesc.usesProto2Syntax ||
                                oneofField ||
                                (fieldDesc.proto3Optional ?: false) ||
                                (type == File.Field.Type.MESSAGE || type == File.Field.Type.GROUP)),
                required = fieldDesc.label == FieldDescriptorProto.Label.REQUIRED,
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
                options = fieldDesc.options ?: FieldOptions.defaultInstance,
                extendee = fieldDesc.extendee,
                kdoc = kdoc
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
        FieldDescriptorProto.Type.GROUP -> File.Field.Type.GROUP
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
        // or kotlin_package_mapping="from.*->to.*"
        val packageMappings = params["kotlin_package_mapping"]
            ?.split(";")
            ?.associate { it.substringBefore("->") to it.substringAfter("->", "") }
            ?: emptyMap()


        private fun getPackageName(): String? =
            params["kotlin_package"]
                ?: fileDesc.options?.uninterpretedOption?.find {
                    it.name.singleOrNull()?.namePart == "kotlin_package"
                }?.stringValue?.array?.decodeToString()
                ?: fileDesc.options?.javaPackage?.takeIf { it.isNotEmpty() }
                ?: fileDesc.`package`?.takeIf { it.isNotEmpty() }

        private fun matchPackageNameFromPackageMappings(packageName: String): String? {
            if (packageMappings[fileDesc.`package`] != null) return packageMappings[fileDesc.`package`]

            return packageMappings
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
        }

        val kotlinPackageName = getPackageName()?.let { matchPackageNameFromPackageMappings(it) ?: it }

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

private val FileDescriptorProto.usesProto2Syntax: Boolean get() = syntax == null || syntax == "proto2"

internal data class PathKey(val segments: IntArray) {
    override fun equals(other: Any?): Boolean =
        other is PathKey && segments.contentEquals(other.segments)

    override fun hashCode(): Int = segments.contentHashCode()
}

private fun sourceCodeLocationIndex(fileDesc: FileDescriptorProto): Map<PathKey, SourceCodeInfo.Location> {
    val locations = fileDesc.sourceCodeInfo?.location ?: return emptyMap()
    val ret = LinkedHashMap<PathKey, SourceCodeInfo.Location>(locations.size)
    for (loc in locations) {
        val key = PathKey(loc.path.toIntArray())
        val prev = ret[key]
        if (prev == null) {
            ret[key] = loc
        } else {
            ret[key] = if (sourceCodeLocationScore(loc) >= sourceCodeLocationScore(prev)) loc else prev
        }
    }
    return ret
}

private fun sourceCodeLocationScore(loc: SourceCodeInfo.Location): Int {
    val hasDetached = loc.leadingDetachedComments.any(String::isNotBlank)
    val hasLeading = !loc.leadingComments.isNullOrBlank()
    val hasTrailing = !loc.trailingComments.isNullOrBlank()

    var score = 0

    if (hasDetached) score += 4 // Prefer leadingDetachedComments
    if (hasLeading) score += 2 // then leadingComments
    if (hasTrailing) score += 1 // then trailingComments

    return score
}

private fun kdocForPath(path: List<Int>, sourceLocations: Map<PathKey, SourceCodeInfo.Location>): String? {
    val loc = sourceLocations[PathKey(path.toIntArray())] ?: return null

    val blocks = buildList {
        loc.leadingDetachedComments.forEach { detached ->
            detached.trim().takeIf { it.isNotEmpty() }?.let(::add)
        }
        loc.leadingComments?.trim()?.takeIf { it.isNotEmpty() }?.let(::add)
        if (isEmpty()) {
            loc.trailingComments?.trim()?.takeIf { it.isNotEmpty() }?.let(::add)
        }
    }

    if (blocks.isEmpty()) return null

    return blocks.joinToString("\n\n")
        .replace("\r\n", "\n")
        .replace("*/", "*\\\\/")
        .trim()
        .takeIf { it.isNotEmpty() }
}
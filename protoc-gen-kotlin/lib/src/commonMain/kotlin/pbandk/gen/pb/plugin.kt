@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.gen.pb

data class Version(
    val major: Int? = null,
    val minor: Int? = null,
    val patch: Int? = null,
    val suffix: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Version> {
        val defaultInstance by lazy { Version() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = Version.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "major",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                    jsonName = "major",
                    value = Version::major
                ),
                pbandk.FieldDescriptor(
                    name = "minor",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                    jsonName = "minor",
                    value = Version::minor
                ),
                pbandk.FieldDescriptor(
                    name = "patch",
                    number = 3,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                    jsonName = "patch",
                    value = Version::patch
                ),
                pbandk.FieldDescriptor(
                    name = "suffix",
                    number = 4,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                    jsonName = "suffix",
                    value = Version::suffix
                )
            )
        }
    }
}

data class CodeGeneratorRequest(
    val fileToGenerate: List<String> = emptyList(),
    val parameter: String? = null,
    val protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    val compilerVersion: pbandk.gen.pb.Version? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<CodeGeneratorRequest> {
        val defaultInstance by lazy { CodeGeneratorRequest() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = CodeGeneratorRequest.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "file_to_generate",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                    jsonName = "fileToGenerate",
                    value = CodeGeneratorRequest::fileToGenerate
                ),
                pbandk.FieldDescriptor(
                    name = "parameter",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                    jsonName = "parameter",
                    value = CodeGeneratorRequest::parameter
                ),
                pbandk.FieldDescriptor(
                    name = "compiler_version",
                    number = 3,
                    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.Version.Companion),
                    jsonName = "compilerVersion",
                    value = CodeGeneratorRequest::compilerVersion
                ),
                pbandk.FieldDescriptor(
                    name = "proto_file",
                    number = 15,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                    jsonName = "protoFile",
                    value = CodeGeneratorRequest::protoFile
                )
            )
        }
    }
}

data class CodeGeneratorResponse(
    val error: String? = null,
    val file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<CodeGeneratorResponse> {
        val defaultInstance by lazy { CodeGeneratorResponse() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = CodeGeneratorResponse.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "error",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                    jsonName = "error",
                    value = CodeGeneratorResponse::error
                ),
                pbandk.FieldDescriptor(
                    name = "file",
                    number = 15,
                    type = pbandk.FieldDescriptor.Type.Repeated<pbandk.gen.pb.CodeGeneratorResponse.File>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.CodeGeneratorResponse.File.Companion)),
                    jsonName = "file",
                    value = CodeGeneratorResponse::file
                )
            )
        }
    }

    data class File(
        val name: String? = null,
        val insertionPoint: String? = null,
        val content: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val fieldDescriptors get() = Companion.fieldDescriptors
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<CodeGeneratorResponse.File> {
            val defaultInstance by lazy { CodeGeneratorResponse.File() }
            override fun unmarshal(u: pbandk.MessageUnmarshaller) = CodeGeneratorResponse.File.unmarshalImpl(u)

            override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
                listOf(
                    pbandk.FieldDescriptor(
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = File::name
                    ),
                    pbandk.FieldDescriptor(
                        name = "insertion_point",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "insertionPoint",
                        value = File::insertionPoint
                    ),
                    pbandk.FieldDescriptor(
                        name = "content",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "content",
                        value = File::content
                    )
                )
            }
        }
    }
}

fun Version?.orDefault() = this ?: Version.defaultInstance

private fun Version.protoMergeImpl(plus: pbandk.Message?): Version = (plus as? Version)?.copy(
    major = plus.major ?: major,
    minor = plus.minor ?: minor,
    patch = plus.patch ?: patch,
    suffix = plus.suffix ?: suffix,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Version.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): Version {
    var major: Int? = null
    var minor: Int? = null
    var patch: Int? = null
    var suffix: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> major = _fieldValue as Int
            2 -> minor = _fieldValue as Int
            3 -> patch = _fieldValue as Int
            4 -> suffix = _fieldValue as String
        }
    }
    return Version(major, minor, patch, suffix, unknownFields)
}

fun CodeGeneratorRequest?.orDefault() = this ?: CodeGeneratorRequest.defaultInstance

private fun CodeGeneratorRequest.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorRequest = (plus as? CodeGeneratorRequest)?.copy(
    fileToGenerate = fileToGenerate + plus.fileToGenerate,
    parameter = plus.parameter ?: parameter,
    protoFile = protoFile + plus.protoFile,
    compilerVersion = compilerVersion?.plus(plus.compilerVersion) ?: plus.compilerVersion,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorRequest.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): CodeGeneratorRequest {
    var fileToGenerate: pbandk.ListWithSize.Builder<String>? = null
    var parameter: String? = null
    var protoFile: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null
    var compilerVersion: pbandk.gen.pb.Version? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileToGenerate = (fileToGenerate ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            2 -> parameter = _fieldValue as String
            3 -> compilerVersion = _fieldValue as pbandk.gen.pb.Version
            15 -> protoFile = (protoFile ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FileDescriptorProto> }
        }
    }
    return CodeGeneratorRequest(pbandk.ListWithSize.Builder.fixed(fileToGenerate), parameter, pbandk.ListWithSize.Builder.fixed(protoFile), compilerVersion, unknownFields)
}

fun CodeGeneratorResponse?.orDefault() = this ?: CodeGeneratorResponse.defaultInstance

private fun CodeGeneratorResponse.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse = (plus as? CodeGeneratorResponse)?.copy(
    error = plus.error ?: error,
    file = file + plus.file,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): CodeGeneratorResponse {
    var error: String? = null
    var file: pbandk.ListWithSize.Builder<pbandk.gen.pb.CodeGeneratorResponse.File>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = _fieldValue as String
            15 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.gen.pb.CodeGeneratorResponse.File> }
        }
    }
    return CodeGeneratorResponse(error, pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

fun CodeGeneratorResponse.File?.orDefault() = this ?: CodeGeneratorResponse.File.defaultInstance

private fun CodeGeneratorResponse.File.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse.File = (plus as? CodeGeneratorResponse.File)?.copy(
    name = plus.name ?: name,
    insertionPoint = plus.insertionPoint ?: insertionPoint,
    content = plus.content ?: content,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.File.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): CodeGeneratorResponse.File {
    var name: String? = null
    var insertionPoint: String? = null
    var content: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> insertionPoint = _fieldValue as String
            15 -> content = _fieldValue as String
        }
    }
    return CodeGeneratorResponse.File(name, insertionPoint, content, unknownFields)
}

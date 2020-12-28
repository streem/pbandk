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
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.gen.pb.Version> {
        val defaultInstance by lazy { pbandk.gen.pb.Version() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.Version.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.Version, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "major",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "major",
                        value = pbandk.gen.pb.Version::major
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "minor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "minor",
                        value = pbandk.gen.pb.Version::minor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "patch",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "patch",
                        value = pbandk.gen.pb.Version::patch
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.gen.pb.Version::suffix
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.gen.pb.Version::class,
                messageCompanion = this,
                fields = fieldsList
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
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorRequest> {
        val defaultInstance by lazy { pbandk.gen.pb.CodeGeneratorRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.CodeGeneratorRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorRequest, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file_to_generate",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "fileToGenerate",
                        value = pbandk.gen.pb.CodeGeneratorRequest::fileToGenerate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parameter",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "parameter",
                        value = pbandk.gen.pb.CodeGeneratorRequest::parameter
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "compiler_version",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.Version.Companion),
                        jsonName = "compilerVersion",
                        value = pbandk.gen.pb.CodeGeneratorRequest::compilerVersion
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto_file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                        jsonName = "protoFile",
                        value = pbandk.gen.pb.CodeGeneratorRequest::protoFile
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.gen.pb.CodeGeneratorRequest::class,
                messageCompanion = this,
                fields = fieldsList
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
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse> {
        val defaultInstance by lazy { pbandk.gen.pb.CodeGeneratorResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.CodeGeneratorResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "error",
                        value = pbandk.gen.pb.CodeGeneratorResponse::error
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.gen.pb.CodeGeneratorResponse.File>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.CodeGeneratorResponse.File.Companion)),
                        jsonName = "file",
                        value = pbandk.gen.pb.CodeGeneratorResponse::file
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.gen.pb.CodeGeneratorResponse::class,
                messageCompanion = this,
                fields = fieldsList
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
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse.File> {
            val defaultInstance by lazy { pbandk.gen.pb.CodeGeneratorResponse.File() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.CodeGeneratorResponse.File.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, *>>(3)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "name",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::name
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "insertion_point",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "insertionPoint",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::insertionPoint
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "content",
                            number = 15,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "content",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::content
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.gen.pb.CodeGeneratorResponse.File::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

fun Version?.orDefault() = this ?: Version.defaultInstance

private fun Version.protoMergeImpl(plus: pbandk.Message?): Version = (plus as? Version)?.let {
    it.copy(
        major = plus.major ?: major,
        minor = plus.minor ?: minor,
        patch = plus.patch ?: patch,
        suffix = plus.suffix ?: suffix,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Version.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Version {
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

private fun CodeGeneratorRequest.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorRequest = (plus as? CodeGeneratorRequest)?.let {
    it.copy(
        fileToGenerate = fileToGenerate + plus.fileToGenerate,
        parameter = plus.parameter ?: parameter,
        protoFile = protoFile + plus.protoFile,
        compilerVersion = compilerVersion?.plus(plus.compilerVersion) ?: plus.compilerVersion,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorRequest {
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

private fun CodeGeneratorResponse.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse = (plus as? CodeGeneratorResponse)?.let {
    it.copy(
        error = plus.error ?: error,
        file = file + plus.file,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse {
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

private fun CodeGeneratorResponse.File.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse.File = (plus as? CodeGeneratorResponse.File)?.let {
    it.copy(
        name = plus.name ?: name,
        insertionPoint = plus.insertionPoint ?: insertionPoint,
        content = plus.content ?: content,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.File.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse.File {
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

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf.compiler

@pbandk.Export
public data class Version(
    val major: Int? = null,
    val minor: Int? = null,
    val patch: Int? = null,
    val suffix: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.compiler.Version = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.Version> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.compiler.Version> {
        public val defaultInstance: com.google.protobuf.compiler.Version by lazy { com.google.protobuf.compiler.Version() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.compiler.Version = com.google.protobuf.compiler.Version.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.Version> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.compiler.Version, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "major",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "major",
                        value = com.google.protobuf.compiler.Version::major
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "minor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "minor",
                        value = com.google.protobuf.compiler.Version::minor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "patch",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "patch",
                        value = com.google.protobuf.compiler.Version::patch
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "suffix",
                        value = com.google.protobuf.compiler.Version::suffix
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.compiler.Version",
                messageClass = com.google.protobuf.compiler.Version::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CodeGeneratorRequest(
    val fileToGenerate: List<String> = emptyList(),
    val parameter: String? = null,
    val protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    val compilerVersion: com.google.protobuf.compiler.Version? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.compiler.CodeGeneratorRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.CodeGeneratorRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.compiler.CodeGeneratorRequest> {
        public val defaultInstance: com.google.protobuf.compiler.CodeGeneratorRequest by lazy { com.google.protobuf.compiler.CodeGeneratorRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.compiler.CodeGeneratorRequest = com.google.protobuf.compiler.CodeGeneratorRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.CodeGeneratorRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.compiler.CodeGeneratorRequest, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file_to_generate",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "fileToGenerate",
                        value = com.google.protobuf.compiler.CodeGeneratorRequest::fileToGenerate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parameter",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "parameter",
                        value = com.google.protobuf.compiler.CodeGeneratorRequest::parameter
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "compiler_version",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.compiler.Version.Companion),
                        jsonName = "compilerVersion",
                        value = com.google.protobuf.compiler.CodeGeneratorRequest::compilerVersion
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto_file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                        jsonName = "protoFile",
                        value = com.google.protobuf.compiler.CodeGeneratorRequest::protoFile
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.compiler.CodeGeneratorRequest",
                messageClass = com.google.protobuf.compiler.CodeGeneratorRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CodeGeneratorResponse(
    val error: String? = null,
    val supportedFeatures: Long? = null,
    val file: List<com.google.protobuf.compiler.CodeGeneratorResponse.File> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.compiler.CodeGeneratorResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.CodeGeneratorResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.compiler.CodeGeneratorResponse> {
        public val defaultInstance: com.google.protobuf.compiler.CodeGeneratorResponse by lazy { com.google.protobuf.compiler.CodeGeneratorResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.compiler.CodeGeneratorResponse = com.google.protobuf.compiler.CodeGeneratorResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.CodeGeneratorResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.compiler.CodeGeneratorResponse, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "error",
                        value = com.google.protobuf.compiler.CodeGeneratorResponse::error
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "supported_features",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "supportedFeatures",
                        value = com.google.protobuf.compiler.CodeGeneratorResponse::supportedFeatures
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.compiler.CodeGeneratorResponse.File>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.compiler.CodeGeneratorResponse.File.Companion)),
                        jsonName = "file",
                        value = com.google.protobuf.compiler.CodeGeneratorResponse::file
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.compiler.CodeGeneratorResponse",
                messageClass = com.google.protobuf.compiler.CodeGeneratorResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class Feature(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is CodeGeneratorResponse.Feature && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "CodeGeneratorResponse.Feature.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object NONE : Feature(0, "FEATURE_NONE")
        public object PROTO3_OPTIONAL : Feature(1, "FEATURE_PROTO3_OPTIONAL")
        public class UNRECOGNIZED(value: Int) : Feature(value)

        public companion object : pbandk.Message.Enum.Companion<CodeGeneratorResponse.Feature> {
            public val values: List<CodeGeneratorResponse.Feature> by lazy { listOf(NONE, PROTO3_OPTIONAL) }
            override fun fromValue(value: Int): CodeGeneratorResponse.Feature = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): CodeGeneratorResponse.Feature = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Feature with name: $name")
        }
    }

    public data class File(
        val name: String? = null,
        val insertionPoint: String? = null,
        val content: String? = null,
        val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.compiler.CodeGeneratorResponse.File = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.CodeGeneratorResponse.File> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.compiler.CodeGeneratorResponse.File> {
            public val defaultInstance: com.google.protobuf.compiler.CodeGeneratorResponse.File by lazy { com.google.protobuf.compiler.CodeGeneratorResponse.File() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.compiler.CodeGeneratorResponse.File = com.google.protobuf.compiler.CodeGeneratorResponse.File.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.compiler.CodeGeneratorResponse.File> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.compiler.CodeGeneratorResponse.File, *>>(4)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "name",
                            value = com.google.protobuf.compiler.CodeGeneratorResponse.File::name
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "insertion_point",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "insertionPoint",
                            value = com.google.protobuf.compiler.CodeGeneratorResponse.File::insertionPoint
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "content",
                            number = 15,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "content",
                            value = com.google.protobuf.compiler.CodeGeneratorResponse.File::content
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "generated_code_info",
                            number = 16,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.GeneratedCodeInfo.Companion),
                            jsonName = "generatedCodeInfo",
                            value = com.google.protobuf.compiler.CodeGeneratorResponse.File::generatedCodeInfo
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.compiler.CodeGeneratorResponse.File",
                    messageClass = com.google.protobuf.compiler.CodeGeneratorResponse.File::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForVersion")
public fun Version?.orDefault(): com.google.protobuf.compiler.Version = this ?: Version.defaultInstance

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

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorRequest")
public fun CodeGeneratorRequest?.orDefault(): com.google.protobuf.compiler.CodeGeneratorRequest = this ?: CodeGeneratorRequest.defaultInstance

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
    var compilerVersion: com.google.protobuf.compiler.Version? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileToGenerate = (fileToGenerate ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            2 -> parameter = _fieldValue as String
            3 -> compilerVersion = _fieldValue as com.google.protobuf.compiler.Version
            15 -> protoFile = (protoFile ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FileDescriptorProto> }
        }
    }

    return CodeGeneratorRequest(pbandk.ListWithSize.Builder.fixed(fileToGenerate), parameter, pbandk.ListWithSize.Builder.fixed(protoFile), compilerVersion, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponse")
public fun CodeGeneratorResponse?.orDefault(): com.google.protobuf.compiler.CodeGeneratorResponse = this ?: CodeGeneratorResponse.defaultInstance

private fun CodeGeneratorResponse.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse = (plus as? CodeGeneratorResponse)?.let {
    it.copy(
        error = plus.error ?: error,
        supportedFeatures = plus.supportedFeatures ?: supportedFeatures,
        file = file + plus.file,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse {
    var error: String? = null
    var supportedFeatures: Long? = null
    var file: pbandk.ListWithSize.Builder<com.google.protobuf.compiler.CodeGeneratorResponse.File>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = _fieldValue as String
            2 -> supportedFeatures = _fieldValue as Long
            15 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.compiler.CodeGeneratorResponse.File> }
        }
    }

    return CodeGeneratorResponse(error, supportedFeatures, pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponseFile")
public fun CodeGeneratorResponse.File?.orDefault(): com.google.protobuf.compiler.CodeGeneratorResponse.File = this ?: CodeGeneratorResponse.File.defaultInstance

private fun CodeGeneratorResponse.File.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse.File = (plus as? CodeGeneratorResponse.File)?.let {
    it.copy(
        name = plus.name ?: name,
        insertionPoint = plus.insertionPoint ?: insertionPoint,
        content = plus.content ?: content,
        generatedCodeInfo = generatedCodeInfo?.plus(plus.generatedCodeInfo) ?: plus.generatedCodeInfo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.File.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse.File {
    var name: String? = null
    var insertionPoint: String? = null
    var content: String? = null
    var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> insertionPoint = _fieldValue as String
            15 -> content = _fieldValue as String
            16 -> generatedCodeInfo = _fieldValue as pbandk.wkt.GeneratedCodeInfo
        }
    }

    return CodeGeneratorResponse.File(name, insertionPoint, content, generatedCodeInfo, unknownFields)
}

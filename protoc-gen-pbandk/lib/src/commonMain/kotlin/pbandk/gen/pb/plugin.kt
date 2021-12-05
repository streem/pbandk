@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.gen.pb

public sealed interface Version : pbandk.Message {
    public val major: Int?
    public val minor: Int?
    public val patch: Int?
    public val suffix: String?

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.Version
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version>

    public fun copy(
        major: Int? = this.major,
        minor: Int? = this.minor,
        patch: Int? = this.patch,
        suffix: String? = this.suffix,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.gen.pb.Version

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.Version> {
        @Deprecated("Use version { } instead")
        public operator fun invoke(
            major: Int? = null,
            minor: Int? = null,
            patch: Int? = null,
            suffix: String? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.Version = Version_Impl(
            major = major,
            minor = minor,
            patch = patch,
            suffix = suffix,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.gen.pb.Version by lazy { pbandk.gen.pb.Version() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.Version = pbandk.gen.pb.Version.decodeWithImpl(u)

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
                fullName = "google.protobuf.compiler.Version",
                messageClass = pbandk.gen.pb.Version::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableVersion : Version, pbandk.MutableMessage {
    public override var major: Int?
    public override var minor: Int?
    public override var patch: Int?
    public override var suffix: String?

    public fun toVersion(): Version

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.Version> {
        @Deprecated("Use version { } instead")
        public operator fun invoke(
            major: Int? = null,
            minor: Int? = null,
            patch: Int? = null,
            suffix: String? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableVersion = MutableVersion_Impl(
            major = major,
            minor = minor,
            patch = patch,
            suffix = suffix,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableVersion by lazy { MutableVersion() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.Version = pbandk.gen.pb.Version.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version> get() = pbandk.gen.pb.Version.descriptor
    }
}

public sealed interface CodeGeneratorRequest : pbandk.Message {
    public val fileToGenerate: List<String>
    public val parameter: String?
    public val protoFile: List<pbandk.wkt.FileDescriptorProto>
    public val compilerVersion: pbandk.gen.pb.Version?

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorRequest
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest>

    public fun copy(
        fileToGenerate: List<String> = this.fileToGenerate,
        parameter: String? = this.parameter,
        protoFile: List<pbandk.wkt.FileDescriptorProto> = this.protoFile,
        compilerVersion: pbandk.gen.pb.Version? = this.compilerVersion,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.gen.pb.CodeGeneratorRequest

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorRequest> {
        @Deprecated("Use codeGeneratorRequest { } instead")
        public operator fun invoke(
            fileToGenerate: List<String> = emptyList(),
            parameter: String? = null,
            protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
            compilerVersion: pbandk.gen.pb.Version? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.CodeGeneratorRequest = CodeGeneratorRequest_Impl(
            fileToGenerate = fileToGenerate,
            parameter = parameter,
            protoFile = protoFile,
            compilerVersion = compilerVersion,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.gen.pb.CodeGeneratorRequest by lazy { pbandk.gen.pb.CodeGeneratorRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.CodeGeneratorRequest = pbandk.gen.pb.CodeGeneratorRequest.decodeWithImpl(u)

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
                fullName = "google.protobuf.compiler.CodeGeneratorRequest",
                messageClass = pbandk.gen.pb.CodeGeneratorRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableCodeGeneratorRequest : CodeGeneratorRequest, pbandk.MutableMessage {
    public override var fileToGenerate: List<String>
    public override var parameter: String?
    public override var protoFile: List<pbandk.wkt.FileDescriptorProto>
    public override var compilerVersion: pbandk.gen.pb.Version?

    public fun toCodeGeneratorRequest(): CodeGeneratorRequest

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorRequest> {
        @Deprecated("Use codeGeneratorRequest { } instead")
        public operator fun invoke(
            fileToGenerate: List<String> = emptyList(),
            parameter: String? = null,
            protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
            compilerVersion: pbandk.gen.pb.Version? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableCodeGeneratorRequest = MutableCodeGeneratorRequest_Impl(
            fileToGenerate = fileToGenerate,
            parameter = parameter,
            protoFile = protoFile,
            compilerVersion = compilerVersion,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableCodeGeneratorRequest by lazy { MutableCodeGeneratorRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.CodeGeneratorRequest = pbandk.gen.pb.CodeGeneratorRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest> get() = pbandk.gen.pb.CodeGeneratorRequest.descriptor
    }
}

public sealed interface CodeGeneratorResponse : pbandk.Message {
    public val error: String?
    public val supportedFeatures: Long?
    public val file: List<pbandk.gen.pb.CodeGeneratorResponse.File>

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse>

    public fun copy(
        error: String? = this.error,
        supportedFeatures: Long? = this.supportedFeatures,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = this.file,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.gen.pb.CodeGeneratorResponse

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse> {
        @Deprecated("Use codeGeneratorResponse { } instead")
        public operator fun invoke(
            error: String? = null,
            supportedFeatures: Long? = null,
            file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.CodeGeneratorResponse = CodeGeneratorResponse_Impl(
            error = error,
            supportedFeatures = supportedFeatures,
            file = file,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.gen.pb.CodeGeneratorResponse by lazy { pbandk.gen.pb.CodeGeneratorResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.CodeGeneratorResponse = pbandk.gen.pb.CodeGeneratorResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse, *>>(3)
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
                        name = "supported_features",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "supportedFeatures",
                        value = pbandk.gen.pb.CodeGeneratorResponse::supportedFeatures
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
                fullName = "google.protobuf.compiler.CodeGeneratorResponse",
                messageClass = pbandk.gen.pb.CodeGeneratorResponse::class,
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

    public sealed interface File : pbandk.Message {
        public val name: String?
        public val insertionPoint: String?
        public val content: String?
        public val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?

        override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse.File
        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File>

        public fun copy(
            name: String? = this.name,
            insertionPoint: String? = this.insertionPoint,
            content: String? = this.content,
            generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = this.generatedCodeInfo,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.gen.pb.CodeGeneratorResponse.File

        public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse.File> {
            @Deprecated("Use file { } instead")
            public operator fun invoke(
                name: String? = null,
                insertionPoint: String? = null,
                content: String? = null,
                generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.gen.pb.CodeGeneratorResponse.File = CodeGeneratorResponse_File_Impl(
                name = name,
                insertionPoint = insertionPoint,
                content = content,
                generatedCodeInfo = generatedCodeInfo,
                unknownFields = unknownFields
            )

            public val defaultInstance: pbandk.gen.pb.CodeGeneratorResponse.File by lazy { pbandk.gen.pb.CodeGeneratorResponse.File() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.CodeGeneratorResponse.File = pbandk.gen.pb.CodeGeneratorResponse.File.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, *>>(4)
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
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "generated_code_info",
                            number = 16,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.GeneratedCodeInfo.Companion),
                            jsonName = "generatedCodeInfo",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::generatedCodeInfo
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.compiler.CodeGeneratorResponse.File",
                    messageClass = pbandk.gen.pb.CodeGeneratorResponse.File::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableFile : CodeGeneratorResponse.File, pbandk.MutableMessage {
        public override var name: String?
        public override var insertionPoint: String?
        public override var content: String?
        public override var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?

        public fun toFile(): CodeGeneratorResponse.File

        public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse.File> {
            @Deprecated("Use file { } instead")
            public operator fun invoke(
                name: String? = null,
                insertionPoint: String? = null,
                content: String? = null,
                generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableFile = CodeGeneratorResponse_MutableFile_Impl(
                name = name,
                insertionPoint = insertionPoint,
                content = content,
                generatedCodeInfo = generatedCodeInfo,
                unknownFields = unknownFields.toMutableMap()
            )

            public val defaultInstance: MutableFile by lazy { MutableFile() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.CodeGeneratorResponse.File = pbandk.gen.pb.CodeGeneratorResponse.File.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File> get() = pbandk.gen.pb.CodeGeneratorResponse.File.descriptor
        }
    }
}

public sealed interface MutableCodeGeneratorResponse : CodeGeneratorResponse, pbandk.MutableMessage {
    public override var error: String?
    public override var supportedFeatures: Long?
    public override var file: List<pbandk.gen.pb.CodeGeneratorResponse.File>

    public fun toCodeGeneratorResponse(): CodeGeneratorResponse

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse> {
        @Deprecated("Use codeGeneratorResponse { } instead")
        public operator fun invoke(
            error: String? = null,
            supportedFeatures: Long? = null,
            file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableCodeGeneratorResponse = MutableCodeGeneratorResponse_Impl(
            error = error,
            supportedFeatures = supportedFeatures,
            file = file,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableCodeGeneratorResponse by lazy { MutableCodeGeneratorResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.gen.pb.CodeGeneratorResponse = pbandk.gen.pb.CodeGeneratorResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse> get() = pbandk.gen.pb.CodeGeneratorResponse.descriptor
    }
}

public fun version(builderAction: MutableVersion.() -> Unit): Version {
    val builder = MutableVersion()
    builder.builderAction()
    return builder.toVersion()
}

@pbandk.Export
@pbandk.JsName("orDefaultForVersion")
public fun Version?.orDefault(): pbandk.gen.pb.Version = this ?: Version.defaultInstance

private class Version_Impl(
    override val major: Int?,
    override val minor: Int?,
    override val patch: Int?,
    override val suffix: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Version, pbandk.GeneratedMessage<Version>() {
    override val descriptor get() = Version.descriptor

    override fun copy(
        major: Int?,
        minor: Int?,
        patch: Int?,
        suffix: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Version_Impl(
        major = major,
        minor = minor,
        patch = patch,
        suffix = suffix,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Version)?.let {
        it.copy(
            major = other.major ?: major,
            minor = other.minor ?: minor,
            patch = other.patch ?: patch,
            suffix = other.suffix ?: suffix,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableVersion_Impl(
    override var major: Int?,
    override var minor: Int?,
    override var patch: Int?,
    override var suffix: String?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableVersion, pbandk.MutableGeneratedMessage<MutableVersion>() {
    override val descriptor get() = Version.descriptor

    override fun copy(
        major: Int?,
        minor: Int?,
        patch: Int?,
        suffix: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Version_Impl(
        major = major,
        minor = minor,
        patch = patch,
        suffix = suffix,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Version)?.let {
        it.copy(
            major = other.major ?: major,
            minor = other.minor ?: minor,
            patch = other.patch ?: patch,
            suffix = other.suffix ?: suffix,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toVersion() = Version_Impl(
        major = major,
        minor = minor,
        patch = patch,
        suffix = suffix,
        unknownFields = unknownFields
    )
}

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

public fun codeGeneratorRequest(builderAction: MutableCodeGeneratorRequest.() -> Unit): CodeGeneratorRequest {
    val builder = MutableCodeGeneratorRequest()
    builder.builderAction()
    return builder.toCodeGeneratorRequest()
}

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorRequest")
public fun CodeGeneratorRequest?.orDefault(): pbandk.gen.pb.CodeGeneratorRequest = this ?: CodeGeneratorRequest.defaultInstance

private class CodeGeneratorRequest_Impl(
    override val fileToGenerate: List<String>,
    override val parameter: String?,
    override val protoFile: List<pbandk.wkt.FileDescriptorProto>,
    override val compilerVersion: pbandk.gen.pb.Version?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : CodeGeneratorRequest, pbandk.GeneratedMessage<CodeGeneratorRequest>() {
    override val descriptor get() = CodeGeneratorRequest.descriptor

    override fun copy(
        fileToGenerate: List<String>,
        parameter: String?,
        protoFile: List<pbandk.wkt.FileDescriptorProto>,
        compilerVersion: pbandk.gen.pb.Version?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = CodeGeneratorRequest_Impl(
        fileToGenerate = fileToGenerate,
        parameter = parameter,
        protoFile = protoFile,
        compilerVersion = compilerVersion,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? CodeGeneratorRequest)?.let {
        it.copy(
            fileToGenerate = fileToGenerate + other.fileToGenerate,
            parameter = other.parameter ?: parameter,
            protoFile = protoFile + other.protoFile,
            compilerVersion = compilerVersion?.plus(other.compilerVersion) ?: other.compilerVersion,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableCodeGeneratorRequest_Impl(
    override var fileToGenerate: List<String>,
    override var parameter: String?,
    override var protoFile: List<pbandk.wkt.FileDescriptorProto>,
    override var compilerVersion: pbandk.gen.pb.Version?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableCodeGeneratorRequest, pbandk.MutableGeneratedMessage<MutableCodeGeneratorRequest>() {
    override val descriptor get() = CodeGeneratorRequest.descriptor

    override fun copy(
        fileToGenerate: List<String>,
        parameter: String?,
        protoFile: List<pbandk.wkt.FileDescriptorProto>,
        compilerVersion: pbandk.gen.pb.Version?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = CodeGeneratorRequest_Impl(
        fileToGenerate = fileToGenerate,
        parameter = parameter,
        protoFile = protoFile,
        compilerVersion = compilerVersion,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? CodeGeneratorRequest)?.let {
        it.copy(
            fileToGenerate = fileToGenerate + other.fileToGenerate,
            parameter = other.parameter ?: parameter,
            protoFile = protoFile + other.protoFile,
            compilerVersion = compilerVersion?.plus(other.compilerVersion) ?: other.compilerVersion,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toCodeGeneratorRequest() = CodeGeneratorRequest_Impl(
        fileToGenerate = fileToGenerate,
        parameter = parameter,
        protoFile = protoFile,
        compilerVersion = compilerVersion,
        unknownFields = unknownFields
    )
}

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

public fun codeGeneratorResponse(builderAction: MutableCodeGeneratorResponse.() -> Unit): CodeGeneratorResponse {
    val builder = MutableCodeGeneratorResponse()
    builder.builderAction()
    return builder.toCodeGeneratorResponse()
}

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponse")
public fun CodeGeneratorResponse?.orDefault(): pbandk.gen.pb.CodeGeneratorResponse = this ?: CodeGeneratorResponse.defaultInstance

private class CodeGeneratorResponse_Impl(
    override val error: String?,
    override val supportedFeatures: Long?,
    override val file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : CodeGeneratorResponse, pbandk.GeneratedMessage<CodeGeneratorResponse>() {
    override val descriptor get() = CodeGeneratorResponse.descriptor

    override fun copy(
        error: String?,
        supportedFeatures: Long?,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = CodeGeneratorResponse_Impl(
        error = error,
        supportedFeatures = supportedFeatures,
        file = file,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? CodeGeneratorResponse)?.let {
        it.copy(
            error = other.error ?: error,
            supportedFeatures = other.supportedFeatures ?: supportedFeatures,
            file = file + other.file,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableCodeGeneratorResponse_Impl(
    override var error: String?,
    override var supportedFeatures: Long?,
    override var file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableCodeGeneratorResponse, pbandk.MutableGeneratedMessage<MutableCodeGeneratorResponse>() {
    override val descriptor get() = CodeGeneratorResponse.descriptor

    override fun copy(
        error: String?,
        supportedFeatures: Long?,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = CodeGeneratorResponse_Impl(
        error = error,
        supportedFeatures = supportedFeatures,
        file = file,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? CodeGeneratorResponse)?.let {
        it.copy(
            error = other.error ?: error,
            supportedFeatures = other.supportedFeatures ?: supportedFeatures,
            file = file + other.file,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toCodeGeneratorResponse() = CodeGeneratorResponse_Impl(
        error = error,
        supportedFeatures = supportedFeatures,
        file = file,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse {
    var error: String? = null
    var supportedFeatures: Long? = null
    var file: pbandk.ListWithSize.Builder<pbandk.gen.pb.CodeGeneratorResponse.File>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = _fieldValue as String
            2 -> supportedFeatures = _fieldValue as Long
            15 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.gen.pb.CodeGeneratorResponse.File> }
        }
    }
    return CodeGeneratorResponse(error, supportedFeatures, pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

public fun CodeGeneratorResponse.Companion.file(builderAction: CodeGeneratorResponse.MutableFile.() -> Unit): CodeGeneratorResponse.File {
    val builder = CodeGeneratorResponse.MutableFile()
    builder.builderAction()
    return builder.toFile()
}

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponseFile")
public fun CodeGeneratorResponse.File?.orDefault(): pbandk.gen.pb.CodeGeneratorResponse.File = this ?: CodeGeneratorResponse.File.defaultInstance

private class CodeGeneratorResponse_File_Impl(
    override val name: String?,
    override val insertionPoint: String?,
    override val content: String?,
    override val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : CodeGeneratorResponse.File, pbandk.GeneratedMessage<CodeGeneratorResponse.File>() {
    override val descriptor get() = CodeGeneratorResponse.File.descriptor

    override fun copy(
        name: String?,
        insertionPoint: String?,
        content: String?,
        generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = CodeGeneratorResponse_File_Impl(
        name = name,
        insertionPoint = insertionPoint,
        content = content,
        generatedCodeInfo = generatedCodeInfo,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? CodeGeneratorResponse.File)?.let {
        it.copy(
            name = other.name ?: name,
            insertionPoint = other.insertionPoint ?: insertionPoint,
            content = other.content ?: content,
            generatedCodeInfo = generatedCodeInfo?.plus(other.generatedCodeInfo) ?: other.generatedCodeInfo,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class CodeGeneratorResponse_MutableFile_Impl(
    override var name: String?,
    override var insertionPoint: String?,
    override var content: String?,
    override var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : CodeGeneratorResponse.MutableFile, pbandk.MutableGeneratedMessage<CodeGeneratorResponse.MutableFile>() {
    override val descriptor get() = CodeGeneratorResponse.File.descriptor

    override fun copy(
        name: String?,
        insertionPoint: String?,
        content: String?,
        generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = CodeGeneratorResponse_File_Impl(
        name = name,
        insertionPoint = insertionPoint,
        content = content,
        generatedCodeInfo = generatedCodeInfo,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? CodeGeneratorResponse.File)?.let {
        it.copy(
            name = other.name ?: name,
            insertionPoint = other.insertionPoint ?: insertionPoint,
            content = other.content ?: content,
            generatedCodeInfo = generatedCodeInfo?.plus(other.generatedCodeInfo) ?: other.generatedCodeInfo,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFile() = CodeGeneratorResponse_File_Impl(
        name = name,
        insertionPoint = insertionPoint,
        content = content,
        generatedCodeInfo = generatedCodeInfo,
        unknownFields = unknownFields
    )
}

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

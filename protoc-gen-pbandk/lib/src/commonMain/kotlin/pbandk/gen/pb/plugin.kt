@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.gen.pb

public sealed interface Version : pbandk.Message {
    public val major: Int?
    public val minor: Int?
    public val patch: Int?
    public val suffix: String?

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.Version
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version>

    /**
     * The [MutableVersion] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit): pbandk.gen.pb.Version

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        major: Int? = this.major,
        minor: Int? = this.minor,
        patch: Int? = this.patch,
        suffix: String? = this.suffix,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.gen.pb.Version

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val major: pbandk.FieldDescriptor<pbandk.gen.pb.Version, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.Version::descriptor,
                messageMetadata = pbandk.gen.pb.Version.messageMetadata,
                name = "major",
                number = 1,
                valueType = pbandk.types.int32(),
                jsonName = "major",
                value = pbandk.gen.pb.Version::major,
                mutableValue = pbandk.gen.pb.MutableVersion::major,
            )
        public val minor: pbandk.FieldDescriptor<pbandk.gen.pb.Version, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.Version::descriptor,
                messageMetadata = pbandk.gen.pb.Version.messageMetadata,
                name = "minor",
                number = 2,
                valueType = pbandk.types.int32(),
                jsonName = "minor",
                value = pbandk.gen.pb.Version::minor,
                mutableValue = pbandk.gen.pb.MutableVersion::minor,
            )
        public val patch: pbandk.FieldDescriptor<pbandk.gen.pb.Version, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.Version::descriptor,
                messageMetadata = pbandk.gen.pb.Version.messageMetadata,
                name = "patch",
                number = 3,
                valueType = pbandk.types.int32(),
                jsonName = "patch",
                value = pbandk.gen.pb.Version::patch,
                mutableValue = pbandk.gen.pb.MutableVersion::patch,
            )
        public val suffix: pbandk.FieldDescriptor<pbandk.gen.pb.Version, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.Version::descriptor,
                messageMetadata = pbandk.gen.pb.Version.messageMetadata,
                name = "suffix",
                number = 4,
                valueType = pbandk.types.string(),
                jsonName = "suffix",
                value = pbandk.gen.pb.Version::suffix,
                mutableValue = pbandk.gen.pb.MutableVersion::suffix,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.Version>() {
        override val defaultInstance: pbandk.gen.pb.Version by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.gen.pb.Version {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.compiler.Version",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.gen.pb.Version::class,
                messageCompanion = this,
                builder = ::Version,
                fields = listOf(
                    pbandk.gen.pb.Version.FieldDescriptors.major,
                    pbandk.gen.pb.Version.FieldDescriptors.minor,
                    pbandk.gen.pb.Version.FieldDescriptors.patch,
                    pbandk.gen.pb.Version.FieldDescriptors.suffix,
                ),
            )
        }
    }
}

public sealed interface MutableVersion : pbandk.gen.pb.Version, pbandk.MutableMessage<pbandk.gen.pb.Version> {
    public override var major: Int?
    public override var minor: Int?
    public override var patch: Int?
    public override var suffix: String?
}

public sealed interface CodeGeneratorRequest : pbandk.Message {
    public val fileToGenerate: List<String>
    public val parameter: String?
    public val protoFile: List<pbandk.wkt.FileDescriptorProto>
    public val compilerVersion: pbandk.gen.pb.Version?

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorRequest
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest>

    /**
     * The [MutableCodeGeneratorRequest] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit): pbandk.gen.pb.CodeGeneratorRequest

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        fileToGenerate: List<String> = this.fileToGenerate,
        parameter: String? = this.parameter,
        protoFile: List<pbandk.wkt.FileDescriptorProto> = this.protoFile,
        compilerVersion: pbandk.gen.pb.Version? = this.compilerVersion,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.gen.pb.CodeGeneratorRequest

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val fileToGenerate: pbandk.FieldDescriptor.MutableValue<pbandk.gen.pb.CodeGeneratorRequest, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorRequest::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorRequest.messageMetadata,
                name = "file_to_generate",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "fileToGenerate",
                value = pbandk.gen.pb.CodeGeneratorRequest::fileToGenerate,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorRequest::fileToGenerate,
            )
        public val parameter: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorRequest, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorRequest::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorRequest.messageMetadata,
                name = "parameter",
                number = 2,
                valueType = pbandk.types.string(),
                jsonName = "parameter",
                value = pbandk.gen.pb.CodeGeneratorRequest::parameter,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorRequest::parameter,
            )
        public val compilerVersion: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorRequest, pbandk.gen.pb.Version?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorRequest::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorRequest.messageMetadata,
                name = "compiler_version",
                number = 3,
                valueType = pbandk.types.message(pbandk.gen.pb.Version),
                jsonName = "compilerVersion",
                value = pbandk.gen.pb.CodeGeneratorRequest::compilerVersion,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorRequest::compilerVersion,
            )
        public val protoFile: pbandk.FieldDescriptor.MutableValue<pbandk.gen.pb.CodeGeneratorRequest, List<pbandk.wkt.FileDescriptorProto>, MutableList<pbandk.wkt.FileDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorRequest::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorRequest.messageMetadata,
                name = "proto_file",
                number = 15,
                valueType = pbandk.types.message(pbandk.wkt.FileDescriptorProto),
                jsonName = "protoFile",
                value = pbandk.gen.pb.CodeGeneratorRequest::protoFile,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorRequest::protoFile,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorRequest>() {
        override val defaultInstance: pbandk.gen.pb.CodeGeneratorRequest by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.gen.pb.CodeGeneratorRequest {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.compiler.CodeGeneratorRequest",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.gen.pb.CodeGeneratorRequest::class,
                messageCompanion = this,
                builder = ::CodeGeneratorRequest,
                fields = listOf(
                    pbandk.gen.pb.CodeGeneratorRequest.FieldDescriptors.fileToGenerate,
                    pbandk.gen.pb.CodeGeneratorRequest.FieldDescriptors.parameter,
                    pbandk.gen.pb.CodeGeneratorRequest.FieldDescriptors.protoFile,
                    pbandk.gen.pb.CodeGeneratorRequest.FieldDescriptors.compilerVersion,
                ),
            )
        }
    }
}

public sealed interface MutableCodeGeneratorRequest : pbandk.gen.pb.CodeGeneratorRequest, pbandk.MutableMessage<pbandk.gen.pb.CodeGeneratorRequest> {
    public override val fileToGenerate: MutableList<String>
    public override var parameter: String?
    public override val protoFile: MutableList<pbandk.wkt.FileDescriptorProto>
    public override var compilerVersion: pbandk.gen.pb.Version?
}

public sealed interface CodeGeneratorResponse : pbandk.Message {
    public val error: String?
    public val supportedFeatures: Long?
    public val file: List<pbandk.gen.pb.CodeGeneratorResponse.File>

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse>

    /**
     * The [MutableCodeGeneratorResponse] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        error: String? = this.error,
        supportedFeatures: Long? = this.supportedFeatures,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = this.file,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.gen.pb.CodeGeneratorResponse

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val error: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.messageMetadata,
                name = "error",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "error",
                value = pbandk.gen.pb.CodeGeneratorResponse::error,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorResponse::error,
            )
        public val supportedFeatures: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.messageMetadata,
                name = "supported_features",
                number = 2,
                valueType = pbandk.types.uint64(),
                jsonName = "supportedFeatures",
                value = pbandk.gen.pb.CodeGeneratorResponse::supportedFeatures,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorResponse::supportedFeatures,
            )
        public val file: pbandk.FieldDescriptor.MutableValue<pbandk.gen.pb.CodeGeneratorResponse, List<pbandk.gen.pb.CodeGeneratorResponse.File>, MutableList<pbandk.gen.pb.CodeGeneratorResponse.File>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse::descriptor,
                messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.messageMetadata,
                name = "file",
                number = 15,
                valueType = pbandk.types.message(pbandk.gen.pb.CodeGeneratorResponse.File),
                jsonName = "file",
                value = pbandk.gen.pb.CodeGeneratorResponse::file,
                mutableValue = pbandk.gen.pb.MutableCodeGeneratorResponse::file,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse>() {
        override val defaultInstance: pbandk.gen.pb.CodeGeneratorResponse by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.gen.pb.CodeGeneratorResponse {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.compiler.CodeGeneratorResponse",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.gen.pb.CodeGeneratorResponse::class,
                messageCompanion = this,
                builder = ::CodeGeneratorResponse,
                fields = listOf(
                    pbandk.gen.pb.CodeGeneratorResponse.FieldDescriptors.error,
                    pbandk.gen.pb.CodeGeneratorResponse.FieldDescriptors.supportedFeatures,
                    pbandk.gen.pb.CodeGeneratorResponse.FieldDescriptors.file,
                ),
            )
        }

        @Deprecated(
            message = "Use CodeGeneratorResponse.File { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.gen.pb.CodeGeneratorResponse.File"],
                expression = "CodeGeneratorResponse.File {\nthis.name = name\nthis.insertionPoint = insertionPoint\nthis.content = content\nthis.generatedCodeInfo = generatedCodeInfo\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun File(
            name: String? = null,
            insertionPoint: String? = null,
            content: String? = null,
            generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.CodeGeneratorResponse.File = pbandk.gen.pb.CodeGeneratorResponse.File {
            this.name = name
            this.insertionPoint = insertionPoint
            this.content = content
            this.generatedCodeInfo = generatedCodeInfo
            this.unknownFields += unknownFields
        }
    }

    public sealed interface Feature : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.gen.pb.CodeGeneratorResponse.Feature>
            get() = pbandk.gen.pb.CodeGeneratorResponse.Feature.descriptor

        public object NONE : Feature, pbandk.gen.GeneratedEnumValue<pbandk.gen.pb.CodeGeneratorResponse.Feature>(
            value = 0,
            name = "FEATURE_NONE",
        )
        public object PROTO3_OPTIONAL : Feature, pbandk.gen.GeneratedEnumValue<pbandk.gen.pb.CodeGeneratorResponse.Feature>(
            value = 1,
            name = "FEATURE_PROTO3_OPTIONAL",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Feature, pbandk.gen.UnrecognizedEnumValue<pbandk.gen.pb.CodeGeneratorResponse.Feature>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.gen.pb.CodeGeneratorResponse.Feature> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.gen.pb.CodeGeneratorResponse.Feature> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.compiler.CodeGeneratorResponse.Feature",
                    enumClass = pbandk.gen.pb.CodeGeneratorResponse.Feature::class,
                    enumCompanion = this,
                )
            public val values: List<CodeGeneratorResponse.Feature> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(NONE, PROTO3_OPTIONAL)
            }

            override fun fromValue(value: Int): pbandk.gen.pb.CodeGeneratorResponse.Feature =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.gen.pb.CodeGeneratorResponse.Feature =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface File : pbandk.Message {
        public val name: String?
        public val insertionPoint: String?
        public val content: String?
        public val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?

        override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse.File
        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File>

        /**
         * The [CodeGeneratorResponse.MutableFile] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse.File

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            name: String? = this.name,
            insertionPoint: String? = this.insertionPoint,
            content: String? = this.content,
            generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = this.generatedCodeInfo,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.gen.pb.CodeGeneratorResponse.File

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val name: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse.File::descriptor,
                    messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.File.messageMetadata,
                    name = "name",
                    number = 1,
                    valueType = pbandk.types.string(),
                    jsonName = "name",
                    value = pbandk.gen.pb.CodeGeneratorResponse.File::name,
                    mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::name,
                )
            public val insertionPoint: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse.File::descriptor,
                    messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.File.messageMetadata,
                    name = "insertion_point",
                    number = 2,
                    valueType = pbandk.types.string(),
                    jsonName = "insertionPoint",
                    value = pbandk.gen.pb.CodeGeneratorResponse.File::insertionPoint,
                    mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::insertionPoint,
                )
            public val content: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse.File::descriptor,
                    messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.File.messageMetadata,
                    name = "content",
                    number = 15,
                    valueType = pbandk.types.string(),
                    jsonName = "content",
                    value = pbandk.gen.pb.CodeGeneratorResponse.File::content,
                    mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::content,
                )
            public val generatedCodeInfo: pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, pbandk.wkt.GeneratedCodeInfo?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.gen.pb.CodeGeneratorResponse.File::descriptor,
                    messageMetadata = pbandk.gen.pb.CodeGeneratorResponse.File.messageMetadata,
                    name = "generated_code_info",
                    number = 16,
                    valueType = pbandk.types.message(pbandk.wkt.GeneratedCodeInfo),
                    jsonName = "generatedCodeInfo",
                    value = pbandk.gen.pb.CodeGeneratorResponse.File::generatedCodeInfo,
                    mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::generatedCodeInfo,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse.File>() {
            override val defaultInstance: pbandk.gen.pb.CodeGeneratorResponse.File by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.gen.pb.CodeGeneratorResponse.File {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.compiler.CodeGeneratorResponse.File",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.gen.pb.CodeGeneratorResponse.File::class,
                    messageCompanion = this,
                    builder = CodeGeneratorResponse.Companion::File,
                    fields = listOf(
                        pbandk.gen.pb.CodeGeneratorResponse.File.FieldDescriptors.name,
                        pbandk.gen.pb.CodeGeneratorResponse.File.FieldDescriptors.insertionPoint,
                        pbandk.gen.pb.CodeGeneratorResponse.File.FieldDescriptors.content,
                        pbandk.gen.pb.CodeGeneratorResponse.File.FieldDescriptors.generatedCodeInfo,
                    ),
                )
            }
        }
    }

    public sealed interface MutableFile : pbandk.gen.pb.CodeGeneratorResponse.File, pbandk.MutableMessage<pbandk.gen.pb.CodeGeneratorResponse.File> {
        public override var name: String?
        public override var insertionPoint: String?
        public override var content: String?
        public override var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?
    }
}

public sealed interface MutableCodeGeneratorResponse : pbandk.gen.pb.CodeGeneratorResponse, pbandk.MutableMessage<pbandk.gen.pb.CodeGeneratorResponse> {
    public override var error: String?
    public override var supportedFeatures: Long?
    public override val file: MutableList<pbandk.gen.pb.CodeGeneratorResponse.File>
}

@Deprecated(
    message = "Use Version { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.gen.pb.Version"],
        expression = "Version {\nthis.major = major\nthis.minor = minor\nthis.patch = patch\nthis.suffix = suffix\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Version(
    major: Int? = null,
    minor: Int? = null,
    patch: Int? = null,
    suffix: String? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.gen.pb.Version = pbandk.gen.pb.Version {
    this.major = major
    this.minor = minor
    this.patch = patch
    this.suffix = suffix
    this.unknownFields += unknownFields
}

/**
 * The [MutableVersion] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildVersion")
public fun Version(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit): pbandk.gen.pb.Version =
    pbandk.gen.pb.MutableVersion_Impl(
        major = null,
        minor = null,
        patch = null,
        suffix = null,
    ).also(builderAction).toVersion()

@pbandk.Export
@pbandk.JsName("orDefaultForVersion")
public fun Version?.orDefault(): pbandk.gen.pb.Version = this ?: pbandk.gen.pb.Version.defaultInstance

private class Version_Impl(
    override val major: Int?,
    override val minor: Int?,
    override val patch: Int?,
    override val suffix: String?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.Version, pbandk.gen.GeneratedMessage<pbandk.gen.pb.Version>(unknownFields) {
    override val descriptor get() = pbandk.gen.pb.Version.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        major: Int?,
        minor: Int?,
        patch: Int?,
        suffix: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.gen.pb.Version {
        this.major = major
        this.minor = minor
        this.patch = patch
        this.suffix = suffix
        this.unknownFields += unknownFields
    }
}

private class MutableVersion_Impl(
    override var major: Int?,
    override var minor: Int?,
    override var patch: Int?,
    override var suffix: String?,
) : pbandk.gen.pb.MutableVersion, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.Version>() {
    override val descriptor get() = pbandk.gen.pb.Version.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        major: Int?,
        minor: Int?,
        patch: Int?,
        suffix: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toVersion() = Version_Impl(
        major = major,
        minor = minor,
        patch = patch,
        suffix = suffix,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use CodeGeneratorRequest { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.gen.pb.CodeGeneratorRequest"],
        expression = "CodeGeneratorRequest {\nthis.fileToGenerate += fileToGenerate\nthis.parameter = parameter\nthis.protoFile += protoFile\nthis.compilerVersion = compilerVersion\nthis.unknownFields += unknownFields\n}",
    )
)
public fun CodeGeneratorRequest(
    fileToGenerate: List<String> = emptyList(),
    parameter: String? = null,
    protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    compilerVersion: pbandk.gen.pb.Version? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.gen.pb.CodeGeneratorRequest = pbandk.gen.pb.CodeGeneratorRequest {
    this.fileToGenerate += fileToGenerate
    this.parameter = parameter
    this.protoFile += protoFile
    this.compilerVersion = compilerVersion
    this.unknownFields += unknownFields
}

/**
 * The [MutableCodeGeneratorRequest] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildCodeGeneratorRequest")
public fun CodeGeneratorRequest(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit): pbandk.gen.pb.CodeGeneratorRequest =
    pbandk.gen.pb.MutableCodeGeneratorRequest_Impl(
        fileToGenerate = pbandk.gen.MutableListField(pbandk.gen.pb.CodeGeneratorRequest.FieldDescriptors.fileToGenerate),
        parameter = null,
        protoFile = pbandk.gen.MutableListField(pbandk.gen.pb.CodeGeneratorRequest.FieldDescriptors.protoFile),
        compilerVersion = null,
    ).also(builderAction).toCodeGeneratorRequest()

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorRequest")
public fun CodeGeneratorRequest?.orDefault(): pbandk.gen.pb.CodeGeneratorRequest = this ?: pbandk.gen.pb.CodeGeneratorRequest.defaultInstance

private class CodeGeneratorRequest_Impl(
    override val fileToGenerate: pbandk.gen.ListField<String>,
    override val parameter: String?,
    override val protoFile: pbandk.gen.ListField<pbandk.wkt.FileDescriptorProto>,
    override val compilerVersion: pbandk.gen.pb.Version?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorRequest, pbandk.gen.GeneratedMessage<pbandk.gen.pb.CodeGeneratorRequest>(unknownFields) {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorRequest.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileToGenerate: List<String>,
        parameter: String?,
        protoFile: List<pbandk.wkt.FileDescriptorProto>,
        compilerVersion: pbandk.gen.pb.Version?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.gen.pb.CodeGeneratorRequest {
        this.fileToGenerate += fileToGenerate
        this.parameter = parameter
        this.protoFile += protoFile
        this.compilerVersion = compilerVersion
        this.unknownFields += unknownFields
    }
}

private class MutableCodeGeneratorRequest_Impl(
    override val fileToGenerate: pbandk.gen.MutableListField<String>,
    override var parameter: String?,
    override val protoFile: pbandk.gen.MutableListField<pbandk.wkt.FileDescriptorProto>,
    override var compilerVersion: pbandk.gen.pb.Version?,
) : pbandk.gen.pb.MutableCodeGeneratorRequest, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.CodeGeneratorRequest>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorRequest.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileToGenerate: List<String>,
        parameter: String?,
        protoFile: List<pbandk.wkt.FileDescriptorProto>,
        compilerVersion: pbandk.gen.pb.Version?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toCodeGeneratorRequest() = CodeGeneratorRequest_Impl(
        fileToGenerate = fileToGenerate.toListField(),
        parameter = parameter,
        protoFile = protoFile.toListField(),
        compilerVersion = compilerVersion,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use CodeGeneratorResponse { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.gen.pb.CodeGeneratorResponse"],
        expression = "CodeGeneratorResponse {\nthis.error = error\nthis.supportedFeatures = supportedFeatures\nthis.file += file\nthis.unknownFields += unknownFields\n}",
    )
)
public fun CodeGeneratorResponse(
    error: String? = null,
    supportedFeatures: Long? = null,
    file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.gen.pb.CodeGeneratorResponse = pbandk.gen.pb.CodeGeneratorResponse {
    this.error = error
    this.supportedFeatures = supportedFeatures
    this.file += file
    this.unknownFields += unknownFields
}

/**
 * The [MutableCodeGeneratorResponse] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildCodeGeneratorResponse")
public fun CodeGeneratorResponse(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse =
    pbandk.gen.pb.MutableCodeGeneratorResponse_Impl(
        error = null,
        supportedFeatures = null,
        file = pbandk.gen.MutableListField(pbandk.gen.pb.CodeGeneratorResponse.FieldDescriptors.file),
    ).also(builderAction).toCodeGeneratorResponse()

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponse")
public fun CodeGeneratorResponse?.orDefault(): pbandk.gen.pb.CodeGeneratorResponse = this ?: pbandk.gen.pb.CodeGeneratorResponse.defaultInstance

private class CodeGeneratorResponse_Impl(
    override val error: String?,
    override val supportedFeatures: Long?,
    override val file: pbandk.gen.ListField<pbandk.gen.pb.CodeGeneratorResponse.File>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorResponse, pbandk.gen.GeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse>(unknownFields) {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        error: String?,
        supportedFeatures: Long?,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.gen.pb.CodeGeneratorResponse {
        this.error = error
        this.supportedFeatures = supportedFeatures
        this.file += file
        this.unknownFields += unknownFields
    }
}

private class MutableCodeGeneratorResponse_Impl(
    override var error: String?,
    override var supportedFeatures: Long?,
    override val file: pbandk.gen.MutableListField<pbandk.gen.pb.CodeGeneratorResponse.File>,
) : pbandk.gen.pb.MutableCodeGeneratorResponse, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        error: String?,
        supportedFeatures: Long?,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toCodeGeneratorResponse() = CodeGeneratorResponse_Impl(
        error = error,
        supportedFeatures = supportedFeatures,
        file = file.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [CodeGeneratorResponse.MutableFile] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildCodeGeneratorResponseFile")
public fun CodeGeneratorResponse.Companion.File(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse.File =
    pbandk.gen.pb.CodeGeneratorResponse_MutableFile_Impl(
        name = null,
        insertionPoint = null,
        content = null,
        generatedCodeInfo = null,
    ).also(builderAction).toFile()

/**
 * The [CodeGeneratorResponse.MutableFile] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableCodeGeneratorResponse.File(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse.File =
    pbandk.gen.pb.CodeGeneratorResponse.File(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponseFile")
public fun CodeGeneratorResponse.File?.orDefault(): pbandk.gen.pb.CodeGeneratorResponse.File = this ?: pbandk.gen.pb.CodeGeneratorResponse.File.defaultInstance

private class CodeGeneratorResponse_File_Impl(
    override val name: String?,
    override val insertionPoint: String?,
    override val content: String?,
    override val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorResponse.File, pbandk.gen.GeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse.File>(unknownFields) {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.File.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        insertionPoint: String?,
        content: String?,
        generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.gen.pb.CodeGeneratorResponse.File {
        this.name = name
        this.insertionPoint = insertionPoint
        this.content = content
        this.generatedCodeInfo = generatedCodeInfo
        this.unknownFields += unknownFields
    }
}

private class CodeGeneratorResponse_MutableFile_Impl(
    override var name: String?,
    override var insertionPoint: String?,
    override var content: String?,
    override var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
) : pbandk.gen.pb.CodeGeneratorResponse.MutableFile, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse.File>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.File.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        insertionPoint: String?,
        content: String?,
        generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFile() = CodeGeneratorResponse_File_Impl(
        name = name,
        insertionPoint = insertionPoint,
        content = content,
        generatedCodeInfo = generatedCodeInfo,
        unknownFields = unknownFields.toMap()
    )
}

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

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.Version> {
        public val defaultInstance: pbandk.gen.pb.Version by lazy { pbandk.gen.pb.Version {} }

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
                        value = pbandk.gen.pb.Version::major,
                        mutableValue = pbandk.gen.pb.MutableVersion::major,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "minor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "minor",
                        value = pbandk.gen.pb.Version::minor,
                        mutableValue = pbandk.gen.pb.MutableVersion::minor,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "patch",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "patch",
                        value = pbandk.gen.pb.Version::patch,
                        mutableValue = pbandk.gen.pb.MutableVersion::patch,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.gen.pb.Version::suffix,
                        mutableValue = pbandk.gen.pb.MutableVersion::suffix,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.compiler.Version",
                messageClass = pbandk.gen.pb.Version::class,
                messageCompanion = this,
                builder = ::Version,
                fields = fieldsList
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

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorRequest> {
        public val defaultInstance: pbandk.gen.pb.CodeGeneratorRequest by lazy { pbandk.gen.pb.CodeGeneratorRequest {} }

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
                        value = pbandk.gen.pb.CodeGeneratorRequest::fileToGenerate,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parameter",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "parameter",
                        value = pbandk.gen.pb.CodeGeneratorRequest::parameter,
                        mutableValue = pbandk.gen.pb.MutableCodeGeneratorRequest::parameter,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "compiler_version",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.Version.Companion),
                        jsonName = "compilerVersion",
                        value = pbandk.gen.pb.CodeGeneratorRequest::compilerVersion,
                        mutableValue = pbandk.gen.pb.MutableCodeGeneratorRequest::compilerVersion,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto_file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                        jsonName = "protoFile",
                        value = pbandk.gen.pb.CodeGeneratorRequest::protoFile,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.compiler.CodeGeneratorRequest",
                messageClass = pbandk.gen.pb.CodeGeneratorRequest::class,
                messageCompanion = this,
                builder = ::CodeGeneratorRequest,
                fields = fieldsList
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

    public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse> {
        public val defaultInstance: pbandk.gen.pb.CodeGeneratorResponse by lazy { pbandk.gen.pb.CodeGeneratorResponse {} }

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
                        value = pbandk.gen.pb.CodeGeneratorResponse::error,
                        mutableValue = pbandk.gen.pb.MutableCodeGeneratorResponse::error,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "supported_features",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "supportedFeatures",
                        value = pbandk.gen.pb.CodeGeneratorResponse::supportedFeatures,
                        mutableValue = pbandk.gen.pb.MutableCodeGeneratorResponse::supportedFeatures,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.gen.pb.CodeGeneratorResponse.File>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.CodeGeneratorResponse.File.Companion)),
                        jsonName = "file",
                        value = pbandk.gen.pb.CodeGeneratorResponse::file,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.compiler.CodeGeneratorResponse",
                messageClass = pbandk.gen.pb.CodeGeneratorResponse::class,
                messageCompanion = this,
                builder = ::CodeGeneratorResponse,
                fields = fieldsList
            )
        }
    }

    public sealed class Feature(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.gen.pb.CodeGeneratorResponse.Feature && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "CodeGeneratorResponse.Feature.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object NONE : Feature(0, "FEATURE_NONE")
        public object PROTO3_OPTIONAL : Feature(1, "FEATURE_PROTO3_OPTIONAL")
        public class UNRECOGNIZED(value: Int) : Feature(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.gen.pb.CodeGeneratorResponse.Feature> {
            public val values: List<CodeGeneratorResponse.Feature> by lazy { listOf(NONE, PROTO3_OPTIONAL) }
            override fun fromValue(value: Int): pbandk.gen.pb.CodeGeneratorResponse.Feature = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.gen.pb.CodeGeneratorResponse.Feature = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Feature with name: $name")
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
         * The [MutableFile] passed as a receiver to the [builderAction] is valid only inside that function.
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

        public companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse.File> {
            public val defaultInstance: pbandk.gen.pb.CodeGeneratorResponse.File by lazy { pbandk.gen.pb.CodeGeneratorResponse.File {} }

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
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::name,
                            mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::name,
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "insertion_point",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "insertionPoint",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::insertionPoint,
                            mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::insertionPoint,
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "content",
                            number = 15,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "content",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::content,
                            mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::content,
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "generated_code_info",
                            number = 16,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.GeneratedCodeInfo.Companion),
                            jsonName = "generatedCodeInfo",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::generatedCodeInfo,
                            mutableValue = pbandk.gen.pb.CodeGeneratorResponse.MutableFile::generatedCodeInfo,
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.compiler.CodeGeneratorResponse.File",
                    messageClass = pbandk.gen.pb.CodeGeneratorResponse.File::class,
                    messageCompanion = this,
                    builder = CodeGeneratorResponse.Companion::File,
                    fields = fieldsList
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
public fun Version(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit): pbandk.gen.pb.Version = pbandk.gen.pb.MutableVersion_Impl(
    major = null,
    minor = null,
    patch = null,
    suffix = null,
    unknownFields = mutableMapOf()
).also(builderAction).toVersion()

@pbandk.Export
@pbandk.JsName("orDefaultForVersion")
public fun Version?.orDefault(): pbandk.gen.pb.Version = this ?: pbandk.gen.pb.Version.defaultInstance

private class Version_Impl(
    override val major: Int?,
    override val minor: Int?,
    override val patch: Int?,
    override val suffix: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.Version, pbandk.gen.GeneratedMessage<pbandk.gen.pb.Version>() {
    override val descriptor get() = pbandk.gen.pb.Version.descriptor

    override fun copy(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit) = pbandk.gen.pb.Version {
        this.major = this@Version_Impl.major
        this.minor = this@Version_Impl.minor
        this.patch = this@Version_Impl.patch
        this.suffix = this@Version_Impl.suffix
        this.unknownFields += this@Version_Impl.unknownFields
        this.builderAction()
    }

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

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableVersion_Impl(
    override var major: Int?,
    override var minor: Int?,
    override var patch: Int?,
    override var suffix: String?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.gen.pb.MutableVersion, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.Version>() {
    override val descriptor get() = pbandk.gen.pb.Version.descriptor

    override fun copy(builderAction: pbandk.gen.pb.MutableVersion.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        major: Int?,
        minor: Int?,
        patch: Int?,
        suffix: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toVersion() = Version_Impl(
        major = major,
        minor = minor,
        patch = patch,
        suffix = suffix,
        unknownFields = unknownFields.toMap()
    )
}

private fun Version.protoMergeImpl(other: pbandk.Message?): pbandk.gen.pb.Version {
    if (other !is pbandk.gen.pb.Version) return this

    return copy {
        major = other.major ?: major
        minor = other.minor ?: minor
        patch = other.patch ?: patch
        suffix = other.suffix ?: suffix
        unknownFields += other.unknownFields
    }
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
public fun CodeGeneratorRequest(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit): pbandk.gen.pb.CodeGeneratorRequest = pbandk.gen.pb.MutableCodeGeneratorRequest_Impl(
    fileToGenerate = mutableListOf(),
    parameter = null,
    protoFile = mutableListOf(),
    compilerVersion = null,
    unknownFields = mutableMapOf()
).also(builderAction).toCodeGeneratorRequest()

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorRequest")
public fun CodeGeneratorRequest?.orDefault(): pbandk.gen.pb.CodeGeneratorRequest = this ?: pbandk.gen.pb.CodeGeneratorRequest.defaultInstance

private class CodeGeneratorRequest_Impl(
    override val fileToGenerate: List<String>,
    override val parameter: String?,
    override val protoFile: List<pbandk.wkt.FileDescriptorProto>,
    override val compilerVersion: pbandk.gen.pb.Version?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorRequest, pbandk.gen.GeneratedMessage<pbandk.gen.pb.CodeGeneratorRequest>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorRequest.descriptor

    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit) = pbandk.gen.pb.CodeGeneratorRequest {
        this.fileToGenerate += this@CodeGeneratorRequest_Impl.fileToGenerate
        this.parameter = this@CodeGeneratorRequest_Impl.parameter
        this.protoFile += this@CodeGeneratorRequest_Impl.protoFile
        this.compilerVersion = this@CodeGeneratorRequest_Impl.compilerVersion
        this.unknownFields += this@CodeGeneratorRequest_Impl.unknownFields
        this.builderAction()
    }

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

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableCodeGeneratorRequest_Impl(
    override val fileToGenerate: MutableList<String>,
    override var parameter: String?,
    override val protoFile: MutableList<pbandk.wkt.FileDescriptorProto>,
    override var compilerVersion: pbandk.gen.pb.Version?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.gen.pb.MutableCodeGeneratorRequest, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.CodeGeneratorRequest>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorRequest.descriptor

    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorRequest.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileToGenerate: List<String>,
        parameter: String?,
        protoFile: List<pbandk.wkt.FileDescriptorProto>,
        compilerVersion: pbandk.gen.pb.Version?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toCodeGeneratorRequest() = CodeGeneratorRequest_Impl(
        fileToGenerate = fileToGenerate.toList(),
        parameter = parameter,
        protoFile = protoFile.toList(),
        compilerVersion = compilerVersion,
        unknownFields = unknownFields.toMap()
    )
}

private fun CodeGeneratorRequest.protoMergeImpl(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorRequest {
    if (other !is pbandk.gen.pb.CodeGeneratorRequest) return this

    return copy {
        fileToGenerate += other.fileToGenerate
        parameter = other.parameter ?: parameter
        protoFile += other.protoFile
        compilerVersion = compilerVersion?.plus(other.compilerVersion) ?: other.compilerVersion
        unknownFields += other.unknownFields
    }
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
public fun CodeGeneratorResponse(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse = pbandk.gen.pb.MutableCodeGeneratorResponse_Impl(
    error = null,
    supportedFeatures = null,
    file = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toCodeGeneratorResponse()

@pbandk.Export
@pbandk.JsName("orDefaultForCodeGeneratorResponse")
public fun CodeGeneratorResponse?.orDefault(): pbandk.gen.pb.CodeGeneratorResponse = this ?: pbandk.gen.pb.CodeGeneratorResponse.defaultInstance

private class CodeGeneratorResponse_Impl(
    override val error: String?,
    override val supportedFeatures: Long?,
    override val file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorResponse, pbandk.gen.GeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.descriptor

    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit) = pbandk.gen.pb.CodeGeneratorResponse {
        this.error = this@CodeGeneratorResponse_Impl.error
        this.supportedFeatures = this@CodeGeneratorResponse_Impl.supportedFeatures
        this.file += this@CodeGeneratorResponse_Impl.file
        this.unknownFields += this@CodeGeneratorResponse_Impl.unknownFields
        this.builderAction()
    }

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

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableCodeGeneratorResponse_Impl(
    override var error: String?,
    override var supportedFeatures: Long?,
    override val file: MutableList<pbandk.gen.pb.CodeGeneratorResponse.File>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.gen.pb.MutableCodeGeneratorResponse, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.descriptor

    override fun copy(builderAction: pbandk.gen.pb.MutableCodeGeneratorResponse.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        error: String?,
        supportedFeatures: Long?,
        file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toCodeGeneratorResponse() = CodeGeneratorResponse_Impl(
        error = error,
        supportedFeatures = supportedFeatures,
        file = file.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun CodeGeneratorResponse.protoMergeImpl(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse {
    if (other !is pbandk.gen.pb.CodeGeneratorResponse) return this

    return copy {
        error = other.error ?: error
        supportedFeatures = other.supportedFeatures ?: supportedFeatures
        file += other.file
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use CodeGeneratorResponse.File { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.gen.pb.CodeGeneratorResponse.File"],
        expression = "CodeGeneratorResponse.File {\nthis.name = name\nthis.insertionPoint = insertionPoint\nthis.content = content\nthis.generatedCodeInfo = generatedCodeInfo\nthis.unknownFields += unknownFields\n}",
    )
)
public fun CodeGeneratorResponse.Companion.File(
    name: String? = null,
    insertionPoint: String? = null,
    content: String? = null,
    generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.gen.pb.CodeGeneratorResponse.File = pbandk.gen.pb.CodeGeneratorResponse.Companion.File {
    this.name = name
    this.insertionPoint = insertionPoint
    this.content = content
    this.generatedCodeInfo = generatedCodeInfo
    this.unknownFields += unknownFields
}

/**
 * The [MutableFile] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildCodeGeneratorResponseFile")
public fun CodeGeneratorResponse.Companion.File(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit): pbandk.gen.pb.CodeGeneratorResponse.File = pbandk.gen.pb.CodeGeneratorResponse_MutableFile_Impl(
    name = null,
    insertionPoint = null,
    content = null,
    generatedCodeInfo = null,
    unknownFields = mutableMapOf()
).also(builderAction).toFile()

/**
 * The [MutableFile] passed as a receiver to the [builderAction] is valid only inside that function.
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
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorResponse.File, pbandk.gen.GeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse.File>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.File.descriptor

    override fun copy(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit) = pbandk.gen.pb.CodeGeneratorResponse.File {
        this.name = this@CodeGeneratorResponse_File_Impl.name
        this.insertionPoint = this@CodeGeneratorResponse_File_Impl.insertionPoint
        this.content = this@CodeGeneratorResponse_File_Impl.content
        this.generatedCodeInfo = this@CodeGeneratorResponse_File_Impl.generatedCodeInfo
        this.unknownFields += this@CodeGeneratorResponse_File_Impl.unknownFields
        this.builderAction()
    }

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

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class CodeGeneratorResponse_MutableFile_Impl(
    override var name: String?,
    override var insertionPoint: String?,
    override var content: String?,
    override var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.gen.pb.CodeGeneratorResponse.MutableFile, pbandk.gen.MutableGeneratedMessage<pbandk.gen.pb.CodeGeneratorResponse.File>() {
    override val descriptor get() = pbandk.gen.pb.CodeGeneratorResponse.File.descriptor

    override fun copy(builderAction: pbandk.gen.pb.CodeGeneratorResponse.MutableFile.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        insertionPoint: String?,
        content: String?,
        generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFile() = CodeGeneratorResponse_File_Impl(
        name = name,
        insertionPoint = insertionPoint,
        content = content,
        generatedCodeInfo = generatedCodeInfo,
        unknownFields = unknownFields.toMap()
    )
}

private fun CodeGeneratorResponse.File.protoMergeImpl(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse.File {
    if (other !is pbandk.gen.pb.CodeGeneratorResponse.File) return this

    return copy {
        name = other.name ?: name
        insertionPoint = other.insertionPoint ?: insertionPoint
        content = other.content ?: content
        generatedCodeInfo = generatedCodeInfo?.plus(other.generatedCodeInfo) ?: other.generatedCodeInfo
        unknownFields += other.unknownFields
    }
}

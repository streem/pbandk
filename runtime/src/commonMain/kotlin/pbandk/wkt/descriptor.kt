@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Edition : pbandk.Message.Enum {
    override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Edition>
        get() = pbandk.wkt.Edition.descriptor

    public object UNKNOWN : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 0,
        name = "EDITION_UNKNOWN",
    )
    public object LEGACY : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 900,
        name = "EDITION_LEGACY",
    )
    public object PROTO2 : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 998,
        name = "EDITION_PROTO2",
    )
    public object PROTO3 : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 999,
        name = "EDITION_PROTO3",
    )
    public object EDITION_2023 : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 1000,
        name = "EDITION_2023",
    )
    public object EDITION_2024 : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 1001,
        name = "EDITION_2024",
    )
    public object EDITION_1_TEST_ONLY : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 1,
        name = "EDITION_1_TEST_ONLY",
    )
    public object EDITION_2_TEST_ONLY : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 2,
        name = "EDITION_2_TEST_ONLY",
    )
    public object EDITION_99997_TEST_ONLY : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 99997,
        name = "EDITION_99997_TEST_ONLY",
    )
    public object EDITION_99998_TEST_ONLY : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 99998,
        name = "EDITION_99998_TEST_ONLY",
    )
    public object EDITION_99999_TEST_ONLY : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 99999,
        name = "EDITION_99999_TEST_ONLY",
    )
    public object MAX : Edition, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Edition>(
        value = 2147483647,
        name = "EDITION_MAX",
    )
    public class UNRECOGNIZED(value: Int? = null, name: String? = null)
        : Edition, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.Edition>(value, name)

    public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Edition> {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Edition> =
            pbandk.EnumDescriptor.of(
                fullName = "google.protobuf.Edition",
                enumClass = pbandk.wkt.Edition::class,
                enumCompanion = this,
            )
        public val values: List<Edition> by lazy(LazyThreadSafetyMode.PUBLICATION) {
            listOf(
                UNKNOWN, LEGACY, PROTO2, PROTO3, EDITION_2023,
                EDITION_2024, EDITION_1_TEST_ONLY, EDITION_2_TEST_ONLY, EDITION_99997_TEST_ONLY, EDITION_99998_TEST_ONLY,
                EDITION_99999_TEST_ONLY, MAX,
            )
        }

        override fun fromValue(value: Int): pbandk.wkt.Edition =
            values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

        override fun fromName(name: String): pbandk.wkt.Edition =
            values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
    }
}

public sealed interface FileDescriptorSet : pbandk.Message {
    public val file: List<pbandk.wkt.FileDescriptorProto>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileDescriptorSet
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet>

    /**
     * The [MutableFileDescriptorSet] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit): pbandk.wkt.FileDescriptorSet

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        file: List<pbandk.wkt.FileDescriptorProto> = this.file,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FileDescriptorSet

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val file: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorSet, List<pbandk.wkt.FileDescriptorProto>, MutableList<pbandk.wkt.FileDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorSet::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorSet.messageMetadata,
                name = "file",
                number = 1,
                valueType = pbandk.types.message(pbandk.wkt.FileDescriptorProto),
                jsonName = "file",
                value = pbandk.wkt.FileDescriptorSet::file,
                mutableValue = pbandk.wkt.MutableFileDescriptorSet::file,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorSet>() {
        override val defaultInstance: pbandk.wkt.FileDescriptorSet by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FileDescriptorSet {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FileDescriptorSet",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FileDescriptorSet::class,
                messageCompanion = this,
                builder = ::FileDescriptorSet,
                fields = listOf(
                    pbandk.wkt.FileDescriptorSet.FieldDescriptors.file,
                ),
            )
        }
    }
}

public sealed interface MutableFileDescriptorSet : pbandk.wkt.FileDescriptorSet, pbandk.MutableMessage<pbandk.wkt.FileDescriptorSet> {
    public override val file: MutableList<pbandk.wkt.FileDescriptorProto>
}

public sealed interface FileDescriptorProto : pbandk.Message {
    public val name: String?
    public val `package`: String?
    public val dependency: List<String>
    public val publicDependency: List<Int>
    public val weakDependency: List<Int>
    public val messageType: List<pbandk.wkt.DescriptorProto>
    public val enumType: List<pbandk.wkt.EnumDescriptorProto>
    public val service: List<pbandk.wkt.ServiceDescriptorProto>
    public val extension: List<pbandk.wkt.FieldDescriptorProto>
    public val options: pbandk.wkt.FileOptions?
    public val sourceCodeInfo: pbandk.wkt.SourceCodeInfo?
    public val syntax: String?
    public val edition: pbandk.wkt.Edition?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto>

    /**
     * The [MutableFileDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit): pbandk.wkt.FileDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        `package`: String? = this.`package`,
        dependency: List<String> = this.dependency,
        publicDependency: List<Int> = this.publicDependency,
        weakDependency: List<Int> = this.weakDependency,
        messageType: List<pbandk.wkt.DescriptorProto> = this.messageType,
        enumType: List<pbandk.wkt.EnumDescriptorProto> = this.enumType,
        service: List<pbandk.wkt.ServiceDescriptorProto> = this.service,
        extension: List<pbandk.wkt.FieldDescriptorProto> = this.extension,
        options: pbandk.wkt.FileOptions? = this.options,
        sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = this.sourceCodeInfo,
        syntax: String? = this.syntax,
        edition: pbandk.wkt.Edition? = this.edition,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FileDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.FileDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::name,
            )
        public val `package`: pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "package",
                number = 2,
                valueType = pbandk.types.string(),
                jsonName = "package",
                value = pbandk.wkt.FileDescriptorProto::`package`,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::`package`,
            )
        public val dependency: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "dependency",
                number = 3,
                valueType = pbandk.types.string(),
                jsonName = "dependency",
                value = pbandk.wkt.FileDescriptorProto::dependency,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::dependency,
            )
        public val messageType: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<pbandk.wkt.DescriptorProto>, MutableList<pbandk.wkt.DescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "message_type",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.DescriptorProto),
                jsonName = "messageType",
                value = pbandk.wkt.FileDescriptorProto::messageType,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::messageType,
            )
        public val enumType: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<pbandk.wkt.EnumDescriptorProto>, MutableList<pbandk.wkt.EnumDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "enum_type",
                number = 5,
                valueType = pbandk.types.message(pbandk.wkt.EnumDescriptorProto),
                jsonName = "enumType",
                value = pbandk.wkt.FileDescriptorProto::enumType,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::enumType,
            )
        public val service: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<pbandk.wkt.ServiceDescriptorProto>, MutableList<pbandk.wkt.ServiceDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "service",
                number = 6,
                valueType = pbandk.types.message(pbandk.wkt.ServiceDescriptorProto),
                jsonName = "service",
                value = pbandk.wkt.FileDescriptorProto::service,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::service,
            )
        public val extension: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<pbandk.wkt.FieldDescriptorProto>, MutableList<pbandk.wkt.FieldDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "extension",
                number = 7,
                valueType = pbandk.types.message(pbandk.wkt.FieldDescriptorProto),
                jsonName = "extension",
                value = pbandk.wkt.FileDescriptorProto::extension,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::extension,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, pbandk.wkt.FileOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "options",
                number = 8,
                valueType = pbandk.types.message(pbandk.wkt.FileOptions),
                jsonName = "options",
                value = pbandk.wkt.FileDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::options,
            )
        public val sourceCodeInfo: pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, pbandk.wkt.SourceCodeInfo?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "source_code_info",
                number = 9,
                valueType = pbandk.types.message(pbandk.wkt.SourceCodeInfo),
                jsonName = "sourceCodeInfo",
                value = pbandk.wkt.FileDescriptorProto::sourceCodeInfo,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::sourceCodeInfo,
            )
        public val publicDependency: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "public_dependency",
                number = 10,
                valueType = pbandk.types.int32(),
                jsonName = "publicDependency",
                value = pbandk.wkt.FileDescriptorProto::publicDependency,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::publicDependency,
            )
        public val weakDependency: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileDescriptorProto, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "weak_dependency",
                number = 11,
                valueType = pbandk.types.int32(),
                jsonName = "weakDependency",
                value = pbandk.wkt.FileDescriptorProto::weakDependency,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::weakDependency,
            )
        public val syntax: pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "syntax",
                number = 12,
                valueType = pbandk.types.string(),
                jsonName = "syntax",
                value = pbandk.wkt.FileDescriptorProto::syntax,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::syntax,
            )
        public val edition: pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, pbandk.wkt.Edition?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FileDescriptorProto.messageMetadata,
                name = "edition",
                number = 14,
                valueType = pbandk.types.enum(pbandk.wkt.Edition),
                jsonName = "edition",
                value = pbandk.wkt.FileDescriptorProto::edition,
                mutableValue = pbandk.wkt.MutableFileDescriptorProto::edition,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.FileDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FileDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FileDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FileDescriptorProto::class,
                messageCompanion = this,
                builder = ::FileDescriptorProto,
                fields = listOf(
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.`package`,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.dependency,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.publicDependency,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.weakDependency,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.messageType,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.enumType,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.service,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.extension,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.options,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.sourceCodeInfo,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.syntax,
                    pbandk.wkt.FileDescriptorProto.FieldDescriptors.edition,
                ),
            )
        }
    }
}

public sealed interface MutableFileDescriptorProto : pbandk.wkt.FileDescriptorProto, pbandk.MutableMessage<pbandk.wkt.FileDescriptorProto> {
    public override var name: String?
    public override var `package`: String?
    public override val dependency: MutableList<String>
    public override val publicDependency: MutableList<Int>
    public override val weakDependency: MutableList<Int>
    public override val messageType: MutableList<pbandk.wkt.DescriptorProto>
    public override val enumType: MutableList<pbandk.wkt.EnumDescriptorProto>
    public override val service: MutableList<pbandk.wkt.ServiceDescriptorProto>
    public override val extension: MutableList<pbandk.wkt.FieldDescriptorProto>
    public override var options: pbandk.wkt.FileOptions?
    public override var sourceCodeInfo: pbandk.wkt.SourceCodeInfo?
    public override var syntax: String?
    public override var edition: pbandk.wkt.Edition?
}

public sealed interface DescriptorProto : pbandk.Message {
    public val name: String?
    public val field: List<pbandk.wkt.FieldDescriptorProto>
    public val extension: List<pbandk.wkt.FieldDescriptorProto>
    public val nestedType: List<pbandk.wkt.DescriptorProto>
    public val enumType: List<pbandk.wkt.EnumDescriptorProto>
    public val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>
    public val oneofDecl: List<pbandk.wkt.OneofDescriptorProto>
    public val options: pbandk.wkt.MessageOptions?
    public val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>
    public val reservedName: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto>

    /**
     * The [MutableDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit): pbandk.wkt.DescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        field: List<pbandk.wkt.FieldDescriptorProto> = this.field,
        extension: List<pbandk.wkt.FieldDescriptorProto> = this.extension,
        nestedType: List<pbandk.wkt.DescriptorProto> = this.nestedType,
        enumType: List<pbandk.wkt.EnumDescriptorProto> = this.enumType,
        extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = this.extensionRange,
        oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = this.oneofDecl,
        options: pbandk.wkt.MessageOptions? = this.options,
        reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = this.reservedRange,
        reservedName: List<String> = this.reservedName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.DescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.DescriptorProto::name,
                mutableValue = pbandk.wkt.MutableDescriptorProto::name,
            )
        public val field: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.FieldDescriptorProto>, MutableList<pbandk.wkt.FieldDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "field",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.FieldDescriptorProto),
                jsonName = "field",
                value = pbandk.wkt.DescriptorProto::field,
                mutableValue = pbandk.wkt.MutableDescriptorProto::field,
            )
        public val nestedType: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.DescriptorProto>, MutableList<pbandk.wkt.DescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "nested_type",
                number = 3,
                valueType = pbandk.types.message(pbandk.wkt.DescriptorProto, recursive = true),
                jsonName = "nestedType",
                value = pbandk.wkt.DescriptorProto::nestedType,
                mutableValue = pbandk.wkt.MutableDescriptorProto::nestedType,
            )
        public val enumType: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.EnumDescriptorProto>, MutableList<pbandk.wkt.EnumDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "enum_type",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.EnumDescriptorProto),
                jsonName = "enumType",
                value = pbandk.wkt.DescriptorProto::enumType,
                mutableValue = pbandk.wkt.MutableDescriptorProto::enumType,
            )
        public val extensionRange: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.DescriptorProto.ExtensionRange>, MutableList<pbandk.wkt.DescriptorProto.ExtensionRange>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "extension_range",
                number = 5,
                valueType = pbandk.types.message(pbandk.wkt.DescriptorProto.ExtensionRange),
                jsonName = "extensionRange",
                value = pbandk.wkt.DescriptorProto::extensionRange,
                mutableValue = pbandk.wkt.MutableDescriptorProto::extensionRange,
            )
        public val extension: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.FieldDescriptorProto>, MutableList<pbandk.wkt.FieldDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "extension",
                number = 6,
                valueType = pbandk.types.message(pbandk.wkt.FieldDescriptorProto),
                jsonName = "extension",
                value = pbandk.wkt.DescriptorProto::extension,
                mutableValue = pbandk.wkt.MutableDescriptorProto::extension,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto, pbandk.wkt.MessageOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "options",
                number = 7,
                valueType = pbandk.types.message(pbandk.wkt.MessageOptions),
                jsonName = "options",
                value = pbandk.wkt.DescriptorProto::options,
                mutableValue = pbandk.wkt.MutableDescriptorProto::options,
            )
        public val oneofDecl: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.OneofDescriptorProto>, MutableList<pbandk.wkt.OneofDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "oneof_decl",
                number = 8,
                valueType = pbandk.types.message(pbandk.wkt.OneofDescriptorProto),
                jsonName = "oneofDecl",
                value = pbandk.wkt.DescriptorProto::oneofDecl,
                mutableValue = pbandk.wkt.MutableDescriptorProto::oneofDecl,
            )
        public val reservedRange: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<pbandk.wkt.DescriptorProto.ReservedRange>, MutableList<pbandk.wkt.DescriptorProto.ReservedRange>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "reserved_range",
                number = 9,
                valueType = pbandk.types.message(pbandk.wkt.DescriptorProto.ReservedRange),
                jsonName = "reservedRange",
                value = pbandk.wkt.DescriptorProto::reservedRange,
                mutableValue = pbandk.wkt.MutableDescriptorProto::reservedRange,
            )
        public val reservedName: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.DescriptorProto, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.DescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.DescriptorProto.messageMetadata,
                name = "reserved_name",
                number = 10,
                valueType = pbandk.types.string(),
                jsonName = "reservedName",
                value = pbandk.wkt.DescriptorProto::reservedName,
                mutableValue = pbandk.wkt.MutableDescriptorProto::reservedName,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto>() {
        override val defaultInstance: pbandk.wkt.DescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.DescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.DescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.DescriptorProto::class,
                messageCompanion = this,
                builder = ::DescriptorProto,
                fields = listOf(
                    pbandk.wkt.DescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.field,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.extension,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.nestedType,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.enumType,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.extensionRange,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.oneofDecl,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.options,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.reservedRange,
                    pbandk.wkt.DescriptorProto.FieldDescriptors.reservedName,
                ),
            )
        }

        @Deprecated(
            message = "Use DescriptorProto.ExtensionRange { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.DescriptorProto.ExtensionRange"],
                expression = "DescriptorProto.ExtensionRange {\nthis.start = start\nthis.end = end\nthis.options = options\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun ExtensionRange(
            start: Int? = null,
            end: Int? = null,
            options: pbandk.wkt.ExtensionRangeOptions? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.DescriptorProto.ExtensionRange = pbandk.wkt.DescriptorProto.ExtensionRange {
            this.start = start
            this.end = end
            this.options = options
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use DescriptorProto.ReservedRange { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.DescriptorProto.ReservedRange"],
                expression = "DescriptorProto.ReservedRange {\nthis.start = start\nthis.end = end\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun ReservedRange(
            start: Int? = null,
            end: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.DescriptorProto.ReservedRange = pbandk.wkt.DescriptorProto.ReservedRange {
            this.start = start
            this.end = end
            this.unknownFields += unknownFields
        }
    }

    public sealed interface ExtensionRange : pbandk.Message {
        public val start: Int?
        public val end: Int?
        public val options: pbandk.wkt.ExtensionRangeOptions?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ExtensionRange
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange>

        /**
         * The [DescriptorProto.MutableExtensionRange] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit): pbandk.wkt.DescriptorProto.ExtensionRange

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            start: Int? = this.start,
            end: Int? = this.end,
            options: pbandk.wkt.ExtensionRangeOptions? = this.options,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.DescriptorProto.ExtensionRange

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val start: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.DescriptorProto.ExtensionRange::descriptor,
                    messageMetadata = pbandk.wkt.DescriptorProto.ExtensionRange.messageMetadata,
                    name = "start",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "start",
                    value = pbandk.wkt.DescriptorProto.ExtensionRange::start,
                    mutableValue = pbandk.wkt.DescriptorProto.MutableExtensionRange::start,
                )
            public val end: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.DescriptorProto.ExtensionRange::descriptor,
                    messageMetadata = pbandk.wkt.DescriptorProto.ExtensionRange.messageMetadata,
                    name = "end",
                    number = 2,
                    valueType = pbandk.types.int32(),
                    jsonName = "end",
                    value = pbandk.wkt.DescriptorProto.ExtensionRange::end,
                    mutableValue = pbandk.wkt.DescriptorProto.MutableExtensionRange::end,
                )
            public val options: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange, pbandk.wkt.ExtensionRangeOptions?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.DescriptorProto.ExtensionRange::descriptor,
                    messageMetadata = pbandk.wkt.DescriptorProto.ExtensionRange.messageMetadata,
                    name = "options",
                    number = 3,
                    valueType = pbandk.types.message(pbandk.wkt.ExtensionRangeOptions),
                    jsonName = "options",
                    value = pbandk.wkt.DescriptorProto.ExtensionRange::options,
                    mutableValue = pbandk.wkt.DescriptorProto.MutableExtensionRange::options,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto.ExtensionRange>() {
            override val defaultInstance: pbandk.wkt.DescriptorProto.ExtensionRange by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.DescriptorProto.ExtensionRange {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.DescriptorProto.ExtensionRange",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.DescriptorProto.ExtensionRange::class,
                    messageCompanion = this,
                    builder = DescriptorProto.Companion::ExtensionRange,
                    fields = listOf(
                        pbandk.wkt.DescriptorProto.ExtensionRange.FieldDescriptors.start,
                        pbandk.wkt.DescriptorProto.ExtensionRange.FieldDescriptors.end,
                        pbandk.wkt.DescriptorProto.ExtensionRange.FieldDescriptors.options,
                    ),
                )
            }
        }
    }

    public sealed interface MutableExtensionRange : pbandk.wkt.DescriptorProto.ExtensionRange, pbandk.MutableMessage<pbandk.wkt.DescriptorProto.ExtensionRange> {
        public override var start: Int?
        public override var end: Int?
        public override var options: pbandk.wkt.ExtensionRangeOptions?
    }

    public sealed interface ReservedRange : pbandk.Message {
        public val start: Int?
        public val end: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ReservedRange
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ReservedRange>

        /**
         * The [DescriptorProto.MutableReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit): pbandk.wkt.DescriptorProto.ReservedRange

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            start: Int? = this.start,
            end: Int? = this.end,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.DescriptorProto.ReservedRange

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val start: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ReservedRange, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.DescriptorProto.ReservedRange::descriptor,
                    messageMetadata = pbandk.wkt.DescriptorProto.ReservedRange.messageMetadata,
                    name = "start",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "start",
                    value = pbandk.wkt.DescriptorProto.ReservedRange::start,
                    mutableValue = pbandk.wkt.DescriptorProto.MutableReservedRange::start,
                )
            public val end: pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ReservedRange, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.DescriptorProto.ReservedRange::descriptor,
                    messageMetadata = pbandk.wkt.DescriptorProto.ReservedRange.messageMetadata,
                    name = "end",
                    number = 2,
                    valueType = pbandk.types.int32(),
                    jsonName = "end",
                    value = pbandk.wkt.DescriptorProto.ReservedRange::end,
                    mutableValue = pbandk.wkt.DescriptorProto.MutableReservedRange::end,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto.ReservedRange>() {
            override val defaultInstance: pbandk.wkt.DescriptorProto.ReservedRange by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.DescriptorProto.ReservedRange {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.DescriptorProto.ReservedRange",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ReservedRange> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.DescriptorProto.ReservedRange::class,
                    messageCompanion = this,
                    builder = DescriptorProto.Companion::ReservedRange,
                    fields = listOf(
                        pbandk.wkt.DescriptorProto.ReservedRange.FieldDescriptors.start,
                        pbandk.wkt.DescriptorProto.ReservedRange.FieldDescriptors.end,
                    ),
                )
            }
        }
    }

    public sealed interface MutableReservedRange : pbandk.wkt.DescriptorProto.ReservedRange, pbandk.MutableMessage<pbandk.wkt.DescriptorProto.ReservedRange> {
        public override var start: Int?
        public override var end: Int?
    }
}

public sealed interface MutableDescriptorProto : pbandk.wkt.DescriptorProto, pbandk.MutableMessage<pbandk.wkt.DescriptorProto> {
    public override var name: String?
    public override val field: MutableList<pbandk.wkt.FieldDescriptorProto>
    public override val extension: MutableList<pbandk.wkt.FieldDescriptorProto>
    public override val nestedType: MutableList<pbandk.wkt.DescriptorProto>
    public override val enumType: MutableList<pbandk.wkt.EnumDescriptorProto>
    public override val extensionRange: MutableList<pbandk.wkt.DescriptorProto.ExtensionRange>
    public override val oneofDecl: MutableList<pbandk.wkt.OneofDescriptorProto>
    public override var options: pbandk.wkt.MessageOptions?
    public override val reservedRange: MutableList<pbandk.wkt.DescriptorProto.ReservedRange>
    public override val reservedName: MutableList<String>
}

public sealed interface ExtensionRangeOptions : pbandk.ExtendableMessage<pbandk.wkt.ExtensionRangeOptions> {
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>
    public val declaration: List<pbandk.wkt.ExtensionRangeOptions.Declaration>
    public val features: pbandk.wkt.FeatureSet?
    public val verification: pbandk.wkt.ExtensionRangeOptions.VerificationState?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ExtensionRangeOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions>

    /**
     * The [MutableExtensionRangeOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit): pbandk.wkt.ExtensionRangeOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        declaration: List<pbandk.wkt.ExtensionRangeOptions.Declaration> = this.declaration,
        features: pbandk.wkt.FeatureSet? = this.features,
        verification: pbandk.wkt.ExtensionRangeOptions.VerificationState? = this.verification,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ExtensionRangeOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val declaration: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.ExtensionRangeOptions, List<pbandk.wkt.ExtensionRangeOptions.Declaration>, MutableList<pbandk.wkt.ExtensionRangeOptions.Declaration>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.ExtensionRangeOptions::descriptor,
                messageMetadata = pbandk.wkt.ExtensionRangeOptions.messageMetadata,
                name = "declaration",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.ExtensionRangeOptions.Declaration),
                jsonName = "declaration",
                value = pbandk.wkt.ExtensionRangeOptions::declaration,
                mutableValue = pbandk.wkt.MutableExtensionRangeOptions::declaration,
            )
        public val verification: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions, pbandk.wkt.ExtensionRangeOptions.VerificationState?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.ExtensionRangeOptions::descriptor,
                messageMetadata = pbandk.wkt.ExtensionRangeOptions.messageMetadata,
                name = "verification",
                number = 3,
                valueType = pbandk.types.enum(pbandk.wkt.ExtensionRangeOptions.VerificationState),
                jsonName = "verification",
                value = pbandk.wkt.ExtensionRangeOptions::verification,
                mutableValue = pbandk.wkt.MutableExtensionRangeOptions::verification,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.ExtensionRangeOptions::descriptor,
                messageMetadata = pbandk.wkt.ExtensionRangeOptions.messageMetadata,
                name = "features",
                number = 50,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.ExtensionRangeOptions::features,
                mutableValue = pbandk.wkt.MutableExtensionRangeOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.ExtensionRangeOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.ExtensionRangeOptions::descriptor,
                messageMetadata = pbandk.wkt.ExtensionRangeOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.ExtensionRangeOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableExtensionRangeOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.ExtensionRangeOptions>() {
        override val defaultInstance: pbandk.wkt.ExtensionRangeOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.ExtensionRangeOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.ExtensionRangeOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.ExtensionRangeOptions::class,
                messageCompanion = this,
                builder = ::ExtensionRangeOptions,
                fields = listOf(
                    pbandk.wkt.ExtensionRangeOptions.FieldDescriptors.uninterpretedOption,
                    pbandk.wkt.ExtensionRangeOptions.FieldDescriptors.declaration,
                    pbandk.wkt.ExtensionRangeOptions.FieldDescriptors.features,
                    pbandk.wkt.ExtensionRangeOptions.FieldDescriptors.verification,
                ),
            )
        }

        @Deprecated(
            message = "Use ExtensionRangeOptions.Declaration { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.ExtensionRangeOptions.Declaration"],
                expression = "ExtensionRangeOptions.Declaration {\nthis.number = number\nthis.fullName = fullName\nthis.type = type\nthis.reserved = reserved\nthis.repeated = repeated\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun Declaration(
            number: Int? = null,
            fullName: String? = null,
            type: String? = null,
            reserved: Boolean? = null,
            repeated: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.ExtensionRangeOptions.Declaration = pbandk.wkt.ExtensionRangeOptions.Declaration {
            this.number = number
            this.fullName = fullName
            this.type = type
            this.reserved = reserved
            this.repeated = repeated
            this.unknownFields += unknownFields
        }
    }

    public sealed interface VerificationState : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.ExtensionRangeOptions.VerificationState>
            get() = pbandk.wkt.ExtensionRangeOptions.VerificationState.descriptor

        public object DECLARATION : VerificationState, pbandk.gen.GeneratedEnumValue<pbandk.wkt.ExtensionRangeOptions.VerificationState>(
            value = 0,
            name = "DECLARATION",
        )
        public object UNVERIFIED : VerificationState, pbandk.gen.GeneratedEnumValue<pbandk.wkt.ExtensionRangeOptions.VerificationState>(
            value = 1,
            name = "UNVERIFIED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : VerificationState, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.ExtensionRangeOptions.VerificationState>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.ExtensionRangeOptions.VerificationState> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.ExtensionRangeOptions.VerificationState> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.ExtensionRangeOptions.VerificationState",
                    enumClass = pbandk.wkt.ExtensionRangeOptions.VerificationState::class,
                    enumCompanion = this,
                )
            public val values: List<ExtensionRangeOptions.VerificationState> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(DECLARATION, UNVERIFIED)
            }

            override fun fromValue(value: Int): pbandk.wkt.ExtensionRangeOptions.VerificationState =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.ExtensionRangeOptions.VerificationState =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface Declaration : pbandk.Message {
        public val number: Int?
        public val fullName: String?
        public val type: String?
        public val reserved: Boolean?
        public val repeated: Boolean?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.ExtensionRangeOptions.Declaration
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration>

        /**
         * The [ExtensionRangeOptions.MutableDeclaration] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.ExtensionRangeOptions.MutableDeclaration.() -> Unit): pbandk.wkt.ExtensionRangeOptions.Declaration

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            number: Int? = this.number,
            fullName: String? = this.fullName,
            type: String? = this.type,
            reserved: Boolean? = this.reserved,
            repeated: Boolean? = this.repeated,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.ExtensionRangeOptions.Declaration

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val number: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.ExtensionRangeOptions.Declaration::descriptor,
                    messageMetadata = pbandk.wkt.ExtensionRangeOptions.Declaration.messageMetadata,
                    name = "number",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "number",
                    value = pbandk.wkt.ExtensionRangeOptions.Declaration::number,
                    mutableValue = pbandk.wkt.ExtensionRangeOptions.MutableDeclaration::number,
                )
            public val fullName: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.ExtensionRangeOptions.Declaration::descriptor,
                    messageMetadata = pbandk.wkt.ExtensionRangeOptions.Declaration.messageMetadata,
                    name = "full_name",
                    number = 2,
                    valueType = pbandk.types.string(),
                    jsonName = "fullName",
                    value = pbandk.wkt.ExtensionRangeOptions.Declaration::fullName,
                    mutableValue = pbandk.wkt.ExtensionRangeOptions.MutableDeclaration::fullName,
                )
            public val type: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.ExtensionRangeOptions.Declaration::descriptor,
                    messageMetadata = pbandk.wkt.ExtensionRangeOptions.Declaration.messageMetadata,
                    name = "type",
                    number = 3,
                    valueType = pbandk.types.string(),
                    jsonName = "type",
                    value = pbandk.wkt.ExtensionRangeOptions.Declaration::type,
                    mutableValue = pbandk.wkt.ExtensionRangeOptions.MutableDeclaration::type,
                )
            public val reserved: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration, Boolean?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.ExtensionRangeOptions.Declaration::descriptor,
                    messageMetadata = pbandk.wkt.ExtensionRangeOptions.Declaration.messageMetadata,
                    name = "reserved",
                    number = 5,
                    valueType = pbandk.types.bool(),
                    jsonName = "reserved",
                    value = pbandk.wkt.ExtensionRangeOptions.Declaration::reserved,
                    mutableValue = pbandk.wkt.ExtensionRangeOptions.MutableDeclaration::reserved,
                )
            public val repeated: pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration, Boolean?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.ExtensionRangeOptions.Declaration::descriptor,
                    messageMetadata = pbandk.wkt.ExtensionRangeOptions.Declaration.messageMetadata,
                    name = "repeated",
                    number = 6,
                    valueType = pbandk.types.bool(),
                    jsonName = "repeated",
                    value = pbandk.wkt.ExtensionRangeOptions.Declaration::repeated,
                    mutableValue = pbandk.wkt.ExtensionRangeOptions.MutableDeclaration::repeated,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.ExtensionRangeOptions.Declaration>() {
            override val defaultInstance: pbandk.wkt.ExtensionRangeOptions.Declaration by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.ExtensionRangeOptions.Declaration {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.ExtensionRangeOptions.Declaration",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.ExtensionRangeOptions.Declaration::class,
                    messageCompanion = this,
                    builder = ExtensionRangeOptions.Companion::Declaration,
                    fields = listOf(
                        pbandk.wkt.ExtensionRangeOptions.Declaration.FieldDescriptors.number,
                        pbandk.wkt.ExtensionRangeOptions.Declaration.FieldDescriptors.fullName,
                        pbandk.wkt.ExtensionRangeOptions.Declaration.FieldDescriptors.type,
                        pbandk.wkt.ExtensionRangeOptions.Declaration.FieldDescriptors.reserved,
                        pbandk.wkt.ExtensionRangeOptions.Declaration.FieldDescriptors.repeated,
                    ),
                )
            }
        }
    }

    public sealed interface MutableDeclaration : pbandk.wkt.ExtensionRangeOptions.Declaration, pbandk.MutableMessage<pbandk.wkt.ExtensionRangeOptions.Declaration> {
        public override var number: Int?
        public override var fullName: String?
        public override var type: String?
        public override var reserved: Boolean?
        public override var repeated: Boolean?
    }
}

public sealed interface MutableExtensionRangeOptions : pbandk.wkt.ExtensionRangeOptions, pbandk.MutableExtendableMessage<pbandk.wkt.ExtensionRangeOptions> {
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
    public override val declaration: MutableList<pbandk.wkt.ExtensionRangeOptions.Declaration>
    public override var features: pbandk.wkt.FeatureSet?
    public override var verification: pbandk.wkt.ExtensionRangeOptions.VerificationState?
}

public sealed interface FieldDescriptorProto : pbandk.Message {
    public val name: String?
    public val number: Int?
    public val label: pbandk.wkt.FieldDescriptorProto.Label?
    public val type: pbandk.wkt.FieldDescriptorProto.Type?
    public val typeName: String?
    public val extendee: String?
    public val defaultValue: String?
    public val oneofIndex: Int?
    public val jsonName: String?
    public val options: pbandk.wkt.FieldOptions?
    public val proto3Optional: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto>

    /**
     * The [MutableFieldDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit): pbandk.wkt.FieldDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        number: Int? = this.number,
        label: pbandk.wkt.FieldDescriptorProto.Label? = this.label,
        type: pbandk.wkt.FieldDescriptorProto.Type? = this.type,
        typeName: String? = this.typeName,
        extendee: String? = this.extendee,
        defaultValue: String? = this.defaultValue,
        oneofIndex: Int? = this.oneofIndex,
        jsonName: String? = this.jsonName,
        options: pbandk.wkt.FieldOptions? = this.options,
        proto3Optional: Boolean? = this.proto3Optional,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FieldDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.FieldDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::name,
            )
        public val extendee: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "extendee",
                number = 2,
                valueType = pbandk.types.string(),
                jsonName = "extendee",
                value = pbandk.wkt.FieldDescriptorProto::extendee,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::extendee,
            )
        public val number: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "number",
                number = 3,
                valueType = pbandk.types.int32(),
                jsonName = "number",
                value = pbandk.wkt.FieldDescriptorProto::number,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::number,
            )
        public val label: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, pbandk.wkt.FieldDescriptorProto.Label?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "label",
                number = 4,
                valueType = pbandk.types.enum(pbandk.wkt.FieldDescriptorProto.Label),
                jsonName = "label",
                value = pbandk.wkt.FieldDescriptorProto::label,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::label,
            )
        public val type: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, pbandk.wkt.FieldDescriptorProto.Type?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "type",
                number = 5,
                valueType = pbandk.types.enum(pbandk.wkt.FieldDescriptorProto.Type),
                jsonName = "type",
                value = pbandk.wkt.FieldDescriptorProto::type,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::type,
            )
        public val typeName: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "type_name",
                number = 6,
                valueType = pbandk.types.string(),
                jsonName = "typeName",
                value = pbandk.wkt.FieldDescriptorProto::typeName,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::typeName,
            )
        public val defaultValue: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "default_value",
                number = 7,
                valueType = pbandk.types.string(),
                jsonName = "defaultValue",
                value = pbandk.wkt.FieldDescriptorProto::defaultValue,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::defaultValue,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, pbandk.wkt.FieldOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "options",
                number = 8,
                valueType = pbandk.types.message(pbandk.wkt.FieldOptions),
                jsonName = "options",
                value = pbandk.wkt.FieldDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::options,
            )
        public val oneofIndex: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "oneof_index",
                number = 9,
                valueType = pbandk.types.int32(),
                jsonName = "oneofIndex",
                value = pbandk.wkt.FieldDescriptorProto::oneofIndex,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::oneofIndex,
            )
        public val jsonName: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "json_name",
                number = 10,
                valueType = pbandk.types.string(),
                jsonName = "jsonName",
                value = pbandk.wkt.FieldDescriptorProto::jsonName,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::jsonName,
            )
        public val proto3Optional: pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.FieldDescriptorProto.messageMetadata,
                name = "proto3_optional",
                number = 17,
                valueType = pbandk.types.bool(),
                jsonName = "proto3Optional",
                value = pbandk.wkt.FieldDescriptorProto::proto3Optional,
                mutableValue = pbandk.wkt.MutableFieldDescriptorProto::proto3Optional,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.FieldDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FieldDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FieldDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FieldDescriptorProto::class,
                messageCompanion = this,
                builder = ::FieldDescriptorProto,
                fields = listOf(
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.number,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.label,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.type,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.typeName,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.extendee,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.defaultValue,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.oneofIndex,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.jsonName,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.options,
                    pbandk.wkt.FieldDescriptorProto.FieldDescriptors.proto3Optional,
                ),
            )
        }
    }

    public sealed interface Type : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldDescriptorProto.Type>
            get() = pbandk.wkt.FieldDescriptorProto.Type.descriptor

        public object DOUBLE : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 1,
            name = "TYPE_DOUBLE",
        )
        public object FLOAT : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 2,
            name = "TYPE_FLOAT",
        )
        public object INT64 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 3,
            name = "TYPE_INT64",
        )
        public object UINT64 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 4,
            name = "TYPE_UINT64",
        )
        public object INT32 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 5,
            name = "TYPE_INT32",
        )
        public object FIXED64 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 6,
            name = "TYPE_FIXED64",
        )
        public object FIXED32 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 7,
            name = "TYPE_FIXED32",
        )
        public object BOOL : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 8,
            name = "TYPE_BOOL",
        )
        public object STRING : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 9,
            name = "TYPE_STRING",
        )
        public object GROUP : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 10,
            name = "TYPE_GROUP",
        )
        public object MESSAGE : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 11,
            name = "TYPE_MESSAGE",
        )
        public object BYTES : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 12,
            name = "TYPE_BYTES",
        )
        public object UINT32 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 13,
            name = "TYPE_UINT32",
        )
        public object ENUM : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 14,
            name = "TYPE_ENUM",
        )
        public object SFIXED32 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 15,
            name = "TYPE_SFIXED32",
        )
        public object SFIXED64 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 16,
            name = "TYPE_SFIXED64",
        )
        public object SINT32 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 17,
            name = "TYPE_SINT32",
        )
        public object SINT64 : Type, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(
            value = 18,
            name = "TYPE_SINT64",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Type, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FieldDescriptorProto.Type>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Type> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldDescriptorProto.Type> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FieldDescriptorProto.Type",
                    enumClass = pbandk.wkt.FieldDescriptorProto.Type::class,
                    enumCompanion = this,
                )
            public val values: List<FieldDescriptorProto.Type> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(
                    DOUBLE, FLOAT, INT64, UINT64, INT32,
                    FIXED64, FIXED32, BOOL, STRING, GROUP,
                    MESSAGE, BYTES, UINT32, ENUM, SFIXED32,
                    SFIXED64, SINT32, SINT64,
                )
            }

            override fun fromValue(value: Int): pbandk.wkt.FieldDescriptorProto.Type =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FieldDescriptorProto.Type =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface Label : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldDescriptorProto.Label>
            get() = pbandk.wkt.FieldDescriptorProto.Label.descriptor

        public object OPTIONAL : Label, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Label>(
            value = 1,
            name = "LABEL_OPTIONAL",
        )
        public object REPEATED : Label, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Label>(
            value = 3,
            name = "LABEL_REPEATED",
        )
        public object REQUIRED : Label, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldDescriptorProto.Label>(
            value = 2,
            name = "LABEL_REQUIRED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Label, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FieldDescriptorProto.Label>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Label> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldDescriptorProto.Label> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FieldDescriptorProto.Label",
                    enumClass = pbandk.wkt.FieldDescriptorProto.Label::class,
                    enumCompanion = this,
                )
            public val values: List<FieldDescriptorProto.Label> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(OPTIONAL, REPEATED, REQUIRED)
            }

            override fun fromValue(value: Int): pbandk.wkt.FieldDescriptorProto.Label =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FieldDescriptorProto.Label =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableFieldDescriptorProto : pbandk.wkt.FieldDescriptorProto, pbandk.MutableMessage<pbandk.wkt.FieldDescriptorProto> {
    public override var name: String?
    public override var number: Int?
    public override var label: pbandk.wkt.FieldDescriptorProto.Label?
    public override var type: pbandk.wkt.FieldDescriptorProto.Type?
    public override var typeName: String?
    public override var extendee: String?
    public override var defaultValue: String?
    public override var oneofIndex: Int?
    public override var jsonName: String?
    public override var options: pbandk.wkt.FieldOptions?
    public override var proto3Optional: Boolean?
}

public sealed interface OneofDescriptorProto : pbandk.Message {
    public val name: String?
    public val options: pbandk.wkt.OneofOptions?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.OneofDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto>

    /**
     * The [MutableOneofDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit): pbandk.wkt.OneofDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        options: pbandk.wkt.OneofOptions? = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.OneofDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.OneofDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.OneofDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.OneofDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.OneofDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableOneofDescriptorProto::name,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.OneofDescriptorProto, pbandk.wkt.OneofOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.OneofDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.OneofDescriptorProto.messageMetadata,
                name = "options",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.OneofOptions),
                jsonName = "options",
                value = pbandk.wkt.OneofDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableOneofDescriptorProto::options,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.OneofDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.OneofDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.OneofDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.OneofDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.OneofDescriptorProto::class,
                messageCompanion = this,
                builder = ::OneofDescriptorProto,
                fields = listOf(
                    pbandk.wkt.OneofDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.OneofDescriptorProto.FieldDescriptors.options,
                ),
            )
        }
    }
}

public sealed interface MutableOneofDescriptorProto : pbandk.wkt.OneofDescriptorProto, pbandk.MutableMessage<pbandk.wkt.OneofDescriptorProto> {
    public override var name: String?
    public override var options: pbandk.wkt.OneofOptions?
}

public sealed interface EnumDescriptorProto : pbandk.Message {
    public val name: String?
    public val value: List<pbandk.wkt.EnumValueDescriptorProto>
    public val options: pbandk.wkt.EnumOptions?
    public val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>
    public val reservedName: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto>

    /**
     * The [MutableEnumDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit): pbandk.wkt.EnumDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        value: List<pbandk.wkt.EnumValueDescriptorProto> = this.value,
        options: pbandk.wkt.EnumOptions? = this.options,
        reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = this.reservedRange,
        reservedName: List<String> = this.reservedName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.EnumDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableEnumDescriptorProto::name,
            )
        public val value: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.EnumDescriptorProto, List<pbandk.wkt.EnumValueDescriptorProto>, MutableList<pbandk.wkt.EnumValueDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.EnumDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumDescriptorProto.messageMetadata,
                name = "value",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.EnumValueDescriptorProto),
                jsonName = "value",
                value = pbandk.wkt.EnumDescriptorProto::value,
                mutableValue = pbandk.wkt.MutableEnumDescriptorProto::value,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto, pbandk.wkt.EnumOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumDescriptorProto.messageMetadata,
                name = "options",
                number = 3,
                valueType = pbandk.types.message(pbandk.wkt.EnumOptions),
                jsonName = "options",
                value = pbandk.wkt.EnumDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableEnumDescriptorProto::options,
            )
        public val reservedRange: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.EnumDescriptorProto, List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>, MutableList<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.EnumDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumDescriptorProto.messageMetadata,
                name = "reserved_range",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.EnumDescriptorProto.EnumReservedRange),
                jsonName = "reservedRange",
                value = pbandk.wkt.EnumDescriptorProto::reservedRange,
                mutableValue = pbandk.wkt.MutableEnumDescriptorProto::reservedRange,
            )
        public val reservedName: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.EnumDescriptorProto, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.EnumDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumDescriptorProto.messageMetadata,
                name = "reserved_name",
                number = 5,
                valueType = pbandk.types.string(),
                jsonName = "reservedName",
                value = pbandk.wkt.EnumDescriptorProto::reservedName,
                mutableValue = pbandk.wkt.MutableEnumDescriptorProto::reservedName,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.EnumDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.EnumDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.EnumDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.EnumDescriptorProto::class,
                messageCompanion = this,
                builder = ::EnumDescriptorProto,
                fields = listOf(
                    pbandk.wkt.EnumDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.EnumDescriptorProto.FieldDescriptors.value,
                    pbandk.wkt.EnumDescriptorProto.FieldDescriptors.options,
                    pbandk.wkt.EnumDescriptorProto.FieldDescriptors.reservedRange,
                    pbandk.wkt.EnumDescriptorProto.FieldDescriptors.reservedName,
                ),
            )
        }

        @Deprecated(
            message = "Use EnumDescriptorProto.EnumReservedRange { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.EnumDescriptorProto.EnumReservedRange"],
                expression = "EnumDescriptorProto.EnumReservedRange {\nthis.start = start\nthis.end = end\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun EnumReservedRange(
            start: Int? = null,
            end: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = pbandk.wkt.EnumDescriptorProto.EnumReservedRange {
            this.start = start
            this.end = end
            this.unknownFields += unknownFields
        }
    }

    public sealed interface EnumReservedRange : pbandk.Message {
        public val start: Int?
        public val end: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto.EnumReservedRange
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>

        /**
         * The [EnumDescriptorProto.MutableEnumReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit): pbandk.wkt.EnumDescriptorProto.EnumReservedRange

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            start: Int? = this.start,
            end: Int? = this.end,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.EnumDescriptorProto.EnumReservedRange

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val start: pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::descriptor,
                    messageMetadata = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.messageMetadata,
                    name = "start",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "start",
                    value = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::start,
                    mutableValue = pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange::start,
                )
            public val end: pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::descriptor,
                    messageMetadata = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.messageMetadata,
                    name = "end",
                    number = 2,
                    valueType = pbandk.types.int32(),
                    jsonName = "end",
                    value = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::end,
                    mutableValue = pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange::end,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>() {
            override val defaultInstance: pbandk.wkt.EnumDescriptorProto.EnumReservedRange by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.EnumDescriptorProto.EnumReservedRange {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.EnumDescriptorProto.EnumReservedRange",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::class,
                    messageCompanion = this,
                    builder = EnumDescriptorProto.Companion::EnumReservedRange,
                    fields = listOf(
                        pbandk.wkt.EnumDescriptorProto.EnumReservedRange.FieldDescriptors.start,
                        pbandk.wkt.EnumDescriptorProto.EnumReservedRange.FieldDescriptors.end,
                    ),
                )
            }
        }
    }

    public sealed interface MutableEnumReservedRange : pbandk.wkt.EnumDescriptorProto.EnumReservedRange, pbandk.MutableMessage<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> {
        public override var start: Int?
        public override var end: Int?
    }
}

public sealed interface MutableEnumDescriptorProto : pbandk.wkt.EnumDescriptorProto, pbandk.MutableMessage<pbandk.wkt.EnumDescriptorProto> {
    public override var name: String?
    public override val value: MutableList<pbandk.wkt.EnumValueDescriptorProto>
    public override var options: pbandk.wkt.EnumOptions?
    public override val reservedRange: MutableList<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>
    public override val reservedName: MutableList<String>
}

public sealed interface EnumValueDescriptorProto : pbandk.Message {
    public val name: String?
    public val number: Int?
    public val options: pbandk.wkt.EnumValueOptions?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValueDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto>

    /**
     * The [MutableEnumValueDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit): pbandk.wkt.EnumValueDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        number: Int? = this.number,
        options: pbandk.wkt.EnumValueOptions? = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValueDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.EnumValueDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumValueDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.EnumValueDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableEnumValueDescriptorProto::name,
            )
        public val number: pbandk.FieldDescriptor<pbandk.wkt.EnumValueDescriptorProto, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumValueDescriptorProto.messageMetadata,
                name = "number",
                number = 2,
                valueType = pbandk.types.int32(),
                jsonName = "number",
                value = pbandk.wkt.EnumValueDescriptorProto::number,
                mutableValue = pbandk.wkt.MutableEnumValueDescriptorProto::number,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.EnumValueDescriptorProto, pbandk.wkt.EnumValueOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.EnumValueDescriptorProto.messageMetadata,
                name = "options",
                number = 3,
                valueType = pbandk.types.message(pbandk.wkt.EnumValueOptions),
                jsonName = "options",
                value = pbandk.wkt.EnumValueDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableEnumValueDescriptorProto::options,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.EnumValueDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.EnumValueDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.EnumValueDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.EnumValueDescriptorProto::class,
                messageCompanion = this,
                builder = ::EnumValueDescriptorProto,
                fields = listOf(
                    pbandk.wkt.EnumValueDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.EnumValueDescriptorProto.FieldDescriptors.number,
                    pbandk.wkt.EnumValueDescriptorProto.FieldDescriptors.options,
                ),
            )
        }
    }
}

public sealed interface MutableEnumValueDescriptorProto : pbandk.wkt.EnumValueDescriptorProto, pbandk.MutableMessage<pbandk.wkt.EnumValueDescriptorProto> {
    public override var name: String?
    public override var number: Int?
    public override var options: pbandk.wkt.EnumValueOptions?
}

public sealed interface ServiceDescriptorProto : pbandk.Message {
    public val name: String?
    public val method: List<pbandk.wkt.MethodDescriptorProto>
    public val options: pbandk.wkt.ServiceOptions?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ServiceDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto>

    /**
     * The [MutableServiceDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit): pbandk.wkt.ServiceDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        method: List<pbandk.wkt.MethodDescriptorProto> = this.method,
        options: pbandk.wkt.ServiceOptions? = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ServiceDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.ServiceDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.ServiceDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.ServiceDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.ServiceDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableServiceDescriptorProto::name,
            )
        public val method: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.ServiceDescriptorProto, List<pbandk.wkt.MethodDescriptorProto>, MutableList<pbandk.wkt.MethodDescriptorProto>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.ServiceDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.ServiceDescriptorProto.messageMetadata,
                name = "method",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.MethodDescriptorProto),
                jsonName = "method",
                value = pbandk.wkt.ServiceDescriptorProto::method,
                mutableValue = pbandk.wkt.MutableServiceDescriptorProto::method,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.ServiceDescriptorProto, pbandk.wkt.ServiceOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.ServiceDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.ServiceDescriptorProto.messageMetadata,
                name = "options",
                number = 3,
                valueType = pbandk.types.message(pbandk.wkt.ServiceOptions),
                jsonName = "options",
                value = pbandk.wkt.ServiceDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableServiceDescriptorProto::options,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.ServiceDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.ServiceDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.ServiceDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.ServiceDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.ServiceDescriptorProto::class,
                messageCompanion = this,
                builder = ::ServiceDescriptorProto,
                fields = listOf(
                    pbandk.wkt.ServiceDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.ServiceDescriptorProto.FieldDescriptors.method,
                    pbandk.wkt.ServiceDescriptorProto.FieldDescriptors.options,
                ),
            )
        }
    }
}

public sealed interface MutableServiceDescriptorProto : pbandk.wkt.ServiceDescriptorProto, pbandk.MutableMessage<pbandk.wkt.ServiceDescriptorProto> {
    public override var name: String?
    public override val method: MutableList<pbandk.wkt.MethodDescriptorProto>
    public override var options: pbandk.wkt.ServiceOptions?
}

public sealed interface MethodDescriptorProto : pbandk.Message {
    public val name: String?
    public val inputType: String?
    public val outputType: String?
    public val options: pbandk.wkt.MethodOptions?
    public val clientStreaming: Boolean?
    public val serverStreaming: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MethodDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto>

    /**
     * The [MutableMethodDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit): pbandk.wkt.MethodDescriptorProto

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        inputType: String? = this.inputType,
        outputType: String? = this.outputType,
        options: pbandk.wkt.MethodOptions? = this.options,
        clientStreaming: Boolean? = this.clientStreaming,
        serverStreaming: Boolean? = this.serverStreaming,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.MethodDescriptorProto

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.MethodDescriptorProto.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.MethodDescriptorProto::name,
                mutableValue = pbandk.wkt.MutableMethodDescriptorProto::name,
            )
        public val inputType: pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.MethodDescriptorProto.messageMetadata,
                name = "input_type",
                number = 2,
                valueType = pbandk.types.string(),
                jsonName = "inputType",
                value = pbandk.wkt.MethodDescriptorProto::inputType,
                mutableValue = pbandk.wkt.MutableMethodDescriptorProto::inputType,
            )
        public val outputType: pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.MethodDescriptorProto.messageMetadata,
                name = "output_type",
                number = 3,
                valueType = pbandk.types.string(),
                jsonName = "outputType",
                value = pbandk.wkt.MethodDescriptorProto::outputType,
                mutableValue = pbandk.wkt.MutableMethodDescriptorProto::outputType,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, pbandk.wkt.MethodOptions?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.MethodDescriptorProto.messageMetadata,
                name = "options",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.MethodOptions),
                jsonName = "options",
                value = pbandk.wkt.MethodDescriptorProto::options,
                mutableValue = pbandk.wkt.MutableMethodDescriptorProto::options,
            )
        public val clientStreaming: pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.MethodDescriptorProto.messageMetadata,
                name = "client_streaming",
                number = 5,
                valueType = pbandk.types.bool(),
                jsonName = "clientStreaming",
                value = pbandk.wkt.MethodDescriptorProto::clientStreaming,
                mutableValue = pbandk.wkt.MutableMethodDescriptorProto::clientStreaming,
            )
        public val serverStreaming: pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodDescriptorProto::descriptor,
                messageMetadata = pbandk.wkt.MethodDescriptorProto.messageMetadata,
                name = "server_streaming",
                number = 6,
                valueType = pbandk.types.bool(),
                jsonName = "serverStreaming",
                value = pbandk.wkt.MethodDescriptorProto::serverStreaming,
                mutableValue = pbandk.wkt.MutableMethodDescriptorProto::serverStreaming,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.MethodDescriptorProto>() {
        override val defaultInstance: pbandk.wkt.MethodDescriptorProto by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.MethodDescriptorProto {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.MethodDescriptorProto",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.MethodDescriptorProto::class,
                messageCompanion = this,
                builder = ::MethodDescriptorProto,
                fields = listOf(
                    pbandk.wkt.MethodDescriptorProto.FieldDescriptors.name,
                    pbandk.wkt.MethodDescriptorProto.FieldDescriptors.inputType,
                    pbandk.wkt.MethodDescriptorProto.FieldDescriptors.outputType,
                    pbandk.wkt.MethodDescriptorProto.FieldDescriptors.options,
                    pbandk.wkt.MethodDescriptorProto.FieldDescriptors.clientStreaming,
                    pbandk.wkt.MethodDescriptorProto.FieldDescriptors.serverStreaming,
                ),
            )
        }
    }
}

public sealed interface MutableMethodDescriptorProto : pbandk.wkt.MethodDescriptorProto, pbandk.MutableMessage<pbandk.wkt.MethodDescriptorProto> {
    public override var name: String?
    public override var inputType: String?
    public override var outputType: String?
    public override var options: pbandk.wkt.MethodOptions?
    public override var clientStreaming: Boolean?
    public override var serverStreaming: Boolean?
}

public sealed interface FileOptions : pbandk.ExtendableMessage<pbandk.wkt.FileOptions> {
    public val javaPackage: String?
    public val javaOuterClassname: String?
    public val javaMultipleFiles: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public val javaGenerateEqualsAndHash: Boolean?
    public val javaStringCheckUtf8: Boolean?
    public val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?
    public val goPackage: String?
    public val ccGenericServices: Boolean?
    public val javaGenericServices: Boolean?
    public val pyGenericServices: Boolean?
    public val deprecated: Boolean?
    public val ccEnableArenas: Boolean?
    public val objcClassPrefix: String?
    public val csharpNamespace: String?
    public val swiftPrefix: String?
    public val phpClassPrefix: String?
    public val phpNamespace: String?
    public val phpMetadataNamespace: String?
    public val rubyPackage: String?
    public val features: pbandk.wkt.FeatureSet?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions>

    /**
     * The [MutableFileOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit): pbandk.wkt.FileOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        javaPackage: String? = this.javaPackage,
        javaOuterClassname: String? = this.javaOuterClassname,
        javaMultipleFiles: Boolean? = this.javaMultipleFiles,
        javaGenerateEqualsAndHash: Boolean? = @Suppress("DEPRECATION") this.javaGenerateEqualsAndHash,
        javaStringCheckUtf8: Boolean? = this.javaStringCheckUtf8,
        optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = this.optimizeFor,
        goPackage: String? = this.goPackage,
        ccGenericServices: Boolean? = this.ccGenericServices,
        javaGenericServices: Boolean? = this.javaGenericServices,
        pyGenericServices: Boolean? = this.pyGenericServices,
        deprecated: Boolean? = this.deprecated,
        ccEnableArenas: Boolean? = this.ccEnableArenas,
        objcClassPrefix: String? = this.objcClassPrefix,
        csharpNamespace: String? = this.csharpNamespace,
        swiftPrefix: String? = this.swiftPrefix,
        phpClassPrefix: String? = this.phpClassPrefix,
        phpNamespace: String? = this.phpNamespace,
        phpMetadataNamespace: String? = this.phpMetadataNamespace,
        rubyPackage: String? = this.rubyPackage,
        features: pbandk.wkt.FeatureSet? = this.features,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FileOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val javaPackage: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "java_package",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "javaPackage",
                value = pbandk.wkt.FileOptions::javaPackage,
                mutableValue = pbandk.wkt.MutableFileOptions::javaPackage,
            )
        public val javaOuterClassname: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "java_outer_classname",
                number = 8,
                valueType = pbandk.types.string(),
                jsonName = "javaOuterClassname",
                value = pbandk.wkt.FileOptions::javaOuterClassname,
                mutableValue = pbandk.wkt.MutableFileOptions::javaOuterClassname,
            )
        public val optimizeFor: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, pbandk.wkt.FileOptions.OptimizeMode?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "optimize_for",
                number = 9,
                valueType = pbandk.types.enum(pbandk.wkt.FileOptions.OptimizeMode),
                jsonName = "optimizeFor",
                value = pbandk.wkt.FileOptions::optimizeFor,
                mutableValue = pbandk.wkt.MutableFileOptions::optimizeFor,
            )
        public val javaMultipleFiles: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "java_multiple_files",
                number = 10,
                valueType = pbandk.types.bool(),
                jsonName = "javaMultipleFiles",
                value = pbandk.wkt.FileOptions::javaMultipleFiles,
                mutableValue = pbandk.wkt.MutableFileOptions::javaMultipleFiles,
            )
        public val goPackage: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "go_package",
                number = 11,
                valueType = pbandk.types.string(),
                jsonName = "goPackage",
                value = pbandk.wkt.FileOptions::goPackage,
                mutableValue = pbandk.wkt.MutableFileOptions::goPackage,
            )
        public val ccGenericServices: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "cc_generic_services",
                number = 16,
                valueType = pbandk.types.bool(),
                jsonName = "ccGenericServices",
                value = pbandk.wkt.FileOptions::ccGenericServices,
                mutableValue = pbandk.wkt.MutableFileOptions::ccGenericServices,
            )
        public val javaGenericServices: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "java_generic_services",
                number = 17,
                valueType = pbandk.types.bool(),
                jsonName = "javaGenericServices",
                value = pbandk.wkt.FileOptions::javaGenericServices,
                mutableValue = pbandk.wkt.MutableFileOptions::javaGenericServices,
            )
        public val pyGenericServices: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "py_generic_services",
                number = 18,
                valueType = pbandk.types.bool(),
                jsonName = "pyGenericServices",
                value = pbandk.wkt.FileOptions::pyGenericServices,
                mutableValue = pbandk.wkt.MutableFileOptions::pyGenericServices,
            )
        public val javaGenerateEqualsAndHash: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            @Suppress("DEPRECATION")
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "java_generate_equals_and_hash",
                number = 20,
                valueType = pbandk.types.bool(),
                jsonName = "javaGenerateEqualsAndHash",
                options = pbandk.wkt.FieldOptions {
                    deprecated = true
                },
                value = pbandk.wkt.FileOptions::javaGenerateEqualsAndHash,
                mutableValue = pbandk.wkt.MutableFileOptions::javaGenerateEqualsAndHash,
            )
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "deprecated",
                number = 23,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.FileOptions::deprecated,
                mutableValue = pbandk.wkt.MutableFileOptions::deprecated,
            )
        public val javaStringCheckUtf8: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "java_string_check_utf8",
                number = 27,
                valueType = pbandk.types.bool(),
                jsonName = "javaStringCheckUtf8",
                value = pbandk.wkt.FileOptions::javaStringCheckUtf8,
                mutableValue = pbandk.wkt.MutableFileOptions::javaStringCheckUtf8,
            )
        public val ccEnableArenas: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "cc_enable_arenas",
                number = 31,
                valueType = pbandk.types.bool(),
                jsonName = "ccEnableArenas",
                value = pbandk.wkt.FileOptions::ccEnableArenas,
                mutableValue = pbandk.wkt.MutableFileOptions::ccEnableArenas,
            )
        public val objcClassPrefix: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "objc_class_prefix",
                number = 36,
                valueType = pbandk.types.string(),
                jsonName = "objcClassPrefix",
                value = pbandk.wkt.FileOptions::objcClassPrefix,
                mutableValue = pbandk.wkt.MutableFileOptions::objcClassPrefix,
            )
        public val csharpNamespace: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "csharp_namespace",
                number = 37,
                valueType = pbandk.types.string(),
                jsonName = "csharpNamespace",
                value = pbandk.wkt.FileOptions::csharpNamespace,
                mutableValue = pbandk.wkt.MutableFileOptions::csharpNamespace,
            )
        public val swiftPrefix: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "swift_prefix",
                number = 39,
                valueType = pbandk.types.string(),
                jsonName = "swiftPrefix",
                value = pbandk.wkt.FileOptions::swiftPrefix,
                mutableValue = pbandk.wkt.MutableFileOptions::swiftPrefix,
            )
        public val phpClassPrefix: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "php_class_prefix",
                number = 40,
                valueType = pbandk.types.string(),
                jsonName = "phpClassPrefix",
                value = pbandk.wkt.FileOptions::phpClassPrefix,
                mutableValue = pbandk.wkt.MutableFileOptions::phpClassPrefix,
            )
        public val phpNamespace: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "php_namespace",
                number = 41,
                valueType = pbandk.types.string(),
                jsonName = "phpNamespace",
                value = pbandk.wkt.FileOptions::phpNamespace,
                mutableValue = pbandk.wkt.MutableFileOptions::phpNamespace,
            )
        public val phpMetadataNamespace: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "php_metadata_namespace",
                number = 44,
                valueType = pbandk.types.string(),
                jsonName = "phpMetadataNamespace",
                value = pbandk.wkt.FileOptions::phpMetadataNamespace,
                mutableValue = pbandk.wkt.MutableFileOptions::phpMetadataNamespace,
            )
        public val rubyPackage: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "ruby_package",
                number = 45,
                valueType = pbandk.types.string(),
                jsonName = "rubyPackage",
                value = pbandk.wkt.FileOptions::rubyPackage,
                mutableValue = pbandk.wkt.MutableFileOptions::rubyPackage,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.FileOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "features",
                number = 50,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.FileOptions::features,
                mutableValue = pbandk.wkt.MutableFileOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FileOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FileOptions::descriptor,
                messageMetadata = pbandk.wkt.FileOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.FileOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableFileOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FileOptions>() {
        override val defaultInstance: pbandk.wkt.FileOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FileOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FileOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FileOptions::class,
                messageCompanion = this,
                builder = ::FileOptions,
                fields = listOf(
                    pbandk.wkt.FileOptions.FieldDescriptors.javaPackage,
                    pbandk.wkt.FileOptions.FieldDescriptors.javaOuterClassname,
                    pbandk.wkt.FileOptions.FieldDescriptors.javaMultipleFiles,
                    pbandk.wkt.FileOptions.FieldDescriptors.javaGenerateEqualsAndHash,
                    pbandk.wkt.FileOptions.FieldDescriptors.javaStringCheckUtf8,
                    pbandk.wkt.FileOptions.FieldDescriptors.optimizeFor,
                    pbandk.wkt.FileOptions.FieldDescriptors.goPackage,
                    pbandk.wkt.FileOptions.FieldDescriptors.ccGenericServices,
                    pbandk.wkt.FileOptions.FieldDescriptors.javaGenericServices,
                    pbandk.wkt.FileOptions.FieldDescriptors.pyGenericServices,
                    pbandk.wkt.FileOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.FileOptions.FieldDescriptors.ccEnableArenas,
                    pbandk.wkt.FileOptions.FieldDescriptors.objcClassPrefix,
                    pbandk.wkt.FileOptions.FieldDescriptors.csharpNamespace,
                    pbandk.wkt.FileOptions.FieldDescriptors.swiftPrefix,
                    pbandk.wkt.FileOptions.FieldDescriptors.phpClassPrefix,
                    pbandk.wkt.FileOptions.FieldDescriptors.phpNamespace,
                    pbandk.wkt.FileOptions.FieldDescriptors.phpMetadataNamespace,
                    pbandk.wkt.FileOptions.FieldDescriptors.rubyPackage,
                    pbandk.wkt.FileOptions.FieldDescriptors.features,
                    pbandk.wkt.FileOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }

    public sealed interface OptimizeMode : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FileOptions.OptimizeMode>
            get() = pbandk.wkt.FileOptions.OptimizeMode.descriptor

        public object SPEED : OptimizeMode, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FileOptions.OptimizeMode>(
            value = 1,
            name = "SPEED",
        )
        public object CODE_SIZE : OptimizeMode, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FileOptions.OptimizeMode>(
            value = 2,
            name = "CODE_SIZE",
        )
        public object LITE_RUNTIME : OptimizeMode, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FileOptions.OptimizeMode>(
            value = 3,
            name = "LITE_RUNTIME",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : OptimizeMode, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FileOptions.OptimizeMode>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FileOptions.OptimizeMode> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FileOptions.OptimizeMode> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FileOptions.OptimizeMode",
                    enumClass = pbandk.wkt.FileOptions.OptimizeMode::class,
                    enumCompanion = this,
                )
            public val values: List<FileOptions.OptimizeMode> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(SPEED, CODE_SIZE, LITE_RUNTIME)
            }

            override fun fromValue(value: Int): pbandk.wkt.FileOptions.OptimizeMode =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FileOptions.OptimizeMode =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableFileOptions : pbandk.wkt.FileOptions, pbandk.MutableExtendableMessage<pbandk.wkt.FileOptions> {
    public override var javaPackage: String?
    public override var javaOuterClassname: String?
    public override var javaMultipleFiles: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public override var javaGenerateEqualsAndHash: Boolean?
    public override var javaStringCheckUtf8: Boolean?
    public override var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?
    public override var goPackage: String?
    public override var ccGenericServices: Boolean?
    public override var javaGenericServices: Boolean?
    public override var pyGenericServices: Boolean?
    public override var deprecated: Boolean?
    public override var ccEnableArenas: Boolean?
    public override var objcClassPrefix: String?
    public override var csharpNamespace: String?
    public override var swiftPrefix: String?
    public override var phpClassPrefix: String?
    public override var phpNamespace: String?
    public override var phpMetadataNamespace: String?
    public override var rubyPackage: String?
    public override var features: pbandk.wkt.FeatureSet?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface MessageOptions : pbandk.ExtendableMessage<pbandk.wkt.MessageOptions> {
    public val messageSetWireFormat: Boolean?
    public val noStandardDescriptorAccessor: Boolean?
    public val deprecated: Boolean?
    public val mapEntry: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public val deprecatedLegacyJsonFieldConflicts: Boolean?
    public val features: pbandk.wkt.FeatureSet?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MessageOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions>

    /**
     * The [MutableMessageOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit): pbandk.wkt.MessageOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        messageSetWireFormat: Boolean? = this.messageSetWireFormat,
        noStandardDescriptorAccessor: Boolean? = this.noStandardDescriptorAccessor,
        deprecated: Boolean? = this.deprecated,
        mapEntry: Boolean? = this.mapEntry,
        deprecatedLegacyJsonFieldConflicts: Boolean? = @Suppress("DEPRECATION") this.deprecatedLegacyJsonFieldConflicts,
        features: pbandk.wkt.FeatureSet? = this.features,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.MessageOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val messageSetWireFormat: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "message_set_wire_format",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "messageSetWireFormat",
                value = pbandk.wkt.MessageOptions::messageSetWireFormat,
                mutableValue = pbandk.wkt.MutableMessageOptions::messageSetWireFormat,
            )
        public val noStandardDescriptorAccessor: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "no_standard_descriptor_accessor",
                number = 2,
                valueType = pbandk.types.bool(),
                jsonName = "noStandardDescriptorAccessor",
                value = pbandk.wkt.MessageOptions::noStandardDescriptorAccessor,
                mutableValue = pbandk.wkt.MutableMessageOptions::noStandardDescriptorAccessor,
            )
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "deprecated",
                number = 3,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.MessageOptions::deprecated,
                mutableValue = pbandk.wkt.MutableMessageOptions::deprecated,
            )
        public val mapEntry: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "map_entry",
                number = 7,
                valueType = pbandk.types.bool(),
                jsonName = "mapEntry",
                value = pbandk.wkt.MessageOptions::mapEntry,
                mutableValue = pbandk.wkt.MutableMessageOptions::mapEntry,
            )
        public val deprecatedLegacyJsonFieldConflicts: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, Boolean?> =
            @Suppress("DEPRECATION")
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "deprecated_legacy_json_field_conflicts",
                number = 11,
                valueType = pbandk.types.bool(),
                jsonName = "deprecatedLegacyJsonFieldConflicts",
                options = pbandk.wkt.FieldOptions {
                    deprecated = true
                },
                value = pbandk.wkt.MessageOptions::deprecatedLegacyJsonFieldConflicts,
                mutableValue = pbandk.wkt.MutableMessageOptions::deprecatedLegacyJsonFieldConflicts,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "features",
                number = 12,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.MessageOptions::features,
                mutableValue = pbandk.wkt.MutableMessageOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.MessageOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
                messageMetadata = pbandk.wkt.MessageOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.MessageOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableMessageOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.MessageOptions>() {
        override val defaultInstance: pbandk.wkt.MessageOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.MessageOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.MessageOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.MessageOptions::class,
                messageCompanion = this,
                builder = ::MessageOptions,
                fields = listOf(
                    pbandk.wkt.MessageOptions.FieldDescriptors.messageSetWireFormat,
                    pbandk.wkt.MessageOptions.FieldDescriptors.noStandardDescriptorAccessor,
                    pbandk.wkt.MessageOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.MessageOptions.FieldDescriptors.mapEntry,
                    pbandk.wkt.MessageOptions.FieldDescriptors.deprecatedLegacyJsonFieldConflicts,
                    pbandk.wkt.MessageOptions.FieldDescriptors.features,
                    pbandk.wkt.MessageOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }
}

public sealed interface MutableMessageOptions : pbandk.wkt.MessageOptions, pbandk.MutableExtendableMessage<pbandk.wkt.MessageOptions> {
    public override var messageSetWireFormat: Boolean?
    public override var noStandardDescriptorAccessor: Boolean?
    public override var deprecated: Boolean?
    public override var mapEntry: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public override var deprecatedLegacyJsonFieldConflicts: Boolean?
    public override var features: pbandk.wkt.FeatureSet?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface FieldOptions : pbandk.ExtendableMessage<pbandk.wkt.FieldOptions> {
    public val ctype: pbandk.wkt.FieldOptions.CType?
    public val packed: Boolean?
    public val jstype: pbandk.wkt.FieldOptions.JSType?
    public val lazy: Boolean?
    public val unverifiedLazy: Boolean?
    public val deprecated: Boolean?
    public val weak: Boolean?
    public val debugRedact: Boolean?
    public val retention: pbandk.wkt.FieldOptions.OptionRetention?
    public val targets: List<pbandk.wkt.FieldOptions.OptionTargetType>
    public val editionDefaults: List<pbandk.wkt.FieldOptions.EditionDefault>
    public val features: pbandk.wkt.FeatureSet?
    public val featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions>

    /**
     * The [MutableFieldOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit): pbandk.wkt.FieldOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        ctype: pbandk.wkt.FieldOptions.CType? = this.ctype,
        packed: Boolean? = this.packed,
        jstype: pbandk.wkt.FieldOptions.JSType? = this.jstype,
        lazy: Boolean? = this.lazy,
        unverifiedLazy: Boolean? = this.unverifiedLazy,
        deprecated: Boolean? = this.deprecated,
        weak: Boolean? = this.weak,
        debugRedact: Boolean? = this.debugRedact,
        retention: pbandk.wkt.FieldOptions.OptionRetention? = this.retention,
        targets: List<pbandk.wkt.FieldOptions.OptionTargetType> = this.targets,
        editionDefaults: List<pbandk.wkt.FieldOptions.EditionDefault> = this.editionDefaults,
        features: pbandk.wkt.FeatureSet? = this.features,
        featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = this.featureSupport,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FieldOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val ctype: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, pbandk.wkt.FieldOptions.CType?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "ctype",
                number = 1,
                valueType = pbandk.types.enum(pbandk.wkt.FieldOptions.CType),
                jsonName = "ctype",
                value = pbandk.wkt.FieldOptions::ctype,
                mutableValue = pbandk.wkt.MutableFieldOptions::ctype,
            )
        public val packed: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "packed",
                number = 2,
                valueType = pbandk.types.bool(),
                jsonName = "packed",
                value = pbandk.wkt.FieldOptions::packed,
                mutableValue = pbandk.wkt.MutableFieldOptions::packed,
            )
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "deprecated",
                number = 3,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.FieldOptions::deprecated,
                mutableValue = pbandk.wkt.MutableFieldOptions::deprecated,
            )
        public val lazy: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "lazy",
                number = 5,
                valueType = pbandk.types.bool(),
                jsonName = "lazy",
                value = pbandk.wkt.FieldOptions::lazy,
                mutableValue = pbandk.wkt.MutableFieldOptions::lazy,
            )
        public val jstype: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, pbandk.wkt.FieldOptions.JSType?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "jstype",
                number = 6,
                valueType = pbandk.types.enum(pbandk.wkt.FieldOptions.JSType),
                jsonName = "jstype",
                value = pbandk.wkt.FieldOptions::jstype,
                mutableValue = pbandk.wkt.MutableFieldOptions::jstype,
            )
        public val weak: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "weak",
                number = 10,
                valueType = pbandk.types.bool(),
                jsonName = "weak",
                value = pbandk.wkt.FieldOptions::weak,
                mutableValue = pbandk.wkt.MutableFieldOptions::weak,
            )
        public val unverifiedLazy: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "unverified_lazy",
                number = 15,
                valueType = pbandk.types.bool(),
                jsonName = "unverifiedLazy",
                value = pbandk.wkt.FieldOptions::unverifiedLazy,
                mutableValue = pbandk.wkt.MutableFieldOptions::unverifiedLazy,
            )
        public val debugRedact: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "debug_redact",
                number = 16,
                valueType = pbandk.types.bool(),
                jsonName = "debugRedact",
                value = pbandk.wkt.FieldOptions::debugRedact,
                mutableValue = pbandk.wkt.MutableFieldOptions::debugRedact,
            )
        public val retention: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, pbandk.wkt.FieldOptions.OptionRetention?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "retention",
                number = 17,
                valueType = pbandk.types.enum(pbandk.wkt.FieldOptions.OptionRetention),
                jsonName = "retention",
                value = pbandk.wkt.FieldOptions::retention,
                mutableValue = pbandk.wkt.MutableFieldOptions::retention,
            )
        public val targets: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FieldOptions, List<pbandk.wkt.FieldOptions.OptionTargetType>, MutableList<pbandk.wkt.FieldOptions.OptionTargetType>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "targets",
                number = 19,
                valueType = pbandk.types.enum(pbandk.wkt.FieldOptions.OptionTargetType),
                jsonName = "targets",
                value = pbandk.wkt.FieldOptions::targets,
                mutableValue = pbandk.wkt.MutableFieldOptions::targets,
            )
        public val editionDefaults: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FieldOptions, List<pbandk.wkt.FieldOptions.EditionDefault>, MutableList<pbandk.wkt.FieldOptions.EditionDefault>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "edition_defaults",
                number = 20,
                valueType = pbandk.types.message(pbandk.wkt.FieldOptions.EditionDefault),
                jsonName = "editionDefaults",
                value = pbandk.wkt.FieldOptions::editionDefaults,
                mutableValue = pbandk.wkt.MutableFieldOptions::editionDefaults,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "features",
                number = 21,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.FieldOptions::features,
                mutableValue = pbandk.wkt.MutableFieldOptions::features,
            )
        public val featureSupport: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, pbandk.wkt.FieldOptions.FeatureSupport?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "feature_support",
                number = 22,
                valueType = pbandk.types.message(pbandk.wkt.FieldOptions.FeatureSupport),
                jsonName = "featureSupport",
                value = pbandk.wkt.FieldOptions::featureSupport,
                mutableValue = pbandk.wkt.MutableFieldOptions::featureSupport,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FieldOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
                messageMetadata = pbandk.wkt.FieldOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.FieldOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableFieldOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions>() {
        override val defaultInstance: pbandk.wkt.FieldOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FieldOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FieldOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FieldOptions::class,
                messageCompanion = this,
                builder = ::FieldOptions,
                fields = listOf(
                    pbandk.wkt.FieldOptions.FieldDescriptors.ctype,
                    pbandk.wkt.FieldOptions.FieldDescriptors.packed,
                    pbandk.wkt.FieldOptions.FieldDescriptors.jstype,
                    pbandk.wkt.FieldOptions.FieldDescriptors.lazy,
                    pbandk.wkt.FieldOptions.FieldDescriptors.unverifiedLazy,
                    pbandk.wkt.FieldOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.FieldOptions.FieldDescriptors.weak,
                    pbandk.wkt.FieldOptions.FieldDescriptors.debugRedact,
                    pbandk.wkt.FieldOptions.FieldDescriptors.retention,
                    pbandk.wkt.FieldOptions.FieldDescriptors.targets,
                    pbandk.wkt.FieldOptions.FieldDescriptors.editionDefaults,
                    pbandk.wkt.FieldOptions.FieldDescriptors.features,
                    pbandk.wkt.FieldOptions.FieldDescriptors.featureSupport,
                    pbandk.wkt.FieldOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }

        @Deprecated(
            message = "Use FieldOptions.EditionDefault { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.FieldOptions.EditionDefault"],
                expression = "FieldOptions.EditionDefault {\nthis.edition = edition\nthis.value = value\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun EditionDefault(
            edition: pbandk.wkt.Edition? = null,
            value: String? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.FieldOptions.EditionDefault = pbandk.wkt.FieldOptions.EditionDefault {
            this.edition = edition
            this.value = value
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use FieldOptions.FeatureSupport { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.FieldOptions.FeatureSupport"],
                expression = "FieldOptions.FeatureSupport {\nthis.editionIntroduced = editionIntroduced\nthis.editionDeprecated = editionDeprecated\nthis.deprecationWarning = deprecationWarning\nthis.editionRemoved = editionRemoved\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun FeatureSupport(
            editionIntroduced: pbandk.wkt.Edition? = null,
            editionDeprecated: pbandk.wkt.Edition? = null,
            deprecationWarning: String? = null,
            editionRemoved: pbandk.wkt.Edition? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.FieldOptions.FeatureSupport = pbandk.wkt.FieldOptions.FeatureSupport {
            this.editionIntroduced = editionIntroduced
            this.editionDeprecated = editionDeprecated
            this.deprecationWarning = deprecationWarning
            this.editionRemoved = editionRemoved
            this.unknownFields += unknownFields
        }
    }

    public sealed interface CType : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.CType>
            get() = pbandk.wkt.FieldOptions.CType.descriptor

        public object STRING : CType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.CType>(
            value = 0,
            name = "STRING",
        )
        public object CORD : CType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.CType>(
            value = 1,
            name = "CORD",
        )
        public object STRING_PIECE : CType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.CType>(
            value = 2,
            name = "STRING_PIECE",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : CType, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FieldOptions.CType>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.CType> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.CType> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FieldOptions.CType",
                    enumClass = pbandk.wkt.FieldOptions.CType::class,
                    enumCompanion = this,
                )
            public val values: List<FieldOptions.CType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(STRING, CORD, STRING_PIECE)
            }

            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.CType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FieldOptions.CType =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface JSType : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.JSType>
            get() = pbandk.wkt.FieldOptions.JSType.descriptor

        public object JS_NORMAL : JSType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.JSType>(
            value = 0,
            name = "JS_NORMAL",
        )
        public object JS_STRING : JSType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.JSType>(
            value = 1,
            name = "JS_STRING",
        )
        public object JS_NUMBER : JSType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.JSType>(
            value = 2,
            name = "JS_NUMBER",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : JSType, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FieldOptions.JSType>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.JSType> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.JSType> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FieldOptions.JSType",
                    enumClass = pbandk.wkt.FieldOptions.JSType::class,
                    enumCompanion = this,
                )
            public val values: List<FieldOptions.JSType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(JS_NORMAL, JS_STRING, JS_NUMBER)
            }

            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.JSType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FieldOptions.JSType =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface OptionRetention : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.OptionRetention>
            get() = pbandk.wkt.FieldOptions.OptionRetention.descriptor

        public object RETENTION_UNKNOWN : OptionRetention, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionRetention>(
            value = 0,
            name = "RETENTION_UNKNOWN",
        )
        public object RETENTION_RUNTIME : OptionRetention, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionRetention>(
            value = 1,
            name = "RETENTION_RUNTIME",
        )
        public object RETENTION_SOURCE : OptionRetention, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionRetention>(
            value = 2,
            name = "RETENTION_SOURCE",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : OptionRetention, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FieldOptions.OptionRetention>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.OptionRetention> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.OptionRetention> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FieldOptions.OptionRetention",
                    enumClass = pbandk.wkt.FieldOptions.OptionRetention::class,
                    enumCompanion = this,
                )
            public val values: List<FieldOptions.OptionRetention> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(RETENTION_UNKNOWN, RETENTION_RUNTIME, RETENTION_SOURCE)
            }

            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.OptionRetention =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FieldOptions.OptionRetention =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface OptionTargetType : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.OptionTargetType>
            get() = pbandk.wkt.FieldOptions.OptionTargetType.descriptor

        public object TARGET_TYPE_UNKNOWN : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 0,
            name = "TARGET_TYPE_UNKNOWN",
        )
        public object TARGET_TYPE_FILE : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 1,
            name = "TARGET_TYPE_FILE",
        )
        public object TARGET_TYPE_EXTENSION_RANGE : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 2,
            name = "TARGET_TYPE_EXTENSION_RANGE",
        )
        public object TARGET_TYPE_MESSAGE : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 3,
            name = "TARGET_TYPE_MESSAGE",
        )
        public object TARGET_TYPE_FIELD : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 4,
            name = "TARGET_TYPE_FIELD",
        )
        public object TARGET_TYPE_ONEOF : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 5,
            name = "TARGET_TYPE_ONEOF",
        )
        public object TARGET_TYPE_ENUM : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 6,
            name = "TARGET_TYPE_ENUM",
        )
        public object TARGET_TYPE_ENUM_ENTRY : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 7,
            name = "TARGET_TYPE_ENUM_ENTRY",
        )
        public object TARGET_TYPE_SERVICE : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 8,
            name = "TARGET_TYPE_SERVICE",
        )
        public object TARGET_TYPE_METHOD : OptionTargetType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(
            value = 9,
            name = "TARGET_TYPE_METHOD",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : OptionTargetType, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FieldOptions.OptionTargetType>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.OptionTargetType> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FieldOptions.OptionTargetType> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FieldOptions.OptionTargetType",
                    enumClass = pbandk.wkt.FieldOptions.OptionTargetType::class,
                    enumCompanion = this,
                )
            public val values: List<FieldOptions.OptionTargetType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(
                    TARGET_TYPE_UNKNOWN, TARGET_TYPE_FILE, TARGET_TYPE_EXTENSION_RANGE, TARGET_TYPE_MESSAGE, TARGET_TYPE_FIELD,
                    TARGET_TYPE_ONEOF, TARGET_TYPE_ENUM, TARGET_TYPE_ENUM_ENTRY, TARGET_TYPE_SERVICE, TARGET_TYPE_METHOD,
                )
            }

            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.OptionTargetType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FieldOptions.OptionTargetType =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface EditionDefault : pbandk.Message {
        public val edition: pbandk.wkt.Edition?
        public val value: String?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions.EditionDefault
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.EditionDefault>

        /**
         * The [FieldOptions.MutableEditionDefault] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.FieldOptions.MutableEditionDefault.() -> Unit): pbandk.wkt.FieldOptions.EditionDefault

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            edition: pbandk.wkt.Edition? = this.edition,
            value: String? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.FieldOptions.EditionDefault

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val value: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions.EditionDefault, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FieldOptions.EditionDefault::descriptor,
                    messageMetadata = pbandk.wkt.FieldOptions.EditionDefault.messageMetadata,
                    name = "value",
                    number = 2,
                    valueType = pbandk.types.string(),
                    jsonName = "value",
                    value = pbandk.wkt.FieldOptions.EditionDefault::value,
                    mutableValue = pbandk.wkt.FieldOptions.MutableEditionDefault::value,
                )
            public val edition: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions.EditionDefault, pbandk.wkt.Edition?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FieldOptions.EditionDefault::descriptor,
                    messageMetadata = pbandk.wkt.FieldOptions.EditionDefault.messageMetadata,
                    name = "edition",
                    number = 3,
                    valueType = pbandk.types.enum(pbandk.wkt.Edition),
                    jsonName = "edition",
                    value = pbandk.wkt.FieldOptions.EditionDefault::edition,
                    mutableValue = pbandk.wkt.FieldOptions.MutableEditionDefault::edition,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions.EditionDefault>() {
            override val defaultInstance: pbandk.wkt.FieldOptions.EditionDefault by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.FieldOptions.EditionDefault {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.FieldOptions.EditionDefault",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.EditionDefault> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.FieldOptions.EditionDefault::class,
                    messageCompanion = this,
                    builder = FieldOptions.Companion::EditionDefault,
                    fields = listOf(
                        pbandk.wkt.FieldOptions.EditionDefault.FieldDescriptors.edition,
                        pbandk.wkt.FieldOptions.EditionDefault.FieldDescriptors.value,
                    ),
                )
            }
        }
    }

    public sealed interface MutableEditionDefault : pbandk.wkt.FieldOptions.EditionDefault, pbandk.MutableMessage<pbandk.wkt.FieldOptions.EditionDefault> {
        public override var edition: pbandk.wkt.Edition?
        public override var value: String?
    }

    public sealed interface FeatureSupport : pbandk.Message {
        public val editionIntroduced: pbandk.wkt.Edition?
        public val editionDeprecated: pbandk.wkt.Edition?
        public val deprecationWarning: String?
        public val editionRemoved: pbandk.wkt.Edition?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions.FeatureSupport
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.FeatureSupport>

        /**
         * The [FieldOptions.MutableFeatureSupport] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.FieldOptions.MutableFeatureSupport.() -> Unit): pbandk.wkt.FieldOptions.FeatureSupport

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            editionIntroduced: pbandk.wkt.Edition? = this.editionIntroduced,
            editionDeprecated: pbandk.wkt.Edition? = this.editionDeprecated,
            deprecationWarning: String? = this.deprecationWarning,
            editionRemoved: pbandk.wkt.Edition? = this.editionRemoved,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.FieldOptions.FeatureSupport

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val editionIntroduced: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions.FeatureSupport, pbandk.wkt.Edition?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FieldOptions.FeatureSupport::descriptor,
                    messageMetadata = pbandk.wkt.FieldOptions.FeatureSupport.messageMetadata,
                    name = "edition_introduced",
                    number = 1,
                    valueType = pbandk.types.enum(pbandk.wkt.Edition),
                    jsonName = "editionIntroduced",
                    value = pbandk.wkt.FieldOptions.FeatureSupport::editionIntroduced,
                    mutableValue = pbandk.wkt.FieldOptions.MutableFeatureSupport::editionIntroduced,
                )
            public val editionDeprecated: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions.FeatureSupport, pbandk.wkt.Edition?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FieldOptions.FeatureSupport::descriptor,
                    messageMetadata = pbandk.wkt.FieldOptions.FeatureSupport.messageMetadata,
                    name = "edition_deprecated",
                    number = 2,
                    valueType = pbandk.types.enum(pbandk.wkt.Edition),
                    jsonName = "editionDeprecated",
                    value = pbandk.wkt.FieldOptions.FeatureSupport::editionDeprecated,
                    mutableValue = pbandk.wkt.FieldOptions.MutableFeatureSupport::editionDeprecated,
                )
            public val deprecationWarning: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions.FeatureSupport, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FieldOptions.FeatureSupport::descriptor,
                    messageMetadata = pbandk.wkt.FieldOptions.FeatureSupport.messageMetadata,
                    name = "deprecation_warning",
                    number = 3,
                    valueType = pbandk.types.string(),
                    jsonName = "deprecationWarning",
                    value = pbandk.wkt.FieldOptions.FeatureSupport::deprecationWarning,
                    mutableValue = pbandk.wkt.FieldOptions.MutableFeatureSupport::deprecationWarning,
                )
            public val editionRemoved: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions.FeatureSupport, pbandk.wkt.Edition?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FieldOptions.FeatureSupport::descriptor,
                    messageMetadata = pbandk.wkt.FieldOptions.FeatureSupport.messageMetadata,
                    name = "edition_removed",
                    number = 4,
                    valueType = pbandk.types.enum(pbandk.wkt.Edition),
                    jsonName = "editionRemoved",
                    value = pbandk.wkt.FieldOptions.FeatureSupport::editionRemoved,
                    mutableValue = pbandk.wkt.FieldOptions.MutableFeatureSupport::editionRemoved,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions.FeatureSupport>() {
            override val defaultInstance: pbandk.wkt.FieldOptions.FeatureSupport by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.FieldOptions.FeatureSupport {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.FieldOptions.FeatureSupport",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.FeatureSupport> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.FieldOptions.FeatureSupport::class,
                    messageCompanion = this,
                    builder = FieldOptions.Companion::FeatureSupport,
                    fields = listOf(
                        pbandk.wkt.FieldOptions.FeatureSupport.FieldDescriptors.editionIntroduced,
                        pbandk.wkt.FieldOptions.FeatureSupport.FieldDescriptors.editionDeprecated,
                        pbandk.wkt.FieldOptions.FeatureSupport.FieldDescriptors.deprecationWarning,
                        pbandk.wkt.FieldOptions.FeatureSupport.FieldDescriptors.editionRemoved,
                    ),
                )
            }
        }
    }

    public sealed interface MutableFeatureSupport : pbandk.wkt.FieldOptions.FeatureSupport, pbandk.MutableMessage<pbandk.wkt.FieldOptions.FeatureSupport> {
        public override var editionIntroduced: pbandk.wkt.Edition?
        public override var editionDeprecated: pbandk.wkt.Edition?
        public override var deprecationWarning: String?
        public override var editionRemoved: pbandk.wkt.Edition?
    }
}

public sealed interface MutableFieldOptions : pbandk.wkt.FieldOptions, pbandk.MutableExtendableMessage<pbandk.wkt.FieldOptions> {
    public override var ctype: pbandk.wkt.FieldOptions.CType?
    public override var packed: Boolean?
    public override var jstype: pbandk.wkt.FieldOptions.JSType?
    public override var lazy: Boolean?
    public override var unverifiedLazy: Boolean?
    public override var deprecated: Boolean?
    public override var weak: Boolean?
    public override var debugRedact: Boolean?
    public override var retention: pbandk.wkt.FieldOptions.OptionRetention?
    public override val targets: MutableList<pbandk.wkt.FieldOptions.OptionTargetType>
    public override val editionDefaults: MutableList<pbandk.wkt.FieldOptions.EditionDefault>
    public override var features: pbandk.wkt.FeatureSet?
    public override var featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface OneofOptions : pbandk.ExtendableMessage<pbandk.wkt.OneofOptions> {
    public val features: pbandk.wkt.FeatureSet?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.OneofOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions>

    /**
     * The [MutableOneofOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit): pbandk.wkt.OneofOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        features: pbandk.wkt.FeatureSet? = this.features,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.OneofOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val features: pbandk.FieldDescriptor<pbandk.wkt.OneofOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.OneofOptions::descriptor,
                messageMetadata = pbandk.wkt.OneofOptions.messageMetadata,
                name = "features",
                number = 1,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.OneofOptions::features,
                mutableValue = pbandk.wkt.MutableOneofOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.OneofOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.OneofOptions::descriptor,
                messageMetadata = pbandk.wkt.OneofOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.OneofOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableOneofOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.OneofOptions>() {
        override val defaultInstance: pbandk.wkt.OneofOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.OneofOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.OneofOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.OneofOptions::class,
                messageCompanion = this,
                builder = ::OneofOptions,
                fields = listOf(
                    pbandk.wkt.OneofOptions.FieldDescriptors.features,
                    pbandk.wkt.OneofOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }
}

public sealed interface MutableOneofOptions : pbandk.wkt.OneofOptions, pbandk.MutableExtendableMessage<pbandk.wkt.OneofOptions> {
    public override var features: pbandk.wkt.FeatureSet?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface EnumOptions : pbandk.ExtendableMessage<pbandk.wkt.EnumOptions> {
    public val allowAlias: Boolean?
    public val deprecated: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public val deprecatedLegacyJsonFieldConflicts: Boolean?
    public val features: pbandk.wkt.FeatureSet?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions>

    /**
     * The [MutableEnumOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit): pbandk.wkt.EnumOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        allowAlias: Boolean? = this.allowAlias,
        deprecated: Boolean? = this.deprecated,
        deprecatedLegacyJsonFieldConflicts: Boolean? = @Suppress("DEPRECATION") this.deprecatedLegacyJsonFieldConflicts,
        features: pbandk.wkt.FeatureSet? = this.features,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val allowAlias: pbandk.FieldDescriptor<pbandk.wkt.EnumOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumOptions.messageMetadata,
                name = "allow_alias",
                number = 2,
                valueType = pbandk.types.bool(),
                jsonName = "allowAlias",
                value = pbandk.wkt.EnumOptions::allowAlias,
                mutableValue = pbandk.wkt.MutableEnumOptions::allowAlias,
            )
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.EnumOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumOptions.messageMetadata,
                name = "deprecated",
                number = 3,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.EnumOptions::deprecated,
                mutableValue = pbandk.wkt.MutableEnumOptions::deprecated,
            )
        public val deprecatedLegacyJsonFieldConflicts: pbandk.FieldDescriptor<pbandk.wkt.EnumOptions, Boolean?> =
            @Suppress("DEPRECATION")
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumOptions.messageMetadata,
                name = "deprecated_legacy_json_field_conflicts",
                number = 6,
                valueType = pbandk.types.bool(),
                jsonName = "deprecatedLegacyJsonFieldConflicts",
                options = pbandk.wkt.FieldOptions {
                    deprecated = true
                },
                value = pbandk.wkt.EnumOptions::deprecatedLegacyJsonFieldConflicts,
                mutableValue = pbandk.wkt.MutableEnumOptions::deprecatedLegacyJsonFieldConflicts,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.EnumOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumOptions.messageMetadata,
                name = "features",
                number = 7,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.EnumOptions::features,
                mutableValue = pbandk.wkt.MutableEnumOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.EnumOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.EnumOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.EnumOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableEnumOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumOptions>() {
        override val defaultInstance: pbandk.wkt.EnumOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.EnumOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.EnumOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.EnumOptions::class,
                messageCompanion = this,
                builder = ::EnumOptions,
                fields = listOf(
                    pbandk.wkt.EnumOptions.FieldDescriptors.allowAlias,
                    pbandk.wkt.EnumOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.EnumOptions.FieldDescriptors.deprecatedLegacyJsonFieldConflicts,
                    pbandk.wkt.EnumOptions.FieldDescriptors.features,
                    pbandk.wkt.EnumOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }
}

public sealed interface MutableEnumOptions : pbandk.wkt.EnumOptions, pbandk.MutableExtendableMessage<pbandk.wkt.EnumOptions> {
    public override var allowAlias: Boolean?
    public override var deprecated: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public override var deprecatedLegacyJsonFieldConflicts: Boolean?
    public override var features: pbandk.wkt.FeatureSet?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface EnumValueOptions : pbandk.ExtendableMessage<pbandk.wkt.EnumValueOptions> {
    public val deprecated: Boolean?
    public val features: pbandk.wkt.FeatureSet?
    public val debugRedact: Boolean?
    public val featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValueOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions>

    /**
     * The [MutableEnumValueOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit): pbandk.wkt.EnumValueOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        deprecated: Boolean? = this.deprecated,
        features: pbandk.wkt.FeatureSet? = this.features,
        debugRedact: Boolean? = this.debugRedact,
        featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = this.featureSupport,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValueOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.EnumValueOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumValueOptions.messageMetadata,
                name = "deprecated",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.EnumValueOptions::deprecated,
                mutableValue = pbandk.wkt.MutableEnumValueOptions::deprecated,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.EnumValueOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumValueOptions.messageMetadata,
                name = "features",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.EnumValueOptions::features,
                mutableValue = pbandk.wkt.MutableEnumValueOptions::features,
            )
        public val debugRedact: pbandk.FieldDescriptor<pbandk.wkt.EnumValueOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumValueOptions.messageMetadata,
                name = "debug_redact",
                number = 3,
                valueType = pbandk.types.bool(),
                jsonName = "debugRedact",
                value = pbandk.wkt.EnumValueOptions::debugRedact,
                mutableValue = pbandk.wkt.MutableEnumValueOptions::debugRedact,
            )
        public val featureSupport: pbandk.FieldDescriptor<pbandk.wkt.EnumValueOptions, pbandk.wkt.FieldOptions.FeatureSupport?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.EnumValueOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumValueOptions.messageMetadata,
                name = "feature_support",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.FieldOptions.FeatureSupport),
                jsonName = "featureSupport",
                value = pbandk.wkt.EnumValueOptions::featureSupport,
                mutableValue = pbandk.wkt.MutableEnumValueOptions::featureSupport,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.EnumValueOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.EnumValueOptions::descriptor,
                messageMetadata = pbandk.wkt.EnumValueOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.EnumValueOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableEnumValueOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueOptions>() {
        override val defaultInstance: pbandk.wkt.EnumValueOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.EnumValueOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.EnumValueOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.EnumValueOptions::class,
                messageCompanion = this,
                builder = ::EnumValueOptions,
                fields = listOf(
                    pbandk.wkt.EnumValueOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.EnumValueOptions.FieldDescriptors.features,
                    pbandk.wkt.EnumValueOptions.FieldDescriptors.debugRedact,
                    pbandk.wkt.EnumValueOptions.FieldDescriptors.featureSupport,
                    pbandk.wkt.EnumValueOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }
}

public sealed interface MutableEnumValueOptions : pbandk.wkt.EnumValueOptions, pbandk.MutableExtendableMessage<pbandk.wkt.EnumValueOptions> {
    public override var deprecated: Boolean?
    public override var features: pbandk.wkt.FeatureSet?
    public override var debugRedact: Boolean?
    public override var featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface ServiceOptions : pbandk.ExtendableMessage<pbandk.wkt.ServiceOptions> {
    public val features: pbandk.wkt.FeatureSet?
    public val deprecated: Boolean?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ServiceOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions>

    /**
     * The [MutableServiceOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit): pbandk.wkt.ServiceOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        features: pbandk.wkt.FeatureSet? = this.features,
        deprecated: Boolean? = this.deprecated,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ServiceOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.ServiceOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.ServiceOptions::descriptor,
                messageMetadata = pbandk.wkt.ServiceOptions.messageMetadata,
                name = "deprecated",
                number = 33,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.ServiceOptions::deprecated,
                mutableValue = pbandk.wkt.MutableServiceOptions::deprecated,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.ServiceOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.ServiceOptions::descriptor,
                messageMetadata = pbandk.wkt.ServiceOptions.messageMetadata,
                name = "features",
                number = 34,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.ServiceOptions::features,
                mutableValue = pbandk.wkt.MutableServiceOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.ServiceOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.ServiceOptions::descriptor,
                messageMetadata = pbandk.wkt.ServiceOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.ServiceOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableServiceOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.ServiceOptions>() {
        override val defaultInstance: pbandk.wkt.ServiceOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.ServiceOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.ServiceOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.ServiceOptions::class,
                messageCompanion = this,
                builder = ::ServiceOptions,
                fields = listOf(
                    pbandk.wkt.ServiceOptions.FieldDescriptors.features,
                    pbandk.wkt.ServiceOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.ServiceOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }
}

public sealed interface MutableServiceOptions : pbandk.wkt.ServiceOptions, pbandk.MutableExtendableMessage<pbandk.wkt.ServiceOptions> {
    public override var features: pbandk.wkt.FeatureSet?
    public override var deprecated: Boolean?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface MethodOptions : pbandk.ExtendableMessage<pbandk.wkt.MethodOptions> {
    public val deprecated: Boolean?
    public val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?
    public val features: pbandk.wkt.FeatureSet?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MethodOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions>

    /**
     * The [MutableMethodOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit): pbandk.wkt.MethodOptions

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        deprecated: Boolean? = this.deprecated,
        idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = this.idempotencyLevel,
        features: pbandk.wkt.FeatureSet? = this.features,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.MethodOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val deprecated: pbandk.FieldDescriptor<pbandk.wkt.MethodOptions, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodOptions::descriptor,
                messageMetadata = pbandk.wkt.MethodOptions.messageMetadata,
                name = "deprecated",
                number = 33,
                valueType = pbandk.types.bool(),
                jsonName = "deprecated",
                value = pbandk.wkt.MethodOptions::deprecated,
                mutableValue = pbandk.wkt.MutableMethodOptions::deprecated,
            )
        public val idempotencyLevel: pbandk.FieldDescriptor<pbandk.wkt.MethodOptions, pbandk.wkt.MethodOptions.IdempotencyLevel?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodOptions::descriptor,
                messageMetadata = pbandk.wkt.MethodOptions.messageMetadata,
                name = "idempotency_level",
                number = 34,
                valueType = pbandk.types.enum(pbandk.wkt.MethodOptions.IdempotencyLevel),
                jsonName = "idempotencyLevel",
                value = pbandk.wkt.MethodOptions::idempotencyLevel,
                mutableValue = pbandk.wkt.MutableMethodOptions::idempotencyLevel,
            )
        public val features: pbandk.FieldDescriptor<pbandk.wkt.MethodOptions, pbandk.wkt.FeatureSet?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.MethodOptions::descriptor,
                messageMetadata = pbandk.wkt.MethodOptions.messageMetadata,
                name = "features",
                number = 35,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                jsonName = "features",
                value = pbandk.wkt.MethodOptions::features,
                mutableValue = pbandk.wkt.MutableMethodOptions::features,
            )
        public val uninterpretedOption: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.MethodOptions, List<pbandk.wkt.UninterpretedOption>, MutableList<pbandk.wkt.UninterpretedOption>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.MethodOptions::descriptor,
                messageMetadata = pbandk.wkt.MethodOptions.messageMetadata,
                name = "uninterpreted_option",
                number = 999,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption),
                jsonName = "uninterpretedOption",
                value = pbandk.wkt.MethodOptions::uninterpretedOption,
                mutableValue = pbandk.wkt.MutableMethodOptions::uninterpretedOption,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.MethodOptions>() {
        override val defaultInstance: pbandk.wkt.MethodOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.MethodOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.MethodOptions",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.MethodOptions::class,
                messageCompanion = this,
                builder = ::MethodOptions,
                fields = listOf(
                    pbandk.wkt.MethodOptions.FieldDescriptors.deprecated,
                    pbandk.wkt.MethodOptions.FieldDescriptors.idempotencyLevel,
                    pbandk.wkt.MethodOptions.FieldDescriptors.features,
                    pbandk.wkt.MethodOptions.FieldDescriptors.uninterpretedOption,
                ),
            )
        }
    }

    public sealed interface IdempotencyLevel : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.MethodOptions.IdempotencyLevel>
            get() = pbandk.wkt.MethodOptions.IdempotencyLevel.descriptor

        public object IDEMPOTENCY_UNKNOWN : IdempotencyLevel, pbandk.gen.GeneratedEnumValue<pbandk.wkt.MethodOptions.IdempotencyLevel>(
            value = 0,
            name = "IDEMPOTENCY_UNKNOWN",
        )
        public object NO_SIDE_EFFECTS : IdempotencyLevel, pbandk.gen.GeneratedEnumValue<pbandk.wkt.MethodOptions.IdempotencyLevel>(
            value = 1,
            name = "NO_SIDE_EFFECTS",
        )
        public object IDEMPOTENT : IdempotencyLevel, pbandk.gen.GeneratedEnumValue<pbandk.wkt.MethodOptions.IdempotencyLevel>(
            value = 2,
            name = "IDEMPOTENT",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : IdempotencyLevel, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.MethodOptions.IdempotencyLevel>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.MethodOptions.IdempotencyLevel> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.MethodOptions.IdempotencyLevel> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.MethodOptions.IdempotencyLevel",
                    enumClass = pbandk.wkt.MethodOptions.IdempotencyLevel::class,
                    enumCompanion = this,
                )
            public val values: List<MethodOptions.IdempotencyLevel> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT)
            }

            override fun fromValue(value: Int): pbandk.wkt.MethodOptions.IdempotencyLevel =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.MethodOptions.IdempotencyLevel =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableMethodOptions : pbandk.wkt.MethodOptions, pbandk.MutableExtendableMessage<pbandk.wkt.MethodOptions> {
    public override var deprecated: Boolean?
    public override var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?
    public override var features: pbandk.wkt.FeatureSet?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface UninterpretedOption : pbandk.Message {
    public val name: List<pbandk.wkt.UninterpretedOption.NamePart>
    public val identifierValue: String?
    public val positiveIntValue: Long?
    public val negativeIntValue: Long?
    public val doubleValue: Double?
    public val stringValue: pbandk.ByteArr?
    public val aggregateValue: String?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UninterpretedOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption>

    /**
     * The [MutableUninterpretedOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit): pbandk.wkt.UninterpretedOption

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: List<pbandk.wkt.UninterpretedOption.NamePart> = this.name,
        identifierValue: String? = this.identifierValue,
        positiveIntValue: Long? = this.positiveIntValue,
        negativeIntValue: Long? = this.negativeIntValue,
        doubleValue: Double? = this.doubleValue,
        stringValue: pbandk.ByteArr? = this.stringValue,
        aggregateValue: String? = this.aggregateValue,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UninterpretedOption

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.UninterpretedOption, List<pbandk.wkt.UninterpretedOption.NamePart>, MutableList<pbandk.wkt.UninterpretedOption.NamePart>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "name",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.UninterpretedOption.NamePart),
                jsonName = "name",
                value = pbandk.wkt.UninterpretedOption::name,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::name,
            )
        public val identifierValue: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "identifier_value",
                number = 3,
                valueType = pbandk.types.string(),
                jsonName = "identifierValue",
                value = pbandk.wkt.UninterpretedOption::identifierValue,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::identifierValue,
            )
        public val positiveIntValue: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "positive_int_value",
                number = 4,
                valueType = pbandk.types.uint64(),
                jsonName = "positiveIntValue",
                value = pbandk.wkt.UninterpretedOption::positiveIntValue,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::positiveIntValue,
            )
        public val negativeIntValue: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "negative_int_value",
                number = 5,
                valueType = pbandk.types.int64(),
                jsonName = "negativeIntValue",
                value = pbandk.wkt.UninterpretedOption::negativeIntValue,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::negativeIntValue,
            )
        public val doubleValue: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "double_value",
                number = 6,
                valueType = pbandk.types.double(),
                jsonName = "doubleValue",
                value = pbandk.wkt.UninterpretedOption::doubleValue,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::doubleValue,
            )
        public val stringValue: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "string_value",
                number = 7,
                valueType = pbandk.types.bytes(),
                jsonName = "stringValue",
                value = pbandk.wkt.UninterpretedOption::stringValue,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::stringValue,
            )
        public val aggregateValue: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.UninterpretedOption::descriptor,
                messageMetadata = pbandk.wkt.UninterpretedOption.messageMetadata,
                name = "aggregate_value",
                number = 8,
                valueType = pbandk.types.string(),
                jsonName = "aggregateValue",
                value = pbandk.wkt.UninterpretedOption::aggregateValue,
                mutableValue = pbandk.wkt.MutableUninterpretedOption::aggregateValue,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption>() {
        override val defaultInstance: pbandk.wkt.UninterpretedOption by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.UninterpretedOption {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.UninterpretedOption",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.UninterpretedOption::class,
                messageCompanion = this,
                builder = ::UninterpretedOption,
                fields = listOf(
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.name,
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.identifierValue,
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.positiveIntValue,
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.negativeIntValue,
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.doubleValue,
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.stringValue,
                    pbandk.wkt.UninterpretedOption.FieldDescriptors.aggregateValue,
                ),
            )
        }

        @Deprecated(
            message = "Use UninterpretedOption.NamePart { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.UninterpretedOption.NamePart"],
                expression = "UninterpretedOption.NamePart {\nthis.namePart = namePart\nthis.isExtension = isExtension\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun NamePart(
            namePart: String,
            isExtension: Boolean,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.UninterpretedOption.NamePart = pbandk.wkt.UninterpretedOption.NamePart {
            this.namePart = namePart
            this.isExtension = isExtension
            this.unknownFields += unknownFields
        }
    }

    public sealed interface NamePart : pbandk.Message {
        public val namePart: String
        public val isExtension: Boolean

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.UninterpretedOption.NamePart
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption.NamePart>

        /**
         * The [UninterpretedOption.MutableNamePart] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit): pbandk.wkt.UninterpretedOption.NamePart

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            namePart: String = this.namePart,
            isExtension: Boolean = this.isExtension,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.UninterpretedOption.NamePart

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val namePart: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption.NamePart, String> =
                pbandk.FieldDescriptor.ofRequired(
                    messageDescriptor = pbandk.wkt.UninterpretedOption.NamePart::descriptor,
                    messageMetadata = pbandk.wkt.UninterpretedOption.NamePart.messageMetadata,
                    name = "name_part",
                    number = 1,
                    valueType = pbandk.types.string(),
                    jsonName = "namePart",
                    value = pbandk.wkt.UninterpretedOption.NamePart::namePart,
                    mutableValue = pbandk.wkt.UninterpretedOption.MutableNamePart::namePart,
                )
            public val isExtension: pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption.NamePart, Boolean> =
                pbandk.FieldDescriptor.ofRequired(
                    messageDescriptor = pbandk.wkt.UninterpretedOption.NamePart::descriptor,
                    messageMetadata = pbandk.wkt.UninterpretedOption.NamePart.messageMetadata,
                    name = "is_extension",
                    number = 2,
                    valueType = pbandk.types.bool(),
                    jsonName = "isExtension",
                    value = pbandk.wkt.UninterpretedOption.NamePart::isExtension,
                    mutableValue = pbandk.wkt.UninterpretedOption.MutableNamePart::isExtension,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption.NamePart>() {
            override val defaultInstance: pbandk.wkt.UninterpretedOption.NamePart
                get() = throw UnsupportedOperationException("Messages with required fields don't have a default instance")

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.UninterpretedOption.NamePart",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption.NamePart> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.UninterpretedOption.NamePart::class,
                    messageCompanion = this,
                    builder = UninterpretedOption.Companion::NamePart,
                    fields = listOf(
                        pbandk.wkt.UninterpretedOption.NamePart.FieldDescriptors.namePart,
                        pbandk.wkt.UninterpretedOption.NamePart.FieldDescriptors.isExtension,
                    ),
                )
            }
        }
    }

    public sealed interface MutableNamePart : pbandk.wkt.UninterpretedOption.NamePart, pbandk.MutableMessage<pbandk.wkt.UninterpretedOption.NamePart> {
        public override var namePart: String
        public override var isExtension: Boolean
    }
}

public sealed interface MutableUninterpretedOption : pbandk.wkt.UninterpretedOption, pbandk.MutableMessage<pbandk.wkt.UninterpretedOption> {
    public override val name: MutableList<pbandk.wkt.UninterpretedOption.NamePart>
    public override var identifierValue: String?
    public override var positiveIntValue: Long?
    public override var negativeIntValue: Long?
    public override var doubleValue: Double?
    public override var stringValue: pbandk.ByteArr?
    public override var aggregateValue: String?
}

public sealed interface FeatureSet : pbandk.ExtendableMessage<pbandk.wkt.FeatureSet> {
    public val fieldPresence: pbandk.wkt.FeatureSet.FieldPresence?
    public val enumType: pbandk.wkt.FeatureSet.EnumType?
    public val repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding?
    public val utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation?
    public val messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding?
    public val jsonFormat: pbandk.wkt.FeatureSet.JsonFormat?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FeatureSet
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSet>

    /**
     * The [MutableFeatureSet] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFeatureSet.() -> Unit): pbandk.wkt.FeatureSet

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        fieldPresence: pbandk.wkt.FeatureSet.FieldPresence? = this.fieldPresence,
        enumType: pbandk.wkt.FeatureSet.EnumType? = this.enumType,
        repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding? = this.repeatedFieldEncoding,
        utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation? = this.utf8Validation,
        messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding? = this.messageEncoding,
        jsonFormat: pbandk.wkt.FeatureSet.JsonFormat? = this.jsonFormat,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FeatureSet

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val fieldPresence: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.FeatureSet.FieldPresence?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
                messageMetadata = pbandk.wkt.FeatureSet.messageMetadata,
                name = "field_presence",
                number = 1,
                valueType = pbandk.types.enum(pbandk.wkt.FeatureSet.FieldPresence),
                jsonName = "fieldPresence",
                value = pbandk.wkt.FeatureSet::fieldPresence,
                mutableValue = pbandk.wkt.MutableFeatureSet::fieldPresence,
            )
        public val enumType: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.FeatureSet.EnumType?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
                messageMetadata = pbandk.wkt.FeatureSet.messageMetadata,
                name = "enum_type",
                number = 2,
                valueType = pbandk.types.enum(pbandk.wkt.FeatureSet.EnumType),
                jsonName = "enumType",
                value = pbandk.wkt.FeatureSet::enumType,
                mutableValue = pbandk.wkt.MutableFeatureSet::enumType,
            )
        public val repeatedFieldEncoding: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.FeatureSet.RepeatedFieldEncoding?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
                messageMetadata = pbandk.wkt.FeatureSet.messageMetadata,
                name = "repeated_field_encoding",
                number = 3,
                valueType = pbandk.types.enum(pbandk.wkt.FeatureSet.RepeatedFieldEncoding),
                jsonName = "repeatedFieldEncoding",
                value = pbandk.wkt.FeatureSet::repeatedFieldEncoding,
                mutableValue = pbandk.wkt.MutableFeatureSet::repeatedFieldEncoding,
            )
        public val utf8Validation: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.FeatureSet.Utf8Validation?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
                messageMetadata = pbandk.wkt.FeatureSet.messageMetadata,
                name = "utf8_validation",
                number = 4,
                valueType = pbandk.types.enum(pbandk.wkt.FeatureSet.Utf8Validation),
                jsonName = "utf8Validation",
                value = pbandk.wkt.FeatureSet::utf8Validation,
                mutableValue = pbandk.wkt.MutableFeatureSet::utf8Validation,
            )
        public val messageEncoding: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.FeatureSet.MessageEncoding?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
                messageMetadata = pbandk.wkt.FeatureSet.messageMetadata,
                name = "message_encoding",
                number = 5,
                valueType = pbandk.types.enum(pbandk.wkt.FeatureSet.MessageEncoding),
                jsonName = "messageEncoding",
                value = pbandk.wkt.FeatureSet::messageEncoding,
                mutableValue = pbandk.wkt.MutableFeatureSet::messageEncoding,
            )
        public val jsonFormat: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.FeatureSet.JsonFormat?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
                messageMetadata = pbandk.wkt.FeatureSet.messageMetadata,
                name = "json_format",
                number = 6,
                valueType = pbandk.types.enum(pbandk.wkt.FeatureSet.JsonFormat),
                jsonName = "jsonFormat",
                value = pbandk.wkt.FeatureSet::jsonFormat,
                mutableValue = pbandk.wkt.MutableFeatureSet::jsonFormat,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FeatureSet>() {
        override val defaultInstance: pbandk.wkt.FeatureSet by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FeatureSet {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FeatureSet",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSet> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FeatureSet::class,
                messageCompanion = this,
                builder = ::FeatureSet,
                fields = listOf(
                    pbandk.wkt.FeatureSet.FieldDescriptors.fieldPresence,
                    pbandk.wkt.FeatureSet.FieldDescriptors.enumType,
                    pbandk.wkt.FeatureSet.FieldDescriptors.repeatedFieldEncoding,
                    pbandk.wkt.FeatureSet.FieldDescriptors.utf8Validation,
                    pbandk.wkt.FeatureSet.FieldDescriptors.messageEncoding,
                    pbandk.wkt.FeatureSet.FieldDescriptors.jsonFormat,
                ),
            )
        }
    }

    public sealed interface FieldPresence : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.FieldPresence>
            get() = pbandk.wkt.FeatureSet.FieldPresence.descriptor

        public object UNKNOWN : FieldPresence, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.FieldPresence>(
            value = 0,
            name = "FIELD_PRESENCE_UNKNOWN",
        )
        public object EXPLICIT : FieldPresence, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.FieldPresence>(
            value = 1,
            name = "EXPLICIT",
        )
        public object IMPLICIT : FieldPresence, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.FieldPresence>(
            value = 2,
            name = "IMPLICIT",
        )
        public object LEGACY_REQUIRED : FieldPresence, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.FieldPresence>(
            value = 3,
            name = "LEGACY_REQUIRED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : FieldPresence, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FeatureSet.FieldPresence>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.FieldPresence> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.FieldPresence> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FeatureSet.FieldPresence",
                    enumClass = pbandk.wkt.FeatureSet.FieldPresence::class,
                    enumCompanion = this,
                )
            public val values: List<FeatureSet.FieldPresence> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UNKNOWN, EXPLICIT, IMPLICIT, LEGACY_REQUIRED)
            }

            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.FieldPresence =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FeatureSet.FieldPresence =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface EnumType : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.EnumType>
            get() = pbandk.wkt.FeatureSet.EnumType.descriptor

        public object UNKNOWN : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.EnumType>(
            value = 0,
            name = "ENUM_TYPE_UNKNOWN",
        )
        public object OPEN : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.EnumType>(
            value = 1,
            name = "OPEN",
        )
        public object CLOSED : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.EnumType>(
            value = 2,
            name = "CLOSED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : EnumType, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FeatureSet.EnumType>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.EnumType> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.EnumType> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FeatureSet.EnumType",
                    enumClass = pbandk.wkt.FeatureSet.EnumType::class,
                    enumCompanion = this,
                )
            public val values: List<FeatureSet.EnumType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UNKNOWN, OPEN, CLOSED)
            }

            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.EnumType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FeatureSet.EnumType =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface RepeatedFieldEncoding : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.RepeatedFieldEncoding>
            get() = pbandk.wkt.FeatureSet.RepeatedFieldEncoding.descriptor

        public object UNKNOWN : RepeatedFieldEncoding, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.RepeatedFieldEncoding>(
            value = 0,
            name = "REPEATED_FIELD_ENCODING_UNKNOWN",
        )
        public object PACKED : RepeatedFieldEncoding, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.RepeatedFieldEncoding>(
            value = 1,
            name = "PACKED",
        )
        public object EXPANDED : RepeatedFieldEncoding, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.RepeatedFieldEncoding>(
            value = 2,
            name = "EXPANDED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : RepeatedFieldEncoding, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FeatureSet.RepeatedFieldEncoding>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.RepeatedFieldEncoding> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.RepeatedFieldEncoding> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FeatureSet.RepeatedFieldEncoding",
                    enumClass = pbandk.wkt.FeatureSet.RepeatedFieldEncoding::class,
                    enumCompanion = this,
                )
            public val values: List<FeatureSet.RepeatedFieldEncoding> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UNKNOWN, PACKED, EXPANDED)
            }

            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.RepeatedFieldEncoding =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FeatureSet.RepeatedFieldEncoding =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface Utf8Validation : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.Utf8Validation>
            get() = pbandk.wkt.FeatureSet.Utf8Validation.descriptor

        public object UTF8_VALIDATION_UNKNOWN : Utf8Validation, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.Utf8Validation>(
            value = 0,
            name = "UTF8_VALIDATION_UNKNOWN",
        )
        public object VERIFY : Utf8Validation, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.Utf8Validation>(
            value = 2,
            name = "VERIFY",
        )
        public object NONE : Utf8Validation, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.Utf8Validation>(
            value = 3,
            name = "NONE",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Utf8Validation, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FeatureSet.Utf8Validation>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.Utf8Validation> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.Utf8Validation> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FeatureSet.Utf8Validation",
                    enumClass = pbandk.wkt.FeatureSet.Utf8Validation::class,
                    enumCompanion = this,
                )
            public val values: List<FeatureSet.Utf8Validation> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UTF8_VALIDATION_UNKNOWN, VERIFY, NONE)
            }

            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.Utf8Validation =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FeatureSet.Utf8Validation =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface MessageEncoding : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.MessageEncoding>
            get() = pbandk.wkt.FeatureSet.MessageEncoding.descriptor

        public object UNKNOWN : MessageEncoding, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.MessageEncoding>(
            value = 0,
            name = "MESSAGE_ENCODING_UNKNOWN",
        )
        public object LENGTH_PREFIXED : MessageEncoding, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.MessageEncoding>(
            value = 1,
            name = "LENGTH_PREFIXED",
        )
        public object DELIMITED : MessageEncoding, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.MessageEncoding>(
            value = 2,
            name = "DELIMITED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : MessageEncoding, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FeatureSet.MessageEncoding>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.MessageEncoding> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.MessageEncoding> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FeatureSet.MessageEncoding",
                    enumClass = pbandk.wkt.FeatureSet.MessageEncoding::class,
                    enumCompanion = this,
                )
            public val values: List<FeatureSet.MessageEncoding> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UNKNOWN, LENGTH_PREFIXED, DELIMITED)
            }

            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.MessageEncoding =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FeatureSet.MessageEncoding =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface JsonFormat : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.JsonFormat>
            get() = pbandk.wkt.FeatureSet.JsonFormat.descriptor

        public object UNKNOWN : JsonFormat, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.JsonFormat>(
            value = 0,
            name = "JSON_FORMAT_UNKNOWN",
        )
        public object ALLOW : JsonFormat, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.JsonFormat>(
            value = 1,
            name = "ALLOW",
        )
        public object LEGACY_BEST_EFFORT : JsonFormat, pbandk.gen.GeneratedEnumValue<pbandk.wkt.FeatureSet.JsonFormat>(
            value = 2,
            name = "LEGACY_BEST_EFFORT",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : JsonFormat, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.FeatureSet.JsonFormat>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.JsonFormat> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.FeatureSet.JsonFormat> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.FeatureSet.JsonFormat",
                    enumClass = pbandk.wkt.FeatureSet.JsonFormat::class,
                    enumCompanion = this,
                )
            public val values: List<FeatureSet.JsonFormat> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UNKNOWN, ALLOW, LEGACY_BEST_EFFORT)
            }

            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.JsonFormat =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.FeatureSet.JsonFormat =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableFeatureSet : pbandk.wkt.FeatureSet, pbandk.MutableExtendableMessage<pbandk.wkt.FeatureSet> {
    public override var fieldPresence: pbandk.wkt.FeatureSet.FieldPresence?
    public override var enumType: pbandk.wkt.FeatureSet.EnumType?
    public override var repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding?
    public override var utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation?
    public override var messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding?
    public override var jsonFormat: pbandk.wkt.FeatureSet.JsonFormat?
}

public sealed interface FeatureSetDefaults : pbandk.Message {
    public val defaults: List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>
    public val minimumEdition: pbandk.wkt.Edition?
    public val maximumEdition: pbandk.wkt.Edition?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FeatureSetDefaults
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults>

    /**
     * The [MutableFeatureSetDefaults] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFeatureSetDefaults.() -> Unit): pbandk.wkt.FeatureSetDefaults

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        defaults: List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> = this.defaults,
        minimumEdition: pbandk.wkt.Edition? = this.minimumEdition,
        maximumEdition: pbandk.wkt.Edition? = this.maximumEdition,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FeatureSetDefaults

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val defaults: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FeatureSetDefaults, List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>, MutableList<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FeatureSetDefaults::descriptor,
                messageMetadata = pbandk.wkt.FeatureSetDefaults.messageMetadata,
                name = "defaults",
                number = 1,
                valueType = pbandk.types.message(pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault),
                jsonName = "defaults",
                value = pbandk.wkt.FeatureSetDefaults::defaults,
                mutableValue = pbandk.wkt.MutableFeatureSetDefaults::defaults,
            )
        public val minimumEdition: pbandk.FieldDescriptor<pbandk.wkt.FeatureSetDefaults, pbandk.wkt.Edition?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSetDefaults::descriptor,
                messageMetadata = pbandk.wkt.FeatureSetDefaults.messageMetadata,
                name = "minimum_edition",
                number = 4,
                valueType = pbandk.types.enum(pbandk.wkt.Edition),
                jsonName = "minimumEdition",
                value = pbandk.wkt.FeatureSetDefaults::minimumEdition,
                mutableValue = pbandk.wkt.MutableFeatureSetDefaults::minimumEdition,
            )
        public val maximumEdition: pbandk.FieldDescriptor<pbandk.wkt.FeatureSetDefaults, pbandk.wkt.Edition?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.FeatureSetDefaults::descriptor,
                messageMetadata = pbandk.wkt.FeatureSetDefaults.messageMetadata,
                name = "maximum_edition",
                number = 5,
                valueType = pbandk.types.enum(pbandk.wkt.Edition),
                jsonName = "maximumEdition",
                value = pbandk.wkt.FeatureSetDefaults::maximumEdition,
                mutableValue = pbandk.wkt.MutableFeatureSetDefaults::maximumEdition,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FeatureSetDefaults>() {
        override val defaultInstance: pbandk.wkt.FeatureSetDefaults by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FeatureSetDefaults {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FeatureSetDefaults",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FeatureSetDefaults::class,
                messageCompanion = this,
                builder = ::FeatureSetDefaults,
                fields = listOf(
                    pbandk.wkt.FeatureSetDefaults.FieldDescriptors.defaults,
                    pbandk.wkt.FeatureSetDefaults.FieldDescriptors.minimumEdition,
                    pbandk.wkt.FeatureSetDefaults.FieldDescriptors.maximumEdition,
                ),
            )
        }

        @Deprecated(
            message = "Use FeatureSetDefaults.FeatureSetEditionDefault { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault"],
                expression = "FeatureSetDefaults.FeatureSetEditionDefault {\nthis.edition = edition\nthis.overridableFeatures = overridableFeatures\nthis.fixedFeatures = fixedFeatures\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun FeatureSetEditionDefault(
            edition: pbandk.wkt.Edition? = null,
            overridableFeatures: pbandk.wkt.FeatureSet? = null,
            fixedFeatures: pbandk.wkt.FeatureSet? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault {
            this.edition = edition
            this.overridableFeatures = overridableFeatures
            this.fixedFeatures = fixedFeatures
            this.unknownFields += unknownFields
        }
    }

    public sealed interface FeatureSetEditionDefault : pbandk.Message {
        public val edition: pbandk.wkt.Edition?
        public val overridableFeatures: pbandk.wkt.FeatureSet?
        public val fixedFeatures: pbandk.wkt.FeatureSet?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>

        /**
         * The [FeatureSetDefaults.MutableFeatureSetEditionDefault] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault.() -> Unit): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            edition: pbandk.wkt.Edition? = this.edition,
            overridableFeatures: pbandk.wkt.FeatureSet? = this.overridableFeatures,
            fixedFeatures: pbandk.wkt.FeatureSet? = this.fixedFeatures,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val edition: pbandk.FieldDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault, pbandk.wkt.Edition?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::descriptor,
                    messageMetadata = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.messageMetadata,
                    name = "edition",
                    number = 3,
                    valueType = pbandk.types.enum(pbandk.wkt.Edition),
                    jsonName = "edition",
                    value = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::edition,
                    mutableValue = pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault::edition,
                )
            public val overridableFeatures: pbandk.FieldDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault, pbandk.wkt.FeatureSet?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::descriptor,
                    messageMetadata = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.messageMetadata,
                    name = "overridable_features",
                    number = 4,
                    valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                    jsonName = "overridableFeatures",
                    value = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::overridableFeatures,
                    mutableValue = pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault::overridableFeatures,
                )
            public val fixedFeatures: pbandk.FieldDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault, pbandk.wkt.FeatureSet?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::descriptor,
                    messageMetadata = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.messageMetadata,
                    name = "fixed_features",
                    number = 5,
                    valueType = pbandk.types.message(pbandk.wkt.FeatureSet),
                    jsonName = "fixedFeatures",
                    value = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::fixedFeatures,
                    mutableValue = pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault::fixedFeatures,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>() {
            override val defaultInstance: pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.FeatureSetDefaults.FeatureSetEditionDefault",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::class,
                    messageCompanion = this,
                    builder = FeatureSetDefaults.Companion::FeatureSetEditionDefault,
                    fields = listOf(
                        pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.FieldDescriptors.edition,
                        pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.FieldDescriptors.overridableFeatures,
                        pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.FieldDescriptors.fixedFeatures,
                    ),
                )
            }
        }
    }

    public sealed interface MutableFeatureSetEditionDefault : pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault, pbandk.MutableMessage<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> {
        public override var edition: pbandk.wkt.Edition?
        public override var overridableFeatures: pbandk.wkt.FeatureSet?
        public override var fixedFeatures: pbandk.wkt.FeatureSet?
    }
}

public sealed interface MutableFeatureSetDefaults : pbandk.wkt.FeatureSetDefaults, pbandk.MutableMessage<pbandk.wkt.FeatureSetDefaults> {
    public override val defaults: MutableList<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>
    public override var minimumEdition: pbandk.wkt.Edition?
    public override var maximumEdition: pbandk.wkt.Edition?
}

public sealed interface SourceCodeInfo : pbandk.Message {
    public val location: List<pbandk.wkt.SourceCodeInfo.Location>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo>

    /**
     * The [MutableSourceCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit): pbandk.wkt.SourceCodeInfo

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        location: List<pbandk.wkt.SourceCodeInfo.Location> = this.location,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.SourceCodeInfo

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val location: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.SourceCodeInfo, List<pbandk.wkt.SourceCodeInfo.Location>, MutableList<pbandk.wkt.SourceCodeInfo.Location>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.SourceCodeInfo::descriptor,
                messageMetadata = pbandk.wkt.SourceCodeInfo.messageMetadata,
                name = "location",
                number = 1,
                valueType = pbandk.types.message(pbandk.wkt.SourceCodeInfo.Location),
                jsonName = "location",
                value = pbandk.wkt.SourceCodeInfo::location,
                mutableValue = pbandk.wkt.MutableSourceCodeInfo::location,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo>() {
        override val defaultInstance: pbandk.wkt.SourceCodeInfo by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.SourceCodeInfo {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.SourceCodeInfo",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.SourceCodeInfo::class,
                messageCompanion = this,
                builder = ::SourceCodeInfo,
                fields = listOf(
                    pbandk.wkt.SourceCodeInfo.FieldDescriptors.location,
                ),
            )
        }

        @Deprecated(
            message = "Use SourceCodeInfo.Location { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.SourceCodeInfo.Location"],
                expression = "SourceCodeInfo.Location {\nthis.path += path\nthis.span += span\nthis.leadingComments = leadingComments\nthis.trailingComments = trailingComments\nthis.leadingDetachedComments += leadingDetachedComments\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun Location(
            path: List<Int> = emptyList(),
            span: List<Int> = emptyList(),
            leadingComments: String? = null,
            trailingComments: String? = null,
            leadingDetachedComments: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.SourceCodeInfo.Location = pbandk.wkt.SourceCodeInfo.Location {
            this.path += path
            this.span += span
            this.leadingComments = leadingComments
            this.trailingComments = trailingComments
            this.leadingDetachedComments += leadingDetachedComments
            this.unknownFields += unknownFields
        }
    }

    public sealed interface Location : pbandk.Message {
        public val path: List<Int>
        public val span: List<Int>
        public val leadingComments: String?
        public val trailingComments: String?
        public val leadingDetachedComments: List<String>

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo.Location
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo.Location>

        /**
         * The [SourceCodeInfo.MutableLocation] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit): pbandk.wkt.SourceCodeInfo.Location

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            path: List<Int> = this.path,
            span: List<Int> = this.span,
            leadingComments: String? = this.leadingComments,
            trailingComments: String? = this.trailingComments,
            leadingDetachedComments: List<String> = this.leadingDetachedComments,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.SourceCodeInfo.Location

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val path: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.SourceCodeInfo.Location, List<Int>, MutableList<Int>> =
                pbandk.FieldDescriptor.ofRepeated(
                    messageDescriptor = pbandk.wkt.SourceCodeInfo.Location::descriptor,
                    messageMetadata = pbandk.wkt.SourceCodeInfo.Location.messageMetadata,
                    name = "path",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "path",
                    options = pbandk.wkt.FieldOptions {
                        packed = true
                    },
                    value = pbandk.wkt.SourceCodeInfo.Location::path,
                    mutableValue = pbandk.wkt.SourceCodeInfo.MutableLocation::path,
                )
            public val span: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.SourceCodeInfo.Location, List<Int>, MutableList<Int>> =
                pbandk.FieldDescriptor.ofRepeated(
                    messageDescriptor = pbandk.wkt.SourceCodeInfo.Location::descriptor,
                    messageMetadata = pbandk.wkt.SourceCodeInfo.Location.messageMetadata,
                    name = "span",
                    number = 2,
                    valueType = pbandk.types.int32(),
                    jsonName = "span",
                    options = pbandk.wkt.FieldOptions {
                        packed = true
                    },
                    value = pbandk.wkt.SourceCodeInfo.Location::span,
                    mutableValue = pbandk.wkt.SourceCodeInfo.MutableLocation::span,
                )
            public val leadingComments: pbandk.FieldDescriptor<pbandk.wkt.SourceCodeInfo.Location, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.SourceCodeInfo.Location::descriptor,
                    messageMetadata = pbandk.wkt.SourceCodeInfo.Location.messageMetadata,
                    name = "leading_comments",
                    number = 3,
                    valueType = pbandk.types.string(),
                    jsonName = "leadingComments",
                    value = pbandk.wkt.SourceCodeInfo.Location::leadingComments,
                    mutableValue = pbandk.wkt.SourceCodeInfo.MutableLocation::leadingComments,
                )
            public val trailingComments: pbandk.FieldDescriptor<pbandk.wkt.SourceCodeInfo.Location, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.SourceCodeInfo.Location::descriptor,
                    messageMetadata = pbandk.wkt.SourceCodeInfo.Location.messageMetadata,
                    name = "trailing_comments",
                    number = 4,
                    valueType = pbandk.types.string(),
                    jsonName = "trailingComments",
                    value = pbandk.wkt.SourceCodeInfo.Location::trailingComments,
                    mutableValue = pbandk.wkt.SourceCodeInfo.MutableLocation::trailingComments,
                )
            public val leadingDetachedComments: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.SourceCodeInfo.Location, List<String>, MutableList<String>> =
                pbandk.FieldDescriptor.ofRepeated(
                    messageDescriptor = pbandk.wkt.SourceCodeInfo.Location::descriptor,
                    messageMetadata = pbandk.wkt.SourceCodeInfo.Location.messageMetadata,
                    name = "leading_detached_comments",
                    number = 6,
                    valueType = pbandk.types.string(),
                    jsonName = "leadingDetachedComments",
                    value = pbandk.wkt.SourceCodeInfo.Location::leadingDetachedComments,
                    mutableValue = pbandk.wkt.SourceCodeInfo.MutableLocation::leadingDetachedComments,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo.Location>() {
            override val defaultInstance: pbandk.wkt.SourceCodeInfo.Location by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.SourceCodeInfo.Location {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.SourceCodeInfo.Location",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo.Location> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.SourceCodeInfo.Location::class,
                    messageCompanion = this,
                    builder = SourceCodeInfo.Companion::Location,
                    fields = listOf(
                        pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.path,
                        pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.span,
                        pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.leadingComments,
                        pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.trailingComments,
                        pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.leadingDetachedComments,
                    ),
                )
            }
        }
    }

    public sealed interface MutableLocation : pbandk.wkt.SourceCodeInfo.Location, pbandk.MutableMessage<pbandk.wkt.SourceCodeInfo.Location> {
        public override val path: MutableList<Int>
        public override val span: MutableList<Int>
        public override var leadingComments: String?
        public override var trailingComments: String?
        public override val leadingDetachedComments: MutableList<String>
    }
}

public sealed interface MutableSourceCodeInfo : pbandk.wkt.SourceCodeInfo, pbandk.MutableMessage<pbandk.wkt.SourceCodeInfo> {
    public override val location: MutableList<pbandk.wkt.SourceCodeInfo.Location>
}

public sealed interface GeneratedCodeInfo : pbandk.Message {
    public val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo>

    /**
     * The [MutableGeneratedCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit): pbandk.wkt.GeneratedCodeInfo

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = this.annotation,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.GeneratedCodeInfo

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val annotation: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.GeneratedCodeInfo, List<pbandk.wkt.GeneratedCodeInfo.Annotation>, MutableList<pbandk.wkt.GeneratedCodeInfo.Annotation>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.GeneratedCodeInfo::descriptor,
                messageMetadata = pbandk.wkt.GeneratedCodeInfo.messageMetadata,
                name = "annotation",
                number = 1,
                valueType = pbandk.types.message(pbandk.wkt.GeneratedCodeInfo.Annotation),
                jsonName = "annotation",
                value = pbandk.wkt.GeneratedCodeInfo::annotation,
                mutableValue = pbandk.wkt.MutableGeneratedCodeInfo::annotation,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo>() {
        override val defaultInstance: pbandk.wkt.GeneratedCodeInfo by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.GeneratedCodeInfo {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.GeneratedCodeInfo",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.GeneratedCodeInfo::class,
                messageCompanion = this,
                builder = ::GeneratedCodeInfo,
                fields = listOf(
                    pbandk.wkt.GeneratedCodeInfo.FieldDescriptors.annotation,
                ),
            )
        }

        @Deprecated(
            message = "Use GeneratedCodeInfo.Annotation { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.wkt.GeneratedCodeInfo.Annotation"],
                expression = "GeneratedCodeInfo.Annotation {\nthis.path += path\nthis.sourceFile = sourceFile\nthis.begin = begin\nthis.end = end\nthis.semantic = semantic\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun Annotation(
            path: List<Int> = emptyList(),
            sourceFile: String? = null,
            begin: Int? = null,
            end: Int? = null,
            semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.GeneratedCodeInfo.Annotation = pbandk.wkt.GeneratedCodeInfo.Annotation {
            this.path += path
            this.sourceFile = sourceFile
            this.begin = begin
            this.end = end
            this.semantic = semantic
            this.unknownFields += unknownFields
        }
    }

    public sealed interface Annotation : pbandk.Message {
        public val path: List<Int>
        public val sourceFile: String?
        public val begin: Int?
        public val end: Int?
        public val semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo.Annotation
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation>

        /**
         * The [GeneratedCodeInfo.MutableAnnotation] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit): pbandk.wkt.GeneratedCodeInfo.Annotation

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            path: List<Int> = this.path,
            sourceFile: String? = this.sourceFile,
            begin: Int? = this.begin,
            end: Int? = this.end,
            semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic? = this.semantic,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.GeneratedCodeInfo.Annotation

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val path: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.GeneratedCodeInfo.Annotation, List<Int>, MutableList<Int>> =
                pbandk.FieldDescriptor.ofRepeated(
                    messageDescriptor = pbandk.wkt.GeneratedCodeInfo.Annotation::descriptor,
                    messageMetadata = pbandk.wkt.GeneratedCodeInfo.Annotation.messageMetadata,
                    name = "path",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "path",
                    options = pbandk.wkt.FieldOptions {
                        packed = true
                    },
                    value = pbandk.wkt.GeneratedCodeInfo.Annotation::path,
                    mutableValue = pbandk.wkt.GeneratedCodeInfo.MutableAnnotation::path,
                )
            public val sourceFile: pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.GeneratedCodeInfo.Annotation::descriptor,
                    messageMetadata = pbandk.wkt.GeneratedCodeInfo.Annotation.messageMetadata,
                    name = "source_file",
                    number = 2,
                    valueType = pbandk.types.string(),
                    jsonName = "sourceFile",
                    value = pbandk.wkt.GeneratedCodeInfo.Annotation::sourceFile,
                    mutableValue = pbandk.wkt.GeneratedCodeInfo.MutableAnnotation::sourceFile,
                )
            public val begin: pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.GeneratedCodeInfo.Annotation::descriptor,
                    messageMetadata = pbandk.wkt.GeneratedCodeInfo.Annotation.messageMetadata,
                    name = "begin",
                    number = 3,
                    valueType = pbandk.types.int32(),
                    jsonName = "begin",
                    value = pbandk.wkt.GeneratedCodeInfo.Annotation::begin,
                    mutableValue = pbandk.wkt.GeneratedCodeInfo.MutableAnnotation::begin,
                )
            public val end: pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.GeneratedCodeInfo.Annotation::descriptor,
                    messageMetadata = pbandk.wkt.GeneratedCodeInfo.Annotation.messageMetadata,
                    name = "end",
                    number = 4,
                    valueType = pbandk.types.int32(),
                    jsonName = "end",
                    value = pbandk.wkt.GeneratedCodeInfo.Annotation::end,
                    mutableValue = pbandk.wkt.GeneratedCodeInfo.MutableAnnotation::end,
                )
            public val semantic: pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation, pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.wkt.GeneratedCodeInfo.Annotation::descriptor,
                    messageMetadata = pbandk.wkt.GeneratedCodeInfo.Annotation.messageMetadata,
                    name = "semantic",
                    number = 5,
                    valueType = pbandk.types.enum(pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic),
                    jsonName = "semantic",
                    value = pbandk.wkt.GeneratedCodeInfo.Annotation::semantic,
                    mutableValue = pbandk.wkt.GeneratedCodeInfo.MutableAnnotation::semantic,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo.Annotation>() {
            override val defaultInstance: pbandk.wkt.GeneratedCodeInfo.Annotation by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.wkt.GeneratedCodeInfo.Annotation {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "google.protobuf.GeneratedCodeInfo.Annotation",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.wkt.GeneratedCodeInfo.Annotation::class,
                    messageCompanion = this,
                    builder = GeneratedCodeInfo.Companion::Annotation,
                    fields = listOf(
                        pbandk.wkt.GeneratedCodeInfo.Annotation.FieldDescriptors.path,
                        pbandk.wkt.GeneratedCodeInfo.Annotation.FieldDescriptors.sourceFile,
                        pbandk.wkt.GeneratedCodeInfo.Annotation.FieldDescriptors.begin,
                        pbandk.wkt.GeneratedCodeInfo.Annotation.FieldDescriptors.end,
                        pbandk.wkt.GeneratedCodeInfo.Annotation.FieldDescriptors.semantic,
                    ),
                )
            }
        }

        public sealed interface Semantic : pbandk.Message.Enum {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic>
                get() = pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic.descriptor

            public object NONE : Semantic, pbandk.gen.GeneratedEnumValue<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic>(
                value = 0,
                name = "NONE",
            )
            public object SET : Semantic, pbandk.gen.GeneratedEnumValue<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic>(
                value = 1,
                name = "SET",
            )
            public object ALIAS : Semantic, pbandk.gen.GeneratedEnumValue<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic>(
                value = 2,
                name = "ALIAS",
            )
            public class UNRECOGNIZED(value: Int? = null, name: String? = null)
                : Semantic, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic>(value, name)

            public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic> {
                override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic> =
                    pbandk.EnumDescriptor.of(
                        fullName = "google.protobuf.GeneratedCodeInfo.Annotation.Semantic",
                        enumClass = pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic::class,
                        enumCompanion = this,
                    )
                public val values: List<GeneratedCodeInfo.Annotation.Semantic> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                    listOf(NONE, SET, ALIAS)
                }

                override fun fromValue(value: Int): pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic =
                    values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

                override fun fromName(name: String): pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic =
                    values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
            }
        }
    }

    public sealed interface MutableAnnotation : pbandk.wkt.GeneratedCodeInfo.Annotation, pbandk.MutableMessage<pbandk.wkt.GeneratedCodeInfo.Annotation> {
        public override val path: MutableList<Int>
        public override var sourceFile: String?
        public override var begin: Int?
        public override var end: Int?
        public override var semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?
    }
}

public sealed interface MutableGeneratedCodeInfo : pbandk.wkt.GeneratedCodeInfo, pbandk.MutableMessage<pbandk.wkt.GeneratedCodeInfo> {
    public override val annotation: MutableList<pbandk.wkt.GeneratedCodeInfo.Annotation>
}

@Deprecated(
    message = "Use FileDescriptorSet { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FileDescriptorSet"],
        expression = "FileDescriptorSet {\nthis.file += file\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FileDescriptorSet(
    file: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FileDescriptorSet = pbandk.wkt.FileDescriptorSet {
    this.file += file
    this.unknownFields += unknownFields
}

/**
 * The [MutableFileDescriptorSet] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFileDescriptorSet")
public fun FileDescriptorSet(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit): pbandk.wkt.FileDescriptorSet =
    pbandk.wkt.MutableFileDescriptorSet_Impl(
        file = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorSet.FieldDescriptors.file),
    ).also(builderAction).toFileDescriptorSet()

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorSet")
public fun FileDescriptorSet?.orDefault(): pbandk.wkt.FileDescriptorSet = this ?: pbandk.wkt.FileDescriptorSet.defaultInstance

private class FileDescriptorSet_Impl(
    override val file: pbandk.gen.ListField<pbandk.wkt.FileDescriptorProto>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FileDescriptorSet, pbandk.gen.GeneratedMessage<pbandk.wkt.FileDescriptorSet>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FileDescriptorSet.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        file: List<pbandk.wkt.FileDescriptorProto>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FileDescriptorSet = pbandk.wkt.FileDescriptorSet {
        this.file += file
        this.unknownFields += unknownFields
    }
}

private class MutableFileDescriptorSet_Impl(
    override val file: pbandk.gen.MutableListField<pbandk.wkt.FileDescriptorProto>,
) : pbandk.wkt.MutableFileDescriptorSet, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FileDescriptorSet>() {
    override val descriptor get() = pbandk.wkt.FileDescriptorSet.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        file: List<pbandk.wkt.FileDescriptorProto>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FileDescriptorSet = throw UnsupportedOperationException()

    fun toFileDescriptorSet() = FileDescriptorSet_Impl(
        file = file.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FileDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FileDescriptorProto"],
        expression = "FileDescriptorProto {\nthis.name = name\nthis.`package` = `package`\nthis.dependency += dependency\nthis.publicDependency += publicDependency\nthis.weakDependency += weakDependency\nthis.messageType += messageType\nthis.enumType += enumType\nthis.service += service\nthis.extension += extension\nthis.options = options\nthis.sourceCodeInfo = sourceCodeInfo\nthis.syntax = syntax\nthis.edition = edition\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FileDescriptorProto(
    name: String? = null,
    `package`: String? = null,
    dependency: List<String> = emptyList(),
    publicDependency: List<Int> = emptyList(),
    weakDependency: List<Int> = emptyList(),
    messageType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList(),
    extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    options: pbandk.wkt.FileOptions? = null,
    sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null,
    syntax: String? = null,
    edition: pbandk.wkt.Edition? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FileDescriptorProto = pbandk.wkt.FileDescriptorProto {
    this.name = name
    this.`package` = `package`
    this.dependency += dependency
    this.publicDependency += publicDependency
    this.weakDependency += weakDependency
    this.messageType += messageType
    this.enumType += enumType
    this.service += service
    this.extension += extension
    this.options = options
    this.sourceCodeInfo = sourceCodeInfo
    this.syntax = syntax
    this.edition = edition
    this.unknownFields += unknownFields
}

/**
 * The [MutableFileDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFileDescriptorProto")
public fun FileDescriptorProto(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit): pbandk.wkt.FileDescriptorProto =
    pbandk.wkt.MutableFileDescriptorProto_Impl(
        name = null,
        `package` = null,
        dependency = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.dependency),
        publicDependency = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.publicDependency),
        weakDependency = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.weakDependency),
        messageType = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.messageType),
        enumType = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.enumType),
        service = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.service),
        extension = pbandk.gen.MutableListField(pbandk.wkt.FileDescriptorProto.FieldDescriptors.extension),
        options = null,
        sourceCodeInfo = null,
        syntax = null,
        edition = null,
    ).also(builderAction).toFileDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorProto")
public fun FileDescriptorProto?.orDefault(): pbandk.wkt.FileDescriptorProto = this ?: pbandk.wkt.FileDescriptorProto.defaultInstance

private class FileDescriptorProto_Impl(
    override val name: String?,
    override val `package`: String?,
    override val dependency: pbandk.gen.ListField<String>,
    override val publicDependency: pbandk.gen.ListField<Int>,
    override val weakDependency: pbandk.gen.ListField<Int>,
    override val messageType: pbandk.gen.ListField<pbandk.wkt.DescriptorProto>,
    override val enumType: pbandk.gen.ListField<pbandk.wkt.EnumDescriptorProto>,
    override val service: pbandk.gen.ListField<pbandk.wkt.ServiceDescriptorProto>,
    override val extension: pbandk.gen.ListField<pbandk.wkt.FieldDescriptorProto>,
    override val options: pbandk.wkt.FileOptions?,
    override val sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
    override val syntax: String?,
    override val edition: pbandk.wkt.Edition?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FileDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.FileDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FileDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        `package`: String?,
        dependency: List<String>,
        publicDependency: List<Int>,
        weakDependency: List<Int>,
        messageType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        service: List<pbandk.wkt.ServiceDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        options: pbandk.wkt.FileOptions?,
        sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
        syntax: String?,
        edition: pbandk.wkt.Edition?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FileDescriptorProto = pbandk.wkt.FileDescriptorProto {
        this.name = name
        this.`package` = `package`
        this.dependency += dependency
        this.publicDependency += publicDependency
        this.weakDependency += weakDependency
        this.messageType += messageType
        this.enumType += enumType
        this.service += service
        this.extension += extension
        this.options = options
        this.sourceCodeInfo = sourceCodeInfo
        this.syntax = syntax
        this.edition = edition
        this.unknownFields += unknownFields
    }
}

private class MutableFileDescriptorProto_Impl(
    override var name: String?,
    override var `package`: String?,
    override val dependency: pbandk.gen.MutableListField<String>,
    override val publicDependency: pbandk.gen.MutableListField<Int>,
    override val weakDependency: pbandk.gen.MutableListField<Int>,
    override val messageType: pbandk.gen.MutableListField<pbandk.wkt.DescriptorProto>,
    override val enumType: pbandk.gen.MutableListField<pbandk.wkt.EnumDescriptorProto>,
    override val service: pbandk.gen.MutableListField<pbandk.wkt.ServiceDescriptorProto>,
    override val extension: pbandk.gen.MutableListField<pbandk.wkt.FieldDescriptorProto>,
    override var options: pbandk.wkt.FileOptions?,
    override var sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
    override var syntax: String?,
    override var edition: pbandk.wkt.Edition?,
) : pbandk.wkt.MutableFileDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FileDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.FileDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        `package`: String?,
        dependency: List<String>,
        publicDependency: List<Int>,
        weakDependency: List<Int>,
        messageType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        service: List<pbandk.wkt.ServiceDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        options: pbandk.wkt.FileOptions?,
        sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
        syntax: String?,
        edition: pbandk.wkt.Edition?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FileDescriptorProto = throw UnsupportedOperationException()

    fun toFileDescriptorProto() = FileDescriptorProto_Impl(
        name = name,
        `package` = `package`,
        dependency = dependency.toListField(),
        publicDependency = publicDependency.toListField(),
        weakDependency = weakDependency.toListField(),
        messageType = messageType.toListField(),
        enumType = enumType.toListField(),
        service = service.toListField(),
        extension = extension.toListField(),
        options = options,
        sourceCodeInfo = sourceCodeInfo,
        syntax = syntax,
        edition = edition,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use DescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.DescriptorProto"],
        expression = "DescriptorProto {\nthis.name = name\nthis.field += field\nthis.extension += extension\nthis.nestedType += nestedType\nthis.enumType += enumType\nthis.extensionRange += extensionRange\nthis.oneofDecl += oneofDecl\nthis.options = options\nthis.reservedRange += reservedRange\nthis.reservedName += reservedName\nthis.unknownFields += unknownFields\n}",
    )
)
public fun DescriptorProto(
    name: String? = null,
    field: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    nestedType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList(),
    oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = emptyList(),
    options: pbandk.wkt.MessageOptions? = null,
    reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = emptyList(),
    reservedName: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.DescriptorProto = pbandk.wkt.DescriptorProto {
    this.name = name
    this.field += field
    this.extension += extension
    this.nestedType += nestedType
    this.enumType += enumType
    this.extensionRange += extensionRange
    this.oneofDecl += oneofDecl
    this.options = options
    this.reservedRange += reservedRange
    this.reservedName += reservedName
    this.unknownFields += unknownFields
}

/**
 * The [MutableDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDescriptorProto")
public fun DescriptorProto(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit): pbandk.wkt.DescriptorProto =
    pbandk.wkt.MutableDescriptorProto_Impl(
        name = null,
        field = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.field),
        extension = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.extension),
        nestedType = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.nestedType),
        enumType = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.enumType),
        extensionRange = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.extensionRange),
        oneofDecl = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.oneofDecl),
        options = null,
        reservedRange = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.reservedRange),
        reservedName = pbandk.gen.MutableListField(pbandk.wkt.DescriptorProto.FieldDescriptors.reservedName),
    ).also(builderAction).toDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProto")
public fun DescriptorProto?.orDefault(): pbandk.wkt.DescriptorProto = this ?: pbandk.wkt.DescriptorProto.defaultInstance

private class DescriptorProto_Impl(
    override val name: String?,
    override val field: pbandk.gen.ListField<pbandk.wkt.FieldDescriptorProto>,
    override val extension: pbandk.gen.ListField<pbandk.wkt.FieldDescriptorProto>,
    override val nestedType: pbandk.gen.ListField<pbandk.wkt.DescriptorProto>,
    override val enumType: pbandk.gen.ListField<pbandk.wkt.EnumDescriptorProto>,
    override val extensionRange: pbandk.gen.ListField<pbandk.wkt.DescriptorProto.ExtensionRange>,
    override val oneofDecl: pbandk.gen.ListField<pbandk.wkt.OneofDescriptorProto>,
    override val options: pbandk.wkt.MessageOptions?,
    override val reservedRange: pbandk.gen.ListField<pbandk.wkt.DescriptorProto.ReservedRange>,
    override val reservedName: pbandk.gen.ListField<String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.DescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.DescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        field: List<pbandk.wkt.FieldDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        nestedType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>,
        oneofDecl: List<pbandk.wkt.OneofDescriptorProto>,
        options: pbandk.wkt.MessageOptions?,
        reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.DescriptorProto = pbandk.wkt.DescriptorProto {
        this.name = name
        this.field += field
        this.extension += extension
        this.nestedType += nestedType
        this.enumType += enumType
        this.extensionRange += extensionRange
        this.oneofDecl += oneofDecl
        this.options = options
        this.reservedRange += reservedRange
        this.reservedName += reservedName
        this.unknownFields += unknownFields
    }
}

private class MutableDescriptorProto_Impl(
    override var name: String?,
    override val field: pbandk.gen.MutableListField<pbandk.wkt.FieldDescriptorProto>,
    override val extension: pbandk.gen.MutableListField<pbandk.wkt.FieldDescriptorProto>,
    override val nestedType: pbandk.gen.MutableListField<pbandk.wkt.DescriptorProto>,
    override val enumType: pbandk.gen.MutableListField<pbandk.wkt.EnumDescriptorProto>,
    override val extensionRange: pbandk.gen.MutableListField<pbandk.wkt.DescriptorProto.ExtensionRange>,
    override val oneofDecl: pbandk.gen.MutableListField<pbandk.wkt.OneofDescriptorProto>,
    override var options: pbandk.wkt.MessageOptions?,
    override val reservedRange: pbandk.gen.MutableListField<pbandk.wkt.DescriptorProto.ReservedRange>,
    override val reservedName: pbandk.gen.MutableListField<String>,
) : pbandk.wkt.MutableDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.DescriptorProto>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        field: List<pbandk.wkt.FieldDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        nestedType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>,
        oneofDecl: List<pbandk.wkt.OneofDescriptorProto>,
        options: pbandk.wkt.MessageOptions?,
        reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.DescriptorProto = throw UnsupportedOperationException()

    fun toDescriptorProto() = DescriptorProto_Impl(
        name = name,
        field = field.toListField(),
        extension = extension.toListField(),
        nestedType = nestedType.toListField(),
        enumType = enumType.toListField(),
        extensionRange = extensionRange.toListField(),
        oneofDecl = oneofDecl.toListField(),
        options = options,
        reservedRange = reservedRange.toListField(),
        reservedName = reservedName.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [DescriptorProto.MutableExtensionRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDescriptorProtoExtensionRange")
public fun DescriptorProto.Companion.ExtensionRange(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit): pbandk.wkt.DescriptorProto.ExtensionRange =
    pbandk.wkt.DescriptorProto_MutableExtensionRange_Impl(
        start = null,
        end = null,
        options = null,
    ).also(builderAction).toExtensionRange()

/**
 * The [DescriptorProto.MutableExtensionRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableDescriptorProto.ExtensionRange(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit): pbandk.wkt.DescriptorProto.ExtensionRange =
    pbandk.wkt.DescriptorProto.ExtensionRange(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoExtensionRange")
public fun DescriptorProto.ExtensionRange?.orDefault(): pbandk.wkt.DescriptorProto.ExtensionRange = this ?: pbandk.wkt.DescriptorProto.ExtensionRange.defaultInstance

private class DescriptorProto_ExtensionRange_Impl(
    override val start: Int?,
    override val end: Int?,
    override val options: pbandk.wkt.ExtensionRangeOptions?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto.ExtensionRange, pbandk.gen.GeneratedMessage<pbandk.wkt.DescriptorProto.ExtensionRange>(unknownFields) {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ExtensionRange.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        options: pbandk.wkt.ExtensionRangeOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.DescriptorProto.ExtensionRange = pbandk.wkt.DescriptorProto.ExtensionRange {
        this.start = start
        this.end = end
        this.options = options
        this.unknownFields += unknownFields
    }
}

private class DescriptorProto_MutableExtensionRange_Impl(
    override var start: Int?,
    override var end: Int?,
    override var options: pbandk.wkt.ExtensionRangeOptions?,
) : pbandk.wkt.DescriptorProto.MutableExtensionRange, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.DescriptorProto.ExtensionRange>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ExtensionRange.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        options: pbandk.wkt.ExtensionRangeOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.DescriptorProto.ExtensionRange = throw UnsupportedOperationException()

    fun toExtensionRange() = DescriptorProto_ExtensionRange_Impl(
        start = start,
        end = end,
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [DescriptorProto.MutableReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDescriptorProtoReservedRange")
public fun DescriptorProto.Companion.ReservedRange(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit): pbandk.wkt.DescriptorProto.ReservedRange =
    pbandk.wkt.DescriptorProto_MutableReservedRange_Impl(
        start = null,
        end = null,
    ).also(builderAction).toReservedRange()

/**
 * The [DescriptorProto.MutableReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableDescriptorProto.ReservedRange(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit): pbandk.wkt.DescriptorProto.ReservedRange =
    pbandk.wkt.DescriptorProto.ReservedRange(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoReservedRange")
public fun DescriptorProto.ReservedRange?.orDefault(): pbandk.wkt.DescriptorProto.ReservedRange = this ?: pbandk.wkt.DescriptorProto.ReservedRange.defaultInstance

private class DescriptorProto_ReservedRange_Impl(
    override val start: Int?,
    override val end: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto.ReservedRange, pbandk.gen.GeneratedMessage<pbandk.wkt.DescriptorProto.ReservedRange>(unknownFields) {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ReservedRange.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.DescriptorProto.ReservedRange = pbandk.wkt.DescriptorProto.ReservedRange {
        this.start = start
        this.end = end
        this.unknownFields += unknownFields
    }
}

private class DescriptorProto_MutableReservedRange_Impl(
    override var start: Int?,
    override var end: Int?,
) : pbandk.wkt.DescriptorProto.MutableReservedRange, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.DescriptorProto.ReservedRange>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ReservedRange.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.DescriptorProto.ReservedRange = throw UnsupportedOperationException()

    fun toReservedRange() = DescriptorProto_ReservedRange_Impl(
        start = start,
        end = end,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ExtensionRangeOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ExtensionRangeOptions"],
        expression = "ExtensionRangeOptions {\nthis.uninterpretedOption += uninterpretedOption\nthis.declaration += declaration\nthis.features = features\nthis.verification = verification\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ExtensionRangeOptions(
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    declaration: List<pbandk.wkt.ExtensionRangeOptions.Declaration> = emptyList(),
    features: pbandk.wkt.FeatureSet? = null,
    verification: pbandk.wkt.ExtensionRangeOptions.VerificationState? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ExtensionRangeOptions = pbandk.wkt.ExtensionRangeOptions {
    this.uninterpretedOption += uninterpretedOption
    this.declaration += declaration
    this.features = features
    this.verification = verification
    this.unknownFields += unknownFields
}

/**
 * The [MutableExtensionRangeOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildExtensionRangeOptions")
public fun ExtensionRangeOptions(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit): pbandk.wkt.ExtensionRangeOptions =
    pbandk.wkt.MutableExtensionRangeOptions_Impl(
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.ExtensionRangeOptions.FieldDescriptors.uninterpretedOption),
        declaration = pbandk.gen.MutableListField(pbandk.wkt.ExtensionRangeOptions.FieldDescriptors.declaration),
        features = null,
        verification = null,
    ).also(builderAction).toExtensionRangeOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForExtensionRangeOptions")
public fun ExtensionRangeOptions?.orDefault(): pbandk.wkt.ExtensionRangeOptions = this ?: pbandk.wkt.ExtensionRangeOptions.defaultInstance

private class ExtensionRangeOptions_Impl(
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    override val declaration: pbandk.gen.ListField<pbandk.wkt.ExtensionRangeOptions.Declaration>,
    override val features: pbandk.wkt.FeatureSet?,
    override val verification: pbandk.wkt.ExtensionRangeOptions.VerificationState?,
    extensionFields: pbandk.FieldSet<pbandk.wkt.ExtensionRangeOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ExtensionRangeOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.ExtensionRangeOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.ExtensionRangeOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        declaration: List<pbandk.wkt.ExtensionRangeOptions.Declaration>,
        features: pbandk.wkt.FeatureSet?,
        verification: pbandk.wkt.ExtensionRangeOptions.VerificationState?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ExtensionRangeOptions = pbandk.wkt.ExtensionRangeOptions {
        this.uninterpretedOption += uninterpretedOption
        this.declaration += declaration
        this.features = features
        this.verification = verification
        this.unknownFields += unknownFields
    }
}

private class MutableExtensionRangeOptions_Impl(
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
    override val declaration: pbandk.gen.MutableListField<pbandk.wkt.ExtensionRangeOptions.Declaration>,
    override var features: pbandk.wkt.FeatureSet?,
    override var verification: pbandk.wkt.ExtensionRangeOptions.VerificationState?,
) : pbandk.wkt.MutableExtensionRangeOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.ExtensionRangeOptions>() {
    override val descriptor get() = pbandk.wkt.ExtensionRangeOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        declaration: List<pbandk.wkt.ExtensionRangeOptions.Declaration>,
        features: pbandk.wkt.FeatureSet?,
        verification: pbandk.wkt.ExtensionRangeOptions.VerificationState?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ExtensionRangeOptions = throw UnsupportedOperationException()

    fun toExtensionRangeOptions() = ExtensionRangeOptions_Impl(
        uninterpretedOption = uninterpretedOption.toListField(),
        declaration = declaration.toListField(),
        features = features,
        verification = verification,
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [ExtensionRangeOptions.MutableDeclaration] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildExtensionRangeOptionsDeclaration")
public fun ExtensionRangeOptions.Companion.Declaration(builderAction: pbandk.wkt.ExtensionRangeOptions.MutableDeclaration.() -> Unit): pbandk.wkt.ExtensionRangeOptions.Declaration =
    pbandk.wkt.ExtensionRangeOptions_MutableDeclaration_Impl(
        number = null,
        fullName = null,
        type = null,
        reserved = null,
        repeated = null,
    ).also(builderAction).toDeclaration()

/**
 * The [ExtensionRangeOptions.MutableDeclaration] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableExtensionRangeOptions.Declaration(builderAction: pbandk.wkt.ExtensionRangeOptions.MutableDeclaration.() -> Unit): pbandk.wkt.ExtensionRangeOptions.Declaration =
    pbandk.wkt.ExtensionRangeOptions.Declaration(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForExtensionRangeOptionsDeclaration")
public fun ExtensionRangeOptions.Declaration?.orDefault(): pbandk.wkt.ExtensionRangeOptions.Declaration = this ?: pbandk.wkt.ExtensionRangeOptions.Declaration.defaultInstance

private class ExtensionRangeOptions_Declaration_Impl(
    override val number: Int?,
    override val fullName: String?,
    override val type: String?,
    override val reserved: Boolean?,
    override val repeated: Boolean?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ExtensionRangeOptions.Declaration, pbandk.gen.GeneratedMessage<pbandk.wkt.ExtensionRangeOptions.Declaration>(unknownFields) {
    override val descriptor get() = pbandk.wkt.ExtensionRangeOptions.Declaration.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.ExtensionRangeOptions.MutableDeclaration.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        number: Int?,
        fullName: String?,
        type: String?,
        reserved: Boolean?,
        repeated: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ExtensionRangeOptions.Declaration = pbandk.wkt.ExtensionRangeOptions.Declaration {
        this.number = number
        this.fullName = fullName
        this.type = type
        this.reserved = reserved
        this.repeated = repeated
        this.unknownFields += unknownFields
    }
}

private class ExtensionRangeOptions_MutableDeclaration_Impl(
    override var number: Int?,
    override var fullName: String?,
    override var type: String?,
    override var reserved: Boolean?,
    override var repeated: Boolean?,
) : pbandk.wkt.ExtensionRangeOptions.MutableDeclaration, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.ExtensionRangeOptions.Declaration>() {
    override val descriptor get() = pbandk.wkt.ExtensionRangeOptions.Declaration.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.ExtensionRangeOptions.MutableDeclaration.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        number: Int?,
        fullName: String?,
        type: String?,
        reserved: Boolean?,
        repeated: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ExtensionRangeOptions.Declaration = throw UnsupportedOperationException()

    fun toDeclaration() = ExtensionRangeOptions_Declaration_Impl(
        number = number,
        fullName = fullName,
        type = type,
        reserved = reserved,
        repeated = repeated,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FieldDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FieldDescriptorProto"],
        expression = "FieldDescriptorProto {\nthis.name = name\nthis.number = number\nthis.label = label\nthis.type = type\nthis.typeName = typeName\nthis.extendee = extendee\nthis.defaultValue = defaultValue\nthis.oneofIndex = oneofIndex\nthis.jsonName = jsonName\nthis.options = options\nthis.proto3Optional = proto3Optional\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FieldDescriptorProto(
    name: String? = null,
    number: Int? = null,
    label: pbandk.wkt.FieldDescriptorProto.Label? = null,
    type: pbandk.wkt.FieldDescriptorProto.Type? = null,
    typeName: String? = null,
    extendee: String? = null,
    defaultValue: String? = null,
    oneofIndex: Int? = null,
    jsonName: String? = null,
    options: pbandk.wkt.FieldOptions? = null,
    proto3Optional: Boolean? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FieldDescriptorProto = pbandk.wkt.FieldDescriptorProto {
    this.name = name
    this.number = number
    this.label = label
    this.type = type
    this.typeName = typeName
    this.extendee = extendee
    this.defaultValue = defaultValue
    this.oneofIndex = oneofIndex
    this.jsonName = jsonName
    this.options = options
    this.proto3Optional = proto3Optional
    this.unknownFields += unknownFields
}

/**
 * The [MutableFieldDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldDescriptorProto")
public fun FieldDescriptorProto(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit): pbandk.wkt.FieldDescriptorProto =
    pbandk.wkt.MutableFieldDescriptorProto_Impl(
        name = null,
        number = null,
        label = null,
        type = null,
        typeName = null,
        extendee = null,
        defaultValue = null,
        oneofIndex = null,
        jsonName = null,
        options = null,
        proto3Optional = null,
    ).also(builderAction).toFieldDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldDescriptorProto")
public fun FieldDescriptorProto?.orDefault(): pbandk.wkt.FieldDescriptorProto = this ?: pbandk.wkt.FieldDescriptorProto.defaultInstance

private class FieldDescriptorProto_Impl(
    override val name: String?,
    override val number: Int?,
    override val label: pbandk.wkt.FieldDescriptorProto.Label?,
    override val type: pbandk.wkt.FieldDescriptorProto.Type?,
    override val typeName: String?,
    override val extendee: String?,
    override val defaultValue: String?,
    override val oneofIndex: Int?,
    override val jsonName: String?,
    override val options: pbandk.wkt.FieldOptions?,
    override val proto3Optional: Boolean?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.FieldDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FieldDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        label: pbandk.wkt.FieldDescriptorProto.Label?,
        type: pbandk.wkt.FieldDescriptorProto.Type?,
        typeName: String?,
        extendee: String?,
        defaultValue: String?,
        oneofIndex: Int?,
        jsonName: String?,
        options: pbandk.wkt.FieldOptions?,
        proto3Optional: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldDescriptorProto = pbandk.wkt.FieldDescriptorProto {
        this.name = name
        this.number = number
        this.label = label
        this.type = type
        this.typeName = typeName
        this.extendee = extendee
        this.defaultValue = defaultValue
        this.oneofIndex = oneofIndex
        this.jsonName = jsonName
        this.options = options
        this.proto3Optional = proto3Optional
        this.unknownFields += unknownFields
    }
}

private class MutableFieldDescriptorProto_Impl(
    override var name: String?,
    override var number: Int?,
    override var label: pbandk.wkt.FieldDescriptorProto.Label?,
    override var type: pbandk.wkt.FieldDescriptorProto.Type?,
    override var typeName: String?,
    override var extendee: String?,
    override var defaultValue: String?,
    override var oneofIndex: Int?,
    override var jsonName: String?,
    override var options: pbandk.wkt.FieldOptions?,
    override var proto3Optional: Boolean?,
) : pbandk.wkt.MutableFieldDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FieldDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.FieldDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        label: pbandk.wkt.FieldDescriptorProto.Label?,
        type: pbandk.wkt.FieldDescriptorProto.Type?,
        typeName: String?,
        extendee: String?,
        defaultValue: String?,
        oneofIndex: Int?,
        jsonName: String?,
        options: pbandk.wkt.FieldOptions?,
        proto3Optional: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldDescriptorProto = throw UnsupportedOperationException()

    fun toFieldDescriptorProto() = FieldDescriptorProto_Impl(
        name = name,
        number = number,
        label = label,
        type = type,
        typeName = typeName,
        extendee = extendee,
        defaultValue = defaultValue,
        oneofIndex = oneofIndex,
        jsonName = jsonName,
        options = options,
        proto3Optional = proto3Optional,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use OneofDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.OneofDescriptorProto"],
        expression = "OneofDescriptorProto {\nthis.name = name\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun OneofDescriptorProto(
    name: String? = null,
    options: pbandk.wkt.OneofOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.OneofDescriptorProto = pbandk.wkt.OneofDescriptorProto {
    this.name = name
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableOneofDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildOneofDescriptorProto")
public fun OneofDescriptorProto(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit): pbandk.wkt.OneofDescriptorProto =
    pbandk.wkt.MutableOneofDescriptorProto_Impl(
        name = null,
        options = null,
    ).also(builderAction).toOneofDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForOneofDescriptorProto")
public fun OneofDescriptorProto?.orDefault(): pbandk.wkt.OneofDescriptorProto = this ?: pbandk.wkt.OneofDescriptorProto.defaultInstance

private class OneofDescriptorProto_Impl(
    override val name: String?,
    override val options: pbandk.wkt.OneofOptions?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.OneofDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.OneofDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.OneofDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        options: pbandk.wkt.OneofOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.OneofDescriptorProto = pbandk.wkt.OneofDescriptorProto {
        this.name = name
        this.options = options
        this.unknownFields += unknownFields
    }
}

private class MutableOneofDescriptorProto_Impl(
    override var name: String?,
    override var options: pbandk.wkt.OneofOptions?,
) : pbandk.wkt.MutableOneofDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.OneofDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.OneofDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        options: pbandk.wkt.OneofOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.OneofDescriptorProto = throw UnsupportedOperationException()

    fun toOneofDescriptorProto() = OneofDescriptorProto_Impl(
        name = name,
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use EnumDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumDescriptorProto"],
        expression = "EnumDescriptorProto {\nthis.name = name\nthis.value += value\nthis.options = options\nthis.reservedRange += reservedRange\nthis.reservedName += reservedName\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumDescriptorProto(
    name: String? = null,
    value: List<pbandk.wkt.EnumValueDescriptorProto> = emptyList(),
    options: pbandk.wkt.EnumOptions? = null,
    reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = emptyList(),
    reservedName: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumDescriptorProto = pbandk.wkt.EnumDescriptorProto {
    this.name = name
    this.value += value
    this.options = options
    this.reservedRange += reservedRange
    this.reservedName += reservedName
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumDescriptorProto")
public fun EnumDescriptorProto(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit): pbandk.wkt.EnumDescriptorProto =
    pbandk.wkt.MutableEnumDescriptorProto_Impl(
        name = null,
        value = pbandk.gen.MutableListField(pbandk.wkt.EnumDescriptorProto.FieldDescriptors.value),
        options = null,
        reservedRange = pbandk.gen.MutableListField(pbandk.wkt.EnumDescriptorProto.FieldDescriptors.reservedRange),
        reservedName = pbandk.gen.MutableListField(pbandk.wkt.EnumDescriptorProto.FieldDescriptors.reservedName),
    ).also(builderAction).toEnumDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProto")
public fun EnumDescriptorProto?.orDefault(): pbandk.wkt.EnumDescriptorProto = this ?: pbandk.wkt.EnumDescriptorProto.defaultInstance

private class EnumDescriptorProto_Impl(
    override val name: String?,
    override val value: pbandk.gen.ListField<pbandk.wkt.EnumValueDescriptorProto>,
    override val options: pbandk.wkt.EnumOptions?,
    override val reservedRange: pbandk.gen.ListField<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
    override val reservedName: pbandk.gen.ListField<String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.EnumDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        value: List<pbandk.wkt.EnumValueDescriptorProto>,
        options: pbandk.wkt.EnumOptions?,
        reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumDescriptorProto = pbandk.wkt.EnumDescriptorProto {
        this.name = name
        this.value += value
        this.options = options
        this.reservedRange += reservedRange
        this.reservedName += reservedName
        this.unknownFields += unknownFields
    }
}

private class MutableEnumDescriptorProto_Impl(
    override var name: String?,
    override val value: pbandk.gen.MutableListField<pbandk.wkt.EnumValueDescriptorProto>,
    override var options: pbandk.wkt.EnumOptions?,
    override val reservedRange: pbandk.gen.MutableListField<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
    override val reservedName: pbandk.gen.MutableListField<String>,
) : pbandk.wkt.MutableEnumDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.EnumDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        value: List<pbandk.wkt.EnumValueDescriptorProto>,
        options: pbandk.wkt.EnumOptions?,
        reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumDescriptorProto = throw UnsupportedOperationException()

    fun toEnumDescriptorProto() = EnumDescriptorProto_Impl(
        name = name,
        value = value.toListField(),
        options = options,
        reservedRange = reservedRange.toListField(),
        reservedName = reservedName.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [EnumDescriptorProto.MutableEnumReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumDescriptorProtoEnumReservedRange")
public fun EnumDescriptorProto.Companion.EnumReservedRange(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit): pbandk.wkt.EnumDescriptorProto.EnumReservedRange =
    pbandk.wkt.EnumDescriptorProto_MutableEnumReservedRange_Impl(
        start = null,
        end = null,
    ).also(builderAction).toEnumReservedRange()

/**
 * The [EnumDescriptorProto.MutableEnumReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableEnumDescriptorProto.EnumReservedRange(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit): pbandk.wkt.EnumDescriptorProto.EnumReservedRange =
    pbandk.wkt.EnumDescriptorProto.EnumReservedRange(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProtoEnumReservedRange")
public fun EnumDescriptorProto.EnumReservedRange?.orDefault(): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = this ?: pbandk.wkt.EnumDescriptorProto.EnumReservedRange.defaultInstance

private class EnumDescriptorProto_EnumReservedRange_Impl(
    override val start: Int?,
    override val end: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumDescriptorProto.EnumReservedRange, pbandk.gen.GeneratedMessage<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>(unknownFields) {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = pbandk.wkt.EnumDescriptorProto.EnumReservedRange {
        this.start = start
        this.end = end
        this.unknownFields += unknownFields
    }
}

private class EnumDescriptorProto_MutableEnumReservedRange_Impl(
    override var start: Int?,
    override var end: Int?,
) : pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>() {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = throw UnsupportedOperationException()

    fun toEnumReservedRange() = EnumDescriptorProto_EnumReservedRange_Impl(
        start = start,
        end = end,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use EnumValueDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumValueDescriptorProto"],
        expression = "EnumValueDescriptorProto {\nthis.name = name\nthis.number = number\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumValueDescriptorProto(
    name: String? = null,
    number: Int? = null,
    options: pbandk.wkt.EnumValueOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumValueDescriptorProto = pbandk.wkt.EnumValueDescriptorProto {
    this.name = name
    this.number = number
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumValueDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumValueDescriptorProto")
public fun EnumValueDescriptorProto(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit): pbandk.wkt.EnumValueDescriptorProto =
    pbandk.wkt.MutableEnumValueDescriptorProto_Impl(
        name = null,
        number = null,
        options = null,
    ).also(builderAction).toEnumValueDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueDescriptorProto")
public fun EnumValueDescriptorProto?.orDefault(): pbandk.wkt.EnumValueDescriptorProto = this ?: pbandk.wkt.EnumValueDescriptorProto.defaultInstance

private class EnumValueDescriptorProto_Impl(
    override val name: String?,
    override val number: Int?,
    override val options: pbandk.wkt.EnumValueOptions?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumValueDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.EnumValueDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.EnumValueDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        options: pbandk.wkt.EnumValueOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumValueDescriptorProto = pbandk.wkt.EnumValueDescriptorProto {
        this.name = name
        this.number = number
        this.options = options
        this.unknownFields += unknownFields
    }
}

private class MutableEnumValueDescriptorProto_Impl(
    override var name: String?,
    override var number: Int?,
    override var options: pbandk.wkt.EnumValueOptions?,
) : pbandk.wkt.MutableEnumValueDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.EnumValueDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.EnumValueDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        options: pbandk.wkt.EnumValueOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumValueDescriptorProto = throw UnsupportedOperationException()

    fun toEnumValueDescriptorProto() = EnumValueDescriptorProto_Impl(
        name = name,
        number = number,
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ServiceDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ServiceDescriptorProto"],
        expression = "ServiceDescriptorProto {\nthis.name = name\nthis.method += method\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ServiceDescriptorProto(
    name: String? = null,
    method: List<pbandk.wkt.MethodDescriptorProto> = emptyList(),
    options: pbandk.wkt.ServiceOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ServiceDescriptorProto = pbandk.wkt.ServiceDescriptorProto {
    this.name = name
    this.method += method
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableServiceDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildServiceDescriptorProto")
public fun ServiceDescriptorProto(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit): pbandk.wkt.ServiceDescriptorProto =
    pbandk.wkt.MutableServiceDescriptorProto_Impl(
        name = null,
        method = pbandk.gen.MutableListField(pbandk.wkt.ServiceDescriptorProto.FieldDescriptors.method),
        options = null,
    ).also(builderAction).toServiceDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForServiceDescriptorProto")
public fun ServiceDescriptorProto?.orDefault(): pbandk.wkt.ServiceDescriptorProto = this ?: pbandk.wkt.ServiceDescriptorProto.defaultInstance

private class ServiceDescriptorProto_Impl(
    override val name: String?,
    override val method: pbandk.gen.ListField<pbandk.wkt.MethodDescriptorProto>,
    override val options: pbandk.wkt.ServiceOptions?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ServiceDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.ServiceDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.ServiceDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        method: List<pbandk.wkt.MethodDescriptorProto>,
        options: pbandk.wkt.ServiceOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ServiceDescriptorProto = pbandk.wkt.ServiceDescriptorProto {
        this.name = name
        this.method += method
        this.options = options
        this.unknownFields += unknownFields
    }
}

private class MutableServiceDescriptorProto_Impl(
    override var name: String?,
    override val method: pbandk.gen.MutableListField<pbandk.wkt.MethodDescriptorProto>,
    override var options: pbandk.wkt.ServiceOptions?,
) : pbandk.wkt.MutableServiceDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.ServiceDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.ServiceDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        method: List<pbandk.wkt.MethodDescriptorProto>,
        options: pbandk.wkt.ServiceOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ServiceDescriptorProto = throw UnsupportedOperationException()

    fun toServiceDescriptorProto() = ServiceDescriptorProto_Impl(
        name = name,
        method = method.toListField(),
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MethodDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.MethodDescriptorProto"],
        expression = "MethodDescriptorProto {\nthis.name = name\nthis.inputType = inputType\nthis.outputType = outputType\nthis.options = options\nthis.clientStreaming = clientStreaming\nthis.serverStreaming = serverStreaming\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MethodDescriptorProto(
    name: String? = null,
    inputType: String? = null,
    outputType: String? = null,
    options: pbandk.wkt.MethodOptions? = null,
    clientStreaming: Boolean? = null,
    serverStreaming: Boolean? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.MethodDescriptorProto = pbandk.wkt.MethodDescriptorProto {
    this.name = name
    this.inputType = inputType
    this.outputType = outputType
    this.options = options
    this.clientStreaming = clientStreaming
    this.serverStreaming = serverStreaming
    this.unknownFields += unknownFields
}

/**
 * The [MutableMethodDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMethodDescriptorProto")
public fun MethodDescriptorProto(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit): pbandk.wkt.MethodDescriptorProto =
    pbandk.wkt.MutableMethodDescriptorProto_Impl(
        name = null,
        inputType = null,
        outputType = null,
        options = null,
        clientStreaming = null,
        serverStreaming = null,
    ).also(builderAction).toMethodDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForMethodDescriptorProto")
public fun MethodDescriptorProto?.orDefault(): pbandk.wkt.MethodDescriptorProto = this ?: pbandk.wkt.MethodDescriptorProto.defaultInstance

private class MethodDescriptorProto_Impl(
    override val name: String?,
    override val inputType: String?,
    override val outputType: String?,
    override val options: pbandk.wkt.MethodOptions?,
    override val clientStreaming: Boolean?,
    override val serverStreaming: Boolean?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.MethodDescriptorProto, pbandk.gen.GeneratedMessage<pbandk.wkt.MethodDescriptorProto>(unknownFields) {
    override val descriptor get() = pbandk.wkt.MethodDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        inputType: String?,
        outputType: String?,
        options: pbandk.wkt.MethodOptions?,
        clientStreaming: Boolean?,
        serverStreaming: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.MethodDescriptorProto = pbandk.wkt.MethodDescriptorProto {
        this.name = name
        this.inputType = inputType
        this.outputType = outputType
        this.options = options
        this.clientStreaming = clientStreaming
        this.serverStreaming = serverStreaming
        this.unknownFields += unknownFields
    }
}

private class MutableMethodDescriptorProto_Impl(
    override var name: String?,
    override var inputType: String?,
    override var outputType: String?,
    override var options: pbandk.wkt.MethodOptions?,
    override var clientStreaming: Boolean?,
    override var serverStreaming: Boolean?,
) : pbandk.wkt.MutableMethodDescriptorProto, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.MethodDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.MethodDescriptorProto.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        inputType: String?,
        outputType: String?,
        options: pbandk.wkt.MethodOptions?,
        clientStreaming: Boolean?,
        serverStreaming: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.MethodDescriptorProto = throw UnsupportedOperationException()

    fun toMethodDescriptorProto() = MethodDescriptorProto_Impl(
        name = name,
        inputType = inputType,
        outputType = outputType,
        options = options,
        clientStreaming = clientStreaming,
        serverStreaming = serverStreaming,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FileOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FileOptions"],
        expression = "FileOptions {\nthis.javaPackage = javaPackage\nthis.javaOuterClassname = javaOuterClassname\nthis.javaMultipleFiles = javaMultipleFiles\nthis.javaGenerateEqualsAndHash = javaGenerateEqualsAndHash\nthis.javaStringCheckUtf8 = javaStringCheckUtf8\nthis.optimizeFor = optimizeFor\nthis.goPackage = goPackage\nthis.ccGenericServices = ccGenericServices\nthis.javaGenericServices = javaGenericServices\nthis.pyGenericServices = pyGenericServices\nthis.deprecated = deprecated\nthis.ccEnableArenas = ccEnableArenas\nthis.objcClassPrefix = objcClassPrefix\nthis.csharpNamespace = csharpNamespace\nthis.swiftPrefix = swiftPrefix\nthis.phpClassPrefix = phpClassPrefix\nthis.phpNamespace = phpNamespace\nthis.phpMetadataNamespace = phpMetadataNamespace\nthis.rubyPackage = rubyPackage\nthis.features = features\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FileOptions(
    javaPackage: String? = null,
    javaOuterClassname: String? = null,
    javaMultipleFiles: Boolean? = null,
    javaGenerateEqualsAndHash: Boolean? = null,
    javaStringCheckUtf8: Boolean? = null,
    optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null,
    goPackage: String? = null,
    ccGenericServices: Boolean? = null,
    javaGenericServices: Boolean? = null,
    pyGenericServices: Boolean? = null,
    deprecated: Boolean? = null,
    ccEnableArenas: Boolean? = null,
    objcClassPrefix: String? = null,
    csharpNamespace: String? = null,
    swiftPrefix: String? = null,
    phpClassPrefix: String? = null,
    phpNamespace: String? = null,
    phpMetadataNamespace: String? = null,
    rubyPackage: String? = null,
    features: pbandk.wkt.FeatureSet? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FileOptions = pbandk.wkt.FileOptions {
    this.javaPackage = javaPackage
    this.javaOuterClassname = javaOuterClassname
    this.javaMultipleFiles = javaMultipleFiles
    @Suppress("DEPRECATION")
    this.javaGenerateEqualsAndHash = javaGenerateEqualsAndHash
    this.javaStringCheckUtf8 = javaStringCheckUtf8
    this.optimizeFor = optimizeFor
    this.goPackage = goPackage
    this.ccGenericServices = ccGenericServices
    this.javaGenericServices = javaGenericServices
    this.pyGenericServices = pyGenericServices
    this.deprecated = deprecated
    this.ccEnableArenas = ccEnableArenas
    this.objcClassPrefix = objcClassPrefix
    this.csharpNamespace = csharpNamespace
    this.swiftPrefix = swiftPrefix
    this.phpClassPrefix = phpClassPrefix
    this.phpNamespace = phpNamespace
    this.phpMetadataNamespace = phpMetadataNamespace
    this.rubyPackage = rubyPackage
    this.features = features
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableFileOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFileOptions")
public fun FileOptions(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit): pbandk.wkt.FileOptions =
    pbandk.wkt.MutableFileOptions_Impl(
        javaPackage = null,
        javaOuterClassname = null,
        javaMultipleFiles = null,
        javaGenerateEqualsAndHash = null,
        javaStringCheckUtf8 = null,
        optimizeFor = null,
        goPackage = null,
        ccGenericServices = null,
        javaGenericServices = null,
        pyGenericServices = null,
        deprecated = null,
        ccEnableArenas = null,
        objcClassPrefix = null,
        csharpNamespace = null,
        swiftPrefix = null,
        phpClassPrefix = null,
        phpNamespace = null,
        phpMetadataNamespace = null,
        rubyPackage = null,
        features = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.FileOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toFileOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForFileOptions")
public fun FileOptions?.orDefault(): pbandk.wkt.FileOptions = this ?: pbandk.wkt.FileOptions.defaultInstance

private class FileOptions_Impl(
    override val javaPackage: String?,
    override val javaOuterClassname: String?,
    override val javaMultipleFiles: Boolean?,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    override val javaGenerateEqualsAndHash: Boolean?,
    override val javaStringCheckUtf8: Boolean?,
    override val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
    override val goPackage: String?,
    override val ccGenericServices: Boolean?,
    override val javaGenericServices: Boolean?,
    override val pyGenericServices: Boolean?,
    override val deprecated: Boolean?,
    override val ccEnableArenas: Boolean?,
    override val objcClassPrefix: String?,
    override val csharpNamespace: String?,
    override val swiftPrefix: String?,
    override val phpClassPrefix: String?,
    override val phpNamespace: String?,
    override val phpMetadataNamespace: String?,
    override val rubyPackage: String?,
    override val features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.FileOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FileOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.FileOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.FileOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        javaPackage: String?,
        javaOuterClassname: String?,
        javaMultipleFiles: Boolean?,
        javaGenerateEqualsAndHash: Boolean?,
        javaStringCheckUtf8: Boolean?,
        optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
        goPackage: String?,
        ccGenericServices: Boolean?,
        javaGenericServices: Boolean?,
        pyGenericServices: Boolean?,
        deprecated: Boolean?,
        ccEnableArenas: Boolean?,
        objcClassPrefix: String?,
        csharpNamespace: String?,
        swiftPrefix: String?,
        phpClassPrefix: String?,
        phpNamespace: String?,
        phpMetadataNamespace: String?,
        rubyPackage: String?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FileOptions = pbandk.wkt.FileOptions {
        this.javaPackage = javaPackage
        this.javaOuterClassname = javaOuterClassname
        this.javaMultipleFiles = javaMultipleFiles
        @Suppress("DEPRECATION")
        this.javaGenerateEqualsAndHash = javaGenerateEqualsAndHash
        this.javaStringCheckUtf8 = javaStringCheckUtf8
        this.optimizeFor = optimizeFor
        this.goPackage = goPackage
        this.ccGenericServices = ccGenericServices
        this.javaGenericServices = javaGenericServices
        this.pyGenericServices = pyGenericServices
        this.deprecated = deprecated
        this.ccEnableArenas = ccEnableArenas
        this.objcClassPrefix = objcClassPrefix
        this.csharpNamespace = csharpNamespace
        this.swiftPrefix = swiftPrefix
        this.phpClassPrefix = phpClassPrefix
        this.phpNamespace = phpNamespace
        this.phpMetadataNamespace = phpMetadataNamespace
        this.rubyPackage = rubyPackage
        this.features = features
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableFileOptions_Impl(
    override var javaPackage: String?,
    override var javaOuterClassname: String?,
    override var javaMultipleFiles: Boolean?,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    override var javaGenerateEqualsAndHash: Boolean?,
    override var javaStringCheckUtf8: Boolean?,
    override var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
    override var goPackage: String?,
    override var ccGenericServices: Boolean?,
    override var javaGenericServices: Boolean?,
    override var pyGenericServices: Boolean?,
    override var deprecated: Boolean?,
    override var ccEnableArenas: Boolean?,
    override var objcClassPrefix: String?,
    override var csharpNamespace: String?,
    override var swiftPrefix: String?,
    override var phpClassPrefix: String?,
    override var phpNamespace: String?,
    override var phpMetadataNamespace: String?,
    override var rubyPackage: String?,
    override var features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableFileOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.FileOptions>() {
    override val descriptor get() = pbandk.wkt.FileOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        javaPackage: String?,
        javaOuterClassname: String?,
        javaMultipleFiles: Boolean?,
        javaGenerateEqualsAndHash: Boolean?,
        javaStringCheckUtf8: Boolean?,
        optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
        goPackage: String?,
        ccGenericServices: Boolean?,
        javaGenericServices: Boolean?,
        pyGenericServices: Boolean?,
        deprecated: Boolean?,
        ccEnableArenas: Boolean?,
        objcClassPrefix: String?,
        csharpNamespace: String?,
        swiftPrefix: String?,
        phpClassPrefix: String?,
        phpNamespace: String?,
        phpMetadataNamespace: String?,
        rubyPackage: String?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FileOptions = throw UnsupportedOperationException()

    fun toFileOptions() = FileOptions_Impl(
        javaPackage = javaPackage,
        javaOuterClassname = javaOuterClassname,
        javaMultipleFiles = javaMultipleFiles,
        javaGenerateEqualsAndHash = @Suppress("DEPRECATION") javaGenerateEqualsAndHash,
        javaStringCheckUtf8 = javaStringCheckUtf8,
        optimizeFor = optimizeFor,
        goPackage = goPackage,
        ccGenericServices = ccGenericServices,
        javaGenericServices = javaGenericServices,
        pyGenericServices = pyGenericServices,
        deprecated = deprecated,
        ccEnableArenas = ccEnableArenas,
        objcClassPrefix = objcClassPrefix,
        csharpNamespace = csharpNamespace,
        swiftPrefix = swiftPrefix,
        phpClassPrefix = phpClassPrefix,
        phpNamespace = phpNamespace,
        phpMetadataNamespace = phpMetadataNamespace,
        rubyPackage = rubyPackage,
        features = features,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MessageOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.MessageOptions"],
        expression = "MessageOptions {\nthis.messageSetWireFormat = messageSetWireFormat\nthis.noStandardDescriptorAccessor = noStandardDescriptorAccessor\nthis.deprecated = deprecated\nthis.mapEntry = mapEntry\nthis.deprecatedLegacyJsonFieldConflicts = deprecatedLegacyJsonFieldConflicts\nthis.features = features\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageOptions(
    messageSetWireFormat: Boolean? = null,
    noStandardDescriptorAccessor: Boolean? = null,
    deprecated: Boolean? = null,
    mapEntry: Boolean? = null,
    deprecatedLegacyJsonFieldConflicts: Boolean? = null,
    features: pbandk.wkt.FeatureSet? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.MessageOptions = pbandk.wkt.MessageOptions {
    this.messageSetWireFormat = messageSetWireFormat
    this.noStandardDescriptorAccessor = noStandardDescriptorAccessor
    this.deprecated = deprecated
    this.mapEntry = mapEntry
    @Suppress("DEPRECATION")
    this.deprecatedLegacyJsonFieldConflicts = deprecatedLegacyJsonFieldConflicts
    this.features = features
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageOptions")
public fun MessageOptions(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit): pbandk.wkt.MessageOptions =
    pbandk.wkt.MutableMessageOptions_Impl(
        messageSetWireFormat = null,
        noStandardDescriptorAccessor = null,
        deprecated = null,
        mapEntry = null,
        deprecatedLegacyJsonFieldConflicts = null,
        features = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.MessageOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toMessageOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageOptions")
public fun MessageOptions?.orDefault(): pbandk.wkt.MessageOptions = this ?: pbandk.wkt.MessageOptions.defaultInstance

private class MessageOptions_Impl(
    override val messageSetWireFormat: Boolean?,
    override val noStandardDescriptorAccessor: Boolean?,
    override val deprecated: Boolean?,
    override val mapEntry: Boolean?,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    override val deprecatedLegacyJsonFieldConflicts: Boolean?,
    override val features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.MessageOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.MessageOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.MessageOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.MessageOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        messageSetWireFormat: Boolean?,
        noStandardDescriptorAccessor: Boolean?,
        deprecated: Boolean?,
        mapEntry: Boolean?,
        deprecatedLegacyJsonFieldConflicts: Boolean?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.MessageOptions = pbandk.wkt.MessageOptions {
        this.messageSetWireFormat = messageSetWireFormat
        this.noStandardDescriptorAccessor = noStandardDescriptorAccessor
        this.deprecated = deprecated
        this.mapEntry = mapEntry
        @Suppress("DEPRECATION")
        this.deprecatedLegacyJsonFieldConflicts = deprecatedLegacyJsonFieldConflicts
        this.features = features
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableMessageOptions_Impl(
    override var messageSetWireFormat: Boolean?,
    override var noStandardDescriptorAccessor: Boolean?,
    override var deprecated: Boolean?,
    override var mapEntry: Boolean?,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    override var deprecatedLegacyJsonFieldConflicts: Boolean?,
    override var features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableMessageOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.MessageOptions>() {
    override val descriptor get() = pbandk.wkt.MessageOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        messageSetWireFormat: Boolean?,
        noStandardDescriptorAccessor: Boolean?,
        deprecated: Boolean?,
        mapEntry: Boolean?,
        deprecatedLegacyJsonFieldConflicts: Boolean?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.MessageOptions = throw UnsupportedOperationException()

    fun toMessageOptions() = MessageOptions_Impl(
        messageSetWireFormat = messageSetWireFormat,
        noStandardDescriptorAccessor = noStandardDescriptorAccessor,
        deprecated = deprecated,
        mapEntry = mapEntry,
        deprecatedLegacyJsonFieldConflicts = @Suppress("DEPRECATION") deprecatedLegacyJsonFieldConflicts,
        features = features,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FieldOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FieldOptions"],
        expression = "FieldOptions {\nthis.ctype = ctype\nthis.packed = packed\nthis.jstype = jstype\nthis.lazy = lazy\nthis.unverifiedLazy = unverifiedLazy\nthis.deprecated = deprecated\nthis.weak = weak\nthis.debugRedact = debugRedact\nthis.retention = retention\nthis.targets += targets\nthis.editionDefaults += editionDefaults\nthis.features = features\nthis.featureSupport = featureSupport\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FieldOptions(
    ctype: pbandk.wkt.FieldOptions.CType? = null,
    packed: Boolean? = null,
    jstype: pbandk.wkt.FieldOptions.JSType? = null,
    lazy: Boolean? = null,
    unverifiedLazy: Boolean? = null,
    deprecated: Boolean? = null,
    weak: Boolean? = null,
    debugRedact: Boolean? = null,
    retention: pbandk.wkt.FieldOptions.OptionRetention? = null,
    targets: List<pbandk.wkt.FieldOptions.OptionTargetType> = emptyList(),
    editionDefaults: List<pbandk.wkt.FieldOptions.EditionDefault> = emptyList(),
    features: pbandk.wkt.FeatureSet? = null,
    featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FieldOptions = pbandk.wkt.FieldOptions {
    this.ctype = ctype
    this.packed = packed
    this.jstype = jstype
    this.lazy = lazy
    this.unverifiedLazy = unverifiedLazy
    this.deprecated = deprecated
    this.weak = weak
    this.debugRedact = debugRedact
    this.retention = retention
    this.targets += targets
    this.editionDefaults += editionDefaults
    this.features = features
    this.featureSupport = featureSupport
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableFieldOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldOptions")
public fun FieldOptions(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit): pbandk.wkt.FieldOptions =
    pbandk.wkt.MutableFieldOptions_Impl(
        ctype = null,
        packed = null,
        jstype = null,
        lazy = null,
        unverifiedLazy = null,
        deprecated = null,
        weak = null,
        debugRedact = null,
        retention = null,
        targets = pbandk.gen.MutableListField(pbandk.wkt.FieldOptions.FieldDescriptors.targets),
        editionDefaults = pbandk.gen.MutableListField(pbandk.wkt.FieldOptions.FieldDescriptors.editionDefaults),
        features = null,
        featureSupport = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.FieldOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toFieldOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptions")
public fun FieldOptions?.orDefault(): pbandk.wkt.FieldOptions = this ?: pbandk.wkt.FieldOptions.defaultInstance

private class FieldOptions_Impl(
    override val ctype: pbandk.wkt.FieldOptions.CType?,
    override val packed: Boolean?,
    override val jstype: pbandk.wkt.FieldOptions.JSType?,
    override val lazy: Boolean?,
    override val unverifiedLazy: Boolean?,
    override val deprecated: Boolean?,
    override val weak: Boolean?,
    override val debugRedact: Boolean?,
    override val retention: pbandk.wkt.FieldOptions.OptionRetention?,
    override val targets: pbandk.gen.ListField<pbandk.wkt.FieldOptions.OptionTargetType>,
    override val editionDefaults: pbandk.gen.ListField<pbandk.wkt.FieldOptions.EditionDefault>,
    override val features: pbandk.wkt.FeatureSet?,
    override val featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.FieldOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.FieldOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.FieldOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        ctype: pbandk.wkt.FieldOptions.CType?,
        packed: Boolean?,
        jstype: pbandk.wkt.FieldOptions.JSType?,
        lazy: Boolean?,
        unverifiedLazy: Boolean?,
        deprecated: Boolean?,
        weak: Boolean?,
        debugRedact: Boolean?,
        retention: pbandk.wkt.FieldOptions.OptionRetention?,
        targets: List<pbandk.wkt.FieldOptions.OptionTargetType>,
        editionDefaults: List<pbandk.wkt.FieldOptions.EditionDefault>,
        features: pbandk.wkt.FeatureSet?,
        featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldOptions = pbandk.wkt.FieldOptions {
        this.ctype = ctype
        this.packed = packed
        this.jstype = jstype
        this.lazy = lazy
        this.unverifiedLazy = unverifiedLazy
        this.deprecated = deprecated
        this.weak = weak
        this.debugRedact = debugRedact
        this.retention = retention
        this.targets += targets
        this.editionDefaults += editionDefaults
        this.features = features
        this.featureSupport = featureSupport
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableFieldOptions_Impl(
    override var ctype: pbandk.wkt.FieldOptions.CType?,
    override var packed: Boolean?,
    override var jstype: pbandk.wkt.FieldOptions.JSType?,
    override var lazy: Boolean?,
    override var unverifiedLazy: Boolean?,
    override var deprecated: Boolean?,
    override var weak: Boolean?,
    override var debugRedact: Boolean?,
    override var retention: pbandk.wkt.FieldOptions.OptionRetention?,
    override val targets: pbandk.gen.MutableListField<pbandk.wkt.FieldOptions.OptionTargetType>,
    override val editionDefaults: pbandk.gen.MutableListField<pbandk.wkt.FieldOptions.EditionDefault>,
    override var features: pbandk.wkt.FeatureSet?,
    override var featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableFieldOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.FieldOptions>() {
    override val descriptor get() = pbandk.wkt.FieldOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        ctype: pbandk.wkt.FieldOptions.CType?,
        packed: Boolean?,
        jstype: pbandk.wkt.FieldOptions.JSType?,
        lazy: Boolean?,
        unverifiedLazy: Boolean?,
        deprecated: Boolean?,
        weak: Boolean?,
        debugRedact: Boolean?,
        retention: pbandk.wkt.FieldOptions.OptionRetention?,
        targets: List<pbandk.wkt.FieldOptions.OptionTargetType>,
        editionDefaults: List<pbandk.wkt.FieldOptions.EditionDefault>,
        features: pbandk.wkt.FeatureSet?,
        featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldOptions = throw UnsupportedOperationException()

    fun toFieldOptions() = FieldOptions_Impl(
        ctype = ctype,
        packed = packed,
        jstype = jstype,
        lazy = lazy,
        unverifiedLazy = unverifiedLazy,
        deprecated = deprecated,
        weak = weak,
        debugRedact = debugRedact,
        retention = retention,
        targets = targets.toListField(),
        editionDefaults = editionDefaults.toListField(),
        features = features,
        featureSupport = featureSupport,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [FieldOptions.MutableEditionDefault] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldOptionsEditionDefault")
public fun FieldOptions.Companion.EditionDefault(builderAction: pbandk.wkt.FieldOptions.MutableEditionDefault.() -> Unit): pbandk.wkt.FieldOptions.EditionDefault =
    pbandk.wkt.FieldOptions_MutableEditionDefault_Impl(
        edition = null,
        value = null,
    ).also(builderAction).toEditionDefault()

/**
 * The [FieldOptions.MutableEditionDefault] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableFieldOptions.EditionDefault(builderAction: pbandk.wkt.FieldOptions.MutableEditionDefault.() -> Unit): pbandk.wkt.FieldOptions.EditionDefault =
    pbandk.wkt.FieldOptions.EditionDefault(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptionsEditionDefault")
public fun FieldOptions.EditionDefault?.orDefault(): pbandk.wkt.FieldOptions.EditionDefault = this ?: pbandk.wkt.FieldOptions.EditionDefault.defaultInstance

private class FieldOptions_EditionDefault_Impl(
    override val edition: pbandk.wkt.Edition?,
    override val value: String?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldOptions.EditionDefault, pbandk.gen.GeneratedMessage<pbandk.wkt.FieldOptions.EditionDefault>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FieldOptions.EditionDefault.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.FieldOptions.MutableEditionDefault.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        edition: pbandk.wkt.Edition?,
        value: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldOptions.EditionDefault = pbandk.wkt.FieldOptions.EditionDefault {
        this.edition = edition
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class FieldOptions_MutableEditionDefault_Impl(
    override var edition: pbandk.wkt.Edition?,
    override var value: String?,
) : pbandk.wkt.FieldOptions.MutableEditionDefault, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FieldOptions.EditionDefault>() {
    override val descriptor get() = pbandk.wkt.FieldOptions.EditionDefault.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.FieldOptions.MutableEditionDefault.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        edition: pbandk.wkt.Edition?,
        value: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldOptions.EditionDefault = throw UnsupportedOperationException()

    fun toEditionDefault() = FieldOptions_EditionDefault_Impl(
        edition = edition,
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [FieldOptions.MutableFeatureSupport] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldOptionsFeatureSupport")
public fun FieldOptions.Companion.FeatureSupport(builderAction: pbandk.wkt.FieldOptions.MutableFeatureSupport.() -> Unit): pbandk.wkt.FieldOptions.FeatureSupport =
    pbandk.wkt.FieldOptions_MutableFeatureSupport_Impl(
        editionIntroduced = null,
        editionDeprecated = null,
        deprecationWarning = null,
        editionRemoved = null,
    ).also(builderAction).toFeatureSupport()

/**
 * The [FieldOptions.MutableFeatureSupport] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableFieldOptions.FeatureSupport(builderAction: pbandk.wkt.FieldOptions.MutableFeatureSupport.() -> Unit): pbandk.wkt.FieldOptions.FeatureSupport =
    pbandk.wkt.FieldOptions.FeatureSupport(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptionsFeatureSupport")
public fun FieldOptions.FeatureSupport?.orDefault(): pbandk.wkt.FieldOptions.FeatureSupport = this ?: pbandk.wkt.FieldOptions.FeatureSupport.defaultInstance

private class FieldOptions_FeatureSupport_Impl(
    override val editionIntroduced: pbandk.wkt.Edition?,
    override val editionDeprecated: pbandk.wkt.Edition?,
    override val deprecationWarning: String?,
    override val editionRemoved: pbandk.wkt.Edition?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldOptions.FeatureSupport, pbandk.gen.GeneratedMessage<pbandk.wkt.FieldOptions.FeatureSupport>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FieldOptions.FeatureSupport.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.FieldOptions.MutableFeatureSupport.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        editionIntroduced: pbandk.wkt.Edition?,
        editionDeprecated: pbandk.wkt.Edition?,
        deprecationWarning: String?,
        editionRemoved: pbandk.wkt.Edition?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldOptions.FeatureSupport = pbandk.wkt.FieldOptions.FeatureSupport {
        this.editionIntroduced = editionIntroduced
        this.editionDeprecated = editionDeprecated
        this.deprecationWarning = deprecationWarning
        this.editionRemoved = editionRemoved
        this.unknownFields += unknownFields
    }
}

private class FieldOptions_MutableFeatureSupport_Impl(
    override var editionIntroduced: pbandk.wkt.Edition?,
    override var editionDeprecated: pbandk.wkt.Edition?,
    override var deprecationWarning: String?,
    override var editionRemoved: pbandk.wkt.Edition?,
) : pbandk.wkt.FieldOptions.MutableFeatureSupport, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FieldOptions.FeatureSupport>() {
    override val descriptor get() = pbandk.wkt.FieldOptions.FeatureSupport.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.FieldOptions.MutableFeatureSupport.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        editionIntroduced: pbandk.wkt.Edition?,
        editionDeprecated: pbandk.wkt.Edition?,
        deprecationWarning: String?,
        editionRemoved: pbandk.wkt.Edition?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FieldOptions.FeatureSupport = throw UnsupportedOperationException()

    fun toFeatureSupport() = FieldOptions_FeatureSupport_Impl(
        editionIntroduced = editionIntroduced,
        editionDeprecated = editionDeprecated,
        deprecationWarning = deprecationWarning,
        editionRemoved = editionRemoved,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use OneofOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.OneofOptions"],
        expression = "OneofOptions {\nthis.features = features\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun OneofOptions(
    features: pbandk.wkt.FeatureSet? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.OneofOptions = pbandk.wkt.OneofOptions {
    this.features = features
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableOneofOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildOneofOptions")
public fun OneofOptions(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit): pbandk.wkt.OneofOptions =
    pbandk.wkt.MutableOneofOptions_Impl(
        features = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.OneofOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toOneofOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForOneofOptions")
public fun OneofOptions?.orDefault(): pbandk.wkt.OneofOptions = this ?: pbandk.wkt.OneofOptions.defaultInstance

private class OneofOptions_Impl(
    override val features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.OneofOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.OneofOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.OneofOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.OneofOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.OneofOptions = pbandk.wkt.OneofOptions {
        this.features = features
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableOneofOptions_Impl(
    override var features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableOneofOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.OneofOptions>() {
    override val descriptor get() = pbandk.wkt.OneofOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.OneofOptions = throw UnsupportedOperationException()

    fun toOneofOptions() = OneofOptions_Impl(
        features = features,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use EnumOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumOptions"],
        expression = "EnumOptions {\nthis.allowAlias = allowAlias\nthis.deprecated = deprecated\nthis.deprecatedLegacyJsonFieldConflicts = deprecatedLegacyJsonFieldConflicts\nthis.features = features\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumOptions(
    allowAlias: Boolean? = null,
    deprecated: Boolean? = null,
    deprecatedLegacyJsonFieldConflicts: Boolean? = null,
    features: pbandk.wkt.FeatureSet? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumOptions = pbandk.wkt.EnumOptions {
    this.allowAlias = allowAlias
    this.deprecated = deprecated
    @Suppress("DEPRECATION")
    this.deprecatedLegacyJsonFieldConflicts = deprecatedLegacyJsonFieldConflicts
    this.features = features
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumOptions")
public fun EnumOptions(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit): pbandk.wkt.EnumOptions =
    pbandk.wkt.MutableEnumOptions_Impl(
        allowAlias = null,
        deprecated = null,
        deprecatedLegacyJsonFieldConflicts = null,
        features = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.EnumOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toEnumOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumOptions")
public fun EnumOptions?.orDefault(): pbandk.wkt.EnumOptions = this ?: pbandk.wkt.EnumOptions.defaultInstance

private class EnumOptions_Impl(
    override val allowAlias: Boolean?,
    override val deprecated: Boolean?,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    override val deprecatedLegacyJsonFieldConflicts: Boolean?,
    override val features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.EnumOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.EnumOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.EnumOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        allowAlias: Boolean?,
        deprecated: Boolean?,
        deprecatedLegacyJsonFieldConflicts: Boolean?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumOptions = pbandk.wkt.EnumOptions {
        this.allowAlias = allowAlias
        this.deprecated = deprecated
        @Suppress("DEPRECATION")
        this.deprecatedLegacyJsonFieldConflicts = deprecatedLegacyJsonFieldConflicts
        this.features = features
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableEnumOptions_Impl(
    override var allowAlias: Boolean?,
    override var deprecated: Boolean?,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    override var deprecatedLegacyJsonFieldConflicts: Boolean?,
    override var features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableEnumOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.EnumOptions>() {
    override val descriptor get() = pbandk.wkt.EnumOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        allowAlias: Boolean?,
        deprecated: Boolean?,
        deprecatedLegacyJsonFieldConflicts: Boolean?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumOptions = throw UnsupportedOperationException()

    fun toEnumOptions() = EnumOptions_Impl(
        allowAlias = allowAlias,
        deprecated = deprecated,
        deprecatedLegacyJsonFieldConflicts = @Suppress("DEPRECATION") deprecatedLegacyJsonFieldConflicts,
        features = features,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use EnumValueOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumValueOptions"],
        expression = "EnumValueOptions {\nthis.deprecated = deprecated\nthis.features = features\nthis.debugRedact = debugRedact\nthis.featureSupport = featureSupport\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumValueOptions(
    deprecated: Boolean? = null,
    features: pbandk.wkt.FeatureSet? = null,
    debugRedact: Boolean? = null,
    featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumValueOptions = pbandk.wkt.EnumValueOptions {
    this.deprecated = deprecated
    this.features = features
    this.debugRedact = debugRedact
    this.featureSupport = featureSupport
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumValueOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumValueOptions")
public fun EnumValueOptions(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit): pbandk.wkt.EnumValueOptions =
    pbandk.wkt.MutableEnumValueOptions_Impl(
        deprecated = null,
        features = null,
        debugRedact = null,
        featureSupport = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.EnumValueOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toEnumValueOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueOptions")
public fun EnumValueOptions?.orDefault(): pbandk.wkt.EnumValueOptions = this ?: pbandk.wkt.EnumValueOptions.defaultInstance

private class EnumValueOptions_Impl(
    override val deprecated: Boolean?,
    override val features: pbandk.wkt.FeatureSet?,
    override val debugRedact: Boolean?,
    override val featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.EnumValueOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumValueOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.EnumValueOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.EnumValueOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        features: pbandk.wkt.FeatureSet?,
        debugRedact: Boolean?,
        featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumValueOptions = pbandk.wkt.EnumValueOptions {
        this.deprecated = deprecated
        this.features = features
        this.debugRedact = debugRedact
        this.featureSupport = featureSupport
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableEnumValueOptions_Impl(
    override var deprecated: Boolean?,
    override var features: pbandk.wkt.FeatureSet?,
    override var debugRedact: Boolean?,
    override var featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableEnumValueOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.EnumValueOptions>() {
    override val descriptor get() = pbandk.wkt.EnumValueOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        features: pbandk.wkt.FeatureSet?,
        debugRedact: Boolean?,
        featureSupport: pbandk.wkt.FieldOptions.FeatureSupport?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumValueOptions = throw UnsupportedOperationException()

    fun toEnumValueOptions() = EnumValueOptions_Impl(
        deprecated = deprecated,
        features = features,
        debugRedact = debugRedact,
        featureSupport = featureSupport,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ServiceOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ServiceOptions"],
        expression = "ServiceOptions {\nthis.features = features\nthis.deprecated = deprecated\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ServiceOptions(
    features: pbandk.wkt.FeatureSet? = null,
    deprecated: Boolean? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ServiceOptions = pbandk.wkt.ServiceOptions {
    this.features = features
    this.deprecated = deprecated
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableServiceOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildServiceOptions")
public fun ServiceOptions(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit): pbandk.wkt.ServiceOptions =
    pbandk.wkt.MutableServiceOptions_Impl(
        features = null,
        deprecated = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.ServiceOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toServiceOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForServiceOptions")
public fun ServiceOptions?.orDefault(): pbandk.wkt.ServiceOptions = this ?: pbandk.wkt.ServiceOptions.defaultInstance

private class ServiceOptions_Impl(
    override val features: pbandk.wkt.FeatureSet?,
    override val deprecated: Boolean?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.ServiceOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ServiceOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.ServiceOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.ServiceOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        features: pbandk.wkt.FeatureSet?,
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ServiceOptions = pbandk.wkt.ServiceOptions {
        this.features = features
        this.deprecated = deprecated
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableServiceOptions_Impl(
    override var features: pbandk.wkt.FeatureSet?,
    override var deprecated: Boolean?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableServiceOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.ServiceOptions>() {
    override val descriptor get() = pbandk.wkt.ServiceOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        features: pbandk.wkt.FeatureSet?,
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.ServiceOptions = throw UnsupportedOperationException()

    fun toServiceOptions() = ServiceOptions_Impl(
        features = features,
        deprecated = deprecated,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MethodOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.MethodOptions"],
        expression = "MethodOptions {\nthis.deprecated = deprecated\nthis.idempotencyLevel = idempotencyLevel\nthis.features = features\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MethodOptions(
    deprecated: Boolean? = null,
    idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null,
    features: pbandk.wkt.FeatureSet? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.MethodOptions = pbandk.wkt.MethodOptions {
    this.deprecated = deprecated
    this.idempotencyLevel = idempotencyLevel
    this.features = features
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableMethodOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMethodOptions")
public fun MethodOptions(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit): pbandk.wkt.MethodOptions =
    pbandk.wkt.MutableMethodOptions_Impl(
        deprecated = null,
        idempotencyLevel = null,
        features = null,
        uninterpretedOption = pbandk.gen.MutableListField(pbandk.wkt.MethodOptions.FieldDescriptors.uninterpretedOption),
    ).also(builderAction).toMethodOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForMethodOptions")
public fun MethodOptions?.orDefault(): pbandk.wkt.MethodOptions = this ?: pbandk.wkt.MethodOptions.defaultInstance

private class MethodOptions_Impl(
    override val deprecated: Boolean?,
    override val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
    override val features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption>,
    extensionFields: pbandk.FieldSet<pbandk.wkt.MethodOptions>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.MethodOptions, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.MethodOptions>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.MethodOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.MethodOptions = pbandk.wkt.MethodOptions {
        this.deprecated = deprecated
        this.idempotencyLevel = idempotencyLevel
        this.features = features
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }
}

private class MutableMethodOptions_Impl(
    override var deprecated: Boolean?,
    override var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
    override var features: pbandk.wkt.FeatureSet?,
    override val uninterpretedOption: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption>,
) : pbandk.wkt.MutableMethodOptions, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.MethodOptions>() {
    override val descriptor get() = pbandk.wkt.MethodOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
        features: pbandk.wkt.FeatureSet?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.MethodOptions = throw UnsupportedOperationException()

    fun toMethodOptions() = MethodOptions_Impl(
        deprecated = deprecated,
        idempotencyLevel = idempotencyLevel,
        features = features,
        uninterpretedOption = uninterpretedOption.toListField(),
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use UninterpretedOption { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.UninterpretedOption"],
        expression = "UninterpretedOption {\nthis.name += name\nthis.identifierValue = identifierValue\nthis.positiveIntValue = positiveIntValue\nthis.negativeIntValue = negativeIntValue\nthis.doubleValue = doubleValue\nthis.stringValue = stringValue\nthis.aggregateValue = aggregateValue\nthis.unknownFields += unknownFields\n}",
    )
)
public fun UninterpretedOption(
    name: List<pbandk.wkt.UninterpretedOption.NamePart> = emptyList(),
    identifierValue: String? = null,
    positiveIntValue: Long? = null,
    negativeIntValue: Long? = null,
    doubleValue: Double? = null,
    stringValue: pbandk.ByteArr? = null,
    aggregateValue: String? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.UninterpretedOption = pbandk.wkt.UninterpretedOption {
    this.name += name
    this.identifierValue = identifierValue
    this.positiveIntValue = positiveIntValue
    this.negativeIntValue = negativeIntValue
    this.doubleValue = doubleValue
    this.stringValue = stringValue
    this.aggregateValue = aggregateValue
    this.unknownFields += unknownFields
}

/**
 * The [MutableUninterpretedOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUninterpretedOption")
public fun UninterpretedOption(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit): pbandk.wkt.UninterpretedOption =
    pbandk.wkt.MutableUninterpretedOption_Impl(
        name = pbandk.gen.MutableListField(pbandk.wkt.UninterpretedOption.FieldDescriptors.name),
        identifierValue = null,
        positiveIntValue = null,
        negativeIntValue = null,
        doubleValue = null,
        stringValue = null,
        aggregateValue = null,
    ).also(builderAction).toUninterpretedOption()

@pbandk.Export
@pbandk.JsName("orDefaultForUninterpretedOption")
public fun UninterpretedOption?.orDefault(): pbandk.wkt.UninterpretedOption = this ?: pbandk.wkt.UninterpretedOption.defaultInstance

private class UninterpretedOption_Impl(
    override val name: pbandk.gen.ListField<pbandk.wkt.UninterpretedOption.NamePart>,
    override val identifierValue: String?,
    override val positiveIntValue: Long?,
    override val negativeIntValue: Long?,
    override val doubleValue: Double?,
    override val stringValue: pbandk.ByteArr?,
    override val aggregateValue: String?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UninterpretedOption, pbandk.gen.GeneratedMessage<pbandk.wkt.UninterpretedOption>(unknownFields) {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: List<pbandk.wkt.UninterpretedOption.NamePart>,
        identifierValue: String?,
        positiveIntValue: Long?,
        negativeIntValue: Long?,
        doubleValue: Double?,
        stringValue: pbandk.ByteArr?,
        aggregateValue: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.UninterpretedOption = pbandk.wkt.UninterpretedOption {
        this.name += name
        this.identifierValue = identifierValue
        this.positiveIntValue = positiveIntValue
        this.negativeIntValue = negativeIntValue
        this.doubleValue = doubleValue
        this.stringValue = stringValue
        this.aggregateValue = aggregateValue
        this.unknownFields += unknownFields
    }
}

private class MutableUninterpretedOption_Impl(
    override val name: pbandk.gen.MutableListField<pbandk.wkt.UninterpretedOption.NamePart>,
    override var identifierValue: String?,
    override var positiveIntValue: Long?,
    override var negativeIntValue: Long?,
    override var doubleValue: Double?,
    override var stringValue: pbandk.ByteArr?,
    override var aggregateValue: String?,
) : pbandk.wkt.MutableUninterpretedOption, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.UninterpretedOption>() {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: List<pbandk.wkt.UninterpretedOption.NamePart>,
        identifierValue: String?,
        positiveIntValue: Long?,
        negativeIntValue: Long?,
        doubleValue: Double?,
        stringValue: pbandk.ByteArr?,
        aggregateValue: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.UninterpretedOption = throw UnsupportedOperationException()

    fun toUninterpretedOption() = UninterpretedOption_Impl(
        name = name.toListField(),
        identifierValue = identifierValue,
        positiveIntValue = positiveIntValue,
        negativeIntValue = negativeIntValue,
        doubleValue = doubleValue,
        stringValue = stringValue,
        aggregateValue = aggregateValue,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [UninterpretedOption.MutableNamePart] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUninterpretedOptionNamePart")
public fun UninterpretedOption.Companion.NamePart(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit): pbandk.wkt.UninterpretedOption.NamePart =
    pbandk.wkt.UninterpretedOption_MutableNamePart_Impl(
    ).also(builderAction).toNamePart()

/**
 * The [UninterpretedOption.MutableNamePart] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableUninterpretedOption.NamePart(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit): pbandk.wkt.UninterpretedOption.NamePart =
    pbandk.wkt.UninterpretedOption.NamePart(builderAction)

private class UninterpretedOption_NamePart_Impl(
    override val namePart: String,
    override val isExtension: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UninterpretedOption.NamePart, pbandk.gen.GeneratedMessage<pbandk.wkt.UninterpretedOption.NamePart>(unknownFields) {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.NamePart.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        namePart: String,
        isExtension: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.UninterpretedOption.NamePart = pbandk.wkt.UninterpretedOption.NamePart {
        this.namePart = namePart
        this.isExtension = isExtension
        this.unknownFields += unknownFields
    }
}

private class UninterpretedOption_MutableNamePart_Impl(
) : pbandk.wkt.UninterpretedOption.MutableNamePart, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.UninterpretedOption.NamePart>() {
    override lateinit var namePart: String

    private var hasIsExtension = false
    override var isExtension: Boolean = false
        get() = if (hasIsExtension) field else throw IllegalStateException("Property 'isExtension' should be initialized before get")
        set(value) { field = value; hasIsExtension = true }

    override val descriptor get() = pbandk.wkt.UninterpretedOption.NamePart.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        namePart: String,
        isExtension: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.UninterpretedOption.NamePart = throw UnsupportedOperationException()

    fun toNamePart() = UninterpretedOption_NamePart_Impl(
        namePart = if (this::namePart.isInitialized) {
            namePart
        } else {
            throw pbandk.InvalidProtocolBufferException.missingRequiredField("name_part")
        },
        isExtension = if (hasIsExtension) {
            isExtension
        } else {
            throw pbandk.InvalidProtocolBufferException.missingRequiredField("is_extension")
        },
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FeatureSet { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FeatureSet"],
        expression = "FeatureSet {\nthis.fieldPresence = fieldPresence\nthis.enumType = enumType\nthis.repeatedFieldEncoding = repeatedFieldEncoding\nthis.utf8Validation = utf8Validation\nthis.messageEncoding = messageEncoding\nthis.jsonFormat = jsonFormat\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FeatureSet(
    fieldPresence: pbandk.wkt.FeatureSet.FieldPresence? = null,
    enumType: pbandk.wkt.FeatureSet.EnumType? = null,
    repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding? = null,
    utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation? = null,
    messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding? = null,
    jsonFormat: pbandk.wkt.FeatureSet.JsonFormat? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FeatureSet = pbandk.wkt.FeatureSet {
    this.fieldPresence = fieldPresence
    this.enumType = enumType
    this.repeatedFieldEncoding = repeatedFieldEncoding
    this.utf8Validation = utf8Validation
    this.messageEncoding = messageEncoding
    this.jsonFormat = jsonFormat
    this.unknownFields += unknownFields
}

/**
 * The [MutableFeatureSet] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFeatureSet")
public fun FeatureSet(builderAction: pbandk.wkt.MutableFeatureSet.() -> Unit): pbandk.wkt.FeatureSet =
    pbandk.wkt.MutableFeatureSet_Impl(
        fieldPresence = null,
        enumType = null,
        repeatedFieldEncoding = null,
        utf8Validation = null,
        messageEncoding = null,
        jsonFormat = null,
    ).also(builderAction).toFeatureSet()

@pbandk.Export
@pbandk.JsName("orDefaultForFeatureSet")
public fun FeatureSet?.orDefault(): pbandk.wkt.FeatureSet = this ?: pbandk.wkt.FeatureSet.defaultInstance

private class FeatureSet_Impl(
    override val fieldPresence: pbandk.wkt.FeatureSet.FieldPresence?,
    override val enumType: pbandk.wkt.FeatureSet.EnumType?,
    override val repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding?,
    override val utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation?,
    override val messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding?,
    override val jsonFormat: pbandk.wkt.FeatureSet.JsonFormat?,
    extensionFields: pbandk.FieldSet<pbandk.wkt.FeatureSet>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FeatureSet, pbandk.gen.GeneratedExtendableMessage<pbandk.wkt.FeatureSet>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.wkt.FeatureSet.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFeatureSet.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fieldPresence: pbandk.wkt.FeatureSet.FieldPresence?,
        enumType: pbandk.wkt.FeatureSet.EnumType?,
        repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding?,
        utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation?,
        messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding?,
        jsonFormat: pbandk.wkt.FeatureSet.JsonFormat?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FeatureSet = pbandk.wkt.FeatureSet {
        this.fieldPresence = fieldPresence
        this.enumType = enumType
        this.repeatedFieldEncoding = repeatedFieldEncoding
        this.utf8Validation = utf8Validation
        this.messageEncoding = messageEncoding
        this.jsonFormat = jsonFormat
        this.unknownFields += unknownFields
    }
}

private class MutableFeatureSet_Impl(
    override var fieldPresence: pbandk.wkt.FeatureSet.FieldPresence?,
    override var enumType: pbandk.wkt.FeatureSet.EnumType?,
    override var repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding?,
    override var utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation?,
    override var messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding?,
    override var jsonFormat: pbandk.wkt.FeatureSet.JsonFormat?,
) : pbandk.wkt.MutableFeatureSet, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.wkt.FeatureSet>() {
    override val descriptor get() = pbandk.wkt.FeatureSet.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFeatureSet.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fieldPresence: pbandk.wkt.FeatureSet.FieldPresence?,
        enumType: pbandk.wkt.FeatureSet.EnumType?,
        repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding?,
        utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation?,
        messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding?,
        jsonFormat: pbandk.wkt.FeatureSet.JsonFormat?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FeatureSet = throw UnsupportedOperationException()

    fun toFeatureSet() = FeatureSet_Impl(
        fieldPresence = fieldPresence,
        enumType = enumType,
        repeatedFieldEncoding = repeatedFieldEncoding,
        utf8Validation = utf8Validation,
        messageEncoding = messageEncoding,
        jsonFormat = jsonFormat,
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FeatureSetDefaults { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FeatureSetDefaults"],
        expression = "FeatureSetDefaults {\nthis.defaults += defaults\nthis.minimumEdition = minimumEdition\nthis.maximumEdition = maximumEdition\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FeatureSetDefaults(
    defaults: List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> = emptyList(),
    minimumEdition: pbandk.wkt.Edition? = null,
    maximumEdition: pbandk.wkt.Edition? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FeatureSetDefaults = pbandk.wkt.FeatureSetDefaults {
    this.defaults += defaults
    this.minimumEdition = minimumEdition
    this.maximumEdition = maximumEdition
    this.unknownFields += unknownFields
}

/**
 * The [MutableFeatureSetDefaults] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFeatureSetDefaults")
public fun FeatureSetDefaults(builderAction: pbandk.wkt.MutableFeatureSetDefaults.() -> Unit): pbandk.wkt.FeatureSetDefaults =
    pbandk.wkt.MutableFeatureSetDefaults_Impl(
        defaults = pbandk.gen.MutableListField(pbandk.wkt.FeatureSetDefaults.FieldDescriptors.defaults),
        minimumEdition = null,
        maximumEdition = null,
    ).also(builderAction).toFeatureSetDefaults()

@pbandk.Export
@pbandk.JsName("orDefaultForFeatureSetDefaults")
public fun FeatureSetDefaults?.orDefault(): pbandk.wkt.FeatureSetDefaults = this ?: pbandk.wkt.FeatureSetDefaults.defaultInstance

private class FeatureSetDefaults_Impl(
    override val defaults: pbandk.gen.ListField<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>,
    override val minimumEdition: pbandk.wkt.Edition?,
    override val maximumEdition: pbandk.wkt.Edition?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FeatureSetDefaults, pbandk.gen.GeneratedMessage<pbandk.wkt.FeatureSetDefaults>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FeatureSetDefaults.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFeatureSetDefaults.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        defaults: List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>,
        minimumEdition: pbandk.wkt.Edition?,
        maximumEdition: pbandk.wkt.Edition?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FeatureSetDefaults = pbandk.wkt.FeatureSetDefaults {
        this.defaults += defaults
        this.minimumEdition = minimumEdition
        this.maximumEdition = maximumEdition
        this.unknownFields += unknownFields
    }
}

private class MutableFeatureSetDefaults_Impl(
    override val defaults: pbandk.gen.MutableListField<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>,
    override var minimumEdition: pbandk.wkt.Edition?,
    override var maximumEdition: pbandk.wkt.Edition?,
) : pbandk.wkt.MutableFeatureSetDefaults, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FeatureSetDefaults>() {
    override val descriptor get() = pbandk.wkt.FeatureSetDefaults.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFeatureSetDefaults.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        defaults: List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>,
        minimumEdition: pbandk.wkt.Edition?,
        maximumEdition: pbandk.wkt.Edition?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FeatureSetDefaults = throw UnsupportedOperationException()

    fun toFeatureSetDefaults() = FeatureSetDefaults_Impl(
        defaults = defaults.toListField(),
        minimumEdition = minimumEdition,
        maximumEdition = maximumEdition,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [FeatureSetDefaults.MutableFeatureSetEditionDefault] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFeatureSetDefaultsFeatureSetEditionDefault")
public fun FeatureSetDefaults.Companion.FeatureSetEditionDefault(builderAction: pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault.() -> Unit): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault =
    pbandk.wkt.FeatureSetDefaults_MutableFeatureSetEditionDefault_Impl(
        edition = null,
        overridableFeatures = null,
        fixedFeatures = null,
    ).also(builderAction).toFeatureSetEditionDefault()

/**
 * The [FeatureSetDefaults.MutableFeatureSetEditionDefault] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableFeatureSetDefaults.FeatureSetEditionDefault(builderAction: pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault.() -> Unit): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault =
    pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFeatureSetDefaultsFeatureSetEditionDefault")
public fun FeatureSetDefaults.FeatureSetEditionDefault?.orDefault(): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = this ?: pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.defaultInstance

private class FeatureSetDefaults_FeatureSetEditionDefault_Impl(
    override val edition: pbandk.wkt.Edition?,
    override val overridableFeatures: pbandk.wkt.FeatureSet?,
    override val fixedFeatures: pbandk.wkt.FeatureSet?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault, pbandk.gen.GeneratedMessage<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        edition: pbandk.wkt.Edition?,
        overridableFeatures: pbandk.wkt.FeatureSet?,
        fixedFeatures: pbandk.wkt.FeatureSet?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault {
        this.edition = edition
        this.overridableFeatures = overridableFeatures
        this.fixedFeatures = fixedFeatures
        this.unknownFields += unknownFields
    }
}

private class FeatureSetDefaults_MutableFeatureSetEditionDefault_Impl(
    override var edition: pbandk.wkt.Edition?,
    override var overridableFeatures: pbandk.wkt.FeatureSet?,
    override var fixedFeatures: pbandk.wkt.FeatureSet?,
) : pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>() {
    override val descriptor get() = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.FeatureSetDefaults.MutableFeatureSetEditionDefault.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        edition: pbandk.wkt.Edition?,
        overridableFeatures: pbandk.wkt.FeatureSet?,
        fixedFeatures: pbandk.wkt.FeatureSet?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = throw UnsupportedOperationException()

    fun toFeatureSetEditionDefault() = FeatureSetDefaults_FeatureSetEditionDefault_Impl(
        edition = edition,
        overridableFeatures = overridableFeatures,
        fixedFeatures = fixedFeatures,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use SourceCodeInfo { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.SourceCodeInfo"],
        expression = "SourceCodeInfo {\nthis.location += location\nthis.unknownFields += unknownFields\n}",
    )
)
public fun SourceCodeInfo(
    location: List<pbandk.wkt.SourceCodeInfo.Location> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.SourceCodeInfo = pbandk.wkt.SourceCodeInfo {
    this.location += location
    this.unknownFields += unknownFields
}

/**
 * The [MutableSourceCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildSourceCodeInfo")
public fun SourceCodeInfo(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit): pbandk.wkt.SourceCodeInfo =
    pbandk.wkt.MutableSourceCodeInfo_Impl(
        location = pbandk.gen.MutableListField(pbandk.wkt.SourceCodeInfo.FieldDescriptors.location),
    ).also(builderAction).toSourceCodeInfo()

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfo")
public fun SourceCodeInfo?.orDefault(): pbandk.wkt.SourceCodeInfo = this ?: pbandk.wkt.SourceCodeInfo.defaultInstance

private class SourceCodeInfo_Impl(
    override val location: pbandk.gen.ListField<pbandk.wkt.SourceCodeInfo.Location>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceCodeInfo, pbandk.gen.GeneratedMessage<pbandk.wkt.SourceCodeInfo>(unknownFields) {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        location: List<pbandk.wkt.SourceCodeInfo.Location>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.SourceCodeInfo = pbandk.wkt.SourceCodeInfo {
        this.location += location
        this.unknownFields += unknownFields
    }
}

private class MutableSourceCodeInfo_Impl(
    override val location: pbandk.gen.MutableListField<pbandk.wkt.SourceCodeInfo.Location>,
) : pbandk.wkt.MutableSourceCodeInfo, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.SourceCodeInfo>() {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        location: List<pbandk.wkt.SourceCodeInfo.Location>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.SourceCodeInfo = throw UnsupportedOperationException()

    fun toSourceCodeInfo() = SourceCodeInfo_Impl(
        location = location.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [SourceCodeInfo.MutableLocation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildSourceCodeInfoLocation")
public fun SourceCodeInfo.Companion.Location(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit): pbandk.wkt.SourceCodeInfo.Location =
    pbandk.wkt.SourceCodeInfo_MutableLocation_Impl(
        path = pbandk.gen.MutableListField(pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.path),
        span = pbandk.gen.MutableListField(pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.span),
        leadingComments = null,
        trailingComments = null,
        leadingDetachedComments = pbandk.gen.MutableListField(pbandk.wkt.SourceCodeInfo.Location.FieldDescriptors.leadingDetachedComments),
    ).also(builderAction).toLocation()

/**
 * The [SourceCodeInfo.MutableLocation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableSourceCodeInfo.Location(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit): pbandk.wkt.SourceCodeInfo.Location =
    pbandk.wkt.SourceCodeInfo.Location(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfoLocation")
public fun SourceCodeInfo.Location?.orDefault(): pbandk.wkt.SourceCodeInfo.Location = this ?: pbandk.wkt.SourceCodeInfo.Location.defaultInstance

private class SourceCodeInfo_Location_Impl(
    override val path: pbandk.gen.ListField<Int>,
    override val span: pbandk.gen.ListField<Int>,
    override val leadingComments: String?,
    override val trailingComments: String?,
    override val leadingDetachedComments: pbandk.gen.ListField<String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceCodeInfo.Location, pbandk.gen.GeneratedMessage<pbandk.wkt.SourceCodeInfo.Location>(unknownFields) {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.Location.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        span: List<Int>,
        leadingComments: String?,
        trailingComments: String?,
        leadingDetachedComments: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.SourceCodeInfo.Location = pbandk.wkt.SourceCodeInfo.Location {
        this.path += path
        this.span += span
        this.leadingComments = leadingComments
        this.trailingComments = trailingComments
        this.leadingDetachedComments += leadingDetachedComments
        this.unknownFields += unknownFields
    }
}

private class SourceCodeInfo_MutableLocation_Impl(
    override val path: pbandk.gen.MutableListField<Int>,
    override val span: pbandk.gen.MutableListField<Int>,
    override var leadingComments: String?,
    override var trailingComments: String?,
    override val leadingDetachedComments: pbandk.gen.MutableListField<String>,
) : pbandk.wkt.SourceCodeInfo.MutableLocation, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.SourceCodeInfo.Location>() {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.Location.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        span: List<Int>,
        leadingComments: String?,
        trailingComments: String?,
        leadingDetachedComments: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.SourceCodeInfo.Location = throw UnsupportedOperationException()

    fun toLocation() = SourceCodeInfo_Location_Impl(
        path = path.toListField(),
        span = span.toListField(),
        leadingComments = leadingComments,
        trailingComments = trailingComments,
        leadingDetachedComments = leadingDetachedComments.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use GeneratedCodeInfo { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.GeneratedCodeInfo"],
        expression = "GeneratedCodeInfo {\nthis.annotation += annotation\nthis.unknownFields += unknownFields\n}",
    )
)
public fun GeneratedCodeInfo(
    annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.GeneratedCodeInfo = pbandk.wkt.GeneratedCodeInfo {
    this.annotation += annotation
    this.unknownFields += unknownFields
}

/**
 * The [MutableGeneratedCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildGeneratedCodeInfo")
public fun GeneratedCodeInfo(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit): pbandk.wkt.GeneratedCodeInfo =
    pbandk.wkt.MutableGeneratedCodeInfo_Impl(
        annotation = pbandk.gen.MutableListField(pbandk.wkt.GeneratedCodeInfo.FieldDescriptors.annotation),
    ).also(builderAction).toGeneratedCodeInfo()

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfo")
public fun GeneratedCodeInfo?.orDefault(): pbandk.wkt.GeneratedCodeInfo = this ?: pbandk.wkt.GeneratedCodeInfo.defaultInstance

private class GeneratedCodeInfo_Impl(
    override val annotation: pbandk.gen.ListField<pbandk.wkt.GeneratedCodeInfo.Annotation>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.GeneratedCodeInfo, pbandk.gen.GeneratedMessage<pbandk.wkt.GeneratedCodeInfo>(unknownFields) {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.GeneratedCodeInfo = pbandk.wkt.GeneratedCodeInfo {
        this.annotation += annotation
        this.unknownFields += unknownFields
    }
}

private class MutableGeneratedCodeInfo_Impl(
    override val annotation: pbandk.gen.MutableListField<pbandk.wkt.GeneratedCodeInfo.Annotation>,
) : pbandk.wkt.MutableGeneratedCodeInfo, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.GeneratedCodeInfo>() {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.GeneratedCodeInfo = throw UnsupportedOperationException()

    fun toGeneratedCodeInfo() = GeneratedCodeInfo_Impl(
        annotation = annotation.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [GeneratedCodeInfo.MutableAnnotation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildGeneratedCodeInfoAnnotation")
public fun GeneratedCodeInfo.Companion.Annotation(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit): pbandk.wkt.GeneratedCodeInfo.Annotation =
    pbandk.wkt.GeneratedCodeInfo_MutableAnnotation_Impl(
        path = pbandk.gen.MutableListField(pbandk.wkt.GeneratedCodeInfo.Annotation.FieldDescriptors.path),
        sourceFile = null,
        begin = null,
        end = null,
        semantic = null,
    ).also(builderAction).toAnnotation()

/**
 * The [GeneratedCodeInfo.MutableAnnotation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableGeneratedCodeInfo.Annotation(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit): pbandk.wkt.GeneratedCodeInfo.Annotation =
    pbandk.wkt.GeneratedCodeInfo.Annotation(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfoAnnotation")
public fun GeneratedCodeInfo.Annotation?.orDefault(): pbandk.wkt.GeneratedCodeInfo.Annotation = this ?: pbandk.wkt.GeneratedCodeInfo.Annotation.defaultInstance

private class GeneratedCodeInfo_Annotation_Impl(
    override val path: pbandk.gen.ListField<Int>,
    override val sourceFile: String?,
    override val begin: Int?,
    override val end: Int?,
    override val semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.GeneratedCodeInfo.Annotation, pbandk.gen.GeneratedMessage<pbandk.wkt.GeneratedCodeInfo.Annotation>(unknownFields) {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.Annotation.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        sourceFile: String?,
        begin: Int?,
        end: Int?,
        semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.GeneratedCodeInfo.Annotation = pbandk.wkt.GeneratedCodeInfo.Annotation {
        this.path += path
        this.sourceFile = sourceFile
        this.begin = begin
        this.end = end
        this.semantic = semantic
        this.unknownFields += unknownFields
    }
}

private class GeneratedCodeInfo_MutableAnnotation_Impl(
    override val path: pbandk.gen.MutableListField<Int>,
    override var sourceFile: String?,
    override var begin: Int?,
    override var end: Int?,
    override var semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?,
) : pbandk.wkt.GeneratedCodeInfo.MutableAnnotation, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.GeneratedCodeInfo.Annotation>() {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.Annotation.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        sourceFile: String?,
        begin: Int?,
        end: Int?,
        semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.GeneratedCodeInfo.Annotation = throw UnsupportedOperationException()

    fun toAnnotation() = GeneratedCodeInfo_Annotation_Impl(
        path = path.toListField(),
        sourceFile = sourceFile,
        begin = begin,
        end = end,
        semantic = semantic,
        unknownFields = unknownFields.toMap()
    )
}

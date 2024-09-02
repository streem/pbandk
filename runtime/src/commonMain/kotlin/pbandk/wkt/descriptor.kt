@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed class Edition(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.Edition && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "Edition.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNKNOWN : Edition(0, "EDITION_UNKNOWN")
    public object LEGACY : Edition(900, "EDITION_LEGACY")
    public object PROTO2 : Edition(998, "EDITION_PROTO2")
    public object PROTO3 : Edition(999, "EDITION_PROTO3")
    public object EDITION_2023 : Edition(1000, "EDITION_2023")
    public object EDITION_2024 : Edition(1001, "EDITION_2024")
    public object EDITION_1_TEST_ONLY : Edition(1, "EDITION_1_TEST_ONLY")
    public object EDITION_2_TEST_ONLY : Edition(2, "EDITION_2_TEST_ONLY")
    public object EDITION_99997_TEST_ONLY : Edition(99997, "EDITION_99997_TEST_ONLY")
    public object EDITION_99998_TEST_ONLY : Edition(99998, "EDITION_99998_TEST_ONLY")
    public object EDITION_99999_TEST_ONLY : Edition(99999, "EDITION_99999_TEST_ONLY")
    public object MAX : Edition(2147483647, "EDITION_MAX")
    public class UNRECOGNIZED(value: Int) : Edition(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Edition> {
        public val values: List<pbandk.wkt.Edition> by lazy { listOf(UNKNOWN, LEGACY, PROTO2, PROTO3, EDITION_2023, EDITION_2024, EDITION_1_TEST_ONLY, EDITION_2_TEST_ONLY, EDITION_99997_TEST_ONLY, EDITION_99998_TEST_ONLY, EDITION_99999_TEST_ONLY, MAX) }
        override fun fromValue(value: Int): pbandk.wkt.Edition = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.wkt.Edition = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Edition with name: $name")
    }
}

@pbandk.Export
public data class FileDescriptorSet(
    val file: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileDescriptorSet = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorSet> {
        public val defaultInstance: pbandk.wkt.FileDescriptorSet by lazy { pbandk.wkt.FileDescriptorSet() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FileDescriptorSet = pbandk.wkt.FileDescriptorSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FileDescriptorSet",
            messageClass = pbandk.wkt.FileDescriptorSet::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                        jsonName = "file",
                        value = pbandk.wkt.FileDescriptorSet::file
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class FileDescriptorProto(
    val name: String? = null,
    val `package`: String? = null,
    val dependency: List<String> = emptyList(),
    val publicDependency: List<Int> = emptyList(),
    val weakDependency: List<Int> = emptyList(),
    val messageType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val options: pbandk.wkt.FileOptions? = null,
    val sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null,
    val syntax: String? = null,
    val edition: pbandk.wkt.Edition? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorProto> {
        public val defaultInstance: pbandk.wkt.FileDescriptorProto by lazy { pbandk.wkt.FileDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FileDescriptorProto = pbandk.wkt.FileDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FileDescriptorProto",
            messageClass = pbandk.wkt.FileDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(13) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.FileDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "package",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "package",
                        value = pbandk.wkt.FileDescriptorProto::`package`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dependency",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "dependency",
                        value = pbandk.wkt.FileDescriptorProto::dependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.Companion)),
                        jsonName = "messageType",
                        value = pbandk.wkt.FileDescriptorProto::messageType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumDescriptorProto.Companion)),
                        jsonName = "enumType",
                        value = pbandk.wkt.FileDescriptorProto::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "service",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.ServiceDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ServiceDescriptorProto.Companion)),
                        jsonName = "service",
                        value = pbandk.wkt.FileDescriptorProto::service
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldDescriptorProto.Companion)),
                        jsonName = "extension",
                        value = pbandk.wkt.FileDescriptorProto::extension
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.FileDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_code_info",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceCodeInfo.Companion),
                        jsonName = "sourceCodeInfo",
                        value = pbandk.wkt.FileDescriptorProto::sourceCodeInfo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "public_dependency",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "publicDependency",
                        value = pbandk.wkt.FileDescriptorProto::publicDependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "weak_dependency",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "weakDependency",
                        value = pbandk.wkt.FileDescriptorProto::weakDependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "syntax",
                        value = pbandk.wkt.FileDescriptorProto::syntax
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "edition",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                        jsonName = "edition",
                        value = pbandk.wkt.FileDescriptorProto::edition
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class DescriptorProto(
    val name: String? = null,
    val field: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val nestedType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList(),
    val oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = emptyList(),
    val options: pbandk.wkt.MessageOptions? = null,
    val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto> {
        public val defaultInstance: pbandk.wkt.DescriptorProto by lazy { pbandk.wkt.DescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto = pbandk.wkt.DescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.DescriptorProto",
            messageClass = pbandk.wkt.DescriptorProto::class,
            messageCompanion = this,
            fields = buildList(10) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.DescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldDescriptorProto.Companion)),
                        jsonName = "field",
                        value = pbandk.wkt.DescriptorProto::field
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nested_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.Companion)),
                        jsonName = "nestedType",
                        value = pbandk.wkt.DescriptorProto::nestedType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumDescriptorProto.Companion)),
                        jsonName = "enumType",
                        value = pbandk.wkt.DescriptorProto::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension_range",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto.ExtensionRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.ExtensionRange.Companion)),
                        jsonName = "extensionRange",
                        value = pbandk.wkt.DescriptorProto::extensionRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldDescriptorProto.Companion)),
                        jsonName = "extension",
                        value = pbandk.wkt.DescriptorProto::extension
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.MessageOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.DescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_decl",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.OneofDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.OneofDescriptorProto.Companion)),
                        jsonName = "oneofDecl",
                        value = pbandk.wkt.DescriptorProto::oneofDecl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_range",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto.ReservedRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.ReservedRange.Companion)),
                        jsonName = "reservedRange",
                        value = pbandk.wkt.DescriptorProto::reservedRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "reservedName",
                        value = pbandk.wkt.DescriptorProto::reservedName
                    )
                )
            }
        )
    }

    public data class ExtensionRange(
        val start: Int? = null,
        val end: Int? = null,
        val options: pbandk.wkt.ExtensionRangeOptions? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ExtensionRange = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto.ExtensionRange> {
            public val defaultInstance: pbandk.wkt.DescriptorProto.ExtensionRange by lazy { pbandk.wkt.DescriptorProto.ExtensionRange() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto.ExtensionRange = pbandk.wkt.DescriptorProto.ExtensionRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.DescriptorProto.ExtensionRange",
                messageClass = pbandk.wkt.DescriptorProto.ExtensionRange::class,
                messageCompanion = this,
                fields = buildList(3) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.DescriptorProto.ExtensionRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.DescriptorProto.ExtensionRange::end
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "options",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ExtensionRangeOptions.Companion),
                            jsonName = "options",
                            value = pbandk.wkt.DescriptorProto.ExtensionRange::options
                        )
                    )
                }
            )
        }
    }

    public data class ReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ReservedRange = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ReservedRange> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto.ReservedRange> {
            public val defaultInstance: pbandk.wkt.DescriptorProto.ReservedRange by lazy { pbandk.wkt.DescriptorProto.ReservedRange() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto.ReservedRange = pbandk.wkt.DescriptorProto.ReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ReservedRange> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.DescriptorProto.ReservedRange",
                messageClass = pbandk.wkt.DescriptorProto.ReservedRange::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.DescriptorProto.ReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.DescriptorProto.ReservedRange::end
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class ExtensionRangeOptions(
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val declaration: List<pbandk.wkt.ExtensionRangeOptions.Declaration> = emptyList(),
    val features: pbandk.wkt.FeatureSet? = null,
    val verification: pbandk.wkt.ExtensionRangeOptions.VerificationState? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ExtensionRangeOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.ExtensionRangeOptions> {
        public val defaultInstance: pbandk.wkt.ExtensionRangeOptions by lazy { pbandk.wkt.ExtensionRangeOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ExtensionRangeOptions = pbandk.wkt.ExtensionRangeOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.ExtensionRangeOptions",
            messageClass = pbandk.wkt.ExtensionRangeOptions::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "declaration",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.ExtensionRangeOptions.Declaration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ExtensionRangeOptions.Declaration.Companion)),
                        jsonName = "declaration",
                        value = pbandk.wkt.ExtensionRangeOptions::declaration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "verification",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.ExtensionRangeOptions.VerificationState.Companion, hasPresence = true),
                        jsonName = "verification",
                        value = pbandk.wkt.ExtensionRangeOptions::verification
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 50,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.ExtensionRangeOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.ExtensionRangeOptions::uninterpretedOption
                    )
                )
            }
        )
    }

    public sealed class VerificationState(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.ExtensionRangeOptions.VerificationState && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "ExtensionRangeOptions.VerificationState.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object DECLARATION : VerificationState(0, "DECLARATION")
        public object UNVERIFIED : VerificationState(1, "UNVERIFIED")
        public class UNRECOGNIZED(value: Int) : VerificationState(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.ExtensionRangeOptions.VerificationState> {
            public val values: List<pbandk.wkt.ExtensionRangeOptions.VerificationState> by lazy { listOf(DECLARATION, UNVERIFIED) }
            override fun fromValue(value: Int): pbandk.wkt.ExtensionRangeOptions.VerificationState = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.ExtensionRangeOptions.VerificationState = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No VerificationState with name: $name")
        }
    }

    public data class Declaration(
        val number: Int? = null,
        val fullName: String? = null,
        val type: String? = null,
        val reserved: Boolean? = null,
        val repeated: Boolean? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.ExtensionRangeOptions.Declaration = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.ExtensionRangeOptions.Declaration> {
            public val defaultInstance: pbandk.wkt.ExtensionRangeOptions.Declaration by lazy { pbandk.wkt.ExtensionRangeOptions.Declaration() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ExtensionRangeOptions.Declaration = pbandk.wkt.ExtensionRangeOptions.Declaration.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions.Declaration> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.ExtensionRangeOptions.Declaration",
                messageClass = pbandk.wkt.ExtensionRangeOptions.Declaration::class,
                messageCompanion = this,
                fields = buildList(5) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "number",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "number",
                            value = pbandk.wkt.ExtensionRangeOptions.Declaration::number
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "full_name",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "fullName",
                            value = pbandk.wkt.ExtensionRangeOptions.Declaration::fullName
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "type",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "type",
                            value = pbandk.wkt.ExtensionRangeOptions.Declaration::type
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "reserved",
                            number = 5,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "reserved",
                            value = pbandk.wkt.ExtensionRangeOptions.Declaration::reserved
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "repeated",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "repeated",
                            value = pbandk.wkt.ExtensionRangeOptions.Declaration::repeated
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class FieldDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val label: pbandk.wkt.FieldDescriptorProto.Label? = null,
    val type: pbandk.wkt.FieldDescriptorProto.Type? = null,
    val typeName: String? = null,
    val extendee: String? = null,
    val defaultValue: String? = null,
    val oneofIndex: Int? = null,
    val jsonName: String? = null,
    val options: pbandk.wkt.FieldOptions? = null,
    val proto3Optional: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldDescriptorProto> {
        public val defaultInstance: pbandk.wkt.FieldDescriptorProto by lazy { pbandk.wkt.FieldDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldDescriptorProto = pbandk.wkt.FieldDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FieldDescriptorProto",
            messageClass = pbandk.wkt.FieldDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(11) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.FieldDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extendee",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "extendee",
                        value = pbandk.wkt.FieldDescriptorProto::extendee
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "number",
                        value = pbandk.wkt.FieldDescriptorProto::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "label",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldDescriptorProto.Label.Companion, hasPresence = true),
                        jsonName = "label",
                        value = pbandk.wkt.FieldDescriptorProto::label
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldDescriptorProto.Type.Companion, hasPresence = true),
                        jsonName = "type",
                        value = pbandk.wkt.FieldDescriptorProto::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_name",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "typeName",
                        value = pbandk.wkt.FieldDescriptorProto::typeName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "default_value",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "defaultValue",
                        value = pbandk.wkt.FieldDescriptorProto::defaultValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.FieldDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_index",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "oneofIndex",
                        value = pbandk.wkt.FieldDescriptorProto::oneofIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "jsonName",
                        value = pbandk.wkt.FieldDescriptorProto::jsonName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto3_optional",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "proto3Optional",
                        value = pbandk.wkt.FieldDescriptorProto::proto3Optional
                    )
                )
            }
        )
    }

    public sealed class Type(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldDescriptorProto.Type && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldDescriptorProto.Type.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object DOUBLE : Type(1, "TYPE_DOUBLE")
        public object FLOAT : Type(2, "TYPE_FLOAT")
        public object INT64 : Type(3, "TYPE_INT64")
        public object UINT64 : Type(4, "TYPE_UINT64")
        public object INT32 : Type(5, "TYPE_INT32")
        public object FIXED64 : Type(6, "TYPE_FIXED64")
        public object FIXED32 : Type(7, "TYPE_FIXED32")
        public object BOOL : Type(8, "TYPE_BOOL")
        public object STRING : Type(9, "TYPE_STRING")
        public object GROUP : Type(10, "TYPE_GROUP")
        public object MESSAGE : Type(11, "TYPE_MESSAGE")
        public object BYTES : Type(12, "TYPE_BYTES")
        public object UINT32 : Type(13, "TYPE_UINT32")
        public object ENUM : Type(14, "TYPE_ENUM")
        public object SFIXED32 : Type(15, "TYPE_SFIXED32")
        public object SFIXED64 : Type(16, "TYPE_SFIXED64")
        public object SINT32 : Type(17, "TYPE_SINT32")
        public object SINT64 : Type(18, "TYPE_SINT64")
        public class UNRECOGNIZED(value: Int) : Type(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Type> {
            public val values: List<pbandk.wkt.FieldDescriptorProto.Type> by lazy { listOf(DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64) }
            override fun fromValue(value: Int): pbandk.wkt.FieldDescriptorProto.Type = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldDescriptorProto.Type = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Type with name: $name")
        }
    }

    public sealed class Label(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldDescriptorProto.Label && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldDescriptorProto.Label.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object OPTIONAL : Label(1, "LABEL_OPTIONAL")
        public object REPEATED : Label(3, "LABEL_REPEATED")
        public object REQUIRED : Label(2, "LABEL_REQUIRED")
        public class UNRECOGNIZED(value: Int) : Label(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Label> {
            public val values: List<pbandk.wkt.FieldDescriptorProto.Label> by lazy { listOf(OPTIONAL, REPEATED, REQUIRED) }
            override fun fromValue(value: Int): pbandk.wkt.FieldDescriptorProto.Label = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldDescriptorProto.Label = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Label with name: $name")
        }
    }
}

@pbandk.Export
public data class OneofDescriptorProto(
    val name: String? = null,
    val options: pbandk.wkt.OneofOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.OneofDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.OneofDescriptorProto> {
        public val defaultInstance: pbandk.wkt.OneofDescriptorProto by lazy { pbandk.wkt.OneofDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.OneofDescriptorProto = pbandk.wkt.OneofDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.OneofDescriptorProto",
            messageClass = pbandk.wkt.OneofDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.OneofDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.OneofOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.OneofDescriptorProto::options
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EnumDescriptorProto(
    val name: String? = null,
    val value: List<pbandk.wkt.EnumValueDescriptorProto> = emptyList(),
    val options: pbandk.wkt.EnumOptions? = null,
    val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto> {
        public val defaultInstance: pbandk.wkt.EnumDescriptorProto by lazy { pbandk.wkt.EnumDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumDescriptorProto = pbandk.wkt.EnumDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.EnumDescriptorProto",
            messageClass = pbandk.wkt.EnumDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.EnumDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumValueDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumValueDescriptorProto.Companion)),
                        jsonName = "value",
                        value = pbandk.wkt.EnumDescriptorProto::value
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.EnumDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_range",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.Companion)),
                        jsonName = "reservedRange",
                        value = pbandk.wkt.EnumDescriptorProto::reservedRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_name",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "reservedName",
                        value = pbandk.wkt.EnumDescriptorProto::reservedName
                    )
                )
            }
        )
    }

    public data class EnumReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> {
            public val defaultInstance: pbandk.wkt.EnumDescriptorProto.EnumReservedRange by lazy { pbandk.wkt.EnumDescriptorProto.EnumReservedRange() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.EnumDescriptorProto.EnumReservedRange",
                messageClass = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::end
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class EnumValueDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val options: pbandk.wkt.EnumValueOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValueDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueDescriptorProto> {
        public val defaultInstance: pbandk.wkt.EnumValueDescriptorProto by lazy { pbandk.wkt.EnumValueDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValueDescriptorProto = pbandk.wkt.EnumValueDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.EnumValueDescriptorProto",
            messageClass = pbandk.wkt.EnumValueDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.EnumValueDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "number",
                        value = pbandk.wkt.EnumValueDescriptorProto::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumValueOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.EnumValueDescriptorProto::options
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ServiceDescriptorProto(
    val name: String? = null,
    val method: List<pbandk.wkt.MethodDescriptorProto> = emptyList(),
    val options: pbandk.wkt.ServiceOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ServiceDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.ServiceDescriptorProto> {
        public val defaultInstance: pbandk.wkt.ServiceDescriptorProto by lazy { pbandk.wkt.ServiceDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ServiceDescriptorProto = pbandk.wkt.ServiceDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.ServiceDescriptorProto",
            messageClass = pbandk.wkt.ServiceDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.ServiceDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "method",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.MethodDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.MethodDescriptorProto.Companion)),
                        jsonName = "method",
                        value = pbandk.wkt.ServiceDescriptorProto::method
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ServiceOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.ServiceDescriptorProto::options
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MethodDescriptorProto(
    val name: String? = null,
    val inputType: String? = null,
    val outputType: String? = null,
    val options: pbandk.wkt.MethodOptions? = null,
    val clientStreaming: Boolean? = null,
    val serverStreaming: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MethodDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.MethodDescriptorProto> {
        public val defaultInstance: pbandk.wkt.MethodDescriptorProto by lazy { pbandk.wkt.MethodDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.MethodDescriptorProto = pbandk.wkt.MethodDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.MethodDescriptorProto",
            messageClass = pbandk.wkt.MethodDescriptorProto::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.MethodDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "input_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "inputType",
                        value = pbandk.wkt.MethodDescriptorProto::inputType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "output_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "outputType",
                        value = pbandk.wkt.MethodDescriptorProto::outputType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.MethodOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.MethodDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "client_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "clientStreaming",
                        value = pbandk.wkt.MethodDescriptorProto::clientStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "server_streaming",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "serverStreaming",
                        value = pbandk.wkt.MethodDescriptorProto::serverStreaming
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class FileOptions(
    val javaPackage: String? = null,
    val javaOuterClassname: String? = null,
    val javaMultipleFiles: Boolean? = null,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    val javaGenerateEqualsAndHash: Boolean? = null,
    val javaStringCheckUtf8: Boolean? = null,
    val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null,
    val goPackage: String? = null,
    val ccGenericServices: Boolean? = null,
    val javaGenericServices: Boolean? = null,
    val pyGenericServices: Boolean? = null,
    val deprecated: Boolean? = null,
    val ccEnableArenas: Boolean? = null,
    val objcClassPrefix: String? = null,
    val csharpNamespace: String? = null,
    val swiftPrefix: String? = null,
    val phpClassPrefix: String? = null,
    val phpNamespace: String? = null,
    val phpMetadataNamespace: String? = null,
    val rubyPackage: String? = null,
    val features: pbandk.wkt.FeatureSet? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FileOptions> {
        public val defaultInstance: pbandk.wkt.FileOptions by lazy { pbandk.wkt.FileOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FileOptions = pbandk.wkt.FileOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FileOptions",
            messageClass = pbandk.wkt.FileOptions::class,
            messageCompanion = this,
            fields = buildList(21) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_package",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "javaPackage",
                        value = pbandk.wkt.FileOptions::javaPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_outer_classname",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "javaOuterClassname",
                        value = pbandk.wkt.FileOptions::javaOuterClassname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optimize_for",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FileOptions.OptimizeMode.Companion, hasPresence = true),
                        jsonName = "optimizeFor",
                        value = pbandk.wkt.FileOptions::optimizeFor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_multiple_files",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaMultipleFiles",
                        value = pbandk.wkt.FileOptions::javaMultipleFiles
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "go_package",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "goPackage",
                        value = pbandk.wkt.FileOptions::goPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cc_generic_services",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ccGenericServices",
                        value = pbandk.wkt.FileOptions::ccGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generic_services",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenericServices",
                        value = pbandk.wkt.FileOptions::javaGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "py_generic_services",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "pyGenericServices",
                        value = pbandk.wkt.FileOptions::pyGenericServices
                    )
                )
                @Suppress("DEPRECATION")
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generate_equals_and_hash",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenerateEqualsAndHash",
                        options = pbandk.wkt.FieldOptions(
                            deprecated = true
                        ),
                        value = pbandk.wkt.FileOptions::javaGenerateEqualsAndHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.FileOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_string_check_utf8",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaStringCheckUtf8",
                        value = pbandk.wkt.FileOptions::javaStringCheckUtf8
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cc_enable_arenas",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ccEnableArenas",
                        value = pbandk.wkt.FileOptions::ccEnableArenas
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "objc_class_prefix",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "objcClassPrefix",
                        value = pbandk.wkt.FileOptions::objcClassPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "csharp_namespace",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "csharpNamespace",
                        value = pbandk.wkt.FileOptions::csharpNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "swift_prefix",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "swiftPrefix",
                        value = pbandk.wkt.FileOptions::swiftPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_class_prefix",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpClassPrefix",
                        value = pbandk.wkt.FileOptions::phpClassPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_namespace",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpNamespace",
                        value = pbandk.wkt.FileOptions::phpNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_metadata_namespace",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpMetadataNamespace",
                        value = pbandk.wkt.FileOptions::phpMetadataNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruby_package",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "rubyPackage",
                        value = pbandk.wkt.FileOptions::rubyPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 50,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.FileOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.FileOptions::uninterpretedOption
                    )
                )
            }
        )
    }

    public sealed class OptimizeMode(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FileOptions.OptimizeMode && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FileOptions.OptimizeMode.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object SPEED : OptimizeMode(1, "SPEED")
        public object CODE_SIZE : OptimizeMode(2, "CODE_SIZE")
        public object LITE_RUNTIME : OptimizeMode(3, "LITE_RUNTIME")
        public class UNRECOGNIZED(value: Int) : OptimizeMode(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FileOptions.OptimizeMode> {
            public val values: List<pbandk.wkt.FileOptions.OptimizeMode> by lazy { listOf(SPEED, CODE_SIZE, LITE_RUNTIME) }
            override fun fromValue(value: Int): pbandk.wkt.FileOptions.OptimizeMode = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FileOptions.OptimizeMode = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptimizeMode with name: $name")
        }
    }
}

@pbandk.Export
public data class MessageOptions(
    val messageSetWireFormat: Boolean? = null,
    val noStandardDescriptorAccessor: Boolean? = null,
    val deprecated: Boolean? = null,
    val mapEntry: Boolean? = null,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    val deprecatedLegacyJsonFieldConflicts: Boolean? = null,
    val features: pbandk.wkt.FeatureSet? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MessageOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.MessageOptions> {
        public val defaultInstance: pbandk.wkt.MessageOptions by lazy { pbandk.wkt.MessageOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.MessageOptions = pbandk.wkt.MessageOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.MessageOptions",
            messageClass = pbandk.wkt.MessageOptions::class,
            messageCompanion = this,
            fields = buildList(7) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_set_wire_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "messageSetWireFormat",
                        value = pbandk.wkt.MessageOptions::messageSetWireFormat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "no_standard_descriptor_accessor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "noStandardDescriptorAccessor",
                        value = pbandk.wkt.MessageOptions::noStandardDescriptorAccessor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.MessageOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_entry",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "mapEntry",
                        value = pbandk.wkt.MessageOptions::mapEntry
                    )
                )
                @Suppress("DEPRECATION")
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated_legacy_json_field_conflicts",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecatedLegacyJsonFieldConflicts",
                        options = pbandk.wkt.FieldOptions(
                            deprecated = true
                        ),
                        value = pbandk.wkt.MessageOptions::deprecatedLegacyJsonFieldConflicts
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.MessageOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.MessageOptions::uninterpretedOption
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class FieldOptions(
    val ctype: pbandk.wkt.FieldOptions.CType? = null,
    val packed: Boolean? = null,
    val jstype: pbandk.wkt.FieldOptions.JSType? = null,
    val lazy: Boolean? = null,
    val unverifiedLazy: Boolean? = null,
    val deprecated: Boolean? = null,
    val weak: Boolean? = null,
    val debugRedact: Boolean? = null,
    val retention: pbandk.wkt.FieldOptions.OptionRetention? = null,
    val targets: List<pbandk.wkt.FieldOptions.OptionTargetType> = emptyList(),
    val editionDefaults: List<pbandk.wkt.FieldOptions.EditionDefault> = emptyList(),
    val features: pbandk.wkt.FeatureSet? = null,
    val featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions> {
        public val defaultInstance: pbandk.wkt.FieldOptions by lazy { pbandk.wkt.FieldOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldOptions = pbandk.wkt.FieldOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FieldOptions",
            messageClass = pbandk.wkt.FieldOptions::class,
            messageCompanion = this,
            fields = buildList(14) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ctype",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldOptions.CType.Companion, hasPresence = true),
                        jsonName = "ctype",
                        value = pbandk.wkt.FieldOptions::ctype
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "packed",
                        value = pbandk.wkt.FieldOptions::packed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.FieldOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lazy",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "lazy",
                        value = pbandk.wkt.FieldOptions::lazy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jstype",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldOptions.JSType.Companion, hasPresence = true),
                        jsonName = "jstype",
                        value = pbandk.wkt.FieldOptions::jstype
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "weak",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "weak",
                        value = pbandk.wkt.FieldOptions::weak
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unverified_lazy",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "unverifiedLazy",
                        value = pbandk.wkt.FieldOptions::unverifiedLazy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "debug_redact",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "debugRedact",
                        value = pbandk.wkt.FieldOptions::debugRedact
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "retention",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldOptions.OptionRetention.Companion, hasPresence = true),
                        jsonName = "retention",
                        value = pbandk.wkt.FieldOptions::retention
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "targets",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldOptions.OptionTargetType>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldOptions.OptionTargetType.Companion)),
                        jsonName = "targets",
                        value = pbandk.wkt.FieldOptions::targets
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "edition_defaults",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldOptions.EditionDefault>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldOptions.EditionDefault.Companion)),
                        jsonName = "editionDefaults",
                        value = pbandk.wkt.FieldOptions::editionDefaults
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.FieldOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "feature_support",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldOptions.FeatureSupport.Companion),
                        jsonName = "featureSupport",
                        value = pbandk.wkt.FieldOptions::featureSupport
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.FieldOptions::uninterpretedOption
                    )
                )
            }
        )
    }

    public sealed class CType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldOptions.CType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.CType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object STRING : CType(0, "STRING")
        public object CORD : CType(1, "CORD")
        public object STRING_PIECE : CType(2, "STRING_PIECE")
        public class UNRECOGNIZED(value: Int) : CType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.CType> {
            public val values: List<pbandk.wkt.FieldOptions.CType> by lazy { listOf(STRING, CORD, STRING_PIECE) }
            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.CType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldOptions.CType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No CType with name: $name")
        }
    }

    public sealed class JSType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldOptions.JSType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.JSType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object JS_NORMAL : JSType(0, "JS_NORMAL")
        public object JS_STRING : JSType(1, "JS_STRING")
        public object JS_NUMBER : JSType(2, "JS_NUMBER")
        public class UNRECOGNIZED(value: Int) : JSType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.JSType> {
            public val values: List<pbandk.wkt.FieldOptions.JSType> by lazy { listOf(JS_NORMAL, JS_STRING, JS_NUMBER) }
            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.JSType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldOptions.JSType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No JSType with name: $name")
        }
    }

    public sealed class OptionRetention(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldOptions.OptionRetention && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.OptionRetention.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object RETENTION_UNKNOWN : OptionRetention(0, "RETENTION_UNKNOWN")
        public object RETENTION_RUNTIME : OptionRetention(1, "RETENTION_RUNTIME")
        public object RETENTION_SOURCE : OptionRetention(2, "RETENTION_SOURCE")
        public class UNRECOGNIZED(value: Int) : OptionRetention(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.OptionRetention> {
            public val values: List<pbandk.wkt.FieldOptions.OptionRetention> by lazy { listOf(RETENTION_UNKNOWN, RETENTION_RUNTIME, RETENTION_SOURCE) }
            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.OptionRetention = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldOptions.OptionRetention = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptionRetention with name: $name")
        }
    }

    public sealed class OptionTargetType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldOptions.OptionTargetType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.OptionTargetType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object TARGET_TYPE_UNKNOWN : OptionTargetType(0, "TARGET_TYPE_UNKNOWN")
        public object TARGET_TYPE_FILE : OptionTargetType(1, "TARGET_TYPE_FILE")
        public object TARGET_TYPE_EXTENSION_RANGE : OptionTargetType(2, "TARGET_TYPE_EXTENSION_RANGE")
        public object TARGET_TYPE_MESSAGE : OptionTargetType(3, "TARGET_TYPE_MESSAGE")
        public object TARGET_TYPE_FIELD : OptionTargetType(4, "TARGET_TYPE_FIELD")
        public object TARGET_TYPE_ONEOF : OptionTargetType(5, "TARGET_TYPE_ONEOF")
        public object TARGET_TYPE_ENUM : OptionTargetType(6, "TARGET_TYPE_ENUM")
        public object TARGET_TYPE_ENUM_ENTRY : OptionTargetType(7, "TARGET_TYPE_ENUM_ENTRY")
        public object TARGET_TYPE_SERVICE : OptionTargetType(8, "TARGET_TYPE_SERVICE")
        public object TARGET_TYPE_METHOD : OptionTargetType(9, "TARGET_TYPE_METHOD")
        public class UNRECOGNIZED(value: Int) : OptionTargetType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.OptionTargetType> {
            public val values: List<pbandk.wkt.FieldOptions.OptionTargetType> by lazy { listOf(TARGET_TYPE_UNKNOWN, TARGET_TYPE_FILE, TARGET_TYPE_EXTENSION_RANGE, TARGET_TYPE_MESSAGE, TARGET_TYPE_FIELD, TARGET_TYPE_ONEOF, TARGET_TYPE_ENUM, TARGET_TYPE_ENUM_ENTRY, TARGET_TYPE_SERVICE, TARGET_TYPE_METHOD) }
            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.OptionTargetType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldOptions.OptionTargetType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptionTargetType with name: $name")
        }
    }

    public data class EditionDefault(
        val edition: pbandk.wkt.Edition? = null,
        val value: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions.EditionDefault = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.EditionDefault> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions.EditionDefault> {
            public val defaultInstance: pbandk.wkt.FieldOptions.EditionDefault by lazy { pbandk.wkt.FieldOptions.EditionDefault() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldOptions.EditionDefault = pbandk.wkt.FieldOptions.EditionDefault.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.EditionDefault> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldOptions.EditionDefault",
                messageClass = pbandk.wkt.FieldOptions.EditionDefault::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.wkt.FieldOptions.EditionDefault::value
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "edition",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                            jsonName = "edition",
                            value = pbandk.wkt.FieldOptions.EditionDefault::edition
                        )
                    )
                }
            )
        }
    }

    public data class FeatureSupport(
        val editionIntroduced: pbandk.wkt.Edition? = null,
        val editionDeprecated: pbandk.wkt.Edition? = null,
        val deprecationWarning: String? = null,
        val editionRemoved: pbandk.wkt.Edition? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions.FeatureSupport = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.FeatureSupport> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions.FeatureSupport> {
            public val defaultInstance: pbandk.wkt.FieldOptions.FeatureSupport by lazy { pbandk.wkt.FieldOptions.FeatureSupport() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldOptions.FeatureSupport = pbandk.wkt.FieldOptions.FeatureSupport.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions.FeatureSupport> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldOptions.FeatureSupport",
                messageClass = pbandk.wkt.FieldOptions.FeatureSupport::class,
                messageCompanion = this,
                fields = buildList(4) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "edition_introduced",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                            jsonName = "editionIntroduced",
                            value = pbandk.wkt.FieldOptions.FeatureSupport::editionIntroduced
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "edition_deprecated",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                            jsonName = "editionDeprecated",
                            value = pbandk.wkt.FieldOptions.FeatureSupport::editionDeprecated
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "deprecation_warning",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "deprecationWarning",
                            value = pbandk.wkt.FieldOptions.FeatureSupport::deprecationWarning
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "edition_removed",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                            jsonName = "editionRemoved",
                            value = pbandk.wkt.FieldOptions.FeatureSupport::editionRemoved
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class OneofOptions(
    val features: pbandk.wkt.FeatureSet? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.OneofOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.OneofOptions> {
        public val defaultInstance: pbandk.wkt.OneofOptions by lazy { pbandk.wkt.OneofOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.OneofOptions = pbandk.wkt.OneofOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.OneofOptions",
            messageClass = pbandk.wkt.OneofOptions::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.OneofOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.OneofOptions::uninterpretedOption
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EnumOptions(
    val allowAlias: Boolean? = null,
    val deprecated: Boolean? = null,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    val deprecatedLegacyJsonFieldConflicts: Boolean? = null,
    val features: pbandk.wkt.FeatureSet? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumOptions> {
        public val defaultInstance: pbandk.wkt.EnumOptions by lazy { pbandk.wkt.EnumOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumOptions = pbandk.wkt.EnumOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.EnumOptions",
            messageClass = pbandk.wkt.EnumOptions::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allow_alias",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "allowAlias",
                        value = pbandk.wkt.EnumOptions::allowAlias
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.EnumOptions::deprecated
                    )
                )
                @Suppress("DEPRECATION")
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated_legacy_json_field_conflicts",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecatedLegacyJsonFieldConflicts",
                        options = pbandk.wkt.FieldOptions(
                            deprecated = true
                        ),
                        value = pbandk.wkt.EnumOptions::deprecatedLegacyJsonFieldConflicts
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.EnumOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.EnumOptions::uninterpretedOption
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class EnumValueOptions(
    val deprecated: Boolean? = null,
    val features: pbandk.wkt.FeatureSet? = null,
    val debugRedact: Boolean? = null,
    val featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValueOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueOptions> {
        public val defaultInstance: pbandk.wkt.EnumValueOptions by lazy { pbandk.wkt.EnumValueOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValueOptions = pbandk.wkt.EnumValueOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.EnumValueOptions",
            messageClass = pbandk.wkt.EnumValueOptions::class,
            messageCompanion = this,
            fields = buildList(5) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.EnumValueOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.EnumValueOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "debug_redact",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "debugRedact",
                        value = pbandk.wkt.EnumValueOptions::debugRedact
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "feature_support",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldOptions.FeatureSupport.Companion),
                        jsonName = "featureSupport",
                        value = pbandk.wkt.EnumValueOptions::featureSupport
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.EnumValueOptions::uninterpretedOption
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ServiceOptions(
    val features: pbandk.wkt.FeatureSet? = null,
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ServiceOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.ServiceOptions> {
        public val defaultInstance: pbandk.wkt.ServiceOptions by lazy { pbandk.wkt.ServiceOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ServiceOptions = pbandk.wkt.ServiceOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.ServiceOptions",
            messageClass = pbandk.wkt.ServiceOptions::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.ServiceOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.ServiceOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.ServiceOptions::uninterpretedOption
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MethodOptions(
    val deprecated: Boolean? = null,
    val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null,
    val features: pbandk.wkt.FeatureSet? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MethodOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.MethodOptions> {
        public val defaultInstance: pbandk.wkt.MethodOptions by lazy { pbandk.wkt.MethodOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.MethodOptions = pbandk.wkt.MethodOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.MethodOptions",
            messageClass = pbandk.wkt.MethodOptions::class,
            messageCompanion = this,
            fields = buildList(4) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.MethodOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "idempotency_level",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.MethodOptions.IdempotencyLevel.Companion, hasPresence = true),
                        jsonName = "idempotencyLevel",
                        value = pbandk.wkt.MethodOptions::idempotencyLevel
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "features",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                        jsonName = "features",
                        value = pbandk.wkt.MethodOptions::features
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.MethodOptions::uninterpretedOption
                    )
                )
            }
        )
    }

    public sealed class IdempotencyLevel(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.MethodOptions.IdempotencyLevel && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "MethodOptions.IdempotencyLevel.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object IDEMPOTENCY_UNKNOWN : IdempotencyLevel(0, "IDEMPOTENCY_UNKNOWN")
        public object NO_SIDE_EFFECTS : IdempotencyLevel(1, "NO_SIDE_EFFECTS")
        public object IDEMPOTENT : IdempotencyLevel(2, "IDEMPOTENT")
        public class UNRECOGNIZED(value: Int) : IdempotencyLevel(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.MethodOptions.IdempotencyLevel> {
            public val values: List<pbandk.wkt.MethodOptions.IdempotencyLevel> by lazy { listOf(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT) }
            override fun fromValue(value: Int): pbandk.wkt.MethodOptions.IdempotencyLevel = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.MethodOptions.IdempotencyLevel = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No IdempotencyLevel with name: $name")
        }
    }
}

@pbandk.Export
public data class UninterpretedOption(
    val name: List<pbandk.wkt.UninterpretedOption.NamePart> = emptyList(),
    val identifierValue: String? = null,
    val positiveIntValue: Long? = null,
    val negativeIntValue: Long? = null,
    val doubleValue: Double? = null,
    val stringValue: pbandk.ByteArr? = null,
    val aggregateValue: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UninterpretedOption = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption> {
        public val defaultInstance: pbandk.wkt.UninterpretedOption by lazy { pbandk.wkt.UninterpretedOption() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UninterpretedOption = pbandk.wkt.UninterpretedOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.UninterpretedOption",
            messageClass = pbandk.wkt.UninterpretedOption::class,
            messageCompanion = this,
            fields = buildList(7) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption.NamePart>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.NamePart.Companion)),
                        jsonName = "name",
                        value = pbandk.wkt.UninterpretedOption::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "identifier_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "identifierValue",
                        value = pbandk.wkt.UninterpretedOption::identifierValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "positive_int_value",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "positiveIntValue",
                        value = pbandk.wkt.UninterpretedOption::positiveIntValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "negative_int_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "negativeIntValue",
                        value = pbandk.wkt.UninterpretedOption::negativeIntValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "double_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "doubleValue",
                        value = pbandk.wkt.UninterpretedOption::doubleValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "stringValue",
                        value = pbandk.wkt.UninterpretedOption::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "aggregate_value",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "aggregateValue",
                        value = pbandk.wkt.UninterpretedOption::aggregateValue
                    )
                )
            }
        )
    }

    public data class NamePart(
        val namePart: String,
        val isExtension: Boolean,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.UninterpretedOption.NamePart = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption.NamePart> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption.NamePart> {
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UninterpretedOption.NamePart = pbandk.wkt.UninterpretedOption.NamePart.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption.NamePart> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.UninterpretedOption.NamePart",
                messageClass = pbandk.wkt.UninterpretedOption.NamePart::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name_part",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "namePart",
                            value = pbandk.wkt.UninterpretedOption.NamePart::namePart
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "is_extension",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "isExtension",
                            value = pbandk.wkt.UninterpretedOption.NamePart::isExtension
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class FeatureSet(
    val fieldPresence: pbandk.wkt.FeatureSet.FieldPresence? = null,
    val enumType: pbandk.wkt.FeatureSet.EnumType? = null,
    val repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding? = null,
    val utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation? = null,
    val messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding? = null,
    val jsonFormat: pbandk.wkt.FeatureSet.JsonFormat? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FeatureSet = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSet> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FeatureSet> {
        public val defaultInstance: pbandk.wkt.FeatureSet by lazy { pbandk.wkt.FeatureSet() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FeatureSet = pbandk.wkt.FeatureSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSet> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FeatureSet",
            messageClass = pbandk.wkt.FeatureSet::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_presence",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FeatureSet.FieldPresence.Companion, hasPresence = true),
                        jsonName = "fieldPresence",
                        value = pbandk.wkt.FeatureSet::fieldPresence
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FeatureSet.EnumType.Companion, hasPresence = true),
                        jsonName = "enumType",
                        value = pbandk.wkt.FeatureSet::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_field_encoding",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FeatureSet.RepeatedFieldEncoding.Companion, hasPresence = true),
                        jsonName = "repeatedFieldEncoding",
                        value = pbandk.wkt.FeatureSet::repeatedFieldEncoding
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "utf8_validation",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FeatureSet.Utf8Validation.Companion, hasPresence = true),
                        jsonName = "utf8Validation",
                        value = pbandk.wkt.FeatureSet::utf8Validation
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_encoding",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FeatureSet.MessageEncoding.Companion, hasPresence = true),
                        jsonName = "messageEncoding",
                        value = pbandk.wkt.FeatureSet::messageEncoding
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_format",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FeatureSet.JsonFormat.Companion, hasPresence = true),
                        jsonName = "jsonFormat",
                        value = pbandk.wkt.FeatureSet::jsonFormat
                    )
                )
            }
        )
    }

    public sealed class FieldPresence(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FeatureSet.FieldPresence && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FeatureSet.FieldPresence.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : FieldPresence(0, "FIELD_PRESENCE_UNKNOWN")
        public object EXPLICIT : FieldPresence(1, "EXPLICIT")
        public object IMPLICIT : FieldPresence(2, "IMPLICIT")
        public object LEGACY_REQUIRED : FieldPresence(3, "LEGACY_REQUIRED")
        public class UNRECOGNIZED(value: Int) : FieldPresence(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.FieldPresence> {
            public val values: List<pbandk.wkt.FeatureSet.FieldPresence> by lazy { listOf(UNKNOWN, EXPLICIT, IMPLICIT, LEGACY_REQUIRED) }
            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.FieldPresence = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FeatureSet.FieldPresence = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No FieldPresence with name: $name")
        }
    }

    public sealed class EnumType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FeatureSet.EnumType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FeatureSet.EnumType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : EnumType(0, "ENUM_TYPE_UNKNOWN")
        public object OPEN : EnumType(1, "OPEN")
        public object CLOSED : EnumType(2, "CLOSED")
        public class UNRECOGNIZED(value: Int) : EnumType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.EnumType> {
            public val values: List<pbandk.wkt.FeatureSet.EnumType> by lazy { listOf(UNKNOWN, OPEN, CLOSED) }
            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.EnumType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FeatureSet.EnumType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No EnumType with name: $name")
        }
    }

    public sealed class RepeatedFieldEncoding(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FeatureSet.RepeatedFieldEncoding && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FeatureSet.RepeatedFieldEncoding.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : RepeatedFieldEncoding(0, "REPEATED_FIELD_ENCODING_UNKNOWN")
        public object PACKED : RepeatedFieldEncoding(1, "PACKED")
        public object EXPANDED : RepeatedFieldEncoding(2, "EXPANDED")
        public class UNRECOGNIZED(value: Int) : RepeatedFieldEncoding(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.RepeatedFieldEncoding> {
            public val values: List<pbandk.wkt.FeatureSet.RepeatedFieldEncoding> by lazy { listOf(UNKNOWN, PACKED, EXPANDED) }
            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.RepeatedFieldEncoding = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FeatureSet.RepeatedFieldEncoding = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No RepeatedFieldEncoding with name: $name")
        }
    }

    public sealed class Utf8Validation(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FeatureSet.Utf8Validation && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FeatureSet.Utf8Validation.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UTF8_VALIDATION_UNKNOWN : Utf8Validation(0, "UTF8_VALIDATION_UNKNOWN")
        public object VERIFY : Utf8Validation(2, "VERIFY")
        public object NONE : Utf8Validation(3, "NONE")
        public class UNRECOGNIZED(value: Int) : Utf8Validation(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.Utf8Validation> {
            public val values: List<pbandk.wkt.FeatureSet.Utf8Validation> by lazy { listOf(UTF8_VALIDATION_UNKNOWN, VERIFY, NONE) }
            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.Utf8Validation = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FeatureSet.Utf8Validation = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Utf8Validation with name: $name")
        }
    }

    public sealed class MessageEncoding(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FeatureSet.MessageEncoding && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FeatureSet.MessageEncoding.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : MessageEncoding(0, "MESSAGE_ENCODING_UNKNOWN")
        public object LENGTH_PREFIXED : MessageEncoding(1, "LENGTH_PREFIXED")
        public object DELIMITED : MessageEncoding(2, "DELIMITED")
        public class UNRECOGNIZED(value: Int) : MessageEncoding(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.MessageEncoding> {
            public val values: List<pbandk.wkt.FeatureSet.MessageEncoding> by lazy { listOf(UNKNOWN, LENGTH_PREFIXED, DELIMITED) }
            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.MessageEncoding = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FeatureSet.MessageEncoding = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No MessageEncoding with name: $name")
        }
    }

    public sealed class JsonFormat(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FeatureSet.JsonFormat && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FeatureSet.JsonFormat.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : JsonFormat(0, "JSON_FORMAT_UNKNOWN")
        public object ALLOW : JsonFormat(1, "ALLOW")
        public object LEGACY_BEST_EFFORT : JsonFormat(2, "LEGACY_BEST_EFFORT")
        public class UNRECOGNIZED(value: Int) : JsonFormat(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FeatureSet.JsonFormat> {
            public val values: List<pbandk.wkt.FeatureSet.JsonFormat> by lazy { listOf(UNKNOWN, ALLOW, LEGACY_BEST_EFFORT) }
            override fun fromValue(value: Int): pbandk.wkt.FeatureSet.JsonFormat = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FeatureSet.JsonFormat = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No JsonFormat with name: $name")
        }
    }
}

@pbandk.Export
public data class FeatureSetDefaults(
    val defaults: List<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> = emptyList(),
    val minimumEdition: pbandk.wkt.Edition? = null,
    val maximumEdition: pbandk.wkt.Edition? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FeatureSetDefaults = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FeatureSetDefaults> {
        public val defaultInstance: pbandk.wkt.FeatureSetDefaults by lazy { pbandk.wkt.FeatureSetDefaults() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FeatureSetDefaults = pbandk.wkt.FeatureSetDefaults.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FeatureSetDefaults",
            messageClass = pbandk.wkt.FeatureSetDefaults::class,
            messageCompanion = this,
            fields = buildList(3) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "defaults",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.Companion)),
                        jsonName = "defaults",
                        value = pbandk.wkt.FeatureSetDefaults::defaults
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "minimum_edition",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                        jsonName = "minimumEdition",
                        value = pbandk.wkt.FeatureSetDefaults::minimumEdition
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "maximum_edition",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                        jsonName = "maximumEdition",
                        value = pbandk.wkt.FeatureSetDefaults::maximumEdition
                    )
                )
            }
        )
    }

    public data class FeatureSetEditionDefault(
        val edition: pbandk.wkt.Edition? = null,
        val overridableFeatures: pbandk.wkt.FeatureSet? = null,
        val fixedFeatures: pbandk.wkt.FeatureSet? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> {
            public val defaultInstance: pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault by lazy { pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.FeatureSetDefaults.FeatureSetEditionDefault",
                messageClass = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::class,
                messageCompanion = this,
                fields = buildList(3) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "edition",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Edition.Companion, hasPresence = true),
                            jsonName = "edition",
                            value = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::edition
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "overridable_features",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                            jsonName = "overridableFeatures",
                            value = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::overridableFeatures
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "fixed_features",
                            number = 5,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FeatureSet.Companion),
                            jsonName = "fixedFeatures",
                            value = pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault::fixedFeatures
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class SourceCodeInfo(
    val location: List<pbandk.wkt.SourceCodeInfo.Location> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo> {
        public val defaultInstance: pbandk.wkt.SourceCodeInfo by lazy { pbandk.wkt.SourceCodeInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceCodeInfo = pbandk.wkt.SourceCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.SourceCodeInfo",
            messageClass = pbandk.wkt.SourceCodeInfo::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.SourceCodeInfo.Location>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceCodeInfo.Location.Companion)),
                        jsonName = "location",
                        value = pbandk.wkt.SourceCodeInfo::location
                    )
                )
            }
        )
    }

    public data class Location(
        val path: List<Int> = emptyList(),
        val span: List<Int> = emptyList(),
        val leadingComments: String? = null,
        val trailingComments: String? = null,
        val leadingDetachedComments: List<String> = emptyList(),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo.Location = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo.Location> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo.Location> {
            public val defaultInstance: pbandk.wkt.SourceCodeInfo.Location by lazy { pbandk.wkt.SourceCodeInfo.Location() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceCodeInfo.Location = pbandk.wkt.SourceCodeInfo.Location.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo.Location> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.SourceCodeInfo.Location",
                messageClass = pbandk.wkt.SourceCodeInfo.Location::class,
                messageCompanion = this,
                fields = buildList(5) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = pbandk.wkt.SourceCodeInfo.Location::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "span",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "span",
                            value = pbandk.wkt.SourceCodeInfo.Location::span
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_comments",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "leadingComments",
                            value = pbandk.wkt.SourceCodeInfo.Location::leadingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "trailing_comments",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "trailingComments",
                            value = pbandk.wkt.SourceCodeInfo.Location::trailingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_detached_comments",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                            jsonName = "leadingDetachedComments",
                            value = pbandk.wkt.SourceCodeInfo.Location::leadingDetachedComments
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class GeneratedCodeInfo(
    val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo> {
        public val defaultInstance: pbandk.wkt.GeneratedCodeInfo by lazy { pbandk.wkt.GeneratedCodeInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.GeneratedCodeInfo = pbandk.wkt.GeneratedCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.GeneratedCodeInfo",
            messageClass = pbandk.wkt.GeneratedCodeInfo::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "annotation",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.GeneratedCodeInfo.Annotation>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.GeneratedCodeInfo.Annotation.Companion)),
                        jsonName = "annotation",
                        value = pbandk.wkt.GeneratedCodeInfo::annotation
                    )
                )
            }
        )
    }

    public data class Annotation(
        val path: List<Int> = emptyList(),
        val sourceFile: String? = null,
        val begin: Int? = null,
        val end: Int? = null,
        val semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo.Annotation = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo.Annotation> {
            public val defaultInstance: pbandk.wkt.GeneratedCodeInfo.Annotation by lazy { pbandk.wkt.GeneratedCodeInfo.Annotation() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.GeneratedCodeInfo.Annotation = pbandk.wkt.GeneratedCodeInfo.Annotation.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.GeneratedCodeInfo.Annotation",
                messageClass = pbandk.wkt.GeneratedCodeInfo.Annotation::class,
                messageCompanion = this,
                fields = buildList(5) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "source_file",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "sourceFile",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::sourceFile
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "begin",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "begin",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::begin
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::end
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "semantic",
                            number = 5,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic.Companion, hasPresence = true),
                            jsonName = "semantic",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::semantic
                        )
                    )
                }
            )
        }

        public sealed class Semantic(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
            override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic && other.value == value
            override fun hashCode(): Int = value.hashCode()
            override fun toString(): String = "GeneratedCodeInfo.Annotation.Semantic.${name ?: "UNRECOGNIZED"}(value=$value)"

            public object NONE : Semantic(0, "NONE")
            public object SET : Semantic(1, "SET")
            public object ALIAS : Semantic(2, "ALIAS")
            public class UNRECOGNIZED(value: Int) : Semantic(value)

            public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic> {
                public val values: List<pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic> by lazy { listOf(NONE, SET, ALIAS) }
                override fun fromValue(value: Int): pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
                override fun fromName(name: String): pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Semantic with name: $name")
            }
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorSet")
public fun FileDescriptorSet?.orDefault(): pbandk.wkt.FileDescriptorSet = this ?: FileDescriptorSet.defaultInstance

private fun FileDescriptorSet.protoMergeImpl(plus: pbandk.Message?): FileDescriptorSet = (plus as? FileDescriptorSet)?.let {
    it.copy(
        file = file + plus.file,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileDescriptorSet {
    var file: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FileDescriptorProto> }
        }
    }

    return FileDescriptorSet(pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorProto")
public fun FileDescriptorProto?.orDefault(): pbandk.wkt.FileDescriptorProto = this ?: FileDescriptorProto.defaultInstance

private fun FileDescriptorProto.protoMergeImpl(plus: pbandk.Message?): FileDescriptorProto = (plus as? FileDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        `package` = plus.`package` ?: `package`,
        dependency = dependency + plus.dependency,
        publicDependency = publicDependency + plus.publicDependency,
        weakDependency = weakDependency + plus.weakDependency,
        messageType = messageType + plus.messageType,
        enumType = enumType + plus.enumType,
        service = service + plus.service,
        extension = extension + plus.extension,
        options = options?.plus(plus.options) ?: plus.options,
        sourceCodeInfo = sourceCodeInfo?.plus(plus.sourceCodeInfo) ?: plus.sourceCodeInfo,
        syntax = plus.syntax ?: syntax,
        edition = plus.edition ?: edition,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileDescriptorProto {
    var name: String? = null
    var `package`: String? = null
    var dependency: pbandk.ListWithSize.Builder<String>? = null
    var publicDependency: pbandk.ListWithSize.Builder<Int>? = null
    var weakDependency: pbandk.ListWithSize.Builder<Int>? = null
    var messageType: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto>? = null
    var service: pbandk.ListWithSize.Builder<pbandk.wkt.ServiceDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var options: pbandk.wkt.FileOptions? = null
    var sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null
    var syntax: String? = null
    var edition: pbandk.wkt.Edition? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> `package` = _fieldValue as String
            3 -> dependency = (dependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            4 -> messageType = (messageType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.DescriptorProto> }
            5 -> enumType = (enumType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.EnumDescriptorProto> }
            6 -> service = (service ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.ServiceDescriptorProto> }
            7 -> extension = (extension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FieldDescriptorProto> }
            8 -> options = _fieldValue as pbandk.wkt.FileOptions
            9 -> sourceCodeInfo = _fieldValue as pbandk.wkt.SourceCodeInfo
            10 -> publicDependency = (publicDependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            11 -> weakDependency = (weakDependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            12 -> syntax = _fieldValue as String
            14 -> edition = _fieldValue as pbandk.wkt.Edition
        }
    }

    return FileDescriptorProto(name, `package`, pbandk.ListWithSize.Builder.fixed(dependency), pbandk.ListWithSize.Builder.fixed(publicDependency),
        pbandk.ListWithSize.Builder.fixed(weakDependency), pbandk.ListWithSize.Builder.fixed(messageType), pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(service),
        pbandk.ListWithSize.Builder.fixed(extension), options, sourceCodeInfo, syntax,
        edition, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProto")
public fun DescriptorProto?.orDefault(): pbandk.wkt.DescriptorProto = this ?: DescriptorProto.defaultInstance

private fun DescriptorProto.protoMergeImpl(plus: pbandk.Message?): DescriptorProto = (plus as? DescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        field = field + plus.field,
        extension = extension + plus.extension,
        nestedType = nestedType + plus.nestedType,
        enumType = enumType + plus.enumType,
        extensionRange = extensionRange + plus.extensionRange,
        oneofDecl = oneofDecl + plus.oneofDecl,
        options = options?.plus(plus.options) ?: plus.options,
        reservedRange = reservedRange + plus.reservedRange,
        reservedName = reservedName + plus.reservedName,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto {
    var name: String? = null
    var field: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var nestedType: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto>? = null
    var extensionRange: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto.ExtensionRange>? = null
    var oneofDecl: pbandk.ListWithSize.Builder<pbandk.wkt.OneofDescriptorProto>? = null
    var options: pbandk.wkt.MessageOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto.ReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> field = (field ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FieldDescriptorProto> }
            3 -> nestedType = (nestedType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.DescriptorProto> }
            4 -> enumType = (enumType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.EnumDescriptorProto> }
            5 -> extensionRange = (extensionRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.DescriptorProto.ExtensionRange> }
            6 -> extension = (extension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FieldDescriptorProto> }
            7 -> options = _fieldValue as pbandk.wkt.MessageOptions
            8 -> oneofDecl = (oneofDecl ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.OneofDescriptorProto> }
            9 -> reservedRange = (reservedRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.DescriptorProto.ReservedRange> }
            10 -> reservedName = (reservedName ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return DescriptorProto(name, pbandk.ListWithSize.Builder.fixed(field), pbandk.ListWithSize.Builder.fixed(extension), pbandk.ListWithSize.Builder.fixed(nestedType),
        pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(extensionRange), pbandk.ListWithSize.Builder.fixed(oneofDecl), options,
        pbandk.ListWithSize.Builder.fixed(reservedRange), pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoExtensionRange")
public fun DescriptorProto.ExtensionRange?.orDefault(): pbandk.wkt.DescriptorProto.ExtensionRange = this ?: DescriptorProto.ExtensionRange.defaultInstance

private fun DescriptorProto.ExtensionRange.protoMergeImpl(plus: pbandk.Message?): DescriptorProto.ExtensionRange = (plus as? DescriptorProto.ExtensionRange)?.let {
    it.copy(
        start = plus.start ?: start,
        end = plus.end ?: end,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ExtensionRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto.ExtensionRange {
    var start: Int? = null
    var end: Int? = null
    var options: pbandk.wkt.ExtensionRangeOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
            3 -> options = _fieldValue as pbandk.wkt.ExtensionRangeOptions
        }
    }

    return DescriptorProto.ExtensionRange(start, end, options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoReservedRange")
public fun DescriptorProto.ReservedRange?.orDefault(): pbandk.wkt.DescriptorProto.ReservedRange = this ?: DescriptorProto.ReservedRange.defaultInstance

private fun DescriptorProto.ReservedRange.protoMergeImpl(plus: pbandk.Message?): DescriptorProto.ReservedRange = (plus as? DescriptorProto.ReservedRange)?.let {
    it.copy(
        start = plus.start ?: start,
        end = plus.end ?: end,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ReservedRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto.ReservedRange {
    var start: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
        }
    }

    return DescriptorProto.ReservedRange(start, end, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForExtensionRangeOptions")
public fun ExtensionRangeOptions?.orDefault(): pbandk.wkt.ExtensionRangeOptions = this ?: ExtensionRangeOptions.defaultInstance

private fun ExtensionRangeOptions.protoMergeImpl(plus: pbandk.Message?): ExtensionRangeOptions = (plus as? ExtensionRangeOptions)?.let {
    it.copy(
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        declaration = declaration + plus.declaration,
        features = features?.plus(plus.features) ?: plus.features,
        verification = plus.verification ?: verification,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ExtensionRangeOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ExtensionRangeOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    var declaration: pbandk.ListWithSize.Builder<pbandk.wkt.ExtensionRangeOptions.Declaration>? = null
    var features: pbandk.wkt.FeatureSet? = null
    var verification: pbandk.wkt.ExtensionRangeOptions.VerificationState? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> declaration = (declaration ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.ExtensionRangeOptions.Declaration> }
            3 -> verification = _fieldValue as pbandk.wkt.ExtensionRangeOptions.VerificationState
            50 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return ExtensionRangeOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), pbandk.ListWithSize.Builder.fixed(declaration), features, verification, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForExtensionRangeOptionsDeclaration")
public fun ExtensionRangeOptions.Declaration?.orDefault(): pbandk.wkt.ExtensionRangeOptions.Declaration = this ?: ExtensionRangeOptions.Declaration.defaultInstance

private fun ExtensionRangeOptions.Declaration.protoMergeImpl(plus: pbandk.Message?): ExtensionRangeOptions.Declaration = (plus as? ExtensionRangeOptions.Declaration)?.let {
    it.copy(
        number = plus.number ?: number,
        fullName = plus.fullName ?: fullName,
        type = plus.type ?: type,
        reserved = plus.reserved ?: reserved,
        repeated = plus.repeated ?: repeated,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ExtensionRangeOptions.Declaration.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ExtensionRangeOptions.Declaration {
    var number: Int? = null
    var fullName: String? = null
    var type: String? = null
    var reserved: Boolean? = null
    var repeated: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> number = _fieldValue as Int
            2 -> fullName = _fieldValue as String
            3 -> type = _fieldValue as String
            5 -> reserved = _fieldValue as Boolean
            6 -> repeated = _fieldValue as Boolean
        }
    }

    return ExtensionRangeOptions.Declaration(number, fullName, type, reserved,
        repeated, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldDescriptorProto")
public fun FieldDescriptorProto?.orDefault(): pbandk.wkt.FieldDescriptorProto = this ?: FieldDescriptorProto.defaultInstance

private fun FieldDescriptorProto.protoMergeImpl(plus: pbandk.Message?): FieldDescriptorProto = (plus as? FieldDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        number = plus.number ?: number,
        label = plus.label ?: label,
        type = plus.type ?: type,
        typeName = plus.typeName ?: typeName,
        extendee = plus.extendee ?: extendee,
        defaultValue = plus.defaultValue ?: defaultValue,
        oneofIndex = plus.oneofIndex ?: oneofIndex,
        jsonName = plus.jsonName ?: jsonName,
        options = options?.plus(plus.options) ?: plus.options,
        proto3Optional = plus.proto3Optional ?: proto3Optional,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var label: pbandk.wkt.FieldDescriptorProto.Label? = null
    var type: pbandk.wkt.FieldDescriptorProto.Type? = null
    var typeName: String? = null
    var extendee: String? = null
    var defaultValue: String? = null
    var oneofIndex: Int? = null
    var jsonName: String? = null
    var options: pbandk.wkt.FieldOptions? = null
    var proto3Optional: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> extendee = _fieldValue as String
            3 -> number = _fieldValue as Int
            4 -> label = _fieldValue as pbandk.wkt.FieldDescriptorProto.Label
            5 -> type = _fieldValue as pbandk.wkt.FieldDescriptorProto.Type
            6 -> typeName = _fieldValue as String
            7 -> defaultValue = _fieldValue as String
            8 -> options = _fieldValue as pbandk.wkt.FieldOptions
            9 -> oneofIndex = _fieldValue as Int
            10 -> jsonName = _fieldValue as String
            17 -> proto3Optional = _fieldValue as Boolean
        }
    }

    return FieldDescriptorProto(name, number, label, type,
        typeName, extendee, defaultValue, oneofIndex,
        jsonName, options, proto3Optional, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForOneofDescriptorProto")
public fun OneofDescriptorProto?.orDefault(): pbandk.wkt.OneofDescriptorProto = this ?: OneofDescriptorProto.defaultInstance

private fun OneofDescriptorProto.protoMergeImpl(plus: pbandk.Message?): OneofDescriptorProto = (plus as? OneofDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun OneofDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneofDescriptorProto {
    var name: String? = null
    var options: pbandk.wkt.OneofOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> options = _fieldValue as pbandk.wkt.OneofOptions
        }
    }

    return OneofDescriptorProto(name, options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProto")
public fun EnumDescriptorProto?.orDefault(): pbandk.wkt.EnumDescriptorProto = this ?: EnumDescriptorProto.defaultInstance

private fun EnumDescriptorProto.protoMergeImpl(plus: pbandk.Message?): EnumDescriptorProto = (plus as? EnumDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        value = value + plus.value,
        options = options?.plus(plus.options) ?: plus.options,
        reservedRange = reservedRange + plus.reservedRange,
        reservedName = reservedName + plus.reservedName,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumDescriptorProto {
    var name: String? = null
    var value: pbandk.ListWithSize.Builder<pbandk.wkt.EnumValueDescriptorProto>? = null
    var options: pbandk.wkt.EnumOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> value = (value ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.EnumValueDescriptorProto> }
            3 -> options = _fieldValue as pbandk.wkt.EnumOptions
            4 -> reservedRange = (reservedRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> }
            5 -> reservedName = (reservedName ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return EnumDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(value), options, pbandk.ListWithSize.Builder.fixed(reservedRange),
        pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProtoEnumReservedRange")
public fun EnumDescriptorProto.EnumReservedRange?.orDefault(): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = this ?: EnumDescriptorProto.EnumReservedRange.defaultInstance

private fun EnumDescriptorProto.EnumReservedRange.protoMergeImpl(plus: pbandk.Message?): EnumDescriptorProto.EnumReservedRange = (plus as? EnumDescriptorProto.EnumReservedRange)?.let {
    it.copy(
        start = plus.start ?: start,
        end = plus.end ?: end,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.EnumReservedRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumDescriptorProto.EnumReservedRange {
    var start: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
        }
    }

    return EnumDescriptorProto.EnumReservedRange(start, end, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueDescriptorProto")
public fun EnumValueDescriptorProto?.orDefault(): pbandk.wkt.EnumValueDescriptorProto = this ?: EnumValueDescriptorProto.defaultInstance

private fun EnumValueDescriptorProto.protoMergeImpl(plus: pbandk.Message?): EnumValueDescriptorProto = (plus as? EnumValueDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        number = plus.number ?: number,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValueDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValueDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var options: pbandk.wkt.EnumValueOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> number = _fieldValue as Int
            3 -> options = _fieldValue as pbandk.wkt.EnumValueOptions
        }
    }

    return EnumValueDescriptorProto(name, number, options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForServiceDescriptorProto")
public fun ServiceDescriptorProto?.orDefault(): pbandk.wkt.ServiceDescriptorProto = this ?: ServiceDescriptorProto.defaultInstance

private fun ServiceDescriptorProto.protoMergeImpl(plus: pbandk.Message?): ServiceDescriptorProto = (plus as? ServiceDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        method = method + plus.method,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceDescriptorProto {
    var name: String? = null
    var method: pbandk.ListWithSize.Builder<pbandk.wkt.MethodDescriptorProto>? = null
    var options: pbandk.wkt.ServiceOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> method = (method ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.MethodDescriptorProto> }
            3 -> options = _fieldValue as pbandk.wkt.ServiceOptions
        }
    }

    return ServiceDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(method), options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethodDescriptorProto")
public fun MethodDescriptorProto?.orDefault(): pbandk.wkt.MethodDescriptorProto = this ?: MethodDescriptorProto.defaultInstance

private fun MethodDescriptorProto.protoMergeImpl(plus: pbandk.Message?): MethodDescriptorProto = (plus as? MethodDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        inputType = plus.inputType ?: inputType,
        outputType = plus.outputType ?: outputType,
        options = options?.plus(plus.options) ?: plus.options,
        clientStreaming = plus.clientStreaming ?: clientStreaming,
        serverStreaming = plus.serverStreaming ?: serverStreaming,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MethodDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MethodDescriptorProto {
    var name: String? = null
    var inputType: String? = null
    var outputType: String? = null
    var options: pbandk.wkt.MethodOptions? = null
    var clientStreaming: Boolean? = null
    var serverStreaming: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> inputType = _fieldValue as String
            3 -> outputType = _fieldValue as String
            4 -> options = _fieldValue as pbandk.wkt.MethodOptions
            5 -> clientStreaming = _fieldValue as Boolean
            6 -> serverStreaming = _fieldValue as Boolean
        }
    }

    return MethodDescriptorProto(name, inputType, outputType, options,
        clientStreaming, serverStreaming, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileOptions")
public fun FileOptions?.orDefault(): pbandk.wkt.FileOptions = this ?: FileOptions.defaultInstance

private fun FileOptions.protoMergeImpl(plus: pbandk.Message?): FileOptions = (plus as? FileOptions)?.let {
    @Suppress("DEPRECATION")
    it.copy(
        javaPackage = plus.javaPackage ?: javaPackage,
        javaOuterClassname = plus.javaOuterClassname ?: javaOuterClassname,
        javaMultipleFiles = plus.javaMultipleFiles ?: javaMultipleFiles,
        javaGenerateEqualsAndHash = plus.javaGenerateEqualsAndHash ?: javaGenerateEqualsAndHash,
        javaStringCheckUtf8 = plus.javaStringCheckUtf8 ?: javaStringCheckUtf8,
        optimizeFor = plus.optimizeFor ?: optimizeFor,
        goPackage = plus.goPackage ?: goPackage,
        ccGenericServices = plus.ccGenericServices ?: ccGenericServices,
        javaGenericServices = plus.javaGenericServices ?: javaGenericServices,
        pyGenericServices = plus.pyGenericServices ?: pyGenericServices,
        deprecated = plus.deprecated ?: deprecated,
        ccEnableArenas = plus.ccEnableArenas ?: ccEnableArenas,
        objcClassPrefix = plus.objcClassPrefix ?: objcClassPrefix,
        csharpNamespace = plus.csharpNamespace ?: csharpNamespace,
        swiftPrefix = plus.swiftPrefix ?: swiftPrefix,
        phpClassPrefix = plus.phpClassPrefix ?: phpClassPrefix,
        phpNamespace = plus.phpNamespace ?: phpNamespace,
        phpMetadataNamespace = plus.phpMetadataNamespace ?: phpMetadataNamespace,
        rubyPackage = plus.rubyPackage ?: rubyPackage,
        features = features?.plus(plus.features) ?: plus.features,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileOptions {
    var javaPackage: String? = null
    var javaOuterClassname: String? = null
    var javaMultipleFiles: Boolean? = null
    var javaGenerateEqualsAndHash: Boolean? = null
    var javaStringCheckUtf8: Boolean? = null
    var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null
    var goPackage: String? = null
    var ccGenericServices: Boolean? = null
    var javaGenericServices: Boolean? = null
    var pyGenericServices: Boolean? = null
    var deprecated: Boolean? = null
    var ccEnableArenas: Boolean? = null
    var objcClassPrefix: String? = null
    var csharpNamespace: String? = null
    var swiftPrefix: String? = null
    var phpClassPrefix: String? = null
    var phpNamespace: String? = null
    var phpMetadataNamespace: String? = null
    var rubyPackage: String? = null
    var features: pbandk.wkt.FeatureSet? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> javaPackage = _fieldValue as String
            8 -> javaOuterClassname = _fieldValue as String
            9 -> optimizeFor = _fieldValue as pbandk.wkt.FileOptions.OptimizeMode
            10 -> javaMultipleFiles = _fieldValue as Boolean
            11 -> goPackage = _fieldValue as String
            16 -> ccGenericServices = _fieldValue as Boolean
            17 -> javaGenericServices = _fieldValue as Boolean
            18 -> pyGenericServices = _fieldValue as Boolean
            20 -> javaGenerateEqualsAndHash = _fieldValue as Boolean
            23 -> deprecated = _fieldValue as Boolean
            27 -> javaStringCheckUtf8 = _fieldValue as Boolean
            31 -> ccEnableArenas = _fieldValue as Boolean
            36 -> objcClassPrefix = _fieldValue as String
            37 -> csharpNamespace = _fieldValue as String
            39 -> swiftPrefix = _fieldValue as String
            40 -> phpClassPrefix = _fieldValue as String
            41 -> phpNamespace = _fieldValue as String
            44 -> phpMetadataNamespace = _fieldValue as String
            45 -> rubyPackage = _fieldValue as String
            50 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return FileOptions(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash,
        javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices,
        javaGenericServices, pyGenericServices, deprecated, ccEnableArenas,
        objcClassPrefix, csharpNamespace, swiftPrefix, phpClassPrefix,
        phpNamespace, phpMetadataNamespace, rubyPackage, features,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageOptions")
public fun MessageOptions?.orDefault(): pbandk.wkt.MessageOptions = this ?: MessageOptions.defaultInstance

private fun MessageOptions.protoMergeImpl(plus: pbandk.Message?): MessageOptions = (plus as? MessageOptions)?.let {
    @Suppress("DEPRECATION")
    it.copy(
        messageSetWireFormat = plus.messageSetWireFormat ?: messageSetWireFormat,
        noStandardDescriptorAccessor = plus.noStandardDescriptorAccessor ?: noStandardDescriptorAccessor,
        deprecated = plus.deprecated ?: deprecated,
        mapEntry = plus.mapEntry ?: mapEntry,
        deprecatedLegacyJsonFieldConflicts = plus.deprecatedLegacyJsonFieldConflicts ?: deprecatedLegacyJsonFieldConflicts,
        features = features?.plus(plus.features) ?: plus.features,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageOptions {
    var messageSetWireFormat: Boolean? = null
    var noStandardDescriptorAccessor: Boolean? = null
    var deprecated: Boolean? = null
    var mapEntry: Boolean? = null
    var deprecatedLegacyJsonFieldConflicts: Boolean? = null
    var features: pbandk.wkt.FeatureSet? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> messageSetWireFormat = _fieldValue as Boolean
            2 -> noStandardDescriptorAccessor = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            7 -> mapEntry = _fieldValue as Boolean
            11 -> deprecatedLegacyJsonFieldConflicts = _fieldValue as Boolean
            12 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return MessageOptions(messageSetWireFormat, noStandardDescriptorAccessor, deprecated, mapEntry,
        deprecatedLegacyJsonFieldConflicts, features, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptions")
public fun FieldOptions?.orDefault(): pbandk.wkt.FieldOptions = this ?: FieldOptions.defaultInstance

private fun FieldOptions.protoMergeImpl(plus: pbandk.Message?): FieldOptions = (plus as? FieldOptions)?.let {
    it.copy(
        ctype = plus.ctype ?: ctype,
        packed = plus.packed ?: packed,
        jstype = plus.jstype ?: jstype,
        lazy = plus.lazy ?: lazy,
        unverifiedLazy = plus.unverifiedLazy ?: unverifiedLazy,
        deprecated = plus.deprecated ?: deprecated,
        weak = plus.weak ?: weak,
        debugRedact = plus.debugRedact ?: debugRedact,
        retention = plus.retention ?: retention,
        targets = targets + plus.targets,
        editionDefaults = editionDefaults + plus.editionDefaults,
        features = features?.plus(plus.features) ?: plus.features,
        featureSupport = featureSupport?.plus(plus.featureSupport) ?: plus.featureSupport,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldOptions {
    var ctype: pbandk.wkt.FieldOptions.CType? = null
    var packed: Boolean? = null
    var jstype: pbandk.wkt.FieldOptions.JSType? = null
    var lazy: Boolean? = null
    var unverifiedLazy: Boolean? = null
    var deprecated: Boolean? = null
    var weak: Boolean? = null
    var debugRedact: Boolean? = null
    var retention: pbandk.wkt.FieldOptions.OptionRetention? = null
    var targets: pbandk.ListWithSize.Builder<pbandk.wkt.FieldOptions.OptionTargetType>? = null
    var editionDefaults: pbandk.ListWithSize.Builder<pbandk.wkt.FieldOptions.EditionDefault>? = null
    var features: pbandk.wkt.FeatureSet? = null
    var featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ctype = _fieldValue as pbandk.wkt.FieldOptions.CType
            2 -> packed = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            5 -> lazy = _fieldValue as Boolean
            6 -> jstype = _fieldValue as pbandk.wkt.FieldOptions.JSType
            10 -> weak = _fieldValue as Boolean
            15 -> unverifiedLazy = _fieldValue as Boolean
            16 -> debugRedact = _fieldValue as Boolean
            17 -> retention = _fieldValue as pbandk.wkt.FieldOptions.OptionRetention
            19 -> targets = (targets ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FieldOptions.OptionTargetType> }
            20 -> editionDefaults = (editionDefaults ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FieldOptions.EditionDefault> }
            21 -> features = _fieldValue as pbandk.wkt.FeatureSet
            22 -> featureSupport = _fieldValue as pbandk.wkt.FieldOptions.FeatureSupport
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return FieldOptions(ctype, packed, jstype, lazy,
        unverifiedLazy, deprecated, weak, debugRedact,
        retention, pbandk.ListWithSize.Builder.fixed(targets), pbandk.ListWithSize.Builder.fixed(editionDefaults), features,
        featureSupport, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptionsEditionDefault")
public fun FieldOptions.EditionDefault?.orDefault(): pbandk.wkt.FieldOptions.EditionDefault = this ?: FieldOptions.EditionDefault.defaultInstance

private fun FieldOptions.EditionDefault.protoMergeImpl(plus: pbandk.Message?): FieldOptions.EditionDefault = (plus as? FieldOptions.EditionDefault)?.let {
    it.copy(
        edition = plus.edition ?: edition,
        value = plus.value ?: value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldOptions.EditionDefault.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldOptions.EditionDefault {
    var edition: pbandk.wkt.Edition? = null
    var value: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> value = _fieldValue as String
            3 -> edition = _fieldValue as pbandk.wkt.Edition
        }
    }

    return FieldOptions.EditionDefault(edition, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptionsFeatureSupport")
public fun FieldOptions.FeatureSupport?.orDefault(): pbandk.wkt.FieldOptions.FeatureSupport = this ?: FieldOptions.FeatureSupport.defaultInstance

private fun FieldOptions.FeatureSupport.protoMergeImpl(plus: pbandk.Message?): FieldOptions.FeatureSupport = (plus as? FieldOptions.FeatureSupport)?.let {
    it.copy(
        editionIntroduced = plus.editionIntroduced ?: editionIntroduced,
        editionDeprecated = plus.editionDeprecated ?: editionDeprecated,
        deprecationWarning = plus.deprecationWarning ?: deprecationWarning,
        editionRemoved = plus.editionRemoved ?: editionRemoved,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldOptions.FeatureSupport.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldOptions.FeatureSupport {
    var editionIntroduced: pbandk.wkt.Edition? = null
    var editionDeprecated: pbandk.wkt.Edition? = null
    var deprecationWarning: String? = null
    var editionRemoved: pbandk.wkt.Edition? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> editionIntroduced = _fieldValue as pbandk.wkt.Edition
            2 -> editionDeprecated = _fieldValue as pbandk.wkt.Edition
            3 -> deprecationWarning = _fieldValue as String
            4 -> editionRemoved = _fieldValue as pbandk.wkt.Edition
        }
    }

    return FieldOptions.FeatureSupport(editionIntroduced, editionDeprecated, deprecationWarning, editionRemoved, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForOneofOptions")
public fun OneofOptions?.orDefault(): pbandk.wkt.OneofOptions = this ?: OneofOptions.defaultInstance

private fun OneofOptions.protoMergeImpl(plus: pbandk.Message?): OneofOptions = (plus as? OneofOptions)?.let {
    it.copy(
        features = features?.plus(plus.features) ?: plus.features,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun OneofOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneofOptions {
    var features: pbandk.wkt.FeatureSet? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return OneofOptions(features, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumOptions")
public fun EnumOptions?.orDefault(): pbandk.wkt.EnumOptions = this ?: EnumOptions.defaultInstance

private fun EnumOptions.protoMergeImpl(plus: pbandk.Message?): EnumOptions = (plus as? EnumOptions)?.let {
    @Suppress("DEPRECATION")
    it.copy(
        allowAlias = plus.allowAlias ?: allowAlias,
        deprecated = plus.deprecated ?: deprecated,
        deprecatedLegacyJsonFieldConflicts = plus.deprecatedLegacyJsonFieldConflicts ?: deprecatedLegacyJsonFieldConflicts,
        features = features?.plus(plus.features) ?: plus.features,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumOptions {
    var allowAlias: Boolean? = null
    var deprecated: Boolean? = null
    var deprecatedLegacyJsonFieldConflicts: Boolean? = null
    var features: pbandk.wkt.FeatureSet? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> allowAlias = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            6 -> deprecatedLegacyJsonFieldConflicts = _fieldValue as Boolean
            7 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return EnumOptions(allowAlias, deprecated, deprecatedLegacyJsonFieldConflicts, features,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueOptions")
public fun EnumValueOptions?.orDefault(): pbandk.wkt.EnumValueOptions = this ?: EnumValueOptions.defaultInstance

private fun EnumValueOptions.protoMergeImpl(plus: pbandk.Message?): EnumValueOptions = (plus as? EnumValueOptions)?.let {
    it.copy(
        deprecated = plus.deprecated ?: deprecated,
        features = features?.plus(plus.features) ?: plus.features,
        debugRedact = plus.debugRedact ?: debugRedact,
        featureSupport = featureSupport?.plus(plus.featureSupport) ?: plus.featureSupport,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValueOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValueOptions {
    var deprecated: Boolean? = null
    var features: pbandk.wkt.FeatureSet? = null
    var debugRedact: Boolean? = null
    var featureSupport: pbandk.wkt.FieldOptions.FeatureSupport? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> deprecated = _fieldValue as Boolean
            2 -> features = _fieldValue as pbandk.wkt.FeatureSet
            3 -> debugRedact = _fieldValue as Boolean
            4 -> featureSupport = _fieldValue as pbandk.wkt.FieldOptions.FeatureSupport
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return EnumValueOptions(deprecated, features, debugRedact, featureSupport,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForServiceOptions")
public fun ServiceOptions?.orDefault(): pbandk.wkt.ServiceOptions = this ?: ServiceOptions.defaultInstance

private fun ServiceOptions.protoMergeImpl(plus: pbandk.Message?): ServiceOptions = (plus as? ServiceOptions)?.let {
    it.copy(
        features = features?.plus(plus.features) ?: plus.features,
        deprecated = plus.deprecated ?: deprecated,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceOptions {
    var features: pbandk.wkt.FeatureSet? = null
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            34 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return ServiceOptions(features, deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethodOptions")
public fun MethodOptions?.orDefault(): pbandk.wkt.MethodOptions = this ?: MethodOptions.defaultInstance

private fun MethodOptions.protoMergeImpl(plus: pbandk.Message?): MethodOptions = (plus as? MethodOptions)?.let {
    it.copy(
        deprecated = plus.deprecated ?: deprecated,
        idempotencyLevel = plus.idempotencyLevel ?: idempotencyLevel,
        features = features?.plus(plus.features) ?: plus.features,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MethodOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MethodOptions {
    var deprecated: Boolean? = null
    var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null
    var features: pbandk.wkt.FeatureSet? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            34 -> idempotencyLevel = _fieldValue as pbandk.wkt.MethodOptions.IdempotencyLevel
            35 -> features = _fieldValue as pbandk.wkt.FeatureSet
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }

    return MethodOptions(deprecated, idempotencyLevel, features, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUninterpretedOption")
public fun UninterpretedOption?.orDefault(): pbandk.wkt.UninterpretedOption = this ?: UninterpretedOption.defaultInstance

private fun UninterpretedOption.protoMergeImpl(plus: pbandk.Message?): UninterpretedOption = (plus as? UninterpretedOption)?.let {
    it.copy(
        name = name + plus.name,
        identifierValue = plus.identifierValue ?: identifierValue,
        positiveIntValue = plus.positiveIntValue ?: positiveIntValue,
        negativeIntValue = plus.negativeIntValue ?: negativeIntValue,
        doubleValue = plus.doubleValue ?: doubleValue,
        stringValue = plus.stringValue ?: stringValue,
        aggregateValue = plus.aggregateValue ?: aggregateValue,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UninterpretedOption {
    var name: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption.NamePart>? = null
    var identifierValue: String? = null
    var positiveIntValue: Long? = null
    var negativeIntValue: Long? = null
    var doubleValue: Double? = null
    var stringValue: pbandk.ByteArr? = null
    var aggregateValue: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> name = (name ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.UninterpretedOption.NamePart> }
            3 -> identifierValue = _fieldValue as String
            4 -> positiveIntValue = _fieldValue as Long
            5 -> negativeIntValue = _fieldValue as Long
            6 -> doubleValue = _fieldValue as Double
            7 -> stringValue = _fieldValue as pbandk.ByteArr
            8 -> aggregateValue = _fieldValue as String
        }
    }

    return UninterpretedOption(pbandk.ListWithSize.Builder.fixed(name), identifierValue, positiveIntValue, negativeIntValue,
        doubleValue, stringValue, aggregateValue, unknownFields)
}

private fun UninterpretedOption.NamePart.protoMergeImpl(plus: pbandk.Message?): UninterpretedOption.NamePart = (plus as? UninterpretedOption.NamePart)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.NamePart.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UninterpretedOption.NamePart {
    var namePart: String? = null
    var isExtension: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> namePart = _fieldValue as String
            2 -> isExtension = _fieldValue as Boolean
        }
    }

    if (namePart == null) {
        throw pbandk.InvalidProtocolBufferException.missingRequiredField("name_part")
    }
    if (isExtension == null) {
        throw pbandk.InvalidProtocolBufferException.missingRequiredField("is_extension")
    }
    return UninterpretedOption.NamePart(namePart!!, isExtension!!, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeatureSet")
public fun FeatureSet?.orDefault(): pbandk.wkt.FeatureSet = this ?: FeatureSet.defaultInstance

private fun FeatureSet.protoMergeImpl(plus: pbandk.Message?): FeatureSet = (plus as? FeatureSet)?.let {
    it.copy(
        fieldPresence = plus.fieldPresence ?: fieldPresence,
        enumType = plus.enumType ?: enumType,
        repeatedFieldEncoding = plus.repeatedFieldEncoding ?: repeatedFieldEncoding,
        utf8Validation = plus.utf8Validation ?: utf8Validation,
        messageEncoding = plus.messageEncoding ?: messageEncoding,
        jsonFormat = plus.jsonFormat ?: jsonFormat,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FeatureSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FeatureSet {
    var fieldPresence: pbandk.wkt.FeatureSet.FieldPresence? = null
    var enumType: pbandk.wkt.FeatureSet.EnumType? = null
    var repeatedFieldEncoding: pbandk.wkt.FeatureSet.RepeatedFieldEncoding? = null
    var utf8Validation: pbandk.wkt.FeatureSet.Utf8Validation? = null
    var messageEncoding: pbandk.wkt.FeatureSet.MessageEncoding? = null
    var jsonFormat: pbandk.wkt.FeatureSet.JsonFormat? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fieldPresence = _fieldValue as pbandk.wkt.FeatureSet.FieldPresence
            2 -> enumType = _fieldValue as pbandk.wkt.FeatureSet.EnumType
            3 -> repeatedFieldEncoding = _fieldValue as pbandk.wkt.FeatureSet.RepeatedFieldEncoding
            4 -> utf8Validation = _fieldValue as pbandk.wkt.FeatureSet.Utf8Validation
            5 -> messageEncoding = _fieldValue as pbandk.wkt.FeatureSet.MessageEncoding
            6 -> jsonFormat = _fieldValue as pbandk.wkt.FeatureSet.JsonFormat
        }
    }

    return FeatureSet(fieldPresence, enumType, repeatedFieldEncoding, utf8Validation,
        messageEncoding, jsonFormat, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeatureSetDefaults")
public fun FeatureSetDefaults?.orDefault(): pbandk.wkt.FeatureSetDefaults = this ?: FeatureSetDefaults.defaultInstance

private fun FeatureSetDefaults.protoMergeImpl(plus: pbandk.Message?): FeatureSetDefaults = (plus as? FeatureSetDefaults)?.let {
    it.copy(
        defaults = defaults + plus.defaults,
        minimumEdition = plus.minimumEdition ?: minimumEdition,
        maximumEdition = plus.maximumEdition ?: maximumEdition,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FeatureSetDefaults.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FeatureSetDefaults {
    var defaults: pbandk.ListWithSize.Builder<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault>? = null
    var minimumEdition: pbandk.wkt.Edition? = null
    var maximumEdition: pbandk.wkt.Edition? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> defaults = (defaults ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault> }
            4 -> minimumEdition = _fieldValue as pbandk.wkt.Edition
            5 -> maximumEdition = _fieldValue as pbandk.wkt.Edition
        }
    }

    return FeatureSetDefaults(pbandk.ListWithSize.Builder.fixed(defaults), minimumEdition, maximumEdition, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeatureSetDefaultsFeatureSetEditionDefault")
public fun FeatureSetDefaults.FeatureSetEditionDefault?.orDefault(): pbandk.wkt.FeatureSetDefaults.FeatureSetEditionDefault = this ?: FeatureSetDefaults.FeatureSetEditionDefault.defaultInstance

private fun FeatureSetDefaults.FeatureSetEditionDefault.protoMergeImpl(plus: pbandk.Message?): FeatureSetDefaults.FeatureSetEditionDefault = (plus as? FeatureSetDefaults.FeatureSetEditionDefault)?.let {
    it.copy(
        edition = plus.edition ?: edition,
        overridableFeatures = overridableFeatures?.plus(plus.overridableFeatures) ?: plus.overridableFeatures,
        fixedFeatures = fixedFeatures?.plus(plus.fixedFeatures) ?: plus.fixedFeatures,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FeatureSetDefaults.FeatureSetEditionDefault.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FeatureSetDefaults.FeatureSetEditionDefault {
    var edition: pbandk.wkt.Edition? = null
    var overridableFeatures: pbandk.wkt.FeatureSet? = null
    var fixedFeatures: pbandk.wkt.FeatureSet? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            3 -> edition = _fieldValue as pbandk.wkt.Edition
            4 -> overridableFeatures = _fieldValue as pbandk.wkt.FeatureSet
            5 -> fixedFeatures = _fieldValue as pbandk.wkt.FeatureSet
        }
    }

    return FeatureSetDefaults.FeatureSetEditionDefault(edition, overridableFeatures, fixedFeatures, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfo")
public fun SourceCodeInfo?.orDefault(): pbandk.wkt.SourceCodeInfo = this ?: SourceCodeInfo.defaultInstance

private fun SourceCodeInfo.protoMergeImpl(plus: pbandk.Message?): SourceCodeInfo = (plus as? SourceCodeInfo)?.let {
    it.copy(
        location = location + plus.location,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceCodeInfo {
    var location: pbandk.ListWithSize.Builder<pbandk.wkt.SourceCodeInfo.Location>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> location = (location ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.SourceCodeInfo.Location> }
        }
    }

    return SourceCodeInfo(pbandk.ListWithSize.Builder.fixed(location), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfoLocation")
public fun SourceCodeInfo.Location?.orDefault(): pbandk.wkt.SourceCodeInfo.Location = this ?: SourceCodeInfo.Location.defaultInstance

private fun SourceCodeInfo.Location.protoMergeImpl(plus: pbandk.Message?): SourceCodeInfo.Location = (plus as? SourceCodeInfo.Location)?.let {
    it.copy(
        path = path + plus.path,
        span = span + plus.span,
        leadingComments = plus.leadingComments ?: leadingComments,
        trailingComments = plus.trailingComments ?: trailingComments,
        leadingDetachedComments = leadingDetachedComments + plus.leadingDetachedComments,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Location.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceCodeInfo.Location {
    var path: pbandk.ListWithSize.Builder<Int>? = null
    var span: pbandk.ListWithSize.Builder<Int>? = null
    var leadingComments: String? = null
    var trailingComments: String? = null
    var leadingDetachedComments: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> path = (path ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            2 -> span = (span ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            3 -> leadingComments = _fieldValue as String
            4 -> trailingComments = _fieldValue as String
            6 -> leadingDetachedComments = (leadingDetachedComments ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return SourceCodeInfo.Location(pbandk.ListWithSize.Builder.fixed(path), pbandk.ListWithSize.Builder.fixed(span), leadingComments, trailingComments,
        pbandk.ListWithSize.Builder.fixed(leadingDetachedComments), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfo")
public fun GeneratedCodeInfo?.orDefault(): pbandk.wkt.GeneratedCodeInfo = this ?: GeneratedCodeInfo.defaultInstance

private fun GeneratedCodeInfo.protoMergeImpl(plus: pbandk.Message?): GeneratedCodeInfo = (plus as? GeneratedCodeInfo)?.let {
    it.copy(
        annotation = annotation + plus.annotation,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GeneratedCodeInfo {
    var annotation: pbandk.ListWithSize.Builder<pbandk.wkt.GeneratedCodeInfo.Annotation>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> annotation = (annotation ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.GeneratedCodeInfo.Annotation> }
        }
    }

    return GeneratedCodeInfo(pbandk.ListWithSize.Builder.fixed(annotation), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfoAnnotation")
public fun GeneratedCodeInfo.Annotation?.orDefault(): pbandk.wkt.GeneratedCodeInfo.Annotation = this ?: GeneratedCodeInfo.Annotation.defaultInstance

private fun GeneratedCodeInfo.Annotation.protoMergeImpl(plus: pbandk.Message?): GeneratedCodeInfo.Annotation = (plus as? GeneratedCodeInfo.Annotation)?.let {
    it.copy(
        path = path + plus.path,
        sourceFile = plus.sourceFile ?: sourceFile,
        begin = plus.begin ?: begin,
        end = plus.end ?: end,
        semantic = plus.semantic ?: semantic,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Annotation.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GeneratedCodeInfo.Annotation {
    var path: pbandk.ListWithSize.Builder<Int>? = null
    var sourceFile: String? = null
    var begin: Int? = null
    var end: Int? = null
    var semantic: pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> path = (path ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<Int> }
            2 -> sourceFile = _fieldValue as String
            3 -> begin = _fieldValue as Int
            4 -> end = _fieldValue as Int
            5 -> semantic = _fieldValue as pbandk.wkt.GeneratedCodeInfo.Annotation.Semantic
        }
    }

    return GeneratedCodeInfo.Annotation(pbandk.ListWithSize.Builder.fixed(path), sourceFile, begin, end,
        semantic, unknownFields)
}

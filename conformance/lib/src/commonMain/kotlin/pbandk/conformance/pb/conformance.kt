@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

@pbandk.Export
public sealed class WireFormat(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is WireFormat && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "WireFormat.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : WireFormat(0, "UNSPECIFIED")
    public object PROTOBUF : WireFormat(1, "PROTOBUF")
    public object JSON : WireFormat(2, "JSON")
    public object JSPB : WireFormat(3, "JSPB")
    public object TEXT_FORMAT : WireFormat(4, "TEXT_FORMAT")
    public class UNRECOGNIZED(value: Int) : WireFormat(value)

    public companion object : pbandk.Message.Enum.Companion<WireFormat> {
        public val values: List<WireFormat> by lazy { listOf(UNSPECIFIED, PROTOBUF, JSON, JSPB, TEXT_FORMAT) }
        override fun fromValue(value: Int): WireFormat = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): WireFormat = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No WireFormat with name: $name")
    }
}

@pbandk.Export
public sealed class TestCategory(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is TestCategory && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "TestCategory.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED_TEST : TestCategory(0, "UNSPECIFIED_TEST")
    public object BINARY_TEST : TestCategory(1, "BINARY_TEST")
    public object JSON_TEST : TestCategory(2, "JSON_TEST")
    public object JSON_IGNORE_UNKNOWN_PARSING_TEST : TestCategory(3, "JSON_IGNORE_UNKNOWN_PARSING_TEST")
    public object JSPB_TEST : TestCategory(4, "JSPB_TEST")
    public object TEXT_FORMAT_TEST : TestCategory(5, "TEXT_FORMAT_TEST")
    public class UNRECOGNIZED(value: Int) : TestCategory(value)

    public companion object : pbandk.Message.Enum.Companion<TestCategory> {
        public val values: List<TestCategory> by lazy { listOf(UNSPECIFIED_TEST, BINARY_TEST, JSON_TEST, JSON_IGNORE_UNKNOWN_PARSING_TEST, JSPB_TEST, TEXT_FORMAT_TEST) }
        override fun fromValue(value: Int): TestCategory = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): TestCategory = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TestCategory with name: $name")
    }
}

public sealed interface FailureSet : pbandk.Message {
    public val failure: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.FailureSet
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet>

    public fun copy(
        failure: List<String> = this.failure,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.FailureSet

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.FailureSet> {
        @Deprecated("Use failureSet { } instead")
        public operator fun invoke(
            failure: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.FailureSet = FailureSet_Impl(
            failure = failure,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.FailureSet by lazy { pbandk.conformance.pb.FailureSet() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.FailureSet = pbandk.conformance.pb.FailureSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.FailureSet, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "failure",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "failure",
                        value = pbandk.conformance.pb.FailureSet::failure
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.FailureSet",
                messageClass = pbandk.conformance.pb.FailureSet::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFailureSet : FailureSet, pbandk.MutableMessage {
    public override var failure: List<String>

    public fun toFailureSet(): FailureSet

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.FailureSet> {
        @Deprecated("Use failureSet { } instead")
        public operator fun invoke(
            failure: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFailureSet = MutableFailureSet_Impl(
            failure = failure,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFailureSet by lazy { MutableFailureSet() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.FailureSet = pbandk.conformance.pb.FailureSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet> get() = pbandk.conformance.pb.FailureSet.descriptor
    }
}

public sealed interface ConformanceRequest : pbandk.Message {
    public val requestedOutputFormat: pbandk.conformance.pb.WireFormat
    public val messageType: String
    public val testCategory: pbandk.conformance.pb.TestCategory
    public val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?
    public val printUnknownFields: Boolean
    public val payload: Payload<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ConformanceRequest
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceRequest>

    public fun copy(
        requestedOutputFormat: pbandk.conformance.pb.WireFormat = this.requestedOutputFormat,
        messageType: String = this.messageType,
        testCategory: pbandk.conformance.pb.TestCategory = this.testCategory,
        jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = this.jspbEncodingOptions,
        printUnknownFields: Boolean = this.printUnknownFields,
        payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>? = this.payload,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.ConformanceRequest

    public val protobufPayload: pbandk.ByteArr?
    public val jsonPayload: String?
    public val jspbPayload: String?
    public val textPayload: String?

    public sealed class Payload<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Payload<pbandk.ByteArr>(protobufPayload)
        public class JsonPayload(jsonPayload: String = "") : Payload<String>(jsonPayload)
        public class JspbPayload(jspbPayload: String = "") : Payload<String>(jspbPayload)
        public class TextPayload(textPayload: String = "") : Payload<String>(textPayload)
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceRequest> {
        @Deprecated("Use conformanceRequest { } instead")
        public operator fun invoke(
            requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
            messageType: String = "",
            testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
            jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null,
            printUnknownFields: Boolean = false,
            payload: Payload<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.ConformanceRequest = ConformanceRequest_Impl(
            requestedOutputFormat = requestedOutputFormat,
            messageType = messageType,
            testCategory = testCategory,
            jspbEncodingOptions = jspbEncodingOptions,
            printUnknownFields = printUnknownFields,
            payload = payload,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.ConformanceRequest by lazy { pbandk.conformance.pb.ConformanceRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ConformanceRequest = pbandk.conformance.pb.ConformanceRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, *>>(9)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "protobuf_payload",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::protobufPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_payload",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jsonPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::jsonPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "requested_output_format",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.WireFormat.Companion),
                        jsonName = "requestedOutputFormat",
                        value = pbandk.conformance.pb.ConformanceRequest::requestedOutputFormat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageType",
                        value = pbandk.conformance.pb.ConformanceRequest::messageType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "test_category",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestCategory.Companion),
                        jsonName = "testCategory",
                        value = pbandk.conformance.pb.ConformanceRequest::testCategory
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_encoding_options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.JspbEncodingConfig.Companion),
                        jsonName = "jspbEncodingOptions",
                        value = pbandk.conformance.pb.ConformanceRequest::jspbEncodingOptions
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_payload",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jspbPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::jspbPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "text_payload",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "textPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::textPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "print_unknown_fields",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "printUnknownFields",
                        value = pbandk.conformance.pb.ConformanceRequest::printUnknownFields
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.ConformanceRequest",
                messageClass = pbandk.conformance.pb.ConformanceRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableConformanceRequest : ConformanceRequest, pbandk.MutableMessage {
    public override var requestedOutputFormat: pbandk.conformance.pb.WireFormat
    public override var messageType: String
    public override var testCategory: pbandk.conformance.pb.TestCategory
    public override var jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?
    public override var printUnknownFields: Boolean
    public override var payload: ConformanceRequest.Payload<*>?

    public override var protobufPayload: pbandk.ByteArr?
    public override var jsonPayload: String?
    public override var jspbPayload: String?
    public override var textPayload: String?

    public fun toConformanceRequest(): ConformanceRequest

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceRequest> {
        @Deprecated("Use conformanceRequest { } instead")
        public operator fun invoke(
            requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
            messageType: String = "",
            testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
            jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null,
            printUnknownFields: Boolean = false,
            payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableConformanceRequest = MutableConformanceRequest_Impl(
            requestedOutputFormat = requestedOutputFormat,
            messageType = messageType,
            testCategory = testCategory,
            jspbEncodingOptions = jspbEncodingOptions,
            printUnknownFields = printUnknownFields,
            payload = payload,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableConformanceRequest by lazy { MutableConformanceRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ConformanceRequest = pbandk.conformance.pb.ConformanceRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceRequest> get() = pbandk.conformance.pb.ConformanceRequest.descriptor
    }
}

public sealed interface ConformanceResponse : pbandk.Message {
    public val result: Result<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ConformanceResponse
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse>

    public fun copy(
        result: pbandk.conformance.pb.ConformanceResponse.Result<*>? = this.result,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.ConformanceResponse

    public val parseError: String?
    public val serializeError: String?
    public val runtimeError: String?
    public val protobufPayload: pbandk.ByteArr?
    public val jsonPayload: String?
    public val skipped: String?
    public val jspbPayload: String?
    public val textPayload: String?

    public sealed class Result<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class ParseError(parseError: String = "") : Result<String>(parseError)
        public class SerializeError(serializeError: String = "") : Result<String>(serializeError)
        public class RuntimeError(runtimeError: String = "") : Result<String>(runtimeError)
        public class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Result<pbandk.ByteArr>(protobufPayload)
        public class JsonPayload(jsonPayload: String = "") : Result<String>(jsonPayload)
        public class Skipped(skipped: String = "") : Result<String>(skipped)
        public class JspbPayload(jspbPayload: String = "") : Result<String>(jspbPayload)
        public class TextPayload(textPayload: String = "") : Result<String>(textPayload)
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceResponse> {
        @Deprecated("Use conformanceResponse { } instead")
        public operator fun invoke(
            result: Result<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.ConformanceResponse = ConformanceResponse_Impl(
            result = result,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.ConformanceResponse by lazy { pbandk.conformance.pb.ConformanceResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ConformanceResponse = pbandk.conformance.pb.ConformanceResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parse_error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "parseError",
                        value = pbandk.conformance.pb.ConformanceResponse::parseError
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "runtime_error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "runtimeError",
                        value = pbandk.conformance.pb.ConformanceResponse::runtimeError
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "protobuf_payload",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::protobufPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_payload",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jsonPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::jsonPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skipped",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "skipped",
                        value = pbandk.conformance.pb.ConformanceResponse::skipped
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "serialize_error",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "serializeError",
                        value = pbandk.conformance.pb.ConformanceResponse::serializeError
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_payload",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jspbPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::jspbPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "text_payload",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "textPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::textPayload
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.ConformanceResponse",
                messageClass = pbandk.conformance.pb.ConformanceResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableConformanceResponse : ConformanceResponse, pbandk.MutableMessage {
    public override var result: ConformanceResponse.Result<*>?

    public override var parseError: String?
    public override var serializeError: String?
    public override var runtimeError: String?
    public override var protobufPayload: pbandk.ByteArr?
    public override var jsonPayload: String?
    public override var skipped: String?
    public override var jspbPayload: String?
    public override var textPayload: String?

    public fun toConformanceResponse(): ConformanceResponse

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceResponse> {
        @Deprecated("Use conformanceResponse { } instead")
        public operator fun invoke(
            result: pbandk.conformance.pb.ConformanceResponse.Result<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableConformanceResponse = MutableConformanceResponse_Impl(
            result = result,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableConformanceResponse by lazy { MutableConformanceResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ConformanceResponse = pbandk.conformance.pb.ConformanceResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse> get() = pbandk.conformance.pb.ConformanceResponse.descriptor
    }
}

public sealed interface JspbEncodingConfig : pbandk.Message {
    public val useJspbArrayAnyFormat: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.JspbEncodingConfig
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig>

    public fun copy(
        useJspbArrayAnyFormat: Boolean = this.useJspbArrayAnyFormat,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.JspbEncodingConfig

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.JspbEncodingConfig> {
        @Deprecated("Use jspbEncodingConfig { } instead")
        public operator fun invoke(
            useJspbArrayAnyFormat: Boolean = false,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.JspbEncodingConfig = JspbEncodingConfig_Impl(
            useJspbArrayAnyFormat = useJspbArrayAnyFormat,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.JspbEncodingConfig by lazy { pbandk.conformance.pb.JspbEncodingConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.JspbEncodingConfig = pbandk.conformance.pb.JspbEncodingConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.JspbEncodingConfig, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "use_jspb_array_any_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "useJspbArrayAnyFormat",
                        value = pbandk.conformance.pb.JspbEncodingConfig::useJspbArrayAnyFormat
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.JspbEncodingConfig",
                messageClass = pbandk.conformance.pb.JspbEncodingConfig::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableJspbEncodingConfig : JspbEncodingConfig, pbandk.MutableMessage {
    public override var useJspbArrayAnyFormat: Boolean

    public fun toJspbEncodingConfig(): JspbEncodingConfig

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.JspbEncodingConfig> {
        @Deprecated("Use jspbEncodingConfig { } instead")
        public operator fun invoke(
            useJspbArrayAnyFormat: Boolean = false,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableJspbEncodingConfig = MutableJspbEncodingConfig_Impl(
            useJspbArrayAnyFormat = useJspbArrayAnyFormat,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableJspbEncodingConfig by lazy { MutableJspbEncodingConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.JspbEncodingConfig = pbandk.conformance.pb.JspbEncodingConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig> get() = pbandk.conformance.pb.JspbEncodingConfig.descriptor
    }
}

public fun failureSet(builderAction: MutableFailureSet.() -> Unit): FailureSet {
    @Suppress("DEPRECATION") val builder = MutableFailureSet()
    builder.builderAction()
    return builder.toFailureSet()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFailureSet")
public fun FailureSet?.orDefault(): pbandk.conformance.pb.FailureSet = this ?: FailureSet.defaultInstance

private class FailureSet_Impl(
    override val failure: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FailureSet, pbandk.GeneratedMessage<FailureSet>() {
    override val descriptor get() = FailureSet.descriptor

    override fun copy(
        failure: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FailureSet_Impl(
        failure = failure,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FailureSet)?.let {
        it.copy(
            failure = failure + other.failure,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFailureSet_Impl(
    override var failure: List<String>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFailureSet, pbandk.MutableGeneratedMessage<MutableFailureSet>() {
    override val descriptor get() = FailureSet.descriptor

    override fun copy(
        failure: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FailureSet_Impl(
        failure = failure,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FailureSet)?.let {
        it.copy(
            failure = failure + other.failure,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFailureSet() = FailureSet_Impl(
        failure = failure,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun FailureSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FailureSet {
    var failure: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> failure = (failure ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    @Suppress("DEPRECATION")
    return FailureSet(pbandk.ListWithSize.Builder.fixed(failure), unknownFields)
}

public fun conformanceRequest(builderAction: MutableConformanceRequest.() -> Unit): ConformanceRequest {
    @Suppress("DEPRECATION") val builder = MutableConformanceRequest()
    builder.builderAction()
    return builder.toConformanceRequest()
}

@pbandk.Export
@pbandk.JsName("orDefaultForConformanceRequest")
public fun ConformanceRequest?.orDefault(): pbandk.conformance.pb.ConformanceRequest = this ?: ConformanceRequest.defaultInstance

private class ConformanceRequest_Impl(
    override val requestedOutputFormat: pbandk.conformance.pb.WireFormat,
    override val messageType: String,
    override val testCategory: pbandk.conformance.pb.TestCategory,
    override val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
    override val printUnknownFields: Boolean,
    override val payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ConformanceRequest, pbandk.GeneratedMessage<ConformanceRequest>() {
    override val descriptor get() = ConformanceRequest.descriptor

    override val protobufPayload: pbandk.ByteArr?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.ProtobufPayload)?.value
    override val jsonPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JsonPayload)?.value
    override val jspbPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JspbPayload)?.value
    override val textPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.TextPayload)?.value

    override fun copy(
        requestedOutputFormat: pbandk.conformance.pb.WireFormat,
        messageType: String,
        testCategory: pbandk.conformance.pb.TestCategory,
        jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
        printUnknownFields: Boolean,
        payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ConformanceRequest_Impl(
        requestedOutputFormat = requestedOutputFormat,
        messageType = messageType,
        testCategory = testCategory,
        jspbEncodingOptions = jspbEncodingOptions,
        printUnknownFields = printUnknownFields,
        payload = payload,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ConformanceRequest)?.let {
        it.copy(
            jspbEncodingOptions = jspbEncodingOptions?.plus(other.jspbEncodingOptions) ?: other.jspbEncodingOptions,
            payload = other.payload ?: payload,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableConformanceRequest_Impl(
    override var requestedOutputFormat: pbandk.conformance.pb.WireFormat,
    override var messageType: String,
    override var testCategory: pbandk.conformance.pb.TestCategory,
    override var jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
    override var printUnknownFields: Boolean,
    override var payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableConformanceRequest, pbandk.MutableGeneratedMessage<MutableConformanceRequest>() {
    override val descriptor get() = ConformanceRequest.descriptor

    override var protobufPayload: pbandk.ByteArr?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.ProtobufPayload)?.value
        set(value) { payload = value?.let { pbandk.conformance.pb.ConformanceRequest.Payload.ProtobufPayload(it) } }
    override var jsonPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JsonPayload)?.value
        set(value) { payload = value?.let { pbandk.conformance.pb.ConformanceRequest.Payload.JsonPayload(it) } }
    override var jspbPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JspbPayload)?.value
        set(value) { payload = value?.let { pbandk.conformance.pb.ConformanceRequest.Payload.JspbPayload(it) } }
    override var textPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.TextPayload)?.value
        set(value) { payload = value?.let { pbandk.conformance.pb.ConformanceRequest.Payload.TextPayload(it) } }

    override fun copy(
        requestedOutputFormat: pbandk.conformance.pb.WireFormat,
        messageType: String,
        testCategory: pbandk.conformance.pb.TestCategory,
        jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
        printUnknownFields: Boolean,
        payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ConformanceRequest_Impl(
        requestedOutputFormat = requestedOutputFormat,
        messageType = messageType,
        testCategory = testCategory,
        jspbEncodingOptions = jspbEncodingOptions,
        printUnknownFields = printUnknownFields,
        payload = payload,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ConformanceRequest)?.let {
        it.copy(
            jspbEncodingOptions = jspbEncodingOptions?.plus(other.jspbEncodingOptions) ?: other.jspbEncodingOptions,
            payload = other.payload ?: payload,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toConformanceRequest() = ConformanceRequest_Impl(
        requestedOutputFormat = requestedOutputFormat,
        messageType = messageType,
        testCategory = testCategory,
        jspbEncodingOptions = jspbEncodingOptions,
        printUnknownFields = printUnknownFields,
        payload = payload,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun ConformanceRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ConformanceRequest {
    var requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0)
    var messageType = ""
    var testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0)
    var jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null
    var printUnknownFields = false
    var payload: ConformanceRequest.Payload<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> payload = ConformanceRequest.Payload.ProtobufPayload(_fieldValue as pbandk.ByteArr)
            2 -> payload = ConformanceRequest.Payload.JsonPayload(_fieldValue as String)
            3 -> requestedOutputFormat = _fieldValue as pbandk.conformance.pb.WireFormat
            4 -> messageType = _fieldValue as String
            5 -> testCategory = _fieldValue as pbandk.conformance.pb.TestCategory
            6 -> jspbEncodingOptions = _fieldValue as pbandk.conformance.pb.JspbEncodingConfig
            7 -> payload = ConformanceRequest.Payload.JspbPayload(_fieldValue as String)
            8 -> payload = ConformanceRequest.Payload.TextPayload(_fieldValue as String)
            9 -> printUnknownFields = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return ConformanceRequest(requestedOutputFormat, messageType, testCategory, jspbEncodingOptions,
        printUnknownFields, payload, unknownFields)
}

public fun conformanceResponse(builderAction: MutableConformanceResponse.() -> Unit): ConformanceResponse {
    @Suppress("DEPRECATION") val builder = MutableConformanceResponse()
    builder.builderAction()
    return builder.toConformanceResponse()
}

@pbandk.Export
@pbandk.JsName("orDefaultForConformanceResponse")
public fun ConformanceResponse?.orDefault(): pbandk.conformance.pb.ConformanceResponse = this ?: ConformanceResponse.defaultInstance

private class ConformanceResponse_Impl(
    override val result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ConformanceResponse, pbandk.GeneratedMessage<ConformanceResponse>() {
    override val descriptor get() = ConformanceResponse.descriptor

    override val parseError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.ParseError)?.value
    override val serializeError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.SerializeError)?.value
    override val runtimeError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.RuntimeError)?.value
    override val protobufPayload: pbandk.ByteArr?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.ProtobufPayload)?.value
    override val jsonPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.JsonPayload)?.value
    override val skipped: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.Skipped)?.value
    override val jspbPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.JspbPayload)?.value
    override val textPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.TextPayload)?.value

    override fun copy(
        result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ConformanceResponse_Impl(
        result = result,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ConformanceResponse)?.let {
        it.copy(
            result = other.result ?: result,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableConformanceResponse_Impl(
    override var result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableConformanceResponse, pbandk.MutableGeneratedMessage<MutableConformanceResponse>() {
    override val descriptor get() = ConformanceResponse.descriptor

    override var parseError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.ParseError)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.ParseError(it) } }
    override var serializeError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.SerializeError)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.SerializeError(it) } }
    override var runtimeError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.RuntimeError)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.RuntimeError(it) } }
    override var protobufPayload: pbandk.ByteArr?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.ProtobufPayload)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.ProtobufPayload(it) } }
    override var jsonPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.JsonPayload)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.JsonPayload(it) } }
    override var skipped: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.Skipped)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.Skipped(it) } }
    override var jspbPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.JspbPayload)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.JspbPayload(it) } }
    override var textPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.TextPayload)?.value
        set(value) { result = value?.let { pbandk.conformance.pb.ConformanceResponse.Result.TextPayload(it) } }

    override fun copy(
        result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ConformanceResponse_Impl(
        result = result,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ConformanceResponse)?.let {
        it.copy(
            result = other.result ?: result,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toConformanceResponse() = ConformanceResponse_Impl(
        result = result,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun ConformanceResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ConformanceResponse {
    var result: ConformanceResponse.Result<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> result = ConformanceResponse.Result.ParseError(_fieldValue as String)
            2 -> result = ConformanceResponse.Result.RuntimeError(_fieldValue as String)
            3 -> result = ConformanceResponse.Result.ProtobufPayload(_fieldValue as pbandk.ByteArr)
            4 -> result = ConformanceResponse.Result.JsonPayload(_fieldValue as String)
            5 -> result = ConformanceResponse.Result.Skipped(_fieldValue as String)
            6 -> result = ConformanceResponse.Result.SerializeError(_fieldValue as String)
            7 -> result = ConformanceResponse.Result.JspbPayload(_fieldValue as String)
            8 -> result = ConformanceResponse.Result.TextPayload(_fieldValue as String)
        }
    }
    @Suppress("DEPRECATION")
    return ConformanceResponse(result, unknownFields)
}

public fun jspbEncodingConfig(builderAction: MutableJspbEncodingConfig.() -> Unit): JspbEncodingConfig {
    @Suppress("DEPRECATION") val builder = MutableJspbEncodingConfig()
    builder.builderAction()
    return builder.toJspbEncodingConfig()
}

@pbandk.Export
@pbandk.JsName("orDefaultForJspbEncodingConfig")
public fun JspbEncodingConfig?.orDefault(): pbandk.conformance.pb.JspbEncodingConfig = this ?: JspbEncodingConfig.defaultInstance

private class JspbEncodingConfig_Impl(
    override val useJspbArrayAnyFormat: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : JspbEncodingConfig, pbandk.GeneratedMessage<JspbEncodingConfig>() {
    override val descriptor get() = JspbEncodingConfig.descriptor

    override fun copy(
        useJspbArrayAnyFormat: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = JspbEncodingConfig_Impl(
        useJspbArrayAnyFormat = useJspbArrayAnyFormat,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? JspbEncodingConfig)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableJspbEncodingConfig_Impl(
    override var useJspbArrayAnyFormat: Boolean,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableJspbEncodingConfig, pbandk.MutableGeneratedMessage<MutableJspbEncodingConfig>() {
    override val descriptor get() = JspbEncodingConfig.descriptor

    override fun copy(
        useJspbArrayAnyFormat: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = JspbEncodingConfig_Impl(
        useJspbArrayAnyFormat = useJspbArrayAnyFormat,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? JspbEncodingConfig)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toJspbEncodingConfig() = JspbEncodingConfig_Impl(
        useJspbArrayAnyFormat = useJspbArrayAnyFormat,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun JspbEncodingConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): JspbEncodingConfig {
    var useJspbArrayAnyFormat = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> useJspbArrayAnyFormat = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return JspbEncodingConfig(useJspbArrayAnyFormat, unknownFields)
}

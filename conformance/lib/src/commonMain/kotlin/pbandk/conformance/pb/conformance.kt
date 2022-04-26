@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

@pbandk.Export
public sealed class WireFormat(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.conformance.pb.WireFormat && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "WireFormat.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED : WireFormat(0, "UNSPECIFIED")
    public object PROTOBUF : WireFormat(1, "PROTOBUF")
    public object JSON : WireFormat(2, "JSON")
    public object JSPB : WireFormat(3, "JSPB")
    public object TEXT_FORMAT : WireFormat(4, "TEXT_FORMAT")
    public class UNRECOGNIZED(value: Int) : WireFormat(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.WireFormat> {
        public val values: List<WireFormat> by lazy { listOf(UNSPECIFIED, PROTOBUF, JSON, JSPB, TEXT_FORMAT) }
        override fun fromValue(value: Int): pbandk.conformance.pb.WireFormat = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.conformance.pb.WireFormat = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No WireFormat with name: $name")
    }
}

@pbandk.Export
public sealed class TestCategory(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.conformance.pb.TestCategory && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "TestCategory.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNSPECIFIED_TEST : TestCategory(0, "UNSPECIFIED_TEST")
    public object BINARY_TEST : TestCategory(1, "BINARY_TEST")
    public object JSON_TEST : TestCategory(2, "JSON_TEST")
    public object JSON_IGNORE_UNKNOWN_PARSING_TEST : TestCategory(3, "JSON_IGNORE_UNKNOWN_PARSING_TEST")
    public object JSPB_TEST : TestCategory(4, "JSPB_TEST")
    public object TEXT_FORMAT_TEST : TestCategory(5, "TEXT_FORMAT_TEST")
    public class UNRECOGNIZED(value: Int) : TestCategory(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.TestCategory> {
        public val values: List<TestCategory> by lazy { listOf(UNSPECIFIED_TEST, BINARY_TEST, JSON_TEST, JSON_IGNORE_UNKNOWN_PARSING_TEST, JSPB_TEST, TEXT_FORMAT_TEST) }
        override fun fromValue(value: Int): pbandk.conformance.pb.TestCategory = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.conformance.pb.TestCategory = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TestCategory with name: $name")
    }
}

public sealed interface FailureSet : pbandk.Message {
    public val failure: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.FailureSet
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet>

    /**
     * The [MutableFailureSet] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableFailureSet.() -> Unit): pbandk.conformance.pb.FailureSet

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        failure: List<String> = this.failure,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.FailureSet

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val failure: pbandk.FieldDescriptor<pbandk.conformance.pb.FailureSet, List<String>> = 
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.FailureSet::descriptor,
                name = "failure",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                jsonName = "failure",
                value = pbandk.conformance.pb.FailureSet::failure,
                mutableValue = pbandk.conformance.pb.MutableFailureSet::failure,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.FailureSet> {
        public val defaultInstance: pbandk.conformance.pb.FailureSet by lazy { pbandk.conformance.pb.FailureSet {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "conformance.FailureSet",
                messageClass = pbandk.conformance.pb.FailureSet::class,
                messageCompanion = this,
                builder = ::FailureSet,
                fields = listOf(
                    pbandk.conformance.pb.FailureSet.FieldDescriptors.failure,
                ),
            )
        }
    }
}

public sealed interface MutableFailureSet : pbandk.conformance.pb.FailureSet, pbandk.MutableMessage<pbandk.conformance.pb.FailureSet> {
    public override val failure: MutableList<String>
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

    /**
     * The [MutableConformanceRequest] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableConformanceRequest.() -> Unit): pbandk.conformance.pb.ConformanceRequest

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    public sealed interface Payload<V> : pbandk.Message.OneOf<V> {
        public class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : 
            Payload<pbandk.ByteArr>, pbandk.gen.GeneratedOneOf<pbandk.ByteArr>(protobufPayload, pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.protobufPayload)
        public class JsonPayload(jsonPayload: String = "") : 
            Payload<String>, pbandk.gen.GeneratedOneOf<String>(jsonPayload, pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.jsonPayload)
        public class JspbPayload(jspbPayload: String = "") : 
            Payload<String>, pbandk.gen.GeneratedOneOf<String>(jspbPayload, pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.jspbPayload)
        public class TextPayload(textPayload: String = "") : 
            Payload<String>, pbandk.gen.GeneratedOneOf<String>(textPayload, pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.textPayload)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val protobufPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, pbandk.ByteArr?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "protobuf_payload",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                jsonName = "protobufPayload",
                value = pbandk.conformance.pb.ConformanceRequest::protobufPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::protobufPayload,
            )
        public val jsonPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "json_payload",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "jsonPayload",
                value = pbandk.conformance.pb.ConformanceRequest::jsonPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::jsonPayload,
            )
        public val requestedOutputFormat: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, pbandk.conformance.pb.WireFormat> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "requested_output_format",
                number = 3,
                type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.WireFormat.Companion),
                jsonName = "requestedOutputFormat",
                value = pbandk.conformance.pb.ConformanceRequest::requestedOutputFormat,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::requestedOutputFormat,
            )
        public val messageType: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, String> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "message_type",
                number = 4,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "messageType",
                value = pbandk.conformance.pb.ConformanceRequest::messageType,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::messageType,
            )
        public val testCategory: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, pbandk.conformance.pb.TestCategory> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "test_category",
                number = 5,
                type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestCategory.Companion),
                jsonName = "testCategory",
                value = pbandk.conformance.pb.ConformanceRequest::testCategory,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::testCategory,
            )
        public val jspbEncodingOptions: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, pbandk.conformance.pb.JspbEncodingConfig?> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "jspb_encoding_options",
                number = 6,
                type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.JspbEncodingConfig.Companion),
                jsonName = "jspbEncodingOptions",
                value = pbandk.conformance.pb.ConformanceRequest::jspbEncodingOptions,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::jspbEncodingOptions,
            )
        public val jspbPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "jspb_payload",
                number = 7,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "jspbPayload",
                value = pbandk.conformance.pb.ConformanceRequest::jspbPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::jspbPayload,
            )
        public val textPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "text_payload",
                number = 8,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "textPayload",
                value = pbandk.conformance.pb.ConformanceRequest::textPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::textPayload,
            )
        public val printUnknownFields: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, Boolean> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "print_unknown_fields",
                number = 9,
                type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                jsonName = "printUnknownFields",
                value = pbandk.conformance.pb.ConformanceRequest::printUnknownFields,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::printUnknownFields,
            )

        public val payload: pbandk.OneofDescriptor<pbandk.conformance.pb.ConformanceRequest, pbandk.conformance.pb.ConformanceRequest.Payload<*>> = 
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceRequest::descriptor,
                name = "payload",
                value = pbandk.conformance.pb.ConformanceRequest::payload,
                mutableValue = pbandk.conformance.pb.MutableConformanceRequest::payload,
                fields = listOf(
                    protobufPayload,
                    jsonPayload,
                    jspbPayload,
                    textPayload,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceRequest> {
        public val defaultInstance: pbandk.conformance.pb.ConformanceRequest by lazy { pbandk.conformance.pb.ConformanceRequest {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceRequest> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "conformance.ConformanceRequest",
                messageClass = pbandk.conformance.pb.ConformanceRequest::class,
                messageCompanion = this,
                builder = ::ConformanceRequest,
                fields = listOf(
                    pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.requestedOutputFormat,
                    pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.messageType,
                    pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.testCategory,
                    pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.jspbEncodingOptions,
                    pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.printUnknownFields,
                ),
                oneofs = listOf(
                    pbandk.conformance.pb.ConformanceRequest.FieldDescriptors.payload,
                ),
            )
        }
    }
}

public sealed interface MutableConformanceRequest : pbandk.conformance.pb.ConformanceRequest, pbandk.MutableMessage<pbandk.conformance.pb.ConformanceRequest> {
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
}

public sealed interface ConformanceResponse : pbandk.Message {
    public val result: Result<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ConformanceResponse
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse>

    /**
     * The [MutableConformanceResponse] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableConformanceResponse.() -> Unit): pbandk.conformance.pb.ConformanceResponse

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    public sealed interface Result<V> : pbandk.Message.OneOf<V> {
        public class ParseError(parseError: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(parseError, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.parseError)
        public class SerializeError(serializeError: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(serializeError, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.serializeError)
        public class RuntimeError(runtimeError: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(runtimeError, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.runtimeError)
        public class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : 
            Result<pbandk.ByteArr>, pbandk.gen.GeneratedOneOf<pbandk.ByteArr>(protobufPayload, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.protobufPayload)
        public class JsonPayload(jsonPayload: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(jsonPayload, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.jsonPayload)
        public class Skipped(skipped: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(skipped, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.skipped)
        public class JspbPayload(jspbPayload: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(jspbPayload, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.jspbPayload)
        public class TextPayload(textPayload: String = "") : 
            Result<String>, pbandk.gen.GeneratedOneOf<String>(textPayload, pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.textPayload)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val parseError: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "parse_error",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "parseError",
                value = pbandk.conformance.pb.ConformanceResponse::parseError,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::parseError,
            )
        public val runtimeError: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "runtime_error",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "runtimeError",
                value = pbandk.conformance.pb.ConformanceResponse::runtimeError,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::runtimeError,
            )
        public val protobufPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, pbandk.ByteArr?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "protobuf_payload",
                number = 3,
                type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                jsonName = "protobufPayload",
                value = pbandk.conformance.pb.ConformanceResponse::protobufPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::protobufPayload,
            )
        public val jsonPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "json_payload",
                number = 4,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "jsonPayload",
                value = pbandk.conformance.pb.ConformanceResponse::jsonPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::jsonPayload,
            )
        public val skipped: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "skipped",
                number = 5,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "skipped",
                value = pbandk.conformance.pb.ConformanceResponse::skipped,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::skipped,
            )
        public val serializeError: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "serialize_error",
                number = 6,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "serializeError",
                value = pbandk.conformance.pb.ConformanceResponse::serializeError,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::serializeError,
            )
        public val jspbPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "jspb_payload",
                number = 7,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "jspbPayload",
                value = pbandk.conformance.pb.ConformanceResponse::jspbPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::jspbPayload,
            )
        public val textPayload: pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, String?> = 
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "text_payload",
                number = 8,
                type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                jsonName = "textPayload",
                value = pbandk.conformance.pb.ConformanceResponse::textPayload,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::textPayload,
            )

        public val result: pbandk.OneofDescriptor<pbandk.conformance.pb.ConformanceResponse, pbandk.conformance.pb.ConformanceResponse.Result<*>> = 
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.ConformanceResponse::descriptor,
                name = "result",
                value = pbandk.conformance.pb.ConformanceResponse::result,
                mutableValue = pbandk.conformance.pb.MutableConformanceResponse::result,
                fields = listOf(
                    parseError,
                    serializeError,
                    runtimeError,
                    protobufPayload,
                    jsonPayload,
                    skipped,
                    jspbPayload,
                    textPayload,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceResponse> {
        public val defaultInstance: pbandk.conformance.pb.ConformanceResponse by lazy { pbandk.conformance.pb.ConformanceResponse {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "conformance.ConformanceResponse",
                messageClass = pbandk.conformance.pb.ConformanceResponse::class,
                messageCompanion = this,
                builder = ::ConformanceResponse,
                oneofs = listOf(
                    pbandk.conformance.pb.ConformanceResponse.FieldDescriptors.result,
                ),
            )
        }
    }
}

public sealed interface MutableConformanceResponse : pbandk.conformance.pb.ConformanceResponse, pbandk.MutableMessage<pbandk.conformance.pb.ConformanceResponse> {
    public override var result: ConformanceResponse.Result<*>?

    public override var parseError: String?
    public override var serializeError: String?
    public override var runtimeError: String?
    public override var protobufPayload: pbandk.ByteArr?
    public override var jsonPayload: String?
    public override var skipped: String?
    public override var jspbPayload: String?
    public override var textPayload: String?
}

public sealed interface JspbEncodingConfig : pbandk.Message {
    public val useJspbArrayAnyFormat: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.JspbEncodingConfig
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig>

    /**
     * The [MutableJspbEncodingConfig] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableJspbEncodingConfig.() -> Unit): pbandk.conformance.pb.JspbEncodingConfig

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        useJspbArrayAnyFormat: Boolean = this.useJspbArrayAnyFormat,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.JspbEncodingConfig

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val useJspbArrayAnyFormat: pbandk.FieldDescriptor<pbandk.conformance.pb.JspbEncodingConfig, Boolean> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.JspbEncodingConfig::descriptor,
                name = "use_jspb_array_any_format",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                jsonName = "useJspbArrayAnyFormat",
                value = pbandk.conformance.pb.JspbEncodingConfig::useJspbArrayAnyFormat,
                mutableValue = pbandk.conformance.pb.MutableJspbEncodingConfig::useJspbArrayAnyFormat,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.JspbEncodingConfig> {
        public val defaultInstance: pbandk.conformance.pb.JspbEncodingConfig by lazy { pbandk.conformance.pb.JspbEncodingConfig {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "conformance.JspbEncodingConfig",
                messageClass = pbandk.conformance.pb.JspbEncodingConfig::class,
                messageCompanion = this,
                builder = ::JspbEncodingConfig,
                fields = listOf(
                    pbandk.conformance.pb.JspbEncodingConfig.FieldDescriptors.useJspbArrayAnyFormat,
                ),
            )
        }
    }
}

public sealed interface MutableJspbEncodingConfig : pbandk.conformance.pb.JspbEncodingConfig, pbandk.MutableMessage<pbandk.conformance.pb.JspbEncodingConfig> {
    public override var useJspbArrayAnyFormat: Boolean
}

@Deprecated(
    message = "Use FailureSet { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.FailureSet"],
        expression = "FailureSet {\nthis.failure += failure\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FailureSet(
    failure: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.FailureSet = pbandk.conformance.pb.FailureSet {
    this.failure += failure
    this.unknownFields += unknownFields
}

/**
 * The [MutableFailureSet] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFailureSet")
public fun FailureSet(builderAction: pbandk.conformance.pb.MutableFailureSet.() -> Unit): pbandk.conformance.pb.FailureSet = pbandk.conformance.pb.MutableFailureSet_Impl(
    failure = pbandk.gen.MutableListField(),
).also(builderAction).toFailureSet()

@pbandk.Export
@pbandk.JsName("orDefaultForFailureSet")
public fun FailureSet?.orDefault(): pbandk.conformance.pb.FailureSet = this ?: pbandk.conformance.pb.FailureSet.defaultInstance

private class FailureSet_Impl(
    override val failure: pbandk.gen.ListField<String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.FailureSet, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.FailureSet>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.FailureSet.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableFailureSet.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        failure: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.FailureSet {
        this.failure += failure
        this.unknownFields += unknownFields
    }
}

private class MutableFailureSet_Impl(
    override val failure: pbandk.gen.MutableListField<String>,
) : pbandk.conformance.pb.MutableFailureSet, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.FailureSet>() {
    override val descriptor get() = pbandk.conformance.pb.FailureSet.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableFailureSet.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        failure: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFailureSet() = FailureSet_Impl(
        failure = failure.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ConformanceRequest { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.ConformanceRequest"],
        expression = "ConformanceRequest {\nthis.requestedOutputFormat = requestedOutputFormat\nthis.messageType = messageType\nthis.testCategory = testCategory\nthis.jspbEncodingOptions = jspbEncodingOptions\nthis.printUnknownFields = printUnknownFields\nthis.payload = payload\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ConformanceRequest(
    requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
    messageType: String = "",
    testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
    jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null,
    printUnknownFields: Boolean = false,
    payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.ConformanceRequest = pbandk.conformance.pb.ConformanceRequest {
    this.requestedOutputFormat = requestedOutputFormat
    this.messageType = messageType
    this.testCategory = testCategory
    this.jspbEncodingOptions = jspbEncodingOptions
    this.printUnknownFields = printUnknownFields
    this.payload = payload
    this.unknownFields += unknownFields
}

/**
 * The [MutableConformanceRequest] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildConformanceRequest")
public fun ConformanceRequest(builderAction: pbandk.conformance.pb.MutableConformanceRequest.() -> Unit): pbandk.conformance.pb.ConformanceRequest = pbandk.conformance.pb.MutableConformanceRequest_Impl(
    requestedOutputFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
    messageType = "",
    testCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
    jspbEncodingOptions = null,
    printUnknownFields = false,
    payload = null,
).also(builderAction).toConformanceRequest()

@pbandk.Export
@pbandk.JsName("orDefaultForConformanceRequest")
public fun ConformanceRequest?.orDefault(): pbandk.conformance.pb.ConformanceRequest = this ?: pbandk.conformance.pb.ConformanceRequest.defaultInstance

private class ConformanceRequest_Impl(
    override val requestedOutputFormat: pbandk.conformance.pb.WireFormat,
    override val messageType: String,
    override val testCategory: pbandk.conformance.pb.TestCategory,
    override val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
    override val printUnknownFields: Boolean,
    override val payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.ConformanceRequest, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.ConformanceRequest>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.ConformanceRequest.descriptor

    override val protobufPayload: pbandk.ByteArr?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.ProtobufPayload)?.value
    override val jsonPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JsonPayload)?.value
    override val jspbPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JspbPayload)?.value
    override val textPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.TextPayload)?.value

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableConformanceRequest.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        requestedOutputFormat: pbandk.conformance.pb.WireFormat,
        messageType: String,
        testCategory: pbandk.conformance.pb.TestCategory,
        jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
        printUnknownFields: Boolean,
        payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.ConformanceRequest {
        this.requestedOutputFormat = requestedOutputFormat
        this.messageType = messageType
        this.testCategory = testCategory
        this.jspbEncodingOptions = jspbEncodingOptions
        this.printUnknownFields = printUnknownFields
        this.payload = payload
        this.unknownFields += unknownFields
    }
}

private class MutableConformanceRequest_Impl(
    override var requestedOutputFormat: pbandk.conformance.pb.WireFormat,
    override var messageType: String,
    override var testCategory: pbandk.conformance.pb.TestCategory,
    override var jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
    override var printUnknownFields: Boolean,
    override var payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
) : pbandk.conformance.pb.MutableConformanceRequest, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.ConformanceRequest>() {
    override val descriptor get() = pbandk.conformance.pb.ConformanceRequest.descriptor

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
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableConformanceRequest.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        requestedOutputFormat: pbandk.conformance.pb.WireFormat,
        messageType: String,
        testCategory: pbandk.conformance.pb.TestCategory,
        jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
        printUnknownFields: Boolean,
        payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toConformanceRequest() = ConformanceRequest_Impl(
        requestedOutputFormat = requestedOutputFormat,
        messageType = messageType,
        testCategory = testCategory,
        jspbEncodingOptions = jspbEncodingOptions,
        printUnknownFields = printUnknownFields,
        payload = payload,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ConformanceResponse { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.ConformanceResponse"],
        expression = "ConformanceResponse {\nthis.result = result\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ConformanceResponse(
    result: pbandk.conformance.pb.ConformanceResponse.Result<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.ConformanceResponse = pbandk.conformance.pb.ConformanceResponse {
    this.result = result
    this.unknownFields += unknownFields
}

/**
 * The [MutableConformanceResponse] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildConformanceResponse")
public fun ConformanceResponse(builderAction: pbandk.conformance.pb.MutableConformanceResponse.() -> Unit): pbandk.conformance.pb.ConformanceResponse = pbandk.conformance.pb.MutableConformanceResponse_Impl(
    result = null,
).also(builderAction).toConformanceResponse()

@pbandk.Export
@pbandk.JsName("orDefaultForConformanceResponse")
public fun ConformanceResponse?.orDefault(): pbandk.conformance.pb.ConformanceResponse = this ?: pbandk.conformance.pb.ConformanceResponse.defaultInstance

private class ConformanceResponse_Impl(
    override val result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.ConformanceResponse, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.ConformanceResponse>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.ConformanceResponse.descriptor

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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableConformanceResponse.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.ConformanceResponse {
        this.result = result
        this.unknownFields += unknownFields
    }
}

private class MutableConformanceResponse_Impl(
    override var result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
) : pbandk.conformance.pb.MutableConformanceResponse, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.ConformanceResponse>() {
    override val descriptor get() = pbandk.conformance.pb.ConformanceResponse.descriptor

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
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableConformanceResponse.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toConformanceResponse() = ConformanceResponse_Impl(
        result = result,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use JspbEncodingConfig { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.JspbEncodingConfig"],
        expression = "JspbEncodingConfig {\nthis.useJspbArrayAnyFormat = useJspbArrayAnyFormat\nthis.unknownFields += unknownFields\n}",
    )
)
public fun JspbEncodingConfig(
    useJspbArrayAnyFormat: Boolean = false,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.JspbEncodingConfig = pbandk.conformance.pb.JspbEncodingConfig {
    this.useJspbArrayAnyFormat = useJspbArrayAnyFormat
    this.unknownFields += unknownFields
}

/**
 * The [MutableJspbEncodingConfig] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildJspbEncodingConfig")
public fun JspbEncodingConfig(builderAction: pbandk.conformance.pb.MutableJspbEncodingConfig.() -> Unit): pbandk.conformance.pb.JspbEncodingConfig = pbandk.conformance.pb.MutableJspbEncodingConfig_Impl(
    useJspbArrayAnyFormat = false,
).also(builderAction).toJspbEncodingConfig()

@pbandk.Export
@pbandk.JsName("orDefaultForJspbEncodingConfig")
public fun JspbEncodingConfig?.orDefault(): pbandk.conformance.pb.JspbEncodingConfig = this ?: pbandk.conformance.pb.JspbEncodingConfig.defaultInstance

private class JspbEncodingConfig_Impl(
    override val useJspbArrayAnyFormat: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.JspbEncodingConfig, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.JspbEncodingConfig>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.JspbEncodingConfig.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableJspbEncodingConfig.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        useJspbArrayAnyFormat: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.JspbEncodingConfig {
        this.useJspbArrayAnyFormat = useJspbArrayAnyFormat
        this.unknownFields += unknownFields
    }
}

private class MutableJspbEncodingConfig_Impl(
    override var useJspbArrayAnyFormat: Boolean,
) : pbandk.conformance.pb.MutableJspbEncodingConfig, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.JspbEncodingConfig>() {
    override val descriptor get() = pbandk.conformance.pb.JspbEncodingConfig.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableJspbEncodingConfig.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        useJspbArrayAnyFormat: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toJspbEncodingConfig() = JspbEncodingConfig_Impl(
        useJspbArrayAnyFormat = useJspbArrayAnyFormat,
        unknownFields = unknownFields.toMap()
    )
}

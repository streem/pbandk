@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

sealed class WireFormat(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is WireFormat && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "WireFormat.${name ?: "UNRECOGNIZED"}(value=$value)"

    object UNSPECIFIED : WireFormat(0, "UNSPECIFIED")
    object PROTOBUF : WireFormat(1, "PROTOBUF")
    object JSON : WireFormat(2, "JSON")
    object JSPB : WireFormat(3, "JSPB")
    object TEXT_FORMAT : WireFormat(4, "TEXT_FORMAT")
    class UNRECOGNIZED(value: Int) : WireFormat(value)

    companion object : pbandk.Message.Enum.Companion<WireFormat> {
        val values: List<WireFormat> by lazy { listOf(UNSPECIFIED, PROTOBUF, JSON, JSPB, TEXT_FORMAT) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No WireFormat with name: $name")
    }
}

sealed class TestCategory(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is TestCategory && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "TestCategory.${name ?: "UNRECOGNIZED"}(value=$value)"

    object UNSPECIFIED_TEST : TestCategory(0, "UNSPECIFIED_TEST")
    object BINARY_TEST : TestCategory(1, "BINARY_TEST")
    object JSON_TEST : TestCategory(2, "JSON_TEST")
    object JSON_IGNORE_UNKNOWN_PARSING_TEST : TestCategory(3, "JSON_IGNORE_UNKNOWN_PARSING_TEST")
    object JSPB_TEST : TestCategory(4, "JSPB_TEST")
    object TEXT_FORMAT_TEST : TestCategory(5, "TEXT_FORMAT_TEST")
    class UNRECOGNIZED(value: Int) : TestCategory(value)

    companion object : pbandk.Message.Enum.Companion<TestCategory> {
        val values: List<TestCategory> by lazy { listOf(UNSPECIFIED_TEST, BINARY_TEST, JSON_TEST, JSON_IGNORE_UNKNOWN_PARSING_TEST, JSPB_TEST, TEXT_FORMAT_TEST) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TestCategory with name: $name")
    }
}

data class FailureSet(
    val failure: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FailureSet> {
        val defaultInstance by lazy { FailureSet() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FailureSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FailureSet> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FailureSet::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "failure",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "failure",
                        value = FailureSet::failure
                    )
                )
            )
        }
    }
}

data class ConformanceRequest(
    val requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
    val messageType: String = "",
    val testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
    val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null,
    val printUnknownFields: Boolean = false,
    val payload: Payload<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class Payload<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Payload<pbandk.ByteArr>(protobufPayload)
        class JsonPayload(jsonPayload: String = "") : Payload<String>(jsonPayload)
        class JspbPayload(jspbPayload: String = "") : Payload<String>(jspbPayload)
        class TextPayload(textPayload: String = "") : Payload<String>(textPayload)
    }

    val protobufPayload: pbandk.ByteArr?
        get() = (payload as? Payload.ProtobufPayload)?.value
    val jsonPayload: String?
        get() = (payload as? Payload.JsonPayload)?.value
    val jspbPayload: String?
        get() = (payload as? Payload.JspbPayload)?.value
    val textPayload: String?
        get() = (payload as? Payload.TextPayload)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<ConformanceRequest> {
        val defaultInstance by lazy { ConformanceRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = ConformanceRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ConformanceRequest> by lazy {
            pbandk.MessageDescriptor(
                messageClass = ConformanceRequest::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "protobuf_payload",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = ConformanceRequest::protobufPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "json_payload",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jsonPayload",
                        value = ConformanceRequest::jsonPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "requested_output_format",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.WireFormat.Companion),
                        jsonName = "requestedOutputFormat",
                        value = ConformanceRequest::requestedOutputFormat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageType",
                        value = ConformanceRequest::messageType
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "test_category",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestCategory.Companion),
                        jsonName = "testCategory",
                        value = ConformanceRequest::testCategory
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "jspb_encoding_options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.JspbEncodingConfig.Companion),
                        jsonName = "jspbEncodingOptions",
                        value = ConformanceRequest::jspbEncodingOptions
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "jspb_payload",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jspbPayload",
                        value = ConformanceRequest::jspbPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "text_payload",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "textPayload",
                        value = ConformanceRequest::textPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "print_unknown_fields",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "printUnknownFields",
                        value = ConformanceRequest::printUnknownFields
                    )
                )
            )
        }
    }
}

data class ConformanceResponse(
    val result: Result<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class Result<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class ParseError(parseError: String = "") : Result<String>(parseError)
        class SerializeError(serializeError: String = "") : Result<String>(serializeError)
        class RuntimeError(runtimeError: String = "") : Result<String>(runtimeError)
        class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Result<pbandk.ByteArr>(protobufPayload)
        class JsonPayload(jsonPayload: String = "") : Result<String>(jsonPayload)
        class Skipped(skipped: String = "") : Result<String>(skipped)
        class JspbPayload(jspbPayload: String = "") : Result<String>(jspbPayload)
        class TextPayload(textPayload: String = "") : Result<String>(textPayload)
    }

    val parseError: String?
        get() = (result as? Result.ParseError)?.value
    val serializeError: String?
        get() = (result as? Result.SerializeError)?.value
    val runtimeError: String?
        get() = (result as? Result.RuntimeError)?.value
    val protobufPayload: pbandk.ByteArr?
        get() = (result as? Result.ProtobufPayload)?.value
    val jsonPayload: String?
        get() = (result as? Result.JsonPayload)?.value
    val skipped: String?
        get() = (result as? Result.Skipped)?.value
    val jspbPayload: String?
        get() = (result as? Result.JspbPayload)?.value
    val textPayload: String?
        get() = (result as? Result.TextPayload)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<ConformanceResponse> {
        val defaultInstance by lazy { ConformanceResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder) = ConformanceResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ConformanceResponse> by lazy {
            pbandk.MessageDescriptor(
                messageClass = ConformanceResponse::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "parse_error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "parseError",
                        value = ConformanceResponse::parseError
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "runtime_error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "runtimeError",
                        value = ConformanceResponse::runtimeError
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "protobuf_payload",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = ConformanceResponse::protobufPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "json_payload",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jsonPayload",
                        value = ConformanceResponse::jsonPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "skipped",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "skipped",
                        value = ConformanceResponse::skipped
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "serialize_error",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "serializeError",
                        value = ConformanceResponse::serializeError
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "jspb_payload",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jspbPayload",
                        value = ConformanceResponse::jspbPayload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "text_payload",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "textPayload",
                        value = ConformanceResponse::textPayload
                    )
                )
            )
        }
    }
}

data class JspbEncodingConfig(
    val useJspbArrayAnyFormat: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<JspbEncodingConfig> {
        val defaultInstance by lazy { JspbEncodingConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder) = JspbEncodingConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<JspbEncodingConfig> by lazy {
            pbandk.MessageDescriptor(
                messageClass = JspbEncodingConfig::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "use_jspb_array_any_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "useJspbArrayAnyFormat",
                        value = JspbEncodingConfig::useJspbArrayAnyFormat
                    )
                )
            )
        }
    }
}

fun FailureSet?.orDefault() = this ?: FailureSet.defaultInstance

private fun FailureSet.protoMergeImpl(plus: pbandk.Message?): FailureSet = (plus as? FailureSet)?.copy(
    failure = failure + plus.failure,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FailureSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FailureSet {
    var failure: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> failure = (failure ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return FailureSet(pbandk.ListWithSize.Builder.fixed(failure), unknownFields)
}

fun ConformanceRequest?.orDefault() = this ?: ConformanceRequest.defaultInstance

private fun ConformanceRequest.protoMergeImpl(plus: pbandk.Message?): ConformanceRequest = (plus as? ConformanceRequest)?.copy(
    jspbEncodingOptions = jspbEncodingOptions?.plus(plus.jspbEncodingOptions) ?: plus.jspbEncodingOptions,
    payload = plus.payload ?: payload,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return ConformanceRequest(requestedOutputFormat, messageType, testCategory, jspbEncodingOptions,
        printUnknownFields, payload, unknownFields)
}

fun ConformanceResponse?.orDefault() = this ?: ConformanceResponse.defaultInstance

private fun ConformanceResponse.protoMergeImpl(plus: pbandk.Message?): ConformanceResponse = (plus as? ConformanceResponse)?.copy(
    result = plus.result ?: result,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return ConformanceResponse(result, unknownFields)
}

fun JspbEncodingConfig?.orDefault() = this ?: JspbEncodingConfig.defaultInstance

private fun JspbEncodingConfig.protoMergeImpl(plus: pbandk.Message?): JspbEncodingConfig = (plus as? JspbEncodingConfig)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun JspbEncodingConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): JspbEncodingConfig {
    var useJspbArrayAnyFormat = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> useJspbArrayAnyFormat = _fieldValue as Boolean
        }
    }
    return JspbEncodingConfig(useJspbArrayAnyFormat, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf.conformance

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

@pbandk.Export
public data class FailureSet(
    val failure: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.conformance.FailureSet = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.FailureSet> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.conformance.FailureSet> {
        public val defaultInstance: com.google.protobuf.conformance.FailureSet by lazy { com.google.protobuf.conformance.FailureSet() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.conformance.FailureSet = com.google.protobuf.conformance.FailureSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.FailureSet> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.conformance.FailureSet, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "failure",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "failure",
                        value = com.google.protobuf.conformance.FailureSet::failure
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.FailureSet",
                messageClass = com.google.protobuf.conformance.FailureSet::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ConformanceRequest(
    val requestedOutputFormat: com.google.protobuf.conformance.WireFormat = com.google.protobuf.conformance.WireFormat.fromValue(0),
    val messageType: String = "",
    val testCategory: com.google.protobuf.conformance.TestCategory = com.google.protobuf.conformance.TestCategory.fromValue(0),
    val jspbEncodingOptions: com.google.protobuf.conformance.JspbEncodingConfig? = null,
    val printUnknownFields: Boolean = false,
    val payload: Payload<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Payload<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Payload<pbandk.ByteArr>(protobufPayload)
        public class JsonPayload(jsonPayload: String = "") : Payload<String>(jsonPayload)
        public class JspbPayload(jspbPayload: String = "") : Payload<String>(jspbPayload)
        public class TextPayload(textPayload: String = "") : Payload<String>(textPayload)
    }

    val protobufPayload: pbandk.ByteArr?
        get() = (payload as? Payload.ProtobufPayload)?.value
    val jsonPayload: String?
        get() = (payload as? Payload.JsonPayload)?.value
    val jspbPayload: String?
        get() = (payload as? Payload.JspbPayload)?.value
    val textPayload: String?
        get() = (payload as? Payload.TextPayload)?.value

    override operator fun plus(other: pbandk.Message?): com.google.protobuf.conformance.ConformanceRequest = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.ConformanceRequest> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.conformance.ConformanceRequest> {
        public val defaultInstance: com.google.protobuf.conformance.ConformanceRequest by lazy { com.google.protobuf.conformance.ConformanceRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.conformance.ConformanceRequest = com.google.protobuf.conformance.ConformanceRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.ConformanceRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.conformance.ConformanceRequest, *>>(9)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "protobuf_payload",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = com.google.protobuf.conformance.ConformanceRequest::protobufPayload
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
                        value = com.google.protobuf.conformance.ConformanceRequest::jsonPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "requested_output_format",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.conformance.WireFormat.Companion),
                        jsonName = "requestedOutputFormat",
                        value = com.google.protobuf.conformance.ConformanceRequest::requestedOutputFormat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageType",
                        value = com.google.protobuf.conformance.ConformanceRequest::messageType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "test_category",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.conformance.TestCategory.Companion),
                        jsonName = "testCategory",
                        value = com.google.protobuf.conformance.ConformanceRequest::testCategory
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_encoding_options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.conformance.JspbEncodingConfig.Companion),
                        jsonName = "jspbEncodingOptions",
                        value = com.google.protobuf.conformance.ConformanceRequest::jspbEncodingOptions
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
                        value = com.google.protobuf.conformance.ConformanceRequest::jspbPayload
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
                        value = com.google.protobuf.conformance.ConformanceRequest::textPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "print_unknown_fields",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "printUnknownFields",
                        value = com.google.protobuf.conformance.ConformanceRequest::printUnknownFields
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.ConformanceRequest",
                messageClass = com.google.protobuf.conformance.ConformanceRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ConformanceResponse(
    val result: Result<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
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

    override operator fun plus(other: pbandk.Message?): com.google.protobuf.conformance.ConformanceResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.ConformanceResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.conformance.ConformanceResponse> {
        public val defaultInstance: com.google.protobuf.conformance.ConformanceResponse by lazy { com.google.protobuf.conformance.ConformanceResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.conformance.ConformanceResponse = com.google.protobuf.conformance.ConformanceResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.ConformanceResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.conformance.ConformanceResponse, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parse_error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "parseError",
                        value = com.google.protobuf.conformance.ConformanceResponse::parseError
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
                        value = com.google.protobuf.conformance.ConformanceResponse::runtimeError
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
                        value = com.google.protobuf.conformance.ConformanceResponse::protobufPayload
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
                        value = com.google.protobuf.conformance.ConformanceResponse::jsonPayload
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
                        value = com.google.protobuf.conformance.ConformanceResponse::skipped
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
                        value = com.google.protobuf.conformance.ConformanceResponse::serializeError
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
                        value = com.google.protobuf.conformance.ConformanceResponse::jspbPayload
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
                        value = com.google.protobuf.conformance.ConformanceResponse::textPayload
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.ConformanceResponse",
                messageClass = com.google.protobuf.conformance.ConformanceResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class JspbEncodingConfig(
    val useJspbArrayAnyFormat: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.conformance.JspbEncodingConfig = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.JspbEncodingConfig> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.conformance.JspbEncodingConfig> {
        public val defaultInstance: com.google.protobuf.conformance.JspbEncodingConfig by lazy { com.google.protobuf.conformance.JspbEncodingConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.conformance.JspbEncodingConfig = com.google.protobuf.conformance.JspbEncodingConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.conformance.JspbEncodingConfig> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.conformance.JspbEncodingConfig, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "use_jspb_array_any_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "useJspbArrayAnyFormat",
                        value = com.google.protobuf.conformance.JspbEncodingConfig::useJspbArrayAnyFormat
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "conformance.JspbEncodingConfig",
                messageClass = com.google.protobuf.conformance.JspbEncodingConfig::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFailureSet")
public fun FailureSet?.orDefault(): com.google.protobuf.conformance.FailureSet = this ?: FailureSet.defaultInstance

private fun FailureSet.protoMergeImpl(plus: pbandk.Message?): FailureSet = (plus as? FailureSet)?.let {
    it.copy(
        failure = failure + plus.failure,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForConformanceRequest")
public fun ConformanceRequest?.orDefault(): com.google.protobuf.conformance.ConformanceRequest = this ?: ConformanceRequest.defaultInstance

private fun ConformanceRequest.protoMergeImpl(plus: pbandk.Message?): ConformanceRequest = (plus as? ConformanceRequest)?.let {
    it.copy(
        jspbEncodingOptions = jspbEncodingOptions?.plus(plus.jspbEncodingOptions) ?: plus.jspbEncodingOptions,
        payload = plus.payload ?: payload,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ConformanceRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ConformanceRequest {
    var requestedOutputFormat: com.google.protobuf.conformance.WireFormat = com.google.protobuf.conformance.WireFormat.fromValue(0)
    var messageType = ""
    var testCategory: com.google.protobuf.conformance.TestCategory = com.google.protobuf.conformance.TestCategory.fromValue(0)
    var jspbEncodingOptions: com.google.protobuf.conformance.JspbEncodingConfig? = null
    var printUnknownFields = false
    var payload: ConformanceRequest.Payload<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> payload = ConformanceRequest.Payload.ProtobufPayload(_fieldValue as pbandk.ByteArr)
            2 -> payload = ConformanceRequest.Payload.JsonPayload(_fieldValue as String)
            3 -> requestedOutputFormat = _fieldValue as com.google.protobuf.conformance.WireFormat
            4 -> messageType = _fieldValue as String
            5 -> testCategory = _fieldValue as com.google.protobuf.conformance.TestCategory
            6 -> jspbEncodingOptions = _fieldValue as com.google.protobuf.conformance.JspbEncodingConfig
            7 -> payload = ConformanceRequest.Payload.JspbPayload(_fieldValue as String)
            8 -> payload = ConformanceRequest.Payload.TextPayload(_fieldValue as String)
            9 -> printUnknownFields = _fieldValue as Boolean
        }
    }

    return ConformanceRequest(requestedOutputFormat, messageType, testCategory, jspbEncodingOptions,
        printUnknownFields, payload, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForConformanceResponse")
public fun ConformanceResponse?.orDefault(): com.google.protobuf.conformance.ConformanceResponse = this ?: ConformanceResponse.defaultInstance

private fun ConformanceResponse.protoMergeImpl(plus: pbandk.Message?): ConformanceResponse = (plus as? ConformanceResponse)?.let {
    it.copy(
        result = plus.result ?: result,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForJspbEncodingConfig")
public fun JspbEncodingConfig?.orDefault(): com.google.protobuf.conformance.JspbEncodingConfig = this ?: JspbEncodingConfig.defaultInstance

private fun JspbEncodingConfig.protoMergeImpl(plus: pbandk.Message?): JspbEncodingConfig = (plus as? JspbEncodingConfig)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

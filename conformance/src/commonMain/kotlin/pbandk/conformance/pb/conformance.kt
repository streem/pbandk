@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.conformance.pb

import kotlinx.serialization.*
import kotlinx.serialization.json.*

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
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FailureSet> {
    override operator fun plus(other: FailureSet?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FailureSet> {
        val defaultInstance by lazy { FailureSet() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FailureSet.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FailureSet.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("failure")
        val failure: List<String> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class ConformanceRequest(
    val requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
    val messageType: String = "",
    val testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
    val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null,
    val printUnknownFields: Boolean = false,
    val payload: Payload<*>? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ConformanceRequest> {
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

    override operator fun plus(other: ConformanceRequest?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ConformanceRequest> {
        val defaultInstance by lazy { ConformanceRequest() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ConformanceRequest.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ConformanceRequest.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("protobuf_payload")
        val protobufPayload: pbandk.ByteArr? = null,
        @SerialName("json_payload")
        val jsonPayload: String? = null,
        @SerialName("requested_output_format")
        val requestedOutputFormat: String? = null,
        @SerialName("message_type")
        val messageType: String? = null,
        @SerialName("test_category")
        val testCategory: String? = null,
        @SerialName("jspb_encoding_options")
        val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig.JsonMapper? = null,
        @SerialName("jspb_payload")
        val jspbPayload: String? = null,
        @SerialName("text_payload")
        val textPayload: String? = null,
        @SerialName("print_unknown_fields")
        val printUnknownFields: Boolean? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class ConformanceResponse(
    val result: Result<*>? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ConformanceResponse> {
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

    override operator fun plus(other: ConformanceResponse?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ConformanceResponse> {
        val defaultInstance by lazy { ConformanceResponse() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ConformanceResponse.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ConformanceResponse.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("parse_error")
        val parseError: String? = null,
        @SerialName("runtime_error")
        val runtimeError: String? = null,
        @SerialName("protobuf_payload")
        val protobufPayload: pbandk.ByteArr? = null,
        @SerialName("json_payload")
        val jsonPayload: String? = null,
        @SerialName("skipped")
        val skipped: String? = null,
        @SerialName("serialize_error")
        val serializeError: String? = null,
        @SerialName("jspb_payload")
        val jspbPayload: String? = null,
        @SerialName("text_payload")
        val textPayload: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class JspbEncodingConfig(
    val useJspbArrayAnyFormat: Boolean = false,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<JspbEncodingConfig> {
    override operator fun plus(other: JspbEncodingConfig?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<JspbEncodingConfig> {
        val defaultInstance by lazy { JspbEncodingConfig() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = JspbEncodingConfig.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = JspbEncodingConfig.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("use_jspb_array_any_format")
        val useJspbArrayAnyFormat: Boolean? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun FailureSet?.orDefault() = this ?: FailureSet.defaultInstance

private fun FailureSet.protoMergeImpl(plus: FailureSet?): FailureSet = plus?.copy(
    failure = failure + plus.failure,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FailureSet.protoSizeImpl(): Int {
    var protoSize = 0
    if (failure.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * failure.size) + failure.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FailureSet.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (failure.isNotEmpty()) failure.forEach { protoMarshal.writeTag(10).writeString(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FailureSet.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FailureSet {
    var failure: pbandk.ListWithSize.Builder<String>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FailureSet(pbandk.ListWithSize.Builder.fixed(failure), protoUnmarshal.unknownFields())
        10 -> failure = protoUnmarshal.readRepeated(failure, protoUnmarshal::readString, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun FailureSet.toJsonMapperImpl(): FailureSet.JsonMapper =
    FailureSet.JsonMapper(
        failure
    )

private fun FailureSet.JsonMapper.toMessageImpl(): FailureSet =
    FailureSet(
        failure = failure ?: emptyList()
    )

private fun FailureSet.jsonMarshalImpl(json: Json): String =
    json.stringify(FailureSet.JsonMapper.serializer(), toJsonMapper())

private fun FailureSet.Companion.jsonUnmarshalImpl(json: Json, data: String): FailureSet {
    val mapper = json.parse(FailureSet.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ConformanceRequest?.orDefault() = this ?: ConformanceRequest.defaultInstance

private fun ConformanceRequest.protoMergeImpl(plus: ConformanceRequest?): ConformanceRequest = plus?.copy(
    jspbEncodingOptions = jspbEncodingOptions?.plus(plus.jspbEncodingOptions) ?: plus.jspbEncodingOptions,
    payload = plus.payload ?: payload,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ConformanceRequest.protoSizeImpl(): Int {
    var protoSize = 0
    if (requestedOutputFormat.value != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.enumSize(requestedOutputFormat)
    if (messageType.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(messageType)
    if (testCategory.value != 0) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.enumSize(testCategory)
    if (jspbEncodingOptions != null) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.messageSize(jspbEncodingOptions)
    if (printUnknownFields) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.boolSize(printUnknownFields)
    when (payload) {
        is ConformanceRequest.Payload.ProtobufPayload -> protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.bytesSize(payload.value)
        is ConformanceRequest.Payload.JsonPayload -> protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(payload.value)
        is ConformanceRequest.Payload.JspbPayload -> protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.stringSize(payload.value)
        is ConformanceRequest.Payload.TextPayload -> protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.stringSize(payload.value)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ConformanceRequest.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (payload is ConformanceRequest.Payload.ProtobufPayload) protoMarshal.writeTag(10).writeBytes(payload.value)
    if (payload is ConformanceRequest.Payload.JsonPayload) protoMarshal.writeTag(18).writeString(payload.value)
    if (requestedOutputFormat.value != 0) protoMarshal.writeTag(24).writeEnum(requestedOutputFormat)
    if (messageType.isNotEmpty()) protoMarshal.writeTag(34).writeString(messageType)
    if (testCategory.value != 0) protoMarshal.writeTag(40).writeEnum(testCategory)
    if (jspbEncodingOptions != null) protoMarshal.writeTag(50).writeMessage(jspbEncodingOptions)
    if (payload is ConformanceRequest.Payload.JspbPayload) protoMarshal.writeTag(58).writeString(payload.value)
    if (payload is ConformanceRequest.Payload.TextPayload) protoMarshal.writeTag(66).writeString(payload.value)
    if (printUnknownFields) protoMarshal.writeTag(72).writeBool(printUnknownFields)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ConformanceRequest.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ConformanceRequest {
    var requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0)
    var messageType = ""
    var testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0)
    var jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null
    var printUnknownFields = false
    var payload: ConformanceRequest.Payload<*>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ConformanceRequest(requestedOutputFormat, messageType, testCategory, jspbEncodingOptions,
            printUnknownFields, payload, protoUnmarshal.unknownFields())
        10 -> payload = ConformanceRequest.Payload.ProtobufPayload(protoUnmarshal.readBytes())
        18 -> payload = ConformanceRequest.Payload.JsonPayload(protoUnmarshal.readString())
        24 -> requestedOutputFormat = protoUnmarshal.readEnum(pbandk.conformance.pb.WireFormat.Companion)
        34 -> messageType = protoUnmarshal.readString()
        40 -> testCategory = protoUnmarshal.readEnum(pbandk.conformance.pb.TestCategory.Companion)
        50 -> jspbEncodingOptions = protoUnmarshal.readMessage(pbandk.conformance.pb.JspbEncodingConfig.Companion)
        58 -> payload = ConformanceRequest.Payload.JspbPayload(protoUnmarshal.readString())
        66 -> payload = ConformanceRequest.Payload.TextPayload(protoUnmarshal.readString())
        72 -> printUnknownFields = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun ConformanceRequest.toJsonMapperImpl(): ConformanceRequest.JsonMapper =
    ConformanceRequest.JsonMapper(
        protobufPayload,
        jsonPayload.takeIf { it != "" },
        requestedOutputFormat?.name,
        messageType.takeIf { it != "" },
        testCategory?.name,
        jspbEncodingOptions?.toJsonMapper(),
        jspbPayload.takeIf { it != "" },
        textPayload.takeIf { it != "" },
        printUnknownFields
    )

private fun ConformanceRequest.JsonMapper.toMessageImpl(): ConformanceRequest =
    ConformanceRequest(
        requestedOutputFormat = requestedOutputFormat?.let { pbandk.conformance.pb.WireFormat.fromName(it) } ?: pbandk.conformance.pb.WireFormat.fromValue(0),
        messageType = messageType ?: "",
        testCategory = testCategory?.let { pbandk.conformance.pb.TestCategory.fromName(it) } ?: pbandk.conformance.pb.TestCategory.fromValue(0),
        jspbEncodingOptions = jspbEncodingOptions?.toMessage(),
        printUnknownFields = printUnknownFields ?: false,
        payload = 
            protobufPayload?.let { value -> ConformanceRequest.Payload.ProtobufPayload(value) }
             ?: jsonPayload?.let { value -> ConformanceRequest.Payload.JsonPayload(value) }
             ?: jspbPayload?.let { value -> ConformanceRequest.Payload.JspbPayload(value) }
             ?: textPayload?.let { value -> ConformanceRequest.Payload.TextPayload(value) }
    )

private fun ConformanceRequest.jsonMarshalImpl(json: Json): String =
    json.stringify(ConformanceRequest.JsonMapper.serializer(), toJsonMapper())

private fun ConformanceRequest.Companion.jsonUnmarshalImpl(json: Json, data: String): ConformanceRequest {
    val mapper = json.parse(ConformanceRequest.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ConformanceResponse?.orDefault() = this ?: ConformanceResponse.defaultInstance

private fun ConformanceResponse.protoMergeImpl(plus: ConformanceResponse?): ConformanceResponse = plus?.copy(
    result = plus.result ?: result,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ConformanceResponse.protoSizeImpl(): Int {
    var protoSize = 0
    when (result) {
        is ConformanceResponse.Result.ParseError -> protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(result.value)
        is ConformanceResponse.Result.SerializeError -> protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.stringSize(result.value)
        is ConformanceResponse.Result.RuntimeError -> protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(result.value)
        is ConformanceResponse.Result.ProtobufPayload -> protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.bytesSize(result.value)
        is ConformanceResponse.Result.JsonPayload -> protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(result.value)
        is ConformanceResponse.Result.Skipped -> protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.stringSize(result.value)
        is ConformanceResponse.Result.JspbPayload -> protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.stringSize(result.value)
        is ConformanceResponse.Result.TextPayload -> protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.stringSize(result.value)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ConformanceResponse.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (result is ConformanceResponse.Result.ParseError) protoMarshal.writeTag(10).writeString(result.value)
    if (result is ConformanceResponse.Result.RuntimeError) protoMarshal.writeTag(18).writeString(result.value)
    if (result is ConformanceResponse.Result.ProtobufPayload) protoMarshal.writeTag(26).writeBytes(result.value)
    if (result is ConformanceResponse.Result.JsonPayload) protoMarshal.writeTag(34).writeString(result.value)
    if (result is ConformanceResponse.Result.Skipped) protoMarshal.writeTag(42).writeString(result.value)
    if (result is ConformanceResponse.Result.SerializeError) protoMarshal.writeTag(50).writeString(result.value)
    if (result is ConformanceResponse.Result.JspbPayload) protoMarshal.writeTag(58).writeString(result.value)
    if (result is ConformanceResponse.Result.TextPayload) protoMarshal.writeTag(66).writeString(result.value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ConformanceResponse.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ConformanceResponse {
    var result: ConformanceResponse.Result<*>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ConformanceResponse(result, protoUnmarshal.unknownFields())
        10 -> result = ConformanceResponse.Result.ParseError(protoUnmarshal.readString())
        18 -> result = ConformanceResponse.Result.RuntimeError(protoUnmarshal.readString())
        26 -> result = ConformanceResponse.Result.ProtobufPayload(protoUnmarshal.readBytes())
        34 -> result = ConformanceResponse.Result.JsonPayload(protoUnmarshal.readString())
        42 -> result = ConformanceResponse.Result.Skipped(protoUnmarshal.readString())
        50 -> result = ConformanceResponse.Result.SerializeError(protoUnmarshal.readString())
        58 -> result = ConformanceResponse.Result.JspbPayload(protoUnmarshal.readString())
        66 -> result = ConformanceResponse.Result.TextPayload(protoUnmarshal.readString())
        else -> protoUnmarshal.unknownField()
    }
}

private fun ConformanceResponse.toJsonMapperImpl(): ConformanceResponse.JsonMapper =
    ConformanceResponse.JsonMapper(
        parseError.takeIf { it != "" },
        runtimeError.takeIf { it != "" },
        protobufPayload,
        jsonPayload.takeIf { it != "" },
        skipped.takeIf { it != "" },
        serializeError.takeIf { it != "" },
        jspbPayload.takeIf { it != "" },
        textPayload.takeIf { it != "" }
    )

private fun ConformanceResponse.JsonMapper.toMessageImpl(): ConformanceResponse =
    ConformanceResponse(
        result = 
            parseError?.let { value -> ConformanceResponse.Result.ParseError(value) }
             ?: serializeError?.let { value -> ConformanceResponse.Result.SerializeError(value) }
             ?: runtimeError?.let { value -> ConformanceResponse.Result.RuntimeError(value) }
             ?: protobufPayload?.let { value -> ConformanceResponse.Result.ProtobufPayload(value) }
             ?: jsonPayload?.let { value -> ConformanceResponse.Result.JsonPayload(value) }
             ?: skipped?.let { value -> ConformanceResponse.Result.Skipped(value) }
             ?: jspbPayload?.let { value -> ConformanceResponse.Result.JspbPayload(value) }
             ?: textPayload?.let { value -> ConformanceResponse.Result.TextPayload(value) }
    )

private fun ConformanceResponse.jsonMarshalImpl(json: Json): String =
    json.stringify(ConformanceResponse.JsonMapper.serializer(), toJsonMapper())

private fun ConformanceResponse.Companion.jsonUnmarshalImpl(json: Json, data: String): ConformanceResponse {
    val mapper = json.parse(ConformanceResponse.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun JspbEncodingConfig?.orDefault() = this ?: JspbEncodingConfig.defaultInstance

private fun JspbEncodingConfig.protoMergeImpl(plus: JspbEncodingConfig?): JspbEncodingConfig = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun JspbEncodingConfig.protoSizeImpl(): Int {
    var protoSize = 0
    if (useJspbArrayAnyFormat) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(useJspbArrayAnyFormat)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun JspbEncodingConfig.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (useJspbArrayAnyFormat) protoMarshal.writeTag(8).writeBool(useJspbArrayAnyFormat)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun JspbEncodingConfig.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): JspbEncodingConfig {
    var useJspbArrayAnyFormat = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return JspbEncodingConfig(useJspbArrayAnyFormat, protoUnmarshal.unknownFields())
        8 -> useJspbArrayAnyFormat = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun JspbEncodingConfig.toJsonMapperImpl(): JspbEncodingConfig.JsonMapper =
    JspbEncodingConfig.JsonMapper(
        useJspbArrayAnyFormat
    )

private fun JspbEncodingConfig.JsonMapper.toMessageImpl(): JspbEncodingConfig =
    JspbEncodingConfig(
        useJspbArrayAnyFormat = useJspbArrayAnyFormat ?: false
    )

private fun JspbEncodingConfig.jsonMarshalImpl(json: Json): String =
    json.stringify(JspbEncodingConfig.JsonMapper.serializer(), toJsonMapper())

private fun JspbEncodingConfig.Companion.jsonUnmarshalImpl(json: Json, data: String): JspbEncodingConfig {
    val mapper = json.parse(JspbEncodingConfig.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

package pbandk.conformance.pb

import kotlin.jvm.Transient

sealed class WireFormat(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is WireFormat && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "WireFormat.${name ?: "UNRECOGNIZED"}(value=$value)"

    object Unspecified : WireFormat(0, "UNSPECIFIED")
    object Protobuf : WireFormat(1, "PROTOBUF")
    object Json : WireFormat(2, "JSON")
    class Unrecognized(value: Int) : WireFormat(value)

    companion object : pbandk.Message.Enum.Companion<WireFormat> {
        val values: List<WireFormat> by lazy { listOf(Unspecified, Protobuf, Json) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: Unrecognized(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No WireFormat with name: $name")
    }
}

data class ConformanceRequest(
    val requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
    val messageType: String = "",
    val payload: Payload<*>? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ConformanceRequest> {
    sealed class Payload<V>(val value: V) {
        class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Payload<pbandk.ByteArr>(protobufPayload)
        class JsonPayload(jsonPayload: String = "") : Payload<String>(jsonPayload)
    }

    val protobufPayload: pbandk.ByteArr?
        get() = (payload as? Payload.ProtobufPayload)?.value
    val jsonPayload: String?
        get() = (payload as? Payload.JsonPayload)?.value

    override operator fun plus(other: ConformanceRequest?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<ConformanceRequest> {
        val defaultInstance by lazy { ConformanceRequest() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ConformanceRequest.protoUnmarshalImpl(u)
    }
}

data class ConformanceResponse(
    val result: Result<*>? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ConformanceResponse> {
    sealed class Result<V>(val value: V) {
        class ParseError(parseError: String = "") : Result<String>(parseError)
        class SerializeError(serializeError: String = "") : Result<String>(serializeError)
        class RuntimeError(runtimeError: String = "") : Result<String>(runtimeError)
        class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Result<pbandk.ByteArr>(protobufPayload)
        class JsonPayload(jsonPayload: String = "") : Result<String>(jsonPayload)
        class Skipped(skipped: String = "") : Result<String>(skipped)
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

    override operator fun plus(other: ConformanceResponse?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<ConformanceResponse> {
        val defaultInstance by lazy { ConformanceResponse() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ConformanceResponse.protoUnmarshalImpl(u)
    }
}

fun ConformanceRequest?.orDefault() = this ?: ConformanceRequest.defaultInstance

private fun ConformanceRequest.protoMergeImpl(plus: ConformanceRequest?): ConformanceRequest = plus?.copy(
    payload = plus.payload ?: payload,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ConformanceRequest.protoSizeImpl(): Int {
    var protoSize = 0
    if (requestedOutputFormat.value != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.enumSize(requestedOutputFormat)
    if (messageType.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(messageType)
    when (payload) {
        is ConformanceRequest.Payload.ProtobufPayload -> protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.bytesSize(payload.value)
        is ConformanceRequest.Payload.JsonPayload -> protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(payload.value)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ConformanceRequest.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (payload is ConformanceRequest.Payload.ProtobufPayload) protoMarshal.writeTag(10).writeBytes(payload.value)
    if (payload is ConformanceRequest.Payload.JsonPayload) protoMarshal.writeTag(18).writeString(payload.value)
    if (requestedOutputFormat.value != 0) protoMarshal.writeTag(24).writeEnum(requestedOutputFormat)
    if (messageType.isNotEmpty()) protoMarshal.writeTag(34).writeString(messageType)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ConformanceRequest.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ConformanceRequest {
    var requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0)
    var messageType = ""
    var payload: ConformanceRequest.Payload<*>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ConformanceRequest(requestedOutputFormat, messageType, payload, protoUnmarshal.unknownFields())
        10 -> payload = ConformanceRequest.Payload.ProtobufPayload(protoUnmarshal.readBytes())
        18 -> payload = ConformanceRequest.Payload.JsonPayload(protoUnmarshal.readString())
        24 -> requestedOutputFormat = protoUnmarshal.readEnum(pbandk.conformance.pb.WireFormat.Companion)
        34 -> messageType = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
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
        else -> protoUnmarshal.unknownField()
    }
}

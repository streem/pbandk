package pbandk.conformance.pb

data class WireFormat(override val value: Int) : pbandk.Message.Enum {
    companion object : pbandk.Message.Enum.Companion<WireFormat> {
        val UNSPECIFIED = WireFormat(0)
        val PROTOBUF = WireFormat(1)
        val JSON = WireFormat(2)

        override fun fromValue(value: Int) = when (value) {
            0 -> UNSPECIFIED
            1 -> PROTOBUF
            2 -> JSON
            else -> WireFormat(value)
        }
    }
}

data class ConformanceRequest(
    val payload: Payload? = null,
    val requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
    val messageType: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ConformanceRequest> {
    sealed class Payload {
        data class ProtobufPayload(val protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Payload()
        data class JsonPayload(val jsonPayload: String = "") : Payload()
    }

    override operator fun plus(other: ConformanceRequest?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<ConformanceRequest> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ConformanceRequest.protoUnmarshalImpl(u)
    }
}

data class ConformanceResponse(
    val result: Result? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ConformanceResponse> {
    sealed class Result {
        data class ParseError(val parseError: String = "") : Result()
        data class SerializeError(val serializeError: String = "") : Result()
        data class RuntimeError(val runtimeError: String = "") : Result()
        data class ProtobufPayload(val protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Result()
        data class JsonPayload(val jsonPayload: String = "") : Result()
        data class Skipped(val skipped: String = "") : Result()
    }

    override operator fun plus(other: ConformanceResponse?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<ConformanceResponse> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ConformanceResponse.protoUnmarshalImpl(u)
    }
}

private fun ConformanceRequest.protoMergeImpl(plus: ConformanceRequest?): ConformanceRequest = plus?.copy(
    payload = plus.payload ?: payload,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ConformanceRequest.protoSizeImpl(): Int {
    var protoSize = 0
    when (payload) {
        is ConformanceRequest.Payload.ProtobufPayload -> protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.bytesSize(payload.protobufPayload)
        is ConformanceRequest.Payload.JsonPayload -> protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(payload.jsonPayload)
    }
    if (requestedOutputFormat.value != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.enumSize(requestedOutputFormat)
    if (messageType.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(messageType)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ConformanceRequest.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (payload is ConformanceRequest.Payload.ProtobufPayload) protoMarshal.writeTag(10).writeBytes(payload.protobufPayload)
    if (payload is ConformanceRequest.Payload.JsonPayload) protoMarshal.writeTag(18).writeString(payload.jsonPayload)
    if (requestedOutputFormat.value != 0) protoMarshal.writeTag(24).writeEnum(requestedOutputFormat)
    if (messageType.isNotEmpty()) protoMarshal.writeTag(34).writeString(messageType)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ConformanceRequest.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ConformanceRequest {
    var payload: ConformanceRequest.Payload? = null
    var requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0)
    var messageType = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ConformanceRequest(payload, requestedOutputFormat, messageType, protoUnmarshal.unknownFields())
        10 -> payload = ConformanceRequest.Payload.ProtobufPayload(protoUnmarshal.readBytes())
        18 -> payload = ConformanceRequest.Payload.JsonPayload(protoUnmarshal.readString())
        24 -> requestedOutputFormat = protoUnmarshal.readEnum(pbandk.conformance.pb.WireFormat.Companion)
        34 -> messageType = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun ConformanceResponse.protoMergeImpl(plus: ConformanceResponse?): ConformanceResponse = plus?.copy(
    result = plus.result ?: result,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ConformanceResponse.protoSizeImpl(): Int {
    var protoSize = 0
    when (result) {
        is ConformanceResponse.Result.ParseError -> protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(result.parseError)
        is ConformanceResponse.Result.SerializeError -> protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.stringSize(result.serializeError)
        is ConformanceResponse.Result.RuntimeError -> protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(result.runtimeError)
        is ConformanceResponse.Result.ProtobufPayload -> protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.bytesSize(result.protobufPayload)
        is ConformanceResponse.Result.JsonPayload -> protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(result.jsonPayload)
        is ConformanceResponse.Result.Skipped -> protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.stringSize(result.skipped)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ConformanceResponse.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (result is ConformanceResponse.Result.ParseError) protoMarshal.writeTag(10).writeString(result.parseError)
    if (result is ConformanceResponse.Result.RuntimeError) protoMarshal.writeTag(18).writeString(result.runtimeError)
    if (result is ConformanceResponse.Result.ProtobufPayload) protoMarshal.writeTag(26).writeBytes(result.protobufPayload)
    if (result is ConformanceResponse.Result.JsonPayload) protoMarshal.writeTag(34).writeString(result.jsonPayload)
    if (result is ConformanceResponse.Result.Skipped) protoMarshal.writeTag(42).writeString(result.skipped)
    if (result is ConformanceResponse.Result.SerializeError) protoMarshal.writeTag(50).writeString(result.serializeError)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ConformanceResponse.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ConformanceResponse {
    var result: ConformanceResponse.Result? = null
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

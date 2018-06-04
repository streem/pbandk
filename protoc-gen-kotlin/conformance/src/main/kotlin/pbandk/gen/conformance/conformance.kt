package pbandk.gen.conformance

import pbandk.*

data class WireFormat(val value: Int) {
    companion object {
        val UNSPECIFIED = WireFormat(0)
        val PROTOBUF = WireFormat(1)
        val JSON = WireFormat(2)

        fun fromValue(value: Int) = when (value) {
            0 -> UNSPECIFIED
            1 -> PROTOBUF
            2 -> JSON
            else -> WireFormat(value)
        }
    }
}

data class ConformanceRequest(
    val payload: Payload? = null,
    val requestedOutputFormat: WireFormat = WireFormat.UNSPECIFIED,
    val messageType: String = "",
    val unknownFields: Map<Int, UnknownField> = emptyMap()
) : Message<ConformanceRequest> {
    sealed class Payload {
        data class ProtobufPayload(val protobufPayload: ByteArr = ByteArr.empty) : Payload()
        data class JsonPayload(val jsonPayload: String = "") : Payload()
    }

    override operator fun plus(other: ConformanceRequest?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: Marshaller) = protoMarshalImpl(m)
    companion object : Message.Companion<ConformanceRequest> {
        override fun protoUnmarshal(u: Unmarshaller) = ConformanceRequest.protoUnmarshalImpl(u)
    }
}

data class ConformanceResponse(
    val result: Result? = null,
    val unknownFields: Map<Int, UnknownField>
) {
    sealed class Result {
        data class ParseError(val parseError: String = "") : Result()
        data class SerializeError(val serializeError: String = "") : Result()
        data class RuntimeError(val runtimeError: String = "") : Result()
        data class ProtobufPayload(val protobufPayload: ByteArr = ByteArr.empty) : Result()
        data class JsonPayload(val jsonPayload: String = "") : Result()
        data class Skipped(val skipped: String = "") : Result()
    }
}

internal fun ConformanceRequest.protoMergeImpl(plus: ConformanceRequest?): ConformanceRequest = plus?.copy(
    payload = when {
        payload is ConformanceRequest.Payload.ProtobufPayload && plus.payload is ConformanceRequest.Payload.ProtobufPayload -> {
            println(payload.protobufPayload)
            println(plus.payload.protobufPayload)
            TODO()
        }
        else ->
            plus.payload ?: payload
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

internal fun ConformanceRequest.protoSizeImpl(): Int {
    var size = 0
    when (payload) {
        is ConformanceRequest.Payload.ProtobufPayload ->
            size += Sizer.tagSize(1) + Sizer.bytesSize(payload.protobufPayload)
        is ConformanceRequest.Payload.JsonPayload ->
            size += Sizer.tagSize(2) + Sizer.stringSize(payload.jsonPayload)
    }
    if (requestedOutputFormat.value != 0)
        size += Sizer.tagSize(3) + Sizer.enumSize(requestedOutputFormat.value)
    if (messageType.isNotEmpty())
        size += Sizer.tagSize(4) + Sizer.stringSize(messageType)
    size += unknownFields.entries.sumBy { it.value.size() }
    return size
}

internal fun ConformanceRequest.protoMarshalImpl(m: Marshaller) {
    when (payload) {
        is ConformanceRequest.Payload.ProtobufPayload ->
            m.writeTag(10).writeBytes(payload.protobufPayload)
        is ConformanceRequest.Payload.JsonPayload ->
            m.writeTag(18).writeString(payload.jsonPayload)
    }
    if (requestedOutputFormat.value != 0)
        m.writeTag(24).writeEnum(requestedOutputFormat.value)
    if (messageType.isNotEmpty())
        m.writeTag(34).writeString(messageType)
    if (unknownFields.isNotEmpty())
        m.writeUnknownFields(unknownFields)
}

internal fun ConformanceRequest.Companion.protoUnmarshalImpl(u: Unmarshaller): ConformanceRequest {
    var payload: ConformanceRequest.Payload? = null
    var requestedOutputFormat: WireFormat = WireFormat.UNSPECIFIED
    var messageType = ""
    while (true) when (u.readTag()) {
        0 -> return ConformanceRequest(payload, requestedOutputFormat, messageType, u.unknownFields())
        10 -> payload = ConformanceRequest.Payload.ProtobufPayload(u.readBytes())
        18 -> payload = ConformanceRequest.Payload.JsonPayload(u.readString())
        24 -> requestedOutputFormat = WireFormat.fromValue(u.readEnum())
        34 -> messageType = u.readString()
        else -> u.unknownField()
    }
}
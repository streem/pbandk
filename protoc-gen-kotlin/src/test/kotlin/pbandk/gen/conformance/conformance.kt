package pbandk.gen.conformance

import pbandk.*

data class WireFormat(val value: Int) {
    companion object {
        val UNSPECIFIED = WireFormat(0)
        val PROTOBUF = WireFormat(1)
        val JSON = WireFormat(2)

        val knownValues = mapOf(0 to UNSPECIFIED, 1 to PROTOBUF, 2 to JSON)
    }
}

data class ConformanceRequest(
    val payload: Payload? = null,
    val requestedOutputFormat: WireFormat = WireFormat.UNSPECIFIED,
    val messageType: String = "",
    val unknownFields: Map<Int, UnknownField> = emptyMap()
) : Message {
    sealed class Payload {
        data class ProtobufPayload(val protobufPayload: ByteArr = ByteArr.empty) : Payload()
        data class JsonPayload(val jsonPayload: String = "") : Payload()
    }

    override fun size() = sizeImpl()
    override fun marshal(m: Marshaller) = marshalImpl(m)
    companion object : Message.Companion<ConformanceRequest> {
        override fun unmarshal(u: Unmarshaller) = ConformanceRequest.unmarshalImpl(u)
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

internal fun ConformanceRequest.sizeImpl(): Int = TODO()

internal fun ConformanceRequest.marshalImpl(m: Marshaller): Marshaller = TODO()

internal fun ConformanceRequest.Companion.unmarshalImpl(u: Unmarshaller): ConformanceRequest {
    var payload: ConformanceRequest.Payload? = null
    var requestedOutputFormat: WireFormat = WireFormat.UNSPECIFIED
    var messageType = ""
    while (true) when (u.readTag()) {
        0 -> return ConformanceRequest(payload, requestedOutputFormat, messageType, u.unknownFields())
        10 -> payload = ConformanceRequest.Payload.ProtobufPayload(u.readBytes())
        18 -> payload = ConformanceRequest.Payload.JsonPayload(u.readString())
        24 -> requestedOutputFormat = u.readEnum(WireFormat.knownValues, ::WireFormat)
        34 -> messageType = u.readString()
        else -> u.unknownField()
    }
}
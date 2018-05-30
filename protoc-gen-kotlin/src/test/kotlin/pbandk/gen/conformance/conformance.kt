package pbandk.gen.conformance

import pbandk.*

data class WireFormat(override val value: Int) : Enumerate {
    companion object : Enumerate.Marshaller<WireFormat> {
        val UNSPECIFIED = WireFormat(0)
        val PROTOBUF = WireFormat(1)
        val JSON = WireFormat(2)
    }
}

data class ConformanceRequest(
    val payload: Payload? = null,
    val requestedOutputFormat: WireFormat = WireFormat.UNSPECIFIED,
    val messageType: String = "",
    val unrecognizedFields: Map<Int, ByteArray> = emptyMap()
) : Message {
    sealed class Payload : OneOf {
        data class ProtobufPayload(val protobufPayload: ByteArr = ByteArr.empty) : Payload(), OneOf.Message {
            companion object : OneOf.Message.Marshaller<ProtobufPayload>
        }
        data class JsonPayload(val jsonPayload: String = "") : Payload(), OneOf.Message {
            companion object : OneOf.Message.Marshaller<JsonPayload>
        }

        companion object : OneOf.Marshaller<Payload> {
            override val entries: Map<Int, OneOf.Message.Marshaller<out Payload>> =
                mapOf(1 to ProtobufPayload.Companion, 2 to JsonPayload.Companion)
        }
    }

    override fun marshal(bld: ByteBuilder) = ConformanceRequest.marshal(bld, this)
    companion object : Message.Marshaller<ConformanceRequest> {
        override fun marshal(bld: ByteBuilder, msg: ConformanceRequest) = bld.buildMessage {
            bld.append(msg.payload, Payload.Companion).
                append(msg.requestedOutputFormat, 3).
                append(msg.messageType, 4)
        }

        override fun unmarshal(rdr: ByteReader) = rdr.readMessage {
            ConformanceRequest(
                rdr.read(Payload.Companion),
                rdr.read(WireFormat.Companion, 3),
                rdr.readString(4),
                rdr.unreadFields()
            )
        }
    }
}

data class ConformanceResponse(
    val result: Result? = null
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
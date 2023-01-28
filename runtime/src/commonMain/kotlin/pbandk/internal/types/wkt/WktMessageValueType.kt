package pbandk.internal.types.wkt

import pbandk.Message
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.internal.types.MessageValueType

internal abstract class WktMessageValueType<M : Message>(
    companion: Message.Companion<M>
) : MessageValueType<M>(companion), WktValueType<M, M> {
    override fun encodeMessageToJson(message: M, encoder: JsonFieldValueEncoder) {
        encodeToJson(message, encoder)
    }

    override fun decodeMessageFromJson(decoder: JsonFieldValueDecoder): M {
        return decodeFromJson(decoder)
    }
}
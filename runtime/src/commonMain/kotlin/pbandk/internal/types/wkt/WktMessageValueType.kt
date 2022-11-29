package pbandk.internal.types.wkt

import pbandk.Message
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.types.MessageValueType

internal abstract class WktMessageValueType<M : Message> : MessageValueType<M>(), WktValueType<M, M> {
    override fun encodeMessageToJson(message: M, encoder: JsonFieldValueEncoder) {
        encodeToJson(message, encoder)
    }
}
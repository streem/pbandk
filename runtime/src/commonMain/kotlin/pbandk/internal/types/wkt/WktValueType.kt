package pbandk.internal.types.wkt

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.Message
import pbandk.types.ValueType

internal interface WktValueType<KotlinType : kotlin.Any, MessageType : Message> : ValueType<KotlinType> {
    /** Used primarily when this message is stored inside a `google.protobuf.Any`. */
    fun encodeMessageToJson(message: MessageType, encoder: JsonFieldValueEncoder)
}
package pbandk.internal.types.wkt

import pbandk.json.JsonFieldValueEncoder
import pbandk.Message
import pbandk.json.JsonFieldValueDecoder
import pbandk.types.ValueType

internal interface WktValueType<KotlinType : kotlin.Any, MessageType : Message> : ValueType<KotlinType> {
    val companion: Message.Companion<MessageType>

    /** Used primarily when this message is stored inside a `google.protobuf.Any`. */
    fun encodeMessageToJson(message: MessageType, encoder: JsonFieldValueEncoder)

    /** Used primarily when this message is stored inside a `google.protobuf.Any`. */
    fun decodeMessageFromJson(decoder: JsonFieldValueDecoder): MessageType
}

internal val customJsonMappings: Map<Message.Companion<*>, WktValueType<*, *>> = mapOf(
    pbandk.wkt.Any to Any,
    pbandk.wkt.BoolValue to BoolValue,
    pbandk.wkt.BytesValue to BytesValue,
    pbandk.wkt.DoubleValue to DoubleValue,
    pbandk.wkt.Duration to Duration,
    pbandk.wkt.FloatValue to FloatValue,
    pbandk.wkt.Int32Value to Int32Value,
    pbandk.wkt.Int64Value to Int64Value,
    pbandk.wkt.ListValue to ListValue,
    pbandk.wkt.StringValue to StringValue,
    pbandk.wkt.Struct to Struct,
    pbandk.wkt.Timestamp to Timestamp,
    pbandk.wkt.UInt32Value to UInt32Value,
    pbandk.wkt.UInt64Value to UInt64Value,
    pbandk.wkt.Value to Value,
)
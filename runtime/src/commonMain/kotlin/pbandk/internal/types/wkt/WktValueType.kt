package pbandk.internal.types.wkt

import pbandk.json.JsonFieldValueEncoder
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.json.JsonFieldValueDecoder
import pbandk.types.ValueType

internal interface WktValueType<KotlinType : kotlin.Any, MessageType : Message> : ValueType<KotlinType> {
    /** Used primarily when this message is stored inside a `google.protobuf.Any`. */
    fun encodeMessageToJson(message: MessageType, encoder: JsonFieldValueEncoder)
    /** Used primarily when this message is stored inside a `google.protobuf.Any`. */
    fun decodeMessageFromJson(decoder: JsonFieldValueDecoder): MessageType
}

internal val customJsonMappings: Map<MessageDescriptor<*>, WktValueType<*, *>> = mapOf(
    pbandk.wkt.Any.descriptor to Any,
    pbandk.wkt.BoolValue.descriptor to BoolValue,
    pbandk.wkt.BytesValue.descriptor to BytesValue,
    pbandk.wkt.DoubleValue.descriptor to DoubleValue,
    pbandk.wkt.Duration.descriptor to Duration,
    pbandk.wkt.FloatValue.descriptor to FloatValue,
    pbandk.wkt.Int32Value.descriptor to Int32Value,
    pbandk.wkt.Int64Value.descriptor to Int64Value,
    pbandk.wkt.ListValue.descriptor to ListValue,
    pbandk.wkt.StringValue.descriptor to StringValue,
    pbandk.wkt.Struct.descriptor to Struct,
    pbandk.wkt.Timestamp.descriptor to Timestamp,
    pbandk.wkt.UInt32Value.descriptor to UInt32Value,
    pbandk.wkt.UInt64Value.descriptor to UInt64Value,
    pbandk.wkt.Value.descriptor to Value,
)
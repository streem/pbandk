package pbandk.internal.types

import pbandk.FieldDescriptor
import pbandk.internal.json.JsonFieldEncoder
import pbandk.MessageDescriptor
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.types.wkt.Any
import pbandk.internal.types.wkt.BoolValue
import pbandk.internal.types.wkt.BytesValue
import pbandk.internal.types.wkt.DoubleValue
import pbandk.internal.types.wkt.Duration
import pbandk.internal.types.wkt.FloatValue
import pbandk.internal.types.wkt.Int32Value
import pbandk.internal.types.wkt.Int64Value
import pbandk.internal.types.wkt.ListValue
import pbandk.internal.types.wkt.StringValue
import pbandk.internal.types.wkt.Struct
import pbandk.internal.types.wkt.Timestamp
import pbandk.internal.types.wkt.UInt32Value
import pbandk.internal.types.wkt.UInt64Value
import pbandk.internal.types.wkt.Value
import pbandk.internal.types.wkt.WktValueType

// Helper function to make the generic type checker happy
internal fun <M : pbandk.Message, V> encodeMessageField(
    message: M,
    fieldDescriptor: FieldDescriptor<M, V>,
    encoder: BinaryFieldEncoder,
) {
    with(fieldDescriptor) {
        fieldType.encodeToBinary(metadata, accessor.getValue(message), encoder)
    }
}

// Helper function to make the generic type checker happy
internal fun <M : pbandk.Message, V> encodeMessageField(
    message: M,
    fieldDescriptor: FieldDescriptor<M, V>,
    encoder: JsonFieldEncoder,
) {
    with(fieldDescriptor) {
        fieldType.encodeToJson(metadata, accessor.getValue(message), encoder)
    }
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
package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.ListValue

internal object ListValue : WktMessageValueType<ListValue>(ListValue) {
    override fun encodeToJson(value: ListValue, encoder: JsonFieldValueEncoder) {
        encoder.encodeArray { valueEncoder ->
            value.values.forEach { Value.encodeToJson(it, valueEncoder) }
        }
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): ListValue {
        if (decoder !is JsonFieldValueDecoder.Array) {
            throw InvalidProtocolBufferException("Unexpected JSON type for google.protobuf.ListValue value: ${decoder.wireType.name}")
        }
        return ListValue {
            decoder.forEachValue { valueDecoder ->
                values.add(Value.decodeFromJson(valueDecoder))
            }
        }
    }
}
package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.internal.types.MessageValueType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.ListValue

internal object ListValue : MessageValueType<ListValue>(ListValue) {
    override fun encodeToJson(value: ListValue, encoder: JsonFieldValueEncoder) {
        encoder.encodeArrayWithValues(value.values) { arrayValue, arrayValueEncoder ->
            Value.encodeToJson(arrayValue, arrayValueEncoder)
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
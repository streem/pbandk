package pbandk.internal.types.wkt

import pbandk.internal.types.MessageValueType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.NullValue
import pbandk.wkt.Value

internal object Value : MessageValueType<Value>(Value) {
    override fun encodeToJson(value: Value, encoder: JsonFieldValueEncoder) {
        when (val kind = value.kind) {
            is Value.Kind.StringValue -> encoder.encodeString(kind.value)
            is Value.Kind.BoolValue -> encoder.encodeBoolean(kind.value)
            is Value.Kind.NumberValue -> encoder.encodeNumberDouble(kind.value)
            is Value.Kind.StructValue -> Struct.encodeToJson(kind.value, encoder)
            is Value.Kind.ListValue -> ListValue.encodeToJson(kind.value, encoder)
            is Value.Kind.NullValue, null -> encoder.encodeNull()
        }
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Value = when (decoder) {
        is JsonFieldValueDecoder.String -> Value { stringValue = decoder.decodeAsString() }
        is JsonFieldValueDecoder.Boolean -> Value { boolValue = decoder.decodeAsBoolean() }
        is JsonFieldValueDecoder.Number -> Value { numberValue = decoder.decodeAsDouble() }
        is JsonFieldValueDecoder.Object -> Value { structValue = Struct.decodeFromJson(decoder) }
        is JsonFieldValueDecoder.Array -> Value { listValue = ListValue.decodeFromJson(decoder) }
        is JsonFieldValueDecoder.Null -> Value {
            decoder.consumeNull()
            nullValue = NullValue.NULL_VALUE
        }
    }
}
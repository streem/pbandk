package pbandk.internal.types.wkt

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.wkt.Value

internal object Value : WktMessageValueType<Value>() {
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
}
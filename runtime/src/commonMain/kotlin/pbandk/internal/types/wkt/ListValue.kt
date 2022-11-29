package pbandk.internal.types.wkt

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.wkt.ListValue

internal object ListValue : WktMessageValueType<ListValue>() {
    override fun encodeToJson(value: ListValue, encoder: JsonFieldValueEncoder) {
        encoder.encodeArray { valueEncoder ->
            value.values.forEach { Value.encodeToJson(it, valueEncoder) }
        }
    }
}
package pbandk.internal.types.wkt

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.wkt.Struct

internal object Struct : WktMessageValueType<Struct>() {
    override fun encodeToJson(value: Struct, encoder: JsonFieldValueEncoder) {
        encoder.encodeObject { fieldEncoder ->
            value.fields.forEach { (k, v) ->
                fieldEncoder.encodeField(k) { valueEncoder ->
                    Value.encodeToJson(v, valueEncoder)
                }
            }
        }
    }
}
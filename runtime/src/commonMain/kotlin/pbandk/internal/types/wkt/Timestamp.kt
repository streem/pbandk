package pbandk.internal.types.wkt

import pbandk.internal.Util
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.wkt.Timestamp

internal object Timestamp : WktMessageValueType<Timestamp>() {
    override fun encodeToJson(value: Timestamp, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(Util.timestampToString(value))
    }
}
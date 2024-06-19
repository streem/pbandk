package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.internal.PlatformUtil
import pbandk.internal.types.MessageValueType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.Timestamp

internal object Timestamp : MessageValueType<Timestamp>(Timestamp) {
    override fun encodeToJson(value: Timestamp, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(PlatformUtil.timestampToString(value))
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Timestamp {
        if (decoder !is JsonFieldValueDecoder.String) {
            throw InvalidProtocolBufferException("Unexpected JSON type for google.protobuf.Timestamp value: ${decoder.wireType.name}")
        }
        return PlatformUtil.stringToTimestamp(decoder.decodeAsString())
    }
}
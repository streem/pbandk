package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object SFixed64 : PrimitiveValueType<Long>() {
    override val defaultValue: Long = 0L

    override fun isDefaultValue(value: Long) = value == 0L

    override val binaryWireType = WireType.FIXED64

    override fun binarySize(value: Long) = WireValue.I64.encodeSignedLong(value).size

    override fun encodeToBinary(value: Long, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI64(WireValue.I64.encodeSignedLong(value))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Long {
        if (decoder !is BinaryFieldValueDecoder.I64) {
            throw InvalidProtocolBufferException("Unexpected wire type for sfixed64 value: ${decoder.wireType}")
        }
        return decoder.decodeValue().decodeSignedLong
    }

    override fun encodeToJson(value: Long, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberSignedLong(value)
    }

    override fun encodeToJsonMapKey(value: Long) = value.toString()

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Long = when (decoder) {
        is JsonFieldValueDecoder.Number -> decoder.decodeAsSignedLong()
        is JsonFieldValueDecoder.String -> decoder.decodeAsSignedLong()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for sfixed64 value: ${decoder.wireType.name}")
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) = decoder.decodeAsSignedLong()
}
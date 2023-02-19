package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object Fixed64 : PrimitiveValueType<Long>() {
    override val defaultValue: Long = 0L

    override fun isDefaultValue(value: Long) = value == 0L

    override val binaryWireType = WireType.FIXED64

    override fun binarySize(value: Long) = WireValue.I64.encodeUnsignedLong(value.toULong()).size

    override fun encodeToBinary(value: Long, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI64(WireValue.I64.encodeUnsignedLong(value.toULong()))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Long {
        return decoder.decodeI64().decodeUnsignedLong.toLong()
    }

    override fun encodeToJson(value: Long, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberUnsignedLong(value)
    }

    override fun encodeToJsonMapKey(value: Long) = value.toULong().toString()

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Long = when (decoder) {
        is JsonFieldValueDecoder.Number -> decoder.decodeAsUnsignedLong()
        is JsonFieldValueDecoder.String -> decoder.decodeAsUnsignedLong()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for fixed64 value: ${decoder.wireType.name}")
    }.toLong()

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        decoder.decodeAsUnsignedLong().toLong()
}
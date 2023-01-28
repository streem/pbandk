package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.binary.WireType
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object UInt64 : PrimitiveValueType<Long>() {
    override val defaultValue: Long = 0

    override fun isDefaultValue(value: Long) = value == 0L

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Long) = Sizer.uInt64Size(value)

    override fun encodeToBinary(value: Long, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarint(WireValue.Varint.encodeUnsignedLong(value.toULong()))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Long {
        return decoder.decodeVarint().decodeUnsignedLong.toLong()
    }

    override fun encodeToJson(value: Long, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberUnsignedLong(value)
    }

    override fun encodeToJsonMapKey(value: Long) = value.toULong().toString()

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Long = when (decoder) {
        is JsonFieldValueDecoder.Number -> decoder.decodeAsUnsignedLong()
        is JsonFieldValueDecoder.String -> decoder.decodeAsUnsignedLong()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for uint64 value: ${decoder.wireType.name}")
    }.toLong()

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) = decoder.decodeAsUnsignedLong().toLong()
}
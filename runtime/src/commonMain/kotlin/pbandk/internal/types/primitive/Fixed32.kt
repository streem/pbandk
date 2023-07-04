package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object Fixed32 : PrimitiveValueType<Int>() {
    override val defaultValue: Int = 0

    override fun isDefaultValue(value: Int) = value == 0

    override val binaryWireType = WireType.FIXED32

    override fun binarySize(value: Int) = WireValue.I32.encodeUnsignedInt(value.toUInt()).size

    override fun encodeToBinary(value: Int, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI32(WireValue.I32.encodeUnsignedInt(value.toUInt()))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Int {
        if (decoder !is BinaryFieldValueDecoder.I32) {
            throw InvalidProtocolBufferException("Unexpected wire type for fixed32 value: ${decoder.wireType}")
        }
        return decoder.decodeValue().decodeUnsignedInt.toInt()
    }

    override fun encodeToJson(value: Int, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberUnsignedInt(value)
    }

    override fun encodeToJsonMapKey(value: Int) = value.toUInt().toString()

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Int = when (decoder) {
        is JsonFieldValueDecoder.Number -> decoder.decodeAsUnsignedInt()
        is JsonFieldValueDecoder.String -> decoder.decodeAsUnsignedInt()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for fixed32 value: ${decoder.wireType.name}")
    }.toInt()

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) = decoder.decodeAsUnsignedInt().toInt()
}
package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object SFixed32 : PrimitiveValueType<Int>() {
    override val defaultValue: Int = 0

    override fun isDefaultValue(value: Int) = value == 0

    override val binaryWireType = WireType.FIXED32

    override fun binarySize(value: Int) = WireValue.I32.encodeSignedInt(value).size

    override fun encodeToBinary(value: Int, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI32(WireValue.I32.encodeSignedInt(value))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Int {
        if (decoder !is BinaryFieldValueDecoder.I32) {
            throw InvalidProtocolBufferException("Unexpected wire type for sfixed32 value: ${decoder.wireType}")
        }
        return decoder.decodeValue().decodeSignedInt
    }

    override fun encodeToJson(value: Int, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberSignedInt(value)
    }

    override fun encodeToJsonMapKey(value: Int) = value.toString()

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Int = when (decoder) {
        is JsonFieldValueDecoder.Number -> decoder.decodeAsSignedInt()
        is JsonFieldValueDecoder.String -> decoder.decodeAsSignedInt()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for sfixed32 value: ${decoder.wireType.name}")
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) = decoder.decodeAsSignedInt()
}
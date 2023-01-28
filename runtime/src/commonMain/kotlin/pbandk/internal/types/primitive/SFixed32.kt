package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.binary.WireType
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder

internal object SFixed32 : PrimitiveValueType<Int>() {
    override val defaultValue: Int = 0

    override fun isDefaultValue(value: Int) = value == 0

    override val binaryWireType = WireType.FIXED32

    override fun binarySize(value: Int) = Sizer.sFixed32Size(value)

    override fun encodeToBinary(value: Int, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI32(WireValue.I32.encodeSignedInt(value))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Int {
        return decoder.decodeI32().decodeSignedInt
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
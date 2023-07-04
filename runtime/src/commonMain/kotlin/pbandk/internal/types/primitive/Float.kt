package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import kotlin.Float

internal object Float : PrimitiveValueType<Float>() {
    override val defaultValue: Float = 0.0f

    override fun isDefaultValue(value: Float) = value == 0.0f

    override val binaryWireType = WireType.FIXED32

    override fun binarySize(value: Float) = WireValue.I32.encodeFloat(value).size

    override fun encodeToBinary(value: Float, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI32(WireValue.I32.encodeFloat(value))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Float {
        if (decoder !is BinaryFieldValueDecoder.I32) {
            throw InvalidProtocolBufferException("Unexpected wire type for float value: ${decoder.wireType}")
        }
        return decoder.decodeValue().decodeFloat
    }

    override fun encodeToJson(value: Float, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberFloat(value)
    }

    override fun encodeToJsonMapKey(value: Float) =
        throw UnsupportedOperationException("float values cannot be used as map keys")

    override fun decodeFromJson(decoder: JsonFieldValueDecoder) = when (decoder) {
        is JsonFieldValueDecoder.String -> decoder.decodeAsFloat()
        is JsonFieldValueDecoder.Number -> decoder.decodeAsFloat()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for double value: ${decoder.wireType.name}")
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        throw UnsupportedOperationException("Float values cannot be used as map keys")
}
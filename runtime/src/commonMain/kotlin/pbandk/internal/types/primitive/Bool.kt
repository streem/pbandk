package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object Bool : PrimitiveValueType<Boolean>() {
    override val defaultValue: Boolean = false

    override fun isDefaultValue(value: Boolean) = !value

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Boolean) = WireValue.Varint.encodeBoolean(value).size

    override fun encodeToBinary(value: Boolean, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarint(WireValue.Varint.encodeBoolean(value))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Boolean {
        if (decoder !is BinaryFieldValueDecoder.Varint) {
            throw InvalidProtocolBufferException("Unexpected wire type for bool value: ${decoder.wireType}")
        }
        return decoder.decodeValue().decodeBoolean
    }

    override fun encodeToJson(value: Boolean, encoder: JsonFieldValueEncoder) {
        encoder.encodeBoolean(value)
    }

    override fun encodeToJsonMapKey(value: Boolean) = value.toString()

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Boolean = when (decoder) {
        is JsonFieldValueDecoder.Boolean -> decoder.decodeAsBoolean()
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for bool value: ${decoder.wireType.name}")
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) = decoder.decodeAsBoolean()
}
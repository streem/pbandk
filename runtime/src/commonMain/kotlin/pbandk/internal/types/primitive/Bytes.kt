package pbandk.internal.types.primitive

import pbandk.ByteArr
import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.internal.PlatformUtil
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal object Bytes : PrimitiveValueType<ByteArr>() {
    override val defaultValue: ByteArr = ByteArr.empty

    override fun isDefaultValue(value: ByteArr) = value.array.isEmpty()

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: ByteArr) = WireValue.Len.encodeByteArray(value.array).size

    override fun encodeToBinary(value: ByteArr, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLen(WireValue.Len.encodeByteArray(value.array))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): ByteArr {
        if (decoder !is BinaryFieldValueDecoder.Len) {
            throw InvalidProtocolBufferException("Unexpected wire type for bytes value: ${decoder.wireType}")
        }
        return ByteArr(decoder.decodeValue().decodeByteArray)
    }

    override fun encodeToJson(value: ByteArr, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(PlatformUtil.bytesToBase64(value.array))
    }

    override fun encodeToJsonMapKey(value: ByteArr) =
        throw UnsupportedOperationException("bytes values cannot be used as map keys")

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): ByteArr = when (decoder) {
        is JsonFieldValueDecoder.String -> ByteArr(decoder.decodeAsByteArray())
        else -> throw InvalidProtocolBufferException("Unexpected JSON type for bytes value: ${decoder.wireType.name}")
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        throw UnsupportedOperationException("bytes values cannot be used as map keys")
}
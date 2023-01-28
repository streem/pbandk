package pbandk.internal.types.primitive

import pbandk.ByteArr
import pbandk.InvalidProtocolBufferException
import pbandk.json.JsonFieldValueEncoder
import pbandk.internal.Util
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.binary.WireType
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder

internal object Bytes : PrimitiveValueType<ByteArr>() {
    override val defaultValue: ByteArr = ByteArr.empty

    override fun isDefaultValue(value: ByteArr) = value.array.isEmpty()

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: ByteArr) = Sizer.bytesSize(value)

    override fun encodeToBinary(value: ByteArr, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLen(WireValue.Len.encodeByteArray(value.array))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): ByteArr {
        return ByteArr(decoder.decodeLen().decodeByteArray)
    }

    override fun encodeToJson(value: ByteArr, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(Util.bytesToBase64(value.array))
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
package pbandk.internal.types.primitive

import pbandk.ByteArr
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.Util
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType

internal object Bytes : PrimitiveValueType<ByteArr>() {
    override fun isDefaultValue(value: ByteArr) = value.array.isEmpty()

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: ByteArr) = Sizer.bytesSize(value)

    override fun encodeToBinary(value: ByteArr, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLenByteArray(value.array)
    }

    override fun encodeToJson(value: ByteArr, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(Util.bytesToBase64(value.array))
    }

    override fun encodeToJsonMapKey(value: ByteArr) =
        throw UnsupportedOperationException("bytes cannot be used as map keys")
}
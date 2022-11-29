package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType

internal object SInt64 : ValueType<Long> {
    override fun isDefaultValue(value: Long) = value == 0L

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Long) = Sizer.sInt64Size(value)

    override fun encodeToBinary(value: Long, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarintZigZagLong(value)
    }

    override fun encodeToJson(value: Long, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberSignedLong(value)
    }

    override fun encodeToJsonMapKey(value: Long) = value.toString()
}
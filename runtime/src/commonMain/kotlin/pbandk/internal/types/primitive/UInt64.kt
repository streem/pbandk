package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType

internal object UInt64 : PrimitiveValueType<Long>() {
    override fun isDefaultValue(value: Long) = value == 0L

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Long) = Sizer.uInt64Size(value)

    override fun encodeToBinary(value: Long, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarintUnsignedLong(value)
    }

    override fun encodeToJson(value: Long, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberUnsignedLong(value)
    }

    override fun encodeToJsonMapKey(value: Long) = value.toULong().toString()
}
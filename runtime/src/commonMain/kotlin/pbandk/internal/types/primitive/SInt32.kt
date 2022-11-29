package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType

internal object SInt32 : PrimitiveValueType<Int>() {
    override fun isDefaultValue(value: Int) = value == 0

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Int) = Sizer.sInt32Size(value)

    override fun encodeToBinary(value: Int, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarintZigZagInt(value)
    }

    override fun encodeToJson(value: Int, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberSignedInt(value)
    }

    override fun encodeToJsonMapKey(value: Int) = value.toString()
}
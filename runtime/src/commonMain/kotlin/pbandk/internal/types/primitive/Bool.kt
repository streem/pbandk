package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType

internal object Bool : PrimitiveValueType<Boolean>() {
    override fun isDefaultValue(value: Boolean) = !value

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Boolean) = Sizer.boolSize(value)

    override fun encodeToBinary(value: Boolean, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarintBoolean(value)
    }

    override fun encodeToJson(value: Boolean, encoder: JsonFieldValueEncoder) {
        encoder.encodeBoolean(value)
    }

    override fun encodeToJsonMapKey(value: Boolean) = value.toString()
}
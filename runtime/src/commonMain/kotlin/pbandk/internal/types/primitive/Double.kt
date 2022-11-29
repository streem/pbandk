package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType
import kotlin.Double

internal object Double : PrimitiveValueType<Double>() {
    override fun isDefaultValue(value: Double) = value == 0.0

    override val binaryWireType = WireType.FIXED64

    override fun binarySize(value: Double) = Sizer.doubleSize(value)

    override fun encodeToBinary(value: Double, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI64Double(value)
    }

    override fun encodeToJson(value: Double, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberDouble(value)
    }

    override fun encodeToJsonMapKey(value: Double) = value.toString()
}
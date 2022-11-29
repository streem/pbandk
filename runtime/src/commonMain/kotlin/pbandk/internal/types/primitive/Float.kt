package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType
import kotlin.Float

internal object Float : ValueType<Float> {
    override fun isDefaultValue(value: Float) = value == 0.0f

    override val binaryWireType = WireType.FIXED32

    override fun binarySize(value: Float) = Sizer.floatSize(value)

    override fun encodeToBinary(value: Float, encoder: BinaryFieldValueEncoder) {
        encoder.encodeI32Float(value)
    }

    override fun encodeToJson(value: Float, encoder: JsonFieldValueEncoder) {
        encoder.encodeNumberFloat(value)
    }

    override fun encodeToJsonMapKey(value: Float) = value.toString()
}
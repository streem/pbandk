package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType
import kotlin.String

internal object String : ValueType<String> {
    override fun isDefaultValue(value: String) = value.isEmpty()

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: String) = Sizer.stringSize(value)

    override fun encodeToBinary(value: String, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLenString(value)
    }

    override fun encodeToJson(value: String, encoder: JsonFieldValueEncoder) {
        @Suppress("DEPRECATION")
        if (encoder.jsonConfig.outputDefaultValues &&
            encoder.jsonConfig.outputDefaultStringsAsNull &&
            value.isEmpty()
        ) {
            encoder.encodeNull()
        } else {
            encoder.encodeString(value)
        }
    }

    override fun encodeToJsonMapKey(value: String) = value
}
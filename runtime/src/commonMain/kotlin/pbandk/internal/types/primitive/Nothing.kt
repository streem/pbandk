package pbandk.internal.types.primitive

import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.types.ValueType
import kotlin.String

/**
 * This object only exists to make it easier to define [pbandk.gen.ListField.empty]. It
 * should not be used for other purposes.
 */
internal object Nothing : ValueType<Nothing> {
    override val defaultValue: Nothing
        get() = throw UnsupportedOperationException()
    override val binaryWireType: WireType
        get() = throw UnsupportedOperationException()

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): Nothing {
        throw UnsupportedOperationException()
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Nothing {
        throw UnsupportedOperationException()
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String): Nothing {
        throw UnsupportedOperationException()
    }

    override fun encodeToJsonMapKey(value: Nothing): String {
        throw UnsupportedOperationException()
    }

    override fun encodeToJson(value: Nothing, encoder: JsonFieldValueEncoder) {}

    override fun encodeToBinary(value: Nothing, encoder: BinaryFieldValueEncoder) {}

    override fun binarySize(value: Nothing) = 0

    override fun mergeValues(currentValue: Nothing, newValue: Nothing) = newValue

    override fun isDefaultValue(value: Nothing) = false
}
package pbandk.internal.types.wkt

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Tag
import pbandk.internal.types.primitive.Message
import pbandk.types.ValueType

internal abstract class WktWrapperValueType<T : kotlin.Any, M : pbandk.Message>(
    private val wrappedValueType: ValueType<T>,
    private val wrappedValueSizerFn: (T) -> Int,
    private val wrappedValueAccessor: (M) -> T,
) : WktValueType<T, M> {
    override fun isDefaultValue(value: T) = false

    override fun mergeValues(value: T, otherValue: T) = otherValue

    override val binaryWireType = Message.binaryWireType

    override fun binarySize(value: T) =
        if (wrappedValueType.isDefaultValue(value)) 0 else 1 + wrappedValueSizerFn(value)

    override fun encodeToBinary(value: T, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLenFields(binarySize(value)) { fieldEncoder ->
            if (wrappedValueType.isDefaultValue(value)) return@encodeLenFields

            fieldEncoder.encodeField(Tag(1, wrappedValueType.binaryWireType)) { valueEncoder ->
                wrappedValueType.encodeToBinary(value, valueEncoder)
            }
        }
    }

    override fun encodeToJson(value: T, encoder: JsonFieldValueEncoder) {
        wrappedValueType.encodeToJson(value, encoder)
    }

    override fun encodeMessageToJson(message: M, encoder: JsonFieldValueEncoder) {
        encodeToJson(wrappedValueAccessor(message), encoder)
    }

    override fun encodeToJsonMapKey(value: T) = wrappedValueType.encodeToJsonMapKey(value)
}
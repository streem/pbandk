package pbandk.internal.types.wkt

import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.tryDecodeField
import pbandk.internal.binary.WireValue
import pbandk.internal.types.primitive.PrimitiveValueType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

internal abstract class WktWrapperValueType<T : kotlin.Any, M : Message>(
    private val wrapperFieldDescriptor: FieldDescriptor<M, T>,
    private val wrappedValueType: PrimitiveValueType<T>,
) : WktValueType<T, M> {
    override val companion: Message.Companion<M> = wrapperFieldDescriptor.messageDescriptor.messageCompanion

    override val defaultValue: T = wrappedValueType.defaultValue

    override fun isDefaultValue(value: T) = false

    override fun mergeValues(currentValue: T, newValue: T) = newValue

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: T) = WireValue.Len.sizeWithLenPrefix(
        wrapperFieldDescriptor.fieldType.binarySize(wrapperFieldDescriptor.metadata, value)
    )

    override fun encodeToBinary(value: T, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLenFields(
            wrapperFieldDescriptor.fieldType.binarySize(wrapperFieldDescriptor.metadata, value)
        ) { fieldEncoder ->
            wrapperFieldDescriptor.fieldType.encodeToBinary(wrapperFieldDescriptor.metadata, value, fieldEncoder)
        }
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): T {
        if (decoder !is BinaryFieldValueDecoder.Len) {
            throw InvalidProtocolBufferException("Unexpected wire type for message value: ${decoder.wireType}")
        }
        return decoder.decodeFields { fieldDecoder ->
            var value: T = wrappedValueType.defaultValue
            fieldDecoder.forEachField { fieldNumber, valueDecoder ->
                when {
                    valueDecoder.tryDecodeField(wrapperFieldDescriptor, fieldNumber) { value = it } -> {}
                    else -> valueDecoder.skipValue()
                }
            }
            value
        }
    }

    override fun encodeToJson(value: T, encoder: JsonFieldValueEncoder) {
        wrappedValueType.encodeToJson(value, encoder)
    }

    override fun encodeMessageToJson(message: M, encoder: JsonFieldValueEncoder) {
        encodeToJson(wrapperFieldDescriptor.getValue(message), encoder)
    }

    override fun encodeToJsonMapKey(value: T) = wrappedValueType.encodeToJsonMapKey(value)

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): T {
        return wrappedValueType.decodeFromJson(decoder)
    }

    override fun decodeMessageFromJson(decoder: JsonFieldValueDecoder): M {
        return wrapperFieldDescriptor.messageDescriptor.builder {
            wrapperFieldDescriptor.setValue(this, decodeFromJson(decoder))
        }
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        wrappedValueType.decodeFromJsonMapKey(decoder)
}
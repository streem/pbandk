package pbandk

import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireValue
import pbandk.internal.types.FieldType
import pbandk.internal.types.MessageValueType
import kotlin.js.JsExport

@JsExport
public data class UnknownField @PublicForGeneratedCode constructor(val fieldNum: Int, val values: List<Value>) {

    internal val size get() = (Tag.size(fieldNum) * values.size) + values.sumOf { it.size }

    public data class Value @PublicForGeneratedCode constructor(val wireValue: WireValue) {
        internal val size get() = wireValue.size

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as Value

            return if (wireValue is WireValue.Len) {
                if (other.wireValue !is WireValue.Len) {
                    false
                } else {
                    wireValue.value.contentEquals(other.wireValue.value)
                }
            } else {
                wireValue == other.wireValue
            }
        }

        override fun hashCode(): Int {
            return wireValue.hashCode()
        }
    }
}

@Suppress("UNCHECKED_CAST")
internal fun <M : Message, T> UnknownField.decodeAs(fieldDescriptor: FieldDescriptor<M, T>): T {
    if (fieldDescriptor.number != fieldNum) {
        throw InvalidProtocolBufferException("Unknown field number $fieldNum does not match field descriptor field number ${fieldDescriptor.number}")
    }

    return when (val fieldType = fieldDescriptor.fieldType) {
        is FieldType.Optional<*> -> if (fieldType.valueType is MessageValueType<*>) {
            decodeAsMessage(fieldDescriptor as FieldDescriptor<M, out Message?>) as T
        } else {
            decodeAsPrimitive(fieldDescriptor)
        }

        is FieldType.Required<*> -> if (fieldType.valueType is MessageValueType<*>) {
            decodeAsMessage(fieldDescriptor as FieldDescriptor<M, out Message>) as T
        } else {
            decodeAsPrimitive(fieldDescriptor)
        }

        is FieldType.Singular<*> -> if (fieldType.valueType is MessageValueType<*>) {
            decodeAsMessage(fieldDescriptor as FieldDescriptor<M, out Message>) as T
        } else {
            decodeAsPrimitive(fieldDescriptor)
        }

        is FieldType.MutableValue<*, *> -> decodeAsMutableValue(fieldDescriptor.metadata, fieldType) as T
    }
}

private fun <T> UnknownField.Value.decodeAs(fieldMetadata: FieldMetadata, fieldType: FieldType<T>): T {
    if (!fieldType.allowsBinaryWireType(WireType(wireValue.wireType))) {
        throw InvalidProtocolBufferException("Unknown field with wire type ${wireValue.wireType} can't be decoded as a '$fieldType' field")
    }
    return fieldType.decodeFromBinary(fieldMetadata, BinaryFieldValueDecoder.forWireValue(wireValue))
}

private fun <T> UnknownField.decodeAsPrimitive(fieldDescriptor: FieldDescriptor<*, T>): T {
    // Protobuf states it will only use the last value for multiple primitive types.
    return values.last().decodeAs(fieldDescriptor.metadata, fieldDescriptor.fieldType)
}

private fun <T : Message?> UnknownField.decodeAsMessage(fieldDescriptor: FieldDescriptor<*, T>): T {
    return values.asSequence()
        .map { it.decodeAs(fieldDescriptor.metadata, fieldDescriptor.fieldType) }
        .reduce { mergedMessage, newMessage ->
            fieldDescriptor.fieldType.mergeValues(fieldDescriptor.metadata, mergedMessage, newMessage)
        }
}

private fun <T, MT : Any> UnknownField.decodeAsMutableValue(
    fieldMetadata: FieldMetadata,
    fieldType: FieldType.MutableValue<T, MT>
): T {
    val mutableValue = fieldType.newMutableValue()
    values.forEach { value ->
        val wireType = WireType(value.wireValue.wireType)
        if (!fieldType.allowsBinaryWireType(wireType)) {
            throw InvalidProtocolBufferException("Unknown field with wire type $wireType can't be decoded as a '$fieldType' field")
        }
        fieldType.decodeFromBinary(fieldMetadata, BinaryFieldValueDecoder.forWireValue(value.wireValue), mutableValue)
    }
    return fieldType.fromMutableValue(mutableValue)
}
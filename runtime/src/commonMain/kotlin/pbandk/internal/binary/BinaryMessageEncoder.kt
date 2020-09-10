package pbandk.internal.binary

import pbandk.*
import pbandk.wkt.*
import kotlin.Any
import kotlin.reflect.KProperty1

internal open class BinaryMessageEncoder(private val wireEncoder: BinaryWireEncoder) : MessageEncoder {
    override fun <T : Message> writeMessage(message: T) {
        for (fd in message.descriptor.fields) {
            @Suppress("UNCHECKED_CAST")
            val value = (fd.value as KProperty1<T, *>).get(message)

            if (!fd.type.hasPresence && fd.type.isDefaultValue(value)) {
                continue
            }

            value?.let { writeFieldValue(fd.number, fd.type, it) }
        }

        for (field in message.unknownFields.values) {
            writeUnknownFieldValue(field.fieldNum, field.value)
        }
    }

    private fun writeFieldValue(fieldNum: Int, type: FieldDescriptor.Type, value: Any) {
        when (type) {
            is FieldDescriptor.Type.Primitive<*> -> wireEncoder.writePrimitiveValue(fieldNum, type, value)

            is FieldDescriptor.Type.Message<*> -> when (type.messageCompanion) {
                DoubleValue.Companion -> writeWrapperValue(fieldNum, type, value as Double, Sizer::doubleSize)
                FloatValue.Companion -> writeWrapperValue(fieldNum, type, value as Float, Sizer::floatSize)
                Int64Value.Companion -> writeWrapperValue(fieldNum, type, value as Long, Sizer::int64Size)
                UInt64Value.Companion -> writeWrapperValue(fieldNum, type, value as Long, Sizer::uInt64Size)
                Int32Value.Companion -> writeWrapperValue(fieldNum, type, value as Int, Sizer::int32Size)
                UInt32Value.Companion -> writeWrapperValue(fieldNum, type, value as Int, Sizer::uInt32Size)
                BoolValue.Companion -> writeWrapperValue(fieldNum, type, value as Boolean, Sizer::boolSize)
                StringValue.Companion -> writeWrapperValue(fieldNum, type, value as String, Sizer::stringSize)
                BytesValue.Companion -> writeWrapperValue(fieldNum, type, value as ByteArr, Sizer::bytesSize)
                else -> writeMessageValue(fieldNum, value as Message)
            }
            is FieldDescriptor.Type.Enum<*> -> wireEncoder.writeEnum(fieldNum, value as Message.Enum)

            is FieldDescriptor.Type.Repeated<*> -> writeRepeatedValue(
                fieldNum,
                value as List<*>,
                type.valueType,
                type.packed
            )

            is FieldDescriptor.Type.Map<*, *> -> writeMapValue(fieldNum, value as Map<*, *>, type)
        }
    }

    private fun <T : Any> writeWrapperValue(
        fieldNum: Int,
        type: FieldDescriptor.Type.Message<*>,
        value: T,
        sizeFn: (T) -> Int
    ) {
        val valueType = type.messageCompanion.descriptor.fields.first().type
        if (valueType.isDefaultValue(value)) {
            wireEncoder.writeLengthDelimitedHeader(fieldNum, 0)
        } else {
            wireEncoder.writeLengthDelimitedHeader(fieldNum, Sizer.tagSize(1) + sizeFn(value))
            writeFieldValue(1, valueType, value)
        }
    }

    private fun writeMessageValue(fieldNum: Int, message: Message) {
        wireEncoder.writeLengthDelimitedHeader(fieldNum, message.protoSize)
        writeMessage(message)
    }

    private fun writeRepeatedValue(fieldNum: Int, list: List<*>, valueType: FieldDescriptor.Type, packed: Boolean) {
        if (packed) {
            wireEncoder.writePackedRepeated(fieldNum, list, valueType)
        } else {
            list.forEach {
                writeFieldValue(fieldNum, valueType, checkNotNull(it))
            }
        }
    }

    private fun writeMapValue(fieldNum: Int, map: Map<*, *>, type: FieldDescriptor.Type.Map<*, *>) {
        // TODO: make the generic map case more efficient by using the map entries as-is instead of constructing a new
        // MessageMap.Entry for each one
        @Suppress("UNCHECKED_CAST")
        val messageMap = map as? MessageMap<*, *>
            ?: MessageMap(map.entries.map {
                MessageMap.Entry(
                    it.key, it.value,
                    type.entryCompanion as MessageMap.Entry.Companion<Any?, Any?>
                )
            }.toSet())
        messageMap.forEach {
            writeMessageValue(fieldNum, it as MessageMap.Entry<*, *>)
        }
    }

    private fun writeUnknownFieldValue(fieldNum: Int, value: UnknownField.Value) {
        when (value) {
            is UnknownField.Value.Varint -> wireEncoder.writeUInt64(fieldNum, value.varint)
            is UnknownField.Value.Fixed64 -> wireEncoder.writeFixed64(fieldNum, value.fixed64)
            is UnknownField.Value.LengthDelimited -> wireEncoder.writeBytes(fieldNum, value.bytes)
            UnknownField.Value.StartGroup -> throw UnsupportedOperationException()
            UnknownField.Value.EndGroup -> throw UnsupportedOperationException()
            is UnknownField.Value.Fixed32 -> wireEncoder.writeFixed32(fieldNum, value.fixed32)
            is UnknownField.Value.Composite -> value.values.forEach { writeUnknownFieldValue(fieldNum, it) }
        }
    }

    companion object
}

internal expect fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder

internal interface ByteArrayMessageEncoder : MessageEncoder {
    fun toByteArray(): ByteArray
}

package pbandk.internal.binary

import pbandk.*
import pbandk.gen.MapField
import pbandk.gen.MutableMapField
import pbandk.internal.fieldIterator
import pbandk.internal.forEach
import pbandk.wkt.*
import kotlin.Any

internal open class BinaryMessageEncoder(private val wireEncoder: BinaryWireEncoder) : MessageEncoder {
    override fun <M : Message> writeMessage(message: M) {
        message.fieldIterator().forEach { fd, value ->
            if (value != null && value != fd.type.defaultValue) {
                writeFieldValue(fd.number, fd.type, value)
            }
        }

        for (field in message.unknownFields.values) {
            writeUnknownField(field)
        }
    }

    private fun writeFieldValue(fieldNum: Int, type: FieldDescriptor.Type, value: Any) {
        @Suppress("UNCHECKED_CAST")
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

            is FieldDescriptor.Type.Map<*, *> -> writeMapValue(fieldNum, value as Map<out Any, Any>, type)
        }
    }

    private fun <T : Any> writeWrapperValue(
        fieldNum: Int,
        type: FieldDescriptor.Type.Message<*>,
        value: T,
        sizeFn: (T) -> Int
    ) {
        val valueType = type.messageCompanion.descriptor.fields.first().type
        if (value == valueType.defaultValue) {
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

    private fun writeMapValue(fieldNum: Int, map: Map<out Any, Any>, type: FieldDescriptor.Type.Map<*, *>) {
        // TODO: make the generic map case more efficient by using the map entries as-is instead of constructing a new
        //  MapField.Entry for each one
        @Suppress("UNCHECKED_CAST")
        val mapField = map as? MapField<*, *>
            ?: MutableMapField(type.entryCompanion as MapField.Entry.Companion<Any, Any>).apply {
                putAll(map)
            }.toMapField()
        mapField.asMessages().forEach {
            writeMessageValue(fieldNum, it)
        }
    }

    private fun writeUnknownField(field: UnknownField) {
        field.values.forEach {
            if (WireType(it.wireType) == WireType.START_GROUP || WireType(it.wireType) == WireType.END_GROUP) {
                throw UnsupportedOperationException()
            }
            wireEncoder.writeRawBytes(field.fieldNum, WireType(it.wireType), it.rawBytes.array)
        }
    }

    companion object
}

internal expect fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder

internal interface ByteArrayMessageEncoder : MessageEncoder {
    fun toByteArray(): ByteArray
}

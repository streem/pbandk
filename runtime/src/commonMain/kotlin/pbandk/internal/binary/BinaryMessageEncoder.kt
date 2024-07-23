package pbandk.internal.binary

import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageEncoder
import pbandk.MessageMap
import pbandk.UnknownField
import pbandk.wkt.BoolValue
import pbandk.wkt.BytesValue
import pbandk.wkt.DoubleValue
import pbandk.wkt.FloatValue
import pbandk.wkt.Int32Value
import pbandk.wkt.Int64Value
import pbandk.wkt.StringValue
import pbandk.wkt.UInt32Value
import pbandk.wkt.UInt64Value
import kotlin.reflect.KProperty1

internal fun FieldDescriptor.Type.shouldOutputValue(value: Any?): Boolean {
    return (hasPresence || !isDefaultValue(value)) && value != null
}

internal open class BinaryMessageEncoder(private val wireEncoder: BinaryWireEncoder) : MessageEncoder {
    override fun <T : Message> writeMessage(message: T) {
        for (fd in message.descriptor.fields) {
            @Suppress("UNCHECKED_CAST")
            val value = (fd.value as KProperty1<T, *>).get(message)

            if (fd.type.shouldOutputValue(value) && value != null) {
                writeFieldValue(fd.number, fd.type, value)
            }
        }

        for (field in message.unknownFields.values) {
            writeUnknownField(field)
        }
    }

    private fun writeFieldValue(fieldNum: Int, type: FieldDescriptor.Type, value: Any) {
        when (type) {
            is FieldDescriptor.Type.Primitive<*> -> wireEncoder.writePrimitiveValue(fieldNum, type, value)

            is FieldDescriptor.Type.Message<*> -> when (type.messageCompanion) {
                DoubleValue.Companion -> writeWrapperValue(fieldNum, type, value as Double, PlatformSizer::doubleSize)
                FloatValue.Companion -> writeWrapperValue(fieldNum, type, value as Float, PlatformSizer::floatSize)
                Int64Value.Companion -> writeWrapperValue(fieldNum, type, value as Long, PlatformSizer::int64Size)
                UInt64Value.Companion -> writeWrapperValue(fieldNum, type, value as Long, PlatformSizer::uInt64Size)
                Int32Value.Companion -> writeWrapperValue(fieldNum, type, value as Int, PlatformSizer::int32Size)
                UInt32Value.Companion -> writeWrapperValue(fieldNum, type, value as Int, PlatformSizer::uInt32Size)
                BoolValue.Companion -> writeWrapperValue(fieldNum, type, value as Boolean, PlatformSizer::boolSize)
                StringValue.Companion -> writeWrapperValue(fieldNum, type, value as String, PlatformSizer::stringSize)
                BytesValue.Companion -> writeWrapperValue(fieldNum, type, value as ByteArr, PlatformSizer::bytesSize)
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
            wireEncoder.writeLengthDelimitedHeader(fieldNum, PlatformSizer.tagSize(1) + sizeFn(value))
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
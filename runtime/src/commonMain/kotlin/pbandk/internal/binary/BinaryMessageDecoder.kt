package pbandk.internal.binary

import kotlin.Any
import pbandk.*
import pbandk.gen.MutableMapField
import pbandk.wkt.*

internal fun FieldDescriptor.Type.allowedWireType(wireType: WireType) =
    this.wireType == wireType ||
            (this is FieldDescriptor.Type.Repeated<*> && valueType.isPackable && wireType == WireType.LENGTH_DELIMITED)

internal val FieldDescriptor.Type.binaryReadFn: BinaryWireDecoder.() -> Any
    get() {
        return when (this) {
            is FieldDescriptor.Type.Primitive.Double -> BinaryWireDecoder::readDouble
            is FieldDescriptor.Type.Primitive.Float -> BinaryWireDecoder::readFloat
            is FieldDescriptor.Type.Primitive.Int64 -> BinaryWireDecoder::readInt64
            is FieldDescriptor.Type.Primitive.UInt64 -> BinaryWireDecoder::readUInt64
            is FieldDescriptor.Type.Primitive.Int32 -> BinaryWireDecoder::readInt32
            is FieldDescriptor.Type.Primitive.Fixed64 -> BinaryWireDecoder::readFixed64
            is FieldDescriptor.Type.Primitive.Fixed32 -> BinaryWireDecoder::readFixed32
            is FieldDescriptor.Type.Primitive.Bool -> BinaryWireDecoder::readBool
            is FieldDescriptor.Type.Primitive.String -> BinaryWireDecoder::readString
            is FieldDescriptor.Type.Primitive.Bytes -> BinaryWireDecoder::readBytes
            is FieldDescriptor.Type.Primitive.UInt32 -> BinaryWireDecoder::readUInt32
            is FieldDescriptor.Type.Primitive.SFixed32 -> BinaryWireDecoder::readSFixed32
            is FieldDescriptor.Type.Primitive.SFixed64 -> BinaryWireDecoder::readSFixed64
            is FieldDescriptor.Type.Primitive.SInt32 -> BinaryWireDecoder::readSInt32
            is FieldDescriptor.Type.Primitive.SInt64 -> BinaryWireDecoder::readSInt64
            is FieldDescriptor.Type.Message<*> -> when (messageCompanion) {
                DoubleValue.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as DoubleValue).value
                FloatValue.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as FloatValue).value
                Int64Value.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as Int64Value).value
                UInt64Value.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as UInt64Value).value
                Int32Value.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as Int32Value).value
                UInt32Value.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as UInt32Value).value
                BoolValue.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as BoolValue).value
                StringValue.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as StringValue).value
                BytesValue.Companion -> fun BinaryWireDecoder.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as BytesValue).value
                else -> fun BinaryWireDecoder.(): Any = readMessage(this@binaryReadFn.messageCompanion)
            }
            is FieldDescriptor.Type.Enum<*> -> fun BinaryWireDecoder.(): Any =
                readEnum(this@binaryReadFn.enumCompanion)
            is FieldDescriptor.Type.Repeated<*> ->
                error("Repeated values should've been handled by the caller of this method")
            is FieldDescriptor.Type.Map<*, *> -> fun BinaryWireDecoder.(): Any =
                sequenceOf(readMessage(this@binaryReadFn.entryCompanion))
        }
    }

internal class BinaryMessageDecoder(private val wireDecoder: BinaryWireDecoder) : MessageDecoder {

    override fun <M : Message> readMessage(messageCompanion: Message.Companion<M>): M = try {
        messageCompanion.descriptor.builder {
            val fieldDescriptors = messageCompanion.descriptor.fields
            while (true) {
                val tag = wireDecoder.readTag()
                if (tag == Tag(0)) break
                val fieldNum = tag.fieldNumber
                val wireType = tag.wireType
                val fd = fieldDescriptors[fieldNum]
                if (fd == null || !fd.type.allowedWireType(wireType)) {
                    addUnknownField(fieldNum, wireType, unknownFields)
                } else {
                    val value = if (fd.type is FieldDescriptor.Type.Repeated<*>) {
                        readRepeatedField(fd.type, wireType, wireDecoder)
                    } else {
                        fd.type.binaryReadFn(wireDecoder)
                    }
                    when (fd.type) {
                        is FieldDescriptor.Type.Repeated<*> -> {
                            value as Sequence<*>
                            @Suppress("UNCHECKED_CAST")
                            (getFieldValue(fd) as MutableList<Any?>).addAll(value)
                        }
                        is FieldDescriptor.Type.Map<*, *> -> {
                            @Suppress("UNCHECKED_CAST")
                            value as Sequence<Map.Entry<Any, Any>>
                            @Suppress("UNCHECKED_CAST")
                            (getFieldValue(fd) as MutableMapField<Any, Any>).putAll(value)
                        }
                        else -> {
                            @Suppress("UNCHECKED_CAST")
                            updateFieldValue(fd as FieldDescriptor<M, Any?>, value)
                        }
                    }
                }
            }
        }
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    private fun addUnknownField(fieldNum: Int, wireType: WireType, unknownFields: MutableMap<Int, UnknownField>) {
        val unknownFieldValue = wireDecoder.readUnknownFieldValue(wireType) ?: return
        unknownFields[fieldNum] = unknownFields[fieldNum]?.let { prevValue ->
            // TODO: make parsing of repeated unknown fields more efficient by not creating a copy of the list with
            // each new element.
            prevValue.copy(values = prevValue.values + unknownFieldValue)
        } ?: UnknownField(fieldNum, listOf(unknownFieldValue))
    }

    companion object {
        fun <T : Any> readRepeatedField(
            type: FieldDescriptor.Type.Repeated<T>,
            wireType: WireType,
            wireDecoder: BinaryWireDecoder
        ): Sequence<T> {
            @Suppress("UNCHECKED_CAST")
            val valueDecoder = type.valueType.binaryReadFn as BinaryWireDecoder.() -> T
            return if (wireType == WireType.LENGTH_DELIMITED && type.valueType.isPackable) {
                wireDecoder.readPackedRepeated(valueDecoder)
            } else {
                sequenceOf(valueDecoder(wireDecoder))
            }
        }
    }
}

internal expect fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder

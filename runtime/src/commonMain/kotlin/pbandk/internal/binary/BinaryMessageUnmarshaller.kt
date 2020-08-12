package pbandk.internal.binary

import kotlin.Any
import pbandk.*
import pbandk.wkt.*

private val FieldDescriptor.Type.wireType: Int
    get() = when (this) {
        is FieldDescriptor.Type.Primitive.Double -> WireType.FIXED64
        is FieldDescriptor.Type.Primitive.Float -> WireType.FIXED32
        is FieldDescriptor.Type.Primitive.Int64 -> WireType.VARINT
        is FieldDescriptor.Type.Primitive.UInt64 -> WireType.VARINT
        is FieldDescriptor.Type.Primitive.Int32 -> WireType.VARINT
        is FieldDescriptor.Type.Primitive.Fixed64 -> WireType.FIXED64
        is FieldDescriptor.Type.Primitive.Fixed32 -> WireType.FIXED32
        is FieldDescriptor.Type.Primitive.Bool -> WireType.VARINT
        is FieldDescriptor.Type.Primitive.String -> WireType.LENGTH_DELIMITED
        is FieldDescriptor.Type.Primitive.Bytes -> WireType.LENGTH_DELIMITED
        is FieldDescriptor.Type.Primitive.UInt32 -> WireType.VARINT
        is FieldDescriptor.Type.Primitive.SFixed32 -> WireType.FIXED32
        is FieldDescriptor.Type.Primitive.SFixed64 -> WireType.FIXED64
        is FieldDescriptor.Type.Primitive.SInt32 -> WireType.VARINT
        is FieldDescriptor.Type.Primitive.SInt64 -> WireType.VARINT
        is FieldDescriptor.Type.Message<*> -> WireType.LENGTH_DELIMITED
        is FieldDescriptor.Type.Enum<*> -> WireType.VARINT
        is FieldDescriptor.Type.Repeated<*> -> valueType.wireType
        is FieldDescriptor.Type.Map<*, *> -> WireType.LENGTH_DELIMITED
    }

private fun FieldDescriptor.Type.allowedWireType(wireType: Int) =
    this.wireType == wireType ||
            (this is FieldDescriptor.Type.Repeated<*> && valueType.isPackable && wireType == WireType.LENGTH_DELIMITED)

private val FieldDescriptor.Type.binaryReadFn: BinaryWireUnmarshaller.() -> Any
    get() {
        // XXX: The "useless" casts below are required in order to work around a compiler bug in Kotlin 1.3 (see
        // https://youtrack.jetbrains.com/issue/KT-12693 and linked issues). Without the cast, the compiler crashes
        // with an obscure error. This is supposedly fixed in Kotlin 1.4.
        @Suppress("USELESS_CAST")
        return when (this) {
            is FieldDescriptor.Type.Primitive.Double -> BinaryWireUnmarshaller::readDouble as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Float -> BinaryWireUnmarshaller::readFloat as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Int64 -> BinaryWireUnmarshaller::readInt64 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.UInt64 -> BinaryWireUnmarshaller::readUInt64 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Int32 -> BinaryWireUnmarshaller::readInt32 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Fixed64 -> BinaryWireUnmarshaller::readFixed64 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Fixed32 -> BinaryWireUnmarshaller::readFixed32 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Bool -> BinaryWireUnmarshaller::readBool as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.String -> BinaryWireUnmarshaller::readString as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.Bytes -> BinaryWireUnmarshaller::readBytes as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.UInt32 -> BinaryWireUnmarshaller::readUInt32 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.SFixed32 -> BinaryWireUnmarshaller::readSFixed32 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.SFixed64 -> BinaryWireUnmarshaller::readSFixed64 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.SInt32 -> BinaryWireUnmarshaller::readSInt32 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Primitive.SInt64 -> BinaryWireUnmarshaller::readSInt64 as BinaryWireUnmarshaller.() -> Any
            is FieldDescriptor.Type.Message<*> -> when (messageCompanion) {
                DoubleValue.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as DoubleValue).value
                FloatValue.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as FloatValue).value
                Int64Value.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as Int64Value).value
                UInt64Value.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as UInt64Value).value
                Int32Value.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as Int32Value).value
                UInt32Value.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as UInt32Value).value
                BoolValue.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as BoolValue).value
                StringValue.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as StringValue).value
                BytesValue.Companion -> fun BinaryWireUnmarshaller.(): Any =
                    (readMessage(this@binaryReadFn.messageCompanion) as BytesValue).value
                else -> fun BinaryWireUnmarshaller.(): Any = readMessage(this@binaryReadFn.messageCompanion)
            }
            is FieldDescriptor.Type.Enum<*> -> fun BinaryWireUnmarshaller.(): Any =
                readEnum(this@binaryReadFn.enumCompanion)
            is FieldDescriptor.Type.Repeated<*> ->
                error("Repeated values should've been handled by the caller of this method")
            is FieldDescriptor.Type.Map<*, *> -> fun BinaryWireUnmarshaller.(): Any =
                sequenceOf(readMessage(this@binaryReadFn.entryCompanion))
        }
    }

internal class BinaryMessageUnmarshaller(private val wireUnmarshaller: BinaryWireUnmarshaller) : MessageUnmarshaller {

    @Suppress("UNCHECKED_CAST")
    override fun <T : Message> readMessage(
        messageCompanion: Message.Companion<T>,
        fieldFn: (Int, Any) -> Unit
    ): Map<Int, UnknownField> = try {
        val unknownFields = mutableMapOf<Int, UnknownField>()
        val fieldDescriptors = messageCompanion.fieldDescriptors.associateBy { it.number }
        while (true) {
            val tag = wireUnmarshaller.readTag()
            if (tag == 0) break
            val fieldNum = tag ushr 3
            val wireType = tag and 0b111
            val fd = fieldDescriptors[fieldNum]
            if (fd == null || !fd.type.allowedWireType(wireType)) {
                addUnknownField(fieldNum, wireType, unknownFields)
            } else {
                val value = if (fd.type is FieldDescriptor.Type.Repeated<*>) {
                    readRepeated(fd.type, wireType)
                } else {
                    fd.type.binaryReadFn(wireUnmarshaller)
                }
                fieldFn(fieldNum, value)
            }
        }
        unknownFields
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    private fun addUnknownField(fieldNum: Int, wireType: Int, unknownFields: MutableMap<Int, UnknownField>) {
        val unknownField = wireUnmarshaller.readUnknownField(fieldNum, wireType) ?: return
        unknownFields[fieldNum] = UnknownField(fieldNum, unknownFields[fieldNum]?.let { prevField ->
            if (prevField.value is UnknownField.Value.Composite) {
                // TODO: make parsing of repeated unknown fields more efficient by not creating a copy of the list with
                // each new element.
                prevField.value.copy(values = prevField.value.values + unknownField)
            } else {
                UnknownField.Value.Composite(listOf(prevField.value, unknownField))
            }
        } ?: unknownField)
    }

    private fun readRepeated(type: FieldDescriptor.Type.Repeated<*>, wireType: Int): Any {
        val valueUnmarshaller = type.valueType.binaryReadFn
        return if (wireType == WireType.LENGTH_DELIMITED && type.valueType.isPackable) {
            wireUnmarshaller.readPackedRepeated(valueUnmarshaller)
        } else {
            sequenceOf(valueUnmarshaller(wireUnmarshaller))
        }
    }

    companion object
}

internal expect fun BinaryMessageUnmarshaller.Companion.fromByteArray(arr: ByteArray): MessageUnmarshaller

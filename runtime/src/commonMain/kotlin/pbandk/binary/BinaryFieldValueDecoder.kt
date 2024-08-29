package pbandk.binary

import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.internal.binary.BinaryDecoderContext
import pbandk.internal.binary.BinaryFieldDecoder
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import pbandk.internal.binary.kotlin.LimitingWireReader
import pbandk.internal.binary.kotlin.WireReader

@PublicForGeneratedCode
public sealed class BinaryFieldValueDecoder {
    internal abstract val wireType: WireType

    internal abstract fun skipValue()

    public sealed class Varint : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.VARINT
        public abstract fun decodeValue(): WireValue.Varint
    }

    internal class VarintFromReader(private val wireReader: WireReader) : Varint() {
        override fun decodeValue(): WireValue.Varint {
            var result: ULong = 0UL
            for (shift in 0..<64 step 7) {
                val b = wireReader.readByte()
                result = result or ((b.toInt() and 0x7F).toULong() shl shift)
                if (b.toInt() and 0x80 == 0) {
                    return WireValue.Varint(result)
                }
            }
            throw InvalidProtocolBufferException.malformedVarint()
        }

        override fun skipValue() {
            repeat(MAX_VARINT_SIZE) {
                if (wireReader.readByte() >= 0)
                    return
            }
            throw InvalidProtocolBufferException.malformedVarint()
        }
    }

    internal class VarintFromValue(private val value: WireValue.Varint) : Varint() {
        override fun decodeValue(): WireValue.Varint = value
        override fun skipValue() {}
    }

    public sealed class I32 : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.FIXED32
        public abstract fun decodeValue(): WireValue.I32
    }

    internal class I32FromReader(private val wireReader: WireReader) : I32() {
        override fun decodeValue(): WireValue.I32 {
            return wireReader.read(4).foldRight(0U) { byte, acc ->
                (acc shl 8) or (byte.toUInt() and 0xffU)
            }.let { WireValue.I32(it) }
        }

        override fun skipValue() {
            wireReader.skipRawBytes(4)
        }
    }

    internal class I32FromValue(private val value: WireValue.I32) : I32() {
        override fun decodeValue(): WireValue.I32 = value
        override fun skipValue() {}
    }

    public sealed class I64 : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.FIXED64
        public abstract fun decodeValue(): WireValue.I64
    }

    internal class I64FromReader(private val wireReader: WireReader) : I64() {
        override fun decodeValue(): WireValue.I64 {
            return wireReader.read(8).foldRight(0UL) { byte, acc ->
                (acc shl 8) or (byte.toULong() and 0xffU)
            }.let { WireValue.I64(it) }
        }

        override fun skipValue() {
            wireReader.skipRawBytes(8)
        }
    }

    internal class I64FromValue(private val value: WireValue.I64) : I64() {
        override fun decodeValue(): WireValue.I64 = value
        override fun skipValue() {}
    }

    public sealed class Len : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.LENGTH_DELIMITED

        public abstract fun decodeValue(): WireValue.Len

        internal abstract val context: BinaryDecoderContext
        protected abstract fun preDecode(): Int?
        protected abstract fun postDecode(oldLimit: Int?)

        internal inline fun <T : Any> decodeFields(fieldsBlock: (BinaryFieldDecoder) -> T): T {
            val oldLimit = preDecode()
            val message = fieldsBlock(context.fieldDecoder)
            if (!context.wireReader.isAtEnd()) {
                throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
            }
            postDecode(oldLimit)
            return message
        }

        internal inline fun decodePackedValues(wireType: WireType, valueBlock: (BinaryFieldValueDecoder) -> Unit) {
            val oldLimit = preDecode()
            val valueDecoder = context.valueDecoder(wireType)
            while (!context.wireReader.isAtEnd()) {
                valueBlock(valueDecoder)
            }
            postDecode(oldLimit)
        }
    }

    internal class LenFromReader(override val context: BinaryDecoderContext) : Len() {
        private inline fun decodePrefix(): Int {
            val length = context.varintValueDecoder.decodeValue().decodeSignedInt
            if (length < 0) {
                throw InvalidProtocolBufferException.negativeSize()
            }
            return length
        }

        override fun decodeValue(): WireValue.Len {
            val size = decodePrefix()
            return WireValue.Len(context.wireReader.read(size))
        }

        override fun skipValue() {
            val size = decodePrefix()
            context.wireReader.skipRawBytes(size)
        }

        override fun preDecode(): Int? {
            val messageBytesSize = decodePrefix()
            val oldLimit = context.wireReader.pushLimit(messageBytesSize)
            return oldLimit
        }

        override fun postDecode(oldLimit: Int?) {
            context.wireReader.popLimit(oldLimit)
        }
    }

    internal class LenFromValue(private val value: WireValue.Len) : Len() {
        override val context = BinaryDecoderContext(ByteArrayWireReader(value.value))
        override fun decodeValue() = value
        override fun skipValue() {}
        override fun preDecode() = null
        override fun postDecode(oldLimit: Int?) {}
    }

    public sealed class Group : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.START_GROUP

        public abstract fun decodeValue(): WireValue.Group

        internal abstract val fieldDecoder: BinaryFieldDecoder

        internal inline fun <T : Any> decodeFields(fieldsBlock: (BinaryFieldDecoder) -> T): T {
            val message = fieldsBlock(fieldDecoder)
            return message
        }
    }

    internal class GroupFromReader(override val fieldDecoder: BinaryFieldDecoder) : Group() {
        override fun decodeValue(): WireValue.Group {
            val fields = buildList {
                fieldDecoder.forEachField { fieldNumber, valueDecoder ->
                    add(UnknownField(fieldNumber, listOf(UnknownField.Value(valueDecoder))))
                }
            }
            return WireValue.Group(fields)
        }

        override fun skipValue() {
            fieldDecoder.forEachField { _, valueDecoder ->
                valueDecoder.skipValue()
            }
        }
    }

    internal class GroupFromValue(private val value: WireValue.Group) : Group() {
        override fun decodeValue(): WireValue.Group = value
        override fun skipValue() {}
        override val fieldDecoder = BinaryFieldDecoder.fromGroupWireValue(value)
    }

    public object EndGroup : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.END_GROUP
        public fun decodeValue(): WireValue.EndGroup = WireValue.EndGroup
        override fun skipValue() {}
    }

    public companion object {
        internal fun forWireValue(wireValue: WireValue): BinaryFieldValueDecoder = when (wireValue) {
            is WireValue.Varint -> VarintFromValue(wireValue)

            is WireValue.I32 -> I32FromValue(wireValue)

            is WireValue.I64 -> I64FromValue(wireValue)

            is WireValue.Len -> LenFromValue(wireValue)

            is WireValue.Group -> GroupFromValue(wireValue)

            is WireValue.EndGroup -> EndGroup
        }
    }

}

/** Returns `true` if field value was consumed, either by calling [valueBlock] or by skipping the field. */
internal inline fun <M : Message, T> BinaryFieldValueDecoder.tryDecodeField(
    fieldDescriptor: FieldDescriptor<M, T>,
    fieldNumber: Int,
    valueBlock: (T) -> Unit,
): Boolean = when {
    fieldDescriptor.metadata.number != fieldNumber -> {
        false
    }

    !fieldDescriptor.fieldType.allowsBinaryWireType(wireType) -> {
        skipValue()
        true
    }

    else -> {
        valueBlock(fieldDescriptor.fieldType.decodeFromBinary(fieldDescriptor.metadata, this))
        true
    }
}
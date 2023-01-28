package pbandk.binary

import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.internal.binary.BinaryFieldDecoder
import pbandk.internal.binary.MAX_VARINT_SIZE
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireValue
import pbandk.internal.binary.kotlin.WireReader

/**
 * This class provides a method for decoding
 * [every "wire type" in the protobuf binary wire format](https://developers.google.com/protocol-buffers/docs/encoding#structure):
 * `varint`, `i32`, `i64`, `len`. A specialized method is provided for every built-in Kotlin type that can
 * be used to hold one of the wire type values.
 */
@PublicForGeneratedCode
public class BinaryFieldValueDecoder internal constructor(
    private val wireReader: WireReader,
    private val fieldDecoder: BinaryFieldDecoder
) {
    private var consumed: UInt = 0U
    private var curLimit: UInt? = null

    internal fun isAtEnd(): Boolean = (consumed == curLimit) || (curLimit == null && wireReader.isAtEnd())

    private fun pushLimit(len: UInt): UInt? {
        val old = curLimit
        curLimit = consumed + len
        return old
    }

    private fun popLimit(oldLimit: UInt?) {
        curLimit = oldLimit
    }

    private fun readRawBytes(length: UInt): ByteArray {
        if (consumed + length <= (curLimit ?: UInt.MAX_VALUE)) {
            consumed += length
            require(length <= Int.MAX_VALUE.toUInt())
            return wireReader.read(length.toInt())
        }

        if (length == 0U) {
            return byteArrayOf()
        }

        throw InvalidProtocolBufferException.truncatedMessage()
    }

    private fun readRawByte(): Byte {
        if (consumed < (curLimit ?: UInt.MAX_VALUE)) {
            consumed += 1U
            return wireReader.readByte()
        }

        throw InvalidProtocolBufferException.truncatedMessage()
    }

    // Wire type: varint

    internal fun decodeVarint(): WireValue.Varint {
        var result: ULong = 0UL
        for (shift in 0 until 64 step 7) {
            val b = readRawByte()
            result = result or ((b.toInt() and 0x7F).toULong() shl shift)
            if (b.toInt() and 0x80 == 0) {
                return WireValue.Varint(result)
            }
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    private fun skipVarint() {
        repeat(MAX_VARINT_SIZE) {
            if (readRawByte() >= 0)
                return
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    // Wire type: i32

    internal fun decodeI32(): WireValue.I32 {
        return readRawBytes(4U).foldRight(0U) { byte, acc ->
            (acc shl 8) or (byte.toUInt() and 0xffU)
        }.let { WireValue.I32(it) }
    }

    private fun skipI32() {
        wireReader.skipRawBytes(4)
    }

    // Wire type: i64

    internal fun decodeI64(): WireValue.I64 {
        return readRawBytes(8U).foldRight(0UL) { byte, acc ->
            (acc shl 8) or (byte.toULong() and 0xffU)
        }.let { WireValue.I64(it) }
    }

    private fun skipI64() {
        wireReader.skipRawBytes(8)
    }

    // Wire type: len

    @Suppress("NOTHING_TO_INLINE")
    private inline fun decodeLenPrefix(): UInt {
        return decodeVarint().decodeUnsignedInt
    }

    internal fun decodeLen(): WireValue.Len {
        val size = decodeLenPrefix()
        return WireValue.Len(readRawBytes(size))
    }

    private fun skipLen() {
        val size = decodeLenPrefix()
        wireReader.skipRawBytes(size.toInt())
    }

    internal inline fun <T : Any> decodeLenFields(fieldsBlock: (BinaryFieldDecoder) -> T): T {
        val messageBytesSize = decodeLenPrefix()
        val oldLimit = pushLimit(messageBytesSize)
        val message = fieldsBlock(fieldDecoder)
        if (!isAtEnd()) {
            throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
        }
        popLimit(oldLimit)
        return message
    }

    internal inline fun decodeLenPackedValues(valueBlock: (BinaryFieldValueDecoder) -> Unit) {
        val listBytesSize = decodeLenPrefix()
        val oldLimit = pushLimit(listBytesSize)
        while (!isAtEnd()) {
            valueBlock(this@BinaryFieldValueDecoder)
        }
        popLimit(oldLimit)
    }

    // Wire type: group

    internal fun decodeGroup(fieldNumber: Int): WireValue.Group {
        /*
        // TODO: properly read in the bytes instead of just skipping them
        val lastTag = fieldDecoder.skipMessage()
        if (lastTag.wireType != WireType.END_GROUP) {
            throw InvalidProtocolBufferException("Encountered a malformed START_GROUP tag with no matching END_GROUP tag")
        }
        return WireValue.Group(byteArrayOf())
        */

        @OptIn(ExperimentalStdlibApi::class)
        val fields = buildList {
            fieldDecoder.decodeGroup(fieldNumber) { tag, valueDecoder ->
                add(UnknownField(tag.fieldNumber, listOf(valueDecoder.decodeUnknownField(tag)!!)))
            }
        }
        return WireValue.Group(fields)
    }

    private fun skipGroup(tag: Tag) {
        val lastTag = fieldDecoder.skipMessage()
        if (lastTag != Tag(tag.fieldNumber, WireType.END_GROUP)) {
            throw InvalidProtocolBufferException.invalidEndTag()
        }
    }

    internal fun skipField(tag: Tag): Boolean {
        when (tag.wireType) {
            WireType.VARINT -> {
                skipVarint()
                return true
            }
            WireType.FIXED32 -> {
                skipI32()
                return true
            }
            WireType.FIXED64 -> {
                skipI64()
                return true
            }
            WireType.LENGTH_DELIMITED -> {
                skipLen()
                return true
            }
            WireType.START_GROUP -> {
                skipGroup(tag)
                return true
            }
            WireType.END_GROUP -> return false
            else -> throw InvalidProtocolBufferException.invalidWireType()
        }
    }

    // Unknown fields

    internal fun decodeUnknownField(tag: Tag): UnknownField.Value? {
        // TODO: support a `discardUnknownFields` option in the BinaryMessageDecoder
        //val unknownFields = currentUnknownFields ?: return run { stream.skipField(tag) }
        val wireValue = when (tag.wireType) {
            WireType.VARINT -> decodeVarint()
            WireType.FIXED32 -> decodeI32()
            WireType.FIXED64 -> decodeI64()
            WireType.LENGTH_DELIMITED -> decodeLen()
            WireType.START_GROUP -> decodeGroup(tag.fieldNumber)
            else -> throw InvalidProtocolBufferException("Unrecognized wire type: $tag.wireType")
        }
        return UnknownField.Value(tag.wireType.value, wireValue)
    }
}

/** Returns `true` if field value was consumed, either by calling [valueBlock] or by skipping the field. */
internal inline fun <M : Message, T> BinaryFieldValueDecoder.tryDecodeField(
    fieldDescriptor: FieldDescriptor<M, T>,
    tag: Tag,
    valueBlock: (T) -> Unit,
): Boolean = when {
    fieldDescriptor.metadata.number != tag.fieldNumber -> {
        false
    }
    !fieldDescriptor.fieldType.allowsBinaryWireType(tag.wireType) -> {
        skipField(tag)
        true
    }
    else -> {
        valueBlock(fieldDescriptor.fieldType.decodeFromBinary(fieldDescriptor.metadata, tag, this))
        true
    }
}
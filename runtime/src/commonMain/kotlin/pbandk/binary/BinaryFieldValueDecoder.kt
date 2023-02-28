package pbandk.binary

import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.binary.BinaryFieldValueEncoder.Companion.encodeToBuffer
import pbandk.internal.binary.BinaryFieldDecoder
import pbandk.internal.binary.MAX_VARINT_SIZE
import pbandk.internal.binary.WireValue
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import pbandk.internal.binary.kotlin.LimitingWireReader
import pbandk.internal.binary.kotlin.WireReader
import kotlin.js.JsExport

@PublicForGeneratedCode
@JsExport
public sealed class BinaryFieldValueDecoder {
    internal abstract val wireType: WireType

    /**
     * WARNING: Avoid calling this function on a generic [BinaryFieldValueDecoder] instance in performance-sensitive
     * code, since it'll have to box the [WireValue] return value. It's ok to call this function on an instance of one
     * of the [BinaryFieldValueDecoder] subclasses since those override this function's return value to return a
     * specific [WireValue] sub-class that will avoid boxing the inline value class.
     */
    internal abstract fun decodeValue(): WireValue

    internal abstract fun skipValue()

    public sealed class Varint : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.VARINT
        abstract override fun decodeValue(): WireValue.Varint
    }

    internal class VarintFromReader(private val wireReader: WireReader) : Varint() {
        override fun decodeValue(): WireValue.Varint {
            var result: ULong = 0UL
            for (shift in 0 until 64 step 7) {
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
        abstract override fun decodeValue(): WireValue.I32
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
        abstract override fun decodeValue(): WireValue.I64
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

    public class Len internal constructor(
        private val wireReader: LimitingWireReader,
        private val fieldDecoder: BinaryFieldDecoder,
    ) : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.LENGTH_DELIMITED

        @Suppress("NOTHING_TO_INLINE")
        private inline fun decodePrefix(): Int {
            val length = fieldDecoder.varintValueDecoder.decodeValue().decodeSignedInt
            if (length < 0) {
                throw InvalidProtocolBufferException.negativeSize()
            }
            return length
        }

        override fun decodeValue(): WireValue.Len {
            val size = decodePrefix()
            return WireValue.Len(wireReader.read(size))
        }

        internal inline fun <T : Any> decodeFields(fieldsBlock: (BinaryFieldDecoder) -> T): T {
            val messageBytesSize = decodePrefix()
            val oldLimit = wireReader.pushLimit(messageBytesSize)
            val message = fieldsBlock(fieldDecoder)
            if (!wireReader.isAtEnd()) {
                throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
            }
            wireReader.popLimit(oldLimit)
            return message
        }

        internal inline fun decodePackedValues(wireType: WireType, valueBlock: (BinaryFieldValueDecoder) -> Unit) {
            val listBytesSize = decodePrefix()
            val oldLimit = wireReader.pushLimit(listBytesSize)
            val valueDecoder = fieldDecoder.valueDecoder(wireType)
            while (!wireReader.isAtEnd()) {
                valueBlock(valueDecoder)
            }
            wireReader.popLimit(oldLimit)
        }

        override fun skipValue() {
            val size = decodePrefix()
            wireReader.skipRawBytes(size)
        }
    }

    public sealed class Group : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.START_GROUP
        abstract override fun decodeValue(): WireValue.Group
    }

    internal class GroupFromReader(
        private val fieldDecoder: BinaryFieldDecoder,
        private val fieldNumber: Int,
    ) : Group() {

        private fun isValidEndGroupTag(fieldNumber: Int, valueDecoder: BinaryFieldValueDecoder): Boolean {
            return if (valueDecoder.wireType == WireType.END_GROUP) {
                if (fieldNumber != this.fieldNumber) throw InvalidProtocolBufferException.invalidEndTag()
                true
            } else {
                false
            }
        }

        override fun decodeValue(): WireValue.Group {
            @OptIn(ExperimentalStdlibApi::class)
            val fields = buildList {
                fieldDecoder.forEachField { fieldNumber, valueDecoder ->
                    // An END_GROUP tag means we've reached the end of the group value
                    if (isValidEndGroupTag(fieldNumber, valueDecoder)) return@buildList

                    add(UnknownField(fieldNumber, listOf(UnknownField.Value(valueDecoder.decodeValue()))))
                }
                // If we got here, that means there are no more fields to process but we still haven't seen an
                // END_GROUP tag
                throw InvalidProtocolBufferException("Encountered a START_GROUP tag with no matching END_GROUP tag")
            }
            return WireValue.Group(fields)
        }

        override fun skipValue() {
            fieldDecoder.forEachField { fieldNumber, valueDecoder ->
                valueDecoder.skipValue()
                // An END_GROUP tag means we've reached the end of this group value
                if (isValidEndGroupTag(fieldNumber, valueDecoder)) return
            }
            // If we got here, that means there are no more fields to process but we still haven't seen an
            // END_GROUP tag
            throw InvalidProtocolBufferException("Encountered a START_GROUP tag with no matching END_GROUP tag")
        }
    }

    internal class GroupFromValue(private val value: WireValue.Group) : Group() {
        override fun decodeValue(): WireValue.Group = value
        override fun skipValue() {}
    }

    public object EndGroup : BinaryFieldValueDecoder() {
        override val wireType: WireType get() = WireType.END_GROUP
        override fun decodeValue(): WireValue.EndGroup = WireValue.EndGroup
        override fun skipValue() {}
    }

    public companion object {
        internal fun forWireValue(wireValue: WireValue): BinaryFieldValueDecoder = when (wireValue) {
            is WireValue.Varint -> VarintFromValue(wireValue)

            is WireValue.I32 -> I32FromValue(wireValue)

            is WireValue.I64 -> I64FromValue(wireValue)

            is WireValue.Len -> {
                // This is a bit roundabout, but it gets the job done
                val buffer = ByteArray(MAX_VARINT_SIZE)
                val position = WireValue.Varint.encodeSignedInt(wireValue.value.size).encodeToBuffer(buffer)
                BinaryFieldDecoder(ByteArrayWireReader(buffer.copyOf(position) + wireValue.value)).lenValueDecoder
            }

            is WireValue.Group -> GroupFromValue(wireValue)

            is WireValue.EndGroup -> EndGroup
        }
    }
}

/**
 * This class provides a method for decoding
 * [every "wire type" in the protobuf binary wire format](https://developers.google.com/protocol-buffers/docs/encoding#structure):
 * `varint`, `i32`, `i64`, `len`. A specialized method is provided for every built-in Kotlin type that can
 * be used to hold one of the wire type values.
 */
/*
@PublicForGeneratedCode
public class OldBinaryFieldValueDecoder internal constructor(
    private val wireReader: LimitingWireReader,
    private val fieldDecoder: BinaryFieldDecoder
) {
    // Wire type: varint

    internal fun decodeVarint(): WireValue.Varint {
        var result: ULong = 0UL
        for (shift in 0 until 64 step 7) {
            val b = wireReader.readByte()
            result = result or ((b.toInt() and 0x7F).toULong() shl shift)
            if (b.toInt() and 0x80 == 0) {
                return WireValue.Varint(result)
            }
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    private fun skipVarint() {
        repeat(MAX_VARINT_SIZE) {
            if (wireReader.readByte() >= 0)
                return
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    // Wire type: i32

    internal fun decodeI32(): WireValue.I32 {
        return wireReader.read(4).foldRight(0U) { byte, acc ->
            (acc shl 8) or (byte.toUInt() and 0xffU)
        }.let { WireValue.I32(it) }
    }

    private fun skipI32() {
        wireReader.skipRawBytes(4)
    }

    // Wire type: i64

    internal fun decodeI64(): WireValue.I64 {
        return wireReader.read(8).foldRight(0UL) { byte, acc ->
            (acc shl 8) or (byte.toULong() and 0xffU)
        }.let { WireValue.I64(it) }
    }

    private fun skipI64() {
        wireReader.skipRawBytes(8)
    }

    // Wire type: len

    @Suppress("NOTHING_TO_INLINE")
    private inline fun decodeLenPrefix(): Int {
        val length = decodeVarint().decodeSignedInt
        if (length < 0) {
            throw InvalidProtocolBufferException.negativeSize()
        }
        return length
    }

    internal fun decodeLen(): WireValue.Len {
        val size = decodeLenPrefix()
        return WireValue.Len(wireReader.read(size))
    }

    private fun skipLen() {
        val size = decodeLenPrefix()
        wireReader.skipRawBytes(size)
    }

    internal inline fun <T : Any> decodeLenFields(fieldsBlock: (BinaryFieldDecoder) -> T): T {
        val messageBytesSize = decodeLenPrefix()
        val oldLimit = wireReader.pushLimit(messageBytesSize)
        val message = fieldsBlock(fieldDecoder)
        if (!wireReader.isAtEnd()) {
            throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
        }
        wireReader.popLimit(oldLimit)
        return message
    }

    internal inline fun decodeLenPackedValues(valueBlock: (BinaryFieldValueDecoder) -> Unit) {
        val listBytesSize = decodeLenPrefix()
        val oldLimit = wireReader.pushLimit(listBytesSize)
        while (!wireReader.isAtEnd()) {
            valueBlock(this@BinaryFieldValueDecoder)
        }
        wireReader.popLimit(oldLimit)
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
        return UnknownField.Value(wireValue)
    }
}
 */

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
package pbandk.binary

import pbandk.PublicForGeneratedCode
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.MAX_VARINT_SIZE
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireValue
import pbandk.internal.binary.kotlin.WireWriter

/**
 * This class provides a method for encoding
 * [every "wire type" in the protobuf binary wire format](https://developers.google.com/protocol-buffers/docs/encoding#structure):
 * `varint`, `i32`, `i64`, `len`. A specialized method is provided for every built-in Kotlin type that can
 * be used to hold one of the wire type values.
 */
@PublicForGeneratedCode
public class BinaryFieldValueEncoder internal constructor(
    private val wireWriter: WireWriter,
    private val fieldEncoder: BinaryFieldEncoder
) {
    private val byteArrayBuffer = ByteArray(MAX_VARINT_SIZE)

    // Wire type: varint

    internal fun encodeVarint(value: WireValue.Varint) {
        val position = value.encodeToBuffer(byteArrayBuffer)
        wireWriter.write(byteArrayBuffer, 0, position)
    }

    // Wire type: i32

    internal fun encodeI32(value: WireValue.I32) {
        val buffer = byteArrayBuffer
        for (i in 0 until 4) {
            buffer[i] = (value.value shr (8 * i)).toByte()
        }
        wireWriter.write(buffer, 0, 4)
    }

    // Wire type: i64

    internal fun encodeI64(value: WireValue.I64) {
        val buffer = byteArrayBuffer
        for (i in 0 until 8) {
            buffer[i] = (value.value shr (8 * i)).toByte()
        }
        wireWriter.write(buffer, 0, 8)
    }

    // Wire type: len

    internal fun encodeLen(value: WireValue.Len) {
        encodeLenPrefix(value.value.size.toUInt())
        wireWriter.write(value.value, 0, value.value.size)
    }

    @Suppress("NOTHING_TO_INLINE")
    internal inline fun encodeLenPrefix(length: UInt) {
        encodeVarint(WireValue.Varint.encodeUnsignedInt(length))
    }

    internal inline fun encodeLenFields(length: Int, fieldBlock: (BinaryFieldEncoder) -> Unit) {
        encodeLenPrefix(length.toUInt())
        fieldBlock(fieldEncoder)
    }

    // Wire type: group

    internal fun encodeGroup(fieldNum: Int, value: WireValue.Group) {
        value.value.forEach { field ->
            field.values.forEach {
                fieldEncoder.encodeField(Tag(field.fieldNum, WireType(it.wireValue.wireType))) { valueEncoder ->
                    valueEncoder.encodeUnknownField(field.fieldNum, it.wireValue)
                }
            }
        }
        fieldEncoder.encodeField(Tag(fieldNum, WireType.END_GROUP)) {}
    }

    // Unknown fields

    internal fun encodeUnknownField(fieldNum: Int, value: WireValue) {
        when (value) {
            is WireValue.Varint -> encodeVarint(value)
            is WireValue.I32 -> encodeI32(value)
            is WireValue.I64 -> encodeI64(value)
            is WireValue.Len -> encodeLen(value)
            is WireValue.Group -> encodeGroup(fieldNum, value)
            is WireValue.EndGroup -> {}
        }
    }

    public companion object {
        internal fun WireValue.Varint.encodeToBuffer(buffer: ByteArray): Int {
            var position = 0
            var valueCur = value
            while (position < MAX_VARINT_SIZE) {
                if ((valueCur and 0x7FUL.inv()) == 0UL) {
                    buffer[position++] = valueCur.toByte()
                    break
                } else {
                    buffer[position++] = ((valueCur and 0x7FU) or 0x80U).toByte()
                    valueCur = valueCur shr 7
                }
            }
            return position
        }
    }
}
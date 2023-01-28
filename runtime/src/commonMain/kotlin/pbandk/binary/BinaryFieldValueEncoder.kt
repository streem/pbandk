package pbandk.binary

import pbandk.PublicForGeneratedCode
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.MAX_VARINT_SIZE
import pbandk.internal.binary.WireValue
import pbandk.internal.binary.kotlin.WireWriter
import kotlin.jvm.JvmField

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
    @JvmField
    private val byteArrayBuffer = ByteArray(MAX_VARINT_SIZE)

    // Wire type: varint

    internal fun encodeVarintInt(value: Int) {
        val buffer = byteArrayBuffer
        var position = 0
        var valueCur = value
        while (position < MAX_VARINT_SIZE) {
            if ((valueCur and 0x7F.inv()) == 0) {
                buffer[position++] = valueCur.toByte()
                break
            } else {
                buffer[position++] = ((valueCur and 0x7F) or 0x80).toByte()
                valueCur = valueCur ushr 7
            }
        }
        wireWriter.write(buffer, 0, position)
    }

    internal fun encodeVarintUnsignedInt(value: UInt) {
        encodeVarint(WireValue.Varint.encodeUnsignedInt(value))
    }

    internal fun encodeVarintSignedInt(value: Int) {
        encodeVarint(WireValue.Varint.encodeSignedInt(value))
    }

    internal fun encodeVarintZigZagInt(value: Int) {
        encodeVarint(WireValue.Varint.encodeZigZagInt(value))
    }

    internal fun encodeVarint(value: WireValue.Varint) {
        val buffer = byteArrayBuffer
        var position = 0
        var valueCur = value.value
        while (position < MAX_VARINT_SIZE) {
            if ((valueCur and 0x7FUL.inv()) == 0UL) {
                buffer[position++] = valueCur.toByte()
                break
            } else {
                buffer[position++] = ((valueCur and 0x7FU) or 0x80U).toByte()
                valueCur = valueCur shr 7
            }
        }
        wireWriter.write(buffer, 0, position)
    }


    internal fun encodeVarintUnsignedLong(value: ULong) {
        encodeVarint(WireValue.Varint.encodeUnsignedLong(value))
    }

    internal fun encodeVarintSignedLong(value: Long) {
        encodeVarint(WireValue.Varint.encodeSignedLong(value))
    }

    internal fun encodeVarintZigZagLong(value: Long) {
        encodeVarint(WireValue.Varint.encodeZigZagLong(value))
    }

    internal fun encodeVarintBoolean(value: Boolean) {
        encodeVarint(WireValue.Varint.encodeBoolean(value))
    }

    // Wire type: i32

    internal fun encodeI32(value: WireValue.I32) {
        val buffer = byteArrayBuffer
        for (i in 0 until 4) {
            buffer[i] = (value.value shr (8 * i)).toByte()
        }
        wireWriter.write(buffer, 0, 4)
    }

    internal fun encodeI32UnsignedInt(value: UInt) {
        encodeI32(WireValue.I32.encodeUnsignedInt(value))
    }
    internal fun encodeI32SignedInt(value: Int) {
        encodeI32(WireValue.I32.encodeSignedInt(value))
    }

    internal fun encodeI32Float(value: Float) {
        encodeI32(WireValue.I32.encodeFloat(value))
    }

    // Wire type: i64

    internal fun encodeI64(value: WireValue.I64) {
        val buffer = byteArrayBuffer
        for (i in 0 until 8) {
            buffer[i] = (value.value shr (8 * i)).toByte()
        }
        wireWriter.write(buffer, 0, 8)
    }

    internal fun encodeI64UnsignedLong(value: ULong) {
        encodeI64(WireValue.I64.encodeUnsignedLong(value))
    }

    internal fun encodeI64SignedLong(value: Long) {
        encodeI64(WireValue.I64.encodeSignedLong(value))
    }

    internal fun encodeI64Double(value: Double) {
        encodeI64(WireValue.I64.encodeDouble(value))
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

    internal fun encodeLenByteArray(value: ByteArray) {
        encodeLen(WireValue.Len.encodeByteArray(value))
    }

    internal fun encodeLenString(value: String) {
        encodeLen(WireValue.Len.encodeString(value))
    }

    internal inline fun encodeLenFields(length: Int, fieldBlock: (BinaryFieldEncoder) -> Unit) {
        encodeLenPrefix(length.toUInt())
        fieldBlock(fieldEncoder)
    }

    // Unknown fields

    internal fun encodeUnknownField(value: WireValue) {
        when (value) {
            is WireValue.Varint -> encodeVarint(value)
            is WireValue.I32 -> encodeI32(value)
            is WireValue.I64 -> encodeI64(value)
            is WireValue.Len -> encodeLen(value)
            is WireValue.Group -> throw UnsupportedOperationException()
        }
    }
}
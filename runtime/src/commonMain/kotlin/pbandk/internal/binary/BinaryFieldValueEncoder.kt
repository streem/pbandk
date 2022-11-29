package pbandk.internal.binary

import pbandk.internal.binary.kotlin.WireWriter
import kotlin.jvm.JvmField

/**
 * This class provides a method for encoding
 * [every "wire type" in the protobuf binary wire format](https://developers.google.com/protocol-buffers/docs/encoding#structure):
 * `varint`, `i32`, `i64`, `len`. A specialized method is provided for every built-in Kotlin type that can
 * be used to hold one of the wire type values.
 */
internal class BinaryFieldValueEncoder(
    private val wireWriter: WireWriter,
    private val fieldEncoder: BinaryFieldEncoder
) {
    @JvmField
    private val byteArrayBuffer = ByteArray(MAX_VARINT_SIZE)

    // Wire type: varint

    fun encodeVarintUnsignedInt(value: Int) {
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

    fun encodeVarintSignedInt(value: Int) {
        if (value >= 0) {
            encodeVarintUnsignedInt(value)
        } else {
            // Must sign-extend.
            encodeVarintUnsignedLong(value.toLong())
        }
    }

    fun encodeVarintZigZagInt(value: Int) {
        encodeVarintUnsignedInt(value.zigZagEncoded)
    }

    fun encodeVarintUnsignedLong(value: Long) {
        val buffer = byteArrayBuffer
        var position = 0
        var valueCur = value
        while (position < MAX_VARINT_SIZE) {
            if ((valueCur and 0x7FL.inv()) == 0L) {
                buffer[position++] = valueCur.toByte()
                break
            } else {
                buffer[position++] = ((valueCur and 0x7F) or 0x80).toByte()
                valueCur = valueCur ushr 7
            }
        }
        wireWriter.write(buffer, 0, position)
    }

    fun encodeVarintSignedLong(value: Long) {
        encodeVarintUnsignedLong(value)
    }

    fun encodeVarintZigZagLong(value: Long) {
        encodeVarintUnsignedLong(value.zigZagEncoded)
    }

    fun encodeVarintBoolean(value: Boolean) {
        val buffer = byteArrayBuffer
        buffer[0] = if (value) 1 else 0
        wireWriter.write(buffer, 0, 1)
    }

    // Wire type: i32

    fun encodeI32UnsignedInt(value: Int) {
        val buffer = byteArrayBuffer
        for (i in 0 until 4) {
            buffer[i] = (value shr (8 * i)).toByte()
        }
        wireWriter.write(buffer, 0, 4)
    }

    fun encodeI32SignedInt(value: Int) {
        encodeI32UnsignedInt(value)
    }

    fun encodeI32Float(value: Float) {
        encodeI32UnsignedInt(value.toRawBits())
    }

    // Wire type: i64

    fun encodeI64UnsignedLong(value: Long) {
        val buffer = byteArrayBuffer
        for (i in 0 until 8) {
            buffer[i] = (value shr (8 * i)).toByte()
        }
        wireWriter.write(buffer, 0, 8)
    }

    fun encodeI64SignedLong(value: Long) {
        encodeI64UnsignedLong(value)
    }

    fun encodeI64Double(value: Double) {
        encodeI64UnsignedLong(value.toRawBits())
    }

    // Wire type: len

    @Suppress("NOTHING_TO_INLINE")
    inline fun encodeLenPrefix(length: Int) {
        encodeVarintUnsignedInt(length)
    }

    fun encodeLenByteArray(value: ByteArray) {
        encodeLenPrefix(value.size)
        wireWriter.write(value, 0, value.size)
    }

    fun encodeLenString(value: String) {
        encodeLenByteArray(value.encodeToByteArray())
    }

    inline fun encodeLenFields(length: Int, fieldBlock: (BinaryFieldEncoder) -> Unit) {
        encodeLenPrefix(length)
        fieldBlock(fieldEncoder)
    }
}
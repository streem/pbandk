package pbandk.internal.binary

import pbandk.UnknownField
import pbandk.binary.WireType
import kotlin.jvm.JvmInline

public sealed interface WireValue {
    public val wireType: Int

    public val size: Int

    @JvmInline
    public value class Varint internal constructor(internal val value: ULong) : WireValue {
        override val wireType: Int get() = WireType.VARINT.value

        override val size: Int get() {
            // Taken from CodedOutputStream.java's computeUInt64SizeNoTag
            @Suppress("NAME_SHADOWING")
            var value = value.toLong()
            if (value and (0L.inv() shl 7) == 0L) return 1
            if (value < 0L) return 10
            var n = 2
            if (value and (0L.inv() shl 35) != 0L) {
                n += 4
                value = value ushr 28
            }
            if (value and (0L.inv() shl 21) != 0L) {
                n += 2
                value = value ushr 14
            }
            if (value and (0L.inv() shl 14) != 0L) {
                n += 1
            }
            return n
        }

        internal val decodeUnsignedInt: UInt get() = value.toUInt()
        internal val decodeSignedInt: Int get() = value.toInt()
        internal val decodeZigZagInt: Int get() = value.toInt().zigZagDecoded
        internal val decodeUnsignedLong: ULong get() = value
        internal val decodeSignedLong: Long get() = value.toLong()
        internal val decodeZigZagLong: Long get() = value.toLong().zigZagDecoded
        internal val decodeBoolean: Boolean get() = value != 0UL

        public companion object {
            // Don't sign extend when converting to ULong
            internal fun encodeUnsignedInt(value: UInt) = Varint(value.toULong())
            // Sign extend when converting to ULong
            internal fun encodeSignedInt(value: Int) = Varint(value.toULong())
            internal fun encodeZigZagInt(value: Int) = Varint(value.zigZagEncoded.toUInt().toULong())
            internal fun encodeUnsignedLong(value: ULong) = Varint(value)
            internal fun encodeSignedLong(value: Long) = Varint(value.toULong())
            internal fun encodeZigZagLong(value: Long) = Varint(value.zigZagEncoded.toULong())
            internal fun encodeBoolean(value: Boolean) = Varint(if (value) 1UL else 0UL)
        }
    }

    @JvmInline
    public value class I32 internal constructor(internal val value: UInt) : WireValue {
        override val wireType: Int get() = WireType.FIXED32.value

        override val size: Int get() = 4

        internal val decodeUnsignedInt: UInt get() = value
        internal val decodeSignedInt: Int get() = value.toInt()
        internal val decodeFloat: Float get() = Float.fromBits(value.toInt())

        public companion object {
            internal fun encodeUnsignedInt(value: UInt) = I32(value)
            internal fun encodeSignedInt(value: Int) = I32(value.toUInt())
            internal fun encodeFloat(value: Float) = I32(value.toRawBits().toUInt())
        }
    }

    @JvmInline
    public value class I64 internal constructor(internal val value: ULong) : WireValue {
        override val wireType: Int get() = WireType.FIXED64.value

        override val size: Int get() = 8

        internal val decodeUnsignedLong: ULong get() = value
        internal val decodeSignedLong: Long get() = value.toLong()
        internal val decodeDouble: Double get() = Double.fromBits(value.toLong())

        public companion object {
            internal fun encodeUnsignedLong(value: ULong) = I64(value)
            internal fun encodeSignedLong(value: Long) = I64(value.toULong())
            internal fun encodeDouble(value: Double) = I64(value.toRawBits().toULong())
        }
    }

    @JvmInline
    public value class Len internal constructor(internal val value: ByteArray) : WireValue {
        override val wireType: Int get() = WireType.LENGTH_DELIMITED.value

        override val size: Int get() = Varint.encodeUnsignedInt(value.size.toUInt()).size + value.size

        internal val decodeByteArray: ByteArray get() = value
        internal val decodeString: String get() = value.decodeToString()

        public companion object {
            internal fun encodeByteArray(value: ByteArray) = Len(value)
            internal fun encodeString(value: String) = Len(value.encodeToByteArray())
        }
    }

    @JvmInline
    public value class Group internal constructor(internal val value: List<UnknownField>) : WireValue {
        override val wireType: Int get() = WireType.START_GROUP.value

        override val size: Int get() = value.sumOf { it.size }
    }
    /*
    @JvmInline
    public value class Group internal constructor(internal val value: ByteArray) : WireValue {
        override val wireType: Int get() = WireType.START_GROUP.value

        override val size: Int get() = Varint.encodeUnsignedInt(value.size.toUInt()).size + value.size
    }
     */
}
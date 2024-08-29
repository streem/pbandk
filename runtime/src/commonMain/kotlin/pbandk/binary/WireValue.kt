package pbandk.binary

import pbandk.InvalidProtocolBufferException
import pbandk.PbandkInternal
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.internal.binary.zigZagDecoded
import pbandk.internal.binary.zigZagEncoded
import pbandk.internal.checkSurrogatePairs
import kotlin.jvm.JvmInline

internal const val MAX_VARINT_SIZE = 10

public sealed interface WireValue {
    public val wireType: WireType

    public val size: Int

    @JvmInline
    public value class Varint internal constructor(
        @property:PbandkInternal
        public val value: ULong
    ) : WireValue {
        override val wireType: WireType get() = WireType.VARINT

        override val size: Int
            get() {
                // Taken from CodedOutputStream.java's computeUInt64SizeNoTag
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
    public value class I32 internal constructor(
        @property:PbandkInternal
        public val value: UInt
    ) : WireValue {
        override val wireType: WireType get() = WireType.FIXED32

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
    public value class I64 internal constructor(
        @property:PbandkInternal
        public val value: ULong
    ) : WireValue {
        override val wireType: WireType get() = WireType.FIXED64

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
    public value class Len internal constructor(
        @property:PbandkInternal
        public val value: ByteArray
    ) : WireValue {
        override val wireType: WireType get() = WireType.LENGTH_DELIMITED

        override val size: Int get() = sizeWithLenPrefix(value.size)

        internal val decodeByteArray: ByteArray get() = value
        internal val decodeString: String
            get() = try {
                value.decodeToString(throwOnInvalidSequence = true).checkSurrogatePairs()
            } catch (e: Exception) {
                throw InvalidProtocolBufferException("Message did not contain a valid UTF-8 string", e)
            }

        public companion object {
            internal fun encodeByteArray(value: ByteArray) = Len(value)
            internal fun encodeString(value: String) = Len(
                try {
                    value.checkSurrogatePairs().encodeToByteArray(throwOnInvalidSequence = true)
                } catch (e: Exception) {
                    throw InvalidProtocolBufferException("Attempted to encode an invalid string", e)
                }
            )

            internal fun sizeWithLenPrefix(rawSize: Int) = Varint.encodeUnsignedInt(rawSize.toUInt()).size + rawSize
        }
    }

    @JvmInline
    public value class Group internal constructor(
        @property:PbandkInternal
        public val value: List<UnknownField>
    ) : WireValue {
        override val wireType: WireType get() = WireType.START_GROUP

        override val size: Int get() = value.sumOf { it.size }
    }

    public object EndGroup : WireValue {
        override val wireType: WireType get() = WireType.END_GROUP

        override val size: Int get() = 0
    }

    public companion object {
        @PublicForGeneratedCode
        public fun varint(value: ULong): Varint = Varint(value)

        @PublicForGeneratedCode
        public fun i32(value: UInt): I32 = I32(value)

        @PublicForGeneratedCode
        public fun i64(value: ULong): I64 = I64(value)

        @PublicForGeneratedCode
        public fun len(value: ByteArray): Len = Len(value)

        @PublicForGeneratedCode
        public fun group(value: List<UnknownField>): Group = Group(value)

        @PublicForGeneratedCode
        public fun endGroup(): EndGroup = EndGroup
    }
}
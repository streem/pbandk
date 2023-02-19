package pbandk.internal.binary

import pbandk.binary.WireType
import kotlin.jvm.JvmInline

private const val TAG_TYPE_BITS = 3
private const val TAG_TYPE_MASK = (1 shl TAG_TYPE_BITS) - 1

@JvmInline
internal value class Tag(val value: UInt) {
    constructor(value: Int) : this(value.toUInt())
    constructor(fieldNumber: Int, wireType: WireType) : this(fieldNumber shl TAG_TYPE_BITS or wireType.value)

    /** The wire type of this tag (the lower 3 bits). */
    val wireType: WireType get() = WireType(value.toInt() and TAG_TYPE_MASK)

    /** The field number of this tag (the upper 29 bits). */
    val fieldNumber: Int get() = value.shr(TAG_TYPE_BITS).toInt()

    companion object {
        val Zero = Tag(0)

        fun size(fieldNumber: Int): Int =
            WireValue.Varint.encodeUnsignedInt(Tag(fieldNumber, WireType(0)).value).size
    }
}
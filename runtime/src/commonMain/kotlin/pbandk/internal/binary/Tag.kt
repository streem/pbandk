package pbandk.internal.binary

private const val TAG_TYPE_BITS = 3
private const val TAG_TYPE_MASK = (1 shl TAG_TYPE_BITS) - 1

internal inline class Tag(val value: Int) {
    constructor(fieldNumber: Int, wireType: WireType) : this(fieldNumber shl TAG_TYPE_BITS or wireType.value)

    /** The wire type of this tag (the lower 3 bits). */
    val wireType: WireType get() = WireType(value and TAG_TYPE_MASK)

    /** The field number of this tag (the upper 29 bits). */
    val fieldNumber: Int get() = value.ushr(TAG_TYPE_BITS)
}
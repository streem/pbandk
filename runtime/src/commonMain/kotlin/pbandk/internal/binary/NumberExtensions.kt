package pbandk.internal.binary

// Note:  the right-shift must be arithmetic
internal val Int.zigZagEncoded get() = (this shl 1) xor (this shr 31)

// Note:  the right-shift must be arithmetic
internal val Long.zigZagEncoded get() = (this shl 1) xor (this shr 63)

internal val Int.zigZagDecoded get() = this.ushr(1) xor -(this and 1)

internal val Long.zigZagDecoded get() = this.ushr(1) xor -(this and 1)

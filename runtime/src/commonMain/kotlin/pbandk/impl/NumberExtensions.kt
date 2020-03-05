package pbandk.impl

// Note:  the right-shift must be arithmetic
val Int.zigZagEncoded get() = (this shl 1) xor (this shr 31)

// Note:  the right-shift must be arithmetic
val Long.zigZagEncoded get() = (this shl 1) xor (this shr 63)

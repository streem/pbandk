package pbandk.internal.binary

import pbandk.internal.binary.kotlin.KotlinBinaryMessageEncoder

internal actual fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder {
    return KotlinBinaryMessageEncoder.allocate(size)
}
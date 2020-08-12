package pbandk.internal.binary

import pbandk.internal.binary.kotlin.KotlinBinaryMessageMarshaller

internal actual fun BinaryMessageMarshaller.Companion.allocate(size: Int): ByteArrayMessageMarshaller {
    return KotlinBinaryMessageMarshaller.allocate(size)
}
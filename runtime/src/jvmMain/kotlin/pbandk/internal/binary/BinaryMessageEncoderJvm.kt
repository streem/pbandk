package pbandk.internal.binary

internal actual fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder {
    return ByteArrayCodedStreamBinaryMessageEncoder.allocate(size)
}
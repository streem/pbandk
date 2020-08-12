package pbandk.internal.binary

internal actual fun BinaryMessageMarshaller.Companion.allocate(size: Int): ByteArrayMessageMarshaller {
    return ByteArrayCodedStreamBinaryMessageMarshaller.allocate(size)
}
package pbandk.internal.binary

import pbandk.protobufjs.ProtobufjsBinaryMessageMarshaller

internal actual fun BinaryMessageMarshaller.Companion.allocate(size: Int): ByteArrayMessageMarshaller {
    return ProtobufjsBinaryMessageMarshaller.allocate(size)
}
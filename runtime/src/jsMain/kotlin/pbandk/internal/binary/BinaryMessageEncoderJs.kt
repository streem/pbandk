package pbandk.internal.binary

import pbandk.protobufjs.ProtobufjsBinaryMessageEncoder

internal actual fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder {
    return ProtobufjsBinaryMessageEncoder.allocate(size)
}
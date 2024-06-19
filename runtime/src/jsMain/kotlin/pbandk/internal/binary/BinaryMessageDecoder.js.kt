package pbandk.internal.binary

import pbandk.MessageDecoder
import pbandk.internal.binary.kotlin.ByteArrayWireReader

internal actual fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder {
    return BinaryMessageDecoder(BinaryFieldDecoder(ByteArrayWireReader(arr)))
}
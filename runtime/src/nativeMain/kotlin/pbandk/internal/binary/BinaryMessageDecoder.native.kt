package pbandk.internal.binary

import pbandk.MessageDecoder
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import pbandk.internal.binary.kotlin.KotlinBinaryWireDecoder

internal actual fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder {
    return BinaryMessageDecoder(KotlinBinaryWireDecoder(ByteArrayWireReader(arr)))
}

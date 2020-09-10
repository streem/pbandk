package pbandk.internal.binary

import pbandk.MessageDecoder
import pbandk.internal.asUint8Array
import pbandk.protobufjs.ProtobufjsBinaryWireDecoder
import pbandk.protobufjs.Reader

internal actual fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder {
    return BinaryMessageDecoder(ProtobufjsBinaryWireDecoder(Reader.create(arr.asUint8Array())))
}

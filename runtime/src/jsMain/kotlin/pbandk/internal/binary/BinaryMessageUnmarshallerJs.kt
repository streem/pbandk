package pbandk.internal.binary

import pbandk.MessageUnmarshaller
import pbandk.internal.asUint8Array
import pbandk.protobufjs.ProtobufjsBinaryWireUnmarshaller
import pbandk.protobufjs.Reader

internal actual fun BinaryMessageUnmarshaller.Companion.fromByteArray(arr: ByteArray): MessageUnmarshaller {
    return BinaryMessageUnmarshaller(ProtobufjsBinaryWireUnmarshaller(Reader.create(arr.asUint8Array())))
}

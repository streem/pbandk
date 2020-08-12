package pbandk.internal.binary

import pbandk.MessageUnmarshaller
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import pbandk.internal.binary.kotlin.KotlinBinaryWireUnmarshaller

internal actual fun BinaryMessageUnmarshaller.Companion.fromByteArray(arr: ByteArray): MessageUnmarshaller {
    return BinaryMessageUnmarshaller(KotlinBinaryWireUnmarshaller(ByteArrayWireReader(arr)))
}

package pbandk.internal.binary

import com.google.protobuf.CodedInputStream
import pbandk.*
import java.io.InputStream
import java.nio.ByteBuffer

internal actual fun BinaryMessageUnmarshaller.Companion.fromByteArray(arr: ByteArray): MessageUnmarshaller {
    return BinaryMessageUnmarshaller(CodedStreamBinaryWireUnmarshaller(CodedInputStream.newInstance(arr)))
}

internal fun BinaryMessageUnmarshaller.Companion.fromInputStream(stream: InputStream): MessageUnmarshaller {
    return BinaryMessageUnmarshaller(CodedStreamBinaryWireUnmarshaller(CodedInputStream.newInstance(stream)))
}

internal fun BinaryMessageUnmarshaller.Companion.fromByteBuffer(buffer: ByteBuffer): MessageUnmarshaller {
    return BinaryMessageUnmarshaller(CodedStreamBinaryWireUnmarshaller(CodedInputStream.newInstance(buffer)))
}
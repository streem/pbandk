package pbandk.internal.binary

import com.google.protobuf.CodedInputStream
import pbandk.*
import java.io.InputStream
import java.nio.ByteBuffer

internal actual fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder {
    return BinaryMessageDecoder(CodedStreamBinaryWireDecoder(CodedInputStream.newInstance(arr)))
}

internal fun BinaryMessageDecoder.Companion.fromInputStream(stream: InputStream): MessageDecoder {
    return BinaryMessageDecoder(CodedStreamBinaryWireDecoder(CodedInputStream.newInstance(stream)))
}

internal fun BinaryMessageDecoder.Companion.fromByteBuffer(buffer: ByteBuffer): MessageDecoder {
    return BinaryMessageDecoder(CodedStreamBinaryWireDecoder(CodedInputStream.newInstance(buffer)))
}
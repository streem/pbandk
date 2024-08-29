package pbandk.internal.binary

import pbandk.MessageDecoder
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import java.io.InputStream
import java.nio.ByteBuffer

private fun fromByteArray(arr: ByteArray, offset: Int, length: Int) =
    BinaryMessageDecoder(BinaryDecoderContext(ByteArrayWireReader(arr, offset, length)).fieldDecoder)

// TODO: Maybe allow the caller to pass in optional offset and length for reading from the array
internal actual fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder =
    fromByteArray(arr, 0, arr.size)

// TODO: Maybe expose the [bufferSize] parameter from [InputStreamWireReader] to the caller
internal fun BinaryMessageDecoder.Companion.fromInputStream(stream: InputStream, expectedSize: Int = -1): MessageDecoder {
    val wireReader = if (expectedSize != -1) {
        InputStreamWireReader(stream, expectedSize)
    } else {
        InputStreamWireReader(stream)
    }
    return BinaryMessageDecoder(BinaryDecoderContext(wireReader).fieldDecoder)
}

internal fun BinaryMessageDecoder.Companion.fromByteBuffer(buffer: ByteBuffer): MessageDecoder {
    if (buffer.hasArray()) {
        return fromByteArray(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining())
    }

    // Using the ByteBuffer API to access individual bytes is very slow, so just copy the buffer to an array.
    val arr = ByteArray(buffer.remaining())
    buffer.duplicate().get(arr)
    return fromByteArray(arr, 0, arr.size)
}
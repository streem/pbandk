package pbandk

import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.OutputStreamWireWriter
import pbandk.internal.binary.fromByteBuffer
import pbandk.internal.binary.fromInputStream
import pbandk.internal.binary.kotlin.KotlinBinaryWireEncoder
import pbandk.internal.binary.kotlin.readerRawVarint64
import pbandk.internal.binary.kotlin.writerRawVarint32
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer

/**
 * Encode this message to [stream] using the protocol buffer binary encoding.
 *
 * @return number of bytes written to [stream]
 */
public fun <T : Message> T.encodeToStream(stream: OutputStream): Int {
    val wireWriter = OutputStreamWireWriter(stream)
    encodeWith(BinaryMessageEncoder(KotlinBinaryWireEncoder(wireWriter)))
    wireWriter.flush()
    return wireWriter.totalBytesWritten
}

/**
 * Decode a binary protocol buffer message from [stream].
 */
public fun <T : Message> Message.Companion<T>.decodeFromStream(stream: InputStream, expectedSize: Int = -1): T =
    decodeWith(BinaryMessageDecoder.fromInputStream(stream, expectedSize))

/**
 * Decode a binary protocol buffer message from [buffer]. The data starting from the ByteBuffer's current position to
 * its limit will be read. Note that the ByteBuffer's position won't be changed by this function.
 */
public fun <T : Message> Message.Companion<T>.decodeFromByteBuffer(buffer: ByteBuffer): T =
    decodeWith(BinaryMessageDecoder.fromByteBuffer(buffer))

/**
 * Read the next message of type T, in the [stream] of size-delimited Messages, such as is written by the Java method
 * AbstractMessageLite.writeDelimitedTo(OutputStream) and read by Message.parseDelimitedFrom(InputStream).
 * A null is returned when all messages have been read. The caller must close the stream.
 */
public fun <T : Message> Message.Companion<T>.decodeDelimitedFromStream(stream: InputStream): T? {
    val firstByte = stream.read()
    if (firstByte == -1) {  // eof
        return null
    }

    // variable length (base 128) integer returned as an Int
    val length = (readerRawVarint64(firstByte.toByte()) { readByte(stream) }).toInt()
    return this.decodeFromStream(stream, length)
}

private fun readByte(input: InputStream): Byte {
    val ib = input.read()
    if (ib == -1) {  // eof
        throw InvalidProtocolBufferException.truncatedMessage()
    }
    return ib.toByte()
}

/**
 * Write a message of type T, to a [stream] of size-delimited Messages.
 * Like encodeToStream(OutputStream), but writes the size of the message as a varint before writing the data.
 * This allows more data to be written to the stream after the message without the need to delimit
 * the message data yourself.
 * Use Message.Companion<T>.parseDelimitedFrom(InputStream) to read these streams.
 */
public fun <T : Message> T.encodeDelimitedToStream(stream: OutputStream) {
    writeVlen(this.protoSize, stream)
    this.encodeToStream(stream)
}

private fun writeVlen(value: Int, output: OutputStream) {
    val buffer = writerRawVarint32(value)
    output.write(buffer)
}

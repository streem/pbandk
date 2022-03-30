package pbandk

import pbandk.internal.binary.*
import pbandk.internal.binary.kotlin.KotlinBinaryWireEncoder
import pbandk.internal.binary.kotlin.ReturnRawByte
import pbandk.internal.binary.kotlin.readerRawVarint64
import pbandk.internal.binary.kotlin.writerRawVarint32
import java.io.*
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
    val length = readVlen(stream)
    if (length < 0) {
        return null
    }
    return this.decodeFromStream(stream, length)
}

// variable length (base 128) integer returned as an Int
private fun readVlen(input: InputStream): Int {
    val lenLong = readerRawVarint64 {readByte(input)}
    return lenLong.toInt()
}

private fun readByte(input: InputStream): ReturnRawByte {
    val ib = input.read()
    val eof = (ib == -1)
    return ReturnRawByte(ib.toByte(), eof)
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

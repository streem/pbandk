package pbandk

import pbandk.internal.binary.*
import pbandk.internal.binary.kotlin.KotlinBinaryWireEncoder
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
 * A null is returned when all messages have been read, and the stream is closed.
 */
public fun <T : Message> Message.Companion<T>.parseDelimitedFrom(stream: InputStream): T? {
    val length = readVlen(stream)
    if (length < 0) {
        stream.close()
        return null
    }
    val message = stream.readNBytes(length)
    if (message.size != length) {
        throw IOException("damaged delimited stream")
    }
    return this.decodeFromByteArray(message)
}

// variable length (base 128) integer returned as an Int
private fun readVlen(input: InputStream): Int {
    var ib: Int = input.read()
    if (ib == -1) {
        return -1
    }
    var result = ib.and(0x7F)
    var shift = 7
    while (ib.and(0x80) != 0) {
        ib = input.read()
        if (ib == -1) {
            return -1
        }
        val im = ib.and(0x7F).shl(shift)
        result = result.or(im)
        shift += 7
    }
    return result
}

/**
 * Write a message of type T, to a [stream] of size-delimited Messages.
 * Like encodeToStream(OutputStream), but writes the size of the message as a varint before writing the data.
 * This allows more data to be written to the stream after the message without the need to delimit
 * the message data yourself.
 * Use Message.Companion<T>.parseDelimitedFrom(InputStream) to read these streams.
 */
public fun <T : Message> T.writeDelimitedTo(stream: OutputStream) {
    val bb = this.encodeToByteArray()
    writeVlen(bb.size, stream)
    stream.write(bb)
}

private fun writeVlen(value: Int, output: OutputStream) {
    val buffer = ByteArray(MAX_VARINT_SIZE)
    var position = 0
    var valueCur = value
    while (position < MAX_VARINT_SIZE) {
        if ((valueCur and 0x7F.inv()) == 0) {
            buffer[position++] = valueCur.toByte()
            break
        } else {
            buffer[position++] = ((valueCur and 0x7F) or 0x80).toByte()
            valueCur = valueCur ushr 7
        }
    }
    output.write(buffer, 0, position)
}

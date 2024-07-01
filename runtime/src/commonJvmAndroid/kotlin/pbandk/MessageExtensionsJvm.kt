package pbandk

import pbandk.gen.messageDescriptor
import pbandk.internal.binary.BinaryFieldDecoder
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.InputStreamWireReader
import pbandk.internal.binary.OutputStreamWireWriter
import pbandk.internal.binary.fromByteBuffer
import pbandk.internal.binary.fromInputStream
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
    encodeWith(BinaryMessageEncoder(BinaryFieldEncoder(wireWriter)))
    wireWriter.flush()
    return wireWriter.totalBytesWritten
}

/**
 * Decode a binary protocol buffer message from [stream].
 */
@Throws(InvalidProtocolBufferException::class)
public fun <T : Message> Message.Companion<T>.decodeFromStream(stream: InputStream, expectedSize: Int = -1): T =
    decodeWith(BinaryMessageDecoder.fromInputStream(stream, expectedSize))

/**
 * Decode a binary protocol buffer message from [buffer]. The data starting from the ByteBuffer's current position to
 * its limit will be read. Note that the ByteBuffer's position won't be changed by this function.
 */
@Throws(InvalidProtocolBufferException::class)
public fun <T : Message> Message.Companion<T>.decodeFromByteBuffer(buffer: ByteBuffer): T =
    decodeWith(BinaryMessageDecoder.fromByteBuffer(buffer))

/**
 * Decode the next message of type [T] from the [stream] of size-delimited binary protocol buffer messages. `null` is
 * returned when all messages have been read. The caller is responsible for closing [stream].
 *
 * Supports the same encoding as is used by the Java methods `Message.writeDelimitedTo(OutputStream)` and
 * `Message.parseDelimitedFrom(InputStream)`.
 *
 * @see [encodeDelimitedToStream]
 */
@Throws(InvalidProtocolBufferException::class)
public fun <T : Message> Message.Companion<T>.decodeDelimitedFromStream(stream: InputStream): T? {
    val firstByte = stream.read()
    if (firstByte == -1) {  // eof
        return null
    }

    val fieldDecoder = BinaryFieldDecoder(InputStreamWireReader(firstByte.toByte(), stream))
    return try {
        descriptor.messageValueType.decodeFromBinary(fieldDecoder.lenValueDecoder)
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }
}

/**
 * Encode this message and its size to [stream], a stream of size-delimited messages using the protocol buffer binary
 * encoding. Like [encodeToStream], but writes the size of the message as a varint before writing the data. This allows
 * more data to be written to the stream after the message without the need to delimit the message data yourself.
 *
 * Supports the same encoding as is used by the Java methods `Message.writeDelimitedTo(OutputStream)` and
 * `Message.parseDelimitedFrom(InputStream)`.
 *
 * @see [decodeDelimitedFromStream]
 */
public fun <T : Message> T.encodeDelimitedToStream(stream: OutputStream) {
    val wireWriter = OutputStreamWireWriter(stream)
    messageDescriptor.messageValueType.encodeToBinary(this, BinaryFieldEncoder(wireWriter).valueEncoder)
    wireWriter.flush()
}
package pbandk

import com.google.protobuf.CodedOutputStream
import pbandk.internal.binary.*
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer

fun <T : Message> T.encodeToStream(stream: OutputStream) {
    val codedOutputStream = CodedOutputStream.newInstance(stream)
    encodeWith(BinaryMessageEncoder(CodedStreamBinaryWireEncoder(codedOutputStream)))
    codedOutputStream.flush()
}

fun <T : Message> Message.Companion<T>.decodeFromStream(stream: InputStream): T =
    decodeWith(BinaryMessageDecoder.fromInputStream(stream))

fun <T : Message> Message.Companion<T>.decodeFromByteBuffer(buffer: ByteBuffer): T =
    decodeWith(BinaryMessageDecoder.fromByteBuffer(buffer))

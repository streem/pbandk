package pbandk

import com.google.protobuf.CodedOutputStream
import pbandk.internal.binary.*
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer

fun <T : Message> T.protoMarshal(stream: OutputStream) {
    val codedOutputStream = CodedOutputStream.newInstance(stream)
    marshal(BinaryMessageMarshaller(CodedStreamBinaryWireMarshaller(codedOutputStream)))
    codedOutputStream.flush()
}

fun <T : Message> Message.Companion<T>.protoUnmarshal(stream: InputStream): T =
    unmarshal(BinaryMessageUnmarshaller.fromInputStream(stream))

fun <T : Message> Message.Companion<T>.protoUnmarshal(buffer: ByteBuffer): T =
    unmarshal(BinaryMessageUnmarshaller.fromByteBuffer(buffer))

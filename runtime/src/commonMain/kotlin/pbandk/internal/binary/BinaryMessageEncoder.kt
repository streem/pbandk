package pbandk.internal.binary

import pbandk.Message
import pbandk.MessageEncoder
import pbandk.internal.types.primitive.Message.encodeToBinaryNoLength

internal open class BinaryMessageEncoder(private val fieldEncoder: BinaryFieldEncoder) : MessageEncoder {
    override fun <M : Message> writeMessage(message: M) {
        encodeToBinaryNoLength(message, fieldEncoder)
    }

    companion object
}

internal expect fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder

internal interface ByteArrayMessageEncoder : MessageEncoder {
    fun toByteArray(): ByteArray
}

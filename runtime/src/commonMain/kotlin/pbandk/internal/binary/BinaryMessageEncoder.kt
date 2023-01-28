package pbandk.internal.binary

import pbandk.Message
import pbandk.MessageEncoder
import pbandk.gen.messageDescriptor

internal open class BinaryMessageEncoder(private val fieldEncoder: BinaryFieldEncoder) : MessageEncoder {
    override fun <M : Message> writeMessage(message: M) {
        message.messageDescriptor.messageValueType.encodeToBinaryNoLength(message, fieldEncoder)
    }

    companion object
}

internal expect fun BinaryMessageEncoder.Companion.allocate(size: Int): ByteArrayMessageEncoder

internal interface ByteArrayMessageEncoder : MessageEncoder {
    fun toByteArray(): ByteArray
}

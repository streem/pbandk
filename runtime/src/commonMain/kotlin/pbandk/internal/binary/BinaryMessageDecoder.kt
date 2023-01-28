package pbandk.internal.binary

import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.MessageDecoder

internal class BinaryMessageDecoder(private val fieldDecoder: BinaryFieldDecoder) : MessageDecoder {

    override fun <M : Message> readMessage(messageCompanion: Message.Companion<M>): M = try {
        messageCompanion.descriptor.messageValueType.decodeFromBinaryNoLength(fieldDecoder)
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    internal companion object
}

internal expect fun BinaryMessageDecoder.Companion.fromByteArray(arr: ByteArray): MessageDecoder

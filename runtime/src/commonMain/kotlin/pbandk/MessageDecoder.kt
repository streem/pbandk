package pbandk

public interface MessageDecoder {
    @Throws(InvalidProtocolBufferException::class)
    public fun <M : Message> readMessage(messageCompanion: Message.Companion<M>): M
}

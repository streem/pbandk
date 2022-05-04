package pbandk

public interface MessageDecoder {
    public fun <M : Message> readMessage(messageCompanion: Message.Companion<M>): M
}

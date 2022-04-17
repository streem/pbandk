package pbandk

public interface MessageDecoder {
    public fun <T : Message> readMessage(messageCompanion: Message.Companion<T>): T
}

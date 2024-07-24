package pbandk

public interface MessageDecoder {
    @Throws(InvalidProtocolBufferException::class)
    public fun <T : Message> readMessage(
        messageCompanion: Message.Companion<T>,
        fieldFn: (Int, Any) -> Unit
    ): Map<Int, UnknownField>
}
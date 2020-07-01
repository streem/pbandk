package pbandk

interface MessageUnmarshaller {
    fun <T : Message> readMessage(
        messageCompanion: Message.Companion<T>,
        fieldFn: (Int, Any) -> Unit
    ): Map<Int, UnknownField>
}

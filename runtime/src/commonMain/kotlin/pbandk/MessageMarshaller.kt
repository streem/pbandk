package pbandk

interface MessageMarshaller {
    fun <T : Message> writeMessage(message: T)
}

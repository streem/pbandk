package pbandk

interface MessageEncoder {
    fun <T : Message> writeMessage(message: T)
}

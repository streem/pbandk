package pbandk

public interface MessageEncoder {
    public fun <T : Message> writeMessage(message: T)
}

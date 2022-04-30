package pbandk

public interface MessageEncoder {
    public fun <M : Message> writeMessage(message: M)
}

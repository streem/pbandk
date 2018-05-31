package pbandk

expect class Unmarshaller {

    // 0 means there is no next tag
    fun readTag(): Int
    fun unknownField()
    fun unknownFields(): Map<Int, UnknownField>

    fun readBytes(): ByteArr
    fun readString(): String

    fun <T> readEnum(knownValues: Map<Int, T>, create: (Int) -> T): T
    fun <T : Message> readMessage(s: Message.Companion<T>): T

    companion object {
        fun fromByteArray(arr: ByteArray): Unmarshaller
    }
}
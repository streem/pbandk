package pbandk

expect class Unmarshaller {

    // 0 means there is no next tag
    fun readTag(): Int
    fun readDouble(): Double
    fun readFloat(): Float
    fun readInt32(): Int
    fun readInt64(): Long
    fun readUInt32(): Int
    fun readUInt64(): Long
    fun readSInt32(): Int
    fun readSInt64(): Long
    fun readFixed32(): Int
    fun readFixed64(): Long
    fun readSFixed32(): Int
    fun readSFixed64(): Long
    fun readBool(): Boolean
    fun readString(): String
    fun readBytes(): ByteArr
    fun readEnum(): Int
    fun <T : Message> readMessage(s: Message.Companion<T>): T
    fun <T> readRepeated(readFn: () -> T): List<T>
    
    fun unknownField()
    fun unknownFields(): Map<Int, UnknownField>

    companion object {
        fun fromByteArray(arr: ByteArray): Unmarshaller
    }
}
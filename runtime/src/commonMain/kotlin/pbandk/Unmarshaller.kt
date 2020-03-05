package pbandk

interface Unmarshaller {
    // 0 means there is no next tag
    fun getTotalBytesRead(): Int
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
    fun <T : Message.Enum> readEnum(s: Message.Enum.Companion<T>): T
    fun <T : Message<T>> readMessage(s: Message.Companion<T>): T
    fun <T> readRepeated(
        appendTo: ListWithSize.Builder<T>?,
        readFn: () -> T,
        neverPacked: Boolean = false
    ): ListWithSize.Builder<T>
    fun <T : Message.Enum> readRepeatedEnum(
        appendTo: ListWithSize.Builder<T>?,
        s: Message.Enum.Companion<T>
    ) : ListWithSize.Builder<T>
    fun <T : Message<T>> readRepeatedMessage(
        appendTo: ListWithSize.Builder<T>?,
        s: Message.Companion<T>,
        neverPacked: Boolean = false
    ) : ListWithSize.Builder<T>
    fun <K, V, T> readMap(
        appendTo: MessageMap.Builder<K, V>?,
        s: Message.Companion<T>,
        neverPacked: Boolean = false
    ) : MessageMap.Builder<K, V> where T : Message<T>, T : Map.Entry<K, V>
    
    fun unknownField()
    fun unknownFields(): Map<Int, UnknownField>

    companion object {
        fun fromByteArray(arr: ByteArray): Unmarshaller = unmarshallerByteArray(arr)
    }
}

internal expect fun unmarshallerByteArray(arr: ByteArray): Unmarshaller
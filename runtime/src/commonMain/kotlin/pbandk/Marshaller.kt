package pbandk

expect class Marshaller {

    fun writeTag(tag: Int): Marshaller
    fun writeDouble(value: Double)
    fun writeFloat(value: Float)
    fun writeInt32(value: Int)
    fun writeInt64(value: Long)
    fun writeUInt32(value: Int)
    fun writeUInt64(value: Long)
    fun writeSInt32(value: Int)
    fun writeSInt64(value: Long)
    fun writeFixed32(value: Int)
    fun writeFixed64(value: Long)
    fun writeSFixed32(value: Int)
    fun writeSFixed64(value: Long)
    fun writeBool(value: Boolean)
    fun writeString(value: String)
    fun writeBytes(value: ByteArr)
    fun writeEnum(value: Message.Enum)
    fun writeMessage(value: Message<*>)
    fun writeUnknownFields(fields: Map<Int, UnknownField>)
    fun <T> writePackedRepeated(list: List<T>, sizeFn: (T) -> Int, writeFn: (T) -> Unit)
    fun <K, V, T : Message<T>> writeMap(
        tag: Int,
        map: Map<K, V>,
        createEntry: (K, V, Map<Int, pbandk.UnknownField>) -> T
    )

    // May not return a value if wasn't created with allocate
    fun complete(): ByteArray?

    companion object {
        fun allocate(size: Int): Marshaller
    }
}
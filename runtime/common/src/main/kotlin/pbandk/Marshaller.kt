package pbandk

expect class Marshaller(arr: ByteArray) {

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
    fun writeEnum(value: Int)
    fun writeMessage(value: Message)
    fun writeUnknownFields(fields: Map<Int, UnknownField>)
    fun <T> writePackedRepeated(list: List<T>, writeFn: (T) -> Unit)

    companion object {
        fun stringToUtf8Bytes(str: String): ByteArray
    }
}
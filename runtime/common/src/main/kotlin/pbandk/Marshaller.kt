package pbandk

expect class Marshaller(arr: ByteArray) {

    fun writeTag(tag: Int): Marshaller

    fun writeString(value: String)
    fun writeBytes(value: ByteArr)

    fun writeEnum(value: Int)

    fun writeMessage(value: Message)

    fun writeUnknownFields(fields: Map<Int, UnknownField>)
}
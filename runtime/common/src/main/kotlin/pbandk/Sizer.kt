package pbandk

expect object Sizer {
    fun tagSize(fieldNum: Int): Int
    fun doubleSize(value: Double): Int
    fun floatSize(value: Float): Int
    fun int32Size(value: Int): Int
    fun int64Size(value: Long): Int
    fun uInt32Size(value: Int): Int
    fun uInt64Size(value: Long): Int
    fun sInt32Size(value: Int): Int
    fun sInt64Size(value: Long): Int
    fun fixed32Size(value: Int): Int
    fun fixed64Size(value: Long): Int
    fun sFixed32Size(value: Int): Int
    fun sFixed64Size(value: Long): Int
    fun boolSize(value: Boolean): Int
    fun stringSize(value: String): Int
    fun bytesSize(value: ByteArr): Int
    fun enumSize(value: Int): Int
    fun messageSize(value: Message): Int
    fun <T> packedRepeatedSize(list: List<T>, sizeFn: (T) -> Int): Int
}
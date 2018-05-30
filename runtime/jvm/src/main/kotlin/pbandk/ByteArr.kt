package pbandk

actual class ByteArr(actual val array: ByteArray) {
    actual override fun equals(other: Any?) = other is ByteArray && other.contentEquals(other)
    actual override fun hashCode() = array.contentHashCode()
    actual override fun toString() = array.contentToString()

    actual companion object {
        actual val empty = ByteArr(byteArrayOf())
    }
}
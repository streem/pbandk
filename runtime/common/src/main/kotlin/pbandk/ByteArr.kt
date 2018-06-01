package pbandk

class ByteArr(val array: ByteArray) {
    override fun equals(other: Any?) = other is ByteArray && other.contentEquals(other)
    override fun hashCode() = array.contentHashCode()
    override fun toString() = array.contentToString()

    companion object {
        val empty = ByteArr(ByteArray(0))
    }
}
package pbandk

expect class ByteArr {
    val array: ByteArray
    override fun equals(other: Any?): Boolean
    override fun hashCode(): Int
    override fun toString(): String

    companion object {
        val empty: ByteArr
    }
}
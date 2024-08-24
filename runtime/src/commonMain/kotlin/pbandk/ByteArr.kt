package pbandk

@Export
public class ByteArr(public val array: ByteArray) {
    override fun equals(other: Any?): Boolean = other is ByteArr && array.contentEquals(other.array)
    override fun hashCode(): Int = array.contentHashCode()
    override fun toString(): String = array.contentToString()


    public companion object {
        public val empty: ByteArr = ByteArr(ByteArray(0))
    }
}
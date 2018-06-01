package pbandk

data class UnknownField(val fieldNum: Int, val value: Value) {

    fun size() =
        if (value is Value.Composite) (Sizer.tagSize(fieldNum) * value.values.size) + value.size()
        else Sizer.tagSize(fieldNum) + value.size()

    sealed class Value {
        abstract fun size(): Int

        data class Varint(val varint: Long) : Value() {
            override fun size() = Sizer.uInt64Size(varint)
        }
        data class Fixed64(val fixed64: Long) : Value() {
            override fun size() = Sizer.fixed64Size(fixed64)
        }
        data class LengthDelimited(val bytes: ByteArr) : Value() {
            override fun size() = Sizer.bytesSize(bytes)
        }
        object StartGroup : Value() {
            override fun size() = TODO()
        }
        object EndGroup : Value() {
            override fun size() = TODO()
        }
        data class Fixed32(val fixed32: Int) : Value() {
            override fun size() = Sizer.fixed32Size(fixed32)
        }
        data class Composite(val values: List<Value>) : Value() {
            override fun size() = values.sumBy { it.size() }
        }
    }
}
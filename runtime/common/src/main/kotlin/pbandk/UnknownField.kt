package pbandk

data class UnknownField(val fieldNum: Int, val value: Value) {
    sealed class Value {
        data class Varint(val varint: Long) : Value()
        data class Fixed64(val fixed64: Long) : Value()
        data class LengthDelimited(val bytes: ByteArr) : Value()
        object StartGroup : Value()
        object EndGroup : Value()
        data class Fixed32(val fixed32: Int) : Value()
        data class Composite(val values: List<Value>) : Value()
    }
}
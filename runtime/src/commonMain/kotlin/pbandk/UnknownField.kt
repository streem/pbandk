package pbandk

data class UnknownField(val fieldNum: Int, val value: Value) {
    constructor(fieldNum: Int, value: Long, fixed: Boolean = false) :
        this(fieldNum, if (fixed) Value.Fixed64(value) else Value.Varint(value))
    constructor(fieldNum: Int, value: Int, fixed: Boolean = false) :
        this(fieldNum, if (fixed) Value.Fixed32(value) else Value.Varint(value.toLong()))
    constructor(fieldNum: Int, value: ByteArr) :
        this(fieldNum, Value.LengthDelimited(value))
    constructor(fieldNum: Int, value: ByteArray) :
        this(fieldNum, Value.LengthDelimited(ByteArr(value)))
    constructor(fieldNum: Int, value: String) :
        this(fieldNum, Value.LengthDelimited(ByteArr(UtilImpl.stringToUtf8(value))))

    fun size() =
        if (value is Value.Composite) (SizerImpl.tagSize(fieldNum) * value.values.size) + value.size()
        else SizerImpl.tagSize(fieldNum) + value.size()

    sealed class Value {
        abstract fun size(): Int

        data class Varint(val varint: Long) : Value() {
            override fun size() = SizerImpl.uInt64Size(varint)
        }
        data class Fixed64(val fixed64: Long) : Value() {
            override fun size() = SizerImpl.fixed64Size(fixed64)
        }
        data class LengthDelimited(val bytes: ByteArr) : Value() {
            override fun size() = SizerImpl.bytesSize(bytes)
        }
        object StartGroup : Value() {
            override fun size() = TODO()
        }
        object EndGroup : Value() {
            override fun size() = TODO()
        }
        data class Fixed32(val fixed32: Int) : Value() {
            override fun size() = SizerImpl.fixed32Size(fixed32)
        }
        data class Composite(val values: List<Value>) : Value() {
            override fun size() = values.sumBy { it.size() }
        }
    }
}
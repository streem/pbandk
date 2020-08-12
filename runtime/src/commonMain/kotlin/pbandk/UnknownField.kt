package pbandk

import pbandk.internal.binary.Sizer
import pbandk.internal.Util

data class UnknownField internal constructor(val fieldNum: Int, val value: Value) {
    internal constructor(fieldNum: Int, value: Long, fixed: Boolean = false) :
        this(fieldNum, if (fixed) Value.Fixed64(value) else Value.Varint(value))
    internal constructor(fieldNum: Int, value: Int, fixed: Boolean = false) :
        this(fieldNum, if (fixed) Value.Fixed32(value) else Value.Varint(value.toLong()))
    internal constructor(fieldNum: Int, value: ByteArr) :
        this(fieldNum, Value.LengthDelimited(value))
    internal constructor(fieldNum: Int, value: ByteArray) :
        this(fieldNum, Value.LengthDelimited(ByteArr(value)))
    internal constructor(fieldNum: Int, value: String) :
        this(fieldNum, Value.LengthDelimited(ByteArr(Util.stringToUtf8(value))))

    internal fun size() =
        if (value is Value.Composite) (Sizer.tagSize(fieldNum) * value.values.size) + value.size()
        else Sizer.tagSize(fieldNum) + value.size()

    sealed class Value {
        internal abstract fun size(): Int

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
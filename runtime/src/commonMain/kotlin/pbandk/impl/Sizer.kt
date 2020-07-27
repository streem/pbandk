package pbandk.impl

import pbandk.*

private class CodePointIterator(private val s: String) : Iterator<Int> {
    var pos = 0

    override fun hasNext(): Boolean = pos < s.length

    override fun next(): Int {
        if (pos >= s.length) throw NoSuchElementException()

        val v = s[pos++]
        if (v.isHighSurrogate() && pos < s.length) {
            val l = s[pos]
            if (l.isLowSurrogate()) {
                pos++
                return 0x10000 + (v - 0xD800).toInt() * 0x400 + (l - 0xDC00).toInt()
            }
        }
        return v.toInt() and 0xffff
    }
}

private class CodePointIterable(private val s: String) : Iterable<Int> {
    override fun iterator(): Iterator<Int> = CodePointIterator(s)
}

private fun utf8Len(value: String) = CodePointIterable(value).sumBy {
    when (it) {
        in 0..0x7f -> 1
        in 0x80..0x7ff -> 2
        in 0x800..0xffff -> 3
        else -> 4
    }
}

abstract class Sizer {
    open fun stringSize(value: String): Int {
        val len = utf8Len(value)
        return uInt32Size(len) + len
    }

    fun enumSize(value: Message.Enum) = int32Size(value.value)
    fun messageSize(value: Message<*>) = uInt32Size(value.protoSize) + value.protoSize
    fun <T> packedRepeatedSize(list: List<T>, sizeFn: (T) -> Int) =
        if (list is ListWithSize && list.protoSize != null) list.protoSize + uInt32Size(list.protoSize)
        else list.sumBy(sizeFn).let { it + uInt32Size(it) }

    fun <K, V, T : Message<T>> mapSize(
        fieldNumber: Int,
        map: Map<K, V>,
        createEntry: (K, V, Map<Int, pbandk.UnknownField>) -> T
    ) = tagSize(fieldNumber).let { tagSize ->
        map.entries.sumBy { e ->
            val msg = e as? Message<*> ?: createEntry(e.key, e.value, emptyMap())
            tagSize + msg.protoSize.let { it + uInt32Size(it) }
        }
    }

    fun tagSize(fieldNum: Int) = uInt32Size(fieldNum shl 3)
    fun doubleSize(@Suppress("UNUSED_PARAMETER") value: Double) = 8
    fun floatSize(@Suppress("UNUSED_PARAMETER") value: Float) = 4
    fun int32Size(value: Int) = if (value >= 0) uInt32Size(value) else 10
    fun int64Size(value: Long) = uInt64Size(value)
    fun uInt32Size(value: Int) = when {
        value and (0.inv() shl 7) == 0 -> 1
        value and (0.inv() shl 14) == 0 -> 2
        value and (0.inv() shl 21) == 0 -> 3
        value and (0.inv() shl 28) == 0 -> 4
        else -> 5
    }

    fun uInt64Size(value: Long): Int {
        // Taken from CodedOutputStream.java's computeUInt64SizeNoTag
        @Suppress("NAME_SHADOWING")
        var value = value
        if (value and (0L.inv() shl 7) == 0L) return 1
        if (value < 0L) return 10
        var n = 2
        if (value and (0L.inv() shl 35) != 0L) {
            n += 4
            value = value ushr 28
        }
        if (value and (0L.inv() shl 21) != 0L) {
            n += 2
            value = value ushr 14
        }
        if (value and (0L.inv() shl 14) != 0L) {
            n += 1
        }
        return n
    }

    fun sInt32Size(value: Int) = uInt32Size(value.zigZagEncoded)
    fun sInt64Size(value: Long) = uInt64Size(value.zigZagEncoded)
    fun fixed32Size(@Suppress("UNUSED_PARAMETER") value: Int) = 4
    fun fixed64Size(@Suppress("UNUSED_PARAMETER") value: Long) = 8
    fun sFixed32Size(@Suppress("UNUSED_PARAMETER") value: Int) = 4
    fun sFixed64Size(@Suppress("UNUSED_PARAMETER") value: Long) = 8
    fun boolSize(@Suppress("UNUSED_PARAMETER") value: Boolean) = 1
    fun bytesSize(value: ByteArr) = uInt32Size(value.array.size) + value.array.size
}
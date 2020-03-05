package pbandk.impl

import pbandk.*

open class Sizer : SizerInterface {
    override fun stringSize(value: String): Int {
        val len = Util.utf8Len(value)
        return uInt32Size(len) + len
    }

    override fun enumSize(value: Message.Enum) = int32Size(value.value)
    override fun messageSize(value: Message<*>) = uInt32Size(value.protoSize) + value.protoSize
    override fun <T> packedRepeatedSize(list: List<T>, sizeFn: (T) -> Int) =
            if (list is ListWithSize && list.protoSize != null) list.protoSize + uInt32Size(list.protoSize)
            else list.sumBy(sizeFn).let { it + uInt32Size(it) }

    override fun <K, V, T : Message<T>> mapSize(
            fieldNumber: Int,
            map: Map<K, V>,
            createEntry: (K, V, Map<Int, pbandk.UnknownField>) -> T
    ) = tagSize(fieldNumber).let { tagSize ->
        map.entries.sumBy { e ->
            val msg = e as? Message<*> ?: createEntry(e.key, e.value, emptyMap())
            tagSize + msg.protoSize.let { it + uInt32Size(it) }
        }
    }

    override fun tagSize(fieldNum: Int) = uInt32Size(fieldNum shl 3)
    override fun doubleSize(@Suppress("UNUSED_PARAMETER") value: Double) = 8
    override fun floatSize(@Suppress("UNUSED_PARAMETER") value: Float) = 4
    override fun int32Size(value: Int) = if (value >= 0) uInt32Size(value) else 10
    override fun int64Size(value: Long) = uInt64Size(value)
    override fun uInt32Size(value: Int) = when {
        value and (0.inv() shl 7) == 0 -> 1
        value and (0.inv() shl 14) == 0 -> 2
        value and (0.inv() shl 21) == 0 -> 3
        value and (0.inv() shl 28) == 0 -> 4
        else -> 5
    }

    override fun uInt64Size(value: Long): Int {
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

    override fun sInt32Size(value: Int) = uInt32Size(value.zigZagEncoded)
    override fun sInt64Size(value: Long) = uInt64Size(value.zigZagEncoded)
    override fun fixed32Size(@Suppress("UNUSED_PARAMETER") value: Int) = 4
    override fun fixed64Size(@Suppress("UNUSED_PARAMETER") value: Long) = 8
    override fun sFixed32Size(@Suppress("UNUSED_PARAMETER") value: Int) = 4
    override fun sFixed64Size(@Suppress("UNUSED_PARAMETER") value: Long) = 8
    override fun boolSize(@Suppress("UNUSED_PARAMETER") value: Boolean) = 1
    override fun bytesSize(value: ByteArr) = uInt32Size(value.array.size) + value.array.size

    val Int.zigZagEncoded get() = (this shl 1) xor (this shr 31)
    val Long.zigZagEncoded get() = (this shl 1) xor (this shr 63)
}
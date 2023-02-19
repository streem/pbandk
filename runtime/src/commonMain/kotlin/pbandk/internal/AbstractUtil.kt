package pbandk.internal

import pbandk.wkt.Duration
import pbandk.wkt.Timestamp

internal abstract class AbstractUtil {
    open fun utf8len(str: String): Int = CodePointIterable(str).sumOf {
        when (it) {
            in 0..0x7f -> 1
            in 0x80..0x7ff -> 2
            in 0x800..0xffff -> 3
            else -> 4
        }.toInt()
    }

    open fun base64ToBytes(str: String): ByteArray {
        return str.decodeBase64ToArray()
            ?: throw RuntimeException("Unable to base64-decode string: $str")
    }

    open fun bytesToBase64(bytes: ByteArray): String {
        return bytes.encodeBase64().decodeToString()
    }

    fun timestampToString(ts: Timestamp): String = formatTime(ts.seconds, ts.nanos)
    fun stringToTimestamp(str: String): Timestamp = parseTime(str)

    fun durationToString(dur: Duration): String = formatDuration(dur)
    fun stringToDuration(str: String): Duration = parseDuration(str)
}

// region String UTF-8 length helper classes

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
                return 0x10000 + (v - 0xD800).code * 0x400 + (l - 0xDC00).code
            }
        }
        return v.code and 0xffff
    }
}

private class CodePointIterable(private val s: String) : Iterable<Int> {
    override fun iterator(): Iterator<Int> = CodePointIterator(s)
}

// endregion
package pbandk.internal

import pbandk.InvalidProtocolBufferException
import pbandk.wkt.Duration
import pbandk.wkt.Timestamp

internal abstract class AbstractUtil : Util {
    override fun utf8len(str: String): Int = str.utf8Size()

    override fun base64ToBytes(str: String): ByteArray = str.decodeBase64ToArray()
        ?: throw RuntimeException("Unable to base64-decode string: $str")

    override fun bytesToBase64(bytes: ByteArray): String = bytes.encodeBase64().decodeToString()

    override fun timestampToString(ts: Timestamp): String = formatTime(ts.seconds, ts.nanos)
    override fun stringToTimestamp(str: String): Timestamp = try {
        parseTime(str)
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("timestamp field did not contain a valid value", e)
    }

    override fun durationToString(dur: Duration): String = formatDuration(dur)
    override fun stringToDuration(str: String): Duration = try {
        parseDuration(str)
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("duration field did not contain a valid value", e)
    }
}

internal fun String.checkSurrogatePairs(): String {
    val endIndex = length
    var i = -1
    while (++i < endIndex) {
        val c = this[i]
        if (!c.isSurrogate()) {
            continue
        } else if (c.isHighSurrogate()) {
            if (++i == endIndex || !this[i].isLowSurrogate()) {
                throw IllegalArgumentException("String contained an unpaired high surrogate character at index ${i-1}")
            }
        } else if (c.isLowSurrogate()) {
            throw IllegalArgumentException("String contained an unpaired low surrogate character at index $i")
        }
    }
    return this
}

// region String UTF-8 length helper classes

// Courtesy of https://github.com/square/okio/blob/37e2f284cf62a1253633ae40e5f84b976c57ea0d/okio/src/commonMain/kotlin/okio/Utf8.kt#L77
private fun String.utf8Size(): Int {
    val endIndex = length

    var result = 0
    var i = 0
    while (i < endIndex) {
        val c = this[i].code

        if (c < 0x80) {
            // A 7-bit character with 1 byte.
            result++
            i++
        } else if (c < 0x800) {
            // An 11-bit character with 2 bytes.
            result += 2
            i++
        } else if (c < 0xd800 || c > 0xdfff) {
            // A 16-bit character with 3 bytes.
            result += 3
            i++
        } else {
            val low = if (i + 1 < endIndex) this[i + 1].code else 0
            if (c > 0xdbff || low < 0xdc00 || low > 0xdfff) {
                // A malformed surrogate, which yields '?'.
                result++
                i++
            } else {
                // A 21-bit character with 4 bytes.
                result += 4
                i += 2
            }
        }
    }

    return result
}

// endregion
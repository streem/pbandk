package pbandk.internal

import pbandk.wkt.Duration
import pbandk.wkt.Timestamp

internal abstract class AbstractUtil {
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

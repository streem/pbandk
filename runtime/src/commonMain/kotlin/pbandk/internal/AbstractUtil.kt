package pbandk.internal

import pbandk.wkt.Duration
import pbandk.wkt.Timestamp

internal abstract class AbstractUtil : Util {
    override fun base64ToBytes(str: String): ByteArray = str.decodeBase64ToArray()
        ?: throw RuntimeException("Unable to base64-decode string: $str")

    override fun bytesToBase64(bytes: ByteArray): String = bytes.encodeBase64().decodeToString()

    override fun timestampToString(ts: Timestamp): String = formatTime(ts.seconds, ts.nanos)
    override fun stringToTimestamp(str: String): Timestamp = parseTime(str)

    override fun durationToString(dur: Duration): String = formatDuration(dur)
    override fun stringToDuration(str: String): Duration = parseDuration(str)
}
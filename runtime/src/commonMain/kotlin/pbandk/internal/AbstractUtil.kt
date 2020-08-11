package pbandk.internal

import pbandk.wkt.Timestamp

abstract class AbstractUtil {
    open fun base64ToBytes(str: String): ByteArray {
        return str.decodeBase64ToArray()
            ?: throw RuntimeException("Unable to base64-decode string: $str")
    }

    open fun bytesToBase64(bytes: ByteArray): String {
        return Util.utf8ToString(bytes.encodeBase64())
    }

    fun timestampToString(ts: Timestamp): String = formatTime(ts.seconds, ts.nanos)

    fun stringToTimestamp(str: String): Timestamp = parseTime(str)
}

package pbandk.internal

import pbandk.wkt.Duration
import pbandk.wkt.Timestamp

internal expect object Util {
    fun base64ToBytes(str: String): ByteArray
    fun bytesToBase64(bytes: ByteArray): String

    fun timestampToString(ts: Timestamp): String
    fun stringToTimestamp(str: String): Timestamp

    fun durationToString(dur: Duration): String
    fun stringToDuration(str: String): Duration
}

internal fun String.underscoreToCamelCase(): String {
    var ret = this
    var lastIndex = -1
    while (true) {
        lastIndex = ret.indexOf('_', lastIndex + 1).also { if (it == -1) return ret }
        ret = ret.substring(0, lastIndex) + ret.substring(lastIndex + 1).replaceFirstChar { it.titlecase() }
    }
}

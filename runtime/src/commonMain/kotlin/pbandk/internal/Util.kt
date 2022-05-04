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
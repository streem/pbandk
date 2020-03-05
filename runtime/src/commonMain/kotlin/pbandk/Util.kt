package pbandk

import pbandk.wkt.Timestamp

interface UtilInterface {
    fun stringToUtf8(str: String): ByteArray
    fun utf8ToString(bytes: ByteArray): String

    fun base64ToBytes(str: String): ByteArray
    fun bytesToBase64(bytes: ByteArray): String

    fun timestampToString(ts: Timestamp.JsonMapper): String
    fun stringToTimestamp(str: String): Timestamp.JsonMapper
}

expect object Util : UtilInterface
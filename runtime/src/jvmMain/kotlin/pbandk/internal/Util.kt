package pbandk.internal

import pbandk.wkt.Timestamp
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.*

actual object Util {
    actual fun stringToUtf8(str: String) = str.toByteArray()
    actual fun utf8ToString(bytes: ByteArray) = bytes.toString(Charsets.UTF_8)

    actual fun base64ToBytes(str: String): ByteArray = Base64.getDecoder().decode(str)
    actual fun bytesToBase64(bytes: ByteArray): String = Base64.getEncoder().encodeToString(bytes)

    actual fun timestampToString(ts: Timestamp): String =
        DateTimeFormatter.ISO_INSTANT.format(
            Instant.ofEpochSecond(ts.seconds, ts.nanos.toLong())
        )
    actual fun stringToTimestamp(str: String): Timestamp =
        DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(str, Instant::from).let {
            Timestamp(it.epochSecond, it.nano)
        }
}
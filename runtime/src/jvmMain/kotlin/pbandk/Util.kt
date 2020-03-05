package pbandk

import pbandk.wkt.Timestamp
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.*

actual object Util : UtilInterface {
    override fun stringToUtf8(str: String) = str.toByteArray()
    override fun utf8ToString(bytes: ByteArray) = bytes.toString(Charsets.UTF_8)

    override fun base64ToBytes(str: String): ByteArray = Base64.getDecoder().decode(str)
    override fun bytesToBase64(bytes: ByteArray): String = Base64.getEncoder().encodeToString(bytes)

    override fun timestampToString(ts: Timestamp.JsonMapper): String =
        DateTimeFormatter.ISO_INSTANT.format(
            Instant.ofEpochSecond(ts.seconds ?: 0, ts.nanos?.toLong() ?: 0)
        )
    override fun stringToTimestamp(str: String): Timestamp.JsonMapper =
        DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(str, Instant::from).let {
            Timestamp.JsonMapper(it.epochSecond, it.nano)
        }
}
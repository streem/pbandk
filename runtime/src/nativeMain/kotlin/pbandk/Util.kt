package pbandk

import platform.posix.*
import pbandk.impl.AbstractUtil
import pbandk.wkt.Timestamp

internal class PosixException(val errno: Int) : RuntimeException(
    strerror(errno)?.toString() ?: "Error with unknown errno: $errno"
)

actual object Sizer : pbandk.impl.Sizer()

actual object Util : AbstractUtil() {
    actual fun stringToUtf8(str: String): ByteArray = str.encodeToByteArray()

    actual fun utf8ToString(bytes: ByteArray): String = bytes.decodeToString()

    actual fun timestampToString(ts: Timestamp.JsonMapper): String = formatTime(ts.seconds ?: 0, ts.nanos ?: 0)

    actual fun stringToTimestamp(str: String): Timestamp.JsonMapper = parseTime(str).let {
        Timestamp.JsonMapper(it.seconds, it.nanos)
    }
}

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller =
    pbandk.impl.Unmarshaller.fromByteArray(arr)

internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller =
    pbandk.impl.ByteArrayMarshaller.allocate(size)
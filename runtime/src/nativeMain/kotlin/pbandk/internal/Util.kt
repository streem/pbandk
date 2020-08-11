package pbandk.internal

import platform.posix.*

internal class PosixException(val errno: Int) : RuntimeException(
    strerror(errno)?.toString() ?: "Error with unknown errno: $errno"
)

actual object Util : AbstractUtil() {
    actual fun stringToUtf8(str: String): ByteArray = str.encodeToByteArray()

    actual fun utf8ToString(bytes: ByteArray): String = bytes.decodeToString()
}

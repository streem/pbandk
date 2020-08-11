package pbandk.internal

import java.util.*

actual object Util : AbstractUtil() {
    actual fun stringToUtf8(str: String) = str.toByteArray()
    actual fun utf8ToString(bytes: ByteArray) = bytes.toString(Charsets.UTF_8)

    actual override fun base64ToBytes(str: String): ByteArray = Base64.getDecoder().decode(str)
    actual override fun bytesToBase64(bytes: ByteArray): String = Base64.getEncoder().encodeToString(bytes)
}

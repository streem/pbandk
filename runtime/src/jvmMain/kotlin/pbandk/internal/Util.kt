package pbandk.internal

import java.util.*

internal actual object Util : AbstractUtil() {
    actual override fun base64ToBytes(str: String): ByteArray = Base64.getDecoder().decode(str)
    actual override fun bytesToBase64(bytes: ByteArray): String = Base64.getEncoder().encodeToString(bytes)
}

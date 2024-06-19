package pbandk.internal

import java.util.*

internal actual val PlatformUtil: Util = object : AbstractUtil() {
    override fun base64ToBytes(str: String): ByteArray = Base64.getDecoder().decode(str)
    override fun bytesToBase64(bytes: ByteArray): String = Base64.getEncoder().encodeToString(bytes)
}
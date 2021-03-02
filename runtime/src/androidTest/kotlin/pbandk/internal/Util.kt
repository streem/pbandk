package pbandk.internal

import java.util.*

/**
 * Same implementation as JVM to run unit tests on Android as [android.util.Base64] will throw
 * a NotMockedException.
 */
internal object Util : AbstractUtil() {
    override fun base64ToBytes(str: String): ByteArray = Base64.getDecoder().decode(str)
    override fun bytesToBase64(bytes: ByteArray): String = Base64.getEncoder().encodeToString(bytes)
}

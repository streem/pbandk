package pbandk.internal

internal actual object Util : AbstractUtil() {
    actual override fun base64ToBytes(str: String): ByteArray = try {
        java.util.Base64.getDecoder().decode(str)
    } catch (e: Throwable) {
        // Fallback to Android implementation on platforms below API 26
        android.util.Base64.decode(str, android.util.Base64.DEFAULT)
    }

    actual override fun bytesToBase64(bytes: ByteArray): String = try {
        java.util.Base64.getEncoder().encodeToString(bytes)
    } catch (e: Throwable) {
        // Fallback to Android implementation on platforms below API 26
        android.util.Base64.encodeToString(bytes, android.util.Base64.DEFAULT)
    }
}


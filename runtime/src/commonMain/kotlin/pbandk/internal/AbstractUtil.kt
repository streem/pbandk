package pbandk.internal

abstract class AbstractUtil {
    fun base64ToBytes(str: String): ByteArray {
        return str.decodeBase64ToArray()
            ?: throw RuntimeException("Unable to base64-decode string: $str")
    }

    fun bytesToBase64(bytes: ByteArray): String {
        return Util.utf8ToString(bytes.encodeBase64())
    }
}
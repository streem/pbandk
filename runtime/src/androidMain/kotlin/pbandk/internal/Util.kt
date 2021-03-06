package pbandk.internal

import android.util.Base64

internal actual object Util : AbstractUtil() {
    actual override fun base64ToBytes(str: String): ByteArray =
        Base64.decode(str, Base64.NO_WRAP)

    actual override fun bytesToBase64(bytes: ByteArray): String =
        Base64.encodeToString(bytes, Base64.NO_WRAP)
}
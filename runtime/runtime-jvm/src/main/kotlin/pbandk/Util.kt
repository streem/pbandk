package pbandk

actual object Util {
    actual fun stringToUtf8(str: String) = str.toByteArray()
    actual fun utf8ToString(bytes: ByteArray) = bytes.toString(Charsets.UTF_8)
}
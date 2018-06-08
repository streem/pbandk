package pbandk

expect object Util {
    fun stringToUtf8(str: String): ByteArray
    fun utf8ToString(bytes: ByteArray): String
}
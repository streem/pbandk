package pbandk.internal.binary.kotlin

internal interface WireReader {
    fun read(length: Int): ByteArray
    fun isAtEnd(): Boolean
    fun skipRawBytes(length: Int)
}
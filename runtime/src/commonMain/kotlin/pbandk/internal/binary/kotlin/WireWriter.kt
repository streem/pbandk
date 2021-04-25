package pbandk.internal.binary.kotlin

internal interface WireWriter {
    val totalBytesWritten: Int
    fun write(bytes: ByteArray, offset: Int, length: Int)
}
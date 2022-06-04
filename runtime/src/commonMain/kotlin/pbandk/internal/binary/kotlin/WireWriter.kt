package pbandk.internal.binary.kotlin

internal interface WireWriter {
    val totalBytesWritten: Int
    fun write(bytes: ByteArray, offset: Int, length: Int)
    fun write(bytes: ByteArray) = write(bytes, 0, bytes.size)
}
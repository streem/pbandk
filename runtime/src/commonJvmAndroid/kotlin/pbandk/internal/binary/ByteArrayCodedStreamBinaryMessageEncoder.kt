package pbandk.internal.binary

import com.google.protobuf.CodedOutputStream

internal class ByteArrayCodedStreamBinaryMessageEncoder private constructor(
    private val backingBytes: ByteArray,
    private val outputStream: CodedOutputStream
) : BinaryMessageEncoder(CodedStreamBinaryWireEncoder(outputStream)), ByteArrayMessageEncoder {

    private constructor(backingBytes: ByteArray) : this(backingBytes, CodedOutputStream.newInstance(backingBytes))

    override fun toByteArray(): ByteArray {
        check(outputStream.spaceLeft() == 0) { "Expected ${backingBytes.size}, got ${outputStream.totalBytesWritten}" }
        outputStream.checkNoSpaceLeft()
        return backingBytes
    }

    companion object {
        fun allocate(size: Int) = ByteArrayCodedStreamBinaryMessageEncoder(ByteArray(size))
    }
}
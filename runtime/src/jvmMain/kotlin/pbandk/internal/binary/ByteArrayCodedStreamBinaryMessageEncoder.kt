package pbandk.internal.binary

import com.google.protobuf.CodedOutputStream

internal class ByteArrayCodedStreamBinaryMessageEncoder private constructor(
    private val backingBytes: ByteArray
) : BinaryMessageEncoder(CodedStreamBinaryWireEncoder(CodedOutputStream.newInstance(backingBytes))),
    ByteArrayMessageEncoder {

    override fun toByteArray() = backingBytes

    companion object {
        fun allocate(size: Int) = ByteArrayCodedStreamBinaryMessageEncoder(ByteArray(size))
    }
}
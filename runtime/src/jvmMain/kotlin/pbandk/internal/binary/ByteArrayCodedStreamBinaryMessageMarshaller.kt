package pbandk.internal.binary

import com.google.protobuf.CodedOutputStream

internal class ByteArrayCodedStreamBinaryMessageMarshaller private constructor(
    private val backingBytes: ByteArray
) : BinaryMessageMarshaller(CodedStreamBinaryWireMarshaller(CodedOutputStream.newInstance(backingBytes))),
    ByteArrayMessageMarshaller {

    override fun toByteArray() = backingBytes

    companion object {
        fun allocate(size: Int) = ByteArrayCodedStreamBinaryMessageMarshaller(ByteArray(size))
    }
}
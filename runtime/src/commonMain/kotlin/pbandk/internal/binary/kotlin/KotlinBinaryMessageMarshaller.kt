package pbandk.internal.binary.kotlin

import pbandk.internal.binary.BinaryMessageMarshaller
import pbandk.internal.binary.ByteArrayMessageMarshaller

internal class KotlinBinaryMessageMarshaller private constructor(
    private val writer: ByteArrayWireWriter
) : BinaryMessageMarshaller(KotlinBinaryWireMarshaller(writer)), ByteArrayMessageMarshaller {
    override fun toByteArray() = writer.toByteArray()

    companion object {
        fun allocate(size: Int) = KotlinBinaryMessageMarshaller(ByteArrayWireWriter.allocate(size))
    }
}
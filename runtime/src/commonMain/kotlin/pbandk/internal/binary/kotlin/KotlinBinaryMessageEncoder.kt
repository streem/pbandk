package pbandk.internal.binary.kotlin

import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.ByteArrayMessageEncoder

internal class KotlinBinaryMessageEncoder private constructor(
    private val writer: ByteArrayWireWriter
) : BinaryMessageEncoder(KotlinBinaryWireEncoder(writer)), ByteArrayMessageEncoder {
    override fun toByteArray() = writer.toByteArray()

    companion object {
        fun allocate(size: Int) = KotlinBinaryMessageEncoder(ByteArrayWireWriter.allocate(size))
    }
}
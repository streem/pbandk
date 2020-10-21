package pbandk.internal.binary.kotlin

import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.ByteArrayMessageEncoder

internal class KotlinBinaryMessageEncoder private constructor(
    private val writer: ByteArrayWireWriter,
    private val expectedSize: Int
) : BinaryMessageEncoder(KotlinBinaryWireEncoder(writer)), ByteArrayMessageEncoder {
    override fun toByteArray() = writer.toByteArray().also {
        check(it.size == expectedSize) { "Expected $expectedSize, got ${it.size}" }
    }

    companion object {
        fun allocate(size: Int) = KotlinBinaryMessageEncoder(ByteArrayWireWriter.allocate(size), size)
    }
}
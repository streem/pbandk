package pbandk.protobufjs

import pbandk.internal.asByteArray
import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.ByteArrayMessageEncoder

internal class ProtobufjsBinaryMessageEncoder private constructor(
    private val writer: Writer,
    private val expectedSize: Int
) : BinaryMessageEncoder(ProtobufjsBinaryWireEncoder(writer)), ByteArrayMessageEncoder {
    override fun toByteArray(): ByteArray {
        return writer.finish().asByteArray().also {
            require(it.size == expectedSize) { "Expected $expectedSize, got ${it.size}" }
        }
    }

    companion object {
        fun allocate(size: Int) = ProtobufjsBinaryMessageEncoder(Writer.create(), size)
    }
}
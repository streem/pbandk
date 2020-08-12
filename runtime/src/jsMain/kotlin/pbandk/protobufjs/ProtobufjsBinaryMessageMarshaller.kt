package pbandk.protobufjs

import pbandk.internal.asByteArray
import pbandk.internal.binary.BinaryMessageMarshaller
import pbandk.internal.binary.ByteArrayMessageMarshaller

internal class ProtobufjsBinaryMessageMarshaller private constructor(
    private val writer: Writer,
    private val expectedSize: Int
) : BinaryMessageMarshaller(ProtobufjsBinaryWireMarshaller(writer)), ByteArrayMessageMarshaller {
    override fun toByteArray(): ByteArray {
        return writer.finish().asByteArray().also {
            require(it.size == expectedSize) { "Expected $expectedSize, got ${it.size}" }
        }
    }

    companion object {
        fun allocate(size: Int) = ProtobufjsBinaryMessageMarshaller(Writer.create(), size)
    }
}
package pbandk.protobufjs

import pbandk.ByteArr
import pbandk.ByteArrayMarshaller
import pbandk.asByteArray
import pbandk.asUint8Array
import pbandk.impl.AbstractMarshaller

class Marshaller(val w: Writer, val expectedSize: Int) : AbstractMarshaller(), ByteArrayMarshaller {
    override fun writeTag(tag: Int) = also { w.uint32(tag) }
    override fun writeDouble(value: Double) { w.double(value) }
    override fun writeFloat(value: Float) { w.float(value) }
    override fun writeInt32(value: Int) { w.int32(value) }
    override fun writeInt64(value: Long) { w.int64(value.protobufjsLong) }
    override fun writeUInt32(value: Int) { w.uint32(value) }
    override fun writeUInt64(value: Long) { w.uint64(value.protobufjsLong) }
    override fun writeSInt32(value: Int) { w.sint32(value) }
    override fun writeSInt64(value: Long) { w.sint64(value.protobufjsLong) }
    override fun writeFixed32(value: Int) { w.fixed32(value) }
    override fun writeFixed64(value: Long) { w.fixed64(value.protobufjsLong) }
    override fun writeSFixed32(value: Int) { w.sfixed32(value) }
    override fun writeSFixed64(value: Long) { w.sfixed64(value.protobufjsLong) }
    override fun writeBool(value: Boolean) { w.bool(value) }
    override fun writeString(value: String) { w.string(value) }
    override fun writeBytes(value: ByteArr) { w.bytes(value.array.asUint8Array()) }
    override fun complete(): ByteArray = w.finish().asByteArray().also {
        require(it.size == expectedSize) { "Expected $expectedSize, got ${it.size}" }
    }
    private fun writeRawBytesReal(value: ByteArray) {
        w._push(Companion::writeBytes, value.size, value)
    }
    override fun writeRawBytes(arr: ByteArray, offset: Int, len: Int) {
        writeRawBytesReal(arr.sliceArray(offset until (offset + len)))
    }

    companion object {
        fun allocate(size: Int) = Marshaller(Writer.create(), size)
        private fun writeBytes(value: ByteArray, buf: ByteArray, pos: Int) {
            value.copyInto(buf, pos)
        }
    }
}
package pbandk.protobufjs

import pbandk.ByteArr
import pbandk.asByteArray
import pbandk.asUint8Array

class Marshaller(val w: Writer, val expectedSize: Int) : pbandk.impl.Marshaller() {
    fun writeTag(tag: Int) = also { w.uint32(tag) }
    fun writeDouble(value: Double) { w.double(value) }
    fun writeFloat(value: Float) { w.float(value) }
    override fun writeInt32(value: Int) { w.int32(value) }
    fun writeInt64(value: Long) { w.int64(value.protobufjsLong) }
    override fun writeUInt32(value: Int) { w.uint32(value) }
    override fun writeUInt64(value: Long) { w.uint64(value.protobufjsLong) }
    fun writeSInt32(value: Int) { w.sint32(value) }
    fun writeSInt64(value: Long) { w.sint64(value.protobufjsLong) }
    override fun writeFixed32(value: Int) { w.fixed32(value) }
    override fun writeFixed64(value: Long) { w.fixed64(value.protobufjsLong) }
    fun writeSFixed32(value: Int) { w.sfixed32(value) }
    fun writeSFixed64(value: Long) { w.sfixed64(value.protobufjsLong) }
    fun writeBool(value: Boolean) { w.bool(value) }
    fun writeString(value: String) { w.string(value) }
    override fun writeBytes(value: ByteArr) { w.bytes(value.array.asUint8Array()) }
    fun complete(): ByteArray? = w.finish().asByteArray().also {
        require(it.size == expectedSize) { "Expected $expectedSize, got ${it.size}" }
    }

    companion object {
        fun allocate(size: Int) = Marshaller(Writer.create(), size)
    }
}
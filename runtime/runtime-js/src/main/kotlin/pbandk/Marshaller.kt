package pbandk

import pbandk.protobufjs.Writer
import pbandk.protobufjs.util

actual class Marshaller(val w: Writer, val expectedSize: Int) : pbandk.impl.Marshaller() {
    actual fun writeTag(tag: Int) = also { w.uint32(tag) }
    actual fun writeDouble(value: Double) { w.double(value) }
    actual fun writeFloat(value: Float) { w.float(value) }
    actual override fun writeInt32(value: Int) { w.int32(value) }
    actual fun writeInt64(value: Long) { w.int64(value.protobufjsLong) }
    actual override fun writeUInt32(value: Int) { w.uint32(value) }
    actual override fun writeUInt64(value: Long) { w.uint64(value.protobufjsLong) }
    actual fun writeSInt32(value: Int) { w.sint32(value) }
    actual fun writeSInt64(value: Long) { w.sint64(value.protobufjsLong) }
    actual override fun writeFixed32(value: Int) { w.fixed32(value) }
    actual override fun writeFixed64(value: Long) { w.fixed64(value.protobufjsLong) }
    actual fun writeSFixed32(value: Int) { w.sfixed32(value) }
    actual fun writeSFixed64(value: Long) { w.sfixed64(value.protobufjsLong) }
    actual fun writeBool(value: Boolean) { w.bool(value) }
    actual fun writeString(value: String) { w.string(value) }
    actual override fun writeBytes(value: ByteArr) { w.bytes(value.array.asUint8Array()) }
    actual fun complete(): ByteArray? = w.finish().asByteArray().also {
        require(it.size == expectedSize) { "Expected $expectedSize, got ${it.size}" }
    }

    actual companion object {
        actual fun allocate(size: Int) = Marshaller(Writer.create(), size)
        actual fun stringToUtf8Bytes(str: String) =
            ByteArray(util.utf8.length(str)).also { util.utf8.write(str, it.asUint8Array(), 0) }
    }
}
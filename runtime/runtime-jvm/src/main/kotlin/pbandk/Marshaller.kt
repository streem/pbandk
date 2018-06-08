package pbandk

import com.google.protobuf.CodedOutputStream

actual class Marshaller(val stream: CodedOutputStream, val backingBytes: ByteArray? = null) : pbandk.impl.Marshaller() {
    actual fun writeTag(tag: Int) = also { stream.writeUInt32NoTag(tag) }
    actual fun writeDouble(value: Double) = stream.writeDoubleNoTag(value)
    actual fun writeFloat(value: Float) = stream.writeFloatNoTag(value)
    actual override fun writeInt32(value: Int) = stream.writeInt32NoTag(value)
    actual fun writeInt64(value: Long) = stream.writeInt64NoTag(value)
    actual override fun writeUInt32(value: Int) = stream.writeUInt32NoTag(value)
    actual override fun writeUInt64(value: Long) = stream.writeUInt64NoTag(value)
    actual fun writeSInt32(value: Int) = stream.writeSInt32NoTag(value)
    actual fun writeSInt64(value: Long) = stream.writeSInt64NoTag(value)
    actual override fun writeFixed32(value: Int) = stream.writeFixed32NoTag(value)
    actual override fun writeFixed64(value: Long) = stream.writeFixed64NoTag(value)
    actual fun writeSFixed32(value: Int) = stream.writeSFixed32NoTag(value)
    actual fun writeSFixed64(value: Long) = stream.writeSFixed64NoTag(value)
    actual fun writeBool(value: Boolean) = stream.writeBoolNoTag(value)
    actual fun writeString(value: String) = stream.writeStringNoTag(value)
    actual override fun writeBytes(value: ByteArr) = stream.writeByteArrayNoTag(value.array)
    actual fun complete() = backingBytes

    actual companion object {
        actual fun allocate(size: Int) = ByteArray(size).let { Marshaller(CodedOutputStream.newInstance(it), it) }
    }
}
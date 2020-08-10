package pbandk

import com.google.protobuf.CodedOutputStream
import pbandk.impl.AbstractMarshaller

open class CodedStreamMarshaller(val stream: CodedOutputStream) : AbstractMarshaller() {
    override fun writeRawBytes(arr: ByteArray, offset: Int, len: Int) {
        stream.writeRawBytes(arr, offset, len)
    }

    override fun writeTag(tag: Int) = also { stream.writeUInt32NoTag(tag) }
    override fun writeDouble(value: Double) = stream.writeDoubleNoTag(value)
    override fun writeFloat(value: Float) = stream.writeFloatNoTag(value)
    override fun writeInt32(value: Int) = stream.writeInt32NoTag(value)
    override fun writeInt64(value: Long) = stream.writeInt64NoTag(value)
    override fun writeUInt32(value: Int) = stream.writeUInt32NoTag(value)
    override fun writeUInt64(value: Long) = stream.writeUInt64NoTag(value)
    override fun writeSInt32(value: Int) = stream.writeSInt32NoTag(value)
    override fun writeSInt64(value: Long) = stream.writeSInt64NoTag(value)
    override fun writeFixed32(value: Int) = stream.writeFixed32NoTag(value)
    override fun writeFixed64(value: Long) = stream.writeFixed64NoTag(value)
    override fun writeSFixed32(value: Int) = stream.writeSFixed32NoTag(value)
    override fun writeSFixed64(value: Long) = stream.writeSFixed64NoTag(value)
    override fun writeBool(value: Boolean) = stream.writeBoolNoTag(value)
    override fun writeString(value: String) = stream.writeStringNoTag(value)
    override fun writeBytes(value: ByteArr) = stream.writeByteArrayNoTag(value.array)
}

fun Marshaller(stream: CodedOutputStream): Marshaller = CodedStreamMarshaller(stream)

class CodedStreamByteArrayMarshaller private constructor(private val backingBytes: ByteArray):
        CodedStreamMarshaller(CodedOutputStream.newInstance(backingBytes)),
        ByteArrayMarshaller {
    override fun complete() = backingBytes

    companion object {
        fun allocate(size: Int) = CodedStreamByteArrayMarshaller(ByteArray(size))
    }
}

internal actual fun marshallerAllocate(size: Int): ByteArrayMarshaller = CodedStreamByteArrayMarshaller.allocate(size)
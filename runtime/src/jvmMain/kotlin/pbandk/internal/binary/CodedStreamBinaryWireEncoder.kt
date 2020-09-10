package pbandk.internal.binary

import com.google.protobuf.CodedOutputStream
import com.google.protobuf.WireFormat
import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.ListWithSize
import pbandk.Message

private fun CodedOutputStream.writeValueNoTag(type: FieldDescriptor.Type, value: Any) {
    when (type) {
        is FieldDescriptor.Type.Primitive.Double -> writeDoubleNoTag(value as Double)
        is FieldDescriptor.Type.Primitive.Float -> writeFloatNoTag(value as Float)
        is FieldDescriptor.Type.Primitive.Int64 -> writeInt64NoTag(value as Long)
        is FieldDescriptor.Type.Primitive.UInt64 -> writeUInt64NoTag(value as Long)
        is FieldDescriptor.Type.Primitive.Int32 -> writeInt32NoTag(value as Int)
        is FieldDescriptor.Type.Primitive.Fixed64 -> writeFixed64NoTag(value as Long)
        is FieldDescriptor.Type.Primitive.Fixed32 -> writeFixed32NoTag(value as Int)
        is FieldDescriptor.Type.Primitive.Bool -> writeBoolNoTag(value as Boolean)
        is FieldDescriptor.Type.Primitive.String -> writeStringNoTag(value as String)
        is FieldDescriptor.Type.Primitive.Bytes -> writeByteArrayNoTag((value as ByteArr).array)
        is FieldDescriptor.Type.Primitive.UInt32 -> writeUInt32NoTag(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed32 -> writeSFixed32NoTag(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed64 -> writeSFixed64NoTag(value as Long)
        is FieldDescriptor.Type.Primitive.SInt32 -> writeSInt32NoTag(value as Int)
        is FieldDescriptor.Type.Primitive.SInt64 -> writeSInt64NoTag(value as Long)
        is FieldDescriptor.Type.Message<*> -> error("writeValueNoTag() should only be called for primitive types")
        is FieldDescriptor.Type.Enum<*> -> writeEnumNoTag((value as Message.Enum).value)
        is FieldDescriptor.Type.Repeated<*> -> error("writeValueNoTag() should only be called for primitive types")
        is FieldDescriptor.Type.Map<*, *> -> error("writeValueNoTag() should only be called for primitive types")
    }
}

internal open class CodedStreamBinaryWireEncoder(private val stream: CodedOutputStream) : BinaryWireEncoder {
    override fun writeLengthDelimitedHeader(fieldNum: Int, protoSize: Int) {
        stream.writeTag(fieldNum, WireFormat.WIRETYPE_LENGTH_DELIMITED)
        stream.writeUInt32NoTag(protoSize)
    }

    override fun writePackedRepeated(fieldNum: Int, list: List<*>, valueType: FieldDescriptor.Type) {
        val listSize = (list as? ListWithSize)?.protoSize ?: list.sumBy { valueType.protoSize(checkNotNull(it)) }
        writeLengthDelimitedHeader(fieldNum, listSize)
        list.forEach { stream.writeValueNoTag(valueType, checkNotNull(it)) }
    }

    override fun writeInt32(fieldNum: Int, value: Int) {
        stream.writeInt32(fieldNum, value)
    }

    override fun writeInt64(fieldNum: Int, value: Long) {
        stream.writeInt64(fieldNum, value)
    }

    override fun writeUInt32(fieldNum: Int, value: Int) {
        stream.writeUInt32(fieldNum, value)
    }

    override fun writeUInt64(fieldNum: Int, value: Long) {
        stream.writeUInt64(fieldNum, value)
    }

    override fun writeSInt32(fieldNum: Int, value: Int) {
        stream.writeSInt32(fieldNum, value)
    }

    override fun writeSInt64(fieldNum: Int, value: Long) {
        stream.writeSInt64(fieldNum, value)
    }

    override fun writeBool(fieldNum: Int, value: Boolean) {
        stream.writeBool(fieldNum, value)
    }

    override fun writeEnum(fieldNum: Int, value: Message.Enum) {
        stream.writeEnum(fieldNum, value.value)
    }

    override fun writeFixed32(fieldNum: Int, value: Int) {
        stream.writeFixed32(fieldNum, value)
    }

    override fun writeFixed64(fieldNum: Int, value: Long) {
        stream.writeFixed64(fieldNum, value)
    }

    override fun writeSFixed32(fieldNum: Int, value: Int) {
        stream.writeSFixed32(fieldNum, value)
    }

    override fun writeSFixed64(fieldNum: Int, value: Long) {
        stream.writeSFixed64(fieldNum, value)
    }

    override fun writeFloat(fieldNum: Int, value: Float) {
        stream.writeFloat(fieldNum, value)
    }

    override fun writeDouble(fieldNum: Int, value: Double) {
        stream.writeDouble(fieldNum, value)
    }

    override fun writeString(fieldNum: Int, value: String) {
        stream.writeString(fieldNum, value)
    }

    override fun writeBytes(fieldNum: Int, value: ByteArr) {
        stream.writeByteArray(fieldNum, value.array)
    }
}

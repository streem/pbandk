package pbandk.internal.binary

import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.Message

internal interface BinaryWireEncoder {
    fun writeLengthDelimitedHeader(fieldNum: Int, protoSize: Int)

    fun writePackedRepeated(fieldNum: Int, list: List<*>, valueType: FieldDescriptor.Type)

    fun writeInt32(fieldNum: Int, value: Int)

    fun writeInt64(fieldNum: Int, value: Long)

    fun writeUInt32(fieldNum: Int, value: Int)

    fun writeUInt64(fieldNum: Int, value: Long)

    fun writeSInt32(fieldNum: Int, value: Int)

    fun writeSInt64(fieldNum: Int, value: Long)

    fun writeBool(fieldNum: Int, value: Boolean)

    fun writeEnum(fieldNum: Int, value: Message.Enum)

    fun writeFixed32(fieldNum: Int, value: Int)

    fun writeFixed64(fieldNum: Int, value: Long)

    fun writeSFixed32(fieldNum: Int, value: Int)

    fun writeSFixed64(fieldNum: Int, value: Long)

    fun writeFloat(fieldNum: Int, value: Float)

    fun writeDouble(fieldNum: Int, value: Double)

    fun writeString(fieldNum: Int, value: String)

    fun writeBytes(fieldNum: Int, value: ByteArr)
}

internal fun BinaryWireEncoder.writePrimitiveValue(
    fieldNum: Int,
    type: FieldDescriptor.Type.Primitive<*>,
    value: Any
) {
    when (type) {
        is FieldDescriptor.Type.Primitive.Double -> writeDouble(fieldNum, value as Double)
        is FieldDescriptor.Type.Primitive.Float -> writeFloat(fieldNum, value as Float)
        is FieldDescriptor.Type.Primitive.Int64 -> writeInt64(fieldNum, value as Long)
        is FieldDescriptor.Type.Primitive.UInt64 -> writeUInt64(fieldNum, value as Long)
        is FieldDescriptor.Type.Primitive.Int32 -> writeInt32(fieldNum, value as Int)
        is FieldDescriptor.Type.Primitive.Fixed64 -> writeFixed64(fieldNum, value as Long)
        is FieldDescriptor.Type.Primitive.Fixed32 -> writeFixed32(fieldNum, value as Int)
        is FieldDescriptor.Type.Primitive.Bool -> writeBool(fieldNum, value as Boolean)
        is FieldDescriptor.Type.Primitive.String -> writeString(fieldNum, value as String)
        is FieldDescriptor.Type.Primitive.Bytes -> writeBytes(fieldNum, value as ByteArr)
        is FieldDescriptor.Type.Primitive.UInt32 -> writeUInt32(fieldNum, value as Int)
        is FieldDescriptor.Type.Primitive.SFixed32 -> writeSFixed32(fieldNum, value as Int)
        is FieldDescriptor.Type.Primitive.SFixed64 -> writeSFixed64(fieldNum, value as Long)
        is FieldDescriptor.Type.Primitive.SInt32 -> writeSInt32(fieldNum, value as Int)
        is FieldDescriptor.Type.Primitive.SInt64 -> writeSInt64(fieldNum, value as Long)
    }
}
package pbandk.internal.binary

import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.binary.WireType

internal interface BinaryWireEncoder {
    fun writeRawBytes(fieldNum: Int, wireType: WireType, value: ByteArray)

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
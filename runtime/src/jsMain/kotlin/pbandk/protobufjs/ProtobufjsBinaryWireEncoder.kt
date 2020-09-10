package pbandk.protobufjs

import pbandk.*
import pbandk.internal.asUint8Array
import pbandk.internal.binary.BinaryWireEncoder
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireType

private fun Writer.writeValueNoTag(type: FieldDescriptor.Type, value: Any) {
    when (type) {
        is FieldDescriptor.Type.Primitive.Double -> double(value as Double)
        is FieldDescriptor.Type.Primitive.Float -> float(value as Float)
        is FieldDescriptor.Type.Primitive.Int64 -> int64((value as Long).protobufjsLong)
        is FieldDescriptor.Type.Primitive.UInt64 -> uint64((value as Long).protobufjsLong)
        is FieldDescriptor.Type.Primitive.Int32 -> int32(value as Int)
        is FieldDescriptor.Type.Primitive.Fixed64 -> fixed64((value as Long).protobufjsLong)
        is FieldDescriptor.Type.Primitive.Fixed32 -> fixed32(value as Int)
        is FieldDescriptor.Type.Primitive.Bool -> bool(value as Boolean)
        is FieldDescriptor.Type.Primitive.String -> string(value as String)
        is FieldDescriptor.Type.Primitive.Bytes -> bytes((value as ByteArr).array.asUint8Array())
        is FieldDescriptor.Type.Primitive.UInt32 -> uint32(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed32 -> sfixed32(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed64 -> sfixed64((value as Long).protobufjsLong)
        is FieldDescriptor.Type.Primitive.SInt32 -> sint32(value as Int)
        is FieldDescriptor.Type.Primitive.SInt64 -> sint64((value as Long).protobufjsLong)
        is FieldDescriptor.Type.Message<*> -> error("writeValueNoTag() should only be called for primitive types")
        is FieldDescriptor.Type.Enum<*> -> int32((value as Message.Enum).value)
        is FieldDescriptor.Type.Repeated<*> -> error("writeValueNoTag() should only be called for primitive types")
        is FieldDescriptor.Type.Map<*, *> -> error("writeValueNoTag() should only be called for primitive types")
    }
}

internal class ProtobufjsBinaryWireEncoder(private val writer: Writer) : BinaryWireEncoder {
    private fun writeTag(fieldNum: Int, wireType: WireType) {
        writer.uint32(Tag(fieldNum, wireType).value)
    }

    override fun writeLengthDelimitedHeader(fieldNum: Int, protoSize: Int) {
        writeTag(fieldNum, WireType.LENGTH_DELIMITED)
        writer.uint32(protoSize)
    }

    override fun writePackedRepeated(fieldNum: Int, list: List<*>, valueType: FieldDescriptor.Type) {
        if (list is ListWithSize && list.protoSize != null) {
            writeLengthDelimitedHeader(fieldNum, list.protoSize)
            list.forEach { writer.writeValueNoTag(valueType, checkNotNull(it)) }
        } else {
            writeTag(fieldNum, WireType.LENGTH_DELIMITED)
            writer.fork()
            list.forEach { writer.writeValueNoTag(valueType, checkNotNull(it)) }
            writer.ldelim()
        }
    }

    override fun writeInt32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.VARINT)
        writer.int32(value)
    }

    override fun writeInt64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.VARINT)
        writer.int64(value.protobufjsLong)
    }

    override fun writeUInt32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.VARINT)
        writer.uint32(value)
    }

    override fun writeUInt64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.VARINT)
        writer.uint64(value.protobufjsLong)
    }

    override fun writeSInt32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.VARINT)
        writer.sint32(value)
    }

    override fun writeSInt64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.VARINT)
        writer.sint64(value.protobufjsLong)
    }

    override fun writeBool(fieldNum: Int, value: Boolean) {
        writeTag(fieldNum, WireType.VARINT)
        writer.bool(value)
    }

    override fun writeEnum(fieldNum: Int, value: Message.Enum) {
        writeTag(fieldNum, WireType.VARINT)
        writer.int32(value.value)
    }

    override fun writeFixed32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.FIXED32)
        writer.fixed32(value)
    }

    override fun writeFixed64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.FIXED64)
        writer.fixed64(value.protobufjsLong)
    }

    override fun writeSFixed32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.FIXED32)
        writer.sfixed32(value)
    }

    override fun writeSFixed64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.FIXED64)
        writer.sfixed64(value.protobufjsLong)
    }

    override fun writeFloat(fieldNum: Int, value: Float) {
        writeTag(fieldNum, WireType.FIXED32)
        writer.float(value)
    }

    override fun writeDouble(fieldNum: Int, value: Double) {
        writeTag(fieldNum, WireType.FIXED64)
        writer.double(value)
    }

    override fun writeString(fieldNum: Int, value: String) {
        writeTag(fieldNum, WireType.LENGTH_DELIMITED)
        writer.string(value)
    }

    override fun writeBytes(fieldNum: Int, value: ByteArr) {
        writeTag(fieldNum, WireType.LENGTH_DELIMITED)
        writer.bytes(value.array.asUint8Array())
    }
}


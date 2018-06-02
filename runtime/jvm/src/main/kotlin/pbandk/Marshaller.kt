package pbandk

import com.google.protobuf.CodedOutputStream

actual class Marshaller(val stream: CodedOutputStream) {

    actual constructor(arr: ByteArray) : this(CodedOutputStream.newInstance(arr))

    actual fun writeTag(tag: Int) = also { stream.writeUInt32NoTag(tag) }
    actual fun writeDouble(value: Double) = stream.writeDoubleNoTag(value)
    actual fun writeFloat(value: Float) = stream.writeFloatNoTag(value)
    actual fun writeInt32(value: Int) = stream.writeInt32NoTag(value)
    actual fun writeInt64(value: Long) = stream.writeInt64NoTag(value)
    actual fun writeUInt32(value: Int) = stream.writeUInt32NoTag(value)
    actual fun writeUInt64(value: Long) = stream.writeUInt64NoTag(value)
    actual fun writeSInt32(value: Int) = stream.writeSInt32NoTag(value)
    actual fun writeSInt64(value: Long) = stream.writeSInt64NoTag(value)
    actual fun writeFixed32(value: Int) = stream.writeFixed32NoTag(value)
    actual fun writeFixed64(value: Long) = stream.writeFixed64NoTag(value)
    actual fun writeSFixed32(value: Int) = stream.writeSFixed32NoTag(value)
    actual fun writeSFixed64(value: Long) = stream.writeSFixed64NoTag(value)
    actual fun writeBool(value: Boolean) = stream.writeBoolNoTag(value)
    actual fun writeString(value: String) = stream.writeStringNoTag(value)
    actual fun writeBytes(value: ByteArr) = stream.writeByteArrayNoTag(value.array)
    actual fun writeEnum(value: Int) = stream.writeEnumNoTag(value)
    actual fun writeMessage(value: Message) {
        stream.writeUInt32NoTag(value.protoSize)
        value.protoMarshal(this)
    }
    actual fun writeUnknownFields(fields: Map<Int, UnknownField>) {
        fun writeUnknownFieldValue(fieldNum: Int, v: UnknownField.Value) {
            when (v) {
                is UnknownField.Value.Varint -> stream.writeUInt64(fieldNum, v.varint)
                is UnknownField.Value.Fixed64 -> stream.writeFixed64(fieldNum, v.fixed64)
                is UnknownField.Value.LengthDelimited -> stream.writeByteArray(fieldNum, v.bytes.array)
                is UnknownField.Value.StartGroup -> TODO()
                is UnknownField.Value.EndGroup -> TODO()
                is UnknownField.Value.Fixed32 -> stream.writeFixed32(fieldNum, v.fixed32)
                is UnknownField.Value.Composite -> v.values.forEach { writeUnknownFieldValue(fieldNum, it) }
            }
        }
        fields.forEach { writeUnknownFieldValue(it.key, it.value.value) }
    }

    actual companion object {
        actual fun stringToUtf8Bytes(str: String) = str.toByteArray()
    }
}
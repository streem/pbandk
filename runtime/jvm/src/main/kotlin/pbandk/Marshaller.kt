package pbandk

import com.google.protobuf.CodedOutputStream

actual class Marshaller(val stream: CodedOutputStream) {

    actual constructor(arr: ByteArray) : this(CodedOutputStream.newInstance(arr))

    actual inline fun writeTag(tag: Int) = also { stream.writeUInt32NoTag(tag) }
    actual inline fun writeString(value: String) = stream.writeStringNoTag(value)
    actual inline fun writeBytes(value: ByteArr) = stream.writeByteArrayNoTag(value.array)
    actual inline fun writeEnum(value: Int) = stream.writeEnumNoTag(value)
    actual fun writeMessage(value: Message) {
        stream.writeUInt32NoTag(value.size)
        value.marshal(this)
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
}
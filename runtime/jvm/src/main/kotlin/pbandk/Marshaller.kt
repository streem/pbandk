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
    actual fun writeEnum(value: Message.Enum) = stream.writeEnumNoTag(value.value)
    actual fun writeMessage(value: Message<*>) {
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
    actual fun <T> writePackedRepeated(list: List<T>, sizeFn: (T) -> Int, writeFn: (T) -> Unit) {
        stream.writeUInt32NoTag((list as? ListWithSize)?.protoSize ?: list.sumBy(sizeFn))
        list.forEach(writeFn)
    }
    actual fun <K, V, T : Message<T>> writeMap(
        map: Map<K, V>,
        createEntry: (K, V, Map<Int, pbandk.UnknownField>) -> T
    ) {
        if (map is MapWithSize) {
            stream.writeUInt32NoTag(map.protoSize)
            map.entries.forEach { e -> writeMessage(e as? Message<*> ?: createEntry(e.key, e.value, emptyMap())) }
        } else {
            writePackedRepeated(map.map { (k, v) -> createEntry(k, v, emptyMap()) }, Sizer::messageSize, ::writeMessage)
        }
    }

    actual companion object {
        actual fun stringToUtf8Bytes(str: String) = str.toByteArray()
    }
}
package pbandk.impl

import pbandk.*

abstract class Marshaller {
    abstract fun writeTag(tag: Int): Marshaller
    abstract fun writeUInt32(value: Int)
    abstract fun writeInt32(value: Int)
    abstract fun writeUInt64(value: Long)
    abstract fun writeFixed32(value: Int)
    abstract fun writeFixed64(value: Long)
    abstract fun writeBytes(value: ByteArr)

    fun writeTag(fieldNum: Int, wireType: Int) = also { writeUInt32((fieldNum shl 3) or wireType) }
    fun writeEnum(value: Message.Enum) { writeInt32(value.value) }
    fun writeMessage(value: Message<*>) {
        writeUInt32(value.protoSize)
        @Suppress("CAST_NEVER_SUCCEEDS")
        value.protoMarshal(this as pbandk.Marshaller)
    }
    fun writeUnknownFields(fields: Map<Int, UnknownField>) {
        fun writeUnknownFieldValue(fieldNum: Int, v: UnknownField.Value) {
            when (v) {
                is UnknownField.Value.Varint -> writeTag(fieldNum, 0).writeUInt64(v.varint)
                is UnknownField.Value.Fixed64 -> writeTag(fieldNum, 1).writeFixed64(v.fixed64)
                is UnknownField.Value.LengthDelimited -> writeTag(fieldNum, 2).writeBytes(v.bytes)
                is UnknownField.Value.StartGroup -> TODO()
                is UnknownField.Value.EndGroup -> TODO()
                is UnknownField.Value.Fixed32 -> writeTag(fieldNum, 5).writeFixed32(v.fixed32)
                is UnknownField.Value.Composite -> v.values.forEach { writeUnknownFieldValue(fieldNum, it) }
            }
        }
        fields.forEach { writeUnknownFieldValue(it.key, it.value.value) }
    }
    fun <T> writePackedRepeated(list: List<T>, sizeFn: (T) -> Int, writeFn: (T) -> Unit) {
        writeUInt32((list as? ListWithSize)?.protoSize ?: list.sumBy(sizeFn))
        list.forEach(writeFn)
    }
    fun <K, V, T : Message<T>> writeMap(
        tag: Int,
        map: Map<K, V>,
        createEntry: (K, V, Map<Int, pbandk.UnknownField>) -> T
    ) {
        map.entries.forEach { e ->
            writeTag(tag).writeMessage(e as? Message<*> ?: createEntry(e.key, e.value, emptyMap()))
        }
    }
}
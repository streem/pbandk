package pbandk

import pbandk.protobufjs.Reader
import pbandk.protobufjs.fromProtobufjsLong

actual class Unmarshaller(val r: Reader, val discardUnknownFields: Boolean = false) {

    var lastTag = 0
    var currentUnknownFields = if (discardUnknownFields) null else mutableMapOf<Int, UnknownField>()

    // 0 means there is no next tag
    actual fun readTag(): Int {
        lastTag = if (r.pos == r.len - 1) 0 else readInt32().also { if (it ushr 3 == 0) error("Invalid tag") }
        return lastTag
    }
    actual fun readDouble() = r.double()
    actual fun readFloat() = r.float()
    actual fun readInt32() = r.int32()
    actual fun readInt64() = Long.fromProtobufjsLong(r.int64())
    actual fun readUInt32() = r.uint32()
    actual fun readUInt64() = Long.fromProtobufjsLong(r.uint64())
    actual fun readSInt32() = r.sint32()
    actual fun readSInt64() = Long.fromProtobufjsLong(r.sint64())
    actual fun readFixed32() = r.fixed32()
    actual fun readFixed64() = Long.fromProtobufjsLong(r.fixed64())
    actual fun readSFixed32() = r.sfixed32()
    actual fun readSFixed64() = Long.fromProtobufjsLong(r.sfixed64())
    actual fun readBool() = r.bool()
    actual fun readString() = r.string()
    actual fun readBytes() = ByteArr(r.bytes())
    actual fun <T : Message.Enum> readEnum(s: Message.Enum.Companion<T>) = s.fromValue(readInt32())
    actual fun <T : Message<T>> readMessage(s: Message.Companion<T>): T {
        val endPos = readInt32() + r.pos
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        val ret = s.protoUnmarshal(this)
        require(r.pos == endPos) { "Not at the end of the current message limit as expected" }
        currentUnknownFields = oldUnknownFields
        return ret
    }
    fun tagWireType(tag: Int) = tag and ((1 shl 3) - 1)
    actual fun <T> readRepeated(appendTo: ListWithSize.Builder<T>?, readFn: () -> T) =
        (appendTo ?: ListWithSize.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (tagWireType(lastTag) != 2) {
                r.pos.also { preRead ->
                    bld.list += readFn().also { bld.protoSize += r.pos - preRead }
                }
            } else readInt32().also { len ->
                bld.protoSize += len
                val endPos = r.pos + len
                while (r.pos < endPos) bld.list += readFn()
            }
        }
    actual fun <T : Message.Enum> readRepeatedEnum(appendTo: ListWithSize.Builder<T>?, s: Message.Enum.Companion<T>) =
        readRepeated(appendTo) { readEnum(s) }
    actual fun <T : Message<T>> readRepeatedMessage(appendTo: ListWithSize.Builder<T>?, s: Message.Companion<T>) =
        readRepeated(appendTo) { readMessage(s) }
    actual fun <K, V, T> readMap(
        appendTo: MapWithSize.Builder<K, V>?,
        s: Message.Companion<T>
    ): MapWithSize.Builder<K, V> where T : Message<T>, T : Map.Entry<K, V> =
        (appendTo ?: MapWithSize.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (tagWireType(lastTag) != 2) {
                bld.entries += readMessage(s).also { bld.protoSize += it.protoSize }.let { it.key to it }
            } else readInt32().also { len ->
                bld.protoSize += len
                val endPos = r.pos + len
                while (r.pos < endPos) bld.entries += readMessage(s).let { it.key to it }
            }
        }
    actual fun unknownField() {
        val tag = lastTag
        val unknownFields = currentUnknownFields ?: return run { r.skipType(tagWireType(tag)) }
        val value = when (tagWireType(tag)) {
            0 -> UnknownField.Value.Varint(readInt64())
            1 -> UnknownField.Value.Fixed64(readFixed64())
            2 -> UnknownField.Value.LengthDelimited(readBytes())
            3 -> UnknownField.Value.StartGroup
            4 -> UnknownField.Value.EndGroup
            5 -> UnknownField.Value.Fixed32(readFixed32())
            else -> error("Unrecognized wire type")
        }
        val fieldNum = tag ushr 3
        unknownFields += fieldNum to unknownFields[fieldNum].let { prevVal ->
            UnknownField(fieldNum, prevVal?.value.let {
                when (it) {
                    null -> value
                    is UnknownField.Value.Composite -> it.copy(values = it.values + value)
                    else -> UnknownField.Value.Composite(listOf(it, value))
                }
            })
        }
    }
    actual fun unknownFields() = currentUnknownFields?.toMap() ?: emptyMap()

    actual companion object {
        actual fun fromByteArray(arr: ByteArray) = Unmarshaller(Reader.create(arr))
    }
}
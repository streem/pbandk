package pbandk.protobufjs

import pbandk.*

class Unmarshaller(val r: Reader, val discardUnknownFields: Boolean = false) {

    var lastTag = 0
    var currentUnknownFields = if (discardUnknownFields) null else mutableMapOf<Int, UnknownField>()
    var endPos = r.len

    // 0 means there is no next tag
    fun readTag(): Int {
        lastTag = if (r.pos == endPos) 0 else readInt32().also { if (it ushr 3 == 0) error("Invalid tag") }
        return lastTag
    }
    fun readDouble() = r.double()
    fun readFloat() = r.float()
    fun readInt32() = r.int32()
    fun readInt64() = Long.fromProtobufjsLong(r.int64())
    fun readUInt32() = r.uint32()
    fun readUInt64() = Long.fromProtobufjsLong(r.uint64())
    fun readSInt32() = r.sint32()
    fun readSInt64() = Long.fromProtobufjsLong(r.sint64())
    fun readFixed32() = r.fixed32()
    fun readFixed64() = Long.fromProtobufjsLong(r.fixed64())
    fun readSFixed32() = r.sfixed32()
    fun readSFixed64() = Long.fromProtobufjsLong(r.sfixed64())
    fun readBool() = r.bool()
    fun readString() = r.string()
    fun readBytes() = ByteArr(r.bytes().asByteArray())
    fun <T : Message.Enum> readEnum(s: Message.Enum.Companion<T>) = s.fromValue(readInt32())
    fun <T : Message<T>> readMessage(s: Message.Companion<T>): T {
        val oldEndPos = endPos
        endPos = readInt32() + r.pos
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        @Suppress("CAST_NEVER_SUCCEEDS")
        val ret = s.protoUnmarshal(this as pbandk.Unmarshaller)
        require(r.pos == endPos) { "Not at the end of the current message limit as expected" }
        endPos = oldEndPos
        currentUnknownFields = oldUnknownFields
        return ret
    }
    fun tagWireType(tag: Int) = tag and ((1 shl 3) - 1)
    fun <T> readRepeated(appendTo: ListWithSize.Builder<T>?, readFn: () -> T, neverPacked: Boolean) =
        (appendTo ?: ListWithSize.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (neverPacked || tagWireType(lastTag) != 2) {
                // Size of input doesn't necessarily match size of output, so we disable size on these single items if
                // it is not a message
                bld.list += readFn().also { value ->
                    bld.protoSize?.also { bld.protoSize = if (value is Message<*>) it + value.protoSize else null }
                }
            } else readInt32().also { len ->
                // Only increment if size hasn't been nulled
                bld.protoSize?.also { bld.protoSize = it + len }
                val endPos = r.pos + len
                while (r.pos < endPos) bld.list += readFn()
            }
        }
    fun <T : Message.Enum> readRepeatedEnum(appendTo: ListWithSize.Builder<T>?, s: Message.Enum.Companion<T>) =
        readRepeated(appendTo, { readEnum(s) }, false)
    fun <T : Message<T>> readRepeatedMessage(
        appendTo: ListWithSize.Builder<T>?,
        s: Message.Companion<T>,
        neverPacked: Boolean
    ) = readRepeated(appendTo, { readMessage(s) }, neverPacked)
    fun <K, V, T> readMap(
        appendTo: MessageMap.Builder<K, V>?,
        s: Message.Companion<T>,
        neverPacked: Boolean
    ): MessageMap.Builder<K, V> where T : Message<T>, T : Map.Entry<K, V> =
        (appendTo ?: MessageMap.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (neverPacked || tagWireType(lastTag) != 2) {
                bld.entries += readMessage(s).let { it.key to it }
            } else readInt32().also { len ->
                val endPos = r.pos + len
                while (r.pos < endPos) bld.entries += readMessage(s).let { it.key to it }
            }
        }
    fun unknownField() {
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
        unknownFields[fieldNum] = unknownFields[fieldNum].let { prevVal ->
            UnknownField(fieldNum, prevVal?.value.let {
                when (it) {
                    null -> value
                    is UnknownField.Value.Composite -> it.copy(values = it.values + value)
                    else -> UnknownField.Value.Composite(listOf(it, value))
                }
            })
        }
    }
    fun unknownFields() = currentUnknownFields?.toMap() ?: emptyMap()

    companion object {
        fun fromByteArray(arr: ByteArray) = Unmarshaller(Reader.create(arr.asUint8Array()))
    }
}
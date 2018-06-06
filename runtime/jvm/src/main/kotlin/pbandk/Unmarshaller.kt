package pbandk

import com.google.protobuf.CodedInputStream
import com.google.protobuf.WireFormat

actual class Unmarshaller(val stream: CodedInputStream, val discardUnknownFields: Boolean = false) {
    var currentUnknownFields = if (discardUnknownFields) null else mutableMapOf<Int, UnknownField>()

    actual fun readTag() = stream.readTag()
    actual fun readDouble() = stream.readDouble()
    actual fun readFloat() = stream.readFloat()
    actual fun readInt32() = stream.readInt32()
    actual fun readInt64() = stream.readInt64()
    actual fun readUInt32() = stream.readUInt32()
    actual fun readUInt64() = stream.readUInt64()
    actual fun readSInt32() = stream.readSInt32()
    actual fun readSInt64() = stream.readSInt64()
    actual fun readFixed32() = stream.readFixed32()
    actual fun readFixed64() = stream.readFixed64()
    actual fun readSFixed32() = stream.readSFixed32()
    actual fun readSFixed64() = stream.readSFixed64()
    actual fun readBool() = stream.readBool()
    actual fun readString() = stream.readString()
    actual fun readBytes() = ByteArr(stream.readByteArray())
    actual fun <T : Message.Enum> readEnum(s: Message.Enum.Companion<T>) = s.fromValue(stream.readEnum())
    actual fun <T : Message<T>> readMessage(s: Message.Companion<T>): T {
        val oldLimit = stream.pushLimit(stream.readRawVarint32())
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        val ret = s.protoUnmarshal(this)
        require(stream.isAtEnd) { "Not at the end of the current message limit as expected" }
        stream.popLimit(oldLimit)
        currentUnknownFields = oldUnknownFields
        return ret
    }
    actual fun <T> readRepeated(appendTo: ListWithSize.Builder<T>?, readFn: () -> T) =
        (appendTo ?: ListWithSize.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (WireFormat.getTagWireType(stream.lastTag) != WireFormat.WIRETYPE_LENGTH_DELIMITED) {
                stream.totalBytesRead.also { preRead ->
                    bld.list += readFn().also { bld.protoSize += stream.totalBytesRead - preRead }
                }
            } else stream.readRawVarint32().also { len ->
                bld.protoSize += len
                val oldLimit = stream.pushLimit(len)
                while (!stream.isAtEnd) bld.list += readFn()
                stream.popLimit(oldLimit)
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
            if (WireFormat.getTagWireType(stream.lastTag) != WireFormat.WIRETYPE_LENGTH_DELIMITED) {
                bld.entries += readMessage(s).also { bld.protoSize += it.protoSize }.let { it.key to it }
            } else stream.readRawVarint32().also { len ->
                bld.protoSize += len
                val oldLimit = stream.pushLimit(len)
                while (!stream.isAtEnd) bld.entries += readMessage(s).let { it.key to it }
                stream.popLimit(oldLimit)
            }
        }

    actual fun unknownField() {
        val tag = stream.lastTag
        val unknownFields = currentUnknownFields ?: return run { stream.skipField(tag) }
        val value = when (WireFormat.getTagWireType(tag)) {
            WireFormat.WIRETYPE_VARINT -> UnknownField.Value.Varint(stream.readInt64())
            WireFormat.WIRETYPE_FIXED64 -> UnknownField.Value.Fixed64(stream.readFixed64())
            WireFormat.WIRETYPE_LENGTH_DELIMITED -> UnknownField.Value.LengthDelimited(ByteArr(stream.readByteArray()))
            WireFormat.WIRETYPE_START_GROUP -> UnknownField.Value.StartGroup
            WireFormat.WIRETYPE_END_GROUP -> UnknownField.Value.EndGroup
            WireFormat.WIRETYPE_FIXED32 -> UnknownField.Value.Fixed32(stream.readFixed32())
            else -> error("Unrecognized wire type")
        }
        unknownFields.compute(WireFormat.getTagFieldNumber(tag)) { fieldNum, prevVal ->
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
        actual fun fromByteArray(arr: ByteArray) = Unmarshaller(CodedInputStream.newInstance(arr))
    }
}

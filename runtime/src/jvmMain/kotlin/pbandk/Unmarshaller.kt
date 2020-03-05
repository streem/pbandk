package pbandk

import com.google.protobuf.CodedInputStream
import com.google.protobuf.WireFormat

class CodedStreamUnmarshaller(val stream: CodedInputStream,
                              val discardUnknownFields: Boolean = false): Unmarshaller {
    var currentUnknownFields = if (discardUnknownFields) null else mutableMapOf<Int, UnknownField>()

    override fun getTotalBytesRead(): Int = stream.totalBytesRead
    override fun readTag() = stream.readTag()
    override fun readDouble() = stream.readDouble()
    override fun readFloat() = stream.readFloat()
    override fun readInt32() = stream.readInt32()
    override fun readInt64() = stream.readInt64()
    override fun readUInt32() = stream.readUInt32()
    override fun readUInt64() = stream.readUInt64()
    override fun readSInt32() = stream.readSInt32()
    override fun readSInt64() = stream.readSInt64()
    override fun readFixed32() = stream.readFixed32()
    override fun readFixed64() = stream.readFixed64()
    override fun readSFixed32() = stream.readSFixed32()
    override fun readSFixed64() = stream.readSFixed64()
    override fun readBool() = stream.readBool()
    override fun readString() = stream.readString()
    override fun readBytes() = ByteArr(stream.readByteArray())
    override fun <T : Message.Enum> readEnum(s: Message.Enum.Companion<T>) = s.fromValue(stream.readEnum())
    override fun <T : Message<T>> readMessage(s: Message.Companion<T>): T {
        val oldLimit = stream.pushLimit(stream.readRawVarint32())
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        val ret = s.protoUnmarshal(this)
        require(stream.isAtEnd) { "Not at the end of the current message limit as expected" }
        stream.popLimit(oldLimit)
        currentUnknownFields = oldUnknownFields
        return ret
    }
    override fun <T> readRepeated(appendTo: ListWithSize.Builder<T>?, readFn: () -> T, neverPacked: Boolean) =
        (appendTo ?: ListWithSize.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (neverPacked || WireFormat.getTagWireType(stream.lastTag) != WireFormat.WIRETYPE_LENGTH_DELIMITED) {
                // Size of input doesn't necessarily match size of output, so we disable size on these single items if
                // it is not a message
                bld.list += readFn().also { value ->
                    bld.protoSize?.also { bld.protoSize = if (value is Message<*>) it + value.protoSize else null }
                }
            } else stream.readRawVarint32().also { len ->
                // Only increment if size hasn't been nulled
                bld.protoSize?.also { bld.protoSize = it + len }
                val oldLimit = stream.pushLimit(len)
                while (!stream.isAtEnd) bld.list += readFn()
                stream.popLimit(oldLimit)
            }
        }
    override fun <T : Message.Enum> readRepeatedEnum(appendTo: ListWithSize.Builder<T>?, s: Message.Enum.Companion<T>) =
        readRepeated(appendTo, { readEnum(s) }, false)
    override fun <T : Message<T>> readRepeatedMessage(
        appendTo: ListWithSize.Builder<T>?,
        s: Message.Companion<T>,
        neverPacked: Boolean
    ) = readRepeated(appendTo, { readMessage(s) }, neverPacked)
    override fun <K, V, T> readMap(
        appendTo: MessageMap.Builder<K, V>?,
        s: Message.Companion<T>,
        neverPacked: Boolean
    ): MessageMap.Builder<K, V> where T : Message<T>, T : Map.Entry<K, V> =
        (appendTo ?: MessageMap.Builder()).also { bld ->
            // If it's not length delimited, it's just a single-item to append
            if (neverPacked || WireFormat.getTagWireType(stream.lastTag) != WireFormat.WIRETYPE_LENGTH_DELIMITED) {
                // Unlike lists, since this only reads messages, we can use the message's size to always set it for maps
                bld.entries += readMessage(s).let { it.key to it }
            } else stream.readRawVarint32().also { len ->
                val oldLimit = stream.pushLimit(len)
                while (!stream.isAtEnd) bld.entries += readMessage(s).let { it.key to it }
                stream.popLimit(oldLimit)
            }
        }

    override fun unknownField() {
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

    override fun unknownFields() = currentUnknownFields?.toMap() ?: emptyMap()

    companion object {
        fun fromByteArray(arr: ByteArray): Unmarshaller = CodedStreamUnmarshaller(CodedInputStream.newInstance(arr))
    }
}

internal actual fun unmarshallerByteArray(arr: ByteArray): Unmarshaller = CodedStreamUnmarshaller.fromByteArray(arr)

fun Unmarshaller(stream: CodedInputStream, discardUnknownFields: Boolean = false) =
        CodedStreamUnmarshaller(stream = stream, discardUnknownFields = discardUnknownFields)

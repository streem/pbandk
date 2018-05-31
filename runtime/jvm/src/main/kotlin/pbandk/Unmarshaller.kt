package pbandk

import com.google.protobuf.CodedInputStream
import com.google.protobuf.WireFormat

actual class Unmarshaller(val stream: CodedInputStream, val discardUnknownFields: Boolean = false) {
    var currentUnknownFields: MutableMap<Int, UnknownField>? = null

    actual fun readTag() = stream.readTag()

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

    actual fun readBytes() = ByteArr(stream.readByteArray())
    actual fun readString() = stream.readString()

    actual fun <T> readEnum(knownValues: Map<Int, T>, create: (Int) -> T) =
        stream.readEnum().let { knownValues[it] ?: create(it) }

    actual fun <T : Message> readMessage(s: Message.Companion<T>): T {
        val oldLimit = stream.pushLimit(stream.readRawVarint32())
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        val ret = s.unmarshal(this)
        require(stream.isAtEnd) { "Not at the end of the current message limit as expected" }
        stream.popLimit(oldLimit)
        currentUnknownFields = oldUnknownFields
        return ret
    }

    actual companion object {
        actual fun fromByteArray(arr: ByteArray) = Unmarshaller(CodedInputStream.newInstance(arr))
    }
}

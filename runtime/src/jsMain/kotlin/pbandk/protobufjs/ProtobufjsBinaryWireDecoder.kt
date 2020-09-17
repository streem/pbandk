package pbandk.protobufjs

import pbandk.*
import pbandk.internal.asByteArray
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.BinaryWireDecoder
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireType

internal class ProtobufjsBinaryWireDecoder(private val reader: Reader) : BinaryWireDecoder {
    private var endPos = reader.len

    override fun readTag(): Tag {
        return if (reader.pos == endPos) {
            Tag(0)
        } else {
            val tag = Tag(readUInt32())
            if (tag.fieldNumber == 0) throw InvalidProtocolBufferException("Invalid tag: $tag")
            tag
        }
    }

    override fun readDouble(): Double = reader.double()

    override fun readFloat(): Float = reader.float()

    override fun readInt32(): Int = reader.int32()

    override fun readInt64(): Long = Long.fromProtobufjsLong(reader.int64())

    override fun readUInt32(): Int = reader.uint32()

    override fun readUInt64(): Long = Long.fromProtobufjsLong(reader.uint64())

    override fun readSInt32(): Int = reader.sint32()

    override fun readSInt64(): Long = Long.fromProtobufjsLong(reader.sint64())

    override fun readFixed32(): Int = reader.fixed32()

    override fun readFixed64(): Long = Long.fromProtobufjsLong(reader.fixed64())

    override fun readSFixed32(): Int = reader.sfixed32()

    override fun readSFixed64(): Long = Long.fromProtobufjsLong(reader.sfixed64())

    override fun readBool(): Boolean = reader.bool()

    override fun readString(): String = reader.string()

    override fun readBytes(): ByteArr = ByteArr(reader.bytes().asByteArray())

    override fun <T : Message.Enum> readEnum(enumCompanion: Message.Enum.Companion<T>): T =
        enumCompanion.fromValue(reader.int32())

    private fun readLength() = readUInt32()

    override fun <T : Message> readMessage(messageCompanion: Message.Companion<T>): T {
        val oldEndPos = endPos
        endPos = readLength() + reader.pos
        val message = messageCompanion.decodeWith(BinaryMessageDecoder(this))
        if (reader.pos != endPos) {
            throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
        }
        endPos = oldEndPos
        return message
    }

    override fun <T : Any> readPackedRepeated(readFn: BinaryWireDecoder.() -> T): Sequence<T> = sequence {
        val length = readLength()
        val endPos = reader.pos + length
        while (reader.pos < endPos) yield(readFn())
    }

    override fun readUnknownField(fieldNum: Int, wireType: WireType): UnknownField.Value? {
        // TODO: support a `discardUnknownFields` option in the BinaryMessageDecoder
        //val unknownFields = currentUnknownFields ?: return run { stream.skipField(tag) }
        return when (wireType) {
            WireType.VARINT -> UnknownField.Value.Varint(readInt64())
            WireType.FIXED64 -> UnknownField.Value.Fixed64(readFixed64())
            WireType.LENGTH_DELIMITED -> UnknownField.Value.LengthDelimited(readBytes())
            WireType.START_GROUP -> UnknownField.Value.StartGroup
            WireType.END_GROUP -> UnknownField.Value.EndGroup
            WireType.FIXED32 -> UnknownField.Value.Fixed32(readFixed32())
            else -> throw InvalidProtocolBufferException("Unrecognized wire type: $wireType")
        }
    }
}
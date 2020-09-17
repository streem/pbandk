package pbandk.internal.binary

import com.google.protobuf.CodedInputStream
import pbandk.ByteArr
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.UnknownField

internal class CodedStreamBinaryWireDecoder(private val stream: CodedInputStream) : BinaryWireDecoder {
    override fun readTag(): Tag = Tag(stream.readTag())

    override fun readDouble(): Double = stream.readDouble()

    override fun readFloat(): Float = stream.readFloat()

    override fun readInt32(): Int = stream.readInt32()

    override fun readInt64(): Long = stream.readInt64()

    override fun readUInt32(): Int = stream.readUInt32()

    override fun readUInt64(): Long = stream.readUInt64()

    override fun readSInt32(): Int = stream.readSInt32()

    override fun readSInt64(): Long = stream.readSInt64()

    override fun readFixed32(): Int = stream.readFixed32()

    override fun readFixed64(): Long = stream.readFixed64()

    override fun readSFixed32(): Int = stream.readSFixed32()

    override fun readSFixed64(): Long = stream.readSFixed64()

    override fun readBool(): Boolean = stream.readBool()

    override fun readString(): String = stream.readStringRequireUtf8()

    override fun readBytes(): ByteArr = ByteArr(stream.readByteArray())

    override fun <T : Message.Enum> readEnum(enumCompanion: Message.Enum.Companion<T>): T =
        enumCompanion.fromValue(stream.readEnum())

    override fun <T : Message> readMessage(messageCompanion: Message.Companion<T>): T {
        val oldLimit = stream.pushLimit(stream.readRawVarint32())
        val message = messageCompanion.decodeWith(BinaryMessageDecoder(this))
        if (!stream.isAtEnd) {
            throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
        }
        stream.popLimit(oldLimit)
        return message
    }

    override fun <T : Any> readPackedRepeated(readFn: BinaryWireDecoder.() -> T): Sequence<T> {
        return sequence {
            val oldLimit = stream.pushLimit(stream.readRawVarint32())
            while (!stream.isAtEnd) yield(readFn())
            stream.popLimit(oldLimit)
        }
    }

    override fun readUnknownField(fieldNum: Int, wireType: WireType): UnknownField.Value? {
        // TODO: support a `discardUnknownFields` option in the BinaryMessageDecoder
        //val unknownFields = currentUnknownFields ?: return run { stream.skipField(tag) }
        return when (wireType) {
            WireType.VARINT -> UnknownField.Value.Varint(stream.readInt64())
            WireType.FIXED64 -> UnknownField.Value.Fixed64(stream.readFixed64())
            WireType.LENGTH_DELIMITED -> UnknownField.Value.LengthDelimited(ByteArr(stream.readByteArray()))
            WireType.START_GROUP -> UnknownField.Value.StartGroup
            WireType.END_GROUP -> UnknownField.Value.EndGroup
            WireType.FIXED32 -> UnknownField.Value.Fixed32(stream.readFixed32())
            else -> throw InvalidProtocolBufferException("Unrecognized wire type: $wireType")
        }
    }
}
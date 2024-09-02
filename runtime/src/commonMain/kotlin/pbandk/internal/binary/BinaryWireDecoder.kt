package pbandk.internal.binary

import pbandk.ByteArr
import pbandk.Message
import pbandk.UnknownField

internal interface BinaryWireDecoder {
    /** Returns 0 when there is no next tag (e.g. at EOF) */
    fun readTag(): Tag
    /** Reads a value of [type] and returns its bytes without decoding them */
    fun readRawBytes(type: WireType): ByteArray

    fun checkLastTagWas(value: Tag)

    fun readDouble(): Double
    fun readFloat(): Float
    fun readInt32(): Int
    fun readInt64(): Long
    fun readUInt32(): Int
    fun readUInt64(): Long
    fun readSInt32(): Int
    fun readSInt64(): Long
    fun readFixed32(): Int
    fun readFixed64(): Long
    fun readSFixed32(): Int
    fun readSFixed64(): Long
    fun readBool(): Boolean
    fun readString(): String
    fun readBytes(): ByteArr
    fun <T : Message.Enum> readEnum(enumCompanion: Message.Enum.Companion<T>): T
    fun <T : Message> readLengthPrefixedMessage(messageCompanion: Message.Companion<T>): T
    fun <T : Message> readDelimitedMessage(messageCompanion: Message.Companion<T>): T
    fun <T : Any> readPackedRepeated(readFn: BinaryWireDecoder.() -> T): Sequence<T>

    fun readUnknownFieldValue(wireType: WireType): UnknownField.Value? {
        // TODO: support a `discardUnknownFields` option in the BinaryMessageDecoder
        //val unknownFields = currentUnknownFields ?: return run { stream.skipField(tag) }
        return UnknownField.Value(wireType.value, readRawBytes(wireType))
    }
}
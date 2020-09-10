package pbandk.internal.binary

import pbandk.ByteArr
import pbandk.Message
import pbandk.UnknownField

internal interface BinaryWireDecoder {
    /** Returns 0 when there is no next tag (e.g. at EOF) */
    fun readTag(): Tag

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
    fun <T : Message> readMessage(messageCompanion: Message.Companion<T>): T
    fun <T : Any> readPackedRepeated(readFn: BinaryWireDecoder.() -> T): Sequence<T>

    fun readUnknownField(fieldNum: Int, wireType: WireType): UnknownField.Value?
}
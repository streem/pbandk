// Protocol Buffers - Google's data interchange format
// Copyright 2008 Google Inc.  All rights reserved.
// https://developers.google.com/protocol-buffers/
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
//     * Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
//     * Neither the name of Google Inc. nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package pbandk.impl

import pbandk.*
import pbandk.impl.WireFormat.MAX_VARINT_SIZE


// Implementations are responsible for buffering
interface UnmarshallerInputStream {
    fun read(length: Int): ByteArray
    fun isAtEnd(): Boolean
    fun skipRawBytes(len: Int)
}

class ByteArrayUnmarshallerInputStream (private val arr: ByteArray): UnmarshallerInputStream {
    private var pos = 0
    override fun read(length: Int): ByteArray {
        if (pos + length > arr.size)
            throw InvalidProtocolBufferException.truncatedMessage()
        val ret = arr.sliceArray(pos until pos + length)
        pos += length
        return ret
    }
    override fun isAtEnd(): Boolean = pos == arr.size
    override fun skipRawBytes(len: Int) {
        pos += len
        if (pos > arr.size)
            throw InvalidProtocolBufferException.truncatedMessage()
    }
}

open class Unmarshaller(val stream: UnmarshallerInputStream,
                        val discardUnknownFields: Boolean = false) : pbandk.Unmarshaller {
    override fun getTotalBytesRead(): Int = consumed

    private var lastTag: Int = 0
    private var consumed: Int = 0
    private var curLimit: Int? = null
    var currentUnknownFields = if (discardUnknownFields) null else mutableMapOf<Int, UnknownField>()

    private fun decodeZigZag32(n: Int): Int = n.ushr(1) xor -(n and 1)

    private fun decodeZigZag64(n: Long): Long = n.ushr(1) xor -(n and 1)
    override fun readDouble(): Double = Double.fromBits(readRawLittleEndian64())

    private fun readRawBytes(length: Int): ByteArray {
        if (length >= 0 && consumed + length <= curLimit ?: Int.MAX_VALUE) {
            consumed += length
            return stream.read(length)
        }

        if (length <= 0) {
            if (length == 0) {
                return byteArrayOf()
            } else {
                throw InvalidProtocolBufferException.negativeSize()
            }
        }

        throw InvalidProtocolBufferException.truncatedMessage()
    }

    override fun readFloat(): Float = Float.fromBits(readRawLittleEndian32())
    override fun readUInt64(): Long = readRawVarint64()
    override fun readInt64(): Long = readRawVarint64()
    override fun readInt32(): Int = readRawVarint32()
    override fun readFixed64(): Long = readRawLittleEndian64()
    override fun readFixed32(): Int = readRawLittleEndian32()
    override fun readBool(): Boolean = readRawVarint64() != 0L
    override fun readUInt32(): Int = readRawVarint32()
    private fun readEnum(): Int = readRawVarint32()
    override fun readSFixed32(): Int = readRawLittleEndian32()

    private fun readRawLittleEndian32(): Int = readRawBytes(4).foldRight(0) { byte, acc -> (acc shl 8) or (byte.toInt() and 0xff) }
    private fun readRawLittleEndian64(): Long = readRawBytes(8).foldRight(0L) { byte, acc -> (acc shl 8) or (byte.toLong() and 0xff) }

    override fun readSFixed64(): Long = readRawLittleEndian64()
    override fun readSInt32(): Int = decodeZigZag32(readRawVarint32())

    private fun readRawVarint32(): Int = readRawVarint64().toInt()
    private fun readRawVarint64(): Long {
        var result: Long = 0
        for (shift in 0 until 64 step 7) {
            val b = readRawByte()
            result = result or ((b.toInt() and 0x7F).toLong() shl shift)
            if (b.toInt() and 0x80 == 0) {
                return result
            }
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    private fun readRawByte(): Byte = readRawBytes(1)[0]

    override fun readSInt64(): Long = decodeZigZag64(readRawVarint64())
    override fun readTag(): Int {
        if (isAtEnd()) {
            lastTag = 0
            return 0
        }

        lastTag = readRawVarint32()
        if (WireFormat.getTagFieldNumber(lastTag) == 0) {
            // If we actually read zero (or any tag number corresponding to field
            // number zero), that's not a valid tag.
            throw InvalidProtocolBufferException.invalidTag()
        }
        return lastTag
    }

    override fun readString() = Util.utf8ToString(readBytes().array)
    override fun readBytes() = ByteArr(readRawBytes(readRawVarint32()))

    override fun <T : Message.Enum> readEnum(s: Message.Enum.Companion<T>) = s.fromValue(readEnum())
    override fun <T : Message<T>> readMessage(s: Message.Companion<T>): T {
        val oldLimit = pushLimit(readRawVarint32())
        val oldUnknownFields = currentUnknownFields
        if (!discardUnknownFields) currentUnknownFields = mutableMapOf()
        val ret = s.protoUnmarshal(this)
        require(isAtEnd()) { "Not at the end of the current message limit as expected" }
        popLimit(oldLimit)
        currentUnknownFields = oldUnknownFields
        return ret
    }

    private fun checkLastTagWas(value: Int) {
        if (lastTag != value) {
            throw InvalidProtocolBufferException.invalidEndTag()
        }
    }

    private fun skipRawVarint() {
        repeat(MAX_VARINT_SIZE) {
            if (readRawByte() >= 0)
                return
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private fun skipField(tag: Int): Boolean {
        when (WireFormat.getTagWireType(tag)) {
            WireFormat.WIRETYPE_VARINT -> {
                skipRawVarint()
                return true
            }
            WireFormat.WIRETYPE_FIXED64 -> {
                skipRawBytes(8)
                return true
            }
            WireFormat.WIRETYPE_LENGTH_DELIMITED -> {
                skipRawBytes(readRawVarint32())
                return true
            }
            WireFormat.WIRETYPE_START_GROUP -> {
                skipMessage()
                checkLastTagWas(
                        WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), WireFormat.WIRETYPE_END_GROUP));
                return true
            }
            WireFormat.WIRETYPE_END_GROUP -> return false
            WireFormat.WIRETYPE_FIXED32 -> {
                skipRawBytes(4)
                return true
            }
            else -> throw InvalidProtocolBufferException.invalidWireType()
        }
    }

    private fun skipMessage() {
        while (true) {
            val tag = readTag()
            if (tag == 0 || !skipField(tag)) {
                return
            }
        }
    }

    private fun skipRawBytes(len: Int) {
        stream.skipRawBytes(len)
    }

    private fun isAtEnd(): Boolean = (consumed == curLimit) || (curLimit == null && stream.isAtEnd())

    override fun <T> readRepeated(appendTo: ListWithSize.Builder<T>?, readFn: () -> T, neverPacked: Boolean) =
            (appendTo ?: ListWithSize.Builder()).also { bld ->
                // If it's not length delimited, it's just a single-item to append
                if (neverPacked || WireFormat.getTagWireType(lastTag) != WireFormat.WIRETYPE_LENGTH_DELIMITED) {
                    // Size of input doesn't necessarily match size of output, so we disable size on these single items if
                    // it is not a message
                    bld.list += readFn().also { value ->
                        bld.protoSize?.also { bld.protoSize = if (value is Message<*>) it + value.protoSize else null }
                    }
                } else readRawVarint32().also { len ->
                    // Only increment if size hasn't been nulled
                    bld.protoSize?.also { bld.protoSize = it + len }
                    val oldLimit = pushLimit(len)
                    while (!isAtEnd()) bld.list += readFn()
                    popLimit(oldLimit)
                }
            }

    private fun pushLimit(len: Int): Int? {
        val old = curLimit
        curLimit = consumed + len
        return old
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
                if (neverPacked || WireFormat.getTagWireType(lastTag) != WireFormat.WIRETYPE_LENGTH_DELIMITED) {
                    // Unlike lists, since this only reads messages, we can use the message's size to always set it for maps
                    bld.entries += readMessage(s).let { it.key to it }
                } else readRawVarint32().also { len ->
                    val oldLimit = pushLimit(len)
                    while (!isAtEnd()) bld.entries += readMessage(s).let { it.key to it }
                    popLimit(oldLimit)
                }
            }

    private fun popLimit(oldLimit: Int?) {
        curLimit = oldLimit
    }

    override fun unknownField() {
        val tag = lastTag
        val unknownFields = currentUnknownFields ?: return run { skipField(tag) }
        val value = when (WireFormat.getTagWireType(tag)) {
            WireFormat.WIRETYPE_VARINT -> UnknownField.Value.Varint(readInt64())
            WireFormat.WIRETYPE_FIXED64 -> UnknownField.Value.Fixed64(readFixed64())
            WireFormat.WIRETYPE_LENGTH_DELIMITED -> UnknownField.Value.LengthDelimited(readBytes())
            WireFormat.WIRETYPE_START_GROUP -> UnknownField.Value.StartGroup
            WireFormat.WIRETYPE_END_GROUP -> UnknownField.Value.EndGroup
            WireFormat.WIRETYPE_FIXED32 -> UnknownField.Value.Fixed32(readFixed32())
            else -> error("Unrecognized wire type")
        }
        val fieldNum = WireFormat.getTagFieldNumber(tag)
        val prevVal = unknownFields[fieldNum]
        unknownFields[fieldNum] =
                UnknownField(fieldNum, prevVal?.value.let {
                    when (it) {
                        null -> value
                        is UnknownField.Value.Composite -> it.copy(values = it.values + value)
                        else -> UnknownField.Value.Composite(listOf(it, value))
                    }
                })
    }

    override fun unknownFields() = currentUnknownFields?.toMap() ?: emptyMap()

    companion object {
        fun fromByteArray(arr: ByteArray) = Unmarshaller(
                ByteArrayUnmarshallerInputStream(arr))
    }
}
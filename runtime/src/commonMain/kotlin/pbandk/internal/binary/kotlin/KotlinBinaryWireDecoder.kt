// Copyright 2008-2019 Google Inc.  All rights reserved.
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

package pbandk.internal.binary.kotlin

import pbandk.*
import pbandk.internal.binary.*
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.BinaryWireDecoder
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireType

internal class KotlinBinaryWireDecoder(private val wireReader: WireReader) : BinaryWireDecoder {
    private var lastTag: Tag = Tag(0)
    private var consumed: Int = 0
    private var curLimit: Int? = null

    private fun isAtEnd(): Boolean = (consumed == curLimit) || (curLimit == null && wireReader.isAtEnd())

    private fun readRawBytes(length: Int): ByteArray {
        if (length >= 0 && consumed + length <= curLimit ?: Int.MAX_VALUE) {
            consumed += length
            return wireReader.read(length)
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

    private fun readRawByte(): Byte = readRawBytes(1)[0]

    private fun readRawLittleEndian32(): Int = readRawBytes(4).foldRight(0) {
            byte, acc -> (acc shl 8) or (byte.toInt() and 0xff)
    }

    private fun readRawLittleEndian64(): Long = readRawBytes(8).foldRight(0L) {
            byte, acc -> (acc shl 8) or (byte.toLong() and 0xff)
    }

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

    private fun decodeZigZag32(n: Int): Int = n.ushr(1) xor -(n and 1)

    private fun decodeZigZag64(n: Long): Long = n.ushr(1) xor -(n and 1)

    private fun pushLimit(len: Int): Int? {
        val old = curLimit
        curLimit = consumed + len
        return old
    }

    private fun popLimit(oldLimit: Int?) {
        curLimit = oldLimit
    }

    private fun skipRawBytes(len: Int) {
        wireReader.skipRawBytes(len)
    }

    private fun skipRawVarint() {
        repeat(MAX_VARINT_SIZE) {
            if (readRawByte() >= 0)
                return
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    private fun skipMessage() {
        while (true) {
            val tag = readTag()
            if (tag == Tag(0) || !skipField(tag)) {
                return
            }
        }
    }

    private fun checkLastTagWas(value: Tag) {
        if (lastTag != value) {
            throw InvalidProtocolBufferException.invalidEndTag()
        }
    }

    private fun skipField(tag: Tag): Boolean {
        when (tag.wireType) {
            WireType.VARINT -> {
                skipRawVarint()
                return true
            }
            WireType.FIXED32 -> {
                skipRawBytes(4)
                return true
            }
            WireType.FIXED64 -> {
                skipRawBytes(8)
                return true
            }
            WireType.LENGTH_DELIMITED -> {
                skipRawBytes(readRawVarint32())
                return true
            }
            WireType.START_GROUP -> {
                skipMessage()
                checkLastTagWas(Tag(tag.fieldNumber, WireType.END_GROUP))
                return true
            }
            WireType.END_GROUP -> return false
            else -> throw InvalidProtocolBufferException.invalidWireType()
        }
    }

    override fun readTag(): Tag {
        if (isAtEnd()) {
            lastTag = Tag(0)
            return Tag(0)
        }

        lastTag = Tag(readRawVarint32())
        if (lastTag.fieldNumber == 0) {
            // If we actually read zero (or any tag number corresponding to field
            // number zero), that's not a valid tag.
            throw InvalidProtocolBufferException.invalidTag()
        }
        return lastTag
    }

    private fun readVarintRawBytes(): ByteArray {
        val result = ByteArray(MAX_VARINT_SIZE)
        for (i in 0 until MAX_VARINT_SIZE) {
            val b = readRawByte()
            result[i] = b
            if (b >= 0) return result.copyOf(i + 1)
        }
        throw InvalidProtocolBufferException.malformedVarint()
    }

    private fun readLengthDelimitedRawBytes(): ByteArray {
        val lengthBytes = readRawBytes(WireType.VARINT)
        val length = KotlinBinaryWireDecoder(ByteArrayWireReader(lengthBytes)).readRawVarint32()
        val data = readRawBytes(length)
        return lengthBytes.plus(data)
    }

    private fun readGroupRawBytes(): ByteArray {
        // TODO: properly read in the bytes instead of just skipping them
        skipMessage()
        if (lastTag.wireType != WireType.END_GROUP) {
            throw InvalidProtocolBufferException("Encountered a malformed START_GROUP tag with no matching END_GROUP tag")
        }
        return byteArrayOf()
    }

    override fun readRawBytes(type: WireType): ByteArray = when (type) {
        WireType.VARINT -> readVarintRawBytes()
        WireType.FIXED64 -> readRawBytes(8)
        WireType.LENGTH_DELIMITED -> readLengthDelimitedRawBytes()
        WireType.START_GROUP -> readGroupRawBytes()
        WireType.FIXED32 -> readRawBytes(4)
        else -> throw InvalidProtocolBufferException("Unrecognized wire type: $type")
    }

    override fun readDouble(): Double = Double.fromBits(readRawLittleEndian64())

    override fun readFloat(): Float = Float.fromBits(readRawLittleEndian32())

    override fun readInt32(): Int = readRawVarint32()

    override fun readInt64(): Long = readRawVarint64()

    override fun readUInt32(): Int = readRawVarint32()

    override fun readUInt64(): Long = readRawVarint64()

    override fun readSInt32(): Int = decodeZigZag32(readRawVarint32())

    override fun readSInt64(): Long = decodeZigZag64(readRawVarint64())

    override fun readFixed32(): Int = readRawLittleEndian32()

    override fun readFixed64(): Long = readRawLittleEndian64()

    override fun readSFixed32(): Int = readRawLittleEndian32()

    override fun readSFixed64(): Long = readRawLittleEndian64()

    override fun readBool(): Boolean = readRawVarint64() != 0L

    override fun readString(): String = readBytes().array.decodeToString()

    override fun readBytes(): ByteArr = ByteArr(readRawBytes(readRawVarint32()))

    override fun <T : Message.Enum> readEnum(enumCompanion: Message.Enum.Companion<T>): T =
        enumCompanion.fromValue(readRawVarint32())

    override fun <T : Message> readMessage(messageCompanion: Message.Companion<T>): T {
        val oldLimit = pushLimit(readRawVarint32())
        val message = messageCompanion.decodeWith(BinaryMessageDecoder(this))
        if (!isAtEnd()) {
            throw InvalidProtocolBufferException("Not at the end of the current message limit as expected")
        }
        popLimit(oldLimit)
        return message
    }

    override fun <T : Any> readPackedRepeated(readFn: BinaryWireDecoder.() -> T): Sequence<T> {
        return sequence {
            val oldLimit = pushLimit(readRawVarint32())
            while (!isAtEnd()) yield(readFn())
            popLimit(oldLimit)
        }
    }
}

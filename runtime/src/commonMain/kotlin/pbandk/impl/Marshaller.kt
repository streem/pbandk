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
package pbandk.impl

import pbandk.*
import pbandk.Marshaller
import pbandk.impl.WireFormat.MAX_VARINT_SIZE

class ByteArrayMarshaller private constructor(private val backingBytes: ByteArray)
    : AbstractMarshaller(), pbandk.ByteArrayMarshaller {

    override fun writeRawBytes(arr: ByteArray, offset: Int, len: Int) {
        arr.copyInto(backingBytes, pos, offset, offset + len)
        pos += len
    }

    private var pos = 0

    override fun complete() = backingBytes.sliceArray(0 until pos)

    companion object {
        fun allocate(size: Int) = ByteArrayMarshaller(ByteArray(size))
    }
}

abstract class AbstractMarshaller : pbandk.Marshaller {
    abstract fun writeRawBytes(arr: ByteArray, offset: Int, len: Int)
    private fun encodeZigZag32(n: Int): Int {
        // Note:  the right-shift must be arithmetic
        return (n shl 1) xor (n shr 31)
    }
    private fun encodeZigZag64(n: Long): Long {
        // Note:  the right-shift must be arithmetic
        return (n shl 1) xor (n shr 63)
    }
    override fun writeSInt32(value: Int) {
        writeUInt32(encodeZigZag32(value))
    }
    override fun writeSInt64(value: Long) {
        writeUInt64(encodeZigZag64(value))
    }
    override fun writeBool(value: Boolean) = writeRawBytes(byteArrayOf(
            if (value) 1 else 0
    ), 0, 1)

    override fun writeTag(tag: Int) = also {
        writeUInt32(tag)
    }
    override fun writeUInt32(value: Int) {
        val buffer = ByteArray(MAX_VARINT_SIZE)
        var position = 0
        var valueCur = value
        while (position < MAX_VARINT_SIZE) {
            if ((valueCur and 0x7F.inv()) == 0) {
                buffer[position++] = valueCur.toByte()
                break
            } else {
                buffer[position++] = ((valueCur and 0x7F) or 0x80).toByte()
                valueCur = valueCur ushr 7
            }
        }
        writeRawBytes(buffer, 0, position)
    }
    override fun writeUInt64(value: Long) {
        val buffer = ByteArray(MAX_VARINT_SIZE)
        var position = 0
        var valueCur = value
        while (position < MAX_VARINT_SIZE) {
            if ((valueCur and 0x7FL.inv()) == 0L) {
                buffer[position++] = valueCur.toByte()
                break
            } else {
                buffer[position++] = ((valueCur and 0x7F) or 0x80).toByte()
                valueCur = valueCur ushr 7
            }
        }
        writeRawBytes(buffer, 0, position)
    }
    override fun writeInt32(value: Int) {
        if (value >= 0) {
            writeUInt32(value)
        } else {
            // Must sign-extend.
            writeUInt64(value.toLong())
        }
    }
    override fun writeFixed32(value: Int) {
        writeRawBytes(ByteArray(4) { i -> (value shr (8 * i)).toByte() }, 0, 4)
    }
    override fun writeFixed64(value: Long) {
        writeRawBytes(ByteArray(8) { i -> (value shr (8 * i)).toByte() }, 0, 8)
    }
    override fun writeBytes(value: ByteArr) {
        writeUInt32(value.array.size)
        writeRawBytes(value.array, 0, value.array.size)
    }
    override fun writeSFixed32(value: Int) {
        writeFixed32(value)
    }
    override fun writeSFixed64(value: Long) {
        writeFixed64(value)
    }
    override fun writeInt64(value: Long) {
        writeUInt64(value)
    }
    override fun writeString(value: String) {
        writeBytes(value = ByteArr(Util.stringToUtf8(value)))
    }
    override fun writeFloat(value: Float) {
        writeFixed32(value.toBits())
    }
    override fun writeDouble(value: Double) {
        writeFixed64(value.toBits())
    }

    private fun writeTag(fieldNum: Int, wireType: Int) = also { writeUInt32((fieldNum shl 3) or wireType) }
    override fun writeEnum(value: Message.Enum) { writeInt32(value.value) }
    override fun writeMessage(value: Message<*>) {
        writeUInt32(value.protoSize)
        value.protoMarshal(this)
    }
    override fun writeUnknownFields(fields: Map<Int, UnknownField>) {
        fun writeUnknownFieldValue(fieldNum: Int, v: UnknownField.Value) {
            when (v) {
                is UnknownField.Value.Varint -> writeTag(fieldNum, 0).writeUInt64(v.varint)
                is UnknownField.Value.Fixed64 -> writeTag(fieldNum, 1).writeFixed64(v.fixed64)
                is UnknownField.Value.LengthDelimited -> writeTag(fieldNum, 2).writeBytes(v.bytes)
                is UnknownField.Value.StartGroup -> TODO()
                is UnknownField.Value.EndGroup -> TODO()
                is UnknownField.Value.Fixed32 -> writeTag(fieldNum, 5).writeFixed32(v.fixed32)
                is UnknownField.Value.Composite -> v.values.forEach { writeUnknownFieldValue(fieldNum, it) }
            }
        }
        fields.forEach { writeUnknownFieldValue(it.key, it.value.value) }
    }
    override fun <T> writePackedRepeated(list: List<T>, sizeFn: (T) -> Int, writeFn: (T) -> Unit) {
        writeUInt32((list as? ListWithSize)?.protoSize ?: list.sumBy(sizeFn))
        list.forEach(writeFn)
    }
    override fun <K, V, T : Message<T>> writeMap(
            tag: Int,
            map: Map<K, V>,
            createEntry: (K, V, Map<Int, pbandk.UnknownField>) -> T
    ) {
        map.entries.forEach { e ->
            writeTag(tag).writeMessage(e as? Message<*> ?: createEntry(e.key, e.value, emptyMap()))
        }
    }
}
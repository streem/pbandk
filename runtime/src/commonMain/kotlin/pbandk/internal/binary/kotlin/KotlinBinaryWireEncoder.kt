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
import pbandk.internal.binary.BinaryWireEncoder
import pbandk.internal.binary.WireType
import pbandk.internal.binary.protoSize
import pbandk.internal.binary.zigZagEncoded

internal class KotlinBinaryWireEncoder(private val wireWriter: WireWriter) : BinaryWireEncoder {
    private fun writeValueNoTag(type: FieldDescriptor.Type, value: Any) {
        when (type) {
            is FieldDescriptor.Type.Primitive.Double -> writeDoubleNoTag(value as Double)
            is FieldDescriptor.Type.Primitive.Float -> writeFloatNoTag(value as Float)
            is FieldDescriptor.Type.Primitive.Int64 -> writeInt64NoTag(value as Long)
            is FieldDescriptor.Type.Primitive.UInt64 -> writeUInt64NoTag(value as Long)
            is FieldDescriptor.Type.Primitive.Int32 -> writeInt32NoTag(value as Int)
            is FieldDescriptor.Type.Primitive.Fixed64 -> writeFixed64NoTag(value as Long)
            is FieldDescriptor.Type.Primitive.Fixed32 -> writeFixed32NoTag(value as Int)
            is FieldDescriptor.Type.Primitive.Bool -> writeBoolNoTag(value as Boolean)
            is FieldDescriptor.Type.Primitive.String -> writeStringNoTag(value as String)
            is FieldDescriptor.Type.Primitive.Bytes -> writeBytesNoTag(value as ByteArr)
            is FieldDescriptor.Type.Primitive.UInt32 -> writeUInt32NoTag(value as Int)
            is FieldDescriptor.Type.Primitive.SFixed32 -> writeSFixed32NoTag(value as Int)
            is FieldDescriptor.Type.Primitive.SFixed64 -> writeSFixed64NoTag(value as Long)
            is FieldDescriptor.Type.Primitive.SInt32 -> writeSInt32NoTag(value as Int)
            is FieldDescriptor.Type.Primitive.SInt64 -> writeSInt64NoTag(value as Long)
            is FieldDescriptor.Type.Message<*> -> error("writeValueNoTag() should only be called for primitive types")
            is FieldDescriptor.Type.Enum<*> -> writeEnumNoTag(value as Message.Enum)
            is FieldDescriptor.Type.Repeated<*> -> error("writeValueNoTag() should only be called for primitive types")
            is FieldDescriptor.Type.Map<*, *> -> error("writeValueNoTag() should only be called for primitive types")
        }
    }

    private fun writeUInt32NoTag(value: Int) {
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
        wireWriter.write(buffer, 0, position)
    }

    private fun writeUInt64NoTag(value: Long) {
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
        wireWriter.write(buffer, 0, position)
    }

    private fun writeTag(fieldNum: Int, wireType: WireType) {
        writeUInt32NoTag(Tag(fieldNum, wireType).value)
    }

    override fun writeRawBytes(fieldNum: Int, wireType: WireType, value: ByteArray) {
        writeTag(fieldNum, wireType)
        wireWriter.write(value, 0, value.size)
    }

    override fun writeLengthDelimitedHeader(fieldNum: Int, protoSize: Int) {
        writeTag(fieldNum, WireType.LENGTH_DELIMITED)
        writeUInt32NoTag(protoSize)
    }

    override fun writePackedRepeated(fieldNum: Int, list: List<*>, valueType: FieldDescriptor.Type) {
        val listSize = (list as? ListWithSize)?.protoSize ?: list.sumOf { valueType.protoSize(checkNotNull(it)) }
        writeLengthDelimitedHeader(fieldNum, listSize)
        list.forEach { writeValueNoTag(valueType, checkNotNull(it)) }
    }

    private fun writeInt32NoTag(value: Int) {
        if (value >= 0) {
            writeUInt32NoTag(value)
        } else {
            // Must sign-extend.
            writeUInt64NoTag(value.toLong())
        }
    }

    override fun writeInt32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.VARINT)
        writeInt32NoTag(value)
    }

    private fun writeInt64NoTag(value: Long) {
        writeUInt64NoTag(value)
    }

    override fun writeInt64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.VARINT)
        writeInt64NoTag(value)
    }

    override fun writeUInt32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.VARINT)
        writeUInt32NoTag(value)
    }

    override fun writeUInt64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.VARINT)
        writeUInt64NoTag(value)
    }

    private fun writeSInt32NoTag(value: Int) {
        writeUInt32NoTag(value.zigZagEncoded)
    }

    override fun writeSInt32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.VARINT)
        writeSInt32NoTag(value)
    }

    private fun writeSInt64NoTag(value: Long) {
        writeUInt64NoTag(value.zigZagEncoded)
    }

    override fun writeSInt64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.VARINT)
        writeSInt64NoTag(value)
    }

    private fun writeBoolNoTag(value: Boolean) {
        wireWriter.write(byteArrayOf(if (value) 1 else 0), 0, 1)
    }

    override fun writeBool(fieldNum: Int, value: Boolean) {
        writeTag(fieldNum, WireType.VARINT)
        writeBoolNoTag(value)
    }

    private fun writeEnumNoTag(value: Message.Enum) {
        writeInt32NoTag(value.value)
    }

    override fun writeEnum(fieldNum: Int, value: Message.Enum) {
        writeTag(fieldNum, WireType.VARINT)
        writeEnumNoTag(value)
    }

    private fun writeFixed32NoTag(value: Int) {
        wireWriter.write(ByteArray(4) { i -> (value shr (8 * i)).toByte() }, 0, 4)
    }

    override fun writeFixed32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.FIXED32)
        writeFixed32NoTag(value)
    }

    private fun writeFixed64NoTag(value: Long) {
        wireWriter.write(ByteArray(8) { i -> (value shr (8 * i)).toByte() }, 0, 8)
    }

    override fun writeFixed64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.FIXED64)
        writeFixed64NoTag(value)
    }

    private fun writeSFixed32NoTag(value: Int) {
        writeFixed32NoTag(value)
    }

    override fun writeSFixed32(fieldNum: Int, value: Int) {
        writeTag(fieldNum, WireType.FIXED32)
        writeSFixed32NoTag(value)
    }

    private fun writeSFixed64NoTag(value: Long) {
        writeFixed64NoTag(value)
    }

    override fun writeSFixed64(fieldNum: Int, value: Long) {
        writeTag(fieldNum, WireType.FIXED64)
        writeSFixed64NoTag(value)
    }

    private fun writeFloatNoTag(value: Float) {
        writeFixed32NoTag(value.toRawBits())
    }

    override fun writeFloat(fieldNum: Int, value: Float) {
        writeTag(fieldNum, WireType.FIXED32)
        writeFloatNoTag(value)
    }

    private fun writeDoubleNoTag(value: Double) {
        writeFixed64NoTag(value.toRawBits())
    }

    override fun writeDouble(fieldNum: Int, value: Double) {
        writeTag(fieldNum, WireType.FIXED64)
        writeDoubleNoTag(value)
    }

    private fun writeStringNoTag(value: String) {
        writeBytesNoTag(ByteArr(value.encodeToByteArray()))
    }

    override fun writeString(fieldNum: Int, value: String) {
        writeTag(fieldNum, WireType.LENGTH_DELIMITED)
        writeStringNoTag(value)
    }

    private fun writeBytesNoTag(value: ByteArr) {
        writeUInt32NoTag(value.array.size)
        wireWriter.write(value.array, 0, value.array.size)
    }

    override fun writeBytes(fieldNum: Int, value: ByteArr) {
        writeTag(fieldNum, WireType.LENGTH_DELIMITED)
        writeBytesNoTag(value)
    }
}

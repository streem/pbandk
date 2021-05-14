// Copyright 2019 Google Inc.  All rights reserved.
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

package pbandk.internal.binary

import pbandk.*
import pbandk.wkt.*
import kotlin.Any
import kotlin.reflect.KProperty1

private class CodePointIterator(private val s: String) : Iterator<Int> {
    var pos = 0

    override fun hasNext(): Boolean = pos < s.length

    override fun next(): Int {
        if (pos >= s.length) throw NoSuchElementException()

        val v = s[pos++]
        if (v.isHighSurrogate() && pos < s.length) {
            val l = s[pos]
            if (l.isLowSurrogate()) {
                pos++
                return 0x10000 + (v - 0xD800).code * 0x400 + (l - 0xDC00).code
            }
        }
        return v.code and 0xffff
    }
}

private class CodePointIterable(private val s: String) : Iterable<Int> {
    override fun iterator(): Iterator<Int> = CodePointIterator(s)
}

private fun utf8Len(value: String) = CodePointIterable(value).sumOf {
    when (it) {
        in 0..0x7f -> 1
        in 0x80..0x7ff -> 2
        in 0x800..0xffff -> 3
        else -> 4
    }.toInt()
}

private fun <T : Any> wrapperProtoSize(value: T, type: FieldDescriptor.Type.Message<*>): Int {
    val valueType = type.messageCompanion.descriptor.fields.first().type
    val size = if (valueType.isDefaultValue(value)) 0 else Sizer.tagSize(1) + valueType.protoSize(value)
    return Sizer.uInt32Size(size) + size
}

internal fun FieldDescriptor.Type.protoSize(value: Any) = when (this) {
    is FieldDescriptor.Type.Primitive.Double -> Sizer.doubleSize(value as Double)
    is FieldDescriptor.Type.Primitive.Float -> Sizer.floatSize(value as Float)
    is FieldDescriptor.Type.Primitive.Int64 -> Sizer.int64Size(value as Long)
    is FieldDescriptor.Type.Primitive.UInt64 -> Sizer.uInt64Size(value as Long)
    is FieldDescriptor.Type.Primitive.Int32 -> Sizer.int32Size(value as Int)
    is FieldDescriptor.Type.Primitive.Fixed64 -> Sizer.fixed64Size(value as Long)
    is FieldDescriptor.Type.Primitive.Fixed32 -> Sizer.fixed32Size(value as Int)
    is FieldDescriptor.Type.Primitive.Bool -> Sizer.boolSize(value as Boolean)
    is FieldDescriptor.Type.Primitive.String -> Sizer.stringSize(value as String)
    is FieldDescriptor.Type.Primitive.Bytes -> Sizer.bytesSize(value as ByteArr)
    is FieldDescriptor.Type.Primitive.UInt32 -> Sizer.uInt32Size(value as Int)
    is FieldDescriptor.Type.Primitive.SFixed32 -> Sizer.sFixed32Size(value as Int)
    is FieldDescriptor.Type.Primitive.SFixed64 -> Sizer.sFixed64Size(value as Long)
    is FieldDescriptor.Type.Primitive.SInt32 -> Sizer.sInt32Size(value as Int)
    is FieldDescriptor.Type.Primitive.SInt64 -> Sizer.sInt64Size(value as Long)
    is FieldDescriptor.Type.Message<*> -> when (messageCompanion) {
        DoubleValue.Companion -> wrapperProtoSize(value as Double, this)
        FloatValue.Companion -> wrapperProtoSize(value as Float, this)
        Int64Value.Companion -> wrapperProtoSize(value as Long, this)
        UInt64Value.Companion -> wrapperProtoSize(value as Long, this)
        Int32Value.Companion -> wrapperProtoSize(value as Int, this)
        UInt32Value.Companion -> wrapperProtoSize(value as Int, this)
        BoolValue.Companion -> wrapperProtoSize(value as Boolean, this)
        StringValue.Companion -> wrapperProtoSize(value as String, this)
        BytesValue.Companion -> wrapperProtoSize(value as ByteArr, this)
        else -> Sizer.messageSize(value as Message)
    }
    is FieldDescriptor.Type.Enum<*> -> Sizer.enumSize(value as Message.Enum)
    is FieldDescriptor.Type.Repeated<*> -> Sizer.repeatedSize(value as List<*>, valueType, packed)
    is FieldDescriptor.Type.Map<*, *> -> Sizer.mapSize(value as Map<*, *>, entryCompanion)
}

internal abstract class AbstractSizer {
    open fun stringSize(value: String): Int {
        val len = utf8Len(value)
        return uInt32Size(len) + len
    }

    fun <T : Message.Enum> enumSize(value: T) = int32Size(value.value)

    fun <T : Message> messageSize(value: T) = uInt32Size(value.protoSize) + value.protoSize

    fun <T : Message> rawMessageSize(message: T): Int {
        var protoSize = 0
        for (fd in message.descriptor.fields) {
            @Suppress("UNCHECKED_CAST")
            val value = (fd.value as KProperty1<T, *>).get(message)

            if (fd.type.shouldOutputValue(value) && value != null) {
                protoSize += when (fd.type) {
                    is FieldDescriptor.Type.Repeated<*> -> {
                        tagSize(fd.number) * (if (fd.type.packed) 1 else (value as List<*>).size)
                    }
                    is FieldDescriptor.Type.Map<*, *> -> tagSize(fd.number) * (value as Map<*, *>).size
                    else -> tagSize(fd.number)
                }
                protoSize += fd.type.protoSize(value)
            }
        }

        protoSize += message.unknownFields.values.sumOf { it.size }
        return protoSize
    }

    fun <T> repeatedSize(list: List<T>, valueType: FieldDescriptor.Type, packed: Boolean): Int {
        val sizeFn: (T) -> Int = { if (it != null) valueType.protoSize(it) else 0 }
        return if (packed) {
            packedRepeatedSize(list, sizeFn)
        } else {
            list.sumOf(sizeFn)
        }
    }

    fun <T> packedRepeatedSize(list: List<T>, sizeFn: (T) -> Int) =
        if (list is ListWithSize && list.protoSize != null) list.protoSize + uInt32Size(list.protoSize)
        else list.sumOf(sizeFn).let { it + uInt32Size(it) }

    fun mapSize(map: Map<*, *>, entryCompanion: MessageMap.Entry.Companion<*, *>): Int {
        return map.entries.sumOf { entry ->
            if (entry is MessageMap.Entry<*, *>) {
                entry.protoSize
            } else {
                val keySize = entry.key
                    .takeIf { entryCompanion.keyType.shouldOutputValue(it) }
                    ?.let { Sizer.tagSize(1) + entryCompanion.keyType.protoSize(it) }
                    ?: 0
                val valueSize = entry.value
                    .takeIf { entryCompanion.valueType.shouldOutputValue(it) }
                    ?.let { Sizer.tagSize(2) + entryCompanion.valueType.protoSize(it) }
                    ?: 0
                keySize + valueSize
            }.let { size ->
                Sizer.uInt32Size(size) + size
            }
        }
    }

    fun tagSize(fieldNum: Int) = uInt32Size(Tag(fieldNum, WireType(0)).value)

    fun doubleSize(@Suppress("UNUSED_PARAMETER") value: Double) = 8

    fun floatSize(@Suppress("UNUSED_PARAMETER") value: Float) = 4

    fun int32Size(value: Int) = if (value >= 0) uInt32Size(value) else 10

    fun int64Size(value: Long) = uInt64Size(value)

    fun uInt32Size(value: Int) = when {
        value and (0.inv() shl 7) == 0 -> 1
        value and (0.inv() shl 14) == 0 -> 2
        value and (0.inv() shl 21) == 0 -> 3
        value and (0.inv() shl 28) == 0 -> 4
        else -> 5
    }

    fun uInt64Size(value: Long): Int {
        // Taken from CodedOutputStream.java's computeUInt64SizeNoTag
        @Suppress("NAME_SHADOWING")
        var value = value
        if (value and (0L.inv() shl 7) == 0L) return 1
        if (value < 0L) return 10
        var n = 2
        if (value and (0L.inv() shl 35) != 0L) {
            n += 4
            value = value ushr 28
        }
        if (value and (0L.inv() shl 21) != 0L) {
            n += 2
            value = value ushr 14
        }
        if (value and (0L.inv() shl 14) != 0L) {
            n += 1
        }
        return n
    }

    fun sInt32Size(value: Int) = uInt32Size(value.zigZagEncoded)

    fun sInt64Size(value: Long) = uInt64Size(value.zigZagEncoded)

    fun fixed32Size(@Suppress("UNUSED_PARAMETER") value: Int) = 4

    fun fixed64Size(@Suppress("UNUSED_PARAMETER") value: Long) = 8

    fun sFixed32Size(@Suppress("UNUSED_PARAMETER") value: Int) = 4

    fun sFixed64Size(@Suppress("UNUSED_PARAMETER") value: Long) = 8

    fun boolSize(@Suppress("UNUSED_PARAMETER") value: Boolean) = 1

    fun bytesSize(value: ByteArr) = uInt32Size(value.array.size) + value.array.size
}

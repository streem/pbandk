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

package pbandk.impl

import pbandk.UtilInterface
import pbandk.wkt.Timestamp

private class CodePointIterator (private val s: String): Iterator<Int> {
    var pos = 0

    override fun hasNext(): Boolean = pos < s.length

    override fun next(): Int {
        val v = s[pos++]
        if (v in 0xD800.toChar()..0xDBFF.toChar() && pos < s.length) {
            val l = s[pos]
            if (l in 0xDC00.toChar()..0xDFFF.toChar()) {
                pos++
                return 0x10000 + (v - 0xD800).toInt() * 0x400 + (l - 0xDC00).toInt()
            }
        }
        return v.toInt() and 0xffff
    }
}

private class CodePointIterable (private val s: String): Iterable<Int> {
    override fun iterator(): Iterator<Int> = CodePointIterator(s)
}

object Util : UtilInterface {
    override fun stringToUtf8(str: String): ByteArray {
        val output = ByteArray(utf8Len(str))
        var pos = 0
        CodePointIterator(str).forEach {
            when (it) {
                in 0..0x7f -> output[pos++] = it.toByte()
                in 0x80..0x7ff -> {
                    output[pos++] = (0xc0 or ((it shr 6) and 0x1f)).toByte()
                    output[pos++] = (0x80 or (it and 0x3f)).toByte()
                }
                in 0x800..0xffff -> {
                    output[pos++] = (0xe0 or ((it shr 12) and 0xf)).toByte()
                    output[pos++] = (0x80 or ((it shr 6) and 0x3f)).toByte()
                    output[pos++] = (0x80 or (it and 0x3f)).toByte()
                }
                else -> {
                    output[pos++] = (0xf0 or ((it shr 18) and 0x7)).toByte()
                    output[pos++] = (0x80 or ((it shr 12) and 0x3f)).toByte()
                    output[pos++] = (0x80 or ((it shr 6) and 0x3f)).toByte()
                    output[pos++] = (0x80 or (it and 0x3f)).toByte()
                }
            }
        }
        return output
    }
    override fun utf8ToString(bytes: ByteArray): String {
        var pos = 0
        val ret = StringBuilder()
        while (pos < bytes.size) {
            val codePoint: Int
            when (bytes[pos].toInt() and 0xff) {
                in 0..0x7f -> {
                    codePoint = bytes[pos].toInt()
                    pos++
                }
                in 0xc0..0xdf -> {
                    codePoint = decodeSeq(bytes, pos, 2)
                    pos += 2
                }
                in 0xe0..0xef -> {
                    codePoint = decodeSeq(bytes, pos, 3)
                    pos += 3
                }
                in 0xf0..0xf7 -> {
                    codePoint = decodeSeq(bytes, pos, 4)
                    pos += 4
                }
                else -> throw InvalidUTF8Exception()
            }
            when (codePoint) {
                in 0..0xffff -> ret.append(codePoint.toChar())
                in 0x10000..0x10ffff -> ret.append(
                        (((codePoint shr 10) and 0x3ff) or 0xDC00).toChar(),
                        ((codePoint and 0x3ff) or 0xD800).toChar())
                else -> throw InvalidUTF8Exception()
            }
        }
        return ret.toString()
    }

    @ExperimentalStdlibApi
    override fun base64ToBytes(str: String): ByteArray {
        return str.encodeToByteArray()
    }

    override fun bytesToBase64(bytes: ByteArray): String {
        return bytes.contentToString()
    }

    // Not sure this is a requirement for now
    override fun timestampToString(ts: Timestamp.JsonMapper): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // Not sure this is a requirement for now
    override fun stringToTimestamp(str: String): Timestamp.JsonMapper {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun decodeSeq(bytes: ByteArray, pos: Int, len: Int): Int {
        var ret = bytes[pos].toInt() and (0x7f shr len)
        for (i in pos + 1 until pos + len) {
            if (i >= bytes.size || (bytes[i].toInt() and 0xff) !in 0x80..0xbf)
                throw InvalidUTF8Exception()
            ret = (ret shl 6) or (bytes[i].toInt() and 0x3f)
        }
        return ret
    }

    fun utf8Len(value: String) = CodePointIterable(value).sumBy {
        when (it) {
            in 0..0x7f -> 1
            in 0x80..0x7ff -> 2
            in 0x800..0xffff -> 3
            else -> 4
        }
    }
}

class InvalidUTF8Exception : Exception("Invalid UTF-8")
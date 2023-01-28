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

package pbandk.internal.binary.kotlin

import pbandk.InvalidProtocolBufferException

// Based on CodedInputStream.ArrayDecoder from protobuf-java
internal class ByteArrayWireReader(
    private val arr: ByteArray,
    offset: Int,
    length: Int
) : WireReader {
    constructor(arr: ByteArray) : this(arr, 0, arr.size)

    private val limit = offset + length
    private var pos = offset

    override fun read(length: Int): ByteArray = when {
        length in 1..(limit - pos) -> {
            val tempPos = pos
            pos += length
            arr.copyOfRange(tempPos, pos)
        }
        length < 0 -> throw InvalidProtocolBufferException.negativeSize()
        length == 0 -> byteArrayOf()
        else -> throw InvalidProtocolBufferException.truncatedMessage()
    }

    override fun readByte(): Byte {
        if (limit > pos) return arr[pos++]

        throw InvalidProtocolBufferException.truncatedMessage()
    }

    override fun isAtEnd(): Boolean = pos == limit

    override fun skipRawBytes(length: Int) {
        when {
            length in 0..(limit - pos) -> pos += length
            length < 0 -> throw InvalidProtocolBufferException.negativeSize()
            else -> throw InvalidProtocolBufferException.truncatedMessage()
        }
    }
}
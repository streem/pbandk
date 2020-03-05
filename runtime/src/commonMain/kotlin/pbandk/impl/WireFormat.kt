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

/**
 * This class is used internally by the Protocol Buffer library and generated message
 * implementations. It is public only because those generated messages do not reside in the `protobuf` package. Others should not use this class directly.
 *
 *
 * This class contains constants and helper functions useful for dealing with the Protocol Buffer
 * wire format.
 *
 * @author kenton@google.com Kenton Varda
 */
object WireFormat {
    internal const val FIXED32_SIZE = 4
    internal const val FIXED64_SIZE = 8
    internal const val MAX_VARINT32_SIZE = 5
    internal const val MAX_VARINT64_SIZE = 10
    internal const val MAX_VARINT_SIZE = 10

    const val WIRETYPE_VARINT = 0
    const val WIRETYPE_FIXED64 = 1
    const val WIRETYPE_LENGTH_DELIMITED = 2
    const val WIRETYPE_START_GROUP = 3
    const val WIRETYPE_END_GROUP = 4
    const val WIRETYPE_FIXED32 = 5

    internal const val TAG_TYPE_BITS = 3
    internal const val TAG_TYPE_MASK = (1 shl TAG_TYPE_BITS) - 1

    // Field numbers for fields in MessageSet wire format.
    internal const val MESSAGE_SET_ITEM = 1
    internal const val MESSAGE_SET_TYPE_ID = 2
    internal const val MESSAGE_SET_MESSAGE = 3

    /** Given a tag value, determines the wire type (the lower 3 bits).  */
    fun getTagWireType(tag: Int): Int {
        return tag and TAG_TYPE_MASK
    }

    /** Given a tag value, determines the field number (the upper 29 bits).  */
    fun getTagFieldNumber(tag: Int): Int {
        return tag.ushr(TAG_TYPE_BITS)
    }

    /** Makes a tag value given a field number and wire type.  */
    internal fun makeTag(fieldNumber: Int, wireType: Int): Int {
        return fieldNumber shl TAG_TYPE_BITS or wireType
    }
}
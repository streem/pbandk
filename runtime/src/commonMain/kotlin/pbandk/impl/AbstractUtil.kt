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

import pbandk.Util

abstract class AbstractUtil {
    fun base64ToBytes(str: String): ByteArray {
        return str.decodeBase64ToArray()
            ?: throw RuntimeException("Unable to base64-decode string: $str")
    }

    fun bytesToBase64(bytes: ByteArray): String {
        return Util.utf8ToString(bytes.encodeBase64())
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
}

class InvalidUTF8Exception : Exception("Invalid UTF-8")
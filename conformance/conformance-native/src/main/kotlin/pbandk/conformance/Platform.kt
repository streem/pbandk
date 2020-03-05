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

package pbandk.conformance

import platform.posix.*
import kotlinx.cinterop.cstr
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.addressOf

actual object Platform {
    actual fun stderrPrintln(str: String) {
        val strn = str + "\n"
        val cstr = strn.cstr
        write(2, cstr, cstr.size.toULong())
    }

    actual fun stdinReadIntLE() = ByteArray(4).let {
        if (readBytes(0, it) != 4) null else
            it.foldRight(0) { byte, acc ->
                (acc shl 8) or (byte.toInt() and 0xff)
            }
    }

    private fun readBytes(fd: Int, arr: ByteArray): Int {
        arr.usePinned {
            return read(fd, it.addressOf(0), arr.size.toULong()).toInt()
        }
    }

    actual fun stdinReadFull(arr: ByteArray) =
            require(readBytes(0, arr) == arr.size) { "Unable to read full byte array" }

    actual fun stdoutWriteIntLE(v: Int) =
            stdoutWriteFull (ByteArray(4) { (v shr (8 * it)).toByte() })

    actual fun stdoutWriteFull(arr: ByteArray) {
        arr.usePinned {
            write(1, it.addressOf(0), arr.size.toULong())
        }
    }

    actual inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T) = try { fn() } catch (e: Exception) { errFn(e) }
}
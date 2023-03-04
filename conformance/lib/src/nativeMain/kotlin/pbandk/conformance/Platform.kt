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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.runBlocking
import pbandk.Message
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray

internal class PosixException(val errno: Int) : RuntimeException(
    strerror(errno)?.toString() ?: "Error with unknown errno: $errno"
)

actual object Platform {
    actual fun stderrPrintln(str: String) {
        val strn = str + "\n"
        val cstr = strn.cstr
        write(2, cstr, cstr.size.toULong())
    }

    private suspend fun stdinReadIntLE() = withContext(Dispatchers.Default) {
        ByteArray(4).let {
            if (readBytes(0, it) != 4) null else {
                it.foldRight(0) { byte, acc ->
                    (acc shl 8) or (byte.toInt() and 0xff)
                }
            }
        }
    }

    private fun readBytes(fd: Int, arr: ByteArray): Int {
        arr.usePinned {
            debug { "Reading ${arr.size} bytes from fd $fd" }
            val bytesRead = read(fd, it.addressOf(0), arr.size.toULong())
            debug { "Read $bytesRead bytes from fd $fd" }
            if (bytesRead == -1L) {
                throw PosixException(posix_errno())
            }

            return bytesRead.toInt()
        }
    }

    private suspend fun stdinReadFull(size: Int) = withContext(Dispatchers.Default) {
        ByteArray(size).also {
            require(readBytes(0, it) == it.size) { "Unable to read full byte array"}
        }
    }

    actual suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T? {
        val size = stdinReadIntLE() ?: return null
        debug { "Reading $size bytes" }
        return companion.decodeFromByteArray(stdinReadFull(size))
    }

    private fun stdoutWriteIntLE(v: Int) =
            stdoutWriteFull (ByteArray(4) { (v shr (8 * it)).toByte() })

    private fun stdoutWriteFull(arr: ByteArray) {
        arr.usePinned {
            val bytesWritten = write(1, it.addressOf(0), arr.size.toULong())

            if (bytesWritten.toInt() == -1) {
                // errno
                throw PosixException(posix_errno())
            } else if (bytesWritten < arr.size) {
                throw RuntimeException("Tried to write ${arr.size} bytes but only wrote $bytesWritten bytes")
            }
        }
    }

    actual fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T) {
        message.encodeToByteArray().also { bytes ->
            stdoutWriteIntLE(bytes.size)
            stdoutWriteFull(bytes)
        }
    }

    actual inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T) = try {
        fn()
    } catch (e: Exception) {
        errFn(e)
    }

    actual fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        runBlocking(block = block)
    }
}
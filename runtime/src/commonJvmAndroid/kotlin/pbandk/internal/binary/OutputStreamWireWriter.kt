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

package pbandk.internal.binary

import pbandk.binary.MAX_VARINT_SIZE
import pbandk.internal.binary.kotlin.WireWriter
import java.io.OutputStream

// Based on CodedOutputStream.OutputStreamEncoder from protobuf-java
/**
 * Performs internal buffering to optimize writes to [stream].
 */
internal class OutputStreamWireWriter(
    private val stream: OutputStream,
    bufferSize: Int = DEFAULT_BUFFER_SIZE
) : WireWriter {
    override var totalBytesWritten = 0
        private set

    // As an optimization, we require that the buffer be able to store at least 2
    // varints so that we can buffer any integer write (tag + value). This reduces the
    // number of range checks for a single write to 1 (i.e. if there is not enough space
    // to buffer the tag+value, flush and then buffer it).
    private val buffer = ByteArray(bufferSize.coerceAtLeast(MAX_VARINT_SIZE * 2))
    private val limit = buffer.size
    private var position = 0

    override fun writeByte(byte: Byte) {
        if (limit > position) {
            // We have room in the current buffer.
            buffer[position++] = byte
            totalBytesWritten += 1
            return
        }

        // Write extends past current buffer. Since we have an output stream, this is our buffer
        // and buffer offset == 0
        doFlush()
        buffer[0] = byte
        position = 1
        totalBytesWritten += 1
    }

    override fun write(bytes: ByteArray, offset: Int, length: Int) {
        if (limit - position >= length) {
            // We have room in the current buffer.
            bytes.copyInto(buffer, position, offset, offset + length)
            position += length
            totalBytesWritten += length
            return
        }

        @Suppress("NAME_SHADOWING")
        var offset = offset
        @Suppress("NAME_SHADOWING")
        var length = length

        // Write extends past current buffer.  Fill the rest of this buffer and
        // flush.
        val bytesWritten = limit - position
        bytes.copyInto(buffer, position, offset, offset + bytesWritten)
        offset += bytesWritten
        length -= bytesWritten
        position = limit
        totalBytesWritten += bytesWritten
        doFlush()

        // Now deal with the rest.
        // Since we have an output stream, this is our buffer
        // and buffer offset == 0
        if (length <= limit) {
            // Fits in new buffer.
            bytes.copyInto(buffer, 0, offset, offset + length)
            position = length
        } else {
            // Write is very big.  Let's do it all at once.
            stream.write(bytes, offset, length)
        }
        totalBytesWritten += length
    }

    fun flush() {
        if (position > 0) {
            // Flush the buffer.
            doFlush()
        }
    }

    private fun doFlush() {
        stream.write(buffer, 0, position)
        position = 0
    }
}
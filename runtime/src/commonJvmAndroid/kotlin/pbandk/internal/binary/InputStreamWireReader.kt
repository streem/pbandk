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

import pbandk.InvalidProtocolBufferException
import pbandk.internal.binary.kotlin.WireReader
import java.io.InputStream

// Based on CodedInputStream.StreamDecoder from protobuf-java
/**
 * @param input InputStream to read from
 *
 * @param sizeLimit Set the maximum message size. In order to prevent malicious messages from exhausting memory or
 * causing integer overflows, `InputStreamWireReader` limits how large a message may be. The default limit is
 * [Int.MAX_VALUE]. You should set this limit as small as you can without harming your app's functionality. If you want
 * to read several messages from a single `InputStreamWireReader`, you could call [resetSizeCounter] after each one to
 * avoid hitting the size limit.
 *
 * @param bufferSize Number of bytes to read at a time. The default is [DEFAULT_BUFFER_SIZE].
 */
internal class InputStreamWireReader(
    private val input: InputStream,
    sizeLimit: Int = Int.MAX_VALUE,
    bufferSize: Int = DEFAULT_BUFFER_SIZE
) : WireReader {
    var sizeLimit = sizeLimit
        set(value) {
            require(value >= 0) { "Size limit cannot be negative: $value" }
            field = value
        }

    private val buffer = ByteArray(bufferSize)

    /** [bufferSize] represents how many bytes are currently filled in the buffer */
    private var bufferSize = 0

    private var bufferSizeAfterLimit = 0
    private var pos = 0

    /**
     * The total number of bytes read before the current buffer. The total bytes read up to the
     * current position can be computed as `totalBytesRetired + pos`.
     */
    private var totalBytesRetired = 0

    /** The absolute position of the end of the current message. */
    private val currentLimit = Int.MAX_VALUE

    constructor(
        firstByte: Byte,
        input: InputStream,
        sizeLimit: Int = Int.MAX_VALUE,
        bufferSize: Int = DEFAULT_BUFFER_SIZE
    ) : this(input, sizeLimit, bufferSize) {
        buffer[0] = firstByte
        this.bufferSize = 1
    }

    override fun read(length: Int): ByteArray {
        val tempPos = pos
        return if (length in 1..(bufferSize - tempPos)) {
            pos = tempPos + length
            buffer.copyOfRange(tempPos, tempPos + length)
        } else {
            // TODO: Do we want to protect from malicious input streams here?
            readRawBytesSlowPath(length, ensureNoLeakedReferences = false)
        }
    }

    override fun isAtEnd(): Boolean {
        return pos == bufferSize && !tryRefillBuffer(1)
    }

    override fun skipRawBytes(length: Int) {
        if (length in 0..(bufferSize - pos)) {
            // We have all the bytes we need already.
            pos += length
        } else {
            skipRawBytesSlowPath(length)
        }
    }

    /**
     * Exactly like readRawBytes, but caller must have already checked the fast path:
     * `(size <= (bufferSize - pos) && size > 0)`
     *
     * If [ensureNoLeakedReferences] is true, the value is guaranteed to have not escaped to untrusted code.
     */
    private fun readRawBytesSlowPath(size: Int, ensureNoLeakedReferences: Boolean): ByteArray {
        // Attempt to read the data in one byte array when it's safe to do.
        val result = readRawBytesSlowPathOneChunk(size)
        if (result != null) {
            return if (ensureNoLeakedReferences) result.clone() else result
        }

        val originalBufferPos = pos
        val bufferedBytes = bufferSize - pos

        // Mark the current buffer consumed.
        totalBytesRetired += bufferSize
        pos = 0
        bufferSize = 0

        // Determine the number of bytes we need to read from the input stream.
        val sizeLeft = size - bufferedBytes

        // The size is very large. For security reasons we read them in small
        // chunks.
        val chunks = readRawBytesSlowPathRemainingChunks(sizeLeft)

        // OK, got everything.  Now concatenate it all into one buffer.
        val bytes = ByteArray(size)

        // Start by copying the leftover bytes from `this.buffer`.
        buffer.copyInto(bytes, 0, originalBufferPos, originalBufferPos + bufferedBytes)

        // And now all the chunks.
        var tempPos = bufferedBytes
        for (chunk in chunks) {
            chunk.copyInto(bytes, tempPos)
            tempPos += chunk.size
        }

        // Done.
        return bytes
    }

    /**
     * Attempts to read the data in one byte array when it's safe to do. Returns null if the size to
     * read is too large and needs to be allocated in smaller chunks for security reasons.
     *
     * Returns a `ByteArray` that may have escaped to user code via InputStream APIs.
     */
    private fun readRawBytesSlowPathOneChunk(size: Int): ByteArray? {
        if (size == 0) {
            return byteArrayOf()
        }
        if (size < 0) {
            throw InvalidProtocolBufferException.negativeSize()
        }

        // Integer-overflow-conscious check that the message size so far has not exceeded sizeLimit.
        val currentMessageSize = totalBytesRetired + pos + size
        if (currentMessageSize - sizeLimit > 0) {
            throw InvalidProtocolBufferException.sizeLimitExceeded()
        }

        // Verify that the message size so far has not exceeded currentLimit.
        if (currentMessageSize > currentLimit) {
            // Read to the end of the stream anyway.
            skipRawBytes(currentLimit - totalBytesRetired - pos)
            throw InvalidProtocolBufferException.truncatedMessage()
        }

        val bufferedBytes = bufferSize - pos
        // Determine the number of bytes we need to read from the input stream.
        val sizeLeft = size - bufferedBytes
        // TODO: Consider using a value larger than DEFAULT_BUFFER_SIZE.
        if (sizeLeft < DEFAULT_BUFFER_SIZE || sizeLeft <= input.available()) {
            // Either the bytes we need are known to be available, or the required buffer is
            // within an allowed threshold - go ahead and allocate the buffer now.
            val bytes = ByteArray(size)

            // Copy all of the buffered bytes to the result buffer.
            buffer.copyInto(bytes, 0, pos, pos + bufferedBytes)
            totalBytesRetired += bufferSize
            pos = 0
            bufferSize = 0

            // Fill the remaining bytes from the input stream.
            var tempPos = bufferedBytes
            while (tempPos < bytes.size) {
                val n = input.read(bytes, tempPos, size - tempPos)
                if (n == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage()
                }
                totalBytesRetired += n
                tempPos += n
            }

            return bytes
        }

        return null
    }

    /**
     * Reads the remaining data in small chunks from the input stream.
     *
     * Returns a ByteArray that may have escaped to user code via InputStream APIs.
     */
    private fun readRawBytesSlowPathRemainingChunks(sizeLeft: Int): List<ByteArray> {
        // The size is very large.  For security reasons, we can't allocate the
        // entire byte array yet.  The size comes directly from the input, so a
        // maliciously-crafted message could provide a bogus very large size in
        // order to trick the app into allocating a lot of memory.  We avoid this
        // by allocating and reading only a small chunk at a time, so that the
        // malicious message must actually *be* extremely large to cause
        // problems.  Meanwhile, we limit the allowed size of a message elsewhere.
        val chunks: MutableList<ByteArray> = ArrayList()

        @Suppress("NAME_SHADOWING")
        var sizeLeft = sizeLeft

        while (sizeLeft > 0) {
            // TODO: Consider using a value larger than DEFAULT_BUFFER_SIZE.
            val chunk = ByteArray(sizeLeft.coerceAtMost(DEFAULT_BUFFER_SIZE))
            var tempPos = 0
            while (tempPos < chunk.size) {
                val n = input.read(chunk, tempPos, chunk.size - tempPos)
                if (n == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage()
                }
                totalBytesRetired += n
                tempPos += n
            }
            sizeLeft -= chunk.size
            chunks.add(chunk)
        }

        return chunks
    }

    /** Resets the current size counter to zero (see [sizeLimit]). */
    fun resetSizeCounter() {
        totalBytesRetired = -pos
    }

    private fun recomputeBufferSizeAfterLimit() {
        bufferSize += bufferSizeAfterLimit
        val bufferEnd = totalBytesRetired + bufferSize
        if (bufferEnd > currentLimit) {
            // Limit is in current buffer.
            bufferSizeAfterLimit = bufferEnd - currentLimit
            bufferSize -= bufferSizeAfterLimit
        } else {
            bufferSizeAfterLimit = 0
        }
    }

    /** The total bytes read up to the current position. Calling [resetSizeCounter] resets this value to zero. */
    val totalBytesRead: Int get() = totalBytesRetired + pos

    /**
     * Tries to read more bytes from the input, making at least [n] bytes available in the
     * buffer. Caller must ensure that the requested space is not yet available, and that the
     * requested space is less than BUFFER_SIZE.
     *
     * @return `true` If the bytes could be made available; `false` if 1. Current at the
     * end of the stream 2. The current limit was reached 3. The total size limit was reached
     */
    private fun tryRefillBuffer(n: Int): Boolean {
        check(pos + n > bufferSize) { "refillBuffer() called when $n bytes were already available in buffer" }

        // Check whether the size of total message needs to read is bigger than the size limit.
        // We shouldn't throw an exception here as isAtEnd() function needs to get this function's
        // return as the result.
        if (n > sizeLimit - totalBytesRetired - pos) {
            return false
        }

        // Shouldn't throw the exception here either.
        if (totalBytesRetired + pos + n > currentLimit) {
            // Oops, we hit a limit.
            return false
        }

        val tempPos = pos
        if (tempPos > 0) {
            if (bufferSize > tempPos) {
                buffer.copyInto(buffer, 0, tempPos, bufferSize)
            }
            totalBytesRetired += tempPos
            bufferSize -= tempPos
            pos = 0
        }

        // Here we should refill the buffer as many bytes as possible.
        val bytesRead = input.read(
            buffer,
            bufferSize,
            // the size of allocated but unused bytes in the buffer
            (buffer.size - bufferSize).coerceAtMost(
                sizeLimit - totalBytesRetired - bufferSize // do not exceed the total bytes limit
            )
        )
        check(bytesRead == -1 || bytesRead in 1..buffer.size) {
            "${input.javaClass}#read(ByteArray) returned invalid result: $bytesRead\nThe InputStream implementation is buggy."
        }
        if (bytesRead > 0) {
            bufferSize += bytesRead
            recomputeBufferSizeAfterLimit()
            return if ((bufferSize >= n)) true else tryRefillBuffer(n)
        }
        return false
    }

    /**
     * Reads more bytes from the input, making at least `n` bytes available in the buffer.
     * Caller must ensure that the requested space is not yet available, and that the requested
     * space is less than BUFFER_SIZE.
     *
     * @throws InvalidProtocolBufferException The end of the stream or the current limit was
     * reached.
     */
    private fun refillBuffer(n: Int) {
        if (!tryRefillBuffer(n)) {
            // We have to distinguish the exception between sizeLimitExceeded and truncatedMessage. So
            // we just throw an sizeLimitExceeded exception here if it exceeds the sizeLimit
            if (n > sizeLimit - totalBytesRetired - pos) {
                throw InvalidProtocolBufferException.sizeLimitExceeded()
            } else {
                throw InvalidProtocolBufferException.truncatedMessage()
            }
        }
    }

    /**
     * Exactly like skipRawBytes, but caller must have already checked the fast path:
     * `(size <= (bufferSize - pos) && size >= 0)`
     */
    private fun skipRawBytesSlowPath(size: Int) {
        if (size < 0) {
            throw InvalidProtocolBufferException.negativeSize()
        }

        if (totalBytesRetired + pos + size > currentLimit) {
            // Read to the end of the stream anyway.
            skipRawBytes(currentLimit - totalBytesRetired - pos)
            // Then fail.
            throw InvalidProtocolBufferException.truncatedMessage()
        }

        // Skipping more bytes than are in the buffer.  First skip what we have.
        totalBytesRetired += pos
        var totalSkipped = bufferSize - pos
        bufferSize = 0
        pos = 0

        try {
            while (totalSkipped < size) {
                val toSkip = size - totalSkipped
                val skipped = input.skip(toSkip.toLong())
                // The API contract of skip() permits an inputstream to skip zero bytes for any reason
                // it wants. In particular, ByteArrayInputStream will just return zero over and over
                // when it's at the end of its input. In order to actually confirm that we've hit the
                // end of input, we need to issue a read call via the other path.
                check(skipped in 0..toSkip) {
                    "${input.javaClass}#skip returned invalid result: $skipped\nThe InputStream implementation is buggy."
                }
                if (skipped == 0L) {
                    // The API contract of skip() permits an inputstream to skip zero bytes for any reason
                    // it wants. In particular, ByteArrayInputStream will just return zero over and over
                    // when it's at the end of its input. In order to actually confirm that we've hit the
                    // end of input, we need to issue a read call via the other path.
                    break
                }
                totalSkipped += skipped.toInt()
            }
        } finally {
            totalBytesRetired += totalSkipped
            recomputeBufferSizeAfterLimit()
        }
        if (totalSkipped < size) {
            // Skipping more bytes than are in the buffer.  First skip what we have.
            var tempPos = bufferSize - pos
            pos = bufferSize

            // Keep refilling the buffer until we get to the point we wanted to skip to.
            // This has the side effect of ensuring the limits are updated correctly.
            refillBuffer(1)
            while (size - tempPos > bufferSize) {
                tempPos += bufferSize
                pos = bufferSize
                refillBuffer(1)
            }

            pos = size - tempPos
        }
    }
}
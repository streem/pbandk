/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

package pbandk.conformance.io

import kotlinx.io.RawSink
import kotlinx.io.UnsafeIoApi
import kotlinx.io.unsafe.UnsafeBufferOperations
import pbandk.conformance.NodeJsPlatform
import pbandk.conformance.getPlatform
import pbandk.conformance.nodejs.closeSync
import pbandk.conformance.nodejs.writeSync

/**
 * [StdIoSink] is an adaptation of `FileSink` from
 * https://github.com/Kotlin/kotlinx-io/blob/0.5.2/core/nodeFilesystemShared/src/files/PathsNodeJs.kt#L130
 * that supports stdout and stderr. The original FileSink class only worked with filesystem paths. This class can go
 * away once kotlinx-io provides built-in support for stdout/stderr.
 */
internal class StdIoSink(private val fd: Int) : RawSink {
    private val platform = getPlatform() as NodeJsPlatform
    private var closed = false

    @OptIn(UnsafeIoApi::class)
    override fun write(source: kotlinx.io.Buffer, byteCount: Long) {
        require(byteCount <= source.size) { "byteCount is greater than the available bytes to write" }
        check(!closed) { "Sink is closed." }
        if (byteCount == 0L) {
            return
        }

        var remainingBytes = byteCount
        while (remainingBytes > 0) {
            remainingBytes -= UnsafeBufferOperations.readFromHead(source) { bytes, start, end ->
                val buffer = platform.byteArrayToUint8Array(bytes).subarray(start, end)
                writeSync(fd, buffer, 0, buffer.byteLength, null)
            }
        }
    }

    override fun flush() = Unit

    override fun close() {
        if (!closed) {
            closed = true
            closeSync(fd)
        }
    }
}
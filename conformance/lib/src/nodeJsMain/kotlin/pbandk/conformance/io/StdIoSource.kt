/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

package pbandk.conformance.io

import kotlinx.io.DelicateIoApi
import kotlinx.io.RawSource
import kotlinx.io.UnsafeIoApi
import kotlinx.io.unsafe.UnsafeBufferOperations
import kotlinx.io.writeToInternalBuffer
import pbandk.conformance.NodeJsPlatform
import pbandk.conformance.getPlatform
import pbandk.conformance.nodejs.Buffer
import pbandk.conformance.nodejs.closeSync
import pbandk.conformance.nodejs.readSync

/**
 * [StdIoSource] is an adaptation of `FileSource` from
 * https://github.com/Kotlin/kotlinx-io/blob/0.5.2/core/nodeFilesystemShared/src/files/PathsNodeJs.kt#L78 that supports
 * stdin. The original FileSource class only worked with filesystem paths. This class can go away once kotlinx-io
 * provides built-in support for stdin.
 */
internal class StdIoSource(private val fd: Int) : RawSource {
    private val platform = getPlatform() as NodeJsPlatform
    private var closed = false

    @OptIn(DelicateIoApi::class, UnsafeIoApi::class)
    override fun readAtMostTo(sink: kotlinx.io.Buffer, byteCount: Long): Long {
        check(!closed) { "Source is closed." }
        if (byteCount == 0L) {
            return 0
        }
        val buffer = Buffer.allocUnsafe(byteCount.toInt())
        val bytesRead = readSync(fd, buffer, 0, byteCount.toInt(), null)
        if (bytesRead == 0) {
            return -1L
        }
        sink.writeToInternalBuffer {
            UnsafeBufferOperations.moveToTail(
                buffer = it,
                bytes = platform.uint8ArrayToByteArray(buffer),
                startIndex = 0,
                endIndex = bytesRead
            )
        }

        return bytesRead.toLong()
    }

    override fun close() {
        if (!closed) {
            closed = true
            closeSync(fd)
        }
    }
}
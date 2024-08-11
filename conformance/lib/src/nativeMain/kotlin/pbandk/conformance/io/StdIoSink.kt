/*
 * Copyright 2017-2023 JetBrains s.r.o. and respective authors and developers.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENCE file.
 */

package pbandk.conformance.io

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.usePinned
import kotlinx.io.Buffer
import kotlinx.io.IOException
import kotlinx.io.RawSink
import kotlinx.io.readByteArray
import platform.posix.FILE
import platform.posix.errno
import platform.posix.fclose
import platform.posix.fflush
import platform.posix.fwrite

/**
 * [StdIoSink] is an adaptation of `FileSink` from
 * https://github.com/Kotlin/kotlinx-io/blob/0.5.2/core/native/src/files/PathsNative.kt#L114 that supports
 * stdout/stderr. The original FileSink class only worked with filesystem paths. This class can go away once kotlinx-io
 * provides built-in support for stdout/stderr.
 */
@OptIn(ExperimentalForeignApi::class)
internal class StdIoSink(private val file: CPointer<FILE>) : RawSink {
    private var closed = false

    override fun write(source: Buffer, byteCount: Long) {
        require(byteCount >= 0L) { "byteCount: $byteCount" }
        require(source.size >= byteCount) { "source.size=${source.size} < byteCount=$byteCount" }
        check(!closed) { "closed" }

        val allContent = source.readByteArray(byteCount.toInt())
        // Copy bytes from that segment into the file.
        val bytesWritten = allContent.usePinned { pinned ->
            fwrite(pinned.addressOf(0), 1u, byteCount.toULong(), file).toLong()
        }
        if (bytesWritten < byteCount) {
            throw IOException(errno.toString())
        }
    }

    override fun flush() {
        if (fflush(file) != 0) {
            throw IOException(errno.toString())
        }
    }

    override fun close() {
        if (closed) return
        closed = true
        if (fclose(file) != 0) {
            throw IOException(errno.toString())
        }
    }
}
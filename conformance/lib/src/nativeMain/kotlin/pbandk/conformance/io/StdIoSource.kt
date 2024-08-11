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
import kotlinx.io.RawSource
import platform.posix.FILE
import platform.posix.errno
import platform.posix.fclose
import platform.posix.fileno
import platform.posix.read

/**
 * [StdIoSource] is an adaptation of `FileSource` from
 * https://github.com/Kotlin/kotlinx-io/blob/0.5.2/core/native/src/files/PathsNative.kt#L67 that supports
 * stdin. The original FileSource class only worked with filesystem paths. This class can go away once kotlinx-io
 * provides built-in support for stdin.
 */
@OptIn(ExperimentalForeignApi::class)
internal class StdIoSource(private val file: CPointer<FILE>) : RawSource {
    private var closed = false

    override fun readAtMostTo(sink: Buffer, byteCount: Long): Long {
        val temporaryBuffer = ByteArray(byteCount.toInt())

        // Copy bytes from the file to the segment.
        val fd = fileno(file)
        val bytesRead = temporaryBuffer.usePinned { pinned ->
            read(fd, pinned.addressOf(0), byteCount.toULong())
        }

        sink.write(temporaryBuffer, startIndex = 0, endIndex = bytesRead.toInt())

        return when {
            bytesRead == byteCount -> bytesRead
            bytesRead == 0L -> -1L
            bytesRead < 0 -> throw IOException(errno.toString())
            else -> bytesRead
        }
    }

    override fun close() {
        if (closed) return
        closed = true
        fclose(file)
    }
}
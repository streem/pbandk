package pbandk.conformance

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.io.buffered
import kotlinx.io.readByteArray
import kotlinx.io.readIntLe
import kotlinx.io.writeIntLe
import pbandk.Message
import pbandk.conformance.io.StdIoSink
import pbandk.conformance.io.StdIoSource
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray
import platform.posix.stderr as posixStderr
import platform.posix.stdin as posixStdin
import platform.posix.stdout as posixStdout

@OptIn(ExperimentalForeignApi::class)
private object NativePlatform : Platform {
    override val stdin = StdIoSource(posixStdin!!).buffered()
    override val stdout = StdIoSink(posixStdout!!).buffered()
    override val stderr = StdIoSink(posixStderr!!).buffered()

    override suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T? =
        withContext(Dispatchers.IO) {
            if (!stdin.request(4)) return@withContext null
            val size = stdin.readIntLe()
            debug { "Reading $size bytes" }
            companion.decodeFromByteArray(stdin.readByteArray(size))
        }

    override suspend fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T) {
        withContext(Dispatchers.IO) {
            message.encodeToByteArray().also { bytes ->
                stdout.writeIntLe(bytes.size)
                stdout.write(bytes)
                stdout.flush()
            }
        }
    }

    override fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        runBlocking(block = block)
    }
}

actual fun getPlatform(): Platform = NativePlatform
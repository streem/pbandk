package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.khronos.webgl.ArrayBufferView
import org.khronos.webgl.Uint8Array
import pbandk.Message
import pbandk.PbandkInternal
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray
import pbandk.internal.asByteArray
import pbandk.internal.asUint8Array
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

private external interface StdStream {
    val fd: Int

    fun once(event: String, callback: () -> Unit)

    // Readable streams only
    fun read(size: Int = definedExternally): Buffer?

    // Writeable streams only
    fun write(chunk: String, encoding: String = definedExternally): Boolean
    fun write(chunk: Uint8Array): Boolean
}

@JsModule("process")
@JsNonModule
private external class Process {
    companion object {
        val stdin: StdStream
        val stdout: StdStream
        val stderr: StdStream
    }
}

@JsModule("fs")
@JsNonModule
private external class Fs {
    companion object {
        fun writeSync(
            fd: Int,
            buffer: ArrayBufferView,
            offset: Int,
            length: Int,
            position: Int? = definedExternally
        ): Int
    }
}

private external class Buffer : Uint8Array {
    fun readInt32LE(offset: Int): Int
    fun writeInt32LE(value: Int, offset: Int): Int

    companion object {
        fun alloc(size: Int): Buffer
    }
}

@OptIn(PbandkInternal::class)
private object JsPlatform : Platform {
    override fun stderrPrintln(str: String) {
        Process.stderr.write("$str\n")
    }

    private fun stdinReadNow(size: Int): Buffer? {
        val buffer = Buffer.alloc(size)
        var total = 0
        while (total < size) {
            val chunk = Process.stdin.read(size - total) ?: return null
            buffer.set(chunk, total)
            total += chunk.length
        }
        return buffer
    }

    private suspend fun stdinReadBuffer(size: Int): Buffer? = suspendCoroutine { continuation ->
        val buffer = Buffer.alloc(size)
        stdinReadNow(size)?.also {
            buffer.set(it, 0)
            if (it.length == size) {
                continuation.resume(buffer)
                return@suspendCoroutine
            }
        }
        Process.stdin.once("readable") {
            continuation.resume(stdinReadNow(size))
        }
    }

    private suspend fun stdinReadIntLE() = stdinReadBuffer(4)?.readInt32LE(0)

    private suspend fun stdinReadFull(size: Int) =
        stdinReadBuffer(size)?.asByteArray() ?: error("Failed to read $size bytes from stdin")

    override suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T? {
        try {
            val size = stdinReadIntLE() ?: return null
            debug { "Reading $size bytes" }
            return companion.decodeFromByteArray(stdinReadFull(size))
        } catch (e: Throwable) {
            throw e
        } catch (e: dynamic) {
            throw RuntimeException("Unexpected error: $e")
        }
    }

    private fun stdoutWriteBuffer(buf: Uint8Array) {
        var total = 0
        while (total < buf.length) {
            total += Fs.writeSync(Process.stdout.fd, buf, total, buf.length - total)
        }
    }

    private fun stdoutWriteIntLE(v: Int) = stdoutWriteBuffer(Buffer.alloc(4).also { it.writeInt32LE(v, 0) })
    private fun stdoutWriteFull(arr: ByteArray) = stdoutWriteBuffer(arr.asUint8Array())

    override fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T) {
        message.encodeToByteArray().also { bytes ->
            stdoutWriteIntLE(bytes.size)
            stdoutWriteFull(bytes)
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    override fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        GlobalScope.launch(block = block)
    }
}

actual fun getPlatform(): Platform = JsPlatform
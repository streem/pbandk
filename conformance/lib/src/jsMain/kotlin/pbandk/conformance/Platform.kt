package pbandk.conformance

import org.khronos.webgl.ArrayBufferView
import org.khronos.webgl.Uint8Array
import pbandk.PbandkInternal
import pbandk.internal.asByteArray
import pbandk.internal.asUint8Array
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlinx.coroutines.*

internal external interface StdStream {
    val fd: Int

    fun once(event: String, callback: () -> Unit)

    // Readable streams only
    fun read(size: Int = definedExternally): Buffer?

    // Writeable streams only
    fun write(chunk: String, encoding: String = definedExternally): Boolean
    fun write(chunk: Uint8Array): Boolean
}

@JsModule("process")
internal external class Process {
    companion object {
        val stdin: StdStream
        val stdout: StdStream
        val stderr: StdStream
    }
}

@JsModule("fs")
external class Fs {
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

external class Buffer : Uint8Array {
    fun readInt32LE(offset: Int): Int
    fun writeInt32LE(value: Int, offset: Int): Int

    companion object {
        fun alloc(size: Int): Buffer
    }
}

@OptIn(PbandkInternal::class)
actual object Platform {
    actual fun stderrPrintln(str: String) {
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

    actual suspend fun stdinReadIntLE() = stdinReadBuffer(4)?.readInt32LE(0)

    actual suspend fun stdinReadFull(size: Int) =
        stdinReadBuffer(size)?.asByteArray() ?: error("Failed to read $size bytes from stdin")

    private fun stdoutWriteBuffer(buf: Uint8Array) {
        var total = 0
        while (total < buf.length) {
            total += Fs.writeSync(Process.stdout.fd, buf, total, buf.length - total)
        }
    }

    actual fun stdoutWriteIntLE(v: Int) = stdoutWriteBuffer(Buffer.alloc(4).also { it.writeInt32LE(v, 0) })
    actual fun stdoutWriteFull(arr: ByteArray) = stdoutWriteBuffer(arr.asUint8Array())

    actual inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T) =
        try {
            fn()
        } catch (e: Throwable) {
            errFn(e)
        } catch (e: dynamic) {
            errFn(e as Any)
        }

    actual fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        GlobalScope.launch(block = block)
    }
}

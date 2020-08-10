package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.nio.ByteBuffer
import java.nio.ByteOrder

actual object Platform {
    actual fun stderrPrintln(str: String) = System.err.println(str)

    val stdinBuf = System.`in`.buffered()

    actual suspend fun stdinReadIntLE() = withContext(Dispatchers.IO) {
        ByteArray(4).let {
            if (stdinBuf.read(it) != 4) null else ByteBuffer.wrap(it).order(ByteOrder.LITTLE_ENDIAN).int
        }
    }

    actual suspend fun stdinReadFull(size: Int) = withContext(Dispatchers.IO) {
        ByteArray(size).also { arr ->
            require(stdinBuf.read(arr) == arr.size) { "Unable to read full byte array" }
        }
    }

    actual fun stdoutWriteIntLE(v: Int) =
        System.out.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array())

    actual fun stdoutWriteFull(arr: ByteArray) = System.out.write(arr)

    actual inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T) = try {
        fn()
    } catch (e: Exception) {
        errFn(e)
    }

    actual fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        kotlinx.coroutines.runBlocking(block = block)
    }
}
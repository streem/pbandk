package pbandk.conformance

import java.nio.ByteBuffer
import java.nio.ByteOrder

actual object Platform {
    actual fun stderrPrintln(str: String) = System.err.println(str)

    val stdinBuf = System.`in`.buffered()

    actual fun stdinReadIntLE() = ByteArray(4).let {
        if (stdinBuf.read(it) != 4) null else ByteBuffer.wrap(it).order(ByteOrder.LITTLE_ENDIAN).int
    }

    actual fun stdinReadFull(arr: ByteArray) =
        require(stdinBuf.read(arr) == arr.size) { "Unable to read full byte array" }

    actual fun stdoutWriteIntLE(v: Int) =
        System.out.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array())

    actual fun stdoutWriteFull(arr: ByteArray) = System.out.write(arr)

    actual inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T) = try { fn() } catch (e: Exception) { errFn(e) }
}
package pbandk.conformance

import pbandk.asUint8Array

external fun require(module: String): dynamic
external class Buffer {
    fun readInt32LE(offset: Int): Int
    fun writeInt32LE(value: Int, offset: Int): Int
    companion object {
        fun alloc(size: Int): Buffer
    }
}

actual object Platform {
    val process = require("process")
    val fs = require("fs")

    actual fun stderrPrintln(str: String) { process.stderr.write("$str\n") }

    fun stdinReadBuffer(buf: dynamic): Boolean {
        var total = 0
        while (total < buf.length.unsafeCast<Int>()) {
            try {
                total += fs.readSync(process.stdin.fd, buf, total, buf.length - total).unsafeCast<Int>()
            } catch (e: dynamic) {
                if (e.code == "EOF") return false
                else if (e.code != "EAGAIN") error("Failed reading stdin: $e")
            }
        }
        return true
    }
    actual fun stdinReadIntLE() = Buffer.alloc(4).let { buf ->
        if (!stdinReadBuffer(buf)) null else buf.readInt32LE(0)
    }
    actual fun stdinReadFull(arr: ByteArray) = require(stdinReadBuffer(arr.asUint8Array()))

    fun stdoutWriteBuffer(buf: dynamic) {
        var total = 0
        while (total < buf.length.unsafeCast<Int>()) {
            total += fs.writeSync(process.stdout.fd, buf, total, buf.length - total).unsafeCast<Int>()
        }
    }
    actual fun stdoutWriteIntLE(v: Int) = stdoutWriteBuffer(Buffer.alloc(4).also { it.writeInt32LE(v, 0) })
    actual fun stdoutWriteFull(arr: ByteArray) = stdoutWriteBuffer(arr.asUint8Array())

    actual inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T) =
        try { fn() }
        catch (e: Throwable) {  errFn(e) }
        catch (e: dynamic) { errFn(e as Any) }
}
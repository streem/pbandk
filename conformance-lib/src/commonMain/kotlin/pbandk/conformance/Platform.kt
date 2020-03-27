package pbandk.conformance

expect object Platform {
    fun stderrPrintln(str: String)

    fun stdinReadIntLE(): Int?
    fun stdinReadFull(arr: ByteArray)

    fun stdoutWriteIntLE(v: Int)
    fun stdoutWriteFull(arr: ByteArray)

    inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T): T
}
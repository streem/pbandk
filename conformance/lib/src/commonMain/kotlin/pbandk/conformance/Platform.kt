package pbandk.conformance

expect object Platform {
    fun stderrPrintln(str: String)

    suspend fun stdinReadIntLE(): Int?
    suspend fun stdinReadFull(size: Int): ByteArray

    fun stdoutWriteIntLE(v: Int)
    fun stdoutWriteFull(arr: ByteArray)

    inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T): T
}
package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import pbandk.Message

expect object Platform {
    fun stderrPrintln(str: String)
    suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T?
    fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T)

    inline fun <T> doTry(fn: () -> T, errFn: (Any) -> T): T

    fun runBlockingMain(block: suspend CoroutineScope.() -> Unit)
}
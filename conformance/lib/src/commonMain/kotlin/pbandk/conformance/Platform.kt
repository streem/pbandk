package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import pbandk.Message

interface Platform {
    fun stderrPrintln(str: String)
    suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T?
    fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T)

    fun runBlockingMain(block: suspend CoroutineScope.() -> Unit)
}

expect fun getPlatform(): Platform
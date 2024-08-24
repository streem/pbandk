package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import kotlinx.io.Sink
import kotlinx.io.Source
import kotlinx.io.writeString
import pbandk.Message

interface Platform {
    val stdin: Source
    val stdout: Sink
    val stderr: Sink

    suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T?
    suspend fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T)

    fun runBlockingMain(block: suspend CoroutineScope.() -> Unit)
}

expect fun getPlatform(): Platform

fun Sink.println(string: String) {
    writeString(string)
    writeString("\n")
    flush()
}
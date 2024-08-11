package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.io.Sink
import kotlinx.io.Source
import kotlinx.io.buffered
import kotlinx.io.readByteArray
import kotlinx.io.readIntLe
import kotlinx.io.writeIntLe
import pbandk.Message
import pbandk.conformance.io.StdIoSink
import pbandk.conformance.io.StdIoSource
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.FILE
import kotlin.annotation.AnnotationTarget.FUNCTION
import kotlin.annotation.AnnotationTarget.PROPERTY

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
@Target(CLASS, PROPERTY, FUNCTION, FILE)
expect annotation class JsModule(@Suppress("unused") val import: String)

internal abstract class NodeJsPlatform : Platform {
    override val stdin: Source = StdIoSource(0).buffered()
    override val stdout: Sink = StdIoSink(1).buffered()
    override val stderr: Sink = StdIoSink(2).buffered()

    abstract fun byteArrayToUint8Array(array: ByteArray): Uint8Array

    abstract fun uint8ArrayToByteArray(array: Uint8Array): ByteArray

    abstract suspend fun <R> runHandlingJsExceptions(block: suspend () -> R): R

    override suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T? =
        runHandlingJsExceptions {
            if (!stdin.request(4)) return@runHandlingJsExceptions null
            val size = stdin.readIntLe()
            debug { "Reading $size bytes" }
            companion.decodeFromByteArray(stdin.readByteArray(size))
        }

    override suspend fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T) {
        runHandlingJsExceptions {
            message.encodeToByteArray().also { bytes ->
                stdout.writeIntLe(bytes.size)
                stdout.write(bytes)
                stdout.flush()
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    override fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        GlobalScope.launch(block = block)
    }
}
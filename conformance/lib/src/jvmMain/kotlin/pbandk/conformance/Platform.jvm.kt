package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.io.asInputStream
import kotlinx.io.asOutputStream
import kotlinx.io.asSink
import kotlinx.io.asSource
import kotlinx.io.buffered
import kotlinx.io.readByteArray
import kotlinx.io.readIntLe
import kotlinx.io.writeIntLe
import pbandk.Message
import pbandk.decodeFromByteArray
import pbandk.decodeFromByteBuffer
import pbandk.decodeFromStream
import pbandk.encodeToByteArray
import pbandk.encodeToStream
import java.nio.ByteBuffer

private object JvmPlatform : Platform {
    override val stdin = System.`in`.asSource().buffered()
    override val stdout = System.out.asSink().buffered()
    override val stderr = System.err.asSink().buffered()

    override suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T? =
        withContext(Dispatchers.IO) {
            if (!stdin.request(4)) return@withContext null
            val size = stdin.readIntLe()
            debug { "Reading $size bytes" }

            when (val ioImplementation = System.getenv("PBANDK_CONFORMANCE_JVM_IO")) {
                // Default to the ByteArray implementation, which matches the default on the other platforms
                null, "BYTE_ARRAY" -> companion.decodeFromByteArray(stdin.readByteArray(size))
                "BYTE_BUFFER" -> companion.decodeFromByteBuffer(ByteBuffer.wrap(stdin.readByteArray(size)))
                "STREAM" -> companion.decodeFromStream(stdin.asInputStream(), size)
                else -> throw IllegalArgumentException(
                    "Unknown value for PBANDK_CONFORMANCE_JVM_IO environment variable: $ioImplementation"
                )
            }
        }

    override suspend fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T) {
        withContext(Dispatchers.IO) {
            when (val ioImplementation = System.getenv("PBANDK_CONFORMANCE_JVM_IO")) {
                // Default to the ByteArray implementation, which matches the default on the other platforms
                // Use `encodeToByteArray()` even for "BYTE_BUFFER" because we don't have an `encodeToByteBuffer()` method yet
                null, "BYTE_ARRAY", "BYTE_BUFFER" -> {
                    message.encodeToByteArray().also { bytes ->
                        stdout.writeIntLe(bytes.size)
                        stdout.write(bytes)
                        stdout.flush()
                    }
                }

                "STREAM" -> {
                    val expectedSize = message.protoSize
                    stdout.writeIntLe(expectedSize)
                    val actualSize = message.encodeToStream(stdout.asOutputStream())
                    check(expectedSize == actualSize) {
                        "Message was supposed to serialize to $expectedSize bytes but only used $actualSize bytes"
                    }
                    stdout.flush()
                }

                else -> throw IllegalArgumentException(
                    "Unknown value for PBANDK_CONFORMANCE_JVM_IO environment variable: $ioImplementation"
                )
            }
        }
    }

    override fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        System.getenv("PBANDK_CONFORMANCE_JVM_IO")?.let {
            stderr.println("Using PBANDK_CONFORMANCE_JVM_IO=$it")
        }
        kotlinx.coroutines.runBlocking(block = block)
    }
}

actual fun getPlatform(): Platform = JvmPlatform
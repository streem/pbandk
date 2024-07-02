package pbandk.conformance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import pbandk.Message
import pbandk.decodeFromByteArray
import pbandk.decodeFromByteBuffer
import pbandk.decodeFromStream
import pbandk.encodeToByteArray
import pbandk.encodeToStream
import java.nio.ByteBuffer
import java.nio.ByteOrder

private object JvmPlatform : Platform {
    override fun stderrPrintln(str: String) = System.err.println(str)

    private val stdinBuf = System.`in`.buffered()

    private suspend fun stdinReadIntLE() = withContext(Dispatchers.IO) {
        ByteArray(4).let {
            if (stdinBuf.read(it) != 4) null else ByteBuffer.wrap(it).order(ByteOrder.LITTLE_ENDIAN).int
        }
    }

    private suspend fun stdinReadFull(size: Int) = withContext(Dispatchers.IO) {
        ByteArray(size).also { arr ->
            require(stdinBuf.read(arr) == arr.size) { "Unable to read full byte array" }
        }
    }

    override suspend fun <T : Message> stdinReadLengthDelimitedMessage(companion: Message.Companion<T>): T? =
        withContext(Dispatchers.IO) {
            val size = stdinReadIntLE() ?: return@withContext null
            debug { "Reading $size bytes" }

            when (val ioImplementation = System.getenv("PBANDK_CONFORMANCE_JVM_IO")) {
                // Default to the ByteArray implementation, which matches the default on the other platforms
                null, "BYTE_ARRAY" -> companion.decodeFromByteArray(stdinReadFull(size))
                "BYTE_BUFFER" -> companion.decodeFromByteBuffer(ByteBuffer.wrap(stdinReadFull(size)))
                "STREAM" -> companion.decodeFromStream(stdinBuf, size)
                else -> throw IllegalArgumentException(
                    "Unknown value for PBANDK_CONFORMANCE_JVM_IO environment variable: $ioImplementation"
                )
            }
        }

    private fun stdoutWriteIntLE(v: Int) =
        System.out.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array())

    private fun stdoutWriteFull(arr: ByteArray) = System.out.write(arr)

    override fun <T : Message> stdoutWriteLengthDelimitedMessage(message: T) {
        when (val ioImplementation = System.getenv("PBANDK_CONFORMANCE_JVM_IO")) {
            // Default to the ByteArray implementation, which matches the default on the other platforms
            // Use `encodeToByteArray()` even for "BYTE_BUFFER" because we don't have an `encodeToByteBuffer()` method yet
            null, "BYTE_ARRAY", "BYTE_BUFFER" -> {
                message.encodeToByteArray().also { bytes ->
                    stdoutWriteIntLE(bytes.size)
                    stdoutWriteFull(bytes)
                }
            }
            "STREAM" -> {
                val expectedSize = message.protoSize
                stdoutWriteIntLE(expectedSize)
                val actualSize = message.encodeToStream(System.out)
                check(expectedSize == actualSize) {
                    "Message was supposed to serialize to $expectedSize bytes but only used $actualSize bytes"
                }
            }
            else -> throw IllegalArgumentException(
                "Unknown value for PBANDK_CONFORMANCE_JVM_IO environment variable: $ioImplementation"
            )
        }
    }

    override fun runBlockingMain(block: suspend CoroutineScope.() -> Unit) {
        System.getenv("PBANDK_CONFORMANCE_JVM_IO")?.let {
            stderrPrintln("Using PBANDK_CONFORMANCE_JVM_IO=$it")
        }
        kotlinx.coroutines.runBlocking(block = block)
    }
}

actual fun getPlatform(): Platform = JvmPlatform
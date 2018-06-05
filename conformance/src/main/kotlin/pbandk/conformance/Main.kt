package pbandk.conformance

import pbandk.ByteArr
import pbandk.conformance.pb.*
import java.io.BufferedInputStream
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder

var logDebug = true
inline fun debug(fn: () -> String) { if (logDebug) System.err.println(fn()) }

fun main(args: Array<String>) {
    while (true) {
        val res = doTestIo(System.`in`.buffered()).also { debug { "Result: $it" } } ?: return
        ConformanceResponse(res).protoMarshal().also { bytes ->
            System.out.writeIntLE(bytes.size)
            System.out.write(bytes)
        }
    }
}

fun doTestIo(stdin: BufferedInputStream): ConformanceResponse.Result? {
    // Read the request (starting with by size)
    val req = try {
        val size = stdin.readIntLE()?.also { debug { "Reading $it bytes" } } ?: return null
        ConformanceRequest.protoUnmarshal(ByteArray(size).also(stdin::readFull)).also { debug { "Request: $it" } }
    } catch (e: Exception) { return ConformanceResponse.Result.RuntimeError("Failed reading request: ${e.message}") }
    // Parse
    val parsed = try {
        if (req.payload !is ConformanceRequest.Payload.ProtobufPayload)
            return ConformanceResponse.Result.Skipped("Only protobuf input supported")
        if (req.requestedOutputFormat != WireFormat.PROTOBUF)
            return ConformanceResponse.Result.Skipped("Only protobuf output supported")
        val typeComp = when (req.messageType) {
            "protobuf_test_messages.proto2.TestAllTypesProto2" -> TestAllTypesProto2.Companion
            "protobuf_test_messages.proto3.TestAllTypesProto3" -> TestAllTypesProto3.Companion
            else -> return ConformanceResponse.Result.RuntimeError("Unrecognized message type ${req.messageType}")
        }
        typeComp.protoUnmarshal(req.payload.protobufPayload.array).also { debug { "Parsed: $it" } }
    } catch (e: Exception) { return ConformanceResponse.Result.ParseError("Parse error: ${e.message}") }
    // Serialize
    return try {
        ConformanceResponse.Result.ProtobufPayload(ByteArr(parsed.protoMarshal()))
    } catch (e: Exception) {
        ConformanceResponse.Result.SerializeError("Serialize error: ${e.message}")
    }
}

fun InputStream.readIntLE() =
    ByteArray(4).let { if (read(it) != 4) null else ByteBuffer.wrap(it).order(ByteOrder.LITTLE_ENDIAN).int }
fun OutputStream.writeIntLE(v: Int) =
    write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array())

fun BufferedInputStream.readFull(arr: ByteArray) =
    require(read(arr) == arr.size) { "Unable to read full byte array" }
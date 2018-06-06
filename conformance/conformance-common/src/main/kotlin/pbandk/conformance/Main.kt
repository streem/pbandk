package pbandk.conformance

import pbandk.ByteArr
import pbandk.conformance.pb.*

var logDebug = true
inline fun debug(fn: () -> String) { if (logDebug) Platform.stderrPrintln(fn()) }

fun main(args: Array<String>) {
    while (true) {
        val res = doTestIo().also { debug { "Result: $it" } } ?: return
        ConformanceResponse(res).protoMarshal().also { bytes ->
            Platform.stdoutWriteIntLE(bytes.size)
            Platform.stdoutWriteFull(bytes)
        }
    }
}

fun doTestIo(): ConformanceResponse.Result? {
    // Read the request (starting with by size)
    val req = try {
        val size = Platform.stdinReadIntLE()?.also { debug { "Reading $it bytes" } } ?: return null
        ConformanceRequest.protoUnmarshal(
            ByteArray(size).also(Platform::stdinReadFull)).also { debug { "Request: $it" } }
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
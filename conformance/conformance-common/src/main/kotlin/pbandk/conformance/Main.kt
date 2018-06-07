package pbandk.conformance

import pbandk.ByteArr
import pbandk.Marshaller
import pbandk.Unmarshaller
import pbandk.conformance.pb.*

var logDebug = true
inline fun debug(fn: () -> String) { if (logDebug) Platform.stderrPrintln(fn()) }

fun main(args: Array<String>) {
    debug { "Starting conformance test" }
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
    val req = Platform.doTry({
        val size = Platform.stdinReadIntLE()?.also { debug { "Reading $it bytes" } } ?: return null
        ConformanceRequest.protoUnmarshal(
            ByteArray(size).also(Platform::stdinReadFull)).also { debug { "Request: $it" } }
    }) { err -> return ConformanceResponse.Result.RuntimeError("Failed reading request: $err") }
    // Parse
    val parsed = Platform.doTry({
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
    }) { err -> return ConformanceResponse.Result.ParseError("Parse error: $err") }
    // Serialize
    return Platform.doTry({
        ConformanceResponse.Result.ProtobufPayload(ByteArr(parsed.protoMarshal()))
    }) { err -> ConformanceResponse.Result.SerializeError("Serialize error: $err") }
}
package pbandk.conformance

import pbandk.ByteArr
import pbandk.conformance.pb.*

var logDebug = false
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

fun doTestIo(): ConformanceResponse.Result<*>? {
    // Read the request (starting with by size)
    val req = Platform.doTry({
        val size = Platform.stdinReadIntLE()?.also { debug { "Reading $it bytes" } } ?: return null
        ConformanceRequest.protoUnmarshal(
            ByteArray(size).also(Platform::stdinReadFull)).also { debug { "Request: $it" } }
    }) { err -> return ConformanceResponse.Result.RuntimeError("Failed reading request: $err") }
    // Parse
    val parsed = Platform.doTry({
        if (req.requestedOutputFormat != WireFormat.PROTOBUF)
            return ConformanceResponse.Result.Skipped("Only protobuf output supported")

        val typeComp = when (req.messageType) {
            "protobuf_test_messages.proto2.TestAllTypesProto2" -> TestAllTypesProto2.Companion
            "protobuf_test_messages.proto3.TestAllTypesProto3" -> TestAllTypesProto3.Companion
            else -> return ConformanceResponse.Result.RuntimeError("Unrecognized message type ${req.messageType}")
        }

        when (req.payload) {
            is ConformanceRequest.Payload.ProtobufPayload -> {
                typeComp.protoUnmarshal(req.payload.value.array).also { debug { "Parsed: $it" } }
            }
            is ConformanceRequest.Payload.JsonPayload -> {
                typeComp.jsonUnmarshal(req.payload.value).also { debug { "Parsed: $it" } }
            }
            else -> {
                return ConformanceResponse.Result.Skipped("Only protobuf and json input supported")
            }
        }


    }) { err -> return ConformanceResponse.Result.ParseError("Parse error: $err") }

    // Serialize
    return Platform.doTry({
        when (req.requestedOutputFormat) {
            is WireFormat.PROTOBUF -> ConformanceResponse.Result.ProtobufPayload(ByteArr(parsed.protoMarshal()))
            is WireFormat.JSON -> ConformanceResponse.Result.JsonPayload(parsed.jsonMarshal())
            else -> {
                return ConformanceResponse.Result.Skipped("Only protobuf and json output supported")
            }
        }
    }) { err -> ConformanceResponse.Result.SerializeError("Serialize error: $err") }
}

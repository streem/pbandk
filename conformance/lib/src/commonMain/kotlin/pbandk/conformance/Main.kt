package pbandk.conformance

import pbandk.ByteArr
import pbandk.ExperimentalProtoJson
import pbandk.conformance.Platform.runBlockingMain
import pbandk.conformance.pb.*
import pbandk.json.JsonConfig
import pbandk.json.encodeToJsonString
import pbandk.json.decodeFromJsonString
import pbandk.encodeToByteArray
import pbandk.decodeFromByteArray

var logDebug = false

inline fun debug(fn: () -> String) {
    if (logDebug) Platform.stderrPrintln(fn())
}

fun main(args: Array<String>) = runBlockingMain {
    debug { "Starting conformance test" }
    while (true) {
        val res = doTestIo().also { debug { "Result: $it" } } ?: return@runBlockingMain

        ConformanceResponse(res).encodeToByteArray().also { bytes ->
            Platform.stdoutWriteIntLE(bytes.size)
            Platform.stdoutWriteFull(bytes)
        }
    }
}

@OptIn(ExperimentalProtoJson::class)
suspend fun doTestIo(): ConformanceResponse.Result<*>? {
    // Read the request (starting with by size)
    val req = Platform.doTry({
        val size = Platform.stdinReadIntLE()?.also { debug { "Reading $it bytes" } } ?: return null
        ConformanceRequest.decodeFromByteArray(Platform.stdinReadFull(size)).also { debug { "Request: $it" } }
    }) { err -> return ConformanceResponse.Result.RuntimeError("Failed reading request: $err") }
    // Parse
    val parsed = Platform.doTry({
        val typeComp = when (req.messageType) {
            "protobuf_test_messages.proto2.TestAllTypesProto2" -> TestAllTypesProto2.Companion
            "protobuf_test_messages.proto3.TestAllTypesProto3" -> TestAllTypesProto3.Companion
            else -> return ConformanceResponse.Result.RuntimeError("Unrecognized message type ${req.messageType}")
        }

        when (req.payload) {
            is ConformanceRequest.Payload.ProtobufPayload -> {
                typeComp.decodeFromByteArray(req.payload.value.array).also { debug { "Parsed: $it" } }
            }
            is ConformanceRequest.Payload.JsonPayload -> {
                val jsonConfig = when (req.testCategory) {
                    TestCategory.JSON_IGNORE_UNKNOWN_PARSING_TEST -> JsonConfig.DEFAULT.copy(
                        ignoreUnknownFieldsInInput = true
                    )
                    else -> JsonConfig.DEFAULT
                }
                typeComp.decodeFromJsonString(req.payload.value, jsonConfig).also { debug { "Parsed: $it" } }
            }
            else -> {
                return ConformanceResponse.Result.Skipped("Only protobuf and json input supported")
            }
        }


    }) { err -> return ConformanceResponse.Result.ParseError("Parse error: $err") }

    // Serialize
    return Platform.doTry({
        when (req.requestedOutputFormat) {
            is WireFormat.PROTOBUF -> ConformanceResponse.Result.ProtobufPayload(ByteArr(parsed.encodeToByteArray()))
            is WireFormat.JSON -> ConformanceResponse.Result.JsonPayload(parsed.encodeToJsonString())
            else -> {
                return ConformanceResponse.Result.Skipped("Only protobuf and json output supported")
            }
        }
    }) { err -> ConformanceResponse.Result.SerializeError("Serialize error: $err") }
}

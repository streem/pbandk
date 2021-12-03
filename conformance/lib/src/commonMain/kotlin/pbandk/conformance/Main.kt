package pbandk.conformance

import pbandk.ByteArr
import pbandk.ExperimentalProtoJson
import pbandk.add
import pbandk.conformance.Platform.runBlockingMain
import pbandk.conformance.pb.ConformanceRequest
import pbandk.conformance.pb.ConformanceResponse
import pbandk.conformance.pb.TestAllTypesProto2
import pbandk.conformance.pb.TestAllTypesProto3
import pbandk.conformance.pb.TestCategory
import pbandk.conformance.pb.WireFormat
import pbandk.conformance.pb.conformanceResponse
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray
import pbandk.json.JsonConfig
import pbandk.json.decodeFromJsonString
import pbandk.json.encodeToJsonString
import pbandk.typeRegistry
import kotlin.js.JsExport

var logDebug = false

inline fun debug(fn: () -> String) {
    if (logDebug) Platform.stderrPrintln(fn())
}

@JsExport
fun main() = runBlockingMain {
    debug { "Starting conformance test" }
    while (true) {
        val res = doTestIo().also { debug { "Result: $it" } } ?: return@runBlockingMain
        Platform.stdoutWriteLengthDelimitedMessage(
            conformanceResponse {
                result = res
            }
        )
    }
}

@OptIn(ExperimentalProtoJson::class)
suspend fun doTestIo(): ConformanceResponse.Result<*>? {
    // Read the request (starting with by size)
    val req = Platform.doTry({ Platform.stdinReadLengthDelimitedMessage(ConformanceRequest.Companion) }) { err ->
        return ConformanceResponse.Result.RuntimeError("Failed reading request: $err")
    } ?: return null
    debug { "Request: $req" }

    val typeComp = when (req.messageType) {
        "protobuf_test_messages.proto2.TestAllTypesProto2" -> TestAllTypesProto2.Companion
        "protobuf_test_messages.proto3.TestAllTypesProto3" -> TestAllTypesProto3.Companion
        else -> return ConformanceResponse.Result.RuntimeError("Unrecognized message type ${req.messageType}")
    }
    var jsonConfig = JsonConfig.DEFAULT.copy(
        typeRegistry = typeRegistry {
            add(typeComp)
        }
    )
    if (req.testCategory == TestCategory.JSON_IGNORE_UNKNOWN_PARSING_TEST) {
        jsonConfig = jsonConfig.copy(ignoreUnknownFieldsInInput = true)
    }

    // Parse
    val parsed = Platform.doTry({
        when (val payload = req.payload) {
            is ConformanceRequest.Payload.ProtobufPayload -> {
                typeComp.decodeFromByteArray(payload.value.array).also { debug { "Parsed: $it" } }
            }
            is ConformanceRequest.Payload.JsonPayload -> {
                typeComp.decodeFromJsonString(payload.value, jsonConfig).also { debug { "Parsed: $it" } }
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
            is WireFormat.JSON -> ConformanceResponse.Result.JsonPayload(parsed.encodeToJsonString(jsonConfig))
            else -> {
                return ConformanceResponse.Result.Skipped("Only protobuf and json output supported")
            }
        }
    }) { err -> ConformanceResponse.Result.SerializeError("Serialize error: $err") }
}

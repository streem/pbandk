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
        val res = doTestIo()
        debug { "Result: $res" }
        if (res == null) return@runBlockingMain
        Platform.stdoutWriteLengthDelimitedMessage(res)
    }
}

suspend fun doTestIo(): ConformanceResponse? {
    // Read the request (starting with by size)
    val req = Platform.doTry({
        Platform.stdinReadLengthDelimitedMessage(ConformanceRequest.Companion)
    }) { err ->
        return ConformanceResponse {
            runtimeError = "Failed reading request: $err"
        }
    } ?: return null
    debug { "Request: $req" }

    return handleConformanceRequest(req)
}

@OptIn(ExperimentalProtoJson::class)
internal fun handleConformanceRequest(req: ConformanceRequest): ConformanceResponse {
    val typeComp = when (req.messageType) {
        "protobuf_test_messages.proto2.TestAllTypesProto2" -> TestAllTypesProto2
        "protobuf_test_messages.proto3.TestAllTypesProto3" -> TestAllTypesProto3
        else -> return ConformanceResponse {
            runtimeError = "Unrecognized message type ${req.messageType}"
        }
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
            is ConformanceRequest.Payload.ProtobufPayload ->
                typeComp.decodeFromByteArray(payload.value.array).also { debug { "Parsed: $it" } }

            is ConformanceRequest.Payload.JsonPayload ->
                typeComp.decodeFromJsonString(payload.value, jsonConfig).also { debug { "Parsed: $it" } }

            else -> return ConformanceResponse {
                skipped = "Only protobuf and json input supported"
            }
        }
    }) { err ->
        return ConformanceResponse {
            parseError = "Parse error: $err"
        }
    }

    // Serialize
    return Platform.doTry({
        ConformanceResponse {
            when (req.requestedOutputFormat) {
                is WireFormat.PROTOBUF -> protobufPayload = ByteArr(parsed.encodeToByteArray())
                is WireFormat.JSON -> jsonPayload = parsed.encodeToJsonString(jsonConfig)
                else -> skipped = "Only protobuf and json output supported"
            }
        }
    }) { err ->
        return ConformanceResponse {
            serializeError = "Serialize error: $err"
        }
    }
}

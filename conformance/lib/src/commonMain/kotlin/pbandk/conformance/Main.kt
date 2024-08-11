package pbandk.conformance

import pbandk.ByteArr
import pbandk.ExperimentalProtoJson
import pbandk.add
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

val platform = getPlatform()

inline fun debug(fn: () -> String) {
    if (logDebug) platform.stderr.println(fn())
}

@JsExport
fun main() = platform.runBlockingMain {
    debug { "Starting conformance test" }
    while (true) {
        val res = doTestIo().also { debug { "Result: $it" } } ?: return@runBlockingMain
        try {
            platform.stdoutWriteLengthDelimitedMessage(ConformanceResponse(res))
        } catch (e: Throwable) {
            platform.stdoutWriteLengthDelimitedMessage(
                ConformanceResponse(ConformanceResponse.Result.RuntimeError("Failed to write response: $e"))
            )
        }
    }
}

@OptIn(ExperimentalProtoJson::class)
suspend fun doTestIo(): ConformanceResponse.Result<*>? {
    // Read the request (starting with by size)
    val req = try {
        platform.stdinReadLengthDelimitedMessage(ConformanceRequest.Companion) ?: return null
    } catch (e: Throwable) {
        return ConformanceResponse.Result.RuntimeError("Failed reading request: $e")
    }
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
    val parsed = try {
        when (req.payload) {
            is ConformanceRequest.Payload.ProtobufPayload -> {
                typeComp.decodeFromByteArray(req.payload.value.array).also { debug { "Parsed: $it" } }
            }
            is ConformanceRequest.Payload.JsonPayload -> {
                typeComp.decodeFromJsonString(req.payload.value, jsonConfig).also { debug { "Parsed: $it" } }
            }
            else -> {
                return ConformanceResponse.Result.Skipped("Only protobuf and json input supported")
            }
        }
    } catch (e: Throwable) {
        return ConformanceResponse.Result.ParseError("Parse error: $e")
    }

    // Serialize
    return try {
        when (req.requestedOutputFormat) {
            is WireFormat.PROTOBUF -> ConformanceResponse.Result.ProtobufPayload(ByteArr(parsed.encodeToByteArray()))
            is WireFormat.JSON -> ConformanceResponse.Result.JsonPayload(parsed.encodeToJsonString(jsonConfig))
            else -> ConformanceResponse.Result.Skipped("Only protobuf and json output supported")
        }
    } catch (e: Throwable) {
        ConformanceResponse.Result.SerializeError("Serialize error: $e")
    }
}
package pbandk.json

import pbandk.ExperimentalProtoJson
import pbandk.Message
import pbandk.internal.json.JsonMessageEncoder
import pbandk.internal.json.JsonMessageDecoder

/**
 * Encode this message to a String using the protocol buffer JSON encoding.
 */
@ExperimentalProtoJson
fun <T : Message> T.encodeToJsonString(jsonConfig: JsonConfig = JsonConfig.DEFAULT): String =
    JsonMessageEncoder(jsonConfig).also { it.writeMessage(this) }.toJsonString()

/**
 * Decode a JSON protocol buffer message from [data].
 */
@ExperimentalProtoJson
fun <T : Message> Message.Companion<T>.decodeFromJsonString(
    data: String,
    jsonConfig: JsonConfig = JsonConfig.DEFAULT
): T = decodeWith(JsonMessageDecoder.fromString(data, jsonConfig))
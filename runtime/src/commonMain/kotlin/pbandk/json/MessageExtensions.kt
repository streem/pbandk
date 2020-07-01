package pbandk.json

import pbandk.ExperimentalProtoJson
import pbandk.Message
import pbandk.internal.json.JsonMessageMarshaller
import pbandk.internal.json.JsonMessageUnmarshaller

@ExperimentalProtoJson
fun <T: Message> T.jsonMarshal(jsonConfig: JsonConfig = JsonConfig.DEFAULT) =
    JsonMessageMarshaller(jsonConfig).also{ it.writeMessage(this) }.toJsonString()

@ExperimentalProtoJson
fun <T : Message> Message.Companion<T>.jsonUnmarshal(data: String, jsonConfig: JsonConfig = JsonConfig.DEFAULT): T =
    unmarshal(JsonMessageUnmarshaller.fromString(data, jsonConfig))
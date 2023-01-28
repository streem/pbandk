package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import pbandk.Message
import pbandk.MessageEncoder
import pbandk.gen.messageDescriptor
import pbandk.json.JsonConfig
import pbandk.json.JsonFieldValueEncoder

internal class JsonMessageEncoder(private val jsonConfig: JsonConfig) : MessageEncoder {
    private val json = Json {
        prettyPrint = !jsonConfig.compactOutput
    }
    private val jsonFieldValueEncoder = JsonFieldValueEncoder(jsonConfig)

    fun toJsonString(): String = json.encodeToString(JsonElement.serializer(), jsonFieldValueEncoder.getResult())

    override fun <M : Message> writeMessage(message: M) {
//        check(currentMessage == null) { "JsonMessageEncoder can't be reused with multiple messages" }
        message.messageDescriptor.messageValueType.encodeToJson(message, jsonFieldValueEncoder)
    }
}


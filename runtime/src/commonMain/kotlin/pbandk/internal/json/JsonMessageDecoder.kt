package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.MessageDecoder
import pbandk.json.JsonConfig
import pbandk.json.JsonFieldValueDecoder

internal class JsonMessageDecoder internal constructor(
    private val content: JsonElement,
    private val jsonConfig: JsonConfig
) : MessageDecoder {
    override fun <M : Message> readMessage(messageCompanion: Message.Companion<M>): M = try {
        messageCompanion.descriptor.messageValueType.decodeFromJson(JsonFieldValueDecoder.fromJsonElement(jsonConfig, content))
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    companion object {
        fun fromString(data: String, jsonConfig: JsonConfig = JsonConfig.DEFAULT): JsonMessageDecoder {
            val content = Json.decodeFromString(JsonElement.serializer(), data)
            return JsonMessageDecoder(content, jsonConfig)
        }
    }
}

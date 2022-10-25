package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageEncoder
import pbandk.json.JsonConfig
import kotlin.collections.MutableMap
import kotlin.collections.linkedMapOf
import kotlin.collections.set
import kotlin.reflect.KProperty1

internal class JsonMessageEncoder(private val jsonConfig: JsonConfig) : MessageEncoder {
    private val json = Json {
        prettyPrint = !jsonConfig.compactOutput
    }
    private val jsonValueEncoder = JsonValueEncoder(jsonConfig)
    private var currentMessage: JsonElement? = null

    fun toJsonString(): String = currentMessage?.let { json.encodeToString(JsonElement.serializer(), it) }.orEmpty()

    internal fun toJsonElement(): JsonElement =
        currentMessage ?: error("Must call writeMessage() before toJsonElement()")

    override fun <T : Message> writeMessage(message: T) {
        check(currentMessage == null) { "JsonMessageEncoder can't be reused with multiple messages" }
        currentMessage =
            JsonMessageAdapters.getAdapter(message)?.encode(message, jsonValueEncoder) ?: writeMessageObject(message)
    }

    private fun <T : Message> writeMessageObject(message: T): JsonObject {
        val jsonContent: MutableMap<String, JsonElement> = linkedMapOf()

        for (fd in message.descriptor.fields) {
            @Suppress("UNCHECKED_CAST")
            val value = (fd.value as KProperty1<T, *>).get(message)

            if (value == null && fd.type.hasPresence) continue
            if (!fd.type.hasPresence && !jsonConfig.outputDefaultValues && fd.type.isDefaultValue(value)) continue

            val jsonValue = value
                ?.takeUnless {
                    @Suppress("DEPRECATION")
                    jsonConfig.outputDefaultValues &&
                            jsonConfig.outputDefaultStringsAsNull &&
                            fd.type is FieldDescriptor.Type.Primitive.String &&
                            fd.type.isDefaultValue(it)
                }
                ?.let { jsonValueEncoder.writeValue(it, fd.type) }
                ?: JsonNull
            jsonContent[jsonConfig.getFieldJsonName(fd)] = jsonValue
        }

        return JsonObject(jsonContent)
    }

}


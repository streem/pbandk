package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageEncoder
import pbandk.internal.forEach
import pbandk.internal.fieldIterator
import pbandk.json.JsonConfig
import kotlin.collections.MutableMap
import kotlin.collections.linkedMapOf
import kotlin.collections.set

internal class JsonMessageEncoder(private val jsonConfig: JsonConfig) : MessageEncoder {
    private val json = Json {
        prettyPrint = !jsonConfig.compactOutput
    }
    private val jsonValueEncoder = JsonValueEncoder(jsonConfig)
    private var currentMessage: JsonElement? = null

    fun toJsonString(): String = currentMessage?.let { json.encodeToString(JsonElement.serializer(), it) }.orEmpty()

    internal fun toJsonElement(): JsonElement =
        currentMessage ?: error("Must call writeMessage() before toJsonElement()")

    override fun <M : Message> writeMessage(message: M) {
        check(currentMessage == null) { "JsonMessageEncoder can't be reused with multiple messages" }
        currentMessage =
            JsonMessageAdapters.getAdapter(message)?.encode(message, jsonValueEncoder) ?: writeMessageObject(message)
    }

    private fun <M : Message> writeMessageObject(message: M): JsonObject {
        val jsonContent: MutableMap<String, JsonElement> = linkedMapOf()

        message.fieldIterator().forEach { fd, value ->
            if (value == null && fd.oneofMember) return@forEach
            if (!fd.oneofMember && !jsonConfig.outputDefaultValues && fd.type.isDefaultValue(value)) return@forEach

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

    private fun <M : Message> writeFieldValue(fd: FieldDescriptor<M, *>, value: Any?): JsonElement? {
        if (value == null && fd.oneofMember) return null
        if (!fd.oneofMember && !jsonConfig.outputDefaultValues && fd.type.isDefaultValue(value)) return null

        return value
            ?.takeUnless {
                @Suppress("DEPRECATION")
                jsonConfig.outputDefaultValues &&
                        jsonConfig.outputDefaultStringsAsNull &&
                        fd.type is FieldDescriptor.Type.Primitive.String &&
                        fd.type.isDefaultValue(it)
            }
            ?.let { jsonValueEncoder.writeValue(it, fd.type) }
            ?: JsonNull
    }
}


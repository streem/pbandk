package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageEncoder
import pbandk.gen.GeneratedExtendableMessage
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

        for (fd in message.descriptor.fields) {
            @Suppress("UNCHECKED_CAST")
            writeFieldValue(message, fd as FieldDescriptor<M, *>)?.let {
                jsonContent[jsonConfig.getFieldJsonName(fd)] = it
            }
        }

        if (message is GeneratedExtendableMessage<*>) {
            for (fd in message.extensionFields.keys()) {
                @Suppress("UNCHECKED_CAST")
                writeFieldValue(message, fd as FieldDescriptor<M, *>)?.let {
                    // TODO: the JSON key has to include the full path of the field, not just the field's name
                    jsonContent["[${jsonConfig.getFieldJsonName(fd)}]"] = it
                }
            }
        }

        return JsonObject(jsonContent)
    }

    private fun <M : Message> writeFieldValue(message: M, fd: FieldDescriptor<M, *>): JsonElement? {
        val value = fd.getValue(message)

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


package pbandk.internal.json

import kotlinx.serialization.json.*
import pbandk.*
import pbandk.internal.Util
import pbandk.json.JsonConfig
import pbandk.wkt.*
import kotlin.Any
import kotlin.reflect.KProperty1

internal class JsonMessageMarshaller(private val jsonConfig: JsonConfig) : MessageMarshaller {
    private val json = Json(
        JsonConfiguration.Stable.copy(
            prettyPrint = true
        )
    )
    private val jsonValueMarshaller = JsonValueMarshaller(jsonConfig)
    private var currentMessage: JsonElement? = null

    fun toJsonString(): String = currentMessage?.let { json.stringify(JsonElementSerializer, it) }.orEmpty()

    internal fun toJsonElement(): JsonElement =
        currentMessage ?: error("Must call writeMessage() before toJsonElement()")

    override fun <T : Message> writeMessage(message: T) {
        check(currentMessage == null) { "JsonWireMarshaller can't be reused with multiple messages" }
        currentMessage = when (message) {
            // Wrapper types use the same JSON representation as the wrapped value
            // https://developers.google.com/protocol-buffers/docs/proto3#json
            is DoubleValue -> writeWrapperValue(message, message.value)
            is FloatValue -> writeWrapperValue(message, message.value)
            is Int64Value -> writeWrapperValue(message, message.value)
            is UInt64Value -> writeWrapperValue(message, message.value)
            is Int32Value -> writeWrapperValue(message, message.value)
            is UInt32Value -> writeWrapperValue(message, message.value)
            is BoolValue -> writeWrapperValue(message, message.value)
            is StringValue -> writeWrapperValue(message, message.value)
            is BytesValue -> writeWrapperValue(message, message.value)
            // Other well-known types with special JSON encoding
            is Timestamp -> jsonValueMarshaller.writeString(Util.timestampToString(message))
            // All other message types
            else -> writeMessageObject(message)
        }
    }

    private fun writeWrapperValue(message: Message, value: Any) =
        jsonValueMarshaller.writeValue(value, message.fieldDescriptors[0].type)

    private fun <T : Message> writeMessageObject(message: T): JsonObject {
        val jsonContent: MutableMap<String, JsonElement> = linkedMapOf()

        for (fd in message.fieldDescriptors) {
            @Suppress("UNCHECKED_CAST")
            val value = (fd.value as KProperty1<T, *>).get(message)

            if (value == null && fd.oneofMember) continue
            if (!fd.oneofMember && !jsonConfig.outputDefaultValues && fd.type.isDefaultValue(value)) continue

            val jsonValue = value?.let { jsonValueMarshaller.writeValue(it, fd.type) } ?: JsonNull
            jsonContent[jsonConfig.getFieldJsonName(fd)] = jsonValue
        }

        return JsonObject(jsonContent)
    }

}


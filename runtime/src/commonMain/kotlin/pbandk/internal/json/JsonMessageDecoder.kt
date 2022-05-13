package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.MessageDecoder
import pbandk.gen.MutableMapField
import pbandk.json.JsonConfig
import pbandk.wkt.Value

private val FieldDescriptor<*, *>.jsonNames: List<String>
    get() = listOf(jsonName, name)

internal class JsonMessageDecoder internal constructor(
    private val content: JsonElement,
    private val jsonConfig: JsonConfig
) : MessageDecoder {
    private val jsonValueDecoder = JsonValueDecoder(jsonConfig)

    override fun <M : Message> readMessage(messageCompanion: Message.Companion<M>): M = try {
        JsonMessageAdapters.getAdapter(messageCompanion)
            ?.decode(content.jsonObject, jsonValueDecoder)
            ?: readMessageObject(messageCompanion, content.jsonObject)
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    private fun <M : Message> readMessageObject(
        messageCompanion: Message.Companion<M>,
        content: JsonObject
    ): M = messageCompanion.descriptor.builder {
        for ((key, jsonValue) in content) {
            val fd = messageCompanion.descriptor.fields.firstOrNull { key in it.jsonNames }
                ?: if (jsonConfig.ignoreUnknownFieldsInInput) {
                    continue
                } else {
                    throw InvalidProtocolBufferException("Unknown field name and ignoreUnknownFieldsInInput=false: $key")
                }

            if (jsonValue is JsonNull) {
                if (fd.type is FieldDescriptor.Type.Message<*> && fd.type.messageCompanion is Value.Companion) {
                    @Suppress("UNCHECKED_CAST")
                    (fd as FieldDescriptor<M, Value>).updateValue(this, NullValueValue)
                }
            } else {
                jsonValueDecoder.readValue(jsonValue, fd.type)?.let { value ->
                    when (fd.type) {
                        is FieldDescriptor.Type.Repeated<*> -> {
                            value as Sequence<*>
                            @Suppress("UNCHECKED_CAST")
                            (fd.getValue(this as M) as MutableList<Any?>).addAll(value)
                        }
                        is FieldDescriptor.Type.Map<*, *> -> {
                            @Suppress("UNCHECKED_CAST")
                            value as Sequence<Map.Entry<Any, Any>>
                            @Suppress("UNCHECKED_CAST")
                            (fd.getValue(this as M) as MutableMapField<Any, Any>).putAll(value)
                        }
                        else -> {
                            @Suppress("UNCHECKED_CAST")
                            (fd as FieldDescriptor<M, Any>).updateValue(this, value)
                        }
                    }
                }
            }
        }
    }

    companion object {
        fun fromString(data: String, jsonConfig: JsonConfig = JsonConfig.DEFAULT): JsonMessageDecoder {
            val content = Json.decodeFromString(JsonElement.serializer(), data)
            return JsonMessageDecoder(content, jsonConfig)
        }

        private val NullValueValue = Value { kind = Value.Kind.NullValue() }
    }
}

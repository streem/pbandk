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
import pbandk.MessageDescriptor
import pbandk.UnknownField
import pbandk.internal.underscoreToCamelCase
import pbandk.json.JsonConfig
import pbandk.wkt.Value

private val FieldDescriptor<*, *>.jsonNames: List<String>
    get() = listOf(
        jsonName ?: name.underscoreToCamelCase(),
        name
    )

internal class JsonMessageDecoder internal constructor(
    private val content: JsonElement,
    private val jsonConfig: JsonConfig
) : MessageDecoder {
    private val jsonValueDecoder = JsonValueDecoder(jsonConfig)

    override fun <T : Message> readMessage(
        messageCompanion: Message.Companion<T>,
        fieldFn: (Int, Any) -> Unit
    ): Map<Int, UnknownField> = try {
        JsonMessageAdapters.getAdapter(messageCompanion)?.let {
            readWithMessageAdapter(it, content.jsonObject, fieldFn)
        } ?: readMessageObject(messageCompanion, content.jsonObject, fieldFn)
        emptyMap()
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    // A hack until message decoding is done fully at runtime without the need of a custom `decodeWith()` method
    // generated in each type.
    private fun <T : Message> readWithMessageAdapter(
        adapter: JsonMessageAdapter<T>,
        content: JsonObject,
        fieldFn: (Int, Any) -> Unit
    ) {
        val message = adapter.decode(content, jsonValueDecoder)
        @Suppress("UNCHECKED_CAST")
        for (field in (message.descriptor as MessageDescriptor<T>).fields) {
            field.value.get(message)?.let { fieldFn(field.number, it) }
        }
    }

    private fun <T : Message> readMessageObject(
        messageCompanion: Message.Companion<T>,
        content: JsonObject,
        fieldFn: (Int, Any) -> Unit
    ) {
        for ((key, jsonValue) in content) {
            val fd = messageCompanion.descriptor.fields.firstOrNull { key in it.jsonNames }
                ?: if (jsonConfig.ignoreUnknownFieldsInInput) {
                    continue
                } else {
                    throw InvalidProtocolBufferException("Unknown field name and ignoreUnknownFieldsInInput=false: $key")
                }

            if (jsonValue is JsonNull) {
                // JSON messages can be primitive wrappers, where null signifies a default value
                // https://developers.google.com/protocol-buffers/docs/proto3#default
                if (fd.type is FieldDescriptor.Type.Message<*>) {
                    val defaultValue = when (fd.type.messageCompanion) {
                        Value -> Value(kind = Value.Kind.NullValue())
                        else -> fd.type.defaultValue
                    } ?: continue

                    fieldFn(fd.number, defaultValue)
                }
            } else {
                jsonValueDecoder.readValue(jsonValue, fd.type)?.let { fieldFn(fd.number, it) }
            }
        }
    }

    companion object {
        fun fromString(data: String, jsonConfig: JsonConfig = JsonConfig.DEFAULT): JsonMessageDecoder {
            val content = Json.decodeFromString(JsonElement.serializer(), data)
            return JsonMessageDecoder(content, jsonConfig)
        }
    }
}

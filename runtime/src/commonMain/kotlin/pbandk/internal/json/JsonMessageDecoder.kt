package pbandk.internal.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonElementSerializer
import pbandk.*
import pbandk.internal.underscoreToCamelCase
import pbandk.json.JsonConfig
import pbandk.wkt.*
import kotlin.Any

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
        readMessageObject(messageCompanion, content, fieldFn)
        emptyMap()
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("unable to read message", e)
    }

    private fun <T : Message> readMessageObject(
        messageCompanion: Message.Companion<T>,
        content: JsonElement,
        fieldFn: (Int, Any) -> Unit
    ) {
        for ((key, jsonValue) in content.jsonObject) {
            val fd = messageCompanion.descriptor.fields.firstOrNull { key in it.jsonNames }
                ?: if (jsonConfig.ignoreUnknownFieldsInInput) {
                    continue
                } else {
                    throw InvalidProtocolBufferException("Unknown field name and ignoreUnknownFieldsInInput=false: $key")
                }

            if (jsonValue.isNull) {
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
                fieldFn(fd.number, jsonValueDecoder.readValue(jsonValue, fd.type))
            }
        }
    }

    companion object {
        fun fromString(data: String, jsonConfig: JsonConfig = JsonConfig.DEFAULT): JsonMessageDecoder {
            val json = Json(JsonConfiguration.Stable)
            val content = json.parse(JsonElementSerializer, data)
            return JsonMessageDecoder(content, jsonConfig)
        }
    }
}

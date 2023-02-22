package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.gen.AbstractGeneratedMessage
import pbandk.getTypeNameFromTypeUrl
import pbandk.getTypePrefixFromTypeUrl
import pbandk.getTypeUrl
import pbandk.internal.json.JsonFieldDecoder
import pbandk.internal.types.MessageValueType
import pbandk.internal.types.findByJsonName
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.pack
import pbandk.unpack
import pbandk.wkt.Any

internal object Any : MessageValueType<Any>(Any) {
    override fun encodeToJson(value: Any, encoder: JsonFieldValueEncoder) {
        val valueCompanion = encoder.jsonConfig.typeRegistry.getTypeUrl(value.typeUrl)?.messageCompanion
            ?: throw InvalidProtocolBufferException("Type URL not found in type registry: ${value.typeUrl}")
        encodeToJson(valueCompanion, value, encoder)
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Any {
        if (decoder !is JsonFieldValueDecoder.Object) {
            throw InvalidProtocolBufferException("Unexpected JSON type for message value: ${decoder.wireType.name}")
        }

        return decoder.decodeFields { fieldDecoder ->
            val typeUrl = fieldDecoder.findField("@type") { valueDecoder ->
                if (valueDecoder !is JsonFieldValueDecoder.String) {
                    throw InvalidProtocolBufferException("'@type' field in google.protobuf.Any messages must contain a string")
                }
                valueDecoder.decodeAsString()
            } ?: throw InvalidProtocolBufferException("'@type' field not found in google.protobuf.Any message")

            val valueCompanion = fieldDecoder.jsonConfig.typeRegistry.getTypeUrl(typeUrl)?.messageCompanion
                ?: throw InvalidProtocolBufferException("Type URL not found in type registry: $typeUrl")
            decodeFromJson(valueCompanion, typeUrl, fieldDecoder)
        }
    }
}

private fun findValueField(keyDecoder: JsonFieldValueDecoder.String): Boolean {
    val key = keyDecoder.decodeAsString()
    return when {
        key == "value" -> true
        keyDecoder.jsonConfig.ignoreUnknownFieldsInInput -> false
        else -> throw InvalidProtocolBufferException("Unknown field name and ignoreUnknownFieldsInInput=false: $key")
    }
}

// helper function to make type checker happy
@Suppress("NOTHING_TO_INLINE")
private inline fun <T : Message> encodeToJson(
    valueCompanion: Message.Companion<T>,
    value: Any,
    encoder: JsonFieldValueEncoder,
) {
    val unpackedMessage = value.unpack(valueCompanion)
    encoder.encodeObject { fieldEncoder ->
        fieldEncoder.encodeField("@type") { it.encodeString(value.typeUrl) }
        val customValueType = customJsonMappings[valueCompanion]
        if (customValueType != null) {
            @Suppress("UNCHECKED_CAST")
            customValueType as WktValueType<*, T>

            fieldEncoder.encodeField("value") {
                customValueType.encodeMessageToJson(unpackedMessage, it)
            }
        } else {
            @Suppress("UNCHECKED_CAST")
            unpackedMessage as AbstractGeneratedMessage<T>

            unpackedMessage.fieldDescriptors(ordered = true).forEach { fd ->
                fd.encodeToJson(fieldEncoder, unpackedMessage)
            }
        }
    }
}

// helper function to make type checker happy
@Suppress("NOTHING_TO_INLINE")
private inline fun <T : Message> decodeFromJson(
    valueCompanion: Message.Companion<T>,
    typeUrl: String,
    decoder: JsonFieldDecoder,
): Any {
    val message = customJsonMappings[valueCompanion]?.let { valueType ->
        @Suppress("UNCHECKED_CAST")
        valueType as WktValueType<*, T>

        var message: T? = null
        decoder.forEachField(::findValueField) { isValueField, fieldValueDecoder ->
            if (isValueField) {
                message = valueType.decodeMessageFromJson(fieldValueDecoder)
            } else {
                fieldValueDecoder.skipValue()
            }
        }
        message ?: throw InvalidProtocolBufferException(
            "'value' field not found in google.protobuf.Any message containing a '${getTypeNameFromTypeUrl(typeUrl)}' message"
        )
    } ?: valueCompanion.descriptor.builder {
        val fieldDescriptors = valueCompanion.descriptor.fields
        decoder.forEachField(fieldDescriptors::findByJsonName) { fd, valueDecoder ->
            if (fd != null) {
                fd.decodeFromJson(valueDecoder, this)
            } else {
                valueDecoder.skipValue()
            }
        }
    }

    return if ('/' in typeUrl) {
        Any.pack(message, getTypePrefixFromTypeUrl(typeUrl))
    } else {
        Any.pack(message)
    }
}
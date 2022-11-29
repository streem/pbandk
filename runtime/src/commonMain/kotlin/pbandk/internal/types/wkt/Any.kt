package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.gen.messageDescriptor
import pbandk.getTypeUrl
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.types.customJsonMappings
import pbandk.internal.types.encodeMessageField
import pbandk.unpack
import pbandk.wkt.Any

internal object Any : WktMessageValueType<Any>() {
    // helper function to make type checker happy
    @Suppress("NOTHING_TO_INLINE")
    private inline fun <T : pbandk.Message> encodeToJson(
        valueCompanion: pbandk.Message.Companion<T>,
        value: Any,
        encoder: JsonFieldValueEncoder,
    ) {
        val unpackedMessage = value.unpack(valueCompanion)
        encoder.encodeObject { fieldEncoder ->
            customJsonMappings[valueCompanion.descriptor]?.let { valueType ->
                @Suppress("UNCHECKED_CAST")
                valueType as WktValueType<*, T>

                fieldEncoder.encodeField("value") {
                    valueType.encodeMessageToJson(unpackedMessage, it)
                }
            } ?: value.messageDescriptor.fields.forEach { fieldDescriptor ->
                encodeMessageField(value, fieldDescriptor, fieldEncoder)
            }
            fieldEncoder.encodeField("@type") { it.encodeString(value.typeUrl) }
        }
    }

    override fun encodeToJson(value: Any, encoder: JsonFieldValueEncoder) {
        val companion = encoder.jsonConfig.typeRegistry.getTypeUrl(value.typeUrl)?.messageCompanion
            ?: throw InvalidProtocolBufferException("Type URL not found in type registry: ${value.typeUrl}")
        encodeToJson(companion, value, encoder)
    }
}
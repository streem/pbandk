package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.internal.types.MessageValueType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.Struct

internal object Struct : MessageValueType<Struct>(Struct) {
    override fun encodeToJson(value: Struct, encoder: JsonFieldValueEncoder) {
        encoder.encodeObject { fieldEncoder ->
            value.fields.forEach { (k, v) ->
                fieldEncoder.encodeField(k) { valueEncoder ->
                    Value.encodeToJson(v, valueEncoder)
                }
            }
        }
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Struct {
        if (decoder !is JsonFieldValueDecoder.Object) {
            throw InvalidProtocolBufferException("Unexpected JSON type for google.protobuf.Struct value: ${decoder.wireType.name}")
        }

        return Struct {
            decoder.decodeFields { fieldDecoder ->
                fieldDecoder.forEachField { fieldKeyDecoder, fieldValueDecoder ->
                    val fieldKey = fieldKeyDecoder.decodeAsString()
                    fields[fieldKey] = Value.decodeFromJson(fieldValueDecoder)
                }
            }
        }
    }
}
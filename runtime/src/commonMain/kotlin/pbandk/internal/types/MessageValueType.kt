package pbandk.internal.types

import pbandk.Message
import pbandk.gen.messageDescriptor
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireType
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.types.wkt.WktValueType
import pbandk.types.ValueType

internal abstract class MessageValueType<M : Message> : ValueType<M> {
    override fun isDefaultValue(value: M) = false

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: M) = Sizer.messageSize(value)

    internal fun encodeToBinaryNoLength(value: M, fieldEncoder: BinaryFieldEncoder) {
        for (fieldDescriptor in value.messageDescriptor.fields) {
            encodeMessageField(value, fieldDescriptor, fieldEncoder)
        }
        for (field in value.unknownFields.values) {
            field.values.forEach {
                fieldEncoder.encodeUnknownField(Tag(field.fieldNum, WireType(it.wireType)), it.rawBytes.array)
            }
        }
    }

    override fun encodeToBinary(value: M, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLenFields(value.protoSize) { fieldEncoder ->
            encodeToBinaryNoLength(value, fieldEncoder)
        }
    }

    override fun encodeToJson(value: M, encoder: JsonFieldValueEncoder) {
        @Suppress("UNCHECKED_CAST")
        val customValueType = customJsonMappings[value.messageDescriptor] as? WktValueType<*, M>?

        if (customValueType != null) {
            customValueType.encodeMessageToJson(value, encoder)
        } else {
            encoder.encodeObject { fieldEncoder ->
                value.messageDescriptor.fields.forEach { fieldDescriptor ->
                    encodeMessageField(value, fieldDescriptor, fieldEncoder)
                }
            }
        }
    }

    override fun encodeToJsonMapKey(value: M) =
        throw UnsupportedOperationException("messages cannot be used as map keys")
}
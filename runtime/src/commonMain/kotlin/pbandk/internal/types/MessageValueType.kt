package pbandk.internal.types

import pbandk.FieldDescriptor
import pbandk.FieldDescriptorSet
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.UnknownField
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.gen.AbstractGeneratedMessage
import pbandk.gen.messageDescriptor
import pbandk.internal.binary.BinaryFieldDecoder
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.Tag
import pbandk.binary.WireValue
import pbandk.internal.json.JsonFieldDecoder
import pbandk.internal.types.wkt.WktValueType
import pbandk.internal.types.wkt.customJsonMappings
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.types.ValueType

internal fun <M : Message> FieldDescriptorSet<M>.findByJsonName(keyDecoder: JsonFieldValueDecoder.String): FieldDescriptor<M, *>? {
    val key = keyDecoder.decodeAsString()
    val fd = this.firstOrNull { key in listOf(it.jsonName, it.name) }
    if (fd == null && !keyDecoder.jsonConfig.ignoreUnknownFieldsInInput) {
        throw InvalidProtocolBufferException("Unknown field name and ignoreUnknownFieldsInInput=false: $key")
    }
    return fd
}

internal fun <M : Message> Message.Companion<M>.decodeMessageFromJson(fieldDecoder: JsonFieldDecoder): M {
    val fieldDescriptors = descriptor.fields
    return descriptor.builder {
        fieldDecoder.forEachField { keyDecoder, valueDecoder ->
            val fd = fieldDescriptors.findByJsonName(keyDecoder)
            if (fd != null) {
                fd.decodeFromJson(valueDecoder, this)
            } else {
                valueDecoder.skipValue()
            }
        }
    }
}

internal open class MessageValueType<M : Message>(
    override val companion: Message.Companion<M>
) : WktValueType<M, M>, ValueType<M> {
    override val defaultValue get() = companion.defaultInstance

    override fun isDefaultValue(value: M) = false

    override fun mergeValues(currentValue: M, newValue: M): M {
        @Suppress("UNCHECKED_CAST")
        return currentValue.plus(newValue) as M
    }

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: M) = WireValue.Len.sizeWithLenPrefix(value.protoSize)

    internal fun rawBinarySize(message: M): Int {
        @Suppress("UNCHECKED_CAST")
        message as AbstractGeneratedMessage<M>

        var protoSize = 0

        message.fieldDescriptors().forEach { fd ->
            protoSize += fd.binarySize(message)
        }

        protoSize += message.unknownFields.values.sumOf { it.size }
        return protoSize
    }

    internal fun encodeToBinaryNoLength(value: M, fieldEncoder: BinaryFieldEncoder) {
        @Suppress("UNCHECKED_CAST")
        value as AbstractGeneratedMessage<M>

        value.fieldDescriptors(ordered = true).forEach { fd ->
            fd.encodeToBinary(fieldEncoder, value)
        }
        for (field in value.unknownFields.values) {
            field.values.forEach {
                fieldEncoder.encodeField(Tag(field.fieldNum, WireType(it.wireValue.wireType))) { valueEncoder ->
                    valueEncoder.encodeUnknownField(field.fieldNum, it.wireValue)
                }
            }
        }
    }

    override fun encodeToBinary(value: M, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLenFields(value.protoSize) { fieldEncoder ->
            encodeToBinaryNoLength(value, fieldEncoder)
        }
    }

    internal fun decodeFromBinaryNoLength(fieldDecoder: BinaryFieldDecoder): M {
        return companion.descriptor.builder {
            val fieldDescriptors = companion.descriptor.fields
            // Keep a `MutableList` of each unknown field while decoding the message. `UnknownField.values` is an
            // _immutable_ `List`, so modifying `unknownFields` directly would require extra object allocation to add a
            // new value to the immutable list.
            val unknownFieldValues = mutableMapOf<Int, MutableList<UnknownField.Value>>()

            fieldDecoder.forEachField { fieldNum, valueDecoder ->
                val fd = fieldDescriptors[fieldNum]
                if (fd != null && fd.fieldType.allowsBinaryWireType(valueDecoder.wireType)) {
                    fd.decodeFromBinary(valueDecoder, this)
                } else {
                    // TODO: support a `discardUnknownFields` option and call skipValue() in that case
                    val unknownFieldValue = UnknownField.Value(valueDecoder)
                    unknownFieldValues.getOrPut(fieldNum) { mutableListOf() }.add(unknownFieldValue)
                }
            }

            unknownFieldValues.forEach { unknownFields[it.key] = UnknownField(it.key, it.value) }
        }
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): M {
        if (decoder !is BinaryFieldValueDecoder.Len) {
            throw InvalidProtocolBufferException("Unexpected wire type for message value: ${decoder.wireType}")
        }
        return decoder.decodeFields { fieldDecoder ->
            decodeFromBinaryNoLength(fieldDecoder)
        }
    }


    override fun decodeFromJson(decoder: JsonFieldValueDecoder): M {
        if (decoder !is JsonFieldValueDecoder.Object) {
            throw InvalidProtocolBufferException("Unexpected JSON type for message value: ${decoder.wireType.name}")
        }

        return decoder.decodeFields { companion.decodeMessageFromJson(it) }
    }

    override fun decodeMessageFromJson(decoder: JsonFieldValueDecoder) = decodeFromJson(decoder)

    override fun encodeToJson(value: M, encoder: JsonFieldValueEncoder) {
        val customValueType = customJsonMappings[value.messageDescriptor.messageCompanion]

        if (customValueType != null) {
            @Suppress("UNCHECKED_CAST")
            customValueType as WktValueType<*, M>

            customValueType.encodeMessageToJson(value, encoder)
        } else {
            encoder.encodeObject { fieldEncoder ->
                @Suppress("UNCHECKED_CAST")
                value as AbstractGeneratedMessage<M>

                value.fieldDescriptors(ordered = true).forEach { fd ->
                    fd.encodeToJson(fieldEncoder, value)
                }
            }
        }
    }

    override fun encodeMessageToJson(message: M, encoder: JsonFieldValueEncoder) {
        encodeToJson(message, encoder)
    }

    override fun encodeToJsonMapKey(value: M) =
        throw UnsupportedOperationException("messages cannot be used as map keys")

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        throw UnsupportedOperationException("messages cannot be used as map keys")
}
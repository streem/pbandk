package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.NullValue

internal class Enum<E : Message.Enum>(val enumCompanion: Message.Enum.Companion<E>) : PrimitiveValueType<E>() {
    override val defaultValue: E get() = enumCompanion.fromValue(0)

    override fun isDefaultValue(value: E) = value.value == 0

    override val binaryWireType = WireType.VARINT

    /**
     * The code that calls this function must make sure to skip the entire field when the enum's numeric value is
     * unknown. Otherwise the encoded field will be malformed since it'll contain the field tag but no data.
     */
    override fun binarySize(value: E) = value.value?.let { WireValue.Varint.encodeSignedInt(it).size } ?: 0

    /**
     * The code that calls this function must make sure to skip the entire field when the enum's numeric value is
     * unknown. Otherwise the encoded field will be malformed since it'll contain the field tag but no data.
     */
    override fun encodeToBinary(value: E, encoder: BinaryFieldValueEncoder) {
        value.value?.let { encoder.encodeVarint(WireValue.Varint.encodeSignedInt(it)) }
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): E {
        if (decoder !is BinaryFieldValueDecoder.Varint) {
            throw InvalidProtocolBufferException("Unexpected wire type for enum value: ${decoder.wireType}")
        }
        return enumCompanion.fromValue(decoder.decodeValue().decodeSignedInt)
    }

    override fun encodeToJson(value: E, encoder: JsonFieldValueEncoder) {
        if (enumCompanion is NullValue) {
            encoder.encodeNull()
            return
        }

        // Unrecognized enum values must be serialized as their numeric value
        value.name?.let { name ->
            encoder.encodeString(name)
        } ?: value.value?.let { numericValue ->
            encoder.encodeNumberSignedInt(numericValue)
        } ?: throw IllegalStateException("Enums should always contain at least a `name` or a `value`")
    }

    override fun encodeToJsonMapKey(value: E) =
        throw UnsupportedOperationException("enums cannot be used as map keys")

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): E = when (decoder) {
        is JsonFieldValueDecoder.Null -> if (enumCompanion is NullValue) {
            decoder.consumeNull()
            @Suppress("UNCHECKED_CAST")
            NullValue.NULL_VALUE as E
        } else {
            throw InvalidProtocolBufferException("enum values must be numeric or quoted strings")
        }

        is JsonFieldValueDecoder.Number -> enumCompanion.fromValue(decoder.decodeAsSignedInt())

        is JsonFieldValueDecoder.String -> {
            val value = decoder.decodeAsString()
            value.toIntOrNull()?.let { enumCompanion.fromValue(it) } ?: enumCompanion.fromName(value)
        }

        else -> throw InvalidProtocolBufferException("enum values must be numeric or quoted strings")
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        throw UnsupportedOperationException("enums cannot be used as map keys")
}
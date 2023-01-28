package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.gen.UnrecognizedEnumValue
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.binary.WireType
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.NullValue

internal class Enum<E : Message.Enum>(val enumCompanion: Message.Enum.Companion<E>) : PrimitiveValueType<E>() {
    override val defaultValue: E get() = enumCompanion.fromValue(0)

    override fun isDefaultValue(value: E) = value.value == 0

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: E) = Sizer.enumSize(value)

    override fun encodeToBinary(value: E, encoder: BinaryFieldValueEncoder) {
        // TODO: ensure that the code that calls this function skips the entire field when the enum's numeric value
        //  is unknown
        value.value?.let { encoder.encodeVarint(WireValue.Varint.encodeSignedInt(it)) }
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): E {
        return enumCompanion.fromValue(decoder.decodeVarint().decodeSignedInt)
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

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): E {
        val enumValue = when (decoder) {
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

        // In theory we should reject unknown enum values regardless of whether they're numeric- or string-based. But
        // the official protobuf Java library only rejects string-based unknown enum values. Numeric-based unknown enum
        // values are allowed even when `ignoreUnknownFieldsInInput=false`. For compatibility, we mimic the
        // protobuf-java behavior here. See https://github.com/protocolbuffers/protobuf/issues/7392 and
        // https://github.com/protocolbuffers/protobuf/pull/4825/files for more context.
        if (enumValue is UnrecognizedEnumValue<*> &&
            enumValue.value == null &&
            !decoder.jsonConfig.ignoreUnknownFieldsInInput
        ) {
            throw InvalidProtocolBufferException("enum field did not contain a valid enum value")
        }

        return enumValue
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        throw UnsupportedOperationException("enums cannot be used as map keys")
}
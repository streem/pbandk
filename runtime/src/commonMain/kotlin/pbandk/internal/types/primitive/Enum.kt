package pbandk.internal.types.primitive

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.Message
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.types.ValueType
import pbandk.wkt.NullValue

internal object Enum : ValueType<Message.Enum> {
    override fun isDefaultValue(value: Message.Enum) = value.value == 0

    override val binaryWireType = WireType.VARINT

    override fun binarySize(value: Message.Enum) = Sizer.enumSize(value)

    override fun encodeToBinary(value: Message.Enum, encoder: BinaryFieldValueEncoder) {
        encoder.encodeVarintSignedInt(value.value)
    }

    override fun encodeToJson(value: Message.Enum, encoder: JsonFieldValueEncoder) {
        if (value.descriptor.enumCompanion is NullValue) {
            encoder.encodeNull()
            return
        }

        // Unrecognized enum values must be serialized as their numeric value
        value.name?.let { name ->
            encoder.encodeString(name)
        } ?: encoder.encodeNumberSignedInt(value.value)
    }

    override fun encodeToJsonMapKey(value: Message.Enum) =
        throw UnsupportedOperationException("enums cannot be used as map keys")
}
package pbandk.internal.types.primitive

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.internal.Util
import pbandk.internal.binary.WireValue
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import kotlin.String

internal object String : PrimitiveValueType<String>() {
    override val defaultValue: String = ""

    override fun isDefaultValue(value: String) = value.isEmpty()

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: String) = WireValue.Len.sizeWithLenPrefix(Util.utf8len(value))

    override fun encodeToBinary(value: String, encoder: BinaryFieldValueEncoder) {
        encoder.encodeLen(WireValue.Len.encodeString(value))
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): String {
        return decoder.decodeLen().decodeString
    }

    override fun encodeToJson(value: String, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(value)
    }

    override fun encodeToJsonMapKey(value: String) = value

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): String {
        return when (decoder) {
            is JsonFieldValueDecoder.String -> decoder.decodeAsString()
            else -> throw InvalidProtocolBufferException("Unexpected JSON type for string value: ${decoder.wireType.name}")
        }
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) = decoder.decodeAsString()
}
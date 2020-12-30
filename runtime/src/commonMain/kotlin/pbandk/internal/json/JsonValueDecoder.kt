package pbandk.internal.json

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonLiteral
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.content
import kotlinx.serialization.json.double
import kotlinx.serialization.json.float
import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.MessageMap
import pbandk.internal.Util
import pbandk.json.JsonConfig
import pbandk.wkt.BoolValue
import pbandk.wkt.BytesValue
import pbandk.wkt.DoubleValue
import pbandk.wkt.Duration
import pbandk.wkt.FloatValue
import pbandk.wkt.Int32Value
import pbandk.wkt.Int64Value
import pbandk.wkt.ListValue
import pbandk.wkt.StringValue
import pbandk.wkt.Struct
import pbandk.wkt.Timestamp
import pbandk.wkt.UInt32Value
import pbandk.wkt.UInt64Value
import pbandk.wkt.Value

@OptIn(ExperimentalUnsignedTypes::class)
internal class JsonValueDecoder(private val jsonConfig: JsonConfig) {
    /**
     * Returns `null` if the value was parseable but is invalid. This currently only happens for enum fields with
     * unknown values.
     */
    fun readValue(value: JsonElement, type: FieldDescriptor.Type, isMapKey: Boolean = false): Any? = when (type) {
        is FieldDescriptor.Type.Primitive.Double -> readDouble(value)
        is FieldDescriptor.Type.Primitive.Float -> readFloat(value)
        is FieldDescriptor.Type.Primitive.Int64 -> readInteger64(value, isMapKey)
        is FieldDescriptor.Type.Primitive.UInt64 -> readUnsignedInteger64(value, isMapKey)
        is FieldDescriptor.Type.Primitive.Int32 -> readInteger32(value, isMapKey)
        is FieldDescriptor.Type.Primitive.Fixed64 -> readUnsignedInteger64(value, isMapKey)
        is FieldDescriptor.Type.Primitive.Fixed32 -> readUnsignedInteger32(value, isMapKey)
        is FieldDescriptor.Type.Primitive.Bool -> readBool(value, isMapKey)
        is FieldDescriptor.Type.Primitive.String -> readString(value, isMapKey)
        is FieldDescriptor.Type.Primitive.Bytes -> readBytes(value)
        is FieldDescriptor.Type.Primitive.UInt32 -> readUnsignedInteger32(value, isMapKey)
        is FieldDescriptor.Type.Primitive.SFixed32 -> readInteger32(value, isMapKey)
        is FieldDescriptor.Type.Primitive.SFixed64 -> readInteger64(value, isMapKey)
        is FieldDescriptor.Type.Primitive.SInt32 -> readInteger32(value, isMapKey)
        is FieldDescriptor.Type.Primitive.SInt64 -> readInteger64(value, isMapKey)
        is FieldDescriptor.Type.Message<*> -> when (type.messageCompanion) {
            // Wrapper types use the same JSON representation as the wrapped value
            // https://developers.google.com/protocol-buffers/docs/proto3#json
            DoubleValue -> readDouble(value)
            FloatValue -> readFloat(value)
            Int64Value -> readInteger64(value, isMapKey)
            UInt64Value -> readUnsignedInteger64(value, isMapKey)
            Int32Value -> readInteger32(value, isMapKey)
            UInt32Value -> readUnsignedInteger32(value, isMapKey)
            BoolValue -> readBool(value, isMapKey)
            StringValue -> readString(value, isMapKey)
            BytesValue -> readBytes(value)
            // Other well-known types with special JSON encoding
            Timestamp -> Util.stringToTimestamp(readString(value, false))
            Duration -> Util.stringToDuration(readString(value, false))
            Struct -> readStruct(value)
            Value -> readDynamicValue(value)
            ListValue -> readDynamicListValue(value)
            // All other message types
            else -> readMessage(value, type.messageCompanion)
        }
        is FieldDescriptor.Type.Enum<*> -> readEnum(value, type.enumCompanion)
        is FieldDescriptor.Type.Repeated<*> -> readRepeated(value, type.valueType)
        is FieldDescriptor.Type.Map<*, *> -> readMap(value, type)
    }

    private inline fun <T> readIntegerInternal(
        value: JsonElement,
        @Suppress("UNUSED_PARAMETER") isMapKey: Boolean,
        body: (String) -> T
    ) = try {
        val content = value.content
        // The protobuf conformance test suite is pretty strict about requiring parsers to reject parsable numeric
        // values that don't conform to the spec.
        when (content.getOrNull(0)) {
            ' ' -> throw NumberFormatException(
                "Integers must not have preceding space"
            )
            '+' -> throw NumberFormatException(
                "Positive integers must not include the '+' sign"
            )
            '-' -> if (content.getOrNull(1) == '0') throw NumberFormatException(
                "Negative integers with leading zeros are not allowed"
            )
            '0' -> if (content.length > 1) throw NumberFormatException(
                "Integers with leading zeros are not allowed"
            )
        }

        if (content.last() == ' ') {
            throw NumberFormatException(
                "Integers must not have trailing space"
            )
        }

        try {
            body(content)
        } catch (e: NumberFormatException) {
            // try parsing integers having trailing zeroes or in exponent notation
            var contentExpandedInteger = content.replace(NUMBER_TRAILING_ZEROES, "")
            NUMBER_SCIENTIFIC_NOTATION.find(contentExpandedInteger)?.let {
                val mantissaFraction = it.groupValues[1].trimStart('.')
                val mantissaDigits = mantissaFraction.length
                val isMantissaFractionZero = mantissaFraction.isEmpty() || mantissaFraction.toULong() == 0UL
                val decade = it.groupValues[2].toLong()

                if (isMantissaFractionZero || decade >= mantissaDigits) {
                    contentExpandedInteger = contentExpandedInteger.toDouble().toLong().toString()
                }
            }

            body(contentExpandedInteger)
        }
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("field did not contain a number in JSON", e)
    }

    fun readInteger32(value: JsonElement, isMapKey: Boolean = false): Int =
        readIntegerInternal(value, isMapKey) { it.toInt() }

    fun readInteger64(value: JsonElement, isMapKey: Boolean = false): Long =
        readIntegerInternal(value, isMapKey) { it.toLong() }

    fun readUnsignedInteger32(value: JsonElement, isMapKey: Boolean = false): Int =
        readIntegerInternal(value, isMapKey) { it.toUInt().toInt() }

    fun readUnsignedInteger64(value: JsonElement, isMapKey: Boolean = false): Long =
        readIntegerInternal(value, isMapKey) { it.toULong().toLong() }

    // The protobuf conformance test suite is pretty strict about requiring parsers to reject any other variations
    // (such as upper-case or quoted) aside from the two below.
    fun readBool(value: JsonElement, isMapKey: Boolean = false): Boolean =
        if (!isMapKey && value is JsonLiteral && value.isString) {
            throw InvalidProtocolBufferException("bool field must not be quoted in JSON")
        } else when (value.content) {
            "true" -> true
            "false" -> false
            else -> throw InvalidProtocolBufferException("bool field did not contain a boolean value in JSON")
        }

    fun readEnum(value: JsonElement, enumCompanion: Message.Enum.Companion<*>): Message.Enum? = try {
        val p = value.primitive
        p.intOrNull?.let { return enumCompanion.fromValue(it) }
        require(p is JsonLiteral && p.isString) { "Non-numeric enum values must be quoted" }
        enumCompanion.fromName(p.content)
    } catch (e: Exception) {
        // See https://github.com/protocolbuffers/protobuf/issues/7392 and
        // https://github.com/protocolbuffers/protobuf/pull/4825/files for context
        if (e is IllegalArgumentException && jsonConfig.ignoreUnknownFieldsInInput) {
            null
        } else {
            throw InvalidProtocolBufferException("enum field did not contain a number or valid enum value", e)
        }
    }

    fun readFloat(value: JsonElement): Float {
        try {
            if (value is JsonLiteral && value.isString) {
                when (value.content) {
                    "Infinity" -> return Float.POSITIVE_INFINITY
                    "-Infinity" -> return Float.NEGATIVE_INFINITY
                    "NaN" -> return Float.NaN
                }
            }

            val floatValue = value.float
            return when {
                !floatValue.isFinite() ->
                    throw NumberFormatException("value out of bounds")
                floatValue > 0.0 && floatValue !in FLOAT_MIN_POSITIVE..FLOAT_MAX_POSITIVE ->
                    throw NumberFormatException("value out of bounds")
                floatValue < 0.0 && floatValue !in FLOAT_MIN_NEGATIVE..FLOAT_MAX_NEGATIVE ->
                    throw NumberFormatException("value out of bounds")

                else -> floatValue
            }
        } catch (e: Exception) {
            throw InvalidProtocolBufferException("float field did not contain a float value in JSON", e)
        }
    }

    fun readDouble(value: JsonElement): Double {
        try {
            if (value is JsonLiteral && value.isString) {
                when (value.content) {
                    "Infinity" -> return Double.POSITIVE_INFINITY
                    "-Infinity" -> return Double.NEGATIVE_INFINITY
                    "NaN" -> return Double.NaN
                }
            }

            val doubleValue = value.double
            return when {
                !doubleValue.isFinite() ->
                    throw NumberFormatException("value out of bounds")
                doubleValue > 0.0 && doubleValue !in DOUBLE_MIN_POSITIVE..DOUBLE_MAX_POSITIVE ->
                    throw NumberFormatException("value out of bounds")
                doubleValue < 0.0 && doubleValue !in DOUBLE_MIN_NEGATIVE..DOUBLE_MAX_NEGATIVE ->
                    throw NumberFormatException("value out of bounds")

                else -> doubleValue
            }
        } catch (e: Exception) {
            throw InvalidProtocolBufferException("double field did not contain a double value in JSON", e)
        }
    }

    fun readString(value: JsonElement, @Suppress("UNUSED_PARAMETER") isMapKey: Boolean = false): String = try {
        require(value is JsonLiteral && value.isString) { "string field wasn't quoted" }
        value.content
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("string field did not contain a string value in JSON", e)
    }

    fun readBytes(value: JsonElement): ByteArr = try {
        ByteArr(Util.base64ToBytes(value.content))
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("bytes field did not contain a base64-encoded string value in JSON", e)
    }

    fun readMessage(value: JsonElement, messageCompanion: Message.Companion<*>): Message = try {
        messageCompanion.decodeWith(JsonMessageDecoder(value, jsonConfig))
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("message field did not contain a valid message", e)
    }

    fun readRepeated(value: JsonElement, valueType: FieldDescriptor.Type): Sequence<*> = try {
        value.jsonArray.asSequence().mapNotNull { readValue(it, valueType) }
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("repeated field did not contain a valid list", e)
    }

    fun readMap(
        value: JsonElement,
        type: FieldDescriptor.Type.Map<*, *>
    ): Sequence<Map.Entry<*, *>> = try {
        value.jsonObject.asSequence()
            .mapNotNull { (k, v) ->
                val entryKey = readValue(JsonLiteral(k), type.entryCompanion.keyType, true)
                // When `readValue` returns `null` that means the map entry's value is invalid (e.g. unknown
                // enum). In that case we skip the entire map entry.
                readValue(v, type.entryCompanion.valueType)?.let { entryValue ->
                    @Suppress("UNCHECKED_CAST")
                    MessageMap.Entry(
                        entryKey,
                        entryValue,
                        type.entryCompanion as MessageMap.Entry.Companion<Any?, Any?>
                    )
                }
            }
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("map field did not contain a valid object", e)
    }

    fun readStruct(value: JsonElement): Struct = try {
        val fields = readMap(value, Struct.descriptor.fields.first().type as FieldDescriptor.Type.Map<*, *>)
        @Suppress("UNCHECKED_CAST")
        Struct(MessageMap(fields.toSet() as Set<MessageMap.Entry<String, Value?>>))
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("struct field did not contain a valid object", e)
    }

    fun readDynamicValue(value: JsonElement): Value = when (value) {
        is JsonNull -> Value(kind = Value.Kind.NullValue())
        is JsonLiteral -> runCatching { Value(kind = Value.Kind.StringValue(readString(value))) }
            .recoverCatching { Value(kind = Value.Kind.NumberValue(readDouble(value))) }
            .recoverCatching { Value(kind = Value.Kind.BoolValue(readBool(value))) }
            .getOrElse { throw InvalidProtocolBufferException("dynamically typed value did not contain a valid primitive object") }
        is JsonArray -> Value(
            kind = Value.Kind.ListValue(
                readValue(value, FieldDescriptor.Type.Message(ListValue.Companion)) as ListValue
            )
        )
        is JsonObject -> Value(
            kind = Value.Kind.StructValue(
                readValue(value, FieldDescriptor.Type.Message(Struct.Companion)) as Struct
            )
        )
    }

    fun readDynamicListValue(value: JsonElement): ListValue = try {
        @Suppress("UNCHECKED_CAST")
        val values = readValue(value, ListValue.descriptor.fields.first().type) as Sequence<Value>
        ListValue(values.toList())
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("dynamically typed list value did not contain a valid object", e)
    }

    companion object {
        private const val FLOAT_MIN_POSITIVE = 1.175494e-38f
        private const val FLOAT_MAX_POSITIVE = 3.4028235e+38f
        private const val FLOAT_MIN_NEGATIVE = -3.402823e+38f
        private const val FLOAT_MAX_NEGATIVE = -1.175494e-38f
        private const val DOUBLE_MIN_POSITIVE = 2.22507e-308
        private const val DOUBLE_MAX_POSITIVE = 1.79769e+308
        private const val DOUBLE_MIN_NEGATIVE = -1.79769e+308
        private const val DOUBLE_MAX_NEGATIVE = -2.22507e-308

        private val NUMBER_TRAILING_ZEROES = """\.0+$""".toRegex()
        private val NUMBER_SCIENTIFIC_NOTATION = """-?(?:\d+)(\.\d+?)?0*[eE](\d+)$""".toRegex()
    }
}
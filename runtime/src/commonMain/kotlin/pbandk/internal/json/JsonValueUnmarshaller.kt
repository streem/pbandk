package pbandk.internal.json

import kotlinx.serialization.json.*
import pbandk.*
import pbandk.internal.Util
import pbandk.json.JsonConfig
import pbandk.wkt.*
import kotlin.Any

internal class JsonValueUnmarshaller(private val jsonConfig: JsonConfig) {
    fun readValue(value: JsonElement, type: FieldDescriptor.Type): Any = when (type) {
        is FieldDescriptor.Type.Primitive.Double -> readDouble(value)
        is FieldDescriptor.Type.Primitive.Float -> readFloat(value)
        is FieldDescriptor.Type.Primitive.Int64 -> readNumber64(value)
        is FieldDescriptor.Type.Primitive.UInt64 -> readNumber64(value)
        is FieldDescriptor.Type.Primitive.Int32 -> readNumber32(value)
        is FieldDescriptor.Type.Primitive.Fixed64 -> readNumber64(value)
        is FieldDescriptor.Type.Primitive.Fixed32 -> readNumber32(value)
        is FieldDescriptor.Type.Primitive.Bool -> readBool(value)
        is FieldDescriptor.Type.Primitive.String -> readString(value)
        is FieldDescriptor.Type.Primitive.Bytes -> readBytes(value)
        is FieldDescriptor.Type.Primitive.UInt32 -> readNumber32(value)
        is FieldDescriptor.Type.Primitive.SFixed32 -> readNumber32(value)
        is FieldDescriptor.Type.Primitive.SFixed64 -> readNumber64(value)
        is FieldDescriptor.Type.Primitive.SInt32 -> readNumber32(value)
        is FieldDescriptor.Type.Primitive.SInt64 -> readNumber64(value)
        is FieldDescriptor.Type.Message<*> -> when (type.messageCompanion) {
            // Wrapper types use the same JSON representation as the wrapped value
            // https://developers.google.com/protocol-buffers/docs/proto3#json
            DoubleValue -> readDouble(value)
            FloatValue -> readFloat(value)
            Int64Value -> readNumber64(value)
            UInt64Value -> readNumber64(value)
            Int32Value -> readNumber32(value)
            UInt32Value -> readNumber32(value)
            BoolValue -> readBool(value)
            StringValue -> readString(value)
            BytesValue -> readBytes(value)
            // Other well-known types with special JSON encoding
            Timestamp -> Util.stringToTimestamp(readString(value))
            // All other message types
            else -> readMessage(value, type.messageCompanion)
        }
        is FieldDescriptor.Type.Enum<*> -> readEnum(value, type.enumCompanion)
        is FieldDescriptor.Type.Repeated<*> -> readRepeated(value, type.valueType)
        is FieldDescriptor.Type.Map<*, *> -> readMap(value, type)
    }


    fun readNumber32(value: JsonElement): Int = try {
        value.int
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("field did not contain a number in JSON", e)
    }

    fun readNumber64(value: JsonElement): Long = try {
        value.long
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("field did not contain a number in JSON", e)
    }

    fun readBool(value: JsonElement): Boolean = try {
        value.boolean
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("bool field did not contain a boolean value in JSON", e)
    }

    fun readEnum(value: JsonElement, enumCompanion: Message.Enum.Companion<*>): Message.Enum = try {
        val p = value.primitive
        p.intOrNull?.let { enumCompanion.fromValue(it) }
            ?: enumCompanion.fromName(p.content)
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("enum field did not contain a number or valid enum value", e)
    }

    fun readFloat(value: JsonElement): Float = try {
        // TODO handle Inf and NaN
        value.float
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("float field did not contain a float value in JSON", e)
    }

    fun readDouble(value: JsonElement): Double = try {
        // TODO handle Inf and NaN
        value.double
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("double field did not contain a double value in JSON", e)
    }

    fun readString(value: JsonElement): String = try {
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
        messageCompanion.unmarshal(JsonMessageUnmarshaller(value, jsonConfig))
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("message field did not contain a valid message", e)
    }

    fun readRepeated(value: JsonElement, valueType: FieldDescriptor.Type): Sequence<*> = try {
        value.jsonArray.asSequence().map { readValue(it, valueType) }
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
            .map { (k, v) ->
                @Suppress("UNCHECKED_CAST")
                (MessageMap.Entry(
                    readValue(JsonLiteral(k), type.entryCompanion.keyType),
                    readValue(v, type.entryCompanion.valueType),
                    type.entryCompanion as MessageMap.Entry.Companion<Any?, Any?>
                ))
            }
    } catch (e: InvalidProtocolBufferException) {
        throw e
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("map field did not contain a valid object", e)
    }
}
package pbandk.internal.json

import kotlinx.serialization.json.*
import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.internal.Util
import pbandk.json.JsonConfig
import pbandk.wkt.*
import kotlin.Any

internal class JsonValueMarshaller(private val jsonConfig: JsonConfig) {
    fun writeValue(value: Any, type: FieldDescriptor.Type): JsonElement = when (type) {
        is FieldDescriptor.Type.Primitive.Double -> writeDouble(value as Double)
        is FieldDescriptor.Type.Primitive.Float -> writeFloat(value as Float)
        is FieldDescriptor.Type.Primitive.Int64 -> writeNumber64(value as Long)
        is FieldDescriptor.Type.Primitive.UInt64 -> writeNumber64(value as Long)
        is FieldDescriptor.Type.Primitive.Int32 -> writeNumber32(value as Int)
        is FieldDescriptor.Type.Primitive.Fixed64 -> writeNumber64(value as Long)
        is FieldDescriptor.Type.Primitive.Fixed32 -> writeNumber32(value as Int)
        is FieldDescriptor.Type.Primitive.Bool -> writeBool(value as Boolean)
        is FieldDescriptor.Type.Primitive.String -> writeString(value as String)
        is FieldDescriptor.Type.Primitive.Bytes -> writeBytes(value as ByteArr)
        is FieldDescriptor.Type.Primitive.UInt32 -> writeNumber32(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed32 -> writeNumber32(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed64 -> writeNumber64(value as Long)
        is FieldDescriptor.Type.Primitive.SInt32 -> writeNumber32(value as Int)
        is FieldDescriptor.Type.Primitive.SInt64 -> writeNumber64(value as Long)
        is FieldDescriptor.Type.Message<*> -> when (type.messageCompanion) {
            // Wrapper types use the same JSON representation as the wrapped value
            // https://developers.google.com/protocol-buffers/docs/proto3#json
            DoubleValue -> writeDouble(value as Double)
            FloatValue -> writeFloat(value as Float)
            Int64Value -> writeNumber64(value as Long)
            UInt64Value -> writeNumber64(value as Long)
            Int32Value -> writeNumber32(value as Int)
            UInt32Value -> writeNumber32(value as Int)
            BoolValue -> writeBool(value as Boolean)
            StringValue -> writeString(value as String)
            BytesValue -> writeBytes(value as ByteArr)
            // Other well-known types with special JSON encoding
            Timestamp -> writeString(
                Util.timestampToString(
                    value as Timestamp
                )
            )
            // All other message types
            else -> writeMessage(value as Message)
        }
        is FieldDescriptor.Type.Enum<*> -> writeEnum(value as Message.Enum)
        is FieldDescriptor.Type.Repeated<*> -> writeRepeated(value as List<*>, type.valueType)
        is FieldDescriptor.Type.Map<*, *> -> writeMap(
            value as Map<*, *>,
            type.entryCompanion.keyType,
            type.entryCompanion.valueType
        )
    }

    fun writeNumber32(value: Int): JsonElement =
        JsonLiteral(value)

    fun writeNumber64(value: Long): JsonElement =
        JsonLiteral(value.toString())

    fun writeBool(value: Boolean): JsonElement =
        JsonLiteral(value)

    fun writeEnum(value: Message.Enum): JsonElement =
        JsonPrimitive(value.name)

    fun writeFloat(value: Float): JsonElement =
        if (value.isFinite()) JsonLiteral(value) else JsonLiteral(
            value.toString()
        )

    fun writeDouble(value: Double): JsonElement =
        if (value.isFinite()) JsonLiteral(value) else JsonLiteral(
            value.toString()
        )

    fun writeString(value: String): JsonElement =
        JsonLiteral(value)

    fun writeBytes(value: ByteArr): JsonElement =
        JsonLiteral(Util.bytesToBase64(value.array))

    fun writeMessage(value: Message): JsonElement =
        JsonMessageMarshaller(jsonConfig).also { it.writeMessage(value) }.toJsonElement()

    fun writeRepeated(list: List<*>, valueType: FieldDescriptor.Type): JsonElement =
        jsonArray {
            for (v in list) {
                if (v == null) continue
                +writeValue(v, valueType)
            }
        }

    fun writeMap(
        map: Map<*, *>,
        keyType: FieldDescriptor.Type,
        valueType: FieldDescriptor.Type
    ): JsonElement = json {
        for ((k, v) in map) {
            if (k == null || v == null) continue
            writeValue(k, keyType).content to writeValue(v, valueType)
        }
    }
}
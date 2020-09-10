package pbandk.internal.json

import kotlinx.serialization.json.*
import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.internal.Util
import pbandk.json.JsonConfig
import pbandk.wkt.*
import kotlin.Any

@OptIn(ExperimentalUnsignedTypes::class)
internal class JsonValueEncoder(private val jsonConfig: JsonConfig) {
    fun writeValue(value: Any, type: FieldDescriptor.Type): JsonElement = when (type) {
        is FieldDescriptor.Type.Primitive.Double -> writeDouble(value as Double)
        is FieldDescriptor.Type.Primitive.Float -> writeFloat(value as Float)
        is FieldDescriptor.Type.Primitive.Int64 -> writeInteger64(value as Long)
        is FieldDescriptor.Type.Primitive.UInt64 -> writeUnsignedInteger64(value as Long)
        is FieldDescriptor.Type.Primitive.Int32 -> writeInteger32(value as Int)
        is FieldDescriptor.Type.Primitive.Fixed64 -> writeUnsignedInteger64(value as Long)
        is FieldDescriptor.Type.Primitive.Fixed32 -> writeUnsignedInteger32(value as Int)
        is FieldDescriptor.Type.Primitive.Bool -> writeBool(value as Boolean)
        is FieldDescriptor.Type.Primitive.String -> writeString(value as String)
        is FieldDescriptor.Type.Primitive.Bytes -> writeBytes(value as ByteArr)
        is FieldDescriptor.Type.Primitive.UInt32 -> writeUnsignedInteger32(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed32 -> writeInteger32(value as Int)
        is FieldDescriptor.Type.Primitive.SFixed64 -> writeInteger64(value as Long)
        is FieldDescriptor.Type.Primitive.SInt32 -> writeInteger32(value as Int)
        is FieldDescriptor.Type.Primitive.SInt64 -> writeInteger64(value as Long)
        is FieldDescriptor.Type.Message<*> -> when (type.messageCompanion) {
            // The only messages that need to be special-cased here are messages that use a non-[Message] type in
            // Kotlin. For example, the [DoubleValue] message is represented in Kotlin as a [Double] type. All other
            // messages, those have a special JSON encoding but are represented in Kotlin using their normal [Message]
            // type (e.g. the [Timestamp] message), only need to be special-cased in
            // [JsonMessageEncoder.writeMessage]. The `else` clause below will end up calling the code in
            // [JsonMessageEncoder.writeMessage].
            DoubleValue -> writeDouble(value as Double)
            FloatValue -> writeFloat(value as Float)
            Int64Value -> writeInteger64(value as Long)
            UInt64Value -> writeUnsignedInteger64(value as Long)
            Int32Value -> writeInteger32(value as Int)
            UInt32Value -> writeUnsignedInteger32(value as Int)
            BoolValue -> writeBool(value as Boolean)
            StringValue -> writeString(value as String)
            BytesValue -> writeBytes(value as ByteArr)
            // All other message types
            else -> writeMessage(value as Message)
        }
        is FieldDescriptor.Type.Enum<*> -> when (type.enumCompanion) {
            is NullValue -> JsonNull
            else -> writeEnum(value as Message.Enum)
        }
        is FieldDescriptor.Type.Repeated<*> -> writeRepeated(value as List<*>, type.valueType)
        is FieldDescriptor.Type.Map<*, *> -> writeMap(
            value as Map<*, *>,
            type.entryCompanion.keyType,
            type.entryCompanion.valueType
        )
    }

    fun writeInteger32(value: Int): JsonElement =
        JsonLiteral(value)

    fun writeInteger64(value: Long): JsonElement =
        JsonLiteral(value.toString())

    // XXX: [JsonLiteral] does not support unsigned number types currently (they do not inherit from [Number]
    // because of limitations with Kotlin inline classes). To work around this, output unsigned integers that are
    // outside of the range of signed integers as strings rather than numeric literals. While the Proto3 JSON spec
    // does say that these should be output as numeric literals, it also requires conforming implementations to
    // accept numeric strings when parsing the JSON.
    fun writeUnsignedInteger32(value: Int): JsonElement =
        if (value < 0) JsonLiteral(value.toUInt().toString()) else JsonLiteral(value)

    fun writeUnsignedInteger64(value: Long): JsonElement =
        JsonLiteral(value.toULong().toString())

    fun writeBool(value: Boolean): JsonElement =
        JsonLiteral(value)

    fun writeEnum(value: Message.Enum): JsonElement =
        // Unrecognized enum values must be serialized as their numeric value
        value.name?.let { JsonPrimitive(it) } ?: JsonPrimitive(value.value)

    fun writeFloat(value: Float): JsonElement =
        if (value.isFinite()) JsonLiteral(value) else JsonLiteral(value.toString())

    fun writeDouble(value: Double): JsonElement =
        if (value.isFinite()) JsonLiteral(value) else JsonLiteral(value.toString())

    fun writeString(value: String): JsonElement =
        JsonLiteral(value)

    fun writeBytes(value: ByteArr): JsonElement =
        JsonLiteral(Util.bytesToBase64(value.array))

    fun writeMessage(value: Message): JsonElement =
        JsonMessageEncoder(jsonConfig).also { it.writeMessage(value) }.toJsonElement()

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

    fun writeDynamicValue(value: Value): JsonElement = when (value.kind) {
        is Value.Kind.StringValue -> writeString(value.kind.value)
        is Value.Kind.BoolValue -> writeBool(value.kind.value)
        is Value.Kind.NumberValue -> writeDouble(value.kind.value)
        is Value.Kind.StructValue -> writeValue(value.kind.value.fields, Struct.descriptor.fields.first().type)
        is Value.Kind.ListValue -> writeValue(value.kind.value.values, ListValue.descriptor.fields.first().type)
        is Value.Kind.NullValue, null -> JsonNull
    }
}
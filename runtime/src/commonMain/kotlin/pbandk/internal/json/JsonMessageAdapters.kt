package pbandk.internal.json

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import pbandk.FieldDescriptor
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.MessageMap
import pbandk.getTypeNameFromTypeUrl
import pbandk.getTypePrefixFromTypeUrl
import pbandk.getTypeUrl
import pbandk.internal.Util
import pbandk.pack
import pbandk.unpack
import pbandk.wkt.Any
import pbandk.wkt.BoolValue
import pbandk.wkt.BytesValue
import pbandk.wkt.DoubleValue
import pbandk.wkt.Duration
import pbandk.wkt.FloatValue
import pbandk.wkt.Int32Value
import pbandk.wkt.Int64Value
import pbandk.wkt.ListValue
import pbandk.wkt.NullValue
import pbandk.wkt.StringValue
import pbandk.wkt.Struct
import pbandk.wkt.Timestamp
import pbandk.wkt.UInt32Value
import pbandk.wkt.UInt64Value
import pbandk.wkt.Value
import pbandk.wkt.boolValue
import pbandk.wkt.bytesValue
import pbandk.wkt.doubleValue
import pbandk.wkt.floatValue
import pbandk.wkt.int32Value
import pbandk.wkt.int64Value
import pbandk.wkt.listValue
import pbandk.wkt.stringValue
import pbandk.wkt.struct
import pbandk.wkt.uInt32Value
import pbandk.wkt.uInt64Value
import pbandk.wkt.value

internal interface JsonMessageAdapter<T : Message> {
    fun encode(message: T, jsonValueEncoder: JsonValueEncoder): JsonElement
    fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder): T
}

internal object JsonMessageAdapters {
    private val adapters = mapOf(
        // Wrapper types use the same JSON representation as the wrapped value
        // https://developers.google.com/protocol-buffers/docs/proto3#json

        DoubleValue.descriptor to object : JsonMessageAdapter<DoubleValue> {
            private val fieldType = DoubleValue.descriptor.fields.first().type

            override fun encode(message: DoubleValue, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = doubleValue {
                value = jsonValueDecoder.readDouble(json)
            }
        },

        FloatValue.descriptor to object : JsonMessageAdapter<FloatValue> {
            private val fieldType = FloatValue.descriptor.fields.first().type

            override fun encode(message: FloatValue, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = floatValue {
                value = jsonValueDecoder.readFloat(json)
            }
        },

        Int64Value.descriptor to object : JsonMessageAdapter<Int64Value> {
            private val fieldType = Int64Value.descriptor.fields.first().type

            override fun encode(message: Int64Value, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = int64Value {
                value = jsonValueDecoder.readInteger64(json)
            }
        },

        UInt64Value.descriptor to object : JsonMessageAdapter<UInt64Value> {
            private val fieldType = UInt64Value.descriptor.fields.first().type

            override fun encode(message: UInt64Value, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = uInt64Value {
                value = jsonValueDecoder.readUnsignedInteger64(json)
            }
        },

        Int32Value.descriptor to object : JsonMessageAdapter<Int32Value> {
            private val fieldType = Int32Value.descriptor.fields.first().type

            override fun encode(message: Int32Value, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = int32Value {
                value = jsonValueDecoder.readInteger32(json)
            }
        },

        UInt32Value.descriptor to object : JsonMessageAdapter<UInt32Value> {
            private val fieldType = UInt32Value.descriptor.fields.first().type

            override fun encode(message: UInt32Value, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = uInt32Value {
                jsonValueDecoder.readUnsignedInteger32(json)
            }
        },

        BoolValue.descriptor to object : JsonMessageAdapter<BoolValue> {
            private val fieldType = BoolValue.descriptor.fields.first().type

            override fun encode(message: BoolValue, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = boolValue {
                value = jsonValueDecoder.readBool(json)
            }
        },

        StringValue.descriptor to object : JsonMessageAdapter<StringValue> {
            private val fieldType = StringValue.descriptor.fields.first().type

            override fun encode(message: StringValue, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = stringValue {
                value = jsonValueDecoder.readString(json)
            }
        },

        BytesValue.descriptor to object : JsonMessageAdapter<BytesValue> {
            private val fieldType = BytesValue.descriptor.fields.first().type

            override fun encode(message: BytesValue, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.value, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = bytesValue {
                value = jsonValueDecoder.readBytes(json)
            }
        },

        // Other well-known types with special JSON encoding

        Any.descriptor to object : JsonMessageAdapter<Any> {
            override fun encode(message: Any, jsonValueEncoder: JsonValueEncoder): JsonElement {
                val companion = jsonValueEncoder.jsonConfig.typeRegistry.getTypeUrl(message.typeUrl)?.messageCompanion
                    ?: throw InvalidProtocolBufferException("Type URL not found in type registry: ${message.typeUrl}")
                val unpackedMessage = message.unpack(companion)
                val messageAdapter = getAdapter(unpackedMessage)
                val jsonContent = if (messageAdapter != null) {
                    mapOf("value" to messageAdapter.encode(unpackedMessage, jsonValueEncoder))
                } else {
                    jsonValueEncoder.writeMessage(unpackedMessage).jsonObject
                }
                return JsonObject(jsonContent + ("@type" to JsonPrimitive(message.typeUrl)))

            }

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder): Any {
                val content = json.jsonObject

                val typeUrl = content["@type"]?.jsonPrimitive?.takeIf { it.isString }?.content
                    ?: throw InvalidProtocolBufferException("'@type' field not found in google.protobuf.Any message")

                val companion = jsonValueDecoder.jsonConfig.typeRegistry.getTypeUrl(typeUrl)?.messageCompanion
                    ?: throw InvalidProtocolBufferException("Type URL not found in type registry: $typeUrl")
                val messageAdapter = getAdapter(companion)
                val message = if (messageAdapter != null) {
                    val jsonValue = content["value"] ?: throw InvalidProtocolBufferException(
                        "'value' field not found in google.protobuf.Any message containing a '${
                            getTypeNameFromTypeUrl(typeUrl)
                        }' message"
                    )
                    messageAdapter.decode(jsonValue, jsonValueDecoder)
                } else {
                    jsonValueDecoder.readMessage(JsonObject(content - "@type"), companion)
                }
                return if ('/' in typeUrl) {
                    Any.pack(message, getTypePrefixFromTypeUrl(typeUrl))
                } else {
                    Any.pack(message)
                }
            }
        },

        Duration.descriptor to object : JsonMessageAdapter<Duration> {
            override fun encode(message: Duration, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeString(Util.durationToString(message))

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) =
                Util.stringToDuration(jsonValueDecoder.readString(json))
        },

        ListValue.descriptor to object : JsonMessageAdapter<ListValue> {
            private val fieldType = FieldDescriptor.Type.Message(Value.Companion)
            override fun encode(message: ListValue, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeRepeated(message.values, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = try {
                @Suppress("UNCHECKED_CAST")
                val values = jsonValueDecoder.readValue(
                    json,
                    ListValue.descriptor.fields.first().type
                ) as Sequence<Value>
                listValue {
                    this.values = values.toList()
                }
            } catch (e: InvalidProtocolBufferException) {
                throw e
            } catch (e: Exception) {
                throw InvalidProtocolBufferException("dynamically typed list value did not contain a valid object", e)
            }
        },

        Struct.descriptor to object : JsonMessageAdapter<Struct> {
            private val fieldType = Struct.descriptor.fields.first().type

            override fun encode(message: Struct, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeValue(message.fields, fieldType)

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = try {
                val fields = jsonValueDecoder.readMap(
                    json,
                    Struct.descriptor.fields.first().type as FieldDescriptor.Type.Map<*, *>
                )
                @Suppress("UNCHECKED_CAST")
                struct {
                    this.fields = MessageMap(fields.toSet() as Set<MessageMap.Entry<String, Value?>>)
                }
            } catch (e: InvalidProtocolBufferException) {
                throw e
            } catch (e: Exception) {
                throw InvalidProtocolBufferException("struct field did not contain a valid object", e)
            }
        },

        Timestamp.descriptor to object : JsonMessageAdapter<Timestamp> {
            override fun encode(message: Timestamp, jsonValueEncoder: JsonValueEncoder) =
                jsonValueEncoder.writeString(Util.timestampToString(message))

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) =
                Util.stringToTimestamp(jsonValueDecoder.readString(json))
        },

        Value.descriptor to object : JsonMessageAdapter<Value> {
            override fun encode(message: Value, jsonValueEncoder: JsonValueEncoder) = when (val kind = message.kind) {
                is Value.Kind.StringValue -> jsonValueEncoder.writeString(kind.value)
                is Value.Kind.BoolValue -> jsonValueEncoder.writeBool(kind.value)
                is Value.Kind.NumberValue -> jsonValueEncoder.writeDouble(kind.value)
                is Value.Kind.StructValue -> jsonValueEncoder.writeValue(
                    kind.value.fields,
                    Struct.descriptor.fields.first().type
                )
                is Value.Kind.ListValue -> jsonValueEncoder.writeValue(
                    kind.value.values,
                    ListValue.descriptor.fields.first().type
                )
                is Value.Kind.NullValue, null -> JsonNull
            }

            override fun decode(json: JsonElement, jsonValueDecoder: JsonValueDecoder) = when (json) {
                is JsonNull -> value { nullValue = NullValue.NULL_VALUE }
                is JsonPrimitive -> runCatching { value { stringValue = jsonValueDecoder.readString(json) } }
                    .recoverCatching { value { numberValue = jsonValueDecoder.readDouble(json) } }
                    .recoverCatching { value { boolValue = jsonValueDecoder.readBool(json) } }
                    .getOrElse {
                        throw InvalidProtocolBufferException(
                            "dynamically typed value did not contain a valid primitive object"
                        )
                    }
                is JsonArray -> value {
                    listValue =
                        jsonValueDecoder.readValue(json, FieldDescriptor.Type.Message(ListValue.Companion)) as ListValue
                }
                is JsonObject -> value {
                    structValue =
                        jsonValueDecoder.readValue(json, FieldDescriptor.Type.Message(Struct.Companion)) as Struct
                }
            }
        },
    )

    fun <T : Message> getAdapter(message: T): JsonMessageAdapter<T>? {
        @Suppress("UNCHECKED_CAST")
        return adapters[message.descriptor] as? JsonMessageAdapter<T>
    }

    fun <T : Message> getAdapter(messageCompanion: Message.Companion<T>): JsonMessageAdapter<T>? {
        @Suppress("UNCHECKED_CAST")
        return adapters[messageCompanion.descriptor] as? JsonMessageAdapter<T>
    }
}

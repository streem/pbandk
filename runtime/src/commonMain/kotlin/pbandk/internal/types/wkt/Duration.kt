package pbandk.internal.types.wkt

import pbandk.InvalidProtocolBufferException
import pbandk.internal.Util
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.tryDecodeField
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.wkt.Duration
import kotlin.time.ExperimentalTime

@OptIn(ExperimentalTime::class)
internal object DurationNew : WktValueType<kotlin.time.Duration, Duration> {
    private val secondsField = Duration.FieldDescriptors.seconds
    private val nanosField = Duration.FieldDescriptors.nanos

    override val defaultValue = kotlin.time.Duration.ZERO

    override fun isDefaultValue(value: kotlin.time.Duration) = false

    // Both fields of `google.protobuf.Duration` are scalar types, so the result of merging two `Duration` messages will
    // be equal to the contents of the second message as long as it's non-null.
    override fun mergeValues(currentValue: kotlin.time.Duration, newValue: kotlin.time.Duration) = newValue

    override val binaryWireType = WireType.LENGTH_DELIMITED

    override fun binarySize(value: kotlin.time.Duration): Int {
        return value.toComponents { seconds, nanoseconds ->
            secondsField.fieldType.binarySize(secondsField.metadata, seconds) +
                    nanosField.fieldType.binarySize(nanosField.metadata, nanoseconds)
        }
    }

    override fun encodeToBinary(value: kotlin.time.Duration, encoder: BinaryFieldValueEncoder) {
        value.toComponents { seconds, nanoseconds ->
            encoder.encodeLenFields(binarySize(value)) { fieldEncoder ->
                secondsField.fieldType.encodeToBinary(secondsField.metadata, seconds, fieldEncoder)
                nanosField.fieldType.encodeToBinary(nanosField.metadata, nanoseconds, fieldEncoder)
            }
        }
    }

    override fun decodeFromBinary(decoder: BinaryFieldValueDecoder): kotlin.time.Duration {
        return decoder.decodeLenFields { fieldDecoder ->
            var seconds = 0L
            var nanoseconds = 0

            do {
                val fieldFound = fieldDecoder.decodeField { tag, valueDecoder ->
                    when {
                        valueDecoder.tryDecodeField(secondsField, tag) { seconds = it } -> {}
                        valueDecoder.tryDecodeField(nanosField, tag) { nanoseconds = it } -> {}
                        else -> valueDecoder.skipField(tag)
                    }
                }
            } while (fieldFound)

            kotlin.time.Duration.seconds(seconds)
                .plus(kotlin.time.Duration.nanoseconds(nanoseconds))
        }
    }

    override fun encodeToJson(value: kotlin.time.Duration, encoder: JsonFieldValueEncoder) {
        value.toComponents { seconds, nanoseconds ->
            encoder.encodeString(Util.durationToString(Duration {
                this.seconds = seconds
                this.nanos = nanoseconds
            }))
        }
    }

    override fun encodeMessageToJson(message: Duration, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(Util.durationToString(message))
    }

    override fun encodeToJsonMapKey(value: kotlin.time.Duration) =
        throw UnsupportedOperationException("google.protobuf.Duration cannot be used as a map key")

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): kotlin.time.Duration {
        if (decoder !is JsonFieldValueDecoder.String) {
            throw InvalidProtocolBufferException("Unexpected JSON type for google.protobuf.Duration value: ${decoder.wireType.name}")
        }
        val wktDuration = Util.stringToDuration(decoder.decodeAsString())
        return kotlin.time.Duration.seconds(wktDuration.seconds)
            .plus(kotlin.time.Duration.nanoseconds(wktDuration.nanos))
    }

    override fun decodeMessageFromJson(decoder: JsonFieldValueDecoder): Duration {
        if (decoder !is JsonFieldValueDecoder.String) {
            throw InvalidProtocolBufferException("Unexpected JSON type for google.protobuf.Duration value: ${decoder.wireType.name}")
        }
        return Util.stringToDuration(decoder.decodeAsString())
    }

    override fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String) =
        throw UnsupportedOperationException("google.protobuf.Duration cannot be used as a map key")
}

internal object Duration : WktMessageValueType<Duration>(Duration) {
    override fun encodeToJson(value: Duration, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(Util.durationToString(value))
    }

    override fun decodeFromJson(decoder: JsonFieldValueDecoder): Duration {
        if (decoder !is JsonFieldValueDecoder.String) {
            throw InvalidProtocolBufferException("Unexpected JSON type for google.protobuf.Duration value: ${decoder.wireType.name}")
        }
        return Util.stringToDuration(decoder.decodeAsString())
    }
}
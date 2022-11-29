package pbandk.internal.types.wkt

import pbandk.internal.Util
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.types.primitive.Message
import pbandk.wkt.Duration
import kotlin.time.ExperimentalTime

@OptIn(ExperimentalTime::class)
internal object DurationNew : WktValueType<kotlin.time.Duration, Duration> {
    private val secondsField = Duration.FieldDescriptors.seconds
    private val nanosField = Duration.FieldDescriptors.nanos

    override fun isDefaultValue(value: kotlin.time.Duration) = false

    override val binaryWireType = Message.binaryWireType

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
}

internal object Duration : WktMessageValueType<Duration>() {
    override fun encodeToJson(value: Duration, encoder: JsonFieldValueEncoder) {
        encoder.encodeString(Util.durationToString(value))
    }
}
package pbandk.internal.json

import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.double
import kotlin.jvm.JvmInline

internal enum class JsonWireType {
    Number,
    String,
    Boolean,
    Null,
    Object,
    Array
}

internal sealed interface WireValue {
    val wireType: JsonWireType

    @JvmInline
    value class Number internal constructor(internal val value: JsonPrimitive) : WireValue {
        override val wireType: JsonWireType get() = JsonWireType.Number

        val decodeDouble: Double get() {
            val doubleValue = value.double
            if (!doubleValue.isFinite()) {
                throw NumberFormatException("value out of bounds")
            }
            if (doubleValue > 0.0 && doubleValue !in DOUBLE_MIN_POSITIVE..DOUBLE_MAX_POSITIVE) {
                throw NumberFormatException("value out of bounds")
            }
            if (doubleValue < 0.0 && doubleValue !in DOUBLE_MIN_NEGATIVE..DOUBLE_MAX_NEGATIVE) {
                throw NumberFormatException("value out of bounds")
            }
            return doubleValue
        }

        companion object {
            private const val DOUBLE_MIN_POSITIVE = 2.22507e-308
            private const val DOUBLE_MAX_POSITIVE = 1.79769e+308
            private const val DOUBLE_MIN_NEGATIVE = -1.79769e+308
            private const val DOUBLE_MAX_NEGATIVE = -2.22507e-308

            fun encodeDouble(value: Double): Number {
                require(value.isFinite()) { "non-finite values can't be encoded as JSON numbers" }
                return Number(JsonPrimitive(value))
            }

            fun encodeFloat(value: Float): Number {
                require(value.isFinite()) { "non-finite values can't be encoded as JSON numbers" }
                return Number(JsonPrimitive(value))
            }
        }
    }

    @JvmInline
    value class String internal constructor(internal val value: JsonPrimitive) : WireValue {
        override val wireType: JsonWireType get() = JsonWireType.String

        val decodeDouble: Double get() = when (value.content) {
            "Infinity" -> Double.POSITIVE_INFINITY
            "-Infinity" -> Double.NEGATIVE_INFINITY
            "NaN" -> Double.NaN
            else -> value.double
        }

        companion object {
            fun encodeDouble(value: Double) = String(JsonPrimitive(value.toString()))
        }
    }

    @JvmInline
    value class Boolean internal constructor(internal val value: kotlin.Boolean) {

    }
}
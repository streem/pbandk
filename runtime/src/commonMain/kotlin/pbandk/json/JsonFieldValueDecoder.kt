package pbandk.json

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import pbandk.InvalidProtocolBufferException
import pbandk.PublicForGeneratedCode
import pbandk.internal.Util
import pbandk.internal.json.JsonFieldDecoder
import pbandk.internal.json.JsonWireType

private const val FLOAT_MIN_POSITIVE = 1.175494e-38f
private const val FLOAT_MAX_POSITIVE = 3.4028235e+38f
private const val FLOAT_MIN_NEGATIVE = -3.402823e+38f
private const val FLOAT_MAX_NEGATIVE = -1.175494e-38f
private const val DOUBLE_MIN_POSITIVE = 2.22507e-308
private const val DOUBLE_MAX_POSITIVE = 1.79769e+308
private const val DOUBLE_MIN_NEGATIVE = -1.79769e+308
private const val DOUBLE_MAX_NEGATIVE = -2.22507e-308

private val NUMBER_TRAILING_ZEROES = """\.0+$""".toRegex()
private val NUMBER_SCIENTIFIC_NOTATION = """-?\d+(\.\d+?)?0*[eE](\d+)$""".toRegex()

private inline fun <T> String.decodeAsIntegerType(toIntegerType: String.() -> T): T = try {
    // The protobuf conformance test suite is pretty strict about requiring parsers to reject parsable numeric
    // values that don't conform to the spec.
    when (getOrNull(0)) {
        ' ' -> throw NumberFormatException("Integers must not have preceding space")

        '+' -> throw NumberFormatException("Positive integers must not include the '+' sign")

        '-' -> if (getOrNull(1) == '0') throw NumberFormatException(
            "Negative integers with leading zeros are not allowed"
        )

        '0' -> if (length > 1) throw NumberFormatException("Integers with leading zeros are not allowed")
    }

    if (last() == ' ') {
        throw NumberFormatException("Integers must not have trailing space")
    }

    try {
        this.toIntegerType()
    } catch (e: NumberFormatException) {
        // try parsing integers having trailing zeroes or in exponent notation
        var expandedIntegerTextualContent = replace(NUMBER_TRAILING_ZEROES, "")
        NUMBER_SCIENTIFIC_NOTATION.find(expandedIntegerTextualContent)?.let {
            val mantissaFraction = it.groupValues[1].trimStart('.')
            val mantissaDigits = mantissaFraction.length
            val isMantissaFractionZero = mantissaFraction.isEmpty() || mantissaFraction.toULong() == 0UL
            val decade = it.groupValues[2].toLong()

            if (isMantissaFractionZero || decade >= mantissaDigits) {
                expandedIntegerTextualContent = expandedIntegerTextualContent.toDouble().toLong().toString()
            }
        }

        expandedIntegerTextualContent.toIntegerType()
    }
} catch (e: Exception) {
    throw InvalidProtocolBufferException("JSON value did not contain a number", e)
}

private fun String.decodeAsDouble(acceptNonFiniteValues: Boolean): Double {
    if (acceptNonFiniteValues) {
        when (this) {
            // Non-finite values encoded as strings can be returned immediately and skip the remaining
            // validation
            "Infinity" -> return Double.POSITIVE_INFINITY
            "-Infinity" -> return Double.NEGATIVE_INFINITY
            "NaN" -> return Double.NaN
        }
    }

    try {
        val doubleValue = this.toDouble()
        return when {
            !acceptNonFiniteValues && !doubleValue.isFinite() ->
                throw NumberFormatException("value out of bounds")

            // These checks are needed because the Kotlin/Javascript implementation of [String.toDouble()] can return a
            // number that is representable in Javascript but outside the range of a Kotlin `Double`. The protobuf
            // conformance tests are strict about requiring out-of-bounds values to be rejected.
            doubleValue > 0.0 && doubleValue !in DOUBLE_MIN_POSITIVE..DOUBLE_MAX_POSITIVE ->
                throw NumberFormatException("value out of bounds")

            doubleValue < 0.0 && doubleValue !in DOUBLE_MIN_NEGATIVE..DOUBLE_MAX_NEGATIVE ->
                throw NumberFormatException("value out of bounds")

            else -> doubleValue
        }
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("JSON value did not contain a double floating-point number", e)
    }
}

private fun String.decodeAsFloat(acceptNonFiniteValues: Boolean): Float {
    if (acceptNonFiniteValues) {
        when (this) {
            // Non-finite values encoded as strings can be returned immediately and skip the remaining
            // validation
            "Infinity" -> return Float.POSITIVE_INFINITY
            "-Infinity" -> return Float.NEGATIVE_INFINITY
            "NaN" -> return Float.NaN
        }
    }

    try {
        val floatValue = this.toFloat()
        return when {
            !acceptNonFiniteValues && !floatValue.isFinite() ->
                throw NumberFormatException("value out of bounds")

            // These checks are needed because the Kotlin/Javascript implementation of [String.toFloat()] can return a
            // number that is representable in Javascript but outside the range of a Kotlin `Float`. The protobuf
            // conformance tests are strict about requiring out-of-bounds values to be rejected.
            floatValue > 0.0 && floatValue !in FLOAT_MIN_POSITIVE..FLOAT_MAX_POSITIVE ->
                throw NumberFormatException("value out of bounds")

            floatValue < 0.0 && floatValue !in FLOAT_MIN_NEGATIVE..FLOAT_MAX_NEGATIVE ->
                throw NumberFormatException("value out of bounds")

            else -> floatValue
        }
    } catch (e: Exception) {
        throw InvalidProtocolBufferException("JSON value did not contain a float floating-point number", e)
    }
}

/**
 * A wrapper that abstracts the underlying JSON parser (kotlinx-serialization currently).
 *
 * The API is designed for pull-based parsing so that we can easily switch to a more efficient parser than
 * kotlinx-serialization in the future.
 *
 * This class is only concerned with representing basic JSON data types as defined in the JSON standard (i.e. booleans,
 * strings, numbers, arrays, objects, and nulls). Any rules or validation specific to protobuf's JSON serialization
 * should be done in the appropriate [ValueType] class instead of here.
 */
@PublicForGeneratedCode
public sealed class JsonFieldValueDecoder {
    internal abstract val jsonConfig: JsonConfig
    internal abstract val wireType: JsonWireType

    internal fun skipValue() {}

    @PublicForGeneratedCode
    public class Boolean internal constructor(
        override val jsonConfig: JsonConfig,
        private val value: kotlin.Boolean,
    ) : JsonFieldValueDecoder() {
        override val wireType get() = JsonWireType.Boolean

        internal fun decodeAsBoolean(): kotlin.Boolean = value
    }

    @PublicForGeneratedCode
    public class Null internal constructor(override val jsonConfig: JsonConfig) : JsonFieldValueDecoder() {
        override val wireType get() = JsonWireType.Null

        internal fun consumeNull() {}
    }

    @PublicForGeneratedCode
    public class Number internal constructor(
        override val jsonConfig: JsonConfig,
        /** `jsonValue.isString` must be `false` */
        private val jsonValue: JsonPrimitive,
    ) : JsonFieldValueDecoder() {
        override val wireType get() = JsonWireType.Number

        // TODO: check that `decodeAsIntegerType` gets inlined without boxing the primitive
        internal fun decodeAsSignedInt(): Int = jsonValue.content.decodeAsIntegerType(kotlin.String::toInt)

        internal fun decodeAsSignedLong(): Long = jsonValue.content.decodeAsIntegerType(kotlin.String::toLong)

        internal fun decodeAsUnsignedInt(): UInt = jsonValue.content.decodeAsIntegerType(kotlin.String::toUInt)

        internal fun decodeAsUnsignedLong(): ULong = jsonValue.content.decodeAsIntegerType(kotlin.String::toULong)

        internal fun decodeAsFloat(): Float = jsonValue.content.decodeAsFloat(acceptNonFiniteValues = false)

        internal fun decodeAsDouble(): Double = jsonValue.content.decodeAsDouble(acceptNonFiniteValues = false)
    }

    @PublicForGeneratedCode
    public class String internal constructor(
        override val jsonConfig: JsonConfig,
        private val value: kotlin.String,
    ) : JsonFieldValueDecoder() {
        override val wireType get() = JsonWireType.String

        internal fun decodeAsBoolean(): kotlin.Boolean = try {
            value.toBooleanStrict()
        } catch (e: Exception) {
            throw InvalidProtocolBufferException("JSON value did not contain a boolean string", e)
        }

        internal fun decodeAsString(): kotlin.String = value

        internal fun decodeAsByteArray(): ByteArray = try {
            Util.base64ToBytes(value)
        } catch (e: Exception) {
            throw InvalidProtocolBufferException("JSON value did not contain a base64-encoded string", e)
        }

        internal fun decodeAsSignedInt(): Int = value.decodeAsIntegerType(kotlin.String::toInt)

        internal fun decodeAsSignedLong(): Long = value.decodeAsIntegerType(kotlin.String::toLong)

        internal fun decodeAsUnsignedInt(): UInt = value.decodeAsIntegerType(kotlin.String::toUInt)

        internal fun decodeAsUnsignedLong(): ULong = value.decodeAsIntegerType(kotlin.String::toULong)

        internal fun decodeAsDouble(): Double = value.decodeAsDouble(acceptNonFiniteValues = true)

        internal fun decodeAsFloat(): Float = value.decodeAsFloat(acceptNonFiniteValues = true)
    }

    @PublicForGeneratedCode
    public class Array internal constructor(
        override val jsonConfig: JsonConfig,
        private val content: JsonArray,
    ) : JsonFieldValueDecoder() {
        override val wireType get() = JsonWireType.Array

        internal inline fun forEachValue(valueBlock: (JsonFieldValueDecoder) -> Unit) {
            content.forEach { valueBlock(fromJsonElement(jsonConfig, it)) }
        }
    }

    @PublicForGeneratedCode
    public class Object internal constructor(
        override val jsonConfig: JsonConfig,
        private val content: JsonObject,
    ) : JsonFieldValueDecoder() {
        override val wireType get() = JsonWireType.Object

        internal inline fun <T : Any> decodeFields(fieldsBlock: (JsonFieldDecoder) -> T): T {
            return fieldsBlock(JsonFieldDecoder(jsonConfig, content))
        }
    }

    public companion object {
        internal fun fromJsonElement(jsonConfig: JsonConfig, element: JsonElement) = when (element) {
            is JsonNull -> Null(jsonConfig)
            is JsonObject -> Object(jsonConfig, element)
            is JsonArray -> Array(jsonConfig, element)
            is JsonPrimitive -> if (element.isString) {
                String(jsonConfig, element.content)
            } else {
                // The protobuf conformance test suite is pretty strict about requiring parsers to reject any other
                // variations (such as upper-case) aside from "true" and "false"
                element.content.toBooleanStrictOrNull()?.let { Boolean(jsonConfig, it) }
                // By process of elimination, any value that is not one of the above types must be a number or
                // malformed. We assume here that the value is a number and expect that if the value is actually
                // malformed then that will be caught later by the code that tries to actually parse the number.
                // This is done to avoid the cost of parsing the value here.
                    ?: Number(jsonConfig, element)
            }
        }
    }
}
package pbandk.json

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import pbandk.PublicForGeneratedCode
import pbandk.internal.json.JsonFieldEncoder

/**
 * This class provides a method for encoding every JSON type. A specialized method is provided for every built-in
 * Kotlin type that can be used to hold one of the JSON type values.
 */
@PublicForGeneratedCode
public class JsonFieldValueEncoder internal constructor(internal val jsonConfig: JsonConfig) {
    private var element: JsonElement = JsonNull

    internal fun encodeNumberUnsignedInt(value: Int) {
        // XXX: [JsonPrimitive] does not support unsigned number types currently (they do not inherit from [Number]
        // because of limitations with Kotlin inline classes). To work around this, output unsigned integers that are
        // outside of the range of signed integers as strings rather than numeric literals. While the Proto3 JSON spec
        // does say that these should be output as numeric literals, it also requires conforming implementations to
        // accept numeric strings when parsing the JSON.
        if (value < 0) {
            encodeString(value.toUInt().toString())
        } else {
            element = JsonPrimitive(value)
        }
    }

    internal fun encodeNumberSignedInt(value: Int) {
        element = JsonPrimitive(value)
    }

    internal fun encodeNumberUnsignedLong(value: Long) {
        encodeString(value.toULong().toString())
    }

    internal fun encodeNumberSignedLong(value: Long) {
        encodeString(value.toString())
    }

    internal fun encodeNumberFloat(value: Float) {
        if (value.isFinite()) {
            element = JsonPrimitive(value)
        } else {
            encodeString(value.toString())
        }
    }

    internal fun encodeNumberDouble(value: Double) {
        if (value.isFinite()) {
            element = JsonPrimitive(value)
        } else {
            encodeString(value.toString())
        }
    }

    internal fun encodeString(value: String) {
        element = JsonPrimitive(value)
    }

    internal fun encodeBoolean(value: Boolean) {
        element = JsonPrimitive(value)
    }

    internal fun encodeNull() {
        element = JsonNull
    }

    internal inline fun <T> encodeArrayWithValues(values: Iterable<T>, valueBlock: (T, JsonFieldValueEncoder) -> Unit) {
        // Warning: we reuse the current instance of `JsonFieldValueEncoder` to avoid creating too many new objects. For
        // this to work correctly with recursive calls to `encodeArray()`, `element` must be the last thing written.
        val jsonArray = buildJsonArray {
            values.forEach {
                valueBlock(it, this@JsonFieldValueEncoder)
                if (element !is JsonNull) {
                    add(element)
                }
            }
        }
        element = jsonArray
    }

    internal inline fun encodeObject(valuesBlock: (JsonFieldEncoder) -> Unit) {
        element = JsonObject(JsonFieldEncoder(jsonConfig).also(valuesBlock).jsonContent)
    }

    internal fun getResult() = element
}
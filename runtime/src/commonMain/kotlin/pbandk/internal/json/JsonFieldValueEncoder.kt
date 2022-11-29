package pbandk.internal.json

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import pbandk.json.JsonConfig

/**
 * This class provides a method for encoding every JSON type. A specialized method is provided for every built-in
 * Kotlin type that can be used to hold one of the JSON type values.
 */
internal class JsonFieldValueEncoder(internal val jsonConfig: JsonConfig) {
    private var element: JsonElement = JsonNull

    fun encodeNumberUnsignedInt(value: Int) {
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

    fun encodeNumberSignedInt(value: Int) {
        element = JsonPrimitive(value)
    }

    fun encodeNumberUnsignedLong(value: Long) {
        encodeString(value.toULong().toString())
    }

    fun encodeNumberSignedLong(value: Long) {
        encodeString(value.toString())
    }

    fun encodeNumberFloat(value: Float) {
        if (value.isFinite()) {
            element = JsonPrimitive(value)
        } else {
            encodeString(value.toString())
        }
    }

    fun encodeNumberDouble(value: Double) {
        if (value.isFinite()) {
            element = JsonPrimitive(value)
        } else {
            encodeString(value.toString())
        }
    }

    fun encodeString(value: String) {
        element = JsonPrimitive(value)
    }

    fun encodeBoolean(value: Boolean) {
        element = JsonPrimitive(value)
    }

    fun encodeNull() {
        element = JsonNull
    }

    inline fun encodeArray(valuesBlock: (JsonFieldValueEncoder) -> Unit) {
        // Warning: we reuse the current instance of `JsonFieldValueEncoder` to avoid creating too many new objects. For
        // this to work correctly with recursive calls to `writeArray()`, `element` must be the last thing written.
        val jsonArray = buildJsonArray {
            valuesBlock(this@JsonFieldValueEncoder)
            add(element)
        }
        element = jsonArray
    }

    inline fun encodeObject(valuesBlock: (JsonFieldEncoder) -> Unit) {
        element = JsonObject(JsonFieldEncoder(jsonConfig).also(valuesBlock).jsonContent)
    }

    fun getResult() = element
}
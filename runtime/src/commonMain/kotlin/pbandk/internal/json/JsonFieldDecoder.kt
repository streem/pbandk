package pbandk.internal.json

import kotlinx.serialization.json.JsonObject
import pbandk.json.JsonConfig
import pbandk.json.JsonFieldValueDecoder

internal class JsonFieldDecoder(internal val jsonConfig: JsonConfig, private val content: JsonObject) {
    private val seenFields = mutableSetOf<String>()

    inline fun forEachField(action: (JsonFieldValueDecoder.String, JsonFieldValueDecoder) -> Unit) {
        for ((key, jsonValue) in content) {
            if (key in seenFields) continue
            action(
                JsonFieldValueDecoder.String(jsonConfig, key),
                JsonFieldValueDecoder.fromJsonElement(jsonConfig, jsonValue)
            )
        }
    }

    fun <T : Any> findField(key: String, valueBlock: (JsonFieldValueDecoder) -> T): T? {
        return content[key]?.let {
            seenFields.add(key)
            valueBlock(JsonFieldValueDecoder.fromJsonElement(jsonConfig, it))
        }
    }
}
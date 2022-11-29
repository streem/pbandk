package pbandk.internal.json

import kotlinx.serialization.json.JsonElement
import pbandk.json.JsonConfig

internal class JsonFieldEncoder(internal val jsonConfig: JsonConfig) {
    val jsonContent: MutableMap<String, JsonElement> = linkedMapOf()

    inline fun encodeField(key: String, valueBlock: (JsonFieldValueEncoder) -> Unit) {
        jsonContent[key] = JsonFieldValueEncoder(jsonConfig).also {
            valueBlock(it)
        }.getResult()
    }
}
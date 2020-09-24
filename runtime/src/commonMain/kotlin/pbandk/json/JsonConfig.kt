package pbandk.json

import pbandk.ExperimentalProtoJson
import pbandk.FieldDescriptor
import pbandk.internal.underscoreToCamelCase

@ExperimentalProtoJson
data class JsonConfig(
    /**
     * By default the JSON name of a field is the field's proto name converted to lowerCamelCase. If this option is
     * `true` then the field's proto name will be used as-is as its JSON name. Both the proto field name and the
     * converted lowerCamelCase name will be accepted during JSON parsing, regardless of what this option is set to.
     */
    val outputProtoFieldNames: Boolean = false,
    /**
     * Fields with default values are omitted by default in proto3 JSON output. If this option is `true` then fields
     * will be output with their default values.
     */
    val outputDefaultValues: Boolean = false,
    /**
     * By default the JSON output is formatted for readability: entries are indented, each entry is on a new line, etc.
     * If this option is `true` then a more compact format will be used that omits extraneous spaces and newlines.
     */
    val compactOutput: Boolean = false,
    /**
     * The JSON parser rejects unknown fields by default. If this option is `true` then unknown fields will instead be
     * ignored.
     */
    val ignoreUnknownFieldsInInput: Boolean = false
) {
    internal fun getFieldJsonName(fieldDescriptor: FieldDescriptor<*, *>): String =
        when {
            outputProtoFieldNames -> fieldDescriptor.name
            fieldDescriptor.jsonName != null -> fieldDescriptor.jsonName
            else -> fieldDescriptor.name.underscoreToCamelCase()
        }

    companion object {
        val DEFAULT = JsonConfig()
    }
}
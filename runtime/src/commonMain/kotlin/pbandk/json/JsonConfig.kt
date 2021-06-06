package pbandk.json

import pbandk.ExperimentalProtoJson
import pbandk.FieldDescriptor
import pbandk.internal.underscoreToCamelCase
import kotlin.js.JsExport

@ExperimentalProtoJson
@JsExport
data class JsonConfig(
    /**
     * By default the JSON name of a field is the field's proto name converted to lowerCamelCase. If this option is
     * `true` then the field's proto name will be used as-is as its JSON name. Both the proto field name and the
     * converted lowerCamelCase name will be accepted during JSON parsing, regardless of what this option is set to.
     */
    val outputProtoFieldNames: Boolean = false,
    /**
     * Fields with default values are omitted by default in proto3 JSON output. If this option is `true` then fields
     * will be output with their default values. See https://developers.google.com/protocol-buffers/docs/proto3#default
     * for the default value for each type. When producing JSON output, empty `bytes` fields will be output as empty
     * strings, and unset message fields will be output as `null`.
     */
    val outputDefaultValues: Boolean = false,
    /**
     * WARNING: This option should not be used. It only exists for backwards-compatibility.
     *
     * When [outputDefaultValues] is `true`, `string` fields set to their default value will normally be  output as
     * empty strings in JSON. If this option is also `true`, then these fields will instead be output as `null` values
     * in JSON. This option has no effect when [outputDefaultValues] is `false`.
     */
    @Deprecated("This option only exists for backwards-compatibility reasons. It should not be used by new code and will eventually be removed.")
    val outputDefaultStringsAsNull: Boolean = false,
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

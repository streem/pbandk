package pbandk

import kotlin.js.JsExport

@JsExport
interface ExtendableMessage : Message {
    @PublicForGeneratedCode
    val extensionFields: ExtensionFieldSet

    @PublicForGeneratedCode
    @Suppress("UNCHECKED_CAST")
    fun <M: Message, T> getExtension(fd: FieldDescriptor<M, T>): T {
        var value = extensionFields[fd.number] as? T
        if (value != null) {
            // If we've already decoded the value of the extension field, then return the cached value
            return value
        } else {
            // Try to find the extension field in the unknown fields and decode it
            value = unknownFields[fd.number]?.decodeAs(fd)
        }

        return if (value != null) {
            // We found the field and were able to decode it. Cache a copy of the decoded value and return it.
            extensionFields[fd.number] = value
            value
        } else if (!fd.type.hasPresence){
            // A value for this extension field was not provided. If the field type has a non-null default value
            // then return it.
            fd.type.defaultValue as T
        } else {
            // A value was not provided and the default value for this field type is null, so just return null.
            null as T
        }
    }
}
package pbandk

import kotlin.js.JsExport

@JsExport
public class FieldDescriptorSet<T : Message>(
    private val fields: Collection<FieldDescriptor<T, *>>
) : Collection<FieldDescriptor<T, *>> by fields {
    public operator fun get(fieldNumber: Int): FieldDescriptor<T, *>? = fields.firstOrNull { it.number == fieldNumber }
    public operator fun get(fieldName: String): FieldDescriptor<T, *>? = fields.firstOrNull { it.name == fieldName }
}
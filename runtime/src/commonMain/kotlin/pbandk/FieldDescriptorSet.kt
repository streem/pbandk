package pbandk

import kotlin.js.JsExport

@JsExport
public class FieldDescriptorSet<M : Message>(
    private val fields: Collection<FieldDescriptor<M, *>>
) : Collection<FieldDescriptor<M, *>> by fields {
    @kotlin.js.JsName("getByNumber")
    public operator fun get(fieldNumber: Int): FieldDescriptor<M, *>? = fields.firstOrNull { it.number == fieldNumber }
    @kotlin.js.JsName("getByName")
    public operator fun get(fieldName: String): FieldDescriptor<M, *>? = fields.firstOrNull { it.name == fieldName }
}
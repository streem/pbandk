package pbandk

public class FieldDescriptorSet<M : Message>(
    private val fields: Collection<FieldDescriptor<M, out Any?>>
) : Collection<FieldDescriptor<M, out Any?>> by fields {
    public operator fun get(fieldNumber: Int): FieldDescriptor<M, out Any?>? =
        fields.firstOrNull { it.number == fieldNumber }

    public operator fun get(fieldName: String): FieldDescriptor<M, out Any?>? =
        fields.firstOrNull { it.name == fieldName }
}
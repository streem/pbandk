package pbandk

import pbandk.internal.FieldIterator

public class FieldDescriptorSet<M : Message>(
    private val fields: Collection<FieldDescriptor<M, out Any?>>
) : Collection<FieldDescriptor<M, out Any?>> by fields {
    public operator fun get(fieldNumber: Int): FieldDescriptor<M, out Any?>? = fields.firstOrNull { it.number == fieldNumber }

    public operator fun get(fieldName: String): FieldDescriptor<M, out Any?>? = fields.firstOrNull { it.name == fieldName }

    internal fun iteratorFor(message: M): FieldIterator<M> = Iterator(message, fields.iterator())

    private class Iterator<M : Message>(
        private val message: M,
        private val descriptorIterator: kotlin.collections.Iterator<FieldDescriptor<M, out Any?>>
    ) : FieldIterator<M> {
        private var lastDescriptor: FieldDescriptor<M, out Any?>? = null

        override fun hasNext() = descriptorIterator.hasNext()

        override fun next() = descriptorIterator.next().also {
            lastDescriptor = it
        }

        override fun nextValue() = lastDescriptor?.let { message.getFieldValue(it) }
    }
}
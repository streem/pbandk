package pbandk

import pbandk.internal.FieldIterator
import kotlin.js.JsExport

@JsExport
public class FieldDescriptorSet<M : Message>(
    private val fields: Collection<FieldDescriptor<M, *>>
) : Collection<FieldDescriptor<M, *>> by fields {
    @kotlin.js.JsName("getByNumber")
    public operator fun get(fieldNumber: Int): FieldDescriptor<M, *>? = fields.firstOrNull { it.number == fieldNumber }

    @kotlin.js.JsName("getByName")
    public operator fun get(fieldName: String): FieldDescriptor<M, *>? = fields.firstOrNull { it.name == fieldName }

    internal fun iteratorFor(message: M): FieldIterator<M> = Iterator(message, fields.iterator())

    private class Iterator<M : Message>(
        private val message: M,
        private val descriptorIterator: kotlin.collections.Iterator<FieldDescriptor<M, *>>
    ) : FieldIterator<M> {
        private var lastDescriptor: FieldDescriptor<M, *>? = null

        override fun hasNext() = descriptorIterator.hasNext()

        override fun next() = descriptorIterator.next().also {
            lastDescriptor = it
        }

        override fun nextValue() = lastDescriptor?.getValue?.invoke(message)
    }
}
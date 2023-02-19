package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MutableMessage
import pbandk.OneofDescriptor
import pbandk.PublicForGeneratedCode
import pbandk.internal.fieldIterator
import pbandk.internal.forEach
import pbandk.internal.forEachField

public abstract class AbstractGeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor() : Message {
    protected open fun computeProtoSize(): Int =
        @Suppress("UNCHECKED_CAST")
        messageDescriptor.messageValueType.rawBinarySize(this as M)

    override val protoSize: Int get() = computeProtoSize()

    protected open fun computeHashCode(): Int {
        var hash = 1

        fieldIterator().forEach { _, value ->
            hash = (31 * hash) + value.hashCode()
        }

        hash = (31 * hash) + unknownFields.hashCode()

        return hash
    }

    override fun hashCode(): Int = computeHashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Message) return false

        if (descriptor != other.descriptor) return false
        @Suppress("UNCHECKED_CAST")
        other as M

        forEachField(this, other) { _, value, otherValue ->
            if (value != otherValue) return false
        }

        if (unknownFields != other.unknownFields) return false

        return true
    }

    override fun toString(): String = buildString {
        append(descriptor.name)
        append("(")

        fieldIterator().forEach { fieldDescriptor, value ->
            if (fieldDescriptor.metadata.isExtension) {
                append("[${fieldDescriptor.metadata.fullName}]")
            } else {
                append(fieldDescriptor.metadata.name)
            }
            append("=${value}, ")
        }

        if (unknownFields.isNotEmpty()) {
            append("unknownFields=${unknownFields}")
        } else if (this.endsWith(", ")) {
            setLength(length - 2)
        }

        append(")")
    }

    public open fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M {
        val newMessage = messageDescriptor.builder {
            this@AbstractGeneratedMessage.messageDescriptor.fields.forEach { fieldDescriptor ->
                fieldDescriptor.copyValue(this@AbstractGeneratedMessage, this)
            }
            unknownFields += this@AbstractGeneratedMessage.unknownFields
            @Suppress("UNCHECKED_CAST")
            (this as MM).builderAction()
        }
        @Suppress("UNCHECKED_CAST")
        return newMessage as M
    }

    @Suppress("UNCHECKED_CAST")
    override fun plus(other: Message?): M {
        this as M

        if (descriptor != other?.descriptor) return this
        other as M

        return copy<MutableMessage<M>> {
            this@AbstractGeneratedMessage.messageDescriptor.fields.forEach { field ->
                if (field.metadata.isOneofMember) return@forEach
                field as FieldDescriptor<M, out Any?>
                field.mergeValues(this@AbstractGeneratedMessage, other, this)
            }

            for (oneof in this@AbstractGeneratedMessage.messageDescriptor.oneofs) {
                oneof as OneofDescriptor<M, *>
                oneof.mergeValues(this@AbstractGeneratedMessage, other, this)
            }

            unknownFields += other.unknownFields
        }
    }

    override fun <V> getFieldValue(fieldDescriptor: FieldDescriptor<*, V>): V {
        require(fieldDescriptor.messageDescriptor == messageDescriptor)
        @Suppress("UNCHECKED_CAST")
        return (fieldDescriptor as FieldDescriptor<M, V>).getValue(this as M)
    }
}

internal inline val <M : Message> M.messageDescriptor: MessageDescriptor<M>
    @Suppress("UNCHECKED_CAST")
    get() = descriptor as MessageDescriptor<M>

@Suppress("NOTHING_TO_INLINE")
private inline fun <M : Message, MM : MutableMessage<M>, T> FieldDescriptor<M, T>.copyValue(
    fromMessage: M,
    toMessage: MM,
) = setValue(toMessage, getValue(fromMessage))
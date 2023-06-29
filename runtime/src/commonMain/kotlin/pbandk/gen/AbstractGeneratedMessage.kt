package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.internal.forEachField

public abstract class AbstractGeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor() : Message {
    internal open fun fieldDescriptors(ordered: Boolean = false): Collection<FieldDescriptor<M, out Any?>> {
        return messageDescriptor.fields
    }

    protected open fun computeProtoSize(): Int =
        @Suppress("UNCHECKED_CAST")
        messageDescriptor.messageValueType.rawBinarySize(this as M)

    override val protoSize: Int get() = computeProtoSize()

    protected open fun computeHashCode(): Int {
        var hash = 1

        fieldDescriptors(ordered = true).forEachWithValue(this.asMessage()) { _, value ->
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

        fieldDescriptors(ordered = true).forEachWithValue(this@AbstractGeneratedMessage.asMessage()) { fd, value ->
            if (fd.metadata.isExtension) {
                append("[${fd.metadata.fullName}]")
            } else {
                append(fd.metadata.name)
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
            this@AbstractGeneratedMessage.fieldDescriptors().forEach { fieldDescriptor ->
                fieldDescriptor.copyValue(this@AbstractGeneratedMessage.asMessage(), this)
            }
            unknownFields += this@AbstractGeneratedMessage.unknownFields
            @Suppress("UNCHECKED_CAST")
            (this as MM).builderAction()
        }
        return newMessage
    }

    override operator fun plus(other: Message?): M {
        if (descriptor != other?.descriptor) return this.asMessage()
        @Suppress("UNCHECKED_CAST")
        other as M

        return copy<MutableMessage<M>> {
            this@AbstractGeneratedMessage.fieldDescriptors().forEach { field ->
                if (field.metadata.isOneofMember) return@forEach
                field.mergeValues(this@AbstractGeneratedMessage.asMessage(), other, this)
            }

            for (oneof in this@AbstractGeneratedMessage.messageDescriptor.oneofs) {
                oneof.mergeValues(this@AbstractGeneratedMessage.asMessage(), other, this)
            }

            other.unknownFields.forEach { (fieldNum, unknownField) ->
                unknownFields[fieldNum] = unknownFields[fieldNum]?.let { prevValue ->
                    prevValue.copy(values = prevValue.values + unknownField.values)
                } ?: unknownField
            }
        }
    }

    override fun <V> getFieldValue(fieldDescriptor: FieldDescriptor<*, V>): V {
        require(fieldDescriptor.messageDescriptor == messageDescriptor)
        @Suppress("UNCHECKED_CAST")
        return (fieldDescriptor as FieldDescriptor<M, V>).getValue(this as M)
    }
}

internal inline fun <M : Message, T : AbstractGeneratedMessage<M>> T.asMessage(): M {
    @Suppress("UNCHECKED_CAST")
    return this as M
}

internal inline val <M : Message> M.messageDescriptor: MessageDescriptor<M>
    @Suppress("UNCHECKED_CAST")
    get() = descriptor as MessageDescriptor<M>

internal inline val <M : Message, T : AbstractGeneratedMessage<M>> T.messageDescriptor: MessageDescriptor<M>
    @Suppress("UNCHECKED_CAST")
    get() = descriptor as MessageDescriptor<M>

private inline fun <M : Message, MM : MutableMessage<M>, T> FieldDescriptor<M, T>.copyValue(
    fromMessage: M,
    toMessage: MM,
) = setValue(toMessage, getValue(fromMessage))

internal inline fun <M : Message> Iterable<FieldDescriptor<M, out Any?>>.forEachWithValue(
    message: M,
    action: (FieldDescriptor<M, out Any?>, Any?) -> Unit,
) {
    forEach { fd ->
        val value = fd.getValue(message)
        action(fd, value)
    }
}
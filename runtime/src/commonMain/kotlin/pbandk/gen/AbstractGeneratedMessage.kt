package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MutableMessage
import pbandk.OneofDescriptor
import pbandk.PublicForGeneratedCode
import pbandk.internal.binary.Sizer
import pbandk.internal.fieldIterator
import pbandk.internal.forEach
import pbandk.internal.forEachField

public abstract class AbstractGeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(): Message {
    protected open fun computeProtoSize(): Int = Sizer.rawMessageSize(this)

    override val protoSize: Int get() = computeProtoSize()

    protected open fun computeHashCode(): Int {
        var hash = 1

        fieldIterator().forEach { _, value ->
            hash = (31 * hash) + value.hashCode()
        }

        hash = (31 * hash) + unknownFields.hashCode()

        return hash
    }

    override fun hashCode(): Int = computeProtoSize()

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
            if (fieldDescriptor.isExtension) {
                append("[${fieldDescriptor.fullName}]")
            } else {
                append(fieldDescriptor.name)
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

    @Suppress("UNCHECKED_CAST")
    public open fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M {
        this as M
        return messageDescriptor.builder {
            this as MutableMessage<M>

            this@AbstractGeneratedMessage.fieldIterator().forEach { fieldDescriptor, value ->
                updateFieldValue(fieldDescriptor as FieldDescriptor<M, Any?>, value)
            }
            unknownFields += this@AbstractGeneratedMessage.unknownFields
            (this as MM).builderAction()
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun plus(other: Message?): M {
        this as M

        if (descriptor != other?.descriptor) return this
        other as M

        return copy<MutableMessage<M>> {
            forEachField(this@AbstractGeneratedMessage, other) { field, value, otherValue ->
                if (field.isOneofMember) {
                    return@forEachField
                } else if (field.type is FieldDescriptor.Type.Message<*>) {
                    field as FieldDescriptor<M, Message?>
                    value as Message?
                    otherValue as Message?

                    updateFieldValue(field, value?.plus(otherValue) ?: otherValue)
                } else if (field.type.hasPresence) {
                    field as FieldDescriptor<M, Any?>

                    otherValue?.let { updateFieldValue(field, it) }
                } else {
                    field as FieldDescriptor<M, Any>
                    otherValue as Any

                    updateFieldValue(field, otherValue)
                }
            }

            for (oneof in this@AbstractGeneratedMessage.messageDescriptor.oneofs) {
                oneof as OneofDescriptor<M, *>
                val messageValue = oneof.getValue(this@AbstractGeneratedMessage)
                val otherValue = oneof.getValue(other)

                if (otherValue == null) {
                    continue
                } else if (messageValue == null || messageValue::class != otherValue::class) {
                    oneof.copyValue(other, this)
                } else if (messageValue.value is Message) {
                    messageValue as GeneratedOneOf<M, Message>
                    updateFieldValue(
                        messageValue.currentFieldDescriptor,
                        messageValue.value.plus(otherValue.value as Message)
                    )
                } else {
                    oneof.copyValue(other, this)
                }
            }

            unknownFields += other.unknownFields
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <V> getFieldValue(fieldDescriptor: FieldDescriptor<*, V>): V {
        require(fieldDescriptor.messageDescriptor == messageDescriptor)
        require(fieldDescriptor is FieldDescriptor.Standard<*, *, V>)
        fieldDescriptor as FieldDescriptor.Standard<M, *, V>
        return fieldDescriptor.accessor.getValue(this as M)
    }

}

internal inline val <M : Message> M.messageDescriptor: MessageDescriptor<M>
    @Suppress("UNCHECKED_CAST")
    get() = descriptor as MessageDescriptor<M>

@Suppress("NOTHING_TO_INLINE")
private inline fun <M : Message, O : Message.OneOf<*>> OneofDescriptor<M, O>.copyValue(
    fromMessage: M,
    toMessage: MutableMessage<M>,
) = updateValue(toMessage, getValue(fromMessage))
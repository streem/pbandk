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
            // TODO: include the full path for extension fields, not just their name
            append("${fieldDescriptor.name}=${value}, ")
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
                (fieldDescriptor.updateValue as (MutableMessage<M>, Any?) -> Unit)(this, value)
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
                if (field.oneofMember) {
                    return@forEachField
                } else if (field.type is FieldDescriptor.Type.Message<*>) {
                    field as FieldDescriptor<M, Message?>
                    value as Message?
                    otherValue as Message?

                    field.updateValue(this, value?.plus(otherValue) ?: otherValue)
                } else if (field.type.hasPresence) {
                    field as FieldDescriptor<M, Any?>

                    otherValue?.let { field.updateValue(this, it) }
                } else {
                    field as FieldDescriptor<M, Any>
                    otherValue as Any

                    field.updateValue(this, otherValue)
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
                    messageValue.currentFieldDescriptor.updateValue(
                        this,
                        messageValue.value.plus(otherValue.value as Message)
                    )
                } else {
                    oneof.copyValue(other, this)
                }
            }

            unknownFields += other.unknownFields
        }
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
package pbandk.gen

import pbandk.FieldAccessor
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
import pbandk.internal.types.MessageValueType
import pbandk.types.FieldType

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
                fieldDescriptor.fieldAccessor.copyValue(this@AbstractGeneratedMessage, this)
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
                if (field.metadata.isOneofMember) {
                    return@forEach
                }
                else if (field.fieldType is FieldType.HasPresence<*> && field.fieldType.valueType is MessageValueType<*>) {
                    val accessor = field.accessor as FieldAccessor<M, MutableMessage<M>, Message?>
                    val value = accessor.getValue(this@AbstractGeneratedMessage)
                    val otherValue = accessor.getValue(other)
                    accessor.updateValue(this, value?.plus(otherValue) ?: otherValue)
                } else if (field.fieldType is FieldType.HasPresence<*>) {
                    val accessor = field.accessor as FieldAccessor<M, MutableMessage<M>, Any?>
                    val otherValue = accessor.getValue(other)
                    otherValue?.let { accessor.updateValue(this, it) }
                } else {
                    val accessor = field.accessor as FieldAccessor<M, MutableMessage<M>, Any>
                    val otherValue = accessor.getValue(other)
                    field.accessor.updateValue(this, otherValue)
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
                    messageValue.currentFieldDescriptor.fieldAccessor.updateValue(
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

internal inline val <M : Message, T> FieldDescriptor<M, T>.fieldAccessor: FieldAccessor<M, MutableMessage<M>, T>
    @Suppress("UNCHECKED_CAST")
    get() = accessor as FieldAccessor<M, MutableMessage<M>, T>

@Suppress("NOTHING_TO_INLINE")
private inline fun <M : Message, MM : MutableMessage<M>, T> FieldAccessor<M, MM, T>.copyValue(
    fromMessage: M,
    toMessage: MM,
) = updateValue(toMessage, getValue(fromMessage))

@Suppress("NOTHING_TO_INLINE")
private inline fun <M : Message, O : Message.OneOf<*>> OneofDescriptor<M, O>.copyValue(
    fromMessage: M,
    toMessage: MutableMessage<M>,
) = updateValue(toMessage, getValue(fromMessage))
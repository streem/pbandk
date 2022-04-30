package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.FieldDescriptorSet
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MutableMessage
import pbandk.OneofDescriptor
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.internal.binary.Sizer

internal fun <M : Message> M.computeProtoSize(): Int = Sizer.rawMessageSize(this)

internal fun <M : Message> M.computeHashCode(): Int {
    var hash = 1

    for (field in fieldDescriptors) {
        hash = (31 * hash) + field.getValue(this).hashCode()
    }

    hash = (31 * hash) + unknownFields.hashCode()

    return hash
}

internal fun <M : Message> equals(message: M, other: Any?): Boolean {
    if (message === other) return true
    if (other !is Message) return false

    if (message.descriptor != other.descriptor) return false
    @Suppress("UNCHECKED_CAST")
    other as M

    for (field in message.fieldDescriptors) {
        if (field.getValue(message) != field.getValue(other)) return false
    }

    if (message.unknownFields != other.unknownFields) return false

    return true
}

internal fun <M : Message> toString(message: M): String = buildString {
    append(message.descriptor.name)
    append("(")

    for (field in message.fieldDescriptors) {
        append("${field.name}=${field.getValue(message)}, ")
    }

    if (message.unknownFields.isNotEmpty()) {
        append("unknownFields=$message.unknownFields")
    } else if (this.endsWith(", ")) {
        setLength(length - 2)
    }

    append(")")
}

internal fun <M : Message, MM : MutableMessage<M>> copy(message: M, builderAction: MM.() -> Unit): M {
    return message.messageDescriptor.builder {
        for (field in message.fieldDescriptors) {
            field.copyValue(message, this)
        }
        unknownFields += message.unknownFields
        @Suppress("UNCHECKED_CAST")
        (this as MM).builderAction()
    }
}

@Suppress("UNCHECKED_CAST")
internal fun <M : Message> plus(message: M, other: Message?): M {
    if (message.descriptor != other?.descriptor) return message
    other as M

    return copy(message) {
        for (field in message.fieldDescriptors) {
            if (field.oneofMember) {
                continue
            } else if (field.type is FieldDescriptor.Type.Message<*>) {
                field as FieldDescriptor<M, Message?>

                field.updateValue(this, field.getValue(message)?.plus(field.getValue(other)) ?: field.getValue(other))
            } else if (field.type.hasPresence) {
                field as FieldDescriptor<M, Any?>

                field.getValue(other)?.let { field.updateValue(this, it) }
            } else {
                field as FieldDescriptor<M, Any>

                field.updateValue(this, field.getValue(other))
            }
        }

        for (oneof in message.messageDescriptor.oneofs) {
            val messageValue = oneof.getValue(message)
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

public abstract class GeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: Map<Int, UnknownField> = emptyMap()
) : Message {
    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }

    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode
    override fun equals(other: Any?): Boolean = equals(this, other)
    override fun toString(): String = toString(this)

    public open fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M =
        @Suppress("UNCHECKED_CAST")
        copy(this as M, builderAction)

    override fun plus(other: Message?): M =
        @Suppress("UNCHECKED_CAST")
        plus(this as M, other)
}

public abstract class MutableGeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : MutableMessage<M>, Message {
    override val protoSize: Int get() = computeProtoSize()

    override fun hashCode(): Int = computeHashCode()
    override fun equals(other: Any?): Boolean = equals(this, other)
    override fun toString(): String = toString(this)

    public fun <MM : MutableMessage<M>> copy(@Suppress("UNUSED_PARAMETER") builderAction: MM.() -> Unit): M =
        throw UnsupportedOperationException()

    override fun plus(other: Message?): M = throw UnsupportedOperationException()
}

@Suppress("UNCHECKED_CAST")
private inline val <M : Message> M.messageDescriptor: MessageDescriptor<M>
    get() = descriptor as MessageDescriptor<M>

private inline val <M : Message> M.fieldDescriptors: FieldDescriptorSet<M>
    get() = messageDescriptor.fields

@Suppress("NOTHING_TO_INLINE")
private inline fun <M : Message, V> FieldDescriptor<M, V>.copyValue(
    fromMessage: M,
    toMessage: MutableMessage<M>,
) = updateValue(toMessage, getValue(fromMessage))

@Suppress("NOTHING_TO_INLINE")
private inline fun <M : Message, O : Message.OneOf<*>> OneofDescriptor<M, O>.copyValue(
    fromMessage: M,
    toMessage: MutableMessage<M>,
) = updateValue(toMessage, getValue(fromMessage))

public abstract class GeneratedOneOf<M : Message, V : Any>
@PublicForGeneratedCode
protected constructor(
    public override val value: V,
    internal val currentFieldDescriptor: FieldDescriptor<M, V?>
) : Message.OneOf<V> {
    override fun equals(other: Any?): Boolean =
        this::class.isInstance(other) && value == (other as Message.OneOf<*>).value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "OneOf.${this::class.simpleName}($value)"
}

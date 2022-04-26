package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MutableMessage
import pbandk.OneofDescriptor
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.internal.binary.Sizer

public abstract class GeneratedMessage<T : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: Map<Int, UnknownField> = emptyMap()
) : Message {
    protected fun computeProtoSize(): Int = Sizer.rawMessageSize(this)

    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }

    protected fun computeHashCode(): Int {
        var hash = 1

        for (field in fieldDescriptors) {
            hash = (31 * hash) + getValue(field).hashCode()
        }

        hash = (31 * hash) + unknownFields.hashCode()

        return hash
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GeneratedMessage<*>) return false

        if (descriptor != other.descriptor) return false
        @Suppress("UNCHECKED_CAST")
        other as GeneratedMessage<T>

        for (field in fieldDescriptors) {
            if (this.getValue(field) != other.getValue(field)) return false
        }

        if (unknownFields != other.unknownFields) return false

        return true
    }

    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode

    override fun toString(): String = buildString {
        append(descriptor.name)
        append("(")

        for (field in fieldDescriptors) {
            append("${field.name}=${getValue(field)}, ")
        }

        if (unknownFields.isNotEmpty()) {
            append("unknownFields=$unknownFields")
        } else if (this.endsWith(", ")) {
            setLength(length - 2)
        }

        append(")")
    }

    public open fun <B : MutableMessage<T>> copy(builderAction: B.() -> Unit): T {
        return messageDescriptor.builder {
            for (field in fieldDescriptors) {
                setValueFromMessage(field, this@GeneratedMessage)
            }
            unknownFields += this@GeneratedMessage.unknownFields
            @Suppress("UNCHECKED_CAST")
            (this as B).builderAction()
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun plus(other: Message?): T {
        if (descriptor != other?.descriptor) return this as T
        other as T

        return copy<MutableMessage<T>> {
            for (field in fieldDescriptors) {
                if (field.oneofMember) {
                    continue
                } else if (field.type is FieldDescriptor.Type.Message<*>) {
                    field as FieldDescriptor<T, Message?>

                    field.updateValue(this, getValue(field)?.plus(field.getValue(other)) ?: field.getValue(other))
                } else if (field.type.hasPresence) {
                    field as FieldDescriptor<T, Any?>

                    field.getValue(other)?.let { field.updateValue(this, it) }
                } else {
                    field as FieldDescriptor<T, Any>

                    field.updateValue(this, field.getValue(other))
                }
            }

            for (oneof in messageDescriptor.oneofs) {
                oneof as OneofDescriptor<T, Message.OneOf<*>>
                val thisValue = oneof.getValue(this as T)
                val otherValue = oneof.getValue(other)

                if (otherValue == null) {
                    continue
                } else if (thisValue == null || thisValue::class != otherValue::class) {
                    oneof.updateValue(this, otherValue)
                } else if (thisValue.value is Message) {
                    thisValue as GeneratedOneOf<T>
                    thisValue.currentFieldDescriptor as FieldDescriptor<T, Message>
                    thisValue.currentFieldDescriptor.updateValue(
                        this,
                        thisValue.value.plus(otherValue.value as Message)
                    )
                } else {
                    oneof.updateValue(this, otherValue)
                }
            }
            unknownFields += other.unknownFields
        }
    }
}

public abstract class MutableGeneratedMessage<T : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : GeneratedMessage<T>(unknownFields), MutableMessage<T> {
    override val protoSize: Int get() = computeProtoSize()

    override fun hashCode(): Int = computeHashCode()
    override fun equals(other: Any?): Boolean = super.equals(other)

    override fun <B : MutableMessage<T>> copy(builderAction: B.() -> Unit): T = throw UnsupportedOperationException()
    override fun plus(other: Message?): T = throw UnsupportedOperationException()
}

@Suppress("UNCHECKED_CAST")
private inline val <T : Message> GeneratedMessage<T>.messageDescriptor: MessageDescriptor<T>
    get() = descriptor as MessageDescriptor<T>

private inline val <T : Message> GeneratedMessage<T>.fieldDescriptors: Collection<FieldDescriptor<T, *>>
    get() = messageDescriptor.fields

@Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
private inline fun <T : Message, V> GeneratedMessage<T>.getValue(field: FieldDescriptor<T, V>): V =
    field.getValue(this as T)

@Suppress("NOTHING_TO_INLINE")
private inline fun <T : Message, V> MutableMessage<T>.setValueFromMessage(
    field: FieldDescriptor<T, V>,
    fromMessage: GeneratedMessage<T>
) = field.updateValue(this, fromMessage.getValue(field))

public abstract class GeneratedOneOf<T>
@PublicForGeneratedCode
protected constructor(
    public override val value: T,
    internal val currentFieldDescriptor: FieldDescriptor<out Message, *>
) : Message.OneOf<T> {
    override fun equals(other: Any?): Boolean =
        this::class.isInstance(other) && value == (other as Message.OneOf<*>).value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "OneOf.${this::class.simpleName}($value)"
}

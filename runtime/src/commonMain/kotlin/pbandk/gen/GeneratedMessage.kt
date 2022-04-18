package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.internal.binary.Sizer

@Suppress("UNCHECKED_CAST")
private inline val <T : Message> GeneratedMessage<T>.fieldDescriptors: Collection<FieldDescriptor<T, *>>
    get() = (descriptor as MessageDescriptor<T>).fields

@Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
private inline fun <T : Message, V> GeneratedMessage<T>.getValue(field: FieldDescriptor<T, V>): V {
    return field.value.get(this as T)
}

@PublicForGeneratedCode
public abstract class GeneratedMessage<T : Message> : Message {
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
}

@PublicForGeneratedCode
public abstract class MutableGeneratedMessage<T : Message> : GeneratedMessage<T>(), MutableMessage<T> {
    override val protoSize: Int get() = computeProtoSize()

    override fun hashCode(): Int = computeHashCode()
    override fun equals(other: Any?): Boolean = super.equals(other)
}
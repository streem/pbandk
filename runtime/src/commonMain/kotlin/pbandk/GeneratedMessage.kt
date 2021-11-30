package pbandk

import pbandk.internal.binary.Sizer

@PublicForGeneratedCode
public abstract class GeneratedMessage<T : Message> : Message {
    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { Sizer.rawMessageSize(this) }

    @Suppress("UNCHECKED_CAST")
    private inline val fieldDescriptors: Collection<FieldDescriptor<T, *>>
        get() = (descriptor as MessageDescriptor<T>).fields

    @Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
    private inline fun <V> getValue(field: FieldDescriptor<T, V>): V {
        return field.value.get(this as T)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        @Suppress("UNCHECKED_CAST")
        other as GeneratedMessage<T>

        for (field in fieldDescriptors) {
            if (this.getValue(field) != other.getValue(field)) return false
        }

        if (unknownFields != other.unknownFields) return false

        return true
    }

    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) {
        var hash = 1

        for (field in fieldDescriptors) {
            hash = (31 * hash) * getValue(field).hashCode()
        }

        hash = (31 * hash) + unknownFields.hashCode()

        hash
    }

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
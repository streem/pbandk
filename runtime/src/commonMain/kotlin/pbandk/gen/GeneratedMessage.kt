package pbandk.gen

import pbandk.ExtendableMessage
import pbandk.FieldDescriptor
import pbandk.FieldSet
import pbandk.FieldSetCache
import pbandk.Message
import pbandk.MutableExtendableMessage
import pbandk.MutableFieldSet
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.decodeAs
import pbandk.internal.types.FieldType

@Suppress("EqualsOrHashCode")
public abstract class GeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: Map<Int, UnknownField> = emptyMap()
) : AbstractGeneratedMessage<M>() {
    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }
    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode
}

public abstract class MutableGeneratedMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : AbstractGeneratedMessage<M>(), MutableMessage<M> {
    override fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M = throw UnsupportedOperationException()
    override fun plus(other: Message?): M = throw UnsupportedOperationException()

    override fun <V> updateFieldValue(fieldDescriptor: FieldDescriptor<M, V>, value: V) {
        fieldDescriptor.setValue(this, value)
    }
}

@Suppress("EqualsOrHashCode")
public abstract class GeneratedExtendableMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    internal val extensionFields: FieldSet<M> = FieldSet.empty(),
    override val unknownFields: Map<Int, UnknownField> = emptyMap()
) : AbstractGeneratedMessage<M>(), ExtendableMessage<M> {
    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }
    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode

    private val extensionFieldCache: FieldSetCache<M> = FieldSetCache()

    public override fun <V> getExtension(fd: FieldDescriptor<M, V>): V {
        require(fd.metadata.isExtension) { "Provided field descriptor does not describe an extension field" }
        var value: V? = extensionFields[fd]
        if (value != null) {
            // The extension value was provided when this message was constructed
            return value
        }

        value = extensionFieldCache[fd]
        if (value != null) {
            // If we've already decoded the value of the extension field from the unknown fields, then return the
            // cached value
            return value
        }

        // Try to find the extension field in the unknown fields and decode it
        value = unknownFields[fd.number]?.decodeAs(fd)
        if (value != null) {
            // We found the field and were able to decode it. Cache a copy of the decoded value and return it.
            extensionFieldCache[fd] = value
            return value
        }

        return fd.fieldType.defaultValue
    }

    override fun <T : Any> getRepeatedExtension(fd: FieldDescriptor<M, List<T>>): List<T> {
        require(fd.fieldType is FieldType.Repeated<T>) { "Provided field descriptor does not describe a repeated field" }
        return getExtension(fd)
    }
}

public abstract class MutableGeneratedExtendableMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : AbstractGeneratedMessage<M>(), MutableExtendableMessage<M> {
    override fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M = throw UnsupportedOperationException()
    override fun plus(other: Message?): M = throw UnsupportedOperationException()

    override fun <V> updateFieldValue(fieldDescriptor: FieldDescriptor<M, V>, value: V) {
        fieldDescriptor.setValue(this, value)
    }

    protected val extensionFields: MutableFieldSet<M> = MutableFieldSet()

    override fun <V> getExtension(fd: FieldDescriptor<M, V>): V {
        require(fd.metadata.isExtension) { "Provided field descriptor does not describe an extension field" }
        return extensionFields[fd]
        // A value for this extension field was not provided. Return the default value for this field type (which
        // could be null, depending on the field type).
            ?: fd.fieldType.defaultValue
    }

    override fun <T> getRepeatedExtension(fd: FieldDescriptor<M, List<T>>): MutableList<T> {
        require(fd.metadata.isExtension) { "Provided field descriptor does not describe an extension field" }
        require(fd.type is FieldDescriptor.Type.Repeated<*>) { "Provided field descriptor does not describe a repeated field" }
        if (fd !in extensionFields) {
            extensionFields[fd] = mutableListOf()
        }
        return extensionFields[fd] as MutableList<T>
    }

    override fun <V> setExtension(fd: FieldDescriptor<M, V>, newValue: V) {
        require(fd.metadata.isExtension) { "Provided field descriptor does not describe an extension field" }
        require(fd.type !is FieldDescriptor.Type.Repeated<*>) { "Use getRepeatedExtension() to modify a repeated field" }
        if (newValue == null) {
            extensionFields.remove(fd)
        } else {
            extensionFields[fd] = newValue
        }
    }

//    override val unknownFields: MutableMap<Int, UnknownField> = UnknownFieldsProxy(unknownFields, extensionFields)
}

// A giant rabbit hole just so we can properly detect when an unknown field is added to the message with the
// same field number as an extension field that had been previously added. In that case, we need to remove the
// extension field since the unknown field is more recent and should take precedence. A lot of work for a very
// edge case :( Perhaps we'll find a simpler way to implement this in the future.
/*
private class UnknownFieldsProxy(
    private val unknownFields: MutableMap<Int, UnknownField>,
    private val extensionValues: MutableExtensionFieldSet<*>
) : MutableMap<Int, UnknownField> by unknownFields {
    override fun put(key: Int, value: UnknownField) = unknownFields.put(key, value).also {
        extensionValues.remove(key)
    }

    override fun putAll(from: Map<out Int, UnknownField>) = unknownFields.putAll(from).also {
        for (key in from.keys) {
            extensionValues.remove(key)
        }
//        extensionValues -= from.keys
    }

    override val entries: MutableSet<MutableMap.MutableEntry<Int, UnknownField>>
        get() = EntriesProxy(unknownFields.entries, extensionValues)

    private class EntriesProxy(
        private val entries: MutableSet<MutableMap.MutableEntry<Int, UnknownField>>,
        private val extensionValues: MutableExtensionFieldSet<*>
    ) : MutableSet<MutableMap.MutableEntry<Int, UnknownField>> by entries {
        override fun add(element: MutableMap.MutableEntry<Int, UnknownField>) =
            entries.add(element).also {
                extensionValues.remove(element.key)
            }

        override fun addAll(elements: Collection<MutableMap.MutableEntry<Int, UnknownField>>) =
            entries.addAll(elements).also {
                for (element in elements) {
                    extensionValues.remove(element.key)
                }
//                extensionValues -= elements.map { it.key }.toSet()
            }

        override fun iterator(): MutableIterator<MutableMap.MutableEntry<Int, UnknownField>> =
            IteratorProxy(entries.iterator(), extensionValues)

        private class IteratorProxy(
            private val iterator: MutableIterator<MutableMap.MutableEntry<Int, UnknownField>>,
            private val extensionValues: MutableExtensionFieldSet<*>
        ): MutableIterator<MutableMap.MutableEntry<Int, UnknownField>> by iterator {
            private var lastKey: Int? = null

            override fun next() = iterator.next().also {
                lastKey = it.key
            }

            override fun remove() = iterator.remove().also {
                lastKey?.let { extensionValues.remove(it) }
            }
        }
    }
}
 */
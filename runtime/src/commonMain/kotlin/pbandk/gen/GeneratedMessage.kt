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

        return if (value != null) {
            // We found the field and were able to decode it. Cache a copy of the decoded value and return it.
            extensionFieldCache[fd] = value
            value
        } else if (!fd.type.hasPresence) {
            // A value for this extension field was not provided. If the field type has a non-null default value
            // then return it.
            @Suppress("UNCHECKED_CAST")
            fd.type.defaultValue as V
        } else {
            // A value was not provided and the default value for this field type is null, so just return null.
            @Suppress("UNCHECKED_CAST")
            null as V
        }
    }
}

public abstract class MutableGeneratedExtendableMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : AbstractGeneratedMessage<M>(), MutableExtendableMessage<M> {
    override fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M = throw UnsupportedOperationException()
    override fun plus(other: Message?): M = throw UnsupportedOperationException()

    protected val extensionFields: MutableFieldSet<M> = MutableFieldSet()

    override fun <V> getExtension(fd: FieldDescriptor<M, V>): V {
        return extensionFields[fd]
            ?: if (!fd.type.hasPresence) {
                // A value for this extension field was not provided. If the field type has a non-null default value
                // then return it.
                @Suppress("UNCHECKED_CAST")
                fd.type.defaultValue as V
            } else {
                // A value was not provided and the default value for this field type is null, so just return null.
                @Suppress("UNCHECKED_CAST")
                null as V
            }
    }

    override fun <V> setExtension(fd: FieldDescriptor<M, V>, newValue: V) {
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
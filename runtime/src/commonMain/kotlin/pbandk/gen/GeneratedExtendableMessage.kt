package pbandk.gen

import pbandk.ExtendableMessage
import pbandk.ExtensionFieldSet
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MutableExtendableMessage
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.decodeAs

public abstract class GeneratedExtendableMessage<T : Message>
@PublicForGeneratedCode
protected constructor(
    unknownFields: Map<Int, UnknownField> = emptyMap()
) : GeneratedMessage<T>(unknownFields), ExtendableMessage<T> {
    private val extensionFields: ExtensionFieldSet = ExtensionFieldSet()

    @Suppress("UNCHECKED_CAST")
    public override fun <V> getExtension(fd: FieldDescriptor<T, V>): V {
        var value = extensionFields[fd.number] as? V
        if (value != null) {
            // If we've already decoded the value of the extension field, then return the cached value
            return value
        } else {
            // Try to find the extension field in the unknown fields and decode it
            value = unknownFields[fd.number]?.decodeAs(fd)
        }

        return if (value != null) {
            // We found the field and were able to decode it. Cache a copy of the decoded value and return it.
            extensionFields[fd.number] = value
            value
        } else if (!fd.type.hasPresence) {
            // A value for this extension field was not provided. If the field type has a non-null default value
            // then return it.
            fd.type.defaultValue as V
        } else {
            // A value was not provided and the default value for this field type is null, so just return null.
            null as V
        }
    }
}

public abstract class MutableGeneratedExtendableMessage<T : Message>
@PublicForGeneratedCode
protected constructor(
    unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : MutableGeneratedMessage<T>(unknownFields), MutableExtendableMessage<T> {
    private val extensionValues: MutableMap<Int, ExtensionValue<T, *>> = mutableMapOf()

    override fun <V> getExtension(fd: FieldDescriptor<T, V>): V {
        @Suppress("UNCHECKED_CAST")
        return extensionValues[fd.number]?.value as V
    }

    override fun <V> setExtension(fd: FieldDescriptor<T, V>, newValue: V) {
        extensionValues[fd.number] = ExtensionValue(fd, newValue)
    }

    override val unknownFields: MutableMap<Int, UnknownField>
        get() = UnknownFieldsProxy(super.unknownFields, extensionValues)
}

private class ExtensionValue<T : Message, V>(val fieldDescriptor: FieldDescriptor<T, V>, val value: V)

// A giant rabbit hole just so we can properly detect when an unknown field is added to the message with the
// same field number as an extension field that had been previously added. In that case, we need to remove the
// extension field since the unknown field is more recent and should take precedence. A lot of work for a very
// edge case :( Perhaps we'll find a simpler way to implement this in the future.
private class UnknownFieldsProxy(
    private val unknownFields: MutableMap<Int, UnknownField>,
    private val extensionValues: MutableMap<Int, *>
) : MutableMap<Int, UnknownField> by unknownFields {
    override fun put(key: Int, value: UnknownField) = unknownFields.put(key, value).also {
        extensionValues.remove(key)
    }

    override fun putAll(from: Map<out Int, UnknownField>) = unknownFields.putAll(from).also {
        extensionValues -= from.keys
    }

    override val entries: MutableSet<MutableMap.MutableEntry<Int, UnknownField>>
        get() = EntriesProxy(unknownFields.entries, extensionValues)

    private class EntriesProxy(
        private val entries: MutableSet<MutableMap.MutableEntry<Int, UnknownField>>,
        private val extensionValues: MutableMap<Int, *>
    ) : MutableSet<MutableMap.MutableEntry<Int, UnknownField>> by entries {
        override fun add(element: MutableMap.MutableEntry<Int, UnknownField>) =
            entries.add(element).also {
                extensionValues.remove(element.key)
            }

        override fun addAll(elements: Collection<MutableMap.MutableEntry<Int, UnknownField>>) =
            entries.addAll(elements).also {
                extensionValues -= elements.map { it.key }.toSet()
            }

        override fun iterator(): MutableIterator<MutableMap.MutableEntry<Int, UnknownField>> =
            IteratorProxy(entries.iterator(), extensionValues)

        private class IteratorProxy(
            private val iterator: MutableIterator<MutableMap.MutableEntry<Int, UnknownField>>,
            private val extensionValues: MutableMap<Int, *>
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
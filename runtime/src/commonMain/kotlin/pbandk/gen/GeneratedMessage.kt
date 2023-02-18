package pbandk.gen

import pbandk.ExtendableMessage
import pbandk.ExtensionFieldSet
import pbandk.FieldSet
import pbandk.Message
import pbandk.MutableExtendableMessage
import pbandk.MutableExtensionFieldSet
import pbandk.MutableFieldSet
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField

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
    extensionFields: FieldSet<M> = FieldSet.empty(),
    unknownFields: Map<Int, UnknownField> = emptyMap()
) : AbstractGeneratedMessage<M>(), ExtendableMessage<M> {
    override val extensionFields: FieldSet<M> = ExtensionFieldSet(extensionFields, unknownFields)

    @Suppress("CanBePrimaryConstructorProperty")
    override val unknownFields: Map<Int, UnknownField> = unknownFields

    override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeProtoSize() }
    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode
}

public abstract class MutableGeneratedExtendableMessage<M : Message>
@PublicForGeneratedCode
protected constructor(
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : AbstractGeneratedMessage<M>(), MutableExtendableMessage<M> {
    override fun <MM : MutableMessage<M>> copy(builderAction: MM.() -> Unit): M = throw UnsupportedOperationException()
    override fun plus(other: Message?): M = throw UnsupportedOperationException()

    override val extensionFields: MutableFieldSet<M> = MutableExtensionFieldSet()

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
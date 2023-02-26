package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MessageDescriptor
import pbandk.MessageMetadata
import pbandk.MutableMessage
import pbandk.PublicForGeneratedCode
import pbandk.UnknownField
import pbandk.internal.types.FieldType
import pbandk.internal.types.primitive.Bool
import pbandk.types.ValueType
import pbandk.wkt.Syntax
import kotlin.reflect.KClass

@PublicForGeneratedCode
public interface MapField<K : Any, V : Any> : Map<K, V> {
    public val entryCompanion: Entry.Companion<K, V>
    public fun asMessages(): Collection<Entry<K, V>>

    @PublicForGeneratedCode
    public interface Entry<K : Any, V : Any> : Map.Entry<K, V>, Message {
        override fun plus(other: Message?): Entry<K, V>
        override val descriptor: MessageDescriptor<Entry<K, V>>

        @PublicForGeneratedCode
        public class Companion<K : Any, V : Any>(
            internal val keyType: ValueType<K>,
            internal val valueType: ValueType<V>,
        ) : Message.Companion<Entry<K, V>>() {
            private fun entryBuilder(builderAction: MutableMapField.MutableEntry<K, V>.() -> Unit): Entry<K, V> =
                MutableMapFieldEntry(keyType.defaultValue, valueType.defaultValue, this).also(builderAction)

            override val defaultInstance: Entry<K, V> = entryBuilder {}

            private val messageMetadata = MessageMetadata(
                fullName = "MapFieldEntry",
                syntax = Syntax.PROTO3,
            )

            @Suppress("UNCHECKED_CAST")
            override val descriptor: MessageDescriptor<Entry<K, V>> = MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = Entry::class as KClass<Entry<K, V>>,
                messageCompanion = this,
                builder = ::entryBuilder,
                fields = listOf(
                    FieldDescriptor.ofSingular(
                        messageDescriptor = this::descriptor,
                        messageMetadata = messageMetadata,
                        name = "key",
                        jsonName = "key",
                        number = 1,
                        valueType = keyType,
                        value = Entry<K, V>::key,
                        mutableValue = MutableMapField.MutableEntry<K, V>::key,
                    ),
                    FieldDescriptor.ofSingular(
                        messageDescriptor = this::descriptor,
                        messageMetadata = messageMetadata,
                        name = "value",
                        jsonName = "value",
                        number = 2,
                        valueType = valueType,
                        value = Entry<K, V>::value,
                        mutableValue = MutableMapField.MutableEntry<K, V>::value,
                    ),
                )
            )
        }
    }

    @PublicForGeneratedCode
    public companion object {
        // TODO
        private val Empty = MapFieldImpl(Entry.Companion(Bool, Bool), emptySet())

        /**
         * Returns a singleton empty map regardless of the type variables.
         */
        @Suppress("UNCHECKED_CAST")
        internal fun <K : Any, V : Any> empty(): MapField<K, V> = Empty as MapField<K, V>

        internal fun <K : Any, V : Any> of(
            keyType: ValueType<K>,
            valueType: ValueType<V>,
            vararg pairs: Pair<K, V>
        ): MapField<K, V> {
            val companion = Entry.Companion(keyType, valueType)
            return MutableMapField(companion).apply {
                putAll(pairs)
            }.toMapField()
        }
    }
}

@PublicForGeneratedCode
public interface MutableMapField<K : Any, V : Any> : MutableMap<K, V> {
    public val entryCompanion: MapField.Entry.Companion<K, V>

    public fun put(entry: Map.Entry<K, V>)
    public fun putAll(entries: Sequence<Map.Entry<K, V>>)
    public fun toMapField(): MapField<K, V>

    @PublicForGeneratedCode
    public interface MutableEntry<K : Any, V : Any>
        : MutableMap.MutableEntry<K, V>, MapField.Entry<K, V>, MutableMessage<MapField.Entry<K, V>> {
        override var key: K
        override var value: V
    }
}

internal fun <K : Any, V : Any> MapField(
    entryCompanion: MapField.Entry.Companion<K, V>,
    map: Map<out K, V>
): MapField<K, V> = MutableMapFieldImpl(entryCompanion).apply { putAll(map) }.toMapField()

@PublicForGeneratedCode
public fun <K : Any, V : Any> MutableMapField(entryCompanion: MapField.Entry.Companion<K, V>): MutableMapField<K, V> =
    MutableMapFieldImpl(entryCompanion)

// Convenience factory function to keep generated code more succinct
@PublicForGeneratedCode
public fun <K : Any, V : Any> MutableMapField(fieldDescriptor: FieldDescriptor<*, Map<K, V>>): MutableMapField<K, V> {
    val mapFd = fieldDescriptor.fieldType as FieldType.Map<K, V>
    return MutableMapFieldImpl(mapFd.entryCompanion)
}

// Begin: private implementations

private abstract class AbstractMapField<K : Any, V : Any> : Map<K, V> {
    protected abstract val delegate: Map<K, MapField.Entry<K, V>>

    // region Map interface implementation

    override val size: Int get() = delegate.size
    override val keys: Set<K> get() = delegate.keys

    override fun isEmpty(): Boolean = delegate.isEmpty()
    override fun containsKey(key: K): Boolean = delegate.containsKey(key)
    override fun containsValue(value: V): Boolean = delegate.any { it.value.value == value }
    override fun get(key: K): V? = delegate[key]?.value

    // endregion

    protected fun computeHashCode(): Int = delegate.values.hashCode()
    override fun hashCode(): Int = computeHashCode()

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Map<*, *>) return false
        if (size != other.size) return false

        if (other is AbstractMapField<*, *>) return delegate == other.delegate

        return other.entries == delegate.values.toSet()
    }

    override fun toString(): String = delegate.values.joinToString(separator = ", ", prefix = "{", postfix = "}") {
        "${it.key}=${it.value}" + if (it.unknownFields.isNotEmpty()) " (has unknown fields)" else ""
    }

    fun asMessages(): Collection<MapField.Entry<K, V>> = delegate.values
}

private class MapFieldImpl<K : Any, V : Any>(
    override val entryCompanion: MapField.Entry.Companion<K, V>,
    entries: Collection<MapField.Entry<K, V>>
) : AbstractMapField<K, V>(), MapField<K, V> {
    override val delegate: Map<K, MapField.Entry<K, V>> = entries.associateBy(MapField.Entry<K, V>::key)

    // region Map interface implementation

    override val entries: Set<Map.Entry<K, V>> get() = delegate.values.toSet()
    override val values: Collection<V> get() = delegate.asIterable().map { it.value.value }

    // endregion

    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { computeHashCode() }
    override fun hashCode(): Int = _hashCode
    override fun equals(other: Any?): Boolean = super.equals(other)
}

private class MutableMapFieldImpl<K : Any, V : Any>(
    override val entryCompanion: MapField.Entry.Companion<K, V>
) : AbstractMapField<K, V>(), MutableMapField<K, V> {
    override val delegate: MutableMap<K, MutableMapField.MutableEntry<K, V>> = mutableMapOf()

    // region MutableMap interface implementation

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>> =
        object : MutableSet<MutableMap.MutableEntry<K, V>> {
            override val size get() = this@MutableMapFieldImpl.size
            override fun isEmpty() = this@MutableMapFieldImpl.isEmpty()

            override fun contains(element: MutableMap.MutableEntry<K, V>) =
                delegate[element.key]?.value == element.value

            override fun containsAll(elements: Collection<MutableMap.MutableEntry<K, V>>) =
                elements.all { contains(it) }

            override fun iterator() = object : MutableIterator<MutableMap.MutableEntry<K, V>> {
                private val iter = delegate.entries.iterator()
                override fun hasNext() = iter.hasNext()
                override fun next() = iter.next().value
                override fun remove() = iter.remove()
            }

            override fun add(element: MutableMap.MutableEntry<K, V>) = throw UnsupportedOperationException()

            override fun addAll(elements: Collection<MutableMap.MutableEntry<K, V>>) =
                throw UnsupportedOperationException()

            override fun clear() = this@MutableMapFieldImpl.clear()

            override fun remove(element: MutableMap.MutableEntry<K, V>) =
                if (delegate[element.key]?.value == element.value) {
                    delegate.remove(element.key)
                    true
                } else {
                    false
                }

            override fun removeAll(elements: Collection<MutableMap.MutableEntry<K, V>>) =
                elements.map { remove(it) }.any { it }

            override fun retainAll(elements: Collection<MutableMap.MutableEntry<K, V>>): Boolean {
                val elementsMap =
                    elements.associateBy(MutableMap.MutableEntry<K, V>::key, MutableMap.MutableEntry<K, V>::value)
                return delegate.entries.retainAll { elementsMap[it.key] == it.value.value }
            }
        }

    override val keys: MutableSet<K> get() = delegate.keys

    override val values: MutableCollection<V> = object : MutableCollection<V> {
        override val size get() = this@MutableMapFieldImpl.size
        override fun isEmpty() = this@MutableMapFieldImpl.isEmpty()

        override fun contains(element: V) = this@MutableMapFieldImpl.containsValue(element)
        override fun containsAll(elements: Collection<V>) = elements.all { contains(it) }

        override fun iterator(): MutableIterator<V> = object : MutableIterator<V> {
            private val iter = delegate.values.iterator()
            override fun hasNext() = iter.hasNext()
            override fun next() = iter.next().value
            override fun remove() = iter.remove()
        }

        override fun add(element: V) = throw UnsupportedOperationException()
        override fun addAll(elements: Collection<V>) = throw UnsupportedOperationException()

        override fun clear() = this@MutableMapFieldImpl.clear()
        override fun remove(element: V) =
            delegate.entries.firstOrNull { it.value.value == element }?.let { delegate.remove(it.key) } != null

        override fun removeAll(elements: Collection<V>) = delegate.entries.removeAll { it.value.value in elements }
        override fun retainAll(elements: Collection<V>) = delegate.entries.retainAll { it.value.value in elements }
    }

    override fun put(key: K, value: V): V? =
        delegate.put(key, MutableMapFieldEntry(key, value, entryCompanion))?.value

    override fun putAll(from: Map<out K, V>) {
        if (from is MutableMapFieldImpl) {
            @Suppress("UNCHECKED_CAST")
            delegate.putAll(from.delegate as MutableMap<out K, out MutableMapField.MutableEntry<K, V>>)
        } else {
            from.entries.forEach { put(it.key, it.value) }
        }
    }

    override fun clear(): Unit = delegate.clear()

    override fun remove(key: K): V? = delegate.remove(key)?.value

    // endregion

    override fun put(entry: Map.Entry<K, V>) {
        if (entry is MutableMapField.MutableEntry) {
            delegate[entry.key] = entry
        } else {
            put(entry.key, entry.value)
        }
    }

    override fun putAll(entries: Sequence<Map.Entry<K, V>>) {
        entries.forEach { put(it) }
    }

    override fun toMapField(): MapField<K, V> =
        if (isEmpty()) MapField.empty() else MapFieldImpl(entryCompanion, delegate.values)
}

internal class MutableMapFieldEntry<K : Any, V : Any>(
    override var key: K,
    override var value: V,
    companion: MapField.Entry.Companion<K, V>,
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : MutableMapField.MutableEntry<K, V>, MutableGeneratedMessage<MapField.Entry<K, V>>() {
    override fun setValue(newValue: V): V {
        val oldValue = value
        value = newValue
        return oldValue
    }

    override val descriptor: MessageDescriptor<MapField.Entry<K, V>> = companion.descriptor

    override fun plus(other: Message?): MapField.Entry<K, V> = throw UnsupportedOperationException()

    // region hashCode() and equals() implementations based on the contract defined in the Map.Entry interface

    override fun hashCode(): Int {
        val hash = key.hashCode() xor value.hashCode()
        return if (unknownFields.isEmpty()) hash else (31 * hash) + unknownFields.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Map.Entry<*, *>) return false
        if (key != other.key || value != other.value) return false
        if ((other is Message && unknownFields != other.unknownFields) || unknownFields.isNotEmpty()) return false

        return true
    }

    // endregion
}
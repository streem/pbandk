package pbandk

import pbandk.internal.AtomicReference
import pbandk.internal.FieldIterator

@PublicForGeneratedCode
public class FieldSet<M : Message>
internal constructor(map: Map<FieldDescriptor<M, *>, Any>) {
    // We need to ensure that map iteration will always iterate over the fields in order of increasing field number
    private val map: Map<FieldDescriptor<M, *>, Any> = LinkedHashMap<FieldDescriptor<M, *>, Any>(map.size).apply {
        map.entries.sortedBy { it.key.number }.forEach { put(it.key, it.value) }
    }

    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map[fieldDescriptor] as V?
    }

    /**
     * Returns a [FieldIterator] over all fields in this set, ordered by increasing field number.
     */
    internal fun iterator(): FieldIterator<M> = Iterator(map.entries.iterator())

    private class Iterator<M : Message>(
        private val iterator: kotlin.collections.Iterator<Map.Entry<FieldDescriptor<M, *>, Any>>
    ) : FieldIterator<M> {
        private var lastEntry: Map.Entry<FieldDescriptor<M, *>, Any>? = null

        override fun hasNext() = iterator.hasNext()

        override fun next() = iterator.next().also { lastEntry = it }.key

        override fun nextValue() = lastEntry?.value
    }

    internal companion object {
        private val Empty = FieldSet<Nothing>(emptyMap())

        @Suppress("UNCHECKED_CAST")
        internal fun <M : Message> empty(): FieldSet<M> = Empty as FieldSet<M>
    }
}

/**
 * A variant of `MutableExtensionFieldSet` that can be safely used from multiple threads **for caching purposes only**.
 * Specifically, the [FieldSetCache.set] method is lossy and can silently drop updates during concurrent
 * updates. When used as a cache, the only impact of this is that the value will have to be recalculated again the next
 * time it is accessed. However, this makes this class unsuitable for any other purposes.
 */
internal class FieldSetCache<M : Message> {
    private val map: AtomicReference<Map<FieldDescriptor<M, *>, Any>> = AtomicReference(emptyMap())

    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map.get()[fieldDescriptor] as V?
    }

    internal operator fun <V> set(fieldDescriptor: FieldDescriptor<M, V>, value: V) {
        if (value != null) {
            map.set(map.get() + (fieldDescriptor to value))
        } else {
            map.set(map.get() - fieldDescriptor)
        }
    }
}

@PublicForGeneratedCode
public class MutableFieldSet<M : Message> internal constructor() {
    private val map: MutableMap<FieldDescriptor<M, *>, Any> = mutableMapOf()

    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map[fieldDescriptor] as V?
    }

    internal operator fun <V> set(fieldDescriptor: FieldDescriptor<M, V>, value: V) {
        if (value != null) {
            map[fieldDescriptor] = value
        } else {
            map.remove(fieldDescriptor)
        }
    }

    internal fun remove(fieldDescriptor: FieldDescriptor<M, *>) {
        map.remove(fieldDescriptor)
    }

    public fun toFieldSet(): FieldSet<M> {
        return FieldSet(map)
    }
}
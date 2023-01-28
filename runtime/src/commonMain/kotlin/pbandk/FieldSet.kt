package pbandk

import pbandk.gen.ListField
import pbandk.gen.MapField
import pbandk.internal.AtomicReference
import pbandk.internal.FieldIterator

/**
 * A collection of protobuf field values, along with the [FieldDescriptor] for each field. Fields that contain the
 * default value for their type will not be stored in the `FieldSet` and will not be returned during iteration. In
 * other words, there is no way to differentiate between a field that is not present in the `FieldSet` and a field that
 * is set to the field type's default value.
 */
@PublicForGeneratedCode
public class FieldSet<M : Message>
private constructor(private val map: Map<FieldDescriptor<M, out Any?>, Any>) {
    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map[fieldDescriptor] as V?
//        return map.getFieldValueOrDefault(fieldDescriptor)
    }

    internal operator fun contains(fieldDescriptor: FieldDescriptor<M, *>): Boolean {
        return fieldDescriptor in map
    }

    /**
     * Returns a [FieldIterator] over all fields in this set, ordered by increasing field number.
     */
    internal fun iterator(): FieldIterator<M> = Iterator(map.entries.iterator())

    private class Iterator<M : Message>(
        private val iterator: kotlin.collections.Iterator<Map.Entry<FieldDescriptor<M, out Any?>, Any>>
    ) : FieldIterator<M> {
        private var lastEntry: Map.Entry<FieldDescriptor<M, out Any?>, Any>? = null

        override fun hasNext() = iterator.hasNext()

        override fun next() = iterator.next().also { lastEntry = it }.key

        override fun nextValue() = lastEntry?.value
    }

    internal companion object {
        private val Empty = unsafeOf<Nothing>(emptyList())

        @Suppress("UNCHECKED_CAST")
        internal fun <M : Message> empty(): FieldSet<M> = Empty as FieldSet<M>

        /**
         * Assumes that the values in [map] are already the correct type for each corresponding field descriptor. E.g.
         * repeated field values are of type [ListField], map field values are of type [MapField].
         */
        internal fun <M : Message> unsafeOf(mapEntries: Collection<Map.Entry<FieldDescriptor<M, out Any?>, Any>>) =
            // We need to ensure that map iteration will always iterate over the fields in order of increasing field
            // number. So we store the fields in a `LinkedHashMap` (which preserves insertion order when iterating) and
            // sort them by field number before copying them into the map.
            FieldSet(LinkedHashMap<FieldDescriptor<M, out Any?>, Any>(mapEntries.size).apply {
                mapEntries.sortedBy { it.key.metadata.number }.forEach { (fd, value) -> put(fd, value) }
            })

        internal fun <M : Message> of(map: Map<FieldDescriptor<M, out Any?>, Any>): FieldSet<M> {
            val safeEntries = map.entries.filterNot { (fd, value) ->
                fd.fieldType.isDefaultValue(value)
            }.map { (fd, value) ->
                fd to fd.type.canonicalValue(value)
            }
            // We need to ensure that map iteration will always iterate over the fields in order of increasing field
            // number. So we store the fields in a `LinkedHashMap` (which preserves insertion order when iterating) and
            // sort them by field number before copying them into the map.
            return FieldSet(safeEntries.sortedBy { it.first.metadata.number }.toMap(LinkedHashMap(safeEntries.size)))
//                map.filterNot { (fd, value) ->
//                    value == fd.type.defaultValue
//                }.mapValues { (fd, value) ->
//                    fd.canonicalValue(value)
//                }
        }
    }
}

/**
 * A variant of `MutableExtensionFieldSet` that can be safely used from multiple threads **for caching purposes only**.
 * Specifically, the [FieldSetCache.set] method is lossy and can silently drop updates during concurrent
 * updates. When used as a cache, the only impact of this is that the value will have to be recalculated again the next
 * time it is accessed. However, this makes this class unsuitable for any other purposes.
 */
internal class FieldSetCache<M : Message> {
    private val map: AtomicReference<Map<FieldDescriptor<M, out Any?>, Any>> = AtomicReference(emptyMap())

    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map.get()[fieldDescriptor] as V?
//        return map.get().getFieldValueOrDefault(fieldDescriptor)
    }

    internal operator fun <V> set(fieldDescriptor: FieldDescriptor<M, V>, value: V) {
        if (value != null && !fieldDescriptor.fieldType.isDefaultValue(value)) {
            map.set(map.get() + (fieldDescriptor to value))
        } else {
            map.set(map.get() - fieldDescriptor)
        }
    }
}

/**
 * A collection of protobuf field values, along with the [FieldDescriptor] for each field. Fields that contain the
 * default value for their type will not be stored in the `MutableFieldSet`. In other words, there is no way to
 * differentiate between a field that is not present in the `MutableFieldSet` and a field that is set to the field
 * type's default value.
 */
@PublicForGeneratedCode
public class MutableFieldSet<M : Message> internal constructor() {
    private val map: MutableMap<FieldDescriptor<M, out Any?>, Any> = mutableMapOf()

    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map[fieldDescriptor] as V?
//        return map.getFieldValueOrDefault(fieldDescriptor)
    }

    internal operator fun contains(fieldDescriptor: FieldDescriptor<M, *>): Boolean {
        return fieldDescriptor in map
    }

    internal operator fun <V> set(fieldDescriptor: FieldDescriptor<M, V>, value: V) {
        if (value != null) {
            map[fieldDescriptor] = fieldDescriptor.type.canonicalMutableValue(value)
        } else {
            map.remove(fieldDescriptor)
        }
    }

    internal fun remove(fieldDescriptor: FieldDescriptor<M, *>) {
        map.remove(fieldDescriptor)
    }

    public fun toFieldSet(): FieldSet<M> {
        return FieldSet.unsafeOf(map.entries.filterNot { it.key.fieldType.isDefaultValue(it.value) })
    }
}

private fun <M : Message, V> Map<FieldDescriptor<M, out Any?>, Any>.getFieldValueOrDefault(fieldDescriptor: FieldDescriptor<M, V>): V {
    @Suppress("UNCHECKED_CAST")
    return (this[fieldDescriptor] ?: fieldDescriptor.type.defaultValue) as V
}
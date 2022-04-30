package pbandk

import pbandk.internal.AtomicReference

@PublicForGeneratedCode
public class FieldSet<M : Message>
internal constructor(private val map: Map<FieldDescriptor<M, *>, Any> = emptyMap()) {
    internal operator fun <V> get(fieldDescriptor: FieldDescriptor<M, V>): V? {
        @Suppress("UNCHECKED_CAST")
        return map[fieldDescriptor] as V?
    }

    internal fun keys(): Set<FieldDescriptor<M, *>> = map.keys
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
        return FieldSet(map.toMap())
    }
}
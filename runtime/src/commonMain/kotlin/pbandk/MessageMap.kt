package pbandk

import kotlin.js.JsExport
import kotlin.reflect.KClass

@PublicForGeneratedCode
@JsExport
public class MessageMap<K, V> internal constructor(entries: Collection<Entry<K, V>>) : Map<K, V> {
    private val delegate: Map<K, Entry<K, V>> = entries.associateBy(Entry<K, V>::key)

    override val entries: Set<Map.Entry<K, V>> get() = delegate.values.toSet()
    override val keys: Set<K> get() = delegate.keys
    override val size: Int get() = delegate.size

    override val values: Collection<V> get() = delegate.asIterable().map { it.value.value }

    override fun isEmpty(): Boolean = delegate.isEmpty()

    override fun get(key: K): V? = delegate[key]?.value

    override fun containsValue(value: V): Boolean = delegate.asIterable().find { it.value.value == value } != null

    override fun containsKey(key: K): Boolean = delegate.containsKey(key)

    internal fun asMessageCollection(): Collection<Entry<K, V>> = delegate.values

    private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { delegate.values.hashCode() }
    override fun hashCode(): Int = _hashCode

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Map<*, *>) return false
        if (size != other.size) return false

        if (other is MessageMap<*, *>) return delegate == other.delegate

        return other.entries == delegate.values.toSet()
    }

    override fun toString(): String = delegate.values.joinToString(separator = ", ", prefix = "{", postfix = "}") {
        "${it.key}=${it.value}" + if (it.unknownFields.isNotEmpty()) " (has unknown fields)" else ""
    }

    /*
    @PublicForGeneratedCode
    public class Builder<K, V> {
        public val entries: MutableSet<Entry<K, V>> = mutableSetOf()

        public fun fixed(): MessageMap<K, V> = MessageMap(entries)

        @PublicForGeneratedCode
        public companion object {
            public fun <K, V> fixed(bld: Builder<K, V>?): MessageMap<K, V> = bld?.fixed() ?: empty()
        }
    }
     */

    @PublicForGeneratedCode
    public interface Entry<K, V> : Map.Entry<K, V>, Message {
        override fun plus(other: Message?): Entry<K, V>
        override val descriptor: MessageDescriptor<Entry<K, V>>

        @PublicForGeneratedCode
        public class Companion<K, V>(
            internal val keyType: FieldDescriptor.Type, internal val valueType: FieldDescriptor.Type
        ) : Message.Companion<Entry<K, V>> {
            @Suppress("UNCHECKED_CAST")
            override fun decodeWith(u: MessageDecoder): Entry<K, V> {
                var key: K = keyType.defaultValue as K
                var value: V = valueType.defaultValue as V

                val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
                    when (_fieldNumber) {
                        1 -> key = _fieldValue as K
                        2 -> value = _fieldValue as V
                    }
                }
                return MutableMessageMapEntry(key, value, this, unknownFields)
            }

            @Suppress("UNCHECKED_CAST")
            override val descriptor: MessageDescriptor<Entry<K, V>> = MessageDescriptor(
                fullName = "MapFieldEntry",
                messageClass = Entry::class as KClass<Entry<K, V>>,
                messageCompanion = this,
                fields = listOf(
                    FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "key",
                        number = 1,
                        type = keyType,
                        value = Entry<K, V>::key
                    ),
                    FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 2,
                        type = valueType,
                        value = Entry<K, V>::value
                    )
                )
            )
        }
    }

    /*
    public fun Entry(builderAction: MutableMessageMap.MutableEntry<K, V>.() -> Unit): Entry<K, V> =
        MutableMessageMap.MutableEntry<K, V>().also(builderAction).toEntry()

    public class Entry_Impl<K, V>(
        override val key: K,
        override val value: V,
        companion: Entry.Companion<K, V>,
        override val unknownFields: Map<Int, UnknownField> = emptyMap()
    ) : Entry<K, V>, GeneratedMessage<Entry<K, V>>() {
        override val descriptor: MessageDescriptor<Entry<K, V>> = companion.descriptor

        override fun plus(other: Message?): Entry<K, V> = throw UnsupportedOperationException()
    }
     */

    @PublicForGeneratedCode
    public companion object {
        private val Empty = MessageMap<Nothing, Nothing>(emptySet())

        /**
         * Returns a singleton empty map regardless of the type variables.
         */
        @Suppress("UNCHECKED_CAST")
        internal fun <K, V> empty(): MessageMap<K, V> = Empty as MessageMap<K, V>

        public fun <K, V> from(map: MutableMessageMap<K, V>?): MessageMap<K, V> = map?.toMessageMap() ?: empty()

        internal fun <K, V> of(
            keyType: FieldDescriptor.Type, valueType: FieldDescriptor.Type, vararg pairs: Pair<K, V>
        ): MessageMap<K, V> {
            val companion = Entry.Companion<K, V>(keyType, valueType)
            return MutableMessageMap(companion).apply {
                putAll(pairs)
            }.toMessageMap()
        }
    }
}

//@PublicForGeneratedCode
//@JsExport
//public fun <K, V> MutableMessageMap<K, V>?.toMessageMap(): MessageMap<K, V> = this?.toMessageMap() ?: MessageMap.empty()

//@PublicForGeneratedCode
@JsExport
public class MutableMessageMap<K, V>(private val entryCompanion: MessageMap.Entry.Companion<K, V>) : MutableMap<K, V> {
    // Convenience constructor to keep generated code more succinct
    @Suppress("UNCHECKED_CAST")
    public constructor(fieldDescriptor: FieldDescriptor<*, *>?) :
            this((fieldDescriptor!!.type as FieldDescriptor.Type.Map<K, V>).entryCompanion)

    private val delegate: MutableMap<K, MutableEntry<K, V>> = mutableMapOf()

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>> =
        object : MutableSet<MutableMap.MutableEntry<K, V>> {
            override fun add(element: MutableMap.MutableEntry<K, V>) = throw UnsupportedOperationException()

            override fun addAll(elements: Collection<MutableMap.MutableEntry<K, V>>) =
                throw UnsupportedOperationException()

            override val size get() = delegate.size
            override fun clear() = delegate.clear()
            override fun isEmpty() = delegate.isEmpty()

            override fun containsAll(elements: Collection<MutableMap.MutableEntry<K, V>>) =
                elements.all { contains(it) }

            override fun contains(element: MutableMap.MutableEntry<K, V>) =
                delegate[element.key]?.value == element.value

            override fun iterator() = object : MutableIterator<MutableMap.MutableEntry<K, V>> {
                private val iter = delegate.entries.iterator()
                override fun hasNext() = iter.hasNext()
                override fun next() = iter.next().value
                override fun remove() = iter.remove()
            }

            override fun retainAll(elements: Collection<MutableMap.MutableEntry<K, V>>): Boolean {
                val elementsMap =
                    elements.associateBy(MutableMap.MutableEntry<K, V>::key, MutableMap.MutableEntry<K, V>::value)
                return delegate.entries.retainAll { elementsMap[it.key] == it.value.value }
            }

            override fun removeAll(elements: Collection<MutableMap.MutableEntry<K, V>>) =
                elements.map { remove(it) }.any { it }

            override fun remove(element: MutableMap.MutableEntry<K, V>) =
                if (delegate[element.key]?.value == element.value) {
                    delegate.remove(element.key)
                    true
                } else {
                    false
                }
        }

    override val keys: MutableSet<K> get() = delegate.keys
    override val size: Int get() = delegate.size
    override val values: MutableCollection<V> = object : MutableCollection<V> {
        override val size get() = delegate.size
        override fun clear() = delegate.clear()
        override fun addAll(elements: Collection<V>) = throw UnsupportedOperationException()
        override fun add(element: V) = throw UnsupportedOperationException()

        override fun isEmpty() = delegate.isEmpty()

        override fun iterator(): MutableIterator<V> = object : MutableIterator<V> {
            private val iter = delegate.values.iterator()
            override fun hasNext() = iter.hasNext()
            override fun next() = iter.next().value
            override fun remove() = iter.remove()
        }

        override fun retainAll(elements: Collection<V>) = delegate.entries.retainAll { it.value.value in elements }

        override fun removeAll(elements: Collection<V>) = delegate.entries.removeAll { it.value.value in elements }

        override fun remove(element: V) =
            delegate.entries.firstOrNull { it.value.value == element }?.let { delegate.remove(it.key) } != null

        override fun containsAll(elements: Collection<V>) = elements.all { contains(it) }

        override fun contains(element: V) = delegate.any { it.value.value == element }

    }

    override fun clear(): Unit = delegate.clear()

    override fun isEmpty(): Boolean = delegate.isEmpty()

    override fun remove(key: K): V? = delegate.remove(key)?.value

    override fun putAll(from: Map<out K, V>) {
        if (from is MutableMessageMap) {
            @Suppress("UNCHECKED_CAST") delegate.putAll(from.delegate as MutableMap<K, MutableEntry<K, V>>)
        } else {
            from.entries.forEach { put(it.key, it.value) }
        }
    }

    override fun put(key: K, value: V): V? =
        delegate.put(key, MutableMessageMapEntry(key, value, entryCompanion))?.value

    public fun put(entry: Map.Entry<K, V>) {
        if (entry is MutableEntry) {
            delegate[entry.key] = entry
        } else {
            put(entry.key, entry.value)
        }
    }

    public fun putAll(entries: Sequence<Map.Entry<K, V>>) {
        entries.forEach { put(it) }
    }

    override fun get(key: K): V? = delegate[key]?.value

    override fun containsValue(value: V): Boolean = delegate.asIterable().find { it.value.value == value } != null

    override fun containsKey(key: K): Boolean = delegate.containsKey(key)

    override fun hashCode(): Int = delegate.values.hashCode()

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Map<*, *>) return false
        if (size != other.size) return false

        if (other is MutableMessageMap<*, *>) return delegate == other.delegate

        return other.entries == delegate.values.toSet()
    }

    override fun toString(): String = delegate.values.joinToString(separator = ", ", prefix = "{", postfix = "}") {
        "${it.key}=${it.value}" + if (it.unknownFields.isNotEmpty()) " (has unknown fields)" else ""
    }

    internal interface MutableEntry<K, V> : MutableMap.MutableEntry<K, V>, MessageMap.Entry<K, V> /*, MutableMessage {
        override var key: K
        override var value: V

//        fun toEntry(): MessageMap.Entry<K, V>
    }
    */

    public fun toMessageMap(): MessageMap<K, V> = if (isEmpty()) MessageMap.empty() else MessageMap(delegate.values)

}

//private object UninitializedValue

internal class MutableMessageMapEntry<K, V>(
    override val key: K,
    value: V,
    companion: MessageMap.Entry.Companion<K, V>,
    override val unknownFields: Map<Int, UnknownField> = emptyMap()
) : MutableMessageMap.MutableEntry<K, V>, GeneratedMessage<MessageMap.Entry<K, V>>() {

    private var _value: V = value
    override val value: V get() = _value

/*
private class MutableMessageMapEntry<K, V>(
    override var key: K,
    override var value: V,
    companion: MessageMap.Entry.Companion<K, V>,
    override val unknownFields: MutableMap<Int, UnknownField> = mutableMapOf()
) : MutableMessageMap.MutableEntry<K, V>, MutableGeneratedMessage<MutableMessageMap.MutableEntry<K, V>>() {
 */
    /*
    private var _key: Any? = UninitializedValue
    override var key: K
        get() = if (_key === UninitializedValue) error("") else _key as K
        set(value) { _key = value }

    private var _value: Any? = UninitializedValue
    override var value: V
        get() = if (_value === UninitializedValue) error("") else _value as V
        set(value) { _value = value }
     */

    override fun setValue(newValue: V): V {
        val oldValue = _value
        _value = newValue
        return oldValue
    }

    override val descriptor: MessageDescriptor<MessageMap.Entry<K, V>> = companion.descriptor

    override fun plus(other: Message?): MessageMap.Entry<K, V> = throw UnsupportedOperationException()

    override fun hashCode(): Int {
        val hash = (key?.hashCode() ?: 0) xor (value?.hashCode() ?: 0)
        return if (unknownFields.isEmpty()) hash else (31 * hash) + unknownFields.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Map.Entry<*, *>) return false
        if (key != other.key || value != other.value) return false
        if ((other is Message && unknownFields != other.unknownFields) || unknownFields.isNotEmpty()) return false

        return true
    }
}

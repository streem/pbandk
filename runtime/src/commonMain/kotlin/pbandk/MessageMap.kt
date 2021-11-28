package pbandk

import pbandk.internal.binary.Sizer
import kotlin.js.JsExport
import kotlin.reflect.KClass

@PublicForGeneratedCode
@JsExport
public class MessageMap<K, V> internal constructor(override val entries: Set<Entry<K, V>>) : AbstractMap<K, V>() {
    @PublicForGeneratedCode
    public class Builder<K, V> {
        public val entries: MutableSet<Entry<K, V>> = mutableSetOf()

        public fun fixed(): MessageMap<K, V> = MessageMap(entries)

        @PublicForGeneratedCode
        public companion object {
            @Suppress("UNCHECKED_CAST")
            public fun <K, V> fixed(bld: Builder<K, V>?): MessageMap<K, V> = bld?.fixed() ?: Empty as MessageMap<K, V>
        }
    }

    public class Entry<K, V>(
        override val key: K,
        override val value: V,
        companion: Companion<K, V>,
        override val unknownFields: Map<Int, UnknownField> = emptyMap()
    ) : Map.Entry<K, V>, Message {
        override fun plus(other: Message?): Message = throw UnsupportedOperationException()

        override val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { Sizer.rawMessageSize(this) }

        override val descriptor: MessageDescriptor<Entry<K, V>> = companion.descriptor

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false
            other as Entry<*, *>

            if (key != other.key) return false
            if (value != other.value) return false
            if (unknownFields != other.unknownFields) return false

            return true
        }

        private val _hashCode: Int by lazy(LazyThreadSafetyMode.PUBLICATION) {
            var hash = 1
            hash = (31 * hash) + key.hashCode()
            hash = (31 * hash) + value.hashCode()
            hash = (31 * hash) + unknownFields.hashCode()
            hash
        }

        override fun hashCode() = _hashCode

        override fun toString() = buildString {
            append("Entry(")
            append("key=$key, ")
            append("value=$value, ")
            append("unknownFields=$unknownFields")
            appendLine(")")
        }

        public class Companion<K, V>(
            internal val keyType: FieldDescriptor.Type,
            internal val valueType: FieldDescriptor.Type
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
                return Entry(key, value, this, unknownFields)
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
                        value = MessageMap.Entry<K, V>::key
                    ),
                    FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 2,
                        type = valueType,
                        value = MessageMap.Entry<K, V>::value
                    )
                )
            )
        }
    }

    internal companion object {
        val Empty = MessageMap<Nothing, Nothing>(emptySet())

        internal fun <K, V> of(
            keyType: FieldDescriptor.Type,
            valueType: FieldDescriptor.Type,
            vararg pairs: Pair<K, V>
        ): MessageMap<K, V> {
            val companion = Entry.Companion<K, V>(keyType, valueType)
            return Builder<K, V>().apply {
                pairs.mapTo(entries) { (k, v) -> Entry(k, v, companion) }
            }.fixed()
        }
    }
}

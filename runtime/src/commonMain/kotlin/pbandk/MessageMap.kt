package pbandk

import kotlin.reflect.KClass

@PublicForGeneratedCode
class MessageMap<K, V> internal constructor(override val entries: Set<Entry<K, V>>) : AbstractMap<K, V>() {
    class Builder<K, V> {
        val entries = mutableSetOf<Entry<K, V>>()

        fun fixed() = MessageMap(entries)

        companion object {
            @Suppress("UNCHECKED_CAST")
            fun <K, V> fixed(bld: Builder<K, V>?) = bld?.fixed() ?: Empty as MessageMap<K, V>
        }
    }

    class Entry<K, V>(
        override val key: K,
        override val value: V,
        companion: Companion<K, V>,
        override val unknownFields: Map<Int, UnknownField> = emptyMap()
    ) : Map.Entry<K, V>, Message {
        override fun plus(other: Message?) = throw UnsupportedOperationException()

        override val protoSize by lazy { super.protoSize }

        override val descriptor: MessageDescriptor<Entry<K, V>> = companion.descriptor

        class Companion<K, V>(
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

    companion object {
        val Empty = MessageMap<Nothing, Nothing>(emptySet())
    }
}

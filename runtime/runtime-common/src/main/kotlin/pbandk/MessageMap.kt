package pbandk

class MessageMap<K, V> internal constructor(override val entries: Set<Map.Entry<K, V>>) : AbstractMap<K, V>() {
    class Builder<K, V> {
        val entries = mutableMapOf<K, Map.Entry<K, V>>()

        fun fixed() = MessageMap(entries.values.toSet())

        companion object {
            @Suppress("UNCHECKED_CAST")
            fun <K, V> fixed(bld: Builder<K, V>?) = bld?.fixed() ?: MessageMap.Empty as MessageMap<K, V>
        }
    }

    companion object {
        val Empty = MessageMap<Nothing, Nothing>(emptySet())
    }
}

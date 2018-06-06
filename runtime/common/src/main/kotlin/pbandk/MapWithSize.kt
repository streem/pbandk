package pbandk

class MapWithSize<K, V> internal constructor(
    override val entries: Set<Map.Entry<K, V>>,
    val protoSize: Int
) : AbstractMap<K, V>() {
    class Builder<K, V> {
        internal val entries = mutableMapOf<K, Map.Entry<K, V>>()
        internal var protoSize = 0

        fun fixed() = MapWithSize(entries.values.toSet(), protoSize)

        companion object {
            @Suppress("UNCHECKED_CAST")
            fun <K, V> fixed(bld: Builder<K, V>?) = bld?.fixed() ?: MapWithSize.Empty as MapWithSize<K, V>
        }
    }

    companion object {
        val Empty = MapWithSize<Nothing, Nothing>(emptySet(), 0)
    }
}

package pbandk

class MapWithSize<K, V> internal constructor(
    override val entries: Set<Map.Entry<K, V>>,
    val protoSize: Int
) : AbstractMap<K, V>() {
    class Builder<K, V> {
        internal val entries = mutableSetOf<Map.Entry<K, V>>()
        internal var protoSize = 0

        fun fixed() = MapWithSize(entries, protoSize)

        companion object {
            fun <K, V> fixed(bld: Builder<K, V>?) = bld?.fixed() ?: MapWithSize.Empty
        }
    }

    companion object {
        val Empty = MapWithSize(emptySet<Map.Entry<Nothing, Nothing>>(), 0)
    }
}

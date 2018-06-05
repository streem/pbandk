package pbandk

class ListWithSize<T> internal constructor(val list: List<T>, val protoSize: Int) : List<T> by list {

    constructor(list: List<T>, sizeFn: (T) -> Int) : this(list, list.sumBy(sizeFn))

    class Builder<T> {
        internal val list = ArrayList<T>()
        internal var protoSize = 0

        fun add(item: T, size: Int) {
            list += item
            protoSize += size
        }

        fun fixed() = ListWithSize(list.also { it.trimToSize() }, protoSize)

        companion object {
            fun <T> fixed(bld: Builder<T>?) = bld?.fixed() ?: ListWithSize.Empty
        }
    }

    companion object {
        val Empty = ListWithSize(emptyList<Nothing>(), 0)
    }
}

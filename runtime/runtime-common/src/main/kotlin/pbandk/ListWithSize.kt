package pbandk

data class ListWithSize<T> internal constructor(val list: List<T>, val protoSize: Int?) : List<T> by list {
    constructor(list: List<T>, sizeFn: (T) -> Int) : this(list, list.sumBy(sizeFn))

    override fun toString() = list.toString()

    class Builder<T> {
        val list = ArrayList<T>()
        var protoSize: Int? = 0

        fun fixed() = ListWithSize(list.also { it.trimToSize() }, protoSize)

        companion object {
            fun <T> fixed(bld: Builder<T>?) = bld?.fixed() ?: ListWithSize.Empty
        }
    }

    companion object {
        val Empty = ListWithSize(emptyList<Nothing>(), 0)
    }
}

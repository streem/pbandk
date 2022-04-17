package pbandk.gen

import pbandk.PublicForGeneratedCode
import kotlin.js.JsExport
import kotlin.js.JsName

@PublicForGeneratedCode
@JsExport
public class ListWithSize<T> internal constructor(public val list: List<T>, public val protoSize: Int?) : List<T> by list {
    @JsName("initWithSizeFn")
    public constructor(list: List<T>, sizeFn: (T) -> Int) : this(list, list.sumOf(sizeFn))

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    @PublicForGeneratedCode
    public class Builder<T> private constructor(public val list: ArrayList<T>): MutableList<T> by list {
        @JsName("init")
        public constructor() : this(ArrayList())

        public fun fixed(): ListWithSize<T> = ListWithSize(list.also { it.trimToSize() }, protoSize = null)

        @PublicForGeneratedCode
        public companion object {
            public fun <T> fixed(bld: Builder<T>?): ListWithSize<out T> = bld?.fixed() ?: Empty
        }
    }

    internal companion object {
        val Empty = ListWithSize(emptyList<Nothing>(), 0)
    }
}

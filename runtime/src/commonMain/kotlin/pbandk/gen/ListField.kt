package pbandk.gen

import pbandk.PublicForGeneratedCode
import kotlin.js.JsExport
import kotlin.js.JsName

@PublicForGeneratedCode
@JsExport
public class ListField<T> internal constructor(private val list: List<T>, internal val protoSize: Int?) : List<T> by list {
    @JsName("initWithSizeFn")
    public constructor(list: List<T>, sizeFn: (T) -> Int) : this(list, list.sumOf(sizeFn))

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    internal companion object {
        private val Empty = ListField(emptyList<Nothing>(), 0)

        /**
         * Returns a singleton empty list regardless of the type variable.
         */
        @Suppress("UNCHECKED_CAST")
        internal fun <T> empty(): ListField<T> = Empty as ListField<T>
    }
}

@PublicForGeneratedCode
@JsExport
public class MutableListField<T> private constructor(private val list: ArrayList<T>): MutableList<T> by list {
    @JsName("init")
    public constructor() : this(ArrayList())

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    public fun toListField(): ListField<T> =
        // TODO: update ListField.protoSize as each field is read
        //  or maybe just make the field lazy and computed the first time it's accessed?
        if (isEmpty()) ListField.empty() else ListField(list.also { it.trimToSize() }, protoSize = null)
}
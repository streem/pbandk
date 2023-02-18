package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.PublicForGeneratedCode
import pbandk.internal.types.FieldType
import pbandk.internal.types.primitive.Bool
import pbandk.types.ValueType

@PublicForGeneratedCode
public class ListField<T : Any> internal constructor(
    internal val valueType: ValueType<T>,
    private val list: ArrayList<T>,
    internal val protoSize: Int?,
) : List<T> by list {
    public constructor(
        valueType: ValueType<T>,
        list: Collection<T>
    ) : this(valueType, ArrayList(list), protoSize = null)

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    internal companion object {
        // TODO
        private val Empty = ListField(Bool, ArrayList(), 0)

        /**
         * Returns a singleton empty list regardless of the type variable.
         */
        @Suppress("UNCHECKED_CAST")
        internal fun <T : Any> empty(): ListField<T> = Empty as ListField<T>
    }
}

@PublicForGeneratedCode
public class MutableListField<T : Any> private constructor(
    internal val valueType: ValueType<T>,
    private val list: ArrayList<T>,
) : MutableList<T> by list {
    public constructor(valueType: ValueType<T>) : this(valueType, ArrayList())

    // Convenience factory function to keep generated code more succinct
    @PublicForGeneratedCode
    @Suppress("UNCHECKED_CAST")
    public constructor(fieldDescriptor: FieldDescriptor<*, *>) : this((fieldDescriptor.fieldType as FieldType.Repeated<T>).valueType)

    internal constructor(valueType: ValueType<T>, list: Collection<T>) : this(valueType, ArrayList(list))

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    public fun toListField(): ListField<T> =
        // TODO: update ListField.protoSize as each field is read
        //  or maybe just make the field lazy and computed the first time it's accessed?
        if (isEmpty()) ListField.empty() else ListField(valueType, list.also { it.trimToSize() }, protoSize = null)
}
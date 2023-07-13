package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.PublicForGeneratedCode
import pbandk.internal.types.FieldType
import pbandk.internal.types.primitive.Nothing
import pbandk.types.ValueType

@PublicForGeneratedCode
public class ListField<T : Any> internal constructor(
    private val valueType: ValueType<T>,
    private val list: ArrayList<T>,
) : List<T> by list {
    public constructor(valueType: ValueType<T>, list: Collection<T>) : this(valueType, ArrayList(list))

    internal val protoSize: Int by lazy(LazyThreadSafetyMode.PUBLICATION) { list.sumOf(valueType::binarySize) }

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    internal companion object {
        private val Empty = ListField(valueType = Nothing, list = ArrayList())

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
    public constructor(fieldDescriptor: FieldDescriptor<*, *>) : this(
        (fieldDescriptor.fieldType as FieldType.Repeated<T>).valueType
    )

    internal constructor(valueType: ValueType<T>, list: Collection<T>) : this(valueType, ArrayList(list))

    override fun equals(other: Any?): Boolean = list == other
    override fun hashCode(): Int = list.hashCode()
    override fun toString(): String = list.toString()

    public fun toListField(): ListField<T> =
        if (isEmpty()) ListField.empty() else ListField(valueType, list.also { it.trimToSize() })
}
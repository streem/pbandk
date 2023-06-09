package pbandk.gen

import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.PublicForGeneratedCode

public abstract class GeneratedOneOf<M : Message, V : Any>
@PublicForGeneratedCode
protected constructor(
    public override val value: V,
    internal val fieldDescriptor: FieldDescriptor<M, V?>
) : Message.OneOf<V> {
    override fun equals(other: Any?): Boolean =
        this::class.isInstance(other) && value == (other as Message.OneOf<*>).value

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = "OneOf.${this::class.simpleName}($value)"
}
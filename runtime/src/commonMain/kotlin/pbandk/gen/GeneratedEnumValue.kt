package pbandk.gen

import pbandk.Message
import pbandk.PublicForGeneratedCode

public abstract class GeneratedEnumValue<E : Message.Enum>
@PublicForGeneratedCode
protected constructor(
    final override val value: Int,
    final override val name: String,
) : Message.Enum {
    override fun equals(other: Any?): Boolean = other === this

    private val _hashCode: Int = value.hashCode()
    override fun hashCode(): Int = _hashCode

    override fun toString(): String = "${descriptor.name}.${name}(value=$value)"
}

public abstract class UnrecognizedEnumValue<E : Message.Enum> : Message.Enum {
    override fun equals(other: Any?): Boolean {
        if (!this::class.isInstance(other)) return false
        other as UnrecognizedEnumValue<*>
        return value == other.value && name == other.name
    }

    override fun hashCode(): Int = (31 * value.hashCode()) + name.hashCode()

    override fun toString(): String {
        return "${descriptor.name}.${name ?: "UNRECOGNIZED"}(value=${value ?: "UNRECOGNIZED"})"
    }

    // public abstract class Companion<V : UnrecognizedEnumValue<*>>(
    //     private val constructor: (value: Int?, name: String?) -> V
    // ) {
    //     public open fun value(value: Int): V = constructor(value, null)
    //     public open fun name(name: String): V = constructor(null, name)
    // }
}
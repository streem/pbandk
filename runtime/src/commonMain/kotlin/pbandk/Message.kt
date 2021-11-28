package pbandk

import pbandk.internal.binary.Sizer
import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.allocate
import pbandk.internal.binary.fromByteArray
import kotlin.js.JsExport
import kotlin.reflect.KProperty1

public interface Message {
    public val unknownFields: Map<Int, UnknownField>

    public val descriptor: MessageDescriptor<out Message>

    public val protoSize: Int

    public operator fun plus(other: Message?): Message

    public interface Companion<T : Message> {
        public fun decodeWith(u: MessageDecoder): T

        public val descriptor: MessageDescriptor<T>
    }

    public interface Enum {
        public val value: Int
        public val name: String?

        public interface Companion<T : Enum> {
            /** Returns `T.UNRECOGNIZED` if [value] is not a known value of this enum. */
            public fun fromValue(value: Int): T

            /** Throws [IllegalArgumentException] if [name] is not a valid value of this enum. */
            public fun fromName(name: String): T
        }
    }

    public abstract class OneOf<T>(public val value: T) {
        override fun equals(other: Any?): Boolean = this::class.isInstance(other) && value == (other as OneOf<*>).value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "OneOf.${this::class.simpleName}($value)"
    }

}

@JsExport
public fun <T : Message> T.encodeWith(m: MessageEncoder): Unit = m.writeMessage(this)

/**
 * Encode this message to a ByteArray using the protocol buffer binary encoding.
 */
@JsExport
public fun <T : Message> T.encodeToByteArray(): ByteArray =
    BinaryMessageEncoder.allocate(protoSize).also { encodeWith(it) }.toByteArray()

/**
 * Decode a binary protocol buffer message from [arr].
 */
@JsExport
public fun <T : Message> Message.Companion<T>.decodeFromByteArray(arr: ByteArray): T =
    decodeWith(BinaryMessageDecoder.fromByteArray(arr))

@Suppress("UNCHECKED_CAST")
@JsExport
public operator fun <T : Message> T?.plus(other: T?): T? = this?.plus(other) as T? ?: other

/**
 * Returns the value of the protocol buffer field from this message that is described by [fieldDescriptor]. If this
 * message does not contain a value for this field, the field's default value will be returned.
 *
 * [fieldDescriptor] can be a descriptor for an extension field that was not defined on the original message, but it
 * _MUST_ be a descriptor for fields in messages of type [T].
 */
@ExperimentalProtoReflection
public fun <T : Message, F> T.getFieldValue(fieldDescriptor: FieldDescriptor<out T, out F>): F {
    @Suppress("UNCHECKED_CAST")
    val property = fieldDescriptor.value as KProperty1<T, F>
    return property.get(this)
}

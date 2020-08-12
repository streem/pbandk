package pbandk

import pbandk.internal.binary.Sizer
import pbandk.internal.binary.BinaryMessageMarshaller
import pbandk.internal.binary.BinaryMessageUnmarshaller
import pbandk.internal.binary.allocate
import pbandk.internal.binary.fromByteArray

interface Message {
    val unknownFields: Map<Int, UnknownField>

    val fieldDescriptors: List<FieldDescriptor<*>>
    val protoSize: Int get() = Sizer.rawMessageSize(this)

    operator fun plus(other: Message?): Message

    interface Companion<T : Message> {
        fun unmarshal(u: MessageUnmarshaller): T

        val fieldDescriptors: List<FieldDescriptor<*>>
    }

    interface Enum {
        val value: Int
        val name: String?

        interface Companion<T : Enum> {
            /** Returns `T.UNRECOGNIZED` if [value] is not a known value of this enum. */
            fun fromValue(value: Int): T

            /** Throws [IllegalArgumentException] if [name] is not a valid value of this enum. */
            fun fromName(name: String): T
        }
    }

    abstract class OneOf<T>(val value: T) {
        override fun equals(other: Any?) = this::class.isInstance(other) && value == (other as OneOf<*>).value
        override fun hashCode() = value.hashCode()
        override fun toString() = "OneOf.${this::class.simpleName}($value)"
    }

}

fun <T : Message> T.marshal(m: MessageMarshaller): Unit = m.writeMessage(this)

fun <T : Message> T.protoMarshal(): ByteArray =
    BinaryMessageMarshaller.allocate(protoSize).also { marshal(it) }.toByteArray()

fun <T : Message> Message.Companion<T>.protoUnmarshal(arr: ByteArray): T =
    unmarshal(BinaryMessageUnmarshaller.fromByteArray(arr))

@Suppress("UNCHECKED_CAST")
operator fun <T : Message> T?.plus(other: T?): T? = this?.plus(other) as T? ?: other

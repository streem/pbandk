package pbandk

import pbandk.internal.binary.Sizer
import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.allocate
import pbandk.internal.binary.fromByteArray

interface Message {
    val unknownFields: Map<Int, UnknownField>

    val descriptor: MessageDescriptor<out Message>
    val protoSize: Int get() = Sizer.rawMessageSize(this)

    operator fun plus(other: Message?): Message

    interface Companion<T : Message> {
        fun decodeWith(u: MessageDecoder): T

        val descriptor: MessageDescriptor<T>
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

fun <T : Message> T.encodeWith(m: MessageEncoder): Unit = m.writeMessage(this)

fun <T : Message> T.encodeToByteArray(): ByteArray =
    BinaryMessageEncoder.allocate(protoSize).also { encodeWith(it) }.toByteArray()

fun <T : Message> Message.Companion<T>.decodeFromByteArray(arr: ByteArray): T =
    decodeWith(BinaryMessageDecoder.fromByteArray(arr))

@Suppress("UNCHECKED_CAST")
operator fun <T : Message> T?.plus(other: T?): T? = this?.plus(other) as T? ?: other

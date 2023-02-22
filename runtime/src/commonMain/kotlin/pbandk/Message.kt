package pbandk

import pbandk.internal.binary.BinaryMessageEncoder
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.allocate
import pbandk.internal.binary.fromByteArray
import pbandk.internal.types.MessageValueType
import pbandk.internal.types.wkt.customJsonMappings
import pbandk.types.ValueType
import kotlin.js.JsExport

public interface Message {
    public val unknownFields: Map<Int, UnknownField>

    public val descriptor: MessageDescriptor<out Message>

    public val protoSize: Int

    public operator fun plus(other: Message?): Message

    /**
     * Returns the value of the protocol buffer field from this message that is described by [fieldDescriptor]. If this
     * message does not contain a value for this field, the field's default value will be returned.
     *
     * [fieldDescriptor] can be a descriptor for an extension field that was not defined on the original message, but it
     * _MUST_ be a descriptor for fields in messages of type [M].
     */
    @ExperimentalProtoReflection
    public fun <V> getFieldValue(fieldDescriptor: FieldDescriptor<*, V>): V

    public abstract class Companion<M : Message> {
        public abstract val descriptor: MessageDescriptor<M>
        public abstract val defaultInstance: M

        @PublicForGeneratedCode
        public val messageValueType: ValueType<M> by lazy {
            customJsonMappings[this]?.let {
                @Suppress("UNCHECKED_CAST")
                it as? MessageValueType<M>
            } ?: MessageValueType(this)
        }
    }

    public interface Enum {
        public val value: Int?
        public val name: String?

        public val descriptor: EnumDescriptor<out Enum>

        public interface Companion<E : Enum> {
            public val descriptor: EnumDescriptor<E>

            /** Returns `E.UNRECOGNIZED` if [value] is not a known value of this enum. */
            public fun fromValue(value: Int): E

            /** Throws [IllegalArgumentException] if [name] is not a valid value of this enum. */
            public fun fromName(name: String): E
        }
    }

    public interface OneOf<V : Any> {
        public val value: V
    }

}

@JsExport
@JsName("encodeMessage")
public fun <M : Message> M.encodeWith(m: MessageEncoder): Unit = m.writeMessage(this)

@JsExport
@JsName("decodeMessage")
public fun <M : Message> Message.Companion<M>.decodeWith(m: MessageDecoder): M = m.readMessage(this)

/**
 * Encode this message to a ByteArray using the protocol buffer binary encoding.
 */
@JsExport
public fun <M : Message> M.encodeToByteArray(): ByteArray =
    BinaryMessageEncoder.allocate(protoSize).also { encodeWith(it) }.toByteArray()

/**
 * Decode a binary protocol buffer message from [arr].
 */
@JsExport
public fun <M : Message> Message.Companion<M>.decodeFromByteArray(arr: ByteArray): M =
    decodeWith(BinaryMessageDecoder.fromByteArray(arr))

@Suppress("UNCHECKED_CAST")
@JsExport
public operator fun <M : Message> M?.plus(other: M?): M? = this?.plus(other) as M? ?: other

/**
 * Returns the value of the protocol buffer field from this message that is described by [fieldDescriptor]. If this
 * message does not contain a value for this field, the field's default value will be returned.
 *
 * [fieldDescriptor] can be a descriptor for an extension field that was not defined on the original message, but it
 * _MUST_ be a descriptor for fields in messages of type [M].
 */
//@ExperimentalProtoReflection
//public fun <M : Message, V : Any> M.getFieldValue(fieldDescriptor: FieldDescriptor<M, out V>): V? {
//    return fieldDescriptor.getValue(this)
//}
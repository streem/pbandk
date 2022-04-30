package pbandk

import pbandk.gen.MapField
import pbandk.internal.binary.WireType
import pbandk.wkt.FieldOptions
import kotlin.js.JsExport
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

@JsExport
public class FieldDescriptor<M : Message, V> private constructor(
    getMessageDescriptor: () -> MessageDescriptor<M>,
    @ExperimentalProtoReflection
    public val name: String,
    internal val number: Int,
    internal val type: Type,
    /**
     * Returns the value of this field in the provided message.
     */
    internal val getValue: (M) -> V,
    /**
     * Sets or updates the value of this field in the provided message.
     *
     * NOTE: For `List` and `Map` fields, this function _appends_ to the existing list/map value rather than replacing
     * the value. For all other fields, this function replaces the value with the new value.
     */
    internal val updateValue: (MutableMessage<M>, V) -> Unit,
    internal val oneofMember: Boolean = false,
    internal val jsonName: String? = null,
    @ExperimentalProtoReflection
    public val options: FieldOptions = FieldOptions.defaultInstance
) : Comparable<FieldDescriptor<M, V>> {
    // At the time that the [FieldDescriptor] constructor is called, the parent [MessageDescriptor] has not been
    // constructed yet. This is because this [FieldDescriptor] is one of the parameters that will be passed to the
    // [MessageDescriptor] constructor. To avoid the circular dependency, this property is declared lazy.
    internal val messageDescriptor: MessageDescriptor<M> by lazy(LazyThreadSafetyMode.PUBLICATION) { getMessageDescriptor() }

    /**
     * FieldDescriptors are sorted by their field number.
     */
    override fun compareTo(other: FieldDescriptor<M, V>): Int {
        require(messageDescriptor == other.messageDescriptor) {
            "Only FieldDescriptors of the same message can be compared"
        }
        return number - other.number
    }

    @PublicForGeneratedCode
    public sealed class Type {
        internal abstract val hasPresence: Boolean
        internal abstract val isPackable: Boolean
        internal abstract val wireType: WireType
        internal abstract val defaultValue: Any?

        internal abstract fun isDefaultValue(value: Any?): Boolean

        @PublicForGeneratedCode
        public sealed class Primitive<KotlinT : Any>(override val defaultValue: KotlinT) : Type() {

            override val isPackable: Boolean get() = wireType != WireType.LENGTH_DELIMITED

            @Suppress("UNCHECKED_CAST")
            override fun isDefaultValue(value: Any?) =
                if (hasPresence) value == null else (value as? KotlinT) == defaultValue

            @PublicForGeneratedCode
            public class Double(override val hasPresence: Boolean = false) : Primitive<kotlin.Double>(0.0) {
                override val wireType: WireType get() = WireType.FIXED64
            }

            @PublicForGeneratedCode
            public class Float(override val hasPresence: Boolean = false) : Primitive<kotlin.Float>(0.0f) {
                override val wireType: WireType get() = WireType.FIXED32
            }

            @PublicForGeneratedCode
            public class Int64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val wireType: WireType get() = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class UInt64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val wireType: WireType get() = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class Int32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val wireType: WireType get() = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class Fixed64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val wireType: WireType get() = WireType.FIXED64
            }

            @PublicForGeneratedCode
            public class Fixed32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val wireType: WireType get() = WireType.FIXED32
            }

            @PublicForGeneratedCode
            public class Bool(override val hasPresence: Boolean = false) : Primitive<Boolean>(false) {
                override val wireType: WireType get() = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class String(override val hasPresence: Boolean = false) : Primitive<kotlin.String>("") {
                override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            }

            @PublicForGeneratedCode
            public class Bytes(override val hasPresence: Boolean = false) : Primitive<ByteArr>(ByteArr.empty) {
                override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            }

            @PublicForGeneratedCode
            public class UInt32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val wireType: WireType get() = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class SFixed32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val wireType: WireType get() = WireType.FIXED32
            }

            @PublicForGeneratedCode
            public class SFixed64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val wireType: WireType get() = WireType.FIXED64
            }

            @PublicForGeneratedCode
            public class SInt32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val wireType: WireType get() = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class SInt64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val wireType: WireType get() = WireType.VARINT
            }
        }

        @PublicForGeneratedCode
        public class Message<M : pbandk.Message>(internal val messageCompanion: pbandk.Message.Companion<M>) : Type() {
            override val hasPresence get() = true
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            override val defaultValue: Any? get() = null
            override fun isDefaultValue(value: Any?) = value == null
        }

        @PublicForGeneratedCode
        public class Enum<E : pbandk.Message.Enum>(
            internal val enumCompanion: pbandk.Message.Enum.Companion<E>,
            override val hasPresence: Boolean = false
        ) : Type() {
            override val isPackable: Boolean get() = true
            override val wireType: WireType get() = WireType.VARINT
            override val defaultValue: Any? = enumCompanion.fromValue(0)
            override fun isDefaultValue(value: Any?) = (value as? pbandk.Message.Enum)?.value == 0
        }

        // TODO: replace [packed] with [FieldOptions] to be able to support custom options in the future
        @PublicForGeneratedCode
        public class Repeated<T : Any>(internal val valueType: Type, public val packed: Boolean = false) : Type() {
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = valueType.wireType
            override val defaultValue: Any? = emptyList<T>()
            override fun isDefaultValue(value: Any?) = (value as? List<*>)?.isEmpty() == true
        }

        @PublicForGeneratedCode
        public class Map<K, V>(keyType: Type, valueType: Type) : Type() {
            internal val entryCompanion: MapField.Entry.Companion<K, V> =
                MapField.Entry.Companion(keyType, valueType)
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            override val defaultValue: Any? = emptyMap<K, V>()
            override fun isDefaultValue(value: Any?) = (value as? kotlin.collections.Map<*, *>)?.isEmpty() == true
        }
    }

    public companion object {
        @PublicForGeneratedCode
        @Suppress("UNCHECKED_CAST")
        public fun <M : Message, MM : MutableMessage<M>, V> of(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type,
            value: KProperty1<M, V>,
            mutableValue: KMutableProperty1<MM, V>,
            jsonName: String? = null,
            options: FieldOptions = FieldOptions.defaultInstance
        ): FieldDescriptor<M, V> = FieldDescriptor(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            getValue = value::get,
            updateValue = mutableValue::set as (MutableMessage<M>, V) -> Unit,
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        @Suppress("UNCHECKED_CAST")
        public fun <M : Message, MM : MutableMessage<M>, V : Any> ofOneof(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type,
            value: KProperty1<M, V?>,
            mutableValue: KMutableProperty1<MM, V?>,
            jsonName: String? = null,
            options: FieldOptions = FieldOptions.defaultInstance
        ): FieldDescriptor<M, V?> = FieldDescriptor(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            getValue = value::get,
            updateValue = mutableValue::set as (MutableMessage<M>, V?) -> Unit,
            oneofMember = true,
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, T : Any> ofRepeated(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type.Repeated<T>,
            value: KProperty1<M, List<T>>,
            mutableValue: KProperty1<MM, MutableList<T>>,
            jsonName: String? = null,
            options: FieldOptions = FieldOptions.defaultInstance
        ): FieldDescriptor<M, List<T>> = FieldDescriptor(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            getValue = value::get,
            updateValue = mutableValue::appendList,
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, K, V> ofMap(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type.Map<K, V>,
            value: KProperty1<M, Map<K, V>>,
            mutableValue: KProperty1<MM, MutableMap<K, V>>,
            jsonName: String? = null,
            options: FieldOptions = FieldOptions.defaultInstance
        ): FieldDescriptor<M, Map<K, V>> = FieldDescriptor(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            getValue = value::get,
            updateValue = mutableValue::appendMap,
            jsonName = jsonName,
            options = options
        )

    }

}

private fun <M : Message, MM : MutableMessage<M>, T> KProperty1<MM, MutableList<T>>.appendList(
    message: MutableMessage<M>,
    newValue: List<T>,
) {
    @Suppress("UNCHECKED_CAST")
    get(message as MM).addAll(newValue)
}

private fun <M : Message, MM : MutableMessage<M>, K, V> KProperty1<MM, MutableMap<K, V>>.appendMap(
    message: MutableMessage<M>,
    newValue: Map<K, V>
) {
    @Suppress("UNCHECKED_CAST")
    get(message as MM).putAll(newValue)
}
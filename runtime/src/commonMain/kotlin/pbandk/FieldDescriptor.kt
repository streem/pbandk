package pbandk

import pbandk.gen.MessageMap
import pbandk.internal.binary.WireType
import pbandk.wkt.FieldOptions
import kotlin.js.JsExport
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

@JsExport
public class FieldDescriptor<M : Message, T> @PublicForGeneratedCode constructor(
    messageDescriptor: KProperty0<MessageDescriptor<M>>,
    @ExperimentalProtoReflection
    public val name: String,
    internal val number: Int,
    internal val type: Type,
    internal val value: KProperty1<M, T>,
    internal val mutableValue: KMutableProperty1<out MutableMessage<M>, T>? = null,
    internal val oneofMember: Boolean = false,
    internal val jsonName: String? = null,
    @ExperimentalProtoReflection
    public val options: FieldOptions = FieldOptions.defaultInstance
) {
    // At the time that the [FieldDescriptor] constructor is called, the parent [MessageDescriptor] has not been
    // constructed yet. This is because this [FieldDescriptor] is one of the parameters that will be passed to the
    // [MessageDescriptor] constructor. To avoid the circular dependency, this property is declared lazy.
    internal val messageDescriptor: MessageDescriptor<M> by lazy { messageDescriptor.get() }

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
        public class Message<T : pbandk.Message>(internal val messageCompanion: pbandk.Message.Companion<T>) : Type() {
            override val hasPresence get() = true
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            override val defaultValue: Any? get() = null
            override fun isDefaultValue(value: Any?) = value == null
        }

        @PublicForGeneratedCode
        public class Enum<T : pbandk.Message.Enum>(
            internal val enumCompanion: pbandk.Message.Enum.Companion<T>,
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
            internal val entryCompanion: MessageMap.Entry.Companion<K, V> =
                MessageMap.Entry.Companion(keyType, valueType)
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            override val defaultValue: Any? = emptyMap<K, V>()
            override fun isDefaultValue(value: Any?) = (value as? kotlin.collections.Map<*, *>)?.isEmpty() == true
        }
    }


}

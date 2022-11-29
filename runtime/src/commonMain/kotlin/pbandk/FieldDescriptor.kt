package pbandk

import pbandk.gen.ListField
import pbandk.gen.MapField
import pbandk.gen.MutableListField
import pbandk.gen.MutableMapField
import pbandk.internal.binary.WireType
import pbandk.types.FieldType
import pbandk.wkt.FieldOptions
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

public class FieldMetadata(
    /** The field's unqualified name. */
    @ExperimentalProtoReflection
    public val name: String,
    internal val number: Int,
    internal val jsonName: String,
    internal val isOneofMember: Boolean,
    internal val isExtension: Boolean,

    // TODO(still needed?): This has to be indirect to avoid a circular dependency when initializing the [FieldOptions]
    //  class, which has its own [FieldDescriptor]s that it tries to initialize.
    @ExperimentalProtoReflection
    public val options: FieldOptions = FieldOptions.defaultInstance,
) {
    /**
     * The field's fully-qualified name.
     *
     * For a regular field, this will be the fully-qualified name of the field's enclosing message combined with the
     * field's [name].
     *
     * For an extension field, the fully-qualified name describes where the extension field is defined, _not_ which
     * message it extends. In other words, the `fullName` of these two extension fields:
     *
     * ```proto
     * package foo.bar;
     * extend Baz {
     *   optional int32 usage_count = 200;
     * }
     * message Fizz {
     *   extend Baz {
     *     optional string fizz_label = 300;
     *   }
     * }
     * ```
     *
     * is `foo.bar.usage_count` and `foo.bar.Fizz.fizz_label`, respectively. `Baz`, the message being extended, is not
     * part of the extension field's name.
     */
    @ExperimentalProtoReflection
    public abstract val fullName: String
}

public sealed class FieldDescriptor<M : Message, V> private constructor(
    getMessageDescriptor: () -> MessageDescriptor<M>,
    internal val metadata: FieldMetadata,
    internal val type: Type,
    internal val fieldType: FieldType<V>,
    internal val accessor: FieldAccessor<M, *, V>,
) : Comparable<FieldDescriptor<M, *>> {

    /** The field's unqualified name. */
    @ExperimentalProtoReflection
    public val name: String get() = metadata.name

    internal val number: Int get() = metadata.number
    internal val jsonName: String get() = metadata.jsonName

    @ExperimentalProtoReflection
    public val options: FieldOptions get() = metadata.options

    // At the time that the [FieldDescriptor] constructor is called, the parent [MessageDescriptor] has not been
    // constructed yet. This is because this [FieldDescriptor] is one of the parameters that will be passed to the
    // [MessageDescriptor] constructor. To avoid the circular dependency, this property is declared lazy.
    internal val messageDescriptor: MessageDescriptor<M> by lazy(LazyThreadSafetyMode.PUBLICATION) { getMessageDescriptor() }

    /**
     * The field's fully-qualified name.
     *
     * For a regular field, this will be the fully-qualified name of the field's enclosing message combined with the
     * field's [name].
     *
     * For an extension field, the fully-qualified name describes where the extension field is defined, _not_ which
     * message it extends. In other words, the `fullName` of these two extension fields:
     *
     * ```proto
     * package foo.bar;
     * extend Baz {
     *   optional int32 usage_count = 200;
     * }
     * message Fizz {
     *   extend Baz {
     *     optional string fizz_label = 300;
     *   }
     * }
     * ```
     *
     * is `foo.bar.usage_count` and `foo.bar.Fizz.fizz_label`, respectively. `Baz`, the message being extended, is not
     * part of the extension field's name.
     */
    @ExperimentalProtoReflection
    public val fullName: String get() = metadata.fullName

    /**
     * FieldDescriptors are sorted by their field number.
     */
    override fun compareTo(other: FieldDescriptor<M, *>): Int {
        require(messageDescriptor == other.messageDescriptor) {
            "Only FieldDescriptors of the same message can be compared"
        }
        return number - other.number
    }

    internal class Standard<M : Message, MM : MutableMessage<M>, V>(
        getMessageDescriptor: () -> MessageDescriptor<M>,
        name: String,
        number: Int,
        type: Type,
        internal val accessor: FieldAccessor<M, MM, V>,
        override val isOneofMember: Boolean = false,
        jsonName: String,
        options: FieldOptions? = null,
    ) : FieldDescriptor<M, V>(
        getMessageDescriptor = getMessageDescriptor,
        name = name,
        number = number,
        type = type,
        jsonName = jsonName,
        _options = options,
    ) {
        override val isExtension: Boolean get() = false
        override val fullName: String get() = "${messageDescriptor.fullName}.${name}"
    }

    internal class Extension<M : ExtendableMessage<M>, V>(
        getMessageDescriptor: () -> MessageDescriptor<M>,
        extensionName: String,
        number: Int,
        type: Type,
        jsonName: String,
        options: FieldOptions? = null,
    ) : FieldDescriptor<M, V>(
        getMessageDescriptor = getMessageDescriptor,
        name = extensionName.substringAfterLast('.'),
        number = number,
        type = type,
        jsonName = jsonName,
        _options = options,
    ) {
        override val isOneofMember: Boolean get() = false
        override val isExtension get() = true
        override val fullName = extensionName
    }

    @PublicForGeneratedCode
    public sealed class Type {
        internal abstract val hasPresence: Boolean
        internal abstract val isPackable: Boolean
        internal abstract val wireType: WireType
        internal abstract val kotlinType: KClass<*>
        internal abstract val noPresenceDefaultValue: Any
        internal abstract val defaultValue: Any?

        internal open fun canonicalValue(value: Any): Any {
            require(kotlinType.isInstance(value))
            return value
        }

        internal open fun canonicalMutableValue(value: Any): Any {
            require(kotlinType.isInstance(value))
            return value
        }

        @PublicForGeneratedCode
        public sealed class Primitive<KotlinT : Any> : Type() {

            abstract override val kotlinType: KClass<KotlinT>
            abstract override val noPresenceDefaultValue: KotlinT

            override val isPackable: Boolean get() = wireType != WireType.LENGTH_DELIMITED
            override val defaultValue: KotlinT? get() = if (hasPresence) null else noPresenceDefaultValue

            @PublicForGeneratedCode
            public class Double(override val hasPresence: Boolean = false) : Primitive<kotlin.Double>() {
                override val kotlinType = kotlin.Double::class
                override val noPresenceDefaultValue = 0.0
                override val wireType = WireType.FIXED64
            }

            @PublicForGeneratedCode
            public class Float(override val hasPresence: Boolean = false) : Primitive<kotlin.Float>() {
                override val kotlinType = kotlin.Float::class
                override val noPresenceDefaultValue = 0.0f
                override val wireType = WireType.FIXED32
            }

            @PublicForGeneratedCode
            public class Int64(override val hasPresence: Boolean = false) : Primitive<Long>() {
                override val kotlinType = Long::class
                override val noPresenceDefaultValue = 0L
                override val wireType = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class UInt64(override val hasPresence: Boolean = false) : Primitive<Long>() {
                override val kotlinType = Long::class
                override val noPresenceDefaultValue = 0L
                override val wireType = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class Int32(override val hasPresence: Boolean = false) : Primitive<Int>() {
                override val kotlinType = Int::class
                override val noPresenceDefaultValue = 0
                override val wireType = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class Fixed64(override val hasPresence: Boolean = false) : Primitive<Long>() {
                override val kotlinType = Long::class
                override val noPresenceDefaultValue = 0L
                override val wireType = WireType.FIXED64
            }

            @PublicForGeneratedCode
            public class Fixed32(override val hasPresence: Boolean = false) : Primitive<Int>() {
                override val kotlinType = Int::class
                override val noPresenceDefaultValue = 0
                override val wireType = WireType.FIXED32
            }

            @PublicForGeneratedCode
            public class Bool(override val hasPresence: Boolean = false) : Primitive<Boolean>() {
                override val kotlinType = Boolean::class
                override val noPresenceDefaultValue = false
                override val wireType = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class String(override val hasPresence: Boolean = false) : Primitive<kotlin.String>() {
                override val kotlinType = kotlin.String::class
                override val noPresenceDefaultValue = ""
                override val wireType = WireType.LENGTH_DELIMITED
            }

            @PublicForGeneratedCode
            public class Bytes(override val hasPresence: Boolean = false) : Primitive<ByteArr>() {
                override val kotlinType = ByteArr::class
                override val noPresenceDefaultValue = ByteArr.empty
                override val wireType = WireType.LENGTH_DELIMITED
            }

            @PublicForGeneratedCode
            public class UInt32(override val hasPresence: Boolean = false) : Primitive<Int>() {
                override val kotlinType = Int::class
                override val noPresenceDefaultValue = 0
                override val wireType = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class SFixed32(override val hasPresence: Boolean = false) : Primitive<Int>() {
                override val kotlinType = Int::class
                override val noPresenceDefaultValue = 0
                override val wireType = WireType.FIXED32
            }

            @PublicForGeneratedCode
            public class SFixed64(override val hasPresence: Boolean = false) : Primitive<Long>() {
                override val kotlinType = Long::class
                override val noPresenceDefaultValue = 0L
                override val wireType = WireType.FIXED64
            }

            @PublicForGeneratedCode
            public class SInt32(override val hasPresence: Boolean = false) : Primitive<Int>() {
                override val kotlinType = Int::class
                override val noPresenceDefaultValue = 0
                override val wireType = WireType.VARINT
            }

            @PublicForGeneratedCode
            public class SInt64(override val hasPresence: Boolean = false) : Primitive<Long>() {
                override val kotlinType = Long::class
                override val noPresenceDefaultValue = 0L
                override val wireType = WireType.VARINT
            }
        }

        @PublicForGeneratedCode
        public class Message<M : pbandk.Message>(
            internal val messageCompanion: pbandk.Message.Companion<M>,
            override val kotlinType: KClass<M>,
        ) : Type() {
            override val hasPresence get() = true
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = WireType.LENGTH_DELIMITED

            // TODO
            override val noPresenceDefaultValue: M get() = messageCompanion.decodeFromByteArray(byteArrayOf())
            override val defaultValue: M? get() = null
        }

        @PublicForGeneratedCode
        public class Enum<E : pbandk.Message.Enum>(
            internal val enumCompanion: pbandk.Message.Enum.Companion<E>,
            override val kotlinType: KClass<E>,
            override val hasPresence: Boolean = false
        ) : Type() {
            override val isPackable: Boolean get() = true
            override val wireType: WireType get() = WireType.VARINT
            override val noPresenceDefaultValue: E = enumCompanion.fromValue(0)
            override val defaultValue: E? = if (hasPresence) null else noPresenceDefaultValue
        }

        // TODO: replace [packed] with [FieldOptions] to be able to support custom options in the future
        @PublicForGeneratedCode
        public class Repeated<T : Any>(internal val valueType: Type, public val packed: Boolean = false) : Type() {
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = valueType.wireType
            override val kotlinType: KClass<List<*>> get() = List::class
            override val noPresenceDefaultValue: List<T> = ListField.empty()
            override val defaultValue: List<T> = ListField.empty()

            override fun canonicalValue(value: Any): Any = when (value) {
                is ListField<*> -> {
                    require(value.valueType == valueType)
                    value
                }

                is MutableListField<*> -> {
                    require(value.valueType == valueType)
                    value.toListField()
                }

                is Collection<*> -> {
                    require(value.all { valueType.kotlinType.isInstance(it) })
                    @Suppress("UNCHECKED_CAST")
                    ListField(valueType, value as Collection<T>)
                }

                else -> throw IllegalArgumentException("value must be a Collection")
            }

            override fun canonicalMutableValue(value: Any): Any = when (value) {
                is MutableListField<*> -> {
                    require(value.valueType == valueType)
                    MutableListField(valueType, value)
                }

                is ListField<*> -> {
                    require(value.valueType == valueType)
                    MutableListField(valueType, value)
                }

                is Collection<*> -> {
                    require(value.all { valueType.kotlinType.isInstance(it) })
                    @Suppress("UNCHECKED_CAST")
                    MutableListField(valueType, value as Collection<T>)
                }

                else -> throw IllegalArgumentException("value must be a Collection")
            }
        }

        @PublicForGeneratedCode
        public class Map<K : Any, V : Any>(keyType: Type, valueType: Type) : Type() {
            internal val entryCompanion: MapField.Entry.Companion<K, V> =
                MapField.Entry.Companion(keyType, valueType)
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val wireType: WireType get() = WireType.LENGTH_DELIMITED
            override val kotlinType: KClass<Map<*, *>> get() = Map::class
            override val noPresenceDefaultValue: kotlin.collections.Map<K, V> = MapField.empty()
            override val defaultValue: kotlin.collections.Map<K, V> = MapField.empty()

            override fun canonicalValue(value: Any): Any = when (value) {
                is MapField<*, *> -> {
                    require(value.entryCompanion == entryCompanion)
                    value
                }

                is MutableMapField<*, *> -> {
                    require(value.entryCompanion == entryCompanion)
                    value.toMapField()
                }

                is kotlin.collections.Map<*, *> -> {
                    require(value.all {
                        entryCompanion.keyType.kotlinType.isInstance(it.key) &&
                                entryCompanion.valueType.kotlinType.isInstance(it.value)
                    })
                    @Suppress("UNCHECKED_CAST")
                    MapField(entryCompanion, value as kotlin.collections.Map<K, V>)
                }

                else -> throw IllegalArgumentException("value must be a Map")
            }

            @Suppress("UNCHECKED_CAST")
            override fun canonicalMutableValue(value: Any): Any = when (value) {
                is MutableMapField<*, *> -> {
                    require(value.entryCompanion == entryCompanion)
                    MutableMapField(entryCompanion).apply { putAll(value as MutableMapField<K, V>) }
                }

                is MapField<*, *> -> {
                    require(value.entryCompanion == entryCompanion)
                    MutableMapField(entryCompanion).apply { putAll(value as MapField<K, V>) }
                }

                is kotlin.collections.Map<*, *> -> {
                    require(value.all {
                        entryCompanion.keyType.kotlinType.isInstance(it.key) &&
                                entryCompanion.valueType.kotlinType.isInstance(it.value)
                    })
                    MutableMapField(entryCompanion).apply { putAll(value as kotlin.collections.Map<K, V>) }
                }

                else -> throw IllegalArgumentException("value must be a Map")
            }
        }

        public companion object {
            @PublicForGeneratedCode
            public inline fun <reified E : pbandk.Message.Enum> enum(
                enumCompanion: pbandk.Message.Enum.Companion<E>,
                hasPresence: Boolean = false
            ): Enum<E> = enum(enumCompanion, E::class, hasPresence)

            @PublicForGeneratedCode
            @JsName("enumWithKotlinType")
            public fun <E : pbandk.Message.Enum> enum(
                enumCompanion: pbandk.Message.Enum.Companion<E>,
                kotlinType: KClass<E>,
                hasPresence: Boolean = false
            ): Enum<E> = Enum(enumCompanion, kotlinType, hasPresence)

            @PublicForGeneratedCode
            public fun <K : Any, V : Any> map(keyType: Type, valueType: Type): Map<K, V> = Map(keyType, valueType)

            @PublicForGeneratedCode
            public inline fun <reified M : pbandk.Message> message(messageCompanion: pbandk.Message.Companion<M>): Message<M> =
                message(messageCompanion, M::class)

            @PublicForGeneratedCode
            @JsName("messageWithKotlinType")
            public fun <M : pbandk.Message> message(
                messageCompanion: pbandk.Message.Companion<M>,
                kotlinType: KClass<M>
            ): Message<M> = Message(messageCompanion, kotlinType)

            @PublicForGeneratedCode
            public fun <T : Any> repeated(valueType: Type, packed: Boolean = false): Repeated<T> =
                Repeated(valueType, packed)

            private val DoubleNoPresence = Primitive.Double()
            private val DoubleHasPresence = Primitive.Double(hasPresence = true)

            @PublicForGeneratedCode
            public fun double(hasPresence: Boolean = false): Primitive.Double =
                if (hasPresence) DoubleHasPresence else DoubleNoPresence

            private val FloatNoPresence = Primitive.Float()
            private val FloatHasPresence = Primitive.Float(hasPresence = true)

            @PublicForGeneratedCode
            public fun float(hasPresence: Boolean = false): Primitive.Float =
                if (hasPresence) FloatHasPresence else FloatNoPresence

            private val Int64NoPresence = Primitive.Int64()
            private val Int64HasPresence = Primitive.Int64(hasPresence = true)

            @PublicForGeneratedCode
            public fun int64(hasPresence: Boolean = false): Primitive.Int64 =
                if (hasPresence) Int64HasPresence else Int64NoPresence

            private val UInt64NoPresence = Primitive.UInt64()
            private val UInt64HasPresence = Primitive.UInt64(hasPresence = true)

            @PublicForGeneratedCode
            public fun uint64(hasPresence: Boolean = false): Primitive.UInt64 =
                if (hasPresence) UInt64HasPresence else UInt64NoPresence

            private val Int32NoPresence = Primitive.Int32()
            private val Int32HasPresence = Primitive.Int32(hasPresence = true)

            @PublicForGeneratedCode
            public fun int32(hasPresence: Boolean = false): Primitive.Int32 =
                if (hasPresence) Int32HasPresence else Int32NoPresence

            private val Fixed64NoPresence = Primitive.Fixed64()
            private val Fixed64HasPresence = Primitive.Fixed64(hasPresence = true)

            @PublicForGeneratedCode
            public fun fixed64(hasPresence: Boolean = false): Primitive.Fixed64 =
                if (hasPresence) Fixed64HasPresence else Fixed64NoPresence

            private val Fixed32NoPresence = Primitive.Fixed32()
            private val Fixed32HasPresence = Primitive.Fixed32(hasPresence = true)

            @PublicForGeneratedCode
            public fun fixed32(hasPresence: Boolean = false): Primitive.Fixed32 =
                if (hasPresence) Fixed32HasPresence else Fixed32NoPresence

            private val BoolNoPresence = Primitive.Bool()
            private val BoolHasPresence = Primitive.Bool(hasPresence = true)

            @PublicForGeneratedCode
            public fun bool(hasPresence: Boolean = false): Primitive.Bool =
                if (hasPresence) BoolHasPresence else BoolNoPresence

            private val StringNoPresence = Primitive.String()
            private val StringHasPresence = Primitive.String(hasPresence = true)

            @PublicForGeneratedCode
            public fun string(hasPresence: Boolean = false): Primitive.String =
                if (hasPresence) StringHasPresence else StringNoPresence

            private val BytesNoPresence = Primitive.Bytes()
            private val BytesHasPresence = Primitive.Bytes(hasPresence = true)

            @PublicForGeneratedCode
            public fun bytes(hasPresence: Boolean = false): Primitive.Bytes =
                if (hasPresence) BytesHasPresence else BytesNoPresence

            private val UInt32NoPresence = Primitive.UInt32()
            private val UInt32HasPresence = Primitive.UInt32(hasPresence = true)

            @PublicForGeneratedCode
            public fun uint32(hasPresence: Boolean = false): Primitive.UInt32 =
                if (hasPresence) UInt32HasPresence else UInt32NoPresence

            private val SFixed64NoPresence = Primitive.SFixed64()
            private val SFixed64HasPresence = Primitive.SFixed64(hasPresence = true)

            @PublicForGeneratedCode
            public fun sfixed64(hasPresence: Boolean = false): Primitive.SFixed64 =
                if (hasPresence) SFixed64HasPresence else SFixed64NoPresence

            private val SFixed32NoPresence = Primitive.SFixed32()
            private val SFixed32HasPresence = Primitive.SFixed32(hasPresence = true)

            @PublicForGeneratedCode
            public fun sfixed32(hasPresence: Boolean = false): Primitive.SFixed32 =
                if (hasPresence) SFixed32HasPresence else SFixed32NoPresence

            private val SInt64NoPresence = Primitive.SInt64()
            private val SInt64HasPresence = Primitive.SInt64(hasPresence = true)

            @PublicForGeneratedCode
            public fun sint64(hasPresence: Boolean = false): Primitive.SInt64 =
                if (hasPresence) SInt64HasPresence else SInt64NoPresence

            private val SInt32NoPresence = Primitive.SInt32()
            private val SInt32HasPresence = Primitive.SInt32(hasPresence = true)

            @PublicForGeneratedCode
            public fun sint32(hasPresence: Boolean = false): Primitive.SInt32 =
                if (hasPresence) SInt32HasPresence else SInt32NoPresence
        }
    }

    public companion object {
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V : Any> of(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type,
            value: KProperty1<M, V>,
            mutableValue: KMutableProperty1<MM, V>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V> = Standard(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            accessor = FieldAccessor.Property(value, mutableValue),
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V> ofOptional(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type,
            value: KProperty1<M, V>,
            mutableValue: KMutableProperty1<MM, V>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V> = Standard(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            accessor = FieldAccessor.OptionalProperty(value, mutableValue),
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V> ofOneof(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type,
            value: KProperty1<M, V>,
            mutableValue: KMutableProperty1<MM, V>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V> = Standard(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            accessor = FieldAccessor.OptionalProperty(value, mutableValue),
            isOneofMember = true,
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
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, List<T>> = Standard(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            accessor = FieldAccessor.RepeatedProperty(value, mutableValue),
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, K : Any, V : Any> ofMap(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            type: Type.Map<K, V>,
            value: KProperty1<M, Map<K, V>>,
            mutableValue: KProperty1<MM, MutableMap<K, V>>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, Map<K, V>> = Standard(
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            type = type,
            accessor = FieldAccessor.MapProperty(value, mutableValue),
            jsonName = jsonName,
            options = options
        )

        @PublicForGeneratedCode
        public fun <M : ExtendableMessage<M>, V> ofExtension(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            fullName: String,
            number: Int,
            type: Type,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V> = Extension(
            getMessageDescriptor = messageDescriptor::get,
            extensionName = fullName,
            number = number,
            type = type,
            jsonName = jsonName,
            options = options,
        )

        @PublicForGeneratedCode
        public fun <M : ExtendableMessage<M>, T : Any> ofRepeatedExtension(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            fullName: String,
            number: Int,
            type: Type.Repeated<T>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, List<T>> = Extension(
            getMessageDescriptor = messageDescriptor::get,
            extensionName = fullName,
            number = number,
            type = type,
            jsonName = jsonName,
            options = options
        )
    }

}

internal sealed class FieldAccessor<M : Message, in MM : MutableMessage<M>, ValueType> {
    /**
     * Returns the value of this field in the provided message.
     */
    internal abstract fun getValue(message: M): ValueType

    /**
     * Sets or updates the value of this field in the provided message.
     *
     * NOTE: For `repeated` and `map` fields, this function _appends_ to the existing list/map value rather than
     * replacing the value. For all other fields, this function replaces the value with the new value.
     */
    internal abstract fun updateValue(message: MM, value: ValueType)

    internal class Property<M : Message, MM : MutableMessage<M>, ValueType : Any>(
        private val property: KProperty1<M, ValueType>,
        private val mutableProperty: KMutableProperty1<MM, ValueType>,
    ) : FieldAccessor<M, MM, ValueType>() {
        override fun getValue(message: M): ValueType = property.get(message)
        override fun updateValue(message: MM, value: ValueType) = mutableProperty.set(message, value)
    }

    internal class OptionalProperty<M : Message, MM : MutableMessage<M>, ValueType>(
        private val property: KProperty1<M, ValueType>,
        private val mutableProperty: KMutableProperty1<MM, ValueType>,
    ) : FieldAccessor<M, MM, ValueType>() {
        override fun getValue(message: M): ValueType = property.get(message)
        override fun updateValue(message: MM, value: ValueType) = mutableProperty.set(message, value)
    }

    internal class RepeatedProperty<M : Message, MM : MutableMessage<M>, T : Any>(
        private val property: KProperty1<M, List<T>>,
        private val mutableProperty: KProperty1<MM, MutableList<T>>,
    ) : FieldAccessor<M, MM, List<T>>() {
        override fun getValue(message: M): List<T> = property.get(message)

        override fun updateValue(message: MM, value: List<T>) {
            mutableProperty.get(message).addAll(value)
        }
    }

    internal class MapProperty<M : Message, MM : MutableMessage<M>, K : Any, V : Any>(
        private val property: KProperty1<M, Map<K, V>>,
        private val mutableProperty: KProperty1<MM, MutableMap<K, V>>,
    ) : FieldAccessor<M, MM, Map<K, V>>() {
        override fun getValue(message: M): Map<K, V> = property.get(message)

        override fun updateValue(message: MM, value: Map<K, V>) {
            mutableProperty.get(message).putAll(value)
        }
    }

    /*
    internal class Extension<M : ExtendableMessage<M>, MM : MutableExtendableMessage<M>, ValueType : Any>(
        private val kotlinType: KClass<ValueType>,
    ) : FieldAdapter<M, MM, ValueType, ValueType?>() {
        override fun getValue(message: M): ValueType? = message.getExtension(...)
        override fun updateValue(message: MM, value: ValueType?) = mutableProperty.set(message, value)
        override fun canonicalValue(value: Any): ValueType = kotlinType.cast(value)
        override fun canonicalMutableValue(value: Any): ValueType = kotlinType.cast(value)
    }
     */
}
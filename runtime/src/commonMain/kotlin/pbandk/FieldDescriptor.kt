package pbandk

import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.json.JsonFieldEncoder
import pbandk.internal.types.FieldType
import pbandk.json.JsonFieldValueDecoder
import pbandk.types.ValueType
import pbandk.wkt.FieldOptions
import pbandk.wkt.Syntax
import pbandk.wkt.orDefault
import kotlin.js.JsExport
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

public sealed class FieldMetadata(
    /** The field's unqualified name. */
    @ExperimentalProtoReflection
    public val name: String,
    internal val number: Int,
    internal val jsonName: String,
    internal val isOneofMember: Boolean,
    internal val isExtension: Boolean,
    private val _options: FieldOptions? = null,
) {
    // This has to be indirect to avoid a circular dependency when initializing the [FieldOptions]
    // class, which has its own [FieldDescriptor]s that it tries to initialize.
    @ExperimentalProtoReflection
    public val options: FieldOptions get() = _options.orDefault()

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

    internal class Standard(
        private val messageMetadata: MessageMetadata,
        name: String,
        number: Int,
        jsonName: String,
        isOneofMember: Boolean,
        options: FieldOptions? = null,
    ) : FieldMetadata(
        name = name,
        number = number,
        jsonName = jsonName,
        isOneofMember = isOneofMember,
        isExtension = false,
        _options = options,
    ) {
        override val fullName get() = "${messageMetadata.fullName}.${name}"
    }

    internal class Extension(
        extensionName: String,
        number: Int,
        jsonName: String,
        options: FieldOptions? = null,
    ) : FieldMetadata(
        name = extensionName.substringAfterLast('.'),
        number = number,
        jsonName = jsonName,
        isOneofMember = false,
        isExtension = true,
        _options = options,
    ) {
        override val fullName = extensionName
    }
}

// Proto2 encodes repeated fields unpacked by default, whereas proto3 encodes them packed by default as
// long as the valueType supports it. Both versions allow fields to explicitly override the default.
private fun isFieldPacked(
    fieldOptions: FieldOptions?,
    messageMetadata: MessageMetadata,
    valueType: ValueType<*>
): Boolean = when (fieldOptions?.packed) {
    true -> {
        require(valueType.binaryWireType != WireType.LENGTH_DELIMITED && valueType.binaryWireType != WireType.START_GROUP) {
            "Values with LEN and GROUP wire type cannot use the packed encoding"
        }
        true
    }

    false -> false

    null -> if (messageMetadata.syntax == Syntax.PROTO2) {
        false
    } else {
        valueType.binaryWireType != WireType.LENGTH_DELIMITED && valueType.binaryWireType != WireType.START_GROUP
    }
}

@JsExport
public sealed class FieldDescriptor<M : Message, V> private constructor(
    getMessageDescriptor: () -> MessageDescriptor<M>,
    internal val metadata: FieldMetadata,
) : Comparable<FieldDescriptor<M, *>> {
    internal abstract val fieldType: FieldType<V>

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

    @JsExport.Ignore
    @PublicForGeneratedCode
    public abstract fun getValue(message: M): V

    @JsExport.Ignore
    @PublicForGeneratedCode
    public abstract fun setValue(message: MutableMessage<M>, value: V)

    internal open fun mergeValues(message: M, otherMessage: M, destination: MutableMessage<M>) {
        val value = getValue(message)
        val otherValue = getValue(otherMessage)
        val newValue = fieldType.mergeValues(metadata, value, otherValue)
        if (newValue !== value) {
            setValue(destination, newValue)
        }
    }

    internal fun binarySize(message: M): Int {
        val value = getValue(message)
        return fieldType.binarySize(metadata, value)
    }

    internal fun encodeToBinary(encoder: BinaryFieldEncoder, message: M) {
        val value = getValue(message)
        fieldType.encodeToBinary(metadata, value, encoder)
    }

    internal open fun decodeFromBinary(decoder: BinaryFieldValueDecoder, message: MutableMessage<M>) {
        @Suppress("UNCHECKED_CAST")
        val currentValue = getValue(message as M)
        val decodedValue = fieldType.decodeFromBinary(metadata, decoder)
        val newValue = fieldType.mergeValues(metadata, currentValue, decodedValue)
        if (newValue !== currentValue) {
            setValue(message, newValue)
        }
    }

    internal fun encodeToJson(encoder: JsonFieldEncoder, message: M) {
        val value = getValue(message)
        fieldType.encodeToJson(metadata, value, encoder)
    }

    internal open fun decodeFromJson(decoder: JsonFieldValueDecoder, message: MutableMessage<M>) {
        setValue(message, fieldType.decodeFromJson(metadata, decoder))
    }

    public abstract class MutableValue<M : Message, V, MV : Any>(
        getMessageDescriptor: () -> MessageDescriptor<M>,
        metadata: FieldMetadata
    ) : FieldDescriptor<M, V>(
        getMessageDescriptor,
        metadata,
    ) {
        abstract override val fieldType: FieldType.MutableValue<V, MV>

        @JsExport.Ignore
        @PublicForGeneratedCode
        public abstract fun getMutableValue(message: MutableMessage<M>): MV
    }

    internal class Required<M : Message, MM : MutableMessage<M>, V : Any> internal constructor(
        messageMetadata: MessageMetadata,
        getMessageDescriptor: () -> MessageDescriptor<M>,
        name: String,
        number: Int,
        jsonName: String,
        valueType: ValueType<V>,
        private val property: KProperty1<M, V>,
        private val mutableProperty: KMutableProperty1<MM, V>,
        options: FieldOptions? = null,
    ) : FieldDescriptor<M, V>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Standard(
            messageMetadata = messageMetadata,
            name = name,
            number = number,
            jsonName = jsonName,
            isOneofMember = false,
            options = options,
        )
    ) {
        override val fieldType = FieldType.Required(valueType)

        override fun getValue(message: M): V = property.get(message)

        override fun setValue(message: MutableMessage<M>, value: V) {
            @Suppress("UNCHECKED_CAST")
            mutableProperty.set(message as MM, value)
        }

        override fun decodeFromBinary(decoder: BinaryFieldValueDecoder, message: MutableMessage<M>) {
            val decodedValue = fieldType.decodeFromBinary(metadata, decoder)

            // The `getValue()` might throw an exception if the field is required and this is the first instance of it
            // seen by the decoder.
            val currentValue = try {
                @Suppress("UNCHECKED_CAST")
                getValue(message as M)
            } catch (e: Exception) {
                null
            }

            if (currentValue != null) {
                val newValue = fieldType.mergeValues(metadata, currentValue, decodedValue)
                if (newValue !== currentValue) {
                    setValue(message, newValue)
                }
            } else {
                setValue(message, decodedValue)
            }
        }
    }

    internal class Optional<M : Message, MM : MutableMessage<M>, V : Any>(
        messageMetadata: MessageMetadata,
        getMessageDescriptor: () -> MessageDescriptor<M>,
        name: String,
        number: Int,
        jsonName: String,
        valueType: ValueType<V>,
        private val property: KProperty1<M, V?>,
        private val mutableProperty: KMutableProperty1<MM, V?>,
        options: FieldOptions? = null,
        isOneofMember: Boolean = false,
    ) : FieldDescriptor<M, V?>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Standard(
            messageMetadata = messageMetadata,
            name = name,
            number = number,
            jsonName = jsonName,
            isOneofMember = isOneofMember,
            options = options,
        ),
    ) {
        override val fieldType = FieldType.Optional(valueType)

        override fun getValue(message: M): V? = property.get(message)

        override fun setValue(message: MutableMessage<M>, value: V?) {
            @Suppress("UNCHECKED_CAST")
            mutableProperty.set(message as MM, value)
        }
    }

    internal class Singular<M : Message, MM : MutableMessage<M>, V : Any>(
        messageMetadata: MessageMetadata,
        getMessageDescriptor: () -> MessageDescriptor<M>,
        name: String,
        number: Int,
        jsonName: String,
        private val valueType: ValueType<V>,
        private val property: KProperty1<M, V>,
        private val mutableProperty: KMutableProperty1<MM, V>,
        options: FieldOptions? = null,
    ) : FieldDescriptor<M, V>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Standard(
            messageMetadata = messageMetadata,
            name = name,
            number = number,
            jsonName = jsonName,
            isOneofMember = false,
            options = options,
        ),
    ) {
        override val fieldType = FieldType.Singular(valueType)

        override fun getValue(message: M): V {
            return property.get(message)
        }

        override fun setValue(message: MutableMessage<M>, value: V) {
            @Suppress("UNCHECKED_CAST")
            mutableProperty.set(message as MM, value)
        }
    }

    internal class Repeated<M : Message, MM : MutableMessage<M>, V : Any>(
        messageMetadata: MessageMetadata,
        getMessageDescriptor: () -> MessageDescriptor<M>,
        name: String,
        number: Int,
        jsonName: String,
        valueType: ValueType<V>,
        private val property: KProperty1<M, List<V>>,
        private val mutableProperty: KProperty1<MM, MutableList<V>>,
        options: FieldOptions? = null,
    ) : FieldDescriptor.MutableValue<M, List<V>, MutableList<V>>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Standard(
            messageMetadata = messageMetadata,
            name = name,
            number = number,
            jsonName = jsonName,
            isOneofMember = false,
            options = options,
        ),
    ) {
        override val fieldType = FieldType.Repeated(valueType, isFieldPacked(options, messageMetadata, valueType))

        override fun getValue(message: M): List<V> = property.get(message)

        override fun getMutableValue(message: MutableMessage<M>): MutableList<V> =
            @Suppress("UNCHECKED_CAST")
            mutableProperty.get(message as MM)

        override fun setValue(message: MutableMessage<M>, value: List<V>) {
            fieldType.setMutableValue(getMutableValue(message), value)
        }

        override fun mergeValues(message: M, otherMessage: M, destination: MutableMessage<M>) {
            val otherValue = getValue(otherMessage)
            if (otherValue.isNotEmpty()) {
                getMutableValue(destination).addAll(otherValue)
            }
        }

        override fun decodeFromBinary(decoder: BinaryFieldValueDecoder, message: MutableMessage<M>) {
            val mutableList = getMutableValue(message)
            fieldType.decodeFromBinary(metadata, decoder, mutableList)
        }
    }

    internal class Map<M : Message, MM : MutableMessage<M>, K : Any, V : Any>(
        messageMetadata: MessageMetadata,
        getMessageDescriptor: () -> MessageDescriptor<M>,
        name: String,
        number: Int,
        jsonName: String,
        keyType: ValueType<K>,
        valueType: ValueType<V>,
        private val property: KProperty1<M, kotlin.collections.Map<K, V>>,
        private val mutableProperty: KProperty1<MM, MutableMap<K, V>>,
        options: FieldOptions? = null,
    ) : FieldDescriptor.MutableValue<M, kotlin.collections.Map<K, V>, MutableMap<K, V>>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Standard(
            messageMetadata = messageMetadata,
            name = name,
            number = number,
            jsonName = jsonName,
            isOneofMember = false,
            options = options,
        ),
    ) {
        override val fieldType = FieldType.Map(keyType, valueType)

        override fun getValue(message: M): kotlin.collections.Map<K, V> = property.get(message)

        override fun getMutableValue(message: MutableMessage<M>): MutableMap<K, V> =
            @Suppress("UNCHECKED_CAST")
            mutableProperty.get(message as MM)

        override fun setValue(message: MutableMessage<M>, value: kotlin.collections.Map<K, V>) {
            fieldType.setMutableValue(getMutableValue(message), value)
        }

        override fun mergeValues(message: M, otherMessage: M, destination: MutableMessage<M>) {
            val otherValue = getValue(otherMessage)
            if (otherValue.isNotEmpty()) {
                getMutableValue(destination).putAll(otherValue)
            }
        }

        override fun decodeFromBinary(decoder: BinaryFieldValueDecoder, message: MutableMessage<M>) {
            val mutableMap = getMutableValue(message)

            fieldType.decodeFromBinary(metadata, decoder, mutableMap)

            // val entryCompanion = MapField.Entry.Companion<K, V>(keyType, valueType)
            // val entry = entryCompanion.descriptor.valueType.decodeFromBinary(decoder)
            // if (mutableMap is MutableMapField<K, V>) {
            //     mutableMap.put(entry)
            // } else {
            //     mutableMap[entry.key] = entry.value
            // }
        }
    }

    internal class Extension<M : ExtendableMessage<M>, MM : MutableExtendableMessage<M>, V : Any>(
        getMessageDescriptor: () -> MessageDescriptor<M>,
        extensionName: String,
        number: Int,
        jsonName: String,
        valueType: ValueType<V>,
        options: FieldOptions? = null,
    ) : FieldDescriptor<M, V?>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Extension(
            extensionName = extensionName,
            number = number,
            jsonName = jsonName,
            options = options,
        )
    ) {
        override val fieldType = FieldType.Optional(valueType)

        override fun getValue(message: M): V? = message.extensionFields.getOrDefault(this)

        override fun setValue(message: MutableMessage<M>, value: V?) {
            require(message is MutableExtendableMessage<M>)
            message.extensionFields[this] = value
        }
    }

    internal class RepeatedExtension<M : ExtendableMessage<M>, MM : MutableExtendableMessage<M>, V : Any>(
        getMessageDescriptor: () -> MessageDescriptor<M>,
        extensionName: String,
        number: Int,
        jsonName: String,
        valueType: ValueType<V>,
        options: FieldOptions? = null,
    ) : FieldDescriptor.MutableValue<M, List<V>, MutableList<V>>(
        getMessageDescriptor = getMessageDescriptor,
        metadata = FieldMetadata.Extension(
            extensionName = extensionName,
            number = number,
            jsonName = jsonName,
            options = options,
        )
    ) {
        override val fieldType =
            FieldType.Repeated(valueType, isFieldPacked(options, messageDescriptor.metadata, valueType))

        override fun getValue(message: M): List<V> = message.extensionFields.getOrDefault(this)

        override fun getMutableValue(message: MutableMessage<M>): MutableList<V> {
            require(message is MutableExtendableMessage<M>)
            return message.extensionFields.getOrCreate(this)
        }

        override fun setValue(message: MutableMessage<M>, value: List<V>) {
            fieldType.setMutableValue(getMutableValue(message), value)
        }

        override fun mergeValues(message: M, otherMessage: M, destination: MutableMessage<M>) {
            val otherValue = getValue(otherMessage)
            if (otherValue.isNotEmpty()) {
                getMutableValue(destination).addAll(otherValue)
            }
        }

        override fun decodeFromBinary(decoder: BinaryFieldValueDecoder, message: MutableMessage<M>) {
            val mutableList = getMutableValue(message)
            fieldType.decodeFromBinary(metadata, decoder, mutableList)
        }
    }

    // public class Repeated<T : Any>(internal val valueType: Type, public val packed: Boolean = false) : Type() {
    //     override fun canonicalValue(value: Any): Any = when (value) {
    //         is ListField<*> -> {
    //             require(value.valueType == valueType)
    //             value
    //         }
    //
    //         is MutableListField<*> -> {
    //             require(value.valueType == valueType)
    //             value.toListField()
    //         }
    //
    //         is Collection<*> -> {
    //             require(value.all { valueType.kotlinType.isInstance(it) })
    //             @Suppress("UNCHECKED_CAST")
    //             ListField(valueType, value as Collection<T>)
    //         }
    //
    //         else -> throw IllegalArgumentException("value must be a Collection")
    //     }
    //
    //     override fun canonicalMutableValue(value: Any): Any = when (value) {
    //         is MutableListField<*> -> {
    //             require(value.valueType == valueType)
    //             MutableListField(valueType, value)
    //         }
    //
    //         is ListField<*> -> {
    //             require(value.valueType == valueType)
    //             MutableListField(valueType, value)
    //         }
    //
    //         is Collection<*> -> {
    //             require(value.all { valueType.kotlinType.isInstance(it) })
    //             @Suppress("UNCHECKED_CAST")
    //             MutableListField(valueType, value as Collection<T>)
    //         }
    //
    //         else -> throw IllegalArgumentException("value must be a Collection")
    //     }
    // }

    // public class Map<K : Any, V : Any>(keyType: Type, valueType: Type) : Type() {
    //     override fun canonicalValue(value: Any): Any = when (value) {
    //         is MapField<*, *> -> {
    //             require(value.entryCompanion == entryCompanion)
    //             value
    //         }
    //
    //         is MutableMapField<*, *> -> {
    //             require(value.entryCompanion == entryCompanion)
    //             value.toMapField()
    //         }
    //
    //         is kotlin.collections.Map<*, *> -> {
    //             require(value.all {
    //                 entryCompanion.keyType.kotlinType.isInstance(it.key) &&
    //                         entryCompanion.valueType.kotlinType.isInstance(it.value)
    //             })
    //             @Suppress("UNCHECKED_CAST")
    //             MapField(entryCompanion, value as kotlin.collections.Map<K, V>)
    //         }
    //
    //         else -> throw IllegalArgumentException("value must be a Map")
    //     }
    //
    //     @Suppress("UNCHECKED_CAST")
    //     override fun canonicalMutableValue(value: Any): Any = when (value) {
    //         is MutableMapField<*, *> -> {
    //             require(value.entryCompanion == entryCompanion)
    //             MutableMapField(entryCompanion).apply { putAll(value as MutableMapField<K, V>) }
    //         }
    //
    //         is MapField<*, *> -> {
    //             require(value.entryCompanion == entryCompanion)
    //             MutableMapField(entryCompanion).apply { putAll(value as MapField<K, V>) }
    //         }
    //
    //         is kotlin.collections.Map<*, *> -> {
    //             require(value.all {
    //                 entryCompanion.keyType.kotlinType.isInstance(it.key) &&
    //                         entryCompanion.valueType.kotlinType.isInstance(it.value)
    //             })
    //             MutableMapField(entryCompanion).apply { putAll(value as kotlin.collections.Map<K, V>) }
    //         }
    //
    //         else -> throw IllegalArgumentException("value must be a Map")
    //     }
    // }

    public companion object {
        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V : Any> ofRequired(
            messageMetadata: MessageMetadata,
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            valueType: ValueType<V>,
            value: KProperty1<M, V>,
            mutableValue: KMutableProperty1<MM, V>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V> = Required(
            messageMetadata = messageMetadata,
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
            property = value,
            mutableProperty = mutableValue,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V : Any> ofOptional(
            messageMetadata: MessageMetadata,
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            valueType: ValueType<V>,
            value: KProperty1<M, V?>,
            mutableValue: KMutableProperty1<MM, V?>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V?> = Optional(
            messageMetadata = messageMetadata,
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
            property = value,
            mutableProperty = mutableValue,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V : Any> ofSingular(
            messageMetadata: MessageMetadata,
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            valueType: ValueType<V>,
            value: KProperty1<M, V>,
            mutableValue: KMutableProperty1<MM, V>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V> = Singular(
            messageMetadata = messageMetadata,
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
            property = value,
            mutableProperty = mutableValue,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, V : Any> ofOneof(
            messageMetadata: MessageMetadata,
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            valueType: ValueType<V>,
            value: KProperty1<M, V?>,
            mutableValue: KMutableProperty1<MM, V?>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V?> = Optional(
            messageMetadata = messageMetadata,
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
            property = value,
            mutableProperty = mutableValue,
            isOneofMember = true,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, T : Any> ofRepeated(
            messageMetadata: MessageMetadata,
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            valueType: ValueType<T>,
            value: KProperty1<M, List<T>>,
            mutableValue: KProperty1<MM, MutableList<T>>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor.MutableValue<M, List<T>, MutableList<T>> = Repeated(
            messageMetadata = messageMetadata,
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
            property = value,
            mutableProperty = mutableValue,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : Message, MM : MutableMessage<M>, K : Any, V : Any> ofMap(
            messageMetadata: MessageMetadata,
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            name: String,
            number: Int,
            keyType: ValueType<K>,
            valueType: ValueType<V>,
            value: KProperty1<M, kotlin.collections.Map<K, V>>,
            mutableValue: KProperty1<MM, MutableMap<K, V>>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor.MutableValue<M, kotlin.collections.Map<K, V>, MutableMap<K, V>> = Map(
            messageMetadata = messageMetadata,
            getMessageDescriptor = messageDescriptor::get,
            name = name,
            number = number,
            jsonName = jsonName,
            options = options,
            keyType = keyType,
            valueType = valueType,
            property = value,
            mutableProperty = mutableValue,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : ExtendableMessage<M>, V : Any> ofExtension(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            fullName: String,
            number: Int,
            valueType: ValueType<V>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor<M, V?> = Extension(
            getMessageDescriptor = messageDescriptor::get,
            extensionName = fullName,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
        )

        @JsExport.Ignore
        @PublicForGeneratedCode
        public fun <M : ExtendableMessage<M>, T : Any> ofRepeatedExtension(
            messageDescriptor: KProperty0<MessageDescriptor<M>>,
            fullName: String,
            number: Int,
            valueType: ValueType<T>,
            jsonName: String,
            options: FieldOptions? = null,
        ): FieldDescriptor.MutableValue<M, List<T>, MutableList<T>> = RepeatedExtension(
            getMessageDescriptor = messageDescriptor::get,
            extensionName = fullName,
            number = number,
            jsonName = jsonName,
            options = options,
            valueType = valueType,
        )
    }
}

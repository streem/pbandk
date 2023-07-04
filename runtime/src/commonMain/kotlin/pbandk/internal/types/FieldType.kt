package pbandk.internal.types

import pbandk.FieldMetadata
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.gen.ListField
import pbandk.gen.MapField
import pbandk.gen.MapFieldEntryCompanion
import pbandk.gen.MutableListField
import pbandk.gen.MutableMapField
import pbandk.gen.MutableMapFieldEntry
import pbandk.gen.UnrecognizedEnumValue
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.Tag
import pbandk.binary.WireValue
import pbandk.internal.json.JsonFieldEncoder
import pbandk.internal.types.primitive.Enum
import pbandk.json.JsonConfig
import pbandk.json.JsonConfig.UnrecognizedEnumValueBehavior.*
import pbandk.json.JsonFieldValueDecoder
import pbandk.types.ValueType
import pbandk.wkt.NullValue

internal sealed class FieldType<KotlinType> {
    abstract fun mergeValues(metadata: FieldMetadata, currentValue: KotlinType, newValue: KotlinType): KotlinType
    abstract fun isDefaultValue(value: KotlinType): Boolean

    /**
     * Returns the default value for this field. Can throw an exception if [KotlinType] is a [pbandk.Message] with
     * `required` fields, since such messages do not have a default value. Prefer [isDefaultValue] over [defaultValue]
     * when you only need to check if another value is the default, as this avoids the possibility of throwing an
     * exception.
     */
    abstract val defaultValue: KotlinType

    abstract fun allowsBinaryWireType(wireType: WireType): Boolean
    abstract fun binarySize(metadata: FieldMetadata, value: KotlinType): Int
    abstract fun encodeToBinary(metadata: FieldMetadata, value: KotlinType, encoder: BinaryFieldEncoder)
    abstract fun encodeToJson(metadata: FieldMetadata, value: KotlinType, encoder: JsonFieldEncoder)

    abstract fun decodeFromBinary(metadata: FieldMetadata, decoder: BinaryFieldValueDecoder): KotlinType
    abstract fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): KotlinType

    sealed class MutableValue<KotlinType, MutableKotlinType : Any> : FieldType<KotlinType>() {
        abstract fun newMutableValue(): MutableKotlinType
        abstract fun setMutableValue(mutableValue: MutableKotlinType, newValue: KotlinType)
        abstract fun fromMutableValue(mutableValue: MutableKotlinType): KotlinType

        abstract fun decodeFromBinary(
            metadata: FieldMetadata,
            decoder: BinaryFieldValueDecoder,
            mutableValue: MutableKotlinType,
        )
    }

    class Required<T : Any>(internal val valueType: ValueType<T>) : FieldType<T>() {
        override fun mergeValues(metadata: FieldMetadata, currentValue: T, newValue: T) =
            valueType.mergeValues(currentValue, newValue)

        override fun isDefaultValue(value: T) = valueType.isDefaultValue(value)

        override val defaultValue: T get() = valueType.defaultValue

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return valueType.binaryWireType == wireType
        }

        override fun binarySize(metadata: FieldMetadata, value: T): Int {
            if (value is Message.Enum && value.value == null) {
                throw InvalidProtocolBufferException.unrecognizedStringInRequiredEnumField()
            }
            return Tag.size(metadata.number) + valueType.binarySize(value)
        }

        override fun encodeToBinary(metadata: FieldMetadata, value: T, encoder: BinaryFieldEncoder) {
            if (value is Message.Enum && value.value == null) {
                throw InvalidProtocolBufferException.unrecognizedStringInRequiredEnumField()
            }
            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
        }

        override fun decodeFromBinary(metadata: FieldMetadata, decoder: BinaryFieldValueDecoder): T {
            return valueType.decodeFromBinary(decoder)
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T, encoder: JsonFieldEncoder) {
            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueType.encodeToJson(value, valueEncoder)
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): T {
            if (decoder is JsonFieldValueDecoder.Null &&
                (valueType as? MessageValueType)?.companion != pbandk.wkt.Value &&
                (valueType as? Enum)?.enumCompanion != NullValue
            ) {
                throw InvalidProtocolBufferException("A 'required' field cannot be null since it does not have a default value")
            }

            val value = valueType.decodeFromJson(decoder)
            if (value is UnrecognizedEnumValue<*> && value.shouldTreatAsUnknownField(decoder.jsonConfig)) {
                throw InvalidProtocolBufferException.unrecognizedEnumValue(metadata.name)
            }
            return value
        }
    }

    class Optional<T : Any>(internal val valueType: ValueType<T>) : FieldType<T?>() {
        override fun mergeValues(metadata: FieldMetadata, currentValue: T?, newValue: T?) = when {
            currentValue == null -> newValue
            newValue == null -> currentValue
            else -> valueType.mergeValues(currentValue, newValue)
        }

        override fun isDefaultValue(value: T?) = value == null

        override val defaultValue: T? get() = null

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return valueType.binaryWireType == wireType
        }

        override fun binarySize(metadata: FieldMetadata, value: T?) = when {
            value == null -> 0
            value is Message.Enum && value.value == null -> 0
            else -> Tag.size(metadata.number) + valueType.binarySize(value)
        }

        override fun encodeToBinary(metadata: FieldMetadata, value: T?, encoder: BinaryFieldEncoder) {
            when {
                value == null -> return
                value is Message.Enum && value.value == null -> return
                else -> encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                    valueType.encodeToBinary(value, valueEncoder)
                }
            }
        }

        override fun decodeFromBinary(metadata: FieldMetadata, decoder: BinaryFieldValueDecoder): T {
            return valueType.decodeFromBinary(decoder)
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T?, encoder: JsonFieldEncoder) {
            if (value == null) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueType.encodeToJson(value, valueEncoder)
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): T? {
            if (decoder is JsonFieldValueDecoder.Null &&
                (valueType as? MessageValueType)?.companion != pbandk.wkt.Value &&
                (valueType as? Enum)?.enumCompanion != NullValue
            ) {
                decoder.consumeNull()
                return null
            }

            val value = valueType.decodeFromJson(decoder)
            if (value is UnrecognizedEnumValue<*> && value.shouldTreatAsUnknownField(decoder.jsonConfig)) {
                if (decoder.jsonConfig.ignoreUnknownFieldsInInput) {
                    return null
                } else {
                    throw InvalidProtocolBufferException.unrecognizedEnumValue(metadata.name)
                }
            }
            return value
        }
    }

    class Singular<T : Any>(internal val valueType: ValueType<T>) : FieldType<T>() {
        override fun mergeValues(metadata: FieldMetadata, currentValue: T, newValue: T) =
            valueType.mergeValues(currentValue, newValue)

        override fun isDefaultValue(value: T) = valueType.isDefaultValue(value)

        override val defaultValue: T get() = valueType.defaultValue

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return valueType.binaryWireType == wireType
        }

        override fun binarySize(metadata: FieldMetadata, value: T) = when {
            valueType.isDefaultValue(value) -> 0
            value is Message.Enum && value.value == null -> 0
            else -> Tag.size(metadata.number) + valueType.binarySize(value)
        }

        override fun encodeToBinary(metadata: FieldMetadata, value: T, encoder: BinaryFieldEncoder) {
            when {
                valueType.isDefaultValue(value) -> return
                value is Message.Enum && value.value == null -> return
                else -> encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                    valueType.encodeToBinary(value, valueEncoder)
                }
            }

        }

        override fun decodeFromBinary(metadata: FieldMetadata, decoder: BinaryFieldValueDecoder): T {
            return valueType.decodeFromBinary(decoder)
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T, encoder: JsonFieldEncoder) {
            if (!encoder.jsonConfig.outputDefaultValues && valueType.isDefaultValue(value)) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                @Suppress("DEPRECATION")
                if (encoder.jsonConfig.outputDefaultValues &&
                    encoder.jsonConfig.outputDefaultStringsAsNull &&
                    value is String && value.isEmpty()
                ) {
                    valueEncoder.encodeNull()
                } else {
                    valueType.encodeToJson(value, valueEncoder)
                }
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): T {
            if (decoder is JsonFieldValueDecoder.Null &&
                (valueType as? MessageValueType)?.companion != pbandk.wkt.Value &&
                (valueType as? Enum)?.enumCompanion != NullValue
            ) {
                decoder.consumeNull()
                return valueType.defaultValue
            }

            val value = valueType.decodeFromJson(decoder)
            if (value is UnrecognizedEnumValue<*> && value.shouldTreatAsUnknownField(decoder.jsonConfig)) {
                if (decoder.jsonConfig.ignoreUnknownFieldsInInput) {
                    return valueType.defaultValue
                } else {
                    throw InvalidProtocolBufferException.unrecognizedEnumValue(metadata.name)
                }
            }
            return value
        }
    }

    class Repeated<T : Any>(
        internal val valueType: ValueType<T>,
        private val packed: Boolean,
    ) : MutableValue<List<T>, MutableList<T>>() {
        private val List<T>.protoSize: Int
            get() = (this as? ListField<T>)?.protoSize ?: this.sumOf(valueType::binarySize)

        override fun mergeValues(metadata: FieldMetadata, currentValue: List<T>, newValue: List<T>): List<T> {
            return currentValue + newValue
        }

        override fun isDefaultValue(value: List<T>) = value.isEmpty()

        override val defaultValue: List<T> get() = ListField.empty()

        override fun newMutableValue(): MutableListField<T> = MutableListField(valueType)

        override fun setMutableValue(mutableValue: MutableList<T>, newValue: List<T>) {
            mutableValue.clear()
            mutableValue.addAll(newValue)
        }

        override fun fromMutableValue(mutableValue: MutableList<T>): List<T> =
            if (mutableValue is MutableListField<T>) {
                mutableValue.toListField()
            } else {
                ListField(valueType, mutableValue)
            }

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return (valueType.binaryWireType == wireType
                    // If the value is packable, then the wire type can be LENGTH_DELIMITED
                    || (wireType == WireType.LENGTH_DELIMITED && valueType.binaryWireType != WireType.LENGTH_DELIMITED))
        }

        override fun binarySize(metadata: FieldMetadata, value: List<T>) = when {
            value.isEmpty() -> 0
            packed -> Tag.size(metadata.number) + WireValue.Len.sizeWithLenPrefix(value.protoSize)
            else -> (Tag.size(metadata.number) * value.count { !(it is Message.Enum && it.value == null) }) + value.protoSize
        }

        override fun encodeToBinary(
            metadata: FieldMetadata,
            value: List<T>,
            encoder: BinaryFieldEncoder
        ) {
            if (value.isEmpty()) return

            if (packed) {
                // TODO: check if skipping enums in the list with unrecognized string values is the correct behavior
                encoder.encodeField(Tag(metadata.number, WireType.LENGTH_DELIMITED)) { valueEncoder ->
                    valueEncoder.encodeLenPrefix(value.protoSize.toUInt())
                    value.forEach { valueType.encodeToBinary(it, valueEncoder) }
                }
            } else {
                val tag = Tag(metadata.number, valueType.binaryWireType)
                value.forEach {
                    // TODO: check if skipping enums in the list with unrecognized string values is the correct behavior
                    if (it is Message.Enum && it.value == null) return@forEach
                    encoder.encodeField(tag) { valueEncoder ->
                        valueType.encodeToBinary(it, valueEncoder)
                    }
                }
            }
        }

        override fun decodeFromBinary(
            metadata: FieldMetadata,
            decoder: BinaryFieldValueDecoder,
            mutableValue: MutableList<T>,
        ) {
            // Check if the field is "packed" (multiple values from the repeated list encoded into a single field). Only
            // repeated values that don't use [WireType.LENGTH_DELIMITED] can be packed. If the value uses
            // [WireType.LENGTH_DELIMITED], then this field can only represent a single value from the repeated list.
            if (decoder is BinaryFieldValueDecoder.Len && valueType.binaryWireType != WireType.LENGTH_DELIMITED) {
                decoder.decodePackedValues(valueType.binaryWireType) {
                    mutableValue.add(valueType.decodeFromBinary(it))
                }
            } else {
                mutableValue.add(valueType.decodeFromBinary(decoder))
            }
        }

        override fun decodeFromBinary(metadata: FieldMetadata, decoder: BinaryFieldValueDecoder): List<T> {
            return newMutableValue().apply {
                decodeFromBinary(metadata, decoder, this)
            }.toListField()
        }

        override fun encodeToJson(metadata: FieldMetadata, value: List<T>, encoder: JsonFieldEncoder) {
            if (!encoder.jsonConfig.outputDefaultValues && value.isEmpty()) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueEncoder.encodeArrayWithValues(value) { arrayValue, arrayValueEncoder ->
                    valueType.encodeToJson(arrayValue, arrayValueEncoder)
                }
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): List<T> = when (decoder) {
            is JsonFieldValueDecoder.Null -> {
                decoder.consumeNull()
                emptyList()
            }

            is JsonFieldValueDecoder.Array -> newMutableValue().apply {
                decoder.forEachValue { arrayValueDecoder ->
                    when (arrayValueDecoder) {
                        is JsonFieldValueDecoder.Null ->
                            throw InvalidProtocolBufferException("JSON repeated values must not contain nulls")

                        else -> {
                            val value = valueType.decodeFromJson(arrayValueDecoder)
                            if (value is UnrecognizedEnumValue<*> &&
                                value.shouldTreatAsUnknownField(arrayValueDecoder.jsonConfig)
                            ) {
                                if (arrayValueDecoder.jsonConfig.ignoreUnknownFieldsInInput) {
                                    // TODO: check if skipping enums in the list with unrecognized values is the
                                    //  correct behavior
                                    return@forEachValue
                                } else {
                                    throw InvalidProtocolBufferException.unrecognizedEnumValue(metadata.name)
                                }
                            }
                            add(value)
                        }
                    }
                }
            }.toListField()

            else -> throw InvalidProtocolBufferException("Unexpected JSON type for repeated field: ${decoder.wireType.name}")
        }
    }

    class Map<K : Any, V : Any>(
        internal val keyType: ValueType<K>,
        internal val valueType: ValueType<V>,
    ) : MutableValue<kotlin.collections.Map<K, V>, MutableMap<K, V>>() {
        internal val entryCompanion = MapFieldEntryCompanion(keyType, valueType)

        override fun mergeValues(
            metadata: FieldMetadata,
            currentValue: kotlin.collections.Map<K, V>,
            newValue: kotlin.collections.Map<K, V>
        ): kotlin.collections.Map<K, V> {
            return currentValue + newValue
        }

        override fun isDefaultValue(value: kotlin.collections.Map<K, V>) = value.isEmpty()

        override val defaultValue: kotlin.collections.Map<K, V> get() = MapField.empty()

        override fun newMutableValue(): MutableMapField<K, V> = MutableMapField(entryCompanion)

        override fun setMutableValue(mutableValue: MutableMap<K, V>, newValue: kotlin.collections.Map<K, V>) {
            mutableValue.clear()
            mutableValue.putAll(newValue)
        }

        override fun fromMutableValue(mutableValue: MutableMap<K, V>): kotlin.collections.Map<K, V> {
            return if (mutableValue is MutableMapField<K, V>) {
                mutableValue.toMapField()
            } else {
                MapField(entryCompanion, mutableValue)
            }
        }

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return wireType == WireType.LENGTH_DELIMITED
        }

        override fun binarySize(metadata: FieldMetadata, value: kotlin.collections.Map<K, V>): Int {
            if (value.isEmpty()) return 0

            val tagSize = Tag.size(metadata.number)

            return value.entries.sumOf { entry ->
                val entryValue = entry.value
                if (entryValue is Message.Enum && entryValue.value == null) return@sumOf 0

                if (entry is MapField.Entry<*, *>) {
                    entry.protoSize
                } else {
                    val keySize = entry.key
                        .takeIf { !keyType.isDefaultValue(it) }
                        ?.let { Tag.size(1) + keyType.binarySize(it) }
                        ?: 0
                    val valueSize = entry.value
                        .takeIf { !valueType.isDefaultValue(it) }
                        ?.let { Tag.size(2) + valueType.binarySize(it) }
                        ?: 0
                    keySize + valueSize
                }.let { size -> WireValue.Len.sizeWithLenPrefix(size) + tagSize }
            }
        }

        override fun encodeToBinary(
            metadata: FieldMetadata,
            value: kotlin.collections.Map<K, V>,
            encoder: BinaryFieldEncoder
        ) {
            if (value.isEmpty()) return

//            value as MapField<K, V>
//            value.asMessages().forEach {
//                val entryValue = it.value
//                if (entryValue is Message.Enum && entryValue.value == null) return@forEach
//                encoder.writeField(Tag(metadata.number, WireType.LENGTH_DELIMITED)) { valueEncoder ->
//                    ValueTypes.Message.encodeToBinary(it, valueEncoder)
//                }
//            }
            // or
            val entryTag = Tag(metadata.number, WireType.LENGTH_DELIMITED)
            // val keyTag = Tag(1, keyType.binaryWireType)
            // val valueTag = Tag(2, valueType.binaryWireType)
            value.forEach { entry ->
                val entryValue = entry.value
                if (entryValue is Message.Enum && entryValue.value == null) return@forEach

                encoder.encodeField(entryTag) { valueEncoder ->
                    if (entry is MapField.Entry<K, V>) {
                        entry.descriptor.messageValueType.encodeToBinary(entry, valueEncoder)
                    } else {
                        val mapFieldEntry = MutableMapFieldEntry(entry.key, entry.value, entryCompanion)
                        mapFieldEntry.descriptor.messageValueType.encodeToBinary(mapFieldEntry, valueEncoder)
//                        val keySize = entry.key
//                            .takeIf { !keyType.isDefaultValue(it) }
//                            ?.let { Tag.size(1) + keyType.binarySize(it) }
//                            ?: 0
//                        val valueSize = entry.value
//                            .takeIf { !valueType.isDefaultValue(it) }
//                            ?.let { Tag.size(2) + valueType.binarySize(it) }
//                            ?: 0
//                        valueEncoder.encodeLenFields(keySize + valueSize) { fieldEncoder ->
//                            if (!keyType.isDefaultValue(entry.key)) {
//                                fieldEncoder.encodeField(keyTag) { keyType.encodeToBinary(entry.key, it) }
//                            }
//                            if (!valueType.isDefaultValue(entry.value)) {
//                                fieldEncoder.encodeField(valueTag) { valueType.encodeToBinary(entry.value, it) }
//                            }
//                        }
                    }
                }
            }
        }

        override fun decodeFromBinary(
            metadata: FieldMetadata,
            decoder: BinaryFieldValueDecoder,
            mutableValue: MutableMap<K, V>,
        ) {
            val entry = entryCompanion.descriptor.messageValueType.decodeFromBinary(decoder)
            mutableValue[entry.key] = entry.value
        }

        override fun decodeFromBinary(
            metadata: FieldMetadata,
            decoder: BinaryFieldValueDecoder
        ): kotlin.collections.Map<K, V> {
            return newMutableValue().apply {
                decodeFromBinary(metadata, decoder, this)
            }.toMapField()
        }

        override fun encodeToJson(
            metadata: FieldMetadata,
            value: kotlin.collections.Map<K, V>,
            encoder: JsonFieldEncoder
        ) {
            if (!encoder.jsonConfig.outputDefaultValues && value.isEmpty()) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueEncoder.encodeObject { objectValueEncoder ->
                    value.forEach { (k, v) ->
                        objectValueEncoder.encodeField(keyType.encodeToJsonMapKey(k)) { valueType.encodeToJson(v, it) }
                    }
                }
            }
        }

        override fun decodeFromJson(
            metadata: FieldMetadata,
            decoder: JsonFieldValueDecoder,
        ): kotlin.collections.Map<K, V> = when (decoder) {
            is JsonFieldValueDecoder.Null -> {
                decoder.consumeNull()
                emptyMap()
            }

            is JsonFieldValueDecoder.Object -> newMutableValue().apply {
                decoder.decodeFields { fieldDecoder ->
                    fieldDecoder.forEachField { fieldKeyDecoder, fieldValueDecoder ->
                        val mapKey = keyType.decodeFromJsonMapKey(fieldKeyDecoder)
                        val mapValue = if (fieldValueDecoder is JsonFieldValueDecoder.Null) {
                            fieldValueDecoder.consumeNull()
                            throw InvalidProtocolBufferException("JSON map values must not be null")
                        } else {
                            valueType.decodeFromJson(fieldValueDecoder)
                        }
                        if (mapValue is UnrecognizedEnumValue<*> &&
                            mapValue.shouldTreatAsUnknownField(fieldValueDecoder.jsonConfig)
                        ) {
                            if (fieldValueDecoder.jsonConfig.ignoreUnknownFieldsInInput) {
                                return@forEachField
                            } else {
                                throw InvalidProtocolBufferException.unrecognizedEnumValue(metadata.name)
                            }
                        }
                        put(mapKey, mapValue)
                    }
                }
            }.toMapField()

            else -> throw InvalidProtocolBufferException("Unexpected JSON type for map field: ${decoder.wireType.name}")
        }
    }
}

private fun UnrecognizedEnumValue<*>.shouldTreatAsUnknownField(jsonConfig: JsonConfig): Boolean =
    when (jsonConfig.unrecognizedEnumValueBehavior) {
        TreatAsUnknownField -> true
        KeepOnlyNumericValues -> this.value == null
        KeepOnlyStringValues -> this.name == null
        Keep -> false
    }
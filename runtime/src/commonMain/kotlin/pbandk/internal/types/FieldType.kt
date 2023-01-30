package pbandk.internal.types

import pbandk.FieldMetadata
import pbandk.InvalidProtocolBufferException
import pbandk.gen.ListField
import pbandk.gen.MapField
import pbandk.gen.MutableMapFieldEntry
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.Tag
import pbandk.binary.WireType
import pbandk.internal.json.JsonFieldEncoder
import pbandk.json.JsonFieldValueDecoder
import pbandk.internal.types.primitive.Enum
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

    abstract fun decodeFromBinary(metadata: FieldMetadata, tag: Tag, decoder: BinaryFieldValueDecoder): KotlinType
    abstract fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): KotlinType

    class Required<T : Any>(internal val valueType: ValueType<T>) : FieldType<T>() {
        override fun mergeValues(metadata: FieldMetadata, currentValue: T, newValue: T) =
            valueType.mergeValues(currentValue, newValue)

        override fun isDefaultValue(value: T) = valueType.isDefaultValue(value)

        override val defaultValue: T get() = valueType.defaultValue

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return valueType.binaryWireType == wireType
        }

        override fun binarySize(metadata: FieldMetadata, value: T) =
            Sizer.tagSize(metadata.number) + valueType.binarySize(value)

        override fun encodeToBinary(metadata: FieldMetadata, value: T, encoder: BinaryFieldEncoder) {
            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
        }

        override fun decodeFromBinary(metadata: FieldMetadata, tag: Tag, decoder: BinaryFieldValueDecoder): T {
            return valueType.decodeFromBinary(decoder)
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T, encoder: JsonFieldEncoder) {
            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueType.encodeToJson(value, valueEncoder)
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): T =
            if (decoder is JsonFieldValueDecoder.Null &&
                (valueType as? MessageValueType)?.companion != pbandk.wkt.Value &&
                (valueType as? Enum)?.enumCompanion != NullValue
            ) {
                throw InvalidProtocolBufferException("A 'required' field cannot be null since it does not have a default value")
            } else {
                valueType.decodeFromJson(decoder)
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

        override fun binarySize(metadata: FieldMetadata, value: T?) =
            if (value == null) 0 else Sizer.tagSize(metadata.number) + valueType.binarySize(value)

        override fun encodeToBinary(metadata: FieldMetadata, value: T?, encoder: BinaryFieldEncoder) {
            if (value == null) return

            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
        }

        override fun decodeFromBinary(metadata: FieldMetadata, tag: Tag, decoder: BinaryFieldValueDecoder): T {
            return valueType.decodeFromBinary(decoder)
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T?, encoder: JsonFieldEncoder) {
            if (value == null && (metadata.isOneofMember || !encoder.jsonConfig.outputDefaultValues)) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                if (value == null) {
                    valueEncoder.encodeNull()
                } else {
                    valueType.encodeToJson(value, valueEncoder)
                }
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): T? =
            if (decoder is JsonFieldValueDecoder.Null &&
                (valueType as? MessageValueType)?.companion != pbandk.wkt.Value &&
                (valueType as? Enum)?.enumCompanion != NullValue
            ) {
                decoder.consumeNull()
                null
            } else {
                valueType.decodeFromJson(decoder)
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

        override fun binarySize(metadata: FieldMetadata, value: T) =
            if (valueType.isDefaultValue(value)) 0 else Sizer.tagSize(metadata.number) + valueType.binarySize(value)

        override fun encodeToBinary(metadata: FieldMetadata, value: T, encoder: BinaryFieldEncoder) {
            if (valueType.isDefaultValue(value)) return

            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
        }

        override fun decodeFromBinary(metadata: FieldMetadata, tag: Tag, decoder: BinaryFieldValueDecoder): T {
            return valueType.decodeFromBinary(decoder)
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T, encoder: JsonFieldEncoder) {
            if (!encoder.jsonConfig.outputDefaultValues && valueType.isDefaultValue(value)) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueType.encodeToJson(value, valueEncoder)
            }
        }

        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): T =
            if (decoder is JsonFieldValueDecoder.Null &&
                (valueType as? MessageValueType)?.companion != pbandk.wkt.Value &&
                (valueType as? Enum)?.enumCompanion != NullValue
            ) {
                decoder.consumeNull()
                valueType.defaultValue
            } else {
                valueType.decodeFromJson(decoder)
            }
    }

    class Repeated<T : Any>(internal val valueType: ValueType<T>) : FieldType<List<T>>() {
        override fun mergeValues(metadata: FieldMetadata, currentValue: List<T>, newValue: List<T>): List<T> {
            return currentValue + newValue
        }

        override fun isDefaultValue(value: List<T>) = value.isEmpty()

        override val defaultValue: List<T> get() = emptyList()

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return (valueType.binaryWireType == wireType
                    // If the value is packable, then the wire type can be LENGTH_DELIMITED
                    || (wireType == WireType.LENGTH_DELIMITED && valueType.binaryWireType != WireType.LENGTH_DELIMITED))
        }

        override fun binarySize(metadata: FieldMetadata, value: List<T>) = when {
            value.isEmpty() -> 0

            metadata.options.packed == true -> {
                Sizer.tagSize(metadata.number) +
                        ((value as? ListField)?.protoSize ?: value.sumOf(valueType::binarySize)).let {
                            it + Sizer.uInt32Size(it)
                        }
            }

            else -> (Sizer.tagSize(metadata.number) * value.size) + value.sumOf(valueType::binarySize)
        }

        override fun encodeToBinary(
            metadata: FieldMetadata,
            value: List<T>,
            encoder: BinaryFieldEncoder
        ) {
            if (value.isEmpty()) return

            if (metadata.options.packed == true) {
                encoder.encodeField(Tag(metadata.number, WireType.LENGTH_DELIMITED)) { valueEncoder ->
                    val listSize = (value as? ListField)?.protoSize ?: value.sumOf { valueType.binarySize(it) }
                    valueEncoder.encodeLenPrefix(listSize.toUInt())
                    value.forEach {
                        valueType.encodeToBinary(it, valueEncoder)
                    }
                }
            } else {
                val tag = Tag(metadata.number, valueType.binaryWireType)
                value.forEach {
                    encoder.encodeField(tag) { valueEncoder ->
                        valueType.encodeToBinary(it, valueEncoder)
                    }
                }
            }
        }

        internal fun decodeFromBinary(
            metadata: FieldMetadata,
            tag: Tag,
            decoder: BinaryFieldValueDecoder,
            valueBlock: (T) -> Unit,
        ) {
            // Check if the field is "packed" (multiple values from the repeated list encoded into a single field). Only
            // repeated values that don't use [WireType.LENGTH_DELIMITED] can be packed. If the value uses
            // [WireType.LENGTH_DELIMITED], then this field can only represent a single value from the repeated list.
            if (tag.wireType == WireType.LENGTH_DELIMITED && valueType.binaryWireType != WireType.LENGTH_DELIMITED) {
                decoder.decodeLenPackedValues {
                    valueBlock(valueType.decodeFromBinary(it))
                }
            } else {
                valueBlock(valueType.decodeFromBinary(decoder))
            }
        }

        @OptIn(ExperimentalStdlibApi::class)
        override fun decodeFromBinary(metadata: FieldMetadata, tag: Tag, decoder: BinaryFieldValueDecoder): List<T> {
            return buildList {
                decodeFromBinary(metadata, tag, decoder, ::add)
            }
        }

        override fun encodeToJson(metadata: FieldMetadata, value: List<T>, encoder: JsonFieldEncoder) {
            if (!encoder.jsonConfig.outputDefaultValues && value.isEmpty()) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueEncoder.encodeArray { arrayValueEncoder ->
                    value.forEach { valueType.encodeToJson(it, arrayValueEncoder) }
                }
            }
        }

        @OptIn(ExperimentalStdlibApi::class)
        override fun decodeFromJson(metadata: FieldMetadata, decoder: JsonFieldValueDecoder): List<T> = when (decoder) {
            is JsonFieldValueDecoder.Null -> {
                decoder.consumeNull()
                emptyList()
            }

            is JsonFieldValueDecoder.Array -> buildList {
                decoder.forEachValue { arrayValueDecoder ->
                    when (arrayValueDecoder) {
                        is JsonFieldValueDecoder.Null -> add(valueType.defaultValue)
                        else -> add(valueType.decodeFromJson(arrayValueDecoder))
                    }
                }
            }

            else -> TODO()
        }
    }

    class Map<K : Any, V : Any>(
        internal val keyType: ValueType<K>,
        internal val valueType: ValueType<V>,
    ) : FieldType<kotlin.collections.Map<K, V>>() {
        private val entryCompanion = MapField.Entry.Companion<K, V>(keyType, valueType)

        override fun mergeValues(
            metadata: FieldMetadata,
            currentValue: kotlin.collections.Map<K, V>,
            newValue: kotlin.collections.Map<K, V>
        ): kotlin.collections.Map<K, V> {
            return currentValue + newValue
        }

        override fun isDefaultValue(value: kotlin.collections.Map<K, V>) = value.isEmpty()

        override val defaultValue: kotlin.collections.Map<K, V> get() = emptyMap()

        override fun allowsBinaryWireType(wireType: WireType): Boolean {
            return wireType == WireType.LENGTH_DELIMITED
        }

        override fun binarySize(metadata: FieldMetadata, value: kotlin.collections.Map<K, V>): Int {
            return value.entries.sumOf { entry ->
                if (entry is MapField.Entry<*, *>) {
                    entry.protoSize
                } else {
                    val keySize = entry.key
                        .takeIf { !keyType.isDefaultValue(it) }
                        ?.let { Sizer.tagSize(1) + keyType.binarySize(it) }
                        ?: 0
                    val valueSize = entry.value
                        .takeIf { !valueType.isDefaultValue(it) }
                        ?.let { Sizer.tagSize(2) + valueType.binarySize(it) }
                        ?: 0
                    keySize + valueSize
                }.let { size ->
                    Sizer.uInt32Size(size) + size
                }
            } + (value.size * Sizer.tagSize(metadata.number))
        }

        override fun encodeToBinary(
            metadata: FieldMetadata,
            value: kotlin.collections.Map<K, V>,
            encoder: BinaryFieldEncoder
        ) {
            if (value.isEmpty()) return

//            value as MapField<K, V>
//            value.asMessages().forEach {
//                encoder.writeField(Tag(metadata.number, WireType.LENGTH_DELIMITED)) { valueEncoder ->
//                    ValueTypes.Message.encodeToBinary(it, valueEncoder)
//                }
//            }
            // or
            val entryTag = Tag(metadata.number, WireType.LENGTH_DELIMITED)
            // val keyTag = Tag(1, keyType.binaryWireType)
            // val valueTag = Tag(2, valueType.binaryWireType)
            value.forEach { entry ->
                encoder.encodeField(entryTag) { valueEncoder ->
                    if (entry is MapField.Entry<K, V>) {
                        entry.descriptor.messageValueType.encodeToBinary(entry, valueEncoder)
                    } else {
                        val mapFieldEntry = MutableMapFieldEntry(entry.key, entry.value, entryCompanion)
                        mapFieldEntry.descriptor.messageValueType.encodeToBinary(mapFieldEntry, valueEncoder)
//                        val keySize = entry.key
//                            .takeIf { !keyType.isDefaultValue(it) }
//                            ?.let { Sizer.tagSize(1) + keyType.binarySize(it) }
//                            ?: 0
//                        val valueSize = entry.value
//                            .takeIf { !valueType.isDefaultValue(it) }
//                            ?.let { Sizer.tagSize(2) + valueType.binarySize(it) }
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

        internal fun decodeFromBinary(
            metadata: FieldMetadata,
            tag: Tag,
            decoder: BinaryFieldValueDecoder,
            entryBlock: (K, V) -> Unit
        ) {
            val entry = entryCompanion.descriptor.messageValueType.decodeFromBinary(decoder)
            entryBlock(entry.key, entry.value)
        }

        @OptIn(ExperimentalStdlibApi::class)
        override fun decodeFromBinary(
            metadata: FieldMetadata,
            tag: Tag,
            decoder: BinaryFieldValueDecoder
        ): kotlin.collections.Map<K, V> {
            return buildMap(1) {
                decodeFromBinary(metadata, tag, decoder, ::put)
            }
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

        @OptIn(ExperimentalStdlibApi::class)
        override fun decodeFromJson(
            metadata: FieldMetadata,
            decoder: JsonFieldValueDecoder,
        ): kotlin.collections.Map<K, V> = when (decoder) {
            is JsonFieldValueDecoder.Null -> {
                decoder.consumeNull()
                emptyMap()
            }

            is JsonFieldValueDecoder.Object -> buildMap {
                decoder.decodeFields { fieldDecoder ->
                    fieldDecoder.forEachField(keyType::decodeFromJson) { mapKey, fieldValueDecoder ->
                        val mapValue = if (fieldValueDecoder is JsonFieldValueDecoder.Null) {
                            fieldValueDecoder.consumeNull()
                            valueType.defaultValue
                        } else {
                            valueType.decodeFromJson(fieldValueDecoder)
                        }
                        put(mapKey, mapValue)
                    }
                }
            }

            else -> TODO()
        }
    }
}
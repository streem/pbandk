package pbandk.types

import pbandk.FieldMetadata
import pbandk.gen.ListField
import pbandk.gen.MapField
import pbandk.gen.MutableMapFieldEntry
import pbandk.internal.binary.BinaryFieldEncoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireType
import pbandk.internal.json.JsonFieldEncoder
import pbandk.internal.types.primitive.Message

internal sealed class FieldType<KotlinType> {
    abstract fun mergeValues(metadata: FieldMetadata, value: KotlinType, otherValue: KotlinType): KotlinType

    abstract fun binarySize(metadata: FieldMetadata, value: KotlinType): Int
    abstract fun encodeToBinary(metadata: FieldMetadata, value: KotlinType, encoder: BinaryFieldEncoder)
    abstract fun encodeToJson(metadata: FieldMetadata, value: KotlinType, encoder: JsonFieldEncoder)
//    abstract fun decodeFromBinary(decoder: BinaryFieldDecoder)

    class Required<T : Any>(internal val valueType: ValueType<T>) : FieldType<T>() {
        override fun mergeValues(metadata: FieldMetadata, value: T, otherValue: T) =
            valueType.mergeValues(value, otherValue)

        override fun binarySize(metadata: FieldMetadata, value: T) =
            Sizer.tagSize(metadata.number) + valueType.binarySize(value)

        override fun encodeToBinary(metadata: FieldMetadata, value: T, encoder: BinaryFieldEncoder) {
            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T, encoder: JsonFieldEncoder) {
            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueType.encodeToJson(value, valueEncoder)
            }
        }
    }

    class HasPresence<T : Any>(internal val valueType: ValueType<T>) : FieldType<T?>() {
        override fun mergeValues(metadata: FieldMetadata, value: T?, otherValue: T?) = when {
            metadata.isOneofMember -> value
            value == null -> otherValue
            otherValue == null -> value
            else -> valueType.mergeValues(value, otherValue)
        }

        override fun binarySize(metadata: FieldMetadata, value: T?) =
            if (value == null) 0 else Sizer.tagSize(metadata.number) + valueType.binarySize(value)

        override fun encodeToBinary(metadata: FieldMetadata, value: T?, encoder: BinaryFieldEncoder) {
            if (value == null) return

            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
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
    }

    class NoPresence<T : Any>(internal val valueType: ValueType<T>) : FieldType<T>() {
        override fun mergeValues(metadata: FieldMetadata, value: T, otherValue: T) =
            valueType.mergeValues(value, otherValue)

        override fun binarySize(metadata: FieldMetadata, value: T) =
            if (valueType.isDefaultValue(value)) 0 else Sizer.tagSize(metadata.number) + valueType.binarySize(value)

        override fun encodeToBinary(metadata: FieldMetadata, value: T, encoder: BinaryFieldEncoder) {
            if (valueType.isDefaultValue(value)) return

            encoder.encodeField(Tag(metadata.number, valueType.binaryWireType)) { valueEncoder ->
                valueType.encodeToBinary(value, valueEncoder)
            }
        }

        override fun encodeToJson(metadata: FieldMetadata, value: T, encoder: JsonFieldEncoder) {
            if (!encoder.jsonConfig.outputDefaultValues && valueType.isDefaultValue(value)) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueType.encodeToJson(value, valueEncoder)
            }
        }
    }

    class Repeated<T : Any>(internal val valueType: ValueType<T>) : FieldType<List<T>>() {
        override fun mergeValues(metadata: FieldMetadata, value: List<T>, otherValue: List<T>): List<T> {

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
                    valueEncoder.encodeLenPrefix(listSize)
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

        override fun encodeToJson(metadata: FieldMetadata, value: List<T>, encoder: JsonFieldEncoder) {
            if (!encoder.jsonConfig.outputDefaultValues && value.isEmpty()) return

            encoder.encodeField(encoder.jsonConfig.getFieldJsonName(metadata)) { valueEncoder ->
                valueEncoder.encodeArray { arrayValueEncoder ->
                    value.forEach { valueType.encodeToJson(it, arrayValueEncoder) }
                }
            }
        }
    }

    class Map<K : Any, V : Any>(
        internal val keyType: ValueType<K>,
        internal val valueType: ValueType<V>,
    ) : FieldType<kotlin.collections.Map<K, V>>() {
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
            val keyTag = Tag(1, keyType.binaryWireType)
            val valueTag = Tag(2, valueType.binaryWireType)
            value.forEach { entry ->
                encoder.encodeField(entryTag) { valueEncoder ->
                    if (entry is MapField.Entry<*, *>) {
                        Message.encodeToBinary(entry, valueEncoder)
                    } else {
                        Message.encodeToBinary(
                            MutableMapFieldEntry(entry.key, entry.value, MapField.Entry.Companion(keyType, valueType)),
                            valueEncoder,
                        )
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
    }
}
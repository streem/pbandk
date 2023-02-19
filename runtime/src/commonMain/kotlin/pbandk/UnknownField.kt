package pbandk

import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.internal.binary.BinaryFieldDecoder
import pbandk.internal.binary.Tag
import pbandk.internal.binary.WireValue
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import pbandk.internal.types.FieldType
import pbandk.types.ValueType
import kotlin.js.JsExport

@JsExport
public data class UnknownField @PublicForGeneratedCode constructor(val fieldNum: Int, val values: List<Value>) {

    internal val size get() = (Tag.size(fieldNum) * values.size) + values.sumOf { it.size }

    public data class Value @PublicForGeneratedCode constructor(val wireType: Int, val wireValue: WireValue) {
        // public data class Value @PublicForGeneratedCode constructor(val wireType: Int, val rawBytes: ByteArr) {
        //     @PublicForGeneratedCode
        //     @JsName("fromByteArray")
        //     public constructor(wireType: Int, rawBytes: ByteArray) : this(wireType, ByteArr(rawBytes))

        internal val size get() = wireValue.size

        internal companion object
    }

    internal companion object
}

/*
internal fun <M : Message, T> UnknownField.Companion.encode(fieldDescriptor: FieldDescriptor<M, T>, value: T): UnknownField {
    return UnknownField(fieldDescriptor.number, listOf(UnknownField.Value.encode(fieldDescriptor.type, value)))
}

private fun <T> UnknownField.Value.Companion.encode(type: FieldDescriptor.Type, value: T): UnknownField.Value {
    val encoder = KotlinBinaryWireEncoder(ByteArrayWireWriter.allocate(100))
}
 */

@Suppress("UNCHECKED_CAST")
internal fun <M : Message, T> UnknownField.decodeAs(fieldDescriptor: FieldDescriptor<M, T>): T =
    when (val fieldType = fieldDescriptor.fieldType) {
        is FieldType.Optional<*> -> null as T // TODO
        is FieldType.Required<*> -> TODO()
        is FieldType.Singular<*> -> fieldType.valueType.defaultValue as T // TODO
        is FieldType.Repeated<*> -> decodeAsRepeated(fieldDescriptor.metadata, fieldType) as T
        is FieldType.Map<*, *> -> decodeAsMap(fieldDescriptor.metadata, fieldType) as T
    }

private fun <T : Any> UnknownField.Value.decodeAs(valueType: ValueType<T>): T {
    if (valueType.binaryWireType != WireType(wireType)) {
        throw InvalidProtocolBufferException("Unknown field with wire type $wireType can't be decoded as a '$valueType' field")
    }
    // TODO
    val wireReader = ByteArrayWireReader(byteArrayOf())
    val decoder = BinaryFieldValueDecoder(wireReader, BinaryFieldDecoder(wireReader))
    return valueType.decodeFromBinary(decoder)
}

private fun <T : Any> UnknownField.decodeAsRepeated(
    fieldMetadata: FieldMetadata,
    fieldType: FieldType.Repeated<T>
): List<T> {
    return emptyList()
    // TODO
    /*
    return values.asSequence()
        .flatMap {
            if (!fieldType.allowsBinaryWireType(WireType(it.wireType)))
                throw InvalidProtocolBufferException("Unknown field with wire type ${it.wireType} can't be decoded as a '$fieldType' field")
            }
            fieldType.decodeFromBinary(fieldMetadata, Tag.Zero, BinaryFieldValueDecoder())
            fieldType.valueType.decodeFromBinary()
            val decoder = KotlinBinaryWireDecoder(ByteArrayWireReader(it.rawBytes.array))
            BinaryMessageDecoder.readRepeatedField(type, WireType(it.wireType), decoder)
        }
        .toCollection(MutableListField(type.valueType))
        .toListField()
     */
}

/*
private fun <T> UnknownField.decodeAsPrimitive(fieldType: FieldType<T>): T {
    // Protobuf states it will only use the last value for multiple primitive types.
    return values.last().decodeAs(fieldType)
}

private fun <T : Message> UnknownField.decodeAsMessage(fieldType: FieldType<T>): T {
    return values.asSequence()
        .map { it.decodeAs<T>(fieldType) }
        .reduce { acc, t ->
            @Suppress("UNCHECKED_CAST")
            acc.plus(t) as T
        }
}
 */

private fun <K : Any, V : Any> UnknownField.decodeAsMap(
    fieldMetadata: FieldMetadata,
    fieldType: FieldType.Map<K, V>
): Map<K, V> {
    return emptyMap()
    // TODO
    /*
    @Suppress("UNCHECKED_CAST")
    val messageType = FieldDescriptor.Type.Message(type.entryCompanion, MapField.Entry::class as KClass<MapField.Entry<K, V>>)
    return MutableMapField(type.entryCompanion).apply {
        putAll(this@decodeAsMap.values.asSequence().map { it.decodeAs(messageType) })
    }.toMapField()
     */
}
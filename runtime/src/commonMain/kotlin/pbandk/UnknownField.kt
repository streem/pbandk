package pbandk

import pbandk.gen.MapField
import pbandk.gen.MutableListField
import pbandk.gen.MutableMapField
import pbandk.internal.binary.BinaryMessageDecoder
import pbandk.internal.binary.Sizer
import pbandk.internal.binary.WireType
import pbandk.internal.binary.allowedWireType
import pbandk.internal.binary.binaryReadFn
import pbandk.internal.binary.kotlin.ByteArrayWireReader
import pbandk.internal.binary.kotlin.KotlinBinaryWireDecoder
import kotlin.js.JsExport
import kotlin.js.JsName
import kotlin.reflect.KClass

@JsExport
public data class UnknownField @PublicForGeneratedCode constructor(val fieldNum: Int, val values: List<Value>) {

    internal val size get() = (Sizer.tagSize(fieldNum) * values.size) + values.sumOf { it.size }

    public data class Value @PublicForGeneratedCode constructor(val wireType: Int, val rawBytes: ByteArr) {
        @PublicForGeneratedCode
        @JsName("fromByteArray")
        public constructor(wireType: Int, rawBytes: ByteArray) : this(wireType, ByteArr(rawBytes))

        internal val size get() = rawBytes.array.size

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
internal fun <M : Message, T : Any> UnknownField.decodeAs(fieldDescriptor: FieldDescriptor<M, T>): T =
    when (fieldDescriptor.type) {
        is FieldDescriptor.Type.Enum<*> -> decodeAsEnum(fieldDescriptor.type) as T
        is FieldDescriptor.Type.Map<*, *> -> decodeAsMap(fieldDescriptor.type) as T
        is FieldDescriptor.Type.Message<*> -> decodeAsMessage(fieldDescriptor.type) as T
        is FieldDescriptor.Type.Primitive<*> -> decodeAsPrimitive(fieldDescriptor.type)
        is FieldDescriptor.Type.Repeated<*> -> decodeAsRepeated(fieldDescriptor.type) as T
    }

private fun <T> UnknownField.Value.decodeAs(type: FieldDescriptor.Type): T {
    if (!type.allowedWireType(WireType(wireType))) {
        throw InvalidProtocolBufferException("Unknown field with wire type $wireType can't be decoded as a '$type' field")
    }
    val decoder = KotlinBinaryWireDecoder(ByteArrayWireReader(rawBytes.array))

    @Suppress("UNCHECKED_CAST")
    return type.binaryReadFn(decoder) as T
}

private fun <T : Any> UnknownField.decodeAsRepeated(type: FieldDescriptor.Type.Repeated<T>): List<T> {
    return values.asSequence()
        .flatMap {
            if (!type.allowedWireType(WireType(it.wireType))) {
                throw InvalidProtocolBufferException("Unknown field with wire type ${it.wireType} can't be decoded as a '$type' field")
            }
            val decoder = KotlinBinaryWireDecoder(ByteArrayWireReader(it.rawBytes.array))
            BinaryMessageDecoder.readRepeatedField(type, WireType(it.wireType), decoder)
        }
        .toCollection(MutableListField(type.valueType))
        .toListField()
}

private fun <T> UnknownField.decodeAsPrimitive(type: FieldDescriptor.Type.Primitive<*>): T {
    // Protobuf states it will only use the last value for multiple primitive types.
    return values.last().decodeAs(type)
}

private fun <T : Message> UnknownField.decodeAsMessage(type: FieldDescriptor.Type.Message<T>): T {
    return values.asSequence()
        .map { it.decodeAs<T>(type) }
        .reduce { acc, t ->
            @Suppress("UNCHECKED_CAST")
            acc.plus(t) as T
        }
}

private fun <T : Message.Enum> UnknownField.decodeAsEnum(type: FieldDescriptor.Type.Enum<T>): T {
    // Protobuf states it will only use the last value for multiple primitive types.
    return values.last().decodeAs(type)
}

private fun <K : Any, V : Any> UnknownField.decodeAsMap(type: FieldDescriptor.Type.Map<K, V>): Map<K, V> {
    @Suppress("UNCHECKED_CAST")
    val messageType = FieldDescriptor.Type.Message(type.entryCompanion, MapField.Entry::class as KClass<MapField.Entry<K, V>>)
    return MutableMapField(type.entryCompanion).apply {
        putAll(this@decodeAsMap.values.asSequence().map { it.decodeAs(messageType) })
    }.toMapField()
}

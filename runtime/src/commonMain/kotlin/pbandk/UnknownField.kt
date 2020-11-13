package pbandk

import pbandk.internal.Util
import pbandk.internal.binary.Sizer

data class UnknownField @PublicForGeneratedCode constructor(val fieldNum: Int, val value: Value) {
    internal constructor(fieldNum: Int, value: Long, fixed: Boolean = false) :
        this(fieldNum, if (fixed) Value.Fixed64(value) else Value.Varint(value))
    internal constructor(fieldNum: Int, value: Int, fixed: Boolean = false) :
        this(fieldNum, if (fixed) Value.Fixed32(value) else Value.Varint(value.toLong()))
    internal constructor(fieldNum: Int, value: ByteArr) :
        this(fieldNum, Value.LengthDelimited(value))
    internal constructor(fieldNum: Int, value: ByteArray) :
        this(fieldNum, Value.LengthDelimited(ByteArr(value)))
    internal constructor(fieldNum: Int, value: String) :
        this(fieldNum, Value.LengthDelimited(ByteArr(Util.stringToUtf8(value))))

    internal fun size() =
        if (value is Value.Composite) (Sizer.tagSize(fieldNum) * value.values.size) + value.size()
        else Sizer.tagSize(fieldNum) + value.size()

    sealed class Value {
        internal abstract fun size(): Int

        data class Varint(val varint: Long) : Value() {
            override fun size() = Sizer.uInt64Size(varint)
        }
        data class Fixed64(val fixed64: Long) : Value() {
            override fun size() = Sizer.fixed64Size(fixed64)
        }
        data class LengthDelimited(val bytes: ByteArr) : Value() {
            override fun size() = Sizer.bytesSize(bytes)
        }
        object StartGroup : Value() {
            override fun size() = TODO()
        }
        object EndGroup : Value() {
            override fun size() = TODO()
        }
        data class Fixed32(val fixed32: Int) : Value() {
            override fun size() = Sizer.fixed32Size(fixed32)
        }
        data class Composite(val values: List<Value>) : Value() {
            override fun size() = values.sumBy { it.size() }
        }
    }
}

@Suppress("UNCHECKED_CAST")
internal fun <M : Message, T> pbandk.UnknownField.Value.parseUnknownField  (
    fieldDescriptor: FieldDescriptor<M, T>
): T {
    return when (fieldDescriptor.type) {
        is FieldDescriptor.Type.Enum<*> -> parseUnknownFieldForTypeEnum(fieldDescriptor.type, this) as T
        is FieldDescriptor.Type.Map<*,*> -> parseUnknownFieldForTypeMap(fieldDescriptor.type, this) as T
        is FieldDescriptor.Type.Message<*> -> parseUnknownFieldForTypeMessage(fieldDescriptor.type, this) as T
        is FieldDescriptor.Type.Primitive<*> -> parseUnknownFieldForPrimitiveOrComposite(fieldDescriptor.type, this) as T
        is FieldDescriptor.Type.Repeated<*> -> parseUnknownFieldForTypeRepeated(fieldDescriptor.type, this) as T
    }
}

private fun <T> parseUnknownFieldForPrimitiveOrComposite(type: FieldDescriptor.Type.Primitive<*>, unknownField: UnknownField.Value): T {
    return if (unknownField is UnknownField.Value.Composite) {
        // Protobuf states it will only used the last value for multiple primitive types.
        parseUnknownFieldForPrimitive(type, unknownField.values.last())
    } else {
        parseUnknownFieldForPrimitive(type, unknownField)
    }
}

// TODO Exception handling....
@Suppress("UNCHECKED_CAST")
private fun <T> parseUnknownFieldForPrimitive(type: FieldDescriptor.Type.Primitive<*>, unknownField: UnknownField.Value) : T {
    return when (type) {
        is FieldDescriptor.Type.Primitive.Bool -> ((unknownField as UnknownField.Value.Varint).varint  == 0L ) as T
        is FieldDescriptor.Type.Primitive.String -> Util.utf8ToString((unknownField as UnknownField.Value.LengthDelimited).bytes.array) as T
        is FieldDescriptor.Type.Primitive.Bytes -> ByteArr((unknownField as UnknownField.Value.LengthDelimited).bytes.array) as T
        is FieldDescriptor.Type.Primitive.Double -> Double.fromBits((unknownField as UnknownField.Value.Fixed64).fixed64) as T
        is FieldDescriptor.Type.Primitive.Float -> Float.fromBits((unknownField as UnknownField.Value.Fixed32).fixed32) as T
        is FieldDescriptor.Type.Primitive.Fixed32 -> (unknownField as UnknownField.Value.Fixed32).fixed32 as T
        is FieldDescriptor.Type.Primitive.SFixed32 -> (unknownField as UnknownField.Value.Fixed32).fixed32 as T
        is FieldDescriptor.Type.Primitive.Fixed64 -> (unknownField as UnknownField.Value.Fixed64).fixed64 as T
        is FieldDescriptor.Type.Primitive.SFixed64 -> (unknownField as UnknownField.Value.Fixed64).fixed64 as T
        is FieldDescriptor.Type.Primitive.Int32 -> (unknownField as UnknownField.Value.Varint).varint.toInt() as T
        is FieldDescriptor.Type.Primitive.SInt32 -> (unknownField as UnknownField.Value.Varint).varint.toInt() as T //TODO
        is FieldDescriptor.Type.Primitive.Int64 -> (unknownField as UnknownField.Value.Varint).varint as T
        is FieldDescriptor.Type.Primitive.SInt64 -> (unknownField as UnknownField.Value.Varint).varint as T //TODO
        is FieldDescriptor.Type.Primitive.UInt32 -> (unknownField as UnknownField.Value.Varint).varint.toInt() as T
        is FieldDescriptor.Type.Primitive.UInt64 -> (unknownField as UnknownField.Value.Varint).varint as T
    }
}

@Suppress("UNCHECKED_CAST")
private fun <T : Message> parseUnknownFieldForTypeMessage(
    type: FieldDescriptor.Type.Message<T>,
    unknownField: UnknownField.Value
): T {
    return when (unknownField) {
        is UnknownField.Value.Composite -> {
            unknownField.values
                .map { value ->
                    type.messageCompanion.decodeFromByteArray((value as UnknownField.Value.LengthDelimited).bytes.array)
                }
                .reduce { acc, it -> acc.plus(it) as T }

        }
        is UnknownField.Value.LengthDelimited -> type.messageCompanion.decodeFromByteArray(unknownField.bytes.array)
        else -> throw UnsupportedOperationException("unknown field is not supported: '${unknownField}'")
    }
}

@Suppress("UNCHECKED_CAST")
private fun <T : pbandk.Message.Enum> parseUnknownFieldForTypeEnum(
    type: FieldDescriptor.Type.Enum<T>,
    unknownField: UnknownField.Value
): T {
    return when (unknownField) {
        is UnknownField.Value.Composite -> type.enumCompanion.fromValue((unknownField.values.last() as UnknownField.Value.Varint).varint.toInt())
        is UnknownField.Value.LengthDelimited -> type.enumCompanion.fromValue((unknownField as UnknownField.Value.Varint).varint.toInt())
        else -> throw UnsupportedOperationException("unknown field is not supported: '${unknownField}'")
    }
}

@Suppress("UNCHECKED_CAST")
private fun <K,V> parseUnknownFieldForTypeMap(
    type: FieldDescriptor.Type.Map<K, V>,
    unknownField: UnknownField.Value
): MessageMap.Entry<K, V> {
    return when (unknownField) {
        is UnknownField.Value.Composite -> type.entryCompanion.decodeFromByteArray((unknownField.values.last() as UnknownField.Value.LengthDelimited).bytes.array)
        is UnknownField.Value.LengthDelimited -> type.entryCompanion.decodeFromByteArray(unknownField.bytes.array)
        else -> throw UnsupportedOperationException("unknown field is not supported: '${unknownField}'")
    }
}


@Suppress("UNCHECKED_CAST")
private fun <T : Any> parseUnknownFieldForTypeRepeated(
    type: FieldDescriptor.Type.Repeated<T>,
    unknownField: UnknownField.Value
): Sequence<T> {
    //TODO help
    return sequence {  }
}
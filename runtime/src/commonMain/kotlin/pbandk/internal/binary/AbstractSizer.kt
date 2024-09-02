package pbandk.internal.binary

import pbandk.ByteArr
import pbandk.FieldDescriptor
import pbandk.ListWithSize
import pbandk.Message
import pbandk.MessageEncoding
import pbandk.MessageMap
import pbandk.wkt.BoolValue
import pbandk.wkt.BytesValue
import pbandk.wkt.DoubleValue
import pbandk.wkt.FloatValue
import pbandk.wkt.Int32Value
import pbandk.wkt.Int64Value
import pbandk.wkt.StringValue
import pbandk.wkt.UInt32Value
import pbandk.wkt.UInt64Value
import kotlin.reflect.KProperty1

private fun <T : Any> wrapperProtoSize(value: T, type: FieldDescriptor.Type.Message<*>): Int {
    val valueType = type.messageCompanion.descriptor.fields.first().type
    val size = if (valueType.isDefaultValue(value)) 0 else PlatformSizer.tagSize(1) + valueType.protoSize(1, value)
    return PlatformSizer.uInt32Size(size) + size
}

internal fun FieldDescriptor.Type.protoSize(fieldNum: Int, value: Any) = when (this) {
    is FieldDescriptor.Type.Primitive.Double -> PlatformSizer.doubleSize(value as Double)
    is FieldDescriptor.Type.Primitive.Float -> PlatformSizer.floatSize(value as Float)
    is FieldDescriptor.Type.Primitive.Int64 -> PlatformSizer.int64Size(value as Long)
    is FieldDescriptor.Type.Primitive.UInt64 -> PlatformSizer.uInt64Size(value as Long)
    is FieldDescriptor.Type.Primitive.Int32 -> PlatformSizer.int32Size(value as Int)
    is FieldDescriptor.Type.Primitive.Fixed64 -> PlatformSizer.fixed64Size(value as Long)
    is FieldDescriptor.Type.Primitive.Fixed32 -> PlatformSizer.fixed32Size(value as Int)
    is FieldDescriptor.Type.Primitive.Bool -> PlatformSizer.boolSize(value as Boolean)
    is FieldDescriptor.Type.Primitive.String -> PlatformSizer.stringSize(value as String)
    is FieldDescriptor.Type.Primitive.Bytes -> PlatformSizer.bytesSize(value as ByteArr)
    is FieldDescriptor.Type.Primitive.UInt32 -> PlatformSizer.uInt32Size(value as Int)
    is FieldDescriptor.Type.Primitive.SFixed32 -> PlatformSizer.sFixed32Size(value as Int)
    is FieldDescriptor.Type.Primitive.SFixed64 -> PlatformSizer.sFixed64Size(value as Long)
    is FieldDescriptor.Type.Primitive.SInt32 -> PlatformSizer.sInt32Size(value as Int)
    is FieldDescriptor.Type.Primitive.SInt64 -> PlatformSizer.sInt64Size(value as Long)
    is FieldDescriptor.Type.Message<*> -> when (messageCompanion) {
        DoubleValue.Companion -> wrapperProtoSize(value as Double, this)
        FloatValue.Companion -> wrapperProtoSize(value as Float, this)
        Int64Value.Companion -> wrapperProtoSize(value as Long, this)
        UInt64Value.Companion -> wrapperProtoSize(value as Long, this)
        Int32Value.Companion -> wrapperProtoSize(value as Int, this)
        UInt32Value.Companion -> wrapperProtoSize(value as Int, this)
        BoolValue.Companion -> wrapperProtoSize(value as Boolean, this)
        StringValue.Companion -> wrapperProtoSize(value as String, this)
        BytesValue.Companion -> wrapperProtoSize(value as ByteArr, this)
        else -> when (encoding) {
            MessageEncoding.LENGTH_PREFIXED -> PlatformSizer.lengthPrefixedMessageSize(value as Message)
            MessageEncoding.DELIMITED -> PlatformSizer.delimitedMessageSize(fieldNum, value as Message)
        }
    }

    is FieldDescriptor.Type.Enum<*> -> PlatformSizer.enumSize(value as Message.Enum)
    is FieldDescriptor.Type.Repeated<*> -> PlatformSizer.repeatedSize(fieldNum, value as List<*>, valueType, packed)
    is FieldDescriptor.Type.Map<*, *> -> PlatformSizer.mapSize(value as Map<*, *>, entryCompanion)
}

internal abstract class AbstractSizer : Sizer {
    override fun stringSize(value: String): Int {
        val len = utf8Len(value)
        return uInt32Size(len) + len
    }

    override fun <T : Message.Enum> enumSize(value: T) = int32Size(value.value)

    override fun <T : Message> lengthPrefixedMessageSize(value: T) = uInt32Size(value.protoSize) + value.protoSize

    // NOTE: All of the methods in [Sizer] return the size of the field _exclusive_ of the field's tag. This means that
    // a delimited message field's size, as returned by this function, should only include the size of the END_GROUP tag
    // and not the START_GROUP tag.
    override fun <T : Message> delimitedMessageSize(fieldNum: Int, value: T) = tagSize(fieldNum) + value.protoSize

    override fun <T : Message> rawMessageSize(message: T): Int {
        var protoSize = 0
        for (fd in message.descriptor.fields) {
            @Suppress("UNCHECKED_CAST")
            val value = (fd.value as KProperty1<T, *>).get(message)

            if (fd.type.shouldOutputValue(value) && value != null) {
                protoSize += when (fd.type) {
                    is FieldDescriptor.Type.Repeated<*> -> {
                        tagSize(fd.number) * (if (fd.type.packed) 1 else (value as List<*>).size)
                    }

                    is FieldDescriptor.Type.Map<*, *> -> tagSize(fd.number) * (value as Map<*, *>).size
                    else -> tagSize(fd.number)
                }
                protoSize += fd.type.protoSize(fd.number, value)
            }
        }

        protoSize += message.unknownFields.values.sumOf { it.size }
        return protoSize
    }

    override fun <T> repeatedSize(fieldNum: Int, list: List<T>, valueType: FieldDescriptor.Type, packed: Boolean): Int {
        val sizeFn: (T) -> Int = { if (it != null) valueType.protoSize(fieldNum, it) else 0 }
        return if (packed) {
            packedRepeatedSize(list, sizeFn)
        } else {
            list.sumOf(sizeFn)
        }
    }

    override fun <T> packedRepeatedSize(list: List<T>, sizeFn: (T) -> Int) =
        if (list is ListWithSize && list.protoSize != null) list.protoSize + uInt32Size(list.protoSize)
        else list.sumOf(sizeFn).let { it + uInt32Size(it) }

    override fun mapSize(map: Map<*, *>, entryCompanion: MessageMap.Entry.Companion<*, *>): Int {
        return map.entries.sumOf { entry ->
            if (entry is MessageMap.Entry<*, *>) {
                entry.protoSize
            } else {
                val keySize = entry.key
                    .takeIf { entryCompanion.keyType.shouldOutputValue(it) }
                    ?.let { tagSize(1) + entryCompanion.keyType.protoSize(1, it) }
                    ?: 0
                val valueSize = entry.value
                    .takeIf { entryCompanion.valueType.shouldOutputValue(it) }
                    ?.let { tagSize(2) + entryCompanion.valueType.protoSize(2, it) }
                    ?: 0
                keySize + valueSize
            }.let { size ->
                uInt32Size(size) + size
            }
        }
    }

    override fun tagSize(fieldNum: Int) = uInt32Size(Tag(fieldNum, WireType(0)).value)

    override fun doubleSize(value: Double) = 8

    override fun floatSize(value: Float) = 4

    override fun int32Size(value: Int) = if (value >= 0) uInt32Size(value) else 10

    override fun int64Size(value: Long) = uInt64Size(value)

    override fun uInt32Size(value: Int) = when {
        value and (0.inv() shl 7) == 0 -> 1
        value and (0.inv() shl 14) == 0 -> 2
        value and (0.inv() shl 21) == 0 -> 3
        value and (0.inv() shl 28) == 0 -> 4
        else -> 5
    }

    override fun uInt64Size(value: Long): Int {
        // Taken from CodedOutputStream.java's computeUInt64SizeNoTag
        @Suppress("NAME_SHADOWING")
        var value = value
        if (value and (0L.inv() shl 7) == 0L) return 1
        if (value < 0L) return 10
        var n = 2
        if (value and (0L.inv() shl 35) != 0L) {
            n += 4
            value = value ushr 28
        }
        if (value and (0L.inv() shl 21) != 0L) {
            n += 2
            value = value ushr 14
        }
        if (value and (0L.inv() shl 14) != 0L) {
            n += 1
        }
        return n
    }

    override fun sInt32Size(value: Int) = uInt32Size(value.zigZagEncoded)

    override fun sInt64Size(value: Long) = uInt64Size(value.zigZagEncoded)

    override fun fixed32Size(value: Int) = 4

    override fun fixed64Size(value: Long) = 8

    override fun sFixed32Size(value: Int) = 4

    override fun sFixed64Size(value: Long) = 8

    override fun boolSize(value: Boolean) = 1

    override fun bytesSize(value: ByteArr) = uInt32Size(value.array.size) + value.array.size
}
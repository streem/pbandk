@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class DoubleValue(
    val value: Double = 0.0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<DoubleValue> {
    override operator fun plus(other: DoubleValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<DoubleValue> {
        val defaultInstance by lazy { DoubleValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = DoubleValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = DoubleValue.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Double? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class FloatValue(
    val value: Float = 0.0F,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FloatValue> {
    override operator fun plus(other: FloatValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FloatValue> {
        val defaultInstance by lazy { FloatValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FloatValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FloatValue.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Float? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class Int64Value(
    val value: Long = 0L,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Int64Value> {
    override operator fun plus(other: Int64Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Int64Value> {
        val defaultInstance by lazy { Int64Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Int64Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Int64Value.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Long? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class UInt64Value(
    val value: Long = 0L,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<UInt64Value> {
    override operator fun plus(other: UInt64Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<UInt64Value> {
        val defaultInstance by lazy { UInt64Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UInt64Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = UInt64Value.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Long? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class Int32Value(
    val value: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Int32Value> {
    override operator fun plus(other: Int32Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Int32Value> {
        val defaultInstance by lazy { Int32Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Int32Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Int32Value.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Int? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class UInt32Value(
    val value: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<UInt32Value> {
    override operator fun plus(other: UInt32Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<UInt32Value> {
        val defaultInstance by lazy { UInt32Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UInt32Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = UInt32Value.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Int? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class BoolValue(
    val value: Boolean = false,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<BoolValue> {
    override operator fun plus(other: BoolValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<BoolValue> {
        val defaultInstance by lazy { BoolValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = BoolValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = BoolValue.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: Boolean? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class StringValue(
    val value: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<StringValue> {
    override operator fun plus(other: StringValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<StringValue> {
        val defaultInstance by lazy { StringValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = StringValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = StringValue.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class BytesValue(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<BytesValue> {
    override operator fun plus(other: BytesValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<BytesValue> {
        val defaultInstance by lazy { BytesValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = BytesValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = BytesValue.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("value")
        val value: pbandk.ByteArr? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun DoubleValue?.orDefault() = this ?: DoubleValue.defaultInstance

private fun DoubleValue.protoMergeImpl(plus: DoubleValue?): DoubleValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DoubleValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0.0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.doubleSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DoubleValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0.0) protoMarshal.writeTag(9).writeDouble(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun DoubleValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DoubleValue {
    var value = 0.0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return DoubleValue(value, protoUnmarshal.unknownFields())
        9 -> value = protoUnmarshal.readDouble()
        else -> protoUnmarshal.unknownField()
    }
}

private fun DoubleValue.toJsonMapperImpl(): DoubleValue.JsonMapper =
    DoubleValue.JsonMapper(
        value
    )

private fun DoubleValue.JsonMapper.toMessageImpl(): DoubleValue =
    DoubleValue(
        value = value ?: 0.0
    )

private fun DoubleValue.jsonMarshalImpl(json: Json): String =
    json.stringify(DoubleValue.JsonMapper.serializer(), toJsonMapper())

private fun DoubleValue.Companion.jsonUnmarshalImpl(json: Json, data: String): DoubleValue {
    val mapper = json.parse(DoubleValue.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun FloatValue?.orDefault() = this ?: FloatValue.defaultInstance

private fun FloatValue.protoMergeImpl(plus: FloatValue?): FloatValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FloatValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0.0F) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.floatSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FloatValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0.0F) protoMarshal.writeTag(13).writeFloat(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FloatValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FloatValue {
    var value = 0.0F
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FloatValue(value, protoUnmarshal.unknownFields())
        13 -> value = protoUnmarshal.readFloat()
        else -> protoUnmarshal.unknownField()
    }
}

private fun FloatValue.toJsonMapperImpl(): FloatValue.JsonMapper =
    FloatValue.JsonMapper(
        value
    )

private fun FloatValue.JsonMapper.toMessageImpl(): FloatValue =
    FloatValue(
        value = value ?: 0.0F
    )

private fun FloatValue.jsonMarshalImpl(json: Json): String =
    json.stringify(FloatValue.JsonMapper.serializer(), toJsonMapper())

private fun FloatValue.Companion.jsonUnmarshalImpl(json: Json, data: String): FloatValue {
    val mapper = json.parse(FloatValue.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun Int64Value?.orDefault() = this ?: Int64Value.defaultInstance

private fun Int64Value.protoMergeImpl(plus: Int64Value?): Int64Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Int64Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Int64Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0L) protoMarshal.writeTag(8).writeInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Int64Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Int64Value {
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Int64Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Int64Value.toJsonMapperImpl(): Int64Value.JsonMapper =
    Int64Value.JsonMapper(
        value
    )

private fun Int64Value.JsonMapper.toMessageImpl(): Int64Value =
    Int64Value(
        value = value ?: 0L
    )

private fun Int64Value.jsonMarshalImpl(json: Json): String =
    json.stringify(Int64Value.JsonMapper.serializer(), toJsonMapper())

private fun Int64Value.Companion.jsonUnmarshalImpl(json: Json, data: String): Int64Value {
    val mapper = json.parse(Int64Value.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun UInt64Value?.orDefault() = this ?: UInt64Value.defaultInstance

private fun UInt64Value.protoMergeImpl(plus: UInt64Value?): UInt64Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UInt64Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UInt64Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0L) protoMarshal.writeTag(8).writeUInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UInt64Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UInt64Value {
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UInt64Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readUInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun UInt64Value.toJsonMapperImpl(): UInt64Value.JsonMapper =
    UInt64Value.JsonMapper(
        value
    )

private fun UInt64Value.JsonMapper.toMessageImpl(): UInt64Value =
    UInt64Value(
        value = value ?: 0L
    )

private fun UInt64Value.jsonMarshalImpl(json: Json): String =
    json.stringify(UInt64Value.JsonMapper.serializer(), toJsonMapper())

private fun UInt64Value.Companion.jsonUnmarshalImpl(json: Json, data: String): UInt64Value {
    val mapper = json.parse(UInt64Value.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun Int32Value?.orDefault() = this ?: Int32Value.defaultInstance

private fun Int32Value.protoMergeImpl(plus: Int32Value?): Int32Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Int32Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Int32Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0) protoMarshal.writeTag(8).writeInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Int32Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Int32Value {
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Int32Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Int32Value.toJsonMapperImpl(): Int32Value.JsonMapper =
    Int32Value.JsonMapper(
        value
    )

private fun Int32Value.JsonMapper.toMessageImpl(): Int32Value =
    Int32Value(
        value = value ?: 0
    )

private fun Int32Value.jsonMarshalImpl(json: Json): String =
    json.stringify(Int32Value.JsonMapper.serializer(), toJsonMapper())

private fun Int32Value.Companion.jsonUnmarshalImpl(json: Json, data: String): Int32Value {
    val mapper = json.parse(Int32Value.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun UInt32Value?.orDefault() = this ?: UInt32Value.defaultInstance

private fun UInt32Value.protoMergeImpl(plus: UInt32Value?): UInt32Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UInt32Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UInt32Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0) protoMarshal.writeTag(8).writeUInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UInt32Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UInt32Value {
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UInt32Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun UInt32Value.toJsonMapperImpl(): UInt32Value.JsonMapper =
    UInt32Value.JsonMapper(
        value
    )

private fun UInt32Value.JsonMapper.toMessageImpl(): UInt32Value =
    UInt32Value(
        value = value ?: 0
    )

private fun UInt32Value.jsonMarshalImpl(json: Json): String =
    json.stringify(UInt32Value.JsonMapper.serializer(), toJsonMapper())

private fun UInt32Value.Companion.jsonUnmarshalImpl(json: Json, data: String): UInt32Value {
    val mapper = json.parse(UInt32Value.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun BoolValue?.orDefault() = this ?: BoolValue.defaultInstance

private fun BoolValue.protoMergeImpl(plus: BoolValue?): BoolValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun BoolValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun BoolValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value) protoMarshal.writeTag(8).writeBool(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun BoolValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): BoolValue {
    var value = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return BoolValue(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun BoolValue.toJsonMapperImpl(): BoolValue.JsonMapper =
    BoolValue.JsonMapper(
        value
    )

private fun BoolValue.JsonMapper.toMessageImpl(): BoolValue =
    BoolValue(
        value = value ?: false
    )

private fun BoolValue.jsonMarshalImpl(json: Json): String =
    json.stringify(BoolValue.JsonMapper.serializer(), toJsonMapper())

private fun BoolValue.Companion.jsonUnmarshalImpl(json: Json, data: String): BoolValue {
    val mapper = json.parse(BoolValue.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun StringValue?.orDefault() = this ?: StringValue.defaultInstance

private fun StringValue.protoMergeImpl(plus: StringValue?): StringValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun StringValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun StringValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value.isNotEmpty()) protoMarshal.writeTag(10).writeString(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun StringValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): StringValue {
    var value = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return StringValue(value, protoUnmarshal.unknownFields())
        10 -> value = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun StringValue.toJsonMapperImpl(): StringValue.JsonMapper =
    StringValue.JsonMapper(
        value.takeIf { it != "" }
    )

private fun StringValue.JsonMapper.toMessageImpl(): StringValue =
    StringValue(
        value = value ?: ""
    )

private fun StringValue.jsonMarshalImpl(json: Json): String =
    json.stringify(StringValue.JsonMapper.serializer(), toJsonMapper())

private fun StringValue.Companion.jsonUnmarshalImpl(json: Json, data: String): StringValue {
    val mapper = json.parse(StringValue.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun BytesValue?.orDefault() = this ?: BytesValue.defaultInstance

private fun BytesValue.protoMergeImpl(plus: BytesValue?): BytesValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun BytesValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun BytesValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value.array.isNotEmpty()) protoMarshal.writeTag(10).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun BytesValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): BytesValue {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return BytesValue(value, protoUnmarshal.unknownFields())
        10 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

private fun BytesValue.toJsonMapperImpl(): BytesValue.JsonMapper =
    BytesValue.JsonMapper(
        value
    )

private fun BytesValue.JsonMapper.toMessageImpl(): BytesValue =
    BytesValue(
        value = value ?: pbandk.ByteArr.empty
    )

private fun BytesValue.jsonMarshalImpl(json: Json): String =
    json.stringify(BytesValue.JsonMapper.serializer(), toJsonMapper())

private fun BytesValue.Companion.jsonUnmarshalImpl(json: Json, data: String): BytesValue {
    val mapper = json.parse(BytesValue.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

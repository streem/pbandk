package pbandk.wkt

import kotlin.jvm.Transient

sealed class NullValue(override val value: Int, override val name: String? = null) : pbandk.Message.NamedEnum {
    override fun equals(other: kotlin.Any?) = other is NullValue && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "NullValue.${name ?: "UNRECOGNIZED"}(value=$value)"

    object NullValue_ : NullValue(0, "NULL_VALUE")
    class Unrecognized(value: Int) : NullValue(value)

    companion object : pbandk.Message.NamedEnum.Companion<NullValue> {
        val values: List<NullValue> by lazy { listOf(NullValue_) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: Unrecognized(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NullValue with name: $name")
    }
}

data class Struct(
    val fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Struct> {
    override operator fun plus(other: Struct?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Struct> {
        val defaultInstance by lazy { Struct() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Struct.protoUnmarshalImpl(u)
    }

    data class FieldsEntry(
        override val key: String = "",
        override val value: pbandk.wkt.Value? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<FieldsEntry>, Map.Entry<String, pbandk.wkt.Value?> {
        override operator fun plus(other: FieldsEntry?) = protoMergeImpl(other)
        @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<FieldsEntry> {
            val defaultInstance by lazy { FieldsEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldsEntry.protoUnmarshalImpl(u)
        }
    }
}

data class Value(
    val kind: Kind<*>? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Value> {
    sealed class Kind<V>(val value: V) {
        class NullValue(nullValue: pbandk.wkt.NullValue = pbandk.wkt.NullValue.fromValue(0)) : Kind<pbandk.wkt.NullValue>(nullValue)
        class NumberValue(numberValue: Double = 0.0) : Kind<Double>(numberValue)
        class StringValue(stringValue: String = "") : Kind<String>(stringValue)
        class BoolValue(boolValue: Boolean = false) : Kind<Boolean>(boolValue)
        class StructValue(structValue: pbandk.wkt.Struct) : Kind<pbandk.wkt.Struct>(structValue)
        class ListValue(listValue: pbandk.wkt.ListValue) : Kind<pbandk.wkt.ListValue>(listValue)
    }

    val nullValue: pbandk.wkt.NullValue?
        get() = (kind as? Kind.NullValue)?.value
    val numberValue: Double?
        get() = (kind as? Kind.NumberValue)?.value
    val stringValue: String?
        get() = (kind as? Kind.StringValue)?.value
    val boolValue: Boolean?
        get() = (kind as? Kind.BoolValue)?.value
    val structValue: pbandk.wkt.Struct?
        get() = (kind as? Kind.StructValue)?.value
    val listValue: pbandk.wkt.ListValue?
        get() = (kind as? Kind.ListValue)?.value

    override operator fun plus(other: Value?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Value> {
        val defaultInstance by lazy { Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Value.protoUnmarshalImpl(u)
    }
}

data class ListValue(
    val values: List<pbandk.wkt.Value> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ListValue> {
    override operator fun plus(other: ListValue?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<ListValue> {
        val defaultInstance by lazy { ListValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ListValue.protoUnmarshalImpl(u)
    }
}

fun Struct?.orDefault() = this ?: Struct.defaultInstance

private fun Struct.protoMergeImpl(plus: Struct?): Struct = plus?.copy(
    fields = fields + plus.fields,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Struct.protoSizeImpl(): Int {
    var protoSize = 0
    if (fields.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(1, fields, pbandk.wkt.Struct::FieldsEntry)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Struct.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (fields.isNotEmpty()) protoMarshal.writeMap(10, fields, pbandk.wkt.Struct::FieldsEntry)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Struct.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Struct {
    var fields: pbandk.MessageMap.Builder<String, pbandk.wkt.Value?>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Struct(pbandk.MessageMap.Builder.fixed(fields), protoUnmarshal.unknownFields())
        10 -> fields = protoUnmarshal.readMap(fields, pbandk.wkt.Struct.FieldsEntry.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

fun Struct.FieldsEntry?.orDefault() = this ?: Struct.FieldsEntry.defaultInstance

private fun Struct.FieldsEntry.protoMergeImpl(plus: Struct.FieldsEntry?): Struct.FieldsEntry = plus?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Struct.FieldsEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Struct.FieldsEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Struct.FieldsEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Struct.FieldsEntry {
    var key = ""
    var value: pbandk.wkt.Value? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Struct.FieldsEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.wkt.Value.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

fun Value?.orDefault() = this ?: Value.defaultInstance

private fun Value.protoMergeImpl(plus: Value?): Value = plus?.copy(
    kind = when {
        kind is Value.Kind.StructValue && plus.kind is Value.Kind.StructValue ->
            Value.Kind.StructValue(kind.value + plus.kind.value)
        kind is Value.Kind.ListValue && plus.kind is Value.Kind.ListValue ->
            Value.Kind.ListValue(kind.value + plus.kind.value)
        else ->
            plus.kind ?: kind
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Value.protoSizeImpl(): Int {
    var protoSize = 0
    when (kind) {
        is Value.Kind.NullValue -> protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.enumSize(kind.value)
        is Value.Kind.NumberValue -> protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.doubleSize(kind.value)
        is Value.Kind.StringValue -> protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(kind.value)
        is Value.Kind.BoolValue -> protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.boolSize(kind.value)
        is Value.Kind.StructValue -> protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.messageSize(kind.value)
        is Value.Kind.ListValue -> protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.messageSize(kind.value)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (kind is Value.Kind.NullValue) protoMarshal.writeTag(8).writeEnum(kind.value)
    if (kind is Value.Kind.NumberValue) protoMarshal.writeTag(17).writeDouble(kind.value)
    if (kind is Value.Kind.StringValue) protoMarshal.writeTag(26).writeString(kind.value)
    if (kind is Value.Kind.BoolValue) protoMarshal.writeTag(32).writeBool(kind.value)
    if (kind is Value.Kind.StructValue) protoMarshal.writeTag(42).writeMessage(kind.value)
    if (kind is Value.Kind.ListValue) protoMarshal.writeTag(50).writeMessage(kind.value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Value {
    var kind: Value.Kind<*>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Value(kind, protoUnmarshal.unknownFields())
        8 -> kind = Value.Kind.NullValue(protoUnmarshal.readEnum(pbandk.wkt.NullValue.Companion))
        17 -> kind = Value.Kind.NumberValue(protoUnmarshal.readDouble())
        26 -> kind = Value.Kind.StringValue(protoUnmarshal.readString())
        32 -> kind = Value.Kind.BoolValue(protoUnmarshal.readBool())
        42 -> kind = Value.Kind.StructValue(protoUnmarshal.readMessage(pbandk.wkt.Struct.Companion))
        50 -> kind = Value.Kind.ListValue(protoUnmarshal.readMessage(pbandk.wkt.ListValue.Companion))
        else -> protoUnmarshal.unknownField()
    }
}

fun ListValue?.orDefault() = this ?: ListValue.defaultInstance

private fun ListValue.protoMergeImpl(plus: ListValue?): ListValue = plus?.copy(
    values = values + plus.values,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ListValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (values.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * values.size) + values.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ListValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (values.isNotEmpty()) values.forEach { protoMarshal.writeTag(10).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ListValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ListValue {
    var values: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ListValue(pbandk.ListWithSize.Builder.fixed(values), protoUnmarshal.unknownFields())
        10 -> values = protoUnmarshal.readRepeatedMessage(values, pbandk.wkt.Value.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

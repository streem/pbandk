@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed class NullValue(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is NullValue && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "NullValue.${name ?: "UNRECOGNIZED"}(value=$value)"

    object NULL_VALUE : NullValue(0, "NULL_VALUE")
    class UNRECOGNIZED(value: Int) : NullValue(value)

    companion object : pbandk.Message.Enum.Companion<NullValue> {
        val values: List<NullValue> by lazy { listOf(NULL_VALUE) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NullValue with name: $name")
    }
}

data class Struct(
    val fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Struct> {
        val defaultInstance by lazy { Struct() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Struct> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Struct::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "fields",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.wkt.Value?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "fields",
                        value = Struct::fields
                    )
                )
            )
        }
    }

    data class FieldsEntry(
        override val key: String = "",
        override val value: pbandk.wkt.Value? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.wkt.Value?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<Struct.FieldsEntry> {
            val defaultInstance by lazy { Struct.FieldsEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = Struct.FieldsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<Struct.FieldsEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = Struct.FieldsEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = Struct.FieldsEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                            jsonName = "value",
                            value = Struct.FieldsEntry::value
                        )
                    )
                )
            }
        }
    }
}

data class Value(
    val kind: Kind<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class Kind<V>(value: V) : pbandk.Message.OneOf<V>(value) {
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

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Value> {
        val defaultInstance by lazy { Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Value> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Value::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "null_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.NullValue.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "nullValue",
                        value = Value::nullValue
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "number_value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        oneofMember = true,
                        jsonName = "numberValue",
                        value = Value::numberValue
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "string_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "stringValue",
                        value = Value::stringValue
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bool_value",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "boolValue",
                        value = Value::boolValue
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "struct_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        oneofMember = true,
                        jsonName = "structValue",
                        value = Value::structValue
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "list_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ListValue.Companion),
                        oneofMember = true,
                        jsonName = "listValue",
                        value = Value::listValue
                    )
                )
            )
        }
    }
}

data class ListValue(
    val values: List<pbandk.wkt.Value> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<ListValue> {
        val defaultInstance by lazy { ListValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ListValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = ListValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "values",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "values",
                        value = ListValue::values
                    )
                )
            )
        }
    }
}

fun Struct?.orDefault() = this ?: Struct.defaultInstance

private fun Struct.protoMergeImpl(plus: pbandk.Message?): Struct = (plus as? Struct)?.copy(
    fields = fields + plus.fields,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct {
    var fields: pbandk.MessageMap.Builder<String, pbandk.wkt.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fields = (fields ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.wkt.Value?>> }
        }
    }
    return Struct(pbandk.MessageMap.Builder.fixed(fields), unknownFields)
}

fun Struct.FieldsEntry?.orDefault() = this ?: Struct.FieldsEntry.defaultInstance

private fun Struct.FieldsEntry.protoMergeImpl(plus: pbandk.Message?): Struct.FieldsEntry = (plus as? Struct.FieldsEntry)?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.FieldsEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct.FieldsEntry {
    var key = ""
    var value: pbandk.wkt.Value? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.wkt.Value
        }
    }
    return Struct.FieldsEntry(key, value, unknownFields)
}

fun Value?.orDefault() = this ?: Value.defaultInstance

private fun Value.protoMergeImpl(plus: pbandk.Message?): Value = (plus as? Value)?.copy(
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

@Suppress("UNCHECKED_CAST")
private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Value {
    var kind: Value.Kind<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> kind = Value.Kind.NullValue(_fieldValue as pbandk.wkt.NullValue)
            2 -> kind = Value.Kind.NumberValue(_fieldValue as Double)
            3 -> kind = Value.Kind.StringValue(_fieldValue as String)
            4 -> kind = Value.Kind.BoolValue(_fieldValue as Boolean)
            5 -> kind = Value.Kind.StructValue(_fieldValue as pbandk.wkt.Struct)
            6 -> kind = Value.Kind.ListValue(_fieldValue as pbandk.wkt.ListValue)
        }
    }
    return Value(kind, unknownFields)
}

fun ListValue?.orDefault() = this ?: ListValue.defaultInstance

private fun ListValue.protoMergeImpl(plus: pbandk.Message?): ListValue = (plus as? ListValue)?.copy(
    values = values + plus.values,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ListValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListValue {
    var values: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
        }
    }
    return ListValue(pbandk.ListWithSize.Builder.fixed(values), unknownFields)
}

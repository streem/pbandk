@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed class NullValue(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.NullValue && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "NullValue.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object NULL_VALUE : NullValue(0, "NULL_VALUE")
    public class UNRECOGNIZED(value: Int) : NullValue(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.NullValue> {
        public val values: List<pbandk.wkt.NullValue> by lazy { listOf(NULL_VALUE) }
        override fun fromValue(value: Int): pbandk.wkt.NullValue = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.wkt.NullValue = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NullValue with name: $name")
    }
}

@pbandk.Export
public data class Struct(
    val fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        public val defaultInstance: pbandk.wkt.Struct by lazy { pbandk.wkt.Struct() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct = pbandk.wkt.Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.Struct",
            messageClass = pbandk.wkt.Struct::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fields",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.wkt.Value?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "fields",
                        value = pbandk.wkt.Struct::fields
                    )
                )
            }
        )
    }

    public data class FieldsEntry(
        override val key: String = "",
        override val value: pbandk.wkt.Value? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.wkt.Value?> {
        override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct.FieldsEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.wkt.Struct.FieldsEntry> {
            public val defaultInstance: pbandk.wkt.Struct.FieldsEntry by lazy { pbandk.wkt.Struct.FieldsEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct.FieldsEntry = pbandk.wkt.Struct.FieldsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry> = pbandk.MessageDescriptor(
                fullName = "google.protobuf.Struct.FieldsEntry",
                messageClass = pbandk.wkt.Struct.FieldsEntry::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.wkt.Struct.FieldsEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                            jsonName = "value",
                            value = pbandk.wkt.Struct.FieldsEntry::value
                        )
                    )
                }
            )
        }
    }
}

@pbandk.Export
public data class Value(
    val kind: Kind<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Kind<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class NullValue(nullValue: pbandk.wkt.NullValue = pbandk.wkt.NullValue.fromValue(0)) : Kind<pbandk.wkt.NullValue>(nullValue)
        public class NumberValue(numberValue: Double = 0.0) : Kind<Double>(numberValue)
        public class StringValue(stringValue: String = "") : Kind<String>(stringValue)
        public class BoolValue(boolValue: Boolean = false) : Kind<Boolean>(boolValue)
        public class StructValue(structValue: pbandk.wkt.Struct) : Kind<pbandk.wkt.Struct>(structValue)
        public class ListValue(listValue: pbandk.wkt.ListValue) : Kind<pbandk.wkt.ListValue>(listValue)
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

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Value> {
        public val defaultInstance: pbandk.wkt.Value by lazy { pbandk.wkt.Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Value = pbandk.wkt.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.Value",
            messageClass = pbandk.wkt.Value::class,
            messageCompanion = this,
            fields = buildList(6) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "null_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.NullValue.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "nullValue",
                        value = pbandk.wkt.Value::nullValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number_value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        oneofMember = true,
                        jsonName = "numberValue",
                        value = pbandk.wkt.Value::numberValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "stringValue",
                        value = pbandk.wkt.Value::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bool_value",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "boolValue",
                        value = pbandk.wkt.Value::boolValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "struct_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        oneofMember = true,
                        jsonName = "structValue",
                        value = pbandk.wkt.Value::structValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "list_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ListValue.Companion),
                        oneofMember = true,
                        jsonName = "listValue",
                        value = pbandk.wkt.Value::listValue
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class ListValue(
    val values: List<pbandk.wkt.Value> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ListValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        public val defaultInstance: pbandk.wkt.ListValue by lazy { pbandk.wkt.ListValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ListValue = pbandk.wkt.ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.ListValue",
            messageClass = pbandk.wkt.ListValue::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "values",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "values",
                        value = pbandk.wkt.ListValue::values
                    )
                )
            }
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForStruct")
public fun Struct?.orDefault(): pbandk.wkt.Struct = this ?: Struct.defaultInstance

private fun Struct.protoMergeImpl(plus: pbandk.Message?): Struct = (plus as? Struct)?.let {
    it.copy(
        fields = fields + plus.fields,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct {
    var fields: pbandk.MessageMap.Builder<String, pbandk.wkt.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fields = (fields ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as kotlin.sequences.Sequence<pbandk.MessageMap.Entry<String, pbandk.wkt.Value?>> }
        }
    }

    return Struct(pbandk.MessageMap.Builder.fixed(fields), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForStructFieldsEntry")
public fun Struct.FieldsEntry?.orDefault(): pbandk.wkt.Struct.FieldsEntry = this ?: Struct.FieldsEntry.defaultInstance

private fun Struct.FieldsEntry.protoMergeImpl(plus: pbandk.Message?): Struct.FieldsEntry = (plus as? Struct.FieldsEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): pbandk.wkt.Value = this ?: Value.defaultInstance

private fun Value.protoMergeImpl(plus: pbandk.Message?): Value = (plus as? Value)?.let {
    it.copy(
        kind = when {
            kind is Value.Kind.StructValue && plus.kind is Value.Kind.StructValue ->
                Value.Kind.StructValue(kind.value + plus.kind.value)
            kind is Value.Kind.ListValue && plus.kind is Value.Kind.ListValue ->
                Value.Kind.ListValue(kind.value + plus.kind.value)
            else ->
                plus.kind ?: kind
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForListValue")
public fun ListValue?.orDefault(): pbandk.wkt.ListValue = this ?: ListValue.defaultInstance

private fun ListValue.protoMergeImpl(plus: pbandk.Message?): ListValue = (plus as? ListValue)?.let {
    it.copy(
        values = values + plus.values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListValue {
    var values: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Value> }
        }
    }

    return ListValue(pbandk.ListWithSize.Builder.fixed(values), unknownFields)
}

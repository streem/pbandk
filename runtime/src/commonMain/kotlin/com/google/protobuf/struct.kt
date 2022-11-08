@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public sealed class NullValue(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is NullValue && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "NullValue.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object NULL_VALUE : NullValue(0, "NULL_VALUE")
    public class UNRECOGNIZED(value: Int) : NullValue(value)

    public companion object : pbandk.Message.Enum.Companion<NullValue> {
        public val values: List<NullValue> by lazy { listOf(NULL_VALUE) }
        override fun fromValue(value: Int): NullValue = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): NullValue = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NullValue with name: $name")
    }
}

@pbandk.Export
public data class Struct(
    val fields: Map<String, com.google.protobuf.Value?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Struct = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Struct> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Struct> {
        public val defaultInstance: com.google.protobuf.Struct by lazy { com.google.protobuf.Struct() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Struct = com.google.protobuf.Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Struct> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Struct, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fields",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, com.google.protobuf.Value?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Value.Companion)),
                        jsonName = "fields",
                        value = com.google.protobuf.Struct::fields
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Struct",
                messageClass = com.google.protobuf.Struct::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class FieldsEntry(
        override val key: String = "",
        override val value: com.google.protobuf.Value? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, com.google.protobuf.Value?> {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.Struct.FieldsEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Struct.FieldsEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.Struct.FieldsEntry> {
            public val defaultInstance: com.google.protobuf.Struct.FieldsEntry by lazy { com.google.protobuf.Struct.FieldsEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Struct.FieldsEntry = com.google.protobuf.Struct.FieldsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Struct.FieldsEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Struct.FieldsEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = com.google.protobuf.Struct.FieldsEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Value.Companion),
                            jsonName = "value",
                            value = com.google.protobuf.Struct.FieldsEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.Struct.FieldsEntry",
                    messageClass = com.google.protobuf.Struct.FieldsEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class Value(
    val kind: Kind<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Kind<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class NullValue(nullValue: com.google.protobuf.NullValue = com.google.protobuf.NullValue.fromValue(0)) : Kind<com.google.protobuf.NullValue>(nullValue)
        public class NumberValue(numberValue: Double = 0.0) : Kind<Double>(numberValue)
        public class StringValue(stringValue: String = "") : Kind<String>(stringValue)
        public class BoolValue(boolValue: Boolean = false) : Kind<Boolean>(boolValue)
        public class StructValue(structValue: com.google.protobuf.Struct) : Kind<com.google.protobuf.Struct>(structValue)
        public class ListValue(listValue: com.google.protobuf.ListValue) : Kind<com.google.protobuf.ListValue>(listValue)
    }

    val nullValue: com.google.protobuf.NullValue?
        get() = (kind as? Kind.NullValue)?.value
    val numberValue: Double?
        get() = (kind as? Kind.NumberValue)?.value
    val stringValue: String?
        get() = (kind as? Kind.StringValue)?.value
    val boolValue: Boolean?
        get() = (kind as? Kind.BoolValue)?.value
    val structValue: com.google.protobuf.Struct?
        get() = (kind as? Kind.StructValue)?.value
    val listValue: com.google.protobuf.ListValue?
        get() = (kind as? Kind.ListValue)?.value

    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Value> {
        public val defaultInstance: com.google.protobuf.Value by lazy { com.google.protobuf.Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Value = com.google.protobuf.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Value, *>>(6)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "null_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.NullValue.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "nullValue",
                        value = com.google.protobuf.Value::nullValue
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
                        value = com.google.protobuf.Value::numberValue
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
                        value = com.google.protobuf.Value::stringValue
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
                        value = com.google.protobuf.Value::boolValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "struct_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Struct.Companion),
                        oneofMember = true,
                        jsonName = "structValue",
                        value = com.google.protobuf.Value::structValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "list_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.ListValue.Companion),
                        oneofMember = true,
                        jsonName = "listValue",
                        value = com.google.protobuf.Value::listValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Value",
                messageClass = com.google.protobuf.Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ListValue(
    val values: List<com.google.protobuf.Value> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.ListValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ListValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.ListValue> {
        public val defaultInstance: com.google.protobuf.ListValue by lazy { com.google.protobuf.ListValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.ListValue = com.google.protobuf.ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ListValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.ListValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "values",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Value.Companion)),
                        jsonName = "values",
                        value = com.google.protobuf.ListValue::values
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.ListValue",
                messageClass = com.google.protobuf.ListValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForStruct")
public fun Struct?.orDefault(): com.google.protobuf.Struct = this ?: Struct.defaultInstance

private fun Struct.protoMergeImpl(plus: pbandk.Message?): Struct = (plus as? Struct)?.let {
    it.copy(
        fields = fields + plus.fields,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct {
    var fields: pbandk.MessageMap.Builder<String, com.google.protobuf.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fields = (fields ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, com.google.protobuf.Value?>> }
        }
    }

    return Struct(pbandk.MessageMap.Builder.fixed(fields), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForStructFieldsEntry")
public fun Struct.FieldsEntry?.orDefault(): com.google.protobuf.Struct.FieldsEntry = this ?: Struct.FieldsEntry.defaultInstance

private fun Struct.FieldsEntry.protoMergeImpl(plus: pbandk.Message?): Struct.FieldsEntry = (plus as? Struct.FieldsEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.FieldsEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct.FieldsEntry {
    var key = ""
    var value: com.google.protobuf.Value? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as com.google.protobuf.Value
        }
    }

    return Struct.FieldsEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): com.google.protobuf.Value = this ?: Value.defaultInstance

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
            1 -> kind = Value.Kind.NullValue(_fieldValue as com.google.protobuf.NullValue)
            2 -> kind = Value.Kind.NumberValue(_fieldValue as Double)
            3 -> kind = Value.Kind.StringValue(_fieldValue as String)
            4 -> kind = Value.Kind.BoolValue(_fieldValue as Boolean)
            5 -> kind = Value.Kind.StructValue(_fieldValue as com.google.protobuf.Struct)
            6 -> kind = Value.Kind.ListValue(_fieldValue as com.google.protobuf.ListValue)
        }
    }

    return Value(kind, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForListValue")
public fun ListValue?.orDefault(): com.google.protobuf.ListValue = this ?: ListValue.defaultInstance

private fun ListValue.protoMergeImpl(plus: pbandk.Message?): ListValue = (plus as? ListValue)?.let {
    it.copy(
        values = values + plus.values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListValue {
    var values: pbandk.ListWithSize.Builder<com.google.protobuf.Value>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.Value> }
        }
    }

    return ListValue(pbandk.ListWithSize.Builder.fixed(values), unknownFields)
}

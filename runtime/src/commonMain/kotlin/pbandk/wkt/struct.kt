@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

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

public sealed interface Struct : pbandk.Message {
    public val fields: Map<String, pbandk.wkt.Value?>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct>

    public fun copy(
        fields: Map<String, pbandk.wkt.Value?> = this.fields,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Struct

    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        public operator fun invoke(
            fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Struct = Struct_Impl(
            fields = fields,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.Struct by lazy { pbandk.wkt.Struct() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct = pbandk.wkt.Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Struct, *>>(1)
            fieldsList.apply {
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
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Struct",
                messageClass = pbandk.wkt.Struct::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface FieldsEntry : pbandk.Message, Map.Entry<String, pbandk.wkt.Value?> {
        override public val key: String
        override public val value: pbandk.wkt.Value?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct.FieldsEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.wkt.Value? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.Struct.FieldsEntry

        public companion object : pbandk.Message.Companion<pbandk.wkt.Struct.FieldsEntry> {
            public operator fun invoke(
                key: String = "",
                value: pbandk.wkt.Value? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.wkt.Struct.FieldsEntry = Struct_FieldsEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            public val defaultInstance: pbandk.wkt.Struct.FieldsEntry by lazy { pbandk.wkt.Struct.FieldsEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct.FieldsEntry = pbandk.wkt.Struct.FieldsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Struct.FieldsEntry, *>>(2)
                fieldsList.apply {
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
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.Struct.FieldsEntry",
                    messageClass = pbandk.wkt.Struct.FieldsEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

public sealed interface Value : pbandk.Message {
    public val kind: Kind<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value>

    public fun copy(
        kind: pbandk.wkt.Value.Kind<*>? = this.kind,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Value

    public val nullValue: pbandk.wkt.NullValue?
    public val numberValue: Double?
    public val stringValue: String?
    public val boolValue: Boolean?
    public val structValue: pbandk.wkt.Struct?
    public val listValue: pbandk.wkt.ListValue?

    public sealed class Kind<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class NullValue(nullValue: pbandk.wkt.NullValue = pbandk.wkt.NullValue.fromValue(0)) : Kind<pbandk.wkt.NullValue>(nullValue)
        public class NumberValue(numberValue: Double = 0.0) : Kind<Double>(numberValue)
        public class StringValue(stringValue: String = "") : Kind<String>(stringValue)
        public class BoolValue(boolValue: Boolean = false) : Kind<Boolean>(boolValue)
        public class StructValue(structValue: pbandk.wkt.Struct) : Kind<pbandk.wkt.Struct>(structValue)
        public class ListValue(listValue: pbandk.wkt.ListValue) : Kind<pbandk.wkt.ListValue>(listValue)
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Value> {
        public operator fun invoke(
            kind: Kind<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Value = Value_Impl(
            kind = kind,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.Value by lazy { pbandk.wkt.Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Value = pbandk.wkt.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Value, *>>(6)
            fieldsList.apply {
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
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Value",
                messageClass = pbandk.wkt.Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface ListValue : pbandk.Message {
    public val values: List<pbandk.wkt.Value>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ListValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue>

    public fun copy(
        values: List<pbandk.wkt.Value> = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ListValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        public operator fun invoke(
            values: List<pbandk.wkt.Value> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.ListValue = ListValue_Impl(
            values = values,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.ListValue by lazy { pbandk.wkt.ListValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ListValue = pbandk.wkt.ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ListValue, *>>(1)
            fieldsList.apply {
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
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.ListValue",
                messageClass = pbandk.wkt.ListValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForStruct")
public fun Struct?.orDefault(): pbandk.wkt.Struct = this ?: Struct.defaultInstance

private class Struct_Impl(
    override val fields: Map<String, pbandk.wkt.Value?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Struct, pbandk.GeneratedMessage<Struct>() {
    override val descriptor get() = Struct.descriptor

    override fun copy(
        fields: Map<String, pbandk.wkt.Value?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Struct_Impl(
        fields = fields,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Struct)?.let {
        it.copy(
            fields = fields + other.fields,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

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

@pbandk.Export
@pbandk.JsName("orDefaultForStructFieldsEntry")
public fun Struct.FieldsEntry?.orDefault(): pbandk.wkt.Struct.FieldsEntry = this ?: Struct.FieldsEntry.defaultInstance

private class Struct_FieldsEntry_Impl(
    override val key: String,
    override val value: pbandk.wkt.Value?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Struct.FieldsEntry, pbandk.GeneratedMessage<Struct.FieldsEntry>() {
    override val descriptor get() = Struct.FieldsEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.wkt.Value?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Struct_FieldsEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Struct.FieldsEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

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

private class Value_Impl(
    override val kind: pbandk.wkt.Value.Kind<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Value, pbandk.GeneratedMessage<Value>() {
    override val descriptor get() = Value.descriptor

    override val nullValue: pbandk.wkt.NullValue?
        get() = (kind as? pbandk.wkt.Value.Kind.NullValue)?.value
    override val numberValue: Double?
        get() = (kind as? pbandk.wkt.Value.Kind.NumberValue)?.value
    override val stringValue: String?
        get() = (kind as? pbandk.wkt.Value.Kind.StringValue)?.value
    override val boolValue: Boolean?
        get() = (kind as? pbandk.wkt.Value.Kind.BoolValue)?.value
    override val structValue: pbandk.wkt.Struct?
        get() = (kind as? pbandk.wkt.Value.Kind.StructValue)?.value
    override val listValue: pbandk.wkt.ListValue?
        get() = (kind as? pbandk.wkt.Value.Kind.ListValue)?.value

    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Value_Impl(
        kind = kind,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Value)?.let {
        it.copy(
            kind = when {
                kind is Value.Kind.StructValue && other.kind is Value.Kind.StructValue ->
                    Value.Kind.StructValue(kind.value + (other.kind as Value.Kind.StructValue).value)
                kind is Value.Kind.ListValue && other.kind is Value.Kind.ListValue ->
                    Value.Kind.ListValue(kind.value + (other.kind as Value.Kind.ListValue).value)
                else ->
                    other.kind ?: kind
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

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

private class ListValue_Impl(
    override val values: List<pbandk.wkt.Value>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ListValue, pbandk.GeneratedMessage<ListValue>() {
    override val descriptor get() = ListValue.descriptor

    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ListValue_Impl(
        values = values,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ListValue)?.let {
        it.copy(
            values = values + other.values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

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

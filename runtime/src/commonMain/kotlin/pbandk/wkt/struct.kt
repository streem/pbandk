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
        public val values: List<NullValue> by lazy { listOf(NULL_VALUE) }
        override fun fromValue(value: Int): pbandk.wkt.NullValue = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.wkt.NullValue = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NullValue with name: $name")
    }
}

@pbandk.Export
public sealed interface Struct : pbandk.Message {
    public val fields: Map<String, pbandk.wkt.Value?>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableStruct(): pbandk.wkt.MutableStruct

    /**
     * The [MutableStruct] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit): pbandk.wkt.Struct

    @Deprecated("Use copy {} instead")
    public fun copy(
        fields: Map<String, pbandk.wkt.Value?> = this.fields,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Struct

    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        public val defaultInstance: pbandk.wkt.Struct by lazy { pbandk.wkt.Struct {} }
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
}

public sealed interface MutableStruct : pbandk.wkt.Struct, pbandk.MutableMessage {
    public override val fields: MutableMap<String, pbandk.wkt.Value?>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toStruct(): pbandk.wkt.Struct

    public override fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit): pbandk.wkt.MutableStruct

    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct = pbandk.wkt.Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> get() = pbandk.wkt.Struct.descriptor
    }
}

@pbandk.Export
public sealed interface Value : pbandk.Message {
    public val kind: Kind<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableValue(): pbandk.wkt.MutableValue

    /**
     * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit): pbandk.wkt.Value

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.wkt.Value by lazy { pbandk.wkt.Value {} }
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

public sealed interface MutableValue : pbandk.wkt.Value, pbandk.MutableMessage {
    public override var kind: Value.Kind<*>?

    public override var nullValue: pbandk.wkt.NullValue?
    public override var numberValue: Double?
    public override var stringValue: String?
    public override var boolValue: Boolean?
    public override var structValue: pbandk.wkt.Struct?
    public override var listValue: pbandk.wkt.ListValue?

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toValue(): pbandk.wkt.Value

    public override fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit): pbandk.wkt.MutableValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.Value> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Value = pbandk.wkt.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> get() = pbandk.wkt.Value.descriptor
    }
}

@pbandk.Export
public sealed interface ListValue : pbandk.Message {
    public val values: List<pbandk.wkt.Value>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ListValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableListValue(): pbandk.wkt.MutableListValue

    /**
     * The [MutableListValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit): pbandk.wkt.ListValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        values: List<pbandk.wkt.Value> = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ListValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        public val defaultInstance: pbandk.wkt.ListValue by lazy { pbandk.wkt.ListValue {} }
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

public sealed interface MutableListValue : pbandk.wkt.ListValue, pbandk.MutableMessage {
    public override val values: MutableList<pbandk.wkt.Value>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toListValue(): pbandk.wkt.ListValue

    public override fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit): pbandk.wkt.MutableListValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ListValue = pbandk.wkt.ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> get() = pbandk.wkt.ListValue.descriptor
    }
}

@Deprecated("Use Struct { } instead")
public fun Struct(
    fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Struct = pbandk.wkt.Struct {
    this.fields += fields
    this.unknownFields += unknownFields
}

public fun MutableStruct(): pbandk.wkt.MutableStruct = pbandk.wkt.MutableStruct_Impl(
    fields = pbandk.MutableMessageMap(pbandk.wkt.Struct.descriptor.fields[1]),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableStruct] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Struct(builderAction: pbandk.wkt.MutableStruct.() -> Unit): pbandk.wkt.Struct =
    pbandk.wkt.MutableStruct().also(builderAction).toStruct()

public fun MutableStruct(builderAction: pbandk.wkt.MutableStruct.() -> Unit): pbandk.wkt.MutableStruct =
    pbandk.wkt.MutableStruct().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForStruct")
public fun Struct?.orDefault(): pbandk.wkt.Struct = this ?: pbandk.wkt.Struct.defaultInstance

private class Struct_Impl(
    override val fields: pbandk.MessageMap<String, pbandk.wkt.Value?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Struct, pbandk.GeneratedMessage<pbandk.wkt.Struct>() {
    override val descriptor get() = pbandk.wkt.Struct.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit) =
        toMutableStruct().apply(builderAction).toStruct()

    @Deprecated("Use copy {} instead")
    override fun copy(
        fields: Map<String, pbandk.wkt.Value?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Struct {
        this.fields += fields
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableStruct() = pbandk.wkt.MutableStruct {
        this.fields += this@Struct_Impl.fields
        this.unknownFields += this@Struct_Impl.unknownFields
    }
}

private class MutableStruct_Impl(
    override val fields: pbandk.MutableMessageMap<String, pbandk.wkt.Value?>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableStruct, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableStruct>() {
    override val descriptor get() = pbandk.wkt.Struct.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit) =
        toMutableStruct().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        fields: Map<String, pbandk.wkt.Value?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Struct {
        this.fields += fields
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toStruct() = Struct_Impl(
        fields = fields.toMessageMap(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableStruct() = pbandk.wkt.MutableStruct {
        this.fields += this@MutableStruct_Impl.fields
        this.unknownFields += this@MutableStruct_Impl.unknownFields
    }
}

private fun Struct.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Struct {
    if (other !is pbandk.wkt.Struct) return this

    return copy {
        fields += other.fields
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Struct.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Struct {
    var fields: pbandk.MutableMessageMap<String, pbandk.wkt.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fields = (fields ?: pbandk.MutableMessageMap(descriptor.fields[1])).apply { putAll(_fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.wkt.Value?>>) }
        }
    }
    return Struct_Impl(pbandk.MessageMap.from(fields), unknownFields)
}

@Deprecated("Use Value { } instead")
public fun Value(
    kind: pbandk.wkt.Value.Kind<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Value = pbandk.wkt.Value {
    this.kind = kind
    this.unknownFields += unknownFields
}

public fun MutableValue(): pbandk.wkt.MutableValue = pbandk.wkt.MutableValue_Impl(
    kind = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Value(builderAction: pbandk.wkt.MutableValue.() -> Unit): pbandk.wkt.Value =
    pbandk.wkt.MutableValue().also(builderAction).toValue()

public fun MutableValue(builderAction: pbandk.wkt.MutableValue.() -> Unit): pbandk.wkt.MutableValue =
    pbandk.wkt.MutableValue().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): pbandk.wkt.Value = this ?: pbandk.wkt.Value.defaultInstance

private class Value_Impl(
    override val kind: pbandk.wkt.Value.Kind<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Value, pbandk.GeneratedMessage<pbandk.wkt.Value>() {
    override val descriptor get() = pbandk.wkt.Value.descriptor

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

    override fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit) =
        toMutableValue().apply(builderAction).toValue()

    @Deprecated("Use copy {} instead")
    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Value {
        this.kind = kind
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableValue() = pbandk.wkt.MutableValue {
        this.kind = this@Value_Impl.kind
        this.unknownFields += this@Value_Impl.unknownFields
    }
}

private class MutableValue_Impl(
    override var kind: pbandk.wkt.Value.Kind<*>?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableValue>() {
    override val descriptor get() = pbandk.wkt.Value.descriptor

    override var nullValue: pbandk.wkt.NullValue?
        get() = (kind as? pbandk.wkt.Value.Kind.NullValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.NullValue(it) } }
    override var numberValue: Double?
        get() = (kind as? pbandk.wkt.Value.Kind.NumberValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.NumberValue(it) } }
    override var stringValue: String?
        get() = (kind as? pbandk.wkt.Value.Kind.StringValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.StringValue(it) } }
    override var boolValue: Boolean?
        get() = (kind as? pbandk.wkt.Value.Kind.BoolValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.BoolValue(it) } }
    override var structValue: pbandk.wkt.Struct?
        get() = (kind as? pbandk.wkt.Value.Kind.StructValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.StructValue(it) } }
    override var listValue: pbandk.wkt.ListValue?
        get() = (kind as? pbandk.wkt.Value.Kind.ListValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.ListValue(it) } }

    override fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit) =
        toMutableValue().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Value {
        this.kind = kind
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toValue() = Value_Impl(
        kind = kind,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableValue() = pbandk.wkt.MutableValue {
        this.kind = this@MutableValue_Impl.kind
        this.unknownFields += this@MutableValue_Impl.unknownFields
    }
}

private fun Value.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Value {
    if (other !is pbandk.wkt.Value) return this

    return copy {
        when (other.kind) {
            is Value.Kind.NullValue -> nullValue = other.nullValue
            is Value.Kind.NumberValue -> numberValue = other.numberValue
            is Value.Kind.StringValue -> stringValue = other.stringValue
            is Value.Kind.BoolValue -> boolValue = other.boolValue
            is Value.Kind.StructValue -> structValue = structValue?.plus(other.structValue) ?: other.structValue
            is Value.Kind.ListValue -> listValue = listValue?.plus(other.listValue) ?: other.listValue
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Value {
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
    return Value_Impl(kind, unknownFields)
}

@Deprecated("Use ListValue { } instead")
public fun ListValue(
    values: List<pbandk.wkt.Value> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ListValue = pbandk.wkt.ListValue {
    this.values += values
    this.unknownFields += unknownFields
}

public fun MutableListValue(): pbandk.wkt.MutableListValue = pbandk.wkt.MutableListValue_Impl(
    values = mutableListOf(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableListValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun ListValue(builderAction: pbandk.wkt.MutableListValue.() -> Unit): pbandk.wkt.ListValue =
    pbandk.wkt.MutableListValue().also(builderAction).toListValue()

public fun MutableListValue(builderAction: pbandk.wkt.MutableListValue.() -> Unit): pbandk.wkt.MutableListValue =
    pbandk.wkt.MutableListValue().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForListValue")
public fun ListValue?.orDefault(): pbandk.wkt.ListValue = this ?: pbandk.wkt.ListValue.defaultInstance

private class ListValue_Impl(
    override val values: List<pbandk.wkt.Value>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ListValue, pbandk.GeneratedMessage<pbandk.wkt.ListValue>() {
    override val descriptor get() = pbandk.wkt.ListValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit) =
        toMutableListValue().apply(builderAction).toListValue()

    @Deprecated("Use copy {} instead")
    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.ListValue {
        this.values += values
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableListValue() = pbandk.wkt.MutableListValue {
        this.values += this@ListValue_Impl.values
        this.unknownFields += this@ListValue_Impl.unknownFields
    }
}

private class MutableListValue_Impl(
    override val values: MutableList<pbandk.wkt.Value>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableListValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableListValue>() {
    override val descriptor get() = pbandk.wkt.ListValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit) =
        toMutableListValue().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.ListValue {
        this.values += values
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toListValue() = ListValue_Impl(
        values = values.toList(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableListValue() = pbandk.wkt.MutableListValue {
        this.values += this@MutableListValue_Impl.values
        this.unknownFields += this@MutableListValue_Impl.unknownFields
    }
}

private fun ListValue.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.ListValue {
    if (other !is pbandk.wkt.ListValue) return this

    return copy {
        values += other.values
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun ListValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.ListValue {
    var values: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
        }
    }
    return ListValue_Impl(pbandk.ListWithSize.Builder.fixed(values), unknownFields)
}

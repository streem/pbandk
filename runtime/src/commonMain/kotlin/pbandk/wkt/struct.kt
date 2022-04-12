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

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableStruct(): MutableStruct

    /**
     * The [MutableStruct] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableStruct.() -> Unit): Struct

    @Deprecated("Use copy {} instead")
    public fun copy(
        fields: Map<String, pbandk.wkt.Value?> = this.fields,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Struct

    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        @Suppress("DEPRECATION")
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

    public sealed interface FieldsEntry : pbandk.Message, Map.Entry<String, pbandk.wkt.Value?> {
        public override val key: String
        public override val value: pbandk.wkt.Value?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct.FieldsEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry>

        /**
         * Returns a new mutable instance containing a copy of all values from this instance.
         */
        public fun toMutableFieldsEntry(): Struct.MutableFieldsEntry

        /**
         * The [MutableFieldsEntry] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: Struct.MutableFieldsEntry.() -> Unit): Struct.FieldsEntry

        @Deprecated("Use copy {} instead")
        public fun copy(
            key: String = this.key,
            value: pbandk.wkt.Value? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.Struct.FieldsEntry

        public companion object : pbandk.Message.Companion<pbandk.wkt.Struct.FieldsEntry> {
            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.wkt.Struct.FieldsEntry by lazy { pbandk.wkt.Struct.FieldsEntry {} }
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

    public sealed interface MutableFieldsEntry : Struct.FieldsEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.wkt.Value?

        /**
         * Returns a new immutable instance containing a copy of all values from this instance.
         */
        public fun toFieldsEntry(): Struct.FieldsEntry

        public override fun copy(builderAction: Struct.MutableFieldsEntry.() -> Unit): Struct.MutableFieldsEntry

        public companion object : pbandk.Message.Companion<pbandk.wkt.Struct.FieldsEntry> {
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct.FieldsEntry = pbandk.wkt.Struct.FieldsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry> get() = pbandk.wkt.Struct.FieldsEntry.descriptor
        }
    }
}

public sealed interface MutableStruct : Struct, pbandk.MutableMessage {
    public override var fields: Map<String, pbandk.wkt.Value?>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toStruct(): Struct

    public override fun copy(builderAction: MutableStruct.() -> Unit): MutableStruct

    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Struct = pbandk.wkt.Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> get() = pbandk.wkt.Struct.descriptor
    }
}

public sealed interface Value : pbandk.Message {
    public val kind: Kind<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableValue(): MutableValue

    /**
     * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableValue.() -> Unit): Value

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
        @Suppress("DEPRECATION")
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

public sealed interface MutableValue : Value, pbandk.MutableMessage {
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
    public fun toValue(): Value

    public override fun copy(builderAction: MutableValue.() -> Unit): MutableValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.Value> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Value = pbandk.wkt.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> get() = pbandk.wkt.Value.descriptor
    }
}

public sealed interface ListValue : pbandk.Message {
    public val values: List<pbandk.wkt.Value>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ListValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableListValue(): MutableListValue

    /**
     * The [MutableListValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableListValue.() -> Unit): ListValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        values: List<pbandk.wkt.Value> = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ListValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        @Suppress("DEPRECATION")
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

public sealed interface MutableListValue : ListValue, pbandk.MutableMessage {
    public override var values: List<pbandk.wkt.Value>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toListValue(): ListValue

    public override fun copy(builderAction: MutableListValue.() -> Unit): MutableListValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ListValue = pbandk.wkt.ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> get() = pbandk.wkt.ListValue.descriptor
    }
}

@Deprecated("Use Struct { } instead")
public fun Struct(
    fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Struct = Struct {
    this.fields = fields
    this.unknownFields.putAll(unknownFields)
}

public fun MutableStruct(): MutableStruct = MutableStruct_Impl(
    fields = emptyMap(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableStruct] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Struct(builderAction: MutableStruct.() -> Unit): Struct =
    MutableStruct().also(builderAction).toStruct()

public fun MutableStruct(builderAction: MutableStruct.() -> Unit): MutableStruct =
    MutableStruct().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForStruct")
public fun Struct?.orDefault(): pbandk.wkt.Struct = this ?: Struct.defaultInstance

private class Struct_Impl(
    override val fields: Map<String, pbandk.wkt.Value?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Struct, pbandk.GeneratedMessage<Struct>() {
    override val descriptor get() = Struct.descriptor

    override fun copy(builderAction: MutableStruct.() -> Unit) =
        toMutableStruct().apply(builderAction).toStruct()

    @Deprecated("Use copy {} instead")
    override fun copy(
        fields: Map<String, pbandk.wkt.Value?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.fields = fields
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? Struct)?.let {
        it.copy(
            fields = fields + other.fields,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableStruct() = MutableStruct_Impl(
        fields = fields,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableStruct_Impl(
    override var fields: Map<String, pbandk.wkt.Value?>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableStruct, pbandk.MutableGeneratedMessage<MutableStruct>() {
    override val descriptor get() = Struct.descriptor

    override fun copy(builderAction: MutableStruct.() -> Unit) =
        toMutableStruct().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        fields: Map<String, pbandk.wkt.Value?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.fields = fields
        this.unknownFields.putAll(unknownFields)
    }.toStruct()

    override operator fun plus(other: pbandk.Message?) = (other as? Struct)?.let {
        it.copy(
            fields = fields + other.fields,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toStruct() = Struct_Impl(
        fields = fields,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableStruct() = MutableStruct_Impl(
        fields = fields,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun Struct.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct {
    var fields: pbandk.MessageMap.Builder<String, pbandk.wkt.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fields = (fields ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.wkt.Value?>> }
        }
    }
    return Struct_Impl(pbandk.MessageMap.Builder.fixed(fields), unknownFields)
}

@Deprecated("Use Struct.FieldsEntry { } instead")
public fun Struct.Companion.FieldsEntry(
    key: String = "",
    value: pbandk.wkt.Value? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Struct.FieldsEntry = Struct.Companion.FieldsEntry {
    this.key = key
    this.value = value
    this.unknownFields.putAll(unknownFields)
}

public fun Struct.Companion.MutableFieldsEntry(): Struct.MutableFieldsEntry = Struct_MutableFieldsEntry_Impl(
    key = "",
    value = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableFieldsEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Struct.Companion.FieldsEntry(builderAction: Struct.MutableFieldsEntry.() -> Unit): Struct.FieldsEntry =
    Struct.Companion.MutableFieldsEntry().also(builderAction).toFieldsEntry()

public fun Struct.Companion.MutableFieldsEntry(builderAction: Struct.MutableFieldsEntry.() -> Unit): Struct.MutableFieldsEntry =
    Struct.Companion.MutableFieldsEntry().also(builderAction)

/**
 * The [MutableFieldsEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableStruct.FieldsEntry(builderAction: Struct.MutableFieldsEntry.() -> Unit): Struct.FieldsEntry =
    Struct.FieldsEntry(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForStructFieldsEntry")
public fun Struct.FieldsEntry?.orDefault(): pbandk.wkt.Struct.FieldsEntry = this ?: Struct.FieldsEntry.defaultInstance

private class Struct_FieldsEntry_Impl(
    override val key: String,
    override val value: pbandk.wkt.Value?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Struct.FieldsEntry, pbandk.GeneratedMessage<Struct.FieldsEntry>() {
    override val descriptor get() = Struct.FieldsEntry.descriptor

    override fun copy(builderAction: Struct.MutableFieldsEntry.() -> Unit) =
        toMutableFieldsEntry().apply(builderAction).toFieldsEntry()

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: pbandk.wkt.Value?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? Struct.FieldsEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableFieldsEntry() = Struct_MutableFieldsEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class Struct_MutableFieldsEntry_Impl(
    override var key: String,
    override var value: pbandk.wkt.Value?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : Struct.MutableFieldsEntry, pbandk.MutableGeneratedMessage<Struct.MutableFieldsEntry>() {
    override val descriptor get() = Struct.FieldsEntry.descriptor

    override fun copy(builderAction: Struct.MutableFieldsEntry.() -> Unit) =
        toMutableFieldsEntry().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: pbandk.wkt.Value?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields.putAll(unknownFields)
    }.toFieldsEntry()

    override operator fun plus(other: pbandk.Message?) = (other as? Struct.FieldsEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFieldsEntry() = Struct_FieldsEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableFieldsEntry() = Struct_MutableFieldsEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
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
    return Struct_FieldsEntry_Impl(key, value, unknownFields)
}

@Deprecated("Use Value { } instead")
public fun Value(
    kind: pbandk.wkt.Value.Kind<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Value = Value {
    this.kind = kind
    this.unknownFields.putAll(unknownFields)
}

public fun MutableValue(): MutableValue = MutableValue_Impl(
    kind = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Value(builderAction: MutableValue.() -> Unit): Value =
    MutableValue().also(builderAction).toValue()

public fun MutableValue(builderAction: MutableValue.() -> Unit): MutableValue =
    MutableValue().also(builderAction)

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

    override fun copy(builderAction: MutableValue.() -> Unit) =
        toMutableValue().apply(builderAction).toValue()

    @Deprecated("Use copy {} instead")
    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.kind = kind
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? Value)?.let {
        it.copy(
            kind = when {
                kind is Value.Kind.StructValue && other.kind is Value.Kind.StructValue ->
                    Value.Kind.StructValue((kind as Value.Kind.StructValue).value + (other.kind as Value.Kind.StructValue).value)
                kind is Value.Kind.ListValue && other.kind is Value.Kind.ListValue ->
                    Value.Kind.ListValue((kind as Value.Kind.ListValue).value + (other.kind as Value.Kind.ListValue).value)
                else ->
                    other.kind ?: kind
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableValue() = MutableValue_Impl(
        kind = kind,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableValue_Impl(
    override var kind: pbandk.wkt.Value.Kind<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableValue, pbandk.MutableGeneratedMessage<MutableValue>() {
    override val descriptor get() = Value.descriptor

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

    override fun copy(builderAction: MutableValue.() -> Unit) =
        toMutableValue().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.kind = kind
        this.unknownFields.putAll(unknownFields)
    }.toValue()

    override operator fun plus(other: pbandk.Message?) = (other as? Value)?.let {
        it.copy(
            kind = when {
                kind is Value.Kind.StructValue && other.kind is Value.Kind.StructValue ->
                    Value.Kind.StructValue((kind as Value.Kind.StructValue).value + (other.kind as Value.Kind.StructValue).value)
                kind is Value.Kind.ListValue && other.kind is Value.Kind.ListValue ->
                    Value.Kind.ListValue((kind as Value.Kind.ListValue).value + (other.kind as Value.Kind.ListValue).value)
                else ->
                    other.kind ?: kind
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toValue() = Value_Impl(
        kind = kind,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableValue() = MutableValue_Impl(
        kind = kind,
        unknownFields = unknownFields.toMutableMap()
    )
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
    return Value_Impl(kind, unknownFields)
}

@Deprecated("Use ListValue { } instead")
public fun ListValue(
    values: List<pbandk.wkt.Value> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ListValue = ListValue {
    this.values = values
    this.unknownFields.putAll(unknownFields)
}

public fun MutableListValue(): MutableListValue = MutableListValue_Impl(
    values = emptyList(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableListValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun ListValue(builderAction: MutableListValue.() -> Unit): ListValue =
    MutableListValue().also(builderAction).toListValue()

public fun MutableListValue(builderAction: MutableListValue.() -> Unit): MutableListValue =
    MutableListValue().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForListValue")
public fun ListValue?.orDefault(): pbandk.wkt.ListValue = this ?: ListValue.defaultInstance

private class ListValue_Impl(
    override val values: List<pbandk.wkt.Value>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ListValue, pbandk.GeneratedMessage<ListValue>() {
    override val descriptor get() = ListValue.descriptor

    override fun copy(builderAction: MutableListValue.() -> Unit) =
        toMutableListValue().apply(builderAction).toListValue()

    @Deprecated("Use copy {} instead")
    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.values = values
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? ListValue)?.let {
        it.copy(
            values = values + other.values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableListValue() = MutableListValue_Impl(
        values = values,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableListValue_Impl(
    override var values: List<pbandk.wkt.Value>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableListValue, pbandk.MutableGeneratedMessage<MutableListValue>() {
    override val descriptor get() = ListValue.descriptor

    override fun copy(builderAction: MutableListValue.() -> Unit) =
        toMutableListValue().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.values = values
        this.unknownFields.putAll(unknownFields)
    }.toListValue()

    override operator fun plus(other: pbandk.Message?) = (other as? ListValue)?.let {
        it.copy(
            values = values + other.values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toListValue() = ListValue_Impl(
        values = values,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableListValue() = MutableListValue_Impl(
        values = values,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun ListValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListValue {
    var values: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
        }
    }
    return ListValue_Impl(pbandk.ListWithSize.Builder.fixed(values), unknownFields)
}

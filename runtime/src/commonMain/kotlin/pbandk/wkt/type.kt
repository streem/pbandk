@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed class Syntax(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is Syntax && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "Syntax.${name ?: "UNRECOGNIZED"}(value=$value)"

    object PROTO2 : Syntax(0, "SYNTAX_PROTO2")
    object PROTO3 : Syntax(1, "SYNTAX_PROTO3")
    class UNRECOGNIZED(value: Int) : Syntax(value)

    companion object : pbandk.Message.Enum.Companion<Syntax> {
        val values: List<Syntax> by lazy { listOf(PROTO2, PROTO3) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Syntax with name: $name")
    }
}

data class Type(
    val name: String = "",
    val fields: List<pbandk.wkt.Field> = emptyList(),
    val oneofs: List<String> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Type> {
        val defaultInstance by lazy { Type() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Type.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Type> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Type::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = Type::name
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "fields",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Field>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Field.Companion)),
                        jsonName = "fields",
                        value = Type::fields
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneofs",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "oneofs",
                        value = Type::oneofs
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "options",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = Type::options
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "source_context",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = Type::sourceContext
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "syntax",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = Type::syntax
                    )
                )
            )
        }
    }
}

data class Field(
    val kind: pbandk.wkt.Field.Kind = pbandk.wkt.Field.Kind.fromValue(0),
    val cardinality: pbandk.wkt.Field.Cardinality = pbandk.wkt.Field.Cardinality.fromValue(0),
    val number: Int = 0,
    val name: String = "",
    val typeUrl: String = "",
    val oneofIndex: Int = 0,
    val packed: Boolean = false,
    val options: List<pbandk.wkt.Option> = emptyList(),
    val jsonName: String = "",
    val defaultValue: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Field> {
        val defaultInstance by lazy { Field() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Field.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Field> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Field::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "kind",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Field.Kind.Companion),
                        jsonName = "kind",
                        value = Field::kind
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "cardinality",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Field.Cardinality.Companion),
                        jsonName = "cardinality",
                        value = Field::cardinality
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "number",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "number",
                        value = Field::number
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "name",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = Field::name
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "type_url",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "typeUrl",
                        value = Field::typeUrl
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_index",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "oneofIndex",
                        value = Field::oneofIndex
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "packed",
                        value = Field::packed
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "options",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = Field::options
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "json_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "jsonName",
                        value = Field::jsonName
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_value",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "defaultValue",
                        value = Field::defaultValue
                    )
                )
            )
        }
    }

    sealed class Kind(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Field.Kind && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Field.Kind.${name ?: "UNRECOGNIZED"}(value=$value)"

        object TYPE_UNKNOWN : Kind(0, "TYPE_UNKNOWN")
        object TYPE_DOUBLE : Kind(1, "TYPE_DOUBLE")
        object TYPE_FLOAT : Kind(2, "TYPE_FLOAT")
        object TYPE_INT64 : Kind(3, "TYPE_INT64")
        object TYPE_UINT64 : Kind(4, "TYPE_UINT64")
        object TYPE_INT32 : Kind(5, "TYPE_INT32")
        object TYPE_FIXED64 : Kind(6, "TYPE_FIXED64")
        object TYPE_FIXED32 : Kind(7, "TYPE_FIXED32")
        object TYPE_BOOL : Kind(8, "TYPE_BOOL")
        object TYPE_STRING : Kind(9, "TYPE_STRING")
        object TYPE_GROUP : Kind(10, "TYPE_GROUP")
        object TYPE_MESSAGE : Kind(11, "TYPE_MESSAGE")
        object TYPE_BYTES : Kind(12, "TYPE_BYTES")
        object TYPE_UINT32 : Kind(13, "TYPE_UINT32")
        object TYPE_ENUM : Kind(14, "TYPE_ENUM")
        object TYPE_SFIXED32 : Kind(15, "TYPE_SFIXED32")
        object TYPE_SFIXED64 : Kind(16, "TYPE_SFIXED64")
        object TYPE_SINT32 : Kind(17, "TYPE_SINT32")
        object TYPE_SINT64 : Kind(18, "TYPE_SINT64")
        class UNRECOGNIZED(value: Int) : Field.Kind(value)

        companion object : pbandk.Message.Enum.Companion<Field.Kind> {
            val values: List<Field.Kind> by lazy { listOf(TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Kind with name: $name")
        }
    }

    sealed class Cardinality(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Field.Cardinality && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Field.Cardinality.${name ?: "UNRECOGNIZED"}(value=$value)"

        object UNKNOWN : Cardinality(0, "CARDINALITY_UNKNOWN")
        object OPTIONAL : Cardinality(1, "CARDINALITY_OPTIONAL")
        object REQUIRED : Cardinality(2, "CARDINALITY_REQUIRED")
        object REPEATED : Cardinality(3, "CARDINALITY_REPEATED")
        class UNRECOGNIZED(value: Int) : Field.Cardinality(value)

        companion object : pbandk.Message.Enum.Companion<Field.Cardinality> {
            val values: List<Field.Cardinality> by lazy { listOf(UNKNOWN, OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Cardinality with name: $name")
        }
    }
}

data class Enum(
    val name: String = "",
    val enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Enum> {
        val defaultInstance by lazy { Enum() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Enum.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Enum> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Enum::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = Enum::name
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "enumvalue",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumValue>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumValue.Companion)),
                        jsonName = "enumvalue",
                        value = Enum::enumvalue
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = Enum::options
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "source_context",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = Enum::sourceContext
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "syntax",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = Enum::syntax
                    )
                )
            )
        }
    }
}

data class EnumValue(
    val name: String = "",
    val number: Int = 0,
    val options: List<pbandk.wkt.Option> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<EnumValue> {
        val defaultInstance by lazy { EnumValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = EnumValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<EnumValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = EnumValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = EnumValue::name
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "number",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "number",
                        value = EnumValue::number
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = EnumValue::options
                    )
                )
            )
        }
    }
}

data class Option(
    val name: String = "",
    val value: pbandk.wkt.Any? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Option> {
        val defaultInstance by lazy { Option() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Option.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Option> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Option::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = Option::name
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion),
                        jsonName = "value",
                        value = Option::value
                    )
                )
            )
        }
    }
}

fun Type?.orDefault() = this ?: Type.defaultInstance

private fun Type.protoMergeImpl(plus: pbandk.Message?): Type = (plus as? Type)?.copy(
    fields = fields + plus.fields,
    oneofs = oneofs + plus.oneofs,
    options = options + plus.options,
    sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Type.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Type {
    var name = ""
    var fields: pbandk.ListWithSize.Builder<pbandk.wkt.Field>? = null
    var oneofs: pbandk.ListWithSize.Builder<String>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var sourceContext: pbandk.wkt.SourceContext? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> fields = (fields ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Field> }
            3 -> oneofs = (oneofs ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            4 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            5 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            6 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }
    return Type(name, pbandk.ListWithSize.Builder.fixed(fields), pbandk.ListWithSize.Builder.fixed(oneofs), pbandk.ListWithSize.Builder.fixed(options),
        sourceContext, syntax, unknownFields)
}

fun Field?.orDefault() = this ?: Field.defaultInstance

private fun Field.protoMergeImpl(plus: pbandk.Message?): Field = (plus as? Field)?.copy(
    options = options + plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Field.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Field {
    var kind: pbandk.wkt.Field.Kind = pbandk.wkt.Field.Kind.fromValue(0)
    var cardinality: pbandk.wkt.Field.Cardinality = pbandk.wkt.Field.Cardinality.fromValue(0)
    var number = 0
    var name = ""
    var typeUrl = ""
    var oneofIndex = 0
    var packed = false
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var jsonName = ""
    var defaultValue = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> kind = _fieldValue as pbandk.wkt.Field.Kind
            2 -> cardinality = _fieldValue as pbandk.wkt.Field.Cardinality
            3 -> number = _fieldValue as Int
            4 -> name = _fieldValue as String
            6 -> typeUrl = _fieldValue as String
            7 -> oneofIndex = _fieldValue as Int
            8 -> packed = _fieldValue as Boolean
            9 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            10 -> jsonName = _fieldValue as String
            11 -> defaultValue = _fieldValue as String
        }
    }
    return Field(kind, cardinality, number, name,
        typeUrl, oneofIndex, packed, pbandk.ListWithSize.Builder.fixed(options),
        jsonName, defaultValue, unknownFields)
}

fun Enum?.orDefault() = this ?: Enum.defaultInstance

private fun Enum.protoMergeImpl(plus: pbandk.Message?): Enum = (plus as? Enum)?.copy(
    enumvalue = enumvalue + plus.enumvalue,
    options = options + plus.options,
    sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Enum.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Enum {
    var name = ""
    var enumvalue: pbandk.ListWithSize.Builder<pbandk.wkt.EnumValue>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var sourceContext: pbandk.wkt.SourceContext? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> enumvalue = (enumvalue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.EnumValue> }
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            4 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            5 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }
    return Enum(name, pbandk.ListWithSize.Builder.fixed(enumvalue), pbandk.ListWithSize.Builder.fixed(options), sourceContext,
        syntax, unknownFields)
}

fun EnumValue?.orDefault() = this ?: EnumValue.defaultInstance

private fun EnumValue.protoMergeImpl(plus: pbandk.Message?): EnumValue = (plus as? EnumValue)?.copy(
    options = options + plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValue {
    var name = ""
    var number = 0
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> number = _fieldValue as Int
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
        }
    }
    return EnumValue(name, number, pbandk.ListWithSize.Builder.fixed(options), unknownFields)
}

fun Option?.orDefault() = this ?: Option.defaultInstance

private fun Option.protoMergeImpl(plus: pbandk.Message?): Option = (plus as? Option)?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Option.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Option {
    var name = ""
    var value: pbandk.wkt.Any? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> value = _fieldValue as pbandk.wkt.Any
        }
    }
    return Option(name, value, unknownFields)
}

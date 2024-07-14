@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed class Syntax(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.Syntax && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "Syntax.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object PROTO2 : Syntax(0, "SYNTAX_PROTO2")
    public object PROTO3 : Syntax(1, "SYNTAX_PROTO3")
    public class UNRECOGNIZED(value: Int) : Syntax(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Syntax> {
        public val values: List<pbandk.wkt.Syntax> by lazy { listOf(PROTO2, PROTO3) }
        override fun fromValue(value: Int): pbandk.wkt.Syntax = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.wkt.Syntax = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Syntax with name: $name")
    }
}

@pbandk.Export
public data class Type(
    val name: String = "",
    val fields: List<pbandk.wkt.Field> = emptyList(),
    val oneofs: List<String> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Type = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Type> {
        public val defaultInstance: pbandk.wkt.Type by lazy { pbandk.wkt.Type() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Type = pbandk.wkt.Type.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Type, *>>(6)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Type::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fields",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Field>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Field.Companion)),
                        jsonName = "fields",
                        value = pbandk.wkt.Type::fields
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneofs",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "oneofs",
                        value = pbandk.wkt.Type::oneofs
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Type::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_context",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = pbandk.wkt.Type::sourceContext
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Type::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Type",
                messageClass = pbandk.wkt.Type::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Field(
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
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Field = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Field> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Field> {
        public val defaultInstance: pbandk.wkt.Field by lazy { pbandk.wkt.Field() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Field = pbandk.wkt.Field.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Field> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Field, *>>(10)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "kind",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Field.Kind.Companion),
                        jsonName = "kind",
                        value = pbandk.wkt.Field::kind
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cardinality",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Field.Cardinality.Companion),
                        jsonName = "cardinality",
                        value = pbandk.wkt.Field::cardinality
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "number",
                        value = pbandk.wkt.Field::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Field::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_url",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "typeUrl",
                        value = pbandk.wkt.Field::typeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_index",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "oneofIndex",
                        value = pbandk.wkt.Field::oneofIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "packed",
                        value = pbandk.wkt.Field::packed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Field::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "jsonName",
                        value = pbandk.wkt.Field::jsonName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "default_value",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "defaultValue",
                        value = pbandk.wkt.Field::defaultValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Field",
                messageClass = pbandk.wkt.Field::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class Kind(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.Field.Kind && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "Field.Kind.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object TYPE_UNKNOWN : Kind(0, "TYPE_UNKNOWN")
        public object TYPE_DOUBLE : Kind(1, "TYPE_DOUBLE")
        public object TYPE_FLOAT : Kind(2, "TYPE_FLOAT")
        public object TYPE_INT64 : Kind(3, "TYPE_INT64")
        public object TYPE_UINT64 : Kind(4, "TYPE_UINT64")
        public object TYPE_INT32 : Kind(5, "TYPE_INT32")
        public object TYPE_FIXED64 : Kind(6, "TYPE_FIXED64")
        public object TYPE_FIXED32 : Kind(7, "TYPE_FIXED32")
        public object TYPE_BOOL : Kind(8, "TYPE_BOOL")
        public object TYPE_STRING : Kind(9, "TYPE_STRING")
        public object TYPE_GROUP : Kind(10, "TYPE_GROUP")
        public object TYPE_MESSAGE : Kind(11, "TYPE_MESSAGE")
        public object TYPE_BYTES : Kind(12, "TYPE_BYTES")
        public object TYPE_UINT32 : Kind(13, "TYPE_UINT32")
        public object TYPE_ENUM : Kind(14, "TYPE_ENUM")
        public object TYPE_SFIXED32 : Kind(15, "TYPE_SFIXED32")
        public object TYPE_SFIXED64 : Kind(16, "TYPE_SFIXED64")
        public object TYPE_SINT32 : Kind(17, "TYPE_SINT32")
        public object TYPE_SINT64 : Kind(18, "TYPE_SINT64")
        public class UNRECOGNIZED(value: Int) : Kind(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Field.Kind> {
            public val values: List<pbandk.wkt.Field.Kind> by lazy { listOf(TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64) }
            override fun fromValue(value: Int): pbandk.wkt.Field.Kind = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.Field.Kind = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Kind with name: $name")
        }
    }

    public sealed class Cardinality(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.Field.Cardinality && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "Field.Cardinality.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : Cardinality(0, "CARDINALITY_UNKNOWN")
        public object OPTIONAL : Cardinality(1, "CARDINALITY_OPTIONAL")
        public object REQUIRED : Cardinality(2, "CARDINALITY_REQUIRED")
        public object REPEATED : Cardinality(3, "CARDINALITY_REPEATED")
        public class UNRECOGNIZED(value: Int) : Cardinality(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Field.Cardinality> {
            public val values: List<pbandk.wkt.Field.Cardinality> by lazy { listOf(UNKNOWN, OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int): pbandk.wkt.Field.Cardinality = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.Field.Cardinality = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Cardinality with name: $name")
        }
    }
}

@pbandk.Export
public data class Enum(
    val name: String = "",
    val enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Enum = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Enum> {
        public val defaultInstance: pbandk.wkt.Enum by lazy { pbandk.wkt.Enum() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Enum = pbandk.wkt.Enum.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Enum, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Enum::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enumvalue",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumValue>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumValue.Companion)),
                        jsonName = "enumvalue",
                        value = pbandk.wkt.Enum::enumvalue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Enum::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_context",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = pbandk.wkt.Enum::sourceContext
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Enum::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Enum",
                messageClass = pbandk.wkt.Enum::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EnumValue(
    val name: String = "",
    val number: Int = 0,
    val options: List<pbandk.wkt.Option> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValue> {
        public val defaultInstance: pbandk.wkt.EnumValue by lazy { pbandk.wkt.EnumValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValue = pbandk.wkt.EnumValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumValue, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.EnumValue::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "number",
                        value = pbandk.wkt.EnumValue::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.EnumValue::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.EnumValue",
                messageClass = pbandk.wkt.EnumValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Option(
    val name: String = "",
    val value: pbandk.wkt.Any? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Option = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Option> {
        public val defaultInstance: pbandk.wkt.Option by lazy { pbandk.wkt.Option() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Option = pbandk.wkt.Option.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Option, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Option::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion),
                        jsonName = "value",
                        value = pbandk.wkt.Option::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Option",
                messageClass = pbandk.wkt.Option::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForType")
public fun Type?.orDefault(): pbandk.wkt.Type = this ?: Type.defaultInstance

private fun Type.protoMergeImpl(plus: pbandk.Message?): Type = (plus as? Type)?.let {
    it.copy(
        fields = fields + plus.fields,
        oneofs = oneofs + plus.oneofs,
        options = options + plus.options,
        sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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
            2 -> fields = (fields ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Field> }
            3 -> oneofs = (oneofs ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            4 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Option> }
            5 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            6 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }

    return Type(name, pbandk.ListWithSize.Builder.fixed(fields), pbandk.ListWithSize.Builder.fixed(oneofs), pbandk.ListWithSize.Builder.fixed(options),
        sourceContext, syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForField")
public fun Field?.orDefault(): pbandk.wkt.Field = this ?: Field.defaultInstance

private fun Field.protoMergeImpl(plus: pbandk.Message?): Field = (plus as? Field)?.let {
    it.copy(
        options = options + plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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
            9 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Option> }
            10 -> jsonName = _fieldValue as String
            11 -> defaultValue = _fieldValue as String
        }
    }

    return Field(kind, cardinality, number, name,
        typeUrl, oneofIndex, packed, pbandk.ListWithSize.Builder.fixed(options),
        jsonName, defaultValue, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnum")
public fun Enum?.orDefault(): pbandk.wkt.Enum = this ?: Enum.defaultInstance

private fun Enum.protoMergeImpl(plus: pbandk.Message?): Enum = (plus as? Enum)?.let {
    it.copy(
        enumvalue = enumvalue + plus.enumvalue,
        options = options + plus.options,
        sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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
            2 -> enumvalue = (enumvalue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.EnumValue> }
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Option> }
            4 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            5 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }

    return Enum(name, pbandk.ListWithSize.Builder.fixed(enumvalue), pbandk.ListWithSize.Builder.fixed(options), sourceContext,
        syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValue")
public fun EnumValue?.orDefault(): pbandk.wkt.EnumValue = this ?: EnumValue.defaultInstance

private fun EnumValue.protoMergeImpl(plus: pbandk.Message?): EnumValue = (plus as? EnumValue)?.let {
    it.copy(
        options = options + plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValue {
    var name = ""
    var number = 0
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> number = _fieldValue as Int
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<pbandk.wkt.Option> }
        }
    }

    return EnumValue(name, number, pbandk.ListWithSize.Builder.fixed(options), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForOption")
public fun Option?.orDefault(): pbandk.wkt.Option = this ?: Option.defaultInstance

private fun Option.protoMergeImpl(plus: pbandk.Message?): Option = (plus as? Option)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

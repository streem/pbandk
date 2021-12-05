@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed class Syntax(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is Syntax && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "Syntax.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object PROTO2 : Syntax(0, "SYNTAX_PROTO2")
    public object PROTO3 : Syntax(1, "SYNTAX_PROTO3")
    public class UNRECOGNIZED(value: Int) : Syntax(value)

    public companion object : pbandk.Message.Enum.Companion<Syntax> {
        public val values: List<Syntax> by lazy { listOf(PROTO2, PROTO3) }
        override fun fromValue(value: Int): Syntax = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): Syntax = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Syntax with name: $name")
    }
}

public sealed interface Type : pbandk.Message {
    public val name: String
    public val fields: List<pbandk.wkt.Field>
    public val oneofs: List<String>
    public val options: List<pbandk.wkt.Option>
    public val sourceContext: pbandk.wkt.SourceContext?
    public val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Type
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type>

    public fun copy(
        name: String = this.name,
        fields: List<pbandk.wkt.Field> = this.fields,
        oneofs: List<String> = this.oneofs,
        options: List<pbandk.wkt.Option> = this.options,
        sourceContext: pbandk.wkt.SourceContext? = this.sourceContext,
        syntax: pbandk.wkt.Syntax = this.syntax,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Type

    public companion object : pbandk.Message.Companion<pbandk.wkt.Type> {
        @Deprecated("Use type { } instead")
        public operator fun invoke(
            name: String = "",
            fields: List<pbandk.wkt.Field> = emptyList(),
            oneofs: List<String> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            sourceContext: pbandk.wkt.SourceContext? = null,
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Type = Type_Impl(
            name = name,
            fields = fields,
            oneofs = oneofs,
            options = options,
            sourceContext = sourceContext,
            syntax = syntax,
            unknownFields = unknownFields
        )

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

public sealed interface MutableType : Type, pbandk.MutableMessage {
    public override var name: String
    public override var fields: List<pbandk.wkt.Field>
    public override var oneofs: List<String>
    public override var options: List<pbandk.wkt.Option>
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var syntax: pbandk.wkt.Syntax

    public fun toType(): Type

    public companion object : pbandk.Message.Companion<pbandk.wkt.Type> {
        @Deprecated("Use type { } instead")
        public operator fun invoke(
            name: String = "",
            fields: List<pbandk.wkt.Field> = emptyList(),
            oneofs: List<String> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            sourceContext: pbandk.wkt.SourceContext? = null,
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableType = MutableType_Impl(
            name = name,
            fields = fields,
            oneofs = oneofs,
            options = options,
            sourceContext = sourceContext,
            syntax = syntax,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableType by lazy { MutableType() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Type = pbandk.wkt.Type.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type> get() = pbandk.wkt.Type.descriptor
    }
}

public sealed interface Field : pbandk.Message {
    public val kind: pbandk.wkt.Field.Kind
    public val cardinality: pbandk.wkt.Field.Cardinality
    public val number: Int
    public val name: String
    public val typeUrl: String
    public val oneofIndex: Int
    public val packed: Boolean
    public val options: List<pbandk.wkt.Option>
    public val jsonName: String
    public val defaultValue: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Field
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Field>

    public fun copy(
        kind: pbandk.wkt.Field.Kind = this.kind,
        cardinality: pbandk.wkt.Field.Cardinality = this.cardinality,
        number: Int = this.number,
        name: String = this.name,
        typeUrl: String = this.typeUrl,
        oneofIndex: Int = this.oneofIndex,
        packed: Boolean = this.packed,
        options: List<pbandk.wkt.Option> = this.options,
        jsonName: String = this.jsonName,
        defaultValue: String = this.defaultValue,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Field

    public companion object : pbandk.Message.Companion<pbandk.wkt.Field> {
        @Deprecated("Use field { } instead")
        public operator fun invoke(
            kind: pbandk.wkt.Field.Kind = pbandk.wkt.Field.Kind.fromValue(0),
            cardinality: pbandk.wkt.Field.Cardinality = pbandk.wkt.Field.Cardinality.fromValue(0),
            number: Int = 0,
            name: String = "",
            typeUrl: String = "",
            oneofIndex: Int = 0,
            packed: Boolean = false,
            options: List<pbandk.wkt.Option> = emptyList(),
            jsonName: String = "",
            defaultValue: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Field = Field_Impl(
            kind = kind,
            cardinality = cardinality,
            number = number,
            name = name,
            typeUrl = typeUrl,
            oneofIndex = oneofIndex,
            packed = packed,
            options = options,
            jsonName = jsonName,
            defaultValue = defaultValue,
            unknownFields = unknownFields
        )

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
        override fun equals(other: kotlin.Any?): Boolean = other is Field.Kind && other.value == value
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

        public companion object : pbandk.Message.Enum.Companion<Field.Kind> {
            public val values: List<Field.Kind> by lazy { listOf(TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64) }
            override fun fromValue(value: Int): Field.Kind = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): Field.Kind = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Kind with name: $name")
        }
    }

    public sealed class Cardinality(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is Field.Cardinality && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "Field.Cardinality.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UNKNOWN : Cardinality(0, "CARDINALITY_UNKNOWN")
        public object OPTIONAL : Cardinality(1, "CARDINALITY_OPTIONAL")
        public object REQUIRED : Cardinality(2, "CARDINALITY_REQUIRED")
        public object REPEATED : Cardinality(3, "CARDINALITY_REPEATED")
        public class UNRECOGNIZED(value: Int) : Cardinality(value)

        public companion object : pbandk.Message.Enum.Companion<Field.Cardinality> {
            public val values: List<Field.Cardinality> by lazy { listOf(UNKNOWN, OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int): Field.Cardinality = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): Field.Cardinality = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Cardinality with name: $name")
        }
    }
}

public sealed interface MutableField : Field, pbandk.MutableMessage {
    public override var kind: pbandk.wkt.Field.Kind
    public override var cardinality: pbandk.wkt.Field.Cardinality
    public override var number: Int
    public override var name: String
    public override var typeUrl: String
    public override var oneofIndex: Int
    public override var packed: Boolean
    public override var options: List<pbandk.wkt.Option>
    public override var jsonName: String
    public override var defaultValue: String

    public fun toField(): Field

    public companion object : pbandk.Message.Companion<pbandk.wkt.Field> {
        @Deprecated("Use field { } instead")
        public operator fun invoke(
            kind: pbandk.wkt.Field.Kind = pbandk.wkt.Field.Kind.fromValue(0),
            cardinality: pbandk.wkt.Field.Cardinality = pbandk.wkt.Field.Cardinality.fromValue(0),
            number: Int = 0,
            name: String = "",
            typeUrl: String = "",
            oneofIndex: Int = 0,
            packed: Boolean = false,
            options: List<pbandk.wkt.Option> = emptyList(),
            jsonName: String = "",
            defaultValue: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableField = MutableField_Impl(
            kind = kind,
            cardinality = cardinality,
            number = number,
            name = name,
            typeUrl = typeUrl,
            oneofIndex = oneofIndex,
            packed = packed,
            options = options,
            jsonName = jsonName,
            defaultValue = defaultValue,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableField by lazy { MutableField() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Field = pbandk.wkt.Field.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Field> get() = pbandk.wkt.Field.descriptor
    }
}

public sealed interface Enum : pbandk.Message {
    public val name: String
    public val enumvalue: List<pbandk.wkt.EnumValue>
    public val options: List<pbandk.wkt.Option>
    public val sourceContext: pbandk.wkt.SourceContext?
    public val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Enum
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum>

    public fun copy(
        name: String = this.name,
        enumvalue: List<pbandk.wkt.EnumValue> = this.enumvalue,
        options: List<pbandk.wkt.Option> = this.options,
        sourceContext: pbandk.wkt.SourceContext? = this.sourceContext,
        syntax: pbandk.wkt.Syntax = this.syntax,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Enum

    public companion object : pbandk.Message.Companion<pbandk.wkt.Enum> {
        @Deprecated("Use enum { } instead")
        public operator fun invoke(
            name: String = "",
            enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            sourceContext: pbandk.wkt.SourceContext? = null,
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Enum = Enum_Impl(
            name = name,
            enumvalue = enumvalue,
            options = options,
            sourceContext = sourceContext,
            syntax = syntax,
            unknownFields = unknownFields
        )

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

public sealed interface MutableEnum : Enum, pbandk.MutableMessage {
    public override var name: String
    public override var enumvalue: List<pbandk.wkt.EnumValue>
    public override var options: List<pbandk.wkt.Option>
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var syntax: pbandk.wkt.Syntax

    public fun toEnum(): Enum

    public companion object : pbandk.Message.Companion<pbandk.wkt.Enum> {
        @Deprecated("Use enum { } instead")
        public operator fun invoke(
            name: String = "",
            enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            sourceContext: pbandk.wkt.SourceContext? = null,
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableEnum = MutableEnum_Impl(
            name = name,
            enumvalue = enumvalue,
            options = options,
            sourceContext = sourceContext,
            syntax = syntax,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableEnum by lazy { MutableEnum() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Enum = pbandk.wkt.Enum.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum> get() = pbandk.wkt.Enum.descriptor
    }
}

public sealed interface EnumValue : pbandk.Message {
    public val name: String
    public val number: Int
    public val options: List<pbandk.wkt.Option>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue>

    public fun copy(
        name: String = this.name,
        number: Int = this.number,
        options: List<pbandk.wkt.Option> = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValue> {
        @Deprecated("Use enumValue { } instead")
        public operator fun invoke(
            name: String = "",
            number: Int = 0,
            options: List<pbandk.wkt.Option> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.EnumValue = EnumValue_Impl(
            name = name,
            number = number,
            options = options,
            unknownFields = unknownFields
        )

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

public sealed interface MutableEnumValue : EnumValue, pbandk.MutableMessage {
    public override var name: String
    public override var number: Int
    public override var options: List<pbandk.wkt.Option>

    public fun toEnumValue(): EnumValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValue> {
        @Deprecated("Use enumValue { } instead")
        public operator fun invoke(
            name: String = "",
            number: Int = 0,
            options: List<pbandk.wkt.Option> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableEnumValue = MutableEnumValue_Impl(
            name = name,
            number = number,
            options = options,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableEnumValue by lazy { MutableEnumValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValue = pbandk.wkt.EnumValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue> get() = pbandk.wkt.EnumValue.descriptor
    }
}

public sealed interface Option : pbandk.Message {
    public val name: String
    public val value: pbandk.wkt.Any?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Option
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option>

    public fun copy(
        name: String = this.name,
        value: pbandk.wkt.Any? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Option

    public companion object : pbandk.Message.Companion<pbandk.wkt.Option> {
        @Deprecated("Use option { } instead")
        public operator fun invoke(
            name: String = "",
            value: pbandk.wkt.Any? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Option = Option_Impl(
            name = name,
            value = value,
            unknownFields = unknownFields
        )

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

public sealed interface MutableOption : Option, pbandk.MutableMessage {
    public override var name: String
    public override var value: pbandk.wkt.Any?

    public fun toOption(): Option

    public companion object : pbandk.Message.Companion<pbandk.wkt.Option> {
        @Deprecated("Use option { } instead")
        public operator fun invoke(
            name: String = "",
            value: pbandk.wkt.Any? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableOption = MutableOption_Impl(
            name = name,
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableOption by lazy { MutableOption() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Option = pbandk.wkt.Option.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option> get() = pbandk.wkt.Option.descriptor
    }
}

public fun type(builderAction: MutableType.() -> Unit): Type {
    val builder = MutableType()
    builder.builderAction()
    return builder.toType()
}

@pbandk.Export
@pbandk.JsName("orDefaultForType")
public fun Type?.orDefault(): pbandk.wkt.Type = this ?: Type.defaultInstance

private class Type_Impl(
    override val name: String,
    override val fields: List<pbandk.wkt.Field>,
    override val oneofs: List<String>,
    override val options: List<pbandk.wkt.Option>,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Type, pbandk.GeneratedMessage<Type>() {
    override val descriptor get() = Type.descriptor

    override fun copy(
        name: String,
        fields: List<pbandk.wkt.Field>,
        oneofs: List<String>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Type_Impl(
        name = name,
        fields = fields,
        oneofs = oneofs,
        options = options,
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Type)?.let {
        it.copy(
            fields = fields + other.fields,
            oneofs = oneofs + other.oneofs,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableType_Impl(
    override var name: String,
    override var fields: List<pbandk.wkt.Field>,
    override var oneofs: List<String>,
    override var options: List<pbandk.wkt.Option>,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var syntax: pbandk.wkt.Syntax,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableType, pbandk.MutableGeneratedMessage<MutableType>() {
    override val descriptor get() = Type.descriptor

    override fun copy(
        name: String,
        fields: List<pbandk.wkt.Field>,
        oneofs: List<String>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Type_Impl(
        name = name,
        fields = fields,
        oneofs = oneofs,
        options = options,
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Type)?.let {
        it.copy(
            fields = fields + other.fields,
            oneofs = oneofs + other.oneofs,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toType() = Type_Impl(
        name = name,
        fields = fields,
        oneofs = oneofs,
        options = options,
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields
    )
}

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

public fun field(builderAction: MutableField.() -> Unit): Field {
    val builder = MutableField()
    builder.builderAction()
    return builder.toField()
}

@pbandk.Export
@pbandk.JsName("orDefaultForField")
public fun Field?.orDefault(): pbandk.wkt.Field = this ?: Field.defaultInstance

private class Field_Impl(
    override val kind: pbandk.wkt.Field.Kind,
    override val cardinality: pbandk.wkt.Field.Cardinality,
    override val number: Int,
    override val name: String,
    override val typeUrl: String,
    override val oneofIndex: Int,
    override val packed: Boolean,
    override val options: List<pbandk.wkt.Option>,
    override val jsonName: String,
    override val defaultValue: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Field, pbandk.GeneratedMessage<Field>() {
    override val descriptor get() = Field.descriptor

    override fun copy(
        kind: pbandk.wkt.Field.Kind,
        cardinality: pbandk.wkt.Field.Cardinality,
        number: Int,
        name: String,
        typeUrl: String,
        oneofIndex: Int,
        packed: Boolean,
        options: List<pbandk.wkt.Option>,
        jsonName: String,
        defaultValue: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Field_Impl(
        kind = kind,
        cardinality = cardinality,
        number = number,
        name = name,
        typeUrl = typeUrl,
        oneofIndex = oneofIndex,
        packed = packed,
        options = options,
        jsonName = jsonName,
        defaultValue = defaultValue,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Field)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableField_Impl(
    override var kind: pbandk.wkt.Field.Kind,
    override var cardinality: pbandk.wkt.Field.Cardinality,
    override var number: Int,
    override var name: String,
    override var typeUrl: String,
    override var oneofIndex: Int,
    override var packed: Boolean,
    override var options: List<pbandk.wkt.Option>,
    override var jsonName: String,
    override var defaultValue: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableField, pbandk.MutableGeneratedMessage<MutableField>() {
    override val descriptor get() = Field.descriptor

    override fun copy(
        kind: pbandk.wkt.Field.Kind,
        cardinality: pbandk.wkt.Field.Cardinality,
        number: Int,
        name: String,
        typeUrl: String,
        oneofIndex: Int,
        packed: Boolean,
        options: List<pbandk.wkt.Option>,
        jsonName: String,
        defaultValue: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Field_Impl(
        kind = kind,
        cardinality = cardinality,
        number = number,
        name = name,
        typeUrl = typeUrl,
        oneofIndex = oneofIndex,
        packed = packed,
        options = options,
        jsonName = jsonName,
        defaultValue = defaultValue,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Field)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toField() = Field_Impl(
        kind = kind,
        cardinality = cardinality,
        number = number,
        name = name,
        typeUrl = typeUrl,
        oneofIndex = oneofIndex,
        packed = packed,
        options = options,
        jsonName = jsonName,
        defaultValue = defaultValue,
        unknownFields = unknownFields
    )
}

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

public fun enum(builderAction: MutableEnum.() -> Unit): Enum {
    val builder = MutableEnum()
    builder.builderAction()
    return builder.toEnum()
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnum")
public fun Enum?.orDefault(): pbandk.wkt.Enum = this ?: Enum.defaultInstance

private class Enum_Impl(
    override val name: String,
    override val enumvalue: List<pbandk.wkt.EnumValue>,
    override val options: List<pbandk.wkt.Option>,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Enum, pbandk.GeneratedMessage<Enum>() {
    override val descriptor get() = Enum.descriptor

    override fun copy(
        name: String,
        enumvalue: List<pbandk.wkt.EnumValue>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Enum_Impl(
        name = name,
        enumvalue = enumvalue,
        options = options,
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Enum)?.let {
        it.copy(
            enumvalue = enumvalue + other.enumvalue,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableEnum_Impl(
    override var name: String,
    override var enumvalue: List<pbandk.wkt.EnumValue>,
    override var options: List<pbandk.wkt.Option>,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var syntax: pbandk.wkt.Syntax,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableEnum, pbandk.MutableGeneratedMessage<MutableEnum>() {
    override val descriptor get() = Enum.descriptor

    override fun copy(
        name: String,
        enumvalue: List<pbandk.wkt.EnumValue>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Enum_Impl(
        name = name,
        enumvalue = enumvalue,
        options = options,
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Enum)?.let {
        it.copy(
            enumvalue = enumvalue + other.enumvalue,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEnum() = Enum_Impl(
        name = name,
        enumvalue = enumvalue,
        options = options,
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields
    )
}

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

public fun enumValue(builderAction: MutableEnumValue.() -> Unit): EnumValue {
    val builder = MutableEnumValue()
    builder.builderAction()
    return builder.toEnumValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValue")
public fun EnumValue?.orDefault(): pbandk.wkt.EnumValue = this ?: EnumValue.defaultInstance

private class EnumValue_Impl(
    override val name: String,
    override val number: Int,
    override val options: List<pbandk.wkt.Option>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : EnumValue, pbandk.GeneratedMessage<EnumValue>() {
    override val descriptor get() = EnumValue.descriptor

    override fun copy(
        name: String,
        number: Int,
        options: List<pbandk.wkt.Option>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = EnumValue_Impl(
        name = name,
        number = number,
        options = options,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? EnumValue)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableEnumValue_Impl(
    override var name: String,
    override var number: Int,
    override var options: List<pbandk.wkt.Option>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableEnumValue, pbandk.MutableGeneratedMessage<MutableEnumValue>() {
    override val descriptor get() = EnumValue.descriptor

    override fun copy(
        name: String,
        number: Int,
        options: List<pbandk.wkt.Option>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = EnumValue_Impl(
        name = name,
        number = number,
        options = options,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? EnumValue)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEnumValue() = EnumValue_Impl(
        name = name,
        number = number,
        options = options,
        unknownFields = unknownFields
    )
}

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

public fun option(builderAction: MutableOption.() -> Unit): Option {
    val builder = MutableOption()
    builder.builderAction()
    return builder.toOption()
}

@pbandk.Export
@pbandk.JsName("orDefaultForOption")
public fun Option?.orDefault(): pbandk.wkt.Option = this ?: Option.defaultInstance

private class Option_Impl(
    override val name: String,
    override val value: pbandk.wkt.Any?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Option, pbandk.GeneratedMessage<Option>() {
    override val descriptor get() = Option.descriptor

    override fun copy(
        name: String,
        value: pbandk.wkt.Any?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Option_Impl(
        name = name,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Option)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableOption_Impl(
    override var name: String,
    override var value: pbandk.wkt.Any?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableOption, pbandk.MutableGeneratedMessage<MutableOption>() {
    override val descriptor get() = Option.descriptor

    override fun copy(
        name: String,
        value: pbandk.wkt.Any?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Option_Impl(
        name = name,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Option)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toOption() = Option_Impl(
        name = name,
        value = value,
        unknownFields = unknownFields
    )
}

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

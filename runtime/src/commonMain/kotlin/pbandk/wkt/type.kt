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
        public val values: List<Syntax> by lazy { listOf(PROTO2, PROTO3) }
        override fun fromValue(value: Int): pbandk.wkt.Syntax = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.wkt.Syntax = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Syntax with name: $name")
    }
}

@pbandk.Export
public sealed interface Type : pbandk.Message {
    public val name: String
    public val fields: List<pbandk.wkt.Field>
    public val oneofs: List<String>
    public val options: List<pbandk.wkt.Option>
    public val sourceContext: pbandk.wkt.SourceContext?
    public val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Type
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableType(): pbandk.wkt.MutableType

    /**
     * The [MutableType] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit): pbandk.wkt.Type

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.wkt.Type by lazy { pbandk.wkt.Type {} }
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

public sealed interface MutableType : pbandk.wkt.Type, pbandk.MutableMessage {
    public override var name: String
    public override val fields: MutableList<pbandk.wkt.Field>
    public override val oneofs: MutableList<String>
    public override val options: MutableList<pbandk.wkt.Option>
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var syntax: pbandk.wkt.Syntax

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toType(): pbandk.wkt.Type

    public override fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit): pbandk.wkt.MutableType

    public companion object : pbandk.Message.Companion<pbandk.wkt.Type> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Type = pbandk.wkt.Type.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type> get() = pbandk.wkt.Type.descriptor
    }
}

@pbandk.Export
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

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableField(): pbandk.wkt.MutableField

    /**
     * The [MutableField] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit): pbandk.wkt.Field

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.wkt.Field by lazy { pbandk.wkt.Field {} }
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
            public val values: List<Field.Kind> by lazy { listOf(TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64) }
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
            public val values: List<Field.Cardinality> by lazy { listOf(UNKNOWN, OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int): pbandk.wkt.Field.Cardinality = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.Field.Cardinality = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Cardinality with name: $name")
        }
    }
}

public sealed interface MutableField : pbandk.wkt.Field, pbandk.MutableMessage {
    public override var kind: pbandk.wkt.Field.Kind
    public override var cardinality: pbandk.wkt.Field.Cardinality
    public override var number: Int
    public override var name: String
    public override var typeUrl: String
    public override var oneofIndex: Int
    public override var packed: Boolean
    public override val options: MutableList<pbandk.wkt.Option>
    public override var jsonName: String
    public override var defaultValue: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toField(): pbandk.wkt.Field

    public override fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit): pbandk.wkt.MutableField

    public companion object : pbandk.Message.Companion<pbandk.wkt.Field> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Field = pbandk.wkt.Field.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Field> get() = pbandk.wkt.Field.descriptor
    }
}

@pbandk.Export
public sealed interface Enum : pbandk.Message {
    public val name: String
    public val enumvalue: List<pbandk.wkt.EnumValue>
    public val options: List<pbandk.wkt.Option>
    public val sourceContext: pbandk.wkt.SourceContext?
    public val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Enum
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableEnum(): pbandk.wkt.MutableEnum

    /**
     * The [MutableEnum] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit): pbandk.wkt.Enum

    @Deprecated("Use copy {} instead")
    public fun copy(
        name: String = this.name,
        enumvalue: List<pbandk.wkt.EnumValue> = this.enumvalue,
        options: List<pbandk.wkt.Option> = this.options,
        sourceContext: pbandk.wkt.SourceContext? = this.sourceContext,
        syntax: pbandk.wkt.Syntax = this.syntax,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Enum

    public companion object : pbandk.Message.Companion<pbandk.wkt.Enum> {
        public val defaultInstance: pbandk.wkt.Enum by lazy { pbandk.wkt.Enum {} }
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

public sealed interface MutableEnum : pbandk.wkt.Enum, pbandk.MutableMessage {
    public override var name: String
    public override val enumvalue: MutableList<pbandk.wkt.EnumValue>
    public override val options: MutableList<pbandk.wkt.Option>
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var syntax: pbandk.wkt.Syntax

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toEnum(): pbandk.wkt.Enum

    public override fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit): pbandk.wkt.MutableEnum

    public companion object : pbandk.Message.Companion<pbandk.wkt.Enum> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Enum = pbandk.wkt.Enum.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum> get() = pbandk.wkt.Enum.descriptor
    }
}

@pbandk.Export
public sealed interface EnumValue : pbandk.Message {
    public val name: String
    public val number: Int
    public val options: List<pbandk.wkt.Option>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableEnumValue(): pbandk.wkt.MutableEnumValue

    /**
     * The [MutableEnumValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit): pbandk.wkt.EnumValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        name: String = this.name,
        number: Int = this.number,
        options: List<pbandk.wkt.Option> = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValue> {
        public val defaultInstance: pbandk.wkt.EnumValue by lazy { pbandk.wkt.EnumValue {} }
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

public sealed interface MutableEnumValue : pbandk.wkt.EnumValue, pbandk.MutableMessage {
    public override var name: String
    public override var number: Int
    public override val options: MutableList<pbandk.wkt.Option>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toEnumValue(): pbandk.wkt.EnumValue

    public override fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit): pbandk.wkt.MutableEnumValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValue> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValue = pbandk.wkt.EnumValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue> get() = pbandk.wkt.EnumValue.descriptor
    }
}

@pbandk.Export
public sealed interface Option : pbandk.Message {
    public val name: String
    public val value: pbandk.wkt.Any?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Option
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableOption(): pbandk.wkt.MutableOption

    /**
     * The [MutableOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit): pbandk.wkt.Option

    @Deprecated("Use copy {} instead")
    public fun copy(
        name: String = this.name,
        value: pbandk.wkt.Any? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Option

    public companion object : pbandk.Message.Companion<pbandk.wkt.Option> {
        public val defaultInstance: pbandk.wkt.Option by lazy { pbandk.wkt.Option {} }
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

public sealed interface MutableOption : pbandk.wkt.Option, pbandk.MutableMessage {
    public override var name: String
    public override var value: pbandk.wkt.Any?

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toOption(): pbandk.wkt.Option

    public override fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit): pbandk.wkt.MutableOption

    public companion object : pbandk.Message.Companion<pbandk.wkt.Option> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Option = pbandk.wkt.Option.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option> get() = pbandk.wkt.Option.descriptor
    }
}

@Deprecated("Use Type { } instead")
public fun Type(
    name: String = "",
    fields: List<pbandk.wkt.Field> = emptyList(),
    oneofs: List<String> = emptyList(),
    options: List<pbandk.wkt.Option> = emptyList(),
    sourceContext: pbandk.wkt.SourceContext? = null,
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Type = pbandk.wkt.Type {
    this.name = name
    this.fields += fields
    this.oneofs += oneofs
    this.options += options
    this.sourceContext = sourceContext
    this.syntax = syntax
    this.unknownFields += unknownFields
}

public fun MutableType(): pbandk.wkt.MutableType = pbandk.wkt.MutableType_Impl(
    name = "",
    fields = mutableListOf(),
    oneofs = mutableListOf(),
    options = mutableListOf(),
    sourceContext = null,
    syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableType] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Type(builderAction: pbandk.wkt.MutableType.() -> Unit): pbandk.wkt.Type =
    pbandk.wkt.MutableType().also(builderAction).toType()

public fun MutableType(builderAction: pbandk.wkt.MutableType.() -> Unit): pbandk.wkt.MutableType =
    pbandk.wkt.MutableType().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForType")
public fun Type?.orDefault(): pbandk.wkt.Type = this ?: pbandk.wkt.Type.defaultInstance

private class Type_Impl(
    override val name: String,
    override val fields: List<pbandk.wkt.Field>,
    override val oneofs: List<String>,
    override val options: List<pbandk.wkt.Option>,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Type, pbandk.GeneratedMessage<pbandk.wkt.Type>() {
    override val descriptor get() = pbandk.wkt.Type.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit) =
        toMutableType().apply(builderAction).toType()

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        fields: List<pbandk.wkt.Field>,
        oneofs: List<String>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.fields += fields
        this.oneofs += oneofs
        this.options += options
        this.sourceContext = sourceContext
        this.syntax = syntax
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Type)?.let {
        it.copy(
            fields = fields + other.fields,
            oneofs = oneofs + other.oneofs,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableType() = pbandk.wkt.MutableType {
        this.name = this@Type_Impl.name
        this.fields += this@Type_Impl.fields
        this.oneofs += this@Type_Impl.oneofs
        this.options += this@Type_Impl.options
        this.sourceContext = this@Type_Impl.sourceContext
        this.syntax = this@Type_Impl.syntax
        this.unknownFields += this@Type_Impl.unknownFields
    }
}

private class MutableType_Impl(
    override var name: String,
    override val fields: MutableList<pbandk.wkt.Field>,
    override val oneofs: MutableList<String>,
    override val options: MutableList<pbandk.wkt.Option>,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var syntax: pbandk.wkt.Syntax,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableType, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableType>() {
    override val descriptor get() = pbandk.wkt.Type.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit) =
        toMutableType().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        fields: List<pbandk.wkt.Field>,
        oneofs: List<String>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.fields += fields
        this.oneofs += oneofs
        this.options += options
        this.sourceContext = sourceContext
        this.syntax = syntax
        this.unknownFields += unknownFields
    }.toType()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Type)?.let {
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
        fields = fields.toList(),
        oneofs = oneofs.toList(),
        options = options.toList(),
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableType() = pbandk.wkt.MutableType {
        this.name = this@MutableType_Impl.name
        this.fields += this@MutableType_Impl.fields
        this.oneofs += this@MutableType_Impl.oneofs
        this.options += this@MutableType_Impl.options
        this.sourceContext = this@MutableType_Impl.sourceContext
        this.syntax = this@MutableType_Impl.syntax
        this.unknownFields += this@MutableType_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Type.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Type {
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
    return Type_Impl(name, pbandk.ListWithSize.Builder.fixed(fields), pbandk.ListWithSize.Builder.fixed(oneofs), pbandk.ListWithSize.Builder.fixed(options),
        sourceContext, syntax, unknownFields)
}

@Deprecated("Use Field { } instead")
public fun Field(
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
): pbandk.wkt.Field = pbandk.wkt.Field {
    this.kind = kind
    this.cardinality = cardinality
    this.number = number
    this.name = name
    this.typeUrl = typeUrl
    this.oneofIndex = oneofIndex
    this.packed = packed
    this.options += options
    this.jsonName = jsonName
    this.defaultValue = defaultValue
    this.unknownFields += unknownFields
}

public fun MutableField(): pbandk.wkt.MutableField = pbandk.wkt.MutableField_Impl(
    kind = pbandk.wkt.Field.Kind.fromValue(0),
    cardinality = pbandk.wkt.Field.Cardinality.fromValue(0),
    number = 0,
    name = "",
    typeUrl = "",
    oneofIndex = 0,
    packed = false,
    options = mutableListOf(),
    jsonName = "",
    defaultValue = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableField] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Field(builderAction: pbandk.wkt.MutableField.() -> Unit): pbandk.wkt.Field =
    pbandk.wkt.MutableField().also(builderAction).toField()

public fun MutableField(builderAction: pbandk.wkt.MutableField.() -> Unit): pbandk.wkt.MutableField =
    pbandk.wkt.MutableField().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForField")
public fun Field?.orDefault(): pbandk.wkt.Field = this ?: pbandk.wkt.Field.defaultInstance

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
) : pbandk.wkt.Field, pbandk.GeneratedMessage<pbandk.wkt.Field>() {
    override val descriptor get() = pbandk.wkt.Field.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit) =
        toMutableField().apply(builderAction).toField()

    @Deprecated("Use copy {} instead")
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
    ) = copy {
        this.kind = kind
        this.cardinality = cardinality
        this.number = number
        this.name = name
        this.typeUrl = typeUrl
        this.oneofIndex = oneofIndex
        this.packed = packed
        this.options += options
        this.jsonName = jsonName
        this.defaultValue = defaultValue
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Field)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableField() = pbandk.wkt.MutableField {
        this.kind = this@Field_Impl.kind
        this.cardinality = this@Field_Impl.cardinality
        this.number = this@Field_Impl.number
        this.name = this@Field_Impl.name
        this.typeUrl = this@Field_Impl.typeUrl
        this.oneofIndex = this@Field_Impl.oneofIndex
        this.packed = this@Field_Impl.packed
        this.options += this@Field_Impl.options
        this.jsonName = this@Field_Impl.jsonName
        this.defaultValue = this@Field_Impl.defaultValue
        this.unknownFields += this@Field_Impl.unknownFields
    }
}

private class MutableField_Impl(
    override var kind: pbandk.wkt.Field.Kind,
    override var cardinality: pbandk.wkt.Field.Cardinality,
    override var number: Int,
    override var name: String,
    override var typeUrl: String,
    override var oneofIndex: Int,
    override var packed: Boolean,
    override val options: MutableList<pbandk.wkt.Option>,
    override var jsonName: String,
    override var defaultValue: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableField, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableField>() {
    override val descriptor get() = pbandk.wkt.Field.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit) =
        toMutableField().apply(builderAction)

    @Deprecated("Use copy {} instead")
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
    ) = copy {
        this.kind = kind
        this.cardinality = cardinality
        this.number = number
        this.name = name
        this.typeUrl = typeUrl
        this.oneofIndex = oneofIndex
        this.packed = packed
        this.options += options
        this.jsonName = jsonName
        this.defaultValue = defaultValue
        this.unknownFields += unknownFields
    }.toField()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Field)?.let {
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
        options = options.toList(),
        jsonName = jsonName,
        defaultValue = defaultValue,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableField() = pbandk.wkt.MutableField {
        this.kind = this@MutableField_Impl.kind
        this.cardinality = this@MutableField_Impl.cardinality
        this.number = this@MutableField_Impl.number
        this.name = this@MutableField_Impl.name
        this.typeUrl = this@MutableField_Impl.typeUrl
        this.oneofIndex = this@MutableField_Impl.oneofIndex
        this.packed = this@MutableField_Impl.packed
        this.options += this@MutableField_Impl.options
        this.jsonName = this@MutableField_Impl.jsonName
        this.defaultValue = this@MutableField_Impl.defaultValue
        this.unknownFields += this@MutableField_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Field.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Field {
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
    return Field_Impl(kind, cardinality, number, name,
        typeUrl, oneofIndex, packed, pbandk.ListWithSize.Builder.fixed(options),
        jsonName, defaultValue, unknownFields)
}

@Deprecated("Use Enum { } instead")
public fun Enum(
    name: String = "",
    enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
    options: List<pbandk.wkt.Option> = emptyList(),
    sourceContext: pbandk.wkt.SourceContext? = null,
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Enum = pbandk.wkt.Enum {
    this.name = name
    this.enumvalue += enumvalue
    this.options += options
    this.sourceContext = sourceContext
    this.syntax = syntax
    this.unknownFields += unknownFields
}

public fun MutableEnum(): pbandk.wkt.MutableEnum = pbandk.wkt.MutableEnum_Impl(
    name = "",
    enumvalue = mutableListOf(),
    options = mutableListOf(),
    sourceContext = null,
    syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableEnum] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Enum(builderAction: pbandk.wkt.MutableEnum.() -> Unit): pbandk.wkt.Enum =
    pbandk.wkt.MutableEnum().also(builderAction).toEnum()

public fun MutableEnum(builderAction: pbandk.wkt.MutableEnum.() -> Unit): pbandk.wkt.MutableEnum =
    pbandk.wkt.MutableEnum().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForEnum")
public fun Enum?.orDefault(): pbandk.wkt.Enum = this ?: pbandk.wkt.Enum.defaultInstance

private class Enum_Impl(
    override val name: String,
    override val enumvalue: List<pbandk.wkt.EnumValue>,
    override val options: List<pbandk.wkt.Option>,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Enum, pbandk.GeneratedMessage<pbandk.wkt.Enum>() {
    override val descriptor get() = pbandk.wkt.Enum.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit) =
        toMutableEnum().apply(builderAction).toEnum()

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        enumvalue: List<pbandk.wkt.EnumValue>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.enumvalue += enumvalue
        this.options += options
        this.sourceContext = sourceContext
        this.syntax = syntax
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Enum)?.let {
        it.copy(
            enumvalue = enumvalue + other.enumvalue,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableEnum() = pbandk.wkt.MutableEnum {
        this.name = this@Enum_Impl.name
        this.enumvalue += this@Enum_Impl.enumvalue
        this.options += this@Enum_Impl.options
        this.sourceContext = this@Enum_Impl.sourceContext
        this.syntax = this@Enum_Impl.syntax
        this.unknownFields += this@Enum_Impl.unknownFields
    }
}

private class MutableEnum_Impl(
    override var name: String,
    override val enumvalue: MutableList<pbandk.wkt.EnumValue>,
    override val options: MutableList<pbandk.wkt.Option>,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var syntax: pbandk.wkt.Syntax,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEnum, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEnum>() {
    override val descriptor get() = pbandk.wkt.Enum.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit) =
        toMutableEnum().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        enumvalue: List<pbandk.wkt.EnumValue>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.enumvalue += enumvalue
        this.options += options
        this.sourceContext = sourceContext
        this.syntax = syntax
        this.unknownFields += unknownFields
    }.toEnum()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Enum)?.let {
        it.copy(
            enumvalue = enumvalue + other.enumvalue,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEnum() = Enum_Impl(
        name = name,
        enumvalue = enumvalue.toList(),
        options = options.toList(),
        sourceContext = sourceContext,
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableEnum() = pbandk.wkt.MutableEnum {
        this.name = this@MutableEnum_Impl.name
        this.enumvalue += this@MutableEnum_Impl.enumvalue
        this.options += this@MutableEnum_Impl.options
        this.sourceContext = this@MutableEnum_Impl.sourceContext
        this.syntax = this@MutableEnum_Impl.syntax
        this.unknownFields += this@MutableEnum_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Enum.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Enum {
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
    return Enum_Impl(name, pbandk.ListWithSize.Builder.fixed(enumvalue), pbandk.ListWithSize.Builder.fixed(options), sourceContext,
        syntax, unknownFields)
}

@Deprecated("Use EnumValue { } instead")
public fun EnumValue(
    name: String = "",
    number: Int = 0,
    options: List<pbandk.wkt.Option> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumValue = pbandk.wkt.EnumValue {
    this.name = name
    this.number = number
    this.options += options
    this.unknownFields += unknownFields
}

public fun MutableEnumValue(): pbandk.wkt.MutableEnumValue = pbandk.wkt.MutableEnumValue_Impl(
    name = "",
    number = 0,
    options = mutableListOf(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableEnumValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun EnumValue(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit): pbandk.wkt.EnumValue =
    pbandk.wkt.MutableEnumValue().also(builderAction).toEnumValue()

public fun MutableEnumValue(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit): pbandk.wkt.MutableEnumValue =
    pbandk.wkt.MutableEnumValue().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValue")
public fun EnumValue?.orDefault(): pbandk.wkt.EnumValue = this ?: pbandk.wkt.EnumValue.defaultInstance

private class EnumValue_Impl(
    override val name: String,
    override val number: Int,
    override val options: List<pbandk.wkt.Option>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumValue, pbandk.GeneratedMessage<pbandk.wkt.EnumValue>() {
    override val descriptor get() = pbandk.wkt.EnumValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit) =
        toMutableEnumValue().apply(builderAction).toEnumValue()

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        number: Int,
        options: List<pbandk.wkt.Option>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.number = number
        this.options += options
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.EnumValue)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableEnumValue() = pbandk.wkt.MutableEnumValue {
        this.name = this@EnumValue_Impl.name
        this.number = this@EnumValue_Impl.number
        this.options += this@EnumValue_Impl.options
        this.unknownFields += this@EnumValue_Impl.unknownFields
    }
}

private class MutableEnumValue_Impl(
    override var name: String,
    override var number: Int,
    override val options: MutableList<pbandk.wkt.Option>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEnumValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEnumValue>() {
    override val descriptor get() = pbandk.wkt.EnumValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit) =
        toMutableEnumValue().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        number: Int,
        options: List<pbandk.wkt.Option>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.number = number
        this.options += options
        this.unknownFields += unknownFields
    }.toEnumValue()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.EnumValue)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEnumValue() = EnumValue_Impl(
        name = name,
        number = number,
        options = options.toList(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableEnumValue() = pbandk.wkt.MutableEnumValue {
        this.name = this@MutableEnumValue_Impl.name
        this.number = this@MutableEnumValue_Impl.number
        this.options += this@MutableEnumValue_Impl.options
        this.unknownFields += this@MutableEnumValue_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.EnumValue {
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
    return EnumValue_Impl(name, number, pbandk.ListWithSize.Builder.fixed(options), unknownFields)
}

@Deprecated("Use Option { } instead")
public fun Option(
    name: String = "",
    value: pbandk.wkt.Any? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Option = pbandk.wkt.Option {
    this.name = name
    this.value = value
    this.unknownFields += unknownFields
}

public fun MutableOption(): pbandk.wkt.MutableOption = pbandk.wkt.MutableOption_Impl(
    name = "",
    value = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Option(builderAction: pbandk.wkt.MutableOption.() -> Unit): pbandk.wkt.Option =
    pbandk.wkt.MutableOption().also(builderAction).toOption()

public fun MutableOption(builderAction: pbandk.wkt.MutableOption.() -> Unit): pbandk.wkt.MutableOption =
    pbandk.wkt.MutableOption().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForOption")
public fun Option?.orDefault(): pbandk.wkt.Option = this ?: pbandk.wkt.Option.defaultInstance

private class Option_Impl(
    override val name: String,
    override val value: pbandk.wkt.Any?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Option, pbandk.GeneratedMessage<pbandk.wkt.Option>() {
    override val descriptor get() = pbandk.wkt.Option.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit) =
        toMutableOption().apply(builderAction).toOption()

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        value: pbandk.wkt.Any?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Option)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableOption() = pbandk.wkt.MutableOption {
        this.name = this@Option_Impl.name
        this.value = this@Option_Impl.value
        this.unknownFields += this@Option_Impl.unknownFields
    }
}

private class MutableOption_Impl(
    override var name: String,
    override var value: pbandk.wkt.Any?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableOption, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableOption>() {
    override val descriptor get() = pbandk.wkt.Option.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit) =
        toMutableOption().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        name: String,
        value: pbandk.wkt.Any?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.name = name
        this.value = value
        this.unknownFields += unknownFields
    }.toOption()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Option)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toOption() = Option_Impl(
        name = name,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableOption() = pbandk.wkt.MutableOption {
        this.name = this@MutableOption_Impl.name
        this.value = this@MutableOption_Impl.value
        this.unknownFields += this@MutableOption_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Option.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Option {
    var name = ""
    var value: pbandk.wkt.Any? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> value = _fieldValue as pbandk.wkt.Any
        }
    }
    return Option_Impl(name, value, unknownFields)
}

@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Syntax : pbandk.Message.Enum {
    override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Syntax>
        get() = pbandk.wkt.Syntax.descriptor

    public object PROTO2 : Syntax, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Syntax>(
        value = 0,
        name = "SYNTAX_PROTO2",
    )
    public object PROTO3 : Syntax, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Syntax>(
        value = 1,
        name = "SYNTAX_PROTO3",
    )
    public object EDITIONS : Syntax, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Syntax>(
        value = 2,
        name = "SYNTAX_EDITIONS",
    )
    public class UNRECOGNIZED(value: Int? = null, name: String? = null)
        : Syntax, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.Syntax>(value, name)

    public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Syntax> {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Syntax> =
            pbandk.EnumDescriptor.of(
                fullName = "google.protobuf.Syntax",
                enumClass = pbandk.wkt.Syntax::class,
                enumCompanion = this,
            )
        public val values: List<Syntax> by lazy(LazyThreadSafetyMode.PUBLICATION) {
            listOf(PROTO2, PROTO3, EDITIONS)
        }

        override fun fromValue(value: Int): pbandk.wkt.Syntax =
            values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

        override fun fromName(name: String): pbandk.wkt.Syntax =
            values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
    }
}

public sealed interface Type : pbandk.Message {
    public val name: String
    public val fields: List<pbandk.wkt.Field>
    public val oneofs: List<String>
    public val options: List<pbandk.wkt.Option>
    public val sourceContext: pbandk.wkt.SourceContext?
    public val syntax: pbandk.wkt.Syntax
    public val edition: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Type
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type>

    /**
     * The [MutableType] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit): pbandk.wkt.Type

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        fields: List<pbandk.wkt.Field> = this.fields,
        oneofs: List<String> = this.oneofs,
        options: List<pbandk.wkt.Option> = this.options,
        sourceContext: pbandk.wkt.SourceContext? = this.sourceContext,
        syntax: pbandk.wkt.Syntax = this.syntax,
        edition: String = this.edition,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Type

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Type, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.Type::name,
                mutableValue = pbandk.wkt.MutableType::name,
            )
        public val fields: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.Type, List<pbandk.wkt.Field>, MutableList<pbandk.wkt.Field>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "fields",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.Field),
                jsonName = "fields",
                value = pbandk.wkt.Type::fields,
                mutableValue = pbandk.wkt.MutableType::fields,
            )
        public val oneofs: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.Type, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "oneofs",
                number = 3,
                valueType = pbandk.types.string(),
                jsonName = "oneofs",
                value = pbandk.wkt.Type::oneofs,
                mutableValue = pbandk.wkt.MutableType::oneofs,
            )
        public val options: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.Type, List<pbandk.wkt.Option>, MutableList<pbandk.wkt.Option>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "options",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.Option),
                jsonName = "options",
                value = pbandk.wkt.Type::options,
                mutableValue = pbandk.wkt.MutableType::options,
            )
        public val sourceContext: pbandk.FieldDescriptor<pbandk.wkt.Type, pbandk.wkt.SourceContext?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "source_context",
                number = 5,
                valueType = pbandk.types.message(pbandk.wkt.SourceContext),
                jsonName = "sourceContext",
                value = pbandk.wkt.Type::sourceContext,
                mutableValue = pbandk.wkt.MutableType::sourceContext,
            )
        public val syntax: pbandk.FieldDescriptor<pbandk.wkt.Type, pbandk.wkt.Syntax> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "syntax",
                number = 6,
                valueType = pbandk.types.enum(pbandk.wkt.Syntax),
                jsonName = "syntax",
                value = pbandk.wkt.Type::syntax,
                mutableValue = pbandk.wkt.MutableType::syntax,
            )
        public val edition: pbandk.FieldDescriptor<pbandk.wkt.Type, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Type::descriptor,
                messageMetadata = pbandk.wkt.Type.messageMetadata,
                name = "edition",
                number = 7,
                valueType = pbandk.types.string(),
                jsonName = "edition",
                value = pbandk.wkt.Type::edition,
                mutableValue = pbandk.wkt.MutableType::edition,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Type>() {
        override val defaultInstance: pbandk.wkt.Type by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Type {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Type",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Type> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Type::class,
                messageCompanion = this,
                builder = ::Type,
                fields = listOf(
                    pbandk.wkt.Type.FieldDescriptors.name,
                    pbandk.wkt.Type.FieldDescriptors.fields,
                    pbandk.wkt.Type.FieldDescriptors.oneofs,
                    pbandk.wkt.Type.FieldDescriptors.options,
                    pbandk.wkt.Type.FieldDescriptors.sourceContext,
                    pbandk.wkt.Type.FieldDescriptors.syntax,
                    pbandk.wkt.Type.FieldDescriptors.edition,
                ),
            )
        }
    }
}

public sealed interface MutableType : pbandk.wkt.Type, pbandk.MutableMessage<pbandk.wkt.Type> {
    public override var name: String
    public override val fields: MutableList<pbandk.wkt.Field>
    public override val oneofs: MutableList<String>
    public override val options: MutableList<pbandk.wkt.Option>
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var syntax: pbandk.wkt.Syntax
    public override var edition: String
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

    /**
     * The [MutableField] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit): pbandk.wkt.Field

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val kind: pbandk.FieldDescriptor<pbandk.wkt.Field, pbandk.wkt.Field.Kind> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "kind",
                number = 1,
                valueType = pbandk.types.enum(pbandk.wkt.Field.Kind),
                jsonName = "kind",
                value = pbandk.wkt.Field::kind,
                mutableValue = pbandk.wkt.MutableField::kind,
            )
        public val cardinality: pbandk.FieldDescriptor<pbandk.wkt.Field, pbandk.wkt.Field.Cardinality> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "cardinality",
                number = 2,
                valueType = pbandk.types.enum(pbandk.wkt.Field.Cardinality),
                jsonName = "cardinality",
                value = pbandk.wkt.Field::cardinality,
                mutableValue = pbandk.wkt.MutableField::cardinality,
            )
        public val number: pbandk.FieldDescriptor<pbandk.wkt.Field, Int> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "number",
                number = 3,
                valueType = pbandk.types.int32(),
                jsonName = "number",
                value = pbandk.wkt.Field::number,
                mutableValue = pbandk.wkt.MutableField::number,
            )
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Field, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "name",
                number = 4,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.Field::name,
                mutableValue = pbandk.wkt.MutableField::name,
            )
        public val typeUrl: pbandk.FieldDescriptor<pbandk.wkt.Field, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "type_url",
                number = 6,
                valueType = pbandk.types.string(),
                jsonName = "typeUrl",
                value = pbandk.wkt.Field::typeUrl,
                mutableValue = pbandk.wkt.MutableField::typeUrl,
            )
        public val oneofIndex: pbandk.FieldDescriptor<pbandk.wkt.Field, Int> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "oneof_index",
                number = 7,
                valueType = pbandk.types.int32(),
                jsonName = "oneofIndex",
                value = pbandk.wkt.Field::oneofIndex,
                mutableValue = pbandk.wkt.MutableField::oneofIndex,
            )
        public val packed: pbandk.FieldDescriptor<pbandk.wkt.Field, Boolean> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "packed",
                number = 8,
                valueType = pbandk.types.bool(),
                jsonName = "packed",
                value = pbandk.wkt.Field::packed,
                mutableValue = pbandk.wkt.MutableField::packed,
            )
        public val options: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.Field, List<pbandk.wkt.Option>, MutableList<pbandk.wkt.Option>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "options",
                number = 9,
                valueType = pbandk.types.message(pbandk.wkt.Option),
                jsonName = "options",
                value = pbandk.wkt.Field::options,
                mutableValue = pbandk.wkt.MutableField::options,
            )
        public val jsonName: pbandk.FieldDescriptor<pbandk.wkt.Field, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "json_name",
                number = 10,
                valueType = pbandk.types.string(),
                jsonName = "jsonName",
                value = pbandk.wkt.Field::jsonName,
                mutableValue = pbandk.wkt.MutableField::jsonName,
            )
        public val defaultValue: pbandk.FieldDescriptor<pbandk.wkt.Field, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Field::descriptor,
                messageMetadata = pbandk.wkt.Field.messageMetadata,
                name = "default_value",
                number = 11,
                valueType = pbandk.types.string(),
                jsonName = "defaultValue",
                value = pbandk.wkt.Field::defaultValue,
                mutableValue = pbandk.wkt.MutableField::defaultValue,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Field>() {
        override val defaultInstance: pbandk.wkt.Field by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Field {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Field",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Field> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Field::class,
                messageCompanion = this,
                builder = ::Field,
                fields = listOf(
                    pbandk.wkt.Field.FieldDescriptors.kind,
                    pbandk.wkt.Field.FieldDescriptors.cardinality,
                    pbandk.wkt.Field.FieldDescriptors.number,
                    pbandk.wkt.Field.FieldDescriptors.name,
                    pbandk.wkt.Field.FieldDescriptors.typeUrl,
                    pbandk.wkt.Field.FieldDescriptors.oneofIndex,
                    pbandk.wkt.Field.FieldDescriptors.packed,
                    pbandk.wkt.Field.FieldDescriptors.options,
                    pbandk.wkt.Field.FieldDescriptors.jsonName,
                    pbandk.wkt.Field.FieldDescriptors.defaultValue,
                ),
            )
        }
    }

    public sealed interface Kind : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Field.Kind>
            get() = pbandk.wkt.Field.Kind.descriptor

        public object TYPE_UNKNOWN : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 0,
            name = "TYPE_UNKNOWN",
        )
        public object TYPE_DOUBLE : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 1,
            name = "TYPE_DOUBLE",
        )
        public object TYPE_FLOAT : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 2,
            name = "TYPE_FLOAT",
        )
        public object TYPE_INT64 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 3,
            name = "TYPE_INT64",
        )
        public object TYPE_UINT64 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 4,
            name = "TYPE_UINT64",
        )
        public object TYPE_INT32 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 5,
            name = "TYPE_INT32",
        )
        public object TYPE_FIXED64 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 6,
            name = "TYPE_FIXED64",
        )
        public object TYPE_FIXED32 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 7,
            name = "TYPE_FIXED32",
        )
        public object TYPE_BOOL : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 8,
            name = "TYPE_BOOL",
        )
        public object TYPE_STRING : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 9,
            name = "TYPE_STRING",
        )
        public object TYPE_GROUP : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 10,
            name = "TYPE_GROUP",
        )
        public object TYPE_MESSAGE : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 11,
            name = "TYPE_MESSAGE",
        )
        public object TYPE_BYTES : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 12,
            name = "TYPE_BYTES",
        )
        public object TYPE_UINT32 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 13,
            name = "TYPE_UINT32",
        )
        public object TYPE_ENUM : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 14,
            name = "TYPE_ENUM",
        )
        public object TYPE_SFIXED32 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 15,
            name = "TYPE_SFIXED32",
        )
        public object TYPE_SFIXED64 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 16,
            name = "TYPE_SFIXED64",
        )
        public object TYPE_SINT32 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 17,
            name = "TYPE_SINT32",
        )
        public object TYPE_SINT64 : Kind, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Kind>(
            value = 18,
            name = "TYPE_SINT64",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Kind, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.Field.Kind>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Field.Kind> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Field.Kind> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.Field.Kind",
                    enumClass = pbandk.wkt.Field.Kind::class,
                    enumCompanion = this,
                )
            public val values: List<Field.Kind> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(
                    TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64,
                    TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING,
                    TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM,
                    TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64,
                )
            }

            override fun fromValue(value: Int): pbandk.wkt.Field.Kind =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.Field.Kind =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface Cardinality : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Field.Cardinality>
            get() = pbandk.wkt.Field.Cardinality.descriptor

        public object UNKNOWN : Cardinality, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Cardinality>(
            value = 0,
            name = "CARDINALITY_UNKNOWN",
        )
        public object OPTIONAL : Cardinality, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Cardinality>(
            value = 1,
            name = "CARDINALITY_OPTIONAL",
        )
        public object REQUIRED : Cardinality, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Cardinality>(
            value = 2,
            name = "CARDINALITY_REQUIRED",
        )
        public object REPEATED : Cardinality, pbandk.gen.GeneratedEnumValue<pbandk.wkt.Field.Cardinality>(
            value = 3,
            name = "CARDINALITY_REPEATED",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Cardinality, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.Field.Cardinality>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.Field.Cardinality> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.Field.Cardinality> =
                pbandk.EnumDescriptor.of(
                    fullName = "google.protobuf.Field.Cardinality",
                    enumClass = pbandk.wkt.Field.Cardinality::class,
                    enumCompanion = this,
                )
            public val values: List<Field.Cardinality> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UNKNOWN, OPTIONAL, REQUIRED, REPEATED)
            }

            override fun fromValue(value: Int): pbandk.wkt.Field.Cardinality =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.Field.Cardinality =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableField : pbandk.wkt.Field, pbandk.MutableMessage<pbandk.wkt.Field> {
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
}

public sealed interface Enum : pbandk.Message {
    public val name: String
    public val enumvalue: List<pbandk.wkt.EnumValue>
    public val options: List<pbandk.wkt.Option>
    public val sourceContext: pbandk.wkt.SourceContext?
    public val syntax: pbandk.wkt.Syntax
    public val edition: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Enum
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum>

    /**
     * The [MutableEnum] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit): pbandk.wkt.Enum

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        enumvalue: List<pbandk.wkt.EnumValue> = this.enumvalue,
        options: List<pbandk.wkt.Option> = this.options,
        sourceContext: pbandk.wkt.SourceContext? = this.sourceContext,
        syntax: pbandk.wkt.Syntax = this.syntax,
        edition: String = this.edition,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Enum

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Enum, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Enum::descriptor,
                messageMetadata = pbandk.wkt.Enum.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.Enum::name,
                mutableValue = pbandk.wkt.MutableEnum::name,
            )
        public val enumvalue: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.Enum, List<pbandk.wkt.EnumValue>, MutableList<pbandk.wkt.EnumValue>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Enum::descriptor,
                messageMetadata = pbandk.wkt.Enum.messageMetadata,
                name = "enumvalue",
                number = 2,
                valueType = pbandk.types.message(pbandk.wkt.EnumValue),
                jsonName = "enumvalue",
                value = pbandk.wkt.Enum::enumvalue,
                mutableValue = pbandk.wkt.MutableEnum::enumvalue,
            )
        public val options: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.Enum, List<pbandk.wkt.Option>, MutableList<pbandk.wkt.Option>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Enum::descriptor,
                messageMetadata = pbandk.wkt.Enum.messageMetadata,
                name = "options",
                number = 3,
                valueType = pbandk.types.message(pbandk.wkt.Option),
                jsonName = "options",
                value = pbandk.wkt.Enum::options,
                mutableValue = pbandk.wkt.MutableEnum::options,
            )
        public val sourceContext: pbandk.FieldDescriptor<pbandk.wkt.Enum, pbandk.wkt.SourceContext?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.Enum::descriptor,
                messageMetadata = pbandk.wkt.Enum.messageMetadata,
                name = "source_context",
                number = 4,
                valueType = pbandk.types.message(pbandk.wkt.SourceContext),
                jsonName = "sourceContext",
                value = pbandk.wkt.Enum::sourceContext,
                mutableValue = pbandk.wkt.MutableEnum::sourceContext,
            )
        public val syntax: pbandk.FieldDescriptor<pbandk.wkt.Enum, pbandk.wkt.Syntax> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Enum::descriptor,
                messageMetadata = pbandk.wkt.Enum.messageMetadata,
                name = "syntax",
                number = 5,
                valueType = pbandk.types.enum(pbandk.wkt.Syntax),
                jsonName = "syntax",
                value = pbandk.wkt.Enum::syntax,
                mutableValue = pbandk.wkt.MutableEnum::syntax,
            )
        public val edition: pbandk.FieldDescriptor<pbandk.wkt.Enum, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Enum::descriptor,
                messageMetadata = pbandk.wkt.Enum.messageMetadata,
                name = "edition",
                number = 6,
                valueType = pbandk.types.string(),
                jsonName = "edition",
                value = pbandk.wkt.Enum::edition,
                mutableValue = pbandk.wkt.MutableEnum::edition,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Enum>() {
        override val defaultInstance: pbandk.wkt.Enum by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Enum {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Enum",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Enum> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Enum::class,
                messageCompanion = this,
                builder = ::Enum,
                fields = listOf(
                    pbandk.wkt.Enum.FieldDescriptors.name,
                    pbandk.wkt.Enum.FieldDescriptors.enumvalue,
                    pbandk.wkt.Enum.FieldDescriptors.options,
                    pbandk.wkt.Enum.FieldDescriptors.sourceContext,
                    pbandk.wkt.Enum.FieldDescriptors.syntax,
                    pbandk.wkt.Enum.FieldDescriptors.edition,
                ),
            )
        }
    }
}

public sealed interface MutableEnum : pbandk.wkt.Enum, pbandk.MutableMessage<pbandk.wkt.Enum> {
    public override var name: String
    public override val enumvalue: MutableList<pbandk.wkt.EnumValue>
    public override val options: MutableList<pbandk.wkt.Option>
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var syntax: pbandk.wkt.Syntax
    public override var edition: String
}

public sealed interface EnumValue : pbandk.Message {
    public val name: String
    public val number: Int
    public val options: List<pbandk.wkt.Option>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue>

    /**
     * The [MutableEnumValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit): pbandk.wkt.EnumValue

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        number: Int = this.number,
        options: List<pbandk.wkt.Option> = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.EnumValue, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.EnumValue::descriptor,
                messageMetadata = pbandk.wkt.EnumValue.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.EnumValue::name,
                mutableValue = pbandk.wkt.MutableEnumValue::name,
            )
        public val number: pbandk.FieldDescriptor<pbandk.wkt.EnumValue, Int> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.EnumValue::descriptor,
                messageMetadata = pbandk.wkt.EnumValue.messageMetadata,
                name = "number",
                number = 2,
                valueType = pbandk.types.int32(),
                jsonName = "number",
                value = pbandk.wkt.EnumValue::number,
                mutableValue = pbandk.wkt.MutableEnumValue::number,
            )
        public val options: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.EnumValue, List<pbandk.wkt.Option>, MutableList<pbandk.wkt.Option>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.EnumValue::descriptor,
                messageMetadata = pbandk.wkt.EnumValue.messageMetadata,
                name = "options",
                number = 3,
                valueType = pbandk.types.message(pbandk.wkt.Option),
                jsonName = "options",
                value = pbandk.wkt.EnumValue::options,
                mutableValue = pbandk.wkt.MutableEnumValue::options,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValue>() {
        override val defaultInstance: pbandk.wkt.EnumValue by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.EnumValue {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.EnumValue",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValue> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.EnumValue::class,
                messageCompanion = this,
                builder = ::EnumValue,
                fields = listOf(
                    pbandk.wkt.EnumValue.FieldDescriptors.name,
                    pbandk.wkt.EnumValue.FieldDescriptors.number,
                    pbandk.wkt.EnumValue.FieldDescriptors.options,
                ),
            )
        }
    }
}

public sealed interface MutableEnumValue : pbandk.wkt.EnumValue, pbandk.MutableMessage<pbandk.wkt.EnumValue> {
    public override var name: String
    public override var number: Int
    public override val options: MutableList<pbandk.wkt.Option>
}

public sealed interface Option : pbandk.Message {
    public val name: String
    public val value: pbandk.wkt.Any?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Option
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option>

    /**
     * The [MutableOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit): pbandk.wkt.Option

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        value: pbandk.wkt.Any? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Option

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Option, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Option::descriptor,
                messageMetadata = pbandk.wkt.Option.messageMetadata,
                name = "name",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "name",
                value = pbandk.wkt.Option::name,
                mutableValue = pbandk.wkt.MutableOption::name,
            )
        public val value: pbandk.FieldDescriptor<pbandk.wkt.Option, pbandk.wkt.Any?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.Option::descriptor,
                messageMetadata = pbandk.wkt.Option.messageMetadata,
                name = "value",
                number = 2,
                valueType = pbandk.types.any(),
                jsonName = "value",
                value = pbandk.wkt.Option::value,
                mutableValue = pbandk.wkt.MutableOption::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Option>() {
        override val defaultInstance: pbandk.wkt.Option by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Option {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Option",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Option> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Option::class,
                messageCompanion = this,
                builder = ::Option,
                fields = listOf(
                    pbandk.wkt.Option.FieldDescriptors.name,
                    pbandk.wkt.Option.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableOption : pbandk.wkt.Option, pbandk.MutableMessage<pbandk.wkt.Option> {
    public override var name: String
    public override var value: pbandk.wkt.Any?
}

@Deprecated(
    message = "Use Type { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Type"],
        expression = "Type {\nthis.name = name\nthis.fields += fields\nthis.oneofs += oneofs\nthis.options += options\nthis.sourceContext = sourceContext\nthis.syntax = syntax\nthis.edition = edition\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Type(
    name: String = "",
    fields: List<pbandk.wkt.Field> = emptyList(),
    oneofs: List<String> = emptyList(),
    options: List<pbandk.wkt.Option> = emptyList(),
    sourceContext: pbandk.wkt.SourceContext? = null,
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    edition: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Type = pbandk.wkt.Type {
    this.name = name
    this.fields += fields
    this.oneofs += oneofs
    this.options += options
    this.sourceContext = sourceContext
    this.syntax = syntax
    this.edition = edition
    this.unknownFields += unknownFields
}

/**
 * The [MutableType] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildType")
public fun Type(builderAction: pbandk.wkt.MutableType.() -> Unit): pbandk.wkt.Type =
    pbandk.wkt.MutableType_Impl(
        name = "",
        fields = pbandk.gen.MutableListField(pbandk.wkt.Type.FieldDescriptors.fields),
        oneofs = pbandk.gen.MutableListField(pbandk.wkt.Type.FieldDescriptors.oneofs),
        options = pbandk.gen.MutableListField(pbandk.wkt.Type.FieldDescriptors.options),
        sourceContext = null,
        syntax = pbandk.wkt.Syntax.fromValue(0),
        edition = "",
    ).also(builderAction).toType()

@pbandk.Export
@pbandk.JsName("orDefaultForType")
public fun Type?.orDefault(): pbandk.wkt.Type = this ?: pbandk.wkt.Type.defaultInstance

private class Type_Impl(
    override val name: String,
    override val fields: pbandk.gen.ListField<pbandk.wkt.Field>,
    override val oneofs: pbandk.gen.ListField<String>,
    override val options: pbandk.gen.ListField<pbandk.wkt.Option>,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val syntax: pbandk.wkt.Syntax,
    override val edition: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Type, pbandk.gen.GeneratedMessage<pbandk.wkt.Type>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Type.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        fields: List<pbandk.wkt.Field>,
        oneofs: List<String>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        edition: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.Type = pbandk.wkt.Type {
        this.name = name
        this.fields += fields
        this.oneofs += oneofs
        this.options += options
        this.sourceContext = sourceContext
        this.syntax = syntax
        this.edition = edition
        this.unknownFields += unknownFields
    }
}

private class MutableType_Impl(
    override var name: String,
    override val fields: pbandk.gen.MutableListField<pbandk.wkt.Field>,
    override val oneofs: pbandk.gen.MutableListField<String>,
    override val options: pbandk.gen.MutableListField<pbandk.wkt.Option>,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var syntax: pbandk.wkt.Syntax,
    override var edition: String,
) : pbandk.wkt.MutableType, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Type>() {
    override val descriptor get() = pbandk.wkt.Type.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableType.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        fields: List<pbandk.wkt.Field>,
        oneofs: List<String>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        edition: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.Type = throw UnsupportedOperationException()

    fun toType() = Type_Impl(
        name = name,
        fields = fields.toListField(),
        oneofs = oneofs.toListField(),
        options = options.toListField(),
        sourceContext = sourceContext,
        syntax = syntax,
        edition = edition,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Field { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Field"],
        expression = "Field {\nthis.kind = kind\nthis.cardinality = cardinality\nthis.number = number\nthis.name = name\nthis.typeUrl = typeUrl\nthis.oneofIndex = oneofIndex\nthis.packed = packed\nthis.options += options\nthis.jsonName = jsonName\nthis.defaultValue = defaultValue\nthis.unknownFields += unknownFields\n}",
    )
)
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

/**
 * The [MutableField] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildField")
public fun Field(builderAction: pbandk.wkt.MutableField.() -> Unit): pbandk.wkt.Field =
    pbandk.wkt.MutableField_Impl(
        kind = pbandk.wkt.Field.Kind.fromValue(0),
        cardinality = pbandk.wkt.Field.Cardinality.fromValue(0),
        number = 0,
        name = "",
        typeUrl = "",
        oneofIndex = 0,
        packed = false,
        options = pbandk.gen.MutableListField(pbandk.wkt.Field.FieldDescriptors.options),
        jsonName = "",
        defaultValue = "",
    ).also(builderAction).toField()

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
    override val options: pbandk.gen.ListField<pbandk.wkt.Option>,
    override val jsonName: String,
    override val defaultValue: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Field, pbandk.gen.GeneratedMessage<pbandk.wkt.Field>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Field.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
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
}

private class MutableField_Impl(
    override var kind: pbandk.wkt.Field.Kind,
    override var cardinality: pbandk.wkt.Field.Cardinality,
    override var number: Int,
    override var name: String,
    override var typeUrl: String,
    override var oneofIndex: Int,
    override var packed: Boolean,
    override val options: pbandk.gen.MutableListField<pbandk.wkt.Option>,
    override var jsonName: String,
    override var defaultValue: String,
) : pbandk.wkt.MutableField, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Field>() {
    override val descriptor get() = pbandk.wkt.Field.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableField.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
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
    ): pbandk.wkt.Field = throw UnsupportedOperationException()

    fun toField() = Field_Impl(
        kind = kind,
        cardinality = cardinality,
        number = number,
        name = name,
        typeUrl = typeUrl,
        oneofIndex = oneofIndex,
        packed = packed,
        options = options.toListField(),
        jsonName = jsonName,
        defaultValue = defaultValue,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Enum { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Enum"],
        expression = "Enum {\nthis.name = name\nthis.enumvalue += enumvalue\nthis.options += options\nthis.sourceContext = sourceContext\nthis.syntax = syntax\nthis.edition = edition\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Enum(
    name: String = "",
    enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
    options: List<pbandk.wkt.Option> = emptyList(),
    sourceContext: pbandk.wkt.SourceContext? = null,
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    edition: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Enum = pbandk.wkt.Enum {
    this.name = name
    this.enumvalue += enumvalue
    this.options += options
    this.sourceContext = sourceContext
    this.syntax = syntax
    this.edition = edition
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnum] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnum")
public fun Enum(builderAction: pbandk.wkt.MutableEnum.() -> Unit): pbandk.wkt.Enum =
    pbandk.wkt.MutableEnum_Impl(
        name = "",
        enumvalue = pbandk.gen.MutableListField(pbandk.wkt.Enum.FieldDescriptors.enumvalue),
        options = pbandk.gen.MutableListField(pbandk.wkt.Enum.FieldDescriptors.options),
        sourceContext = null,
        syntax = pbandk.wkt.Syntax.fromValue(0),
        edition = "",
    ).also(builderAction).toEnum()

@pbandk.Export
@pbandk.JsName("orDefaultForEnum")
public fun Enum?.orDefault(): pbandk.wkt.Enum = this ?: pbandk.wkt.Enum.defaultInstance

private class Enum_Impl(
    override val name: String,
    override val enumvalue: pbandk.gen.ListField<pbandk.wkt.EnumValue>,
    override val options: pbandk.gen.ListField<pbandk.wkt.Option>,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val syntax: pbandk.wkt.Syntax,
    override val edition: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Enum, pbandk.gen.GeneratedMessage<pbandk.wkt.Enum>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Enum.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        enumvalue: List<pbandk.wkt.EnumValue>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        edition: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.Enum = pbandk.wkt.Enum {
        this.name = name
        this.enumvalue += enumvalue
        this.options += options
        this.sourceContext = sourceContext
        this.syntax = syntax
        this.edition = edition
        this.unknownFields += unknownFields
    }
}

private class MutableEnum_Impl(
    override var name: String,
    override val enumvalue: pbandk.gen.MutableListField<pbandk.wkt.EnumValue>,
    override val options: pbandk.gen.MutableListField<pbandk.wkt.Option>,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var syntax: pbandk.wkt.Syntax,
    override var edition: String,
) : pbandk.wkt.MutableEnum, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Enum>() {
    override val descriptor get() = pbandk.wkt.Enum.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnum.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        enumvalue: List<pbandk.wkt.EnumValue>,
        options: List<pbandk.wkt.Option>,
        sourceContext: pbandk.wkt.SourceContext?,
        syntax: pbandk.wkt.Syntax,
        edition: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.Enum = throw UnsupportedOperationException()

    fun toEnum() = Enum_Impl(
        name = name,
        enumvalue = enumvalue.toListField(),
        options = options.toListField(),
        sourceContext = sourceContext,
        syntax = syntax,
        edition = edition,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use EnumValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumValue"],
        expression = "EnumValue {\nthis.name = name\nthis.number = number\nthis.options += options\nthis.unknownFields += unknownFields\n}",
    )
)
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

/**
 * The [MutableEnumValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumValue")
public fun EnumValue(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit): pbandk.wkt.EnumValue =
    pbandk.wkt.MutableEnumValue_Impl(
        name = "",
        number = 0,
        options = pbandk.gen.MutableListField(pbandk.wkt.EnumValue.FieldDescriptors.options),
    ).also(builderAction).toEnumValue()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValue")
public fun EnumValue?.orDefault(): pbandk.wkt.EnumValue = this ?: pbandk.wkt.EnumValue.defaultInstance

private class EnumValue_Impl(
    override val name: String,
    override val number: Int,
    override val options: pbandk.gen.ListField<pbandk.wkt.Option>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumValue, pbandk.gen.GeneratedMessage<pbandk.wkt.EnumValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.EnumValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        number: Int,
        options: List<pbandk.wkt.Option>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumValue = pbandk.wkt.EnumValue {
        this.name = name
        this.number = number
        this.options += options
        this.unknownFields += unknownFields
    }
}

private class MutableEnumValue_Impl(
    override var name: String,
    override var number: Int,
    override val options: pbandk.gen.MutableListField<pbandk.wkt.Option>,
) : pbandk.wkt.MutableEnumValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.EnumValue>() {
    override val descriptor get() = pbandk.wkt.EnumValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEnumValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        number: Int,
        options: List<pbandk.wkt.Option>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.EnumValue = throw UnsupportedOperationException()

    fun toEnumValue() = EnumValue_Impl(
        name = name,
        number = number,
        options = options.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Option { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Option"],
        expression = "Option {\nthis.name = name\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Option(
    name: String = "",
    value: pbandk.wkt.Any? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Option = pbandk.wkt.Option {
    this.name = name
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildOption")
public fun Option(builderAction: pbandk.wkt.MutableOption.() -> Unit): pbandk.wkt.Option =
    pbandk.wkt.MutableOption_Impl(
        name = "",
        value = null,
    ).also(builderAction).toOption()

@pbandk.Export
@pbandk.JsName("orDefaultForOption")
public fun Option?.orDefault(): pbandk.wkt.Option = this ?: pbandk.wkt.Option.defaultInstance

private class Option_Impl(
    override val name: String,
    override val value: pbandk.wkt.Any?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Option, pbandk.gen.GeneratedMessage<pbandk.wkt.Option>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Option.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        value: pbandk.wkt.Any?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.Option = pbandk.wkt.Option {
        this.name = name
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableOption_Impl(
    override var name: String,
    override var value: pbandk.wkt.Any?,
) : pbandk.wkt.MutableOption, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Option>() {
    override val descriptor get() = pbandk.wkt.Option.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableOption.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        value: pbandk.wkt.Any?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.Option = throw UnsupportedOperationException()

    fun toOption() = Option_Impl(
        name = name,
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

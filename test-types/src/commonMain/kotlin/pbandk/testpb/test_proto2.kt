@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface MessageWithRequiredField : pbandk.Message {
    public val foo: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithRequiredField
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField>

    /**
     * The [MutableMessageWithRequiredField] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit): pbandk.testpb.MessageWithRequiredField

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        foo: Boolean = this.foo,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithRequiredField

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val foo: pbandk.FieldDescriptor<pbandk.testpb.MessageWithRequiredField, Boolean> =
            pbandk.FieldDescriptor.ofRequired(
                messageDescriptor = pbandk.testpb.MessageWithRequiredField::descriptor,
                messageMetadata = pbandk.testpb.MessageWithRequiredField.messageMetadata,
                name = "foo",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "foo",
                value = pbandk.testpb.MessageWithRequiredField::foo,
                mutableValue = pbandk.testpb.MutableMessageWithRequiredField::foo,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithRequiredField>() {
        override val defaultInstance: pbandk.testpb.MessageWithRequiredField
            get() = throw UnsupportedOperationException("Messages with required fields don't have a default instance")

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "testpb.MessageWithRequiredField",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MessageWithRequiredField::class,
                messageCompanion = this,
                builder = ::MessageWithRequiredField,
                fields = listOf(
                    pbandk.testpb.MessageWithRequiredField.FieldDescriptors.foo,
                ),
            )
        }
    }
}

public sealed interface MutableMessageWithRequiredField : pbandk.testpb.MessageWithRequiredField, pbandk.MutableMessage<pbandk.testpb.MessageWithRequiredField> {
    public override var foo: Boolean
}

public sealed interface MessageWithEnum : pbandk.Message {
    public val value: pbandk.testpb.MessageWithEnum.EnumType?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithEnum
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithEnum>

    /**
     * The [MutableMessageWithEnum] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit): pbandk.testpb.MessageWithEnum

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: pbandk.testpb.MessageWithEnum.EnumType? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithEnum

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.testpb.MessageWithEnum, pbandk.testpb.MessageWithEnum.EnumType?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MessageWithEnum::descriptor,
                messageMetadata = pbandk.testpb.MessageWithEnum.messageMetadata,
                name = "value",
                number = 1,
                valueType = pbandk.types.enum(pbandk.testpb.MessageWithEnum.EnumType),
                jsonName = "value",
                value = pbandk.testpb.MessageWithEnum::value,
                mutableValue = pbandk.testpb.MutableMessageWithEnum::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithEnum>() {
        override val defaultInstance: pbandk.testpb.MessageWithEnum by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MessageWithEnum {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "testpb.MessageWithEnum",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithEnum> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MessageWithEnum::class,
                messageCompanion = this,
                builder = ::MessageWithEnum,
                fields = listOf(
                    pbandk.testpb.MessageWithEnum.FieldDescriptors.value,
                ),
            )
        }
    }

    public sealed interface EnumType : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.testpb.MessageWithEnum.EnumType>
            get() = pbandk.testpb.MessageWithEnum.EnumType.descriptor

        public object FOO : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.testpb.MessageWithEnum.EnumType>(
            value = 0,
            name = "FOO",
        )
        public object BAR : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.testpb.MessageWithEnum.EnumType>(
            value = 1,
            name = "BAR",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : EnumType, pbandk.gen.UnrecognizedEnumValue<pbandk.testpb.MessageWithEnum.EnumType>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.MessageWithEnum.EnumType> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.testpb.MessageWithEnum.EnumType> =
                pbandk.EnumDescriptor.of(
                    fullName = "testpb.MessageWithEnum.EnumType",
                    enumClass = pbandk.testpb.MessageWithEnum.EnumType::class,
                    enumCompanion = this,
                )
            public val values: List<MessageWithEnum.EnumType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(FOO, BAR)
            }

            override fun fromValue(value: Int): pbandk.testpb.MessageWithEnum.EnumType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.testpb.MessageWithEnum.EnumType =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableMessageWithEnum : pbandk.testpb.MessageWithEnum, pbandk.MutableMessage<pbandk.testpb.MessageWithEnum> {
    public override var value: pbandk.testpb.MessageWithEnum.EnumType?
}

@Deprecated(
    message = "Use MessageWithRequiredField { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageWithRequiredField"],
        expression = "MessageWithRequiredField {\nthis.foo = foo\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageWithRequiredField(
    foo: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithRequiredField = pbandk.testpb.MessageWithRequiredField {
    this.foo = foo
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageWithRequiredField] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithRequiredField")
public fun MessageWithRequiredField(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit): pbandk.testpb.MessageWithRequiredField =
    pbandk.testpb.MutableMessageWithRequiredField_Impl(
    ).also(builderAction).toMessageWithRequiredField()

private class MessageWithRequiredField_Impl(
    override val foo: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithRequiredField, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithRequiredField>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithRequiredField.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foo: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MessageWithRequiredField {
        this.foo = foo
        this.unknownFields += unknownFields
    }
}

private class MutableMessageWithRequiredField_Impl(
) : pbandk.testpb.MutableMessageWithRequiredField, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithRequiredField>() {
    private var hasFoo = false
    override var foo: Boolean = false
        get() = if (hasFoo) field else throw IllegalStateException("Property 'foo' should be initialized before get")
        set(value) { field = value; hasFoo = true }

    override val descriptor get() = pbandk.testpb.MessageWithRequiredField.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foo: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageWithRequiredField() = MessageWithRequiredField_Impl(
        foo = if (hasFoo) {
            foo
        } else {
            throw pbandk.InvalidProtocolBufferException.missingRequiredField("foo")
        },
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MessageWithEnum { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageWithEnum"],
        expression = "MessageWithEnum {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageWithEnum(
    value: pbandk.testpb.MessageWithEnum.EnumType? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithEnum = pbandk.testpb.MessageWithEnum {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageWithEnum] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithEnum")
public fun MessageWithEnum(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit): pbandk.testpb.MessageWithEnum =
    pbandk.testpb.MutableMessageWithEnum_Impl(
        value = null,
    ).also(builderAction).toMessageWithEnum()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithEnum")
public fun MessageWithEnum?.orDefault(): pbandk.testpb.MessageWithEnum = this ?: pbandk.testpb.MessageWithEnum.defaultInstance

private class MessageWithEnum_Impl(
    override val value: pbandk.testpb.MessageWithEnum.EnumType?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithEnum, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithEnum>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithEnum.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.MessageWithEnum.EnumType?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MessageWithEnum {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableMessageWithEnum_Impl(
    override var value: pbandk.testpb.MessageWithEnum.EnumType?,
) : pbandk.testpb.MutableMessageWithEnum, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithEnum>() {
    override val descriptor get() = pbandk.testpb.MessageWithEnum.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.MessageWithEnum.EnumType?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageWithEnum() = MessageWithEnum_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

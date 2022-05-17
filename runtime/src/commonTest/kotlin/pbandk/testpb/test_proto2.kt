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
            throw pbandk.InvalidProtocolBufferException("Required field 'foo' was not set.")
        },
        unknownFields = unknownFields.toMap()
    )
}

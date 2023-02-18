@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Any : pbandk.Message {
    public val typeUrl: String
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Any
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any>

    /**
     * The [MutableAny] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit): pbandk.wkt.Any

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        typeUrl: String = this.typeUrl,
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Any

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val typeUrl: pbandk.FieldDescriptor<pbandk.wkt.Any, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Any::descriptor,
                messageMetadata = pbandk.wkt.Any.messageMetadata,
                name = "type_url",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "typeUrl",
                value = pbandk.wkt.Any::typeUrl,
                mutableValue = pbandk.wkt.MutableAny::typeUrl,
            )
        public val value: pbandk.FieldDescriptor<pbandk.wkt.Any, pbandk.ByteArr> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Any::descriptor,
                messageMetadata = pbandk.wkt.Any.messageMetadata,
                name = "value",
                number = 2,
                valueType = pbandk.types.bytes(),
                jsonName = "value",
                value = pbandk.wkt.Any::value,
                mutableValue = pbandk.wkt.MutableAny::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        override val defaultInstance: pbandk.wkt.Any by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Any {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Any",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Any::class,
                messageCompanion = this,
                builder = ::Any,
                fields = listOf(
                    pbandk.wkt.Any.FieldDescriptors.typeUrl,
                    pbandk.wkt.Any.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableAny : pbandk.wkt.Any, pbandk.MutableMessage<pbandk.wkt.Any> {
    public override var typeUrl: String
    public override var value: pbandk.ByteArr
}

@Deprecated(
    message = "Use Any { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Any"],
        expression = "Any {\nthis.typeUrl = typeUrl\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Any(
    typeUrl: String = "",
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Any = pbandk.wkt.Any {
    this.typeUrl = typeUrl
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableAny] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildAny")
public fun Any(builderAction: pbandk.wkt.MutableAny.() -> Unit): pbandk.wkt.Any =
    pbandk.wkt.MutableAny_Impl(
        typeUrl = "",
        value = pbandk.ByteArr.empty,
    ).also(builderAction).toAny()

@pbandk.Export
@pbandk.JsName("orDefaultForAny")
public fun Any?.orDefault(): pbandk.wkt.Any = this ?: pbandk.wkt.Any.defaultInstance

private class Any_Impl(
    override val typeUrl: String,
    override val value: pbandk.ByteArr,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Any, pbandk.gen.GeneratedMessage<pbandk.wkt.Any>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Any.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        typeUrl: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Any {
        this.typeUrl = typeUrl
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableAny_Impl(
    override var typeUrl: String,
    override var value: pbandk.ByteArr,
) : pbandk.wkt.MutableAny, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Any>() {
    override val descriptor get() = pbandk.wkt.Any.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        typeUrl: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toAny() = Any_Impl(
        typeUrl = typeUrl,
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

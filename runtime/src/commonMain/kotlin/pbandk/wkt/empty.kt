@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Empty : pbandk.Message {

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Empty
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty>

    /**
     * The [MutableEmpty] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.Empty

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Empty

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        override val defaultInstance: pbandk.wkt.Empty by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Empty {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Empty",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Empty::class,
                messageCompanion = this,
                builder = ::Empty,
            )
        }
    }
}

public sealed interface MutableEmpty : pbandk.wkt.Empty, pbandk.MutableMessage<pbandk.wkt.Empty> {
}

@Deprecated(
    message = "Use Empty { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Empty"],
        expression = "Empty {\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Empty(
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Empty = pbandk.wkt.Empty {
    this.unknownFields += unknownFields
}

/**
 * The [MutableEmpty] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEmpty")
public fun Empty(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.Empty =
    pbandk.wkt.MutableEmpty_Impl(
    ).also(builderAction).toEmpty()

@pbandk.Export
@pbandk.JsName("orDefaultForEmpty")
public fun Empty?.orDefault(): pbandk.wkt.Empty = this ?: pbandk.wkt.Empty.defaultInstance

private class Empty_Impl(
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Empty, pbandk.gen.GeneratedMessage<pbandk.wkt.Empty>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Empty.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Empty {
        this.unknownFields += unknownFields
    }
}

private class MutableEmpty_Impl(
) : pbandk.wkt.MutableEmpty, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Empty>() {
    override val descriptor get() = pbandk.wkt.Empty.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toEmpty() = Empty_Impl(
        unknownFields = unknownFields.toMap()
    )
}

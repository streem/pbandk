@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface SourceContext : pbandk.Message {
    public val fileName: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext>

    /**
     * The [MutableSourceContext] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.SourceContext

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        fileName: String = this.fileName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.SourceContext

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val fileName: pbandk.FieldDescriptor<pbandk.wkt.SourceContext, String> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.SourceContext::descriptor,
                name = "file_name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "fileName",
                value = pbandk.wkt.SourceContext::fileName,
                mutableValue = pbandk.wkt.MutableSourceContext::fileName,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        public val defaultInstance: pbandk.wkt.SourceContext by lazy { pbandk.wkt.SourceContext {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.SourceContext",
                messageClass = pbandk.wkt.SourceContext::class,
                messageCompanion = this,
                builder = ::SourceContext,
                fields = listOf(
                    pbandk.wkt.SourceContext.FieldDescriptors.fileName,
                ),
            )
        }
    }
}

public sealed interface MutableSourceContext : pbandk.wkt.SourceContext, pbandk.MutableMessage<pbandk.wkt.SourceContext> {
    public override var fileName: String
}

@Deprecated(
    message = "Use SourceContext { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.SourceContext"],
        expression = "SourceContext {\nthis.fileName = fileName\nthis.unknownFields += unknownFields\n}",
    )
)
public fun SourceContext(
    fileName: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext {
    this.fileName = fileName
    this.unknownFields += unknownFields
}

/**
 * The [MutableSourceContext] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildSourceContext")
public fun SourceContext(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.SourceContext = pbandk.wkt.MutableSourceContext_Impl(
    fileName = "",
).also(builderAction).toSourceContext()

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): pbandk.wkt.SourceContext = this ?: pbandk.wkt.SourceContext.defaultInstance

private class SourceContext_Impl(
    override val fileName: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceContext, pbandk.gen.GeneratedMessage<pbandk.wkt.SourceContext>(unknownFields) {
    override val descriptor get() = pbandk.wkt.SourceContext.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.SourceContext {
        this.fileName = fileName
        this.unknownFields += unknownFields
    }
}

private class MutableSourceContext_Impl(
    override var fileName: String,
) : pbandk.wkt.MutableSourceContext, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.SourceContext>() {
    override val descriptor get() = pbandk.wkt.SourceContext.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toSourceContext() = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields.toMap()
    )
}

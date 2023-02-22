@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface FieldMask : pbandk.Message {
    public val paths: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldMask
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask>

    /**
     * The [MutableFieldMask] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit): pbandk.wkt.FieldMask

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        paths: List<String> = this.paths,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FieldMask

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val paths: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FieldMask, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.FieldMask::descriptor,
                messageMetadata = pbandk.wkt.FieldMask.messageMetadata,
                name = "paths",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "paths",
                value = pbandk.wkt.FieldMask::paths,
                mutableValue = pbandk.wkt.MutableFieldMask::paths,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldMask>() {
        override val defaultInstance: pbandk.wkt.FieldMask by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.FieldMask {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.FieldMask",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.FieldMask::class,
                messageCompanion = this,
                builder = ::FieldMask,
                fields = listOf(
                    pbandk.wkt.FieldMask.FieldDescriptors.paths,
                ),
            )
        }
    }
}

public sealed interface MutableFieldMask : pbandk.wkt.FieldMask, pbandk.MutableMessage<pbandk.wkt.FieldMask> {
    public override val paths: MutableList<String>
}

@Deprecated(
    message = "Use FieldMask { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FieldMask"],
        expression = "FieldMask {\nthis.paths += paths\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FieldMask(
    paths: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FieldMask = pbandk.wkt.FieldMask {
    this.paths += paths
    this.unknownFields += unknownFields
}

/**
 * The [MutableFieldMask] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldMask")
public fun FieldMask(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit): pbandk.wkt.FieldMask =
    pbandk.wkt.MutableFieldMask_Impl(
        paths = pbandk.gen.MutableListField(pbandk.wkt.FieldMask.FieldDescriptors.paths),
    ).also(builderAction).toFieldMask()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldMask")
public fun FieldMask?.orDefault(): pbandk.wkt.FieldMask = this ?: pbandk.wkt.FieldMask.defaultInstance

private class FieldMask_Impl(
    override val paths: pbandk.gen.ListField<String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldMask, pbandk.gen.GeneratedMessage<pbandk.wkt.FieldMask>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FieldMask.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        paths: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FieldMask {
        this.paths += paths
        this.unknownFields += unknownFields
    }
}

private class MutableFieldMask_Impl(
    override val paths: pbandk.gen.MutableListField<String>,
) : pbandk.wkt.MutableFieldMask, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FieldMask>() {
    override val descriptor get() = pbandk.wkt.FieldMask.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        paths: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFieldMask() = FieldMask_Impl(
        paths = paths.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

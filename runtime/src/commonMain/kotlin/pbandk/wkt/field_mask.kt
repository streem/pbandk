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

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldMask> {
        public val defaultInstance: pbandk.wkt.FieldMask by lazy { pbandk.wkt.FieldMask {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldMask, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "paths",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "paths",
                        value = pbandk.wkt.FieldMask::paths,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldMask",
                messageClass = pbandk.wkt.FieldMask::class,
                messageCompanion = this,
                builder = ::FieldMask,
                fields = fieldsList
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
public fun FieldMask(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit): pbandk.wkt.FieldMask = pbandk.wkt.MutableFieldMask_Impl(
    paths = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFieldMask()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldMask")
public fun FieldMask?.orDefault(): pbandk.wkt.FieldMask = this ?: pbandk.wkt.FieldMask.defaultInstance

private class FieldMask_Impl(
    override val paths: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldMask, pbandk.gen.GeneratedMessage<pbandk.wkt.FieldMask>() {
    override val descriptor get() = pbandk.wkt.FieldMask.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit) = pbandk.wkt.FieldMask {
        this.paths += this@FieldMask_Impl.paths
        this.unknownFields += this@FieldMask_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        paths: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FieldMask {
        this.paths += paths
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFieldMask_Impl(
    override val paths: MutableList<String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFieldMask, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FieldMask>() {
    override val descriptor get() = pbandk.wkt.FieldMask.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFieldMask.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        paths: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFieldMask() = FieldMask_Impl(
        paths = paths.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FieldMask.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FieldMask {
    if (other !is pbandk.wkt.FieldMask) return this

    return copy {
        paths += other.paths
        unknownFields += other.unknownFields
    }
}

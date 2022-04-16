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

    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        public val defaultInstance: pbandk.wkt.Empty by lazy { pbandk.wkt.Empty {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Empty = pbandk.wkt.Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Empty, *>>(0)
            fieldsList.apply {
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Empty",
                messageClass = pbandk.wkt.Empty::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableEmpty : pbandk.wkt.Empty, pbandk.MutableMessage {
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
public fun Empty(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.Empty = pbandk.wkt.MutableEmpty_Impl(
    unknownFields = mutableMapOf()
).also(builderAction).toEmpty()

@pbandk.Export
@pbandk.JsName("orDefaultForEmpty")
public fun Empty?.orDefault(): pbandk.wkt.Empty = this ?: pbandk.wkt.Empty.defaultInstance

private class Empty_Impl(
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Empty, pbandk.GeneratedMessage<pbandk.wkt.Empty>() {
    override val descriptor get() = pbandk.wkt.Empty.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit) = pbandk.wkt.Empty {
        this.unknownFields += this@Empty_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Empty {
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableEmpty_Impl(
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEmpty, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEmpty>() {
    override val descriptor get() = pbandk.wkt.Empty.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEmpty() = Empty_Impl(
        unknownFields = unknownFields.toMap()
    )
}

private fun Empty.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Empty {
    if (other !is pbandk.wkt.Empty) return this

    return copy {
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return Empty_Impl(unknownFields)
}

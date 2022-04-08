@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Empty : pbandk.Message {

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Empty
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty>

    public fun toMutableEmpty(): MutableEmpty

    /**
     * The [MutableEmpty] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableEmpty.() -> Unit): Empty

    @Deprecated("Use copy {} instead")
    public fun copy(
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Empty

    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.Empty by lazy { pbandk.wkt.Empty() }
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

public sealed interface MutableEmpty : Empty, pbandk.MutableMessage {

    public fun toEmpty(): Empty

    public override fun copy(builderAction: MutableEmpty.() -> Unit): MutableEmpty

    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Empty = pbandk.wkt.Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> get() = pbandk.wkt.Empty.descriptor
    }
}
@Deprecated("Use Empty { } instead")
public fun Empty(
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Empty = Empty {
    this.unknownFields.putAll(unknownFields)
}

@Deprecated("Use Empty { } instead")
public fun MutableEmpty(
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MutableEmpty = MutableEmpty_Impl(
    unknownFields = unknownFields.toMutableMap()
)

/**
 * The [MutableEmpty] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Empty(builderAction: MutableEmpty.() -> Unit): Empty {
    @Suppress("DEPRECATION") val builder = MutableEmpty()
    builder.builderAction()
    return builder.toEmpty()
}

@pbandk.Export
@pbandk.JsName("orDefaultForEmpty")
public fun Empty?.orDefault(): pbandk.wkt.Empty = this ?: Empty.defaultInstance

private class Empty_Impl(
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Empty, pbandk.GeneratedMessage<Empty>() {
    override val descriptor get() = Empty.descriptor

    override fun copy(builderAction: MutableEmpty.() -> Unit) =
        toMutableEmpty().apply(builderAction).toEmpty()

    @Deprecated("Use copy {} instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Empty_Impl(
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Empty)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableEmpty() = MutableEmpty_Impl(
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableEmpty_Impl(
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableEmpty, pbandk.MutableGeneratedMessage<MutableEmpty>() {
    override val descriptor get() = Empty.descriptor

    override fun copy(builderAction: MutableEmpty.() -> Unit) =
        toMutableEmpty().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Empty_Impl(
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Empty)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEmpty() = Empty_Impl(
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableEmpty() = this
}

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    @Suppress("DEPRECATION")
    return Empty(unknownFields)
}

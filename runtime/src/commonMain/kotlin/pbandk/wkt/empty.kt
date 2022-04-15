@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Empty : pbandk.Message {

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Empty
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableEmpty(): pbandk.wkt.MutableEmpty

    /**
     * The [MutableEmpty] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.Empty

    @Deprecated("Use copy {} instead")
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

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toEmpty(): pbandk.wkt.Empty

    public override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.MutableEmpty

    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Empty = pbandk.wkt.Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> get() = pbandk.wkt.Empty.descriptor
    }
}

@Deprecated("Use Empty { } instead")
public fun Empty(
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Empty = pbandk.wkt.Empty {
    this.unknownFields += unknownFields
}

public fun MutableEmpty(): pbandk.wkt.MutableEmpty = pbandk.wkt.MutableEmpty_Impl(
    unknownFields = mutableMapOf()
)

/**
 * The [MutableEmpty] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Empty(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.Empty =
    pbandk.wkt.MutableEmpty().also(builderAction).toEmpty()

public fun MutableEmpty(builderAction: pbandk.wkt.MutableEmpty.() -> Unit): pbandk.wkt.MutableEmpty =
    pbandk.wkt.MutableEmpty().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForEmpty")
public fun Empty?.orDefault(): pbandk.wkt.Empty = this ?: pbandk.wkt.Empty.defaultInstance

private class Empty_Impl(
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Empty, pbandk.GeneratedMessage<pbandk.wkt.Empty>() {
    override val descriptor get() = pbandk.wkt.Empty.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit) =
        toMutableEmpty().apply(builderAction).toEmpty()

    @Deprecated("Use copy {} instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Empty)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableEmpty() = pbandk.wkt.MutableEmpty {
        this.unknownFields += this@Empty_Impl.unknownFields
    }
}

private class MutableEmpty_Impl(
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEmpty, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEmpty>() {
    override val descriptor get() = pbandk.wkt.Empty.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEmpty.() -> Unit) =
        toMutableEmpty().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.unknownFields += unknownFields
    }.toEmpty()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Empty)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEmpty() = Empty_Impl(
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableEmpty() = pbandk.wkt.MutableEmpty {
        this.unknownFields += this@MutableEmpty_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return Empty_Impl(unknownFields)
}

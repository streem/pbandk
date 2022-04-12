@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface FieldMask : pbandk.Message {
    public val paths: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldMask
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableFieldMask(): MutableFieldMask

    /**
     * The [MutableFieldMask] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableFieldMask.() -> Unit): FieldMask

    @Deprecated("Use copy {} instead")
    public fun copy(
        paths: List<String> = this.paths,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FieldMask

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldMask> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.FieldMask by lazy { pbandk.wkt.FieldMask {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldMask = pbandk.wkt.FieldMask.decodeWithImpl(u)

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
                        value = pbandk.wkt.FieldMask::paths
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldMask",
                messageClass = pbandk.wkt.FieldMask::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFieldMask : FieldMask, pbandk.MutableMessage {
    public override var paths: List<String>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toFieldMask(): FieldMask

    public override fun copy(builderAction: MutableFieldMask.() -> Unit): MutableFieldMask

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldMask> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldMask = pbandk.wkt.FieldMask.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask> get() = pbandk.wkt.FieldMask.descriptor
    }
}

@Deprecated("Use FieldMask { } instead")
public fun FieldMask(
    paths: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FieldMask = FieldMask {
    this.paths = paths
    this.unknownFields.putAll(unknownFields)
}

public fun MutableFieldMask(): MutableFieldMask = MutableFieldMask_Impl(
    paths = emptyList(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableFieldMask] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun FieldMask(builderAction: MutableFieldMask.() -> Unit): FieldMask =
    MutableFieldMask().also(builderAction).toFieldMask()

public fun MutableFieldMask(builderAction: MutableFieldMask.() -> Unit): MutableFieldMask =
    MutableFieldMask().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFieldMask")
public fun FieldMask?.orDefault(): pbandk.wkt.FieldMask = this ?: FieldMask.defaultInstance

private class FieldMask_Impl(
    override val paths: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FieldMask, pbandk.GeneratedMessage<FieldMask>() {
    override val descriptor get() = FieldMask.descriptor

    override fun copy(builderAction: MutableFieldMask.() -> Unit) =
        toMutableFieldMask().apply(builderAction).toFieldMask()

    @Deprecated("Use copy {} instead")
    override fun copy(
        paths: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.paths = paths
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? FieldMask)?.let {
        it.copy(
            paths = paths + other.paths,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableFieldMask() = MutableFieldMask_Impl(
        paths = paths,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableFieldMask_Impl(
    override var paths: List<String>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFieldMask, pbandk.MutableGeneratedMessage<MutableFieldMask>() {
    override val descriptor get() = FieldMask.descriptor

    override fun copy(builderAction: MutableFieldMask.() -> Unit) =
        toMutableFieldMask().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        paths: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.paths = paths
        this.unknownFields.putAll(unknownFields)
    }.toFieldMask()

    override operator fun plus(other: pbandk.Message?) = (other as? FieldMask)?.let {
        it.copy(
            paths = paths + other.paths,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFieldMask() = FieldMask_Impl(
        paths = paths,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableFieldMask() = MutableFieldMask_Impl(
        paths = paths,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun FieldMask.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldMask {
    var paths: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> paths = (paths ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return FieldMask_Impl(pbandk.ListWithSize.Builder.fixed(paths), unknownFields)
}

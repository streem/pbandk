@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface SourceContext : pbandk.Message {
    public val fileName: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableSourceContext(): MutableSourceContext

    /**
     * The [MutableSourceContext] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableSourceContext.() -> Unit): SourceContext

    @Deprecated("Use copy {} instead")
    public fun copy(
        fileName: String = this.fileName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.SourceContext

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.SourceContext by lazy { pbandk.wkt.SourceContext {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.SourceContext, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file_name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "fileName",
                        value = pbandk.wkt.SourceContext::fileName
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.SourceContext",
                messageClass = pbandk.wkt.SourceContext::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableSourceContext : SourceContext, pbandk.MutableMessage {
    public override var fileName: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toSourceContext(): SourceContext

    public override fun copy(builderAction: MutableSourceContext.() -> Unit): MutableSourceContext

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> get() = pbandk.wkt.SourceContext.descriptor
    }
}

@Deprecated("Use SourceContext { } instead")
public fun SourceContext(
    fileName: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.SourceContext = SourceContext {
    this.fileName = fileName
    this.unknownFields.putAll(unknownFields)
}

public fun MutableSourceContext(): MutableSourceContext = MutableSourceContext_Impl(
    fileName = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableSourceContext] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun SourceContext(builderAction: MutableSourceContext.() -> Unit): SourceContext =
    MutableSourceContext().also(builderAction).toSourceContext()

public fun MutableSourceContext(builderAction: MutableSourceContext.() -> Unit): MutableSourceContext =
    MutableSourceContext().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): pbandk.wkt.SourceContext = this ?: SourceContext.defaultInstance

private class SourceContext_Impl(
    override val fileName: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SourceContext, pbandk.GeneratedMessage<SourceContext>() {
    override val descriptor get() = SourceContext.descriptor

    override fun copy(builderAction: MutableSourceContext.() -> Unit) =
        toMutableSourceContext().apply(builderAction).toSourceContext()

    @Deprecated("Use copy {} instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.fileName = fileName
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? SourceContext)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableSourceContext() = MutableSourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableSourceContext_Impl(
    override var fileName: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSourceContext, pbandk.MutableGeneratedMessage<MutableSourceContext>() {
    override val descriptor get() = SourceContext.descriptor

    override fun copy(builderAction: MutableSourceContext.() -> Unit) =
        toMutableSourceContext().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.fileName = fileName
        this.unknownFields.putAll(unknownFields)
    }.toSourceContext()

    override operator fun plus(other: pbandk.Message?) = (other as? SourceContext)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSourceContext() = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableSourceContext() = MutableSourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun SourceContext.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceContext {
    var fileName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileName = _fieldValue as String
        }
    }
    return SourceContext_Impl(fileName, unknownFields)
}

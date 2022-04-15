@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed interface SourceContext : pbandk.Message {
    public val fileName: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableSourceContext(): pbandk.wkt.MutableSourceContext

    /**
     * The [MutableSourceContext] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.SourceContext

    @Deprecated("Use copy {} instead")
    public fun copy(
        fileName: String = this.fileName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.SourceContext

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
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

public sealed interface MutableSourceContext : pbandk.wkt.SourceContext, pbandk.MutableMessage {
    public override var fileName: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toSourceContext(): pbandk.wkt.SourceContext

    public override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.MutableSourceContext

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> get() = pbandk.wkt.SourceContext.descriptor
    }
}

@Deprecated("Use SourceContext { } instead")
public fun SourceContext(
    fileName: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext {
    this.fileName = fileName
    this.unknownFields += unknownFields
}

public fun MutableSourceContext(): pbandk.wkt.MutableSourceContext = pbandk.wkt.MutableSourceContext_Impl(
    fileName = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableSourceContext] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun SourceContext(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.SourceContext =
    pbandk.wkt.MutableSourceContext().also(builderAction).toSourceContext()

public fun MutableSourceContext(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.MutableSourceContext =
    pbandk.wkt.MutableSourceContext().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): pbandk.wkt.SourceContext = this ?: pbandk.wkt.SourceContext.defaultInstance

private class SourceContext_Impl(
    override val fileName: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceContext, pbandk.GeneratedMessage<pbandk.wkt.SourceContext>() {
    override val descriptor get() = pbandk.wkt.SourceContext.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit) =
        toMutableSourceContext().apply(builderAction).toSourceContext()

    @Deprecated("Use copy {} instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.fileName = fileName
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.SourceContext)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableSourceContext() = pbandk.wkt.MutableSourceContext {
        this.fileName = this@SourceContext_Impl.fileName
        this.unknownFields += this@SourceContext_Impl.unknownFields
    }
}

private class MutableSourceContext_Impl(
    override var fileName: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableSourceContext, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableSourceContext>() {
    override val descriptor get() = pbandk.wkt.SourceContext.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit) =
        toMutableSourceContext().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.fileName = fileName
        this.unknownFields += unknownFields
    }.toSourceContext()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.SourceContext)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSourceContext() = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableSourceContext() = pbandk.wkt.MutableSourceContext {
        this.fileName = this@MutableSourceContext_Impl.fileName
        this.unknownFields += this@MutableSourceContext_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SourceContext.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.SourceContext {
    var fileName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileName = _fieldValue as String
        }
    }
    return SourceContext_Impl(fileName, unknownFields)
}

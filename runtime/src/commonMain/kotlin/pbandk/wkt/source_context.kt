@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed interface SourceContext : pbandk.Message {
    public val fileName: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext>

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

@pbandk.Export
public sealed interface MutableSourceContext : pbandk.wkt.SourceContext, pbandk.MutableMessage {
    public override var fileName: String
}

@Deprecated("Use SourceContext { } instead")
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
public fun SourceContext(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit): pbandk.wkt.SourceContext = pbandk.wkt.MutableSourceContext_Impl(
    fileName = "",
    unknownFields = mutableMapOf()
).also(builderAction).toSourceContext()

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): pbandk.wkt.SourceContext = this ?: pbandk.wkt.SourceContext.defaultInstance

private class SourceContext_Impl(
    override val fileName: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceContext, pbandk.GeneratedMessage<pbandk.wkt.SourceContext>() {
    override val descriptor get() = pbandk.wkt.SourceContext.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit) = pbandk.wkt.SourceContext {
        this.fileName = this@SourceContext_Impl.fileName
        this.unknownFields += this@SourceContext_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.SourceContext {
        this.fileName = fileName
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSourceContext_Impl(
    override var fileName: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableSourceContext, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableSourceContext>() {
    override val descriptor get() = pbandk.wkt.SourceContext.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableSourceContext.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSourceContext() = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields.toMap()
    )
}

private fun SourceContext.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.SourceContext {
    if (other !is pbandk.wkt.SourceContext) return this

    return copy {
        fileName = other.fileName
        unknownFields += other.unknownFields
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

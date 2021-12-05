@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface SourceContext : pbandk.Message {
    public val fileName: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext>

    public fun copy(
        fileName: String = this.fileName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.SourceContext

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        @Deprecated("Use sourceContext { } instead")
        public operator fun invoke(
            fileName: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.SourceContext = SourceContext_Impl(
            fileName = fileName,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.SourceContext by lazy { pbandk.wkt.SourceContext() }
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

    public fun toSourceContext(): SourceContext

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        @Deprecated("Use sourceContext { } instead")
        public operator fun invoke(
            fileName: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableSourceContext = MutableSourceContext_Impl(
            fileName = fileName,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableSourceContext by lazy { MutableSourceContext() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> get() = pbandk.wkt.SourceContext.descriptor
    }
}

public fun sourceContext(builderAction: MutableSourceContext.() -> Unit): SourceContext {
    @Suppress("DEPRECATION") val builder = MutableSourceContext()
    builder.builderAction()
    return builder.toSourceContext()
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): pbandk.wkt.SourceContext = this ?: SourceContext.defaultInstance

private class SourceContext_Impl(
    override val fileName: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SourceContext, pbandk.GeneratedMessage<SourceContext>() {
    override val descriptor get() = SourceContext.descriptor

    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SourceContext)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableSourceContext_Impl(
    override var fileName: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSourceContext, pbandk.MutableGeneratedMessage<MutableSourceContext>() {
    override val descriptor get() = SourceContext.descriptor

    override fun copy(
        fileName: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SourceContext)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSourceContext() = SourceContext_Impl(
        fileName = fileName,
        unknownFields = unknownFields
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
    @Suppress("DEPRECATION")
    return SourceContext(fileName, unknownFields)
}

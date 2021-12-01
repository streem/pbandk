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
        public operator fun invoke(
            fileName: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.SourceContext = SourceContext_Impl(
            fileName = fileName,
            unknownFields = unknownFields
        )

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

@Suppress("UNCHECKED_CAST")
private fun SourceContext.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceContext {
    var fileName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileName = _fieldValue as String
        }
    }
    return SourceContext(fileName, unknownFields)
}

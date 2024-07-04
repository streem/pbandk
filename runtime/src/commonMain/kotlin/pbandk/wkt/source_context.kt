@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class SourceContext(
    val fileName: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceContext = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        public val defaultInstance: pbandk.wkt.SourceContext by lazy { pbandk.wkt.SourceContext() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceContext = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.SourceContext",
            messageClass = pbandk.wkt.SourceContext::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): pbandk.wkt.SourceContext = this ?: SourceContext.defaultInstance

private fun SourceContext.protoMergeImpl(plus: pbandk.Message?): SourceContext = (plus as? SourceContext)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

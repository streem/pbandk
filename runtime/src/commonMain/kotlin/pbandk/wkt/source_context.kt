@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class SourceContext(
    val fileName: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.SourceContext> {
        val defaultInstance by lazy { pbandk.wkt.SourceContext() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceContext> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.SourceContext, *>>(1).apply {
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
                messageClass = pbandk.wkt.SourceContext::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun SourceContext?.orDefault() = this ?: SourceContext.defaultInstance

private fun SourceContext.protoMergeImpl(plus: pbandk.Message?): SourceContext = (plus as? SourceContext)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

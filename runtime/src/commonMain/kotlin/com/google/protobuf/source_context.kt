@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class SourceContext(
    val fileName: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.SourceContext = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.SourceContext> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.SourceContext> {
        public val defaultInstance: com.google.protobuf.SourceContext by lazy { com.google.protobuf.SourceContext() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.SourceContext = com.google.protobuf.SourceContext.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.SourceContext> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.SourceContext, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file_name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "fileName",
                        value = com.google.protobuf.SourceContext::fileName
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.SourceContext",
                messageClass = com.google.protobuf.SourceContext::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceContext")
public fun SourceContext?.orDefault(): com.google.protobuf.SourceContext = this ?: SourceContext.defaultInstance

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

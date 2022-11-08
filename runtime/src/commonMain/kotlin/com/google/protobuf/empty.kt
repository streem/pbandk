@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class Empty(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Empty = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Empty> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Empty> {
        public val defaultInstance: com.google.protobuf.Empty by lazy { com.google.protobuf.Empty() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Empty = com.google.protobuf.Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Empty> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Empty, *>>(0)
            fieldsList.apply {
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Empty",
                messageClass = com.google.protobuf.Empty::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEmpty")
public fun Empty?.orDefault(): com.google.protobuf.Empty = this ?: Empty.defaultInstance

private fun Empty.protoMergeImpl(plus: pbandk.Message?): Empty = (plus as? Empty)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }

    return Empty(unknownFields)
}

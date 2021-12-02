@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class Empty(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Empty = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        public val defaultInstance: pbandk.wkt.Empty by lazy { pbandk.wkt.Empty() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Empty = pbandk.wkt.Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Empty, *>>(0)
            fieldsList.apply {
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Empty",
                messageClass = pbandk.wkt.Empty::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEmpty")
public fun Empty?.orDefault(): pbandk.wkt.Empty = this ?: Empty.defaultInstance

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

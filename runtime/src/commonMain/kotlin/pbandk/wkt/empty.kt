@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Empty : pbandk.Message {

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Empty
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty>

    public fun copy(
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Empty

    public companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        public operator fun invoke(
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Empty = Empty_Impl(
            unknownFields = unknownFields
        )

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

private class Empty_Impl(
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Empty, pbandk.GeneratedMessage<Empty>() {
    override val descriptor get() = Empty.descriptor

    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Empty_Impl(
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Empty)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return Empty(unknownFields)
}

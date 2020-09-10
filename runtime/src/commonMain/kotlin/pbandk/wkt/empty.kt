@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class Empty(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Empty> {
        val defaultInstance by lazy { Empty() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Empty> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Empty::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

fun Empty?.orDefault() = this ?: Empty.defaultInstance

private fun Empty.protoMergeImpl(plus: pbandk.Message?): Empty = (plus as? Empty)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return Empty(unknownFields)
}

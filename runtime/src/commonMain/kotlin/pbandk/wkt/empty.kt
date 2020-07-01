@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class Empty(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Empty> {
        val defaultInstance by lazy { Empty() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = Empty.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> = emptyList()
    }
}

fun Empty?.orDefault() = this ?: Empty.defaultInstance

private fun Empty.protoMergeImpl(plus: pbandk.Message?): Empty = (plus as? Empty)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return Empty(unknownFields)
}

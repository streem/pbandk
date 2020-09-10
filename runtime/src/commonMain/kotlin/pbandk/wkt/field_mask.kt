@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class FieldMask(
    val paths: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FieldMask> {
        val defaultInstance by lazy { FieldMask() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FieldMask.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FieldMask> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FieldMask::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "paths",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "paths",
                        value = FieldMask::paths
                    )
                )
            )
        }
    }
}

fun FieldMask?.orDefault() = this ?: FieldMask.defaultInstance

private fun FieldMask.protoMergeImpl(plus: pbandk.Message?): FieldMask = (plus as? FieldMask)?.copy(
    paths = paths + plus.paths,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldMask.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldMask {
    var paths: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> paths = (paths ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return FieldMask(pbandk.ListWithSize.Builder.fixed(paths), unknownFields)
}

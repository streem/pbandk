@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class FieldMask(
    val paths: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldMask = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldMask> {
        public val defaultInstance: pbandk.wkt.FieldMask by lazy { pbandk.wkt.FieldMask() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldMask = pbandk.wkt.FieldMask.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldMask, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "paths",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "paths",
                        value = pbandk.wkt.FieldMask::paths
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldMask",
                messageClass = pbandk.wkt.FieldMask::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldMask")
public fun FieldMask?.orDefault(): pbandk.wkt.FieldMask = this ?: FieldMask.defaultInstance

private fun FieldMask.protoMergeImpl(plus: pbandk.Message?): FieldMask = (plus as? FieldMask)?.let {
    it.copy(
        paths = paths + plus.paths,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldMask.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldMask {
    var paths: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> paths = (paths ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return FieldMask(pbandk.ListWithSize.Builder.fixed(paths), unknownFields)
}

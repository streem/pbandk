@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class FieldMask(
    val paths: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FieldMask = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FieldMask> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FieldMask> {
        public val defaultInstance: com.google.protobuf.FieldMask by lazy { com.google.protobuf.FieldMask() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FieldMask = com.google.protobuf.FieldMask.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FieldMask> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FieldMask, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "paths",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "paths",
                        value = com.google.protobuf.FieldMask::paths
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldMask",
                messageClass = com.google.protobuf.FieldMask::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldMask")
public fun FieldMask?.orDefault(): com.google.protobuf.FieldMask = this ?: FieldMask.defaultInstance

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
            1 -> paths = (paths ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }

    return FieldMask(pbandk.ListWithSize.Builder.fixed(paths), unknownFields)
}

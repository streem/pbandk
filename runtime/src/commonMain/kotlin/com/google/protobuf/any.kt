@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class Any(
    val typeUrl: String = "",
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Any = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Any> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Any> {
        public val defaultInstance: com.google.protobuf.Any by lazy { com.google.protobuf.Any() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Any = com.google.protobuf.Any.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Any> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Any, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_url",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "typeUrl",
                        value = com.google.protobuf.Any::typeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = com.google.protobuf.Any::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Any",
                messageClass = com.google.protobuf.Any::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForAny")
public fun Any?.orDefault(): com.google.protobuf.Any = this ?: Any.defaultInstance

private fun Any.protoMergeImpl(plus: pbandk.Message?): Any = (plus as? Any)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Any.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> typeUrl = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }

    return Any(typeUrl, value, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public data class MessageWithRequiredField(
    val foo: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithRequiredField = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithRequiredField> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithRequiredField = pbandk.testpb.MessageWithRequiredField.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageWithRequiredField, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foo",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "foo",
                        value = pbandk.testpb.MessageWithRequiredField::foo
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithRequiredField",
                messageClass = pbandk.testpb.MessageWithRequiredField::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

private fun MessageWithRequiredField.protoMergeImpl(plus: pbandk.Message?): MessageWithRequiredField = (plus as? MessageWithRequiredField)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithRequiredField.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithRequiredField {
    var foo: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foo = _fieldValue as Boolean
        }
    }

    if (foo == null) {
        throw pbandk.InvalidProtocolBufferException.missingRequiredField("foo")
    }
    return MessageWithRequiredField(foo!!, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.examples.greeter.pb

@pbandk.Export
data class HelloRequest(
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.examples.greeter.pb.HelloRequest> {
        val defaultInstance by lazy { pbandk.examples.greeter.pb.HelloRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.examples.greeter.pb.HelloRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.greeter.pb.HelloRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.examples.greeter.pb.HelloRequest, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.examples.greeter.pb.HelloRequest::name
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.examples.greeter.pb.HelloRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
data class HelloReply(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.examples.greeter.pb.HelloReply> {
        val defaultInstance by lazy { pbandk.examples.greeter.pb.HelloReply() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.examples.greeter.pb.HelloReply.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.greeter.pb.HelloReply> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.examples.greeter.pb.HelloReply, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = pbandk.examples.greeter.pb.HelloReply::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.examples.greeter.pb.HelloReply::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForHelloRequest")
fun HelloRequest?.orDefault() = this ?: HelloRequest.defaultInstance

private fun HelloRequest.protoMergeImpl(plus: pbandk.Message?): HelloRequest = (plus as? HelloRequest)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun HelloRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): HelloRequest {
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
        }
    }
    return HelloRequest(name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForHelloReply")
fun HelloReply?.orDefault() = this ?: HelloReply.defaultInstance

private fun HelloReply.protoMergeImpl(plus: pbandk.Message?): HelloReply = (plus as? HelloReply)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun HelloReply.Companion.decodeWithImpl(u: pbandk.MessageDecoder): HelloReply {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }
    return HelloReply(message, unknownFields)
}

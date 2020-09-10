@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.examples.greeter.pb

data class HelloRequest(
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<HelloRequest> {
        val defaultInstance by lazy { HelloRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = HelloRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<HelloRequest> by lazy {
            pbandk.MessageDescriptor(
                messageClass = HelloRequest::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = HelloRequest::name
                    )
                )
            )
        }
    }
}

data class HelloReply(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<HelloReply> {
        val defaultInstance by lazy { HelloReply() }
        override fun decodeWith(u: pbandk.MessageDecoder) = HelloReply.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<HelloReply> by lazy {
            pbandk.MessageDescriptor(
                messageClass = HelloReply::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = HelloReply::message
                    )
                )
            )
        }
    }
}

fun HelloRequest?.orDefault() = this ?: HelloRequest.defaultInstance

private fun HelloRequest.protoMergeImpl(plus: pbandk.Message?): HelloRequest = (plus as? HelloRequest)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun HelloReply?.orDefault() = this ?: HelloReply.defaultInstance

private fun HelloReply.protoMergeImpl(plus: pbandk.Message?): HelloReply = (plus as? HelloReply)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

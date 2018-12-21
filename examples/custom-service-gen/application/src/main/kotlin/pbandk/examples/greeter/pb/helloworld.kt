package pbandk.examples.greeter.pb

data class HelloRequest(
    val name: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<HelloRequest> {
    override operator fun plus(other: HelloRequest?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<HelloRequest> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = HelloRequest.protoUnmarshalImpl(u)
    }
}

data class HelloReply(
    val message: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<HelloReply> {
    override operator fun plus(other: HelloReply?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<HelloReply> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = HelloReply.protoUnmarshalImpl(u)
    }
}

private fun HelloRequest.protoMergeImpl(plus: HelloRequest?): HelloRequest = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun HelloRequest.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun HelloRequest.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun HelloRequest.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): HelloRequest {
    var name = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return HelloRequest(name, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun HelloReply.protoMergeImpl(plus: HelloReply?): HelloReply = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun HelloReply.protoSizeImpl(): Int {
    var protoSize = 0
    if (message.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(message)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun HelloReply.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (message.isNotEmpty()) protoMarshal.writeTag(10).writeString(message)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun HelloReply.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): HelloReply {
    var message = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return HelloReply(message, protoUnmarshal.unknownFields())
        10 -> message = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

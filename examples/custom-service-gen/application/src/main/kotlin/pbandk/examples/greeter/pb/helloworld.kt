@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.examples.greeter.pb

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class HelloRequest(
    val name: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<HelloRequest> {
    override operator fun plus(other: HelloRequest?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<HelloRequest> {
        val defaultInstance by lazy { HelloRequest() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = HelloRequest.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = HelloRequest.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class HelloReply(
    val message: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<HelloReply> {
    override operator fun plus(other: HelloReply?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<HelloReply> {
        val defaultInstance by lazy { HelloReply() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = HelloReply.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = HelloReply.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("message")
        val message: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun HelloRequest?.orDefault() = this ?: HelloRequest.defaultInstance

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

private fun HelloRequest.toJsonMapperImpl(): HelloRequest.JsonMapper =
    HelloRequest.JsonMapper(
        name.takeIf { it != "" }
    )

private fun HelloRequest.JsonMapper.toMessageImpl(): HelloRequest =
    HelloRequest(
        name = name ?: ""
    )

private fun HelloRequest.jsonMarshalImpl(json: Json): String =
    json.stringify(HelloRequest.JsonMapper.serializer(), toJsonMapper())

private fun HelloRequest.Companion.jsonUnmarshalImpl(json: Json, data: String): HelloRequest {
    val mapper = json.parse(HelloRequest.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun HelloReply?.orDefault() = this ?: HelloReply.defaultInstance

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

private fun HelloReply.toJsonMapperImpl(): HelloReply.JsonMapper =
    HelloReply.JsonMapper(
        message.takeIf { it != "" }
    )

private fun HelloReply.JsonMapper.toMessageImpl(): HelloReply =
    HelloReply(
        message = message ?: ""
    )

private fun HelloReply.jsonMarshalImpl(json: Json): String =
    json.stringify(HelloReply.JsonMapper.serializer(), toJsonMapper())

private fun HelloReply.Companion.jsonUnmarshalImpl(json: Json, data: String): HelloReply {
    val mapper = json.parse(HelloReply.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

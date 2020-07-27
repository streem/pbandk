@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Any(
    val typeUrl: String = "",
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Any> {
    override operator fun plus(other: Any?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Any> {
        val defaultInstance by lazy { Any() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Any.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Any.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("type_url")
        val typeUrl: String? = null,
        @SerialName("value")
        val value: pbandk.ByteArr? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun Any?.orDefault() = this ?: Any.defaultInstance

private fun Any.protoMergeImpl(plus: Any?): Any = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Any.protoSizeImpl(): Int {
    var protoSize = 0
    if (typeUrl.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(typeUrl)
    if (value.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Any.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (typeUrl.isNotEmpty()) protoMarshal.writeTag(10).writeString(typeUrl)
    if (value.array.isNotEmpty()) protoMarshal.writeTag(18).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Any.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Any(typeUrl, value, protoUnmarshal.unknownFields())
        10 -> typeUrl = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Any.toJsonMapperImpl(): Any.JsonMapper =
    Any.JsonMapper(
        typeUrl.takeIf { it != "" },
        value
    )

private fun Any.JsonMapper.toMessageImpl(): Any =
    Any(
        typeUrl = typeUrl ?: "",
        value = value ?: pbandk.ByteArr.empty
    )

private fun Any.jsonMarshalImpl(json: Json): String =
    json.stringify(Any.JsonMapper.serializer(), toJsonMapper())

private fun Any.Companion.jsonUnmarshalImpl(json: Json, data: String): Any {
    val mapper = json.parse(Any.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

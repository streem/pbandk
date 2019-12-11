@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Empty(
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Empty> {
    override operator fun plus(other: Empty?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Empty> {
        val defaultInstance by lazy { Empty() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Empty.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Empty.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    class JsonMapper {
        fun toMessage() = toMessageImpl()
    }
}

fun Empty?.orDefault() = this ?: Empty.defaultInstance

private fun Empty.protoMergeImpl(plus: Empty?): Empty = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Empty.protoSizeImpl(): Int {
    var protoSize = 0
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Empty.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Empty.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Empty {
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Empty(protoUnmarshal.unknownFields())
        else -> protoUnmarshal.unknownField()
    }
}

private fun Empty.toJsonMapperImpl(): Empty.JsonMapper =
    Empty.JsonMapper(
    )

private fun Empty.JsonMapper.toMessageImpl(): Empty =
    Empty(
    )

private fun Empty.jsonMarshalImpl(json: Json): String =
    json.stringify(Empty.JsonMapper.serializer(), toJsonMapper())

private fun Empty.Companion.jsonUnmarshalImpl(json: Json, data: String): Empty {
    val mapper = json.parse(Empty.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

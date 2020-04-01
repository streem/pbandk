@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class FieldMask(
    val paths: List<String> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FieldMask> {
    override operator fun plus(other: FieldMask?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FieldMask> {
        val defaultInstance by lazy { FieldMask() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldMask.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FieldMask.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("paths")
        val paths: List<String> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun FieldMask?.orDefault() = this ?: FieldMask.defaultInstance

private fun FieldMask.protoMergeImpl(plus: FieldMask?): FieldMask = plus?.copy(
    paths = paths + plus.paths,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FieldMask.protoSizeImpl(): Int {
    var protoSize = 0
    if (paths.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * paths.size) + paths.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FieldMask.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (paths.isNotEmpty()) paths.forEach { protoMarshal.writeTag(10).writeString(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FieldMask.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FieldMask {
    var paths: pbandk.ListWithSize.Builder<String>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FieldMask(pbandk.ListWithSize.Builder.fixed(paths), protoUnmarshal.unknownFields())
        10 -> paths = protoUnmarshal.readRepeated(paths, protoUnmarshal::readString, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun FieldMask.toJsonMapperImpl(): FieldMask.JsonMapper =
    FieldMask.JsonMapper(
        paths
    )

private fun FieldMask.JsonMapper.toMessageImpl(): FieldMask =
    FieldMask(
        paths = paths ?: emptyList()
    )

private fun FieldMask.jsonMarshalImpl(json: Json): String =
    json.stringify(FieldMask.JsonMapper.serializer(), toJsonMapper())

private fun FieldMask.Companion.jsonUnmarshalImpl(json: Json, data: String): FieldMask {
    val mapper = json.parse(FieldMask.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Timestamp(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Timestamp> {
    override operator fun plus(other: Timestamp?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Timestamp> {
        val defaultInstance by lazy { Timestamp() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Timestamp.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Timestamp.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("seconds")
        val seconds: Long? = null,
        @SerialName("nanos")
        val nanos: Int? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun Timestamp?.orDefault() = this ?: Timestamp.defaultInstance

private fun Timestamp.protoMergeImpl(plus: Timestamp?): Timestamp = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Timestamp.protoSizeImpl(): Int {
    var protoSize = 0
    if (seconds != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(seconds)
    if (nanos != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(nanos)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Timestamp.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (seconds != 0L) protoMarshal.writeTag(8).writeInt64(seconds)
    if (nanos != 0) protoMarshal.writeTag(16).writeInt32(nanos)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Timestamp.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Timestamp {
    var seconds = 0L
    var nanos = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Timestamp(seconds, nanos, protoUnmarshal.unknownFields())
        8 -> seconds = protoUnmarshal.readInt64()
        16 -> nanos = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Timestamp.toJsonMapperImpl(): Timestamp.JsonMapper =
    Timestamp.JsonMapper(
        seconds,
        nanos
    )

private fun Timestamp.JsonMapper.toMessageImpl(): Timestamp =
    Timestamp(
        seconds = seconds ?: 0L,
        nanos = nanos ?: 0
    )

private fun Timestamp.jsonMarshalImpl(json: Json): String =
    json.stringify(Timestamp.JsonMapper.serializer(), toJsonMapper())

private fun Timestamp.Companion.jsonUnmarshalImpl(json: Json, data: String): Timestamp {
    val mapper = json.parse(Timestamp.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

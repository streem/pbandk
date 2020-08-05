@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Duration(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Duration> {
    override operator fun plus(other: Duration?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Duration> {
        val defaultInstance by lazy { Duration() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Duration.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Duration.jsonUnmarshalImpl(json, data)
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

fun Duration?.orDefault() = this ?: Duration.defaultInstance

private fun Duration.protoMergeImpl(plus: Duration?): Duration = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Duration.protoSizeImpl(): Int {
    var protoSize = 0
    if (seconds != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(seconds)
    if (nanos != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(nanos)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Duration.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (seconds != 0L) protoMarshal.writeTag(8).writeInt64(seconds)
    if (nanos != 0) protoMarshal.writeTag(16).writeInt32(nanos)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Duration.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Duration {
    var seconds = 0L
    var nanos = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Duration(seconds, nanos, protoUnmarshal.unknownFields())
        8 -> seconds = protoUnmarshal.readInt64()
        16 -> nanos = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Duration.toJsonMapperImpl(): Duration.JsonMapper =
    Duration.JsonMapper(
        seconds,
        nanos
    )

private fun Duration.JsonMapper.toMessageImpl(): Duration =
    Duration(
        seconds = seconds ?: 0L,
        nanos = nanos ?: 0
    )

private fun Duration.jsonMarshalImpl(json: Json): String =
    json.stringify(Duration.JsonMapper.serializer(), toJsonMapper())

private fun Duration.Companion.jsonUnmarshalImpl(json: Json, data: String): Duration {
    val mapper = json.parse(Duration.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

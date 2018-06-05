package pbandk.wkt

data class Duration(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Duration> {
    override operator fun plus(other: Duration?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Duration> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Duration.protoUnmarshalImpl(u)
    }
}

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

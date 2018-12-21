package pbandk.wkt

data class FieldMask(
    val paths: List<String> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FieldMask> {
    override operator fun plus(other: FieldMask?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<FieldMask> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldMask.protoUnmarshalImpl(u)
    }
}

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

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
    if (paths.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.packedRepeatedSize(paths, pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FieldMask.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (paths.isNotEmpty()) protoMarshal.writeTag(10).writePackedRepeated(paths, protoMarshal::writeString)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun FieldMask.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FieldMask {
    var paths: List<String> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FieldMask(paths, protoUnmarshal.unknownFields())
        10 -> paths += protoUnmarshal.readRepeated(protoUnmarshal::readString)
        else -> protoUnmarshal.unknownField()
    }
}

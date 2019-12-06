package pbandk.wkt

import kotlin.jvm.Transient

data class Empty(
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Empty> {
    override operator fun plus(other: Empty?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Empty> {
        val defaultInstance by lazy { Empty() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Empty.protoUnmarshalImpl(u)
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

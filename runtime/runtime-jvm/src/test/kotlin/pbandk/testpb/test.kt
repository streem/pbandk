package pbandk.testpb

data class Foo(
    val `val`: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Foo> {
    override operator fun plus(other: Foo?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Foo> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Foo.protoUnmarshalImpl(u)
    }
}

data class Bar(
    val foos: List<pbandk.testpb.Foo> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Bar> {
    override operator fun plus(other: Bar?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Bar> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Bar.protoUnmarshalImpl(u)
    }
}

private fun Foo.protoMergeImpl(plus: Foo?): Foo = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Foo.protoSizeImpl(): Int {
    var protoSize = 0
    if (`val`.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(`val`)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Foo.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (`val`.isNotEmpty()) protoMarshal.writeTag(10).writeString(`val`)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Foo.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Foo {
    var `val` = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Foo(`val`, protoUnmarshal.unknownFields())
        10 -> `val` = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Bar.protoMergeImpl(plus: Bar?): Bar = plus?.copy(
    foos = foos + plus.foos,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Bar.protoSizeImpl(): Int {
    var protoSize = 0
    if (foos.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * foos.size) + foos.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Bar.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (foos.isNotEmpty()) foos.forEach { protoMarshal.writeTag(10).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Bar.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Bar {
    var foos: pbandk.ListWithSize.Builder<pbandk.testpb.Foo>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Bar(pbandk.ListWithSize.Builder.fixed(foos), protoUnmarshal.unknownFields())
        10 -> foos = protoUnmarshal.readRepeatedMessage(foos, pbandk.testpb.Foo.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

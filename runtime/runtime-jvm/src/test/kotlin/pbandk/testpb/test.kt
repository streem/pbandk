package pbandk.testpb

import kotlin.jvm.Transient

data class Foo(
    val `val`: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Foo> {
    override operator fun plus(other: Foo?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Foo> {
        val defaultInstance by lazy { Foo() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Foo.protoUnmarshalImpl(u)
    }
}

data class Bar(
    val foos: List<pbandk.testpb.Foo> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Bar> {
    override operator fun plus(other: Bar?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Bar> {
        val defaultInstance by lazy { Bar() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Bar.protoUnmarshalImpl(u)
    }
}

data class MessageWithMap(
    val map: Map<String, String> = emptyMap(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<MessageWithMap> {
    override operator fun plus(other: MessageWithMap?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<MessageWithMap> {
        val defaultInstance by lazy { MessageWithMap() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageWithMap.protoUnmarshalImpl(u)
    }

    data class MapEntry(
        override val key: String = "",
        override val value: String = "",
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapEntry>, Map.Entry<String, String> {
        override operator fun plus(other: MapEntry?) = protoMergeImpl(other)
        @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapEntry> {
            val defaultInstance by lazy { MapEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapEntry.protoUnmarshalImpl(u)
        }
    }
}

fun Foo?.orDefault() = this ?: Foo.defaultInstance

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

fun Bar?.orDefault() = this ?: Bar.defaultInstance

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

fun MessageWithMap?.orDefault() = this ?: MessageWithMap.defaultInstance

private fun MessageWithMap.protoMergeImpl(plus: MessageWithMap?): MessageWithMap = plus?.copy(
    map = map + plus.map,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MessageWithMap.protoSizeImpl(): Int {
    var protoSize = 0
    if (map.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(1, map, pbandk.testpb.MessageWithMap::MapEntry)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MessageWithMap.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (map.isNotEmpty()) protoMarshal.writeMap(10, map, pbandk.testpb.MessageWithMap::MapEntry)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun MessageWithMap.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MessageWithMap {
    var map: pbandk.MessageMap.Builder<String, String>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MessageWithMap(pbandk.MessageMap.Builder.fixed(map), protoUnmarshal.unknownFields())
        10 -> map = protoUnmarshal.readMap(map, pbandk.testpb.MessageWithMap.MapEntry.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

fun MessageWithMap.MapEntry?.orDefault() = this ?: MessageWithMap.MapEntry.defaultInstance

private fun MessageWithMap.MapEntry.protoMergeImpl(plus: MessageWithMap.MapEntry?): MessageWithMap.MapEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MessageWithMap.MapEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MessageWithMap.MapEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.isNotEmpty()) protoMarshal.writeTag(18).writeString(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun MessageWithMap.MapEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MessageWithMap.MapEntry {
    var key = ""
    var value = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MessageWithMap.MapEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

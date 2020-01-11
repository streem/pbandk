@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.testpb

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Foo(
    val `val`: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Foo> {
    override operator fun plus(other: Foo?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Foo> {
        val defaultInstance by lazy { Foo() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Foo.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Foo.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("val")
        val `val`: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class Bar(
    val foos: List<pbandk.testpb.Foo> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Bar> {
    override operator fun plus(other: Bar?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Bar> {
        val defaultInstance by lazy { Bar() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Bar.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Bar.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("foos")
        val foos: List<pbandk.testpb.Foo.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class MessageWithMap(
    val map: Map<String, String> = emptyMap(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<MessageWithMap> {
    override operator fun plus(other: MessageWithMap?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<MessageWithMap> {
        val defaultInstance by lazy { MessageWithMap() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageWithMap.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = MessageWithMap.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("map")
        val map: Map<String, String?> = emptyMap()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class MapEntry(
        override val key: String = "",
        override val value: String = "",
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapEntry>, Map.Entry<String, String> {
        override operator fun plus(other: MapEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapEntry> {
            val defaultInstance by lazy { MapEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: String? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class Wrappers(
    val stringValue: String? = null,
    val uint64Values: List<Long> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Wrappers> {
    override operator fun plus(other: Wrappers?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Wrappers> {
        val defaultInstance by lazy { Wrappers() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Wrappers.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Wrappers.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("string_value")
        val stringValue: String? = null,
        @SerialName("uint64_values")
        val uint64Values: List<Long> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
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

private fun Foo.toJsonMapperImpl(): Foo.JsonMapper =
    Foo.JsonMapper(
        `val`.takeIf { it != "" }
    )

private fun Foo.JsonMapper.toMessageImpl(): Foo =
    Foo(
        `val` = `val` ?: ""
    )

private fun Foo.jsonMarshalImpl(json: Json): String =
    json.stringify(Foo.JsonMapper.serializer(), toJsonMapper())

private fun Foo.Companion.jsonUnmarshalImpl(json: Json, data: String): Foo {
    val mapper = json.parse(Foo.JsonMapper.serializer(), data)
    return mapper.toMessage()
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

private fun Bar.toJsonMapperImpl(): Bar.JsonMapper =
    Bar.JsonMapper(
        foos.map { it.toJsonMapper() }
    )

private fun Bar.JsonMapper.toMessageImpl(): Bar =
    Bar(
        foos = foos.map { it.toMessage() }
    )

private fun Bar.jsonMarshalImpl(json: Json): String =
    json.stringify(Bar.JsonMapper.serializer(), toJsonMapper())

private fun Bar.Companion.jsonUnmarshalImpl(json: Json, data: String): Bar {
    val mapper = json.parse(Bar.JsonMapper.serializer(), data)
    return mapper.toMessage()
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

private fun MessageWithMap.toJsonMapperImpl(): MessageWithMap.JsonMapper =
    MessageWithMap.JsonMapper(
        map
    )

private fun MessageWithMap.JsonMapper.toMessageImpl(): MessageWithMap =
    MessageWithMap(
        map = map.mapValues { it.value ?: "" }
    )

private fun MessageWithMap.jsonMarshalImpl(json: Json): String =
    json.stringify(MessageWithMap.JsonMapper.serializer(), toJsonMapper())

private fun MessageWithMap.Companion.jsonUnmarshalImpl(json: Json, data: String): MessageWithMap {
    val mapper = json.parse(MessageWithMap.JsonMapper.serializer(), data)
    return mapper.toMessage()
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

private fun MessageWithMap.MapEntry.toJsonMapperImpl(): MessageWithMap.MapEntry.JsonMapper =
    MessageWithMap.MapEntry.JsonMapper(
        key.takeIf { it != "" },
        value.takeIf { it != "" }
    )

private fun MessageWithMap.MapEntry.JsonMapper.toMessageImpl(): MessageWithMap.MapEntry =
    MessageWithMap.MapEntry(
        key = key ?: "",
        value = value ?: ""
    )

private fun MessageWithMap.MapEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(MessageWithMap.MapEntry.JsonMapper.serializer(), toJsonMapper())

private fun MessageWithMap.MapEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): MessageWithMap.MapEntry {
    val mapper = json.parse(MessageWithMap.MapEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun Wrappers?.orDefault() = this ?: Wrappers.defaultInstance

private fun Wrappers.protoMergeImpl(plus: Wrappers?): Wrappers = plus?.copy(
    stringValue = plus.stringValue ?: stringValue,
    uint64Values = uint64Values + plus.uint64Values,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Wrappers.protoSizeImpl(): Int {
    var protoSize = 0
    if (stringValue != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.messageSize(pbandk.wkt.StringValue(stringValue))
    if (uint64Values.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * uint64Values.size) + uint64Values.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.UInt64Value(it)) }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Wrappers.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (stringValue != null) protoMarshal.writeTag(10).writeMessage(pbandk.wkt.StringValue(stringValue))
    if (uint64Values.isNotEmpty()) uint64Values.forEach { protoMarshal.writeTag(18).writeMessage(pbandk.wkt.UInt64Value(it)) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Wrappers.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Wrappers {
    var stringValue: pbandk.wkt.StringValue? = null
    var uint64Values: pbandk.ListWithSize.Builder<Long>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Wrappers(stringValue?.value, pbandk.ListWithSize.Builder.fixed(uint64Values), protoUnmarshal.unknownFields())
        10 -> stringValue = protoUnmarshal.readMessage(pbandk.wkt.StringValue.Companion)
        18 -> uint64Values = protoUnmarshal.readRepeated(uint64Values, { protoUnmarshal.readMessage(pbandk.wkt.UInt64Value.Companion).value }, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun Wrappers.toJsonMapperImpl(): Wrappers.JsonMapper =
    Wrappers.JsonMapper(
        stringValue,
        uint64Values
    )

private fun Wrappers.JsonMapper.toMessageImpl(): Wrappers =
    Wrappers(
        stringValue = stringValue,
        uint64Values = uint64Values
    )

private fun Wrappers.jsonMarshalImpl(json: Json): String =
    json.stringify(Wrappers.JsonMapper.serializer(), toJsonMapper())

private fun Wrappers.Companion.jsonUnmarshalImpl(json: Json, data: String): Wrappers {
    val mapper = json.parse(Wrappers.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb.java

@pbandk.Export
public data class Foo(
    val `val`: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.Foo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.Foo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.Foo> {
        public val defaultInstance: pbandk.testpb.java.Foo by lazy { pbandk.testpb.java.Foo() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.Foo = pbandk.testpb.java.Foo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.Foo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.Foo, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "val",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "val",
                        value = pbandk.testpb.java.Foo::`val`
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Foo",
                messageClass = pbandk.testpb.java.Foo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Bar(
    val foos: List<pbandk.testpb.java.Foo> = emptyList(),
    val singleFoo: pbandk.testpb.java.Foo? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.Bar = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.Bar> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.Bar> {
        public val defaultInstance: pbandk.testpb.java.Bar by lazy { pbandk.testpb.java.Bar() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.Bar = pbandk.testpb.java.Bar.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.Bar> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.Bar, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foos",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.java.Foo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.java.Foo.Companion)),
                        jsonName = "foos",
                        value = pbandk.testpb.java.Bar::foos
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single_foo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.java.Foo.Companion),
                        jsonName = "singleFoo",
                        value = pbandk.testpb.java.Bar::singleFoo
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Bar",
                messageClass = pbandk.testpb.java.Bar::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class MessageWithMap(
    val map: Map<String, String> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.MessageWithMap = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithMap> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.MessageWithMap> {
        public val defaultInstance: pbandk.testpb.java.MessageWithMap by lazy { pbandk.testpb.java.MessageWithMap() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.MessageWithMap = pbandk.testpb.java.MessageWithMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.MessageWithMap, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "map",
                        value = pbandk.testpb.java.MessageWithMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithMap",
                messageClass = pbandk.testpb.java.MessageWithMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MapEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.MessageWithMap.MapEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithMap.MapEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.java.MessageWithMap.MapEntry> {
            public val defaultInstance: pbandk.testpb.java.MessageWithMap.MapEntry by lazy { pbandk.testpb.java.MessageWithMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.MessageWithMap.MapEntry = pbandk.testpb.java.MessageWithMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.MessageWithMap.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.java.MessageWithMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = pbandk.testpb.java.MessageWithMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.MessageWithMap.MapEntry",
                    messageClass = pbandk.testpb.java.MessageWithMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class FooMap(
    val map: Map<String, pbandk.testpb.java.Foo?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.FooMap = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMap> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.FooMap> {
        public val defaultInstance: pbandk.testpb.java.FooMap by lazy { pbandk.testpb.java.FooMap() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.FooMap = pbandk.testpb.java.FooMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.FooMap, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.java.Foo?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.java.Foo.Companion)),
                        jsonName = "map",
                        value = pbandk.testpb.java.FooMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.FooMap",
                messageClass = pbandk.testpb.java.FooMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MapEntry(
        override val key: String = "",
        override val value: pbandk.testpb.java.Foo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.java.Foo?> {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.FooMap.MapEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMap.MapEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.java.FooMap.MapEntry> {
            public val defaultInstance: pbandk.testpb.java.FooMap.MapEntry by lazy { pbandk.testpb.java.FooMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.FooMap.MapEntry = pbandk.testpb.java.FooMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.FooMap.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.java.FooMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.java.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.java.FooMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.FooMap.MapEntry",
                    messageClass = pbandk.testpb.java.FooMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class FooMapEntries(
    val map: List<pbandk.testpb.java.FooMapEntries.MapEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.FooMapEntries = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMapEntries> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.FooMapEntries> {
        public val defaultInstance: pbandk.testpb.java.FooMapEntries by lazy { pbandk.testpb.java.FooMapEntries() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.FooMapEntries = pbandk.testpb.java.FooMapEntries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMapEntries> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.FooMapEntries, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.java.FooMapEntries.MapEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.java.FooMapEntries.MapEntry.Companion)),
                        jsonName = "map",
                        value = pbandk.testpb.java.FooMapEntries::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.FooMapEntries",
                messageClass = pbandk.testpb.java.FooMapEntries::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MapEntry(
        val key: String = "",
        val value: pbandk.testpb.java.Foo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.FooMapEntries.MapEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMapEntries.MapEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.java.FooMapEntries.MapEntry> {
            public val defaultInstance: pbandk.testpb.java.FooMapEntries.MapEntry by lazy { pbandk.testpb.java.FooMapEntries.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.FooMapEntries.MapEntry = pbandk.testpb.java.FooMapEntries.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.FooMapEntries.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.FooMapEntries.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.java.FooMapEntries.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.java.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.java.FooMapEntries.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.FooMapEntries.MapEntry",
                    messageClass = pbandk.testpb.java.FooMapEntries.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class Wrappers(
    val stringValue: String? = null,
    val uint64Values: List<Long> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.Wrappers = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.Wrappers> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.Wrappers> {
        public val defaultInstance: pbandk.testpb.java.Wrappers by lazy { pbandk.testpb.java.Wrappers() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.Wrappers = pbandk.testpb.java.Wrappers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.Wrappers> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.Wrappers, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "stringValue",
                        value = pbandk.testpb.java.Wrappers::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64_values",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "uint64Values",
                        value = pbandk.testpb.java.Wrappers::uint64Values
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Wrappers",
                messageClass = pbandk.testpb.java.Wrappers::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFoo")
public fun Foo?.orDefault(): pbandk.testpb.java.Foo = this ?: Foo.defaultInstance

private fun Foo.protoMergeImpl(plus: pbandk.Message?): Foo = (plus as? Foo)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Foo {
    var `val` = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> `val` = _fieldValue as String
        }
    }

    return Foo(`val`, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForBar")
public fun Bar?.orDefault(): pbandk.testpb.java.Bar = this ?: Bar.defaultInstance

private fun Bar.protoMergeImpl(plus: pbandk.Message?): Bar = (plus as? Bar)?.let {
    it.copy(
        foos = foos + plus.foos,
        singleFoo = singleFoo?.plus(plus.singleFoo) ?: plus.singleFoo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Bar {
    var foos: pbandk.ListWithSize.Builder<pbandk.testpb.java.Foo>? = null
    var singleFoo: pbandk.testpb.java.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foos = (foos ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.java.Foo> }
            2 -> singleFoo = _fieldValue as pbandk.testpb.java.Foo
        }
    }

    return Bar(pbandk.ListWithSize.Builder.fixed(foos), singleFoo, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMap")
public fun MessageWithMap?.orDefault(): pbandk.testpb.java.MessageWithMap = this ?: MessageWithMap.defaultInstance

private fun MessageWithMap.protoMergeImpl(plus: pbandk.Message?): MessageWithMap = (plus as? MessageWithMap)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap {
    var map: pbandk.MessageMap.Builder<String, String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
        }
    }

    return MessageWithMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMapMapEntry")
public fun MessageWithMap.MapEntry?.orDefault(): pbandk.testpb.java.MessageWithMap.MapEntry = this ?: MessageWithMap.MapEntry.defaultInstance

private fun MessageWithMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): MessageWithMap.MapEntry = (plus as? MessageWithMap.MapEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap.MapEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }

    return MessageWithMap.MapEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMap")
public fun FooMap?.orDefault(): pbandk.testpb.java.FooMap = this ?: FooMap.defaultInstance

private fun FooMap.protoMergeImpl(plus: pbandk.Message?): FooMap = (plus as? FooMap)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap {
    var map: pbandk.MessageMap.Builder<String, pbandk.testpb.java.Foo?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.java.Foo?>> }
        }
    }

    return FooMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapMapEntry")
public fun FooMap.MapEntry?.orDefault(): pbandk.testpb.java.FooMap.MapEntry = this ?: FooMap.MapEntry.defaultInstance

private fun FooMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMap.MapEntry = (plus as? FooMap.MapEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap.MapEntry {
    var key = ""
    var value: pbandk.testpb.java.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.java.Foo
        }
    }

    return FooMap.MapEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntries")
public fun FooMapEntries?.orDefault(): pbandk.testpb.java.FooMapEntries = this ?: FooMapEntries.defaultInstance

private fun FooMapEntries.protoMergeImpl(plus: pbandk.Message?): FooMapEntries = (plus as? FooMapEntries)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries {
    var map: pbandk.ListWithSize.Builder<pbandk.testpb.java.FooMapEntries.MapEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.java.FooMapEntries.MapEntry> }
        }
    }

    return FooMapEntries(pbandk.ListWithSize.Builder.fixed(map), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntriesMapEntry")
public fun FooMapEntries.MapEntry?.orDefault(): pbandk.testpb.java.FooMapEntries.MapEntry = this ?: FooMapEntries.MapEntry.defaultInstance

private fun FooMapEntries.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMapEntries.MapEntry = (plus as? FooMapEntries.MapEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries.MapEntry {
    var key = ""
    var value: pbandk.testpb.java.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.java.Foo
        }
    }

    return FooMapEntries.MapEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForWrappers")
public fun Wrappers?.orDefault(): pbandk.testpb.java.Wrappers = this ?: Wrappers.defaultInstance

private fun Wrappers.protoMergeImpl(plus: pbandk.Message?): Wrappers = (plus as? Wrappers)?.let {
    it.copy(
        stringValue = plus.stringValue ?: stringValue,
        uint64Values = uint64Values + plus.uint64Values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Wrappers.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Wrappers {
    var stringValue: String? = null
    var uint64Values: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stringValue = _fieldValue as String
            2 -> uint64Values = (uint64Values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }

    return Wrappers(stringValue, pbandk.ListWithSize.Builder.fixed(uint64Values), unknownFields)
}

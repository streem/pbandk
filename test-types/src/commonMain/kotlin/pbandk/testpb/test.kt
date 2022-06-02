@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public data class Foo(
    val `val`: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Foo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        public val defaultInstance: pbandk.testpb.Foo by lazy { pbandk.testpb.Foo() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Foo = pbandk.testpb.Foo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Foo, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "val",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "val",
                        value = pbandk.testpb.Foo::`val`
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Foo",
                messageClass = pbandk.testpb.Foo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Bar(
    val foos: List<pbandk.testpb.Foo> = emptyList(),
    val singleFoo: pbandk.testpb.Foo? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Bar = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        public val defaultInstance: pbandk.testpb.Bar by lazy { pbandk.testpb.Bar() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Bar = pbandk.testpb.Bar.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Bar, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foos",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.Foo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion)),
                        jsonName = "foos",
                        value = pbandk.testpb.Bar::foos
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single_foo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                        jsonName = "singleFoo",
                        value = pbandk.testpb.Bar::singleFoo
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Bar",
                messageClass = pbandk.testpb.Bar::class,
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
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        public val defaultInstance: pbandk.testpb.MessageWithMap by lazy { pbandk.testpb.MessageWithMap() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap = pbandk.testpb.MessageWithMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageWithMap, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "map",
                        value = pbandk.testpb.MessageWithMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithMap",
                messageClass = pbandk.testpb.MessageWithMap::class,
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
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap.MapEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap.MapEntry> {
            public val defaultInstance: pbandk.testpb.MessageWithMap.MapEntry by lazy { pbandk.testpb.MessageWithMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap.MapEntry = pbandk.testpb.MessageWithMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageWithMap.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.MessageWithMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = pbandk.testpb.MessageWithMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.MessageWithMap.MapEntry",
                    messageClass = pbandk.testpb.MessageWithMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class FooMap(
    val map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        public val defaultInstance: pbandk.testpb.FooMap by lazy { pbandk.testpb.FooMap() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMap = pbandk.testpb.FooMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMap, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.Foo?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion)),
                        jsonName = "map",
                        value = pbandk.testpb.FooMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.FooMap",
                messageClass = pbandk.testpb.FooMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MapEntry(
        override val key: String = "",
        override val value: pbandk.testpb.Foo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.Foo?> {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap.MapEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap.MapEntry> {
            public val defaultInstance: pbandk.testpb.FooMap.MapEntry by lazy { pbandk.testpb.FooMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMap.MapEntry = pbandk.testpb.FooMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMap.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.FooMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.FooMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.FooMap.MapEntry",
                    messageClass = pbandk.testpb.FooMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class FooMapEntries(
    val map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        public val defaultInstance: pbandk.testpb.FooMapEntries by lazy { pbandk.testpb.FooMapEntries() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries = pbandk.testpb.FooMapEntries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.FooMapEntries.MapEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FooMapEntries.MapEntry.Companion)),
                        jsonName = "map",
                        value = pbandk.testpb.FooMapEntries::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.FooMapEntries",
                messageClass = pbandk.testpb.FooMapEntries::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class MapEntry(
        val key: String = "",
        val value: pbandk.testpb.Foo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries.MapEntry = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            public val defaultInstance: pbandk.testpb.FooMapEntries.MapEntry by lazy { pbandk.testpb.FooMapEntries.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.FooMapEntries.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.FooMapEntries.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.FooMapEntries.MapEntry",
                    messageClass = pbandk.testpb.FooMapEntries.MapEntry::class,
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
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Wrappers = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        public val defaultInstance: pbandk.testpb.Wrappers by lazy { pbandk.testpb.Wrappers() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Wrappers = pbandk.testpb.Wrappers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Wrappers, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "stringValue",
                        value = pbandk.testpb.Wrappers::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64_values",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "uint64Values",
                        value = pbandk.testpb.Wrappers::uint64Values
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Wrappers",
                messageClass = pbandk.testpb.Wrappers::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFoo")
public fun Foo?.orDefault(): pbandk.testpb.Foo = this ?: Foo.defaultInstance

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
public fun Bar?.orDefault(): pbandk.testpb.Bar = this ?: Bar.defaultInstance

private fun Bar.protoMergeImpl(plus: pbandk.Message?): Bar = (plus as? Bar)?.let {
    it.copy(
        foos = foos + plus.foos,
        singleFoo = singleFoo?.plus(plus.singleFoo) ?: plus.singleFoo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Bar {
    var foos: pbandk.ListWithSize.Builder<pbandk.testpb.Foo>? = null
    var singleFoo: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foos = (foos ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.Foo> }
            2 -> singleFoo = _fieldValue as pbandk.testpb.Foo
        }
    }

    return Bar(pbandk.ListWithSize.Builder.fixed(foos), singleFoo, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMap")
public fun MessageWithMap?.orDefault(): pbandk.testpb.MessageWithMap = this ?: MessageWithMap.defaultInstance

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
public fun MessageWithMap.MapEntry?.orDefault(): pbandk.testpb.MessageWithMap.MapEntry = this ?: MessageWithMap.MapEntry.defaultInstance

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
public fun FooMap?.orDefault(): pbandk.testpb.FooMap = this ?: FooMap.defaultInstance

private fun FooMap.protoMergeImpl(plus: pbandk.Message?): FooMap = (plus as? FooMap)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap {
    var map: pbandk.MessageMap.Builder<String, pbandk.testpb.Foo?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.Foo?>> }
        }
    }

    return FooMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapMapEntry")
public fun FooMap.MapEntry?.orDefault(): pbandk.testpb.FooMap.MapEntry = this ?: FooMap.MapEntry.defaultInstance

private fun FooMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMap.MapEntry = (plus as? FooMap.MapEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }

    return FooMap.MapEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntries")
public fun FooMapEntries?.orDefault(): pbandk.testpb.FooMapEntries = this ?: FooMapEntries.defaultInstance

private fun FooMapEntries.protoMergeImpl(plus: pbandk.Message?): FooMapEntries = (plus as? FooMapEntries)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries {
    var map: pbandk.ListWithSize.Builder<pbandk.testpb.FooMapEntries.MapEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.FooMapEntries.MapEntry> }
        }
    }

    return FooMapEntries(pbandk.ListWithSize.Builder.fixed(map), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntriesMapEntry")
public fun FooMapEntries.MapEntry?.orDefault(): pbandk.testpb.FooMapEntries.MapEntry = this ?: FooMapEntries.MapEntry.defaultInstance

private fun FooMapEntries.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMapEntries.MapEntry = (plus as? FooMapEntries.MapEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }

    return FooMapEntries.MapEntry(key, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForWrappers")
public fun Wrappers?.orDefault(): pbandk.testpb.Wrappers = this ?: Wrappers.defaultInstance

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

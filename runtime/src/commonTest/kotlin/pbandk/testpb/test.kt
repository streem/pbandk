@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface Foo : pbandk.Message {
    public val `val`: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Foo
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo>

    public fun copy(
        `val`: String = this.`val`,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Foo

    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        @Deprecated("Use foo { } instead")
        public operator fun invoke(
            `val`: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Foo = Foo_Impl(
            `val` = `val`,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
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

public sealed interface MutableFoo : Foo, pbandk.MutableMessage {
    public override var `val`: String

    public fun toFoo(): Foo

    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        @Deprecated("Use foo { } instead")
        public operator fun invoke(
            `val`: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFoo = MutableFoo_Impl(
            `val` = `val`,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFoo by lazy { MutableFoo() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Foo = pbandk.testpb.Foo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo> get() = pbandk.testpb.Foo.descriptor
    }
}

public sealed interface Bar : pbandk.Message {
    public val foos: List<pbandk.testpb.Foo>
    public val singleFoo: pbandk.testpb.Foo?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Bar
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar>

    public fun copy(
        foos: List<pbandk.testpb.Foo> = this.foos,
        singleFoo: pbandk.testpb.Foo? = this.singleFoo,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Bar

    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        @Deprecated("Use bar { } instead")
        public operator fun invoke(
            foos: List<pbandk.testpb.Foo> = emptyList(),
            singleFoo: pbandk.testpb.Foo? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Bar = Bar_Impl(
            foos = foos,
            singleFoo = singleFoo,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
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

public sealed interface MutableBar : Bar, pbandk.MutableMessage {
    public override var foos: List<pbandk.testpb.Foo>
    public override var singleFoo: pbandk.testpb.Foo?

    public fun toBar(): Bar

    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        @Deprecated("Use bar { } instead")
        public operator fun invoke(
            foos: List<pbandk.testpb.Foo> = emptyList(),
            singleFoo: pbandk.testpb.Foo? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableBar = MutableBar_Impl(
            foos = foos,
            singleFoo = singleFoo,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableBar by lazy { MutableBar() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Bar = pbandk.testpb.Bar.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar> get() = pbandk.testpb.Bar.descriptor
    }
}

public sealed interface MessageWithMap : pbandk.Message {
    public val map: Map<String, String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap>

    public fun copy(
        map: Map<String, String> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        @Deprecated("Use messageWithMap { } instead")
        public operator fun invoke(
            map: Map<String, String> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MessageWithMap = MessageWithMap_Impl(
            map = map,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
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

    public sealed interface MapEntry : pbandk.Message, Map.Entry<String, String> {
        public override val key: String
        public override val value: String

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry>

        public fun copy(
            key: String = this.key,
            value: String = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.MessageWithMap.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap.MapEntry> {
            @Deprecated("Use mapEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: String = "",
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.MessageWithMap.MapEntry = MessageWithMap_MapEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
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

    public sealed interface MutableMapEntry : MessageWithMap.MapEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: String

        public fun toMapEntry(): MessageWithMap.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap.MapEntry> {
            @Deprecated("Use mapEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: String = "",
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapEntry = MessageWithMap_MutableMapEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapEntry by lazy { MutableMapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap.MapEntry = pbandk.testpb.MessageWithMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry> get() = pbandk.testpb.MessageWithMap.MapEntry.descriptor
        }
    }
}

public sealed interface MutableMessageWithMap : MessageWithMap, pbandk.MutableMessage {
    public override var map: Map<String, String>

    public fun toMessageWithMap(): MessageWithMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        @Deprecated("Use messageWithMap { } instead")
        public operator fun invoke(
            map: Map<String, String> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableMessageWithMap = MutableMessageWithMap_Impl(
            map = map,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableMessageWithMap by lazy { MutableMessageWithMap() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap = pbandk.testpb.MessageWithMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap> get() = pbandk.testpb.MessageWithMap.descriptor
    }
}

public sealed interface FooMap : pbandk.Message {
    public val map: Map<String, pbandk.testpb.Foo?>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap>

    public fun copy(
        map: Map<String, pbandk.testpb.Foo?> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        @Deprecated("Use fooMap { } instead")
        public operator fun invoke(
            map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FooMap = FooMap_Impl(
            map = map,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
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

    public sealed interface MapEntry : pbandk.Message, Map.Entry<String, pbandk.testpb.Foo?> {
        public override val key: String
        public override val value: pbandk.testpb.Foo?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.testpb.Foo? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.FooMap.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap.MapEntry> {
            @Deprecated("Use mapEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.testpb.Foo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.FooMap.MapEntry = FooMap_MapEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
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

    public sealed interface MutableMapEntry : FooMap.MapEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.testpb.Foo?

        public fun toMapEntry(): FooMap.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap.MapEntry> {
            @Deprecated("Use mapEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.testpb.Foo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapEntry = FooMap_MutableMapEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapEntry by lazy { MutableMapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMap.MapEntry = pbandk.testpb.FooMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry> get() = pbandk.testpb.FooMap.MapEntry.descriptor
        }
    }
}

public sealed interface MutableFooMap : FooMap, pbandk.MutableMessage {
    public override var map: Map<String, pbandk.testpb.Foo?>

    public fun toFooMap(): FooMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        @Deprecated("Use fooMap { } instead")
        public operator fun invoke(
            map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFooMap = MutableFooMap_Impl(
            map = map,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFooMap by lazy { MutableFooMap() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMap = pbandk.testpb.FooMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap> get() = pbandk.testpb.FooMap.descriptor
    }
}

public sealed interface FooMapEntries : pbandk.Message {
    public val map: List<pbandk.testpb.FooMapEntries.MapEntry>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries>

    public fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMapEntries

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        @Deprecated("Use fooMapEntries { } instead")
        public operator fun invoke(
            map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FooMapEntries = FooMapEntries_Impl(
            map = map,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
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

    public sealed interface MapEntry : pbandk.Message {
        public val key: String
        public val value: pbandk.testpb.Foo?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.testpb.Foo? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.FooMapEntries.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            @Deprecated("Use mapEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.testpb.Foo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.FooMapEntries.MapEntry = FooMapEntries_MapEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
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

    public sealed interface MutableMapEntry : FooMapEntries.MapEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.testpb.Foo?

        public fun toMapEntry(): FooMapEntries.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            @Deprecated("Use mapEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.testpb.Foo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapEntry = FooMapEntries_MutableMapEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapEntry by lazy { MutableMapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry> get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor
        }
    }
}

public sealed interface MutableFooMapEntries : FooMapEntries, pbandk.MutableMessage {
    public override var map: List<pbandk.testpb.FooMapEntries.MapEntry>

    public fun toFooMapEntries(): FooMapEntries

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        @Deprecated("Use fooMapEntries { } instead")
        public operator fun invoke(
            map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFooMapEntries = MutableFooMapEntries_Impl(
            map = map,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFooMapEntries by lazy { MutableFooMapEntries() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries = pbandk.testpb.FooMapEntries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries> get() = pbandk.testpb.FooMapEntries.descriptor
    }
}

public sealed interface Wrappers : pbandk.Message {
    public val stringValue: String?
    public val uint64Values: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Wrappers
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers>

    public fun copy(
        stringValue: String? = this.stringValue,
        uint64Values: List<Long> = this.uint64Values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Wrappers

    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        @Deprecated("Use wrappers { } instead")
        public operator fun invoke(
            stringValue: String? = null,
            uint64Values: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Wrappers = Wrappers_Impl(
            stringValue = stringValue,
            uint64Values = uint64Values,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
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

public sealed interface MutableWrappers : Wrappers, pbandk.MutableMessage {
    public override var stringValue: String?
    public override var uint64Values: List<Long>

    public fun toWrappers(): Wrappers

    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        @Deprecated("Use wrappers { } instead")
        public operator fun invoke(
            stringValue: String? = null,
            uint64Values: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableWrappers = MutableWrappers_Impl(
            stringValue = stringValue,
            uint64Values = uint64Values,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableWrappers by lazy { MutableWrappers() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Wrappers = pbandk.testpb.Wrappers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers> get() = pbandk.testpb.Wrappers.descriptor
    }
}

public fun foo(builderAction: MutableFoo.() -> Unit): Foo {
    @Suppress("DEPRECATION") val builder = MutableFoo()
    builder.builderAction()
    return builder.toFoo()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFoo")
public fun Foo?.orDefault(): pbandk.testpb.Foo = this ?: Foo.defaultInstance

private class Foo_Impl(
    override val `val`: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Foo, pbandk.GeneratedMessage<Foo>() {
    override val descriptor get() = Foo.descriptor

    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Foo_Impl(
        `val` = `val`,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Foo)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFoo_Impl(
    override var `val`: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFoo, pbandk.MutableGeneratedMessage<MutableFoo>() {
    override val descriptor get() = Foo.descriptor

    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Foo_Impl(
        `val` = `val`,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Foo)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFoo() = Foo_Impl(
        `val` = `val`,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Foo {
    var `val` = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> `val` = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return Foo(`val`, unknownFields)
}

public fun bar(builderAction: MutableBar.() -> Unit): Bar {
    @Suppress("DEPRECATION") val builder = MutableBar()
    builder.builderAction()
    return builder.toBar()
}

@pbandk.Export
@pbandk.JsName("orDefaultForBar")
public fun Bar?.orDefault(): pbandk.testpb.Bar = this ?: Bar.defaultInstance

private class Bar_Impl(
    override val foos: List<pbandk.testpb.Foo>,
    override val singleFoo: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Bar, pbandk.GeneratedMessage<Bar>() {
    override val descriptor get() = Bar.descriptor

    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Bar_Impl(
        foos = foos,
        singleFoo = singleFoo,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Bar)?.let {
        it.copy(
            foos = foos + other.foos,
            singleFoo = singleFoo?.plus(other.singleFoo) ?: other.singleFoo,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableBar_Impl(
    override var foos: List<pbandk.testpb.Foo>,
    override var singleFoo: pbandk.testpb.Foo?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableBar, pbandk.MutableGeneratedMessage<MutableBar>() {
    override val descriptor get() = Bar.descriptor

    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Bar_Impl(
        foos = foos,
        singleFoo = singleFoo,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Bar)?.let {
        it.copy(
            foos = foos + other.foos,
            singleFoo = singleFoo?.plus(other.singleFoo) ?: other.singleFoo,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toBar() = Bar_Impl(
        foos = foos,
        singleFoo = singleFoo,
        unknownFields = unknownFields
    )
}

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
    @Suppress("DEPRECATION")
    return Bar(pbandk.ListWithSize.Builder.fixed(foos), singleFoo, unknownFields)
}

public fun messageWithMap(builderAction: MutableMessageWithMap.() -> Unit): MessageWithMap {
    @Suppress("DEPRECATION") val builder = MutableMessageWithMap()
    builder.builderAction()
    return builder.toMessageWithMap()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMap")
public fun MessageWithMap?.orDefault(): pbandk.testpb.MessageWithMap = this ?: MessageWithMap.defaultInstance

private class MessageWithMap_Impl(
    override val map: Map<String, String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MessageWithMap, pbandk.GeneratedMessage<MessageWithMap>() {
    override val descriptor get() = MessageWithMap.descriptor

    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MessageWithMap_Impl(
        map = map,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MessageWithMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableMessageWithMap_Impl(
    override var map: Map<String, String>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMessageWithMap, pbandk.MutableGeneratedMessage<MutableMessageWithMap>() {
    override val descriptor get() = MessageWithMap.descriptor

    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MessageWithMap_Impl(
        map = map,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MessageWithMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMessageWithMap() = MessageWithMap_Impl(
        map = map,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap {
    var map: pbandk.MessageMap.Builder<String, String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
        }
    }
    @Suppress("DEPRECATION")
    return MessageWithMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

public fun MessageWithMap.Companion.mapEntry(builderAction: MessageWithMap.MutableMapEntry.() -> Unit): MessageWithMap.MapEntry {
    @Suppress("DEPRECATION") val builder = MessageWithMap.MutableMapEntry()
    builder.builderAction()
    return builder.toMapEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMapMapEntry")
public fun MessageWithMap.MapEntry?.orDefault(): pbandk.testpb.MessageWithMap.MapEntry = this ?: MessageWithMap.MapEntry.defaultInstance

private class MessageWithMap_MapEntry_Impl(
    override val key: String,
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MessageWithMap.MapEntry, pbandk.GeneratedMessage<MessageWithMap.MapEntry>() {
    override val descriptor get() = MessageWithMap.MapEntry.descriptor

    override fun copy(
        key: String,
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MessageWithMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MessageWithMap.MapEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MessageWithMap_MutableMapEntry_Impl(
    override var key: String,
    override var value: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MessageWithMap.MutableMapEntry, pbandk.MutableGeneratedMessage<MessageWithMap.MutableMapEntry>() {
    override val descriptor get() = MessageWithMap.MapEntry.descriptor

    override fun copy(
        key: String,
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MessageWithMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MessageWithMap.MapEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapEntry() = MessageWithMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

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
    @Suppress("DEPRECATION")
    return MessageWithMap.MapEntry(key, value, unknownFields)
}

public fun fooMap(builderAction: MutableFooMap.() -> Unit): FooMap {
    @Suppress("DEPRECATION") val builder = MutableFooMap()
    builder.builderAction()
    return builder.toFooMap()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMap")
public fun FooMap?.orDefault(): pbandk.testpb.FooMap = this ?: FooMap.defaultInstance

private class FooMap_Impl(
    override val map: Map<String, pbandk.testpb.Foo?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMap, pbandk.GeneratedMessage<FooMap>() {
    override val descriptor get() = FooMap.descriptor

    override fun copy(
        map: Map<String, pbandk.testpb.Foo?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMap_Impl(
        map = map,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFooMap_Impl(
    override var map: Map<String, pbandk.testpb.Foo?>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFooMap, pbandk.MutableGeneratedMessage<MutableFooMap>() {
    override val descriptor get() = FooMap.descriptor

    override fun copy(
        map: Map<String, pbandk.testpb.Foo?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMap_Impl(
        map = map,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFooMap() = FooMap_Impl(
        map = map,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun FooMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap {
    var map: pbandk.MessageMap.Builder<String, pbandk.testpb.Foo?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.Foo?>> }
        }
    }
    @Suppress("DEPRECATION")
    return FooMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

public fun FooMap.Companion.mapEntry(builderAction: FooMap.MutableMapEntry.() -> Unit): FooMap.MapEntry {
    @Suppress("DEPRECATION") val builder = FooMap.MutableMapEntry()
    builder.builderAction()
    return builder.toMapEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapMapEntry")
public fun FooMap.MapEntry?.orDefault(): pbandk.testpb.FooMap.MapEntry = this ?: FooMap.MapEntry.defaultInstance

private class FooMap_MapEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMap.MapEntry, pbandk.GeneratedMessage<FooMap.MapEntry>() {
    override val descriptor get() = FooMap.MapEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMap.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class FooMap_MutableMapEntry_Impl(
    override var key: String,
    override var value: pbandk.testpb.Foo?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : FooMap.MutableMapEntry, pbandk.MutableGeneratedMessage<FooMap.MutableMapEntry>() {
    override val descriptor get() = FooMap.MapEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMap.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapEntry() = FooMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

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
    @Suppress("DEPRECATION")
    return FooMap.MapEntry(key, value, unknownFields)
}

public fun fooMapEntries(builderAction: MutableFooMapEntries.() -> Unit): FooMapEntries {
    @Suppress("DEPRECATION") val builder = MutableFooMapEntries()
    builder.builderAction()
    return builder.toFooMapEntries()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntries")
public fun FooMapEntries?.orDefault(): pbandk.testpb.FooMapEntries = this ?: FooMapEntries.defaultInstance

private class FooMapEntries_Impl(
    override val map: List<pbandk.testpb.FooMapEntries.MapEntry>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMapEntries, pbandk.GeneratedMessage<FooMapEntries>() {
    override val descriptor get() = FooMapEntries.descriptor

    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMapEntries_Impl(
        map = map,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMapEntries)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFooMapEntries_Impl(
    override var map: List<pbandk.testpb.FooMapEntries.MapEntry>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFooMapEntries, pbandk.MutableGeneratedMessage<MutableFooMapEntries>() {
    override val descriptor get() = FooMapEntries.descriptor

    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMapEntries_Impl(
        map = map,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMapEntries)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFooMapEntries() = FooMapEntries_Impl(
        map = map,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries {
    var map: pbandk.ListWithSize.Builder<pbandk.testpb.FooMapEntries.MapEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.FooMapEntries.MapEntry> }
        }
    }
    @Suppress("DEPRECATION")
    return FooMapEntries(pbandk.ListWithSize.Builder.fixed(map), unknownFields)
}

public fun FooMapEntries.Companion.mapEntry(builderAction: FooMapEntries.MutableMapEntry.() -> Unit): FooMapEntries.MapEntry {
    @Suppress("DEPRECATION") val builder = FooMapEntries.MutableMapEntry()
    builder.builderAction()
    return builder.toMapEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntriesMapEntry")
public fun FooMapEntries.MapEntry?.orDefault(): pbandk.testpb.FooMapEntries.MapEntry = this ?: FooMapEntries.MapEntry.defaultInstance

private class FooMapEntries_MapEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMapEntries.MapEntry, pbandk.GeneratedMessage<FooMapEntries.MapEntry>() {
    override val descriptor get() = FooMapEntries.MapEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMapEntries_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMapEntries.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class FooMapEntries_MutableMapEntry_Impl(
    override var key: String,
    override var value: pbandk.testpb.Foo?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : FooMapEntries.MutableMapEntry, pbandk.MutableGeneratedMessage<FooMapEntries.MutableMapEntry>() {
    override val descriptor get() = FooMapEntries.MapEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FooMapEntries_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FooMapEntries.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapEntry() = FooMapEntries_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

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
    @Suppress("DEPRECATION")
    return FooMapEntries.MapEntry(key, value, unknownFields)
}

public fun wrappers(builderAction: MutableWrappers.() -> Unit): Wrappers {
    @Suppress("DEPRECATION") val builder = MutableWrappers()
    builder.builderAction()
    return builder.toWrappers()
}

@pbandk.Export
@pbandk.JsName("orDefaultForWrappers")
public fun Wrappers?.orDefault(): pbandk.testpb.Wrappers = this ?: Wrappers.defaultInstance

private class Wrappers_Impl(
    override val stringValue: String?,
    override val uint64Values: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Wrappers, pbandk.GeneratedMessage<Wrappers>() {
    override val descriptor get() = Wrappers.descriptor

    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Wrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Wrappers)?.let {
        it.copy(
            stringValue = other.stringValue ?: stringValue,
            uint64Values = uint64Values + other.uint64Values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableWrappers_Impl(
    override var stringValue: String?,
    override var uint64Values: List<Long>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableWrappers, pbandk.MutableGeneratedMessage<MutableWrappers>() {
    override val descriptor get() = Wrappers.descriptor

    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Wrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Wrappers)?.let {
        it.copy(
            stringValue = other.stringValue ?: stringValue,
            uint64Values = uint64Values + other.uint64Values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toWrappers() = Wrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values,
        unknownFields = unknownFields
    )
}

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
    @Suppress("DEPRECATION")
    return Wrappers(stringValue, pbandk.ListWithSize.Builder.fixed(uint64Values), unknownFields)
}

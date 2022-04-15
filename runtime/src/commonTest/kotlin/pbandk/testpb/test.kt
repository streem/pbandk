@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface Foo : pbandk.Message {
    public val `val`: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Foo
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableFoo(): pbandk.testpb.MutableFoo

    /**
     * The [MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.Foo

    @Deprecated("Use copy {} instead")
    public fun copy(
        `val`: String = this.`val`,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Foo

    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Foo by lazy { pbandk.testpb.Foo {} }
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

public sealed interface MutableFoo : pbandk.testpb.Foo, pbandk.MutableMessage {
    public override var `val`: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toFoo(): pbandk.testpb.Foo

    public override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.MutableFoo

    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Foo = pbandk.testpb.Foo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo> get() = pbandk.testpb.Foo.descriptor
    }
}

public sealed interface Bar : pbandk.Message {
    public val foos: List<pbandk.testpb.Foo>
    public val singleFoo: pbandk.testpb.Foo?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Bar
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableBar(): pbandk.testpb.MutableBar

    /**
     * The [MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.Bar

    @Deprecated("Use copy {} instead")
    public fun copy(
        foos: List<pbandk.testpb.Foo> = this.foos,
        singleFoo: pbandk.testpb.Foo? = this.singleFoo,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Bar

    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Bar by lazy { pbandk.testpb.Bar {} }
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

public sealed interface MutableBar : pbandk.testpb.Bar, pbandk.MutableMessage {
    public override val foos: MutableList<pbandk.testpb.Foo>
    public override var singleFoo: pbandk.testpb.Foo?

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toBar(): pbandk.testpb.Bar

    public override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.MutableBar

    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Bar = pbandk.testpb.Bar.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar> get() = pbandk.testpb.Bar.descriptor
    }
}

public sealed interface MessageWithMap : pbandk.Message {
    public val map: Map<String, String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableMessageWithMap(): pbandk.testpb.MutableMessageWithMap

    /**
     * The [MutableMessageWithMap] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MessageWithMap

    @Deprecated("Use copy {} instead")
    public fun copy(
        map: Map<String, String> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.MessageWithMap by lazy { pbandk.testpb.MessageWithMap {} }
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

        /**
         * Returns a new mutable instance containing a copy of all values from this instance.
         */
        public fun toMutableMapEntry(): pbandk.testpb.MessageWithMap.MutableMapEntry

        /**
         * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit): pbandk.testpb.MessageWithMap.MapEntry

        @Deprecated("Use copy {} instead")
        public fun copy(
            key: String = this.key,
            value: String = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.MessageWithMap.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap.MapEntry> {
            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.testpb.MessageWithMap.MapEntry by lazy { pbandk.testpb.MessageWithMap.MapEntry {} }
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

    public sealed interface MutableMapEntry : pbandk.testpb.MessageWithMap.MapEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: String

        /**
         * Returns a new immutable instance containing a copy of all values from this instance.
         */
        public fun toMapEntry(): pbandk.testpb.MessageWithMap.MapEntry

        public override fun copy(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit): pbandk.testpb.MessageWithMap.MutableMapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap.MapEntry> {
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap.MapEntry = pbandk.testpb.MessageWithMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry> get() = pbandk.testpb.MessageWithMap.MapEntry.descriptor
        }
    }
}

public sealed interface MutableMessageWithMap : pbandk.testpb.MessageWithMap, pbandk.MutableMessage {
    public override val map: MutableMap<String, String>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toMessageWithMap(): pbandk.testpb.MessageWithMap

    public override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MutableMessageWithMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap = pbandk.testpb.MessageWithMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap> get() = pbandk.testpb.MessageWithMap.descriptor
    }
}

public sealed interface FooMap : pbandk.Message {
    public val map: Map<String, pbandk.testpb.Foo?>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableFooMap(): pbandk.testpb.MutableFooMap

    /**
     * The [MutableFooMap] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.FooMap

    @Deprecated("Use copy {} instead")
    public fun copy(
        map: Map<String, pbandk.testpb.Foo?> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.FooMap by lazy { pbandk.testpb.FooMap {} }
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

        /**
         * Returns a new mutable instance containing a copy of all values from this instance.
         */
        public fun toMutableMapEntry(): pbandk.testpb.FooMap.MutableMapEntry

        /**
         * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit): pbandk.testpb.FooMap.MapEntry

        @Deprecated("Use copy {} instead")
        public fun copy(
            key: String = this.key,
            value: pbandk.testpb.Foo? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.FooMap.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap.MapEntry> {
            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.testpb.FooMap.MapEntry by lazy { pbandk.testpb.FooMap.MapEntry {} }
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

    public sealed interface MutableMapEntry : pbandk.testpb.FooMap.MapEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.testpb.Foo?

        /**
         * Returns a new immutable instance containing a copy of all values from this instance.
         */
        public fun toMapEntry(): pbandk.testpb.FooMap.MapEntry

        public override fun copy(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit): pbandk.testpb.FooMap.MutableMapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap.MapEntry> {
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMap.MapEntry = pbandk.testpb.FooMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry> get() = pbandk.testpb.FooMap.MapEntry.descriptor
        }
    }
}

public sealed interface MutableFooMap : pbandk.testpb.FooMap, pbandk.MutableMessage {
    public override val map: MutableMap<String, pbandk.testpb.Foo?>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toFooMap(): pbandk.testpb.FooMap

    public override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.MutableFooMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMap = pbandk.testpb.FooMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap> get() = pbandk.testpb.FooMap.descriptor
    }
}

public sealed interface FooMapEntries : pbandk.Message {
    public val map: List<pbandk.testpb.FooMapEntries.MapEntry>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableFooMapEntries(): pbandk.testpb.MutableFooMapEntries

    /**
     * The [MutableFooMapEntries] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.FooMapEntries

    @Deprecated("Use copy {} instead")
    public fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMapEntries

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.FooMapEntries by lazy { pbandk.testpb.FooMapEntries {} }
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

        /**
         * Returns a new mutable instance containing a copy of all values from this instance.
         */
        public fun toMutableMapEntry(): pbandk.testpb.FooMapEntries.MutableMapEntry

        /**
         * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MapEntry

        @Deprecated("Use copy {} instead")
        public fun copy(
            key: String = this.key,
            value: pbandk.testpb.Foo? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.FooMapEntries.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.testpb.FooMapEntries.MapEntry by lazy { pbandk.testpb.FooMapEntries.MapEntry {} }
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

    public sealed interface MutableMapEntry : pbandk.testpb.FooMapEntries.MapEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.testpb.Foo?

        /**
         * Returns a new immutable instance containing a copy of all values from this instance.
         */
        public fun toMapEntry(): pbandk.testpb.FooMapEntries.MapEntry

        public override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MutableMapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry> get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor
        }
    }
}

public sealed interface MutableFooMapEntries : pbandk.testpb.FooMapEntries, pbandk.MutableMessage {
    public override val map: MutableList<pbandk.testpb.FooMapEntries.MapEntry>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toFooMapEntries(): pbandk.testpb.FooMapEntries

    public override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.MutableFooMapEntries

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries = pbandk.testpb.FooMapEntries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries> get() = pbandk.testpb.FooMapEntries.descriptor
    }
}

public sealed interface Wrappers : pbandk.Message {
    public val stringValue: String?
    public val uint64Values: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Wrappers
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableWrappers(): pbandk.testpb.MutableWrappers

    /**
     * The [MutableWrappers] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.Wrappers

    @Deprecated("Use copy {} instead")
    public fun copy(
        stringValue: String? = this.stringValue,
        uint64Values: List<Long> = this.uint64Values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Wrappers

    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Wrappers by lazy { pbandk.testpb.Wrappers {} }
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

public sealed interface MutableWrappers : pbandk.testpb.Wrappers, pbandk.MutableMessage {
    public override var stringValue: String?
    public override val uint64Values: MutableList<Long>

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toWrappers(): pbandk.testpb.Wrappers

    public override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.MutableWrappers

    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Wrappers = pbandk.testpb.Wrappers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers> get() = pbandk.testpb.Wrappers.descriptor
    }
}

@Deprecated("Use Foo { } instead")
public fun Foo(
    `val`: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Foo = pbandk.testpb.Foo {
    this.`val` = `val`
    this.unknownFields += unknownFields
}

public fun MutableFoo(): pbandk.testpb.MutableFoo = pbandk.testpb.MutableFoo_Impl(
    `val` = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Foo(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.Foo =
    pbandk.testpb.MutableFoo().also(builderAction).toFoo()

public fun MutableFoo(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.MutableFoo =
    pbandk.testpb.MutableFoo().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFoo")
public fun Foo?.orDefault(): pbandk.testpb.Foo = this ?: pbandk.testpb.Foo.defaultInstance

private class Foo_Impl(
    override val `val`: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Foo, pbandk.GeneratedMessage<pbandk.testpb.Foo>() {
    override val descriptor get() = pbandk.testpb.Foo.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit) =
        toMutableFoo().apply(builderAction).toFoo()

    @Deprecated("Use copy {} instead")
    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.`val` = `val`
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.Foo)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableFoo() = MutableFoo_Impl(
        `val` = `val`,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableFoo_Impl(
    override var `val`: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFoo, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFoo>() {
    override val descriptor get() = pbandk.testpb.Foo.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit) =
        toMutableFoo().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.`val` = `val`
        this.unknownFields += unknownFields
    }.toFoo()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.Foo)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFoo() = Foo_Impl(
        `val` = `val`,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableFoo() = MutableFoo_Impl(
        `val` = `val`,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Foo {
    var `val` = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> `val` = _fieldValue as String
        }
    }
    return Foo_Impl(`val`, unknownFields)
}

@Deprecated("Use Bar { } instead")
public fun Bar(
    foos: List<pbandk.testpb.Foo> = emptyList(),
    singleFoo: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Bar = pbandk.testpb.Bar {
    this.foos += foos
    this.singleFoo = singleFoo
    this.unknownFields += unknownFields
}

public fun MutableBar(): pbandk.testpb.MutableBar = pbandk.testpb.MutableBar_Impl(
    foos = mutableListOf(),
    singleFoo = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Bar(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.Bar =
    pbandk.testpb.MutableBar().also(builderAction).toBar()

public fun MutableBar(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.MutableBar =
    pbandk.testpb.MutableBar().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForBar")
public fun Bar?.orDefault(): pbandk.testpb.Bar = this ?: pbandk.testpb.Bar.defaultInstance

private class Bar_Impl(
    override val foos: List<pbandk.testpb.Foo>,
    override val singleFoo: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Bar, pbandk.GeneratedMessage<pbandk.testpb.Bar>() {
    override val descriptor get() = pbandk.testpb.Bar.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit) =
        toMutableBar().apply(builderAction).toBar()

    @Deprecated("Use copy {} instead")
    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.foos += foos
        this.singleFoo = singleFoo
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.Bar)?.let {
        it.copy(
            foos = foos + other.foos,
            singleFoo = singleFoo?.plus(other.singleFoo) ?: other.singleFoo,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableBar() = MutableBar_Impl(
        foos = foos.toMutableList(),
        singleFoo = singleFoo,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableBar_Impl(
    override val foos: MutableList<pbandk.testpb.Foo>,
    override var singleFoo: pbandk.testpb.Foo?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableBar, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableBar>() {
    override val descriptor get() = pbandk.testpb.Bar.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit) =
        toMutableBar().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.foos += foos
        this.singleFoo = singleFoo
        this.unknownFields += unknownFields
    }.toBar()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.Bar)?.let {
        it.copy(
            foos = foos + other.foos,
            singleFoo = singleFoo?.plus(other.singleFoo) ?: other.singleFoo,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toBar() = Bar_Impl(
        foos = foos.toList(),
        singleFoo = singleFoo,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableBar() = MutableBar_Impl(
        foos = foos.toMutableList(),
        singleFoo = singleFoo,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Bar {
    var foos: pbandk.ListWithSize.Builder<pbandk.testpb.Foo>? = null
    var singleFoo: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foos = (foos ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.Foo> }
            2 -> singleFoo = _fieldValue as pbandk.testpb.Foo
        }
    }
    return Bar_Impl(pbandk.ListWithSize.Builder.fixed(foos), singleFoo, unknownFields)
}

@Deprecated("Use MessageWithMap { } instead")
public fun MessageWithMap(
    map: Map<String, String> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithMap = pbandk.testpb.MessageWithMap {
    this.map += map
    this.unknownFields += unknownFields
}

public fun MutableMessageWithMap(): pbandk.testpb.MutableMessageWithMap = pbandk.testpb.MutableMessageWithMap_Impl(
    map = mutableMapOf(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableMessageWithMap] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MessageWithMap(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MessageWithMap =
    pbandk.testpb.MutableMessageWithMap().also(builderAction).toMessageWithMap()

public fun MutableMessageWithMap(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MutableMessageWithMap =
    pbandk.testpb.MutableMessageWithMap().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMap")
public fun MessageWithMap?.orDefault(): pbandk.testpb.MessageWithMap = this ?: pbandk.testpb.MessageWithMap.defaultInstance

private class MessageWithMap_Impl(
    override val map: Map<String, String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithMap, pbandk.GeneratedMessage<pbandk.testpb.MessageWithMap>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit) =
        toMutableMessageWithMap().apply(builderAction).toMessageWithMap()

    @Deprecated("Use copy {} instead")
    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.map += map
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.MessageWithMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableMessageWithMap() = MutableMessageWithMap_Impl(
        map = map.toMutableMap(),
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableMessageWithMap_Impl(
    override val map: MutableMap<String, String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMessageWithMap, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableMessageWithMap>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit) =
        toMutableMessageWithMap().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.map += map
        this.unknownFields += unknownFields
    }.toMessageWithMap()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.MessageWithMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMessageWithMap() = MessageWithMap_Impl(
        map = map.toMap(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMessageWithMap() = MutableMessageWithMap_Impl(
        map = map.toMutableMap(),
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap {
    var map: pbandk.MessageMap.Builder<String, String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
        }
    }
    return MessageWithMap_Impl(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

@Deprecated("Use MessageWithMap.MapEntry { } instead")
public fun MessageWithMap.Companion.MapEntry(
    key: String = "",
    value: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithMap.MapEntry = pbandk.testpb.MessageWithMap.Companion.MapEntry {
    this.key = key
    this.value = value
    this.unknownFields += unknownFields
}

public fun MessageWithMap.Companion.MutableMapEntry(): pbandk.testpb.MessageWithMap.MutableMapEntry = pbandk.testpb.MessageWithMap_MutableMapEntry_Impl(
    key = "",
    value = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MessageWithMap.Companion.MapEntry(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit): pbandk.testpb.MessageWithMap.MapEntry =
    pbandk.testpb.MessageWithMap.Companion.MutableMapEntry().also(builderAction).toMapEntry()

public fun MessageWithMap.Companion.MutableMapEntry(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit): pbandk.testpb.MessageWithMap.MutableMapEntry =
    pbandk.testpb.MessageWithMap.Companion.MutableMapEntry().also(builderAction)

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableMessageWithMap.MapEntry(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit): pbandk.testpb.MessageWithMap.MapEntry =
    pbandk.testpb.MessageWithMap.MapEntry(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMapMapEntry")
public fun MessageWithMap.MapEntry?.orDefault(): pbandk.testpb.MessageWithMap.MapEntry = this ?: pbandk.testpb.MessageWithMap.MapEntry.defaultInstance

private class MessageWithMap_MapEntry_Impl(
    override val key: String,
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithMap.MapEntry, pbandk.GeneratedMessage<pbandk.testpb.MessageWithMap.MapEntry>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit) =
        toMutableMapEntry().apply(builderAction).toMapEntry()

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.MessageWithMap.MapEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableMapEntry() = MessageWithMap_MutableMapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MessageWithMap_MutableMapEntry_Impl(
    override var key: String,
    override var value: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithMap.MutableMapEntry, pbandk.MutableGeneratedMessage<pbandk.testpb.MessageWithMap.MutableMapEntry>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.MessageWithMap.MutableMapEntry.() -> Unit) =
        toMutableMapEntry().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }.toMapEntry()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.MessageWithMap.MapEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapEntry() = MessageWithMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMapEntry() = MessageWithMap_MutableMapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithMap.MapEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    return MessageWithMap_MapEntry_Impl(key, value, unknownFields)
}

@Deprecated("Use FooMap { } instead")
public fun FooMap(
    map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMap = pbandk.testpb.FooMap {
    this.map += map
    this.unknownFields += unknownFields
}

public fun MutableFooMap(): pbandk.testpb.MutableFooMap = pbandk.testpb.MutableFooMap_Impl(
    map = mutableMapOf(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableFooMap] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun FooMap(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.FooMap =
    pbandk.testpb.MutableFooMap().also(builderAction).toFooMap()

public fun MutableFooMap(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.MutableFooMap =
    pbandk.testpb.MutableFooMap().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFooMap")
public fun FooMap?.orDefault(): pbandk.testpb.FooMap = this ?: pbandk.testpb.FooMap.defaultInstance

private class FooMap_Impl(
    override val map: Map<String, pbandk.testpb.Foo?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMap, pbandk.GeneratedMessage<pbandk.testpb.FooMap>() {
    override val descriptor get() = pbandk.testpb.FooMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit) =
        toMutableFooMap().apply(builderAction).toFooMap()

    @Deprecated("Use copy {} instead")
    override fun copy(
        map: Map<String, pbandk.testpb.Foo?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.map += map
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableFooMap() = MutableFooMap_Impl(
        map = map.toMutableMap(),
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableFooMap_Impl(
    override val map: MutableMap<String, pbandk.testpb.Foo?>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFooMap, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFooMap>() {
    override val descriptor get() = pbandk.testpb.FooMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit) =
        toMutableFooMap().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        map: Map<String, pbandk.testpb.Foo?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.map += map
        this.unknownFields += unknownFields
    }.toFooMap()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMap)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFooMap() = FooMap_Impl(
        map = map.toMap(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableFooMap() = MutableFooMap_Impl(
        map = map.toMutableMap(),
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun FooMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.FooMap {
    var map: pbandk.MessageMap.Builder<String, pbandk.testpb.Foo?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.Foo?>> }
        }
    }
    return FooMap_Impl(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

@Deprecated("Use FooMap.MapEntry { } instead")
public fun FooMap.Companion.MapEntry(
    key: String = "",
    value: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMap.MapEntry = pbandk.testpb.FooMap.Companion.MapEntry {
    this.key = key
    this.value = value
    this.unknownFields += unknownFields
}

public fun FooMap.Companion.MutableMapEntry(): pbandk.testpb.FooMap.MutableMapEntry = pbandk.testpb.FooMap_MutableMapEntry_Impl(
    key = "",
    value = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun FooMap.Companion.MapEntry(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit): pbandk.testpb.FooMap.MapEntry =
    pbandk.testpb.FooMap.Companion.MutableMapEntry().also(builderAction).toMapEntry()

public fun FooMap.Companion.MutableMapEntry(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit): pbandk.testpb.FooMap.MutableMapEntry =
    pbandk.testpb.FooMap.Companion.MutableMapEntry().also(builderAction)

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableFooMap.MapEntry(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit): pbandk.testpb.FooMap.MapEntry =
    pbandk.testpb.FooMap.MapEntry(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapMapEntry")
public fun FooMap.MapEntry?.orDefault(): pbandk.testpb.FooMap.MapEntry = this ?: pbandk.testpb.FooMap.MapEntry.defaultInstance

private class FooMap_MapEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMap.MapEntry, pbandk.GeneratedMessage<pbandk.testpb.FooMap.MapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMap.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit) =
        toMutableMapEntry().apply(builderAction).toMapEntry()

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMap.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableMapEntry() = FooMap_MutableMapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class FooMap_MutableMapEntry_Impl(
    override var key: String,
    override var value: pbandk.testpb.Foo?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMap.MutableMapEntry, pbandk.MutableGeneratedMessage<pbandk.testpb.FooMap.MutableMapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMap.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.FooMap.MutableMapEntry.() -> Unit) =
        toMutableMapEntry().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }.toMapEntry()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMap.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapEntry() = FooMap_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMapEntry() = FooMap_MutableMapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun FooMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.FooMap.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }
    return FooMap_MapEntry_Impl(key, value, unknownFields)
}

@Deprecated("Use FooMapEntries { } instead")
public fun FooMapEntries(
    map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMapEntries = pbandk.testpb.FooMapEntries {
    this.map += map
    this.unknownFields += unknownFields
}

public fun MutableFooMapEntries(): pbandk.testpb.MutableFooMapEntries = pbandk.testpb.MutableFooMapEntries_Impl(
    map = mutableListOf(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableFooMapEntries] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun FooMapEntries(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.FooMapEntries =
    pbandk.testpb.MutableFooMapEntries().also(builderAction).toFooMapEntries()

public fun MutableFooMapEntries(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.MutableFooMapEntries =
    pbandk.testpb.MutableFooMapEntries().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntries")
public fun FooMapEntries?.orDefault(): pbandk.testpb.FooMapEntries = this ?: pbandk.testpb.FooMapEntries.defaultInstance

private class FooMapEntries_Impl(
    override val map: List<pbandk.testpb.FooMapEntries.MapEntry>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries, pbandk.GeneratedMessage<pbandk.testpb.FooMapEntries>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit) =
        toMutableFooMapEntries().apply(builderAction).toFooMapEntries()

    @Deprecated("Use copy {} instead")
    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.map += map
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMapEntries)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableFooMapEntries() = MutableFooMapEntries_Impl(
        map = map.toMutableList(),
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableFooMapEntries_Impl(
    override val map: MutableList<pbandk.testpb.FooMapEntries.MapEntry>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFooMapEntries, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFooMapEntries>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit) =
        toMutableFooMapEntries().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.map += map
        this.unknownFields += unknownFields
    }.toFooMapEntries()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMapEntries)?.let {
        it.copy(
            map = map + other.map,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFooMapEntries() = FooMapEntries_Impl(
        map = map.toList(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableFooMapEntries() = MutableFooMapEntries_Impl(
        map = map.toMutableList(),
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries {
    var map: pbandk.ListWithSize.Builder<pbandk.testpb.FooMapEntries.MapEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.FooMapEntries.MapEntry> }
        }
    }
    return FooMapEntries_Impl(pbandk.ListWithSize.Builder.fixed(map), unknownFields)
}

@Deprecated("Use FooMapEntries.MapEntry { } instead")
public fun FooMapEntries.Companion.MapEntry(
    key: String = "",
    value: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries.Companion.MapEntry {
    this.key = key
    this.value = value
    this.unknownFields += unknownFields
}

public fun FooMapEntries.Companion.MutableMapEntry(): pbandk.testpb.FooMapEntries.MutableMapEntry = pbandk.testpb.FooMapEntries_MutableMapEntry_Impl(
    key = "",
    value = null,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun FooMapEntries.Companion.MapEntry(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MapEntry =
    pbandk.testpb.FooMapEntries.Companion.MutableMapEntry().also(builderAction).toMapEntry()

public fun FooMapEntries.Companion.MutableMapEntry(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MutableMapEntry =
    pbandk.testpb.FooMapEntries.Companion.MutableMapEntry().also(builderAction)

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableFooMapEntries.MapEntry(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MapEntry =
    pbandk.testpb.FooMapEntries.MapEntry(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntriesMapEntry")
public fun FooMapEntries.MapEntry?.orDefault(): pbandk.testpb.FooMapEntries.MapEntry = this ?: pbandk.testpb.FooMapEntries.MapEntry.defaultInstance

private class FooMapEntries_MapEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries.MapEntry, pbandk.GeneratedMessage<pbandk.testpb.FooMapEntries.MapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit) =
        toMutableMapEntry().apply(builderAction).toMapEntry()

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMapEntries.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableMapEntry() = FooMapEntries_MutableMapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class FooMapEntries_MutableMapEntry_Impl(
    override var key: String,
    override var value: pbandk.testpb.Foo?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries.MutableMapEntry, pbandk.MutableGeneratedMessage<pbandk.testpb.FooMapEntries.MutableMapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit) =
        toMutableMapEntry().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }.toMapEntry()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.FooMapEntries.MapEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapEntry() = FooMapEntries_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMapEntry() = FooMapEntries_MutableMapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.FooMapEntries.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }
    return FooMapEntries_MapEntry_Impl(key, value, unknownFields)
}

@Deprecated("Use Wrappers { } instead")
public fun Wrappers(
    stringValue: String? = null,
    uint64Values: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Wrappers = pbandk.testpb.Wrappers {
    this.stringValue = stringValue
    this.uint64Values += uint64Values
    this.unknownFields += unknownFields
}

public fun MutableWrappers(): pbandk.testpb.MutableWrappers = pbandk.testpb.MutableWrappers_Impl(
    stringValue = null,
    uint64Values = mutableListOf(),
    unknownFields = mutableMapOf()
)

/**
 * The [MutableWrappers] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Wrappers(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.Wrappers =
    pbandk.testpb.MutableWrappers().also(builderAction).toWrappers()

public fun MutableWrappers(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.MutableWrappers =
    pbandk.testpb.MutableWrappers().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForWrappers")
public fun Wrappers?.orDefault(): pbandk.testpb.Wrappers = this ?: pbandk.testpb.Wrappers.defaultInstance

private class Wrappers_Impl(
    override val stringValue: String?,
    override val uint64Values: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Wrappers, pbandk.GeneratedMessage<pbandk.testpb.Wrappers>() {
    override val descriptor get() = pbandk.testpb.Wrappers.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit) =
        toMutableWrappers().apply(builderAction).toWrappers()

    @Deprecated("Use copy {} instead")
    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.stringValue = stringValue
        this.uint64Values += uint64Values
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.Wrappers)?.let {
        it.copy(
            stringValue = other.stringValue ?: stringValue,
            uint64Values = uint64Values + other.uint64Values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableWrappers() = MutableWrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values.toMutableList(),
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableWrappers_Impl(
    override var stringValue: String?,
    override val uint64Values: MutableList<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableWrappers, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableWrappers>() {
    override val descriptor get() = pbandk.testpb.Wrappers.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit) =
        toMutableWrappers().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.stringValue = stringValue
        this.uint64Values += uint64Values
        this.unknownFields += unknownFields
    }.toWrappers()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.testpb.Wrappers)?.let {
        it.copy(
            stringValue = other.stringValue ?: stringValue,
            uint64Values = uint64Values + other.uint64Values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toWrappers() = Wrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values.toList(),
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableWrappers() = MutableWrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values.toMutableList(),
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun Wrappers.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Wrappers {
    var stringValue: String? = null
    var uint64Values: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stringValue = _fieldValue as String
            2 -> uint64Values = (uint64Values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return Wrappers_Impl(stringValue, pbandk.ListWithSize.Builder.fixed(uint64Values), unknownFields)
}

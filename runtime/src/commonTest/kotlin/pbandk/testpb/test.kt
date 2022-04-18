@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface Foo : pbandk.Message {
    public val `val`: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Foo
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo>

    /**
     * The [MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.Foo

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        `val`: String = this.`val`,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Foo

    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        public val defaultInstance: pbandk.testpb.Foo by lazy { pbandk.testpb.Foo {} }

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
                        value = pbandk.testpb.Foo::`val`,
                        mutableValue = pbandk.testpb.MutableFoo::`val`,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Foo",
                messageClass = pbandk.testpb.Foo::class,
                messageCompanion = this,
                builder = ::Foo,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFoo : pbandk.testpb.Foo, pbandk.MutableMessage<pbandk.testpb.Foo> {
    public override var `val`: String
}

public sealed interface Bar : pbandk.Message {
    public val foos: List<pbandk.testpb.Foo>
    public val singleFoo: pbandk.testpb.Foo?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Bar
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar>

    /**
     * The [MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.Bar

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        foos: List<pbandk.testpb.Foo> = this.foos,
        singleFoo: pbandk.testpb.Foo? = this.singleFoo,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Bar

    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        public val defaultInstance: pbandk.testpb.Bar by lazy { pbandk.testpb.Bar {} }

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
                        value = pbandk.testpb.Bar::foos,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single_foo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                        jsonName = "singleFoo",
                        value = pbandk.testpb.Bar::singleFoo,
                        mutableValue = pbandk.testpb.MutableBar::singleFoo,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Bar",
                messageClass = pbandk.testpb.Bar::class,
                messageCompanion = this,
                builder = ::Bar,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableBar : pbandk.testpb.Bar, pbandk.MutableMessage<pbandk.testpb.Bar> {
    public override val foos: MutableList<pbandk.testpb.Foo>
    public override var singleFoo: pbandk.testpb.Foo?
}

public sealed interface MessageWithMap : pbandk.Message {
    public val map: Map<String, String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap>

    /**
     * The [MutableMessageWithMap] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MessageWithMap

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        map: Map<String, String> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        public val defaultInstance: pbandk.testpb.MessageWithMap by lazy { pbandk.testpb.MessageWithMap {} }

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
                        value = pbandk.testpb.MessageWithMap::map,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithMap",
                messageClass = pbandk.testpb.MessageWithMap::class,
                messageCompanion = this,
                builder = ::MessageWithMap,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMessageWithMap : pbandk.testpb.MessageWithMap, pbandk.MutableMessage<pbandk.testpb.MessageWithMap> {
    public override val map: MutableMap<String, String>
}

public sealed interface FooMap : pbandk.Message {
    public val map: Map<String, pbandk.testpb.Foo?>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap>

    /**
     * The [MutableFooMap] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.FooMap

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        map: Map<String, pbandk.testpb.Foo?> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMap

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        public val defaultInstance: pbandk.testpb.FooMap by lazy { pbandk.testpb.FooMap {} }

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
                        value = pbandk.testpb.FooMap::map,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.FooMap",
                messageClass = pbandk.testpb.FooMap::class,
                messageCompanion = this,
                builder = ::FooMap,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFooMap : pbandk.testpb.FooMap, pbandk.MutableMessage<pbandk.testpb.FooMap> {
    public override val map: MutableMap<String, pbandk.testpb.Foo?>
}

public sealed interface FooMapEntries : pbandk.Message {
    public val map: List<pbandk.testpb.FooMapEntries.MapEntry>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries>

    /**
     * The [MutableFooMapEntries] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.FooMapEntries

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMapEntries

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        public val defaultInstance: pbandk.testpb.FooMapEntries by lazy { pbandk.testpb.FooMapEntries {} }

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
                        value = pbandk.testpb.FooMapEntries::map,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.FooMapEntries",
                messageClass = pbandk.testpb.FooMapEntries::class,
                messageCompanion = this,
                builder = ::FooMapEntries,
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
         * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MapEntry

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            key: String = this.key,
            value: pbandk.testpb.Foo? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.FooMapEntries.MapEntry

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            public val defaultInstance: pbandk.testpb.FooMapEntries.MapEntry by lazy { pbandk.testpb.FooMapEntries.MapEntry {} }

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
                            value = pbandk.testpb.FooMapEntries.MapEntry::key,
                            mutableValue = pbandk.testpb.FooMapEntries.MutableMapEntry::key,
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.FooMapEntries.MapEntry::value,
                            mutableValue = pbandk.testpb.FooMapEntries.MutableMapEntry::value,
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "testpb.FooMapEntries.MapEntry",
                    messageClass = pbandk.testpb.FooMapEntries.MapEntry::class,
                    messageCompanion = this,
                    builder = FooMapEntries.Companion::MapEntry,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapEntry : pbandk.testpb.FooMapEntries.MapEntry, pbandk.MutableMessage<pbandk.testpb.FooMapEntries.MapEntry> {
        public override var key: String
        public override var value: pbandk.testpb.Foo?
    }
}

public sealed interface MutableFooMapEntries : pbandk.testpb.FooMapEntries, pbandk.MutableMessage<pbandk.testpb.FooMapEntries> {
    public override val map: MutableList<pbandk.testpb.FooMapEntries.MapEntry>
}

public sealed interface Wrappers : pbandk.Message {
    public val stringValue: String?
    public val uint64Values: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Wrappers
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers>

    /**
     * The [MutableWrappers] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.Wrappers

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        stringValue: String? = this.stringValue,
        uint64Values: List<Long> = this.uint64Values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Wrappers

    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        public val defaultInstance: pbandk.testpb.Wrappers by lazy { pbandk.testpb.Wrappers {} }

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
                        value = pbandk.testpb.Wrappers::stringValue,
                        mutableValue = pbandk.testpb.MutableWrappers::stringValue,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64_values",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "uint64Values",
                        value = pbandk.testpb.Wrappers::uint64Values,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Wrappers",
                messageClass = pbandk.testpb.Wrappers::class,
                messageCompanion = this,
                builder = ::Wrappers,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableWrappers : pbandk.testpb.Wrappers, pbandk.MutableMessage<pbandk.testpb.Wrappers> {
    public override var stringValue: String?
    public override val uint64Values: MutableList<Long>
}

@Deprecated(
    message = "Use Foo { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Foo"],
        expression = "Foo {\nthis.`val` = `val`\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Foo(
    `val`: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Foo = pbandk.testpb.Foo {
    this.`val` = `val`
    this.unknownFields += unknownFields
}

/**
 * The [MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFoo")
public fun Foo(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.Foo = pbandk.testpb.MutableFoo_Impl(
    `val` = "",
    unknownFields = mutableMapOf()
).also(builderAction).toFoo()

@pbandk.Export
@pbandk.JsName("orDefaultForFoo")
public fun Foo?.orDefault(): pbandk.testpb.Foo = this ?: pbandk.testpb.Foo.defaultInstance

private class Foo_Impl(
    override val `val`: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Foo, pbandk.gen.GeneratedMessage<pbandk.testpb.Foo>() {
    override val descriptor get() = pbandk.testpb.Foo.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit) = pbandk.testpb.Foo {
        this.`val` = this@Foo_Impl.`val`
        this.unknownFields += this@Foo_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Foo {
        this.`val` = `val`
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFoo_Impl(
    override var `val`: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFoo, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Foo>() {
    override val descriptor get() = pbandk.testpb.Foo.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFoo() = Foo_Impl(
        `val` = `val`,
        unknownFields = unknownFields.toMap()
    )
}

private fun Foo.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Foo {
    if (other !is pbandk.testpb.Foo) return this

    return copy {
        `val` = other.`val`
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use Bar { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Bar"],
        expression = "Bar {\nthis.foos += foos\nthis.singleFoo = singleFoo\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Bar(
    foos: List<pbandk.testpb.Foo> = emptyList(),
    singleFoo: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Bar = pbandk.testpb.Bar {
    this.foos += foos
    this.singleFoo = singleFoo
    this.unknownFields += unknownFields
}

/**
 * The [MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildBar")
public fun Bar(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.Bar = pbandk.testpb.MutableBar_Impl(
    foos = pbandk.gen.MutableListField(),
    singleFoo = null,
    unknownFields = mutableMapOf()
).also(builderAction).toBar()

@pbandk.Export
@pbandk.JsName("orDefaultForBar")
public fun Bar?.orDefault(): pbandk.testpb.Bar = this ?: pbandk.testpb.Bar.defaultInstance

private class Bar_Impl(
    override val foos: pbandk.gen.ListField<pbandk.testpb.Foo>,
    override val singleFoo: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Bar, pbandk.gen.GeneratedMessage<pbandk.testpb.Bar>() {
    override val descriptor get() = pbandk.testpb.Bar.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit) = pbandk.testpb.Bar {
        this.foos += this@Bar_Impl.foos
        this.singleFoo = this@Bar_Impl.singleFoo
        this.unknownFields += this@Bar_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Bar {
        this.foos += foos
        this.singleFoo = singleFoo
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableBar_Impl(
    override val foos: pbandk.gen.MutableListField<pbandk.testpb.Foo>,
    override var singleFoo: pbandk.testpb.Foo?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableBar, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Bar>() {
    override val descriptor get() = pbandk.testpb.Bar.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toBar() = Bar_Impl(
        foos = foos.toListField(),
        singleFoo = singleFoo,
        unknownFields = unknownFields.toMap()
    )
}

private fun Bar.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Bar {
    if (other !is pbandk.testpb.Bar) return this

    return copy {
        foos += other.foos
        singleFoo = singleFoo?.plus(other.singleFoo) ?: other.singleFoo
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use MessageWithMap { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageWithMap"],
        expression = "MessageWithMap {\nthis.map += map\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageWithMap(
    map: Map<String, String> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithMap = pbandk.testpb.MessageWithMap {
    this.map += map
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageWithMap] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithMap")
public fun MessageWithMap(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MessageWithMap = pbandk.testpb.MutableMessageWithMap_Impl(
    map = pbandk.gen.MutableMapField(pbandk.testpb.MessageWithMap.descriptor.fields[1]),
    unknownFields = mutableMapOf()
).also(builderAction).toMessageWithMap()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMap")
public fun MessageWithMap?.orDefault(): pbandk.testpb.MessageWithMap = this ?: pbandk.testpb.MessageWithMap.defaultInstance

private class MessageWithMap_Impl(
    override val map: pbandk.gen.MapField<String, String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithMap, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithMap>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit) = pbandk.testpb.MessageWithMap {
        this.map += this@MessageWithMap_Impl.map
        this.unknownFields += this@MessageWithMap_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MessageWithMap {
        this.map += map
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMessageWithMap_Impl(
    override val map: pbandk.gen.MutableMapField<String, String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMessageWithMap, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithMap>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMessageWithMap() = MessageWithMap_Impl(
        map = map.toMapField(),
        unknownFields = unknownFields.toMap()
    )
}

private fun MessageWithMap.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MessageWithMap {
    if (other !is pbandk.testpb.MessageWithMap) return this

    return copy {
        map += other.map
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use FooMap { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.FooMap"],
        expression = "FooMap {\nthis.map += map\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FooMap(
    map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMap = pbandk.testpb.FooMap {
    this.map += map
    this.unknownFields += unknownFields
}

/**
 * The [MutableFooMap] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFooMap")
public fun FooMap(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.FooMap = pbandk.testpb.MutableFooMap_Impl(
    map = pbandk.gen.MutableMapField(pbandk.testpb.FooMap.descriptor.fields[1]),
    unknownFields = mutableMapOf()
).also(builderAction).toFooMap()

@pbandk.Export
@pbandk.JsName("orDefaultForFooMap")
public fun FooMap?.orDefault(): pbandk.testpb.FooMap = this ?: pbandk.testpb.FooMap.defaultInstance

private class FooMap_Impl(
    override val map: pbandk.gen.MapField<String, pbandk.testpb.Foo?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMap, pbandk.gen.GeneratedMessage<pbandk.testpb.FooMap>() {
    override val descriptor get() = pbandk.testpb.FooMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit) = pbandk.testpb.FooMap {
        this.map += this@FooMap_Impl.map
        this.unknownFields += this@FooMap_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, pbandk.testpb.Foo?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FooMap {
        this.map += map
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFooMap_Impl(
    override val map: pbandk.gen.MutableMapField<String, pbandk.testpb.Foo?>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFooMap, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FooMap>() {
    override val descriptor get() = pbandk.testpb.FooMap.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, pbandk.testpb.Foo?>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFooMap() = FooMap_Impl(
        map = map.toMapField(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FooMap.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.FooMap {
    if (other !is pbandk.testpb.FooMap) return this

    return copy {
        map += other.map
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use FooMapEntries { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.FooMapEntries"],
        expression = "FooMapEntries {\nthis.map += map\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FooMapEntries(
    map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMapEntries = pbandk.testpb.FooMapEntries {
    this.map += map
    this.unknownFields += unknownFields
}

/**
 * The [MutableFooMapEntries] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFooMapEntries")
public fun FooMapEntries(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.FooMapEntries = pbandk.testpb.MutableFooMapEntries_Impl(
    map = pbandk.gen.MutableListField(),
    unknownFields = mutableMapOf()
).also(builderAction).toFooMapEntries()

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntries")
public fun FooMapEntries?.orDefault(): pbandk.testpb.FooMapEntries = this ?: pbandk.testpb.FooMapEntries.defaultInstance

private class FooMapEntries_Impl(
    override val map: pbandk.gen.ListField<pbandk.testpb.FooMapEntries.MapEntry>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries, pbandk.gen.GeneratedMessage<pbandk.testpb.FooMapEntries>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit) = pbandk.testpb.FooMapEntries {
        this.map += this@FooMapEntries_Impl.map
        this.unknownFields += this@FooMapEntries_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FooMapEntries {
        this.map += map
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFooMapEntries_Impl(
    override val map: pbandk.gen.MutableListField<pbandk.testpb.FooMapEntries.MapEntry>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFooMapEntries, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FooMapEntries>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFooMapEntries() = FooMapEntries_Impl(
        map = map.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FooMapEntries.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.FooMapEntries {
    if (other !is pbandk.testpb.FooMapEntries) return this

    return copy {
        map += other.map
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use FooMapEntries.MapEntry { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.FooMapEntries.MapEntry"],
        expression = "FooMapEntries.MapEntry {\nthis.key = key\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FooMapEntries.Companion.MapEntry(
    key: String = "",
    value: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries.Companion.MapEntry {
    this.key = key
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFooMapEntriesMapEntry")
public fun FooMapEntries.Companion.MapEntry(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries_MutableMapEntry_Impl(
    key = "",
    value = null,
    unknownFields = mutableMapOf()
).also(builderAction).toMapEntry()

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
) : pbandk.testpb.FooMapEntries.MapEntry, pbandk.gen.GeneratedMessage<pbandk.testpb.FooMapEntries.MapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit) = pbandk.testpb.FooMapEntries.MapEntry {
        this.key = this@FooMapEntries_MapEntry_Impl.key
        this.value = this@FooMapEntries_MapEntry_Impl.value
        this.unknownFields += this@FooMapEntries_MapEntry_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FooMapEntries.MapEntry {
        this.key = key
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class FooMapEntries_MutableMapEntry_Impl(
    override var key: String,
    override var value: pbandk.testpb.Foo?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries.MutableMapEntry, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FooMapEntries.MapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor

    override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMapEntry() = FooMapEntries_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun FooMapEntries.MapEntry.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.FooMapEntries.MapEntry {
    if (other !is pbandk.testpb.FooMapEntries.MapEntry) return this

    return copy {
        key = other.key
        value = value?.plus(other.value) ?: other.value
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use Wrappers { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Wrappers"],
        expression = "Wrappers {\nthis.stringValue = stringValue\nthis.uint64Values += uint64Values\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Wrappers(
    stringValue: String? = null,
    uint64Values: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Wrappers = pbandk.testpb.Wrappers {
    this.stringValue = stringValue
    this.uint64Values += uint64Values
    this.unknownFields += unknownFields
}

/**
 * The [MutableWrappers] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildWrappers")
public fun Wrappers(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.Wrappers = pbandk.testpb.MutableWrappers_Impl(
    stringValue = null,
    uint64Values = pbandk.gen.MutableListField(),
    unknownFields = mutableMapOf()
).also(builderAction).toWrappers()

@pbandk.Export
@pbandk.JsName("orDefaultForWrappers")
public fun Wrappers?.orDefault(): pbandk.testpb.Wrappers = this ?: pbandk.testpb.Wrappers.defaultInstance

private class Wrappers_Impl(
    override val stringValue: String?,
    override val uint64Values: pbandk.gen.ListField<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Wrappers, pbandk.gen.GeneratedMessage<pbandk.testpb.Wrappers>() {
    override val descriptor get() = pbandk.testpb.Wrappers.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit) = pbandk.testpb.Wrappers {
        this.stringValue = this@Wrappers_Impl.stringValue
        this.uint64Values += this@Wrappers_Impl.uint64Values
        this.unknownFields += this@Wrappers_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Wrappers {
        this.stringValue = stringValue
        this.uint64Values += uint64Values
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableWrappers_Impl(
    override var stringValue: String?,
    override val uint64Values: pbandk.gen.MutableListField<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableWrappers, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Wrappers>() {
    override val descriptor get() = pbandk.testpb.Wrappers.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toWrappers() = Wrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

private fun Wrappers.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Wrappers {
    if (other !is pbandk.testpb.Wrappers) return this

    return copy {
        stringValue = other.stringValue ?: stringValue
        uint64Values += other.uint64Values
        unknownFields += other.unknownFields
    }
}

@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val `val`: pbandk.FieldDescriptor<pbandk.testpb.Foo, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.testpb.Foo::descriptor,
                name = "val",
                number = 1,
                type = pbandk.FieldDescriptor.Type.string(),
                jsonName = "val",
                value = pbandk.testpb.Foo::`val`,
                mutableValue = pbandk.testpb.MutableFoo::`val`,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        public val defaultInstance: pbandk.testpb.Foo by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Foo {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "testpb.Foo",
                messageClass = pbandk.testpb.Foo::class,
                messageCompanion = this,
                builder = ::Foo,
                fields = listOf(
                    pbandk.testpb.Foo.FieldDescriptors.`val`,
                ),
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val foos: pbandk.FieldDescriptor<pbandk.testpb.Bar, List<pbandk.testpb.Foo>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Bar::descriptor,
                name = "foos",
                number = 1,
                type = pbandk.FieldDescriptor.Type.repeated(valueType = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.Foo.Companion)),
                jsonName = "foos",
                value = pbandk.testpb.Bar::foos,
                mutableValue = pbandk.testpb.MutableBar::foos,
            )
        public val singleFoo: pbandk.FieldDescriptor<pbandk.testpb.Bar, pbandk.testpb.Foo?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Bar::descriptor,
                name = "single_foo",
                number = 2,
                type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.Foo.Companion),
                jsonName = "singleFoo",
                value = pbandk.testpb.Bar::singleFoo,
                mutableValue = pbandk.testpb.MutableBar::singleFoo,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        public val defaultInstance: pbandk.testpb.Bar by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Bar {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "testpb.Bar",
                messageClass = pbandk.testpb.Bar::class,
                messageCompanion = this,
                builder = ::Bar,
                fields = listOf(
                    pbandk.testpb.Bar.FieldDescriptors.foos,
                    pbandk.testpb.Bar.FieldDescriptors.singleFoo,
                ),
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val map: pbandk.FieldDescriptor<pbandk.testpb.MessageWithMap, Map<String, String>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.testpb.MessageWithMap::descriptor,
                name = "map",
                number = 1,
                type = pbandk.FieldDescriptor.Type.map(keyType = pbandk.FieldDescriptor.Type.string(), valueType = pbandk.FieldDescriptor.Type.string()),
                jsonName = "map",
                value = pbandk.testpb.MessageWithMap::map,
                mutableValue = pbandk.testpb.MutableMessageWithMap::map,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        public val defaultInstance: pbandk.testpb.MessageWithMap by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MessageWithMap {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "testpb.MessageWithMap",
                messageClass = pbandk.testpb.MessageWithMap::class,
                messageCompanion = this,
                builder = ::MessageWithMap,
                fields = listOf(
                    pbandk.testpb.MessageWithMap.FieldDescriptors.map,
                ),
            )
        }
    }
}

public sealed interface MutableMessageWithMap : pbandk.testpb.MessageWithMap, pbandk.MutableMessage<pbandk.testpb.MessageWithMap> {
    public override val map: MutableMap<String, String>
}

public sealed interface FooMap : pbandk.Message {
    public val map: Map<String, pbandk.testpb.Foo>

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
        map: Map<String, pbandk.testpb.Foo> = this.map,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FooMap

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val map: pbandk.FieldDescriptor<pbandk.testpb.FooMap, Map<String, pbandk.testpb.Foo>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.testpb.FooMap::descriptor,
                name = "map",
                number = 1,
                type = pbandk.FieldDescriptor.Type.map(keyType = pbandk.FieldDescriptor.Type.string(), valueType = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.Foo.Companion)),
                jsonName = "map",
                value = pbandk.testpb.FooMap::map,
                mutableValue = pbandk.testpb.MutableFooMap::map,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        public val defaultInstance: pbandk.testpb.FooMap by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.FooMap {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "testpb.FooMap",
                messageClass = pbandk.testpb.FooMap::class,
                messageCompanion = this,
                builder = ::FooMap,
                fields = listOf(
                    pbandk.testpb.FooMap.FieldDescriptors.map,
                ),
            )
        }
    }
}

public sealed interface MutableFooMap : pbandk.testpb.FooMap, pbandk.MutableMessage<pbandk.testpb.FooMap> {
    public override val map: MutableMap<String, pbandk.testpb.Foo>
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val map: pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries, List<pbandk.testpb.FooMapEntries.MapEntry>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.FooMapEntries::descriptor,
                name = "map",
                number = 1,
                type = pbandk.FieldDescriptor.Type.repeated(valueType = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.FooMapEntries.MapEntry.Companion)),
                jsonName = "map",
                value = pbandk.testpb.FooMapEntries::map,
                mutableValue = pbandk.testpb.MutableFooMapEntries::map,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        public val defaultInstance: pbandk.testpb.FooMapEntries by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.FooMapEntries {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "testpb.FooMapEntries",
                messageClass = pbandk.testpb.FooMapEntries::class,
                messageCompanion = this,
                builder = ::FooMapEntries,
                fields = listOf(
                    pbandk.testpb.FooMapEntries.FieldDescriptors.map,
                ),
            )
        }

        @Deprecated(
            message = "Use FooMapEntries.MapEntry { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.testpb.FooMapEntries.MapEntry"],
                expression = "FooMapEntries.MapEntry {\nthis.key = key\nthis.value = value\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun MapEntry(
            key: String = "",
            value: pbandk.testpb.Foo? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FooMapEntries.MapEntry = pbandk.testpb.FooMapEntries.MapEntry {
            this.key = key
            this.value = value
            this.unknownFields += unknownFields
        }
    }

    public sealed interface MapEntry : pbandk.Message {
        public val key: String
        public val value: pbandk.testpb.Foo?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry>

        /**
         * The [FooMapEntries.MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
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

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val key: pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries.MapEntry, String> =
                pbandk.FieldDescriptor.of(
                    messageDescriptor = pbandk.testpb.FooMapEntries.MapEntry::descriptor,
                    name = "key",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.string(),
                    jsonName = "key",
                    value = pbandk.testpb.FooMapEntries.MapEntry::key,
                    mutableValue = pbandk.testpb.FooMapEntries.MutableMapEntry::key,
                )
            public val value: pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries.MapEntry, pbandk.testpb.Foo?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.testpb.FooMapEntries.MapEntry::descriptor,
                    name = "value",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.Foo.Companion),
                    jsonName = "value",
                    value = pbandk.testpb.FooMapEntries.MapEntry::value,
                    mutableValue = pbandk.testpb.FooMapEntries.MutableMapEntry::value,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            public val defaultInstance: pbandk.testpb.FooMapEntries.MapEntry by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.testpb.FooMapEntries.MapEntry {}
            }

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry> by lazy {
                pbandk.MessageDescriptor.of(
                    fullName = "testpb.FooMapEntries.MapEntry",
                    messageClass = pbandk.testpb.FooMapEntries.MapEntry::class,
                    messageCompanion = this,
                    builder = FooMapEntries.Companion::MapEntry,
                    fields = listOf(
                        pbandk.testpb.FooMapEntries.MapEntry.FieldDescriptors.key,
                        pbandk.testpb.FooMapEntries.MapEntry.FieldDescriptors.value,
                    ),
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val stringValue: pbandk.FieldDescriptor<pbandk.testpb.Wrappers, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Wrappers::descriptor,
                name = "string_value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.wkt.StringValue.Companion),
                jsonName = "stringValue",
                value = pbandk.testpb.Wrappers::stringValue,
                mutableValue = pbandk.testpb.MutableWrappers::stringValue,
            )
        public val uint64Values: pbandk.FieldDescriptor<pbandk.testpb.Wrappers, List<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Wrappers::descriptor,
                name = "uint64_values",
                number = 2,
                type = pbandk.FieldDescriptor.Type.repeated(valueType = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                jsonName = "uint64Values",
                value = pbandk.testpb.Wrappers::uint64Values,
                mutableValue = pbandk.testpb.MutableWrappers::uint64Values,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        public val defaultInstance: pbandk.testpb.Wrappers by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Wrappers {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "testpb.Wrappers",
                messageClass = pbandk.testpb.Wrappers::class,
                messageCompanion = this,
                builder = ::Wrappers,
                fields = listOf(
                    pbandk.testpb.Wrappers.FieldDescriptors.stringValue,
                    pbandk.testpb.Wrappers.FieldDescriptors.uint64Values,
                ),
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
public fun Foo(builderAction: pbandk.testpb.MutableFoo.() -> Unit): pbandk.testpb.Foo =
    pbandk.testpb.MutableFoo_Impl(
        `val` = "",
    ).also(builderAction).toFoo()

@pbandk.Export
@pbandk.JsName("orDefaultForFoo")
public fun Foo?.orDefault(): pbandk.testpb.Foo = this ?: pbandk.testpb.Foo.defaultInstance

private class Foo_Impl(
    override val `val`: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Foo, pbandk.gen.GeneratedMessage<pbandk.testpb.Foo>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Foo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Foo {
        this.`val` = `val`
        this.unknownFields += unknownFields
    }
}

private class MutableFoo_Impl(
    override var `val`: String,
) : pbandk.testpb.MutableFoo, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Foo>() {
    override val descriptor get() = pbandk.testpb.Foo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFoo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        `val`: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFoo() = Foo_Impl(
        `val` = `val`,
        unknownFields = unknownFields.toMap()
    )
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
public fun Bar(builderAction: pbandk.testpb.MutableBar.() -> Unit): pbandk.testpb.Bar =
    pbandk.testpb.MutableBar_Impl(
        foos = pbandk.gen.MutableListField(pbandk.testpb.Bar.FieldDescriptors.foos),
        singleFoo = null,
    ).also(builderAction).toBar()

@pbandk.Export
@pbandk.JsName("orDefaultForBar")
public fun Bar?.orDefault(): pbandk.testpb.Bar = this ?: pbandk.testpb.Bar.defaultInstance

private class Bar_Impl(
    override val foos: pbandk.gen.ListField<pbandk.testpb.Foo>,
    override val singleFoo: pbandk.testpb.Foo?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Bar, pbandk.gen.GeneratedMessage<pbandk.testpb.Bar>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Bar.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit) = super.copy(builderAction)

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
}

private class MutableBar_Impl(
    override val foos: pbandk.gen.MutableListField<pbandk.testpb.Foo>,
    override var singleFoo: pbandk.testpb.Foo?,
) : pbandk.testpb.MutableBar, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Bar>() {
    override val descriptor get() = pbandk.testpb.Bar.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableBar.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foos: List<pbandk.testpb.Foo>,
        singleFoo: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toBar() = Bar_Impl(
        foos = foos.toListField(),
        singleFoo = singleFoo,
        unknownFields = unknownFields.toMap()
    )
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
public fun MessageWithMap(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit): pbandk.testpb.MessageWithMap =
    pbandk.testpb.MutableMessageWithMap_Impl(
        map = pbandk.gen.MutableMapField(pbandk.testpb.MessageWithMap.FieldDescriptors.map),
    ).also(builderAction).toMessageWithMap()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithMap")
public fun MessageWithMap?.orDefault(): pbandk.testpb.MessageWithMap = this ?: pbandk.testpb.MessageWithMap.defaultInstance

private class MessageWithMap_Impl(
    override val map: pbandk.gen.MapField<String, String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithMap, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithMap>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithMap.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MessageWithMap {
        this.map += map
        this.unknownFields += unknownFields
    }
}

private class MutableMessageWithMap_Impl(
    override val map: pbandk.gen.MutableMapField<String, String>,
) : pbandk.testpb.MutableMessageWithMap, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithMap>() {
    override val descriptor get() = pbandk.testpb.MessageWithMap.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithMap.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageWithMap() = MessageWithMap_Impl(
        map = map.toMapField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FooMap { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.FooMap"],
        expression = "FooMap {\nthis.map += map\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FooMap(
    map: Map<String, pbandk.testpb.Foo> = emptyMap(),
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
public fun FooMap(builderAction: pbandk.testpb.MutableFooMap.() -> Unit): pbandk.testpb.FooMap =
    pbandk.testpb.MutableFooMap_Impl(
        map = pbandk.gen.MutableMapField(pbandk.testpb.FooMap.FieldDescriptors.map),
    ).also(builderAction).toFooMap()

@pbandk.Export
@pbandk.JsName("orDefaultForFooMap")
public fun FooMap?.orDefault(): pbandk.testpb.FooMap = this ?: pbandk.testpb.FooMap.defaultInstance

private class FooMap_Impl(
    override val map: pbandk.gen.MapField<String, pbandk.testpb.Foo>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMap, pbandk.gen.GeneratedMessage<pbandk.testpb.FooMap>(unknownFields) {
    override val descriptor get() = pbandk.testpb.FooMap.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, pbandk.testpb.Foo>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FooMap {
        this.map += map
        this.unknownFields += unknownFields
    }
}

private class MutableFooMap_Impl(
    override val map: pbandk.gen.MutableMapField<String, pbandk.testpb.Foo>,
) : pbandk.testpb.MutableFooMap, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FooMap>() {
    override val descriptor get() = pbandk.testpb.FooMap.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFooMap.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: Map<String, pbandk.testpb.Foo>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFooMap() = FooMap_Impl(
        map = map.toMapField(),
        unknownFields = unknownFields.toMap()
    )
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
public fun FooMapEntries(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit): pbandk.testpb.FooMapEntries =
    pbandk.testpb.MutableFooMapEntries_Impl(
        map = pbandk.gen.MutableListField(pbandk.testpb.FooMapEntries.FieldDescriptors.map),
    ).also(builderAction).toFooMapEntries()

@pbandk.Export
@pbandk.JsName("orDefaultForFooMapEntries")
public fun FooMapEntries?.orDefault(): pbandk.testpb.FooMapEntries = this ?: pbandk.testpb.FooMapEntries.defaultInstance

private class FooMapEntries_Impl(
    override val map: pbandk.gen.ListField<pbandk.testpb.FooMapEntries.MapEntry>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries, pbandk.gen.GeneratedMessage<pbandk.testpb.FooMapEntries>(unknownFields) {
    override val descriptor get() = pbandk.testpb.FooMapEntries.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FooMapEntries {
        this.map += map
        this.unknownFields += unknownFields
    }
}

private class MutableFooMapEntries_Impl(
    override val map: pbandk.gen.MutableListField<pbandk.testpb.FooMapEntries.MapEntry>,
) : pbandk.testpb.MutableFooMapEntries, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FooMapEntries>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFooMapEntries.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        map: List<pbandk.testpb.FooMapEntries.MapEntry>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFooMapEntries() = FooMapEntries_Impl(
        map = map.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [FooMapEntries.MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFooMapEntriesMapEntry")
public fun FooMapEntries.Companion.MapEntry(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit): pbandk.testpb.FooMapEntries.MapEntry =
    pbandk.testpb.FooMapEntries_MutableMapEntry_Impl(
        key = "",
        value = null,
    ).also(builderAction).toMapEntry()

/**
 * The [FooMapEntries.MutableMapEntry] passed as a receiver to the [builderAction] is valid only inside that function.
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
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FooMapEntries.MapEntry, pbandk.gen.GeneratedMessage<pbandk.testpb.FooMapEntries.MapEntry>(unknownFields) {
    override val descriptor get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit) = super.copy(builderAction)

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
}

private class FooMapEntries_MutableMapEntry_Impl(
    override var key: String,
    override var value: pbandk.testpb.Foo?,
) : pbandk.testpb.FooMapEntries.MutableMapEntry, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FooMapEntries.MapEntry>() {
    override val descriptor get() = pbandk.testpb.FooMapEntries.MapEntry.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.FooMapEntries.MutableMapEntry.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        key: String,
        value: pbandk.testpb.Foo?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMapEntry() = FooMapEntries_MapEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields.toMap()
    )
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
public fun Wrappers(builderAction: pbandk.testpb.MutableWrappers.() -> Unit): pbandk.testpb.Wrappers =
    pbandk.testpb.MutableWrappers_Impl(
        stringValue = null,
        uint64Values = pbandk.gen.MutableListField(pbandk.testpb.Wrappers.FieldDescriptors.uint64Values),
    ).also(builderAction).toWrappers()

@pbandk.Export
@pbandk.JsName("orDefaultForWrappers")
public fun Wrappers?.orDefault(): pbandk.testpb.Wrappers = this ?: pbandk.testpb.Wrappers.defaultInstance

private class Wrappers_Impl(
    override val stringValue: String?,
    override val uint64Values: pbandk.gen.ListField<Long>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Wrappers, pbandk.gen.GeneratedMessage<pbandk.testpb.Wrappers>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Wrappers.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit) = super.copy(builderAction)

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
}

private class MutableWrappers_Impl(
    override var stringValue: String?,
    override val uint64Values: pbandk.gen.MutableListField<Long>,
) : pbandk.testpb.MutableWrappers, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Wrappers>() {
    override val descriptor get() = pbandk.testpb.Wrappers.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableWrappers.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        stringValue: String?,
        uint64Values: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toWrappers() = Wrappers_Impl(
        stringValue = stringValue,
        uint64Values = uint64Values.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface MessageWithRequiredField : pbandk.Message {
    public val foo: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithRequiredField
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField>

    /**
     * The [MutableMessageWithRequiredField] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit): pbandk.testpb.MessageWithRequiredField

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        foo: Boolean = this.foo,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithRequiredField

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val foo: pbandk.FieldDescriptor<pbandk.testpb.MessageWithRequiredField, Boolean> =
            pbandk.FieldDescriptor.ofRequired(
                messageDescriptor = pbandk.testpb.MessageWithRequiredField::descriptor,
                messageMetadata = pbandk.testpb.MessageWithRequiredField.messageMetadata,
                name = "foo",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "foo",
                value = pbandk.testpb.MessageWithRequiredField::foo,
                mutableValue = pbandk.testpb.MutableMessageWithRequiredField::foo,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithRequiredField>() {
        override val defaultInstance: pbandk.testpb.MessageWithRequiredField
            get() = throw UnsupportedOperationException("Messages with required fields don't have a default instance")

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "testpb.MessageWithRequiredField",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MessageWithRequiredField::class,
                messageCompanion = this,
                builder = ::MessageWithRequiredField,
                fields = listOf(
                    pbandk.testpb.MessageWithRequiredField.FieldDescriptors.foo,
                ),
            )
        }
    }
}

public sealed interface MutableMessageWithRequiredField : pbandk.testpb.MessageWithRequiredField, pbandk.MutableMessage<pbandk.testpb.MessageWithRequiredField> {
    public override var foo: Boolean
}

public sealed interface MessageWithEnum : pbandk.Message {
    public val value: pbandk.testpb.MessageWithEnum.EnumType?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithEnum
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithEnum>

    /**
     * The [MutableMessageWithEnum] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit): pbandk.testpb.MessageWithEnum

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: pbandk.testpb.MessageWithEnum.EnumType? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithEnum

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.testpb.MessageWithEnum, pbandk.testpb.MessageWithEnum.EnumType?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MessageWithEnum::descriptor,
                messageMetadata = pbandk.testpb.MessageWithEnum.messageMetadata,
                name = "value",
                number = 1,
                valueType = pbandk.types.enum(pbandk.testpb.MessageWithEnum.EnumType),
                jsonName = "value",
                value = pbandk.testpb.MessageWithEnum::value,
                mutableValue = pbandk.testpb.MutableMessageWithEnum::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithEnum>() {
        override val defaultInstance: pbandk.testpb.MessageWithEnum by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MessageWithEnum {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "testpb.MessageWithEnum",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithEnum> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MessageWithEnum::class,
                messageCompanion = this,
                builder = ::MessageWithEnum,
                fields = listOf(
                    pbandk.testpb.MessageWithEnum.FieldDescriptors.value,
                ),
            )
        }
    }

    public sealed interface EnumType : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.testpb.MessageWithEnum.EnumType>
            get() = pbandk.testpb.MessageWithEnum.EnumType.descriptor

        public object FOO : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.testpb.MessageWithEnum.EnumType>(
            value = 0,
            name = "FOO",
        )
        public object BAR : EnumType, pbandk.gen.GeneratedEnumValue<pbandk.testpb.MessageWithEnum.EnumType>(
            value = 1,
            name = "BAR",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : EnumType, pbandk.gen.UnrecognizedEnumValue<pbandk.testpb.MessageWithEnum.EnumType>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.MessageWithEnum.EnumType> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.testpb.MessageWithEnum.EnumType> =
                pbandk.EnumDescriptor.of(
                    fullName = "testpb.MessageWithEnum.EnumType",
                    enumClass = pbandk.testpb.MessageWithEnum.EnumType::class,
                    enumCompanion = this,
                )
            public val values: List<MessageWithEnum.EnumType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(FOO, BAR)
            }

            override fun fromValue(value: Int): pbandk.testpb.MessageWithEnum.EnumType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.testpb.MessageWithEnum.EnumType =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableMessageWithEnum : pbandk.testpb.MessageWithEnum, pbandk.MutableMessage<pbandk.testpb.MessageWithEnum> {
    public override var value: pbandk.testpb.MessageWithEnum.EnumType?
}

public sealed interface MessageWithGroup : pbandk.Message {
    public val foo: pbandk.testpb.MessageWithGroup.Foo?
    public val oneofWithGroup: OneofWithGroup<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup>

    /**
     * The [MutableMessageWithGroup] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageWithGroup.() -> Unit): pbandk.testpb.MessageWithGroup

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        foo: pbandk.testpb.MessageWithGroup.Foo? = this.foo,
        oneofWithGroup: pbandk.testpb.MessageWithGroup.OneofWithGroup<*>? = this.oneofWithGroup,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageWithGroup

    public val bar: pbandk.testpb.MessageWithGroup.Bar?

    public sealed interface OneofWithGroup<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class Bar(bar: pbandk.testpb.MessageWithGroup.Bar) :
            OneofWithGroup<pbandk.testpb.MessageWithGroup.Bar>, pbandk.gen.GeneratedOneOf<pbandk.testpb.MessageWithGroup, pbandk.testpb.MessageWithGroup.Bar>(bar, pbandk.testpb.MessageWithGroup.FieldDescriptors.bar)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val foo: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup, pbandk.testpb.MessageWithGroup.Foo?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MessageWithGroup::descriptor,
                messageMetadata = pbandk.testpb.MessageWithGroup.messageMetadata,
                name = "foo",
                number = 1,
                valueType = pbandk.types.group(pbandk.testpb.MessageWithGroup.Foo),
                jsonName = "foo",
                value = pbandk.testpb.MessageWithGroup::foo,
                mutableValue = pbandk.testpb.MutableMessageWithGroup::foo,
            )
        public val bar: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup, pbandk.testpb.MessageWithGroup.Bar?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.MessageWithGroup::descriptor,
                messageMetadata = pbandk.testpb.MessageWithGroup.messageMetadata,
                name = "bar",
                number = 2,
                valueType = pbandk.types.group(pbandk.testpb.MessageWithGroup.Bar),
                jsonName = "bar",
                value = pbandk.testpb.MessageWithGroup::bar,
                mutableValue = pbandk.testpb.MutableMessageWithGroup::bar,
            )

        public val oneofWithGroup: pbandk.OneofDescriptor<pbandk.testpb.MessageWithGroup, pbandk.testpb.MessageWithGroup.OneofWithGroup<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.testpb.MessageWithGroup::descriptor,
                name = "oneofWithGroup",
                value = pbandk.testpb.MessageWithGroup::oneofWithGroup,
                mutableValue = pbandk.testpb.MutableMessageWithGroup::oneofWithGroup,
                fields = listOf(
                    bar,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup>() {
        override val defaultInstance: pbandk.testpb.MessageWithGroup by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MessageWithGroup {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "testpb.MessageWithGroup",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MessageWithGroup::class,
                messageCompanion = this,
                builder = ::MessageWithGroup,
                fields = listOf(
                    pbandk.testpb.MessageWithGroup.FieldDescriptors.foo,
                ),
                oneofs = listOf(
                    pbandk.testpb.MessageWithGroup.FieldDescriptors.oneofWithGroup,
                ),
            )
        }

        @Deprecated(
            message = "Use MessageWithGroup.Foo { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.testpb.MessageWithGroup.Foo"],
                expression = "MessageWithGroup.Foo {\nthis.a = a\nthis.b = b\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun Foo(
            a: String? = null,
            b: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MessageWithGroup.Foo = pbandk.testpb.MessageWithGroup.Foo {
            this.a = a
            this.b = b
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use MessageWithGroup.Bar { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.testpb.MessageWithGroup.Bar"],
                expression = "MessageWithGroup.Bar {\nthis.c = c\nthis.d = d\nthis.nestedgroup = nestedgroup\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun Bar(
            c: Boolean? = null,
            d: Float? = null,
            nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MessageWithGroup.Bar = pbandk.testpb.MessageWithGroup.Bar {
            this.c = c
            this.d = d
            this.nestedgroup = nestedgroup
            this.unknownFields += unknownFields
        }
    }

    public sealed interface Foo : pbandk.Message {
        public val a: String?
        public val b: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup.Foo
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Foo>

        /**
         * The [MessageWithGroup.MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.testpb.MessageWithGroup.MutableFoo.() -> Unit): pbandk.testpb.MessageWithGroup.Foo

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            a: String? = this.a,
            b: Int? = this.b,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.MessageWithGroup.Foo

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val a: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup.Foo, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.testpb.MessageWithGroup.Foo::descriptor,
                    messageMetadata = pbandk.testpb.MessageWithGroup.Foo.messageMetadata,
                    name = "a",
                    number = 1,
                    valueType = pbandk.types.string(),
                    jsonName = "a",
                    value = pbandk.testpb.MessageWithGroup.Foo::a,
                    mutableValue = pbandk.testpb.MessageWithGroup.MutableFoo::a,
                )
            public val b: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup.Foo, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.testpb.MessageWithGroup.Foo::descriptor,
                    messageMetadata = pbandk.testpb.MessageWithGroup.Foo.messageMetadata,
                    name = "b",
                    number = 2,
                    valueType = pbandk.types.int32(),
                    jsonName = "b",
                    value = pbandk.testpb.MessageWithGroup.Foo::b,
                    mutableValue = pbandk.testpb.MessageWithGroup.MutableFoo::b,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup.Foo>() {
            override val defaultInstance: pbandk.testpb.MessageWithGroup.Foo by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.testpb.MessageWithGroup.Foo {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "testpb.MessageWithGroup.Foo",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Foo> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.testpb.MessageWithGroup.Foo::class,
                    messageCompanion = this,
                    builder = MessageWithGroup.Companion::Foo,
                    fields = listOf(
                        pbandk.testpb.MessageWithGroup.Foo.FieldDescriptors.a,
                        pbandk.testpb.MessageWithGroup.Foo.FieldDescriptors.b,
                    ),
                )
            }
        }
    }

    public sealed interface MutableFoo : pbandk.testpb.MessageWithGroup.Foo, pbandk.MutableMessage<pbandk.testpb.MessageWithGroup.Foo> {
        public override var a: String?
        public override var b: Int?
    }

    public sealed interface Bar : pbandk.Message {
        public val c: Boolean?
        public val d: Float?
        public val nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup.Bar
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar>

        /**
         * The [MessageWithGroup.MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.testpb.MessageWithGroup.MutableBar.() -> Unit): pbandk.testpb.MessageWithGroup.Bar

        @Deprecated("Use copy { } instead")
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            c: Boolean? = this.c,
            d: Float? = this.d,
            nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup? = this.nestedgroup,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.testpb.MessageWithGroup.Bar

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val c: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup.Bar, Boolean?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.testpb.MessageWithGroup.Bar::descriptor,
                    messageMetadata = pbandk.testpb.MessageWithGroup.Bar.messageMetadata,
                    name = "c",
                    number = 10,
                    valueType = pbandk.types.bool(),
                    jsonName = "c",
                    value = pbandk.testpb.MessageWithGroup.Bar::c,
                    mutableValue = pbandk.testpb.MessageWithGroup.MutableBar::c,
                )
            public val d: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup.Bar, Float?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.testpb.MessageWithGroup.Bar::descriptor,
                    messageMetadata = pbandk.testpb.MessageWithGroup.Bar.messageMetadata,
                    name = "d",
                    number = 11,
                    valueType = pbandk.types.float(),
                    jsonName = "d",
                    value = pbandk.testpb.MessageWithGroup.Bar::d,
                    mutableValue = pbandk.testpb.MessageWithGroup.MutableBar::d,
                )
            public val nestedgroup: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup.Bar, pbandk.testpb.MessageWithGroup.Bar.NestedGroup?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.testpb.MessageWithGroup.Bar::descriptor,
                    messageMetadata = pbandk.testpb.MessageWithGroup.Bar.messageMetadata,
                    name = "nestedgroup",
                    number = 12,
                    valueType = pbandk.types.group(pbandk.testpb.MessageWithGroup.Bar.NestedGroup),
                    jsonName = "nestedgroup",
                    value = pbandk.testpb.MessageWithGroup.Bar::nestedgroup,
                    mutableValue = pbandk.testpb.MessageWithGroup.MutableBar::nestedgroup,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup.Bar>() {
            override val defaultInstance: pbandk.testpb.MessageWithGroup.Bar by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.testpb.MessageWithGroup.Bar {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "testpb.MessageWithGroup.Bar",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.testpb.MessageWithGroup.Bar::class,
                    messageCompanion = this,
                    builder = MessageWithGroup.Companion::Bar,
                    fields = listOf(
                        pbandk.testpb.MessageWithGroup.Bar.FieldDescriptors.c,
                        pbandk.testpb.MessageWithGroup.Bar.FieldDescriptors.d,
                        pbandk.testpb.MessageWithGroup.Bar.FieldDescriptors.nestedgroup,
                    ),
                )
            }

            @Deprecated(
                message = "Use MessageWithGroup.Bar.NestedGroup { } instead",
                replaceWith = ReplaceWith(
                    imports = ["pbandk.testpb.MessageWithGroup.Bar.NestedGroup"],
                    expression = "MessageWithGroup.Bar.NestedGroup {\nthis.e = e\nthis.unknownFields += unknownFields\n}",
                )
            )
            public fun NestedGroup(
                e: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = pbandk.testpb.MessageWithGroup.Bar.NestedGroup {
                this.e = e
                this.unknownFields += unknownFields
            }
        }

        public sealed interface NestedGroup : pbandk.Message {
            public val e: Long?

            override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup.Bar.NestedGroup
            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar.NestedGroup>

            /**
             * The [MessageWithGroup.Bar.MutableNestedGroup] passed as a receiver to the [builderAction] is valid only inside that function.
             * Using it outside of the function produces an unspecified behavior.
             */
            public fun copy(builderAction: pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup.() -> Unit): pbandk.testpb.MessageWithGroup.Bar.NestedGroup

            @Deprecated("Use copy { } instead")
            @pbandk.JsName("copyDeprecated")
            public fun copy(
                e: Long? = this.e,
                unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
            ): pbandk.testpb.MessageWithGroup.Bar.NestedGroup

            @pbandk.PublicForGeneratedCode
            public object FieldDescriptors {
                public val e: pbandk.FieldDescriptor<pbandk.testpb.MessageWithGroup.Bar.NestedGroup, Long?> =
                    pbandk.FieldDescriptor.ofOptional(
                        messageDescriptor = pbandk.testpb.MessageWithGroup.Bar.NestedGroup::descriptor,
                        messageMetadata = pbandk.testpb.MessageWithGroup.Bar.NestedGroup.messageMetadata,
                        name = "e",
                        number = 1,
                        valueType = pbandk.types.uint64(),
                        jsonName = "e",
                        value = pbandk.testpb.MessageWithGroup.Bar.NestedGroup::e,
                        mutableValue = pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup::e,
                    )
            }

            public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup.Bar.NestedGroup>() {
                override val defaultInstance: pbandk.testpb.MessageWithGroup.Bar.NestedGroup by lazy(LazyThreadSafetyMode.PUBLICATION) {
                    pbandk.testpb.MessageWithGroup.Bar.NestedGroup {}
                }

                private val messageMetadata = pbandk.MessageMetadata(
                    fullName = "testpb.MessageWithGroup.Bar.NestedGroup",
                    syntax = pbandk.wkt.Syntax.PROTO2,
                )

                override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar.NestedGroup> by lazy {
                    pbandk.MessageDescriptor.of(
                        metadata = messageMetadata,
                        messageClass = pbandk.testpb.MessageWithGroup.Bar.NestedGroup::class,
                        messageCompanion = this,
                        builder = MessageWithGroup.Bar.Companion::NestedGroup,
                        fields = listOf(
                            pbandk.testpb.MessageWithGroup.Bar.NestedGroup.FieldDescriptors.e,
                        ),
                    )
                }
            }
        }

        public sealed interface MutableNestedGroup : pbandk.testpb.MessageWithGroup.Bar.NestedGroup, pbandk.MutableMessage<pbandk.testpb.MessageWithGroup.Bar.NestedGroup> {
            public override var e: Long?
        }
    }

    public sealed interface MutableBar : pbandk.testpb.MessageWithGroup.Bar, pbandk.MutableMessage<pbandk.testpb.MessageWithGroup.Bar> {
        public override var c: Boolean?
        public override var d: Float?
        public override var nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup?
    }
}

public sealed interface MutableMessageWithGroup : pbandk.testpb.MessageWithGroup, pbandk.MutableMessage<pbandk.testpb.MessageWithGroup> {
    public override var foo: pbandk.testpb.MessageWithGroup.Foo?
    public override var oneofWithGroup: MessageWithGroup.OneofWithGroup<*>?

    public override var bar: pbandk.testpb.MessageWithGroup.Bar?
}

@Deprecated(
    message = "Use MessageWithRequiredField { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageWithRequiredField"],
        expression = "MessageWithRequiredField {\nthis.foo = foo\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageWithRequiredField(
    foo: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithRequiredField = pbandk.testpb.MessageWithRequiredField {
    this.foo = foo
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageWithRequiredField] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithRequiredField")
public fun MessageWithRequiredField(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit): pbandk.testpb.MessageWithRequiredField =
    pbandk.testpb.MutableMessageWithRequiredField_Impl(
    ).also(builderAction).toMessageWithRequiredField()

private class MessageWithRequiredField_Impl(
    override val foo: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithRequiredField, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithRequiredField>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithRequiredField.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foo: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithRequiredField = pbandk.testpb.MessageWithRequiredField {
        this.foo = foo
        this.unknownFields += unknownFields
    }
}

private class MutableMessageWithRequiredField_Impl(
) : pbandk.testpb.MutableMessageWithRequiredField, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithRequiredField>() {
    private var hasFoo = false
    override var foo: Boolean = false
        get() = if (hasFoo) field else throw IllegalStateException("Property 'foo' should be initialized before get")
        set(value) { field = value; hasFoo = true }

    override val descriptor get() = pbandk.testpb.MessageWithRequiredField.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithRequiredField.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foo: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithRequiredField = throw UnsupportedOperationException()

    fun toMessageWithRequiredField() = MessageWithRequiredField_Impl(
        foo = if (hasFoo) {
            foo
        } else {
            throw pbandk.InvalidProtocolBufferException.missingRequiredField("foo")
        },
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MessageWithEnum { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageWithEnum"],
        expression = "MessageWithEnum {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageWithEnum(
    value: pbandk.testpb.MessageWithEnum.EnumType? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithEnum = pbandk.testpb.MessageWithEnum {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageWithEnum] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithEnum")
public fun MessageWithEnum(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit): pbandk.testpb.MessageWithEnum =
    pbandk.testpb.MutableMessageWithEnum_Impl(
        value = null,
    ).also(builderAction).toMessageWithEnum()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithEnum")
public fun MessageWithEnum?.orDefault(): pbandk.testpb.MessageWithEnum = this ?: pbandk.testpb.MessageWithEnum.defaultInstance

private class MessageWithEnum_Impl(
    override val value: pbandk.testpb.MessageWithEnum.EnumType?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithEnum, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithEnum>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithEnum.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.MessageWithEnum.EnumType?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithEnum = pbandk.testpb.MessageWithEnum {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableMessageWithEnum_Impl(
    override var value: pbandk.testpb.MessageWithEnum.EnumType?,
) : pbandk.testpb.MutableMessageWithEnum, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithEnum>() {
    override val descriptor get() = pbandk.testpb.MessageWithEnum.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithEnum.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.MessageWithEnum.EnumType?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithEnum = throw UnsupportedOperationException()

    fun toMessageWithEnum() = MessageWithEnum_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MessageWithGroup { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageWithGroup"],
        expression = "MessageWithGroup {\nthis.foo = foo\nthis.oneofWithGroup = oneofWithGroup\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageWithGroup(
    foo: pbandk.testpb.MessageWithGroup.Foo? = null,
    oneofWithGroup: pbandk.testpb.MessageWithGroup.OneofWithGroup<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageWithGroup = pbandk.testpb.MessageWithGroup {
    this.foo = foo
    this.oneofWithGroup = oneofWithGroup
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageWithGroup] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithGroup")
public fun MessageWithGroup(builderAction: pbandk.testpb.MutableMessageWithGroup.() -> Unit): pbandk.testpb.MessageWithGroup =
    pbandk.testpb.MutableMessageWithGroup_Impl(
        foo = null,
        oneofWithGroup = null,
    ).also(builderAction).toMessageWithGroup()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroup")
public fun MessageWithGroup?.orDefault(): pbandk.testpb.MessageWithGroup = this ?: pbandk.testpb.MessageWithGroup.defaultInstance

private class MessageWithGroup_Impl(
    override val foo: pbandk.testpb.MessageWithGroup.Foo?,
    override val oneofWithGroup: pbandk.testpb.MessageWithGroup.OneofWithGroup<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithGroup, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithGroup>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.descriptor

    override val bar: pbandk.testpb.MessageWithGroup.Bar?
        get() = (oneofWithGroup as? pbandk.testpb.MessageWithGroup.OneofWithGroup.Bar)?.value

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithGroup.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foo: pbandk.testpb.MessageWithGroup.Foo?,
        oneofWithGroup: pbandk.testpb.MessageWithGroup.OneofWithGroup<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup = pbandk.testpb.MessageWithGroup {
        this.foo = foo
        this.oneofWithGroup = oneofWithGroup
        this.unknownFields += unknownFields
    }
}

private class MutableMessageWithGroup_Impl(
    override var foo: pbandk.testpb.MessageWithGroup.Foo?,
    override var oneofWithGroup: pbandk.testpb.MessageWithGroup.OneofWithGroup<*>?,
) : pbandk.testpb.MutableMessageWithGroup, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithGroup>() {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.descriptor

    override var bar: pbandk.testpb.MessageWithGroup.Bar?
        get() = (oneofWithGroup as? pbandk.testpb.MessageWithGroup.OneofWithGroup.Bar)?.value
        set(value) { oneofWithGroup = value?.let { pbandk.testpb.MessageWithGroup.OneofWithGroup.Bar(it) } }

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageWithGroup.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        foo: pbandk.testpb.MessageWithGroup.Foo?,
        oneofWithGroup: pbandk.testpb.MessageWithGroup.OneofWithGroup<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup = throw UnsupportedOperationException()

    fun toMessageWithGroup() = MessageWithGroup_Impl(
        foo = foo,
        oneofWithGroup = oneofWithGroup,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [MessageWithGroup.MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithGroupFoo")
public fun MessageWithGroup.Companion.Foo(builderAction: pbandk.testpb.MessageWithGroup.MutableFoo.() -> Unit): pbandk.testpb.MessageWithGroup.Foo =
    pbandk.testpb.MessageWithGroup_MutableFoo_Impl(
        a = null,
        b = null,
    ).also(builderAction).toFoo()

/**
 * The [MessageWithGroup.MutableFoo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableMessageWithGroup.Foo(builderAction: pbandk.testpb.MessageWithGroup.MutableFoo.() -> Unit): pbandk.testpb.MessageWithGroup.Foo =
    pbandk.testpb.MessageWithGroup.Foo(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroupFoo")
public fun MessageWithGroup.Foo?.orDefault(): pbandk.testpb.MessageWithGroup.Foo = this ?: pbandk.testpb.MessageWithGroup.Foo.defaultInstance

private class MessageWithGroup_Foo_Impl(
    override val a: String?,
    override val b: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithGroup.Foo, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithGroup.Foo>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.Foo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MessageWithGroup.MutableFoo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: String?,
        b: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup.Foo = pbandk.testpb.MessageWithGroup.Foo {
        this.a = a
        this.b = b
        this.unknownFields += unknownFields
    }
}

private class MessageWithGroup_MutableFoo_Impl(
    override var a: String?,
    override var b: Int?,
) : pbandk.testpb.MessageWithGroup.MutableFoo, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithGroup.Foo>() {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.Foo.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MessageWithGroup.MutableFoo.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: String?,
        b: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup.Foo = throw UnsupportedOperationException()

    fun toFoo() = MessageWithGroup_Foo_Impl(
        a = a,
        b = b,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [MessageWithGroup.MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithGroupBar")
public fun MessageWithGroup.Companion.Bar(builderAction: pbandk.testpb.MessageWithGroup.MutableBar.() -> Unit): pbandk.testpb.MessageWithGroup.Bar =
    pbandk.testpb.MessageWithGroup_MutableBar_Impl(
        c = null,
        d = null,
        nestedgroup = null,
    ).also(builderAction).toBar()

/**
 * The [MessageWithGroup.MutableBar] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableMessageWithGroup.Bar(builderAction: pbandk.testpb.MessageWithGroup.MutableBar.() -> Unit): pbandk.testpb.MessageWithGroup.Bar =
    pbandk.testpb.MessageWithGroup.Bar(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroupBar")
public fun MessageWithGroup.Bar?.orDefault(): pbandk.testpb.MessageWithGroup.Bar = this ?: pbandk.testpb.MessageWithGroup.Bar.defaultInstance

private class MessageWithGroup_Bar_Impl(
    override val c: Boolean?,
    override val d: Float?,
    override val nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithGroup.Bar, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithGroup.Bar>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.Bar.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MessageWithGroup.MutableBar.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        c: Boolean?,
        d: Float?,
        nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup.Bar = pbandk.testpb.MessageWithGroup.Bar {
        this.c = c
        this.d = d
        this.nestedgroup = nestedgroup
        this.unknownFields += unknownFields
    }
}

private class MessageWithGroup_MutableBar_Impl(
    override var c: Boolean?,
    override var d: Float?,
    override var nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup?,
) : pbandk.testpb.MessageWithGroup.MutableBar, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithGroup.Bar>() {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.Bar.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MessageWithGroup.MutableBar.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        c: Boolean?,
        d: Float?,
        nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup.Bar = throw UnsupportedOperationException()

    fun toBar() = MessageWithGroup_Bar_Impl(
        c = c,
        d = d,
        nestedgroup = nestedgroup,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [MessageWithGroup.Bar.MutableNestedGroup] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageWithGroupBarNestedGroup")
public fun MessageWithGroup.Bar.Companion.NestedGroup(builderAction: pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup.() -> Unit): pbandk.testpb.MessageWithGroup.Bar.NestedGroup =
    pbandk.testpb.MessageWithGroup_Bar_MutableNestedGroup_Impl(
        e = null,
    ).also(builderAction).toNestedGroup()

/**
 * The [MessageWithGroup.Bar.MutableNestedGroup] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MessageWithGroup.MutableBar.NestedGroup(builderAction: pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup.() -> Unit): pbandk.testpb.MessageWithGroup.Bar.NestedGroup =
    pbandk.testpb.MessageWithGroup.Bar.NestedGroup(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroupBarNestedGroup")
public fun MessageWithGroup.Bar.NestedGroup?.orDefault(): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = this ?: pbandk.testpb.MessageWithGroup.Bar.NestedGroup.defaultInstance

private class MessageWithGroup_Bar_NestedGroup_Impl(
    override val e: Long?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageWithGroup.Bar.NestedGroup, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageWithGroup.Bar.NestedGroup>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.Bar.NestedGroup.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        e: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = pbandk.testpb.MessageWithGroup.Bar.NestedGroup {
        this.e = e
        this.unknownFields += unknownFields
    }
}

private class MessageWithGroup_Bar_MutableNestedGroup_Impl(
    override var e: Long?,
) : pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageWithGroup.Bar.NestedGroup>() {
    override val descriptor get() = pbandk.testpb.MessageWithGroup.Bar.NestedGroup.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MessageWithGroup.Bar.MutableNestedGroup.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        e: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = throw UnsupportedOperationException()

    fun toNestedGroup() = MessageWithGroup_Bar_NestedGroup_Impl(
        e = e,
        unknownFields = unknownFields.toMap()
    )
}

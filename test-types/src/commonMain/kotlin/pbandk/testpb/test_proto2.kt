@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public data class MessageWithRequiredField(
    val foo: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithRequiredField = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithRequiredField> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithRequiredField = pbandk.testpb.MessageWithRequiredField.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithRequiredField> = pbandk.MessageDescriptor(
            fullName = "testpb.MessageWithRequiredField",
            messageClass = pbandk.testpb.MessageWithRequiredField::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foo",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "foo",
                        value = pbandk.testpb.MessageWithRequiredField::foo
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class MessageWithEnum(
    val value: pbandk.testpb.MessageWithEnum.EnumType? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithEnum = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithEnum> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithEnum> {
        public val defaultInstance: pbandk.testpb.MessageWithEnum by lazy { pbandk.testpb.MessageWithEnum() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithEnum = pbandk.testpb.MessageWithEnum.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithEnum> = pbandk.MessageDescriptor(
            fullName = "testpb.MessageWithEnum",
            messageClass = pbandk.testpb.MessageWithEnum::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.MessageWithEnum.EnumType.Companion, hasPresence = true),
                        jsonName = "value",
                        value = pbandk.testpb.MessageWithEnum::value
                    )
                )
            }
        )
    }

    public sealed class EnumType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.testpb.MessageWithEnum.EnumType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "MessageWithEnum.EnumType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object FOO : EnumType(0, "FOO")
        public object BAR : EnumType(1, "BAR")
        public class UNRECOGNIZED(value: Int) : EnumType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.MessageWithEnum.EnumType> {
            public val values: List<pbandk.testpb.MessageWithEnum.EnumType> by lazy { listOf(FOO, BAR) }
            override fun fromValue(value: Int): pbandk.testpb.MessageWithEnum.EnumType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.testpb.MessageWithEnum.EnumType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No EnumType with name: $name")
        }
    }
}

@pbandk.Export
public data class MessageWithGroup(
    val foo: pbandk.testpb.MessageWithGroup.Foo? = null,
    val oneofWithGroup: OneofWithGroup<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class OneofWithGroup<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Bar(bar: pbandk.testpb.MessageWithGroup.Bar) : OneofWithGroup<pbandk.testpb.MessageWithGroup.Bar>(bar)
    }

    val bar: pbandk.testpb.MessageWithGroup.Bar?
        get() = (oneofWithGroup as? OneofWithGroup.Bar)?.value

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup> {
        public val defaultInstance: pbandk.testpb.MessageWithGroup by lazy { pbandk.testpb.MessageWithGroup() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithGroup = pbandk.testpb.MessageWithGroup.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup> = pbandk.MessageDescriptor(
            fullName = "testpb.MessageWithGroup",
            messageClass = pbandk.testpb.MessageWithGroup::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foo",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MessageWithGroup.Foo.Companion, encoding = pbandk.MessageEncoding.DELIMITED),
                        jsonName = "foo",
                        value = pbandk.testpb.MessageWithGroup::foo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bar",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MessageWithGroup.Bar.Companion, encoding = pbandk.MessageEncoding.DELIMITED),
                        oneofMember = true,
                        jsonName = "bar",
                        value = pbandk.testpb.MessageWithGroup::bar
                    )
                )
            }
        )
    }

    public data class Foo(
        val a: String? = null,
        val b: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup.Foo = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Foo> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup.Foo> {
            public val defaultInstance: pbandk.testpb.MessageWithGroup.Foo by lazy { pbandk.testpb.MessageWithGroup.Foo() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithGroup.Foo = pbandk.testpb.MessageWithGroup.Foo.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Foo> = pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithGroup.Foo",
                messageClass = pbandk.testpb.MessageWithGroup.Foo::class,
                messageCompanion = this,
                fields = buildList(2) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "a",
                            value = pbandk.testpb.MessageWithGroup.Foo::a
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "b",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "b",
                            value = pbandk.testpb.MessageWithGroup.Foo::b
                        )
                    )
                }
            )
        }
    }

    public data class Bar(
        val c: Boolean? = null,
        val d: Float? = null,
        val nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup.Bar = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup.Bar> {
            public val defaultInstance: pbandk.testpb.MessageWithGroup.Bar by lazy { pbandk.testpb.MessageWithGroup.Bar() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithGroup.Bar = pbandk.testpb.MessageWithGroup.Bar.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar> = pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithGroup.Bar",
                messageClass = pbandk.testpb.MessageWithGroup.Bar::class,
                messageCompanion = this,
                fields = buildList(3) {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "c",
                            number = 10,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "c",
                            value = pbandk.testpb.MessageWithGroup.Bar::c
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "d",
                            number = 11,
                            type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                            jsonName = "d",
                            value = pbandk.testpb.MessageWithGroup.Bar::d
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "nestedgroup",
                            number = 12,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MessageWithGroup.Bar.NestedGroup.Companion, encoding = pbandk.MessageEncoding.DELIMITED),
                            jsonName = "nestedgroup",
                            value = pbandk.testpb.MessageWithGroup.Bar::nestedgroup
                        )
                    )
                }
            )
        }

        public data class NestedGroup(
            val e: Long? = null,
            override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ) : pbandk.Message {
            override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = protoMergeImpl(other)
            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar.NestedGroup> get() = Companion.descriptor
            override val protoSize: Int by lazy { super.protoSize }
            public companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithGroup.Bar.NestedGroup> {
                public val defaultInstance: pbandk.testpb.MessageWithGroup.Bar.NestedGroup by lazy { pbandk.testpb.MessageWithGroup.Bar.NestedGroup() }
                override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = pbandk.testpb.MessageWithGroup.Bar.NestedGroup.decodeWithImpl(u)

                override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithGroup.Bar.NestedGroup> = pbandk.MessageDescriptor(
                    fullName = "testpb.MessageWithGroup.Bar.NestedGroup",
                    messageClass = pbandk.testpb.MessageWithGroup.Bar.NestedGroup::class,
                    messageCompanion = this,
                    fields = buildList(1) {
                        add(
                            pbandk.FieldDescriptor(
                                messageDescriptor = this@Companion::descriptor,
                                name = "e",
                                number = 1,
                                type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                                jsonName = "e",
                                value = pbandk.testpb.MessageWithGroup.Bar.NestedGroup::e
                            )
                        )
                    }
                )
            }
        }
    }
}

private fun MessageWithRequiredField.protoMergeImpl(plus: pbandk.Message?): MessageWithRequiredField = (plus as? MessageWithRequiredField)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithRequiredField.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithRequiredField {
    var foo: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foo = _fieldValue as Boolean
        }
    }

    if (foo == null) {
        throw pbandk.InvalidProtocolBufferException.missingRequiredField("foo")
    }
    return MessageWithRequiredField(foo!!, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithEnum")
public fun MessageWithEnum?.orDefault(): pbandk.testpb.MessageWithEnum = this ?: MessageWithEnum.defaultInstance

private fun MessageWithEnum.protoMergeImpl(plus: pbandk.Message?): MessageWithEnum = (plus as? MessageWithEnum)?.let {
    it.copy(
        value = plus.value ?: value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithEnum.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithEnum {
    var value: pbandk.testpb.MessageWithEnum.EnumType? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.testpb.MessageWithEnum.EnumType
        }
    }

    return MessageWithEnum(value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroup")
public fun MessageWithGroup?.orDefault(): pbandk.testpb.MessageWithGroup = this ?: MessageWithGroup.defaultInstance

private fun MessageWithGroup.protoMergeImpl(plus: pbandk.Message?): MessageWithGroup = (plus as? MessageWithGroup)?.let {
    it.copy(
        foo = foo?.plus(plus.foo) ?: plus.foo,
        oneofWithGroup = when {
            oneofWithGroup is MessageWithGroup.OneofWithGroup.Bar && plus.oneofWithGroup is MessageWithGroup.OneofWithGroup.Bar ->
                MessageWithGroup.OneofWithGroup.Bar(oneofWithGroup.value + plus.oneofWithGroup.value)
            else ->
                plus.oneofWithGroup ?: oneofWithGroup
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithGroup {
    var foo: pbandk.testpb.MessageWithGroup.Foo? = null
    var oneofWithGroup: MessageWithGroup.OneofWithGroup<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foo = _fieldValue as pbandk.testpb.MessageWithGroup.Foo
            2 -> oneofWithGroup = MessageWithGroup.OneofWithGroup.Bar(_fieldValue as pbandk.testpb.MessageWithGroup.Bar)
        }
    }

    return MessageWithGroup(foo, oneofWithGroup, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroupFoo")
public fun MessageWithGroup.Foo?.orDefault(): pbandk.testpb.MessageWithGroup.Foo = this ?: MessageWithGroup.Foo.defaultInstance

private fun MessageWithGroup.Foo.protoMergeImpl(plus: pbandk.Message?): MessageWithGroup.Foo = (plus as? MessageWithGroup.Foo)?.let {
    it.copy(
        a = plus.a ?: a,
        b = plus.b ?: b,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithGroup.Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithGroup.Foo {
    var a: String? = null
    var b: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as String
            2 -> b = _fieldValue as Int
        }
    }

    return MessageWithGroup.Foo(a, b, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroupBar")
public fun MessageWithGroup.Bar?.orDefault(): pbandk.testpb.MessageWithGroup.Bar = this ?: MessageWithGroup.Bar.defaultInstance

private fun MessageWithGroup.Bar.protoMergeImpl(plus: pbandk.Message?): MessageWithGroup.Bar = (plus as? MessageWithGroup.Bar)?.let {
    it.copy(
        c = plus.c ?: c,
        d = plus.d ?: d,
        nestedgroup = nestedgroup?.plus(plus.nestedgroup) ?: plus.nestedgroup,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithGroup.Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithGroup.Bar {
    var c: Boolean? = null
    var d: Float? = null
    var nestedgroup: pbandk.testpb.MessageWithGroup.Bar.NestedGroup? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            10 -> c = _fieldValue as Boolean
            11 -> d = _fieldValue as Float
            12 -> nestedgroup = _fieldValue as pbandk.testpb.MessageWithGroup.Bar.NestedGroup
        }
    }

    return MessageWithGroup.Bar(c, d, nestedgroup, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageWithGroupBarNestedGroup")
public fun MessageWithGroup.Bar.NestedGroup?.orDefault(): pbandk.testpb.MessageWithGroup.Bar.NestedGroup = this ?: MessageWithGroup.Bar.NestedGroup.defaultInstance

private fun MessageWithGroup.Bar.NestedGroup.protoMergeImpl(plus: pbandk.Message?): MessageWithGroup.Bar.NestedGroup = (plus as? MessageWithGroup.Bar.NestedGroup)?.let {
    it.copy(
        e = plus.e ?: e,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithGroup.Bar.NestedGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithGroup.Bar.NestedGroup {
    var e: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> e = _fieldValue as Long
        }
    }

    return MessageWithGroup.Bar.NestedGroup(e, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb.java

@pbandk.Export
public data class MessageWithRequiredField(
    val foo: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.MessageWithRequiredField = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithRequiredField> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.MessageWithRequiredField> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.MessageWithRequiredField = pbandk.testpb.java.MessageWithRequiredField.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithRequiredField> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.MessageWithRequiredField, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foo",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "foo",
                        value = pbandk.testpb.java.MessageWithRequiredField::foo
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithRequiredField",
                messageClass = pbandk.testpb.java.MessageWithRequiredField::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class MessageWithEnum(
    val value: pbandk.testpb.java.MessageWithEnum.EnumType? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.java.MessageWithEnum = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithEnum> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.java.MessageWithEnum> {
        public val defaultInstance: pbandk.testpb.java.MessageWithEnum by lazy { pbandk.testpb.java.MessageWithEnum() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.java.MessageWithEnum = pbandk.testpb.java.MessageWithEnum.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.java.MessageWithEnum> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.java.MessageWithEnum, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.java.MessageWithEnum.EnumType.Companion, hasPresence = true),
                        jsonName = "value",
                        value = pbandk.testpb.java.MessageWithEnum::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.MessageWithEnum",
                messageClass = pbandk.testpb.java.MessageWithEnum::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class EnumType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is MessageWithEnum.EnumType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "MessageWithEnum.EnumType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object FOO : EnumType(0, "FOO")
        public object BAR : EnumType(1, "BAR")
        public class UNRECOGNIZED(value: Int) : EnumType(value)

        public companion object : pbandk.Message.Enum.Companion<MessageWithEnum.EnumType> {
            public val values: List<MessageWithEnum.EnumType> by lazy { listOf(FOO, BAR) }
            override fun fromValue(value: Int): MessageWithEnum.EnumType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): MessageWithEnum.EnumType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No EnumType with name: $name")
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
public fun MessageWithEnum?.orDefault(): pbandk.testpb.java.MessageWithEnum = this ?: MessageWithEnum.defaultInstance

private fun MessageWithEnum.protoMergeImpl(plus: pbandk.Message?): MessageWithEnum = (plus as? MessageWithEnum)?.let {
    it.copy(
        value = plus.value ?: value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithEnum.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithEnum {
    var value: pbandk.testpb.java.MessageWithEnum.EnumType? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.testpb.java.MessageWithEnum.EnumType
        }
    }

    return MessageWithEnum(value, unknownFields)
}

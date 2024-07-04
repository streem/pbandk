@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public sealed class Proto3PresenceEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.testpb.Proto3PresenceEnum && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "Proto3PresenceEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object PROTO3_PRESENCE_ENUM_UNSPECIFIED : Proto3PresenceEnum(0, "PROTO3_PRESENCE_ENUM_UNSPECIFIED")
    public object PROTO3_PRESENCE_ENUM_SPECIFIED : Proto3PresenceEnum(1, "PROTO3_PRESENCE_ENUM_SPECIFIED")
    public class UNRECOGNIZED(value: Int) : Proto3PresenceEnum(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.Proto3PresenceEnum> {
        public val values: List<pbandk.testpb.Proto3PresenceEnum> by lazy { listOf(PROTO3_PRESENCE_ENUM_UNSPECIFIED, PROTO3_PRESENCE_ENUM_SPECIFIED) }
        override fun fromValue(value: Int): pbandk.testpb.Proto3PresenceEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.testpb.Proto3PresenceEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Proto3PresenceEnum with name: $name")
    }
}

@pbandk.Export
public data class Proto3PresenceMessage(
    val int: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Proto3PresenceMessage = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMessage> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.Proto3PresenceMessage> {
        public val defaultInstance: pbandk.testpb.Proto3PresenceMessage by lazy { pbandk.testpb.Proto3PresenceMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Proto3PresenceMessage = pbandk.testpb.Proto3PresenceMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMessage> = pbandk.MessageDescriptor(
            fullName = "pbandk.testpb.Proto3PresenceMessage",
            messageClass = pbandk.testpb.Proto3PresenceMessage::class,
            messageCompanion = this,
            fields = buildList(1) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "int",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "int",
                        value = pbandk.testpb.Proto3PresenceMessage::int
                    )
                )
            }
        )
    }
}

@pbandk.Export
public data class Proto3PresenceMain(
    val message: pbandk.testpb.Proto3PresenceMessage? = null,
    val string: String = "",
    val int: Int = 0,
    val enum: pbandk.testpb.Proto3PresenceEnum = pbandk.testpb.Proto3PresenceEnum.fromValue(0),
    val optionalMessage: pbandk.testpb.Proto3PresenceMessage? = null,
    val optionalString: String? = null,
    val optionalInt: Int? = null,
    val optionalEnum: pbandk.testpb.Proto3PresenceEnum? = null,
    val oneOf: OneOf<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class OneOf<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class OneOfString(oneOfString: String = "") : OneOf<String>(oneOfString)
        public class OneOfInt(oneOfInt: Int = 0) : OneOf<Int>(oneOfInt)
    }

    val oneOfString: String?
        get() = (oneOf as? OneOf.OneOfString)?.value
    val oneOfInt: Int?
        get() = (oneOf as? OneOf.OneOfInt)?.value

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Proto3PresenceMain = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMain> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.Proto3PresenceMain> {
        public val defaultInstance: pbandk.testpb.Proto3PresenceMain by lazy { pbandk.testpb.Proto3PresenceMain() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Proto3PresenceMain = pbandk.testpb.Proto3PresenceMain.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMain> = pbandk.MessageDescriptor(
            fullName = "pbandk.testpb.Proto3PresenceMain",
            messageClass = pbandk.testpb.Proto3PresenceMain::class,
            messageCompanion = this,
            fields = buildList(10) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Proto3PresenceMessage.Companion),
                        jsonName = "optionalMessage",
                        value = pbandk.testpb.Proto3PresenceMain::optionalMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Proto3PresenceMessage.Companion),
                        jsonName = "message",
                        value = pbandk.testpb.Proto3PresenceMain::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = pbandk.testpb.Proto3PresenceMain::optionalString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "string",
                        value = pbandk.testpb.Proto3PresenceMain::string
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt",
                        value = pbandk.testpb.Proto3PresenceMain::optionalInt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "int",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "int",
                        value = pbandk.testpb.Proto3PresenceMain::int
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_enum",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.Proto3PresenceEnum.Companion, hasPresence = true),
                        jsonName = "optionalEnum",
                        value = pbandk.testpb.Proto3PresenceMain::optionalEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.Proto3PresenceEnum.Companion),
                        jsonName = "enum",
                        value = pbandk.testpb.Proto3PresenceMain::enum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "one_of_string",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneOfString",
                        value = pbandk.testpb.Proto3PresenceMain::oneOfString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "one_of_int",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneOfInt",
                        value = pbandk.testpb.Proto3PresenceMain::oneOfInt
                    )
                )
            }
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForProto3PresenceMessage")
public fun Proto3PresenceMessage?.orDefault(): pbandk.testpb.Proto3PresenceMessage = this ?: Proto3PresenceMessage.defaultInstance

private fun Proto3PresenceMessage.protoMergeImpl(plus: pbandk.Message?): Proto3PresenceMessage = (plus as? Proto3PresenceMessage)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Proto3PresenceMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Proto3PresenceMessage {
    var int = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> int = _fieldValue as Int
        }
    }

    return Proto3PresenceMessage(int, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForProto3PresenceMain")
public fun Proto3PresenceMain?.orDefault(): pbandk.testpb.Proto3PresenceMain = this ?: Proto3PresenceMain.defaultInstance

private fun Proto3PresenceMain.protoMergeImpl(plus: pbandk.Message?): Proto3PresenceMain = (plus as? Proto3PresenceMain)?.let {
    it.copy(
        message = message?.plus(plus.message) ?: plus.message,
        optionalMessage = optionalMessage?.plus(plus.optionalMessage) ?: plus.optionalMessage,
        optionalString = plus.optionalString ?: optionalString,
        optionalInt = plus.optionalInt ?: optionalInt,
        optionalEnum = plus.optionalEnum ?: optionalEnum,
        oneOf = plus.oneOf ?: oneOf,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Proto3PresenceMain.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Proto3PresenceMain {
    var message: pbandk.testpb.Proto3PresenceMessage? = null
    var string = ""
    var int = 0
    var enum: pbandk.testpb.Proto3PresenceEnum = pbandk.testpb.Proto3PresenceEnum.fromValue(0)
    var optionalMessage: pbandk.testpb.Proto3PresenceMessage? = null
    var optionalString: String? = null
    var optionalInt: Int? = null
    var optionalEnum: pbandk.testpb.Proto3PresenceEnum? = null
    var oneOf: Proto3PresenceMain.OneOf<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalMessage = _fieldValue as pbandk.testpb.Proto3PresenceMessage
            2 -> message = _fieldValue as pbandk.testpb.Proto3PresenceMessage
            3 -> optionalString = _fieldValue as String
            4 -> string = _fieldValue as String
            5 -> optionalInt = _fieldValue as Int
            6 -> int = _fieldValue as Int
            7 -> optionalEnum = _fieldValue as pbandk.testpb.Proto3PresenceEnum
            8 -> enum = _fieldValue as pbandk.testpb.Proto3PresenceEnum
            9 -> oneOf = Proto3PresenceMain.OneOf.OneOfString(_fieldValue as String)
            10 -> oneOf = Proto3PresenceMain.OneOf.OneOfInt(_fieldValue as Int)
        }
    }

    return Proto3PresenceMain(message, string, int, enum,
        optionalMessage, optionalString, optionalInt, optionalEnum,
        oneOf, unknownFields)
}

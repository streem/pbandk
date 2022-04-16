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
        public val values: List<Proto3PresenceEnum> by lazy { listOf(PROTO3_PRESENCE_ENUM_UNSPECIFIED, PROTO3_PRESENCE_ENUM_SPECIFIED) }
        override fun fromValue(value: Int): pbandk.testpb.Proto3PresenceEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.testpb.Proto3PresenceEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Proto3PresenceEnum with name: $name")
    }
}

public sealed interface Proto3PresenceMessage : pbandk.Message {
    public val int: Int

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Proto3PresenceMessage
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMessage>

    /**
     * The [MutableProto3PresenceMessage] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit): pbandk.testpb.Proto3PresenceMessage

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        int: Int = this.int,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Proto3PresenceMessage

    public companion object : pbandk.Message.Companion<pbandk.testpb.Proto3PresenceMessage> {
        public val defaultInstance: pbandk.testpb.Proto3PresenceMessage by lazy { pbandk.testpb.Proto3PresenceMessage {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Proto3PresenceMessage = pbandk.testpb.Proto3PresenceMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMessage> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMessage, *>>(1)
            fieldsList.apply {
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
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.Proto3PresenceMessage",
                messageClass = pbandk.testpb.Proto3PresenceMessage::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableProto3PresenceMessage : pbandk.testpb.Proto3PresenceMessage, pbandk.MutableMessage {
    public override var int: Int
}

public sealed interface Proto3PresenceMain : pbandk.Message {
    public val message: pbandk.testpb.Proto3PresenceMessage?
    public val string: String
    public val int: Int
    public val enum: pbandk.testpb.Proto3PresenceEnum
    public val optionalMessage: pbandk.testpb.Proto3PresenceMessage?
    public val optionalString: String?
    public val optionalInt: Int?
    public val optionalEnum: pbandk.testpb.Proto3PresenceEnum?
    public val oneOf: OneOf<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Proto3PresenceMain
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMain>

    /**
     * The [MutableProto3PresenceMain] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit): pbandk.testpb.Proto3PresenceMain

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        message: pbandk.testpb.Proto3PresenceMessage? = this.message,
        string: String = this.string,
        int: Int = this.int,
        enum: pbandk.testpb.Proto3PresenceEnum = this.enum,
        optionalMessage: pbandk.testpb.Proto3PresenceMessage? = this.optionalMessage,
        optionalString: String? = this.optionalString,
        optionalInt: Int? = this.optionalInt,
        optionalEnum: pbandk.testpb.Proto3PresenceEnum? = this.optionalEnum,
        oneOf: pbandk.testpb.Proto3PresenceMain.OneOf<*>? = this.oneOf,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Proto3PresenceMain

    public val oneOfString: String?
    public val oneOfInt: Int?

    public sealed class OneOf<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class OneOfString(oneOfString: String = "") : OneOf<String>(oneOfString)
        public class OneOfInt(oneOfInt: Int = 0) : OneOf<Int>(oneOfInt)
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Proto3PresenceMain> {
        public val defaultInstance: pbandk.testpb.Proto3PresenceMain by lazy { pbandk.testpb.Proto3PresenceMain {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Proto3PresenceMain = pbandk.testpb.Proto3PresenceMain.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMain> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, *>>(10)
            fieldsList.apply {
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
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.Proto3PresenceMain",
                messageClass = pbandk.testpb.Proto3PresenceMain::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableProto3PresenceMain : pbandk.testpb.Proto3PresenceMain, pbandk.MutableMessage {
    public override var message: pbandk.testpb.Proto3PresenceMessage?
    public override var string: String
    public override var int: Int
    public override var enum: pbandk.testpb.Proto3PresenceEnum
    public override var optionalMessage: pbandk.testpb.Proto3PresenceMessage?
    public override var optionalString: String?
    public override var optionalInt: Int?
    public override var optionalEnum: pbandk.testpb.Proto3PresenceEnum?
    public override var oneOf: Proto3PresenceMain.OneOf<*>?

    public override var oneOfString: String?
    public override var oneOfInt: Int?
}

@Deprecated(
    message = "Use Proto3PresenceMessage { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Proto3PresenceMessage"],
        expression = "Proto3PresenceMessage {\nthis.int = int\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Proto3PresenceMessage(
    int: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Proto3PresenceMessage = pbandk.testpb.Proto3PresenceMessage {
    this.int = int
    this.unknownFields += unknownFields
}

/**
 * The [MutableProto3PresenceMessage] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildProto3PresenceMessage")
public fun Proto3PresenceMessage(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit): pbandk.testpb.Proto3PresenceMessage = pbandk.testpb.MutableProto3PresenceMessage_Impl(
    int = 0,
    unknownFields = mutableMapOf()
).also(builderAction).toProto3PresenceMessage()

@pbandk.Export
@pbandk.JsName("orDefaultForProto3PresenceMessage")
public fun Proto3PresenceMessage?.orDefault(): pbandk.testpb.Proto3PresenceMessage = this ?: pbandk.testpb.Proto3PresenceMessage.defaultInstance

private class Proto3PresenceMessage_Impl(
    override val int: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Proto3PresenceMessage, pbandk.GeneratedMessage<pbandk.testpb.Proto3PresenceMessage>() {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMessage.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit) = pbandk.testpb.Proto3PresenceMessage {
        this.int = this@Proto3PresenceMessage_Impl.int
        this.unknownFields += this@Proto3PresenceMessage_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        int: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Proto3PresenceMessage {
        this.int = int
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableProto3PresenceMessage_Impl(
    override var int: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableProto3PresenceMessage, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableProto3PresenceMessage>() {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMessage.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        int: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toProto3PresenceMessage() = Proto3PresenceMessage_Impl(
        int = int,
        unknownFields = unknownFields.toMap()
    )
}

private fun Proto3PresenceMessage.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Proto3PresenceMessage {
    if (other !is pbandk.testpb.Proto3PresenceMessage) return this

    return copy {
        int = other.int
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Proto3PresenceMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Proto3PresenceMessage {
    var int = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> int = _fieldValue as Int
        }
    }
    return Proto3PresenceMessage_Impl(int, unknownFields)
}

@Deprecated(
    message = "Use Proto3PresenceMain { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Proto3PresenceMain"],
        expression = "Proto3PresenceMain {\nthis.message = message\nthis.string = string\nthis.int = int\nthis.enum = enum\nthis.optionalMessage = optionalMessage\nthis.optionalString = optionalString\nthis.optionalInt = optionalInt\nthis.optionalEnum = optionalEnum\nthis.oneOf = oneOf\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Proto3PresenceMain(
    message: pbandk.testpb.Proto3PresenceMessage? = null,
    string: String = "",
    int: Int = 0,
    enum: pbandk.testpb.Proto3PresenceEnum = pbandk.testpb.Proto3PresenceEnum.fromValue(0),
    optionalMessage: pbandk.testpb.Proto3PresenceMessage? = null,
    optionalString: String? = null,
    optionalInt: Int? = null,
    optionalEnum: pbandk.testpb.Proto3PresenceEnum? = null,
    oneOf: pbandk.testpb.Proto3PresenceMain.OneOf<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Proto3PresenceMain = pbandk.testpb.Proto3PresenceMain {
    this.message = message
    this.string = string
    this.int = int
    this.enum = enum
    this.optionalMessage = optionalMessage
    this.optionalString = optionalString
    this.optionalInt = optionalInt
    this.optionalEnum = optionalEnum
    this.oneOf = oneOf
    this.unknownFields += unknownFields
}

/**
 * The [MutableProto3PresenceMain] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildProto3PresenceMain")
public fun Proto3PresenceMain(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit): pbandk.testpb.Proto3PresenceMain = pbandk.testpb.MutableProto3PresenceMain_Impl(
    message = null,
    string = "",
    int = 0,
    enum = pbandk.testpb.Proto3PresenceEnum.fromValue(0),
    optionalMessage = null,
    optionalString = null,
    optionalInt = null,
    optionalEnum = null,
    oneOf = null,
    unknownFields = mutableMapOf()
).also(builderAction).toProto3PresenceMain()

@pbandk.Export
@pbandk.JsName("orDefaultForProto3PresenceMain")
public fun Proto3PresenceMain?.orDefault(): pbandk.testpb.Proto3PresenceMain = this ?: pbandk.testpb.Proto3PresenceMain.defaultInstance

private class Proto3PresenceMain_Impl(
    override val message: pbandk.testpb.Proto3PresenceMessage?,
    override val string: String,
    override val int: Int,
    override val enum: pbandk.testpb.Proto3PresenceEnum,
    override val optionalMessage: pbandk.testpb.Proto3PresenceMessage?,
    override val optionalString: String?,
    override val optionalInt: Int?,
    override val optionalEnum: pbandk.testpb.Proto3PresenceEnum?,
    override val oneOf: pbandk.testpb.Proto3PresenceMain.OneOf<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Proto3PresenceMain, pbandk.GeneratedMessage<pbandk.testpb.Proto3PresenceMain>() {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMain.descriptor

    override val oneOfString: String?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfString)?.value
    override val oneOfInt: Int?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfInt)?.value

    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit) = pbandk.testpb.Proto3PresenceMain {
        this.message = this@Proto3PresenceMain_Impl.message
        this.string = this@Proto3PresenceMain_Impl.string
        this.int = this@Proto3PresenceMain_Impl.int
        this.enum = this@Proto3PresenceMain_Impl.enum
        this.optionalMessage = this@Proto3PresenceMain_Impl.optionalMessage
        this.optionalString = this@Proto3PresenceMain_Impl.optionalString
        this.optionalInt = this@Proto3PresenceMain_Impl.optionalInt
        this.optionalEnum = this@Proto3PresenceMain_Impl.optionalEnum
        this.oneOf = this@Proto3PresenceMain_Impl.oneOf
        this.unknownFields += this@Proto3PresenceMain_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: pbandk.testpb.Proto3PresenceMessage?,
        string: String,
        int: Int,
        enum: pbandk.testpb.Proto3PresenceEnum,
        optionalMessage: pbandk.testpb.Proto3PresenceMessage?,
        optionalString: String?,
        optionalInt: Int?,
        optionalEnum: pbandk.testpb.Proto3PresenceEnum?,
        oneOf: pbandk.testpb.Proto3PresenceMain.OneOf<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Proto3PresenceMain {
        this.message = message
        this.string = string
        this.int = int
        this.enum = enum
        this.optionalMessage = optionalMessage
        this.optionalString = optionalString
        this.optionalInt = optionalInt
        this.optionalEnum = optionalEnum
        this.oneOf = oneOf
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableProto3PresenceMain_Impl(
    override var message: pbandk.testpb.Proto3PresenceMessage?,
    override var string: String,
    override var int: Int,
    override var enum: pbandk.testpb.Proto3PresenceEnum,
    override var optionalMessage: pbandk.testpb.Proto3PresenceMessage?,
    override var optionalString: String?,
    override var optionalInt: Int?,
    override var optionalEnum: pbandk.testpb.Proto3PresenceEnum?,
    override var oneOf: pbandk.testpb.Proto3PresenceMain.OneOf<*>?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableProto3PresenceMain, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableProto3PresenceMain>() {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMain.descriptor

    override var oneOfString: String?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfString)?.value
        set(value) { oneOf = value?.let { pbandk.testpb.Proto3PresenceMain.OneOf.OneOfString(it) } }
    override var oneOfInt: Int?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfInt)?.value
        set(value) { oneOf = value?.let { pbandk.testpb.Proto3PresenceMain.OneOf.OneOfInt(it) } }

    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: pbandk.testpb.Proto3PresenceMessage?,
        string: String,
        int: Int,
        enum: pbandk.testpb.Proto3PresenceEnum,
        optionalMessage: pbandk.testpb.Proto3PresenceMessage?,
        optionalString: String?,
        optionalInt: Int?,
        optionalEnum: pbandk.testpb.Proto3PresenceEnum?,
        oneOf: pbandk.testpb.Proto3PresenceMain.OneOf<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toProto3PresenceMain() = Proto3PresenceMain_Impl(
        message = message,
        string = string,
        int = int,
        enum = enum,
        optionalMessage = optionalMessage,
        optionalString = optionalString,
        optionalInt = optionalInt,
        optionalEnum = optionalEnum,
        oneOf = oneOf,
        unknownFields = unknownFields.toMap()
    )
}

private fun Proto3PresenceMain.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Proto3PresenceMain {
    if (other !is pbandk.testpb.Proto3PresenceMain) return this

    return copy {
        message = message?.plus(other.message) ?: other.message
        string = other.string
        int = other.int
        enum = other.enum
        optionalMessage = optionalMessage?.plus(other.optionalMessage) ?: other.optionalMessage
        optionalString = other.optionalString ?: optionalString
        optionalInt = other.optionalInt ?: optionalInt
        optionalEnum = other.optionalEnum ?: optionalEnum
        when (other.oneOf) {
            is Proto3PresenceMain.OneOf.OneOfString -> oneOfString = other.oneOfString
            is Proto3PresenceMain.OneOf.OneOfInt -> oneOfInt = other.oneOfInt
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Proto3PresenceMain.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Proto3PresenceMain {
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
    return Proto3PresenceMain_Impl(message, string, int, enum,
        optionalMessage, optionalString, optionalInt, optionalEnum,
        oneOf, unknownFields)
}

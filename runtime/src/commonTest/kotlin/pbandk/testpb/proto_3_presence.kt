@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
@Suppress("ClassName")
public sealed class Proto3PresenceEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.testpb.Proto3PresenceEnum && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "Proto3PresenceEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object PROTO3_PRESENCE_ENUM_UNSPECIFIED : Proto3PresenceEnum(0, "PROTO3_PRESENCE_ENUM_UNSPECIFIED")
    public object PROTO3_PRESENCE_ENUM_SPECIFIED : Proto3PresenceEnum(1, "PROTO3_PRESENCE_ENUM_SPECIFIED")
    public class UNRECOGNIZED(value: Int) : Proto3PresenceEnum(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.Proto3PresenceEnum> {
        public val values: List<Proto3PresenceEnum> by lazy(LazyThreadSafetyMode.PUBLICATION) {
            listOf(PROTO3_PRESENCE_ENUM_UNSPECIFIED, PROTO3_PRESENCE_ENUM_SPECIFIED)
        }

        override fun fromValue(value: Int): pbandk.testpb.Proto3PresenceEnum =
            values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)

        override fun fromName(name: String): pbandk.testpb.Proto3PresenceEnum =
            values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Proto3PresenceEnum with name: $name")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val int: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMessage, Int> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.testpb.Proto3PresenceMessage::descriptor,
                name = "int",
                number = 1,
                type = pbandk.FieldDescriptor.Type.int32(),
                jsonName = "int",
                value = pbandk.testpb.Proto3PresenceMessage::int,
                mutableValue = pbandk.testpb.MutableProto3PresenceMessage::int,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Proto3PresenceMessage> {
        public val defaultInstance: pbandk.testpb.Proto3PresenceMessage by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Proto3PresenceMessage {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMessage> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "pbandk.testpb.Proto3PresenceMessage",
                messageClass = pbandk.testpb.Proto3PresenceMessage::class,
                messageCompanion = this,
                builder = ::Proto3PresenceMessage,
                fields = listOf(
                    pbandk.testpb.Proto3PresenceMessage.FieldDescriptors.int,
                ),
            )
        }
    }
}

public sealed interface MutableProto3PresenceMessage : pbandk.testpb.Proto3PresenceMessage, pbandk.MutableMessage<pbandk.testpb.Proto3PresenceMessage> {
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

    public sealed interface OneOf<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class OneOfString(oneOfString: String = "") :
            OneOf<String>, pbandk.gen.GeneratedOneOf<pbandk.testpb.Proto3PresenceMain, String>(oneOfString, pbandk.testpb.Proto3PresenceMain.FieldDescriptors.oneOfString)
        public class OneOfInt(oneOfInt: Int = 0) :
            OneOf<Int>, pbandk.gen.GeneratedOneOf<pbandk.testpb.Proto3PresenceMain, Int>(oneOfInt, pbandk.testpb.Proto3PresenceMain.FieldDescriptors.oneOfInt)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val optionalMessage: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, pbandk.testpb.Proto3PresenceMessage> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "optional_message",
                number = 1,
                type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.Proto3PresenceMessage.Companion),
                jsonName = "optionalMessage",
                value = pbandk.testpb.Proto3PresenceMain::optionalMessage,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::optionalMessage,
            )
        public val message: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, pbandk.testpb.Proto3PresenceMessage> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "message",
                number = 2,
                type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.testpb.Proto3PresenceMessage.Companion),
                jsonName = "message",
                value = pbandk.testpb.Proto3PresenceMain::message,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::message,
            )
        public val optionalString: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, String> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "optional_string",
                number = 3,
                type = pbandk.FieldDescriptor.Type.string(hasPresence = true),
                jsonName = "optionalString",
                value = pbandk.testpb.Proto3PresenceMain::optionalString,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::optionalString,
            )
        public val string: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "string",
                number = 4,
                type = pbandk.FieldDescriptor.Type.string(),
                jsonName = "string",
                value = pbandk.testpb.Proto3PresenceMain::string,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::string,
            )
        public val optionalInt: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, Int> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "optional_int",
                number = 5,
                type = pbandk.FieldDescriptor.Type.int32(hasPresence = true),
                jsonName = "optionalInt",
                value = pbandk.testpb.Proto3PresenceMain::optionalInt,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::optionalInt,
            )
        public val int: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, Int> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "int",
                number = 6,
                type = pbandk.FieldDescriptor.Type.int32(),
                jsonName = "int",
                value = pbandk.testpb.Proto3PresenceMain::int,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::int,
            )
        public val optionalEnum: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, pbandk.testpb.Proto3PresenceEnum> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "optional_enum",
                number = 7,
                type = pbandk.FieldDescriptor.Type.enum(enumCompanion = pbandk.testpb.Proto3PresenceEnum.Companion, hasPresence = true),
                jsonName = "optionalEnum",
                value = pbandk.testpb.Proto3PresenceMain::optionalEnum,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::optionalEnum,
            )
        public val enum: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, pbandk.testpb.Proto3PresenceEnum> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "enum",
                number = 8,
                type = pbandk.FieldDescriptor.Type.enum(enumCompanion = pbandk.testpb.Proto3PresenceEnum.Companion),
                jsonName = "enum",
                value = pbandk.testpb.Proto3PresenceMain::enum,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::enum,
            )
        public val oneOfString: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, String> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "one_of_string",
                number = 9,
                type = pbandk.FieldDescriptor.Type.string(hasPresence = true),
                jsonName = "oneOfString",
                value = pbandk.testpb.Proto3PresenceMain::oneOfString,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::oneOfString,
            )
        public val oneOfInt: pbandk.FieldDescriptor<pbandk.testpb.Proto3PresenceMain, Int> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "one_of_int",
                number = 10,
                type = pbandk.FieldDescriptor.Type.int32(hasPresence = true),
                jsonName = "oneOfInt",
                value = pbandk.testpb.Proto3PresenceMain::oneOfInt,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::oneOfInt,
            )

        public val oneOf: pbandk.OneofDescriptor<pbandk.testpb.Proto3PresenceMain, pbandk.testpb.Proto3PresenceMain.OneOf<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.testpb.Proto3PresenceMain::descriptor,
                name = "oneOf",
                value = pbandk.testpb.Proto3PresenceMain::oneOf,
                mutableValue = pbandk.testpb.MutableProto3PresenceMain::oneOf,
                fields = listOf(
                    oneOfString,
                    oneOfInt,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Proto3PresenceMain> {
        public val defaultInstance: pbandk.testpb.Proto3PresenceMain by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Proto3PresenceMain {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Proto3PresenceMain> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "pbandk.testpb.Proto3PresenceMain",
                messageClass = pbandk.testpb.Proto3PresenceMain::class,
                messageCompanion = this,
                builder = ::Proto3PresenceMain,
                fields = listOf(
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.message,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.string,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.int,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.enum,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.optionalMessage,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.optionalString,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.optionalInt,
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.optionalEnum,
                ),
                oneofs = listOf(
                    pbandk.testpb.Proto3PresenceMain.FieldDescriptors.oneOf,
                ),
            )
        }
    }
}

public sealed interface MutableProto3PresenceMain : pbandk.testpb.Proto3PresenceMain, pbandk.MutableMessage<pbandk.testpb.Proto3PresenceMain> {
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
public fun Proto3PresenceMessage(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit): pbandk.testpb.Proto3PresenceMessage =
    pbandk.testpb.MutableProto3PresenceMessage_Impl(
        int = 0,
    ).also(builderAction).toProto3PresenceMessage()

@pbandk.Export
@pbandk.JsName("orDefaultForProto3PresenceMessage")
public fun Proto3PresenceMessage?.orDefault(): pbandk.testpb.Proto3PresenceMessage = this ?: pbandk.testpb.Proto3PresenceMessage.defaultInstance

private class Proto3PresenceMessage_Impl(
    override val int: Int,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Proto3PresenceMessage, pbandk.gen.GeneratedMessage<pbandk.testpb.Proto3PresenceMessage>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMessage.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        int: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Proto3PresenceMessage {
        this.int = int
        this.unknownFields += unknownFields
    }
}

private class MutableProto3PresenceMessage_Impl(
    override var int: Int,
) : pbandk.testpb.MutableProto3PresenceMessage, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Proto3PresenceMessage>() {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMessage.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMessage.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        int: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toProto3PresenceMessage() = Proto3PresenceMessage_Impl(
        int = int,
        unknownFields = unknownFields.toMap()
    )
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
public fun Proto3PresenceMain(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit): pbandk.testpb.Proto3PresenceMain =
    pbandk.testpb.MutableProto3PresenceMain_Impl(
        message = null,
        string = "",
        int = 0,
        enum = pbandk.testpb.Proto3PresenceEnum.fromValue(0),
        optionalMessage = null,
        optionalString = null,
        optionalInt = null,
        optionalEnum = null,
        oneOf = null,
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
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Proto3PresenceMain, pbandk.gen.GeneratedMessage<pbandk.testpb.Proto3PresenceMain>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMain.descriptor

    override val oneOfString: String?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfString)?.value
    override val oneOfInt: Int?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfInt)?.value

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit) = super.copy(builderAction)

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
) : pbandk.testpb.MutableProto3PresenceMain, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Proto3PresenceMain>() {
    override val descriptor get() = pbandk.testpb.Proto3PresenceMain.descriptor

    override var oneOfString: String?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfString)?.value
        set(value) { oneOf = value?.let { pbandk.testpb.Proto3PresenceMain.OneOf.OneOfString(it) } }
    override var oneOfInt: Int?
        get() = (oneOf as? pbandk.testpb.Proto3PresenceMain.OneOf.OneOfInt)?.value
        set(value) { oneOf = value?.let { pbandk.testpb.Proto3PresenceMain.OneOf.OneOfInt(it) } }

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableProto3PresenceMain.() -> Unit) = super.copy(builderAction)

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

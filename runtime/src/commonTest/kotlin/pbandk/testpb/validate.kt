@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public sealed class KnownRegex(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is KnownRegex && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "KnownRegex.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNKNOWN : KnownRegex(0, "UNKNOWN")
    public object HTTP_HEADER_NAME : KnownRegex(1, "HTTP_HEADER_NAME")
    public object HTTP_HEADER_VALUE : KnownRegex(2, "HTTP_HEADER_VALUE")
    public class UNRECOGNIZED(value: Int) : KnownRegex(value)

    public companion object : pbandk.Message.Enum.Companion<KnownRegex> {
        public val values: List<KnownRegex> by lazy { listOf(UNKNOWN, HTTP_HEADER_NAME, HTTP_HEADER_VALUE) }
        override fun fromValue(value: Int): KnownRegex = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): KnownRegex = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No KnownRegex with name: $name")
    }
}

public sealed interface FieldRules : pbandk.Message {
    public val message: pbandk.testpb.MessageRules?
    public val type: Type<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FieldRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules>

    public fun copy(
        message: pbandk.testpb.MessageRules? = this.message,
        type: pbandk.testpb.FieldRules.Type<*>? = this.type,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FieldRules

    public val float: pbandk.testpb.FloatRules?
    public val double: pbandk.testpb.DoubleRules?
    public val int32: pbandk.testpb.Int32Rules?
    public val int64: pbandk.testpb.Int64Rules?
    public val uint32: pbandk.testpb.UInt32Rules?
    public val uint64: pbandk.testpb.UInt64Rules?
    public val sint32: pbandk.testpb.SInt32Rules?
    public val sint64: pbandk.testpb.SInt64Rules?
    public val fixed32: pbandk.testpb.Fixed32Rules?
    public val fixed64: pbandk.testpb.Fixed64Rules?
    public val sfixed32: pbandk.testpb.SFixed32Rules?
    public val sfixed64: pbandk.testpb.SFixed64Rules?
    public val bool: pbandk.testpb.BoolRules?
    public val string: pbandk.testpb.StringRules?
    public val bytes: pbandk.testpb.BytesRules?
    public val enum: pbandk.testpb.EnumRules?
    public val repeated: pbandk.testpb.RepeatedRules?
    public val map: pbandk.testpb.MapRules?
    public val any: pbandk.testpb.AnyRules?
    public val duration: pbandk.testpb.DurationRules?
    public val timestamp: pbandk.testpb.TimestampRules?

    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Float_(float: pbandk.testpb.FloatRules) : Type<pbandk.testpb.FloatRules>(float)
        public class Double_(double: pbandk.testpb.DoubleRules) : Type<pbandk.testpb.DoubleRules>(double)
        public class Int32(int32: pbandk.testpb.Int32Rules) : Type<pbandk.testpb.Int32Rules>(int32)
        public class Int64(int64: pbandk.testpb.Int64Rules) : Type<pbandk.testpb.Int64Rules>(int64)
        public class Uint32(uint32: pbandk.testpb.UInt32Rules) : Type<pbandk.testpb.UInt32Rules>(uint32)
        public class Uint64(uint64: pbandk.testpb.UInt64Rules) : Type<pbandk.testpb.UInt64Rules>(uint64)
        public class Sint32(sint32: pbandk.testpb.SInt32Rules) : Type<pbandk.testpb.SInt32Rules>(sint32)
        public class Sint64(sint64: pbandk.testpb.SInt64Rules) : Type<pbandk.testpb.SInt64Rules>(sint64)
        public class Fixed32(fixed32: pbandk.testpb.Fixed32Rules) : Type<pbandk.testpb.Fixed32Rules>(fixed32)
        public class Fixed64(fixed64: pbandk.testpb.Fixed64Rules) : Type<pbandk.testpb.Fixed64Rules>(fixed64)
        public class Sfixed32(sfixed32: pbandk.testpb.SFixed32Rules) : Type<pbandk.testpb.SFixed32Rules>(sfixed32)
        public class Sfixed64(sfixed64: pbandk.testpb.SFixed64Rules) : Type<pbandk.testpb.SFixed64Rules>(sfixed64)
        public class Bool(bool: pbandk.testpb.BoolRules) : Type<pbandk.testpb.BoolRules>(bool)
        public class String_(string: pbandk.testpb.StringRules) : Type<pbandk.testpb.StringRules>(string)
        public class Bytes(bytes: pbandk.testpb.BytesRules) : Type<pbandk.testpb.BytesRules>(bytes)
        public class Enum(enum: pbandk.testpb.EnumRules) : Type<pbandk.testpb.EnumRules>(enum)
        public class Repeated(repeated: pbandk.testpb.RepeatedRules) : Type<pbandk.testpb.RepeatedRules>(repeated)
        public class Map_(map: pbandk.testpb.MapRules) : Type<pbandk.testpb.MapRules>(map)
        public class Any(any: pbandk.testpb.AnyRules) : Type<pbandk.testpb.AnyRules>(any)
        public class Duration(duration: pbandk.testpb.DurationRules) : Type<pbandk.testpb.DurationRules>(duration)
        public class Timestamp(timestamp: pbandk.testpb.TimestampRules) : Type<pbandk.testpb.TimestampRules>(timestamp)
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.FieldRules> {
        @Deprecated("Use fieldRules { } instead")
        public operator fun invoke(
            message: pbandk.testpb.MessageRules? = null,
            type: Type<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FieldRules = FieldRules_Impl(
            message = message,
            type = type,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.FieldRules by lazy { pbandk.testpb.FieldRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FieldRules = pbandk.testpb.FieldRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FieldRules, *>>(22)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "float",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FloatRules.Companion),
                        oneofMember = true,
                        jsonName = "float",
                        value = pbandk.testpb.FieldRules::float
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "double",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.DoubleRules.Companion),
                        oneofMember = true,
                        jsonName = "double",
                        value = pbandk.testpb.FieldRules::double
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "int32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Int32Rules.Companion),
                        oneofMember = true,
                        jsonName = "int32",
                        value = pbandk.testpb.FieldRules::int32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "int64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Int64Rules.Companion),
                        oneofMember = true,
                        jsonName = "int64",
                        value = pbandk.testpb.FieldRules::int64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.UInt32Rules.Companion),
                        oneofMember = true,
                        jsonName = "uint32",
                        value = pbandk.testpb.FieldRules::uint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.UInt64Rules.Companion),
                        oneofMember = true,
                        jsonName = "uint64",
                        value = pbandk.testpb.FieldRules::uint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sint32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SInt32Rules.Companion),
                        oneofMember = true,
                        jsonName = "sint32",
                        value = pbandk.testpb.FieldRules::sint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sint64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SInt64Rules.Companion),
                        oneofMember = true,
                        jsonName = "sint64",
                        value = pbandk.testpb.FieldRules::sint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Fixed32Rules.Companion),
                        oneofMember = true,
                        jsonName = "fixed32",
                        value = pbandk.testpb.FieldRules::fixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Fixed64Rules.Companion),
                        oneofMember = true,
                        jsonName = "fixed64",
                        value = pbandk.testpb.FieldRules::fixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sfixed32",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SFixed32Rules.Companion),
                        oneofMember = true,
                        jsonName = "sfixed32",
                        value = pbandk.testpb.FieldRules::sfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sfixed64",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SFixed64Rules.Companion),
                        oneofMember = true,
                        jsonName = "sfixed64",
                        value = pbandk.testpb.FieldRules::sfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.BoolRules.Companion),
                        oneofMember = true,
                        jsonName = "bool",
                        value = pbandk.testpb.FieldRules::bool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.StringRules.Companion),
                        oneofMember = true,
                        jsonName = "string",
                        value = pbandk.testpb.FieldRules::string
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.BytesRules.Companion),
                        oneofMember = true,
                        jsonName = "bytes",
                        value = pbandk.testpb.FieldRules::bytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.EnumRules.Companion),
                        oneofMember = true,
                        jsonName = "enum",
                        value = pbandk.testpb.FieldRules::enum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MessageRules.Companion),
                        jsonName = "message",
                        value = pbandk.testpb.FieldRules::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.RepeatedRules.Companion),
                        oneofMember = true,
                        jsonName = "repeated",
                        value = pbandk.testpb.FieldRules::repeated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MapRules.Companion),
                        oneofMember = true,
                        jsonName = "map",
                        value = pbandk.testpb.FieldRules::map
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "any",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.AnyRules.Companion),
                        oneofMember = true,
                        jsonName = "any",
                        value = pbandk.testpb.FieldRules::any
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "duration",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.DurationRules.Companion),
                        oneofMember = true,
                        jsonName = "duration",
                        value = pbandk.testpb.FieldRules::duration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TimestampRules.Companion),
                        oneofMember = true,
                        jsonName = "timestamp",
                        value = pbandk.testpb.FieldRules::timestamp
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.FieldRules",
                messageClass = pbandk.testpb.FieldRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFieldRules : FieldRules, pbandk.MutableMessage {
    public override var message: pbandk.testpb.MessageRules?
    public override var type: FieldRules.Type<*>?

    public override var float: pbandk.testpb.FloatRules?
    public override var double: pbandk.testpb.DoubleRules?
    public override var int32: pbandk.testpb.Int32Rules?
    public override var int64: pbandk.testpb.Int64Rules?
    public override var uint32: pbandk.testpb.UInt32Rules?
    public override var uint64: pbandk.testpb.UInt64Rules?
    public override var sint32: pbandk.testpb.SInt32Rules?
    public override var sint64: pbandk.testpb.SInt64Rules?
    public override var fixed32: pbandk.testpb.Fixed32Rules?
    public override var fixed64: pbandk.testpb.Fixed64Rules?
    public override var sfixed32: pbandk.testpb.SFixed32Rules?
    public override var sfixed64: pbandk.testpb.SFixed64Rules?
    public override var bool: pbandk.testpb.BoolRules?
    public override var string: pbandk.testpb.StringRules?
    public override var bytes: pbandk.testpb.BytesRules?
    public override var enum: pbandk.testpb.EnumRules?
    public override var repeated: pbandk.testpb.RepeatedRules?
    public override var map: pbandk.testpb.MapRules?
    public override var any: pbandk.testpb.AnyRules?
    public override var duration: pbandk.testpb.DurationRules?
    public override var timestamp: pbandk.testpb.TimestampRules?

    public fun toFieldRules(): FieldRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.FieldRules> {
        @Deprecated("Use fieldRules { } instead")
        public operator fun invoke(
            message: pbandk.testpb.MessageRules? = null,
            type: pbandk.testpb.FieldRules.Type<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFieldRules = MutableFieldRules_Impl(
            message = message,
            type = type,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFieldRules by lazy { MutableFieldRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FieldRules = pbandk.testpb.FieldRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules> get() = pbandk.testpb.FieldRules.descriptor
    }
}

public sealed interface FloatRules : pbandk.Message {
    public val const: Float?
    public val lt: Float?
    public val lte: Float?
    public val gt: Float?
    public val gte: Float?
    public val `in`: List<Float>
    public val notIn: List<Float>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FloatRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FloatRules>

    public fun copy(
        const: Float? = this.const,
        lt: Float? = this.lt,
        lte: Float? = this.lte,
        gt: Float? = this.gt,
        gte: Float? = this.gte,
        `in`: List<Float> = this.`in`,
        notIn: List<Float> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.FloatRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.FloatRules> {
        @Deprecated("Use floatRules { } instead")
        public operator fun invoke(
            const: Float? = null,
            lt: Float? = null,
            lte: Float? = null,
            gt: Float? = null,
            gte: Float? = null,
            `in`: List<Float> = emptyList(),
            notIn: List<Float> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FloatRules = FloatRules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.FloatRules by lazy { pbandk.testpb.FloatRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FloatRules = pbandk.testpb.FloatRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FloatRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FloatRules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.FloatRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.FloatRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.FloatRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.FloatRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.FloatRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "in",
                        value = pbandk.testpb.FloatRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "notIn",
                        value = pbandk.testpb.FloatRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.FloatRules",
                messageClass = pbandk.testpb.FloatRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFloatRules : FloatRules, pbandk.MutableMessage {
    public override var const: Float?
    public override var lt: Float?
    public override var lte: Float?
    public override var gt: Float?
    public override var gte: Float?
    public override var `in`: List<Float>
    public override var notIn: List<Float>

    public fun toFloatRules(): FloatRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.FloatRules> {
        @Deprecated("Use floatRules { } instead")
        public operator fun invoke(
            const: Float? = null,
            lt: Float? = null,
            lte: Float? = null,
            gt: Float? = null,
            gte: Float? = null,
            `in`: List<Float> = emptyList(),
            notIn: List<Float> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFloatRules = MutableFloatRules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFloatRules by lazy { MutableFloatRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.FloatRules = pbandk.testpb.FloatRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FloatRules> get() = pbandk.testpb.FloatRules.descriptor
    }
}

public sealed interface DoubleRules : pbandk.Message {
    public val const: Double?
    public val lt: Double?
    public val lte: Double?
    public val gt: Double?
    public val gte: Double?
    public val `in`: List<Double>
    public val notIn: List<Double>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.DoubleRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DoubleRules>

    public fun copy(
        const: Double? = this.const,
        lt: Double? = this.lt,
        lte: Double? = this.lte,
        gt: Double? = this.gt,
        gte: Double? = this.gte,
        `in`: List<Double> = this.`in`,
        notIn: List<Double> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.DoubleRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.DoubleRules> {
        @Deprecated("Use doubleRules { } instead")
        public operator fun invoke(
            const: Double? = null,
            lt: Double? = null,
            lte: Double? = null,
            gt: Double? = null,
            gte: Double? = null,
            `in`: List<Double> = emptyList(),
            notIn: List<Double> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.DoubleRules = DoubleRules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.DoubleRules by lazy { pbandk.testpb.DoubleRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.DoubleRules = pbandk.testpb.DoubleRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DoubleRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.DoubleRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.DoubleRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.DoubleRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.DoubleRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.DoubleRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "in",
                        value = pbandk.testpb.DoubleRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "notIn",
                        value = pbandk.testpb.DoubleRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.DoubleRules",
                messageClass = pbandk.testpb.DoubleRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableDoubleRules : DoubleRules, pbandk.MutableMessage {
    public override var const: Double?
    public override var lt: Double?
    public override var lte: Double?
    public override var gt: Double?
    public override var gte: Double?
    public override var `in`: List<Double>
    public override var notIn: List<Double>

    public fun toDoubleRules(): DoubleRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.DoubleRules> {
        @Deprecated("Use doubleRules { } instead")
        public operator fun invoke(
            const: Double? = null,
            lt: Double? = null,
            lte: Double? = null,
            gt: Double? = null,
            gte: Double? = null,
            `in`: List<Double> = emptyList(),
            notIn: List<Double> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableDoubleRules = MutableDoubleRules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableDoubleRules by lazy { MutableDoubleRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.DoubleRules = pbandk.testpb.DoubleRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DoubleRules> get() = pbandk.testpb.DoubleRules.descriptor
    }
}

public sealed interface Int32Rules : pbandk.Message {
    public val const: Int?
    public val lt: Int?
    public val lte: Int?
    public val gt: Int?
    public val gte: Int?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Int32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int32Rules>

    public fun copy(
        const: Int? = this.const,
        lt: Int? = this.lt,
        lte: Int? = this.lte,
        gt: Int? = this.gt,
        gte: Int? = this.gte,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Int32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Int32Rules> {
        @Deprecated("Use int32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Int32Rules = Int32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Int32Rules by lazy { pbandk.testpb.Int32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Int32Rules = pbandk.testpb.Int32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Int32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Int32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Int32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Int32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Int32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "in",
                        value = pbandk.testpb.Int32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Int32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.Int32Rules",
                messageClass = pbandk.testpb.Int32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableInt32Rules : Int32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override var `in`: List<Int>
    public override var notIn: List<Int>

    public fun toInt32Rules(): Int32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Int32Rules> {
        @Deprecated("Use int32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableInt32Rules = MutableInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableInt32Rules by lazy { MutableInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Int32Rules = pbandk.testpb.Int32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int32Rules> get() = pbandk.testpb.Int32Rules.descriptor
    }
}

public sealed interface Int64Rules : pbandk.Message {
    public val const: Long?
    public val lt: Long?
    public val lte: Long?
    public val gt: Long?
    public val gte: Long?
    public val `in`: List<Long>
    public val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Int64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int64Rules>

    public fun copy(
        const: Long? = this.const,
        lt: Long? = this.lt,
        lte: Long? = this.lte,
        gt: Long? = this.gt,
        gte: Long? = this.gte,
        `in`: List<Long> = this.`in`,
        notIn: List<Long> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Int64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Int64Rules> {
        @Deprecated("Use int64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Int64Rules = Int64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Int64Rules by lazy { pbandk.testpb.Int64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Int64Rules = pbandk.testpb.Int64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Int64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Int64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Int64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Int64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Int64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "in",
                        value = pbandk.testpb.Int64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Int64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.Int64Rules",
                messageClass = pbandk.testpb.Int64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableInt64Rules : Int64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override var `in`: List<Long>
    public override var notIn: List<Long>

    public fun toInt64Rules(): Int64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Int64Rules> {
        @Deprecated("Use int64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableInt64Rules = MutableInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableInt64Rules by lazy { MutableInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Int64Rules = pbandk.testpb.Int64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int64Rules> get() = pbandk.testpb.Int64Rules.descriptor
    }
}

public sealed interface UInt32Rules : pbandk.Message {
    public val const: Int?
    public val lt: Int?
    public val lte: Int?
    public val gt: Int?
    public val gte: Int?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.UInt32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt32Rules>

    public fun copy(
        const: Int? = this.const,
        lt: Int? = this.lt,
        lte: Int? = this.lte,
        gt: Int? = this.gt,
        gte: Int? = this.gte,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.UInt32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.UInt32Rules> {
        @Deprecated("Use uInt32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.UInt32Rules = UInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.UInt32Rules by lazy { pbandk.testpb.UInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.UInt32Rules = pbandk.testpb.UInt32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.UInt32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.UInt32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.UInt32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.UInt32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.UInt32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "in",
                        value = pbandk.testpb.UInt32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.UInt32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.UInt32Rules",
                messageClass = pbandk.testpb.UInt32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableUInt32Rules : UInt32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override var `in`: List<Int>
    public override var notIn: List<Int>

    public fun toUInt32Rules(): UInt32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.UInt32Rules> {
        @Deprecated("Use uInt32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableUInt32Rules = MutableUInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableUInt32Rules by lazy { MutableUInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.UInt32Rules = pbandk.testpb.UInt32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt32Rules> get() = pbandk.testpb.UInt32Rules.descriptor
    }
}

public sealed interface UInt64Rules : pbandk.Message {
    public val const: Long?
    public val lt: Long?
    public val lte: Long?
    public val gt: Long?
    public val gte: Long?
    public val `in`: List<Long>
    public val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.UInt64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt64Rules>

    public fun copy(
        const: Long? = this.const,
        lt: Long? = this.lt,
        lte: Long? = this.lte,
        gt: Long? = this.gt,
        gte: Long? = this.gte,
        `in`: List<Long> = this.`in`,
        notIn: List<Long> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.UInt64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.UInt64Rules> {
        @Deprecated("Use uInt64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.UInt64Rules = UInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.UInt64Rules by lazy { pbandk.testpb.UInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.UInt64Rules = pbandk.testpb.UInt64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.UInt64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.UInt64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.UInt64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.UInt64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.UInt64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "in",
                        value = pbandk.testpb.UInt64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.UInt64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.UInt64Rules",
                messageClass = pbandk.testpb.UInt64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableUInt64Rules : UInt64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override var `in`: List<Long>
    public override var notIn: List<Long>

    public fun toUInt64Rules(): UInt64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.UInt64Rules> {
        @Deprecated("Use uInt64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableUInt64Rules = MutableUInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableUInt64Rules by lazy { MutableUInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.UInt64Rules = pbandk.testpb.UInt64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt64Rules> get() = pbandk.testpb.UInt64Rules.descriptor
    }
}

public sealed interface SInt32Rules : pbandk.Message {
    public val const: Int?
    public val lt: Int?
    public val lte: Int?
    public val gt: Int?
    public val gte: Int?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SInt32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt32Rules>

    public fun copy(
        const: Int? = this.const,
        lt: Int? = this.lt,
        lte: Int? = this.lte,
        gt: Int? = this.gt,
        gte: Int? = this.gte,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SInt32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SInt32Rules> {
        @Deprecated("Use sInt32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SInt32Rules = SInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.SInt32Rules by lazy { pbandk.testpb.SInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SInt32Rules = pbandk.testpb.SInt32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SInt32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SInt32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SInt32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SInt32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SInt32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "in",
                        value = pbandk.testpb.SInt32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SInt32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.SInt32Rules",
                messageClass = pbandk.testpb.SInt32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableSInt32Rules : SInt32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override var `in`: List<Int>
    public override var notIn: List<Int>

    public fun toSInt32Rules(): SInt32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SInt32Rules> {
        @Deprecated("Use sInt32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableSInt32Rules = MutableSInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableSInt32Rules by lazy { MutableSInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SInt32Rules = pbandk.testpb.SInt32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt32Rules> get() = pbandk.testpb.SInt32Rules.descriptor
    }
}

public sealed interface SInt64Rules : pbandk.Message {
    public val const: Long?
    public val lt: Long?
    public val lte: Long?
    public val gt: Long?
    public val gte: Long?
    public val `in`: List<Long>
    public val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SInt64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt64Rules>

    public fun copy(
        const: Long? = this.const,
        lt: Long? = this.lt,
        lte: Long? = this.lte,
        gt: Long? = this.gt,
        gte: Long? = this.gte,
        `in`: List<Long> = this.`in`,
        notIn: List<Long> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SInt64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SInt64Rules> {
        @Deprecated("Use sInt64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SInt64Rules = SInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.SInt64Rules by lazy { pbandk.testpb.SInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SInt64Rules = pbandk.testpb.SInt64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SInt64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SInt64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SInt64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SInt64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SInt64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "in",
                        value = pbandk.testpb.SInt64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SInt64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.SInt64Rules",
                messageClass = pbandk.testpb.SInt64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableSInt64Rules : SInt64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override var `in`: List<Long>
    public override var notIn: List<Long>

    public fun toSInt64Rules(): SInt64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SInt64Rules> {
        @Deprecated("Use sInt64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableSInt64Rules = MutableSInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableSInt64Rules by lazy { MutableSInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SInt64Rules = pbandk.testpb.SInt64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt64Rules> get() = pbandk.testpb.SInt64Rules.descriptor
    }
}

public sealed interface Fixed32Rules : pbandk.Message {
    public val const: Int?
    public val lt: Int?
    public val lte: Int?
    public val gt: Int?
    public val gte: Int?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Fixed32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed32Rules>

    public fun copy(
        const: Int? = this.const,
        lt: Int? = this.lt,
        lte: Int? = this.lte,
        gt: Int? = this.gt,
        gte: Int? = this.gte,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Fixed32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Fixed32Rules> {
        @Deprecated("Use fixed32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Fixed32Rules = Fixed32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Fixed32Rules by lazy { pbandk.testpb.Fixed32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Fixed32Rules = pbandk.testpb.Fixed32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Fixed32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Fixed32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Fixed32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Fixed32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Fixed32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "in",
                        value = pbandk.testpb.Fixed32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Fixed32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.Fixed32Rules",
                messageClass = pbandk.testpb.Fixed32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFixed32Rules : Fixed32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override var `in`: List<Int>
    public override var notIn: List<Int>

    public fun toFixed32Rules(): Fixed32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Fixed32Rules> {
        @Deprecated("Use fixed32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFixed32Rules = MutableFixed32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFixed32Rules by lazy { MutableFixed32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Fixed32Rules = pbandk.testpb.Fixed32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed32Rules> get() = pbandk.testpb.Fixed32Rules.descriptor
    }
}

public sealed interface Fixed64Rules : pbandk.Message {
    public val const: Long?
    public val lt: Long?
    public val lte: Long?
    public val gt: Long?
    public val gte: Long?
    public val `in`: List<Long>
    public val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Fixed64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed64Rules>

    public fun copy(
        const: Long? = this.const,
        lt: Long? = this.lt,
        lte: Long? = this.lte,
        gt: Long? = this.gt,
        gte: Long? = this.gte,
        `in`: List<Long> = this.`in`,
        notIn: List<Long> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Fixed64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Fixed64Rules> {
        @Deprecated("Use fixed64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Fixed64Rules = Fixed64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Fixed64Rules by lazy { pbandk.testpb.Fixed64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Fixed64Rules = pbandk.testpb.Fixed64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Fixed64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Fixed64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Fixed64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Fixed64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Fixed64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "in",
                        value = pbandk.testpb.Fixed64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Fixed64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.Fixed64Rules",
                messageClass = pbandk.testpb.Fixed64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFixed64Rules : Fixed64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override var `in`: List<Long>
    public override var notIn: List<Long>

    public fun toFixed64Rules(): Fixed64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.Fixed64Rules> {
        @Deprecated("Use fixed64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFixed64Rules = MutableFixed64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableFixed64Rules by lazy { MutableFixed64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Fixed64Rules = pbandk.testpb.Fixed64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed64Rules> get() = pbandk.testpb.Fixed64Rules.descriptor
    }
}

public sealed interface SFixed32Rules : pbandk.Message {
    public val const: Int?
    public val lt: Int?
    public val lte: Int?
    public val gt: Int?
    public val gte: Int?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SFixed32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed32Rules>

    public fun copy(
        const: Int? = this.const,
        lt: Int? = this.lt,
        lte: Int? = this.lte,
        gt: Int? = this.gt,
        gte: Int? = this.gte,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SFixed32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SFixed32Rules> {
        @Deprecated("Use sFixed32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SFixed32Rules = SFixed32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.SFixed32Rules by lazy { pbandk.testpb.SFixed32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SFixed32Rules = pbandk.testpb.SFixed32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SFixed32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SFixed32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SFixed32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SFixed32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SFixed32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "in",
                        value = pbandk.testpb.SFixed32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SFixed32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.SFixed32Rules",
                messageClass = pbandk.testpb.SFixed32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableSFixed32Rules : SFixed32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override var `in`: List<Int>
    public override var notIn: List<Int>

    public fun toSFixed32Rules(): SFixed32Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SFixed32Rules> {
        @Deprecated("Use sFixed32Rules { } instead")
        public operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableSFixed32Rules = MutableSFixed32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableSFixed32Rules by lazy { MutableSFixed32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SFixed32Rules = pbandk.testpb.SFixed32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed32Rules> get() = pbandk.testpb.SFixed32Rules.descriptor
    }
}

public sealed interface SFixed64Rules : pbandk.Message {
    public val const: Long?
    public val lt: Long?
    public val lte: Long?
    public val gt: Long?
    public val gte: Long?
    public val `in`: List<Long>
    public val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SFixed64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed64Rules>

    public fun copy(
        const: Long? = this.const,
        lt: Long? = this.lt,
        lte: Long? = this.lte,
        gt: Long? = this.gt,
        gte: Long? = this.gte,
        `in`: List<Long> = this.`in`,
        notIn: List<Long> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SFixed64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SFixed64Rules> {
        @Deprecated("Use sFixed64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SFixed64Rules = SFixed64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.SFixed64Rules by lazy { pbandk.testpb.SFixed64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SFixed64Rules = pbandk.testpb.SFixed64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SFixed64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SFixed64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SFixed64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SFixed64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SFixed64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "in",
                        value = pbandk.testpb.SFixed64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SFixed64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.SFixed64Rules",
                messageClass = pbandk.testpb.SFixed64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableSFixed64Rules : SFixed64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override var `in`: List<Long>
    public override var notIn: List<Long>

    public fun toSFixed64Rules(): SFixed64Rules

    public companion object : pbandk.Message.Companion<pbandk.testpb.SFixed64Rules> {
        @Deprecated("Use sFixed64Rules { } instead")
        public operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableSFixed64Rules = MutableSFixed64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableSFixed64Rules by lazy { MutableSFixed64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SFixed64Rules = pbandk.testpb.SFixed64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed64Rules> get() = pbandk.testpb.SFixed64Rules.descriptor
    }
}

public sealed interface BoolRules : pbandk.Message {
    public val const: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.BoolRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules>

    public fun copy(
        const: Boolean? = this.const,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.BoolRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.BoolRules> {
        @Deprecated("Use boolRules { } instead")
        public operator fun invoke(
            const: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.BoolRules = BoolRules_Impl(
            const = const,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.BoolRules by lazy { pbandk.testpb.BoolRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.BoolRules = pbandk.testpb.BoolRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.BoolRules, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.BoolRules::const
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.BoolRules",
                messageClass = pbandk.testpb.BoolRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableBoolRules : BoolRules, pbandk.MutableMessage {
    public override var const: Boolean?

    public fun toBoolRules(): BoolRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.BoolRules> {
        @Deprecated("Use boolRules { } instead")
        public operator fun invoke(
            const: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableBoolRules = MutableBoolRules_Impl(
            const = const,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableBoolRules by lazy { MutableBoolRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.BoolRules = pbandk.testpb.BoolRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules> get() = pbandk.testpb.BoolRules.descriptor
    }
}

public sealed interface StringRules : pbandk.Message {
    public val const: String?
    public val len: Long?
    public val minLen: Long?
    public val maxLen: Long?
    public val lenBytes: Long?
    public val minBytes: Long?
    public val maxBytes: Long?
    public val pattern: String?
    public val prefix: String?
    public val suffix: String?
    public val contains: String?
    public val notContains: String?
    public val `in`: List<String>
    public val notIn: List<String>
    public val strict: Boolean?
    public val wellKnown: WellKnown<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.StringRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.StringRules>

    public fun copy(
        const: String? = this.const,
        len: Long? = this.len,
        minLen: Long? = this.minLen,
        maxLen: Long? = this.maxLen,
        lenBytes: Long? = this.lenBytes,
        minBytes: Long? = this.minBytes,
        maxBytes: Long? = this.maxBytes,
        pattern: String? = this.pattern,
        prefix: String? = this.prefix,
        suffix: String? = this.suffix,
        contains: String? = this.contains,
        notContains: String? = this.notContains,
        `in`: List<String> = this.`in`,
        notIn: List<String> = this.notIn,
        strict: Boolean? = this.strict,
        wellKnown: pbandk.testpb.StringRules.WellKnown<*>? = this.wellKnown,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.StringRules

    public val email: Boolean?
    public val hostname: Boolean?
    public val ip: Boolean?
    public val ipv4: Boolean?
    public val ipv6: Boolean?
    public val uri: Boolean?
    public val uriRef: Boolean?
    public val address: Boolean?
    public val uuid: Boolean?
    public val wellKnownRegex: pbandk.testpb.KnownRegex?

    public sealed class WellKnown<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Email(email: Boolean = false) : WellKnown<Boolean>(email)
        public class Hostname(hostname: Boolean = false) : WellKnown<Boolean>(hostname)
        public class Ip(ip: Boolean = false) : WellKnown<Boolean>(ip)
        public class Ipv4(ipv4: Boolean = false) : WellKnown<Boolean>(ipv4)
        public class Ipv6(ipv6: Boolean = false) : WellKnown<Boolean>(ipv6)
        public class Uri(uri: Boolean = false) : WellKnown<Boolean>(uri)
        public class UriRef(uriRef: Boolean = false) : WellKnown<Boolean>(uriRef)
        public class Address(address: Boolean = false) : WellKnown<Boolean>(address)
        public class Uuid(uuid: Boolean = false) : WellKnown<Boolean>(uuid)
        public class WellKnownRegex(wellKnownRegex: pbandk.testpb.KnownRegex = pbandk.testpb.KnownRegex.fromValue(0)) : WellKnown<pbandk.testpb.KnownRegex>(wellKnownRegex)
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.StringRules> {
        @Deprecated("Use stringRules { } instead")
        public operator fun invoke(
            const: String? = null,
            len: Long? = null,
            minLen: Long? = null,
            maxLen: Long? = null,
            lenBytes: Long? = null,
            minBytes: Long? = null,
            maxBytes: Long? = null,
            pattern: String? = null,
            prefix: String? = null,
            suffix: String? = null,
            contains: String? = null,
            notContains: String? = null,
            `in`: List<String> = emptyList(),
            notIn: List<String> = emptyList(),
            strict: Boolean? = null,
            wellKnown: WellKnown<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.StringRules = StringRules_Impl(
            const = const,
            len = len,
            minLen = minLen,
            maxLen = maxLen,
            lenBytes = lenBytes,
            minBytes = minBytes,
            maxBytes = maxBytes,
            pattern = pattern,
            prefix = prefix,
            suffix = suffix,
            contains = contains,
            notContains = notContains,
            `in` = `in`,
            notIn = notIn,
            strict = strict,
            wellKnown = wellKnown,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.StringRules by lazy { pbandk.testpb.StringRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.StringRules = pbandk.testpb.StringRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.StringRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.StringRules, *>>(25)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.StringRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_len",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minLen",
                        value = pbandk.testpb.StringRules::minLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_len",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxLen",
                        value = pbandk.testpb.StringRules::maxLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_bytes",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minBytes",
                        value = pbandk.testpb.StringRules::minBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_bytes",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxBytes",
                        value = pbandk.testpb.StringRules::maxBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pattern",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "pattern",
                        value = pbandk.testpb.StringRules::pattern
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prefix",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "prefix",
                        value = pbandk.testpb.StringRules::prefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.testpb.StringRules::suffix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contains",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "contains",
                        value = pbandk.testpb.StringRules::contains
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "in",
                        value = pbandk.testpb.StringRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "notIn",
                        value = pbandk.testpb.StringRules::notIn
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "email",
                        value = pbandk.testpb.StringRules::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "hostname",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "hostname",
                        value = pbandk.testpb.StringRules::hostname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ip",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ip",
                        value = pbandk.testpb.StringRules::ip
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv4",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv4",
                        value = pbandk.testpb.StringRules::ipv4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv6",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv6",
                        value = pbandk.testpb.StringRules::ipv6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uri",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "uri",
                        value = pbandk.testpb.StringRules::uri
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uri_ref",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "uriRef",
                        value = pbandk.testpb.StringRules::uriRef
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "len",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "len",
                        value = pbandk.testpb.StringRules::len
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "len_bytes",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "lenBytes",
                        value = pbandk.testpb.StringRules::lenBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "address",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "address",
                        value = pbandk.testpb.StringRules::address
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uuid",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "uuid",
                        value = pbandk.testpb.StringRules::uuid
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_contains",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "notContains",
                        value = pbandk.testpb.StringRules::notContains
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "well_known_regex",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.KnownRegex.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "wellKnownRegex",
                        value = pbandk.testpb.StringRules::wellKnownRegex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "strict",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "strict",
                        value = pbandk.testpb.StringRules::strict
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.StringRules",
                messageClass = pbandk.testpb.StringRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableStringRules : StringRules, pbandk.MutableMessage {
    public override var const: String?
    public override var len: Long?
    public override var minLen: Long?
    public override var maxLen: Long?
    public override var lenBytes: Long?
    public override var minBytes: Long?
    public override var maxBytes: Long?
    public override var pattern: String?
    public override var prefix: String?
    public override var suffix: String?
    public override var contains: String?
    public override var notContains: String?
    public override var `in`: List<String>
    public override var notIn: List<String>
    public override var strict: Boolean?
    public override var wellKnown: StringRules.WellKnown<*>?

    public override var email: Boolean?
    public override var hostname: Boolean?
    public override var ip: Boolean?
    public override var ipv4: Boolean?
    public override var ipv6: Boolean?
    public override var uri: Boolean?
    public override var uriRef: Boolean?
    public override var address: Boolean?
    public override var uuid: Boolean?
    public override var wellKnownRegex: pbandk.testpb.KnownRegex?

    public fun toStringRules(): StringRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.StringRules> {
        @Deprecated("Use stringRules { } instead")
        public operator fun invoke(
            const: String? = null,
            len: Long? = null,
            minLen: Long? = null,
            maxLen: Long? = null,
            lenBytes: Long? = null,
            minBytes: Long? = null,
            maxBytes: Long? = null,
            pattern: String? = null,
            prefix: String? = null,
            suffix: String? = null,
            contains: String? = null,
            notContains: String? = null,
            `in`: List<String> = emptyList(),
            notIn: List<String> = emptyList(),
            strict: Boolean? = null,
            wellKnown: pbandk.testpb.StringRules.WellKnown<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableStringRules = MutableStringRules_Impl(
            const = const,
            len = len,
            minLen = minLen,
            maxLen = maxLen,
            lenBytes = lenBytes,
            minBytes = minBytes,
            maxBytes = maxBytes,
            pattern = pattern,
            prefix = prefix,
            suffix = suffix,
            contains = contains,
            notContains = notContains,
            `in` = `in`,
            notIn = notIn,
            strict = strict,
            wellKnown = wellKnown,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableStringRules by lazy { MutableStringRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.StringRules = pbandk.testpb.StringRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.StringRules> get() = pbandk.testpb.StringRules.descriptor
    }
}

public sealed interface BytesRules : pbandk.Message {
    public val const: pbandk.ByteArr?
    public val len: Long?
    public val minLen: Long?
    public val maxLen: Long?
    public val pattern: String?
    public val prefix: pbandk.ByteArr?
    public val suffix: pbandk.ByteArr?
    public val contains: pbandk.ByteArr?
    public val `in`: List<pbandk.ByteArr>
    public val notIn: List<pbandk.ByteArr>
    public val wellKnown: WellKnown<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.BytesRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BytesRules>

    public fun copy(
        const: pbandk.ByteArr? = this.const,
        len: Long? = this.len,
        minLen: Long? = this.minLen,
        maxLen: Long? = this.maxLen,
        pattern: String? = this.pattern,
        prefix: pbandk.ByteArr? = this.prefix,
        suffix: pbandk.ByteArr? = this.suffix,
        contains: pbandk.ByteArr? = this.contains,
        `in`: List<pbandk.ByteArr> = this.`in`,
        notIn: List<pbandk.ByteArr> = this.notIn,
        wellKnown: pbandk.testpb.BytesRules.WellKnown<*>? = this.wellKnown,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.BytesRules

    public val ip: Boolean?
    public val ipv4: Boolean?
    public val ipv6: Boolean?

    public sealed class WellKnown<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Ip(ip: Boolean = false) : WellKnown<Boolean>(ip)
        public class Ipv4(ipv4: Boolean = false) : WellKnown<Boolean>(ipv4)
        public class Ipv6(ipv6: Boolean = false) : WellKnown<Boolean>(ipv6)
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.BytesRules> {
        @Deprecated("Use bytesRules { } instead")
        public operator fun invoke(
            const: pbandk.ByteArr? = null,
            len: Long? = null,
            minLen: Long? = null,
            maxLen: Long? = null,
            pattern: String? = null,
            prefix: pbandk.ByteArr? = null,
            suffix: pbandk.ByteArr? = null,
            contains: pbandk.ByteArr? = null,
            `in`: List<pbandk.ByteArr> = emptyList(),
            notIn: List<pbandk.ByteArr> = emptyList(),
            wellKnown: WellKnown<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.BytesRules = BytesRules_Impl(
            const = const,
            len = len,
            minLen = minLen,
            maxLen = maxLen,
            pattern = pattern,
            prefix = prefix,
            suffix = suffix,
            contains = contains,
            `in` = `in`,
            notIn = notIn,
            wellKnown = wellKnown,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.BytesRules by lazy { pbandk.testpb.BytesRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.BytesRules = pbandk.testpb.BytesRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BytesRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.BytesRules, *>>(13)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.BytesRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_len",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minLen",
                        value = pbandk.testpb.BytesRules::minLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_len",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxLen",
                        value = pbandk.testpb.BytesRules::maxLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pattern",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "pattern",
                        value = pbandk.testpb.BytesRules::pattern
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prefix",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "prefix",
                        value = pbandk.testpb.BytesRules::prefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.testpb.BytesRules::suffix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contains",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "contains",
                        value = pbandk.testpb.BytesRules::contains
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "in",
                        value = pbandk.testpb.BytesRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "notIn",
                        value = pbandk.testpb.BytesRules::notIn
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ip",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ip",
                        value = pbandk.testpb.BytesRules::ip
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv4",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv4",
                        value = pbandk.testpb.BytesRules::ipv4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv6",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv6",
                        value = pbandk.testpb.BytesRules::ipv6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "len",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "len",
                        value = pbandk.testpb.BytesRules::len
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.BytesRules",
                messageClass = pbandk.testpb.BytesRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableBytesRules : BytesRules, pbandk.MutableMessage {
    public override var const: pbandk.ByteArr?
    public override var len: Long?
    public override var minLen: Long?
    public override var maxLen: Long?
    public override var pattern: String?
    public override var prefix: pbandk.ByteArr?
    public override var suffix: pbandk.ByteArr?
    public override var contains: pbandk.ByteArr?
    public override var `in`: List<pbandk.ByteArr>
    public override var notIn: List<pbandk.ByteArr>
    public override var wellKnown: BytesRules.WellKnown<*>?

    public override var ip: Boolean?
    public override var ipv4: Boolean?
    public override var ipv6: Boolean?

    public fun toBytesRules(): BytesRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.BytesRules> {
        @Deprecated("Use bytesRules { } instead")
        public operator fun invoke(
            const: pbandk.ByteArr? = null,
            len: Long? = null,
            minLen: Long? = null,
            maxLen: Long? = null,
            pattern: String? = null,
            prefix: pbandk.ByteArr? = null,
            suffix: pbandk.ByteArr? = null,
            contains: pbandk.ByteArr? = null,
            `in`: List<pbandk.ByteArr> = emptyList(),
            notIn: List<pbandk.ByteArr> = emptyList(),
            wellKnown: pbandk.testpb.BytesRules.WellKnown<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableBytesRules = MutableBytesRules_Impl(
            const = const,
            len = len,
            minLen = minLen,
            maxLen = maxLen,
            pattern = pattern,
            prefix = prefix,
            suffix = suffix,
            contains = contains,
            `in` = `in`,
            notIn = notIn,
            wellKnown = wellKnown,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableBytesRules by lazy { MutableBytesRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.BytesRules = pbandk.testpb.BytesRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BytesRules> get() = pbandk.testpb.BytesRules.descriptor
    }
}

public sealed interface EnumRules : pbandk.Message {
    public val const: Int?
    public val definedOnly: Boolean?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.EnumRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules>

    public fun copy(
        const: Int? = this.const,
        definedOnly: Boolean? = this.definedOnly,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.EnumRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.EnumRules> {
        @Deprecated("Use enumRules { } instead")
        public operator fun invoke(
            const: Int? = null,
            definedOnly: Boolean? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.EnumRules = EnumRules_Impl(
            const = const,
            definedOnly = definedOnly,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.EnumRules by lazy { pbandk.testpb.EnumRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.EnumRules = pbandk.testpb.EnumRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.EnumRules, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.EnumRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "defined_only",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "definedOnly",
                        value = pbandk.testpb.EnumRules::definedOnly
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "in",
                        value = pbandk.testpb.EnumRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.EnumRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.EnumRules",
                messageClass = pbandk.testpb.EnumRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableEnumRules : EnumRules, pbandk.MutableMessage {
    public override var const: Int?
    public override var definedOnly: Boolean?
    public override var `in`: List<Int>
    public override var notIn: List<Int>

    public fun toEnumRules(): EnumRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.EnumRules> {
        @Deprecated("Use enumRules { } instead")
        public operator fun invoke(
            const: Int? = null,
            definedOnly: Boolean? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableEnumRules = MutableEnumRules_Impl(
            const = const,
            definedOnly = definedOnly,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableEnumRules by lazy { MutableEnumRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.EnumRules = pbandk.testpb.EnumRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules> get() = pbandk.testpb.EnumRules.descriptor
    }
}

public sealed interface MessageRules : pbandk.Message {
    public val skip: Boolean?
    public val required: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules>

    public fun copy(
        skip: Boolean? = this.skip,
        required: Boolean? = this.required,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageRules> {
        @Deprecated("Use messageRules { } instead")
        public operator fun invoke(
            skip: Boolean? = null,
            required: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MessageRules = MessageRules_Impl(
            skip = skip,
            required = required,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.MessageRules by lazy { pbandk.testpb.MessageRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageRules = pbandk.testpb.MessageRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageRules, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skip",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "skip",
                        value = pbandk.testpb.MessageRules::skip
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.MessageRules::required
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.MessageRules",
                messageClass = pbandk.testpb.MessageRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMessageRules : MessageRules, pbandk.MutableMessage {
    public override var skip: Boolean?
    public override var required: Boolean?

    public fun toMessageRules(): MessageRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageRules> {
        @Deprecated("Use messageRules { } instead")
        public operator fun invoke(
            skip: Boolean? = null,
            required: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableMessageRules = MutableMessageRules_Impl(
            skip = skip,
            required = required,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableMessageRules by lazy { MutableMessageRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MessageRules = pbandk.testpb.MessageRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules> get() = pbandk.testpb.MessageRules.descriptor
    }
}

public sealed interface RepeatedRules : pbandk.Message {
    public val minItems: Long?
    public val maxItems: Long?
    public val unique: Boolean?
    public val items: pbandk.testpb.FieldRules?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.RepeatedRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules>

    public fun copy(
        minItems: Long? = this.minItems,
        maxItems: Long? = this.maxItems,
        unique: Boolean? = this.unique,
        items: pbandk.testpb.FieldRules? = this.items,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.RepeatedRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.RepeatedRules> {
        @Deprecated("Use repeatedRules { } instead")
        public operator fun invoke(
            minItems: Long? = null,
            maxItems: Long? = null,
            unique: Boolean? = null,
            items: pbandk.testpb.FieldRules? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.RepeatedRules = RepeatedRules_Impl(
            minItems = minItems,
            maxItems = maxItems,
            unique = unique,
            items = items,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.RepeatedRules by lazy { pbandk.testpb.RepeatedRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.RepeatedRules = pbandk.testpb.RepeatedRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.RepeatedRules, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_items",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minItems",
                        value = pbandk.testpb.RepeatedRules::minItems
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_items",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxItems",
                        value = pbandk.testpb.RepeatedRules::maxItems
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unique",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "unique",
                        value = pbandk.testpb.RepeatedRules::unique
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "items",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
                        jsonName = "items",
                        value = pbandk.testpb.RepeatedRules::items
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.RepeatedRules",
                messageClass = pbandk.testpb.RepeatedRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableRepeatedRules : RepeatedRules, pbandk.MutableMessage {
    public override var minItems: Long?
    public override var maxItems: Long?
    public override var unique: Boolean?
    public override var items: pbandk.testpb.FieldRules?

    public fun toRepeatedRules(): RepeatedRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.RepeatedRules> {
        @Deprecated("Use repeatedRules { } instead")
        public operator fun invoke(
            minItems: Long? = null,
            maxItems: Long? = null,
            unique: Boolean? = null,
            items: pbandk.testpb.FieldRules? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableRepeatedRules = MutableRepeatedRules_Impl(
            minItems = minItems,
            maxItems = maxItems,
            unique = unique,
            items = items,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableRepeatedRules by lazy { MutableRepeatedRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.RepeatedRules = pbandk.testpb.RepeatedRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules> get() = pbandk.testpb.RepeatedRules.descriptor
    }
}

public sealed interface MapRules : pbandk.Message {
    public val minPairs: Long?
    public val maxPairs: Long?
    public val noSparse: Boolean?
    public val keys: pbandk.testpb.FieldRules?
    public val values: pbandk.testpb.FieldRules?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MapRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules>

    public fun copy(
        minPairs: Long? = this.minPairs,
        maxPairs: Long? = this.maxPairs,
        noSparse: Boolean? = this.noSparse,
        keys: pbandk.testpb.FieldRules? = this.keys,
        values: pbandk.testpb.FieldRules? = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MapRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.MapRules> {
        @Deprecated("Use mapRules { } instead")
        public operator fun invoke(
            minPairs: Long? = null,
            maxPairs: Long? = null,
            noSparse: Boolean? = null,
            keys: pbandk.testpb.FieldRules? = null,
            values: pbandk.testpb.FieldRules? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MapRules = MapRules_Impl(
            minPairs = minPairs,
            maxPairs = maxPairs,
            noSparse = noSparse,
            keys = keys,
            values = values,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.MapRules by lazy { pbandk.testpb.MapRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MapRules = pbandk.testpb.MapRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MapRules, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_pairs",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minPairs",
                        value = pbandk.testpb.MapRules::minPairs
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_pairs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxPairs",
                        value = pbandk.testpb.MapRules::maxPairs
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "no_sparse",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "noSparse",
                        value = pbandk.testpb.MapRules::noSparse
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "keys",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
                        jsonName = "keys",
                        value = pbandk.testpb.MapRules::keys
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "values",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
                        jsonName = "values",
                        value = pbandk.testpb.MapRules::values
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.MapRules",
                messageClass = pbandk.testpb.MapRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMapRules : MapRules, pbandk.MutableMessage {
    public override var minPairs: Long?
    public override var maxPairs: Long?
    public override var noSparse: Boolean?
    public override var keys: pbandk.testpb.FieldRules?
    public override var values: pbandk.testpb.FieldRules?

    public fun toMapRules(): MapRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.MapRules> {
        @Deprecated("Use mapRules { } instead")
        public operator fun invoke(
            minPairs: Long? = null,
            maxPairs: Long? = null,
            noSparse: Boolean? = null,
            keys: pbandk.testpb.FieldRules? = null,
            values: pbandk.testpb.FieldRules? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableMapRules = MutableMapRules_Impl(
            minPairs = minPairs,
            maxPairs = maxPairs,
            noSparse = noSparse,
            keys = keys,
            values = values,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableMapRules by lazy { MutableMapRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MapRules = pbandk.testpb.MapRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules> get() = pbandk.testpb.MapRules.descriptor
    }
}

public sealed interface AnyRules : pbandk.Message {
    public val required: Boolean?
    public val `in`: List<String>
    public val notIn: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.AnyRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules>

    public fun copy(
        required: Boolean? = this.required,
        `in`: List<String> = this.`in`,
        notIn: List<String> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.AnyRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.AnyRules> {
        @Deprecated("Use anyRules { } instead")
        public operator fun invoke(
            required: Boolean? = null,
            `in`: List<String> = emptyList(),
            notIn: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.AnyRules = AnyRules_Impl(
            required = required,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.AnyRules by lazy { pbandk.testpb.AnyRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.AnyRules = pbandk.testpb.AnyRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.AnyRules, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.AnyRules::required
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "in",
                        value = pbandk.testpb.AnyRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "notIn",
                        value = pbandk.testpb.AnyRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.AnyRules",
                messageClass = pbandk.testpb.AnyRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableAnyRules : AnyRules, pbandk.MutableMessage {
    public override var required: Boolean?
    public override var `in`: List<String>
    public override var notIn: List<String>

    public fun toAnyRules(): AnyRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.AnyRules> {
        @Deprecated("Use anyRules { } instead")
        public operator fun invoke(
            required: Boolean? = null,
            `in`: List<String> = emptyList(),
            notIn: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableAnyRules = MutableAnyRules_Impl(
            required = required,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableAnyRules by lazy { MutableAnyRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.AnyRules = pbandk.testpb.AnyRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules> get() = pbandk.testpb.AnyRules.descriptor
    }
}

public sealed interface DurationRules : pbandk.Message {
    public val required: Boolean?
    public val const: pbandk.wkt.Duration?
    public val lt: pbandk.wkt.Duration?
    public val lte: pbandk.wkt.Duration?
    public val gt: pbandk.wkt.Duration?
    public val gte: pbandk.wkt.Duration?
    public val `in`: List<pbandk.wkt.Duration>
    public val notIn: List<pbandk.wkt.Duration>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.DurationRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DurationRules>

    public fun copy(
        required: Boolean? = this.required,
        const: pbandk.wkt.Duration? = this.const,
        lt: pbandk.wkt.Duration? = this.lt,
        lte: pbandk.wkt.Duration? = this.lte,
        gt: pbandk.wkt.Duration? = this.gt,
        gte: pbandk.wkt.Duration? = this.gte,
        `in`: List<pbandk.wkt.Duration> = this.`in`,
        notIn: List<pbandk.wkt.Duration> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.DurationRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.DurationRules> {
        @Deprecated("Use durationRules { } instead")
        public operator fun invoke(
            required: Boolean? = null,
            const: pbandk.wkt.Duration? = null,
            lt: pbandk.wkt.Duration? = null,
            lte: pbandk.wkt.Duration? = null,
            gt: pbandk.wkt.Duration? = null,
            gte: pbandk.wkt.Duration? = null,
            `in`: List<pbandk.wkt.Duration> = emptyList(),
            notIn: List<pbandk.wkt.Duration> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.DurationRules = DurationRules_Impl(
            required = required,
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.DurationRules by lazy { pbandk.testpb.DurationRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.DurationRules = pbandk.testpb.DurationRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DurationRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.DurationRules, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.DurationRules::required
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "const",
                        value = pbandk.testpb.DurationRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "lt",
                        value = pbandk.testpb.DurationRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "lte",
                        value = pbandk.testpb.DurationRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "gt",
                        value = pbandk.testpb.DurationRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "gte",
                        value = pbandk.testpb.DurationRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "in",
                        value = pbandk.testpb.DurationRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "notIn",
                        value = pbandk.testpb.DurationRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.DurationRules",
                messageClass = pbandk.testpb.DurationRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableDurationRules : DurationRules, pbandk.MutableMessage {
    public override var required: Boolean?
    public override var const: pbandk.wkt.Duration?
    public override var lt: pbandk.wkt.Duration?
    public override var lte: pbandk.wkt.Duration?
    public override var gt: pbandk.wkt.Duration?
    public override var gte: pbandk.wkt.Duration?
    public override var `in`: List<pbandk.wkt.Duration>
    public override var notIn: List<pbandk.wkt.Duration>

    public fun toDurationRules(): DurationRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.DurationRules> {
        @Deprecated("Use durationRules { } instead")
        public operator fun invoke(
            required: Boolean? = null,
            const: pbandk.wkt.Duration? = null,
            lt: pbandk.wkt.Duration? = null,
            lte: pbandk.wkt.Duration? = null,
            gt: pbandk.wkt.Duration? = null,
            gte: pbandk.wkt.Duration? = null,
            `in`: List<pbandk.wkt.Duration> = emptyList(),
            notIn: List<pbandk.wkt.Duration> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableDurationRules = MutableDurationRules_Impl(
            required = required,
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableDurationRules by lazy { MutableDurationRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.DurationRules = pbandk.testpb.DurationRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DurationRules> get() = pbandk.testpb.DurationRules.descriptor
    }
}

public sealed interface TimestampRules : pbandk.Message {
    public val required: Boolean?
    public val const: pbandk.wkt.Timestamp?
    public val lt: pbandk.wkt.Timestamp?
    public val lte: pbandk.wkt.Timestamp?
    public val gt: pbandk.wkt.Timestamp?
    public val gte: pbandk.wkt.Timestamp?
    public val ltNow: Boolean?
    public val gtNow: Boolean?
    public val within: pbandk.wkt.Duration?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.TimestampRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TimestampRules>

    public fun copy(
        required: Boolean? = this.required,
        const: pbandk.wkt.Timestamp? = this.const,
        lt: pbandk.wkt.Timestamp? = this.lt,
        lte: pbandk.wkt.Timestamp? = this.lte,
        gt: pbandk.wkt.Timestamp? = this.gt,
        gte: pbandk.wkt.Timestamp? = this.gte,
        ltNow: Boolean? = this.ltNow,
        gtNow: Boolean? = this.gtNow,
        within: pbandk.wkt.Duration? = this.within,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.TimestampRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.TimestampRules> {
        @Deprecated("Use timestampRules { } instead")
        public operator fun invoke(
            required: Boolean? = null,
            const: pbandk.wkt.Timestamp? = null,
            lt: pbandk.wkt.Timestamp? = null,
            lte: pbandk.wkt.Timestamp? = null,
            gt: pbandk.wkt.Timestamp? = null,
            gte: pbandk.wkt.Timestamp? = null,
            ltNow: Boolean? = null,
            gtNow: Boolean? = null,
            within: pbandk.wkt.Duration? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.TimestampRules = TimestampRules_Impl(
            required = required,
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            ltNow = ltNow,
            gtNow = gtNow,
            within = within,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.TimestampRules by lazy { pbandk.testpb.TimestampRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.TimestampRules = pbandk.testpb.TimestampRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TimestampRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, *>>(9)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.TimestampRules::required
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "const",
                        value = pbandk.testpb.TimestampRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "lt",
                        value = pbandk.testpb.TimestampRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "lte",
                        value = pbandk.testpb.TimestampRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "gt",
                        value = pbandk.testpb.TimestampRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "gte",
                        value = pbandk.testpb.TimestampRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt_now",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ltNow",
                        value = pbandk.testpb.TimestampRules::ltNow
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt_now",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "gtNow",
                        value = pbandk.testpb.TimestampRules::gtNow
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "within",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "within",
                        value = pbandk.testpb.TimestampRules::within
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.TimestampRules",
                messageClass = pbandk.testpb.TimestampRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableTimestampRules : TimestampRules, pbandk.MutableMessage {
    public override var required: Boolean?
    public override var const: pbandk.wkt.Timestamp?
    public override var lt: pbandk.wkt.Timestamp?
    public override var lte: pbandk.wkt.Timestamp?
    public override var gt: pbandk.wkt.Timestamp?
    public override var gte: pbandk.wkt.Timestamp?
    public override var ltNow: Boolean?
    public override var gtNow: Boolean?
    public override var within: pbandk.wkt.Duration?

    public fun toTimestampRules(): TimestampRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.TimestampRules> {
        @Deprecated("Use timestampRules { } instead")
        public operator fun invoke(
            required: Boolean? = null,
            const: pbandk.wkt.Timestamp? = null,
            lt: pbandk.wkt.Timestamp? = null,
            lte: pbandk.wkt.Timestamp? = null,
            gt: pbandk.wkt.Timestamp? = null,
            gte: pbandk.wkt.Timestamp? = null,
            ltNow: Boolean? = null,
            gtNow: Boolean? = null,
            within: pbandk.wkt.Duration? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableTimestampRules = MutableTimestampRules_Impl(
            required = required,
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            ltNow = ltNow,
            gtNow = gtNow,
            within = within,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableTimestampRules by lazy { MutableTimestampRules() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.TimestampRules = pbandk.testpb.TimestampRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TimestampRules> get() = pbandk.testpb.TimestampRules.descriptor
    }
}

val pbandk.wkt.MessageOptions.disabled: Boolean? 
    get() = getExtension(pbandk.testpb.disabled)

@pbandk.Export
val disabled = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.MessageOptions.Companion::descriptor,
    name = "disabled",
    number = 1071,
    type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
    jsonName = "disabled",
    value = pbandk.wkt.MessageOptions::disabled
)

val pbandk.wkt.OneofOptions.required: Boolean? 
    get() = getExtension(pbandk.testpb.required)

@pbandk.Export
val required = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.OneofOptions.Companion::descriptor,
    name = "required",
    number = 1071,
    type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
    jsonName = "required",
    value = pbandk.wkt.OneofOptions::required
)

val pbandk.wkt.FieldOptions.rules: pbandk.testpb.FieldRules? 
    get() = getExtension(pbandk.testpb.rules)

@pbandk.Export
val rules = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.FieldOptions.Companion::descriptor,
    name = "rules",
    number = 1071,
    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
    jsonName = "rules",
    value = pbandk.wkt.FieldOptions::rules
)

public fun fieldRules(builderAction: MutableFieldRules.() -> Unit): FieldRules {
    @Suppress("DEPRECATION") val builder = MutableFieldRules()
    builder.builderAction()
    return builder.toFieldRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldRules")
public fun FieldRules?.orDefault(): pbandk.testpb.FieldRules = this ?: FieldRules.defaultInstance

private class FieldRules_Impl(
    override val message: pbandk.testpb.MessageRules?,
    override val type: pbandk.testpb.FieldRules.Type<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FieldRules, pbandk.GeneratedMessage<FieldRules>() {
    override val descriptor get() = FieldRules.descriptor

    override val float: pbandk.testpb.FloatRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Float_)?.value
    override val double: pbandk.testpb.DoubleRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Double_)?.value
    override val int32: pbandk.testpb.Int32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Int32)?.value
    override val int64: pbandk.testpb.Int64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Int64)?.value
    override val uint32: pbandk.testpb.UInt32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Uint32)?.value
    override val uint64: pbandk.testpb.UInt64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Uint64)?.value
    override val sint32: pbandk.testpb.SInt32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sint32)?.value
    override val sint64: pbandk.testpb.SInt64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sint64)?.value
    override val fixed32: pbandk.testpb.Fixed32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Fixed32)?.value
    override val fixed64: pbandk.testpb.Fixed64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Fixed64)?.value
    override val sfixed32: pbandk.testpb.SFixed32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sfixed32)?.value
    override val sfixed64: pbandk.testpb.SFixed64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sfixed64)?.value
    override val bool: pbandk.testpb.BoolRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Bool)?.value
    override val string: pbandk.testpb.StringRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.String_)?.value
    override val bytes: pbandk.testpb.BytesRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Bytes)?.value
    override val enum: pbandk.testpb.EnumRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Enum)?.value
    override val repeated: pbandk.testpb.RepeatedRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Repeated)?.value
    override val map: pbandk.testpb.MapRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Map_)?.value
    override val any: pbandk.testpb.AnyRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Any)?.value
    override val duration: pbandk.testpb.DurationRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Duration)?.value
    override val timestamp: pbandk.testpb.TimestampRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Timestamp)?.value

    override fun copy(
        message: pbandk.testpb.MessageRules?,
        type: pbandk.testpb.FieldRules.Type<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FieldRules_Impl(
        message = message,
        type = type,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FieldRules)?.let {
        it.copy(
            message = message?.plus(other.message) ?: other.message,
            type = when {
                type is FieldRules.Type.Float_ && other.type is FieldRules.Type.Float_ ->
                    FieldRules.Type.Float_((type as FieldRules.Type.Float_).value + (other.type as FieldRules.Type.Float_).value)
                type is FieldRules.Type.Double_ && other.type is FieldRules.Type.Double_ ->
                    FieldRules.Type.Double_((type as FieldRules.Type.Double_).value + (other.type as FieldRules.Type.Double_).value)
                type is FieldRules.Type.Int32 && other.type is FieldRules.Type.Int32 ->
                    FieldRules.Type.Int32((type as FieldRules.Type.Int32).value + (other.type as FieldRules.Type.Int32).value)
                type is FieldRules.Type.Int64 && other.type is FieldRules.Type.Int64 ->
                    FieldRules.Type.Int64((type as FieldRules.Type.Int64).value + (other.type as FieldRules.Type.Int64).value)
                type is FieldRules.Type.Uint32 && other.type is FieldRules.Type.Uint32 ->
                    FieldRules.Type.Uint32((type as FieldRules.Type.Uint32).value + (other.type as FieldRules.Type.Uint32).value)
                type is FieldRules.Type.Uint64 && other.type is FieldRules.Type.Uint64 ->
                    FieldRules.Type.Uint64((type as FieldRules.Type.Uint64).value + (other.type as FieldRules.Type.Uint64).value)
                type is FieldRules.Type.Sint32 && other.type is FieldRules.Type.Sint32 ->
                    FieldRules.Type.Sint32((type as FieldRules.Type.Sint32).value + (other.type as FieldRules.Type.Sint32).value)
                type is FieldRules.Type.Sint64 && other.type is FieldRules.Type.Sint64 ->
                    FieldRules.Type.Sint64((type as FieldRules.Type.Sint64).value + (other.type as FieldRules.Type.Sint64).value)
                type is FieldRules.Type.Fixed32 && other.type is FieldRules.Type.Fixed32 ->
                    FieldRules.Type.Fixed32((type as FieldRules.Type.Fixed32).value + (other.type as FieldRules.Type.Fixed32).value)
                type is FieldRules.Type.Fixed64 && other.type is FieldRules.Type.Fixed64 ->
                    FieldRules.Type.Fixed64((type as FieldRules.Type.Fixed64).value + (other.type as FieldRules.Type.Fixed64).value)
                type is FieldRules.Type.Sfixed32 && other.type is FieldRules.Type.Sfixed32 ->
                    FieldRules.Type.Sfixed32((type as FieldRules.Type.Sfixed32).value + (other.type as FieldRules.Type.Sfixed32).value)
                type is FieldRules.Type.Sfixed64 && other.type is FieldRules.Type.Sfixed64 ->
                    FieldRules.Type.Sfixed64((type as FieldRules.Type.Sfixed64).value + (other.type as FieldRules.Type.Sfixed64).value)
                type is FieldRules.Type.Bool && other.type is FieldRules.Type.Bool ->
                    FieldRules.Type.Bool((type as FieldRules.Type.Bool).value + (other.type as FieldRules.Type.Bool).value)
                type is FieldRules.Type.String_ && other.type is FieldRules.Type.String_ ->
                    FieldRules.Type.String_((type as FieldRules.Type.String_).value + (other.type as FieldRules.Type.String_).value)
                type is FieldRules.Type.Bytes && other.type is FieldRules.Type.Bytes ->
                    FieldRules.Type.Bytes((type as FieldRules.Type.Bytes).value + (other.type as FieldRules.Type.Bytes).value)
                type is FieldRules.Type.Enum && other.type is FieldRules.Type.Enum ->
                    FieldRules.Type.Enum((type as FieldRules.Type.Enum).value + (other.type as FieldRules.Type.Enum).value)
                type is FieldRules.Type.Repeated && other.type is FieldRules.Type.Repeated ->
                    FieldRules.Type.Repeated((type as FieldRules.Type.Repeated).value + (other.type as FieldRules.Type.Repeated).value)
                type is FieldRules.Type.Map_ && other.type is FieldRules.Type.Map_ ->
                    FieldRules.Type.Map_((type as FieldRules.Type.Map_).value + (other.type as FieldRules.Type.Map_).value)
                type is FieldRules.Type.Any && other.type is FieldRules.Type.Any ->
                    FieldRules.Type.Any((type as FieldRules.Type.Any).value + (other.type as FieldRules.Type.Any).value)
                type is FieldRules.Type.Duration && other.type is FieldRules.Type.Duration ->
                    FieldRules.Type.Duration((type as FieldRules.Type.Duration).value + (other.type as FieldRules.Type.Duration).value)
                type is FieldRules.Type.Timestamp && other.type is FieldRules.Type.Timestamp ->
                    FieldRules.Type.Timestamp((type as FieldRules.Type.Timestamp).value + (other.type as FieldRules.Type.Timestamp).value)
                else ->
                    other.type ?: type
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFieldRules_Impl(
    override var message: pbandk.testpb.MessageRules?,
    override var type: pbandk.testpb.FieldRules.Type<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFieldRules, pbandk.MutableGeneratedMessage<MutableFieldRules>() {
    override val descriptor get() = FieldRules.descriptor

    override var float: pbandk.testpb.FloatRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Float_)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Float_(it) } }
    override var double: pbandk.testpb.DoubleRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Double_)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Double_(it) } }
    override var int32: pbandk.testpb.Int32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Int32)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Int32(it) } }
    override var int64: pbandk.testpb.Int64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Int64)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Int64(it) } }
    override var uint32: pbandk.testpb.UInt32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Uint32)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Uint32(it) } }
    override var uint64: pbandk.testpb.UInt64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Uint64)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Uint64(it) } }
    override var sint32: pbandk.testpb.SInt32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sint32)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Sint32(it) } }
    override var sint64: pbandk.testpb.SInt64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sint64)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Sint64(it) } }
    override var fixed32: pbandk.testpb.Fixed32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Fixed32)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Fixed32(it) } }
    override var fixed64: pbandk.testpb.Fixed64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Fixed64)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Fixed64(it) } }
    override var sfixed32: pbandk.testpb.SFixed32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sfixed32)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Sfixed32(it) } }
    override var sfixed64: pbandk.testpb.SFixed64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sfixed64)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Sfixed64(it) } }
    override var bool: pbandk.testpb.BoolRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Bool)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Bool(it) } }
    override var string: pbandk.testpb.StringRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.String_)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.String_(it) } }
    override var bytes: pbandk.testpb.BytesRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Bytes)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Bytes(it) } }
    override var enum: pbandk.testpb.EnumRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Enum)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Enum(it) } }
    override var repeated: pbandk.testpb.RepeatedRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Repeated)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Repeated(it) } }
    override var map: pbandk.testpb.MapRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Map_)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Map_(it) } }
    override var any: pbandk.testpb.AnyRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Any)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Any(it) } }
    override var duration: pbandk.testpb.DurationRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Duration)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Duration(it) } }
    override var timestamp: pbandk.testpb.TimestampRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Timestamp)?.value
        set(value) { type = value?.let { pbandk.testpb.FieldRules.Type.Timestamp(it) } }

    override fun copy(
        message: pbandk.testpb.MessageRules?,
        type: pbandk.testpb.FieldRules.Type<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FieldRules_Impl(
        message = message,
        type = type,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FieldRules)?.let {
        it.copy(
            message = message?.plus(other.message) ?: other.message,
            type = when {
                type is FieldRules.Type.Float_ && other.type is FieldRules.Type.Float_ ->
                    FieldRules.Type.Float_((type as FieldRules.Type.Float_).value + (other.type as FieldRules.Type.Float_).value)
                type is FieldRules.Type.Double_ && other.type is FieldRules.Type.Double_ ->
                    FieldRules.Type.Double_((type as FieldRules.Type.Double_).value + (other.type as FieldRules.Type.Double_).value)
                type is FieldRules.Type.Int32 && other.type is FieldRules.Type.Int32 ->
                    FieldRules.Type.Int32((type as FieldRules.Type.Int32).value + (other.type as FieldRules.Type.Int32).value)
                type is FieldRules.Type.Int64 && other.type is FieldRules.Type.Int64 ->
                    FieldRules.Type.Int64((type as FieldRules.Type.Int64).value + (other.type as FieldRules.Type.Int64).value)
                type is FieldRules.Type.Uint32 && other.type is FieldRules.Type.Uint32 ->
                    FieldRules.Type.Uint32((type as FieldRules.Type.Uint32).value + (other.type as FieldRules.Type.Uint32).value)
                type is FieldRules.Type.Uint64 && other.type is FieldRules.Type.Uint64 ->
                    FieldRules.Type.Uint64((type as FieldRules.Type.Uint64).value + (other.type as FieldRules.Type.Uint64).value)
                type is FieldRules.Type.Sint32 && other.type is FieldRules.Type.Sint32 ->
                    FieldRules.Type.Sint32((type as FieldRules.Type.Sint32).value + (other.type as FieldRules.Type.Sint32).value)
                type is FieldRules.Type.Sint64 && other.type is FieldRules.Type.Sint64 ->
                    FieldRules.Type.Sint64((type as FieldRules.Type.Sint64).value + (other.type as FieldRules.Type.Sint64).value)
                type is FieldRules.Type.Fixed32 && other.type is FieldRules.Type.Fixed32 ->
                    FieldRules.Type.Fixed32((type as FieldRules.Type.Fixed32).value + (other.type as FieldRules.Type.Fixed32).value)
                type is FieldRules.Type.Fixed64 && other.type is FieldRules.Type.Fixed64 ->
                    FieldRules.Type.Fixed64((type as FieldRules.Type.Fixed64).value + (other.type as FieldRules.Type.Fixed64).value)
                type is FieldRules.Type.Sfixed32 && other.type is FieldRules.Type.Sfixed32 ->
                    FieldRules.Type.Sfixed32((type as FieldRules.Type.Sfixed32).value + (other.type as FieldRules.Type.Sfixed32).value)
                type is FieldRules.Type.Sfixed64 && other.type is FieldRules.Type.Sfixed64 ->
                    FieldRules.Type.Sfixed64((type as FieldRules.Type.Sfixed64).value + (other.type as FieldRules.Type.Sfixed64).value)
                type is FieldRules.Type.Bool && other.type is FieldRules.Type.Bool ->
                    FieldRules.Type.Bool((type as FieldRules.Type.Bool).value + (other.type as FieldRules.Type.Bool).value)
                type is FieldRules.Type.String_ && other.type is FieldRules.Type.String_ ->
                    FieldRules.Type.String_((type as FieldRules.Type.String_).value + (other.type as FieldRules.Type.String_).value)
                type is FieldRules.Type.Bytes && other.type is FieldRules.Type.Bytes ->
                    FieldRules.Type.Bytes((type as FieldRules.Type.Bytes).value + (other.type as FieldRules.Type.Bytes).value)
                type is FieldRules.Type.Enum && other.type is FieldRules.Type.Enum ->
                    FieldRules.Type.Enum((type as FieldRules.Type.Enum).value + (other.type as FieldRules.Type.Enum).value)
                type is FieldRules.Type.Repeated && other.type is FieldRules.Type.Repeated ->
                    FieldRules.Type.Repeated((type as FieldRules.Type.Repeated).value + (other.type as FieldRules.Type.Repeated).value)
                type is FieldRules.Type.Map_ && other.type is FieldRules.Type.Map_ ->
                    FieldRules.Type.Map_((type as FieldRules.Type.Map_).value + (other.type as FieldRules.Type.Map_).value)
                type is FieldRules.Type.Any && other.type is FieldRules.Type.Any ->
                    FieldRules.Type.Any((type as FieldRules.Type.Any).value + (other.type as FieldRules.Type.Any).value)
                type is FieldRules.Type.Duration && other.type is FieldRules.Type.Duration ->
                    FieldRules.Type.Duration((type as FieldRules.Type.Duration).value + (other.type as FieldRules.Type.Duration).value)
                type is FieldRules.Type.Timestamp && other.type is FieldRules.Type.Timestamp ->
                    FieldRules.Type.Timestamp((type as FieldRules.Type.Timestamp).value + (other.type as FieldRules.Type.Timestamp).value)
                else ->
                    other.type ?: type
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFieldRules() = FieldRules_Impl(
        message = message,
        type = type,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun FieldRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldRules {
    var message: pbandk.testpb.MessageRules? = null
    var type: FieldRules.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = FieldRules.Type.Float_(_fieldValue as pbandk.testpb.FloatRules)
            2 -> type = FieldRules.Type.Double_(_fieldValue as pbandk.testpb.DoubleRules)
            3 -> type = FieldRules.Type.Int32(_fieldValue as pbandk.testpb.Int32Rules)
            4 -> type = FieldRules.Type.Int64(_fieldValue as pbandk.testpb.Int64Rules)
            5 -> type = FieldRules.Type.Uint32(_fieldValue as pbandk.testpb.UInt32Rules)
            6 -> type = FieldRules.Type.Uint64(_fieldValue as pbandk.testpb.UInt64Rules)
            7 -> type = FieldRules.Type.Sint32(_fieldValue as pbandk.testpb.SInt32Rules)
            8 -> type = FieldRules.Type.Sint64(_fieldValue as pbandk.testpb.SInt64Rules)
            9 -> type = FieldRules.Type.Fixed32(_fieldValue as pbandk.testpb.Fixed32Rules)
            10 -> type = FieldRules.Type.Fixed64(_fieldValue as pbandk.testpb.Fixed64Rules)
            11 -> type = FieldRules.Type.Sfixed32(_fieldValue as pbandk.testpb.SFixed32Rules)
            12 -> type = FieldRules.Type.Sfixed64(_fieldValue as pbandk.testpb.SFixed64Rules)
            13 -> type = FieldRules.Type.Bool(_fieldValue as pbandk.testpb.BoolRules)
            14 -> type = FieldRules.Type.String_(_fieldValue as pbandk.testpb.StringRules)
            15 -> type = FieldRules.Type.Bytes(_fieldValue as pbandk.testpb.BytesRules)
            16 -> type = FieldRules.Type.Enum(_fieldValue as pbandk.testpb.EnumRules)
            17 -> message = _fieldValue as pbandk.testpb.MessageRules
            18 -> type = FieldRules.Type.Repeated(_fieldValue as pbandk.testpb.RepeatedRules)
            19 -> type = FieldRules.Type.Map_(_fieldValue as pbandk.testpb.MapRules)
            20 -> type = FieldRules.Type.Any(_fieldValue as pbandk.testpb.AnyRules)
            21 -> type = FieldRules.Type.Duration(_fieldValue as pbandk.testpb.DurationRules)
            22 -> type = FieldRules.Type.Timestamp(_fieldValue as pbandk.testpb.TimestampRules)
        }
    }
    @Suppress("DEPRECATION")
    return FieldRules(message, type, unknownFields)
}

public fun floatRules(builderAction: MutableFloatRules.() -> Unit): FloatRules {
    @Suppress("DEPRECATION") val builder = MutableFloatRules()
    builder.builderAction()
    return builder.toFloatRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFloatRules")
public fun FloatRules?.orDefault(): pbandk.testpb.FloatRules = this ?: FloatRules.defaultInstance

private class FloatRules_Impl(
    override val const: Float?,
    override val lt: Float?,
    override val lte: Float?,
    override val gt: Float?,
    override val gte: Float?,
    override val `in`: List<Float>,
    override val notIn: List<Float>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FloatRules, pbandk.GeneratedMessage<FloatRules>() {
    override val descriptor get() = FloatRules.descriptor

    override fun copy(
        const: Float?,
        lt: Float?,
        lte: Float?,
        gt: Float?,
        gte: Float?,
        `in`: List<Float>,
        notIn: List<Float>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FloatRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FloatRules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFloatRules_Impl(
    override var const: Float?,
    override var lt: Float?,
    override var lte: Float?,
    override var gt: Float?,
    override var gte: Float?,
    override var `in`: List<Float>,
    override var notIn: List<Float>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFloatRules, pbandk.MutableGeneratedMessage<MutableFloatRules>() {
    override val descriptor get() = FloatRules.descriptor

    override fun copy(
        const: Float?,
        lt: Float?,
        lte: Float?,
        gt: Float?,
        gte: Float?,
        `in`: List<Float>,
        notIn: List<Float>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FloatRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FloatRules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFloatRules() = FloatRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun FloatRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FloatRules {
    var const: Float? = null
    var lt: Float? = null
    var lte: Float? = null
    var gt: Float? = null
    var gte: Float? = null
    var `in`: pbandk.ListWithSize.Builder<Float>? = null
    var notIn: pbandk.ListWithSize.Builder<Float>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Float
            2 -> lt = _fieldValue as Float
            3 -> lte = _fieldValue as Float
            4 -> gt = _fieldValue as Float
            5 -> gte = _fieldValue as Float
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
        }
    }
    @Suppress("DEPRECATION")
    return FloatRules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun doubleRules(builderAction: MutableDoubleRules.() -> Unit): DoubleRules {
    @Suppress("DEPRECATION") val builder = MutableDoubleRules()
    builder.builderAction()
    return builder.toDoubleRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleRules")
public fun DoubleRules?.orDefault(): pbandk.testpb.DoubleRules = this ?: DoubleRules.defaultInstance

private class DoubleRules_Impl(
    override val const: Double?,
    override val lt: Double?,
    override val lte: Double?,
    override val gt: Double?,
    override val gte: Double?,
    override val `in`: List<Double>,
    override val notIn: List<Double>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : DoubleRules, pbandk.GeneratedMessage<DoubleRules>() {
    override val descriptor get() = DoubleRules.descriptor

    override fun copy(
        const: Double?,
        lt: Double?,
        lte: Double?,
        gt: Double?,
        gte: Double?,
        `in`: List<Double>,
        notIn: List<Double>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = DoubleRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? DoubleRules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableDoubleRules_Impl(
    override var const: Double?,
    override var lt: Double?,
    override var lte: Double?,
    override var gt: Double?,
    override var gte: Double?,
    override var `in`: List<Double>,
    override var notIn: List<Double>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableDoubleRules, pbandk.MutableGeneratedMessage<MutableDoubleRules>() {
    override val descriptor get() = DoubleRules.descriptor

    override fun copy(
        const: Double?,
        lt: Double?,
        lte: Double?,
        gt: Double?,
        gte: Double?,
        `in`: List<Double>,
        notIn: List<Double>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = DoubleRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? DoubleRules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toDoubleRules() = DoubleRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun DoubleRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DoubleRules {
    var const: Double? = null
    var lt: Double? = null
    var lte: Double? = null
    var gt: Double? = null
    var gte: Double? = null
    var `in`: pbandk.ListWithSize.Builder<Double>? = null
    var notIn: pbandk.ListWithSize.Builder<Double>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Double
            2 -> lt = _fieldValue as Double
            3 -> lte = _fieldValue as Double
            4 -> gt = _fieldValue as Double
            5 -> gte = _fieldValue as Double
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
        }
    }
    @Suppress("DEPRECATION")
    return DoubleRules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun int32Rules(builderAction: MutableInt32Rules.() -> Unit): Int32Rules {
    @Suppress("DEPRECATION") val builder = MutableInt32Rules()
    builder.builderAction()
    return builder.toInt32Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForInt32Rules")
public fun Int32Rules?.orDefault(): pbandk.testpb.Int32Rules = this ?: Int32Rules.defaultInstance

private class Int32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int32Rules, pbandk.GeneratedMessage<Int32Rules>() {
    override val descriptor get() = Int32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override var `in`: List<Int>,
    override var notIn: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableInt32Rules, pbandk.MutableGeneratedMessage<MutableInt32Rules>() {
    override val descriptor get() = Int32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toInt32Rules() = Int32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Int32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return Int32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun int64Rules(builderAction: MutableInt64Rules.() -> Unit): Int64Rules {
    @Suppress("DEPRECATION") val builder = MutableInt64Rules()
    builder.builderAction()
    return builder.toInt64Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForInt64Rules")
public fun Int64Rules?.orDefault(): pbandk.testpb.Int64Rules = this ?: Int64Rules.defaultInstance

private class Int64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int64Rules, pbandk.GeneratedMessage<Int64Rules>() {
    override val descriptor get() = Int64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override var `in`: List<Long>,
    override var notIn: List<Long>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableInt64Rules, pbandk.MutableGeneratedMessage<MutableInt64Rules>() {
    override val descriptor get() = Int64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toInt64Rules() = Int64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Int64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    @Suppress("DEPRECATION")
    return Int64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun uInt32Rules(builderAction: MutableUInt32Rules.() -> Unit): UInt32Rules {
    @Suppress("DEPRECATION") val builder = MutableUInt32Rules()
    builder.builderAction()
    return builder.toUInt32Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForUInt32Rules")
public fun UInt32Rules?.orDefault(): pbandk.testpb.UInt32Rules = this ?: UInt32Rules.defaultInstance

private class UInt32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt32Rules, pbandk.GeneratedMessage<UInt32Rules>() {
    override val descriptor get() = UInt32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableUInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override var `in`: List<Int>,
    override var notIn: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableUInt32Rules, pbandk.MutableGeneratedMessage<MutableUInt32Rules>() {
    override val descriptor get() = UInt32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toUInt32Rules() = UInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun UInt32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return UInt32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun uInt64Rules(builderAction: MutableUInt64Rules.() -> Unit): UInt64Rules {
    @Suppress("DEPRECATION") val builder = MutableUInt64Rules()
    builder.builderAction()
    return builder.toUInt64Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForUInt64Rules")
public fun UInt64Rules?.orDefault(): pbandk.testpb.UInt64Rules = this ?: UInt64Rules.defaultInstance

private class UInt64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt64Rules, pbandk.GeneratedMessage<UInt64Rules>() {
    override val descriptor get() = UInt64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableUInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override var `in`: List<Long>,
    override var notIn: List<Long>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableUInt64Rules, pbandk.MutableGeneratedMessage<MutableUInt64Rules>() {
    override val descriptor get() = UInt64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toUInt64Rules() = UInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun UInt64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    @Suppress("DEPRECATION")
    return UInt64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun sInt32Rules(builderAction: MutableSInt32Rules.() -> Unit): SInt32Rules {
    @Suppress("DEPRECATION") val builder = MutableSInt32Rules()
    builder.builderAction()
    return builder.toSInt32Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForSInt32Rules")
public fun SInt32Rules?.orDefault(): pbandk.testpb.SInt32Rules = this ?: SInt32Rules.defaultInstance

private class SInt32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SInt32Rules, pbandk.GeneratedMessage<SInt32Rules>() {
    override val descriptor get() = SInt32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SInt32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableSInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override var `in`: List<Int>,
    override var notIn: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSInt32Rules, pbandk.MutableGeneratedMessage<MutableSInt32Rules>() {
    override val descriptor get() = SInt32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SInt32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSInt32Rules() = SInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun SInt32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SInt32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return SInt32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun sInt64Rules(builderAction: MutableSInt64Rules.() -> Unit): SInt64Rules {
    @Suppress("DEPRECATION") val builder = MutableSInt64Rules()
    builder.builderAction()
    return builder.toSInt64Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForSInt64Rules")
public fun SInt64Rules?.orDefault(): pbandk.testpb.SInt64Rules = this ?: SInt64Rules.defaultInstance

private class SInt64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SInt64Rules, pbandk.GeneratedMessage<SInt64Rules>() {
    override val descriptor get() = SInt64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SInt64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableSInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override var `in`: List<Long>,
    override var notIn: List<Long>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSInt64Rules, pbandk.MutableGeneratedMessage<MutableSInt64Rules>() {
    override val descriptor get() = SInt64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SInt64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSInt64Rules() = SInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun SInt64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SInt64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    @Suppress("DEPRECATION")
    return SInt64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun fixed32Rules(builderAction: MutableFixed32Rules.() -> Unit): Fixed32Rules {
    @Suppress("DEPRECATION") val builder = MutableFixed32Rules()
    builder.builderAction()
    return builder.toFixed32Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFixed32Rules")
public fun Fixed32Rules?.orDefault(): pbandk.testpb.Fixed32Rules = this ?: Fixed32Rules.defaultInstance

private class Fixed32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Fixed32Rules, pbandk.GeneratedMessage<Fixed32Rules>() {
    override val descriptor get() = Fixed32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Fixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Fixed32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFixed32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override var `in`: List<Int>,
    override var notIn: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFixed32Rules, pbandk.MutableGeneratedMessage<MutableFixed32Rules>() {
    override val descriptor get() = Fixed32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Fixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Fixed32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFixed32Rules() = Fixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Fixed32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Fixed32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return Fixed32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun fixed64Rules(builderAction: MutableFixed64Rules.() -> Unit): Fixed64Rules {
    @Suppress("DEPRECATION") val builder = MutableFixed64Rules()
    builder.builderAction()
    return builder.toFixed64Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFixed64Rules")
public fun Fixed64Rules?.orDefault(): pbandk.testpb.Fixed64Rules = this ?: Fixed64Rules.defaultInstance

private class Fixed64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Fixed64Rules, pbandk.GeneratedMessage<Fixed64Rules>() {
    override val descriptor get() = Fixed64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Fixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Fixed64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFixed64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override var `in`: List<Long>,
    override var notIn: List<Long>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFixed64Rules, pbandk.MutableGeneratedMessage<MutableFixed64Rules>() {
    override val descriptor get() = Fixed64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Fixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Fixed64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFixed64Rules() = Fixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Fixed64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Fixed64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    @Suppress("DEPRECATION")
    return Fixed64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun sFixed32Rules(builderAction: MutableSFixed32Rules.() -> Unit): SFixed32Rules {
    @Suppress("DEPRECATION") val builder = MutableSFixed32Rules()
    builder.builderAction()
    return builder.toSFixed32Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForSFixed32Rules")
public fun SFixed32Rules?.orDefault(): pbandk.testpb.SFixed32Rules = this ?: SFixed32Rules.defaultInstance

private class SFixed32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SFixed32Rules, pbandk.GeneratedMessage<SFixed32Rules>() {
    override val descriptor get() = SFixed32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SFixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SFixed32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableSFixed32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override var `in`: List<Int>,
    override var notIn: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSFixed32Rules, pbandk.MutableGeneratedMessage<MutableSFixed32Rules>() {
    override val descriptor get() = SFixed32Rules.descriptor

    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SFixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SFixed32Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSFixed32Rules() = SFixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun SFixed32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SFixed32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return SFixed32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun sFixed64Rules(builderAction: MutableSFixed64Rules.() -> Unit): SFixed64Rules {
    @Suppress("DEPRECATION") val builder = MutableSFixed64Rules()
    builder.builderAction()
    return builder.toSFixed64Rules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForSFixed64Rules")
public fun SFixed64Rules?.orDefault(): pbandk.testpb.SFixed64Rules = this ?: SFixed64Rules.defaultInstance

private class SFixed64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SFixed64Rules, pbandk.GeneratedMessage<SFixed64Rules>() {
    override val descriptor get() = SFixed64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SFixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SFixed64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableSFixed64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override var `in`: List<Long>,
    override var notIn: List<Long>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSFixed64Rules, pbandk.MutableGeneratedMessage<MutableSFixed64Rules>() {
    override val descriptor get() = SFixed64Rules.descriptor

    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SFixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SFixed64Rules)?.let {
        it.copy(
            const = other.const ?: const,
            lt = other.lt ?: lt,
            lte = other.lte ?: lte,
            gt = other.gt ?: gt,
            gte = other.gte ?: gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSFixed64Rules() = SFixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun SFixed64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SFixed64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    @Suppress("DEPRECATION")
    return SFixed64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun boolRules(builderAction: MutableBoolRules.() -> Unit): BoolRules {
    @Suppress("DEPRECATION") val builder = MutableBoolRules()
    builder.builderAction()
    return builder.toBoolRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForBoolRules")
public fun BoolRules?.orDefault(): pbandk.testpb.BoolRules = this ?: BoolRules.defaultInstance

private class BoolRules_Impl(
    override val const: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BoolRules, pbandk.GeneratedMessage<BoolRules>() {
    override val descriptor get() = BoolRules.descriptor

    override fun copy(
        const: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BoolRules_Impl(
        const = const,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BoolRules)?.let {
        it.copy(
            const = other.const ?: const,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableBoolRules_Impl(
    override var const: Boolean?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableBoolRules, pbandk.MutableGeneratedMessage<MutableBoolRules>() {
    override val descriptor get() = BoolRules.descriptor

    override fun copy(
        const: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BoolRules_Impl(
        const = const,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BoolRules)?.let {
        it.copy(
            const = other.const ?: const,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toBoolRules() = BoolRules_Impl(
        const = const,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun BoolRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BoolRules {
    var const: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return BoolRules(const, unknownFields)
}

public fun stringRules(builderAction: MutableStringRules.() -> Unit): StringRules {
    @Suppress("DEPRECATION") val builder = MutableStringRules()
    builder.builderAction()
    return builder.toStringRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForStringRules")
public fun StringRules?.orDefault(): pbandk.testpb.StringRules = this ?: StringRules.defaultInstance

private class StringRules_Impl(
    override val const: String?,
    override val len: Long?,
    override val minLen: Long?,
    override val maxLen: Long?,
    override val lenBytes: Long?,
    override val minBytes: Long?,
    override val maxBytes: Long?,
    override val pattern: String?,
    override val prefix: String?,
    override val suffix: String?,
    override val contains: String?,
    override val notContains: String?,
    override val `in`: List<String>,
    override val notIn: List<String>,
    override val strict: Boolean?,
    override val wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : StringRules, pbandk.GeneratedMessage<StringRules>() {
    override val descriptor get() = StringRules.descriptor

    override val email: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Email)?.value
    override val hostname: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Hostname)?.value
    override val ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ip)?.value
    override val ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ipv4)?.value
    override val ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ipv6)?.value
    override val uri: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Uri)?.value
    override val uriRef: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.UriRef)?.value
    override val address: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Address)?.value
    override val uuid: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Uuid)?.value
    override val wellKnownRegex: pbandk.testpb.KnownRegex?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.WellKnownRegex)?.value

    override fun copy(
        const: String?,
        len: Long?,
        minLen: Long?,
        maxLen: Long?,
        lenBytes: Long?,
        minBytes: Long?,
        maxBytes: Long?,
        pattern: String?,
        prefix: String?,
        suffix: String?,
        contains: String?,
        notContains: String?,
        `in`: List<String>,
        notIn: List<String>,
        strict: Boolean?,
        wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = StringRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        lenBytes = lenBytes,
        minBytes = minBytes,
        maxBytes = maxBytes,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        notContains = notContains,
        `in` = `in`,
        notIn = notIn,
        strict = strict,
        wellKnown = wellKnown,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? StringRules)?.let {
        it.copy(
            const = other.const ?: const,
            len = other.len ?: len,
            minLen = other.minLen ?: minLen,
            maxLen = other.maxLen ?: maxLen,
            lenBytes = other.lenBytes ?: lenBytes,
            minBytes = other.minBytes ?: minBytes,
            maxBytes = other.maxBytes ?: maxBytes,
            pattern = other.pattern ?: pattern,
            prefix = other.prefix ?: prefix,
            suffix = other.suffix ?: suffix,
            contains = other.contains ?: contains,
            notContains = other.notContains ?: notContains,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            strict = other.strict ?: strict,
            wellKnown = other.wellKnown ?: wellKnown,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableStringRules_Impl(
    override var const: String?,
    override var len: Long?,
    override var minLen: Long?,
    override var maxLen: Long?,
    override var lenBytes: Long?,
    override var minBytes: Long?,
    override var maxBytes: Long?,
    override var pattern: String?,
    override var prefix: String?,
    override var suffix: String?,
    override var contains: String?,
    override var notContains: String?,
    override var `in`: List<String>,
    override var notIn: List<String>,
    override var strict: Boolean?,
    override var wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableStringRules, pbandk.MutableGeneratedMessage<MutableStringRules>() {
    override val descriptor get() = StringRules.descriptor

    override var email: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Email)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Email(it) } }
    override var hostname: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Hostname)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Hostname(it) } }
    override var ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ip)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Ip(it) } }
    override var ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ipv4)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Ipv4(it) } }
    override var ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ipv6)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Ipv6(it) } }
    override var uri: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Uri)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Uri(it) } }
    override var uriRef: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.UriRef)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.UriRef(it) } }
    override var address: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Address)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Address(it) } }
    override var uuid: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Uuid)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.Uuid(it) } }
    override var wellKnownRegex: pbandk.testpb.KnownRegex?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.WellKnownRegex)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.StringRules.WellKnown.WellKnownRegex(it) } }

    override fun copy(
        const: String?,
        len: Long?,
        minLen: Long?,
        maxLen: Long?,
        lenBytes: Long?,
        minBytes: Long?,
        maxBytes: Long?,
        pattern: String?,
        prefix: String?,
        suffix: String?,
        contains: String?,
        notContains: String?,
        `in`: List<String>,
        notIn: List<String>,
        strict: Boolean?,
        wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = StringRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        lenBytes = lenBytes,
        minBytes = minBytes,
        maxBytes = maxBytes,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        notContains = notContains,
        `in` = `in`,
        notIn = notIn,
        strict = strict,
        wellKnown = wellKnown,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? StringRules)?.let {
        it.copy(
            const = other.const ?: const,
            len = other.len ?: len,
            minLen = other.minLen ?: minLen,
            maxLen = other.maxLen ?: maxLen,
            lenBytes = other.lenBytes ?: lenBytes,
            minBytes = other.minBytes ?: minBytes,
            maxBytes = other.maxBytes ?: maxBytes,
            pattern = other.pattern ?: pattern,
            prefix = other.prefix ?: prefix,
            suffix = other.suffix ?: suffix,
            contains = other.contains ?: contains,
            notContains = other.notContains ?: notContains,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            strict = other.strict ?: strict,
            wellKnown = other.wellKnown ?: wellKnown,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toStringRules() = StringRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        lenBytes = lenBytes,
        minBytes = minBytes,
        maxBytes = maxBytes,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        notContains = notContains,
        `in` = `in`,
        notIn = notIn,
        strict = strict,
        wellKnown = wellKnown,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun StringRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StringRules {
    var const: String? = null
    var len: Long? = null
    var minLen: Long? = null
    var maxLen: Long? = null
    var lenBytes: Long? = null
    var minBytes: Long? = null
    var maxBytes: Long? = null
    var pattern: String? = null
    var prefix: String? = null
    var suffix: String? = null
    var contains: String? = null
    var notContains: String? = null
    var `in`: pbandk.ListWithSize.Builder<String>? = null
    var notIn: pbandk.ListWithSize.Builder<String>? = null
    var strict: Boolean? = null
    var wellKnown: StringRules.WellKnown<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as String
            2 -> minLen = _fieldValue as Long
            3 -> maxLen = _fieldValue as Long
            4 -> minBytes = _fieldValue as Long
            5 -> maxBytes = _fieldValue as Long
            6 -> pattern = _fieldValue as String
            7 -> prefix = _fieldValue as String
            8 -> suffix = _fieldValue as String
            9 -> contains = _fieldValue as String
            10 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            11 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            12 -> wellKnown = StringRules.WellKnown.Email(_fieldValue as Boolean)
            13 -> wellKnown = StringRules.WellKnown.Hostname(_fieldValue as Boolean)
            14 -> wellKnown = StringRules.WellKnown.Ip(_fieldValue as Boolean)
            15 -> wellKnown = StringRules.WellKnown.Ipv4(_fieldValue as Boolean)
            16 -> wellKnown = StringRules.WellKnown.Ipv6(_fieldValue as Boolean)
            17 -> wellKnown = StringRules.WellKnown.Uri(_fieldValue as Boolean)
            18 -> wellKnown = StringRules.WellKnown.UriRef(_fieldValue as Boolean)
            19 -> len = _fieldValue as Long
            20 -> lenBytes = _fieldValue as Long
            21 -> wellKnown = StringRules.WellKnown.Address(_fieldValue as Boolean)
            22 -> wellKnown = StringRules.WellKnown.Uuid(_fieldValue as Boolean)
            23 -> notContains = _fieldValue as String
            24 -> wellKnown = StringRules.WellKnown.WellKnownRegex(_fieldValue as pbandk.testpb.KnownRegex)
            25 -> strict = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return StringRules(const, len, minLen, maxLen,
        lenBytes, minBytes, maxBytes, pattern,
        prefix, suffix, contains, notContains,
        pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), strict, wellKnown, unknownFields)
}

public fun bytesRules(builderAction: MutableBytesRules.() -> Unit): BytesRules {
    @Suppress("DEPRECATION") val builder = MutableBytesRules()
    builder.builderAction()
    return builder.toBytesRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForBytesRules")
public fun BytesRules?.orDefault(): pbandk.testpb.BytesRules = this ?: BytesRules.defaultInstance

private class BytesRules_Impl(
    override val const: pbandk.ByteArr?,
    override val len: Long?,
    override val minLen: Long?,
    override val maxLen: Long?,
    override val pattern: String?,
    override val prefix: pbandk.ByteArr?,
    override val suffix: pbandk.ByteArr?,
    override val contains: pbandk.ByteArr?,
    override val `in`: List<pbandk.ByteArr>,
    override val notIn: List<pbandk.ByteArr>,
    override val wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BytesRules, pbandk.GeneratedMessage<BytesRules>() {
    override val descriptor get() = BytesRules.descriptor

    override val ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ip)?.value
    override val ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv4)?.value
    override val ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv6)?.value

    override fun copy(
        const: pbandk.ByteArr?,
        len: Long?,
        minLen: Long?,
        maxLen: Long?,
        pattern: String?,
        prefix: pbandk.ByteArr?,
        suffix: pbandk.ByteArr?,
        contains: pbandk.ByteArr?,
        `in`: List<pbandk.ByteArr>,
        notIn: List<pbandk.ByteArr>,
        wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BytesRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        `in` = `in`,
        notIn = notIn,
        wellKnown = wellKnown,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BytesRules)?.let {
        it.copy(
            const = other.const ?: const,
            len = other.len ?: len,
            minLen = other.minLen ?: minLen,
            maxLen = other.maxLen ?: maxLen,
            pattern = other.pattern ?: pattern,
            prefix = other.prefix ?: prefix,
            suffix = other.suffix ?: suffix,
            contains = other.contains ?: contains,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            wellKnown = other.wellKnown ?: wellKnown,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableBytesRules_Impl(
    override var const: pbandk.ByteArr?,
    override var len: Long?,
    override var minLen: Long?,
    override var maxLen: Long?,
    override var pattern: String?,
    override var prefix: pbandk.ByteArr?,
    override var suffix: pbandk.ByteArr?,
    override var contains: pbandk.ByteArr?,
    override var `in`: List<pbandk.ByteArr>,
    override var notIn: List<pbandk.ByteArr>,
    override var wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableBytesRules, pbandk.MutableGeneratedMessage<MutableBytesRules>() {
    override val descriptor get() = BytesRules.descriptor

    override var ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ip)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.BytesRules.WellKnown.Ip(it) } }
    override var ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv4)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.BytesRules.WellKnown.Ipv4(it) } }
    override var ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv6)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.BytesRules.WellKnown.Ipv6(it) } }

    override fun copy(
        const: pbandk.ByteArr?,
        len: Long?,
        minLen: Long?,
        maxLen: Long?,
        pattern: String?,
        prefix: pbandk.ByteArr?,
        suffix: pbandk.ByteArr?,
        contains: pbandk.ByteArr?,
        `in`: List<pbandk.ByteArr>,
        notIn: List<pbandk.ByteArr>,
        wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BytesRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        `in` = `in`,
        notIn = notIn,
        wellKnown = wellKnown,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BytesRules)?.let {
        it.copy(
            const = other.const ?: const,
            len = other.len ?: len,
            minLen = other.minLen ?: minLen,
            maxLen = other.maxLen ?: maxLen,
            pattern = other.pattern ?: pattern,
            prefix = other.prefix ?: prefix,
            suffix = other.suffix ?: suffix,
            contains = other.contains ?: contains,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            wellKnown = other.wellKnown ?: wellKnown,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toBytesRules() = BytesRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        `in` = `in`,
        notIn = notIn,
        wellKnown = wellKnown,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun BytesRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BytesRules {
    var const: pbandk.ByteArr? = null
    var len: Long? = null
    var minLen: Long? = null
    var maxLen: Long? = null
    var pattern: String? = null
    var prefix: pbandk.ByteArr? = null
    var suffix: pbandk.ByteArr? = null
    var contains: pbandk.ByteArr? = null
    var `in`: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var notIn: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var wellKnown: BytesRules.WellKnown<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as pbandk.ByteArr
            2 -> minLen = _fieldValue as Long
            3 -> maxLen = _fieldValue as Long
            4 -> pattern = _fieldValue as String
            5 -> prefix = _fieldValue as pbandk.ByteArr
            6 -> suffix = _fieldValue as pbandk.ByteArr
            7 -> contains = _fieldValue as pbandk.ByteArr
            8 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            9 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            10 -> wellKnown = BytesRules.WellKnown.Ip(_fieldValue as Boolean)
            11 -> wellKnown = BytesRules.WellKnown.Ipv4(_fieldValue as Boolean)
            12 -> wellKnown = BytesRules.WellKnown.Ipv6(_fieldValue as Boolean)
            13 -> len = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return BytesRules(const, len, minLen, maxLen,
        pattern, prefix, suffix, contains,
        pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), wellKnown, unknownFields)
}

public fun enumRules(builderAction: MutableEnumRules.() -> Unit): EnumRules {
    @Suppress("DEPRECATION") val builder = MutableEnumRules()
    builder.builderAction()
    return builder.toEnumRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumRules")
public fun EnumRules?.orDefault(): pbandk.testpb.EnumRules = this ?: EnumRules.defaultInstance

private class EnumRules_Impl(
    override val const: Int?,
    override val definedOnly: Boolean?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : EnumRules, pbandk.GeneratedMessage<EnumRules>() {
    override val descriptor get() = EnumRules.descriptor

    override fun copy(
        const: Int?,
        definedOnly: Boolean?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = EnumRules_Impl(
        const = const,
        definedOnly = definedOnly,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? EnumRules)?.let {
        it.copy(
            const = other.const ?: const,
            definedOnly = other.definedOnly ?: definedOnly,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableEnumRules_Impl(
    override var const: Int?,
    override var definedOnly: Boolean?,
    override var `in`: List<Int>,
    override var notIn: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableEnumRules, pbandk.MutableGeneratedMessage<MutableEnumRules>() {
    override val descriptor get() = EnumRules.descriptor

    override fun copy(
        const: Int?,
        definedOnly: Boolean?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = EnumRules_Impl(
        const = const,
        definedOnly = definedOnly,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? EnumRules)?.let {
        it.copy(
            const = other.const ?: const,
            definedOnly = other.definedOnly ?: definedOnly,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toEnumRules() = EnumRules_Impl(
        const = const,
        definedOnly = definedOnly,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun EnumRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumRules {
    var const: Int? = null
    var definedOnly: Boolean? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> definedOnly = _fieldValue as Boolean
            3 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            4 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return EnumRules(const, definedOnly, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun messageRules(builderAction: MutableMessageRules.() -> Unit): MessageRules {
    @Suppress("DEPRECATION") val builder = MutableMessageRules()
    builder.builderAction()
    return builder.toMessageRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageRules")
public fun MessageRules?.orDefault(): pbandk.testpb.MessageRules = this ?: MessageRules.defaultInstance

private class MessageRules_Impl(
    override val skip: Boolean?,
    override val required: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MessageRules, pbandk.GeneratedMessage<MessageRules>() {
    override val descriptor get() = MessageRules.descriptor

    override fun copy(
        skip: Boolean?,
        required: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MessageRules_Impl(
        skip = skip,
        required = required,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MessageRules)?.let {
        it.copy(
            skip = other.skip ?: skip,
            required = other.required ?: required,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableMessageRules_Impl(
    override var skip: Boolean?,
    override var required: Boolean?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMessageRules, pbandk.MutableGeneratedMessage<MutableMessageRules>() {
    override val descriptor get() = MessageRules.descriptor

    override fun copy(
        skip: Boolean?,
        required: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MessageRules_Impl(
        skip = skip,
        required = required,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MessageRules)?.let {
        it.copy(
            skip = other.skip ?: skip,
            required = other.required ?: required,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMessageRules() = MessageRules_Impl(
        skip = skip,
        required = required,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun MessageRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageRules {
    var skip: Boolean? = null
    var required: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> skip = _fieldValue as Boolean
            2 -> required = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return MessageRules(skip, required, unknownFields)
}

public fun repeatedRules(builderAction: MutableRepeatedRules.() -> Unit): RepeatedRules {
    @Suppress("DEPRECATION") val builder = MutableRepeatedRules()
    builder.builderAction()
    return builder.toRepeatedRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForRepeatedRules")
public fun RepeatedRules?.orDefault(): pbandk.testpb.RepeatedRules = this ?: RepeatedRules.defaultInstance

private class RepeatedRules_Impl(
    override val minItems: Long?,
    override val maxItems: Long?,
    override val unique: Boolean?,
    override val items: pbandk.testpb.FieldRules?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : RepeatedRules, pbandk.GeneratedMessage<RepeatedRules>() {
    override val descriptor get() = RepeatedRules.descriptor

    override fun copy(
        minItems: Long?,
        maxItems: Long?,
        unique: Boolean?,
        items: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = RepeatedRules_Impl(
        minItems = minItems,
        maxItems = maxItems,
        unique = unique,
        items = items,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? RepeatedRules)?.let {
        it.copy(
            minItems = other.minItems ?: minItems,
            maxItems = other.maxItems ?: maxItems,
            unique = other.unique ?: unique,
            items = items?.plus(other.items) ?: other.items,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableRepeatedRules_Impl(
    override var minItems: Long?,
    override var maxItems: Long?,
    override var unique: Boolean?,
    override var items: pbandk.testpb.FieldRules?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableRepeatedRules, pbandk.MutableGeneratedMessage<MutableRepeatedRules>() {
    override val descriptor get() = RepeatedRules.descriptor

    override fun copy(
        minItems: Long?,
        maxItems: Long?,
        unique: Boolean?,
        items: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = RepeatedRules_Impl(
        minItems = minItems,
        maxItems = maxItems,
        unique = unique,
        items = items,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? RepeatedRules)?.let {
        it.copy(
            minItems = other.minItems ?: minItems,
            maxItems = other.maxItems ?: maxItems,
            unique = other.unique ?: unique,
            items = items?.plus(other.items) ?: other.items,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toRepeatedRules() = RepeatedRules_Impl(
        minItems = minItems,
        maxItems = maxItems,
        unique = unique,
        items = items,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun RepeatedRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RepeatedRules {
    var minItems: Long? = null
    var maxItems: Long? = null
    var unique: Boolean? = null
    var items: pbandk.testpb.FieldRules? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> minItems = _fieldValue as Long
            2 -> maxItems = _fieldValue as Long
            3 -> unique = _fieldValue as Boolean
            4 -> items = _fieldValue as pbandk.testpb.FieldRules
        }
    }
    @Suppress("DEPRECATION")
    return RepeatedRules(minItems, maxItems, unique, items, unknownFields)
}

public fun mapRules(builderAction: MutableMapRules.() -> Unit): MapRules {
    @Suppress("DEPRECATION") val builder = MutableMapRules()
    builder.builderAction()
    return builder.toMapRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMapRules")
public fun MapRules?.orDefault(): pbandk.testpb.MapRules = this ?: MapRules.defaultInstance

private class MapRules_Impl(
    override val minPairs: Long?,
    override val maxPairs: Long?,
    override val noSparse: Boolean?,
    override val keys: pbandk.testpb.FieldRules?,
    override val values: pbandk.testpb.FieldRules?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MapRules, pbandk.GeneratedMessage<MapRules>() {
    override val descriptor get() = MapRules.descriptor

    override fun copy(
        minPairs: Long?,
        maxPairs: Long?,
        noSparse: Boolean?,
        keys: pbandk.testpb.FieldRules?,
        values: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MapRules_Impl(
        minPairs = minPairs,
        maxPairs = maxPairs,
        noSparse = noSparse,
        keys = keys,
        values = values,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MapRules)?.let {
        it.copy(
            minPairs = other.minPairs ?: minPairs,
            maxPairs = other.maxPairs ?: maxPairs,
            noSparse = other.noSparse ?: noSparse,
            keys = keys?.plus(other.keys) ?: other.keys,
            values = values?.plus(other.values) ?: other.values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableMapRules_Impl(
    override var minPairs: Long?,
    override var maxPairs: Long?,
    override var noSparse: Boolean?,
    override var keys: pbandk.testpb.FieldRules?,
    override var values: pbandk.testpb.FieldRules?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMapRules, pbandk.MutableGeneratedMessage<MutableMapRules>() {
    override val descriptor get() = MapRules.descriptor

    override fun copy(
        minPairs: Long?,
        maxPairs: Long?,
        noSparse: Boolean?,
        keys: pbandk.testpb.FieldRules?,
        values: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MapRules_Impl(
        minPairs = minPairs,
        maxPairs = maxPairs,
        noSparse = noSparse,
        keys = keys,
        values = values,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MapRules)?.let {
        it.copy(
            minPairs = other.minPairs ?: minPairs,
            maxPairs = other.maxPairs ?: maxPairs,
            noSparse = other.noSparse ?: noSparse,
            keys = keys?.plus(other.keys) ?: other.keys,
            values = values?.plus(other.values) ?: other.values,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapRules() = MapRules_Impl(
        minPairs = minPairs,
        maxPairs = maxPairs,
        noSparse = noSparse,
        keys = keys,
        values = values,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun MapRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MapRules {
    var minPairs: Long? = null
    var maxPairs: Long? = null
    var noSparse: Boolean? = null
    var keys: pbandk.testpb.FieldRules? = null
    var values: pbandk.testpb.FieldRules? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> minPairs = _fieldValue as Long
            2 -> maxPairs = _fieldValue as Long
            3 -> noSparse = _fieldValue as Boolean
            4 -> keys = _fieldValue as pbandk.testpb.FieldRules
            5 -> values = _fieldValue as pbandk.testpb.FieldRules
        }
    }
    @Suppress("DEPRECATION")
    return MapRules(minPairs, maxPairs, noSparse, keys,
        values, unknownFields)
}

public fun anyRules(builderAction: MutableAnyRules.() -> Unit): AnyRules {
    @Suppress("DEPRECATION") val builder = MutableAnyRules()
    builder.builderAction()
    return builder.toAnyRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForAnyRules")
public fun AnyRules?.orDefault(): pbandk.testpb.AnyRules = this ?: AnyRules.defaultInstance

private class AnyRules_Impl(
    override val required: Boolean?,
    override val `in`: List<String>,
    override val notIn: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : AnyRules, pbandk.GeneratedMessage<AnyRules>() {
    override val descriptor get() = AnyRules.descriptor

    override fun copy(
        required: Boolean?,
        `in`: List<String>,
        notIn: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = AnyRules_Impl(
        required = required,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? AnyRules)?.let {
        it.copy(
            required = other.required ?: required,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableAnyRules_Impl(
    override var required: Boolean?,
    override var `in`: List<String>,
    override var notIn: List<String>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableAnyRules, pbandk.MutableGeneratedMessage<MutableAnyRules>() {
    override val descriptor get() = AnyRules.descriptor

    override fun copy(
        required: Boolean?,
        `in`: List<String>,
        notIn: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = AnyRules_Impl(
        required = required,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? AnyRules)?.let {
        it.copy(
            required = other.required ?: required,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toAnyRules() = AnyRules_Impl(
        required = required,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun AnyRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AnyRules {
    var required: Boolean? = null
    var `in`: pbandk.ListWithSize.Builder<String>? = null
    var notIn: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> required = _fieldValue as Boolean
            2 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            3 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    @Suppress("DEPRECATION")
    return AnyRules(required, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun durationRules(builderAction: MutableDurationRules.() -> Unit): DurationRules {
    @Suppress("DEPRECATION") val builder = MutableDurationRules()
    builder.builderAction()
    return builder.toDurationRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForDurationRules")
public fun DurationRules?.orDefault(): pbandk.testpb.DurationRules = this ?: DurationRules.defaultInstance

private class DurationRules_Impl(
    override val required: Boolean?,
    override val const: pbandk.wkt.Duration?,
    override val lt: pbandk.wkt.Duration?,
    override val lte: pbandk.wkt.Duration?,
    override val gt: pbandk.wkt.Duration?,
    override val gte: pbandk.wkt.Duration?,
    override val `in`: List<pbandk.wkt.Duration>,
    override val notIn: List<pbandk.wkt.Duration>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : DurationRules, pbandk.GeneratedMessage<DurationRules>() {
    override val descriptor get() = DurationRules.descriptor

    override fun copy(
        required: Boolean?,
        const: pbandk.wkt.Duration?,
        lt: pbandk.wkt.Duration?,
        lte: pbandk.wkt.Duration?,
        gt: pbandk.wkt.Duration?,
        gte: pbandk.wkt.Duration?,
        `in`: List<pbandk.wkt.Duration>,
        notIn: List<pbandk.wkt.Duration>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = DurationRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? DurationRules)?.let {
        it.copy(
            required = other.required ?: required,
            const = const?.plus(other.const) ?: other.const,
            lt = lt?.plus(other.lt) ?: other.lt,
            lte = lte?.plus(other.lte) ?: other.lte,
            gt = gt?.plus(other.gt) ?: other.gt,
            gte = gte?.plus(other.gte) ?: other.gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableDurationRules_Impl(
    override var required: Boolean?,
    override var const: pbandk.wkt.Duration?,
    override var lt: pbandk.wkt.Duration?,
    override var lte: pbandk.wkt.Duration?,
    override var gt: pbandk.wkt.Duration?,
    override var gte: pbandk.wkt.Duration?,
    override var `in`: List<pbandk.wkt.Duration>,
    override var notIn: List<pbandk.wkt.Duration>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableDurationRules, pbandk.MutableGeneratedMessage<MutableDurationRules>() {
    override val descriptor get() = DurationRules.descriptor

    override fun copy(
        required: Boolean?,
        const: pbandk.wkt.Duration?,
        lt: pbandk.wkt.Duration?,
        lte: pbandk.wkt.Duration?,
        gt: pbandk.wkt.Duration?,
        gte: pbandk.wkt.Duration?,
        `in`: List<pbandk.wkt.Duration>,
        notIn: List<pbandk.wkt.Duration>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = DurationRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? DurationRules)?.let {
        it.copy(
            required = other.required ?: required,
            const = const?.plus(other.const) ?: other.const,
            lt = lt?.plus(other.lt) ?: other.lt,
            lte = lte?.plus(other.lte) ?: other.lte,
            gt = gt?.plus(other.gt) ?: other.gt,
            gte = gte?.plus(other.gte) ?: other.gte,
            `in` = `in` + other.`in`,
            notIn = notIn + other.notIn,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toDurationRules() = DurationRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`,
        notIn = notIn,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun DurationRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DurationRules {
    var required: Boolean? = null
    var const: pbandk.wkt.Duration? = null
    var lt: pbandk.wkt.Duration? = null
    var lte: pbandk.wkt.Duration? = null
    var gt: pbandk.wkt.Duration? = null
    var gte: pbandk.wkt.Duration? = null
    var `in`: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null
    var notIn: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> required = _fieldValue as Boolean
            2 -> const = _fieldValue as pbandk.wkt.Duration
            3 -> lt = _fieldValue as pbandk.wkt.Duration
            4 -> lte = _fieldValue as pbandk.wkt.Duration
            5 -> gt = _fieldValue as pbandk.wkt.Duration
            6 -> gte = _fieldValue as pbandk.wkt.Duration
            7 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
            8 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
        }
    }
    @Suppress("DEPRECATION")
    return DurationRules(required, const, lt, lte,
        gt, gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

public fun timestampRules(builderAction: MutableTimestampRules.() -> Unit): TimestampRules {
    @Suppress("DEPRECATION") val builder = MutableTimestampRules()
    builder.builderAction()
    return builder.toTimestampRules()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTimestampRules")
public fun TimestampRules?.orDefault(): pbandk.testpb.TimestampRules = this ?: TimestampRules.defaultInstance

private class TimestampRules_Impl(
    override val required: Boolean?,
    override val const: pbandk.wkt.Timestamp?,
    override val lt: pbandk.wkt.Timestamp?,
    override val lte: pbandk.wkt.Timestamp?,
    override val gt: pbandk.wkt.Timestamp?,
    override val gte: pbandk.wkt.Timestamp?,
    override val ltNow: Boolean?,
    override val gtNow: Boolean?,
    override val within: pbandk.wkt.Duration?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TimestampRules, pbandk.GeneratedMessage<TimestampRules>() {
    override val descriptor get() = TimestampRules.descriptor

    override fun copy(
        required: Boolean?,
        const: pbandk.wkt.Timestamp?,
        lt: pbandk.wkt.Timestamp?,
        lte: pbandk.wkt.Timestamp?,
        gt: pbandk.wkt.Timestamp?,
        gte: pbandk.wkt.Timestamp?,
        ltNow: Boolean?,
        gtNow: Boolean?,
        within: pbandk.wkt.Duration?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TimestampRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        ltNow = ltNow,
        gtNow = gtNow,
        within = within,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TimestampRules)?.let {
        it.copy(
            required = other.required ?: required,
            const = const?.plus(other.const) ?: other.const,
            lt = lt?.plus(other.lt) ?: other.lt,
            lte = lte?.plus(other.lte) ?: other.lte,
            gt = gt?.plus(other.gt) ?: other.gt,
            gte = gte?.plus(other.gte) ?: other.gte,
            ltNow = other.ltNow ?: ltNow,
            gtNow = other.gtNow ?: gtNow,
            within = within?.plus(other.within) ?: other.within,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableTimestampRules_Impl(
    override var required: Boolean?,
    override var const: pbandk.wkt.Timestamp?,
    override var lt: pbandk.wkt.Timestamp?,
    override var lte: pbandk.wkt.Timestamp?,
    override var gt: pbandk.wkt.Timestamp?,
    override var gte: pbandk.wkt.Timestamp?,
    override var ltNow: Boolean?,
    override var gtNow: Boolean?,
    override var within: pbandk.wkt.Duration?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableTimestampRules, pbandk.MutableGeneratedMessage<MutableTimestampRules>() {
    override val descriptor get() = TimestampRules.descriptor

    override fun copy(
        required: Boolean?,
        const: pbandk.wkt.Timestamp?,
        lt: pbandk.wkt.Timestamp?,
        lte: pbandk.wkt.Timestamp?,
        gt: pbandk.wkt.Timestamp?,
        gte: pbandk.wkt.Timestamp?,
        ltNow: Boolean?,
        gtNow: Boolean?,
        within: pbandk.wkt.Duration?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TimestampRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        ltNow = ltNow,
        gtNow = gtNow,
        within = within,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TimestampRules)?.let {
        it.copy(
            required = other.required ?: required,
            const = const?.plus(other.const) ?: other.const,
            lt = lt?.plus(other.lt) ?: other.lt,
            lte = lte?.plus(other.lte) ?: other.lte,
            gt = gt?.plus(other.gt) ?: other.gt,
            gte = gte?.plus(other.gte) ?: other.gte,
            ltNow = other.ltNow ?: ltNow,
            gtNow = other.gtNow ?: gtNow,
            within = within?.plus(other.within) ?: other.within,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toTimestampRules() = TimestampRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        ltNow = ltNow,
        gtNow = gtNow,
        within = within,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TimestampRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TimestampRules {
    var required: Boolean? = null
    var const: pbandk.wkt.Timestamp? = null
    var lt: pbandk.wkt.Timestamp? = null
    var lte: pbandk.wkt.Timestamp? = null
    var gt: pbandk.wkt.Timestamp? = null
    var gte: pbandk.wkt.Timestamp? = null
    var ltNow: Boolean? = null
    var gtNow: Boolean? = null
    var within: pbandk.wkt.Duration? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> required = _fieldValue as Boolean
            2 -> const = _fieldValue as pbandk.wkt.Timestamp
            3 -> lt = _fieldValue as pbandk.wkt.Timestamp
            4 -> lte = _fieldValue as pbandk.wkt.Timestamp
            5 -> gt = _fieldValue as pbandk.wkt.Timestamp
            6 -> gte = _fieldValue as pbandk.wkt.Timestamp
            7 -> ltNow = _fieldValue as Boolean
            8 -> gtNow = _fieldValue as Boolean
            9 -> within = _fieldValue as pbandk.wkt.Duration
        }
    }
    @Suppress("DEPRECATION")
    return TimestampRules(required, const, lt, lte,
        gt, gte, ltNow, gtNow,
        within, unknownFields)
}

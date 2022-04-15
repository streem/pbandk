@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public sealed class KnownRegex(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.testpb.KnownRegex && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "KnownRegex.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object UNKNOWN : KnownRegex(0, "UNKNOWN")
    public object HTTP_HEADER_NAME : KnownRegex(1, "HTTP_HEADER_NAME")
    public object HTTP_HEADER_VALUE : KnownRegex(2, "HTTP_HEADER_VALUE")
    public class UNRECOGNIZED(value: Int) : KnownRegex(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.KnownRegex> {
        public val values: List<KnownRegex> by lazy { listOf(UNKNOWN, HTTP_HEADER_NAME, HTTP_HEADER_VALUE) }
        override fun fromValue(value: Int): pbandk.testpb.KnownRegex = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.testpb.KnownRegex = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No KnownRegex with name: $name")
    }
}

@pbandk.Export
public sealed interface FieldRules : pbandk.Message {
    public val message: pbandk.testpb.MessageRules?
    public val type: Type<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FieldRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules>

    /**
     * The [MutableFieldRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit): pbandk.testpb.FieldRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.FieldRules by lazy { pbandk.testpb.FieldRules {} }
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

@pbandk.Export
public sealed interface MutableFieldRules : pbandk.testpb.FieldRules, pbandk.MutableMessage {
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
}

@pbandk.Export
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

    /**
     * The [MutableFloatRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit): pbandk.testpb.FloatRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.FloatRules by lazy { pbandk.testpb.FloatRules {} }
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

@pbandk.Export
public sealed interface MutableFloatRules : pbandk.testpb.FloatRules, pbandk.MutableMessage {
    public override var const: Float?
    public override var lt: Float?
    public override var lte: Float?
    public override var gt: Float?
    public override var gte: Float?
    public override val `in`: MutableList<Float>
    public override val notIn: MutableList<Float>
}

@pbandk.Export
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

    /**
     * The [MutableDoubleRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit): pbandk.testpb.DoubleRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.DoubleRules by lazy { pbandk.testpb.DoubleRules {} }
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

@pbandk.Export
public sealed interface MutableDoubleRules : pbandk.testpb.DoubleRules, pbandk.MutableMessage {
    public override var const: Double?
    public override var lt: Double?
    public override var lte: Double?
    public override var gt: Double?
    public override var gte: Double?
    public override val `in`: MutableList<Double>
    public override val notIn: MutableList<Double>
}

@pbandk.Export
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

    /**
     * The [MutableInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit): pbandk.testpb.Int32Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.Int32Rules by lazy { pbandk.testpb.Int32Rules {} }
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

@pbandk.Export
public sealed interface MutableInt32Rules : pbandk.testpb.Int32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

@pbandk.Export
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

    /**
     * The [MutableInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit): pbandk.testpb.Int64Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.Int64Rules by lazy { pbandk.testpb.Int64Rules {} }
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

@pbandk.Export
public sealed interface MutableInt64Rules : pbandk.testpb.Int64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
}

@pbandk.Export
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

    /**
     * The [MutableUInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit): pbandk.testpb.UInt32Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.UInt32Rules by lazy { pbandk.testpb.UInt32Rules {} }
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

@pbandk.Export
public sealed interface MutableUInt32Rules : pbandk.testpb.UInt32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

@pbandk.Export
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

    /**
     * The [MutableUInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit): pbandk.testpb.UInt64Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.UInt64Rules by lazy { pbandk.testpb.UInt64Rules {} }
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

@pbandk.Export
public sealed interface MutableUInt64Rules : pbandk.testpb.UInt64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
}

@pbandk.Export
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

    /**
     * The [MutableSInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit): pbandk.testpb.SInt32Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.SInt32Rules by lazy { pbandk.testpb.SInt32Rules {} }
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

@pbandk.Export
public sealed interface MutableSInt32Rules : pbandk.testpb.SInt32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

@pbandk.Export
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

    /**
     * The [MutableSInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit): pbandk.testpb.SInt64Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.SInt64Rules by lazy { pbandk.testpb.SInt64Rules {} }
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

@pbandk.Export
public sealed interface MutableSInt64Rules : pbandk.testpb.SInt64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
}

@pbandk.Export
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

    /**
     * The [MutableFixed32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit): pbandk.testpb.Fixed32Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.Fixed32Rules by lazy { pbandk.testpb.Fixed32Rules {} }
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

@pbandk.Export
public sealed interface MutableFixed32Rules : pbandk.testpb.Fixed32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

@pbandk.Export
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

    /**
     * The [MutableFixed64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit): pbandk.testpb.Fixed64Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.Fixed64Rules by lazy { pbandk.testpb.Fixed64Rules {} }
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

@pbandk.Export
public sealed interface MutableFixed64Rules : pbandk.testpb.Fixed64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
}

@pbandk.Export
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

    /**
     * The [MutableSFixed32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit): pbandk.testpb.SFixed32Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.SFixed32Rules by lazy { pbandk.testpb.SFixed32Rules {} }
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

@pbandk.Export
public sealed interface MutableSFixed32Rules : pbandk.testpb.SFixed32Rules, pbandk.MutableMessage {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

@pbandk.Export
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

    /**
     * The [MutableSFixed64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit): pbandk.testpb.SFixed64Rules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.SFixed64Rules by lazy { pbandk.testpb.SFixed64Rules {} }
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

@pbandk.Export
public sealed interface MutableSFixed64Rules : pbandk.testpb.SFixed64Rules, pbandk.MutableMessage {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
}

@pbandk.Export
public sealed interface BoolRules : pbandk.Message {
    public val const: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.BoolRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules>

    /**
     * The [MutableBoolRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit): pbandk.testpb.BoolRules

    @Deprecated("Use copy {} instead")
    public fun copy(
        const: Boolean? = this.const,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.BoolRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.BoolRules> {
        public val defaultInstance: pbandk.testpb.BoolRules by lazy { pbandk.testpb.BoolRules {} }
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

@pbandk.Export
public sealed interface MutableBoolRules : pbandk.testpb.BoolRules, pbandk.MutableMessage {
    public override var const: Boolean?
}

@pbandk.Export
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

    /**
     * The [MutableStringRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableStringRules.() -> Unit): pbandk.testpb.StringRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.StringRules by lazy { pbandk.testpb.StringRules {} }
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

@pbandk.Export
public sealed interface MutableStringRules : pbandk.testpb.StringRules, pbandk.MutableMessage {
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
    public override val `in`: MutableList<String>
    public override val notIn: MutableList<String>
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
}

@pbandk.Export
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

    /**
     * The [MutableBytesRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit): pbandk.testpb.BytesRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.BytesRules by lazy { pbandk.testpb.BytesRules {} }
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

@pbandk.Export
public sealed interface MutableBytesRules : pbandk.testpb.BytesRules, pbandk.MutableMessage {
    public override var const: pbandk.ByteArr?
    public override var len: Long?
    public override var minLen: Long?
    public override var maxLen: Long?
    public override var pattern: String?
    public override var prefix: pbandk.ByteArr?
    public override var suffix: pbandk.ByteArr?
    public override var contains: pbandk.ByteArr?
    public override val `in`: MutableList<pbandk.ByteArr>
    public override val notIn: MutableList<pbandk.ByteArr>
    public override var wellKnown: BytesRules.WellKnown<*>?

    public override var ip: Boolean?
    public override var ipv4: Boolean?
    public override var ipv6: Boolean?
}

@pbandk.Export
public sealed interface EnumRules : pbandk.Message {
    public val const: Int?
    public val definedOnly: Boolean?
    public val `in`: List<Int>
    public val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.EnumRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules>

    /**
     * The [MutableEnumRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit): pbandk.testpb.EnumRules

    @Deprecated("Use copy {} instead")
    public fun copy(
        const: Int? = this.const,
        definedOnly: Boolean? = this.definedOnly,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.EnumRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.EnumRules> {
        public val defaultInstance: pbandk.testpb.EnumRules by lazy { pbandk.testpb.EnumRules {} }
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

@pbandk.Export
public sealed interface MutableEnumRules : pbandk.testpb.EnumRules, pbandk.MutableMessage {
    public override var const: Int?
    public override var definedOnly: Boolean?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

@pbandk.Export
public sealed interface MessageRules : pbandk.Message {
    public val skip: Boolean?
    public val required: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules>

    /**
     * The [MutableMessageRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit): pbandk.testpb.MessageRules

    @Deprecated("Use copy {} instead")
    public fun copy(
        skip: Boolean? = this.skip,
        required: Boolean? = this.required,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageRules> {
        public val defaultInstance: pbandk.testpb.MessageRules by lazy { pbandk.testpb.MessageRules {} }
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

@pbandk.Export
public sealed interface MutableMessageRules : pbandk.testpb.MessageRules, pbandk.MutableMessage {
    public override var skip: Boolean?
    public override var required: Boolean?
}

@pbandk.Export
public sealed interface RepeatedRules : pbandk.Message {
    public val minItems: Long?
    public val maxItems: Long?
    public val unique: Boolean?
    public val items: pbandk.testpb.FieldRules?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.RepeatedRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules>

    /**
     * The [MutableRepeatedRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit): pbandk.testpb.RepeatedRules

    @Deprecated("Use copy {} instead")
    public fun copy(
        minItems: Long? = this.minItems,
        maxItems: Long? = this.maxItems,
        unique: Boolean? = this.unique,
        items: pbandk.testpb.FieldRules? = this.items,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.RepeatedRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.RepeatedRules> {
        public val defaultInstance: pbandk.testpb.RepeatedRules by lazy { pbandk.testpb.RepeatedRules {} }
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

@pbandk.Export
public sealed interface MutableRepeatedRules : pbandk.testpb.RepeatedRules, pbandk.MutableMessage {
    public override var minItems: Long?
    public override var maxItems: Long?
    public override var unique: Boolean?
    public override var items: pbandk.testpb.FieldRules?
}

@pbandk.Export
public sealed interface MapRules : pbandk.Message {
    public val minPairs: Long?
    public val maxPairs: Long?
    public val noSparse: Boolean?
    public val keys: pbandk.testpb.FieldRules?
    public val values: pbandk.testpb.FieldRules?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MapRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules>

    /**
     * The [MutableMapRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMapRules.() -> Unit): pbandk.testpb.MapRules

    @Deprecated("Use copy {} instead")
    public fun copy(
        minPairs: Long? = this.minPairs,
        maxPairs: Long? = this.maxPairs,
        noSparse: Boolean? = this.noSparse,
        keys: pbandk.testpb.FieldRules? = this.keys,
        values: pbandk.testpb.FieldRules? = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MapRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.MapRules> {
        public val defaultInstance: pbandk.testpb.MapRules by lazy { pbandk.testpb.MapRules {} }
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

@pbandk.Export
public sealed interface MutableMapRules : pbandk.testpb.MapRules, pbandk.MutableMessage {
    public override var minPairs: Long?
    public override var maxPairs: Long?
    public override var noSparse: Boolean?
    public override var keys: pbandk.testpb.FieldRules?
    public override var values: pbandk.testpb.FieldRules?
}

@pbandk.Export
public sealed interface AnyRules : pbandk.Message {
    public val required: Boolean?
    public val `in`: List<String>
    public val notIn: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.AnyRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules>

    /**
     * The [MutableAnyRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit): pbandk.testpb.AnyRules

    @Deprecated("Use copy {} instead")
    public fun copy(
        required: Boolean? = this.required,
        `in`: List<String> = this.`in`,
        notIn: List<String> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.AnyRules

    public companion object : pbandk.Message.Companion<pbandk.testpb.AnyRules> {
        public val defaultInstance: pbandk.testpb.AnyRules by lazy { pbandk.testpb.AnyRules {} }
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

@pbandk.Export
public sealed interface MutableAnyRules : pbandk.testpb.AnyRules, pbandk.MutableMessage {
    public override var required: Boolean?
    public override val `in`: MutableList<String>
    public override val notIn: MutableList<String>
}

@pbandk.Export
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

    /**
     * The [MutableDurationRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit): pbandk.testpb.DurationRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.DurationRules by lazy { pbandk.testpb.DurationRules {} }
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

@pbandk.Export
public sealed interface MutableDurationRules : pbandk.testpb.DurationRules, pbandk.MutableMessage {
    public override var required: Boolean?
    public override var const: pbandk.wkt.Duration?
    public override var lt: pbandk.wkt.Duration?
    public override var lte: pbandk.wkt.Duration?
    public override var gt: pbandk.wkt.Duration?
    public override var gte: pbandk.wkt.Duration?
    public override val `in`: MutableList<pbandk.wkt.Duration>
    public override val notIn: MutableList<pbandk.wkt.Duration>
}

@pbandk.Export
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

    /**
     * The [MutableTimestampRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit): pbandk.testpb.TimestampRules

    @Deprecated("Use copy {} instead")
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
        public val defaultInstance: pbandk.testpb.TimestampRules by lazy { pbandk.testpb.TimestampRules {} }
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

@pbandk.Export
public sealed interface MutableTimestampRules : pbandk.testpb.TimestampRules, pbandk.MutableMessage {
    public override var required: Boolean?
    public override var const: pbandk.wkt.Timestamp?
    public override var lt: pbandk.wkt.Timestamp?
    public override var lte: pbandk.wkt.Timestamp?
    public override var gt: pbandk.wkt.Timestamp?
    public override var gte: pbandk.wkt.Timestamp?
    public override var ltNow: Boolean?
    public override var gtNow: Boolean?
    public override var within: pbandk.wkt.Duration?
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

@Deprecated("Use FieldRules { } instead")
public fun FieldRules(
    message: pbandk.testpb.MessageRules? = null,
    type: pbandk.testpb.FieldRules.Type<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FieldRules = pbandk.testpb.FieldRules {
    this.message = message
    this.type = type
    this.unknownFields += unknownFields
}

/**
 * The [MutableFieldRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun FieldRules(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit): pbandk.testpb.FieldRules = pbandk.testpb.MutableFieldRules_Impl(
    message = null,
    type = null,
    unknownFields = mutableMapOf()
).also(builderAction).toFieldRules()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldRules")
public fun FieldRules?.orDefault(): pbandk.testpb.FieldRules = this ?: pbandk.testpb.FieldRules.defaultInstance

private class FieldRules_Impl(
    override val message: pbandk.testpb.MessageRules?,
    override val type: pbandk.testpb.FieldRules.Type<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FieldRules, pbandk.GeneratedMessage<pbandk.testpb.FieldRules>() {
    override val descriptor get() = pbandk.testpb.FieldRules.descriptor

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

    override fun copy(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit) = pbandk.testpb.FieldRules {
        this.message = this@FieldRules_Impl.message
        this.type = this@FieldRules_Impl.type
        this.unknownFields += this@FieldRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: pbandk.testpb.MessageRules?,
        type: pbandk.testpb.FieldRules.Type<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FieldRules {
        this.message = message
        this.type = type
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFieldRules_Impl(
    override var message: pbandk.testpb.MessageRules?,
    override var type: pbandk.testpb.FieldRules.Type<*>?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFieldRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFieldRules>() {
    override val descriptor get() = pbandk.testpb.FieldRules.descriptor

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

    override fun copy(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: pbandk.testpb.MessageRules?,
        type: pbandk.testpb.FieldRules.Type<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFieldRules() = FieldRules_Impl(
        message = message,
        type = type,
        unknownFields = unknownFields.toMap()
    )
}

private fun FieldRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.FieldRules {
    if (other !is pbandk.testpb.FieldRules) return this

    return copy {
        message = message?.plus(other.message) ?: other.message
        when (other.type) {
            is FieldRules.Type.Float_ -> float = float?.plus(other.float) ?: other.float
            is FieldRules.Type.Double_ -> double = double?.plus(other.double) ?: other.double
            is FieldRules.Type.Int32 -> int32 = int32?.plus(other.int32) ?: other.int32
            is FieldRules.Type.Int64 -> int64 = int64?.plus(other.int64) ?: other.int64
            is FieldRules.Type.Uint32 -> uint32 = uint32?.plus(other.uint32) ?: other.uint32
            is FieldRules.Type.Uint64 -> uint64 = uint64?.plus(other.uint64) ?: other.uint64
            is FieldRules.Type.Sint32 -> sint32 = sint32?.plus(other.sint32) ?: other.sint32
            is FieldRules.Type.Sint64 -> sint64 = sint64?.plus(other.sint64) ?: other.sint64
            is FieldRules.Type.Fixed32 -> fixed32 = fixed32?.plus(other.fixed32) ?: other.fixed32
            is FieldRules.Type.Fixed64 -> fixed64 = fixed64?.plus(other.fixed64) ?: other.fixed64
            is FieldRules.Type.Sfixed32 -> sfixed32 = sfixed32?.plus(other.sfixed32) ?: other.sfixed32
            is FieldRules.Type.Sfixed64 -> sfixed64 = sfixed64?.plus(other.sfixed64) ?: other.sfixed64
            is FieldRules.Type.Bool -> bool = bool?.plus(other.bool) ?: other.bool
            is FieldRules.Type.String_ -> string = string?.plus(other.string) ?: other.string
            is FieldRules.Type.Bytes -> bytes = bytes?.plus(other.bytes) ?: other.bytes
            is FieldRules.Type.Enum -> enum = enum?.plus(other.enum) ?: other.enum
            is FieldRules.Type.Repeated -> repeated = repeated?.plus(other.repeated) ?: other.repeated
            is FieldRules.Type.Map_ -> map = map?.plus(other.map) ?: other.map
            is FieldRules.Type.Any -> any = any?.plus(other.any) ?: other.any
            is FieldRules.Type.Duration -> duration = duration?.plus(other.duration) ?: other.duration
            is FieldRules.Type.Timestamp -> timestamp = timestamp?.plus(other.timestamp) ?: other.timestamp
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FieldRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.FieldRules {
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
    return FieldRules_Impl(message, type, unknownFields)
}

@Deprecated("Use FloatRules { } instead")
public fun FloatRules(
    const: Float? = null,
    lt: Float? = null,
    lte: Float? = null,
    gt: Float? = null,
    gte: Float? = null,
    `in`: List<Float> = emptyList(),
    notIn: List<Float> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.FloatRules = pbandk.testpb.FloatRules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableFloatRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun FloatRules(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit): pbandk.testpb.FloatRules = pbandk.testpb.MutableFloatRules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFloatRules()

@pbandk.Export
@pbandk.JsName("orDefaultForFloatRules")
public fun FloatRules?.orDefault(): pbandk.testpb.FloatRules = this ?: pbandk.testpb.FloatRules.defaultInstance

private class FloatRules_Impl(
    override val const: Float?,
    override val lt: Float?,
    override val lte: Float?,
    override val gt: Float?,
    override val gte: Float?,
    override val `in`: List<Float>,
    override val notIn: List<Float>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FloatRules, pbandk.GeneratedMessage<pbandk.testpb.FloatRules>() {
    override val descriptor get() = pbandk.testpb.FloatRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit) = pbandk.testpb.FloatRules {
        this.const = this@FloatRules_Impl.const
        this.lt = this@FloatRules_Impl.lt
        this.lte = this@FloatRules_Impl.lte
        this.gt = this@FloatRules_Impl.gt
        this.gte = this@FloatRules_Impl.gte
        this.`in` += this@FloatRules_Impl.`in`
        this.notIn += this@FloatRules_Impl.notIn
        this.unknownFields += this@FloatRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Float?,
        lt: Float?,
        lte: Float?,
        gt: Float?,
        gte: Float?,
        `in`: List<Float>,
        notIn: List<Float>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.FloatRules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFloatRules_Impl(
    override var const: Float?,
    override var lt: Float?,
    override var lte: Float?,
    override var gt: Float?,
    override var gte: Float?,
    override val `in`: MutableList<Float>,
    override val notIn: MutableList<Float>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFloatRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFloatRules>() {
    override val descriptor get() = pbandk.testpb.FloatRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Float?,
        lt: Float?,
        lte: Float?,
        gt: Float?,
        gte: Float?,
        `in`: List<Float>,
        notIn: List<Float>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFloatRules() = FloatRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FloatRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.FloatRules {
    if (other !is pbandk.testpb.FloatRules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FloatRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.FloatRules {
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
    return FloatRules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use DoubleRules { } instead")
public fun DoubleRules(
    const: Double? = null,
    lt: Double? = null,
    lte: Double? = null,
    gt: Double? = null,
    gte: Double? = null,
    `in`: List<Double> = emptyList(),
    notIn: List<Double> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.DoubleRules = pbandk.testpb.DoubleRules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableDoubleRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun DoubleRules(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit): pbandk.testpb.DoubleRules = pbandk.testpb.MutableDoubleRules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toDoubleRules()

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleRules")
public fun DoubleRules?.orDefault(): pbandk.testpb.DoubleRules = this ?: pbandk.testpb.DoubleRules.defaultInstance

private class DoubleRules_Impl(
    override val const: Double?,
    override val lt: Double?,
    override val lte: Double?,
    override val gt: Double?,
    override val gte: Double?,
    override val `in`: List<Double>,
    override val notIn: List<Double>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.DoubleRules, pbandk.GeneratedMessage<pbandk.testpb.DoubleRules>() {
    override val descriptor get() = pbandk.testpb.DoubleRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit) = pbandk.testpb.DoubleRules {
        this.const = this@DoubleRules_Impl.const
        this.lt = this@DoubleRules_Impl.lt
        this.lte = this@DoubleRules_Impl.lte
        this.gt = this@DoubleRules_Impl.gt
        this.gte = this@DoubleRules_Impl.gte
        this.`in` += this@DoubleRules_Impl.`in`
        this.notIn += this@DoubleRules_Impl.notIn
        this.unknownFields += this@DoubleRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Double?,
        lt: Double?,
        lte: Double?,
        gt: Double?,
        gte: Double?,
        `in`: List<Double>,
        notIn: List<Double>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.DoubleRules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableDoubleRules_Impl(
    override var const: Double?,
    override var lt: Double?,
    override var lte: Double?,
    override var gt: Double?,
    override var gte: Double?,
    override val `in`: MutableList<Double>,
    override val notIn: MutableList<Double>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableDoubleRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableDoubleRules>() {
    override val descriptor get() = pbandk.testpb.DoubleRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Double?,
        lt: Double?,
        lte: Double?,
        gt: Double?,
        gte: Double?,
        `in`: List<Double>,
        notIn: List<Double>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toDoubleRules() = DoubleRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun DoubleRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.DoubleRules {
    if (other !is pbandk.testpb.DoubleRules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun DoubleRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.DoubleRules {
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
    return DoubleRules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use Int32Rules { } instead")
public fun Int32Rules(
    const: Int? = null,
    lt: Int? = null,
    lte: Int? = null,
    gt: Int? = null,
    gte: Int? = null,
    `in`: List<Int> = emptyList(),
    notIn: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Int32Rules = pbandk.testpb.Int32Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Int32Rules(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit): pbandk.testpb.Int32Rules = pbandk.testpb.MutableInt32Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toInt32Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForInt32Rules")
public fun Int32Rules?.orDefault(): pbandk.testpb.Int32Rules = this ?: pbandk.testpb.Int32Rules.defaultInstance

private class Int32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Int32Rules, pbandk.GeneratedMessage<pbandk.testpb.Int32Rules>() {
    override val descriptor get() = pbandk.testpb.Int32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit) = pbandk.testpb.Int32Rules {
        this.const = this@Int32Rules_Impl.const
        this.lt = this@Int32Rules_Impl.lt
        this.lte = this@Int32Rules_Impl.lte
        this.gt = this@Int32Rules_Impl.gt
        this.gte = this@Int32Rules_Impl.gte
        this.`in` += this@Int32Rules_Impl.`in`
        this.notIn += this@Int32Rules_Impl.notIn
        this.unknownFields += this@Int32Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Int32Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: MutableList<Int>,
    override val notIn: MutableList<Int>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableInt32Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableInt32Rules>() {
    override val descriptor get() = pbandk.testpb.Int32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toInt32Rules() = Int32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun Int32Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Int32Rules {
    if (other !is pbandk.testpb.Int32Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Int32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Int32Rules {
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
    return Int32Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use Int64Rules { } instead")
public fun Int64Rules(
    const: Long? = null,
    lt: Long? = null,
    lte: Long? = null,
    gt: Long? = null,
    gte: Long? = null,
    `in`: List<Long> = emptyList(),
    notIn: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Int64Rules = pbandk.testpb.Int64Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Int64Rules(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit): pbandk.testpb.Int64Rules = pbandk.testpb.MutableInt64Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toInt64Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForInt64Rules")
public fun Int64Rules?.orDefault(): pbandk.testpb.Int64Rules = this ?: pbandk.testpb.Int64Rules.defaultInstance

private class Int64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Int64Rules, pbandk.GeneratedMessage<pbandk.testpb.Int64Rules>() {
    override val descriptor get() = pbandk.testpb.Int64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit) = pbandk.testpb.Int64Rules {
        this.const = this@Int64Rules_Impl.const
        this.lt = this@Int64Rules_Impl.lt
        this.lte = this@Int64Rules_Impl.lte
        this.gt = this@Int64Rules_Impl.gt
        this.gte = this@Int64Rules_Impl.gte
        this.`in` += this@Int64Rules_Impl.`in`
        this.notIn += this@Int64Rules_Impl.notIn
        this.unknownFields += this@Int64Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Int64Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: MutableList<Long>,
    override val notIn: MutableList<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableInt64Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableInt64Rules>() {
    override val descriptor get() = pbandk.testpb.Int64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toInt64Rules() = Int64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun Int64Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Int64Rules {
    if (other !is pbandk.testpb.Int64Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Int64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Int64Rules {
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
    return Int64Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use UInt32Rules { } instead")
public fun UInt32Rules(
    const: Int? = null,
    lt: Int? = null,
    lte: Int? = null,
    gt: Int? = null,
    gte: Int? = null,
    `in`: List<Int> = emptyList(),
    notIn: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.UInt32Rules = pbandk.testpb.UInt32Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableUInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun UInt32Rules(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit): pbandk.testpb.UInt32Rules = pbandk.testpb.MutableUInt32Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toUInt32Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForUInt32Rules")
public fun UInt32Rules?.orDefault(): pbandk.testpb.UInt32Rules = this ?: pbandk.testpb.UInt32Rules.defaultInstance

private class UInt32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.UInt32Rules, pbandk.GeneratedMessage<pbandk.testpb.UInt32Rules>() {
    override val descriptor get() = pbandk.testpb.UInt32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit) = pbandk.testpb.UInt32Rules {
        this.const = this@UInt32Rules_Impl.const
        this.lt = this@UInt32Rules_Impl.lt
        this.lte = this@UInt32Rules_Impl.lte
        this.gt = this@UInt32Rules_Impl.gt
        this.gte = this@UInt32Rules_Impl.gte
        this.`in` += this@UInt32Rules_Impl.`in`
        this.notIn += this@UInt32Rules_Impl.notIn
        this.unknownFields += this@UInt32Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.UInt32Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableUInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: MutableList<Int>,
    override val notIn: MutableList<Int>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableUInt32Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableUInt32Rules>() {
    override val descriptor get() = pbandk.testpb.UInt32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toUInt32Rules() = UInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun UInt32Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.UInt32Rules {
    if (other !is pbandk.testpb.UInt32Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun UInt32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.UInt32Rules {
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
    return UInt32Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use UInt64Rules { } instead")
public fun UInt64Rules(
    const: Long? = null,
    lt: Long? = null,
    lte: Long? = null,
    gt: Long? = null,
    gte: Long? = null,
    `in`: List<Long> = emptyList(),
    notIn: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.UInt64Rules = pbandk.testpb.UInt64Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableUInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun UInt64Rules(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit): pbandk.testpb.UInt64Rules = pbandk.testpb.MutableUInt64Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toUInt64Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForUInt64Rules")
public fun UInt64Rules?.orDefault(): pbandk.testpb.UInt64Rules = this ?: pbandk.testpb.UInt64Rules.defaultInstance

private class UInt64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.UInt64Rules, pbandk.GeneratedMessage<pbandk.testpb.UInt64Rules>() {
    override val descriptor get() = pbandk.testpb.UInt64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit) = pbandk.testpb.UInt64Rules {
        this.const = this@UInt64Rules_Impl.const
        this.lt = this@UInt64Rules_Impl.lt
        this.lte = this@UInt64Rules_Impl.lte
        this.gt = this@UInt64Rules_Impl.gt
        this.gte = this@UInt64Rules_Impl.gte
        this.`in` += this@UInt64Rules_Impl.`in`
        this.notIn += this@UInt64Rules_Impl.notIn
        this.unknownFields += this@UInt64Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.UInt64Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableUInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: MutableList<Long>,
    override val notIn: MutableList<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableUInt64Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableUInt64Rules>() {
    override val descriptor get() = pbandk.testpb.UInt64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toUInt64Rules() = UInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun UInt64Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.UInt64Rules {
    if (other !is pbandk.testpb.UInt64Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun UInt64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.UInt64Rules {
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
    return UInt64Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use SInt32Rules { } instead")
public fun SInt32Rules(
    const: Int? = null,
    lt: Int? = null,
    lte: Int? = null,
    gt: Int? = null,
    gte: Int? = null,
    `in`: List<Int> = emptyList(),
    notIn: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SInt32Rules = pbandk.testpb.SInt32Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableSInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun SInt32Rules(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit): pbandk.testpb.SInt32Rules = pbandk.testpb.MutableSInt32Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toSInt32Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForSInt32Rules")
public fun SInt32Rules?.orDefault(): pbandk.testpb.SInt32Rules = this ?: pbandk.testpb.SInt32Rules.defaultInstance

private class SInt32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SInt32Rules, pbandk.GeneratedMessage<pbandk.testpb.SInt32Rules>() {
    override val descriptor get() = pbandk.testpb.SInt32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit) = pbandk.testpb.SInt32Rules {
        this.const = this@SInt32Rules_Impl.const
        this.lt = this@SInt32Rules_Impl.lt
        this.lte = this@SInt32Rules_Impl.lte
        this.gt = this@SInt32Rules_Impl.gt
        this.gte = this@SInt32Rules_Impl.gte
        this.`in` += this@SInt32Rules_Impl.`in`
        this.notIn += this@SInt32Rules_Impl.notIn
        this.unknownFields += this@SInt32Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SInt32Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: MutableList<Int>,
    override val notIn: MutableList<Int>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableSInt32Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableSInt32Rules>() {
    override val descriptor get() = pbandk.testpb.SInt32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSInt32Rules() = SInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun SInt32Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.SInt32Rules {
    if (other !is pbandk.testpb.SInt32Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SInt32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.SInt32Rules {
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
    return SInt32Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use SInt64Rules { } instead")
public fun SInt64Rules(
    const: Long? = null,
    lt: Long? = null,
    lte: Long? = null,
    gt: Long? = null,
    gte: Long? = null,
    `in`: List<Long> = emptyList(),
    notIn: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SInt64Rules = pbandk.testpb.SInt64Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableSInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun SInt64Rules(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit): pbandk.testpb.SInt64Rules = pbandk.testpb.MutableSInt64Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toSInt64Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForSInt64Rules")
public fun SInt64Rules?.orDefault(): pbandk.testpb.SInt64Rules = this ?: pbandk.testpb.SInt64Rules.defaultInstance

private class SInt64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SInt64Rules, pbandk.GeneratedMessage<pbandk.testpb.SInt64Rules>() {
    override val descriptor get() = pbandk.testpb.SInt64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit) = pbandk.testpb.SInt64Rules {
        this.const = this@SInt64Rules_Impl.const
        this.lt = this@SInt64Rules_Impl.lt
        this.lte = this@SInt64Rules_Impl.lte
        this.gt = this@SInt64Rules_Impl.gt
        this.gte = this@SInt64Rules_Impl.gte
        this.`in` += this@SInt64Rules_Impl.`in`
        this.notIn += this@SInt64Rules_Impl.notIn
        this.unknownFields += this@SInt64Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SInt64Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: MutableList<Long>,
    override val notIn: MutableList<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableSInt64Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableSInt64Rules>() {
    override val descriptor get() = pbandk.testpb.SInt64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSInt64Rules() = SInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun SInt64Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.SInt64Rules {
    if (other !is pbandk.testpb.SInt64Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SInt64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.SInt64Rules {
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
    return SInt64Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use Fixed32Rules { } instead")
public fun Fixed32Rules(
    const: Int? = null,
    lt: Int? = null,
    lte: Int? = null,
    gt: Int? = null,
    gte: Int? = null,
    `in`: List<Int> = emptyList(),
    notIn: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Fixed32Rules = pbandk.testpb.Fixed32Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableFixed32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Fixed32Rules(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit): pbandk.testpb.Fixed32Rules = pbandk.testpb.MutableFixed32Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFixed32Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForFixed32Rules")
public fun Fixed32Rules?.orDefault(): pbandk.testpb.Fixed32Rules = this ?: pbandk.testpb.Fixed32Rules.defaultInstance

private class Fixed32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Fixed32Rules, pbandk.GeneratedMessage<pbandk.testpb.Fixed32Rules>() {
    override val descriptor get() = pbandk.testpb.Fixed32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit) = pbandk.testpb.Fixed32Rules {
        this.const = this@Fixed32Rules_Impl.const
        this.lt = this@Fixed32Rules_Impl.lt
        this.lte = this@Fixed32Rules_Impl.lte
        this.gt = this@Fixed32Rules_Impl.gt
        this.gte = this@Fixed32Rules_Impl.gte
        this.`in` += this@Fixed32Rules_Impl.`in`
        this.notIn += this@Fixed32Rules_Impl.notIn
        this.unknownFields += this@Fixed32Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Fixed32Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFixed32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: MutableList<Int>,
    override val notIn: MutableList<Int>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFixed32Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFixed32Rules>() {
    override val descriptor get() = pbandk.testpb.Fixed32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFixed32Rules() = Fixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun Fixed32Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Fixed32Rules {
    if (other !is pbandk.testpb.Fixed32Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Fixed32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Fixed32Rules {
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
    return Fixed32Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use Fixed64Rules { } instead")
public fun Fixed64Rules(
    const: Long? = null,
    lt: Long? = null,
    lte: Long? = null,
    gt: Long? = null,
    gte: Long? = null,
    `in`: List<Long> = emptyList(),
    notIn: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Fixed64Rules = pbandk.testpb.Fixed64Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableFixed64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Fixed64Rules(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit): pbandk.testpb.Fixed64Rules = pbandk.testpb.MutableFixed64Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFixed64Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForFixed64Rules")
public fun Fixed64Rules?.orDefault(): pbandk.testpb.Fixed64Rules = this ?: pbandk.testpb.Fixed64Rules.defaultInstance

private class Fixed64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Fixed64Rules, pbandk.GeneratedMessage<pbandk.testpb.Fixed64Rules>() {
    override val descriptor get() = pbandk.testpb.Fixed64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit) = pbandk.testpb.Fixed64Rules {
        this.const = this@Fixed64Rules_Impl.const
        this.lt = this@Fixed64Rules_Impl.lt
        this.lte = this@Fixed64Rules_Impl.lte
        this.gt = this@Fixed64Rules_Impl.gt
        this.gte = this@Fixed64Rules_Impl.gte
        this.`in` += this@Fixed64Rules_Impl.`in`
        this.notIn += this@Fixed64Rules_Impl.notIn
        this.unknownFields += this@Fixed64Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Fixed64Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFixed64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: MutableList<Long>,
    override val notIn: MutableList<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableFixed64Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableFixed64Rules>() {
    override val descriptor get() = pbandk.testpb.Fixed64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFixed64Rules() = Fixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun Fixed64Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Fixed64Rules {
    if (other !is pbandk.testpb.Fixed64Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Fixed64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Fixed64Rules {
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
    return Fixed64Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use SFixed32Rules { } instead")
public fun SFixed32Rules(
    const: Int? = null,
    lt: Int? = null,
    lte: Int? = null,
    gt: Int? = null,
    gte: Int? = null,
    `in`: List<Int> = emptyList(),
    notIn: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SFixed32Rules = pbandk.testpb.SFixed32Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableSFixed32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun SFixed32Rules(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit): pbandk.testpb.SFixed32Rules = pbandk.testpb.MutableSFixed32Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toSFixed32Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForSFixed32Rules")
public fun SFixed32Rules?.orDefault(): pbandk.testpb.SFixed32Rules = this ?: pbandk.testpb.SFixed32Rules.defaultInstance

private class SFixed32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SFixed32Rules, pbandk.GeneratedMessage<pbandk.testpb.SFixed32Rules>() {
    override val descriptor get() = pbandk.testpb.SFixed32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit) = pbandk.testpb.SFixed32Rules {
        this.const = this@SFixed32Rules_Impl.const
        this.lt = this@SFixed32Rules_Impl.lt
        this.lte = this@SFixed32Rules_Impl.lte
        this.gt = this@SFixed32Rules_Impl.gt
        this.gte = this@SFixed32Rules_Impl.gte
        this.`in` += this@SFixed32Rules_Impl.`in`
        this.notIn += this@SFixed32Rules_Impl.notIn
        this.unknownFields += this@SFixed32Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SFixed32Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSFixed32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: MutableList<Int>,
    override val notIn: MutableList<Int>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableSFixed32Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableSFixed32Rules>() {
    override val descriptor get() = pbandk.testpb.SFixed32Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        lt: Int?,
        lte: Int?,
        gt: Int?,
        gte: Int?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSFixed32Rules() = SFixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun SFixed32Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.SFixed32Rules {
    if (other !is pbandk.testpb.SFixed32Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SFixed32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.SFixed32Rules {
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
    return SFixed32Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use SFixed64Rules { } instead")
public fun SFixed64Rules(
    const: Long? = null,
    lt: Long? = null,
    lte: Long? = null,
    gt: Long? = null,
    gte: Long? = null,
    `in`: List<Long> = emptyList(),
    notIn: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SFixed64Rules = pbandk.testpb.SFixed64Rules {
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableSFixed64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun SFixed64Rules(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit): pbandk.testpb.SFixed64Rules = pbandk.testpb.MutableSFixed64Rules_Impl(
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toSFixed64Rules()

@pbandk.Export
@pbandk.JsName("orDefaultForSFixed64Rules")
public fun SFixed64Rules?.orDefault(): pbandk.testpb.SFixed64Rules = this ?: pbandk.testpb.SFixed64Rules.defaultInstance

private class SFixed64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SFixed64Rules, pbandk.GeneratedMessage<pbandk.testpb.SFixed64Rules>() {
    override val descriptor get() = pbandk.testpb.SFixed64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit) = pbandk.testpb.SFixed64Rules {
        this.const = this@SFixed64Rules_Impl.const
        this.lt = this@SFixed64Rules_Impl.lt
        this.lte = this@SFixed64Rules_Impl.lte
        this.gt = this@SFixed64Rules_Impl.gt
        this.gte = this@SFixed64Rules_Impl.gte
        this.`in` += this@SFixed64Rules_Impl.`in`
        this.notIn += this@SFixed64Rules_Impl.notIn
        this.unknownFields += this@SFixed64Rules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SFixed64Rules {
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSFixed64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: MutableList<Long>,
    override val notIn: MutableList<Long>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableSFixed64Rules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableSFixed64Rules>() {
    override val descriptor get() = pbandk.testpb.SFixed64Rules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Long?,
        lt: Long?,
        lte: Long?,
        gt: Long?,
        gte: Long?,
        `in`: List<Long>,
        notIn: List<Long>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSFixed64Rules() = SFixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun SFixed64Rules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.SFixed64Rules {
    if (other !is pbandk.testpb.SFixed64Rules) return this

    return copy {
        const = other.const ?: const
        lt = other.lt ?: lt
        lte = other.lte ?: lte
        gt = other.gt ?: gt
        gte = other.gte ?: gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SFixed64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.SFixed64Rules {
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
    return SFixed64Rules_Impl(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use BoolRules { } instead")
public fun BoolRules(
    const: Boolean? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.BoolRules = pbandk.testpb.BoolRules {
    this.const = const
    this.unknownFields += unknownFields
}

/**
 * The [MutableBoolRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun BoolRules(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit): pbandk.testpb.BoolRules = pbandk.testpb.MutableBoolRules_Impl(
    const = null,
    unknownFields = mutableMapOf()
).also(builderAction).toBoolRules()

@pbandk.Export
@pbandk.JsName("orDefaultForBoolRules")
public fun BoolRules?.orDefault(): pbandk.testpb.BoolRules = this ?: pbandk.testpb.BoolRules.defaultInstance

private class BoolRules_Impl(
    override val const: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.BoolRules, pbandk.GeneratedMessage<pbandk.testpb.BoolRules>() {
    override val descriptor get() = pbandk.testpb.BoolRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit) = pbandk.testpb.BoolRules {
        this.const = this@BoolRules_Impl.const
        this.unknownFields += this@BoolRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.BoolRules {
        this.const = const
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableBoolRules_Impl(
    override var const: Boolean?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableBoolRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableBoolRules>() {
    override val descriptor get() = pbandk.testpb.BoolRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toBoolRules() = BoolRules_Impl(
        const = const,
        unknownFields = unknownFields.toMap()
    )
}

private fun BoolRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.BoolRules {
    if (other !is pbandk.testpb.BoolRules) return this

    return copy {
        const = other.const ?: const
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun BoolRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.BoolRules {
    var const: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Boolean
        }
    }
    return BoolRules_Impl(const, unknownFields)
}

@Deprecated("Use StringRules { } instead")
public fun StringRules(
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
): pbandk.testpb.StringRules = pbandk.testpb.StringRules {
    this.const = const
    this.len = len
    this.minLen = minLen
    this.maxLen = maxLen
    this.lenBytes = lenBytes
    this.minBytes = minBytes
    this.maxBytes = maxBytes
    this.pattern = pattern
    this.prefix = prefix
    this.suffix = suffix
    this.contains = contains
    this.notContains = notContains
    this.`in` += `in`
    this.notIn += notIn
    this.strict = strict
    this.wellKnown = wellKnown
    this.unknownFields += unknownFields
}

/**
 * The [MutableStringRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun StringRules(builderAction: pbandk.testpb.MutableStringRules.() -> Unit): pbandk.testpb.StringRules = pbandk.testpb.MutableStringRules_Impl(
    const = null,
    len = null,
    minLen = null,
    maxLen = null,
    lenBytes = null,
    minBytes = null,
    maxBytes = null,
    pattern = null,
    prefix = null,
    suffix = null,
    contains = null,
    notContains = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    strict = null,
    wellKnown = null,
    unknownFields = mutableMapOf()
).also(builderAction).toStringRules()

@pbandk.Export
@pbandk.JsName("orDefaultForStringRules")
public fun StringRules?.orDefault(): pbandk.testpb.StringRules = this ?: pbandk.testpb.StringRules.defaultInstance

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
) : pbandk.testpb.StringRules, pbandk.GeneratedMessage<pbandk.testpb.StringRules>() {
    override val descriptor get() = pbandk.testpb.StringRules.descriptor

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

    override fun copy(builderAction: pbandk.testpb.MutableStringRules.() -> Unit) = pbandk.testpb.StringRules {
        this.const = this@StringRules_Impl.const
        this.len = this@StringRules_Impl.len
        this.minLen = this@StringRules_Impl.minLen
        this.maxLen = this@StringRules_Impl.maxLen
        this.lenBytes = this@StringRules_Impl.lenBytes
        this.minBytes = this@StringRules_Impl.minBytes
        this.maxBytes = this@StringRules_Impl.maxBytes
        this.pattern = this@StringRules_Impl.pattern
        this.prefix = this@StringRules_Impl.prefix
        this.suffix = this@StringRules_Impl.suffix
        this.contains = this@StringRules_Impl.contains
        this.notContains = this@StringRules_Impl.notContains
        this.`in` += this@StringRules_Impl.`in`
        this.notIn += this@StringRules_Impl.notIn
        this.strict = this@StringRules_Impl.strict
        this.wellKnown = this@StringRules_Impl.wellKnown
        this.unknownFields += this@StringRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
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
    ) = pbandk.testpb.StringRules {
        this.const = const
        this.len = len
        this.minLen = minLen
        this.maxLen = maxLen
        this.lenBytes = lenBytes
        this.minBytes = minBytes
        this.maxBytes = maxBytes
        this.pattern = pattern
        this.prefix = prefix
        this.suffix = suffix
        this.contains = contains
        this.notContains = notContains
        this.`in` += `in`
        this.notIn += notIn
        this.strict = strict
        this.wellKnown = wellKnown
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
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
    override val `in`: MutableList<String>,
    override val notIn: MutableList<String>,
    override var strict: Boolean?,
    override var wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableStringRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableStringRules>() {
    override val descriptor get() = pbandk.testpb.StringRules.descriptor

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

    override fun copy(builderAction: pbandk.testpb.MutableStringRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
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
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toStringRules() = StringRules_Impl(
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
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        strict = strict,
        wellKnown = wellKnown,
        unknownFields = unknownFields.toMap()
    )
}

private fun StringRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.StringRules {
    if (other !is pbandk.testpb.StringRules) return this

    return copy {
        const = other.const ?: const
        len = other.len ?: len
        minLen = other.minLen ?: minLen
        maxLen = other.maxLen ?: maxLen
        lenBytes = other.lenBytes ?: lenBytes
        minBytes = other.minBytes ?: minBytes
        maxBytes = other.maxBytes ?: maxBytes
        pattern = other.pattern ?: pattern
        prefix = other.prefix ?: prefix
        suffix = other.suffix ?: suffix
        contains = other.contains ?: contains
        notContains = other.notContains ?: notContains
        `in` += other.`in`
        notIn += other.notIn
        strict = other.strict ?: strict
        when (other.wellKnown) {
            is StringRules.WellKnown.Email -> email = other.email
            is StringRules.WellKnown.Hostname -> hostname = other.hostname
            is StringRules.WellKnown.Ip -> ip = other.ip
            is StringRules.WellKnown.Ipv4 -> ipv4 = other.ipv4
            is StringRules.WellKnown.Ipv6 -> ipv6 = other.ipv6
            is StringRules.WellKnown.Uri -> uri = other.uri
            is StringRules.WellKnown.UriRef -> uriRef = other.uriRef
            is StringRules.WellKnown.Address -> address = other.address
            is StringRules.WellKnown.Uuid -> uuid = other.uuid
            is StringRules.WellKnown.WellKnownRegex -> wellKnownRegex = other.wellKnownRegex
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun StringRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.StringRules {
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
    return StringRules_Impl(const, len, minLen, maxLen,
        lenBytes, minBytes, maxBytes, pattern,
        prefix, suffix, contains, notContains,
        pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), strict, wellKnown, unknownFields)
}

@Deprecated("Use BytesRules { } instead")
public fun BytesRules(
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
): pbandk.testpb.BytesRules = pbandk.testpb.BytesRules {
    this.const = const
    this.len = len
    this.minLen = minLen
    this.maxLen = maxLen
    this.pattern = pattern
    this.prefix = prefix
    this.suffix = suffix
    this.contains = contains
    this.`in` += `in`
    this.notIn += notIn
    this.wellKnown = wellKnown
    this.unknownFields += unknownFields
}

/**
 * The [MutableBytesRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun BytesRules(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit): pbandk.testpb.BytesRules = pbandk.testpb.MutableBytesRules_Impl(
    const = null,
    len = null,
    minLen = null,
    maxLen = null,
    pattern = null,
    prefix = null,
    suffix = null,
    contains = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    wellKnown = null,
    unknownFields = mutableMapOf()
).also(builderAction).toBytesRules()

@pbandk.Export
@pbandk.JsName("orDefaultForBytesRules")
public fun BytesRules?.orDefault(): pbandk.testpb.BytesRules = this ?: pbandk.testpb.BytesRules.defaultInstance

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
) : pbandk.testpb.BytesRules, pbandk.GeneratedMessage<pbandk.testpb.BytesRules>() {
    override val descriptor get() = pbandk.testpb.BytesRules.descriptor

    override val ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ip)?.value
    override val ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv4)?.value
    override val ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv6)?.value

    override fun copy(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit) = pbandk.testpb.BytesRules {
        this.const = this@BytesRules_Impl.const
        this.len = this@BytesRules_Impl.len
        this.minLen = this@BytesRules_Impl.minLen
        this.maxLen = this@BytesRules_Impl.maxLen
        this.pattern = this@BytesRules_Impl.pattern
        this.prefix = this@BytesRules_Impl.prefix
        this.suffix = this@BytesRules_Impl.suffix
        this.contains = this@BytesRules_Impl.contains
        this.`in` += this@BytesRules_Impl.`in`
        this.notIn += this@BytesRules_Impl.notIn
        this.wellKnown = this@BytesRules_Impl.wellKnown
        this.unknownFields += this@BytesRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
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
    ) = pbandk.testpb.BytesRules {
        this.const = const
        this.len = len
        this.minLen = minLen
        this.maxLen = maxLen
        this.pattern = pattern
        this.prefix = prefix
        this.suffix = suffix
        this.contains = contains
        this.`in` += `in`
        this.notIn += notIn
        this.wellKnown = wellKnown
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
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
    override val `in`: MutableList<pbandk.ByteArr>,
    override val notIn: MutableList<pbandk.ByteArr>,
    override var wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableBytesRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableBytesRules>() {
    override val descriptor get() = pbandk.testpb.BytesRules.descriptor

    override var ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ip)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.BytesRules.WellKnown.Ip(it) } }
    override var ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv4)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.BytesRules.WellKnown.Ipv4(it) } }
    override var ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv6)?.value
        set(value) { wellKnown = value?.let { pbandk.testpb.BytesRules.WellKnown.Ipv6(it) } }

    override fun copy(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
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
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toBytesRules() = BytesRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        wellKnown = wellKnown,
        unknownFields = unknownFields.toMap()
    )
}

private fun BytesRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.BytesRules {
    if (other !is pbandk.testpb.BytesRules) return this

    return copy {
        const = other.const ?: const
        len = other.len ?: len
        minLen = other.minLen ?: minLen
        maxLen = other.maxLen ?: maxLen
        pattern = other.pattern ?: pattern
        prefix = other.prefix ?: prefix
        suffix = other.suffix ?: suffix
        contains = other.contains ?: contains
        `in` += other.`in`
        notIn += other.notIn
        when (other.wellKnown) {
            is BytesRules.WellKnown.Ip -> ip = other.ip
            is BytesRules.WellKnown.Ipv4 -> ipv4 = other.ipv4
            is BytesRules.WellKnown.Ipv6 -> ipv6 = other.ipv6
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun BytesRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.BytesRules {
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
    return BytesRules_Impl(const, len, minLen, maxLen,
        pattern, prefix, suffix, contains,
        pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), wellKnown, unknownFields)
}

@Deprecated("Use EnumRules { } instead")
public fun EnumRules(
    const: Int? = null,
    definedOnly: Boolean? = null,
    `in`: List<Int> = emptyList(),
    notIn: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.EnumRules = pbandk.testpb.EnumRules {
    this.const = const
    this.definedOnly = definedOnly
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun EnumRules(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit): pbandk.testpb.EnumRules = pbandk.testpb.MutableEnumRules_Impl(
    const = null,
    definedOnly = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toEnumRules()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumRules")
public fun EnumRules?.orDefault(): pbandk.testpb.EnumRules = this ?: pbandk.testpb.EnumRules.defaultInstance

private class EnumRules_Impl(
    override val const: Int?,
    override val definedOnly: Boolean?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.EnumRules, pbandk.GeneratedMessage<pbandk.testpb.EnumRules>() {
    override val descriptor get() = pbandk.testpb.EnumRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit) = pbandk.testpb.EnumRules {
        this.const = this@EnumRules_Impl.const
        this.definedOnly = this@EnumRules_Impl.definedOnly
        this.`in` += this@EnumRules_Impl.`in`
        this.notIn += this@EnumRules_Impl.notIn
        this.unknownFields += this@EnumRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        definedOnly: Boolean?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.EnumRules {
        this.const = const
        this.definedOnly = definedOnly
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableEnumRules_Impl(
    override var const: Int?,
    override var definedOnly: Boolean?,
    override val `in`: MutableList<Int>,
    override val notIn: MutableList<Int>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableEnumRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableEnumRules>() {
    override val descriptor get() = pbandk.testpb.EnumRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        definedOnly: Boolean?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEnumRules() = EnumRules_Impl(
        const = const,
        definedOnly = definedOnly,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun EnumRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.EnumRules {
    if (other !is pbandk.testpb.EnumRules) return this

    return copy {
        const = other.const ?: const
        definedOnly = other.definedOnly ?: definedOnly
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.EnumRules {
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
    return EnumRules_Impl(const, definedOnly, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use MessageRules { } instead")
public fun MessageRules(
    skip: Boolean? = null,
    required: Boolean? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MessageRules = pbandk.testpb.MessageRules {
    this.skip = skip
    this.required = required
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun MessageRules(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit): pbandk.testpb.MessageRules = pbandk.testpb.MutableMessageRules_Impl(
    skip = null,
    required = null,
    unknownFields = mutableMapOf()
).also(builderAction).toMessageRules()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageRules")
public fun MessageRules?.orDefault(): pbandk.testpb.MessageRules = this ?: pbandk.testpb.MessageRules.defaultInstance

private class MessageRules_Impl(
    override val skip: Boolean?,
    override val required: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageRules, pbandk.GeneratedMessage<pbandk.testpb.MessageRules>() {
    override val descriptor get() = pbandk.testpb.MessageRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit) = pbandk.testpb.MessageRules {
        this.skip = this@MessageRules_Impl.skip
        this.required = this@MessageRules_Impl.required
        this.unknownFields += this@MessageRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        skip: Boolean?,
        required: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MessageRules {
        this.skip = skip
        this.required = required
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMessageRules_Impl(
    override var skip: Boolean?,
    override var required: Boolean?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMessageRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableMessageRules>() {
    override val descriptor get() = pbandk.testpb.MessageRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        skip: Boolean?,
        required: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMessageRules() = MessageRules_Impl(
        skip = skip,
        required = required,
        unknownFields = unknownFields.toMap()
    )
}

private fun MessageRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MessageRules {
    if (other !is pbandk.testpb.MessageRules) return this

    return copy {
        skip = other.skip ?: skip
        required = other.required ?: required
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MessageRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.MessageRules {
    var skip: Boolean? = null
    var required: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> skip = _fieldValue as Boolean
            2 -> required = _fieldValue as Boolean
        }
    }
    return MessageRules_Impl(skip, required, unknownFields)
}

@Deprecated("Use RepeatedRules { } instead")
public fun RepeatedRules(
    minItems: Long? = null,
    maxItems: Long? = null,
    unique: Boolean? = null,
    items: pbandk.testpb.FieldRules? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.RepeatedRules = pbandk.testpb.RepeatedRules {
    this.minItems = minItems
    this.maxItems = maxItems
    this.unique = unique
    this.items = items
    this.unknownFields += unknownFields
}

/**
 * The [MutableRepeatedRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun RepeatedRules(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit): pbandk.testpb.RepeatedRules = pbandk.testpb.MutableRepeatedRules_Impl(
    minItems = null,
    maxItems = null,
    unique = null,
    items = null,
    unknownFields = mutableMapOf()
).also(builderAction).toRepeatedRules()

@pbandk.Export
@pbandk.JsName("orDefaultForRepeatedRules")
public fun RepeatedRules?.orDefault(): pbandk.testpb.RepeatedRules = this ?: pbandk.testpb.RepeatedRules.defaultInstance

private class RepeatedRules_Impl(
    override val minItems: Long?,
    override val maxItems: Long?,
    override val unique: Boolean?,
    override val items: pbandk.testpb.FieldRules?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.RepeatedRules, pbandk.GeneratedMessage<pbandk.testpb.RepeatedRules>() {
    override val descriptor get() = pbandk.testpb.RepeatedRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit) = pbandk.testpb.RepeatedRules {
        this.minItems = this@RepeatedRules_Impl.minItems
        this.maxItems = this@RepeatedRules_Impl.maxItems
        this.unique = this@RepeatedRules_Impl.unique
        this.items = this@RepeatedRules_Impl.items
        this.unknownFields += this@RepeatedRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        minItems: Long?,
        maxItems: Long?,
        unique: Boolean?,
        items: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.RepeatedRules {
        this.minItems = minItems
        this.maxItems = maxItems
        this.unique = unique
        this.items = items
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableRepeatedRules_Impl(
    override var minItems: Long?,
    override var maxItems: Long?,
    override var unique: Boolean?,
    override var items: pbandk.testpb.FieldRules?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableRepeatedRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableRepeatedRules>() {
    override val descriptor get() = pbandk.testpb.RepeatedRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        minItems: Long?,
        maxItems: Long?,
        unique: Boolean?,
        items: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toRepeatedRules() = RepeatedRules_Impl(
        minItems = minItems,
        maxItems = maxItems,
        unique = unique,
        items = items,
        unknownFields = unknownFields.toMap()
    )
}

private fun RepeatedRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.RepeatedRules {
    if (other !is pbandk.testpb.RepeatedRules) return this

    return copy {
        minItems = other.minItems ?: minItems
        maxItems = other.maxItems ?: maxItems
        unique = other.unique ?: unique
        items = items?.plus(other.items) ?: other.items
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun RepeatedRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.RepeatedRules {
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
    return RepeatedRules_Impl(minItems, maxItems, unique, items, unknownFields)
}

@Deprecated("Use MapRules { } instead")
public fun MapRules(
    minPairs: Long? = null,
    maxPairs: Long? = null,
    noSparse: Boolean? = null,
    keys: pbandk.testpb.FieldRules? = null,
    values: pbandk.testpb.FieldRules? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MapRules = pbandk.testpb.MapRules {
    this.minPairs = minPairs
    this.maxPairs = maxPairs
    this.noSparse = noSparse
    this.keys = keys
    this.values = values
    this.unknownFields += unknownFields
}

/**
 * The [MutableMapRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun MapRules(builderAction: pbandk.testpb.MutableMapRules.() -> Unit): pbandk.testpb.MapRules = pbandk.testpb.MutableMapRules_Impl(
    minPairs = null,
    maxPairs = null,
    noSparse = null,
    keys = null,
    values = null,
    unknownFields = mutableMapOf()
).also(builderAction).toMapRules()

@pbandk.Export
@pbandk.JsName("orDefaultForMapRules")
public fun MapRules?.orDefault(): pbandk.testpb.MapRules = this ?: pbandk.testpb.MapRules.defaultInstance

private class MapRules_Impl(
    override val minPairs: Long?,
    override val maxPairs: Long?,
    override val noSparse: Boolean?,
    override val keys: pbandk.testpb.FieldRules?,
    override val values: pbandk.testpb.FieldRules?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MapRules, pbandk.GeneratedMessage<pbandk.testpb.MapRules>() {
    override val descriptor get() = pbandk.testpb.MapRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMapRules.() -> Unit) = pbandk.testpb.MapRules {
        this.minPairs = this@MapRules_Impl.minPairs
        this.maxPairs = this@MapRules_Impl.maxPairs
        this.noSparse = this@MapRules_Impl.noSparse
        this.keys = this@MapRules_Impl.keys
        this.values = this@MapRules_Impl.values
        this.unknownFields += this@MapRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        minPairs: Long?,
        maxPairs: Long?,
        noSparse: Boolean?,
        keys: pbandk.testpb.FieldRules?,
        values: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MapRules {
        this.minPairs = minPairs
        this.maxPairs = maxPairs
        this.noSparse = noSparse
        this.keys = keys
        this.values = values
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMapRules_Impl(
    override var minPairs: Long?,
    override var maxPairs: Long?,
    override var noSparse: Boolean?,
    override var keys: pbandk.testpb.FieldRules?,
    override var values: pbandk.testpb.FieldRules?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMapRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableMapRules>() {
    override val descriptor get() = pbandk.testpb.MapRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMapRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        minPairs: Long?,
        maxPairs: Long?,
        noSparse: Boolean?,
        keys: pbandk.testpb.FieldRules?,
        values: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMapRules() = MapRules_Impl(
        minPairs = minPairs,
        maxPairs = maxPairs,
        noSparse = noSparse,
        keys = keys,
        values = values,
        unknownFields = unknownFields.toMap()
    )
}

private fun MapRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MapRules {
    if (other !is pbandk.testpb.MapRules) return this

    return copy {
        minPairs = other.minPairs ?: minPairs
        maxPairs = other.maxPairs ?: maxPairs
        noSparse = other.noSparse ?: noSparse
        keys = keys?.plus(other.keys) ?: other.keys
        values = values?.plus(other.values) ?: other.values
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MapRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.MapRules {
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
    return MapRules_Impl(minPairs, maxPairs, noSparse, keys,
        values, unknownFields)
}

@Deprecated("Use AnyRules { } instead")
public fun AnyRules(
    required: Boolean? = null,
    `in`: List<String> = emptyList(),
    notIn: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.AnyRules = pbandk.testpb.AnyRules {
    this.required = required
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableAnyRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun AnyRules(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit): pbandk.testpb.AnyRules = pbandk.testpb.MutableAnyRules_Impl(
    required = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toAnyRules()

@pbandk.Export
@pbandk.JsName("orDefaultForAnyRules")
public fun AnyRules?.orDefault(): pbandk.testpb.AnyRules = this ?: pbandk.testpb.AnyRules.defaultInstance

private class AnyRules_Impl(
    override val required: Boolean?,
    override val `in`: List<String>,
    override val notIn: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.AnyRules, pbandk.GeneratedMessage<pbandk.testpb.AnyRules>() {
    override val descriptor get() = pbandk.testpb.AnyRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit) = pbandk.testpb.AnyRules {
        this.required = this@AnyRules_Impl.required
        this.`in` += this@AnyRules_Impl.`in`
        this.notIn += this@AnyRules_Impl.notIn
        this.unknownFields += this@AnyRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        required: Boolean?,
        `in`: List<String>,
        notIn: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.AnyRules {
        this.required = required
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableAnyRules_Impl(
    override var required: Boolean?,
    override val `in`: MutableList<String>,
    override val notIn: MutableList<String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableAnyRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableAnyRules>() {
    override val descriptor get() = pbandk.testpb.AnyRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        required: Boolean?,
        `in`: List<String>,
        notIn: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toAnyRules() = AnyRules_Impl(
        required = required,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun AnyRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.AnyRules {
    if (other !is pbandk.testpb.AnyRules) return this

    return copy {
        required = other.required ?: required
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun AnyRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.AnyRules {
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
    return AnyRules_Impl(required, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use DurationRules { } instead")
public fun DurationRules(
    required: Boolean? = null,
    const: pbandk.wkt.Duration? = null,
    lt: pbandk.wkt.Duration? = null,
    lte: pbandk.wkt.Duration? = null,
    gt: pbandk.wkt.Duration? = null,
    gte: pbandk.wkt.Duration? = null,
    `in`: List<pbandk.wkt.Duration> = emptyList(),
    notIn: List<pbandk.wkt.Duration> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.DurationRules = pbandk.testpb.DurationRules {
    this.required = required
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.`in` += `in`
    this.notIn += notIn
    this.unknownFields += unknownFields
}

/**
 * The [MutableDurationRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun DurationRules(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit): pbandk.testpb.DurationRules = pbandk.testpb.MutableDurationRules_Impl(
    required = null,
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    `in` = mutableListOf(),
    notIn = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toDurationRules()

@pbandk.Export
@pbandk.JsName("orDefaultForDurationRules")
public fun DurationRules?.orDefault(): pbandk.testpb.DurationRules = this ?: pbandk.testpb.DurationRules.defaultInstance

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
) : pbandk.testpb.DurationRules, pbandk.GeneratedMessage<pbandk.testpb.DurationRules>() {
    override val descriptor get() = pbandk.testpb.DurationRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit) = pbandk.testpb.DurationRules {
        this.required = this@DurationRules_Impl.required
        this.const = this@DurationRules_Impl.const
        this.lt = this@DurationRules_Impl.lt
        this.lte = this@DurationRules_Impl.lte
        this.gt = this@DurationRules_Impl.gt
        this.gte = this@DurationRules_Impl.gte
        this.`in` += this@DurationRules_Impl.`in`
        this.notIn += this@DurationRules_Impl.notIn
        this.unknownFields += this@DurationRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
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
    ) = pbandk.testpb.DurationRules {
        this.required = required
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.`in` += `in`
        this.notIn += notIn
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableDurationRules_Impl(
    override var required: Boolean?,
    override var const: pbandk.wkt.Duration?,
    override var lt: pbandk.wkt.Duration?,
    override var lte: pbandk.wkt.Duration?,
    override var gt: pbandk.wkt.Duration?,
    override var gte: pbandk.wkt.Duration?,
    override val `in`: MutableList<pbandk.wkt.Duration>,
    override val notIn: MutableList<pbandk.wkt.Duration>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableDurationRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableDurationRules>() {
    override val descriptor get() = pbandk.testpb.DurationRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
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
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toDurationRules() = DurationRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toList(),
        notIn = notIn.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun DurationRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.DurationRules {
    if (other !is pbandk.testpb.DurationRules) return this

    return copy {
        required = other.required ?: required
        const = const?.plus(other.const) ?: other.const
        lt = lt?.plus(other.lt) ?: other.lt
        lte = lte?.plus(other.lte) ?: other.lte
        gt = gt?.plus(other.gt) ?: other.gt
        gte = gte?.plus(other.gte) ?: other.gte
        `in` += other.`in`
        notIn += other.notIn
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun DurationRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.DurationRules {
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
    return DurationRules_Impl(required, const, lt, lte,
        gt, gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

@Deprecated("Use TimestampRules { } instead")
public fun TimestampRules(
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
): pbandk.testpb.TimestampRules = pbandk.testpb.TimestampRules {
    this.required = required
    this.const = const
    this.lt = lt
    this.lte = lte
    this.gt = gt
    this.gte = gte
    this.ltNow = ltNow
    this.gtNow = gtNow
    this.within = within
    this.unknownFields += unknownFields
}

/**
 * The [MutableTimestampRules] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun TimestampRules(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit): pbandk.testpb.TimestampRules = pbandk.testpb.MutableTimestampRules_Impl(
    required = null,
    const = null,
    lt = null,
    lte = null,
    gt = null,
    gte = null,
    ltNow = null,
    gtNow = null,
    within = null,
    unknownFields = mutableMapOf()
).also(builderAction).toTimestampRules()

@pbandk.Export
@pbandk.JsName("orDefaultForTimestampRules")
public fun TimestampRules?.orDefault(): pbandk.testpb.TimestampRules = this ?: pbandk.testpb.TimestampRules.defaultInstance

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
) : pbandk.testpb.TimestampRules, pbandk.GeneratedMessage<pbandk.testpb.TimestampRules>() {
    override val descriptor get() = pbandk.testpb.TimestampRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit) = pbandk.testpb.TimestampRules {
        this.required = this@TimestampRules_Impl.required
        this.const = this@TimestampRules_Impl.const
        this.lt = this@TimestampRules_Impl.lt
        this.lte = this@TimestampRules_Impl.lte
        this.gt = this@TimestampRules_Impl.gt
        this.gte = this@TimestampRules_Impl.gte
        this.ltNow = this@TimestampRules_Impl.ltNow
        this.gtNow = this@TimestampRules_Impl.gtNow
        this.within = this@TimestampRules_Impl.within
        this.unknownFields += this@TimestampRules_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
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
    ) = pbandk.testpb.TimestampRules {
        this.required = required
        this.const = const
        this.lt = lt
        this.lte = lte
        this.gt = gt
        this.gte = gte
        this.ltNow = ltNow
        this.gtNow = gtNow
        this.within = within
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
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
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableTimestampRules, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableTimestampRules>() {
    override val descriptor get() = pbandk.testpb.TimestampRules.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
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
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toTimestampRules() = TimestampRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        ltNow = ltNow,
        gtNow = gtNow,
        within = within,
        unknownFields = unknownFields.toMap()
    )
}

private fun TimestampRules.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.TimestampRules {
    if (other !is pbandk.testpb.TimestampRules) return this

    return copy {
        required = other.required ?: required
        const = const?.plus(other.const) ?: other.const
        lt = lt?.plus(other.lt) ?: other.lt
        lte = lte?.plus(other.lte) ?: other.lte
        gt = gt?.plus(other.gt) ?: other.gt
        gte = gte?.plus(other.gte) ?: other.gte
        ltNow = other.ltNow ?: ltNow
        gtNow = other.gtNow ?: gtNow
        within = within?.plus(other.within) ?: other.within
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun TimestampRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.TimestampRules {
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
    return TimestampRules_Impl(required, const, lt, lte,
        gt, gte, ltNow, gtNow,
        within, unknownFields)
}

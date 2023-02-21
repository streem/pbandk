@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface KnownRegex : pbandk.Message.Enum {
    override val descriptor: pbandk.EnumDescriptor<pbandk.testpb.KnownRegex>
        get() = pbandk.testpb.KnownRegex.descriptor

    public object UNKNOWN : KnownRegex, pbandk.gen.GeneratedEnumValue<pbandk.testpb.KnownRegex>(
        value = 0,
        name = "UNKNOWN",
    )
    public object HTTP_HEADER_NAME : KnownRegex, pbandk.gen.GeneratedEnumValue<pbandk.testpb.KnownRegex>(
        value = 1,
        name = "HTTP_HEADER_NAME",
    )
    public object HTTP_HEADER_VALUE : KnownRegex, pbandk.gen.GeneratedEnumValue<pbandk.testpb.KnownRegex>(
        value = 2,
        name = "HTTP_HEADER_VALUE",
    )
    public class UNRECOGNIZED(value: Int? = null, name: String? = null)
        : KnownRegex, pbandk.gen.UnrecognizedEnumValue<pbandk.testpb.KnownRegex>(value, name)

    public companion object : pbandk.Message.Enum.Companion<pbandk.testpb.KnownRegex> {
        override val descriptor: pbandk.EnumDescriptor<pbandk.testpb.KnownRegex> =
            pbandk.EnumDescriptor.of(
                fullName = "pbandk.testpb.KnownRegex",
                enumClass = pbandk.testpb.KnownRegex::class,
                enumCompanion = this,
            )
        public val values: List<KnownRegex> by lazy(LazyThreadSafetyMode.PUBLICATION) {
            listOf(UNKNOWN, HTTP_HEADER_NAME, HTTP_HEADER_VALUE)
        }

        override fun fromValue(value: Int): pbandk.testpb.KnownRegex =
            values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

        override fun fromName(name: String): pbandk.testpb.KnownRegex =
            values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
    }
}

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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    public sealed interface Type<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class Float_(float: pbandk.testpb.FloatRules) :
            Type<pbandk.testpb.FloatRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.FloatRules>(float, pbandk.testpb.FieldRules.FieldDescriptors.float)
        public class Double_(double: pbandk.testpb.DoubleRules) :
            Type<pbandk.testpb.DoubleRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.DoubleRules>(double, pbandk.testpb.FieldRules.FieldDescriptors.double)
        public class Int32(int32: pbandk.testpb.Int32Rules) :
            Type<pbandk.testpb.Int32Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.Int32Rules>(int32, pbandk.testpb.FieldRules.FieldDescriptors.int32)
        public class Int64(int64: pbandk.testpb.Int64Rules) :
            Type<pbandk.testpb.Int64Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.Int64Rules>(int64, pbandk.testpb.FieldRules.FieldDescriptors.int64)
        public class Uint32(uint32: pbandk.testpb.UInt32Rules) :
            Type<pbandk.testpb.UInt32Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.UInt32Rules>(uint32, pbandk.testpb.FieldRules.FieldDescriptors.uint32)
        public class Uint64(uint64: pbandk.testpb.UInt64Rules) :
            Type<pbandk.testpb.UInt64Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.UInt64Rules>(uint64, pbandk.testpb.FieldRules.FieldDescriptors.uint64)
        public class Sint32(sint32: pbandk.testpb.SInt32Rules) :
            Type<pbandk.testpb.SInt32Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.SInt32Rules>(sint32, pbandk.testpb.FieldRules.FieldDescriptors.sint32)
        public class Sint64(sint64: pbandk.testpb.SInt64Rules) :
            Type<pbandk.testpb.SInt64Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.SInt64Rules>(sint64, pbandk.testpb.FieldRules.FieldDescriptors.sint64)
        public class Fixed32(fixed32: pbandk.testpb.Fixed32Rules) :
            Type<pbandk.testpb.Fixed32Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.Fixed32Rules>(fixed32, pbandk.testpb.FieldRules.FieldDescriptors.fixed32)
        public class Fixed64(fixed64: pbandk.testpb.Fixed64Rules) :
            Type<pbandk.testpb.Fixed64Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.Fixed64Rules>(fixed64, pbandk.testpb.FieldRules.FieldDescriptors.fixed64)
        public class Sfixed32(sfixed32: pbandk.testpb.SFixed32Rules) :
            Type<pbandk.testpb.SFixed32Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.SFixed32Rules>(sfixed32, pbandk.testpb.FieldRules.FieldDescriptors.sfixed32)
        public class Sfixed64(sfixed64: pbandk.testpb.SFixed64Rules) :
            Type<pbandk.testpb.SFixed64Rules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.SFixed64Rules>(sfixed64, pbandk.testpb.FieldRules.FieldDescriptors.sfixed64)
        public class Bool(bool: pbandk.testpb.BoolRules) :
            Type<pbandk.testpb.BoolRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.BoolRules>(bool, pbandk.testpb.FieldRules.FieldDescriptors.bool)
        public class String_(string: pbandk.testpb.StringRules) :
            Type<pbandk.testpb.StringRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.StringRules>(string, pbandk.testpb.FieldRules.FieldDescriptors.string)
        public class Bytes(bytes: pbandk.testpb.BytesRules) :
            Type<pbandk.testpb.BytesRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.BytesRules>(bytes, pbandk.testpb.FieldRules.FieldDescriptors.bytes)
        public class Enum(enum: pbandk.testpb.EnumRules) :
            Type<pbandk.testpb.EnumRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.EnumRules>(enum, pbandk.testpb.FieldRules.FieldDescriptors.enum)
        public class Repeated(repeated: pbandk.testpb.RepeatedRules) :
            Type<pbandk.testpb.RepeatedRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.RepeatedRules>(repeated, pbandk.testpb.FieldRules.FieldDescriptors.repeated)
        public class Map_(map: pbandk.testpb.MapRules) :
            Type<pbandk.testpb.MapRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.MapRules>(map, pbandk.testpb.FieldRules.FieldDescriptors.map)
        public class Any(any: pbandk.testpb.AnyRules) :
            Type<pbandk.testpb.AnyRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.AnyRules>(any, pbandk.testpb.FieldRules.FieldDescriptors.any)
        public class Duration(duration: pbandk.testpb.DurationRules) :
            Type<pbandk.testpb.DurationRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.DurationRules>(duration, pbandk.testpb.FieldRules.FieldDescriptors.duration)
        public class Timestamp(timestamp: pbandk.testpb.TimestampRules) :
            Type<pbandk.testpb.TimestampRules>, pbandk.gen.GeneratedOneOf<pbandk.testpb.FieldRules, pbandk.testpb.TimestampRules>(timestamp, pbandk.testpb.FieldRules.FieldDescriptors.timestamp)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val float: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.FloatRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "float",
                number = 1,
                valueType = pbandk.types.message(pbandk.testpb.FloatRules),
                jsonName = "float",
                value = pbandk.testpb.FieldRules::float,
                mutableValue = pbandk.testpb.MutableFieldRules::float,
            )
        public val double: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.DoubleRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "double",
                number = 2,
                valueType = pbandk.types.message(pbandk.testpb.DoubleRules),
                jsonName = "double",
                value = pbandk.testpb.FieldRules::double,
                mutableValue = pbandk.testpb.MutableFieldRules::double,
            )
        public val int32: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.Int32Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "int32",
                number = 3,
                valueType = pbandk.types.message(pbandk.testpb.Int32Rules),
                jsonName = "int32",
                value = pbandk.testpb.FieldRules::int32,
                mutableValue = pbandk.testpb.MutableFieldRules::int32,
            )
        public val int64: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.Int64Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "int64",
                number = 4,
                valueType = pbandk.types.message(pbandk.testpb.Int64Rules),
                jsonName = "int64",
                value = pbandk.testpb.FieldRules::int64,
                mutableValue = pbandk.testpb.MutableFieldRules::int64,
            )
        public val uint32: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.UInt32Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "uint32",
                number = 5,
                valueType = pbandk.types.message(pbandk.testpb.UInt32Rules),
                jsonName = "uint32",
                value = pbandk.testpb.FieldRules::uint32,
                mutableValue = pbandk.testpb.MutableFieldRules::uint32,
            )
        public val uint64: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.UInt64Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "uint64",
                number = 6,
                valueType = pbandk.types.message(pbandk.testpb.UInt64Rules),
                jsonName = "uint64",
                value = pbandk.testpb.FieldRules::uint64,
                mutableValue = pbandk.testpb.MutableFieldRules::uint64,
            )
        public val sint32: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.SInt32Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "sint32",
                number = 7,
                valueType = pbandk.types.message(pbandk.testpb.SInt32Rules),
                jsonName = "sint32",
                value = pbandk.testpb.FieldRules::sint32,
                mutableValue = pbandk.testpb.MutableFieldRules::sint32,
            )
        public val sint64: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.SInt64Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "sint64",
                number = 8,
                valueType = pbandk.types.message(pbandk.testpb.SInt64Rules),
                jsonName = "sint64",
                value = pbandk.testpb.FieldRules::sint64,
                mutableValue = pbandk.testpb.MutableFieldRules::sint64,
            )
        public val fixed32: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.Fixed32Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "fixed32",
                number = 9,
                valueType = pbandk.types.message(pbandk.testpb.Fixed32Rules),
                jsonName = "fixed32",
                value = pbandk.testpb.FieldRules::fixed32,
                mutableValue = pbandk.testpb.MutableFieldRules::fixed32,
            )
        public val fixed64: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.Fixed64Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "fixed64",
                number = 10,
                valueType = pbandk.types.message(pbandk.testpb.Fixed64Rules),
                jsonName = "fixed64",
                value = pbandk.testpb.FieldRules::fixed64,
                mutableValue = pbandk.testpb.MutableFieldRules::fixed64,
            )
        public val sfixed32: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.SFixed32Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "sfixed32",
                number = 11,
                valueType = pbandk.types.message(pbandk.testpb.SFixed32Rules),
                jsonName = "sfixed32",
                value = pbandk.testpb.FieldRules::sfixed32,
                mutableValue = pbandk.testpb.MutableFieldRules::sfixed32,
            )
        public val sfixed64: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.SFixed64Rules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "sfixed64",
                number = 12,
                valueType = pbandk.types.message(pbandk.testpb.SFixed64Rules),
                jsonName = "sfixed64",
                value = pbandk.testpb.FieldRules::sfixed64,
                mutableValue = pbandk.testpb.MutableFieldRules::sfixed64,
            )
        public val bool: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.BoolRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "bool",
                number = 13,
                valueType = pbandk.types.message(pbandk.testpb.BoolRules),
                jsonName = "bool",
                value = pbandk.testpb.FieldRules::bool,
                mutableValue = pbandk.testpb.MutableFieldRules::bool,
            )
        public val string: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.StringRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "string",
                number = 14,
                valueType = pbandk.types.message(pbandk.testpb.StringRules),
                jsonName = "string",
                value = pbandk.testpb.FieldRules::string,
                mutableValue = pbandk.testpb.MutableFieldRules::string,
            )
        public val bytes: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.BytesRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "bytes",
                number = 15,
                valueType = pbandk.types.message(pbandk.testpb.BytesRules),
                jsonName = "bytes",
                value = pbandk.testpb.FieldRules::bytes,
                mutableValue = pbandk.testpb.MutableFieldRules::bytes,
            )
        public val enum: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.EnumRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "enum",
                number = 16,
                valueType = pbandk.types.message(pbandk.testpb.EnumRules),
                jsonName = "enum",
                value = pbandk.testpb.FieldRules::enum,
                mutableValue = pbandk.testpb.MutableFieldRules::enum,
            )
        public val message: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.MessageRules?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "message",
                number = 17,
                valueType = pbandk.types.message(pbandk.testpb.MessageRules),
                jsonName = "message",
                value = pbandk.testpb.FieldRules::message,
                mutableValue = pbandk.testpb.MutableFieldRules::message,
            )
        public val repeated: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.RepeatedRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "repeated",
                number = 18,
                valueType = pbandk.types.message(pbandk.testpb.RepeatedRules),
                jsonName = "repeated",
                value = pbandk.testpb.FieldRules::repeated,
                mutableValue = pbandk.testpb.MutableFieldRules::repeated,
            )
        public val map: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.MapRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "map",
                number = 19,
                valueType = pbandk.types.message(pbandk.testpb.MapRules),
                jsonName = "map",
                value = pbandk.testpb.FieldRules::map,
                mutableValue = pbandk.testpb.MutableFieldRules::map,
            )
        public val any: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.AnyRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "any",
                number = 20,
                valueType = pbandk.types.message(pbandk.testpb.AnyRules),
                jsonName = "any",
                value = pbandk.testpb.FieldRules::any,
                mutableValue = pbandk.testpb.MutableFieldRules::any,
            )
        public val duration: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.DurationRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "duration",
                number = 21,
                valueType = pbandk.types.message(pbandk.testpb.DurationRules),
                jsonName = "duration",
                value = pbandk.testpb.FieldRules::duration,
                mutableValue = pbandk.testpb.MutableFieldRules::duration,
            )
        public val timestamp: pbandk.FieldDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.TimestampRules?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                messageMetadata = pbandk.testpb.FieldRules.messageMetadata,
                name = "timestamp",
                number = 22,
                valueType = pbandk.types.message(pbandk.testpb.TimestampRules),
                jsonName = "timestamp",
                value = pbandk.testpb.FieldRules::timestamp,
                mutableValue = pbandk.testpb.MutableFieldRules::timestamp,
            )

        public val type: pbandk.OneofDescriptor<pbandk.testpb.FieldRules, pbandk.testpb.FieldRules.Type<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.testpb.FieldRules::descriptor,
                name = "type",
                value = pbandk.testpb.FieldRules::type,
                mutableValue = pbandk.testpb.MutableFieldRules::type,
                fields = listOf(
                    float,
                    double,
                    int32,
                    int64,
                    uint32,
                    uint64,
                    sint32,
                    sint64,
                    fixed32,
                    fixed64,
                    sfixed32,
                    sfixed64,
                    bool,
                    string,
                    bytes,
                    enum,
                    repeated,
                    map,
                    any,
                    duration,
                    timestamp,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.FieldRules> {
        override val defaultInstance: pbandk.testpb.FieldRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.FieldRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.FieldRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.FieldRules::class,
                messageCompanion = this,
                builder = ::FieldRules,
                fields = listOf(
                    pbandk.testpb.FieldRules.FieldDescriptors.message,
                ),
                oneofs = listOf(
                    pbandk.testpb.FieldRules.FieldDescriptors.type,
                ),
            )
        }
    }
}

public sealed interface MutableFieldRules : pbandk.testpb.FieldRules, pbandk.MutableMessage<pbandk.testpb.FieldRules> {
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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.FloatRules, Float?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.float(),
                jsonName = "const",
                value = pbandk.testpb.FloatRules::const,
                mutableValue = pbandk.testpb.MutableFloatRules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.FloatRules, Float?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.float(),
                jsonName = "lt",
                value = pbandk.testpb.FloatRules::lt,
                mutableValue = pbandk.testpb.MutableFloatRules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.FloatRules, Float?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.float(),
                jsonName = "lte",
                value = pbandk.testpb.FloatRules::lte,
                mutableValue = pbandk.testpb.MutableFloatRules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.FloatRules, Float?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.float(),
                jsonName = "gt",
                value = pbandk.testpb.FloatRules::gt,
                mutableValue = pbandk.testpb.MutableFloatRules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.FloatRules, Float?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.float(),
                jsonName = "gte",
                value = pbandk.testpb.FloatRules::gte,
                mutableValue = pbandk.testpb.MutableFloatRules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.FloatRules, List<Float>, MutableList<Float>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.float(),
                jsonName = "in",
                value = pbandk.testpb.FloatRules::`in`,
                mutableValue = pbandk.testpb.MutableFloatRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.FloatRules, List<Float>, MutableList<Float>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.FloatRules::descriptor,
                messageMetadata = pbandk.testpb.FloatRules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.float(),
                jsonName = "notIn",
                value = pbandk.testpb.FloatRules::notIn,
                mutableValue = pbandk.testpb.MutableFloatRules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.FloatRules> {
        override val defaultInstance: pbandk.testpb.FloatRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.FloatRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.FloatRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FloatRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.FloatRules::class,
                messageCompanion = this,
                builder = ::FloatRules,
                fields = listOf(
                    pbandk.testpb.FloatRules.FieldDescriptors.const,
                    pbandk.testpb.FloatRules.FieldDescriptors.lt,
                    pbandk.testpb.FloatRules.FieldDescriptors.lte,
                    pbandk.testpb.FloatRules.FieldDescriptors.gt,
                    pbandk.testpb.FloatRules.FieldDescriptors.gte,
                    pbandk.testpb.FloatRules.FieldDescriptors.`in`,
                    pbandk.testpb.FloatRules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableFloatRules : pbandk.testpb.FloatRules, pbandk.MutableMessage<pbandk.testpb.FloatRules> {
    public override var const: Float?
    public override var lt: Float?
    public override var lte: Float?
    public override var gt: Float?
    public override var gte: Float?
    public override val `in`: MutableList<Float>
    public override val notIn: MutableList<Float>
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

    /**
     * The [MutableDoubleRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit): pbandk.testpb.DoubleRules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.double(),
                jsonName = "const",
                value = pbandk.testpb.DoubleRules::const,
                mutableValue = pbandk.testpb.MutableDoubleRules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.double(),
                jsonName = "lt",
                value = pbandk.testpb.DoubleRules::lt,
                mutableValue = pbandk.testpb.MutableDoubleRules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.double(),
                jsonName = "lte",
                value = pbandk.testpb.DoubleRules::lte,
                mutableValue = pbandk.testpb.MutableDoubleRules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.double(),
                jsonName = "gt",
                value = pbandk.testpb.DoubleRules::gt,
                mutableValue = pbandk.testpb.MutableDoubleRules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.double(),
                jsonName = "gte",
                value = pbandk.testpb.DoubleRules::gte,
                mutableValue = pbandk.testpb.MutableDoubleRules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.DoubleRules, List<Double>, MutableList<Double>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.double(),
                jsonName = "in",
                value = pbandk.testpb.DoubleRules::`in`,
                mutableValue = pbandk.testpb.MutableDoubleRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.DoubleRules, List<Double>, MutableList<Double>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.DoubleRules::descriptor,
                messageMetadata = pbandk.testpb.DoubleRules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.double(),
                jsonName = "notIn",
                value = pbandk.testpb.DoubleRules::notIn,
                mutableValue = pbandk.testpb.MutableDoubleRules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.DoubleRules> {
        override val defaultInstance: pbandk.testpb.DoubleRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.DoubleRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.DoubleRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DoubleRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.DoubleRules::class,
                messageCompanion = this,
                builder = ::DoubleRules,
                fields = listOf(
                    pbandk.testpb.DoubleRules.FieldDescriptors.const,
                    pbandk.testpb.DoubleRules.FieldDescriptors.lt,
                    pbandk.testpb.DoubleRules.FieldDescriptors.lte,
                    pbandk.testpb.DoubleRules.FieldDescriptors.gt,
                    pbandk.testpb.DoubleRules.FieldDescriptors.gte,
                    pbandk.testpb.DoubleRules.FieldDescriptors.`in`,
                    pbandk.testpb.DoubleRules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableDoubleRules : pbandk.testpb.DoubleRules, pbandk.MutableMessage<pbandk.testpb.DoubleRules> {
    public override var const: Double?
    public override var lt: Double?
    public override var lte: Double?
    public override var gt: Double?
    public override var gte: Double?
    public override val `in`: MutableList<Double>
    public override val notIn: MutableList<Double>
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

    /**
     * The [MutableInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit): pbandk.testpb.Int32Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.int32(),
                jsonName = "const",
                value = pbandk.testpb.Int32Rules::const,
                mutableValue = pbandk.testpb.MutableInt32Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.int32(),
                jsonName = "lt",
                value = pbandk.testpb.Int32Rules::lt,
                mutableValue = pbandk.testpb.MutableInt32Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.int32(),
                jsonName = "lte",
                value = pbandk.testpb.Int32Rules::lte,
                mutableValue = pbandk.testpb.MutableInt32Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.int32(),
                jsonName = "gt",
                value = pbandk.testpb.Int32Rules::gt,
                mutableValue = pbandk.testpb.MutableInt32Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.int32(),
                jsonName = "gte",
                value = pbandk.testpb.Int32Rules::gte,
                mutableValue = pbandk.testpb.MutableInt32Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Int32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.int32(),
                jsonName = "in",
                value = pbandk.testpb.Int32Rules::`in`,
                mutableValue = pbandk.testpb.MutableInt32Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Int32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Int32Rules::descriptor,
                messageMetadata = pbandk.testpb.Int32Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.int32(),
                jsonName = "notIn",
                value = pbandk.testpb.Int32Rules::notIn,
                mutableValue = pbandk.testpb.MutableInt32Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Int32Rules> {
        override val defaultInstance: pbandk.testpb.Int32Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Int32Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.Int32Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int32Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.Int32Rules::class,
                messageCompanion = this,
                builder = ::Int32Rules,
                fields = listOf(
                    pbandk.testpb.Int32Rules.FieldDescriptors.const,
                    pbandk.testpb.Int32Rules.FieldDescriptors.lt,
                    pbandk.testpb.Int32Rules.FieldDescriptors.lte,
                    pbandk.testpb.Int32Rules.FieldDescriptors.gt,
                    pbandk.testpb.Int32Rules.FieldDescriptors.gte,
                    pbandk.testpb.Int32Rules.FieldDescriptors.`in`,
                    pbandk.testpb.Int32Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableInt32Rules : pbandk.testpb.Int32Rules, pbandk.MutableMessage<pbandk.testpb.Int32Rules> {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
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

    /**
     * The [MutableInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit): pbandk.testpb.Int64Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.int64(),
                jsonName = "const",
                value = pbandk.testpb.Int64Rules::const,
                mutableValue = pbandk.testpb.MutableInt64Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.int64(),
                jsonName = "lt",
                value = pbandk.testpb.Int64Rules::lt,
                mutableValue = pbandk.testpb.MutableInt64Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.int64(),
                jsonName = "lte",
                value = pbandk.testpb.Int64Rules::lte,
                mutableValue = pbandk.testpb.MutableInt64Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.int64(),
                jsonName = "gt",
                value = pbandk.testpb.Int64Rules::gt,
                mutableValue = pbandk.testpb.MutableInt64Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.int64(),
                jsonName = "gte",
                value = pbandk.testpb.Int64Rules::gte,
                mutableValue = pbandk.testpb.MutableInt64Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Int64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.int64(),
                jsonName = "in",
                value = pbandk.testpb.Int64Rules::`in`,
                mutableValue = pbandk.testpb.MutableInt64Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Int64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Int64Rules::descriptor,
                messageMetadata = pbandk.testpb.Int64Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.int64(),
                jsonName = "notIn",
                value = pbandk.testpb.Int64Rules::notIn,
                mutableValue = pbandk.testpb.MutableInt64Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Int64Rules> {
        override val defaultInstance: pbandk.testpb.Int64Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Int64Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.Int64Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int64Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.Int64Rules::class,
                messageCompanion = this,
                builder = ::Int64Rules,
                fields = listOf(
                    pbandk.testpb.Int64Rules.FieldDescriptors.const,
                    pbandk.testpb.Int64Rules.FieldDescriptors.lt,
                    pbandk.testpb.Int64Rules.FieldDescriptors.lte,
                    pbandk.testpb.Int64Rules.FieldDescriptors.gt,
                    pbandk.testpb.Int64Rules.FieldDescriptors.gte,
                    pbandk.testpb.Int64Rules.FieldDescriptors.`in`,
                    pbandk.testpb.Int64Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableInt64Rules : pbandk.testpb.Int64Rules, pbandk.MutableMessage<pbandk.testpb.Int64Rules> {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
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

    /**
     * The [MutableUInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit): pbandk.testpb.UInt32Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.uint32(),
                jsonName = "const",
                value = pbandk.testpb.UInt32Rules::const,
                mutableValue = pbandk.testpb.MutableUInt32Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.uint32(),
                jsonName = "lt",
                value = pbandk.testpb.UInt32Rules::lt,
                mutableValue = pbandk.testpb.MutableUInt32Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.uint32(),
                jsonName = "lte",
                value = pbandk.testpb.UInt32Rules::lte,
                mutableValue = pbandk.testpb.MutableUInt32Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.uint32(),
                jsonName = "gt",
                value = pbandk.testpb.UInt32Rules::gt,
                mutableValue = pbandk.testpb.MutableUInt32Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.uint32(),
                jsonName = "gte",
                value = pbandk.testpb.UInt32Rules::gte,
                mutableValue = pbandk.testpb.MutableUInt32Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.UInt32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.uint32(),
                jsonName = "in",
                value = pbandk.testpb.UInt32Rules::`in`,
                mutableValue = pbandk.testpb.MutableUInt32Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.UInt32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.UInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt32Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.uint32(),
                jsonName = "notIn",
                value = pbandk.testpb.UInt32Rules::notIn,
                mutableValue = pbandk.testpb.MutableUInt32Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.UInt32Rules> {
        override val defaultInstance: pbandk.testpb.UInt32Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.UInt32Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.UInt32Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt32Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.UInt32Rules::class,
                messageCompanion = this,
                builder = ::UInt32Rules,
                fields = listOf(
                    pbandk.testpb.UInt32Rules.FieldDescriptors.const,
                    pbandk.testpb.UInt32Rules.FieldDescriptors.lt,
                    pbandk.testpb.UInt32Rules.FieldDescriptors.lte,
                    pbandk.testpb.UInt32Rules.FieldDescriptors.gt,
                    pbandk.testpb.UInt32Rules.FieldDescriptors.gte,
                    pbandk.testpb.UInt32Rules.FieldDescriptors.`in`,
                    pbandk.testpb.UInt32Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableUInt32Rules : pbandk.testpb.UInt32Rules, pbandk.MutableMessage<pbandk.testpb.UInt32Rules> {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
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

    /**
     * The [MutableUInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit): pbandk.testpb.UInt64Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.uint64(),
                jsonName = "const",
                value = pbandk.testpb.UInt64Rules::const,
                mutableValue = pbandk.testpb.MutableUInt64Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.uint64(),
                jsonName = "lt",
                value = pbandk.testpb.UInt64Rules::lt,
                mutableValue = pbandk.testpb.MutableUInt64Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.uint64(),
                jsonName = "lte",
                value = pbandk.testpb.UInt64Rules::lte,
                mutableValue = pbandk.testpb.MutableUInt64Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.uint64(),
                jsonName = "gt",
                value = pbandk.testpb.UInt64Rules::gt,
                mutableValue = pbandk.testpb.MutableUInt64Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.uint64(),
                jsonName = "gte",
                value = pbandk.testpb.UInt64Rules::gte,
                mutableValue = pbandk.testpb.MutableUInt64Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.UInt64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.uint64(),
                jsonName = "in",
                value = pbandk.testpb.UInt64Rules::`in`,
                mutableValue = pbandk.testpb.MutableUInt64Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.UInt64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.UInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.UInt64Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.uint64(),
                jsonName = "notIn",
                value = pbandk.testpb.UInt64Rules::notIn,
                mutableValue = pbandk.testpb.MutableUInt64Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.UInt64Rules> {
        override val defaultInstance: pbandk.testpb.UInt64Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.UInt64Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.UInt64Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt64Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.UInt64Rules::class,
                messageCompanion = this,
                builder = ::UInt64Rules,
                fields = listOf(
                    pbandk.testpb.UInt64Rules.FieldDescriptors.const,
                    pbandk.testpb.UInt64Rules.FieldDescriptors.lt,
                    pbandk.testpb.UInt64Rules.FieldDescriptors.lte,
                    pbandk.testpb.UInt64Rules.FieldDescriptors.gt,
                    pbandk.testpb.UInt64Rules.FieldDescriptors.gte,
                    pbandk.testpb.UInt64Rules.FieldDescriptors.`in`,
                    pbandk.testpb.UInt64Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableUInt64Rules : pbandk.testpb.UInt64Rules, pbandk.MutableMessage<pbandk.testpb.UInt64Rules> {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
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

    /**
     * The [MutableSInt32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit): pbandk.testpb.SInt32Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.sint32(),
                jsonName = "const",
                value = pbandk.testpb.SInt32Rules::const,
                mutableValue = pbandk.testpb.MutableSInt32Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.sint32(),
                jsonName = "lt",
                value = pbandk.testpb.SInt32Rules::lt,
                mutableValue = pbandk.testpb.MutableSInt32Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.sint32(),
                jsonName = "lte",
                value = pbandk.testpb.SInt32Rules::lte,
                mutableValue = pbandk.testpb.MutableSInt32Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.sint32(),
                jsonName = "gt",
                value = pbandk.testpb.SInt32Rules::gt,
                mutableValue = pbandk.testpb.MutableSInt32Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.sint32(),
                jsonName = "gte",
                value = pbandk.testpb.SInt32Rules::gte,
                mutableValue = pbandk.testpb.MutableSInt32Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SInt32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.sint32(),
                jsonName = "in",
                value = pbandk.testpb.SInt32Rules::`in`,
                mutableValue = pbandk.testpb.MutableSInt32Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SInt32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SInt32Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt32Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.sint32(),
                jsonName = "notIn",
                value = pbandk.testpb.SInt32Rules::notIn,
                mutableValue = pbandk.testpb.MutableSInt32Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.SInt32Rules> {
        override val defaultInstance: pbandk.testpb.SInt32Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.SInt32Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.SInt32Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt32Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.SInt32Rules::class,
                messageCompanion = this,
                builder = ::SInt32Rules,
                fields = listOf(
                    pbandk.testpb.SInt32Rules.FieldDescriptors.const,
                    pbandk.testpb.SInt32Rules.FieldDescriptors.lt,
                    pbandk.testpb.SInt32Rules.FieldDescriptors.lte,
                    pbandk.testpb.SInt32Rules.FieldDescriptors.gt,
                    pbandk.testpb.SInt32Rules.FieldDescriptors.gte,
                    pbandk.testpb.SInt32Rules.FieldDescriptors.`in`,
                    pbandk.testpb.SInt32Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableSInt32Rules : pbandk.testpb.SInt32Rules, pbandk.MutableMessage<pbandk.testpb.SInt32Rules> {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
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

    /**
     * The [MutableSInt64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit): pbandk.testpb.SInt64Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.sint64(),
                jsonName = "const",
                value = pbandk.testpb.SInt64Rules::const,
                mutableValue = pbandk.testpb.MutableSInt64Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.sint64(),
                jsonName = "lt",
                value = pbandk.testpb.SInt64Rules::lt,
                mutableValue = pbandk.testpb.MutableSInt64Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.sint64(),
                jsonName = "lte",
                value = pbandk.testpb.SInt64Rules::lte,
                mutableValue = pbandk.testpb.MutableSInt64Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.sint64(),
                jsonName = "gt",
                value = pbandk.testpb.SInt64Rules::gt,
                mutableValue = pbandk.testpb.MutableSInt64Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.sint64(),
                jsonName = "gte",
                value = pbandk.testpb.SInt64Rules::gte,
                mutableValue = pbandk.testpb.MutableSInt64Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SInt64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.sint64(),
                jsonName = "in",
                value = pbandk.testpb.SInt64Rules::`in`,
                mutableValue = pbandk.testpb.MutableSInt64Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SInt64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SInt64Rules::descriptor,
                messageMetadata = pbandk.testpb.SInt64Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.sint64(),
                jsonName = "notIn",
                value = pbandk.testpb.SInt64Rules::notIn,
                mutableValue = pbandk.testpb.MutableSInt64Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.SInt64Rules> {
        override val defaultInstance: pbandk.testpb.SInt64Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.SInt64Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.SInt64Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt64Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.SInt64Rules::class,
                messageCompanion = this,
                builder = ::SInt64Rules,
                fields = listOf(
                    pbandk.testpb.SInt64Rules.FieldDescriptors.const,
                    pbandk.testpb.SInt64Rules.FieldDescriptors.lt,
                    pbandk.testpb.SInt64Rules.FieldDescriptors.lte,
                    pbandk.testpb.SInt64Rules.FieldDescriptors.gt,
                    pbandk.testpb.SInt64Rules.FieldDescriptors.gte,
                    pbandk.testpb.SInt64Rules.FieldDescriptors.`in`,
                    pbandk.testpb.SInt64Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableSInt64Rules : pbandk.testpb.SInt64Rules, pbandk.MutableMessage<pbandk.testpb.SInt64Rules> {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
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

    /**
     * The [MutableFixed32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit): pbandk.testpb.Fixed32Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.fixed32(),
                jsonName = "const",
                value = pbandk.testpb.Fixed32Rules::const,
                mutableValue = pbandk.testpb.MutableFixed32Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.fixed32(),
                jsonName = "lt",
                value = pbandk.testpb.Fixed32Rules::lt,
                mutableValue = pbandk.testpb.MutableFixed32Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.fixed32(),
                jsonName = "lte",
                value = pbandk.testpb.Fixed32Rules::lte,
                mutableValue = pbandk.testpb.MutableFixed32Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.fixed32(),
                jsonName = "gt",
                value = pbandk.testpb.Fixed32Rules::gt,
                mutableValue = pbandk.testpb.MutableFixed32Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.fixed32(),
                jsonName = "gte",
                value = pbandk.testpb.Fixed32Rules::gte,
                mutableValue = pbandk.testpb.MutableFixed32Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Fixed32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.fixed32(),
                jsonName = "in",
                value = pbandk.testpb.Fixed32Rules::`in`,
                mutableValue = pbandk.testpb.MutableFixed32Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Fixed32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Fixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed32Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.fixed32(),
                jsonName = "notIn",
                value = pbandk.testpb.Fixed32Rules::notIn,
                mutableValue = pbandk.testpb.MutableFixed32Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Fixed32Rules> {
        override val defaultInstance: pbandk.testpb.Fixed32Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Fixed32Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.Fixed32Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed32Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.Fixed32Rules::class,
                messageCompanion = this,
                builder = ::Fixed32Rules,
                fields = listOf(
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.const,
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.lt,
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.lte,
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.gt,
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.gte,
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.`in`,
                    pbandk.testpb.Fixed32Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableFixed32Rules : pbandk.testpb.Fixed32Rules, pbandk.MutableMessage<pbandk.testpb.Fixed32Rules> {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
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

    /**
     * The [MutableFixed64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit): pbandk.testpb.Fixed64Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.fixed64(),
                jsonName = "const",
                value = pbandk.testpb.Fixed64Rules::const,
                mutableValue = pbandk.testpb.MutableFixed64Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.fixed64(),
                jsonName = "lt",
                value = pbandk.testpb.Fixed64Rules::lt,
                mutableValue = pbandk.testpb.MutableFixed64Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.fixed64(),
                jsonName = "lte",
                value = pbandk.testpb.Fixed64Rules::lte,
                mutableValue = pbandk.testpb.MutableFixed64Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.fixed64(),
                jsonName = "gt",
                value = pbandk.testpb.Fixed64Rules::gt,
                mutableValue = pbandk.testpb.MutableFixed64Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.fixed64(),
                jsonName = "gte",
                value = pbandk.testpb.Fixed64Rules::gte,
                mutableValue = pbandk.testpb.MutableFixed64Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Fixed64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.fixed64(),
                jsonName = "in",
                value = pbandk.testpb.Fixed64Rules::`in`,
                mutableValue = pbandk.testpb.MutableFixed64Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.Fixed64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.Fixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.Fixed64Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.fixed64(),
                jsonName = "notIn",
                value = pbandk.testpb.Fixed64Rules::notIn,
                mutableValue = pbandk.testpb.MutableFixed64Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Fixed64Rules> {
        override val defaultInstance: pbandk.testpb.Fixed64Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Fixed64Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.Fixed64Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed64Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.Fixed64Rules::class,
                messageCompanion = this,
                builder = ::Fixed64Rules,
                fields = listOf(
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.const,
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.lt,
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.lte,
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.gt,
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.gte,
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.`in`,
                    pbandk.testpb.Fixed64Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableFixed64Rules : pbandk.testpb.Fixed64Rules, pbandk.MutableMessage<pbandk.testpb.Fixed64Rules> {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
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

    /**
     * The [MutableSFixed32Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit): pbandk.testpb.SFixed32Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.sfixed32(),
                jsonName = "const",
                value = pbandk.testpb.SFixed32Rules::const,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.sfixed32(),
                jsonName = "lt",
                value = pbandk.testpb.SFixed32Rules::lt,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.sfixed32(),
                jsonName = "lte",
                value = pbandk.testpb.SFixed32Rules::lte,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.sfixed32(),
                jsonName = "gt",
                value = pbandk.testpb.SFixed32Rules::gt,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.sfixed32(),
                jsonName = "gte",
                value = pbandk.testpb.SFixed32Rules::gte,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SFixed32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.sfixed32(),
                jsonName = "in",
                value = pbandk.testpb.SFixed32Rules::`in`,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SFixed32Rules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SFixed32Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed32Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.sfixed32(),
                jsonName = "notIn",
                value = pbandk.testpb.SFixed32Rules::notIn,
                mutableValue = pbandk.testpb.MutableSFixed32Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.SFixed32Rules> {
        override val defaultInstance: pbandk.testpb.SFixed32Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.SFixed32Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.SFixed32Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed32Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.SFixed32Rules::class,
                messageCompanion = this,
                builder = ::SFixed32Rules,
                fields = listOf(
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.const,
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.lt,
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.lte,
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.gt,
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.gte,
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.`in`,
                    pbandk.testpb.SFixed32Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableSFixed32Rules : pbandk.testpb.SFixed32Rules, pbandk.MutableMessage<pbandk.testpb.SFixed32Rules> {
    public override var const: Int?
    public override var lt: Int?
    public override var lte: Int?
    public override var gt: Int?
    public override var gte: Int?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
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

    /**
     * The [MutableSFixed64Rules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit): pbandk.testpb.SFixed64Rules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.sfixed64(),
                jsonName = "const",
                value = pbandk.testpb.SFixed64Rules::const,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "lt",
                number = 2,
                valueType = pbandk.types.sfixed64(),
                jsonName = "lt",
                value = pbandk.testpb.SFixed64Rules::lt,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "lte",
                number = 3,
                valueType = pbandk.types.sfixed64(),
                jsonName = "lte",
                value = pbandk.testpb.SFixed64Rules::lte,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "gt",
                number = 4,
                valueType = pbandk.types.sfixed64(),
                jsonName = "gt",
                value = pbandk.testpb.SFixed64Rules::gt,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "gte",
                number = 5,
                valueType = pbandk.types.sfixed64(),
                jsonName = "gte",
                value = pbandk.testpb.SFixed64Rules::gte,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SFixed64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "in",
                number = 6,
                valueType = pbandk.types.sfixed64(),
                jsonName = "in",
                value = pbandk.testpb.SFixed64Rules::`in`,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.SFixed64Rules, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.SFixed64Rules::descriptor,
                messageMetadata = pbandk.testpb.SFixed64Rules.messageMetadata,
                name = "not_in",
                number = 7,
                valueType = pbandk.types.sfixed64(),
                jsonName = "notIn",
                value = pbandk.testpb.SFixed64Rules::notIn,
                mutableValue = pbandk.testpb.MutableSFixed64Rules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.SFixed64Rules> {
        override val defaultInstance: pbandk.testpb.SFixed64Rules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.SFixed64Rules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.SFixed64Rules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed64Rules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.SFixed64Rules::class,
                messageCompanion = this,
                builder = ::SFixed64Rules,
                fields = listOf(
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.const,
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.lt,
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.lte,
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.gt,
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.gte,
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.`in`,
                    pbandk.testpb.SFixed64Rules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableSFixed64Rules : pbandk.testpb.SFixed64Rules, pbandk.MutableMessage<pbandk.testpb.SFixed64Rules> {
    public override var const: Long?
    public override var lt: Long?
    public override var lte: Long?
    public override var gt: Long?
    public override var gte: Long?
    public override val `in`: MutableList<Long>
    public override val notIn: MutableList<Long>
}

public sealed interface BoolRules : pbandk.Message {
    public val const: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.BoolRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules>

    /**
     * The [MutableBoolRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit): pbandk.testpb.BoolRules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        const: Boolean? = this.const,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.BoolRules

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.BoolRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BoolRules::descriptor,
                messageMetadata = pbandk.testpb.BoolRules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "const",
                value = pbandk.testpb.BoolRules::const,
                mutableValue = pbandk.testpb.MutableBoolRules::const,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.BoolRules> {
        override val defaultInstance: pbandk.testpb.BoolRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.BoolRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.BoolRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.BoolRules::class,
                messageCompanion = this,
                builder = ::BoolRules,
                fields = listOf(
                    pbandk.testpb.BoolRules.FieldDescriptors.const,
                ),
            )
        }
    }
}

public sealed interface MutableBoolRules : pbandk.testpb.BoolRules, pbandk.MutableMessage<pbandk.testpb.BoolRules> {
    public override var const: Boolean?
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

    /**
     * The [MutableStringRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableStringRules.() -> Unit): pbandk.testpb.StringRules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    public sealed interface WellKnown<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class Email(email: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(email, pbandk.testpb.StringRules.FieldDescriptors.email)
        public class Hostname(hostname: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(hostname, pbandk.testpb.StringRules.FieldDescriptors.hostname)
        public class Ip(ip: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(ip, pbandk.testpb.StringRules.FieldDescriptors.ip)
        public class Ipv4(ipv4: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(ipv4, pbandk.testpb.StringRules.FieldDescriptors.ipv4)
        public class Ipv6(ipv6: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(ipv6, pbandk.testpb.StringRules.FieldDescriptors.ipv6)
        public class Uri(uri: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(uri, pbandk.testpb.StringRules.FieldDescriptors.uri)
        public class UriRef(uriRef: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(uriRef, pbandk.testpb.StringRules.FieldDescriptors.uriRef)
        public class Address(address: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(address, pbandk.testpb.StringRules.FieldDescriptors.address)
        public class Uuid(uuid: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, Boolean>(uuid, pbandk.testpb.StringRules.FieldDescriptors.uuid)
        public class WellKnownRegex(wellKnownRegex: pbandk.testpb.KnownRegex = pbandk.testpb.KnownRegex.fromValue(0)) :
            WellKnown<pbandk.testpb.KnownRegex>, pbandk.gen.GeneratedOneOf<pbandk.testpb.StringRules, pbandk.testpb.KnownRegex>(wellKnownRegex, pbandk.testpb.StringRules.FieldDescriptors.wellKnownRegex)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.StringRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "const",
                value = pbandk.testpb.StringRules::const,
                mutableValue = pbandk.testpb.MutableStringRules::const,
            )
        public val minLen: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "min_len",
                number = 2,
                valueType = pbandk.types.uint64(),
                jsonName = "minLen",
                value = pbandk.testpb.StringRules::minLen,
                mutableValue = pbandk.testpb.MutableStringRules::minLen,
            )
        public val maxLen: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "max_len",
                number = 3,
                valueType = pbandk.types.uint64(),
                jsonName = "maxLen",
                value = pbandk.testpb.StringRules::maxLen,
                mutableValue = pbandk.testpb.MutableStringRules::maxLen,
            )
        public val minBytes: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "min_bytes",
                number = 4,
                valueType = pbandk.types.uint64(),
                jsonName = "minBytes",
                value = pbandk.testpb.StringRules::minBytes,
                mutableValue = pbandk.testpb.MutableStringRules::minBytes,
            )
        public val maxBytes: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "max_bytes",
                number = 5,
                valueType = pbandk.types.uint64(),
                jsonName = "maxBytes",
                value = pbandk.testpb.StringRules::maxBytes,
                mutableValue = pbandk.testpb.MutableStringRules::maxBytes,
            )
        public val pattern: pbandk.FieldDescriptor<pbandk.testpb.StringRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "pattern",
                number = 6,
                valueType = pbandk.types.string(),
                jsonName = "pattern",
                value = pbandk.testpb.StringRules::pattern,
                mutableValue = pbandk.testpb.MutableStringRules::pattern,
            )
        public val prefix: pbandk.FieldDescriptor<pbandk.testpb.StringRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "prefix",
                number = 7,
                valueType = pbandk.types.string(),
                jsonName = "prefix",
                value = pbandk.testpb.StringRules::prefix,
                mutableValue = pbandk.testpb.MutableStringRules::prefix,
            )
        public val suffix: pbandk.FieldDescriptor<pbandk.testpb.StringRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "suffix",
                number = 8,
                valueType = pbandk.types.string(),
                jsonName = "suffix",
                value = pbandk.testpb.StringRules::suffix,
                mutableValue = pbandk.testpb.MutableStringRules::suffix,
            )
        public val contains: pbandk.FieldDescriptor<pbandk.testpb.StringRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "contains",
                number = 9,
                valueType = pbandk.types.string(),
                jsonName = "contains",
                value = pbandk.testpb.StringRules::contains,
                mutableValue = pbandk.testpb.MutableStringRules::contains,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.StringRules, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "in",
                number = 10,
                valueType = pbandk.types.string(),
                jsonName = "in",
                value = pbandk.testpb.StringRules::`in`,
                mutableValue = pbandk.testpb.MutableStringRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.StringRules, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "not_in",
                number = 11,
                valueType = pbandk.types.string(),
                jsonName = "notIn",
                value = pbandk.testpb.StringRules::notIn,
                mutableValue = pbandk.testpb.MutableStringRules::notIn,
            )
        public val email: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "email",
                number = 12,
                valueType = pbandk.types.bool(),
                jsonName = "email",
                value = pbandk.testpb.StringRules::email,
                mutableValue = pbandk.testpb.MutableStringRules::email,
            )
        public val hostname: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "hostname",
                number = 13,
                valueType = pbandk.types.bool(),
                jsonName = "hostname",
                value = pbandk.testpb.StringRules::hostname,
                mutableValue = pbandk.testpb.MutableStringRules::hostname,
            )
        public val ip: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "ip",
                number = 14,
                valueType = pbandk.types.bool(),
                jsonName = "ip",
                value = pbandk.testpb.StringRules::ip,
                mutableValue = pbandk.testpb.MutableStringRules::ip,
            )
        public val ipv4: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "ipv4",
                number = 15,
                valueType = pbandk.types.bool(),
                jsonName = "ipv4",
                value = pbandk.testpb.StringRules::ipv4,
                mutableValue = pbandk.testpb.MutableStringRules::ipv4,
            )
        public val ipv6: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "ipv6",
                number = 16,
                valueType = pbandk.types.bool(),
                jsonName = "ipv6",
                value = pbandk.testpb.StringRules::ipv6,
                mutableValue = pbandk.testpb.MutableStringRules::ipv6,
            )
        public val uri: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "uri",
                number = 17,
                valueType = pbandk.types.bool(),
                jsonName = "uri",
                value = pbandk.testpb.StringRules::uri,
                mutableValue = pbandk.testpb.MutableStringRules::uri,
            )
        public val uriRef: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "uri_ref",
                number = 18,
                valueType = pbandk.types.bool(),
                jsonName = "uriRef",
                value = pbandk.testpb.StringRules::uriRef,
                mutableValue = pbandk.testpb.MutableStringRules::uriRef,
            )
        public val len: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "len",
                number = 19,
                valueType = pbandk.types.uint64(),
                jsonName = "len",
                value = pbandk.testpb.StringRules::len,
                mutableValue = pbandk.testpb.MutableStringRules::len,
            )
        public val lenBytes: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "len_bytes",
                number = 20,
                valueType = pbandk.types.uint64(),
                jsonName = "lenBytes",
                value = pbandk.testpb.StringRules::lenBytes,
                mutableValue = pbandk.testpb.MutableStringRules::lenBytes,
            )
        public val address: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "address",
                number = 21,
                valueType = pbandk.types.bool(),
                jsonName = "address",
                value = pbandk.testpb.StringRules::address,
                mutableValue = pbandk.testpb.MutableStringRules::address,
            )
        public val uuid: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "uuid",
                number = 22,
                valueType = pbandk.types.bool(),
                jsonName = "uuid",
                value = pbandk.testpb.StringRules::uuid,
                mutableValue = pbandk.testpb.MutableStringRules::uuid,
            )
        public val notContains: pbandk.FieldDescriptor<pbandk.testpb.StringRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "not_contains",
                number = 23,
                valueType = pbandk.types.string(),
                jsonName = "notContains",
                value = pbandk.testpb.StringRules::notContains,
                mutableValue = pbandk.testpb.MutableStringRules::notContains,
            )
        public val wellKnownRegex: pbandk.FieldDescriptor<pbandk.testpb.StringRules, pbandk.testpb.KnownRegex?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "well_known_regex",
                number = 24,
                valueType = pbandk.types.enum(pbandk.testpb.KnownRegex),
                jsonName = "wellKnownRegex",
                value = pbandk.testpb.StringRules::wellKnownRegex,
                mutableValue = pbandk.testpb.MutableStringRules::wellKnownRegex,
            )
        public val strict: pbandk.FieldDescriptor<pbandk.testpb.StringRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                messageMetadata = pbandk.testpb.StringRules.messageMetadata,
                name = "strict",
                number = 25,
                valueType = pbandk.types.bool(),
                jsonName = "strict",
                value = pbandk.testpb.StringRules::strict,
                mutableValue = pbandk.testpb.MutableStringRules::strict,
            )

        public val wellKnown: pbandk.OneofDescriptor<pbandk.testpb.StringRules, pbandk.testpb.StringRules.WellKnown<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.testpb.StringRules::descriptor,
                name = "well_known",
                value = pbandk.testpb.StringRules::wellKnown,
                mutableValue = pbandk.testpb.MutableStringRules::wellKnown,
                fields = listOf(
                    email,
                    hostname,
                    ip,
                    ipv4,
                    ipv6,
                    uri,
                    uriRef,
                    address,
                    uuid,
                    wellKnownRegex,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.StringRules> {
        override val defaultInstance: pbandk.testpb.StringRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.StringRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.StringRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.StringRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.StringRules::class,
                messageCompanion = this,
                builder = ::StringRules,
                fields = listOf(
                    pbandk.testpb.StringRules.FieldDescriptors.const,
                    pbandk.testpb.StringRules.FieldDescriptors.len,
                    pbandk.testpb.StringRules.FieldDescriptors.minLen,
                    pbandk.testpb.StringRules.FieldDescriptors.maxLen,
                    pbandk.testpb.StringRules.FieldDescriptors.lenBytes,
                    pbandk.testpb.StringRules.FieldDescriptors.minBytes,
                    pbandk.testpb.StringRules.FieldDescriptors.maxBytes,
                    pbandk.testpb.StringRules.FieldDescriptors.pattern,
                    pbandk.testpb.StringRules.FieldDescriptors.prefix,
                    pbandk.testpb.StringRules.FieldDescriptors.suffix,
                    pbandk.testpb.StringRules.FieldDescriptors.contains,
                    pbandk.testpb.StringRules.FieldDescriptors.notContains,
                    pbandk.testpb.StringRules.FieldDescriptors.`in`,
                    pbandk.testpb.StringRules.FieldDescriptors.notIn,
                    pbandk.testpb.StringRules.FieldDescriptors.strict,
                ),
                oneofs = listOf(
                    pbandk.testpb.StringRules.FieldDescriptors.wellKnown,
                ),
            )
        }
    }
}

public sealed interface MutableStringRules : pbandk.testpb.StringRules, pbandk.MutableMessage<pbandk.testpb.StringRules> {
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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    public sealed interface WellKnown<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class Ip(ip: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.BytesRules, Boolean>(ip, pbandk.testpb.BytesRules.FieldDescriptors.ip)
        public class Ipv4(ipv4: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.BytesRules, Boolean>(ipv4, pbandk.testpb.BytesRules.FieldDescriptors.ipv4)
        public class Ipv6(ipv6: Boolean = false) :
            WellKnown<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.BytesRules, Boolean>(ipv6, pbandk.testpb.BytesRules.FieldDescriptors.ipv6)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.bytes(),
                jsonName = "const",
                value = pbandk.testpb.BytesRules::const,
                mutableValue = pbandk.testpb.MutableBytesRules::const,
            )
        public val minLen: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "min_len",
                number = 2,
                valueType = pbandk.types.uint64(),
                jsonName = "minLen",
                value = pbandk.testpb.BytesRules::minLen,
                mutableValue = pbandk.testpb.MutableBytesRules::minLen,
            )
        public val maxLen: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "max_len",
                number = 3,
                valueType = pbandk.types.uint64(),
                jsonName = "maxLen",
                value = pbandk.testpb.BytesRules::maxLen,
                mutableValue = pbandk.testpb.MutableBytesRules::maxLen,
            )
        public val pattern: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "pattern",
                number = 4,
                valueType = pbandk.types.string(),
                jsonName = "pattern",
                value = pbandk.testpb.BytesRules::pattern,
                mutableValue = pbandk.testpb.MutableBytesRules::pattern,
            )
        public val prefix: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "prefix",
                number = 5,
                valueType = pbandk.types.bytes(),
                jsonName = "prefix",
                value = pbandk.testpb.BytesRules::prefix,
                mutableValue = pbandk.testpb.MutableBytesRules::prefix,
            )
        public val suffix: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "suffix",
                number = 6,
                valueType = pbandk.types.bytes(),
                jsonName = "suffix",
                value = pbandk.testpb.BytesRules::suffix,
                mutableValue = pbandk.testpb.MutableBytesRules::suffix,
            )
        public val contains: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "contains",
                number = 7,
                valueType = pbandk.types.bytes(),
                jsonName = "contains",
                value = pbandk.testpb.BytesRules::contains,
                mutableValue = pbandk.testpb.MutableBytesRules::contains,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.BytesRules, List<pbandk.ByteArr>, MutableList<pbandk.ByteArr>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "in",
                number = 8,
                valueType = pbandk.types.bytes(),
                jsonName = "in",
                value = pbandk.testpb.BytesRules::`in`,
                mutableValue = pbandk.testpb.MutableBytesRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.BytesRules, List<pbandk.ByteArr>, MutableList<pbandk.ByteArr>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "not_in",
                number = 9,
                valueType = pbandk.types.bytes(),
                jsonName = "notIn",
                value = pbandk.testpb.BytesRules::notIn,
                mutableValue = pbandk.testpb.MutableBytesRules::notIn,
            )
        public val ip: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "ip",
                number = 10,
                valueType = pbandk.types.bool(),
                jsonName = "ip",
                value = pbandk.testpb.BytesRules::ip,
                mutableValue = pbandk.testpb.MutableBytesRules::ip,
            )
        public val ipv4: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "ipv4",
                number = 11,
                valueType = pbandk.types.bool(),
                jsonName = "ipv4",
                value = pbandk.testpb.BytesRules::ipv4,
                mutableValue = pbandk.testpb.MutableBytesRules::ipv4,
            )
        public val ipv6: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "ipv6",
                number = 12,
                valueType = pbandk.types.bool(),
                jsonName = "ipv6",
                value = pbandk.testpb.BytesRules::ipv6,
                mutableValue = pbandk.testpb.MutableBytesRules::ipv6,
            )
        public val len: pbandk.FieldDescriptor<pbandk.testpb.BytesRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                messageMetadata = pbandk.testpb.BytesRules.messageMetadata,
                name = "len",
                number = 13,
                valueType = pbandk.types.uint64(),
                jsonName = "len",
                value = pbandk.testpb.BytesRules::len,
                mutableValue = pbandk.testpb.MutableBytesRules::len,
            )

        public val wellKnown: pbandk.OneofDescriptor<pbandk.testpb.BytesRules, pbandk.testpb.BytesRules.WellKnown<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.testpb.BytesRules::descriptor,
                name = "well_known",
                value = pbandk.testpb.BytesRules::wellKnown,
                mutableValue = pbandk.testpb.MutableBytesRules::wellKnown,
                fields = listOf(
                    ip,
                    ipv4,
                    ipv6,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.BytesRules> {
        override val defaultInstance: pbandk.testpb.BytesRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.BytesRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.BytesRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BytesRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.BytesRules::class,
                messageCompanion = this,
                builder = ::BytesRules,
                fields = listOf(
                    pbandk.testpb.BytesRules.FieldDescriptors.const,
                    pbandk.testpb.BytesRules.FieldDescriptors.len,
                    pbandk.testpb.BytesRules.FieldDescriptors.minLen,
                    pbandk.testpb.BytesRules.FieldDescriptors.maxLen,
                    pbandk.testpb.BytesRules.FieldDescriptors.pattern,
                    pbandk.testpb.BytesRules.FieldDescriptors.prefix,
                    pbandk.testpb.BytesRules.FieldDescriptors.suffix,
                    pbandk.testpb.BytesRules.FieldDescriptors.contains,
                    pbandk.testpb.BytesRules.FieldDescriptors.`in`,
                    pbandk.testpb.BytesRules.FieldDescriptors.notIn,
                ),
                oneofs = listOf(
                    pbandk.testpb.BytesRules.FieldDescriptors.wellKnown,
                ),
            )
        }
    }
}

public sealed interface MutableBytesRules : pbandk.testpb.BytesRules, pbandk.MutableMessage<pbandk.testpb.BytesRules> {
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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        const: Int? = this.const,
        definedOnly: Boolean? = this.definedOnly,
        `in`: List<Int> = this.`in`,
        notIn: List<Int> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.EnumRules

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val const: pbandk.FieldDescriptor<pbandk.testpb.EnumRules, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.EnumRules::descriptor,
                messageMetadata = pbandk.testpb.EnumRules.messageMetadata,
                name = "const",
                number = 1,
                valueType = pbandk.types.int32(),
                jsonName = "const",
                value = pbandk.testpb.EnumRules::const,
                mutableValue = pbandk.testpb.MutableEnumRules::const,
            )
        public val definedOnly: pbandk.FieldDescriptor<pbandk.testpb.EnumRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.EnumRules::descriptor,
                messageMetadata = pbandk.testpb.EnumRules.messageMetadata,
                name = "defined_only",
                number = 2,
                valueType = pbandk.types.bool(),
                jsonName = "definedOnly",
                value = pbandk.testpb.EnumRules::definedOnly,
                mutableValue = pbandk.testpb.MutableEnumRules::definedOnly,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.EnumRules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.EnumRules::descriptor,
                messageMetadata = pbandk.testpb.EnumRules.messageMetadata,
                name = "in",
                number = 3,
                valueType = pbandk.types.int32(),
                jsonName = "in",
                value = pbandk.testpb.EnumRules::`in`,
                mutableValue = pbandk.testpb.MutableEnumRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.EnumRules, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.EnumRules::descriptor,
                messageMetadata = pbandk.testpb.EnumRules.messageMetadata,
                name = "not_in",
                number = 4,
                valueType = pbandk.types.int32(),
                jsonName = "notIn",
                value = pbandk.testpb.EnumRules::notIn,
                mutableValue = pbandk.testpb.MutableEnumRules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.EnumRules> {
        override val defaultInstance: pbandk.testpb.EnumRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.EnumRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.EnumRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.EnumRules::class,
                messageCompanion = this,
                builder = ::EnumRules,
                fields = listOf(
                    pbandk.testpb.EnumRules.FieldDescriptors.const,
                    pbandk.testpb.EnumRules.FieldDescriptors.definedOnly,
                    pbandk.testpb.EnumRules.FieldDescriptors.`in`,
                    pbandk.testpb.EnumRules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableEnumRules : pbandk.testpb.EnumRules, pbandk.MutableMessage<pbandk.testpb.EnumRules> {
    public override var const: Int?
    public override var definedOnly: Boolean?
    public override val `in`: MutableList<Int>
    public override val notIn: MutableList<Int>
}

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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        skip: Boolean? = this.skip,
        required: Boolean? = this.required,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MessageRules

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val skip: pbandk.FieldDescriptor<pbandk.testpb.MessageRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MessageRules::descriptor,
                messageMetadata = pbandk.testpb.MessageRules.messageMetadata,
                name = "skip",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "skip",
                value = pbandk.testpb.MessageRules::skip,
                mutableValue = pbandk.testpb.MutableMessageRules::skip,
            )
        public val required: pbandk.FieldDescriptor<pbandk.testpb.MessageRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MessageRules::descriptor,
                messageMetadata = pbandk.testpb.MessageRules.messageMetadata,
                name = "required",
                number = 2,
                valueType = pbandk.types.bool(),
                jsonName = "required",
                value = pbandk.testpb.MessageRules::required,
                mutableValue = pbandk.testpb.MutableMessageRules::required,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MessageRules> {
        override val defaultInstance: pbandk.testpb.MessageRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MessageRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.MessageRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MessageRules::class,
                messageCompanion = this,
                builder = ::MessageRules,
                fields = listOf(
                    pbandk.testpb.MessageRules.FieldDescriptors.skip,
                    pbandk.testpb.MessageRules.FieldDescriptors.required,
                ),
            )
        }
    }
}

public sealed interface MutableMessageRules : pbandk.testpb.MessageRules, pbandk.MutableMessage<pbandk.testpb.MessageRules> {
    public override var skip: Boolean?
    public override var required: Boolean?
}

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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        minItems: Long? = this.minItems,
        maxItems: Long? = this.maxItems,
        unique: Boolean? = this.unique,
        items: pbandk.testpb.FieldRules? = this.items,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.RepeatedRules

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val minItems: pbandk.FieldDescriptor<pbandk.testpb.RepeatedRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.RepeatedRules::descriptor,
                messageMetadata = pbandk.testpb.RepeatedRules.messageMetadata,
                name = "min_items",
                number = 1,
                valueType = pbandk.types.uint64(),
                jsonName = "minItems",
                value = pbandk.testpb.RepeatedRules::minItems,
                mutableValue = pbandk.testpb.MutableRepeatedRules::minItems,
            )
        public val maxItems: pbandk.FieldDescriptor<pbandk.testpb.RepeatedRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.RepeatedRules::descriptor,
                messageMetadata = pbandk.testpb.RepeatedRules.messageMetadata,
                name = "max_items",
                number = 2,
                valueType = pbandk.types.uint64(),
                jsonName = "maxItems",
                value = pbandk.testpb.RepeatedRules::maxItems,
                mutableValue = pbandk.testpb.MutableRepeatedRules::maxItems,
            )
        public val unique: pbandk.FieldDescriptor<pbandk.testpb.RepeatedRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.RepeatedRules::descriptor,
                messageMetadata = pbandk.testpb.RepeatedRules.messageMetadata,
                name = "unique",
                number = 3,
                valueType = pbandk.types.bool(),
                jsonName = "unique",
                value = pbandk.testpb.RepeatedRules::unique,
                mutableValue = pbandk.testpb.MutableRepeatedRules::unique,
            )
        public val items: pbandk.FieldDescriptor<pbandk.testpb.RepeatedRules, pbandk.testpb.FieldRules?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.RepeatedRules::descriptor,
                messageMetadata = pbandk.testpb.RepeatedRules.messageMetadata,
                name = "items",
                number = 4,
                valueType = pbandk.types.message(pbandk.testpb.FieldRules),
                jsonName = "items",
                value = pbandk.testpb.RepeatedRules::items,
                mutableValue = pbandk.testpb.MutableRepeatedRules::items,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.RepeatedRules> {
        override val defaultInstance: pbandk.testpb.RepeatedRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.RepeatedRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.RepeatedRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.RepeatedRules::class,
                messageCompanion = this,
                builder = ::RepeatedRules,
                fields = listOf(
                    pbandk.testpb.RepeatedRules.FieldDescriptors.minItems,
                    pbandk.testpb.RepeatedRules.FieldDescriptors.maxItems,
                    pbandk.testpb.RepeatedRules.FieldDescriptors.unique,
                    pbandk.testpb.RepeatedRules.FieldDescriptors.items,
                ),
            )
        }
    }
}

public sealed interface MutableRepeatedRules : pbandk.testpb.RepeatedRules, pbandk.MutableMessage<pbandk.testpb.RepeatedRules> {
    public override var minItems: Long?
    public override var maxItems: Long?
    public override var unique: Boolean?
    public override var items: pbandk.testpb.FieldRules?
}

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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        minPairs: Long? = this.minPairs,
        maxPairs: Long? = this.maxPairs,
        noSparse: Boolean? = this.noSparse,
        keys: pbandk.testpb.FieldRules? = this.keys,
        values: pbandk.testpb.FieldRules? = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MapRules

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val minPairs: pbandk.FieldDescriptor<pbandk.testpb.MapRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MapRules::descriptor,
                messageMetadata = pbandk.testpb.MapRules.messageMetadata,
                name = "min_pairs",
                number = 1,
                valueType = pbandk.types.uint64(),
                jsonName = "minPairs",
                value = pbandk.testpb.MapRules::minPairs,
                mutableValue = pbandk.testpb.MutableMapRules::minPairs,
            )
        public val maxPairs: pbandk.FieldDescriptor<pbandk.testpb.MapRules, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MapRules::descriptor,
                messageMetadata = pbandk.testpb.MapRules.messageMetadata,
                name = "max_pairs",
                number = 2,
                valueType = pbandk.types.uint64(),
                jsonName = "maxPairs",
                value = pbandk.testpb.MapRules::maxPairs,
                mutableValue = pbandk.testpb.MutableMapRules::maxPairs,
            )
        public val noSparse: pbandk.FieldDescriptor<pbandk.testpb.MapRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MapRules::descriptor,
                messageMetadata = pbandk.testpb.MapRules.messageMetadata,
                name = "no_sparse",
                number = 3,
                valueType = pbandk.types.bool(),
                jsonName = "noSparse",
                value = pbandk.testpb.MapRules::noSparse,
                mutableValue = pbandk.testpb.MutableMapRules::noSparse,
            )
        public val keys: pbandk.FieldDescriptor<pbandk.testpb.MapRules, pbandk.testpb.FieldRules?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MapRules::descriptor,
                messageMetadata = pbandk.testpb.MapRules.messageMetadata,
                name = "keys",
                number = 4,
                valueType = pbandk.types.message(pbandk.testpb.FieldRules),
                jsonName = "keys",
                value = pbandk.testpb.MapRules::keys,
                mutableValue = pbandk.testpb.MutableMapRules::keys,
            )
        public val values: pbandk.FieldDescriptor<pbandk.testpb.MapRules, pbandk.testpb.FieldRules?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.MapRules::descriptor,
                messageMetadata = pbandk.testpb.MapRules.messageMetadata,
                name = "values",
                number = 5,
                valueType = pbandk.types.message(pbandk.testpb.FieldRules),
                jsonName = "values",
                value = pbandk.testpb.MapRules::values,
                mutableValue = pbandk.testpb.MutableMapRules::values,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MapRules> {
        override val defaultInstance: pbandk.testpb.MapRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MapRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.MapRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MapRules::class,
                messageCompanion = this,
                builder = ::MapRules,
                fields = listOf(
                    pbandk.testpb.MapRules.FieldDescriptors.minPairs,
                    pbandk.testpb.MapRules.FieldDescriptors.maxPairs,
                    pbandk.testpb.MapRules.FieldDescriptors.noSparse,
                    pbandk.testpb.MapRules.FieldDescriptors.keys,
                    pbandk.testpb.MapRules.FieldDescriptors.values,
                ),
            )
        }
    }
}

public sealed interface MutableMapRules : pbandk.testpb.MapRules, pbandk.MutableMessage<pbandk.testpb.MapRules> {
    public override var minPairs: Long?
    public override var maxPairs: Long?
    public override var noSparse: Boolean?
    public override var keys: pbandk.testpb.FieldRules?
    public override var values: pbandk.testpb.FieldRules?
}

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

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        required: Boolean? = this.required,
        `in`: List<String> = this.`in`,
        notIn: List<String> = this.notIn,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.AnyRules

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val required: pbandk.FieldDescriptor<pbandk.testpb.AnyRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.AnyRules::descriptor,
                messageMetadata = pbandk.testpb.AnyRules.messageMetadata,
                name = "required",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "required",
                value = pbandk.testpb.AnyRules::required,
                mutableValue = pbandk.testpb.MutableAnyRules::required,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.AnyRules, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.AnyRules::descriptor,
                messageMetadata = pbandk.testpb.AnyRules.messageMetadata,
                name = "in",
                number = 2,
                valueType = pbandk.types.string(),
                jsonName = "in",
                value = pbandk.testpb.AnyRules::`in`,
                mutableValue = pbandk.testpb.MutableAnyRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.AnyRules, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.AnyRules::descriptor,
                messageMetadata = pbandk.testpb.AnyRules.messageMetadata,
                name = "not_in",
                number = 3,
                valueType = pbandk.types.string(),
                jsonName = "notIn",
                value = pbandk.testpb.AnyRules::notIn,
                mutableValue = pbandk.testpb.MutableAnyRules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.AnyRules> {
        override val defaultInstance: pbandk.testpb.AnyRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.AnyRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.AnyRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.AnyRules::class,
                messageCompanion = this,
                builder = ::AnyRules,
                fields = listOf(
                    pbandk.testpb.AnyRules.FieldDescriptors.required,
                    pbandk.testpb.AnyRules.FieldDescriptors.`in`,
                    pbandk.testpb.AnyRules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableAnyRules : pbandk.testpb.AnyRules, pbandk.MutableMessage<pbandk.testpb.AnyRules> {
    public override var required: Boolean?
    public override val `in`: MutableList<String>
    public override val notIn: MutableList<String>
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

    /**
     * The [MutableDurationRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit): pbandk.testpb.DurationRules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val required: pbandk.FieldDescriptor<pbandk.testpb.DurationRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "required",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "required",
                value = pbandk.testpb.DurationRules::required,
                mutableValue = pbandk.testpb.MutableDurationRules::required,
            )
        public val const: pbandk.FieldDescriptor<pbandk.testpb.DurationRules, pbandk.wkt.Duration?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "const",
                number = 2,
                valueType = pbandk.types.duration(),
                jsonName = "const",
                value = pbandk.testpb.DurationRules::const,
                mutableValue = pbandk.testpb.MutableDurationRules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.DurationRules, pbandk.wkt.Duration?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "lt",
                number = 3,
                valueType = pbandk.types.duration(),
                jsonName = "lt",
                value = pbandk.testpb.DurationRules::lt,
                mutableValue = pbandk.testpb.MutableDurationRules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.DurationRules, pbandk.wkt.Duration?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "lte",
                number = 4,
                valueType = pbandk.types.duration(),
                jsonName = "lte",
                value = pbandk.testpb.DurationRules::lte,
                mutableValue = pbandk.testpb.MutableDurationRules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.DurationRules, pbandk.wkt.Duration?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "gt",
                number = 5,
                valueType = pbandk.types.duration(),
                jsonName = "gt",
                value = pbandk.testpb.DurationRules::gt,
                mutableValue = pbandk.testpb.MutableDurationRules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.DurationRules, pbandk.wkt.Duration?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "gte",
                number = 6,
                valueType = pbandk.types.duration(),
                jsonName = "gte",
                value = pbandk.testpb.DurationRules::gte,
                mutableValue = pbandk.testpb.MutableDurationRules::gte,
            )
        public val `in`: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.DurationRules, List<pbandk.wkt.Duration>, MutableList<pbandk.wkt.Duration>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "in",
                number = 7,
                valueType = pbandk.types.duration(),
                jsonName = "in",
                value = pbandk.testpb.DurationRules::`in`,
                mutableValue = pbandk.testpb.MutableDurationRules::`in`,
            )
        public val notIn: pbandk.FieldDescriptor.MutableValue<pbandk.testpb.DurationRules, List<pbandk.wkt.Duration>, MutableList<pbandk.wkt.Duration>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.testpb.DurationRules::descriptor,
                messageMetadata = pbandk.testpb.DurationRules.messageMetadata,
                name = "not_in",
                number = 8,
                valueType = pbandk.types.duration(),
                jsonName = "notIn",
                value = pbandk.testpb.DurationRules::notIn,
                mutableValue = pbandk.testpb.MutableDurationRules::notIn,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.DurationRules> {
        override val defaultInstance: pbandk.testpb.DurationRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.DurationRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.DurationRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DurationRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.DurationRules::class,
                messageCompanion = this,
                builder = ::DurationRules,
                fields = listOf(
                    pbandk.testpb.DurationRules.FieldDescriptors.required,
                    pbandk.testpb.DurationRules.FieldDescriptors.const,
                    pbandk.testpb.DurationRules.FieldDescriptors.lt,
                    pbandk.testpb.DurationRules.FieldDescriptors.lte,
                    pbandk.testpb.DurationRules.FieldDescriptors.gt,
                    pbandk.testpb.DurationRules.FieldDescriptors.gte,
                    pbandk.testpb.DurationRules.FieldDescriptors.`in`,
                    pbandk.testpb.DurationRules.FieldDescriptors.notIn,
                ),
            )
        }
    }
}

public sealed interface MutableDurationRules : pbandk.testpb.DurationRules, pbandk.MutableMessage<pbandk.testpb.DurationRules> {
    public override var required: Boolean?
    public override var const: pbandk.wkt.Duration?
    public override var lt: pbandk.wkt.Duration?
    public override var lte: pbandk.wkt.Duration?
    public override var gt: pbandk.wkt.Duration?
    public override var gte: pbandk.wkt.Duration?
    public override val `in`: MutableList<pbandk.wkt.Duration>
    public override val notIn: MutableList<pbandk.wkt.Duration>
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

    /**
     * The [MutableTimestampRules] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit): pbandk.testpb.TimestampRules

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val required: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "required",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "required",
                value = pbandk.testpb.TimestampRules::required,
                mutableValue = pbandk.testpb.MutableTimestampRules::required,
            )
        public val const: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "const",
                number = 2,
                valueType = pbandk.types.timestamp(),
                jsonName = "const",
                value = pbandk.testpb.TimestampRules::const,
                mutableValue = pbandk.testpb.MutableTimestampRules::const,
            )
        public val lt: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "lt",
                number = 3,
                valueType = pbandk.types.timestamp(),
                jsonName = "lt",
                value = pbandk.testpb.TimestampRules::lt,
                mutableValue = pbandk.testpb.MutableTimestampRules::lt,
            )
        public val lte: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "lte",
                number = 4,
                valueType = pbandk.types.timestamp(),
                jsonName = "lte",
                value = pbandk.testpb.TimestampRules::lte,
                mutableValue = pbandk.testpb.MutableTimestampRules::lte,
            )
        public val gt: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "gt",
                number = 5,
                valueType = pbandk.types.timestamp(),
                jsonName = "gt",
                value = pbandk.testpb.TimestampRules::gt,
                mutableValue = pbandk.testpb.MutableTimestampRules::gt,
            )
        public val gte: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "gte",
                number = 6,
                valueType = pbandk.types.timestamp(),
                jsonName = "gte",
                value = pbandk.testpb.TimestampRules::gte,
                mutableValue = pbandk.testpb.MutableTimestampRules::gte,
            )
        public val ltNow: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "lt_now",
                number = 7,
                valueType = pbandk.types.bool(),
                jsonName = "ltNow",
                value = pbandk.testpb.TimestampRules::ltNow,
                mutableValue = pbandk.testpb.MutableTimestampRules::ltNow,
            )
        public val gtNow: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "gt_now",
                number = 8,
                valueType = pbandk.types.bool(),
                jsonName = "gtNow",
                value = pbandk.testpb.TimestampRules::gtNow,
                mutableValue = pbandk.testpb.MutableTimestampRules::gtNow,
            )
        public val within: pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, pbandk.wkt.Duration?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.testpb.TimestampRules::descriptor,
                messageMetadata = pbandk.testpb.TimestampRules.messageMetadata,
                name = "within",
                number = 9,
                valueType = pbandk.types.duration(),
                jsonName = "within",
                value = pbandk.testpb.TimestampRules::within,
                mutableValue = pbandk.testpb.MutableTimestampRules::within,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.TimestampRules> {
        override val defaultInstance: pbandk.testpb.TimestampRules by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.TimestampRules {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.TimestampRules",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TimestampRules> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.TimestampRules::class,
                messageCompanion = this,
                builder = ::TimestampRules,
                fields = listOf(
                    pbandk.testpb.TimestampRules.FieldDescriptors.required,
                    pbandk.testpb.TimestampRules.FieldDescriptors.const,
                    pbandk.testpb.TimestampRules.FieldDescriptors.lt,
                    pbandk.testpb.TimestampRules.FieldDescriptors.lte,
                    pbandk.testpb.TimestampRules.FieldDescriptors.gt,
                    pbandk.testpb.TimestampRules.FieldDescriptors.gte,
                    pbandk.testpb.TimestampRules.FieldDescriptors.ltNow,
                    pbandk.testpb.TimestampRules.FieldDescriptors.gtNow,
                    pbandk.testpb.TimestampRules.FieldDescriptors.within,
                ),
            )
        }
    }
}

public sealed interface MutableTimestampRules : pbandk.testpb.TimestampRules, pbandk.MutableMessage<pbandk.testpb.TimestampRules> {
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

public val pbandk.wkt.MessageOptions.disabled: Boolean?
    get() = pbandk.testpb.disabled.getValue(this)

public var pbandk.wkt.MutableMessageOptions.disabled: Boolean?
    get() = pbandk.testpb.disabled.getValue(this)
    set(value) = pbandk.testpb.disabled.setValue(this, value)

@pbandk.Export
public val disabled: pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, Boolean?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.MessageOptions::descriptor,
        fullName = "pbandk.testpb.disabled",
        number = 1071,
        valueType = pbandk.types.bool(),
        jsonName = "disabled",
    )

public val pbandk.wkt.OneofOptions.required: Boolean?
    get() = pbandk.testpb.required.getValue(this)

public var pbandk.wkt.MutableOneofOptions.required: Boolean?
    get() = pbandk.testpb.required.getValue(this)
    set(value) = pbandk.testpb.required.setValue(this, value)

@pbandk.Export
public val required: pbandk.FieldDescriptor<pbandk.wkt.OneofOptions, Boolean?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.OneofOptions::descriptor,
        fullName = "pbandk.testpb.required",
        number = 1071,
        valueType = pbandk.types.bool(),
        jsonName = "required",
    )

public val pbandk.wkt.FieldOptions.rules: pbandk.testpb.FieldRules?
    get() = pbandk.testpb.rules.getValue(this)

public var pbandk.wkt.MutableFieldOptions.rules: pbandk.testpb.FieldRules?
    get() = pbandk.testpb.rules.getValue(this)
    set(value) = pbandk.testpb.rules.setValue(this, value)

@pbandk.Export
public val rules: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, pbandk.testpb.FieldRules?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
        fullName = "pbandk.testpb.rules",
        number = 1071,
        valueType = pbandk.types.message(pbandk.testpb.FieldRules),
        jsonName = "rules",
    )

@Deprecated(
    message = "Use FieldRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.FieldRules"],
        expression = "FieldRules {\nthis.message = message\nthis.type = type\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildFieldRules")
public fun FieldRules(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit): pbandk.testpb.FieldRules =
    pbandk.testpb.MutableFieldRules_Impl(
        message = null,
        type = null,
    ).also(builderAction).toFieldRules()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldRules")
public fun FieldRules?.orDefault(): pbandk.testpb.FieldRules = this ?: pbandk.testpb.FieldRules.defaultInstance

private class FieldRules_Impl(
    override val message: pbandk.testpb.MessageRules?,
    override val type: pbandk.testpb.FieldRules.Type<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FieldRules, pbandk.gen.GeneratedMessage<pbandk.testpb.FieldRules>(unknownFields) {
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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableFieldRules_Impl(
    override var message: pbandk.testpb.MessageRules?,
    override var type: pbandk.testpb.FieldRules.Type<*>?,
) : pbandk.testpb.MutableFieldRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FieldRules>() {
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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFieldRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: pbandk.testpb.MessageRules?,
        type: pbandk.testpb.FieldRules.Type<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFieldRules() = FieldRules_Impl(
        message = message,
        type = type,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FloatRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.FloatRules"],
        expression = "FloatRules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildFloatRules")
public fun FloatRules(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit): pbandk.testpb.FloatRules =
    pbandk.testpb.MutableFloatRules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.FloatRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.FloatRules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Float>,
    override val notIn: pbandk.gen.ListField<Float>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.FloatRules, pbandk.gen.GeneratedMessage<pbandk.testpb.FloatRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.FloatRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableFloatRules_Impl(
    override var const: Float?,
    override var lt: Float?,
    override var lte: Float?,
    override var gt: Float?,
    override var gte: Float?,
    override val `in`: pbandk.gen.MutableListField<Float>,
    override val notIn: pbandk.gen.MutableListField<Float>,
) : pbandk.testpb.MutableFloatRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.FloatRules>() {
    override val descriptor get() = pbandk.testpb.FloatRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFloatRules.() -> Unit) = super.copy(builderAction)

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

    fun toFloatRules() = FloatRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use DoubleRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.DoubleRules"],
        expression = "DoubleRules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildDoubleRules")
public fun DoubleRules(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit): pbandk.testpb.DoubleRules =
    pbandk.testpb.MutableDoubleRules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.DoubleRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.DoubleRules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Double>,
    override val notIn: pbandk.gen.ListField<Double>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.DoubleRules, pbandk.gen.GeneratedMessage<pbandk.testpb.DoubleRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.DoubleRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableDoubleRules_Impl(
    override var const: Double?,
    override var lt: Double?,
    override var lte: Double?,
    override var gt: Double?,
    override var gte: Double?,
    override val `in`: pbandk.gen.MutableListField<Double>,
    override val notIn: pbandk.gen.MutableListField<Double>,
) : pbandk.testpb.MutableDoubleRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.DoubleRules>() {
    override val descriptor get() = pbandk.testpb.DoubleRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableDoubleRules.() -> Unit) = super.copy(builderAction)

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

    fun toDoubleRules() = DoubleRules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Int32Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Int32Rules"],
        expression = "Int32Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildInt32Rules")
public fun Int32Rules(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit): pbandk.testpb.Int32Rules =
    pbandk.testpb.MutableInt32Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.Int32Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.Int32Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Int>,
    override val notIn: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Int32Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.Int32Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Int32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: pbandk.gen.MutableListField<Int>,
    override val notIn: pbandk.gen.MutableListField<Int>,
) : pbandk.testpb.MutableInt32Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Int32Rules>() {
    override val descriptor get() = pbandk.testpb.Int32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableInt32Rules.() -> Unit) = super.copy(builderAction)

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

    fun toInt32Rules() = Int32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Int64Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Int64Rules"],
        expression = "Int64Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildInt64Rules")
public fun Int64Rules(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit): pbandk.testpb.Int64Rules =
    pbandk.testpb.MutableInt64Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.Int64Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.Int64Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Long>,
    override val notIn: pbandk.gen.ListField<Long>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Int64Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.Int64Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Int64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: pbandk.gen.MutableListField<Long>,
    override val notIn: pbandk.gen.MutableListField<Long>,
) : pbandk.testpb.MutableInt64Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Int64Rules>() {
    override val descriptor get() = pbandk.testpb.Int64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableInt64Rules.() -> Unit) = super.copy(builderAction)

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

    fun toInt64Rules() = Int64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use UInt32Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.UInt32Rules"],
        expression = "UInt32Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildUInt32Rules")
public fun UInt32Rules(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit): pbandk.testpb.UInt32Rules =
    pbandk.testpb.MutableUInt32Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.UInt32Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.UInt32Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Int>,
    override val notIn: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.UInt32Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.UInt32Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.UInt32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableUInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: pbandk.gen.MutableListField<Int>,
    override val notIn: pbandk.gen.MutableListField<Int>,
) : pbandk.testpb.MutableUInt32Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.UInt32Rules>() {
    override val descriptor get() = pbandk.testpb.UInt32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableUInt32Rules.() -> Unit) = super.copy(builderAction)

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

    fun toUInt32Rules() = UInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use UInt64Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.UInt64Rules"],
        expression = "UInt64Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildUInt64Rules")
public fun UInt64Rules(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit): pbandk.testpb.UInt64Rules =
    pbandk.testpb.MutableUInt64Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.UInt64Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.UInt64Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Long>,
    override val notIn: pbandk.gen.ListField<Long>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.UInt64Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.UInt64Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.UInt64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableUInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: pbandk.gen.MutableListField<Long>,
    override val notIn: pbandk.gen.MutableListField<Long>,
) : pbandk.testpb.MutableUInt64Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.UInt64Rules>() {
    override val descriptor get() = pbandk.testpb.UInt64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableUInt64Rules.() -> Unit) = super.copy(builderAction)

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

    fun toUInt64Rules() = UInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use SInt32Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.SInt32Rules"],
        expression = "SInt32Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildSInt32Rules")
public fun SInt32Rules(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit): pbandk.testpb.SInt32Rules =
    pbandk.testpb.MutableSInt32Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.SInt32Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.SInt32Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Int>,
    override val notIn: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SInt32Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.SInt32Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.SInt32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableSInt32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: pbandk.gen.MutableListField<Int>,
    override val notIn: pbandk.gen.MutableListField<Int>,
) : pbandk.testpb.MutableSInt32Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.SInt32Rules>() {
    override val descriptor get() = pbandk.testpb.SInt32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSInt32Rules.() -> Unit) = super.copy(builderAction)

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

    fun toSInt32Rules() = SInt32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use SInt64Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.SInt64Rules"],
        expression = "SInt64Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildSInt64Rules")
public fun SInt64Rules(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit): pbandk.testpb.SInt64Rules =
    pbandk.testpb.MutableSInt64Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.SInt64Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.SInt64Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Long>,
    override val notIn: pbandk.gen.ListField<Long>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SInt64Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.SInt64Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.SInt64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableSInt64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: pbandk.gen.MutableListField<Long>,
    override val notIn: pbandk.gen.MutableListField<Long>,
) : pbandk.testpb.MutableSInt64Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.SInt64Rules>() {
    override val descriptor get() = pbandk.testpb.SInt64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSInt64Rules.() -> Unit) = super.copy(builderAction)

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

    fun toSInt64Rules() = SInt64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Fixed32Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Fixed32Rules"],
        expression = "Fixed32Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildFixed32Rules")
public fun Fixed32Rules(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit): pbandk.testpb.Fixed32Rules =
    pbandk.testpb.MutableFixed32Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.Fixed32Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.Fixed32Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Int>,
    override val notIn: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Fixed32Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.Fixed32Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Fixed32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableFixed32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: pbandk.gen.MutableListField<Int>,
    override val notIn: pbandk.gen.MutableListField<Int>,
) : pbandk.testpb.MutableFixed32Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Fixed32Rules>() {
    override val descriptor get() = pbandk.testpb.Fixed32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFixed32Rules.() -> Unit) = super.copy(builderAction)

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

    fun toFixed32Rules() = Fixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Fixed64Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Fixed64Rules"],
        expression = "Fixed64Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildFixed64Rules")
public fun Fixed64Rules(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit): pbandk.testpb.Fixed64Rules =
    pbandk.testpb.MutableFixed64Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.Fixed64Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.Fixed64Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Long>,
    override val notIn: pbandk.gen.ListField<Long>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Fixed64Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.Fixed64Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Fixed64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableFixed64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: pbandk.gen.MutableListField<Long>,
    override val notIn: pbandk.gen.MutableListField<Long>,
) : pbandk.testpb.MutableFixed64Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Fixed64Rules>() {
    override val descriptor get() = pbandk.testpb.Fixed64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableFixed64Rules.() -> Unit) = super.copy(builderAction)

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

    fun toFixed64Rules() = Fixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use SFixed32Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.SFixed32Rules"],
        expression = "SFixed32Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildSFixed32Rules")
public fun SFixed32Rules(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit): pbandk.testpb.SFixed32Rules =
    pbandk.testpb.MutableSFixed32Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.SFixed32Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.SFixed32Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Int>,
    override val notIn: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SFixed32Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.SFixed32Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.SFixed32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableSFixed32Rules_Impl(
    override var const: Int?,
    override var lt: Int?,
    override var lte: Int?,
    override var gt: Int?,
    override var gte: Int?,
    override val `in`: pbandk.gen.MutableListField<Int>,
    override val notIn: pbandk.gen.MutableListField<Int>,
) : pbandk.testpb.MutableSFixed32Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.SFixed32Rules>() {
    override val descriptor get() = pbandk.testpb.SFixed32Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSFixed32Rules.() -> Unit) = super.copy(builderAction)

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

    fun toSFixed32Rules() = SFixed32Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use SFixed64Rules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.SFixed64Rules"],
        expression = "SFixed64Rules {\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildSFixed64Rules")
public fun SFixed64Rules(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit): pbandk.testpb.SFixed64Rules =
    pbandk.testpb.MutableSFixed64Rules_Impl(
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.SFixed64Rules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.SFixed64Rules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<Long>,
    override val notIn: pbandk.gen.ListField<Long>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SFixed64Rules, pbandk.gen.GeneratedMessage<pbandk.testpb.SFixed64Rules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.SFixed64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableSFixed64Rules_Impl(
    override var const: Long?,
    override var lt: Long?,
    override var lte: Long?,
    override var gt: Long?,
    override var gte: Long?,
    override val `in`: pbandk.gen.MutableListField<Long>,
    override val notIn: pbandk.gen.MutableListField<Long>,
) : pbandk.testpb.MutableSFixed64Rules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.SFixed64Rules>() {
    override val descriptor get() = pbandk.testpb.SFixed64Rules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSFixed64Rules.() -> Unit) = super.copy(builderAction)

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

    fun toSFixed64Rules() = SFixed64Rules_Impl(
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use BoolRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.BoolRules"],
        expression = "BoolRules {\nthis.const = const\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildBoolRules")
public fun BoolRules(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit): pbandk.testpb.BoolRules =
    pbandk.testpb.MutableBoolRules_Impl(
        const = null,
    ).also(builderAction).toBoolRules()

@pbandk.Export
@pbandk.JsName("orDefaultForBoolRules")
public fun BoolRules?.orDefault(): pbandk.testpb.BoolRules = this ?: pbandk.testpb.BoolRules.defaultInstance

private class BoolRules_Impl(
    override val const: Boolean?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.BoolRules, pbandk.gen.GeneratedMessage<pbandk.testpb.BoolRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.BoolRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.BoolRules {
        this.const = const
        this.unknownFields += unknownFields
    }
}

private class MutableBoolRules_Impl(
    override var const: Boolean?,
) : pbandk.testpb.MutableBoolRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.BoolRules>() {
    override val descriptor get() = pbandk.testpb.BoolRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableBoolRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toBoolRules() = BoolRules_Impl(
        const = const,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use StringRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.StringRules"],
        expression = "StringRules {\nthis.const = const\nthis.len = len\nthis.minLen = minLen\nthis.maxLen = maxLen\nthis.lenBytes = lenBytes\nthis.minBytes = minBytes\nthis.maxBytes = maxBytes\nthis.pattern = pattern\nthis.prefix = prefix\nthis.suffix = suffix\nthis.contains = contains\nthis.notContains = notContains\nthis.`in` += `in`\nthis.notIn += notIn\nthis.strict = strict\nthis.wellKnown = wellKnown\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildStringRules")
public fun StringRules(builderAction: pbandk.testpb.MutableStringRules.() -> Unit): pbandk.testpb.StringRules =
    pbandk.testpb.MutableStringRules_Impl(
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
        `in` = pbandk.gen.MutableListField(pbandk.testpb.StringRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.StringRules.FieldDescriptors.notIn),
        strict = null,
        wellKnown = null,
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
    override val `in`: pbandk.gen.ListField<String>,
    override val notIn: pbandk.gen.ListField<String>,
    override val strict: Boolean?,
    override val wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.StringRules, pbandk.gen.GeneratedMessage<pbandk.testpb.StringRules>(unknownFields) {
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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableStringRules.() -> Unit) = super.copy(builderAction)

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
    override val `in`: pbandk.gen.MutableListField<String>,
    override val notIn: pbandk.gen.MutableListField<String>,
    override var strict: Boolean?,
    override var wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
) : pbandk.testpb.MutableStringRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.StringRules>() {
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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableStringRules.() -> Unit) = super.copy(builderAction)

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
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        strict = strict,
        wellKnown = wellKnown,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use BytesRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.BytesRules"],
        expression = "BytesRules {\nthis.const = const\nthis.len = len\nthis.minLen = minLen\nthis.maxLen = maxLen\nthis.pattern = pattern\nthis.prefix = prefix\nthis.suffix = suffix\nthis.contains = contains\nthis.`in` += `in`\nthis.notIn += notIn\nthis.wellKnown = wellKnown\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildBytesRules")
public fun BytesRules(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit): pbandk.testpb.BytesRules =
    pbandk.testpb.MutableBytesRules_Impl(
        const = null,
        len = null,
        minLen = null,
        maxLen = null,
        pattern = null,
        prefix = null,
        suffix = null,
        contains = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.BytesRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.BytesRules.FieldDescriptors.notIn),
        wellKnown = null,
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
    override val `in`: pbandk.gen.ListField<pbandk.ByteArr>,
    override val notIn: pbandk.gen.ListField<pbandk.ByteArr>,
    override val wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.BytesRules, pbandk.gen.GeneratedMessage<pbandk.testpb.BytesRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.BytesRules.descriptor

    override val ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ip)?.value
    override val ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv4)?.value
    override val ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv6)?.value

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit) = super.copy(builderAction)

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
    override val `in`: pbandk.gen.MutableListField<pbandk.ByteArr>,
    override val notIn: pbandk.gen.MutableListField<pbandk.ByteArr>,
    override var wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
) : pbandk.testpb.MutableBytesRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.BytesRules>() {
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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableBytesRules.() -> Unit) = super.copy(builderAction)

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

    fun toBytesRules() = BytesRules_Impl(
        const = const,
        len = len,
        minLen = minLen,
        maxLen = maxLen,
        pattern = pattern,
        prefix = prefix,
        suffix = suffix,
        contains = contains,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        wellKnown = wellKnown,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use EnumRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.EnumRules"],
        expression = "EnumRules {\nthis.const = const\nthis.definedOnly = definedOnly\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildEnumRules")
public fun EnumRules(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit): pbandk.testpb.EnumRules =
    pbandk.testpb.MutableEnumRules_Impl(
        const = null,
        definedOnly = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.EnumRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.EnumRules.FieldDescriptors.notIn),
    ).also(builderAction).toEnumRules()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumRules")
public fun EnumRules?.orDefault(): pbandk.testpb.EnumRules = this ?: pbandk.testpb.EnumRules.defaultInstance

private class EnumRules_Impl(
    override val const: Int?,
    override val definedOnly: Boolean?,
    override val `in`: pbandk.gen.ListField<Int>,
    override val notIn: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.EnumRules, pbandk.gen.GeneratedMessage<pbandk.testpb.EnumRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.EnumRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableEnumRules_Impl(
    override var const: Int?,
    override var definedOnly: Boolean?,
    override val `in`: pbandk.gen.MutableListField<Int>,
    override val notIn: pbandk.gen.MutableListField<Int>,
) : pbandk.testpb.MutableEnumRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.EnumRules>() {
    override val descriptor get() = pbandk.testpb.EnumRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableEnumRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        const: Int?,
        definedOnly: Boolean?,
        `in`: List<Int>,
        notIn: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toEnumRules() = EnumRules_Impl(
        const = const,
        definedOnly = definedOnly,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MessageRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MessageRules"],
        expression = "MessageRules {\nthis.skip = skip\nthis.required = required\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildMessageRules")
public fun MessageRules(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit): pbandk.testpb.MessageRules =
    pbandk.testpb.MutableMessageRules_Impl(
        skip = null,
        required = null,
    ).also(builderAction).toMessageRules()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageRules")
public fun MessageRules?.orDefault(): pbandk.testpb.MessageRules = this ?: pbandk.testpb.MessageRules.defaultInstance

private class MessageRules_Impl(
    override val skip: Boolean?,
    override val required: Boolean?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MessageRules, pbandk.gen.GeneratedMessage<pbandk.testpb.MessageRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MessageRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableMessageRules_Impl(
    override var skip: Boolean?,
    override var required: Boolean?,
) : pbandk.testpb.MutableMessageRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MessageRules>() {
    override val descriptor get() = pbandk.testpb.MessageRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMessageRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        skip: Boolean?,
        required: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageRules() = MessageRules_Impl(
        skip = skip,
        required = required,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use RepeatedRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.RepeatedRules"],
        expression = "RepeatedRules {\nthis.minItems = minItems\nthis.maxItems = maxItems\nthis.unique = unique\nthis.items = items\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildRepeatedRules")
public fun RepeatedRules(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit): pbandk.testpb.RepeatedRules =
    pbandk.testpb.MutableRepeatedRules_Impl(
        minItems = null,
        maxItems = null,
        unique = null,
        items = null,
    ).also(builderAction).toRepeatedRules()

@pbandk.Export
@pbandk.JsName("orDefaultForRepeatedRules")
public fun RepeatedRules?.orDefault(): pbandk.testpb.RepeatedRules = this ?: pbandk.testpb.RepeatedRules.defaultInstance

private class RepeatedRules_Impl(
    override val minItems: Long?,
    override val maxItems: Long?,
    override val unique: Boolean?,
    override val items: pbandk.testpb.FieldRules?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.RepeatedRules, pbandk.gen.GeneratedMessage<pbandk.testpb.RepeatedRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.RepeatedRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableRepeatedRules_Impl(
    override var minItems: Long?,
    override var maxItems: Long?,
    override var unique: Boolean?,
    override var items: pbandk.testpb.FieldRules?,
) : pbandk.testpb.MutableRepeatedRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.RepeatedRules>() {
    override val descriptor get() = pbandk.testpb.RepeatedRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableRepeatedRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        minItems: Long?,
        maxItems: Long?,
        unique: Boolean?,
        items: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toRepeatedRules() = RepeatedRules_Impl(
        minItems = minItems,
        maxItems = maxItems,
        unique = unique,
        items = items,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MapRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MapRules"],
        expression = "MapRules {\nthis.minPairs = minPairs\nthis.maxPairs = maxPairs\nthis.noSparse = noSparse\nthis.keys = keys\nthis.values = values\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildMapRules")
public fun MapRules(builderAction: pbandk.testpb.MutableMapRules.() -> Unit): pbandk.testpb.MapRules =
    pbandk.testpb.MutableMapRules_Impl(
        minPairs = null,
        maxPairs = null,
        noSparse = null,
        keys = null,
        values = null,
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
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MapRules, pbandk.gen.GeneratedMessage<pbandk.testpb.MapRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MapRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMapRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableMapRules_Impl(
    override var minPairs: Long?,
    override var maxPairs: Long?,
    override var noSparse: Boolean?,
    override var keys: pbandk.testpb.FieldRules?,
    override var values: pbandk.testpb.FieldRules?,
) : pbandk.testpb.MutableMapRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MapRules>() {
    override val descriptor get() = pbandk.testpb.MapRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMapRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        minPairs: Long?,
        maxPairs: Long?,
        noSparse: Boolean?,
        keys: pbandk.testpb.FieldRules?,
        values: pbandk.testpb.FieldRules?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMapRules() = MapRules_Impl(
        minPairs = minPairs,
        maxPairs = maxPairs,
        noSparse = noSparse,
        keys = keys,
        values = values,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use AnyRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.AnyRules"],
        expression = "AnyRules {\nthis.required = required\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildAnyRules")
public fun AnyRules(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit): pbandk.testpb.AnyRules =
    pbandk.testpb.MutableAnyRules_Impl(
        required = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.AnyRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.AnyRules.FieldDescriptors.notIn),
    ).also(builderAction).toAnyRules()

@pbandk.Export
@pbandk.JsName("orDefaultForAnyRules")
public fun AnyRules?.orDefault(): pbandk.testpb.AnyRules = this ?: pbandk.testpb.AnyRules.defaultInstance

private class AnyRules_Impl(
    override val required: Boolean?,
    override val `in`: pbandk.gen.ListField<String>,
    override val notIn: pbandk.gen.ListField<String>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.AnyRules, pbandk.gen.GeneratedMessage<pbandk.testpb.AnyRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.AnyRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableAnyRules_Impl(
    override var required: Boolean?,
    override val `in`: pbandk.gen.MutableListField<String>,
    override val notIn: pbandk.gen.MutableListField<String>,
) : pbandk.testpb.MutableAnyRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.AnyRules>() {
    override val descriptor get() = pbandk.testpb.AnyRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableAnyRules.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        required: Boolean?,
        `in`: List<String>,
        notIn: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toAnyRules() = AnyRules_Impl(
        required = required,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use DurationRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.DurationRules"],
        expression = "DurationRules {\nthis.required = required\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.`in` += `in`\nthis.notIn += notIn\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildDurationRules")
public fun DurationRules(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit): pbandk.testpb.DurationRules =
    pbandk.testpb.MutableDurationRules_Impl(
        required = null,
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        `in` = pbandk.gen.MutableListField(pbandk.testpb.DurationRules.FieldDescriptors.`in`),
        notIn = pbandk.gen.MutableListField(pbandk.testpb.DurationRules.FieldDescriptors.notIn),
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
    override val `in`: pbandk.gen.ListField<pbandk.wkt.Duration>,
    override val notIn: pbandk.gen.ListField<pbandk.wkt.Duration>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.DurationRules, pbandk.gen.GeneratedMessage<pbandk.testpb.DurationRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.DurationRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit) = super.copy(builderAction)

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
}

private class MutableDurationRules_Impl(
    override var required: Boolean?,
    override var const: pbandk.wkt.Duration?,
    override var lt: pbandk.wkt.Duration?,
    override var lte: pbandk.wkt.Duration?,
    override var gt: pbandk.wkt.Duration?,
    override var gte: pbandk.wkt.Duration?,
    override val `in`: pbandk.gen.MutableListField<pbandk.wkt.Duration>,
    override val notIn: pbandk.gen.MutableListField<pbandk.wkt.Duration>,
) : pbandk.testpb.MutableDurationRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.DurationRules>() {
    override val descriptor get() = pbandk.testpb.DurationRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableDurationRules.() -> Unit) = super.copy(builderAction)

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

    fun toDurationRules() = DurationRules_Impl(
        required = required,
        const = const,
        lt = lt,
        lte = lte,
        gt = gt,
        gte = gte,
        `in` = `in`.toListField(),
        notIn = notIn.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use TimestampRules { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.TimestampRules"],
        expression = "TimestampRules {\nthis.required = required\nthis.const = const\nthis.lt = lt\nthis.lte = lte\nthis.gt = gt\nthis.gte = gte\nthis.ltNow = ltNow\nthis.gtNow = gtNow\nthis.within = within\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildTimestampRules")
public fun TimestampRules(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit): pbandk.testpb.TimestampRules =
    pbandk.testpb.MutableTimestampRules_Impl(
        required = null,
        const = null,
        lt = null,
        lte = null,
        gt = null,
        gte = null,
        ltNow = null,
        gtNow = null,
        within = null,
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
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.TimestampRules, pbandk.gen.GeneratedMessage<pbandk.testpb.TimestampRules>(unknownFields) {
    override val descriptor get() = pbandk.testpb.TimestampRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit) = super.copy(builderAction)

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
) : pbandk.testpb.MutableTimestampRules, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.TimestampRules>() {
    override val descriptor get() = pbandk.testpb.TimestampRules.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableTimestampRules.() -> Unit) = super.copy(builderAction)

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

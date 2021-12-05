@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

@pbandk.Export
public sealed class ForeignEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is ForeignEnum && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "ForeignEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object FOREIGN_FOO : ForeignEnum(0, "FOREIGN_FOO")
    public object FOREIGN_BAR : ForeignEnum(1, "FOREIGN_BAR")
    public object FOREIGN_BAZ : ForeignEnum(2, "FOREIGN_BAZ")
    public class UNRECOGNIZED(value: Int) : ForeignEnum(value)

    public companion object : pbandk.Message.Enum.Companion<ForeignEnum> {
        public val values: List<ForeignEnum> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int): ForeignEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): ForeignEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnum with name: $name")
    }
}

public sealed interface TestAllTypesProto3 : pbandk.Message {
    public val optionalInt32: Int
    public val optionalInt64: Long
    public val optionalUint32: Int
    public val optionalUint64: Long
    public val optionalSint32: Int
    public val optionalSint64: Long
    public val optionalFixed32: Int
    public val optionalFixed64: Long
    public val optionalSfixed32: Int
    public val optionalSfixed64: Long
    public val optionalFloat: Float
    public val optionalDouble: Double
    public val optionalBool: Boolean
    public val optionalString: String
    public val optionalBytes: pbandk.ByteArr
    public val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
    public val optionalForeignMessage: pbandk.conformance.pb.ForeignMessage?
    public val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum
    public val optionalForeignEnum: pbandk.conformance.pb.ForeignEnum
    public val optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum
    public val optionalStringPiece: String
    public val optionalCord: String
    public val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3?
    public val repeatedInt32: List<Int>
    public val repeatedInt64: List<Long>
    public val repeatedUint32: List<Int>
    public val repeatedUint64: List<Long>
    public val repeatedSint32: List<Int>
    public val repeatedSint64: List<Long>
    public val repeatedFixed32: List<Int>
    public val repeatedFixed64: List<Long>
    public val repeatedSfixed32: List<Int>
    public val repeatedSfixed64: List<Long>
    public val repeatedFloat: List<Float>
    public val repeatedDouble: List<Double>
    public val repeatedBool: List<Boolean>
    public val repeatedString: List<String>
    public val repeatedBytes: List<pbandk.ByteArr>
    public val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>
    public val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage>
    public val repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public val repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum>
    public val repeatedStringPiece: List<String>
    public val repeatedCord: List<String>
    public val packedInt32: List<Int>
    public val packedInt64: List<Long>
    public val packedUint32: List<Int>
    public val packedUint64: List<Long>
    public val packedSint32: List<Int>
    public val packedSint64: List<Long>
    public val packedFixed32: List<Int>
    public val packedFixed64: List<Long>
    public val packedSfixed32: List<Int>
    public val packedSfixed64: List<Long>
    public val packedFloat: List<Float>
    public val packedDouble: List<Double>
    public val packedBool: List<Boolean>
    public val packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public val unpackedInt32: List<Int>
    public val unpackedInt64: List<Long>
    public val unpackedUint32: List<Int>
    public val unpackedUint64: List<Long>
    public val unpackedSint32: List<Int>
    public val unpackedSint64: List<Long>
    public val unpackedFixed32: List<Int>
    public val unpackedFixed64: List<Long>
    public val unpackedSfixed32: List<Int>
    public val unpackedSfixed64: List<Long>
    public val unpackedFloat: List<Float>
    public val unpackedDouble: List<Double>
    public val unpackedBool: List<Boolean>
    public val unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public val mapInt32Int32: Map<Int, Int>
    public val mapInt64Int64: Map<Long, Long>
    public val mapUint32Uint32: Map<Int, Int>
    public val mapUint64Uint64: Map<Long, Long>
    public val mapSint32Sint32: Map<Int, Int>
    public val mapSint64Sint64: Map<Long, Long>
    public val mapFixed32Fixed32: Map<Int, Int>
    public val mapFixed64Fixed64: Map<Long, Long>
    public val mapSfixed32Sfixed32: Map<Int, Int>
    public val mapSfixed64Sfixed64: Map<Long, Long>
    public val mapInt32Float: Map<Int, Float>
    public val mapInt32Double: Map<Int, Double>
    public val mapBoolBool: Map<Boolean, Boolean>
    public val mapStringString: Map<String, String>
    public val mapStringBytes: Map<String, pbandk.ByteArr>
    public val mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>
    public val mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?>
    public val mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public val mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum>
    public val optionalBoolWrapper: Boolean?
    public val optionalInt32Wrapper: Int?
    public val optionalInt64Wrapper: Long?
    public val optionalUint32Wrapper: Int?
    public val optionalUint64Wrapper: Long?
    public val optionalFloatWrapper: Float?
    public val optionalDoubleWrapper: Double?
    public val optionalStringWrapper: String?
    public val optionalBytesWrapper: pbandk.ByteArr?
    public val repeatedBoolWrapper: List<Boolean>
    public val repeatedInt32Wrapper: List<Int>
    public val repeatedInt64Wrapper: List<Long>
    public val repeatedUint32Wrapper: List<Int>
    public val repeatedUint64Wrapper: List<Long>
    public val repeatedFloatWrapper: List<Float>
    public val repeatedDoubleWrapper: List<Double>
    public val repeatedStringWrapper: List<String>
    public val repeatedBytesWrapper: List<pbandk.ByteArr>
    public val optionalDuration: pbandk.wkt.Duration?
    public val optionalTimestamp: pbandk.wkt.Timestamp?
    public val optionalFieldMask: pbandk.wkt.FieldMask?
    public val optionalStruct: pbandk.wkt.Struct?
    public val optionalAny: pbandk.wkt.Any?
    public val optionalValue: pbandk.wkt.Value?
    public val repeatedDuration: List<pbandk.wkt.Duration>
    public val repeatedTimestamp: List<pbandk.wkt.Timestamp>
    public val repeatedFieldmask: List<pbandk.wkt.FieldMask>
    public val repeatedStruct: List<pbandk.wkt.Struct>
    public val repeatedAny: List<pbandk.wkt.Any>
    public val repeatedValue: List<pbandk.wkt.Value>
    public val repeatedListValue: List<pbandk.wkt.ListValue>
    public val fieldname1: Int
    public val fieldName2: Int
    public val fieldName3: Int
    public val field_name4: Int
    public val field0name5: Int
    public val field0Name6: Int
    public val fieldName7: Int
    public val fieldName8: Int
    public val fieldName9: Int
    public val fieldName10: Int
    public val fIELDNAME11: Int
    public val fIELDName12: Int
    public val _fieldName13: Int
    public val _FieldName14: Int
    public val field_name15: Int
    public val field_Name16: Int
    public val fieldName17_: Int
    public val fieldName18_: Int
    public val oneofField: OneofField<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3>

    public fun copy(
        optionalInt32: Int = this.optionalInt32,
        optionalInt64: Long = this.optionalInt64,
        optionalUint32: Int = this.optionalUint32,
        optionalUint64: Long = this.optionalUint64,
        optionalSint32: Int = this.optionalSint32,
        optionalSint64: Long = this.optionalSint64,
        optionalFixed32: Int = this.optionalFixed32,
        optionalFixed64: Long = this.optionalFixed64,
        optionalSfixed32: Int = this.optionalSfixed32,
        optionalSfixed64: Long = this.optionalSfixed64,
        optionalFloat: Float = this.optionalFloat,
        optionalDouble: Double = this.optionalDouble,
        optionalBool: Boolean = this.optionalBool,
        optionalString: String = this.optionalString,
        optionalBytes: pbandk.ByteArr = this.optionalBytes,
        optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = this.optionalNestedMessage,
        optionalForeignMessage: pbandk.conformance.pb.ForeignMessage? = this.optionalForeignMessage,
        optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = this.optionalNestedEnum,
        optionalForeignEnum: pbandk.conformance.pb.ForeignEnum = this.optionalForeignEnum,
        optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = this.optionalAliasedEnum,
        optionalStringPiece: String = this.optionalStringPiece,
        optionalCord: String = this.optionalCord,
        recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3? = this.recursiveMessage,
        repeatedInt32: List<Int> = this.repeatedInt32,
        repeatedInt64: List<Long> = this.repeatedInt64,
        repeatedUint32: List<Int> = this.repeatedUint32,
        repeatedUint64: List<Long> = this.repeatedUint64,
        repeatedSint32: List<Int> = this.repeatedSint32,
        repeatedSint64: List<Long> = this.repeatedSint64,
        repeatedFixed32: List<Int> = this.repeatedFixed32,
        repeatedFixed64: List<Long> = this.repeatedFixed64,
        repeatedSfixed32: List<Int> = this.repeatedSfixed32,
        repeatedSfixed64: List<Long> = this.repeatedSfixed64,
        repeatedFloat: List<Float> = this.repeatedFloat,
        repeatedDouble: List<Double> = this.repeatedDouble,
        repeatedBool: List<Boolean> = this.repeatedBool,
        repeatedString: List<String> = this.repeatedString,
        repeatedBytes: List<pbandk.ByteArr> = this.repeatedBytes,
        repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> = this.repeatedNestedMessage,
        repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage> = this.repeatedForeignMessage,
        repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = this.repeatedNestedEnum,
        repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum> = this.repeatedForeignEnum,
        repeatedStringPiece: List<String> = this.repeatedStringPiece,
        repeatedCord: List<String> = this.repeatedCord,
        packedInt32: List<Int> = this.packedInt32,
        packedInt64: List<Long> = this.packedInt64,
        packedUint32: List<Int> = this.packedUint32,
        packedUint64: List<Long> = this.packedUint64,
        packedSint32: List<Int> = this.packedSint32,
        packedSint64: List<Long> = this.packedSint64,
        packedFixed32: List<Int> = this.packedFixed32,
        packedFixed64: List<Long> = this.packedFixed64,
        packedSfixed32: List<Int> = this.packedSfixed32,
        packedSfixed64: List<Long> = this.packedSfixed64,
        packedFloat: List<Float> = this.packedFloat,
        packedDouble: List<Double> = this.packedDouble,
        packedBool: List<Boolean> = this.packedBool,
        packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = this.packedNestedEnum,
        unpackedInt32: List<Int> = this.unpackedInt32,
        unpackedInt64: List<Long> = this.unpackedInt64,
        unpackedUint32: List<Int> = this.unpackedUint32,
        unpackedUint64: List<Long> = this.unpackedUint64,
        unpackedSint32: List<Int> = this.unpackedSint32,
        unpackedSint64: List<Long> = this.unpackedSint64,
        unpackedFixed32: List<Int> = this.unpackedFixed32,
        unpackedFixed64: List<Long> = this.unpackedFixed64,
        unpackedSfixed32: List<Int> = this.unpackedSfixed32,
        unpackedSfixed64: List<Long> = this.unpackedSfixed64,
        unpackedFloat: List<Float> = this.unpackedFloat,
        unpackedDouble: List<Double> = this.unpackedDouble,
        unpackedBool: List<Boolean> = this.unpackedBool,
        unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = this.unpackedNestedEnum,
        mapInt32Int32: Map<Int, Int> = this.mapInt32Int32,
        mapInt64Int64: Map<Long, Long> = this.mapInt64Int64,
        mapUint32Uint32: Map<Int, Int> = this.mapUint32Uint32,
        mapUint64Uint64: Map<Long, Long> = this.mapUint64Uint64,
        mapSint32Sint32: Map<Int, Int> = this.mapSint32Sint32,
        mapSint64Sint64: Map<Long, Long> = this.mapSint64Sint64,
        mapFixed32Fixed32: Map<Int, Int> = this.mapFixed32Fixed32,
        mapFixed64Fixed64: Map<Long, Long> = this.mapFixed64Fixed64,
        mapSfixed32Sfixed32: Map<Int, Int> = this.mapSfixed32Sfixed32,
        mapSfixed64Sfixed64: Map<Long, Long> = this.mapSfixed64Sfixed64,
        mapInt32Float: Map<Int, Float> = this.mapInt32Float,
        mapInt32Double: Map<Int, Double> = this.mapInt32Double,
        mapBoolBool: Map<Boolean, Boolean> = this.mapBoolBool,
        mapStringString: Map<String, String> = this.mapStringString,
        mapStringBytes: Map<String, pbandk.ByteArr> = this.mapStringBytes,
        mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?> = this.mapStringNestedMessage,
        mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?> = this.mapStringForeignMessage,
        mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = this.mapStringNestedEnum,
        mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum> = this.mapStringForeignEnum,
        optionalBoolWrapper: Boolean? = this.optionalBoolWrapper,
        optionalInt32Wrapper: Int? = this.optionalInt32Wrapper,
        optionalInt64Wrapper: Long? = this.optionalInt64Wrapper,
        optionalUint32Wrapper: Int? = this.optionalUint32Wrapper,
        optionalUint64Wrapper: Long? = this.optionalUint64Wrapper,
        optionalFloatWrapper: Float? = this.optionalFloatWrapper,
        optionalDoubleWrapper: Double? = this.optionalDoubleWrapper,
        optionalStringWrapper: String? = this.optionalStringWrapper,
        optionalBytesWrapper: pbandk.ByteArr? = this.optionalBytesWrapper,
        repeatedBoolWrapper: List<Boolean> = this.repeatedBoolWrapper,
        repeatedInt32Wrapper: List<Int> = this.repeatedInt32Wrapper,
        repeatedInt64Wrapper: List<Long> = this.repeatedInt64Wrapper,
        repeatedUint32Wrapper: List<Int> = this.repeatedUint32Wrapper,
        repeatedUint64Wrapper: List<Long> = this.repeatedUint64Wrapper,
        repeatedFloatWrapper: List<Float> = this.repeatedFloatWrapper,
        repeatedDoubleWrapper: List<Double> = this.repeatedDoubleWrapper,
        repeatedStringWrapper: List<String> = this.repeatedStringWrapper,
        repeatedBytesWrapper: List<pbandk.ByteArr> = this.repeatedBytesWrapper,
        optionalDuration: pbandk.wkt.Duration? = this.optionalDuration,
        optionalTimestamp: pbandk.wkt.Timestamp? = this.optionalTimestamp,
        optionalFieldMask: pbandk.wkt.FieldMask? = this.optionalFieldMask,
        optionalStruct: pbandk.wkt.Struct? = this.optionalStruct,
        optionalAny: pbandk.wkt.Any? = this.optionalAny,
        optionalValue: pbandk.wkt.Value? = this.optionalValue,
        repeatedDuration: List<pbandk.wkt.Duration> = this.repeatedDuration,
        repeatedTimestamp: List<pbandk.wkt.Timestamp> = this.repeatedTimestamp,
        repeatedFieldmask: List<pbandk.wkt.FieldMask> = this.repeatedFieldmask,
        repeatedStruct: List<pbandk.wkt.Struct> = this.repeatedStruct,
        repeatedAny: List<pbandk.wkt.Any> = this.repeatedAny,
        repeatedValue: List<pbandk.wkt.Value> = this.repeatedValue,
        repeatedListValue: List<pbandk.wkt.ListValue> = this.repeatedListValue,
        fieldname1: Int = this.fieldname1,
        fieldName2: Int = this.fieldName2,
        fieldName3: Int = this.fieldName3,
        field_name4: Int = this.field_name4,
        field0name5: Int = this.field0name5,
        field0Name6: Int = this.field0Name6,
        fieldName7: Int = this.fieldName7,
        fieldName8: Int = this.fieldName8,
        fieldName9: Int = this.fieldName9,
        fieldName10: Int = this.fieldName10,
        fIELDNAME11: Int = this.fIELDNAME11,
        fIELDName12: Int = this.fIELDName12,
        _fieldName13: Int = this._fieldName13,
        _FieldName14: Int = this._FieldName14,
        field_name15: Int = this.field_name15,
        field_Name16: Int = this.field_Name16,
        fieldName17_: Int = this.fieldName17_,
        fieldName18_: Int = this.fieldName18_,
        oneofField: pbandk.conformance.pb.TestAllTypesProto3.OneofField<*>? = this.oneofField,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.TestAllTypesProto3

    public val oneofUint32: Int?
    public val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
    public val oneofString: String?
    public val oneofBytes: pbandk.ByteArr?
    public val oneofBool: Boolean?
    public val oneofUint64: Long?
    public val oneofFloat: Float?
    public val oneofDouble: Double?
    public val oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum?

    public sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class OneofUint32(oneofUint32: Int = 0) : OneofField<Int>(oneofUint32)
        public class OneofNestedMessage(oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage) : OneofField<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>(oneofNestedMessage)
        public class OneofString(oneofString: String = "") : OneofField<String>(oneofString)
        public class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField<pbandk.ByteArr>(oneofBytes)
        public class OneofBool(oneofBool: Boolean = false) : OneofField<Boolean>(oneofBool)
        public class OneofUint64(oneofUint64: Long = 0L) : OneofField<Long>(oneofUint64)
        public class OneofFloat(oneofFloat: Float = 0.0F) : OneofField<Float>(oneofFloat)
        public class OneofDouble(oneofDouble: Double = 0.0) : OneofField<Double>(oneofDouble)
        public class OneofEnum(oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)) : OneofField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(oneofEnum)
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3> {
        @Deprecated("Use testAllTypesProto3 { } instead")
        public operator fun invoke(
            optionalInt32: Int = 0,
            optionalInt64: Long = 0L,
            optionalUint32: Int = 0,
            optionalUint64: Long = 0L,
            optionalSint32: Int = 0,
            optionalSint64: Long = 0L,
            optionalFixed32: Int = 0,
            optionalFixed64: Long = 0L,
            optionalSfixed32: Int = 0,
            optionalSfixed64: Long = 0L,
            optionalFloat: Float = 0.0F,
            optionalDouble: Double = 0.0,
            optionalBool: Boolean = false,
            optionalString: String = "",
            optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
            optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null,
            optionalForeignMessage: pbandk.conformance.pb.ForeignMessage? = null,
            optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
            optionalForeignEnum: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
            optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromValue(0),
            optionalStringPiece: String = "",
            optionalCord: String = "",
            recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3? = null,
            repeatedInt32: List<Int> = emptyList(),
            repeatedInt64: List<Long> = emptyList(),
            repeatedUint32: List<Int> = emptyList(),
            repeatedUint64: List<Long> = emptyList(),
            repeatedSint32: List<Int> = emptyList(),
            repeatedSint64: List<Long> = emptyList(),
            repeatedFixed32: List<Int> = emptyList(),
            repeatedFixed64: List<Long> = emptyList(),
            repeatedSfixed32: List<Int> = emptyList(),
            repeatedSfixed64: List<Long> = emptyList(),
            repeatedFloat: List<Float> = emptyList(),
            repeatedDouble: List<Double> = emptyList(),
            repeatedBool: List<Boolean> = emptyList(),
            repeatedString: List<String> = emptyList(),
            repeatedBytes: List<pbandk.ByteArr> = emptyList(),
            repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> = emptyList(),
            repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage> = emptyList(),
            repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
            repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum> = emptyList(),
            repeatedStringPiece: List<String> = emptyList(),
            repeatedCord: List<String> = emptyList(),
            packedInt32: List<Int> = emptyList(),
            packedInt64: List<Long> = emptyList(),
            packedUint32: List<Int> = emptyList(),
            packedUint64: List<Long> = emptyList(),
            packedSint32: List<Int> = emptyList(),
            packedSint64: List<Long> = emptyList(),
            packedFixed32: List<Int> = emptyList(),
            packedFixed64: List<Long> = emptyList(),
            packedSfixed32: List<Int> = emptyList(),
            packedSfixed64: List<Long> = emptyList(),
            packedFloat: List<Float> = emptyList(),
            packedDouble: List<Double> = emptyList(),
            packedBool: List<Boolean> = emptyList(),
            packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
            unpackedInt32: List<Int> = emptyList(),
            unpackedInt64: List<Long> = emptyList(),
            unpackedUint32: List<Int> = emptyList(),
            unpackedUint64: List<Long> = emptyList(),
            unpackedSint32: List<Int> = emptyList(),
            unpackedSint64: List<Long> = emptyList(),
            unpackedFixed32: List<Int> = emptyList(),
            unpackedFixed64: List<Long> = emptyList(),
            unpackedSfixed32: List<Int> = emptyList(),
            unpackedSfixed64: List<Long> = emptyList(),
            unpackedFloat: List<Float> = emptyList(),
            unpackedDouble: List<Double> = emptyList(),
            unpackedBool: List<Boolean> = emptyList(),
            unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
            mapInt32Int32: Map<Int, Int> = emptyMap(),
            mapInt64Int64: Map<Long, Long> = emptyMap(),
            mapUint32Uint32: Map<Int, Int> = emptyMap(),
            mapUint64Uint64: Map<Long, Long> = emptyMap(),
            mapSint32Sint32: Map<Int, Int> = emptyMap(),
            mapSint64Sint64: Map<Long, Long> = emptyMap(),
            mapFixed32Fixed32: Map<Int, Int> = emptyMap(),
            mapFixed64Fixed64: Map<Long, Long> = emptyMap(),
            mapSfixed32Sfixed32: Map<Int, Int> = emptyMap(),
            mapSfixed64Sfixed64: Map<Long, Long> = emptyMap(),
            mapInt32Float: Map<Int, Float> = emptyMap(),
            mapInt32Double: Map<Int, Double> = emptyMap(),
            mapBoolBool: Map<Boolean, Boolean> = emptyMap(),
            mapStringString: Map<String, String> = emptyMap(),
            mapStringBytes: Map<String, pbandk.ByteArr> = emptyMap(),
            mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?> = emptyMap(),
            mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?> = emptyMap(),
            mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyMap(),
            mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum> = emptyMap(),
            optionalBoolWrapper: Boolean? = null,
            optionalInt32Wrapper: Int? = null,
            optionalInt64Wrapper: Long? = null,
            optionalUint32Wrapper: Int? = null,
            optionalUint64Wrapper: Long? = null,
            optionalFloatWrapper: Float? = null,
            optionalDoubleWrapper: Double? = null,
            optionalStringWrapper: String? = null,
            optionalBytesWrapper: pbandk.ByteArr? = null,
            repeatedBoolWrapper: List<Boolean> = emptyList(),
            repeatedInt32Wrapper: List<Int> = emptyList(),
            repeatedInt64Wrapper: List<Long> = emptyList(),
            repeatedUint32Wrapper: List<Int> = emptyList(),
            repeatedUint64Wrapper: List<Long> = emptyList(),
            repeatedFloatWrapper: List<Float> = emptyList(),
            repeatedDoubleWrapper: List<Double> = emptyList(),
            repeatedStringWrapper: List<String> = emptyList(),
            repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
            optionalDuration: pbandk.wkt.Duration? = null,
            optionalTimestamp: pbandk.wkt.Timestamp? = null,
            optionalFieldMask: pbandk.wkt.FieldMask? = null,
            optionalStruct: pbandk.wkt.Struct? = null,
            optionalAny: pbandk.wkt.Any? = null,
            optionalValue: pbandk.wkt.Value? = null,
            repeatedDuration: List<pbandk.wkt.Duration> = emptyList(),
            repeatedTimestamp: List<pbandk.wkt.Timestamp> = emptyList(),
            repeatedFieldmask: List<pbandk.wkt.FieldMask> = emptyList(),
            repeatedStruct: List<pbandk.wkt.Struct> = emptyList(),
            repeatedAny: List<pbandk.wkt.Any> = emptyList(),
            repeatedValue: List<pbandk.wkt.Value> = emptyList(),
            repeatedListValue: List<pbandk.wkt.ListValue> = emptyList(),
            fieldname1: Int = 0,
            fieldName2: Int = 0,
            fieldName3: Int = 0,
            field_name4: Int = 0,
            field0name5: Int = 0,
            field0Name6: Int = 0,
            fieldName7: Int = 0,
            fieldName8: Int = 0,
            fieldName9: Int = 0,
            fieldName10: Int = 0,
            fIELDNAME11: Int = 0,
            fIELDName12: Int = 0,
            _fieldName13: Int = 0,
            _FieldName14: Int = 0,
            field_name15: Int = 0,
            field_Name16: Int = 0,
            fieldName17_: Int = 0,
            fieldName18_: Int = 0,
            oneofField: OneofField<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto3 = TestAllTypesProto3_Impl(
            optionalInt32 = optionalInt32,
            optionalInt64 = optionalInt64,
            optionalUint32 = optionalUint32,
            optionalUint64 = optionalUint64,
            optionalSint32 = optionalSint32,
            optionalSint64 = optionalSint64,
            optionalFixed32 = optionalFixed32,
            optionalFixed64 = optionalFixed64,
            optionalSfixed32 = optionalSfixed32,
            optionalSfixed64 = optionalSfixed64,
            optionalFloat = optionalFloat,
            optionalDouble = optionalDouble,
            optionalBool = optionalBool,
            optionalString = optionalString,
            optionalBytes = optionalBytes,
            optionalNestedMessage = optionalNestedMessage,
            optionalForeignMessage = optionalForeignMessage,
            optionalNestedEnum = optionalNestedEnum,
            optionalForeignEnum = optionalForeignEnum,
            optionalAliasedEnum = optionalAliasedEnum,
            optionalStringPiece = optionalStringPiece,
            optionalCord = optionalCord,
            recursiveMessage = recursiveMessage,
            repeatedInt32 = repeatedInt32,
            repeatedInt64 = repeatedInt64,
            repeatedUint32 = repeatedUint32,
            repeatedUint64 = repeatedUint64,
            repeatedSint32 = repeatedSint32,
            repeatedSint64 = repeatedSint64,
            repeatedFixed32 = repeatedFixed32,
            repeatedFixed64 = repeatedFixed64,
            repeatedSfixed32 = repeatedSfixed32,
            repeatedSfixed64 = repeatedSfixed64,
            repeatedFloat = repeatedFloat,
            repeatedDouble = repeatedDouble,
            repeatedBool = repeatedBool,
            repeatedString = repeatedString,
            repeatedBytes = repeatedBytes,
            repeatedNestedMessage = repeatedNestedMessage,
            repeatedForeignMessage = repeatedForeignMessage,
            repeatedNestedEnum = repeatedNestedEnum,
            repeatedForeignEnum = repeatedForeignEnum,
            repeatedStringPiece = repeatedStringPiece,
            repeatedCord = repeatedCord,
            packedInt32 = packedInt32,
            packedInt64 = packedInt64,
            packedUint32 = packedUint32,
            packedUint64 = packedUint64,
            packedSint32 = packedSint32,
            packedSint64 = packedSint64,
            packedFixed32 = packedFixed32,
            packedFixed64 = packedFixed64,
            packedSfixed32 = packedSfixed32,
            packedSfixed64 = packedSfixed64,
            packedFloat = packedFloat,
            packedDouble = packedDouble,
            packedBool = packedBool,
            packedNestedEnum = packedNestedEnum,
            unpackedInt32 = unpackedInt32,
            unpackedInt64 = unpackedInt64,
            unpackedUint32 = unpackedUint32,
            unpackedUint64 = unpackedUint64,
            unpackedSint32 = unpackedSint32,
            unpackedSint64 = unpackedSint64,
            unpackedFixed32 = unpackedFixed32,
            unpackedFixed64 = unpackedFixed64,
            unpackedSfixed32 = unpackedSfixed32,
            unpackedSfixed64 = unpackedSfixed64,
            unpackedFloat = unpackedFloat,
            unpackedDouble = unpackedDouble,
            unpackedBool = unpackedBool,
            unpackedNestedEnum = unpackedNestedEnum,
            mapInt32Int32 = mapInt32Int32,
            mapInt64Int64 = mapInt64Int64,
            mapUint32Uint32 = mapUint32Uint32,
            mapUint64Uint64 = mapUint64Uint64,
            mapSint32Sint32 = mapSint32Sint32,
            mapSint64Sint64 = mapSint64Sint64,
            mapFixed32Fixed32 = mapFixed32Fixed32,
            mapFixed64Fixed64 = mapFixed64Fixed64,
            mapSfixed32Sfixed32 = mapSfixed32Sfixed32,
            mapSfixed64Sfixed64 = mapSfixed64Sfixed64,
            mapInt32Float = mapInt32Float,
            mapInt32Double = mapInt32Double,
            mapBoolBool = mapBoolBool,
            mapStringString = mapStringString,
            mapStringBytes = mapStringBytes,
            mapStringNestedMessage = mapStringNestedMessage,
            mapStringForeignMessage = mapStringForeignMessage,
            mapStringNestedEnum = mapStringNestedEnum,
            mapStringForeignEnum = mapStringForeignEnum,
            optionalBoolWrapper = optionalBoolWrapper,
            optionalInt32Wrapper = optionalInt32Wrapper,
            optionalInt64Wrapper = optionalInt64Wrapper,
            optionalUint32Wrapper = optionalUint32Wrapper,
            optionalUint64Wrapper = optionalUint64Wrapper,
            optionalFloatWrapper = optionalFloatWrapper,
            optionalDoubleWrapper = optionalDoubleWrapper,
            optionalStringWrapper = optionalStringWrapper,
            optionalBytesWrapper = optionalBytesWrapper,
            repeatedBoolWrapper = repeatedBoolWrapper,
            repeatedInt32Wrapper = repeatedInt32Wrapper,
            repeatedInt64Wrapper = repeatedInt64Wrapper,
            repeatedUint32Wrapper = repeatedUint32Wrapper,
            repeatedUint64Wrapper = repeatedUint64Wrapper,
            repeatedFloatWrapper = repeatedFloatWrapper,
            repeatedDoubleWrapper = repeatedDoubleWrapper,
            repeatedStringWrapper = repeatedStringWrapper,
            repeatedBytesWrapper = repeatedBytesWrapper,
            optionalDuration = optionalDuration,
            optionalTimestamp = optionalTimestamp,
            optionalFieldMask = optionalFieldMask,
            optionalStruct = optionalStruct,
            optionalAny = optionalAny,
            optionalValue = optionalValue,
            repeatedDuration = repeatedDuration,
            repeatedTimestamp = repeatedTimestamp,
            repeatedFieldmask = repeatedFieldmask,
            repeatedStruct = repeatedStruct,
            repeatedAny = repeatedAny,
            repeatedValue = repeatedValue,
            repeatedListValue = repeatedListValue,
            fieldname1 = fieldname1,
            fieldName2 = fieldName2,
            fieldName3 = fieldName3,
            field_name4 = field_name4,
            field0name5 = field0name5,
            field0Name6 = field0Name6,
            fieldName7 = fieldName7,
            fieldName8 = fieldName8,
            fieldName9 = fieldName9,
            fieldName10 = fieldName10,
            fIELDNAME11 = fIELDNAME11,
            fIELDName12 = fIELDName12,
            _fieldName13 = _fieldName13,
            _FieldName14 = _FieldName14,
            field_name15 = field_name15,
            field_Name16 = field_Name16,
            fieldName17_ = fieldName17_,
            fieldName18_ = fieldName18_,
            oneofField = oneofField,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3 by lazy { pbandk.conformance.pb.TestAllTypesProto3() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3 = pbandk.conformance.pb.TestAllTypesProto3.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3, *>>(149)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "optionalInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "optionalInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "optionalUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "optionalUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                        jsonName = "optionalSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                        jsonName = "optionalSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                        jsonName = "optionalFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                        jsonName = "optionalFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                        jsonName = "optionalSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                        jsonName = "optionalSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "optionalFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "optionalDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "optionalBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "optionalBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_message",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_message",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion),
                        jsonName = "optionalForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_enum",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion),
                        jsonName = "optionalNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion),
                        jsonName = "optionalForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_aliased_enum",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.Companion),
                        jsonName = "optionalAliasedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalAliasedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_piece",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalStringPiece",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalStringPiece
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_cord",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalCord",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalCord
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "recursive_message",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.Companion),
                        jsonName = "recursiveMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::recursiveMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "repeatedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "repeatedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "repeatedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "repeatedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint32",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "repeatedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint64",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "repeatedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed32",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "repeatedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed64",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "repeatedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed32",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "repeatedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed64",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "repeatedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "repeatedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "repeatedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool",
                        number = 43,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "repeatedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "repeatedBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_message",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)),
                        jsonName = "repeatedNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_message",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion)),
                        jsonName = "repeatedForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_enum",
                        number = 51,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                        jsonName = "repeatedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_enum",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion), packed = true),
                        jsonName = "repeatedForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_piece",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedStringPiece",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedStringPiece
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_cord",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedCord",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedCord
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_int32",
                        number = 56,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "mapInt32Int32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt32Int32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int64_int64",
                        number = 57,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "mapInt64Int64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt64Int64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint32_uint32",
                        number = 58,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "mapUint32Uint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapUint32Uint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint64_uint64",
                        number = 59,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "mapUint64Uint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapUint64Uint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint32_sint32",
                        number = 60,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "mapSint32Sint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSint32Sint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint64_sint64",
                        number = 61,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "mapSint64Sint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSint64Sint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed32_fixed32",
                        number = 62,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "mapFixed32Fixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapFixed32Fixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed64_fixed64",
                        number = 63,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "mapFixed64Fixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapFixed64Fixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed32_sfixed32",
                        number = 64,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "mapSfixed32Sfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSfixed32Sfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed64_sfixed64",
                        number = 65,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "mapSfixed64Sfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSfixed64Sfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_float",
                        number = 66,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Float>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "mapInt32Float",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt32Float
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_double",
                        number = 67,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Double>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "mapInt32Double",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt32Double
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_bool_bool",
                        number = 68,
                        type = pbandk.FieldDescriptor.Type.Map<Boolean, Boolean>(keyType = pbandk.FieldDescriptor.Type.Primitive.Bool(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "mapBoolBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapBoolBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_string",
                        number = 69,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "mapStringString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_bytes",
                        number = 70,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.ByteArr>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "mapStringBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_message",
                        number = 71,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)),
                        jsonName = "mapStringNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_message",
                        number = 72,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.ForeignMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion)),
                        jsonName = "mapStringForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_enum",
                        number = 73,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)),
                        jsonName = "mapStringNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_enum",
                        number = 74,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.ForeignEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion)),
                        jsonName = "mapStringForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int32",
                        number = 75,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "packedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int64",
                        number = 76,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "packedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint32",
                        number = 77,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "packedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint64",
                        number = 78,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "packedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint32",
                        number = 79,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "packedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint64",
                        number = 80,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "packedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed32",
                        number = 81,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "packedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed64",
                        number = 82,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "packedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed32",
                        number = 83,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "packedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed64",
                        number = 84,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "packedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_float",
                        number = 85,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "packedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_double",
                        number = 86,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "packedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_bool",
                        number = 87,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "packedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_nested_enum",
                        number = 88,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                        jsonName = "packedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int32",
                        number = 89,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "unpackedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int64",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "unpackedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint32",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "unpackedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint64",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "unpackedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint32",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "unpackedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint64",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "unpackedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed32",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "unpackedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed64",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "unpackedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed32",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "unpackedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed64",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "unpackedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_float",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "unpackedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_double",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "unpackedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_bool",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "unpackedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_nested_enum",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)),
                        jsonName = "unpackedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_uint32",
                        number = 111,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_nested_message",
                        number = 112,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "oneofNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_string",
                        number = 113,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_bytes",
                        number = 114,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_bool",
                        number = 115,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_uint64",
                        number = 116,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_float",
                        number = 117,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_double",
                        number = 118,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_enum",
                        number = 119,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool_wrapper",
                        number = 201,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion),
                        jsonName = "optionalBoolWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBoolWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32_wrapper",
                        number = 202,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion),
                        jsonName = "optionalInt32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64_wrapper",
                        number = 203,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion),
                        jsonName = "optionalInt64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32_wrapper",
                        number = 204,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion),
                        jsonName = "optionalUint32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64_wrapper",
                        number = 205,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion),
                        jsonName = "optionalUint64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float_wrapper",
                        number = 206,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion),
                        jsonName = "optionalFloatWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFloatWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double_wrapper",
                        number = 207,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion),
                        jsonName = "optionalDoubleWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalDoubleWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_wrapper",
                        number = 208,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "optionalStringWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalStringWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes_wrapper",
                        number = 209,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion),
                        jsonName = "optionalBytesWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBytesWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool_wrapper",
                        number = 211,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion)),
                        jsonName = "repeatedBoolWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBoolWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32_wrapper",
                        number = 212,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion)),
                        jsonName = "repeatedInt32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64_wrapper",
                        number = 213,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion)),
                        jsonName = "repeatedInt64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32_wrapper",
                        number = 214,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion)),
                        jsonName = "repeatedUint32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64_wrapper",
                        number = 215,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "repeatedUint64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float_wrapper",
                        number = 216,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion)),
                        jsonName = "repeatedFloatWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFloatWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double_wrapper",
                        number = 217,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion)),
                        jsonName = "repeatedDoubleWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedDoubleWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_wrapper",
                        number = 218,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion)),
                        jsonName = "repeatedStringWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedStringWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes_wrapper",
                        number = 219,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion)),
                        jsonName = "repeatedBytesWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBytesWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_duration",
                        number = 301,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "optionalDuration",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalDuration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_timestamp",
                        number = 302,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "optionalTimestamp",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalTimestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_field_mask",
                        number = 303,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion),
                        jsonName = "optionalFieldMask",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFieldMask
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_struct",
                        number = 304,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "optionalStruct",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalStruct
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_any",
                        number = 305,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion),
                        jsonName = "optionalAny",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalAny
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_value",
                        number = 306,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                        jsonName = "optionalValue",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_duration",
                        number = 311,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "repeatedDuration",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedDuration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_timestamp",
                        number = 312,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Timestamp>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion)),
                        jsonName = "repeatedTimestamp",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedTimestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fieldmask",
                        number = 313,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldMask>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion)),
                        jsonName = "repeatedFieldmask",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFieldmask
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_any",
                        number = 315,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Any>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion)),
                        jsonName = "repeatedAny",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedAny
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_value",
                        number = 316,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "repeatedValue",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_list_value",
                        number = 317,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.ListValue>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ListValue.Companion)),
                        jsonName = "repeatedListValue",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedListValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_struct",
                        number = 324,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Struct>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion)),
                        jsonName = "repeatedStruct",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedStruct
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldname1",
                        number = 401,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldname1",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldname1
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name2",
                        number = 402,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName2",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName2
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "_field_name3",
                        number = 403,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName3",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName3
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name4_",
                        number = 404,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName4",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field_name4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field0name5",
                        number = 405,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "field0name5",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field0name5
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_0_name6",
                        number = 406,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "field0Name6",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field0Name6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldName7",
                        number = 407,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName7",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName7
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FieldName8",
                        number = 408,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName8",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName8
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_Name9",
                        number = 409,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName9",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName9
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_Name10",
                        number = 410,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName10",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName10
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_NAME11",
                        number = 411,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FIELDNAME11",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fIELDNAME11
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_name12",
                        number = 412,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FIELDName12",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fIELDName12
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__field_name13",
                        number = 413,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName13",
                        value = pbandk.conformance.pb.TestAllTypesProto3::_fieldName13
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__Field_name14",
                        number = 414,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName14",
                        value = pbandk.conformance.pb.TestAllTypesProto3::_FieldName14
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name15",
                        number = 415,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName15",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field_name15
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__Name16",
                        number = 416,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName16",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field_Name16
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name17__",
                        number = 417,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName17",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName17_
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_name18__",
                        number = 418,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName18",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName18_
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto3.TestAllTypesProto3",
                messageClass = pbandk.conformance.pb.TestAllTypesProto3::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is TestAllTypesProto3.NestedEnum && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "TestAllTypesProto3.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object FOO : NestedEnum(0, "FOO")
        public object BAR : NestedEnum(1, "BAR")
        public object BAZ : NestedEnum(2, "BAZ")
        public object NEG : NestedEnum(-1, "NEG")
        public class UNRECOGNIZED(value: Int) : NestedEnum(value)

        public companion object : pbandk.Message.Enum.Companion<TestAllTypesProto3.NestedEnum> {
            public val values: List<TestAllTypesProto3.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int): TestAllTypesProto3.NestedEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): TestAllTypesProto3.NestedEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    public sealed class AliasedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is TestAllTypesProto3.AliasedEnum && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "TestAllTypesProto3.AliasedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object ALIAS_FOO : AliasedEnum(0, "ALIAS_FOO")
        public object ALIAS_BAR : AliasedEnum(1, "ALIAS_BAR")
        public object ALIAS_BAZ : AliasedEnum(2, "ALIAS_BAZ")
        public object QUX : AliasedEnum(2, "QUX")
        public object QUX_ : AliasedEnum(2, "qux")
        public object B_AZ : AliasedEnum(2, "bAz")
        public class UNRECOGNIZED(value: Int) : AliasedEnum(value)

        public companion object : pbandk.Message.Enum.Companion<TestAllTypesProto3.AliasedEnum> {
            public val values: List<TestAllTypesProto3.AliasedEnum> by lazy { listOf(ALIAS_FOO, ALIAS_BAR, ALIAS_BAZ, QUX, QUX_, B_AZ) }
            override fun fromValue(value: Int): TestAllTypesProto3.AliasedEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): TestAllTypesProto3.AliasedEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No AliasedEnum with name: $name")
        }
    }

    public sealed interface NestedMessage : pbandk.Message {
        public val a: Int
        public val corecursive: pbandk.conformance.pb.TestAllTypesProto3?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>

        public fun copy(
            a: Int = this.a,
            corecursive: pbandk.conformance.pb.TestAllTypesProto3? = this.corecursive,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> {
            @Deprecated("Use nestedMessage { } instead")
            public operator fun invoke(
                a: Int = 0,
                corecursive: pbandk.conformance.pb.TestAllTypesProto3? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = TestAllTypesProto3_NestedMessage_Impl(
                a = a,
                corecursive = corecursive,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage by lazy { pbandk.conformance.pb.TestAllTypesProto3.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "a",
                            value = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage::a
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "corecursive",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.Companion),
                            jsonName = "corecursive",
                            value = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage::corecursive
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.NestedMessage",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableNestedMessage : TestAllTypesProto3.NestedMessage, pbandk.MutableMessage {
        public override var a: Int
        public override var corecursive: pbandk.conformance.pb.TestAllTypesProto3?

        public fun toNestedMessage(): TestAllTypesProto3.NestedMessage

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> {
            @Deprecated("Use nestedMessage { } instead")
            public operator fun invoke(
                a: Int = 0,
                corecursive: pbandk.conformance.pb.TestAllTypesProto3? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableNestedMessage = TestAllTypesProto3_MutableNestedMessage_Impl(
                a = a,
                corecursive = corecursive,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableNestedMessage by lazy { MutableNestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> get() = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.descriptor
        }
    }

    public sealed interface MapInt32Int32Entry : pbandk.Message, Map.Entry<Int, Int> {
        public override val key: Int
        public override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry>

        public fun copy(
            key: Int = this.key,
            value: Int = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry> {
            @Deprecated("Use mapInt32Int32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry = TestAllTypesProto3_MapInt32Int32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapInt32Int32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt32Int32Entry : TestAllTypesProto3.MapInt32Int32Entry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Int

        public fun toMapInt32Int32Entry(): TestAllTypesProto3.MapInt32Int32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry> {
            @Deprecated("Use mapInt32Int32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt32Int32Entry = TestAllTypesProto3_MutableMapInt32Int32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt32Int32Entry by lazy { MutableMapInt32Int32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry.descriptor
        }
    }

    public sealed interface MapInt64Int64Entry : pbandk.Message, Map.Entry<Long, Long> {
        public override val key: Long
        public override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry>

        public fun copy(
            key: Long = this.key,
            value: Long = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry> {
            @Deprecated("Use mapInt64Int64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry = TestAllTypesProto3_MapInt64Int64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapInt64Int64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt64Int64Entry : TestAllTypesProto3.MapInt64Int64Entry, pbandk.MutableMessage {
        public override var key: Long
        public override var value: Long

        public fun toMapInt64Int64Entry(): TestAllTypesProto3.MapInt64Int64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry> {
            @Deprecated("Use mapInt64Int64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt64Int64Entry = TestAllTypesProto3_MutableMapInt64Int64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt64Int64Entry by lazy { MutableMapInt64Int64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry.descriptor
        }
    }

    public sealed interface MapUint32Uint32Entry : pbandk.Message, Map.Entry<Int, Int> {
        public override val key: Int
        public override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry>

        public fun copy(
            key: Int = this.key,
            value: Int = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry> {
            @Deprecated("Use mapUint32Uint32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry = TestAllTypesProto3_MapUint32Uint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapUint32Uint32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapUint32Uint32Entry : TestAllTypesProto3.MapUint32Uint32Entry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Int

        public fun toMapUint32Uint32Entry(): TestAllTypesProto3.MapUint32Uint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry> {
            @Deprecated("Use mapUint32Uint32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapUint32Uint32Entry = TestAllTypesProto3_MutableMapUint32Uint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapUint32Uint32Entry by lazy { MutableMapUint32Uint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry.descriptor
        }
    }

    public sealed interface MapUint64Uint64Entry : pbandk.Message, Map.Entry<Long, Long> {
        public override val key: Long
        public override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry>

        public fun copy(
            key: Long = this.key,
            value: Long = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry> {
            @Deprecated("Use mapUint64Uint64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry = TestAllTypesProto3_MapUint64Uint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapUint64Uint64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapUint64Uint64Entry : TestAllTypesProto3.MapUint64Uint64Entry, pbandk.MutableMessage {
        public override var key: Long
        public override var value: Long

        public fun toMapUint64Uint64Entry(): TestAllTypesProto3.MapUint64Uint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry> {
            @Deprecated("Use mapUint64Uint64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapUint64Uint64Entry = TestAllTypesProto3_MutableMapUint64Uint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapUint64Uint64Entry by lazy { MutableMapUint64Uint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry.descriptor
        }
    }

    public sealed interface MapSint32Sint32Entry : pbandk.Message, Map.Entry<Int, Int> {
        public override val key: Int
        public override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry>

        public fun copy(
            key: Int = this.key,
            value: Int = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry> {
            @Deprecated("Use mapSint32Sint32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry = TestAllTypesProto3_MapSint32Sint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapSint32Sint32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSint32Sint32Entry : TestAllTypesProto3.MapSint32Sint32Entry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Int

        public fun toMapSint32Sint32Entry(): TestAllTypesProto3.MapSint32Sint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry> {
            @Deprecated("Use mapSint32Sint32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSint32Sint32Entry = TestAllTypesProto3_MutableMapSint32Sint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSint32Sint32Entry by lazy { MutableMapSint32Sint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry.descriptor
        }
    }

    public sealed interface MapSint64Sint64Entry : pbandk.Message, Map.Entry<Long, Long> {
        public override val key: Long
        public override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry>

        public fun copy(
            key: Long = this.key,
            value: Long = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry> {
            @Deprecated("Use mapSint64Sint64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry = TestAllTypesProto3_MapSint64Sint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapSint64Sint64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSint64Sint64Entry : TestAllTypesProto3.MapSint64Sint64Entry, pbandk.MutableMessage {
        public override var key: Long
        public override var value: Long

        public fun toMapSint64Sint64Entry(): TestAllTypesProto3.MapSint64Sint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry> {
            @Deprecated("Use mapSint64Sint64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSint64Sint64Entry = TestAllTypesProto3_MutableMapSint64Sint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSint64Sint64Entry by lazy { MutableMapSint64Sint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry.descriptor
        }
    }

    public sealed interface MapFixed32Fixed32Entry : pbandk.Message, Map.Entry<Int, Int> {
        public override val key: Int
        public override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry>

        public fun copy(
            key: Int = this.key,
            value: Int = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry> {
            @Deprecated("Use mapFixed32Fixed32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry = TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapFixed32Fixed32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapFixed32Fixed32Entry : TestAllTypesProto3.MapFixed32Fixed32Entry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Int

        public fun toMapFixed32Fixed32Entry(): TestAllTypesProto3.MapFixed32Fixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry> {
            @Deprecated("Use mapFixed32Fixed32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapFixed32Fixed32Entry = TestAllTypesProto3_MutableMapFixed32Fixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapFixed32Fixed32Entry by lazy { MutableMapFixed32Fixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry.descriptor
        }
    }

    public sealed interface MapFixed64Fixed64Entry : pbandk.Message, Map.Entry<Long, Long> {
        public override val key: Long
        public override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry>

        public fun copy(
            key: Long = this.key,
            value: Long = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry> {
            @Deprecated("Use mapFixed64Fixed64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry = TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapFixed64Fixed64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapFixed64Fixed64Entry : TestAllTypesProto3.MapFixed64Fixed64Entry, pbandk.MutableMessage {
        public override var key: Long
        public override var value: Long

        public fun toMapFixed64Fixed64Entry(): TestAllTypesProto3.MapFixed64Fixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry> {
            @Deprecated("Use mapFixed64Fixed64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapFixed64Fixed64Entry = TestAllTypesProto3_MutableMapFixed64Fixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapFixed64Fixed64Entry by lazy { MutableMapFixed64Fixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry.descriptor
        }
    }

    public sealed interface MapSfixed32Sfixed32Entry : pbandk.Message, Map.Entry<Int, Int> {
        public override val key: Int
        public override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry>

        public fun copy(
            key: Int = this.key,
            value: Int = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry> {
            @Deprecated("Use mapSfixed32Sfixed32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry = TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapSfixed32Sfixed32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSfixed32Sfixed32Entry : TestAllTypesProto3.MapSfixed32Sfixed32Entry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Int

        public fun toMapSfixed32Sfixed32Entry(): TestAllTypesProto3.MapSfixed32Sfixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry> {
            @Deprecated("Use mapSfixed32Sfixed32Entry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSfixed32Sfixed32Entry = TestAllTypesProto3_MutableMapSfixed32Sfixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSfixed32Sfixed32Entry by lazy { MutableMapSfixed32Sfixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry.descriptor
        }
    }

    public sealed interface MapSfixed64Sfixed64Entry : pbandk.Message, Map.Entry<Long, Long> {
        public override val key: Long
        public override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry>

        public fun copy(
            key: Long = this.key,
            value: Long = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry> {
            @Deprecated("Use mapSfixed64Sfixed64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry = TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapSfixed64Sfixed64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSfixed64Sfixed64Entry : TestAllTypesProto3.MapSfixed64Sfixed64Entry, pbandk.MutableMessage {
        public override var key: Long
        public override var value: Long

        public fun toMapSfixed64Sfixed64Entry(): TestAllTypesProto3.MapSfixed64Sfixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry> {
            @Deprecated("Use mapSfixed64Sfixed64Entry { } instead")
            public operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSfixed64Sfixed64Entry = TestAllTypesProto3_MutableMapSfixed64Sfixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSfixed64Sfixed64Entry by lazy { MutableMapSfixed64Sfixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry.descriptor
        }
    }

    public sealed interface MapInt32FloatEntry : pbandk.Message, Map.Entry<Int, Float> {
        public override val key: Int
        public override val value: Float

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry>

        public fun copy(
            key: Int = this.key,
            value: Float = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry> {
            @Deprecated("Use mapInt32FloatEntry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Float = 0.0F,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry = TestAllTypesProto3_MapInt32FloatEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry = pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapInt32FloatEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt32FloatEntry : TestAllTypesProto3.MapInt32FloatEntry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Float

        public fun toMapInt32FloatEntry(): TestAllTypesProto3.MapInt32FloatEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry> {
            @Deprecated("Use mapInt32FloatEntry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Float = 0.0F,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt32FloatEntry = TestAllTypesProto3_MutableMapInt32FloatEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt32FloatEntry by lazy { MutableMapInt32FloatEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry = pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry.descriptor
        }
    }

    public sealed interface MapInt32DoubleEntry : pbandk.Message, Map.Entry<Int, Double> {
        public override val key: Int
        public override val value: Double

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry>

        public fun copy(
            key: Int = this.key,
            value: Double = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry> {
            @Deprecated("Use mapInt32DoubleEntry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Double = 0.0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry = TestAllTypesProto3_MapInt32DoubleEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry = pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapInt32DoubleEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt32DoubleEntry : TestAllTypesProto3.MapInt32DoubleEntry, pbandk.MutableMessage {
        public override var key: Int
        public override var value: Double

        public fun toMapInt32DoubleEntry(): TestAllTypesProto3.MapInt32DoubleEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry> {
            @Deprecated("Use mapInt32DoubleEntry { } instead")
            public operator fun invoke(
                key: Int = 0,
                value: Double = 0.0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt32DoubleEntry = TestAllTypesProto3_MutableMapInt32DoubleEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt32DoubleEntry by lazy { MutableMapInt32DoubleEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry = pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry.descriptor
        }
    }

    public sealed interface MapBoolBoolEntry : pbandk.Message, Map.Entry<Boolean, Boolean> {
        public override val key: Boolean
        public override val value: Boolean

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry>

        public fun copy(
            key: Boolean = this.key,
            value: Boolean = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry> {
            @Deprecated("Use mapBoolBoolEntry { } instead")
            public operator fun invoke(
                key: Boolean = false,
                value: Boolean = false,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry = TestAllTypesProto3_MapBoolBoolEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry = pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapBoolBoolEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapBoolBoolEntry : TestAllTypesProto3.MapBoolBoolEntry, pbandk.MutableMessage {
        public override var key: Boolean
        public override var value: Boolean

        public fun toMapBoolBoolEntry(): TestAllTypesProto3.MapBoolBoolEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry> {
            @Deprecated("Use mapBoolBoolEntry { } instead")
            public operator fun invoke(
                key: Boolean = false,
                value: Boolean = false,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapBoolBoolEntry = TestAllTypesProto3_MutableMapBoolBoolEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapBoolBoolEntry by lazy { MutableMapBoolBoolEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry = pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry.descriptor
        }
    }

    public sealed interface MapStringStringEntry : pbandk.Message, Map.Entry<String, String> {
        public override val key: String
        public override val value: String

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry>

        public fun copy(
            key: String = this.key,
            value: String = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry> {
            @Deprecated("Use mapStringStringEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: String = "",
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry = TestAllTypesProto3_MapStringStringEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapStringStringEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringStringEntry : TestAllTypesProto3.MapStringStringEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: String

        public fun toMapStringStringEntry(): TestAllTypesProto3.MapStringStringEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry> {
            @Deprecated("Use mapStringStringEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: String = "",
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringStringEntry = TestAllTypesProto3_MutableMapStringStringEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringStringEntry by lazy { MutableMapStringStringEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry.descriptor
        }
    }

    public sealed interface MapStringBytesEntry : pbandk.Message, Map.Entry<String, pbandk.ByteArr> {
        public override val key: String
        public override val value: pbandk.ByteArr

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.ByteArr = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry> {
            @Deprecated("Use mapStringBytesEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.ByteArr = pbandk.ByteArr.empty,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry = TestAllTypesProto3_MapStringBytesEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapStringBytesEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringBytesEntry : TestAllTypesProto3.MapStringBytesEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.ByteArr

        public fun toMapStringBytesEntry(): TestAllTypesProto3.MapStringBytesEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry> {
            @Deprecated("Use mapStringBytesEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.ByteArr = pbandk.ByteArr.empty,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringBytesEntry = TestAllTypesProto3_MutableMapStringBytesEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringBytesEntry by lazy { MutableMapStringBytesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry.descriptor
        }
    }

    public sealed interface MapStringNestedMessageEntry : pbandk.Message, Map.Entry<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?> {
        public override val key: String
        public override val value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry> {
            @Deprecated("Use mapStringNestedMessageEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry = TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapStringNestedMessageEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringNestedMessageEntry : TestAllTypesProto3.MapStringNestedMessageEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?

        public fun toMapStringNestedMessageEntry(): TestAllTypesProto3.MapStringNestedMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry> {
            @Deprecated("Use mapStringNestedMessageEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringNestedMessageEntry = TestAllTypesProto3_MutableMapStringNestedMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringNestedMessageEntry by lazy { MutableMapStringNestedMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry.descriptor
        }
    }

    public sealed interface MapStringForeignMessageEntry : pbandk.Message, Map.Entry<String, pbandk.conformance.pb.ForeignMessage?> {
        public override val key: String
        public override val value: pbandk.conformance.pb.ForeignMessage?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.conformance.pb.ForeignMessage? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry> {
            @Deprecated("Use mapStringForeignMessageEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.ForeignMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry = TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapStringForeignMessageEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringForeignMessageEntry : TestAllTypesProto3.MapStringForeignMessageEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.conformance.pb.ForeignMessage?

        public fun toMapStringForeignMessageEntry(): TestAllTypesProto3.MapStringForeignMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry> {
            @Deprecated("Use mapStringForeignMessageEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.ForeignMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringForeignMessageEntry = TestAllTypesProto3_MutableMapStringForeignMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringForeignMessageEntry by lazy { MutableMapStringForeignMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry.descriptor
        }
    }

    public sealed interface MapStringNestedEnumEntry : pbandk.Message, Map.Entry<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> {
        public override val key: String
        public override val value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry> {
            @Deprecated("Use mapStringNestedEnumEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry = TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapStringNestedEnumEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringNestedEnumEntry : TestAllTypesProto3.MapStringNestedEnumEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum

        public fun toMapStringNestedEnumEntry(): TestAllTypesProto3.MapStringNestedEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry> {
            @Deprecated("Use mapStringNestedEnumEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringNestedEnumEntry = TestAllTypesProto3_MutableMapStringNestedEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringNestedEnumEntry by lazy { MutableMapStringNestedEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry.descriptor
        }
    }

    public sealed interface MapStringForeignEnumEntry : pbandk.Message, Map.Entry<String, pbandk.conformance.pb.ForeignEnum> {
        public override val key: String
        public override val value: pbandk.conformance.pb.ForeignEnum

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry>

        public fun copy(
            key: String = this.key,
            value: pbandk.conformance.pb.ForeignEnum = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry> {
            @Deprecated("Use mapStringForeignEnumEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry = TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry by lazy { pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.MapStringForeignEnumEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringForeignEnumEntry : TestAllTypesProto3.MapStringForeignEnumEntry, pbandk.MutableMessage {
        public override var key: String
        public override var value: pbandk.conformance.pb.ForeignEnum

        public fun toMapStringForeignEnumEntry(): TestAllTypesProto3.MapStringForeignEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry> {
            @Deprecated("Use mapStringForeignEnumEntry { } instead")
            public operator fun invoke(
                key: String = "",
                value: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringForeignEnumEntry = TestAllTypesProto3_MutableMapStringForeignEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringForeignEnumEntry by lazy { MutableMapStringForeignEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry> get() = pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry.descriptor
        }
    }
}

public sealed interface MutableTestAllTypesProto3 : TestAllTypesProto3, pbandk.MutableMessage {
    public override var optionalInt32: Int
    public override var optionalInt64: Long
    public override var optionalUint32: Int
    public override var optionalUint64: Long
    public override var optionalSint32: Int
    public override var optionalSint64: Long
    public override var optionalFixed32: Int
    public override var optionalFixed64: Long
    public override var optionalSfixed32: Int
    public override var optionalSfixed64: Long
    public override var optionalFloat: Float
    public override var optionalDouble: Double
    public override var optionalBool: Boolean
    public override var optionalString: String
    public override var optionalBytes: pbandk.ByteArr
    public override var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
    public override var optionalForeignMessage: pbandk.conformance.pb.ForeignMessage?
    public override var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum
    public override var optionalForeignEnum: pbandk.conformance.pb.ForeignEnum
    public override var optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum
    public override var optionalStringPiece: String
    public override var optionalCord: String
    public override var recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3?
    public override var repeatedInt32: List<Int>
    public override var repeatedInt64: List<Long>
    public override var repeatedUint32: List<Int>
    public override var repeatedUint64: List<Long>
    public override var repeatedSint32: List<Int>
    public override var repeatedSint64: List<Long>
    public override var repeatedFixed32: List<Int>
    public override var repeatedFixed64: List<Long>
    public override var repeatedSfixed32: List<Int>
    public override var repeatedSfixed64: List<Long>
    public override var repeatedFloat: List<Float>
    public override var repeatedDouble: List<Double>
    public override var repeatedBool: List<Boolean>
    public override var repeatedString: List<String>
    public override var repeatedBytes: List<pbandk.ByteArr>
    public override var repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>
    public override var repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage>
    public override var repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override var repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum>
    public override var repeatedStringPiece: List<String>
    public override var repeatedCord: List<String>
    public override var packedInt32: List<Int>
    public override var packedInt64: List<Long>
    public override var packedUint32: List<Int>
    public override var packedUint64: List<Long>
    public override var packedSint32: List<Int>
    public override var packedSint64: List<Long>
    public override var packedFixed32: List<Int>
    public override var packedFixed64: List<Long>
    public override var packedSfixed32: List<Int>
    public override var packedSfixed64: List<Long>
    public override var packedFloat: List<Float>
    public override var packedDouble: List<Double>
    public override var packedBool: List<Boolean>
    public override var packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override var unpackedInt32: List<Int>
    public override var unpackedInt64: List<Long>
    public override var unpackedUint32: List<Int>
    public override var unpackedUint64: List<Long>
    public override var unpackedSint32: List<Int>
    public override var unpackedSint64: List<Long>
    public override var unpackedFixed32: List<Int>
    public override var unpackedFixed64: List<Long>
    public override var unpackedSfixed32: List<Int>
    public override var unpackedSfixed64: List<Long>
    public override var unpackedFloat: List<Float>
    public override var unpackedDouble: List<Double>
    public override var unpackedBool: List<Boolean>
    public override var unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override var mapInt32Int32: Map<Int, Int>
    public override var mapInt64Int64: Map<Long, Long>
    public override var mapUint32Uint32: Map<Int, Int>
    public override var mapUint64Uint64: Map<Long, Long>
    public override var mapSint32Sint32: Map<Int, Int>
    public override var mapSint64Sint64: Map<Long, Long>
    public override var mapFixed32Fixed32: Map<Int, Int>
    public override var mapFixed64Fixed64: Map<Long, Long>
    public override var mapSfixed32Sfixed32: Map<Int, Int>
    public override var mapSfixed64Sfixed64: Map<Long, Long>
    public override var mapInt32Float: Map<Int, Float>
    public override var mapInt32Double: Map<Int, Double>
    public override var mapBoolBool: Map<Boolean, Boolean>
    public override var mapStringString: Map<String, String>
    public override var mapStringBytes: Map<String, pbandk.ByteArr>
    public override var mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>
    public override var mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?>
    public override var mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override var mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum>
    public override var optionalBoolWrapper: Boolean?
    public override var optionalInt32Wrapper: Int?
    public override var optionalInt64Wrapper: Long?
    public override var optionalUint32Wrapper: Int?
    public override var optionalUint64Wrapper: Long?
    public override var optionalFloatWrapper: Float?
    public override var optionalDoubleWrapper: Double?
    public override var optionalStringWrapper: String?
    public override var optionalBytesWrapper: pbandk.ByteArr?
    public override var repeatedBoolWrapper: List<Boolean>
    public override var repeatedInt32Wrapper: List<Int>
    public override var repeatedInt64Wrapper: List<Long>
    public override var repeatedUint32Wrapper: List<Int>
    public override var repeatedUint64Wrapper: List<Long>
    public override var repeatedFloatWrapper: List<Float>
    public override var repeatedDoubleWrapper: List<Double>
    public override var repeatedStringWrapper: List<String>
    public override var repeatedBytesWrapper: List<pbandk.ByteArr>
    public override var optionalDuration: pbandk.wkt.Duration?
    public override var optionalTimestamp: pbandk.wkt.Timestamp?
    public override var optionalFieldMask: pbandk.wkt.FieldMask?
    public override var optionalStruct: pbandk.wkt.Struct?
    public override var optionalAny: pbandk.wkt.Any?
    public override var optionalValue: pbandk.wkt.Value?
    public override var repeatedDuration: List<pbandk.wkt.Duration>
    public override var repeatedTimestamp: List<pbandk.wkt.Timestamp>
    public override var repeatedFieldmask: List<pbandk.wkt.FieldMask>
    public override var repeatedStruct: List<pbandk.wkt.Struct>
    public override var repeatedAny: List<pbandk.wkt.Any>
    public override var repeatedValue: List<pbandk.wkt.Value>
    public override var repeatedListValue: List<pbandk.wkt.ListValue>
    public override var fieldname1: Int
    public override var fieldName2: Int
    public override var fieldName3: Int
    public override var field_name4: Int
    public override var field0name5: Int
    public override var field0Name6: Int
    public override var fieldName7: Int
    public override var fieldName8: Int
    public override var fieldName9: Int
    public override var fieldName10: Int
    public override var fIELDNAME11: Int
    public override var fIELDName12: Int
    public override var _fieldName13: Int
    public override var _FieldName14: Int
    public override var field_name15: Int
    public override var field_Name16: Int
    public override var fieldName17_: Int
    public override var fieldName18_: Int
    public override var oneofField: TestAllTypesProto3.OneofField<*>?

    public override var oneofUint32: Int?
    public override var oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
    public override var oneofString: String?
    public override var oneofBytes: pbandk.ByteArr?
    public override var oneofBool: Boolean?
    public override var oneofUint64: Long?
    public override var oneofFloat: Float?
    public override var oneofDouble: Double?
    public override var oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum?

    public fun toTestAllTypesProto3(): TestAllTypesProto3

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3> {
        @Deprecated("Use testAllTypesProto3 { } instead")
        public operator fun invoke(
            optionalInt32: Int = 0,
            optionalInt64: Long = 0L,
            optionalUint32: Int = 0,
            optionalUint64: Long = 0L,
            optionalSint32: Int = 0,
            optionalSint64: Long = 0L,
            optionalFixed32: Int = 0,
            optionalFixed64: Long = 0L,
            optionalSfixed32: Int = 0,
            optionalSfixed64: Long = 0L,
            optionalFloat: Float = 0.0F,
            optionalDouble: Double = 0.0,
            optionalBool: Boolean = false,
            optionalString: String = "",
            optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
            optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null,
            optionalForeignMessage: pbandk.conformance.pb.ForeignMessage? = null,
            optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
            optionalForeignEnum: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
            optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromValue(0),
            optionalStringPiece: String = "",
            optionalCord: String = "",
            recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3? = null,
            repeatedInt32: List<Int> = emptyList(),
            repeatedInt64: List<Long> = emptyList(),
            repeatedUint32: List<Int> = emptyList(),
            repeatedUint64: List<Long> = emptyList(),
            repeatedSint32: List<Int> = emptyList(),
            repeatedSint64: List<Long> = emptyList(),
            repeatedFixed32: List<Int> = emptyList(),
            repeatedFixed64: List<Long> = emptyList(),
            repeatedSfixed32: List<Int> = emptyList(),
            repeatedSfixed64: List<Long> = emptyList(),
            repeatedFloat: List<Float> = emptyList(),
            repeatedDouble: List<Double> = emptyList(),
            repeatedBool: List<Boolean> = emptyList(),
            repeatedString: List<String> = emptyList(),
            repeatedBytes: List<pbandk.ByteArr> = emptyList(),
            repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> = emptyList(),
            repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage> = emptyList(),
            repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
            repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum> = emptyList(),
            repeatedStringPiece: List<String> = emptyList(),
            repeatedCord: List<String> = emptyList(),
            packedInt32: List<Int> = emptyList(),
            packedInt64: List<Long> = emptyList(),
            packedUint32: List<Int> = emptyList(),
            packedUint64: List<Long> = emptyList(),
            packedSint32: List<Int> = emptyList(),
            packedSint64: List<Long> = emptyList(),
            packedFixed32: List<Int> = emptyList(),
            packedFixed64: List<Long> = emptyList(),
            packedSfixed32: List<Int> = emptyList(),
            packedSfixed64: List<Long> = emptyList(),
            packedFloat: List<Float> = emptyList(),
            packedDouble: List<Double> = emptyList(),
            packedBool: List<Boolean> = emptyList(),
            packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
            unpackedInt32: List<Int> = emptyList(),
            unpackedInt64: List<Long> = emptyList(),
            unpackedUint32: List<Int> = emptyList(),
            unpackedUint64: List<Long> = emptyList(),
            unpackedSint32: List<Int> = emptyList(),
            unpackedSint64: List<Long> = emptyList(),
            unpackedFixed32: List<Int> = emptyList(),
            unpackedFixed64: List<Long> = emptyList(),
            unpackedSfixed32: List<Int> = emptyList(),
            unpackedSfixed64: List<Long> = emptyList(),
            unpackedFloat: List<Float> = emptyList(),
            unpackedDouble: List<Double> = emptyList(),
            unpackedBool: List<Boolean> = emptyList(),
            unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
            mapInt32Int32: Map<Int, Int> = emptyMap(),
            mapInt64Int64: Map<Long, Long> = emptyMap(),
            mapUint32Uint32: Map<Int, Int> = emptyMap(),
            mapUint64Uint64: Map<Long, Long> = emptyMap(),
            mapSint32Sint32: Map<Int, Int> = emptyMap(),
            mapSint64Sint64: Map<Long, Long> = emptyMap(),
            mapFixed32Fixed32: Map<Int, Int> = emptyMap(),
            mapFixed64Fixed64: Map<Long, Long> = emptyMap(),
            mapSfixed32Sfixed32: Map<Int, Int> = emptyMap(),
            mapSfixed64Sfixed64: Map<Long, Long> = emptyMap(),
            mapInt32Float: Map<Int, Float> = emptyMap(),
            mapInt32Double: Map<Int, Double> = emptyMap(),
            mapBoolBool: Map<Boolean, Boolean> = emptyMap(),
            mapStringString: Map<String, String> = emptyMap(),
            mapStringBytes: Map<String, pbandk.ByteArr> = emptyMap(),
            mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?> = emptyMap(),
            mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?> = emptyMap(),
            mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyMap(),
            mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum> = emptyMap(),
            optionalBoolWrapper: Boolean? = null,
            optionalInt32Wrapper: Int? = null,
            optionalInt64Wrapper: Long? = null,
            optionalUint32Wrapper: Int? = null,
            optionalUint64Wrapper: Long? = null,
            optionalFloatWrapper: Float? = null,
            optionalDoubleWrapper: Double? = null,
            optionalStringWrapper: String? = null,
            optionalBytesWrapper: pbandk.ByteArr? = null,
            repeatedBoolWrapper: List<Boolean> = emptyList(),
            repeatedInt32Wrapper: List<Int> = emptyList(),
            repeatedInt64Wrapper: List<Long> = emptyList(),
            repeatedUint32Wrapper: List<Int> = emptyList(),
            repeatedUint64Wrapper: List<Long> = emptyList(),
            repeatedFloatWrapper: List<Float> = emptyList(),
            repeatedDoubleWrapper: List<Double> = emptyList(),
            repeatedStringWrapper: List<String> = emptyList(),
            repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
            optionalDuration: pbandk.wkt.Duration? = null,
            optionalTimestamp: pbandk.wkt.Timestamp? = null,
            optionalFieldMask: pbandk.wkt.FieldMask? = null,
            optionalStruct: pbandk.wkt.Struct? = null,
            optionalAny: pbandk.wkt.Any? = null,
            optionalValue: pbandk.wkt.Value? = null,
            repeatedDuration: List<pbandk.wkt.Duration> = emptyList(),
            repeatedTimestamp: List<pbandk.wkt.Timestamp> = emptyList(),
            repeatedFieldmask: List<pbandk.wkt.FieldMask> = emptyList(),
            repeatedStruct: List<pbandk.wkt.Struct> = emptyList(),
            repeatedAny: List<pbandk.wkt.Any> = emptyList(),
            repeatedValue: List<pbandk.wkt.Value> = emptyList(),
            repeatedListValue: List<pbandk.wkt.ListValue> = emptyList(),
            fieldname1: Int = 0,
            fieldName2: Int = 0,
            fieldName3: Int = 0,
            field_name4: Int = 0,
            field0name5: Int = 0,
            field0Name6: Int = 0,
            fieldName7: Int = 0,
            fieldName8: Int = 0,
            fieldName9: Int = 0,
            fieldName10: Int = 0,
            fIELDNAME11: Int = 0,
            fIELDName12: Int = 0,
            _fieldName13: Int = 0,
            _FieldName14: Int = 0,
            field_name15: Int = 0,
            field_Name16: Int = 0,
            fieldName17_: Int = 0,
            fieldName18_: Int = 0,
            oneofField: pbandk.conformance.pb.TestAllTypesProto3.OneofField<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableTestAllTypesProto3 = MutableTestAllTypesProto3_Impl(
            optionalInt32 = optionalInt32,
            optionalInt64 = optionalInt64,
            optionalUint32 = optionalUint32,
            optionalUint64 = optionalUint64,
            optionalSint32 = optionalSint32,
            optionalSint64 = optionalSint64,
            optionalFixed32 = optionalFixed32,
            optionalFixed64 = optionalFixed64,
            optionalSfixed32 = optionalSfixed32,
            optionalSfixed64 = optionalSfixed64,
            optionalFloat = optionalFloat,
            optionalDouble = optionalDouble,
            optionalBool = optionalBool,
            optionalString = optionalString,
            optionalBytes = optionalBytes,
            optionalNestedMessage = optionalNestedMessage,
            optionalForeignMessage = optionalForeignMessage,
            optionalNestedEnum = optionalNestedEnum,
            optionalForeignEnum = optionalForeignEnum,
            optionalAliasedEnum = optionalAliasedEnum,
            optionalStringPiece = optionalStringPiece,
            optionalCord = optionalCord,
            recursiveMessage = recursiveMessage,
            repeatedInt32 = repeatedInt32,
            repeatedInt64 = repeatedInt64,
            repeatedUint32 = repeatedUint32,
            repeatedUint64 = repeatedUint64,
            repeatedSint32 = repeatedSint32,
            repeatedSint64 = repeatedSint64,
            repeatedFixed32 = repeatedFixed32,
            repeatedFixed64 = repeatedFixed64,
            repeatedSfixed32 = repeatedSfixed32,
            repeatedSfixed64 = repeatedSfixed64,
            repeatedFloat = repeatedFloat,
            repeatedDouble = repeatedDouble,
            repeatedBool = repeatedBool,
            repeatedString = repeatedString,
            repeatedBytes = repeatedBytes,
            repeatedNestedMessage = repeatedNestedMessage,
            repeatedForeignMessage = repeatedForeignMessage,
            repeatedNestedEnum = repeatedNestedEnum,
            repeatedForeignEnum = repeatedForeignEnum,
            repeatedStringPiece = repeatedStringPiece,
            repeatedCord = repeatedCord,
            packedInt32 = packedInt32,
            packedInt64 = packedInt64,
            packedUint32 = packedUint32,
            packedUint64 = packedUint64,
            packedSint32 = packedSint32,
            packedSint64 = packedSint64,
            packedFixed32 = packedFixed32,
            packedFixed64 = packedFixed64,
            packedSfixed32 = packedSfixed32,
            packedSfixed64 = packedSfixed64,
            packedFloat = packedFloat,
            packedDouble = packedDouble,
            packedBool = packedBool,
            packedNestedEnum = packedNestedEnum,
            unpackedInt32 = unpackedInt32,
            unpackedInt64 = unpackedInt64,
            unpackedUint32 = unpackedUint32,
            unpackedUint64 = unpackedUint64,
            unpackedSint32 = unpackedSint32,
            unpackedSint64 = unpackedSint64,
            unpackedFixed32 = unpackedFixed32,
            unpackedFixed64 = unpackedFixed64,
            unpackedSfixed32 = unpackedSfixed32,
            unpackedSfixed64 = unpackedSfixed64,
            unpackedFloat = unpackedFloat,
            unpackedDouble = unpackedDouble,
            unpackedBool = unpackedBool,
            unpackedNestedEnum = unpackedNestedEnum,
            mapInt32Int32 = mapInt32Int32,
            mapInt64Int64 = mapInt64Int64,
            mapUint32Uint32 = mapUint32Uint32,
            mapUint64Uint64 = mapUint64Uint64,
            mapSint32Sint32 = mapSint32Sint32,
            mapSint64Sint64 = mapSint64Sint64,
            mapFixed32Fixed32 = mapFixed32Fixed32,
            mapFixed64Fixed64 = mapFixed64Fixed64,
            mapSfixed32Sfixed32 = mapSfixed32Sfixed32,
            mapSfixed64Sfixed64 = mapSfixed64Sfixed64,
            mapInt32Float = mapInt32Float,
            mapInt32Double = mapInt32Double,
            mapBoolBool = mapBoolBool,
            mapStringString = mapStringString,
            mapStringBytes = mapStringBytes,
            mapStringNestedMessage = mapStringNestedMessage,
            mapStringForeignMessage = mapStringForeignMessage,
            mapStringNestedEnum = mapStringNestedEnum,
            mapStringForeignEnum = mapStringForeignEnum,
            optionalBoolWrapper = optionalBoolWrapper,
            optionalInt32Wrapper = optionalInt32Wrapper,
            optionalInt64Wrapper = optionalInt64Wrapper,
            optionalUint32Wrapper = optionalUint32Wrapper,
            optionalUint64Wrapper = optionalUint64Wrapper,
            optionalFloatWrapper = optionalFloatWrapper,
            optionalDoubleWrapper = optionalDoubleWrapper,
            optionalStringWrapper = optionalStringWrapper,
            optionalBytesWrapper = optionalBytesWrapper,
            repeatedBoolWrapper = repeatedBoolWrapper,
            repeatedInt32Wrapper = repeatedInt32Wrapper,
            repeatedInt64Wrapper = repeatedInt64Wrapper,
            repeatedUint32Wrapper = repeatedUint32Wrapper,
            repeatedUint64Wrapper = repeatedUint64Wrapper,
            repeatedFloatWrapper = repeatedFloatWrapper,
            repeatedDoubleWrapper = repeatedDoubleWrapper,
            repeatedStringWrapper = repeatedStringWrapper,
            repeatedBytesWrapper = repeatedBytesWrapper,
            optionalDuration = optionalDuration,
            optionalTimestamp = optionalTimestamp,
            optionalFieldMask = optionalFieldMask,
            optionalStruct = optionalStruct,
            optionalAny = optionalAny,
            optionalValue = optionalValue,
            repeatedDuration = repeatedDuration,
            repeatedTimestamp = repeatedTimestamp,
            repeatedFieldmask = repeatedFieldmask,
            repeatedStruct = repeatedStruct,
            repeatedAny = repeatedAny,
            repeatedValue = repeatedValue,
            repeatedListValue = repeatedListValue,
            fieldname1 = fieldname1,
            fieldName2 = fieldName2,
            fieldName3 = fieldName3,
            field_name4 = field_name4,
            field0name5 = field0name5,
            field0Name6 = field0Name6,
            fieldName7 = fieldName7,
            fieldName8 = fieldName8,
            fieldName9 = fieldName9,
            fieldName10 = fieldName10,
            fIELDNAME11 = fIELDNAME11,
            fIELDName12 = fIELDName12,
            _fieldName13 = _fieldName13,
            _FieldName14 = _FieldName14,
            field_name15 = field_name15,
            field_Name16 = field_Name16,
            fieldName17_ = fieldName17_,
            fieldName18_ = fieldName18_,
            oneofField = oneofField,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableTestAllTypesProto3 by lazy { MutableTestAllTypesProto3() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto3 = pbandk.conformance.pb.TestAllTypesProto3.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3> get() = pbandk.conformance.pb.TestAllTypesProto3.descriptor
    }
}

public sealed interface ForeignMessage : pbandk.Message {
    public val c: Int

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ForeignMessage
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessage>

    public fun copy(
        c: Int = this.c,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.ForeignMessage

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ForeignMessage> {
        @Deprecated("Use foreignMessage { } instead")
        public operator fun invoke(
            c: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.ForeignMessage = ForeignMessage_Impl(
            c = c,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.ForeignMessage by lazy { pbandk.conformance.pb.ForeignMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ForeignMessage = pbandk.conformance.pb.ForeignMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessage> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.ForeignMessage, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "c",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "c",
                        value = pbandk.conformance.pb.ForeignMessage::c
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto3.ForeignMessage",
                messageClass = pbandk.conformance.pb.ForeignMessage::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableForeignMessage : ForeignMessage, pbandk.MutableMessage {
    public override var c: Int

    public fun toForeignMessage(): ForeignMessage

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ForeignMessage> {
        @Deprecated("Use foreignMessage { } instead")
        public operator fun invoke(
            c: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableForeignMessage = MutableForeignMessage_Impl(
            c = c,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableForeignMessage by lazy { MutableForeignMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ForeignMessage = pbandk.conformance.pb.ForeignMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessage> get() = pbandk.conformance.pb.ForeignMessage.descriptor
    }
}

public fun testAllTypesProto3(builderAction: MutableTestAllTypesProto3.() -> Unit): TestAllTypesProto3 {
    @Suppress("DEPRECATION") val builder = MutableTestAllTypesProto3()
    builder.builderAction()
    return builder.toTestAllTypesProto3()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3")
public fun TestAllTypesProto3?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3 = this ?: TestAllTypesProto3.defaultInstance

private class TestAllTypesProto3_Impl(
    override val optionalInt32: Int,
    override val optionalInt64: Long,
    override val optionalUint32: Int,
    override val optionalUint64: Long,
    override val optionalSint32: Int,
    override val optionalSint64: Long,
    override val optionalFixed32: Int,
    override val optionalFixed64: Long,
    override val optionalSfixed32: Int,
    override val optionalSfixed64: Long,
    override val optionalFloat: Float,
    override val optionalDouble: Double,
    override val optionalBool: Boolean,
    override val optionalString: String,
    override val optionalBytes: pbandk.ByteArr,
    override val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
    override val optionalForeignMessage: pbandk.conformance.pb.ForeignMessage?,
    override val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
    override val optionalForeignEnum: pbandk.conformance.pb.ForeignEnum,
    override val optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum,
    override val optionalStringPiece: String,
    override val optionalCord: String,
    override val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3?,
    override val repeatedInt32: List<Int>,
    override val repeatedInt64: List<Long>,
    override val repeatedUint32: List<Int>,
    override val repeatedUint64: List<Long>,
    override val repeatedSint32: List<Int>,
    override val repeatedSint64: List<Long>,
    override val repeatedFixed32: List<Int>,
    override val repeatedFixed64: List<Long>,
    override val repeatedSfixed32: List<Int>,
    override val repeatedSfixed64: List<Long>,
    override val repeatedFloat: List<Float>,
    override val repeatedDouble: List<Double>,
    override val repeatedBool: List<Boolean>,
    override val repeatedString: List<String>,
    override val repeatedBytes: List<pbandk.ByteArr>,
    override val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>,
    override val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage>,
    override val repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum>,
    override val repeatedStringPiece: List<String>,
    override val repeatedCord: List<String>,
    override val packedInt32: List<Int>,
    override val packedInt64: List<Long>,
    override val packedUint32: List<Int>,
    override val packedUint64: List<Long>,
    override val packedSint32: List<Int>,
    override val packedSint64: List<Long>,
    override val packedFixed32: List<Int>,
    override val packedFixed64: List<Long>,
    override val packedSfixed32: List<Int>,
    override val packedSfixed64: List<Long>,
    override val packedFloat: List<Float>,
    override val packedDouble: List<Double>,
    override val packedBool: List<Boolean>,
    override val packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val unpackedInt32: List<Int>,
    override val unpackedInt64: List<Long>,
    override val unpackedUint32: List<Int>,
    override val unpackedUint64: List<Long>,
    override val unpackedSint32: List<Int>,
    override val unpackedSint64: List<Long>,
    override val unpackedFixed32: List<Int>,
    override val unpackedFixed64: List<Long>,
    override val unpackedSfixed32: List<Int>,
    override val unpackedSfixed64: List<Long>,
    override val unpackedFloat: List<Float>,
    override val unpackedDouble: List<Double>,
    override val unpackedBool: List<Boolean>,
    override val unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val mapInt32Int32: Map<Int, Int>,
    override val mapInt64Int64: Map<Long, Long>,
    override val mapUint32Uint32: Map<Int, Int>,
    override val mapUint64Uint64: Map<Long, Long>,
    override val mapSint32Sint32: Map<Int, Int>,
    override val mapSint64Sint64: Map<Long, Long>,
    override val mapFixed32Fixed32: Map<Int, Int>,
    override val mapFixed64Fixed64: Map<Long, Long>,
    override val mapSfixed32Sfixed32: Map<Int, Int>,
    override val mapSfixed64Sfixed64: Map<Long, Long>,
    override val mapInt32Float: Map<Int, Float>,
    override val mapInt32Double: Map<Int, Double>,
    override val mapBoolBool: Map<Boolean, Boolean>,
    override val mapStringString: Map<String, String>,
    override val mapStringBytes: Map<String, pbandk.ByteArr>,
    override val mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>,
    override val mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?>,
    override val mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum>,
    override val optionalBoolWrapper: Boolean?,
    override val optionalInt32Wrapper: Int?,
    override val optionalInt64Wrapper: Long?,
    override val optionalUint32Wrapper: Int?,
    override val optionalUint64Wrapper: Long?,
    override val optionalFloatWrapper: Float?,
    override val optionalDoubleWrapper: Double?,
    override val optionalStringWrapper: String?,
    override val optionalBytesWrapper: pbandk.ByteArr?,
    override val repeatedBoolWrapper: List<Boolean>,
    override val repeatedInt32Wrapper: List<Int>,
    override val repeatedInt64Wrapper: List<Long>,
    override val repeatedUint32Wrapper: List<Int>,
    override val repeatedUint64Wrapper: List<Long>,
    override val repeatedFloatWrapper: List<Float>,
    override val repeatedDoubleWrapper: List<Double>,
    override val repeatedStringWrapper: List<String>,
    override val repeatedBytesWrapper: List<pbandk.ByteArr>,
    override val optionalDuration: pbandk.wkt.Duration?,
    override val optionalTimestamp: pbandk.wkt.Timestamp?,
    override val optionalFieldMask: pbandk.wkt.FieldMask?,
    override val optionalStruct: pbandk.wkt.Struct?,
    override val optionalAny: pbandk.wkt.Any?,
    override val optionalValue: pbandk.wkt.Value?,
    override val repeatedDuration: List<pbandk.wkt.Duration>,
    override val repeatedTimestamp: List<pbandk.wkt.Timestamp>,
    override val repeatedFieldmask: List<pbandk.wkt.FieldMask>,
    override val repeatedStruct: List<pbandk.wkt.Struct>,
    override val repeatedAny: List<pbandk.wkt.Any>,
    override val repeatedValue: List<pbandk.wkt.Value>,
    override val repeatedListValue: List<pbandk.wkt.ListValue>,
    override val fieldname1: Int,
    override val fieldName2: Int,
    override val fieldName3: Int,
    override val field_name4: Int,
    override val field0name5: Int,
    override val field0Name6: Int,
    override val fieldName7: Int,
    override val fieldName8: Int,
    override val fieldName9: Int,
    override val fieldName10: Int,
    override val fIELDNAME11: Int,
    override val fIELDName12: Int,
    override val _fieldName13: Int,
    override val _FieldName14: Int,
    override val field_name15: Int,
    override val field_Name16: Int,
    override val fieldName17_: Int,
    override val fieldName18_: Int,
    override val oneofField: pbandk.conformance.pb.TestAllTypesProto3.OneofField<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3, pbandk.GeneratedMessage<TestAllTypesProto3>() {
    override val descriptor get() = TestAllTypesProto3.descriptor

    override val oneofUint32: Int?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofUint32)?.value
    override val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofNestedMessage)?.value
    override val oneofString: String?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofString)?.value
    override val oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofBytes)?.value
    override val oneofBool: Boolean?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofBool)?.value
    override val oneofUint64: Long?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofUint64)?.value
    override val oneofFloat: Float?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofFloat)?.value
    override val oneofDouble: Double?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofDouble)?.value
    override val oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofEnum)?.value

    override fun copy(
        optionalInt32: Int,
        optionalInt64: Long,
        optionalUint32: Int,
        optionalUint64: Long,
        optionalSint32: Int,
        optionalSint64: Long,
        optionalFixed32: Int,
        optionalFixed64: Long,
        optionalSfixed32: Int,
        optionalSfixed64: Long,
        optionalFloat: Float,
        optionalDouble: Double,
        optionalBool: Boolean,
        optionalString: String,
        optionalBytes: pbandk.ByteArr,
        optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
        optionalForeignMessage: pbandk.conformance.pb.ForeignMessage?,
        optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
        optionalForeignEnum: pbandk.conformance.pb.ForeignEnum,
        optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum,
        optionalStringPiece: String,
        optionalCord: String,
        recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3?,
        repeatedInt32: List<Int>,
        repeatedInt64: List<Long>,
        repeatedUint32: List<Int>,
        repeatedUint64: List<Long>,
        repeatedSint32: List<Int>,
        repeatedSint64: List<Long>,
        repeatedFixed32: List<Int>,
        repeatedFixed64: List<Long>,
        repeatedSfixed32: List<Int>,
        repeatedSfixed64: List<Long>,
        repeatedFloat: List<Float>,
        repeatedDouble: List<Double>,
        repeatedBool: List<Boolean>,
        repeatedString: List<String>,
        repeatedBytes: List<pbandk.ByteArr>,
        repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>,
        repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage>,
        repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum>,
        repeatedStringPiece: List<String>,
        repeatedCord: List<String>,
        packedInt32: List<Int>,
        packedInt64: List<Long>,
        packedUint32: List<Int>,
        packedUint64: List<Long>,
        packedSint32: List<Int>,
        packedSint64: List<Long>,
        packedFixed32: List<Int>,
        packedFixed64: List<Long>,
        packedSfixed32: List<Int>,
        packedSfixed64: List<Long>,
        packedFloat: List<Float>,
        packedDouble: List<Double>,
        packedBool: List<Boolean>,
        packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        unpackedInt32: List<Int>,
        unpackedInt64: List<Long>,
        unpackedUint32: List<Int>,
        unpackedUint64: List<Long>,
        unpackedSint32: List<Int>,
        unpackedSint64: List<Long>,
        unpackedFixed32: List<Int>,
        unpackedFixed64: List<Long>,
        unpackedSfixed32: List<Int>,
        unpackedSfixed64: List<Long>,
        unpackedFloat: List<Float>,
        unpackedDouble: List<Double>,
        unpackedBool: List<Boolean>,
        unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        mapInt32Int32: Map<Int, Int>,
        mapInt64Int64: Map<Long, Long>,
        mapUint32Uint32: Map<Int, Int>,
        mapUint64Uint64: Map<Long, Long>,
        mapSint32Sint32: Map<Int, Int>,
        mapSint64Sint64: Map<Long, Long>,
        mapFixed32Fixed32: Map<Int, Int>,
        mapFixed64Fixed64: Map<Long, Long>,
        mapSfixed32Sfixed32: Map<Int, Int>,
        mapSfixed64Sfixed64: Map<Long, Long>,
        mapInt32Float: Map<Int, Float>,
        mapInt32Double: Map<Int, Double>,
        mapBoolBool: Map<Boolean, Boolean>,
        mapStringString: Map<String, String>,
        mapStringBytes: Map<String, pbandk.ByteArr>,
        mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>,
        mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?>,
        mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum>,
        optionalBoolWrapper: Boolean?,
        optionalInt32Wrapper: Int?,
        optionalInt64Wrapper: Long?,
        optionalUint32Wrapper: Int?,
        optionalUint64Wrapper: Long?,
        optionalFloatWrapper: Float?,
        optionalDoubleWrapper: Double?,
        optionalStringWrapper: String?,
        optionalBytesWrapper: pbandk.ByteArr?,
        repeatedBoolWrapper: List<Boolean>,
        repeatedInt32Wrapper: List<Int>,
        repeatedInt64Wrapper: List<Long>,
        repeatedUint32Wrapper: List<Int>,
        repeatedUint64Wrapper: List<Long>,
        repeatedFloatWrapper: List<Float>,
        repeatedDoubleWrapper: List<Double>,
        repeatedStringWrapper: List<String>,
        repeatedBytesWrapper: List<pbandk.ByteArr>,
        optionalDuration: pbandk.wkt.Duration?,
        optionalTimestamp: pbandk.wkt.Timestamp?,
        optionalFieldMask: pbandk.wkt.FieldMask?,
        optionalStruct: pbandk.wkt.Struct?,
        optionalAny: pbandk.wkt.Any?,
        optionalValue: pbandk.wkt.Value?,
        repeatedDuration: List<pbandk.wkt.Duration>,
        repeatedTimestamp: List<pbandk.wkt.Timestamp>,
        repeatedFieldmask: List<pbandk.wkt.FieldMask>,
        repeatedStruct: List<pbandk.wkt.Struct>,
        repeatedAny: List<pbandk.wkt.Any>,
        repeatedValue: List<pbandk.wkt.Value>,
        repeatedListValue: List<pbandk.wkt.ListValue>,
        fieldname1: Int,
        fieldName2: Int,
        fieldName3: Int,
        field_name4: Int,
        field0name5: Int,
        field0Name6: Int,
        fieldName7: Int,
        fieldName8: Int,
        fieldName9: Int,
        fieldName10: Int,
        fIELDNAME11: Int,
        fIELDName12: Int,
        _fieldName13: Int,
        _FieldName14: Int,
        field_name15: Int,
        field_Name16: Int,
        fieldName17_: Int,
        fieldName18_: Int,
        oneofField: pbandk.conformance.pb.TestAllTypesProto3.OneofField<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_Impl(
        optionalInt32 = optionalInt32,
        optionalInt64 = optionalInt64,
        optionalUint32 = optionalUint32,
        optionalUint64 = optionalUint64,
        optionalSint32 = optionalSint32,
        optionalSint64 = optionalSint64,
        optionalFixed32 = optionalFixed32,
        optionalFixed64 = optionalFixed64,
        optionalSfixed32 = optionalSfixed32,
        optionalSfixed64 = optionalSfixed64,
        optionalFloat = optionalFloat,
        optionalDouble = optionalDouble,
        optionalBool = optionalBool,
        optionalString = optionalString,
        optionalBytes = optionalBytes,
        optionalNestedMessage = optionalNestedMessage,
        optionalForeignMessage = optionalForeignMessage,
        optionalNestedEnum = optionalNestedEnum,
        optionalForeignEnum = optionalForeignEnum,
        optionalAliasedEnum = optionalAliasedEnum,
        optionalStringPiece = optionalStringPiece,
        optionalCord = optionalCord,
        recursiveMessage = recursiveMessage,
        repeatedInt32 = repeatedInt32,
        repeatedInt64 = repeatedInt64,
        repeatedUint32 = repeatedUint32,
        repeatedUint64 = repeatedUint64,
        repeatedSint32 = repeatedSint32,
        repeatedSint64 = repeatedSint64,
        repeatedFixed32 = repeatedFixed32,
        repeatedFixed64 = repeatedFixed64,
        repeatedSfixed32 = repeatedSfixed32,
        repeatedSfixed64 = repeatedSfixed64,
        repeatedFloat = repeatedFloat,
        repeatedDouble = repeatedDouble,
        repeatedBool = repeatedBool,
        repeatedString = repeatedString,
        repeatedBytes = repeatedBytes,
        repeatedNestedMessage = repeatedNestedMessage,
        repeatedForeignMessage = repeatedForeignMessage,
        repeatedNestedEnum = repeatedNestedEnum,
        repeatedForeignEnum = repeatedForeignEnum,
        repeatedStringPiece = repeatedStringPiece,
        repeatedCord = repeatedCord,
        packedInt32 = packedInt32,
        packedInt64 = packedInt64,
        packedUint32 = packedUint32,
        packedUint64 = packedUint64,
        packedSint32 = packedSint32,
        packedSint64 = packedSint64,
        packedFixed32 = packedFixed32,
        packedFixed64 = packedFixed64,
        packedSfixed32 = packedSfixed32,
        packedSfixed64 = packedSfixed64,
        packedFloat = packedFloat,
        packedDouble = packedDouble,
        packedBool = packedBool,
        packedNestedEnum = packedNestedEnum,
        unpackedInt32 = unpackedInt32,
        unpackedInt64 = unpackedInt64,
        unpackedUint32 = unpackedUint32,
        unpackedUint64 = unpackedUint64,
        unpackedSint32 = unpackedSint32,
        unpackedSint64 = unpackedSint64,
        unpackedFixed32 = unpackedFixed32,
        unpackedFixed64 = unpackedFixed64,
        unpackedSfixed32 = unpackedSfixed32,
        unpackedSfixed64 = unpackedSfixed64,
        unpackedFloat = unpackedFloat,
        unpackedDouble = unpackedDouble,
        unpackedBool = unpackedBool,
        unpackedNestedEnum = unpackedNestedEnum,
        mapInt32Int32 = mapInt32Int32,
        mapInt64Int64 = mapInt64Int64,
        mapUint32Uint32 = mapUint32Uint32,
        mapUint64Uint64 = mapUint64Uint64,
        mapSint32Sint32 = mapSint32Sint32,
        mapSint64Sint64 = mapSint64Sint64,
        mapFixed32Fixed32 = mapFixed32Fixed32,
        mapFixed64Fixed64 = mapFixed64Fixed64,
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32,
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64,
        mapInt32Float = mapInt32Float,
        mapInt32Double = mapInt32Double,
        mapBoolBool = mapBoolBool,
        mapStringString = mapStringString,
        mapStringBytes = mapStringBytes,
        mapStringNestedMessage = mapStringNestedMessage,
        mapStringForeignMessage = mapStringForeignMessage,
        mapStringNestedEnum = mapStringNestedEnum,
        mapStringForeignEnum = mapStringForeignEnum,
        optionalBoolWrapper = optionalBoolWrapper,
        optionalInt32Wrapper = optionalInt32Wrapper,
        optionalInt64Wrapper = optionalInt64Wrapper,
        optionalUint32Wrapper = optionalUint32Wrapper,
        optionalUint64Wrapper = optionalUint64Wrapper,
        optionalFloatWrapper = optionalFloatWrapper,
        optionalDoubleWrapper = optionalDoubleWrapper,
        optionalStringWrapper = optionalStringWrapper,
        optionalBytesWrapper = optionalBytesWrapper,
        repeatedBoolWrapper = repeatedBoolWrapper,
        repeatedInt32Wrapper = repeatedInt32Wrapper,
        repeatedInt64Wrapper = repeatedInt64Wrapper,
        repeatedUint32Wrapper = repeatedUint32Wrapper,
        repeatedUint64Wrapper = repeatedUint64Wrapper,
        repeatedFloatWrapper = repeatedFloatWrapper,
        repeatedDoubleWrapper = repeatedDoubleWrapper,
        repeatedStringWrapper = repeatedStringWrapper,
        repeatedBytesWrapper = repeatedBytesWrapper,
        optionalDuration = optionalDuration,
        optionalTimestamp = optionalTimestamp,
        optionalFieldMask = optionalFieldMask,
        optionalStruct = optionalStruct,
        optionalAny = optionalAny,
        optionalValue = optionalValue,
        repeatedDuration = repeatedDuration,
        repeatedTimestamp = repeatedTimestamp,
        repeatedFieldmask = repeatedFieldmask,
        repeatedStruct = repeatedStruct,
        repeatedAny = repeatedAny,
        repeatedValue = repeatedValue,
        repeatedListValue = repeatedListValue,
        fieldname1 = fieldname1,
        fieldName2 = fieldName2,
        fieldName3 = fieldName3,
        field_name4 = field_name4,
        field0name5 = field0name5,
        field0Name6 = field0Name6,
        fieldName7 = fieldName7,
        fieldName8 = fieldName8,
        fieldName9 = fieldName9,
        fieldName10 = fieldName10,
        fIELDNAME11 = fIELDNAME11,
        fIELDName12 = fIELDName12,
        _fieldName13 = _fieldName13,
        _FieldName14 = _FieldName14,
        field_name15 = field_name15,
        field_Name16 = field_Name16,
        fieldName17_ = fieldName17_,
        fieldName18_ = fieldName18_,
        oneofField = oneofField,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3)?.let {
        it.copy(
            optionalNestedMessage = optionalNestedMessage?.plus(other.optionalNestedMessage) ?: other.optionalNestedMessage,
            optionalForeignMessage = optionalForeignMessage?.plus(other.optionalForeignMessage) ?: other.optionalForeignMessage,
            recursiveMessage = recursiveMessage?.plus(other.recursiveMessage) ?: other.recursiveMessage,
            repeatedInt32 = repeatedInt32 + other.repeatedInt32,
            repeatedInt64 = repeatedInt64 + other.repeatedInt64,
            repeatedUint32 = repeatedUint32 + other.repeatedUint32,
            repeatedUint64 = repeatedUint64 + other.repeatedUint64,
            repeatedSint32 = repeatedSint32 + other.repeatedSint32,
            repeatedSint64 = repeatedSint64 + other.repeatedSint64,
            repeatedFixed32 = repeatedFixed32 + other.repeatedFixed32,
            repeatedFixed64 = repeatedFixed64 + other.repeatedFixed64,
            repeatedSfixed32 = repeatedSfixed32 + other.repeatedSfixed32,
            repeatedSfixed64 = repeatedSfixed64 + other.repeatedSfixed64,
            repeatedFloat = repeatedFloat + other.repeatedFloat,
            repeatedDouble = repeatedDouble + other.repeatedDouble,
            repeatedBool = repeatedBool + other.repeatedBool,
            repeatedString = repeatedString + other.repeatedString,
            repeatedBytes = repeatedBytes + other.repeatedBytes,
            repeatedNestedMessage = repeatedNestedMessage + other.repeatedNestedMessage,
            repeatedForeignMessage = repeatedForeignMessage + other.repeatedForeignMessage,
            repeatedNestedEnum = repeatedNestedEnum + other.repeatedNestedEnum,
            repeatedForeignEnum = repeatedForeignEnum + other.repeatedForeignEnum,
            repeatedStringPiece = repeatedStringPiece + other.repeatedStringPiece,
            repeatedCord = repeatedCord + other.repeatedCord,
            packedInt32 = packedInt32 + other.packedInt32,
            packedInt64 = packedInt64 + other.packedInt64,
            packedUint32 = packedUint32 + other.packedUint32,
            packedUint64 = packedUint64 + other.packedUint64,
            packedSint32 = packedSint32 + other.packedSint32,
            packedSint64 = packedSint64 + other.packedSint64,
            packedFixed32 = packedFixed32 + other.packedFixed32,
            packedFixed64 = packedFixed64 + other.packedFixed64,
            packedSfixed32 = packedSfixed32 + other.packedSfixed32,
            packedSfixed64 = packedSfixed64 + other.packedSfixed64,
            packedFloat = packedFloat + other.packedFloat,
            packedDouble = packedDouble + other.packedDouble,
            packedBool = packedBool + other.packedBool,
            packedNestedEnum = packedNestedEnum + other.packedNestedEnum,
            unpackedInt32 = unpackedInt32 + other.unpackedInt32,
            unpackedInt64 = unpackedInt64 + other.unpackedInt64,
            unpackedUint32 = unpackedUint32 + other.unpackedUint32,
            unpackedUint64 = unpackedUint64 + other.unpackedUint64,
            unpackedSint32 = unpackedSint32 + other.unpackedSint32,
            unpackedSint64 = unpackedSint64 + other.unpackedSint64,
            unpackedFixed32 = unpackedFixed32 + other.unpackedFixed32,
            unpackedFixed64 = unpackedFixed64 + other.unpackedFixed64,
            unpackedSfixed32 = unpackedSfixed32 + other.unpackedSfixed32,
            unpackedSfixed64 = unpackedSfixed64 + other.unpackedSfixed64,
            unpackedFloat = unpackedFloat + other.unpackedFloat,
            unpackedDouble = unpackedDouble + other.unpackedDouble,
            unpackedBool = unpackedBool + other.unpackedBool,
            unpackedNestedEnum = unpackedNestedEnum + other.unpackedNestedEnum,
            mapInt32Int32 = mapInt32Int32 + other.mapInt32Int32,
            mapInt64Int64 = mapInt64Int64 + other.mapInt64Int64,
            mapUint32Uint32 = mapUint32Uint32 + other.mapUint32Uint32,
            mapUint64Uint64 = mapUint64Uint64 + other.mapUint64Uint64,
            mapSint32Sint32 = mapSint32Sint32 + other.mapSint32Sint32,
            mapSint64Sint64 = mapSint64Sint64 + other.mapSint64Sint64,
            mapFixed32Fixed32 = mapFixed32Fixed32 + other.mapFixed32Fixed32,
            mapFixed64Fixed64 = mapFixed64Fixed64 + other.mapFixed64Fixed64,
            mapSfixed32Sfixed32 = mapSfixed32Sfixed32 + other.mapSfixed32Sfixed32,
            mapSfixed64Sfixed64 = mapSfixed64Sfixed64 + other.mapSfixed64Sfixed64,
            mapInt32Float = mapInt32Float + other.mapInt32Float,
            mapInt32Double = mapInt32Double + other.mapInt32Double,
            mapBoolBool = mapBoolBool + other.mapBoolBool,
            mapStringString = mapStringString + other.mapStringString,
            mapStringBytes = mapStringBytes + other.mapStringBytes,
            mapStringNestedMessage = mapStringNestedMessage + other.mapStringNestedMessage,
            mapStringForeignMessage = mapStringForeignMessage + other.mapStringForeignMessage,
            mapStringNestedEnum = mapStringNestedEnum + other.mapStringNestedEnum,
            mapStringForeignEnum = mapStringForeignEnum + other.mapStringForeignEnum,
            optionalBoolWrapper = other.optionalBoolWrapper ?: optionalBoolWrapper,
            optionalInt32Wrapper = other.optionalInt32Wrapper ?: optionalInt32Wrapper,
            optionalInt64Wrapper = other.optionalInt64Wrapper ?: optionalInt64Wrapper,
            optionalUint32Wrapper = other.optionalUint32Wrapper ?: optionalUint32Wrapper,
            optionalUint64Wrapper = other.optionalUint64Wrapper ?: optionalUint64Wrapper,
            optionalFloatWrapper = other.optionalFloatWrapper ?: optionalFloatWrapper,
            optionalDoubleWrapper = other.optionalDoubleWrapper ?: optionalDoubleWrapper,
            optionalStringWrapper = other.optionalStringWrapper ?: optionalStringWrapper,
            optionalBytesWrapper = other.optionalBytesWrapper ?: optionalBytesWrapper,
            repeatedBoolWrapper = repeatedBoolWrapper + other.repeatedBoolWrapper,
            repeatedInt32Wrapper = repeatedInt32Wrapper + other.repeatedInt32Wrapper,
            repeatedInt64Wrapper = repeatedInt64Wrapper + other.repeatedInt64Wrapper,
            repeatedUint32Wrapper = repeatedUint32Wrapper + other.repeatedUint32Wrapper,
            repeatedUint64Wrapper = repeatedUint64Wrapper + other.repeatedUint64Wrapper,
            repeatedFloatWrapper = repeatedFloatWrapper + other.repeatedFloatWrapper,
            repeatedDoubleWrapper = repeatedDoubleWrapper + other.repeatedDoubleWrapper,
            repeatedStringWrapper = repeatedStringWrapper + other.repeatedStringWrapper,
            repeatedBytesWrapper = repeatedBytesWrapper + other.repeatedBytesWrapper,
            optionalDuration = optionalDuration?.plus(other.optionalDuration) ?: other.optionalDuration,
            optionalTimestamp = optionalTimestamp?.plus(other.optionalTimestamp) ?: other.optionalTimestamp,
            optionalFieldMask = optionalFieldMask?.plus(other.optionalFieldMask) ?: other.optionalFieldMask,
            optionalStruct = optionalStruct?.plus(other.optionalStruct) ?: other.optionalStruct,
            optionalAny = optionalAny?.plus(other.optionalAny) ?: other.optionalAny,
            optionalValue = optionalValue?.plus(other.optionalValue) ?: other.optionalValue,
            repeatedDuration = repeatedDuration + other.repeatedDuration,
            repeatedTimestamp = repeatedTimestamp + other.repeatedTimestamp,
            repeatedFieldmask = repeatedFieldmask + other.repeatedFieldmask,
            repeatedStruct = repeatedStruct + other.repeatedStruct,
            repeatedAny = repeatedAny + other.repeatedAny,
            repeatedValue = repeatedValue + other.repeatedValue,
            repeatedListValue = repeatedListValue + other.repeatedListValue,
            oneofField = when {
                oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage && other.oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage ->
                    TestAllTypesProto3.OneofField.OneofNestedMessage((oneofField as TestAllTypesProto3.OneofField.OneofNestedMessage).value + (other.oneofField as TestAllTypesProto3.OneofField.OneofNestedMessage).value)
                else ->
                    other.oneofField ?: oneofField
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableTestAllTypesProto3_Impl(
    override var optionalInt32: Int,
    override var optionalInt64: Long,
    override var optionalUint32: Int,
    override var optionalUint64: Long,
    override var optionalSint32: Int,
    override var optionalSint64: Long,
    override var optionalFixed32: Int,
    override var optionalFixed64: Long,
    override var optionalSfixed32: Int,
    override var optionalSfixed64: Long,
    override var optionalFloat: Float,
    override var optionalDouble: Double,
    override var optionalBool: Boolean,
    override var optionalString: String,
    override var optionalBytes: pbandk.ByteArr,
    override var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
    override var optionalForeignMessage: pbandk.conformance.pb.ForeignMessage?,
    override var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
    override var optionalForeignEnum: pbandk.conformance.pb.ForeignEnum,
    override var optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum,
    override var optionalStringPiece: String,
    override var optionalCord: String,
    override var recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3?,
    override var repeatedInt32: List<Int>,
    override var repeatedInt64: List<Long>,
    override var repeatedUint32: List<Int>,
    override var repeatedUint64: List<Long>,
    override var repeatedSint32: List<Int>,
    override var repeatedSint64: List<Long>,
    override var repeatedFixed32: List<Int>,
    override var repeatedFixed64: List<Long>,
    override var repeatedSfixed32: List<Int>,
    override var repeatedSfixed64: List<Long>,
    override var repeatedFloat: List<Float>,
    override var repeatedDouble: List<Double>,
    override var repeatedBool: List<Boolean>,
    override var repeatedString: List<String>,
    override var repeatedBytes: List<pbandk.ByteArr>,
    override var repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>,
    override var repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage>,
    override var repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override var repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum>,
    override var repeatedStringPiece: List<String>,
    override var repeatedCord: List<String>,
    override var packedInt32: List<Int>,
    override var packedInt64: List<Long>,
    override var packedUint32: List<Int>,
    override var packedUint64: List<Long>,
    override var packedSint32: List<Int>,
    override var packedSint64: List<Long>,
    override var packedFixed32: List<Int>,
    override var packedFixed64: List<Long>,
    override var packedSfixed32: List<Int>,
    override var packedSfixed64: List<Long>,
    override var packedFloat: List<Float>,
    override var packedDouble: List<Double>,
    override var packedBool: List<Boolean>,
    override var packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override var unpackedInt32: List<Int>,
    override var unpackedInt64: List<Long>,
    override var unpackedUint32: List<Int>,
    override var unpackedUint64: List<Long>,
    override var unpackedSint32: List<Int>,
    override var unpackedSint64: List<Long>,
    override var unpackedFixed32: List<Int>,
    override var unpackedFixed64: List<Long>,
    override var unpackedSfixed32: List<Int>,
    override var unpackedSfixed64: List<Long>,
    override var unpackedFloat: List<Float>,
    override var unpackedDouble: List<Double>,
    override var unpackedBool: List<Boolean>,
    override var unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override var mapInt32Int32: Map<Int, Int>,
    override var mapInt64Int64: Map<Long, Long>,
    override var mapUint32Uint32: Map<Int, Int>,
    override var mapUint64Uint64: Map<Long, Long>,
    override var mapSint32Sint32: Map<Int, Int>,
    override var mapSint64Sint64: Map<Long, Long>,
    override var mapFixed32Fixed32: Map<Int, Int>,
    override var mapFixed64Fixed64: Map<Long, Long>,
    override var mapSfixed32Sfixed32: Map<Int, Int>,
    override var mapSfixed64Sfixed64: Map<Long, Long>,
    override var mapInt32Float: Map<Int, Float>,
    override var mapInt32Double: Map<Int, Double>,
    override var mapBoolBool: Map<Boolean, Boolean>,
    override var mapStringString: Map<String, String>,
    override var mapStringBytes: Map<String, pbandk.ByteArr>,
    override var mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>,
    override var mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?>,
    override var mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override var mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum>,
    override var optionalBoolWrapper: Boolean?,
    override var optionalInt32Wrapper: Int?,
    override var optionalInt64Wrapper: Long?,
    override var optionalUint32Wrapper: Int?,
    override var optionalUint64Wrapper: Long?,
    override var optionalFloatWrapper: Float?,
    override var optionalDoubleWrapper: Double?,
    override var optionalStringWrapper: String?,
    override var optionalBytesWrapper: pbandk.ByteArr?,
    override var repeatedBoolWrapper: List<Boolean>,
    override var repeatedInt32Wrapper: List<Int>,
    override var repeatedInt64Wrapper: List<Long>,
    override var repeatedUint32Wrapper: List<Int>,
    override var repeatedUint64Wrapper: List<Long>,
    override var repeatedFloatWrapper: List<Float>,
    override var repeatedDoubleWrapper: List<Double>,
    override var repeatedStringWrapper: List<String>,
    override var repeatedBytesWrapper: List<pbandk.ByteArr>,
    override var optionalDuration: pbandk.wkt.Duration?,
    override var optionalTimestamp: pbandk.wkt.Timestamp?,
    override var optionalFieldMask: pbandk.wkt.FieldMask?,
    override var optionalStruct: pbandk.wkt.Struct?,
    override var optionalAny: pbandk.wkt.Any?,
    override var optionalValue: pbandk.wkt.Value?,
    override var repeatedDuration: List<pbandk.wkt.Duration>,
    override var repeatedTimestamp: List<pbandk.wkt.Timestamp>,
    override var repeatedFieldmask: List<pbandk.wkt.FieldMask>,
    override var repeatedStruct: List<pbandk.wkt.Struct>,
    override var repeatedAny: List<pbandk.wkt.Any>,
    override var repeatedValue: List<pbandk.wkt.Value>,
    override var repeatedListValue: List<pbandk.wkt.ListValue>,
    override var fieldname1: Int,
    override var fieldName2: Int,
    override var fieldName3: Int,
    override var field_name4: Int,
    override var field0name5: Int,
    override var field0Name6: Int,
    override var fieldName7: Int,
    override var fieldName8: Int,
    override var fieldName9: Int,
    override var fieldName10: Int,
    override var fIELDNAME11: Int,
    override var fIELDName12: Int,
    override var _fieldName13: Int,
    override var _FieldName14: Int,
    override var field_name15: Int,
    override var field_Name16: Int,
    override var fieldName17_: Int,
    override var fieldName18_: Int,
    override var oneofField: pbandk.conformance.pb.TestAllTypesProto3.OneofField<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableTestAllTypesProto3, pbandk.MutableGeneratedMessage<MutableTestAllTypesProto3>() {
    override val descriptor get() = TestAllTypesProto3.descriptor

    override var oneofUint32: Int?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofUint32)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofUint32(it) } }
    override var oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofNestedMessage)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofNestedMessage(it) } }
    override var oneofString: String?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofString)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofString(it) } }
    override var oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofBytes)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofBytes(it) } }
    override var oneofBool: Boolean?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofBool)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofBool(it) } }
    override var oneofUint64: Long?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofUint64)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofUint64(it) } }
    override var oneofFloat: Float?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofFloat)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofFloat(it) } }
    override var oneofDouble: Double?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofDouble)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofDouble(it) } }
    override var oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofEnum)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto3.OneofField.OneofEnum(it) } }

    override fun copy(
        optionalInt32: Int,
        optionalInt64: Long,
        optionalUint32: Int,
        optionalUint64: Long,
        optionalSint32: Int,
        optionalSint64: Long,
        optionalFixed32: Int,
        optionalFixed64: Long,
        optionalSfixed32: Int,
        optionalSfixed64: Long,
        optionalFloat: Float,
        optionalDouble: Double,
        optionalBool: Boolean,
        optionalString: String,
        optionalBytes: pbandk.ByteArr,
        optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
        optionalForeignMessage: pbandk.conformance.pb.ForeignMessage?,
        optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
        optionalForeignEnum: pbandk.conformance.pb.ForeignEnum,
        optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum,
        optionalStringPiece: String,
        optionalCord: String,
        recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3?,
        repeatedInt32: List<Int>,
        repeatedInt64: List<Long>,
        repeatedUint32: List<Int>,
        repeatedUint64: List<Long>,
        repeatedSint32: List<Int>,
        repeatedSint64: List<Long>,
        repeatedFixed32: List<Int>,
        repeatedFixed64: List<Long>,
        repeatedSfixed32: List<Int>,
        repeatedSfixed64: List<Long>,
        repeatedFloat: List<Float>,
        repeatedDouble: List<Double>,
        repeatedBool: List<Boolean>,
        repeatedString: List<String>,
        repeatedBytes: List<pbandk.ByteArr>,
        repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>,
        repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage>,
        repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum>,
        repeatedStringPiece: List<String>,
        repeatedCord: List<String>,
        packedInt32: List<Int>,
        packedInt64: List<Long>,
        packedUint32: List<Int>,
        packedUint64: List<Long>,
        packedSint32: List<Int>,
        packedSint64: List<Long>,
        packedFixed32: List<Int>,
        packedFixed64: List<Long>,
        packedSfixed32: List<Int>,
        packedSfixed64: List<Long>,
        packedFloat: List<Float>,
        packedDouble: List<Double>,
        packedBool: List<Boolean>,
        packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        unpackedInt32: List<Int>,
        unpackedInt64: List<Long>,
        unpackedUint32: List<Int>,
        unpackedUint64: List<Long>,
        unpackedSint32: List<Int>,
        unpackedSint64: List<Long>,
        unpackedFixed32: List<Int>,
        unpackedFixed64: List<Long>,
        unpackedSfixed32: List<Int>,
        unpackedSfixed64: List<Long>,
        unpackedFloat: List<Float>,
        unpackedDouble: List<Double>,
        unpackedBool: List<Boolean>,
        unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        mapInt32Int32: Map<Int, Int>,
        mapInt64Int64: Map<Long, Long>,
        mapUint32Uint32: Map<Int, Int>,
        mapUint64Uint64: Map<Long, Long>,
        mapSint32Sint32: Map<Int, Int>,
        mapSint64Sint64: Map<Long, Long>,
        mapFixed32Fixed32: Map<Int, Int>,
        mapFixed64Fixed64: Map<Long, Long>,
        mapSfixed32Sfixed32: Map<Int, Int>,
        mapSfixed64Sfixed64: Map<Long, Long>,
        mapInt32Float: Map<Int, Float>,
        mapInt32Double: Map<Int, Double>,
        mapBoolBool: Map<Boolean, Boolean>,
        mapStringString: Map<String, String>,
        mapStringBytes: Map<String, pbandk.ByteArr>,
        mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>,
        mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?>,
        mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
        mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum>,
        optionalBoolWrapper: Boolean?,
        optionalInt32Wrapper: Int?,
        optionalInt64Wrapper: Long?,
        optionalUint32Wrapper: Int?,
        optionalUint64Wrapper: Long?,
        optionalFloatWrapper: Float?,
        optionalDoubleWrapper: Double?,
        optionalStringWrapper: String?,
        optionalBytesWrapper: pbandk.ByteArr?,
        repeatedBoolWrapper: List<Boolean>,
        repeatedInt32Wrapper: List<Int>,
        repeatedInt64Wrapper: List<Long>,
        repeatedUint32Wrapper: List<Int>,
        repeatedUint64Wrapper: List<Long>,
        repeatedFloatWrapper: List<Float>,
        repeatedDoubleWrapper: List<Double>,
        repeatedStringWrapper: List<String>,
        repeatedBytesWrapper: List<pbandk.ByteArr>,
        optionalDuration: pbandk.wkt.Duration?,
        optionalTimestamp: pbandk.wkt.Timestamp?,
        optionalFieldMask: pbandk.wkt.FieldMask?,
        optionalStruct: pbandk.wkt.Struct?,
        optionalAny: pbandk.wkt.Any?,
        optionalValue: pbandk.wkt.Value?,
        repeatedDuration: List<pbandk.wkt.Duration>,
        repeatedTimestamp: List<pbandk.wkt.Timestamp>,
        repeatedFieldmask: List<pbandk.wkt.FieldMask>,
        repeatedStruct: List<pbandk.wkt.Struct>,
        repeatedAny: List<pbandk.wkt.Any>,
        repeatedValue: List<pbandk.wkt.Value>,
        repeatedListValue: List<pbandk.wkt.ListValue>,
        fieldname1: Int,
        fieldName2: Int,
        fieldName3: Int,
        field_name4: Int,
        field0name5: Int,
        field0Name6: Int,
        fieldName7: Int,
        fieldName8: Int,
        fieldName9: Int,
        fieldName10: Int,
        fIELDNAME11: Int,
        fIELDName12: Int,
        _fieldName13: Int,
        _FieldName14: Int,
        field_name15: Int,
        field_Name16: Int,
        fieldName17_: Int,
        fieldName18_: Int,
        oneofField: pbandk.conformance.pb.TestAllTypesProto3.OneofField<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_Impl(
        optionalInt32 = optionalInt32,
        optionalInt64 = optionalInt64,
        optionalUint32 = optionalUint32,
        optionalUint64 = optionalUint64,
        optionalSint32 = optionalSint32,
        optionalSint64 = optionalSint64,
        optionalFixed32 = optionalFixed32,
        optionalFixed64 = optionalFixed64,
        optionalSfixed32 = optionalSfixed32,
        optionalSfixed64 = optionalSfixed64,
        optionalFloat = optionalFloat,
        optionalDouble = optionalDouble,
        optionalBool = optionalBool,
        optionalString = optionalString,
        optionalBytes = optionalBytes,
        optionalNestedMessage = optionalNestedMessage,
        optionalForeignMessage = optionalForeignMessage,
        optionalNestedEnum = optionalNestedEnum,
        optionalForeignEnum = optionalForeignEnum,
        optionalAliasedEnum = optionalAliasedEnum,
        optionalStringPiece = optionalStringPiece,
        optionalCord = optionalCord,
        recursiveMessage = recursiveMessage,
        repeatedInt32 = repeatedInt32,
        repeatedInt64 = repeatedInt64,
        repeatedUint32 = repeatedUint32,
        repeatedUint64 = repeatedUint64,
        repeatedSint32 = repeatedSint32,
        repeatedSint64 = repeatedSint64,
        repeatedFixed32 = repeatedFixed32,
        repeatedFixed64 = repeatedFixed64,
        repeatedSfixed32 = repeatedSfixed32,
        repeatedSfixed64 = repeatedSfixed64,
        repeatedFloat = repeatedFloat,
        repeatedDouble = repeatedDouble,
        repeatedBool = repeatedBool,
        repeatedString = repeatedString,
        repeatedBytes = repeatedBytes,
        repeatedNestedMessage = repeatedNestedMessage,
        repeatedForeignMessage = repeatedForeignMessage,
        repeatedNestedEnum = repeatedNestedEnum,
        repeatedForeignEnum = repeatedForeignEnum,
        repeatedStringPiece = repeatedStringPiece,
        repeatedCord = repeatedCord,
        packedInt32 = packedInt32,
        packedInt64 = packedInt64,
        packedUint32 = packedUint32,
        packedUint64 = packedUint64,
        packedSint32 = packedSint32,
        packedSint64 = packedSint64,
        packedFixed32 = packedFixed32,
        packedFixed64 = packedFixed64,
        packedSfixed32 = packedSfixed32,
        packedSfixed64 = packedSfixed64,
        packedFloat = packedFloat,
        packedDouble = packedDouble,
        packedBool = packedBool,
        packedNestedEnum = packedNestedEnum,
        unpackedInt32 = unpackedInt32,
        unpackedInt64 = unpackedInt64,
        unpackedUint32 = unpackedUint32,
        unpackedUint64 = unpackedUint64,
        unpackedSint32 = unpackedSint32,
        unpackedSint64 = unpackedSint64,
        unpackedFixed32 = unpackedFixed32,
        unpackedFixed64 = unpackedFixed64,
        unpackedSfixed32 = unpackedSfixed32,
        unpackedSfixed64 = unpackedSfixed64,
        unpackedFloat = unpackedFloat,
        unpackedDouble = unpackedDouble,
        unpackedBool = unpackedBool,
        unpackedNestedEnum = unpackedNestedEnum,
        mapInt32Int32 = mapInt32Int32,
        mapInt64Int64 = mapInt64Int64,
        mapUint32Uint32 = mapUint32Uint32,
        mapUint64Uint64 = mapUint64Uint64,
        mapSint32Sint32 = mapSint32Sint32,
        mapSint64Sint64 = mapSint64Sint64,
        mapFixed32Fixed32 = mapFixed32Fixed32,
        mapFixed64Fixed64 = mapFixed64Fixed64,
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32,
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64,
        mapInt32Float = mapInt32Float,
        mapInt32Double = mapInt32Double,
        mapBoolBool = mapBoolBool,
        mapStringString = mapStringString,
        mapStringBytes = mapStringBytes,
        mapStringNestedMessage = mapStringNestedMessage,
        mapStringForeignMessage = mapStringForeignMessage,
        mapStringNestedEnum = mapStringNestedEnum,
        mapStringForeignEnum = mapStringForeignEnum,
        optionalBoolWrapper = optionalBoolWrapper,
        optionalInt32Wrapper = optionalInt32Wrapper,
        optionalInt64Wrapper = optionalInt64Wrapper,
        optionalUint32Wrapper = optionalUint32Wrapper,
        optionalUint64Wrapper = optionalUint64Wrapper,
        optionalFloatWrapper = optionalFloatWrapper,
        optionalDoubleWrapper = optionalDoubleWrapper,
        optionalStringWrapper = optionalStringWrapper,
        optionalBytesWrapper = optionalBytesWrapper,
        repeatedBoolWrapper = repeatedBoolWrapper,
        repeatedInt32Wrapper = repeatedInt32Wrapper,
        repeatedInt64Wrapper = repeatedInt64Wrapper,
        repeatedUint32Wrapper = repeatedUint32Wrapper,
        repeatedUint64Wrapper = repeatedUint64Wrapper,
        repeatedFloatWrapper = repeatedFloatWrapper,
        repeatedDoubleWrapper = repeatedDoubleWrapper,
        repeatedStringWrapper = repeatedStringWrapper,
        repeatedBytesWrapper = repeatedBytesWrapper,
        optionalDuration = optionalDuration,
        optionalTimestamp = optionalTimestamp,
        optionalFieldMask = optionalFieldMask,
        optionalStruct = optionalStruct,
        optionalAny = optionalAny,
        optionalValue = optionalValue,
        repeatedDuration = repeatedDuration,
        repeatedTimestamp = repeatedTimestamp,
        repeatedFieldmask = repeatedFieldmask,
        repeatedStruct = repeatedStruct,
        repeatedAny = repeatedAny,
        repeatedValue = repeatedValue,
        repeatedListValue = repeatedListValue,
        fieldname1 = fieldname1,
        fieldName2 = fieldName2,
        fieldName3 = fieldName3,
        field_name4 = field_name4,
        field0name5 = field0name5,
        field0Name6 = field0Name6,
        fieldName7 = fieldName7,
        fieldName8 = fieldName8,
        fieldName9 = fieldName9,
        fieldName10 = fieldName10,
        fIELDNAME11 = fIELDNAME11,
        fIELDName12 = fIELDName12,
        _fieldName13 = _fieldName13,
        _FieldName14 = _FieldName14,
        field_name15 = field_name15,
        field_Name16 = field_Name16,
        fieldName17_ = fieldName17_,
        fieldName18_ = fieldName18_,
        oneofField = oneofField,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3)?.let {
        it.copy(
            optionalNestedMessage = optionalNestedMessage?.plus(other.optionalNestedMessage) ?: other.optionalNestedMessage,
            optionalForeignMessage = optionalForeignMessage?.plus(other.optionalForeignMessage) ?: other.optionalForeignMessage,
            recursiveMessage = recursiveMessage?.plus(other.recursiveMessage) ?: other.recursiveMessage,
            repeatedInt32 = repeatedInt32 + other.repeatedInt32,
            repeatedInt64 = repeatedInt64 + other.repeatedInt64,
            repeatedUint32 = repeatedUint32 + other.repeatedUint32,
            repeatedUint64 = repeatedUint64 + other.repeatedUint64,
            repeatedSint32 = repeatedSint32 + other.repeatedSint32,
            repeatedSint64 = repeatedSint64 + other.repeatedSint64,
            repeatedFixed32 = repeatedFixed32 + other.repeatedFixed32,
            repeatedFixed64 = repeatedFixed64 + other.repeatedFixed64,
            repeatedSfixed32 = repeatedSfixed32 + other.repeatedSfixed32,
            repeatedSfixed64 = repeatedSfixed64 + other.repeatedSfixed64,
            repeatedFloat = repeatedFloat + other.repeatedFloat,
            repeatedDouble = repeatedDouble + other.repeatedDouble,
            repeatedBool = repeatedBool + other.repeatedBool,
            repeatedString = repeatedString + other.repeatedString,
            repeatedBytes = repeatedBytes + other.repeatedBytes,
            repeatedNestedMessage = repeatedNestedMessage + other.repeatedNestedMessage,
            repeatedForeignMessage = repeatedForeignMessage + other.repeatedForeignMessage,
            repeatedNestedEnum = repeatedNestedEnum + other.repeatedNestedEnum,
            repeatedForeignEnum = repeatedForeignEnum + other.repeatedForeignEnum,
            repeatedStringPiece = repeatedStringPiece + other.repeatedStringPiece,
            repeatedCord = repeatedCord + other.repeatedCord,
            packedInt32 = packedInt32 + other.packedInt32,
            packedInt64 = packedInt64 + other.packedInt64,
            packedUint32 = packedUint32 + other.packedUint32,
            packedUint64 = packedUint64 + other.packedUint64,
            packedSint32 = packedSint32 + other.packedSint32,
            packedSint64 = packedSint64 + other.packedSint64,
            packedFixed32 = packedFixed32 + other.packedFixed32,
            packedFixed64 = packedFixed64 + other.packedFixed64,
            packedSfixed32 = packedSfixed32 + other.packedSfixed32,
            packedSfixed64 = packedSfixed64 + other.packedSfixed64,
            packedFloat = packedFloat + other.packedFloat,
            packedDouble = packedDouble + other.packedDouble,
            packedBool = packedBool + other.packedBool,
            packedNestedEnum = packedNestedEnum + other.packedNestedEnum,
            unpackedInt32 = unpackedInt32 + other.unpackedInt32,
            unpackedInt64 = unpackedInt64 + other.unpackedInt64,
            unpackedUint32 = unpackedUint32 + other.unpackedUint32,
            unpackedUint64 = unpackedUint64 + other.unpackedUint64,
            unpackedSint32 = unpackedSint32 + other.unpackedSint32,
            unpackedSint64 = unpackedSint64 + other.unpackedSint64,
            unpackedFixed32 = unpackedFixed32 + other.unpackedFixed32,
            unpackedFixed64 = unpackedFixed64 + other.unpackedFixed64,
            unpackedSfixed32 = unpackedSfixed32 + other.unpackedSfixed32,
            unpackedSfixed64 = unpackedSfixed64 + other.unpackedSfixed64,
            unpackedFloat = unpackedFloat + other.unpackedFloat,
            unpackedDouble = unpackedDouble + other.unpackedDouble,
            unpackedBool = unpackedBool + other.unpackedBool,
            unpackedNestedEnum = unpackedNestedEnum + other.unpackedNestedEnum,
            mapInt32Int32 = mapInt32Int32 + other.mapInt32Int32,
            mapInt64Int64 = mapInt64Int64 + other.mapInt64Int64,
            mapUint32Uint32 = mapUint32Uint32 + other.mapUint32Uint32,
            mapUint64Uint64 = mapUint64Uint64 + other.mapUint64Uint64,
            mapSint32Sint32 = mapSint32Sint32 + other.mapSint32Sint32,
            mapSint64Sint64 = mapSint64Sint64 + other.mapSint64Sint64,
            mapFixed32Fixed32 = mapFixed32Fixed32 + other.mapFixed32Fixed32,
            mapFixed64Fixed64 = mapFixed64Fixed64 + other.mapFixed64Fixed64,
            mapSfixed32Sfixed32 = mapSfixed32Sfixed32 + other.mapSfixed32Sfixed32,
            mapSfixed64Sfixed64 = mapSfixed64Sfixed64 + other.mapSfixed64Sfixed64,
            mapInt32Float = mapInt32Float + other.mapInt32Float,
            mapInt32Double = mapInt32Double + other.mapInt32Double,
            mapBoolBool = mapBoolBool + other.mapBoolBool,
            mapStringString = mapStringString + other.mapStringString,
            mapStringBytes = mapStringBytes + other.mapStringBytes,
            mapStringNestedMessage = mapStringNestedMessage + other.mapStringNestedMessage,
            mapStringForeignMessage = mapStringForeignMessage + other.mapStringForeignMessage,
            mapStringNestedEnum = mapStringNestedEnum + other.mapStringNestedEnum,
            mapStringForeignEnum = mapStringForeignEnum + other.mapStringForeignEnum,
            optionalBoolWrapper = other.optionalBoolWrapper ?: optionalBoolWrapper,
            optionalInt32Wrapper = other.optionalInt32Wrapper ?: optionalInt32Wrapper,
            optionalInt64Wrapper = other.optionalInt64Wrapper ?: optionalInt64Wrapper,
            optionalUint32Wrapper = other.optionalUint32Wrapper ?: optionalUint32Wrapper,
            optionalUint64Wrapper = other.optionalUint64Wrapper ?: optionalUint64Wrapper,
            optionalFloatWrapper = other.optionalFloatWrapper ?: optionalFloatWrapper,
            optionalDoubleWrapper = other.optionalDoubleWrapper ?: optionalDoubleWrapper,
            optionalStringWrapper = other.optionalStringWrapper ?: optionalStringWrapper,
            optionalBytesWrapper = other.optionalBytesWrapper ?: optionalBytesWrapper,
            repeatedBoolWrapper = repeatedBoolWrapper + other.repeatedBoolWrapper,
            repeatedInt32Wrapper = repeatedInt32Wrapper + other.repeatedInt32Wrapper,
            repeatedInt64Wrapper = repeatedInt64Wrapper + other.repeatedInt64Wrapper,
            repeatedUint32Wrapper = repeatedUint32Wrapper + other.repeatedUint32Wrapper,
            repeatedUint64Wrapper = repeatedUint64Wrapper + other.repeatedUint64Wrapper,
            repeatedFloatWrapper = repeatedFloatWrapper + other.repeatedFloatWrapper,
            repeatedDoubleWrapper = repeatedDoubleWrapper + other.repeatedDoubleWrapper,
            repeatedStringWrapper = repeatedStringWrapper + other.repeatedStringWrapper,
            repeatedBytesWrapper = repeatedBytesWrapper + other.repeatedBytesWrapper,
            optionalDuration = optionalDuration?.plus(other.optionalDuration) ?: other.optionalDuration,
            optionalTimestamp = optionalTimestamp?.plus(other.optionalTimestamp) ?: other.optionalTimestamp,
            optionalFieldMask = optionalFieldMask?.plus(other.optionalFieldMask) ?: other.optionalFieldMask,
            optionalStruct = optionalStruct?.plus(other.optionalStruct) ?: other.optionalStruct,
            optionalAny = optionalAny?.plus(other.optionalAny) ?: other.optionalAny,
            optionalValue = optionalValue?.plus(other.optionalValue) ?: other.optionalValue,
            repeatedDuration = repeatedDuration + other.repeatedDuration,
            repeatedTimestamp = repeatedTimestamp + other.repeatedTimestamp,
            repeatedFieldmask = repeatedFieldmask + other.repeatedFieldmask,
            repeatedStruct = repeatedStruct + other.repeatedStruct,
            repeatedAny = repeatedAny + other.repeatedAny,
            repeatedValue = repeatedValue + other.repeatedValue,
            repeatedListValue = repeatedListValue + other.repeatedListValue,
            oneofField = when {
                oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage && other.oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage ->
                    TestAllTypesProto3.OneofField.OneofNestedMessage((oneofField as TestAllTypesProto3.OneofField.OneofNestedMessage).value + (other.oneofField as TestAllTypesProto3.OneofField.OneofNestedMessage).value)
                else ->
                    other.oneofField ?: oneofField
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toTestAllTypesProto3() = TestAllTypesProto3_Impl(
        optionalInt32 = optionalInt32,
        optionalInt64 = optionalInt64,
        optionalUint32 = optionalUint32,
        optionalUint64 = optionalUint64,
        optionalSint32 = optionalSint32,
        optionalSint64 = optionalSint64,
        optionalFixed32 = optionalFixed32,
        optionalFixed64 = optionalFixed64,
        optionalSfixed32 = optionalSfixed32,
        optionalSfixed64 = optionalSfixed64,
        optionalFloat = optionalFloat,
        optionalDouble = optionalDouble,
        optionalBool = optionalBool,
        optionalString = optionalString,
        optionalBytes = optionalBytes,
        optionalNestedMessage = optionalNestedMessage,
        optionalForeignMessage = optionalForeignMessage,
        optionalNestedEnum = optionalNestedEnum,
        optionalForeignEnum = optionalForeignEnum,
        optionalAliasedEnum = optionalAliasedEnum,
        optionalStringPiece = optionalStringPiece,
        optionalCord = optionalCord,
        recursiveMessage = recursiveMessage,
        repeatedInt32 = repeatedInt32,
        repeatedInt64 = repeatedInt64,
        repeatedUint32 = repeatedUint32,
        repeatedUint64 = repeatedUint64,
        repeatedSint32 = repeatedSint32,
        repeatedSint64 = repeatedSint64,
        repeatedFixed32 = repeatedFixed32,
        repeatedFixed64 = repeatedFixed64,
        repeatedSfixed32 = repeatedSfixed32,
        repeatedSfixed64 = repeatedSfixed64,
        repeatedFloat = repeatedFloat,
        repeatedDouble = repeatedDouble,
        repeatedBool = repeatedBool,
        repeatedString = repeatedString,
        repeatedBytes = repeatedBytes,
        repeatedNestedMessage = repeatedNestedMessage,
        repeatedForeignMessage = repeatedForeignMessage,
        repeatedNestedEnum = repeatedNestedEnum,
        repeatedForeignEnum = repeatedForeignEnum,
        repeatedStringPiece = repeatedStringPiece,
        repeatedCord = repeatedCord,
        packedInt32 = packedInt32,
        packedInt64 = packedInt64,
        packedUint32 = packedUint32,
        packedUint64 = packedUint64,
        packedSint32 = packedSint32,
        packedSint64 = packedSint64,
        packedFixed32 = packedFixed32,
        packedFixed64 = packedFixed64,
        packedSfixed32 = packedSfixed32,
        packedSfixed64 = packedSfixed64,
        packedFloat = packedFloat,
        packedDouble = packedDouble,
        packedBool = packedBool,
        packedNestedEnum = packedNestedEnum,
        unpackedInt32 = unpackedInt32,
        unpackedInt64 = unpackedInt64,
        unpackedUint32 = unpackedUint32,
        unpackedUint64 = unpackedUint64,
        unpackedSint32 = unpackedSint32,
        unpackedSint64 = unpackedSint64,
        unpackedFixed32 = unpackedFixed32,
        unpackedFixed64 = unpackedFixed64,
        unpackedSfixed32 = unpackedSfixed32,
        unpackedSfixed64 = unpackedSfixed64,
        unpackedFloat = unpackedFloat,
        unpackedDouble = unpackedDouble,
        unpackedBool = unpackedBool,
        unpackedNestedEnum = unpackedNestedEnum,
        mapInt32Int32 = mapInt32Int32,
        mapInt64Int64 = mapInt64Int64,
        mapUint32Uint32 = mapUint32Uint32,
        mapUint64Uint64 = mapUint64Uint64,
        mapSint32Sint32 = mapSint32Sint32,
        mapSint64Sint64 = mapSint64Sint64,
        mapFixed32Fixed32 = mapFixed32Fixed32,
        mapFixed64Fixed64 = mapFixed64Fixed64,
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32,
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64,
        mapInt32Float = mapInt32Float,
        mapInt32Double = mapInt32Double,
        mapBoolBool = mapBoolBool,
        mapStringString = mapStringString,
        mapStringBytes = mapStringBytes,
        mapStringNestedMessage = mapStringNestedMessage,
        mapStringForeignMessage = mapStringForeignMessage,
        mapStringNestedEnum = mapStringNestedEnum,
        mapStringForeignEnum = mapStringForeignEnum,
        optionalBoolWrapper = optionalBoolWrapper,
        optionalInt32Wrapper = optionalInt32Wrapper,
        optionalInt64Wrapper = optionalInt64Wrapper,
        optionalUint32Wrapper = optionalUint32Wrapper,
        optionalUint64Wrapper = optionalUint64Wrapper,
        optionalFloatWrapper = optionalFloatWrapper,
        optionalDoubleWrapper = optionalDoubleWrapper,
        optionalStringWrapper = optionalStringWrapper,
        optionalBytesWrapper = optionalBytesWrapper,
        repeatedBoolWrapper = repeatedBoolWrapper,
        repeatedInt32Wrapper = repeatedInt32Wrapper,
        repeatedInt64Wrapper = repeatedInt64Wrapper,
        repeatedUint32Wrapper = repeatedUint32Wrapper,
        repeatedUint64Wrapper = repeatedUint64Wrapper,
        repeatedFloatWrapper = repeatedFloatWrapper,
        repeatedDoubleWrapper = repeatedDoubleWrapper,
        repeatedStringWrapper = repeatedStringWrapper,
        repeatedBytesWrapper = repeatedBytesWrapper,
        optionalDuration = optionalDuration,
        optionalTimestamp = optionalTimestamp,
        optionalFieldMask = optionalFieldMask,
        optionalStruct = optionalStruct,
        optionalAny = optionalAny,
        optionalValue = optionalValue,
        repeatedDuration = repeatedDuration,
        repeatedTimestamp = repeatedTimestamp,
        repeatedFieldmask = repeatedFieldmask,
        repeatedStruct = repeatedStruct,
        repeatedAny = repeatedAny,
        repeatedValue = repeatedValue,
        repeatedListValue = repeatedListValue,
        fieldname1 = fieldname1,
        fieldName2 = fieldName2,
        fieldName3 = fieldName3,
        field_name4 = field_name4,
        field0name5 = field0name5,
        field0Name6 = field0Name6,
        fieldName7 = fieldName7,
        fieldName8 = fieldName8,
        fieldName9 = fieldName9,
        fieldName10 = fieldName10,
        fIELDNAME11 = fIELDNAME11,
        fIELDName12 = fIELDName12,
        _fieldName13 = _fieldName13,
        _FieldName14 = _FieldName14,
        field_name15 = field_name15,
        field_Name16 = field_Name16,
        fieldName17_ = fieldName17_,
        fieldName18_ = fieldName18_,
        oneofField = oneofField,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3 {
    var optionalInt32 = 0
    var optionalInt64 = 0L
    var optionalUint32 = 0
    var optionalUint64 = 0L
    var optionalSint32 = 0
    var optionalSint64 = 0L
    var optionalFixed32 = 0
    var optionalFixed64 = 0L
    var optionalSfixed32 = 0
    var optionalSfixed64 = 0L
    var optionalFloat = 0.0F
    var optionalDouble = 0.0
    var optionalBool = false
    var optionalString = ""
    var optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty
    var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null
    var optionalForeignMessage: pbandk.conformance.pb.ForeignMessage? = null
    var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)
    var optionalForeignEnum: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0)
    var optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromValue(0)
    var optionalStringPiece = ""
    var optionalCord = ""
    var recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedString: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytes: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var repeatedNestedMessage: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>? = null
    var repeatedForeignMessage: pbandk.ListWithSize.Builder<pbandk.conformance.pb.ForeignMessage>? = null
    var repeatedNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>? = null
    var repeatedForeignEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.ForeignEnum>? = null
    var repeatedStringPiece: pbandk.ListWithSize.Builder<String>? = null
    var repeatedCord: pbandk.ListWithSize.Builder<String>? = null
    var packedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var packedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var packedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var packedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var packedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var packedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var packedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var packedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var packedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var packedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var packedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var packedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var packedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var packedNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>? = null
    var unpackedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var unpackedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var unpackedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var unpackedNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>? = null
    var mapInt32Int32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapInt64Int64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapUint32Uint32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapUint64Uint64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapSint32Sint32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapSint64Sint64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapFixed32Fixed32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapFixed64Fixed64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapSfixed32Sfixed32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapSfixed64Sfixed64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapInt32Float: pbandk.MessageMap.Builder<Int, Float>? = null
    var mapInt32Double: pbandk.MessageMap.Builder<Int, Double>? = null
    var mapBoolBool: pbandk.MessageMap.Builder<Boolean, Boolean>? = null
    var mapStringString: pbandk.MessageMap.Builder<String, String>? = null
    var mapStringBytes: pbandk.MessageMap.Builder<String, pbandk.ByteArr>? = null
    var mapStringNestedMessage: pbandk.MessageMap.Builder<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>? = null
    var mapStringForeignMessage: pbandk.MessageMap.Builder<String, pbandk.conformance.pb.ForeignMessage?>? = null
    var mapStringNestedEnum: pbandk.MessageMap.Builder<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>? = null
    var mapStringForeignEnum: pbandk.MessageMap.Builder<String, pbandk.conformance.pb.ForeignEnum>? = null
    var optionalBoolWrapper: Boolean? = null
    var optionalInt32Wrapper: Int? = null
    var optionalInt64Wrapper: Long? = null
    var optionalUint32Wrapper: Int? = null
    var optionalUint64Wrapper: Long? = null
    var optionalFloatWrapper: Float? = null
    var optionalDoubleWrapper: Double? = null
    var optionalStringWrapper: String? = null
    var optionalBytesWrapper: pbandk.ByteArr? = null
    var repeatedBoolWrapper: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedInt32Wrapper: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64Wrapper: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32Wrapper: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64Wrapper: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloatWrapper: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDoubleWrapper: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedStringWrapper: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytesWrapper: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var optionalDuration: pbandk.wkt.Duration? = null
    var optionalTimestamp: pbandk.wkt.Timestamp? = null
    var optionalFieldMask: pbandk.wkt.FieldMask? = null
    var optionalStruct: pbandk.wkt.Struct? = null
    var optionalAny: pbandk.wkt.Any? = null
    var optionalValue: pbandk.wkt.Value? = null
    var repeatedDuration: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null
    var repeatedTimestamp: pbandk.ListWithSize.Builder<pbandk.wkt.Timestamp>? = null
    var repeatedFieldmask: pbandk.ListWithSize.Builder<pbandk.wkt.FieldMask>? = null
    var repeatedStruct: pbandk.ListWithSize.Builder<pbandk.wkt.Struct>? = null
    var repeatedAny: pbandk.ListWithSize.Builder<pbandk.wkt.Any>? = null
    var repeatedValue: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null
    var repeatedListValue: pbandk.ListWithSize.Builder<pbandk.wkt.ListValue>? = null
    var fieldname1 = 0
    var fieldName2 = 0
    var fieldName3 = 0
    var field_name4 = 0
    var field0name5 = 0
    var field0Name6 = 0
    var fieldName7 = 0
    var fieldName8 = 0
    var fieldName9 = 0
    var fieldName10 = 0
    var fIELDNAME11 = 0
    var fIELDName12 = 0
    var _fieldName13 = 0
    var _FieldName14 = 0
    var field_name15 = 0
    var field_Name16 = 0
    var fieldName17_ = 0
    var fieldName18_ = 0
    var oneofField: TestAllTypesProto3.OneofField<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalInt32 = _fieldValue as Int
            2 -> optionalInt64 = _fieldValue as Long
            3 -> optionalUint32 = _fieldValue as Int
            4 -> optionalUint64 = _fieldValue as Long
            5 -> optionalSint32 = _fieldValue as Int
            6 -> optionalSint64 = _fieldValue as Long
            7 -> optionalFixed32 = _fieldValue as Int
            8 -> optionalFixed64 = _fieldValue as Long
            9 -> optionalSfixed32 = _fieldValue as Int
            10 -> optionalSfixed64 = _fieldValue as Long
            11 -> optionalFloat = _fieldValue as Float
            12 -> optionalDouble = _fieldValue as Double
            13 -> optionalBool = _fieldValue as Boolean
            14 -> optionalString = _fieldValue as String
            15 -> optionalBytes = _fieldValue as pbandk.ByteArr
            18 -> optionalNestedMessage = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3.NestedMessage
            19 -> optionalForeignMessage = _fieldValue as pbandk.conformance.pb.ForeignMessage
            21 -> optionalNestedEnum = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3.NestedEnum
            22 -> optionalForeignEnum = _fieldValue as pbandk.conformance.pb.ForeignEnum
            23 -> optionalAliasedEnum = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum
            24 -> optionalStringPiece = _fieldValue as String
            25 -> optionalCord = _fieldValue as String
            27 -> recursiveMessage = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3
            31 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            32 -> repeatedInt64 = (repeatedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            33 -> repeatedUint32 = (repeatedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            34 -> repeatedUint64 = (repeatedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            35 -> repeatedSint32 = (repeatedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            36 -> repeatedSint64 = (repeatedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            37 -> repeatedFixed32 = (repeatedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            38 -> repeatedFixed64 = (repeatedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            39 -> repeatedSfixed32 = (repeatedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            40 -> repeatedSfixed64 = (repeatedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            41 -> repeatedFloat = (repeatedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            42 -> repeatedDouble = (repeatedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            43 -> repeatedBool = (repeatedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            44 -> repeatedString = (repeatedString ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            45 -> repeatedBytes = (repeatedBytes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            48 -> repeatedNestedMessage = (repeatedNestedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> }
            49 -> repeatedForeignMessage = (repeatedForeignMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.ForeignMessage> }
            51 -> repeatedNestedEnum = (repeatedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> }
            52 -> repeatedForeignEnum = (repeatedForeignEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.ForeignEnum> }
            54 -> repeatedStringPiece = (repeatedStringPiece ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            55 -> repeatedCord = (repeatedCord ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            56 -> mapInt32Int32 = (mapInt32Int32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            57 -> mapInt64Int64 = (mapInt64Int64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            58 -> mapUint32Uint32 = (mapUint32Uint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            59 -> mapUint64Uint64 = (mapUint64Uint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            60 -> mapSint32Sint32 = (mapSint32Sint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            61 -> mapSint64Sint64 = (mapSint64Sint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            62 -> mapFixed32Fixed32 = (mapFixed32Fixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            63 -> mapFixed64Fixed64 = (mapFixed64Fixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            64 -> mapSfixed32Sfixed32 = (mapSfixed32Sfixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            65 -> mapSfixed64Sfixed64 = (mapSfixed64Sfixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            66 -> mapInt32Float = (mapInt32Float ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Float>> }
            67 -> mapInt32Double = (mapInt32Double ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Double>> }
            68 -> mapBoolBool = (mapBoolBool ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Boolean, Boolean>> }
            69 -> mapStringString = (mapStringString ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
            70 -> mapStringBytes = (mapStringBytes ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.ByteArr>> }
            71 -> mapStringNestedMessage = (mapStringNestedMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>> }
            72 -> mapStringForeignMessage = (mapStringForeignMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.conformance.pb.ForeignMessage?>> }
            73 -> mapStringNestedEnum = (mapStringNestedEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>> }
            74 -> mapStringForeignEnum = (mapStringForeignEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.conformance.pb.ForeignEnum>> }
            75 -> packedInt32 = (packedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            76 -> packedInt64 = (packedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            77 -> packedUint32 = (packedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            78 -> packedUint64 = (packedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            79 -> packedSint32 = (packedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            80 -> packedSint64 = (packedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            81 -> packedFixed32 = (packedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            82 -> packedFixed64 = (packedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            83 -> packedSfixed32 = (packedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            84 -> packedSfixed64 = (packedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            85 -> packedFloat = (packedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            86 -> packedDouble = (packedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            87 -> packedBool = (packedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            88 -> packedNestedEnum = (packedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> }
            89 -> unpackedInt32 = (unpackedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            90 -> unpackedInt64 = (unpackedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            91 -> unpackedUint32 = (unpackedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            92 -> unpackedUint64 = (unpackedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            93 -> unpackedSint32 = (unpackedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            94 -> unpackedSint64 = (unpackedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            95 -> unpackedFixed32 = (unpackedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            96 -> unpackedFixed64 = (unpackedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            97 -> unpackedSfixed32 = (unpackedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            98 -> unpackedSfixed64 = (unpackedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            99 -> unpackedFloat = (unpackedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            100 -> unpackedDouble = (unpackedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            101 -> unpackedBool = (unpackedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            102 -> unpackedNestedEnum = (unpackedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> }
            111 -> oneofField = TestAllTypesProto3.OneofField.OneofUint32(_fieldValue as Int)
            112 -> oneofField = TestAllTypesProto3.OneofField.OneofNestedMessage(_fieldValue as pbandk.conformance.pb.TestAllTypesProto3.NestedMessage)
            113 -> oneofField = TestAllTypesProto3.OneofField.OneofString(_fieldValue as String)
            114 -> oneofField = TestAllTypesProto3.OneofField.OneofBytes(_fieldValue as pbandk.ByteArr)
            115 -> oneofField = TestAllTypesProto3.OneofField.OneofBool(_fieldValue as Boolean)
            116 -> oneofField = TestAllTypesProto3.OneofField.OneofUint64(_fieldValue as Long)
            117 -> oneofField = TestAllTypesProto3.OneofField.OneofFloat(_fieldValue as Float)
            118 -> oneofField = TestAllTypesProto3.OneofField.OneofDouble(_fieldValue as Double)
            119 -> oneofField = TestAllTypesProto3.OneofField.OneofEnum(_fieldValue as pbandk.conformance.pb.TestAllTypesProto3.NestedEnum)
            201 -> optionalBoolWrapper = _fieldValue as Boolean
            202 -> optionalInt32Wrapper = _fieldValue as Int
            203 -> optionalInt64Wrapper = _fieldValue as Long
            204 -> optionalUint32Wrapper = _fieldValue as Int
            205 -> optionalUint64Wrapper = _fieldValue as Long
            206 -> optionalFloatWrapper = _fieldValue as Float
            207 -> optionalDoubleWrapper = _fieldValue as Double
            208 -> optionalStringWrapper = _fieldValue as String
            209 -> optionalBytesWrapper = _fieldValue as pbandk.ByteArr
            211 -> repeatedBoolWrapper = (repeatedBoolWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            212 -> repeatedInt32Wrapper = (repeatedInt32Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            213 -> repeatedInt64Wrapper = (repeatedInt64Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            214 -> repeatedUint32Wrapper = (repeatedUint32Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            215 -> repeatedUint64Wrapper = (repeatedUint64Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            216 -> repeatedFloatWrapper = (repeatedFloatWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            217 -> repeatedDoubleWrapper = (repeatedDoubleWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            218 -> repeatedStringWrapper = (repeatedStringWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            219 -> repeatedBytesWrapper = (repeatedBytesWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            301 -> optionalDuration = _fieldValue as pbandk.wkt.Duration
            302 -> optionalTimestamp = _fieldValue as pbandk.wkt.Timestamp
            303 -> optionalFieldMask = _fieldValue as pbandk.wkt.FieldMask
            304 -> optionalStruct = _fieldValue as pbandk.wkt.Struct
            305 -> optionalAny = _fieldValue as pbandk.wkt.Any
            306 -> optionalValue = _fieldValue as pbandk.wkt.Value
            311 -> repeatedDuration = (repeatedDuration ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
            312 -> repeatedTimestamp = (repeatedTimestamp ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Timestamp> }
            313 -> repeatedFieldmask = (repeatedFieldmask ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FieldMask> }
            315 -> repeatedAny = (repeatedAny ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Any> }
            316 -> repeatedValue = (repeatedValue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
            317 -> repeatedListValue = (repeatedListValue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.ListValue> }
            324 -> repeatedStruct = (repeatedStruct ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Struct> }
            401 -> fieldname1 = _fieldValue as Int
            402 -> fieldName2 = _fieldValue as Int
            403 -> fieldName3 = _fieldValue as Int
            404 -> field_name4 = _fieldValue as Int
            405 -> field0name5 = _fieldValue as Int
            406 -> field0Name6 = _fieldValue as Int
            407 -> fieldName7 = _fieldValue as Int
            408 -> fieldName8 = _fieldValue as Int
            409 -> fieldName9 = _fieldValue as Int
            410 -> fieldName10 = _fieldValue as Int
            411 -> fIELDNAME11 = _fieldValue as Int
            412 -> fIELDName12 = _fieldValue as Int
            413 -> _fieldName13 = _fieldValue as Int
            414 -> _FieldName14 = _fieldValue as Int
            415 -> field_name15 = _fieldValue as Int
            416 -> field_Name16 = _fieldValue as Int
            417 -> fieldName17_ = _fieldValue as Int
            418 -> fieldName18_ = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
        optionalSint32, optionalSint64, optionalFixed32, optionalFixed64,
        optionalSfixed32, optionalSfixed64, optionalFloat, optionalDouble,
        optionalBool, optionalString, optionalBytes, optionalNestedMessage,
        optionalForeignMessage, optionalNestedEnum, optionalForeignEnum, optionalAliasedEnum,
        optionalStringPiece, optionalCord, recursiveMessage, pbandk.ListWithSize.Builder.fixed(repeatedInt32),
        pbandk.ListWithSize.Builder.fixed(repeatedInt64), pbandk.ListWithSize.Builder.fixed(repeatedUint32), pbandk.ListWithSize.Builder.fixed(repeatedUint64), pbandk.ListWithSize.Builder.fixed(repeatedSint32),
        pbandk.ListWithSize.Builder.fixed(repeatedSint64), pbandk.ListWithSize.Builder.fixed(repeatedFixed32), pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedSfixed32),
        pbandk.ListWithSize.Builder.fixed(repeatedSfixed64), pbandk.ListWithSize.Builder.fixed(repeatedFloat), pbandk.ListWithSize.Builder.fixed(repeatedDouble), pbandk.ListWithSize.Builder.fixed(repeatedBool),
        pbandk.ListWithSize.Builder.fixed(repeatedString), pbandk.ListWithSize.Builder.fixed(repeatedBytes), pbandk.ListWithSize.Builder.fixed(repeatedNestedMessage), pbandk.ListWithSize.Builder.fixed(repeatedForeignMessage),
        pbandk.ListWithSize.Builder.fixed(repeatedNestedEnum), pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord),
        pbandk.ListWithSize.Builder.fixed(packedInt32), pbandk.ListWithSize.Builder.fixed(packedInt64), pbandk.ListWithSize.Builder.fixed(packedUint32), pbandk.ListWithSize.Builder.fixed(packedUint64),
        pbandk.ListWithSize.Builder.fixed(packedSint32), pbandk.ListWithSize.Builder.fixed(packedSint64), pbandk.ListWithSize.Builder.fixed(packedFixed32), pbandk.ListWithSize.Builder.fixed(packedFixed64),
        pbandk.ListWithSize.Builder.fixed(packedSfixed32), pbandk.ListWithSize.Builder.fixed(packedSfixed64), pbandk.ListWithSize.Builder.fixed(packedFloat), pbandk.ListWithSize.Builder.fixed(packedDouble),
        pbandk.ListWithSize.Builder.fixed(packedBool), pbandk.ListWithSize.Builder.fixed(packedNestedEnum), pbandk.ListWithSize.Builder.fixed(unpackedInt32), pbandk.ListWithSize.Builder.fixed(unpackedInt64),
        pbandk.ListWithSize.Builder.fixed(unpackedUint32), pbandk.ListWithSize.Builder.fixed(unpackedUint64), pbandk.ListWithSize.Builder.fixed(unpackedSint32), pbandk.ListWithSize.Builder.fixed(unpackedSint64),
        pbandk.ListWithSize.Builder.fixed(unpackedFixed32), pbandk.ListWithSize.Builder.fixed(unpackedFixed64), pbandk.ListWithSize.Builder.fixed(unpackedSfixed32), pbandk.ListWithSize.Builder.fixed(unpackedSfixed64),
        pbandk.ListWithSize.Builder.fixed(unpackedFloat), pbandk.ListWithSize.Builder.fixed(unpackedDouble), pbandk.ListWithSize.Builder.fixed(unpackedBool), pbandk.ListWithSize.Builder.fixed(unpackedNestedEnum),
        pbandk.MessageMap.Builder.fixed(mapInt32Int32), pbandk.MessageMap.Builder.fixed(mapInt64Int64), pbandk.MessageMap.Builder.fixed(mapUint32Uint32), pbandk.MessageMap.Builder.fixed(mapUint64Uint64),
        pbandk.MessageMap.Builder.fixed(mapSint32Sint32), pbandk.MessageMap.Builder.fixed(mapSint64Sint64), pbandk.MessageMap.Builder.fixed(mapFixed32Fixed32), pbandk.MessageMap.Builder.fixed(mapFixed64Fixed64),
        pbandk.MessageMap.Builder.fixed(mapSfixed32Sfixed32), pbandk.MessageMap.Builder.fixed(mapSfixed64Sfixed64), pbandk.MessageMap.Builder.fixed(mapInt32Float), pbandk.MessageMap.Builder.fixed(mapInt32Double),
        pbandk.MessageMap.Builder.fixed(mapBoolBool), pbandk.MessageMap.Builder.fixed(mapStringString), pbandk.MessageMap.Builder.fixed(mapStringBytes), pbandk.MessageMap.Builder.fixed(mapStringNestedMessage),
        pbandk.MessageMap.Builder.fixed(mapStringForeignMessage), pbandk.MessageMap.Builder.fixed(mapStringNestedEnum), pbandk.MessageMap.Builder.fixed(mapStringForeignEnum), optionalBoolWrapper,
        optionalInt32Wrapper, optionalInt64Wrapper, optionalUint32Wrapper, optionalUint64Wrapper,
        optionalFloatWrapper, optionalDoubleWrapper, optionalStringWrapper, optionalBytesWrapper,
        pbandk.ListWithSize.Builder.fixed(repeatedBoolWrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt32Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedUint32Wrapper),
        pbandk.ListWithSize.Builder.fixed(repeatedUint64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedFloatWrapper), pbandk.ListWithSize.Builder.fixed(repeatedDoubleWrapper), pbandk.ListWithSize.Builder.fixed(repeatedStringWrapper),
        pbandk.ListWithSize.Builder.fixed(repeatedBytesWrapper), optionalDuration, optionalTimestamp, optionalFieldMask,
        optionalStruct, optionalAny, optionalValue, pbandk.ListWithSize.Builder.fixed(repeatedDuration),
        pbandk.ListWithSize.Builder.fixed(repeatedTimestamp), pbandk.ListWithSize.Builder.fixed(repeatedFieldmask), pbandk.ListWithSize.Builder.fixed(repeatedStruct), pbandk.ListWithSize.Builder.fixed(repeatedAny),
        pbandk.ListWithSize.Builder.fixed(repeatedValue), pbandk.ListWithSize.Builder.fixed(repeatedListValue), fieldname1, fieldName2,
        fieldName3, field_name4, field0name5, field0Name6,
        fieldName7, fieldName8, fieldName9, fieldName10,
        fIELDNAME11, fIELDName12, _fieldName13, _FieldName14,
        field_name15, field_Name16, fieldName17_, fieldName18_,
        oneofField, unknownFields)
}

public fun TestAllTypesProto3.Companion.nestedMessage(builderAction: TestAllTypesProto3.MutableNestedMessage.() -> Unit): TestAllTypesProto3.NestedMessage {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableNestedMessage()
    builder.builderAction()
    return builder.toNestedMessage()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3NestedMessage")
public fun TestAllTypesProto3.NestedMessage?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = this ?: TestAllTypesProto3.NestedMessage.defaultInstance

private class TestAllTypesProto3_NestedMessage_Impl(
    override val a: Int,
    override val corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.NestedMessage, pbandk.GeneratedMessage<TestAllTypesProto3.NestedMessage>() {
    override val descriptor get() = TestAllTypesProto3.NestedMessage.descriptor

    override fun copy(
        a: Int,
        corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.NestedMessage)?.let {
        it.copy(
            corecursive = corecursive?.plus(other.corecursive) ?: other.corecursive,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableNestedMessage_Impl(
    override var a: Int,
    override var corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableNestedMessage, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableNestedMessage>() {
    override val descriptor get() = TestAllTypesProto3.NestedMessage.descriptor

    override fun copy(
        a: Int,
        corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.NestedMessage)?.let {
        it.copy(
            corecursive = corecursive?.plus(other.corecursive) ?: other.corecursive,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toNestedMessage() = TestAllTypesProto3_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.NestedMessage {
    var a = 0
    var corecursive: pbandk.conformance.pb.TestAllTypesProto3? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
            2 -> corecursive = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.NestedMessage(a, corecursive, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapInt32Int32Entry(builderAction: TestAllTypesProto3.MutableMapInt32Int32Entry.() -> Unit): TestAllTypesProto3.MapInt32Int32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapInt32Int32Entry()
    builder.builderAction()
    return builder.toMapInt32Int32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapInt32Int32Entry")
public fun TestAllTypesProto3.MapInt32Int32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry = this ?: TestAllTypesProto3.MapInt32Int32Entry.defaultInstance

private class TestAllTypesProto3_MapInt32Int32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt32Int32Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapInt32Int32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt32Int32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt32Int32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt32Int32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapInt32Int32Entry_Impl(
    override var key: Int,
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapInt32Int32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapInt32Int32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt32Int32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt32Int32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt32Int32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt32Int32Entry() = TestAllTypesProto3_MapInt32Int32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32Int32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt32Int32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapInt32Int32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapInt64Int64Entry(builderAction: TestAllTypesProto3.MutableMapInt64Int64Entry.() -> Unit): TestAllTypesProto3.MapInt64Int64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapInt64Int64Entry()
    builder.builderAction()
    return builder.toMapInt64Int64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapInt64Int64Entry")
public fun TestAllTypesProto3.MapInt64Int64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry = this ?: TestAllTypesProto3.MapInt64Int64Entry.defaultInstance

private class TestAllTypesProto3_MapInt64Int64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt64Int64Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapInt64Int64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt64Int64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt64Int64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt64Int64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapInt64Int64Entry_Impl(
    override var key: Long,
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapInt64Int64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapInt64Int64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt64Int64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt64Int64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt64Int64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt64Int64Entry() = TestAllTypesProto3_MapInt64Int64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt64Int64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt64Int64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapInt64Int64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapUint32Uint32Entry(builderAction: TestAllTypesProto3.MutableMapUint32Uint32Entry.() -> Unit): TestAllTypesProto3.MapUint32Uint32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapUint32Uint32Entry()
    builder.builderAction()
    return builder.toMapUint32Uint32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapUint32Uint32Entry")
public fun TestAllTypesProto3.MapUint32Uint32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry = this ?: TestAllTypesProto3.MapUint32Uint32Entry.defaultInstance

private class TestAllTypesProto3_MapUint32Uint32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapUint32Uint32Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapUint32Uint32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapUint32Uint32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapUint32Uint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapUint32Uint32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapUint32Uint32Entry_Impl(
    override var key: Int,
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapUint32Uint32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapUint32Uint32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapUint32Uint32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapUint32Uint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapUint32Uint32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapUint32Uint32Entry() = TestAllTypesProto3_MapUint32Uint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapUint32Uint32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapUint32Uint32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapUint32Uint32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapUint64Uint64Entry(builderAction: TestAllTypesProto3.MutableMapUint64Uint64Entry.() -> Unit): TestAllTypesProto3.MapUint64Uint64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapUint64Uint64Entry()
    builder.builderAction()
    return builder.toMapUint64Uint64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapUint64Uint64Entry")
public fun TestAllTypesProto3.MapUint64Uint64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry = this ?: TestAllTypesProto3.MapUint64Uint64Entry.defaultInstance

private class TestAllTypesProto3_MapUint64Uint64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapUint64Uint64Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapUint64Uint64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapUint64Uint64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapUint64Uint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapUint64Uint64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapUint64Uint64Entry_Impl(
    override var key: Long,
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapUint64Uint64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapUint64Uint64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapUint64Uint64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapUint64Uint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapUint64Uint64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapUint64Uint64Entry() = TestAllTypesProto3_MapUint64Uint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapUint64Uint64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapUint64Uint64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapUint64Uint64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapSint32Sint32Entry(builderAction: TestAllTypesProto3.MutableMapSint32Sint32Entry.() -> Unit): TestAllTypesProto3.MapSint32Sint32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapSint32Sint32Entry()
    builder.builderAction()
    return builder.toMapSint32Sint32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapSint32Sint32Entry")
public fun TestAllTypesProto3.MapSint32Sint32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry = this ?: TestAllTypesProto3.MapSint32Sint32Entry.defaultInstance

private class TestAllTypesProto3_MapSint32Sint32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSint32Sint32Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapSint32Sint32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSint32Sint32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSint32Sint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSint32Sint32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapSint32Sint32Entry_Impl(
    override var key: Int,
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapSint32Sint32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapSint32Sint32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSint32Sint32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSint32Sint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSint32Sint32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSint32Sint32Entry() = TestAllTypesProto3_MapSint32Sint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSint32Sint32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSint32Sint32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapSint32Sint32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapSint64Sint64Entry(builderAction: TestAllTypesProto3.MutableMapSint64Sint64Entry.() -> Unit): TestAllTypesProto3.MapSint64Sint64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapSint64Sint64Entry()
    builder.builderAction()
    return builder.toMapSint64Sint64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapSint64Sint64Entry")
public fun TestAllTypesProto3.MapSint64Sint64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry = this ?: TestAllTypesProto3.MapSint64Sint64Entry.defaultInstance

private class TestAllTypesProto3_MapSint64Sint64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSint64Sint64Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapSint64Sint64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSint64Sint64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSint64Sint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSint64Sint64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapSint64Sint64Entry_Impl(
    override var key: Long,
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapSint64Sint64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapSint64Sint64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSint64Sint64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSint64Sint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSint64Sint64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSint64Sint64Entry() = TestAllTypesProto3_MapSint64Sint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSint64Sint64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSint64Sint64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapSint64Sint64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapFixed32Fixed32Entry(builderAction: TestAllTypesProto3.MutableMapFixed32Fixed32Entry.() -> Unit): TestAllTypesProto3.MapFixed32Fixed32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapFixed32Fixed32Entry()
    builder.builderAction()
    return builder.toMapFixed32Fixed32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapFixed32Fixed32Entry")
public fun TestAllTypesProto3.MapFixed32Fixed32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry = this ?: TestAllTypesProto3.MapFixed32Fixed32Entry.defaultInstance

private class TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapFixed32Fixed32Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapFixed32Fixed32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapFixed32Fixed32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapFixed32Fixed32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapFixed32Fixed32Entry_Impl(
    override var key: Int,
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapFixed32Fixed32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapFixed32Fixed32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapFixed32Fixed32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapFixed32Fixed32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapFixed32Fixed32Entry() = TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapFixed32Fixed32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapFixed32Fixed32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapFixed32Fixed32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapFixed64Fixed64Entry(builderAction: TestAllTypesProto3.MutableMapFixed64Fixed64Entry.() -> Unit): TestAllTypesProto3.MapFixed64Fixed64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapFixed64Fixed64Entry()
    builder.builderAction()
    return builder.toMapFixed64Fixed64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapFixed64Fixed64Entry")
public fun TestAllTypesProto3.MapFixed64Fixed64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry = this ?: TestAllTypesProto3.MapFixed64Fixed64Entry.defaultInstance

private class TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapFixed64Fixed64Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapFixed64Fixed64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapFixed64Fixed64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapFixed64Fixed64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapFixed64Fixed64Entry_Impl(
    override var key: Long,
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapFixed64Fixed64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapFixed64Fixed64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapFixed64Fixed64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapFixed64Fixed64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapFixed64Fixed64Entry() = TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapFixed64Fixed64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapFixed64Fixed64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapFixed64Fixed64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapSfixed32Sfixed32Entry(builderAction: TestAllTypesProto3.MutableMapSfixed32Sfixed32Entry.() -> Unit): TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapSfixed32Sfixed32Entry()
    builder.builderAction()
    return builder.toMapSfixed32Sfixed32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapSfixed32Sfixed32Entry")
public fun TestAllTypesProto3.MapSfixed32Sfixed32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry = this ?: TestAllTypesProto3.MapSfixed32Sfixed32Entry.defaultInstance

private class TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSfixed32Sfixed32Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapSfixed32Sfixed32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSfixed32Sfixed32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSfixed32Sfixed32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapSfixed32Sfixed32Entry_Impl(
    override var key: Int,
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapSfixed32Sfixed32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapSfixed32Sfixed32Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSfixed32Sfixed32Entry.descriptor

    override fun copy(
        key: Int,
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSfixed32Sfixed32Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSfixed32Sfixed32Entry() = TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapSfixed32Sfixed32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapSfixed64Sfixed64Entry(builderAction: TestAllTypesProto3.MutableMapSfixed64Sfixed64Entry.() -> Unit): TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapSfixed64Sfixed64Entry()
    builder.builderAction()
    return builder.toMapSfixed64Sfixed64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapSfixed64Sfixed64Entry")
public fun TestAllTypesProto3.MapSfixed64Sfixed64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry = this ?: TestAllTypesProto3.MapSfixed64Sfixed64Entry.defaultInstance

private class TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSfixed64Sfixed64Entry, pbandk.GeneratedMessage<TestAllTypesProto3.MapSfixed64Sfixed64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSfixed64Sfixed64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSfixed64Sfixed64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapSfixed64Sfixed64Entry_Impl(
    override var key: Long,
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapSfixed64Sfixed64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapSfixed64Sfixed64Entry>() {
    override val descriptor get() = TestAllTypesProto3.MapSfixed64Sfixed64Entry.descriptor

    override fun copy(
        key: Long,
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapSfixed64Sfixed64Entry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSfixed64Sfixed64Entry() = TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapSfixed64Sfixed64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapInt32FloatEntry(builderAction: TestAllTypesProto3.MutableMapInt32FloatEntry.() -> Unit): TestAllTypesProto3.MapInt32FloatEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapInt32FloatEntry()
    builder.builderAction()
    return builder.toMapInt32FloatEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapInt32FloatEntry")
public fun TestAllTypesProto3.MapInt32FloatEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry = this ?: TestAllTypesProto3.MapInt32FloatEntry.defaultInstance

private class TestAllTypesProto3_MapInt32FloatEntry_Impl(
    override val key: Int,
    override val value: Float,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt32FloatEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapInt32FloatEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt32FloatEntry.descriptor

    override fun copy(
        key: Int,
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt32FloatEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt32FloatEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapInt32FloatEntry_Impl(
    override var key: Int,
    override var value: Float,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapInt32FloatEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapInt32FloatEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt32FloatEntry.descriptor

    override fun copy(
        key: Int,
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt32FloatEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt32FloatEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt32FloatEntry() = TestAllTypesProto3_MapInt32FloatEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32FloatEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt32FloatEntry {
    var key = 0
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Float
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapInt32FloatEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapInt32DoubleEntry(builderAction: TestAllTypesProto3.MutableMapInt32DoubleEntry.() -> Unit): TestAllTypesProto3.MapInt32DoubleEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapInt32DoubleEntry()
    builder.builderAction()
    return builder.toMapInt32DoubleEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapInt32DoubleEntry")
public fun TestAllTypesProto3.MapInt32DoubleEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry = this ?: TestAllTypesProto3.MapInt32DoubleEntry.defaultInstance

private class TestAllTypesProto3_MapInt32DoubleEntry_Impl(
    override val key: Int,
    override val value: Double,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt32DoubleEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapInt32DoubleEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt32DoubleEntry.descriptor

    override fun copy(
        key: Int,
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt32DoubleEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt32DoubleEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapInt32DoubleEntry_Impl(
    override var key: Int,
    override var value: Double,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapInt32DoubleEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapInt32DoubleEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapInt32DoubleEntry.descriptor

    override fun copy(
        key: Int,
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapInt32DoubleEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapInt32DoubleEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt32DoubleEntry() = TestAllTypesProto3_MapInt32DoubleEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32DoubleEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt32DoubleEntry {
    var key = 0
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Double
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapInt32DoubleEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapBoolBoolEntry(builderAction: TestAllTypesProto3.MutableMapBoolBoolEntry.() -> Unit): TestAllTypesProto3.MapBoolBoolEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapBoolBoolEntry()
    builder.builderAction()
    return builder.toMapBoolBoolEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapBoolBoolEntry")
public fun TestAllTypesProto3.MapBoolBoolEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry = this ?: TestAllTypesProto3.MapBoolBoolEntry.defaultInstance

private class TestAllTypesProto3_MapBoolBoolEntry_Impl(
    override val key: Boolean,
    override val value: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapBoolBoolEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapBoolBoolEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapBoolBoolEntry.descriptor

    override fun copy(
        key: Boolean,
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapBoolBoolEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapBoolBoolEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapBoolBoolEntry_Impl(
    override var key: Boolean,
    override var value: Boolean,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapBoolBoolEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapBoolBoolEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapBoolBoolEntry.descriptor

    override fun copy(
        key: Boolean,
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapBoolBoolEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapBoolBoolEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapBoolBoolEntry() = TestAllTypesProto3_MapBoolBoolEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapBoolBoolEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapBoolBoolEntry {
    var key = false
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Boolean
            2 -> value = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapBoolBoolEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapStringStringEntry(builderAction: TestAllTypesProto3.MutableMapStringStringEntry.() -> Unit): TestAllTypesProto3.MapStringStringEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapStringStringEntry()
    builder.builderAction()
    return builder.toMapStringStringEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapStringStringEntry")
public fun TestAllTypesProto3.MapStringStringEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry = this ?: TestAllTypesProto3.MapStringStringEntry.defaultInstance

private class TestAllTypesProto3_MapStringStringEntry_Impl(
    override val key: String,
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringStringEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapStringStringEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringStringEntry.descriptor

    override fun copy(
        key: String,
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringStringEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringStringEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapStringStringEntry_Impl(
    override var key: String,
    override var value: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapStringStringEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapStringStringEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringStringEntry.descriptor

    override fun copy(
        key: String,
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringStringEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringStringEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringStringEntry() = TestAllTypesProto3_MapStringStringEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringStringEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringStringEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapStringStringEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapStringBytesEntry(builderAction: TestAllTypesProto3.MutableMapStringBytesEntry.() -> Unit): TestAllTypesProto3.MapStringBytesEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapStringBytesEntry()
    builder.builderAction()
    return builder.toMapStringBytesEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapStringBytesEntry")
public fun TestAllTypesProto3.MapStringBytesEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry = this ?: TestAllTypesProto3.MapStringBytesEntry.defaultInstance

private class TestAllTypesProto3_MapStringBytesEntry_Impl(
    override val key: String,
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringBytesEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapStringBytesEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringBytesEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringBytesEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringBytesEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapStringBytesEntry_Impl(
    override var key: String,
    override var value: pbandk.ByteArr,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapStringBytesEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapStringBytesEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringBytesEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringBytesEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringBytesEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringBytesEntry() = TestAllTypesProto3_MapStringBytesEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringBytesEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringBytesEntry {
    var key = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapStringBytesEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapStringNestedMessageEntry(builderAction: TestAllTypesProto3.MutableMapStringNestedMessageEntry.() -> Unit): TestAllTypesProto3.MapStringNestedMessageEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapStringNestedMessageEntry()
    builder.builderAction()
    return builder.toMapStringNestedMessageEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapStringNestedMessageEntry")
public fun TestAllTypesProto3.MapStringNestedMessageEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry = this ?: TestAllTypesProto3.MapStringNestedMessageEntry.defaultInstance

private class TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
    override val key: String,
    override val value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringNestedMessageEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapStringNestedMessageEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringNestedMessageEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringNestedMessageEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapStringNestedMessageEntry_Impl(
    override var key: String,
    override var value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapStringNestedMessageEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapStringNestedMessageEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringNestedMessageEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringNestedMessageEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringNestedMessageEntry() = TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringNestedMessageEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringNestedMessageEntry {
    var key = ""
    var value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3.NestedMessage
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapStringNestedMessageEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapStringForeignMessageEntry(builderAction: TestAllTypesProto3.MutableMapStringForeignMessageEntry.() -> Unit): TestAllTypesProto3.MapStringForeignMessageEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapStringForeignMessageEntry()
    builder.builderAction()
    return builder.toMapStringForeignMessageEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapStringForeignMessageEntry")
public fun TestAllTypesProto3.MapStringForeignMessageEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry = this ?: TestAllTypesProto3.MapStringForeignMessageEntry.defaultInstance

private class TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
    override val key: String,
    override val value: pbandk.conformance.pb.ForeignMessage?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringForeignMessageEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapStringForeignMessageEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringForeignMessageEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.ForeignMessage?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringForeignMessageEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapStringForeignMessageEntry_Impl(
    override var key: String,
    override var value: pbandk.conformance.pb.ForeignMessage?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapStringForeignMessageEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapStringForeignMessageEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringForeignMessageEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.ForeignMessage?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringForeignMessageEntry)?.let {
        it.copy(
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringForeignMessageEntry() = TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringForeignMessageEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringForeignMessageEntry {
    var key = ""
    var value: pbandk.conformance.pb.ForeignMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.ForeignMessage
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapStringForeignMessageEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapStringNestedEnumEntry(builderAction: TestAllTypesProto3.MutableMapStringNestedEnumEntry.() -> Unit): TestAllTypesProto3.MapStringNestedEnumEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapStringNestedEnumEntry()
    builder.builderAction()
    return builder.toMapStringNestedEnumEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapStringNestedEnumEntry")
public fun TestAllTypesProto3.MapStringNestedEnumEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry = this ?: TestAllTypesProto3.MapStringNestedEnumEntry.defaultInstance

private class TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
    override val key: String,
    override val value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringNestedEnumEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapStringNestedEnumEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringNestedEnumEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringNestedEnumEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapStringNestedEnumEntry_Impl(
    override var key: String,
    override var value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapStringNestedEnumEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapStringNestedEnumEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringNestedEnumEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringNestedEnumEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringNestedEnumEntry() = TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringNestedEnumEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringNestedEnumEntry {
    var key = ""
    var value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.TestAllTypesProto3.NestedEnum
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapStringNestedEnumEntry(key, value, unknownFields)
}

public fun TestAllTypesProto3.Companion.mapStringForeignEnumEntry(builderAction: TestAllTypesProto3.MutableMapStringForeignEnumEntry.() -> Unit): TestAllTypesProto3.MapStringForeignEnumEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto3.MutableMapStringForeignEnumEntry()
    builder.builderAction()
    return builder.toMapStringForeignEnumEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3MapStringForeignEnumEntry")
public fun TestAllTypesProto3.MapStringForeignEnumEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry = this ?: TestAllTypesProto3.MapStringForeignEnumEntry.defaultInstance

private class TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
    override val key: String,
    override val value: pbandk.conformance.pb.ForeignEnum,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringForeignEnumEntry, pbandk.GeneratedMessage<TestAllTypesProto3.MapStringForeignEnumEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringForeignEnumEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.ForeignEnum,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringForeignEnumEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto3_MutableMapStringForeignEnumEntry_Impl(
    override var key: String,
    override var value: pbandk.conformance.pb.ForeignEnum,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MutableMapStringForeignEnumEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto3.MutableMapStringForeignEnumEntry>() {
    override val descriptor get() = TestAllTypesProto3.MapStringForeignEnumEntry.descriptor

    override fun copy(
        key: String,
        value: pbandk.conformance.pb.ForeignEnum,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto3.MapStringForeignEnumEntry)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringForeignEnumEntry() = TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringForeignEnumEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringForeignEnumEntry {
    var key = ""
    var value: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.ForeignEnum
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto3.MapStringForeignEnumEntry(key, value, unknownFields)
}

public fun foreignMessage(builderAction: MutableForeignMessage.() -> Unit): ForeignMessage {
    @Suppress("DEPRECATION") val builder = MutableForeignMessage()
    builder.builderAction()
    return builder.toForeignMessage()
}

@pbandk.Export
@pbandk.JsName("orDefaultForForeignMessage")
public fun ForeignMessage?.orDefault(): pbandk.conformance.pb.ForeignMessage = this ?: ForeignMessage.defaultInstance

private class ForeignMessage_Impl(
    override val c: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ForeignMessage, pbandk.GeneratedMessage<ForeignMessage>() {
    override val descriptor get() = ForeignMessage.descriptor

    override fun copy(
        c: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ForeignMessage_Impl(
        c = c,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ForeignMessage)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableForeignMessage_Impl(
    override var c: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableForeignMessage, pbandk.MutableGeneratedMessage<MutableForeignMessage>() {
    override val descriptor get() = ForeignMessage.descriptor

    override fun copy(
        c: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ForeignMessage_Impl(
        c = c,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ForeignMessage)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toForeignMessage() = ForeignMessage_Impl(
        c = c,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun ForeignMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForeignMessage {
    var c = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return ForeignMessage(c, unknownFields)
}

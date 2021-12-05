@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

@pbandk.Export
public sealed class ForeignEnumProto2(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is ForeignEnumProto2 && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "ForeignEnumProto2.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object FOREIGN_FOO : ForeignEnumProto2(0, "FOREIGN_FOO")
    public object FOREIGN_BAR : ForeignEnumProto2(1, "FOREIGN_BAR")
    public object FOREIGN_BAZ : ForeignEnumProto2(2, "FOREIGN_BAZ")
    public class UNRECOGNIZED(value: Int) : ForeignEnumProto2(value)

    public companion object : pbandk.Message.Enum.Companion<ForeignEnumProto2> {
        public val values: List<ForeignEnumProto2> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int): ForeignEnumProto2 = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): ForeignEnumProto2 = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnumProto2 with name: $name")
    }
}

public sealed interface TestAllTypesProto2 : pbandk.ExtendableMessage {
    public val optionalInt32: Int?
    public val optionalInt64: Long?
    public val optionalUint32: Int?
    public val optionalUint64: Long?
    public val optionalSint32: Int?
    public val optionalSint64: Long?
    public val optionalFixed32: Int?
    public val optionalFixed64: Long?
    public val optionalSfixed32: Int?
    public val optionalSfixed64: Long?
    public val optionalFloat: Float?
    public val optionalDouble: Double?
    public val optionalBool: Boolean?
    public val optionalString: String?
    public val optionalBytes: pbandk.ByteArr?
    public val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
    public val optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2?
    public val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?
    public val optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2?
    public val optionalStringPiece: String?
    public val optionalCord: String?
    public val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2?
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
    public val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>
    public val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2>
    public val repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public val repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2>
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
    public val packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
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
    public val unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public val mapInt32Int32: Map<Int?, Int?>
    public val mapInt64Int64: Map<Long?, Long?>
    public val mapUint32Uint32: Map<Int?, Int?>
    public val mapUint64Uint64: Map<Long?, Long?>
    public val mapSint32Sint32: Map<Int?, Int?>
    public val mapSint64Sint64: Map<Long?, Long?>
    public val mapFixed32Fixed32: Map<Int?, Int?>
    public val mapFixed64Fixed64: Map<Long?, Long?>
    public val mapSfixed32Sfixed32: Map<Int?, Int?>
    public val mapSfixed64Sfixed64: Map<Long?, Long?>
    public val mapInt32Float: Map<Int?, Float?>
    public val mapInt32Double: Map<Int?, Double?>
    public val mapBoolBool: Map<Boolean?, Boolean?>
    public val mapStringString: Map<String?, String?>
    public val mapStringBytes: Map<String?, pbandk.ByteArr?>
    public val mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>
    public val mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>
    public val mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>
    public val mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>
    public val fieldname1: Int?
    public val fieldName2: Int?
    public val fieldName3: Int?
    public val field_name4: Int?
    public val field0name5: Int?
    public val field0Name6: Int?
    public val fieldName7: Int?
    public val fieldName8: Int?
    public val fieldName9: Int?
    public val fieldName10: Int?
    public val fIELDNAME11: Int?
    public val fIELDName12: Int?
    public val _fieldName13: Int?
    public val _FieldName14: Int?
    public val field_name15: Int?
    public val field_Name16: Int?
    public val fieldName17_: Int?
    public val fieldName18_: Int?
    public val oneofField: OneofField<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2>

    public fun copy(
        optionalInt32: Int? = this.optionalInt32,
        optionalInt64: Long? = this.optionalInt64,
        optionalUint32: Int? = this.optionalUint32,
        optionalUint64: Long? = this.optionalUint64,
        optionalSint32: Int? = this.optionalSint32,
        optionalSint64: Long? = this.optionalSint64,
        optionalFixed32: Int? = this.optionalFixed32,
        optionalFixed64: Long? = this.optionalFixed64,
        optionalSfixed32: Int? = this.optionalSfixed32,
        optionalSfixed64: Long? = this.optionalSfixed64,
        optionalFloat: Float? = this.optionalFloat,
        optionalDouble: Double? = this.optionalDouble,
        optionalBool: Boolean? = this.optionalBool,
        optionalString: String? = this.optionalString,
        optionalBytes: pbandk.ByteArr? = this.optionalBytes,
        optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = this.optionalNestedMessage,
        optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = this.optionalForeignMessage,
        optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = this.optionalNestedEnum,
        optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2? = this.optionalForeignEnum,
        optionalStringPiece: String? = this.optionalStringPiece,
        optionalCord: String? = this.optionalCord,
        recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2? = this.recursiveMessage,
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
        repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> = this.repeatedNestedMessage,
        repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2> = this.repeatedForeignMessage,
        repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = this.repeatedNestedEnum,
        repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2> = this.repeatedForeignEnum,
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
        packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = this.packedNestedEnum,
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
        unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = this.unpackedNestedEnum,
        mapInt32Int32: Map<Int?, Int?> = this.mapInt32Int32,
        mapInt64Int64: Map<Long?, Long?> = this.mapInt64Int64,
        mapUint32Uint32: Map<Int?, Int?> = this.mapUint32Uint32,
        mapUint64Uint64: Map<Long?, Long?> = this.mapUint64Uint64,
        mapSint32Sint32: Map<Int?, Int?> = this.mapSint32Sint32,
        mapSint64Sint64: Map<Long?, Long?> = this.mapSint64Sint64,
        mapFixed32Fixed32: Map<Int?, Int?> = this.mapFixed32Fixed32,
        mapFixed64Fixed64: Map<Long?, Long?> = this.mapFixed64Fixed64,
        mapSfixed32Sfixed32: Map<Int?, Int?> = this.mapSfixed32Sfixed32,
        mapSfixed64Sfixed64: Map<Long?, Long?> = this.mapSfixed64Sfixed64,
        mapInt32Float: Map<Int?, Float?> = this.mapInt32Float,
        mapInt32Double: Map<Int?, Double?> = this.mapInt32Double,
        mapBoolBool: Map<Boolean?, Boolean?> = this.mapBoolBool,
        mapStringString: Map<String?, String?> = this.mapStringString,
        mapStringBytes: Map<String?, pbandk.ByteArr?> = this.mapStringBytes,
        mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> = this.mapStringNestedMessage,
        mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?> = this.mapStringForeignMessage,
        mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> = this.mapStringNestedEnum,
        mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?> = this.mapStringForeignEnum,
        fieldname1: Int? = this.fieldname1,
        fieldName2: Int? = this.fieldName2,
        fieldName3: Int? = this.fieldName3,
        field_name4: Int? = this.field_name4,
        field0name5: Int? = this.field0name5,
        field0Name6: Int? = this.field0Name6,
        fieldName7: Int? = this.fieldName7,
        fieldName8: Int? = this.fieldName8,
        fieldName9: Int? = this.fieldName9,
        fieldName10: Int? = this.fieldName10,
        fIELDNAME11: Int? = this.fIELDNAME11,
        fIELDName12: Int? = this.fIELDName12,
        _fieldName13: Int? = this._fieldName13,
        _FieldName14: Int? = this._FieldName14,
        field_name15: Int? = this.field_name15,
        field_Name16: Int? = this.field_Name16,
        fieldName17_: Int? = this.fieldName17_,
        fieldName18_: Int? = this.fieldName18_,
        oneofField: pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>? = this.oneofField,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.TestAllTypesProto2

    public val oneofUint32: Int?
    public val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
    public val oneofString: String?
    public val oneofBytes: pbandk.ByteArr?
    public val oneofBool: Boolean?
    public val oneofUint64: Long?
    public val oneofFloat: Float?
    public val oneofDouble: Double?
    public val oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?

    public sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class OneofUint32(oneofUint32: Int = 0) : OneofField<Int>(oneofUint32)
        public class OneofNestedMessage(oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage) : OneofField<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>(oneofNestedMessage)
        public class OneofString(oneofString: String = "") : OneofField<String>(oneofString)
        public class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField<pbandk.ByteArr>(oneofBytes)
        public class OneofBool(oneofBool: Boolean = false) : OneofField<Boolean>(oneofBool)
        public class OneofUint64(oneofUint64: Long = 0L) : OneofField<Long>(oneofUint64)
        public class OneofFloat(oneofFloat: Float = 0.0F) : OneofField<Float>(oneofFloat)
        public class OneofDouble(oneofDouble: Double = 0.0) : OneofField<Double>(oneofDouble)
        public class OneofEnum(oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0)) : OneofField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(oneofEnum)
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2> {
        @Deprecated("Use testAllTypesProto2 { } instead")
        public operator fun invoke(
            optionalInt32: Int? = null,
            optionalInt64: Long? = null,
            optionalUint32: Int? = null,
            optionalUint64: Long? = null,
            optionalSint32: Int? = null,
            optionalSint64: Long? = null,
            optionalFixed32: Int? = null,
            optionalFixed64: Long? = null,
            optionalSfixed32: Int? = null,
            optionalSfixed64: Long? = null,
            optionalFloat: Float? = null,
            optionalDouble: Double? = null,
            optionalBool: Boolean? = null,
            optionalString: String? = null,
            optionalBytes: pbandk.ByteArr? = null,
            optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
            optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
            optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
            optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2? = null,
            optionalStringPiece: String? = null,
            optionalCord: String? = null,
            recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2? = null,
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
            repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> = emptyList(),
            repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2> = emptyList(),
            repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
            repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2> = emptyList(),
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
            packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
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
            unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
            mapInt32Int32: Map<Int?, Int?> = emptyMap(),
            mapInt64Int64: Map<Long?, Long?> = emptyMap(),
            mapUint32Uint32: Map<Int?, Int?> = emptyMap(),
            mapUint64Uint64: Map<Long?, Long?> = emptyMap(),
            mapSint32Sint32: Map<Int?, Int?> = emptyMap(),
            mapSint64Sint64: Map<Long?, Long?> = emptyMap(),
            mapFixed32Fixed32: Map<Int?, Int?> = emptyMap(),
            mapFixed64Fixed64: Map<Long?, Long?> = emptyMap(),
            mapSfixed32Sfixed32: Map<Int?, Int?> = emptyMap(),
            mapSfixed64Sfixed64: Map<Long?, Long?> = emptyMap(),
            mapInt32Float: Map<Int?, Float?> = emptyMap(),
            mapInt32Double: Map<Int?, Double?> = emptyMap(),
            mapBoolBool: Map<Boolean?, Boolean?> = emptyMap(),
            mapStringString: Map<String?, String?> = emptyMap(),
            mapStringBytes: Map<String?, pbandk.ByteArr?> = emptyMap(),
            mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> = emptyMap(),
            mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?> = emptyMap(),
            mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> = emptyMap(),
            mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?> = emptyMap(),
            fieldname1: Int? = null,
            fieldName2: Int? = null,
            fieldName3: Int? = null,
            field_name4: Int? = null,
            field0name5: Int? = null,
            field0Name6: Int? = null,
            fieldName7: Int? = null,
            fieldName8: Int? = null,
            fieldName9: Int? = null,
            fieldName10: Int? = null,
            fIELDNAME11: Int? = null,
            fIELDName12: Int? = null,
            _fieldName13: Int? = null,
            _FieldName14: Int? = null,
            field_name15: Int? = null,
            field_Name16: Int? = null,
            fieldName17_: Int? = null,
            fieldName18_: Int? = null,
            oneofField: OneofField<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto2 = TestAllTypesProto2_Impl(
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
        public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2 by lazy { pbandk.conformance.pb.TestAllTypesProto2() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2 = pbandk.conformance.pb.TestAllTypesProto2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, *>>(117)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "optionalInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "optionalUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "optionalUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "optionalSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "optionalSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "optionalFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "optionalFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "optionalSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "optionalSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "optionalFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "optionalDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "optionalBool",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "optionalBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_message",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_message",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion),
                        jsonName = "optionalForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_enum",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true),
                        jsonName = "optionalNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion, hasPresence = true),
                        jsonName = "optionalForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_piece",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalStringPiece",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalStringPiece
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_cord",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalCord",
                        value = pbandk.conformance.pb.TestAllTypesProto2::optionalCord
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "recursive_message",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.Companion),
                        jsonName = "recursiveMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::recursiveMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "repeatedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "repeatedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "repeatedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "repeatedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint32",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "repeatedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint64",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "repeatedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed32",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "repeatedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed64",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "repeatedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed32",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "repeatedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed64",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "repeatedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "repeatedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "repeatedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool",
                        number = 43,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "repeatedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedString",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "repeatedBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_message",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)),
                        jsonName = "repeatedNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_message",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignMessageProto2>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion)),
                        jsonName = "repeatedForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_enum",
                        number = 51,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)),
                        jsonName = "repeatedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_enum",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignEnumProto2>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion)),
                        jsonName = "repeatedForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_piece",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedStringPiece",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedStringPiece
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_cord",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedCord",
                        value = pbandk.conformance.pb.TestAllTypesProto2::repeatedCord
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_int32",
                        number = 56,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "mapInt32Int32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapInt32Int32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int64_int64",
                        number = 57,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true)),
                        jsonName = "mapInt64Int64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapInt64Int64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint32_uint32",
                        number = 58,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true)),
                        jsonName = "mapUint32Uint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapUint32Uint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint64_uint64",
                        number = 59,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true)),
                        jsonName = "mapUint64Uint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapUint64Uint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint32_sint32",
                        number = 60,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true)),
                        jsonName = "mapSint32Sint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapSint32Sint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint64_sint64",
                        number = 61,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true)),
                        jsonName = "mapSint64Sint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapSint64Sint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed32_fixed32",
                        number = 62,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true)),
                        jsonName = "mapFixed32Fixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapFixed32Fixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed64_fixed64",
                        number = 63,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true)),
                        jsonName = "mapFixed64Fixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapFixed64Fixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed32_sfixed32",
                        number = 64,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true)),
                        jsonName = "mapSfixed32Sfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapSfixed32Sfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed64_sfixed64",
                        number = 65,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true)),
                        jsonName = "mapSfixed64Sfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapSfixed64Sfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_float",
                        number = 66,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Float?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true)),
                        jsonName = "mapInt32Float",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapInt32Float
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_double",
                        number = 67,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Double?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true)),
                        jsonName = "mapInt32Double",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapInt32Double
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_bool_bool",
                        number = 68,
                        type = pbandk.FieldDescriptor.Type.Map<Boolean?, Boolean?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true)),
                        jsonName = "mapBoolBool",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapBoolBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_string",
                        number = 69,
                        type = pbandk.FieldDescriptor.Type.Map<String?, String?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "mapStringString",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapStringString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_bytes",
                        number = 70,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.ByteArr?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true)),
                        jsonName = "mapStringBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapStringBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_message",
                        number = 71,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)),
                        jsonName = "mapStringNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapStringNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_message",
                        number = 72,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion)),
                        jsonName = "mapStringForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapStringForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_enum",
                        number = 73,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true)),
                        jsonName = "mapStringNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapStringNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_enum",
                        number = 74,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion, hasPresence = true)),
                        jsonName = "mapStringForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::mapStringForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int32",
                        number = 75,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "packedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int64",
                        number = 76,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "packedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint32",
                        number = 77,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "packedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint64",
                        number = 78,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "packedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint32",
                        number = 79,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "packedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint64",
                        number = 80,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "packedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed32",
                        number = 81,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "packedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed64",
                        number = 82,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "packedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed32",
                        number = 83,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "packedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed64",
                        number = 84,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "packedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_float",
                        number = 85,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "packedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_double",
                        number = 86,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "packedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_bool",
                        number = 87,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "packedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_nested_enum",
                        number = 88,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion), packed = true),
                        jsonName = "packedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::packedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int32",
                        number = 89,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "unpackedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int64",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "unpackedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint32",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "unpackedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint64",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "unpackedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint32",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "unpackedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint64",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "unpackedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed32",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "unpackedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed64",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "unpackedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed32",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "unpackedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed64",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "unpackedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_float",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "unpackedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_double",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "unpackedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_bool",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "unpackedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_nested_enum",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)),
                        jsonName = "unpackedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::unpackedNestedEnum
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_nested_message",
                        number = 112,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "oneofNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofNestedMessage
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofString
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofBytes
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofBool
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofUint64
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofFloat
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
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_enum",
                        number = 119,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto2::oneofEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldname1",
                        number = 401,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldname1",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldname1
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name2",
                        number = 402,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName2",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName2
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "_field_name3",
                        number = 403,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName3",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName3
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name4_",
                        number = 404,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName4",
                        value = pbandk.conformance.pb.TestAllTypesProto2::field_name4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field0name5",
                        number = 405,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field0name5",
                        value = pbandk.conformance.pb.TestAllTypesProto2::field0name5
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_0_name6",
                        number = 406,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field0Name6",
                        value = pbandk.conformance.pb.TestAllTypesProto2::field0Name6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldName7",
                        number = 407,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName7",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName7
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FieldName8",
                        number = 408,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName8",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName8
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_Name9",
                        number = 409,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName9",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName9
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_Name10",
                        number = 410,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName10",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName10
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_NAME11",
                        number = 411,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FIELDNAME11",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fIELDNAME11
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_name12",
                        number = 412,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FIELDName12",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fIELDName12
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__field_name13",
                        number = 413,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName13",
                        value = pbandk.conformance.pb.TestAllTypesProto2::_fieldName13
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__Field_name14",
                        number = 414,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName14",
                        value = pbandk.conformance.pb.TestAllTypesProto2::_FieldName14
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name15",
                        number = 415,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName15",
                        value = pbandk.conformance.pb.TestAllTypesProto2::field_name15
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__Name16",
                        number = 416,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName16",
                        value = pbandk.conformance.pb.TestAllTypesProto2::field_Name16
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name17__",
                        number = 417,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName17",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName17_
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_name18__",
                        number = 418,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName18",
                        value = pbandk.conformance.pb.TestAllTypesProto2::fieldName18_
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto2.TestAllTypesProto2",
                messageClass = pbandk.conformance.pb.TestAllTypesProto2::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is TestAllTypesProto2.NestedEnum && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "TestAllTypesProto2.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object FOO : NestedEnum(0, "FOO")
        public object BAR : NestedEnum(1, "BAR")
        public object BAZ : NestedEnum(2, "BAZ")
        public object NEG : NestedEnum(-1, "NEG")
        public class UNRECOGNIZED(value: Int) : NestedEnum(value)

        public companion object : pbandk.Message.Enum.Companion<TestAllTypesProto2.NestedEnum> {
            public val values: List<TestAllTypesProto2.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int): TestAllTypesProto2.NestedEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): TestAllTypesProto2.NestedEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    public sealed interface NestedMessage : pbandk.Message {
        public val a: Int?
        public val corecursive: pbandk.conformance.pb.TestAllTypesProto2?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>

        public fun copy(
            a: Int? = this.a,
            corecursive: pbandk.conformance.pb.TestAllTypesProto2? = this.corecursive,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> {
            @Deprecated("Use nestedMessage { } instead")
            public operator fun invoke(
                a: Int? = null,
                corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage = TestAllTypesProto2_NestedMessage_Impl(
                a = a,
                corecursive = corecursive,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage by lazy { pbandk.conformance.pb.TestAllTypesProto2.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::a
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "corecursive",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.Companion),
                            jsonName = "corecursive",
                            value = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::corecursive
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.NestedMessage",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableNestedMessage : TestAllTypesProto2.NestedMessage, pbandk.MutableMessage {
        public override var a: Int?
        public override var corecursive: pbandk.conformance.pb.TestAllTypesProto2?

        public fun toNestedMessage(): TestAllTypesProto2.NestedMessage

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> {
            @Deprecated("Use nestedMessage { } instead")
            public operator fun invoke(
                a: Int? = null,
                corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableNestedMessage = TestAllTypesProto2_MutableNestedMessage_Impl(
                a = a,
                corecursive = corecursive,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableNestedMessage by lazy { MutableNestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> get() = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.descriptor
        }
    }

    public sealed interface MapInt32Int32Entry : pbandk.Message, Map.Entry<Int?, Int?> {
        public override val key: Int?
        public override val value: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry>

        public fun copy(
            key: Int? = this.key,
            value: Int? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry> {
            @Deprecated("Use mapInt32Int32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry = TestAllTypesProto2_MapInt32Int32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapInt32Int32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt32Int32Entry : TestAllTypesProto2.MapInt32Int32Entry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Int?

        public fun toMapInt32Int32Entry(): TestAllTypesProto2.MapInt32Int32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry> {
            @Deprecated("Use mapInt32Int32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt32Int32Entry = TestAllTypesProto2_MutableMapInt32Int32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt32Int32Entry by lazy { MutableMapInt32Int32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry.descriptor
        }
    }

    public sealed interface MapInt64Int64Entry : pbandk.Message, Map.Entry<Long?, Long?> {
        public override val key: Long?
        public override val value: Long?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry>

        public fun copy(
            key: Long? = this.key,
            value: Long? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry> {
            @Deprecated("Use mapInt64Int64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry = TestAllTypesProto2_MapInt64Int64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapInt64Int64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt64Int64Entry : TestAllTypesProto2.MapInt64Int64Entry, pbandk.MutableMessage {
        public override var key: Long?
        public override var value: Long?

        public fun toMapInt64Int64Entry(): TestAllTypesProto2.MapInt64Int64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry> {
            @Deprecated("Use mapInt64Int64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt64Int64Entry = TestAllTypesProto2_MutableMapInt64Int64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt64Int64Entry by lazy { MutableMapInt64Int64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry.descriptor
        }
    }

    public sealed interface MapUint32Uint32Entry : pbandk.Message, Map.Entry<Int?, Int?> {
        public override val key: Int?
        public override val value: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry>

        public fun copy(
            key: Int? = this.key,
            value: Int? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry> {
            @Deprecated("Use mapUint32Uint32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry = TestAllTypesProto2_MapUint32Uint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapUint32Uint32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapUint32Uint32Entry : TestAllTypesProto2.MapUint32Uint32Entry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Int?

        public fun toMapUint32Uint32Entry(): TestAllTypesProto2.MapUint32Uint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry> {
            @Deprecated("Use mapUint32Uint32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapUint32Uint32Entry = TestAllTypesProto2_MutableMapUint32Uint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapUint32Uint32Entry by lazy { MutableMapUint32Uint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry.descriptor
        }
    }

    public sealed interface MapUint64Uint64Entry : pbandk.Message, Map.Entry<Long?, Long?> {
        public override val key: Long?
        public override val value: Long?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry>

        public fun copy(
            key: Long? = this.key,
            value: Long? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry> {
            @Deprecated("Use mapUint64Uint64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry = TestAllTypesProto2_MapUint64Uint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapUint64Uint64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapUint64Uint64Entry : TestAllTypesProto2.MapUint64Uint64Entry, pbandk.MutableMessage {
        public override var key: Long?
        public override var value: Long?

        public fun toMapUint64Uint64Entry(): TestAllTypesProto2.MapUint64Uint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry> {
            @Deprecated("Use mapUint64Uint64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapUint64Uint64Entry = TestAllTypesProto2_MutableMapUint64Uint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapUint64Uint64Entry by lazy { MutableMapUint64Uint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry.descriptor
        }
    }

    public sealed interface MapSint32Sint32Entry : pbandk.Message, Map.Entry<Int?, Int?> {
        public override val key: Int?
        public override val value: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry>

        public fun copy(
            key: Int? = this.key,
            value: Int? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry> {
            @Deprecated("Use mapSint32Sint32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry = TestAllTypesProto2_MapSint32Sint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapSint32Sint32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSint32Sint32Entry : TestAllTypesProto2.MapSint32Sint32Entry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Int?

        public fun toMapSint32Sint32Entry(): TestAllTypesProto2.MapSint32Sint32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry> {
            @Deprecated("Use mapSint32Sint32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSint32Sint32Entry = TestAllTypesProto2_MutableMapSint32Sint32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSint32Sint32Entry by lazy { MutableMapSint32Sint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry.descriptor
        }
    }

    public sealed interface MapSint64Sint64Entry : pbandk.Message, Map.Entry<Long?, Long?> {
        public override val key: Long?
        public override val value: Long?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry>

        public fun copy(
            key: Long? = this.key,
            value: Long? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry> {
            @Deprecated("Use mapSint64Sint64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry = TestAllTypesProto2_MapSint64Sint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapSint64Sint64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSint64Sint64Entry : TestAllTypesProto2.MapSint64Sint64Entry, pbandk.MutableMessage {
        public override var key: Long?
        public override var value: Long?

        public fun toMapSint64Sint64Entry(): TestAllTypesProto2.MapSint64Sint64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry> {
            @Deprecated("Use mapSint64Sint64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSint64Sint64Entry = TestAllTypesProto2_MutableMapSint64Sint64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSint64Sint64Entry by lazy { MutableMapSint64Sint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry.descriptor
        }
    }

    public sealed interface MapFixed32Fixed32Entry : pbandk.Message, Map.Entry<Int?, Int?> {
        public override val key: Int?
        public override val value: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry>

        public fun copy(
            key: Int? = this.key,
            value: Int? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry> {
            @Deprecated("Use mapFixed32Fixed32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry = TestAllTypesProto2_MapFixed32Fixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapFixed32Fixed32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapFixed32Fixed32Entry : TestAllTypesProto2.MapFixed32Fixed32Entry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Int?

        public fun toMapFixed32Fixed32Entry(): TestAllTypesProto2.MapFixed32Fixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry> {
            @Deprecated("Use mapFixed32Fixed32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapFixed32Fixed32Entry = TestAllTypesProto2_MutableMapFixed32Fixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapFixed32Fixed32Entry by lazy { MutableMapFixed32Fixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry.descriptor
        }
    }

    public sealed interface MapFixed64Fixed64Entry : pbandk.Message, Map.Entry<Long?, Long?> {
        public override val key: Long?
        public override val value: Long?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry>

        public fun copy(
            key: Long? = this.key,
            value: Long? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry> {
            @Deprecated("Use mapFixed64Fixed64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry = TestAllTypesProto2_MapFixed64Fixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapFixed64Fixed64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapFixed64Fixed64Entry : TestAllTypesProto2.MapFixed64Fixed64Entry, pbandk.MutableMessage {
        public override var key: Long?
        public override var value: Long?

        public fun toMapFixed64Fixed64Entry(): TestAllTypesProto2.MapFixed64Fixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry> {
            @Deprecated("Use mapFixed64Fixed64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapFixed64Fixed64Entry = TestAllTypesProto2_MutableMapFixed64Fixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapFixed64Fixed64Entry by lazy { MutableMapFixed64Fixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry.descriptor
        }
    }

    public sealed interface MapSfixed32Sfixed32Entry : pbandk.Message, Map.Entry<Int?, Int?> {
        public override val key: Int?
        public override val value: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry>

        public fun copy(
            key: Int? = this.key,
            value: Int? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry> {
            @Deprecated("Use mapSfixed32Sfixed32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry = TestAllTypesProto2_MapSfixed32Sfixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapSfixed32Sfixed32Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSfixed32Sfixed32Entry : TestAllTypesProto2.MapSfixed32Sfixed32Entry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Int?

        public fun toMapSfixed32Sfixed32Entry(): TestAllTypesProto2.MapSfixed32Sfixed32Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry> {
            @Deprecated("Use mapSfixed32Sfixed32Entry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSfixed32Sfixed32Entry = TestAllTypesProto2_MutableMapSfixed32Sfixed32Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSfixed32Sfixed32Entry by lazy { MutableMapSfixed32Sfixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry.descriptor
        }
    }

    public sealed interface MapSfixed64Sfixed64Entry : pbandk.Message, Map.Entry<Long?, Long?> {
        public override val key: Long?
        public override val value: Long?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry>

        public fun copy(
            key: Long? = this.key,
            value: Long? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry> {
            @Deprecated("Use mapSfixed64Sfixed64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry = TestAllTypesProto2_MapSfixed64Sfixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapSfixed64Sfixed64Entry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapSfixed64Sfixed64Entry : TestAllTypesProto2.MapSfixed64Sfixed64Entry, pbandk.MutableMessage {
        public override var key: Long?
        public override var value: Long?

        public fun toMapSfixed64Sfixed64Entry(): TestAllTypesProto2.MapSfixed64Sfixed64Entry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry> {
            @Deprecated("Use mapSfixed64Sfixed64Entry { } instead")
            public operator fun invoke(
                key: Long? = null,
                value: Long? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapSfixed64Sfixed64Entry = TestAllTypesProto2_MutableMapSfixed64Sfixed64Entry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapSfixed64Sfixed64Entry by lazy { MutableMapSfixed64Sfixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry.descriptor
        }
    }

    public sealed interface MapInt32FloatEntry : pbandk.Message, Map.Entry<Int?, Float?> {
        public override val key: Int?
        public override val value: Float?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry>

        public fun copy(
            key: Int? = this.key,
            value: Float? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry> {
            @Deprecated("Use mapInt32FloatEntry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Float? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry = TestAllTypesProto2_MapInt32FloatEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry = pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapInt32FloatEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt32FloatEntry : TestAllTypesProto2.MapInt32FloatEntry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Float?

        public fun toMapInt32FloatEntry(): TestAllTypesProto2.MapInt32FloatEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry> {
            @Deprecated("Use mapInt32FloatEntry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Float? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt32FloatEntry = TestAllTypesProto2_MutableMapInt32FloatEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt32FloatEntry by lazy { MutableMapInt32FloatEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry = pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry.descriptor
        }
    }

    public sealed interface MapInt32DoubleEntry : pbandk.Message, Map.Entry<Int?, Double?> {
        public override val key: Int?
        public override val value: Double?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry>

        public fun copy(
            key: Int? = this.key,
            value: Double? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry> {
            @Deprecated("Use mapInt32DoubleEntry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Double? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry = TestAllTypesProto2_MapInt32DoubleEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry = pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapInt32DoubleEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapInt32DoubleEntry : TestAllTypesProto2.MapInt32DoubleEntry, pbandk.MutableMessage {
        public override var key: Int?
        public override var value: Double?

        public fun toMapInt32DoubleEntry(): TestAllTypesProto2.MapInt32DoubleEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry> {
            @Deprecated("Use mapInt32DoubleEntry { } instead")
            public operator fun invoke(
                key: Int? = null,
                value: Double? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapInt32DoubleEntry = TestAllTypesProto2_MutableMapInt32DoubleEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapInt32DoubleEntry by lazy { MutableMapInt32DoubleEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry = pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry.descriptor
        }
    }

    public sealed interface MapBoolBoolEntry : pbandk.Message, Map.Entry<Boolean?, Boolean?> {
        public override val key: Boolean?
        public override val value: Boolean?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry>

        public fun copy(
            key: Boolean? = this.key,
            value: Boolean? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry> {
            @Deprecated("Use mapBoolBoolEntry { } instead")
            public operator fun invoke(
                key: Boolean? = null,
                value: Boolean? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry = TestAllTypesProto2_MapBoolBoolEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry = pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapBoolBoolEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapBoolBoolEntry : TestAllTypesProto2.MapBoolBoolEntry, pbandk.MutableMessage {
        public override var key: Boolean?
        public override var value: Boolean?

        public fun toMapBoolBoolEntry(): TestAllTypesProto2.MapBoolBoolEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry> {
            @Deprecated("Use mapBoolBoolEntry { } instead")
            public operator fun invoke(
                key: Boolean? = null,
                value: Boolean? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapBoolBoolEntry = TestAllTypesProto2_MutableMapBoolBoolEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapBoolBoolEntry by lazy { MutableMapBoolBoolEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry = pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry.descriptor
        }
    }

    public sealed interface MapStringStringEntry : pbandk.Message, Map.Entry<String?, String?> {
        public override val key: String?
        public override val value: String?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry>

        public fun copy(
            key: String? = this.key,
            value: String? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry> {
            @Deprecated("Use mapStringStringEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: String? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry = TestAllTypesProto2_MapStringStringEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapStringStringEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringStringEntry : TestAllTypesProto2.MapStringStringEntry, pbandk.MutableMessage {
        public override var key: String?
        public override var value: String?

        public fun toMapStringStringEntry(): TestAllTypesProto2.MapStringStringEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry> {
            @Deprecated("Use mapStringStringEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: String? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringStringEntry = TestAllTypesProto2_MutableMapStringStringEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringStringEntry by lazy { MutableMapStringStringEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry.descriptor
        }
    }

    public sealed interface MapStringBytesEntry : pbandk.Message, Map.Entry<String?, pbandk.ByteArr?> {
        public override val key: String?
        public override val value: pbandk.ByteArr?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry>

        public fun copy(
            key: String? = this.key,
            value: pbandk.ByteArr? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry> {
            @Deprecated("Use mapStringBytesEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.ByteArr? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry = TestAllTypesProto2_MapStringBytesEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapStringBytesEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringBytesEntry : TestAllTypesProto2.MapStringBytesEntry, pbandk.MutableMessage {
        public override var key: String?
        public override var value: pbandk.ByteArr?

        public fun toMapStringBytesEntry(): TestAllTypesProto2.MapStringBytesEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry> {
            @Deprecated("Use mapStringBytesEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.ByteArr? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringBytesEntry = TestAllTypesProto2_MutableMapStringBytesEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringBytesEntry by lazy { MutableMapStringBytesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry.descriptor
        }
    }

    public sealed interface MapStringNestedMessageEntry : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> {
        public override val key: String?
        public override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry>

        public fun copy(
            key: String? = this.key,
            value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry> {
            @Deprecated("Use mapStringNestedMessageEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry = TestAllTypesProto2_MapStringNestedMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapStringNestedMessageEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringNestedMessageEntry : TestAllTypesProto2.MapStringNestedMessageEntry, pbandk.MutableMessage {
        public override var key: String?
        public override var value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?

        public fun toMapStringNestedMessageEntry(): TestAllTypesProto2.MapStringNestedMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry> {
            @Deprecated("Use mapStringNestedMessageEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringNestedMessageEntry = TestAllTypesProto2_MutableMapStringNestedMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringNestedMessageEntry by lazy { MutableMapStringNestedMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry.descriptor
        }
    }

    public sealed interface MapStringForeignMessageEntry : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.ForeignMessageProto2?> {
        public override val key: String?
        public override val value: pbandk.conformance.pb.ForeignMessageProto2?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry>

        public fun copy(
            key: String? = this.key,
            value: pbandk.conformance.pb.ForeignMessageProto2? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry> {
            @Deprecated("Use mapStringForeignMessageEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.ForeignMessageProto2? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry = TestAllTypesProto2_MapStringForeignMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapStringForeignMessageEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringForeignMessageEntry : TestAllTypesProto2.MapStringForeignMessageEntry, pbandk.MutableMessage {
        public override var key: String?
        public override var value: pbandk.conformance.pb.ForeignMessageProto2?

        public fun toMapStringForeignMessageEntry(): TestAllTypesProto2.MapStringForeignMessageEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry> {
            @Deprecated("Use mapStringForeignMessageEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.ForeignMessageProto2? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringForeignMessageEntry = TestAllTypesProto2_MutableMapStringForeignMessageEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringForeignMessageEntry by lazy { MutableMapStringForeignMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry.descriptor
        }
    }

    public sealed interface MapStringNestedEnumEntry : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> {
        public override val key: String?
        public override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry>

        public fun copy(
            key: String? = this.key,
            value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry> {
            @Deprecated("Use mapStringNestedEnumEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry = TestAllTypesProto2_MapStringNestedEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapStringNestedEnumEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringNestedEnumEntry : TestAllTypesProto2.MapStringNestedEnumEntry, pbandk.MutableMessage {
        public override var key: String?
        public override var value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?

        public fun toMapStringNestedEnumEntry(): TestAllTypesProto2.MapStringNestedEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry> {
            @Deprecated("Use mapStringNestedEnumEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringNestedEnumEntry = TestAllTypesProto2_MutableMapStringNestedEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringNestedEnumEntry by lazy { MutableMapStringNestedEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry.descriptor
        }
    }

    public sealed interface MapStringForeignEnumEntry : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.ForeignEnumProto2?> {
        public override val key: String?
        public override val value: pbandk.conformance.pb.ForeignEnumProto2?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry>

        public fun copy(
            key: String? = this.key,
            value: pbandk.conformance.pb.ForeignEnumProto2? = this.value,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry> {
            @Deprecated("Use mapStringForeignEnumEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.ForeignEnumProto2? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry = TestAllTypesProto2_MapStringForeignEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry by lazy { pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion, hasPresence = true),
                            jsonName = "value",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MapStringForeignEnumEntry",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMapStringForeignEnumEntry : TestAllTypesProto2.MapStringForeignEnumEntry, pbandk.MutableMessage {
        public override var key: String?
        public override var value: pbandk.conformance.pb.ForeignEnumProto2?

        public fun toMapStringForeignEnumEntry(): TestAllTypesProto2.MapStringForeignEnumEntry

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry> {
            @Deprecated("Use mapStringForeignEnumEntry { } instead")
            public operator fun invoke(
                key: String? = null,
                value: pbandk.conformance.pb.ForeignEnumProto2? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMapStringForeignEnumEntry = TestAllTypesProto2_MutableMapStringForeignEnumEntry_Impl(
                key = key,
                value = value,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMapStringForeignEnumEntry by lazy { MutableMapStringForeignEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry> get() = pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry.descriptor
        }
    }

    public sealed interface Data : pbandk.Message {
        public val groupInt32: Int?
        public val groupUint32: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.Data
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data>

        public fun copy(
            groupInt32: Int? = this.groupInt32,
            groupUint32: Int? = this.groupUint32,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.Data

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.Data> {
            @Deprecated("Use data { } instead")
            public operator fun invoke(
                groupInt32: Int? = null,
                groupUint32: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.Data = TestAllTypesProto2_Data_Impl(
                groupInt32 = groupInt32,
                groupUint32 = groupUint32,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.Data by lazy { pbandk.conformance.pb.TestAllTypesProto2.Data() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.Data = pbandk.conformance.pb.TestAllTypesProto2.Data.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "group_int32",
                            number = 202,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "groupInt32",
                            value = pbandk.conformance.pb.TestAllTypesProto2.Data::groupInt32
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "group_uint32",
                            number = 203,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                            jsonName = "groupUint32",
                            value = pbandk.conformance.pb.TestAllTypesProto2.Data::groupUint32
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.Data",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.Data::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableData : TestAllTypesProto2.Data, pbandk.MutableMessage {
        public override var groupInt32: Int?
        public override var groupUint32: Int?

        public fun toData(): TestAllTypesProto2.Data

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.Data> {
            @Deprecated("Use data { } instead")
            public operator fun invoke(
                groupInt32: Int? = null,
                groupUint32: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableData = TestAllTypesProto2_MutableData_Impl(
                groupInt32 = groupInt32,
                groupUint32 = groupUint32,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableData by lazy { MutableData() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.Data = pbandk.conformance.pb.TestAllTypesProto2.Data.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data> get() = pbandk.conformance.pb.TestAllTypesProto2.Data.descriptor
        }
    }

    public sealed interface MessageSetCorrect : pbandk.ExtendableMessage {

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect>

        public fun copy(
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> {
            @Deprecated("Use messageSetCorrect { } instead")
            public operator fun invoke(
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect = TestAllTypesProto2_MessageSetCorrect_Impl(
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect by lazy { pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect, *>>(0)
                fieldsList.apply {
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrect",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMessageSetCorrect : TestAllTypesProto2.MessageSetCorrect, pbandk.MutableMessage {

        public fun toMessageSetCorrect(): TestAllTypesProto2.MessageSetCorrect

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> {
            @Deprecated("Use messageSetCorrect { } instead")
            public operator fun invoke(
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMessageSetCorrect = TestAllTypesProto2_MutableMessageSetCorrect_Impl(
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMessageSetCorrect by lazy { MutableMessageSetCorrect() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect.descriptor
        }
    }

    public sealed interface MessageSetCorrectExtension1 : pbandk.Message {
        public val str: String?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1>

        public fun copy(
            str: String? = this.str,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1> {
            @Deprecated("Use messageSetCorrectExtension1 { } instead")
            public operator fun invoke(
                str: String? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 = TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
                str = str,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 by lazy { pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1, *>>(1)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "str",
                            number = 25,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "str",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1::str
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrectExtension1",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMessageSetCorrectExtension1 : TestAllTypesProto2.MessageSetCorrectExtension1, pbandk.MutableMessage {
        public override var str: String?

        public fun toMessageSetCorrectExtension1(): TestAllTypesProto2.MessageSetCorrectExtension1

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1> {
            @Deprecated("Use messageSetCorrectExtension1 { } instead")
            public operator fun invoke(
                str: String? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMessageSetCorrectExtension1 = TestAllTypesProto2_MutableMessageSetCorrectExtension1_Impl(
                str = str,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMessageSetCorrectExtension1 by lazy { MutableMessageSetCorrectExtension1() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1> get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.descriptor
        }
    }

    public sealed interface MessageSetCorrectExtension2 : pbandk.Message {
        public val i: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2>

        public fun copy(
            i: Int? = this.i,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2> {
            @Deprecated("Use messageSetCorrectExtension2 { } instead")
            public operator fun invoke(
                i: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 = TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
                i = i,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 by lazy { pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2, *>>(1)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "i",
                            number = 9,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "i",
                            value = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2::i
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrectExtension2",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableMessageSetCorrectExtension2 : TestAllTypesProto2.MessageSetCorrectExtension2, pbandk.MutableMessage {
        public override var i: Int?

        public fun toMessageSetCorrectExtension2(): TestAllTypesProto2.MessageSetCorrectExtension2

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2> {
            @Deprecated("Use messageSetCorrectExtension2 { } instead")
            public operator fun invoke(
                i: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableMessageSetCorrectExtension2 = TestAllTypesProto2_MutableMessageSetCorrectExtension2_Impl(
                i = i,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableMessageSetCorrectExtension2 by lazy { MutableMessageSetCorrectExtension2() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2> get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.descriptor
        }
    }
}

public sealed interface MutableTestAllTypesProto2 : TestAllTypesProto2, pbandk.MutableMessage {
    public override var optionalInt32: Int?
    public override var optionalInt64: Long?
    public override var optionalUint32: Int?
    public override var optionalUint64: Long?
    public override var optionalSint32: Int?
    public override var optionalSint64: Long?
    public override var optionalFixed32: Int?
    public override var optionalFixed64: Long?
    public override var optionalSfixed32: Int?
    public override var optionalSfixed64: Long?
    public override var optionalFloat: Float?
    public override var optionalDouble: Double?
    public override var optionalBool: Boolean?
    public override var optionalString: String?
    public override var optionalBytes: pbandk.ByteArr?
    public override var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
    public override var optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2?
    public override var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?
    public override var optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2?
    public override var optionalStringPiece: String?
    public override var optionalCord: String?
    public override var recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2?
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
    public override var repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>
    public override var repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2>
    public override var repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public override var repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2>
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
    public override var packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
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
    public override var unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public override var mapInt32Int32: Map<Int?, Int?>
    public override var mapInt64Int64: Map<Long?, Long?>
    public override var mapUint32Uint32: Map<Int?, Int?>
    public override var mapUint64Uint64: Map<Long?, Long?>
    public override var mapSint32Sint32: Map<Int?, Int?>
    public override var mapSint64Sint64: Map<Long?, Long?>
    public override var mapFixed32Fixed32: Map<Int?, Int?>
    public override var mapFixed64Fixed64: Map<Long?, Long?>
    public override var mapSfixed32Sfixed32: Map<Int?, Int?>
    public override var mapSfixed64Sfixed64: Map<Long?, Long?>
    public override var mapInt32Float: Map<Int?, Float?>
    public override var mapInt32Double: Map<Int?, Double?>
    public override var mapBoolBool: Map<Boolean?, Boolean?>
    public override var mapStringString: Map<String?, String?>
    public override var mapStringBytes: Map<String?, pbandk.ByteArr?>
    public override var mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>
    public override var mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>
    public override var mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>
    public override var mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>
    public override var fieldname1: Int?
    public override var fieldName2: Int?
    public override var fieldName3: Int?
    public override var field_name4: Int?
    public override var field0name5: Int?
    public override var field0Name6: Int?
    public override var fieldName7: Int?
    public override var fieldName8: Int?
    public override var fieldName9: Int?
    public override var fieldName10: Int?
    public override var fIELDNAME11: Int?
    public override var fIELDName12: Int?
    public override var _fieldName13: Int?
    public override var _FieldName14: Int?
    public override var field_name15: Int?
    public override var field_Name16: Int?
    public override var fieldName17_: Int?
    public override var fieldName18_: Int?
    public override var oneofField: TestAllTypesProto2.OneofField<*>?

    public override var oneofUint32: Int?
    public override var oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
    public override var oneofString: String?
    public override var oneofBytes: pbandk.ByteArr?
    public override var oneofBool: Boolean?
    public override var oneofUint64: Long?
    public override var oneofFloat: Float?
    public override var oneofDouble: Double?
    public override var oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?

    public fun toTestAllTypesProto2(): TestAllTypesProto2

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2> {
        @Deprecated("Use testAllTypesProto2 { } instead")
        public operator fun invoke(
            optionalInt32: Int? = null,
            optionalInt64: Long? = null,
            optionalUint32: Int? = null,
            optionalUint64: Long? = null,
            optionalSint32: Int? = null,
            optionalSint64: Long? = null,
            optionalFixed32: Int? = null,
            optionalFixed64: Long? = null,
            optionalSfixed32: Int? = null,
            optionalSfixed64: Long? = null,
            optionalFloat: Float? = null,
            optionalDouble: Double? = null,
            optionalBool: Boolean? = null,
            optionalString: String? = null,
            optionalBytes: pbandk.ByteArr? = null,
            optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
            optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
            optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
            optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2? = null,
            optionalStringPiece: String? = null,
            optionalCord: String? = null,
            recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2? = null,
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
            repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> = emptyList(),
            repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2> = emptyList(),
            repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
            repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2> = emptyList(),
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
            packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
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
            unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
            mapInt32Int32: Map<Int?, Int?> = emptyMap(),
            mapInt64Int64: Map<Long?, Long?> = emptyMap(),
            mapUint32Uint32: Map<Int?, Int?> = emptyMap(),
            mapUint64Uint64: Map<Long?, Long?> = emptyMap(),
            mapSint32Sint32: Map<Int?, Int?> = emptyMap(),
            mapSint64Sint64: Map<Long?, Long?> = emptyMap(),
            mapFixed32Fixed32: Map<Int?, Int?> = emptyMap(),
            mapFixed64Fixed64: Map<Long?, Long?> = emptyMap(),
            mapSfixed32Sfixed32: Map<Int?, Int?> = emptyMap(),
            mapSfixed64Sfixed64: Map<Long?, Long?> = emptyMap(),
            mapInt32Float: Map<Int?, Float?> = emptyMap(),
            mapInt32Double: Map<Int?, Double?> = emptyMap(),
            mapBoolBool: Map<Boolean?, Boolean?> = emptyMap(),
            mapStringString: Map<String?, String?> = emptyMap(),
            mapStringBytes: Map<String?, pbandk.ByteArr?> = emptyMap(),
            mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> = emptyMap(),
            mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?> = emptyMap(),
            mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> = emptyMap(),
            mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?> = emptyMap(),
            fieldname1: Int? = null,
            fieldName2: Int? = null,
            fieldName3: Int? = null,
            field_name4: Int? = null,
            field0name5: Int? = null,
            field0Name6: Int? = null,
            fieldName7: Int? = null,
            fieldName8: Int? = null,
            fieldName9: Int? = null,
            fieldName10: Int? = null,
            fIELDNAME11: Int? = null,
            fIELDName12: Int? = null,
            _fieldName13: Int? = null,
            _FieldName14: Int? = null,
            field_name15: Int? = null,
            field_Name16: Int? = null,
            fieldName17_: Int? = null,
            fieldName18_: Int? = null,
            oneofField: pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableTestAllTypesProto2 = MutableTestAllTypesProto2_Impl(
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
        public val defaultInstance: MutableTestAllTypesProto2 by lazy { MutableTestAllTypesProto2() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.TestAllTypesProto2 = pbandk.conformance.pb.TestAllTypesProto2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2> get() = pbandk.conformance.pb.TestAllTypesProto2.descriptor
    }
}

public sealed interface ForeignMessageProto2 : pbandk.Message {
    public val c: Int?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ForeignMessageProto2
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessageProto2>

    public fun copy(
        c: Int? = this.c,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.ForeignMessageProto2

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ForeignMessageProto2> {
        @Deprecated("Use foreignMessageProto2 { } instead")
        public operator fun invoke(
            c: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.ForeignMessageProto2 = ForeignMessageProto2_Impl(
            c = c,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.ForeignMessageProto2 by lazy { pbandk.conformance.pb.ForeignMessageProto2() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ForeignMessageProto2 = pbandk.conformance.pb.ForeignMessageProto2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessageProto2> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.ForeignMessageProto2, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "c",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "c",
                        value = pbandk.conformance.pb.ForeignMessageProto2::c
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto2.ForeignMessageProto2",
                messageClass = pbandk.conformance.pb.ForeignMessageProto2::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableForeignMessageProto2 : ForeignMessageProto2, pbandk.MutableMessage {
    public override var c: Int?

    public fun toForeignMessageProto2(): ForeignMessageProto2

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ForeignMessageProto2> {
        @Deprecated("Use foreignMessageProto2 { } instead")
        public operator fun invoke(
            c: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableForeignMessageProto2 = MutableForeignMessageProto2_Impl(
            c = c,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableForeignMessageProto2 by lazy { MutableForeignMessageProto2() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.ForeignMessageProto2 = pbandk.conformance.pb.ForeignMessageProto2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessageProto2> get() = pbandk.conformance.pb.ForeignMessageProto2.descriptor
    }
}

public sealed interface UnknownToTestAllTypes : pbandk.Message {
    public val optionalInt32: Int?
    public val optionalString: String?
    public val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?
    public val optionalBool: Boolean?
    public val repeatedInt32: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.UnknownToTestAllTypes
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes>

    public fun copy(
        optionalInt32: Int? = this.optionalInt32,
        optionalString: String? = this.optionalString,
        nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = this.nestedMessage,
        optionalBool: Boolean? = this.optionalBool,
        repeatedInt32: List<Int> = this.repeatedInt32,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.UnknownToTestAllTypes

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.UnknownToTestAllTypes> {
        @Deprecated("Use unknownToTestAllTypes { } instead")
        public operator fun invoke(
            optionalInt32: Int? = null,
            optionalString: String? = null,
            nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
            optionalBool: Boolean? = null,
            repeatedInt32: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.UnknownToTestAllTypes = UnknownToTestAllTypes_Impl(
            optionalInt32 = optionalInt32,
            optionalString = optionalString,
            nestedMessage = nestedMessage,
            optionalBool = optionalBool,
            repeatedInt32 = repeatedInt32,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.conformance.pb.UnknownToTestAllTypes by lazy { pbandk.conformance.pb.UnknownToTestAllTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.UnknownToTestAllTypes = pbandk.conformance.pb.UnknownToTestAllTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32",
                        number = 1001,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = pbandk.conformance.pb.UnknownToTestAllTypes::optionalInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string",
                        number = 1002,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = pbandk.conformance.pb.UnknownToTestAllTypes::optionalString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nested_message",
                        number = 1003,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion),
                        jsonName = "nestedMessage",
                        value = pbandk.conformance.pb.UnknownToTestAllTypes::nestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool",
                        number = 1006,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "optionalBool",
                        value = pbandk.conformance.pb.UnknownToTestAllTypes::optionalBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32",
                        number = 1011,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "repeatedInt32",
                        value = pbandk.conformance.pb.UnknownToTestAllTypes::repeatedInt32
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto2.UnknownToTestAllTypes",
                messageClass = pbandk.conformance.pb.UnknownToTestAllTypes::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface OptionalGroup : pbandk.Message {
        public val a: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup>

        public fun copy(
            a: Int? = this.a,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup> {
            @Deprecated("Use optionalGroup { } instead")
            public operator fun invoke(
                a: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup = UnknownToTestAllTypes_OptionalGroup_Impl(
                a = a,
                unknownFields = unknownFields
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup by lazy { pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup, *>>(1)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup::a
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto2.UnknownToTestAllTypes.OptionalGroup",
                    messageClass = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableOptionalGroup : UnknownToTestAllTypes.OptionalGroup, pbandk.MutableMessage {
        public override var a: Int?

        public fun toOptionalGroup(): UnknownToTestAllTypes.OptionalGroup

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup> {
            @Deprecated("Use optionalGroup { } instead")
            public operator fun invoke(
                a: Int? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): MutableOptionalGroup = UnknownToTestAllTypes_MutableOptionalGroup_Impl(
                a = a,
                unknownFields = unknownFields.toMutableMap()
            )

            @Suppress("DEPRECATION")
            public val defaultInstance: MutableOptionalGroup by lazy { MutableOptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup> get() = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.descriptor
        }
    }
}

public sealed interface MutableUnknownToTestAllTypes : UnknownToTestAllTypes, pbandk.MutableMessage {
    public override var optionalInt32: Int?
    public override var optionalString: String?
    public override var nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?
    public override var optionalBool: Boolean?
    public override var repeatedInt32: List<Int>

    public fun toUnknownToTestAllTypes(): UnknownToTestAllTypes

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.UnknownToTestAllTypes> {
        @Deprecated("Use unknownToTestAllTypes { } instead")
        public operator fun invoke(
            optionalInt32: Int? = null,
            optionalString: String? = null,
            nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
            optionalBool: Boolean? = null,
            repeatedInt32: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableUnknownToTestAllTypes = MutableUnknownToTestAllTypes_Impl(
            optionalInt32 = optionalInt32,
            optionalString = optionalString,
            nestedMessage = nestedMessage,
            optionalBool = optionalBool,
            repeatedInt32 = repeatedInt32,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableUnknownToTestAllTypes by lazy { MutableUnknownToTestAllTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.conformance.pb.UnknownToTestAllTypes = pbandk.conformance.pb.UnknownToTestAllTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes> get() = pbandk.conformance.pb.UnknownToTestAllTypes.descriptor
    }
}

val pbandk.conformance.pb.TestAllTypesProto2.extensionInt32: Int? 
    get() = getExtension(pbandk.conformance.pb.extensionInt32)

@pbandk.Export
val extensionInt32 = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.Companion::descriptor,
    name = "extension_int32",
    number = 120,
    type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
    jsonName = "extensionInt32",
    value = pbandk.conformance.pb.TestAllTypesProto2::extensionInt32
)

public fun testAllTypesProto2(builderAction: MutableTestAllTypesProto2.() -> Unit): TestAllTypesProto2 {
    @Suppress("DEPRECATION") val builder = MutableTestAllTypesProto2()
    builder.builderAction()
    return builder.toTestAllTypesProto2()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2")
public fun TestAllTypesProto2?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2 = this ?: TestAllTypesProto2.defaultInstance

private class TestAllTypesProto2_Impl(
    override val optionalInt32: Int?,
    override val optionalInt64: Long?,
    override val optionalUint32: Int?,
    override val optionalUint64: Long?,
    override val optionalSint32: Int?,
    override val optionalSint64: Long?,
    override val optionalFixed32: Int?,
    override val optionalFixed64: Long?,
    override val optionalSfixed32: Int?,
    override val optionalSfixed64: Long?,
    override val optionalFloat: Float?,
    override val optionalDouble: Double?,
    override val optionalBool: Boolean?,
    override val optionalString: String?,
    override val optionalBytes: pbandk.ByteArr?,
    override val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
    override val optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2?,
    override val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
    override val optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2?,
    override val optionalStringPiece: String?,
    override val optionalCord: String?,
    override val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2?,
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
    override val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
    override val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2>,
    override val repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override val repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2>,
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
    override val packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
    override val unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override val mapInt32Int32: Map<Int?, Int?>,
    override val mapInt64Int64: Map<Long?, Long?>,
    override val mapUint32Uint32: Map<Int?, Int?>,
    override val mapUint64Uint64: Map<Long?, Long?>,
    override val mapSint32Sint32: Map<Int?, Int?>,
    override val mapSint64Sint64: Map<Long?, Long?>,
    override val mapFixed32Fixed32: Map<Int?, Int?>,
    override val mapFixed64Fixed64: Map<Long?, Long?>,
    override val mapSfixed32Sfixed32: Map<Int?, Int?>,
    override val mapSfixed64Sfixed64: Map<Long?, Long?>,
    override val mapInt32Float: Map<Int?, Float?>,
    override val mapInt32Double: Map<Int?, Double?>,
    override val mapBoolBool: Map<Boolean?, Boolean?>,
    override val mapStringString: Map<String?, String?>,
    override val mapStringBytes: Map<String?, pbandk.ByteArr?>,
    override val mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>,
    override val mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>,
    override val mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>,
    override val mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>,
    override val fieldname1: Int?,
    override val fieldName2: Int?,
    override val fieldName3: Int?,
    override val field_name4: Int?,
    override val field0name5: Int?,
    override val field0Name6: Int?,
    override val fieldName7: Int?,
    override val fieldName8: Int?,
    override val fieldName9: Int?,
    override val fieldName10: Int?,
    override val fIELDNAME11: Int?,
    override val fIELDName12: Int?,
    override val _fieldName13: Int?,
    override val _FieldName14: Int?,
    override val field_name15: Int?,
    override val field_Name16: Int?,
    override val fieldName17_: Int?,
    override val fieldName18_: Int?,
    override val oneofField: pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2, pbandk.GeneratedMessage<TestAllTypesProto2>() {
    override val descriptor get() = TestAllTypesProto2.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override val oneofUint32: Int?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofUint32)?.value
    override val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofNestedMessage)?.value
    override val oneofString: String?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofString)?.value
    override val oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofBytes)?.value
    override val oneofBool: Boolean?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofBool)?.value
    override val oneofUint64: Long?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofUint64)?.value
    override val oneofFloat: Float?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofFloat)?.value
    override val oneofDouble: Double?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofDouble)?.value
    override val oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofEnum)?.value

    override fun copy(
        optionalInt32: Int?,
        optionalInt64: Long?,
        optionalUint32: Int?,
        optionalUint64: Long?,
        optionalSint32: Int?,
        optionalSint64: Long?,
        optionalFixed32: Int?,
        optionalFixed64: Long?,
        optionalSfixed32: Int?,
        optionalSfixed64: Long?,
        optionalFloat: Float?,
        optionalDouble: Double?,
        optionalBool: Boolean?,
        optionalString: String?,
        optionalBytes: pbandk.ByteArr?,
        optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
        optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2?,
        optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
        optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2?,
        optionalStringPiece: String?,
        optionalCord: String?,
        recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2?,
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
        repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
        repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2>,
        repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
        repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2>,
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
        packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
        unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
        mapInt32Int32: Map<Int?, Int?>,
        mapInt64Int64: Map<Long?, Long?>,
        mapUint32Uint32: Map<Int?, Int?>,
        mapUint64Uint64: Map<Long?, Long?>,
        mapSint32Sint32: Map<Int?, Int?>,
        mapSint64Sint64: Map<Long?, Long?>,
        mapFixed32Fixed32: Map<Int?, Int?>,
        mapFixed64Fixed64: Map<Long?, Long?>,
        mapSfixed32Sfixed32: Map<Int?, Int?>,
        mapSfixed64Sfixed64: Map<Long?, Long?>,
        mapInt32Float: Map<Int?, Float?>,
        mapInt32Double: Map<Int?, Double?>,
        mapBoolBool: Map<Boolean?, Boolean?>,
        mapStringString: Map<String?, String?>,
        mapStringBytes: Map<String?, pbandk.ByteArr?>,
        mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>,
        mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>,
        mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>,
        mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>,
        fieldname1: Int?,
        fieldName2: Int?,
        fieldName3: Int?,
        field_name4: Int?,
        field0name5: Int?,
        field0Name6: Int?,
        fieldName7: Int?,
        fieldName8: Int?,
        fieldName9: Int?,
        fieldName10: Int?,
        fIELDNAME11: Int?,
        fIELDName12: Int?,
        _fieldName13: Int?,
        _FieldName14: Int?,
        field_name15: Int?,
        field_Name16: Int?,
        fieldName17_: Int?,
        fieldName18_: Int?,
        oneofField: pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_Impl(
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

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2)?.let {
        it.copy(
            optionalInt32 = other.optionalInt32 ?: optionalInt32,
            optionalInt64 = other.optionalInt64 ?: optionalInt64,
            optionalUint32 = other.optionalUint32 ?: optionalUint32,
            optionalUint64 = other.optionalUint64 ?: optionalUint64,
            optionalSint32 = other.optionalSint32 ?: optionalSint32,
            optionalSint64 = other.optionalSint64 ?: optionalSint64,
            optionalFixed32 = other.optionalFixed32 ?: optionalFixed32,
            optionalFixed64 = other.optionalFixed64 ?: optionalFixed64,
            optionalSfixed32 = other.optionalSfixed32 ?: optionalSfixed32,
            optionalSfixed64 = other.optionalSfixed64 ?: optionalSfixed64,
            optionalFloat = other.optionalFloat ?: optionalFloat,
            optionalDouble = other.optionalDouble ?: optionalDouble,
            optionalBool = other.optionalBool ?: optionalBool,
            optionalString = other.optionalString ?: optionalString,
            optionalBytes = other.optionalBytes ?: optionalBytes,
            optionalNestedMessage = optionalNestedMessage?.plus(other.optionalNestedMessage) ?: other.optionalNestedMessage,
            optionalForeignMessage = optionalForeignMessage?.plus(other.optionalForeignMessage) ?: other.optionalForeignMessage,
            optionalNestedEnum = other.optionalNestedEnum ?: optionalNestedEnum,
            optionalForeignEnum = other.optionalForeignEnum ?: optionalForeignEnum,
            optionalStringPiece = other.optionalStringPiece ?: optionalStringPiece,
            optionalCord = other.optionalCord ?: optionalCord,
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
            fieldname1 = other.fieldname1 ?: fieldname1,
            fieldName2 = other.fieldName2 ?: fieldName2,
            fieldName3 = other.fieldName3 ?: fieldName3,
            field_name4 = other.field_name4 ?: field_name4,
            field0name5 = other.field0name5 ?: field0name5,
            field0Name6 = other.field0Name6 ?: field0Name6,
            fieldName7 = other.fieldName7 ?: fieldName7,
            fieldName8 = other.fieldName8 ?: fieldName8,
            fieldName9 = other.fieldName9 ?: fieldName9,
            fieldName10 = other.fieldName10 ?: fieldName10,
            fIELDNAME11 = other.fIELDNAME11 ?: fIELDNAME11,
            fIELDName12 = other.fIELDName12 ?: fIELDName12,
            _fieldName13 = other._fieldName13 ?: _fieldName13,
            _FieldName14 = other._FieldName14 ?: _FieldName14,
            field_name15 = other.field_name15 ?: field_name15,
            field_Name16 = other.field_Name16 ?: field_Name16,
            fieldName17_ = other.fieldName17_ ?: fieldName17_,
            fieldName18_ = other.fieldName18_ ?: fieldName18_,
            oneofField = when {
                oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage && other.oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage ->
                    TestAllTypesProto2.OneofField.OneofNestedMessage((oneofField as TestAllTypesProto2.OneofField.OneofNestedMessage).value + (other.oneofField as TestAllTypesProto2.OneofField.OneofNestedMessage).value)
                else ->
                    other.oneofField ?: oneofField
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableTestAllTypesProto2_Impl(
    override var optionalInt32: Int?,
    override var optionalInt64: Long?,
    override var optionalUint32: Int?,
    override var optionalUint64: Long?,
    override var optionalSint32: Int?,
    override var optionalSint64: Long?,
    override var optionalFixed32: Int?,
    override var optionalFixed64: Long?,
    override var optionalSfixed32: Int?,
    override var optionalSfixed64: Long?,
    override var optionalFloat: Float?,
    override var optionalDouble: Double?,
    override var optionalBool: Boolean?,
    override var optionalString: String?,
    override var optionalBytes: pbandk.ByteArr?,
    override var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
    override var optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2?,
    override var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
    override var optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2?,
    override var optionalStringPiece: String?,
    override var optionalCord: String?,
    override var recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2?,
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
    override var repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
    override var repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2>,
    override var repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override var repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2>,
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
    override var packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
    override var unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override var mapInt32Int32: Map<Int?, Int?>,
    override var mapInt64Int64: Map<Long?, Long?>,
    override var mapUint32Uint32: Map<Int?, Int?>,
    override var mapUint64Uint64: Map<Long?, Long?>,
    override var mapSint32Sint32: Map<Int?, Int?>,
    override var mapSint64Sint64: Map<Long?, Long?>,
    override var mapFixed32Fixed32: Map<Int?, Int?>,
    override var mapFixed64Fixed64: Map<Long?, Long?>,
    override var mapSfixed32Sfixed32: Map<Int?, Int?>,
    override var mapSfixed64Sfixed64: Map<Long?, Long?>,
    override var mapInt32Float: Map<Int?, Float?>,
    override var mapInt32Double: Map<Int?, Double?>,
    override var mapBoolBool: Map<Boolean?, Boolean?>,
    override var mapStringString: Map<String?, String?>,
    override var mapStringBytes: Map<String?, pbandk.ByteArr?>,
    override var mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>,
    override var mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>,
    override var mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>,
    override var mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>,
    override var fieldname1: Int?,
    override var fieldName2: Int?,
    override var fieldName3: Int?,
    override var field_name4: Int?,
    override var field0name5: Int?,
    override var field0Name6: Int?,
    override var fieldName7: Int?,
    override var fieldName8: Int?,
    override var fieldName9: Int?,
    override var fieldName10: Int?,
    override var fIELDNAME11: Int?,
    override var fIELDName12: Int?,
    override var _fieldName13: Int?,
    override var _FieldName14: Int?,
    override var field_name15: Int?,
    override var field_Name16: Int?,
    override var fieldName17_: Int?,
    override var fieldName18_: Int?,
    override var oneofField: pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableTestAllTypesProto2, pbandk.MutableGeneratedMessage<MutableTestAllTypesProto2>() {
    override val descriptor get() = TestAllTypesProto2.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override var oneofUint32: Int?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofUint32)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofUint32(it) } }
    override var oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofNestedMessage)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofNestedMessage(it) } }
    override var oneofString: String?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofString)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofString(it) } }
    override var oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofBytes)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofBytes(it) } }
    override var oneofBool: Boolean?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofBool)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofBool(it) } }
    override var oneofUint64: Long?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofUint64)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofUint64(it) } }
    override var oneofFloat: Float?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofFloat)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofFloat(it) } }
    override var oneofDouble: Double?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofDouble)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofDouble(it) } }
    override var oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?
        get() = (oneofField as? pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofEnum)?.value
        set(value) { oneofField = value?.let { pbandk.conformance.pb.TestAllTypesProto2.OneofField.OneofEnum(it) } }

    override fun copy(
        optionalInt32: Int?,
        optionalInt64: Long?,
        optionalUint32: Int?,
        optionalUint64: Long?,
        optionalSint32: Int?,
        optionalSint64: Long?,
        optionalFixed32: Int?,
        optionalFixed64: Long?,
        optionalSfixed32: Int?,
        optionalSfixed64: Long?,
        optionalFloat: Float?,
        optionalDouble: Double?,
        optionalBool: Boolean?,
        optionalString: String?,
        optionalBytes: pbandk.ByteArr?,
        optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
        optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2?,
        optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
        optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2?,
        optionalStringPiece: String?,
        optionalCord: String?,
        recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2?,
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
        repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
        repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2>,
        repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
        repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2>,
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
        packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
        unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
        mapInt32Int32: Map<Int?, Int?>,
        mapInt64Int64: Map<Long?, Long?>,
        mapUint32Uint32: Map<Int?, Int?>,
        mapUint64Uint64: Map<Long?, Long?>,
        mapSint32Sint32: Map<Int?, Int?>,
        mapSint64Sint64: Map<Long?, Long?>,
        mapFixed32Fixed32: Map<Int?, Int?>,
        mapFixed64Fixed64: Map<Long?, Long?>,
        mapSfixed32Sfixed32: Map<Int?, Int?>,
        mapSfixed64Sfixed64: Map<Long?, Long?>,
        mapInt32Float: Map<Int?, Float?>,
        mapInt32Double: Map<Int?, Double?>,
        mapBoolBool: Map<Boolean?, Boolean?>,
        mapStringString: Map<String?, String?>,
        mapStringBytes: Map<String?, pbandk.ByteArr?>,
        mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>,
        mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>,
        mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>,
        mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>,
        fieldname1: Int?,
        fieldName2: Int?,
        fieldName3: Int?,
        field_name4: Int?,
        field0name5: Int?,
        field0Name6: Int?,
        fieldName7: Int?,
        fieldName8: Int?,
        fieldName9: Int?,
        fieldName10: Int?,
        fIELDNAME11: Int?,
        fIELDName12: Int?,
        _fieldName13: Int?,
        _FieldName14: Int?,
        field_name15: Int?,
        field_Name16: Int?,
        fieldName17_: Int?,
        fieldName18_: Int?,
        oneofField: pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_Impl(
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

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2)?.let {
        it.copy(
            optionalInt32 = other.optionalInt32 ?: optionalInt32,
            optionalInt64 = other.optionalInt64 ?: optionalInt64,
            optionalUint32 = other.optionalUint32 ?: optionalUint32,
            optionalUint64 = other.optionalUint64 ?: optionalUint64,
            optionalSint32 = other.optionalSint32 ?: optionalSint32,
            optionalSint64 = other.optionalSint64 ?: optionalSint64,
            optionalFixed32 = other.optionalFixed32 ?: optionalFixed32,
            optionalFixed64 = other.optionalFixed64 ?: optionalFixed64,
            optionalSfixed32 = other.optionalSfixed32 ?: optionalSfixed32,
            optionalSfixed64 = other.optionalSfixed64 ?: optionalSfixed64,
            optionalFloat = other.optionalFloat ?: optionalFloat,
            optionalDouble = other.optionalDouble ?: optionalDouble,
            optionalBool = other.optionalBool ?: optionalBool,
            optionalString = other.optionalString ?: optionalString,
            optionalBytes = other.optionalBytes ?: optionalBytes,
            optionalNestedMessage = optionalNestedMessage?.plus(other.optionalNestedMessage) ?: other.optionalNestedMessage,
            optionalForeignMessage = optionalForeignMessage?.plus(other.optionalForeignMessage) ?: other.optionalForeignMessage,
            optionalNestedEnum = other.optionalNestedEnum ?: optionalNestedEnum,
            optionalForeignEnum = other.optionalForeignEnum ?: optionalForeignEnum,
            optionalStringPiece = other.optionalStringPiece ?: optionalStringPiece,
            optionalCord = other.optionalCord ?: optionalCord,
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
            fieldname1 = other.fieldname1 ?: fieldname1,
            fieldName2 = other.fieldName2 ?: fieldName2,
            fieldName3 = other.fieldName3 ?: fieldName3,
            field_name4 = other.field_name4 ?: field_name4,
            field0name5 = other.field0name5 ?: field0name5,
            field0Name6 = other.field0Name6 ?: field0Name6,
            fieldName7 = other.fieldName7 ?: fieldName7,
            fieldName8 = other.fieldName8 ?: fieldName8,
            fieldName9 = other.fieldName9 ?: fieldName9,
            fieldName10 = other.fieldName10 ?: fieldName10,
            fIELDNAME11 = other.fIELDNAME11 ?: fIELDNAME11,
            fIELDName12 = other.fIELDName12 ?: fIELDName12,
            _fieldName13 = other._fieldName13 ?: _fieldName13,
            _FieldName14 = other._FieldName14 ?: _FieldName14,
            field_name15 = other.field_name15 ?: field_name15,
            field_Name16 = other.field_Name16 ?: field_Name16,
            fieldName17_ = other.fieldName17_ ?: fieldName17_,
            fieldName18_ = other.fieldName18_ ?: fieldName18_,
            oneofField = when {
                oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage && other.oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage ->
                    TestAllTypesProto2.OneofField.OneofNestedMessage((oneofField as TestAllTypesProto2.OneofField.OneofNestedMessage).value + (other.oneofField as TestAllTypesProto2.OneofField.OneofNestedMessage).value)
                else ->
                    other.oneofField ?: oneofField
            },
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toTestAllTypesProto2() = TestAllTypesProto2_Impl(
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
private fun TestAllTypesProto2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2 {
    var optionalInt32: Int? = null
    var optionalInt64: Long? = null
    var optionalUint32: Int? = null
    var optionalUint64: Long? = null
    var optionalSint32: Int? = null
    var optionalSint64: Long? = null
    var optionalFixed32: Int? = null
    var optionalFixed64: Long? = null
    var optionalSfixed32: Int? = null
    var optionalSfixed64: Long? = null
    var optionalFloat: Float? = null
    var optionalDouble: Double? = null
    var optionalBool: Boolean? = null
    var optionalString: String? = null
    var optionalBytes: pbandk.ByteArr? = null
    var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null
    var optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = null
    var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null
    var optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2? = null
    var optionalStringPiece: String? = null
    var optionalCord: String? = null
    var recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2? = null
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
    var repeatedNestedMessage: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>? = null
    var repeatedForeignMessage: pbandk.ListWithSize.Builder<pbandk.conformance.pb.ForeignMessageProto2>? = null
    var repeatedNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>? = null
    var repeatedForeignEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.ForeignEnumProto2>? = null
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
    var packedNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>? = null
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
    var unpackedNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>? = null
    var mapInt32Int32: pbandk.MessageMap.Builder<Int?, Int?>? = null
    var mapInt64Int64: pbandk.MessageMap.Builder<Long?, Long?>? = null
    var mapUint32Uint32: pbandk.MessageMap.Builder<Int?, Int?>? = null
    var mapUint64Uint64: pbandk.MessageMap.Builder<Long?, Long?>? = null
    var mapSint32Sint32: pbandk.MessageMap.Builder<Int?, Int?>? = null
    var mapSint64Sint64: pbandk.MessageMap.Builder<Long?, Long?>? = null
    var mapFixed32Fixed32: pbandk.MessageMap.Builder<Int?, Int?>? = null
    var mapFixed64Fixed64: pbandk.MessageMap.Builder<Long?, Long?>? = null
    var mapSfixed32Sfixed32: pbandk.MessageMap.Builder<Int?, Int?>? = null
    var mapSfixed64Sfixed64: pbandk.MessageMap.Builder<Long?, Long?>? = null
    var mapInt32Float: pbandk.MessageMap.Builder<Int?, Float?>? = null
    var mapInt32Double: pbandk.MessageMap.Builder<Int?, Double?>? = null
    var mapBoolBool: pbandk.MessageMap.Builder<Boolean?, Boolean?>? = null
    var mapStringString: pbandk.MessageMap.Builder<String?, String?>? = null
    var mapStringBytes: pbandk.MessageMap.Builder<String?, pbandk.ByteArr?>? = null
    var mapStringNestedMessage: pbandk.MessageMap.Builder<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>? = null
    var mapStringForeignMessage: pbandk.MessageMap.Builder<String?, pbandk.conformance.pb.ForeignMessageProto2?>? = null
    var mapStringNestedEnum: pbandk.MessageMap.Builder<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>? = null
    var mapStringForeignEnum: pbandk.MessageMap.Builder<String?, pbandk.conformance.pb.ForeignEnumProto2?>? = null
    var fieldname1: Int? = null
    var fieldName2: Int? = null
    var fieldName3: Int? = null
    var field_name4: Int? = null
    var field0name5: Int? = null
    var field0Name6: Int? = null
    var fieldName7: Int? = null
    var fieldName8: Int? = null
    var fieldName9: Int? = null
    var fieldName10: Int? = null
    var fIELDNAME11: Int? = null
    var fIELDName12: Int? = null
    var _fieldName13: Int? = null
    var _FieldName14: Int? = null
    var field_name15: Int? = null
    var field_Name16: Int? = null
    var fieldName17_: Int? = null
    var fieldName18_: Int? = null
    var oneofField: TestAllTypesProto2.OneofField<*>? = null

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
            18 -> optionalNestedMessage = _fieldValue as pbandk.conformance.pb.TestAllTypesProto2.NestedMessage
            19 -> optionalForeignMessage = _fieldValue as pbandk.conformance.pb.ForeignMessageProto2
            21 -> optionalNestedEnum = _fieldValue as pbandk.conformance.pb.TestAllTypesProto2.NestedEnum
            22 -> optionalForeignEnum = _fieldValue as pbandk.conformance.pb.ForeignEnumProto2
            24 -> optionalStringPiece = _fieldValue as String
            25 -> optionalCord = _fieldValue as String
            27 -> recursiveMessage = _fieldValue as pbandk.conformance.pb.TestAllTypesProto2
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
            48 -> repeatedNestedMessage = (repeatedNestedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> }
            49 -> repeatedForeignMessage = (repeatedForeignMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.ForeignMessageProto2> }
            51 -> repeatedNestedEnum = (repeatedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> }
            52 -> repeatedForeignEnum = (repeatedForeignEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.ForeignEnumProto2> }
            54 -> repeatedStringPiece = (repeatedStringPiece ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            55 -> repeatedCord = (repeatedCord ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            56 -> mapInt32Int32 = (mapInt32Int32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Int?>> }
            57 -> mapInt64Int64 = (mapInt64Int64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long?, Long?>> }
            58 -> mapUint32Uint32 = (mapUint32Uint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Int?>> }
            59 -> mapUint64Uint64 = (mapUint64Uint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long?, Long?>> }
            60 -> mapSint32Sint32 = (mapSint32Sint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Int?>> }
            61 -> mapSint64Sint64 = (mapSint64Sint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long?, Long?>> }
            62 -> mapFixed32Fixed32 = (mapFixed32Fixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Int?>> }
            63 -> mapFixed64Fixed64 = (mapFixed64Fixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long?, Long?>> }
            64 -> mapSfixed32Sfixed32 = (mapSfixed32Sfixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Int?>> }
            65 -> mapSfixed64Sfixed64 = (mapSfixed64Sfixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long?, Long?>> }
            66 -> mapInt32Float = (mapInt32Float ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Float?>> }
            67 -> mapInt32Double = (mapInt32Double ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int?, Double?>> }
            68 -> mapBoolBool = (mapBoolBool ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Boolean?, Boolean?>> }
            69 -> mapStringString = (mapStringString ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, String?>> }
            70 -> mapStringBytes = (mapStringBytes ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, pbandk.ByteArr?>> }
            71 -> mapStringNestedMessage = (mapStringNestedMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>> }
            72 -> mapStringForeignMessage = (mapStringForeignMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, pbandk.conformance.pb.ForeignMessageProto2?>> }
            73 -> mapStringNestedEnum = (mapStringNestedEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>> }
            74 -> mapStringForeignEnum = (mapStringForeignEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, pbandk.conformance.pb.ForeignEnumProto2?>> }
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
            88 -> packedNestedEnum = (packedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> }
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
            102 -> unpackedNestedEnum = (unpackedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> }
            111 -> oneofField = TestAllTypesProto2.OneofField.OneofUint32(_fieldValue as Int)
            112 -> oneofField = TestAllTypesProto2.OneofField.OneofNestedMessage(_fieldValue as pbandk.conformance.pb.TestAllTypesProto2.NestedMessage)
            113 -> oneofField = TestAllTypesProto2.OneofField.OneofString(_fieldValue as String)
            114 -> oneofField = TestAllTypesProto2.OneofField.OneofBytes(_fieldValue as pbandk.ByteArr)
            115 -> oneofField = TestAllTypesProto2.OneofField.OneofBool(_fieldValue as Boolean)
            116 -> oneofField = TestAllTypesProto2.OneofField.OneofUint64(_fieldValue as Long)
            117 -> oneofField = TestAllTypesProto2.OneofField.OneofFloat(_fieldValue as Float)
            118 -> oneofField = TestAllTypesProto2.OneofField.OneofDouble(_fieldValue as Double)
            119 -> oneofField = TestAllTypesProto2.OneofField.OneofEnum(_fieldValue as pbandk.conformance.pb.TestAllTypesProto2.NestedEnum)
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
    return TestAllTypesProto2(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
        optionalSint32, optionalSint64, optionalFixed32, optionalFixed64,
        optionalSfixed32, optionalSfixed64, optionalFloat, optionalDouble,
        optionalBool, optionalString, optionalBytes, optionalNestedMessage,
        optionalForeignMessage, optionalNestedEnum, optionalForeignEnum, optionalStringPiece,
        optionalCord, recursiveMessage, pbandk.ListWithSize.Builder.fixed(repeatedInt32), pbandk.ListWithSize.Builder.fixed(repeatedInt64),
        pbandk.ListWithSize.Builder.fixed(repeatedUint32), pbandk.ListWithSize.Builder.fixed(repeatedUint64), pbandk.ListWithSize.Builder.fixed(repeatedSint32), pbandk.ListWithSize.Builder.fixed(repeatedSint64),
        pbandk.ListWithSize.Builder.fixed(repeatedFixed32), pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedSfixed32), pbandk.ListWithSize.Builder.fixed(repeatedSfixed64),
        pbandk.ListWithSize.Builder.fixed(repeatedFloat), pbandk.ListWithSize.Builder.fixed(repeatedDouble), pbandk.ListWithSize.Builder.fixed(repeatedBool), pbandk.ListWithSize.Builder.fixed(repeatedString),
        pbandk.ListWithSize.Builder.fixed(repeatedBytes), pbandk.ListWithSize.Builder.fixed(repeatedNestedMessage), pbandk.ListWithSize.Builder.fixed(repeatedForeignMessage), pbandk.ListWithSize.Builder.fixed(repeatedNestedEnum),
        pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord), pbandk.ListWithSize.Builder.fixed(packedInt32),
        pbandk.ListWithSize.Builder.fixed(packedInt64), pbandk.ListWithSize.Builder.fixed(packedUint32), pbandk.ListWithSize.Builder.fixed(packedUint64), pbandk.ListWithSize.Builder.fixed(packedSint32),
        pbandk.ListWithSize.Builder.fixed(packedSint64), pbandk.ListWithSize.Builder.fixed(packedFixed32), pbandk.ListWithSize.Builder.fixed(packedFixed64), pbandk.ListWithSize.Builder.fixed(packedSfixed32),
        pbandk.ListWithSize.Builder.fixed(packedSfixed64), pbandk.ListWithSize.Builder.fixed(packedFloat), pbandk.ListWithSize.Builder.fixed(packedDouble), pbandk.ListWithSize.Builder.fixed(packedBool),
        pbandk.ListWithSize.Builder.fixed(packedNestedEnum), pbandk.ListWithSize.Builder.fixed(unpackedInt32), pbandk.ListWithSize.Builder.fixed(unpackedInt64), pbandk.ListWithSize.Builder.fixed(unpackedUint32),
        pbandk.ListWithSize.Builder.fixed(unpackedUint64), pbandk.ListWithSize.Builder.fixed(unpackedSint32), pbandk.ListWithSize.Builder.fixed(unpackedSint64), pbandk.ListWithSize.Builder.fixed(unpackedFixed32),
        pbandk.ListWithSize.Builder.fixed(unpackedFixed64), pbandk.ListWithSize.Builder.fixed(unpackedSfixed32), pbandk.ListWithSize.Builder.fixed(unpackedSfixed64), pbandk.ListWithSize.Builder.fixed(unpackedFloat),
        pbandk.ListWithSize.Builder.fixed(unpackedDouble), pbandk.ListWithSize.Builder.fixed(unpackedBool), pbandk.ListWithSize.Builder.fixed(unpackedNestedEnum), pbandk.MessageMap.Builder.fixed(mapInt32Int32),
        pbandk.MessageMap.Builder.fixed(mapInt64Int64), pbandk.MessageMap.Builder.fixed(mapUint32Uint32), pbandk.MessageMap.Builder.fixed(mapUint64Uint64), pbandk.MessageMap.Builder.fixed(mapSint32Sint32),
        pbandk.MessageMap.Builder.fixed(mapSint64Sint64), pbandk.MessageMap.Builder.fixed(mapFixed32Fixed32), pbandk.MessageMap.Builder.fixed(mapFixed64Fixed64), pbandk.MessageMap.Builder.fixed(mapSfixed32Sfixed32),
        pbandk.MessageMap.Builder.fixed(mapSfixed64Sfixed64), pbandk.MessageMap.Builder.fixed(mapInt32Float), pbandk.MessageMap.Builder.fixed(mapInt32Double), pbandk.MessageMap.Builder.fixed(mapBoolBool),
        pbandk.MessageMap.Builder.fixed(mapStringString), pbandk.MessageMap.Builder.fixed(mapStringBytes), pbandk.MessageMap.Builder.fixed(mapStringNestedMessage), pbandk.MessageMap.Builder.fixed(mapStringForeignMessage),
        pbandk.MessageMap.Builder.fixed(mapStringNestedEnum), pbandk.MessageMap.Builder.fixed(mapStringForeignEnum), fieldname1, fieldName2,
        fieldName3, field_name4, field0name5, field0Name6,
        fieldName7, fieldName8, fieldName9, fieldName10,
        fIELDNAME11, fIELDName12, _fieldName13, _FieldName14,
        field_name15, field_Name16, fieldName17_, fieldName18_,
        oneofField, unknownFields)
}

public fun TestAllTypesProto2.Companion.nestedMessage(builderAction: TestAllTypesProto2.MutableNestedMessage.() -> Unit): TestAllTypesProto2.NestedMessage {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableNestedMessage()
    builder.builderAction()
    return builder.toNestedMessage()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2NestedMessage")
public fun TestAllTypesProto2.NestedMessage?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage = this ?: TestAllTypesProto2.NestedMessage.defaultInstance

private class TestAllTypesProto2_NestedMessage_Impl(
    override val a: Int?,
    override val corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.NestedMessage, pbandk.GeneratedMessage<TestAllTypesProto2.NestedMessage>() {
    override val descriptor get() = TestAllTypesProto2.NestedMessage.descriptor

    override fun copy(
        a: Int?,
        corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.NestedMessage)?.let {
        it.copy(
            a = other.a ?: a,
            corecursive = corecursive?.plus(other.corecursive) ?: other.corecursive,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableNestedMessage_Impl(
    override var a: Int?,
    override var corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableNestedMessage, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableNestedMessage>() {
    override val descriptor get() = TestAllTypesProto2.NestedMessage.descriptor

    override fun copy(
        a: Int?,
        corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.NestedMessage)?.let {
        it.copy(
            a = other.a ?: a,
            corecursive = corecursive?.plus(other.corecursive) ?: other.corecursive,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toNestedMessage() = TestAllTypesProto2_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.NestedMessage {
    var a: Int? = null
    var corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
            2 -> corecursive = _fieldValue as pbandk.conformance.pb.TestAllTypesProto2
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.NestedMessage(a, corecursive, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapInt32Int32Entry(builderAction: TestAllTypesProto2.MutableMapInt32Int32Entry.() -> Unit): TestAllTypesProto2.MapInt32Int32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapInt32Int32Entry()
    builder.builderAction()
    return builder.toMapInt32Int32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapInt32Int32Entry")
public fun TestAllTypesProto2.MapInt32Int32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry = this ?: TestAllTypesProto2.MapInt32Int32Entry.defaultInstance

private class TestAllTypesProto2_MapInt32Int32Entry_Impl(
    override val key: Int?,
    override val value: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapInt32Int32Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapInt32Int32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt32Int32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt32Int32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt32Int32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapInt32Int32Entry_Impl(
    override var key: Int?,
    override var value: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapInt32Int32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapInt32Int32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt32Int32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt32Int32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt32Int32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt32Int32Entry() = TestAllTypesProto2_MapInt32Int32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapInt32Int32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapInt32Int32Entry {
    var key: Int? = null
    var value: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapInt32Int32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapInt64Int64Entry(builderAction: TestAllTypesProto2.MutableMapInt64Int64Entry.() -> Unit): TestAllTypesProto2.MapInt64Int64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapInt64Int64Entry()
    builder.builderAction()
    return builder.toMapInt64Int64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapInt64Int64Entry")
public fun TestAllTypesProto2.MapInt64Int64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry = this ?: TestAllTypesProto2.MapInt64Int64Entry.defaultInstance

private class TestAllTypesProto2_MapInt64Int64Entry_Impl(
    override val key: Long?,
    override val value: Long?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapInt64Int64Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapInt64Int64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt64Int64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt64Int64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt64Int64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapInt64Int64Entry_Impl(
    override var key: Long?,
    override var value: Long?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapInt64Int64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapInt64Int64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt64Int64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt64Int64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt64Int64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt64Int64Entry() = TestAllTypesProto2_MapInt64Int64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapInt64Int64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapInt64Int64Entry {
    var key: Long? = null
    var value: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapInt64Int64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapUint32Uint32Entry(builderAction: TestAllTypesProto2.MutableMapUint32Uint32Entry.() -> Unit): TestAllTypesProto2.MapUint32Uint32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapUint32Uint32Entry()
    builder.builderAction()
    return builder.toMapUint32Uint32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapUint32Uint32Entry")
public fun TestAllTypesProto2.MapUint32Uint32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry = this ?: TestAllTypesProto2.MapUint32Uint32Entry.defaultInstance

private class TestAllTypesProto2_MapUint32Uint32Entry_Impl(
    override val key: Int?,
    override val value: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapUint32Uint32Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapUint32Uint32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapUint32Uint32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapUint32Uint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapUint32Uint32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapUint32Uint32Entry_Impl(
    override var key: Int?,
    override var value: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapUint32Uint32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapUint32Uint32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapUint32Uint32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapUint32Uint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapUint32Uint32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapUint32Uint32Entry() = TestAllTypesProto2_MapUint32Uint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapUint32Uint32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapUint32Uint32Entry {
    var key: Int? = null
    var value: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapUint32Uint32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapUint64Uint64Entry(builderAction: TestAllTypesProto2.MutableMapUint64Uint64Entry.() -> Unit): TestAllTypesProto2.MapUint64Uint64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapUint64Uint64Entry()
    builder.builderAction()
    return builder.toMapUint64Uint64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapUint64Uint64Entry")
public fun TestAllTypesProto2.MapUint64Uint64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry = this ?: TestAllTypesProto2.MapUint64Uint64Entry.defaultInstance

private class TestAllTypesProto2_MapUint64Uint64Entry_Impl(
    override val key: Long?,
    override val value: Long?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapUint64Uint64Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapUint64Uint64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapUint64Uint64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapUint64Uint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapUint64Uint64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapUint64Uint64Entry_Impl(
    override var key: Long?,
    override var value: Long?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapUint64Uint64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapUint64Uint64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapUint64Uint64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapUint64Uint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapUint64Uint64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapUint64Uint64Entry() = TestAllTypesProto2_MapUint64Uint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapUint64Uint64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapUint64Uint64Entry {
    var key: Long? = null
    var value: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapUint64Uint64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapSint32Sint32Entry(builderAction: TestAllTypesProto2.MutableMapSint32Sint32Entry.() -> Unit): TestAllTypesProto2.MapSint32Sint32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapSint32Sint32Entry()
    builder.builderAction()
    return builder.toMapSint32Sint32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapSint32Sint32Entry")
public fun TestAllTypesProto2.MapSint32Sint32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry = this ?: TestAllTypesProto2.MapSint32Sint32Entry.defaultInstance

private class TestAllTypesProto2_MapSint32Sint32Entry_Impl(
    override val key: Int?,
    override val value: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapSint32Sint32Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapSint32Sint32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSint32Sint32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSint32Sint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSint32Sint32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapSint32Sint32Entry_Impl(
    override var key: Int?,
    override var value: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapSint32Sint32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapSint32Sint32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSint32Sint32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSint32Sint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSint32Sint32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSint32Sint32Entry() = TestAllTypesProto2_MapSint32Sint32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapSint32Sint32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapSint32Sint32Entry {
    var key: Int? = null
    var value: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapSint32Sint32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapSint64Sint64Entry(builderAction: TestAllTypesProto2.MutableMapSint64Sint64Entry.() -> Unit): TestAllTypesProto2.MapSint64Sint64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapSint64Sint64Entry()
    builder.builderAction()
    return builder.toMapSint64Sint64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapSint64Sint64Entry")
public fun TestAllTypesProto2.MapSint64Sint64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry = this ?: TestAllTypesProto2.MapSint64Sint64Entry.defaultInstance

private class TestAllTypesProto2_MapSint64Sint64Entry_Impl(
    override val key: Long?,
    override val value: Long?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapSint64Sint64Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapSint64Sint64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSint64Sint64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSint64Sint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSint64Sint64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapSint64Sint64Entry_Impl(
    override var key: Long?,
    override var value: Long?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapSint64Sint64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapSint64Sint64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSint64Sint64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSint64Sint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSint64Sint64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSint64Sint64Entry() = TestAllTypesProto2_MapSint64Sint64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapSint64Sint64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapSint64Sint64Entry {
    var key: Long? = null
    var value: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapSint64Sint64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapFixed32Fixed32Entry(builderAction: TestAllTypesProto2.MutableMapFixed32Fixed32Entry.() -> Unit): TestAllTypesProto2.MapFixed32Fixed32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapFixed32Fixed32Entry()
    builder.builderAction()
    return builder.toMapFixed32Fixed32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapFixed32Fixed32Entry")
public fun TestAllTypesProto2.MapFixed32Fixed32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry = this ?: TestAllTypesProto2.MapFixed32Fixed32Entry.defaultInstance

private class TestAllTypesProto2_MapFixed32Fixed32Entry_Impl(
    override val key: Int?,
    override val value: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapFixed32Fixed32Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapFixed32Fixed32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapFixed32Fixed32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapFixed32Fixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapFixed32Fixed32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapFixed32Fixed32Entry_Impl(
    override var key: Int?,
    override var value: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapFixed32Fixed32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapFixed32Fixed32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapFixed32Fixed32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapFixed32Fixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapFixed32Fixed32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapFixed32Fixed32Entry() = TestAllTypesProto2_MapFixed32Fixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapFixed32Fixed32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapFixed32Fixed32Entry {
    var key: Int? = null
    var value: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapFixed32Fixed32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapFixed64Fixed64Entry(builderAction: TestAllTypesProto2.MutableMapFixed64Fixed64Entry.() -> Unit): TestAllTypesProto2.MapFixed64Fixed64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapFixed64Fixed64Entry()
    builder.builderAction()
    return builder.toMapFixed64Fixed64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapFixed64Fixed64Entry")
public fun TestAllTypesProto2.MapFixed64Fixed64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry = this ?: TestAllTypesProto2.MapFixed64Fixed64Entry.defaultInstance

private class TestAllTypesProto2_MapFixed64Fixed64Entry_Impl(
    override val key: Long?,
    override val value: Long?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapFixed64Fixed64Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapFixed64Fixed64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapFixed64Fixed64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapFixed64Fixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapFixed64Fixed64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapFixed64Fixed64Entry_Impl(
    override var key: Long?,
    override var value: Long?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapFixed64Fixed64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapFixed64Fixed64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapFixed64Fixed64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapFixed64Fixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapFixed64Fixed64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapFixed64Fixed64Entry() = TestAllTypesProto2_MapFixed64Fixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapFixed64Fixed64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapFixed64Fixed64Entry {
    var key: Long? = null
    var value: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapFixed64Fixed64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapSfixed32Sfixed32Entry(builderAction: TestAllTypesProto2.MutableMapSfixed32Sfixed32Entry.() -> Unit): TestAllTypesProto2.MapSfixed32Sfixed32Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapSfixed32Sfixed32Entry()
    builder.builderAction()
    return builder.toMapSfixed32Sfixed32Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapSfixed32Sfixed32Entry")
public fun TestAllTypesProto2.MapSfixed32Sfixed32Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry = this ?: TestAllTypesProto2.MapSfixed32Sfixed32Entry.defaultInstance

private class TestAllTypesProto2_MapSfixed32Sfixed32Entry_Impl(
    override val key: Int?,
    override val value: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapSfixed32Sfixed32Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapSfixed32Sfixed32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSfixed32Sfixed32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSfixed32Sfixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSfixed32Sfixed32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapSfixed32Sfixed32Entry_Impl(
    override var key: Int?,
    override var value: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapSfixed32Sfixed32Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapSfixed32Sfixed32Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSfixed32Sfixed32Entry.descriptor

    override fun copy(
        key: Int?,
        value: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSfixed32Sfixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSfixed32Sfixed32Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSfixed32Sfixed32Entry() = TestAllTypesProto2_MapSfixed32Sfixed32Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapSfixed32Sfixed32Entry {
    var key: Int? = null
    var value: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapSfixed32Sfixed32Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapSfixed64Sfixed64Entry(builderAction: TestAllTypesProto2.MutableMapSfixed64Sfixed64Entry.() -> Unit): TestAllTypesProto2.MapSfixed64Sfixed64Entry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapSfixed64Sfixed64Entry()
    builder.builderAction()
    return builder.toMapSfixed64Sfixed64Entry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapSfixed64Sfixed64Entry")
public fun TestAllTypesProto2.MapSfixed64Sfixed64Entry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry = this ?: TestAllTypesProto2.MapSfixed64Sfixed64Entry.defaultInstance

private class TestAllTypesProto2_MapSfixed64Sfixed64Entry_Impl(
    override val key: Long?,
    override val value: Long?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapSfixed64Sfixed64Entry, pbandk.GeneratedMessage<TestAllTypesProto2.MapSfixed64Sfixed64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSfixed64Sfixed64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSfixed64Sfixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSfixed64Sfixed64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapSfixed64Sfixed64Entry_Impl(
    override var key: Long?,
    override var value: Long?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapSfixed64Sfixed64Entry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapSfixed64Sfixed64Entry>() {
    override val descriptor get() = TestAllTypesProto2.MapSfixed64Sfixed64Entry.descriptor

    override fun copy(
        key: Long?,
        value: Long?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapSfixed64Sfixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapSfixed64Sfixed64Entry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapSfixed64Sfixed64Entry() = TestAllTypesProto2_MapSfixed64Sfixed64Entry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapSfixed64Sfixed64Entry {
    var key: Long? = null
    var value: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapSfixed64Sfixed64Entry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapInt32FloatEntry(builderAction: TestAllTypesProto2.MutableMapInt32FloatEntry.() -> Unit): TestAllTypesProto2.MapInt32FloatEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapInt32FloatEntry()
    builder.builderAction()
    return builder.toMapInt32FloatEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapInt32FloatEntry")
public fun TestAllTypesProto2.MapInt32FloatEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry = this ?: TestAllTypesProto2.MapInt32FloatEntry.defaultInstance

private class TestAllTypesProto2_MapInt32FloatEntry_Impl(
    override val key: Int?,
    override val value: Float?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapInt32FloatEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapInt32FloatEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt32FloatEntry.descriptor

    override fun copy(
        key: Int?,
        value: Float?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt32FloatEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt32FloatEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapInt32FloatEntry_Impl(
    override var key: Int?,
    override var value: Float?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapInt32FloatEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapInt32FloatEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt32FloatEntry.descriptor

    override fun copy(
        key: Int?,
        value: Float?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt32FloatEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt32FloatEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt32FloatEntry() = TestAllTypesProto2_MapInt32FloatEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapInt32FloatEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapInt32FloatEntry {
    var key: Int? = null
    var value: Float? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Float
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapInt32FloatEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapInt32DoubleEntry(builderAction: TestAllTypesProto2.MutableMapInt32DoubleEntry.() -> Unit): TestAllTypesProto2.MapInt32DoubleEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapInt32DoubleEntry()
    builder.builderAction()
    return builder.toMapInt32DoubleEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapInt32DoubleEntry")
public fun TestAllTypesProto2.MapInt32DoubleEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry = this ?: TestAllTypesProto2.MapInt32DoubleEntry.defaultInstance

private class TestAllTypesProto2_MapInt32DoubleEntry_Impl(
    override val key: Int?,
    override val value: Double?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapInt32DoubleEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapInt32DoubleEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt32DoubleEntry.descriptor

    override fun copy(
        key: Int?,
        value: Double?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt32DoubleEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt32DoubleEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapInt32DoubleEntry_Impl(
    override var key: Int?,
    override var value: Double?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapInt32DoubleEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapInt32DoubleEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapInt32DoubleEntry.descriptor

    override fun copy(
        key: Int?,
        value: Double?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapInt32DoubleEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapInt32DoubleEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapInt32DoubleEntry() = TestAllTypesProto2_MapInt32DoubleEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapInt32DoubleEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapInt32DoubleEntry {
    var key: Int? = null
    var value: Double? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Double
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapInt32DoubleEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapBoolBoolEntry(builderAction: TestAllTypesProto2.MutableMapBoolBoolEntry.() -> Unit): TestAllTypesProto2.MapBoolBoolEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapBoolBoolEntry()
    builder.builderAction()
    return builder.toMapBoolBoolEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapBoolBoolEntry")
public fun TestAllTypesProto2.MapBoolBoolEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry = this ?: TestAllTypesProto2.MapBoolBoolEntry.defaultInstance

private class TestAllTypesProto2_MapBoolBoolEntry_Impl(
    override val key: Boolean?,
    override val value: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapBoolBoolEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapBoolBoolEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapBoolBoolEntry.descriptor

    override fun copy(
        key: Boolean?,
        value: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapBoolBoolEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapBoolBoolEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapBoolBoolEntry_Impl(
    override var key: Boolean?,
    override var value: Boolean?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapBoolBoolEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapBoolBoolEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapBoolBoolEntry.descriptor

    override fun copy(
        key: Boolean?,
        value: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapBoolBoolEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapBoolBoolEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapBoolBoolEntry() = TestAllTypesProto2_MapBoolBoolEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapBoolBoolEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapBoolBoolEntry {
    var key: Boolean? = null
    var value: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Boolean
            2 -> value = _fieldValue as Boolean
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapBoolBoolEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapStringStringEntry(builderAction: TestAllTypesProto2.MutableMapStringStringEntry.() -> Unit): TestAllTypesProto2.MapStringStringEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapStringStringEntry()
    builder.builderAction()
    return builder.toMapStringStringEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapStringStringEntry")
public fun TestAllTypesProto2.MapStringStringEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry = this ?: TestAllTypesProto2.MapStringStringEntry.defaultInstance

private class TestAllTypesProto2_MapStringStringEntry_Impl(
    override val key: String?,
    override val value: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapStringStringEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapStringStringEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringStringEntry.descriptor

    override fun copy(
        key: String?,
        value: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringStringEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringStringEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapStringStringEntry_Impl(
    override var key: String?,
    override var value: String?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapStringStringEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapStringStringEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringStringEntry.descriptor

    override fun copy(
        key: String?,
        value: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringStringEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringStringEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringStringEntry() = TestAllTypesProto2_MapStringStringEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapStringStringEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapStringStringEntry {
    var key: String? = null
    var value: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapStringStringEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapStringBytesEntry(builderAction: TestAllTypesProto2.MutableMapStringBytesEntry.() -> Unit): TestAllTypesProto2.MapStringBytesEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapStringBytesEntry()
    builder.builderAction()
    return builder.toMapStringBytesEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapStringBytesEntry")
public fun TestAllTypesProto2.MapStringBytesEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry = this ?: TestAllTypesProto2.MapStringBytesEntry.defaultInstance

private class TestAllTypesProto2_MapStringBytesEntry_Impl(
    override val key: String?,
    override val value: pbandk.ByteArr?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapStringBytesEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapStringBytesEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringBytesEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.ByteArr?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringBytesEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringBytesEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapStringBytesEntry_Impl(
    override var key: String?,
    override var value: pbandk.ByteArr?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapStringBytesEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapStringBytesEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringBytesEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.ByteArr?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringBytesEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringBytesEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringBytesEntry() = TestAllTypesProto2_MapStringBytesEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapStringBytesEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapStringBytesEntry {
    var key: String? = null
    var value: pbandk.ByteArr? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapStringBytesEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapStringNestedMessageEntry(builderAction: TestAllTypesProto2.MutableMapStringNestedMessageEntry.() -> Unit): TestAllTypesProto2.MapStringNestedMessageEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapStringNestedMessageEntry()
    builder.builderAction()
    return builder.toMapStringNestedMessageEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapStringNestedMessageEntry")
public fun TestAllTypesProto2.MapStringNestedMessageEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry = this ?: TestAllTypesProto2.MapStringNestedMessageEntry.defaultInstance

private class TestAllTypesProto2_MapStringNestedMessageEntry_Impl(
    override val key: String?,
    override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapStringNestedMessageEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapStringNestedMessageEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringNestedMessageEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringNestedMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringNestedMessageEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapStringNestedMessageEntry_Impl(
    override var key: String?,
    override var value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapStringNestedMessageEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapStringNestedMessageEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringNestedMessageEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringNestedMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringNestedMessageEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringNestedMessageEntry() = TestAllTypesProto2_MapStringNestedMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapStringNestedMessageEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapStringNestedMessageEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.TestAllTypesProto2.NestedMessage
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapStringNestedMessageEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapStringForeignMessageEntry(builderAction: TestAllTypesProto2.MutableMapStringForeignMessageEntry.() -> Unit): TestAllTypesProto2.MapStringForeignMessageEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapStringForeignMessageEntry()
    builder.builderAction()
    return builder.toMapStringForeignMessageEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapStringForeignMessageEntry")
public fun TestAllTypesProto2.MapStringForeignMessageEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry = this ?: TestAllTypesProto2.MapStringForeignMessageEntry.defaultInstance

private class TestAllTypesProto2_MapStringForeignMessageEntry_Impl(
    override val key: String?,
    override val value: pbandk.conformance.pb.ForeignMessageProto2?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapStringForeignMessageEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapStringForeignMessageEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringForeignMessageEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.ForeignMessageProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringForeignMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringForeignMessageEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapStringForeignMessageEntry_Impl(
    override var key: String?,
    override var value: pbandk.conformance.pb.ForeignMessageProto2?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapStringForeignMessageEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapStringForeignMessageEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringForeignMessageEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.ForeignMessageProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringForeignMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringForeignMessageEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = value?.plus(other.value) ?: other.value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringForeignMessageEntry() = TestAllTypesProto2_MapStringForeignMessageEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapStringForeignMessageEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapStringForeignMessageEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.ForeignMessageProto2? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.ForeignMessageProto2
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapStringForeignMessageEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapStringNestedEnumEntry(builderAction: TestAllTypesProto2.MutableMapStringNestedEnumEntry.() -> Unit): TestAllTypesProto2.MapStringNestedEnumEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapStringNestedEnumEntry()
    builder.builderAction()
    return builder.toMapStringNestedEnumEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapStringNestedEnumEntry")
public fun TestAllTypesProto2.MapStringNestedEnumEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry = this ?: TestAllTypesProto2.MapStringNestedEnumEntry.defaultInstance

private class TestAllTypesProto2_MapStringNestedEnumEntry_Impl(
    override val key: String?,
    override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapStringNestedEnumEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapStringNestedEnumEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringNestedEnumEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringNestedEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringNestedEnumEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapStringNestedEnumEntry_Impl(
    override var key: String?,
    override var value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapStringNestedEnumEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapStringNestedEnumEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringNestedEnumEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringNestedEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringNestedEnumEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringNestedEnumEntry() = TestAllTypesProto2_MapStringNestedEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapStringNestedEnumEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapStringNestedEnumEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.TestAllTypesProto2.NestedEnum
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapStringNestedEnumEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.mapStringForeignEnumEntry(builderAction: TestAllTypesProto2.MutableMapStringForeignEnumEntry.() -> Unit): TestAllTypesProto2.MapStringForeignEnumEntry {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMapStringForeignEnumEntry()
    builder.builderAction()
    return builder.toMapStringForeignEnumEntry()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MapStringForeignEnumEntry")
public fun TestAllTypesProto2.MapStringForeignEnumEntry?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry = this ?: TestAllTypesProto2.MapStringForeignEnumEntry.defaultInstance

private class TestAllTypesProto2_MapStringForeignEnumEntry_Impl(
    override val key: String?,
    override val value: pbandk.conformance.pb.ForeignEnumProto2?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MapStringForeignEnumEntry, pbandk.GeneratedMessage<TestAllTypesProto2.MapStringForeignEnumEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringForeignEnumEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.ForeignEnumProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringForeignEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringForeignEnumEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMapStringForeignEnumEntry_Impl(
    override var key: String?,
    override var value: pbandk.conformance.pb.ForeignEnumProto2?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMapStringForeignEnumEntry, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMapStringForeignEnumEntry>() {
    override val descriptor get() = TestAllTypesProto2.MapStringForeignEnumEntry.descriptor

    override fun copy(
        key: String?,
        value: pbandk.conformance.pb.ForeignEnumProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MapStringForeignEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MapStringForeignEnumEntry)?.let {
        it.copy(
            key = other.key ?: key,
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMapStringForeignEnumEntry() = TestAllTypesProto2_MapStringForeignEnumEntry_Impl(
        key = key,
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MapStringForeignEnumEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MapStringForeignEnumEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.ForeignEnumProto2? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.conformance.pb.ForeignEnumProto2
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MapStringForeignEnumEntry(key, value, unknownFields)
}

public fun TestAllTypesProto2.Companion.data(builderAction: TestAllTypesProto2.MutableData.() -> Unit): TestAllTypesProto2.Data {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableData()
    builder.builderAction()
    return builder.toData()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2Data")
public fun TestAllTypesProto2.Data?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.Data = this ?: TestAllTypesProto2.Data.defaultInstance

private class TestAllTypesProto2_Data_Impl(
    override val groupInt32: Int?,
    override val groupUint32: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.Data, pbandk.GeneratedMessage<TestAllTypesProto2.Data>() {
    override val descriptor get() = TestAllTypesProto2.Data.descriptor

    override fun copy(
        groupInt32: Int?,
        groupUint32: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_Data_Impl(
        groupInt32 = groupInt32,
        groupUint32 = groupUint32,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.Data)?.let {
        it.copy(
            groupInt32 = other.groupInt32 ?: groupInt32,
            groupUint32 = other.groupUint32 ?: groupUint32,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableData_Impl(
    override var groupInt32: Int?,
    override var groupUint32: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableData, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableData>() {
    override val descriptor get() = TestAllTypesProto2.Data.descriptor

    override fun copy(
        groupInt32: Int?,
        groupUint32: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_Data_Impl(
        groupInt32 = groupInt32,
        groupUint32 = groupUint32,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.Data)?.let {
        it.copy(
            groupInt32 = other.groupInt32 ?: groupInt32,
            groupUint32 = other.groupUint32 ?: groupUint32,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toData() = TestAllTypesProto2_Data_Impl(
        groupInt32 = groupInt32,
        groupUint32 = groupUint32,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.Data.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.Data {
    var groupInt32: Int? = null
    var groupUint32: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            202 -> groupInt32 = _fieldValue as Int
            203 -> groupUint32 = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.Data(groupInt32, groupUint32, unknownFields)
}

public fun TestAllTypesProto2.Companion.messageSetCorrect(builderAction: TestAllTypesProto2.MutableMessageSetCorrect.() -> Unit): TestAllTypesProto2.MessageSetCorrect {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMessageSetCorrect()
    builder.builderAction()
    return builder.toMessageSetCorrect()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MessageSetCorrect")
public fun TestAllTypesProto2.MessageSetCorrect?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect = this ?: TestAllTypesProto2.MessageSetCorrect.defaultInstance

private class TestAllTypesProto2_MessageSetCorrect_Impl(
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MessageSetCorrect, pbandk.GeneratedMessage<TestAllTypesProto2.MessageSetCorrect>() {
    override val descriptor get() = TestAllTypesProto2.MessageSetCorrect.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MessageSetCorrect_Impl(
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MessageSetCorrect)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMessageSetCorrect_Impl(
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMessageSetCorrect, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMessageSetCorrect>() {
    override val descriptor get() = TestAllTypesProto2.MessageSetCorrect.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MessageSetCorrect_Impl(
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MessageSetCorrect)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMessageSetCorrect() = TestAllTypesProto2_MessageSetCorrect_Impl(
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MessageSetCorrect.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MessageSetCorrect {

    val unknownFields = u.readMessage(this) { _, _ -> }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MessageSetCorrect(unknownFields)
}

public fun TestAllTypesProto2.Companion.messageSetCorrectExtension1(builderAction: TestAllTypesProto2.MutableMessageSetCorrectExtension1.() -> Unit): TestAllTypesProto2.MessageSetCorrectExtension1 {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMessageSetCorrectExtension1()
    builder.builderAction()
    return builder.toMessageSetCorrectExtension1()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MessageSetCorrectExtension1")
public fun TestAllTypesProto2.MessageSetCorrectExtension1?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 = this ?: TestAllTypesProto2.MessageSetCorrectExtension1.defaultInstance

private class TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
    override val str: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MessageSetCorrectExtension1, pbandk.GeneratedMessage<TestAllTypesProto2.MessageSetCorrectExtension1>() {
    override val descriptor get() = TestAllTypesProto2.MessageSetCorrectExtension1.descriptor

    override fun copy(
        str: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
        str = str,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MessageSetCorrectExtension1)?.let {
        it.copy(
            str = other.str ?: str,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMessageSetCorrectExtension1_Impl(
    override var str: String?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMessageSetCorrectExtension1, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMessageSetCorrectExtension1>() {
    override val descriptor get() = TestAllTypesProto2.MessageSetCorrectExtension1.descriptor

    override fun copy(
        str: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
        str = str,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MessageSetCorrectExtension1)?.let {
        it.copy(
            str = other.str ?: str,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMessageSetCorrectExtension1() = TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
        str = str,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MessageSetCorrectExtension1.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MessageSetCorrectExtension1 {
    var str: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            25 -> str = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MessageSetCorrectExtension1(str, unknownFields)
}

public fun TestAllTypesProto2.Companion.messageSetCorrectExtension2(builderAction: TestAllTypesProto2.MutableMessageSetCorrectExtension2.() -> Unit): TestAllTypesProto2.MessageSetCorrectExtension2 {
    @Suppress("DEPRECATION") val builder = TestAllTypesProto2.MutableMessageSetCorrectExtension2()
    builder.builderAction()
    return builder.toMessageSetCorrectExtension2()
}

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MessageSetCorrectExtension2")
public fun TestAllTypesProto2.MessageSetCorrectExtension2?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 = this ?: TestAllTypesProto2.MessageSetCorrectExtension2.defaultInstance

private class TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
    override val i: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MessageSetCorrectExtension2, pbandk.GeneratedMessage<TestAllTypesProto2.MessageSetCorrectExtension2>() {
    override val descriptor get() = TestAllTypesProto2.MessageSetCorrectExtension2.descriptor

    override fun copy(
        i: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
        i = i,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MessageSetCorrectExtension2)?.let {
        it.copy(
            i = other.i ?: i,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class TestAllTypesProto2_MutableMessageSetCorrectExtension2_Impl(
    override var i: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : TestAllTypesProto2.MutableMessageSetCorrectExtension2, pbandk.MutableGeneratedMessage<TestAllTypesProto2.MutableMessageSetCorrectExtension2>() {
    override val descriptor get() = TestAllTypesProto2.MessageSetCorrectExtension2.descriptor

    override fun copy(
        i: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
        i = i,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? TestAllTypesProto2.MessageSetCorrectExtension2)?.let {
        it.copy(
            i = other.i ?: i,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMessageSetCorrectExtension2() = TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
        i = i,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MessageSetCorrectExtension2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MessageSetCorrectExtension2 {
    var i: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            9 -> i = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return TestAllTypesProto2.MessageSetCorrectExtension2(i, unknownFields)
}

public fun foreignMessageProto2(builderAction: MutableForeignMessageProto2.() -> Unit): ForeignMessageProto2 {
    @Suppress("DEPRECATION") val builder = MutableForeignMessageProto2()
    builder.builderAction()
    return builder.toForeignMessageProto2()
}

@pbandk.Export
@pbandk.JsName("orDefaultForForeignMessageProto2")
public fun ForeignMessageProto2?.orDefault(): pbandk.conformance.pb.ForeignMessageProto2 = this ?: ForeignMessageProto2.defaultInstance

private class ForeignMessageProto2_Impl(
    override val c: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ForeignMessageProto2, pbandk.GeneratedMessage<ForeignMessageProto2>() {
    override val descriptor get() = ForeignMessageProto2.descriptor

    override fun copy(
        c: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ForeignMessageProto2_Impl(
        c = c,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ForeignMessageProto2)?.let {
        it.copy(
            c = other.c ?: c,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableForeignMessageProto2_Impl(
    override var c: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableForeignMessageProto2, pbandk.MutableGeneratedMessage<MutableForeignMessageProto2>() {
    override val descriptor get() = ForeignMessageProto2.descriptor

    override fun copy(
        c: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = ForeignMessageProto2_Impl(
        c = c,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? ForeignMessageProto2)?.let {
        it.copy(
            c = other.c ?: c,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toForeignMessageProto2() = ForeignMessageProto2_Impl(
        c = c,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun ForeignMessageProto2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForeignMessageProto2 {
    var c: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return ForeignMessageProto2(c, unknownFields)
}

public fun unknownToTestAllTypes(builderAction: MutableUnknownToTestAllTypes.() -> Unit): UnknownToTestAllTypes {
    @Suppress("DEPRECATION") val builder = MutableUnknownToTestAllTypes()
    builder.builderAction()
    return builder.toUnknownToTestAllTypes()
}

@pbandk.Export
@pbandk.JsName("orDefaultForUnknownToTestAllTypes")
public fun UnknownToTestAllTypes?.orDefault(): pbandk.conformance.pb.UnknownToTestAllTypes = this ?: UnknownToTestAllTypes.defaultInstance

private class UnknownToTestAllTypes_Impl(
    override val optionalInt32: Int?,
    override val optionalString: String?,
    override val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
    override val optionalBool: Boolean?,
    override val repeatedInt32: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UnknownToTestAllTypes, pbandk.GeneratedMessage<UnknownToTestAllTypes>() {
    override val descriptor get() = UnknownToTestAllTypes.descriptor

    override fun copy(
        optionalInt32: Int?,
        optionalString: String?,
        nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
        optionalBool: Boolean?,
        repeatedInt32: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UnknownToTestAllTypes_Impl(
        optionalInt32 = optionalInt32,
        optionalString = optionalString,
        nestedMessage = nestedMessage,
        optionalBool = optionalBool,
        repeatedInt32 = repeatedInt32,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UnknownToTestAllTypes)?.let {
        it.copy(
            optionalInt32 = other.optionalInt32 ?: optionalInt32,
            optionalString = other.optionalString ?: optionalString,
            nestedMessage = nestedMessage?.plus(other.nestedMessage) ?: other.nestedMessage,
            optionalBool = other.optionalBool ?: optionalBool,
            repeatedInt32 = repeatedInt32 + other.repeatedInt32,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableUnknownToTestAllTypes_Impl(
    override var optionalInt32: Int?,
    override var optionalString: String?,
    override var nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
    override var optionalBool: Boolean?,
    override var repeatedInt32: List<Int>,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableUnknownToTestAllTypes, pbandk.MutableGeneratedMessage<MutableUnknownToTestAllTypes>() {
    override val descriptor get() = UnknownToTestAllTypes.descriptor

    override fun copy(
        optionalInt32: Int?,
        optionalString: String?,
        nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
        optionalBool: Boolean?,
        repeatedInt32: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UnknownToTestAllTypes_Impl(
        optionalInt32 = optionalInt32,
        optionalString = optionalString,
        nestedMessage = nestedMessage,
        optionalBool = optionalBool,
        repeatedInt32 = repeatedInt32,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UnknownToTestAllTypes)?.let {
        it.copy(
            optionalInt32 = other.optionalInt32 ?: optionalInt32,
            optionalString = other.optionalString ?: optionalString,
            nestedMessage = nestedMessage?.plus(other.nestedMessage) ?: other.nestedMessage,
            optionalBool = other.optionalBool ?: optionalBool,
            repeatedInt32 = repeatedInt32 + other.repeatedInt32,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toUnknownToTestAllTypes() = UnknownToTestAllTypes_Impl(
        optionalInt32 = optionalInt32,
        optionalString = optionalString,
        nestedMessage = nestedMessage,
        optionalBool = optionalBool,
        repeatedInt32 = repeatedInt32,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun UnknownToTestAllTypes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UnknownToTestAllTypes {
    var optionalInt32: Int? = null
    var optionalString: String? = null
    var nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null
    var optionalBool: Boolean? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1001 -> optionalInt32 = _fieldValue as Int
            1002 -> optionalString = _fieldValue as String
            1003 -> nestedMessage = _fieldValue as pbandk.conformance.pb.ForeignMessageProto2
            1006 -> optionalBool = _fieldValue as Boolean
            1011 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    @Suppress("DEPRECATION")
    return UnknownToTestAllTypes(optionalInt32, optionalString, nestedMessage, optionalBool,
        pbandk.ListWithSize.Builder.fixed(repeatedInt32), unknownFields)
}

public fun UnknownToTestAllTypes.Companion.optionalGroup(builderAction: UnknownToTestAllTypes.MutableOptionalGroup.() -> Unit): UnknownToTestAllTypes.OptionalGroup {
    @Suppress("DEPRECATION") val builder = UnknownToTestAllTypes.MutableOptionalGroup()
    builder.builderAction()
    return builder.toOptionalGroup()
}

@pbandk.Export
@pbandk.JsName("orDefaultForUnknownToTestAllTypesOptionalGroup")
public fun UnknownToTestAllTypes.OptionalGroup?.orDefault(): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup = this ?: UnknownToTestAllTypes.OptionalGroup.defaultInstance

private class UnknownToTestAllTypes_OptionalGroup_Impl(
    override val a: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UnknownToTestAllTypes.OptionalGroup, pbandk.GeneratedMessage<UnknownToTestAllTypes.OptionalGroup>() {
    override val descriptor get() = UnknownToTestAllTypes.OptionalGroup.descriptor

    override fun copy(
        a: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UnknownToTestAllTypes_OptionalGroup_Impl(
        a = a,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UnknownToTestAllTypes.OptionalGroup)?.let {
        it.copy(
            a = other.a ?: a,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class UnknownToTestAllTypes_MutableOptionalGroup_Impl(
    override var a: Int?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : UnknownToTestAllTypes.MutableOptionalGroup, pbandk.MutableGeneratedMessage<UnknownToTestAllTypes.MutableOptionalGroup>() {
    override val descriptor get() = UnknownToTestAllTypes.OptionalGroup.descriptor

    override fun copy(
        a: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UnknownToTestAllTypes_OptionalGroup_Impl(
        a = a,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UnknownToTestAllTypes.OptionalGroup)?.let {
        it.copy(
            a = other.a ?: a,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toOptionalGroup() = UnknownToTestAllTypes_OptionalGroup_Impl(
        a = a,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun UnknownToTestAllTypes.OptionalGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UnknownToTestAllTypes.OptionalGroup {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
        }
    }
    @Suppress("DEPRECATION")
    return UnknownToTestAllTypes.OptionalGroup(a, unknownFields)
}

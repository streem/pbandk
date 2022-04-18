@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

@pbandk.Export
public sealed class ForeignEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is pbandk.conformance.pb.ForeignEnum && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "ForeignEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object FOREIGN_FOO : ForeignEnum(0, "FOREIGN_FOO")
    public object FOREIGN_BAR : ForeignEnum(1, "FOREIGN_BAR")
    public object FOREIGN_BAZ : ForeignEnum(2, "FOREIGN_BAZ")
    public class UNRECOGNIZED(value: Int) : ForeignEnum(value)

    public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.ForeignEnum> {
        public val values: List<ForeignEnum> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int): pbandk.conformance.pb.ForeignEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): pbandk.conformance.pb.ForeignEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnum with name: $name")
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

    /**
     * The [MutableTestAllTypesProto3] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto3.() -> Unit): pbandk.conformance.pb.TestAllTypesProto3

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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
        public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3 by lazy { pbandk.conformance.pb.TestAllTypesProto3 {} }

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
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt32,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalInt32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "optionalInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt64,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalInt64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "optionalUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint32,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalUint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "optionalUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint64,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalUint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                        jsonName = "optionalSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSint32,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalSint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                        jsonName = "optionalSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSint64,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalSint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                        jsonName = "optionalFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFixed32,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalFixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                        jsonName = "optionalFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFixed64,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalFixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                        jsonName = "optionalSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSfixed32,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalSfixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                        jsonName = "optionalSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalSfixed64,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalSfixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "optionalFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFloat,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalFloat,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "optionalDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalDouble,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalDouble,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "optionalBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBool,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalBool,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalString,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalString,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "optionalBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBytes,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalBytes,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_message",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalNestedMessage,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalNestedMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_message",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion),
                        jsonName = "optionalForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalForeignMessage,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalForeignMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_enum",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion),
                        jsonName = "optionalNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalNestedEnum,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalNestedEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion),
                        jsonName = "optionalForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalForeignEnum,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalForeignEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_aliased_enum",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.Companion),
                        jsonName = "optionalAliasedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalAliasedEnum,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalAliasedEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_piece",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalStringPiece",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalStringPiece,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalStringPiece,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_cord",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalCord",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalCord,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalCord,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "recursive_message",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.Companion),
                        jsonName = "recursiveMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::recursiveMessage,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::recursiveMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "repeatedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "repeatedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "repeatedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "repeatedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint32",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "repeatedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint64",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "repeatedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed32",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "repeatedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed64",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "repeatedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed32",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "repeatedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSfixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed64",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "repeatedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedSfixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "repeatedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFloat,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "repeatedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedDouble,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool",
                        number = 43,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "repeatedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBool,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedString,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "repeatedBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBytes,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_message",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)),
                        jsonName = "repeatedNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedNestedMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_message",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion)),
                        jsonName = "repeatedForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedForeignMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_enum",
                        number = 51,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                        jsonName = "repeatedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedNestedEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_enum",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion), packed = true),
                        jsonName = "repeatedForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedForeignEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_piece",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedStringPiece",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedStringPiece,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_cord",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedCord",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedCord,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_int32",
                        number = 56,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "mapInt32Int32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt32Int32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int64_int64",
                        number = 57,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "mapInt64Int64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt64Int64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint32_uint32",
                        number = 58,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "mapUint32Uint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapUint32Uint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint64_uint64",
                        number = 59,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "mapUint64Uint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapUint64Uint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint32_sint32",
                        number = 60,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "mapSint32Sint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSint32Sint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint64_sint64",
                        number = 61,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "mapSint64Sint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSint64Sint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed32_fixed32",
                        number = 62,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "mapFixed32Fixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapFixed32Fixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed64_fixed64",
                        number = 63,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "mapFixed64Fixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapFixed64Fixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed32_sfixed32",
                        number = 64,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "mapSfixed32Sfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSfixed32Sfixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed64_sfixed64",
                        number = 65,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "mapSfixed64Sfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapSfixed64Sfixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_float",
                        number = 66,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Float>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "mapInt32Float",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt32Float,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_double",
                        number = 67,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Double>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "mapInt32Double",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapInt32Double,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_bool_bool",
                        number = 68,
                        type = pbandk.FieldDescriptor.Type.Map<Boolean, Boolean>(keyType = pbandk.FieldDescriptor.Type.Primitive.Bool(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "mapBoolBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapBoolBool,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_string",
                        number = 69,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "mapStringString",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringString,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_bytes",
                        number = 70,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.ByteArr>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "mapStringBytes",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringBytes,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_message",
                        number = 71,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)),
                        jsonName = "mapStringNestedMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringNestedMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_message",
                        number = 72,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.ForeignMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessage.Companion)),
                        jsonName = "mapStringForeignMessage",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringForeignMessage,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_enum",
                        number = 73,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)),
                        jsonName = "mapStringNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringNestedEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_enum",
                        number = 74,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.conformance.pb.ForeignEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnum.Companion)),
                        jsonName = "mapStringForeignEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::mapStringForeignEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int32",
                        number = 75,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "packedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedInt32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int64",
                        number = 76,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "packedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedInt64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint32",
                        number = 77,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "packedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedUint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint64",
                        number = 78,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "packedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedUint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint32",
                        number = 79,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "packedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint64",
                        number = 80,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "packedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed32",
                        number = 81,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "packedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedFixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed64",
                        number = 82,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "packedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedFixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed32",
                        number = 83,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "packedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSfixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed64",
                        number = 84,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "packedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedSfixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_float",
                        number = 85,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "packedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedFloat,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_double",
                        number = 86,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "packedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedDouble,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_bool",
                        number = 87,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "packedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedBool,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_nested_enum",
                        number = 88,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                        jsonName = "packedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::packedNestedEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int32",
                        number = 89,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "unpackedInt32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedInt32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int64",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "unpackedInt64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedInt64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint32",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "unpackedUint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedUint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint64",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "unpackedUint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedUint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint32",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "unpackedSint32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSint32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint64",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "unpackedSint64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSint64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed32",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "unpackedFixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedFixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed64",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "unpackedFixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedFixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed32",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "unpackedSfixed32",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSfixed32,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed64",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "unpackedSfixed64",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedSfixed64,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_float",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "unpackedFloat",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedFloat,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_double",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "unpackedDouble",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedDouble,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_bool",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "unpackedBool",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedBool,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_nested_enum",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)),
                        jsonName = "unpackedNestedEnum",
                        value = pbandk.conformance.pb.TestAllTypesProto3::unpackedNestedEnum,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofUint32,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofUint32,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofNestedMessage,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofNestedMessage,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofString,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofString,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofBytes,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofBytes,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofBool,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofBool,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofUint64,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofUint64,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofFloat,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofFloat,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofDouble,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofDouble,
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
                        value = pbandk.conformance.pb.TestAllTypesProto3::oneofEnum,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::oneofEnum,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool_wrapper",
                        number = 201,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion),
                        jsonName = "optionalBoolWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBoolWrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalBoolWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32_wrapper",
                        number = 202,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion),
                        jsonName = "optionalInt32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt32Wrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalInt32Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64_wrapper",
                        number = 203,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion),
                        jsonName = "optionalInt64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalInt64Wrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalInt64Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32_wrapper",
                        number = 204,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion),
                        jsonName = "optionalUint32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint32Wrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalUint32Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64_wrapper",
                        number = 205,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion),
                        jsonName = "optionalUint64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalUint64Wrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalUint64Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float_wrapper",
                        number = 206,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion),
                        jsonName = "optionalFloatWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFloatWrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalFloatWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double_wrapper",
                        number = 207,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion),
                        jsonName = "optionalDoubleWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalDoubleWrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalDoubleWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_wrapper",
                        number = 208,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "optionalStringWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalStringWrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalStringWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes_wrapper",
                        number = 209,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion),
                        jsonName = "optionalBytesWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalBytesWrapper,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalBytesWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool_wrapper",
                        number = 211,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion)),
                        jsonName = "repeatedBoolWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBoolWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32_wrapper",
                        number = 212,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion)),
                        jsonName = "repeatedInt32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt32Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64_wrapper",
                        number = 213,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion)),
                        jsonName = "repeatedInt64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedInt64Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32_wrapper",
                        number = 214,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion)),
                        jsonName = "repeatedUint32Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint32Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64_wrapper",
                        number = 215,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "repeatedUint64Wrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedUint64Wrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float_wrapper",
                        number = 216,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion)),
                        jsonName = "repeatedFloatWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFloatWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double_wrapper",
                        number = 217,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion)),
                        jsonName = "repeatedDoubleWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedDoubleWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_wrapper",
                        number = 218,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion)),
                        jsonName = "repeatedStringWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedStringWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes_wrapper",
                        number = 219,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion)),
                        jsonName = "repeatedBytesWrapper",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedBytesWrapper,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_duration",
                        number = 301,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "optionalDuration",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalDuration,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalDuration,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_timestamp",
                        number = 302,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "optionalTimestamp",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalTimestamp,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalTimestamp,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_field_mask",
                        number = 303,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion),
                        jsonName = "optionalFieldMask",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalFieldMask,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalFieldMask,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_struct",
                        number = 304,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "optionalStruct",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalStruct,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalStruct,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_any",
                        number = 305,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion),
                        jsonName = "optionalAny",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalAny,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalAny,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_value",
                        number = 306,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                        jsonName = "optionalValue",
                        value = pbandk.conformance.pb.TestAllTypesProto3::optionalValue,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::optionalValue,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_duration",
                        number = 311,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "repeatedDuration",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedDuration,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_timestamp",
                        number = 312,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Timestamp>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion)),
                        jsonName = "repeatedTimestamp",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedTimestamp,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fieldmask",
                        number = 313,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldMask>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion)),
                        jsonName = "repeatedFieldmask",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedFieldmask,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_any",
                        number = 315,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Any>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion)),
                        jsonName = "repeatedAny",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedAny,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_value",
                        number = 316,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "repeatedValue",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedValue,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_list_value",
                        number = 317,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.ListValue>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ListValue.Companion)),
                        jsonName = "repeatedListValue",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedListValue,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_struct",
                        number = 324,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Struct>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion)),
                        jsonName = "repeatedStruct",
                        value = pbandk.conformance.pb.TestAllTypesProto3::repeatedStruct,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldname1",
                        number = 401,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldname1",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldname1,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldname1,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name2",
                        number = 402,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName2",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName2,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName2,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "_field_name3",
                        number = 403,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName3",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName3,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName3,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name4_",
                        number = 404,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName4",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field_name4,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::field_name4,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field0name5",
                        number = 405,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "field0name5",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field0name5,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::field0name5,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_0_name6",
                        number = 406,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "field0Name6",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field0Name6,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::field0Name6,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldName7",
                        number = 407,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName7",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName7,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName7,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FieldName8",
                        number = 408,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName8",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName8,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName8,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_Name9",
                        number = 409,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName9",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName9,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName9,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_Name10",
                        number = 410,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName10",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName10,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName10,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_NAME11",
                        number = 411,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FIELDNAME11",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fIELDNAME11,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fIELDNAME11,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_name12",
                        number = 412,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FIELDName12",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fIELDName12,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fIELDName12,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__field_name13",
                        number = 413,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName13",
                        value = pbandk.conformance.pb.TestAllTypesProto3::_fieldName13,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::_fieldName13,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__Field_name14",
                        number = 414,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName14",
                        value = pbandk.conformance.pb.TestAllTypesProto3::_FieldName14,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::_FieldName14,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name15",
                        number = 415,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName15",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field_name15,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::field_name15,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__Name16",
                        number = 416,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName16",
                        value = pbandk.conformance.pb.TestAllTypesProto3::field_Name16,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::field_Name16,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name17__",
                        number = 417,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName17",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName17_,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName17_,
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_name18__",
                        number = 418,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName18",
                        value = pbandk.conformance.pb.TestAllTypesProto3::fieldName18_,
                        mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto3::fieldName18_,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto3.TestAllTypesProto3",
                messageClass = pbandk.conformance.pb.TestAllTypesProto3::class,
                messageCompanion = this,
                builder = ::TestAllTypesProto3,
                fields = fieldsList
            )
        }
    }

    public sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.conformance.pb.TestAllTypesProto3.NestedEnum && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "TestAllTypesProto3.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object FOO : NestedEnum(0, "FOO")
        public object BAR : NestedEnum(1, "BAR")
        public object BAZ : NestedEnum(2, "BAZ")
        public object NEG : NestedEnum(-1, "NEG")
        public class UNRECOGNIZED(value: Int) : NestedEnum(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> {
            public val values: List<TestAllTypesProto3.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int): pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    public sealed class AliasedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "TestAllTypesProto3.AliasedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object ALIAS_FOO : AliasedEnum(0, "ALIAS_FOO")
        public object ALIAS_BAR : AliasedEnum(1, "ALIAS_BAR")
        public object ALIAS_BAZ : AliasedEnum(2, "ALIAS_BAZ")
        public object QUX : AliasedEnum(2, "QUX")
        public object QUX_ : AliasedEnum(2, "qux")
        public object B_AZ : AliasedEnum(2, "bAz")
        public class UNRECOGNIZED(value: Int) : AliasedEnum(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum> {
            public val values: List<TestAllTypesProto3.AliasedEnum> by lazy { listOf(ALIAS_FOO, ALIAS_BAR, ALIAS_BAZ, QUX, QUX_, B_AZ) }
            override fun fromValue(value: Int): pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No AliasedEnum with name: $name")
        }
    }

    public sealed interface NestedMessage : pbandk.Message {
        public val a: Int
        public val corecursive: pbandk.conformance.pb.TestAllTypesProto3?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>

        /**
         * The [MutableNestedMessage] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage.() -> Unit): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            a: Int = this.a,
            corecursive: pbandk.conformance.pb.TestAllTypesProto3? = this.corecursive,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> {
            public val defaultInstance: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage by lazy { pbandk.conformance.pb.TestAllTypesProto3.NestedMessage {} }

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
                            value = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage::a,
                            mutableValue = pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage::a,
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "corecursive",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto3.Companion),
                            jsonName = "corecursive",
                            value = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage::corecursive,
                            mutableValue = pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage::corecursive,
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "protobuf_test_messages.proto3.TestAllTypesProto3.NestedMessage",
                    messageClass = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage::class,
                    messageCompanion = this,
                    builder = TestAllTypesProto3.Companion::NestedMessage,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableNestedMessage : pbandk.conformance.pb.TestAllTypesProto3.NestedMessage, pbandk.MutableMessage<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> {
        public override var a: Int
        public override var corecursive: pbandk.conformance.pb.TestAllTypesProto3?
    }
}

public sealed interface MutableTestAllTypesProto3 : pbandk.conformance.pb.TestAllTypesProto3, pbandk.MutableMessage<pbandk.conformance.pb.TestAllTypesProto3> {
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
    public override val repeatedInt32: MutableList<Int>
    public override val repeatedInt64: MutableList<Long>
    public override val repeatedUint32: MutableList<Int>
    public override val repeatedUint64: MutableList<Long>
    public override val repeatedSint32: MutableList<Int>
    public override val repeatedSint64: MutableList<Long>
    public override val repeatedFixed32: MutableList<Int>
    public override val repeatedFixed64: MutableList<Long>
    public override val repeatedSfixed32: MutableList<Int>
    public override val repeatedSfixed64: MutableList<Long>
    public override val repeatedFloat: MutableList<Float>
    public override val repeatedDouble: MutableList<Double>
    public override val repeatedBool: MutableList<Boolean>
    public override val repeatedString: MutableList<String>
    public override val repeatedBytes: MutableList<pbandk.ByteArr>
    public override val repeatedNestedMessage: MutableList<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>
    public override val repeatedForeignMessage: MutableList<pbandk.conformance.pb.ForeignMessage>
    public override val repeatedNestedEnum: MutableList<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override val repeatedForeignEnum: MutableList<pbandk.conformance.pb.ForeignEnum>
    public override val repeatedStringPiece: MutableList<String>
    public override val repeatedCord: MutableList<String>
    public override val packedInt32: MutableList<Int>
    public override val packedInt64: MutableList<Long>
    public override val packedUint32: MutableList<Int>
    public override val packedUint64: MutableList<Long>
    public override val packedSint32: MutableList<Int>
    public override val packedSint64: MutableList<Long>
    public override val packedFixed32: MutableList<Int>
    public override val packedFixed64: MutableList<Long>
    public override val packedSfixed32: MutableList<Int>
    public override val packedSfixed64: MutableList<Long>
    public override val packedFloat: MutableList<Float>
    public override val packedDouble: MutableList<Double>
    public override val packedBool: MutableList<Boolean>
    public override val packedNestedEnum: MutableList<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override val unpackedInt32: MutableList<Int>
    public override val unpackedInt64: MutableList<Long>
    public override val unpackedUint32: MutableList<Int>
    public override val unpackedUint64: MutableList<Long>
    public override val unpackedSint32: MutableList<Int>
    public override val unpackedSint64: MutableList<Long>
    public override val unpackedFixed32: MutableList<Int>
    public override val unpackedFixed64: MutableList<Long>
    public override val unpackedSfixed32: MutableList<Int>
    public override val unpackedSfixed64: MutableList<Long>
    public override val unpackedFloat: MutableList<Float>
    public override val unpackedDouble: MutableList<Double>
    public override val unpackedBool: MutableList<Boolean>
    public override val unpackedNestedEnum: MutableList<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override val mapInt32Int32: MutableMap<Int, Int>
    public override val mapInt64Int64: MutableMap<Long, Long>
    public override val mapUint32Uint32: MutableMap<Int, Int>
    public override val mapUint64Uint64: MutableMap<Long, Long>
    public override val mapSint32Sint32: MutableMap<Int, Int>
    public override val mapSint64Sint64: MutableMap<Long, Long>
    public override val mapFixed32Fixed32: MutableMap<Int, Int>
    public override val mapFixed64Fixed64: MutableMap<Long, Long>
    public override val mapSfixed32Sfixed32: MutableMap<Int, Int>
    public override val mapSfixed64Sfixed64: MutableMap<Long, Long>
    public override val mapInt32Float: MutableMap<Int, Float>
    public override val mapInt32Double: MutableMap<Int, Double>
    public override val mapBoolBool: MutableMap<Boolean, Boolean>
    public override val mapStringString: MutableMap<String, String>
    public override val mapStringBytes: MutableMap<String, pbandk.ByteArr>
    public override val mapStringNestedMessage: MutableMap<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>
    public override val mapStringForeignMessage: MutableMap<String, pbandk.conformance.pb.ForeignMessage?>
    public override val mapStringNestedEnum: MutableMap<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>
    public override val mapStringForeignEnum: MutableMap<String, pbandk.conformance.pb.ForeignEnum>
    public override var optionalBoolWrapper: Boolean?
    public override var optionalInt32Wrapper: Int?
    public override var optionalInt64Wrapper: Long?
    public override var optionalUint32Wrapper: Int?
    public override var optionalUint64Wrapper: Long?
    public override var optionalFloatWrapper: Float?
    public override var optionalDoubleWrapper: Double?
    public override var optionalStringWrapper: String?
    public override var optionalBytesWrapper: pbandk.ByteArr?
    public override val repeatedBoolWrapper: MutableList<Boolean>
    public override val repeatedInt32Wrapper: MutableList<Int>
    public override val repeatedInt64Wrapper: MutableList<Long>
    public override val repeatedUint32Wrapper: MutableList<Int>
    public override val repeatedUint64Wrapper: MutableList<Long>
    public override val repeatedFloatWrapper: MutableList<Float>
    public override val repeatedDoubleWrapper: MutableList<Double>
    public override val repeatedStringWrapper: MutableList<String>
    public override val repeatedBytesWrapper: MutableList<pbandk.ByteArr>
    public override var optionalDuration: pbandk.wkt.Duration?
    public override var optionalTimestamp: pbandk.wkt.Timestamp?
    public override var optionalFieldMask: pbandk.wkt.FieldMask?
    public override var optionalStruct: pbandk.wkt.Struct?
    public override var optionalAny: pbandk.wkt.Any?
    public override var optionalValue: pbandk.wkt.Value?
    public override val repeatedDuration: MutableList<pbandk.wkt.Duration>
    public override val repeatedTimestamp: MutableList<pbandk.wkt.Timestamp>
    public override val repeatedFieldmask: MutableList<pbandk.wkt.FieldMask>
    public override val repeatedStruct: MutableList<pbandk.wkt.Struct>
    public override val repeatedAny: MutableList<pbandk.wkt.Any>
    public override val repeatedValue: MutableList<pbandk.wkt.Value>
    public override val repeatedListValue: MutableList<pbandk.wkt.ListValue>
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
}

public sealed interface ForeignMessage : pbandk.Message {
    public val c: Int

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ForeignMessage
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessage>

    /**
     * The [MutableForeignMessage] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableForeignMessage.() -> Unit): pbandk.conformance.pb.ForeignMessage

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        c: Int = this.c,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.ForeignMessage

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ForeignMessage> {
        public val defaultInstance: pbandk.conformance.pb.ForeignMessage by lazy { pbandk.conformance.pb.ForeignMessage {} }

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
                        value = pbandk.conformance.pb.ForeignMessage::c,
                        mutableValue = pbandk.conformance.pb.MutableForeignMessage::c,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "protobuf_test_messages.proto3.ForeignMessage",
                messageClass = pbandk.conformance.pb.ForeignMessage::class,
                messageCompanion = this,
                builder = ::ForeignMessage,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableForeignMessage : pbandk.conformance.pb.ForeignMessage, pbandk.MutableMessage<pbandk.conformance.pb.ForeignMessage> {
    public override var c: Int
}

@Deprecated(
    message = "Use TestAllTypesProto3 { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.TestAllTypesProto3"],
        expression = "TestAllTypesProto3 {\nthis.optionalInt32 = optionalInt32\nthis.optionalInt64 = optionalInt64\nthis.optionalUint32 = optionalUint32\nthis.optionalUint64 = optionalUint64\nthis.optionalSint32 = optionalSint32\nthis.optionalSint64 = optionalSint64\nthis.optionalFixed32 = optionalFixed32\nthis.optionalFixed64 = optionalFixed64\nthis.optionalSfixed32 = optionalSfixed32\nthis.optionalSfixed64 = optionalSfixed64\nthis.optionalFloat = optionalFloat\nthis.optionalDouble = optionalDouble\nthis.optionalBool = optionalBool\nthis.optionalString = optionalString\nthis.optionalBytes = optionalBytes\nthis.optionalNestedMessage = optionalNestedMessage\nthis.optionalForeignMessage = optionalForeignMessage\nthis.optionalNestedEnum = optionalNestedEnum\nthis.optionalForeignEnum = optionalForeignEnum\nthis.optionalAliasedEnum = optionalAliasedEnum\nthis.optionalStringPiece = optionalStringPiece\nthis.optionalCord = optionalCord\nthis.recursiveMessage = recursiveMessage\nthis.repeatedInt32 += repeatedInt32\nthis.repeatedInt64 += repeatedInt64\nthis.repeatedUint32 += repeatedUint32\nthis.repeatedUint64 += repeatedUint64\nthis.repeatedSint32 += repeatedSint32\nthis.repeatedSint64 += repeatedSint64\nthis.repeatedFixed32 += repeatedFixed32\nthis.repeatedFixed64 += repeatedFixed64\nthis.repeatedSfixed32 += repeatedSfixed32\nthis.repeatedSfixed64 += repeatedSfixed64\nthis.repeatedFloat += repeatedFloat\nthis.repeatedDouble += repeatedDouble\nthis.repeatedBool += repeatedBool\nthis.repeatedString += repeatedString\nthis.repeatedBytes += repeatedBytes\nthis.repeatedNestedMessage += repeatedNestedMessage\nthis.repeatedForeignMessage += repeatedForeignMessage\nthis.repeatedNestedEnum += repeatedNestedEnum\nthis.repeatedForeignEnum += repeatedForeignEnum\nthis.repeatedStringPiece += repeatedStringPiece\nthis.repeatedCord += repeatedCord\nthis.packedInt32 += packedInt32\nthis.packedInt64 += packedInt64\nthis.packedUint32 += packedUint32\nthis.packedUint64 += packedUint64\nthis.packedSint32 += packedSint32\nthis.packedSint64 += packedSint64\nthis.packedFixed32 += packedFixed32\nthis.packedFixed64 += packedFixed64\nthis.packedSfixed32 += packedSfixed32\nthis.packedSfixed64 += packedSfixed64\nthis.packedFloat += packedFloat\nthis.packedDouble += packedDouble\nthis.packedBool += packedBool\nthis.packedNestedEnum += packedNestedEnum\nthis.unpackedInt32 += unpackedInt32\nthis.unpackedInt64 += unpackedInt64\nthis.unpackedUint32 += unpackedUint32\nthis.unpackedUint64 += unpackedUint64\nthis.unpackedSint32 += unpackedSint32\nthis.unpackedSint64 += unpackedSint64\nthis.unpackedFixed32 += unpackedFixed32\nthis.unpackedFixed64 += unpackedFixed64\nthis.unpackedSfixed32 += unpackedSfixed32\nthis.unpackedSfixed64 += unpackedSfixed64\nthis.unpackedFloat += unpackedFloat\nthis.unpackedDouble += unpackedDouble\nthis.unpackedBool += unpackedBool\nthis.unpackedNestedEnum += unpackedNestedEnum\nthis.mapInt32Int32 += mapInt32Int32\nthis.mapInt64Int64 += mapInt64Int64\nthis.mapUint32Uint32 += mapUint32Uint32\nthis.mapUint64Uint64 += mapUint64Uint64\nthis.mapSint32Sint32 += mapSint32Sint32\nthis.mapSint64Sint64 += mapSint64Sint64\nthis.mapFixed32Fixed32 += mapFixed32Fixed32\nthis.mapFixed64Fixed64 += mapFixed64Fixed64\nthis.mapSfixed32Sfixed32 += mapSfixed32Sfixed32\nthis.mapSfixed64Sfixed64 += mapSfixed64Sfixed64\nthis.mapInt32Float += mapInt32Float\nthis.mapInt32Double += mapInt32Double\nthis.mapBoolBool += mapBoolBool\nthis.mapStringString += mapStringString\nthis.mapStringBytes += mapStringBytes\nthis.mapStringNestedMessage += mapStringNestedMessage\nthis.mapStringForeignMessage += mapStringForeignMessage\nthis.mapStringNestedEnum += mapStringNestedEnum\nthis.mapStringForeignEnum += mapStringForeignEnum\nthis.optionalBoolWrapper = optionalBoolWrapper\nthis.optionalInt32Wrapper = optionalInt32Wrapper\nthis.optionalInt64Wrapper = optionalInt64Wrapper\nthis.optionalUint32Wrapper = optionalUint32Wrapper\nthis.optionalUint64Wrapper = optionalUint64Wrapper\nthis.optionalFloatWrapper = optionalFloatWrapper\nthis.optionalDoubleWrapper = optionalDoubleWrapper\nthis.optionalStringWrapper = optionalStringWrapper\nthis.optionalBytesWrapper = optionalBytesWrapper\nthis.repeatedBoolWrapper += repeatedBoolWrapper\nthis.repeatedInt32Wrapper += repeatedInt32Wrapper\nthis.repeatedInt64Wrapper += repeatedInt64Wrapper\nthis.repeatedUint32Wrapper += repeatedUint32Wrapper\nthis.repeatedUint64Wrapper += repeatedUint64Wrapper\nthis.repeatedFloatWrapper += repeatedFloatWrapper\nthis.repeatedDoubleWrapper += repeatedDoubleWrapper\nthis.repeatedStringWrapper += repeatedStringWrapper\nthis.repeatedBytesWrapper += repeatedBytesWrapper\nthis.optionalDuration = optionalDuration\nthis.optionalTimestamp = optionalTimestamp\nthis.optionalFieldMask = optionalFieldMask\nthis.optionalStruct = optionalStruct\nthis.optionalAny = optionalAny\nthis.optionalValue = optionalValue\nthis.repeatedDuration += repeatedDuration\nthis.repeatedTimestamp += repeatedTimestamp\nthis.repeatedFieldmask += repeatedFieldmask\nthis.repeatedStruct += repeatedStruct\nthis.repeatedAny += repeatedAny\nthis.repeatedValue += repeatedValue\nthis.repeatedListValue += repeatedListValue\nthis.fieldname1 = fieldname1\nthis.fieldName2 = fieldName2\nthis.fieldName3 = fieldName3\nthis.field_name4 = field_name4\nthis.field0name5 = field0name5\nthis.field0Name6 = field0Name6\nthis.fieldName7 = fieldName7\nthis.fieldName8 = fieldName8\nthis.fieldName9 = fieldName9\nthis.fieldName10 = fieldName10\nthis.fIELDNAME11 = fIELDNAME11\nthis.fIELDName12 = fIELDName12\nthis._fieldName13 = _fieldName13\nthis._FieldName14 = _FieldName14\nthis.field_name15 = field_name15\nthis.field_Name16 = field_Name16\nthis.fieldName17_ = fieldName17_\nthis.fieldName18_ = fieldName18_\nthis.oneofField = oneofField\nthis.unknownFields += unknownFields\n}",
    )
)
public fun TestAllTypesProto3(
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
): pbandk.conformance.pb.TestAllTypesProto3 = pbandk.conformance.pb.TestAllTypesProto3 {
    this.optionalInt32 = optionalInt32
    this.optionalInt64 = optionalInt64
    this.optionalUint32 = optionalUint32
    this.optionalUint64 = optionalUint64
    this.optionalSint32 = optionalSint32
    this.optionalSint64 = optionalSint64
    this.optionalFixed32 = optionalFixed32
    this.optionalFixed64 = optionalFixed64
    this.optionalSfixed32 = optionalSfixed32
    this.optionalSfixed64 = optionalSfixed64
    this.optionalFloat = optionalFloat
    this.optionalDouble = optionalDouble
    this.optionalBool = optionalBool
    this.optionalString = optionalString
    this.optionalBytes = optionalBytes
    this.optionalNestedMessage = optionalNestedMessage
    this.optionalForeignMessage = optionalForeignMessage
    this.optionalNestedEnum = optionalNestedEnum
    this.optionalForeignEnum = optionalForeignEnum
    this.optionalAliasedEnum = optionalAliasedEnum
    this.optionalStringPiece = optionalStringPiece
    this.optionalCord = optionalCord
    this.recursiveMessage = recursiveMessage
    this.repeatedInt32 += repeatedInt32
    this.repeatedInt64 += repeatedInt64
    this.repeatedUint32 += repeatedUint32
    this.repeatedUint64 += repeatedUint64
    this.repeatedSint32 += repeatedSint32
    this.repeatedSint64 += repeatedSint64
    this.repeatedFixed32 += repeatedFixed32
    this.repeatedFixed64 += repeatedFixed64
    this.repeatedSfixed32 += repeatedSfixed32
    this.repeatedSfixed64 += repeatedSfixed64
    this.repeatedFloat += repeatedFloat
    this.repeatedDouble += repeatedDouble
    this.repeatedBool += repeatedBool
    this.repeatedString += repeatedString
    this.repeatedBytes += repeatedBytes
    this.repeatedNestedMessage += repeatedNestedMessage
    this.repeatedForeignMessage += repeatedForeignMessage
    this.repeatedNestedEnum += repeatedNestedEnum
    this.repeatedForeignEnum += repeatedForeignEnum
    this.repeatedStringPiece += repeatedStringPiece
    this.repeatedCord += repeatedCord
    this.packedInt32 += packedInt32
    this.packedInt64 += packedInt64
    this.packedUint32 += packedUint32
    this.packedUint64 += packedUint64
    this.packedSint32 += packedSint32
    this.packedSint64 += packedSint64
    this.packedFixed32 += packedFixed32
    this.packedFixed64 += packedFixed64
    this.packedSfixed32 += packedSfixed32
    this.packedSfixed64 += packedSfixed64
    this.packedFloat += packedFloat
    this.packedDouble += packedDouble
    this.packedBool += packedBool
    this.packedNestedEnum += packedNestedEnum
    this.unpackedInt32 += unpackedInt32
    this.unpackedInt64 += unpackedInt64
    this.unpackedUint32 += unpackedUint32
    this.unpackedUint64 += unpackedUint64
    this.unpackedSint32 += unpackedSint32
    this.unpackedSint64 += unpackedSint64
    this.unpackedFixed32 += unpackedFixed32
    this.unpackedFixed64 += unpackedFixed64
    this.unpackedSfixed32 += unpackedSfixed32
    this.unpackedSfixed64 += unpackedSfixed64
    this.unpackedFloat += unpackedFloat
    this.unpackedDouble += unpackedDouble
    this.unpackedBool += unpackedBool
    this.unpackedNestedEnum += unpackedNestedEnum
    this.mapInt32Int32 += mapInt32Int32
    this.mapInt64Int64 += mapInt64Int64
    this.mapUint32Uint32 += mapUint32Uint32
    this.mapUint64Uint64 += mapUint64Uint64
    this.mapSint32Sint32 += mapSint32Sint32
    this.mapSint64Sint64 += mapSint64Sint64
    this.mapFixed32Fixed32 += mapFixed32Fixed32
    this.mapFixed64Fixed64 += mapFixed64Fixed64
    this.mapSfixed32Sfixed32 += mapSfixed32Sfixed32
    this.mapSfixed64Sfixed64 += mapSfixed64Sfixed64
    this.mapInt32Float += mapInt32Float
    this.mapInt32Double += mapInt32Double
    this.mapBoolBool += mapBoolBool
    this.mapStringString += mapStringString
    this.mapStringBytes += mapStringBytes
    this.mapStringNestedMessage += mapStringNestedMessage
    this.mapStringForeignMessage += mapStringForeignMessage
    this.mapStringNestedEnum += mapStringNestedEnum
    this.mapStringForeignEnum += mapStringForeignEnum
    this.optionalBoolWrapper = optionalBoolWrapper
    this.optionalInt32Wrapper = optionalInt32Wrapper
    this.optionalInt64Wrapper = optionalInt64Wrapper
    this.optionalUint32Wrapper = optionalUint32Wrapper
    this.optionalUint64Wrapper = optionalUint64Wrapper
    this.optionalFloatWrapper = optionalFloatWrapper
    this.optionalDoubleWrapper = optionalDoubleWrapper
    this.optionalStringWrapper = optionalStringWrapper
    this.optionalBytesWrapper = optionalBytesWrapper
    this.repeatedBoolWrapper += repeatedBoolWrapper
    this.repeatedInt32Wrapper += repeatedInt32Wrapper
    this.repeatedInt64Wrapper += repeatedInt64Wrapper
    this.repeatedUint32Wrapper += repeatedUint32Wrapper
    this.repeatedUint64Wrapper += repeatedUint64Wrapper
    this.repeatedFloatWrapper += repeatedFloatWrapper
    this.repeatedDoubleWrapper += repeatedDoubleWrapper
    this.repeatedStringWrapper += repeatedStringWrapper
    this.repeatedBytesWrapper += repeatedBytesWrapper
    this.optionalDuration = optionalDuration
    this.optionalTimestamp = optionalTimestamp
    this.optionalFieldMask = optionalFieldMask
    this.optionalStruct = optionalStruct
    this.optionalAny = optionalAny
    this.optionalValue = optionalValue
    this.repeatedDuration += repeatedDuration
    this.repeatedTimestamp += repeatedTimestamp
    this.repeatedFieldmask += repeatedFieldmask
    this.repeatedStruct += repeatedStruct
    this.repeatedAny += repeatedAny
    this.repeatedValue += repeatedValue
    this.repeatedListValue += repeatedListValue
    this.fieldname1 = fieldname1
    this.fieldName2 = fieldName2
    this.fieldName3 = fieldName3
    this.field_name4 = field_name4
    this.field0name5 = field0name5
    this.field0Name6 = field0Name6
    this.fieldName7 = fieldName7
    this.fieldName8 = fieldName8
    this.fieldName9 = fieldName9
    this.fieldName10 = fieldName10
    this.fIELDNAME11 = fIELDNAME11
    this.fIELDName12 = fIELDName12
    this._fieldName13 = _fieldName13
    this._FieldName14 = _FieldName14
    this.field_name15 = field_name15
    this.field_Name16 = field_Name16
    this.fieldName17_ = fieldName17_
    this.fieldName18_ = fieldName18_
    this.oneofField = oneofField
    this.unknownFields += unknownFields
}

/**
 * The [MutableTestAllTypesProto3] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto3")
public fun TestAllTypesProto3(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto3.() -> Unit): pbandk.conformance.pb.TestAllTypesProto3 = pbandk.conformance.pb.MutableTestAllTypesProto3_Impl(
    optionalInt32 = 0,
    optionalInt64 = 0L,
    optionalUint32 = 0,
    optionalUint64 = 0L,
    optionalSint32 = 0,
    optionalSint64 = 0L,
    optionalFixed32 = 0,
    optionalFixed64 = 0L,
    optionalSfixed32 = 0,
    optionalSfixed64 = 0L,
    optionalFloat = 0.0F,
    optionalDouble = 0.0,
    optionalBool = false,
    optionalString = "",
    optionalBytes = pbandk.ByteArr.empty,
    optionalNestedMessage = null,
    optionalForeignMessage = null,
    optionalNestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
    optionalForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
    optionalAliasedEnum = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromValue(0),
    optionalStringPiece = "",
    optionalCord = "",
    recursiveMessage = null,
    repeatedInt32 = pbandk.gen.MutableListField(),
    repeatedInt64 = pbandk.gen.MutableListField(),
    repeatedUint32 = pbandk.gen.MutableListField(),
    repeatedUint64 = pbandk.gen.MutableListField(),
    repeatedSint32 = pbandk.gen.MutableListField(),
    repeatedSint64 = pbandk.gen.MutableListField(),
    repeatedFixed32 = pbandk.gen.MutableListField(),
    repeatedFixed64 = pbandk.gen.MutableListField(),
    repeatedSfixed32 = pbandk.gen.MutableListField(),
    repeatedSfixed64 = pbandk.gen.MutableListField(),
    repeatedFloat = pbandk.gen.MutableListField(),
    repeatedDouble = pbandk.gen.MutableListField(),
    repeatedBool = pbandk.gen.MutableListField(),
    repeatedString = pbandk.gen.MutableListField(),
    repeatedBytes = pbandk.gen.MutableListField(),
    repeatedNestedMessage = pbandk.gen.MutableListField(),
    repeatedForeignMessage = pbandk.gen.MutableListField(),
    repeatedNestedEnum = pbandk.gen.MutableListField(),
    repeatedForeignEnum = pbandk.gen.MutableListField(),
    repeatedStringPiece = pbandk.gen.MutableListField(),
    repeatedCord = pbandk.gen.MutableListField(),
    packedInt32 = pbandk.gen.MutableListField(),
    packedInt64 = pbandk.gen.MutableListField(),
    packedUint32 = pbandk.gen.MutableListField(),
    packedUint64 = pbandk.gen.MutableListField(),
    packedSint32 = pbandk.gen.MutableListField(),
    packedSint64 = pbandk.gen.MutableListField(),
    packedFixed32 = pbandk.gen.MutableListField(),
    packedFixed64 = pbandk.gen.MutableListField(),
    packedSfixed32 = pbandk.gen.MutableListField(),
    packedSfixed64 = pbandk.gen.MutableListField(),
    packedFloat = pbandk.gen.MutableListField(),
    packedDouble = pbandk.gen.MutableListField(),
    packedBool = pbandk.gen.MutableListField(),
    packedNestedEnum = pbandk.gen.MutableListField(),
    unpackedInt32 = pbandk.gen.MutableListField(),
    unpackedInt64 = pbandk.gen.MutableListField(),
    unpackedUint32 = pbandk.gen.MutableListField(),
    unpackedUint64 = pbandk.gen.MutableListField(),
    unpackedSint32 = pbandk.gen.MutableListField(),
    unpackedSint64 = pbandk.gen.MutableListField(),
    unpackedFixed32 = pbandk.gen.MutableListField(),
    unpackedFixed64 = pbandk.gen.MutableListField(),
    unpackedSfixed32 = pbandk.gen.MutableListField(),
    unpackedSfixed64 = pbandk.gen.MutableListField(),
    unpackedFloat = pbandk.gen.MutableListField(),
    unpackedDouble = pbandk.gen.MutableListField(),
    unpackedBool = pbandk.gen.MutableListField(),
    unpackedNestedEnum = pbandk.gen.MutableListField(),
    mapInt32Int32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[56]),
    mapInt64Int64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[57]),
    mapUint32Uint32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[58]),
    mapUint64Uint64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[59]),
    mapSint32Sint32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[60]),
    mapSint64Sint64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[61]),
    mapFixed32Fixed32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[62]),
    mapFixed64Fixed64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[63]),
    mapSfixed32Sfixed32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[64]),
    mapSfixed64Sfixed64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[65]),
    mapInt32Float = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[66]),
    mapInt32Double = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[67]),
    mapBoolBool = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[68]),
    mapStringString = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[69]),
    mapStringBytes = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[70]),
    mapStringNestedMessage = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[71]),
    mapStringForeignMessage = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[72]),
    mapStringNestedEnum = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[73]),
    mapStringForeignEnum = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto3.descriptor.fields[74]),
    optionalBoolWrapper = null,
    optionalInt32Wrapper = null,
    optionalInt64Wrapper = null,
    optionalUint32Wrapper = null,
    optionalUint64Wrapper = null,
    optionalFloatWrapper = null,
    optionalDoubleWrapper = null,
    optionalStringWrapper = null,
    optionalBytesWrapper = null,
    repeatedBoolWrapper = pbandk.gen.MutableListField(),
    repeatedInt32Wrapper = pbandk.gen.MutableListField(),
    repeatedInt64Wrapper = pbandk.gen.MutableListField(),
    repeatedUint32Wrapper = pbandk.gen.MutableListField(),
    repeatedUint64Wrapper = pbandk.gen.MutableListField(),
    repeatedFloatWrapper = pbandk.gen.MutableListField(),
    repeatedDoubleWrapper = pbandk.gen.MutableListField(),
    repeatedStringWrapper = pbandk.gen.MutableListField(),
    repeatedBytesWrapper = pbandk.gen.MutableListField(),
    optionalDuration = null,
    optionalTimestamp = null,
    optionalFieldMask = null,
    optionalStruct = null,
    optionalAny = null,
    optionalValue = null,
    repeatedDuration = pbandk.gen.MutableListField(),
    repeatedTimestamp = pbandk.gen.MutableListField(),
    repeatedFieldmask = pbandk.gen.MutableListField(),
    repeatedStruct = pbandk.gen.MutableListField(),
    repeatedAny = pbandk.gen.MutableListField(),
    repeatedValue = pbandk.gen.MutableListField(),
    repeatedListValue = pbandk.gen.MutableListField(),
    fieldname1 = 0,
    fieldName2 = 0,
    fieldName3 = 0,
    field_name4 = 0,
    field0name5 = 0,
    field0Name6 = 0,
    fieldName7 = 0,
    fieldName8 = 0,
    fieldName9 = 0,
    fieldName10 = 0,
    fIELDNAME11 = 0,
    fIELDName12 = 0,
    _fieldName13 = 0,
    _FieldName14 = 0,
    field_name15 = 0,
    field_Name16 = 0,
    fieldName17_ = 0,
    fieldName18_ = 0,
    oneofField = null,
    unknownFields = mutableMapOf()
).also(builderAction).toTestAllTypesProto3()

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3")
public fun TestAllTypesProto3?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3 = this ?: pbandk.conformance.pb.TestAllTypesProto3.defaultInstance

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
    override val repeatedInt32: pbandk.gen.ListField<Int>,
    override val repeatedInt64: pbandk.gen.ListField<Long>,
    override val repeatedUint32: pbandk.gen.ListField<Int>,
    override val repeatedUint64: pbandk.gen.ListField<Long>,
    override val repeatedSint32: pbandk.gen.ListField<Int>,
    override val repeatedSint64: pbandk.gen.ListField<Long>,
    override val repeatedFixed32: pbandk.gen.ListField<Int>,
    override val repeatedFixed64: pbandk.gen.ListField<Long>,
    override val repeatedSfixed32: pbandk.gen.ListField<Int>,
    override val repeatedSfixed64: pbandk.gen.ListField<Long>,
    override val repeatedFloat: pbandk.gen.ListField<Float>,
    override val repeatedDouble: pbandk.gen.ListField<Double>,
    override val repeatedBool: pbandk.gen.ListField<Boolean>,
    override val repeatedString: pbandk.gen.ListField<String>,
    override val repeatedBytes: pbandk.gen.ListField<pbandk.ByteArr>,
    override val repeatedNestedMessage: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>,
    override val repeatedForeignMessage: pbandk.gen.ListField<pbandk.conformance.pb.ForeignMessage>,
    override val repeatedNestedEnum: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val repeatedForeignEnum: pbandk.gen.ListField<pbandk.conformance.pb.ForeignEnum>,
    override val repeatedStringPiece: pbandk.gen.ListField<String>,
    override val repeatedCord: pbandk.gen.ListField<String>,
    override val packedInt32: pbandk.gen.ListField<Int>,
    override val packedInt64: pbandk.gen.ListField<Long>,
    override val packedUint32: pbandk.gen.ListField<Int>,
    override val packedUint64: pbandk.gen.ListField<Long>,
    override val packedSint32: pbandk.gen.ListField<Int>,
    override val packedSint64: pbandk.gen.ListField<Long>,
    override val packedFixed32: pbandk.gen.ListField<Int>,
    override val packedFixed64: pbandk.gen.ListField<Long>,
    override val packedSfixed32: pbandk.gen.ListField<Int>,
    override val packedSfixed64: pbandk.gen.ListField<Long>,
    override val packedFloat: pbandk.gen.ListField<Float>,
    override val packedDouble: pbandk.gen.ListField<Double>,
    override val packedBool: pbandk.gen.ListField<Boolean>,
    override val packedNestedEnum: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val unpackedInt32: pbandk.gen.ListField<Int>,
    override val unpackedInt64: pbandk.gen.ListField<Long>,
    override val unpackedUint32: pbandk.gen.ListField<Int>,
    override val unpackedUint64: pbandk.gen.ListField<Long>,
    override val unpackedSint32: pbandk.gen.ListField<Int>,
    override val unpackedSint64: pbandk.gen.ListField<Long>,
    override val unpackedFixed32: pbandk.gen.ListField<Int>,
    override val unpackedFixed64: pbandk.gen.ListField<Long>,
    override val unpackedSfixed32: pbandk.gen.ListField<Int>,
    override val unpackedSfixed64: pbandk.gen.ListField<Long>,
    override val unpackedFloat: pbandk.gen.ListField<Float>,
    override val unpackedDouble: pbandk.gen.ListField<Double>,
    override val unpackedBool: pbandk.gen.ListField<Boolean>,
    override val unpackedNestedEnum: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val mapInt32Int32: pbandk.gen.MapField<Int, Int>,
    override val mapInt64Int64: pbandk.gen.MapField<Long, Long>,
    override val mapUint32Uint32: pbandk.gen.MapField<Int, Int>,
    override val mapUint64Uint64: pbandk.gen.MapField<Long, Long>,
    override val mapSint32Sint32: pbandk.gen.MapField<Int, Int>,
    override val mapSint64Sint64: pbandk.gen.MapField<Long, Long>,
    override val mapFixed32Fixed32: pbandk.gen.MapField<Int, Int>,
    override val mapFixed64Fixed64: pbandk.gen.MapField<Long, Long>,
    override val mapSfixed32Sfixed32: pbandk.gen.MapField<Int, Int>,
    override val mapSfixed64Sfixed64: pbandk.gen.MapField<Long, Long>,
    override val mapInt32Float: pbandk.gen.MapField<Int, Float>,
    override val mapInt32Double: pbandk.gen.MapField<Int, Double>,
    override val mapBoolBool: pbandk.gen.MapField<Boolean, Boolean>,
    override val mapStringString: pbandk.gen.MapField<String, String>,
    override val mapStringBytes: pbandk.gen.MapField<String, pbandk.ByteArr>,
    override val mapStringNestedMessage: pbandk.gen.MapField<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>,
    override val mapStringForeignMessage: pbandk.gen.MapField<String, pbandk.conformance.pb.ForeignMessage?>,
    override val mapStringNestedEnum: pbandk.gen.MapField<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val mapStringForeignEnum: pbandk.gen.MapField<String, pbandk.conformance.pb.ForeignEnum>,
    override val optionalBoolWrapper: Boolean?,
    override val optionalInt32Wrapper: Int?,
    override val optionalInt64Wrapper: Long?,
    override val optionalUint32Wrapper: Int?,
    override val optionalUint64Wrapper: Long?,
    override val optionalFloatWrapper: Float?,
    override val optionalDoubleWrapper: Double?,
    override val optionalStringWrapper: String?,
    override val optionalBytesWrapper: pbandk.ByteArr?,
    override val repeatedBoolWrapper: pbandk.gen.ListField<Boolean>,
    override val repeatedInt32Wrapper: pbandk.gen.ListField<Int>,
    override val repeatedInt64Wrapper: pbandk.gen.ListField<Long>,
    override val repeatedUint32Wrapper: pbandk.gen.ListField<Int>,
    override val repeatedUint64Wrapper: pbandk.gen.ListField<Long>,
    override val repeatedFloatWrapper: pbandk.gen.ListField<Float>,
    override val repeatedDoubleWrapper: pbandk.gen.ListField<Double>,
    override val repeatedStringWrapper: pbandk.gen.ListField<String>,
    override val repeatedBytesWrapper: pbandk.gen.ListField<pbandk.ByteArr>,
    override val optionalDuration: pbandk.wkt.Duration?,
    override val optionalTimestamp: pbandk.wkt.Timestamp?,
    override val optionalFieldMask: pbandk.wkt.FieldMask?,
    override val optionalStruct: pbandk.wkt.Struct?,
    override val optionalAny: pbandk.wkt.Any?,
    override val optionalValue: pbandk.wkt.Value?,
    override val repeatedDuration: pbandk.gen.ListField<pbandk.wkt.Duration>,
    override val repeatedTimestamp: pbandk.gen.ListField<pbandk.wkt.Timestamp>,
    override val repeatedFieldmask: pbandk.gen.ListField<pbandk.wkt.FieldMask>,
    override val repeatedStruct: pbandk.gen.ListField<pbandk.wkt.Struct>,
    override val repeatedAny: pbandk.gen.ListField<pbandk.wkt.Any>,
    override val repeatedValue: pbandk.gen.ListField<pbandk.wkt.Value>,
    override val repeatedListValue: pbandk.gen.ListField<pbandk.wkt.ListValue>,
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
) : pbandk.conformance.pb.TestAllTypesProto3, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.TestAllTypesProto3>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto3.descriptor

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

    override fun copy(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto3.() -> Unit) = pbandk.conformance.pb.TestAllTypesProto3 {
        this.optionalInt32 = this@TestAllTypesProto3_Impl.optionalInt32
        this.optionalInt64 = this@TestAllTypesProto3_Impl.optionalInt64
        this.optionalUint32 = this@TestAllTypesProto3_Impl.optionalUint32
        this.optionalUint64 = this@TestAllTypesProto3_Impl.optionalUint64
        this.optionalSint32 = this@TestAllTypesProto3_Impl.optionalSint32
        this.optionalSint64 = this@TestAllTypesProto3_Impl.optionalSint64
        this.optionalFixed32 = this@TestAllTypesProto3_Impl.optionalFixed32
        this.optionalFixed64 = this@TestAllTypesProto3_Impl.optionalFixed64
        this.optionalSfixed32 = this@TestAllTypesProto3_Impl.optionalSfixed32
        this.optionalSfixed64 = this@TestAllTypesProto3_Impl.optionalSfixed64
        this.optionalFloat = this@TestAllTypesProto3_Impl.optionalFloat
        this.optionalDouble = this@TestAllTypesProto3_Impl.optionalDouble
        this.optionalBool = this@TestAllTypesProto3_Impl.optionalBool
        this.optionalString = this@TestAllTypesProto3_Impl.optionalString
        this.optionalBytes = this@TestAllTypesProto3_Impl.optionalBytes
        this.optionalNestedMessage = this@TestAllTypesProto3_Impl.optionalNestedMessage
        this.optionalForeignMessage = this@TestAllTypesProto3_Impl.optionalForeignMessage
        this.optionalNestedEnum = this@TestAllTypesProto3_Impl.optionalNestedEnum
        this.optionalForeignEnum = this@TestAllTypesProto3_Impl.optionalForeignEnum
        this.optionalAliasedEnum = this@TestAllTypesProto3_Impl.optionalAliasedEnum
        this.optionalStringPiece = this@TestAllTypesProto3_Impl.optionalStringPiece
        this.optionalCord = this@TestAllTypesProto3_Impl.optionalCord
        this.recursiveMessage = this@TestAllTypesProto3_Impl.recursiveMessage
        this.repeatedInt32 += this@TestAllTypesProto3_Impl.repeatedInt32
        this.repeatedInt64 += this@TestAllTypesProto3_Impl.repeatedInt64
        this.repeatedUint32 += this@TestAllTypesProto3_Impl.repeatedUint32
        this.repeatedUint64 += this@TestAllTypesProto3_Impl.repeatedUint64
        this.repeatedSint32 += this@TestAllTypesProto3_Impl.repeatedSint32
        this.repeatedSint64 += this@TestAllTypesProto3_Impl.repeatedSint64
        this.repeatedFixed32 += this@TestAllTypesProto3_Impl.repeatedFixed32
        this.repeatedFixed64 += this@TestAllTypesProto3_Impl.repeatedFixed64
        this.repeatedSfixed32 += this@TestAllTypesProto3_Impl.repeatedSfixed32
        this.repeatedSfixed64 += this@TestAllTypesProto3_Impl.repeatedSfixed64
        this.repeatedFloat += this@TestAllTypesProto3_Impl.repeatedFloat
        this.repeatedDouble += this@TestAllTypesProto3_Impl.repeatedDouble
        this.repeatedBool += this@TestAllTypesProto3_Impl.repeatedBool
        this.repeatedString += this@TestAllTypesProto3_Impl.repeatedString
        this.repeatedBytes += this@TestAllTypesProto3_Impl.repeatedBytes
        this.repeatedNestedMessage += this@TestAllTypesProto3_Impl.repeatedNestedMessage
        this.repeatedForeignMessage += this@TestAllTypesProto3_Impl.repeatedForeignMessage
        this.repeatedNestedEnum += this@TestAllTypesProto3_Impl.repeatedNestedEnum
        this.repeatedForeignEnum += this@TestAllTypesProto3_Impl.repeatedForeignEnum
        this.repeatedStringPiece += this@TestAllTypesProto3_Impl.repeatedStringPiece
        this.repeatedCord += this@TestAllTypesProto3_Impl.repeatedCord
        this.packedInt32 += this@TestAllTypesProto3_Impl.packedInt32
        this.packedInt64 += this@TestAllTypesProto3_Impl.packedInt64
        this.packedUint32 += this@TestAllTypesProto3_Impl.packedUint32
        this.packedUint64 += this@TestAllTypesProto3_Impl.packedUint64
        this.packedSint32 += this@TestAllTypesProto3_Impl.packedSint32
        this.packedSint64 += this@TestAllTypesProto3_Impl.packedSint64
        this.packedFixed32 += this@TestAllTypesProto3_Impl.packedFixed32
        this.packedFixed64 += this@TestAllTypesProto3_Impl.packedFixed64
        this.packedSfixed32 += this@TestAllTypesProto3_Impl.packedSfixed32
        this.packedSfixed64 += this@TestAllTypesProto3_Impl.packedSfixed64
        this.packedFloat += this@TestAllTypesProto3_Impl.packedFloat
        this.packedDouble += this@TestAllTypesProto3_Impl.packedDouble
        this.packedBool += this@TestAllTypesProto3_Impl.packedBool
        this.packedNestedEnum += this@TestAllTypesProto3_Impl.packedNestedEnum
        this.unpackedInt32 += this@TestAllTypesProto3_Impl.unpackedInt32
        this.unpackedInt64 += this@TestAllTypesProto3_Impl.unpackedInt64
        this.unpackedUint32 += this@TestAllTypesProto3_Impl.unpackedUint32
        this.unpackedUint64 += this@TestAllTypesProto3_Impl.unpackedUint64
        this.unpackedSint32 += this@TestAllTypesProto3_Impl.unpackedSint32
        this.unpackedSint64 += this@TestAllTypesProto3_Impl.unpackedSint64
        this.unpackedFixed32 += this@TestAllTypesProto3_Impl.unpackedFixed32
        this.unpackedFixed64 += this@TestAllTypesProto3_Impl.unpackedFixed64
        this.unpackedSfixed32 += this@TestAllTypesProto3_Impl.unpackedSfixed32
        this.unpackedSfixed64 += this@TestAllTypesProto3_Impl.unpackedSfixed64
        this.unpackedFloat += this@TestAllTypesProto3_Impl.unpackedFloat
        this.unpackedDouble += this@TestAllTypesProto3_Impl.unpackedDouble
        this.unpackedBool += this@TestAllTypesProto3_Impl.unpackedBool
        this.unpackedNestedEnum += this@TestAllTypesProto3_Impl.unpackedNestedEnum
        this.mapInt32Int32 += this@TestAllTypesProto3_Impl.mapInt32Int32
        this.mapInt64Int64 += this@TestAllTypesProto3_Impl.mapInt64Int64
        this.mapUint32Uint32 += this@TestAllTypesProto3_Impl.mapUint32Uint32
        this.mapUint64Uint64 += this@TestAllTypesProto3_Impl.mapUint64Uint64
        this.mapSint32Sint32 += this@TestAllTypesProto3_Impl.mapSint32Sint32
        this.mapSint64Sint64 += this@TestAllTypesProto3_Impl.mapSint64Sint64
        this.mapFixed32Fixed32 += this@TestAllTypesProto3_Impl.mapFixed32Fixed32
        this.mapFixed64Fixed64 += this@TestAllTypesProto3_Impl.mapFixed64Fixed64
        this.mapSfixed32Sfixed32 += this@TestAllTypesProto3_Impl.mapSfixed32Sfixed32
        this.mapSfixed64Sfixed64 += this@TestAllTypesProto3_Impl.mapSfixed64Sfixed64
        this.mapInt32Float += this@TestAllTypesProto3_Impl.mapInt32Float
        this.mapInt32Double += this@TestAllTypesProto3_Impl.mapInt32Double
        this.mapBoolBool += this@TestAllTypesProto3_Impl.mapBoolBool
        this.mapStringString += this@TestAllTypesProto3_Impl.mapStringString
        this.mapStringBytes += this@TestAllTypesProto3_Impl.mapStringBytes
        this.mapStringNestedMessage += this@TestAllTypesProto3_Impl.mapStringNestedMessage
        this.mapStringForeignMessage += this@TestAllTypesProto3_Impl.mapStringForeignMessage
        this.mapStringNestedEnum += this@TestAllTypesProto3_Impl.mapStringNestedEnum
        this.mapStringForeignEnum += this@TestAllTypesProto3_Impl.mapStringForeignEnum
        this.optionalBoolWrapper = this@TestAllTypesProto3_Impl.optionalBoolWrapper
        this.optionalInt32Wrapper = this@TestAllTypesProto3_Impl.optionalInt32Wrapper
        this.optionalInt64Wrapper = this@TestAllTypesProto3_Impl.optionalInt64Wrapper
        this.optionalUint32Wrapper = this@TestAllTypesProto3_Impl.optionalUint32Wrapper
        this.optionalUint64Wrapper = this@TestAllTypesProto3_Impl.optionalUint64Wrapper
        this.optionalFloatWrapper = this@TestAllTypesProto3_Impl.optionalFloatWrapper
        this.optionalDoubleWrapper = this@TestAllTypesProto3_Impl.optionalDoubleWrapper
        this.optionalStringWrapper = this@TestAllTypesProto3_Impl.optionalStringWrapper
        this.optionalBytesWrapper = this@TestAllTypesProto3_Impl.optionalBytesWrapper
        this.repeatedBoolWrapper += this@TestAllTypesProto3_Impl.repeatedBoolWrapper
        this.repeatedInt32Wrapper += this@TestAllTypesProto3_Impl.repeatedInt32Wrapper
        this.repeatedInt64Wrapper += this@TestAllTypesProto3_Impl.repeatedInt64Wrapper
        this.repeatedUint32Wrapper += this@TestAllTypesProto3_Impl.repeatedUint32Wrapper
        this.repeatedUint64Wrapper += this@TestAllTypesProto3_Impl.repeatedUint64Wrapper
        this.repeatedFloatWrapper += this@TestAllTypesProto3_Impl.repeatedFloatWrapper
        this.repeatedDoubleWrapper += this@TestAllTypesProto3_Impl.repeatedDoubleWrapper
        this.repeatedStringWrapper += this@TestAllTypesProto3_Impl.repeatedStringWrapper
        this.repeatedBytesWrapper += this@TestAllTypesProto3_Impl.repeatedBytesWrapper
        this.optionalDuration = this@TestAllTypesProto3_Impl.optionalDuration
        this.optionalTimestamp = this@TestAllTypesProto3_Impl.optionalTimestamp
        this.optionalFieldMask = this@TestAllTypesProto3_Impl.optionalFieldMask
        this.optionalStruct = this@TestAllTypesProto3_Impl.optionalStruct
        this.optionalAny = this@TestAllTypesProto3_Impl.optionalAny
        this.optionalValue = this@TestAllTypesProto3_Impl.optionalValue
        this.repeatedDuration += this@TestAllTypesProto3_Impl.repeatedDuration
        this.repeatedTimestamp += this@TestAllTypesProto3_Impl.repeatedTimestamp
        this.repeatedFieldmask += this@TestAllTypesProto3_Impl.repeatedFieldmask
        this.repeatedStruct += this@TestAllTypesProto3_Impl.repeatedStruct
        this.repeatedAny += this@TestAllTypesProto3_Impl.repeatedAny
        this.repeatedValue += this@TestAllTypesProto3_Impl.repeatedValue
        this.repeatedListValue += this@TestAllTypesProto3_Impl.repeatedListValue
        this.fieldname1 = this@TestAllTypesProto3_Impl.fieldname1
        this.fieldName2 = this@TestAllTypesProto3_Impl.fieldName2
        this.fieldName3 = this@TestAllTypesProto3_Impl.fieldName3
        this.field_name4 = this@TestAllTypesProto3_Impl.field_name4
        this.field0name5 = this@TestAllTypesProto3_Impl.field0name5
        this.field0Name6 = this@TestAllTypesProto3_Impl.field0Name6
        this.fieldName7 = this@TestAllTypesProto3_Impl.fieldName7
        this.fieldName8 = this@TestAllTypesProto3_Impl.fieldName8
        this.fieldName9 = this@TestAllTypesProto3_Impl.fieldName9
        this.fieldName10 = this@TestAllTypesProto3_Impl.fieldName10
        this.fIELDNAME11 = this@TestAllTypesProto3_Impl.fIELDNAME11
        this.fIELDName12 = this@TestAllTypesProto3_Impl.fIELDName12
        this._fieldName13 = this@TestAllTypesProto3_Impl._fieldName13
        this._FieldName14 = this@TestAllTypesProto3_Impl._FieldName14
        this.field_name15 = this@TestAllTypesProto3_Impl.field_name15
        this.field_Name16 = this@TestAllTypesProto3_Impl.field_Name16
        this.fieldName17_ = this@TestAllTypesProto3_Impl.fieldName17_
        this.fieldName18_ = this@TestAllTypesProto3_Impl.fieldName18_
        this.oneofField = this@TestAllTypesProto3_Impl.oneofField
        this.unknownFields += this@TestAllTypesProto3_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
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
    ) = pbandk.conformance.pb.TestAllTypesProto3 {
        this.optionalInt32 = optionalInt32
        this.optionalInt64 = optionalInt64
        this.optionalUint32 = optionalUint32
        this.optionalUint64 = optionalUint64
        this.optionalSint32 = optionalSint32
        this.optionalSint64 = optionalSint64
        this.optionalFixed32 = optionalFixed32
        this.optionalFixed64 = optionalFixed64
        this.optionalSfixed32 = optionalSfixed32
        this.optionalSfixed64 = optionalSfixed64
        this.optionalFloat = optionalFloat
        this.optionalDouble = optionalDouble
        this.optionalBool = optionalBool
        this.optionalString = optionalString
        this.optionalBytes = optionalBytes
        this.optionalNestedMessage = optionalNestedMessage
        this.optionalForeignMessage = optionalForeignMessage
        this.optionalNestedEnum = optionalNestedEnum
        this.optionalForeignEnum = optionalForeignEnum
        this.optionalAliasedEnum = optionalAliasedEnum
        this.optionalStringPiece = optionalStringPiece
        this.optionalCord = optionalCord
        this.recursiveMessage = recursiveMessage
        this.repeatedInt32 += repeatedInt32
        this.repeatedInt64 += repeatedInt64
        this.repeatedUint32 += repeatedUint32
        this.repeatedUint64 += repeatedUint64
        this.repeatedSint32 += repeatedSint32
        this.repeatedSint64 += repeatedSint64
        this.repeatedFixed32 += repeatedFixed32
        this.repeatedFixed64 += repeatedFixed64
        this.repeatedSfixed32 += repeatedSfixed32
        this.repeatedSfixed64 += repeatedSfixed64
        this.repeatedFloat += repeatedFloat
        this.repeatedDouble += repeatedDouble
        this.repeatedBool += repeatedBool
        this.repeatedString += repeatedString
        this.repeatedBytes += repeatedBytes
        this.repeatedNestedMessage += repeatedNestedMessage
        this.repeatedForeignMessage += repeatedForeignMessage
        this.repeatedNestedEnum += repeatedNestedEnum
        this.repeatedForeignEnum += repeatedForeignEnum
        this.repeatedStringPiece += repeatedStringPiece
        this.repeatedCord += repeatedCord
        this.packedInt32 += packedInt32
        this.packedInt64 += packedInt64
        this.packedUint32 += packedUint32
        this.packedUint64 += packedUint64
        this.packedSint32 += packedSint32
        this.packedSint64 += packedSint64
        this.packedFixed32 += packedFixed32
        this.packedFixed64 += packedFixed64
        this.packedSfixed32 += packedSfixed32
        this.packedSfixed64 += packedSfixed64
        this.packedFloat += packedFloat
        this.packedDouble += packedDouble
        this.packedBool += packedBool
        this.packedNestedEnum += packedNestedEnum
        this.unpackedInt32 += unpackedInt32
        this.unpackedInt64 += unpackedInt64
        this.unpackedUint32 += unpackedUint32
        this.unpackedUint64 += unpackedUint64
        this.unpackedSint32 += unpackedSint32
        this.unpackedSint64 += unpackedSint64
        this.unpackedFixed32 += unpackedFixed32
        this.unpackedFixed64 += unpackedFixed64
        this.unpackedSfixed32 += unpackedSfixed32
        this.unpackedSfixed64 += unpackedSfixed64
        this.unpackedFloat += unpackedFloat
        this.unpackedDouble += unpackedDouble
        this.unpackedBool += unpackedBool
        this.unpackedNestedEnum += unpackedNestedEnum
        this.mapInt32Int32 += mapInt32Int32
        this.mapInt64Int64 += mapInt64Int64
        this.mapUint32Uint32 += mapUint32Uint32
        this.mapUint64Uint64 += mapUint64Uint64
        this.mapSint32Sint32 += mapSint32Sint32
        this.mapSint64Sint64 += mapSint64Sint64
        this.mapFixed32Fixed32 += mapFixed32Fixed32
        this.mapFixed64Fixed64 += mapFixed64Fixed64
        this.mapSfixed32Sfixed32 += mapSfixed32Sfixed32
        this.mapSfixed64Sfixed64 += mapSfixed64Sfixed64
        this.mapInt32Float += mapInt32Float
        this.mapInt32Double += mapInt32Double
        this.mapBoolBool += mapBoolBool
        this.mapStringString += mapStringString
        this.mapStringBytes += mapStringBytes
        this.mapStringNestedMessage += mapStringNestedMessage
        this.mapStringForeignMessage += mapStringForeignMessage
        this.mapStringNestedEnum += mapStringNestedEnum
        this.mapStringForeignEnum += mapStringForeignEnum
        this.optionalBoolWrapper = optionalBoolWrapper
        this.optionalInt32Wrapper = optionalInt32Wrapper
        this.optionalInt64Wrapper = optionalInt64Wrapper
        this.optionalUint32Wrapper = optionalUint32Wrapper
        this.optionalUint64Wrapper = optionalUint64Wrapper
        this.optionalFloatWrapper = optionalFloatWrapper
        this.optionalDoubleWrapper = optionalDoubleWrapper
        this.optionalStringWrapper = optionalStringWrapper
        this.optionalBytesWrapper = optionalBytesWrapper
        this.repeatedBoolWrapper += repeatedBoolWrapper
        this.repeatedInt32Wrapper += repeatedInt32Wrapper
        this.repeatedInt64Wrapper += repeatedInt64Wrapper
        this.repeatedUint32Wrapper += repeatedUint32Wrapper
        this.repeatedUint64Wrapper += repeatedUint64Wrapper
        this.repeatedFloatWrapper += repeatedFloatWrapper
        this.repeatedDoubleWrapper += repeatedDoubleWrapper
        this.repeatedStringWrapper += repeatedStringWrapper
        this.repeatedBytesWrapper += repeatedBytesWrapper
        this.optionalDuration = optionalDuration
        this.optionalTimestamp = optionalTimestamp
        this.optionalFieldMask = optionalFieldMask
        this.optionalStruct = optionalStruct
        this.optionalAny = optionalAny
        this.optionalValue = optionalValue
        this.repeatedDuration += repeatedDuration
        this.repeatedTimestamp += repeatedTimestamp
        this.repeatedFieldmask += repeatedFieldmask
        this.repeatedStruct += repeatedStruct
        this.repeatedAny += repeatedAny
        this.repeatedValue += repeatedValue
        this.repeatedListValue += repeatedListValue
        this.fieldname1 = fieldname1
        this.fieldName2 = fieldName2
        this.fieldName3 = fieldName3
        this.field_name4 = field_name4
        this.field0name5 = field0name5
        this.field0Name6 = field0Name6
        this.fieldName7 = fieldName7
        this.fieldName8 = fieldName8
        this.fieldName9 = fieldName9
        this.fieldName10 = fieldName10
        this.fIELDNAME11 = fIELDNAME11
        this.fIELDName12 = fIELDName12
        this._fieldName13 = _fieldName13
        this._FieldName14 = _FieldName14
        this.field_name15 = field_name15
        this.field_Name16 = field_Name16
        this.fieldName17_ = fieldName17_
        this.fieldName18_ = fieldName18_
        this.oneofField = oneofField
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
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
    override val repeatedInt32: pbandk.gen.MutableListField<Int>,
    override val repeatedInt64: pbandk.gen.MutableListField<Long>,
    override val repeatedUint32: pbandk.gen.MutableListField<Int>,
    override val repeatedUint64: pbandk.gen.MutableListField<Long>,
    override val repeatedSint32: pbandk.gen.MutableListField<Int>,
    override val repeatedSint64: pbandk.gen.MutableListField<Long>,
    override val repeatedFixed32: pbandk.gen.MutableListField<Int>,
    override val repeatedFixed64: pbandk.gen.MutableListField<Long>,
    override val repeatedSfixed32: pbandk.gen.MutableListField<Int>,
    override val repeatedSfixed64: pbandk.gen.MutableListField<Long>,
    override val repeatedFloat: pbandk.gen.MutableListField<Float>,
    override val repeatedDouble: pbandk.gen.MutableListField<Double>,
    override val repeatedBool: pbandk.gen.MutableListField<Boolean>,
    override val repeatedString: pbandk.gen.MutableListField<String>,
    override val repeatedBytes: pbandk.gen.MutableListField<pbandk.ByteArr>,
    override val repeatedNestedMessage: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>,
    override val repeatedForeignMessage: pbandk.gen.MutableListField<pbandk.conformance.pb.ForeignMessage>,
    override val repeatedNestedEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val repeatedForeignEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.ForeignEnum>,
    override val repeatedStringPiece: pbandk.gen.MutableListField<String>,
    override val repeatedCord: pbandk.gen.MutableListField<String>,
    override val packedInt32: pbandk.gen.MutableListField<Int>,
    override val packedInt64: pbandk.gen.MutableListField<Long>,
    override val packedUint32: pbandk.gen.MutableListField<Int>,
    override val packedUint64: pbandk.gen.MutableListField<Long>,
    override val packedSint32: pbandk.gen.MutableListField<Int>,
    override val packedSint64: pbandk.gen.MutableListField<Long>,
    override val packedFixed32: pbandk.gen.MutableListField<Int>,
    override val packedFixed64: pbandk.gen.MutableListField<Long>,
    override val packedSfixed32: pbandk.gen.MutableListField<Int>,
    override val packedSfixed64: pbandk.gen.MutableListField<Long>,
    override val packedFloat: pbandk.gen.MutableListField<Float>,
    override val packedDouble: pbandk.gen.MutableListField<Double>,
    override val packedBool: pbandk.gen.MutableListField<Boolean>,
    override val packedNestedEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val unpackedInt32: pbandk.gen.MutableListField<Int>,
    override val unpackedInt64: pbandk.gen.MutableListField<Long>,
    override val unpackedUint32: pbandk.gen.MutableListField<Int>,
    override val unpackedUint64: pbandk.gen.MutableListField<Long>,
    override val unpackedSint32: pbandk.gen.MutableListField<Int>,
    override val unpackedSint64: pbandk.gen.MutableListField<Long>,
    override val unpackedFixed32: pbandk.gen.MutableListField<Int>,
    override val unpackedFixed64: pbandk.gen.MutableListField<Long>,
    override val unpackedSfixed32: pbandk.gen.MutableListField<Int>,
    override val unpackedSfixed64: pbandk.gen.MutableListField<Long>,
    override val unpackedFloat: pbandk.gen.MutableListField<Float>,
    override val unpackedDouble: pbandk.gen.MutableListField<Double>,
    override val unpackedBool: pbandk.gen.MutableListField<Boolean>,
    override val unpackedNestedEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val mapInt32Int32: pbandk.gen.MutableMapField<Int, Int>,
    override val mapInt64Int64: pbandk.gen.MutableMapField<Long, Long>,
    override val mapUint32Uint32: pbandk.gen.MutableMapField<Int, Int>,
    override val mapUint64Uint64: pbandk.gen.MutableMapField<Long, Long>,
    override val mapSint32Sint32: pbandk.gen.MutableMapField<Int, Int>,
    override val mapSint64Sint64: pbandk.gen.MutableMapField<Long, Long>,
    override val mapFixed32Fixed32: pbandk.gen.MutableMapField<Int, Int>,
    override val mapFixed64Fixed64: pbandk.gen.MutableMapField<Long, Long>,
    override val mapSfixed32Sfixed32: pbandk.gen.MutableMapField<Int, Int>,
    override val mapSfixed64Sfixed64: pbandk.gen.MutableMapField<Long, Long>,
    override val mapInt32Float: pbandk.gen.MutableMapField<Int, Float>,
    override val mapInt32Double: pbandk.gen.MutableMapField<Int, Double>,
    override val mapBoolBool: pbandk.gen.MutableMapField<Boolean, Boolean>,
    override val mapStringString: pbandk.gen.MutableMapField<String, String>,
    override val mapStringBytes: pbandk.gen.MutableMapField<String, pbandk.ByteArr>,
    override val mapStringNestedMessage: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>,
    override val mapStringForeignMessage: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.ForeignMessage?>,
    override val mapStringNestedEnum: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>,
    override val mapStringForeignEnum: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.ForeignEnum>,
    override var optionalBoolWrapper: Boolean?,
    override var optionalInt32Wrapper: Int?,
    override var optionalInt64Wrapper: Long?,
    override var optionalUint32Wrapper: Int?,
    override var optionalUint64Wrapper: Long?,
    override var optionalFloatWrapper: Float?,
    override var optionalDoubleWrapper: Double?,
    override var optionalStringWrapper: String?,
    override var optionalBytesWrapper: pbandk.ByteArr?,
    override val repeatedBoolWrapper: pbandk.gen.MutableListField<Boolean>,
    override val repeatedInt32Wrapper: pbandk.gen.MutableListField<Int>,
    override val repeatedInt64Wrapper: pbandk.gen.MutableListField<Long>,
    override val repeatedUint32Wrapper: pbandk.gen.MutableListField<Int>,
    override val repeatedUint64Wrapper: pbandk.gen.MutableListField<Long>,
    override val repeatedFloatWrapper: pbandk.gen.MutableListField<Float>,
    override val repeatedDoubleWrapper: pbandk.gen.MutableListField<Double>,
    override val repeatedStringWrapper: pbandk.gen.MutableListField<String>,
    override val repeatedBytesWrapper: pbandk.gen.MutableListField<pbandk.ByteArr>,
    override var optionalDuration: pbandk.wkt.Duration?,
    override var optionalTimestamp: pbandk.wkt.Timestamp?,
    override var optionalFieldMask: pbandk.wkt.FieldMask?,
    override var optionalStruct: pbandk.wkt.Struct?,
    override var optionalAny: pbandk.wkt.Any?,
    override var optionalValue: pbandk.wkt.Value?,
    override val repeatedDuration: pbandk.gen.MutableListField<pbandk.wkt.Duration>,
    override val repeatedTimestamp: pbandk.gen.MutableListField<pbandk.wkt.Timestamp>,
    override val repeatedFieldmask: pbandk.gen.MutableListField<pbandk.wkt.FieldMask>,
    override val repeatedStruct: pbandk.gen.MutableListField<pbandk.wkt.Struct>,
    override val repeatedAny: pbandk.gen.MutableListField<pbandk.wkt.Any>,
    override val repeatedValue: pbandk.gen.MutableListField<pbandk.wkt.Value>,
    override val repeatedListValue: pbandk.gen.MutableListField<pbandk.wkt.ListValue>,
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
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.MutableTestAllTypesProto3, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.TestAllTypesProto3>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto3.descriptor

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

    override fun copy(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto3.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
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
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toTestAllTypesProto3() = TestAllTypesProto3_Impl(
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
        repeatedInt32 = repeatedInt32.toListField(),
        repeatedInt64 = repeatedInt64.toListField(),
        repeatedUint32 = repeatedUint32.toListField(),
        repeatedUint64 = repeatedUint64.toListField(),
        repeatedSint32 = repeatedSint32.toListField(),
        repeatedSint64 = repeatedSint64.toListField(),
        repeatedFixed32 = repeatedFixed32.toListField(),
        repeatedFixed64 = repeatedFixed64.toListField(),
        repeatedSfixed32 = repeatedSfixed32.toListField(),
        repeatedSfixed64 = repeatedSfixed64.toListField(),
        repeatedFloat = repeatedFloat.toListField(),
        repeatedDouble = repeatedDouble.toListField(),
        repeatedBool = repeatedBool.toListField(),
        repeatedString = repeatedString.toListField(),
        repeatedBytes = repeatedBytes.toListField(),
        repeatedNestedMessage = repeatedNestedMessage.toListField(),
        repeatedForeignMessage = repeatedForeignMessage.toListField(),
        repeatedNestedEnum = repeatedNestedEnum.toListField(),
        repeatedForeignEnum = repeatedForeignEnum.toListField(),
        repeatedStringPiece = repeatedStringPiece.toListField(),
        repeatedCord = repeatedCord.toListField(),
        packedInt32 = packedInt32.toListField(),
        packedInt64 = packedInt64.toListField(),
        packedUint32 = packedUint32.toListField(),
        packedUint64 = packedUint64.toListField(),
        packedSint32 = packedSint32.toListField(),
        packedSint64 = packedSint64.toListField(),
        packedFixed32 = packedFixed32.toListField(),
        packedFixed64 = packedFixed64.toListField(),
        packedSfixed32 = packedSfixed32.toListField(),
        packedSfixed64 = packedSfixed64.toListField(),
        packedFloat = packedFloat.toListField(),
        packedDouble = packedDouble.toListField(),
        packedBool = packedBool.toListField(),
        packedNestedEnum = packedNestedEnum.toListField(),
        unpackedInt32 = unpackedInt32.toListField(),
        unpackedInt64 = unpackedInt64.toListField(),
        unpackedUint32 = unpackedUint32.toListField(),
        unpackedUint64 = unpackedUint64.toListField(),
        unpackedSint32 = unpackedSint32.toListField(),
        unpackedSint64 = unpackedSint64.toListField(),
        unpackedFixed32 = unpackedFixed32.toListField(),
        unpackedFixed64 = unpackedFixed64.toListField(),
        unpackedSfixed32 = unpackedSfixed32.toListField(),
        unpackedSfixed64 = unpackedSfixed64.toListField(),
        unpackedFloat = unpackedFloat.toListField(),
        unpackedDouble = unpackedDouble.toListField(),
        unpackedBool = unpackedBool.toListField(),
        unpackedNestedEnum = unpackedNestedEnum.toListField(),
        mapInt32Int32 = mapInt32Int32.toMapField(),
        mapInt64Int64 = mapInt64Int64.toMapField(),
        mapUint32Uint32 = mapUint32Uint32.toMapField(),
        mapUint64Uint64 = mapUint64Uint64.toMapField(),
        mapSint32Sint32 = mapSint32Sint32.toMapField(),
        mapSint64Sint64 = mapSint64Sint64.toMapField(),
        mapFixed32Fixed32 = mapFixed32Fixed32.toMapField(),
        mapFixed64Fixed64 = mapFixed64Fixed64.toMapField(),
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32.toMapField(),
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64.toMapField(),
        mapInt32Float = mapInt32Float.toMapField(),
        mapInt32Double = mapInt32Double.toMapField(),
        mapBoolBool = mapBoolBool.toMapField(),
        mapStringString = mapStringString.toMapField(),
        mapStringBytes = mapStringBytes.toMapField(),
        mapStringNestedMessage = mapStringNestedMessage.toMapField(),
        mapStringForeignMessage = mapStringForeignMessage.toMapField(),
        mapStringNestedEnum = mapStringNestedEnum.toMapField(),
        mapStringForeignEnum = mapStringForeignEnum.toMapField(),
        optionalBoolWrapper = optionalBoolWrapper,
        optionalInt32Wrapper = optionalInt32Wrapper,
        optionalInt64Wrapper = optionalInt64Wrapper,
        optionalUint32Wrapper = optionalUint32Wrapper,
        optionalUint64Wrapper = optionalUint64Wrapper,
        optionalFloatWrapper = optionalFloatWrapper,
        optionalDoubleWrapper = optionalDoubleWrapper,
        optionalStringWrapper = optionalStringWrapper,
        optionalBytesWrapper = optionalBytesWrapper,
        repeatedBoolWrapper = repeatedBoolWrapper.toListField(),
        repeatedInt32Wrapper = repeatedInt32Wrapper.toListField(),
        repeatedInt64Wrapper = repeatedInt64Wrapper.toListField(),
        repeatedUint32Wrapper = repeatedUint32Wrapper.toListField(),
        repeatedUint64Wrapper = repeatedUint64Wrapper.toListField(),
        repeatedFloatWrapper = repeatedFloatWrapper.toListField(),
        repeatedDoubleWrapper = repeatedDoubleWrapper.toListField(),
        repeatedStringWrapper = repeatedStringWrapper.toListField(),
        repeatedBytesWrapper = repeatedBytesWrapper.toListField(),
        optionalDuration = optionalDuration,
        optionalTimestamp = optionalTimestamp,
        optionalFieldMask = optionalFieldMask,
        optionalStruct = optionalStruct,
        optionalAny = optionalAny,
        optionalValue = optionalValue,
        repeatedDuration = repeatedDuration.toListField(),
        repeatedTimestamp = repeatedTimestamp.toListField(),
        repeatedFieldmask = repeatedFieldmask.toListField(),
        repeatedStruct = repeatedStruct.toListField(),
        repeatedAny = repeatedAny.toListField(),
        repeatedValue = repeatedValue.toListField(),
        repeatedListValue = repeatedListValue.toListField(),
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
        unknownFields = unknownFields.toMap()
    )
}

private fun TestAllTypesProto3.protoMergeImpl(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3 {
    if (other !is pbandk.conformance.pb.TestAllTypesProto3) return this

    return copy {
        optionalInt32 = other.optionalInt32
        optionalInt64 = other.optionalInt64
        optionalUint32 = other.optionalUint32
        optionalUint64 = other.optionalUint64
        optionalSint32 = other.optionalSint32
        optionalSint64 = other.optionalSint64
        optionalFixed32 = other.optionalFixed32
        optionalFixed64 = other.optionalFixed64
        optionalSfixed32 = other.optionalSfixed32
        optionalSfixed64 = other.optionalSfixed64
        optionalFloat = other.optionalFloat
        optionalDouble = other.optionalDouble
        optionalBool = other.optionalBool
        optionalString = other.optionalString
        optionalBytes = other.optionalBytes
        optionalNestedMessage = optionalNestedMessage?.plus(other.optionalNestedMessage) ?: other.optionalNestedMessage
        optionalForeignMessage = optionalForeignMessage?.plus(other.optionalForeignMessage) ?: other.optionalForeignMessage
        optionalNestedEnum = other.optionalNestedEnum
        optionalForeignEnum = other.optionalForeignEnum
        optionalAliasedEnum = other.optionalAliasedEnum
        optionalStringPiece = other.optionalStringPiece
        optionalCord = other.optionalCord
        recursiveMessage = recursiveMessage?.plus(other.recursiveMessage) ?: other.recursiveMessage
        repeatedInt32 += other.repeatedInt32
        repeatedInt64 += other.repeatedInt64
        repeatedUint32 += other.repeatedUint32
        repeatedUint64 += other.repeatedUint64
        repeatedSint32 += other.repeatedSint32
        repeatedSint64 += other.repeatedSint64
        repeatedFixed32 += other.repeatedFixed32
        repeatedFixed64 += other.repeatedFixed64
        repeatedSfixed32 += other.repeatedSfixed32
        repeatedSfixed64 += other.repeatedSfixed64
        repeatedFloat += other.repeatedFloat
        repeatedDouble += other.repeatedDouble
        repeatedBool += other.repeatedBool
        repeatedString += other.repeatedString
        repeatedBytes += other.repeatedBytes
        repeatedNestedMessage += other.repeatedNestedMessage
        repeatedForeignMessage += other.repeatedForeignMessage
        repeatedNestedEnum += other.repeatedNestedEnum
        repeatedForeignEnum += other.repeatedForeignEnum
        repeatedStringPiece += other.repeatedStringPiece
        repeatedCord += other.repeatedCord
        packedInt32 += other.packedInt32
        packedInt64 += other.packedInt64
        packedUint32 += other.packedUint32
        packedUint64 += other.packedUint64
        packedSint32 += other.packedSint32
        packedSint64 += other.packedSint64
        packedFixed32 += other.packedFixed32
        packedFixed64 += other.packedFixed64
        packedSfixed32 += other.packedSfixed32
        packedSfixed64 += other.packedSfixed64
        packedFloat += other.packedFloat
        packedDouble += other.packedDouble
        packedBool += other.packedBool
        packedNestedEnum += other.packedNestedEnum
        unpackedInt32 += other.unpackedInt32
        unpackedInt64 += other.unpackedInt64
        unpackedUint32 += other.unpackedUint32
        unpackedUint64 += other.unpackedUint64
        unpackedSint32 += other.unpackedSint32
        unpackedSint64 += other.unpackedSint64
        unpackedFixed32 += other.unpackedFixed32
        unpackedFixed64 += other.unpackedFixed64
        unpackedSfixed32 += other.unpackedSfixed32
        unpackedSfixed64 += other.unpackedSfixed64
        unpackedFloat += other.unpackedFloat
        unpackedDouble += other.unpackedDouble
        unpackedBool += other.unpackedBool
        unpackedNestedEnum += other.unpackedNestedEnum
        mapInt32Int32 += other.mapInt32Int32
        mapInt64Int64 += other.mapInt64Int64
        mapUint32Uint32 += other.mapUint32Uint32
        mapUint64Uint64 += other.mapUint64Uint64
        mapSint32Sint32 += other.mapSint32Sint32
        mapSint64Sint64 += other.mapSint64Sint64
        mapFixed32Fixed32 += other.mapFixed32Fixed32
        mapFixed64Fixed64 += other.mapFixed64Fixed64
        mapSfixed32Sfixed32 += other.mapSfixed32Sfixed32
        mapSfixed64Sfixed64 += other.mapSfixed64Sfixed64
        mapInt32Float += other.mapInt32Float
        mapInt32Double += other.mapInt32Double
        mapBoolBool += other.mapBoolBool
        mapStringString += other.mapStringString
        mapStringBytes += other.mapStringBytes
        mapStringNestedMessage += other.mapStringNestedMessage
        mapStringForeignMessage += other.mapStringForeignMessage
        mapStringNestedEnum += other.mapStringNestedEnum
        mapStringForeignEnum += other.mapStringForeignEnum
        optionalBoolWrapper = other.optionalBoolWrapper ?: optionalBoolWrapper
        optionalInt32Wrapper = other.optionalInt32Wrapper ?: optionalInt32Wrapper
        optionalInt64Wrapper = other.optionalInt64Wrapper ?: optionalInt64Wrapper
        optionalUint32Wrapper = other.optionalUint32Wrapper ?: optionalUint32Wrapper
        optionalUint64Wrapper = other.optionalUint64Wrapper ?: optionalUint64Wrapper
        optionalFloatWrapper = other.optionalFloatWrapper ?: optionalFloatWrapper
        optionalDoubleWrapper = other.optionalDoubleWrapper ?: optionalDoubleWrapper
        optionalStringWrapper = other.optionalStringWrapper ?: optionalStringWrapper
        optionalBytesWrapper = other.optionalBytesWrapper ?: optionalBytesWrapper
        repeatedBoolWrapper += other.repeatedBoolWrapper
        repeatedInt32Wrapper += other.repeatedInt32Wrapper
        repeatedInt64Wrapper += other.repeatedInt64Wrapper
        repeatedUint32Wrapper += other.repeatedUint32Wrapper
        repeatedUint64Wrapper += other.repeatedUint64Wrapper
        repeatedFloatWrapper += other.repeatedFloatWrapper
        repeatedDoubleWrapper += other.repeatedDoubleWrapper
        repeatedStringWrapper += other.repeatedStringWrapper
        repeatedBytesWrapper += other.repeatedBytesWrapper
        optionalDuration = optionalDuration?.plus(other.optionalDuration) ?: other.optionalDuration
        optionalTimestamp = optionalTimestamp?.plus(other.optionalTimestamp) ?: other.optionalTimestamp
        optionalFieldMask = optionalFieldMask?.plus(other.optionalFieldMask) ?: other.optionalFieldMask
        optionalStruct = optionalStruct?.plus(other.optionalStruct) ?: other.optionalStruct
        optionalAny = optionalAny?.plus(other.optionalAny) ?: other.optionalAny
        optionalValue = optionalValue?.plus(other.optionalValue) ?: other.optionalValue
        repeatedDuration += other.repeatedDuration
        repeatedTimestamp += other.repeatedTimestamp
        repeatedFieldmask += other.repeatedFieldmask
        repeatedStruct += other.repeatedStruct
        repeatedAny += other.repeatedAny
        repeatedValue += other.repeatedValue
        repeatedListValue += other.repeatedListValue
        fieldname1 = other.fieldname1
        fieldName2 = other.fieldName2
        fieldName3 = other.fieldName3
        field_name4 = other.field_name4
        field0name5 = other.field0name5
        field0Name6 = other.field0Name6
        fieldName7 = other.fieldName7
        fieldName8 = other.fieldName8
        fieldName9 = other.fieldName9
        fieldName10 = other.fieldName10
        fIELDNAME11 = other.fIELDNAME11
        fIELDName12 = other.fIELDName12
        _fieldName13 = other._fieldName13
        _FieldName14 = other._FieldName14
        field_name15 = other.field_name15
        field_Name16 = other.field_Name16
        fieldName17_ = other.fieldName17_
        fieldName18_ = other.fieldName18_
        when (other.oneofField) {
            is TestAllTypesProto3.OneofField.OneofUint32 -> oneofUint32 = other.oneofUint32
            is TestAllTypesProto3.OneofField.OneofNestedMessage -> oneofNestedMessage = oneofNestedMessage?.plus(other.oneofNestedMessage) ?: other.oneofNestedMessage
            is TestAllTypesProto3.OneofField.OneofString -> oneofString = other.oneofString
            is TestAllTypesProto3.OneofField.OneofBytes -> oneofBytes = other.oneofBytes
            is TestAllTypesProto3.OneofField.OneofBool -> oneofBool = other.oneofBool
            is TestAllTypesProto3.OneofField.OneofUint64 -> oneofUint64 = other.oneofUint64
            is TestAllTypesProto3.OneofField.OneofFloat -> oneofFloat = other.oneofFloat
            is TestAllTypesProto3.OneofField.OneofDouble -> oneofDouble = other.oneofDouble
            is TestAllTypesProto3.OneofField.OneofEnum -> oneofEnum = other.oneofEnum
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use TestAllTypesProto3.NestedMessage { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.TestAllTypesProto3.NestedMessage"],
        expression = "TestAllTypesProto3.NestedMessage {\nthis.a = a\nthis.corecursive = corecursive\nthis.unknownFields += unknownFields\n}",
    )
)
public fun TestAllTypesProto3.Companion.NestedMessage(
    a: Int = 0,
    corecursive: pbandk.conformance.pb.TestAllTypesProto3? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = pbandk.conformance.pb.TestAllTypesProto3.Companion.NestedMessage {
    this.a = a
    this.corecursive = corecursive
    this.unknownFields += unknownFields
}

/**
 * The [MutableNestedMessage] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto3NestedMessage")
public fun TestAllTypesProto3.Companion.NestedMessage(builderAction: pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage.() -> Unit): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = pbandk.conformance.pb.TestAllTypesProto3_MutableNestedMessage_Impl(
    a = 0,
    corecursive = null,
    unknownFields = mutableMapOf()
).also(builderAction).toNestedMessage()

/**
 * The [MutableNestedMessage] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableTestAllTypesProto3.NestedMessage(builderAction: pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage.() -> Unit): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage =
    pbandk.conformance.pb.TestAllTypesProto3.NestedMessage(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto3NestedMessage")
public fun TestAllTypesProto3.NestedMessage?.orDefault(): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage = this ?: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.defaultInstance

private class TestAllTypesProto3_NestedMessage_Impl(
    override val a: Int,
    override val corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto3.NestedMessage, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.descriptor

    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage.() -> Unit) = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage {
        this.a = this@TestAllTypesProto3_NestedMessage_Impl.a
        this.corecursive = this@TestAllTypesProto3_NestedMessage_Impl.corecursive
        this.unknownFields += this@TestAllTypesProto3_NestedMessage_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: Int,
        corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage {
        this.a = a
        this.corecursive = corecursive
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class TestAllTypesProto3_MutableNestedMessage_Impl(
    override var a: Int,
    override var corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.descriptor

    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto3.MutableNestedMessage.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: Int,
        corecursive: pbandk.conformance.pb.TestAllTypesProto3?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toNestedMessage() = TestAllTypesProto3_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields.toMap()
    )
}

private fun TestAllTypesProto3.NestedMessage.protoMergeImpl(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto3.NestedMessage {
    if (other !is pbandk.conformance.pb.TestAllTypesProto3.NestedMessage) return this

    return copy {
        a = other.a
        corecursive = corecursive?.plus(other.corecursive) ?: other.corecursive
        unknownFields += other.unknownFields
    }
}

@Deprecated(
    message = "Use ForeignMessage { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.ForeignMessage"],
        expression = "ForeignMessage {\nthis.c = c\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ForeignMessage(
    c: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.ForeignMessage = pbandk.conformance.pb.ForeignMessage {
    this.c = c
    this.unknownFields += unknownFields
}

/**
 * The [MutableForeignMessage] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildForeignMessage")
public fun ForeignMessage(builderAction: pbandk.conformance.pb.MutableForeignMessage.() -> Unit): pbandk.conformance.pb.ForeignMessage = pbandk.conformance.pb.MutableForeignMessage_Impl(
    c = 0,
    unknownFields = mutableMapOf()
).also(builderAction).toForeignMessage()

@pbandk.Export
@pbandk.JsName("orDefaultForForeignMessage")
public fun ForeignMessage?.orDefault(): pbandk.conformance.pb.ForeignMessage = this ?: pbandk.conformance.pb.ForeignMessage.defaultInstance

private class ForeignMessage_Impl(
    override val c: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.ForeignMessage, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.ForeignMessage>() {
    override val descriptor get() = pbandk.conformance.pb.ForeignMessage.descriptor

    override fun copy(builderAction: pbandk.conformance.pb.MutableForeignMessage.() -> Unit) = pbandk.conformance.pb.ForeignMessage {
        this.c = this@ForeignMessage_Impl.c
        this.unknownFields += this@ForeignMessage_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        c: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.ForeignMessage {
        this.c = c
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableForeignMessage_Impl(
    override var c: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.MutableForeignMessage, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.ForeignMessage>() {
    override val descriptor get() = pbandk.conformance.pb.ForeignMessage.descriptor

    override fun copy(builderAction: pbandk.conformance.pb.MutableForeignMessage.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        c: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toForeignMessage() = ForeignMessage_Impl(
        c = c,
        unknownFields = unknownFields.toMap()
    )
}

private fun ForeignMessage.protoMergeImpl(other: pbandk.Message?): pbandk.conformance.pb.ForeignMessage {
    if (other !is pbandk.conformance.pb.ForeignMessage) return this

    return copy {
        c = other.c
        unknownFields += other.unknownFields
    }
}

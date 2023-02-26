@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

public sealed interface ForeignEnumProto2 : pbandk.Message.Enum {
    override val descriptor: pbandk.EnumDescriptor<pbandk.conformance.pb.ForeignEnumProto2>
        get() = pbandk.conformance.pb.ForeignEnumProto2.descriptor

    public object FOREIGN_FOO : ForeignEnumProto2, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.ForeignEnumProto2>(
        value = 0,
        name = "FOREIGN_FOO",
    )
    public object FOREIGN_BAR : ForeignEnumProto2, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.ForeignEnumProto2>(
        value = 1,
        name = "FOREIGN_BAR",
    )
    public object FOREIGN_BAZ : ForeignEnumProto2, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.ForeignEnumProto2>(
        value = 2,
        name = "FOREIGN_BAZ",
    )
    public class UNRECOGNIZED(value: Int? = null, name: String? = null)
        : ForeignEnumProto2, pbandk.gen.UnrecognizedEnumValue<pbandk.conformance.pb.ForeignEnumProto2>(value, name)

    public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.ForeignEnumProto2> {
        override val descriptor: pbandk.EnumDescriptor<pbandk.conformance.pb.ForeignEnumProto2> =
            pbandk.EnumDescriptor.of(
                fullName = "protobuf_test_messages.proto2.ForeignEnumProto2",
                enumClass = pbandk.conformance.pb.ForeignEnumProto2::class,
                enumCompanion = this,
            )
        public val values: List<ForeignEnumProto2> by lazy(LazyThreadSafetyMode.PUBLICATION) {
            listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ)
        }

        override fun fromValue(value: Int): pbandk.conformance.pb.ForeignEnumProto2 =
            values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

        override fun fromName(name: String): pbandk.conformance.pb.ForeignEnumProto2 =
            values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
    }
}

public sealed interface TestAllTypesProto2 : pbandk.ExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2> {
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
    public val mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>
    public val mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessageProto2>
    public val mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public val mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnumProto2>
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

    /**
     * The [MutableTestAllTypesProto2] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto2.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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
        mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> = this.mapStringNestedMessage,
        mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessageProto2> = this.mapStringForeignMessage,
        mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = this.mapStringNestedEnum,
        mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnumProto2> = this.mapStringForeignEnum,
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

    public sealed interface OneofField<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class OneofUint32(oneofUint32: Int = 0) :
            OneofField<Int>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, Int>(oneofUint32, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofUint32)
        public class OneofNestedMessage(oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage) :
            OneofField<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>(oneofNestedMessage, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofNestedMessage)
        public class OneofString(oneofString: String = "") :
            OneofField<String>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, String>(oneofString, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofString)
        public class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) :
            OneofField<pbandk.ByteArr>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, pbandk.ByteArr>(oneofBytes, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofBytes)
        public class OneofBool(oneofBool: Boolean = false) :
            OneofField<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, Boolean>(oneofBool, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofBool)
        public class OneofUint64(oneofUint64: Long = 0L) :
            OneofField<Long>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, Long>(oneofUint64, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofUint64)
        public class OneofFloat(oneofFloat: Float = 0.0F) :
            OneofField<Float>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, Float>(oneofFloat, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofFloat)
        public class OneofDouble(oneofDouble: Double = 0.0) :
            OneofField<Double>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, Double>(oneofDouble, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofDouble)
        public class OneofEnum(oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0)) :
            OneofField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>, pbandk.gen.GeneratedOneOf<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(oneofEnum, pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofEnum)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val optionalInt32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_int32",
                number = 1,
                valueType = pbandk.types.int32(),
                jsonName = "optionalInt32",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalInt32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalInt32,
            )
        public val optionalInt64: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_int64",
                number = 2,
                valueType = pbandk.types.int64(),
                jsonName = "optionalInt64",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalInt64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalInt64,
            )
        public val optionalUint32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_uint32",
                number = 3,
                valueType = pbandk.types.uint32(),
                jsonName = "optionalUint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalUint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalUint32,
            )
        public val optionalUint64: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_uint64",
                number = 4,
                valueType = pbandk.types.uint64(),
                jsonName = "optionalUint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalUint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalUint64,
            )
        public val optionalSint32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_sint32",
                number = 5,
                valueType = pbandk.types.sint32(),
                jsonName = "optionalSint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalSint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalSint32,
            )
        public val optionalSint64: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_sint64",
                number = 6,
                valueType = pbandk.types.sint64(),
                jsonName = "optionalSint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalSint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalSint64,
            )
        public val optionalFixed32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_fixed32",
                number = 7,
                valueType = pbandk.types.fixed32(),
                jsonName = "optionalFixed32",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalFixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalFixed32,
            )
        public val optionalFixed64: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_fixed64",
                number = 8,
                valueType = pbandk.types.fixed64(),
                jsonName = "optionalFixed64",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalFixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalFixed64,
            )
        public val optionalSfixed32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_sfixed32",
                number = 9,
                valueType = pbandk.types.sfixed32(),
                jsonName = "optionalSfixed32",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalSfixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalSfixed32,
            )
        public val optionalSfixed64: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Long?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_sfixed64",
                number = 10,
                valueType = pbandk.types.sfixed64(),
                jsonName = "optionalSfixed64",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalSfixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalSfixed64,
            )
        public val optionalFloat: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Float?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_float",
                number = 11,
                valueType = pbandk.types.float(),
                jsonName = "optionalFloat",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalFloat,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalFloat,
            )
        public val optionalDouble: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Double?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_double",
                number = 12,
                valueType = pbandk.types.double(),
                jsonName = "optionalDouble",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalDouble,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalDouble,
            )
        public val optionalBool: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_bool",
                number = 13,
                valueType = pbandk.types.bool(),
                jsonName = "optionalBool",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalBool,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalBool,
            )
        public val optionalString: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_string",
                number = 14,
                valueType = pbandk.types.string(),
                jsonName = "optionalString",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalString,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalString,
            )
        public val optionalBytes: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_bytes",
                number = 15,
                valueType = pbandk.types.bytes(),
                jsonName = "optionalBytes",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalBytes,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalBytes,
            )
        public val optionalNestedMessage: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_nested_message",
                number = 18,
                valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage),
                jsonName = "optionalNestedMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalNestedMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalNestedMessage,
            )
        public val optionalForeignMessage: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.ForeignMessageProto2?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_foreign_message",
                number = 19,
                valueType = pbandk.types.message(pbandk.conformance.pb.ForeignMessageProto2),
                jsonName = "optionalForeignMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalForeignMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalForeignMessage,
            )
        public val optionalNestedEnum: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_nested_enum",
                number = 21,
                valueType = pbandk.types.enum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum),
                jsonName = "optionalNestedEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalNestedEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalNestedEnum,
            )
        public val optionalForeignEnum: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.ForeignEnumProto2?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_foreign_enum",
                number = 22,
                valueType = pbandk.types.enum(pbandk.conformance.pb.ForeignEnumProto2),
                jsonName = "optionalForeignEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalForeignEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalForeignEnum,
            )
        public val optionalStringPiece: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_string_piece",
                number = 24,
                valueType = pbandk.types.string(),
                jsonName = "optionalStringPiece",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalStringPiece,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalStringPiece,
            )
        public val optionalCord: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "optional_cord",
                number = 25,
                valueType = pbandk.types.string(),
                jsonName = "optionalCord",
                value = pbandk.conformance.pb.TestAllTypesProto2::optionalCord,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::optionalCord,
            )
        public val recursiveMessage: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "recursive_message",
                number = 27,
                valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2, recursive = true),
                jsonName = "recursiveMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::recursiveMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::recursiveMessage,
            )
        public val repeatedInt32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_int32",
                number = 31,
                valueType = pbandk.types.int32(),
                jsonName = "repeatedInt32",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedInt32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedInt32,
            )
        public val repeatedInt64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_int64",
                number = 32,
                valueType = pbandk.types.int64(),
                jsonName = "repeatedInt64",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedInt64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedInt64,
            )
        public val repeatedUint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_uint32",
                number = 33,
                valueType = pbandk.types.uint32(),
                jsonName = "repeatedUint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedUint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedUint32,
            )
        public val repeatedUint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_uint64",
                number = 34,
                valueType = pbandk.types.uint64(),
                jsonName = "repeatedUint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedUint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedUint64,
            )
        public val repeatedSint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_sint32",
                number = 35,
                valueType = pbandk.types.sint32(),
                jsonName = "repeatedSint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedSint32,
            )
        public val repeatedSint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_sint64",
                number = 36,
                valueType = pbandk.types.sint64(),
                jsonName = "repeatedSint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedSint64,
            )
        public val repeatedFixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_fixed32",
                number = 37,
                valueType = pbandk.types.fixed32(),
                jsonName = "repeatedFixed32",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedFixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedFixed32,
            )
        public val repeatedFixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_fixed64",
                number = 38,
                valueType = pbandk.types.fixed64(),
                jsonName = "repeatedFixed64",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedFixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedFixed64,
            )
        public val repeatedSfixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_sfixed32",
                number = 39,
                valueType = pbandk.types.sfixed32(),
                jsonName = "repeatedSfixed32",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSfixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedSfixed32,
            )
        public val repeatedSfixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_sfixed64",
                number = 40,
                valueType = pbandk.types.sfixed64(),
                jsonName = "repeatedSfixed64",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedSfixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedSfixed64,
            )
        public val repeatedFloat: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Float>, MutableList<Float>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_float",
                number = 41,
                valueType = pbandk.types.float(),
                jsonName = "repeatedFloat",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedFloat,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedFloat,
            )
        public val repeatedDouble: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Double>, MutableList<Double>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_double",
                number = 42,
                valueType = pbandk.types.double(),
                jsonName = "repeatedDouble",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedDouble,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedDouble,
            )
        public val repeatedBool: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Boolean>, MutableList<Boolean>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_bool",
                number = 43,
                valueType = pbandk.types.bool(),
                jsonName = "repeatedBool",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedBool,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedBool,
            )
        public val repeatedString: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_string",
                number = 44,
                valueType = pbandk.types.string(),
                jsonName = "repeatedString",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedString,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedString,
            )
        public val repeatedBytes: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.ByteArr>, MutableList<pbandk.ByteArr>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_bytes",
                number = 45,
                valueType = pbandk.types.bytes(),
                jsonName = "repeatedBytes",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedBytes,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedBytes,
            )
        public val repeatedNestedMessage: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>, MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_nested_message",
                number = 48,
                valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage),
                jsonName = "repeatedNestedMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedNestedMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedNestedMessage,
            )
        public val repeatedForeignMessage: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.conformance.pb.ForeignMessageProto2>, MutableList<pbandk.conformance.pb.ForeignMessageProto2>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_foreign_message",
                number = 49,
                valueType = pbandk.types.message(pbandk.conformance.pb.ForeignMessageProto2),
                jsonName = "repeatedForeignMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedForeignMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedForeignMessage,
            )
        public val repeatedNestedEnum: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>, MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_nested_enum",
                number = 51,
                valueType = pbandk.types.enum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum),
                jsonName = "repeatedNestedEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedNestedEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedNestedEnum,
            )
        public val repeatedForeignEnum: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.conformance.pb.ForeignEnumProto2>, MutableList<pbandk.conformance.pb.ForeignEnumProto2>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_foreign_enum",
                number = 52,
                valueType = pbandk.types.enum(pbandk.conformance.pb.ForeignEnumProto2),
                jsonName = "repeatedForeignEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedForeignEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedForeignEnum,
            )
        public val repeatedStringPiece: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_string_piece",
                number = 54,
                valueType = pbandk.types.string(),
                jsonName = "repeatedStringPiece",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedStringPiece,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedStringPiece,
            )
        public val repeatedCord: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<String>, MutableList<String>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "repeated_cord",
                number = 55,
                valueType = pbandk.types.string(),
                jsonName = "repeatedCord",
                value = pbandk.conformance.pb.TestAllTypesProto2::repeatedCord,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::repeatedCord,
            )
        public val mapInt32Int32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Int>, MutableMap<Int, Int>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_int32_int32",
                number = 56,
                keyType = pbandk.types.int32(),
                valueType = pbandk.types.int32(),
                jsonName = "mapInt32Int32",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapInt32Int32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapInt32Int32,
            )
        public val mapInt64Int64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Long, Long>, MutableMap<Long, Long>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_int64_int64",
                number = 57,
                keyType = pbandk.types.int64(),
                valueType = pbandk.types.int64(),
                jsonName = "mapInt64Int64",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapInt64Int64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapInt64Int64,
            )
        public val mapUint32Uint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Int>, MutableMap<Int, Int>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_uint32_uint32",
                number = 58,
                keyType = pbandk.types.uint32(),
                valueType = pbandk.types.uint32(),
                jsonName = "mapUint32Uint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapUint32Uint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapUint32Uint32,
            )
        public val mapUint64Uint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Long, Long>, MutableMap<Long, Long>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_uint64_uint64",
                number = 59,
                keyType = pbandk.types.uint64(),
                valueType = pbandk.types.uint64(),
                jsonName = "mapUint64Uint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapUint64Uint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapUint64Uint64,
            )
        public val mapSint32Sint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Int>, MutableMap<Int, Int>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_sint32_sint32",
                number = 60,
                keyType = pbandk.types.sint32(),
                valueType = pbandk.types.sint32(),
                jsonName = "mapSint32Sint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapSint32Sint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapSint32Sint32,
            )
        public val mapSint64Sint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Long, Long>, MutableMap<Long, Long>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_sint64_sint64",
                number = 61,
                keyType = pbandk.types.sint64(),
                valueType = pbandk.types.sint64(),
                jsonName = "mapSint64Sint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapSint64Sint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapSint64Sint64,
            )
        public val mapFixed32Fixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Int>, MutableMap<Int, Int>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_fixed32_fixed32",
                number = 62,
                keyType = pbandk.types.fixed32(),
                valueType = pbandk.types.fixed32(),
                jsonName = "mapFixed32Fixed32",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapFixed32Fixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapFixed32Fixed32,
            )
        public val mapFixed64Fixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Long, Long>, MutableMap<Long, Long>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_fixed64_fixed64",
                number = 63,
                keyType = pbandk.types.fixed64(),
                valueType = pbandk.types.fixed64(),
                jsonName = "mapFixed64Fixed64",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapFixed64Fixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapFixed64Fixed64,
            )
        public val mapSfixed32Sfixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Int>, MutableMap<Int, Int>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_sfixed32_sfixed32",
                number = 64,
                keyType = pbandk.types.sfixed32(),
                valueType = pbandk.types.sfixed32(),
                jsonName = "mapSfixed32Sfixed32",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapSfixed32Sfixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapSfixed32Sfixed32,
            )
        public val mapSfixed64Sfixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Long, Long>, MutableMap<Long, Long>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_sfixed64_sfixed64",
                number = 65,
                keyType = pbandk.types.sfixed64(),
                valueType = pbandk.types.sfixed64(),
                jsonName = "mapSfixed64Sfixed64",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapSfixed64Sfixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapSfixed64Sfixed64,
            )
        public val mapInt32Float: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Float>, MutableMap<Int, Float>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_int32_float",
                number = 66,
                keyType = pbandk.types.int32(),
                valueType = pbandk.types.float(),
                jsonName = "mapInt32Float",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapInt32Float,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapInt32Float,
            )
        public val mapInt32Double: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Int, Double>, MutableMap<Int, Double>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_int32_double",
                number = 67,
                keyType = pbandk.types.int32(),
                valueType = pbandk.types.double(),
                jsonName = "mapInt32Double",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapInt32Double,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapInt32Double,
            )
        public val mapBoolBool: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<Boolean, Boolean>, MutableMap<Boolean, Boolean>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_bool_bool",
                number = 68,
                keyType = pbandk.types.bool(),
                valueType = pbandk.types.bool(),
                jsonName = "mapBoolBool",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapBoolBool,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapBoolBool,
            )
        public val mapStringString: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<String, String>, MutableMap<String, String>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_string_string",
                number = 69,
                keyType = pbandk.types.string(),
                valueType = pbandk.types.string(),
                jsonName = "mapStringString",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapStringString,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapStringString,
            )
        public val mapStringBytes: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<String, pbandk.ByteArr>, MutableMap<String, pbandk.ByteArr>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_string_bytes",
                number = 70,
                keyType = pbandk.types.string(),
                valueType = pbandk.types.bytes(),
                jsonName = "mapStringBytes",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapStringBytes,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapStringBytes,
            )
        public val mapStringNestedMessage: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>, MutableMap<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_string_nested_message",
                number = 71,
                keyType = pbandk.types.string(),
                valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage),
                jsonName = "mapStringNestedMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapStringNestedMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapStringNestedMessage,
            )
        public val mapStringForeignMessage: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<String, pbandk.conformance.pb.ForeignMessageProto2>, MutableMap<String, pbandk.conformance.pb.ForeignMessageProto2>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_string_foreign_message",
                number = 72,
                keyType = pbandk.types.string(),
                valueType = pbandk.types.message(pbandk.conformance.pb.ForeignMessageProto2),
                jsonName = "mapStringForeignMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapStringForeignMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapStringForeignMessage,
            )
        public val mapStringNestedEnum: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>, MutableMap<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_string_nested_enum",
                number = 73,
                keyType = pbandk.types.string(),
                valueType = pbandk.types.enum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum),
                jsonName = "mapStringNestedEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapStringNestedEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapStringNestedEnum,
            )
        public val mapStringForeignEnum: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, Map<String, pbandk.conformance.pb.ForeignEnumProto2>, MutableMap<String, pbandk.conformance.pb.ForeignEnumProto2>> =
            pbandk.FieldDescriptor.ofMap(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "map_string_foreign_enum",
                number = 74,
                keyType = pbandk.types.string(),
                valueType = pbandk.types.enum(pbandk.conformance.pb.ForeignEnumProto2),
                jsonName = "mapStringForeignEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::mapStringForeignEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::mapStringForeignEnum,
            )
        public val packedInt32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_int32",
                number = 75,
                valueType = pbandk.types.int32(),
                jsonName = "packedInt32",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedInt32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedInt32,
            )
        public val packedInt64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_int64",
                number = 76,
                valueType = pbandk.types.int64(),
                jsonName = "packedInt64",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedInt64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedInt64,
            )
        public val packedUint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_uint32",
                number = 77,
                valueType = pbandk.types.uint32(),
                jsonName = "packedUint32",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedUint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedUint32,
            )
        public val packedUint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_uint64",
                number = 78,
                valueType = pbandk.types.uint64(),
                jsonName = "packedUint64",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedUint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedUint64,
            )
        public val packedSint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_sint32",
                number = 79,
                valueType = pbandk.types.sint32(),
                jsonName = "packedSint32",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedSint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedSint32,
            )
        public val packedSint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_sint64",
                number = 80,
                valueType = pbandk.types.sint64(),
                jsonName = "packedSint64",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedSint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedSint64,
            )
        public val packedFixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_fixed32",
                number = 81,
                valueType = pbandk.types.fixed32(),
                jsonName = "packedFixed32",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedFixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedFixed32,
            )
        public val packedFixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_fixed64",
                number = 82,
                valueType = pbandk.types.fixed64(),
                jsonName = "packedFixed64",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedFixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedFixed64,
            )
        public val packedSfixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_sfixed32",
                number = 83,
                valueType = pbandk.types.sfixed32(),
                jsonName = "packedSfixed32",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedSfixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedSfixed32,
            )
        public val packedSfixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_sfixed64",
                number = 84,
                valueType = pbandk.types.sfixed64(),
                jsonName = "packedSfixed64",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedSfixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedSfixed64,
            )
        public val packedFloat: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Float>, MutableList<Float>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_float",
                number = 85,
                valueType = pbandk.types.float(),
                jsonName = "packedFloat",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedFloat,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedFloat,
            )
        public val packedDouble: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Double>, MutableList<Double>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_double",
                number = 86,
                valueType = pbandk.types.double(),
                jsonName = "packedDouble",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedDouble,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedDouble,
            )
        public val packedBool: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Boolean>, MutableList<Boolean>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_bool",
                number = 87,
                valueType = pbandk.types.bool(),
                jsonName = "packedBool",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedBool,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedBool,
            )
        public val packedNestedEnum: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>, MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "packed_nested_enum",
                number = 88,
                valueType = pbandk.types.enum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum),
                jsonName = "packedNestedEnum",
                options = pbandk.wkt.FieldOptions {
                    packed = true
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::packedNestedEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::packedNestedEnum,
            )
        public val unpackedInt32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_int32",
                number = 89,
                valueType = pbandk.types.int32(),
                jsonName = "unpackedInt32",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedInt32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedInt32,
            )
        public val unpackedInt64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_int64",
                number = 90,
                valueType = pbandk.types.int64(),
                jsonName = "unpackedInt64",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedInt64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedInt64,
            )
        public val unpackedUint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_uint32",
                number = 91,
                valueType = pbandk.types.uint32(),
                jsonName = "unpackedUint32",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedUint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedUint32,
            )
        public val unpackedUint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_uint64",
                number = 92,
                valueType = pbandk.types.uint64(),
                jsonName = "unpackedUint64",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedUint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedUint64,
            )
        public val unpackedSint32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_sint32",
                number = 93,
                valueType = pbandk.types.sint32(),
                jsonName = "unpackedSint32",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedSint32,
            )
        public val unpackedSint64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_sint64",
                number = 94,
                valueType = pbandk.types.sint64(),
                jsonName = "unpackedSint64",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedSint64,
            )
        public val unpackedFixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_fixed32",
                number = 95,
                valueType = pbandk.types.fixed32(),
                jsonName = "unpackedFixed32",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedFixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedFixed32,
            )
        public val unpackedFixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_fixed64",
                number = 96,
                valueType = pbandk.types.fixed64(),
                jsonName = "unpackedFixed64",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedFixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedFixed64,
            )
        public val unpackedSfixed32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_sfixed32",
                number = 97,
                valueType = pbandk.types.sfixed32(),
                jsonName = "unpackedSfixed32",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSfixed32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedSfixed32,
            )
        public val unpackedSfixed64: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Long>, MutableList<Long>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_sfixed64",
                number = 98,
                valueType = pbandk.types.sfixed64(),
                jsonName = "unpackedSfixed64",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedSfixed64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedSfixed64,
            )
        public val unpackedFloat: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Float>, MutableList<Float>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_float",
                number = 99,
                valueType = pbandk.types.float(),
                jsonName = "unpackedFloat",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedFloat,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedFloat,
            )
        public val unpackedDouble: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Double>, MutableList<Double>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_double",
                number = 100,
                valueType = pbandk.types.double(),
                jsonName = "unpackedDouble",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedDouble,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedDouble,
            )
        public val unpackedBool: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<Boolean>, MutableList<Boolean>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_bool",
                number = 101,
                valueType = pbandk.types.bool(),
                jsonName = "unpackedBool",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedBool,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedBool,
            )
        public val unpackedNestedEnum: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.TestAllTypesProto2, List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>, MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "unpacked_nested_enum",
                number = 102,
                valueType = pbandk.types.enum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum),
                jsonName = "unpackedNestedEnum",
                options = pbandk.wkt.FieldOptions {
                    packed = false
                },
                value = pbandk.conformance.pb.TestAllTypesProto2::unpackedNestedEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::unpackedNestedEnum,
            )
        public val oneofUint32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_uint32",
                number = 111,
                valueType = pbandk.types.uint32(),
                jsonName = "oneofUint32",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofUint32,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofUint32,
            )
        public val oneofNestedMessage: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_nested_message",
                number = 112,
                valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage),
                jsonName = "oneofNestedMessage",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofNestedMessage,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofNestedMessage,
            )
        public val oneofString: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, String?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_string",
                number = 113,
                valueType = pbandk.types.string(),
                jsonName = "oneofString",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofString,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofString,
            )
        public val oneofBytes: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.ByteArr?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_bytes",
                number = 114,
                valueType = pbandk.types.bytes(),
                jsonName = "oneofBytes",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofBytes,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofBytes,
            )
        public val oneofBool: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_bool",
                number = 115,
                valueType = pbandk.types.bool(),
                jsonName = "oneofBool",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofBool,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofBool,
            )
        public val oneofUint64: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Long?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_uint64",
                number = 116,
                valueType = pbandk.types.uint64(),
                jsonName = "oneofUint64",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofUint64,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofUint64,
            )
        public val oneofFloat: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Float?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_float",
                number = 117,
                valueType = pbandk.types.float(),
                jsonName = "oneofFloat",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofFloat,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofFloat,
            )
        public val oneofDouble: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Double?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_double",
                number = 118,
                valueType = pbandk.types.double(),
                jsonName = "oneofDouble",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofDouble,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofDouble,
            )
        public val oneofEnum: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "oneof_enum",
                number = 119,
                valueType = pbandk.types.enum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum),
                jsonName = "oneofEnum",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofEnum,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofEnum,
            )
        public val fieldname1: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "fieldname1",
                number = 401,
                valueType = pbandk.types.int32(),
                jsonName = "fieldname1",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldname1,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldname1,
            )
        public val fieldName2: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field_name2",
                number = 402,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName2",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName2,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName2,
            )
        public val fieldName3: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "_field_name3",
                number = 403,
                valueType = pbandk.types.int32(),
                jsonName = "FieldName3",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName3,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName3,
            )
        public val field_name4: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field__name4_",
                number = 404,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName4",
                value = pbandk.conformance.pb.TestAllTypesProto2::field_name4,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::field_name4,
            )
        public val field0name5: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field0name5",
                number = 405,
                valueType = pbandk.types.int32(),
                jsonName = "field0name5",
                value = pbandk.conformance.pb.TestAllTypesProto2::field0name5,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::field0name5,
            )
        public val field0Name6: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field_0_name6",
                number = 406,
                valueType = pbandk.types.int32(),
                jsonName = "field0Name6",
                value = pbandk.conformance.pb.TestAllTypesProto2::field0Name6,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::field0Name6,
            )
        public val fieldName7: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "fieldName7",
                number = 407,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName7",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName7,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName7,
            )
        public val fieldName8: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "FieldName8",
                number = 408,
                valueType = pbandk.types.int32(),
                jsonName = "FieldName8",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName8,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName8,
            )
        public val fieldName9: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field_Name9",
                number = 409,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName9",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName9,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName9,
            )
        public val fieldName10: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "Field_Name10",
                number = 410,
                valueType = pbandk.types.int32(),
                jsonName = "FieldName10",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName10,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName10,
            )
        public val fIELDNAME11: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "FIELD_NAME11",
                number = 411,
                valueType = pbandk.types.int32(),
                jsonName = "FIELDNAME11",
                value = pbandk.conformance.pb.TestAllTypesProto2::fIELDNAME11,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fIELDNAME11,
            )
        public val fIELDName12: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "FIELD_name12",
                number = 412,
                valueType = pbandk.types.int32(),
                jsonName = "FIELDName12",
                value = pbandk.conformance.pb.TestAllTypesProto2::fIELDName12,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fIELDName12,
            )
        public val _fieldName13: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "__field_name13",
                number = 413,
                valueType = pbandk.types.int32(),
                jsonName = "FieldName13",
                value = pbandk.conformance.pb.TestAllTypesProto2::_fieldName13,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::_fieldName13,
            )
        public val _FieldName14: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "__Field_name14",
                number = 414,
                valueType = pbandk.types.int32(),
                jsonName = "FieldName14",
                value = pbandk.conformance.pb.TestAllTypesProto2::_FieldName14,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::_FieldName14,
            )
        public val field_name15: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field__name15",
                number = 415,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName15",
                value = pbandk.conformance.pb.TestAllTypesProto2::field_name15,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::field_name15,
            )
        public val field_Name16: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field__Name16",
                number = 416,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName16",
                value = pbandk.conformance.pb.TestAllTypesProto2::field_Name16,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::field_Name16,
            )
        public val fieldName17_: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "field_name17__",
                number = 417,
                valueType = pbandk.types.int32(),
                jsonName = "fieldName17",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName17_,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName17_,
            )
        public val fieldName18_: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.messageMetadata,
                name = "Field_name18__",
                number = 418,
                valueType = pbandk.types.int32(),
                jsonName = "FieldName18",
                value = pbandk.conformance.pb.TestAllTypesProto2::fieldName18_,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::fieldName18_,
            )

        public val oneofField: pbandk.OneofDescriptor<pbandk.conformance.pb.TestAllTypesProto2, pbandk.conformance.pb.TestAllTypesProto2.OneofField<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
                name = "oneof_field",
                value = pbandk.conformance.pb.TestAllTypesProto2::oneofField,
                mutableValue = pbandk.conformance.pb.MutableTestAllTypesProto2::oneofField,
                fields = listOf(
                    oneofUint32,
                    oneofNestedMessage,
                    oneofString,
                    oneofBytes,
                    oneofBool,
                    oneofUint64,
                    oneofFloat,
                    oneofDouble,
                    oneofEnum,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2>() {
        override val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2 by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.conformance.pb.TestAllTypesProto2 {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "protobuf_test_messages.proto2.TestAllTypesProto2",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.conformance.pb.TestAllTypesProto2::class,
                messageCompanion = this,
                builder = ::TestAllTypesProto2,
                fields = listOf(
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalInt32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalInt64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalUint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalUint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalSint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalSint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalFixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalFixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalSfixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalSfixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalFloat,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalDouble,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalBool,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalString,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalBytes,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalNestedMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalForeignMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalNestedEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalForeignEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalStringPiece,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.optionalCord,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.recursiveMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedInt32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedInt64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedUint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedUint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedFixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedFixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSfixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSfixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedFloat,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedDouble,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedBool,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedString,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedBytes,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedNestedMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedForeignMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedNestedEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedForeignEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedStringPiece,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedCord,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedInt32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedInt64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedUint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedUint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedFixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedFixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSfixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSfixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedFloat,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedDouble,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedBool,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedNestedEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedInt32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedInt64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedUint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedUint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedFixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedFixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSfixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSfixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedFloat,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedDouble,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedBool,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedNestedEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt32Int32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt64Int64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapUint32Uint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapUint64Uint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSint32Sint32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSint64Sint64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapFixed32Fixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapFixed64Fixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSfixed32Sfixed32,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSfixed64Sfixed64,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt32Float,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt32Double,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapBoolBool,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringString,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringBytes,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringNestedMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringForeignMessage,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringNestedEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringForeignEnum,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldname1,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName2,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName3,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.field_name4,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.field0name5,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.field0Name6,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName7,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName8,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName9,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName10,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fIELDNAME11,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fIELDName12,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors._fieldName13,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors._FieldName14,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.field_name15,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.field_Name16,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName17_,
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.fieldName18_,
                ),
                oneofs = listOf(
                    pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.oneofField,
                ),
            )
        }

        @Deprecated(
            message = "Use TestAllTypesProto2.NestedMessage { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.conformance.pb.TestAllTypesProto2.NestedMessage"],
                expression = "TestAllTypesProto2.NestedMessage {\nthis.a = a\nthis.corecursive = corecursive\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun NestedMessage(
            a: Int? = null,
            corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage {
            this.a = a
            this.corecursive = corecursive
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use TestAllTypesProto2.Data { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.conformance.pb.TestAllTypesProto2.Data"],
                expression = "TestAllTypesProto2.Data {\nthis.groupInt32 = groupInt32\nthis.groupUint32 = groupUint32\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun Data(
            groupInt32: Int? = null,
            groupUint32: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto2.Data = pbandk.conformance.pb.TestAllTypesProto2.Data {
            this.groupInt32 = groupInt32
            this.groupUint32 = groupUint32
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use TestAllTypesProto2.MessageSetCorrect { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect"],
                expression = "TestAllTypesProto2.MessageSetCorrect {\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun MessageSetCorrect(
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect {
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use TestAllTypesProto2.MessageSetCorrectExtension1 { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1"],
                expression = "TestAllTypesProto2.MessageSetCorrectExtension1 {\nthis.str = str\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun MessageSetCorrectExtension1(
            str: String? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 {
            this.str = str
            this.unknownFields += unknownFields
        }

        @Deprecated(
            message = "Use TestAllTypesProto2.MessageSetCorrectExtension2 { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2"],
                expression = "TestAllTypesProto2.MessageSetCorrectExtension2 {\nthis.i = i\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun MessageSetCorrectExtension2(
            i: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 {
            this.i = i
            this.unknownFields += unknownFields
        }
    }

    public sealed interface NestedEnum : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
            get() = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.descriptor

        public object FOO : NestedEnum, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(
            value = 0,
            name = "FOO",
        )
        public object BAR : NestedEnum, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(
            value = 1,
            name = "BAR",
        )
        public object BAZ : NestedEnum, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(
            value = 2,
            name = "BAZ",
        )
        public object NEG : NestedEnum, pbandk.gen.GeneratedEnumValue<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(
            value = -1,
            name = "NEG",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : NestedEnum, pbandk.gen.UnrecognizedEnumValue<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> =
                pbandk.EnumDescriptor.of(
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.NestedEnum",
                    enumClass = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum::class,
                    enumCompanion = this,
                )
            public val values: List<TestAllTypesProto2.NestedEnum> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(FOO, BAR, BAZ, NEG)
            }

            override fun fromValue(value: Int): pbandk.conformance.pb.TestAllTypesProto2.NestedEnum =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.conformance.pb.TestAllTypesProto2.NestedEnum =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }

    public sealed interface NestedMessage : pbandk.Message {
        public val a: Int?
        public val corecursive: pbandk.conformance.pb.TestAllTypesProto2?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>

        /**
         * The [TestAllTypesProto2.MutableNestedMessage] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            a: Int? = this.a,
            corecursive: pbandk.conformance.pb.TestAllTypesProto2? = this.corecursive,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val a: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::descriptor,
                    messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.messageMetadata,
                    name = "a",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "a",
                    value = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::a,
                    mutableValue = pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage::a,
                )
            public val corecursive: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage, pbandk.conformance.pb.TestAllTypesProto2?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::descriptor,
                    messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.messageMetadata,
                    name = "corecursive",
                    number = 2,
                    valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2, recursive = true),
                    jsonName = "corecursive",
                    value = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::corecursive,
                    mutableValue = pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage::corecursive,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>() {
            override val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.conformance.pb.TestAllTypesProto2.NestedMessage {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.NestedMessage",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage::class,
                    messageCompanion = this,
                    builder = TestAllTypesProto2.Companion::NestedMessage,
                    fields = listOf(
                        pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.FieldDescriptors.a,
                        pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.FieldDescriptors.corecursive,
                    ),
                )
            }
        }
    }

    public sealed interface MutableNestedMessage : pbandk.conformance.pb.TestAllTypesProto2.NestedMessage, pbandk.MutableMessage<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> {
        public override var a: Int?
        public override var corecursive: pbandk.conformance.pb.TestAllTypesProto2?
    }

    public sealed interface Data : pbandk.Message {
        public val groupInt32: Int?
        public val groupUint32: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.Data
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data>

        /**
         * The [TestAllTypesProto2.MutableData] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableData.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.Data

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            groupInt32: Int? = this.groupInt32,
            groupUint32: Int? = this.groupUint32,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.Data

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val groupInt32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.Data::descriptor,
                    messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.Data.messageMetadata,
                    name = "group_int32",
                    number = 202,
                    valueType = pbandk.types.int32(),
                    jsonName = "groupInt32",
                    value = pbandk.conformance.pb.TestAllTypesProto2.Data::groupInt32,
                    mutableValue = pbandk.conformance.pb.TestAllTypesProto2.MutableData::groupInt32,
                )
            public val groupUint32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.Data::descriptor,
                    messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.Data.messageMetadata,
                    name = "group_uint32",
                    number = 203,
                    valueType = pbandk.types.uint32(),
                    jsonName = "groupUint32",
                    value = pbandk.conformance.pb.TestAllTypesProto2.Data::groupUint32,
                    mutableValue = pbandk.conformance.pb.TestAllTypesProto2.MutableData::groupUint32,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.Data>() {
            override val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.Data by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.conformance.pb.TestAllTypesProto2.Data {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.Data",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.Data> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.Data::class,
                    messageCompanion = this,
                    builder = TestAllTypesProto2.Companion::Data,
                    fields = listOf(
                        pbandk.conformance.pb.TestAllTypesProto2.Data.FieldDescriptors.groupInt32,
                        pbandk.conformance.pb.TestAllTypesProto2.Data.FieldDescriptors.groupUint32,
                    ),
                )
            }
        }
    }

    public sealed interface MutableData : pbandk.conformance.pb.TestAllTypesProto2.Data, pbandk.MutableMessage<pbandk.conformance.pb.TestAllTypesProto2.Data> {
        public override var groupInt32: Int?
        public override var groupUint32: Int?
    }

    public sealed interface MessageSetCorrect : pbandk.ExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> {

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect>

        /**
         * The [TestAllTypesProto2.MutableMessageSetCorrect] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrect.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
        }

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect>() {
            override val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrect",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect::class,
                    messageCompanion = this,
                    builder = TestAllTypesProto2.Companion::MessageSetCorrect,
                )
            }
        }
    }

    public sealed interface MutableMessageSetCorrect : pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect, pbandk.MutableExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect> {
    }

    public sealed interface MessageSetCorrectExtension1 : pbandk.Message {
        public val str: String?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1>

        /**
         * The [TestAllTypesProto2.MutableMessageSetCorrectExtension1] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            str: String? = this.str,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val str: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1, String?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1::descriptor,
                    messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.messageMetadata,
                    name = "str",
                    number = 25,
                    valueType = pbandk.types.string(),
                    jsonName = "str",
                    value = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1::str,
                    mutableValue = pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1::str,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1>() {
            override val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrectExtension1",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1::class,
                    messageCompanion = this,
                    builder = TestAllTypesProto2.Companion::MessageSetCorrectExtension1,
                    fields = listOf(
                        pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.FieldDescriptors.str,
                    ),
                )
            }

            public val messageSetExtension: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect, pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1?> = 
                pbandk.FieldDescriptor.ofExtension(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect::descriptor,
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrectExtension1.message_set_extension",
                    number = 1547769,
                    valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1),
                    jsonName = "messageSetExtension",
                )
        }
    }

    public sealed interface MutableMessageSetCorrectExtension1 : pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1, pbandk.MutableMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1> {
        public override var str: String?
    }

    public sealed interface MessageSetCorrectExtension2 : pbandk.Message {
        public val i: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2>

        /**
         * The [TestAllTypesProto2.MutableMessageSetCorrectExtension2] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            i: Int? = this.i,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val i: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2::descriptor,
                    messageMetadata = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.messageMetadata,
                    name = "i",
                    number = 9,
                    valueType = pbandk.types.int32(),
                    jsonName = "i",
                    value = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2::i,
                    mutableValue = pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2::i,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2>() {
            override val defaultInstance: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrectExtension2",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2::class,
                    messageCompanion = this,
                    builder = TestAllTypesProto2.Companion::MessageSetCorrectExtension2,
                    fields = listOf(
                        pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.FieldDescriptors.i,
                    ),
                )
            }

            public val messageSetExtension: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect, pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2?> = 
                pbandk.FieldDescriptor.ofExtension(
                    messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect::descriptor,
                    fullName = "protobuf_test_messages.proto2.TestAllTypesProto2.MessageSetCorrectExtension2.message_set_extension",
                    number = 4135312,
                    valueType = pbandk.types.message(pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2),
                    jsonName = "messageSetExtension",
                )
        }
    }

    public sealed interface MutableMessageSetCorrectExtension2 : pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2, pbandk.MutableMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2> {
        public override var i: Int?
    }
}

public sealed interface MutableTestAllTypesProto2 : pbandk.conformance.pb.TestAllTypesProto2, pbandk.MutableExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2> {
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
    public override val repeatedNestedMessage: MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>
    public override val repeatedForeignMessage: MutableList<pbandk.conformance.pb.ForeignMessageProto2>
    public override val repeatedNestedEnum: MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public override val repeatedForeignEnum: MutableList<pbandk.conformance.pb.ForeignEnumProto2>
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
    public override val packedNestedEnum: MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
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
    public override val unpackedNestedEnum: MutableList<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
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
    public override val mapStringNestedMessage: MutableMap<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>
    public override val mapStringForeignMessage: MutableMap<String, pbandk.conformance.pb.ForeignMessageProto2>
    public override val mapStringNestedEnum: MutableMap<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>
    public override val mapStringForeignEnum: MutableMap<String, pbandk.conformance.pb.ForeignEnumProto2>
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
}

public sealed interface ForeignMessageProto2 : pbandk.Message {
    public val c: Int?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ForeignMessageProto2
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessageProto2>

    /**
     * The [MutableForeignMessageProto2] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableForeignMessageProto2.() -> Unit): pbandk.conformance.pb.ForeignMessageProto2

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        c: Int? = this.c,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.ForeignMessageProto2

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val c: pbandk.FieldDescriptor<pbandk.conformance.pb.ForeignMessageProto2, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.ForeignMessageProto2::descriptor,
                messageMetadata = pbandk.conformance.pb.ForeignMessageProto2.messageMetadata,
                name = "c",
                number = 1,
                valueType = pbandk.types.int32(),
                jsonName = "c",
                value = pbandk.conformance.pb.ForeignMessageProto2::c,
                mutableValue = pbandk.conformance.pb.MutableForeignMessageProto2::c,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.ForeignMessageProto2>() {
        override val defaultInstance: pbandk.conformance.pb.ForeignMessageProto2 by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.conformance.pb.ForeignMessageProto2 {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "protobuf_test_messages.proto2.ForeignMessageProto2",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ForeignMessageProto2> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.conformance.pb.ForeignMessageProto2::class,
                messageCompanion = this,
                builder = ::ForeignMessageProto2,
                fields = listOf(
                    pbandk.conformance.pb.ForeignMessageProto2.FieldDescriptors.c,
                ),
            )
        }
    }
}

public sealed interface MutableForeignMessageProto2 : pbandk.conformance.pb.ForeignMessageProto2, pbandk.MutableMessage<pbandk.conformance.pb.ForeignMessageProto2> {
    public override var c: Int?
}

public sealed interface UnknownToTestAllTypes : pbandk.Message {
    public val optionalInt32: Int?
    public val optionalString: String?
    public val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?
    public val optionalBool: Boolean?
    public val repeatedInt32: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.UnknownToTestAllTypes
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes>

    /**
     * The [MutableUnknownToTestAllTypes] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.conformance.pb.MutableUnknownToTestAllTypes.() -> Unit): pbandk.conformance.pb.UnknownToTestAllTypes

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        optionalInt32: Int? = this.optionalInt32,
        optionalString: String? = this.optionalString,
        nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = this.nestedMessage,
        optionalBool: Boolean? = this.optionalBool,
        repeatedInt32: List<Int> = this.repeatedInt32,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.conformance.pb.UnknownToTestAllTypes

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val optionalInt32: pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes, Int?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.UnknownToTestAllTypes::descriptor,
                messageMetadata = pbandk.conformance.pb.UnknownToTestAllTypes.messageMetadata,
                name = "optional_int32",
                number = 1001,
                valueType = pbandk.types.int32(),
                jsonName = "optionalInt32",
                value = pbandk.conformance.pb.UnknownToTestAllTypes::optionalInt32,
                mutableValue = pbandk.conformance.pb.MutableUnknownToTestAllTypes::optionalInt32,
            )
        public val optionalString: pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes, String?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.UnknownToTestAllTypes::descriptor,
                messageMetadata = pbandk.conformance.pb.UnknownToTestAllTypes.messageMetadata,
                name = "optional_string",
                number = 1002,
                valueType = pbandk.types.string(),
                jsonName = "optionalString",
                value = pbandk.conformance.pb.UnknownToTestAllTypes::optionalString,
                mutableValue = pbandk.conformance.pb.MutableUnknownToTestAllTypes::optionalString,
            )
        public val nestedMessage: pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes, pbandk.conformance.pb.ForeignMessageProto2?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.UnknownToTestAllTypes::descriptor,
                messageMetadata = pbandk.conformance.pb.UnknownToTestAllTypes.messageMetadata,
                name = "nested_message",
                number = 1003,
                valueType = pbandk.types.message(pbandk.conformance.pb.ForeignMessageProto2),
                jsonName = "nestedMessage",
                value = pbandk.conformance.pb.UnknownToTestAllTypes::nestedMessage,
                mutableValue = pbandk.conformance.pb.MutableUnknownToTestAllTypes::nestedMessage,
            )
        public val optionalBool: pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.conformance.pb.UnknownToTestAllTypes::descriptor,
                messageMetadata = pbandk.conformance.pb.UnknownToTestAllTypes.messageMetadata,
                name = "optional_bool",
                number = 1006,
                valueType = pbandk.types.bool(),
                jsonName = "optionalBool",
                value = pbandk.conformance.pb.UnknownToTestAllTypes::optionalBool,
                mutableValue = pbandk.conformance.pb.MutableUnknownToTestAllTypes::optionalBool,
            )
        public val repeatedInt32: pbandk.FieldDescriptor.MutableValue<pbandk.conformance.pb.UnknownToTestAllTypes, List<Int>, MutableList<Int>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.conformance.pb.UnknownToTestAllTypes::descriptor,
                messageMetadata = pbandk.conformance.pb.UnknownToTestAllTypes.messageMetadata,
                name = "repeated_int32",
                number = 1011,
                valueType = pbandk.types.int32(),
                jsonName = "repeatedInt32",
                value = pbandk.conformance.pb.UnknownToTestAllTypes::repeatedInt32,
                mutableValue = pbandk.conformance.pb.MutableUnknownToTestAllTypes::repeatedInt32,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.conformance.pb.UnknownToTestAllTypes>() {
        override val defaultInstance: pbandk.conformance.pb.UnknownToTestAllTypes by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.conformance.pb.UnknownToTestAllTypes {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "protobuf_test_messages.proto2.UnknownToTestAllTypes",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.conformance.pb.UnknownToTestAllTypes::class,
                messageCompanion = this,
                builder = ::UnknownToTestAllTypes,
                fields = listOf(
                    pbandk.conformance.pb.UnknownToTestAllTypes.FieldDescriptors.optionalInt32,
                    pbandk.conformance.pb.UnknownToTestAllTypes.FieldDescriptors.optionalString,
                    pbandk.conformance.pb.UnknownToTestAllTypes.FieldDescriptors.nestedMessage,
                    pbandk.conformance.pb.UnknownToTestAllTypes.FieldDescriptors.optionalBool,
                    pbandk.conformance.pb.UnknownToTestAllTypes.FieldDescriptors.repeatedInt32,
                ),
            )
        }

        @Deprecated(
            message = "Use UnknownToTestAllTypes.OptionalGroup { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup"],
                expression = "UnknownToTestAllTypes.OptionalGroup {\nthis.a = a\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun OptionalGroup(
            a: Int? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup {
            this.a = a
            this.unknownFields += unknownFields
        }
    }

    public sealed interface OptionalGroup : pbandk.Message {
        public val a: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup
        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup>

        /**
         * The [UnknownToTestAllTypes.MutableOptionalGroup] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup.() -> Unit): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            a: Int? = this.a,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val a: pbandk.FieldDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup, Int?> =
                pbandk.FieldDescriptor.ofOptional(
                    messageDescriptor = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup::descriptor,
                    messageMetadata = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.messageMetadata,
                    name = "a",
                    number = 1,
                    valueType = pbandk.types.int32(),
                    jsonName = "a",
                    value = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup::a,
                    mutableValue = pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup::a,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup>() {
            override val defaultInstance: pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup {}
            }

            private val messageMetadata = pbandk.MessageMetadata(
                fullName = "protobuf_test_messages.proto2.UnknownToTestAllTypes.OptionalGroup",
                syntax = pbandk.wkt.Syntax.PROTO2,
            )

            override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup> by lazy {
                pbandk.MessageDescriptor.of(
                    metadata = messageMetadata,
                    messageClass = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup::class,
                    messageCompanion = this,
                    builder = UnknownToTestAllTypes.Companion::OptionalGroup,
                    fields = listOf(
                        pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.FieldDescriptors.a,
                    ),
                )
            }
        }
    }

    public sealed interface MutableOptionalGroup : pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup, pbandk.MutableMessage<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup> {
        public override var a: Int?
    }
}

public sealed interface MutableUnknownToTestAllTypes : pbandk.conformance.pb.UnknownToTestAllTypes, pbandk.MutableMessage<pbandk.conformance.pb.UnknownToTestAllTypes> {
    public override var optionalInt32: Int?
    public override var optionalString: String?
    public override var nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?
    public override var optionalBool: Boolean?
    public override val repeatedInt32: MutableList<Int>
}

public val pbandk.conformance.pb.TestAllTypesProto2.extensionInt32: Int?
    get() = pbandk.conformance.pb.extensionInt32.getValue(this)

public var pbandk.conformance.pb.MutableTestAllTypesProto2.extensionInt32: Int?
    get() = pbandk.conformance.pb.extensionInt32.getValue(this)
    set(value) = pbandk.conformance.pb.extensionInt32.setValue(this, value)

@pbandk.Export
public val extensionInt32: pbandk.FieldDescriptor<pbandk.conformance.pb.TestAllTypesProto2, Int?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.conformance.pb.TestAllTypesProto2::descriptor,
        fullName = "protobuf_test_messages.proto2.extension_int32",
        number = 120,
        valueType = pbandk.types.int32(),
        jsonName = "extensionInt32",
    )

@Deprecated(
    message = "Use TestAllTypesProto2 { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.TestAllTypesProto2"],
        expression = "TestAllTypesProto2 {\nthis.optionalInt32 = optionalInt32\nthis.optionalInt64 = optionalInt64\nthis.optionalUint32 = optionalUint32\nthis.optionalUint64 = optionalUint64\nthis.optionalSint32 = optionalSint32\nthis.optionalSint64 = optionalSint64\nthis.optionalFixed32 = optionalFixed32\nthis.optionalFixed64 = optionalFixed64\nthis.optionalSfixed32 = optionalSfixed32\nthis.optionalSfixed64 = optionalSfixed64\nthis.optionalFloat = optionalFloat\nthis.optionalDouble = optionalDouble\nthis.optionalBool = optionalBool\nthis.optionalString = optionalString\nthis.optionalBytes = optionalBytes\nthis.optionalNestedMessage = optionalNestedMessage\nthis.optionalForeignMessage = optionalForeignMessage\nthis.optionalNestedEnum = optionalNestedEnum\nthis.optionalForeignEnum = optionalForeignEnum\nthis.optionalStringPiece = optionalStringPiece\nthis.optionalCord = optionalCord\nthis.recursiveMessage = recursiveMessage\nthis.repeatedInt32 += repeatedInt32\nthis.repeatedInt64 += repeatedInt64\nthis.repeatedUint32 += repeatedUint32\nthis.repeatedUint64 += repeatedUint64\nthis.repeatedSint32 += repeatedSint32\nthis.repeatedSint64 += repeatedSint64\nthis.repeatedFixed32 += repeatedFixed32\nthis.repeatedFixed64 += repeatedFixed64\nthis.repeatedSfixed32 += repeatedSfixed32\nthis.repeatedSfixed64 += repeatedSfixed64\nthis.repeatedFloat += repeatedFloat\nthis.repeatedDouble += repeatedDouble\nthis.repeatedBool += repeatedBool\nthis.repeatedString += repeatedString\nthis.repeatedBytes += repeatedBytes\nthis.repeatedNestedMessage += repeatedNestedMessage\nthis.repeatedForeignMessage += repeatedForeignMessage\nthis.repeatedNestedEnum += repeatedNestedEnum\nthis.repeatedForeignEnum += repeatedForeignEnum\nthis.repeatedStringPiece += repeatedStringPiece\nthis.repeatedCord += repeatedCord\nthis.packedInt32 += packedInt32\nthis.packedInt64 += packedInt64\nthis.packedUint32 += packedUint32\nthis.packedUint64 += packedUint64\nthis.packedSint32 += packedSint32\nthis.packedSint64 += packedSint64\nthis.packedFixed32 += packedFixed32\nthis.packedFixed64 += packedFixed64\nthis.packedSfixed32 += packedSfixed32\nthis.packedSfixed64 += packedSfixed64\nthis.packedFloat += packedFloat\nthis.packedDouble += packedDouble\nthis.packedBool += packedBool\nthis.packedNestedEnum += packedNestedEnum\nthis.unpackedInt32 += unpackedInt32\nthis.unpackedInt64 += unpackedInt64\nthis.unpackedUint32 += unpackedUint32\nthis.unpackedUint64 += unpackedUint64\nthis.unpackedSint32 += unpackedSint32\nthis.unpackedSint64 += unpackedSint64\nthis.unpackedFixed32 += unpackedFixed32\nthis.unpackedFixed64 += unpackedFixed64\nthis.unpackedSfixed32 += unpackedSfixed32\nthis.unpackedSfixed64 += unpackedSfixed64\nthis.unpackedFloat += unpackedFloat\nthis.unpackedDouble += unpackedDouble\nthis.unpackedBool += unpackedBool\nthis.unpackedNestedEnum += unpackedNestedEnum\nthis.mapInt32Int32 += mapInt32Int32\nthis.mapInt64Int64 += mapInt64Int64\nthis.mapUint32Uint32 += mapUint32Uint32\nthis.mapUint64Uint64 += mapUint64Uint64\nthis.mapSint32Sint32 += mapSint32Sint32\nthis.mapSint64Sint64 += mapSint64Sint64\nthis.mapFixed32Fixed32 += mapFixed32Fixed32\nthis.mapFixed64Fixed64 += mapFixed64Fixed64\nthis.mapSfixed32Sfixed32 += mapSfixed32Sfixed32\nthis.mapSfixed64Sfixed64 += mapSfixed64Sfixed64\nthis.mapInt32Float += mapInt32Float\nthis.mapInt32Double += mapInt32Double\nthis.mapBoolBool += mapBoolBool\nthis.mapStringString += mapStringString\nthis.mapStringBytes += mapStringBytes\nthis.mapStringNestedMessage += mapStringNestedMessage\nthis.mapStringForeignMessage += mapStringForeignMessage\nthis.mapStringNestedEnum += mapStringNestedEnum\nthis.mapStringForeignEnum += mapStringForeignEnum\nthis.fieldname1 = fieldname1\nthis.fieldName2 = fieldName2\nthis.fieldName3 = fieldName3\nthis.field_name4 = field_name4\nthis.field0name5 = field0name5\nthis.field0Name6 = field0Name6\nthis.fieldName7 = fieldName7\nthis.fieldName8 = fieldName8\nthis.fieldName9 = fieldName9\nthis.fieldName10 = fieldName10\nthis.fIELDNAME11 = fIELDNAME11\nthis.fIELDName12 = fIELDName12\nthis._fieldName13 = _fieldName13\nthis._FieldName14 = _FieldName14\nthis.field_name15 = field_name15\nthis.field_Name16 = field_Name16\nthis.fieldName17_ = fieldName17_\nthis.fieldName18_ = fieldName18_\nthis.oneofField = oneofField\nthis.unknownFields += unknownFields\n}",
    )
)
public fun TestAllTypesProto2(
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
    mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> = emptyMap(),
    mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessageProto2> = emptyMap(),
    mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyMap(),
    mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnumProto2> = emptyMap(),
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
): pbandk.conformance.pb.TestAllTypesProto2 = pbandk.conformance.pb.TestAllTypesProto2 {
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
 * The [MutableTestAllTypesProto2] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto2")
public fun TestAllTypesProto2(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto2.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2 =
    pbandk.conformance.pb.MutableTestAllTypesProto2_Impl(
        optionalInt32 = null,
        optionalInt64 = null,
        optionalUint32 = null,
        optionalUint64 = null,
        optionalSint32 = null,
        optionalSint64 = null,
        optionalFixed32 = null,
        optionalFixed64 = null,
        optionalSfixed32 = null,
        optionalSfixed64 = null,
        optionalFloat = null,
        optionalDouble = null,
        optionalBool = null,
        optionalString = null,
        optionalBytes = null,
        optionalNestedMessage = null,
        optionalForeignMessage = null,
        optionalNestedEnum = null,
        optionalForeignEnum = null,
        optionalStringPiece = null,
        optionalCord = null,
        recursiveMessage = null,
        repeatedInt32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedInt32),
        repeatedInt64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedInt64),
        repeatedUint32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedUint32),
        repeatedUint64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedUint64),
        repeatedSint32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSint32),
        repeatedSint64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSint64),
        repeatedFixed32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedFixed32),
        repeatedFixed64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedFixed64),
        repeatedSfixed32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSfixed32),
        repeatedSfixed64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedSfixed64),
        repeatedFloat = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedFloat),
        repeatedDouble = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedDouble),
        repeatedBool = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedBool),
        repeatedString = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedString),
        repeatedBytes = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedBytes),
        repeatedNestedMessage = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedNestedMessage),
        repeatedForeignMessage = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedForeignMessage),
        repeatedNestedEnum = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedNestedEnum),
        repeatedForeignEnum = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedForeignEnum),
        repeatedStringPiece = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedStringPiece),
        repeatedCord = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.repeatedCord),
        packedInt32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedInt32),
        packedInt64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedInt64),
        packedUint32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedUint32),
        packedUint64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedUint64),
        packedSint32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSint32),
        packedSint64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSint64),
        packedFixed32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedFixed32),
        packedFixed64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedFixed64),
        packedSfixed32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSfixed32),
        packedSfixed64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedSfixed64),
        packedFloat = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedFloat),
        packedDouble = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedDouble),
        packedBool = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedBool),
        packedNestedEnum = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.packedNestedEnum),
        unpackedInt32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedInt32),
        unpackedInt64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedInt64),
        unpackedUint32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedUint32),
        unpackedUint64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedUint64),
        unpackedSint32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSint32),
        unpackedSint64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSint64),
        unpackedFixed32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedFixed32),
        unpackedFixed64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedFixed64),
        unpackedSfixed32 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSfixed32),
        unpackedSfixed64 = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedSfixed64),
        unpackedFloat = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedFloat),
        unpackedDouble = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedDouble),
        unpackedBool = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedBool),
        unpackedNestedEnum = pbandk.gen.MutableListField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.unpackedNestedEnum),
        mapInt32Int32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt32Int32),
        mapInt64Int64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt64Int64),
        mapUint32Uint32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapUint32Uint32),
        mapUint64Uint64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapUint64Uint64),
        mapSint32Sint32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSint32Sint32),
        mapSint64Sint64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSint64Sint64),
        mapFixed32Fixed32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapFixed32Fixed32),
        mapFixed64Fixed64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapFixed64Fixed64),
        mapSfixed32Sfixed32 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSfixed32Sfixed32),
        mapSfixed64Sfixed64 = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapSfixed64Sfixed64),
        mapInt32Float = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt32Float),
        mapInt32Double = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapInt32Double),
        mapBoolBool = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapBoolBool),
        mapStringString = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringString),
        mapStringBytes = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringBytes),
        mapStringNestedMessage = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringNestedMessage),
        mapStringForeignMessage = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringForeignMessage),
        mapStringNestedEnum = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringNestedEnum),
        mapStringForeignEnum = pbandk.gen.MutableMapField(pbandk.conformance.pb.TestAllTypesProto2.FieldDescriptors.mapStringForeignEnum),
        fieldname1 = null,
        fieldName2 = null,
        fieldName3 = null,
        field_name4 = null,
        field0name5 = null,
        field0Name6 = null,
        fieldName7 = null,
        fieldName8 = null,
        fieldName9 = null,
        fieldName10 = null,
        fIELDNAME11 = null,
        fIELDName12 = null,
        _fieldName13 = null,
        _FieldName14 = null,
        field_name15 = null,
        field_Name16 = null,
        fieldName17_ = null,
        fieldName18_ = null,
        oneofField = null,
    ).also(builderAction).toTestAllTypesProto2()

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2")
public fun TestAllTypesProto2?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2 = this ?: pbandk.conformance.pb.TestAllTypesProto2.defaultInstance

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
    override val repeatedNestedMessage: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
    override val repeatedForeignMessage: pbandk.gen.ListField<pbandk.conformance.pb.ForeignMessageProto2>,
    override val repeatedNestedEnum: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override val repeatedForeignEnum: pbandk.gen.ListField<pbandk.conformance.pb.ForeignEnumProto2>,
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
    override val packedNestedEnum: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
    override val unpackedNestedEnum: pbandk.gen.ListField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
    override val mapStringNestedMessage: pbandk.gen.MapField<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
    override val mapStringForeignMessage: pbandk.gen.MapField<String, pbandk.conformance.pb.ForeignMessageProto2>,
    override val mapStringNestedEnum: pbandk.gen.MapField<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override val mapStringForeignEnum: pbandk.gen.MapField<String, pbandk.conformance.pb.ForeignEnumProto2>,
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
    extensionFields: pbandk.FieldSet<pbandk.conformance.pb.TestAllTypesProto2>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto2, pbandk.gen.GeneratedExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.descriptor

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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto2.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
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
        mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
        mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessageProto2>,
        mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
        mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnumProto2>,
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
    ) = pbandk.conformance.pb.TestAllTypesProto2 {
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
    override val repeatedNestedMessage: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
    override val repeatedForeignMessage: pbandk.gen.MutableListField<pbandk.conformance.pb.ForeignMessageProto2>,
    override val repeatedNestedEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override val repeatedForeignEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.ForeignEnumProto2>,
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
    override val packedNestedEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
    override val unpackedNestedEnum: pbandk.gen.MutableListField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
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
    override val mapStringNestedMessage: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
    override val mapStringForeignMessage: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.ForeignMessageProto2>,
    override val mapStringNestedEnum: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
    override val mapStringForeignEnum: pbandk.gen.MutableMapField<String, pbandk.conformance.pb.ForeignEnumProto2>,
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
) : pbandk.conformance.pb.MutableTestAllTypesProto2, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.descriptor

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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableTestAllTypesProto2.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
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
        mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>,
        mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessageProto2>,
        mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>,
        mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnumProto2>,
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
    ) = throw UnsupportedOperationException()

    fun toTestAllTypesProto2() = TestAllTypesProto2_Impl(
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
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [TestAllTypesProto2.MutableNestedMessage] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto2NestedMessage")
public fun TestAllTypesProto2.Companion.NestedMessage(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage =
    pbandk.conformance.pb.TestAllTypesProto2_MutableNestedMessage_Impl(
        a = null,
        corecursive = null,
    ).also(builderAction).toNestedMessage()

/**
 * The [TestAllTypesProto2.MutableNestedMessage] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableTestAllTypesProto2.NestedMessage(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage =
    pbandk.conformance.pb.TestAllTypesProto2.NestedMessage(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2NestedMessage")
public fun TestAllTypesProto2.NestedMessage?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.NestedMessage = this ?: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.defaultInstance

private class TestAllTypesProto2_NestedMessage_Impl(
    override val a: Int?,
    override val corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto2.NestedMessage, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: Int?,
        corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage {
        this.a = a
        this.corecursive = corecursive
        this.unknownFields += unknownFields
    }
}

private class TestAllTypesProto2_MutableNestedMessage_Impl(
    override var a: Int?,
    override var corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
) : pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableNestedMessage.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: Int?,
        corecursive: pbandk.conformance.pb.TestAllTypesProto2?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toNestedMessage() = TestAllTypesProto2_NestedMessage_Impl(
        a = a,
        corecursive = corecursive,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [TestAllTypesProto2.MutableData] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto2Data")
public fun TestAllTypesProto2.Companion.Data(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableData.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.Data =
    pbandk.conformance.pb.TestAllTypesProto2_MutableData_Impl(
        groupInt32 = null,
        groupUint32 = null,
    ).also(builderAction).toData()

/**
 * The [TestAllTypesProto2.MutableData] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableTestAllTypesProto2.Data(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableData.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.Data =
    pbandk.conformance.pb.TestAllTypesProto2.Data(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2Data")
public fun TestAllTypesProto2.Data?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.Data = this ?: pbandk.conformance.pb.TestAllTypesProto2.Data.defaultInstance

private class TestAllTypesProto2_Data_Impl(
    override val groupInt32: Int?,
    override val groupUint32: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto2.Data, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.Data>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.Data.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableData.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        groupInt32: Int?,
        groupUint32: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.TestAllTypesProto2.Data {
        this.groupInt32 = groupInt32
        this.groupUint32 = groupUint32
        this.unknownFields += unknownFields
    }
}

private class TestAllTypesProto2_MutableData_Impl(
    override var groupInt32: Int?,
    override var groupUint32: Int?,
) : pbandk.conformance.pb.TestAllTypesProto2.MutableData, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.Data>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.Data.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableData.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        groupInt32: Int?,
        groupUint32: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toData() = TestAllTypesProto2_Data_Impl(
        groupInt32 = groupInt32,
        groupUint32 = groupUint32,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [TestAllTypesProto2.MutableMessageSetCorrect] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto2MessageSetCorrect")
public fun TestAllTypesProto2.Companion.MessageSetCorrect(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrect.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect =
    pbandk.conformance.pb.TestAllTypesProto2_MutableMessageSetCorrect_Impl(
    ).also(builderAction).toMessageSetCorrect()

/**
 * The [TestAllTypesProto2.MutableMessageSetCorrect] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableTestAllTypesProto2.MessageSetCorrect(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrect.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect =
    pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MessageSetCorrect")
public fun TestAllTypesProto2.MessageSetCorrect?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect = this ?: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect.defaultInstance

private class TestAllTypesProto2_MessageSetCorrect_Impl(
    extensionFields: pbandk.FieldSet<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect, pbandk.gen.GeneratedExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect>(extensionFields, unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrect.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect {
        this.unknownFields += unknownFields
    }
}

private class TestAllTypesProto2_MutableMessageSetCorrect_Impl(
) : pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrect, pbandk.gen.MutableGeneratedExtendableMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrect.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrect.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageSetCorrect() = TestAllTypesProto2_MessageSetCorrect_Impl(
        extensionFields = extensionFields.toFieldSet(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [TestAllTypesProto2.MutableMessageSetCorrectExtension1] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto2MessageSetCorrectExtension1")
public fun TestAllTypesProto2.Companion.MessageSetCorrectExtension1(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 =
    pbandk.conformance.pb.TestAllTypesProto2_MutableMessageSetCorrectExtension1_Impl(
        str = null,
    ).also(builderAction).toMessageSetCorrectExtension1()

/**
 * The [TestAllTypesProto2.MutableMessageSetCorrectExtension1] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableTestAllTypesProto2.MessageSetCorrectExtension1(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 =
    pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MessageSetCorrectExtension1")
public fun TestAllTypesProto2.MessageSetCorrectExtension1?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 = this ?: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.defaultInstance

private class TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
    override val str: String?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        str: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1 {
        this.str = str
        this.unknownFields += unknownFields
    }
}

private class TestAllTypesProto2_MutableMessageSetCorrectExtension1_Impl(
    override var str: String?,
) : pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension1.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension1.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        str: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageSetCorrectExtension1() = TestAllTypesProto2_MessageSetCorrectExtension1_Impl(
        str = str,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [TestAllTypesProto2.MutableMessageSetCorrectExtension2] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTestAllTypesProto2MessageSetCorrectExtension2")
public fun TestAllTypesProto2.Companion.MessageSetCorrectExtension2(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 =
    pbandk.conformance.pb.TestAllTypesProto2_MutableMessageSetCorrectExtension2_Impl(
        i = null,
    ).also(builderAction).toMessageSetCorrectExtension2()

/**
 * The [TestAllTypesProto2.MutableMessageSetCorrectExtension2] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableTestAllTypesProto2.MessageSetCorrectExtension2(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2.() -> Unit): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 =
    pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTestAllTypesProto2MessageSetCorrectExtension2")
public fun TestAllTypesProto2.MessageSetCorrectExtension2?.orDefault(): pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 = this ?: pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.defaultInstance

private class TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
    override val i: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        i: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2 {
        this.i = i
        this.unknownFields += unknownFields
    }
}

private class TestAllTypesProto2_MutableMessageSetCorrectExtension2_Impl(
    override var i: Int?,
) : pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2>() {
    override val descriptor get() = pbandk.conformance.pb.TestAllTypesProto2.MessageSetCorrectExtension2.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.TestAllTypesProto2.MutableMessageSetCorrectExtension2.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        i: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMessageSetCorrectExtension2() = TestAllTypesProto2_MessageSetCorrectExtension2_Impl(
        i = i,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ForeignMessageProto2 { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.ForeignMessageProto2"],
        expression = "ForeignMessageProto2 {\nthis.c = c\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ForeignMessageProto2(
    c: Int? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.ForeignMessageProto2 = pbandk.conformance.pb.ForeignMessageProto2 {
    this.c = c
    this.unknownFields += unknownFields
}

/**
 * The [MutableForeignMessageProto2] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildForeignMessageProto2")
public fun ForeignMessageProto2(builderAction: pbandk.conformance.pb.MutableForeignMessageProto2.() -> Unit): pbandk.conformance.pb.ForeignMessageProto2 =
    pbandk.conformance.pb.MutableForeignMessageProto2_Impl(
        c = null,
    ).also(builderAction).toForeignMessageProto2()

@pbandk.Export
@pbandk.JsName("orDefaultForForeignMessageProto2")
public fun ForeignMessageProto2?.orDefault(): pbandk.conformance.pb.ForeignMessageProto2 = this ?: pbandk.conformance.pb.ForeignMessageProto2.defaultInstance

private class ForeignMessageProto2_Impl(
    override val c: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.ForeignMessageProto2, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.ForeignMessageProto2>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.ForeignMessageProto2.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableForeignMessageProto2.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        c: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.ForeignMessageProto2 {
        this.c = c
        this.unknownFields += unknownFields
    }
}

private class MutableForeignMessageProto2_Impl(
    override var c: Int?,
) : pbandk.conformance.pb.MutableForeignMessageProto2, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.ForeignMessageProto2>() {
    override val descriptor get() = pbandk.conformance.pb.ForeignMessageProto2.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableForeignMessageProto2.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        c: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toForeignMessageProto2() = ForeignMessageProto2_Impl(
        c = c,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use UnknownToTestAllTypes { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.conformance.pb.UnknownToTestAllTypes"],
        expression = "UnknownToTestAllTypes {\nthis.optionalInt32 = optionalInt32\nthis.optionalString = optionalString\nthis.nestedMessage = nestedMessage\nthis.optionalBool = optionalBool\nthis.repeatedInt32 += repeatedInt32\nthis.unknownFields += unknownFields\n}",
    )
)
public fun UnknownToTestAllTypes(
    optionalInt32: Int? = null,
    optionalString: String? = null,
    nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
    optionalBool: Boolean? = null,
    repeatedInt32: List<Int> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.conformance.pb.UnknownToTestAllTypes = pbandk.conformance.pb.UnknownToTestAllTypes {
    this.optionalInt32 = optionalInt32
    this.optionalString = optionalString
    this.nestedMessage = nestedMessage
    this.optionalBool = optionalBool
    this.repeatedInt32 += repeatedInt32
    this.unknownFields += unknownFields
}

/**
 * The [MutableUnknownToTestAllTypes] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUnknownToTestAllTypes")
public fun UnknownToTestAllTypes(builderAction: pbandk.conformance.pb.MutableUnknownToTestAllTypes.() -> Unit): pbandk.conformance.pb.UnknownToTestAllTypes =
    pbandk.conformance.pb.MutableUnknownToTestAllTypes_Impl(
        optionalInt32 = null,
        optionalString = null,
        nestedMessage = null,
        optionalBool = null,
        repeatedInt32 = pbandk.gen.MutableListField(pbandk.conformance.pb.UnknownToTestAllTypes.FieldDescriptors.repeatedInt32),
    ).also(builderAction).toUnknownToTestAllTypes()

@pbandk.Export
@pbandk.JsName("orDefaultForUnknownToTestAllTypes")
public fun UnknownToTestAllTypes?.orDefault(): pbandk.conformance.pb.UnknownToTestAllTypes = this ?: pbandk.conformance.pb.UnknownToTestAllTypes.defaultInstance

private class UnknownToTestAllTypes_Impl(
    override val optionalInt32: Int?,
    override val optionalString: String?,
    override val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
    override val optionalBool: Boolean?,
    override val repeatedInt32: pbandk.gen.ListField<Int>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.UnknownToTestAllTypes, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.UnknownToTestAllTypes>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.UnknownToTestAllTypes.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableUnknownToTestAllTypes.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        optionalInt32: Int?,
        optionalString: String?,
        nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
        optionalBool: Boolean?,
        repeatedInt32: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.UnknownToTestAllTypes {
        this.optionalInt32 = optionalInt32
        this.optionalString = optionalString
        this.nestedMessage = nestedMessage
        this.optionalBool = optionalBool
        this.repeatedInt32 += repeatedInt32
        this.unknownFields += unknownFields
    }
}

private class MutableUnknownToTestAllTypes_Impl(
    override var optionalInt32: Int?,
    override var optionalString: String?,
    override var nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
    override var optionalBool: Boolean?,
    override val repeatedInt32: pbandk.gen.MutableListField<Int>,
) : pbandk.conformance.pb.MutableUnknownToTestAllTypes, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.UnknownToTestAllTypes>() {
    override val descriptor get() = pbandk.conformance.pb.UnknownToTestAllTypes.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.MutableUnknownToTestAllTypes.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        optionalInt32: Int?,
        optionalString: String?,
        nestedMessage: pbandk.conformance.pb.ForeignMessageProto2?,
        optionalBool: Boolean?,
        repeatedInt32: List<Int>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toUnknownToTestAllTypes() = UnknownToTestAllTypes_Impl(
        optionalInt32 = optionalInt32,
        optionalString = optionalString,
        nestedMessage = nestedMessage,
        optionalBool = optionalBool,
        repeatedInt32 = repeatedInt32.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [UnknownToTestAllTypes.MutableOptionalGroup] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUnknownToTestAllTypesOptionalGroup")
public fun UnknownToTestAllTypes.Companion.OptionalGroup(builderAction: pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup.() -> Unit): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup =
    pbandk.conformance.pb.UnknownToTestAllTypes_MutableOptionalGroup_Impl(
        a = null,
    ).also(builderAction).toOptionalGroup()

/**
 * The [UnknownToTestAllTypes.MutableOptionalGroup] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableUnknownToTestAllTypes.OptionalGroup(builderAction: pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup.() -> Unit): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup =
    pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForUnknownToTestAllTypesOptionalGroup")
public fun UnknownToTestAllTypes.OptionalGroup?.orDefault(): pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup = this ?: pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.defaultInstance

private class UnknownToTestAllTypes_OptionalGroup_Impl(
    override val a: Int?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup, pbandk.gen.GeneratedMessage<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup>(unknownFields) {
    override val descriptor get() = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup {
        this.a = a
        this.unknownFields += unknownFields
    }
}

private class UnknownToTestAllTypes_MutableOptionalGroup_Impl(
    override var a: Int?,
) : pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup, pbandk.gen.MutableGeneratedMessage<pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup>() {
    override val descriptor get() = pbandk.conformance.pb.UnknownToTestAllTypes.OptionalGroup.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.conformance.pb.UnknownToTestAllTypes.MutableOptionalGroup.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        a: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toOptionalGroup() = UnknownToTestAllTypes_OptionalGroup_Impl(
        a = a,
        unknownFields = unknownFields.toMap()
    )
}

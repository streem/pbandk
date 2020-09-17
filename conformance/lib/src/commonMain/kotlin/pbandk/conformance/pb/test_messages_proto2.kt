@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

sealed class ForeignEnumProto2(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is ForeignEnumProto2 && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "ForeignEnumProto2.${name ?: "UNRECOGNIZED"}(value=$value)"

    object FOREIGN_FOO : ForeignEnumProto2(0, "FOREIGN_FOO")
    object FOREIGN_BAR : ForeignEnumProto2(1, "FOREIGN_BAR")
    object FOREIGN_BAZ : ForeignEnumProto2(2, "FOREIGN_BAZ")
    class UNRECOGNIZED(value: Int) : ForeignEnumProto2(value)

    companion object : pbandk.Message.Enum.Companion<ForeignEnumProto2> {
        val values: List<ForeignEnumProto2> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnumProto2 with name: $name")
    }
}

data class TestAllTypesProto2(
    val optionalInt32: Int? = null,
    val optionalInt64: Long? = null,
    val optionalUint32: Int? = null,
    val optionalUint64: Long? = null,
    val optionalSint32: Int? = null,
    val optionalSint64: Long? = null,
    val optionalFixed32: Int? = null,
    val optionalFixed64: Long? = null,
    val optionalSfixed32: Int? = null,
    val optionalSfixed64: Long? = null,
    val optionalFloat: Float? = null,
    val optionalDouble: Double? = null,
    val optionalBool: Boolean? = null,
    val optionalString: String? = null,
    val optionalBytes: pbandk.ByteArr? = null,
    val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
    val optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
    val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
    val optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2? = null,
    val optionalStringPiece: String? = null,
    val optionalCord: String? = null,
    val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2? = null,
    val repeatedInt32: List<Int> = emptyList(),
    val repeatedInt64: List<Long> = emptyList(),
    val repeatedUint32: List<Int> = emptyList(),
    val repeatedUint64: List<Long> = emptyList(),
    val repeatedSint32: List<Int> = emptyList(),
    val repeatedSint64: List<Long> = emptyList(),
    val repeatedFixed32: List<Int> = emptyList(),
    val repeatedFixed64: List<Long> = emptyList(),
    val repeatedSfixed32: List<Int> = emptyList(),
    val repeatedSfixed64: List<Long> = emptyList(),
    val repeatedFloat: List<Float> = emptyList(),
    val repeatedDouble: List<Double> = emptyList(),
    val repeatedBool: List<Boolean> = emptyList(),
    val repeatedString: List<String> = emptyList(),
    val repeatedBytes: List<pbandk.ByteArr> = emptyList(),
    val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage> = emptyList(),
    val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2> = emptyList(),
    val repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
    val repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnumProto2> = emptyList(),
    val repeatedStringPiece: List<String> = emptyList(),
    val repeatedCord: List<String> = emptyList(),
    val packedInt32: List<Int> = emptyList(),
    val packedInt64: List<Long> = emptyList(),
    val packedUint32: List<Int> = emptyList(),
    val packedUint64: List<Long> = emptyList(),
    val packedSint32: List<Int> = emptyList(),
    val packedSint64: List<Long> = emptyList(),
    val packedFixed32: List<Int> = emptyList(),
    val packedFixed64: List<Long> = emptyList(),
    val packedSfixed32: List<Int> = emptyList(),
    val packedSfixed64: List<Long> = emptyList(),
    val packedFloat: List<Float> = emptyList(),
    val packedDouble: List<Double> = emptyList(),
    val packedBool: List<Boolean> = emptyList(),
    val packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
    val unpackedInt32: List<Int> = emptyList(),
    val unpackedInt64: List<Long> = emptyList(),
    val unpackedUint32: List<Int> = emptyList(),
    val unpackedUint64: List<Long> = emptyList(),
    val unpackedSint32: List<Int> = emptyList(),
    val unpackedSint64: List<Long> = emptyList(),
    val unpackedFixed32: List<Int> = emptyList(),
    val unpackedFixed64: List<Long> = emptyList(),
    val unpackedSfixed32: List<Int> = emptyList(),
    val unpackedSfixed64: List<Long> = emptyList(),
    val unpackedFloat: List<Float> = emptyList(),
    val unpackedDouble: List<Double> = emptyList(),
    val unpackedBool: List<Boolean> = emptyList(),
    val unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum> = emptyList(),
    val mapInt32Int32: Map<Int?, Int?> = emptyMap(),
    val mapInt64Int64: Map<Long?, Long?> = emptyMap(),
    val mapUint32Uint32: Map<Int?, Int?> = emptyMap(),
    val mapUint64Uint64: Map<Long?, Long?> = emptyMap(),
    val mapSint32Sint32: Map<Int?, Int?> = emptyMap(),
    val mapSint64Sint64: Map<Long?, Long?> = emptyMap(),
    val mapFixed32Fixed32: Map<Int?, Int?> = emptyMap(),
    val mapFixed64Fixed64: Map<Long?, Long?> = emptyMap(),
    val mapSfixed32Sfixed32: Map<Int?, Int?> = emptyMap(),
    val mapSfixed64Sfixed64: Map<Long?, Long?> = emptyMap(),
    val mapInt32Float: Map<Int?, Float?> = emptyMap(),
    val mapInt32Double: Map<Int?, Double?> = emptyMap(),
    val mapBoolBool: Map<Boolean?, Boolean?> = emptyMap(),
    val mapStringString: Map<String?, String?> = emptyMap(),
    val mapStringBytes: Map<String?, pbandk.ByteArr?> = emptyMap(),
    val mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> = emptyMap(),
    val mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2?> = emptyMap(),
    val mapStringNestedEnum: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> = emptyMap(),
    val mapStringForeignEnum: Map<String?, pbandk.conformance.pb.ForeignEnumProto2?> = emptyMap(),
    val fieldname1: Int? = null,
    val fieldName2: Int? = null,
    val fieldName3: Int? = null,
    val field_name4: Int? = null,
    val field0name5: Int? = null,
    val field0Name6: Int? = null,
    val fieldName7: Int? = null,
    val fieldName8: Int? = null,
    val fieldName9: Int? = null,
    val fieldName10: Int? = null,
    val fIELDNAME11: Int? = null,
    val fIELDName12: Int? = null,
    val _fieldName13: Int? = null,
    val _FieldName14: Int? = null,
    val field_name15: Int? = null,
    val field_Name16: Int? = null,
    val fieldName17_: Int? = null,
    val fieldName18_: Int? = null,
    val oneofField: OneofField<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class OneofUint32(oneofUint32: Int = 0) : OneofField<Int>(oneofUint32)
        class OneofNestedMessage(oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage) : OneofField<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>(oneofNestedMessage)
        class OneofString(oneofString: String = "") : OneofField<String>(oneofString)
        class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField<pbandk.ByteArr>(oneofBytes)
        class OneofBool(oneofBool: Boolean = false) : OneofField<Boolean>(oneofBool)
        class OneofUint64(oneofUint64: Long = 0L) : OneofField<Long>(oneofUint64)
        class OneofFloat(oneofFloat: Float = 0.0F) : OneofField<Float>(oneofFloat)
        class OneofDouble(oneofDouble: Double = 0.0) : OneofField<Double>(oneofDouble)
        class OneofEnum(oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0)) : OneofField<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(oneofEnum)
    }

    val oneofUint32: Int?
        get() = (oneofField as? OneofField.OneofUint32)?.value
    val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?
        get() = (oneofField as? OneofField.OneofNestedMessage)?.value
    val oneofString: String?
        get() = (oneofField as? OneofField.OneofString)?.value
    val oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? OneofField.OneofBytes)?.value
    val oneofBool: Boolean?
        get() = (oneofField as? OneofField.OneofBool)?.value
    val oneofUint64: Long?
        get() = (oneofField as? OneofField.OneofUint64)?.value
    val oneofFloat: Float?
        get() = (oneofField as? OneofField.OneofFloat)?.value
    val oneofDouble: Double?
        get() = (oneofField as? OneofField.OneofDouble)?.value
    val oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?
        get() = (oneofField as? OneofField.OneofEnum)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestAllTypesProto2> {
        val defaultInstance by lazy { TestAllTypesProto2() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestAllTypesProto2::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int32",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = TestAllTypesProto2::optionalInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int64",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "optionalInt64",
                        value = TestAllTypesProto2::optionalInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_uint32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "optionalUint32",
                        value = TestAllTypesProto2::optionalUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_uint64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "optionalUint64",
                        value = TestAllTypesProto2::optionalUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "optionalSint32",
                        value = TestAllTypesProto2::optionalSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "optionalSint64",
                        value = TestAllTypesProto2::optionalSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_fixed32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "optionalFixed32",
                        value = TestAllTypesProto2::optionalFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_fixed64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "optionalFixed64",
                        value = TestAllTypesProto2::optionalFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sfixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "optionalSfixed32",
                        value = TestAllTypesProto2::optionalSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sfixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "optionalSfixed64",
                        value = TestAllTypesProto2::optionalSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "optionalFloat",
                        value = TestAllTypesProto2::optionalFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_double",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "optionalDouble",
                        value = TestAllTypesProto2::optionalDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "optionalBool",
                        value = TestAllTypesProto2::optionalBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = TestAllTypesProto2::optionalString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "optionalBytes",
                        value = TestAllTypesProto2::optionalBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_nested_message",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = TestAllTypesProto2::optionalNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_foreign_message",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion),
                        jsonName = "optionalForeignMessage",
                        value = TestAllTypesProto2::optionalForeignMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_nested_enum",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true),
                        jsonName = "optionalNestedEnum",
                        value = TestAllTypesProto2::optionalNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion, hasPresence = true),
                        jsonName = "optionalForeignEnum",
                        value = TestAllTypesProto2::optionalForeignEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_string_piece",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalStringPiece",
                        value = TestAllTypesProto2::optionalStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_cord",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalCord",
                        value = TestAllTypesProto2::optionalCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "recursive_message",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.Companion),
                        jsonName = "recursiveMessage",
                        value = TestAllTypesProto2::recursiveMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int32",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "repeatedInt32",
                        value = TestAllTypesProto2::repeatedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int64",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "repeatedInt64",
                        value = TestAllTypesProto2::repeatedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_uint32",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "repeatedUint32",
                        value = TestAllTypesProto2::repeatedUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_uint64",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "repeatedUint64",
                        value = TestAllTypesProto2::repeatedUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sint32",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "repeatedSint32",
                        value = TestAllTypesProto2::repeatedSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sint64",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "repeatedSint64",
                        value = TestAllTypesProto2::repeatedSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_fixed32",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "repeatedFixed32",
                        value = TestAllTypesProto2::repeatedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_fixed64",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "repeatedFixed64",
                        value = TestAllTypesProto2::repeatedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sfixed32",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "repeatedSfixed32",
                        value = TestAllTypesProto2::repeatedSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sfixed64",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "repeatedSfixed64",
                        value = TestAllTypesProto2::repeatedSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_float",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "repeatedFloat",
                        value = TestAllTypesProto2::repeatedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_double",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "repeatedDouble",
                        value = TestAllTypesProto2::repeatedDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_bool",
                        number = 43,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "repeatedBool",
                        value = TestAllTypesProto2::repeatedBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_string",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedString",
                        value = TestAllTypesProto2::repeatedString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_bytes",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "repeatedBytes",
                        value = TestAllTypesProto2::repeatedBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_nested_message",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)),
                        jsonName = "repeatedNestedMessage",
                        value = TestAllTypesProto2::repeatedNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_foreign_message",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignMessageProto2>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion)),
                        jsonName = "repeatedForeignMessage",
                        value = TestAllTypesProto2::repeatedForeignMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_nested_enum",
                        number = 51,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)),
                        jsonName = "repeatedNestedEnum",
                        value = TestAllTypesProto2::repeatedNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_foreign_enum",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.ForeignEnumProto2>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion)),
                        jsonName = "repeatedForeignEnum",
                        value = TestAllTypesProto2::repeatedForeignEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_string_piece",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedStringPiece",
                        value = TestAllTypesProto2::repeatedStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_cord",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedCord",
                        value = TestAllTypesProto2::repeatedCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_int32_int32",
                        number = 56,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "mapInt32Int32",
                        value = TestAllTypesProto2::mapInt32Int32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_int64_int64",
                        number = 57,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true)),
                        jsonName = "mapInt64Int64",
                        value = TestAllTypesProto2::mapInt64Int64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_uint32_uint32",
                        number = 58,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true)),
                        jsonName = "mapUint32Uint32",
                        value = TestAllTypesProto2::mapUint32Uint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_uint64_uint64",
                        number = 59,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true)),
                        jsonName = "mapUint64Uint64",
                        value = TestAllTypesProto2::mapUint64Uint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_sint32_sint32",
                        number = 60,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true)),
                        jsonName = "mapSint32Sint32",
                        value = TestAllTypesProto2::mapSint32Sint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_sint64_sint64",
                        number = 61,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true)),
                        jsonName = "mapSint64Sint64",
                        value = TestAllTypesProto2::mapSint64Sint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_fixed32_fixed32",
                        number = 62,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true)),
                        jsonName = "mapFixed32Fixed32",
                        value = TestAllTypesProto2::mapFixed32Fixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_fixed64_fixed64",
                        number = 63,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true)),
                        jsonName = "mapFixed64Fixed64",
                        value = TestAllTypesProto2::mapFixed64Fixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_sfixed32_sfixed32",
                        number = 64,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Int?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true)),
                        jsonName = "mapSfixed32Sfixed32",
                        value = TestAllTypesProto2::mapSfixed32Sfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_sfixed64_sfixed64",
                        number = 65,
                        type = pbandk.FieldDescriptor.Type.Map<Long?, Long?>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true)),
                        jsonName = "mapSfixed64Sfixed64",
                        value = TestAllTypesProto2::mapSfixed64Sfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_int32_float",
                        number = 66,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Float?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true)),
                        jsonName = "mapInt32Float",
                        value = TestAllTypesProto2::mapInt32Float
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_int32_double",
                        number = 67,
                        type = pbandk.FieldDescriptor.Type.Map<Int?, Double?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true)),
                        jsonName = "mapInt32Double",
                        value = TestAllTypesProto2::mapInt32Double
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_bool_bool",
                        number = 68,
                        type = pbandk.FieldDescriptor.Type.Map<Boolean?, Boolean?>(keyType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true)),
                        jsonName = "mapBoolBool",
                        value = TestAllTypesProto2::mapBoolBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_string_string",
                        number = 69,
                        type = pbandk.FieldDescriptor.Type.Map<String?, String?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "mapStringString",
                        value = TestAllTypesProto2::mapStringString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_string_bytes",
                        number = 70,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.ByteArr?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true)),
                        jsonName = "mapStringBytes",
                        value = TestAllTypesProto2::mapStringBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_string_nested_message",
                        number = 71,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)),
                        jsonName = "mapStringNestedMessage",
                        value = TestAllTypesProto2::mapStringNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_string_foreign_message",
                        number = 72,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.ForeignMessageProto2?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion)),
                        jsonName = "mapStringForeignMessage",
                        value = TestAllTypesProto2::mapStringForeignMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_string_nested_enum",
                        number = 73,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true)),
                        jsonName = "mapStringNestedEnum",
                        value = TestAllTypesProto2::mapStringNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "map_string_foreign_enum",
                        number = 74,
                        type = pbandk.FieldDescriptor.Type.Map<String?, pbandk.conformance.pb.ForeignEnumProto2?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion, hasPresence = true)),
                        jsonName = "mapStringForeignEnum",
                        value = TestAllTypesProto2::mapStringForeignEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_int32",
                        number = 75,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "packedInt32",
                        value = TestAllTypesProto2::packedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_int64",
                        number = 76,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "packedInt64",
                        value = TestAllTypesProto2::packedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_uint32",
                        number = 77,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "packedUint32",
                        value = TestAllTypesProto2::packedUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_uint64",
                        number = 78,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "packedUint64",
                        value = TestAllTypesProto2::packedUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sint32",
                        number = 79,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "packedSint32",
                        value = TestAllTypesProto2::packedSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sint64",
                        number = 80,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "packedSint64",
                        value = TestAllTypesProto2::packedSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_fixed32",
                        number = 81,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "packedFixed32",
                        value = TestAllTypesProto2::packedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_fixed64",
                        number = 82,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "packedFixed64",
                        value = TestAllTypesProto2::packedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sfixed32",
                        number = 83,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "packedSfixed32",
                        value = TestAllTypesProto2::packedSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sfixed64",
                        number = 84,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "packedSfixed64",
                        value = TestAllTypesProto2::packedSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_float",
                        number = 85,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "packedFloat",
                        value = TestAllTypesProto2::packedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_double",
                        number = 86,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "packedDouble",
                        value = TestAllTypesProto2::packedDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_bool",
                        number = 87,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "packedBool",
                        value = TestAllTypesProto2::packedBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_nested_enum",
                        number = 88,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion), packed = true),
                        jsonName = "packedNestedEnum",
                        value = TestAllTypesProto2::packedNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_int32",
                        number = 89,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "unpackedInt32",
                        value = TestAllTypesProto2::unpackedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_int64",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "unpackedInt64",
                        value = TestAllTypesProto2::unpackedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_uint32",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "unpackedUint32",
                        value = TestAllTypesProto2::unpackedUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_uint64",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "unpackedUint64",
                        value = TestAllTypesProto2::unpackedUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sint32",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "unpackedSint32",
                        value = TestAllTypesProto2::unpackedSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sint64",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "unpackedSint64",
                        value = TestAllTypesProto2::unpackedSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_fixed32",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "unpackedFixed32",
                        value = TestAllTypesProto2::unpackedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_fixed64",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "unpackedFixed64",
                        value = TestAllTypesProto2::unpackedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sfixed32",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "unpackedSfixed32",
                        value = TestAllTypesProto2::unpackedSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sfixed64",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "unpackedSfixed64",
                        value = TestAllTypesProto2::unpackedSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_float",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "unpackedFloat",
                        value = TestAllTypesProto2::unpackedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_double",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "unpackedDouble",
                        value = TestAllTypesProto2::unpackedDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_bool",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "unpackedBool",
                        value = TestAllTypesProto2::unpackedBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_nested_enum",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.conformance.pb.TestAllTypesProto2.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)),
                        jsonName = "unpackedNestedEnum",
                        value = TestAllTypesProto2::unpackedNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_uint32",
                        number = 111,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint32",
                        value = TestAllTypesProto2::oneofUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_nested_message",
                        number = 112,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "oneofNestedMessage",
                        value = TestAllTypesProto2::oneofNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_string",
                        number = 113,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofString",
                        value = TestAllTypesProto2::oneofString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_bytes",
                        number = 114,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBytes",
                        value = TestAllTypesProto2::oneofBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_bool",
                        number = 115,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBool",
                        value = TestAllTypesProto2::oneofBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_uint64",
                        number = 116,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint64",
                        value = TestAllTypesProto2::oneofUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_float",
                        number = 117,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofFloat",
                        value = TestAllTypesProto2::oneofFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_double",
                        number = 118,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofDouble",
                        value = TestAllTypesProto2::oneofDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_enum",
                        number = 119,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofEnum",
                        value = TestAllTypesProto2::oneofEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "fieldname1",
                        number = 401,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldname1",
                        value = TestAllTypesProto2::fieldname1
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field_name2",
                        number = 402,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName2",
                        value = TestAllTypesProto2::fieldName2
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "_field_name3",
                        number = 403,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName3",
                        value = TestAllTypesProto2::fieldName3
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field__name4_",
                        number = 404,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName4",
                        value = TestAllTypesProto2::field_name4
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field0name5",
                        number = 405,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field0name5",
                        value = TestAllTypesProto2::field0name5
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field_0_name6",
                        number = 406,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field0Name6",
                        value = TestAllTypesProto2::field0Name6
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "fieldName7",
                        number = 407,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName7",
                        value = TestAllTypesProto2::fieldName7
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "FieldName8",
                        number = 408,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName8",
                        value = TestAllTypesProto2::fieldName8
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field_Name9",
                        number = 409,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName9",
                        value = TestAllTypesProto2::fieldName9
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "Field_Name10",
                        number = 410,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName10",
                        value = TestAllTypesProto2::fieldName10
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "FIELD_NAME11",
                        number = 411,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FIELDNAME11",
                        value = TestAllTypesProto2::fIELDNAME11
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "FIELD_name12",
                        number = 412,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FIELDName12",
                        value = TestAllTypesProto2::fIELDName12
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "__field_name13",
                        number = 413,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName13",
                        value = TestAllTypesProto2::_fieldName13
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "__Field_name14",
                        number = 414,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName14",
                        value = TestAllTypesProto2::_FieldName14
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field__name15",
                        number = 415,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName15",
                        value = TestAllTypesProto2::field_name15
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field__Name16",
                        number = 416,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName16",
                        value = TestAllTypesProto2::field_Name16
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field_name17__",
                        number = 417,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName17",
                        value = TestAllTypesProto2::fieldName17_
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "Field_name18__",
                        number = 418,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName18",
                        value = TestAllTypesProto2::fieldName18_
                    )
                )
            )
        }
    }

    sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is TestAllTypesProto2.NestedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestAllTypesProto2.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object FOO : NestedEnum(0, "FOO")
        object BAR : NestedEnum(1, "BAR")
        object BAZ : NestedEnum(2, "BAZ")
        object NEG : NestedEnum(-1, "NEG")
        class UNRECOGNIZED(value: Int) : TestAllTypesProto2.NestedEnum(value)

        companion object : pbandk.Message.Enum.Companion<TestAllTypesProto2.NestedEnum> {
            val values: List<TestAllTypesProto2.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    data class NestedMessage(
        val a: Int? = null,
        val corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.NestedMessage> {
            val defaultInstance by lazy { TestAllTypesProto2.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.NestedMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.NestedMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestAllTypesProto2.NestedMessage::a
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "corecursive",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.Companion),
                            jsonName = "corecursive",
                            value = TestAllTypesProto2.NestedMessage::corecursive
                        )
                    )
                )
            }
        }
    }

    data class MapInt32Int32Entry(
        override val key: Int? = null,
        override val value: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Int?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapInt32Int32Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapInt32Int32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapInt32Int32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapInt32Int32Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapInt32Int32Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapInt32Int32Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapInt32Int32Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapInt64Int64Entry(
        override val key: Long? = null,
        override val value: Long? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long?, Long?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapInt64Int64Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapInt64Int64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapInt64Int64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapInt64Int64Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapInt64Int64Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapInt64Int64Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapInt64Int64Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapUint32Uint32Entry(
        override val key: Int? = null,
        override val value: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Int?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapUint32Uint32Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapUint32Uint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapUint32Uint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapUint32Uint32Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapUint32Uint32Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapUint32Uint32Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapUint32Uint32Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapUint64Uint64Entry(
        override val key: Long? = null,
        override val value: Long? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long?, Long?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapUint64Uint64Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapUint64Uint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapUint64Uint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapUint64Uint64Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapUint64Uint64Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapUint64Uint64Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapUint64Uint64Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapSint32Sint32Entry(
        override val key: Int? = null,
        override val value: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Int?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapSint32Sint32Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapSint32Sint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapSint32Sint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapSint32Sint32Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapSint32Sint32Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapSint32Sint32Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapSint32Sint32Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapSint64Sint64Entry(
        override val key: Long? = null,
        override val value: Long? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long?, Long?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapSint64Sint64Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapSint64Sint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapSint64Sint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapSint64Sint64Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapSint64Sint64Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapSint64Sint64Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapSint64Sint64Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapFixed32Fixed32Entry(
        override val key: Int? = null,
        override val value: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Int?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapFixed32Fixed32Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapFixed32Fixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapFixed32Fixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapFixed32Fixed32Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapFixed32Fixed32Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapFixed32Fixed32Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapFixed32Fixed32Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapFixed64Fixed64Entry(
        override val key: Long? = null,
        override val value: Long? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long?, Long?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapFixed64Fixed64Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapFixed64Fixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapFixed64Fixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapFixed64Fixed64Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapFixed64Fixed64Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapFixed64Fixed64Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapFixed64Fixed64Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapSfixed32Sfixed32Entry(
        override val key: Int? = null,
        override val value: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Int?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapSfixed32Sfixed32Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapSfixed32Sfixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapSfixed32Sfixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapSfixed32Sfixed32Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapSfixed32Sfixed32Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapSfixed32Sfixed32Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapSfixed32Sfixed32Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapSfixed64Sfixed64Entry(
        override val key: Long? = null,
        override val value: Long? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Long?, Long?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapSfixed64Sfixed64Entry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapSfixed64Sfixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapSfixed64Sfixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapSfixed64Sfixed64Entry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapSfixed64Sfixed64Entry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapSfixed64Sfixed64Entry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapSfixed64Sfixed64Entry::value
                        )
                    )
                )
            }
        }
    }

    data class MapInt32FloatEntry(
        override val key: Int? = null,
        override val value: Float? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Float?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapInt32FloatEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapInt32FloatEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapInt32FloatEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapInt32FloatEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapInt32FloatEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapInt32FloatEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapInt32FloatEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapInt32DoubleEntry(
        override val key: Int? = null,
        override val value: Double? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Int?, Double?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapInt32DoubleEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapInt32DoubleEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapInt32DoubleEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapInt32DoubleEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapInt32DoubleEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapInt32DoubleEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapInt32DoubleEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapBoolBoolEntry(
        override val key: Boolean? = null,
        override val value: Boolean? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<Boolean?, Boolean?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapBoolBoolEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapBoolBoolEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapBoolBoolEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapBoolBoolEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapBoolBoolEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapBoolBoolEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapBoolBoolEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapStringStringEntry(
        override val key: String? = null,
        override val value: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, String?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapStringStringEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapStringStringEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapStringStringEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapStringStringEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapStringStringEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapStringStringEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapStringStringEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapStringBytesEntry(
        override val key: String? = null,
        override val value: pbandk.ByteArr? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, pbandk.ByteArr?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapStringBytesEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapStringBytesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapStringBytesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapStringBytesEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapStringBytesEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapStringBytesEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapStringBytesEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapStringNestedMessageEntry(
        override val key: String? = null,
        override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapStringNestedMessageEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapStringNestedMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapStringNestedMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapStringNestedMessageEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapStringNestedMessageEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapStringNestedMessageEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapStringNestedMessageEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapStringForeignMessageEntry(
        override val key: String? = null,
        override val value: pbandk.conformance.pb.ForeignMessageProto2? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.ForeignMessageProto2?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapStringForeignMessageEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapStringForeignMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapStringForeignMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapStringForeignMessageEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapStringForeignMessageEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapStringForeignMessageEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapStringForeignMessageEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapStringNestedEnumEntry(
        override val key: String? = null,
        override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapStringNestedEnumEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapStringNestedEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapStringNestedEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapStringNestedEnumEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapStringNestedEnumEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapStringNestedEnumEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion, hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapStringNestedEnumEntry::value
                        )
                    )
                )
            }
        }
    }

    data class MapStringForeignEnumEntry(
        override val key: String? = null,
        override val value: pbandk.conformance.pb.ForeignEnumProto2? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, pbandk.conformance.pb.ForeignEnumProto2?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MapStringForeignEnumEntry> {
            val defaultInstance by lazy { TestAllTypesProto2.MapStringForeignEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MapStringForeignEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MapStringForeignEnumEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MapStringForeignEnumEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestAllTypesProto2.MapStringForeignEnumEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.ForeignEnumProto2.Companion, hasPresence = true),
                            jsonName = "value",
                            value = TestAllTypesProto2.MapStringForeignEnumEntry::value
                        )
                    )
                )
            }
        }
    }

    data class Data(
        val groupInt32: Int? = null,
        val groupUint32: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.Data> {
            val defaultInstance by lazy { TestAllTypesProto2.Data() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.Data.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.Data> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.Data::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "group_int32",
                            number = 202,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "groupInt32",
                            value = TestAllTypesProto2.Data::groupInt32
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "group_uint32",
                            number = 203,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                            jsonName = "groupUint32",
                            value = TestAllTypesProto2.Data::groupUint32
                        )
                    )
                )
            }
        }
    }

    data class MessageSetCorrect(
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MessageSetCorrect> {
            val defaultInstance by lazy { TestAllTypesProto2.MessageSetCorrect() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MessageSetCorrect.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MessageSetCorrect> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MessageSetCorrect::class,
                    messageCompanion = this,
                    fields = listOf(
                    )
                )
            }
        }
    }

    data class MessageSetCorrectExtension1(
        val str: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MessageSetCorrectExtension1> {
            val defaultInstance by lazy { TestAllTypesProto2.MessageSetCorrectExtension1() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MessageSetCorrectExtension1.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MessageSetCorrectExtension1> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MessageSetCorrectExtension1::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "str",
                            number = 25,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "str",
                            value = TestAllTypesProto2.MessageSetCorrectExtension1::str
                        )
                    )
                )
            }
        }
    }

    data class MessageSetCorrectExtension2(
        val i: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypesProto2.MessageSetCorrectExtension2> {
            val defaultInstance by lazy { TestAllTypesProto2.MessageSetCorrectExtension2() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypesProto2.MessageSetCorrectExtension2.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypesProto2.MessageSetCorrectExtension2> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypesProto2.MessageSetCorrectExtension2::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "i",
                            number = 9,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "i",
                            value = TestAllTypesProto2.MessageSetCorrectExtension2::i
                        )
                    )
                )
            }
        }
    }
}

data class ForeignMessageProto2(
    val c: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<ForeignMessageProto2> {
        val defaultInstance by lazy { ForeignMessageProto2() }
        override fun decodeWith(u: pbandk.MessageDecoder) = ForeignMessageProto2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ForeignMessageProto2> by lazy {
            pbandk.MessageDescriptor(
                messageClass = ForeignMessageProto2::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "c",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "c",
                        value = ForeignMessageProto2::c
                    )
                )
            )
        }
    }
}

data class UnknownToTestAllTypes(
    val optionalInt32: Int? = null,
    val optionalString: String? = null,
    val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
    val optionalBool: Boolean? = null,
    val repeatedInt32: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<UnknownToTestAllTypes> {
        val defaultInstance by lazy { UnknownToTestAllTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = UnknownToTestAllTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<UnknownToTestAllTypes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = UnknownToTestAllTypes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int32",
                        number = 1001,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = UnknownToTestAllTypes::optionalInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_string",
                        number = 1002,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = UnknownToTestAllTypes::optionalString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "nested_message",
                        number = 1003,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.ForeignMessageProto2.Companion),
                        jsonName = "nestedMessage",
                        value = UnknownToTestAllTypes::nestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_bool",
                        number = 1006,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "optionalBool",
                        value = UnknownToTestAllTypes::optionalBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int32",
                        number = 1011,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "repeatedInt32",
                        value = UnknownToTestAllTypes::repeatedInt32
                    )
                )
            )
        }
    }

    data class OptionalGroup(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<UnknownToTestAllTypes.OptionalGroup> {
            val defaultInstance by lazy { UnknownToTestAllTypes.OptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = UnknownToTestAllTypes.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<UnknownToTestAllTypes.OptionalGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = UnknownToTestAllTypes.OptionalGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = UnknownToTestAllTypes.OptionalGroup::a
                        )
                    )
                )
            }
        }
    }
}

fun TestAllTypesProto2?.orDefault() = this ?: TestAllTypesProto2.defaultInstance

private fun TestAllTypesProto2.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2 = (plus as? TestAllTypesProto2)?.copy(
    optionalInt32 = plus.optionalInt32 ?: optionalInt32,
    optionalInt64 = plus.optionalInt64 ?: optionalInt64,
    optionalUint32 = plus.optionalUint32 ?: optionalUint32,
    optionalUint64 = plus.optionalUint64 ?: optionalUint64,
    optionalSint32 = plus.optionalSint32 ?: optionalSint32,
    optionalSint64 = plus.optionalSint64 ?: optionalSint64,
    optionalFixed32 = plus.optionalFixed32 ?: optionalFixed32,
    optionalFixed64 = plus.optionalFixed64 ?: optionalFixed64,
    optionalSfixed32 = plus.optionalSfixed32 ?: optionalSfixed32,
    optionalSfixed64 = plus.optionalSfixed64 ?: optionalSfixed64,
    optionalFloat = plus.optionalFloat ?: optionalFloat,
    optionalDouble = plus.optionalDouble ?: optionalDouble,
    optionalBool = plus.optionalBool ?: optionalBool,
    optionalString = plus.optionalString ?: optionalString,
    optionalBytes = plus.optionalBytes ?: optionalBytes,
    optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
    optionalForeignMessage = optionalForeignMessage?.plus(plus.optionalForeignMessage) ?: plus.optionalForeignMessage,
    optionalNestedEnum = plus.optionalNestedEnum ?: optionalNestedEnum,
    optionalForeignEnum = plus.optionalForeignEnum ?: optionalForeignEnum,
    optionalStringPiece = plus.optionalStringPiece ?: optionalStringPiece,
    optionalCord = plus.optionalCord ?: optionalCord,
    recursiveMessage = recursiveMessage?.plus(plus.recursiveMessage) ?: plus.recursiveMessage,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    repeatedInt64 = repeatedInt64 + plus.repeatedInt64,
    repeatedUint32 = repeatedUint32 + plus.repeatedUint32,
    repeatedUint64 = repeatedUint64 + plus.repeatedUint64,
    repeatedSint32 = repeatedSint32 + plus.repeatedSint32,
    repeatedSint64 = repeatedSint64 + plus.repeatedSint64,
    repeatedFixed32 = repeatedFixed32 + plus.repeatedFixed32,
    repeatedFixed64 = repeatedFixed64 + plus.repeatedFixed64,
    repeatedSfixed32 = repeatedSfixed32 + plus.repeatedSfixed32,
    repeatedSfixed64 = repeatedSfixed64 + plus.repeatedSfixed64,
    repeatedFloat = repeatedFloat + plus.repeatedFloat,
    repeatedDouble = repeatedDouble + plus.repeatedDouble,
    repeatedBool = repeatedBool + plus.repeatedBool,
    repeatedString = repeatedString + plus.repeatedString,
    repeatedBytes = repeatedBytes + plus.repeatedBytes,
    repeatedNestedMessage = repeatedNestedMessage + plus.repeatedNestedMessage,
    repeatedForeignMessage = repeatedForeignMessage + plus.repeatedForeignMessage,
    repeatedNestedEnum = repeatedNestedEnum + plus.repeatedNestedEnum,
    repeatedForeignEnum = repeatedForeignEnum + plus.repeatedForeignEnum,
    repeatedStringPiece = repeatedStringPiece + plus.repeatedStringPiece,
    repeatedCord = repeatedCord + plus.repeatedCord,
    packedInt32 = packedInt32 + plus.packedInt32,
    packedInt64 = packedInt64 + plus.packedInt64,
    packedUint32 = packedUint32 + plus.packedUint32,
    packedUint64 = packedUint64 + plus.packedUint64,
    packedSint32 = packedSint32 + plus.packedSint32,
    packedSint64 = packedSint64 + plus.packedSint64,
    packedFixed32 = packedFixed32 + plus.packedFixed32,
    packedFixed64 = packedFixed64 + plus.packedFixed64,
    packedSfixed32 = packedSfixed32 + plus.packedSfixed32,
    packedSfixed64 = packedSfixed64 + plus.packedSfixed64,
    packedFloat = packedFloat + plus.packedFloat,
    packedDouble = packedDouble + plus.packedDouble,
    packedBool = packedBool + plus.packedBool,
    packedNestedEnum = packedNestedEnum + plus.packedNestedEnum,
    unpackedInt32 = unpackedInt32 + plus.unpackedInt32,
    unpackedInt64 = unpackedInt64 + plus.unpackedInt64,
    unpackedUint32 = unpackedUint32 + plus.unpackedUint32,
    unpackedUint64 = unpackedUint64 + plus.unpackedUint64,
    unpackedSint32 = unpackedSint32 + plus.unpackedSint32,
    unpackedSint64 = unpackedSint64 + plus.unpackedSint64,
    unpackedFixed32 = unpackedFixed32 + plus.unpackedFixed32,
    unpackedFixed64 = unpackedFixed64 + plus.unpackedFixed64,
    unpackedSfixed32 = unpackedSfixed32 + plus.unpackedSfixed32,
    unpackedSfixed64 = unpackedSfixed64 + plus.unpackedSfixed64,
    unpackedFloat = unpackedFloat + plus.unpackedFloat,
    unpackedDouble = unpackedDouble + plus.unpackedDouble,
    unpackedBool = unpackedBool + plus.unpackedBool,
    unpackedNestedEnum = unpackedNestedEnum + plus.unpackedNestedEnum,
    mapInt32Int32 = mapInt32Int32 + plus.mapInt32Int32,
    mapInt64Int64 = mapInt64Int64 + plus.mapInt64Int64,
    mapUint32Uint32 = mapUint32Uint32 + plus.mapUint32Uint32,
    mapUint64Uint64 = mapUint64Uint64 + plus.mapUint64Uint64,
    mapSint32Sint32 = mapSint32Sint32 + plus.mapSint32Sint32,
    mapSint64Sint64 = mapSint64Sint64 + plus.mapSint64Sint64,
    mapFixed32Fixed32 = mapFixed32Fixed32 + plus.mapFixed32Fixed32,
    mapFixed64Fixed64 = mapFixed64Fixed64 + plus.mapFixed64Fixed64,
    mapSfixed32Sfixed32 = mapSfixed32Sfixed32 + plus.mapSfixed32Sfixed32,
    mapSfixed64Sfixed64 = mapSfixed64Sfixed64 + plus.mapSfixed64Sfixed64,
    mapInt32Float = mapInt32Float + plus.mapInt32Float,
    mapInt32Double = mapInt32Double + plus.mapInt32Double,
    mapBoolBool = mapBoolBool + plus.mapBoolBool,
    mapStringString = mapStringString + plus.mapStringString,
    mapStringBytes = mapStringBytes + plus.mapStringBytes,
    mapStringNestedMessage = mapStringNestedMessage + plus.mapStringNestedMessage,
    mapStringForeignMessage = mapStringForeignMessage + plus.mapStringForeignMessage,
    mapStringNestedEnum = mapStringNestedEnum + plus.mapStringNestedEnum,
    mapStringForeignEnum = mapStringForeignEnum + plus.mapStringForeignEnum,
    fieldname1 = plus.fieldname1 ?: fieldname1,
    fieldName2 = plus.fieldName2 ?: fieldName2,
    fieldName3 = plus.fieldName3 ?: fieldName3,
    field_name4 = plus.field_name4 ?: field_name4,
    field0name5 = plus.field0name5 ?: field0name5,
    field0Name6 = plus.field0Name6 ?: field0Name6,
    fieldName7 = plus.fieldName7 ?: fieldName7,
    fieldName8 = plus.fieldName8 ?: fieldName8,
    fieldName9 = plus.fieldName9 ?: fieldName9,
    fieldName10 = plus.fieldName10 ?: fieldName10,
    fIELDNAME11 = plus.fIELDNAME11 ?: fIELDNAME11,
    fIELDName12 = plus.fIELDName12 ?: fIELDName12,
    _fieldName13 = plus._fieldName13 ?: _fieldName13,
    _FieldName14 = plus._FieldName14 ?: _FieldName14,
    field_name15 = plus.field_name15 ?: field_name15,
    field_Name16 = plus.field_Name16 ?: field_Name16,
    fieldName17_ = plus.fieldName17_ ?: fieldName17_,
    fieldName18_ = plus.fieldName18_ ?: fieldName18_,
    oneofField = when {
        oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage ->
            TestAllTypesProto2.OneofField.OneofNestedMessage(oneofField.value + plus.oneofField.value)
        else ->
            plus.oneofField ?: oneofField
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun TestAllTypesProto2.NestedMessage?.orDefault() = this ?: TestAllTypesProto2.NestedMessage.defaultInstance

private fun TestAllTypesProto2.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.NestedMessage = (plus as? TestAllTypesProto2.NestedMessage)?.copy(
    a = plus.a ?: a,
    corecursive = corecursive?.plus(plus.corecursive) ?: plus.corecursive,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.NestedMessage(a, corecursive, unknownFields)
}

fun TestAllTypesProto2.MapInt32Int32Entry?.orDefault() = this ?: TestAllTypesProto2.MapInt32Int32Entry.defaultInstance

private fun TestAllTypesProto2.MapInt32Int32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapInt32Int32Entry = (plus as? TestAllTypesProto2.MapInt32Int32Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapInt32Int32Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapInt64Int64Entry?.orDefault() = this ?: TestAllTypesProto2.MapInt64Int64Entry.defaultInstance

private fun TestAllTypesProto2.MapInt64Int64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapInt64Int64Entry = (plus as? TestAllTypesProto2.MapInt64Int64Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapInt64Int64Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapUint32Uint32Entry?.orDefault() = this ?: TestAllTypesProto2.MapUint32Uint32Entry.defaultInstance

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapUint32Uint32Entry = (plus as? TestAllTypesProto2.MapUint32Uint32Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapUint32Uint32Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapUint64Uint64Entry?.orDefault() = this ?: TestAllTypesProto2.MapUint64Uint64Entry.defaultInstance

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapUint64Uint64Entry = (plus as? TestAllTypesProto2.MapUint64Uint64Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapUint64Uint64Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapSint32Sint32Entry?.orDefault() = this ?: TestAllTypesProto2.MapSint32Sint32Entry.defaultInstance

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapSint32Sint32Entry = (plus as? TestAllTypesProto2.MapSint32Sint32Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapSint32Sint32Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapSint64Sint64Entry?.orDefault() = this ?: TestAllTypesProto2.MapSint64Sint64Entry.defaultInstance

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapSint64Sint64Entry = (plus as? TestAllTypesProto2.MapSint64Sint64Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapSint64Sint64Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapFixed32Fixed32Entry?.orDefault() = this ?: TestAllTypesProto2.MapFixed32Fixed32Entry.defaultInstance

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapFixed32Fixed32Entry = (plus as? TestAllTypesProto2.MapFixed32Fixed32Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapFixed32Fixed32Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapFixed64Fixed64Entry?.orDefault() = this ?: TestAllTypesProto2.MapFixed64Fixed64Entry.defaultInstance

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapFixed64Fixed64Entry = (plus as? TestAllTypesProto2.MapFixed64Fixed64Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapFixed64Fixed64Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapSfixed32Sfixed32Entry?.orDefault() = this ?: TestAllTypesProto2.MapSfixed32Sfixed32Entry.defaultInstance

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapSfixed32Sfixed32Entry = (plus as? TestAllTypesProto2.MapSfixed32Sfixed32Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapSfixed32Sfixed32Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapSfixed64Sfixed64Entry?.orDefault() = this ?: TestAllTypesProto2.MapSfixed64Sfixed64Entry.defaultInstance

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapSfixed64Sfixed64Entry = (plus as? TestAllTypesProto2.MapSfixed64Sfixed64Entry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapSfixed64Sfixed64Entry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapInt32FloatEntry?.orDefault() = this ?: TestAllTypesProto2.MapInt32FloatEntry.defaultInstance

private fun TestAllTypesProto2.MapInt32FloatEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapInt32FloatEntry = (plus as? TestAllTypesProto2.MapInt32FloatEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapInt32FloatEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapInt32DoubleEntry?.orDefault() = this ?: TestAllTypesProto2.MapInt32DoubleEntry.defaultInstance

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapInt32DoubleEntry = (plus as? TestAllTypesProto2.MapInt32DoubleEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapInt32DoubleEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapBoolBoolEntry?.orDefault() = this ?: TestAllTypesProto2.MapBoolBoolEntry.defaultInstance

private fun TestAllTypesProto2.MapBoolBoolEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapBoolBoolEntry = (plus as? TestAllTypesProto2.MapBoolBoolEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapBoolBoolEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapStringStringEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringStringEntry.defaultInstance

private fun TestAllTypesProto2.MapStringStringEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapStringStringEntry = (plus as? TestAllTypesProto2.MapStringStringEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapStringStringEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapStringBytesEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringBytesEntry.defaultInstance

private fun TestAllTypesProto2.MapStringBytesEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapStringBytesEntry = (plus as? TestAllTypesProto2.MapStringBytesEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapStringBytesEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapStringNestedMessageEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringNestedMessageEntry.defaultInstance

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapStringNestedMessageEntry = (plus as? TestAllTypesProto2.MapStringNestedMessageEntry)?.copy(
    key = plus.key ?: key,
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapStringNestedMessageEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapStringForeignMessageEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringForeignMessageEntry.defaultInstance

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapStringForeignMessageEntry = (plus as? TestAllTypesProto2.MapStringForeignMessageEntry)?.copy(
    key = plus.key ?: key,
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapStringForeignMessageEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapStringNestedEnumEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringNestedEnumEntry.defaultInstance

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapStringNestedEnumEntry = (plus as? TestAllTypesProto2.MapStringNestedEnumEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapStringNestedEnumEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.MapStringForeignEnumEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringForeignEnumEntry.defaultInstance

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MapStringForeignEnumEntry = (plus as? TestAllTypesProto2.MapStringForeignEnumEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.MapStringForeignEnumEntry(key, value, unknownFields)
}

fun TestAllTypesProto2.Data?.orDefault() = this ?: TestAllTypesProto2.Data.defaultInstance

private fun TestAllTypesProto2.Data.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.Data = (plus as? TestAllTypesProto2.Data)?.copy(
    groupInt32 = plus.groupInt32 ?: groupInt32,
    groupUint32 = plus.groupUint32 ?: groupUint32,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return TestAllTypesProto2.Data(groupInt32, groupUint32, unknownFields)
}

fun TestAllTypesProto2.MessageSetCorrect?.orDefault() = this ?: TestAllTypesProto2.MessageSetCorrect.defaultInstance

private fun TestAllTypesProto2.MessageSetCorrect.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MessageSetCorrect = (plus as? TestAllTypesProto2.MessageSetCorrect)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MessageSetCorrect.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MessageSetCorrect {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestAllTypesProto2.MessageSetCorrect(unknownFields)
}

fun TestAllTypesProto2.MessageSetCorrectExtension1?.orDefault() = this ?: TestAllTypesProto2.MessageSetCorrectExtension1.defaultInstance

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MessageSetCorrectExtension1 = (plus as? TestAllTypesProto2.MessageSetCorrectExtension1)?.copy(
    str = plus.str ?: str,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MessageSetCorrectExtension1.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MessageSetCorrectExtension1 {
    var str: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            25 -> str = _fieldValue as String
        }
    }
    return TestAllTypesProto2.MessageSetCorrectExtension1(str, unknownFields)
}

fun TestAllTypesProto2.MessageSetCorrectExtension2?.orDefault() = this ?: TestAllTypesProto2.MessageSetCorrectExtension2.defaultInstance

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto2.MessageSetCorrectExtension2 = (plus as? TestAllTypesProto2.MessageSetCorrectExtension2)?.copy(
    i = plus.i ?: i,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto2.MessageSetCorrectExtension2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto2.MessageSetCorrectExtension2 {
    var i: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            9 -> i = _fieldValue as Int
        }
    }
    return TestAllTypesProto2.MessageSetCorrectExtension2(i, unknownFields)
}

fun ForeignMessageProto2?.orDefault() = this ?: ForeignMessageProto2.defaultInstance

private fun ForeignMessageProto2.protoMergeImpl(plus: pbandk.Message?): ForeignMessageProto2 = (plus as? ForeignMessageProto2)?.copy(
    c = plus.c ?: c,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ForeignMessageProto2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForeignMessageProto2 {
    var c: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c = _fieldValue as Int
        }
    }
    return ForeignMessageProto2(c, unknownFields)
}

fun UnknownToTestAllTypes?.orDefault() = this ?: UnknownToTestAllTypes.defaultInstance

private fun UnknownToTestAllTypes.protoMergeImpl(plus: pbandk.Message?): UnknownToTestAllTypes = (plus as? UnknownToTestAllTypes)?.copy(
    optionalInt32 = plus.optionalInt32 ?: optionalInt32,
    optionalString = plus.optionalString ?: optionalString,
    nestedMessage = nestedMessage?.plus(plus.nestedMessage) ?: plus.nestedMessage,
    optionalBool = plus.optionalBool ?: optionalBool,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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
    return UnknownToTestAllTypes(optionalInt32, optionalString, nestedMessage, optionalBool,
        pbandk.ListWithSize.Builder.fixed(repeatedInt32), unknownFields)
}

fun UnknownToTestAllTypes.OptionalGroup?.orDefault() = this ?: UnknownToTestAllTypes.OptionalGroup.defaultInstance

private fun UnknownToTestAllTypes.OptionalGroup.protoMergeImpl(plus: pbandk.Message?): UnknownToTestAllTypes.OptionalGroup = (plus as? UnknownToTestAllTypes.OptionalGroup)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun UnknownToTestAllTypes.OptionalGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UnknownToTestAllTypes.OptionalGroup {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
        }
    }
    return UnknownToTestAllTypes.OptionalGroup(a, unknownFields)
}

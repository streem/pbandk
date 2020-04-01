@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.conformance.pb

import kotlinx.serialization.*
import kotlinx.serialization.json.*

sealed class ForeignEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is ForeignEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "ForeignEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object FOREIGN_FOO : ForeignEnum(0, "FOREIGN_FOO")
    object FOREIGN_BAR : ForeignEnum(1, "FOREIGN_BAR")
    object FOREIGN_BAZ : ForeignEnum(2, "FOREIGN_BAZ")
    class UNRECOGNIZED(value: Int) : ForeignEnum(value)

    companion object : pbandk.Message.Enum.Companion<ForeignEnum> {
        val values: List<ForeignEnum> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnum with name: $name")
    }
}

data class TestAllTypesProto3(
    val optionalInt32: Int = 0,
    val optionalInt64: Long = 0L,
    val optionalUint32: Int = 0,
    val optionalUint64: Long = 0L,
    val optionalSint32: Int = 0,
    val optionalSint64: Long = 0L,
    val optionalFixed32: Int = 0,
    val optionalFixed64: Long = 0L,
    val optionalSfixed32: Int = 0,
    val optionalSfixed64: Long = 0L,
    val optionalFloat: Float = 0.0F,
    val optionalDouble: Double = 0.0,
    val optionalBool: Boolean = false,
    val optionalString: String = "",
    val optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
    val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null,
    val optionalForeignMessage: pbandk.conformance.pb.ForeignMessage? = null,
    val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
    val optionalForeignEnum: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
    val optionalAliasedEnum: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum = pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromValue(0),
    val optionalStringPiece: String = "",
    val optionalCord: String = "",
    val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3? = null,
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
    val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage> = emptyList(),
    val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage> = emptyList(),
    val repeatedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
    val repeatedForeignEnum: List<pbandk.conformance.pb.ForeignEnum> = emptyList(),
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
    val packedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
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
    val unpackedNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyList(),
    val mapInt32Int32: Map<Int, Int> = emptyMap(),
    val mapInt64Int64: Map<Long, Long> = emptyMap(),
    val mapUint32Uint32: Map<Int, Int> = emptyMap(),
    val mapUint64Uint64: Map<Long, Long> = emptyMap(),
    val mapSint32Sint32: Map<Int, Int> = emptyMap(),
    val mapSint64Sint64: Map<Long, Long> = emptyMap(),
    val mapFixed32Fixed32: Map<Int, Int> = emptyMap(),
    val mapFixed64Fixed64: Map<Long, Long> = emptyMap(),
    val mapSfixed32Sfixed32: Map<Int, Int> = emptyMap(),
    val mapSfixed64Sfixed64: Map<Long, Long> = emptyMap(),
    val mapInt32Float: Map<Int, Float> = emptyMap(),
    val mapInt32Double: Map<Int, Double> = emptyMap(),
    val mapBoolBool: Map<Boolean, Boolean> = emptyMap(),
    val mapStringString: Map<String, String> = emptyMap(),
    val mapStringBytes: Map<String, pbandk.ByteArr> = emptyMap(),
    val mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?> = emptyMap(),
    val mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage?> = emptyMap(),
    val mapStringNestedEnum: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> = emptyMap(),
    val mapStringForeignEnum: Map<String, pbandk.conformance.pb.ForeignEnum> = emptyMap(),
    val optionalBoolWrapper: Boolean? = null,
    val optionalInt32Wrapper: Int? = null,
    val optionalInt64Wrapper: Long? = null,
    val optionalUint32Wrapper: Int? = null,
    val optionalUint64Wrapper: Long? = null,
    val optionalFloatWrapper: Float? = null,
    val optionalDoubleWrapper: Double? = null,
    val optionalStringWrapper: String? = null,
    val optionalBytesWrapper: pbandk.ByteArr? = null,
    val repeatedBoolWrapper: List<Boolean> = emptyList(),
    val repeatedInt32Wrapper: List<Int> = emptyList(),
    val repeatedInt64Wrapper: List<Long> = emptyList(),
    val repeatedUint32Wrapper: List<Int> = emptyList(),
    val repeatedUint64Wrapper: List<Long> = emptyList(),
    val repeatedFloatWrapper: List<Float> = emptyList(),
    val repeatedDoubleWrapper: List<Double> = emptyList(),
    val repeatedStringWrapper: List<String> = emptyList(),
    val repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
    val optionalDuration: pbandk.wkt.Duration? = null,
    val optionalTimestamp: pbandk.wkt.Timestamp? = null,
    val optionalFieldMask: pbandk.wkt.FieldMask? = null,
    val optionalStruct: pbandk.wkt.Struct? = null,
    val optionalAny: pbandk.wkt.Any? = null,
    val optionalValue: pbandk.wkt.Value? = null,
    val repeatedDuration: List<pbandk.wkt.Duration> = emptyList(),
    val repeatedTimestamp: List<pbandk.wkt.Timestamp> = emptyList(),
    val repeatedFieldmask: List<pbandk.wkt.FieldMask> = emptyList(),
    val repeatedStruct: List<pbandk.wkt.Struct> = emptyList(),
    val repeatedAny: List<pbandk.wkt.Any> = emptyList(),
    val repeatedValue: List<pbandk.wkt.Value> = emptyList(),
    val repeatedListValue: List<pbandk.wkt.ListValue> = emptyList(),
    val fieldname1: Int = 0,
    val fieldName2: Int = 0,
    val fieldName3: Int = 0,
    val field_name4: Int = 0,
    val field0name5: Int = 0,
    val field0Name6: Int = 0,
    val fieldName7: Int = 0,
    val fieldName8: Int = 0,
    val fieldName9: Int = 0,
    val fieldName10: Int = 0,
    val fIELDNAME11: Int = 0,
    val fIELDName12: Int = 0,
    val _fieldName13: Int = 0,
    val _FieldName14: Int = 0,
    val field_name15: Int = 0,
    val field_Name16: Int = 0,
    val fieldName17_: Int = 0,
    val fieldName18_: Int = 0,
    val oneofField: OneofField<*>? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<TestAllTypesProto3> {
    sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class OneofUint32(oneofUint32: Int = 0) : OneofField<Int>(oneofUint32)
        class OneofNestedMessage(oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage) : OneofField<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage>(oneofNestedMessage)
        class OneofString(oneofString: String = "") : OneofField<String>(oneofString)
        class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField<pbandk.ByteArr>(oneofBytes)
        class OneofBool(oneofBool: Boolean = false) : OneofField<Boolean>(oneofBool)
        class OneofUint64(oneofUint64: Long = 0L) : OneofField<Long>(oneofUint64)
        class OneofFloat(oneofFloat: Float = 0.0F) : OneofField<Float>(oneofFloat)
        class OneofDouble(oneofDouble: Double = 0.0) : OneofField<Double>(oneofDouble)
        class OneofEnum(oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)) : OneofField<pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>(oneofEnum)
    }

    val oneofUint32: Int?
        get() = (oneofField as? OneofField.OneofUint32)?.value
    val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?
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
    val oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum?
        get() = (oneofField as? OneofField.OneofEnum)?.value

    override operator fun plus(other: TestAllTypesProto3?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<TestAllTypesProto3> {
        val defaultInstance by lazy { TestAllTypesProto3() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = TestAllTypesProto3.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = TestAllTypesProto3.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("optional_int32")
        val optionalInt32: Int? = null,
        @SerialName("optional_int64")
        val optionalInt64: Long? = null,
        @SerialName("optional_uint32")
        val optionalUint32: Int? = null,
        @SerialName("optional_uint64")
        val optionalUint64: Long? = null,
        @SerialName("optional_sint32")
        val optionalSint32: Int? = null,
        @SerialName("optional_sint64")
        val optionalSint64: Long? = null,
        @SerialName("optional_fixed32")
        val optionalFixed32: Int? = null,
        @SerialName("optional_fixed64")
        val optionalFixed64: Long? = null,
        @SerialName("optional_sfixed32")
        val optionalSfixed32: Int? = null,
        @SerialName("optional_sfixed64")
        val optionalSfixed64: Long? = null,
        @SerialName("optional_float")
        val optionalFloat: Float? = null,
        @SerialName("optional_double")
        val optionalDouble: Double? = null,
        @SerialName("optional_bool")
        val optionalBool: Boolean? = null,
        @SerialName("optional_string")
        val optionalString: String? = null,
        @SerialName("optional_bytes")
        val optionalBytes: pbandk.ByteArr? = null,
        @SerialName("optional_nested_message")
        val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.JsonMapper? = null,
        @SerialName("optional_foreign_message")
        val optionalForeignMessage: pbandk.conformance.pb.ForeignMessage.JsonMapper? = null,
        @SerialName("optional_nested_enum")
        val optionalNestedEnum: String? = null,
        @SerialName("optional_foreign_enum")
        val optionalForeignEnum: String? = null,
        @SerialName("optional_aliased_enum")
        val optionalAliasedEnum: String? = null,
        @SerialName("optional_string_piece")
        val optionalStringPiece: String? = null,
        @SerialName("optional_cord")
        val optionalCord: String? = null,
        @SerialName("recursive_message")
        val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto3.JsonMapper? = null,
        @SerialName("repeated_int32")
        val repeatedInt32: List<Int> = emptyList(),
        @SerialName("repeated_int64")
        val repeatedInt64: List<Long> = emptyList(),
        @SerialName("repeated_uint32")
        val repeatedUint32: List<Int> = emptyList(),
        @SerialName("repeated_uint64")
        val repeatedUint64: List<Long> = emptyList(),
        @SerialName("repeated_sint32")
        val repeatedSint32: List<Int> = emptyList(),
        @SerialName("repeated_sint64")
        val repeatedSint64: List<Long> = emptyList(),
        @SerialName("repeated_fixed32")
        val repeatedFixed32: List<Int> = emptyList(),
        @SerialName("repeated_fixed64")
        val repeatedFixed64: List<Long> = emptyList(),
        @SerialName("repeated_sfixed32")
        val repeatedSfixed32: List<Int> = emptyList(),
        @SerialName("repeated_sfixed64")
        val repeatedSfixed64: List<Long> = emptyList(),
        @SerialName("repeated_float")
        val repeatedFloat: List<Float> = emptyList(),
        @SerialName("repeated_double")
        val repeatedDouble: List<Double> = emptyList(),
        @SerialName("repeated_bool")
        val repeatedBool: List<Boolean> = emptyList(),
        @SerialName("repeated_string")
        val repeatedString: List<String> = emptyList(),
        @SerialName("repeated_bytes")
        val repeatedBytes: List<pbandk.ByteArr> = emptyList(),
        @SerialName("repeated_nested_message")
        val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.JsonMapper> = emptyList(),
        @SerialName("repeated_foreign_message")
        val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessage.JsonMapper> = emptyList(),
        @SerialName("repeated_nested_enum")
        val repeatedNestedEnum: List<String> = emptyList(),
        @SerialName("repeated_foreign_enum")
        val repeatedForeignEnum: List<String> = emptyList(),
        @SerialName("repeated_string_piece")
        val repeatedStringPiece: List<String> = emptyList(),
        @SerialName("repeated_cord")
        val repeatedCord: List<String> = emptyList(),
        @SerialName("map_int32_int32")
        val mapInt32Int32: Map<Int, Int?> = emptyMap(),
        @SerialName("map_int64_int64")
        val mapInt64Int64: Map<Long, Long?> = emptyMap(),
        @SerialName("map_uint32_uint32")
        val mapUint32Uint32: Map<Int, Int?> = emptyMap(),
        @SerialName("map_uint64_uint64")
        val mapUint64Uint64: Map<Long, Long?> = emptyMap(),
        @SerialName("map_sint32_sint32")
        val mapSint32Sint32: Map<Int, Int?> = emptyMap(),
        @SerialName("map_sint64_sint64")
        val mapSint64Sint64: Map<Long, Long?> = emptyMap(),
        @SerialName("map_fixed32_fixed32")
        val mapFixed32Fixed32: Map<Int, Int?> = emptyMap(),
        @SerialName("map_fixed64_fixed64")
        val mapFixed64Fixed64: Map<Long, Long?> = emptyMap(),
        @SerialName("map_sfixed32_sfixed32")
        val mapSfixed32Sfixed32: Map<Int, Int?> = emptyMap(),
        @SerialName("map_sfixed64_sfixed64")
        val mapSfixed64Sfixed64: Map<Long, Long?> = emptyMap(),
        @SerialName("map_int32_float")
        val mapInt32Float: Map<Int, Float?> = emptyMap(),
        @SerialName("map_int32_double")
        val mapInt32Double: Map<Int, Double?> = emptyMap(),
        @SerialName("map_bool_bool")
        val mapBoolBool: Map<Boolean, Boolean?> = emptyMap(),
        @SerialName("map_string_string")
        val mapStringString: Map<String, String?> = emptyMap(),
        @SerialName("map_string_bytes")
        val mapStringBytes: Map<String, pbandk.ByteArr?> = emptyMap(),
        @SerialName("map_string_nested_message")
        val mapStringNestedMessage: Map<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.JsonMapper?> = emptyMap(),
        @SerialName("map_string_foreign_message")
        val mapStringForeignMessage: Map<String, pbandk.conformance.pb.ForeignMessage.JsonMapper?> = emptyMap(),
        @SerialName("map_string_nested_enum")
        val mapStringNestedEnum: Map<String, String?> = emptyMap(),
        @SerialName("map_string_foreign_enum")
        val mapStringForeignEnum: Map<String, String?> = emptyMap(),
        @SerialName("packed_int32")
        val packedInt32: List<Int> = emptyList(),
        @SerialName("packed_int64")
        val packedInt64: List<Long> = emptyList(),
        @SerialName("packed_uint32")
        val packedUint32: List<Int> = emptyList(),
        @SerialName("packed_uint64")
        val packedUint64: List<Long> = emptyList(),
        @SerialName("packed_sint32")
        val packedSint32: List<Int> = emptyList(),
        @SerialName("packed_sint64")
        val packedSint64: List<Long> = emptyList(),
        @SerialName("packed_fixed32")
        val packedFixed32: List<Int> = emptyList(),
        @SerialName("packed_fixed64")
        val packedFixed64: List<Long> = emptyList(),
        @SerialName("packed_sfixed32")
        val packedSfixed32: List<Int> = emptyList(),
        @SerialName("packed_sfixed64")
        val packedSfixed64: List<Long> = emptyList(),
        @SerialName("packed_float")
        val packedFloat: List<Float> = emptyList(),
        @SerialName("packed_double")
        val packedDouble: List<Double> = emptyList(),
        @SerialName("packed_bool")
        val packedBool: List<Boolean> = emptyList(),
        @SerialName("packed_nested_enum")
        val packedNestedEnum: List<String> = emptyList(),
        @SerialName("unpacked_int32")
        val unpackedInt32: List<Int> = emptyList(),
        @SerialName("unpacked_int64")
        val unpackedInt64: List<Long> = emptyList(),
        @SerialName("unpacked_uint32")
        val unpackedUint32: List<Int> = emptyList(),
        @SerialName("unpacked_uint64")
        val unpackedUint64: List<Long> = emptyList(),
        @SerialName("unpacked_sint32")
        val unpackedSint32: List<Int> = emptyList(),
        @SerialName("unpacked_sint64")
        val unpackedSint64: List<Long> = emptyList(),
        @SerialName("unpacked_fixed32")
        val unpackedFixed32: List<Int> = emptyList(),
        @SerialName("unpacked_fixed64")
        val unpackedFixed64: List<Long> = emptyList(),
        @SerialName("unpacked_sfixed32")
        val unpackedSfixed32: List<Int> = emptyList(),
        @SerialName("unpacked_sfixed64")
        val unpackedSfixed64: List<Long> = emptyList(),
        @SerialName("unpacked_float")
        val unpackedFloat: List<Float> = emptyList(),
        @SerialName("unpacked_double")
        val unpackedDouble: List<Double> = emptyList(),
        @SerialName("unpacked_bool")
        val unpackedBool: List<Boolean> = emptyList(),
        @SerialName("unpacked_nested_enum")
        val unpackedNestedEnum: List<String> = emptyList(),
        @SerialName("oneof_uint32")
        val oneofUint32: Int? = null,
        @SerialName("oneof_nested_message")
        val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.JsonMapper? = null,
        @SerialName("oneof_string")
        val oneofString: String? = null,
        @SerialName("oneof_bytes")
        val oneofBytes: pbandk.ByteArr? = null,
        @SerialName("oneof_bool")
        val oneofBool: Boolean? = null,
        @SerialName("oneof_uint64")
        val oneofUint64: Long? = null,
        @SerialName("oneof_float")
        val oneofFloat: Float? = null,
        @SerialName("oneof_double")
        val oneofDouble: Double? = null,
        @SerialName("oneof_enum")
        val oneofEnum: String? = null,
        @SerialName("optional_bool_wrapper")
        val optionalBoolWrapper: Boolean? = null,
        @SerialName("optional_int32_wrapper")
        val optionalInt32Wrapper: Int? = null,
        @SerialName("optional_int64_wrapper")
        val optionalInt64Wrapper: Long? = null,
        @SerialName("optional_uint32_wrapper")
        val optionalUint32Wrapper: Int? = null,
        @SerialName("optional_uint64_wrapper")
        val optionalUint64Wrapper: Long? = null,
        @SerialName("optional_float_wrapper")
        val optionalFloatWrapper: Float? = null,
        @SerialName("optional_double_wrapper")
        val optionalDoubleWrapper: Double? = null,
        @SerialName("optional_string_wrapper")
        val optionalStringWrapper: String? = null,
        @SerialName("optional_bytes_wrapper")
        val optionalBytesWrapper: pbandk.ByteArr? = null,
        @SerialName("repeated_bool_wrapper")
        val repeatedBoolWrapper: List<Boolean> = emptyList(),
        @SerialName("repeated_int32_wrapper")
        val repeatedInt32Wrapper: List<Int> = emptyList(),
        @SerialName("repeated_int64_wrapper")
        val repeatedInt64Wrapper: List<Long> = emptyList(),
        @SerialName("repeated_uint32_wrapper")
        val repeatedUint32Wrapper: List<Int> = emptyList(),
        @SerialName("repeated_uint64_wrapper")
        val repeatedUint64Wrapper: List<Long> = emptyList(),
        @SerialName("repeated_float_wrapper")
        val repeatedFloatWrapper: List<Float> = emptyList(),
        @SerialName("repeated_double_wrapper")
        val repeatedDoubleWrapper: List<Double> = emptyList(),
        @SerialName("repeated_string_wrapper")
        val repeatedStringWrapper: List<String> = emptyList(),
        @SerialName("repeated_bytes_wrapper")
        val repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
        @SerialName("optional_duration")
        val optionalDuration: pbandk.wkt.Duration.JsonMapper? = null,
        @SerialName("optional_timestamp")
        val optionalTimestamp: pbandk.wkt.Timestamp.JsonMapper? = null,
        @SerialName("optional_field_mask")
        val optionalFieldMask: pbandk.wkt.FieldMask.JsonMapper? = null,
        @SerialName("optional_struct")
        val optionalStruct: pbandk.wkt.Struct.JsonMapper? = null,
        @SerialName("optional_any")
        val optionalAny: pbandk.wkt.Any.JsonMapper? = null,
        @SerialName("optional_value")
        val optionalValue: pbandk.wkt.Value.JsonMapper? = null,
        @SerialName("repeated_duration")
        val repeatedDuration: List<pbandk.wkt.Duration.JsonMapper> = emptyList(),
        @SerialName("repeated_timestamp")
        val repeatedTimestamp: List<pbandk.wkt.Timestamp.JsonMapper> = emptyList(),
        @SerialName("repeated_fieldmask")
        val repeatedFieldmask: List<pbandk.wkt.FieldMask.JsonMapper> = emptyList(),
        @SerialName("repeated_any")
        val repeatedAny: List<pbandk.wkt.Any.JsonMapper> = emptyList(),
        @SerialName("repeated_value")
        val repeatedValue: List<pbandk.wkt.Value.JsonMapper> = emptyList(),
        @SerialName("repeated_list_value")
        val repeatedListValue: List<pbandk.wkt.ListValue.JsonMapper> = emptyList(),
        @SerialName("repeated_struct")
        val repeatedStruct: List<pbandk.wkt.Struct.JsonMapper> = emptyList(),
        @SerialName("fieldname1")
        val fieldname1: Int? = null,
        @SerialName("field_name2")
        val fieldName2: Int? = null,
        @SerialName("_field_name3")
        val fieldName3: Int? = null,
        @SerialName("field__name4_")
        val field_name4: Int? = null,
        @SerialName("field0name5")
        val field0name5: Int? = null,
        @SerialName("field_0_name6")
        val field0Name6: Int? = null,
        @SerialName("fieldName7")
        val fieldName7: Int? = null,
        @SerialName("FieldName8")
        val fieldName8: Int? = null,
        @SerialName("field_Name9")
        val fieldName9: Int? = null,
        @SerialName("Field_Name10")
        val fieldName10: Int? = null,
        @SerialName("FIELD_NAME11")
        val fIELDNAME11: Int? = null,
        @SerialName("FIELD_name12")
        val fIELDName12: Int? = null,
        @SerialName("__field_name13")
        val _fieldName13: Int? = null,
        @SerialName("__Field_name14")
        val _FieldName14: Int? = null,
        @SerialName("field__name15")
        val field_name15: Int? = null,
        @SerialName("field__Name16")
        val field_Name16: Int? = null,
        @SerialName("field_name17__")
        val fieldName17_: Int? = null,
        @SerialName("Field_name18__")
        val fieldName18_: Int? = null
    ) {
        fun toMessage() = toMessageImpl()
    }

    sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is NestedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object FOO : NestedEnum(0, "FOO")
        object BAR : NestedEnum(1, "BAR")
        object BAZ : NestedEnum(2, "BAZ")
        object NEG : NestedEnum(-1, "NEG")
        class UNRECOGNIZED(value: Int) : NestedEnum(value)

        companion object : pbandk.Message.Enum.Companion<NestedEnum> {
            val values: List<NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    sealed class AliasedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is AliasedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "AliasedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object ALIAS_FOO : AliasedEnum(0, "ALIAS_FOO")
        object ALIAS_BAR : AliasedEnum(1, "ALIAS_BAR")
        object ALIAS_BAZ : AliasedEnum(2, "ALIAS_BAZ")
        object QUX : AliasedEnum(2, "QUX")
        object QUX_ : AliasedEnum(2, "qux")
        object B_AZ : AliasedEnum(2, "bAz")
        class UNRECOGNIZED(value: Int) : AliasedEnum(value)

        companion object : pbandk.Message.Enum.Companion<AliasedEnum> {
            val values: List<AliasedEnum> by lazy { listOf(ALIAS_FOO, ALIAS_BAR, ALIAS_BAZ, QUX, QUX_, B_AZ) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No AliasedEnum with name: $name")
        }
    }

    data class NestedMessage(
        val a: Int = 0,
        val corecursive: pbandk.conformance.pb.TestAllTypesProto3? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<NestedMessage> {
        override operator fun plus(other: NestedMessage?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<NestedMessage> {
            val defaultInstance by lazy { NestedMessage() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = NestedMessage.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = NestedMessage.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("a")
            val a: Int? = null,
            @SerialName("corecursive")
            val corecursive: pbandk.conformance.pb.TestAllTypesProto3.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapInt32Int32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32Int32Entry>, Map.Entry<Int, Int> {
        override operator fun plus(other: MapInt32Int32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapInt32Int32Entry> {
            val defaultInstance by lazy { MapInt32Int32Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32Int32Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapInt32Int32Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapInt64Int64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt64Int64Entry>, Map.Entry<Long, Long> {
        override operator fun plus(other: MapInt64Int64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapInt64Int64Entry> {
            val defaultInstance by lazy { MapInt64Int64Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt64Int64Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapInt64Int64Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Long? = null,
            @SerialName("value")
            val value: Long? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapUint32Uint32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapUint32Uint32Entry>, Map.Entry<Int, Int> {
        override operator fun plus(other: MapUint32Uint32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapUint32Uint32Entry> {
            val defaultInstance by lazy { MapUint32Uint32Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapUint32Uint32Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapUint32Uint32Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapUint64Uint64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapUint64Uint64Entry>, Map.Entry<Long, Long> {
        override operator fun plus(other: MapUint64Uint64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapUint64Uint64Entry> {
            val defaultInstance by lazy { MapUint64Uint64Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapUint64Uint64Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapUint64Uint64Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Long? = null,
            @SerialName("value")
            val value: Long? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapSint32Sint32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSint32Sint32Entry>, Map.Entry<Int, Int> {
        override operator fun plus(other: MapSint32Sint32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapSint32Sint32Entry> {
            val defaultInstance by lazy { MapSint32Sint32Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSint32Sint32Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapSint32Sint32Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapSint64Sint64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSint64Sint64Entry>, Map.Entry<Long, Long> {
        override operator fun plus(other: MapSint64Sint64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapSint64Sint64Entry> {
            val defaultInstance by lazy { MapSint64Sint64Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSint64Sint64Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapSint64Sint64Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Long? = null,
            @SerialName("value")
            val value: Long? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapFixed32Fixed32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapFixed32Fixed32Entry>, Map.Entry<Int, Int> {
        override operator fun plus(other: MapFixed32Fixed32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapFixed32Fixed32Entry> {
            val defaultInstance by lazy { MapFixed32Fixed32Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapFixed32Fixed32Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapFixed32Fixed32Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapFixed64Fixed64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapFixed64Fixed64Entry>, Map.Entry<Long, Long> {
        override operator fun plus(other: MapFixed64Fixed64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapFixed64Fixed64Entry> {
            val defaultInstance by lazy { MapFixed64Fixed64Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapFixed64Fixed64Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapFixed64Fixed64Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Long? = null,
            @SerialName("value")
            val value: Long? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapSfixed32Sfixed32Entry(
        override val key: Int = 0,
        override val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSfixed32Sfixed32Entry>, Map.Entry<Int, Int> {
        override operator fun plus(other: MapSfixed32Sfixed32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapSfixed32Sfixed32Entry> {
            val defaultInstance by lazy { MapSfixed32Sfixed32Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSfixed32Sfixed32Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapSfixed32Sfixed32Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapSfixed64Sfixed64Entry(
        override val key: Long = 0L,
        override val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSfixed64Sfixed64Entry>, Map.Entry<Long, Long> {
        override operator fun plus(other: MapSfixed64Sfixed64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapSfixed64Sfixed64Entry> {
            val defaultInstance by lazy { MapSfixed64Sfixed64Entry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSfixed64Sfixed64Entry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapSfixed64Sfixed64Entry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Long? = null,
            @SerialName("value")
            val value: Long? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapInt32FloatEntry(
        override val key: Int = 0,
        override val value: Float = 0.0F,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32FloatEntry>, Map.Entry<Int, Float> {
        override operator fun plus(other: MapInt32FloatEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapInt32FloatEntry> {
            val defaultInstance by lazy { MapInt32FloatEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32FloatEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapInt32FloatEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Float? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapInt32DoubleEntry(
        override val key: Int = 0,
        override val value: Double = 0.0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32DoubleEntry>, Map.Entry<Int, Double> {
        override operator fun plus(other: MapInt32DoubleEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapInt32DoubleEntry> {
            val defaultInstance by lazy { MapInt32DoubleEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32DoubleEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapInt32DoubleEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Int? = null,
            @SerialName("value")
            val value: Double? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapBoolBoolEntry(
        override val key: Boolean = false,
        override val value: Boolean = false,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapBoolBoolEntry>, Map.Entry<Boolean, Boolean> {
        override operator fun plus(other: MapBoolBoolEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapBoolBoolEntry> {
            val defaultInstance by lazy { MapBoolBoolEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapBoolBoolEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapBoolBoolEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: Boolean? = null,
            @SerialName("value")
            val value: Boolean? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringStringEntry(
        override val key: String = "",
        override val value: String = "",
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringStringEntry>, Map.Entry<String, String> {
        override operator fun plus(other: MapStringStringEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapStringStringEntry> {
            val defaultInstance by lazy { MapStringStringEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringStringEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapStringStringEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: String? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringBytesEntry(
        override val key: String = "",
        override val value: pbandk.ByteArr = pbandk.ByteArr.empty,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringBytesEntry>, Map.Entry<String, pbandk.ByteArr> {
        override operator fun plus(other: MapStringBytesEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapStringBytesEntry> {
            val defaultInstance by lazy { MapStringBytesEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringBytesEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapStringBytesEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: pbandk.ByteArr? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringNestedMessageEntry(
        override val key: String = "",
        override val value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringNestedMessageEntry>, Map.Entry<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?> {
        override operator fun plus(other: MapStringNestedMessageEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapStringNestedMessageEntry> {
            val defaultInstance by lazy { MapStringNestedMessageEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringNestedMessageEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapStringNestedMessageEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringForeignMessageEntry(
        override val key: String = "",
        override val value: pbandk.conformance.pb.ForeignMessage? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringForeignMessageEntry>, Map.Entry<String, pbandk.conformance.pb.ForeignMessage?> {
        override operator fun plus(other: MapStringForeignMessageEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapStringForeignMessageEntry> {
            val defaultInstance by lazy { MapStringForeignMessageEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringForeignMessageEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapStringForeignMessageEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: pbandk.conformance.pb.ForeignMessage.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringNestedEnumEntry(
        override val key: String = "",
        override val value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringNestedEnumEntry>, Map.Entry<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum> {
        override operator fun plus(other: MapStringNestedEnumEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapStringNestedEnumEntry> {
            val defaultInstance by lazy { MapStringNestedEnumEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringNestedEnumEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapStringNestedEnumEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: String? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringForeignEnumEntry(
        override val key: String = "",
        override val value: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0),
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringForeignEnumEntry>, Map.Entry<String, pbandk.conformance.pb.ForeignEnum> {
        override operator fun plus(other: MapStringForeignEnumEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MapStringForeignEnumEntry> {
            val defaultInstance by lazy { MapStringForeignEnumEntry() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringForeignEnumEntry.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MapStringForeignEnumEntry.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("key")
            val key: String? = null,
            @SerialName("value")
            val value: String? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class ForeignMessage(
    val c: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ForeignMessage> {
    override operator fun plus(other: ForeignMessage?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ForeignMessage> {
        val defaultInstance by lazy { ForeignMessage() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ForeignMessage.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ForeignMessage.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("c")
        val c: Int? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

fun TestAllTypesProto3?.orDefault() = this ?: TestAllTypesProto3.defaultInstance

private fun TestAllTypesProto3.protoMergeImpl(plus: TestAllTypesProto3?): TestAllTypesProto3 = plus?.copy(
    optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
    optionalForeignMessage = optionalForeignMessage?.plus(plus.optionalForeignMessage) ?: plus.optionalForeignMessage,
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
    optionalBoolWrapper = plus.optionalBoolWrapper ?: optionalBoolWrapper,
    optionalInt32Wrapper = plus.optionalInt32Wrapper ?: optionalInt32Wrapper,
    optionalInt64Wrapper = plus.optionalInt64Wrapper ?: optionalInt64Wrapper,
    optionalUint32Wrapper = plus.optionalUint32Wrapper ?: optionalUint32Wrapper,
    optionalUint64Wrapper = plus.optionalUint64Wrapper ?: optionalUint64Wrapper,
    optionalFloatWrapper = plus.optionalFloatWrapper ?: optionalFloatWrapper,
    optionalDoubleWrapper = plus.optionalDoubleWrapper ?: optionalDoubleWrapper,
    optionalStringWrapper = plus.optionalStringWrapper ?: optionalStringWrapper,
    optionalBytesWrapper = plus.optionalBytesWrapper ?: optionalBytesWrapper,
    repeatedBoolWrapper = repeatedBoolWrapper + plus.repeatedBoolWrapper,
    repeatedInt32Wrapper = repeatedInt32Wrapper + plus.repeatedInt32Wrapper,
    repeatedInt64Wrapper = repeatedInt64Wrapper + plus.repeatedInt64Wrapper,
    repeatedUint32Wrapper = repeatedUint32Wrapper + plus.repeatedUint32Wrapper,
    repeatedUint64Wrapper = repeatedUint64Wrapper + plus.repeatedUint64Wrapper,
    repeatedFloatWrapper = repeatedFloatWrapper + plus.repeatedFloatWrapper,
    repeatedDoubleWrapper = repeatedDoubleWrapper + plus.repeatedDoubleWrapper,
    repeatedStringWrapper = repeatedStringWrapper + plus.repeatedStringWrapper,
    repeatedBytesWrapper = repeatedBytesWrapper + plus.repeatedBytesWrapper,
    optionalDuration = optionalDuration?.plus(plus.optionalDuration) ?: plus.optionalDuration,
    optionalTimestamp = optionalTimestamp?.plus(plus.optionalTimestamp) ?: plus.optionalTimestamp,
    optionalFieldMask = optionalFieldMask?.plus(plus.optionalFieldMask) ?: plus.optionalFieldMask,
    optionalStruct = optionalStruct?.plus(plus.optionalStruct) ?: plus.optionalStruct,
    optionalAny = optionalAny?.plus(plus.optionalAny) ?: plus.optionalAny,
    optionalValue = optionalValue?.plus(plus.optionalValue) ?: plus.optionalValue,
    repeatedDuration = repeatedDuration + plus.repeatedDuration,
    repeatedTimestamp = repeatedTimestamp + plus.repeatedTimestamp,
    repeatedFieldmask = repeatedFieldmask + plus.repeatedFieldmask,
    repeatedStruct = repeatedStruct + plus.repeatedStruct,
    repeatedAny = repeatedAny + plus.repeatedAny,
    repeatedValue = repeatedValue + plus.repeatedValue,
    repeatedListValue = repeatedListValue + plus.repeatedListValue,
    oneofField = when {
        oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage ->
            TestAllTypesProto3.OneofField.OneofNestedMessage(oneofField.value + plus.oneofField.value)
        else ->
            plus.oneofField ?: oneofField
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.protoSizeImpl(): Int {
    var protoSize = 0
    if (optionalInt32 != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(optionalInt32)
    if (optionalInt64 != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int64Size(optionalInt64)
    if (optionalUint32 != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.uInt32Size(optionalUint32)
    if (optionalUint64 != 0L) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.uInt64Size(optionalUint64)
    if (optionalSint32 != 0) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.sInt32Size(optionalSint32)
    if (optionalSint64 != 0L) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.sInt64Size(optionalSint64)
    if (optionalFixed32 != 0) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.fixed32Size(optionalFixed32)
    if (optionalFixed64 != 0L) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.fixed64Size(optionalFixed64)
    if (optionalSfixed32 != 0) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.sFixed32Size(optionalSfixed32)
    if (optionalSfixed64 != 0L) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.sFixed64Size(optionalSfixed64)
    if (optionalFloat != 0.0F) protoSize += pbandk.Sizer.tagSize(11) + pbandk.Sizer.floatSize(optionalFloat)
    if (optionalDouble != 0.0) protoSize += pbandk.Sizer.tagSize(12) + pbandk.Sizer.doubleSize(optionalDouble)
    if (optionalBool) protoSize += pbandk.Sizer.tagSize(13) + pbandk.Sizer.boolSize(optionalBool)
    if (optionalString.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(14) + pbandk.Sizer.stringSize(optionalString)
    if (optionalBytes.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(15) + pbandk.Sizer.bytesSize(optionalBytes)
    if (optionalNestedMessage != null) protoSize += pbandk.Sizer.tagSize(18) + pbandk.Sizer.messageSize(optionalNestedMessage)
    if (optionalForeignMessage != null) protoSize += pbandk.Sizer.tagSize(19) + pbandk.Sizer.messageSize(optionalForeignMessage)
    if (optionalNestedEnum.value != 0) protoSize += pbandk.Sizer.tagSize(21) + pbandk.Sizer.enumSize(optionalNestedEnum)
    if (optionalForeignEnum.value != 0) protoSize += pbandk.Sizer.tagSize(22) + pbandk.Sizer.enumSize(optionalForeignEnum)
    if (optionalAliasedEnum.value != 0) protoSize += pbandk.Sizer.tagSize(23) + pbandk.Sizer.enumSize(optionalAliasedEnum)
    if (optionalStringPiece.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(24) + pbandk.Sizer.stringSize(optionalStringPiece)
    if (optionalCord.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(25) + pbandk.Sizer.stringSize(optionalCord)
    if (recursiveMessage != null) protoSize += pbandk.Sizer.tagSize(27) + pbandk.Sizer.messageSize(recursiveMessage)
    if (repeatedInt32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(31) + pbandk.Sizer.packedRepeatedSize(repeatedInt32, pbandk.Sizer::int32Size)
    if (repeatedInt64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(32) + pbandk.Sizer.packedRepeatedSize(repeatedInt64, pbandk.Sizer::int64Size)
    if (repeatedUint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(33) + pbandk.Sizer.packedRepeatedSize(repeatedUint32, pbandk.Sizer::uInt32Size)
    if (repeatedUint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(34) + pbandk.Sizer.packedRepeatedSize(repeatedUint64, pbandk.Sizer::uInt64Size)
    if (repeatedSint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(35) + pbandk.Sizer.packedRepeatedSize(repeatedSint32, pbandk.Sizer::sInt32Size)
    if (repeatedSint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(36) + pbandk.Sizer.packedRepeatedSize(repeatedSint64, pbandk.Sizer::sInt64Size)
    if (repeatedFixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(37) + pbandk.Sizer.packedRepeatedSize(repeatedFixed32, pbandk.Sizer::fixed32Size)
    if (repeatedFixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(38) + pbandk.Sizer.packedRepeatedSize(repeatedFixed64, pbandk.Sizer::fixed64Size)
    if (repeatedSfixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(39) + pbandk.Sizer.packedRepeatedSize(repeatedSfixed32, pbandk.Sizer::sFixed32Size)
    if (repeatedSfixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(40) + pbandk.Sizer.packedRepeatedSize(repeatedSfixed64, pbandk.Sizer::sFixed64Size)
    if (repeatedFloat.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(41) + pbandk.Sizer.packedRepeatedSize(repeatedFloat, pbandk.Sizer::floatSize)
    if (repeatedDouble.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(42) + pbandk.Sizer.packedRepeatedSize(repeatedDouble, pbandk.Sizer::doubleSize)
    if (repeatedBool.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(43) + pbandk.Sizer.packedRepeatedSize(repeatedBool, pbandk.Sizer::boolSize)
    if (repeatedString.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(44) * repeatedString.size) + repeatedString.sumBy(pbandk.Sizer::stringSize)
    if (repeatedBytes.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(45) * repeatedBytes.size) + repeatedBytes.sumBy(pbandk.Sizer::bytesSize)
    if (repeatedNestedMessage.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(48) * repeatedNestedMessage.size) + repeatedNestedMessage.sumBy(pbandk.Sizer::messageSize)
    if (repeatedForeignMessage.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(49) * repeatedForeignMessage.size) + repeatedForeignMessage.sumBy(pbandk.Sizer::messageSize)
    if (repeatedNestedEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(51) * repeatedNestedEnum.size) + repeatedNestedEnum.sumBy(pbandk.Sizer::enumSize)
    if (repeatedForeignEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(52) * repeatedForeignEnum.size) + repeatedForeignEnum.sumBy(pbandk.Sizer::enumSize)
    if (repeatedStringPiece.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(54) * repeatedStringPiece.size) + repeatedStringPiece.sumBy(pbandk.Sizer::stringSize)
    if (repeatedCord.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(55) * repeatedCord.size) + repeatedCord.sumBy(pbandk.Sizer::stringSize)
    if (packedInt32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(75) + pbandk.Sizer.packedRepeatedSize(packedInt32, pbandk.Sizer::int32Size)
    if (packedInt64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(76) + pbandk.Sizer.packedRepeatedSize(packedInt64, pbandk.Sizer::int64Size)
    if (packedUint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(77) + pbandk.Sizer.packedRepeatedSize(packedUint32, pbandk.Sizer::uInt32Size)
    if (packedUint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(78) + pbandk.Sizer.packedRepeatedSize(packedUint64, pbandk.Sizer::uInt64Size)
    if (packedSint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(79) + pbandk.Sizer.packedRepeatedSize(packedSint32, pbandk.Sizer::sInt32Size)
    if (packedSint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(80) + pbandk.Sizer.packedRepeatedSize(packedSint64, pbandk.Sizer::sInt64Size)
    if (packedFixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(81) + pbandk.Sizer.packedRepeatedSize(packedFixed32, pbandk.Sizer::fixed32Size)
    if (packedFixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(82) + pbandk.Sizer.packedRepeatedSize(packedFixed64, pbandk.Sizer::fixed64Size)
    if (packedSfixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(83) + pbandk.Sizer.packedRepeatedSize(packedSfixed32, pbandk.Sizer::sFixed32Size)
    if (packedSfixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(84) + pbandk.Sizer.packedRepeatedSize(packedSfixed64, pbandk.Sizer::sFixed64Size)
    if (packedFloat.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(85) + pbandk.Sizer.packedRepeatedSize(packedFloat, pbandk.Sizer::floatSize)
    if (packedDouble.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(86) + pbandk.Sizer.packedRepeatedSize(packedDouble, pbandk.Sizer::doubleSize)
    if (packedBool.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(87) + pbandk.Sizer.packedRepeatedSize(packedBool, pbandk.Sizer::boolSize)
    if (packedNestedEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(88) * packedNestedEnum.size) + packedNestedEnum.sumBy(pbandk.Sizer::enumSize)
    if (unpackedInt32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(89) + pbandk.Sizer.packedRepeatedSize(unpackedInt32, pbandk.Sizer::int32Size)
    if (unpackedInt64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(90) + pbandk.Sizer.packedRepeatedSize(unpackedInt64, pbandk.Sizer::int64Size)
    if (unpackedUint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(91) + pbandk.Sizer.packedRepeatedSize(unpackedUint32, pbandk.Sizer::uInt32Size)
    if (unpackedUint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(92) + pbandk.Sizer.packedRepeatedSize(unpackedUint64, pbandk.Sizer::uInt64Size)
    if (unpackedSint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(93) + pbandk.Sizer.packedRepeatedSize(unpackedSint32, pbandk.Sizer::sInt32Size)
    if (unpackedSint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(94) + pbandk.Sizer.packedRepeatedSize(unpackedSint64, pbandk.Sizer::sInt64Size)
    if (unpackedFixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(95) + pbandk.Sizer.packedRepeatedSize(unpackedFixed32, pbandk.Sizer::fixed32Size)
    if (unpackedFixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(96) + pbandk.Sizer.packedRepeatedSize(unpackedFixed64, pbandk.Sizer::fixed64Size)
    if (unpackedSfixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(97) + pbandk.Sizer.packedRepeatedSize(unpackedSfixed32, pbandk.Sizer::sFixed32Size)
    if (unpackedSfixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(98) + pbandk.Sizer.packedRepeatedSize(unpackedSfixed64, pbandk.Sizer::sFixed64Size)
    if (unpackedFloat.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(99) + pbandk.Sizer.packedRepeatedSize(unpackedFloat, pbandk.Sizer::floatSize)
    if (unpackedDouble.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(100) + pbandk.Sizer.packedRepeatedSize(unpackedDouble, pbandk.Sizer::doubleSize)
    if (unpackedBool.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(101) + pbandk.Sizer.packedRepeatedSize(unpackedBool, pbandk.Sizer::boolSize)
    if (unpackedNestedEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(102) * unpackedNestedEnum.size) + unpackedNestedEnum.sumBy(pbandk.Sizer::enumSize)
    if (mapInt32Int32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(56, mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto3::MapInt32Int32Entry)
    if (mapInt64Int64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(57, mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto3::MapInt64Int64Entry)
    if (mapUint32Uint32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(58, mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto3::MapUint32Uint32Entry)
    if (mapUint64Uint64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(59, mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto3::MapUint64Uint64Entry)
    if (mapSint32Sint32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(60, mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto3::MapSint32Sint32Entry)
    if (mapSint64Sint64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(61, mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto3::MapSint64Sint64Entry)
    if (mapFixed32Fixed32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(62, mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto3::MapFixed32Fixed32Entry)
    if (mapFixed64Fixed64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(63, mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto3::MapFixed64Fixed64Entry)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(64, mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed32Sfixed32Entry)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(65, mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed64Sfixed64Entry)
    if (mapInt32Float.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(66, mapInt32Float, pbandk.conformance.pb.TestAllTypesProto3::MapInt32FloatEntry)
    if (mapInt32Double.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(67, mapInt32Double, pbandk.conformance.pb.TestAllTypesProto3::MapInt32DoubleEntry)
    if (mapBoolBool.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(68, mapBoolBool, pbandk.conformance.pb.TestAllTypesProto3::MapBoolBoolEntry)
    if (mapStringString.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(69, mapStringString, pbandk.conformance.pb.TestAllTypesProto3::MapStringStringEntry)
    if (mapStringBytes.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(70, mapStringBytes, pbandk.conformance.pb.TestAllTypesProto3::MapStringBytesEntry)
    if (mapStringNestedMessage.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(71, mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedMessageEntry)
    if (mapStringForeignMessage.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(72, mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignMessageEntry)
    if (mapStringNestedEnum.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(73, mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedEnumEntry)
    if (mapStringForeignEnum.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(74, mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignEnumEntry)
    if (optionalBoolWrapper != null) protoSize += pbandk.Sizer.tagSize(201) + pbandk.Sizer.messageSize(pbandk.wkt.BoolValue(optionalBoolWrapper))
    if (optionalInt32Wrapper != null) protoSize += pbandk.Sizer.tagSize(202) + pbandk.Sizer.messageSize(pbandk.wkt.Int32Value(optionalInt32Wrapper))
    if (optionalInt64Wrapper != null) protoSize += pbandk.Sizer.tagSize(203) + pbandk.Sizer.messageSize(pbandk.wkt.Int64Value(optionalInt64Wrapper))
    if (optionalUint32Wrapper != null) protoSize += pbandk.Sizer.tagSize(204) + pbandk.Sizer.messageSize(pbandk.wkt.UInt32Value(optionalUint32Wrapper))
    if (optionalUint64Wrapper != null) protoSize += pbandk.Sizer.tagSize(205) + pbandk.Sizer.messageSize(pbandk.wkt.UInt64Value(optionalUint64Wrapper))
    if (optionalFloatWrapper != null) protoSize += pbandk.Sizer.tagSize(206) + pbandk.Sizer.messageSize(pbandk.wkt.FloatValue(optionalFloatWrapper))
    if (optionalDoubleWrapper != null) protoSize += pbandk.Sizer.tagSize(207) + pbandk.Sizer.messageSize(pbandk.wkt.DoubleValue(optionalDoubleWrapper))
    if (optionalStringWrapper != null) protoSize += pbandk.Sizer.tagSize(208) + pbandk.Sizer.messageSize(pbandk.wkt.StringValue(optionalStringWrapper))
    if (optionalBytesWrapper != null) protoSize += pbandk.Sizer.tagSize(209) + pbandk.Sizer.messageSize(pbandk.wkt.BytesValue(optionalBytesWrapper))
    if (repeatedBoolWrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(211) * repeatedBoolWrapper.size) + repeatedBoolWrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.BoolValue(it)) }
    if (repeatedInt32Wrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(212) * repeatedInt32Wrapper.size) + repeatedInt32Wrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.Int32Value(it)) }
    if (repeatedInt64Wrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(213) * repeatedInt64Wrapper.size) + repeatedInt64Wrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.Int64Value(it)) }
    if (repeatedUint32Wrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(214) * repeatedUint32Wrapper.size) + repeatedUint32Wrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.UInt32Value(it)) }
    if (repeatedUint64Wrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(215) * repeatedUint64Wrapper.size) + repeatedUint64Wrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.UInt64Value(it)) }
    if (repeatedFloatWrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(216) * repeatedFloatWrapper.size) + repeatedFloatWrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.FloatValue(it)) }
    if (repeatedDoubleWrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(217) * repeatedDoubleWrapper.size) + repeatedDoubleWrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.DoubleValue(it)) }
    if (repeatedStringWrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(218) * repeatedStringWrapper.size) + repeatedStringWrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.StringValue(it)) }
    if (repeatedBytesWrapper.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(219) * repeatedBytesWrapper.size) + repeatedBytesWrapper.sumBy { pbandk.Sizer.messageSize(pbandk.wkt.BytesValue(it)) }
    if (optionalDuration != null) protoSize += pbandk.Sizer.tagSize(301) + pbandk.Sizer.messageSize(optionalDuration)
    if (optionalTimestamp != null) protoSize += pbandk.Sizer.tagSize(302) + pbandk.Sizer.messageSize(optionalTimestamp)
    if (optionalFieldMask != null) protoSize += pbandk.Sizer.tagSize(303) + pbandk.Sizer.messageSize(optionalFieldMask)
    if (optionalStruct != null) protoSize += pbandk.Sizer.tagSize(304) + pbandk.Sizer.messageSize(optionalStruct)
    if (optionalAny != null) protoSize += pbandk.Sizer.tagSize(305) + pbandk.Sizer.messageSize(optionalAny)
    if (optionalValue != null) protoSize += pbandk.Sizer.tagSize(306) + pbandk.Sizer.messageSize(optionalValue)
    if (repeatedDuration.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(311) * repeatedDuration.size) + repeatedDuration.sumBy(pbandk.Sizer::messageSize)
    if (repeatedTimestamp.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(312) * repeatedTimestamp.size) + repeatedTimestamp.sumBy(pbandk.Sizer::messageSize)
    if (repeatedFieldmask.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(313) * repeatedFieldmask.size) + repeatedFieldmask.sumBy(pbandk.Sizer::messageSize)
    if (repeatedStruct.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(324) * repeatedStruct.size) + repeatedStruct.sumBy(pbandk.Sizer::messageSize)
    if (repeatedAny.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(315) * repeatedAny.size) + repeatedAny.sumBy(pbandk.Sizer::messageSize)
    if (repeatedValue.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(316) * repeatedValue.size) + repeatedValue.sumBy(pbandk.Sizer::messageSize)
    if (repeatedListValue.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(317) * repeatedListValue.size) + repeatedListValue.sumBy(pbandk.Sizer::messageSize)
    if (fieldname1 != 0) protoSize += pbandk.Sizer.tagSize(401) + pbandk.Sizer.int32Size(fieldname1)
    if (fieldName2 != 0) protoSize += pbandk.Sizer.tagSize(402) + pbandk.Sizer.int32Size(fieldName2)
    if (fieldName3 != 0) protoSize += pbandk.Sizer.tagSize(403) + pbandk.Sizer.int32Size(fieldName3)
    if (field_name4 != 0) protoSize += pbandk.Sizer.tagSize(404) + pbandk.Sizer.int32Size(field_name4)
    if (field0name5 != 0) protoSize += pbandk.Sizer.tagSize(405) + pbandk.Sizer.int32Size(field0name5)
    if (field0Name6 != 0) protoSize += pbandk.Sizer.tagSize(406) + pbandk.Sizer.int32Size(field0Name6)
    if (fieldName7 != 0) protoSize += pbandk.Sizer.tagSize(407) + pbandk.Sizer.int32Size(fieldName7)
    if (fieldName8 != 0) protoSize += pbandk.Sizer.tagSize(408) + pbandk.Sizer.int32Size(fieldName8)
    if (fieldName9 != 0) protoSize += pbandk.Sizer.tagSize(409) + pbandk.Sizer.int32Size(fieldName9)
    if (fieldName10 != 0) protoSize += pbandk.Sizer.tagSize(410) + pbandk.Sizer.int32Size(fieldName10)
    if (fIELDNAME11 != 0) protoSize += pbandk.Sizer.tagSize(411) + pbandk.Sizer.int32Size(fIELDNAME11)
    if (fIELDName12 != 0) protoSize += pbandk.Sizer.tagSize(412) + pbandk.Sizer.int32Size(fIELDName12)
    if (_fieldName13 != 0) protoSize += pbandk.Sizer.tagSize(413) + pbandk.Sizer.int32Size(_fieldName13)
    if (_FieldName14 != 0) protoSize += pbandk.Sizer.tagSize(414) + pbandk.Sizer.int32Size(_FieldName14)
    if (field_name15 != 0) protoSize += pbandk.Sizer.tagSize(415) + pbandk.Sizer.int32Size(field_name15)
    if (field_Name16 != 0) protoSize += pbandk.Sizer.tagSize(416) + pbandk.Sizer.int32Size(field_Name16)
    if (fieldName17_ != 0) protoSize += pbandk.Sizer.tagSize(417) + pbandk.Sizer.int32Size(fieldName17_)
    if (fieldName18_ != 0) protoSize += pbandk.Sizer.tagSize(418) + pbandk.Sizer.int32Size(fieldName18_)
    when (oneofField) {
        is TestAllTypesProto3.OneofField.OneofUint32 -> protoSize += pbandk.Sizer.tagSize(111) + pbandk.Sizer.uInt32Size(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofNestedMessage -> protoSize += pbandk.Sizer.tagSize(112) + pbandk.Sizer.messageSize(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofString -> protoSize += pbandk.Sizer.tagSize(113) + pbandk.Sizer.stringSize(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofBytes -> protoSize += pbandk.Sizer.tagSize(114) + pbandk.Sizer.bytesSize(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofBool -> protoSize += pbandk.Sizer.tagSize(115) + pbandk.Sizer.boolSize(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofUint64 -> protoSize += pbandk.Sizer.tagSize(116) + pbandk.Sizer.uInt64Size(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofFloat -> protoSize += pbandk.Sizer.tagSize(117) + pbandk.Sizer.floatSize(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofDouble -> protoSize += pbandk.Sizer.tagSize(118) + pbandk.Sizer.doubleSize(oneofField.value)
        is TestAllTypesProto3.OneofField.OneofEnum -> protoSize += pbandk.Sizer.tagSize(119) + pbandk.Sizer.enumSize(oneofField.value)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (optionalInt32 != 0) protoMarshal.writeTag(8).writeInt32(optionalInt32)
    if (optionalInt64 != 0L) protoMarshal.writeTag(16).writeInt64(optionalInt64)
    if (optionalUint32 != 0) protoMarshal.writeTag(24).writeUInt32(optionalUint32)
    if (optionalUint64 != 0L) protoMarshal.writeTag(32).writeUInt64(optionalUint64)
    if (optionalSint32 != 0) protoMarshal.writeTag(40).writeSInt32(optionalSint32)
    if (optionalSint64 != 0L) protoMarshal.writeTag(48).writeSInt64(optionalSint64)
    if (optionalFixed32 != 0) protoMarshal.writeTag(61).writeFixed32(optionalFixed32)
    if (optionalFixed64 != 0L) protoMarshal.writeTag(65).writeFixed64(optionalFixed64)
    if (optionalSfixed32 != 0) protoMarshal.writeTag(77).writeSFixed32(optionalSfixed32)
    if (optionalSfixed64 != 0L) protoMarshal.writeTag(81).writeSFixed64(optionalSfixed64)
    if (optionalFloat != 0.0F) protoMarshal.writeTag(93).writeFloat(optionalFloat)
    if (optionalDouble != 0.0) protoMarshal.writeTag(97).writeDouble(optionalDouble)
    if (optionalBool) protoMarshal.writeTag(104).writeBool(optionalBool)
    if (optionalString.isNotEmpty()) protoMarshal.writeTag(114).writeString(optionalString)
    if (optionalBytes.array.isNotEmpty()) protoMarshal.writeTag(122).writeBytes(optionalBytes)
    if (optionalNestedMessage != null) protoMarshal.writeTag(146).writeMessage(optionalNestedMessage)
    if (optionalForeignMessage != null) protoMarshal.writeTag(154).writeMessage(optionalForeignMessage)
    if (optionalNestedEnum.value != 0) protoMarshal.writeTag(168).writeEnum(optionalNestedEnum)
    if (optionalForeignEnum.value != 0) protoMarshal.writeTag(176).writeEnum(optionalForeignEnum)
    if (optionalAliasedEnum.value != 0) protoMarshal.writeTag(184).writeEnum(optionalAliasedEnum)
    if (optionalStringPiece.isNotEmpty()) protoMarshal.writeTag(194).writeString(optionalStringPiece)
    if (optionalCord.isNotEmpty()) protoMarshal.writeTag(202).writeString(optionalCord)
    if (recursiveMessage != null) protoMarshal.writeTag(218).writeMessage(recursiveMessage)
    if (repeatedInt32.isNotEmpty()) protoMarshal.writeTag(250).writePackedRepeated(repeatedInt32, pbandk.Sizer::int32Size, protoMarshal::writeInt32)
    if (repeatedInt64.isNotEmpty()) protoMarshal.writeTag(258).writePackedRepeated(repeatedInt64, pbandk.Sizer::int64Size, protoMarshal::writeInt64)
    if (repeatedUint32.isNotEmpty()) protoMarshal.writeTag(266).writePackedRepeated(repeatedUint32, pbandk.Sizer::uInt32Size, protoMarshal::writeUInt32)
    if (repeatedUint64.isNotEmpty()) protoMarshal.writeTag(274).writePackedRepeated(repeatedUint64, pbandk.Sizer::uInt64Size, protoMarshal::writeUInt64)
    if (repeatedSint32.isNotEmpty()) protoMarshal.writeTag(282).writePackedRepeated(repeatedSint32, pbandk.Sizer::sInt32Size, protoMarshal::writeSInt32)
    if (repeatedSint64.isNotEmpty()) protoMarshal.writeTag(290).writePackedRepeated(repeatedSint64, pbandk.Sizer::sInt64Size, protoMarshal::writeSInt64)
    if (repeatedFixed32.isNotEmpty()) protoMarshal.writeTag(298).writePackedRepeated(repeatedFixed32, pbandk.Sizer::fixed32Size, protoMarshal::writeFixed32)
    if (repeatedFixed64.isNotEmpty()) protoMarshal.writeTag(306).writePackedRepeated(repeatedFixed64, pbandk.Sizer::fixed64Size, protoMarshal::writeFixed64)
    if (repeatedSfixed32.isNotEmpty()) protoMarshal.writeTag(314).writePackedRepeated(repeatedSfixed32, pbandk.Sizer::sFixed32Size, protoMarshal::writeSFixed32)
    if (repeatedSfixed64.isNotEmpty()) protoMarshal.writeTag(322).writePackedRepeated(repeatedSfixed64, pbandk.Sizer::sFixed64Size, protoMarshal::writeSFixed64)
    if (repeatedFloat.isNotEmpty()) protoMarshal.writeTag(330).writePackedRepeated(repeatedFloat, pbandk.Sizer::floatSize, protoMarshal::writeFloat)
    if (repeatedDouble.isNotEmpty()) protoMarshal.writeTag(338).writePackedRepeated(repeatedDouble, pbandk.Sizer::doubleSize, protoMarshal::writeDouble)
    if (repeatedBool.isNotEmpty()) protoMarshal.writeTag(346).writePackedRepeated(repeatedBool, pbandk.Sizer::boolSize, protoMarshal::writeBool)
    if (repeatedString.isNotEmpty()) repeatedString.forEach { protoMarshal.writeTag(354).writeString(it) }
    if (repeatedBytes.isNotEmpty()) repeatedBytes.forEach { protoMarshal.writeTag(362).writeBytes(it) }
    if (repeatedNestedMessage.isNotEmpty()) repeatedNestedMessage.forEach { protoMarshal.writeTag(386).writeMessage(it) }
    if (repeatedForeignMessage.isNotEmpty()) repeatedForeignMessage.forEach { protoMarshal.writeTag(394).writeMessage(it) }
    if (repeatedNestedEnum.isNotEmpty()) repeatedNestedEnum.forEach { protoMarshal.writeTag(408).writeEnum(it) }
    if (repeatedForeignEnum.isNotEmpty()) repeatedForeignEnum.forEach { protoMarshal.writeTag(416).writeEnum(it) }
    if (repeatedStringPiece.isNotEmpty()) repeatedStringPiece.forEach { protoMarshal.writeTag(434).writeString(it) }
    if (repeatedCord.isNotEmpty()) repeatedCord.forEach { protoMarshal.writeTag(442).writeString(it) }
    if (mapInt32Int32.isNotEmpty()) protoMarshal.writeMap(450, mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto3::MapInt32Int32Entry)
    if (mapInt64Int64.isNotEmpty()) protoMarshal.writeMap(458, mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto3::MapInt64Int64Entry)
    if (mapUint32Uint32.isNotEmpty()) protoMarshal.writeMap(466, mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto3::MapUint32Uint32Entry)
    if (mapUint64Uint64.isNotEmpty()) protoMarshal.writeMap(474, mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto3::MapUint64Uint64Entry)
    if (mapSint32Sint32.isNotEmpty()) protoMarshal.writeMap(482, mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto3::MapSint32Sint32Entry)
    if (mapSint64Sint64.isNotEmpty()) protoMarshal.writeMap(490, mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto3::MapSint64Sint64Entry)
    if (mapFixed32Fixed32.isNotEmpty()) protoMarshal.writeMap(498, mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto3::MapFixed32Fixed32Entry)
    if (mapFixed64Fixed64.isNotEmpty()) protoMarshal.writeMap(506, mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto3::MapFixed64Fixed64Entry)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoMarshal.writeMap(514, mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed32Sfixed32Entry)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoMarshal.writeMap(522, mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed64Sfixed64Entry)
    if (mapInt32Float.isNotEmpty()) protoMarshal.writeMap(530, mapInt32Float, pbandk.conformance.pb.TestAllTypesProto3::MapInt32FloatEntry)
    if (mapInt32Double.isNotEmpty()) protoMarshal.writeMap(538, mapInt32Double, pbandk.conformance.pb.TestAllTypesProto3::MapInt32DoubleEntry)
    if (mapBoolBool.isNotEmpty()) protoMarshal.writeMap(546, mapBoolBool, pbandk.conformance.pb.TestAllTypesProto3::MapBoolBoolEntry)
    if (mapStringString.isNotEmpty()) protoMarshal.writeMap(554, mapStringString, pbandk.conformance.pb.TestAllTypesProto3::MapStringStringEntry)
    if (mapStringBytes.isNotEmpty()) protoMarshal.writeMap(562, mapStringBytes, pbandk.conformance.pb.TestAllTypesProto3::MapStringBytesEntry)
    if (mapStringNestedMessage.isNotEmpty()) protoMarshal.writeMap(570, mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedMessageEntry)
    if (mapStringForeignMessage.isNotEmpty()) protoMarshal.writeMap(578, mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignMessageEntry)
    if (mapStringNestedEnum.isNotEmpty()) protoMarshal.writeMap(586, mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedEnumEntry)
    if (mapStringForeignEnum.isNotEmpty()) protoMarshal.writeMap(594, mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignEnumEntry)
    if (packedInt32.isNotEmpty()) protoMarshal.writeTag(602).writePackedRepeated(packedInt32, pbandk.Sizer::int32Size, protoMarshal::writeInt32)
    if (packedInt64.isNotEmpty()) protoMarshal.writeTag(610).writePackedRepeated(packedInt64, pbandk.Sizer::int64Size, protoMarshal::writeInt64)
    if (packedUint32.isNotEmpty()) protoMarshal.writeTag(618).writePackedRepeated(packedUint32, pbandk.Sizer::uInt32Size, protoMarshal::writeUInt32)
    if (packedUint64.isNotEmpty()) protoMarshal.writeTag(626).writePackedRepeated(packedUint64, pbandk.Sizer::uInt64Size, protoMarshal::writeUInt64)
    if (packedSint32.isNotEmpty()) protoMarshal.writeTag(634).writePackedRepeated(packedSint32, pbandk.Sizer::sInt32Size, protoMarshal::writeSInt32)
    if (packedSint64.isNotEmpty()) protoMarshal.writeTag(642).writePackedRepeated(packedSint64, pbandk.Sizer::sInt64Size, protoMarshal::writeSInt64)
    if (packedFixed32.isNotEmpty()) protoMarshal.writeTag(650).writePackedRepeated(packedFixed32, pbandk.Sizer::fixed32Size, protoMarshal::writeFixed32)
    if (packedFixed64.isNotEmpty()) protoMarshal.writeTag(658).writePackedRepeated(packedFixed64, pbandk.Sizer::fixed64Size, protoMarshal::writeFixed64)
    if (packedSfixed32.isNotEmpty()) protoMarshal.writeTag(666).writePackedRepeated(packedSfixed32, pbandk.Sizer::sFixed32Size, protoMarshal::writeSFixed32)
    if (packedSfixed64.isNotEmpty()) protoMarshal.writeTag(674).writePackedRepeated(packedSfixed64, pbandk.Sizer::sFixed64Size, protoMarshal::writeSFixed64)
    if (packedFloat.isNotEmpty()) protoMarshal.writeTag(682).writePackedRepeated(packedFloat, pbandk.Sizer::floatSize, protoMarshal::writeFloat)
    if (packedDouble.isNotEmpty()) protoMarshal.writeTag(690).writePackedRepeated(packedDouble, pbandk.Sizer::doubleSize, protoMarshal::writeDouble)
    if (packedBool.isNotEmpty()) protoMarshal.writeTag(698).writePackedRepeated(packedBool, pbandk.Sizer::boolSize, protoMarshal::writeBool)
    if (packedNestedEnum.isNotEmpty()) packedNestedEnum.forEach { protoMarshal.writeTag(704).writeEnum(it) }
    if (unpackedInt32.isNotEmpty()) protoMarshal.writeTag(714).writePackedRepeated(unpackedInt32, pbandk.Sizer::int32Size, protoMarshal::writeInt32)
    if (unpackedInt64.isNotEmpty()) protoMarshal.writeTag(722).writePackedRepeated(unpackedInt64, pbandk.Sizer::int64Size, protoMarshal::writeInt64)
    if (unpackedUint32.isNotEmpty()) protoMarshal.writeTag(730).writePackedRepeated(unpackedUint32, pbandk.Sizer::uInt32Size, protoMarshal::writeUInt32)
    if (unpackedUint64.isNotEmpty()) protoMarshal.writeTag(738).writePackedRepeated(unpackedUint64, pbandk.Sizer::uInt64Size, protoMarshal::writeUInt64)
    if (unpackedSint32.isNotEmpty()) protoMarshal.writeTag(746).writePackedRepeated(unpackedSint32, pbandk.Sizer::sInt32Size, protoMarshal::writeSInt32)
    if (unpackedSint64.isNotEmpty()) protoMarshal.writeTag(754).writePackedRepeated(unpackedSint64, pbandk.Sizer::sInt64Size, protoMarshal::writeSInt64)
    if (unpackedFixed32.isNotEmpty()) protoMarshal.writeTag(762).writePackedRepeated(unpackedFixed32, pbandk.Sizer::fixed32Size, protoMarshal::writeFixed32)
    if (unpackedFixed64.isNotEmpty()) protoMarshal.writeTag(770).writePackedRepeated(unpackedFixed64, pbandk.Sizer::fixed64Size, protoMarshal::writeFixed64)
    if (unpackedSfixed32.isNotEmpty()) protoMarshal.writeTag(778).writePackedRepeated(unpackedSfixed32, pbandk.Sizer::sFixed32Size, protoMarshal::writeSFixed32)
    if (unpackedSfixed64.isNotEmpty()) protoMarshal.writeTag(786).writePackedRepeated(unpackedSfixed64, pbandk.Sizer::sFixed64Size, protoMarshal::writeSFixed64)
    if (unpackedFloat.isNotEmpty()) protoMarshal.writeTag(794).writePackedRepeated(unpackedFloat, pbandk.Sizer::floatSize, protoMarshal::writeFloat)
    if (unpackedDouble.isNotEmpty()) protoMarshal.writeTag(802).writePackedRepeated(unpackedDouble, pbandk.Sizer::doubleSize, protoMarshal::writeDouble)
    if (unpackedBool.isNotEmpty()) protoMarshal.writeTag(810).writePackedRepeated(unpackedBool, pbandk.Sizer::boolSize, protoMarshal::writeBool)
    if (unpackedNestedEnum.isNotEmpty()) unpackedNestedEnum.forEach { protoMarshal.writeTag(816).writeEnum(it) }
    if (oneofField is TestAllTypesProto3.OneofField.OneofUint32) protoMarshal.writeTag(888).writeUInt32(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage) protoMarshal.writeTag(898).writeMessage(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofString) protoMarshal.writeTag(906).writeString(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofBytes) protoMarshal.writeTag(914).writeBytes(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofBool) protoMarshal.writeTag(920).writeBool(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofUint64) protoMarshal.writeTag(928).writeUInt64(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofFloat) protoMarshal.writeTag(941).writeFloat(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofDouble) protoMarshal.writeTag(945).writeDouble(oneofField.value)
    if (oneofField is TestAllTypesProto3.OneofField.OneofEnum) protoMarshal.writeTag(952).writeEnum(oneofField.value)
    if (optionalBoolWrapper != null) protoMarshal.writeTag(1610).writeMessage(pbandk.wkt.BoolValue(optionalBoolWrapper))
    if (optionalInt32Wrapper != null) protoMarshal.writeTag(1618).writeMessage(pbandk.wkt.Int32Value(optionalInt32Wrapper))
    if (optionalInt64Wrapper != null) protoMarshal.writeTag(1626).writeMessage(pbandk.wkt.Int64Value(optionalInt64Wrapper))
    if (optionalUint32Wrapper != null) protoMarshal.writeTag(1634).writeMessage(pbandk.wkt.UInt32Value(optionalUint32Wrapper))
    if (optionalUint64Wrapper != null) protoMarshal.writeTag(1642).writeMessage(pbandk.wkt.UInt64Value(optionalUint64Wrapper))
    if (optionalFloatWrapper != null) protoMarshal.writeTag(1650).writeMessage(pbandk.wkt.FloatValue(optionalFloatWrapper))
    if (optionalDoubleWrapper != null) protoMarshal.writeTag(1658).writeMessage(pbandk.wkt.DoubleValue(optionalDoubleWrapper))
    if (optionalStringWrapper != null) protoMarshal.writeTag(1666).writeMessage(pbandk.wkt.StringValue(optionalStringWrapper))
    if (optionalBytesWrapper != null) protoMarshal.writeTag(1674).writeMessage(pbandk.wkt.BytesValue(optionalBytesWrapper))
    if (repeatedBoolWrapper.isNotEmpty()) repeatedBoolWrapper.forEach { protoMarshal.writeTag(1690).writeMessage(pbandk.wkt.BoolValue(it)) }
    if (repeatedInt32Wrapper.isNotEmpty()) repeatedInt32Wrapper.forEach { protoMarshal.writeTag(1698).writeMessage(pbandk.wkt.Int32Value(it)) }
    if (repeatedInt64Wrapper.isNotEmpty()) repeatedInt64Wrapper.forEach { protoMarshal.writeTag(1706).writeMessage(pbandk.wkt.Int64Value(it)) }
    if (repeatedUint32Wrapper.isNotEmpty()) repeatedUint32Wrapper.forEach { protoMarshal.writeTag(1714).writeMessage(pbandk.wkt.UInt32Value(it)) }
    if (repeatedUint64Wrapper.isNotEmpty()) repeatedUint64Wrapper.forEach { protoMarshal.writeTag(1722).writeMessage(pbandk.wkt.UInt64Value(it)) }
    if (repeatedFloatWrapper.isNotEmpty()) repeatedFloatWrapper.forEach { protoMarshal.writeTag(1730).writeMessage(pbandk.wkt.FloatValue(it)) }
    if (repeatedDoubleWrapper.isNotEmpty()) repeatedDoubleWrapper.forEach { protoMarshal.writeTag(1738).writeMessage(pbandk.wkt.DoubleValue(it)) }
    if (repeatedStringWrapper.isNotEmpty()) repeatedStringWrapper.forEach { protoMarshal.writeTag(1746).writeMessage(pbandk.wkt.StringValue(it)) }
    if (repeatedBytesWrapper.isNotEmpty()) repeatedBytesWrapper.forEach { protoMarshal.writeTag(1754).writeMessage(pbandk.wkt.BytesValue(it)) }
    if (optionalDuration != null) protoMarshal.writeTag(2410).writeMessage(optionalDuration)
    if (optionalTimestamp != null) protoMarshal.writeTag(2418).writeMessage(optionalTimestamp)
    if (optionalFieldMask != null) protoMarshal.writeTag(2426).writeMessage(optionalFieldMask)
    if (optionalStruct != null) protoMarshal.writeTag(2434).writeMessage(optionalStruct)
    if (optionalAny != null) protoMarshal.writeTag(2442).writeMessage(optionalAny)
    if (optionalValue != null) protoMarshal.writeTag(2450).writeMessage(optionalValue)
    if (repeatedDuration.isNotEmpty()) repeatedDuration.forEach { protoMarshal.writeTag(2490).writeMessage(it) }
    if (repeatedTimestamp.isNotEmpty()) repeatedTimestamp.forEach { protoMarshal.writeTag(2498).writeMessage(it) }
    if (repeatedFieldmask.isNotEmpty()) repeatedFieldmask.forEach { protoMarshal.writeTag(2506).writeMessage(it) }
    if (repeatedAny.isNotEmpty()) repeatedAny.forEach { protoMarshal.writeTag(2522).writeMessage(it) }
    if (repeatedValue.isNotEmpty()) repeatedValue.forEach { protoMarshal.writeTag(2530).writeMessage(it) }
    if (repeatedListValue.isNotEmpty()) repeatedListValue.forEach { protoMarshal.writeTag(2538).writeMessage(it) }
    if (repeatedStruct.isNotEmpty()) repeatedStruct.forEach { protoMarshal.writeTag(2594).writeMessage(it) }
    if (fieldname1 != 0) protoMarshal.writeTag(3208).writeInt32(fieldname1)
    if (fieldName2 != 0) protoMarshal.writeTag(3216).writeInt32(fieldName2)
    if (fieldName3 != 0) protoMarshal.writeTag(3224).writeInt32(fieldName3)
    if (field_name4 != 0) protoMarshal.writeTag(3232).writeInt32(field_name4)
    if (field0name5 != 0) protoMarshal.writeTag(3240).writeInt32(field0name5)
    if (field0Name6 != 0) protoMarshal.writeTag(3248).writeInt32(field0Name6)
    if (fieldName7 != 0) protoMarshal.writeTag(3256).writeInt32(fieldName7)
    if (fieldName8 != 0) protoMarshal.writeTag(3264).writeInt32(fieldName8)
    if (fieldName9 != 0) protoMarshal.writeTag(3272).writeInt32(fieldName9)
    if (fieldName10 != 0) protoMarshal.writeTag(3280).writeInt32(fieldName10)
    if (fIELDNAME11 != 0) protoMarshal.writeTag(3288).writeInt32(fIELDNAME11)
    if (fIELDName12 != 0) protoMarshal.writeTag(3296).writeInt32(fIELDName12)
    if (_fieldName13 != 0) protoMarshal.writeTag(3304).writeInt32(_fieldName13)
    if (_FieldName14 != 0) protoMarshal.writeTag(3312).writeInt32(_FieldName14)
    if (field_name15 != 0) protoMarshal.writeTag(3320).writeInt32(field_name15)
    if (field_Name16 != 0) protoMarshal.writeTag(3328).writeInt32(field_Name16)
    if (fieldName17_ != 0) protoMarshal.writeTag(3336).writeInt32(fieldName17_)
    if (fieldName18_ != 0) protoMarshal.writeTag(3344).writeInt32(fieldName18_)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3 {
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
    var optionalBoolWrapper: pbandk.wkt.BoolValue? = null
    var optionalInt32Wrapper: pbandk.wkt.Int32Value? = null
    var optionalInt64Wrapper: pbandk.wkt.Int64Value? = null
    var optionalUint32Wrapper: pbandk.wkt.UInt32Value? = null
    var optionalUint64Wrapper: pbandk.wkt.UInt64Value? = null
    var optionalFloatWrapper: pbandk.wkt.FloatValue? = null
    var optionalDoubleWrapper: pbandk.wkt.DoubleValue? = null
    var optionalStringWrapper: pbandk.wkt.StringValue? = null
    var optionalBytesWrapper: pbandk.wkt.BytesValue? = null
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
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
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
            pbandk.MessageMap.Builder.fixed(mapStringForeignMessage), pbandk.MessageMap.Builder.fixed(mapStringNestedEnum), pbandk.MessageMap.Builder.fixed(mapStringForeignEnum), optionalBoolWrapper?.value,
            optionalInt32Wrapper?.value, optionalInt64Wrapper?.value, optionalUint32Wrapper?.value, optionalUint64Wrapper?.value,
            optionalFloatWrapper?.value, optionalDoubleWrapper?.value, optionalStringWrapper?.value, optionalBytesWrapper?.value,
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
            oneofField, protoUnmarshal.unknownFields())
        8 -> optionalInt32 = protoUnmarshal.readInt32()
        16 -> optionalInt64 = protoUnmarshal.readInt64()
        24 -> optionalUint32 = protoUnmarshal.readUInt32()
        32 -> optionalUint64 = protoUnmarshal.readUInt64()
        40 -> optionalSint32 = protoUnmarshal.readSInt32()
        48 -> optionalSint64 = protoUnmarshal.readSInt64()
        61 -> optionalFixed32 = protoUnmarshal.readFixed32()
        65 -> optionalFixed64 = protoUnmarshal.readFixed64()
        77 -> optionalSfixed32 = protoUnmarshal.readSFixed32()
        81 -> optionalSfixed64 = protoUnmarshal.readSFixed64()
        93 -> optionalFloat = protoUnmarshal.readFloat()
        97 -> optionalDouble = protoUnmarshal.readDouble()
        104 -> optionalBool = protoUnmarshal.readBool()
        114 -> optionalString = protoUnmarshal.readString()
        122 -> optionalBytes = protoUnmarshal.readBytes()
        146 -> optionalNestedMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)
        154 -> optionalForeignMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.ForeignMessage.Companion)
        168 -> optionalNestedEnum = protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)
        176 -> optionalForeignEnum = protoUnmarshal.readEnum(pbandk.conformance.pb.ForeignEnum.Companion)
        184 -> optionalAliasedEnum = protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.Companion)
        194 -> optionalStringPiece = protoUnmarshal.readString()
        202 -> optionalCord = protoUnmarshal.readString()
        218 -> recursiveMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto3.Companion)
        250, 248 -> repeatedInt32 = protoUnmarshal.readRepeated(repeatedInt32, protoUnmarshal::readInt32, false)
        258, 256 -> repeatedInt64 = protoUnmarshal.readRepeated(repeatedInt64, protoUnmarshal::readInt64, false)
        266, 264 -> repeatedUint32 = protoUnmarshal.readRepeated(repeatedUint32, protoUnmarshal::readUInt32, false)
        274, 272 -> repeatedUint64 = protoUnmarshal.readRepeated(repeatedUint64, protoUnmarshal::readUInt64, false)
        282, 280 -> repeatedSint32 = protoUnmarshal.readRepeated(repeatedSint32, protoUnmarshal::readSInt32, false)
        290, 288 -> repeatedSint64 = protoUnmarshal.readRepeated(repeatedSint64, protoUnmarshal::readSInt64, false)
        298, 301 -> repeatedFixed32 = protoUnmarshal.readRepeated(repeatedFixed32, protoUnmarshal::readFixed32, false)
        306, 305 -> repeatedFixed64 = protoUnmarshal.readRepeated(repeatedFixed64, protoUnmarshal::readFixed64, false)
        314, 317 -> repeatedSfixed32 = protoUnmarshal.readRepeated(repeatedSfixed32, protoUnmarshal::readSFixed32, false)
        322, 321 -> repeatedSfixed64 = protoUnmarshal.readRepeated(repeatedSfixed64, protoUnmarshal::readSFixed64, false)
        330, 333 -> repeatedFloat = protoUnmarshal.readRepeated(repeatedFloat, protoUnmarshal::readFloat, false)
        338, 337 -> repeatedDouble = protoUnmarshal.readRepeated(repeatedDouble, protoUnmarshal::readDouble, false)
        346, 344 -> repeatedBool = protoUnmarshal.readRepeated(repeatedBool, protoUnmarshal::readBool, false)
        354 -> repeatedString = protoUnmarshal.readRepeated(repeatedString, protoUnmarshal::readString, true)
        362 -> repeatedBytes = protoUnmarshal.readRepeated(repeatedBytes, protoUnmarshal::readBytes, true)
        386 -> repeatedNestedMessage = protoUnmarshal.readRepeatedMessage(repeatedNestedMessage, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion, true)
        394 -> repeatedForeignMessage = protoUnmarshal.readRepeatedMessage(repeatedForeignMessage, pbandk.conformance.pb.ForeignMessage.Companion, true)
        408, 410 -> repeatedNestedEnum = protoUnmarshal.readRepeatedEnum(repeatedNestedEnum, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)
        416, 418 -> repeatedForeignEnum = protoUnmarshal.readRepeatedEnum(repeatedForeignEnum, pbandk.conformance.pb.ForeignEnum.Companion)
        434 -> repeatedStringPiece = protoUnmarshal.readRepeated(repeatedStringPiece, protoUnmarshal::readString, true)
        442 -> repeatedCord = protoUnmarshal.readRepeated(repeatedCord, protoUnmarshal::readString, true)
        450 -> mapInt32Int32 = protoUnmarshal.readMap(mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry.Companion, true)
        458 -> mapInt64Int64 = protoUnmarshal.readMap(mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry.Companion, true)
        466 -> mapUint32Uint32 = protoUnmarshal.readMap(mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry.Companion, true)
        474 -> mapUint64Uint64 = protoUnmarshal.readMap(mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry.Companion, true)
        482 -> mapSint32Sint32 = protoUnmarshal.readMap(mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry.Companion, true)
        490 -> mapSint64Sint64 = protoUnmarshal.readMap(mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry.Companion, true)
        498 -> mapFixed32Fixed32 = protoUnmarshal.readMap(mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry.Companion, true)
        506 -> mapFixed64Fixed64 = protoUnmarshal.readMap(mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry.Companion, true)
        514 -> mapSfixed32Sfixed32 = protoUnmarshal.readMap(mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion, true)
        522 -> mapSfixed64Sfixed64 = protoUnmarshal.readMap(mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion, true)
        530 -> mapInt32Float = protoUnmarshal.readMap(mapInt32Float, pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry.Companion, true)
        538 -> mapInt32Double = protoUnmarshal.readMap(mapInt32Double, pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry.Companion, true)
        546 -> mapBoolBool = protoUnmarshal.readMap(mapBoolBool, pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry.Companion, true)
        554 -> mapStringString = protoUnmarshal.readMap(mapStringString, pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry.Companion, true)
        562 -> mapStringBytes = protoUnmarshal.readMap(mapStringBytes, pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry.Companion, true)
        570 -> mapStringNestedMessage = protoUnmarshal.readMap(mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry.Companion, true)
        578 -> mapStringForeignMessage = protoUnmarshal.readMap(mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry.Companion, true)
        586 -> mapStringNestedEnum = protoUnmarshal.readMap(mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry.Companion, true)
        594 -> mapStringForeignEnum = protoUnmarshal.readMap(mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry.Companion, true)
        602, 600 -> packedInt32 = protoUnmarshal.readRepeated(packedInt32, protoUnmarshal::readInt32, false)
        610, 608 -> packedInt64 = protoUnmarshal.readRepeated(packedInt64, protoUnmarshal::readInt64, false)
        618, 616 -> packedUint32 = protoUnmarshal.readRepeated(packedUint32, protoUnmarshal::readUInt32, false)
        626, 624 -> packedUint64 = protoUnmarshal.readRepeated(packedUint64, protoUnmarshal::readUInt64, false)
        634, 632 -> packedSint32 = protoUnmarshal.readRepeated(packedSint32, protoUnmarshal::readSInt32, false)
        642, 640 -> packedSint64 = protoUnmarshal.readRepeated(packedSint64, protoUnmarshal::readSInt64, false)
        650, 653 -> packedFixed32 = protoUnmarshal.readRepeated(packedFixed32, protoUnmarshal::readFixed32, false)
        658, 657 -> packedFixed64 = protoUnmarshal.readRepeated(packedFixed64, protoUnmarshal::readFixed64, false)
        666, 669 -> packedSfixed32 = protoUnmarshal.readRepeated(packedSfixed32, protoUnmarshal::readSFixed32, false)
        674, 673 -> packedSfixed64 = protoUnmarshal.readRepeated(packedSfixed64, protoUnmarshal::readSFixed64, false)
        682, 685 -> packedFloat = protoUnmarshal.readRepeated(packedFloat, protoUnmarshal::readFloat, false)
        690, 689 -> packedDouble = protoUnmarshal.readRepeated(packedDouble, protoUnmarshal::readDouble, false)
        698, 696 -> packedBool = protoUnmarshal.readRepeated(packedBool, protoUnmarshal::readBool, false)
        704, 706 -> packedNestedEnum = protoUnmarshal.readRepeatedEnum(packedNestedEnum, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)
        714, 712 -> unpackedInt32 = protoUnmarshal.readRepeated(unpackedInt32, protoUnmarshal::readInt32, false)
        722, 720 -> unpackedInt64 = protoUnmarshal.readRepeated(unpackedInt64, protoUnmarshal::readInt64, false)
        730, 728 -> unpackedUint32 = protoUnmarshal.readRepeated(unpackedUint32, protoUnmarshal::readUInt32, false)
        738, 736 -> unpackedUint64 = protoUnmarshal.readRepeated(unpackedUint64, protoUnmarshal::readUInt64, false)
        746, 744 -> unpackedSint32 = protoUnmarshal.readRepeated(unpackedSint32, protoUnmarshal::readSInt32, false)
        754, 752 -> unpackedSint64 = protoUnmarshal.readRepeated(unpackedSint64, protoUnmarshal::readSInt64, false)
        762, 765 -> unpackedFixed32 = protoUnmarshal.readRepeated(unpackedFixed32, protoUnmarshal::readFixed32, false)
        770, 769 -> unpackedFixed64 = protoUnmarshal.readRepeated(unpackedFixed64, protoUnmarshal::readFixed64, false)
        778, 781 -> unpackedSfixed32 = protoUnmarshal.readRepeated(unpackedSfixed32, protoUnmarshal::readSFixed32, false)
        786, 785 -> unpackedSfixed64 = protoUnmarshal.readRepeated(unpackedSfixed64, protoUnmarshal::readSFixed64, false)
        794, 797 -> unpackedFloat = protoUnmarshal.readRepeated(unpackedFloat, protoUnmarshal::readFloat, false)
        802, 801 -> unpackedDouble = protoUnmarshal.readRepeated(unpackedDouble, protoUnmarshal::readDouble, false)
        810, 808 -> unpackedBool = protoUnmarshal.readRepeated(unpackedBool, protoUnmarshal::readBool, false)
        816, 818 -> unpackedNestedEnum = protoUnmarshal.readRepeatedEnum(unpackedNestedEnum, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)
        888 -> oneofField = TestAllTypesProto3.OneofField.OneofUint32(protoUnmarshal.readUInt32())
        898 -> oneofField = TestAllTypesProto3.OneofField.OneofNestedMessage(protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion))
        906 -> oneofField = TestAllTypesProto3.OneofField.OneofString(protoUnmarshal.readString())
        914 -> oneofField = TestAllTypesProto3.OneofField.OneofBytes(protoUnmarshal.readBytes())
        920 -> oneofField = TestAllTypesProto3.OneofField.OneofBool(protoUnmarshal.readBool())
        928 -> oneofField = TestAllTypesProto3.OneofField.OneofUint64(protoUnmarshal.readUInt64())
        941 -> oneofField = TestAllTypesProto3.OneofField.OneofFloat(protoUnmarshal.readFloat())
        945 -> oneofField = TestAllTypesProto3.OneofField.OneofDouble(protoUnmarshal.readDouble())
        952 -> oneofField = TestAllTypesProto3.OneofField.OneofEnum(protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion))
        1610 -> optionalBoolWrapper = protoUnmarshal.readMessage(pbandk.wkt.BoolValue.Companion)
        1618 -> optionalInt32Wrapper = protoUnmarshal.readMessage(pbandk.wkt.Int32Value.Companion)
        1626 -> optionalInt64Wrapper = protoUnmarshal.readMessage(pbandk.wkt.Int64Value.Companion)
        1634 -> optionalUint32Wrapper = protoUnmarshal.readMessage(pbandk.wkt.UInt32Value.Companion)
        1642 -> optionalUint64Wrapper = protoUnmarshal.readMessage(pbandk.wkt.UInt64Value.Companion)
        1650 -> optionalFloatWrapper = protoUnmarshal.readMessage(pbandk.wkt.FloatValue.Companion)
        1658 -> optionalDoubleWrapper = protoUnmarshal.readMessage(pbandk.wkt.DoubleValue.Companion)
        1666 -> optionalStringWrapper = protoUnmarshal.readMessage(pbandk.wkt.StringValue.Companion)
        1674 -> optionalBytesWrapper = protoUnmarshal.readMessage(pbandk.wkt.BytesValue.Companion)
        1690 -> repeatedBoolWrapper = protoUnmarshal.readRepeated(repeatedBoolWrapper, { protoUnmarshal.readMessage(pbandk.wkt.BoolValue.Companion).value }, true)
        1698 -> repeatedInt32Wrapper = protoUnmarshal.readRepeated(repeatedInt32Wrapper, { protoUnmarshal.readMessage(pbandk.wkt.Int32Value.Companion).value }, true)
        1706 -> repeatedInt64Wrapper = protoUnmarshal.readRepeated(repeatedInt64Wrapper, { protoUnmarshal.readMessage(pbandk.wkt.Int64Value.Companion).value }, true)
        1714 -> repeatedUint32Wrapper = protoUnmarshal.readRepeated(repeatedUint32Wrapper, { protoUnmarshal.readMessage(pbandk.wkt.UInt32Value.Companion).value }, true)
        1722 -> repeatedUint64Wrapper = protoUnmarshal.readRepeated(repeatedUint64Wrapper, { protoUnmarshal.readMessage(pbandk.wkt.UInt64Value.Companion).value }, true)
        1730 -> repeatedFloatWrapper = protoUnmarshal.readRepeated(repeatedFloatWrapper, { protoUnmarshal.readMessage(pbandk.wkt.FloatValue.Companion).value }, true)
        1738 -> repeatedDoubleWrapper = protoUnmarshal.readRepeated(repeatedDoubleWrapper, { protoUnmarshal.readMessage(pbandk.wkt.DoubleValue.Companion).value }, true)
        1746 -> repeatedStringWrapper = protoUnmarshal.readRepeated(repeatedStringWrapper, { protoUnmarshal.readMessage(pbandk.wkt.StringValue.Companion).value }, true)
        1754 -> repeatedBytesWrapper = protoUnmarshal.readRepeated(repeatedBytesWrapper, { protoUnmarshal.readMessage(pbandk.wkt.BytesValue.Companion).value }, true)
        2410 -> optionalDuration = protoUnmarshal.readMessage(pbandk.wkt.Duration.Companion)
        2418 -> optionalTimestamp = protoUnmarshal.readMessage(pbandk.wkt.Timestamp.Companion)
        2426 -> optionalFieldMask = protoUnmarshal.readMessage(pbandk.wkt.FieldMask.Companion)
        2434 -> optionalStruct = protoUnmarshal.readMessage(pbandk.wkt.Struct.Companion)
        2442 -> optionalAny = protoUnmarshal.readMessage(pbandk.wkt.Any.Companion)
        2450 -> optionalValue = protoUnmarshal.readMessage(pbandk.wkt.Value.Companion)
        2490 -> repeatedDuration = protoUnmarshal.readRepeatedMessage(repeatedDuration, pbandk.wkt.Duration.Companion, true)
        2498 -> repeatedTimestamp = protoUnmarshal.readRepeatedMessage(repeatedTimestamp, pbandk.wkt.Timestamp.Companion, true)
        2506 -> repeatedFieldmask = protoUnmarshal.readRepeatedMessage(repeatedFieldmask, pbandk.wkt.FieldMask.Companion, true)
        2522 -> repeatedAny = protoUnmarshal.readRepeatedMessage(repeatedAny, pbandk.wkt.Any.Companion, true)
        2530 -> repeatedValue = protoUnmarshal.readRepeatedMessage(repeatedValue, pbandk.wkt.Value.Companion, true)
        2538 -> repeatedListValue = protoUnmarshal.readRepeatedMessage(repeatedListValue, pbandk.wkt.ListValue.Companion, true)
        2594 -> repeatedStruct = protoUnmarshal.readRepeatedMessage(repeatedStruct, pbandk.wkt.Struct.Companion, true)
        3208 -> fieldname1 = protoUnmarshal.readInt32()
        3216 -> fieldName2 = protoUnmarshal.readInt32()
        3224 -> fieldName3 = protoUnmarshal.readInt32()
        3232 -> field_name4 = protoUnmarshal.readInt32()
        3240 -> field0name5 = protoUnmarshal.readInt32()
        3248 -> field0Name6 = protoUnmarshal.readInt32()
        3256 -> fieldName7 = protoUnmarshal.readInt32()
        3264 -> fieldName8 = protoUnmarshal.readInt32()
        3272 -> fieldName9 = protoUnmarshal.readInt32()
        3280 -> fieldName10 = protoUnmarshal.readInt32()
        3288 -> fIELDNAME11 = protoUnmarshal.readInt32()
        3296 -> fIELDName12 = protoUnmarshal.readInt32()
        3304 -> _fieldName13 = protoUnmarshal.readInt32()
        3312 -> _FieldName14 = protoUnmarshal.readInt32()
        3320 -> field_name15 = protoUnmarshal.readInt32()
        3328 -> field_Name16 = protoUnmarshal.readInt32()
        3336 -> fieldName17_ = protoUnmarshal.readInt32()
        3344 -> fieldName18_ = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.toJsonMapperImpl(): TestAllTypesProto3.JsonMapper =
    TestAllTypesProto3.JsonMapper(
        optionalInt32,
        optionalInt64,
        optionalUint32,
        optionalUint64,
        optionalSint32,
        optionalSint64,
        optionalFixed32,
        optionalFixed64,
        optionalSfixed32,
        optionalSfixed64,
        optionalFloat,
        optionalDouble,
        optionalBool,
        optionalString.takeIf { it != "" },
        optionalBytes,
        optionalNestedMessage?.toJsonMapper(),
        optionalForeignMessage?.toJsonMapper(),
        optionalNestedEnum?.name,
        optionalForeignEnum?.name,
        optionalAliasedEnum?.name,
        optionalStringPiece.takeIf { it != "" },
        optionalCord.takeIf { it != "" },
        recursiveMessage?.toJsonMapper(),
        repeatedInt32,
        repeatedInt64,
        repeatedUint32,
        repeatedUint64,
        repeatedSint32,
        repeatedSint64,
        repeatedFixed32,
        repeatedFixed64,
        repeatedSfixed32,
        repeatedSfixed64,
        repeatedFloat,
        repeatedDouble,
        repeatedBool,
        repeatedString,
        repeatedBytes,
        repeatedNestedMessage.map { it.toJsonMapper() },
        repeatedForeignMessage.map { it.toJsonMapper() },
        repeatedNestedEnum.mapNotNull { it.name },
        repeatedForeignEnum.mapNotNull { it.name },
        repeatedStringPiece,
        repeatedCord,
        mapInt32Int32,
        mapInt64Int64,
        mapUint32Uint32,
        mapUint64Uint64,
        mapSint32Sint32,
        mapSint64Sint64,
        mapFixed32Fixed32,
        mapFixed64Fixed64,
        mapSfixed32Sfixed32,
        mapSfixed64Sfixed64,
        mapInt32Float,
        mapInt32Double,
        mapBoolBool,
        mapStringString,
        mapStringBytes,
        mapStringNestedMessage.mapValues { it.value?.toJsonMapper() },
        mapStringForeignMessage.mapValues { it.value?.toJsonMapper() },
        mapStringNestedEnum.mapValues { it.value?.name },
        mapStringForeignEnum.mapValues { it.value?.name },
        packedInt32,
        packedInt64,
        packedUint32,
        packedUint64,
        packedSint32,
        packedSint64,
        packedFixed32,
        packedFixed64,
        packedSfixed32,
        packedSfixed64,
        packedFloat,
        packedDouble,
        packedBool,
        packedNestedEnum.mapNotNull { it.name },
        unpackedInt32,
        unpackedInt64,
        unpackedUint32,
        unpackedUint64,
        unpackedSint32,
        unpackedSint64,
        unpackedFixed32,
        unpackedFixed64,
        unpackedSfixed32,
        unpackedSfixed64,
        unpackedFloat,
        unpackedDouble,
        unpackedBool,
        unpackedNestedEnum.mapNotNull { it.name },
        oneofUint32,
        oneofNestedMessage?.toJsonMapper(),
        oneofString.takeIf { it != "" },
        oneofBytes,
        oneofBool,
        oneofUint64,
        oneofFloat,
        oneofDouble,
        oneofEnum?.name,
        optionalBoolWrapper,
        optionalInt32Wrapper,
        optionalInt64Wrapper,
        optionalUint32Wrapper,
        optionalUint64Wrapper,
        optionalFloatWrapper,
        optionalDoubleWrapper,
        optionalStringWrapper,
        optionalBytesWrapper,
        repeatedBoolWrapper,
        repeatedInt32Wrapper,
        repeatedInt64Wrapper,
        repeatedUint32Wrapper,
        repeatedUint64Wrapper,
        repeatedFloatWrapper,
        repeatedDoubleWrapper,
        repeatedStringWrapper,
        repeatedBytesWrapper,
        optionalDuration?.toJsonMapper(),
        optionalTimestamp?.toJsonMapper(),
        optionalFieldMask?.toJsonMapper(),
        optionalStruct?.toJsonMapper(),
        optionalAny?.toJsonMapper(),
        optionalValue?.toJsonMapper(),
        repeatedDuration.map { it.toJsonMapper() },
        repeatedTimestamp.map { it.toJsonMapper() },
        repeatedFieldmask.map { it.toJsonMapper() },
        repeatedAny.map { it.toJsonMapper() },
        repeatedValue.map { it.toJsonMapper() },
        repeatedListValue.map { it.toJsonMapper() },
        repeatedStruct.map { it.toJsonMapper() },
        fieldname1,
        fieldName2,
        fieldName3,
        field_name4,
        field0name5,
        field0Name6,
        fieldName7,
        fieldName8,
        fieldName9,
        fieldName10,
        fIELDNAME11,
        fIELDName12,
        _fieldName13,
        _FieldName14,
        field_name15,
        field_Name16,
        fieldName17_,
        fieldName18_
    )

private fun TestAllTypesProto3.JsonMapper.toMessageImpl(): TestAllTypesProto3 =
    TestAllTypesProto3(
        optionalInt32 = optionalInt32 ?: 0,
        optionalInt64 = optionalInt64 ?: 0L,
        optionalUint32 = optionalUint32 ?: 0,
        optionalUint64 = optionalUint64 ?: 0L,
        optionalSint32 = optionalSint32 ?: 0,
        optionalSint64 = optionalSint64 ?: 0L,
        optionalFixed32 = optionalFixed32 ?: 0,
        optionalFixed64 = optionalFixed64 ?: 0L,
        optionalSfixed32 = optionalSfixed32 ?: 0,
        optionalSfixed64 = optionalSfixed64 ?: 0L,
        optionalFloat = optionalFloat ?: 0.0F,
        optionalDouble = optionalDouble ?: 0.0,
        optionalBool = optionalBool ?: false,
        optionalString = optionalString ?: "",
        optionalBytes = optionalBytes ?: pbandk.ByteArr.empty,
        optionalNestedMessage = optionalNestedMessage?.toMessage(),
        optionalForeignMessage = optionalForeignMessage?.toMessage(),
        optionalNestedEnum = optionalNestedEnum?.let { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it) } ?: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0),
        optionalForeignEnum = optionalForeignEnum?.let { pbandk.conformance.pb.ForeignEnum.fromName(it) } ?: pbandk.conformance.pb.ForeignEnum.fromValue(0),
        optionalAliasedEnum = optionalAliasedEnum?.let { pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromName(it) } ?: pbandk.conformance.pb.TestAllTypesProto3.AliasedEnum.fromValue(0),
        optionalStringPiece = optionalStringPiece ?: "",
        optionalCord = optionalCord ?: "",
        recursiveMessage = recursiveMessage?.toMessage(),
        repeatedInt32 = repeatedInt32 ?: emptyList(),
        repeatedInt64 = repeatedInt64 ?: emptyList(),
        repeatedUint32 = repeatedUint32 ?: emptyList(),
        repeatedUint64 = repeatedUint64 ?: emptyList(),
        repeatedSint32 = repeatedSint32 ?: emptyList(),
        repeatedSint64 = repeatedSint64 ?: emptyList(),
        repeatedFixed32 = repeatedFixed32 ?: emptyList(),
        repeatedFixed64 = repeatedFixed64 ?: emptyList(),
        repeatedSfixed32 = repeatedSfixed32 ?: emptyList(),
        repeatedSfixed64 = repeatedSfixed64 ?: emptyList(),
        repeatedFloat = repeatedFloat ?: emptyList(),
        repeatedDouble = repeatedDouble ?: emptyList(),
        repeatedBool = repeatedBool ?: emptyList(),
        repeatedString = repeatedString ?: emptyList(),
        repeatedBytes = repeatedBytes ?: emptyList(),
        repeatedNestedMessage = repeatedNestedMessage.map { it.toMessage() },
        repeatedForeignMessage = repeatedForeignMessage.map { it.toMessage() },
        repeatedNestedEnum = repeatedNestedEnum.map { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it) },
        repeatedForeignEnum = repeatedForeignEnum.map { pbandk.conformance.pb.ForeignEnum.fromName(it) },
        repeatedStringPiece = repeatedStringPiece ?: emptyList(),
        repeatedCord = repeatedCord ?: emptyList(),
        packedInt32 = packedInt32 ?: emptyList(),
        packedInt64 = packedInt64 ?: emptyList(),
        packedUint32 = packedUint32 ?: emptyList(),
        packedUint64 = packedUint64 ?: emptyList(),
        packedSint32 = packedSint32 ?: emptyList(),
        packedSint64 = packedSint64 ?: emptyList(),
        packedFixed32 = packedFixed32 ?: emptyList(),
        packedFixed64 = packedFixed64 ?: emptyList(),
        packedSfixed32 = packedSfixed32 ?: emptyList(),
        packedSfixed64 = packedSfixed64 ?: emptyList(),
        packedFloat = packedFloat ?: emptyList(),
        packedDouble = packedDouble ?: emptyList(),
        packedBool = packedBool ?: emptyList(),
        packedNestedEnum = packedNestedEnum.map { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it) },
        unpackedInt32 = unpackedInt32 ?: emptyList(),
        unpackedInt64 = unpackedInt64 ?: emptyList(),
        unpackedUint32 = unpackedUint32 ?: emptyList(),
        unpackedUint64 = unpackedUint64 ?: emptyList(),
        unpackedSint32 = unpackedSint32 ?: emptyList(),
        unpackedSint64 = unpackedSint64 ?: emptyList(),
        unpackedFixed32 = unpackedFixed32 ?: emptyList(),
        unpackedFixed64 = unpackedFixed64 ?: emptyList(),
        unpackedSfixed32 = unpackedSfixed32 ?: emptyList(),
        unpackedSfixed64 = unpackedSfixed64 ?: emptyList(),
        unpackedFloat = unpackedFloat ?: emptyList(),
        unpackedDouble = unpackedDouble ?: emptyList(),
        unpackedBool = unpackedBool ?: emptyList(),
        unpackedNestedEnum = unpackedNestedEnum.map { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it) },
        mapInt32Int32 = mapInt32Int32.mapValues { it.value ?: 0 },
        mapInt64Int64 = mapInt64Int64.mapValues { it.value ?: 0L },
        mapUint32Uint32 = mapUint32Uint32.mapValues { it.value ?: 0 },
        mapUint64Uint64 = mapUint64Uint64.mapValues { it.value ?: 0L },
        mapSint32Sint32 = mapSint32Sint32.mapValues { it.value ?: 0 },
        mapSint64Sint64 = mapSint64Sint64.mapValues { it.value ?: 0L },
        mapFixed32Fixed32 = mapFixed32Fixed32.mapValues { it.value ?: 0 },
        mapFixed64Fixed64 = mapFixed64Fixed64.mapValues { it.value ?: 0L },
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32.mapValues { it.value ?: 0 },
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64.mapValues { it.value ?: 0L },
        mapInt32Float = mapInt32Float.mapValues { it.value ?: 0.0F },
        mapInt32Double = mapInt32Double.mapValues { it.value ?: 0.0 },
        mapBoolBool = mapBoolBool.mapValues { it.value ?: false },
        mapStringString = mapStringString.mapValues { it.value ?: "" },
        mapStringBytes = mapStringBytes.mapValues { it.value ?: pbandk.ByteArr.empty },
        mapStringNestedMessage = mapStringNestedMessage.mapValues { it.value?.toMessage() },
        mapStringForeignMessage = mapStringForeignMessage.mapValues { it.value?.toMessage() },
        mapStringNestedEnum = mapStringNestedEnum.mapValues { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it.value!!) },
        mapStringForeignEnum = mapStringForeignEnum.mapValues { pbandk.conformance.pb.ForeignEnum.fromName(it.value!!) },
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
        optionalDuration = optionalDuration?.toMessage(),
        optionalTimestamp = optionalTimestamp?.toMessage(),
        optionalFieldMask = optionalFieldMask?.toMessage(),
        optionalStruct = optionalStruct?.toMessage(),
        optionalAny = optionalAny?.toMessage(),
        optionalValue = optionalValue?.toMessage(),
        repeatedDuration = repeatedDuration.map { it.toMessage() },
        repeatedTimestamp = repeatedTimestamp.map { it.toMessage() },
        repeatedFieldmask = repeatedFieldmask.map { it.toMessage() },
        repeatedStruct = repeatedStruct.map { it.toMessage() },
        repeatedAny = repeatedAny.map { it.toMessage() },
        repeatedValue = repeatedValue.map { it.toMessage() },
        repeatedListValue = repeatedListValue.map { it.toMessage() },
        fieldname1 = fieldname1 ?: 0,
        fieldName2 = fieldName2 ?: 0,
        fieldName3 = fieldName3 ?: 0,
        field_name4 = field_name4 ?: 0,
        field0name5 = field0name5 ?: 0,
        field0Name6 = field0Name6 ?: 0,
        fieldName7 = fieldName7 ?: 0,
        fieldName8 = fieldName8 ?: 0,
        fieldName9 = fieldName9 ?: 0,
        fieldName10 = fieldName10 ?: 0,
        fIELDNAME11 = fIELDNAME11 ?: 0,
        fIELDName12 = fIELDName12 ?: 0,
        _fieldName13 = _fieldName13 ?: 0,
        _FieldName14 = _FieldName14 ?: 0,
        field_name15 = field_name15 ?: 0,
        field_Name16 = field_Name16 ?: 0,
        fieldName17_ = fieldName17_ ?: 0,
        fieldName18_ = fieldName18_ ?: 0,
        oneofField = 
            oneofUint32?.let { value -> TestAllTypesProto3.OneofField.OneofUint32(value) }
             ?: oneofNestedMessage?.let { value -> TestAllTypesProto3.OneofField.OneofNestedMessage(value.toMessage()) }
             ?: oneofString?.let { value -> TestAllTypesProto3.OneofField.OneofString(value) }
             ?: oneofBytes?.let { value -> TestAllTypesProto3.OneofField.OneofBytes(value) }
             ?: oneofBool?.let { value -> TestAllTypesProto3.OneofField.OneofBool(value) }
             ?: oneofUint64?.let { value -> TestAllTypesProto3.OneofField.OneofUint64(value) }
             ?: oneofFloat?.let { value -> TestAllTypesProto3.OneofField.OneofFloat(value) }
             ?: oneofDouble?.let { value -> TestAllTypesProto3.OneofField.OneofDouble(value) }
             ?: oneofEnum?.let { value -> TestAllTypesProto3.OneofField.OneofEnum(value.let { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it) }) }
    )

private fun TestAllTypesProto3.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3 {
    val mapper = json.parse(TestAllTypesProto3.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.NestedMessage?.orDefault() = this ?: TestAllTypesProto3.NestedMessage.defaultInstance

private fun TestAllTypesProto3.NestedMessage.protoMergeImpl(plus: TestAllTypesProto3.NestedMessage?): TestAllTypesProto3.NestedMessage = plus?.copy(
    corecursive = corecursive?.plus(plus.corecursive) ?: plus.corecursive,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.NestedMessage.protoSizeImpl(): Int {
    var protoSize = 0
    if (a != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(a)
    if (corecursive != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(corecursive)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.NestedMessage.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (a != 0) protoMarshal.writeTag(8).writeInt32(a)
    if (corecursive != null) protoMarshal.writeTag(18).writeMessage(corecursive)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.NestedMessage.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.NestedMessage {
    var a = 0
    var corecursive: pbandk.conformance.pb.TestAllTypesProto3? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.NestedMessage(a, corecursive, protoUnmarshal.unknownFields())
        8 -> a = protoUnmarshal.readInt32()
        18 -> corecursive = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto3.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.NestedMessage.toJsonMapperImpl(): TestAllTypesProto3.NestedMessage.JsonMapper =
    TestAllTypesProto3.NestedMessage.JsonMapper(
        a,
        corecursive?.toJsonMapper()
    )

private fun TestAllTypesProto3.NestedMessage.JsonMapper.toMessageImpl(): TestAllTypesProto3.NestedMessage =
    TestAllTypesProto3.NestedMessage(
        a = a ?: 0,
        corecursive = corecursive?.toMessage()
    )

private fun TestAllTypesProto3.NestedMessage.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.NestedMessage.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.NestedMessage.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.NestedMessage {
    val mapper = json.parse(TestAllTypesProto3.NestedMessage.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapInt32Int32Entry?.orDefault() = this ?: TestAllTypesProto3.MapInt32Int32Entry.defaultInstance

private fun TestAllTypesProto3.MapInt32Int32Entry.protoMergeImpl(plus: TestAllTypesProto3.MapInt32Int32Entry?): TestAllTypesProto3.MapInt32Int32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapInt32Int32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapInt32Int32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeInt32(key)
    if (value != 0) protoMarshal.writeTag(16).writeInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapInt32Int32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapInt32Int32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapInt32Int32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        16 -> value = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapInt32Int32Entry.toJsonMapperImpl(): TestAllTypesProto3.MapInt32Int32Entry.JsonMapper =
    TestAllTypesProto3.MapInt32Int32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapInt32Int32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapInt32Int32Entry =
    TestAllTypesProto3.MapInt32Int32Entry(
        key = key ?: 0,
        value = value ?: 0
    )

private fun TestAllTypesProto3.MapInt32Int32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapInt32Int32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapInt32Int32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapInt32Int32Entry {
    val mapper = json.parse(TestAllTypesProto3.MapInt32Int32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapInt64Int64Entry?.orDefault() = this ?: TestAllTypesProto3.MapInt64Int64Entry.defaultInstance

private fun TestAllTypesProto3.MapInt64Int64Entry.protoMergeImpl(plus: TestAllTypesProto3.MapInt64Int64Entry?): TestAllTypesProto3.MapInt64Int64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapInt64Int64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapInt64Int64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(8).writeInt64(key)
    if (value != 0L) protoMarshal.writeTag(16).writeInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapInt64Int64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapInt64Int64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapInt64Int64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt64()
        16 -> value = protoUnmarshal.readInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapInt64Int64Entry.toJsonMapperImpl(): TestAllTypesProto3.MapInt64Int64Entry.JsonMapper =
    TestAllTypesProto3.MapInt64Int64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapInt64Int64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapInt64Int64Entry =
    TestAllTypesProto3.MapInt64Int64Entry(
        key = key ?: 0L,
        value = value ?: 0L
    )

private fun TestAllTypesProto3.MapInt64Int64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapInt64Int64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapInt64Int64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapInt64Int64Entry {
    val mapper = json.parse(TestAllTypesProto3.MapInt64Int64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapUint32Uint32Entry?.orDefault() = this ?: TestAllTypesProto3.MapUint32Uint32Entry.defaultInstance

private fun TestAllTypesProto3.MapUint32Uint32Entry.protoMergeImpl(plus: TestAllTypesProto3.MapUint32Uint32Entry?): TestAllTypesProto3.MapUint32Uint32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapUint32Uint32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.uInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapUint32Uint32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeUInt32(key)
    if (value != 0) protoMarshal.writeTag(16).writeUInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapUint32Uint32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapUint32Uint32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapUint32Uint32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readUInt32()
        16 -> value = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapUint32Uint32Entry.toJsonMapperImpl(): TestAllTypesProto3.MapUint32Uint32Entry.JsonMapper =
    TestAllTypesProto3.MapUint32Uint32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapUint32Uint32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapUint32Uint32Entry =
    TestAllTypesProto3.MapUint32Uint32Entry(
        key = key ?: 0,
        value = value ?: 0
    )

private fun TestAllTypesProto3.MapUint32Uint32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapUint32Uint32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapUint32Uint32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapUint32Uint32Entry {
    val mapper = json.parse(TestAllTypesProto3.MapUint32Uint32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapUint64Uint64Entry?.orDefault() = this ?: TestAllTypesProto3.MapUint64Uint64Entry.defaultInstance

private fun TestAllTypesProto3.MapUint64Uint64Entry.protoMergeImpl(plus: TestAllTypesProto3.MapUint64Uint64Entry?): TestAllTypesProto3.MapUint64Uint64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapUint64Uint64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.uInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapUint64Uint64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(8).writeUInt64(key)
    if (value != 0L) protoMarshal.writeTag(16).writeUInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapUint64Uint64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapUint64Uint64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapUint64Uint64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readUInt64()
        16 -> value = protoUnmarshal.readUInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapUint64Uint64Entry.toJsonMapperImpl(): TestAllTypesProto3.MapUint64Uint64Entry.JsonMapper =
    TestAllTypesProto3.MapUint64Uint64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapUint64Uint64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapUint64Uint64Entry =
    TestAllTypesProto3.MapUint64Uint64Entry(
        key = key ?: 0L,
        value = value ?: 0L
    )

private fun TestAllTypesProto3.MapUint64Uint64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapUint64Uint64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapUint64Uint64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapUint64Uint64Entry {
    val mapper = json.parse(TestAllTypesProto3.MapUint64Uint64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapSint32Sint32Entry?.orDefault() = this ?: TestAllTypesProto3.MapSint32Sint32Entry.defaultInstance

private fun TestAllTypesProto3.MapSint32Sint32Entry.protoMergeImpl(plus: TestAllTypesProto3.MapSint32Sint32Entry?): TestAllTypesProto3.MapSint32Sint32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapSint32Sint32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sInt32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapSint32Sint32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeSInt32(key)
    if (value != 0) protoMarshal.writeTag(16).writeSInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapSint32Sint32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapSint32Sint32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapSint32Sint32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readSInt32()
        16 -> value = protoUnmarshal.readSInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapSint32Sint32Entry.toJsonMapperImpl(): TestAllTypesProto3.MapSint32Sint32Entry.JsonMapper =
    TestAllTypesProto3.MapSint32Sint32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapSint32Sint32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapSint32Sint32Entry =
    TestAllTypesProto3.MapSint32Sint32Entry(
        key = key ?: 0,
        value = value ?: 0
    )

private fun TestAllTypesProto3.MapSint32Sint32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapSint32Sint32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapSint32Sint32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapSint32Sint32Entry {
    val mapper = json.parse(TestAllTypesProto3.MapSint32Sint32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapSint64Sint64Entry?.orDefault() = this ?: TestAllTypesProto3.MapSint64Sint64Entry.defaultInstance

private fun TestAllTypesProto3.MapSint64Sint64Entry.protoMergeImpl(plus: TestAllTypesProto3.MapSint64Sint64Entry?): TestAllTypesProto3.MapSint64Sint64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapSint64Sint64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sInt64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapSint64Sint64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(8).writeSInt64(key)
    if (value != 0L) protoMarshal.writeTag(16).writeSInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapSint64Sint64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapSint64Sint64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapSint64Sint64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readSInt64()
        16 -> value = protoUnmarshal.readSInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapSint64Sint64Entry.toJsonMapperImpl(): TestAllTypesProto3.MapSint64Sint64Entry.JsonMapper =
    TestAllTypesProto3.MapSint64Sint64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapSint64Sint64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapSint64Sint64Entry =
    TestAllTypesProto3.MapSint64Sint64Entry(
        key = key ?: 0L,
        value = value ?: 0L
    )

private fun TestAllTypesProto3.MapSint64Sint64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapSint64Sint64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapSint64Sint64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapSint64Sint64Entry {
    val mapper = json.parse(TestAllTypesProto3.MapSint64Sint64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapFixed32Fixed32Entry?.orDefault() = this ?: TestAllTypesProto3.MapFixed32Fixed32Entry.defaultInstance

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.protoMergeImpl(plus: TestAllTypesProto3.MapFixed32Fixed32Entry?): TestAllTypesProto3.MapFixed32Fixed32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.fixed32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.fixed32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(13).writeFixed32(key)
    if (value != 0) protoMarshal.writeTag(21).writeFixed32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapFixed32Fixed32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapFixed32Fixed32Entry(key, value, protoUnmarshal.unknownFields())
        13 -> key = protoUnmarshal.readFixed32()
        21 -> value = protoUnmarshal.readFixed32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.toJsonMapperImpl(): TestAllTypesProto3.MapFixed32Fixed32Entry.JsonMapper =
    TestAllTypesProto3.MapFixed32Fixed32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapFixed32Fixed32Entry =
    TestAllTypesProto3.MapFixed32Fixed32Entry(
        key = key ?: 0,
        value = value ?: 0
    )

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapFixed32Fixed32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapFixed32Fixed32Entry {
    val mapper = json.parse(TestAllTypesProto3.MapFixed32Fixed32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapFixed64Fixed64Entry?.orDefault() = this ?: TestAllTypesProto3.MapFixed64Fixed64Entry.defaultInstance

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.protoMergeImpl(plus: TestAllTypesProto3.MapFixed64Fixed64Entry?): TestAllTypesProto3.MapFixed64Fixed64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.fixed64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.fixed64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(9).writeFixed64(key)
    if (value != 0L) protoMarshal.writeTag(17).writeFixed64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapFixed64Fixed64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapFixed64Fixed64Entry(key, value, protoUnmarshal.unknownFields())
        9 -> key = protoUnmarshal.readFixed64()
        17 -> value = protoUnmarshal.readFixed64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.toJsonMapperImpl(): TestAllTypesProto3.MapFixed64Fixed64Entry.JsonMapper =
    TestAllTypesProto3.MapFixed64Fixed64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapFixed64Fixed64Entry =
    TestAllTypesProto3.MapFixed64Fixed64Entry(
        key = key ?: 0L,
        value = value ?: 0L
    )

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapFixed64Fixed64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapFixed64Fixed64Entry {
    val mapper = json.parse(TestAllTypesProto3.MapFixed64Fixed64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapSfixed32Sfixed32Entry?.orDefault() = this ?: TestAllTypesProto3.MapSfixed32Sfixed32Entry.defaultInstance

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.protoMergeImpl(plus: TestAllTypesProto3.MapSfixed32Sfixed32Entry?): TestAllTypesProto3.MapSfixed32Sfixed32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sFixed32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sFixed32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(13).writeSFixed32(key)
    if (value != 0) protoMarshal.writeTag(21).writeSFixed32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapSfixed32Sfixed32Entry(key, value, protoUnmarshal.unknownFields())
        13 -> key = protoUnmarshal.readSFixed32()
        21 -> value = protoUnmarshal.readSFixed32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.toJsonMapperImpl(): TestAllTypesProto3.MapSfixed32Sfixed32Entry.JsonMapper =
    TestAllTypesProto3.MapSfixed32Sfixed32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapSfixed32Sfixed32Entry =
    TestAllTypesProto3.MapSfixed32Sfixed32Entry(
        key = key ?: 0,
        value = value ?: 0
    )

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapSfixed32Sfixed32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    val mapper = json.parse(TestAllTypesProto3.MapSfixed32Sfixed32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapSfixed64Sfixed64Entry?.orDefault() = this ?: TestAllTypesProto3.MapSfixed64Sfixed64Entry.defaultInstance

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.protoMergeImpl(plus: TestAllTypesProto3.MapSfixed64Sfixed64Entry?): TestAllTypesProto3.MapSfixed64Sfixed64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sFixed64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sFixed64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(9).writeSFixed64(key)
    if (value != 0L) protoMarshal.writeTag(17).writeSFixed64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapSfixed64Sfixed64Entry(key, value, protoUnmarshal.unknownFields())
        9 -> key = protoUnmarshal.readSFixed64()
        17 -> value = protoUnmarshal.readSFixed64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.toJsonMapperImpl(): TestAllTypesProto3.MapSfixed64Sfixed64Entry.JsonMapper =
    TestAllTypesProto3.MapSfixed64Sfixed64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapSfixed64Sfixed64Entry =
    TestAllTypesProto3.MapSfixed64Sfixed64Entry(
        key = key ?: 0L,
        value = value ?: 0L
    )

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapSfixed64Sfixed64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    val mapper = json.parse(TestAllTypesProto3.MapSfixed64Sfixed64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapInt32FloatEntry?.orDefault() = this ?: TestAllTypesProto3.MapInt32FloatEntry.defaultInstance

private fun TestAllTypesProto3.MapInt32FloatEntry.protoMergeImpl(plus: TestAllTypesProto3.MapInt32FloatEntry?): TestAllTypesProto3.MapInt32FloatEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapInt32FloatEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != 0.0F) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.floatSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapInt32FloatEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeInt32(key)
    if (value != 0.0F) protoMarshal.writeTag(21).writeFloat(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapInt32FloatEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapInt32FloatEntry {
    var key = 0
    var value = 0.0F
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapInt32FloatEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        21 -> value = protoUnmarshal.readFloat()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapInt32FloatEntry.toJsonMapperImpl(): TestAllTypesProto3.MapInt32FloatEntry.JsonMapper =
    TestAllTypesProto3.MapInt32FloatEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapInt32FloatEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapInt32FloatEntry =
    TestAllTypesProto3.MapInt32FloatEntry(
        key = key ?: 0,
        value = value ?: 0.0F
    )

private fun TestAllTypesProto3.MapInt32FloatEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapInt32FloatEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapInt32FloatEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapInt32FloatEntry {
    val mapper = json.parse(TestAllTypesProto3.MapInt32FloatEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapInt32DoubleEntry?.orDefault() = this ?: TestAllTypesProto3.MapInt32DoubleEntry.defaultInstance

private fun TestAllTypesProto3.MapInt32DoubleEntry.protoMergeImpl(plus: TestAllTypesProto3.MapInt32DoubleEntry?): TestAllTypesProto3.MapInt32DoubleEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapInt32DoubleEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != 0.0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.doubleSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapInt32DoubleEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeInt32(key)
    if (value != 0.0) protoMarshal.writeTag(17).writeDouble(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapInt32DoubleEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapInt32DoubleEntry {
    var key = 0
    var value = 0.0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapInt32DoubleEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        17 -> value = protoUnmarshal.readDouble()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapInt32DoubleEntry.toJsonMapperImpl(): TestAllTypesProto3.MapInt32DoubleEntry.JsonMapper =
    TestAllTypesProto3.MapInt32DoubleEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapInt32DoubleEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapInt32DoubleEntry =
    TestAllTypesProto3.MapInt32DoubleEntry(
        key = key ?: 0,
        value = value ?: 0.0
    )

private fun TestAllTypesProto3.MapInt32DoubleEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapInt32DoubleEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapInt32DoubleEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapInt32DoubleEntry {
    val mapper = json.parse(TestAllTypesProto3.MapInt32DoubleEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapBoolBoolEntry?.orDefault() = this ?: TestAllTypesProto3.MapBoolBoolEntry.defaultInstance

private fun TestAllTypesProto3.MapBoolBoolEntry.protoMergeImpl(plus: TestAllTypesProto3.MapBoolBoolEntry?): TestAllTypesProto3.MapBoolBoolEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapBoolBoolEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(key)
    if (value) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapBoolBoolEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key) protoMarshal.writeTag(8).writeBool(key)
    if (value) protoMarshal.writeTag(16).writeBool(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapBoolBoolEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapBoolBoolEntry {
    var key = false
    var value = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapBoolBoolEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readBool()
        16 -> value = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapBoolBoolEntry.toJsonMapperImpl(): TestAllTypesProto3.MapBoolBoolEntry.JsonMapper =
    TestAllTypesProto3.MapBoolBoolEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto3.MapBoolBoolEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapBoolBoolEntry =
    TestAllTypesProto3.MapBoolBoolEntry(
        key = key ?: false,
        value = value ?: false
    )

private fun TestAllTypesProto3.MapBoolBoolEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapBoolBoolEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapBoolBoolEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapBoolBoolEntry {
    val mapper = json.parse(TestAllTypesProto3.MapBoolBoolEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapStringStringEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringStringEntry.defaultInstance

private fun TestAllTypesProto3.MapStringStringEntry.protoMergeImpl(plus: TestAllTypesProto3.MapStringStringEntry?): TestAllTypesProto3.MapStringStringEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapStringStringEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapStringStringEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.isNotEmpty()) protoMarshal.writeTag(18).writeString(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapStringStringEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapStringStringEntry {
    var key = ""
    var value = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapStringStringEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapStringStringEntry.toJsonMapperImpl(): TestAllTypesProto3.MapStringStringEntry.JsonMapper =
    TestAllTypesProto3.MapStringStringEntry.JsonMapper(
        key.takeIf { it != "" },
        value.takeIf { it != "" }
    )

private fun TestAllTypesProto3.MapStringStringEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapStringStringEntry =
    TestAllTypesProto3.MapStringStringEntry(
        key = key ?: "",
        value = value ?: ""
    )

private fun TestAllTypesProto3.MapStringStringEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapStringStringEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapStringStringEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapStringStringEntry {
    val mapper = json.parse(TestAllTypesProto3.MapStringStringEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapStringBytesEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringBytesEntry.defaultInstance

private fun TestAllTypesProto3.MapStringBytesEntry.protoMergeImpl(plus: TestAllTypesProto3.MapStringBytesEntry?): TestAllTypesProto3.MapStringBytesEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapStringBytesEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapStringBytesEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.array.isNotEmpty()) protoMarshal.writeTag(18).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapStringBytesEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapStringBytesEntry {
    var key = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapStringBytesEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapStringBytesEntry.toJsonMapperImpl(): TestAllTypesProto3.MapStringBytesEntry.JsonMapper =
    TestAllTypesProto3.MapStringBytesEntry.JsonMapper(
        key.takeIf { it != "" },
        value
    )

private fun TestAllTypesProto3.MapStringBytesEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapStringBytesEntry =
    TestAllTypesProto3.MapStringBytesEntry(
        key = key ?: "",
        value = value ?: pbandk.ByteArr.empty
    )

private fun TestAllTypesProto3.MapStringBytesEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapStringBytesEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapStringBytesEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapStringBytesEntry {
    val mapper = json.parse(TestAllTypesProto3.MapStringBytesEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapStringNestedMessageEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringNestedMessageEntry.defaultInstance

private fun TestAllTypesProto3.MapStringNestedMessageEntry.protoMergeImpl(plus: TestAllTypesProto3.MapStringNestedMessageEntry?): TestAllTypesProto3.MapStringNestedMessageEntry = plus?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapStringNestedMessageEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapStringNestedMessageEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapStringNestedMessageEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapStringNestedMessageEntry {
    var key = ""
    var value: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapStringNestedMessageEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapStringNestedMessageEntry.toJsonMapperImpl(): TestAllTypesProto3.MapStringNestedMessageEntry.JsonMapper =
    TestAllTypesProto3.MapStringNestedMessageEntry.JsonMapper(
        key.takeIf { it != "" },
        value?.toJsonMapper()
    )

private fun TestAllTypesProto3.MapStringNestedMessageEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapStringNestedMessageEntry =
    TestAllTypesProto3.MapStringNestedMessageEntry(
        key = key ?: "",
        value = value?.toMessage()
    )

private fun TestAllTypesProto3.MapStringNestedMessageEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapStringNestedMessageEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapStringNestedMessageEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapStringNestedMessageEntry {
    val mapper = json.parse(TestAllTypesProto3.MapStringNestedMessageEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapStringForeignMessageEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringForeignMessageEntry.defaultInstance

private fun TestAllTypesProto3.MapStringForeignMessageEntry.protoMergeImpl(plus: TestAllTypesProto3.MapStringForeignMessageEntry?): TestAllTypesProto3.MapStringForeignMessageEntry = plus?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapStringForeignMessageEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapStringForeignMessageEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapStringForeignMessageEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapStringForeignMessageEntry {
    var key = ""
    var value: pbandk.conformance.pb.ForeignMessage? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapStringForeignMessageEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.conformance.pb.ForeignMessage.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapStringForeignMessageEntry.toJsonMapperImpl(): TestAllTypesProto3.MapStringForeignMessageEntry.JsonMapper =
    TestAllTypesProto3.MapStringForeignMessageEntry.JsonMapper(
        key.takeIf { it != "" },
        value?.toJsonMapper()
    )

private fun TestAllTypesProto3.MapStringForeignMessageEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapStringForeignMessageEntry =
    TestAllTypesProto3.MapStringForeignMessageEntry(
        key = key ?: "",
        value = value?.toMessage()
    )

private fun TestAllTypesProto3.MapStringForeignMessageEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapStringForeignMessageEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapStringForeignMessageEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapStringForeignMessageEntry {
    val mapper = json.parse(TestAllTypesProto3.MapStringForeignMessageEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapStringNestedEnumEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringNestedEnumEntry.defaultInstance

private fun TestAllTypesProto3.MapStringNestedEnumEntry.protoMergeImpl(plus: TestAllTypesProto3.MapStringNestedEnumEntry?): TestAllTypesProto3.MapStringNestedEnumEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapStringNestedEnumEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapStringNestedEnumEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.value != 0) protoMarshal.writeTag(16).writeEnum(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapStringNestedEnumEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapStringNestedEnumEntry {
    var key = ""
    var value: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapStringNestedEnumEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        16 -> value = protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapStringNestedEnumEntry.toJsonMapperImpl(): TestAllTypesProto3.MapStringNestedEnumEntry.JsonMapper =
    TestAllTypesProto3.MapStringNestedEnumEntry.JsonMapper(
        key.takeIf { it != "" },
        value?.name
    )

private fun TestAllTypesProto3.MapStringNestedEnumEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapStringNestedEnumEntry =
    TestAllTypesProto3.MapStringNestedEnumEntry(
        key = key ?: "",
        value = value?.let { pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromName(it) } ?: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)
    )

private fun TestAllTypesProto3.MapStringNestedEnumEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapStringNestedEnumEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapStringNestedEnumEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapStringNestedEnumEntry {
    val mapper = json.parse(TestAllTypesProto3.MapStringNestedEnumEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto3.MapStringForeignEnumEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringForeignEnumEntry.defaultInstance

private fun TestAllTypesProto3.MapStringForeignEnumEntry.protoMergeImpl(plus: TestAllTypesProto3.MapStringForeignEnumEntry?): TestAllTypesProto3.MapStringForeignEnumEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto3.MapStringForeignEnumEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto3.MapStringForeignEnumEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.value != 0) protoMarshal.writeTag(16).writeEnum(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto3.MapStringForeignEnumEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto3.MapStringForeignEnumEntry {
    var key = ""
    var value: pbandk.conformance.pb.ForeignEnum = pbandk.conformance.pb.ForeignEnum.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3.MapStringForeignEnumEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        16 -> value = protoUnmarshal.readEnum(pbandk.conformance.pb.ForeignEnum.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto3.MapStringForeignEnumEntry.toJsonMapperImpl(): TestAllTypesProto3.MapStringForeignEnumEntry.JsonMapper =
    TestAllTypesProto3.MapStringForeignEnumEntry.JsonMapper(
        key.takeIf { it != "" },
        value?.name
    )

private fun TestAllTypesProto3.MapStringForeignEnumEntry.JsonMapper.toMessageImpl(): TestAllTypesProto3.MapStringForeignEnumEntry =
    TestAllTypesProto3.MapStringForeignEnumEntry(
        key = key ?: "",
        value = value?.let { pbandk.conformance.pb.ForeignEnum.fromName(it) } ?: pbandk.conformance.pb.ForeignEnum.fromValue(0)
    )

private fun TestAllTypesProto3.MapStringForeignEnumEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto3.MapStringForeignEnumEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto3.MapStringForeignEnumEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto3.MapStringForeignEnumEntry {
    val mapper = json.parse(TestAllTypesProto3.MapStringForeignEnumEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ForeignMessage?.orDefault() = this ?: ForeignMessage.defaultInstance

private fun ForeignMessage.protoMergeImpl(plus: ForeignMessage?): ForeignMessage = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ForeignMessage.protoSizeImpl(): Int {
    var protoSize = 0
    if (c != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(c)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ForeignMessage.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (c != 0) protoMarshal.writeTag(8).writeInt32(c)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ForeignMessage.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ForeignMessage {
    var c = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ForeignMessage(c, protoUnmarshal.unknownFields())
        8 -> c = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun ForeignMessage.toJsonMapperImpl(): ForeignMessage.JsonMapper =
    ForeignMessage.JsonMapper(
        c
    )

private fun ForeignMessage.JsonMapper.toMessageImpl(): ForeignMessage =
    ForeignMessage(
        c = c ?: 0
    )

private fun ForeignMessage.jsonMarshalImpl(json: Json): String =
    json.stringify(ForeignMessage.JsonMapper.serializer(), toJsonMapper())

private fun ForeignMessage.Companion.jsonUnmarshalImpl(json: Json, data: String): ForeignMessage {
    val mapper = json.parse(ForeignMessage.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

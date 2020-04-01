@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.conformance.pb

import kotlinx.serialization.*
import kotlinx.serialization.json.*

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
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<TestAllTypesProto2> {
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

    override operator fun plus(other: TestAllTypesProto2?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<TestAllTypesProto2> {
        val defaultInstance by lazy { TestAllTypesProto2() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = TestAllTypesProto2.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = TestAllTypesProto2.jsonUnmarshalImpl(json, data)
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
        val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.JsonMapper? = null,
        @SerialName("optional_foreign_message")
        val optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2.JsonMapper? = null,
        @SerialName("optional_nested_enum")
        val optionalNestedEnum: String? = null,
        @SerialName("optional_foreign_enum")
        val optionalForeignEnum: String? = null,
        @SerialName("optional_string_piece")
        val optionalStringPiece: String? = null,
        @SerialName("optional_cord")
        val optionalCord: String? = null,
        @SerialName("recursive_message")
        val recursiveMessage: pbandk.conformance.pb.TestAllTypesProto2.JsonMapper? = null,
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
        val repeatedNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.JsonMapper> = emptyList(),
        @SerialName("repeated_foreign_message")
        val repeatedForeignMessage: List<pbandk.conformance.pb.ForeignMessageProto2.JsonMapper> = emptyList(),
        @SerialName("repeated_nested_enum")
        val repeatedNestedEnum: List<String> = emptyList(),
        @SerialName("repeated_foreign_enum")
        val repeatedForeignEnum: List<String> = emptyList(),
        @SerialName("repeated_string_piece")
        val repeatedStringPiece: List<String> = emptyList(),
        @SerialName("repeated_cord")
        val repeatedCord: List<String> = emptyList(),
        @SerialName("map_int32_int32")
        val mapInt32Int32: Map<Int?, Int?> = emptyMap(),
        @SerialName("map_int64_int64")
        val mapInt64Int64: Map<Long?, Long?> = emptyMap(),
        @SerialName("map_uint32_uint32")
        val mapUint32Uint32: Map<Int?, Int?> = emptyMap(),
        @SerialName("map_uint64_uint64")
        val mapUint64Uint64: Map<Long?, Long?> = emptyMap(),
        @SerialName("map_sint32_sint32")
        val mapSint32Sint32: Map<Int?, Int?> = emptyMap(),
        @SerialName("map_sint64_sint64")
        val mapSint64Sint64: Map<Long?, Long?> = emptyMap(),
        @SerialName("map_fixed32_fixed32")
        val mapFixed32Fixed32: Map<Int?, Int?> = emptyMap(),
        @SerialName("map_fixed64_fixed64")
        val mapFixed64Fixed64: Map<Long?, Long?> = emptyMap(),
        @SerialName("map_sfixed32_sfixed32")
        val mapSfixed32Sfixed32: Map<Int?, Int?> = emptyMap(),
        @SerialName("map_sfixed64_sfixed64")
        val mapSfixed64Sfixed64: Map<Long?, Long?> = emptyMap(),
        @SerialName("map_int32_float")
        val mapInt32Float: Map<Int?, Float?> = emptyMap(),
        @SerialName("map_int32_double")
        val mapInt32Double: Map<Int?, Double?> = emptyMap(),
        @SerialName("map_bool_bool")
        val mapBoolBool: Map<Boolean?, Boolean?> = emptyMap(),
        @SerialName("map_string_string")
        val mapStringString: Map<String?, String?> = emptyMap(),
        @SerialName("map_string_bytes")
        val mapStringBytes: Map<String?, pbandk.ByteArr?> = emptyMap(),
        @SerialName("map_string_nested_message")
        val mapStringNestedMessage: Map<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.JsonMapper?> = emptyMap(),
        @SerialName("map_string_foreign_message")
        val mapStringForeignMessage: Map<String?, pbandk.conformance.pb.ForeignMessageProto2.JsonMapper?> = emptyMap(),
        @SerialName("map_string_nested_enum")
        val mapStringNestedEnum: Map<String?, String?> = emptyMap(),
        @SerialName("map_string_foreign_enum")
        val mapStringForeignEnum: Map<String?, String?> = emptyMap(),
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
        val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.JsonMapper? = null,
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

    data class NestedMessage(
        val a: Int? = null,
        val corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null,
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
            val corecursive: pbandk.conformance.pb.TestAllTypesProto2.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapInt32Int32Entry(
        override val key: Int? = null,
        override val value: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32Int32Entry>, Map.Entry<Int?, Int?> {
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
        override val key: Long? = null,
        override val value: Long? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt64Int64Entry>, Map.Entry<Long?, Long?> {
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
        override val key: Int? = null,
        override val value: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapUint32Uint32Entry>, Map.Entry<Int?, Int?> {
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
        override val key: Long? = null,
        override val value: Long? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapUint64Uint64Entry>, Map.Entry<Long?, Long?> {
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
        override val key: Int? = null,
        override val value: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSint32Sint32Entry>, Map.Entry<Int?, Int?> {
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
        override val key: Long? = null,
        override val value: Long? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSint64Sint64Entry>, Map.Entry<Long?, Long?> {
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
        override val key: Int? = null,
        override val value: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapFixed32Fixed32Entry>, Map.Entry<Int?, Int?> {
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
        override val key: Long? = null,
        override val value: Long? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapFixed64Fixed64Entry>, Map.Entry<Long?, Long?> {
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
        override val key: Int? = null,
        override val value: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSfixed32Sfixed32Entry>, Map.Entry<Int?, Int?> {
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
        override val key: Long? = null,
        override val value: Long? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSfixed64Sfixed64Entry>, Map.Entry<Long?, Long?> {
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
        override val key: Int? = null,
        override val value: Float? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32FloatEntry>, Map.Entry<Int?, Float?> {
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
        override val key: Int? = null,
        override val value: Double? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32DoubleEntry>, Map.Entry<Int?, Double?> {
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
        override val key: Boolean? = null,
        override val value: Boolean? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapBoolBoolEntry>, Map.Entry<Boolean?, Boolean?> {
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
        override val key: String? = null,
        override val value: String? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringStringEntry>, Map.Entry<String?, String?> {
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
        override val key: String? = null,
        override val value: pbandk.ByteArr? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringBytesEntry>, Map.Entry<String?, pbandk.ByteArr?> {
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
        override val key: String? = null,
        override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringNestedMessageEntry>, Map.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage?> {
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
            val value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringForeignMessageEntry(
        override val key: String? = null,
        override val value: pbandk.conformance.pb.ForeignMessageProto2? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringForeignMessageEntry>, Map.Entry<String?, pbandk.conformance.pb.ForeignMessageProto2?> {
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
            val value: pbandk.conformance.pb.ForeignMessageProto2.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MapStringNestedEnumEntry(
        override val key: String? = null,
        override val value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringNestedEnumEntry>, Map.Entry<String?, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?> {
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
        override val key: String? = null,
        override val value: pbandk.conformance.pb.ForeignEnumProto2? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringForeignEnumEntry>, Map.Entry<String?, pbandk.conformance.pb.ForeignEnumProto2?> {
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

    data class Data(
        val groupInt32: Int? = null,
        val groupUint32: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<Data> {
        override operator fun plus(other: Data?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<Data> {
            val defaultInstance by lazy { Data() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = Data.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = Data.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("group_int32")
            val groupInt32: Int? = null,
            @SerialName("group_uint32")
            val groupUint32: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MessageSetCorrect(
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MessageSetCorrect> {
        override operator fun plus(other: MessageSetCorrect?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MessageSetCorrect> {
            val defaultInstance by lazy { MessageSetCorrect() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageSetCorrect.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MessageSetCorrect.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        class JsonMapper {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MessageSetCorrectExtension1(
        val str: String? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MessageSetCorrectExtension1> {
        override operator fun plus(other: MessageSetCorrectExtension1?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MessageSetCorrectExtension1> {
            val defaultInstance by lazy { MessageSetCorrectExtension1() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageSetCorrectExtension1.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MessageSetCorrectExtension1.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("str")
            val str: String? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class MessageSetCorrectExtension2(
        val i: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MessageSetCorrectExtension2> {
        override operator fun plus(other: MessageSetCorrectExtension2?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<MessageSetCorrectExtension2> {
            val defaultInstance by lazy { MessageSetCorrectExtension2() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageSetCorrectExtension2.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = MessageSetCorrectExtension2.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("i")
            val i: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class ForeignMessageProto2(
    val c: Int? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ForeignMessageProto2> {
    override operator fun plus(other: ForeignMessageProto2?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ForeignMessageProto2> {
        val defaultInstance by lazy { ForeignMessageProto2() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ForeignMessageProto2.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ForeignMessageProto2.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("c")
        val c: Int? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class UnknownToTestAllTypes(
    val optionalInt32: Int? = null,
    val optionalString: String? = null,
    val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
    val optionalBool: Boolean? = null,
    val repeatedInt32: List<Int> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<UnknownToTestAllTypes> {
    override operator fun plus(other: UnknownToTestAllTypes?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<UnknownToTestAllTypes> {
        val defaultInstance by lazy { UnknownToTestAllTypes() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UnknownToTestAllTypes.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = UnknownToTestAllTypes.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("optional_int32")
        val optionalInt32: Int? = null,
        @SerialName("optional_string")
        val optionalString: String? = null,
        @SerialName("nested_message")
        val nestedMessage: pbandk.conformance.pb.ForeignMessageProto2.JsonMapper? = null,
        @SerialName("optional_bool")
        val optionalBool: Boolean? = null,
        @SerialName("repeated_int32")
        val repeatedInt32: List<Int> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class OptionalGroup(
        val a: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<OptionalGroup> {
        override operator fun plus(other: OptionalGroup?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<OptionalGroup> {
            val defaultInstance by lazy { OptionalGroup() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = OptionalGroup.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = OptionalGroup.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("a")
            val a: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

fun TestAllTypesProto2?.orDefault() = this ?: TestAllTypesProto2.defaultInstance

private fun TestAllTypesProto2.protoMergeImpl(plus: TestAllTypesProto2?): TestAllTypesProto2 = plus?.copy(
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

private fun TestAllTypesProto2.protoSizeImpl(): Int {
    var protoSize = 0
    if (optionalInt32 != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(optionalInt32)
    if (optionalInt64 != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int64Size(optionalInt64)
    if (optionalUint32 != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.uInt32Size(optionalUint32)
    if (optionalUint64 != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.uInt64Size(optionalUint64)
    if (optionalSint32 != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.sInt32Size(optionalSint32)
    if (optionalSint64 != null) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.sInt64Size(optionalSint64)
    if (optionalFixed32 != null) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.fixed32Size(optionalFixed32)
    if (optionalFixed64 != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.fixed64Size(optionalFixed64)
    if (optionalSfixed32 != null) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.sFixed32Size(optionalSfixed32)
    if (optionalSfixed64 != null) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.sFixed64Size(optionalSfixed64)
    if (optionalFloat != null) protoSize += pbandk.Sizer.tagSize(11) + pbandk.Sizer.floatSize(optionalFloat)
    if (optionalDouble != null) protoSize += pbandk.Sizer.tagSize(12) + pbandk.Sizer.doubleSize(optionalDouble)
    if (optionalBool != null) protoSize += pbandk.Sizer.tagSize(13) + pbandk.Sizer.boolSize(optionalBool)
    if (optionalString != null) protoSize += pbandk.Sizer.tagSize(14) + pbandk.Sizer.stringSize(optionalString)
    if (optionalBytes != null) protoSize += pbandk.Sizer.tagSize(15) + pbandk.Sizer.bytesSize(optionalBytes)
    if (optionalNestedMessage != null) protoSize += pbandk.Sizer.tagSize(18) + pbandk.Sizer.messageSize(optionalNestedMessage)
    if (optionalForeignMessage != null) protoSize += pbandk.Sizer.tagSize(19) + pbandk.Sizer.messageSize(optionalForeignMessage)
    if (optionalNestedEnum != null) protoSize += pbandk.Sizer.tagSize(21) + pbandk.Sizer.enumSize(optionalNestedEnum)
    if (optionalForeignEnum != null) protoSize += pbandk.Sizer.tagSize(22) + pbandk.Sizer.enumSize(optionalForeignEnum)
    if (optionalStringPiece != null) protoSize += pbandk.Sizer.tagSize(24) + pbandk.Sizer.stringSize(optionalStringPiece)
    if (optionalCord != null) protoSize += pbandk.Sizer.tagSize(25) + pbandk.Sizer.stringSize(optionalCord)
    if (recursiveMessage != null) protoSize += pbandk.Sizer.tagSize(27) + pbandk.Sizer.messageSize(recursiveMessage)
    if (repeatedInt32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(31) * repeatedInt32.size) + repeatedInt32.sumBy(pbandk.Sizer::int32Size)
    if (repeatedInt64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(32) * repeatedInt64.size) + repeatedInt64.sumBy(pbandk.Sizer::int64Size)
    if (repeatedUint32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(33) * repeatedUint32.size) + repeatedUint32.sumBy(pbandk.Sizer::uInt32Size)
    if (repeatedUint64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(34) * repeatedUint64.size) + repeatedUint64.sumBy(pbandk.Sizer::uInt64Size)
    if (repeatedSint32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(35) * repeatedSint32.size) + repeatedSint32.sumBy(pbandk.Sizer::sInt32Size)
    if (repeatedSint64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(36) * repeatedSint64.size) + repeatedSint64.sumBy(pbandk.Sizer::sInt64Size)
    if (repeatedFixed32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(37) * repeatedFixed32.size) + repeatedFixed32.sumBy(pbandk.Sizer::fixed32Size)
    if (repeatedFixed64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(38) * repeatedFixed64.size) + repeatedFixed64.sumBy(pbandk.Sizer::fixed64Size)
    if (repeatedSfixed32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(39) * repeatedSfixed32.size) + repeatedSfixed32.sumBy(pbandk.Sizer::sFixed32Size)
    if (repeatedSfixed64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(40) * repeatedSfixed64.size) + repeatedSfixed64.sumBy(pbandk.Sizer::sFixed64Size)
    if (repeatedFloat.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(41) * repeatedFloat.size) + repeatedFloat.sumBy(pbandk.Sizer::floatSize)
    if (repeatedDouble.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(42) * repeatedDouble.size) + repeatedDouble.sumBy(pbandk.Sizer::doubleSize)
    if (repeatedBool.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(43) * repeatedBool.size) + repeatedBool.sumBy(pbandk.Sizer::boolSize)
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
    if (unpackedInt32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(89) * unpackedInt32.size) + unpackedInt32.sumBy(pbandk.Sizer::int32Size)
    if (unpackedInt64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(90) * unpackedInt64.size) + unpackedInt64.sumBy(pbandk.Sizer::int64Size)
    if (unpackedUint32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(91) * unpackedUint32.size) + unpackedUint32.sumBy(pbandk.Sizer::uInt32Size)
    if (unpackedUint64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(92) * unpackedUint64.size) + unpackedUint64.sumBy(pbandk.Sizer::uInt64Size)
    if (unpackedSint32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(93) * unpackedSint32.size) + unpackedSint32.sumBy(pbandk.Sizer::sInt32Size)
    if (unpackedSint64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(94) * unpackedSint64.size) + unpackedSint64.sumBy(pbandk.Sizer::sInt64Size)
    if (unpackedFixed32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(95) * unpackedFixed32.size) + unpackedFixed32.sumBy(pbandk.Sizer::fixed32Size)
    if (unpackedFixed64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(96) * unpackedFixed64.size) + unpackedFixed64.sumBy(pbandk.Sizer::fixed64Size)
    if (unpackedSfixed32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(97) * unpackedSfixed32.size) + unpackedSfixed32.sumBy(pbandk.Sizer::sFixed32Size)
    if (unpackedSfixed64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(98) * unpackedSfixed64.size) + unpackedSfixed64.sumBy(pbandk.Sizer::sFixed64Size)
    if (unpackedFloat.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(99) * unpackedFloat.size) + unpackedFloat.sumBy(pbandk.Sizer::floatSize)
    if (unpackedDouble.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(100) * unpackedDouble.size) + unpackedDouble.sumBy(pbandk.Sizer::doubleSize)
    if (unpackedBool.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(101) * unpackedBool.size) + unpackedBool.sumBy(pbandk.Sizer::boolSize)
    if (unpackedNestedEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(102) * unpackedNestedEnum.size) + unpackedNestedEnum.sumBy(pbandk.Sizer::enumSize)
    if (mapInt32Int32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(56, mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto2::MapInt32Int32Entry)
    if (mapInt64Int64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(57, mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto2::MapInt64Int64Entry)
    if (mapUint32Uint32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(58, mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto2::MapUint32Uint32Entry)
    if (mapUint64Uint64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(59, mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto2::MapUint64Uint64Entry)
    if (mapSint32Sint32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(60, mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto2::MapSint32Sint32Entry)
    if (mapSint64Sint64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(61, mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto2::MapSint64Sint64Entry)
    if (mapFixed32Fixed32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(62, mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto2::MapFixed32Fixed32Entry)
    if (mapFixed64Fixed64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(63, mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto2::MapFixed64Fixed64Entry)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(64, mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto2::MapSfixed32Sfixed32Entry)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(65, mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto2::MapSfixed64Sfixed64Entry)
    if (mapInt32Float.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(66, mapInt32Float, pbandk.conformance.pb.TestAllTypesProto2::MapInt32FloatEntry)
    if (mapInt32Double.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(67, mapInt32Double, pbandk.conformance.pb.TestAllTypesProto2::MapInt32DoubleEntry)
    if (mapBoolBool.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(68, mapBoolBool, pbandk.conformance.pb.TestAllTypesProto2::MapBoolBoolEntry)
    if (mapStringString.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(69, mapStringString, pbandk.conformance.pb.TestAllTypesProto2::MapStringStringEntry)
    if (mapStringBytes.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(70, mapStringBytes, pbandk.conformance.pb.TestAllTypesProto2::MapStringBytesEntry)
    if (mapStringNestedMessage.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(71, mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto2::MapStringNestedMessageEntry)
    if (mapStringForeignMessage.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(72, mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto2::MapStringForeignMessageEntry)
    if (mapStringNestedEnum.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(73, mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto2::MapStringNestedEnumEntry)
    if (mapStringForeignEnum.isNotEmpty()) protoSize += pbandk.Sizer.mapSize(74, mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto2::MapStringForeignEnumEntry)
    if (fieldname1 != null) protoSize += pbandk.Sizer.tagSize(401) + pbandk.Sizer.int32Size(fieldname1)
    if (fieldName2 != null) protoSize += pbandk.Sizer.tagSize(402) + pbandk.Sizer.int32Size(fieldName2)
    if (fieldName3 != null) protoSize += pbandk.Sizer.tagSize(403) + pbandk.Sizer.int32Size(fieldName3)
    if (field_name4 != null) protoSize += pbandk.Sizer.tagSize(404) + pbandk.Sizer.int32Size(field_name4)
    if (field0name5 != null) protoSize += pbandk.Sizer.tagSize(405) + pbandk.Sizer.int32Size(field0name5)
    if (field0Name6 != null) protoSize += pbandk.Sizer.tagSize(406) + pbandk.Sizer.int32Size(field0Name6)
    if (fieldName7 != null) protoSize += pbandk.Sizer.tagSize(407) + pbandk.Sizer.int32Size(fieldName7)
    if (fieldName8 != null) protoSize += pbandk.Sizer.tagSize(408) + pbandk.Sizer.int32Size(fieldName8)
    if (fieldName9 != null) protoSize += pbandk.Sizer.tagSize(409) + pbandk.Sizer.int32Size(fieldName9)
    if (fieldName10 != null) protoSize += pbandk.Sizer.tagSize(410) + pbandk.Sizer.int32Size(fieldName10)
    if (fIELDNAME11 != null) protoSize += pbandk.Sizer.tagSize(411) + pbandk.Sizer.int32Size(fIELDNAME11)
    if (fIELDName12 != null) protoSize += pbandk.Sizer.tagSize(412) + pbandk.Sizer.int32Size(fIELDName12)
    if (_fieldName13 != null) protoSize += pbandk.Sizer.tagSize(413) + pbandk.Sizer.int32Size(_fieldName13)
    if (_FieldName14 != null) protoSize += pbandk.Sizer.tagSize(414) + pbandk.Sizer.int32Size(_FieldName14)
    if (field_name15 != null) protoSize += pbandk.Sizer.tagSize(415) + pbandk.Sizer.int32Size(field_name15)
    if (field_Name16 != null) protoSize += pbandk.Sizer.tagSize(416) + pbandk.Sizer.int32Size(field_Name16)
    if (fieldName17_ != null) protoSize += pbandk.Sizer.tagSize(417) + pbandk.Sizer.int32Size(fieldName17_)
    if (fieldName18_ != null) protoSize += pbandk.Sizer.tagSize(418) + pbandk.Sizer.int32Size(fieldName18_)
    when (oneofField) {
        is TestAllTypesProto2.OneofField.OneofUint32 -> protoSize += pbandk.Sizer.tagSize(111) + pbandk.Sizer.uInt32Size(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofNestedMessage -> protoSize += pbandk.Sizer.tagSize(112) + pbandk.Sizer.messageSize(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofString -> protoSize += pbandk.Sizer.tagSize(113) + pbandk.Sizer.stringSize(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofBytes -> protoSize += pbandk.Sizer.tagSize(114) + pbandk.Sizer.bytesSize(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofBool -> protoSize += pbandk.Sizer.tagSize(115) + pbandk.Sizer.boolSize(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofUint64 -> protoSize += pbandk.Sizer.tagSize(116) + pbandk.Sizer.uInt64Size(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofFloat -> protoSize += pbandk.Sizer.tagSize(117) + pbandk.Sizer.floatSize(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofDouble -> protoSize += pbandk.Sizer.tagSize(118) + pbandk.Sizer.doubleSize(oneofField.value)
        is TestAllTypesProto2.OneofField.OneofEnum -> protoSize += pbandk.Sizer.tagSize(119) + pbandk.Sizer.enumSize(oneofField.value)
    }
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (optionalInt32 != null) protoMarshal.writeTag(8).writeInt32(optionalInt32)
    if (optionalInt64 != null) protoMarshal.writeTag(16).writeInt64(optionalInt64)
    if (optionalUint32 != null) protoMarshal.writeTag(24).writeUInt32(optionalUint32)
    if (optionalUint64 != null) protoMarshal.writeTag(32).writeUInt64(optionalUint64)
    if (optionalSint32 != null) protoMarshal.writeTag(40).writeSInt32(optionalSint32)
    if (optionalSint64 != null) protoMarshal.writeTag(48).writeSInt64(optionalSint64)
    if (optionalFixed32 != null) protoMarshal.writeTag(61).writeFixed32(optionalFixed32)
    if (optionalFixed64 != null) protoMarshal.writeTag(65).writeFixed64(optionalFixed64)
    if (optionalSfixed32 != null) protoMarshal.writeTag(77).writeSFixed32(optionalSfixed32)
    if (optionalSfixed64 != null) protoMarshal.writeTag(81).writeSFixed64(optionalSfixed64)
    if (optionalFloat != null) protoMarshal.writeTag(93).writeFloat(optionalFloat)
    if (optionalDouble != null) protoMarshal.writeTag(97).writeDouble(optionalDouble)
    if (optionalBool != null) protoMarshal.writeTag(104).writeBool(optionalBool)
    if (optionalString != null) protoMarshal.writeTag(114).writeString(optionalString)
    if (optionalBytes != null) protoMarshal.writeTag(122).writeBytes(optionalBytes)
    if (optionalNestedMessage != null) protoMarshal.writeTag(146).writeMessage(optionalNestedMessage)
    if (optionalForeignMessage != null) protoMarshal.writeTag(154).writeMessage(optionalForeignMessage)
    if (optionalNestedEnum != null) protoMarshal.writeTag(168).writeEnum(optionalNestedEnum)
    if (optionalForeignEnum != null) protoMarshal.writeTag(176).writeEnum(optionalForeignEnum)
    if (optionalStringPiece != null) protoMarshal.writeTag(194).writeString(optionalStringPiece)
    if (optionalCord != null) protoMarshal.writeTag(202).writeString(optionalCord)
    if (recursiveMessage != null) protoMarshal.writeTag(218).writeMessage(recursiveMessage)
    if (repeatedInt32.isNotEmpty()) repeatedInt32.forEach { protoMarshal.writeTag(248).writeInt32(it) }
    if (repeatedInt64.isNotEmpty()) repeatedInt64.forEach { protoMarshal.writeTag(256).writeInt64(it) }
    if (repeatedUint32.isNotEmpty()) repeatedUint32.forEach { protoMarshal.writeTag(264).writeUInt32(it) }
    if (repeatedUint64.isNotEmpty()) repeatedUint64.forEach { protoMarshal.writeTag(272).writeUInt64(it) }
    if (repeatedSint32.isNotEmpty()) repeatedSint32.forEach { protoMarshal.writeTag(280).writeSInt32(it) }
    if (repeatedSint64.isNotEmpty()) repeatedSint64.forEach { protoMarshal.writeTag(288).writeSInt64(it) }
    if (repeatedFixed32.isNotEmpty()) repeatedFixed32.forEach { protoMarshal.writeTag(301).writeFixed32(it) }
    if (repeatedFixed64.isNotEmpty()) repeatedFixed64.forEach { protoMarshal.writeTag(305).writeFixed64(it) }
    if (repeatedSfixed32.isNotEmpty()) repeatedSfixed32.forEach { protoMarshal.writeTag(317).writeSFixed32(it) }
    if (repeatedSfixed64.isNotEmpty()) repeatedSfixed64.forEach { protoMarshal.writeTag(321).writeSFixed64(it) }
    if (repeatedFloat.isNotEmpty()) repeatedFloat.forEach { protoMarshal.writeTag(333).writeFloat(it) }
    if (repeatedDouble.isNotEmpty()) repeatedDouble.forEach { protoMarshal.writeTag(337).writeDouble(it) }
    if (repeatedBool.isNotEmpty()) repeatedBool.forEach { protoMarshal.writeTag(344).writeBool(it) }
    if (repeatedString.isNotEmpty()) repeatedString.forEach { protoMarshal.writeTag(354).writeString(it) }
    if (repeatedBytes.isNotEmpty()) repeatedBytes.forEach { protoMarshal.writeTag(362).writeBytes(it) }
    if (repeatedNestedMessage.isNotEmpty()) repeatedNestedMessage.forEach { protoMarshal.writeTag(386).writeMessage(it) }
    if (repeatedForeignMessage.isNotEmpty()) repeatedForeignMessage.forEach { protoMarshal.writeTag(394).writeMessage(it) }
    if (repeatedNestedEnum.isNotEmpty()) repeatedNestedEnum.forEach { protoMarshal.writeTag(408).writeEnum(it) }
    if (repeatedForeignEnum.isNotEmpty()) repeatedForeignEnum.forEach { protoMarshal.writeTag(416).writeEnum(it) }
    if (repeatedStringPiece.isNotEmpty()) repeatedStringPiece.forEach { protoMarshal.writeTag(434).writeString(it) }
    if (repeatedCord.isNotEmpty()) repeatedCord.forEach { protoMarshal.writeTag(442).writeString(it) }
    if (mapInt32Int32.isNotEmpty()) protoMarshal.writeMap(450, mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto2::MapInt32Int32Entry)
    if (mapInt64Int64.isNotEmpty()) protoMarshal.writeMap(458, mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto2::MapInt64Int64Entry)
    if (mapUint32Uint32.isNotEmpty()) protoMarshal.writeMap(466, mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto2::MapUint32Uint32Entry)
    if (mapUint64Uint64.isNotEmpty()) protoMarshal.writeMap(474, mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto2::MapUint64Uint64Entry)
    if (mapSint32Sint32.isNotEmpty()) protoMarshal.writeMap(482, mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto2::MapSint32Sint32Entry)
    if (mapSint64Sint64.isNotEmpty()) protoMarshal.writeMap(490, mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto2::MapSint64Sint64Entry)
    if (mapFixed32Fixed32.isNotEmpty()) protoMarshal.writeMap(498, mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto2::MapFixed32Fixed32Entry)
    if (mapFixed64Fixed64.isNotEmpty()) protoMarshal.writeMap(506, mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto2::MapFixed64Fixed64Entry)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoMarshal.writeMap(514, mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto2::MapSfixed32Sfixed32Entry)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoMarshal.writeMap(522, mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto2::MapSfixed64Sfixed64Entry)
    if (mapInt32Float.isNotEmpty()) protoMarshal.writeMap(530, mapInt32Float, pbandk.conformance.pb.TestAllTypesProto2::MapInt32FloatEntry)
    if (mapInt32Double.isNotEmpty()) protoMarshal.writeMap(538, mapInt32Double, pbandk.conformance.pb.TestAllTypesProto2::MapInt32DoubleEntry)
    if (mapBoolBool.isNotEmpty()) protoMarshal.writeMap(546, mapBoolBool, pbandk.conformance.pb.TestAllTypesProto2::MapBoolBoolEntry)
    if (mapStringString.isNotEmpty()) protoMarshal.writeMap(554, mapStringString, pbandk.conformance.pb.TestAllTypesProto2::MapStringStringEntry)
    if (mapStringBytes.isNotEmpty()) protoMarshal.writeMap(562, mapStringBytes, pbandk.conformance.pb.TestAllTypesProto2::MapStringBytesEntry)
    if (mapStringNestedMessage.isNotEmpty()) protoMarshal.writeMap(570, mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto2::MapStringNestedMessageEntry)
    if (mapStringForeignMessage.isNotEmpty()) protoMarshal.writeMap(578, mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto2::MapStringForeignMessageEntry)
    if (mapStringNestedEnum.isNotEmpty()) protoMarshal.writeMap(586, mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto2::MapStringNestedEnumEntry)
    if (mapStringForeignEnum.isNotEmpty()) protoMarshal.writeMap(594, mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto2::MapStringForeignEnumEntry)
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
    if (unpackedInt32.isNotEmpty()) unpackedInt32.forEach { protoMarshal.writeTag(712).writeInt32(it) }
    if (unpackedInt64.isNotEmpty()) unpackedInt64.forEach { protoMarshal.writeTag(720).writeInt64(it) }
    if (unpackedUint32.isNotEmpty()) unpackedUint32.forEach { protoMarshal.writeTag(728).writeUInt32(it) }
    if (unpackedUint64.isNotEmpty()) unpackedUint64.forEach { protoMarshal.writeTag(736).writeUInt64(it) }
    if (unpackedSint32.isNotEmpty()) unpackedSint32.forEach { protoMarshal.writeTag(744).writeSInt32(it) }
    if (unpackedSint64.isNotEmpty()) unpackedSint64.forEach { protoMarshal.writeTag(752).writeSInt64(it) }
    if (unpackedFixed32.isNotEmpty()) unpackedFixed32.forEach { protoMarshal.writeTag(765).writeFixed32(it) }
    if (unpackedFixed64.isNotEmpty()) unpackedFixed64.forEach { protoMarshal.writeTag(769).writeFixed64(it) }
    if (unpackedSfixed32.isNotEmpty()) unpackedSfixed32.forEach { protoMarshal.writeTag(781).writeSFixed32(it) }
    if (unpackedSfixed64.isNotEmpty()) unpackedSfixed64.forEach { protoMarshal.writeTag(785).writeSFixed64(it) }
    if (unpackedFloat.isNotEmpty()) unpackedFloat.forEach { protoMarshal.writeTag(797).writeFloat(it) }
    if (unpackedDouble.isNotEmpty()) unpackedDouble.forEach { protoMarshal.writeTag(801).writeDouble(it) }
    if (unpackedBool.isNotEmpty()) unpackedBool.forEach { protoMarshal.writeTag(808).writeBool(it) }
    if (unpackedNestedEnum.isNotEmpty()) unpackedNestedEnum.forEach { protoMarshal.writeTag(816).writeEnum(it) }
    if (oneofField is TestAllTypesProto2.OneofField.OneofUint32) protoMarshal.writeTag(888).writeUInt32(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage) protoMarshal.writeTag(898).writeMessage(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofString) protoMarshal.writeTag(906).writeString(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofBytes) protoMarshal.writeTag(914).writeBytes(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofBool) protoMarshal.writeTag(920).writeBool(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofUint64) protoMarshal.writeTag(928).writeUInt64(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofFloat) protoMarshal.writeTag(941).writeFloat(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofDouble) protoMarshal.writeTag(945).writeDouble(oneofField.value)
    if (oneofField is TestAllTypesProto2.OneofField.OneofEnum) protoMarshal.writeTag(952).writeEnum(oneofField.value)
    if (fieldname1 != null) protoMarshal.writeTag(3208).writeInt32(fieldname1)
    if (fieldName2 != null) protoMarshal.writeTag(3216).writeInt32(fieldName2)
    if (fieldName3 != null) protoMarshal.writeTag(3224).writeInt32(fieldName3)
    if (field_name4 != null) protoMarshal.writeTag(3232).writeInt32(field_name4)
    if (field0name5 != null) protoMarshal.writeTag(3240).writeInt32(field0name5)
    if (field0Name6 != null) protoMarshal.writeTag(3248).writeInt32(field0Name6)
    if (fieldName7 != null) protoMarshal.writeTag(3256).writeInt32(fieldName7)
    if (fieldName8 != null) protoMarshal.writeTag(3264).writeInt32(fieldName8)
    if (fieldName9 != null) protoMarshal.writeTag(3272).writeInt32(fieldName9)
    if (fieldName10 != null) protoMarshal.writeTag(3280).writeInt32(fieldName10)
    if (fIELDNAME11 != null) protoMarshal.writeTag(3288).writeInt32(fIELDNAME11)
    if (fIELDName12 != null) protoMarshal.writeTag(3296).writeInt32(fIELDName12)
    if (_fieldName13 != null) protoMarshal.writeTag(3304).writeInt32(_fieldName13)
    if (_FieldName14 != null) protoMarshal.writeTag(3312).writeInt32(_FieldName14)
    if (field_name15 != null) protoMarshal.writeTag(3320).writeInt32(field_name15)
    if (field_Name16 != null) protoMarshal.writeTag(3328).writeInt32(field_Name16)
    if (fieldName17_ != null) protoMarshal.writeTag(3336).writeInt32(fieldName17_)
    if (fieldName18_ != null) protoMarshal.writeTag(3344).writeInt32(fieldName18_)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2 {
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
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
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
        146 -> optionalNestedMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)
        154 -> optionalForeignMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.ForeignMessageProto2.Companion)
        168 -> optionalNestedEnum = protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        176 -> optionalForeignEnum = protoUnmarshal.readEnum(pbandk.conformance.pb.ForeignEnumProto2.Companion)
        194 -> optionalStringPiece = protoUnmarshal.readString()
        202 -> optionalCord = protoUnmarshal.readString()
        218 -> recursiveMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.Companion)
        248, 250 -> repeatedInt32 = protoUnmarshal.readRepeated(repeatedInt32, protoUnmarshal::readInt32, false)
        256, 258 -> repeatedInt64 = protoUnmarshal.readRepeated(repeatedInt64, protoUnmarshal::readInt64, false)
        264, 266 -> repeatedUint32 = protoUnmarshal.readRepeated(repeatedUint32, protoUnmarshal::readUInt32, false)
        272, 274 -> repeatedUint64 = protoUnmarshal.readRepeated(repeatedUint64, protoUnmarshal::readUInt64, false)
        280, 282 -> repeatedSint32 = protoUnmarshal.readRepeated(repeatedSint32, protoUnmarshal::readSInt32, false)
        288, 290 -> repeatedSint64 = protoUnmarshal.readRepeated(repeatedSint64, protoUnmarshal::readSInt64, false)
        301, 298 -> repeatedFixed32 = protoUnmarshal.readRepeated(repeatedFixed32, protoUnmarshal::readFixed32, false)
        305, 306 -> repeatedFixed64 = protoUnmarshal.readRepeated(repeatedFixed64, protoUnmarshal::readFixed64, false)
        317, 314 -> repeatedSfixed32 = protoUnmarshal.readRepeated(repeatedSfixed32, protoUnmarshal::readSFixed32, false)
        321, 322 -> repeatedSfixed64 = protoUnmarshal.readRepeated(repeatedSfixed64, protoUnmarshal::readSFixed64, false)
        333, 330 -> repeatedFloat = protoUnmarshal.readRepeated(repeatedFloat, protoUnmarshal::readFloat, false)
        337, 338 -> repeatedDouble = protoUnmarshal.readRepeated(repeatedDouble, protoUnmarshal::readDouble, false)
        344, 346 -> repeatedBool = protoUnmarshal.readRepeated(repeatedBool, protoUnmarshal::readBool, false)
        354 -> repeatedString = protoUnmarshal.readRepeated(repeatedString, protoUnmarshal::readString, true)
        362 -> repeatedBytes = protoUnmarshal.readRepeated(repeatedBytes, protoUnmarshal::readBytes, true)
        386 -> repeatedNestedMessage = protoUnmarshal.readRepeatedMessage(repeatedNestedMessage, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion, true)
        394 -> repeatedForeignMessage = protoUnmarshal.readRepeatedMessage(repeatedForeignMessage, pbandk.conformance.pb.ForeignMessageProto2.Companion, true)
        408, 410 -> repeatedNestedEnum = protoUnmarshal.readRepeatedEnum(repeatedNestedEnum, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        416, 418 -> repeatedForeignEnum = protoUnmarshal.readRepeatedEnum(repeatedForeignEnum, pbandk.conformance.pb.ForeignEnumProto2.Companion)
        434 -> repeatedStringPiece = protoUnmarshal.readRepeated(repeatedStringPiece, protoUnmarshal::readString, true)
        442 -> repeatedCord = protoUnmarshal.readRepeated(repeatedCord, protoUnmarshal::readString, true)
        450 -> mapInt32Int32 = protoUnmarshal.readMap(mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry.Companion, true)
        458 -> mapInt64Int64 = protoUnmarshal.readMap(mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry.Companion, true)
        466 -> mapUint32Uint32 = protoUnmarshal.readMap(mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry.Companion, true)
        474 -> mapUint64Uint64 = protoUnmarshal.readMap(mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry.Companion, true)
        482 -> mapSint32Sint32 = protoUnmarshal.readMap(mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry.Companion, true)
        490 -> mapSint64Sint64 = protoUnmarshal.readMap(mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry.Companion, true)
        498 -> mapFixed32Fixed32 = protoUnmarshal.readMap(mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry.Companion, true)
        506 -> mapFixed64Fixed64 = protoUnmarshal.readMap(mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry.Companion, true)
        514 -> mapSfixed32Sfixed32 = protoUnmarshal.readMap(mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry.Companion, true)
        522 -> mapSfixed64Sfixed64 = protoUnmarshal.readMap(mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry.Companion, true)
        530 -> mapInt32Float = protoUnmarshal.readMap(mapInt32Float, pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry.Companion, true)
        538 -> mapInt32Double = protoUnmarshal.readMap(mapInt32Double, pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry.Companion, true)
        546 -> mapBoolBool = protoUnmarshal.readMap(mapBoolBool, pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry.Companion, true)
        554 -> mapStringString = protoUnmarshal.readMap(mapStringString, pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry.Companion, true)
        562 -> mapStringBytes = protoUnmarshal.readMap(mapStringBytes, pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry.Companion, true)
        570 -> mapStringNestedMessage = protoUnmarshal.readMap(mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry.Companion, true)
        578 -> mapStringForeignMessage = protoUnmarshal.readMap(mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry.Companion, true)
        586 -> mapStringNestedEnum = protoUnmarshal.readMap(mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry.Companion, true)
        594 -> mapStringForeignEnum = protoUnmarshal.readMap(mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry.Companion, true)
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
        704, 706 -> packedNestedEnum = protoUnmarshal.readRepeatedEnum(packedNestedEnum, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        712, 714 -> unpackedInt32 = protoUnmarshal.readRepeated(unpackedInt32, protoUnmarshal::readInt32, false)
        720, 722 -> unpackedInt64 = protoUnmarshal.readRepeated(unpackedInt64, protoUnmarshal::readInt64, false)
        728, 730 -> unpackedUint32 = protoUnmarshal.readRepeated(unpackedUint32, protoUnmarshal::readUInt32, false)
        736, 738 -> unpackedUint64 = protoUnmarshal.readRepeated(unpackedUint64, protoUnmarshal::readUInt64, false)
        744, 746 -> unpackedSint32 = protoUnmarshal.readRepeated(unpackedSint32, protoUnmarshal::readSInt32, false)
        752, 754 -> unpackedSint64 = protoUnmarshal.readRepeated(unpackedSint64, protoUnmarshal::readSInt64, false)
        765, 762 -> unpackedFixed32 = protoUnmarshal.readRepeated(unpackedFixed32, protoUnmarshal::readFixed32, false)
        769, 770 -> unpackedFixed64 = protoUnmarshal.readRepeated(unpackedFixed64, protoUnmarshal::readFixed64, false)
        781, 778 -> unpackedSfixed32 = protoUnmarshal.readRepeated(unpackedSfixed32, protoUnmarshal::readSFixed32, false)
        785, 786 -> unpackedSfixed64 = protoUnmarshal.readRepeated(unpackedSfixed64, protoUnmarshal::readSFixed64, false)
        797, 794 -> unpackedFloat = protoUnmarshal.readRepeated(unpackedFloat, protoUnmarshal::readFloat, false)
        801, 802 -> unpackedDouble = protoUnmarshal.readRepeated(unpackedDouble, protoUnmarshal::readDouble, false)
        808, 810 -> unpackedBool = protoUnmarshal.readRepeated(unpackedBool, protoUnmarshal::readBool, false)
        816, 818 -> unpackedNestedEnum = protoUnmarshal.readRepeatedEnum(unpackedNestedEnum, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        888 -> oneofField = TestAllTypesProto2.OneofField.OneofUint32(protoUnmarshal.readUInt32())
        898 -> oneofField = TestAllTypesProto2.OneofField.OneofNestedMessage(protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion))
        906 -> oneofField = TestAllTypesProto2.OneofField.OneofString(protoUnmarshal.readString())
        914 -> oneofField = TestAllTypesProto2.OneofField.OneofBytes(protoUnmarshal.readBytes())
        920 -> oneofField = TestAllTypesProto2.OneofField.OneofBool(protoUnmarshal.readBool())
        928 -> oneofField = TestAllTypesProto2.OneofField.OneofUint64(protoUnmarshal.readUInt64())
        941 -> oneofField = TestAllTypesProto2.OneofField.OneofFloat(protoUnmarshal.readFloat())
        945 -> oneofField = TestAllTypesProto2.OneofField.OneofDouble(protoUnmarshal.readDouble())
        952 -> oneofField = TestAllTypesProto2.OneofField.OneofEnum(protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion))
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

private fun TestAllTypesProto2.toJsonMapperImpl(): TestAllTypesProto2.JsonMapper =
    TestAllTypesProto2.JsonMapper(
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
        optionalString,
        optionalBytes,
        optionalNestedMessage?.toJsonMapper(),
        optionalForeignMessage?.toJsonMapper(),
        optionalNestedEnum?.name,
        optionalForeignEnum?.name,
        optionalStringPiece,
        optionalCord,
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

private fun TestAllTypesProto2.JsonMapper.toMessageImpl(): TestAllTypesProto2 =
    TestAllTypesProto2(
        optionalInt32 = optionalInt32 ?: null,
        optionalInt64 = optionalInt64 ?: null,
        optionalUint32 = optionalUint32 ?: null,
        optionalUint64 = optionalUint64 ?: null,
        optionalSint32 = optionalSint32 ?: null,
        optionalSint64 = optionalSint64 ?: null,
        optionalFixed32 = optionalFixed32 ?: null,
        optionalFixed64 = optionalFixed64 ?: null,
        optionalSfixed32 = optionalSfixed32 ?: null,
        optionalSfixed64 = optionalSfixed64 ?: null,
        optionalFloat = optionalFloat ?: null,
        optionalDouble = optionalDouble ?: null,
        optionalBool = optionalBool ?: null,
        optionalString = optionalString ?: null,
        optionalBytes = optionalBytes ?: null,
        optionalNestedMessage = optionalNestedMessage?.toMessage(),
        optionalForeignMessage = optionalForeignMessage?.toMessage(),
        optionalNestedEnum = optionalNestedEnum?.let { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromName(it) } ?: null,
        optionalForeignEnum = optionalForeignEnum?.let { pbandk.conformance.pb.ForeignEnumProto2.fromName(it) } ?: null,
        optionalStringPiece = optionalStringPiece ?: null,
        optionalCord = optionalCord ?: null,
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
        repeatedNestedEnum = repeatedNestedEnum.map { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromName(it) },
        repeatedForeignEnum = repeatedForeignEnum.map { pbandk.conformance.pb.ForeignEnumProto2.fromName(it) },
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
        packedNestedEnum = packedNestedEnum.map { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromName(it) },
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
        unpackedNestedEnum = unpackedNestedEnum.map { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromName(it) },
        mapInt32Int32 = mapInt32Int32.mapValues { it.value ?: null },
        mapInt64Int64 = mapInt64Int64.mapValues { it.value ?: null },
        mapUint32Uint32 = mapUint32Uint32.mapValues { it.value ?: null },
        mapUint64Uint64 = mapUint64Uint64.mapValues { it.value ?: null },
        mapSint32Sint32 = mapSint32Sint32.mapValues { it.value ?: null },
        mapSint64Sint64 = mapSint64Sint64.mapValues { it.value ?: null },
        mapFixed32Fixed32 = mapFixed32Fixed32.mapValues { it.value ?: null },
        mapFixed64Fixed64 = mapFixed64Fixed64.mapValues { it.value ?: null },
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32.mapValues { it.value ?: null },
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64.mapValues { it.value ?: null },
        mapInt32Float = mapInt32Float.mapValues { it.value ?: null },
        mapInt32Double = mapInt32Double.mapValues { it.value ?: null },
        mapBoolBool = mapBoolBool.mapValues { it.value ?: null },
        mapStringString = mapStringString.mapValues { it.value ?: null },
        mapStringBytes = mapStringBytes.mapValues { it.value ?: null },
        mapStringNestedMessage = mapStringNestedMessage.mapValues { it.value?.toMessage() },
        mapStringForeignMessage = mapStringForeignMessage.mapValues { it.value?.toMessage() },
        mapStringNestedEnum = mapStringNestedEnum.mapValues { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum?.fromName(it.value!!) },
        mapStringForeignEnum = mapStringForeignEnum.mapValues { pbandk.conformance.pb.ForeignEnumProto2?.fromName(it.value!!) },
        fieldname1 = fieldname1 ?: null,
        fieldName2 = fieldName2 ?: null,
        fieldName3 = fieldName3 ?: null,
        field_name4 = field_name4 ?: null,
        field0name5 = field0name5 ?: null,
        field0Name6 = field0Name6 ?: null,
        fieldName7 = fieldName7 ?: null,
        fieldName8 = fieldName8 ?: null,
        fieldName9 = fieldName9 ?: null,
        fieldName10 = fieldName10 ?: null,
        fIELDNAME11 = fIELDNAME11 ?: null,
        fIELDName12 = fIELDName12 ?: null,
        _fieldName13 = _fieldName13 ?: null,
        _FieldName14 = _FieldName14 ?: null,
        field_name15 = field_name15 ?: null,
        field_Name16 = field_Name16 ?: null,
        fieldName17_ = fieldName17_ ?: null,
        fieldName18_ = fieldName18_ ?: null,
        oneofField = 
            oneofUint32?.let { value -> TestAllTypesProto2.OneofField.OneofUint32(value) }
             ?: oneofNestedMessage?.let { value -> TestAllTypesProto2.OneofField.OneofNestedMessage(value.toMessage()) }
             ?: oneofString?.let { value -> TestAllTypesProto2.OneofField.OneofString(value) }
             ?: oneofBytes?.let { value -> TestAllTypesProto2.OneofField.OneofBytes(value) }
             ?: oneofBool?.let { value -> TestAllTypesProto2.OneofField.OneofBool(value) }
             ?: oneofUint64?.let { value -> TestAllTypesProto2.OneofField.OneofUint64(value) }
             ?: oneofFloat?.let { value -> TestAllTypesProto2.OneofField.OneofFloat(value) }
             ?: oneofDouble?.let { value -> TestAllTypesProto2.OneofField.OneofDouble(value) }
             ?: oneofEnum?.let { value -> TestAllTypesProto2.OneofField.OneofEnum(value.let { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromName(it) }) }
    )

private fun TestAllTypesProto2.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2 {
    val mapper = json.parse(TestAllTypesProto2.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.NestedMessage?.orDefault() = this ?: TestAllTypesProto2.NestedMessage.defaultInstance

private fun TestAllTypesProto2.NestedMessage.protoMergeImpl(plus: TestAllTypesProto2.NestedMessage?): TestAllTypesProto2.NestedMessage = plus?.copy(
    a = plus.a ?: a,
    corecursive = corecursive?.plus(plus.corecursive) ?: plus.corecursive,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.NestedMessage.protoSizeImpl(): Int {
    var protoSize = 0
    if (a != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(a)
    if (corecursive != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(corecursive)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.NestedMessage.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (a != null) protoMarshal.writeTag(8).writeInt32(a)
    if (corecursive != null) protoMarshal.writeTag(18).writeMessage(corecursive)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.NestedMessage.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.NestedMessage {
    var a: Int? = null
    var corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.NestedMessage(a, corecursive, protoUnmarshal.unknownFields())
        8 -> a = protoUnmarshal.readInt32()
        18 -> corecursive = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.NestedMessage.toJsonMapperImpl(): TestAllTypesProto2.NestedMessage.JsonMapper =
    TestAllTypesProto2.NestedMessage.JsonMapper(
        a,
        corecursive?.toJsonMapper()
    )

private fun TestAllTypesProto2.NestedMessage.JsonMapper.toMessageImpl(): TestAllTypesProto2.NestedMessage =
    TestAllTypesProto2.NestedMessage(
        a = a ?: null,
        corecursive = corecursive?.toMessage()
    )

private fun TestAllTypesProto2.NestedMessage.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.NestedMessage.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.NestedMessage.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.NestedMessage {
    val mapper = json.parse(TestAllTypesProto2.NestedMessage.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapInt32Int32Entry?.orDefault() = this ?: TestAllTypesProto2.MapInt32Int32Entry.defaultInstance

private fun TestAllTypesProto2.MapInt32Int32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapInt32Int32Entry?): TestAllTypesProto2.MapInt32Int32Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt32Int32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt32Int32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeInt32(key)
    if (value != null) protoMarshal.writeTag(16).writeInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt32Int32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt32Int32Entry {
    var key: Int? = null
    var value: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt32Int32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        16 -> value = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt32Int32Entry.toJsonMapperImpl(): TestAllTypesProto2.MapInt32Int32Entry.JsonMapper =
    TestAllTypesProto2.MapInt32Int32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapInt32Int32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapInt32Int32Entry =
    TestAllTypesProto2.MapInt32Int32Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapInt32Int32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapInt32Int32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapInt32Int32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapInt32Int32Entry {
    val mapper = json.parse(TestAllTypesProto2.MapInt32Int32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapInt64Int64Entry?.orDefault() = this ?: TestAllTypesProto2.MapInt64Int64Entry.defaultInstance

private fun TestAllTypesProto2.MapInt64Int64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapInt64Int64Entry?): TestAllTypesProto2.MapInt64Int64Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt64Int64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt64Int64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeInt64(key)
    if (value != null) protoMarshal.writeTag(16).writeInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt64Int64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt64Int64Entry {
    var key: Long? = null
    var value: Long? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt64Int64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt64()
        16 -> value = protoUnmarshal.readInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt64Int64Entry.toJsonMapperImpl(): TestAllTypesProto2.MapInt64Int64Entry.JsonMapper =
    TestAllTypesProto2.MapInt64Int64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapInt64Int64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapInt64Int64Entry =
    TestAllTypesProto2.MapInt64Int64Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapInt64Int64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapInt64Int64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapInt64Int64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapInt64Int64Entry {
    val mapper = json.parse(TestAllTypesProto2.MapInt64Int64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapUint32Uint32Entry?.orDefault() = this ?: TestAllTypesProto2.MapUint32Uint32Entry.defaultInstance

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapUint32Uint32Entry?): TestAllTypesProto2.MapUint32Uint32Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.uInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeUInt32(key)
    if (value != null) protoMarshal.writeTag(16).writeUInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapUint32Uint32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapUint32Uint32Entry {
    var key: Int? = null
    var value: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapUint32Uint32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readUInt32()
        16 -> value = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapUint32Uint32Entry.toJsonMapperImpl(): TestAllTypesProto2.MapUint32Uint32Entry.JsonMapper =
    TestAllTypesProto2.MapUint32Uint32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapUint32Uint32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapUint32Uint32Entry =
    TestAllTypesProto2.MapUint32Uint32Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapUint32Uint32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapUint32Uint32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapUint32Uint32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapUint32Uint32Entry {
    val mapper = json.parse(TestAllTypesProto2.MapUint32Uint32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapUint64Uint64Entry?.orDefault() = this ?: TestAllTypesProto2.MapUint64Uint64Entry.defaultInstance

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapUint64Uint64Entry?): TestAllTypesProto2.MapUint64Uint64Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt64Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.uInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeUInt64(key)
    if (value != null) protoMarshal.writeTag(16).writeUInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapUint64Uint64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapUint64Uint64Entry {
    var key: Long? = null
    var value: Long? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapUint64Uint64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readUInt64()
        16 -> value = protoUnmarshal.readUInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapUint64Uint64Entry.toJsonMapperImpl(): TestAllTypesProto2.MapUint64Uint64Entry.JsonMapper =
    TestAllTypesProto2.MapUint64Uint64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapUint64Uint64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapUint64Uint64Entry =
    TestAllTypesProto2.MapUint64Uint64Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapUint64Uint64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapUint64Uint64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapUint64Uint64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapUint64Uint64Entry {
    val mapper = json.parse(TestAllTypesProto2.MapUint64Uint64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapSint32Sint32Entry?.orDefault() = this ?: TestAllTypesProto2.MapSint32Sint32Entry.defaultInstance

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSint32Sint32Entry?): TestAllTypesProto2.MapSint32Sint32Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sInt32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeSInt32(key)
    if (value != null) protoMarshal.writeTag(16).writeSInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSint32Sint32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSint32Sint32Entry {
    var key: Int? = null
    var value: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSint32Sint32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readSInt32()
        16 -> value = protoUnmarshal.readSInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSint32Sint32Entry.toJsonMapperImpl(): TestAllTypesProto2.MapSint32Sint32Entry.JsonMapper =
    TestAllTypesProto2.MapSint32Sint32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapSint32Sint32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapSint32Sint32Entry =
    TestAllTypesProto2.MapSint32Sint32Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapSint32Sint32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapSint32Sint32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapSint32Sint32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapSint32Sint32Entry {
    val mapper = json.parse(TestAllTypesProto2.MapSint32Sint32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapSint64Sint64Entry?.orDefault() = this ?: TestAllTypesProto2.MapSint64Sint64Entry.defaultInstance

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSint64Sint64Entry?): TestAllTypesProto2.MapSint64Sint64Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sInt64Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeSInt64(key)
    if (value != null) protoMarshal.writeTag(16).writeSInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSint64Sint64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSint64Sint64Entry {
    var key: Long? = null
    var value: Long? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSint64Sint64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readSInt64()
        16 -> value = protoUnmarshal.readSInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSint64Sint64Entry.toJsonMapperImpl(): TestAllTypesProto2.MapSint64Sint64Entry.JsonMapper =
    TestAllTypesProto2.MapSint64Sint64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapSint64Sint64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapSint64Sint64Entry =
    TestAllTypesProto2.MapSint64Sint64Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapSint64Sint64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapSint64Sint64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapSint64Sint64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapSint64Sint64Entry {
    val mapper = json.parse(TestAllTypesProto2.MapSint64Sint64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapFixed32Fixed32Entry?.orDefault() = this ?: TestAllTypesProto2.MapFixed32Fixed32Entry.defaultInstance

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapFixed32Fixed32Entry?): TestAllTypesProto2.MapFixed32Fixed32Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.fixed32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.fixed32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(13).writeFixed32(key)
    if (value != null) protoMarshal.writeTag(21).writeFixed32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapFixed32Fixed32Entry {
    var key: Int? = null
    var value: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapFixed32Fixed32Entry(key, value, protoUnmarshal.unknownFields())
        13 -> key = protoUnmarshal.readFixed32()
        21 -> value = protoUnmarshal.readFixed32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.toJsonMapperImpl(): TestAllTypesProto2.MapFixed32Fixed32Entry.JsonMapper =
    TestAllTypesProto2.MapFixed32Fixed32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapFixed32Fixed32Entry =
    TestAllTypesProto2.MapFixed32Fixed32Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapFixed32Fixed32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapFixed32Fixed32Entry {
    val mapper = json.parse(TestAllTypesProto2.MapFixed32Fixed32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapFixed64Fixed64Entry?.orDefault() = this ?: TestAllTypesProto2.MapFixed64Fixed64Entry.defaultInstance

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapFixed64Fixed64Entry?): TestAllTypesProto2.MapFixed64Fixed64Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.fixed64Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.fixed64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(9).writeFixed64(key)
    if (value != null) protoMarshal.writeTag(17).writeFixed64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapFixed64Fixed64Entry {
    var key: Long? = null
    var value: Long? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapFixed64Fixed64Entry(key, value, protoUnmarshal.unknownFields())
        9 -> key = protoUnmarshal.readFixed64()
        17 -> value = protoUnmarshal.readFixed64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.toJsonMapperImpl(): TestAllTypesProto2.MapFixed64Fixed64Entry.JsonMapper =
    TestAllTypesProto2.MapFixed64Fixed64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapFixed64Fixed64Entry =
    TestAllTypesProto2.MapFixed64Fixed64Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapFixed64Fixed64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapFixed64Fixed64Entry {
    val mapper = json.parse(TestAllTypesProto2.MapFixed64Fixed64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapSfixed32Sfixed32Entry?.orDefault() = this ?: TestAllTypesProto2.MapSfixed32Sfixed32Entry.defaultInstance

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSfixed32Sfixed32Entry?): TestAllTypesProto2.MapSfixed32Sfixed32Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sFixed32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sFixed32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(13).writeSFixed32(key)
    if (value != null) protoMarshal.writeTag(21).writeSFixed32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSfixed32Sfixed32Entry {
    var key: Int? = null
    var value: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSfixed32Sfixed32Entry(key, value, protoUnmarshal.unknownFields())
        13 -> key = protoUnmarshal.readSFixed32()
        21 -> value = protoUnmarshal.readSFixed32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.toJsonMapperImpl(): TestAllTypesProto2.MapSfixed32Sfixed32Entry.JsonMapper =
    TestAllTypesProto2.MapSfixed32Sfixed32Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapSfixed32Sfixed32Entry =
    TestAllTypesProto2.MapSfixed32Sfixed32Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapSfixed32Sfixed32Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapSfixed32Sfixed32Entry {
    val mapper = json.parse(TestAllTypesProto2.MapSfixed32Sfixed32Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapSfixed64Sfixed64Entry?.orDefault() = this ?: TestAllTypesProto2.MapSfixed64Sfixed64Entry.defaultInstance

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSfixed64Sfixed64Entry?): TestAllTypesProto2.MapSfixed64Sfixed64Entry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sFixed64Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sFixed64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(9).writeSFixed64(key)
    if (value != null) protoMarshal.writeTag(17).writeSFixed64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSfixed64Sfixed64Entry {
    var key: Long? = null
    var value: Long? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSfixed64Sfixed64Entry(key, value, protoUnmarshal.unknownFields())
        9 -> key = protoUnmarshal.readSFixed64()
        17 -> value = protoUnmarshal.readSFixed64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.toJsonMapperImpl(): TestAllTypesProto2.MapSfixed64Sfixed64Entry.JsonMapper =
    TestAllTypesProto2.MapSfixed64Sfixed64Entry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapSfixed64Sfixed64Entry =
    TestAllTypesProto2.MapSfixed64Sfixed64Entry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapSfixed64Sfixed64Entry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapSfixed64Sfixed64Entry {
    val mapper = json.parse(TestAllTypesProto2.MapSfixed64Sfixed64Entry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapInt32FloatEntry?.orDefault() = this ?: TestAllTypesProto2.MapInt32FloatEntry.defaultInstance

private fun TestAllTypesProto2.MapInt32FloatEntry.protoMergeImpl(plus: TestAllTypesProto2.MapInt32FloatEntry?): TestAllTypesProto2.MapInt32FloatEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt32FloatEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.floatSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt32FloatEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeInt32(key)
    if (value != null) protoMarshal.writeTag(21).writeFloat(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt32FloatEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt32FloatEntry {
    var key: Int? = null
    var value: Float? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt32FloatEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        21 -> value = protoUnmarshal.readFloat()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt32FloatEntry.toJsonMapperImpl(): TestAllTypesProto2.MapInt32FloatEntry.JsonMapper =
    TestAllTypesProto2.MapInt32FloatEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapInt32FloatEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapInt32FloatEntry =
    TestAllTypesProto2.MapInt32FloatEntry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapInt32FloatEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapInt32FloatEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapInt32FloatEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapInt32FloatEntry {
    val mapper = json.parse(TestAllTypesProto2.MapInt32FloatEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapInt32DoubleEntry?.orDefault() = this ?: TestAllTypesProto2.MapInt32DoubleEntry.defaultInstance

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoMergeImpl(plus: TestAllTypesProto2.MapInt32DoubleEntry?): TestAllTypesProto2.MapInt32DoubleEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.doubleSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeInt32(key)
    if (value != null) protoMarshal.writeTag(17).writeDouble(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt32DoubleEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt32DoubleEntry {
    var key: Int? = null
    var value: Double? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt32DoubleEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        17 -> value = protoUnmarshal.readDouble()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt32DoubleEntry.toJsonMapperImpl(): TestAllTypesProto2.MapInt32DoubleEntry.JsonMapper =
    TestAllTypesProto2.MapInt32DoubleEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapInt32DoubleEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapInt32DoubleEntry =
    TestAllTypesProto2.MapInt32DoubleEntry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapInt32DoubleEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapInt32DoubleEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapInt32DoubleEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapInt32DoubleEntry {
    val mapper = json.parse(TestAllTypesProto2.MapInt32DoubleEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapBoolBoolEntry?.orDefault() = this ?: TestAllTypesProto2.MapBoolBoolEntry.defaultInstance

private fun TestAllTypesProto2.MapBoolBoolEntry.protoMergeImpl(plus: TestAllTypesProto2.MapBoolBoolEntry?): TestAllTypesProto2.MapBoolBoolEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapBoolBoolEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapBoolBoolEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(8).writeBool(key)
    if (value != null) protoMarshal.writeTag(16).writeBool(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapBoolBoolEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapBoolBoolEntry {
    var key: Boolean? = null
    var value: Boolean? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapBoolBoolEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readBool()
        16 -> value = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapBoolBoolEntry.toJsonMapperImpl(): TestAllTypesProto2.MapBoolBoolEntry.JsonMapper =
    TestAllTypesProto2.MapBoolBoolEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapBoolBoolEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapBoolBoolEntry =
    TestAllTypesProto2.MapBoolBoolEntry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapBoolBoolEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapBoolBoolEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapBoolBoolEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapBoolBoolEntry {
    val mapper = json.parse(TestAllTypesProto2.MapBoolBoolEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapStringStringEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringStringEntry.defaultInstance

private fun TestAllTypesProto2.MapStringStringEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringStringEntry?): TestAllTypesProto2.MapStringStringEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringStringEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringStringEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeString(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringStringEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringStringEntry {
    var key: String? = null
    var value: String? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringStringEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringStringEntry.toJsonMapperImpl(): TestAllTypesProto2.MapStringStringEntry.JsonMapper =
    TestAllTypesProto2.MapStringStringEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapStringStringEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapStringStringEntry =
    TestAllTypesProto2.MapStringStringEntry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapStringStringEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapStringStringEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapStringStringEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapStringStringEntry {
    val mapper = json.parse(TestAllTypesProto2.MapStringStringEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapStringBytesEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringBytesEntry.defaultInstance

private fun TestAllTypesProto2.MapStringBytesEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringBytesEntry?): TestAllTypesProto2.MapStringBytesEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringBytesEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringBytesEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringBytesEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringBytesEntry {
    var key: String? = null
    var value: pbandk.ByteArr? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringBytesEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringBytesEntry.toJsonMapperImpl(): TestAllTypesProto2.MapStringBytesEntry.JsonMapper =
    TestAllTypesProto2.MapStringBytesEntry.JsonMapper(
        key,
        value
    )

private fun TestAllTypesProto2.MapStringBytesEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapStringBytesEntry =
    TestAllTypesProto2.MapStringBytesEntry(
        key = key ?: null,
        value = value ?: null
    )

private fun TestAllTypesProto2.MapStringBytesEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapStringBytesEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapStringBytesEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapStringBytesEntry {
    val mapper = json.parse(TestAllTypesProto2.MapStringBytesEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapStringNestedMessageEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringNestedMessageEntry.defaultInstance

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringNestedMessageEntry?): TestAllTypesProto2.MapStringNestedMessageEntry = plus?.copy(
    key = plus.key ?: key,
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringNestedMessageEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringNestedMessageEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringNestedMessageEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringNestedMessageEntry.toJsonMapperImpl(): TestAllTypesProto2.MapStringNestedMessageEntry.JsonMapper =
    TestAllTypesProto2.MapStringNestedMessageEntry.JsonMapper(
        key,
        value?.toJsonMapper()
    )

private fun TestAllTypesProto2.MapStringNestedMessageEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapStringNestedMessageEntry =
    TestAllTypesProto2.MapStringNestedMessageEntry(
        key = key ?: null,
        value = value?.toMessage()
    )

private fun TestAllTypesProto2.MapStringNestedMessageEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapStringNestedMessageEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapStringNestedMessageEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapStringNestedMessageEntry {
    val mapper = json.parse(TestAllTypesProto2.MapStringNestedMessageEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapStringForeignMessageEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringForeignMessageEntry.defaultInstance

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringForeignMessageEntry?): TestAllTypesProto2.MapStringForeignMessageEntry = plus?.copy(
    key = plus.key ?: key,
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringForeignMessageEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringForeignMessageEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.ForeignMessageProto2? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringForeignMessageEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.conformance.pb.ForeignMessageProto2.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringForeignMessageEntry.toJsonMapperImpl(): TestAllTypesProto2.MapStringForeignMessageEntry.JsonMapper =
    TestAllTypesProto2.MapStringForeignMessageEntry.JsonMapper(
        key,
        value?.toJsonMapper()
    )

private fun TestAllTypesProto2.MapStringForeignMessageEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapStringForeignMessageEntry =
    TestAllTypesProto2.MapStringForeignMessageEntry(
        key = key ?: null,
        value = value?.toMessage()
    )

private fun TestAllTypesProto2.MapStringForeignMessageEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapStringForeignMessageEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapStringForeignMessageEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapStringForeignMessageEntry {
    val mapper = json.parse(TestAllTypesProto2.MapStringForeignMessageEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapStringNestedEnumEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringNestedEnumEntry.defaultInstance

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringNestedEnumEntry?): TestAllTypesProto2.MapStringNestedEnumEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(16).writeEnum(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringNestedEnumEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringNestedEnumEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringNestedEnumEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        16 -> value = protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringNestedEnumEntry.toJsonMapperImpl(): TestAllTypesProto2.MapStringNestedEnumEntry.JsonMapper =
    TestAllTypesProto2.MapStringNestedEnumEntry.JsonMapper(
        key,
        value?.name
    )

private fun TestAllTypesProto2.MapStringNestedEnumEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapStringNestedEnumEntry =
    TestAllTypesProto2.MapStringNestedEnumEntry(
        key = key ?: null,
        value = value?.let { pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromName(it) } ?: null
    )

private fun TestAllTypesProto2.MapStringNestedEnumEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapStringNestedEnumEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapStringNestedEnumEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapStringNestedEnumEntry {
    val mapper = json.parse(TestAllTypesProto2.MapStringNestedEnumEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MapStringForeignEnumEntry?.orDefault() = this ?: TestAllTypesProto2.MapStringForeignEnumEntry.defaultInstance

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringForeignEnumEntry?): TestAllTypesProto2.MapStringForeignEnumEntry = plus?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != null) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(16).writeEnum(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringForeignEnumEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringForeignEnumEntry {
    var key: String? = null
    var value: pbandk.conformance.pb.ForeignEnumProto2? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringForeignEnumEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        16 -> value = protoUnmarshal.readEnum(pbandk.conformance.pb.ForeignEnumProto2.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringForeignEnumEntry.toJsonMapperImpl(): TestAllTypesProto2.MapStringForeignEnumEntry.JsonMapper =
    TestAllTypesProto2.MapStringForeignEnumEntry.JsonMapper(
        key,
        value?.name
    )

private fun TestAllTypesProto2.MapStringForeignEnumEntry.JsonMapper.toMessageImpl(): TestAllTypesProto2.MapStringForeignEnumEntry =
    TestAllTypesProto2.MapStringForeignEnumEntry(
        key = key ?: null,
        value = value?.let { pbandk.conformance.pb.ForeignEnumProto2.fromName(it) } ?: null
    )

private fun TestAllTypesProto2.MapStringForeignEnumEntry.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MapStringForeignEnumEntry.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MapStringForeignEnumEntry.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MapStringForeignEnumEntry {
    val mapper = json.parse(TestAllTypesProto2.MapStringForeignEnumEntry.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.Data?.orDefault() = this ?: TestAllTypesProto2.Data.defaultInstance

private fun TestAllTypesProto2.Data.protoMergeImpl(plus: TestAllTypesProto2.Data?): TestAllTypesProto2.Data = plus?.copy(
    groupInt32 = plus.groupInt32 ?: groupInt32,
    groupUint32 = plus.groupUint32 ?: groupUint32,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.Data.protoSizeImpl(): Int {
    var protoSize = 0
    if (groupInt32 != null) protoSize += pbandk.Sizer.tagSize(202) + pbandk.Sizer.int32Size(groupInt32)
    if (groupUint32 != null) protoSize += pbandk.Sizer.tagSize(203) + pbandk.Sizer.uInt32Size(groupUint32)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.Data.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (groupInt32 != null) protoMarshal.writeTag(1616).writeInt32(groupInt32)
    if (groupUint32 != null) protoMarshal.writeTag(1624).writeUInt32(groupUint32)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.Data.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.Data {
    var groupInt32: Int? = null
    var groupUint32: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.Data(groupInt32, groupUint32, protoUnmarshal.unknownFields())
        1616 -> groupInt32 = protoUnmarshal.readInt32()
        1624 -> groupUint32 = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.Data.toJsonMapperImpl(): TestAllTypesProto2.Data.JsonMapper =
    TestAllTypesProto2.Data.JsonMapper(
        groupInt32,
        groupUint32
    )

private fun TestAllTypesProto2.Data.JsonMapper.toMessageImpl(): TestAllTypesProto2.Data =
    TestAllTypesProto2.Data(
        groupInt32 = groupInt32 ?: null,
        groupUint32 = groupUint32 ?: null
    )

private fun TestAllTypesProto2.Data.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.Data.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.Data.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.Data {
    val mapper = json.parse(TestAllTypesProto2.Data.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MessageSetCorrect?.orDefault() = this ?: TestAllTypesProto2.MessageSetCorrect.defaultInstance

private fun TestAllTypesProto2.MessageSetCorrect.protoMergeImpl(plus: TestAllTypesProto2.MessageSetCorrect?): TestAllTypesProto2.MessageSetCorrect = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MessageSetCorrect.protoSizeImpl(): Int {
    var protoSize = 0
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MessageSetCorrect.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MessageSetCorrect.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MessageSetCorrect {
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MessageSetCorrect(protoUnmarshal.unknownFields())
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MessageSetCorrect.toJsonMapperImpl(): TestAllTypesProto2.MessageSetCorrect.JsonMapper =
    TestAllTypesProto2.MessageSetCorrect.JsonMapper(
    )

private fun TestAllTypesProto2.MessageSetCorrect.JsonMapper.toMessageImpl(): TestAllTypesProto2.MessageSetCorrect =
    TestAllTypesProto2.MessageSetCorrect(
    )

private fun TestAllTypesProto2.MessageSetCorrect.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MessageSetCorrect.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MessageSetCorrect.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MessageSetCorrect {
    val mapper = json.parse(TestAllTypesProto2.MessageSetCorrect.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MessageSetCorrectExtension1?.orDefault() = this ?: TestAllTypesProto2.MessageSetCorrectExtension1.defaultInstance

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoMergeImpl(plus: TestAllTypesProto2.MessageSetCorrectExtension1?): TestAllTypesProto2.MessageSetCorrectExtension1 = plus?.copy(
    str = plus.str ?: str,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoSizeImpl(): Int {
    var protoSize = 0
    if (str != null) protoSize += pbandk.Sizer.tagSize(25) + pbandk.Sizer.stringSize(str)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (str != null) protoMarshal.writeTag(202).writeString(str)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MessageSetCorrectExtension1.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MessageSetCorrectExtension1 {
    var str: String? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MessageSetCorrectExtension1(str, protoUnmarshal.unknownFields())
        202 -> str = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MessageSetCorrectExtension1.toJsonMapperImpl(): TestAllTypesProto2.MessageSetCorrectExtension1.JsonMapper =
    TestAllTypesProto2.MessageSetCorrectExtension1.JsonMapper(
        str
    )

private fun TestAllTypesProto2.MessageSetCorrectExtension1.JsonMapper.toMessageImpl(): TestAllTypesProto2.MessageSetCorrectExtension1 =
    TestAllTypesProto2.MessageSetCorrectExtension1(
        str = str ?: null
    )

private fun TestAllTypesProto2.MessageSetCorrectExtension1.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MessageSetCorrectExtension1.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MessageSetCorrectExtension1.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MessageSetCorrectExtension1 {
    val mapper = json.parse(TestAllTypesProto2.MessageSetCorrectExtension1.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun TestAllTypesProto2.MessageSetCorrectExtension2?.orDefault() = this ?: TestAllTypesProto2.MessageSetCorrectExtension2.defaultInstance

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoMergeImpl(plus: TestAllTypesProto2.MessageSetCorrectExtension2?): TestAllTypesProto2.MessageSetCorrectExtension2 = plus?.copy(
    i = plus.i ?: i,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoSizeImpl(): Int {
    var protoSize = 0
    if (i != null) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.int32Size(i)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (i != null) protoMarshal.writeTag(72).writeInt32(i)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MessageSetCorrectExtension2.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MessageSetCorrectExtension2 {
    var i: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MessageSetCorrectExtension2(i, protoUnmarshal.unknownFields())
        72 -> i = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MessageSetCorrectExtension2.toJsonMapperImpl(): TestAllTypesProto2.MessageSetCorrectExtension2.JsonMapper =
    TestAllTypesProto2.MessageSetCorrectExtension2.JsonMapper(
        i
    )

private fun TestAllTypesProto2.MessageSetCorrectExtension2.JsonMapper.toMessageImpl(): TestAllTypesProto2.MessageSetCorrectExtension2 =
    TestAllTypesProto2.MessageSetCorrectExtension2(
        i = i ?: null
    )

private fun TestAllTypesProto2.MessageSetCorrectExtension2.jsonMarshalImpl(json: Json): String =
    json.stringify(TestAllTypesProto2.MessageSetCorrectExtension2.JsonMapper.serializer(), toJsonMapper())

private fun TestAllTypesProto2.MessageSetCorrectExtension2.Companion.jsonUnmarshalImpl(json: Json, data: String): TestAllTypesProto2.MessageSetCorrectExtension2 {
    val mapper = json.parse(TestAllTypesProto2.MessageSetCorrectExtension2.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ForeignMessageProto2?.orDefault() = this ?: ForeignMessageProto2.defaultInstance

private fun ForeignMessageProto2.protoMergeImpl(plus: ForeignMessageProto2?): ForeignMessageProto2 = plus?.copy(
    c = plus.c ?: c,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ForeignMessageProto2.protoSizeImpl(): Int {
    var protoSize = 0
    if (c != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(c)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ForeignMessageProto2.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (c != null) protoMarshal.writeTag(8).writeInt32(c)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ForeignMessageProto2.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ForeignMessageProto2 {
    var c: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ForeignMessageProto2(c, protoUnmarshal.unknownFields())
        8 -> c = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun ForeignMessageProto2.toJsonMapperImpl(): ForeignMessageProto2.JsonMapper =
    ForeignMessageProto2.JsonMapper(
        c
    )

private fun ForeignMessageProto2.JsonMapper.toMessageImpl(): ForeignMessageProto2 =
    ForeignMessageProto2(
        c = c ?: null
    )

private fun ForeignMessageProto2.jsonMarshalImpl(json: Json): String =
    json.stringify(ForeignMessageProto2.JsonMapper.serializer(), toJsonMapper())

private fun ForeignMessageProto2.Companion.jsonUnmarshalImpl(json: Json, data: String): ForeignMessageProto2 {
    val mapper = json.parse(ForeignMessageProto2.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun UnknownToTestAllTypes?.orDefault() = this ?: UnknownToTestAllTypes.defaultInstance

private fun UnknownToTestAllTypes.protoMergeImpl(plus: UnknownToTestAllTypes?): UnknownToTestAllTypes = plus?.copy(
    optionalInt32 = plus.optionalInt32 ?: optionalInt32,
    optionalString = plus.optionalString ?: optionalString,
    nestedMessage = nestedMessage?.plus(plus.nestedMessage) ?: plus.nestedMessage,
    optionalBool = plus.optionalBool ?: optionalBool,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UnknownToTestAllTypes.protoSizeImpl(): Int {
    var protoSize = 0
    if (optionalInt32 != null) protoSize += pbandk.Sizer.tagSize(1001) + pbandk.Sizer.int32Size(optionalInt32)
    if (optionalString != null) protoSize += pbandk.Sizer.tagSize(1002) + pbandk.Sizer.stringSize(optionalString)
    if (nestedMessage != null) protoSize += pbandk.Sizer.tagSize(1003) + pbandk.Sizer.messageSize(nestedMessage)
    if (optionalBool != null) protoSize += pbandk.Sizer.tagSize(1006) + pbandk.Sizer.boolSize(optionalBool)
    if (repeatedInt32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1011) * repeatedInt32.size) + repeatedInt32.sumBy(pbandk.Sizer::int32Size)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UnknownToTestAllTypes.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (optionalInt32 != null) protoMarshal.writeTag(8008).writeInt32(optionalInt32)
    if (optionalString != null) protoMarshal.writeTag(8018).writeString(optionalString)
    if (nestedMessage != null) protoMarshal.writeTag(8026).writeMessage(nestedMessage)
    if (optionalBool != null) protoMarshal.writeTag(8048).writeBool(optionalBool)
    if (repeatedInt32.isNotEmpty()) repeatedInt32.forEach { protoMarshal.writeTag(8088).writeInt32(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UnknownToTestAllTypes.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UnknownToTestAllTypes {
    var optionalInt32: Int? = null
    var optionalString: String? = null
    var nestedMessage: pbandk.conformance.pb.ForeignMessageProto2? = null
    var optionalBool: Boolean? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UnknownToTestAllTypes(optionalInt32, optionalString, nestedMessage, optionalBool,
            pbandk.ListWithSize.Builder.fixed(repeatedInt32), protoUnmarshal.unknownFields())
        8008 -> optionalInt32 = protoUnmarshal.readInt32()
        8018 -> optionalString = protoUnmarshal.readString()
        8026 -> nestedMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.ForeignMessageProto2.Companion)
        8048 -> optionalBool = protoUnmarshal.readBool()
        8088, 8090 -> repeatedInt32 = protoUnmarshal.readRepeated(repeatedInt32, protoUnmarshal::readInt32, false)
        else -> protoUnmarshal.unknownField()
    }
}

private fun UnknownToTestAllTypes.toJsonMapperImpl(): UnknownToTestAllTypes.JsonMapper =
    UnknownToTestAllTypes.JsonMapper(
        optionalInt32,
        optionalString,
        nestedMessage?.toJsonMapper(),
        optionalBool,
        repeatedInt32
    )

private fun UnknownToTestAllTypes.JsonMapper.toMessageImpl(): UnknownToTestAllTypes =
    UnknownToTestAllTypes(
        optionalInt32 = optionalInt32 ?: null,
        optionalString = optionalString ?: null,
        nestedMessage = nestedMessage?.toMessage(),
        optionalBool = optionalBool ?: null,
        repeatedInt32 = repeatedInt32 ?: emptyList()
    )

private fun UnknownToTestAllTypes.jsonMarshalImpl(json: Json): String =
    json.stringify(UnknownToTestAllTypes.JsonMapper.serializer(), toJsonMapper())

private fun UnknownToTestAllTypes.Companion.jsonUnmarshalImpl(json: Json, data: String): UnknownToTestAllTypes {
    val mapper = json.parse(UnknownToTestAllTypes.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun UnknownToTestAllTypes.OptionalGroup?.orDefault() = this ?: UnknownToTestAllTypes.OptionalGroup.defaultInstance

private fun UnknownToTestAllTypes.OptionalGroup.protoMergeImpl(plus: UnknownToTestAllTypes.OptionalGroup?): UnknownToTestAllTypes.OptionalGroup = plus?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UnknownToTestAllTypes.OptionalGroup.protoSizeImpl(): Int {
    var protoSize = 0
    if (a != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(a)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UnknownToTestAllTypes.OptionalGroup.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (a != null) protoMarshal.writeTag(8).writeInt32(a)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UnknownToTestAllTypes.OptionalGroup.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UnknownToTestAllTypes.OptionalGroup {
    var a: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UnknownToTestAllTypes.OptionalGroup(a, protoUnmarshal.unknownFields())
        8 -> a = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun UnknownToTestAllTypes.OptionalGroup.toJsonMapperImpl(): UnknownToTestAllTypes.OptionalGroup.JsonMapper =
    UnknownToTestAllTypes.OptionalGroup.JsonMapper(
        a
    )

private fun UnknownToTestAllTypes.OptionalGroup.JsonMapper.toMessageImpl(): UnknownToTestAllTypes.OptionalGroup =
    UnknownToTestAllTypes.OptionalGroup(
        a = a ?: null
    )

private fun UnknownToTestAllTypes.OptionalGroup.jsonMarshalImpl(json: Json): String =
    json.stringify(UnknownToTestAllTypes.OptionalGroup.JsonMapper.serializer(), toJsonMapper())

private fun UnknownToTestAllTypes.OptionalGroup.Companion.jsonUnmarshalImpl(json: Json, data: String): UnknownToTestAllTypes.OptionalGroup {
    val mapper = json.parse(UnknownToTestAllTypes.OptionalGroup.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

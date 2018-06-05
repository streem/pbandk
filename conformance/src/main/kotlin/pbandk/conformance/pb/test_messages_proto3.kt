package pbandk.conformance.pb

data class ForeignEnum(override val value: Int) : pbandk.Message.Enum {
    companion object : pbandk.Message.Enum.Companion<ForeignEnum> {
        val FOREIGN_FOO = ForeignEnum(0)
        val FOREIGN_BAR = ForeignEnum(1)
        val FOREIGN_BAZ = ForeignEnum(2)

        override fun fromValue(value: Int) = when (value) {
            0 -> FOREIGN_FOO
            1 -> FOREIGN_BAR
            2 -> FOREIGN_BAZ
            else -> ForeignEnum(value)
        }
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
    val oneofField: OneofField? = null,
    val optionalBoolWrapper: pbandk.wkt.BoolValue? = null,
    val optionalInt32Wrapper: pbandk.wkt.Int32Value? = null,
    val optionalInt64Wrapper: pbandk.wkt.Int64Value? = null,
    val optionalUint32Wrapper: pbandk.wkt.UInt32Value? = null,
    val optionalUint64Wrapper: pbandk.wkt.UInt64Value? = null,
    val optionalFloatWrapper: pbandk.wkt.FloatValue? = null,
    val optionalDoubleWrapper: pbandk.wkt.DoubleValue? = null,
    val optionalStringWrapper: pbandk.wkt.StringValue? = null,
    val optionalBytesWrapper: pbandk.wkt.BytesValue? = null,
    val repeatedBoolWrapper: List<pbandk.wkt.BoolValue> = emptyList(),
    val repeatedInt32Wrapper: List<pbandk.wkt.Int32Value> = emptyList(),
    val repeatedInt64Wrapper: List<pbandk.wkt.Int64Value> = emptyList(),
    val repeatedUint32Wrapper: List<pbandk.wkt.UInt32Value> = emptyList(),
    val repeatedUint64Wrapper: List<pbandk.wkt.UInt64Value> = emptyList(),
    val repeatedFloatWrapper: List<pbandk.wkt.FloatValue> = emptyList(),
    val repeatedDoubleWrapper: List<pbandk.wkt.DoubleValue> = emptyList(),
    val repeatedStringWrapper: List<pbandk.wkt.StringValue> = emptyList(),
    val repeatedBytesWrapper: List<pbandk.wkt.BytesValue> = emptyList(),
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
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<TestAllTypesProto3> {
    sealed class OneofField {
        data class OneofUint32(val oneofUint32: Int = 0) : OneofField()
        data class OneofNestedMessage(val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto3.NestedMessage) : OneofField()
        data class OneofString(val oneofString: String = "") : OneofField()
        data class OneofBytes(val oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField()
        data class OneofBool(val oneofBool: Boolean = false) : OneofField()
        data class OneofUint64(val oneofUint64: Long = 0L) : OneofField()
        data class OneofFloat(val oneofFloat: Float = 0.0F) : OneofField()
        data class OneofDouble(val oneofDouble: Double = 0.0) : OneofField()
        data class OneofEnum(val oneofEnum: pbandk.conformance.pb.TestAllTypesProto3.NestedEnum = pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.fromValue(0)) : OneofField()
    }

    override operator fun plus(other: TestAllTypesProto3?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<TestAllTypesProto3> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = TestAllTypesProto3.protoUnmarshalImpl(u)
    }

    data class NestedEnum(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<NestedEnum> {
            val FOO = NestedEnum(0)
            val BAR = NestedEnum(1)
            val BAZ = NestedEnum(2)
            val NEG = NestedEnum(-1)

            override fun fromValue(value: Int) = when (value) {
                0 -> FOO
                1 -> BAR
                2 -> BAZ
                -1 -> NEG
                else -> NestedEnum(value)
            }
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
        companion object : pbandk.Message.Companion<NestedMessage> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = NestedMessage.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapInt32Int32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32Int32Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapInt64Int64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt64Int64Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapUint32Uint32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapUint32Uint32Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapUint64Uint64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapUint64Uint64Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapSint32Sint32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSint32Sint32Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapSint64Sint64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSint64Sint64Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapFixed32Fixed32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapFixed32Fixed32Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapFixed64Fixed64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapFixed64Fixed64Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapSfixed32Sfixed32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSfixed32Sfixed32Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapSfixed64Sfixed64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSfixed64Sfixed64Entry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapInt32FloatEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32FloatEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapInt32DoubleEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32DoubleEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapBoolBoolEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapBoolBoolEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapStringStringEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringStringEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapStringBytesEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringBytesEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapStringNestedMessageEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringNestedMessageEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapStringForeignMessageEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringForeignMessageEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapStringNestedEnumEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringNestedEnumEntry.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<MapStringForeignEnumEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringForeignEnumEntry.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<ForeignMessage> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ForeignMessage.protoUnmarshalImpl(u)
    }
}

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
    oneofField = when {
        oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage ->
            TestAllTypesProto3.OneofField.OneofNestedMessage(oneofField.oneofNestedMessage + plus.oneofField.oneofNestedMessage)
        else ->
            plus.oneofField ?: oneofField
    },
    optionalBoolWrapper = optionalBoolWrapper?.plus(plus.optionalBoolWrapper) ?: plus.optionalBoolWrapper,
    optionalInt32Wrapper = optionalInt32Wrapper?.plus(plus.optionalInt32Wrapper) ?: plus.optionalInt32Wrapper,
    optionalInt64Wrapper = optionalInt64Wrapper?.plus(plus.optionalInt64Wrapper) ?: plus.optionalInt64Wrapper,
    optionalUint32Wrapper = optionalUint32Wrapper?.plus(plus.optionalUint32Wrapper) ?: plus.optionalUint32Wrapper,
    optionalUint64Wrapper = optionalUint64Wrapper?.plus(plus.optionalUint64Wrapper) ?: plus.optionalUint64Wrapper,
    optionalFloatWrapper = optionalFloatWrapper?.plus(plus.optionalFloatWrapper) ?: plus.optionalFloatWrapper,
    optionalDoubleWrapper = optionalDoubleWrapper?.plus(plus.optionalDoubleWrapper) ?: plus.optionalDoubleWrapper,
    optionalStringWrapper = optionalStringWrapper?.plus(plus.optionalStringWrapper) ?: plus.optionalStringWrapper,
    optionalBytesWrapper = optionalBytesWrapper?.plus(plus.optionalBytesWrapper) ?: plus.optionalBytesWrapper,
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
    if (repeatedString.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(44) + pbandk.Sizer.packedRepeatedSize(repeatedString, pbandk.Sizer::stringSize)
    if (repeatedBytes.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(45) + pbandk.Sizer.packedRepeatedSize(repeatedBytes, pbandk.Sizer::bytesSize)
    if (repeatedNestedMessage.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(48) + pbandk.Sizer.packedRepeatedSize(repeatedNestedMessage, pbandk.Sizer::messageSize)
    if (repeatedForeignMessage.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(49) + pbandk.Sizer.packedRepeatedSize(repeatedForeignMessage, pbandk.Sizer::messageSize)
    if (repeatedNestedEnum.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(51) + pbandk.Sizer.packedRepeatedSize(repeatedNestedEnum, pbandk.Sizer::enumSize)
    if (repeatedForeignEnum.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(52) + pbandk.Sizer.packedRepeatedSize(repeatedForeignEnum, pbandk.Sizer::enumSize)
    if (repeatedStringPiece.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(54) + pbandk.Sizer.packedRepeatedSize(repeatedStringPiece, pbandk.Sizer::stringSize)
    if (repeatedCord.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(55) + pbandk.Sizer.packedRepeatedSize(repeatedCord, pbandk.Sizer::stringSize)
    if (mapInt32Int32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(56) + pbandk.Sizer.mapSize(mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto3::MapInt32Int32Entry)
    if (mapInt64Int64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(57) + pbandk.Sizer.mapSize(mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto3::MapInt64Int64Entry)
    if (mapUint32Uint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(58) + pbandk.Sizer.mapSize(mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto3::MapUint32Uint32Entry)
    if (mapUint64Uint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(59) + pbandk.Sizer.mapSize(mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto3::MapUint64Uint64Entry)
    if (mapSint32Sint32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(60) + pbandk.Sizer.mapSize(mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto3::MapSint32Sint32Entry)
    if (mapSint64Sint64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(61) + pbandk.Sizer.mapSize(mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto3::MapSint64Sint64Entry)
    if (mapFixed32Fixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(62) + pbandk.Sizer.mapSize(mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto3::MapFixed32Fixed32Entry)
    if (mapFixed64Fixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(63) + pbandk.Sizer.mapSize(mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto3::MapFixed64Fixed64Entry)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(64) + pbandk.Sizer.mapSize(mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed32Sfixed32Entry)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(65) + pbandk.Sizer.mapSize(mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed64Sfixed64Entry)
    if (mapInt32Float.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(66) + pbandk.Sizer.mapSize(mapInt32Float, pbandk.conformance.pb.TestAllTypesProto3::MapInt32FloatEntry)
    if (mapInt32Double.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(67) + pbandk.Sizer.mapSize(mapInt32Double, pbandk.conformance.pb.TestAllTypesProto3::MapInt32DoubleEntry)
    if (mapBoolBool.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(68) + pbandk.Sizer.mapSize(mapBoolBool, pbandk.conformance.pb.TestAllTypesProto3::MapBoolBoolEntry)
    if (mapStringString.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(69) + pbandk.Sizer.mapSize(mapStringString, pbandk.conformance.pb.TestAllTypesProto3::MapStringStringEntry)
    if (mapStringBytes.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(70) + pbandk.Sizer.mapSize(mapStringBytes, pbandk.conformance.pb.TestAllTypesProto3::MapStringBytesEntry)
    if (mapStringNestedMessage.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(71) + pbandk.Sizer.mapSize(mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedMessageEntry)
    if (mapStringForeignMessage.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(72) + pbandk.Sizer.mapSize(mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignMessageEntry)
    if (mapStringNestedEnum.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(73) + pbandk.Sizer.mapSize(mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedEnumEntry)
    if (mapStringForeignEnum.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(74) + pbandk.Sizer.mapSize(mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignEnumEntry)
    when (oneofField) {
        is TestAllTypesProto3.OneofField.OneofUint32 -> protoSize += pbandk.Sizer.tagSize(111) + pbandk.Sizer.uInt32Size(oneofField.oneofUint32)
        is TestAllTypesProto3.OneofField.OneofNestedMessage -> protoSize += pbandk.Sizer.tagSize(112) + pbandk.Sizer.messageSize(oneofField.oneofNestedMessage)
        is TestAllTypesProto3.OneofField.OneofString -> protoSize += pbandk.Sizer.tagSize(113) + pbandk.Sizer.stringSize(oneofField.oneofString)
        is TestAllTypesProto3.OneofField.OneofBytes -> protoSize += pbandk.Sizer.tagSize(114) + pbandk.Sizer.bytesSize(oneofField.oneofBytes)
        is TestAllTypesProto3.OneofField.OneofBool -> protoSize += pbandk.Sizer.tagSize(115) + pbandk.Sizer.boolSize(oneofField.oneofBool)
        is TestAllTypesProto3.OneofField.OneofUint64 -> protoSize += pbandk.Sizer.tagSize(116) + pbandk.Sizer.uInt64Size(oneofField.oneofUint64)
        is TestAllTypesProto3.OneofField.OneofFloat -> protoSize += pbandk.Sizer.tagSize(117) + pbandk.Sizer.floatSize(oneofField.oneofFloat)
        is TestAllTypesProto3.OneofField.OneofDouble -> protoSize += pbandk.Sizer.tagSize(118) + pbandk.Sizer.doubleSize(oneofField.oneofDouble)
        is TestAllTypesProto3.OneofField.OneofEnum -> protoSize += pbandk.Sizer.tagSize(119) + pbandk.Sizer.enumSize(oneofField.oneofEnum)
    }
    if (optionalBoolWrapper != null) protoSize += pbandk.Sizer.tagSize(201) + pbandk.Sizer.messageSize(optionalBoolWrapper)
    if (optionalInt32Wrapper != null) protoSize += pbandk.Sizer.tagSize(202) + pbandk.Sizer.messageSize(optionalInt32Wrapper)
    if (optionalInt64Wrapper != null) protoSize += pbandk.Sizer.tagSize(203) + pbandk.Sizer.messageSize(optionalInt64Wrapper)
    if (optionalUint32Wrapper != null) protoSize += pbandk.Sizer.tagSize(204) + pbandk.Sizer.messageSize(optionalUint32Wrapper)
    if (optionalUint64Wrapper != null) protoSize += pbandk.Sizer.tagSize(205) + pbandk.Sizer.messageSize(optionalUint64Wrapper)
    if (optionalFloatWrapper != null) protoSize += pbandk.Sizer.tagSize(206) + pbandk.Sizer.messageSize(optionalFloatWrapper)
    if (optionalDoubleWrapper != null) protoSize += pbandk.Sizer.tagSize(207) + pbandk.Sizer.messageSize(optionalDoubleWrapper)
    if (optionalStringWrapper != null) protoSize += pbandk.Sizer.tagSize(208) + pbandk.Sizer.messageSize(optionalStringWrapper)
    if (optionalBytesWrapper != null) protoSize += pbandk.Sizer.tagSize(209) + pbandk.Sizer.messageSize(optionalBytesWrapper)
    if (repeatedBoolWrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(211) + pbandk.Sizer.packedRepeatedSize(repeatedBoolWrapper, pbandk.Sizer::messageSize)
    if (repeatedInt32Wrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(212) + pbandk.Sizer.packedRepeatedSize(repeatedInt32Wrapper, pbandk.Sizer::messageSize)
    if (repeatedInt64Wrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(213) + pbandk.Sizer.packedRepeatedSize(repeatedInt64Wrapper, pbandk.Sizer::messageSize)
    if (repeatedUint32Wrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(214) + pbandk.Sizer.packedRepeatedSize(repeatedUint32Wrapper, pbandk.Sizer::messageSize)
    if (repeatedUint64Wrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(215) + pbandk.Sizer.packedRepeatedSize(repeatedUint64Wrapper, pbandk.Sizer::messageSize)
    if (repeatedFloatWrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(216) + pbandk.Sizer.packedRepeatedSize(repeatedFloatWrapper, pbandk.Sizer::messageSize)
    if (repeatedDoubleWrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(217) + pbandk.Sizer.packedRepeatedSize(repeatedDoubleWrapper, pbandk.Sizer::messageSize)
    if (repeatedStringWrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(218) + pbandk.Sizer.packedRepeatedSize(repeatedStringWrapper, pbandk.Sizer::messageSize)
    if (repeatedBytesWrapper.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(219) + pbandk.Sizer.packedRepeatedSize(repeatedBytesWrapper, pbandk.Sizer::messageSize)
    if (optionalDuration != null) protoSize += pbandk.Sizer.tagSize(301) + pbandk.Sizer.messageSize(optionalDuration)
    if (optionalTimestamp != null) protoSize += pbandk.Sizer.tagSize(302) + pbandk.Sizer.messageSize(optionalTimestamp)
    if (optionalFieldMask != null) protoSize += pbandk.Sizer.tagSize(303) + pbandk.Sizer.messageSize(optionalFieldMask)
    if (optionalStruct != null) protoSize += pbandk.Sizer.tagSize(304) + pbandk.Sizer.messageSize(optionalStruct)
    if (optionalAny != null) protoSize += pbandk.Sizer.tagSize(305) + pbandk.Sizer.messageSize(optionalAny)
    if (optionalValue != null) protoSize += pbandk.Sizer.tagSize(306) + pbandk.Sizer.messageSize(optionalValue)
    if (repeatedDuration.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(311) + pbandk.Sizer.packedRepeatedSize(repeatedDuration, pbandk.Sizer::messageSize)
    if (repeatedTimestamp.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(312) + pbandk.Sizer.packedRepeatedSize(repeatedTimestamp, pbandk.Sizer::messageSize)
    if (repeatedFieldmask.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(313) + pbandk.Sizer.packedRepeatedSize(repeatedFieldmask, pbandk.Sizer::messageSize)
    if (repeatedStruct.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(324) + pbandk.Sizer.packedRepeatedSize(repeatedStruct, pbandk.Sizer::messageSize)
    if (repeatedAny.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(315) + pbandk.Sizer.packedRepeatedSize(repeatedAny, pbandk.Sizer::messageSize)
    if (repeatedValue.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(316) + pbandk.Sizer.packedRepeatedSize(repeatedValue, pbandk.Sizer::messageSize)
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
    if (repeatedString.isNotEmpty()) protoMarshal.writeTag(354).writePackedRepeated(repeatedString, pbandk.Sizer::stringSize, protoMarshal::writeString)
    if (repeatedBytes.isNotEmpty()) protoMarshal.writeTag(362).writePackedRepeated(repeatedBytes, pbandk.Sizer::bytesSize, protoMarshal::writeBytes)
    if (repeatedNestedMessage.isNotEmpty()) protoMarshal.writeTag(386).writePackedRepeated(repeatedNestedMessage, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedForeignMessage.isNotEmpty()) protoMarshal.writeTag(394).writePackedRepeated(repeatedForeignMessage, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedNestedEnum.isNotEmpty()) protoMarshal.writeTag(410).writePackedRepeated(repeatedNestedEnum, pbandk.Sizer::enumSize, protoMarshal::writeEnum)
    if (repeatedForeignEnum.isNotEmpty()) protoMarshal.writeTag(418).writePackedRepeated(repeatedForeignEnum, pbandk.Sizer::enumSize, protoMarshal::writeEnum)
    if (repeatedStringPiece.isNotEmpty()) protoMarshal.writeTag(434).writePackedRepeated(repeatedStringPiece, pbandk.Sizer::stringSize, protoMarshal::writeString)
    if (repeatedCord.isNotEmpty()) protoMarshal.writeTag(442).writePackedRepeated(repeatedCord, pbandk.Sizer::stringSize, protoMarshal::writeString)
    if (mapInt32Int32.isNotEmpty()) protoMarshal.writeTag(450).writeMap(mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto3::MapInt32Int32Entry)
    if (mapInt64Int64.isNotEmpty()) protoMarshal.writeTag(458).writeMap(mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto3::MapInt64Int64Entry)
    if (mapUint32Uint32.isNotEmpty()) protoMarshal.writeTag(466).writeMap(mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto3::MapUint32Uint32Entry)
    if (mapUint64Uint64.isNotEmpty()) protoMarshal.writeTag(474).writeMap(mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto3::MapUint64Uint64Entry)
    if (mapSint32Sint32.isNotEmpty()) protoMarshal.writeTag(482).writeMap(mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto3::MapSint32Sint32Entry)
    if (mapSint64Sint64.isNotEmpty()) protoMarshal.writeTag(490).writeMap(mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto3::MapSint64Sint64Entry)
    if (mapFixed32Fixed32.isNotEmpty()) protoMarshal.writeTag(498).writeMap(mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto3::MapFixed32Fixed32Entry)
    if (mapFixed64Fixed64.isNotEmpty()) protoMarshal.writeTag(506).writeMap(mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto3::MapFixed64Fixed64Entry)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoMarshal.writeTag(514).writeMap(mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed32Sfixed32Entry)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoMarshal.writeTag(522).writeMap(mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto3::MapSfixed64Sfixed64Entry)
    if (mapInt32Float.isNotEmpty()) protoMarshal.writeTag(530).writeMap(mapInt32Float, pbandk.conformance.pb.TestAllTypesProto3::MapInt32FloatEntry)
    if (mapInt32Double.isNotEmpty()) protoMarshal.writeTag(538).writeMap(mapInt32Double, pbandk.conformance.pb.TestAllTypesProto3::MapInt32DoubleEntry)
    if (mapBoolBool.isNotEmpty()) protoMarshal.writeTag(546).writeMap(mapBoolBool, pbandk.conformance.pb.TestAllTypesProto3::MapBoolBoolEntry)
    if (mapStringString.isNotEmpty()) protoMarshal.writeTag(554).writeMap(mapStringString, pbandk.conformance.pb.TestAllTypesProto3::MapStringStringEntry)
    if (mapStringBytes.isNotEmpty()) protoMarshal.writeTag(562).writeMap(mapStringBytes, pbandk.conformance.pb.TestAllTypesProto3::MapStringBytesEntry)
    if (mapStringNestedMessage.isNotEmpty()) protoMarshal.writeTag(570).writeMap(mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedMessageEntry)
    if (mapStringForeignMessage.isNotEmpty()) protoMarshal.writeTag(578).writeMap(mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignMessageEntry)
    if (mapStringNestedEnum.isNotEmpty()) protoMarshal.writeTag(586).writeMap(mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringNestedEnumEntry)
    if (mapStringForeignEnum.isNotEmpty()) protoMarshal.writeTag(594).writeMap(mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto3::MapStringForeignEnumEntry)
    if (oneofField is TestAllTypesProto3.OneofField.OneofUint32) protoMarshal.writeTag(888).writeUInt32(oneofField.oneofUint32)
    if (oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage) protoMarshal.writeTag(898).writeMessage(oneofField.oneofNestedMessage)
    if (oneofField is TestAllTypesProto3.OneofField.OneofString) protoMarshal.writeTag(906).writeString(oneofField.oneofString)
    if (oneofField is TestAllTypesProto3.OneofField.OneofBytes) protoMarshal.writeTag(914).writeBytes(oneofField.oneofBytes)
    if (oneofField is TestAllTypesProto3.OneofField.OneofBool) protoMarshal.writeTag(920).writeBool(oneofField.oneofBool)
    if (oneofField is TestAllTypesProto3.OneofField.OneofUint64) protoMarshal.writeTag(928).writeUInt64(oneofField.oneofUint64)
    if (oneofField is TestAllTypesProto3.OneofField.OneofFloat) protoMarshal.writeTag(941).writeFloat(oneofField.oneofFloat)
    if (oneofField is TestAllTypesProto3.OneofField.OneofDouble) protoMarshal.writeTag(945).writeDouble(oneofField.oneofDouble)
    if (oneofField is TestAllTypesProto3.OneofField.OneofEnum) protoMarshal.writeTag(952).writeEnum(oneofField.oneofEnum)
    if (optionalBoolWrapper != null) protoMarshal.writeTag(1610).writeMessage(optionalBoolWrapper)
    if (optionalInt32Wrapper != null) protoMarshal.writeTag(1618).writeMessage(optionalInt32Wrapper)
    if (optionalInt64Wrapper != null) protoMarshal.writeTag(1626).writeMessage(optionalInt64Wrapper)
    if (optionalUint32Wrapper != null) protoMarshal.writeTag(1634).writeMessage(optionalUint32Wrapper)
    if (optionalUint64Wrapper != null) protoMarshal.writeTag(1642).writeMessage(optionalUint64Wrapper)
    if (optionalFloatWrapper != null) protoMarshal.writeTag(1650).writeMessage(optionalFloatWrapper)
    if (optionalDoubleWrapper != null) protoMarshal.writeTag(1658).writeMessage(optionalDoubleWrapper)
    if (optionalStringWrapper != null) protoMarshal.writeTag(1666).writeMessage(optionalStringWrapper)
    if (optionalBytesWrapper != null) protoMarshal.writeTag(1674).writeMessage(optionalBytesWrapper)
    if (repeatedBoolWrapper.isNotEmpty()) protoMarshal.writeTag(1690).writePackedRepeated(repeatedBoolWrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedInt32Wrapper.isNotEmpty()) protoMarshal.writeTag(1698).writePackedRepeated(repeatedInt32Wrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedInt64Wrapper.isNotEmpty()) protoMarshal.writeTag(1706).writePackedRepeated(repeatedInt64Wrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedUint32Wrapper.isNotEmpty()) protoMarshal.writeTag(1714).writePackedRepeated(repeatedUint32Wrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedUint64Wrapper.isNotEmpty()) protoMarshal.writeTag(1722).writePackedRepeated(repeatedUint64Wrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedFloatWrapper.isNotEmpty()) protoMarshal.writeTag(1730).writePackedRepeated(repeatedFloatWrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedDoubleWrapper.isNotEmpty()) protoMarshal.writeTag(1738).writePackedRepeated(repeatedDoubleWrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedStringWrapper.isNotEmpty()) protoMarshal.writeTag(1746).writePackedRepeated(repeatedStringWrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedBytesWrapper.isNotEmpty()) protoMarshal.writeTag(1754).writePackedRepeated(repeatedBytesWrapper, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (optionalDuration != null) protoMarshal.writeTag(2410).writeMessage(optionalDuration)
    if (optionalTimestamp != null) protoMarshal.writeTag(2418).writeMessage(optionalTimestamp)
    if (optionalFieldMask != null) protoMarshal.writeTag(2426).writeMessage(optionalFieldMask)
    if (optionalStruct != null) protoMarshal.writeTag(2434).writeMessage(optionalStruct)
    if (optionalAny != null) protoMarshal.writeTag(2442).writeMessage(optionalAny)
    if (optionalValue != null) protoMarshal.writeTag(2450).writeMessage(optionalValue)
    if (repeatedDuration.isNotEmpty()) protoMarshal.writeTag(2490).writePackedRepeated(repeatedDuration, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedTimestamp.isNotEmpty()) protoMarshal.writeTag(2498).writePackedRepeated(repeatedTimestamp, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedFieldmask.isNotEmpty()) protoMarshal.writeTag(2506).writePackedRepeated(repeatedFieldmask, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedAny.isNotEmpty()) protoMarshal.writeTag(2522).writePackedRepeated(repeatedAny, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedValue.isNotEmpty()) protoMarshal.writeTag(2530).writePackedRepeated(repeatedValue, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
    if (repeatedStruct.isNotEmpty()) protoMarshal.writeTag(2594).writePackedRepeated(repeatedStruct, pbandk.Sizer::messageSize, protoMarshal::writeMessage)
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
    var mapInt32Int32: pbandk.MapWithSize.Builder<Int, Int>? = null
    var mapInt64Int64: pbandk.MapWithSize.Builder<Long, Long>? = null
    var mapUint32Uint32: pbandk.MapWithSize.Builder<Int, Int>? = null
    var mapUint64Uint64: pbandk.MapWithSize.Builder<Long, Long>? = null
    var mapSint32Sint32: pbandk.MapWithSize.Builder<Int, Int>? = null
    var mapSint64Sint64: pbandk.MapWithSize.Builder<Long, Long>? = null
    var mapFixed32Fixed32: pbandk.MapWithSize.Builder<Int, Int>? = null
    var mapFixed64Fixed64: pbandk.MapWithSize.Builder<Long, Long>? = null
    var mapSfixed32Sfixed32: pbandk.MapWithSize.Builder<Int, Int>? = null
    var mapSfixed64Sfixed64: pbandk.MapWithSize.Builder<Long, Long>? = null
    var mapInt32Float: pbandk.MapWithSize.Builder<Int, Float>? = null
    var mapInt32Double: pbandk.MapWithSize.Builder<Int, Double>? = null
    var mapBoolBool: pbandk.MapWithSize.Builder<Boolean, Boolean>? = null
    var mapStringString: pbandk.MapWithSize.Builder<String, String>? = null
    var mapStringBytes: pbandk.MapWithSize.Builder<String, pbandk.ByteArr>? = null
    var mapStringNestedMessage: pbandk.MapWithSize.Builder<String, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage?>? = null
    var mapStringForeignMessage: pbandk.MapWithSize.Builder<String, pbandk.conformance.pb.ForeignMessage?>? = null
    var mapStringNestedEnum: pbandk.MapWithSize.Builder<String, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum>? = null
    var mapStringForeignEnum: pbandk.MapWithSize.Builder<String, pbandk.conformance.pb.ForeignEnum>? = null
    var oneofField: TestAllTypesProto3.OneofField? = null
    var optionalBoolWrapper: pbandk.wkt.BoolValue? = null
    var optionalInt32Wrapper: pbandk.wkt.Int32Value? = null
    var optionalInt64Wrapper: pbandk.wkt.Int64Value? = null
    var optionalUint32Wrapper: pbandk.wkt.UInt32Value? = null
    var optionalUint64Wrapper: pbandk.wkt.UInt64Value? = null
    var optionalFloatWrapper: pbandk.wkt.FloatValue? = null
    var optionalDoubleWrapper: pbandk.wkt.DoubleValue? = null
    var optionalStringWrapper: pbandk.wkt.StringValue? = null
    var optionalBytesWrapper: pbandk.wkt.BytesValue? = null
    var repeatedBoolWrapper: pbandk.ListWithSize.Builder<pbandk.wkt.BoolValue>? = null
    var repeatedInt32Wrapper: pbandk.ListWithSize.Builder<pbandk.wkt.Int32Value>? = null
    var repeatedInt64Wrapper: pbandk.ListWithSize.Builder<pbandk.wkt.Int64Value>? = null
    var repeatedUint32Wrapper: pbandk.ListWithSize.Builder<pbandk.wkt.UInt32Value>? = null
    var repeatedUint64Wrapper: pbandk.ListWithSize.Builder<pbandk.wkt.UInt64Value>? = null
    var repeatedFloatWrapper: pbandk.ListWithSize.Builder<pbandk.wkt.FloatValue>? = null
    var repeatedDoubleWrapper: pbandk.ListWithSize.Builder<pbandk.wkt.DoubleValue>? = null
    var repeatedStringWrapper: pbandk.ListWithSize.Builder<pbandk.wkt.StringValue>? = null
    var repeatedBytesWrapper: pbandk.ListWithSize.Builder<pbandk.wkt.BytesValue>? = null
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
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto3(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
            optionalSint32, optionalSint64, optionalFixed32, optionalFixed64,
            optionalSfixed32, optionalSfixed64, optionalFloat, optionalDouble,
            optionalBool, optionalString, optionalBytes, optionalNestedMessage,
            optionalForeignMessage, optionalNestedEnum, optionalForeignEnum, optionalStringPiece,
            optionalCord, recursiveMessage, pbandk.ListWithSize.Builder.fixed(repeatedInt32), pbandk.ListWithSize.Builder.fixed(repeatedInt64),
            pbandk.ListWithSize.Builder.fixed(repeatedUint32), pbandk.ListWithSize.Builder.fixed(repeatedUint64), pbandk.ListWithSize.Builder.fixed(repeatedSint32), pbandk.ListWithSize.Builder.fixed(repeatedSint64),
            pbandk.ListWithSize.Builder.fixed(repeatedFixed32), pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedSfixed32), pbandk.ListWithSize.Builder.fixed(repeatedSfixed64),
            pbandk.ListWithSize.Builder.fixed(repeatedFloat), pbandk.ListWithSize.Builder.fixed(repeatedDouble), pbandk.ListWithSize.Builder.fixed(repeatedBool), pbandk.ListWithSize.Builder.fixed(repeatedString),
            pbandk.ListWithSize.Builder.fixed(repeatedBytes), pbandk.ListWithSize.Builder.fixed(repeatedNestedMessage), pbandk.ListWithSize.Builder.fixed(repeatedForeignMessage), pbandk.ListWithSize.Builder.fixed(repeatedNestedEnum),
            pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord), pbandk.MapWithSize.Builder.fixed(mapInt32Int32),
            pbandk.MapWithSize.Builder.fixed(mapInt64Int64), pbandk.MapWithSize.Builder.fixed(mapUint32Uint32), pbandk.MapWithSize.Builder.fixed(mapUint64Uint64), pbandk.MapWithSize.Builder.fixed(mapSint32Sint32),
            pbandk.MapWithSize.Builder.fixed(mapSint64Sint64), pbandk.MapWithSize.Builder.fixed(mapFixed32Fixed32), pbandk.MapWithSize.Builder.fixed(mapFixed64Fixed64), pbandk.MapWithSize.Builder.fixed(mapSfixed32Sfixed32),
            pbandk.MapWithSize.Builder.fixed(mapSfixed64Sfixed64), pbandk.MapWithSize.Builder.fixed(mapInt32Float), pbandk.MapWithSize.Builder.fixed(mapInt32Double), pbandk.MapWithSize.Builder.fixed(mapBoolBool),
            pbandk.MapWithSize.Builder.fixed(mapStringString), pbandk.MapWithSize.Builder.fixed(mapStringBytes), pbandk.MapWithSize.Builder.fixed(mapStringNestedMessage), pbandk.MapWithSize.Builder.fixed(mapStringForeignMessage),
            pbandk.MapWithSize.Builder.fixed(mapStringNestedEnum), pbandk.MapWithSize.Builder.fixed(mapStringForeignEnum), oneofField, optionalBoolWrapper,
            optionalInt32Wrapper, optionalInt64Wrapper, optionalUint32Wrapper, optionalUint64Wrapper,
            optionalFloatWrapper, optionalDoubleWrapper, optionalStringWrapper, optionalBytesWrapper,
            pbandk.ListWithSize.Builder.fixed(repeatedBoolWrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt32Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedUint32Wrapper),
            pbandk.ListWithSize.Builder.fixed(repeatedUint64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedFloatWrapper), pbandk.ListWithSize.Builder.fixed(repeatedDoubleWrapper), pbandk.ListWithSize.Builder.fixed(repeatedStringWrapper),
            pbandk.ListWithSize.Builder.fixed(repeatedBytesWrapper), optionalDuration, optionalTimestamp, optionalFieldMask,
            optionalStruct, optionalAny, optionalValue, pbandk.ListWithSize.Builder.fixed(repeatedDuration),
            pbandk.ListWithSize.Builder.fixed(repeatedTimestamp), pbandk.ListWithSize.Builder.fixed(repeatedFieldmask), pbandk.ListWithSize.Builder.fixed(repeatedStruct), pbandk.ListWithSize.Builder.fixed(repeatedAny),
            pbandk.ListWithSize.Builder.fixed(repeatedValue), fieldname1, fieldName2, fieldName3,
            field_name4, field0name5, field0Name6, fieldName7,
            fieldName8, fieldName9, fieldName10, fIELDNAME11,
            fIELDName12, _fieldName13, _FieldName14, field_name15,
            field_Name16, fieldName17_, fieldName18_, protoUnmarshal.unknownFields())
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
        194 -> optionalStringPiece = protoUnmarshal.readString()
        202 -> optionalCord = protoUnmarshal.readString()
        218 -> recursiveMessage = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto3.Companion)
        250 -> repeatedInt32 = protoUnmarshal.readRepeated(repeatedInt32, protoUnmarshal::readInt32)
        258 -> repeatedInt64 = protoUnmarshal.readRepeated(repeatedInt64, protoUnmarshal::readInt64)
        266 -> repeatedUint32 = protoUnmarshal.readRepeated(repeatedUint32, protoUnmarshal::readUInt32)
        274 -> repeatedUint64 = protoUnmarshal.readRepeated(repeatedUint64, protoUnmarshal::readUInt64)
        282 -> repeatedSint32 = protoUnmarshal.readRepeated(repeatedSint32, protoUnmarshal::readSInt32)
        290 -> repeatedSint64 = protoUnmarshal.readRepeated(repeatedSint64, protoUnmarshal::readSInt64)
        298 -> repeatedFixed32 = protoUnmarshal.readRepeated(repeatedFixed32, protoUnmarshal::readFixed32)
        306 -> repeatedFixed64 = protoUnmarshal.readRepeated(repeatedFixed64, protoUnmarshal::readFixed64)
        314 -> repeatedSfixed32 = protoUnmarshal.readRepeated(repeatedSfixed32, protoUnmarshal::readSFixed32)
        322 -> repeatedSfixed64 = protoUnmarshal.readRepeated(repeatedSfixed64, protoUnmarshal::readSFixed64)
        330 -> repeatedFloat = protoUnmarshal.readRepeated(repeatedFloat, protoUnmarshal::readFloat)
        338 -> repeatedDouble = protoUnmarshal.readRepeated(repeatedDouble, protoUnmarshal::readDouble)
        346 -> repeatedBool = protoUnmarshal.readRepeated(repeatedBool, protoUnmarshal::readBool)
        354 -> repeatedString = protoUnmarshal.readRepeated(repeatedString, protoUnmarshal::readString)
        362 -> repeatedBytes = protoUnmarshal.readRepeated(repeatedBytes, protoUnmarshal::readBytes)
        386 -> repeatedNestedMessage = protoUnmarshal.readRepeatedMessage(repeatedNestedMessage, pbandk.conformance.pb.TestAllTypesProto3.NestedMessage.Companion)
        394 -> repeatedForeignMessage = protoUnmarshal.readRepeatedMessage(repeatedForeignMessage, pbandk.conformance.pb.ForeignMessage.Companion)
        410 -> repeatedNestedEnum = protoUnmarshal.readRepeatedEnum(repeatedNestedEnum, pbandk.conformance.pb.TestAllTypesProto3.NestedEnum.Companion)
        418 -> repeatedForeignEnum = protoUnmarshal.readRepeatedEnum(repeatedForeignEnum, pbandk.conformance.pb.ForeignEnum.Companion)
        434 -> repeatedStringPiece = protoUnmarshal.readRepeated(repeatedStringPiece, protoUnmarshal::readString)
        442 -> repeatedCord = protoUnmarshal.readRepeated(repeatedCord, protoUnmarshal::readString)
        450 -> mapInt32Int32 = protoUnmarshal.readMap(mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto3.MapInt32Int32Entry.Companion)
        458 -> mapInt64Int64 = protoUnmarshal.readMap(mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto3.MapInt64Int64Entry.Companion)
        466 -> mapUint32Uint32 = protoUnmarshal.readMap(mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto3.MapUint32Uint32Entry.Companion)
        474 -> mapUint64Uint64 = protoUnmarshal.readMap(mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto3.MapUint64Uint64Entry.Companion)
        482 -> mapSint32Sint32 = protoUnmarshal.readMap(mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto3.MapSint32Sint32Entry.Companion)
        490 -> mapSint64Sint64 = protoUnmarshal.readMap(mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto3.MapSint64Sint64Entry.Companion)
        498 -> mapFixed32Fixed32 = protoUnmarshal.readMap(mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto3.MapFixed32Fixed32Entry.Companion)
        506 -> mapFixed64Fixed64 = protoUnmarshal.readMap(mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto3.MapFixed64Fixed64Entry.Companion)
        514 -> mapSfixed32Sfixed32 = protoUnmarshal.readMap(mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion)
        522 -> mapSfixed64Sfixed64 = protoUnmarshal.readMap(mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion)
        530 -> mapInt32Float = protoUnmarshal.readMap(mapInt32Float, pbandk.conformance.pb.TestAllTypesProto3.MapInt32FloatEntry.Companion)
        538 -> mapInt32Double = protoUnmarshal.readMap(mapInt32Double, pbandk.conformance.pb.TestAllTypesProto3.MapInt32DoubleEntry.Companion)
        546 -> mapBoolBool = protoUnmarshal.readMap(mapBoolBool, pbandk.conformance.pb.TestAllTypesProto3.MapBoolBoolEntry.Companion)
        554 -> mapStringString = protoUnmarshal.readMap(mapStringString, pbandk.conformance.pb.TestAllTypesProto3.MapStringStringEntry.Companion)
        562 -> mapStringBytes = protoUnmarshal.readMap(mapStringBytes, pbandk.conformance.pb.TestAllTypesProto3.MapStringBytesEntry.Companion)
        570 -> mapStringNestedMessage = protoUnmarshal.readMap(mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedMessageEntry.Companion)
        578 -> mapStringForeignMessage = protoUnmarshal.readMap(mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignMessageEntry.Companion)
        586 -> mapStringNestedEnum = protoUnmarshal.readMap(mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto3.MapStringNestedEnumEntry.Companion)
        594 -> mapStringForeignEnum = protoUnmarshal.readMap(mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto3.MapStringForeignEnumEntry.Companion)
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
        1690 -> repeatedBoolWrapper = protoUnmarshal.readRepeatedMessage(repeatedBoolWrapper, pbandk.wkt.BoolValue.Companion)
        1698 -> repeatedInt32Wrapper = protoUnmarshal.readRepeatedMessage(repeatedInt32Wrapper, pbandk.wkt.Int32Value.Companion)
        1706 -> repeatedInt64Wrapper = protoUnmarshal.readRepeatedMessage(repeatedInt64Wrapper, pbandk.wkt.Int64Value.Companion)
        1714 -> repeatedUint32Wrapper = protoUnmarshal.readRepeatedMessage(repeatedUint32Wrapper, pbandk.wkt.UInt32Value.Companion)
        1722 -> repeatedUint64Wrapper = protoUnmarshal.readRepeatedMessage(repeatedUint64Wrapper, pbandk.wkt.UInt64Value.Companion)
        1730 -> repeatedFloatWrapper = protoUnmarshal.readRepeatedMessage(repeatedFloatWrapper, pbandk.wkt.FloatValue.Companion)
        1738 -> repeatedDoubleWrapper = protoUnmarshal.readRepeatedMessage(repeatedDoubleWrapper, pbandk.wkt.DoubleValue.Companion)
        1746 -> repeatedStringWrapper = protoUnmarshal.readRepeatedMessage(repeatedStringWrapper, pbandk.wkt.StringValue.Companion)
        1754 -> repeatedBytesWrapper = protoUnmarshal.readRepeatedMessage(repeatedBytesWrapper, pbandk.wkt.BytesValue.Companion)
        2410 -> optionalDuration = protoUnmarshal.readMessage(pbandk.wkt.Duration.Companion)
        2418 -> optionalTimestamp = protoUnmarshal.readMessage(pbandk.wkt.Timestamp.Companion)
        2426 -> optionalFieldMask = protoUnmarshal.readMessage(pbandk.wkt.FieldMask.Companion)
        2434 -> optionalStruct = protoUnmarshal.readMessage(pbandk.wkt.Struct.Companion)
        2442 -> optionalAny = protoUnmarshal.readMessage(pbandk.wkt.Any.Companion)
        2450 -> optionalValue = protoUnmarshal.readMessage(pbandk.wkt.Value.Companion)
        2490 -> repeatedDuration = protoUnmarshal.readRepeatedMessage(repeatedDuration, pbandk.wkt.Duration.Companion)
        2498 -> repeatedTimestamp = protoUnmarshal.readRepeatedMessage(repeatedTimestamp, pbandk.wkt.Timestamp.Companion)
        2506 -> repeatedFieldmask = protoUnmarshal.readRepeatedMessage(repeatedFieldmask, pbandk.wkt.FieldMask.Companion)
        2522 -> repeatedAny = protoUnmarshal.readRepeatedMessage(repeatedAny, pbandk.wkt.Any.Companion)
        2530 -> repeatedValue = protoUnmarshal.readRepeatedMessage(repeatedValue, pbandk.wkt.Value.Companion)
        2594 -> repeatedStruct = protoUnmarshal.readRepeatedMessage(repeatedStruct, pbandk.wkt.Struct.Companion)
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

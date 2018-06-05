package pbandk.conformance.pb

data class ForeignEnumProto2(override val value: Int) : pbandk.Message.Enum {
    companion object : pbandk.Message.Enum.Companion<ForeignEnumProto2> {
        val FOREIGN_FOO = ForeignEnumProto2(0)
        val FOREIGN_BAR = ForeignEnumProto2(1)
        val FOREIGN_BAZ = ForeignEnumProto2(2)

        override fun fromValue(value: Int) = when (value) {
            0 -> FOREIGN_FOO
            1 -> FOREIGN_BAR
            2 -> FOREIGN_BAZ
            else -> ForeignEnumProto2(value)
        }
    }
}

data class TestAllTypesProto2(
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
    val optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
    val optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = null,
    val optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0),
    val optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2 = pbandk.conformance.pb.ForeignEnumProto2.fromValue(0),
    val optionalStringPiece: String = "",
    val optionalCord: String = "",
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
    val mapInt32Int32: List<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry> = emptyList(),
    val mapInt64Int64: List<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry> = emptyList(),
    val mapUint32Uint32: List<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry> = emptyList(),
    val mapUint64Uint64: List<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry> = emptyList(),
    val mapSint32Sint32: List<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry> = emptyList(),
    val mapSint64Sint64: List<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry> = emptyList(),
    val mapFixed32Fixed32: List<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry> = emptyList(),
    val mapFixed64Fixed64: List<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry> = emptyList(),
    val mapSfixed32Sfixed32: List<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry> = emptyList(),
    val mapSfixed64Sfixed64: List<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry> = emptyList(),
    val mapInt32Float: List<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry> = emptyList(),
    val mapInt32Double: List<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry> = emptyList(),
    val mapBoolBool: List<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry> = emptyList(),
    val mapStringString: List<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry> = emptyList(),
    val mapStringBytes: List<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry> = emptyList(),
    val mapStringNestedMessage: List<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry> = emptyList(),
    val mapStringForeignMessage: List<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry> = emptyList(),
    val mapStringNestedEnum: List<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry> = emptyList(),
    val mapStringForeignEnum: List<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry> = emptyList(),
    val oneofField: OneofField? = null,
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
) : pbandk.Message<TestAllTypesProto2> {
    sealed class OneofField {
        data class OneofUint32(val oneofUint32: Int = 0) : OneofField()
        data class OneofNestedMessage(val oneofNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage) : OneofField()
        data class OneofString(val oneofString: String = "") : OneofField()
        data class OneofBytes(val oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField()
        data class OneofBool(val oneofBool: Boolean = false) : OneofField()
        data class OneofUint64(val oneofUint64: Long = 0L) : OneofField()
        data class OneofFloat(val oneofFloat: Float = 0.0F) : OneofField()
        data class OneofDouble(val oneofDouble: Double = 0.0) : OneofField()
        data class OneofEnum(val oneofEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0)) : OneofField()
    }

    override operator fun plus(other: TestAllTypesProto2?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<TestAllTypesProto2> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = TestAllTypesProto2.protoUnmarshalImpl(u)
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
        val corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null,
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
        val key: Int = 0,
        val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32Int32Entry> {
        override operator fun plus(other: MapInt32Int32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapInt32Int32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32Int32Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapInt64Int64Entry(
        val key: Long = 0L,
        val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt64Int64Entry> {
        override operator fun plus(other: MapInt64Int64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapInt64Int64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt64Int64Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapUint32Uint32Entry(
        val key: Int = 0,
        val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapUint32Uint32Entry> {
        override operator fun plus(other: MapUint32Uint32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapUint32Uint32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapUint32Uint32Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapUint64Uint64Entry(
        val key: Long = 0L,
        val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapUint64Uint64Entry> {
        override operator fun plus(other: MapUint64Uint64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapUint64Uint64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapUint64Uint64Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapSint32Sint32Entry(
        val key: Int = 0,
        val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSint32Sint32Entry> {
        override operator fun plus(other: MapSint32Sint32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapSint32Sint32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSint32Sint32Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapSint64Sint64Entry(
        val key: Long = 0L,
        val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSint64Sint64Entry> {
        override operator fun plus(other: MapSint64Sint64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapSint64Sint64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSint64Sint64Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapFixed32Fixed32Entry(
        val key: Int = 0,
        val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapFixed32Fixed32Entry> {
        override operator fun plus(other: MapFixed32Fixed32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapFixed32Fixed32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapFixed32Fixed32Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapFixed64Fixed64Entry(
        val key: Long = 0L,
        val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapFixed64Fixed64Entry> {
        override operator fun plus(other: MapFixed64Fixed64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapFixed64Fixed64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapFixed64Fixed64Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapSfixed32Sfixed32Entry(
        val key: Int = 0,
        val value: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSfixed32Sfixed32Entry> {
        override operator fun plus(other: MapSfixed32Sfixed32Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapSfixed32Sfixed32Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSfixed32Sfixed32Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapSfixed64Sfixed64Entry(
        val key: Long = 0L,
        val value: Long = 0L,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapSfixed64Sfixed64Entry> {
        override operator fun plus(other: MapSfixed64Sfixed64Entry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapSfixed64Sfixed64Entry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapSfixed64Sfixed64Entry.protoUnmarshalImpl(u)
        }
    }

    data class MapInt32FloatEntry(
        val key: Int = 0,
        val value: Float = 0.0F,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32FloatEntry> {
        override operator fun plus(other: MapInt32FloatEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapInt32FloatEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32FloatEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapInt32DoubleEntry(
        val key: Int = 0,
        val value: Double = 0.0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapInt32DoubleEntry> {
        override operator fun plus(other: MapInt32DoubleEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapInt32DoubleEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapInt32DoubleEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapBoolBoolEntry(
        val key: Boolean = false,
        val value: Boolean = false,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapBoolBoolEntry> {
        override operator fun plus(other: MapBoolBoolEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapBoolBoolEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapBoolBoolEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapStringStringEntry(
        val key: String = "",
        val value: String = "",
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringStringEntry> {
        override operator fun plus(other: MapStringStringEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapStringStringEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringStringEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapStringBytesEntry(
        val key: String = "",
        val value: pbandk.ByteArr = pbandk.ByteArr.empty,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringBytesEntry> {
        override operator fun plus(other: MapStringBytesEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapStringBytesEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringBytesEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapStringNestedMessageEntry(
        val key: String = "",
        val value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringNestedMessageEntry> {
        override operator fun plus(other: MapStringNestedMessageEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapStringNestedMessageEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringNestedMessageEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapStringForeignMessageEntry(
        val key: String = "",
        val value: pbandk.conformance.pb.ForeignMessageProto2? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringForeignMessageEntry> {
        override operator fun plus(other: MapStringForeignMessageEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapStringForeignMessageEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringForeignMessageEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapStringNestedEnumEntry(
        val key: String = "",
        val value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0),
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringNestedEnumEntry> {
        override operator fun plus(other: MapStringNestedEnumEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapStringNestedEnumEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringNestedEnumEntry.protoUnmarshalImpl(u)
        }
    }

    data class MapStringForeignEnumEntry(
        val key: String = "",
        val value: pbandk.conformance.pb.ForeignEnumProto2 = pbandk.conformance.pb.ForeignEnumProto2.fromValue(0),
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MapStringForeignEnumEntry> {
        override operator fun plus(other: MapStringForeignEnumEntry?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MapStringForeignEnumEntry> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MapStringForeignEnumEntry.protoUnmarshalImpl(u)
        }
    }

    data class Data(
        val groupInt32: Int = 0,
        val groupUint32: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<Data> {
        override operator fun plus(other: Data?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<Data> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = Data.protoUnmarshalImpl(u)
        }
    }

    data class MessageSetCorrect(
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MessageSetCorrect> {
        override operator fun plus(other: MessageSetCorrect?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MessageSetCorrect> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageSetCorrect.protoUnmarshalImpl(u)
        }
    }

    data class MessageSetCorrectExtension1(
        val str: String = "",
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MessageSetCorrectExtension1> {
        override operator fun plus(other: MessageSetCorrectExtension1?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MessageSetCorrectExtension1> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageSetCorrectExtension1.protoUnmarshalImpl(u)
        }
    }

    data class MessageSetCorrectExtension2(
        val i: Int = 0,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<MessageSetCorrectExtension2> {
        override operator fun plus(other: MessageSetCorrectExtension2?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<MessageSetCorrectExtension2> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageSetCorrectExtension2.protoUnmarshalImpl(u)
        }
    }
}

data class ForeignMessageProto2(
    val c: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ForeignMessageProto2> {
    override operator fun plus(other: ForeignMessageProto2?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<ForeignMessageProto2> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ForeignMessageProto2.protoUnmarshalImpl(u)
    }
}

private fun TestAllTypesProto2.protoMergeImpl(plus: TestAllTypesProto2?): TestAllTypesProto2 = plus?.copy(
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
        oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage ->
            TestAllTypesProto2.OneofField.OneofNestedMessage(oneofField.oneofNestedMessage + plus.oneofField.oneofNestedMessage)
        else ->
            plus.oneofField ?: oneofField
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.protoSizeImpl(): Int {
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
    if (mapInt32Int32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(56) * mapInt32Int32.size) + mapInt32Int32.sumBy(pbandk.Sizer::messageSize)
    if (mapInt64Int64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(57) * mapInt64Int64.size) + mapInt64Int64.sumBy(pbandk.Sizer::messageSize)
    if (mapUint32Uint32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(58) * mapUint32Uint32.size) + mapUint32Uint32.sumBy(pbandk.Sizer::messageSize)
    if (mapUint64Uint64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(59) * mapUint64Uint64.size) + mapUint64Uint64.sumBy(pbandk.Sizer::messageSize)
    if (mapSint32Sint32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(60) * mapSint32Sint32.size) + mapSint32Sint32.sumBy(pbandk.Sizer::messageSize)
    if (mapSint64Sint64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(61) * mapSint64Sint64.size) + mapSint64Sint64.sumBy(pbandk.Sizer::messageSize)
    if (mapFixed32Fixed32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(62) * mapFixed32Fixed32.size) + mapFixed32Fixed32.sumBy(pbandk.Sizer::messageSize)
    if (mapFixed64Fixed64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(63) * mapFixed64Fixed64.size) + mapFixed64Fixed64.sumBy(pbandk.Sizer::messageSize)
    if (mapSfixed32Sfixed32.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(64) * mapSfixed32Sfixed32.size) + mapSfixed32Sfixed32.sumBy(pbandk.Sizer::messageSize)
    if (mapSfixed64Sfixed64.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(65) * mapSfixed64Sfixed64.size) + mapSfixed64Sfixed64.sumBy(pbandk.Sizer::messageSize)
    if (mapInt32Float.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(66) * mapInt32Float.size) + mapInt32Float.sumBy(pbandk.Sizer::messageSize)
    if (mapInt32Double.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(67) * mapInt32Double.size) + mapInt32Double.sumBy(pbandk.Sizer::messageSize)
    if (mapBoolBool.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(68) * mapBoolBool.size) + mapBoolBool.sumBy(pbandk.Sizer::messageSize)
    if (mapStringString.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(69) * mapStringString.size) + mapStringString.sumBy(pbandk.Sizer::messageSize)
    if (mapStringBytes.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(70) * mapStringBytes.size) + mapStringBytes.sumBy(pbandk.Sizer::messageSize)
    if (mapStringNestedMessage.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(71) * mapStringNestedMessage.size) + mapStringNestedMessage.sumBy(pbandk.Sizer::messageSize)
    if (mapStringForeignMessage.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(72) * mapStringForeignMessage.size) + mapStringForeignMessage.sumBy(pbandk.Sizer::messageSize)
    if (mapStringNestedEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(73) * mapStringNestedEnum.size) + mapStringNestedEnum.sumBy(pbandk.Sizer::messageSize)
    if (mapStringForeignEnum.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(74) * mapStringForeignEnum.size) + mapStringForeignEnum.sumBy(pbandk.Sizer::messageSize)
    when (oneofField) {
        is TestAllTypesProto2.OneofField.OneofUint32 -> protoSize += pbandk.Sizer.tagSize(111) + pbandk.Sizer.uInt32Size(oneofField.oneofUint32)
        is TestAllTypesProto2.OneofField.OneofNestedMessage -> protoSize += pbandk.Sizer.tagSize(112) + pbandk.Sizer.messageSize(oneofField.oneofNestedMessage)
        is TestAllTypesProto2.OneofField.OneofString -> protoSize += pbandk.Sizer.tagSize(113) + pbandk.Sizer.stringSize(oneofField.oneofString)
        is TestAllTypesProto2.OneofField.OneofBytes -> protoSize += pbandk.Sizer.tagSize(114) + pbandk.Sizer.bytesSize(oneofField.oneofBytes)
        is TestAllTypesProto2.OneofField.OneofBool -> protoSize += pbandk.Sizer.tagSize(115) + pbandk.Sizer.boolSize(oneofField.oneofBool)
        is TestAllTypesProto2.OneofField.OneofUint64 -> protoSize += pbandk.Sizer.tagSize(116) + pbandk.Sizer.uInt64Size(oneofField.oneofUint64)
        is TestAllTypesProto2.OneofField.OneofFloat -> protoSize += pbandk.Sizer.tagSize(117) + pbandk.Sizer.floatSize(oneofField.oneofFloat)
        is TestAllTypesProto2.OneofField.OneofDouble -> protoSize += pbandk.Sizer.tagSize(118) + pbandk.Sizer.doubleSize(oneofField.oneofDouble)
        is TestAllTypesProto2.OneofField.OneofEnum -> protoSize += pbandk.Sizer.tagSize(119) + pbandk.Sizer.enumSize(oneofField.oneofEnum)
    }
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

private fun TestAllTypesProto2.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
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
    if (mapInt32Int32.isNotEmpty()) mapInt32Int32.forEach { protoMarshal.writeTag(450).writeMessage(it) }
    if (mapInt64Int64.isNotEmpty()) mapInt64Int64.forEach { protoMarshal.writeTag(458).writeMessage(it) }
    if (mapUint32Uint32.isNotEmpty()) mapUint32Uint32.forEach { protoMarshal.writeTag(466).writeMessage(it) }
    if (mapUint64Uint64.isNotEmpty()) mapUint64Uint64.forEach { protoMarshal.writeTag(474).writeMessage(it) }
    if (mapSint32Sint32.isNotEmpty()) mapSint32Sint32.forEach { protoMarshal.writeTag(482).writeMessage(it) }
    if (mapSint64Sint64.isNotEmpty()) mapSint64Sint64.forEach { protoMarshal.writeTag(490).writeMessage(it) }
    if (mapFixed32Fixed32.isNotEmpty()) mapFixed32Fixed32.forEach { protoMarshal.writeTag(498).writeMessage(it) }
    if (mapFixed64Fixed64.isNotEmpty()) mapFixed64Fixed64.forEach { protoMarshal.writeTag(506).writeMessage(it) }
    if (mapSfixed32Sfixed32.isNotEmpty()) mapSfixed32Sfixed32.forEach { protoMarshal.writeTag(514).writeMessage(it) }
    if (mapSfixed64Sfixed64.isNotEmpty()) mapSfixed64Sfixed64.forEach { protoMarshal.writeTag(522).writeMessage(it) }
    if (mapInt32Float.isNotEmpty()) mapInt32Float.forEach { protoMarshal.writeTag(530).writeMessage(it) }
    if (mapInt32Double.isNotEmpty()) mapInt32Double.forEach { protoMarshal.writeTag(538).writeMessage(it) }
    if (mapBoolBool.isNotEmpty()) mapBoolBool.forEach { protoMarshal.writeTag(546).writeMessage(it) }
    if (mapStringString.isNotEmpty()) mapStringString.forEach { protoMarshal.writeTag(554).writeMessage(it) }
    if (mapStringBytes.isNotEmpty()) mapStringBytes.forEach { protoMarshal.writeTag(562).writeMessage(it) }
    if (mapStringNestedMessage.isNotEmpty()) mapStringNestedMessage.forEach { protoMarshal.writeTag(570).writeMessage(it) }
    if (mapStringForeignMessage.isNotEmpty()) mapStringForeignMessage.forEach { protoMarshal.writeTag(578).writeMessage(it) }
    if (mapStringNestedEnum.isNotEmpty()) mapStringNestedEnum.forEach { protoMarshal.writeTag(586).writeMessage(it) }
    if (mapStringForeignEnum.isNotEmpty()) mapStringForeignEnum.forEach { protoMarshal.writeTag(594).writeMessage(it) }
    if (oneofField is TestAllTypesProto2.OneofField.OneofUint32) protoMarshal.writeTag(888).writeUInt32(oneofField.oneofUint32)
    if (oneofField is TestAllTypesProto2.OneofField.OneofNestedMessage) protoMarshal.writeTag(898).writeMessage(oneofField.oneofNestedMessage)
    if (oneofField is TestAllTypesProto2.OneofField.OneofString) protoMarshal.writeTag(906).writeString(oneofField.oneofString)
    if (oneofField is TestAllTypesProto2.OneofField.OneofBytes) protoMarshal.writeTag(914).writeBytes(oneofField.oneofBytes)
    if (oneofField is TestAllTypesProto2.OneofField.OneofBool) protoMarshal.writeTag(920).writeBool(oneofField.oneofBool)
    if (oneofField is TestAllTypesProto2.OneofField.OneofUint64) protoMarshal.writeTag(928).writeUInt64(oneofField.oneofUint64)
    if (oneofField is TestAllTypesProto2.OneofField.OneofFloat) protoMarshal.writeTag(941).writeFloat(oneofField.oneofFloat)
    if (oneofField is TestAllTypesProto2.OneofField.OneofDouble) protoMarshal.writeTag(945).writeDouble(oneofField.oneofDouble)
    if (oneofField is TestAllTypesProto2.OneofField.OneofEnum) protoMarshal.writeTag(952).writeEnum(oneofField.oneofEnum)
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

private fun TestAllTypesProto2.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2 {
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
    var optionalNestedMessage: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null
    var optionalForeignMessage: pbandk.conformance.pb.ForeignMessageProto2? = null
    var optionalNestedEnum: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0)
    var optionalForeignEnum: pbandk.conformance.pb.ForeignEnumProto2 = pbandk.conformance.pb.ForeignEnumProto2.fromValue(0)
    var optionalStringPiece = ""
    var optionalCord = ""
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
    var mapInt32Int32: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry>? = null
    var mapInt64Int64: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry>? = null
    var mapUint32Uint32: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry>? = null
    var mapUint64Uint64: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry>? = null
    var mapSint32Sint32: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry>? = null
    var mapSint64Sint64: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry>? = null
    var mapFixed32Fixed32: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry>? = null
    var mapFixed64Fixed64: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry>? = null
    var mapSfixed32Sfixed32: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry>? = null
    var mapSfixed64Sfixed64: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry>? = null
    var mapInt32Float: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry>? = null
    var mapInt32Double: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry>? = null
    var mapBoolBool: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry>? = null
    var mapStringString: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry>? = null
    var mapStringBytes: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry>? = null
    var mapStringNestedMessage: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry>? = null
    var mapStringForeignMessage: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry>? = null
    var mapStringNestedEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry>? = null
    var mapStringForeignEnum: pbandk.ListWithSize.Builder<pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry>? = null
    var oneofField: TestAllTypesProto2.OneofField? = null
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
            pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord), pbandk.ListWithSize.Builder.fixed(mapInt32Int32),
            pbandk.ListWithSize.Builder.fixed(mapInt64Int64), pbandk.ListWithSize.Builder.fixed(mapUint32Uint32), pbandk.ListWithSize.Builder.fixed(mapUint64Uint64), pbandk.ListWithSize.Builder.fixed(mapSint32Sint32),
            pbandk.ListWithSize.Builder.fixed(mapSint64Sint64), pbandk.ListWithSize.Builder.fixed(mapFixed32Fixed32), pbandk.ListWithSize.Builder.fixed(mapFixed64Fixed64), pbandk.ListWithSize.Builder.fixed(mapSfixed32Sfixed32),
            pbandk.ListWithSize.Builder.fixed(mapSfixed64Sfixed64), pbandk.ListWithSize.Builder.fixed(mapInt32Float), pbandk.ListWithSize.Builder.fixed(mapInt32Double), pbandk.ListWithSize.Builder.fixed(mapBoolBool),
            pbandk.ListWithSize.Builder.fixed(mapStringString), pbandk.ListWithSize.Builder.fixed(mapStringBytes), pbandk.ListWithSize.Builder.fixed(mapStringNestedMessage), pbandk.ListWithSize.Builder.fixed(mapStringForeignMessage),
            pbandk.ListWithSize.Builder.fixed(mapStringNestedEnum), pbandk.ListWithSize.Builder.fixed(mapStringForeignEnum), oneofField, fieldname1,
            fieldName2, fieldName3, field_name4, field0name5,
            field0Name6, fieldName7, fieldName8, fieldName9,
            fieldName10, fIELDNAME11, fIELDName12, _fieldName13,
            _FieldName14, field_name15, field_Name16, fieldName17_,
            fieldName18_, protoUnmarshal.unknownFields())
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
        248 -> repeatedInt32 = protoUnmarshal.readRepeated(repeatedInt32, protoUnmarshal::readInt32)
        256 -> repeatedInt64 = protoUnmarshal.readRepeated(repeatedInt64, protoUnmarshal::readInt64)
        264 -> repeatedUint32 = protoUnmarshal.readRepeated(repeatedUint32, protoUnmarshal::readUInt32)
        272 -> repeatedUint64 = protoUnmarshal.readRepeated(repeatedUint64, protoUnmarshal::readUInt64)
        280 -> repeatedSint32 = protoUnmarshal.readRepeated(repeatedSint32, protoUnmarshal::readSInt32)
        288 -> repeatedSint64 = protoUnmarshal.readRepeated(repeatedSint64, protoUnmarshal::readSInt64)
        301 -> repeatedFixed32 = protoUnmarshal.readRepeated(repeatedFixed32, protoUnmarshal::readFixed32)
        305 -> repeatedFixed64 = protoUnmarshal.readRepeated(repeatedFixed64, protoUnmarshal::readFixed64)
        317 -> repeatedSfixed32 = protoUnmarshal.readRepeated(repeatedSfixed32, protoUnmarshal::readSFixed32)
        321 -> repeatedSfixed64 = protoUnmarshal.readRepeated(repeatedSfixed64, protoUnmarshal::readSFixed64)
        333 -> repeatedFloat = protoUnmarshal.readRepeated(repeatedFloat, protoUnmarshal::readFloat)
        337 -> repeatedDouble = protoUnmarshal.readRepeated(repeatedDouble, protoUnmarshal::readDouble)
        344 -> repeatedBool = protoUnmarshal.readRepeated(repeatedBool, protoUnmarshal::readBool)
        354 -> repeatedString = protoUnmarshal.readRepeated(repeatedString, protoUnmarshal::readString)
        362 -> repeatedBytes = protoUnmarshal.readRepeated(repeatedBytes, protoUnmarshal::readBytes)
        386 -> repeatedNestedMessage = protoUnmarshal.readRepeatedMessage(repeatedNestedMessage, pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)
        394 -> repeatedForeignMessage = protoUnmarshal.readRepeatedMessage(repeatedForeignMessage, pbandk.conformance.pb.ForeignMessageProto2.Companion)
        408 -> repeatedNestedEnum = protoUnmarshal.readRepeatedEnum(repeatedNestedEnum, pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        416 -> repeatedForeignEnum = protoUnmarshal.readRepeatedEnum(repeatedForeignEnum, pbandk.conformance.pb.ForeignEnumProto2.Companion)
        434 -> repeatedStringPiece = protoUnmarshal.readRepeated(repeatedStringPiece, protoUnmarshal::readString)
        442 -> repeatedCord = protoUnmarshal.readRepeated(repeatedCord, protoUnmarshal::readString)
        450 -> mapInt32Int32 = protoUnmarshal.readRepeatedMessage(mapInt32Int32, pbandk.conformance.pb.TestAllTypesProto2.MapInt32Int32Entry.Companion)
        458 -> mapInt64Int64 = protoUnmarshal.readRepeatedMessage(mapInt64Int64, pbandk.conformance.pb.TestAllTypesProto2.MapInt64Int64Entry.Companion)
        466 -> mapUint32Uint32 = protoUnmarshal.readRepeatedMessage(mapUint32Uint32, pbandk.conformance.pb.TestAllTypesProto2.MapUint32Uint32Entry.Companion)
        474 -> mapUint64Uint64 = protoUnmarshal.readRepeatedMessage(mapUint64Uint64, pbandk.conformance.pb.TestAllTypesProto2.MapUint64Uint64Entry.Companion)
        482 -> mapSint32Sint32 = protoUnmarshal.readRepeatedMessage(mapSint32Sint32, pbandk.conformance.pb.TestAllTypesProto2.MapSint32Sint32Entry.Companion)
        490 -> mapSint64Sint64 = protoUnmarshal.readRepeatedMessage(mapSint64Sint64, pbandk.conformance.pb.TestAllTypesProto2.MapSint64Sint64Entry.Companion)
        498 -> mapFixed32Fixed32 = protoUnmarshal.readRepeatedMessage(mapFixed32Fixed32, pbandk.conformance.pb.TestAllTypesProto2.MapFixed32Fixed32Entry.Companion)
        506 -> mapFixed64Fixed64 = protoUnmarshal.readRepeatedMessage(mapFixed64Fixed64, pbandk.conformance.pb.TestAllTypesProto2.MapFixed64Fixed64Entry.Companion)
        514 -> mapSfixed32Sfixed32 = protoUnmarshal.readRepeatedMessage(mapSfixed32Sfixed32, pbandk.conformance.pb.TestAllTypesProto2.MapSfixed32Sfixed32Entry.Companion)
        522 -> mapSfixed64Sfixed64 = protoUnmarshal.readRepeatedMessage(mapSfixed64Sfixed64, pbandk.conformance.pb.TestAllTypesProto2.MapSfixed64Sfixed64Entry.Companion)
        530 -> mapInt32Float = protoUnmarshal.readRepeatedMessage(mapInt32Float, pbandk.conformance.pb.TestAllTypesProto2.MapInt32FloatEntry.Companion)
        538 -> mapInt32Double = protoUnmarshal.readRepeatedMessage(mapInt32Double, pbandk.conformance.pb.TestAllTypesProto2.MapInt32DoubleEntry.Companion)
        546 -> mapBoolBool = protoUnmarshal.readRepeatedMessage(mapBoolBool, pbandk.conformance.pb.TestAllTypesProto2.MapBoolBoolEntry.Companion)
        554 -> mapStringString = protoUnmarshal.readRepeatedMessage(mapStringString, pbandk.conformance.pb.TestAllTypesProto2.MapStringStringEntry.Companion)
        562 -> mapStringBytes = protoUnmarshal.readRepeatedMessage(mapStringBytes, pbandk.conformance.pb.TestAllTypesProto2.MapStringBytesEntry.Companion)
        570 -> mapStringNestedMessage = protoUnmarshal.readRepeatedMessage(mapStringNestedMessage, pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedMessageEntry.Companion)
        578 -> mapStringForeignMessage = protoUnmarshal.readRepeatedMessage(mapStringForeignMessage, pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignMessageEntry.Companion)
        586 -> mapStringNestedEnum = protoUnmarshal.readRepeatedMessage(mapStringNestedEnum, pbandk.conformance.pb.TestAllTypesProto2.MapStringNestedEnumEntry.Companion)
        594 -> mapStringForeignEnum = protoUnmarshal.readRepeatedMessage(mapStringForeignEnum, pbandk.conformance.pb.TestAllTypesProto2.MapStringForeignEnumEntry.Companion)
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

private fun TestAllTypesProto2.NestedMessage.protoMergeImpl(plus: TestAllTypesProto2.NestedMessage?): TestAllTypesProto2.NestedMessage = plus?.copy(
    corecursive = corecursive?.plus(plus.corecursive) ?: plus.corecursive,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.NestedMessage.protoSizeImpl(): Int {
    var protoSize = 0
    if (a != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(a)
    if (corecursive != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(corecursive)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.NestedMessage.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (a != 0) protoMarshal.writeTag(8).writeInt32(a)
    if (corecursive != null) protoMarshal.writeTag(18).writeMessage(corecursive)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.NestedMessage.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.NestedMessage {
    var a = 0
    var corecursive: pbandk.conformance.pb.TestAllTypesProto2? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.NestedMessage(a, corecursive, protoUnmarshal.unknownFields())
        8 -> a = protoUnmarshal.readInt32()
        18 -> corecursive = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt32Int32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapInt32Int32Entry?): TestAllTypesProto2.MapInt32Int32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt32Int32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt32Int32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeInt32(key)
    if (value != 0) protoMarshal.writeTag(16).writeInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt32Int32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt32Int32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt32Int32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        16 -> value = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt64Int64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapInt64Int64Entry?): TestAllTypesProto2.MapInt64Int64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt64Int64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt64Int64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(8).writeInt64(key)
    if (value != 0L) protoMarshal.writeTag(16).writeInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt64Int64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt64Int64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt64Int64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt64()
        16 -> value = protoUnmarshal.readInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapUint32Uint32Entry?): TestAllTypesProto2.MapUint32Uint32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.uInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapUint32Uint32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeUInt32(key)
    if (value != 0) protoMarshal.writeTag(16).writeUInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapUint32Uint32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapUint32Uint32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapUint32Uint32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readUInt32()
        16 -> value = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapUint64Uint64Entry?): TestAllTypesProto2.MapUint64Uint64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.uInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapUint64Uint64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(8).writeUInt64(key)
    if (value != 0L) protoMarshal.writeTag(16).writeUInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapUint64Uint64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapUint64Uint64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapUint64Uint64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readUInt64()
        16 -> value = protoUnmarshal.readUInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSint32Sint32Entry?): TestAllTypesProto2.MapSint32Sint32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sInt32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSint32Sint32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeSInt32(key)
    if (value != 0) protoMarshal.writeTag(16).writeSInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSint32Sint32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSint32Sint32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSint32Sint32Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readSInt32()
        16 -> value = protoUnmarshal.readSInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSint64Sint64Entry?): TestAllTypesProto2.MapSint64Sint64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sInt64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSint64Sint64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(8).writeSInt64(key)
    if (value != 0L) protoMarshal.writeTag(16).writeSInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSint64Sint64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSint64Sint64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSint64Sint64Entry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readSInt64()
        16 -> value = protoUnmarshal.readSInt64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapFixed32Fixed32Entry?): TestAllTypesProto2.MapFixed32Fixed32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.fixed32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.fixed32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(13).writeFixed32(key)
    if (value != 0) protoMarshal.writeTag(21).writeFixed32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapFixed32Fixed32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapFixed32Fixed32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapFixed32Fixed32Entry(key, value, protoUnmarshal.unknownFields())
        13 -> key = protoUnmarshal.readFixed32()
        21 -> value = protoUnmarshal.readFixed32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapFixed64Fixed64Entry?): TestAllTypesProto2.MapFixed64Fixed64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.fixed64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.fixed64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(9).writeFixed64(key)
    if (value != 0L) protoMarshal.writeTag(17).writeFixed64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapFixed64Fixed64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapFixed64Fixed64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapFixed64Fixed64Entry(key, value, protoUnmarshal.unknownFields())
        9 -> key = protoUnmarshal.readFixed64()
        17 -> value = protoUnmarshal.readFixed64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSfixed32Sfixed32Entry?): TestAllTypesProto2.MapSfixed32Sfixed32Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sFixed32Size(key)
    if (value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sFixed32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(13).writeSFixed32(key)
    if (value != 0) protoMarshal.writeTag(21).writeSFixed32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSfixed32Sfixed32Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSfixed32Sfixed32Entry {
    var key = 0
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSfixed32Sfixed32Entry(key, value, protoUnmarshal.unknownFields())
        13 -> key = protoUnmarshal.readSFixed32()
        21 -> value = protoUnmarshal.readSFixed32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoMergeImpl(plus: TestAllTypesProto2.MapSfixed64Sfixed64Entry?): TestAllTypesProto2.MapSfixed64Sfixed64Entry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.sFixed64Size(key)
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.sFixed64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0L) protoMarshal.writeTag(9).writeSFixed64(key)
    if (value != 0L) protoMarshal.writeTag(17).writeSFixed64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapSfixed64Sfixed64Entry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapSfixed64Sfixed64Entry {
    var key = 0L
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapSfixed64Sfixed64Entry(key, value, protoUnmarshal.unknownFields())
        9 -> key = protoUnmarshal.readSFixed64()
        17 -> value = protoUnmarshal.readSFixed64()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt32FloatEntry.protoMergeImpl(plus: TestAllTypesProto2.MapInt32FloatEntry?): TestAllTypesProto2.MapInt32FloatEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt32FloatEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != 0.0F) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.floatSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt32FloatEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeInt32(key)
    if (value != 0.0F) protoMarshal.writeTag(21).writeFloat(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt32FloatEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt32FloatEntry {
    var key = 0
    var value = 0.0F
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt32FloatEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        21 -> value = protoUnmarshal.readFloat()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoMergeImpl(plus: TestAllTypesProto2.MapInt32DoubleEntry?): TestAllTypesProto2.MapInt32DoubleEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(key)
    if (value != 0.0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.doubleSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapInt32DoubleEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key != 0) protoMarshal.writeTag(8).writeInt32(key)
    if (value != 0.0) protoMarshal.writeTag(17).writeDouble(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapInt32DoubleEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapInt32DoubleEntry {
    var key = 0
    var value = 0.0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapInt32DoubleEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readInt32()
        17 -> value = protoUnmarshal.readDouble()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapBoolBoolEntry.protoMergeImpl(plus: TestAllTypesProto2.MapBoolBoolEntry?): TestAllTypesProto2.MapBoolBoolEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapBoolBoolEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(key)
    if (value) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapBoolBoolEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key) protoMarshal.writeTag(8).writeBool(key)
    if (value) protoMarshal.writeTag(16).writeBool(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapBoolBoolEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapBoolBoolEntry {
    var key = false
    var value = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapBoolBoolEntry(key, value, protoUnmarshal.unknownFields())
        8 -> key = protoUnmarshal.readBool()
        16 -> value = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringStringEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringStringEntry?): TestAllTypesProto2.MapStringStringEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringStringEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringStringEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.isNotEmpty()) protoMarshal.writeTag(18).writeString(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringStringEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringStringEntry {
    var key = ""
    var value = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringStringEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringBytesEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringBytesEntry?): TestAllTypesProto2.MapStringBytesEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringBytesEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringBytesEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.array.isNotEmpty()) protoMarshal.writeTag(18).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringBytesEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringBytesEntry {
    var key = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringBytesEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringNestedMessageEntry?): TestAllTypesProto2.MapStringNestedMessageEntry = plus?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringNestedMessageEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringNestedMessageEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringNestedMessageEntry {
    var key = ""
    var value: pbandk.conformance.pb.TestAllTypesProto2.NestedMessage? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringNestedMessageEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.conformance.pb.TestAllTypesProto2.NestedMessage.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringForeignMessageEntry?): TestAllTypesProto2.MapStringForeignMessageEntry = plus?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringForeignMessageEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringForeignMessageEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringForeignMessageEntry {
    var key = ""
    var value: pbandk.conformance.pb.ForeignMessageProto2? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringForeignMessageEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.conformance.pb.ForeignMessageProto2.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringNestedEnumEntry?): TestAllTypesProto2.MapStringNestedEnumEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringNestedEnumEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.value != 0) protoMarshal.writeTag(16).writeEnum(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringNestedEnumEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringNestedEnumEntry {
    var key = ""
    var value: pbandk.conformance.pb.TestAllTypesProto2.NestedEnum = pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringNestedEnumEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        16 -> value = protoUnmarshal.readEnum(pbandk.conformance.pb.TestAllTypesProto2.NestedEnum.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoMergeImpl(plus: TestAllTypesProto2.MapStringForeignEnumEntry?): TestAllTypesProto2.MapStringForeignEnumEntry = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoSizeImpl(): Int {
    var protoSize = 0
    if (key.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(key)
    if (value.value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MapStringForeignEnumEntry.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (key.isNotEmpty()) protoMarshal.writeTag(10).writeString(key)
    if (value.value != 0) protoMarshal.writeTag(16).writeEnum(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MapStringForeignEnumEntry.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MapStringForeignEnumEntry {
    var key = ""
    var value: pbandk.conformance.pb.ForeignEnumProto2 = pbandk.conformance.pb.ForeignEnumProto2.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MapStringForeignEnumEntry(key, value, protoUnmarshal.unknownFields())
        10 -> key = protoUnmarshal.readString()
        16 -> value = protoUnmarshal.readEnum(pbandk.conformance.pb.ForeignEnumProto2.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.Data.protoMergeImpl(plus: TestAllTypesProto2.Data?): TestAllTypesProto2.Data = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.Data.protoSizeImpl(): Int {
    var protoSize = 0
    if (groupInt32 != 0) protoSize += pbandk.Sizer.tagSize(202) + pbandk.Sizer.int32Size(groupInt32)
    if (groupUint32 != 0) protoSize += pbandk.Sizer.tagSize(203) + pbandk.Sizer.uInt32Size(groupUint32)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.Data.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (groupInt32 != 0) protoMarshal.writeTag(1616).writeInt32(groupInt32)
    if (groupUint32 != 0) protoMarshal.writeTag(1624).writeUInt32(groupUint32)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.Data.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.Data {
    var groupInt32 = 0
    var groupUint32 = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.Data(groupInt32, groupUint32, protoUnmarshal.unknownFields())
        1616 -> groupInt32 = protoUnmarshal.readInt32()
        1624 -> groupUint32 = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

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

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoMergeImpl(plus: TestAllTypesProto2.MessageSetCorrectExtension1?): TestAllTypesProto2.MessageSetCorrectExtension1 = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoSizeImpl(): Int {
    var protoSize = 0
    if (str.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(25) + pbandk.Sizer.stringSize(str)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MessageSetCorrectExtension1.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (str.isNotEmpty()) protoMarshal.writeTag(202).writeString(str)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MessageSetCorrectExtension1.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MessageSetCorrectExtension1 {
    var str = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MessageSetCorrectExtension1(str, protoUnmarshal.unknownFields())
        202 -> str = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoMergeImpl(plus: TestAllTypesProto2.MessageSetCorrectExtension2?): TestAllTypesProto2.MessageSetCorrectExtension2 = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoSizeImpl(): Int {
    var protoSize = 0
    if (i != 0) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.int32Size(i)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun TestAllTypesProto2.MessageSetCorrectExtension2.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (i != 0) protoMarshal.writeTag(72).writeInt32(i)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun TestAllTypesProto2.MessageSetCorrectExtension2.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): TestAllTypesProto2.MessageSetCorrectExtension2 {
    var i = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return TestAllTypesProto2.MessageSetCorrectExtension2(i, protoUnmarshal.unknownFields())
        72 -> i = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun ForeignMessageProto2.protoMergeImpl(plus: ForeignMessageProto2?): ForeignMessageProto2 = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ForeignMessageProto2.protoSizeImpl(): Int {
    var protoSize = 0
    if (c != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(c)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ForeignMessageProto2.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (c != 0) protoMarshal.writeTag(8).writeInt32(c)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ForeignMessageProto2.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ForeignMessageProto2 {
    var c = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ForeignMessageProto2(c, protoUnmarshal.unknownFields())
        8 -> c = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

package pbandk.wkt

import kotlin.jvm.Transient

sealed class Syntax(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is Syntax && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "Syntax.${name ?: "UNRECOGNIZED"}(value=$value)"

    object Proto2 : Syntax(0, "SYNTAX_PROTO2")
    object Proto3 : Syntax(1, "SYNTAX_PROTO3")
    class Unrecognized(value: Int) : Syntax(value)

    companion object : pbandk.Message.Enum.Companion<Syntax> {
        val values: List<Syntax> by lazy { listOf(Proto2, Proto3) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: Unrecognized(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Syntax with name: $name")
    }
}

data class Type(
    val name: String = "",
    val fields: List<pbandk.wkt.Field> = emptyList(),
    val oneofs: List<String> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Type> {
    override operator fun plus(other: Type?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Type> {
        val defaultInstance by lazy { Type() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Type.protoUnmarshalImpl(u)
    }
}

data class Field(
    val kind: pbandk.wkt.Field.Kind = pbandk.wkt.Field.Kind.fromValue(0),
    val cardinality: pbandk.wkt.Field.Cardinality = pbandk.wkt.Field.Cardinality.fromValue(0),
    val number: Int = 0,
    val name: String = "",
    val typeUrl: String = "",
    val oneofIndex: Int = 0,
    val packed: Boolean = false,
    val options: List<pbandk.wkt.Option> = emptyList(),
    val jsonName: String = "",
    val defaultValue: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Field> {
    override operator fun plus(other: Field?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Field> {
        val defaultInstance by lazy { Field() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Field.protoUnmarshalImpl(u)
    }

    sealed class Kind(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Kind && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Kind.${name ?: "UNRECOGNIZED"}(value=$value)"

        object TypeUnknown : Kind(0, "TYPE_UNKNOWN")
        object TypeDouble : Kind(1, "TYPE_DOUBLE")
        object TypeFloat : Kind(2, "TYPE_FLOAT")
        object TypeInt64 : Kind(3, "TYPE_INT64")
        object TypeUint64 : Kind(4, "TYPE_UINT64")
        object TypeInt32 : Kind(5, "TYPE_INT32")
        object TypeFixed64 : Kind(6, "TYPE_FIXED64")
        object TypeFixed32 : Kind(7, "TYPE_FIXED32")
        object TypeBool : Kind(8, "TYPE_BOOL")
        object TypeString : Kind(9, "TYPE_STRING")
        object TypeGroup : Kind(10, "TYPE_GROUP")
        object TypeMessage : Kind(11, "TYPE_MESSAGE")
        object TypeBytes : Kind(12, "TYPE_BYTES")
        object TypeUint32 : Kind(13, "TYPE_UINT32")
        object TypeEnum : Kind(14, "TYPE_ENUM")
        object TypeSfixed32 : Kind(15, "TYPE_SFIXED32")
        object TypeSfixed64 : Kind(16, "TYPE_SFIXED64")
        object TypeSint32 : Kind(17, "TYPE_SINT32")
        object TypeSint64 : Kind(18, "TYPE_SINT64")
        class Unrecognized(value: Int) : Kind(value)

        companion object : pbandk.Message.Enum.Companion<Kind> {
            val values: List<Kind> by lazy { listOf(TypeUnknown, TypeDouble, TypeFloat, TypeInt64, TypeUint64, TypeInt32, TypeFixed64, TypeFixed32, TypeBool, TypeString, TypeGroup, TypeMessage, TypeBytes, TypeUint32, TypeEnum, TypeSfixed32, TypeSfixed64, TypeSint32, TypeSint64) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: Unrecognized(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Kind with name: $name")
        }
    }

    sealed class Cardinality(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Cardinality && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Cardinality.${name ?: "UNRECOGNIZED"}(value=$value)"

        object Unknown : Cardinality(0, "CARDINALITY_UNKNOWN")
        object Optional : Cardinality(1, "CARDINALITY_OPTIONAL")
        object Required : Cardinality(2, "CARDINALITY_REQUIRED")
        object Repeated : Cardinality(3, "CARDINALITY_REPEATED")
        class Unrecognized(value: Int) : Cardinality(value)

        companion object : pbandk.Message.Enum.Companion<Cardinality> {
            val values: List<Cardinality> by lazy { listOf(Unknown, Optional, Required, Repeated) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: Unrecognized(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Cardinality with name: $name")
        }
    }
}

data class Enum(
    val name: String = "",
    val enumvalue: List<pbandk.wkt.EnumValue> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Enum> {
    override operator fun plus(other: Enum?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Enum> {
        val defaultInstance by lazy { Enum() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Enum.protoUnmarshalImpl(u)
    }
}

data class EnumValue(
    val name: String = "",
    val number: Int = 0,
    val options: List<pbandk.wkt.Option> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<EnumValue> {
    override operator fun plus(other: EnumValue?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<EnumValue> {
        val defaultInstance by lazy { EnumValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumValue.protoUnmarshalImpl(u)
    }
}

data class Option(
    val name: String = "",
    val value: pbandk.wkt.Any? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Option> {
    override operator fun plus(other: Option?) = protoMergeImpl(other)
    @delegate:Transient override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Option> {
        val defaultInstance by lazy { Option() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Option.protoUnmarshalImpl(u)
    }
}

fun Type?.orDefault() = this ?: Type.defaultInstance

private fun Type.protoMergeImpl(plus: Type?): Type = plus?.copy(
    fields = fields + plus.fields,
    oneofs = oneofs + plus.oneofs,
    options = options + plus.options,
    sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Type.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (fields.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * fields.size) + fields.sumBy(pbandk.Sizer::messageSize)
    if (oneofs.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * oneofs.size) + oneofs.sumBy(pbandk.Sizer::stringSize)
    if (options.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(4) * options.size) + options.sumBy(pbandk.Sizer::messageSize)
    if (sourceContext != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.messageSize(sourceContext)
    if (syntax.value != 0) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.enumSize(syntax)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Type.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (fields.isNotEmpty()) fields.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (oneofs.isNotEmpty()) oneofs.forEach { protoMarshal.writeTag(26).writeString(it) }
    if (options.isNotEmpty()) options.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (sourceContext != null) protoMarshal.writeTag(42).writeMessage(sourceContext)
    if (syntax.value != 0) protoMarshal.writeTag(48).writeEnum(syntax)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Type.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Type {
    var name = ""
    var fields: pbandk.ListWithSize.Builder<pbandk.wkt.Field>? = null
    var oneofs: pbandk.ListWithSize.Builder<String>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var sourceContext: pbandk.wkt.SourceContext? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Type(name, pbandk.ListWithSize.Builder.fixed(fields), pbandk.ListWithSize.Builder.fixed(oneofs), pbandk.ListWithSize.Builder.fixed(options),
            sourceContext, syntax, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> fields = protoUnmarshal.readRepeatedMessage(fields, pbandk.wkt.Field.Companion, true)
        26 -> oneofs = protoUnmarshal.readRepeated(oneofs, protoUnmarshal::readString, true)
        34 -> options = protoUnmarshal.readRepeatedMessage(options, pbandk.wkt.Option.Companion, true)
        42 -> sourceContext = protoUnmarshal.readMessage(pbandk.wkt.SourceContext.Companion)
        48 -> syntax = protoUnmarshal.readEnum(pbandk.wkt.Syntax.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

fun Field?.orDefault() = this ?: Field.defaultInstance

private fun Field.protoMergeImpl(plus: Field?): Field = plus?.copy(
    options = options + plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Field.protoSizeImpl(): Int {
    var protoSize = 0
    if (kind.value != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.enumSize(kind)
    if (cardinality.value != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.enumSize(cardinality)
    if (number != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.int32Size(number)
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(name)
    if (typeUrl.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.stringSize(typeUrl)
    if (oneofIndex != 0) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.int32Size(oneofIndex)
    if (packed) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.boolSize(packed)
    if (options.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(9) * options.size) + options.sumBy(pbandk.Sizer::messageSize)
    if (jsonName.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.stringSize(jsonName)
    if (defaultValue.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(11) + pbandk.Sizer.stringSize(defaultValue)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Field.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (kind.value != 0) protoMarshal.writeTag(8).writeEnum(kind)
    if (cardinality.value != 0) protoMarshal.writeTag(16).writeEnum(cardinality)
    if (number != 0) protoMarshal.writeTag(24).writeInt32(number)
    if (name.isNotEmpty()) protoMarshal.writeTag(34).writeString(name)
    if (typeUrl.isNotEmpty()) protoMarshal.writeTag(50).writeString(typeUrl)
    if (oneofIndex != 0) protoMarshal.writeTag(56).writeInt32(oneofIndex)
    if (packed) protoMarshal.writeTag(64).writeBool(packed)
    if (options.isNotEmpty()) options.forEach { protoMarshal.writeTag(74).writeMessage(it) }
    if (jsonName.isNotEmpty()) protoMarshal.writeTag(82).writeString(jsonName)
    if (defaultValue.isNotEmpty()) protoMarshal.writeTag(90).writeString(defaultValue)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Field.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Field {
    var kind: pbandk.wkt.Field.Kind = pbandk.wkt.Field.Kind.fromValue(0)
    var cardinality: pbandk.wkt.Field.Cardinality = pbandk.wkt.Field.Cardinality.fromValue(0)
    var number = 0
    var name = ""
    var typeUrl = ""
    var oneofIndex = 0
    var packed = false
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var jsonName = ""
    var defaultValue = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Field(kind, cardinality, number, name,
            typeUrl, oneofIndex, packed, pbandk.ListWithSize.Builder.fixed(options),
            jsonName, defaultValue, protoUnmarshal.unknownFields())
        8 -> kind = protoUnmarshal.readEnum(pbandk.wkt.Field.Kind.Companion)
        16 -> cardinality = protoUnmarshal.readEnum(pbandk.wkt.Field.Cardinality.Companion)
        24 -> number = protoUnmarshal.readInt32()
        34 -> name = protoUnmarshal.readString()
        50 -> typeUrl = protoUnmarshal.readString()
        56 -> oneofIndex = protoUnmarshal.readInt32()
        64 -> packed = protoUnmarshal.readBool()
        74 -> options = protoUnmarshal.readRepeatedMessage(options, pbandk.wkt.Option.Companion, true)
        82 -> jsonName = protoUnmarshal.readString()
        90 -> defaultValue = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

fun Enum?.orDefault() = this ?: Enum.defaultInstance

private fun Enum.protoMergeImpl(plus: Enum?): Enum = plus?.copy(
    enumvalue = enumvalue + plus.enumvalue,
    options = options + plus.options,
    sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Enum.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (enumvalue.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * enumvalue.size) + enumvalue.sumBy(pbandk.Sizer::messageSize)
    if (options.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * options.size) + options.sumBy(pbandk.Sizer::messageSize)
    if (sourceContext != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.messageSize(sourceContext)
    if (syntax.value != 0) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.enumSize(syntax)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Enum.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (enumvalue.isNotEmpty()) enumvalue.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (options.isNotEmpty()) options.forEach { protoMarshal.writeTag(26).writeMessage(it) }
    if (sourceContext != null) protoMarshal.writeTag(34).writeMessage(sourceContext)
    if (syntax.value != 0) protoMarshal.writeTag(40).writeEnum(syntax)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Enum.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Enum {
    var name = ""
    var enumvalue: pbandk.ListWithSize.Builder<pbandk.wkt.EnumValue>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var sourceContext: pbandk.wkt.SourceContext? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Enum(name, pbandk.ListWithSize.Builder.fixed(enumvalue), pbandk.ListWithSize.Builder.fixed(options), sourceContext,
            syntax, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> enumvalue = protoUnmarshal.readRepeatedMessage(enumvalue, pbandk.wkt.EnumValue.Companion, true)
        26 -> options = protoUnmarshal.readRepeatedMessage(options, pbandk.wkt.Option.Companion, true)
        34 -> sourceContext = protoUnmarshal.readMessage(pbandk.wkt.SourceContext.Companion)
        40 -> syntax = protoUnmarshal.readEnum(pbandk.wkt.Syntax.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

fun EnumValue?.orDefault() = this ?: EnumValue.defaultInstance

private fun EnumValue.protoMergeImpl(plus: EnumValue?): EnumValue = plus?.copy(
    options = options + plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (number != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(number)
    if (options.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * options.size) + options.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (number != 0) protoMarshal.writeTag(16).writeInt32(number)
    if (options.isNotEmpty()) options.forEach { protoMarshal.writeTag(26).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumValue {
    var name = ""
    var number = 0
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumValue(name, number, pbandk.ListWithSize.Builder.fixed(options), protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        16 -> number = protoUnmarshal.readInt32()
        26 -> options = protoUnmarshal.readRepeatedMessage(options, pbandk.wkt.Option.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

fun Option?.orDefault() = this ?: Option.defaultInstance

private fun Option.protoMergeImpl(plus: Option?): Option = plus?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Option.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (value != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Option.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (value != null) protoMarshal.writeTag(18).writeMessage(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Option.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Option {
    var name = ""
    var value: pbandk.wkt.Any? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Option(name, value, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readMessage(pbandk.wkt.Any.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

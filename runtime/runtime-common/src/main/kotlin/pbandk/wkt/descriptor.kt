@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class FileDescriptorSet(
    val file: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FileDescriptorSet> {
    override operator fun plus(other: FileDescriptorSet?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FileDescriptorSet> {
        val defaultInstance by lazy { FileDescriptorSet() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FileDescriptorSet.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FileDescriptorSet.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("file")
        val file: List<pbandk.wkt.FileDescriptorProto.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class FileDescriptorProto(
    val name: String? = null,
    val `package`: String? = null,
    val dependency: List<String> = emptyList(),
    val publicDependency: List<Int> = emptyList(),
    val weakDependency: List<Int> = emptyList(),
    val messageType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val options: pbandk.wkt.FileOptions? = null,
    val sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null,
    val syntax: String? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FileDescriptorProto> {
    override operator fun plus(other: FileDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FileDescriptorProto> {
        val defaultInstance by lazy { FileDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FileDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FileDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("package")
        val `package`: String? = null,
        @SerialName("dependency")
        val dependency: List<String> = emptyList(),
        @SerialName("message_type")
        val messageType: List<pbandk.wkt.DescriptorProto.JsonMapper> = emptyList(),
        @SerialName("enum_type")
        val enumType: List<pbandk.wkt.EnumDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("service")
        val service: List<pbandk.wkt.ServiceDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("extension")
        val extension: List<pbandk.wkt.FieldDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("options")
        val options: pbandk.wkt.FileOptions.JsonMapper? = null,
        @SerialName("source_code_info")
        val sourceCodeInfo: pbandk.wkt.SourceCodeInfo.JsonMapper? = null,
        @SerialName("public_dependency")
        val publicDependency: List<Int> = emptyList(),
        @SerialName("weak_dependency")
        val weakDependency: List<Int> = emptyList(),
        @SerialName("syntax")
        val syntax: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class DescriptorProto(
    val name: String? = null,
    val field: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val nestedType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList(),
    val oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = emptyList(),
    val options: pbandk.wkt.MessageOptions? = null,
    val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<DescriptorProto> {
    override operator fun plus(other: DescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<DescriptorProto> {
        val defaultInstance by lazy { DescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = DescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = DescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("field")
        val field: List<pbandk.wkt.FieldDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("nested_type")
        val nestedType: List<pbandk.wkt.DescriptorProto.JsonMapper> = emptyList(),
        @SerialName("enum_type")
        val enumType: List<pbandk.wkt.EnumDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("extension_range")
        val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange.JsonMapper> = emptyList(),
        @SerialName("extension")
        val extension: List<pbandk.wkt.FieldDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("options")
        val options: pbandk.wkt.MessageOptions.JsonMapper? = null,
        @SerialName("oneof_decl")
        val oneofDecl: List<pbandk.wkt.OneofDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("reserved_range")
        val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange.JsonMapper> = emptyList(),
        @SerialName("reserved_name")
        val reservedName: List<String> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class ExtensionRange(
        val start: Int? = null,
        val end: Int? = null,
        val options: pbandk.wkt.ExtensionRangeOptions? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<ExtensionRange> {
        override operator fun plus(other: ExtensionRange?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<ExtensionRange> {
            val defaultInstance by lazy { ExtensionRange() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = ExtensionRange.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = ExtensionRange.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("start")
            val start: Int? = null,
            @SerialName("end")
            val end: Int? = null,
            @SerialName("options")
            val options: pbandk.wkt.ExtensionRangeOptions.JsonMapper? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }

    data class ReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<ReservedRange> {
        override operator fun plus(other: ReservedRange?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<ReservedRange> {
            val defaultInstance by lazy { ReservedRange() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = ReservedRange.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = ReservedRange.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("start")
            val start: Int? = null,
            @SerialName("end")
            val end: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class ExtensionRangeOptions(
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ExtensionRangeOptions> {
    override operator fun plus(other: ExtensionRangeOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ExtensionRangeOptions> {
        val defaultInstance by lazy { ExtensionRangeOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ExtensionRangeOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ExtensionRangeOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class FieldDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val label: pbandk.wkt.FieldDescriptorProto.Label? = null,
    val type: pbandk.wkt.FieldDescriptorProto.Type? = null,
    val typeName: String? = null,
    val extendee: String? = null,
    val defaultValue: String? = null,
    val oneofIndex: Int? = null,
    val jsonName: String? = null,
    val options: pbandk.wkt.FieldOptions? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FieldDescriptorProto> {
    override operator fun plus(other: FieldDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FieldDescriptorProto> {
        val defaultInstance by lazy { FieldDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FieldDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("extendee")
        val extendee: String? = null,
        @SerialName("number")
        val number: Int? = null,
        @SerialName("label")
        val label: String? = null,
        @SerialName("type")
        val type: String? = null,
        @SerialName("type_name")
        val typeName: String? = null,
        @SerialName("default_value")
        val defaultValue: String? = null,
        @SerialName("options")
        val options: pbandk.wkt.FieldOptions.JsonMapper? = null,
        @SerialName("oneof_index")
        val oneofIndex: Int? = null,
        @SerialName("json_name")
        val jsonName: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }

    sealed class Type(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Type && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Type.${name ?: "UNRECOGNIZED"}(value=$value)"

        object DOUBLE : Type(1, "TYPE_DOUBLE")
        object FLOAT : Type(2, "TYPE_FLOAT")
        object INT64 : Type(3, "TYPE_INT64")
        object UINT64 : Type(4, "TYPE_UINT64")
        object INT32 : Type(5, "TYPE_INT32")
        object FIXED64 : Type(6, "TYPE_FIXED64")
        object FIXED32 : Type(7, "TYPE_FIXED32")
        object BOOL : Type(8, "TYPE_BOOL")
        object STRING : Type(9, "TYPE_STRING")
        object GROUP : Type(10, "TYPE_GROUP")
        object MESSAGE : Type(11, "TYPE_MESSAGE")
        object BYTES : Type(12, "TYPE_BYTES")
        object UINT32 : Type(13, "TYPE_UINT32")
        object ENUM : Type(14, "TYPE_ENUM")
        object SFIXED32 : Type(15, "TYPE_SFIXED32")
        object SFIXED64 : Type(16, "TYPE_SFIXED64")
        object SINT32 : Type(17, "TYPE_SINT32")
        object SINT64 : Type(18, "TYPE_SINT64")
        class UNRECOGNIZED(value: Int) : Type(value)

        companion object : pbandk.Message.Enum.Companion<Type> {
            val values: List<Type> by lazy { listOf(DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Type with name: $name")
        }
    }

    sealed class Label(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Label && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Label.${name ?: "UNRECOGNIZED"}(value=$value)"

        object OPTIONAL : Label(1, "LABEL_OPTIONAL")
        object REQUIRED : Label(2, "LABEL_REQUIRED")
        object REPEATED : Label(3, "LABEL_REPEATED")
        class UNRECOGNIZED(value: Int) : Label(value)

        companion object : pbandk.Message.Enum.Companion<Label> {
            val values: List<Label> by lazy { listOf(OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Label with name: $name")
        }
    }
}

data class OneofDescriptorProto(
    val name: String? = null,
    val options: pbandk.wkt.OneofOptions? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<OneofDescriptorProto> {
    override operator fun plus(other: OneofDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<OneofDescriptorProto> {
        val defaultInstance by lazy { OneofDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = OneofDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = OneofDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("options")
        val options: pbandk.wkt.OneofOptions.JsonMapper? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class EnumDescriptorProto(
    val name: String? = null,
    val value: List<pbandk.wkt.EnumValueDescriptorProto> = emptyList(),
    val options: pbandk.wkt.EnumOptions? = null,
    val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<EnumDescriptorProto> {
    override operator fun plus(other: EnumDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<EnumDescriptorProto> {
        val defaultInstance by lazy { EnumDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = EnumDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("value")
        val value: List<pbandk.wkt.EnumValueDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("options")
        val options: pbandk.wkt.EnumOptions.JsonMapper? = null,
        @SerialName("reserved_range")
        val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange.JsonMapper> = emptyList(),
        @SerialName("reserved_name")
        val reservedName: List<String> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class EnumReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<EnumReservedRange> {
        override operator fun plus(other: EnumReservedRange?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<EnumReservedRange> {
            val defaultInstance by lazy { EnumReservedRange() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumReservedRange.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = EnumReservedRange.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("start")
            val start: Int? = null,
            @SerialName("end")
            val end: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class EnumValueDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val options: pbandk.wkt.EnumValueOptions? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<EnumValueDescriptorProto> {
    override operator fun plus(other: EnumValueDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<EnumValueDescriptorProto> {
        val defaultInstance by lazy { EnumValueDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumValueDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = EnumValueDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("number")
        val number: Int? = null,
        @SerialName("options")
        val options: pbandk.wkt.EnumValueOptions.JsonMapper? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class ServiceDescriptorProto(
    val name: String? = null,
    val method: List<pbandk.wkt.MethodDescriptorProto> = emptyList(),
    val options: pbandk.wkt.ServiceOptions? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ServiceDescriptorProto> {
    override operator fun plus(other: ServiceDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ServiceDescriptorProto> {
        val defaultInstance by lazy { ServiceDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ServiceDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ServiceDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("method")
        val method: List<pbandk.wkt.MethodDescriptorProto.JsonMapper> = emptyList(),
        @SerialName("options")
        val options: pbandk.wkt.ServiceOptions.JsonMapper? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class MethodDescriptorProto(
    val name: String? = null,
    val inputType: String? = null,
    val outputType: String? = null,
    val options: pbandk.wkt.MethodOptions? = null,
    val clientStreaming: Boolean? = null,
    val serverStreaming: Boolean? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<MethodDescriptorProto> {
    override operator fun plus(other: MethodDescriptorProto?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<MethodDescriptorProto> {
        val defaultInstance by lazy { MethodDescriptorProto() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MethodDescriptorProto.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = MethodDescriptorProto.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: String? = null,
        @SerialName("input_type")
        val inputType: String? = null,
        @SerialName("output_type")
        val outputType: String? = null,
        @SerialName("options")
        val options: pbandk.wkt.MethodOptions.JsonMapper? = null,
        @SerialName("client_streaming")
        val clientStreaming: Boolean? = null,
        @SerialName("server_streaming")
        val serverStreaming: Boolean? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class FileOptions(
    val javaPackage: String? = null,
    val javaOuterClassname: String? = null,
    val javaMultipleFiles: Boolean? = null,
    val javaGenerateEqualsAndHash: Boolean? = null,
    val javaStringCheckUtf8: Boolean? = null,
    val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null,
    val goPackage: String? = null,
    val ccGenericServices: Boolean? = null,
    val javaGenericServices: Boolean? = null,
    val pyGenericServices: Boolean? = null,
    val phpGenericServices: Boolean? = null,
    val deprecated: Boolean? = null,
    val ccEnableArenas: Boolean? = null,
    val objcClassPrefix: String? = null,
    val csharpNamespace: String? = null,
    val swiftPrefix: String? = null,
    val phpClassPrefix: String? = null,
    val phpNamespace: String? = null,
    val phpMetadataNamespace: String? = null,
    val rubyPackage: String? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FileOptions> {
    override operator fun plus(other: FileOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FileOptions> {
        val defaultInstance by lazy { FileOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FileOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FileOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("java_package")
        val javaPackage: String? = null,
        @SerialName("java_outer_classname")
        val javaOuterClassname: String? = null,
        @SerialName("optimize_for")
        val optimizeFor: String? = null,
        @SerialName("java_multiple_files")
        val javaMultipleFiles: Boolean? = null,
        @SerialName("go_package")
        val goPackage: String? = null,
        @SerialName("cc_generic_services")
        val ccGenericServices: Boolean? = null,
        @SerialName("java_generic_services")
        val javaGenericServices: Boolean? = null,
        @SerialName("py_generic_services")
        val pyGenericServices: Boolean? = null,
        @SerialName("java_generate_equals_and_hash")
        val javaGenerateEqualsAndHash: Boolean? = null,
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("java_string_check_utf8")
        val javaStringCheckUtf8: Boolean? = null,
        @SerialName("cc_enable_arenas")
        val ccEnableArenas: Boolean? = null,
        @SerialName("objc_class_prefix")
        val objcClassPrefix: String? = null,
        @SerialName("csharp_namespace")
        val csharpNamespace: String? = null,
        @SerialName("swift_prefix")
        val swiftPrefix: String? = null,
        @SerialName("php_class_prefix")
        val phpClassPrefix: String? = null,
        @SerialName("php_namespace")
        val phpNamespace: String? = null,
        @SerialName("php_generic_services")
        val phpGenericServices: Boolean? = null,
        @SerialName("php_metadata_namespace")
        val phpMetadataNamespace: String? = null,
        @SerialName("ruby_package")
        val rubyPackage: String? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    sealed class OptimizeMode(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is OptimizeMode && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "OptimizeMode.${name ?: "UNRECOGNIZED"}(value=$value)"

        object SPEED : OptimizeMode(1, "SPEED")
        object CODE_SIZE : OptimizeMode(2, "CODE_SIZE")
        object LITE_RUNTIME : OptimizeMode(3, "LITE_RUNTIME")
        class UNRECOGNIZED(value: Int) : OptimizeMode(value)

        companion object : pbandk.Message.Enum.Companion<OptimizeMode> {
            val values: List<OptimizeMode> by lazy { listOf(SPEED, CODE_SIZE, LITE_RUNTIME) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptimizeMode with name: $name")
        }
    }
}

data class MessageOptions(
    val messageSetWireFormat: Boolean? = null,
    val noStandardDescriptorAccessor: Boolean? = null,
    val deprecated: Boolean? = null,
    val mapEntry: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<MessageOptions> {
    override operator fun plus(other: MessageOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<MessageOptions> {
        val defaultInstance by lazy { MessageOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = MessageOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("message_set_wire_format")
        val messageSetWireFormat: Boolean? = null,
        @SerialName("no_standard_descriptor_accessor")
        val noStandardDescriptorAccessor: Boolean? = null,
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("map_entry")
        val mapEntry: Boolean? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class FieldOptions(
    val ctype: pbandk.wkt.FieldOptions.CType? = null,
    val packed: Boolean? = null,
    val jstype: pbandk.wkt.FieldOptions.JSType? = null,
    val lazy: Boolean? = null,
    val deprecated: Boolean? = null,
    val weak: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FieldOptions> {
    override operator fun plus(other: FieldOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<FieldOptions> {
        val defaultInstance by lazy { FieldOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = FieldOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("ctype")
        val ctype: String? = null,
        @SerialName("packed")
        val packed: Boolean? = null,
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("lazy")
        val lazy: Boolean? = null,
        @SerialName("jstype")
        val jstype: String? = null,
        @SerialName("weak")
        val weak: Boolean? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    sealed class CType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is CType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "CType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object STRING : CType(0, "STRING")
        object CORD : CType(1, "CORD")
        object STRING_PIECE : CType(2, "STRING_PIECE")
        class UNRECOGNIZED(value: Int) : CType(value)

        companion object : pbandk.Message.Enum.Companion<CType> {
            val values: List<CType> by lazy { listOf(STRING, CORD, STRING_PIECE) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No CType with name: $name")
        }
    }

    sealed class JSType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is JSType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "JSType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object JS_NORMAL : JSType(0, "JS_NORMAL")
        object JS_STRING : JSType(1, "JS_STRING")
        object JS_NUMBER : JSType(2, "JS_NUMBER")
        class UNRECOGNIZED(value: Int) : JSType(value)

        companion object : pbandk.Message.Enum.Companion<JSType> {
            val values: List<JSType> by lazy { listOf(JS_NORMAL, JS_STRING, JS_NUMBER) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No JSType with name: $name")
        }
    }
}

data class OneofOptions(
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<OneofOptions> {
    override operator fun plus(other: OneofOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<OneofOptions> {
        val defaultInstance by lazy { OneofOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = OneofOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = OneofOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class EnumOptions(
    val allowAlias: Boolean? = null,
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<EnumOptions> {
    override operator fun plus(other: EnumOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<EnumOptions> {
        val defaultInstance by lazy { EnumOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = EnumOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("allow_alias")
        val allowAlias: Boolean? = null,
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class EnumValueOptions(
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<EnumValueOptions> {
    override operator fun plus(other: EnumValueOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<EnumValueOptions> {
        val defaultInstance by lazy { EnumValueOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumValueOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = EnumValueOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class ServiceOptions(
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<ServiceOptions> {
    override operator fun plus(other: ServiceOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<ServiceOptions> {
        val defaultInstance by lazy { ServiceOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ServiceOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = ServiceOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class MethodOptions(
    val deprecated: Boolean? = null,
    val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<MethodOptions> {
    override operator fun plus(other: MethodOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<MethodOptions> {
        val defaultInstance by lazy { MethodOptions() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MethodOptions.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = MethodOptions.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("deprecated")
        val deprecated: Boolean? = null,
        @SerialName("idempotency_level")
        val idempotencyLevel: String? = null,
        @SerialName("uninterpreted_option")
        val uninterpretedOption: List<pbandk.wkt.UninterpretedOption.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    sealed class IdempotencyLevel(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is IdempotencyLevel && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "IdempotencyLevel.${name ?: "UNRECOGNIZED"}(value=$value)"

        object IDEMPOTENCY_UNKNOWN : IdempotencyLevel(0, "IDEMPOTENCY_UNKNOWN")
        object NO_SIDE_EFFECTS : IdempotencyLevel(1, "NO_SIDE_EFFECTS")
        object IDEMPOTENT : IdempotencyLevel(2, "IDEMPOTENT")
        class UNRECOGNIZED(value: Int) : IdempotencyLevel(value)

        companion object : pbandk.Message.Enum.Companion<IdempotencyLevel> {
            val values: List<IdempotencyLevel> by lazy { listOf(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No IdempotencyLevel with name: $name")
        }
    }
}

data class UninterpretedOption(
    val name: List<pbandk.wkt.UninterpretedOption.NamePart> = emptyList(),
    val identifierValue: String? = null,
    val positiveIntValue: Long? = null,
    val negativeIntValue: Long? = null,
    val doubleValue: Double? = null,
    val stringValue: pbandk.ByteArr? = null,
    val aggregateValue: String? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<UninterpretedOption> {
    override operator fun plus(other: UninterpretedOption?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<UninterpretedOption> {
        val defaultInstance by lazy { UninterpretedOption() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UninterpretedOption.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = UninterpretedOption.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("name")
        val name: List<pbandk.wkt.UninterpretedOption.NamePart.JsonMapper> = emptyList(),
        @SerialName("identifier_value")
        val identifierValue: String? = null,
        @SerialName("positive_int_value")
        val positiveIntValue: Long? = null,
        @SerialName("negative_int_value")
        val negativeIntValue: Long? = null,
        @SerialName("double_value")
        val doubleValue: Double? = null,
        @SerialName("string_value")
        val stringValue: pbandk.ByteArr? = null,
        @SerialName("aggregate_value")
        val aggregateValue: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class NamePart(
        val namePart: String = "",
        val isExtension: Boolean = false,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<NamePart> {
        override operator fun plus(other: NamePart?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<NamePart> {
            val defaultInstance by lazy { NamePart() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = NamePart.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = NamePart.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("name_part")
            val namePart: String? = null,
            @SerialName("is_extension")
            val isExtension: Boolean? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class SourceCodeInfo(
    val location: List<pbandk.wkt.SourceCodeInfo.Location> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<SourceCodeInfo> {
    override operator fun plus(other: SourceCodeInfo?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<SourceCodeInfo> {
        val defaultInstance by lazy { SourceCodeInfo() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = SourceCodeInfo.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = SourceCodeInfo.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("location")
        val location: List<pbandk.wkt.SourceCodeInfo.Location.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class Location(
        val path: List<Int> = emptyList(),
        val span: List<Int> = emptyList(),
        val leadingComments: String? = null,
        val trailingComments: String? = null,
        val leadingDetachedComments: List<String> = emptyList(),
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<Location> {
        override operator fun plus(other: Location?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<Location> {
            val defaultInstance by lazy { Location() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = Location.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = Location.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("path")
            val path: List<Int> = emptyList(),
            @SerialName("span")
            val span: List<Int> = emptyList(),
            @SerialName("leading_comments")
            val leadingComments: String? = null,
            @SerialName("trailing_comments")
            val trailingComments: String? = null,
            @SerialName("leading_detached_comments")
            val leadingDetachedComments: List<String> = emptyList()
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

data class GeneratedCodeInfo(
    val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<GeneratedCodeInfo> {
    override operator fun plus(other: GeneratedCodeInfo?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<GeneratedCodeInfo> {
        val defaultInstance by lazy { GeneratedCodeInfo() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = GeneratedCodeInfo.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = GeneratedCodeInfo.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("annotation")
        val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class Annotation(
        val path: List<Int> = emptyList(),
        val sourceFile: String? = null,
        val begin: Int? = null,
        val end: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<Annotation> {
        override operator fun plus(other: Annotation?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<Annotation> {
            val defaultInstance by lazy { Annotation() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = Annotation.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = Annotation.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("path")
            val path: List<Int> = emptyList(),
            @SerialName("source_file")
            val sourceFile: String? = null,
            @SerialName("begin")
            val begin: Int? = null,
            @SerialName("end")
            val end: Int? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

fun FileDescriptorSet?.orDefault() = this ?: FileDescriptorSet.defaultInstance

private fun FileDescriptorSet.protoMergeImpl(plus: FileDescriptorSet?): FileDescriptorSet = plus?.copy(
    file = file + plus.file,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FileDescriptorSet.protoSizeImpl(): Int {
    var protoSize = 0
    if (file.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * file.size) + file.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FileDescriptorSet.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (file.isNotEmpty()) file.forEach { protoMarshal.writeTag(10).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FileDescriptorSet.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FileDescriptorSet {
    var file: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileDescriptorSet(pbandk.ListWithSize.Builder.fixed(file), protoUnmarshal.unknownFields())
        10 -> file = protoUnmarshal.readRepeatedMessage(file, pbandk.wkt.FileDescriptorProto.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun FileDescriptorSet.toJsonMapperImpl(): FileDescriptorSet.JsonMapper =
    FileDescriptorSet.JsonMapper(
        file.map { it.toJsonMapper() }
    )

private fun FileDescriptorSet.JsonMapper.toMessageImpl(): FileDescriptorSet =
    FileDescriptorSet(
        file = file.map { it.toMessage() }
    )

private fun FileDescriptorSet.jsonMarshalImpl(json: Json): String =
    json.stringify(FileDescriptorSet.JsonMapper.serializer(), toJsonMapper())

private fun FileDescriptorSet.Companion.jsonUnmarshalImpl(json: Json, data: String): FileDescriptorSet {
    val mapper = json.parse(FileDescriptorSet.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun FileDescriptorProto?.orDefault() = this ?: FileDescriptorProto.defaultInstance

private fun FileDescriptorProto.protoMergeImpl(plus: FileDescriptorProto?): FileDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    `package` = plus.`package` ?: `package`,
    dependency = dependency + plus.dependency,
    publicDependency = publicDependency + plus.publicDependency,
    weakDependency = weakDependency + plus.weakDependency,
    messageType = messageType + plus.messageType,
    enumType = enumType + plus.enumType,
    service = service + plus.service,
    extension = extension + plus.extension,
    options = options?.plus(plus.options) ?: plus.options,
    sourceCodeInfo = sourceCodeInfo?.plus(plus.sourceCodeInfo) ?: plus.sourceCodeInfo,
    syntax = plus.syntax ?: syntax,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FileDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (`package` != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(`package`)
    if (dependency.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * dependency.size) + dependency.sumBy(pbandk.Sizer::stringSize)
    if (publicDependency.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(10) * publicDependency.size) + publicDependency.sumBy(pbandk.Sizer::int32Size)
    if (weakDependency.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(11) * weakDependency.size) + weakDependency.sumBy(pbandk.Sizer::int32Size)
    if (messageType.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(4) * messageType.size) + messageType.sumBy(pbandk.Sizer::messageSize)
    if (enumType.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(5) * enumType.size) + enumType.sumBy(pbandk.Sizer::messageSize)
    if (service.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * service.size) + service.sumBy(pbandk.Sizer::messageSize)
    if (extension.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(7) * extension.size) + extension.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.messageSize(options)
    if (sourceCodeInfo != null) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.messageSize(sourceCodeInfo)
    if (syntax != null) protoSize += pbandk.Sizer.tagSize(12) + pbandk.Sizer.stringSize(syntax)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FileDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (`package` != null) protoMarshal.writeTag(18).writeString(`package`)
    if (dependency.isNotEmpty()) dependency.forEach { protoMarshal.writeTag(26).writeString(it) }
    if (messageType.isNotEmpty()) messageType.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (enumType.isNotEmpty()) enumType.forEach { protoMarshal.writeTag(42).writeMessage(it) }
    if (service.isNotEmpty()) service.forEach { protoMarshal.writeTag(50).writeMessage(it) }
    if (extension.isNotEmpty()) extension.forEach { protoMarshal.writeTag(58).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(66).writeMessage(options)
    if (sourceCodeInfo != null) protoMarshal.writeTag(74).writeMessage(sourceCodeInfo)
    if (publicDependency.isNotEmpty()) publicDependency.forEach { protoMarshal.writeTag(80).writeInt32(it) }
    if (weakDependency.isNotEmpty()) weakDependency.forEach { protoMarshal.writeTag(88).writeInt32(it) }
    if (syntax != null) protoMarshal.writeTag(98).writeString(syntax)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FileDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FileDescriptorProto {
    var name: String? = null
    var `package`: String? = null
    var dependency: pbandk.ListWithSize.Builder<String>? = null
    var publicDependency: pbandk.ListWithSize.Builder<Int>? = null
    var weakDependency: pbandk.ListWithSize.Builder<Int>? = null
    var messageType: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto>? = null
    var service: pbandk.ListWithSize.Builder<pbandk.wkt.ServiceDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var options: pbandk.wkt.FileOptions? = null
    var sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null
    var syntax: String? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileDescriptorProto(name, `package`, pbandk.ListWithSize.Builder.fixed(dependency), pbandk.ListWithSize.Builder.fixed(publicDependency),
            pbandk.ListWithSize.Builder.fixed(weakDependency), pbandk.ListWithSize.Builder.fixed(messageType), pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(service),
            pbandk.ListWithSize.Builder.fixed(extension), options, sourceCodeInfo, syntax, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> `package` = protoUnmarshal.readString()
        26 -> dependency = protoUnmarshal.readRepeated(dependency, protoUnmarshal::readString, true)
        34 -> messageType = protoUnmarshal.readRepeatedMessage(messageType, pbandk.wkt.DescriptorProto.Companion, true)
        42 -> enumType = protoUnmarshal.readRepeatedMessage(enumType, pbandk.wkt.EnumDescriptorProto.Companion, true)
        50 -> service = protoUnmarshal.readRepeatedMessage(service, pbandk.wkt.ServiceDescriptorProto.Companion, true)
        58 -> extension = protoUnmarshal.readRepeatedMessage(extension, pbandk.wkt.FieldDescriptorProto.Companion, true)
        66 -> options = protoUnmarshal.readMessage(pbandk.wkt.FileOptions.Companion)
        74 -> sourceCodeInfo = protoUnmarshal.readMessage(pbandk.wkt.SourceCodeInfo.Companion)
        80, 82 -> publicDependency = protoUnmarshal.readRepeated(publicDependency, protoUnmarshal::readInt32, false)
        88, 90 -> weakDependency = protoUnmarshal.readRepeated(weakDependency, protoUnmarshal::readInt32, false)
        98 -> syntax = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun FileDescriptorProto.toJsonMapperImpl(): FileDescriptorProto.JsonMapper =
    FileDescriptorProto.JsonMapper(
        name,
        `package`,
        dependency,
        messageType.map { it.toJsonMapper() },
        enumType.map { it.toJsonMapper() },
        service.map { it.toJsonMapper() },
        extension.map { it.toJsonMapper() },
        options?.toJsonMapper(),
        sourceCodeInfo?.toJsonMapper(),
        publicDependency,
        weakDependency,
        syntax
    )

private fun FileDescriptorProto.JsonMapper.toMessageImpl(): FileDescriptorProto =
    FileDescriptorProto(
        name = name ?: null,
        `package` = `package` ?: null,
        dependency = dependency ?: emptyList(),
        publicDependency = publicDependency ?: emptyList(),
        weakDependency = weakDependency ?: emptyList(),
        messageType = messageType.map { it.toMessage() },
        enumType = enumType.map { it.toMessage() },
        service = service.map { it.toMessage() },
        extension = extension.map { it.toMessage() },
        options = options?.toMessage(),
        sourceCodeInfo = sourceCodeInfo?.toMessage(),
        syntax = syntax ?: null
    )

private fun FileDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(FileDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun FileDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): FileDescriptorProto {
    val mapper = json.parse(FileDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun DescriptorProto?.orDefault() = this ?: DescriptorProto.defaultInstance

private fun DescriptorProto.protoMergeImpl(plus: DescriptorProto?): DescriptorProto = plus?.copy(
    name = plus.name ?: name,
    field = field + plus.field,
    extension = extension + plus.extension,
    nestedType = nestedType + plus.nestedType,
    enumType = enumType + plus.enumType,
    extensionRange = extensionRange + plus.extensionRange,
    oneofDecl = oneofDecl + plus.oneofDecl,
    options = options?.plus(plus.options) ?: plus.options,
    reservedRange = reservedRange + plus.reservedRange,
    reservedName = reservedName + plus.reservedName,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (field.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * field.size) + field.sumBy(pbandk.Sizer::messageSize)
    if (extension.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * extension.size) + extension.sumBy(pbandk.Sizer::messageSize)
    if (nestedType.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * nestedType.size) + nestedType.sumBy(pbandk.Sizer::messageSize)
    if (enumType.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(4) * enumType.size) + enumType.sumBy(pbandk.Sizer::messageSize)
    if (extensionRange.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(5) * extensionRange.size) + extensionRange.sumBy(pbandk.Sizer::messageSize)
    if (oneofDecl.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(8) * oneofDecl.size) + oneofDecl.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.messageSize(options)
    if (reservedRange.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(9) * reservedRange.size) + reservedRange.sumBy(pbandk.Sizer::messageSize)
    if (reservedName.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(10) * reservedName.size) + reservedName.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (field.isNotEmpty()) field.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (nestedType.isNotEmpty()) nestedType.forEach { protoMarshal.writeTag(26).writeMessage(it) }
    if (enumType.isNotEmpty()) enumType.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (extensionRange.isNotEmpty()) extensionRange.forEach { protoMarshal.writeTag(42).writeMessage(it) }
    if (extension.isNotEmpty()) extension.forEach { protoMarshal.writeTag(50).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(58).writeMessage(options)
    if (oneofDecl.isNotEmpty()) oneofDecl.forEach { protoMarshal.writeTag(66).writeMessage(it) }
    if (reservedRange.isNotEmpty()) reservedRange.forEach { protoMarshal.writeTag(74).writeMessage(it) }
    if (reservedName.isNotEmpty()) reservedName.forEach { protoMarshal.writeTag(82).writeString(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun DescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DescriptorProto {
    var name: String? = null
    var field: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var nestedType: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto>? = null
    var extensionRange: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto.ExtensionRange>? = null
    var oneofDecl: pbandk.ListWithSize.Builder<pbandk.wkt.OneofDescriptorProto>? = null
    var options: pbandk.wkt.MessageOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto.ReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return DescriptorProto(name, pbandk.ListWithSize.Builder.fixed(field), pbandk.ListWithSize.Builder.fixed(extension), pbandk.ListWithSize.Builder.fixed(nestedType),
            pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(extensionRange), pbandk.ListWithSize.Builder.fixed(oneofDecl), options,
            pbandk.ListWithSize.Builder.fixed(reservedRange), pbandk.ListWithSize.Builder.fixed(reservedName), protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> field = protoUnmarshal.readRepeatedMessage(field, pbandk.wkt.FieldDescriptorProto.Companion, true)
        26 -> nestedType = protoUnmarshal.readRepeatedMessage(nestedType, pbandk.wkt.DescriptorProto.Companion, true)
        34 -> enumType = protoUnmarshal.readRepeatedMessage(enumType, pbandk.wkt.EnumDescriptorProto.Companion, true)
        42 -> extensionRange = protoUnmarshal.readRepeatedMessage(extensionRange, pbandk.wkt.DescriptorProto.ExtensionRange.Companion, true)
        50 -> extension = protoUnmarshal.readRepeatedMessage(extension, pbandk.wkt.FieldDescriptorProto.Companion, true)
        58 -> options = protoUnmarshal.readMessage(pbandk.wkt.MessageOptions.Companion)
        66 -> oneofDecl = protoUnmarshal.readRepeatedMessage(oneofDecl, pbandk.wkt.OneofDescriptorProto.Companion, true)
        74 -> reservedRange = protoUnmarshal.readRepeatedMessage(reservedRange, pbandk.wkt.DescriptorProto.ReservedRange.Companion, true)
        82 -> reservedName = protoUnmarshal.readRepeated(reservedName, protoUnmarshal::readString, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun DescriptorProto.toJsonMapperImpl(): DescriptorProto.JsonMapper =
    DescriptorProto.JsonMapper(
        name,
        field.map { it.toJsonMapper() },
        nestedType.map { it.toJsonMapper() },
        enumType.map { it.toJsonMapper() },
        extensionRange.map { it.toJsonMapper() },
        extension.map { it.toJsonMapper() },
        options?.toJsonMapper(),
        oneofDecl.map { it.toJsonMapper() },
        reservedRange.map { it.toJsonMapper() },
        reservedName
    )

private fun DescriptorProto.JsonMapper.toMessageImpl(): DescriptorProto =
    DescriptorProto(
        name = name ?: null,
        field = field.map { it.toMessage() },
        extension = extension.map { it.toMessage() },
        nestedType = nestedType.map { it.toMessage() },
        enumType = enumType.map { it.toMessage() },
        extensionRange = extensionRange.map { it.toMessage() },
        oneofDecl = oneofDecl.map { it.toMessage() },
        options = options?.toMessage(),
        reservedRange = reservedRange.map { it.toMessage() },
        reservedName = reservedName ?: emptyList()
    )

private fun DescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(DescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun DescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): DescriptorProto {
    val mapper = json.parse(DescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun DescriptorProto.ExtensionRange?.orDefault() = this ?: DescriptorProto.ExtensionRange.defaultInstance

private fun DescriptorProto.ExtensionRange.protoMergeImpl(plus: DescriptorProto.ExtensionRange?): DescriptorProto.ExtensionRange = plus?.copy(
    start = plus.start ?: start,
    end = plus.end ?: end,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DescriptorProto.ExtensionRange.protoSizeImpl(): Int {
    var protoSize = 0
    if (start != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(start)
    if (end != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(end)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DescriptorProto.ExtensionRange.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (start != null) protoMarshal.writeTag(8).writeInt32(start)
    if (end != null) protoMarshal.writeTag(16).writeInt32(end)
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun DescriptorProto.ExtensionRange.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DescriptorProto.ExtensionRange {
    var start: Int? = null
    var end: Int? = null
    var options: pbandk.wkt.ExtensionRangeOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return DescriptorProto.ExtensionRange(start, end, options, protoUnmarshal.unknownFields())
        8 -> start = protoUnmarshal.readInt32()
        16 -> end = protoUnmarshal.readInt32()
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.ExtensionRangeOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun DescriptorProto.ExtensionRange.toJsonMapperImpl(): DescriptorProto.ExtensionRange.JsonMapper =
    DescriptorProto.ExtensionRange.JsonMapper(
        start,
        end,
        options?.toJsonMapper()
    )

private fun DescriptorProto.ExtensionRange.JsonMapper.toMessageImpl(): DescriptorProto.ExtensionRange =
    DescriptorProto.ExtensionRange(
        start = start ?: null,
        end = end ?: null,
        options = options?.toMessage()
    )

private fun DescriptorProto.ExtensionRange.jsonMarshalImpl(json: Json): String =
    json.stringify(DescriptorProto.ExtensionRange.JsonMapper.serializer(), toJsonMapper())

private fun DescriptorProto.ExtensionRange.Companion.jsonUnmarshalImpl(json: Json, data: String): DescriptorProto.ExtensionRange {
    val mapper = json.parse(DescriptorProto.ExtensionRange.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun DescriptorProto.ReservedRange?.orDefault() = this ?: DescriptorProto.ReservedRange.defaultInstance

private fun DescriptorProto.ReservedRange.protoMergeImpl(plus: DescriptorProto.ReservedRange?): DescriptorProto.ReservedRange = plus?.copy(
    start = plus.start ?: start,
    end = plus.end ?: end,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DescriptorProto.ReservedRange.protoSizeImpl(): Int {
    var protoSize = 0
    if (start != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(start)
    if (end != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(end)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DescriptorProto.ReservedRange.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (start != null) protoMarshal.writeTag(8).writeInt32(start)
    if (end != null) protoMarshal.writeTag(16).writeInt32(end)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun DescriptorProto.ReservedRange.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DescriptorProto.ReservedRange {
    var start: Int? = null
    var end: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return DescriptorProto.ReservedRange(start, end, protoUnmarshal.unknownFields())
        8 -> start = protoUnmarshal.readInt32()
        16 -> end = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun DescriptorProto.ReservedRange.toJsonMapperImpl(): DescriptorProto.ReservedRange.JsonMapper =
    DescriptorProto.ReservedRange.JsonMapper(
        start,
        end
    )

private fun DescriptorProto.ReservedRange.JsonMapper.toMessageImpl(): DescriptorProto.ReservedRange =
    DescriptorProto.ReservedRange(
        start = start ?: null,
        end = end ?: null
    )

private fun DescriptorProto.ReservedRange.jsonMarshalImpl(json: Json): String =
    json.stringify(DescriptorProto.ReservedRange.JsonMapper.serializer(), toJsonMapper())

private fun DescriptorProto.ReservedRange.Companion.jsonUnmarshalImpl(json: Json, data: String): DescriptorProto.ReservedRange {
    val mapper = json.parse(DescriptorProto.ReservedRange.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ExtensionRangeOptions?.orDefault() = this ?: ExtensionRangeOptions.defaultInstance

private fun ExtensionRangeOptions.protoMergeImpl(plus: ExtensionRangeOptions?): ExtensionRangeOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ExtensionRangeOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ExtensionRangeOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ExtensionRangeOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ExtensionRangeOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ExtensionRangeOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun ExtensionRangeOptions.toJsonMapperImpl(): ExtensionRangeOptions.JsonMapper =
    ExtensionRangeOptions.JsonMapper(
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun ExtensionRangeOptions.JsonMapper.toMessageImpl(): ExtensionRangeOptions =
    ExtensionRangeOptions(
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun ExtensionRangeOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(ExtensionRangeOptions.JsonMapper.serializer(), toJsonMapper())

private fun ExtensionRangeOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): ExtensionRangeOptions {
    val mapper = json.parse(ExtensionRangeOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun FieldDescriptorProto?.orDefault() = this ?: FieldDescriptorProto.defaultInstance

private fun FieldDescriptorProto.protoMergeImpl(plus: FieldDescriptorProto?): FieldDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    number = plus.number ?: number,
    label = plus.label ?: label,
    type = plus.type ?: type,
    typeName = plus.typeName ?: typeName,
    extendee = plus.extendee ?: extendee,
    defaultValue = plus.defaultValue ?: defaultValue,
    oneofIndex = plus.oneofIndex ?: oneofIndex,
    jsonName = plus.jsonName ?: jsonName,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FieldDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (number != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.int32Size(number)
    if (label != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.enumSize(label)
    if (type != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.enumSize(type)
    if (typeName != null) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.stringSize(typeName)
    if (extendee != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(extendee)
    if (defaultValue != null) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.stringSize(defaultValue)
    if (oneofIndex != null) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.int32Size(oneofIndex)
    if (jsonName != null) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.stringSize(jsonName)
    if (options != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FieldDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (extendee != null) protoMarshal.writeTag(18).writeString(extendee)
    if (number != null) protoMarshal.writeTag(24).writeInt32(number)
    if (label != null) protoMarshal.writeTag(32).writeEnum(label)
    if (type != null) protoMarshal.writeTag(40).writeEnum(type)
    if (typeName != null) protoMarshal.writeTag(50).writeString(typeName)
    if (defaultValue != null) protoMarshal.writeTag(58).writeString(defaultValue)
    if (options != null) protoMarshal.writeTag(66).writeMessage(options)
    if (oneofIndex != null) protoMarshal.writeTag(72).writeInt32(oneofIndex)
    if (jsonName != null) protoMarshal.writeTag(82).writeString(jsonName)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FieldDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FieldDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var label: pbandk.wkt.FieldDescriptorProto.Label? = null
    var type: pbandk.wkt.FieldDescriptorProto.Type? = null
    var typeName: String? = null
    var extendee: String? = null
    var defaultValue: String? = null
    var oneofIndex: Int? = null
    var jsonName: String? = null
    var options: pbandk.wkt.FieldOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FieldDescriptorProto(name, number, label, type,
            typeName, extendee, defaultValue, oneofIndex,
            jsonName, options, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> extendee = protoUnmarshal.readString()
        24 -> number = protoUnmarshal.readInt32()
        32 -> label = protoUnmarshal.readEnum(pbandk.wkt.FieldDescriptorProto.Label.Companion)
        40 -> type = protoUnmarshal.readEnum(pbandk.wkt.FieldDescriptorProto.Type.Companion)
        50 -> typeName = protoUnmarshal.readString()
        58 -> defaultValue = protoUnmarshal.readString()
        66 -> options = protoUnmarshal.readMessage(pbandk.wkt.FieldOptions.Companion)
        72 -> oneofIndex = protoUnmarshal.readInt32()
        82 -> jsonName = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun FieldDescriptorProto.toJsonMapperImpl(): FieldDescriptorProto.JsonMapper =
    FieldDescriptorProto.JsonMapper(
        name,
        extendee,
        number,
        label?.name,
        type?.name,
        typeName,
        defaultValue,
        options?.toJsonMapper(),
        oneofIndex,
        jsonName
    )

private fun FieldDescriptorProto.JsonMapper.toMessageImpl(): FieldDescriptorProto =
    FieldDescriptorProto(
        name = name ?: null,
        number = number ?: null,
        label = label?.let { pbandk.wkt.FieldDescriptorProto.Label.fromName(it) } ?: null,
        type = type?.let { pbandk.wkt.FieldDescriptorProto.Type.fromName(it) } ?: null,
        typeName = typeName ?: null,
        extendee = extendee ?: null,
        defaultValue = defaultValue ?: null,
        oneofIndex = oneofIndex ?: null,
        jsonName = jsonName ?: null,
        options = options?.toMessage()
    )

private fun FieldDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(FieldDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun FieldDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): FieldDescriptorProto {
    val mapper = json.parse(FieldDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun OneofDescriptorProto?.orDefault() = this ?: OneofDescriptorProto.defaultInstance

private fun OneofDescriptorProto.protoMergeImpl(plus: OneofDescriptorProto?): OneofDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun OneofDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (options != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun OneofDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (options != null) protoMarshal.writeTag(18).writeMessage(options)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun OneofDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): OneofDescriptorProto {
    var name: String? = null
    var options: pbandk.wkt.OneofOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return OneofDescriptorProto(name, options, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> options = protoUnmarshal.readMessage(pbandk.wkt.OneofOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun OneofDescriptorProto.toJsonMapperImpl(): OneofDescriptorProto.JsonMapper =
    OneofDescriptorProto.JsonMapper(
        name,
        options?.toJsonMapper()
    )

private fun OneofDescriptorProto.JsonMapper.toMessageImpl(): OneofDescriptorProto =
    OneofDescriptorProto(
        name = name ?: null,
        options = options?.toMessage()
    )

private fun OneofDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(OneofDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun OneofDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): OneofDescriptorProto {
    val mapper = json.parse(OneofDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun EnumDescriptorProto?.orDefault() = this ?: EnumDescriptorProto.defaultInstance

private fun EnumDescriptorProto.protoMergeImpl(plus: EnumDescriptorProto?): EnumDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    value = value + plus.value,
    options = options?.plus(plus.options) ?: plus.options,
    reservedRange = reservedRange + plus.reservedRange,
    reservedName = reservedName + plus.reservedName,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (value.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * value.size) + value.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    if (reservedRange.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(4) * reservedRange.size) + reservedRange.sumBy(pbandk.Sizer::messageSize)
    if (reservedName.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(5) * reservedName.size) + reservedName.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (value.isNotEmpty()) value.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (reservedRange.isNotEmpty()) reservedRange.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (reservedName.isNotEmpty()) reservedName.forEach { protoMarshal.writeTag(42).writeString(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumDescriptorProto {
    var name: String? = null
    var value: pbandk.ListWithSize.Builder<pbandk.wkt.EnumValueDescriptorProto>? = null
    var options: pbandk.wkt.EnumOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(value), options, pbandk.ListWithSize.Builder.fixed(reservedRange),
            pbandk.ListWithSize.Builder.fixed(reservedName), protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readRepeatedMessage(value, pbandk.wkt.EnumValueDescriptorProto.Companion, true)
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.EnumOptions.Companion)
        34 -> reservedRange = protoUnmarshal.readRepeatedMessage(reservedRange, pbandk.wkt.EnumDescriptorProto.EnumReservedRange.Companion, true)
        42 -> reservedName = protoUnmarshal.readRepeated(reservedName, protoUnmarshal::readString, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumDescriptorProto.toJsonMapperImpl(): EnumDescriptorProto.JsonMapper =
    EnumDescriptorProto.JsonMapper(
        name,
        value.map { it.toJsonMapper() },
        options?.toJsonMapper(),
        reservedRange.map { it.toJsonMapper() },
        reservedName
    )

private fun EnumDescriptorProto.JsonMapper.toMessageImpl(): EnumDescriptorProto =
    EnumDescriptorProto(
        name = name ?: null,
        value = value.map { it.toMessage() },
        options = options?.toMessage(),
        reservedRange = reservedRange.map { it.toMessage() },
        reservedName = reservedName ?: emptyList()
    )

private fun EnumDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(EnumDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun EnumDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): EnumDescriptorProto {
    val mapper = json.parse(EnumDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun EnumDescriptorProto.EnumReservedRange?.orDefault() = this ?: EnumDescriptorProto.EnumReservedRange.defaultInstance

private fun EnumDescriptorProto.EnumReservedRange.protoMergeImpl(plus: EnumDescriptorProto.EnumReservedRange?): EnumDescriptorProto.EnumReservedRange = plus?.copy(
    start = plus.start ?: start,
    end = plus.end ?: end,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumDescriptorProto.EnumReservedRange.protoSizeImpl(): Int {
    var protoSize = 0
    if (start != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(start)
    if (end != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(end)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumDescriptorProto.EnumReservedRange.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (start != null) protoMarshal.writeTag(8).writeInt32(start)
    if (end != null) protoMarshal.writeTag(16).writeInt32(end)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumDescriptorProto.EnumReservedRange.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumDescriptorProto.EnumReservedRange {
    var start: Int? = null
    var end: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumDescriptorProto.EnumReservedRange(start, end, protoUnmarshal.unknownFields())
        8 -> start = protoUnmarshal.readInt32()
        16 -> end = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumDescriptorProto.EnumReservedRange.toJsonMapperImpl(): EnumDescriptorProto.EnumReservedRange.JsonMapper =
    EnumDescriptorProto.EnumReservedRange.JsonMapper(
        start,
        end
    )

private fun EnumDescriptorProto.EnumReservedRange.JsonMapper.toMessageImpl(): EnumDescriptorProto.EnumReservedRange =
    EnumDescriptorProto.EnumReservedRange(
        start = start ?: null,
        end = end ?: null
    )

private fun EnumDescriptorProto.EnumReservedRange.jsonMarshalImpl(json: Json): String =
    json.stringify(EnumDescriptorProto.EnumReservedRange.JsonMapper.serializer(), toJsonMapper())

private fun EnumDescriptorProto.EnumReservedRange.Companion.jsonUnmarshalImpl(json: Json, data: String): EnumDescriptorProto.EnumReservedRange {
    val mapper = json.parse(EnumDescriptorProto.EnumReservedRange.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun EnumValueDescriptorProto?.orDefault() = this ?: EnumValueDescriptorProto.defaultInstance

private fun EnumValueDescriptorProto.protoMergeImpl(plus: EnumValueDescriptorProto?): EnumValueDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    number = plus.number ?: number,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumValueDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (number != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(number)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumValueDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (number != null) protoMarshal.writeTag(16).writeInt32(number)
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumValueDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumValueDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var options: pbandk.wkt.EnumValueOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumValueDescriptorProto(name, number, options, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        16 -> number = protoUnmarshal.readInt32()
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.EnumValueOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumValueDescriptorProto.toJsonMapperImpl(): EnumValueDescriptorProto.JsonMapper =
    EnumValueDescriptorProto.JsonMapper(
        name,
        number,
        options?.toJsonMapper()
    )

private fun EnumValueDescriptorProto.JsonMapper.toMessageImpl(): EnumValueDescriptorProto =
    EnumValueDescriptorProto(
        name = name ?: null,
        number = number ?: null,
        options = options?.toMessage()
    )

private fun EnumValueDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(EnumValueDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun EnumValueDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): EnumValueDescriptorProto {
    val mapper = json.parse(EnumValueDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ServiceDescriptorProto?.orDefault() = this ?: ServiceDescriptorProto.defaultInstance

private fun ServiceDescriptorProto.protoMergeImpl(plus: ServiceDescriptorProto?): ServiceDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    method = method + plus.method,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ServiceDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (method.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * method.size) + method.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ServiceDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (method.isNotEmpty()) method.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ServiceDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ServiceDescriptorProto {
    var name: String? = null
    var method: pbandk.ListWithSize.Builder<pbandk.wkt.MethodDescriptorProto>? = null
    var options: pbandk.wkt.ServiceOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ServiceDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(method), options, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> method = protoUnmarshal.readRepeatedMessage(method, pbandk.wkt.MethodDescriptorProto.Companion, true)
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.ServiceOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun ServiceDescriptorProto.toJsonMapperImpl(): ServiceDescriptorProto.JsonMapper =
    ServiceDescriptorProto.JsonMapper(
        name,
        method.map { it.toJsonMapper() },
        options?.toJsonMapper()
    )

private fun ServiceDescriptorProto.JsonMapper.toMessageImpl(): ServiceDescriptorProto =
    ServiceDescriptorProto(
        name = name ?: null,
        method = method.map { it.toMessage() },
        options = options?.toMessage()
    )

private fun ServiceDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(ServiceDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun ServiceDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): ServiceDescriptorProto {
    val mapper = json.parse(ServiceDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun MethodDescriptorProto?.orDefault() = this ?: MethodDescriptorProto.defaultInstance

private fun MethodDescriptorProto.protoMergeImpl(plus: MethodDescriptorProto?): MethodDescriptorProto = plus?.copy(
    name = plus.name ?: name,
    inputType = plus.inputType ?: inputType,
    outputType = plus.outputType ?: outputType,
    options = options?.plus(plus.options) ?: plus.options,
    clientStreaming = plus.clientStreaming ?: clientStreaming,
    serverStreaming = plus.serverStreaming ?: serverStreaming,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MethodDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (inputType != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(inputType)
    if (outputType != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(outputType)
    if (options != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.messageSize(options)
    if (clientStreaming != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.boolSize(clientStreaming)
    if (serverStreaming != null) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.boolSize(serverStreaming)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MethodDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (inputType != null) protoMarshal.writeTag(18).writeString(inputType)
    if (outputType != null) protoMarshal.writeTag(26).writeString(outputType)
    if (options != null) protoMarshal.writeTag(34).writeMessage(options)
    if (clientStreaming != null) protoMarshal.writeTag(40).writeBool(clientStreaming)
    if (serverStreaming != null) protoMarshal.writeTag(48).writeBool(serverStreaming)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun MethodDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MethodDescriptorProto {
    var name: String? = null
    var inputType: String? = null
    var outputType: String? = null
    var options: pbandk.wkt.MethodOptions? = null
    var clientStreaming: Boolean? = null
    var serverStreaming: Boolean? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MethodDescriptorProto(name, inputType, outputType, options,
            clientStreaming, serverStreaming, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> inputType = protoUnmarshal.readString()
        26 -> outputType = protoUnmarshal.readString()
        34 -> options = protoUnmarshal.readMessage(pbandk.wkt.MethodOptions.Companion)
        40 -> clientStreaming = protoUnmarshal.readBool()
        48 -> serverStreaming = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun MethodDescriptorProto.toJsonMapperImpl(): MethodDescriptorProto.JsonMapper =
    MethodDescriptorProto.JsonMapper(
        name,
        inputType,
        outputType,
        options?.toJsonMapper(),
        clientStreaming,
        serverStreaming
    )

private fun MethodDescriptorProto.JsonMapper.toMessageImpl(): MethodDescriptorProto =
    MethodDescriptorProto(
        name = name ?: null,
        inputType = inputType ?: null,
        outputType = outputType ?: null,
        options = options?.toMessage(),
        clientStreaming = clientStreaming ?: null,
        serverStreaming = serverStreaming ?: null
    )

private fun MethodDescriptorProto.jsonMarshalImpl(json: Json): String =
    json.stringify(MethodDescriptorProto.JsonMapper.serializer(), toJsonMapper())

private fun MethodDescriptorProto.Companion.jsonUnmarshalImpl(json: Json, data: String): MethodDescriptorProto {
    val mapper = json.parse(MethodDescriptorProto.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun FileOptions?.orDefault() = this ?: FileOptions.defaultInstance

private fun FileOptions.protoMergeImpl(plus: FileOptions?): FileOptions = plus?.copy(
    javaPackage = plus.javaPackage ?: javaPackage,
    javaOuterClassname = plus.javaOuterClassname ?: javaOuterClassname,
    javaMultipleFiles = plus.javaMultipleFiles ?: javaMultipleFiles,
    javaGenerateEqualsAndHash = plus.javaGenerateEqualsAndHash ?: javaGenerateEqualsAndHash,
    javaStringCheckUtf8 = plus.javaStringCheckUtf8 ?: javaStringCheckUtf8,
    optimizeFor = plus.optimizeFor ?: optimizeFor,
    goPackage = plus.goPackage ?: goPackage,
    ccGenericServices = plus.ccGenericServices ?: ccGenericServices,
    javaGenericServices = plus.javaGenericServices ?: javaGenericServices,
    pyGenericServices = plus.pyGenericServices ?: pyGenericServices,
    phpGenericServices = plus.phpGenericServices ?: phpGenericServices,
    deprecated = plus.deprecated ?: deprecated,
    ccEnableArenas = plus.ccEnableArenas ?: ccEnableArenas,
    objcClassPrefix = plus.objcClassPrefix ?: objcClassPrefix,
    csharpNamespace = plus.csharpNamespace ?: csharpNamespace,
    swiftPrefix = plus.swiftPrefix ?: swiftPrefix,
    phpClassPrefix = plus.phpClassPrefix ?: phpClassPrefix,
    phpNamespace = plus.phpNamespace ?: phpNamespace,
    phpMetadataNamespace = plus.phpMetadataNamespace ?: phpMetadataNamespace,
    rubyPackage = plus.rubyPackage ?: rubyPackage,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FileOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (javaPackage != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(javaPackage)
    if (javaOuterClassname != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.stringSize(javaOuterClassname)
    if (javaMultipleFiles != null) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.boolSize(javaMultipleFiles)
    if (javaGenerateEqualsAndHash != null) protoSize += pbandk.Sizer.tagSize(20) + pbandk.Sizer.boolSize(javaGenerateEqualsAndHash)
    if (javaStringCheckUtf8 != null) protoSize += pbandk.Sizer.tagSize(27) + pbandk.Sizer.boolSize(javaStringCheckUtf8)
    if (optimizeFor != null) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.enumSize(optimizeFor)
    if (goPackage != null) protoSize += pbandk.Sizer.tagSize(11) + pbandk.Sizer.stringSize(goPackage)
    if (ccGenericServices != null) protoSize += pbandk.Sizer.tagSize(16) + pbandk.Sizer.boolSize(ccGenericServices)
    if (javaGenericServices != null) protoSize += pbandk.Sizer.tagSize(17) + pbandk.Sizer.boolSize(javaGenericServices)
    if (pyGenericServices != null) protoSize += pbandk.Sizer.tagSize(18) + pbandk.Sizer.boolSize(pyGenericServices)
    if (phpGenericServices != null) protoSize += pbandk.Sizer.tagSize(42) + pbandk.Sizer.boolSize(phpGenericServices)
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(23) + pbandk.Sizer.boolSize(deprecated)
    if (ccEnableArenas != null) protoSize += pbandk.Sizer.tagSize(31) + pbandk.Sizer.boolSize(ccEnableArenas)
    if (objcClassPrefix != null) protoSize += pbandk.Sizer.tagSize(36) + pbandk.Sizer.stringSize(objcClassPrefix)
    if (csharpNamespace != null) protoSize += pbandk.Sizer.tagSize(37) + pbandk.Sizer.stringSize(csharpNamespace)
    if (swiftPrefix != null) protoSize += pbandk.Sizer.tagSize(39) + pbandk.Sizer.stringSize(swiftPrefix)
    if (phpClassPrefix != null) protoSize += pbandk.Sizer.tagSize(40) + pbandk.Sizer.stringSize(phpClassPrefix)
    if (phpNamespace != null) protoSize += pbandk.Sizer.tagSize(41) + pbandk.Sizer.stringSize(phpNamespace)
    if (phpMetadataNamespace != null) protoSize += pbandk.Sizer.tagSize(44) + pbandk.Sizer.stringSize(phpMetadataNamespace)
    if (rubyPackage != null) protoSize += pbandk.Sizer.tagSize(45) + pbandk.Sizer.stringSize(rubyPackage)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FileOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (javaPackage != null) protoMarshal.writeTag(10).writeString(javaPackage)
    if (javaOuterClassname != null) protoMarshal.writeTag(66).writeString(javaOuterClassname)
    if (optimizeFor != null) protoMarshal.writeTag(72).writeEnum(optimizeFor)
    if (javaMultipleFiles != null) protoMarshal.writeTag(80).writeBool(javaMultipleFiles)
    if (goPackage != null) protoMarshal.writeTag(90).writeString(goPackage)
    if (ccGenericServices != null) protoMarshal.writeTag(128).writeBool(ccGenericServices)
    if (javaGenericServices != null) protoMarshal.writeTag(136).writeBool(javaGenericServices)
    if (pyGenericServices != null) protoMarshal.writeTag(144).writeBool(pyGenericServices)
    if (javaGenerateEqualsAndHash != null) protoMarshal.writeTag(160).writeBool(javaGenerateEqualsAndHash)
    if (deprecated != null) protoMarshal.writeTag(184).writeBool(deprecated)
    if (javaStringCheckUtf8 != null) protoMarshal.writeTag(216).writeBool(javaStringCheckUtf8)
    if (ccEnableArenas != null) protoMarshal.writeTag(248).writeBool(ccEnableArenas)
    if (objcClassPrefix != null) protoMarshal.writeTag(290).writeString(objcClassPrefix)
    if (csharpNamespace != null) protoMarshal.writeTag(298).writeString(csharpNamespace)
    if (swiftPrefix != null) protoMarshal.writeTag(314).writeString(swiftPrefix)
    if (phpClassPrefix != null) protoMarshal.writeTag(322).writeString(phpClassPrefix)
    if (phpNamespace != null) protoMarshal.writeTag(330).writeString(phpNamespace)
    if (phpGenericServices != null) protoMarshal.writeTag(336).writeBool(phpGenericServices)
    if (phpMetadataNamespace != null) protoMarshal.writeTag(354).writeString(phpMetadataNamespace)
    if (rubyPackage != null) protoMarshal.writeTag(362).writeString(rubyPackage)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FileOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FileOptions {
    var javaPackage: String? = null
    var javaOuterClassname: String? = null
    var javaMultipleFiles: Boolean? = null
    var javaGenerateEqualsAndHash: Boolean? = null
    var javaStringCheckUtf8: Boolean? = null
    var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null
    var goPackage: String? = null
    var ccGenericServices: Boolean? = null
    var javaGenericServices: Boolean? = null
    var pyGenericServices: Boolean? = null
    var phpGenericServices: Boolean? = null
    var deprecated: Boolean? = null
    var ccEnableArenas: Boolean? = null
    var objcClassPrefix: String? = null
    var csharpNamespace: String? = null
    var swiftPrefix: String? = null
    var phpClassPrefix: String? = null
    var phpNamespace: String? = null
    var phpMetadataNamespace: String? = null
    var rubyPackage: String? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileOptions(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash,
            javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices,
            javaGenericServices, pyGenericServices, phpGenericServices, deprecated,
            ccEnableArenas, objcClassPrefix, csharpNamespace, swiftPrefix,
            phpClassPrefix, phpNamespace, phpMetadataNamespace, rubyPackage,
            pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        10 -> javaPackage = protoUnmarshal.readString()
        66 -> javaOuterClassname = protoUnmarshal.readString()
        72 -> optimizeFor = protoUnmarshal.readEnum(pbandk.wkt.FileOptions.OptimizeMode.Companion)
        80 -> javaMultipleFiles = protoUnmarshal.readBool()
        90 -> goPackage = protoUnmarshal.readString()
        128 -> ccGenericServices = protoUnmarshal.readBool()
        136 -> javaGenericServices = protoUnmarshal.readBool()
        144 -> pyGenericServices = protoUnmarshal.readBool()
        160 -> javaGenerateEqualsAndHash = protoUnmarshal.readBool()
        184 -> deprecated = protoUnmarshal.readBool()
        216 -> javaStringCheckUtf8 = protoUnmarshal.readBool()
        248 -> ccEnableArenas = protoUnmarshal.readBool()
        290 -> objcClassPrefix = protoUnmarshal.readString()
        298 -> csharpNamespace = protoUnmarshal.readString()
        314 -> swiftPrefix = protoUnmarshal.readString()
        322 -> phpClassPrefix = protoUnmarshal.readString()
        330 -> phpNamespace = protoUnmarshal.readString()
        336 -> phpGenericServices = protoUnmarshal.readBool()
        354 -> phpMetadataNamespace = protoUnmarshal.readString()
        362 -> rubyPackage = protoUnmarshal.readString()
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun FileOptions.toJsonMapperImpl(): FileOptions.JsonMapper =
    FileOptions.JsonMapper(
        javaPackage,
        javaOuterClassname,
        optimizeFor?.name,
        javaMultipleFiles,
        goPackage,
        ccGenericServices,
        javaGenericServices,
        pyGenericServices,
        javaGenerateEqualsAndHash,
        deprecated,
        javaStringCheckUtf8,
        ccEnableArenas,
        objcClassPrefix,
        csharpNamespace,
        swiftPrefix,
        phpClassPrefix,
        phpNamespace,
        phpGenericServices,
        phpMetadataNamespace,
        rubyPackage,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun FileOptions.JsonMapper.toMessageImpl(): FileOptions =
    FileOptions(
        javaPackage = javaPackage ?: null,
        javaOuterClassname = javaOuterClassname ?: null,
        javaMultipleFiles = javaMultipleFiles ?: null,
        javaGenerateEqualsAndHash = javaGenerateEqualsAndHash ?: null,
        javaStringCheckUtf8 = javaStringCheckUtf8 ?: null,
        optimizeFor = optimizeFor?.let { pbandk.wkt.FileOptions.OptimizeMode.fromName(it) } ?: null,
        goPackage = goPackage ?: null,
        ccGenericServices = ccGenericServices ?: null,
        javaGenericServices = javaGenericServices ?: null,
        pyGenericServices = pyGenericServices ?: null,
        phpGenericServices = phpGenericServices ?: null,
        deprecated = deprecated ?: null,
        ccEnableArenas = ccEnableArenas ?: null,
        objcClassPrefix = objcClassPrefix ?: null,
        csharpNamespace = csharpNamespace ?: null,
        swiftPrefix = swiftPrefix ?: null,
        phpClassPrefix = phpClassPrefix ?: null,
        phpNamespace = phpNamespace ?: null,
        phpMetadataNamespace = phpMetadataNamespace ?: null,
        rubyPackage = rubyPackage ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun FileOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(FileOptions.JsonMapper.serializer(), toJsonMapper())

private fun FileOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): FileOptions {
    val mapper = json.parse(FileOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun MessageOptions?.orDefault() = this ?: MessageOptions.defaultInstance

private fun MessageOptions.protoMergeImpl(plus: MessageOptions?): MessageOptions = plus?.copy(
    messageSetWireFormat = plus.messageSetWireFormat ?: messageSetWireFormat,
    noStandardDescriptorAccessor = plus.noStandardDescriptorAccessor ?: noStandardDescriptorAccessor,
    deprecated = plus.deprecated ?: deprecated,
    mapEntry = plus.mapEntry ?: mapEntry,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MessageOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (messageSetWireFormat != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(messageSetWireFormat)
    if (noStandardDescriptorAccessor != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(noStandardDescriptorAccessor)
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(deprecated)
    if (mapEntry != null) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.boolSize(mapEntry)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MessageOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (messageSetWireFormat != null) protoMarshal.writeTag(8).writeBool(messageSetWireFormat)
    if (noStandardDescriptorAccessor != null) protoMarshal.writeTag(16).writeBool(noStandardDescriptorAccessor)
    if (deprecated != null) protoMarshal.writeTag(24).writeBool(deprecated)
    if (mapEntry != null) protoMarshal.writeTag(56).writeBool(mapEntry)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun MessageOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MessageOptions {
    var messageSetWireFormat: Boolean? = null
    var noStandardDescriptorAccessor: Boolean? = null
    var deprecated: Boolean? = null
    var mapEntry: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MessageOptions(messageSetWireFormat, noStandardDescriptorAccessor, deprecated, mapEntry,
            pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        8 -> messageSetWireFormat = protoUnmarshal.readBool()
        16 -> noStandardDescriptorAccessor = protoUnmarshal.readBool()
        24 -> deprecated = protoUnmarshal.readBool()
        56 -> mapEntry = protoUnmarshal.readBool()
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun MessageOptions.toJsonMapperImpl(): MessageOptions.JsonMapper =
    MessageOptions.JsonMapper(
        messageSetWireFormat,
        noStandardDescriptorAccessor,
        deprecated,
        mapEntry,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun MessageOptions.JsonMapper.toMessageImpl(): MessageOptions =
    MessageOptions(
        messageSetWireFormat = messageSetWireFormat ?: null,
        noStandardDescriptorAccessor = noStandardDescriptorAccessor ?: null,
        deprecated = deprecated ?: null,
        mapEntry = mapEntry ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun MessageOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(MessageOptions.JsonMapper.serializer(), toJsonMapper())

private fun MessageOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): MessageOptions {
    val mapper = json.parse(MessageOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun FieldOptions?.orDefault() = this ?: FieldOptions.defaultInstance

private fun FieldOptions.protoMergeImpl(plus: FieldOptions?): FieldOptions = plus?.copy(
    ctype = plus.ctype ?: ctype,
    packed = plus.packed ?: packed,
    jstype = plus.jstype ?: jstype,
    lazy = plus.lazy ?: lazy,
    deprecated = plus.deprecated ?: deprecated,
    weak = plus.weak ?: weak,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FieldOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (ctype != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.enumSize(ctype)
    if (packed != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(packed)
    if (jstype != null) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.enumSize(jstype)
    if (lazy != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.boolSize(lazy)
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(deprecated)
    if (weak != null) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.boolSize(weak)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FieldOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (ctype != null) protoMarshal.writeTag(8).writeEnum(ctype)
    if (packed != null) protoMarshal.writeTag(16).writeBool(packed)
    if (deprecated != null) protoMarshal.writeTag(24).writeBool(deprecated)
    if (lazy != null) protoMarshal.writeTag(40).writeBool(lazy)
    if (jstype != null) protoMarshal.writeTag(48).writeEnum(jstype)
    if (weak != null) protoMarshal.writeTag(80).writeBool(weak)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FieldOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FieldOptions {
    var ctype: pbandk.wkt.FieldOptions.CType? = null
    var packed: Boolean? = null
    var jstype: pbandk.wkt.FieldOptions.JSType? = null
    var lazy: Boolean? = null
    var deprecated: Boolean? = null
    var weak: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FieldOptions(ctype, packed, jstype, lazy,
            deprecated, weak, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        8 -> ctype = protoUnmarshal.readEnum(pbandk.wkt.FieldOptions.CType.Companion)
        16 -> packed = protoUnmarshal.readBool()
        24 -> deprecated = protoUnmarshal.readBool()
        40 -> lazy = protoUnmarshal.readBool()
        48 -> jstype = protoUnmarshal.readEnum(pbandk.wkt.FieldOptions.JSType.Companion)
        80 -> weak = protoUnmarshal.readBool()
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun FieldOptions.toJsonMapperImpl(): FieldOptions.JsonMapper =
    FieldOptions.JsonMapper(
        ctype?.name,
        packed,
        deprecated,
        lazy,
        jstype?.name,
        weak,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun FieldOptions.JsonMapper.toMessageImpl(): FieldOptions =
    FieldOptions(
        ctype = ctype?.let { pbandk.wkt.FieldOptions.CType.fromName(it) } ?: null,
        packed = packed ?: null,
        jstype = jstype?.let { pbandk.wkt.FieldOptions.JSType.fromName(it) } ?: null,
        lazy = lazy ?: null,
        deprecated = deprecated ?: null,
        weak = weak ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun FieldOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(FieldOptions.JsonMapper.serializer(), toJsonMapper())

private fun FieldOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): FieldOptions {
    val mapper = json.parse(FieldOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun OneofOptions?.orDefault() = this ?: OneofOptions.defaultInstance

private fun OneofOptions.protoMergeImpl(plus: OneofOptions?): OneofOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun OneofOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun OneofOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun OneofOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): OneofOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return OneofOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun OneofOptions.toJsonMapperImpl(): OneofOptions.JsonMapper =
    OneofOptions.JsonMapper(
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun OneofOptions.JsonMapper.toMessageImpl(): OneofOptions =
    OneofOptions(
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun OneofOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(OneofOptions.JsonMapper.serializer(), toJsonMapper())

private fun OneofOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): OneofOptions {
    val mapper = json.parse(OneofOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun EnumOptions?.orDefault() = this ?: EnumOptions.defaultInstance

private fun EnumOptions.protoMergeImpl(plus: EnumOptions?): EnumOptions = plus?.copy(
    allowAlias = plus.allowAlias ?: allowAlias,
    deprecated = plus.deprecated ?: deprecated,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (allowAlias != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(allowAlias)
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(deprecated)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (allowAlias != null) protoMarshal.writeTag(16).writeBool(allowAlias)
    if (deprecated != null) protoMarshal.writeTag(24).writeBool(deprecated)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumOptions {
    var allowAlias: Boolean? = null
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumOptions(allowAlias, deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        16 -> allowAlias = protoUnmarshal.readBool()
        24 -> deprecated = protoUnmarshal.readBool()
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumOptions.toJsonMapperImpl(): EnumOptions.JsonMapper =
    EnumOptions.JsonMapper(
        allowAlias,
        deprecated,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun EnumOptions.JsonMapper.toMessageImpl(): EnumOptions =
    EnumOptions(
        allowAlias = allowAlias ?: null,
        deprecated = deprecated ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun EnumOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(EnumOptions.JsonMapper.serializer(), toJsonMapper())

private fun EnumOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): EnumOptions {
    val mapper = json.parse(EnumOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun EnumValueOptions?.orDefault() = this ?: EnumValueOptions.defaultInstance

private fun EnumValueOptions.protoMergeImpl(plus: EnumValueOptions?): EnumValueOptions = plus?.copy(
    deprecated = plus.deprecated ?: deprecated,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumValueOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(deprecated)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumValueOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (deprecated != null) protoMarshal.writeTag(8).writeBool(deprecated)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumValueOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumValueOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumValueOptions(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        8 -> deprecated = protoUnmarshal.readBool()
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumValueOptions.toJsonMapperImpl(): EnumValueOptions.JsonMapper =
    EnumValueOptions.JsonMapper(
        deprecated,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun EnumValueOptions.JsonMapper.toMessageImpl(): EnumValueOptions =
    EnumValueOptions(
        deprecated = deprecated ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun EnumValueOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(EnumValueOptions.JsonMapper.serializer(), toJsonMapper())

private fun EnumValueOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): EnumValueOptions {
    val mapper = json.parse(EnumValueOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun ServiceOptions?.orDefault() = this ?: ServiceOptions.defaultInstance

private fun ServiceOptions.protoMergeImpl(plus: ServiceOptions?): ServiceOptions = plus?.copy(
    deprecated = plus.deprecated ?: deprecated,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ServiceOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(33) + pbandk.Sizer.boolSize(deprecated)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ServiceOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (deprecated != null) protoMarshal.writeTag(264).writeBool(deprecated)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun ServiceOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ServiceOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ServiceOptions(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        264 -> deprecated = protoUnmarshal.readBool()
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun ServiceOptions.toJsonMapperImpl(): ServiceOptions.JsonMapper =
    ServiceOptions.JsonMapper(
        deprecated,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun ServiceOptions.JsonMapper.toMessageImpl(): ServiceOptions =
    ServiceOptions(
        deprecated = deprecated ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun ServiceOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(ServiceOptions.JsonMapper.serializer(), toJsonMapper())

private fun ServiceOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): ServiceOptions {
    val mapper = json.parse(ServiceOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun MethodOptions?.orDefault() = this ?: MethodOptions.defaultInstance

private fun MethodOptions.protoMergeImpl(plus: MethodOptions?): MethodOptions = plus?.copy(
    deprecated = plus.deprecated ?: deprecated,
    idempotencyLevel = plus.idempotencyLevel ?: idempotencyLevel,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MethodOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (deprecated != null) protoSize += pbandk.Sizer.tagSize(33) + pbandk.Sizer.boolSize(deprecated)
    if (idempotencyLevel != null) protoSize += pbandk.Sizer.tagSize(34) + pbandk.Sizer.enumSize(idempotencyLevel)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MethodOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (deprecated != null) protoMarshal.writeTag(264).writeBool(deprecated)
    if (idempotencyLevel != null) protoMarshal.writeTag(272).writeEnum(idempotencyLevel)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun MethodOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MethodOptions {
    var deprecated: Boolean? = null
    var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MethodOptions(deprecated, idempotencyLevel, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
        264 -> deprecated = protoUnmarshal.readBool()
        272 -> idempotencyLevel = protoUnmarshal.readEnum(pbandk.wkt.MethodOptions.IdempotencyLevel.Companion)
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun MethodOptions.toJsonMapperImpl(): MethodOptions.JsonMapper =
    MethodOptions.JsonMapper(
        deprecated,
        idempotencyLevel?.name,
        uninterpretedOption.map { it.toJsonMapper() }
    )

private fun MethodOptions.JsonMapper.toMessageImpl(): MethodOptions =
    MethodOptions(
        deprecated = deprecated ?: null,
        idempotencyLevel = idempotencyLevel?.let { pbandk.wkt.MethodOptions.IdempotencyLevel.fromName(it) } ?: null,
        uninterpretedOption = uninterpretedOption.map { it.toMessage() }
    )

private fun MethodOptions.jsonMarshalImpl(json: Json): String =
    json.stringify(MethodOptions.JsonMapper.serializer(), toJsonMapper())

private fun MethodOptions.Companion.jsonUnmarshalImpl(json: Json, data: String): MethodOptions {
    val mapper = json.parse(MethodOptions.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun UninterpretedOption?.orDefault() = this ?: UninterpretedOption.defaultInstance

private fun UninterpretedOption.protoMergeImpl(plus: UninterpretedOption?): UninterpretedOption = plus?.copy(
    name = name + plus.name,
    identifierValue = plus.identifierValue ?: identifierValue,
    positiveIntValue = plus.positiveIntValue ?: positiveIntValue,
    negativeIntValue = plus.negativeIntValue ?: negativeIntValue,
    doubleValue = plus.doubleValue ?: doubleValue,
    stringValue = plus.stringValue ?: stringValue,
    aggregateValue = plus.aggregateValue ?: aggregateValue,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UninterpretedOption.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * name.size) + name.sumBy(pbandk.Sizer::messageSize)
    if (identifierValue != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(identifierValue)
    if (positiveIntValue != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.uInt64Size(positiveIntValue)
    if (negativeIntValue != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.int64Size(negativeIntValue)
    if (doubleValue != null) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.doubleSize(doubleValue)
    if (stringValue != null) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.bytesSize(stringValue)
    if (aggregateValue != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.stringSize(aggregateValue)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UninterpretedOption.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) name.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (identifierValue != null) protoMarshal.writeTag(26).writeString(identifierValue)
    if (positiveIntValue != null) protoMarshal.writeTag(32).writeUInt64(positiveIntValue)
    if (negativeIntValue != null) protoMarshal.writeTag(40).writeInt64(negativeIntValue)
    if (doubleValue != null) protoMarshal.writeTag(49).writeDouble(doubleValue)
    if (stringValue != null) protoMarshal.writeTag(58).writeBytes(stringValue)
    if (aggregateValue != null) protoMarshal.writeTag(66).writeString(aggregateValue)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UninterpretedOption.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UninterpretedOption {
    var name: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption.NamePart>? = null
    var identifierValue: String? = null
    var positiveIntValue: Long? = null
    var negativeIntValue: Long? = null
    var doubleValue: Double? = null
    var stringValue: pbandk.ByteArr? = null
    var aggregateValue: String? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UninterpretedOption(pbandk.ListWithSize.Builder.fixed(name), identifierValue, positiveIntValue, negativeIntValue,
            doubleValue, stringValue, aggregateValue, protoUnmarshal.unknownFields())
        18 -> name = protoUnmarshal.readRepeatedMessage(name, pbandk.wkt.UninterpretedOption.NamePart.Companion, true)
        26 -> identifierValue = protoUnmarshal.readString()
        32 -> positiveIntValue = protoUnmarshal.readUInt64()
        40 -> negativeIntValue = protoUnmarshal.readInt64()
        49 -> doubleValue = protoUnmarshal.readDouble()
        58 -> stringValue = protoUnmarshal.readBytes()
        66 -> aggregateValue = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun UninterpretedOption.toJsonMapperImpl(): UninterpretedOption.JsonMapper =
    UninterpretedOption.JsonMapper(
        name.map { it.toJsonMapper() },
        identifierValue,
        positiveIntValue,
        negativeIntValue,
        doubleValue,
        stringValue,
        aggregateValue
    )

private fun UninterpretedOption.JsonMapper.toMessageImpl(): UninterpretedOption =
    UninterpretedOption(
        name = name.map { it.toMessage() },
        identifierValue = identifierValue ?: null,
        positiveIntValue = positiveIntValue ?: null,
        negativeIntValue = negativeIntValue ?: null,
        doubleValue = doubleValue ?: null,
        stringValue = stringValue ?: null,
        aggregateValue = aggregateValue ?: null
    )

private fun UninterpretedOption.jsonMarshalImpl(json: Json): String =
    json.stringify(UninterpretedOption.JsonMapper.serializer(), toJsonMapper())

private fun UninterpretedOption.Companion.jsonUnmarshalImpl(json: Json, data: String): UninterpretedOption {
    val mapper = json.parse(UninterpretedOption.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun UninterpretedOption.NamePart?.orDefault() = this ?: UninterpretedOption.NamePart.defaultInstance

private fun UninterpretedOption.NamePart.protoMergeImpl(plus: UninterpretedOption.NamePart?): UninterpretedOption.NamePart = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UninterpretedOption.NamePart.protoSizeImpl(): Int {
    var protoSize = 0
    if (namePart.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(namePart)
    if (isExtension) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(isExtension)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UninterpretedOption.NamePart.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (namePart.isNotEmpty()) protoMarshal.writeTag(10).writeString(namePart)
    if (isExtension) protoMarshal.writeTag(16).writeBool(isExtension)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UninterpretedOption.NamePart.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UninterpretedOption.NamePart {
    var namePart = ""
    var isExtension = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UninterpretedOption.NamePart(namePart, isExtension, protoUnmarshal.unknownFields())
        10 -> namePart = protoUnmarshal.readString()
        16 -> isExtension = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

private fun UninterpretedOption.NamePart.toJsonMapperImpl(): UninterpretedOption.NamePart.JsonMapper =
    UninterpretedOption.NamePart.JsonMapper(
        namePart.takeIf { it != "" },
        isExtension
    )

private fun UninterpretedOption.NamePart.JsonMapper.toMessageImpl(): UninterpretedOption.NamePart =
    UninterpretedOption.NamePart(
        namePart = namePart ?: "",
        isExtension = isExtension ?: false
    )

private fun UninterpretedOption.NamePart.jsonMarshalImpl(json: Json): String =
    json.stringify(UninterpretedOption.NamePart.JsonMapper.serializer(), toJsonMapper())

private fun UninterpretedOption.NamePart.Companion.jsonUnmarshalImpl(json: Json, data: String): UninterpretedOption.NamePart {
    val mapper = json.parse(UninterpretedOption.NamePart.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun SourceCodeInfo?.orDefault() = this ?: SourceCodeInfo.defaultInstance

private fun SourceCodeInfo.protoMergeImpl(plus: SourceCodeInfo?): SourceCodeInfo = plus?.copy(
    location = location + plus.location,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun SourceCodeInfo.protoSizeImpl(): Int {
    var protoSize = 0
    if (location.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * location.size) + location.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun SourceCodeInfo.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (location.isNotEmpty()) location.forEach { protoMarshal.writeTag(10).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun SourceCodeInfo.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): SourceCodeInfo {
    var location: pbandk.ListWithSize.Builder<pbandk.wkt.SourceCodeInfo.Location>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return SourceCodeInfo(pbandk.ListWithSize.Builder.fixed(location), protoUnmarshal.unknownFields())
        10 -> location = protoUnmarshal.readRepeatedMessage(location, pbandk.wkt.SourceCodeInfo.Location.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun SourceCodeInfo.toJsonMapperImpl(): SourceCodeInfo.JsonMapper =
    SourceCodeInfo.JsonMapper(
        location.map { it.toJsonMapper() }
    )

private fun SourceCodeInfo.JsonMapper.toMessageImpl(): SourceCodeInfo =
    SourceCodeInfo(
        location = location.map { it.toMessage() }
    )

private fun SourceCodeInfo.jsonMarshalImpl(json: Json): String =
    json.stringify(SourceCodeInfo.JsonMapper.serializer(), toJsonMapper())

private fun SourceCodeInfo.Companion.jsonUnmarshalImpl(json: Json, data: String): SourceCodeInfo {
    val mapper = json.parse(SourceCodeInfo.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun SourceCodeInfo.Location?.orDefault() = this ?: SourceCodeInfo.Location.defaultInstance

private fun SourceCodeInfo.Location.protoMergeImpl(plus: SourceCodeInfo.Location?): SourceCodeInfo.Location = plus?.copy(
    path = path + plus.path,
    span = span + plus.span,
    leadingComments = plus.leadingComments ?: leadingComments,
    trailingComments = plus.trailingComments ?: trailingComments,
    leadingDetachedComments = leadingDetachedComments + plus.leadingDetachedComments,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun SourceCodeInfo.Location.protoSizeImpl(): Int {
    var protoSize = 0
    if (path.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.packedRepeatedSize(path, pbandk.Sizer::int32Size)
    if (span.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.packedRepeatedSize(span, pbandk.Sizer::int32Size)
    if (leadingComments != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(leadingComments)
    if (trailingComments != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(trailingComments)
    if (leadingDetachedComments.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * leadingDetachedComments.size) + leadingDetachedComments.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun SourceCodeInfo.Location.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (path.isNotEmpty()) protoMarshal.writeTag(10).writePackedRepeated(path, pbandk.Sizer::int32Size, protoMarshal::writeInt32)
    if (span.isNotEmpty()) protoMarshal.writeTag(18).writePackedRepeated(span, pbandk.Sizer::int32Size, protoMarshal::writeInt32)
    if (leadingComments != null) protoMarshal.writeTag(26).writeString(leadingComments)
    if (trailingComments != null) protoMarshal.writeTag(34).writeString(trailingComments)
    if (leadingDetachedComments.isNotEmpty()) leadingDetachedComments.forEach { protoMarshal.writeTag(50).writeString(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun SourceCodeInfo.Location.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): SourceCodeInfo.Location {
    var path: pbandk.ListWithSize.Builder<Int>? = null
    var span: pbandk.ListWithSize.Builder<Int>? = null
    var leadingComments: String? = null
    var trailingComments: String? = null
    var leadingDetachedComments: pbandk.ListWithSize.Builder<String>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return SourceCodeInfo.Location(pbandk.ListWithSize.Builder.fixed(path), pbandk.ListWithSize.Builder.fixed(span), leadingComments, trailingComments,
            pbandk.ListWithSize.Builder.fixed(leadingDetachedComments), protoUnmarshal.unknownFields())
        10, 8 -> path = protoUnmarshal.readRepeated(path, protoUnmarshal::readInt32, false)
        18, 16 -> span = protoUnmarshal.readRepeated(span, protoUnmarshal::readInt32, false)
        26 -> leadingComments = protoUnmarshal.readString()
        34 -> trailingComments = protoUnmarshal.readString()
        50 -> leadingDetachedComments = protoUnmarshal.readRepeated(leadingDetachedComments, protoUnmarshal::readString, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun SourceCodeInfo.Location.toJsonMapperImpl(): SourceCodeInfo.Location.JsonMapper =
    SourceCodeInfo.Location.JsonMapper(
        path,
        span,
        leadingComments,
        trailingComments,
        leadingDetachedComments
    )

private fun SourceCodeInfo.Location.JsonMapper.toMessageImpl(): SourceCodeInfo.Location =
    SourceCodeInfo.Location(
        path = path ?: emptyList(),
        span = span ?: emptyList(),
        leadingComments = leadingComments ?: null,
        trailingComments = trailingComments ?: null,
        leadingDetachedComments = leadingDetachedComments ?: emptyList()
    )

private fun SourceCodeInfo.Location.jsonMarshalImpl(json: Json): String =
    json.stringify(SourceCodeInfo.Location.JsonMapper.serializer(), toJsonMapper())

private fun SourceCodeInfo.Location.Companion.jsonUnmarshalImpl(json: Json, data: String): SourceCodeInfo.Location {
    val mapper = json.parse(SourceCodeInfo.Location.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun GeneratedCodeInfo?.orDefault() = this ?: GeneratedCodeInfo.defaultInstance

private fun GeneratedCodeInfo.protoMergeImpl(plus: GeneratedCodeInfo?): GeneratedCodeInfo = plus?.copy(
    annotation = annotation + plus.annotation,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun GeneratedCodeInfo.protoSizeImpl(): Int {
    var protoSize = 0
    if (annotation.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * annotation.size) + annotation.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun GeneratedCodeInfo.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (annotation.isNotEmpty()) annotation.forEach { protoMarshal.writeTag(10).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun GeneratedCodeInfo.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): GeneratedCodeInfo {
    var annotation: pbandk.ListWithSize.Builder<pbandk.wkt.GeneratedCodeInfo.Annotation>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return GeneratedCodeInfo(pbandk.ListWithSize.Builder.fixed(annotation), protoUnmarshal.unknownFields())
        10 -> annotation = protoUnmarshal.readRepeatedMessage(annotation, pbandk.wkt.GeneratedCodeInfo.Annotation.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun GeneratedCodeInfo.toJsonMapperImpl(): GeneratedCodeInfo.JsonMapper =
    GeneratedCodeInfo.JsonMapper(
        annotation.map { it.toJsonMapper() }
    )

private fun GeneratedCodeInfo.JsonMapper.toMessageImpl(): GeneratedCodeInfo =
    GeneratedCodeInfo(
        annotation = annotation.map { it.toMessage() }
    )

private fun GeneratedCodeInfo.jsonMarshalImpl(json: Json): String =
    json.stringify(GeneratedCodeInfo.JsonMapper.serializer(), toJsonMapper())

private fun GeneratedCodeInfo.Companion.jsonUnmarshalImpl(json: Json, data: String): GeneratedCodeInfo {
    val mapper = json.parse(GeneratedCodeInfo.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun GeneratedCodeInfo.Annotation?.orDefault() = this ?: GeneratedCodeInfo.Annotation.defaultInstance

private fun GeneratedCodeInfo.Annotation.protoMergeImpl(plus: GeneratedCodeInfo.Annotation?): GeneratedCodeInfo.Annotation = plus?.copy(
    path = path + plus.path,
    sourceFile = plus.sourceFile ?: sourceFile,
    begin = plus.begin ?: begin,
    end = plus.end ?: end,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun GeneratedCodeInfo.Annotation.protoSizeImpl(): Int {
    var protoSize = 0
    if (path.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.packedRepeatedSize(path, pbandk.Sizer::int32Size)
    if (sourceFile != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(sourceFile)
    if (begin != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.int32Size(begin)
    if (end != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.int32Size(end)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun GeneratedCodeInfo.Annotation.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (path.isNotEmpty()) protoMarshal.writeTag(10).writePackedRepeated(path, pbandk.Sizer::int32Size, protoMarshal::writeInt32)
    if (sourceFile != null) protoMarshal.writeTag(18).writeString(sourceFile)
    if (begin != null) protoMarshal.writeTag(24).writeInt32(begin)
    if (end != null) protoMarshal.writeTag(32).writeInt32(end)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun GeneratedCodeInfo.Annotation.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): GeneratedCodeInfo.Annotation {
    var path: pbandk.ListWithSize.Builder<Int>? = null
    var sourceFile: String? = null
    var begin: Int? = null
    var end: Int? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return GeneratedCodeInfo.Annotation(pbandk.ListWithSize.Builder.fixed(path), sourceFile, begin, end, protoUnmarshal.unknownFields())
        10, 8 -> path = protoUnmarshal.readRepeated(path, protoUnmarshal::readInt32, false)
        18 -> sourceFile = protoUnmarshal.readString()
        24 -> begin = protoUnmarshal.readInt32()
        32 -> end = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun GeneratedCodeInfo.Annotation.toJsonMapperImpl(): GeneratedCodeInfo.Annotation.JsonMapper =
    GeneratedCodeInfo.Annotation.JsonMapper(
        path,
        sourceFile,
        begin,
        end
    )

private fun GeneratedCodeInfo.Annotation.JsonMapper.toMessageImpl(): GeneratedCodeInfo.Annotation =
    GeneratedCodeInfo.Annotation(
        path = path ?: emptyList(),
        sourceFile = sourceFile ?: null,
        begin = begin ?: null,
        end = end ?: null
    )

private fun GeneratedCodeInfo.Annotation.jsonMarshalImpl(json: Json): String =
    json.stringify(GeneratedCodeInfo.Annotation.JsonMapper.serializer(), toJsonMapper())

private fun GeneratedCodeInfo.Annotation.Companion.jsonUnmarshalImpl(json: Json, data: String): GeneratedCodeInfo.Annotation {
    val mapper = json.parse(GeneratedCodeInfo.Annotation.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

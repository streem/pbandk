package pbandk.wkt

data class FileDescriptorSet(
    val file: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FileDescriptorSet> {
    override operator fun plus(other: FileDescriptorSet?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<FileDescriptorSet> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FileDescriptorSet.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<FileDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FileDescriptorProto.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<DescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = DescriptorProto.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<ExtensionRange> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = ExtensionRange.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<ReservedRange> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = ReservedRange.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<ExtensionRangeOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ExtensionRangeOptions.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<FieldDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldDescriptorProto.protoUnmarshalImpl(u)
    }

    data class Type(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<Type> {
            val TYPE_DOUBLE = Type(1)
            val TYPE_FLOAT = Type(2)
            val TYPE_INT64 = Type(3)
            val TYPE_UINT64 = Type(4)
            val TYPE_INT32 = Type(5)
            val TYPE_FIXED64 = Type(6)
            val TYPE_FIXED32 = Type(7)
            val TYPE_BOOL = Type(8)
            val TYPE_STRING = Type(9)
            val TYPE_GROUP = Type(10)
            val TYPE_MESSAGE = Type(11)
            val TYPE_BYTES = Type(12)
            val TYPE_UINT32 = Type(13)
            val TYPE_ENUM = Type(14)
            val TYPE_SFIXED32 = Type(15)
            val TYPE_SFIXED64 = Type(16)
            val TYPE_SINT32 = Type(17)
            val TYPE_SINT64 = Type(18)

            override fun fromValue(value: Int) = when (value) {
                1 -> TYPE_DOUBLE
                2 -> TYPE_FLOAT
                3 -> TYPE_INT64
                4 -> TYPE_UINT64
                5 -> TYPE_INT32
                6 -> TYPE_FIXED64
                7 -> TYPE_FIXED32
                8 -> TYPE_BOOL
                9 -> TYPE_STRING
                10 -> TYPE_GROUP
                11 -> TYPE_MESSAGE
                12 -> TYPE_BYTES
                13 -> TYPE_UINT32
                14 -> TYPE_ENUM
                15 -> TYPE_SFIXED32
                16 -> TYPE_SFIXED64
                17 -> TYPE_SINT32
                18 -> TYPE_SINT64
                else -> Type(value)
            }
        }
    }

    data class Label(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<Label> {
            val LABEL_OPTIONAL = Label(1)
            val LABEL_REQUIRED = Label(2)
            val LABEL_REPEATED = Label(3)

            override fun fromValue(value: Int) = when (value) {
                1 -> LABEL_OPTIONAL
                2 -> LABEL_REQUIRED
                3 -> LABEL_REPEATED
                else -> Label(value)
            }
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
    companion object : pbandk.Message.Companion<OneofDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = OneofDescriptorProto.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<EnumDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumDescriptorProto.protoUnmarshalImpl(u)
    }

    data class EnumReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<EnumReservedRange> {
        override operator fun plus(other: EnumReservedRange?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<EnumReservedRange> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumReservedRange.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<EnumValueDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumValueDescriptorProto.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<ServiceDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ServiceDescriptorProto.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<MethodDescriptorProto> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MethodDescriptorProto.protoUnmarshalImpl(u)
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
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FileOptions> {
    override operator fun plus(other: FileOptions?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<FileOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FileOptions.protoUnmarshalImpl(u)
    }

    data class OptimizeMode(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<OptimizeMode> {
            val SPEED = OptimizeMode(1)
            val CODE_SIZE = OptimizeMode(2)
            val LITE_RUNTIME = OptimizeMode(3)

            override fun fromValue(value: Int) = when (value) {
                1 -> SPEED
                2 -> CODE_SIZE
                3 -> LITE_RUNTIME
                else -> OptimizeMode(value)
            }
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
    companion object : pbandk.Message.Companion<MessageOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MessageOptions.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<FieldOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FieldOptions.protoUnmarshalImpl(u)
    }

    data class CType(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<CType> {
            val STRING = CType(0)
            val CORD = CType(1)
            val STRING_PIECE = CType(2)

            override fun fromValue(value: Int) = when (value) {
                0 -> STRING
                1 -> CORD
                2 -> STRING_PIECE
                else -> CType(value)
            }
        }
    }

    data class JSType(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<JSType> {
            val JS_NORMAL = JSType(0)
            val JS_STRING = JSType(1)
            val JS_NUMBER = JSType(2)

            override fun fromValue(value: Int) = when (value) {
                0 -> JS_NORMAL
                1 -> JS_STRING
                2 -> JS_NUMBER
                else -> JSType(value)
            }
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
    companion object : pbandk.Message.Companion<OneofOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = OneofOptions.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<EnumOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumOptions.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<EnumValueOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = EnumValueOptions.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<ServiceOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = ServiceOptions.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<MethodOptions> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = MethodOptions.protoUnmarshalImpl(u)
    }

    data class IdempotencyLevel(override val value: Int) : pbandk.Message.Enum {
        companion object : pbandk.Message.Enum.Companion<IdempotencyLevel> {
            val IDEMPOTENCY_UNKNOWN = IdempotencyLevel(0)
            val NO_SIDE_EFFECTS = IdempotencyLevel(1)
            val IDEMPOTENT = IdempotencyLevel(2)

            override fun fromValue(value: Int) = when (value) {
                0 -> IDEMPOTENCY_UNKNOWN
                1 -> NO_SIDE_EFFECTS
                2 -> IDEMPOTENT
                else -> IdempotencyLevel(value)
            }
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
    companion object : pbandk.Message.Companion<UninterpretedOption> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UninterpretedOption.protoUnmarshalImpl(u)
    }

    data class NamePart(
        val namePart: String = "",
        val isExtension: Boolean = false,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<NamePart> {
        override operator fun plus(other: NamePart?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        companion object : pbandk.Message.Companion<NamePart> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = NamePart.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<SourceCodeInfo> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = SourceCodeInfo.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<Location> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = Location.protoUnmarshalImpl(u)
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
    companion object : pbandk.Message.Companion<GeneratedCodeInfo> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = GeneratedCodeInfo.protoUnmarshalImpl(u)
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
        companion object : pbandk.Message.Companion<Annotation> {
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = Annotation.protoUnmarshalImpl(u)
        }
    }
}

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
        10 -> file = protoUnmarshal.readRepeatedMessage(file, pbandk.wkt.FileDescriptorProto.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        26 -> dependency = protoUnmarshal.readRepeated(dependency, protoUnmarshal::readString)
        34 -> messageType = protoUnmarshal.readRepeatedMessage(messageType, pbandk.wkt.DescriptorProto.Companion)
        42 -> enumType = protoUnmarshal.readRepeatedMessage(enumType, pbandk.wkt.EnumDescriptorProto.Companion)
        50 -> service = protoUnmarshal.readRepeatedMessage(service, pbandk.wkt.ServiceDescriptorProto.Companion)
        58 -> extension = protoUnmarshal.readRepeatedMessage(extension, pbandk.wkt.FieldDescriptorProto.Companion)
        66 -> options = protoUnmarshal.readMessage(pbandk.wkt.FileOptions.Companion)
        74 -> sourceCodeInfo = protoUnmarshal.readMessage(pbandk.wkt.SourceCodeInfo.Companion)
        80, 82 -> publicDependency = protoUnmarshal.readRepeated(publicDependency, protoUnmarshal::readInt32)
        88, 90 -> weakDependency = protoUnmarshal.readRepeated(weakDependency, protoUnmarshal::readInt32)
        98 -> syntax = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

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
        18 -> field = protoUnmarshal.readRepeatedMessage(field, pbandk.wkt.FieldDescriptorProto.Companion)
        26 -> nestedType = protoUnmarshal.readRepeatedMessage(nestedType, pbandk.wkt.DescriptorProto.Companion)
        34 -> enumType = protoUnmarshal.readRepeatedMessage(enumType, pbandk.wkt.EnumDescriptorProto.Companion)
        42 -> extensionRange = protoUnmarshal.readRepeatedMessage(extensionRange, pbandk.wkt.DescriptorProto.ExtensionRange.Companion)
        50 -> extension = protoUnmarshal.readRepeatedMessage(extension, pbandk.wkt.FieldDescriptorProto.Companion)
        58 -> options = protoUnmarshal.readMessage(pbandk.wkt.MessageOptions.Companion)
        66 -> oneofDecl = protoUnmarshal.readRepeatedMessage(oneofDecl, pbandk.wkt.OneofDescriptorProto.Companion)
        74 -> reservedRange = protoUnmarshal.readRepeatedMessage(reservedRange, pbandk.wkt.DescriptorProto.ReservedRange.Companion)
        82 -> reservedName = protoUnmarshal.readRepeated(reservedName, protoUnmarshal::readString)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        18 -> value = protoUnmarshal.readRepeatedMessage(value, pbandk.wkt.EnumValueDescriptorProto.Companion)
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.EnumOptions.Companion)
        34 -> reservedRange = protoUnmarshal.readRepeatedMessage(reservedRange, pbandk.wkt.EnumDescriptorProto.EnumReservedRange.Companion)
        42 -> reservedName = protoUnmarshal.readRepeated(reservedName, protoUnmarshal::readString)
        else -> protoUnmarshal.unknownField()
    }
}

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
        18 -> method = protoUnmarshal.readRepeatedMessage(method, pbandk.wkt.MethodDescriptorProto.Companion)
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.ServiceOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileOptions(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash,
            javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices,
            javaGenericServices, pyGenericServices, phpGenericServices, deprecated,
            ccEnableArenas, objcClassPrefix, csharpNamespace, swiftPrefix,
            phpClassPrefix, phpNamespace, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), protoUnmarshal.unknownFields())
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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        7994 -> uninterpretedOption = protoUnmarshal.readRepeatedMessage(uninterpretedOption, pbandk.wkt.UninterpretedOption.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        18 -> name = protoUnmarshal.readRepeatedMessage(name, pbandk.wkt.UninterpretedOption.NamePart.Companion)
        26 -> identifierValue = protoUnmarshal.readString()
        32 -> positiveIntValue = protoUnmarshal.readUInt64()
        40 -> negativeIntValue = protoUnmarshal.readInt64()
        49 -> doubleValue = protoUnmarshal.readDouble()
        58 -> stringValue = protoUnmarshal.readBytes()
        66 -> aggregateValue = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

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
        10 -> location = protoUnmarshal.readRepeatedMessage(location, pbandk.wkt.SourceCodeInfo.Location.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        10, 8 -> path = protoUnmarshal.readRepeated(path, protoUnmarshal::readInt32)
        18, 16 -> span = protoUnmarshal.readRepeated(span, protoUnmarshal::readInt32)
        26 -> leadingComments = protoUnmarshal.readString()
        34 -> trailingComments = protoUnmarshal.readString()
        50 -> leadingDetachedComments = protoUnmarshal.readRepeated(leadingDetachedComments, protoUnmarshal::readString)
        else -> protoUnmarshal.unknownField()
    }
}

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
        10 -> annotation = protoUnmarshal.readRepeatedMessage(annotation, pbandk.wkt.GeneratedCodeInfo.Annotation.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

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
        10, 8 -> path = protoUnmarshal.readRepeated(path, protoUnmarshal::readInt32)
        18 -> sourceFile = protoUnmarshal.readString()
        24 -> begin = protoUnmarshal.readInt32()
        32 -> end = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

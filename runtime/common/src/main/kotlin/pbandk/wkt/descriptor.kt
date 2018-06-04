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
    val name: String = "",
    val `package`: String = "",
    val dependency: List<String> = emptyList(),
    val publicDependency: List<Int> = emptyList(),
    val weakDependency: List<Int> = emptyList(),
    val messageType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val options: pbandk.wkt.FileOptions? = null,
    val sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null,
    val syntax: String = "",
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
    val name: String = "",
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
        val start: Int = 0,
        val end: Int = 0,
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
        val start: Int = 0,
        val end: Int = 0,
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
    val name: String = "",
    val number: Int = 0,
    val label: pbandk.wkt.FieldDescriptorProto.Label = pbandk.wkt.FieldDescriptorProto.Label.fromValue(0),
    val type: pbandk.wkt.FieldDescriptorProto.Type = pbandk.wkt.FieldDescriptorProto.Type.fromValue(0),
    val typeName: String = "",
    val extendee: String = "",
    val defaultValue: String = "",
    val oneofIndex: Int = 0,
    val jsonName: String = "",
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
    val name: String = "",
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
    val name: String = "",
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
        val start: Int = 0,
        val end: Int = 0,
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
    val name: String = "",
    val number: Int = 0,
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
    val name: String = "",
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
    val name: String = "",
    val inputType: String = "",
    val outputType: String = "",
    val options: pbandk.wkt.MethodOptions? = null,
    val clientStreaming: Boolean = false,
    val serverStreaming: Boolean = false,
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
    val javaPackage: String = "",
    val javaOuterClassname: String = "",
    val javaMultipleFiles: Boolean = false,
    val javaGenerateEqualsAndHash: Boolean = false,
    val javaStringCheckUtf8: Boolean = false,
    val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode = pbandk.wkt.FileOptions.OptimizeMode.fromValue(0),
    val goPackage: String = "",
    val ccGenericServices: Boolean = false,
    val javaGenericServices: Boolean = false,
    val pyGenericServices: Boolean = false,
    val phpGenericServices: Boolean = false,
    val deprecated: Boolean = false,
    val ccEnableArenas: Boolean = false,
    val objcClassPrefix: String = "",
    val csharpNamespace: String = "",
    val swiftPrefix: String = "",
    val phpClassPrefix: String = "",
    val phpNamespace: String = "",
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
    val messageSetWireFormat: Boolean = false,
    val noStandardDescriptorAccessor: Boolean = false,
    val deprecated: Boolean = false,
    val mapEntry: Boolean = false,
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
    val ctype: pbandk.wkt.FieldOptions.CType = pbandk.wkt.FieldOptions.CType.fromValue(0),
    val packed: Boolean = false,
    val jstype: pbandk.wkt.FieldOptions.JSType = pbandk.wkt.FieldOptions.JSType.fromValue(0),
    val lazy: Boolean = false,
    val deprecated: Boolean = false,
    val weak: Boolean = false,
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
    val allowAlias: Boolean = false,
    val deprecated: Boolean = false,
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
    val deprecated: Boolean = false,
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
    val deprecated: Boolean = false,
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
    val deprecated: Boolean = false,
    val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel = pbandk.wkt.MethodOptions.IdempotencyLevel.fromValue(0),
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
    val identifierValue: String = "",
    val positiveIntValue: Long = 0L,
    val negativeIntValue: Long = 0L,
    val doubleValue: Double = 0.0,
    val stringValue: pbandk.ByteArr = pbandk.ByteArr.empty,
    val aggregateValue: String = "",
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
        val leadingComments: String = "",
        val trailingComments: String = "",
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
        val sourceFile: String = "",
        val begin: Int = 0,
        val end: Int = 0,
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
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun FileDescriptorSet.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FileDescriptorSet {
    var file: List<pbandk.wkt.FileDescriptorProto> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileDescriptorSet(file, protoUnmarshal.unknownFields())
        10 -> file += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.FileDescriptorProto.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun FileDescriptorProto.protoMergeImpl(plus: FileDescriptorProto?): FileDescriptorProto = plus?.copy(
    dependency = dependency + plus.dependency,
    publicDependency = publicDependency + plus.publicDependency,
    weakDependency = weakDependency + plus.weakDependency,
    messageType = messageType + plus.messageType,
    enumType = enumType + plus.enumType,
    service = service + plus.service,
    extension = extension + plus.extension,
    options = options?.plus(plus.options) ?: plus.options,
    sourceCodeInfo = sourceCodeInfo?.plus(plus.sourceCodeInfo) ?: plus.sourceCodeInfo,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FileDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (`package`.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(`package`)
    if (dependency.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * dependency.size) + dependency.sumBy(pbandk.Sizer::stringSize)
    if (publicDependency.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(10) * publicDependency.size) + publicDependency.sumBy(pbandk.Sizer::int32Size)
    if (weakDependency.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(11) * weakDependency.size) + weakDependency.sumBy(pbandk.Sizer::int32Size)
    if (messageType.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(4) * messageType.size) + messageType.sumBy(pbandk.Sizer::messageSize)
    if (enumType.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(5) * enumType.size) + enumType.sumBy(pbandk.Sizer::messageSize)
    if (service.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * service.size) + service.sumBy(pbandk.Sizer::messageSize)
    if (extension.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(7) * extension.size) + extension.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.messageSize(options)
    if (sourceCodeInfo != null) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.messageSize(sourceCodeInfo)
    if (syntax.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(12) + pbandk.Sizer.stringSize(syntax)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FileDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (`package`.isNotEmpty()) protoMarshal.writeTag(18).writeString(`package`)
    if (dependency.isNotEmpty()) dependency.forEach { protoMarshal.writeTag(26).writeString(it) }
    if (messageType.isNotEmpty()) messageType.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (enumType.isNotEmpty()) enumType.forEach { protoMarshal.writeTag(42).writeMessage(it) }
    if (service.isNotEmpty()) service.forEach { protoMarshal.writeTag(50).writeMessage(it) }
    if (extension.isNotEmpty()) extension.forEach { protoMarshal.writeTag(58).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(66).writeMessage(options)
    if (sourceCodeInfo != null) protoMarshal.writeTag(74).writeMessage(sourceCodeInfo)
    if (publicDependency.isNotEmpty()) publicDependency.forEach { protoMarshal.writeTag(80).writeInt32(it) }
    if (weakDependency.isNotEmpty()) weakDependency.forEach { protoMarshal.writeTag(88).writeInt32(it) }
    if (syntax.isNotEmpty()) protoMarshal.writeTag(98).writeString(syntax)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun FileDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FileDescriptorProto {
    var name = ""
    var `package` = ""
    var dependency: List<String> = emptyList()
    var publicDependency: List<Int> = emptyList()
    var weakDependency: List<Int> = emptyList()
    var messageType: List<pbandk.wkt.DescriptorProto> = emptyList()
    var enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList()
    var service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList()
    var extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList()
    var options: pbandk.wkt.FileOptions? = null
    var sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null
    var syntax = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileDescriptorProto(name, `package`, dependency, publicDependency, weakDependency, messageType, enumType, service, extension, options, sourceCodeInfo, syntax, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> `package` = protoUnmarshal.readString()
        26 -> dependency += protoUnmarshal.readRepeated(protoUnmarshal::readString)
        34 -> messageType += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.DescriptorProto.Companion) }
        42 -> enumType += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.EnumDescriptorProto.Companion) }
        50 -> service += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.ServiceDescriptorProto.Companion) }
        58 -> extension += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.FieldDescriptorProto.Companion) }
        66 -> options = protoUnmarshal.readMessage(pbandk.wkt.FileOptions.Companion)
        74 -> sourceCodeInfo = protoUnmarshal.readMessage(pbandk.wkt.SourceCodeInfo.Companion)
        80 -> publicDependency += protoUnmarshal.readRepeated(protoUnmarshal::readInt32)
        88 -> weakDependency += protoUnmarshal.readRepeated(protoUnmarshal::readInt32)
        98 -> syntax = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun DescriptorProto.protoMergeImpl(plus: DescriptorProto?): DescriptorProto = plus?.copy(
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
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
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
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (field.isNotEmpty()) field.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (nestedType.isNotEmpty()) nestedType.forEach { protoMarshal.writeTag(26).writeMessage(it) }
    if (enumType.isNotEmpty()) enumType.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (extensionRange.isNotEmpty()) extensionRange.forEach { protoMarshal.writeTag(42).writeMessage(it) }
    if (extension.isNotEmpty()) extension.forEach { protoMarshal.writeTag(50).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(58).writeMessage(options)
    if (oneofDecl.isNotEmpty()) oneofDecl.forEach { protoMarshal.writeTag(66).writeMessage(it) }
    if (reservedRange.isNotEmpty()) reservedRange.forEach { protoMarshal.writeTag(74).writeMessage(it) }
    if (reservedName.isNotEmpty()) reservedName.forEach { protoMarshal.writeTag(82).writeString(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun DescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DescriptorProto {
    var name = ""
    var field: List<pbandk.wkt.FieldDescriptorProto> = emptyList()
    var extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList()
    var nestedType: List<pbandk.wkt.DescriptorProto> = emptyList()
    var enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList()
    var extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList()
    var oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = emptyList()
    var options: pbandk.wkt.MessageOptions? = null
    var reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = emptyList()
    var reservedName: List<String> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return DescriptorProto(name, field, extension, nestedType, enumType, extensionRange, oneofDecl, options, reservedRange, reservedName, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> field += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.FieldDescriptorProto.Companion) }
        26 -> nestedType += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.DescriptorProto.Companion) }
        34 -> enumType += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.EnumDescriptorProto.Companion) }
        42 -> extensionRange += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.DescriptorProto.ExtensionRange.Companion) }
        50 -> extension += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.FieldDescriptorProto.Companion) }
        58 -> options = protoUnmarshal.readMessage(pbandk.wkt.MessageOptions.Companion)
        66 -> oneofDecl += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.OneofDescriptorProto.Companion) }
        74 -> reservedRange += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.DescriptorProto.ReservedRange.Companion) }
        82 -> reservedName += protoUnmarshal.readRepeated(protoUnmarshal::readString)
        else -> protoUnmarshal.unknownField()
    }
}

private fun DescriptorProto.ExtensionRange.protoMergeImpl(plus: DescriptorProto.ExtensionRange?): DescriptorProto.ExtensionRange = plus?.copy(
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DescriptorProto.ExtensionRange.protoSizeImpl(): Int {
    var protoSize = 0
    if (start != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(start)
    if (end != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(end)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DescriptorProto.ExtensionRange.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (start != 0) protoMarshal.writeTag(8).writeInt32(start)
    if (end != 0) protoMarshal.writeTag(16).writeInt32(end)
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun DescriptorProto.ExtensionRange.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DescriptorProto.ExtensionRange {
    var start = 0
    var end = 0
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
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DescriptorProto.ReservedRange.protoSizeImpl(): Int {
    var protoSize = 0
    if (start != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(start)
    if (end != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(end)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DescriptorProto.ReservedRange.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (start != 0) protoMarshal.writeTag(8).writeInt32(start)
    if (end != 0) protoMarshal.writeTag(16).writeInt32(end)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun DescriptorProto.ReservedRange.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DescriptorProto.ReservedRange {
    var start = 0
    var end = 0
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
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun ExtensionRangeOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ExtensionRangeOptions {
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ExtensionRangeOptions(uninterpretedOption, protoUnmarshal.unknownFields())
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun FieldDescriptorProto.protoMergeImpl(plus: FieldDescriptorProto?): FieldDescriptorProto = plus?.copy(
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FieldDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (number != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.int32Size(number)
    if (label.value != 0) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.enumSize(label)
    if (type.value != 0) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.enumSize(type)
    if (typeName.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.stringSize(typeName)
    if (extendee.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(extendee)
    if (defaultValue.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.stringSize(defaultValue)
    if (oneofIndex != 0) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.int32Size(oneofIndex)
    if (jsonName.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.stringSize(jsonName)
    if (options != null) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FieldDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (extendee.isNotEmpty()) protoMarshal.writeTag(18).writeString(extendee)
    if (number != 0) protoMarshal.writeTag(24).writeInt32(number)
    if (label.value != 0) protoMarshal.writeTag(32).writeEnum(label)
    if (type.value != 0) protoMarshal.writeTag(40).writeEnum(type)
    if (typeName.isNotEmpty()) protoMarshal.writeTag(50).writeString(typeName)
    if (defaultValue.isNotEmpty()) protoMarshal.writeTag(58).writeString(defaultValue)
    if (options != null) protoMarshal.writeTag(66).writeMessage(options)
    if (oneofIndex != 0) protoMarshal.writeTag(72).writeInt32(oneofIndex)
    if (jsonName.isNotEmpty()) protoMarshal.writeTag(82).writeString(jsonName)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun FieldDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FieldDescriptorProto {
    var name = ""
    var number = 0
    var label: pbandk.wkt.FieldDescriptorProto.Label = pbandk.wkt.FieldDescriptorProto.Label.fromValue(0)
    var type: pbandk.wkt.FieldDescriptorProto.Type = pbandk.wkt.FieldDescriptorProto.Type.fromValue(0)
    var typeName = ""
    var extendee = ""
    var defaultValue = ""
    var oneofIndex = 0
    var jsonName = ""
    var options: pbandk.wkt.FieldOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FieldDescriptorProto(name, number, label, type, typeName, extendee, defaultValue, oneofIndex, jsonName, options, protoUnmarshal.unknownFields())
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
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun OneofDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (options != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun OneofDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (options != null) protoMarshal.writeTag(18).writeMessage(options)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun OneofDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): OneofDescriptorProto {
    var name = ""
    var options: pbandk.wkt.OneofOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return OneofDescriptorProto(name, options, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> options = protoUnmarshal.readMessage(pbandk.wkt.OneofOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumDescriptorProto.protoMergeImpl(plus: EnumDescriptorProto?): EnumDescriptorProto = plus?.copy(
    value = value + plus.value,
    options = options?.plus(plus.options) ?: plus.options,
    reservedRange = reservedRange + plus.reservedRange,
    reservedName = reservedName + plus.reservedName,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (value.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * value.size) + value.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    if (reservedRange.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(4) * reservedRange.size) + reservedRange.sumBy(pbandk.Sizer::messageSize)
    if (reservedName.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(5) * reservedName.size) + reservedName.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (value.isNotEmpty()) value.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (reservedRange.isNotEmpty()) reservedRange.forEach { protoMarshal.writeTag(34).writeMessage(it) }
    if (reservedName.isNotEmpty()) reservedName.forEach { protoMarshal.writeTag(42).writeString(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumDescriptorProto {
    var name = ""
    var value: List<pbandk.wkt.EnumValueDescriptorProto> = emptyList()
    var options: pbandk.wkt.EnumOptions? = null
    var reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = emptyList()
    var reservedName: List<String> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumDescriptorProto(name, value, options, reservedRange, reservedName, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> value += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.EnumValueDescriptorProto.Companion) }
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.EnumOptions.Companion)
        34 -> reservedRange += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.EnumDescriptorProto.EnumReservedRange.Companion) }
        42 -> reservedName += protoUnmarshal.readRepeated(protoUnmarshal::readString)
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumDescriptorProto.EnumReservedRange.protoMergeImpl(plus: EnumDescriptorProto.EnumReservedRange?): EnumDescriptorProto.EnumReservedRange = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumDescriptorProto.EnumReservedRange.protoSizeImpl(): Int {
    var protoSize = 0
    if (start != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(start)
    if (end != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(end)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumDescriptorProto.EnumReservedRange.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (start != 0) protoMarshal.writeTag(8).writeInt32(start)
    if (end != 0) protoMarshal.writeTag(16).writeInt32(end)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumDescriptorProto.EnumReservedRange.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumDescriptorProto.EnumReservedRange {
    var start = 0
    var end = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumDescriptorProto.EnumReservedRange(start, end, protoUnmarshal.unknownFields())
        8 -> start = protoUnmarshal.readInt32()
        16 -> end = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumValueDescriptorProto.protoMergeImpl(plus: EnumValueDescriptorProto?): EnumValueDescriptorProto = plus?.copy(
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumValueDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (number != 0) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(number)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumValueDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (number != 0) protoMarshal.writeTag(16).writeInt32(number)
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumValueDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumValueDescriptorProto {
    var name = ""
    var number = 0
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
    method = method + plus.method,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ServiceDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (method.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * method.size) + method.sumBy(pbandk.Sizer::messageSize)
    if (options != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(options)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ServiceDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (method.isNotEmpty()) method.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (options != null) protoMarshal.writeTag(26).writeMessage(options)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun ServiceDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ServiceDescriptorProto {
    var name = ""
    var method: List<pbandk.wkt.MethodDescriptorProto> = emptyList()
    var options: pbandk.wkt.ServiceOptions? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ServiceDescriptorProto(name, method, options, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> method += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.MethodDescriptorProto.Companion) }
        26 -> options = protoUnmarshal.readMessage(pbandk.wkt.ServiceOptions.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun MethodDescriptorProto.protoMergeImpl(plus: MethodDescriptorProto?): MethodDescriptorProto = plus?.copy(
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MethodDescriptorProto.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (inputType.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(inputType)
    if (outputType.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(outputType)
    if (options != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.messageSize(options)
    if (clientStreaming) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.boolSize(clientStreaming)
    if (serverStreaming) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.boolSize(serverStreaming)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MethodDescriptorProto.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (inputType.isNotEmpty()) protoMarshal.writeTag(18).writeString(inputType)
    if (outputType.isNotEmpty()) protoMarshal.writeTag(26).writeString(outputType)
    if (options != null) protoMarshal.writeTag(34).writeMessage(options)
    if (clientStreaming) protoMarshal.writeTag(40).writeBool(clientStreaming)
    if (serverStreaming) protoMarshal.writeTag(48).writeBool(serverStreaming)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun MethodDescriptorProto.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MethodDescriptorProto {
    var name = ""
    var inputType = ""
    var outputType = ""
    var options: pbandk.wkt.MethodOptions? = null
    var clientStreaming = false
    var serverStreaming = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MethodDescriptorProto(name, inputType, outputType, options, clientStreaming, serverStreaming, protoUnmarshal.unknownFields())
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
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FileOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (javaPackage.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(javaPackage)
    if (javaOuterClassname.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.stringSize(javaOuterClassname)
    if (javaMultipleFiles) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.boolSize(javaMultipleFiles)
    if (javaGenerateEqualsAndHash) protoSize += pbandk.Sizer.tagSize(20) + pbandk.Sizer.boolSize(javaGenerateEqualsAndHash)
    if (javaStringCheckUtf8) protoSize += pbandk.Sizer.tagSize(27) + pbandk.Sizer.boolSize(javaStringCheckUtf8)
    if (optimizeFor.value != 0) protoSize += pbandk.Sizer.tagSize(9) + pbandk.Sizer.enumSize(optimizeFor)
    if (goPackage.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(11) + pbandk.Sizer.stringSize(goPackage)
    if (ccGenericServices) protoSize += pbandk.Sizer.tagSize(16) + pbandk.Sizer.boolSize(ccGenericServices)
    if (javaGenericServices) protoSize += pbandk.Sizer.tagSize(17) + pbandk.Sizer.boolSize(javaGenericServices)
    if (pyGenericServices) protoSize += pbandk.Sizer.tagSize(18) + pbandk.Sizer.boolSize(pyGenericServices)
    if (phpGenericServices) protoSize += pbandk.Sizer.tagSize(42) + pbandk.Sizer.boolSize(phpGenericServices)
    if (deprecated) protoSize += pbandk.Sizer.tagSize(23) + pbandk.Sizer.boolSize(deprecated)
    if (ccEnableArenas) protoSize += pbandk.Sizer.tagSize(31) + pbandk.Sizer.boolSize(ccEnableArenas)
    if (objcClassPrefix.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(36) + pbandk.Sizer.stringSize(objcClassPrefix)
    if (csharpNamespace.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(37) + pbandk.Sizer.stringSize(csharpNamespace)
    if (swiftPrefix.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(39) + pbandk.Sizer.stringSize(swiftPrefix)
    if (phpClassPrefix.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(40) + pbandk.Sizer.stringSize(phpClassPrefix)
    if (phpNamespace.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(41) + pbandk.Sizer.stringSize(phpNamespace)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FileOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (javaPackage.isNotEmpty()) protoMarshal.writeTag(10).writeString(javaPackage)
    if (javaOuterClassname.isNotEmpty()) protoMarshal.writeTag(66).writeString(javaOuterClassname)
    if (optimizeFor.value != 0) protoMarshal.writeTag(72).writeEnum(optimizeFor)
    if (javaMultipleFiles) protoMarshal.writeTag(80).writeBool(javaMultipleFiles)
    if (goPackage.isNotEmpty()) protoMarshal.writeTag(90).writeString(goPackage)
    if (ccGenericServices) protoMarshal.writeTag(128).writeBool(ccGenericServices)
    if (javaGenericServices) protoMarshal.writeTag(136).writeBool(javaGenericServices)
    if (pyGenericServices) protoMarshal.writeTag(144).writeBool(pyGenericServices)
    if (javaGenerateEqualsAndHash) protoMarshal.writeTag(160).writeBool(javaGenerateEqualsAndHash)
    if (deprecated) protoMarshal.writeTag(184).writeBool(deprecated)
    if (javaStringCheckUtf8) protoMarshal.writeTag(216).writeBool(javaStringCheckUtf8)
    if (ccEnableArenas) protoMarshal.writeTag(248).writeBool(ccEnableArenas)
    if (objcClassPrefix.isNotEmpty()) protoMarshal.writeTag(290).writeString(objcClassPrefix)
    if (csharpNamespace.isNotEmpty()) protoMarshal.writeTag(298).writeString(csharpNamespace)
    if (swiftPrefix.isNotEmpty()) protoMarshal.writeTag(314).writeString(swiftPrefix)
    if (phpClassPrefix.isNotEmpty()) protoMarshal.writeTag(322).writeString(phpClassPrefix)
    if (phpNamespace.isNotEmpty()) protoMarshal.writeTag(330).writeString(phpNamespace)
    if (phpGenericServices) protoMarshal.writeTag(336).writeBool(phpGenericServices)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun FileOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FileOptions {
    var javaPackage = ""
    var javaOuterClassname = ""
    var javaMultipleFiles = false
    var javaGenerateEqualsAndHash = false
    var javaStringCheckUtf8 = false
    var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode = pbandk.wkt.FileOptions.OptimizeMode.fromValue(0)
    var goPackage = ""
    var ccGenericServices = false
    var javaGenericServices = false
    var pyGenericServices = false
    var phpGenericServices = false
    var deprecated = false
    var ccEnableArenas = false
    var objcClassPrefix = ""
    var csharpNamespace = ""
    var swiftPrefix = ""
    var phpClassPrefix = ""
    var phpNamespace = ""
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FileOptions(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash, javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices, javaGenericServices, pyGenericServices, phpGenericServices, deprecated, ccEnableArenas, objcClassPrefix, csharpNamespace, swiftPrefix, phpClassPrefix, phpNamespace, uninterpretedOption, protoUnmarshal.unknownFields())
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
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun MessageOptions.protoMergeImpl(plus: MessageOptions?): MessageOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MessageOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (messageSetWireFormat) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(messageSetWireFormat)
    if (noStandardDescriptorAccessor) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(noStandardDescriptorAccessor)
    if (deprecated) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(deprecated)
    if (mapEntry) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.boolSize(mapEntry)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MessageOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (messageSetWireFormat) protoMarshal.writeTag(8).writeBool(messageSetWireFormat)
    if (noStandardDescriptorAccessor) protoMarshal.writeTag(16).writeBool(noStandardDescriptorAccessor)
    if (deprecated) protoMarshal.writeTag(24).writeBool(deprecated)
    if (mapEntry) protoMarshal.writeTag(56).writeBool(mapEntry)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun MessageOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MessageOptions {
    var messageSetWireFormat = false
    var noStandardDescriptorAccessor = false
    var deprecated = false
    var mapEntry = false
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MessageOptions(messageSetWireFormat, noStandardDescriptorAccessor, deprecated, mapEntry, uninterpretedOption, protoUnmarshal.unknownFields())
        8 -> messageSetWireFormat = protoUnmarshal.readBool()
        16 -> noStandardDescriptorAccessor = protoUnmarshal.readBool()
        24 -> deprecated = protoUnmarshal.readBool()
        56 -> mapEntry = protoUnmarshal.readBool()
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun FieldOptions.protoMergeImpl(plus: FieldOptions?): FieldOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FieldOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (ctype.value != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.enumSize(ctype)
    if (packed) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(packed)
    if (jstype.value != 0) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.enumSize(jstype)
    if (lazy) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.boolSize(lazy)
    if (deprecated) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(deprecated)
    if (weak) protoSize += pbandk.Sizer.tagSize(10) + pbandk.Sizer.boolSize(weak)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FieldOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (ctype.value != 0) protoMarshal.writeTag(8).writeEnum(ctype)
    if (packed) protoMarshal.writeTag(16).writeBool(packed)
    if (deprecated) protoMarshal.writeTag(24).writeBool(deprecated)
    if (lazy) protoMarshal.writeTag(40).writeBool(lazy)
    if (jstype.value != 0) protoMarshal.writeTag(48).writeEnum(jstype)
    if (weak) protoMarshal.writeTag(80).writeBool(weak)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun FieldOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FieldOptions {
    var ctype: pbandk.wkt.FieldOptions.CType = pbandk.wkt.FieldOptions.CType.fromValue(0)
    var packed = false
    var jstype: pbandk.wkt.FieldOptions.JSType = pbandk.wkt.FieldOptions.JSType.fromValue(0)
    var lazy = false
    var deprecated = false
    var weak = false
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FieldOptions(ctype, packed, jstype, lazy, deprecated, weak, uninterpretedOption, protoUnmarshal.unknownFields())
        8 -> ctype = protoUnmarshal.readEnum(pbandk.wkt.FieldOptions.CType.Companion)
        16 -> packed = protoUnmarshal.readBool()
        24 -> deprecated = protoUnmarshal.readBool()
        40 -> lazy = protoUnmarshal.readBool()
        48 -> jstype = protoUnmarshal.readEnum(pbandk.wkt.FieldOptions.JSType.Companion)
        80 -> weak = protoUnmarshal.readBool()
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
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
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun OneofOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): OneofOptions {
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return OneofOptions(uninterpretedOption, protoUnmarshal.unknownFields())
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumOptions.protoMergeImpl(plus: EnumOptions?): EnumOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (allowAlias) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.boolSize(allowAlias)
    if (deprecated) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(deprecated)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (allowAlias) protoMarshal.writeTag(16).writeBool(allowAlias)
    if (deprecated) protoMarshal.writeTag(24).writeBool(deprecated)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumOptions {
    var allowAlias = false
    var deprecated = false
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumOptions(allowAlias, deprecated, uninterpretedOption, protoUnmarshal.unknownFields())
        16 -> allowAlias = protoUnmarshal.readBool()
        24 -> deprecated = protoUnmarshal.readBool()
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun EnumValueOptions.protoMergeImpl(plus: EnumValueOptions?): EnumValueOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun EnumValueOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (deprecated) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(deprecated)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun EnumValueOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (deprecated) protoMarshal.writeTag(8).writeBool(deprecated)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun EnumValueOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): EnumValueOptions {
    var deprecated = false
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return EnumValueOptions(deprecated, uninterpretedOption, protoUnmarshal.unknownFields())
        8 -> deprecated = protoUnmarshal.readBool()
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun ServiceOptions.protoMergeImpl(plus: ServiceOptions?): ServiceOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun ServiceOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (deprecated) protoSize += pbandk.Sizer.tagSize(33) + pbandk.Sizer.boolSize(deprecated)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun ServiceOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (deprecated) protoMarshal.writeTag(264).writeBool(deprecated)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun ServiceOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): ServiceOptions {
    var deprecated = false
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return ServiceOptions(deprecated, uninterpretedOption, protoUnmarshal.unknownFields())
        264 -> deprecated = protoUnmarshal.readBool()
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun MethodOptions.protoMergeImpl(plus: MethodOptions?): MethodOptions = plus?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun MethodOptions.protoSizeImpl(): Int {
    var protoSize = 0
    if (deprecated) protoSize += pbandk.Sizer.tagSize(33) + pbandk.Sizer.boolSize(deprecated)
    if (idempotencyLevel.value != 0) protoSize += pbandk.Sizer.tagSize(34) + pbandk.Sizer.enumSize(idempotencyLevel)
    if (uninterpretedOption.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(999) * uninterpretedOption.size) + uninterpretedOption.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun MethodOptions.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (deprecated) protoMarshal.writeTag(264).writeBool(deprecated)
    if (idempotencyLevel.value != 0) protoMarshal.writeTag(272).writeEnum(idempotencyLevel)
    if (uninterpretedOption.isNotEmpty()) uninterpretedOption.forEach { protoMarshal.writeTag(7994).writeMessage(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun MethodOptions.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): MethodOptions {
    var deprecated = false
    var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel = pbandk.wkt.MethodOptions.IdempotencyLevel.fromValue(0)
    var uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return MethodOptions(deprecated, idempotencyLevel, uninterpretedOption, protoUnmarshal.unknownFields())
        264 -> deprecated = protoUnmarshal.readBool()
        272 -> idempotencyLevel = protoUnmarshal.readEnum(pbandk.wkt.MethodOptions.IdempotencyLevel.Companion)
        7994 -> uninterpretedOption += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun UninterpretedOption.protoMergeImpl(plus: UninterpretedOption?): UninterpretedOption = plus?.copy(
    name = name + plus.name,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UninterpretedOption.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * name.size) + name.sumBy(pbandk.Sizer::messageSize)
    if (identifierValue.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(identifierValue)
    if (positiveIntValue != 0L) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.uInt64Size(positiveIntValue)
    if (negativeIntValue != 0L) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.int64Size(negativeIntValue)
    if (doubleValue != 0.0) protoSize += pbandk.Sizer.tagSize(6) + pbandk.Sizer.doubleSize(doubleValue)
    if (stringValue.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.bytesSize(stringValue)
    if (aggregateValue.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(8) + pbandk.Sizer.stringSize(aggregateValue)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UninterpretedOption.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) name.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (identifierValue.isNotEmpty()) protoMarshal.writeTag(26).writeString(identifierValue)
    if (positiveIntValue != 0L) protoMarshal.writeTag(32).writeUInt64(positiveIntValue)
    if (negativeIntValue != 0L) protoMarshal.writeTag(40).writeInt64(negativeIntValue)
    if (doubleValue != 0.0) protoMarshal.writeTag(49).writeDouble(doubleValue)
    if (stringValue.array.isNotEmpty()) protoMarshal.writeTag(58).writeBytes(stringValue)
    if (aggregateValue.isNotEmpty()) protoMarshal.writeTag(66).writeString(aggregateValue)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun UninterpretedOption.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UninterpretedOption {
    var name: List<pbandk.wkt.UninterpretedOption.NamePart> = emptyList()
    var identifierValue = ""
    var positiveIntValue = 0L
    var negativeIntValue = 0L
    var doubleValue = 0.0
    var stringValue: pbandk.ByteArr = pbandk.ByteArr.empty
    var aggregateValue = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UninterpretedOption(name, identifierValue, positiveIntValue, negativeIntValue, doubleValue, stringValue, aggregateValue, protoUnmarshal.unknownFields())
        18 -> name += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.UninterpretedOption.NamePart.Companion) }
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
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
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
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun SourceCodeInfo.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): SourceCodeInfo {
    var location: List<pbandk.wkt.SourceCodeInfo.Location> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return SourceCodeInfo(location, protoUnmarshal.unknownFields())
        10 -> location += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.SourceCodeInfo.Location.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun SourceCodeInfo.Location.protoMergeImpl(plus: SourceCodeInfo.Location?): SourceCodeInfo.Location = plus?.copy(
    path = path + plus.path,
    span = span + plus.span,
    leadingDetachedComments = leadingDetachedComments + plus.leadingDetachedComments,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun SourceCodeInfo.Location.protoSizeImpl(): Int {
    var protoSize = 0
    if (path.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.packedRepeatedSize(path, pbandk.Sizer::int32Size)
    if (span.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.packedRepeatedSize(span, pbandk.Sizer::int32Size)
    if (leadingComments.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.stringSize(leadingComments)
    if (trailingComments.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(trailingComments)
    if (leadingDetachedComments.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * leadingDetachedComments.size) + leadingDetachedComments.sumBy(pbandk.Sizer::stringSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun SourceCodeInfo.Location.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (path.isNotEmpty()) protoMarshal.writeTag(8).writePackedRepeated(path, protoMarshal::writeInt32)
    if (span.isNotEmpty()) protoMarshal.writeTag(16).writePackedRepeated(span, protoMarshal::writeInt32)
    if (leadingComments.isNotEmpty()) protoMarshal.writeTag(26).writeString(leadingComments)
    if (trailingComments.isNotEmpty()) protoMarshal.writeTag(34).writeString(trailingComments)
    if (leadingDetachedComments.isNotEmpty()) leadingDetachedComments.forEach { protoMarshal.writeTag(50).writeString(it) }
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun SourceCodeInfo.Location.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): SourceCodeInfo.Location {
    var path: List<Int> = emptyList()
    var span: List<Int> = emptyList()
    var leadingComments = ""
    var trailingComments = ""
    var leadingDetachedComments: List<String> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return SourceCodeInfo.Location(path, span, leadingComments, trailingComments, leadingDetachedComments, protoUnmarshal.unknownFields())
        8 -> path += protoUnmarshal.readRepeated(protoUnmarshal::readInt32)
        16 -> span += protoUnmarshal.readRepeated(protoUnmarshal::readInt32)
        26 -> leadingComments = protoUnmarshal.readString()
        34 -> trailingComments = protoUnmarshal.readString()
        50 -> leadingDetachedComments += protoUnmarshal.readRepeated(protoUnmarshal::readString)
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
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun GeneratedCodeInfo.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): GeneratedCodeInfo {
    var annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = emptyList()
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return GeneratedCodeInfo(annotation, protoUnmarshal.unknownFields())
        10 -> annotation += protoUnmarshal.readRepeated { protoUnmarshal.readMessage(pbandk.wkt.GeneratedCodeInfo.Annotation.Companion) }
        else -> protoUnmarshal.unknownField()
    }
}

private fun GeneratedCodeInfo.Annotation.protoMergeImpl(plus: GeneratedCodeInfo.Annotation?): GeneratedCodeInfo.Annotation = plus?.copy(
    path = path + plus.path,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun GeneratedCodeInfo.Annotation.protoSizeImpl(): Int {
    var protoSize = 0
    if (path.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.packedRepeatedSize(path, pbandk.Sizer::int32Size)
    if (sourceFile.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(sourceFile)
    if (begin != 0) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.int32Size(begin)
    if (end != 0) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.int32Size(end)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun GeneratedCodeInfo.Annotation.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (path.isNotEmpty()) protoMarshal.writeTag(8).writePackedRepeated(path, protoMarshal::writeInt32)
    if (sourceFile.isNotEmpty()) protoMarshal.writeTag(18).writeString(sourceFile)
    if (begin != 0) protoMarshal.writeTag(24).writeInt32(begin)
    if (end != 0) protoMarshal.writeTag(32).writeInt32(end)
    if (unknownFields.isNotEmpty())
        protoMarshal.writeUnknownFields(unknownFields)
}

private fun GeneratedCodeInfo.Annotation.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): GeneratedCodeInfo.Annotation {
    var path: List<Int> = emptyList()
    var sourceFile = ""
    var begin = 0
    var end = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return GeneratedCodeInfo.Annotation(path, sourceFile, begin, end, protoUnmarshal.unknownFields())
        8 -> path += protoUnmarshal.readRepeated(protoUnmarshal::readInt32)
        18 -> sourceFile = protoUnmarshal.readString()
        24 -> begin = protoUnmarshal.readInt32()
        32 -> end = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

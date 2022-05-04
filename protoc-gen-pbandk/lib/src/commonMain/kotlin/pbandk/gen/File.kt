package pbandk.gen

import pbandk.wkt.FieldOptions

public data class Name internal constructor(
    val packageName: String?,
    val parent: Name?,
    val simple: String,
) {
    public constructor(simple: String) : this(null, null, simple)
    public constructor(packageName: String?, simple: String) : this(packageName, null, simple)
    public constructor(parent: Name?, simple: String) : this(parent?.packageName, parent, simple)

    init {
        if (parent != null) require(parent.packageName == packageName)
    }

    val full: String = if (parent != null) "${parent.full}.${simple}" else simple
    val fullWithPackage: String = if (packageName != null) "$packageName.$full" else full
}

public data class File(
    val name: String,
    // Protobuf package name with leading dot
    val packageName: String,
    val kotlinPackageName: String?,
    val version: Int,
    val types: List<Type>,
    val extensions: List<Field.Numbered>
) {
    // Map is keyed by protobuf names (qualified starting w/ a dot if packageName is non-null) with value of Kotlin FQCN
    internal fun kotlinTypeMappings(types: List<Type> = this.types): Map<String, Name> {
        val nestedTypes = types.filterIsInstance<Type.Message>().flatMap { it.nestedTypes }
        return types.associate { it.name.fullWithPackage to it.kotlinName } +
                if (nestedTypes.isNotEmpty()) kotlinTypeMappings(nestedTypes) else emptyMap()
    }

    public sealed class Type {
        public abstract val name: Name
        public abstract val kotlinName: Name

        public data class Message(
            override val name: Name,
            val fields: List<Field>,
            val nestedTypes: List<Type>,
            val mapEntry: Boolean,
            override val kotlinName: Name,
            val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList(),
            val extensions: List<Field.Numbered> = emptyList(),
        ) : Type()

        public data class Enum(
            override val name: Name,
            val values: List<Value>,
            override val kotlinName: Name,
        ) : Type() {
            public data class Value(val number: Int, val name: String, val kotlinName: String)
        }
    }

    public sealed class Field {
        public abstract val name: Name
        public abstract val kotlinName: Name

        public sealed class Numbered : Field() {
            public abstract val number: Int
            public abstract val type: Type
            public abstract val repeated: Boolean
            public abstract val jsonName: String
            public abstract val options: FieldOptions
            public abstract val extendee: String?

            public data class Standard(
                override val number: Int,
                override val name: Name,
                override val type: Type,
                val localTypeName: String?,
                override val repeated: Boolean,
                override val jsonName: String,
                // Note, this is only applicable for proto2
                // TODO: test explicitly set default value in proto2
                val optional: Boolean,
                val packed: Boolean,
                val map: Boolean,
                override val kotlinName: Name,
                // This can be null when localTypeName is not null which means it is fully qualified and should be looked up
                val kotlinLocalTypeName: String?,
                override val options : FieldOptions = FieldOptions.defaultInstance,
                override val extendee: String? = null
            ) : Numbered()

            public data class Wrapper(
                override val number: Int,
                override val name: Name,
                override val kotlinName: Name,
                override val repeated: Boolean,
                override val jsonName: String,
                val wrappedType: Type,
                override val options : FieldOptions = FieldOptions.defaultInstance,
                override val extendee: String? = null
            ) : Numbered() {
                override val type: Type = Type.MESSAGE
            }
        }

        public data class OneOf(
            override val name: Name,
            val fields: List<Numbered.Standard>,
            val kotlinFieldNames: Map<String, Name>,
            override val kotlinName: Name,
            val kotlinTypeName: Name
        ) : Field()

        public enum class Type {
            BOOL, BYTES, DOUBLE, ENUM, FIXED32, FIXED64, FLOAT, INT32, INT64, MESSAGE,
            SFIXED32, SFIXED64, SINT32, SINT64, STRING, UINT32, UINT64;

            public val neverPacked: Boolean get() = this in listOf(BYTES, MESSAGE, STRING)

            public val wrapperTypeName: Name
                get() = TYPE_TO_WRAPPER_TYPE_NAME[this] ?: error("No wrapper type for ${this.name.lowercase()}")

            public companion object {
                public val TYPE_TO_WRAPPER_TYPE_NAME: Map<Type, Name> = mapOf(
                    BOOL to Name(".google.protobuf", "BoolValue"),
                    BYTES to Name(".google.protobuf", "BytesValue"),
                    DOUBLE to Name(".google.protobuf", "DoubleValue"),
                    FLOAT to Name(".google.protobuf", "FloatValue"),
                    INT32 to Name(".google.protobuf", "Int32Value"),
                    INT64 to Name(".google.protobuf", "Int64Value"),
                    STRING to Name(".google.protobuf", "StringValue"),
                    UINT32 to Name(".google.protobuf", "UInt32Value"),
                    UINT64 to Name(".google.protobuf", "UInt64Value")
                )
                public val WRAPPER_TYPE_NAME_TO_TYPE: Map<Name, Type> =
                    TYPE_TO_WRAPPER_TYPE_NAME.entries.associateBy({ it.value }, { it.key })
            }
        }
    }
}

package pbandk.gen

import pbandk.wkt.FieldOptions

public data class File(
    val name: String,
    val packageName: String?,
    val kotlinPackageName: String?,
    val version: Int,
    val types: List<Type>,
    val extensions: List<Field>
) {
    // Map is keyed by protobuf names (qualified starting w/ a dot if packageName is non-null) with value of Kotlin FQCN
    internal fun kotlinTypeMappings() = mutableMapOf<String, String>().also { ret ->
        fun applyType(t: Type, parentProtobufTypeName: String? = null, parentKotlinTypeName: String? = null) {
            val protobufTypeName = when {
                parentProtobufTypeName != null -> "$parentProtobufTypeName."
                packageName != null -> ".$packageName."
                else -> "."
            } + t.name
            val kotlinTypeName = when {
                parentKotlinTypeName != null -> "$parentKotlinTypeName."
                kotlinPackageName != null -> "$kotlinPackageName."
                else -> ""
            } + t.kotlinTypeName
            ret += protobufTypeName to kotlinTypeName
            (t as? Type.Message)?.nestedTypes?.forEach { applyType(it, protobufTypeName, kotlinTypeName) }
        }

        types.forEach { applyType(it) }
    }

    public sealed class Type {
        public abstract val name: String
        public abstract val fullName: String
        public abstract val kotlinTypeName: String
        public abstract val kotlinFullTypeName: String

        public data class Message(
            override val name: String,
            override val fullName: String,
            val fields: List<Field>,
            val nestedTypes: List<Type>,
            val mapEntry: Boolean,
            override val kotlinTypeName: String,
            override val kotlinFullTypeName: String,
            val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList()
        ) : Type()

        public data class Enum(
            override val name: String,
            override val fullName: String,
            val values: List<Value>,
            override val kotlinTypeName: String,
            override val kotlinFullTypeName: String
        ) : Type() {
            public data class Value(val number: Int, val name: String, val kotlinValueTypeName: String)
        }
    }

    public sealed class Field {
        public abstract val name: String
        public abstract val kotlinFieldName: String

        public sealed class Numbered : Field() {
            public abstract val number: Int
            public abstract val type: Type
            public abstract val repeated: Boolean
            public abstract val jsonName: String?
            public abstract val options: FieldOptions
            public abstract val extendee: String?

            public data class Standard(
                override val number: Int,
                override val name: String,
                override val type: Type,
                val localTypeName: String?,
                override val repeated: Boolean,
                override val jsonName: String?,
                // TODO: test explicitly set default value in proto2
                val hasPresence: Boolean,
                val required: Boolean,
                val packed: Boolean,
                val map: Boolean,
                override val kotlinFieldName: String,
                // This can be null when localTypeName is not null which means it is fully qualified and should be looked up
                val kotlinLocalTypeName: String?,
                override val options : FieldOptions = FieldOptions.defaultInstance,
                override val extendee: String? = null
            ) : Numbered()

            public data class Wrapper(
                override val number: Int,
                override val name: String,
                override val kotlinFieldName: String,
                override val repeated: Boolean,
                override val jsonName: String?,
                val wrappedType: Type,
                override val options : FieldOptions = FieldOptions.defaultInstance,
                override val extendee: String? = null
            ) : Numbered() {
                override val type: Type = Type.MESSAGE
            }
        }

        public data class OneOf(
            override val name: String,
            val fields: List<Numbered.Standard>,
            val kotlinFieldTypeNames: Map<String, String>,
            override val kotlinFieldName: String,
            val kotlinTypeName: String
        ) : Field()

        public enum class Type {
            BOOL, BYTES, DOUBLE, ENUM, FIXED32, FIXED64, FLOAT, GROUP, INT32, INT64, MESSAGE,
            SFIXED32, SFIXED64, SINT32, SINT64, STRING, UINT32, UINT64;

            public val neverPacked: Boolean get() = this in listOf(BYTES, GROUP, MESSAGE, STRING)

            public val wrapperTypeName: String
                get() = TYPE_TO_WRAPPER_TYPE_NAME[this] ?: error("No wrapper type for ${this.name.lowercase()}")

            public companion object {
                public val TYPE_TO_WRAPPER_TYPE_NAME: Map<Type, String> = mapOf(
                    BOOL to ".google.protobuf.BoolValue",
                    BYTES to ".google.protobuf.BytesValue",
                    DOUBLE to ".google.protobuf.DoubleValue",
                    FLOAT to ".google.protobuf.FloatValue",
                    INT32 to ".google.protobuf.Int32Value",
                    INT64 to ".google.protobuf.Int64Value",
                    STRING to ".google.protobuf.StringValue",
                    UINT32 to ".google.protobuf.UInt32Value",
                    UINT64 to ".google.protobuf.UInt64Value"
                )
                public val WRAPPER_TYPE_NAME_TO_TYPE: Map<String, Type> =
                    TYPE_TO_WRAPPER_TYPE_NAME.entries.associateBy({ it.value }, { it.key })
            }
        }
    }
}
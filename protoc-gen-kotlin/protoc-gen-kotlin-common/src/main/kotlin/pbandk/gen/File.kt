package pbandk.gen

data class File(
    val name: String,
    val packageName: String?,
    val kotlinPackageName: String?,
    val version: Int,
    val types: List<Type>
) {
    // Map is keyed by protobuf names (qualified starting w/ a dot if packageName is non-null) with value of Kotlin FQCN
    fun kotlinTypeMappings() = mutableMapOf<String, String>().also { ret ->
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

    sealed class Type {
        abstract val name: String
        abstract val kotlinTypeName: String

        data class Message(
            override val name: String,
            val fields: List<Field>,
            val nestedTypes: List<Type>,
            val mapEntry: Boolean,
            override val kotlinTypeName: String
        ) : Type()

        data class Enum(
            override val name: String,
            val values: List<Value>,
            override val kotlinTypeName: String
        ) : Type() {
            data class Value(val number: Int, val name: String, val kotlinValueClassName: String, val kotlinValueStringName: String)
        }
    }

    sealed class Field {
        abstract val name: String
        abstract val kotlinFieldName: String

        data class Standard(
            val number: Int,
            override val name: String,
            val type: Type,
            val localTypeName: String?,
            val repeated: Boolean,
            // Note, this is only applicable for proto2
            // TODO: test explicitly set default value in proto2
            val optional: Boolean,
            val packed: Boolean,
            val map: Boolean,
            override val kotlinFieldName: String,
            // This can be null when localTypeName is not null which means it is fully qualified and should be looked up
            val kotlinLocalTypeName: String?
        ) : Field()

        data class OneOf(
            override val name: String,
            val fields: List<Standard>,
            val kotlinFieldTypeNames: Map<String, String>,
            override val kotlinFieldName: String,
            val kotlinTypeName: String
        ) : Field()

        enum class Type {
            BOOL, BYTES, DOUBLE, ENUM, FIXED32, FIXED64, FLOAT, INT32, INT64, MESSAGE,
            SFIXED32, SFIXED64, SINT32, SINT64, STRING, UINT32, UINT64;

            val neverPacked get() =
                this == File.Field.Type.BOOL  || this == File.Field.Type.BYTES || this == File.Field.Type.ENUM ||
                this == File.Field.Type.MESSAGE || this == File.Field.Type.STRING
        }
    }
}
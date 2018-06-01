package pbandk.gen

data class File(
    val name: String,
    val packageName: String?,
    val version: Int,
    val types: List<Type>
) {
    sealed class Type {
        abstract val name: String
        abstract val kotlinTypeName: String

        data class Message(
            override val name: String,
            val fields: List<Field>,
            val nestedTypes: List<Type>,
            override val kotlinTypeName: String
        ) : Type()

        data class Enum(
            override val name: String,
            val values: List<Value>,
            override val kotlinTypeName: String
        ) : Type() {
            data class Value(val number: Int, val name: String, val kotlinValueName: String)
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
            override val kotlinFieldName: String,
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
            BOOL, BYTES, DOUBLE, ENUM, FIXED32, FIXED64, FLOAT, GROUP, INT32, INT64, MESSAGE,
            SFIXED32, SFIXED64, SINT32, SINT64, STRING, UINT32, UINT64,
        }
    }
}
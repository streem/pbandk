package pbandk.gen

data class File(
    val name: String,
    val packageName: String,
    val version: Int,
    val types: List<Type>
) {
    sealed class Type {
        data class Message(
            val name: String,
            val fields: List<Field>,
            val nestedTypes: List<Type>
        ) : Type()
        data class Enum(
            val name: String,
            val values: List<Pair<Int, String>>
        ) : Type()
    }

    sealed class Field {
        enum class Type {
            BOOL, BYTES, DOUBLE, ENUM, FIXED32, FIXED64, FLOAT, GROUP, INT32, INT64, MESSAGE,
            SFIXED32, SFIXED64, SINT32, SINT64, STRING, UINT32, UINT64,
        }

        data class Standard(
            val number: Int,
            val name: String,
            val type: Type,
            val typeName: String?
        ) : Field()
        data class OneOf(
            val name: String,
            val fields: List<Standard>
        ) : Field()
    }
}
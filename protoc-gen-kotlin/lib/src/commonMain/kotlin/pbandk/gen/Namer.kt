package pbandk.gen

fun underscoreToCamelCase(str: String): String {
    var ret = str
    var lastIndex = -1
    while (true) {
        lastIndex = ret.indexOf('_', lastIndex+1).also { if (it == -1) return ret }
        ret = ret.substring(0, lastIndex) + ret.substring(lastIndex + 1).capitalize()
    }
}

fun splitWordsToSnakeCase(str: String) =
    str.replace(Regex("(?<=[a-z])([A-Z0-9])"), "_$1").toLowerCase()

interface Namer {
    fun newTypeName(preferred: String, nameSet: Collection<String>): String
    fun newFieldName(preferred: String, nameSet: Collection<String>): String
    fun newEnumValueTypeName(enumTypeName: String, preferred: String, nameSet: Collection<String>): String

    open class Standard : Namer {
        val disallowedTypeNames = setOf(
            "Boolean", "Companion", "Double", "Float", "Int", "List", "Long", "Map", "String"
        )
        val disallowedFieldNames = setOf(
            "decodeWith", "descriptor", "emptyList", "encodeWith", "pbandk", "plus", "protoSize", "unknownFields"
        )
        val disallowedFieldNamePrefixes = setOf(
            "decodeFrom", "encodeTo"
        )
        val disallowedValueTypeNames = disallowedTypeNames + setOf(
            "UNRECOGNIZED"
        )
        val kotlinKeywords = setOf(
            "as", "break", "class", "continue", "do", "else", "false", "for", "fun", "if", "in",
            "interface", "is", "null", "object", "package", "return", "super", "this", "throw",
            "true", "try", "typealias", "typeof", "val", "var", "when", "while"
        )

        override fun newTypeName(preferred: String, nameSet: Collection<String>): String {
            var name = underscoreToCamelCase(preferred).capitalize()
            while (nameSet.contains(name) || disallowedTypeNames.contains(name)) name += '_'
            return name
        }

        override fun newFieldName(preferred: String, nameSet: Collection<String>): String {
            var name = underscoreToCamelCase(preferred).decapitalize()
            while (nameSet.contains(name) || disallowedFieldNames.contains(name)) name += '_'
            if (disallowedFieldNamePrefixes.any { name.startsWith(it) } && !name.endsWith('_')) name += '_'
            if (kotlinKeywords.contains(name)) name = "`$name`"
            return name
        }

        override fun newEnumValueTypeName(enumTypeName: String, preferred: String, nameSet: Collection<String>): String {
            val typePrefix = splitWordsToSnakeCase(enumTypeName) + '_'
            var name = splitWordsToSnakeCase(preferred).substringAfter(typePrefix)
            name = name.toUpperCase()

            while (nameSet.contains(name) ||
                    disallowedValueTypeNames.contains(name) ||
                    enumTypeName == name) {
                name += '_'
            }
            return name
        }

        companion object : Standard()
    }
}

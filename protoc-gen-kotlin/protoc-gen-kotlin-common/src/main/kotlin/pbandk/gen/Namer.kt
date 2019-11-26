package pbandk.gen

interface Namer {
    fun newTypeName(preferred: String, nameSet: Collection<String>): String
    fun newFieldName(preferred: String, nameSet: Collection<String>): String
    fun newEnumValueClassName(typeName: String, preferred: String, nameSet: Collection<String>): String
    fun newEnumValueStringName(typeName: String, preferred: String, nameSet: Collection<String>): String

    open class Standard : Namer {
        val disallowedTypeNames = setOf(
            "Boolean", "Companion", "Double", "Float", "Int", "List", "Long", "Map", "String"
        )
        val disallowedFieldNames = setOf(
            "emptyList", "pbandk", "plus", "protoMarshal", "protoSize", "protoUnmarshal", "unknownFields"
        )
        val disallowedValueClassNames = setOf(
            "Unrecognized"
        )
        val disallowedValueStringNames = setOf(
            "UNRECOGNIZED"
        )
        val kotlinKeywords = setOf(
            "as", "break", "class", "continue", "do", "else", "false", "for", "fun", "if", "in",
            "interface", "is", "null", "object", "package", "return", "super", "this", "throw",
            "true", "try", "typealias", "val", "var", "when", "while"
        )

        protected fun underscoreToCamelCase(str: String): String {
            var ret = str
            var lastIndex = -1
            while (true) {
                lastIndex = ret.indexOf('_', lastIndex+1).also { if (it == -1) return ret }
                ret = ret.substring(0, lastIndex) + ret.substring(lastIndex + 1).capitalize()
            }
        }

        protected fun splitWordsToSnakeCase(str: String) =
            str.split("_")
                .flatMap { it.split(Regex("(?<=[a-z])([A-Z0-9])")) }
                .joinToString("_") { it.toLowerCase() }

        override fun newTypeName(preferred: String, nameSet: Collection<String>): String {
            var name = underscoreToCamelCase(preferred).capitalize()
            while (nameSet.contains(name) || disallowedTypeNames.contains(name)) name += '_'
            return name
        }

        override fun newFieldName(preferred: String, nameSet: Collection<String>): String {
            var name = underscoreToCamelCase(preferred).decapitalize()
            while (nameSet.contains(name) || disallowedFieldNames.contains(name)) name += '_'
            if (kotlinKeywords.contains(name)) name = "`$name`"
            return name
        }

        override fun newEnumValueClassName(typeName: String, preferred: String, nameSet: Collection<String>): String {
            val typePrefix = splitWordsToSnakeCase(typeName) + '_'
            var name = splitWordsToSnakeCase(preferred).substringAfter(typePrefix)
            name = underscoreToCamelCase(name).capitalize()

            while (nameSet.contains(name) || disallowedValueClassNames.contains(name)) name += '_'
            return name
        }

        override fun newEnumValueStringName(typeName: String, preferred: String, nameSet: Collection<String>): String {
            val typePrefix = splitWordsToSnakeCase(typeName) + '_'
            var name = splitWordsToSnakeCase(preferred).substringAfter(typePrefix).toUpperCase()

            while (nameSet.contains(name) || disallowedValueStringNames.contains(name)) name += '_'
            return name
        }

        companion object : Standard()
    }
}
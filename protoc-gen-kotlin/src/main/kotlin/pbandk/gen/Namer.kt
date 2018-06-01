package pbandk.gen

interface Namer {
    fun newTypeName(preferred: String, nameSet: MutableSet<String>): String
    fun newFieldName(preferred: String, nameSet: MutableSet<String>): String
    fun newEnumValueName(preferred: String, nameSet: MutableSet<String>): String

    open class Standard : Namer {
        val reservedTypeNames = setOf("Boolean", "Double", "Float", "Int", "Long", "String")
        val reservedFieldNames = setOf(
            "class", "pbandk", "protoMarshal", "protoSize", "protoUnmarshal", "unknownFields"
        )

        protected fun underscoreToCamelCase(str: String): String {
            var ret = str
            var lastIndex = -1
            while (true) {
                lastIndex = ret.indexOf('_', lastIndex+1).also { if (it == -1) return ret }
                ret = ret.substring(0, lastIndex) + ret.substring(lastIndex + 1).capitalize()
            }
        }

        override fun newTypeName(preferred: String, nameSet: MutableSet<String>): String {
            var name = underscoreToCamelCase(preferred).capitalize()
            while (nameSet.contains(name) || reservedTypeNames.contains(name)) name += '_'
            return name.also { nameSet += name }
        }

        override fun newFieldName(preferred: String, nameSet: MutableSet<String>): String {
            var name = underscoreToCamelCase(preferred).decapitalize()
            while (nameSet.contains(name) || reservedFieldNames.contains(name)) name += '_'
            return name.also { nameSet += name }
        }

        override fun newEnumValueName(preferred: String, nameSet: MutableSet<String>): String {
            var name = preferred.toUpperCase()
            while (nameSet.contains(name)) name += '_'
            return name.also { nameSet += name }
        }

        companion object : Standard()
    }
}
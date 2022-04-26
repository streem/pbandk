package pbandk.gen

import pbandk.UnknownField
import pbandk.wkt.FieldOptions

public open class CodeGenerator(
    public val file: File,
    public val kotlinTypeMappings: Map<String, Name>,
    public val params: Map<String, String>
) {
    protected val visibility: String = params["visibility"] ?: "public"

    protected val bld: StringBuilder = StringBuilder()
    protected var indent: String = ""

    public fun generate(): String {
        line("@file:OptIn(pbandk.PublicForGeneratedCode::class)").line()
        file.kotlinPackageName?.let { line("package $it") }
        file.types.forEach { writeType(it) }
        file.extensions.forEach { writeExtension(it) }
        file.types.filterIsInstance<File.Type.Message>().forEach { writeMessageExtensions(it) }
        return bld.toString()
    }

    protected fun line(): CodeGenerator = also { bld.appendLine() }
    protected fun line(str: String): CodeGenerator = also { bld.append(indent).appendLine(str) }
    protected fun lineBegin(str: String = ""): CodeGenerator = also { bld.append(indent).append(str) }
    protected fun lineMid(str: String): CodeGenerator = also { bld.append(str) }
    protected fun lineEnd(str: String = ""): CodeGenerator = also { bld.appendLine(str) }
    protected fun indented(fn: () -> Any?): CodeGenerator = also {
        indent += "    "
        fn().also { indent = indent.dropLast(4) }
    }

    private fun writeExtension(field: File.Field) {
        when (field) {
            is File.Field.Numbered -> {
                line()
                addDeprecatedAnnotation(field)
                lineBegin("$visibility val ${field.extendeeKotlinType!!.fullWithPackage}.${field.kotlinName.simple}: ")
                lineEnd(field.kotlinValueType(nullableIfMessage = true)).indented {
                    line("get() = getExtension(${field.descriptorName.fullWithPackage})")
                }

                line()
                addDeprecatedAnnotation(field)
                lineBegin("$visibility ${field.mutablePropertyDeclaration}")
                lineMid(" ${field.extendeeKotlinType!!.mutableTypeName.fullWithPackage}.${field.kotlinName.simple}: ")
                lineEnd(field.kotlinValueType(nullableIfMessage = true, mutable = true)).indented {
                    line("get() = getExtension(${field.descriptorName.fullWithPackage})")
                    if (field.mutablePropertyDeclaration == "var") {
                        line("set(value) = setExtension(${field.descriptorName.fullWithPackage}, value)")
                    }
                }

                line().line("@pbandk.Export")
                addDeprecatedAnnotation(field)
                line("$visibility val ${field.descriptorName.simple}: ${field.fieldDescriptorType(field.extendeeKotlinType!!)} = ").indented {
                    generateFieldDescriptorConstructorValues(
                        field,
                        field.extendeeKotlinType!!,
                        null,
                        "${field.extendeeKotlinType!!.fullWithPackage}.Companion::descriptor"
                    )
                }
            }
            is File.Field.OneOf -> error("Got unexpected oneof extension field")
        }
    }

    protected fun writeType(type: File.Type) {
        when (type) {
            is File.Type.Enum -> writeEnumType(type)
            is File.Type.Message -> writeMessageType(type)
        }
    }

    protected fun writeEnumType(type: File.Type.Enum) {
        line()
        // Only mark top-level classes for export, internal classes will be exported transitively
        if (type.kotlinName.parent == null) line("@pbandk.Export")
        // Enums are sealed classes w/ a value and a name, and a companion object with all values
        line("$visibility sealed class ${type.kotlinName.simple}(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {")
            .indented {
                line("override fun equals(other: kotlin.Any?): Boolean = other is ${type.kotlinName.fullWithPackage} && other.value == value")
                line("override fun hashCode(): Int = value.hashCode()")
                line("override fun toString(): String = \"${type.kotlinName.full}.\${name ?: \"UNRECOGNIZED\"}(value=\$value)\"")
                line()
                type.values.forEach { line("$visibility object ${it.kotlinName} : ${type.kotlinName.simple}(${it.number}, \"${it.name}\")") }
                line("$visibility class UNRECOGNIZED(value: Int) : ${type.kotlinName.simple}(value)")
                line()
                line("$visibility companion object : pbandk.Message.Enum.Companion<${type.kotlinName.fullWithPackage}> {").indented {
                    line("$visibility val values: List<${type.kotlinName.full}> by lazy { listOf(${type.values.joinToString(", ") { it.kotlinName }}) }")
                    line("override fun fromValue(value: Int): ${type.kotlinName.fullWithPackage} = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)")
                    line("override fun fromName(name: String): ${type.kotlinName.fullWithPackage} = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException(\"No ${type.kotlinName.simple} with name: \$name\")")
                }.line("}")
            }.line("}")
    }

    protected fun writeMessageType(type: File.Type.Message) {
        // There's no need to generate code for the messages that back every protobuf map field because those fields
        // all use `MapField.Entry` as their message class.
        if (type.mapEntry) return

        val messageInterface = if (type.extensionRange.isNotEmpty()) {
            "pbandk.ExtendableMessage<${type.kotlinName.fullWithPackage}>"
        } else {
            "pbandk.Message"
        }
        val mutableTypeName = type.kotlinName.mutableTypeName

        line()
        // Only mark top-level classes for export, internal classes will be exported transitively
        // TODO: temporarily disabled because interfaces can't be exported in Kotlin 1.5. This can be reenabled after
        //  upgrading to Kotlin 1.6.20
        //if (type.kotlinName.parent == null) line("@pbandk.Export")
        line("$visibility sealed interface ${type.kotlinName.simple} : $messageInterface {").indented {
            type.fields.forEach { field ->
                addDeprecatedAnnotation(field)
                lineBegin("$visibility val ${field.kotlinName.simple}: ")
                when (field) {
                    is File.Field.Numbered -> lineEnd(field.kotlinValueType(true))
                    is File.Field.OneOf -> lineEnd("${field.kotlinTypeName.simple}<*>?")
                }
            }

            line()
            line("override operator fun plus(other: pbandk.Message?): ${type.kotlinName.fullWithPackage}")
            line("override val descriptor: pbandk.MessageDescriptor<${type.kotlinName.fullWithPackage}>")

            line()
            line("/**")
            line(" * The [${mutableTypeName.simple}] passed as a receiver to the [builderAction] is valid only inside that function.")
            line(" * Using it outside of the function produces an unspecified behavior.")
            line(" */")
            line("$visibility fun copy(builderAction: ${mutableTypeName.fullWithPackage}.() -> Unit): ${type.kotlinName.fullWithPackage}")

            line()
            line("@Deprecated(").indented {
                line("message = \"Use copy { } instead\",")
                /* This doesn't work that well in practice
                line("replaceWith = ReplaceWith(").indented {
                    lineBegin("expression = \"copy {\\n")
                    type.fields.forEach { field ->
                        if (field is File.Field.Numbered && field.repeated) {
                            lineMid("this.${field.kotlinName}.clear()\\n")
                        }
                        lineMid("${field.builderSetter()}\\n")
                    }
                    lineMid("this.unknownFields.clear()\\n")
                    lineEnd("this.unknownFields += unknownFields\\n}\",")
                }.line(")")
                 */
            }.line(")")
            line("@pbandk.JsName(\"copyDeprecated\")")
            line("$visibility fun copy(").indented {
                type.fields.forEach { field ->
                    lineBegin("${field.kotlinName.simple}: ")
                    when (field) {
                        is File.Field.Numbered -> lineMid(field.kotlinValueType(true))
                        is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                    }
                    lineMid(" = ")
                    if (field is File.Field.Numbered && field.options.deprecated == true) {
                        lineMid("@Suppress(\"DEPRECATION\") ")
                    }
                    lineEnd("this.${field.kotlinName.simple},")
                }
                line("unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields")
            }.line("): ${type.kotlinName.fullWithPackage}")

            // One-ofs as sealed class hierarchies
            line()
            type.fields.filterIsInstance<File.Field.OneOf>().forEach(::writeOneOfType)

            writeFieldDescriptors(type)

            // Companion object
            line()
            line("$visibility companion object : pbandk.Message.Companion<${type.kotlinName.fullWithPackage}> {").indented {
                line("$visibility val defaultInstance: ${type.kotlinName.fullWithPackage} by lazy { ${type.kotlinName.fullWithPackage} {} }")
                line()
                writeMessageDescriptor(type)
            }.line("}")

            // Nested enums and types
            type.nestedTypes.forEach { writeType(it) }
        }.line("}")

        val mutableMessageInterface = if (type.extensionRange.isNotEmpty()) {
            "pbandk.MutableExtendableMessage<${type.kotlinName.fullWithPackage}>"
        } else {
            "pbandk.MutableMessage<${type.kotlinName.fullWithPackage}>"
        }

        line()
        // TODO: temporarily disabled because interfaces can't be exported in Kotlin 1.5. This can be reenabled after
        //  upgrading to Kotlin 1.6.20
        //line("@pbandk.Export")
        line("$visibility sealed interface ${mutableTypeName.simple} : ${type.kotlinName.fullWithPackage}, $mutableMessageInterface {").indented {
            type.fields.forEach { field ->
                addDeprecatedAnnotation(field)
                lineBegin("$visibility override ${field.mutablePropertyDeclaration} ${field.kotlinName.simple}: ")
                when (field) {
                    is File.Field.Numbered -> lineEnd(field.kotlinValueType(nullableIfMessage = true, mutable = true))
                    is File.Field.OneOf -> lineEnd("${field.kotlinTypeName.full}<*>?")
                }
            }

            type.fields.filterIsInstance<File.Field.OneOf>().forEach { oneOf ->
                line()
                oneOf.fields.forEach { field ->
                    addDeprecatedAnnotation(field)
                    lineBegin("$visibility override ${field.mutablePropertyDeclaration} ${field.kotlinName.simple}: ")
                    lineEnd("${field.kotlinValueType(nullableIfMessage = false, mutable = true)}?")
                }
            }
        }.line("}")
    }

    protected fun writeOneOfType(oneOf: File.Field.OneOf) {
        oneOf.fields.forEach { field ->
            addDeprecatedAnnotation(field)
            line("$visibility val ${field.kotlinName.simple}: ${field.kotlinValueType(false)}?")
        }
        line()

        line("$visibility sealed interface ${oneOf.kotlinTypeName.simple}<V> : pbandk.Message.OneOf<V> {").indented {
            oneOf.fields.forEach { field ->
                addDeprecatedAnnotation(field)
                lineBegin("$visibility class ${oneOf.kotlinFieldNames[field.name.simple]!!.simple}(")
                lineMid("${field.kotlinName.simple}: ${field.kotlinValueType(false)}")
                if (field.type != File.Field.Type.MESSAGE) lineMid(" = ${field.defaultValue()}")
                lineEnd(") : ").indented {
                    lineBegin("${oneOf.kotlinTypeName.simple}<${field.kotlinValueType(false)}>, ")
                    lineMid("pbandk.gen.GeneratedOneOf<${field.kotlinValueType(false)}>(${field.kotlinName.simple}, ")
                    lineEnd("${field.descriptorName.fullWithPackage})")
                }
            }
        }.line("}").line()
    }

    protected fun writeFieldDescriptors(type: File.Type.Message) {
        line("@pbandk.PublicForGeneratedCode")
        line("$visibility object FieldDescriptors {").indented {
            val chunkSize = 200

            val allFields = type.sortedStandardFieldsWithOneOfs()
            val needToChunkFields = allFields.size > chunkSize
            allFields.forEach { (field, oneof) ->
                if (needToChunkFields) {
                    lineBegin("$visibility lateinit var ${field.descriptorName.simple}: ")
                    lineEnd(field.fieldDescriptorType(type.kotlinName, isOneOfMember = oneof != null)).indented {
                        line("private set")
                    }
                } else {
                    lineBegin("$visibility val ${field.descriptorName.simple}: ")
                    lineMid(field.fieldDescriptorType(type.kotlinName, isOneOfMember = oneof != null))
                    lineEnd(" = ").indented {
                        generateFieldDescriptorConstructorValues(
                            field,
                            type.kotlinName,
                            oneof,
                            "${type.kotlinName.fullWithPackage}::descriptor"
                        )
                    }
                }
            }

            val oneofFields = type.fields.filterIsInstance<File.Field.OneOf>()
            val needToChunkOneofs = oneofFields.size > chunkSize
            if (oneofFields.isNotEmpty()) line()
            oneofFields.forEach { field ->
                if (needToChunkOneofs) {
                    lineBegin("$visibility lateinit var ${field.descriptorName.simple}: ")
                    lineEnd(field.oneofDescriptorType(type.kotlinName)).indented {
                        line("private set")
                    }
                } else {
                    lineBegin("$visibility val ${field.descriptorName.simple}: ")
                    lineMid(field.oneofDescriptorType(type.kotlinName))
                    lineEnd(" = ").indented {
                        generateOneofDescriptorConstructorValues(
                            field,
                            type.kotlinName,
                            "${type.kotlinName.fullWithPackage}::descriptor"
                        )
                    }
                }
            }

            if (needToChunkFields || needToChunkOneofs) {
                line().line("init {").indented {
                    if (needToChunkFields) {
                        allFields.chunked(chunkSize).forEachIndexed { index, _ ->
                            line("addFields${index}()")
                        }
                    }
                    if (needToChunkOneofs) {
                        oneofFields.chunked(chunkSize).forEachIndexed { index, _ ->
                            line("addOneofs${index}()")
                        }
                    }
                }.line("}")

                if (needToChunkFields) {
                    allFields.chunked(chunkSize).forEachIndexed { index, chunk ->
                        line()
                        line("private fun addFields${index}() {").indented {
                            chunk.forEach { (field, oneof) ->
                                line("${field.descriptorName.simple} = ").indented {
                                    generateFieldDescriptorConstructorValues(
                                        field,
                                        type.kotlinName,
                                        oneof,
                                        "${type.kotlinName.fullWithPackage}::descriptor"
                                    )
                                }
                            }
                        }.line("}")
                    }
                }

                if (needToChunkOneofs) {
                    oneofFields.chunked(chunkSize).forEachIndexed { index, chunk ->
                        line()
                        line("private fun addOneofs${index}() {").indented {
                            chunk.forEach { field ->
                                lineEnd("${field.descriptorName.simple} = ").indented {
                                    generateOneofDescriptorConstructorValues(
                                        field,
                                        type.kotlinName,
                                        "${type.kotlinName.fullWithPackage}::descriptor"
                                    )
                                }
                            }
                        }.line("}")
                    }
                }
            }
        }.line("}")
    }

    protected fun writeMessageDescriptor(type: File.Type.Message) {
        // Messages can have circular references to each other (e.g. `pbandk.wkt.Struct` includes a `pbandk.wkt.Value`
        // field, but `pbandk.wkt.Value` includes a `pbandk.wkt.Struct` field). On Kotlin/Native the companion object
        // (e.g. `pbandk.wkt.Value.Companion`) is automatically frozen because it's a singleton. But Kotlin/Native
        // doesn't allow cyclic frozen structures:
        // https://kotlinlang.org/docs/reference/native/concurrency.html#global-variables-and-singletons. In order to
        // break the circular references, `descriptor` needs to be a `lazy` field.
        line("override val descriptor: pbandk.MessageDescriptor<${type.kotlinName.fullWithPackage}> by lazy {").indented {
            val builderName = type.kotlinName.builderName
            val (oneofFields, nonOneofFields) = type.fields.partition { it is File.Field.OneOf }

            line("pbandk.MessageDescriptor.of(").indented {
                line("fullName = \"${type.name.fullWithPackage.removePrefix(".")}\",")
                line("messageClass = ${type.kotlinName.fullWithPackage}::class,")
                line("messageCompanion = this,")
                line("builder = ${builderName.parent?.full.orEmpty()}::${builderName.simple},")
                if (nonOneofFields.isNotEmpty()) {
                    line("fields = listOf(").indented {
                        nonOneofFields.forEach { line("${it.descriptorName.fullWithPackage},") }
                    }.line("),")
                }
                if (oneofFields.isNotEmpty()) {
                    line("oneofs = listOf(").indented {
                        oneofFields.forEach { line("${it.descriptorName.fullWithPackage},") }
                    }.line("),")
                }
            }.line(")")
        }.line("}")
    }

    private fun generateFieldOptions(fieldOptions: FieldOptions) {
        // We don't use/support other field option values currently. Once we support all of the options, this check
        // should change to `fieldOptions != FieldOptions.defaultInstance`
        if (fieldOptions.deprecated != null || fieldOptions.unknownFields.isNotEmpty()) {
            line("options = pbandk.wkt.FieldOptions {").indented {
                fieldOptions.deprecated?.let {
                    line("deprecated = $it")
                }
                if (fieldOptions.unknownFields.isNotEmpty()) {
                    generateUnknownFields(fieldOptions.unknownFields)
                }
            }.line("},")
        }
    }

    private fun generateUnknownFields(unknownFields: Map<Int, UnknownField>) {
        line("unknownFields += mapOf(").indented {
            val lastFieldIndex = unknownFields.size - 1
            unknownFields.values.forEachIndexed { fieldIndex, field ->
                line("${field.fieldNum} to pbandk.UnknownField(").indented {
                    line("fieldNum = ${field.fieldNum},")
                    val lastValueIndex = field.values.size - 1
                    line("values = listOf(").indented {
                        field.values.forEachIndexed { valueIndex, value ->
                            lineBegin("pbandk.UnknownField.Value(")
                            lineMid("wireType = ${value.wireType}, ")
                            lineMid("rawBytes = byteArrayOf(${value.rawBytes.array.joinToString()})")
                            lineMid(")")
                            if (valueIndex != lastValueIndex) lineEnd(",") else lineEnd()
                        }
                    }.line(")")
                }.lineBegin(")")
                if (fieldIndex != lastFieldIndex) lineEnd(",") else lineEnd()
            }
        }.line(")")
    }

    protected fun writeMessageExtensions(type: File.Type.Message) {
        if (type.mapEntry) return

        writeMessageBuilder(type)
        writeMessageOrDefaultExtension(type)
        writeMessageImpl(type)
        type.nestedTypes.filterIsInstance<File.Type.Message>().forEach { writeMessageExtensions(it) }
    }

    protected fun writeMessageBuilder(type: File.Type.Message) {
        val builderName = type.kotlinName.builderName
        val mutableTypeName = type.kotlinName.mutableTypeName

        line()
        line("@Deprecated(").indented {
            line("message = \"Use ${type.kotlinName.full} { } instead\",")
            line("replaceWith = ReplaceWith(").indented {
                line("imports = [\"${type.kotlinName.fullWithPackage}\"],")
                lineBegin("expression = \"${type.kotlinName.full} {\\n")
                type.fields.forEach { field -> lineMid("${field.builderSetter()}\\n") }
                lineEnd("this.unknownFields += unknownFields\\n}\",")
            }.line(")")
        }.line(")")
        line("$visibility fun ${builderName.full}(").indented {
            type.fields.forEach { field ->
                lineBegin("${field.kotlinName.simple}: ")
                when (field) {
                    is File.Field.Numbered -> lineMid(field.kotlinValueType(true))
                    is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                }
                lineEnd(" = ${field.defaultValue()},")
            }
            line("unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")
        }.line("): ${type.kotlinName.fullWithPackage} = ${builderName.fullWithPackage} {").indented {
            type.fields.forEach { field ->
                if (field is File.Field.Numbered && field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
                line(field.builderSetter())
            }
            line("this.unknownFields += unknownFields")
        }.line("}")

        line()
        line("/**")
        line(" * The [${mutableTypeName.simple}] passed as a receiver to the [builderAction] is valid only inside that function.")
        line(" * Using it outside of the function produces an unspecified behavior.")
        line(" */")
        line("@pbandk.Export")
        line("@pbandk.JsName(\"build${type.kotlinName.full.replace(".", "")}\")")
        lineBegin("$visibility fun ${builderName.full}(builderAction: ${mutableTypeName.fullWithPackage}.() -> Unit): ${type.kotlinName.fullWithPackage} = ")
        lineEnd("${type.kotlinName.mutableImplName.fullWithPackage}(").indented {
            type.fields.forEach { field -> line("${field.kotlinName.simple} = ${field.defaultValue(mutable = true)},") }
        }.line(").also(builderAction).to${type.kotlinName.simple}()")

        type.kotlinName.parent?.let { parent ->
            val mutableParentName = parent.copy(simple = "Mutable${parent.simple}")
            val nestedBuilderName = Name(parent = mutableParentName, simple = type.kotlinName.simple)
            line()
            line("/**")
            line(" * The [${mutableTypeName.simple}] passed as a receiver to the [builderAction] is valid only inside that function.")
            line(" * Using it outside of the function produces an unspecified behavior.")
            line(" */")
            lineBegin("$visibility fun ${nestedBuilderName.full}")
            lineEnd("(builderAction: ${mutableTypeName.fullWithPackage}.() -> Unit): ${type.kotlinName.fullWithPackage} =").indented {
                line("${type.kotlinName.fullWithPackage}(builderAction)")
            }
        }
    }

    protected fun writeMessageOrDefaultExtension(type: File.Type.Message) {
        line()
        // There can be multiple differently-typed `orDefault` functions in the same scope which
        // Kotlin/JS cannot handle unfortunately. We have to annotate each of them with a unique
        // name so that Kotlin/JS knows which name to choose.
        //
        // Also, if current type is an inner class, `fullTypeName` will contains dots which we
        // have to get rid of (i.e. `Person.AddressBook` becomes `PersonAddressBook`).
        line("@pbandk.Export")
        line("@pbandk.JsName(\"orDefaultFor${type.kotlinName.full.replace(".", "")}\")")
        line("$visibility fun ${type.kotlinName.full}?.orDefault(): ${type.kotlinName.fullWithPackage} = this ?: ${type.kotlinName.fullWithPackage}.defaultInstance")
    }

    protected fun writeMessageImpl(type: File.Type.Message) {
        fun writeDeprecatedCopyMethod(isMutable: Boolean) {
            if (type.fields.filterIsInstance<File.Field.Numbered>().any { it.options.deprecated == true }) {
                line("@Suppress(\"DEPRECATION\")")
            }
            line("@Deprecated(\"Use copy { } instead\")")
            line("override fun copy(").indented {
                type.fields.forEach { field ->
                    lineBegin("${field.kotlinName.simple}: ")
                    when (field) {
                        is File.Field.Numbered -> lineMid(field.kotlinValueType(true))
                        is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                    }
                    lineEnd(",")
                }
                line("unknownFields: Map<Int, pbandk.UnknownField>")
            }.lineBegin(") = ")

            if (isMutable) {
                lineEnd("throw UnsupportedOperationException()")
                return
            }

            lineEnd("${type.kotlinName.fullWithPackage} {").indented {
                type.fields.forEach { field ->
                    if (field is File.Field.Numbered && field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
                    line(field.builderSetter())
                }
                line("this.unknownFields += unknownFields")
            }
            line("}")
        }

        val implName = type.kotlinName.implName
        val mutableTypeName = type.kotlinName.mutableTypeName

        val generatedMessageClass = if (type.extensionRange.isNotEmpty()) {
            "pbandk.gen.GeneratedExtendableMessage<${type.kotlinName.fullWithPackage}>"
        } else {
            "pbandk.gen.GeneratedMessage<${type.kotlinName.fullWithPackage}>"
        }

        line().line("private class ${implName.simple}(").indented {
            type.fields.forEach { field ->
                lineBegin("override val ${field.kotlinName.simple}: ")
                when (field) {
                    is File.Field.Numbered -> lineMid(
                        field.kotlinValueType(nullableIfMessage = true, mutable = false, impl = true)
                    )
                    is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                }
                lineEnd(",")
            }
            // The unknown fields
            line("unknownFields: Map<Int, pbandk.UnknownField>")
        }.line(") : ${type.kotlinName.fullWithPackage}, $generatedMessageClass(unknownFields) {").indented {
            line("override val descriptor get() = ${type.kotlinName.fullWithPackage}.descriptor")

            type.fields.filterIsInstance<File.Field.OneOf>().forEach { oneOf ->
                line()
                oneOf.fields.forEach { field ->
                    line("override val ${field.kotlinName.simple}: ${field.kotlinValueType(false)}?").indented {
                        if (field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
                        lineBegin("get() = ")
                        lineMid("(${oneOf.kotlinName.simple} as? ${oneOf.kotlinFieldNames[field.name.simple]!!.fullWithPackage})")
                        lineEnd("?.value")
                    }
                }
            }

            line()
            line("@Suppress(\"RedundantOverride\")")
            line("override fun copy(builderAction: ${mutableTypeName.fullWithPackage}.() -> Unit) = super.copy(builderAction)")

            line()
            writeDeprecatedCopyMethod(false)
        }.line("}")

        val mutableGeneratedMessageClass = if (type.extensionRange.isNotEmpty()) {
            "pbandk.gen.MutableGeneratedExtendableMessage<${type.kotlinName.fullWithPackage}>"
        } else {
            "pbandk.gen.MutableGeneratedMessage<${type.kotlinName.fullWithPackage}>"
        }

        line().line("private class ${type.kotlinName.mutableImplName.simple}(").indented {
            type.fields.forEach { field ->
                lineBegin("override ${field.mutablePropertyDeclaration} ${field.kotlinName.simple}: ")
                when (field) {
                    is File.Field.Numbered -> lineMid(
                        field.kotlinValueType(nullableIfMessage = true, mutable = true, impl = true)
                    )
                    is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                }
                lineEnd(",")
            }
        }.line(") : ${mutableTypeName.fullWithPackage}, $mutableGeneratedMessageClass() {").indented {
            line("override val descriptor get() = ${type.kotlinName.fullWithPackage}.descriptor")

            type.fields.filterIsInstance<File.Field.OneOf>().forEach { oneOf ->
                line()
                oneOf.fields.forEach { field ->
                    lineBegin("override ${field.mutablePropertyDeclaration} ${field.kotlinName.simple}: ")
                    lineEnd("${field.kotlinValueType(nullableIfMessage = false, mutable = true)}?").indented {
                        lineBegin("get() = ")
                        lineMid("(${oneOf.kotlinName.simple} as? ${oneOf.kotlinFieldNames[field.name.simple]!!.fullWithPackage})")
                        lineEnd("?.value")
                        lineBegin("set(value) { ")
                        if (oneOf.kotlinName.simple == "value") lineMid("this.")
                        lineMid("${oneOf.kotlinName.simple} = value?.let { ${oneOf.kotlinFieldNames[field.name.simple]!!.fullWithPackage}(it) }")
                        lineEnd(" }")
                    }
                }
            }

            line("@Suppress(\"RedundantOverride\")")
            line("override fun copy(builderAction: ${mutableTypeName.fullWithPackage}.() -> Unit) = super.copy(builderAction)")

            line()
            writeDeprecatedCopyMethod(true)

            line().line("fun to${type.kotlinName.simple}() = ${implName.full}(").indented {
                type.fields.forEach { field ->
                    lineBegin("${field.kotlinName.simple} = ")
                    if (field is File.Field.Numbered && field.options.deprecated == true) {
                        lineMid("@Suppress(\"DEPRECATION\") ")
                    }
                    lineMid(field.kotlinName.simple)
                    when {
                        field is File.Field.Numbered.Standard && field.map -> lineMid(".toMapField()")
                        field is File.Field.Numbered && field.repeated -> lineMid(".toListField()")
                    }
                    lineEnd(",")
                }
                line("unknownFields = unknownFields.toMap()")
            }.line(")")
        }.line("}")
    }

    protected fun findLocalType(protoName: String, parent: File.Type.Message? = null): File.Type? {
        // Get the set to look in and the type name
        val (lookIn, typeName) =
            if (parent == null) file.types to protoName.removePrefix("${file.packageName}.")
            else parent.nestedTypes to protoName
        // Go deeper if there's a dot
        typeName.indexOf('.').let {
            if (it == -1) return lookIn.find { type -> type.name.simple == typeName }
            return findLocalType(typeName.substring(it + 1), typeName.substring(0, it).let { parentTypeName ->
                lookIn.find { type -> type.name.simple == parentTypeName } as? File.Type.Message
            } ?: return null)
        }
    }

    protected val Name.mutableTypeName: Name get() = this.copy(simple = "Mutable$simple")
    protected val Name.implName: Name get() {
        val implParentPrefix = parent?.let { "${it.full.replace('.', '_')}_" }.orEmpty()
        return Name(
            packageName = packageName,
            simple = "${implParentPrefix}${simple}_Impl"
        )
    }
    protected val Name.mutableImplName: Name get() {
        val implParentPrefix = parent?.let { "${it.full.replace('.', '_')}_" }.orEmpty()
        return Name(
            packageName = packageName,
            simple = "${implParentPrefix}Mutable${simple}_Impl"
        )
    }
    protected val Name.builderName: Name get() = parent?.let { Name(Name(it, "Companion"), simple) } ?: this

    protected fun File.Type.Message.sortedStandardFieldsWithOneOfs(): List<Pair<File.Field.Numbered, File.Field.OneOf?>> =
        fields.flatMap {
            when (it) {
                is File.Field.Numbered.Standard -> listOf(it to null)
                is File.Field.Numbered.Wrapper -> listOf(it to null)
                is File.Field.OneOf -> it.fields.map { f -> f to it }
            }
        }.sortedBy { it.first.number }

    protected val File.Type.Message.mapEntryKeyField: File.Field.Numbered.Standard?
        get() = if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard)
    protected val File.Type.Message.mapEntryValueField: File.Field.Numbered.Standard?
        get() = if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard)
    protected val File.Type.Message.mapEntryKeyKotlinType: String?
        get() = if (!mapEntry) null else (fields[0] as File.Field.Numbered.Standard).kotlinValueType(false)
    protected val File.Type.Message.mapEntryValueKotlinType: String?
        get() = if (!mapEntry) null else (fields[1] as File.Field.Numbered.Standard).kotlinValueType(true)

    protected fun File.Field.defaultValue(mutable: Boolean = false): String = when (this) {
        is File.Field.Numbered.Standard -> defaultValue(mutable)
        is File.Field.Numbered.Wrapper -> defaultValue(mutable)
        is File.Field.OneOf -> "null"
    }
    protected val File.Field.mutablePropertyDeclaration: String
        get() = when (this) {
            is File.Field.Numbered -> when {
                repeated -> "val"
                else -> "var"
            }
            is File.Field.OneOf -> "var"
        }

    protected fun File.Field.builderSetter(valueQualifier: String = ""): String = "this.${kotlinName.simple}" + when {
        this is File.Field.Numbered.Standard && map -> " += $valueQualifier${kotlinName.simple}"
        this is File.Field.Numbered && repeated -> " += $valueQualifier${kotlinName.simple}"
        else -> " = $valueQualifier${kotlinName.simple}"
    }

    protected val File.Field.descriptorName: Name get() =
        kotlinName.parent?.let { Name(Name(it, "FieldDescriptors"), kotlinName.simple) } ?: kotlinName

    protected fun File.Field.Numbered.kotlinValueType(
        nullableIfMessage: Boolean,
        mutable: Boolean = false,
        impl: Boolean = false
    ): String = when (this) {
        is File.Field.Numbered.Standard -> kotlinValueType(nullableIfMessage, mutable, impl)
        is File.Field.Numbered.Wrapper -> kotlinValueType(nullableIfMessage, mutable, impl)
    }

    protected val File.Field.Numbered.extendeeKotlinType: Name?
        get() = extendee?.let { kotlinTypeMappings[it] }

    protected fun File.Field.Numbered.fieldDescriptorType(typeName: Name, isOneOfMember: Boolean = false): String {
        val fieldValueType = if (isOneOfMember) {
            "${kotlinValueType(false)}?"
        } else {
            kotlinValueType(true)
        }
        return "pbandk.FieldDescriptor<${typeName.fullWithPackage}, $fieldValueType>"
    }

    protected fun File.Field.Numbered.fieldDescriptorTypeType(isOneOfMember: Boolean = false): String {
        return "pbandk.FieldDescriptor.Type." + when (this) {
            is File.Field.Numbered.Standard -> when {
                map -> {
                    val mapEntry = mapEntry()!!
                    "Map<${mapEntry.mapEntryKeyKotlinType}, ${mapEntry.mapEntryValueKotlinType}>(" +
                            "keyType = ${mapEntry.mapEntryKeyField!!.fieldDescriptorTypeType()}, " +
                            "valueType = ${mapEntry.mapEntryValueField!!.fieldDescriptorTypeType()}" +
                            ")"
                }
                repeated -> "Repeated<$kotlinQualifiedTypeName>(valueType = ${copy(repeated = false).fieldDescriptorTypeType()}${if (packed) ", packed = true" else ""})"
                type == File.Field.Type.MESSAGE -> "Message(messageCompanion = $kotlinQualifiedTypeName.Companion)"
                type == File.Field.Type.ENUM -> "Enum(enumCompanion = $kotlinQualifiedTypeName.Companion" + (if (hasPresence || isOneOfMember) ", hasPresence = true" else "") + ")"
                else -> "Primitive.${type.string.replaceFirstChar { it.titlecase() }}(" + (if (hasPresence || isOneOfMember) "hasPresence = true" else "") + ")"
            }
            is File.Field.Numbered.Wrapper -> when {
                repeated -> "Repeated<${wrappedType.standardTypeName.fullWithPackage}>(valueType = ${copy(repeated = false).fieldDescriptorTypeType()})"
                else -> "Message(messageCompanion = ${wrappedType.wrapperKotlinTypeName.fullWithPackage}.Companion)"
            }
        }
    }

    protected fun File.Field.Numbered.descriptorFactoryMethod(isOneOfMember: Boolean = false): String = when {
        this is File.Field.Numbered.Standard && map -> "ofMap"
        repeated -> "ofRepeated"
        isOneOfMember -> "ofOneof"
        else -> "of"
    }

    protected val File.Field.Numbered.Standard.hasPresence: Boolean get() = optional
    protected fun File.Field.Numbered.Standard.mapEntry(): File.Type.Message? =
        if (!map) null else (localType as? File.Type.Message)?.takeIf { it.mapEntry }

    protected val File.Field.Numbered.Standard.localType: File.Type? get() = localTypeName?.let { findLocalType(it) }
    protected val File.Field.Numbered.Standard.kotlinQualifiedTypeName: String
        get() = kotlinLocalTypeName
            ?: localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find mapping for $it") } }?.fullWithPackage
            ?: type.standardTypeName.fullWithPackage

    protected fun File.Field.Numbered.Standard.kotlinValueType(
        nullableIfMessage: Boolean,
        mutable: Boolean = false,
        impl: Boolean = false
    ): String = when {
        map -> mapEntry()!!.let {
            val typeName = when {
                impl && mutable -> "pbandk.gen.MutableMapField"
                impl && !mutable -> "pbandk.gen.MapField"
                !impl && mutable -> "MutableMap"
                !impl && !mutable -> "Map"
                else -> error("Can't get here")
            }
            "$typeName<${it.mapEntryKeyKotlinType}, ${it.mapEntryValueKotlinType}>"
        }
        repeated -> {
            val typeName = when {
                impl && mutable -> "pbandk.gen.MutableListField"
                impl && !mutable -> "pbandk.gen.ListField"
                !impl && mutable -> "MutableList"
                !impl && !mutable -> "List"
                else -> error("Can't get here")
            }
            "$typeName<$kotlinQualifiedTypeName>"
        }
        hasPresence || (type == File.Field.Type.MESSAGE && nullableIfMessage) ->
            "$kotlinQualifiedTypeName?"
        else -> kotlinQualifiedTypeName
    }

    protected fun File.Field.Numbered.Standard.defaultValue(mutable: Boolean = false): String = when {
        map -> if (mutable) {
            "pbandk.gen.MutableMapField(${descriptorName.fullWithPackage})"
        } else {
            "emptyMap()"
        }
        repeated -> if (mutable) "pbandk.gen.MutableListField()" else "emptyList()"
        hasPresence -> "null"
        type == File.Field.Type.ENUM -> "$kotlinQualifiedTypeName.fromValue(0)"
        else -> type.defaultValue
    }

    protected fun File.Field.Numbered.Wrapper.kotlinValueType(
        nullableIfMessage: Boolean,
        mutable: Boolean = false,
        impl: Boolean = false
    ): String = when {
        repeated -> {
            val typeName = when {
                impl && mutable -> "pbandk.gen.MutableListField"
                impl && !mutable -> "pbandk.gen.ListField"
                !impl && mutable -> "MutableList"
                !impl && !mutable -> "List"
                else -> error("Can't get here")
            }
            "$typeName<${wrappedType.standardTypeName.fullWithPackage}>"
        }
        else -> wrappedType.standardTypeName.fullWithPackage + if (nullableIfMessage) "?" else ""
    }

    protected fun File.Field.Numbered.Wrapper.defaultValue(mutable: Boolean = false): String = when {
        repeated -> if (mutable) "pbandk.gen.MutableListField()" else "emptyList()"
        else -> "null"
    }

    protected fun File.Field.OneOf.oneofDescriptorType(typeName: Name): String {
        return "pbandk.OneofDescriptor<${typeName.fullWithPackage}, ${kotlinTypeName.fullWithPackage}<*>>"
    }

    protected val File.Field.Type.string: String
        get() = when (this) {
            File.Field.Type.BOOL -> "bool"
            File.Field.Type.BYTES -> "bytes"
            File.Field.Type.DOUBLE -> "double"
            File.Field.Type.ENUM -> "enum"
            File.Field.Type.FIXED32 -> "fixed32"
            File.Field.Type.FIXED64 -> "fixed64"
            File.Field.Type.FLOAT -> "float"
            File.Field.Type.INT32 -> "int32"
            File.Field.Type.INT64 -> "int64"
            File.Field.Type.MESSAGE -> "message"
            File.Field.Type.SFIXED32 -> "sFixed32"
            File.Field.Type.SFIXED64 -> "sFixed64"
            File.Field.Type.SINT32 -> "sInt32"
            File.Field.Type.SINT64 -> "sInt64"
            File.Field.Type.STRING -> "string"
            File.Field.Type.UINT32 -> "uInt32"
            File.Field.Type.UINT64 -> "uInt64"
        }
    protected val File.Field.Type.standardTypeName: Name
        get() = when (this) {
            File.Field.Type.BOOL -> Name("Boolean")
            File.Field.Type.BYTES -> Name("pbandk", "ByteArr")
            File.Field.Type.DOUBLE -> Name("Double")
            File.Field.Type.ENUM -> error("No standard type name for enums")
            File.Field.Type.FIXED32 -> Name("Int")
            File.Field.Type.FIXED64 -> Name("Long")
            File.Field.Type.FLOAT -> Name("Float")
            File.Field.Type.INT32 -> Name("Int")
            File.Field.Type.INT64 -> Name("Long")
            File.Field.Type.MESSAGE -> error("No standard type name for messages")
            File.Field.Type.SFIXED32 -> Name("Int")
            File.Field.Type.SFIXED64 -> Name("Long")
            File.Field.Type.SINT32 -> Name("Int")
            File.Field.Type.SINT64 -> Name("Long")
            File.Field.Type.STRING -> Name("String")
            File.Field.Type.UINT32 -> Name("Int")
            File.Field.Type.UINT64 -> Name("Long")
        }
    protected val File.Field.Type.defaultValue: String
        get() = when (this) {
            File.Field.Type.BOOL -> "false"
            File.Field.Type.BYTES -> "pbandk.ByteArr.empty"
            File.Field.Type.DOUBLE -> "0.0"
            File.Field.Type.ENUM -> error("No generic default value for enums")
            File.Field.Type.FIXED32, File.Field.Type.INT32, File.Field.Type.SFIXED32,
            File.Field.Type.SINT32, File.Field.Type.UINT32 -> "0"
            File.Field.Type.FIXED64, File.Field.Type.INT64, File.Field.Type.SFIXED64,
            File.Field.Type.SINT64, File.Field.Type.UINT64 -> "0L"
            File.Field.Type.FLOAT -> "0.0F"
            File.Field.Type.MESSAGE -> "null"
            File.Field.Type.STRING -> "\"\""
        }
    protected val File.Field.Type.wrapperKotlinTypeName: Name
        get() = kotlinTypeMappings[wrapperTypeName.fullWithPackage] ?: error("No Kotlin type found for wrapper")


    private fun generateFieldDescriptorConstructorValues(
        field: File.Field.Numbered,
        typeName: Name,
        oneof: File.Field.OneOf?,
        messageDescriptorCompanion: String
    ) {
        if (field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
        line("pbandk.FieldDescriptor.${field.descriptorFactoryMethod(oneof != null)}(").indented {
            line("messageDescriptor = ${messageDescriptorCompanion},")
            line("name = \"${field.name.simple}\",")
            line("number = ${field.number},")
            line("type = ${field.fieldDescriptorTypeType(oneof != null)},")
            field.jsonName?.let { line("jsonName = \"$it\",") }
            generateFieldOptions(field.options)
            line("value = ${typeName.fullWithPackage}::${field.kotlinName.simple},")
            line("mutableValue = ${typeName.mutableTypeName.fullWithPackage}::${field.kotlinName.simple},")
        }.line(")")
    }

    private fun generateOneofDescriptorConstructorValues(
        field: File.Field.OneOf,
        typeName: Name,
        messageDescriptorCompanion: String
    ) {
        line("pbandk.OneofDescriptor.of(").indented {
            line("messageDescriptor = ${messageDescriptorCompanion},")
            line("name = \"${field.name.simple}\",")
            line("value = ${typeName.fullWithPackage}::${field.kotlinName.simple},")
            line("mutableValue = ${typeName.mutableTypeName.fullWithPackage}::${field.kotlinName.simple},")
            line("fields = listOf(").indented {
                field.fields.forEach {
                    line("${it.descriptorName.simple},")
                }
            }.line(")")
        }.line(")")
    }

    private fun addDeprecatedAnnotation(field: File.Field) {
        when (field) {
            is File.Field.Numbered -> if (field.options.deprecated == true) line("@Deprecated(message = \"Field marked deprecated in ${file.name}\")")
            is File.Field.OneOf -> {
                // oneof fields do not support the `deprecated` protobuf option
            }
        }
    }
}

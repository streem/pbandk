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
        line("@file:Suppress(\"RemoveRedundantQualifierName\", \"RedundantVisibilityModifier\")")
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

    protected fun writeExtension(field: File.Field.Numbered) {
        line()
        addDeprecatedAnnotation(field)
        lineBegin("$visibility val ${field.extendeeKotlinType!!.fullWithPackage}.${field.kotlinName.simple}: ")
        lineEnd(field.kotlinValueType(nullableIfMessage = true)).indented {
            line("get() = ${field.descriptorName.fullWithPackage}.getValue(this)")
        }

        line()
        addDeprecatedAnnotation(field)
        lineBegin("$visibility ${field.mutablePropertyDeclaration}")
        lineMid(" ${field.extendeeKotlinType!!.mutableTypeName.fullWithPackage}.${field.kotlinName.simple}: ")
        lineEnd(field.kotlinValueType(nullableIfMessage = true, mutable = true)).indented {
            val getValueMethod = if (field.repeated) "getMutableValue" else "getValue"
            line("get() = ${field.descriptorName.fullWithPackage}.${getValueMethod}(this)")
            if (field.mutablePropertyDeclaration == "var") {
                line("set(value) = ${field.descriptorName.fullWithPackage}.setValue(this, value)")
            }
        }

        line().line("@pbandk.Export")
        writeExtensionFieldDescriptor(field)
    }

    protected fun writeExtensionFieldDescriptor(field: File.Field.Numbered) {
        addDeprecatedAnnotation(field)
        line("$visibility val ${field.descriptorName.simple}: ${field.fieldDescriptorType(field.extendeeKotlinType!!)} = ").indented {
            generateFieldDescriptorConstructor(field, field.extendeeKotlinType!!)
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
        // TODO: temporarily disabled because interfaces can't be exported in Kotlin 1.5. This can be reenabled after
        //  upgrading to Kotlin 1.6.20
        // Only mark top-level classes for export, internal classes will be exported transitively
//        if (type.kotlinName.parent == null) line("@pbandk.Export")
        // Enums are sealed interfaces w/ a value and a name, and a companion object with all values
        line("$visibility sealed interface ${type.kotlinName.simple} : pbandk.Message.Enum {").indented {
            // """ (override val value: Int, override val name: String? = null) """
            line("override val descriptor: pbandk.EnumDescriptor<${type.kotlinName.fullWithPackage}>").indented {
                line("get() = ${type.kotlinName.fullWithPackage}.descriptor")
            }
            line()
            type.values.forEach {
                lineBegin("$visibility object ${it.kotlinName} : ${type.kotlinName.simple}, ")
                lineEnd("pbandk.gen.GeneratedEnumValue<${type.kotlinName.fullWithPackage}>(").indented {
                    line("value = ${it.number},")
                    line("name = \"${it.name}\",")
                }.line(")")
            }
            line("$visibility class UNRECOGNIZED(value: Int? = null, name: String? = null)").indented {
                line(": ${type.kotlinName.simple}, pbandk.gen.UnrecognizedEnumValue<${type.kotlinName.fullWithPackage}>(value, name)")
                // TODO: maybe
                // line("public companion object : pbandk.gen.UnrecognizedEnumValue.Companion<UNRECOGNIZED>(::UNRECOGNIZED)")
            }
            line()
            line("$visibility companion object : pbandk.Message.Enum.Companion<${type.kotlinName.fullWithPackage}> {").indented {
                writeEnumDescriptor(type)

                line("$visibility val values: List<${type.kotlinName.full}> by lazy(LazyThreadSafetyMode.PUBLICATION) {").indented {
                    val chunkedValues = type.values.chunked(5)
                    if (chunkedValues.size <= 1) {
                        line("listOf(${type.values.joinToString(", ") { it.kotlinName }})")
                    } else {
                        line("listOf(").indented {
                            chunkedValues.forEach { values ->
                                line(values.joinToString(", ", postfix = ",") { it.kotlinName })
                            }
                        }.line(")")
                    }
                }.line("}")
                line()
                line("override fun fromValue(value: Int): ${type.kotlinName.fullWithPackage} =").indented {
                    line("values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)")
                }
                line()
                line("override fun fromName(name: String): ${type.kotlinName.fullWithPackage} =").indented {
                    line("values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)")
                }
            }.line("}")
        }.line("}")
    }

    protected fun writeMessageType(type: File.Type.Message) {
        // There's no need to generate code for the messages that back every protobuf map field because those fields
        // all use `MapField.Entry` as their message class.
        if (type.mapEntry) return

        val messageInterface = if (type.isExtendable) {
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
            line(" * The [${mutableTypeName.full}] passed as a receiver to the [builderAction] is valid only inside that function.")
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
                // TODO: for messages containing 1 or more required fields, this should throw an exception rather than
                //  try to construct a default instance
                line("override val defaultInstance: ${type.kotlinName.fullWithPackage} by lazy(LazyThreadSafetyMode.PUBLICATION) {").indented {
                    line("${type.kotlinName.fullWithPackage} {}")
                }.line("}")
                line()
                writeMessageDescriptor(type)

                type.extensions.forEach {
                    // TODO: write extension field accessors
                    // Though maybe accessors shouldn't be nested inside the scope of the enclosing method since then
                    // they'd be hard to access?
                    line()
                    writeExtensionFieldDescriptor(it)
                }

                type.nestedTypes.filterIsInstance<File.Type.Message>()
                    .filterNot { it.mapEntry }
                    .forEach(::writeDeprecatedMessageBuilder)
            }.line("}")

            // Nested enums and types
            type.nestedTypes.forEach(::writeType)
        }.line("}")

        val mutableMessageInterface = if (type.isExtendable) {
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

        line("$visibility sealed interface ${oneOf.kotlinTypeName.simple}<V : kotlin.Any> : pbandk.Message.OneOf<V> {").indented {
            oneOf.fields.forEach { field ->
                addDeprecatedAnnotation(field)
                lineBegin("$visibility class ${oneOf.kotlinFieldNames[field.name.simple]!!.simple}(")
                lineMid("${field.kotlinName.simple}: ${field.kotlinValueType(false)}")
                if (field.type != File.Field.Type.MESSAGE) lineMid(" = ${field.defaultValue()}")
                lineEnd(") :").indented {
                    lineBegin("${oneOf.kotlinTypeName.simple}<${field.kotlinValueType(false)}>, ")
                    lineMid("pbandk.gen.GeneratedOneOf<${oneOf.kotlinTypeName.parent!!.fullWithPackage}, ${field.kotlinValueType(false)}>(${field.kotlinName.simple}, ")
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
                    lineEnd(" =").indented {
                        generateFieldDescriptorConstructor(field, type.kotlinName, oneof)
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
                    lineEnd(" =").indented {
                        generateOneofDescriptorConstructor(
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
                                line("${field.descriptorName.simple} =").indented {
                                    generateFieldDescriptorConstructor(field, type.kotlinName, oneof)
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
                                lineEnd("${field.descriptorName.simple} =").indented {
                                    generateOneofDescriptorConstructor(
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

    protected fun writeEnumDescriptor(type: File.Type.Enum) {
        line("override val descriptor: pbandk.EnumDescriptor<${type.kotlinName.fullWithPackage}> =").indented {
            line("pbandk.EnumDescriptor.of(").indented {
                line("fullName = \"${type.name.fullWithPackage.removePrefix(".")}\",")
                line("enumClass = ${type.kotlinName.fullWithPackage}::class,")
                line("enumCompanion = this,")
            }.line(")")
        }
    }

    protected fun writeMessageDescriptor(type: File.Type.Message) {
        line("private val messageMetadata = pbandk.MessageMetadata(").indented {
            line("fullName = \"${type.name.fullWithPackage.removePrefix(".")}\",")
        }.line(")")
        line()

        // Messages can have circular references to each other (e.g. `pbandk.wkt.Struct` includes a `pbandk.wkt.Value`
        // field, but `pbandk.wkt.Value` includes a `pbandk.wkt.Struct` field). On Kotlin/Native the companion object
        // (e.g. `pbandk.wkt.Value.Companion`) is automatically frozen because it's a singleton. But Kotlin/Native
        // doesn't allow cyclic frozen structures:
        // https://kotlinlang.org/docs/reference/native/concurrency.html#global-variables-and-singletons. In order to
        // break the circular references, `descriptor` needs to be a `lazy` field.
        //
        // Do not use `LazyThreadSafetyMode.PUBLICATION` for this value because we have code in the runtime library
        // that depends on the `descriptor` instance for any given message type being a singleton (e.g. in some of the
        // methods of `GeneratedMessage`).
        line("override val descriptor: pbandk.MessageDescriptor<${type.kotlinName.fullWithPackage}> by lazy {").indented {
            val builderName = type.kotlinName.builderName
            val (oneofFields, nonOneofFields) = type.fields.partition { it is File.Field.OneOf }

            line("pbandk.MessageDescriptor.of(").indented {
                line("metadata = messageMetadata,")
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
        if (fieldOptions.deprecated != null || fieldOptions.packed != null || fieldOptions.unknownFields.isNotEmpty()) {
            line("options = pbandk.wkt.FieldOptions {").indented {
                fieldOptions.deprecated?.let {
                    line("deprecated = $it")
                }
                fieldOptions.packed?.let {
                    line("packed = $it")
                }
                if (fieldOptions.unknownFields.isNotEmpty()) {
                    generateUnknownFields(fieldOptions.unknownFields)
                }
            }.line("},")
        }
    }

    private fun generateUnknownFields(unknownFields: Map<Int, UnknownField>) {
        // TODO: update this to work with new WireValue representation
        return
        line("unknownFields += mapOf(").indented {
            unknownFields.values.forEach { field ->
                line("${field.fieldNum} to pbandk.UnknownField(").indented {
                    line("fieldNum = ${field.fieldNum},")
                    line("values = listOf(").indented {
                        field.values.forEach { value ->
                            lineBegin("pbandk.UnknownField.Value(")
//                            lineMid("wireType = ${value.wireType}, ")
                            lineMid("wireValue = , ")
                            // lineMid("rawBytes = byteArrayOf(${value.rawBytes.array.joinToString()})")
                            lineEnd("),")
                        }
                    }.line(")")
                }.line("),")
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

    protected fun writeDeprecatedMessageBuilder(type: File.Type.Message) {
        // When there are too many fields, the constructor-style method with default values for each field can cause
        // heap exhaustion in the Kotlin compiler (at least as of Kotlin 1.5.32). So we only generate this method when
        // the number of fields is manageable. Since this method is deprecated anyways, the only impact of this is that
        // a small set of users will need to migrate to the new builder-style API sooner.
        if (type.fields.size < 500) {
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
            line("$visibility fun ${type.kotlinName.simple}(").indented {
                type.fields.forEach { field ->
                    lineBegin("${field.kotlinName.simple}: ")
                    when (field) {
                        is File.Field.Numbered -> lineMid(field.kotlinValueType(true))
                        is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                    }
                    lineEnd(" = ${field.defaultValue()},")
                }
                line("unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()")
            }.line("): ${type.kotlinName.fullWithPackage} = ${type.kotlinName.fullWithPackage} {").indented {
                type.fields.forEach { field ->
                    if (field is File.Field.Numbered && field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
                    line(field.builderSetter())
                }
                line("this.unknownFields += unknownFields")
            }.line("}")
        }
    }

    protected fun writeMessageBuilder(type: File.Type.Message) {
        // When the message is nested in another message, the deprecated builder method will get included inside the
        // parent's companion object rather than being defined at the top level.
        if (type.kotlinName.parent == null) {
            writeDeprecatedMessageBuilder(type)
        }

        val builderName = type.kotlinName.builderName
        val mutableTypeName = type.kotlinName.mutableTypeName

        line()
        line("/**")
        line(" * The [${mutableTypeName.full}] passed as a receiver to the [builderAction] is valid only inside that function.")
        line(" * Using it outside of the function produces an unspecified behavior.")
        line(" */")
        line("@pbandk.Export")
        line("@pbandk.JsName(\"build${type.kotlinName.full.replace(".", "")}\")")
        line("$visibility fun ${builderName.full}(builderAction: ${mutableTypeName.fullWithPackage}.() -> Unit): ${type.kotlinName.fullWithPackage} =").indented {
            line("${type.kotlinName.mutableImplName.fullWithPackage}(").indented {
                type.fields.forEach { field -> line("${field.kotlinName.simple} = ${field.defaultValue(mutable = true)},") }
            }.line(").also(builderAction).to${type.kotlinName.simple}()")
        }

        type.kotlinName.parent?.let { parent ->
            val mutableParentName = parent.copy(simple = "Mutable${parent.simple}")
            val nestedBuilderName = Name(parent = mutableParentName, simple = type.kotlinName.simple)
            line()
            line("/**")
            line(" * The [${mutableTypeName.full}] passed as a receiver to the [builderAction] is valid only inside that function.")
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

        val generatedMessageClass = if (type.isExtendable) {
            "pbandk.gen.GeneratedExtendableMessage<${type.kotlinName.fullWithPackage}>(extensionFields, unknownFields)"
        } else {
            "pbandk.gen.GeneratedMessage<${type.kotlinName.fullWithPackage}>(unknownFields)"
        }

        line().line("private class ${implName.simple}(").indented {
            type.fields.forEach { field ->
                addDeprecatedAnnotation(field)
                lineBegin("override val ${field.kotlinName.simple}: ")
                when (field) {
                    is File.Field.Numbered -> lineMid(
                        field.kotlinValueType(nullableIfMessage = true, mutable = false, impl = true)
                    )
                    is File.Field.OneOf -> lineMid("${field.kotlinTypeName.fullWithPackage}<*>?")
                }
                lineEnd(",")
            }
            if (type.isExtendable) {
                line("extensionFields: pbandk.FieldSet<${type.kotlinName.fullWithPackage}>,")
            }
            // The unknown fields
            line("unknownFields: Map<Int, pbandk.UnknownField>")
        }.line(") : ${type.kotlinName.fullWithPackage}, $generatedMessageClass {").indented {
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

        val mutableGeneratedMessageClass = if (type.isExtendable) {
            "pbandk.gen.MutableGeneratedExtendableMessage<${type.kotlinName.fullWithPackage}>"
        } else {
            "pbandk.gen.MutableGeneratedMessage<${type.kotlinName.fullWithPackage}>"
        }

        line().line("private class ${type.kotlinName.mutableImplName.simple}(").indented {
            type.fields.forEach { field ->
                addDeprecatedAnnotation(field)
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

            line()
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
                if (type.isExtendable) {
                    line("extensionFields = extensionFields.toFieldSet(),")
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
                is File.Field.Numbered -> listOf(it to null)
                is File.Field.OneOf -> it.fields.map { f -> f to it }
            }
        }.sortedBy { it.first.number }

    protected val File.Type.Message.mapEntryKeyField: File.Field.Numbered?
        get() = if (!mapEntry) null else (fields[0] as File.Field.Numbered)
    protected val File.Type.Message.mapEntryValueField: File.Field.Numbered?
        get() = if (!mapEntry) null else (fields[1] as File.Field.Numbered)
    protected val File.Type.Message.mapEntryKeyKotlinType: String?
        get() = if (!mapEntry) null else (fields[0] as File.Field.Numbered).kotlinValueType(false)
    protected val File.Type.Message.mapEntryValueKotlinType: String?
        get() = if (!mapEntry) null else (fields[1] as File.Field.Numbered).kotlinValueType(false)

    protected val File.Type.Message.isExtendable: Boolean get() = extensionRange.isNotEmpty()

    protected fun File.Field.defaultValue(mutable: Boolean = false): String = when (this) {
        is File.Field.Numbered -> defaultValue(mutable)
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

    protected val File.Field.descriptorName: Name
        get() =
            kotlinName.parent?.let { Name(Name(it, "FieldDescriptors"), kotlinName.simple) } ?: kotlinName

    protected val File.Field.Numbered.hasPresence: Boolean
        get() = when (this) {
            is File.Field.Numbered.Standard -> optional
            is File.Field.Numbered.Wrapper -> !repeated
        }

    protected val File.Field.Numbered.kotlinQualifiedTypeName: String
        get() = when (this) {
            is File.Field.Numbered.Standard -> kotlinLocalTypeName
                ?: localTypeName?.let { kotlinTypeMappings.getOrElse(it) { error("Unable to find mapping for $it") } }?.fullWithPackage
                ?: type.standardTypeName.fullWithPackage

            is File.Field.Numbered.Wrapper -> wrappedKotlinType.fullWithPackage
        }

    protected fun File.Field.Numbered.kotlinValueType(
        nullableIfMessage: Boolean,
        mutable: Boolean = false,
        impl: Boolean = false
    ): String = when {
        this is File.Field.Numbered.Standard && map -> mapEntry()!!.let {
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

        (hasPresence || type == File.Field.Type.MESSAGE) && nullableIfMessage ->
            "$kotlinQualifiedTypeName?"

        else -> kotlinQualifiedTypeName
    }

    protected val File.Field.Numbered.extendeeKotlinType: Name?
        get() = extendee?.let { kotlinTypeMappings[it] }

    protected fun File.Field.Numbered.fieldDescriptorType(typeName: Name, isOneOfMember: Boolean = false): String {
        val fieldValueType = if (isOneOfMember) {
            "${kotlinValueType(false)}?"
        } else {
            kotlinValueType(true)
        }
        return buildString {
            append("pbandk.FieldDescriptor")
            if (repeated) append(".MutableValue")
            append("<${typeName.fullWithPackage}, $fieldValueType")
            if (repeated) append(", ${kotlinValueType(nullableIfMessage = false, mutable = true)}")
            append(">")
        }
    }

    protected fun File.Field.Numbered.valueType(parentType: Name): String = buildString {
        when (this@valueType) {
            is File.Field.Numbered.Wrapper -> {
                append("pbandk.types.")
                append(this@valueType.localTypeName.substringAfterLast('.').replaceFirstChar { it.lowercase() })
                append("()")
            }

            is File.Field.Numbered.Standard -> {
                append("pbandk.types.")
                append(type.string)
                append('(')

                when (this@valueType.type) {
                    File.Field.Type.MESSAGE, File.Field.Type.ENUM -> {
                        append(kotlinQualifiedTypeName)
                        generateSequence(parentType) { it.parent }
                            .firstOrNull { kotlinQualifiedTypeName == it.fullWithPackage }
                            ?.let {
                                append(", recursive = true")
                            }
                    }

                    else -> {}
                }

                append(')')
            }
        }
    }

    protected fun File.Field.Numbered.descriptorFactoryMethod(isOneOfMember: Boolean = false): String = when {
        this is File.Field.Numbered.Standard && map -> "pbandk.FieldDescriptor.ofMap"
        extendee != null -> if (repeated) {
            "pbandk.FieldDescriptor.ofRepeatedExtension"
        } else {
            "pbandk.FieldDescriptor.ofExtension"
        }

        repeated -> "pbandk.FieldDescriptor.ofRepeated"
        isOneOfMember -> "pbandk.FieldDescriptor.ofOneof"
        hasPresence || type == File.Field.Type.MESSAGE -> "pbandk.FieldDescriptor.ofOptional"
        else -> "pbandk.FieldDescriptor.ofSingular"
    }

    protected fun File.Field.Numbered.defaultValue(mutable: Boolean = false): String = when {
        this is File.Field.Numbered.Standard && map -> if (mutable) {
            "pbandk.gen.MutableMapField(${descriptorName.fullWithPackage})"
        } else {
            "emptyMap()"
        }

        repeated -> if (mutable) "pbandk.gen.MutableListField(${descriptorName.fullWithPackage})" else "emptyList()"
        hasPresence -> "null"
        type == File.Field.Type.ENUM -> "$kotlinQualifiedTypeName.fromValue(0)"
        else -> type.defaultValue
    }

    protected fun File.Field.Numbered.Standard.mapEntry(): File.Type.Message? =
        if (!map) null else (localTypeName?.let { findLocalType(it) } as? File.Type.Message)?.takeIf { it.mapEntry }

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
            File.Field.Type.SFIXED32 -> "sfixed32"
            File.Field.Type.SFIXED64 -> "sfixed64"
            File.Field.Type.SINT32 -> "sint32"
            File.Field.Type.SINT64 -> "sint64"
            File.Field.Type.STRING -> "string"
            File.Field.Type.UINT32 -> "uint32"
            File.Field.Type.UINT64 -> "uint64"
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

    private fun generateFieldDescriptorConstructor(
        field: File.Field.Numbered,
        typeName: Name,
        oneof: File.Field.OneOf? = null,
    ) {
        require(!(oneof != null && field.extendee != null)) { "extension fields can't be in a oneof" }

        if (field.options.deprecated == true) line("@Suppress(\"DEPRECATION\")")
        line("${field.descriptorFactoryMethod(oneof != null)}(").indented {
            line("messageDescriptor = ${typeName.fullWithPackage}::descriptor,")
            if (field.extendee != null) {
                line("fullName = \"${field.name.fullWithPackage.removePrefix(".")}\",")
            } else {
                line("messageMetadata = ${typeName.fullWithPackage}.messageMetadata,")
                line("name = \"${field.name.simple}\",")
            }
            line("number = ${field.number},")
            if (field is File.Field.Numbered.Standard && field.map) {
                val mapEntry = field.mapEntry()!!
                line("keyType = ${mapEntry.mapEntryKeyField!!.valueType(typeName)},")
                line("valueType = ${mapEntry.mapEntryValueField!!.valueType(typeName)},")
            } else {
                line("valueType = ${field.valueType(typeName)},")
            }
            line("jsonName = \"${field.jsonName}\",")
            generateFieldOptions(field.options)
            if (field.extendee == null) {
                line("value = ${typeName.fullWithPackage}::${field.kotlinName.simple},")
                line("mutableValue = ${typeName.mutableTypeName.fullWithPackage}::${field.kotlinName.simple},")
            }
        }.line(")")
    }

    private fun generateOneofDescriptorConstructor(
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
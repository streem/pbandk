@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class FileDescriptorSet(
    val file: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorSet> {
        val defaultInstance by lazy { pbandk.wkt.FileDescriptorSet() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FileDescriptorSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorSet, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                        jsonName = "file",
                        value = pbandk.wkt.FileDescriptorSet::file
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FileDescriptorSet::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class FileDescriptorProto(
    val name: String? = null,
    val `package`: String? = null,
    val dependency: List<String> = emptyList(),
    val publicDependency: List<Int> = emptyList(),
    val weakDependency: List<Int> = emptyList(),
    val messageType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val options: pbandk.wkt.FileOptions? = null,
    val sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null,
    val syntax: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.FileDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FileDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, *>>(12).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.FileDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "package",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "package",
                        value = pbandk.wkt.FileDescriptorProto::`package`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dependency",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "dependency",
                        value = pbandk.wkt.FileDescriptorProto::dependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.Companion)),
                        jsonName = "messageType",
                        value = pbandk.wkt.FileDescriptorProto::messageType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumDescriptorProto.Companion)),
                        jsonName = "enumType",
                        value = pbandk.wkt.FileDescriptorProto::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "service",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.ServiceDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ServiceDescriptorProto.Companion)),
                        jsonName = "service",
                        value = pbandk.wkt.FileDescriptorProto::service
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldDescriptorProto.Companion)),
                        jsonName = "extension",
                        value = pbandk.wkt.FileDescriptorProto::extension
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.FileDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_code_info",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceCodeInfo.Companion),
                        jsonName = "sourceCodeInfo",
                        value = pbandk.wkt.FileDescriptorProto::sourceCodeInfo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "public_dependency",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "publicDependency",
                        value = pbandk.wkt.FileDescriptorProto::publicDependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "weak_dependency",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "weakDependency",
                        value = pbandk.wkt.FileDescriptorProto::weakDependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "syntax",
                        value = pbandk.wkt.FileDescriptorProto::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FileDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class DescriptorProto(
    val name: String? = null,
    val field: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    val nestedType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    val enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList(),
    val oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = emptyList(),
    val options: pbandk.wkt.MessageOptions? = null,
    val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.DescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.DescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto, *>>(10).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.DescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldDescriptorProto.Companion)),
                        jsonName = "field",
                        value = pbandk.wkt.DescriptorProto::field
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nested_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.Companion)),
                        jsonName = "nestedType",
                        value = pbandk.wkt.DescriptorProto::nestedType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumDescriptorProto.Companion)),
                        jsonName = "enumType",
                        value = pbandk.wkt.DescriptorProto::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension_range",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto.ExtensionRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.ExtensionRange.Companion)),
                        jsonName = "extensionRange",
                        value = pbandk.wkt.DescriptorProto::extensionRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldDescriptorProto.Companion)),
                        jsonName = "extension",
                        value = pbandk.wkt.DescriptorProto::extension
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.MessageOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.DescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_decl",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.OneofDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.OneofDescriptorProto.Companion)),
                        jsonName = "oneofDecl",
                        value = pbandk.wkt.DescriptorProto::oneofDecl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_range",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.DescriptorProto.ReservedRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DescriptorProto.ReservedRange.Companion)),
                        jsonName = "reservedRange",
                        value = pbandk.wkt.DescriptorProto::reservedRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "reservedName",
                        value = pbandk.wkt.DescriptorProto::reservedName
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.DescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class ExtensionRange(
        val start: Int? = null,
        val end: Int? = null,
        val options: pbandk.wkt.ExtensionRangeOptions? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange> {
            val defaultInstance by lazy { pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange, *>>(3).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange::end
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "options",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ExtensionRangeOptions.Companion),
                            jsonName = "options",
                            value = pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange::options
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.pbandk.wkt.DescriptorProto.ExtensionRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    data class ReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange> {
            val defaultInstance by lazy { pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.pbandk.wkt.DescriptorProto.ReservedRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class ExtensionRangeOptions(
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.ExtensionRangeOptions> {
        val defaultInstance by lazy { pbandk.wkt.ExtensionRangeOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.ExtensionRangeOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.ExtensionRangeOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.ExtensionRangeOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class FieldDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val label: pbandk.wkt.FieldDescriptorProto.Label? = null,
    val type: pbandk.wkt.FieldDescriptorProto.Type? = null,
    val typeName: String? = null,
    val extendee: String? = null,
    val defaultValue: String? = null,
    val oneofIndex: Int? = null,
    val jsonName: String? = null,
    val options: pbandk.wkt.FieldOptions? = null,
    val proto3Optional: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.FieldDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.FieldDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FieldDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, *>>(11).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.FieldDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extendee",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "extendee",
                        value = pbandk.wkt.FieldDescriptorProto::extendee
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "number",
                        value = pbandk.wkt.FieldDescriptorProto::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "label",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldDescriptorProto.Label.Companion, hasPresence = true),
                        jsonName = "label",
                        value = pbandk.wkt.FieldDescriptorProto::label
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldDescriptorProto.Type.Companion, hasPresence = true),
                        jsonName = "type",
                        value = pbandk.wkt.FieldDescriptorProto::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_name",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "typeName",
                        value = pbandk.wkt.FieldDescriptorProto::typeName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "default_value",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "defaultValue",
                        value = pbandk.wkt.FieldDescriptorProto::defaultValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.FieldDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_index",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "oneofIndex",
                        value = pbandk.wkt.FieldDescriptorProto::oneofIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "jsonName",
                        value = pbandk.wkt.FieldDescriptorProto::jsonName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto3_optional",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "proto3Optional",
                        value = pbandk.wkt.FieldDescriptorProto::proto3Optional
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FieldDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class Type(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.wkt.FieldDescriptorProto.Type && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "pbandk.wkt.FieldDescriptorProto.Type.${name ?: "UNRECOGNIZED"}(value=$value)"

        object DOUBLE : Type(1, "TYPE_DOUBLE")
        object FLOAT : Type(2, "TYPE_FLOAT")
        object INT64 : Type(3, "TYPE_INT64")
        object UINT64 : Type(4, "TYPE_UINT64")
        object INT32 : Type(5, "TYPE_INT32")
        object FIXED64 : Type(6, "TYPE_FIXED64")
        object FIXED32 : Type(7, "TYPE_FIXED32")
        object BOOL : Type(8, "TYPE_BOOL")
        object STRING : Type(9, "TYPE_STRING")
        object GROUP : Type(10, "TYPE_GROUP")
        object MESSAGE : Type(11, "TYPE_MESSAGE")
        object BYTES : Type(12, "TYPE_BYTES")
        object UINT32 : Type(13, "TYPE_UINT32")
        object ENUM : Type(14, "TYPE_ENUM")
        object SFIXED32 : Type(15, "TYPE_SFIXED32")
        object SFIXED64 : Type(16, "TYPE_SFIXED64")
        object SINT32 : Type(17, "TYPE_SINT32")
        object SINT64 : Type(18, "TYPE_SINT64")
        class UNRECOGNIZED(value: Int) : pbandk.wkt.FieldDescriptorProto.Type(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Type> {
            val values: List<pbandk.wkt.FieldDescriptorProto.Type> by lazy { listOf(DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Type with name: $name")
        }
    }

    sealed class Label(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.wkt.FieldDescriptorProto.Label && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "pbandk.wkt.FieldDescriptorProto.Label.${name ?: "UNRECOGNIZED"}(value=$value)"

        object OPTIONAL : Label(1, "LABEL_OPTIONAL")
        object REQUIRED : Label(2, "LABEL_REQUIRED")
        object REPEATED : Label(3, "LABEL_REPEATED")
        class UNRECOGNIZED(value: Int) : pbandk.wkt.FieldDescriptorProto.Label(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Label> {
            val values: List<pbandk.wkt.FieldDescriptorProto.Label> by lazy { listOf(OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Label with name: $name")
        }
    }
}

data class OneofDescriptorProto(
    val name: String? = null,
    val options: pbandk.wkt.OneofOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.OneofDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.OneofDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.OneofDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.OneofDescriptorProto, *>>(2).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.OneofDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.OneofOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.OneofDescriptorProto::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.OneofDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class EnumDescriptorProto(
    val name: String? = null,
    val value: List<pbandk.wkt.EnumValueDescriptorProto> = emptyList(),
    val options: pbandk.wkt.EnumOptions? = null,
    val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.EnumDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.EnumDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto, *>>(5).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.EnumDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumValueDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumValueDescriptorProto.Companion)),
                        jsonName = "value",
                        value = pbandk.wkt.EnumDescriptorProto::value
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.EnumDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_range",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.Companion)),
                        jsonName = "reservedRange",
                        value = pbandk.wkt.EnumDescriptorProto::reservedRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_name",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "reservedName",
                        value = pbandk.wkt.EnumDescriptorProto::reservedName
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.EnumDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class EnumReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange> {
            val defaultInstance by lazy { pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.pbandk.wkt.EnumDescriptorProto.EnumReservedRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class EnumValueDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val options: pbandk.wkt.EnumValueOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.EnumValueDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.EnumValueDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumValueDescriptorProto, *>>(3).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.EnumValueDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "number",
                        value = pbandk.wkt.EnumValueDescriptorProto::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.EnumValueOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.EnumValueDescriptorProto::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.EnumValueDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class ServiceDescriptorProto(
    val name: String? = null,
    val method: List<pbandk.wkt.MethodDescriptorProto> = emptyList(),
    val options: pbandk.wkt.ServiceOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.ServiceDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.ServiceDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.ServiceDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ServiceDescriptorProto, *>>(3).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.ServiceDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "method",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.MethodDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.MethodDescriptorProto.Companion)),
                        jsonName = "method",
                        value = pbandk.wkt.ServiceDescriptorProto::method
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ServiceOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.ServiceDescriptorProto::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.ServiceDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class MethodDescriptorProto(
    val name: String? = null,
    val inputType: String? = null,
    val outputType: String? = null,
    val options: pbandk.wkt.MethodOptions? = null,
    val clientStreaming: Boolean? = null,
    val serverStreaming: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.MethodDescriptorProto> {
        val defaultInstance by lazy { pbandk.wkt.MethodDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.MethodDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, *>>(6).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = pbandk.wkt.MethodDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "input_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "inputType",
                        value = pbandk.wkt.MethodDescriptorProto::inputType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "output_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "outputType",
                        value = pbandk.wkt.MethodDescriptorProto::outputType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.MethodOptions.Companion),
                        jsonName = "options",
                        value = pbandk.wkt.MethodDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "client_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "clientStreaming",
                        value = pbandk.wkt.MethodDescriptorProto::clientStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "server_streaming",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "serverStreaming",
                        value = pbandk.wkt.MethodDescriptorProto::serverStreaming
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.MethodDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class FileOptions(
    val javaPackage: String? = null,
    val javaOuterClassname: String? = null,
    val javaMultipleFiles: Boolean? = null,
    val javaGenerateEqualsAndHash: Boolean? = null,
    val javaStringCheckUtf8: Boolean? = null,
    val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null,
    val goPackage: String? = null,
    val ccGenericServices: Boolean? = null,
    val javaGenericServices: Boolean? = null,
    val pyGenericServices: Boolean? = null,
    val phpGenericServices: Boolean? = null,
    val deprecated: Boolean? = null,
    val ccEnableArenas: Boolean? = null,
    val objcClassPrefix: String? = null,
    val csharpNamespace: String? = null,
    val swiftPrefix: String? = null,
    val phpClassPrefix: String? = null,
    val phpNamespace: String? = null,
    val phpMetadataNamespace: String? = null,
    val rubyPackage: String? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.FileOptions> {
        val defaultInstance by lazy { pbandk.wkt.FileOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FileOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FileOptions, *>>(21).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_package",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "javaPackage",
                        value = pbandk.wkt.FileOptions::javaPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_outer_classname",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "javaOuterClassname",
                        value = pbandk.wkt.FileOptions::javaOuterClassname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optimize_for",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FileOptions.OptimizeMode.Companion, hasPresence = true),
                        jsonName = "optimizeFor",
                        value = pbandk.wkt.FileOptions::optimizeFor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_multiple_files",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaMultipleFiles",
                        value = pbandk.wkt.FileOptions::javaMultipleFiles
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "go_package",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "goPackage",
                        value = pbandk.wkt.FileOptions::goPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cc_generic_services",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ccGenericServices",
                        value = pbandk.wkt.FileOptions::ccGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generic_services",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenericServices",
                        value = pbandk.wkt.FileOptions::javaGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "py_generic_services",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "pyGenericServices",
                        value = pbandk.wkt.FileOptions::pyGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generate_equals_and_hash",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenerateEqualsAndHash",
                        value = pbandk.wkt.FileOptions::javaGenerateEqualsAndHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.FileOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_string_check_utf8",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaStringCheckUtf8",
                        value = pbandk.wkt.FileOptions::javaStringCheckUtf8
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cc_enable_arenas",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ccEnableArenas",
                        value = pbandk.wkt.FileOptions::ccEnableArenas
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "objc_class_prefix",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "objcClassPrefix",
                        value = pbandk.wkt.FileOptions::objcClassPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "csharp_namespace",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "csharpNamespace",
                        value = pbandk.wkt.FileOptions::csharpNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "swift_prefix",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "swiftPrefix",
                        value = pbandk.wkt.FileOptions::swiftPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_class_prefix",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpClassPrefix",
                        value = pbandk.wkt.FileOptions::phpClassPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_namespace",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpNamespace",
                        value = pbandk.wkt.FileOptions::phpNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_generic_services",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "phpGenericServices",
                        value = pbandk.wkt.FileOptions::phpGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_metadata_namespace",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpMetadataNamespace",
                        value = pbandk.wkt.FileOptions::phpMetadataNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruby_package",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "rubyPackage",
                        value = pbandk.wkt.FileOptions::rubyPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.FileOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FileOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class OptimizeMode(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.wkt.FileOptions.OptimizeMode && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "pbandk.wkt.FileOptions.OptimizeMode.${name ?: "UNRECOGNIZED"}(value=$value)"

        object SPEED : OptimizeMode(1, "SPEED")
        object CODE_SIZE : OptimizeMode(2, "CODE_SIZE")
        object LITE_RUNTIME : OptimizeMode(3, "LITE_RUNTIME")
        class UNRECOGNIZED(value: Int) : pbandk.wkt.FileOptions.OptimizeMode(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FileOptions.OptimizeMode> {
            val values: List<pbandk.wkt.FileOptions.OptimizeMode> by lazy { listOf(SPEED, CODE_SIZE, LITE_RUNTIME) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptimizeMode with name: $name")
        }
    }
}

data class MessageOptions(
    val messageSetWireFormat: Boolean? = null,
    val noStandardDescriptorAccessor: Boolean? = null,
    val deprecated: Boolean? = null,
    val mapEntry: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.MessageOptions> {
        val defaultInstance by lazy { pbandk.wkt.MessageOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.MessageOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, *>>(5).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_set_wire_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "messageSetWireFormat",
                        value = pbandk.wkt.MessageOptions::messageSetWireFormat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "no_standard_descriptor_accessor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "noStandardDescriptorAccessor",
                        value = pbandk.wkt.MessageOptions::noStandardDescriptorAccessor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.MessageOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_entry",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "mapEntry",
                        value = pbandk.wkt.MessageOptions::mapEntry
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.MessageOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.MessageOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class FieldOptions(
    val ctype: pbandk.wkt.FieldOptions.CType? = null,
    val packed: Boolean? = null,
    val jstype: pbandk.wkt.FieldOptions.JSType? = null,
    val lazy: Boolean? = null,
    val deprecated: Boolean? = null,
    val weak: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions> {
        val defaultInstance by lazy { pbandk.wkt.FieldOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FieldOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, *>>(7).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ctype",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldOptions.CType.Companion, hasPresence = true),
                        jsonName = "ctype",
                        value = pbandk.wkt.FieldOptions::ctype
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "packed",
                        value = pbandk.wkt.FieldOptions::packed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.FieldOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lazy",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "lazy",
                        value = pbandk.wkt.FieldOptions::lazy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jstype",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.FieldOptions.JSType.Companion, hasPresence = true),
                        jsonName = "jstype",
                        value = pbandk.wkt.FieldOptions::jstype
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "weak",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "weak",
                        value = pbandk.wkt.FieldOptions::weak
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.FieldOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FieldOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class CType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.wkt.FieldOptions.CType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "pbandk.wkt.FieldOptions.CType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object STRING : CType(0, "STRING")
        object CORD : CType(1, "CORD")
        object STRING_PIECE : CType(2, "STRING_PIECE")
        class UNRECOGNIZED(value: Int) : pbandk.wkt.FieldOptions.CType(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.CType> {
            val values: List<pbandk.wkt.FieldOptions.CType> by lazy { listOf(STRING, CORD, STRING_PIECE) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No CType with name: $name")
        }
    }

    sealed class JSType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.wkt.FieldOptions.JSType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "pbandk.wkt.FieldOptions.JSType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object JS_NORMAL : JSType(0, "JS_NORMAL")
        object JS_STRING : JSType(1, "JS_STRING")
        object JS_NUMBER : JSType(2, "JS_NUMBER")
        class UNRECOGNIZED(value: Int) : pbandk.wkt.FieldOptions.JSType(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.JSType> {
            val values: List<pbandk.wkt.FieldOptions.JSType> by lazy { listOf(JS_NORMAL, JS_STRING, JS_NUMBER) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No JSType with name: $name")
        }
    }
}

data class OneofOptions(
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.OneofOptions> {
        val defaultInstance by lazy { pbandk.wkt.OneofOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.OneofOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.OneofOptions, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.OneofOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.OneofOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class EnumOptions(
    val allowAlias: Boolean? = null,
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.EnumOptions> {
        val defaultInstance by lazy { pbandk.wkt.EnumOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.EnumOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumOptions, *>>(3).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allow_alias",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "allowAlias",
                        value = pbandk.wkt.EnumOptions::allowAlias
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.EnumOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.EnumOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.EnumOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class EnumValueOptions(
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueOptions> {
        val defaultInstance by lazy { pbandk.wkt.EnumValueOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.EnumValueOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumValueOptions, *>>(2).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.EnumValueOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.EnumValueOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.EnumValueOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class ServiceOptions(
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.ServiceOptions> {
        val defaultInstance by lazy { pbandk.wkt.ServiceOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.ServiceOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ServiceOptions, *>>(2).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.ServiceOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.ServiceOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.ServiceOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class MethodOptions(
    val deprecated: Boolean? = null,
    val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null,
    val uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.MethodOptions> {
        val defaultInstance by lazy { pbandk.wkt.MethodOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.MethodOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.MethodOptions, *>>(3).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = pbandk.wkt.MethodOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "idempotency_level",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.MethodOptions.IdempotencyLevel.Companion, hasPresence = true),
                        jsonName = "idempotencyLevel",
                        value = pbandk.wkt.MethodOptions::idempotencyLevel
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = pbandk.wkt.MethodOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.MethodOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class IdempotencyLevel(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.wkt.MethodOptions.IdempotencyLevel && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "pbandk.wkt.MethodOptions.IdempotencyLevel.${name ?: "UNRECOGNIZED"}(value=$value)"

        object IDEMPOTENCY_UNKNOWN : IdempotencyLevel(0, "IDEMPOTENCY_UNKNOWN")
        object NO_SIDE_EFFECTS : IdempotencyLevel(1, "NO_SIDE_EFFECTS")
        object IDEMPOTENT : IdempotencyLevel(2, "IDEMPOTENT")
        class UNRECOGNIZED(value: Int) : pbandk.wkt.MethodOptions.IdempotencyLevel(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.wkt.MethodOptions.IdempotencyLevel> {
            val values: List<pbandk.wkt.MethodOptions.IdempotencyLevel> by lazy { listOf(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No IdempotencyLevel with name: $name")
        }
    }
}

data class UninterpretedOption(
    val name: List<pbandk.wkt.UninterpretedOption.NamePart> = emptyList(),
    val identifierValue: String? = null,
    val positiveIntValue: Long? = null,
    val negativeIntValue: Long? = null,
    val doubleValue: Double? = null,
    val stringValue: pbandk.ByteArr? = null,
    val aggregateValue: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption> {
        val defaultInstance by lazy { pbandk.wkt.UninterpretedOption() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.UninterpretedOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, *>>(7).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.UninterpretedOption.NamePart>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UninterpretedOption.NamePart.Companion)),
                        jsonName = "name",
                        value = pbandk.wkt.UninterpretedOption::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "identifier_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "identifierValue",
                        value = pbandk.wkt.UninterpretedOption::identifierValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "positive_int_value",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "positiveIntValue",
                        value = pbandk.wkt.UninterpretedOption::positiveIntValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "negative_int_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "negativeIntValue",
                        value = pbandk.wkt.UninterpretedOption::negativeIntValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "double_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "doubleValue",
                        value = pbandk.wkt.UninterpretedOption::doubleValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "stringValue",
                        value = pbandk.wkt.UninterpretedOption::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "aggregate_value",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "aggregateValue",
                        value = pbandk.wkt.UninterpretedOption::aggregateValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.UninterpretedOption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class NamePart(
        val namePart: String = "",
        val isExtension: Boolean = false,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart> {
            val defaultInstance by lazy { pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name_part",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "namePart",
                            value = pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart::namePart
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "is_extension",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                            jsonName = "isExtension",
                            value = pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart::isExtension
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.pbandk.wkt.UninterpretedOption.NamePart::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class SourceCodeInfo(
    val location: List<pbandk.wkt.SourceCodeInfo.Location> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo> {
        val defaultInstance by lazy { pbandk.wkt.SourceCodeInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.SourceCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.SourceCodeInfo, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.SourceCodeInfo.Location>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceCodeInfo.Location.Companion)),
                        jsonName = "location",
                        value = pbandk.wkt.SourceCodeInfo::location
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.SourceCodeInfo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class Location(
        val path: List<Int> = emptyList(),
        val span: List<Int> = emptyList(),
        val leadingComments: String? = null,
        val trailingComments: String? = null,
        val leadingDetachedComments: List<String> = emptyList(),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location> {
            val defaultInstance by lazy { pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location, *>>(5).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "span",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "span",
                            value = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location::span
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_comments",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "leadingComments",
                            value = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location::leadingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "trailing_comments",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "trailingComments",
                            value = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location::trailingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_detached_comments",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                            jsonName = "leadingDetachedComments",
                            value = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location::leadingDetachedComments
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.pbandk.wkt.SourceCodeInfo.Location::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class GeneratedCodeInfo(
    val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo> {
        val defaultInstance by lazy { pbandk.wkt.GeneratedCodeInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.GeneratedCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "annotation",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.GeneratedCodeInfo.Annotation>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.GeneratedCodeInfo.Annotation.Companion)),
                        jsonName = "annotation",
                        value = pbandk.wkt.GeneratedCodeInfo::annotation
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.GeneratedCodeInfo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class Annotation(
        val path: List<Int> = emptyList(),
        val sourceFile: String? = null,
        val begin: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation> {
            val defaultInstance by lazy { pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation, *>>(4).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "source_file",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "sourceFile",
                            value = pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation::sourceFile
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "begin",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "begin",
                            value = pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation::begin
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.pbandk.wkt.GeneratedCodeInfo.Annotation::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

fun FileDescriptorSet?.orDefault() = this ?: FileDescriptorSet.defaultInstance

private fun FileDescriptorSet.protoMergeImpl(plus: pbandk.Message?): FileDescriptorSet = (plus as? FileDescriptorSet)?.copy(
    file = file + plus.file,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileDescriptorSet {
    var file: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FileDescriptorProto> }
        }
    }
    return FileDescriptorSet(pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

fun FileDescriptorProto?.orDefault() = this ?: FileDescriptorProto.defaultInstance

private fun FileDescriptorProto.protoMergeImpl(plus: pbandk.Message?): FileDescriptorProto = (plus as? FileDescriptorProto)?.copy(
    name = plus.name ?: name,
    `package` = plus.`package` ?: `package`,
    dependency = dependency + plus.dependency,
    publicDependency = publicDependency + plus.publicDependency,
    weakDependency = weakDependency + plus.weakDependency,
    messageType = messageType + plus.messageType,
    enumType = enumType + plus.enumType,
    service = service + plus.service,
    extension = extension + plus.extension,
    options = options?.plus(plus.options) ?: plus.options,
    sourceCodeInfo = sourceCodeInfo?.plus(plus.sourceCodeInfo) ?: plus.sourceCodeInfo,
    syntax = plus.syntax ?: syntax,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileDescriptorProto {
    var name: String? = null
    var `package`: String? = null
    var dependency: pbandk.ListWithSize.Builder<String>? = null
    var publicDependency: pbandk.ListWithSize.Builder<Int>? = null
    var weakDependency: pbandk.ListWithSize.Builder<Int>? = null
    var messageType: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto>? = null
    var service: pbandk.ListWithSize.Builder<pbandk.wkt.ServiceDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var options: pbandk.wkt.FileOptions? = null
    var sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null
    var syntax: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> `package` = _fieldValue as String
            3 -> dependency = (dependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            4 -> messageType = (messageType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.DescriptorProto> }
            5 -> enumType = (enumType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.EnumDescriptorProto> }
            6 -> service = (service ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.ServiceDescriptorProto> }
            7 -> extension = (extension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FieldDescriptorProto> }
            8 -> options = _fieldValue as pbandk.wkt.FileOptions
            9 -> sourceCodeInfo = _fieldValue as pbandk.wkt.SourceCodeInfo
            10 -> publicDependency = (publicDependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            11 -> weakDependency = (weakDependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            12 -> syntax = _fieldValue as String
        }
    }
    return FileDescriptorProto(name, `package`, pbandk.ListWithSize.Builder.fixed(dependency), pbandk.ListWithSize.Builder.fixed(publicDependency),
        pbandk.ListWithSize.Builder.fixed(weakDependency), pbandk.ListWithSize.Builder.fixed(messageType), pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(service),
        pbandk.ListWithSize.Builder.fixed(extension), options, sourceCodeInfo, syntax, unknownFields)
}

fun DescriptorProto?.orDefault() = this ?: DescriptorProto.defaultInstance

private fun DescriptorProto.protoMergeImpl(plus: pbandk.Message?): DescriptorProto = (plus as? DescriptorProto)?.copy(
    name = plus.name ?: name,
    field = field + plus.field,
    extension = extension + plus.extension,
    nestedType = nestedType + plus.nestedType,
    enumType = enumType + plus.enumType,
    extensionRange = extensionRange + plus.extensionRange,
    oneofDecl = oneofDecl + plus.oneofDecl,
    options = options?.plus(plus.options) ?: plus.options,
    reservedRange = reservedRange + plus.reservedRange,
    reservedName = reservedName + plus.reservedName,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto {
    var name: String? = null
    var field: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<pbandk.wkt.FieldDescriptorProto>? = null
    var nestedType: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto>? = null
    var extensionRange: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto.ExtensionRange>? = null
    var oneofDecl: pbandk.ListWithSize.Builder<pbandk.wkt.OneofDescriptorProto>? = null
    var options: pbandk.wkt.MessageOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<pbandk.wkt.DescriptorProto.ReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> field = (field ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FieldDescriptorProto> }
            3 -> nestedType = (nestedType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.DescriptorProto> }
            4 -> enumType = (enumType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.EnumDescriptorProto> }
            5 -> extensionRange = (extensionRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.DescriptorProto.ExtensionRange> }
            6 -> extension = (extension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FieldDescriptorProto> }
            7 -> options = _fieldValue as pbandk.wkt.MessageOptions
            8 -> oneofDecl = (oneofDecl ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.OneofDescriptorProto> }
            9 -> reservedRange = (reservedRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.DescriptorProto.ReservedRange> }
            10 -> reservedName = (reservedName ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return DescriptorProto(name, pbandk.ListWithSize.Builder.fixed(field), pbandk.ListWithSize.Builder.fixed(extension), pbandk.ListWithSize.Builder.fixed(nestedType),
        pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(extensionRange), pbandk.ListWithSize.Builder.fixed(oneofDecl), options,
        pbandk.ListWithSize.Builder.fixed(reservedRange), pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

fun DescriptorProto.ExtensionRange?.orDefault() = this ?: DescriptorProto.ExtensionRange.defaultInstance

private fun DescriptorProto.ExtensionRange.protoMergeImpl(plus: pbandk.Message?): DescriptorProto.ExtensionRange = (plus as? DescriptorProto.ExtensionRange)?.copy(
    start = plus.start ?: start,
    end = plus.end ?: end,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ExtensionRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto.ExtensionRange {
    var start: Int? = null
    var end: Int? = null
    var options: pbandk.wkt.ExtensionRangeOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
            3 -> options = _fieldValue as pbandk.wkt.ExtensionRangeOptions
        }
    }
    return DescriptorProto.ExtensionRange(start, end, options, unknownFields)
}

fun DescriptorProto.ReservedRange?.orDefault() = this ?: DescriptorProto.ReservedRange.defaultInstance

private fun DescriptorProto.ReservedRange.protoMergeImpl(plus: pbandk.Message?): DescriptorProto.ReservedRange = (plus as? DescriptorProto.ReservedRange)?.copy(
    start = plus.start ?: start,
    end = plus.end ?: end,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ReservedRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto.ReservedRange {
    var start: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
        }
    }
    return DescriptorProto.ReservedRange(start, end, unknownFields)
}

fun ExtensionRangeOptions?.orDefault() = this ?: ExtensionRangeOptions.defaultInstance

private fun ExtensionRangeOptions.protoMergeImpl(plus: pbandk.Message?): ExtensionRangeOptions = (plus as? ExtensionRangeOptions)?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ExtensionRangeOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ExtensionRangeOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return ExtensionRangeOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun FieldDescriptorProto?.orDefault() = this ?: FieldDescriptorProto.defaultInstance

private fun FieldDescriptorProto.protoMergeImpl(plus: pbandk.Message?): FieldDescriptorProto = (plus as? FieldDescriptorProto)?.copy(
    name = plus.name ?: name,
    number = plus.number ?: number,
    label = plus.label ?: label,
    type = plus.type ?: type,
    typeName = plus.typeName ?: typeName,
    extendee = plus.extendee ?: extendee,
    defaultValue = plus.defaultValue ?: defaultValue,
    oneofIndex = plus.oneofIndex ?: oneofIndex,
    jsonName = plus.jsonName ?: jsonName,
    options = options?.plus(plus.options) ?: plus.options,
    proto3Optional = plus.proto3Optional ?: proto3Optional,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var label: pbandk.wkt.FieldDescriptorProto.Label? = null
    var type: pbandk.wkt.FieldDescriptorProto.Type? = null
    var typeName: String? = null
    var extendee: String? = null
    var defaultValue: String? = null
    var oneofIndex: Int? = null
    var jsonName: String? = null
    var options: pbandk.wkt.FieldOptions? = null
    var proto3Optional: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> extendee = _fieldValue as String
            3 -> number = _fieldValue as Int
            4 -> label = _fieldValue as pbandk.wkt.FieldDescriptorProto.Label
            5 -> type = _fieldValue as pbandk.wkt.FieldDescriptorProto.Type
            6 -> typeName = _fieldValue as String
            7 -> defaultValue = _fieldValue as String
            8 -> options = _fieldValue as pbandk.wkt.FieldOptions
            9 -> oneofIndex = _fieldValue as Int
            10 -> jsonName = _fieldValue as String
            17 -> proto3Optional = _fieldValue as Boolean
        }
    }
    return FieldDescriptorProto(name, number, label, type,
        typeName, extendee, defaultValue, oneofIndex,
        jsonName, options, proto3Optional, unknownFields)
}

fun OneofDescriptorProto?.orDefault() = this ?: OneofDescriptorProto.defaultInstance

private fun OneofDescriptorProto.protoMergeImpl(plus: pbandk.Message?): OneofDescriptorProto = (plus as? OneofDescriptorProto)?.copy(
    name = plus.name ?: name,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun OneofDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneofDescriptorProto {
    var name: String? = null
    var options: pbandk.wkt.OneofOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> options = _fieldValue as pbandk.wkt.OneofOptions
        }
    }
    return OneofDescriptorProto(name, options, unknownFields)
}

fun EnumDescriptorProto?.orDefault() = this ?: EnumDescriptorProto.defaultInstance

private fun EnumDescriptorProto.protoMergeImpl(plus: pbandk.Message?): EnumDescriptorProto = (plus as? EnumDescriptorProto)?.copy(
    name = plus.name ?: name,
    value = value + plus.value,
    options = options?.plus(plus.options) ?: plus.options,
    reservedRange = reservedRange + plus.reservedRange,
    reservedName = reservedName + plus.reservedName,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumDescriptorProto {
    var name: String? = null
    var value: pbandk.ListWithSize.Builder<pbandk.wkt.EnumValueDescriptorProto>? = null
    var options: pbandk.wkt.EnumOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> value = (value ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.EnumValueDescriptorProto> }
            3 -> options = _fieldValue as pbandk.wkt.EnumOptions
            4 -> reservedRange = (reservedRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> }
            5 -> reservedName = (reservedName ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return EnumDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(value), options, pbandk.ListWithSize.Builder.fixed(reservedRange),
        pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

fun EnumDescriptorProto.EnumReservedRange?.orDefault() = this ?: EnumDescriptorProto.EnumReservedRange.defaultInstance

private fun EnumDescriptorProto.EnumReservedRange.protoMergeImpl(plus: pbandk.Message?): EnumDescriptorProto.EnumReservedRange = (plus as? EnumDescriptorProto.EnumReservedRange)?.copy(
    start = plus.start ?: start,
    end = plus.end ?: end,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.EnumReservedRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumDescriptorProto.EnumReservedRange {
    var start: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
        }
    }
    return EnumDescriptorProto.EnumReservedRange(start, end, unknownFields)
}

fun EnumValueDescriptorProto?.orDefault() = this ?: EnumValueDescriptorProto.defaultInstance

private fun EnumValueDescriptorProto.protoMergeImpl(plus: pbandk.Message?): EnumValueDescriptorProto = (plus as? EnumValueDescriptorProto)?.copy(
    name = plus.name ?: name,
    number = plus.number ?: number,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValueDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValueDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var options: pbandk.wkt.EnumValueOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> number = _fieldValue as Int
            3 -> options = _fieldValue as pbandk.wkt.EnumValueOptions
        }
    }
    return EnumValueDescriptorProto(name, number, options, unknownFields)
}

fun ServiceDescriptorProto?.orDefault() = this ?: ServiceDescriptorProto.defaultInstance

private fun ServiceDescriptorProto.protoMergeImpl(plus: pbandk.Message?): ServiceDescriptorProto = (plus as? ServiceDescriptorProto)?.copy(
    name = plus.name ?: name,
    method = method + plus.method,
    options = options?.plus(plus.options) ?: plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceDescriptorProto {
    var name: String? = null
    var method: pbandk.ListWithSize.Builder<pbandk.wkt.MethodDescriptorProto>? = null
    var options: pbandk.wkt.ServiceOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> method = (method ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.MethodDescriptorProto> }
            3 -> options = _fieldValue as pbandk.wkt.ServiceOptions
        }
    }
    return ServiceDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(method), options, unknownFields)
}

fun MethodDescriptorProto?.orDefault() = this ?: MethodDescriptorProto.defaultInstance

private fun MethodDescriptorProto.protoMergeImpl(plus: pbandk.Message?): MethodDescriptorProto = (plus as? MethodDescriptorProto)?.copy(
    name = plus.name ?: name,
    inputType = plus.inputType ?: inputType,
    outputType = plus.outputType ?: outputType,
    options = options?.plus(plus.options) ?: plus.options,
    clientStreaming = plus.clientStreaming ?: clientStreaming,
    serverStreaming = plus.serverStreaming ?: serverStreaming,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MethodDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MethodDescriptorProto {
    var name: String? = null
    var inputType: String? = null
    var outputType: String? = null
    var options: pbandk.wkt.MethodOptions? = null
    var clientStreaming: Boolean? = null
    var serverStreaming: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> inputType = _fieldValue as String
            3 -> outputType = _fieldValue as String
            4 -> options = _fieldValue as pbandk.wkt.MethodOptions
            5 -> clientStreaming = _fieldValue as Boolean
            6 -> serverStreaming = _fieldValue as Boolean
        }
    }
    return MethodDescriptorProto(name, inputType, outputType, options,
        clientStreaming, serverStreaming, unknownFields)
}

fun FileOptions?.orDefault() = this ?: FileOptions.defaultInstance

private fun FileOptions.protoMergeImpl(plus: pbandk.Message?): FileOptions = (plus as? FileOptions)?.copy(
    javaPackage = plus.javaPackage ?: javaPackage,
    javaOuterClassname = plus.javaOuterClassname ?: javaOuterClassname,
    javaMultipleFiles = plus.javaMultipleFiles ?: javaMultipleFiles,
    javaGenerateEqualsAndHash = plus.javaGenerateEqualsAndHash ?: javaGenerateEqualsAndHash,
    javaStringCheckUtf8 = plus.javaStringCheckUtf8 ?: javaStringCheckUtf8,
    optimizeFor = plus.optimizeFor ?: optimizeFor,
    goPackage = plus.goPackage ?: goPackage,
    ccGenericServices = plus.ccGenericServices ?: ccGenericServices,
    javaGenericServices = plus.javaGenericServices ?: javaGenericServices,
    pyGenericServices = plus.pyGenericServices ?: pyGenericServices,
    phpGenericServices = plus.phpGenericServices ?: phpGenericServices,
    deprecated = plus.deprecated ?: deprecated,
    ccEnableArenas = plus.ccEnableArenas ?: ccEnableArenas,
    objcClassPrefix = plus.objcClassPrefix ?: objcClassPrefix,
    csharpNamespace = plus.csharpNamespace ?: csharpNamespace,
    swiftPrefix = plus.swiftPrefix ?: swiftPrefix,
    phpClassPrefix = plus.phpClassPrefix ?: phpClassPrefix,
    phpNamespace = plus.phpNamespace ?: phpNamespace,
    phpMetadataNamespace = plus.phpMetadataNamespace ?: phpMetadataNamespace,
    rubyPackage = plus.rubyPackage ?: rubyPackage,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FileOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileOptions {
    var javaPackage: String? = null
    var javaOuterClassname: String? = null
    var javaMultipleFiles: Boolean? = null
    var javaGenerateEqualsAndHash: Boolean? = null
    var javaStringCheckUtf8: Boolean? = null
    var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null
    var goPackage: String? = null
    var ccGenericServices: Boolean? = null
    var javaGenericServices: Boolean? = null
    var pyGenericServices: Boolean? = null
    var phpGenericServices: Boolean? = null
    var deprecated: Boolean? = null
    var ccEnableArenas: Boolean? = null
    var objcClassPrefix: String? = null
    var csharpNamespace: String? = null
    var swiftPrefix: String? = null
    var phpClassPrefix: String? = null
    var phpNamespace: String? = null
    var phpMetadataNamespace: String? = null
    var rubyPackage: String? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> javaPackage = _fieldValue as String
            8 -> javaOuterClassname = _fieldValue as String
            9 -> optimizeFor = _fieldValue as pbandk.wkt.FileOptions.OptimizeMode
            10 -> javaMultipleFiles = _fieldValue as Boolean
            11 -> goPackage = _fieldValue as String
            16 -> ccGenericServices = _fieldValue as Boolean
            17 -> javaGenericServices = _fieldValue as Boolean
            18 -> pyGenericServices = _fieldValue as Boolean
            20 -> javaGenerateEqualsAndHash = _fieldValue as Boolean
            23 -> deprecated = _fieldValue as Boolean
            27 -> javaStringCheckUtf8 = _fieldValue as Boolean
            31 -> ccEnableArenas = _fieldValue as Boolean
            36 -> objcClassPrefix = _fieldValue as String
            37 -> csharpNamespace = _fieldValue as String
            39 -> swiftPrefix = _fieldValue as String
            40 -> phpClassPrefix = _fieldValue as String
            41 -> phpNamespace = _fieldValue as String
            42 -> phpGenericServices = _fieldValue as Boolean
            44 -> phpMetadataNamespace = _fieldValue as String
            45 -> rubyPackage = _fieldValue as String
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return FileOptions(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash,
        javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices,
        javaGenericServices, pyGenericServices, phpGenericServices, deprecated,
        ccEnableArenas, objcClassPrefix, csharpNamespace, swiftPrefix,
        phpClassPrefix, phpNamespace, phpMetadataNamespace, rubyPackage,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun MessageOptions?.orDefault() = this ?: MessageOptions.defaultInstance

private fun MessageOptions.protoMergeImpl(plus: pbandk.Message?): MessageOptions = (plus as? MessageOptions)?.copy(
    messageSetWireFormat = plus.messageSetWireFormat ?: messageSetWireFormat,
    noStandardDescriptorAccessor = plus.noStandardDescriptorAccessor ?: noStandardDescriptorAccessor,
    deprecated = plus.deprecated ?: deprecated,
    mapEntry = plus.mapEntry ?: mapEntry,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageOptions {
    var messageSetWireFormat: Boolean? = null
    var noStandardDescriptorAccessor: Boolean? = null
    var deprecated: Boolean? = null
    var mapEntry: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> messageSetWireFormat = _fieldValue as Boolean
            2 -> noStandardDescriptorAccessor = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            7 -> mapEntry = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return MessageOptions(messageSetWireFormat, noStandardDescriptorAccessor, deprecated, mapEntry,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun FieldOptions?.orDefault() = this ?: FieldOptions.defaultInstance

private fun FieldOptions.protoMergeImpl(plus: pbandk.Message?): FieldOptions = (plus as? FieldOptions)?.copy(
    ctype = plus.ctype ?: ctype,
    packed = plus.packed ?: packed,
    jstype = plus.jstype ?: jstype,
    lazy = plus.lazy ?: lazy,
    deprecated = plus.deprecated ?: deprecated,
    weak = plus.weak ?: weak,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldOptions {
    var ctype: pbandk.wkt.FieldOptions.CType? = null
    var packed: Boolean? = null
    var jstype: pbandk.wkt.FieldOptions.JSType? = null
    var lazy: Boolean? = null
    var deprecated: Boolean? = null
    var weak: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ctype = _fieldValue as pbandk.wkt.FieldOptions.CType
            2 -> packed = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            5 -> lazy = _fieldValue as Boolean
            6 -> jstype = _fieldValue as pbandk.wkt.FieldOptions.JSType
            10 -> weak = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return FieldOptions(ctype, packed, jstype, lazy,
        deprecated, weak, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun OneofOptions?.orDefault() = this ?: OneofOptions.defaultInstance

private fun OneofOptions.protoMergeImpl(plus: pbandk.Message?): OneofOptions = (plus as? OneofOptions)?.copy(
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun OneofOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneofOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return OneofOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun EnumOptions?.orDefault() = this ?: EnumOptions.defaultInstance

private fun EnumOptions.protoMergeImpl(plus: pbandk.Message?): EnumOptions = (plus as? EnumOptions)?.copy(
    allowAlias = plus.allowAlias ?: allowAlias,
    deprecated = plus.deprecated ?: deprecated,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumOptions {
    var allowAlias: Boolean? = null
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> allowAlias = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return EnumOptions(allowAlias, deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun EnumValueOptions?.orDefault() = this ?: EnumValueOptions.defaultInstance

private fun EnumValueOptions.protoMergeImpl(plus: pbandk.Message?): EnumValueOptions = (plus as? EnumValueOptions)?.copy(
    deprecated = plus.deprecated ?: deprecated,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValueOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValueOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return EnumValueOptions(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun ServiceOptions?.orDefault() = this ?: ServiceOptions.defaultInstance

private fun ServiceOptions.protoMergeImpl(plus: pbandk.Message?): ServiceOptions = (plus as? ServiceOptions)?.copy(
    deprecated = plus.deprecated ?: deprecated,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return ServiceOptions(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun MethodOptions?.orDefault() = this ?: MethodOptions.defaultInstance

private fun MethodOptions.protoMergeImpl(plus: pbandk.Message?): MethodOptions = (plus as? MethodOptions)?.copy(
    deprecated = plus.deprecated ?: deprecated,
    idempotencyLevel = plus.idempotencyLevel ?: idempotencyLevel,
    uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MethodOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MethodOptions {
    var deprecated: Boolean? = null
    var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            34 -> idempotencyLevel = _fieldValue as pbandk.wkt.MethodOptions.IdempotencyLevel
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return MethodOptions(deprecated, idempotencyLevel, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

fun UninterpretedOption?.orDefault() = this ?: UninterpretedOption.defaultInstance

private fun UninterpretedOption.protoMergeImpl(plus: pbandk.Message?): UninterpretedOption = (plus as? UninterpretedOption)?.copy(
    name = name + plus.name,
    identifierValue = plus.identifierValue ?: identifierValue,
    positiveIntValue = plus.positiveIntValue ?: positiveIntValue,
    negativeIntValue = plus.negativeIntValue ?: negativeIntValue,
    doubleValue = plus.doubleValue ?: doubleValue,
    stringValue = plus.stringValue ?: stringValue,
    aggregateValue = plus.aggregateValue ?: aggregateValue,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UninterpretedOption {
    var name: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption.NamePart>? = null
    var identifierValue: String? = null
    var positiveIntValue: Long? = null
    var negativeIntValue: Long? = null
    var doubleValue: Double? = null
    var stringValue: pbandk.ByteArr? = null
    var aggregateValue: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> name = (name ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption.NamePart> }
            3 -> identifierValue = _fieldValue as String
            4 -> positiveIntValue = _fieldValue as Long
            5 -> negativeIntValue = _fieldValue as Long
            6 -> doubleValue = _fieldValue as Double
            7 -> stringValue = _fieldValue as pbandk.ByteArr
            8 -> aggregateValue = _fieldValue as String
        }
    }
    return UninterpretedOption(pbandk.ListWithSize.Builder.fixed(name), identifierValue, positiveIntValue, negativeIntValue,
        doubleValue, stringValue, aggregateValue, unknownFields)
}

fun UninterpretedOption.NamePart?.orDefault() = this ?: UninterpretedOption.NamePart.defaultInstance

private fun UninterpretedOption.NamePart.protoMergeImpl(plus: pbandk.Message?): UninterpretedOption.NamePart = (plus as? UninterpretedOption.NamePart)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.NamePart.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UninterpretedOption.NamePart {
    var namePart = ""
    var isExtension = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> namePart = _fieldValue as String
            2 -> isExtension = _fieldValue as Boolean
        }
    }
    return UninterpretedOption.NamePart(namePart, isExtension, unknownFields)
}

fun SourceCodeInfo?.orDefault() = this ?: SourceCodeInfo.defaultInstance

private fun SourceCodeInfo.protoMergeImpl(plus: pbandk.Message?): SourceCodeInfo = (plus as? SourceCodeInfo)?.copy(
    location = location + plus.location,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceCodeInfo {
    var location: pbandk.ListWithSize.Builder<pbandk.wkt.SourceCodeInfo.Location>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> location = (location ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.SourceCodeInfo.Location> }
        }
    }
    return SourceCodeInfo(pbandk.ListWithSize.Builder.fixed(location), unknownFields)
}

fun SourceCodeInfo.Location?.orDefault() = this ?: SourceCodeInfo.Location.defaultInstance

private fun SourceCodeInfo.Location.protoMergeImpl(plus: pbandk.Message?): SourceCodeInfo.Location = (plus as? SourceCodeInfo.Location)?.copy(
    path = path + plus.path,
    span = span + plus.span,
    leadingComments = plus.leadingComments ?: leadingComments,
    trailingComments = plus.trailingComments ?: trailingComments,
    leadingDetachedComments = leadingDetachedComments + plus.leadingDetachedComments,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Location.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceCodeInfo.Location {
    var path: pbandk.ListWithSize.Builder<Int>? = null
    var span: pbandk.ListWithSize.Builder<Int>? = null
    var leadingComments: String? = null
    var trailingComments: String? = null
    var leadingDetachedComments: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> path = (path ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            2 -> span = (span ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            3 -> leadingComments = _fieldValue as String
            4 -> trailingComments = _fieldValue as String
            6 -> leadingDetachedComments = (leadingDetachedComments ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return SourceCodeInfo.Location(pbandk.ListWithSize.Builder.fixed(path), pbandk.ListWithSize.Builder.fixed(span), leadingComments, trailingComments,
        pbandk.ListWithSize.Builder.fixed(leadingDetachedComments), unknownFields)
}

fun GeneratedCodeInfo?.orDefault() = this ?: GeneratedCodeInfo.defaultInstance

private fun GeneratedCodeInfo.protoMergeImpl(plus: pbandk.Message?): GeneratedCodeInfo = (plus as? GeneratedCodeInfo)?.copy(
    annotation = annotation + plus.annotation,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GeneratedCodeInfo {
    var annotation: pbandk.ListWithSize.Builder<pbandk.wkt.GeneratedCodeInfo.Annotation>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> annotation = (annotation ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.GeneratedCodeInfo.Annotation> }
        }
    }
    return GeneratedCodeInfo(pbandk.ListWithSize.Builder.fixed(annotation), unknownFields)
}

fun GeneratedCodeInfo.Annotation?.orDefault() = this ?: GeneratedCodeInfo.Annotation.defaultInstance

private fun GeneratedCodeInfo.Annotation.protoMergeImpl(plus: pbandk.Message?): GeneratedCodeInfo.Annotation = (plus as? GeneratedCodeInfo.Annotation)?.copy(
    path = path + plus.path,
    sourceFile = plus.sourceFile ?: sourceFile,
    begin = plus.begin ?: begin,
    end = plus.end ?: end,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Annotation.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GeneratedCodeInfo.Annotation {
    var path: pbandk.ListWithSize.Builder<Int>? = null
    var sourceFile: String? = null
    var begin: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> path = (path ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            2 -> sourceFile = _fieldValue as String
            3 -> begin = _fieldValue as Int
            4 -> end = _fieldValue as Int
        }
    }
    return GeneratedCodeInfo.Annotation(pbandk.ListWithSize.Builder.fixed(path), sourceFile, begin, end, unknownFields)
}

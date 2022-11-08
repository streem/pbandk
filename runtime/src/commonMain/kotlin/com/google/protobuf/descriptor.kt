@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class FileDescriptorSet(
    val file: List<com.google.protobuf.FileDescriptorProto> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FileDescriptorSet = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FileDescriptorSet> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FileDescriptorSet> {
        public val defaultInstance: com.google.protobuf.FileDescriptorSet by lazy { com.google.protobuf.FileDescriptorSet() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FileDescriptorSet = com.google.protobuf.FileDescriptorSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FileDescriptorSet> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FileDescriptorSet, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.FileDescriptorProto.Companion)),
                        jsonName = "file",
                        value = com.google.protobuf.FileDescriptorSet::file
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FileDescriptorSet",
                messageClass = com.google.protobuf.FileDescriptorSet::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class FileDescriptorProto(
    val name: String? = null,
    val `package`: String? = null,
    val dependency: List<String> = emptyList(),
    val publicDependency: List<Int> = emptyList(),
    val weakDependency: List<Int> = emptyList(),
    val messageType: List<com.google.protobuf.DescriptorProto> = emptyList(),
    val enumType: List<com.google.protobuf.EnumDescriptorProto> = emptyList(),
    val service: List<com.google.protobuf.ServiceDescriptorProto> = emptyList(),
    val extension: List<com.google.protobuf.FieldDescriptorProto> = emptyList(),
    val options: com.google.protobuf.FileOptions? = null,
    val sourceCodeInfo: com.google.protobuf.SourceCodeInfo? = null,
    val syntax: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FileDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FileDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FileDescriptorProto> {
        public val defaultInstance: com.google.protobuf.FileDescriptorProto by lazy { com.google.protobuf.FileDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FileDescriptorProto = com.google.protobuf.FileDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FileDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FileDescriptorProto, *>>(12)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.FileDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "package",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "package",
                        value = com.google.protobuf.FileDescriptorProto::`package`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dependency",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "dependency",
                        value = com.google.protobuf.FileDescriptorProto::dependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.DescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.DescriptorProto.Companion)),
                        jsonName = "messageType",
                        value = com.google.protobuf.FileDescriptorProto::messageType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.EnumDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.EnumDescriptorProto.Companion)),
                        jsonName = "enumType",
                        value = com.google.protobuf.FileDescriptorProto::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "service",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.ServiceDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.ServiceDescriptorProto.Companion)),
                        jsonName = "service",
                        value = com.google.protobuf.FileDescriptorProto::service
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.FieldDescriptorProto.Companion)),
                        jsonName = "extension",
                        value = com.google.protobuf.FileDescriptorProto::extension
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.FileOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.FileDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_code_info",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.SourceCodeInfo.Companion),
                        jsonName = "sourceCodeInfo",
                        value = com.google.protobuf.FileDescriptorProto::sourceCodeInfo
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "public_dependency",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "publicDependency",
                        value = com.google.protobuf.FileDescriptorProto::publicDependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "weak_dependency",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "weakDependency",
                        value = com.google.protobuf.FileDescriptorProto::weakDependency
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "syntax",
                        value = com.google.protobuf.FileDescriptorProto::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FileDescriptorProto",
                messageClass = com.google.protobuf.FileDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DescriptorProto(
    val name: String? = null,
    val field: List<com.google.protobuf.FieldDescriptorProto> = emptyList(),
    val extension: List<com.google.protobuf.FieldDescriptorProto> = emptyList(),
    val nestedType: List<com.google.protobuf.DescriptorProto> = emptyList(),
    val enumType: List<com.google.protobuf.EnumDescriptorProto> = emptyList(),
    val extensionRange: List<com.google.protobuf.DescriptorProto.ExtensionRange> = emptyList(),
    val oneofDecl: List<com.google.protobuf.OneofDescriptorProto> = emptyList(),
    val options: com.google.protobuf.MessageOptions? = null,
    val reservedRange: List<com.google.protobuf.DescriptorProto.ReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.DescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.DescriptorProto> {
        public val defaultInstance: com.google.protobuf.DescriptorProto by lazy { com.google.protobuf.DescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.DescriptorProto = com.google.protobuf.DescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.DescriptorProto, *>>(10)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.DescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.FieldDescriptorProto.Companion)),
                        jsonName = "field",
                        value = com.google.protobuf.DescriptorProto::field
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nested_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.DescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.DescriptorProto.Companion)),
                        jsonName = "nestedType",
                        value = com.google.protobuf.DescriptorProto::nestedType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.EnumDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.EnumDescriptorProto.Companion)),
                        jsonName = "enumType",
                        value = com.google.protobuf.DescriptorProto::enumType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension_range",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.DescriptorProto.ExtensionRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.DescriptorProto.ExtensionRange.Companion)),
                        jsonName = "extensionRange",
                        value = com.google.protobuf.DescriptorProto::extensionRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extension",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.FieldDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.FieldDescriptorProto.Companion)),
                        jsonName = "extension",
                        value = com.google.protobuf.DescriptorProto::extension
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.MessageOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.DescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_decl",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.OneofDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.OneofDescriptorProto.Companion)),
                        jsonName = "oneofDecl",
                        value = com.google.protobuf.DescriptorProto::oneofDecl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_range",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.DescriptorProto.ReservedRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.DescriptorProto.ReservedRange.Companion)),
                        jsonName = "reservedRange",
                        value = com.google.protobuf.DescriptorProto::reservedRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "reservedName",
                        value = com.google.protobuf.DescriptorProto::reservedName
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.DescriptorProto",
                messageClass = com.google.protobuf.DescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class ExtensionRange(
        val start: Int? = null,
        val end: Int? = null,
        val options: com.google.protobuf.ExtensionRangeOptions? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.DescriptorProto.ExtensionRange = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DescriptorProto.ExtensionRange> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.DescriptorProto.ExtensionRange> {
            public val defaultInstance: com.google.protobuf.DescriptorProto.ExtensionRange by lazy { com.google.protobuf.DescriptorProto.ExtensionRange() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.DescriptorProto.ExtensionRange = com.google.protobuf.DescriptorProto.ExtensionRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DescriptorProto.ExtensionRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.DescriptorProto.ExtensionRange, *>>(3)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = com.google.protobuf.DescriptorProto.ExtensionRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = com.google.protobuf.DescriptorProto.ExtensionRange::end
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "options",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.ExtensionRangeOptions.Companion),
                            jsonName = "options",
                            value = com.google.protobuf.DescriptorProto.ExtensionRange::options
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.DescriptorProto.ExtensionRange",
                    messageClass = com.google.protobuf.DescriptorProto.ExtensionRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public data class ReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.DescriptorProto.ReservedRange = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DescriptorProto.ReservedRange> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.DescriptorProto.ReservedRange> {
            public val defaultInstance: com.google.protobuf.DescriptorProto.ReservedRange by lazy { com.google.protobuf.DescriptorProto.ReservedRange() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.DescriptorProto.ReservedRange = com.google.protobuf.DescriptorProto.ReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DescriptorProto.ReservedRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.DescriptorProto.ReservedRange, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = com.google.protobuf.DescriptorProto.ReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = com.google.protobuf.DescriptorProto.ReservedRange::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.DescriptorProto.ReservedRange",
                    messageClass = com.google.protobuf.DescriptorProto.ReservedRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class ExtensionRangeOptions(
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.ExtensionRangeOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ExtensionRangeOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.ExtensionRangeOptions> {
        public val defaultInstance: com.google.protobuf.ExtensionRangeOptions by lazy { com.google.protobuf.ExtensionRangeOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.ExtensionRangeOptions = com.google.protobuf.ExtensionRangeOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ExtensionRangeOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.ExtensionRangeOptions, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.ExtensionRangeOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.ExtensionRangeOptions",
                messageClass = com.google.protobuf.ExtensionRangeOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class FieldDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val label: com.google.protobuf.FieldDescriptorProto.Label? = null,
    val type: com.google.protobuf.FieldDescriptorProto.Type? = null,
    val typeName: String? = null,
    val extendee: String? = null,
    val defaultValue: String? = null,
    val oneofIndex: Int? = null,
    val jsonName: String? = null,
    val options: com.google.protobuf.FieldOptions? = null,
    val proto3Optional: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FieldDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FieldDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FieldDescriptorProto> {
        public val defaultInstance: com.google.protobuf.FieldDescriptorProto by lazy { com.google.protobuf.FieldDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FieldDescriptorProto = com.google.protobuf.FieldDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FieldDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FieldDescriptorProto, *>>(11)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.FieldDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "extendee",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "extendee",
                        value = com.google.protobuf.FieldDescriptorProto::extendee
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "number",
                        value = com.google.protobuf.FieldDescriptorProto::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "label",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.FieldDescriptorProto.Label.Companion, hasPresence = true),
                        jsonName = "label",
                        value = com.google.protobuf.FieldDescriptorProto::label
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.FieldDescriptorProto.Type.Companion, hasPresence = true),
                        jsonName = "type",
                        value = com.google.protobuf.FieldDescriptorProto::type
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_name",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "typeName",
                        value = com.google.protobuf.FieldDescriptorProto::typeName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "default_value",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "defaultValue",
                        value = com.google.protobuf.FieldDescriptorProto::defaultValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.FieldOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.FieldDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_index",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "oneofIndex",
                        value = com.google.protobuf.FieldDescriptorProto::oneofIndex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_name",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "jsonName",
                        value = com.google.protobuf.FieldDescriptorProto::jsonName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto3_optional",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "proto3Optional",
                        value = com.google.protobuf.FieldDescriptorProto::proto3Optional
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldDescriptorProto",
                messageClass = com.google.protobuf.FieldDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class Type(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is FieldDescriptorProto.Type && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldDescriptorProto.Type.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object DOUBLE : Type(1, "TYPE_DOUBLE")
        public object FLOAT : Type(2, "TYPE_FLOAT")
        public object INT64 : Type(3, "TYPE_INT64")
        public object UINT64 : Type(4, "TYPE_UINT64")
        public object INT32 : Type(5, "TYPE_INT32")
        public object FIXED64 : Type(6, "TYPE_FIXED64")
        public object FIXED32 : Type(7, "TYPE_FIXED32")
        public object BOOL : Type(8, "TYPE_BOOL")
        public object STRING : Type(9, "TYPE_STRING")
        public object GROUP : Type(10, "TYPE_GROUP")
        public object MESSAGE : Type(11, "TYPE_MESSAGE")
        public object BYTES : Type(12, "TYPE_BYTES")
        public object UINT32 : Type(13, "TYPE_UINT32")
        public object ENUM : Type(14, "TYPE_ENUM")
        public object SFIXED32 : Type(15, "TYPE_SFIXED32")
        public object SFIXED64 : Type(16, "TYPE_SFIXED64")
        public object SINT32 : Type(17, "TYPE_SINT32")
        public object SINT64 : Type(18, "TYPE_SINT64")
        public class UNRECOGNIZED(value: Int) : Type(value)

        public companion object : pbandk.Message.Enum.Companion<FieldDescriptorProto.Type> {
            public val values: List<FieldDescriptorProto.Type> by lazy { listOf(DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64) }
            override fun fromValue(value: Int): FieldDescriptorProto.Type = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): FieldDescriptorProto.Type = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Type with name: $name")
        }
    }

    public sealed class Label(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is FieldDescriptorProto.Label && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldDescriptorProto.Label.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object OPTIONAL : Label(1, "LABEL_OPTIONAL")
        public object REQUIRED : Label(2, "LABEL_REQUIRED")
        public object REPEATED : Label(3, "LABEL_REPEATED")
        public class UNRECOGNIZED(value: Int) : Label(value)

        public companion object : pbandk.Message.Enum.Companion<FieldDescriptorProto.Label> {
            public val values: List<FieldDescriptorProto.Label> by lazy { listOf(OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int): FieldDescriptorProto.Label = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): FieldDescriptorProto.Label = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Label with name: $name")
        }
    }
}

@pbandk.Export
public data class OneofDescriptorProto(
    val name: String? = null,
    val options: com.google.protobuf.OneofOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.OneofDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.OneofDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.OneofDescriptorProto> {
        public val defaultInstance: com.google.protobuf.OneofDescriptorProto by lazy { com.google.protobuf.OneofDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.OneofDescriptorProto = com.google.protobuf.OneofDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.OneofDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.OneofDescriptorProto, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.OneofDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.OneofOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.OneofDescriptorProto::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.OneofDescriptorProto",
                messageClass = com.google.protobuf.OneofDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EnumDescriptorProto(
    val name: String? = null,
    val value: List<com.google.protobuf.EnumValueDescriptorProto> = emptyList(),
    val options: com.google.protobuf.EnumOptions? = null,
    val reservedRange: List<com.google.protobuf.EnumDescriptorProto.EnumReservedRange> = emptyList(),
    val reservedName: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.EnumDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.EnumDescriptorProto> {
        public val defaultInstance: com.google.protobuf.EnumDescriptorProto by lazy { com.google.protobuf.EnumDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.EnumDescriptorProto = com.google.protobuf.EnumDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.EnumDescriptorProto, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.EnumDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.EnumValueDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.EnumValueDescriptorProto.Companion)),
                        jsonName = "value",
                        value = com.google.protobuf.EnumDescriptorProto::value
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.EnumOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.EnumDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_range",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.EnumDescriptorProto.EnumReservedRange>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.EnumDescriptorProto.EnumReservedRange.Companion)),
                        jsonName = "reservedRange",
                        value = com.google.protobuf.EnumDescriptorProto::reservedRange
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "reserved_name",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "reservedName",
                        value = com.google.protobuf.EnumDescriptorProto::reservedName
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.EnumDescriptorProto",
                messageClass = com.google.protobuf.EnumDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class EnumReservedRange(
        val start: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.EnumDescriptorProto.EnumReservedRange = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumDescriptorProto.EnumReservedRange> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.EnumDescriptorProto.EnumReservedRange> {
            public val defaultInstance: com.google.protobuf.EnumDescriptorProto.EnumReservedRange by lazy { com.google.protobuf.EnumDescriptorProto.EnumReservedRange() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.EnumDescriptorProto.EnumReservedRange = com.google.protobuf.EnumDescriptorProto.EnumReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumDescriptorProto.EnumReservedRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.EnumDescriptorProto.EnumReservedRange, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = com.google.protobuf.EnumDescriptorProto.EnumReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = com.google.protobuf.EnumDescriptorProto.EnumReservedRange::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.EnumDescriptorProto.EnumReservedRange",
                    messageClass = com.google.protobuf.EnumDescriptorProto.EnumReservedRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class EnumValueDescriptorProto(
    val name: String? = null,
    val number: Int? = null,
    val options: com.google.protobuf.EnumValueOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.EnumValueDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumValueDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.EnumValueDescriptorProto> {
        public val defaultInstance: com.google.protobuf.EnumValueDescriptorProto by lazy { com.google.protobuf.EnumValueDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.EnumValueDescriptorProto = com.google.protobuf.EnumValueDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumValueDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.EnumValueDescriptorProto, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.EnumValueDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "number",
                        value = com.google.protobuf.EnumValueDescriptorProto::number
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.EnumValueOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.EnumValueDescriptorProto::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.EnumValueDescriptorProto",
                messageClass = com.google.protobuf.EnumValueDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ServiceDescriptorProto(
    val name: String? = null,
    val method: List<com.google.protobuf.MethodDescriptorProto> = emptyList(),
    val options: com.google.protobuf.ServiceOptions? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.ServiceDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ServiceDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.ServiceDescriptorProto> {
        public val defaultInstance: com.google.protobuf.ServiceDescriptorProto by lazy { com.google.protobuf.ServiceDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.ServiceDescriptorProto = com.google.protobuf.ServiceDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ServiceDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.ServiceDescriptorProto, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.ServiceDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "method",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.MethodDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.MethodDescriptorProto.Companion)),
                        jsonName = "method",
                        value = com.google.protobuf.ServiceDescriptorProto::method
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.ServiceOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.ServiceDescriptorProto::options
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.ServiceDescriptorProto",
                messageClass = com.google.protobuf.ServiceDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class MethodDescriptorProto(
    val name: String? = null,
    val inputType: String? = null,
    val outputType: String? = null,
    val options: com.google.protobuf.MethodOptions? = null,
    val clientStreaming: Boolean? = null,
    val serverStreaming: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.MethodDescriptorProto = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.MethodDescriptorProto> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.MethodDescriptorProto> {
        public val defaultInstance: com.google.protobuf.MethodDescriptorProto by lazy { com.google.protobuf.MethodDescriptorProto() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.MethodDescriptorProto = com.google.protobuf.MethodDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.MethodDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.MethodDescriptorProto, *>>(6)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = com.google.protobuf.MethodDescriptorProto::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "input_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "inputType",
                        value = com.google.protobuf.MethodDescriptorProto::inputType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "output_type",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "outputType",
                        value = com.google.protobuf.MethodDescriptorProto::outputType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.MethodOptions.Companion),
                        jsonName = "options",
                        value = com.google.protobuf.MethodDescriptorProto::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "client_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "clientStreaming",
                        value = com.google.protobuf.MethodDescriptorProto::clientStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "server_streaming",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "serverStreaming",
                        value = com.google.protobuf.MethodDescriptorProto::serverStreaming
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.MethodDescriptorProto",
                messageClass = com.google.protobuf.MethodDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class FileOptions(
    val javaPackage: String? = null,
    val javaOuterClassname: String? = null,
    val javaMultipleFiles: Boolean? = null,
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    val javaGenerateEqualsAndHash: Boolean? = null,
    val javaStringCheckUtf8: Boolean? = null,
    val optimizeFor: com.google.protobuf.FileOptions.OptimizeMode? = null,
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
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FileOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FileOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FileOptions> {
        public val defaultInstance: com.google.protobuf.FileOptions by lazy { com.google.protobuf.FileOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FileOptions = com.google.protobuf.FileOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FileOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FileOptions, *>>(21)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_package",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "javaPackage",
                        value = com.google.protobuf.FileOptions::javaPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_outer_classname",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "javaOuterClassname",
                        value = com.google.protobuf.FileOptions::javaOuterClassname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optimize_for",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.FileOptions.OptimizeMode.Companion, hasPresence = true),
                        jsonName = "optimizeFor",
                        value = com.google.protobuf.FileOptions::optimizeFor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_multiple_files",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaMultipleFiles",
                        value = com.google.protobuf.FileOptions::javaMultipleFiles
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "go_package",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "goPackage",
                        value = com.google.protobuf.FileOptions::goPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cc_generic_services",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ccGenericServices",
                        value = com.google.protobuf.FileOptions::ccGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generic_services",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenericServices",
                        value = com.google.protobuf.FileOptions::javaGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "py_generic_services",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "pyGenericServices",
                        value = com.google.protobuf.FileOptions::pyGenericServices
                    )
                )
                @Suppress("DEPRECATION")
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generate_equals_and_hash",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenerateEqualsAndHash",
                        options = pbandk.wkt.FieldOptions(
                            deprecated = true
                        ),
                        value = com.google.protobuf.FileOptions::javaGenerateEqualsAndHash
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.FileOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_string_check_utf8",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaStringCheckUtf8",
                        value = com.google.protobuf.FileOptions::javaStringCheckUtf8
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cc_enable_arenas",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ccEnableArenas",
                        value = com.google.protobuf.FileOptions::ccEnableArenas
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "objc_class_prefix",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "objcClassPrefix",
                        value = com.google.protobuf.FileOptions::objcClassPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "csharp_namespace",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "csharpNamespace",
                        value = com.google.protobuf.FileOptions::csharpNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "swift_prefix",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "swiftPrefix",
                        value = com.google.protobuf.FileOptions::swiftPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_class_prefix",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpClassPrefix",
                        value = com.google.protobuf.FileOptions::phpClassPrefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_namespace",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpNamespace",
                        value = com.google.protobuf.FileOptions::phpNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_generic_services",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "phpGenericServices",
                        value = com.google.protobuf.FileOptions::phpGenericServices
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "php_metadata_namespace",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "phpMetadataNamespace",
                        value = com.google.protobuf.FileOptions::phpMetadataNamespace
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ruby_package",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "rubyPackage",
                        value = com.google.protobuf.FileOptions::rubyPackage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.FileOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FileOptions",
                messageClass = com.google.protobuf.FileOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class OptimizeMode(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is FileOptions.OptimizeMode && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FileOptions.OptimizeMode.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object SPEED : OptimizeMode(1, "SPEED")
        public object CODE_SIZE : OptimizeMode(2, "CODE_SIZE")
        public object LITE_RUNTIME : OptimizeMode(3, "LITE_RUNTIME")
        public class UNRECOGNIZED(value: Int) : OptimizeMode(value)

        public companion object : pbandk.Message.Enum.Companion<FileOptions.OptimizeMode> {
            public val values: List<FileOptions.OptimizeMode> by lazy { listOf(SPEED, CODE_SIZE, LITE_RUNTIME) }
            override fun fromValue(value: Int): FileOptions.OptimizeMode = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): FileOptions.OptimizeMode = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptimizeMode with name: $name")
        }
    }
}

@pbandk.Export
public data class MessageOptions(
    val messageSetWireFormat: Boolean? = null,
    val noStandardDescriptorAccessor: Boolean? = null,
    val deprecated: Boolean? = null,
    val mapEntry: Boolean? = null,
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.MessageOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.MessageOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.MessageOptions> {
        public val defaultInstance: com.google.protobuf.MessageOptions by lazy { com.google.protobuf.MessageOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.MessageOptions = com.google.protobuf.MessageOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.MessageOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.MessageOptions, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_set_wire_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "messageSetWireFormat",
                        value = com.google.protobuf.MessageOptions::messageSetWireFormat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "no_standard_descriptor_accessor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "noStandardDescriptorAccessor",
                        value = com.google.protobuf.MessageOptions::noStandardDescriptorAccessor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.MessageOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_entry",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "mapEntry",
                        value = com.google.protobuf.MessageOptions::mapEntry
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.MessageOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.MessageOptions",
                messageClass = com.google.protobuf.MessageOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class FieldOptions(
    val ctype: com.google.protobuf.FieldOptions.CType? = null,
    val packed: Boolean? = null,
    val jstype: com.google.protobuf.FieldOptions.JSType? = null,
    val lazy: Boolean? = null,
    val deprecated: Boolean? = null,
    val weak: Boolean? = null,
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FieldOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FieldOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FieldOptions> {
        public val defaultInstance: com.google.protobuf.FieldOptions by lazy { com.google.protobuf.FieldOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FieldOptions = com.google.protobuf.FieldOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FieldOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FieldOptions, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ctype",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.FieldOptions.CType.Companion, hasPresence = true),
                        jsonName = "ctype",
                        value = com.google.protobuf.FieldOptions::ctype
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "packed",
                        value = com.google.protobuf.FieldOptions::packed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.FieldOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lazy",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "lazy",
                        value = com.google.protobuf.FieldOptions::lazy
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jstype",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.FieldOptions.JSType.Companion, hasPresence = true),
                        jsonName = "jstype",
                        value = com.google.protobuf.FieldOptions::jstype
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "weak",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "weak",
                        value = com.google.protobuf.FieldOptions::weak
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.FieldOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FieldOptions",
                messageClass = com.google.protobuf.FieldOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class CType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is FieldOptions.CType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.CType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object STRING : CType(0, "STRING")
        public object CORD : CType(1, "CORD")
        public object STRING_PIECE : CType(2, "STRING_PIECE")
        public class UNRECOGNIZED(value: Int) : CType(value)

        public companion object : pbandk.Message.Enum.Companion<FieldOptions.CType> {
            public val values: List<FieldOptions.CType> by lazy { listOf(STRING, CORD, STRING_PIECE) }
            override fun fromValue(value: Int): FieldOptions.CType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): FieldOptions.CType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No CType with name: $name")
        }
    }

    public sealed class JSType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is FieldOptions.JSType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.JSType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object JS_NORMAL : JSType(0, "JS_NORMAL")
        public object JS_STRING : JSType(1, "JS_STRING")
        public object JS_NUMBER : JSType(2, "JS_NUMBER")
        public class UNRECOGNIZED(value: Int) : JSType(value)

        public companion object : pbandk.Message.Enum.Companion<FieldOptions.JSType> {
            public val values: List<FieldOptions.JSType> by lazy { listOf(JS_NORMAL, JS_STRING, JS_NUMBER) }
            override fun fromValue(value: Int): FieldOptions.JSType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): FieldOptions.JSType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No JSType with name: $name")
        }
    }
}

@pbandk.Export
public data class OneofOptions(
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.OneofOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.OneofOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.OneofOptions> {
        public val defaultInstance: com.google.protobuf.OneofOptions by lazy { com.google.protobuf.OneofOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.OneofOptions = com.google.protobuf.OneofOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.OneofOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.OneofOptions, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.OneofOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.OneofOptions",
                messageClass = com.google.protobuf.OneofOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EnumOptions(
    val allowAlias: Boolean? = null,
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.EnumOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.EnumOptions> {
        public val defaultInstance: com.google.protobuf.EnumOptions by lazy { com.google.protobuf.EnumOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.EnumOptions = com.google.protobuf.EnumOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.EnumOptions, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "allow_alias",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "allowAlias",
                        value = com.google.protobuf.EnumOptions::allowAlias
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.EnumOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.EnumOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.EnumOptions",
                messageClass = com.google.protobuf.EnumOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class EnumValueOptions(
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.EnumValueOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumValueOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.EnumValueOptions> {
        public val defaultInstance: com.google.protobuf.EnumValueOptions by lazy { com.google.protobuf.EnumValueOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.EnumValueOptions = com.google.protobuf.EnumValueOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.EnumValueOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.EnumValueOptions, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.EnumValueOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.EnumValueOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.EnumValueOptions",
                messageClass = com.google.protobuf.EnumValueOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ServiceOptions(
    val deprecated: Boolean? = null,
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.ServiceOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ServiceOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.ServiceOptions> {
        public val defaultInstance: com.google.protobuf.ServiceOptions by lazy { com.google.protobuf.ServiceOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.ServiceOptions = com.google.protobuf.ServiceOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.ServiceOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.ServiceOptions, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.ServiceOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.ServiceOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.ServiceOptions",
                messageClass = com.google.protobuf.ServiceOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class MethodOptions(
    val deprecated: Boolean? = null,
    val idempotencyLevel: com.google.protobuf.MethodOptions.IdempotencyLevel? = null,
    val uninterpretedOption: List<com.google.protobuf.UninterpretedOption> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap(),
    @property:pbandk.PbandkInternal
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()
) : pbandk.ExtendableMessage {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.MethodOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.MethodOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.MethodOptions> {
        public val defaultInstance: com.google.protobuf.MethodOptions by lazy { com.google.protobuf.MethodOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.MethodOptions = com.google.protobuf.MethodOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.MethodOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.MethodOptions, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "deprecated",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "deprecated",
                        value = com.google.protobuf.MethodOptions::deprecated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "idempotency_level",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.MethodOptions.IdempotencyLevel.Companion, hasPresence = true),
                        jsonName = "idempotencyLevel",
                        value = com.google.protobuf.MethodOptions::idempotencyLevel
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uninterpreted_option",
                        number = 999,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.Companion)),
                        jsonName = "uninterpretedOption",
                        value = com.google.protobuf.MethodOptions::uninterpretedOption
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.MethodOptions",
                messageClass = com.google.protobuf.MethodOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class IdempotencyLevel(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is MethodOptions.IdempotencyLevel && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "MethodOptions.IdempotencyLevel.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object IDEMPOTENCY_UNKNOWN : IdempotencyLevel(0, "IDEMPOTENCY_UNKNOWN")
        public object NO_SIDE_EFFECTS : IdempotencyLevel(1, "NO_SIDE_EFFECTS")
        public object IDEMPOTENT : IdempotencyLevel(2, "IDEMPOTENT")
        public class UNRECOGNIZED(value: Int) : IdempotencyLevel(value)

        public companion object : pbandk.Message.Enum.Companion<MethodOptions.IdempotencyLevel> {
            public val values: List<MethodOptions.IdempotencyLevel> by lazy { listOf(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT) }
            override fun fromValue(value: Int): MethodOptions.IdempotencyLevel = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): MethodOptions.IdempotencyLevel = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No IdempotencyLevel with name: $name")
        }
    }
}

@pbandk.Export
public data class UninterpretedOption(
    val name: List<com.google.protobuf.UninterpretedOption.NamePart> = emptyList(),
    val identifierValue: String? = null,
    val positiveIntValue: Long? = null,
    val negativeIntValue: Long? = null,
    val doubleValue: Double? = null,
    val stringValue: pbandk.ByteArr? = null,
    val aggregateValue: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.UninterpretedOption = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UninterpretedOption> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.UninterpretedOption> {
        public val defaultInstance: com.google.protobuf.UninterpretedOption by lazy { com.google.protobuf.UninterpretedOption() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.UninterpretedOption = com.google.protobuf.UninterpretedOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UninterpretedOption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.UninterpretedOption, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.UninterpretedOption.NamePart>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.UninterpretedOption.NamePart.Companion)),
                        jsonName = "name",
                        value = com.google.protobuf.UninterpretedOption::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "identifier_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "identifierValue",
                        value = com.google.protobuf.UninterpretedOption::identifierValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "positive_int_value",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "positiveIntValue",
                        value = com.google.protobuf.UninterpretedOption::positiveIntValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "negative_int_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "negativeIntValue",
                        value = com.google.protobuf.UninterpretedOption::negativeIntValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "double_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "doubleValue",
                        value = com.google.protobuf.UninterpretedOption::doubleValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "stringValue",
                        value = com.google.protobuf.UninterpretedOption::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "aggregate_value",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "aggregateValue",
                        value = com.google.protobuf.UninterpretedOption::aggregateValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.UninterpretedOption",
                messageClass = com.google.protobuf.UninterpretedOption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class NamePart(
        val namePart: String,
        val isExtension: Boolean,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.UninterpretedOption.NamePart = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UninterpretedOption.NamePart> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.UninterpretedOption.NamePart> {
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.UninterpretedOption.NamePart = com.google.protobuf.UninterpretedOption.NamePart.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UninterpretedOption.NamePart> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.UninterpretedOption.NamePart, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name_part",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "namePart",
                            value = com.google.protobuf.UninterpretedOption.NamePart::namePart
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "is_extension",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                            jsonName = "isExtension",
                            value = com.google.protobuf.UninterpretedOption.NamePart::isExtension
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.UninterpretedOption.NamePart",
                    messageClass = com.google.protobuf.UninterpretedOption.NamePart::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class SourceCodeInfo(
    val location: List<com.google.protobuf.SourceCodeInfo.Location> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.SourceCodeInfo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.SourceCodeInfo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.SourceCodeInfo> {
        public val defaultInstance: com.google.protobuf.SourceCodeInfo by lazy { com.google.protobuf.SourceCodeInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.SourceCodeInfo = com.google.protobuf.SourceCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.SourceCodeInfo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.SourceCodeInfo, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.SourceCodeInfo.Location>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.SourceCodeInfo.Location.Companion)),
                        jsonName = "location",
                        value = com.google.protobuf.SourceCodeInfo::location
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.SourceCodeInfo",
                messageClass = com.google.protobuf.SourceCodeInfo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class Location(
        val path: List<Int> = emptyList(),
        val span: List<Int> = emptyList(),
        val leadingComments: String? = null,
        val trailingComments: String? = null,
        val leadingDetachedComments: List<String> = emptyList(),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.SourceCodeInfo.Location = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.SourceCodeInfo.Location> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.SourceCodeInfo.Location> {
            public val defaultInstance: com.google.protobuf.SourceCodeInfo.Location by lazy { com.google.protobuf.SourceCodeInfo.Location() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.SourceCodeInfo.Location = com.google.protobuf.SourceCodeInfo.Location.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.SourceCodeInfo.Location> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.SourceCodeInfo.Location, *>>(5)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = com.google.protobuf.SourceCodeInfo.Location::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "span",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "span",
                            value = com.google.protobuf.SourceCodeInfo.Location::span
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_comments",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "leadingComments",
                            value = com.google.protobuf.SourceCodeInfo.Location::leadingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "trailing_comments",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "trailingComments",
                            value = com.google.protobuf.SourceCodeInfo.Location::trailingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_detached_comments",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                            jsonName = "leadingDetachedComments",
                            value = com.google.protobuf.SourceCodeInfo.Location::leadingDetachedComments
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.SourceCodeInfo.Location",
                    messageClass = com.google.protobuf.SourceCodeInfo.Location::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
public data class GeneratedCodeInfo(
    val annotation: List<com.google.protobuf.GeneratedCodeInfo.Annotation> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.GeneratedCodeInfo = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.GeneratedCodeInfo> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.GeneratedCodeInfo> {
        public val defaultInstance: com.google.protobuf.GeneratedCodeInfo by lazy { com.google.protobuf.GeneratedCodeInfo() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.GeneratedCodeInfo = com.google.protobuf.GeneratedCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.GeneratedCodeInfo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.GeneratedCodeInfo, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "annotation",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.GeneratedCodeInfo.Annotation>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.GeneratedCodeInfo.Annotation.Companion)),
                        jsonName = "annotation",
                        value = com.google.protobuf.GeneratedCodeInfo::annotation
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.GeneratedCodeInfo",
                messageClass = com.google.protobuf.GeneratedCodeInfo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public data class Annotation(
        val path: List<Int> = emptyList(),
        val sourceFile: String? = null,
        val begin: Int? = null,
        val end: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?): com.google.protobuf.GeneratedCodeInfo.Annotation = protoMergeImpl(other)
        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.GeneratedCodeInfo.Annotation> get() = Companion.descriptor
        override val protoSize: Int by lazy { super.protoSize }
        public companion object : pbandk.Message.Companion<com.google.protobuf.GeneratedCodeInfo.Annotation> {
            public val defaultInstance: com.google.protobuf.GeneratedCodeInfo.Annotation by lazy { com.google.protobuf.GeneratedCodeInfo.Annotation() }
            override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.GeneratedCodeInfo.Annotation = com.google.protobuf.GeneratedCodeInfo.Annotation.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.GeneratedCodeInfo.Annotation> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.GeneratedCodeInfo.Annotation, *>>(4)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = com.google.protobuf.GeneratedCodeInfo.Annotation::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "source_file",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "sourceFile",
                            value = com.google.protobuf.GeneratedCodeInfo.Annotation::sourceFile
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "begin",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "begin",
                            value = com.google.protobuf.GeneratedCodeInfo.Annotation::begin
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = com.google.protobuf.GeneratedCodeInfo.Annotation::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.GeneratedCodeInfo.Annotation",
                    messageClass = com.google.protobuf.GeneratedCodeInfo.Annotation::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorSet")
public fun FileDescriptorSet?.orDefault(): com.google.protobuf.FileDescriptorSet = this ?: FileDescriptorSet.defaultInstance

private fun FileDescriptorSet.protoMergeImpl(plus: pbandk.Message?): FileDescriptorSet = (plus as? FileDescriptorSet)?.let {
    it.copy(
        file = file + plus.file,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileDescriptorSet {
    var file: pbandk.ListWithSize.Builder<com.google.protobuf.FileDescriptorProto>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.FileDescriptorProto> }
        }
    }

    return FileDescriptorSet(pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorProto")
public fun FileDescriptorProto?.orDefault(): com.google.protobuf.FileDescriptorProto = this ?: FileDescriptorProto.defaultInstance

private fun FileDescriptorProto.protoMergeImpl(plus: pbandk.Message?): FileDescriptorProto = (plus as? FileDescriptorProto)?.let {
    it.copy(
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
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileDescriptorProto {
    var name: String? = null
    var `package`: String? = null
    var dependency: pbandk.ListWithSize.Builder<String>? = null
    var publicDependency: pbandk.ListWithSize.Builder<Int>? = null
    var weakDependency: pbandk.ListWithSize.Builder<Int>? = null
    var messageType: pbandk.ListWithSize.Builder<com.google.protobuf.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<com.google.protobuf.EnumDescriptorProto>? = null
    var service: pbandk.ListWithSize.Builder<com.google.protobuf.ServiceDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<com.google.protobuf.FieldDescriptorProto>? = null
    var options: com.google.protobuf.FileOptions? = null
    var sourceCodeInfo: com.google.protobuf.SourceCodeInfo? = null
    var syntax: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> `package` = _fieldValue as String
            3 -> dependency = (dependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            4 -> messageType = (messageType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.DescriptorProto> }
            5 -> enumType = (enumType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.EnumDescriptorProto> }
            6 -> service = (service ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.ServiceDescriptorProto> }
            7 -> extension = (extension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.FieldDescriptorProto> }
            8 -> options = _fieldValue as com.google.protobuf.FileOptions
            9 -> sourceCodeInfo = _fieldValue as com.google.protobuf.SourceCodeInfo
            10 -> publicDependency = (publicDependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            11 -> weakDependency = (weakDependency ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            12 -> syntax = _fieldValue as String
        }
    }

    return FileDescriptorProto(name, `package`, pbandk.ListWithSize.Builder.fixed(dependency), pbandk.ListWithSize.Builder.fixed(publicDependency),
        pbandk.ListWithSize.Builder.fixed(weakDependency), pbandk.ListWithSize.Builder.fixed(messageType), pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(service),
        pbandk.ListWithSize.Builder.fixed(extension), options, sourceCodeInfo, syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProto")
public fun DescriptorProto?.orDefault(): com.google.protobuf.DescriptorProto = this ?: DescriptorProto.defaultInstance

private fun DescriptorProto.protoMergeImpl(plus: pbandk.Message?): DescriptorProto = (plus as? DescriptorProto)?.let {
    it.copy(
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
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto {
    var name: String? = null
    var field: pbandk.ListWithSize.Builder<com.google.protobuf.FieldDescriptorProto>? = null
    var extension: pbandk.ListWithSize.Builder<com.google.protobuf.FieldDescriptorProto>? = null
    var nestedType: pbandk.ListWithSize.Builder<com.google.protobuf.DescriptorProto>? = null
    var enumType: pbandk.ListWithSize.Builder<com.google.protobuf.EnumDescriptorProto>? = null
    var extensionRange: pbandk.ListWithSize.Builder<com.google.protobuf.DescriptorProto.ExtensionRange>? = null
    var oneofDecl: pbandk.ListWithSize.Builder<com.google.protobuf.OneofDescriptorProto>? = null
    var options: com.google.protobuf.MessageOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<com.google.protobuf.DescriptorProto.ReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> field = (field ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.FieldDescriptorProto> }
            3 -> nestedType = (nestedType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.DescriptorProto> }
            4 -> enumType = (enumType ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.EnumDescriptorProto> }
            5 -> extensionRange = (extensionRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.DescriptorProto.ExtensionRange> }
            6 -> extension = (extension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.FieldDescriptorProto> }
            7 -> options = _fieldValue as com.google.protobuf.MessageOptions
            8 -> oneofDecl = (oneofDecl ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.OneofDescriptorProto> }
            9 -> reservedRange = (reservedRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.DescriptorProto.ReservedRange> }
            10 -> reservedName = (reservedName ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }

    return DescriptorProto(name, pbandk.ListWithSize.Builder.fixed(field), pbandk.ListWithSize.Builder.fixed(extension), pbandk.ListWithSize.Builder.fixed(nestedType),
        pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(extensionRange), pbandk.ListWithSize.Builder.fixed(oneofDecl), options,
        pbandk.ListWithSize.Builder.fixed(reservedRange), pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoExtensionRange")
public fun DescriptorProto.ExtensionRange?.orDefault(): com.google.protobuf.DescriptorProto.ExtensionRange = this ?: DescriptorProto.ExtensionRange.defaultInstance

private fun DescriptorProto.ExtensionRange.protoMergeImpl(plus: pbandk.Message?): DescriptorProto.ExtensionRange = (plus as? DescriptorProto.ExtensionRange)?.let {
    it.copy(
        start = plus.start ?: start,
        end = plus.end ?: end,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ExtensionRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DescriptorProto.ExtensionRange {
    var start: Int? = null
    var end: Int? = null
    var options: com.google.protobuf.ExtensionRangeOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
            3 -> options = _fieldValue as com.google.protobuf.ExtensionRangeOptions
        }
    }

    return DescriptorProto.ExtensionRange(start, end, options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoReservedRange")
public fun DescriptorProto.ReservedRange?.orDefault(): com.google.protobuf.DescriptorProto.ReservedRange = this ?: DescriptorProto.ReservedRange.defaultInstance

private fun DescriptorProto.ReservedRange.protoMergeImpl(plus: pbandk.Message?): DescriptorProto.ReservedRange = (plus as? DescriptorProto.ReservedRange)?.let {
    it.copy(
        start = plus.start ?: start,
        end = plus.end ?: end,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForExtensionRangeOptions")
public fun ExtensionRangeOptions?.orDefault(): com.google.protobuf.ExtensionRangeOptions = this ?: ExtensionRangeOptions.defaultInstance

private fun ExtensionRangeOptions.protoMergeImpl(plus: pbandk.Message?): ExtensionRangeOptions = (plus as? ExtensionRangeOptions)?.let {
    it.copy(
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ExtensionRangeOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ExtensionRangeOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return ExtensionRangeOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldDescriptorProto")
public fun FieldDescriptorProto?.orDefault(): com.google.protobuf.FieldDescriptorProto = this ?: FieldDescriptorProto.defaultInstance

private fun FieldDescriptorProto.protoMergeImpl(plus: pbandk.Message?): FieldDescriptorProto = (plus as? FieldDescriptorProto)?.let {
    it.copy(
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
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var label: com.google.protobuf.FieldDescriptorProto.Label? = null
    var type: com.google.protobuf.FieldDescriptorProto.Type? = null
    var typeName: String? = null
    var extendee: String? = null
    var defaultValue: String? = null
    var oneofIndex: Int? = null
    var jsonName: String? = null
    var options: com.google.protobuf.FieldOptions? = null
    var proto3Optional: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> extendee = _fieldValue as String
            3 -> number = _fieldValue as Int
            4 -> label = _fieldValue as com.google.protobuf.FieldDescriptorProto.Label
            5 -> type = _fieldValue as com.google.protobuf.FieldDescriptorProto.Type
            6 -> typeName = _fieldValue as String
            7 -> defaultValue = _fieldValue as String
            8 -> options = _fieldValue as com.google.protobuf.FieldOptions
            9 -> oneofIndex = _fieldValue as Int
            10 -> jsonName = _fieldValue as String
            17 -> proto3Optional = _fieldValue as Boolean
        }
    }

    return FieldDescriptorProto(name, number, label, type,
        typeName, extendee, defaultValue, oneofIndex,
        jsonName, options, proto3Optional, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForOneofDescriptorProto")
public fun OneofDescriptorProto?.orDefault(): com.google.protobuf.OneofDescriptorProto = this ?: OneofDescriptorProto.defaultInstance

private fun OneofDescriptorProto.protoMergeImpl(plus: pbandk.Message?): OneofDescriptorProto = (plus as? OneofDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun OneofDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneofDescriptorProto {
    var name: String? = null
    var options: com.google.protobuf.OneofOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> options = _fieldValue as com.google.protobuf.OneofOptions
        }
    }

    return OneofDescriptorProto(name, options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProto")
public fun EnumDescriptorProto?.orDefault(): com.google.protobuf.EnumDescriptorProto = this ?: EnumDescriptorProto.defaultInstance

private fun EnumDescriptorProto.protoMergeImpl(plus: pbandk.Message?): EnumDescriptorProto = (plus as? EnumDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        value = value + plus.value,
        options = options?.plus(plus.options) ?: plus.options,
        reservedRange = reservedRange + plus.reservedRange,
        reservedName = reservedName + plus.reservedName,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumDescriptorProto {
    var name: String? = null
    var value: pbandk.ListWithSize.Builder<com.google.protobuf.EnumValueDescriptorProto>? = null
    var options: com.google.protobuf.EnumOptions? = null
    var reservedRange: pbandk.ListWithSize.Builder<com.google.protobuf.EnumDescriptorProto.EnumReservedRange>? = null
    var reservedName: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> value = (value ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.EnumValueDescriptorProto> }
            3 -> options = _fieldValue as com.google.protobuf.EnumOptions
            4 -> reservedRange = (reservedRange ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.EnumDescriptorProto.EnumReservedRange> }
            5 -> reservedName = (reservedName ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }

    return EnumDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(value), options, pbandk.ListWithSize.Builder.fixed(reservedRange),
        pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProtoEnumReservedRange")
public fun EnumDescriptorProto.EnumReservedRange?.orDefault(): com.google.protobuf.EnumDescriptorProto.EnumReservedRange = this ?: EnumDescriptorProto.EnumReservedRange.defaultInstance

private fun EnumDescriptorProto.EnumReservedRange.protoMergeImpl(plus: pbandk.Message?): EnumDescriptorProto.EnumReservedRange = (plus as? EnumDescriptorProto.EnumReservedRange)?.let {
    it.copy(
        start = plus.start ?: start,
        end = plus.end ?: end,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueDescriptorProto")
public fun EnumValueDescriptorProto?.orDefault(): com.google.protobuf.EnumValueDescriptorProto = this ?: EnumValueDescriptorProto.defaultInstance

private fun EnumValueDescriptorProto.protoMergeImpl(plus: pbandk.Message?): EnumValueDescriptorProto = (plus as? EnumValueDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        number = plus.number ?: number,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValueDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValueDescriptorProto {
    var name: String? = null
    var number: Int? = null
    var options: com.google.protobuf.EnumValueOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> number = _fieldValue as Int
            3 -> options = _fieldValue as com.google.protobuf.EnumValueOptions
        }
    }

    return EnumValueDescriptorProto(name, number, options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForServiceDescriptorProto")
public fun ServiceDescriptorProto?.orDefault(): com.google.protobuf.ServiceDescriptorProto = this ?: ServiceDescriptorProto.defaultInstance

private fun ServiceDescriptorProto.protoMergeImpl(plus: pbandk.Message?): ServiceDescriptorProto = (plus as? ServiceDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        method = method + plus.method,
        options = options?.plus(plus.options) ?: plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceDescriptorProto {
    var name: String? = null
    var method: pbandk.ListWithSize.Builder<com.google.protobuf.MethodDescriptorProto>? = null
    var options: com.google.protobuf.ServiceOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> method = (method ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.MethodDescriptorProto> }
            3 -> options = _fieldValue as com.google.protobuf.ServiceOptions
        }
    }

    return ServiceDescriptorProto(name, pbandk.ListWithSize.Builder.fixed(method), options, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethodDescriptorProto")
public fun MethodDescriptorProto?.orDefault(): com.google.protobuf.MethodDescriptorProto = this ?: MethodDescriptorProto.defaultInstance

private fun MethodDescriptorProto.protoMergeImpl(plus: pbandk.Message?): MethodDescriptorProto = (plus as? MethodDescriptorProto)?.let {
    it.copy(
        name = plus.name ?: name,
        inputType = plus.inputType ?: inputType,
        outputType = plus.outputType ?: outputType,
        options = options?.plus(plus.options) ?: plus.options,
        clientStreaming = plus.clientStreaming ?: clientStreaming,
        serverStreaming = plus.serverStreaming ?: serverStreaming,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MethodDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MethodDescriptorProto {
    var name: String? = null
    var inputType: String? = null
    var outputType: String? = null
    var options: com.google.protobuf.MethodOptions? = null
    var clientStreaming: Boolean? = null
    var serverStreaming: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> inputType = _fieldValue as String
            3 -> outputType = _fieldValue as String
            4 -> options = _fieldValue as com.google.protobuf.MethodOptions
            5 -> clientStreaming = _fieldValue as Boolean
            6 -> serverStreaming = _fieldValue as Boolean
        }
    }

    return MethodDescriptorProto(name, inputType, outputType, options,
        clientStreaming, serverStreaming, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFileOptions")
public fun FileOptions?.orDefault(): com.google.protobuf.FileOptions = this ?: FileOptions.defaultInstance

private fun FileOptions.protoMergeImpl(plus: pbandk.Message?): FileOptions = (plus as? FileOptions)?.let {
    @Suppress("DEPRECATION")
    it.copy(
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
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FileOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FileOptions {
    var javaPackage: String? = null
    var javaOuterClassname: String? = null
    var javaMultipleFiles: Boolean? = null
    var javaGenerateEqualsAndHash: Boolean? = null
    var javaStringCheckUtf8: Boolean? = null
    var optimizeFor: com.google.protobuf.FileOptions.OptimizeMode? = null
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
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> javaPackage = _fieldValue as String
            8 -> javaOuterClassname = _fieldValue as String
            9 -> optimizeFor = _fieldValue as com.google.protobuf.FileOptions.OptimizeMode
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
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return FileOptions(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash,
        javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices,
        javaGenericServices, pyGenericServices, phpGenericServices, deprecated,
        ccEnableArenas, objcClassPrefix, csharpNamespace, swiftPrefix,
        phpClassPrefix, phpNamespace, phpMetadataNamespace, rubyPackage,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMessageOptions")
public fun MessageOptions?.orDefault(): com.google.protobuf.MessageOptions = this ?: MessageOptions.defaultInstance

private fun MessageOptions.protoMergeImpl(plus: pbandk.Message?): MessageOptions = (plus as? MessageOptions)?.let {
    it.copy(
        messageSetWireFormat = plus.messageSetWireFormat ?: messageSetWireFormat,
        noStandardDescriptorAccessor = plus.noStandardDescriptorAccessor ?: noStandardDescriptorAccessor,
        deprecated = plus.deprecated ?: deprecated,
        mapEntry = plus.mapEntry ?: mapEntry,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageOptions {
    var messageSetWireFormat: Boolean? = null
    var noStandardDescriptorAccessor: Boolean? = null
    var deprecated: Boolean? = null
    var mapEntry: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> messageSetWireFormat = _fieldValue as Boolean
            2 -> noStandardDescriptorAccessor = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            7 -> mapEntry = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return MessageOptions(messageSetWireFormat, noStandardDescriptorAccessor, deprecated, mapEntry,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptions")
public fun FieldOptions?.orDefault(): com.google.protobuf.FieldOptions = this ?: FieldOptions.defaultInstance

private fun FieldOptions.protoMergeImpl(plus: pbandk.Message?): FieldOptions = (plus as? FieldOptions)?.let {
    it.copy(
        ctype = plus.ctype ?: ctype,
        packed = plus.packed ?: packed,
        jstype = plus.jstype ?: jstype,
        lazy = plus.lazy ?: lazy,
        deprecated = plus.deprecated ?: deprecated,
        weak = plus.weak ?: weak,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldOptions {
    var ctype: com.google.protobuf.FieldOptions.CType? = null
    var packed: Boolean? = null
    var jstype: com.google.protobuf.FieldOptions.JSType? = null
    var lazy: Boolean? = null
    var deprecated: Boolean? = null
    var weak: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> ctype = _fieldValue as com.google.protobuf.FieldOptions.CType
            2 -> packed = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            5 -> lazy = _fieldValue as Boolean
            6 -> jstype = _fieldValue as com.google.protobuf.FieldOptions.JSType
            10 -> weak = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return FieldOptions(ctype, packed, jstype, lazy,
        deprecated, weak, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForOneofOptions")
public fun OneofOptions?.orDefault(): com.google.protobuf.OneofOptions = this ?: OneofOptions.defaultInstance

private fun OneofOptions.protoMergeImpl(plus: pbandk.Message?): OneofOptions = (plus as? OneofOptions)?.let {
    it.copy(
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun OneofOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneofOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return OneofOptions(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumOptions")
public fun EnumOptions?.orDefault(): com.google.protobuf.EnumOptions = this ?: EnumOptions.defaultInstance

private fun EnumOptions.protoMergeImpl(plus: pbandk.Message?): EnumOptions = (plus as? EnumOptions)?.let {
    it.copy(
        allowAlias = plus.allowAlias ?: allowAlias,
        deprecated = plus.deprecated ?: deprecated,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumOptions {
    var allowAlias: Boolean? = null
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> allowAlias = _fieldValue as Boolean
            3 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return EnumOptions(allowAlias, deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueOptions")
public fun EnumValueOptions?.orDefault(): com.google.protobuf.EnumValueOptions = this ?: EnumValueOptions.defaultInstance

private fun EnumValueOptions.protoMergeImpl(plus: pbandk.Message?): EnumValueOptions = (plus as? EnumValueOptions)?.let {
    it.copy(
        deprecated = plus.deprecated ?: deprecated,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumValueOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumValueOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return EnumValueOptions(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForServiceOptions")
public fun ServiceOptions?.orDefault(): com.google.protobuf.ServiceOptions = this ?: ServiceOptions.defaultInstance

private fun ServiceOptions.protoMergeImpl(plus: pbandk.Message?): ServiceOptions = (plus as? ServiceOptions)?.let {
    it.copy(
        deprecated = plus.deprecated ?: deprecated,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return ServiceOptions(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethodOptions")
public fun MethodOptions?.orDefault(): com.google.protobuf.MethodOptions = this ?: MethodOptions.defaultInstance

private fun MethodOptions.protoMergeImpl(plus: pbandk.Message?): MethodOptions = (plus as? MethodOptions)?.let {
    it.copy(
        deprecated = plus.deprecated ?: deprecated,
        idempotencyLevel = plus.idempotencyLevel ?: idempotencyLevel,
        uninterpretedOption = uninterpretedOption + plus.uninterpretedOption,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MethodOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MethodOptions {
    var deprecated: Boolean? = null
    var idempotencyLevel: com.google.protobuf.MethodOptions.IdempotencyLevel? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            34 -> idempotencyLevel = _fieldValue as com.google.protobuf.MethodOptions.IdempotencyLevel
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption> }
        }
    }

    return MethodOptions(deprecated, idempotencyLevel, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUninterpretedOption")
public fun UninterpretedOption?.orDefault(): com.google.protobuf.UninterpretedOption = this ?: UninterpretedOption.defaultInstance

private fun UninterpretedOption.protoMergeImpl(plus: pbandk.Message?): UninterpretedOption = (plus as? UninterpretedOption)?.let {
    it.copy(
        name = name + plus.name,
        identifierValue = plus.identifierValue ?: identifierValue,
        positiveIntValue = plus.positiveIntValue ?: positiveIntValue,
        negativeIntValue = plus.negativeIntValue ?: negativeIntValue,
        doubleValue = plus.doubleValue ?: doubleValue,
        stringValue = plus.stringValue ?: stringValue,
        aggregateValue = plus.aggregateValue ?: aggregateValue,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UninterpretedOption {
    var name: pbandk.ListWithSize.Builder<com.google.protobuf.UninterpretedOption.NamePart>? = null
    var identifierValue: String? = null
    var positiveIntValue: Long? = null
    var negativeIntValue: Long? = null
    var doubleValue: Double? = null
    var stringValue: pbandk.ByteArr? = null
    var aggregateValue: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> name = (name ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.UninterpretedOption.NamePart> }
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

private fun UninterpretedOption.NamePart.protoMergeImpl(plus: pbandk.Message?): UninterpretedOption.NamePart = (plus as? UninterpretedOption.NamePart)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.NamePart.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UninterpretedOption.NamePart {
    var namePart: String? = null
    var isExtension: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> namePart = _fieldValue as String
            2 -> isExtension = _fieldValue as Boolean
        }
    }

    if (namePart == null) {
        throw pbandk.InvalidProtocolBufferException.missingRequiredField("name_part")
    }
    if (isExtension == null) {
        throw pbandk.InvalidProtocolBufferException.missingRequiredField("is_extension")
    }
    return UninterpretedOption.NamePart(namePart!!, isExtension!!, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfo")
public fun SourceCodeInfo?.orDefault(): com.google.protobuf.SourceCodeInfo = this ?: SourceCodeInfo.defaultInstance

private fun SourceCodeInfo.protoMergeImpl(plus: pbandk.Message?): SourceCodeInfo = (plus as? SourceCodeInfo)?.let {
    it.copy(
        location = location + plus.location,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SourceCodeInfo {
    var location: pbandk.ListWithSize.Builder<com.google.protobuf.SourceCodeInfo.Location>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> location = (location ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.SourceCodeInfo.Location> }
        }
    }

    return SourceCodeInfo(pbandk.ListWithSize.Builder.fixed(location), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfoLocation")
public fun SourceCodeInfo.Location?.orDefault(): com.google.protobuf.SourceCodeInfo.Location = this ?: SourceCodeInfo.Location.defaultInstance

private fun SourceCodeInfo.Location.protoMergeImpl(plus: pbandk.Message?): SourceCodeInfo.Location = (plus as? SourceCodeInfo.Location)?.let {
    it.copy(
        path = path + plus.path,
        span = span + plus.span,
        leadingComments = plus.leadingComments ?: leadingComments,
        trailingComments = plus.trailingComments ?: trailingComments,
        leadingDetachedComments = leadingDetachedComments + plus.leadingDetachedComments,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfo")
public fun GeneratedCodeInfo?.orDefault(): com.google.protobuf.GeneratedCodeInfo = this ?: GeneratedCodeInfo.defaultInstance

private fun GeneratedCodeInfo.protoMergeImpl(plus: pbandk.Message?): GeneratedCodeInfo = (plus as? GeneratedCodeInfo)?.let {
    it.copy(
        annotation = annotation + plus.annotation,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GeneratedCodeInfo {
    var annotation: pbandk.ListWithSize.Builder<com.google.protobuf.GeneratedCodeInfo.Annotation>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> annotation = (annotation ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.GeneratedCodeInfo.Annotation> }
        }
    }

    return GeneratedCodeInfo(pbandk.ListWithSize.Builder.fixed(annotation), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfoAnnotation")
public fun GeneratedCodeInfo.Annotation?.orDefault(): com.google.protobuf.GeneratedCodeInfo.Annotation = this ?: GeneratedCodeInfo.Annotation.defaultInstance

private fun GeneratedCodeInfo.Annotation.protoMergeImpl(plus: pbandk.Message?): GeneratedCodeInfo.Annotation = (plus as? GeneratedCodeInfo.Annotation)?.let {
    it.copy(
        path = path + plus.path,
        sourceFile = plus.sourceFile ?: sourceFile,
        begin = plus.begin ?: begin,
        end = plus.end ?: end,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

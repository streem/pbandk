@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface FileDescriptorSet : pbandk.Message {
    public val file: List<pbandk.wkt.FileDescriptorProto>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileDescriptorSet
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet>

    /**
     * The [MutableFileDescriptorSet] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit): pbandk.wkt.FileDescriptorSet

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        file: List<pbandk.wkt.FileDescriptorProto> = this.file,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FileDescriptorSet

    public companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorSet> {
        public val defaultInstance: pbandk.wkt.FileDescriptorSet by lazy { pbandk.wkt.FileDescriptorSet {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FileDescriptorSet = pbandk.wkt.FileDescriptorSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorSet> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorSet, *>>(1)
            fieldsList.apply {
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
                fullName = "google.protobuf.FileDescriptorSet",
                messageClass = pbandk.wkt.FileDescriptorSet::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFileDescriptorSet : pbandk.wkt.FileDescriptorSet, pbandk.MutableMessage {
    public override val file: MutableList<pbandk.wkt.FileDescriptorProto>
}

public sealed interface FileDescriptorProto : pbandk.Message {
    public val name: String?
    public val `package`: String?
    public val dependency: List<String>
    public val publicDependency: List<Int>
    public val weakDependency: List<Int>
    public val messageType: List<pbandk.wkt.DescriptorProto>
    public val enumType: List<pbandk.wkt.EnumDescriptorProto>
    public val service: List<pbandk.wkt.ServiceDescriptorProto>
    public val extension: List<pbandk.wkt.FieldDescriptorProto>
    public val options: pbandk.wkt.FileOptions?
    public val sourceCodeInfo: pbandk.wkt.SourceCodeInfo?
    public val syntax: String?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto>

    /**
     * The [MutableFileDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit): pbandk.wkt.FileDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        `package`: String? = this.`package`,
        dependency: List<String> = this.dependency,
        publicDependency: List<Int> = this.publicDependency,
        weakDependency: List<Int> = this.weakDependency,
        messageType: List<pbandk.wkt.DescriptorProto> = this.messageType,
        enumType: List<pbandk.wkt.EnumDescriptorProto> = this.enumType,
        service: List<pbandk.wkt.ServiceDescriptorProto> = this.service,
        extension: List<pbandk.wkt.FieldDescriptorProto> = this.extension,
        options: pbandk.wkt.FileOptions? = this.options,
        sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = this.sourceCodeInfo,
        syntax: String? = this.syntax,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FileDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.FileDescriptorProto> {
        public val defaultInstance: pbandk.wkt.FileDescriptorProto by lazy { pbandk.wkt.FileDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FileDescriptorProto = pbandk.wkt.FileDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FileDescriptorProto, *>>(12)
            fieldsList.apply {
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
                fullName = "google.protobuf.FileDescriptorProto",
                messageClass = pbandk.wkt.FileDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableFileDescriptorProto : pbandk.wkt.FileDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override var `package`: String?
    public override val dependency: MutableList<String>
    public override val publicDependency: MutableList<Int>
    public override val weakDependency: MutableList<Int>
    public override val messageType: MutableList<pbandk.wkt.DescriptorProto>
    public override val enumType: MutableList<pbandk.wkt.EnumDescriptorProto>
    public override val service: MutableList<pbandk.wkt.ServiceDescriptorProto>
    public override val extension: MutableList<pbandk.wkt.FieldDescriptorProto>
    public override var options: pbandk.wkt.FileOptions?
    public override var sourceCodeInfo: pbandk.wkt.SourceCodeInfo?
    public override var syntax: String?
}

public sealed interface DescriptorProto : pbandk.Message {
    public val name: String?
    public val field: List<pbandk.wkt.FieldDescriptorProto>
    public val extension: List<pbandk.wkt.FieldDescriptorProto>
    public val nestedType: List<pbandk.wkt.DescriptorProto>
    public val enumType: List<pbandk.wkt.EnumDescriptorProto>
    public val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>
    public val oneofDecl: List<pbandk.wkt.OneofDescriptorProto>
    public val options: pbandk.wkt.MessageOptions?
    public val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>
    public val reservedName: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto>

    /**
     * The [MutableDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit): pbandk.wkt.DescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        field: List<pbandk.wkt.FieldDescriptorProto> = this.field,
        extension: List<pbandk.wkt.FieldDescriptorProto> = this.extension,
        nestedType: List<pbandk.wkt.DescriptorProto> = this.nestedType,
        enumType: List<pbandk.wkt.EnumDescriptorProto> = this.enumType,
        extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = this.extensionRange,
        oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = this.oneofDecl,
        options: pbandk.wkt.MessageOptions? = this.options,
        reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = this.reservedRange,
        reservedName: List<String> = this.reservedName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.DescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto> {
        public val defaultInstance: pbandk.wkt.DescriptorProto by lazy { pbandk.wkt.DescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto = pbandk.wkt.DescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto, *>>(10)
            fieldsList.apply {
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
                fullName = "google.protobuf.DescriptorProto",
                messageClass = pbandk.wkt.DescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface ExtensionRange : pbandk.Message {
        public val start: Int?
        public val end: Int?
        public val options: pbandk.wkt.ExtensionRangeOptions?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ExtensionRange
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange>

        /**
         * The [MutableExtensionRange] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit): pbandk.wkt.DescriptorProto.ExtensionRange

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            start: Int? = this.start,
            end: Int? = this.end,
            options: pbandk.wkt.ExtensionRangeOptions? = this.options,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.DescriptorProto.ExtensionRange

        public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto.ExtensionRange> {
            public val defaultInstance: pbandk.wkt.DescriptorProto.ExtensionRange by lazy { pbandk.wkt.DescriptorProto.ExtensionRange {} }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto.ExtensionRange = pbandk.wkt.DescriptorProto.ExtensionRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ExtensionRange, *>>(3)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.DescriptorProto.ExtensionRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.DescriptorProto.ExtensionRange::end
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "options",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ExtensionRangeOptions.Companion),
                            jsonName = "options",
                            value = pbandk.wkt.DescriptorProto.ExtensionRange::options
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.DescriptorProto.ExtensionRange",
                    messageClass = pbandk.wkt.DescriptorProto.ExtensionRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableExtensionRange : pbandk.wkt.DescriptorProto.ExtensionRange, pbandk.MutableMessage {
        public override var start: Int?
        public override var end: Int?
        public override var options: pbandk.wkt.ExtensionRangeOptions?
    }

    public sealed interface ReservedRange : pbandk.Message {
        public val start: Int?
        public val end: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ReservedRange
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ReservedRange>

        /**
         * The [MutableReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit): pbandk.wkt.DescriptorProto.ReservedRange

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            start: Int? = this.start,
            end: Int? = this.end,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.DescriptorProto.ReservedRange

        public companion object : pbandk.Message.Companion<pbandk.wkt.DescriptorProto.ReservedRange> {
            public val defaultInstance: pbandk.wkt.DescriptorProto.ReservedRange by lazy { pbandk.wkt.DescriptorProto.ReservedRange {} }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto.ReservedRange = pbandk.wkt.DescriptorProto.ReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DescriptorProto.ReservedRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.DescriptorProto.ReservedRange, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.DescriptorProto.ReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.DescriptorProto.ReservedRange::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.DescriptorProto.ReservedRange",
                    messageClass = pbandk.wkt.DescriptorProto.ReservedRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableReservedRange : pbandk.wkt.DescriptorProto.ReservedRange, pbandk.MutableMessage {
        public override var start: Int?
        public override var end: Int?
    }
}

public sealed interface MutableDescriptorProto : pbandk.wkt.DescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override val field: MutableList<pbandk.wkt.FieldDescriptorProto>
    public override val extension: MutableList<pbandk.wkt.FieldDescriptorProto>
    public override val nestedType: MutableList<pbandk.wkt.DescriptorProto>
    public override val enumType: MutableList<pbandk.wkt.EnumDescriptorProto>
    public override val extensionRange: MutableList<pbandk.wkt.DescriptorProto.ExtensionRange>
    public override val oneofDecl: MutableList<pbandk.wkt.OneofDescriptorProto>
    public override var options: pbandk.wkt.MessageOptions?
    public override val reservedRange: MutableList<pbandk.wkt.DescriptorProto.ReservedRange>
    public override val reservedName: MutableList<String>
}

public sealed interface ExtensionRangeOptions : pbandk.ExtendableMessage {
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ExtensionRangeOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions>

    /**
     * The [MutableExtensionRangeOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit): pbandk.wkt.ExtensionRangeOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ExtensionRangeOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.ExtensionRangeOptions> {
        public val defaultInstance: pbandk.wkt.ExtensionRangeOptions by lazy { pbandk.wkt.ExtensionRangeOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ExtensionRangeOptions = pbandk.wkt.ExtensionRangeOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ExtensionRangeOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ExtensionRangeOptions, *>>(1)
            fieldsList.apply {
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
                fullName = "google.protobuf.ExtensionRangeOptions",
                messageClass = pbandk.wkt.ExtensionRangeOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableExtensionRangeOptions : pbandk.wkt.ExtensionRangeOptions, pbandk.MutableMessage {
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface FieldDescriptorProto : pbandk.Message {
    public val name: String?
    public val number: Int?
    public val label: pbandk.wkt.FieldDescriptorProto.Label?
    public val type: pbandk.wkt.FieldDescriptorProto.Type?
    public val typeName: String?
    public val extendee: String?
    public val defaultValue: String?
    public val oneofIndex: Int?
    public val jsonName: String?
    public val options: pbandk.wkt.FieldOptions?
    public val proto3Optional: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto>

    /**
     * The [MutableFieldDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit): pbandk.wkt.FieldDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        number: Int? = this.number,
        label: pbandk.wkt.FieldDescriptorProto.Label? = this.label,
        type: pbandk.wkt.FieldDescriptorProto.Type? = this.type,
        typeName: String? = this.typeName,
        extendee: String? = this.extendee,
        defaultValue: String? = this.defaultValue,
        oneofIndex: Int? = this.oneofIndex,
        jsonName: String? = this.jsonName,
        options: pbandk.wkt.FieldOptions? = this.options,
        proto3Optional: Boolean? = this.proto3Optional,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FieldDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldDescriptorProto> {
        public val defaultInstance: pbandk.wkt.FieldDescriptorProto by lazy { pbandk.wkt.FieldDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldDescriptorProto = pbandk.wkt.FieldDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldDescriptorProto, *>>(11)
            fieldsList.apply {
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
                fullName = "google.protobuf.FieldDescriptorProto",
                messageClass = pbandk.wkt.FieldDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class Type(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldDescriptorProto.Type && other.value == value
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

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Type> {
            public val values: List<FieldDescriptorProto.Type> by lazy { listOf(DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64) }
            override fun fromValue(value: Int): pbandk.wkt.FieldDescriptorProto.Type = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldDescriptorProto.Type = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Type with name: $name")
        }
    }

    public sealed class Label(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldDescriptorProto.Label && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldDescriptorProto.Label.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object OPTIONAL : Label(1, "LABEL_OPTIONAL")
        public object REQUIRED : Label(2, "LABEL_REQUIRED")
        public object REPEATED : Label(3, "LABEL_REPEATED")
        public class UNRECOGNIZED(value: Int) : Label(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldDescriptorProto.Label> {
            public val values: List<FieldDescriptorProto.Label> by lazy { listOf(OPTIONAL, REQUIRED, REPEATED) }
            override fun fromValue(value: Int): pbandk.wkt.FieldDescriptorProto.Label = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldDescriptorProto.Label = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Label with name: $name")
        }
    }
}

public sealed interface MutableFieldDescriptorProto : pbandk.wkt.FieldDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override var number: Int?
    public override var label: pbandk.wkt.FieldDescriptorProto.Label?
    public override var type: pbandk.wkt.FieldDescriptorProto.Type?
    public override var typeName: String?
    public override var extendee: String?
    public override var defaultValue: String?
    public override var oneofIndex: Int?
    public override var jsonName: String?
    public override var options: pbandk.wkt.FieldOptions?
    public override var proto3Optional: Boolean?
}

public sealed interface OneofDescriptorProto : pbandk.Message {
    public val name: String?
    public val options: pbandk.wkt.OneofOptions?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.OneofDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto>

    /**
     * The [MutableOneofDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit): pbandk.wkt.OneofDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        options: pbandk.wkt.OneofOptions? = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.OneofDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.OneofDescriptorProto> {
        public val defaultInstance: pbandk.wkt.OneofDescriptorProto by lazy { pbandk.wkt.OneofDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.OneofDescriptorProto = pbandk.wkt.OneofDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.OneofDescriptorProto, *>>(2)
            fieldsList.apply {
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
                fullName = "google.protobuf.OneofDescriptorProto",
                messageClass = pbandk.wkt.OneofDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableOneofDescriptorProto : pbandk.wkt.OneofDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override var options: pbandk.wkt.OneofOptions?
}

public sealed interface EnumDescriptorProto : pbandk.Message {
    public val name: String?
    public val value: List<pbandk.wkt.EnumValueDescriptorProto>
    public val options: pbandk.wkt.EnumOptions?
    public val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>
    public val reservedName: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto>

    /**
     * The [MutableEnumDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit): pbandk.wkt.EnumDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        value: List<pbandk.wkt.EnumValueDescriptorProto> = this.value,
        options: pbandk.wkt.EnumOptions? = this.options,
        reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = this.reservedRange,
        reservedName: List<String> = this.reservedName,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto> {
        public val defaultInstance: pbandk.wkt.EnumDescriptorProto by lazy { pbandk.wkt.EnumDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumDescriptorProto = pbandk.wkt.EnumDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto, *>>(5)
            fieldsList.apply {
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
                fullName = "google.protobuf.EnumDescriptorProto",
                messageClass = pbandk.wkt.EnumDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface EnumReservedRange : pbandk.Message {
        public val start: Int?
        public val end: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto.EnumReservedRange
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>

        /**
         * The [MutableEnumReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit): pbandk.wkt.EnumDescriptorProto.EnumReservedRange

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            start: Int? = this.start,
            end: Int? = this.end,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.EnumDescriptorProto.EnumReservedRange

        public companion object : pbandk.Message.Companion<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> {
            public val defaultInstance: pbandk.wkt.EnumDescriptorProto.EnumReservedRange by lazy { pbandk.wkt.EnumDescriptorProto.EnumReservedRange {} }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumDescriptorProto.EnumReservedRange, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "start",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "start",
                            value = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::start
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.EnumDescriptorProto.EnumReservedRange",
                    messageClass = pbandk.wkt.EnumDescriptorProto.EnumReservedRange::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableEnumReservedRange : pbandk.wkt.EnumDescriptorProto.EnumReservedRange, pbandk.MutableMessage {
        public override var start: Int?
        public override var end: Int?
    }
}

public sealed interface MutableEnumDescriptorProto : pbandk.wkt.EnumDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override val value: MutableList<pbandk.wkt.EnumValueDescriptorProto>
    public override var options: pbandk.wkt.EnumOptions?
    public override val reservedRange: MutableList<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>
    public override val reservedName: MutableList<String>
}

public sealed interface EnumValueDescriptorProto : pbandk.Message {
    public val name: String?
    public val number: Int?
    public val options: pbandk.wkt.EnumValueOptions?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValueDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto>

    /**
     * The [MutableEnumValueDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit): pbandk.wkt.EnumValueDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        number: Int? = this.number,
        options: pbandk.wkt.EnumValueOptions? = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValueDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueDescriptorProto> {
        public val defaultInstance: pbandk.wkt.EnumValueDescriptorProto by lazy { pbandk.wkt.EnumValueDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValueDescriptorProto = pbandk.wkt.EnumValueDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumValueDescriptorProto, *>>(3)
            fieldsList.apply {
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
                fullName = "google.protobuf.EnumValueDescriptorProto",
                messageClass = pbandk.wkt.EnumValueDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableEnumValueDescriptorProto : pbandk.wkt.EnumValueDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override var number: Int?
    public override var options: pbandk.wkt.EnumValueOptions?
}

public sealed interface ServiceDescriptorProto : pbandk.Message {
    public val name: String?
    public val method: List<pbandk.wkt.MethodDescriptorProto>
    public val options: pbandk.wkt.ServiceOptions?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ServiceDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto>

    /**
     * The [MutableServiceDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit): pbandk.wkt.ServiceDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        method: List<pbandk.wkt.MethodDescriptorProto> = this.method,
        options: pbandk.wkt.ServiceOptions? = this.options,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ServiceDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.ServiceDescriptorProto> {
        public val defaultInstance: pbandk.wkt.ServiceDescriptorProto by lazy { pbandk.wkt.ServiceDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ServiceDescriptorProto = pbandk.wkt.ServiceDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ServiceDescriptorProto, *>>(3)
            fieldsList.apply {
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
                fullName = "google.protobuf.ServiceDescriptorProto",
                messageClass = pbandk.wkt.ServiceDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableServiceDescriptorProto : pbandk.wkt.ServiceDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override val method: MutableList<pbandk.wkt.MethodDescriptorProto>
    public override var options: pbandk.wkt.ServiceOptions?
}

public sealed interface MethodDescriptorProto : pbandk.Message {
    public val name: String?
    public val inputType: String?
    public val outputType: String?
    public val options: pbandk.wkt.MethodOptions?
    public val clientStreaming: Boolean?
    public val serverStreaming: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MethodDescriptorProto
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto>

    /**
     * The [MutableMethodDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit): pbandk.wkt.MethodDescriptorProto

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String? = this.name,
        inputType: String? = this.inputType,
        outputType: String? = this.outputType,
        options: pbandk.wkt.MethodOptions? = this.options,
        clientStreaming: Boolean? = this.clientStreaming,
        serverStreaming: Boolean? = this.serverStreaming,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.MethodDescriptorProto

    public companion object : pbandk.Message.Companion<pbandk.wkt.MethodDescriptorProto> {
        public val defaultInstance: pbandk.wkt.MethodDescriptorProto by lazy { pbandk.wkt.MethodDescriptorProto {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.MethodDescriptorProto = pbandk.wkt.MethodDescriptorProto.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodDescriptorProto> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.MethodDescriptorProto, *>>(6)
            fieldsList.apply {
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
                fullName = "google.protobuf.MethodDescriptorProto",
                messageClass = pbandk.wkt.MethodDescriptorProto::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMethodDescriptorProto : pbandk.wkt.MethodDescriptorProto, pbandk.MutableMessage {
    public override var name: String?
    public override var inputType: String?
    public override var outputType: String?
    public override var options: pbandk.wkt.MethodOptions?
    public override var clientStreaming: Boolean?
    public override var serverStreaming: Boolean?
}

public sealed interface FileOptions : pbandk.ExtendableMessage {
    public val javaPackage: String?
    public val javaOuterClassname: String?
    public val javaMultipleFiles: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public val javaGenerateEqualsAndHash: Boolean?
    public val javaStringCheckUtf8: Boolean?
    public val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?
    public val goPackage: String?
    public val ccGenericServices: Boolean?
    public val javaGenericServices: Boolean?
    public val pyGenericServices: Boolean?
    public val phpGenericServices: Boolean?
    public val deprecated: Boolean?
    public val ccEnableArenas: Boolean?
    public val objcClassPrefix: String?
    public val csharpNamespace: String?
    public val swiftPrefix: String?
    public val phpClassPrefix: String?
    public val phpNamespace: String?
    public val phpMetadataNamespace: String?
    public val rubyPackage: String?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FileOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions>

    /**
     * The [MutableFileOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit): pbandk.wkt.FileOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        javaPackage: String? = this.javaPackage,
        javaOuterClassname: String? = this.javaOuterClassname,
        javaMultipleFiles: Boolean? = this.javaMultipleFiles,
        javaGenerateEqualsAndHash: Boolean? = @Suppress("DEPRECATION") this.javaGenerateEqualsAndHash,
        javaStringCheckUtf8: Boolean? = this.javaStringCheckUtf8,
        optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = this.optimizeFor,
        goPackage: String? = this.goPackage,
        ccGenericServices: Boolean? = this.ccGenericServices,
        javaGenericServices: Boolean? = this.javaGenericServices,
        pyGenericServices: Boolean? = this.pyGenericServices,
        phpGenericServices: Boolean? = this.phpGenericServices,
        deprecated: Boolean? = this.deprecated,
        ccEnableArenas: Boolean? = this.ccEnableArenas,
        objcClassPrefix: String? = this.objcClassPrefix,
        csharpNamespace: String? = this.csharpNamespace,
        swiftPrefix: String? = this.swiftPrefix,
        phpClassPrefix: String? = this.phpClassPrefix,
        phpNamespace: String? = this.phpNamespace,
        phpMetadataNamespace: String? = this.phpMetadataNamespace,
        rubyPackage: String? = this.rubyPackage,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FileOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.FileOptions> {
        public val defaultInstance: pbandk.wkt.FileOptions by lazy { pbandk.wkt.FileOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FileOptions = pbandk.wkt.FileOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FileOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FileOptions, *>>(21)
            fieldsList.apply {
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
                @Suppress("DEPRECATION")
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "java_generate_equals_and_hash",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "javaGenerateEqualsAndHash",
                        options = pbandk.wkt.FieldOptions {
                            deprecated = true
                        },
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
                fullName = "google.protobuf.FileOptions",
                messageClass = pbandk.wkt.FileOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class OptimizeMode(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FileOptions.OptimizeMode && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FileOptions.OptimizeMode.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object SPEED : OptimizeMode(1, "SPEED")
        public object CODE_SIZE : OptimizeMode(2, "CODE_SIZE")
        public object LITE_RUNTIME : OptimizeMode(3, "LITE_RUNTIME")
        public class UNRECOGNIZED(value: Int) : OptimizeMode(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FileOptions.OptimizeMode> {
            public val values: List<FileOptions.OptimizeMode> by lazy { listOf(SPEED, CODE_SIZE, LITE_RUNTIME) }
            override fun fromValue(value: Int): pbandk.wkt.FileOptions.OptimizeMode = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FileOptions.OptimizeMode = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No OptimizeMode with name: $name")
        }
    }
}

public sealed interface MutableFileOptions : pbandk.wkt.FileOptions, pbandk.MutableMessage {
    public override var javaPackage: String?
    public override var javaOuterClassname: String?
    public override var javaMultipleFiles: Boolean?
    @Deprecated(message = "Field marked deprecated in google/protobuf/descriptor.proto")
    public override var javaGenerateEqualsAndHash: Boolean?
    public override var javaStringCheckUtf8: Boolean?
    public override var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?
    public override var goPackage: String?
    public override var ccGenericServices: Boolean?
    public override var javaGenericServices: Boolean?
    public override var pyGenericServices: Boolean?
    public override var phpGenericServices: Boolean?
    public override var deprecated: Boolean?
    public override var ccEnableArenas: Boolean?
    public override var objcClassPrefix: String?
    public override var csharpNamespace: String?
    public override var swiftPrefix: String?
    public override var phpClassPrefix: String?
    public override var phpNamespace: String?
    public override var phpMetadataNamespace: String?
    public override var rubyPackage: String?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface MessageOptions : pbandk.ExtendableMessage {
    public val messageSetWireFormat: Boolean?
    public val noStandardDescriptorAccessor: Boolean?
    public val deprecated: Boolean?
    public val mapEntry: Boolean?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MessageOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions>

    /**
     * The [MutableMessageOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit): pbandk.wkt.MessageOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        messageSetWireFormat: Boolean? = this.messageSetWireFormat,
        noStandardDescriptorAccessor: Boolean? = this.noStandardDescriptorAccessor,
        deprecated: Boolean? = this.deprecated,
        mapEntry: Boolean? = this.mapEntry,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.MessageOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.MessageOptions> {
        public val defaultInstance: pbandk.wkt.MessageOptions by lazy { pbandk.wkt.MessageOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.MessageOptions = pbandk.wkt.MessageOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MessageOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.MessageOptions, *>>(5)
            fieldsList.apply {
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
                fullName = "google.protobuf.MessageOptions",
                messageClass = pbandk.wkt.MessageOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMessageOptions : pbandk.wkt.MessageOptions, pbandk.MutableMessage {
    public override var messageSetWireFormat: Boolean?
    public override var noStandardDescriptorAccessor: Boolean?
    public override var deprecated: Boolean?
    public override var mapEntry: Boolean?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface FieldOptions : pbandk.ExtendableMessage {
    public val ctype: pbandk.wkt.FieldOptions.CType?
    public val packed: Boolean?
    public val jstype: pbandk.wkt.FieldOptions.JSType?
    public val lazy: Boolean?
    public val deprecated: Boolean?
    public val weak: Boolean?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions>

    /**
     * The [MutableFieldOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit): pbandk.wkt.FieldOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        ctype: pbandk.wkt.FieldOptions.CType? = this.ctype,
        packed: Boolean? = this.packed,
        jstype: pbandk.wkt.FieldOptions.JSType? = this.jstype,
        lazy: Boolean? = this.lazy,
        deprecated: Boolean? = this.deprecated,
        weak: Boolean? = this.weak,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FieldOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.FieldOptions> {
        public val defaultInstance: pbandk.wkt.FieldOptions by lazy { pbandk.wkt.FieldOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FieldOptions = pbandk.wkt.FieldOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, *>>(7)
            fieldsList.apply {
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
                fullName = "google.protobuf.FieldOptions",
                messageClass = pbandk.wkt.FieldOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class CType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldOptions.CType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.CType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object STRING : CType(0, "STRING")
        public object CORD : CType(1, "CORD")
        public object STRING_PIECE : CType(2, "STRING_PIECE")
        public class UNRECOGNIZED(value: Int) : CType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.CType> {
            public val values: List<FieldOptions.CType> by lazy { listOf(STRING, CORD, STRING_PIECE) }
            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.CType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldOptions.CType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No CType with name: $name")
        }
    }

    public sealed class JSType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.FieldOptions.JSType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "FieldOptions.JSType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object JS_NORMAL : JSType(0, "JS_NORMAL")
        public object JS_STRING : JSType(1, "JS_STRING")
        public object JS_NUMBER : JSType(2, "JS_NUMBER")
        public class UNRECOGNIZED(value: Int) : JSType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.FieldOptions.JSType> {
            public val values: List<FieldOptions.JSType> by lazy { listOf(JS_NORMAL, JS_STRING, JS_NUMBER) }
            override fun fromValue(value: Int): pbandk.wkt.FieldOptions.JSType = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.FieldOptions.JSType = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No JSType with name: $name")
        }
    }
}

public sealed interface MutableFieldOptions : pbandk.wkt.FieldOptions, pbandk.MutableMessage {
    public override var ctype: pbandk.wkt.FieldOptions.CType?
    public override var packed: Boolean?
    public override var jstype: pbandk.wkt.FieldOptions.JSType?
    public override var lazy: Boolean?
    public override var deprecated: Boolean?
    public override var weak: Boolean?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface OneofOptions : pbandk.ExtendableMessage {
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.OneofOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions>

    /**
     * The [MutableOneofOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit): pbandk.wkt.OneofOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.OneofOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.OneofOptions> {
        public val defaultInstance: pbandk.wkt.OneofOptions by lazy { pbandk.wkt.OneofOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.OneofOptions = pbandk.wkt.OneofOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.OneofOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.OneofOptions, *>>(1)
            fieldsList.apply {
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
                fullName = "google.protobuf.OneofOptions",
                messageClass = pbandk.wkt.OneofOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableOneofOptions : pbandk.wkt.OneofOptions, pbandk.MutableMessage {
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface EnumOptions : pbandk.ExtendableMessage {
    public val allowAlias: Boolean?
    public val deprecated: Boolean?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions>

    /**
     * The [MutableEnumOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit): pbandk.wkt.EnumOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        allowAlias: Boolean? = this.allowAlias,
        deprecated: Boolean? = this.deprecated,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumOptions> {
        public val defaultInstance: pbandk.wkt.EnumOptions by lazy { pbandk.wkt.EnumOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumOptions = pbandk.wkt.EnumOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumOptions, *>>(3)
            fieldsList.apply {
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
                fullName = "google.protobuf.EnumOptions",
                messageClass = pbandk.wkt.EnumOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableEnumOptions : pbandk.wkt.EnumOptions, pbandk.MutableMessage {
    public override var allowAlias: Boolean?
    public override var deprecated: Boolean?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface EnumValueOptions : pbandk.ExtendableMessage {
    public val deprecated: Boolean?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.EnumValueOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions>

    /**
     * The [MutableEnumValueOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit): pbandk.wkt.EnumValueOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        deprecated: Boolean? = this.deprecated,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.EnumValueOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.EnumValueOptions> {
        public val defaultInstance: pbandk.wkt.EnumValueOptions by lazy { pbandk.wkt.EnumValueOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.EnumValueOptions = pbandk.wkt.EnumValueOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.EnumValueOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.EnumValueOptions, *>>(2)
            fieldsList.apply {
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
                fullName = "google.protobuf.EnumValueOptions",
                messageClass = pbandk.wkt.EnumValueOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableEnumValueOptions : pbandk.wkt.EnumValueOptions, pbandk.MutableMessage {
    public override var deprecated: Boolean?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface ServiceOptions : pbandk.ExtendableMessage {
    public val deprecated: Boolean?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ServiceOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions>

    /**
     * The [MutableServiceOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit): pbandk.wkt.ServiceOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        deprecated: Boolean? = this.deprecated,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ServiceOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.ServiceOptions> {
        public val defaultInstance: pbandk.wkt.ServiceOptions by lazy { pbandk.wkt.ServiceOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.ServiceOptions = pbandk.wkt.ServiceOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ServiceOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ServiceOptions, *>>(2)
            fieldsList.apply {
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
                fullName = "google.protobuf.ServiceOptions",
                messageClass = pbandk.wkt.ServiceOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableServiceOptions : pbandk.wkt.ServiceOptions, pbandk.MutableMessage {
    public override var deprecated: Boolean?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface MethodOptions : pbandk.ExtendableMessage {
    public val deprecated: Boolean?
    public val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?
    public val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.MethodOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions>

    /**
     * The [MutableMethodOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit): pbandk.wkt.MethodOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        deprecated: Boolean? = this.deprecated,
        idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = this.idempotencyLevel,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = this.uninterpretedOption,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.MethodOptions

    public companion object : pbandk.Message.Companion<pbandk.wkt.MethodOptions> {
        public val defaultInstance: pbandk.wkt.MethodOptions by lazy { pbandk.wkt.MethodOptions {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.MethodOptions = pbandk.wkt.MethodOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.MethodOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.MethodOptions, *>>(3)
            fieldsList.apply {
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
                fullName = "google.protobuf.MethodOptions",
                messageClass = pbandk.wkt.MethodOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed class IdempotencyLevel(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.MethodOptions.IdempotencyLevel && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "MethodOptions.IdempotencyLevel.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object IDEMPOTENCY_UNKNOWN : IdempotencyLevel(0, "IDEMPOTENCY_UNKNOWN")
        public object NO_SIDE_EFFECTS : IdempotencyLevel(1, "NO_SIDE_EFFECTS")
        public object IDEMPOTENT : IdempotencyLevel(2, "IDEMPOTENT")
        public class UNRECOGNIZED(value: Int) : IdempotencyLevel(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.MethodOptions.IdempotencyLevel> {
            public val values: List<MethodOptions.IdempotencyLevel> by lazy { listOf(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT) }
            override fun fromValue(value: Int): pbandk.wkt.MethodOptions.IdempotencyLevel = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.MethodOptions.IdempotencyLevel = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No IdempotencyLevel with name: $name")
        }
    }
}

public sealed interface MutableMethodOptions : pbandk.wkt.MethodOptions, pbandk.MutableMessage {
    public override var deprecated: Boolean?
    public override var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?
    public override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>
}

public sealed interface UninterpretedOption : pbandk.Message {
    public val name: List<pbandk.wkt.UninterpretedOption.NamePart>
    public val identifierValue: String?
    public val positiveIntValue: Long?
    public val negativeIntValue: Long?
    public val doubleValue: Double?
    public val stringValue: pbandk.ByteArr?
    public val aggregateValue: String?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UninterpretedOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption>

    /**
     * The [MutableUninterpretedOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit): pbandk.wkt.UninterpretedOption

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: List<pbandk.wkt.UninterpretedOption.NamePart> = this.name,
        identifierValue: String? = this.identifierValue,
        positiveIntValue: Long? = this.positiveIntValue,
        negativeIntValue: Long? = this.negativeIntValue,
        doubleValue: Double? = this.doubleValue,
        stringValue: pbandk.ByteArr? = this.stringValue,
        aggregateValue: String? = this.aggregateValue,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UninterpretedOption

    public companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption> {
        public val defaultInstance: pbandk.wkt.UninterpretedOption by lazy { pbandk.wkt.UninterpretedOption {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UninterpretedOption = pbandk.wkt.UninterpretedOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption, *>>(7)
            fieldsList.apply {
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
                fullName = "google.protobuf.UninterpretedOption",
                messageClass = pbandk.wkt.UninterpretedOption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface NamePart : pbandk.Message {
        public val namePart: String
        public val isExtension: Boolean

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.UninterpretedOption.NamePart
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption.NamePart>

        /**
         * The [MutableNamePart] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit): pbandk.wkt.UninterpretedOption.NamePart

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            namePart: String = this.namePart,
            isExtension: Boolean = this.isExtension,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.UninterpretedOption.NamePart

        public companion object : pbandk.Message.Companion<pbandk.wkt.UninterpretedOption.NamePart> {
            public val defaultInstance: pbandk.wkt.UninterpretedOption.NamePart by lazy { pbandk.wkt.UninterpretedOption.NamePart {} }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UninterpretedOption.NamePart = pbandk.wkt.UninterpretedOption.NamePart.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UninterpretedOption.NamePart> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UninterpretedOption.NamePart, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name_part",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "namePart",
                            value = pbandk.wkt.UninterpretedOption.NamePart::namePart
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "is_extension",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                            jsonName = "isExtension",
                            value = pbandk.wkt.UninterpretedOption.NamePart::isExtension
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.UninterpretedOption.NamePart",
                    messageClass = pbandk.wkt.UninterpretedOption.NamePart::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableNamePart : pbandk.wkt.UninterpretedOption.NamePart, pbandk.MutableMessage {
        public override var namePart: String
        public override var isExtension: Boolean
    }
}

public sealed interface MutableUninterpretedOption : pbandk.wkt.UninterpretedOption, pbandk.MutableMessage {
    public override val name: MutableList<pbandk.wkt.UninterpretedOption.NamePart>
    public override var identifierValue: String?
    public override var positiveIntValue: Long?
    public override var negativeIntValue: Long?
    public override var doubleValue: Double?
    public override var stringValue: pbandk.ByteArr?
    public override var aggregateValue: String?
}

public sealed interface SourceCodeInfo : pbandk.Message {
    public val location: List<pbandk.wkt.SourceCodeInfo.Location>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo>

    /**
     * The [MutableSourceCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit): pbandk.wkt.SourceCodeInfo

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        location: List<pbandk.wkt.SourceCodeInfo.Location> = this.location,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.SourceCodeInfo

    public companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo> {
        public val defaultInstance: pbandk.wkt.SourceCodeInfo by lazy { pbandk.wkt.SourceCodeInfo {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceCodeInfo = pbandk.wkt.SourceCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.SourceCodeInfo, *>>(1)
            fieldsList.apply {
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
                fullName = "google.protobuf.SourceCodeInfo",
                messageClass = pbandk.wkt.SourceCodeInfo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface Location : pbandk.Message {
        public val path: List<Int>
        public val span: List<Int>
        public val leadingComments: String?
        public val trailingComments: String?
        public val leadingDetachedComments: List<String>

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo.Location
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo.Location>

        /**
         * The [MutableLocation] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit): pbandk.wkt.SourceCodeInfo.Location

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            path: List<Int> = this.path,
            span: List<Int> = this.span,
            leadingComments: String? = this.leadingComments,
            trailingComments: String? = this.trailingComments,
            leadingDetachedComments: List<String> = this.leadingDetachedComments,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.SourceCodeInfo.Location

        public companion object : pbandk.Message.Companion<pbandk.wkt.SourceCodeInfo.Location> {
            public val defaultInstance: pbandk.wkt.SourceCodeInfo.Location by lazy { pbandk.wkt.SourceCodeInfo.Location {} }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.SourceCodeInfo.Location = pbandk.wkt.SourceCodeInfo.Location.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.SourceCodeInfo.Location> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.SourceCodeInfo.Location, *>>(5)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = pbandk.wkt.SourceCodeInfo.Location::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "span",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "span",
                            value = pbandk.wkt.SourceCodeInfo.Location::span
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_comments",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "leadingComments",
                            value = pbandk.wkt.SourceCodeInfo.Location::leadingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "trailing_comments",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "trailingComments",
                            value = pbandk.wkt.SourceCodeInfo.Location::trailingComments
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "leading_detached_comments",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                            jsonName = "leadingDetachedComments",
                            value = pbandk.wkt.SourceCodeInfo.Location::leadingDetachedComments
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.SourceCodeInfo.Location",
                    messageClass = pbandk.wkt.SourceCodeInfo.Location::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableLocation : pbandk.wkt.SourceCodeInfo.Location, pbandk.MutableMessage {
        public override val path: MutableList<Int>
        public override val span: MutableList<Int>
        public override var leadingComments: String?
        public override var trailingComments: String?
        public override val leadingDetachedComments: MutableList<String>
    }
}

public sealed interface MutableSourceCodeInfo : pbandk.wkt.SourceCodeInfo, pbandk.MutableMessage {
    public override val location: MutableList<pbandk.wkt.SourceCodeInfo.Location>
}

public sealed interface GeneratedCodeInfo : pbandk.Message {
    public val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo>

    /**
     * The [MutableGeneratedCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit): pbandk.wkt.GeneratedCodeInfo

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = this.annotation,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.GeneratedCodeInfo

    public companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo> {
        public val defaultInstance: pbandk.wkt.GeneratedCodeInfo by lazy { pbandk.wkt.GeneratedCodeInfo {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.GeneratedCodeInfo = pbandk.wkt.GeneratedCodeInfo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo, *>>(1)
            fieldsList.apply {
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
                fullName = "google.protobuf.GeneratedCodeInfo",
                messageClass = pbandk.wkt.GeneratedCodeInfo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    public sealed interface Annotation : pbandk.Message {
        public val path: List<Int>
        public val sourceFile: String?
        public val begin: Int?
        public val end: Int?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo.Annotation
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation>

        /**
         * The [MutableAnnotation] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit): pbandk.wkt.GeneratedCodeInfo.Annotation

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            path: List<Int> = this.path,
            sourceFile: String? = this.sourceFile,
            begin: Int? = this.begin,
            end: Int? = this.end,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.wkt.GeneratedCodeInfo.Annotation

        public companion object : pbandk.Message.Companion<pbandk.wkt.GeneratedCodeInfo.Annotation> {
            public val defaultInstance: pbandk.wkt.GeneratedCodeInfo.Annotation by lazy { pbandk.wkt.GeneratedCodeInfo.Annotation {} }
            override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.GeneratedCodeInfo.Annotation = pbandk.wkt.GeneratedCodeInfo.Annotation.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.GeneratedCodeInfo.Annotation, *>>(4)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "path",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                            jsonName = "path",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::path
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "source_file",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "sourceFile",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::sourceFile
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "begin",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "begin",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::begin
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "end",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "end",
                            value = pbandk.wkt.GeneratedCodeInfo.Annotation::end
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "google.protobuf.GeneratedCodeInfo.Annotation",
                    messageClass = pbandk.wkt.GeneratedCodeInfo.Annotation::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    public sealed interface MutableAnnotation : pbandk.wkt.GeneratedCodeInfo.Annotation, pbandk.MutableMessage {
        public override val path: MutableList<Int>
        public override var sourceFile: String?
        public override var begin: Int?
        public override var end: Int?
    }
}

public sealed interface MutableGeneratedCodeInfo : pbandk.wkt.GeneratedCodeInfo, pbandk.MutableMessage {
    public override val annotation: MutableList<pbandk.wkt.GeneratedCodeInfo.Annotation>
}

@Deprecated(
    message = "Use FileDescriptorSet { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FileDescriptorSet"],
        expression = "FileDescriptorSet {\nthis.file += file\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FileDescriptorSet(
    file: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FileDescriptorSet = pbandk.wkt.FileDescriptorSet {
    this.file += file
    this.unknownFields += unknownFields
}

/**
 * The [MutableFileDescriptorSet] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFileDescriptorSet")
public fun FileDescriptorSet(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit): pbandk.wkt.FileDescriptorSet = pbandk.wkt.MutableFileDescriptorSet_Impl(
    file = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFileDescriptorSet()

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorSet")
public fun FileDescriptorSet?.orDefault(): pbandk.wkt.FileDescriptorSet = this ?: pbandk.wkt.FileDescriptorSet.defaultInstance

private class FileDescriptorSet_Impl(
    override val file: List<pbandk.wkt.FileDescriptorProto>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FileDescriptorSet, pbandk.GeneratedMessage<pbandk.wkt.FileDescriptorSet>() {
    override val descriptor get() = pbandk.wkt.FileDescriptorSet.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit) = pbandk.wkt.FileDescriptorSet {
        this.file += this@FileDescriptorSet_Impl.file
        this.unknownFields += this@FileDescriptorSet_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        file: List<pbandk.wkt.FileDescriptorProto>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FileDescriptorSet {
        this.file += file
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFileDescriptorSet_Impl(
    override val file: MutableList<pbandk.wkt.FileDescriptorProto>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFileDescriptorSet, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableFileDescriptorSet>() {
    override val descriptor get() = pbandk.wkt.FileDescriptorSet.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorSet.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        file: List<pbandk.wkt.FileDescriptorProto>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFileDescriptorSet() = FileDescriptorSet_Impl(
        file = file.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FileDescriptorSet.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FileDescriptorSet {
    if (other !is pbandk.wkt.FileDescriptorSet) return this

    return copy {
        file += other.file
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.FileDescriptorSet {
    var file: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FileDescriptorProto> }
        }
    }
    return FileDescriptorSet_Impl(pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

@Deprecated(
    message = "Use FileDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FileDescriptorProto"],
        expression = "FileDescriptorProto {\nthis.name = name\nthis.`package` = `package`\nthis.dependency += dependency\nthis.publicDependency += publicDependency\nthis.weakDependency += weakDependency\nthis.messageType += messageType\nthis.enumType += enumType\nthis.service += service\nthis.extension += extension\nthis.options = options\nthis.sourceCodeInfo = sourceCodeInfo\nthis.syntax = syntax\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FileDescriptorProto(
    name: String? = null,
    `package`: String? = null,
    dependency: List<String> = emptyList(),
    publicDependency: List<Int> = emptyList(),
    weakDependency: List<Int> = emptyList(),
    messageType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    service: List<pbandk.wkt.ServiceDescriptorProto> = emptyList(),
    extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    options: pbandk.wkt.FileOptions? = null,
    sourceCodeInfo: pbandk.wkt.SourceCodeInfo? = null,
    syntax: String? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FileDescriptorProto = pbandk.wkt.FileDescriptorProto {
    this.name = name
    this.`package` = `package`
    this.dependency += dependency
    this.publicDependency += publicDependency
    this.weakDependency += weakDependency
    this.messageType += messageType
    this.enumType += enumType
    this.service += service
    this.extension += extension
    this.options = options
    this.sourceCodeInfo = sourceCodeInfo
    this.syntax = syntax
    this.unknownFields += unknownFields
}

/**
 * The [MutableFileDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFileDescriptorProto")
public fun FileDescriptorProto(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit): pbandk.wkt.FileDescriptorProto = pbandk.wkt.MutableFileDescriptorProto_Impl(
    name = null,
    `package` = null,
    dependency = mutableListOf(),
    publicDependency = mutableListOf(),
    weakDependency = mutableListOf(),
    messageType = mutableListOf(),
    enumType = mutableListOf(),
    service = mutableListOf(),
    extension = mutableListOf(),
    options = null,
    sourceCodeInfo = null,
    syntax = null,
    unknownFields = mutableMapOf()
).also(builderAction).toFileDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForFileDescriptorProto")
public fun FileDescriptorProto?.orDefault(): pbandk.wkt.FileDescriptorProto = this ?: pbandk.wkt.FileDescriptorProto.defaultInstance

private class FileDescriptorProto_Impl(
    override val name: String?,
    override val `package`: String?,
    override val dependency: List<String>,
    override val publicDependency: List<Int>,
    override val weakDependency: List<Int>,
    override val messageType: List<pbandk.wkt.DescriptorProto>,
    override val enumType: List<pbandk.wkt.EnumDescriptorProto>,
    override val service: List<pbandk.wkt.ServiceDescriptorProto>,
    override val extension: List<pbandk.wkt.FieldDescriptorProto>,
    override val options: pbandk.wkt.FileOptions?,
    override val sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
    override val syntax: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FileDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.FileDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.FileDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit) = pbandk.wkt.FileDescriptorProto {
        this.name = this@FileDescriptorProto_Impl.name
        this.`package` = this@FileDescriptorProto_Impl.`package`
        this.dependency += this@FileDescriptorProto_Impl.dependency
        this.publicDependency += this@FileDescriptorProto_Impl.publicDependency
        this.weakDependency += this@FileDescriptorProto_Impl.weakDependency
        this.messageType += this@FileDescriptorProto_Impl.messageType
        this.enumType += this@FileDescriptorProto_Impl.enumType
        this.service += this@FileDescriptorProto_Impl.service
        this.extension += this@FileDescriptorProto_Impl.extension
        this.options = this@FileDescriptorProto_Impl.options
        this.sourceCodeInfo = this@FileDescriptorProto_Impl.sourceCodeInfo
        this.syntax = this@FileDescriptorProto_Impl.syntax
        this.unknownFields += this@FileDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        `package`: String?,
        dependency: List<String>,
        publicDependency: List<Int>,
        weakDependency: List<Int>,
        messageType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        service: List<pbandk.wkt.ServiceDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        options: pbandk.wkt.FileOptions?,
        sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
        syntax: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FileDescriptorProto {
        this.name = name
        this.`package` = `package`
        this.dependency += dependency
        this.publicDependency += publicDependency
        this.weakDependency += weakDependency
        this.messageType += messageType
        this.enumType += enumType
        this.service += service
        this.extension += extension
        this.options = options
        this.sourceCodeInfo = sourceCodeInfo
        this.syntax = syntax
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFileDescriptorProto_Impl(
    override var name: String?,
    override var `package`: String?,
    override val dependency: MutableList<String>,
    override val publicDependency: MutableList<Int>,
    override val weakDependency: MutableList<Int>,
    override val messageType: MutableList<pbandk.wkt.DescriptorProto>,
    override val enumType: MutableList<pbandk.wkt.EnumDescriptorProto>,
    override val service: MutableList<pbandk.wkt.ServiceDescriptorProto>,
    override val extension: MutableList<pbandk.wkt.FieldDescriptorProto>,
    override var options: pbandk.wkt.FileOptions?,
    override var sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
    override var syntax: String?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFileDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableFileDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.FileDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFileDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        `package`: String?,
        dependency: List<String>,
        publicDependency: List<Int>,
        weakDependency: List<Int>,
        messageType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        service: List<pbandk.wkt.ServiceDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        options: pbandk.wkt.FileOptions?,
        sourceCodeInfo: pbandk.wkt.SourceCodeInfo?,
        syntax: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFileDescriptorProto() = FileDescriptorProto_Impl(
        name = name,
        `package` = `package`,
        dependency = dependency.toList(),
        publicDependency = publicDependency.toList(),
        weakDependency = weakDependency.toList(),
        messageType = messageType.toList(),
        enumType = enumType.toList(),
        service = service.toList(),
        extension = extension.toList(),
        options = options,
        sourceCodeInfo = sourceCodeInfo,
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )
}

private fun FileDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FileDescriptorProto {
    if (other !is pbandk.wkt.FileDescriptorProto) return this

    return copy {
        name = other.name ?: name
        `package` = other.`package` ?: `package`
        dependency += other.dependency
        publicDependency += other.publicDependency
        weakDependency += other.weakDependency
        messageType += other.messageType
        enumType += other.enumType
        service += other.service
        extension += other.extension
        options = options?.plus(other.options) ?: other.options
        sourceCodeInfo = sourceCodeInfo?.plus(other.sourceCodeInfo) ?: other.sourceCodeInfo
        syntax = other.syntax ?: syntax
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FileDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.FileDescriptorProto {
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
    return FileDescriptorProto_Impl(name, `package`, pbandk.ListWithSize.Builder.fixed(dependency), pbandk.ListWithSize.Builder.fixed(publicDependency),
        pbandk.ListWithSize.Builder.fixed(weakDependency), pbandk.ListWithSize.Builder.fixed(messageType), pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(service),
        pbandk.ListWithSize.Builder.fixed(extension), options, sourceCodeInfo, syntax, unknownFields)
}

@Deprecated(
    message = "Use DescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.DescriptorProto"],
        expression = "DescriptorProto {\nthis.name = name\nthis.field += field\nthis.extension += extension\nthis.nestedType += nestedType\nthis.enumType += enumType\nthis.extensionRange += extensionRange\nthis.oneofDecl += oneofDecl\nthis.options = options\nthis.reservedRange += reservedRange\nthis.reservedName += reservedName\nthis.unknownFields += unknownFields\n}",
    )
)
public fun DescriptorProto(
    name: String? = null,
    field: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    extension: List<pbandk.wkt.FieldDescriptorProto> = emptyList(),
    nestedType: List<pbandk.wkt.DescriptorProto> = emptyList(),
    enumType: List<pbandk.wkt.EnumDescriptorProto> = emptyList(),
    extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange> = emptyList(),
    oneofDecl: List<pbandk.wkt.OneofDescriptorProto> = emptyList(),
    options: pbandk.wkt.MessageOptions? = null,
    reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange> = emptyList(),
    reservedName: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.DescriptorProto = pbandk.wkt.DescriptorProto {
    this.name = name
    this.field += field
    this.extension += extension
    this.nestedType += nestedType
    this.enumType += enumType
    this.extensionRange += extensionRange
    this.oneofDecl += oneofDecl
    this.options = options
    this.reservedRange += reservedRange
    this.reservedName += reservedName
    this.unknownFields += unknownFields
}

/**
 * The [MutableDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDescriptorProto")
public fun DescriptorProto(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit): pbandk.wkt.DescriptorProto = pbandk.wkt.MutableDescriptorProto_Impl(
    name = null,
    field = mutableListOf(),
    extension = mutableListOf(),
    nestedType = mutableListOf(),
    enumType = mutableListOf(),
    extensionRange = mutableListOf(),
    oneofDecl = mutableListOf(),
    options = null,
    reservedRange = mutableListOf(),
    reservedName = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProto")
public fun DescriptorProto?.orDefault(): pbandk.wkt.DescriptorProto = this ?: pbandk.wkt.DescriptorProto.defaultInstance

private class DescriptorProto_Impl(
    override val name: String?,
    override val field: List<pbandk.wkt.FieldDescriptorProto>,
    override val extension: List<pbandk.wkt.FieldDescriptorProto>,
    override val nestedType: List<pbandk.wkt.DescriptorProto>,
    override val enumType: List<pbandk.wkt.EnumDescriptorProto>,
    override val extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>,
    override val oneofDecl: List<pbandk.wkt.OneofDescriptorProto>,
    override val options: pbandk.wkt.MessageOptions?,
    override val reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>,
    override val reservedName: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.DescriptorProto>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit) = pbandk.wkt.DescriptorProto {
        this.name = this@DescriptorProto_Impl.name
        this.field += this@DescriptorProto_Impl.field
        this.extension += this@DescriptorProto_Impl.extension
        this.nestedType += this@DescriptorProto_Impl.nestedType
        this.enumType += this@DescriptorProto_Impl.enumType
        this.extensionRange += this@DescriptorProto_Impl.extensionRange
        this.oneofDecl += this@DescriptorProto_Impl.oneofDecl
        this.options = this@DescriptorProto_Impl.options
        this.reservedRange += this@DescriptorProto_Impl.reservedRange
        this.reservedName += this@DescriptorProto_Impl.reservedName
        this.unknownFields += this@DescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        field: List<pbandk.wkt.FieldDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        nestedType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>,
        oneofDecl: List<pbandk.wkt.OneofDescriptorProto>,
        options: pbandk.wkt.MessageOptions?,
        reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.DescriptorProto {
        this.name = name
        this.field += field
        this.extension += extension
        this.nestedType += nestedType
        this.enumType += enumType
        this.extensionRange += extensionRange
        this.oneofDecl += oneofDecl
        this.options = options
        this.reservedRange += reservedRange
        this.reservedName += reservedName
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableDescriptorProto_Impl(
    override var name: String?,
    override val field: MutableList<pbandk.wkt.FieldDescriptorProto>,
    override val extension: MutableList<pbandk.wkt.FieldDescriptorProto>,
    override val nestedType: MutableList<pbandk.wkt.DescriptorProto>,
    override val enumType: MutableList<pbandk.wkt.EnumDescriptorProto>,
    override val extensionRange: MutableList<pbandk.wkt.DescriptorProto.ExtensionRange>,
    override val oneofDecl: MutableList<pbandk.wkt.OneofDescriptorProto>,
    override var options: pbandk.wkt.MessageOptions?,
    override val reservedRange: MutableList<pbandk.wkt.DescriptorProto.ReservedRange>,
    override val reservedName: MutableList<String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        field: List<pbandk.wkt.FieldDescriptorProto>,
        extension: List<pbandk.wkt.FieldDescriptorProto>,
        nestedType: List<pbandk.wkt.DescriptorProto>,
        enumType: List<pbandk.wkt.EnumDescriptorProto>,
        extensionRange: List<pbandk.wkt.DescriptorProto.ExtensionRange>,
        oneofDecl: List<pbandk.wkt.OneofDescriptorProto>,
        options: pbandk.wkt.MessageOptions?,
        reservedRange: List<pbandk.wkt.DescriptorProto.ReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toDescriptorProto() = DescriptorProto_Impl(
        name = name,
        field = field.toList(),
        extension = extension.toList(),
        nestedType = nestedType.toList(),
        enumType = enumType.toList(),
        extensionRange = extensionRange.toList(),
        oneofDecl = oneofDecl.toList(),
        options = options,
        reservedRange = reservedRange.toList(),
        reservedName = reservedName.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun DescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.DescriptorProto {
    if (other !is pbandk.wkt.DescriptorProto) return this

    return copy {
        name = other.name ?: name
        field += other.field
        extension += other.extension
        nestedType += other.nestedType
        enumType += other.enumType
        extensionRange += other.extensionRange
        oneofDecl += other.oneofDecl
        options = options?.plus(other.options) ?: other.options
        reservedRange += other.reservedRange
        reservedName += other.reservedName
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto {
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
    return DescriptorProto_Impl(name, pbandk.ListWithSize.Builder.fixed(field), pbandk.ListWithSize.Builder.fixed(extension), pbandk.ListWithSize.Builder.fixed(nestedType),
        pbandk.ListWithSize.Builder.fixed(enumType), pbandk.ListWithSize.Builder.fixed(extensionRange), pbandk.ListWithSize.Builder.fixed(oneofDecl), options,
        pbandk.ListWithSize.Builder.fixed(reservedRange), pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

@Deprecated(
    message = "Use DescriptorProto.ExtensionRange { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.DescriptorProto.ExtensionRange"],
        expression = "DescriptorProto.ExtensionRange {\nthis.start = start\nthis.end = end\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun DescriptorProto.Companion.ExtensionRange(
    start: Int? = null,
    end: Int? = null,
    options: pbandk.wkt.ExtensionRangeOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.DescriptorProto.ExtensionRange = pbandk.wkt.DescriptorProto.Companion.ExtensionRange {
    this.start = start
    this.end = end
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableExtensionRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDescriptorProtoExtensionRange")
public fun DescriptorProto.Companion.ExtensionRange(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit): pbandk.wkt.DescriptorProto.ExtensionRange = pbandk.wkt.DescriptorProto_MutableExtensionRange_Impl(
    start = null,
    end = null,
    options = null,
    unknownFields = mutableMapOf()
).also(builderAction).toExtensionRange()

/**
 * The [MutableExtensionRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableDescriptorProto.ExtensionRange(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit): pbandk.wkt.DescriptorProto.ExtensionRange =
    pbandk.wkt.DescriptorProto.ExtensionRange(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoExtensionRange")
public fun DescriptorProto.ExtensionRange?.orDefault(): pbandk.wkt.DescriptorProto.ExtensionRange = this ?: pbandk.wkt.DescriptorProto.ExtensionRange.defaultInstance

private class DescriptorProto_ExtensionRange_Impl(
    override val start: Int?,
    override val end: Int?,
    override val options: pbandk.wkt.ExtensionRangeOptions?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto.ExtensionRange, pbandk.GeneratedMessage<pbandk.wkt.DescriptorProto.ExtensionRange>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ExtensionRange.descriptor

    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit) = pbandk.wkt.DescriptorProto.ExtensionRange {
        this.start = this@DescriptorProto_ExtensionRange_Impl.start
        this.end = this@DescriptorProto_ExtensionRange_Impl.end
        this.options = this@DescriptorProto_ExtensionRange_Impl.options
        this.unknownFields += this@DescriptorProto_ExtensionRange_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        options: pbandk.wkt.ExtensionRangeOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.DescriptorProto.ExtensionRange {
        this.start = start
        this.end = end
        this.options = options
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class DescriptorProto_MutableExtensionRange_Impl(
    override var start: Int?,
    override var end: Int?,
    override var options: pbandk.wkt.ExtensionRangeOptions?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto.MutableExtensionRange, pbandk.MutableGeneratedMessage<pbandk.wkt.DescriptorProto.MutableExtensionRange>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ExtensionRange.descriptor

    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableExtensionRange.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        options: pbandk.wkt.ExtensionRangeOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toExtensionRange() = DescriptorProto_ExtensionRange_Impl(
        start = start,
        end = end,
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

private fun DescriptorProto.ExtensionRange.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ExtensionRange {
    if (other !is pbandk.wkt.DescriptorProto.ExtensionRange) return this

    return copy {
        start = other.start ?: start
        end = other.end ?: end
        options = options?.plus(other.options) ?: other.options
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ExtensionRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto.ExtensionRange {
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
    return DescriptorProto_ExtensionRange_Impl(start, end, options, unknownFields)
}

@Deprecated(
    message = "Use DescriptorProto.ReservedRange { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.DescriptorProto.ReservedRange"],
        expression = "DescriptorProto.ReservedRange {\nthis.start = start\nthis.end = end\nthis.unknownFields += unknownFields\n}",
    )
)
public fun DescriptorProto.Companion.ReservedRange(
    start: Int? = null,
    end: Int? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.DescriptorProto.ReservedRange = pbandk.wkt.DescriptorProto.Companion.ReservedRange {
    this.start = start
    this.end = end
    this.unknownFields += unknownFields
}

/**
 * The [MutableReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDescriptorProtoReservedRange")
public fun DescriptorProto.Companion.ReservedRange(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit): pbandk.wkt.DescriptorProto.ReservedRange = pbandk.wkt.DescriptorProto_MutableReservedRange_Impl(
    start = null,
    end = null,
    unknownFields = mutableMapOf()
).also(builderAction).toReservedRange()

/**
 * The [MutableReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableDescriptorProto.ReservedRange(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit): pbandk.wkt.DescriptorProto.ReservedRange =
    pbandk.wkt.DescriptorProto.ReservedRange(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForDescriptorProtoReservedRange")
public fun DescriptorProto.ReservedRange?.orDefault(): pbandk.wkt.DescriptorProto.ReservedRange = this ?: pbandk.wkt.DescriptorProto.ReservedRange.defaultInstance

private class DescriptorProto_ReservedRange_Impl(
    override val start: Int?,
    override val end: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto.ReservedRange, pbandk.GeneratedMessage<pbandk.wkt.DescriptorProto.ReservedRange>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ReservedRange.descriptor

    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit) = pbandk.wkt.DescriptorProto.ReservedRange {
        this.start = this@DescriptorProto_ReservedRange_Impl.start
        this.end = this@DescriptorProto_ReservedRange_Impl.end
        this.unknownFields += this@DescriptorProto_ReservedRange_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.DescriptorProto.ReservedRange {
        this.start = start
        this.end = end
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class DescriptorProto_MutableReservedRange_Impl(
    override var start: Int?,
    override var end: Int?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.DescriptorProto.MutableReservedRange, pbandk.MutableGeneratedMessage<pbandk.wkt.DescriptorProto.MutableReservedRange>() {
    override val descriptor get() = pbandk.wkt.DescriptorProto.ReservedRange.descriptor

    override fun copy(builderAction: pbandk.wkt.DescriptorProto.MutableReservedRange.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toReservedRange() = DescriptorProto_ReservedRange_Impl(
        start = start,
        end = end,
        unknownFields = unknownFields.toMap()
    )
}

private fun DescriptorProto.ReservedRange.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.DescriptorProto.ReservedRange {
    if (other !is pbandk.wkt.DescriptorProto.ReservedRange) return this

    return copy {
        start = other.start ?: start
        end = other.end ?: end
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun DescriptorProto.ReservedRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.DescriptorProto.ReservedRange {
    var start: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
        }
    }
    return DescriptorProto_ReservedRange_Impl(start, end, unknownFields)
}

@Deprecated(
    message = "Use ExtensionRangeOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ExtensionRangeOptions"],
        expression = "ExtensionRangeOptions {\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ExtensionRangeOptions(
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ExtensionRangeOptions = pbandk.wkt.ExtensionRangeOptions {
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableExtensionRangeOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildExtensionRangeOptions")
public fun ExtensionRangeOptions(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit): pbandk.wkt.ExtensionRangeOptions = pbandk.wkt.MutableExtensionRangeOptions_Impl(
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toExtensionRangeOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForExtensionRangeOptions")
public fun ExtensionRangeOptions?.orDefault(): pbandk.wkt.ExtensionRangeOptions = this ?: pbandk.wkt.ExtensionRangeOptions.defaultInstance

private class ExtensionRangeOptions_Impl(
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ExtensionRangeOptions, pbandk.GeneratedMessage<pbandk.wkt.ExtensionRangeOptions>() {
    override val descriptor get() = pbandk.wkt.ExtensionRangeOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit) = pbandk.wkt.ExtensionRangeOptions {
        this.uninterpretedOption += this@ExtensionRangeOptions_Impl.uninterpretedOption
        this.unknownFields += this@ExtensionRangeOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.ExtensionRangeOptions {
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableExtensionRangeOptions_Impl(
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableExtensionRangeOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableExtensionRangeOptions>() {
    override val descriptor get() = pbandk.wkt.ExtensionRangeOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableExtensionRangeOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toExtensionRangeOptions() = ExtensionRangeOptions_Impl(
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun ExtensionRangeOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.ExtensionRangeOptions {
    if (other !is pbandk.wkt.ExtensionRangeOptions) return this

    return copy {
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun ExtensionRangeOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.ExtensionRangeOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return ExtensionRangeOptions_Impl(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use FieldDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FieldDescriptorProto"],
        expression = "FieldDescriptorProto {\nthis.name = name\nthis.number = number\nthis.label = label\nthis.type = type\nthis.typeName = typeName\nthis.extendee = extendee\nthis.defaultValue = defaultValue\nthis.oneofIndex = oneofIndex\nthis.jsonName = jsonName\nthis.options = options\nthis.proto3Optional = proto3Optional\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FieldDescriptorProto(
    name: String? = null,
    number: Int? = null,
    label: pbandk.wkt.FieldDescriptorProto.Label? = null,
    type: pbandk.wkt.FieldDescriptorProto.Type? = null,
    typeName: String? = null,
    extendee: String? = null,
    defaultValue: String? = null,
    oneofIndex: Int? = null,
    jsonName: String? = null,
    options: pbandk.wkt.FieldOptions? = null,
    proto3Optional: Boolean? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FieldDescriptorProto = pbandk.wkt.FieldDescriptorProto {
    this.name = name
    this.number = number
    this.label = label
    this.type = type
    this.typeName = typeName
    this.extendee = extendee
    this.defaultValue = defaultValue
    this.oneofIndex = oneofIndex
    this.jsonName = jsonName
    this.options = options
    this.proto3Optional = proto3Optional
    this.unknownFields += unknownFields
}

/**
 * The [MutableFieldDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldDescriptorProto")
public fun FieldDescriptorProto(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit): pbandk.wkt.FieldDescriptorProto = pbandk.wkt.MutableFieldDescriptorProto_Impl(
    name = null,
    number = null,
    label = null,
    type = null,
    typeName = null,
    extendee = null,
    defaultValue = null,
    oneofIndex = null,
    jsonName = null,
    options = null,
    proto3Optional = null,
    unknownFields = mutableMapOf()
).also(builderAction).toFieldDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldDescriptorProto")
public fun FieldDescriptorProto?.orDefault(): pbandk.wkt.FieldDescriptorProto = this ?: pbandk.wkt.FieldDescriptorProto.defaultInstance

private class FieldDescriptorProto_Impl(
    override val name: String?,
    override val number: Int?,
    override val label: pbandk.wkt.FieldDescriptorProto.Label?,
    override val type: pbandk.wkt.FieldDescriptorProto.Type?,
    override val typeName: String?,
    override val extendee: String?,
    override val defaultValue: String?,
    override val oneofIndex: Int?,
    override val jsonName: String?,
    override val options: pbandk.wkt.FieldOptions?,
    override val proto3Optional: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.FieldDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.FieldDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit) = pbandk.wkt.FieldDescriptorProto {
        this.name = this@FieldDescriptorProto_Impl.name
        this.number = this@FieldDescriptorProto_Impl.number
        this.label = this@FieldDescriptorProto_Impl.label
        this.type = this@FieldDescriptorProto_Impl.type
        this.typeName = this@FieldDescriptorProto_Impl.typeName
        this.extendee = this@FieldDescriptorProto_Impl.extendee
        this.defaultValue = this@FieldDescriptorProto_Impl.defaultValue
        this.oneofIndex = this@FieldDescriptorProto_Impl.oneofIndex
        this.jsonName = this@FieldDescriptorProto_Impl.jsonName
        this.options = this@FieldDescriptorProto_Impl.options
        this.proto3Optional = this@FieldDescriptorProto_Impl.proto3Optional
        this.unknownFields += this@FieldDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        label: pbandk.wkt.FieldDescriptorProto.Label?,
        type: pbandk.wkt.FieldDescriptorProto.Type?,
        typeName: String?,
        extendee: String?,
        defaultValue: String?,
        oneofIndex: Int?,
        jsonName: String?,
        options: pbandk.wkt.FieldOptions?,
        proto3Optional: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FieldDescriptorProto {
        this.name = name
        this.number = number
        this.label = label
        this.type = type
        this.typeName = typeName
        this.extendee = extendee
        this.defaultValue = defaultValue
        this.oneofIndex = oneofIndex
        this.jsonName = jsonName
        this.options = options
        this.proto3Optional = proto3Optional
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFieldDescriptorProto_Impl(
    override var name: String?,
    override var number: Int?,
    override var label: pbandk.wkt.FieldDescriptorProto.Label?,
    override var type: pbandk.wkt.FieldDescriptorProto.Type?,
    override var typeName: String?,
    override var extendee: String?,
    override var defaultValue: String?,
    override var oneofIndex: Int?,
    override var jsonName: String?,
    override var options: pbandk.wkt.FieldOptions?,
    override var proto3Optional: Boolean?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFieldDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableFieldDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.FieldDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFieldDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        label: pbandk.wkt.FieldDescriptorProto.Label?,
        type: pbandk.wkt.FieldDescriptorProto.Type?,
        typeName: String?,
        extendee: String?,
        defaultValue: String?,
        oneofIndex: Int?,
        jsonName: String?,
        options: pbandk.wkt.FieldOptions?,
        proto3Optional: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFieldDescriptorProto() = FieldDescriptorProto_Impl(
        name = name,
        number = number,
        label = label,
        type = type,
        typeName = typeName,
        extendee = extendee,
        defaultValue = defaultValue,
        oneofIndex = oneofIndex,
        jsonName = jsonName,
        options = options,
        proto3Optional = proto3Optional,
        unknownFields = unknownFields.toMap()
    )
}

private fun FieldDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FieldDescriptorProto {
    if (other !is pbandk.wkt.FieldDescriptorProto) return this

    return copy {
        name = other.name ?: name
        number = other.number ?: number
        label = other.label ?: label
        type = other.type ?: type
        typeName = other.typeName ?: typeName
        extendee = other.extendee ?: extendee
        defaultValue = other.defaultValue ?: defaultValue
        oneofIndex = other.oneofIndex ?: oneofIndex
        jsonName = other.jsonName ?: jsonName
        options = options?.plus(other.options) ?: other.options
        proto3Optional = other.proto3Optional ?: proto3Optional
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FieldDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.FieldDescriptorProto {
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
    return FieldDescriptorProto_Impl(name, number, label, type,
        typeName, extendee, defaultValue, oneofIndex,
        jsonName, options, proto3Optional, unknownFields)
}

@Deprecated(
    message = "Use OneofDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.OneofDescriptorProto"],
        expression = "OneofDescriptorProto {\nthis.name = name\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun OneofDescriptorProto(
    name: String? = null,
    options: pbandk.wkt.OneofOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.OneofDescriptorProto = pbandk.wkt.OneofDescriptorProto {
    this.name = name
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableOneofDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildOneofDescriptorProto")
public fun OneofDescriptorProto(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit): pbandk.wkt.OneofDescriptorProto = pbandk.wkt.MutableOneofDescriptorProto_Impl(
    name = null,
    options = null,
    unknownFields = mutableMapOf()
).also(builderAction).toOneofDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForOneofDescriptorProto")
public fun OneofDescriptorProto?.orDefault(): pbandk.wkt.OneofDescriptorProto = this ?: pbandk.wkt.OneofDescriptorProto.defaultInstance

private class OneofDescriptorProto_Impl(
    override val name: String?,
    override val options: pbandk.wkt.OneofOptions?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.OneofDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.OneofDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.OneofDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit) = pbandk.wkt.OneofDescriptorProto {
        this.name = this@OneofDescriptorProto_Impl.name
        this.options = this@OneofDescriptorProto_Impl.options
        this.unknownFields += this@OneofDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        options: pbandk.wkt.OneofOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.OneofDescriptorProto {
        this.name = name
        this.options = options
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableOneofDescriptorProto_Impl(
    override var name: String?,
    override var options: pbandk.wkt.OneofOptions?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableOneofDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableOneofDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.OneofDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableOneofDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        options: pbandk.wkt.OneofOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toOneofDescriptorProto() = OneofDescriptorProto_Impl(
        name = name,
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

private fun OneofDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.OneofDescriptorProto {
    if (other !is pbandk.wkt.OneofDescriptorProto) return this

    return copy {
        name = other.name ?: name
        options = options?.plus(other.options) ?: other.options
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun OneofDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.OneofDescriptorProto {
    var name: String? = null
    var options: pbandk.wkt.OneofOptions? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> options = _fieldValue as pbandk.wkt.OneofOptions
        }
    }
    return OneofDescriptorProto_Impl(name, options, unknownFields)
}

@Deprecated(
    message = "Use EnumDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumDescriptorProto"],
        expression = "EnumDescriptorProto {\nthis.name = name\nthis.value += value\nthis.options = options\nthis.reservedRange += reservedRange\nthis.reservedName += reservedName\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumDescriptorProto(
    name: String? = null,
    value: List<pbandk.wkt.EnumValueDescriptorProto> = emptyList(),
    options: pbandk.wkt.EnumOptions? = null,
    reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange> = emptyList(),
    reservedName: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumDescriptorProto = pbandk.wkt.EnumDescriptorProto {
    this.name = name
    this.value += value
    this.options = options
    this.reservedRange += reservedRange
    this.reservedName += reservedName
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumDescriptorProto")
public fun EnumDescriptorProto(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit): pbandk.wkt.EnumDescriptorProto = pbandk.wkt.MutableEnumDescriptorProto_Impl(
    name = null,
    value = mutableListOf(),
    options = null,
    reservedRange = mutableListOf(),
    reservedName = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toEnumDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProto")
public fun EnumDescriptorProto?.orDefault(): pbandk.wkt.EnumDescriptorProto = this ?: pbandk.wkt.EnumDescriptorProto.defaultInstance

private class EnumDescriptorProto_Impl(
    override val name: String?,
    override val value: List<pbandk.wkt.EnumValueDescriptorProto>,
    override val options: pbandk.wkt.EnumOptions?,
    override val reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
    override val reservedName: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.EnumDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit) = pbandk.wkt.EnumDescriptorProto {
        this.name = this@EnumDescriptorProto_Impl.name
        this.value += this@EnumDescriptorProto_Impl.value
        this.options = this@EnumDescriptorProto_Impl.options
        this.reservedRange += this@EnumDescriptorProto_Impl.reservedRange
        this.reservedName += this@EnumDescriptorProto_Impl.reservedName
        this.unknownFields += this@EnumDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        value: List<pbandk.wkt.EnumValueDescriptorProto>,
        options: pbandk.wkt.EnumOptions?,
        reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.EnumDescriptorProto {
        this.name = name
        this.value += value
        this.options = options
        this.reservedRange += reservedRange
        this.reservedName += reservedName
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableEnumDescriptorProto_Impl(
    override var name: String?,
    override val value: MutableList<pbandk.wkt.EnumValueDescriptorProto>,
    override var options: pbandk.wkt.EnumOptions?,
    override val reservedRange: MutableList<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
    override val reservedName: MutableList<String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEnumDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEnumDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnumDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        value: List<pbandk.wkt.EnumValueDescriptorProto>,
        options: pbandk.wkt.EnumOptions?,
        reservedRange: List<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>,
        reservedName: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEnumDescriptorProto() = EnumDescriptorProto_Impl(
        name = name,
        value = value.toList(),
        options = options,
        reservedRange = reservedRange.toList(),
        reservedName = reservedName.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun EnumDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto {
    if (other !is pbandk.wkt.EnumDescriptorProto) return this

    return copy {
        name = other.name ?: name
        value += other.value
        options = options?.plus(other.options) ?: other.options
        reservedRange += other.reservedRange
        reservedName += other.reservedName
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.EnumDescriptorProto {
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
    return EnumDescriptorProto_Impl(name, pbandk.ListWithSize.Builder.fixed(value), options, pbandk.ListWithSize.Builder.fixed(reservedRange),
        pbandk.ListWithSize.Builder.fixed(reservedName), unknownFields)
}

@Deprecated(
    message = "Use EnumDescriptorProto.EnumReservedRange { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumDescriptorProto.EnumReservedRange"],
        expression = "EnumDescriptorProto.EnumReservedRange {\nthis.start = start\nthis.end = end\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumDescriptorProto.Companion.EnumReservedRange(
    start: Int? = null,
    end: Int? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = pbandk.wkt.EnumDescriptorProto.Companion.EnumReservedRange {
    this.start = start
    this.end = end
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumDescriptorProtoEnumReservedRange")
public fun EnumDescriptorProto.Companion.EnumReservedRange(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = pbandk.wkt.EnumDescriptorProto_MutableEnumReservedRange_Impl(
    start = null,
    end = null,
    unknownFields = mutableMapOf()
).also(builderAction).toEnumReservedRange()

/**
 * The [MutableEnumReservedRange] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableEnumDescriptorProto.EnumReservedRange(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit): pbandk.wkt.EnumDescriptorProto.EnumReservedRange =
    pbandk.wkt.EnumDescriptorProto.EnumReservedRange(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForEnumDescriptorProtoEnumReservedRange")
public fun EnumDescriptorProto.EnumReservedRange?.orDefault(): pbandk.wkt.EnumDescriptorProto.EnumReservedRange = this ?: pbandk.wkt.EnumDescriptorProto.EnumReservedRange.defaultInstance

private class EnumDescriptorProto_EnumReservedRange_Impl(
    override val start: Int?,
    override val end: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumDescriptorProto.EnumReservedRange, pbandk.GeneratedMessage<pbandk.wkt.EnumDescriptorProto.EnumReservedRange>() {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.descriptor

    override fun copy(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit) = pbandk.wkt.EnumDescriptorProto.EnumReservedRange {
        this.start = this@EnumDescriptorProto_EnumReservedRange_Impl.start
        this.end = this@EnumDescriptorProto_EnumReservedRange_Impl.end
        this.unknownFields += this@EnumDescriptorProto_EnumReservedRange_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.EnumDescriptorProto.EnumReservedRange {
        this.start = start
        this.end = end
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class EnumDescriptorProto_MutableEnumReservedRange_Impl(
    override var start: Int?,
    override var end: Int?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange, pbandk.MutableGeneratedMessage<pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange>() {
    override val descriptor get() = pbandk.wkt.EnumDescriptorProto.EnumReservedRange.descriptor

    override fun copy(builderAction: pbandk.wkt.EnumDescriptorProto.MutableEnumReservedRange.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        start: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEnumReservedRange() = EnumDescriptorProto_EnumReservedRange_Impl(
        start = start,
        end = end,
        unknownFields = unknownFields.toMap()
    )
}

private fun EnumDescriptorProto.EnumReservedRange.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.EnumDescriptorProto.EnumReservedRange {
    if (other !is pbandk.wkt.EnumDescriptorProto.EnumReservedRange) return this

    return copy {
        start = other.start ?: start
        end = other.end ?: end
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumDescriptorProto.EnumReservedRange.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.EnumDescriptorProto.EnumReservedRange {
    var start: Int? = null
    var end: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> start = _fieldValue as Int
            2 -> end = _fieldValue as Int
        }
    }
    return EnumDescriptorProto_EnumReservedRange_Impl(start, end, unknownFields)
}

@Deprecated(
    message = "Use EnumValueDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumValueDescriptorProto"],
        expression = "EnumValueDescriptorProto {\nthis.name = name\nthis.number = number\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumValueDescriptorProto(
    name: String? = null,
    number: Int? = null,
    options: pbandk.wkt.EnumValueOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumValueDescriptorProto = pbandk.wkt.EnumValueDescriptorProto {
    this.name = name
    this.number = number
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumValueDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumValueDescriptorProto")
public fun EnumValueDescriptorProto(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit): pbandk.wkt.EnumValueDescriptorProto = pbandk.wkt.MutableEnumValueDescriptorProto_Impl(
    name = null,
    number = null,
    options = null,
    unknownFields = mutableMapOf()
).also(builderAction).toEnumValueDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueDescriptorProto")
public fun EnumValueDescriptorProto?.orDefault(): pbandk.wkt.EnumValueDescriptorProto = this ?: pbandk.wkt.EnumValueDescriptorProto.defaultInstance

private class EnumValueDescriptorProto_Impl(
    override val name: String?,
    override val number: Int?,
    override val options: pbandk.wkt.EnumValueOptions?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumValueDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.EnumValueDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.EnumValueDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit) = pbandk.wkt.EnumValueDescriptorProto {
        this.name = this@EnumValueDescriptorProto_Impl.name
        this.number = this@EnumValueDescriptorProto_Impl.number
        this.options = this@EnumValueDescriptorProto_Impl.options
        this.unknownFields += this@EnumValueDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        options: pbandk.wkt.EnumValueOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.EnumValueDescriptorProto {
        this.name = name
        this.number = number
        this.options = options
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableEnumValueDescriptorProto_Impl(
    override var name: String?,
    override var number: Int?,
    override var options: pbandk.wkt.EnumValueOptions?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEnumValueDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEnumValueDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.EnumValueDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableEnumValueDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        number: Int?,
        options: pbandk.wkt.EnumValueOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEnumValueDescriptorProto() = EnumValueDescriptorProto_Impl(
        name = name,
        number = number,
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

private fun EnumValueDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.EnumValueDescriptorProto {
    if (other !is pbandk.wkt.EnumValueDescriptorProto) return this

    return copy {
        name = other.name ?: name
        number = other.number ?: number
        options = options?.plus(other.options) ?: other.options
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumValueDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.EnumValueDescriptorProto {
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
    return EnumValueDescriptorProto_Impl(name, number, options, unknownFields)
}

@Deprecated(
    message = "Use ServiceDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ServiceDescriptorProto"],
        expression = "ServiceDescriptorProto {\nthis.name = name\nthis.method += method\nthis.options = options\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ServiceDescriptorProto(
    name: String? = null,
    method: List<pbandk.wkt.MethodDescriptorProto> = emptyList(),
    options: pbandk.wkt.ServiceOptions? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ServiceDescriptorProto = pbandk.wkt.ServiceDescriptorProto {
    this.name = name
    this.method += method
    this.options = options
    this.unknownFields += unknownFields
}

/**
 * The [MutableServiceDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildServiceDescriptorProto")
public fun ServiceDescriptorProto(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit): pbandk.wkt.ServiceDescriptorProto = pbandk.wkt.MutableServiceDescriptorProto_Impl(
    name = null,
    method = mutableListOf(),
    options = null,
    unknownFields = mutableMapOf()
).also(builderAction).toServiceDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForServiceDescriptorProto")
public fun ServiceDescriptorProto?.orDefault(): pbandk.wkt.ServiceDescriptorProto = this ?: pbandk.wkt.ServiceDescriptorProto.defaultInstance

private class ServiceDescriptorProto_Impl(
    override val name: String?,
    override val method: List<pbandk.wkt.MethodDescriptorProto>,
    override val options: pbandk.wkt.ServiceOptions?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ServiceDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.ServiceDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.ServiceDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit) = pbandk.wkt.ServiceDescriptorProto {
        this.name = this@ServiceDescriptorProto_Impl.name
        this.method += this@ServiceDescriptorProto_Impl.method
        this.options = this@ServiceDescriptorProto_Impl.options
        this.unknownFields += this@ServiceDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        method: List<pbandk.wkt.MethodDescriptorProto>,
        options: pbandk.wkt.ServiceOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.ServiceDescriptorProto {
        this.name = name
        this.method += method
        this.options = options
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableServiceDescriptorProto_Impl(
    override var name: String?,
    override val method: MutableList<pbandk.wkt.MethodDescriptorProto>,
    override var options: pbandk.wkt.ServiceOptions?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableServiceDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableServiceDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.ServiceDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableServiceDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        method: List<pbandk.wkt.MethodDescriptorProto>,
        options: pbandk.wkt.ServiceOptions?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toServiceDescriptorProto() = ServiceDescriptorProto_Impl(
        name = name,
        method = method.toList(),
        options = options,
        unknownFields = unknownFields.toMap()
    )
}

private fun ServiceDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.ServiceDescriptorProto {
    if (other !is pbandk.wkt.ServiceDescriptorProto) return this

    return copy {
        name = other.name ?: name
        method += other.method
        options = options?.plus(other.options) ?: other.options
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun ServiceDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.ServiceDescriptorProto {
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
    return ServiceDescriptorProto_Impl(name, pbandk.ListWithSize.Builder.fixed(method), options, unknownFields)
}

@Deprecated(
    message = "Use MethodDescriptorProto { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.MethodDescriptorProto"],
        expression = "MethodDescriptorProto {\nthis.name = name\nthis.inputType = inputType\nthis.outputType = outputType\nthis.options = options\nthis.clientStreaming = clientStreaming\nthis.serverStreaming = serverStreaming\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MethodDescriptorProto(
    name: String? = null,
    inputType: String? = null,
    outputType: String? = null,
    options: pbandk.wkt.MethodOptions? = null,
    clientStreaming: Boolean? = null,
    serverStreaming: Boolean? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.MethodDescriptorProto = pbandk.wkt.MethodDescriptorProto {
    this.name = name
    this.inputType = inputType
    this.outputType = outputType
    this.options = options
    this.clientStreaming = clientStreaming
    this.serverStreaming = serverStreaming
    this.unknownFields += unknownFields
}

/**
 * The [MutableMethodDescriptorProto] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMethodDescriptorProto")
public fun MethodDescriptorProto(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit): pbandk.wkt.MethodDescriptorProto = pbandk.wkt.MutableMethodDescriptorProto_Impl(
    name = null,
    inputType = null,
    outputType = null,
    options = null,
    clientStreaming = null,
    serverStreaming = null,
    unknownFields = mutableMapOf()
).also(builderAction).toMethodDescriptorProto()

@pbandk.Export
@pbandk.JsName("orDefaultForMethodDescriptorProto")
public fun MethodDescriptorProto?.orDefault(): pbandk.wkt.MethodDescriptorProto = this ?: pbandk.wkt.MethodDescriptorProto.defaultInstance

private class MethodDescriptorProto_Impl(
    override val name: String?,
    override val inputType: String?,
    override val outputType: String?,
    override val options: pbandk.wkt.MethodOptions?,
    override val clientStreaming: Boolean?,
    override val serverStreaming: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.MethodDescriptorProto, pbandk.GeneratedMessage<pbandk.wkt.MethodDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.MethodDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit) = pbandk.wkt.MethodDescriptorProto {
        this.name = this@MethodDescriptorProto_Impl.name
        this.inputType = this@MethodDescriptorProto_Impl.inputType
        this.outputType = this@MethodDescriptorProto_Impl.outputType
        this.options = this@MethodDescriptorProto_Impl.options
        this.clientStreaming = this@MethodDescriptorProto_Impl.clientStreaming
        this.serverStreaming = this@MethodDescriptorProto_Impl.serverStreaming
        this.unknownFields += this@MethodDescriptorProto_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        inputType: String?,
        outputType: String?,
        options: pbandk.wkt.MethodOptions?,
        clientStreaming: Boolean?,
        serverStreaming: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.MethodDescriptorProto {
        this.name = name
        this.inputType = inputType
        this.outputType = outputType
        this.options = options
        this.clientStreaming = clientStreaming
        this.serverStreaming = serverStreaming
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMethodDescriptorProto_Impl(
    override var name: String?,
    override var inputType: String?,
    override var outputType: String?,
    override var options: pbandk.wkt.MethodOptions?,
    override var clientStreaming: Boolean?,
    override var serverStreaming: Boolean?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableMethodDescriptorProto, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableMethodDescriptorProto>() {
    override val descriptor get() = pbandk.wkt.MethodDescriptorProto.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableMethodDescriptorProto.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String?,
        inputType: String?,
        outputType: String?,
        options: pbandk.wkt.MethodOptions?,
        clientStreaming: Boolean?,
        serverStreaming: Boolean?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMethodDescriptorProto() = MethodDescriptorProto_Impl(
        name = name,
        inputType = inputType,
        outputType = outputType,
        options = options,
        clientStreaming = clientStreaming,
        serverStreaming = serverStreaming,
        unknownFields = unknownFields.toMap()
    )
}

private fun MethodDescriptorProto.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.MethodDescriptorProto {
    if (other !is pbandk.wkt.MethodDescriptorProto) return this

    return copy {
        name = other.name ?: name
        inputType = other.inputType ?: inputType
        outputType = other.outputType ?: outputType
        options = options?.plus(other.options) ?: other.options
        clientStreaming = other.clientStreaming ?: clientStreaming
        serverStreaming = other.serverStreaming ?: serverStreaming
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MethodDescriptorProto.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.MethodDescriptorProto {
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
    return MethodDescriptorProto_Impl(name, inputType, outputType, options,
        clientStreaming, serverStreaming, unknownFields)
}

@Deprecated(
    message = "Use FileOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FileOptions"],
        expression = "FileOptions {\nthis.javaPackage = javaPackage\nthis.javaOuterClassname = javaOuterClassname\nthis.javaMultipleFiles = javaMultipleFiles\nthis.javaGenerateEqualsAndHash = javaGenerateEqualsAndHash\nthis.javaStringCheckUtf8 = javaStringCheckUtf8\nthis.optimizeFor = optimizeFor\nthis.goPackage = goPackage\nthis.ccGenericServices = ccGenericServices\nthis.javaGenericServices = javaGenericServices\nthis.pyGenericServices = pyGenericServices\nthis.phpGenericServices = phpGenericServices\nthis.deprecated = deprecated\nthis.ccEnableArenas = ccEnableArenas\nthis.objcClassPrefix = objcClassPrefix\nthis.csharpNamespace = csharpNamespace\nthis.swiftPrefix = swiftPrefix\nthis.phpClassPrefix = phpClassPrefix\nthis.phpNamespace = phpNamespace\nthis.phpMetadataNamespace = phpMetadataNamespace\nthis.rubyPackage = rubyPackage\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FileOptions(
    javaPackage: String? = null,
    javaOuterClassname: String? = null,
    javaMultipleFiles: Boolean? = null,
    javaGenerateEqualsAndHash: Boolean? = null,
    javaStringCheckUtf8: Boolean? = null,
    optimizeFor: pbandk.wkt.FileOptions.OptimizeMode? = null,
    goPackage: String? = null,
    ccGenericServices: Boolean? = null,
    javaGenericServices: Boolean? = null,
    pyGenericServices: Boolean? = null,
    phpGenericServices: Boolean? = null,
    deprecated: Boolean? = null,
    ccEnableArenas: Boolean? = null,
    objcClassPrefix: String? = null,
    csharpNamespace: String? = null,
    swiftPrefix: String? = null,
    phpClassPrefix: String? = null,
    phpNamespace: String? = null,
    phpMetadataNamespace: String? = null,
    rubyPackage: String? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FileOptions = pbandk.wkt.FileOptions {
    this.javaPackage = javaPackage
    this.javaOuterClassname = javaOuterClassname
    this.javaMultipleFiles = javaMultipleFiles
    @Suppress("DEPRECATION")
    this.javaGenerateEqualsAndHash = javaGenerateEqualsAndHash
    this.javaStringCheckUtf8 = javaStringCheckUtf8
    this.optimizeFor = optimizeFor
    this.goPackage = goPackage
    this.ccGenericServices = ccGenericServices
    this.javaGenericServices = javaGenericServices
    this.pyGenericServices = pyGenericServices
    this.phpGenericServices = phpGenericServices
    this.deprecated = deprecated
    this.ccEnableArenas = ccEnableArenas
    this.objcClassPrefix = objcClassPrefix
    this.csharpNamespace = csharpNamespace
    this.swiftPrefix = swiftPrefix
    this.phpClassPrefix = phpClassPrefix
    this.phpNamespace = phpNamespace
    this.phpMetadataNamespace = phpMetadataNamespace
    this.rubyPackage = rubyPackage
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableFileOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFileOptions")
public fun FileOptions(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit): pbandk.wkt.FileOptions = pbandk.wkt.MutableFileOptions_Impl(
    javaPackage = null,
    javaOuterClassname = null,
    javaMultipleFiles = null,
    javaGenerateEqualsAndHash = null,
    javaStringCheckUtf8 = null,
    optimizeFor = null,
    goPackage = null,
    ccGenericServices = null,
    javaGenericServices = null,
    pyGenericServices = null,
    phpGenericServices = null,
    deprecated = null,
    ccEnableArenas = null,
    objcClassPrefix = null,
    csharpNamespace = null,
    swiftPrefix = null,
    phpClassPrefix = null,
    phpNamespace = null,
    phpMetadataNamespace = null,
    rubyPackage = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFileOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForFileOptions")
public fun FileOptions?.orDefault(): pbandk.wkt.FileOptions = this ?: pbandk.wkt.FileOptions.defaultInstance

private class FileOptions_Impl(
    override val javaPackage: String?,
    override val javaOuterClassname: String?,
    override val javaMultipleFiles: Boolean?,
    override val javaGenerateEqualsAndHash: Boolean?,
    override val javaStringCheckUtf8: Boolean?,
    override val optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
    override val goPackage: String?,
    override val ccGenericServices: Boolean?,
    override val javaGenericServices: Boolean?,
    override val pyGenericServices: Boolean?,
    override val phpGenericServices: Boolean?,
    override val deprecated: Boolean?,
    override val ccEnableArenas: Boolean?,
    override val objcClassPrefix: String?,
    override val csharpNamespace: String?,
    override val swiftPrefix: String?,
    override val phpClassPrefix: String?,
    override val phpNamespace: String?,
    override val phpMetadataNamespace: String?,
    override val rubyPackage: String?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FileOptions, pbandk.GeneratedMessage<pbandk.wkt.FileOptions>() {
    override val descriptor get() = pbandk.wkt.FileOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit) = pbandk.wkt.FileOptions {
        this.javaPackage = this@FileOptions_Impl.javaPackage
        this.javaOuterClassname = this@FileOptions_Impl.javaOuterClassname
        this.javaMultipleFiles = this@FileOptions_Impl.javaMultipleFiles
        @Suppress("DEPRECATION")
        this.javaGenerateEqualsAndHash = this@FileOptions_Impl.javaGenerateEqualsAndHash
        this.javaStringCheckUtf8 = this@FileOptions_Impl.javaStringCheckUtf8
        this.optimizeFor = this@FileOptions_Impl.optimizeFor
        this.goPackage = this@FileOptions_Impl.goPackage
        this.ccGenericServices = this@FileOptions_Impl.ccGenericServices
        this.javaGenericServices = this@FileOptions_Impl.javaGenericServices
        this.pyGenericServices = this@FileOptions_Impl.pyGenericServices
        this.phpGenericServices = this@FileOptions_Impl.phpGenericServices
        this.deprecated = this@FileOptions_Impl.deprecated
        this.ccEnableArenas = this@FileOptions_Impl.ccEnableArenas
        this.objcClassPrefix = this@FileOptions_Impl.objcClassPrefix
        this.csharpNamespace = this@FileOptions_Impl.csharpNamespace
        this.swiftPrefix = this@FileOptions_Impl.swiftPrefix
        this.phpClassPrefix = this@FileOptions_Impl.phpClassPrefix
        this.phpNamespace = this@FileOptions_Impl.phpNamespace
        this.phpMetadataNamespace = this@FileOptions_Impl.phpMetadataNamespace
        this.rubyPackage = this@FileOptions_Impl.rubyPackage
        this.uninterpretedOption += this@FileOptions_Impl.uninterpretedOption
        this.unknownFields += this@FileOptions_Impl.unknownFields
        this.builderAction()
    }

    @Suppress("DEPRECATION")
    @Deprecated("Use copy { } instead")
    override fun copy(
        javaPackage: String?,
        javaOuterClassname: String?,
        javaMultipleFiles: Boolean?,
        javaGenerateEqualsAndHash: Boolean?,
        javaStringCheckUtf8: Boolean?,
        optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
        goPackage: String?,
        ccGenericServices: Boolean?,
        javaGenericServices: Boolean?,
        pyGenericServices: Boolean?,
        phpGenericServices: Boolean?,
        deprecated: Boolean?,
        ccEnableArenas: Boolean?,
        objcClassPrefix: String?,
        csharpNamespace: String?,
        swiftPrefix: String?,
        phpClassPrefix: String?,
        phpNamespace: String?,
        phpMetadataNamespace: String?,
        rubyPackage: String?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FileOptions {
        this.javaPackage = javaPackage
        this.javaOuterClassname = javaOuterClassname
        this.javaMultipleFiles = javaMultipleFiles
        @Suppress("DEPRECATION")
        this.javaGenerateEqualsAndHash = javaGenerateEqualsAndHash
        this.javaStringCheckUtf8 = javaStringCheckUtf8
        this.optimizeFor = optimizeFor
        this.goPackage = goPackage
        this.ccGenericServices = ccGenericServices
        this.javaGenericServices = javaGenericServices
        this.pyGenericServices = pyGenericServices
        this.phpGenericServices = phpGenericServices
        this.deprecated = deprecated
        this.ccEnableArenas = ccEnableArenas
        this.objcClassPrefix = objcClassPrefix
        this.csharpNamespace = csharpNamespace
        this.swiftPrefix = swiftPrefix
        this.phpClassPrefix = phpClassPrefix
        this.phpNamespace = phpNamespace
        this.phpMetadataNamespace = phpMetadataNamespace
        this.rubyPackage = rubyPackage
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFileOptions_Impl(
    override var javaPackage: String?,
    override var javaOuterClassname: String?,
    override var javaMultipleFiles: Boolean?,
    override var javaGenerateEqualsAndHash: Boolean?,
    override var javaStringCheckUtf8: Boolean?,
    override var optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
    override var goPackage: String?,
    override var ccGenericServices: Boolean?,
    override var javaGenericServices: Boolean?,
    override var pyGenericServices: Boolean?,
    override var phpGenericServices: Boolean?,
    override var deprecated: Boolean?,
    override var ccEnableArenas: Boolean?,
    override var objcClassPrefix: String?,
    override var csharpNamespace: String?,
    override var swiftPrefix: String?,
    override var phpClassPrefix: String?,
    override var phpNamespace: String?,
    override var phpMetadataNamespace: String?,
    override var rubyPackage: String?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFileOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableFileOptions>() {
    override val descriptor get() = pbandk.wkt.FileOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableFileOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Suppress("DEPRECATION")
    @Deprecated("Use copy { } instead")
    override fun copy(
        javaPackage: String?,
        javaOuterClassname: String?,
        javaMultipleFiles: Boolean?,
        javaGenerateEqualsAndHash: Boolean?,
        javaStringCheckUtf8: Boolean?,
        optimizeFor: pbandk.wkt.FileOptions.OptimizeMode?,
        goPackage: String?,
        ccGenericServices: Boolean?,
        javaGenericServices: Boolean?,
        pyGenericServices: Boolean?,
        phpGenericServices: Boolean?,
        deprecated: Boolean?,
        ccEnableArenas: Boolean?,
        objcClassPrefix: String?,
        csharpNamespace: String?,
        swiftPrefix: String?,
        phpClassPrefix: String?,
        phpNamespace: String?,
        phpMetadataNamespace: String?,
        rubyPackage: String?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFileOptions() = FileOptions_Impl(
        javaPackage = javaPackage,
        javaOuterClassname = javaOuterClassname,
        javaMultipleFiles = javaMultipleFiles,
        javaGenerateEqualsAndHash = @Suppress("DEPRECATION") javaGenerateEqualsAndHash,
        javaStringCheckUtf8 = javaStringCheckUtf8,
        optimizeFor = optimizeFor,
        goPackage = goPackage,
        ccGenericServices = ccGenericServices,
        javaGenericServices = javaGenericServices,
        pyGenericServices = pyGenericServices,
        phpGenericServices = phpGenericServices,
        deprecated = deprecated,
        ccEnableArenas = ccEnableArenas,
        objcClassPrefix = objcClassPrefix,
        csharpNamespace = csharpNamespace,
        swiftPrefix = swiftPrefix,
        phpClassPrefix = phpClassPrefix,
        phpNamespace = phpNamespace,
        phpMetadataNamespace = phpMetadataNamespace,
        rubyPackage = rubyPackage,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FileOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FileOptions {
    if (other !is pbandk.wkt.FileOptions) return this

    return copy {
        javaPackage = other.javaPackage ?: javaPackage
        javaOuterClassname = other.javaOuterClassname ?: javaOuterClassname
        javaMultipleFiles = other.javaMultipleFiles ?: javaMultipleFiles
        @Suppress("DEPRECATION")
        javaGenerateEqualsAndHash = other.javaGenerateEqualsAndHash ?: javaGenerateEqualsAndHash
        javaStringCheckUtf8 = other.javaStringCheckUtf8 ?: javaStringCheckUtf8
        optimizeFor = other.optimizeFor ?: optimizeFor
        goPackage = other.goPackage ?: goPackage
        ccGenericServices = other.ccGenericServices ?: ccGenericServices
        javaGenericServices = other.javaGenericServices ?: javaGenericServices
        pyGenericServices = other.pyGenericServices ?: pyGenericServices
        phpGenericServices = other.phpGenericServices ?: phpGenericServices
        deprecated = other.deprecated ?: deprecated
        ccEnableArenas = other.ccEnableArenas ?: ccEnableArenas
        objcClassPrefix = other.objcClassPrefix ?: objcClassPrefix
        csharpNamespace = other.csharpNamespace ?: csharpNamespace
        swiftPrefix = other.swiftPrefix ?: swiftPrefix
        phpClassPrefix = other.phpClassPrefix ?: phpClassPrefix
        phpNamespace = other.phpNamespace ?: phpNamespace
        phpMetadataNamespace = other.phpMetadataNamespace ?: phpMetadataNamespace
        rubyPackage = other.rubyPackage ?: rubyPackage
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FileOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.FileOptions {
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
    return FileOptions_Impl(javaPackage, javaOuterClassname, javaMultipleFiles, javaGenerateEqualsAndHash,
        javaStringCheckUtf8, optimizeFor, goPackage, ccGenericServices,
        javaGenericServices, pyGenericServices, phpGenericServices, deprecated,
        ccEnableArenas, objcClassPrefix, csharpNamespace, swiftPrefix,
        phpClassPrefix, phpNamespace, phpMetadataNamespace, rubyPackage,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use MessageOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.MessageOptions"],
        expression = "MessageOptions {\nthis.messageSetWireFormat = messageSetWireFormat\nthis.noStandardDescriptorAccessor = noStandardDescriptorAccessor\nthis.deprecated = deprecated\nthis.mapEntry = mapEntry\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MessageOptions(
    messageSetWireFormat: Boolean? = null,
    noStandardDescriptorAccessor: Boolean? = null,
    deprecated: Boolean? = null,
    mapEntry: Boolean? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.MessageOptions = pbandk.wkt.MessageOptions {
    this.messageSetWireFormat = messageSetWireFormat
    this.noStandardDescriptorAccessor = noStandardDescriptorAccessor
    this.deprecated = deprecated
    this.mapEntry = mapEntry
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableMessageOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMessageOptions")
public fun MessageOptions(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit): pbandk.wkt.MessageOptions = pbandk.wkt.MutableMessageOptions_Impl(
    messageSetWireFormat = null,
    noStandardDescriptorAccessor = null,
    deprecated = null,
    mapEntry = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toMessageOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForMessageOptions")
public fun MessageOptions?.orDefault(): pbandk.wkt.MessageOptions = this ?: pbandk.wkt.MessageOptions.defaultInstance

private class MessageOptions_Impl(
    override val messageSetWireFormat: Boolean?,
    override val noStandardDescriptorAccessor: Boolean?,
    override val deprecated: Boolean?,
    override val mapEntry: Boolean?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.MessageOptions, pbandk.GeneratedMessage<pbandk.wkt.MessageOptions>() {
    override val descriptor get() = pbandk.wkt.MessageOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit) = pbandk.wkt.MessageOptions {
        this.messageSetWireFormat = this@MessageOptions_Impl.messageSetWireFormat
        this.noStandardDescriptorAccessor = this@MessageOptions_Impl.noStandardDescriptorAccessor
        this.deprecated = this@MessageOptions_Impl.deprecated
        this.mapEntry = this@MessageOptions_Impl.mapEntry
        this.uninterpretedOption += this@MessageOptions_Impl.uninterpretedOption
        this.unknownFields += this@MessageOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        messageSetWireFormat: Boolean?,
        noStandardDescriptorAccessor: Boolean?,
        deprecated: Boolean?,
        mapEntry: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.MessageOptions {
        this.messageSetWireFormat = messageSetWireFormat
        this.noStandardDescriptorAccessor = noStandardDescriptorAccessor
        this.deprecated = deprecated
        this.mapEntry = mapEntry
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMessageOptions_Impl(
    override var messageSetWireFormat: Boolean?,
    override var noStandardDescriptorAccessor: Boolean?,
    override var deprecated: Boolean?,
    override var mapEntry: Boolean?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableMessageOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableMessageOptions>() {
    override val descriptor get() = pbandk.wkt.MessageOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableMessageOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        messageSetWireFormat: Boolean?,
        noStandardDescriptorAccessor: Boolean?,
        deprecated: Boolean?,
        mapEntry: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMessageOptions() = MessageOptions_Impl(
        messageSetWireFormat = messageSetWireFormat,
        noStandardDescriptorAccessor = noStandardDescriptorAccessor,
        deprecated = deprecated,
        mapEntry = mapEntry,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun MessageOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.MessageOptions {
    if (other !is pbandk.wkt.MessageOptions) return this

    return copy {
        messageSetWireFormat = other.messageSetWireFormat ?: messageSetWireFormat
        noStandardDescriptorAccessor = other.noStandardDescriptorAccessor ?: noStandardDescriptorAccessor
        deprecated = other.deprecated ?: deprecated
        mapEntry = other.mapEntry ?: mapEntry
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MessageOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.MessageOptions {
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
    return MessageOptions_Impl(messageSetWireFormat, noStandardDescriptorAccessor, deprecated, mapEntry,
        pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use FieldOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FieldOptions"],
        expression = "FieldOptions {\nthis.ctype = ctype\nthis.packed = packed\nthis.jstype = jstype\nthis.lazy = lazy\nthis.deprecated = deprecated\nthis.weak = weak\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FieldOptions(
    ctype: pbandk.wkt.FieldOptions.CType? = null,
    packed: Boolean? = null,
    jstype: pbandk.wkt.FieldOptions.JSType? = null,
    lazy: Boolean? = null,
    deprecated: Boolean? = null,
    weak: Boolean? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FieldOptions = pbandk.wkt.FieldOptions {
    this.ctype = ctype
    this.packed = packed
    this.jstype = jstype
    this.lazy = lazy
    this.deprecated = deprecated
    this.weak = weak
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableFieldOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFieldOptions")
public fun FieldOptions(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit): pbandk.wkt.FieldOptions = pbandk.wkt.MutableFieldOptions_Impl(
    ctype = null,
    packed = null,
    jstype = null,
    lazy = null,
    deprecated = null,
    weak = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toFieldOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForFieldOptions")
public fun FieldOptions?.orDefault(): pbandk.wkt.FieldOptions = this ?: pbandk.wkt.FieldOptions.defaultInstance

private class FieldOptions_Impl(
    override val ctype: pbandk.wkt.FieldOptions.CType?,
    override val packed: Boolean?,
    override val jstype: pbandk.wkt.FieldOptions.JSType?,
    override val lazy: Boolean?,
    override val deprecated: Boolean?,
    override val weak: Boolean?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FieldOptions, pbandk.GeneratedMessage<pbandk.wkt.FieldOptions>() {
    override val descriptor get() = pbandk.wkt.FieldOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit) = pbandk.wkt.FieldOptions {
        this.ctype = this@FieldOptions_Impl.ctype
        this.packed = this@FieldOptions_Impl.packed
        this.jstype = this@FieldOptions_Impl.jstype
        this.lazy = this@FieldOptions_Impl.lazy
        this.deprecated = this@FieldOptions_Impl.deprecated
        this.weak = this@FieldOptions_Impl.weak
        this.uninterpretedOption += this@FieldOptions_Impl.uninterpretedOption
        this.unknownFields += this@FieldOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        ctype: pbandk.wkt.FieldOptions.CType?,
        packed: Boolean?,
        jstype: pbandk.wkt.FieldOptions.JSType?,
        lazy: Boolean?,
        deprecated: Boolean?,
        weak: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FieldOptions {
        this.ctype = ctype
        this.packed = packed
        this.jstype = jstype
        this.lazy = lazy
        this.deprecated = deprecated
        this.weak = weak
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFieldOptions_Impl(
    override var ctype: pbandk.wkt.FieldOptions.CType?,
    override var packed: Boolean?,
    override var jstype: pbandk.wkt.FieldOptions.JSType?,
    override var lazy: Boolean?,
    override var deprecated: Boolean?,
    override var weak: Boolean?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFieldOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableFieldOptions>() {
    override val descriptor get() = pbandk.wkt.FieldOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableFieldOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        ctype: pbandk.wkt.FieldOptions.CType?,
        packed: Boolean?,
        jstype: pbandk.wkt.FieldOptions.JSType?,
        lazy: Boolean?,
        deprecated: Boolean?,
        weak: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFieldOptions() = FieldOptions_Impl(
        ctype = ctype,
        packed = packed,
        jstype = jstype,
        lazy = lazy,
        deprecated = deprecated,
        weak = weak,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun FieldOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FieldOptions {
    if (other !is pbandk.wkt.FieldOptions) return this

    return copy {
        ctype = other.ctype ?: ctype
        packed = other.packed ?: packed
        jstype = other.jstype ?: jstype
        lazy = other.lazy ?: lazy
        deprecated = other.deprecated ?: deprecated
        weak = other.weak ?: weak
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FieldOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.FieldOptions {
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
    return FieldOptions_Impl(ctype, packed, jstype, lazy,
        deprecated, weak, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use OneofOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.OneofOptions"],
        expression = "OneofOptions {\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun OneofOptions(
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.OneofOptions = pbandk.wkt.OneofOptions {
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableOneofOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildOneofOptions")
public fun OneofOptions(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit): pbandk.wkt.OneofOptions = pbandk.wkt.MutableOneofOptions_Impl(
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toOneofOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForOneofOptions")
public fun OneofOptions?.orDefault(): pbandk.wkt.OneofOptions = this ?: pbandk.wkt.OneofOptions.defaultInstance

private class OneofOptions_Impl(
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.OneofOptions, pbandk.GeneratedMessage<pbandk.wkt.OneofOptions>() {
    override val descriptor get() = pbandk.wkt.OneofOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit) = pbandk.wkt.OneofOptions {
        this.uninterpretedOption += this@OneofOptions_Impl.uninterpretedOption
        this.unknownFields += this@OneofOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.OneofOptions {
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableOneofOptions_Impl(
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableOneofOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableOneofOptions>() {
    override val descriptor get() = pbandk.wkt.OneofOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableOneofOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toOneofOptions() = OneofOptions_Impl(
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun OneofOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.OneofOptions {
    if (other !is pbandk.wkt.OneofOptions) return this

    return copy {
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun OneofOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.OneofOptions {
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return OneofOptions_Impl(pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use EnumOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumOptions"],
        expression = "EnumOptions {\nthis.allowAlias = allowAlias\nthis.deprecated = deprecated\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumOptions(
    allowAlias: Boolean? = null,
    deprecated: Boolean? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumOptions = pbandk.wkt.EnumOptions {
    this.allowAlias = allowAlias
    this.deprecated = deprecated
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumOptions")
public fun EnumOptions(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit): pbandk.wkt.EnumOptions = pbandk.wkt.MutableEnumOptions_Impl(
    allowAlias = null,
    deprecated = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toEnumOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumOptions")
public fun EnumOptions?.orDefault(): pbandk.wkt.EnumOptions = this ?: pbandk.wkt.EnumOptions.defaultInstance

private class EnumOptions_Impl(
    override val allowAlias: Boolean?,
    override val deprecated: Boolean?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumOptions, pbandk.GeneratedMessage<pbandk.wkt.EnumOptions>() {
    override val descriptor get() = pbandk.wkt.EnumOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit) = pbandk.wkt.EnumOptions {
        this.allowAlias = this@EnumOptions_Impl.allowAlias
        this.deprecated = this@EnumOptions_Impl.deprecated
        this.uninterpretedOption += this@EnumOptions_Impl.uninterpretedOption
        this.unknownFields += this@EnumOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        allowAlias: Boolean?,
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.EnumOptions {
        this.allowAlias = allowAlias
        this.deprecated = deprecated
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableEnumOptions_Impl(
    override var allowAlias: Boolean?,
    override var deprecated: Boolean?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEnumOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEnumOptions>() {
    override val descriptor get() = pbandk.wkt.EnumOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableEnumOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        allowAlias: Boolean?,
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEnumOptions() = EnumOptions_Impl(
        allowAlias = allowAlias,
        deprecated = deprecated,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun EnumOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.EnumOptions {
    if (other !is pbandk.wkt.EnumOptions) return this

    return copy {
        allowAlias = other.allowAlias ?: allowAlias
        deprecated = other.deprecated ?: deprecated
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.EnumOptions {
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
    return EnumOptions_Impl(allowAlias, deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use EnumValueOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.EnumValueOptions"],
        expression = "EnumValueOptions {\nthis.deprecated = deprecated\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun EnumValueOptions(
    deprecated: Boolean? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.EnumValueOptions = pbandk.wkt.EnumValueOptions {
    this.deprecated = deprecated
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableEnumValueOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildEnumValueOptions")
public fun EnumValueOptions(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit): pbandk.wkt.EnumValueOptions = pbandk.wkt.MutableEnumValueOptions_Impl(
    deprecated = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toEnumValueOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForEnumValueOptions")
public fun EnumValueOptions?.orDefault(): pbandk.wkt.EnumValueOptions = this ?: pbandk.wkt.EnumValueOptions.defaultInstance

private class EnumValueOptions_Impl(
    override val deprecated: Boolean?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.EnumValueOptions, pbandk.GeneratedMessage<pbandk.wkt.EnumValueOptions>() {
    override val descriptor get() = pbandk.wkt.EnumValueOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit) = pbandk.wkt.EnumValueOptions {
        this.deprecated = this@EnumValueOptions_Impl.deprecated
        this.uninterpretedOption += this@EnumValueOptions_Impl.uninterpretedOption
        this.unknownFields += this@EnumValueOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.EnumValueOptions {
        this.deprecated = deprecated
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableEnumValueOptions_Impl(
    override var deprecated: Boolean?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableEnumValueOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableEnumValueOptions>() {
    override val descriptor get() = pbandk.wkt.EnumValueOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableEnumValueOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toEnumValueOptions() = EnumValueOptions_Impl(
        deprecated = deprecated,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun EnumValueOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.EnumValueOptions {
    if (other !is pbandk.wkt.EnumValueOptions) return this

    return copy {
        deprecated = other.deprecated ?: deprecated
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun EnumValueOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.EnumValueOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return EnumValueOptions_Impl(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use ServiceOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ServiceOptions"],
        expression = "ServiceOptions {\nthis.deprecated = deprecated\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ServiceOptions(
    deprecated: Boolean? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ServiceOptions = pbandk.wkt.ServiceOptions {
    this.deprecated = deprecated
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableServiceOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildServiceOptions")
public fun ServiceOptions(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit): pbandk.wkt.ServiceOptions = pbandk.wkt.MutableServiceOptions_Impl(
    deprecated = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toServiceOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForServiceOptions")
public fun ServiceOptions?.orDefault(): pbandk.wkt.ServiceOptions = this ?: pbandk.wkt.ServiceOptions.defaultInstance

private class ServiceOptions_Impl(
    override val deprecated: Boolean?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ServiceOptions, pbandk.GeneratedMessage<pbandk.wkt.ServiceOptions>() {
    override val descriptor get() = pbandk.wkt.ServiceOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit) = pbandk.wkt.ServiceOptions {
        this.deprecated = this@ServiceOptions_Impl.deprecated
        this.uninterpretedOption += this@ServiceOptions_Impl.uninterpretedOption
        this.unknownFields += this@ServiceOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.ServiceOptions {
        this.deprecated = deprecated
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableServiceOptions_Impl(
    override var deprecated: Boolean?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableServiceOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableServiceOptions>() {
    override val descriptor get() = pbandk.wkt.ServiceOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableServiceOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toServiceOptions() = ServiceOptions_Impl(
        deprecated = deprecated,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun ServiceOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.ServiceOptions {
    if (other !is pbandk.wkt.ServiceOptions) return this

    return copy {
        deprecated = other.deprecated ?: deprecated
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun ServiceOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.ServiceOptions {
    var deprecated: Boolean? = null
    var uninterpretedOption: pbandk.ListWithSize.Builder<pbandk.wkt.UninterpretedOption>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            33 -> deprecated = _fieldValue as Boolean
            999 -> uninterpretedOption = (uninterpretedOption ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.UninterpretedOption> }
        }
    }
    return ServiceOptions_Impl(deprecated, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use MethodOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.MethodOptions"],
        expression = "MethodOptions {\nthis.deprecated = deprecated\nthis.idempotencyLevel = idempotencyLevel\nthis.uninterpretedOption += uninterpretedOption\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MethodOptions(
    deprecated: Boolean? = null,
    idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel? = null,
    uninterpretedOption: List<pbandk.wkt.UninterpretedOption> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.MethodOptions = pbandk.wkt.MethodOptions {
    this.deprecated = deprecated
    this.idempotencyLevel = idempotencyLevel
    this.uninterpretedOption += uninterpretedOption
    this.unknownFields += unknownFields
}

/**
 * The [MutableMethodOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMethodOptions")
public fun MethodOptions(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit): pbandk.wkt.MethodOptions = pbandk.wkt.MutableMethodOptions_Impl(
    deprecated = null,
    idempotencyLevel = null,
    uninterpretedOption = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toMethodOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForMethodOptions")
public fun MethodOptions?.orDefault(): pbandk.wkt.MethodOptions = this ?: pbandk.wkt.MethodOptions.defaultInstance

private class MethodOptions_Impl(
    override val deprecated: Boolean?,
    override val idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
    override val uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.MethodOptions, pbandk.GeneratedMessage<pbandk.wkt.MethodOptions>() {
    override val descriptor get() = pbandk.wkt.MethodOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit) = pbandk.wkt.MethodOptions {
        this.deprecated = this@MethodOptions_Impl.deprecated
        this.idempotencyLevel = this@MethodOptions_Impl.idempotencyLevel
        this.uninterpretedOption += this@MethodOptions_Impl.uninterpretedOption
        this.unknownFields += this@MethodOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.MethodOptions {
        this.deprecated = deprecated
        this.idempotencyLevel = idempotencyLevel
        this.uninterpretedOption += uninterpretedOption
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMethodOptions_Impl(
    override var deprecated: Boolean?,
    override var idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
    override val uninterpretedOption: MutableList<pbandk.wkt.UninterpretedOption>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableMethodOptions, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableMethodOptions>() {
    override val descriptor get() = pbandk.wkt.MethodOptions.descriptor
    override val extensionFields: pbandk.ExtensionFieldSet = pbandk.ExtensionFieldSet()

    override fun copy(builderAction: pbandk.wkt.MutableMethodOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        deprecated: Boolean?,
        idempotencyLevel: pbandk.wkt.MethodOptions.IdempotencyLevel?,
        uninterpretedOption: List<pbandk.wkt.UninterpretedOption>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMethodOptions() = MethodOptions_Impl(
        deprecated = deprecated,
        idempotencyLevel = idempotencyLevel,
        uninterpretedOption = uninterpretedOption.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun MethodOptions.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.MethodOptions {
    if (other !is pbandk.wkt.MethodOptions) return this

    return copy {
        deprecated = other.deprecated ?: deprecated
        idempotencyLevel = other.idempotencyLevel ?: idempotencyLevel
        uninterpretedOption += other.uninterpretedOption
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MethodOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.MethodOptions {
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
    return MethodOptions_Impl(deprecated, idempotencyLevel, pbandk.ListWithSize.Builder.fixed(uninterpretedOption), unknownFields)
}

@Deprecated(
    message = "Use UninterpretedOption { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.UninterpretedOption"],
        expression = "UninterpretedOption {\nthis.name += name\nthis.identifierValue = identifierValue\nthis.positiveIntValue = positiveIntValue\nthis.negativeIntValue = negativeIntValue\nthis.doubleValue = doubleValue\nthis.stringValue = stringValue\nthis.aggregateValue = aggregateValue\nthis.unknownFields += unknownFields\n}",
    )
)
public fun UninterpretedOption(
    name: List<pbandk.wkt.UninterpretedOption.NamePart> = emptyList(),
    identifierValue: String? = null,
    positiveIntValue: Long? = null,
    negativeIntValue: Long? = null,
    doubleValue: Double? = null,
    stringValue: pbandk.ByteArr? = null,
    aggregateValue: String? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.UninterpretedOption = pbandk.wkt.UninterpretedOption {
    this.name += name
    this.identifierValue = identifierValue
    this.positiveIntValue = positiveIntValue
    this.negativeIntValue = negativeIntValue
    this.doubleValue = doubleValue
    this.stringValue = stringValue
    this.aggregateValue = aggregateValue
    this.unknownFields += unknownFields
}

/**
 * The [MutableUninterpretedOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUninterpretedOption")
public fun UninterpretedOption(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit): pbandk.wkt.UninterpretedOption = pbandk.wkt.MutableUninterpretedOption_Impl(
    name = mutableListOf(),
    identifierValue = null,
    positiveIntValue = null,
    negativeIntValue = null,
    doubleValue = null,
    stringValue = null,
    aggregateValue = null,
    unknownFields = mutableMapOf()
).also(builderAction).toUninterpretedOption()

@pbandk.Export
@pbandk.JsName("orDefaultForUninterpretedOption")
public fun UninterpretedOption?.orDefault(): pbandk.wkt.UninterpretedOption = this ?: pbandk.wkt.UninterpretedOption.defaultInstance

private class UninterpretedOption_Impl(
    override val name: List<pbandk.wkt.UninterpretedOption.NamePart>,
    override val identifierValue: String?,
    override val positiveIntValue: Long?,
    override val negativeIntValue: Long?,
    override val doubleValue: Double?,
    override val stringValue: pbandk.ByteArr?,
    override val aggregateValue: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UninterpretedOption, pbandk.GeneratedMessage<pbandk.wkt.UninterpretedOption>() {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit) = pbandk.wkt.UninterpretedOption {
        this.name += this@UninterpretedOption_Impl.name
        this.identifierValue = this@UninterpretedOption_Impl.identifierValue
        this.positiveIntValue = this@UninterpretedOption_Impl.positiveIntValue
        this.negativeIntValue = this@UninterpretedOption_Impl.negativeIntValue
        this.doubleValue = this@UninterpretedOption_Impl.doubleValue
        this.stringValue = this@UninterpretedOption_Impl.stringValue
        this.aggregateValue = this@UninterpretedOption_Impl.aggregateValue
        this.unknownFields += this@UninterpretedOption_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: List<pbandk.wkt.UninterpretedOption.NamePart>,
        identifierValue: String?,
        positiveIntValue: Long?,
        negativeIntValue: Long?,
        doubleValue: Double?,
        stringValue: pbandk.ByteArr?,
        aggregateValue: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.UninterpretedOption {
        this.name += name
        this.identifierValue = identifierValue
        this.positiveIntValue = positiveIntValue
        this.negativeIntValue = negativeIntValue
        this.doubleValue = doubleValue
        this.stringValue = stringValue
        this.aggregateValue = aggregateValue
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableUninterpretedOption_Impl(
    override val name: MutableList<pbandk.wkt.UninterpretedOption.NamePart>,
    override var identifierValue: String?,
    override var positiveIntValue: Long?,
    override var negativeIntValue: Long?,
    override var doubleValue: Double?,
    override var stringValue: pbandk.ByteArr?,
    override var aggregateValue: String?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableUninterpretedOption, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableUninterpretedOption>() {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableUninterpretedOption.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: List<pbandk.wkt.UninterpretedOption.NamePart>,
        identifierValue: String?,
        positiveIntValue: Long?,
        negativeIntValue: Long?,
        doubleValue: Double?,
        stringValue: pbandk.ByteArr?,
        aggregateValue: String?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toUninterpretedOption() = UninterpretedOption_Impl(
        name = name.toList(),
        identifierValue = identifierValue,
        positiveIntValue = positiveIntValue,
        negativeIntValue = negativeIntValue,
        doubleValue = doubleValue,
        stringValue = stringValue,
        aggregateValue = aggregateValue,
        unknownFields = unknownFields.toMap()
    )
}

private fun UninterpretedOption.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.UninterpretedOption {
    if (other !is pbandk.wkt.UninterpretedOption) return this

    return copy {
        name += other.name
        identifierValue = other.identifierValue ?: identifierValue
        positiveIntValue = other.positiveIntValue ?: positiveIntValue
        negativeIntValue = other.negativeIntValue ?: negativeIntValue
        doubleValue = other.doubleValue ?: doubleValue
        stringValue = other.stringValue ?: stringValue
        aggregateValue = other.aggregateValue ?: aggregateValue
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.UninterpretedOption {
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
    return UninterpretedOption_Impl(pbandk.ListWithSize.Builder.fixed(name), identifierValue, positiveIntValue, negativeIntValue,
        doubleValue, stringValue, aggregateValue, unknownFields)
}

@Deprecated(
    message = "Use UninterpretedOption.NamePart { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.UninterpretedOption.NamePart"],
        expression = "UninterpretedOption.NamePart {\nthis.namePart = namePart\nthis.isExtension = isExtension\nthis.unknownFields += unknownFields\n}",
    )
)
public fun UninterpretedOption.Companion.NamePart(
    namePart: String = "",
    isExtension: Boolean = false,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.UninterpretedOption.NamePart = pbandk.wkt.UninterpretedOption.Companion.NamePart {
    this.namePart = namePart
    this.isExtension = isExtension
    this.unknownFields += unknownFields
}

/**
 * The [MutableNamePart] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUninterpretedOptionNamePart")
public fun UninterpretedOption.Companion.NamePart(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit): pbandk.wkt.UninterpretedOption.NamePart = pbandk.wkt.UninterpretedOption_MutableNamePart_Impl(
    namePart = "",
    isExtension = false,
    unknownFields = mutableMapOf()
).also(builderAction).toNamePart()

/**
 * The [MutableNamePart] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableUninterpretedOption.NamePart(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit): pbandk.wkt.UninterpretedOption.NamePart =
    pbandk.wkt.UninterpretedOption.NamePart(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForUninterpretedOptionNamePart")
public fun UninterpretedOption.NamePart?.orDefault(): pbandk.wkt.UninterpretedOption.NamePart = this ?: pbandk.wkt.UninterpretedOption.NamePart.defaultInstance

private class UninterpretedOption_NamePart_Impl(
    override val namePart: String,
    override val isExtension: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UninterpretedOption.NamePart, pbandk.GeneratedMessage<pbandk.wkt.UninterpretedOption.NamePart>() {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.NamePart.descriptor

    override fun copy(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit) = pbandk.wkt.UninterpretedOption.NamePart {
        this.namePart = this@UninterpretedOption_NamePart_Impl.namePart
        this.isExtension = this@UninterpretedOption_NamePart_Impl.isExtension
        this.unknownFields += this@UninterpretedOption_NamePart_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        namePart: String,
        isExtension: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.UninterpretedOption.NamePart {
        this.namePart = namePart
        this.isExtension = isExtension
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class UninterpretedOption_MutableNamePart_Impl(
    override var namePart: String,
    override var isExtension: Boolean,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.UninterpretedOption.MutableNamePart, pbandk.MutableGeneratedMessage<pbandk.wkt.UninterpretedOption.MutableNamePart>() {
    override val descriptor get() = pbandk.wkt.UninterpretedOption.NamePart.descriptor

    override fun copy(builderAction: pbandk.wkt.UninterpretedOption.MutableNamePart.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        namePart: String,
        isExtension: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toNamePart() = UninterpretedOption_NamePart_Impl(
        namePart = namePart,
        isExtension = isExtension,
        unknownFields = unknownFields.toMap()
    )
}

private fun UninterpretedOption.NamePart.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.UninterpretedOption.NamePart {
    if (other !is pbandk.wkt.UninterpretedOption.NamePart) return this

    return copy {
        namePart = other.namePart
        isExtension = other.isExtension
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun UninterpretedOption.NamePart.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.UninterpretedOption.NamePart {
    var namePart = ""
    var isExtension = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> namePart = _fieldValue as String
            2 -> isExtension = _fieldValue as Boolean
        }
    }
    return UninterpretedOption_NamePart_Impl(namePart, isExtension, unknownFields)
}

@Deprecated(
    message = "Use SourceCodeInfo { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.SourceCodeInfo"],
        expression = "SourceCodeInfo {\nthis.location += location\nthis.unknownFields += unknownFields\n}",
    )
)
public fun SourceCodeInfo(
    location: List<pbandk.wkt.SourceCodeInfo.Location> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.SourceCodeInfo = pbandk.wkt.SourceCodeInfo {
    this.location += location
    this.unknownFields += unknownFields
}

/**
 * The [MutableSourceCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildSourceCodeInfo")
public fun SourceCodeInfo(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit): pbandk.wkt.SourceCodeInfo = pbandk.wkt.MutableSourceCodeInfo_Impl(
    location = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toSourceCodeInfo()

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfo")
public fun SourceCodeInfo?.orDefault(): pbandk.wkt.SourceCodeInfo = this ?: pbandk.wkt.SourceCodeInfo.defaultInstance

private class SourceCodeInfo_Impl(
    override val location: List<pbandk.wkt.SourceCodeInfo.Location>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceCodeInfo, pbandk.GeneratedMessage<pbandk.wkt.SourceCodeInfo>() {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit) = pbandk.wkt.SourceCodeInfo {
        this.location += this@SourceCodeInfo_Impl.location
        this.unknownFields += this@SourceCodeInfo_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        location: List<pbandk.wkt.SourceCodeInfo.Location>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.SourceCodeInfo {
        this.location += location
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSourceCodeInfo_Impl(
    override val location: MutableList<pbandk.wkt.SourceCodeInfo.Location>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableSourceCodeInfo, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableSourceCodeInfo>() {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableSourceCodeInfo.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        location: List<pbandk.wkt.SourceCodeInfo.Location>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSourceCodeInfo() = SourceCodeInfo_Impl(
        location = location.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun SourceCodeInfo.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo {
    if (other !is pbandk.wkt.SourceCodeInfo) return this

    return copy {
        location += other.location
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.SourceCodeInfo {
    var location: pbandk.ListWithSize.Builder<pbandk.wkt.SourceCodeInfo.Location>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> location = (location ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.SourceCodeInfo.Location> }
        }
    }
    return SourceCodeInfo_Impl(pbandk.ListWithSize.Builder.fixed(location), unknownFields)
}

@Deprecated(
    message = "Use SourceCodeInfo.Location { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.SourceCodeInfo.Location"],
        expression = "SourceCodeInfo.Location {\nthis.path += path\nthis.span += span\nthis.leadingComments = leadingComments\nthis.trailingComments = trailingComments\nthis.leadingDetachedComments += leadingDetachedComments\nthis.unknownFields += unknownFields\n}",
    )
)
public fun SourceCodeInfo.Companion.Location(
    path: List<Int> = emptyList(),
    span: List<Int> = emptyList(),
    leadingComments: String? = null,
    trailingComments: String? = null,
    leadingDetachedComments: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.SourceCodeInfo.Location = pbandk.wkt.SourceCodeInfo.Companion.Location {
    this.path += path
    this.span += span
    this.leadingComments = leadingComments
    this.trailingComments = trailingComments
    this.leadingDetachedComments += leadingDetachedComments
    this.unknownFields += unknownFields
}

/**
 * The [MutableLocation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildSourceCodeInfoLocation")
public fun SourceCodeInfo.Companion.Location(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit): pbandk.wkt.SourceCodeInfo.Location = pbandk.wkt.SourceCodeInfo_MutableLocation_Impl(
    path = mutableListOf(),
    span = mutableListOf(),
    leadingComments = null,
    trailingComments = null,
    leadingDetachedComments = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toLocation()

/**
 * The [MutableLocation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableSourceCodeInfo.Location(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit): pbandk.wkt.SourceCodeInfo.Location =
    pbandk.wkt.SourceCodeInfo.Location(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForSourceCodeInfoLocation")
public fun SourceCodeInfo.Location?.orDefault(): pbandk.wkt.SourceCodeInfo.Location = this ?: pbandk.wkt.SourceCodeInfo.Location.defaultInstance

private class SourceCodeInfo_Location_Impl(
    override val path: List<Int>,
    override val span: List<Int>,
    override val leadingComments: String?,
    override val trailingComments: String?,
    override val leadingDetachedComments: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceCodeInfo.Location, pbandk.GeneratedMessage<pbandk.wkt.SourceCodeInfo.Location>() {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.Location.descriptor

    override fun copy(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit) = pbandk.wkt.SourceCodeInfo.Location {
        this.path += this@SourceCodeInfo_Location_Impl.path
        this.span += this@SourceCodeInfo_Location_Impl.span
        this.leadingComments = this@SourceCodeInfo_Location_Impl.leadingComments
        this.trailingComments = this@SourceCodeInfo_Location_Impl.trailingComments
        this.leadingDetachedComments += this@SourceCodeInfo_Location_Impl.leadingDetachedComments
        this.unknownFields += this@SourceCodeInfo_Location_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        span: List<Int>,
        leadingComments: String?,
        trailingComments: String?,
        leadingDetachedComments: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.SourceCodeInfo.Location {
        this.path += path
        this.span += span
        this.leadingComments = leadingComments
        this.trailingComments = trailingComments
        this.leadingDetachedComments += leadingDetachedComments
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class SourceCodeInfo_MutableLocation_Impl(
    override val path: MutableList<Int>,
    override val span: MutableList<Int>,
    override var leadingComments: String?,
    override var trailingComments: String?,
    override val leadingDetachedComments: MutableList<String>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.SourceCodeInfo.MutableLocation, pbandk.MutableGeneratedMessage<pbandk.wkt.SourceCodeInfo.MutableLocation>() {
    override val descriptor get() = pbandk.wkt.SourceCodeInfo.Location.descriptor

    override fun copy(builderAction: pbandk.wkt.SourceCodeInfo.MutableLocation.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        span: List<Int>,
        leadingComments: String?,
        trailingComments: String?,
        leadingDetachedComments: List<String>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toLocation() = SourceCodeInfo_Location_Impl(
        path = path.toList(),
        span = span.toList(),
        leadingComments = leadingComments,
        trailingComments = trailingComments,
        leadingDetachedComments = leadingDetachedComments.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun SourceCodeInfo.Location.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.SourceCodeInfo.Location {
    if (other !is pbandk.wkt.SourceCodeInfo.Location) return this

    return copy {
        path += other.path
        span += other.span
        leadingComments = other.leadingComments ?: leadingComments
        trailingComments = other.trailingComments ?: trailingComments
        leadingDetachedComments += other.leadingDetachedComments
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SourceCodeInfo.Location.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.SourceCodeInfo.Location {
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
    return SourceCodeInfo_Location_Impl(pbandk.ListWithSize.Builder.fixed(path), pbandk.ListWithSize.Builder.fixed(span), leadingComments, trailingComments,
        pbandk.ListWithSize.Builder.fixed(leadingDetachedComments), unknownFields)
}

@Deprecated(
    message = "Use GeneratedCodeInfo { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.GeneratedCodeInfo"],
        expression = "GeneratedCodeInfo {\nthis.annotation += annotation\nthis.unknownFields += unknownFields\n}",
    )
)
public fun GeneratedCodeInfo(
    annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.GeneratedCodeInfo = pbandk.wkt.GeneratedCodeInfo {
    this.annotation += annotation
    this.unknownFields += unknownFields
}

/**
 * The [MutableGeneratedCodeInfo] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildGeneratedCodeInfo")
public fun GeneratedCodeInfo(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit): pbandk.wkt.GeneratedCodeInfo = pbandk.wkt.MutableGeneratedCodeInfo_Impl(
    annotation = mutableListOf(),
    unknownFields = mutableMapOf()
).also(builderAction).toGeneratedCodeInfo()

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfo")
public fun GeneratedCodeInfo?.orDefault(): pbandk.wkt.GeneratedCodeInfo = this ?: pbandk.wkt.GeneratedCodeInfo.defaultInstance

private class GeneratedCodeInfo_Impl(
    override val annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.GeneratedCodeInfo, pbandk.GeneratedMessage<pbandk.wkt.GeneratedCodeInfo>() {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit) = pbandk.wkt.GeneratedCodeInfo {
        this.annotation += this@GeneratedCodeInfo_Impl.annotation
        this.unknownFields += this@GeneratedCodeInfo_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.GeneratedCodeInfo {
        this.annotation += annotation
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableGeneratedCodeInfo_Impl(
    override val annotation: MutableList<pbandk.wkt.GeneratedCodeInfo.Annotation>,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableGeneratedCodeInfo, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableGeneratedCodeInfo>() {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableGeneratedCodeInfo.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        annotation: List<pbandk.wkt.GeneratedCodeInfo.Annotation>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toGeneratedCodeInfo() = GeneratedCodeInfo_Impl(
        annotation = annotation.toList(),
        unknownFields = unknownFields.toMap()
    )
}

private fun GeneratedCodeInfo.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo {
    if (other !is pbandk.wkt.GeneratedCodeInfo) return this

    return copy {
        annotation += other.annotation
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.GeneratedCodeInfo {
    var annotation: pbandk.ListWithSize.Builder<pbandk.wkt.GeneratedCodeInfo.Annotation>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> annotation = (annotation ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.GeneratedCodeInfo.Annotation> }
        }
    }
    return GeneratedCodeInfo_Impl(pbandk.ListWithSize.Builder.fixed(annotation), unknownFields)
}

@Deprecated(
    message = "Use GeneratedCodeInfo.Annotation { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.GeneratedCodeInfo.Annotation"],
        expression = "GeneratedCodeInfo.Annotation {\nthis.path += path\nthis.sourceFile = sourceFile\nthis.begin = begin\nthis.end = end\nthis.unknownFields += unknownFields\n}",
    )
)
public fun GeneratedCodeInfo.Companion.Annotation(
    path: List<Int> = emptyList(),
    sourceFile: String? = null,
    begin: Int? = null,
    end: Int? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.GeneratedCodeInfo.Annotation = pbandk.wkt.GeneratedCodeInfo.Companion.Annotation {
    this.path += path
    this.sourceFile = sourceFile
    this.begin = begin
    this.end = end
    this.unknownFields += unknownFields
}

/**
 * The [MutableAnnotation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildGeneratedCodeInfoAnnotation")
public fun GeneratedCodeInfo.Companion.Annotation(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit): pbandk.wkt.GeneratedCodeInfo.Annotation = pbandk.wkt.GeneratedCodeInfo_MutableAnnotation_Impl(
    path = mutableListOf(),
    sourceFile = null,
    begin = null,
    end = null,
    unknownFields = mutableMapOf()
).also(builderAction).toAnnotation()

/**
 * The [MutableAnnotation] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutableGeneratedCodeInfo.Annotation(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit): pbandk.wkt.GeneratedCodeInfo.Annotation =
    pbandk.wkt.GeneratedCodeInfo.Annotation(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForGeneratedCodeInfoAnnotation")
public fun GeneratedCodeInfo.Annotation?.orDefault(): pbandk.wkt.GeneratedCodeInfo.Annotation = this ?: pbandk.wkt.GeneratedCodeInfo.Annotation.defaultInstance

private class GeneratedCodeInfo_Annotation_Impl(
    override val path: List<Int>,
    override val sourceFile: String?,
    override val begin: Int?,
    override val end: Int?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.GeneratedCodeInfo.Annotation, pbandk.GeneratedMessage<pbandk.wkt.GeneratedCodeInfo.Annotation>() {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.Annotation.descriptor

    override fun copy(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit) = pbandk.wkt.GeneratedCodeInfo.Annotation {
        this.path += this@GeneratedCodeInfo_Annotation_Impl.path
        this.sourceFile = this@GeneratedCodeInfo_Annotation_Impl.sourceFile
        this.begin = this@GeneratedCodeInfo_Annotation_Impl.begin
        this.end = this@GeneratedCodeInfo_Annotation_Impl.end
        this.unknownFields += this@GeneratedCodeInfo_Annotation_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        sourceFile: String?,
        begin: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.GeneratedCodeInfo.Annotation {
        this.path += path
        this.sourceFile = sourceFile
        this.begin = begin
        this.end = end
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class GeneratedCodeInfo_MutableAnnotation_Impl(
    override val path: MutableList<Int>,
    override var sourceFile: String?,
    override var begin: Int?,
    override var end: Int?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.GeneratedCodeInfo.MutableAnnotation, pbandk.MutableGeneratedMessage<pbandk.wkt.GeneratedCodeInfo.MutableAnnotation>() {
    override val descriptor get() = pbandk.wkt.GeneratedCodeInfo.Annotation.descriptor

    override fun copy(builderAction: pbandk.wkt.GeneratedCodeInfo.MutableAnnotation.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        path: List<Int>,
        sourceFile: String?,
        begin: Int?,
        end: Int?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toAnnotation() = GeneratedCodeInfo_Annotation_Impl(
        path = path.toList(),
        sourceFile = sourceFile,
        begin = begin,
        end = end,
        unknownFields = unknownFields.toMap()
    )
}

private fun GeneratedCodeInfo.Annotation.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.GeneratedCodeInfo.Annotation {
    if (other !is pbandk.wkt.GeneratedCodeInfo.Annotation) return this

    return copy {
        path += other.path
        sourceFile = other.sourceFile ?: sourceFile
        begin = other.begin ?: begin
        end = other.end ?: end
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun GeneratedCodeInfo.Annotation.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.GeneratedCodeInfo.Annotation {
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
    return GeneratedCodeInfo_Annotation_Impl(pbandk.ListWithSize.Builder.fixed(path), sourceFile, begin, end, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Api : pbandk.Message {
    public val name: String
    public val methods: List<pbandk.wkt.Method>
    public val options: List<pbandk.wkt.Option>
    public val version: String
    public val sourceContext: pbandk.wkt.SourceContext?
    public val mixins: List<pbandk.wkt.Mixin>
    public val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Api
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api>

    public fun copy(
        name: String = this.name,
        methods: List<pbandk.wkt.Method> = this.methods,
        options: List<pbandk.wkt.Option> = this.options,
        version: String = this.version,
        sourceContext: pbandk.wkt.SourceContext? = this.sourceContext,
        mixins: List<pbandk.wkt.Mixin> = this.mixins,
        syntax: pbandk.wkt.Syntax = this.syntax,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Api

    public companion object : pbandk.Message.Companion<pbandk.wkt.Api> {
        @Deprecated("Use api { } instead")
        public operator fun invoke(
            name: String = "",
            methods: List<pbandk.wkt.Method> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            version: String = "",
            sourceContext: pbandk.wkt.SourceContext? = null,
            mixins: List<pbandk.wkt.Mixin> = emptyList(),
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Api = Api_Impl(
            name = name,
            methods = methods,
            options = options,
            version = version,
            sourceContext = sourceContext,
            mixins = mixins,
            syntax = syntax,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.Api by lazy { pbandk.wkt.Api() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Api = pbandk.wkt.Api.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Api, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Api::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "methods",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Method>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Method.Companion)),
                        jsonName = "methods",
                        value = pbandk.wkt.Api::methods
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Api::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "version",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "version",
                        value = pbandk.wkt.Api::version
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_context",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = pbandk.wkt.Api::sourceContext
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mixins",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Mixin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Mixin.Companion)),
                        jsonName = "mixins",
                        value = pbandk.wkt.Api::mixins
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Api::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Api",
                messageClass = pbandk.wkt.Api::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableApi : Api, pbandk.MutableMessage {
    public override var name: String
    public override var methods: List<pbandk.wkt.Method>
    public override var options: List<pbandk.wkt.Option>
    public override var version: String
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override var mixins: List<pbandk.wkt.Mixin>
    public override var syntax: pbandk.wkt.Syntax

    public fun toApi(): Api

    public companion object : pbandk.Message.Companion<pbandk.wkt.Api> {
        @Deprecated("Use api { } instead")
        public operator fun invoke(
            name: String = "",
            methods: List<pbandk.wkt.Method> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            version: String = "",
            sourceContext: pbandk.wkt.SourceContext? = null,
            mixins: List<pbandk.wkt.Mixin> = emptyList(),
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableApi = MutableApi_Impl(
            name = name,
            methods = methods,
            options = options,
            version = version,
            sourceContext = sourceContext,
            mixins = mixins,
            syntax = syntax,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableApi by lazy { MutableApi() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Api = pbandk.wkt.Api.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api> get() = pbandk.wkt.Api.descriptor
    }
}

public sealed interface Method : pbandk.Message {
    public val name: String
    public val requestTypeUrl: String
    public val requestStreaming: Boolean
    public val responseTypeUrl: String
    public val responseStreaming: Boolean
    public val options: List<pbandk.wkt.Option>
    public val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Method
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method>

    public fun copy(
        name: String = this.name,
        requestTypeUrl: String = this.requestTypeUrl,
        requestStreaming: Boolean = this.requestStreaming,
        responseTypeUrl: String = this.responseTypeUrl,
        responseStreaming: Boolean = this.responseStreaming,
        options: List<pbandk.wkt.Option> = this.options,
        syntax: pbandk.wkt.Syntax = this.syntax,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Method

    public companion object : pbandk.Message.Companion<pbandk.wkt.Method> {
        @Deprecated("Use method { } instead")
        public operator fun invoke(
            name: String = "",
            requestTypeUrl: String = "",
            requestStreaming: Boolean = false,
            responseTypeUrl: String = "",
            responseStreaming: Boolean = false,
            options: List<pbandk.wkt.Option> = emptyList(),
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Method = Method_Impl(
            name = name,
            requestTypeUrl = requestTypeUrl,
            requestStreaming = requestStreaming,
            responseTypeUrl = responseTypeUrl,
            responseStreaming = responseStreaming,
            options = options,
            syntax = syntax,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.Method by lazy { pbandk.wkt.Method() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Method = pbandk.wkt.Method.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Method, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Method::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_type_url",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "requestTypeUrl",
                        value = pbandk.wkt.Method::requestTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_streaming",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "requestStreaming",
                        value = pbandk.wkt.Method::requestStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_type_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "responseTypeUrl",
                        value = pbandk.wkt.Method::responseTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "responseStreaming",
                        value = pbandk.wkt.Method::responseStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Method::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Method::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Method",
                messageClass = pbandk.wkt.Method::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMethod : Method, pbandk.MutableMessage {
    public override var name: String
    public override var requestTypeUrl: String
    public override var requestStreaming: Boolean
    public override var responseTypeUrl: String
    public override var responseStreaming: Boolean
    public override var options: List<pbandk.wkt.Option>
    public override var syntax: pbandk.wkt.Syntax

    public fun toMethod(): Method

    public companion object : pbandk.Message.Companion<pbandk.wkt.Method> {
        @Deprecated("Use method { } instead")
        public operator fun invoke(
            name: String = "",
            requestTypeUrl: String = "",
            requestStreaming: Boolean = false,
            responseTypeUrl: String = "",
            responseStreaming: Boolean = false,
            options: List<pbandk.wkt.Option> = emptyList(),
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableMethod = MutableMethod_Impl(
            name = name,
            requestTypeUrl = requestTypeUrl,
            requestStreaming = requestStreaming,
            responseTypeUrl = responseTypeUrl,
            responseStreaming = responseStreaming,
            options = options,
            syntax = syntax,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableMethod by lazy { MutableMethod() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Method = pbandk.wkt.Method.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method> get() = pbandk.wkt.Method.descriptor
    }
}

public sealed interface Mixin : pbandk.Message {
    public val name: String
    public val root: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Mixin
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin>

    public fun copy(
        name: String = this.name,
        root: String = this.root,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Mixin

    public companion object : pbandk.Message.Companion<pbandk.wkt.Mixin> {
        @Deprecated("Use mixin { } instead")
        public operator fun invoke(
            name: String = "",
            root: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Mixin = Mixin_Impl(
            name = name,
            root = root,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.Mixin by lazy { pbandk.wkt.Mixin() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Mixin = pbandk.wkt.Mixin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Mixin, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Mixin::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "root",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "root",
                        value = pbandk.wkt.Mixin::root
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Mixin",
                messageClass = pbandk.wkt.Mixin::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMixin : Mixin, pbandk.MutableMessage {
    public override var name: String
    public override var root: String

    public fun toMixin(): Mixin

    public companion object : pbandk.Message.Companion<pbandk.wkt.Mixin> {
        @Deprecated("Use mixin { } instead")
        public operator fun invoke(
            name: String = "",
            root: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableMixin = MutableMixin_Impl(
            name = name,
            root = root,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableMixin by lazy { MutableMixin() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Mixin = pbandk.wkt.Mixin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin> get() = pbandk.wkt.Mixin.descriptor
    }
}

public fun api(builderAction: MutableApi.() -> Unit): Api {
    @Suppress("DEPRECATION") val builder = MutableApi()
    builder.builderAction()
    return builder.toApi()
}

@pbandk.Export
@pbandk.JsName("orDefaultForApi")
public fun Api?.orDefault(): pbandk.wkt.Api = this ?: Api.defaultInstance

private class Api_Impl(
    override val name: String,
    override val methods: List<pbandk.wkt.Method>,
    override val options: List<pbandk.wkt.Option>,
    override val version: String,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val mixins: List<pbandk.wkt.Mixin>,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Api, pbandk.GeneratedMessage<Api>() {
    override val descriptor get() = Api.descriptor

    override fun copy(
        name: String,
        methods: List<pbandk.wkt.Method>,
        options: List<pbandk.wkt.Option>,
        version: String,
        sourceContext: pbandk.wkt.SourceContext?,
        mixins: List<pbandk.wkt.Mixin>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Api_Impl(
        name = name,
        methods = methods,
        options = options,
        version = version,
        sourceContext = sourceContext,
        mixins = mixins,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Api)?.let {
        it.copy(
            methods = methods + other.methods,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            mixins = mixins + other.mixins,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableApi_Impl(
    override var name: String,
    override var methods: List<pbandk.wkt.Method>,
    override var options: List<pbandk.wkt.Option>,
    override var version: String,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override var mixins: List<pbandk.wkt.Mixin>,
    override var syntax: pbandk.wkt.Syntax,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableApi, pbandk.MutableGeneratedMessage<MutableApi>() {
    override val descriptor get() = Api.descriptor

    override fun copy(
        name: String,
        methods: List<pbandk.wkt.Method>,
        options: List<pbandk.wkt.Option>,
        version: String,
        sourceContext: pbandk.wkt.SourceContext?,
        mixins: List<pbandk.wkt.Mixin>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Api_Impl(
        name = name,
        methods = methods,
        options = options,
        version = version,
        sourceContext = sourceContext,
        mixins = mixins,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Api)?.let {
        it.copy(
            methods = methods + other.methods,
            options = options + other.options,
            sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext,
            mixins = mixins + other.mixins,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toApi() = Api_Impl(
        name = name,
        methods = methods,
        options = options,
        version = version,
        sourceContext = sourceContext,
        mixins = mixins,
        syntax = syntax,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Api.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Api {
    var name = ""
    var methods: pbandk.ListWithSize.Builder<pbandk.wkt.Method>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var version = ""
    var sourceContext: pbandk.wkt.SourceContext? = null
    var mixins: pbandk.ListWithSize.Builder<pbandk.wkt.Mixin>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> methods = (methods ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Method> }
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            4 -> version = _fieldValue as String
            5 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            6 -> mixins = (mixins ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Mixin> }
            7 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }
    @Suppress("DEPRECATION")
    return Api(name, pbandk.ListWithSize.Builder.fixed(methods), pbandk.ListWithSize.Builder.fixed(options), version,
        sourceContext, pbandk.ListWithSize.Builder.fixed(mixins), syntax, unknownFields)
}

public fun method(builderAction: MutableMethod.() -> Unit): Method {
    @Suppress("DEPRECATION") val builder = MutableMethod()
    builder.builderAction()
    return builder.toMethod()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethod")
public fun Method?.orDefault(): pbandk.wkt.Method = this ?: Method.defaultInstance

private class Method_Impl(
    override val name: String,
    override val requestTypeUrl: String,
    override val requestStreaming: Boolean,
    override val responseTypeUrl: String,
    override val responseStreaming: Boolean,
    override val options: List<pbandk.wkt.Option>,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Method, pbandk.GeneratedMessage<Method>() {
    override val descriptor get() = Method.descriptor

    override fun copy(
        name: String,
        requestTypeUrl: String,
        requestStreaming: Boolean,
        responseTypeUrl: String,
        responseStreaming: Boolean,
        options: List<pbandk.wkt.Option>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Method_Impl(
        name = name,
        requestTypeUrl = requestTypeUrl,
        requestStreaming = requestStreaming,
        responseTypeUrl = responseTypeUrl,
        responseStreaming = responseStreaming,
        options = options,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Method)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableMethod_Impl(
    override var name: String,
    override var requestTypeUrl: String,
    override var requestStreaming: Boolean,
    override var responseTypeUrl: String,
    override var responseStreaming: Boolean,
    override var options: List<pbandk.wkt.Option>,
    override var syntax: pbandk.wkt.Syntax,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMethod, pbandk.MutableGeneratedMessage<MutableMethod>() {
    override val descriptor get() = Method.descriptor

    override fun copy(
        name: String,
        requestTypeUrl: String,
        requestStreaming: Boolean,
        responseTypeUrl: String,
        responseStreaming: Boolean,
        options: List<pbandk.wkt.Option>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Method_Impl(
        name = name,
        requestTypeUrl = requestTypeUrl,
        requestStreaming = requestStreaming,
        responseTypeUrl = responseTypeUrl,
        responseStreaming = responseStreaming,
        options = options,
        syntax = syntax,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Method)?.let {
        it.copy(
            options = options + other.options,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMethod() = Method_Impl(
        name = name,
        requestTypeUrl = requestTypeUrl,
        requestStreaming = requestStreaming,
        responseTypeUrl = responseTypeUrl,
        responseStreaming = responseStreaming,
        options = options,
        syntax = syntax,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Method.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Method {
    var name = ""
    var requestTypeUrl = ""
    var requestStreaming = false
    var responseTypeUrl = ""
    var responseStreaming = false
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> requestTypeUrl = _fieldValue as String
            3 -> requestStreaming = _fieldValue as Boolean
            4 -> responseTypeUrl = _fieldValue as String
            5 -> responseStreaming = _fieldValue as Boolean
            6 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            7 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }
    @Suppress("DEPRECATION")
    return Method(name, requestTypeUrl, requestStreaming, responseTypeUrl,
        responseStreaming, pbandk.ListWithSize.Builder.fixed(options), syntax, unknownFields)
}

public fun mixin(builderAction: MutableMixin.() -> Unit): Mixin {
    @Suppress("DEPRECATION") val builder = MutableMixin()
    builder.builderAction()
    return builder.toMixin()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMixin")
public fun Mixin?.orDefault(): pbandk.wkt.Mixin = this ?: Mixin.defaultInstance

private class Mixin_Impl(
    override val name: String,
    override val root: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Mixin, pbandk.GeneratedMessage<Mixin>() {
    override val descriptor get() = Mixin.descriptor

    override fun copy(
        name: String,
        root: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Mixin_Impl(
        name = name,
        root = root,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Mixin)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableMixin_Impl(
    override var name: String,
    override var root: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMixin, pbandk.MutableGeneratedMessage<MutableMixin>() {
    override val descriptor get() = Mixin.descriptor

    override fun copy(
        name: String,
        root: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Mixin_Impl(
        name = name,
        root = root,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Mixin)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMixin() = Mixin_Impl(
        name = name,
        root = root,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Mixin.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Mixin {
    var name = ""
    var root = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> root = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return Mixin(name, root, unknownFields)
}

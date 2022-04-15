@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
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

    /**
     * The [MutableApi] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableApi.() -> Unit): pbandk.wkt.Api

    @Deprecated(
        message = "Use copy { } instead",
    )
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
        public val defaultInstance: pbandk.wkt.Api by lazy { pbandk.wkt.Api {} }
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

@pbandk.Export
public sealed interface MutableApi : pbandk.wkt.Api, pbandk.MutableMessage {
    public override var name: String
    public override val methods: MutableList<pbandk.wkt.Method>
    public override val options: MutableList<pbandk.wkt.Option>
    public override var version: String
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override val mixins: MutableList<pbandk.wkt.Mixin>
    public override var syntax: pbandk.wkt.Syntax
}

@pbandk.Export
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

    /**
     * The [MutableMethod] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMethod.() -> Unit): pbandk.wkt.Method

    @Deprecated(
        message = "Use copy { } instead",
    )
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
        public val defaultInstance: pbandk.wkt.Method by lazy { pbandk.wkt.Method {} }
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

@pbandk.Export
public sealed interface MutableMethod : pbandk.wkt.Method, pbandk.MutableMessage {
    public override var name: String
    public override var requestTypeUrl: String
    public override var requestStreaming: Boolean
    public override var responseTypeUrl: String
    public override var responseStreaming: Boolean
    public override val options: MutableList<pbandk.wkt.Option>
    public override var syntax: pbandk.wkt.Syntax
}

@pbandk.Export
public sealed interface Mixin : pbandk.Message {
    public val name: String
    public val root: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Mixin
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin>

    /**
     * The [MutableMixin] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMixin.() -> Unit): pbandk.wkt.Mixin

    @Deprecated(
        message = "Use copy { } instead",
    )
    public fun copy(
        name: String = this.name,
        root: String = this.root,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Mixin

    public companion object : pbandk.Message.Companion<pbandk.wkt.Mixin> {
        public val defaultInstance: pbandk.wkt.Mixin by lazy { pbandk.wkt.Mixin {} }
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

@pbandk.Export
public sealed interface MutableMixin : pbandk.wkt.Mixin, pbandk.MutableMessage {
    public override var name: String
    public override var root: String
}

@Deprecated(
    message = "Use Api { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Api"],
        expression = "Api {\nthis.name = name\nthis.methods += methods\nthis.options += options\nthis.version = version\nthis.sourceContext = sourceContext\nthis.mixins += mixins\nthis.syntax = syntax\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Api(
    name: String = "",
    methods: List<pbandk.wkt.Method> = emptyList(),
    options: List<pbandk.wkt.Option> = emptyList(),
    version: String = "",
    sourceContext: pbandk.wkt.SourceContext? = null,
    mixins: List<pbandk.wkt.Mixin> = emptyList(),
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Api = pbandk.wkt.Api {
    this.name = name
    this.methods += methods
    this.options += options
    this.version = version
    this.sourceContext = sourceContext
    this.mixins += mixins
    this.syntax = syntax
    this.unknownFields += unknownFields
}

/**
 * The [MutableApi] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Api(builderAction: pbandk.wkt.MutableApi.() -> Unit): pbandk.wkt.Api = pbandk.wkt.MutableApi_Impl(
    name = "",
    methods = mutableListOf(),
    options = mutableListOf(),
    version = "",
    sourceContext = null,
    mixins = mutableListOf(),
    syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields = mutableMapOf()
).also(builderAction).toApi()

@pbandk.Export
@pbandk.JsName("orDefaultForApi")
public fun Api?.orDefault(): pbandk.wkt.Api = this ?: pbandk.wkt.Api.defaultInstance

private class Api_Impl(
    override val name: String,
    override val methods: List<pbandk.wkt.Method>,
    override val options: List<pbandk.wkt.Option>,
    override val version: String,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val mixins: List<pbandk.wkt.Mixin>,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Api, pbandk.GeneratedMessage<pbandk.wkt.Api>() {
    override val descriptor get() = pbandk.wkt.Api.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableApi.() -> Unit) = pbandk.wkt.Api {
        this.name = this@Api_Impl.name
        this.methods += this@Api_Impl.methods
        this.options += this@Api_Impl.options
        this.version = this@Api_Impl.version
        this.sourceContext = this@Api_Impl.sourceContext
        this.mixins += this@Api_Impl.mixins
        this.syntax = this@Api_Impl.syntax
        this.unknownFields += this@Api_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        methods: List<pbandk.wkt.Method>,
        options: List<pbandk.wkt.Option>,
        version: String,
        sourceContext: pbandk.wkt.SourceContext?,
        mixins: List<pbandk.wkt.Mixin>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Api {
        this.name = name
        this.methods += methods
        this.options += options
        this.version = version
        this.sourceContext = sourceContext
        this.mixins += mixins
        this.syntax = syntax
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableApi_Impl(
    override var name: String,
    override val methods: MutableList<pbandk.wkt.Method>,
    override val options: MutableList<pbandk.wkt.Option>,
    override var version: String,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override val mixins: MutableList<pbandk.wkt.Mixin>,
    override var syntax: pbandk.wkt.Syntax,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableApi, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableApi>() {
    override val descriptor get() = pbandk.wkt.Api.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableApi.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        methods: List<pbandk.wkt.Method>,
        options: List<pbandk.wkt.Option>,
        version: String,
        sourceContext: pbandk.wkt.SourceContext?,
        mixins: List<pbandk.wkt.Mixin>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toApi() = Api_Impl(
        name = name,
        methods = methods.toList(),
        options = options.toList(),
        version = version,
        sourceContext = sourceContext,
        mixins = mixins.toList(),
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )
}

private fun Api.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Api {
    if (other !is pbandk.wkt.Api) return this

    return copy {
        name = other.name
        methods += other.methods
        options += other.options
        version = other.version
        sourceContext = sourceContext?.plus(other.sourceContext) ?: other.sourceContext
        mixins += other.mixins
        syntax = other.syntax
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Api.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Api {
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
    return Api_Impl(name, pbandk.ListWithSize.Builder.fixed(methods), pbandk.ListWithSize.Builder.fixed(options), version,
        sourceContext, pbandk.ListWithSize.Builder.fixed(mixins), syntax, unknownFields)
}

@Deprecated(
    message = "Use Method { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Method"],
        expression = "Method {\nthis.name = name\nthis.requestTypeUrl = requestTypeUrl\nthis.requestStreaming = requestStreaming\nthis.responseTypeUrl = responseTypeUrl\nthis.responseStreaming = responseStreaming\nthis.options += options\nthis.syntax = syntax\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Method(
    name: String = "",
    requestTypeUrl: String = "",
    requestStreaming: Boolean = false,
    responseTypeUrl: String = "",
    responseStreaming: Boolean = false,
    options: List<pbandk.wkt.Option> = emptyList(),
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Method = pbandk.wkt.Method {
    this.name = name
    this.requestTypeUrl = requestTypeUrl
    this.requestStreaming = requestStreaming
    this.responseTypeUrl = responseTypeUrl
    this.responseStreaming = responseStreaming
    this.options += options
    this.syntax = syntax
    this.unknownFields += unknownFields
}

/**
 * The [MutableMethod] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Method(builderAction: pbandk.wkt.MutableMethod.() -> Unit): pbandk.wkt.Method = pbandk.wkt.MutableMethod_Impl(
    name = "",
    requestTypeUrl = "",
    requestStreaming = false,
    responseTypeUrl = "",
    responseStreaming = false,
    options = mutableListOf(),
    syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields = mutableMapOf()
).also(builderAction).toMethod()

@pbandk.Export
@pbandk.JsName("orDefaultForMethod")
public fun Method?.orDefault(): pbandk.wkt.Method = this ?: pbandk.wkt.Method.defaultInstance

private class Method_Impl(
    override val name: String,
    override val requestTypeUrl: String,
    override val requestStreaming: Boolean,
    override val responseTypeUrl: String,
    override val responseStreaming: Boolean,
    override val options: List<pbandk.wkt.Option>,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Method, pbandk.GeneratedMessage<pbandk.wkt.Method>() {
    override val descriptor get() = pbandk.wkt.Method.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableMethod.() -> Unit) = pbandk.wkt.Method {
        this.name = this@Method_Impl.name
        this.requestTypeUrl = this@Method_Impl.requestTypeUrl
        this.requestStreaming = this@Method_Impl.requestStreaming
        this.responseTypeUrl = this@Method_Impl.responseTypeUrl
        this.responseStreaming = this@Method_Impl.responseStreaming
        this.options += this@Method_Impl.options
        this.syntax = this@Method_Impl.syntax
        this.unknownFields += this@Method_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        requestTypeUrl: String,
        requestStreaming: Boolean,
        responseTypeUrl: String,
        responseStreaming: Boolean,
        options: List<pbandk.wkt.Option>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Method {
        this.name = name
        this.requestTypeUrl = requestTypeUrl
        this.requestStreaming = requestStreaming
        this.responseTypeUrl = responseTypeUrl
        this.responseStreaming = responseStreaming
        this.options += options
        this.syntax = syntax
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMethod_Impl(
    override var name: String,
    override var requestTypeUrl: String,
    override var requestStreaming: Boolean,
    override var responseTypeUrl: String,
    override var responseStreaming: Boolean,
    override val options: MutableList<pbandk.wkt.Option>,
    override var syntax: pbandk.wkt.Syntax,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableMethod, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableMethod>() {
    override val descriptor get() = pbandk.wkt.Method.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableMethod.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        requestTypeUrl: String,
        requestStreaming: Boolean,
        responseTypeUrl: String,
        responseStreaming: Boolean,
        options: List<pbandk.wkt.Option>,
        syntax: pbandk.wkt.Syntax,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMethod() = Method_Impl(
        name = name,
        requestTypeUrl = requestTypeUrl,
        requestStreaming = requestStreaming,
        responseTypeUrl = responseTypeUrl,
        responseStreaming = responseStreaming,
        options = options.toList(),
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )
}

private fun Method.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Method {
    if (other !is pbandk.wkt.Method) return this

    return copy {
        name = other.name
        requestTypeUrl = other.requestTypeUrl
        requestStreaming = other.requestStreaming
        responseTypeUrl = other.responseTypeUrl
        responseStreaming = other.responseStreaming
        options += other.options
        syntax = other.syntax
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Method.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Method {
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
    return Method_Impl(name, requestTypeUrl, requestStreaming, responseTypeUrl,
        responseStreaming, pbandk.ListWithSize.Builder.fixed(options), syntax, unknownFields)
}

@Deprecated(
    message = "Use Mixin { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Mixin"],
        expression = "Mixin {\nthis.name = name\nthis.root = root\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Mixin(
    name: String = "",
    root: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Mixin = pbandk.wkt.Mixin {
    this.name = name
    this.root = root
    this.unknownFields += unknownFields
}

/**
 * The [MutableMixin] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Mixin(builderAction: pbandk.wkt.MutableMixin.() -> Unit): pbandk.wkt.Mixin = pbandk.wkt.MutableMixin_Impl(
    name = "",
    root = "",
    unknownFields = mutableMapOf()
).also(builderAction).toMixin()

@pbandk.Export
@pbandk.JsName("orDefaultForMixin")
public fun Mixin?.orDefault(): pbandk.wkt.Mixin = this ?: pbandk.wkt.Mixin.defaultInstance

private class Mixin_Impl(
    override val name: String,
    override val root: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Mixin, pbandk.GeneratedMessage<pbandk.wkt.Mixin>() {
    override val descriptor get() = pbandk.wkt.Mixin.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableMixin.() -> Unit) = pbandk.wkt.Mixin {
        this.name = this@Mixin_Impl.name
        this.root = this@Mixin_Impl.root
        this.unknownFields += this@Mixin_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        root: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Mixin {
        this.name = name
        this.root = root
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMixin_Impl(
    override var name: String,
    override var root: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableMixin, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableMixin>() {
    override val descriptor get() = pbandk.wkt.Mixin.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableMixin.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        root: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMixin() = Mixin_Impl(
        name = name,
        root = root,
        unknownFields = unknownFields.toMap()
    )
}

private fun Mixin.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Mixin {
    if (other !is pbandk.wkt.Mixin) return this

    return copy {
        name = other.name
        root = other.root
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Mixin.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Mixin {
    var name = ""
    var root = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> root = _fieldValue as String
        }
    }
    return Mixin_Impl(name, root, unknownFields)
}

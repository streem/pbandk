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

    /**
     * The [MutableApi] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableApi.() -> Unit): pbandk.wkt.Api

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Api, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "name",
                value = pbandk.wkt.Api::name,
                mutableValue = pbandk.wkt.MutableApi::name,
            )
        public val methods: pbandk.FieldDescriptor<pbandk.wkt.Api, List<pbandk.wkt.Method>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "methods",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Method>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Method.Companion)),
                jsonName = "methods",
                value = pbandk.wkt.Api::methods,
                mutableValue = pbandk.wkt.MutableApi::methods,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.Api, List<pbandk.wkt.Option>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "options",
                number = 3,
                type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                jsonName = "options",
                value = pbandk.wkt.Api::options,
                mutableValue = pbandk.wkt.MutableApi::options,
            )
        public val version: pbandk.FieldDescriptor<pbandk.wkt.Api, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "version",
                number = 4,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "version",
                value = pbandk.wkt.Api::version,
                mutableValue = pbandk.wkt.MutableApi::version,
            )
        public val sourceContext: pbandk.FieldDescriptor<pbandk.wkt.Api, pbandk.wkt.SourceContext?> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "source_context",
                number = 5,
                type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                jsonName = "sourceContext",
                value = pbandk.wkt.Api::sourceContext,
                mutableValue = pbandk.wkt.MutableApi::sourceContext,
            )
        public val mixins: pbandk.FieldDescriptor<pbandk.wkt.Api, List<pbandk.wkt.Mixin>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "mixins",
                number = 6,
                type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Mixin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Mixin.Companion)),
                jsonName = "mixins",
                value = pbandk.wkt.Api::mixins,
                mutableValue = pbandk.wkt.MutableApi::mixins,
            )
        public val syntax: pbandk.FieldDescriptor<pbandk.wkt.Api, pbandk.wkt.Syntax> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Api::descriptor,
                name = "syntax",
                number = 7,
                type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                jsonName = "syntax",
                value = pbandk.wkt.Api::syntax,
                mutableValue = pbandk.wkt.MutableApi::syntax,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Api> {
        public val defaultInstance: pbandk.wkt.Api by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Api {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Api",
                messageClass = pbandk.wkt.Api::class,
                messageCompanion = this,
                builder = ::Api,
                fields = listOf(
                    pbandk.wkt.Api.FieldDescriptors.name,
                    pbandk.wkt.Api.FieldDescriptors.methods,
                    pbandk.wkt.Api.FieldDescriptors.options,
                    pbandk.wkt.Api.FieldDescriptors.version,
                    pbandk.wkt.Api.FieldDescriptors.sourceContext,
                    pbandk.wkt.Api.FieldDescriptors.mixins,
                    pbandk.wkt.Api.FieldDescriptors.syntax,
                ),
            )
        }
    }
}

public sealed interface MutableApi : pbandk.wkt.Api, pbandk.MutableMessage<pbandk.wkt.Api> {
    public override var name: String
    public override val methods: MutableList<pbandk.wkt.Method>
    public override val options: MutableList<pbandk.wkt.Option>
    public override var version: String
    public override var sourceContext: pbandk.wkt.SourceContext?
    public override val mixins: MutableList<pbandk.wkt.Mixin>
    public override var syntax: pbandk.wkt.Syntax
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

    /**
     * The [MutableMethod] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableMethod.() -> Unit): pbandk.wkt.Method

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
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

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Method, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "name",
                value = pbandk.wkt.Method::name,
                mutableValue = pbandk.wkt.MutableMethod::name,
            )
        public val requestTypeUrl: pbandk.FieldDescriptor<pbandk.wkt.Method, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "request_type_url",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "requestTypeUrl",
                value = pbandk.wkt.Method::requestTypeUrl,
                mutableValue = pbandk.wkt.MutableMethod::requestTypeUrl,
            )
        public val requestStreaming: pbandk.FieldDescriptor<pbandk.wkt.Method, Boolean> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "request_streaming",
                number = 3,
                type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                jsonName = "requestStreaming",
                value = pbandk.wkt.Method::requestStreaming,
                mutableValue = pbandk.wkt.MutableMethod::requestStreaming,
            )
        public val responseTypeUrl: pbandk.FieldDescriptor<pbandk.wkt.Method, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "response_type_url",
                number = 4,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "responseTypeUrl",
                value = pbandk.wkt.Method::responseTypeUrl,
                mutableValue = pbandk.wkt.MutableMethod::responseTypeUrl,
            )
        public val responseStreaming: pbandk.FieldDescriptor<pbandk.wkt.Method, Boolean> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "response_streaming",
                number = 5,
                type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                jsonName = "responseStreaming",
                value = pbandk.wkt.Method::responseStreaming,
                mutableValue = pbandk.wkt.MutableMethod::responseStreaming,
            )
        public val options: pbandk.FieldDescriptor<pbandk.wkt.Method, List<pbandk.wkt.Option>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "options",
                number = 6,
                type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                jsonName = "options",
                value = pbandk.wkt.Method::options,
                mutableValue = pbandk.wkt.MutableMethod::options,
            )
        public val syntax: pbandk.FieldDescriptor<pbandk.wkt.Method, pbandk.wkt.Syntax> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Method::descriptor,
                name = "syntax",
                number = 7,
                type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                jsonName = "syntax",
                value = pbandk.wkt.Method::syntax,
                mutableValue = pbandk.wkt.MutableMethod::syntax,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Method> {
        public val defaultInstance: pbandk.wkt.Method by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Method {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Method",
                messageClass = pbandk.wkt.Method::class,
                messageCompanion = this,
                builder = ::Method,
                fields = listOf(
                    pbandk.wkt.Method.FieldDescriptors.name,
                    pbandk.wkt.Method.FieldDescriptors.requestTypeUrl,
                    pbandk.wkt.Method.FieldDescriptors.requestStreaming,
                    pbandk.wkt.Method.FieldDescriptors.responseTypeUrl,
                    pbandk.wkt.Method.FieldDescriptors.responseStreaming,
                    pbandk.wkt.Method.FieldDescriptors.options,
                    pbandk.wkt.Method.FieldDescriptors.syntax,
                ),
            )
        }
    }
}

public sealed interface MutableMethod : pbandk.wkt.Method, pbandk.MutableMessage<pbandk.wkt.Method> {
    public override var name: String
    public override var requestTypeUrl: String
    public override var requestStreaming: Boolean
    public override var responseTypeUrl: String
    public override var responseStreaming: Boolean
    public override val options: MutableList<pbandk.wkt.Option>
    public override var syntax: pbandk.wkt.Syntax
}

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
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        root: String = this.root,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Mixin

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.wkt.Mixin, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Mixin::descriptor,
                name = "name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "name",
                value = pbandk.wkt.Mixin::name,
                mutableValue = pbandk.wkt.MutableMixin::name,
            )
        public val root: pbandk.FieldDescriptor<pbandk.wkt.Mixin, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Mixin::descriptor,
                name = "root",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "root",
                value = pbandk.wkt.Mixin::root,
                mutableValue = pbandk.wkt.MutableMixin::root,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Mixin> {
        public val defaultInstance: pbandk.wkt.Mixin by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Mixin {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Mixin",
                messageClass = pbandk.wkt.Mixin::class,
                messageCompanion = this,
                builder = ::Mixin,
                fields = listOf(
                    pbandk.wkt.Mixin.FieldDescriptors.name,
                    pbandk.wkt.Mixin.FieldDescriptors.root,
                ),
            )
        }
    }
}

public sealed interface MutableMixin : pbandk.wkt.Mixin, pbandk.MutableMessage<pbandk.wkt.Mixin> {
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
@pbandk.JsName("buildApi")
public fun Api(builderAction: pbandk.wkt.MutableApi.() -> Unit): pbandk.wkt.Api =
    pbandk.wkt.MutableApi_Impl(
        name = "",
        methods = pbandk.gen.MutableListField(),
        options = pbandk.gen.MutableListField(),
        version = "",
        sourceContext = null,
        mixins = pbandk.gen.MutableListField(),
        syntax = pbandk.wkt.Syntax.fromValue(0),
    ).also(builderAction).toApi()

@pbandk.Export
@pbandk.JsName("orDefaultForApi")
public fun Api?.orDefault(): pbandk.wkt.Api = this ?: pbandk.wkt.Api.defaultInstance

private class Api_Impl(
    override val name: String,
    override val methods: pbandk.gen.ListField<pbandk.wkt.Method>,
    override val options: pbandk.gen.ListField<pbandk.wkt.Option>,
    override val version: String,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val mixins: pbandk.gen.ListField<pbandk.wkt.Mixin>,
    override val syntax: pbandk.wkt.Syntax,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Api, pbandk.gen.GeneratedMessage<pbandk.wkt.Api>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Api.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableApi.() -> Unit) = super.copy(builderAction)

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
}

private class MutableApi_Impl(
    override var name: String,
    override val methods: pbandk.gen.MutableListField<pbandk.wkt.Method>,
    override val options: pbandk.gen.MutableListField<pbandk.wkt.Option>,
    override var version: String,
    override var sourceContext: pbandk.wkt.SourceContext?,
    override val mixins: pbandk.gen.MutableListField<pbandk.wkt.Mixin>,
    override var syntax: pbandk.wkt.Syntax,
) : pbandk.wkt.MutableApi, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Api>() {
    override val descriptor get() = pbandk.wkt.Api.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableApi.() -> Unit) = super.copy(builderAction)

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

    fun toApi() = Api_Impl(
        name = name,
        methods = methods.toListField(),
        options = options.toListField(),
        version = version,
        sourceContext = sourceContext,
        mixins = mixins.toListField(),
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )
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
@pbandk.JsName("buildMethod")
public fun Method(builderAction: pbandk.wkt.MutableMethod.() -> Unit): pbandk.wkt.Method =
    pbandk.wkt.MutableMethod_Impl(
        name = "",
        requestTypeUrl = "",
        requestStreaming = false,
        responseTypeUrl = "",
        responseStreaming = false,
        options = pbandk.gen.MutableListField(),
        syntax = pbandk.wkt.Syntax.fromValue(0),
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
    override val options: pbandk.gen.ListField<pbandk.wkt.Option>,
    override val syntax: pbandk.wkt.Syntax,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Method, pbandk.gen.GeneratedMessage<pbandk.wkt.Method>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Method.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMethod.() -> Unit) = super.copy(builderAction)

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
}

private class MutableMethod_Impl(
    override var name: String,
    override var requestTypeUrl: String,
    override var requestStreaming: Boolean,
    override var responseTypeUrl: String,
    override var responseStreaming: Boolean,
    override val options: pbandk.gen.MutableListField<pbandk.wkt.Option>,
    override var syntax: pbandk.wkt.Syntax,
) : pbandk.wkt.MutableMethod, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Method>() {
    override val descriptor get() = pbandk.wkt.Method.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMethod.() -> Unit) = super.copy(builderAction)

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

    fun toMethod() = Method_Impl(
        name = name,
        requestTypeUrl = requestTypeUrl,
        requestStreaming = requestStreaming,
        responseTypeUrl = responseTypeUrl,
        responseStreaming = responseStreaming,
        options = options.toListField(),
        syntax = syntax,
        unknownFields = unknownFields.toMap()
    )
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
@pbandk.JsName("buildMixin")
public fun Mixin(builderAction: pbandk.wkt.MutableMixin.() -> Unit): pbandk.wkt.Mixin =
    pbandk.wkt.MutableMixin_Impl(
        name = "",
        root = "",
    ).also(builderAction).toMixin()

@pbandk.Export
@pbandk.JsName("orDefaultForMixin")
public fun Mixin?.orDefault(): pbandk.wkt.Mixin = this ?: pbandk.wkt.Mixin.defaultInstance

private class Mixin_Impl(
    override val name: String,
    override val root: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Mixin, pbandk.gen.GeneratedMessage<pbandk.wkt.Mixin>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Mixin.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMixin.() -> Unit) = super.copy(builderAction)

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
}

private class MutableMixin_Impl(
    override var name: String,
    override var root: String,
) : pbandk.wkt.MutableMixin, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Mixin>() {
    override val descriptor get() = pbandk.wkt.Mixin.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableMixin.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        root: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMixin() = Mixin_Impl(
        name = name,
        root = root,
        unknownFields = unknownFields.toMap()
    )
}

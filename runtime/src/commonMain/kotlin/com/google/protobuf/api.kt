@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class Api(
    val name: String = "",
    val methods: List<com.google.protobuf.Method> = emptyList(),
    val options: List<com.google.protobuf.Option> = emptyList(),
    val version: String = "",
    val sourceContext: com.google.protobuf.SourceContext? = null,
    val mixins: List<com.google.protobuf.Mixin> = emptyList(),
    val syntax: com.google.protobuf.Syntax = com.google.protobuf.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Api = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Api> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Api> {
        public val defaultInstance: com.google.protobuf.Api by lazy { com.google.protobuf.Api() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Api = com.google.protobuf.Api.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Api> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Api, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = com.google.protobuf.Api::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "methods",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.Method>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Method.Companion)),
                        jsonName = "methods",
                        value = com.google.protobuf.Api::methods
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Option.Companion)),
                        jsonName = "options",
                        value = com.google.protobuf.Api::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "version",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "version",
                        value = com.google.protobuf.Api::version
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_context",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = com.google.protobuf.Api::sourceContext
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mixins",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.Mixin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Mixin.Companion)),
                        jsonName = "mixins",
                        value = com.google.protobuf.Api::mixins
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.Syntax.Companion),
                        jsonName = "syntax",
                        value = com.google.protobuf.Api::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Api",
                messageClass = com.google.protobuf.Api::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Method(
    val name: String = "",
    val requestTypeUrl: String = "",
    val requestStreaming: Boolean = false,
    val responseTypeUrl: String = "",
    val responseStreaming: Boolean = false,
    val options: List<com.google.protobuf.Option> = emptyList(),
    val syntax: com.google.protobuf.Syntax = com.google.protobuf.Syntax.fromValue(0),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Method = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Method> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Method> {
        public val defaultInstance: com.google.protobuf.Method by lazy { com.google.protobuf.Method() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Method = com.google.protobuf.Method.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Method> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Method, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = com.google.protobuf.Method::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_type_url",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "requestTypeUrl",
                        value = com.google.protobuf.Method::requestTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_streaming",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "requestStreaming",
                        value = com.google.protobuf.Method::requestStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_type_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "responseTypeUrl",
                        value = com.google.protobuf.Method::responseTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "responseStreaming",
                        value = com.google.protobuf.Method::responseStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<com.google.protobuf.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = com.google.protobuf.Option.Companion)),
                        jsonName = "options",
                        value = com.google.protobuf.Method::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = com.google.protobuf.Syntax.Companion),
                        jsonName = "syntax",
                        value = com.google.protobuf.Method::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Method",
                messageClass = com.google.protobuf.Method::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Mixin(
    val name: String = "",
    val root: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Mixin = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Mixin> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Mixin> {
        public val defaultInstance: com.google.protobuf.Mixin by lazy { com.google.protobuf.Mixin() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Mixin = com.google.protobuf.Mixin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Mixin> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Mixin, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = com.google.protobuf.Mixin::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "root",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "root",
                        value = com.google.protobuf.Mixin::root
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Mixin",
                messageClass = com.google.protobuf.Mixin::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForApi")
public fun Api?.orDefault(): com.google.protobuf.Api = this ?: Api.defaultInstance

private fun Api.protoMergeImpl(plus: pbandk.Message?): Api = (plus as? Api)?.let {
    it.copy(
        methods = methods + plus.methods,
        options = options + plus.options,
        sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
        mixins = mixins + plus.mixins,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Api.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Api {
    var name = ""
    var methods: pbandk.ListWithSize.Builder<com.google.protobuf.Method>? = null
    var options: pbandk.ListWithSize.Builder<com.google.protobuf.Option>? = null
    var version = ""
    var sourceContext: com.google.protobuf.SourceContext? = null
    var mixins: pbandk.ListWithSize.Builder<com.google.protobuf.Mixin>? = null
    var syntax: com.google.protobuf.Syntax = com.google.protobuf.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> methods = (methods ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.Method> }
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.Option> }
            4 -> version = _fieldValue as String
            5 -> sourceContext = _fieldValue as com.google.protobuf.SourceContext
            6 -> mixins = (mixins ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.Mixin> }
            7 -> syntax = _fieldValue as com.google.protobuf.Syntax
        }
    }

    return Api(name, pbandk.ListWithSize.Builder.fixed(methods), pbandk.ListWithSize.Builder.fixed(options), version,
        sourceContext, pbandk.ListWithSize.Builder.fixed(mixins), syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMethod")
public fun Method?.orDefault(): com.google.protobuf.Method = this ?: Method.defaultInstance

private fun Method.protoMergeImpl(plus: pbandk.Message?): Method = (plus as? Method)?.let {
    it.copy(
        options = options + plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Method.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Method {
    var name = ""
    var requestTypeUrl = ""
    var requestStreaming = false
    var responseTypeUrl = ""
    var responseStreaming = false
    var options: pbandk.ListWithSize.Builder<com.google.protobuf.Option>? = null
    var syntax: com.google.protobuf.Syntax = com.google.protobuf.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> requestTypeUrl = _fieldValue as String
            3 -> requestStreaming = _fieldValue as Boolean
            4 -> responseTypeUrl = _fieldValue as String
            5 -> responseStreaming = _fieldValue as Boolean
            6 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<com.google.protobuf.Option> }
            7 -> syntax = _fieldValue as com.google.protobuf.Syntax
        }
    }

    return Method(name, requestTypeUrl, requestStreaming, responseTypeUrl,
        responseStreaming, pbandk.ListWithSize.Builder.fixed(options), syntax, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMixin")
public fun Mixin?.orDefault(): com.google.protobuf.Mixin = this ?: Mixin.defaultInstance

private fun Mixin.protoMergeImpl(plus: pbandk.Message?): Mixin = (plus as? Mixin)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

    return Mixin(name, root, unknownFields)
}

package pbandk.wkt

data class Api(
    val name: String = "",
    val methods: List<pbandk.wkt.Method> = emptyList(),
    val options: List<pbandk.wkt.Option> = emptyList(),
    val version: String = "",
    val sourceContext: pbandk.wkt.SourceContext? = null,
    val mixins: List<pbandk.wkt.Mixin> = emptyList(),
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Api> {
    override operator fun plus(other: Api?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Api> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Api.protoUnmarshalImpl(u)
    }
}

data class Method(
    val name: String = "",
    val requestTypeUrl: String = "",
    val requestStreaming: Boolean = false,
    val responseTypeUrl: String = "",
    val responseStreaming: Boolean = false,
    val options: List<pbandk.wkt.Option> = emptyList(),
    val syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Method> {
    override operator fun plus(other: Method?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Method> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Method.protoUnmarshalImpl(u)
    }
}

data class Mixin(
    val name: String = "",
    val root: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Mixin> {
    override operator fun plus(other: Mixin?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    companion object : pbandk.Message.Companion<Mixin> {
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Mixin.protoUnmarshalImpl(u)
    }
}

private fun Api.protoMergeImpl(plus: Api?): Api = plus?.copy(
    methods = methods + plus.methods,
    options = options + plus.options,
    sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
    mixins = mixins + plus.mixins,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Api.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (methods.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(2) * methods.size) + methods.sumBy(pbandk.Sizer::messageSize)
    if (options.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(3) * options.size) + options.sumBy(pbandk.Sizer::messageSize)
    if (version.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(version)
    if (sourceContext != null) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.messageSize(sourceContext)
    if (mixins.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * mixins.size) + mixins.sumBy(pbandk.Sizer::messageSize)
    if (syntax.value != 0) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.enumSize(syntax)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Api.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (methods.isNotEmpty()) methods.forEach { protoMarshal.writeTag(18).writeMessage(it) }
    if (options.isNotEmpty()) options.forEach { protoMarshal.writeTag(26).writeMessage(it) }
    if (version.isNotEmpty()) protoMarshal.writeTag(34).writeString(version)
    if (sourceContext != null) protoMarshal.writeTag(42).writeMessage(sourceContext)
    if (mixins.isNotEmpty()) mixins.forEach { protoMarshal.writeTag(50).writeMessage(it) }
    if (syntax.value != 0) protoMarshal.writeTag(56).writeEnum(syntax)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Api.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Api {
    var name = ""
    var methods: pbandk.ListWithSize.Builder<pbandk.wkt.Method>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var version = ""
    var sourceContext: pbandk.wkt.SourceContext? = null
    var mixins: pbandk.ListWithSize.Builder<pbandk.wkt.Mixin>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Api(name, pbandk.ListWithSize.Builder.fixed(methods), pbandk.ListWithSize.Builder.fixed(options), version,
            sourceContext, pbandk.ListWithSize.Builder.fixed(mixins), syntax, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> methods = protoUnmarshal.readRepeatedMessage(methods, pbandk.wkt.Method.Companion, true)
        26 -> options = protoUnmarshal.readRepeatedMessage(options, pbandk.wkt.Option.Companion, true)
        34 -> version = protoUnmarshal.readString()
        42 -> sourceContext = protoUnmarshal.readMessage(pbandk.wkt.SourceContext.Companion)
        50 -> mixins = protoUnmarshal.readRepeatedMessage(mixins, pbandk.wkt.Mixin.Companion, true)
        56 -> syntax = protoUnmarshal.readEnum(pbandk.wkt.Syntax.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun Method.protoMergeImpl(plus: Method?): Method = plus?.copy(
    options = options + plus.options,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Method.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (requestTypeUrl.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(requestTypeUrl)
    if (requestStreaming) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.boolSize(requestStreaming)
    if (responseTypeUrl.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(responseTypeUrl)
    if (responseStreaming) protoSize += pbandk.Sizer.tagSize(5) + pbandk.Sizer.boolSize(responseStreaming)
    if (options.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(6) * options.size) + options.sumBy(pbandk.Sizer::messageSize)
    if (syntax.value != 0) protoSize += pbandk.Sizer.tagSize(7) + pbandk.Sizer.enumSize(syntax)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Method.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (requestTypeUrl.isNotEmpty()) protoMarshal.writeTag(18).writeString(requestTypeUrl)
    if (requestStreaming) protoMarshal.writeTag(24).writeBool(requestStreaming)
    if (responseTypeUrl.isNotEmpty()) protoMarshal.writeTag(34).writeString(responseTypeUrl)
    if (responseStreaming) protoMarshal.writeTag(40).writeBool(responseStreaming)
    if (options.isNotEmpty()) options.forEach { protoMarshal.writeTag(50).writeMessage(it) }
    if (syntax.value != 0) protoMarshal.writeTag(56).writeEnum(syntax)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Method.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Method {
    var name = ""
    var requestTypeUrl = ""
    var requestStreaming = false
    var responseTypeUrl = ""
    var responseStreaming = false
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Method(name, requestTypeUrl, requestStreaming, responseTypeUrl,
            responseStreaming, pbandk.ListWithSize.Builder.fixed(options), syntax, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> requestTypeUrl = protoUnmarshal.readString()
        24 -> requestStreaming = protoUnmarshal.readBool()
        34 -> responseTypeUrl = protoUnmarshal.readString()
        40 -> responseStreaming = protoUnmarshal.readBool()
        50 -> options = protoUnmarshal.readRepeatedMessage(options, pbandk.wkt.Option.Companion, true)
        56 -> syntax = protoUnmarshal.readEnum(pbandk.wkt.Syntax.Companion)
        else -> protoUnmarshal.unknownField()
    }
}

private fun Mixin.protoMergeImpl(plus: Mixin?): Mixin = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Mixin.protoSizeImpl(): Int {
    var protoSize = 0
    if (name.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (root.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(root)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Mixin.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name.isNotEmpty()) protoMarshal.writeTag(10).writeString(name)
    if (root.isNotEmpty()) protoMarshal.writeTag(18).writeString(root)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Mixin.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Mixin {
    var name = ""
    var root = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Mixin(name, root, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> root = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

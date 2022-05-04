@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.examples.greeter.pb

public sealed interface HelloRequest : pbandk.Message {
    public val name: String

    override operator fun plus(other: pbandk.Message?): pbandk.examples.greeter.pb.HelloRequest
    override val descriptor: pbandk.MessageDescriptor<pbandk.examples.greeter.pb.HelloRequest>

    /**
     * The [MutableHelloRequest] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.examples.greeter.pb.MutableHelloRequest.() -> Unit): pbandk.examples.greeter.pb.HelloRequest

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.examples.greeter.pb.HelloRequest

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.examples.greeter.pb.HelloRequest, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.examples.greeter.pb.HelloRequest::descriptor,
                name = "name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "name",
                value = pbandk.examples.greeter.pb.HelloRequest::name,
                mutableValue = pbandk.examples.greeter.pb.MutableHelloRequest::name,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.examples.greeter.pb.HelloRequest> {
        public val defaultInstance: pbandk.examples.greeter.pb.HelloRequest by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.examples.greeter.pb.HelloRequest {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.greeter.pb.HelloRequest> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "helloworld.HelloRequest",
                messageClass = pbandk.examples.greeter.pb.HelloRequest::class,
                messageCompanion = this,
                builder = ::HelloRequest,
                fields = listOf(
                    pbandk.examples.greeter.pb.HelloRequest.FieldDescriptors.name,
                ),
            )
        }
    }
}

public sealed interface MutableHelloRequest : pbandk.examples.greeter.pb.HelloRequest, pbandk.MutableMessage<pbandk.examples.greeter.pb.HelloRequest> {
    public override var name: String
}

public sealed interface HelloReply : pbandk.Message {
    public val message: String

    override operator fun plus(other: pbandk.Message?): pbandk.examples.greeter.pb.HelloReply
    override val descriptor: pbandk.MessageDescriptor<pbandk.examples.greeter.pb.HelloReply>

    /**
     * The [MutableHelloReply] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.examples.greeter.pb.MutableHelloReply.() -> Unit): pbandk.examples.greeter.pb.HelloReply

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        message: String = this.message,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.examples.greeter.pb.HelloReply

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val message: pbandk.FieldDescriptor<pbandk.examples.greeter.pb.HelloReply, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.examples.greeter.pb.HelloReply::descriptor,
                name = "message",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "message",
                value = pbandk.examples.greeter.pb.HelloReply::message,
                mutableValue = pbandk.examples.greeter.pb.MutableHelloReply::message,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.examples.greeter.pb.HelloReply> {
        public val defaultInstance: pbandk.examples.greeter.pb.HelloReply by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.examples.greeter.pb.HelloReply {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.greeter.pb.HelloReply> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "helloworld.HelloReply",
                messageClass = pbandk.examples.greeter.pb.HelloReply::class,
                messageCompanion = this,
                builder = ::HelloReply,
                fields = listOf(
                    pbandk.examples.greeter.pb.HelloReply.FieldDescriptors.message,
                ),
            )
        }
    }
}

public sealed interface MutableHelloReply : pbandk.examples.greeter.pb.HelloReply, pbandk.MutableMessage<pbandk.examples.greeter.pb.HelloReply> {
    public override var message: String
}

@Deprecated(
    message = "Use HelloRequest { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.examples.greeter.pb.HelloRequest"],
        expression = "HelloRequest {\nthis.name = name\nthis.unknownFields += unknownFields\n}",
    )
)
public fun HelloRequest(
    name: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.examples.greeter.pb.HelloRequest = pbandk.examples.greeter.pb.HelloRequest {
    this.name = name
    this.unknownFields += unknownFields
}

/**
 * The [MutableHelloRequest] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildHelloRequest")
public fun HelloRequest(builderAction: pbandk.examples.greeter.pb.MutableHelloRequest.() -> Unit): pbandk.examples.greeter.pb.HelloRequest =
    pbandk.examples.greeter.pb.MutableHelloRequest_Impl(
        name = "",
    ).also(builderAction).toHelloRequest()

@pbandk.Export
@pbandk.JsName("orDefaultForHelloRequest")
public fun HelloRequest?.orDefault(): pbandk.examples.greeter.pb.HelloRequest = this ?: pbandk.examples.greeter.pb.HelloRequest.defaultInstance

private class HelloRequest_Impl(
    override val name: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.examples.greeter.pb.HelloRequest, pbandk.gen.GeneratedMessage<pbandk.examples.greeter.pb.HelloRequest>(unknownFields) {
    override val descriptor get() = pbandk.examples.greeter.pb.HelloRequest.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.greeter.pb.MutableHelloRequest.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.examples.greeter.pb.HelloRequest {
        this.name = name
        this.unknownFields += unknownFields
    }
}

private class MutableHelloRequest_Impl(
    override var name: String,
) : pbandk.examples.greeter.pb.MutableHelloRequest, pbandk.gen.MutableGeneratedMessage<pbandk.examples.greeter.pb.HelloRequest>() {
    override val descriptor get() = pbandk.examples.greeter.pb.HelloRequest.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.greeter.pb.MutableHelloRequest.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toHelloRequest() = HelloRequest_Impl(
        name = name,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use HelloReply { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.examples.greeter.pb.HelloReply"],
        expression = "HelloReply {\nthis.message = message\nthis.unknownFields += unknownFields\n}",
    )
)
public fun HelloReply(
    message: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.examples.greeter.pb.HelloReply = pbandk.examples.greeter.pb.HelloReply {
    this.message = message
    this.unknownFields += unknownFields
}

/**
 * The [MutableHelloReply] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildHelloReply")
public fun HelloReply(builderAction: pbandk.examples.greeter.pb.MutableHelloReply.() -> Unit): pbandk.examples.greeter.pb.HelloReply =
    pbandk.examples.greeter.pb.MutableHelloReply_Impl(
        message = "",
    ).also(builderAction).toHelloReply()

@pbandk.Export
@pbandk.JsName("orDefaultForHelloReply")
public fun HelloReply?.orDefault(): pbandk.examples.greeter.pb.HelloReply = this ?: pbandk.examples.greeter.pb.HelloReply.defaultInstance

private class HelloReply_Impl(
    override val message: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.examples.greeter.pb.HelloReply, pbandk.gen.GeneratedMessage<pbandk.examples.greeter.pb.HelloReply>(unknownFields) {
    override val descriptor get() = pbandk.examples.greeter.pb.HelloReply.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.greeter.pb.MutableHelloReply.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.examples.greeter.pb.HelloReply {
        this.message = message
        this.unknownFields += unknownFields
    }
}

private class MutableHelloReply_Impl(
    override var message: String,
) : pbandk.examples.greeter.pb.MutableHelloReply, pbandk.gen.MutableGeneratedMessage<pbandk.examples.greeter.pb.HelloReply>() {
    override val descriptor get() = pbandk.examples.greeter.pb.HelloReply.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.greeter.pb.MutableHelloReply.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        message: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toHelloReply() = HelloReply_Impl(
        message = message,
        unknownFields = unknownFields.toMap()
    )
}

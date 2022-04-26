@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Duration : pbandk.Message {
    public val seconds: Long
    public val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Duration
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration>

    /**
     * The [MutableDuration] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit): pbandk.wkt.Duration

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        seconds: Long = this.seconds,
        nanos: Int = this.nanos,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Duration

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val seconds: pbandk.FieldDescriptor<pbandk.wkt.Duration, Long> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Duration::descriptor,
                name = "seconds",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                jsonName = "seconds",
                value = pbandk.wkt.Duration::seconds,
                mutableValue = pbandk.wkt.MutableDuration::seconds,
            )
        public val nanos: pbandk.FieldDescriptor<pbandk.wkt.Duration, Int> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Duration::descriptor,
                name = "nanos",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                jsonName = "nanos",
                value = pbandk.wkt.Duration::nanos,
                mutableValue = pbandk.wkt.MutableDuration::nanos,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Duration> {
        public val defaultInstance: pbandk.wkt.Duration by lazy { pbandk.wkt.Duration {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Duration",
                messageClass = pbandk.wkt.Duration::class,
                messageCompanion = this,
                builder = ::Duration,
                fields = listOf(
                    pbandk.wkt.Duration.FieldDescriptors.seconds,
                    pbandk.wkt.Duration.FieldDescriptors.nanos,
                ),
            )
        }
    }
}

public sealed interface MutableDuration : pbandk.wkt.Duration, pbandk.MutableMessage<pbandk.wkt.Duration> {
    public override var seconds: Long
    public override var nanos: Int
}

@Deprecated(
    message = "Use Duration { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Duration"],
        expression = "Duration {\nthis.seconds = seconds\nthis.nanos = nanos\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Duration(
    seconds: Long = 0L,
    nanos: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Duration = pbandk.wkt.Duration {
    this.seconds = seconds
    this.nanos = nanos
    this.unknownFields += unknownFields
}

/**
 * The [MutableDuration] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDuration")
public fun Duration(builderAction: pbandk.wkt.MutableDuration.() -> Unit): pbandk.wkt.Duration = pbandk.wkt.MutableDuration_Impl(
    seconds = 0L,
    nanos = 0,
).also(builderAction).toDuration()

@pbandk.Export
@pbandk.JsName("orDefaultForDuration")
public fun Duration?.orDefault(): pbandk.wkt.Duration = this ?: pbandk.wkt.Duration.defaultInstance

private class Duration_Impl(
    override val seconds: Long,
    override val nanos: Int,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Duration, pbandk.gen.GeneratedMessage<pbandk.wkt.Duration>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Duration.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Duration {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields += unknownFields
    }
}

private class MutableDuration_Impl(
    override var seconds: Long,
    override var nanos: Int,
) : pbandk.wkt.MutableDuration, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Duration>() {
    override val descriptor get() = pbandk.wkt.Duration.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toDuration() = Duration_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMap()
    )
}

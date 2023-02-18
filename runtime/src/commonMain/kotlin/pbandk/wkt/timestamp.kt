@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Timestamp : pbandk.Message {
    public val seconds: Long
    public val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Timestamp
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp>

    /**
     * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.Timestamp

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        seconds: Long = this.seconds,
        nanos: Int = this.nanos,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Timestamp

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val seconds: pbandk.FieldDescriptor<pbandk.wkt.Timestamp, Long> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Timestamp::descriptor,
                messageMetadata = pbandk.wkt.Timestamp.messageMetadata,
                name = "seconds",
                number = 1,
                valueType = pbandk.types.int64(),
                jsonName = "seconds",
                value = pbandk.wkt.Timestamp::seconds,
                mutableValue = pbandk.wkt.MutableTimestamp::seconds,
            )
        public val nanos: pbandk.FieldDescriptor<pbandk.wkt.Timestamp, Int> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.wkt.Timestamp::descriptor,
                messageMetadata = pbandk.wkt.Timestamp.messageMetadata,
                name = "nanos",
                number = 2,
                valueType = pbandk.types.int32(),
                jsonName = "nanos",
                value = pbandk.wkt.Timestamp::nanos,
                mutableValue = pbandk.wkt.MutableTimestamp::nanos,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Timestamp> {
        override val defaultInstance: pbandk.wkt.Timestamp by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Timestamp {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Timestamp",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Timestamp::class,
                messageCompanion = this,
                builder = ::Timestamp,
                fields = listOf(
                    pbandk.wkt.Timestamp.FieldDescriptors.seconds,
                    pbandk.wkt.Timestamp.FieldDescriptors.nanos,
                ),
            )
        }
    }
}

public sealed interface MutableTimestamp : pbandk.wkt.Timestamp, pbandk.MutableMessage<pbandk.wkt.Timestamp> {
    public override var seconds: Long
    public override var nanos: Int
}

@Deprecated(
    message = "Use Timestamp { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Timestamp"],
        expression = "Timestamp {\nthis.seconds = seconds\nthis.nanos = nanos\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Timestamp(
    seconds: Long = 0L,
    nanos: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Timestamp = pbandk.wkt.Timestamp {
    this.seconds = seconds
    this.nanos = nanos
    this.unknownFields += unknownFields
}

/**
 * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildTimestamp")
public fun Timestamp(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.Timestamp =
    pbandk.wkt.MutableTimestamp_Impl(
        seconds = 0L,
        nanos = 0,
    ).also(builderAction).toTimestamp()

@pbandk.Export
@pbandk.JsName("orDefaultForTimestamp")
public fun Timestamp?.orDefault(): pbandk.wkt.Timestamp = this ?: pbandk.wkt.Timestamp.defaultInstance

private class Timestamp_Impl(
    override val seconds: Long,
    override val nanos: Int,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Timestamp, pbandk.gen.GeneratedMessage<pbandk.wkt.Timestamp>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Timestamp.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Timestamp {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields += unknownFields
    }
}

private class MutableTimestamp_Impl(
    override var seconds: Long,
    override var nanos: Int,
) : pbandk.wkt.MutableTimestamp, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Timestamp>() {
    override val descriptor get() = pbandk.wkt.Timestamp.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toTimestamp() = Timestamp_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMap()
    )
}

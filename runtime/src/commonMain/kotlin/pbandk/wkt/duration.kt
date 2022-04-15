@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed interface Duration : pbandk.Message {
    public val seconds: Long
    public val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Duration
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableDuration(): pbandk.wkt.MutableDuration

    /**
     * The [MutableDuration] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit): pbandk.wkt.Duration

    @Deprecated("Use copy {} instead")
    public fun copy(
        seconds: Long = this.seconds,
        nanos: Int = this.nanos,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Duration

    public companion object : pbandk.Message.Companion<pbandk.wkt.Duration> {
        public val defaultInstance: pbandk.wkt.Duration by lazy { pbandk.wkt.Duration {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Duration = pbandk.wkt.Duration.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Duration, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seconds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seconds",
                        value = pbandk.wkt.Duration::seconds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nanos",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nanos",
                        value = pbandk.wkt.Duration::nanos
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Duration",
                messageClass = pbandk.wkt.Duration::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableDuration : pbandk.wkt.Duration, pbandk.MutableMessage {
    public override var seconds: Long
    public override var nanos: Int

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toDuration(): pbandk.wkt.Duration

    public override fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit): pbandk.wkt.MutableDuration

    public companion object : pbandk.Message.Companion<pbandk.wkt.Duration> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Duration = pbandk.wkt.Duration.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration> get() = pbandk.wkt.Duration.descriptor
    }
}

@Deprecated("Use Duration { } instead")
public fun Duration(
    seconds: Long = 0L,
    nanos: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Duration = pbandk.wkt.Duration {
    this.seconds = seconds
    this.nanos = nanos
    this.unknownFields += unknownFields
}

public fun MutableDuration(): pbandk.wkt.MutableDuration = pbandk.wkt.MutableDuration_Impl(
    seconds = 0L,
    nanos = 0,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableDuration] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Duration(builderAction: pbandk.wkt.MutableDuration.() -> Unit): pbandk.wkt.Duration =
    pbandk.wkt.MutableDuration().also(builderAction).toDuration()

public fun MutableDuration(builderAction: pbandk.wkt.MutableDuration.() -> Unit): pbandk.wkt.MutableDuration =
    pbandk.wkt.MutableDuration().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForDuration")
public fun Duration?.orDefault(): pbandk.wkt.Duration = this ?: pbandk.wkt.Duration.defaultInstance

private class Duration_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Duration, pbandk.GeneratedMessage<pbandk.wkt.Duration>() {
    override val descriptor get() = pbandk.wkt.Duration.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit) =
        toMutableDuration().apply(builderAction).toDuration()

    @Deprecated("Use copy {} instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Duration {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableDuration() = pbandk.wkt.MutableDuration {
        this.seconds = this@Duration_Impl.seconds
        this.nanos = this@Duration_Impl.nanos
        this.unknownFields += this@Duration_Impl.unknownFields
    }
}

private class MutableDuration_Impl(
    override var seconds: Long,
    override var nanos: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableDuration, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableDuration>() {
    override val descriptor get() = pbandk.wkt.Duration.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableDuration.() -> Unit) =
        toMutableDuration().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Duration {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toDuration() = Duration_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableDuration() = pbandk.wkt.MutableDuration {
        this.seconds = this@MutableDuration_Impl.seconds
        this.nanos = this@MutableDuration_Impl.nanos
        this.unknownFields += this@MutableDuration_Impl.unknownFields
    }
}

private fun Duration.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Duration {
    if (other !is pbandk.wkt.Duration) return this

    return copy {
        seconds = other.seconds
        nanos = other.nanos
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Duration.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Duration {
    var seconds = 0L
    var nanos = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> seconds = _fieldValue as Long
            2 -> nanos = _fieldValue as Int
        }
    }
    return Duration_Impl(seconds, nanos, unknownFields)
}

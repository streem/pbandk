@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Duration : pbandk.Message {
    public val seconds: Long
    public val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Duration
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration>

    public fun copy(
        seconds: Long = this.seconds,
        nanos: Int = this.nanos,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Duration

    public companion object : pbandk.Message.Companion<pbandk.wkt.Duration> {
        @Deprecated("Use duration { } instead")
        public operator fun invoke(
            seconds: Long = 0L,
            nanos: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Duration = Duration_Impl(
            seconds = seconds,
            nanos = nanos,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.Duration by lazy { pbandk.wkt.Duration() }
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

public sealed interface MutableDuration : Duration, pbandk.MutableMessage {
    public override var seconds: Long
    public override var nanos: Int

    public fun toDuration(): Duration

    public companion object : pbandk.Message.Companion<pbandk.wkt.Duration> {
        @Deprecated("Use duration { } instead")
        public operator fun invoke(
            seconds: Long = 0L,
            nanos: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableDuration = MutableDuration_Impl(
            seconds = seconds,
            nanos = nanos,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableDuration by lazy { MutableDuration() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Duration = pbandk.wkt.Duration.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration> get() = pbandk.wkt.Duration.descriptor
    }
}

public fun duration(builderAction: MutableDuration.() -> Unit): Duration {
    val builder = MutableDuration()
    builder.builderAction()
    return builder.toDuration()
}

@pbandk.Export
@pbandk.JsName("orDefaultForDuration")
public fun Duration?.orDefault(): pbandk.wkt.Duration = this ?: Duration.defaultInstance

private class Duration_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Duration, pbandk.GeneratedMessage<Duration>() {
    override val descriptor get() = Duration.descriptor

    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Duration_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Duration)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableDuration_Impl(
    override var seconds: Long,
    override var nanos: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableDuration, pbandk.MutableGeneratedMessage<MutableDuration>() {
    override val descriptor get() = Duration.descriptor

    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Duration_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Duration)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toDuration() = Duration_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Duration.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Duration {
    var seconds = 0L
    var nanos = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> seconds = _fieldValue as Long
            2 -> nanos = _fieldValue as Int
        }
    }
    return Duration(seconds, nanos, unknownFields)
}

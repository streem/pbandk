@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Timestamp : pbandk.Message {
    public val seconds: Long
    public val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Timestamp
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableTimestamp(): MutableTimestamp

    /**
     * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableTimestamp.() -> Unit): Timestamp

    @Deprecated("Use copy {} instead")
    public fun copy(
        seconds: Long = this.seconds,
        nanos: Int = this.nanos,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Timestamp

    public companion object : pbandk.Message.Companion<pbandk.wkt.Timestamp> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.Timestamp by lazy { pbandk.wkt.Timestamp {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Timestamp = pbandk.wkt.Timestamp.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Timestamp, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seconds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seconds",
                        value = pbandk.wkt.Timestamp::seconds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nanos",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nanos",
                        value = pbandk.wkt.Timestamp::nanos
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Timestamp",
                messageClass = pbandk.wkt.Timestamp::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableTimestamp : Timestamp, pbandk.MutableMessage {
    public override var seconds: Long
    public override var nanos: Int

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toTimestamp(): Timestamp

    public override fun copy(builderAction: MutableTimestamp.() -> Unit): MutableTimestamp

    public companion object : pbandk.Message.Companion<pbandk.wkt.Timestamp> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Timestamp = pbandk.wkt.Timestamp.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp> get() = pbandk.wkt.Timestamp.descriptor
    }
}

@Deprecated("Use Timestamp { } instead")
public fun Timestamp(
    seconds: Long = 0L,
    nanos: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Timestamp = Timestamp {
    this.seconds = seconds
    this.nanos = nanos
    this.unknownFields.putAll(unknownFields)
}

public fun MutableTimestamp(): MutableTimestamp = MutableTimestamp_Impl(
    seconds = 0L,
    nanos = 0,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Timestamp(builderAction: MutableTimestamp.() -> Unit): Timestamp =
    MutableTimestamp().also(builderAction).toTimestamp()

public fun MutableTimestamp(builderAction: MutableTimestamp.() -> Unit): MutableTimestamp =
    MutableTimestamp().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTimestamp")
public fun Timestamp?.orDefault(): pbandk.wkt.Timestamp = this ?: Timestamp.defaultInstance

private class Timestamp_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Timestamp, pbandk.GeneratedMessage<Timestamp>() {
    override val descriptor get() = Timestamp.descriptor

    override fun copy(builderAction: MutableTimestamp.() -> Unit) =
        toMutableTimestamp().apply(builderAction).toTimestamp()

    @Deprecated("Use copy {} instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields.putAll(unknownFields)
    }

    override operator fun plus(other: pbandk.Message?) = (other as? Timestamp)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableTimestamp() = MutableTimestamp_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableTimestamp_Impl(
    override var seconds: Long,
    override var nanos: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableTimestamp, pbandk.MutableGeneratedMessage<MutableTimestamp>() {
    override val descriptor get() = Timestamp.descriptor

    override fun copy(builderAction: MutableTimestamp.() -> Unit) =
        toMutableTimestamp().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields.putAll(unknownFields)
    }.toTimestamp()

    override operator fun plus(other: pbandk.Message?) = (other as? Timestamp)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toTimestamp() = Timestamp_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableTimestamp() = MutableTimestamp_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMutableMap()
    )
}

@Suppress("UNCHECKED_CAST")
private fun Timestamp.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Timestamp {
    var seconds = 0L
    var nanos = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> seconds = _fieldValue as Long
            2 -> nanos = _fieldValue as Int
        }
    }
    return Timestamp_Impl(seconds, nanos, unknownFields)
}

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
    public fun toMutableTimestamp(): pbandk.wkt.MutableTimestamp

    /**
     * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.Timestamp

    @Deprecated("Use copy {} instead")
    public fun copy(
        seconds: Long = this.seconds,
        nanos: Int = this.nanos,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Timestamp

    public companion object : pbandk.Message.Companion<pbandk.wkt.Timestamp> {
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

public sealed interface MutableTimestamp : pbandk.wkt.Timestamp, pbandk.MutableMessage {
    public override var seconds: Long
    public override var nanos: Int

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toTimestamp(): pbandk.wkt.Timestamp

    public override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.MutableTimestamp

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
): pbandk.wkt.Timestamp = pbandk.wkt.Timestamp {
    this.seconds = seconds
    this.nanos = nanos
    this.unknownFields += unknownFields
}

public fun MutableTimestamp(): pbandk.wkt.MutableTimestamp = pbandk.wkt.MutableTimestamp_Impl(
    seconds = 0L,
    nanos = 0,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Timestamp(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.Timestamp =
    pbandk.wkt.MutableTimestamp().also(builderAction).toTimestamp()

public fun MutableTimestamp(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.MutableTimestamp =
    pbandk.wkt.MutableTimestamp().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForTimestamp")
public fun Timestamp?.orDefault(): pbandk.wkt.Timestamp = this ?: pbandk.wkt.Timestamp.defaultInstance

private class Timestamp_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Timestamp, pbandk.GeneratedMessage<pbandk.wkt.Timestamp>() {
    override val descriptor get() = pbandk.wkt.Timestamp.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit) =
        toMutableTimestamp().apply(builderAction).toTimestamp()

    @Deprecated("Use copy {} instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Timestamp)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableTimestamp() = pbandk.wkt.MutableTimestamp {
        this.seconds = this@Timestamp_Impl.seconds
        this.nanos = this@Timestamp_Impl.nanos
        this.unknownFields += this@Timestamp_Impl.unknownFields
    }
}

private class MutableTimestamp_Impl(
    override var seconds: Long,
    override var nanos: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableTimestamp, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableTimestamp>() {
    override val descriptor get() = pbandk.wkt.Timestamp.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit) =
        toMutableTimestamp().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.seconds = seconds
        this.nanos = nanos
        this.unknownFields += unknownFields
    }.toTimestamp()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Timestamp)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toTimestamp() = Timestamp_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableTimestamp() = pbandk.wkt.MutableTimestamp {
        this.seconds = this@MutableTimestamp_Impl.seconds
        this.nanos = this@MutableTimestamp_Impl.nanos
        this.unknownFields += this@MutableTimestamp_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Timestamp.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Timestamp {
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

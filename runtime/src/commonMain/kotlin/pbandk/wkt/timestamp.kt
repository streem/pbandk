@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
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

@pbandk.Export
public sealed interface MutableTimestamp : pbandk.wkt.Timestamp, pbandk.MutableMessage {
    public override var seconds: Long
    public override var nanos: Int
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

/**
 * The [MutableTimestamp] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Timestamp(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit): pbandk.wkt.Timestamp = pbandk.wkt.MutableTimestamp_Impl(
    seconds = 0L,
    nanos = 0,
    unknownFields = mutableMapOf()
).also(builderAction).toTimestamp()

@pbandk.Export
@pbandk.JsName("orDefaultForTimestamp")
public fun Timestamp?.orDefault(): pbandk.wkt.Timestamp = this ?: pbandk.wkt.Timestamp.defaultInstance

private class Timestamp_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Timestamp, pbandk.GeneratedMessage<pbandk.wkt.Timestamp>() {
    override val descriptor get() = pbandk.wkt.Timestamp.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit) = pbandk.wkt.Timestamp {
        this.seconds = this@Timestamp_Impl.seconds
        this.nanos = this@Timestamp_Impl.nanos
        this.unknownFields += this@Timestamp_Impl.unknownFields
        this.builderAction()
    }

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

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableTimestamp_Impl(
    override var seconds: Long,
    override var nanos: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableTimestamp, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableTimestamp>() {
    override val descriptor get() = pbandk.wkt.Timestamp.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableTimestamp.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        seconds: Long,
        nanos: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toTimestamp() = Timestamp_Impl(
        seconds = seconds,
        nanos = nanos,
        unknownFields = unknownFields.toMap()
    )
}

private fun Timestamp.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Timestamp {
    if (other !is pbandk.wkt.Timestamp) return this

    return copy {
        seconds = other.seconds
        nanos = other.nanos
        unknownFields += other.unknownFields
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

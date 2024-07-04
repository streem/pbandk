@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class Timestamp(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Timestamp = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Timestamp> {
        public val defaultInstance: pbandk.wkt.Timestamp by lazy { pbandk.wkt.Timestamp() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Timestamp = pbandk.wkt.Timestamp.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.Timestamp",
            messageClass = pbandk.wkt.Timestamp::class,
            messageCompanion = this,
            fields = buildList(2) {
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
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForTimestamp")
public fun Timestamp?.orDefault(): pbandk.wkt.Timestamp = this ?: Timestamp.defaultInstance

private fun Timestamp.protoMergeImpl(plus: pbandk.Message?): Timestamp = (plus as? Timestamp)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

    return Timestamp(seconds, nanos, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class Timestamp(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Timestamp = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Timestamp> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Timestamp> {
        public val defaultInstance: com.google.protobuf.Timestamp by lazy { com.google.protobuf.Timestamp() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Timestamp = com.google.protobuf.Timestamp.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Timestamp> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Timestamp, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seconds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seconds",
                        value = com.google.protobuf.Timestamp::seconds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nanos",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nanos",
                        value = com.google.protobuf.Timestamp::nanos
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Timestamp",
                messageClass = com.google.protobuf.Timestamp::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForTimestamp")
public fun Timestamp?.orDefault(): com.google.protobuf.Timestamp = this ?: Timestamp.defaultInstance

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

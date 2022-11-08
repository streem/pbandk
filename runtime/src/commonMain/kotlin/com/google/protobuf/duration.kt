@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class Duration(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Duration = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Duration> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Duration> {
        public val defaultInstance: com.google.protobuf.Duration by lazy { com.google.protobuf.Duration() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Duration = com.google.protobuf.Duration.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Duration> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Duration, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seconds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seconds",
                        value = com.google.protobuf.Duration::seconds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nanos",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nanos",
                        value = com.google.protobuf.Duration::nanos
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Duration",
                messageClass = com.google.protobuf.Duration::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForDuration")
public fun Duration?.orDefault(): com.google.protobuf.Duration = this ?: Duration.defaultInstance

private fun Duration.protoMergeImpl(plus: pbandk.Message?): Duration = (plus as? Duration)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

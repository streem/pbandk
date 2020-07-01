@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class Duration(
    val seconds: Long = 0L,
    val nanos: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val fieldDescriptors get() = Companion.fieldDescriptors
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Duration> {
        val defaultInstance by lazy { Duration() }
        override fun unmarshal(u: pbandk.MessageUnmarshaller) = Duration.unmarshalImpl(u)

        override val fieldDescriptors: List<pbandk.FieldDescriptor<*>> by lazy {
            listOf(
                pbandk.FieldDescriptor(
                    name = "seconds",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                    jsonName = "seconds",
                    value = Duration::seconds
                ),
                pbandk.FieldDescriptor(
                    name = "nanos",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                    jsonName = "nanos",
                    value = Duration::nanos
                )
            )
        }
    }
}

fun Duration?.orDefault() = this ?: Duration.defaultInstance

private fun Duration.protoMergeImpl(plus: pbandk.Message?): Duration = (plus as? Duration)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Duration.Companion.unmarshalImpl(u: pbandk.MessageUnmarshaller): Duration {
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

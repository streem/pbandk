@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public sealed interface Value : pbandk.Message {
    public val value: Value<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value>

    /**
     * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableValue.() -> Unit): pbandk.testpb.Value

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: pbandk.testpb.Value.Value<*>? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Value

    public val stringValue: String?
    public val booleanValue: Boolean?
    public val integerValue: Int?

    public sealed class Value<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class StringValue(stringValue: String = "") : Value<String>(stringValue)
        public class BooleanValue(booleanValue: Boolean = false) : Value<Boolean>(booleanValue)
        public class IntegerValue(integerValue: Int = 0) : Value<Int>(integerValue)
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Value> {
        public val defaultInstance: pbandk.testpb.Value by lazy { pbandk.testpb.Value {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Value = pbandk.testpb.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Value, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "stringValue",
                        value = pbandk.testpb.Value::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "boolean_value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "booleanValue",
                        value = pbandk.testpb.Value::booleanValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "integer_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "integerValue",
                        value = pbandk.testpb.Value::integerValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "testpb.Value",
                messageClass = pbandk.testpb.Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableValue : pbandk.testpb.Value, pbandk.MutableMessage {
    public override var value: Value.Value<*>?

    public override var stringValue: String?
    public override var booleanValue: Boolean?
    public override var integerValue: Int?
}

@Deprecated("Use Value { } instead")
public fun Value(
    value: pbandk.testpb.Value.Value<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.Value = pbandk.testpb.Value {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
public fun Value(builderAction: pbandk.testpb.MutableValue.() -> Unit): pbandk.testpb.Value = pbandk.testpb.MutableValue_Impl(
    value = null,
    unknownFields = mutableMapOf()
).also(builderAction).toValue()

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): pbandk.testpb.Value = this ?: pbandk.testpb.Value.defaultInstance

private class Value_Impl(
    override val value: pbandk.testpb.Value.Value<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Value, pbandk.GeneratedMessage<pbandk.testpb.Value>() {
    override val descriptor get() = pbandk.testpb.Value.descriptor

    override val stringValue: String?
        get() = (value as? pbandk.testpb.Value.Value.StringValue)?.value
    override val booleanValue: Boolean?
        get() = (value as? pbandk.testpb.Value.Value.BooleanValue)?.value
    override val integerValue: Int?
        get() = (value as? pbandk.testpb.Value.Value.IntegerValue)?.value

    override fun copy(builderAction: pbandk.testpb.MutableValue.() -> Unit) = pbandk.testpb.Value {
        this.value = this@Value_Impl.value
        this.unknownFields += this@Value_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.Value.Value<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Value {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableValue_Impl(
    override var value: pbandk.testpb.Value.Value<*>?,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableValue, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableValue>() {
    override val descriptor get() = pbandk.testpb.Value.descriptor

    override var stringValue: String?
        get() = (value as? pbandk.testpb.Value.Value.StringValue)?.value
        set(value) { this.value = value?.let { pbandk.testpb.Value.Value.StringValue(it) } }
    override var booleanValue: Boolean?
        get() = (value as? pbandk.testpb.Value.Value.BooleanValue)?.value
        set(value) { this.value = value?.let { pbandk.testpb.Value.Value.BooleanValue(it) } }
    override var integerValue: Int?
        get() = (value as? pbandk.testpb.Value.Value.IntegerValue)?.value
        set(value) { this.value = value?.let { pbandk.testpb.Value.Value.IntegerValue(it) } }

    override fun copy(builderAction: pbandk.testpb.MutableValue.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.Value.Value<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toValue() = Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun Value.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.Value {
    if (other !is pbandk.testpb.Value) return this

    return copy {
        when (other.value) {
            is Value.Value.StringValue -> stringValue = other.stringValue
            is Value.Value.BooleanValue -> booleanValue = other.booleanValue
            is Value.Value.IntegerValue -> integerValue = other.integerValue
            null -> {}
        }
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.Value {
    var value: Value.Value<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = Value.Value.StringValue(_fieldValue as String)
            2 -> value = Value.Value.BooleanValue(_fieldValue as Boolean)
            3 -> value = Value.Value.IntegerValue(_fieldValue as Int)
        }
    }
    return Value_Impl(value, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface Value : pbandk.Message {
    public val value: Value<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value>

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
        @Deprecated("Use value { } instead")
        public operator fun invoke(
            value: Value<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Value = Value_Impl(
            value = value,
            unknownFields = unknownFields
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.Value by lazy { pbandk.testpb.Value() }
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

public sealed interface MutableValue : Value, pbandk.MutableMessage {
    public override var value: Value.Value<*>?

    public override var stringValue: String?
    public override var booleanValue: Boolean?
    public override var integerValue: Int?

    public fun toValue(): Value

    public companion object : pbandk.Message.Companion<pbandk.testpb.Value> {
        @Deprecated("Use value { } instead")
        public operator fun invoke(
            value: pbandk.testpb.Value.Value<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableValue = MutableValue_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableValue by lazy { MutableValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.Value = pbandk.testpb.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value> get() = pbandk.testpb.Value.descriptor
    }
}

public fun value(builderAction: MutableValue.() -> Unit): Value {
    @Suppress("DEPRECATION") val builder = MutableValue()
    builder.builderAction()
    return builder.toValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): pbandk.testpb.Value = this ?: Value.defaultInstance

private class Value_Impl(
    override val value: pbandk.testpb.Value.Value<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Value, pbandk.GeneratedMessage<Value>() {
    override val descriptor get() = Value.descriptor

    override val stringValue: String?
        get() = (value as? pbandk.testpb.Value.Value.StringValue)?.value
    override val booleanValue: Boolean?
        get() = (value as? pbandk.testpb.Value.Value.BooleanValue)?.value
    override val integerValue: Int?
        get() = (value as? pbandk.testpb.Value.Value.IntegerValue)?.value

    override fun copy(
        value: pbandk.testpb.Value.Value<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Value)?.let {
        it.copy(
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableValue_Impl(
    override var value: pbandk.testpb.Value.Value<*>?,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableValue, pbandk.MutableGeneratedMessage<MutableValue>() {
    override val descriptor get() = Value.descriptor

    override var stringValue: String?
        get() = (value as? pbandk.testpb.Value.Value.StringValue)?.value
        set(value) { value = value?.let { pbandk.testpb.Value.Value.StringValue(it) } }
    override var booleanValue: Boolean?
        get() = (value as? pbandk.testpb.Value.Value.BooleanValue)?.value
        set(value) { value = value?.let { pbandk.testpb.Value.Value.BooleanValue(it) } }
    override var integerValue: Int?
        get() = (value as? pbandk.testpb.Value.Value.IntegerValue)?.value
        set(value) { value = value?.let { pbandk.testpb.Value.Value.IntegerValue(it) } }

    override fun copy(
        value: pbandk.testpb.Value.Value<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Value)?.let {
        it.copy(
            value = other.value ?: value,
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toValue() = Value_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Value {
    var value: Value.Value<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = Value.Value.StringValue(_fieldValue as String)
            2 -> value = Value.Value.BooleanValue(_fieldValue as Boolean)
            3 -> value = Value.Value.IntegerValue(_fieldValue as Int)
        }
    }
    @Suppress("DEPRECATION")
    return Value(value, unknownFields)
}

@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface Value : pbandk.Message {
    public val value: Value<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value>

    /**
     * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableValue.() -> Unit): pbandk.testpb.Value

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: pbandk.testpb.Value.Value<*>? = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.Value

    public val stringValue: String?
    public val booleanValue: Boolean?
    public val integerValue: Int?

    public sealed interface Value<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class StringValue(stringValue: String = "") :
            Value<String>, pbandk.gen.GeneratedOneOf<pbandk.testpb.Value, String>(stringValue, pbandk.testpb.Value.FieldDescriptors.stringValue)
        public class BooleanValue(booleanValue: Boolean = false) :
            Value<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.testpb.Value, Boolean>(booleanValue, pbandk.testpb.Value.FieldDescriptors.booleanValue)
        public class IntegerValue(integerValue: Int = 0) :
            Value<Int>, pbandk.gen.GeneratedOneOf<pbandk.testpb.Value, Int>(integerValue, pbandk.testpb.Value.FieldDescriptors.integerValue)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val stringValue: pbandk.FieldDescriptor<pbandk.testpb.Value, String?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.Value::descriptor,
                messageMetadata = pbandk.testpb.Value.messageMetadata,
                name = "string_value",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "stringValue",
                value = pbandk.testpb.Value::stringValue,
                mutableValue = pbandk.testpb.MutableValue::stringValue,
            )
        public val booleanValue: pbandk.FieldDescriptor<pbandk.testpb.Value, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.Value::descriptor,
                messageMetadata = pbandk.testpb.Value.messageMetadata,
                name = "boolean_value",
                number = 2,
                valueType = pbandk.types.bool(),
                jsonName = "booleanValue",
                value = pbandk.testpb.Value::booleanValue,
                mutableValue = pbandk.testpb.MutableValue::booleanValue,
            )
        public val integerValue: pbandk.FieldDescriptor<pbandk.testpb.Value, Int?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.testpb.Value::descriptor,
                messageMetadata = pbandk.testpb.Value.messageMetadata,
                name = "integer_value",
                number = 3,
                valueType = pbandk.types.int32(),
                jsonName = "integerValue",
                value = pbandk.testpb.Value::integerValue,
                mutableValue = pbandk.testpb.MutableValue::integerValue,
            )

        public val value: pbandk.OneofDescriptor<pbandk.testpb.Value, pbandk.testpb.Value.Value<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.testpb.Value::descriptor,
                name = "value",
                value = pbandk.testpb.Value::value,
                mutableValue = pbandk.testpb.MutableValue::value,
                fields = listOf(
                    stringValue,
                    booleanValue,
                    integerValue,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.Value> {
        override val defaultInstance: pbandk.testpb.Value by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.Value {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "testpb.Value",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.Value::class,
                messageCompanion = this,
                builder = ::Value,
                oneofs = listOf(
                    pbandk.testpb.Value.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableValue : pbandk.testpb.Value, pbandk.MutableMessage<pbandk.testpb.Value> {
    public override var value: Value.Value<*>?

    public override var stringValue: String?
    public override var booleanValue: Boolean?
    public override var integerValue: Int?
}

@Deprecated(
    message = "Use Value { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.Value"],
        expression = "Value {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
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
@pbandk.JsName("buildValue")
public fun Value(builderAction: pbandk.testpb.MutableValue.() -> Unit): pbandk.testpb.Value =
    pbandk.testpb.MutableValue_Impl(
        value = null,
    ).also(builderAction).toValue()

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): pbandk.testpb.Value = this ?: pbandk.testpb.Value.defaultInstance

private class Value_Impl(
    override val value: pbandk.testpb.Value.Value<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.Value, pbandk.gen.GeneratedMessage<pbandk.testpb.Value>(unknownFields) {
    override val descriptor get() = pbandk.testpb.Value.descriptor

    override val stringValue: String?
        get() = (value as? pbandk.testpb.Value.Value.StringValue)?.value
    override val booleanValue: Boolean?
        get() = (value as? pbandk.testpb.Value.Value.BooleanValue)?.value
    override val integerValue: Int?
        get() = (value as? pbandk.testpb.Value.Value.IntegerValue)?.value

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.Value.Value<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.Value {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableValue_Impl(
    override var value: pbandk.testpb.Value.Value<*>?,
) : pbandk.testpb.MutableValue, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.Value>() {
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

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.testpb.Value.Value<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toValue() = Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

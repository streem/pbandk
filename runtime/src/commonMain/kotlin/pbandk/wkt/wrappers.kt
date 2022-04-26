@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface DoubleValue : pbandk.Message {
    public val value: Double

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DoubleValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue>

    /**
     * The [MutableDoubleValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit): pbandk.wkt.DoubleValue

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Double = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.DoubleValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.DoubleValue, Double> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.DoubleValue::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                jsonName = "value",
                value = pbandk.wkt.DoubleValue::value,
                mutableValue = pbandk.wkt.MutableDoubleValue::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.DoubleValue> {
        public val defaultInstance: pbandk.wkt.DoubleValue by lazy { pbandk.wkt.DoubleValue {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.DoubleValue",
                messageClass = pbandk.wkt.DoubleValue::class,
                messageCompanion = this,
                builder = ::DoubleValue,
                fields = listOf(
                    pbandk.wkt.DoubleValue.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableDoubleValue : pbandk.wkt.DoubleValue, pbandk.MutableMessage<pbandk.wkt.DoubleValue> {
    public override var value: Double
}

public sealed interface FloatValue : pbandk.Message {
    public val value: Float

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FloatValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue>

    /**
     * The [MutableFloatValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit): pbandk.wkt.FloatValue

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Float = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FloatValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.FloatValue, Float> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.FloatValue::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                jsonName = "value",
                value = pbandk.wkt.FloatValue::value,
                mutableValue = pbandk.wkt.MutableFloatValue::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.FloatValue> {
        public val defaultInstance: pbandk.wkt.FloatValue by lazy { pbandk.wkt.FloatValue {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.FloatValue",
                messageClass = pbandk.wkt.FloatValue::class,
                messageCompanion = this,
                builder = ::FloatValue,
                fields = listOf(
                    pbandk.wkt.FloatValue.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableFloatValue : pbandk.wkt.FloatValue, pbandk.MutableMessage<pbandk.wkt.FloatValue> {
    public override var value: Float
}

public sealed interface Int64Value : pbandk.Message {
    public val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value>

    /**
     * The [MutableInt64Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit): pbandk.wkt.Int64Value

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Long = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Int64Value

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.Int64Value, Long> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Int64Value::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                jsonName = "value",
                value = pbandk.wkt.Int64Value::value,
                mutableValue = pbandk.wkt.MutableInt64Value::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int64Value> {
        public val defaultInstance: pbandk.wkt.Int64Value by lazy { pbandk.wkt.Int64Value {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Int64Value",
                messageClass = pbandk.wkt.Int64Value::class,
                messageCompanion = this,
                builder = ::Int64Value,
                fields = listOf(
                    pbandk.wkt.Int64Value.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableInt64Value : pbandk.wkt.Int64Value, pbandk.MutableMessage<pbandk.wkt.Int64Value> {
    public override var value: Long
}

public sealed interface UInt64Value : pbandk.Message {
    public val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value>

    /**
     * The [MutableUInt64Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit): pbandk.wkt.UInt64Value

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Long = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UInt64Value

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.UInt64Value, Long> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.UInt64Value::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                jsonName = "value",
                value = pbandk.wkt.UInt64Value::value,
                mutableValue = pbandk.wkt.MutableUInt64Value::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt64Value> {
        public val defaultInstance: pbandk.wkt.UInt64Value by lazy { pbandk.wkt.UInt64Value {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.UInt64Value",
                messageClass = pbandk.wkt.UInt64Value::class,
                messageCompanion = this,
                builder = ::UInt64Value,
                fields = listOf(
                    pbandk.wkt.UInt64Value.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableUInt64Value : pbandk.wkt.UInt64Value, pbandk.MutableMessage<pbandk.wkt.UInt64Value> {
    public override var value: Long
}

public sealed interface Int32Value : pbandk.Message {
    public val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value>

    /**
     * The [MutableInt32Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit): pbandk.wkt.Int32Value

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Int = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Int32Value

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.Int32Value, Int> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.Int32Value::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                jsonName = "value",
                value = pbandk.wkt.Int32Value::value,
                mutableValue = pbandk.wkt.MutableInt32Value::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int32Value> {
        public val defaultInstance: pbandk.wkt.Int32Value by lazy { pbandk.wkt.Int32Value {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Int32Value",
                messageClass = pbandk.wkt.Int32Value::class,
                messageCompanion = this,
                builder = ::Int32Value,
                fields = listOf(
                    pbandk.wkt.Int32Value.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableInt32Value : pbandk.wkt.Int32Value, pbandk.MutableMessage<pbandk.wkt.Int32Value> {
    public override var value: Int
}

public sealed interface UInt32Value : pbandk.Message {
    public val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value>

    /**
     * The [MutableUInt32Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit): pbandk.wkt.UInt32Value

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Int = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UInt32Value

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.UInt32Value, Int> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.UInt32Value::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                jsonName = "value",
                value = pbandk.wkt.UInt32Value::value,
                mutableValue = pbandk.wkt.MutableUInt32Value::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt32Value> {
        public val defaultInstance: pbandk.wkt.UInt32Value by lazy { pbandk.wkt.UInt32Value {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.UInt32Value",
                messageClass = pbandk.wkt.UInt32Value::class,
                messageCompanion = this,
                builder = ::UInt32Value,
                fields = listOf(
                    pbandk.wkt.UInt32Value.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableUInt32Value : pbandk.wkt.UInt32Value, pbandk.MutableMessage<pbandk.wkt.UInt32Value> {
    public override var value: Int
}

public sealed interface BoolValue : pbandk.Message {
    public val value: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BoolValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue>

    /**
     * The [MutableBoolValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit): pbandk.wkt.BoolValue

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: Boolean = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.BoolValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.BoolValue, Boolean> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.BoolValue::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                jsonName = "value",
                value = pbandk.wkt.BoolValue::value,
                mutableValue = pbandk.wkt.MutableBoolValue::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.BoolValue> {
        public val defaultInstance: pbandk.wkt.BoolValue by lazy { pbandk.wkt.BoolValue {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.BoolValue",
                messageClass = pbandk.wkt.BoolValue::class,
                messageCompanion = this,
                builder = ::BoolValue,
                fields = listOf(
                    pbandk.wkt.BoolValue.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableBoolValue : pbandk.wkt.BoolValue, pbandk.MutableMessage<pbandk.wkt.BoolValue> {
    public override var value: Boolean
}

public sealed interface StringValue : pbandk.Message {
    public val value: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.StringValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue>

    /**
     * The [MutableStringValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableStringValue.() -> Unit): pbandk.wkt.StringValue

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: String = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.StringValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.StringValue, String> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.StringValue::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "value",
                value = pbandk.wkt.StringValue::value,
                mutableValue = pbandk.wkt.MutableStringValue::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.StringValue> {
        public val defaultInstance: pbandk.wkt.StringValue by lazy { pbandk.wkt.StringValue {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.StringValue",
                messageClass = pbandk.wkt.StringValue::class,
                messageCompanion = this,
                builder = ::StringValue,
                fields = listOf(
                    pbandk.wkt.StringValue.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableStringValue : pbandk.wkt.StringValue, pbandk.MutableMessage<pbandk.wkt.StringValue> {
    public override var value: String
}

public sealed interface BytesValue : pbandk.Message {
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BytesValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue>

    /**
     * The [MutableBytesValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit): pbandk.wkt.BytesValue

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.BytesValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val value: pbandk.FieldDescriptor<pbandk.wkt.BytesValue, pbandk.ByteArr> = 
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.wkt.BytesValue::descriptor,
                name = "value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                jsonName = "value",
                value = pbandk.wkt.BytesValue::value,
                mutableValue = pbandk.wkt.MutableBytesValue::value,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.BytesValue> {
        public val defaultInstance: pbandk.wkt.BytesValue by lazy { pbandk.wkt.BytesValue {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.BytesValue",
                messageClass = pbandk.wkt.BytesValue::class,
                messageCompanion = this,
                builder = ::BytesValue,
                fields = listOf(
                    pbandk.wkt.BytesValue.FieldDescriptors.value,
                ),
            )
        }
    }
}

public sealed interface MutableBytesValue : pbandk.wkt.BytesValue, pbandk.MutableMessage<pbandk.wkt.BytesValue> {
    public override var value: pbandk.ByteArr
}

@Deprecated(
    message = "Use DoubleValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.DoubleValue"],
        expression = "DoubleValue {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun DoubleValue(
    value: Double = 0.0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.DoubleValue = pbandk.wkt.DoubleValue {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableDoubleValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildDoubleValue")
public fun DoubleValue(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit): pbandk.wkt.DoubleValue = pbandk.wkt.MutableDoubleValue_Impl(
    value = 0.0,
).also(builderAction).toDoubleValue()

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleValue")
public fun DoubleValue?.orDefault(): pbandk.wkt.DoubleValue = this ?: pbandk.wkt.DoubleValue.defaultInstance

private class DoubleValue_Impl(
    override val value: Double,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DoubleValue, pbandk.gen.GeneratedMessage<pbandk.wkt.DoubleValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.DoubleValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.DoubleValue {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableDoubleValue_Impl(
    override var value: Double,
) : pbandk.wkt.MutableDoubleValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.DoubleValue>() {
    override val descriptor get() = pbandk.wkt.DoubleValue.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toDoubleValue() = DoubleValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use FloatValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.FloatValue"],
        expression = "FloatValue {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun FloatValue(
    value: Float = 0.0F,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.FloatValue = pbandk.wkt.FloatValue {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableFloatValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildFloatValue")
public fun FloatValue(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit): pbandk.wkt.FloatValue = pbandk.wkt.MutableFloatValue_Impl(
    value = 0.0F,
).also(builderAction).toFloatValue()

@pbandk.Export
@pbandk.JsName("orDefaultForFloatValue")
public fun FloatValue?.orDefault(): pbandk.wkt.FloatValue = this ?: pbandk.wkt.FloatValue.defaultInstance

private class FloatValue_Impl(
    override val value: Float,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FloatValue, pbandk.gen.GeneratedMessage<pbandk.wkt.FloatValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.FloatValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FloatValue {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableFloatValue_Impl(
    override var value: Float,
) : pbandk.wkt.MutableFloatValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.FloatValue>() {
    override val descriptor get() = pbandk.wkt.FloatValue.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toFloatValue() = FloatValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Int64Value { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Int64Value"],
        expression = "Int64Value {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Int64Value(
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Int64Value = pbandk.wkt.Int64Value {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableInt64Value] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildInt64Value")
public fun Int64Value(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit): pbandk.wkt.Int64Value = pbandk.wkt.MutableInt64Value_Impl(
    value = 0L,
).also(builderAction).toInt64Value()

@pbandk.Export
@pbandk.JsName("orDefaultForInt64Value")
public fun Int64Value?.orDefault(): pbandk.wkt.Int64Value = this ?: pbandk.wkt.Int64Value.defaultInstance

private class Int64Value_Impl(
    override val value: Long,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Int64Value, pbandk.gen.GeneratedMessage<pbandk.wkt.Int64Value>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Int64Value.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Int64Value {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableInt64Value_Impl(
    override var value: Long,
) : pbandk.wkt.MutableInt64Value, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Int64Value>() {
    override val descriptor get() = pbandk.wkt.Int64Value.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toInt64Value() = Int64Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use UInt64Value { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.UInt64Value"],
        expression = "UInt64Value {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun UInt64Value(
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.UInt64Value = pbandk.wkt.UInt64Value {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableUInt64Value] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUInt64Value")
public fun UInt64Value(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit): pbandk.wkt.UInt64Value = pbandk.wkt.MutableUInt64Value_Impl(
    value = 0L,
).also(builderAction).toUInt64Value()

@pbandk.Export
@pbandk.JsName("orDefaultForUInt64Value")
public fun UInt64Value?.orDefault(): pbandk.wkt.UInt64Value = this ?: pbandk.wkt.UInt64Value.defaultInstance

private class UInt64Value_Impl(
    override val value: Long,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UInt64Value, pbandk.gen.GeneratedMessage<pbandk.wkt.UInt64Value>(unknownFields) {
    override val descriptor get() = pbandk.wkt.UInt64Value.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.UInt64Value {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableUInt64Value_Impl(
    override var value: Long,
) : pbandk.wkt.MutableUInt64Value, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.UInt64Value>() {
    override val descriptor get() = pbandk.wkt.UInt64Value.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toUInt64Value() = UInt64Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Int32Value { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Int32Value"],
        expression = "Int32Value {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Int32Value(
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Int32Value = pbandk.wkt.Int32Value {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableInt32Value] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildInt32Value")
public fun Int32Value(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit): pbandk.wkt.Int32Value = pbandk.wkt.MutableInt32Value_Impl(
    value = 0,
).also(builderAction).toInt32Value()

@pbandk.Export
@pbandk.JsName("orDefaultForInt32Value")
public fun Int32Value?.orDefault(): pbandk.wkt.Int32Value = this ?: pbandk.wkt.Int32Value.defaultInstance

private class Int32Value_Impl(
    override val value: Int,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Int32Value, pbandk.gen.GeneratedMessage<pbandk.wkt.Int32Value>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Int32Value.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Int32Value {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableInt32Value_Impl(
    override var value: Int,
) : pbandk.wkt.MutableInt32Value, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Int32Value>() {
    override val descriptor get() = pbandk.wkt.Int32Value.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toInt32Value() = Int32Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use UInt32Value { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.UInt32Value"],
        expression = "UInt32Value {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun UInt32Value(
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.UInt32Value = pbandk.wkt.UInt32Value {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableUInt32Value] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildUInt32Value")
public fun UInt32Value(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit): pbandk.wkt.UInt32Value = pbandk.wkt.MutableUInt32Value_Impl(
    value = 0,
).also(builderAction).toUInt32Value()

@pbandk.Export
@pbandk.JsName("orDefaultForUInt32Value")
public fun UInt32Value?.orDefault(): pbandk.wkt.UInt32Value = this ?: pbandk.wkt.UInt32Value.defaultInstance

private class UInt32Value_Impl(
    override val value: Int,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UInt32Value, pbandk.gen.GeneratedMessage<pbandk.wkt.UInt32Value>(unknownFields) {
    override val descriptor get() = pbandk.wkt.UInt32Value.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.UInt32Value {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableUInt32Value_Impl(
    override var value: Int,
) : pbandk.wkt.MutableUInt32Value, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.UInt32Value>() {
    override val descriptor get() = pbandk.wkt.UInt32Value.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toUInt32Value() = UInt32Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use BoolValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.BoolValue"],
        expression = "BoolValue {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun BoolValue(
    value: Boolean = false,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.BoolValue = pbandk.wkt.BoolValue {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableBoolValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildBoolValue")
public fun BoolValue(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit): pbandk.wkt.BoolValue = pbandk.wkt.MutableBoolValue_Impl(
    value = false,
).also(builderAction).toBoolValue()

@pbandk.Export
@pbandk.JsName("orDefaultForBoolValue")
public fun BoolValue?.orDefault(): pbandk.wkt.BoolValue = this ?: pbandk.wkt.BoolValue.defaultInstance

private class BoolValue_Impl(
    override val value: Boolean,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.BoolValue, pbandk.gen.GeneratedMessage<pbandk.wkt.BoolValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.BoolValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.BoolValue {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableBoolValue_Impl(
    override var value: Boolean,
) : pbandk.wkt.MutableBoolValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.BoolValue>() {
    override val descriptor get() = pbandk.wkt.BoolValue.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toBoolValue() = BoolValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use StringValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.StringValue"],
        expression = "StringValue {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun StringValue(
    value: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.StringValue = pbandk.wkt.StringValue {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableStringValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildStringValue")
public fun StringValue(builderAction: pbandk.wkt.MutableStringValue.() -> Unit): pbandk.wkt.StringValue = pbandk.wkt.MutableStringValue_Impl(
    value = "",
).also(builderAction).toStringValue()

@pbandk.Export
@pbandk.JsName("orDefaultForStringValue")
public fun StringValue?.orDefault(): pbandk.wkt.StringValue = this ?: pbandk.wkt.StringValue.defaultInstance

private class StringValue_Impl(
    override val value: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.StringValue, pbandk.gen.GeneratedMessage<pbandk.wkt.StringValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.StringValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableStringValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.StringValue {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableStringValue_Impl(
    override var value: String,
) : pbandk.wkt.MutableStringValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.StringValue>() {
    override val descriptor get() = pbandk.wkt.StringValue.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableStringValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toStringValue() = StringValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use BytesValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.BytesValue"],
        expression = "BytesValue {\nthis.value = value\nthis.unknownFields += unknownFields\n}",
    )
)
public fun BytesValue(
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.BytesValue = pbandk.wkt.BytesValue {
    this.value = value
    this.unknownFields += unknownFields
}

/**
 * The [MutableBytesValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildBytesValue")
public fun BytesValue(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit): pbandk.wkt.BytesValue = pbandk.wkt.MutableBytesValue_Impl(
    value = pbandk.ByteArr.empty,
).also(builderAction).toBytesValue()

@pbandk.Export
@pbandk.JsName("orDefaultForBytesValue")
public fun BytesValue?.orDefault(): pbandk.wkt.BytesValue = this ?: pbandk.wkt.BytesValue.defaultInstance

private class BytesValue_Impl(
    override val value: pbandk.ByteArr,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.BytesValue, pbandk.gen.GeneratedMessage<pbandk.wkt.BytesValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.BytesValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.BytesValue {
        this.value = value
        this.unknownFields += unknownFields
    }
}

private class MutableBytesValue_Impl(
    override var value: pbandk.ByteArr,
) : pbandk.wkt.MutableBytesValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.BytesValue>() {
    override val descriptor get() = pbandk.wkt.BytesValue.descriptor
    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toBytesValue() = BytesValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

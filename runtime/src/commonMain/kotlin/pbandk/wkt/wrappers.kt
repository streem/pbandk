@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed interface DoubleValue : pbandk.Message {
    public val value: Double

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DoubleValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue>

    /**
     * The [MutableDoubleValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit): pbandk.wkt.DoubleValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Double = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.DoubleValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.DoubleValue> {
        public val defaultInstance: pbandk.wkt.DoubleValue by lazy { pbandk.wkt.DoubleValue {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DoubleValue = pbandk.wkt.DoubleValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.DoubleValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "value",
                        value = pbandk.wkt.DoubleValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.DoubleValue",
                messageClass = pbandk.wkt.DoubleValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableDoubleValue : pbandk.wkt.DoubleValue, pbandk.MutableMessage {
    public override var value: Double
}

@pbandk.Export
public sealed interface FloatValue : pbandk.Message {
    public val value: Float

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FloatValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue>

    /**
     * The [MutableFloatValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit): pbandk.wkt.FloatValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Float = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FloatValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.FloatValue> {
        public val defaultInstance: pbandk.wkt.FloatValue by lazy { pbandk.wkt.FloatValue {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FloatValue = pbandk.wkt.FloatValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FloatValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "value",
                        value = pbandk.wkt.FloatValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FloatValue",
                messageClass = pbandk.wkt.FloatValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableFloatValue : pbandk.wkt.FloatValue, pbandk.MutableMessage {
    public override var value: Float
}

@pbandk.Export
public sealed interface Int64Value : pbandk.Message {
    public val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value>

    /**
     * The [MutableInt64Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit): pbandk.wkt.Int64Value

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Long = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Int64Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int64Value> {
        public val defaultInstance: pbandk.wkt.Int64Value by lazy { pbandk.wkt.Int64Value {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Int64Value = pbandk.wkt.Int64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Int64Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "value",
                        value = pbandk.wkt.Int64Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Int64Value",
                messageClass = pbandk.wkt.Int64Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableInt64Value : pbandk.wkt.Int64Value, pbandk.MutableMessage {
    public override var value: Long
}

@pbandk.Export
public sealed interface UInt64Value : pbandk.Message {
    public val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value>

    /**
     * The [MutableUInt64Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit): pbandk.wkt.UInt64Value

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Long = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UInt64Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt64Value> {
        public val defaultInstance: pbandk.wkt.UInt64Value by lazy { pbandk.wkt.UInt64Value {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UInt64Value = pbandk.wkt.UInt64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UInt64Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "value",
                        value = pbandk.wkt.UInt64Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.UInt64Value",
                messageClass = pbandk.wkt.UInt64Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableUInt64Value : pbandk.wkt.UInt64Value, pbandk.MutableMessage {
    public override var value: Long
}

@pbandk.Export
public sealed interface Int32Value : pbandk.Message {
    public val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value>

    /**
     * The [MutableInt32Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit): pbandk.wkt.Int32Value

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Int = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Int32Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int32Value> {
        public val defaultInstance: pbandk.wkt.Int32Value by lazy { pbandk.wkt.Int32Value {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Int32Value = pbandk.wkt.Int32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Int32Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "value",
                        value = pbandk.wkt.Int32Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Int32Value",
                messageClass = pbandk.wkt.Int32Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableInt32Value : pbandk.wkt.Int32Value, pbandk.MutableMessage {
    public override var value: Int
}

@pbandk.Export
public sealed interface UInt32Value : pbandk.Message {
    public val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value>

    /**
     * The [MutableUInt32Value] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit): pbandk.wkt.UInt32Value

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Int = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UInt32Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt32Value> {
        public val defaultInstance: pbandk.wkt.UInt32Value by lazy { pbandk.wkt.UInt32Value {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UInt32Value = pbandk.wkt.UInt32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UInt32Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "value",
                        value = pbandk.wkt.UInt32Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.UInt32Value",
                messageClass = pbandk.wkt.UInt32Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableUInt32Value : pbandk.wkt.UInt32Value, pbandk.MutableMessage {
    public override var value: Int
}

@pbandk.Export
public sealed interface BoolValue : pbandk.Message {
    public val value: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BoolValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue>

    /**
     * The [MutableBoolValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit): pbandk.wkt.BoolValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: Boolean = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.BoolValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.BoolValue> {
        public val defaultInstance: pbandk.wkt.BoolValue by lazy { pbandk.wkt.BoolValue {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.BoolValue = pbandk.wkt.BoolValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.BoolValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "value",
                        value = pbandk.wkt.BoolValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.BoolValue",
                messageClass = pbandk.wkt.BoolValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableBoolValue : pbandk.wkt.BoolValue, pbandk.MutableMessage {
    public override var value: Boolean
}

@pbandk.Export
public sealed interface StringValue : pbandk.Message {
    public val value: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.StringValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue>

    /**
     * The [MutableStringValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableStringValue.() -> Unit): pbandk.wkt.StringValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: String = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.StringValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.StringValue> {
        public val defaultInstance: pbandk.wkt.StringValue by lazy { pbandk.wkt.StringValue {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.StringValue = pbandk.wkt.StringValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.StringValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = pbandk.wkt.StringValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.StringValue",
                messageClass = pbandk.wkt.StringValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableStringValue : pbandk.wkt.StringValue, pbandk.MutableMessage {
    public override var value: String
}

@pbandk.Export
public sealed interface BytesValue : pbandk.Message {
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BytesValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue>

    /**
     * The [MutableBytesValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit): pbandk.wkt.BytesValue

    @Deprecated("Use copy {} instead")
    public fun copy(
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.BytesValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.BytesValue> {
        public val defaultInstance: pbandk.wkt.BytesValue by lazy { pbandk.wkt.BytesValue {} }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.BytesValue = pbandk.wkt.BytesValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.BytesValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = pbandk.wkt.BytesValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.BytesValue",
                messageClass = pbandk.wkt.BytesValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public sealed interface MutableBytesValue : pbandk.wkt.BytesValue, pbandk.MutableMessage {
    public override var value: pbandk.ByteArr
}

@Deprecated("Use DoubleValue { } instead")
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
public fun DoubleValue(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit): pbandk.wkt.DoubleValue = pbandk.wkt.MutableDoubleValue_Impl(
    value = 0.0,
    unknownFields = mutableMapOf()
).also(builderAction).toDoubleValue()

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleValue")
public fun DoubleValue?.orDefault(): pbandk.wkt.DoubleValue = this ?: pbandk.wkt.DoubleValue.defaultInstance

private class DoubleValue_Impl(
    override val value: Double,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.DoubleValue, pbandk.GeneratedMessage<pbandk.wkt.DoubleValue>() {
    override val descriptor get() = pbandk.wkt.DoubleValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit) = pbandk.wkt.DoubleValue {
        this.value = this@DoubleValue_Impl.value
        this.unknownFields += this@DoubleValue_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.DoubleValue {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableDoubleValue_Impl(
    override var value: Double,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableDoubleValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableDoubleValue>() {
    override val descriptor get() = pbandk.wkt.DoubleValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableDoubleValue.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toDoubleValue() = DoubleValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun DoubleValue.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.DoubleValue {
    if (other !is pbandk.wkt.DoubleValue) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun DoubleValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.DoubleValue {
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Double
        }
    }
    return DoubleValue_Impl(value, unknownFields)
}

@Deprecated("Use FloatValue { } instead")
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
public fun FloatValue(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit): pbandk.wkt.FloatValue = pbandk.wkt.MutableFloatValue_Impl(
    value = 0.0F,
    unknownFields = mutableMapOf()
).also(builderAction).toFloatValue()

@pbandk.Export
@pbandk.JsName("orDefaultForFloatValue")
public fun FloatValue?.orDefault(): pbandk.wkt.FloatValue = this ?: pbandk.wkt.FloatValue.defaultInstance

private class FloatValue_Impl(
    override val value: Float,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.FloatValue, pbandk.GeneratedMessage<pbandk.wkt.FloatValue>() {
    override val descriptor get() = pbandk.wkt.FloatValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit) = pbandk.wkt.FloatValue {
        this.value = this@FloatValue_Impl.value
        this.unknownFields += this@FloatValue_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.FloatValue {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableFloatValue_Impl(
    override var value: Float,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableFloatValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableFloatValue>() {
    override val descriptor get() = pbandk.wkt.FloatValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableFloatValue.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toFloatValue() = FloatValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun FloatValue.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.FloatValue {
    if (other !is pbandk.wkt.FloatValue) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun FloatValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.FloatValue {
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Float
        }
    }
    return FloatValue_Impl(value, unknownFields)
}

@Deprecated("Use Int64Value { } instead")
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
public fun Int64Value(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit): pbandk.wkt.Int64Value = pbandk.wkt.MutableInt64Value_Impl(
    value = 0L,
    unknownFields = mutableMapOf()
).also(builderAction).toInt64Value()

@pbandk.Export
@pbandk.JsName("orDefaultForInt64Value")
public fun Int64Value?.orDefault(): pbandk.wkt.Int64Value = this ?: pbandk.wkt.Int64Value.defaultInstance

private class Int64Value_Impl(
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Int64Value, pbandk.GeneratedMessage<pbandk.wkt.Int64Value>() {
    override val descriptor get() = pbandk.wkt.Int64Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit) = pbandk.wkt.Int64Value {
        this.value = this@Int64Value_Impl.value
        this.unknownFields += this@Int64Value_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Int64Value {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableInt64Value_Impl(
    override var value: Long,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableInt64Value, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableInt64Value>() {
    override val descriptor get() = pbandk.wkt.Int64Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableInt64Value.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toInt64Value() = Int64Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun Int64Value.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Int64Value {
    if (other !is pbandk.wkt.Int64Value) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Int64Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Int64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return Int64Value_Impl(value, unknownFields)
}

@Deprecated("Use UInt64Value { } instead")
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
public fun UInt64Value(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit): pbandk.wkt.UInt64Value = pbandk.wkt.MutableUInt64Value_Impl(
    value = 0L,
    unknownFields = mutableMapOf()
).also(builderAction).toUInt64Value()

@pbandk.Export
@pbandk.JsName("orDefaultForUInt64Value")
public fun UInt64Value?.orDefault(): pbandk.wkt.UInt64Value = this ?: pbandk.wkt.UInt64Value.defaultInstance

private class UInt64Value_Impl(
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UInt64Value, pbandk.GeneratedMessage<pbandk.wkt.UInt64Value>() {
    override val descriptor get() = pbandk.wkt.UInt64Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit) = pbandk.wkt.UInt64Value {
        this.value = this@UInt64Value_Impl.value
        this.unknownFields += this@UInt64Value_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.UInt64Value {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableUInt64Value_Impl(
    override var value: Long,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableUInt64Value, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableUInt64Value>() {
    override val descriptor get() = pbandk.wkt.UInt64Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableUInt64Value.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toUInt64Value() = UInt64Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun UInt64Value.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.UInt64Value {
    if (other !is pbandk.wkt.UInt64Value) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun UInt64Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.UInt64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return UInt64Value_Impl(value, unknownFields)
}

@Deprecated("Use Int32Value { } instead")
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
public fun Int32Value(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit): pbandk.wkt.Int32Value = pbandk.wkt.MutableInt32Value_Impl(
    value = 0,
    unknownFields = mutableMapOf()
).also(builderAction).toInt32Value()

@pbandk.Export
@pbandk.JsName("orDefaultForInt32Value")
public fun Int32Value?.orDefault(): pbandk.wkt.Int32Value = this ?: pbandk.wkt.Int32Value.defaultInstance

private class Int32Value_Impl(
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Int32Value, pbandk.GeneratedMessage<pbandk.wkt.Int32Value>() {
    override val descriptor get() = pbandk.wkt.Int32Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit) = pbandk.wkt.Int32Value {
        this.value = this@Int32Value_Impl.value
        this.unknownFields += this@Int32Value_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Int32Value {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableInt32Value_Impl(
    override var value: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableInt32Value, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableInt32Value>() {
    override val descriptor get() = pbandk.wkt.Int32Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableInt32Value.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toInt32Value() = Int32Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun Int32Value.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.Int32Value {
    if (other !is pbandk.wkt.Int32Value) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Int32Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Int32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return Int32Value_Impl(value, unknownFields)
}

@Deprecated("Use UInt32Value { } instead")
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
public fun UInt32Value(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit): pbandk.wkt.UInt32Value = pbandk.wkt.MutableUInt32Value_Impl(
    value = 0,
    unknownFields = mutableMapOf()
).also(builderAction).toUInt32Value()

@pbandk.Export
@pbandk.JsName("orDefaultForUInt32Value")
public fun UInt32Value?.orDefault(): pbandk.wkt.UInt32Value = this ?: pbandk.wkt.UInt32Value.defaultInstance

private class UInt32Value_Impl(
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.UInt32Value, pbandk.GeneratedMessage<pbandk.wkt.UInt32Value>() {
    override val descriptor get() = pbandk.wkt.UInt32Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit) = pbandk.wkt.UInt32Value {
        this.value = this@UInt32Value_Impl.value
        this.unknownFields += this@UInt32Value_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.UInt32Value {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableUInt32Value_Impl(
    override var value: Int,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableUInt32Value, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableUInt32Value>() {
    override val descriptor get() = pbandk.wkt.UInt32Value.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableUInt32Value.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toUInt32Value() = UInt32Value_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun UInt32Value.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.UInt32Value {
    if (other !is pbandk.wkt.UInt32Value) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun UInt32Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.UInt32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return UInt32Value_Impl(value, unknownFields)
}

@Deprecated("Use BoolValue { } instead")
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
public fun BoolValue(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit): pbandk.wkt.BoolValue = pbandk.wkt.MutableBoolValue_Impl(
    value = false,
    unknownFields = mutableMapOf()
).also(builderAction).toBoolValue()

@pbandk.Export
@pbandk.JsName("orDefaultForBoolValue")
public fun BoolValue?.orDefault(): pbandk.wkt.BoolValue = this ?: pbandk.wkt.BoolValue.defaultInstance

private class BoolValue_Impl(
    override val value: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.BoolValue, pbandk.GeneratedMessage<pbandk.wkt.BoolValue>() {
    override val descriptor get() = pbandk.wkt.BoolValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit) = pbandk.wkt.BoolValue {
        this.value = this@BoolValue_Impl.value
        this.unknownFields += this@BoolValue_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.BoolValue {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableBoolValue_Impl(
    override var value: Boolean,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableBoolValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableBoolValue>() {
    override val descriptor get() = pbandk.wkt.BoolValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableBoolValue.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toBoolValue() = BoolValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun BoolValue.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.BoolValue {
    if (other !is pbandk.wkt.BoolValue) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun BoolValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.BoolValue {
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Boolean
        }
    }
    return BoolValue_Impl(value, unknownFields)
}

@Deprecated("Use StringValue { } instead")
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
public fun StringValue(builderAction: pbandk.wkt.MutableStringValue.() -> Unit): pbandk.wkt.StringValue = pbandk.wkt.MutableStringValue_Impl(
    value = "",
    unknownFields = mutableMapOf()
).also(builderAction).toStringValue()

@pbandk.Export
@pbandk.JsName("orDefaultForStringValue")
public fun StringValue?.orDefault(): pbandk.wkt.StringValue = this ?: pbandk.wkt.StringValue.defaultInstance

private class StringValue_Impl(
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.StringValue, pbandk.GeneratedMessage<pbandk.wkt.StringValue>() {
    override val descriptor get() = pbandk.wkt.StringValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableStringValue.() -> Unit) = pbandk.wkt.StringValue {
        this.value = this@StringValue_Impl.value
        this.unknownFields += this@StringValue_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.StringValue {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableStringValue_Impl(
    override var value: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableStringValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableStringValue>() {
    override val descriptor get() = pbandk.wkt.StringValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableStringValue.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toStringValue() = StringValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun StringValue.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.StringValue {
    if (other !is pbandk.wkt.StringValue) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun StringValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.StringValue {
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as String
        }
    }
    return StringValue_Impl(value, unknownFields)
}

@Deprecated("Use BytesValue { } instead")
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
public fun BytesValue(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit): pbandk.wkt.BytesValue = pbandk.wkt.MutableBytesValue_Impl(
    value = pbandk.ByteArr.empty,
    unknownFields = mutableMapOf()
).also(builderAction).toBytesValue()

@pbandk.Export
@pbandk.JsName("orDefaultForBytesValue")
public fun BytesValue?.orDefault(): pbandk.wkt.BytesValue = this ?: pbandk.wkt.BytesValue.defaultInstance

private class BytesValue_Impl(
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.BytesValue, pbandk.GeneratedMessage<pbandk.wkt.BytesValue>() {
    override val descriptor get() = pbandk.wkt.BytesValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit) = pbandk.wkt.BytesValue {
        this.value = this@BytesValue_Impl.value
        this.unknownFields += this@BytesValue_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.BytesValue {
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableBytesValue_Impl(
    override var value: pbandk.ByteArr,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableBytesValue, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableBytesValue>() {
    override val descriptor get() = pbandk.wkt.BytesValue.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableBytesValue.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toBytesValue() = BytesValue_Impl(
        value = value,
        unknownFields = unknownFields.toMap()
    )
}

private fun BytesValue.protoMergeImpl(other: pbandk.Message?): pbandk.wkt.BytesValue {
    if (other !is pbandk.wkt.BytesValue) return this

    return copy {
        value = other.value
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun BytesValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.BytesValue {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return BytesValue_Impl(value, unknownFields)
}

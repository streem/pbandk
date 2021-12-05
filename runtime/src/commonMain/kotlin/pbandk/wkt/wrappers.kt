@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface DoubleValue : pbandk.Message {
    public val value: Double

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DoubleValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue>

    public fun copy(
        value: Double = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.DoubleValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.DoubleValue> {
        @Deprecated("Use doubleValue { } instead")
        public operator fun invoke(
            value: Double = 0.0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.DoubleValue = DoubleValue_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.DoubleValue by lazy { pbandk.wkt.DoubleValue() }
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

public sealed interface MutableDoubleValue : DoubleValue, pbandk.MutableMessage {
    public override var value: Double

    public fun toDoubleValue(): DoubleValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.DoubleValue> {
        @Deprecated("Use doubleValue { } instead")
        public operator fun invoke(
            value: Double = 0.0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableDoubleValue = MutableDoubleValue_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableDoubleValue by lazy { MutableDoubleValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DoubleValue = pbandk.wkt.DoubleValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue> get() = pbandk.wkt.DoubleValue.descriptor
    }
}

public sealed interface FloatValue : pbandk.Message {
    public val value: Float

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FloatValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue>

    public fun copy(
        value: Float = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.FloatValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.FloatValue> {
        @Deprecated("Use floatValue { } instead")
        public operator fun invoke(
            value: Float = 0.0F,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.FloatValue = FloatValue_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.FloatValue by lazy { pbandk.wkt.FloatValue() }
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

public sealed interface MutableFloatValue : FloatValue, pbandk.MutableMessage {
    public override var value: Float

    public fun toFloatValue(): FloatValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.FloatValue> {
        @Deprecated("Use floatValue { } instead")
        public operator fun invoke(
            value: Float = 0.0F,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableFloatValue = MutableFloatValue_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableFloatValue by lazy { MutableFloatValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FloatValue = pbandk.wkt.FloatValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue> get() = pbandk.wkt.FloatValue.descriptor
    }
}

public sealed interface Int64Value : pbandk.Message {
    public val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value>

    public fun copy(
        value: Long = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Int64Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int64Value> {
        @Deprecated("Use int64Value { } instead")
        public operator fun invoke(
            value: Long = 0L,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Int64Value = Int64Value_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.Int64Value by lazy { pbandk.wkt.Int64Value() }
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

public sealed interface MutableInt64Value : Int64Value, pbandk.MutableMessage {
    public override var value: Long

    public fun toInt64Value(): Int64Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int64Value> {
        @Deprecated("Use int64Value { } instead")
        public operator fun invoke(
            value: Long = 0L,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableInt64Value = MutableInt64Value_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableInt64Value by lazy { MutableInt64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Int64Value = pbandk.wkt.Int64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value> get() = pbandk.wkt.Int64Value.descriptor
    }
}

public sealed interface UInt64Value : pbandk.Message {
    public val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value>

    public fun copy(
        value: Long = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UInt64Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt64Value> {
        @Deprecated("Use uInt64Value { } instead")
        public operator fun invoke(
            value: Long = 0L,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.UInt64Value = UInt64Value_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.UInt64Value by lazy { pbandk.wkt.UInt64Value() }
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

public sealed interface MutableUInt64Value : UInt64Value, pbandk.MutableMessage {
    public override var value: Long

    public fun toUInt64Value(): UInt64Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt64Value> {
        @Deprecated("Use uInt64Value { } instead")
        public operator fun invoke(
            value: Long = 0L,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableUInt64Value = MutableUInt64Value_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableUInt64Value by lazy { MutableUInt64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UInt64Value = pbandk.wkt.UInt64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value> get() = pbandk.wkt.UInt64Value.descriptor
    }
}

public sealed interface Int32Value : pbandk.Message {
    public val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value>

    public fun copy(
        value: Int = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Int32Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int32Value> {
        @Deprecated("Use int32Value { } instead")
        public operator fun invoke(
            value: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Int32Value = Int32Value_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.Int32Value by lazy { pbandk.wkt.Int32Value() }
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

public sealed interface MutableInt32Value : Int32Value, pbandk.MutableMessage {
    public override var value: Int

    public fun toInt32Value(): Int32Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.Int32Value> {
        @Deprecated("Use int32Value { } instead")
        public operator fun invoke(
            value: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableInt32Value = MutableInt32Value_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableInt32Value by lazy { MutableInt32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Int32Value = pbandk.wkt.Int32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value> get() = pbandk.wkt.Int32Value.descriptor
    }
}

public sealed interface UInt32Value : pbandk.Message {
    public val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value>

    public fun copy(
        value: Int = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.UInt32Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt32Value> {
        @Deprecated("Use uInt32Value { } instead")
        public operator fun invoke(
            value: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.UInt32Value = UInt32Value_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.UInt32Value by lazy { pbandk.wkt.UInt32Value() }
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

public sealed interface MutableUInt32Value : UInt32Value, pbandk.MutableMessage {
    public override var value: Int

    public fun toUInt32Value(): UInt32Value

    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt32Value> {
        @Deprecated("Use uInt32Value { } instead")
        public operator fun invoke(
            value: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableUInt32Value = MutableUInt32Value_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableUInt32Value by lazy { MutableUInt32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UInt32Value = pbandk.wkt.UInt32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value> get() = pbandk.wkt.UInt32Value.descriptor
    }
}

public sealed interface BoolValue : pbandk.Message {
    public val value: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BoolValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue>

    public fun copy(
        value: Boolean = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.BoolValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.BoolValue> {
        @Deprecated("Use boolValue { } instead")
        public operator fun invoke(
            value: Boolean = false,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.BoolValue = BoolValue_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.BoolValue by lazy { pbandk.wkt.BoolValue() }
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

public sealed interface MutableBoolValue : BoolValue, pbandk.MutableMessage {
    public override var value: Boolean

    public fun toBoolValue(): BoolValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.BoolValue> {
        @Deprecated("Use boolValue { } instead")
        public operator fun invoke(
            value: Boolean = false,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableBoolValue = MutableBoolValue_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableBoolValue by lazy { MutableBoolValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.BoolValue = pbandk.wkt.BoolValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue> get() = pbandk.wkt.BoolValue.descriptor
    }
}

public sealed interface StringValue : pbandk.Message {
    public val value: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.StringValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue>

    public fun copy(
        value: String = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.StringValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.StringValue> {
        @Deprecated("Use stringValue { } instead")
        public operator fun invoke(
            value: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.StringValue = StringValue_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.StringValue by lazy { pbandk.wkt.StringValue() }
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

public sealed interface MutableStringValue : StringValue, pbandk.MutableMessage {
    public override var value: String

    public fun toStringValue(): StringValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.StringValue> {
        @Deprecated("Use stringValue { } instead")
        public operator fun invoke(
            value: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableStringValue = MutableStringValue_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableStringValue by lazy { MutableStringValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.StringValue = pbandk.wkt.StringValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue> get() = pbandk.wkt.StringValue.descriptor
    }
}

public sealed interface BytesValue : pbandk.Message {
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BytesValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue>

    public fun copy(
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.BytesValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.BytesValue> {
        @Deprecated("Use bytesValue { } instead")
        public operator fun invoke(
            value: pbandk.ByteArr = pbandk.ByteArr.empty,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.BytesValue = BytesValue_Impl(
            value = value,
            unknownFields = unknownFields
        )

        public val defaultInstance: pbandk.wkt.BytesValue by lazy { pbandk.wkt.BytesValue() }
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

public sealed interface MutableBytesValue : BytesValue, pbandk.MutableMessage {
    public override var value: pbandk.ByteArr

    public fun toBytesValue(): BytesValue

    public companion object : pbandk.Message.Companion<pbandk.wkt.BytesValue> {
        @Deprecated("Use bytesValue { } instead")
        public operator fun invoke(
            value: pbandk.ByteArr = pbandk.ByteArr.empty,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableBytesValue = MutableBytesValue_Impl(
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        public val defaultInstance: MutableBytesValue by lazy { MutableBytesValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.BytesValue = pbandk.wkt.BytesValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue> get() = pbandk.wkt.BytesValue.descriptor
    }
}

public fun doubleValue(builderAction: MutableDoubleValue.() -> Unit): DoubleValue {
    val builder = MutableDoubleValue()
    builder.builderAction()
    return builder.toDoubleValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleValue")
public fun DoubleValue?.orDefault(): pbandk.wkt.DoubleValue = this ?: DoubleValue.defaultInstance

private class DoubleValue_Impl(
    override val value: Double,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : DoubleValue, pbandk.GeneratedMessage<DoubleValue>() {
    override val descriptor get() = DoubleValue.descriptor

    override fun copy(
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = DoubleValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? DoubleValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableDoubleValue_Impl(
    override var value: Double,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableDoubleValue, pbandk.MutableGeneratedMessage<MutableDoubleValue>() {
    override val descriptor get() = DoubleValue.descriptor

    override fun copy(
        value: Double,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = DoubleValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? DoubleValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toDoubleValue() = DoubleValue_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun DoubleValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DoubleValue {
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Double
        }
    }
    return DoubleValue(value, unknownFields)
}

public fun floatValue(builderAction: MutableFloatValue.() -> Unit): FloatValue {
    val builder = MutableFloatValue()
    builder.builderAction()
    return builder.toFloatValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForFloatValue")
public fun FloatValue?.orDefault(): pbandk.wkt.FloatValue = this ?: FloatValue.defaultInstance

private class FloatValue_Impl(
    override val value: Float,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FloatValue, pbandk.GeneratedMessage<FloatValue>() {
    override val descriptor get() = FloatValue.descriptor

    override fun copy(
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FloatValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FloatValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableFloatValue_Impl(
    override var value: Float,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableFloatValue, pbandk.MutableGeneratedMessage<MutableFloatValue>() {
    override val descriptor get() = FloatValue.descriptor

    override fun copy(
        value: Float,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = FloatValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? FloatValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toFloatValue() = FloatValue_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun FloatValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FloatValue {
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Float
        }
    }
    return FloatValue(value, unknownFields)
}

public fun int64Value(builderAction: MutableInt64Value.() -> Unit): Int64Value {
    val builder = MutableInt64Value()
    builder.builderAction()
    return builder.toInt64Value()
}

@pbandk.Export
@pbandk.JsName("orDefaultForInt64Value")
public fun Int64Value?.orDefault(): pbandk.wkt.Int64Value = this ?: Int64Value.defaultInstance

private class Int64Value_Impl(
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int64Value, pbandk.GeneratedMessage<Int64Value>() {
    override val descriptor get() = Int64Value.descriptor

    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int64Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int64Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableInt64Value_Impl(
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableInt64Value, pbandk.MutableGeneratedMessage<MutableInt64Value>() {
    override val descriptor get() = Int64Value.descriptor

    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int64Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int64Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toInt64Value() = Int64Value_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Int64Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return Int64Value(value, unknownFields)
}

public fun uInt64Value(builderAction: MutableUInt64Value.() -> Unit): UInt64Value {
    val builder = MutableUInt64Value()
    builder.builderAction()
    return builder.toUInt64Value()
}

@pbandk.Export
@pbandk.JsName("orDefaultForUInt64Value")
public fun UInt64Value?.orDefault(): pbandk.wkt.UInt64Value = this ?: UInt64Value.defaultInstance

private class UInt64Value_Impl(
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt64Value, pbandk.GeneratedMessage<UInt64Value>() {
    override val descriptor get() = UInt64Value.descriptor

    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt64Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt64Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableUInt64Value_Impl(
    override var value: Long,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableUInt64Value, pbandk.MutableGeneratedMessage<MutableUInt64Value>() {
    override val descriptor get() = UInt64Value.descriptor

    override fun copy(
        value: Long,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt64Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt64Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toUInt64Value() = UInt64Value_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun UInt64Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return UInt64Value(value, unknownFields)
}

public fun int32Value(builderAction: MutableInt32Value.() -> Unit): Int32Value {
    val builder = MutableInt32Value()
    builder.builderAction()
    return builder.toInt32Value()
}

@pbandk.Export
@pbandk.JsName("orDefaultForInt32Value")
public fun Int32Value?.orDefault(): pbandk.wkt.Int32Value = this ?: Int32Value.defaultInstance

private class Int32Value_Impl(
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int32Value, pbandk.GeneratedMessage<Int32Value>() {
    override val descriptor get() = Int32Value.descriptor

    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int32Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int32Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableInt32Value_Impl(
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableInt32Value, pbandk.MutableGeneratedMessage<MutableInt32Value>() {
    override val descriptor get() = Int32Value.descriptor

    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Int32Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Int32Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toInt32Value() = Int32Value_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun Int32Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return Int32Value(value, unknownFields)
}

public fun uInt32Value(builderAction: MutableUInt32Value.() -> Unit): UInt32Value {
    val builder = MutableUInt32Value()
    builder.builderAction()
    return builder.toUInt32Value()
}

@pbandk.Export
@pbandk.JsName("orDefaultForUInt32Value")
public fun UInt32Value?.orDefault(): pbandk.wkt.UInt32Value = this ?: UInt32Value.defaultInstance

private class UInt32Value_Impl(
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt32Value, pbandk.GeneratedMessage<UInt32Value>() {
    override val descriptor get() = UInt32Value.descriptor

    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt32Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt32Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableUInt32Value_Impl(
    override var value: Int,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableUInt32Value, pbandk.MutableGeneratedMessage<MutableUInt32Value>() {
    override val descriptor get() = UInt32Value.descriptor

    override fun copy(
        value: Int,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = UInt32Value_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? UInt32Value)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toUInt32Value() = UInt32Value_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun UInt32Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return UInt32Value(value, unknownFields)
}

public fun boolValue(builderAction: MutableBoolValue.() -> Unit): BoolValue {
    val builder = MutableBoolValue()
    builder.builderAction()
    return builder.toBoolValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForBoolValue")
public fun BoolValue?.orDefault(): pbandk.wkt.BoolValue = this ?: BoolValue.defaultInstance

private class BoolValue_Impl(
    override val value: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BoolValue, pbandk.GeneratedMessage<BoolValue>() {
    override val descriptor get() = BoolValue.descriptor

    override fun copy(
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BoolValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BoolValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableBoolValue_Impl(
    override var value: Boolean,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableBoolValue, pbandk.MutableGeneratedMessage<MutableBoolValue>() {
    override val descriptor get() = BoolValue.descriptor

    override fun copy(
        value: Boolean,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BoolValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BoolValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toBoolValue() = BoolValue_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun BoolValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BoolValue {
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Boolean
        }
    }
    return BoolValue(value, unknownFields)
}

public fun stringValue(builderAction: MutableStringValue.() -> Unit): StringValue {
    val builder = MutableStringValue()
    builder.builderAction()
    return builder.toStringValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForStringValue")
public fun StringValue?.orDefault(): pbandk.wkt.StringValue = this ?: StringValue.defaultInstance

private class StringValue_Impl(
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : StringValue, pbandk.GeneratedMessage<StringValue>() {
    override val descriptor get() = StringValue.descriptor

    override fun copy(
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = StringValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? StringValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableStringValue_Impl(
    override var value: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableStringValue, pbandk.MutableGeneratedMessage<MutableStringValue>() {
    override val descriptor get() = StringValue.descriptor

    override fun copy(
        value: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = StringValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? StringValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toStringValue() = StringValue_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun StringValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StringValue {
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as String
        }
    }
    return StringValue(value, unknownFields)
}

public fun bytesValue(builderAction: MutableBytesValue.() -> Unit): BytesValue {
    val builder = MutableBytesValue()
    builder.builderAction()
    return builder.toBytesValue()
}

@pbandk.Export
@pbandk.JsName("orDefaultForBytesValue")
public fun BytesValue?.orDefault(): pbandk.wkt.BytesValue = this ?: BytesValue.defaultInstance

private class BytesValue_Impl(
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BytesValue, pbandk.GeneratedMessage<BytesValue>() {
    override val descriptor get() = BytesValue.descriptor

    override fun copy(
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BytesValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BytesValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this
}

private class MutableBytesValue_Impl(
    override var value: pbandk.ByteArr,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableBytesValue, pbandk.MutableGeneratedMessage<MutableBytesValue>() {
    override val descriptor get() = BytesValue.descriptor

    override fun copy(
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = BytesValue_Impl(
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? BytesValue)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toBytesValue() = BytesValue_Impl(
        value = value,
        unknownFields = unknownFields
    )
}

@Suppress("UNCHECKED_CAST")
private fun BytesValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BytesValue {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return BytesValue(value, unknownFields)
}

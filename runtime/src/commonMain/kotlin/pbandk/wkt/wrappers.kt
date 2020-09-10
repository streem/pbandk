@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class DoubleValue(
    val value: Double = 0.0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<DoubleValue> {
        val defaultInstance by lazy { DoubleValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = DoubleValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<DoubleValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = DoubleValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "value",
                        value = DoubleValue::value
                    )
                )
            )
        }
    }
}

data class FloatValue(
    val value: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FloatValue> {
        val defaultInstance by lazy { FloatValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FloatValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FloatValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FloatValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "value",
                        value = FloatValue::value
                    )
                )
            )
        }
    }
}

data class Int64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Int64Value> {
        val defaultInstance by lazy { Int64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Int64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Int64Value> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Int64Value::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "value",
                        value = Int64Value::value
                    )
                )
            )
        }
    }
}

data class UInt64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<UInt64Value> {
        val defaultInstance by lazy { UInt64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = UInt64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<UInt64Value> by lazy {
            pbandk.MessageDescriptor(
                messageClass = UInt64Value::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "value",
                        value = UInt64Value::value
                    )
                )
            )
        }
    }
}

data class Int32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Int32Value> {
        val defaultInstance by lazy { Int32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Int32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Int32Value> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Int32Value::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "value",
                        value = Int32Value::value
                    )
                )
            )
        }
    }
}

data class UInt32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<UInt32Value> {
        val defaultInstance by lazy { UInt32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = UInt32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<UInt32Value> by lazy {
            pbandk.MessageDescriptor(
                messageClass = UInt32Value::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "value",
                        value = UInt32Value::value
                    )
                )
            )
        }
    }
}

data class BoolValue(
    val value: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BoolValue> {
        val defaultInstance by lazy { BoolValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = BoolValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<BoolValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = BoolValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "value",
                        value = BoolValue::value
                    )
                )
            )
        }
    }
}

data class StringValue(
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<StringValue> {
        val defaultInstance by lazy { StringValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = StringValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<StringValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = StringValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = StringValue::value
                    )
                )
            )
        }
    }
}

data class BytesValue(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BytesValue> {
        val defaultInstance by lazy { BytesValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = BytesValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<BytesValue> by lazy {
            pbandk.MessageDescriptor(
                messageClass = BytesValue::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = BytesValue::value
                    )
                )
            )
        }
    }
}

fun DoubleValue?.orDefault() = this ?: DoubleValue.defaultInstance

private fun DoubleValue.protoMergeImpl(plus: pbandk.Message?): DoubleValue = (plus as? DoubleValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun FloatValue?.orDefault() = this ?: FloatValue.defaultInstance

private fun FloatValue.protoMergeImpl(plus: pbandk.Message?): FloatValue = (plus as? FloatValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun Int64Value?.orDefault() = this ?: Int64Value.defaultInstance

private fun Int64Value.protoMergeImpl(plus: pbandk.Message?): Int64Value = (plus as? Int64Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun UInt64Value?.orDefault() = this ?: UInt64Value.defaultInstance

private fun UInt64Value.protoMergeImpl(plus: pbandk.Message?): UInt64Value = (plus as? UInt64Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun Int32Value?.orDefault() = this ?: Int32Value.defaultInstance

private fun Int32Value.protoMergeImpl(plus: pbandk.Message?): Int32Value = (plus as? Int32Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun UInt32Value?.orDefault() = this ?: UInt32Value.defaultInstance

private fun UInt32Value.protoMergeImpl(plus: pbandk.Message?): UInt32Value = (plus as? UInt32Value)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun BoolValue?.orDefault() = this ?: BoolValue.defaultInstance

private fun BoolValue.protoMergeImpl(plus: pbandk.Message?): BoolValue = (plus as? BoolValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun StringValue?.orDefault() = this ?: StringValue.defaultInstance

private fun StringValue.protoMergeImpl(plus: pbandk.Message?): StringValue = (plus as? StringValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

fun BytesValue?.orDefault() = this ?: BytesValue.defaultInstance

private fun BytesValue.protoMergeImpl(plus: pbandk.Message?): BytesValue = (plus as? BytesValue)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

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

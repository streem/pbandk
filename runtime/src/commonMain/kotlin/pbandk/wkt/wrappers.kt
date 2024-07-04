@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class DoubleValue(
    val value: Double = 0.0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DoubleValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.DoubleValue> {
        public val defaultInstance: pbandk.wkt.DoubleValue by lazy { pbandk.wkt.DoubleValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.DoubleValue = pbandk.wkt.DoubleValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.DoubleValue",
            messageClass = pbandk.wkt.DoubleValue::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class FloatValue(
    val value: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FloatValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.FloatValue> {
        public val defaultInstance: pbandk.wkt.FloatValue by lazy { pbandk.wkt.FloatValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.FloatValue = pbandk.wkt.FloatValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.FloatValue",
            messageClass = pbandk.wkt.FloatValue::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class Int64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int64Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Int64Value> {
        public val defaultInstance: pbandk.wkt.Int64Value by lazy { pbandk.wkt.Int64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Int64Value = pbandk.wkt.Int64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.Int64Value",
            messageClass = pbandk.wkt.Int64Value::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class UInt64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt64Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt64Value> {
        public val defaultInstance: pbandk.wkt.UInt64Value by lazy { pbandk.wkt.UInt64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UInt64Value = pbandk.wkt.UInt64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.UInt64Value",
            messageClass = pbandk.wkt.UInt64Value::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class Int32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int32Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.Int32Value> {
        public val defaultInstance: pbandk.wkt.Int32Value by lazy { pbandk.wkt.Int32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Int32Value = pbandk.wkt.Int32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.Int32Value",
            messageClass = pbandk.wkt.Int32Value::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class UInt32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt32Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.UInt32Value> {
        public val defaultInstance: pbandk.wkt.UInt32Value by lazy { pbandk.wkt.UInt32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.UInt32Value = pbandk.wkt.UInt32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.UInt32Value",
            messageClass = pbandk.wkt.UInt32Value::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class BoolValue(
    val value: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BoolValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.BoolValue> {
        public val defaultInstance: pbandk.wkt.BoolValue by lazy { pbandk.wkt.BoolValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.BoolValue = pbandk.wkt.BoolValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.BoolValue",
            messageClass = pbandk.wkt.BoolValue::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class StringValue(
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.StringValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.StringValue> {
        public val defaultInstance: pbandk.wkt.StringValue by lazy { pbandk.wkt.StringValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.StringValue = pbandk.wkt.StringValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.StringValue",
            messageClass = pbandk.wkt.StringValue::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class BytesValue(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BytesValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.BytesValue> {
        public val defaultInstance: pbandk.wkt.BytesValue by lazy { pbandk.wkt.BytesValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.BytesValue = pbandk.wkt.BytesValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue> = pbandk.MessageDescriptor(
            fullName = "google.protobuf.BytesValue",
            messageClass = pbandk.wkt.BytesValue::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleValue")
public fun DoubleValue?.orDefault(): pbandk.wkt.DoubleValue = this ?: DoubleValue.defaultInstance

private fun DoubleValue.protoMergeImpl(plus: pbandk.Message?): DoubleValue = (plus as? DoubleValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForFloatValue")
public fun FloatValue?.orDefault(): pbandk.wkt.FloatValue = this ?: FloatValue.defaultInstance

private fun FloatValue.protoMergeImpl(plus: pbandk.Message?): FloatValue = (plus as? FloatValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForInt64Value")
public fun Int64Value?.orDefault(): pbandk.wkt.Int64Value = this ?: Int64Value.defaultInstance

private fun Int64Value.protoMergeImpl(plus: pbandk.Message?): Int64Value = (plus as? Int64Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForUInt64Value")
public fun UInt64Value?.orDefault(): pbandk.wkt.UInt64Value = this ?: UInt64Value.defaultInstance

private fun UInt64Value.protoMergeImpl(plus: pbandk.Message?): UInt64Value = (plus as? UInt64Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForInt32Value")
public fun Int32Value?.orDefault(): pbandk.wkt.Int32Value = this ?: Int32Value.defaultInstance

private fun Int32Value.protoMergeImpl(plus: pbandk.Message?): Int32Value = (plus as? Int32Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForUInt32Value")
public fun UInt32Value?.orDefault(): pbandk.wkt.UInt32Value = this ?: UInt32Value.defaultInstance

private fun UInt32Value.protoMergeImpl(plus: pbandk.Message?): UInt32Value = (plus as? UInt32Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForBoolValue")
public fun BoolValue?.orDefault(): pbandk.wkt.BoolValue = this ?: BoolValue.defaultInstance

private fun BoolValue.protoMergeImpl(plus: pbandk.Message?): BoolValue = (plus as? BoolValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForStringValue")
public fun StringValue?.orDefault(): pbandk.wkt.StringValue = this ?: StringValue.defaultInstance

private fun StringValue.protoMergeImpl(plus: pbandk.Message?): StringValue = (plus as? StringValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

@pbandk.Export
@pbandk.JsName("orDefaultForBytesValue")
public fun BytesValue?.orDefault(): pbandk.wkt.BytesValue = this ?: BytesValue.defaultInstance

private fun BytesValue.protoMergeImpl(plus: pbandk.Message?): BytesValue = (plus as? BytesValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

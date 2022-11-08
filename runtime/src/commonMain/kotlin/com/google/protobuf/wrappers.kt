@file:OptIn(pbandk.PublicForGeneratedCode::class)

package com.google.protobuf

@pbandk.Export
public data class DoubleValue(
    val value: Double = 0.0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.DoubleValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DoubleValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.DoubleValue> {
        public val defaultInstance: com.google.protobuf.DoubleValue by lazy { com.google.protobuf.DoubleValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.DoubleValue = com.google.protobuf.DoubleValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.DoubleValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.DoubleValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "value",
                        value = com.google.protobuf.DoubleValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.DoubleValue",
                messageClass = com.google.protobuf.DoubleValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class FloatValue(
    val value: Float = 0.0F,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.FloatValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FloatValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.FloatValue> {
        public val defaultInstance: com.google.protobuf.FloatValue by lazy { com.google.protobuf.FloatValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.FloatValue = com.google.protobuf.FloatValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.FloatValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.FloatValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "value",
                        value = com.google.protobuf.FloatValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.FloatValue",
                messageClass = com.google.protobuf.FloatValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Int64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Int64Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Int64Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Int64Value> {
        public val defaultInstance: com.google.protobuf.Int64Value by lazy { com.google.protobuf.Int64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Int64Value = com.google.protobuf.Int64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Int64Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Int64Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "value",
                        value = com.google.protobuf.Int64Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Int64Value",
                messageClass = com.google.protobuf.Int64Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UInt64Value(
    val value: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.UInt64Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UInt64Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.UInt64Value> {
        public val defaultInstance: com.google.protobuf.UInt64Value by lazy { com.google.protobuf.UInt64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.UInt64Value = com.google.protobuf.UInt64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UInt64Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.UInt64Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "value",
                        value = com.google.protobuf.UInt64Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.UInt64Value",
                messageClass = com.google.protobuf.UInt64Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Int32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.Int32Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Int32Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.Int32Value> {
        public val defaultInstance: com.google.protobuf.Int32Value by lazy { com.google.protobuf.Int32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.Int32Value = com.google.protobuf.Int32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.Int32Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.Int32Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "value",
                        value = com.google.protobuf.Int32Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Int32Value",
                messageClass = com.google.protobuf.Int32Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UInt32Value(
    val value: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.UInt32Value = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UInt32Value> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.UInt32Value> {
        public val defaultInstance: com.google.protobuf.UInt32Value by lazy { com.google.protobuf.UInt32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.UInt32Value = com.google.protobuf.UInt32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.UInt32Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.UInt32Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "value",
                        value = com.google.protobuf.UInt32Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.UInt32Value",
                messageClass = com.google.protobuf.UInt32Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class BoolValue(
    val value: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.BoolValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.BoolValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.BoolValue> {
        public val defaultInstance: com.google.protobuf.BoolValue by lazy { com.google.protobuf.BoolValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.BoolValue = com.google.protobuf.BoolValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.BoolValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.BoolValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "value",
                        value = com.google.protobuf.BoolValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.BoolValue",
                messageClass = com.google.protobuf.BoolValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class StringValue(
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.StringValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.StringValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.StringValue> {
        public val defaultInstance: com.google.protobuf.StringValue by lazy { com.google.protobuf.StringValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.StringValue = com.google.protobuf.StringValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.StringValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.StringValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = com.google.protobuf.StringValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.StringValue",
                messageClass = com.google.protobuf.StringValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class BytesValue(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): com.google.protobuf.BytesValue = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.BytesValue> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<com.google.protobuf.BytesValue> {
        public val defaultInstance: com.google.protobuf.BytesValue by lazy { com.google.protobuf.BytesValue() }
        override fun decodeWith(u: pbandk.MessageDecoder): com.google.protobuf.BytesValue = com.google.protobuf.BytesValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<com.google.protobuf.BytesValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<com.google.protobuf.BytesValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = com.google.protobuf.BytesValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.BytesValue",
                messageClass = com.google.protobuf.BytesValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForDoubleValue")
public fun DoubleValue?.orDefault(): com.google.protobuf.DoubleValue = this ?: DoubleValue.defaultInstance

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
public fun FloatValue?.orDefault(): com.google.protobuf.FloatValue = this ?: FloatValue.defaultInstance

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
public fun Int64Value?.orDefault(): com.google.protobuf.Int64Value = this ?: Int64Value.defaultInstance

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
public fun UInt64Value?.orDefault(): com.google.protobuf.UInt64Value = this ?: UInt64Value.defaultInstance

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
public fun Int32Value?.orDefault(): com.google.protobuf.Int32Value = this ?: Int32Value.defaultInstance

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
public fun UInt32Value?.orDefault(): com.google.protobuf.UInt32Value = this ?: UInt32Value.defaultInstance

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
public fun BoolValue?.orDefault(): com.google.protobuf.BoolValue = this ?: BoolValue.defaultInstance

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
public fun StringValue?.orDefault(): com.google.protobuf.StringValue = this ?: StringValue.defaultInstance

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
public fun BytesValue?.orDefault(): com.google.protobuf.BytesValue = this ?: BytesValue.defaultInstance

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

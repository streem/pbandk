@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

import pbandk.EnumDescriptor
import pbandk.Message
import pbandk.gen.GeneratedEnumCompanion
import pbandk.gen.UnrecognizedEnumValue
import kotlin.Any

@pbandk.Export
@Suppress("ClassName")
public sealed interface NullValue : pbandk.Message.Enum {
    override val descriptor: EnumDescriptor<NullValue> get() = pbandk.wkt.NullValue.descriptor

    public object NULL_VALUE : NullValue, pbandk.gen.GeneratedEnumValue<pbandk.wkt.NullValue>(
        value = 0,
        name = "NULL_VALUE",
    )
    public class UNRECOGNIZED(
        override val value: Int? = null,
        override val name: String? = null,
    ) : NullValue, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.NullValue>() {
        // public companion object : UnrecognizedEnumValue.Companion<UNRECOGNIZED>(::UNRECOGNIZED)
    }

    public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.NullValue> {
        override val descriptor: pbandk.EnumDescriptor<NullValue> = pbandk.EnumDescriptor.of(
            fullName = "google.protobuf.NullValue",
            enumClass = pbandk.wkt.NullValue::class,
            enumCompanion = this,
        )

        public val values: List<NullValue> by lazy(LazyThreadSafetyMode.PUBLICATION) {
            listOf(NULL_VALUE)
        }

        override fun fromValue(value: Int): pbandk.wkt.NullValue =
            values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

        override fun fromName(name: String): pbandk.wkt.NullValue =
            values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
    }
}

public sealed interface Struct : pbandk.Message {
    public val fields: Map<String, pbandk.wkt.Value>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct>

    /**
     * The [MutableStruct] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit): pbandk.wkt.Struct

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        fields: Map<String, pbandk.wkt.Value> = this.fields,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Struct

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val fields: pbandk.FieldDescriptor<pbandk.wkt.Struct, Map<String, pbandk.wkt.Value>> =
            pbandk.FieldDescriptor.ofMap(
                messageMetadata = pbandk.wkt.Struct.messageMetadata,
                messageDescriptor = pbandk.wkt.Struct::descriptor,
                name = "fields",
                number = 1,
                keyType = pbandk.internal.types.primitive.String,
                valueType = pbandk.wkt.Value.descriptor.valueType,
                jsonName = "fields",
                value = pbandk.wkt.Struct::fields,
                mutableValue = pbandk.wkt.MutableStruct::fields,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        override val defaultInstance: pbandk.wkt.Struct by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Struct {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "google.protobuf.Struct",
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.Struct::class,
                messageCompanion = this,
                builder = ::Struct,
                fields = listOf(
                    pbandk.wkt.Struct.FieldDescriptors.fields,
                ),
            )
        }
    }
}

public sealed interface MutableStruct : pbandk.wkt.Struct, pbandk.MutableMessage<pbandk.wkt.Struct> {
    public override val fields: MutableMap<String, pbandk.wkt.Value>
}

public sealed interface Value : pbandk.Message {
    public val kind: Kind<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value>

    /**
     * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit): pbandk.wkt.Value

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        kind: pbandk.wkt.Value.Kind<*>? = this.kind,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Value

    public val nullValue: pbandk.wkt.NullValue?
    public val numberValue: Double?
    public val stringValue: String?
    public val boolValue: Boolean?
    public val structValue: pbandk.wkt.Struct?
    public val listValue: pbandk.wkt.ListValue?

    public sealed interface Kind<V : kotlin.Any> : pbandk.Message.OneOf<V> {
        public class NullValue(nullValue: pbandk.wkt.NullValue = pbandk.wkt.NullValue.fromValue(0)) :
            Kind<pbandk.wkt.NullValue>, pbandk.gen.GeneratedOneOf<pbandk.wkt.Value, pbandk.wkt.NullValue>(nullValue, pbandk.wkt.Value.FieldDescriptors.nullValue)
        public class NumberValue(numberValue: Double = 0.0) :
            Kind<Double>, pbandk.gen.GeneratedOneOf<pbandk.wkt.Value, Double>(numberValue, pbandk.wkt.Value.FieldDescriptors.numberValue)
        public class StringValue(stringValue: String = "") :
            Kind<String>, pbandk.gen.GeneratedOneOf<pbandk.wkt.Value, String>(stringValue, pbandk.wkt.Value.FieldDescriptors.stringValue)
        public class BoolValue(boolValue: Boolean = false) :
            Kind<Boolean>, pbandk.gen.GeneratedOneOf<pbandk.wkt.Value, Boolean>(boolValue, pbandk.wkt.Value.FieldDescriptors.boolValue)
        public class StructValue(structValue: pbandk.wkt.Struct) :
            Kind<pbandk.wkt.Struct>, pbandk.gen.GeneratedOneOf<pbandk.wkt.Value, pbandk.wkt.Struct>(structValue, pbandk.wkt.Value.FieldDescriptors.structValue)
        public class ListValue(listValue: pbandk.wkt.ListValue) :
            Kind<pbandk.wkt.ListValue>, pbandk.gen.GeneratedOneOf<pbandk.wkt.Value, pbandk.wkt.ListValue>(listValue, pbandk.wkt.Value.FieldDescriptors.listValue)
    }

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val nullValue: pbandk.FieldDescriptor<pbandk.wkt.Value, pbandk.wkt.NullValue?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "null_value",
                number = 1,
                type = pbandk.FieldDescriptor.Type.enum(enumCompanion = pbandk.wkt.NullValue.Companion, hasPresence = true),
                jsonName = "nullValue",
                value = pbandk.wkt.Value::nullValue,
                mutableValue = pbandk.wkt.MutableValue::nullValue,
            )
        public val numberValue: pbandk.FieldDescriptor<pbandk.wkt.Value, Double?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "number_value",
                number = 2,
                type = pbandk.FieldDescriptor.Type.double(hasPresence = true),
                jsonName = "numberValue",
                value = pbandk.wkt.Value::numberValue,
                mutableValue = pbandk.wkt.MutableValue::numberValue,
            )
        public val stringValue: pbandk.FieldDescriptor<pbandk.wkt.Value, String?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "string_value",
                number = 3,
                type = pbandk.FieldDescriptor.Type.string(hasPresence = true),
                jsonName = "stringValue",
                value = pbandk.wkt.Value::stringValue,
                mutableValue = pbandk.wkt.MutableValue::stringValue,
            )
        public val boolValue: pbandk.FieldDescriptor<pbandk.wkt.Value, Boolean?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "bool_value",
                number = 4,
                type = pbandk.FieldDescriptor.Type.bool(hasPresence = true),
                jsonName = "boolValue",
                value = pbandk.wkt.Value::boolValue,
                mutableValue = pbandk.wkt.MutableValue::boolValue,
            )
        public val structValue: pbandk.FieldDescriptor<pbandk.wkt.Value, pbandk.wkt.Struct?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "struct_value",
                number = 5,
                type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.wkt.Struct.Companion),
                jsonName = "structValue",
                value = pbandk.wkt.Value::structValue,
                mutableValue = pbandk.wkt.MutableValue::structValue,
            )
        public val listValue: pbandk.FieldDescriptor<pbandk.wkt.Value, pbandk.wkt.ListValue?> =
            pbandk.FieldDescriptor.ofOneof(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "list_value",
                number = 6,
                type = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.wkt.ListValue.Companion),
                jsonName = "listValue",
                value = pbandk.wkt.Value::listValue,
                mutableValue = pbandk.wkt.MutableValue::listValue,
            )

        public val kind: pbandk.OneofDescriptor<pbandk.wkt.Value, pbandk.wkt.Value.Kind<*>> =
            pbandk.OneofDescriptor.of(
                messageDescriptor = pbandk.wkt.Value::descriptor,
                name = "kind",
                value = pbandk.wkt.Value::kind,
                mutableValue = pbandk.wkt.MutableValue::kind,
                fields = listOf(
                    nullValue,
                    numberValue,
                    stringValue,
                    boolValue,
                    structValue,
                    listValue,
                )
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.Value> {
        public val defaultInstance: pbandk.wkt.Value by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.Value {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.Value",
                messageClass = pbandk.wkt.Value::class,
                messageCompanion = this,
                builder = ::Value,
                oneofs = listOf(
                    pbandk.wkt.Value.FieldDescriptors.kind,
                ),
            )
        }
    }
}

public sealed interface MutableValue : pbandk.wkt.Value, pbandk.MutableMessage<pbandk.wkt.Value> {
    public override var kind: Value.Kind<*>?

    public override var nullValue: pbandk.wkt.NullValue?
    public override var numberValue: Double?
    public override var stringValue: String?
    public override var boolValue: Boolean?
    public override var structValue: pbandk.wkt.Struct?
    public override var listValue: pbandk.wkt.ListValue?
}

public sealed interface ListValue : pbandk.Message {
    public val values: List<pbandk.wkt.Value>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ListValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue>

    /**
     * The [MutableListValue] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit): pbandk.wkt.ListValue

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        values: List<pbandk.wkt.Value> = this.values,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.ListValue

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val values: pbandk.FieldDescriptor<pbandk.wkt.ListValue, List<pbandk.wkt.Value>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.wkt.ListValue::descriptor,
                name = "values",
                number = 1,
                type = pbandk.FieldDescriptor.Type.repeated(valueType = pbandk.FieldDescriptor.Type.message(messageCompanion = pbandk.wkt.Value.Companion)),
                jsonName = "values",
                value = pbandk.wkt.ListValue::values,
                mutableValue = pbandk.wkt.MutableListValue::values,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        public val defaultInstance: pbandk.wkt.ListValue by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.ListValue {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "google.protobuf.ListValue",
                messageClass = pbandk.wkt.ListValue::class,
                messageCompanion = this,
                builder = ::ListValue,
                fields = listOf(
                    pbandk.wkt.ListValue.FieldDescriptors.values,
                ),
            )
        }
    }
}

public sealed interface MutableListValue : pbandk.wkt.ListValue, pbandk.MutableMessage<pbandk.wkt.ListValue> {
    public override val values: MutableList<pbandk.wkt.Value>
}

@Deprecated(
    message = "Use Struct { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Struct"],
        expression = "Struct {\nthis.fields += fields\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Struct(
    fields: Map<String, pbandk.wkt.Value> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Struct = pbandk.wkt.Struct {
    this.fields += fields
    this.unknownFields += unknownFields
}

/**
 * The [MutableStruct] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildStruct")
public fun Struct(builderAction: pbandk.wkt.MutableStruct.() -> Unit): pbandk.wkt.Struct =
    pbandk.wkt.MutableStruct_Impl(
        fields = pbandk.gen.MutableMapField(pbandk.wkt.Struct.FieldDescriptors.fields),
    ).also(builderAction).toStruct()

@pbandk.Export
@pbandk.JsName("orDefaultForStruct")
public fun Struct?.orDefault(): pbandk.wkt.Struct = this ?: pbandk.wkt.Struct.defaultInstance

private class Struct_Impl(
    override val fields: pbandk.gen.MapField<String, pbandk.wkt.Value>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Struct, pbandk.gen.GeneratedMessage<pbandk.wkt.Struct>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Struct.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fields: Map<String, pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Struct {
        this.fields += fields
        this.unknownFields += unknownFields
    }
}

private class MutableStruct_Impl(
    override val fields: pbandk.gen.MutableMapField<String, pbandk.wkt.Value>,
) : pbandk.wkt.MutableStruct, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Struct>() {
    override val descriptor get() = pbandk.wkt.Struct.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableStruct.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        fields: Map<String, pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toStruct() = Struct_Impl(
        fields = fields.toMapField(),
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use Value { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.Value"],
        expression = "Value {\nthis.kind = kind\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Value(
    kind: pbandk.wkt.Value.Kind<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Value = pbandk.wkt.Value {
    this.kind = kind
    this.unknownFields += unknownFields
}

/**
 * The [MutableValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildValue")
public fun Value(builderAction: pbandk.wkt.MutableValue.() -> Unit): pbandk.wkt.Value =
    pbandk.wkt.MutableValue_Impl(
        kind = null,
    ).also(builderAction).toValue()

@pbandk.Export
@pbandk.JsName("orDefaultForValue")
public fun Value?.orDefault(): pbandk.wkt.Value = this ?: pbandk.wkt.Value.defaultInstance

private class Value_Impl(
    override val kind: pbandk.wkt.Value.Kind<*>?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Value, pbandk.gen.GeneratedMessage<pbandk.wkt.Value>(unknownFields) {
    override val descriptor get() = pbandk.wkt.Value.descriptor

    override val nullValue: pbandk.wkt.NullValue?
        get() = (kind as? pbandk.wkt.Value.Kind.NullValue)?.value
    override val numberValue: Double?
        get() = (kind as? pbandk.wkt.Value.Kind.NumberValue)?.value
    override val stringValue: String?
        get() = (kind as? pbandk.wkt.Value.Kind.StringValue)?.value
    override val boolValue: Boolean?
        get() = (kind as? pbandk.wkt.Value.Kind.BoolValue)?.value
    override val structValue: pbandk.wkt.Struct?
        get() = (kind as? pbandk.wkt.Value.Kind.StructValue)?.value
    override val listValue: pbandk.wkt.ListValue?
        get() = (kind as? pbandk.wkt.Value.Kind.ListValue)?.value

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.Value {
        this.kind = kind
        this.unknownFields += unknownFields
    }
}

private class MutableValue_Impl(
    override var kind: pbandk.wkt.Value.Kind<*>?,
) : pbandk.wkt.MutableValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.Value>() {
    override val descriptor get() = pbandk.wkt.Value.descriptor

    override var nullValue: pbandk.wkt.NullValue?
        get() = (kind as? pbandk.wkt.Value.Kind.NullValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.NullValue(it) } }
    override var numberValue: Double?
        get() = (kind as? pbandk.wkt.Value.Kind.NumberValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.NumberValue(it) } }
    override var stringValue: String?
        get() = (kind as? pbandk.wkt.Value.Kind.StringValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.StringValue(it) } }
    override var boolValue: Boolean?
        get() = (kind as? pbandk.wkt.Value.Kind.BoolValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.BoolValue(it) } }
    override var structValue: pbandk.wkt.Struct?
        get() = (kind as? pbandk.wkt.Value.Kind.StructValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.StructValue(it) } }
    override var listValue: pbandk.wkt.ListValue?
        get() = (kind as? pbandk.wkt.Value.Kind.ListValue)?.value
        set(value) { kind = value?.let { pbandk.wkt.Value.Kind.ListValue(it) } }

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        kind: pbandk.wkt.Value.Kind<*>?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toValue() = Value_Impl(
        kind = kind,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use ListValue { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.ListValue"],
        expression = "ListValue {\nthis.values += values\nthis.unknownFields += unknownFields\n}",
    )
)
public fun ListValue(
    values: List<pbandk.wkt.Value> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.ListValue = pbandk.wkt.ListValue {
    this.values += values
    this.unknownFields += unknownFields
}

/**
 * The [MutableListValue] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildListValue")
public fun ListValue(builderAction: pbandk.wkt.MutableListValue.() -> Unit): pbandk.wkt.ListValue =
    pbandk.wkt.MutableListValue_Impl(
        values = pbandk.gen.MutableListField(pbandk.wkt.ListValue.FieldDescriptors.values),
    ).also(builderAction).toListValue()

@pbandk.Export
@pbandk.JsName("orDefaultForListValue")
public fun ListValue?.orDefault(): pbandk.wkt.ListValue = this ?: pbandk.wkt.ListValue.defaultInstance

private class ListValue_Impl(
    override val values: pbandk.gen.ListField<pbandk.wkt.Value>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.ListValue, pbandk.gen.GeneratedMessage<pbandk.wkt.ListValue>(unknownFields) {
    override val descriptor get() = pbandk.wkt.ListValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.wkt.ListValue {
        this.values += values
        this.unknownFields += unknownFields
    }
}

private class MutableListValue_Impl(
    override val values: pbandk.gen.MutableListField<pbandk.wkt.Value>,
) : pbandk.wkt.MutableListValue, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.ListValue>() {
    override val descriptor get() = pbandk.wkt.ListValue.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableListValue.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        values: List<pbandk.wkt.Value>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toListValue() = ListValue_Impl(
        values = values.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

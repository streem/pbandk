@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public data class JavaFeatures(
    val legacyClosedEnum: Boolean? = null,
    val utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.wkt.JavaFeatures = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.JavaFeatures> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.wkt.JavaFeatures> {
        public val defaultInstance: pbandk.wkt.JavaFeatures by lazy { pbandk.wkt.JavaFeatures() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.JavaFeatures = pbandk.wkt.JavaFeatures.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.JavaFeatures> = pbandk.MessageDescriptor(
            fullName = "pb.JavaFeatures",
            messageClass = pbandk.wkt.JavaFeatures::class,
            messageCompanion = this,
            fields = buildList(2) {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "legacy_closed_enum",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "legacyClosedEnum",
                        value = pbandk.wkt.JavaFeatures::legacyClosedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "utf8_validation",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.JavaFeatures.Utf8Validation.Companion, hasPresence = true),
                        jsonName = "utf8Validation",
                        value = pbandk.wkt.JavaFeatures::utf8Validation
                    )
                )
            }
        )
    }

    public sealed class Utf8Validation(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.wkt.JavaFeatures.Utf8Validation && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "JavaFeatures.Utf8Validation.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object UTF8_VALIDATION_UNKNOWN : Utf8Validation(0, "UTF8_VALIDATION_UNKNOWN")
        public object DEFAULT : Utf8Validation(1, "DEFAULT")
        public object VERIFY : Utf8Validation(2, "VERIFY")
        public class UNRECOGNIZED(value: Int) : Utf8Validation(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.JavaFeatures.Utf8Validation> {
            public val values: List<pbandk.wkt.JavaFeatures.Utf8Validation> by lazy { listOf(UTF8_VALIDATION_UNKNOWN, DEFAULT, VERIFY) }
            override fun fromValue(value: Int): pbandk.wkt.JavaFeatures.Utf8Validation = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String): pbandk.wkt.JavaFeatures.Utf8Validation = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Utf8Validation with name: $name")
        }
    }
}

public val pbandk.wkt.FeatureSet.java: pbandk.wkt.JavaFeatures?
    get() = getExtension(pbandk.wkt.java)

@pbandk.Export
public val java: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.JavaFeatures?> = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.FeatureSet.Companion::descriptor,
    name = "java",
    number = 1001,
    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.JavaFeatures.Companion),
    jsonName = "java",
    value = pbandk.wkt.FeatureSet::java
)

@pbandk.Export
@pbandk.JsName("orDefaultForJavaFeatures")
public fun JavaFeatures?.orDefault(): pbandk.wkt.JavaFeatures = this ?: JavaFeatures.defaultInstance

private fun JavaFeatures.protoMergeImpl(plus: pbandk.Message?): JavaFeatures = (plus as? JavaFeatures)?.let {
    it.copy(
        legacyClosedEnum = plus.legacyClosedEnum ?: legacyClosedEnum,
        utf8Validation = plus.utf8Validation ?: utf8Validation,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun JavaFeatures.Companion.decodeWithImpl(u: pbandk.MessageDecoder): JavaFeatures {
    var legacyClosedEnum: Boolean? = null
    var utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> legacyClosedEnum = _fieldValue as Boolean
            2 -> utf8Validation = _fieldValue as pbandk.wkt.JavaFeatures.Utf8Validation
        }
    }

    return JavaFeatures(legacyClosedEnum, utf8Validation, unknownFields)
}

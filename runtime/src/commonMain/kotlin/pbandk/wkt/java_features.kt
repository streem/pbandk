@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface JavaFeatures : pbandk.Message {
    public val legacyClosedEnum: Boolean?
    public val utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.JavaFeatures
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.JavaFeatures>

    /**
     * The [MutableJavaFeatures] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableJavaFeatures.() -> Unit): pbandk.wkt.JavaFeatures

    @Deprecated("Use copy { } instead")
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        legacyClosedEnum: Boolean? = this.legacyClosedEnum,
        utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation? = this.utf8Validation,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.JavaFeatures

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val legacyClosedEnum: pbandk.FieldDescriptor<pbandk.wkt.JavaFeatures, Boolean?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.JavaFeatures::descriptor,
                messageMetadata = pbandk.wkt.JavaFeatures.messageMetadata,
                name = "legacy_closed_enum",
                number = 1,
                valueType = pbandk.types.bool(),
                jsonName = "legacyClosedEnum",
                value = pbandk.wkt.JavaFeatures::legacyClosedEnum,
                mutableValue = pbandk.wkt.MutableJavaFeatures::legacyClosedEnum,
            )
        public val utf8Validation: pbandk.FieldDescriptor<pbandk.wkt.JavaFeatures, pbandk.wkt.JavaFeatures.Utf8Validation?> =
            pbandk.FieldDescriptor.ofOptional(
                messageDescriptor = pbandk.wkt.JavaFeatures::descriptor,
                messageMetadata = pbandk.wkt.JavaFeatures.messageMetadata,
                name = "utf8_validation",
                number = 2,
                valueType = pbandk.types.enum(pbandk.wkt.JavaFeatures.Utf8Validation),
                jsonName = "utf8Validation",
                value = pbandk.wkt.JavaFeatures::utf8Validation,
                mutableValue = pbandk.wkt.MutableJavaFeatures::utf8Validation,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.wkt.JavaFeatures>() {
        override val defaultInstance: pbandk.wkt.JavaFeatures by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.wkt.JavaFeatures {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pb.JavaFeatures",
            syntax = pbandk.wkt.Syntax.PROTO2,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.JavaFeatures> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.wkt.JavaFeatures::class,
                messageCompanion = this,
                builder = ::JavaFeatures,
                fields = listOf(
                    pbandk.wkt.JavaFeatures.FieldDescriptors.legacyClosedEnum,
                    pbandk.wkt.JavaFeatures.FieldDescriptors.utf8Validation,
                ),
            )
        }
    }

    public sealed interface Utf8Validation : pbandk.Message.Enum {
        override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.JavaFeatures.Utf8Validation>
            get() = pbandk.wkt.JavaFeatures.Utf8Validation.descriptor

        public object UTF8_VALIDATION_UNKNOWN : Utf8Validation, pbandk.gen.GeneratedEnumValue<pbandk.wkt.JavaFeatures.Utf8Validation>(
            value = 0,
            name = "UTF8_VALIDATION_UNKNOWN",
        )
        public object DEFAULT : Utf8Validation, pbandk.gen.GeneratedEnumValue<pbandk.wkt.JavaFeatures.Utf8Validation>(
            value = 1,
            name = "DEFAULT",
        )
        public object VERIFY : Utf8Validation, pbandk.gen.GeneratedEnumValue<pbandk.wkt.JavaFeatures.Utf8Validation>(
            value = 2,
            name = "VERIFY",
        )
        public class UNRECOGNIZED(value: Int? = null, name: String? = null)
            : Utf8Validation, pbandk.gen.UnrecognizedEnumValue<pbandk.wkt.JavaFeatures.Utf8Validation>(value, name)

        public companion object : pbandk.Message.Enum.Companion<pbandk.wkt.JavaFeatures.Utf8Validation> {
            override val descriptor: pbandk.EnumDescriptor<pbandk.wkt.JavaFeatures.Utf8Validation> =
                pbandk.EnumDescriptor.of(
                    fullName = "pb.JavaFeatures.Utf8Validation",
                    enumClass = pbandk.wkt.JavaFeatures.Utf8Validation::class,
                    enumCompanion = this,
                )
            public val values: List<JavaFeatures.Utf8Validation> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(UTF8_VALIDATION_UNKNOWN, DEFAULT, VERIFY)
            }

            override fun fromValue(value: Int): pbandk.wkt.JavaFeatures.Utf8Validation =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value = value)

            override fun fromName(name: String): pbandk.wkt.JavaFeatures.Utf8Validation =
                values.firstOrNull { it.name == name } ?: UNRECOGNIZED(name = name)
        }
    }
}

public sealed interface MutableJavaFeatures : pbandk.wkt.JavaFeatures, pbandk.MutableMessage<pbandk.wkt.JavaFeatures> {
    public override var legacyClosedEnum: Boolean?
    public override var utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation?
}

public val pbandk.wkt.FeatureSet.java: pbandk.wkt.JavaFeatures?
    get() = pbandk.wkt.java.getValue(this)

public var pbandk.wkt.MutableFeatureSet.java: pbandk.wkt.JavaFeatures?
    get() = pbandk.wkt.java.getValue(this)
    set(value) = pbandk.wkt.java.setValue(this, value)

@pbandk.Export
public val java: pbandk.FieldDescriptor<pbandk.wkt.FeatureSet, pbandk.wkt.JavaFeatures?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.FeatureSet::descriptor,
        fullName = "pb.java",
        number = 1001,
        valueType = pbandk.types.message(pbandk.wkt.JavaFeatures),
        jsonName = "java",
    )

@Deprecated(
    message = "Use JavaFeatures { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.wkt.JavaFeatures"],
        expression = "JavaFeatures {\nthis.legacyClosedEnum = legacyClosedEnum\nthis.utf8Validation = utf8Validation\nthis.unknownFields += unknownFields\n}",
    )
)
public fun JavaFeatures(
    legacyClosedEnum: Boolean? = null,
    utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.JavaFeatures = pbandk.wkt.JavaFeatures {
    this.legacyClosedEnum = legacyClosedEnum
    this.utf8Validation = utf8Validation
    this.unknownFields += unknownFields
}

/**
 * The [MutableJavaFeatures] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildJavaFeatures")
public fun JavaFeatures(builderAction: pbandk.wkt.MutableJavaFeatures.() -> Unit): pbandk.wkt.JavaFeatures =
    pbandk.wkt.MutableJavaFeatures_Impl(
        legacyClosedEnum = null,
        utf8Validation = null,
    ).also(builderAction).toJavaFeatures()

@pbandk.Export
@pbandk.JsName("orDefaultForJavaFeatures")
public fun JavaFeatures?.orDefault(): pbandk.wkt.JavaFeatures = this ?: pbandk.wkt.JavaFeatures.defaultInstance

private class JavaFeatures_Impl(
    override val legacyClosedEnum: Boolean?,
    override val utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.JavaFeatures, pbandk.gen.GeneratedMessage<pbandk.wkt.JavaFeatures>(unknownFields) {
    override val descriptor get() = pbandk.wkt.JavaFeatures.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableJavaFeatures.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        legacyClosedEnum: Boolean?,
        utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.JavaFeatures = pbandk.wkt.JavaFeatures {
        this.legacyClosedEnum = legacyClosedEnum
        this.utf8Validation = utf8Validation
        this.unknownFields += unknownFields
    }
}

private class MutableJavaFeatures_Impl(
    override var legacyClosedEnum: Boolean?,
    override var utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation?,
) : pbandk.wkt.MutableJavaFeatures, pbandk.gen.MutableGeneratedMessage<pbandk.wkt.JavaFeatures>() {
    override val descriptor get() = pbandk.wkt.JavaFeatures.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.wkt.MutableJavaFeatures.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        legacyClosedEnum: Boolean?,
        utf8Validation: pbandk.wkt.JavaFeatures.Utf8Validation?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ): pbandk.wkt.JavaFeatures = throw UnsupportedOperationException()

    fun toJavaFeatures() = JavaFeatures_Impl(
        legacyClosedEnum = legacyClosedEnum,
        utf8Validation = utf8Validation,
        unknownFields = unknownFields.toMap()
    )
}

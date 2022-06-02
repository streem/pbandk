@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface SingleRequiredCustomOption : pbandk.Message {
    public val single: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption>

    /**
     * The [MutableSingleRequiredCustomOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.SingleRequiredCustomOption

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        single: String = this.single,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SingleRequiredCustomOption

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val single: pbandk.FieldDescriptor<pbandk.testpb.SingleRequiredCustomOption, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.testpb.SingleRequiredCustomOption::descriptor,
                messageMetadata = pbandk.testpb.SingleRequiredCustomOption.messageMetadata,
                name = "single",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "single",
                options = pbandk.wkt.FieldOptions {
                    unknownFields += mapOf(
                        1071 to pbandk.UnknownField(
                            fieldNum = 1071,
                            values = listOf(
                                pbandk.UnknownField.Value(wireValue = pbandk.internal.binary.WireValue.Len(byteArrayOf(-118, 1, 2, 16, 1))),
                            )
                        ),
                    )
                },
                value = pbandk.testpb.SingleRequiredCustomOption::single,
                mutableValue = pbandk.testpb.MutableSingleRequiredCustomOption::single,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption>() {
        override val defaultInstance: pbandk.testpb.SingleRequiredCustomOption by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.SingleRequiredCustomOption {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.SingleRequiredCustomOption",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.SingleRequiredCustomOption::class,
                messageCompanion = this,
                builder = ::SingleRequiredCustomOption,
                fields = listOf(
                    pbandk.testpb.SingleRequiredCustomOption.FieldDescriptors.single,
                ),
            )
        }
    }
}

public sealed interface MutableSingleRequiredCustomOption : pbandk.testpb.SingleRequiredCustomOption, pbandk.MutableMessage<pbandk.testpb.SingleRequiredCustomOption> {
    public override var single: String
}

public sealed interface MultipleCustomOptions : pbandk.Message {
    public val multiple: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions>

    /**
     * The [MutableMultipleCustomOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MultipleCustomOptions

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        multiple: String = this.multiple,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptions

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val multiple: pbandk.FieldDescriptor<pbandk.testpb.MultipleCustomOptions, String> =
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.testpb.MultipleCustomOptions::descriptor,
                messageMetadata = pbandk.testpb.MultipleCustomOptions.messageMetadata,
                name = "multiple",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "multiple",
                options = pbandk.wkt.FieldOptions {
                    unknownFields += mapOf(
                        1071 to pbandk.UnknownField(
                            fieldNum = 1071,
                            values = listOf(
                                pbandk.UnknownField.Value(wireValue = pbandk.internal.binary.WireValue.Len(byteArrayOf(-118, 1, 2, 16, 1))),
                                pbandk.UnknownField.Value(wireValue = pbandk.internal.binary.WireValue.Len(byteArrayOf(114, 2, 16, 10))),
                            )
                        ),
                    )
                },
                value = pbandk.testpb.MultipleCustomOptions::multiple,
                mutableValue = pbandk.testpb.MutableMultipleCustomOptions::multiple,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions>() {
        override val defaultInstance: pbandk.testpb.MultipleCustomOptions by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MultipleCustomOptions {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.MultipleCustomOptions",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MultipleCustomOptions::class,
                messageCompanion = this,
                builder = ::MultipleCustomOptions,
                fields = listOf(
                    pbandk.testpb.MultipleCustomOptions.FieldDescriptors.multiple,
                ),
            )
        }
    }
}

public sealed interface MutableMultipleCustomOptions : pbandk.testpb.MultipleCustomOptions, pbandk.MutableMessage<pbandk.testpb.MultipleCustomOptions> {
    public override var multiple: String
}

public sealed interface MultipleCustomOptionsPlusDeprecated : pbandk.Message {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public val multipleDeprecated: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>

    /**
     * The [MutableMultipleCustomOptionsPlusDeprecated] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        multipleDeprecated: String = @Suppress("DEPRECATION") this.multipleDeprecated,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val multipleDeprecated: pbandk.FieldDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated, String> =
            @Suppress("DEPRECATION")
            pbandk.FieldDescriptor.ofSingular(
                messageDescriptor = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::descriptor,
                messageMetadata = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.messageMetadata,
                name = "multiple_deprecated",
                number = 1,
                valueType = pbandk.types.string(),
                jsonName = "multipleDeprecated",
                options = pbandk.wkt.FieldOptions {
                    deprecated = true
                    unknownFields += mapOf(
                        1071 to pbandk.UnknownField(
                            fieldNum = 1071,
                            values = listOf(
                                pbandk.UnknownField.Value(wireValue = pbandk.internal.binary.WireValue.Len(byteArrayOf(114, 2, 24, 32))),
                                pbandk.UnknownField.Value(wireValue = pbandk.internal.binary.WireValue.Len(byteArrayOf(114, 2, 16, 10))),
                            )
                        ),
                    )
                },
                value = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::multipleDeprecated,
                mutableValue = pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated::multipleDeprecated,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>() {
        override val defaultInstance: pbandk.testpb.MultipleCustomOptionsPlusDeprecated by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.testpb.MultipleCustomOptionsPlusDeprecated {}
        }

        private val messageMetadata = pbandk.MessageMetadata(
            fullName = "pbandk.testpb.MultipleCustomOptionsPlusDeprecated",
            syntax = pbandk.wkt.Syntax.PROTO3,
        )

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> by lazy {
            pbandk.MessageDescriptor.of(
                metadata = messageMetadata,
                messageClass = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::class,
                messageCompanion = this,
                builder = ::MultipleCustomOptionsPlusDeprecated,
                fields = listOf(
                    pbandk.testpb.MultipleCustomOptionsPlusDeprecated.FieldDescriptors.multipleDeprecated,
                ),
            )
        }
    }
}

public sealed interface MutableMultipleCustomOptionsPlusDeprecated : pbandk.testpb.MultipleCustomOptionsPlusDeprecated, pbandk.MutableMessage<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public override var multipleDeprecated: String
}

@Deprecated(
    message = "Use SingleRequiredCustomOption { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.SingleRequiredCustomOption"],
        expression = "SingleRequiredCustomOption {\nthis.single = single\nthis.unknownFields += unknownFields\n}",
    )
)
public fun SingleRequiredCustomOption(
    single: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.SingleRequiredCustomOption {
    this.single = single
    this.unknownFields += unknownFields
}

/**
 * The [MutableSingleRequiredCustomOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildSingleRequiredCustomOption")
public fun SingleRequiredCustomOption(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.SingleRequiredCustomOption =
    pbandk.testpb.MutableSingleRequiredCustomOption_Impl(
        single = "",
    ).also(builderAction).toSingleRequiredCustomOption()

@pbandk.Export
@pbandk.JsName("orDefaultForSingleRequiredCustomOption")
public fun SingleRequiredCustomOption?.orDefault(): pbandk.testpb.SingleRequiredCustomOption = this ?: pbandk.testpb.SingleRequiredCustomOption.defaultInstance

private class SingleRequiredCustomOption_Impl(
    override val single: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SingleRequiredCustomOption, pbandk.gen.GeneratedMessage<pbandk.testpb.SingleRequiredCustomOption>(unknownFields) {
    override val descriptor get() = pbandk.testpb.SingleRequiredCustomOption.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SingleRequiredCustomOption {
        this.single = single
        this.unknownFields += unknownFields
    }
}

private class MutableSingleRequiredCustomOption_Impl(
    override var single: String,
) : pbandk.testpb.MutableSingleRequiredCustomOption, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.SingleRequiredCustomOption>() {
    override val descriptor get() = pbandk.testpb.SingleRequiredCustomOption.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toSingleRequiredCustomOption() = SingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MultipleCustomOptions { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MultipleCustomOptions"],
        expression = "MultipleCustomOptions {\nthis.multiple = multiple\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MultipleCustomOptions(
    multiple: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MultipleCustomOptions {
    this.multiple = multiple
    this.unknownFields += unknownFields
}

/**
 * The [MutableMultipleCustomOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMultipleCustomOptions")
public fun MultipleCustomOptions(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MultipleCustomOptions =
    pbandk.testpb.MutableMultipleCustomOptions_Impl(
        multiple = "",
    ).also(builderAction).toMultipleCustomOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptions")
public fun MultipleCustomOptions?.orDefault(): pbandk.testpb.MultipleCustomOptions = this ?: pbandk.testpb.MultipleCustomOptions.defaultInstance

private class MultipleCustomOptions_Impl(
    override val multiple: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MultipleCustomOptions, pbandk.gen.GeneratedMessage<pbandk.testpb.MultipleCustomOptions>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptions {
        this.multiple = multiple
        this.unknownFields += unknownFields
    }
}

private class MutableMultipleCustomOptions_Impl(
    override var multiple: String,
) : pbandk.testpb.MutableMultipleCustomOptions, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MultipleCustomOptions>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptions.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMultipleCustomOptions() = MultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use MultipleCustomOptionsPlusDeprecated { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.testpb.MultipleCustomOptionsPlusDeprecated"],
        expression = "MultipleCustomOptionsPlusDeprecated {\nthis.multipleDeprecated = multipleDeprecated\nthis.unknownFields += unknownFields\n}",
    )
)
public fun MultipleCustomOptionsPlusDeprecated(
    multipleDeprecated: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
    @Suppress("DEPRECATION")
    this.multipleDeprecated = multipleDeprecated
    this.unknownFields += unknownFields
}

/**
 * The [MutableMultipleCustomOptionsPlusDeprecated] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MultipleCustomOptionsPlusDeprecated =
    pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = "",
    ).also(builderAction).toMultipleCustomOptionsPlusDeprecated()

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated?.orDefault(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = this ?: pbandk.testpb.MultipleCustomOptionsPlusDeprecated.defaultInstance

private class MultipleCustomOptionsPlusDeprecated_Impl(
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    override val multipleDeprecated: String,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MultipleCustomOptionsPlusDeprecated, pbandk.gen.GeneratedMessage<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>(unknownFields) {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = multipleDeprecated
        this.unknownFields += unknownFields
    }
}

private class MutableMultipleCustomOptionsPlusDeprecated_Impl(
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    override var multipleDeprecated: String,
) : pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toMultipleCustomOptionsPlusDeprecated() = MultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = @Suppress("DEPRECATION") multipleDeprecated,
        unknownFields = unknownFields.toMap()
    )
}

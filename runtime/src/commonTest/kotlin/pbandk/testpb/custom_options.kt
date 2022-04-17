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

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        public val defaultInstance: pbandk.testpb.SingleRequiredCustomOption by lazy { pbandk.testpb.SingleRequiredCustomOption {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SingleRequiredCustomOption, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "single",
                        options = pbandk.wkt.FieldOptions {
                            unknownFields += mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(5, -118, 1, 2, 16, 1))
                                    )
                                )
                            )
                        },
                        value = pbandk.testpb.SingleRequiredCustomOption::single,
                        mutableValue = pbandk.testpb.MutableSingleRequiredCustomOption::single,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.SingleRequiredCustomOption",
                messageClass = pbandk.testpb.SingleRequiredCustomOption::class,
                messageCompanion = this,
                builder = ::SingleRequiredCustomOption,
                fields = fieldsList
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

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        public val defaultInstance: pbandk.testpb.MultipleCustomOptions by lazy { pbandk.testpb.MultipleCustomOptions {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MultipleCustomOptions, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "multiple",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "multiple",
                        options = pbandk.wkt.FieldOptions {
                            unknownFields += mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(5, -118, 1, 2, 16, 1)),
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 16, 10))
                                    )
                                )
                            )
                        },
                        value = pbandk.testpb.MultipleCustomOptions::multiple,
                        mutableValue = pbandk.testpb.MutableMultipleCustomOptions::multiple,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.MultipleCustomOptions",
                messageClass = pbandk.testpb.MultipleCustomOptions::class,
                messageCompanion = this,
                builder = ::MultipleCustomOptions,
                fields = fieldsList
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

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        public val defaultInstance: pbandk.testpb.MultipleCustomOptionsPlusDeprecated by lazy { pbandk.testpb.MultipleCustomOptionsPlusDeprecated {} }

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated, *>>(1)
            fieldsList.apply {
                @Suppress("DEPRECATION")
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "multiple_deprecated",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "multipleDeprecated",
                        options = pbandk.wkt.FieldOptions {
                            deprecated = true
                            unknownFields += mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 24, 32)),
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 16, 10))
                                    )
                                )
                            )
                        },
                        value = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::multipleDeprecated,
                        mutableValue = pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated::multipleDeprecated,
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.MultipleCustomOptionsPlusDeprecated",
                messageClass = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::class,
                messageCompanion = this,
                builder = ::MultipleCustomOptionsPlusDeprecated,
                fields = fieldsList
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
public fun SingleRequiredCustomOption(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.MutableSingleRequiredCustomOption_Impl(
    single = "",
    unknownFields = mutableMapOf()
).also(builderAction).toSingleRequiredCustomOption()

@pbandk.Export
@pbandk.JsName("orDefaultForSingleRequiredCustomOption")
public fun SingleRequiredCustomOption?.orDefault(): pbandk.testpb.SingleRequiredCustomOption = this ?: pbandk.testpb.SingleRequiredCustomOption.defaultInstance

private class SingleRequiredCustomOption_Impl(
    override val single: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SingleRequiredCustomOption, pbandk.gen.GeneratedMessage<pbandk.testpb.SingleRequiredCustomOption>() {
    override val descriptor get() = pbandk.testpb.SingleRequiredCustomOption.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit) = pbandk.testpb.SingleRequiredCustomOption {
        this.single = this@SingleRequiredCustomOption_Impl.single
        this.unknownFields += this@SingleRequiredCustomOption_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SingleRequiredCustomOption {
        this.single = single
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableSingleRequiredCustomOption_Impl(
    override var single: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableSingleRequiredCustomOption, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.SingleRequiredCustomOption>() {
    override val descriptor get() = pbandk.testpb.SingleRequiredCustomOption.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toSingleRequiredCustomOption() = SingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields.toMap()
    )
}

private fun SingleRequiredCustomOption.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption {
    if (other !is pbandk.testpb.SingleRequiredCustomOption) return this

    return copy {
        single = other.single
        unknownFields += other.unknownFields
    }
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
public fun MultipleCustomOptions(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MutableMultipleCustomOptions_Impl(
    multiple = "",
    unknownFields = mutableMapOf()
).also(builderAction).toMultipleCustomOptions()

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptions")
public fun MultipleCustomOptions?.orDefault(): pbandk.testpb.MultipleCustomOptions = this ?: pbandk.testpb.MultipleCustomOptions.defaultInstance

private class MultipleCustomOptions_Impl(
    override val multiple: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MultipleCustomOptions, pbandk.gen.GeneratedMessage<pbandk.testpb.MultipleCustomOptions>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptions.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit) = pbandk.testpb.MultipleCustomOptions {
        this.multiple = this@MultipleCustomOptions_Impl.multiple
        this.unknownFields += this@MultipleCustomOptions_Impl.unknownFields
        this.builderAction()
    }

    @Deprecated("Use copy { } instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptions {
        this.multiple = multiple
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMultipleCustomOptions_Impl(
    override var multiple: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMultipleCustomOptions, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MultipleCustomOptions>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptions.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit) =
        throw UnsupportedOperationException()

    @Deprecated("Use copy { } instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMultipleCustomOptions() = MultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields.toMap()
    )
}

private fun MultipleCustomOptions.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions {
    if (other !is pbandk.testpb.MultipleCustomOptions) return this

    return copy {
        multiple = other.multiple
        unknownFields += other.unknownFields
    }
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
public fun MultipleCustomOptionsPlusDeprecated(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated_Impl(
    multipleDeprecated = "",
    unknownFields = mutableMapOf()
).also(builderAction).toMultipleCustomOptionsPlusDeprecated()

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated?.orDefault(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = this ?: pbandk.testpb.MultipleCustomOptionsPlusDeprecated.defaultInstance

private class MultipleCustomOptionsPlusDeprecated_Impl(
    override val multipleDeprecated: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MultipleCustomOptionsPlusDeprecated, pbandk.gen.GeneratedMessage<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = this@MultipleCustomOptionsPlusDeprecated_Impl.multipleDeprecated
        this.unknownFields += this@MultipleCustomOptionsPlusDeprecated_Impl.unknownFields
        this.builderAction()
    }

    @Suppress("DEPRECATION")
    @Deprecated("Use copy { } instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = multipleDeprecated
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
}

private class MutableMultipleCustomOptionsPlusDeprecated_Impl(
    override var multipleDeprecated: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated, pbandk.gen.MutableGeneratedMessage<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) =
        throw UnsupportedOperationException()

    @Suppress("DEPRECATION")
    @Deprecated("Use copy { } instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    override operator fun plus(other: pbandk.Message?) = throw UnsupportedOperationException()

    fun toMultipleCustomOptionsPlusDeprecated() = MultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = @Suppress("DEPRECATION") multipleDeprecated,
        unknownFields = unknownFields.toMap()
    )
}

private fun MultipleCustomOptionsPlusDeprecated.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
    if (other !is pbandk.testpb.MultipleCustomOptionsPlusDeprecated) return this

    return copy {
        @Suppress("DEPRECATION")
        multipleDeprecated = other.multipleDeprecated
        unknownFields += other.unknownFields
    }
}

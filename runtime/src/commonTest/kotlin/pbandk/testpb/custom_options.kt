@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface SingleRequiredCustomOption : pbandk.Message {
    public val single: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption>

    public fun toMutableSingleRequiredCustomOption(): MutableSingleRequiredCustomOption

    /**
     * The [MutableSingleRequiredCustomOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableSingleRequiredCustomOption.() -> Unit): SingleRequiredCustomOption

    @Deprecated("Use copy {} instead")
    public fun copy(
        single: String = this.single,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SingleRequiredCustomOption

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.SingleRequiredCustomOption by lazy { pbandk.testpb.SingleRequiredCustomOption() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.SingleRequiredCustomOption.decodeWithImpl(u)

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
                        value = pbandk.testpb.SingleRequiredCustomOption::single
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.SingleRequiredCustomOption",
                messageClass = pbandk.testpb.SingleRequiredCustomOption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableSingleRequiredCustomOption : SingleRequiredCustomOption, pbandk.MutableMessage {
    public override var single: String

    public fun toSingleRequiredCustomOption(): SingleRequiredCustomOption

    public override fun copy(builderAction: MutableSingleRequiredCustomOption.() -> Unit): MutableSingleRequiredCustomOption

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.SingleRequiredCustomOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> get() = pbandk.testpb.SingleRequiredCustomOption.descriptor
    }
}

public sealed interface MultipleCustomOptions : pbandk.Message {
    public val multiple: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions>

    public fun toMutableMultipleCustomOptions(): MutableMultipleCustomOptions

    /**
     * The [MutableMultipleCustomOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableMultipleCustomOptions.() -> Unit): MultipleCustomOptions

    @Deprecated("Use copy {} instead")
    public fun copy(
        multiple: String = this.multiple,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptions

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.MultipleCustomOptions by lazy { pbandk.testpb.MultipleCustomOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MultipleCustomOptions.decodeWithImpl(u)

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
                        value = pbandk.testpb.MultipleCustomOptions::multiple
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.MultipleCustomOptions",
                messageClass = pbandk.testpb.MultipleCustomOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMultipleCustomOptions : MultipleCustomOptions, pbandk.MutableMessage {
    public override var multiple: String

    public fun toMultipleCustomOptions(): MultipleCustomOptions

    public override fun copy(builderAction: MutableMultipleCustomOptions.() -> Unit): MutableMultipleCustomOptions

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MultipleCustomOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> get() = pbandk.testpb.MultipleCustomOptions.descriptor
    }
}

public sealed interface MultipleCustomOptionsPlusDeprecated : pbandk.Message {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public val multipleDeprecated: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>

    public fun toMutableMultipleCustomOptionsPlusDeprecated(): MutableMultipleCustomOptionsPlusDeprecated

    /**
     * The [MutableMultipleCustomOptionsPlusDeprecated] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): MultipleCustomOptionsPlusDeprecated

    @Deprecated("Use copy {} instead")
    public fun copy(
        multipleDeprecated: String = @Suppress("DEPRECATION") this.multipleDeprecated,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.testpb.MultipleCustomOptionsPlusDeprecated by lazy { pbandk.testpb.MultipleCustomOptionsPlusDeprecated() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.decodeWithImpl(u)

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
                        value = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::multipleDeprecated
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "pbandk.testpb.MultipleCustomOptionsPlusDeprecated",
                messageClass = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableMultipleCustomOptionsPlusDeprecated : MultipleCustomOptionsPlusDeprecated, pbandk.MutableMessage {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public override var multipleDeprecated: String

    public fun toMultipleCustomOptionsPlusDeprecated(): MultipleCustomOptionsPlusDeprecated

    public override fun copy(builderAction: MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): MutableMultipleCustomOptionsPlusDeprecated

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor
    }
}
@Deprecated("Use SingleRequiredCustomOption { } instead")
public fun SingleRequiredCustomOption(
    single: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SingleRequiredCustomOption = SingleRequiredCustomOption {
    this.single = single
    this.unknownFields.putAll(unknownFields)
}

@Deprecated("Use SingleRequiredCustomOption { } instead")
public fun MutableSingleRequiredCustomOption(
    single: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MutableSingleRequiredCustomOption = MutableSingleRequiredCustomOption_Impl(
    single = single,
    unknownFields = unknownFields.toMutableMap()
)

/**
 * The [MutableSingleRequiredCustomOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun SingleRequiredCustomOption(builderAction: MutableSingleRequiredCustomOption.() -> Unit): SingleRequiredCustomOption {
    @Suppress("DEPRECATION") val builder = MutableSingleRequiredCustomOption()
    builder.builderAction()
    return builder.toSingleRequiredCustomOption()
}

@pbandk.Export
@pbandk.JsName("orDefaultForSingleRequiredCustomOption")
public fun SingleRequiredCustomOption?.orDefault(): pbandk.testpb.SingleRequiredCustomOption = this ?: SingleRequiredCustomOption.defaultInstance

private class SingleRequiredCustomOption_Impl(
    override val single: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SingleRequiredCustomOption, pbandk.GeneratedMessage<SingleRequiredCustomOption>() {
    override val descriptor get() = SingleRequiredCustomOption.descriptor

    override fun copy(builderAction: MutableSingleRequiredCustomOption.() -> Unit) =
        toMutableSingleRequiredCustomOption().apply(builderAction).toSingleRequiredCustomOption()

    @Deprecated("Use copy {} instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SingleRequiredCustomOption)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableSingleRequiredCustomOption() = MutableSingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableSingleRequiredCustomOption_Impl(
    override var single: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableSingleRequiredCustomOption, pbandk.MutableGeneratedMessage<MutableSingleRequiredCustomOption>() {
    override val descriptor get() = SingleRequiredCustomOption.descriptor

    override fun copy(builderAction: MutableSingleRequiredCustomOption.() -> Unit) =
        toMutableSingleRequiredCustomOption().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = SingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? SingleRequiredCustomOption)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toSingleRequiredCustomOption() = SingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableSingleRequiredCustomOption() = this
}

@Suppress("UNCHECKED_CAST")
private fun SingleRequiredCustomOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SingleRequiredCustomOption {
    var single = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> single = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return SingleRequiredCustomOption(single, unknownFields)
}
@Deprecated("Use MultipleCustomOptions { } instead")
public fun MultipleCustomOptions(
    multiple: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MultipleCustomOptions = MultipleCustomOptions {
    this.multiple = multiple
    this.unknownFields.putAll(unknownFields)
}

@Deprecated("Use MultipleCustomOptions { } instead")
public fun MutableMultipleCustomOptions(
    multiple: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MutableMultipleCustomOptions = MutableMultipleCustomOptions_Impl(
    multiple = multiple,
    unknownFields = unknownFields.toMutableMap()
)

/**
 * The [MutableMultipleCustomOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MultipleCustomOptions(builderAction: MutableMultipleCustomOptions.() -> Unit): MultipleCustomOptions {
    @Suppress("DEPRECATION") val builder = MutableMultipleCustomOptions()
    builder.builderAction()
    return builder.toMultipleCustomOptions()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptions")
public fun MultipleCustomOptions?.orDefault(): pbandk.testpb.MultipleCustomOptions = this ?: MultipleCustomOptions.defaultInstance

private class MultipleCustomOptions_Impl(
    override val multiple: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MultipleCustomOptions, pbandk.GeneratedMessage<MultipleCustomOptions>() {
    override val descriptor get() = MultipleCustomOptions.descriptor

    override fun copy(builderAction: MutableMultipleCustomOptions.() -> Unit) =
        toMutableMultipleCustomOptions().apply(builderAction).toMultipleCustomOptions()

    @Deprecated("Use copy {} instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MultipleCustomOptions)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableMultipleCustomOptions() = MutableMultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableMultipleCustomOptions_Impl(
    override var multiple: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMultipleCustomOptions, pbandk.MutableGeneratedMessage<MutableMultipleCustomOptions>() {
    override val descriptor get() = MultipleCustomOptions.descriptor

    override fun copy(builderAction: MutableMultipleCustomOptions.() -> Unit) =
        toMutableMultipleCustomOptions().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MultipleCustomOptions)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMultipleCustomOptions() = MultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMultipleCustomOptions() = this
}

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultipleCustomOptions {
    var multiple = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multiple = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return MultipleCustomOptions(multiple, unknownFields)
}
@Deprecated("Use MultipleCustomOptionsPlusDeprecated { } instead")
public fun MultipleCustomOptionsPlusDeprecated(
    multipleDeprecated: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = MultipleCustomOptionsPlusDeprecated {
    this.multipleDeprecated = multipleDeprecated
    this.unknownFields.putAll(unknownFields)
}

@Deprecated("Use MultipleCustomOptionsPlusDeprecated { } instead")
public fun MutableMultipleCustomOptionsPlusDeprecated(
    multipleDeprecated: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MutableMultipleCustomOptionsPlusDeprecated = MutableMultipleCustomOptionsPlusDeprecated_Impl(
    multipleDeprecated = multipleDeprecated,
    unknownFields = unknownFields.toMutableMap()
)

/**
 * The [MutableMultipleCustomOptionsPlusDeprecated] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MultipleCustomOptionsPlusDeprecated(builderAction: MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): MultipleCustomOptionsPlusDeprecated {
    @Suppress("DEPRECATION") val builder = MutableMultipleCustomOptionsPlusDeprecated()
    builder.builderAction()
    return builder.toMultipleCustomOptionsPlusDeprecated()
}

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated?.orDefault(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = this ?: MultipleCustomOptionsPlusDeprecated.defaultInstance

private class MultipleCustomOptionsPlusDeprecated_Impl(
    override val multipleDeprecated: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MultipleCustomOptionsPlusDeprecated, pbandk.GeneratedMessage<MultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = MultipleCustomOptionsPlusDeprecated.descriptor

    override fun copy(builderAction: MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) =
        toMutableMultipleCustomOptionsPlusDeprecated().apply(builderAction).toMultipleCustomOptionsPlusDeprecated()

    @Suppress("DEPRECATION")
    @Deprecated("Use copy {} instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = multipleDeprecated,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MultipleCustomOptionsPlusDeprecated)?.let {
        @Suppress("DEPRECATION")
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableMultipleCustomOptionsPlusDeprecated() = MutableMultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = @Suppress("DEPRECATION") multipleDeprecated,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableMultipleCustomOptionsPlusDeprecated_Impl(
    override var multipleDeprecated: String,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableMultipleCustomOptionsPlusDeprecated, pbandk.MutableGeneratedMessage<MutableMultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = MultipleCustomOptionsPlusDeprecated.descriptor

    override fun copy(builderAction: MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) =
        toMutableMultipleCustomOptionsPlusDeprecated().apply(builderAction)

    @Suppress("DEPRECATION")
    @Deprecated("Use copy {} instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = MultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = multipleDeprecated,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? MultipleCustomOptionsPlusDeprecated)?.let {
        @Suppress("DEPRECATION")
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMultipleCustomOptionsPlusDeprecated() = MultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = @Suppress("DEPRECATION") multipleDeprecated,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMultipleCustomOptionsPlusDeprecated() = this
}

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptionsPlusDeprecated.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultipleCustomOptionsPlusDeprecated {
    var multipleDeprecated = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multipleDeprecated = _fieldValue as String
        }
    }
    @Suppress("DEPRECATION")
    return MultipleCustomOptionsPlusDeprecated(multipleDeprecated, unknownFields)
}

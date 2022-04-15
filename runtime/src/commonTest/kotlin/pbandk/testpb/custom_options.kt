@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public sealed interface SingleRequiredCustomOption : pbandk.Message {
    public val single: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableSingleRequiredCustomOption(): pbandk.testpb.MutableSingleRequiredCustomOption

    /**
     * The [MutableSingleRequiredCustomOption] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.SingleRequiredCustomOption

    @Deprecated("Use copy {} instead")
    public fun copy(
        single: String = this.single,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SingleRequiredCustomOption

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        public val defaultInstance: pbandk.testpb.SingleRequiredCustomOption by lazy { pbandk.testpb.SingleRequiredCustomOption {} }
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

public sealed interface MutableSingleRequiredCustomOption : pbandk.testpb.SingleRequiredCustomOption, pbandk.MutableMessage {
    public override var single: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toSingleRequiredCustomOption(): pbandk.testpb.SingleRequiredCustomOption

    public override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.MutableSingleRequiredCustomOption

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.SingleRequiredCustomOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> get() = pbandk.testpb.SingleRequiredCustomOption.descriptor
    }
}

@pbandk.Export
public sealed interface MultipleCustomOptions : pbandk.Message {
    public val multiple: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableMultipleCustomOptions(): pbandk.testpb.MutableMultipleCustomOptions

    /**
     * The [MutableMultipleCustomOptions] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MultipleCustomOptions

    @Deprecated("Use copy {} instead")
    public fun copy(
        multiple: String = this.multiple,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptions

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        public val defaultInstance: pbandk.testpb.MultipleCustomOptions by lazy { pbandk.testpb.MultipleCustomOptions {} }
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

public sealed interface MutableMultipleCustomOptions : pbandk.testpb.MultipleCustomOptions, pbandk.MutableMessage {
    public override var multiple: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toMultipleCustomOptions(): pbandk.testpb.MultipleCustomOptions

    public override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MutableMultipleCustomOptions

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MultipleCustomOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> get() = pbandk.testpb.MultipleCustomOptions.descriptor
    }
}

@pbandk.Export
public sealed interface MultipleCustomOptionsPlusDeprecated : pbandk.Message {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public val multipleDeprecated: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableMultipleCustomOptionsPlusDeprecated(): pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated

    /**
     * The [MutableMultipleCustomOptionsPlusDeprecated] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    @Deprecated("Use copy {} instead")
    public fun copy(
        multipleDeprecated: String = @Suppress("DEPRECATION") this.multipleDeprecated,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        public val defaultInstance: pbandk.testpb.MultipleCustomOptionsPlusDeprecated by lazy { pbandk.testpb.MultipleCustomOptionsPlusDeprecated {} }
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

public sealed interface MutableMultipleCustomOptionsPlusDeprecated : pbandk.testpb.MultipleCustomOptionsPlusDeprecated, pbandk.MutableMessage {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public override var multipleDeprecated: String

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toMultipleCustomOptionsPlusDeprecated(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    public override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor
    }
}

@Deprecated("Use SingleRequiredCustomOption { } instead")
public fun SingleRequiredCustomOption(
    single: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.SingleRequiredCustomOption {
    this.single = single
    this.unknownFields += unknownFields
}

public fun MutableSingleRequiredCustomOption(): pbandk.testpb.MutableSingleRequiredCustomOption = pbandk.testpb.MutableSingleRequiredCustomOption_Impl(
    single = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableSingleRequiredCustomOption] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun SingleRequiredCustomOption(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.SingleRequiredCustomOption =
    pbandk.testpb.MutableSingleRequiredCustomOption().also(builderAction).toSingleRequiredCustomOption()

public fun MutableSingleRequiredCustomOption(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit): pbandk.testpb.MutableSingleRequiredCustomOption =
    pbandk.testpb.MutableSingleRequiredCustomOption().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForSingleRequiredCustomOption")
public fun SingleRequiredCustomOption?.orDefault(): pbandk.testpb.SingleRequiredCustomOption = this ?: pbandk.testpb.SingleRequiredCustomOption.defaultInstance

private class SingleRequiredCustomOption_Impl(
    override val single: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.SingleRequiredCustomOption, pbandk.GeneratedMessage<pbandk.testpb.SingleRequiredCustomOption>() {
    override val descriptor get() = pbandk.testpb.SingleRequiredCustomOption.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit) =
        toMutableSingleRequiredCustomOption().apply(builderAction).toSingleRequiredCustomOption()

    @Deprecated("Use copy {} instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SingleRequiredCustomOption {
        this.single = single
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableSingleRequiredCustomOption() = pbandk.testpb.MutableSingleRequiredCustomOption {
        this.single = this@SingleRequiredCustomOption_Impl.single
        this.unknownFields += this@SingleRequiredCustomOption_Impl.unknownFields
    }
}

private class MutableSingleRequiredCustomOption_Impl(
    override var single: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableSingleRequiredCustomOption, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableSingleRequiredCustomOption>() {
    override val descriptor get() = pbandk.testpb.SingleRequiredCustomOption.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableSingleRequiredCustomOption.() -> Unit) =
        toMutableSingleRequiredCustomOption().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        single: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.SingleRequiredCustomOption {
        this.single = single
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toSingleRequiredCustomOption() = SingleRequiredCustomOption_Impl(
        single = single,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableSingleRequiredCustomOption() = pbandk.testpb.MutableSingleRequiredCustomOption {
        this.single = this@MutableSingleRequiredCustomOption_Impl.single
        this.unknownFields += this@MutableSingleRequiredCustomOption_Impl.unknownFields
    }
}

private fun SingleRequiredCustomOption.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption {
    if (other !is pbandk.testpb.SingleRequiredCustomOption) return this

    return copy {
        single = other.single
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun SingleRequiredCustomOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.SingleRequiredCustomOption {
    var single = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> single = _fieldValue as String
        }
    }
    return SingleRequiredCustomOption_Impl(single, unknownFields)
}

@Deprecated("Use MultipleCustomOptions { } instead")
public fun MultipleCustomOptions(
    multiple: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MultipleCustomOptions {
    this.multiple = multiple
    this.unknownFields += unknownFields
}

public fun MutableMultipleCustomOptions(): pbandk.testpb.MutableMultipleCustomOptions = pbandk.testpb.MutableMultipleCustomOptions_Impl(
    multiple = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableMultipleCustomOptions] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MultipleCustomOptions(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MultipleCustomOptions =
    pbandk.testpb.MutableMultipleCustomOptions().also(builderAction).toMultipleCustomOptions()

public fun MutableMultipleCustomOptions(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit): pbandk.testpb.MutableMultipleCustomOptions =
    pbandk.testpb.MutableMultipleCustomOptions().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptions")
public fun MultipleCustomOptions?.orDefault(): pbandk.testpb.MultipleCustomOptions = this ?: pbandk.testpb.MultipleCustomOptions.defaultInstance

private class MultipleCustomOptions_Impl(
    override val multiple: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MultipleCustomOptions, pbandk.GeneratedMessage<pbandk.testpb.MultipleCustomOptions>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptions.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit) =
        toMutableMultipleCustomOptions().apply(builderAction).toMultipleCustomOptions()

    @Deprecated("Use copy {} instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptions {
        this.multiple = multiple
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableMultipleCustomOptions() = pbandk.testpb.MutableMultipleCustomOptions {
        this.multiple = this@MultipleCustomOptions_Impl.multiple
        this.unknownFields += this@MultipleCustomOptions_Impl.unknownFields
    }
}

private class MutableMultipleCustomOptions_Impl(
    override var multiple: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMultipleCustomOptions, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableMultipleCustomOptions>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptions.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptions.() -> Unit) =
        toMutableMultipleCustomOptions().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        multiple: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptions {
        this.multiple = multiple
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMultipleCustomOptions() = MultipleCustomOptions_Impl(
        multiple = multiple,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMultipleCustomOptions() = pbandk.testpb.MutableMultipleCustomOptions {
        this.multiple = this@MutableMultipleCustomOptions_Impl.multiple
        this.unknownFields += this@MutableMultipleCustomOptions_Impl.unknownFields
    }
}

private fun MultipleCustomOptions.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions {
    if (other !is pbandk.testpb.MultipleCustomOptions) return this

    return copy {
        multiple = other.multiple
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptions {
    var multiple = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multiple = _fieldValue as String
        }
    }
    return MultipleCustomOptions_Impl(multiple, unknownFields)
}

@Deprecated("Use MultipleCustomOptionsPlusDeprecated { } instead")
public fun MultipleCustomOptionsPlusDeprecated(
    multipleDeprecated: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
    @Suppress("DEPRECATION")
    this.multipleDeprecated = multipleDeprecated
    this.unknownFields += unknownFields
}

public fun MutableMultipleCustomOptionsPlusDeprecated(): pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated = pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated_Impl(
    multipleDeprecated = "",
    unknownFields = mutableMapOf()
)

/**
 * The [MutableMultipleCustomOptionsPlusDeprecated] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MultipleCustomOptionsPlusDeprecated(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MultipleCustomOptionsPlusDeprecated =
    pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated().also(builderAction).toMultipleCustomOptionsPlusDeprecated()

public fun MutableMultipleCustomOptionsPlusDeprecated(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit): pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated =
    pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated?.orDefault(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = this ?: pbandk.testpb.MultipleCustomOptionsPlusDeprecated.defaultInstance

private class MultipleCustomOptionsPlusDeprecated_Impl(
    override val multipleDeprecated: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.testpb.MultipleCustomOptionsPlusDeprecated, pbandk.GeneratedMessage<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) =
        toMutableMultipleCustomOptionsPlusDeprecated().apply(builderAction).toMultipleCustomOptionsPlusDeprecated()

    @Suppress("DEPRECATION")
    @Deprecated("Use copy {} instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = multipleDeprecated
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMutableMultipleCustomOptionsPlusDeprecated() = pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = this@MultipleCustomOptionsPlusDeprecated_Impl.multipleDeprecated
        this.unknownFields += this@MultipleCustomOptionsPlusDeprecated_Impl.unknownFields
    }
}

private class MutableMultipleCustomOptionsPlusDeprecated_Impl(
    override var multipleDeprecated: String,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated, pbandk.MutableGeneratedMessage<pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.descriptor

    override fun copy(builderAction: pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated.() -> Unit) =
        toMutableMultipleCustomOptionsPlusDeprecated().apply(builderAction)

    @Suppress("DEPRECATION")
    @Deprecated("Use copy {} instead")
    override fun copy(
        multipleDeprecated: String,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = multipleDeprecated
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)

    override fun toMultipleCustomOptionsPlusDeprecated() = MultipleCustomOptionsPlusDeprecated_Impl(
        multipleDeprecated = @Suppress("DEPRECATION") multipleDeprecated,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableMultipleCustomOptionsPlusDeprecated() = pbandk.testpb.MutableMultipleCustomOptionsPlusDeprecated {
        @Suppress("DEPRECATION")
        this.multipleDeprecated = this@MutableMultipleCustomOptionsPlusDeprecated_Impl.multipleDeprecated
        this.unknownFields += this@MutableMultipleCustomOptionsPlusDeprecated_Impl.unknownFields
    }
}

private fun MultipleCustomOptionsPlusDeprecated.protoMergeImpl(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
    if (other !is pbandk.testpb.MultipleCustomOptionsPlusDeprecated) return this

    return copy {
        @Suppress("DEPRECATION")
        multipleDeprecated = other.multipleDeprecated
        unknownFields += other.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptionsPlusDeprecated.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptionsPlusDeprecated {
    var multipleDeprecated = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multipleDeprecated = _fieldValue as String
        }
    }
    return MultipleCustomOptionsPlusDeprecated_Impl(multipleDeprecated, unknownFields)
}

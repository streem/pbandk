@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public sealed interface SingleRequiredCustomOption : pbandk.Message {
    public val single: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption>

    public fun copy(
        single: String = this.single,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.SingleRequiredCustomOption

    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        public operator fun invoke(
            single: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SingleRequiredCustomOption = SingleRequiredCustomOption_Impl(
            single = single,
            unknownFields = unknownFields
        )

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
                        options = pbandk.wkt.FieldOptions(
                            unknownFields = mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(5, -118, 1, 2, 16, 1))
                                    )
                                )
                            )
                        ),
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

public sealed interface MultipleCustomOptions : pbandk.Message {
    public val multiple: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions>

    public fun copy(
        multiple: String = this.multiple,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptions

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        public operator fun invoke(
            multiple: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MultipleCustomOptions = MultipleCustomOptions_Impl(
            multiple = multiple,
            unknownFields = unknownFields
        )

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
                        options = pbandk.wkt.FieldOptions(
                            unknownFields = mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(5, -118, 1, 2, 16, 1)),
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 16, 10))
                                    )
                                )
                            )
                        ),
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

public sealed interface MultipleCustomOptionsPlusDeprecated : pbandk.Message {
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    public val multipleDeprecated: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>
    @Suppress("DEPRECATION")

    public fun copy(
        multipleDeprecated: String = this.multipleDeprecated,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.testpb.MultipleCustomOptionsPlusDeprecated

    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        public operator fun invoke(
            multipleDeprecated: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = MultipleCustomOptionsPlusDeprecated_Impl(
            multipleDeprecated = multipleDeprecated,
            unknownFields = unknownFields
        )

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
                        options = pbandk.wkt.FieldOptions(
                            deprecated = true,
                            unknownFields = mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 24, 32)),
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 16, 10))
                                    )
                                )
                            )
                        ),
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

@pbandk.Export
@pbandk.JsName("orDefaultForSingleRequiredCustomOption")
public fun SingleRequiredCustomOption?.orDefault(): pbandk.testpb.SingleRequiredCustomOption = this ?: SingleRequiredCustomOption.defaultInstance

private class SingleRequiredCustomOption_Impl(
    override val single: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SingleRequiredCustomOption, pbandk.GeneratedMessage<SingleRequiredCustomOption>() {
    override val descriptor get() = SingleRequiredCustomOption.descriptor

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
}

@Suppress("UNCHECKED_CAST")
private fun SingleRequiredCustomOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SingleRequiredCustomOption {
    var single = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> single = _fieldValue as String
        }
    }
    return SingleRequiredCustomOption(single, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptions")
public fun MultipleCustomOptions?.orDefault(): pbandk.testpb.MultipleCustomOptions = this ?: MultipleCustomOptions.defaultInstance

private class MultipleCustomOptions_Impl(
    override val multiple: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MultipleCustomOptions, pbandk.GeneratedMessage<MultipleCustomOptions>() {
    override val descriptor get() = MultipleCustomOptions.descriptor

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
}

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultipleCustomOptions {
    var multiple = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multiple = _fieldValue as String
        }
    }
    return MultipleCustomOptions(multiple, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated?.orDefault(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = this ?: MultipleCustomOptionsPlusDeprecated.defaultInstance

private class MultipleCustomOptionsPlusDeprecated_Impl(
    override val multipleDeprecated: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MultipleCustomOptionsPlusDeprecated, pbandk.GeneratedMessage<MultipleCustomOptionsPlusDeprecated>() {
    override val descriptor get() = MultipleCustomOptionsPlusDeprecated.descriptor

    @Suppress("DEPRECATION")
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
}

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptionsPlusDeprecated.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultipleCustomOptionsPlusDeprecated {
    var multipleDeprecated = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multipleDeprecated = _fieldValue as String
        }
    }
    return MultipleCustomOptionsPlusDeprecated(multipleDeprecated, unknownFields)
}

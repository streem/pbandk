@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

data class SingleRequiredCustomOption(
    val single: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<SingleRequiredCustomOption> {
        val defaultInstance by lazy { SingleRequiredCustomOption() }
        override fun decodeWith(u: pbandk.MessageDecoder) = SingleRequiredCustomOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<SingleRequiredCustomOption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<SingleRequiredCustomOption, *>>(1).apply {
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
                                    value = pbandk.UnknownField.Value.LengthDelimited(
                                        bytes=pbandk.ByteArr(byteArrayOf(-118, 1, 2, 16, 1))
                                    )
                                )
                            )
                        ),
                        value = SingleRequiredCustomOption::single
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = SingleRequiredCustomOption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class MultipleCustomOptions(
    val multiple: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<MultipleCustomOptions> {
        val defaultInstance by lazy { MultipleCustomOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = MultipleCustomOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<MultipleCustomOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<MultipleCustomOptions, *>>(1).apply {
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
                                    value = pbandk.UnknownField.Value.Composite(
                                        values=listOf(
                                            pbandk.UnknownField.Value.LengthDelimited(
                                                bytes=pbandk.ByteArr(byteArrayOf(-118, 1, 2, 16, 1))
                                            ),
                                            pbandk.UnknownField.Value.LengthDelimited(
                                                bytes=pbandk.ByteArr(byteArrayOf(114, 2, 16, 10))
                                            )
                                        )
                                    )
                                )
                            )
                        ),
                        value = MultipleCustomOptions::multiple
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = MultipleCustomOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class MultipleCustomOptionsPlusDeprecated(
    val multipleDeprecated: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<MultipleCustomOptionsPlusDeprecated> {
        val defaultInstance by lazy { MultipleCustomOptionsPlusDeprecated() }
        override fun decodeWith(u: pbandk.MessageDecoder) = MultipleCustomOptionsPlusDeprecated.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<MultipleCustomOptionsPlusDeprecated> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<MultipleCustomOptionsPlusDeprecated, *>>(1).apply {
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
                                    value = pbandk.UnknownField.Value.Composite(
                                        values=listOf(
                                            pbandk.UnknownField.Value.LengthDelimited(
                                                bytes=pbandk.ByteArr(byteArrayOf(114, 2, 24, 32))
                                            ),
                                            pbandk.UnknownField.Value.LengthDelimited(
                                                bytes=pbandk.ByteArr(byteArrayOf(114, 2, 16, 10))
                                            )
                                        )
                                    )
                                )
                            )
                        ),
                        value = MultipleCustomOptionsPlusDeprecated::multipleDeprecated
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = MultipleCustomOptionsPlusDeprecated::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun SingleRequiredCustomOption?.orDefault() = this ?: SingleRequiredCustomOption.defaultInstance

private fun SingleRequiredCustomOption.protoMergeImpl(plus: pbandk.Message?): SingleRequiredCustomOption = (plus as? SingleRequiredCustomOption)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

fun MultipleCustomOptions?.orDefault() = this ?: MultipleCustomOptions.defaultInstance

private fun MultipleCustomOptions.protoMergeImpl(plus: pbandk.Message?): MultipleCustomOptions = (plus as? MultipleCustomOptions)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

fun MultipleCustomOptionsPlusDeprecated?.orDefault() = this ?: MultipleCustomOptionsPlusDeprecated.defaultInstance

private fun MultipleCustomOptionsPlusDeprecated.protoMergeImpl(plus: pbandk.Message?): MultipleCustomOptionsPlusDeprecated = (plus as? MultipleCustomOptionsPlusDeprecated)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

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

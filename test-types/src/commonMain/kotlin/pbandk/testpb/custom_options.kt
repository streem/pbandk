@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

@pbandk.Export
public data class SingleRequiredCustomOption(
    val single: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        public val defaultInstance: pbandk.testpb.SingleRequiredCustomOption by lazy { pbandk.testpb.SingleRequiredCustomOption() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.SingleRequiredCustomOption = pbandk.testpb.SingleRequiredCustomOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> = pbandk.MessageDescriptor(
            fullName = "pbandk.testpb.SingleRequiredCustomOption",
            messageClass = pbandk.testpb.SingleRequiredCustomOption::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class MultipleCustomOptions(
    val multiple: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        public val defaultInstance: pbandk.testpb.MultipleCustomOptions by lazy { pbandk.testpb.MultipleCustomOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptions = pbandk.testpb.MultipleCustomOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> = pbandk.MessageDescriptor(
            fullName = "pbandk.testpb.MultipleCustomOptions",
            messageClass = pbandk.testpb.MultipleCustomOptions::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
public data class MultipleCustomOptionsPlusDeprecated(
    @Deprecated(message = "Field marked deprecated in pbandk/testpb/custom_options.proto")
    val multipleDeprecated: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        public val defaultInstance: pbandk.testpb.MultipleCustomOptionsPlusDeprecated by lazy { pbandk.testpb.MultipleCustomOptionsPlusDeprecated() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> = pbandk.MessageDescriptor(
            fullName = "pbandk.testpb.MultipleCustomOptionsPlusDeprecated",
            messageClass = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::class,
            messageCompanion = this,
            fields = buildList(1) {
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
        )
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForSingleRequiredCustomOption")
public fun SingleRequiredCustomOption?.orDefault(): pbandk.testpb.SingleRequiredCustomOption = this ?: SingleRequiredCustomOption.defaultInstance

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

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptions")
public fun MultipleCustomOptions?.orDefault(): pbandk.testpb.MultipleCustomOptions = this ?: MultipleCustomOptions.defaultInstance

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

@pbandk.Export
@pbandk.JsName("orDefaultForMultipleCustomOptionsPlusDeprecated")
public fun MultipleCustomOptionsPlusDeprecated?.orDefault(): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = this ?: MultipleCustomOptionsPlusDeprecated.defaultInstance

private fun MultipleCustomOptionsPlusDeprecated.protoMergeImpl(plus: pbandk.Message?): MultipleCustomOptionsPlusDeprecated = (plus as? MultipleCustomOptionsPlusDeprecated)?.let {
    @Suppress("DEPRECATION")
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

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Any : pbandk.Message {
    public val typeUrl: String
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Any
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any>

    public fun toMutableAny(): MutableAny

    /**
     * The [MutableAny] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: MutableAny.() -> Unit): Any

    @Deprecated("Use copy {} instead")
    public fun copy(
        typeUrl: String = this.typeUrl,
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Any

    public companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        @Suppress("DEPRECATION")
        public val defaultInstance: pbandk.wkt.Any by lazy { pbandk.wkt.Any() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Any = pbandk.wkt.Any.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Any, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_url",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "typeUrl",
                        value = pbandk.wkt.Any::typeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = pbandk.wkt.Any::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "google.protobuf.Any",
                messageClass = pbandk.wkt.Any::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

public sealed interface MutableAny : Any, pbandk.MutableMessage {
    public override var typeUrl: String
    public override var value: pbandk.ByteArr

    public fun toAny(): Any

    public override fun copy(builderAction: MutableAny.() -> Unit): MutableAny

    public companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Any = pbandk.wkt.Any.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any> get() = pbandk.wkt.Any.descriptor
    }
}
@Deprecated("Use Any { } instead")
public fun Any(
    typeUrl: String = "",
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.wkt.Any = Any {
    this.typeUrl = typeUrl
    this.value = value
    this.unknownFields.putAll(unknownFields)
}

@Deprecated("Use Any { } instead")
public fun MutableAny(
    typeUrl: String = "",
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MutableAny = MutableAny_Impl(
    typeUrl = typeUrl,
    value = value,
    unknownFields = unknownFields.toMutableMap()
)

/**
 * The [MutableAny] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Any(builderAction: MutableAny.() -> Unit): Any {
    @Suppress("DEPRECATION") val builder = MutableAny()
    builder.builderAction()
    return builder.toAny()
}

@pbandk.Export
@pbandk.JsName("orDefaultForAny")
public fun Any?.orDefault(): pbandk.wkt.Any = this ?: Any.defaultInstance

private class Any_Impl(
    override val typeUrl: String,
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Any, pbandk.GeneratedMessage<Any>() {
    override val descriptor get() = Any.descriptor

    override fun copy(builderAction: MutableAny.() -> Unit) =
        toMutableAny().apply(builderAction).toAny()

    @Deprecated("Use copy {} instead")
    override fun copy(
        typeUrl: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Any_Impl(
        typeUrl = typeUrl,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Any)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableAny() = MutableAny_Impl(
        typeUrl = typeUrl,
        value = value,
        unknownFields = unknownFields.toMutableMap()
    )
}

private class MutableAny_Impl(
    override var typeUrl: String,
    override var value: pbandk.ByteArr,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableAny, pbandk.MutableGeneratedMessage<MutableAny>() {
    override val descriptor get() = Any.descriptor

    override fun copy(builderAction: MutableAny.() -> Unit) =
        toMutableAny().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        typeUrl: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = Any_Impl(
        typeUrl = typeUrl,
        value = value,
        unknownFields = unknownFields
    )

    override operator fun plus(other: pbandk.Message?) = (other as? Any)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toAny() = Any_Impl(
        typeUrl = typeUrl,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableAny() = this
}

@Suppress("UNCHECKED_CAST")
private fun Any.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> typeUrl = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    @Suppress("DEPRECATION")
    return Any(typeUrl, value, unknownFields)
}

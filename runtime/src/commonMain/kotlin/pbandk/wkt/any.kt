@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

public sealed interface Any : pbandk.Message {
    public val typeUrl: String
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Any
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any>

    public fun copy(
        typeUrl: String = this.typeUrl,
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Any

    public companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        @Deprecated("Use any { } instead")
        public operator fun invoke(
            typeUrl: String = "",
            value: pbandk.ByteArr = pbandk.ByteArr.empty,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Any = Any_Impl(
            typeUrl = typeUrl,
            value = value,
            unknownFields = unknownFields
        )

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

    public companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        @Deprecated("Use any { } instead")
        public operator fun invoke(
            typeUrl: String = "",
            value: pbandk.ByteArr = pbandk.ByteArr.empty,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): MutableAny = MutableAny_Impl(
            typeUrl = typeUrl,
            value = value,
            unknownFields = unknownFields.toMutableMap()
        )

        @Suppress("DEPRECATION")
        public val defaultInstance: MutableAny by lazy { MutableAny() }
        override fun decodeWith(u: pbandk.MessageDecoder): pbandk.wkt.Any = pbandk.wkt.Any.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any> get() = pbandk.wkt.Any.descriptor
    }
}

public fun any(builderAction: MutableAny.() -> Unit): Any {
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
}

private class MutableAny_Impl(
    override var typeUrl: String,
    override var value: pbandk.ByteArr,
    override var unknownFields: MutableMap<Int, pbandk.UnknownField>
) : MutableAny, pbandk.MutableGeneratedMessage<MutableAny>() {
    override val descriptor get() = Any.descriptor

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
        unknownFields = unknownFields
    )
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

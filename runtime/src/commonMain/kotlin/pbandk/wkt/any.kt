@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

@pbandk.Export
public sealed interface Any : pbandk.Message {
    public val typeUrl: String
    public val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Any
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any>

    /**
     * Returns a new mutable instance containing a copy of all values from this instance.
     */
    public fun toMutableAny(): pbandk.wkt.MutableAny

    /**
     * The [MutableAny] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit): pbandk.wkt.Any

    @Deprecated("Use copy {} instead")
    public fun copy(
        typeUrl: String = this.typeUrl,
        value: pbandk.ByteArr = this.value,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.wkt.Any

    public companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        public val defaultInstance: pbandk.wkt.Any by lazy { pbandk.wkt.Any {} }
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

public sealed interface MutableAny : pbandk.wkt.Any, pbandk.MutableMessage {
    public override var typeUrl: String
    public override var value: pbandk.ByteArr

    /**
     * Returns a new immutable instance containing a copy of all values from this instance.
     */
    public fun toAny(): pbandk.wkt.Any

    public override fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit): pbandk.wkt.MutableAny

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
): pbandk.wkt.Any = pbandk.wkt.Any {
    this.typeUrl = typeUrl
    this.value = value
    this.unknownFields += unknownFields
}

public fun MutableAny(): pbandk.wkt.MutableAny = pbandk.wkt.MutableAny_Impl(
    typeUrl = "",
    value = pbandk.ByteArr.empty,
    unknownFields = mutableMapOf()
)

/**
 * The [MutableAny] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun Any(builderAction: pbandk.wkt.MutableAny.() -> Unit): pbandk.wkt.Any =
    pbandk.wkt.MutableAny().also(builderAction).toAny()

public fun MutableAny(builderAction: pbandk.wkt.MutableAny.() -> Unit): pbandk.wkt.MutableAny =
    pbandk.wkt.MutableAny().also(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForAny")
public fun Any?.orDefault(): pbandk.wkt.Any = this ?: pbandk.wkt.Any.defaultInstance

private class Any_Impl(
    override val typeUrl: String,
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.wkt.Any, pbandk.GeneratedMessage<pbandk.wkt.Any>() {
    override val descriptor get() = pbandk.wkt.Any.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit) =
        toMutableAny().apply(builderAction).toAny()

    @Deprecated("Use copy {} instead")
    override fun copy(
        typeUrl: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.typeUrl = typeUrl
        this.value = value
        this.unknownFields += unknownFields
    }

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Any)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toMutableAny() = pbandk.wkt.MutableAny {
        this.typeUrl = this@Any_Impl.typeUrl
        this.value = this@Any_Impl.value
        this.unknownFields += this@Any_Impl.unknownFields
    }
}

private class MutableAny_Impl(
    override var typeUrl: String,
    override var value: pbandk.ByteArr,
    override val unknownFields: MutableMap<Int, pbandk.UnknownField>
) : pbandk.wkt.MutableAny, pbandk.MutableGeneratedMessage<pbandk.wkt.MutableAny>() {
    override val descriptor get() = pbandk.wkt.Any.descriptor

    override fun copy(builderAction: pbandk.wkt.MutableAny.() -> Unit) =
        toMutableAny().apply(builderAction)

    @Deprecated("Use copy {} instead")
    override fun copy(
        typeUrl: String,
        value: pbandk.ByteArr,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = copy {
        this.typeUrl = typeUrl
        this.value = value
        this.unknownFields += unknownFields
    }.toAny()

    override operator fun plus(other: pbandk.Message?) = (other as? pbandk.wkt.Any)?.let {
        it.copy(
            unknownFields = unknownFields + other.unknownFields
        )
    } ?: this

    override fun toAny() = Any_Impl(
        typeUrl = typeUrl,
        value = value,
        unknownFields = unknownFields.toMap()
    )

    override fun toMutableAny() = pbandk.wkt.MutableAny {
        this.typeUrl = this@MutableAny_Impl.typeUrl
        this.value = this@MutableAny_Impl.value
        this.unknownFields += this@MutableAny_Impl.unknownFields
    }
}

@Suppress("UNCHECKED_CAST")
private fun Any.Companion.decodeWithImpl(u: pbandk.MessageDecoder): pbandk.wkt.Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> typeUrl = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return Any_Impl(typeUrl, value, unknownFields)
}

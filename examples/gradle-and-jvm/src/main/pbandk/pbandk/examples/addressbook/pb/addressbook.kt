@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.examples.addressbook.pb

public sealed interface Person : pbandk.Message {
    public val name: String
    public val id: Int
    public val email: String
    public val phones: List<pbandk.examples.addressbook.pb.Person.PhoneNumber>
    public val lastUpdated: pbandk.wkt.Timestamp?

    override operator fun plus(other: pbandk.Message?): pbandk.examples.addressbook.pb.Person
    override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.Person>

    /**
     * The [MutablePerson] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.examples.addressbook.pb.MutablePerson.() -> Unit): pbandk.examples.addressbook.pb.Person

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        name: String = this.name,
        id: Int = this.id,
        email: String = this.email,
        phones: List<pbandk.examples.addressbook.pb.Person.PhoneNumber> = this.phones,
        lastUpdated: pbandk.wkt.Timestamp? = this.lastUpdated,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.examples.addressbook.pb.Person

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val name: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.examples.addressbook.pb.Person::descriptor,
                name = "name",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "name",
                value = pbandk.examples.addressbook.pb.Person::name,
                mutableValue = pbandk.examples.addressbook.pb.MutablePerson::name,
            )
        public val id: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person, Int> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.examples.addressbook.pb.Person::descriptor,
                name = "id",
                number = 2,
                type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                jsonName = "id",
                value = pbandk.examples.addressbook.pb.Person::id,
                mutableValue = pbandk.examples.addressbook.pb.MutablePerson::id,
            )
        public val email: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person, String> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.examples.addressbook.pb.Person::descriptor,
                name = "email",
                number = 3,
                type = pbandk.FieldDescriptor.Type.Primitive.String(),
                jsonName = "email",
                value = pbandk.examples.addressbook.pb.Person::email,
                mutableValue = pbandk.examples.addressbook.pb.MutablePerson::email,
            )
        public val phones: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person, List<pbandk.examples.addressbook.pb.Person.PhoneNumber>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.examples.addressbook.pb.Person::descriptor,
                name = "phones",
                number = 4,
                type = pbandk.FieldDescriptor.Type.Repeated<pbandk.examples.addressbook.pb.Person.PhoneNumber>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.examples.addressbook.pb.Person.PhoneNumber.Companion)),
                jsonName = "phones",
                value = pbandk.examples.addressbook.pb.Person::phones,
                mutableValue = pbandk.examples.addressbook.pb.MutablePerson::phones,
            )
        public val lastUpdated: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person, pbandk.wkt.Timestamp?> =
            pbandk.FieldDescriptor.of(
                messageDescriptor = pbandk.examples.addressbook.pb.Person::descriptor,
                name = "last_updated",
                number = 5,
                type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                jsonName = "lastUpdated",
                value = pbandk.examples.addressbook.pb.Person::lastUpdated,
                mutableValue = pbandk.examples.addressbook.pb.MutablePerson::lastUpdated,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.examples.addressbook.pb.Person> {
        public val defaultInstance: pbandk.examples.addressbook.pb.Person by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.examples.addressbook.pb.Person {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.Person> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "tutorial.Person",
                messageClass = pbandk.examples.addressbook.pb.Person::class,
                messageCompanion = this,
                builder = ::Person,
                fields = listOf(
                    pbandk.examples.addressbook.pb.Person.FieldDescriptors.name,
                    pbandk.examples.addressbook.pb.Person.FieldDescriptors.id,
                    pbandk.examples.addressbook.pb.Person.FieldDescriptors.email,
                    pbandk.examples.addressbook.pb.Person.FieldDescriptors.phones,
                    pbandk.examples.addressbook.pb.Person.FieldDescriptors.lastUpdated,
                ),
            )
        }

        @Deprecated(
            message = "Use Person.PhoneNumber { } instead",
            replaceWith = ReplaceWith(
                imports = ["pbandk.examples.addressbook.pb.Person.PhoneNumber"],
                expression = "Person.PhoneNumber {\nthis.number = number\nthis.type = type\nthis.unknownFields += unknownFields\n}",
            )
        )
        public fun PhoneNumber(
            number: String = "",
            type: pbandk.examples.addressbook.pb.Person.PhoneType = pbandk.examples.addressbook.pb.Person.PhoneType.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.examples.addressbook.pb.Person.PhoneNumber = pbandk.examples.addressbook.pb.Person.PhoneNumber {
            this.number = number
            this.type = type
            this.unknownFields += unknownFields
        }
    }

    public sealed class PhoneType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?): Boolean = other is pbandk.examples.addressbook.pb.Person.PhoneType && other.value == value
        override fun hashCode(): Int = value.hashCode()
        override fun toString(): String = "Person.PhoneType.${name ?: "UNRECOGNIZED"}(value=$value)"

        public object MOBILE : PhoneType(0, "MOBILE")
        public object HOME : PhoneType(1, "HOME")
        public object WORK : PhoneType(2, "WORK")
        public class UNRECOGNIZED(value: Int) : PhoneType(value)

        public companion object : pbandk.Message.Enum.Companion<pbandk.examples.addressbook.pb.Person.PhoneType> {
            public val values: List<Person.PhoneType> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                listOf(MOBILE, HOME, WORK)
            }

            override fun fromValue(value: Int): pbandk.examples.addressbook.pb.Person.PhoneType =
                values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)

            override fun fromName(name: String): pbandk.examples.addressbook.pb.Person.PhoneType =
                values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No PhoneType with name: $name")
        }
    }

    public sealed interface PhoneNumber : pbandk.Message {
        public val number: String
        public val type: pbandk.examples.addressbook.pb.Person.PhoneType

        override operator fun plus(other: pbandk.Message?): pbandk.examples.addressbook.pb.Person.PhoneNumber
        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.Person.PhoneNumber>

        /**
         * The [MutablePhoneNumber] passed as a receiver to the [builderAction] is valid only inside that function.
         * Using it outside of the function produces an unspecified behavior.
         */
        public fun copy(builderAction: pbandk.examples.addressbook.pb.Person.MutablePhoneNumber.() -> Unit): pbandk.examples.addressbook.pb.Person.PhoneNumber

        @Deprecated(
            message = "Use copy { } instead",
        )
        @pbandk.JsName("copyDeprecated")
        public fun copy(
            number: String = this.number,
            type: pbandk.examples.addressbook.pb.Person.PhoneType = this.type,
            unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
        ): pbandk.examples.addressbook.pb.Person.PhoneNumber

        @pbandk.PublicForGeneratedCode
        public object FieldDescriptors {
            public val number: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person.PhoneNumber, String> =
                pbandk.FieldDescriptor.of(
                    messageDescriptor = pbandk.examples.addressbook.pb.Person.PhoneNumber::descriptor,
                    name = "number",
                    number = 1,
                    type = pbandk.FieldDescriptor.Type.Primitive.String(),
                    jsonName = "number",
                    value = pbandk.examples.addressbook.pb.Person.PhoneNumber::number,
                    mutableValue = pbandk.examples.addressbook.pb.Person.MutablePhoneNumber::number,
                )
            public val type: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person.PhoneNumber, pbandk.examples.addressbook.pb.Person.PhoneType> =
                pbandk.FieldDescriptor.of(
                    messageDescriptor = pbandk.examples.addressbook.pb.Person.PhoneNumber::descriptor,
                    name = "type",
                    number = 2,
                    type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.examples.addressbook.pb.Person.PhoneType.Companion),
                    jsonName = "type",
                    value = pbandk.examples.addressbook.pb.Person.PhoneNumber::type,
                    mutableValue = pbandk.examples.addressbook.pb.Person.MutablePhoneNumber::type,
                )
        }

        public companion object : pbandk.Message.Companion<pbandk.examples.addressbook.pb.Person.PhoneNumber> {
            public val defaultInstance: pbandk.examples.addressbook.pb.Person.PhoneNumber by lazy(LazyThreadSafetyMode.PUBLICATION) {
                pbandk.examples.addressbook.pb.Person.PhoneNumber {}
            }

            override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.Person.PhoneNumber> by lazy {
                pbandk.MessageDescriptor.of(
                    fullName = "tutorial.Person.PhoneNumber",
                    messageClass = pbandk.examples.addressbook.pb.Person.PhoneNumber::class,
                    messageCompanion = this,
                    builder = Person.Companion::PhoneNumber,
                    fields = listOf(
                        pbandk.examples.addressbook.pb.Person.PhoneNumber.FieldDescriptors.number,
                        pbandk.examples.addressbook.pb.Person.PhoneNumber.FieldDescriptors.type,
                    ),
                )
            }
        }
    }

    public sealed interface MutablePhoneNumber : pbandk.examples.addressbook.pb.Person.PhoneNumber, pbandk.MutableMessage<pbandk.examples.addressbook.pb.Person.PhoneNumber> {
        public override var number: String
        public override var type: pbandk.examples.addressbook.pb.Person.PhoneType
    }
}

public sealed interface MutablePerson : pbandk.examples.addressbook.pb.Person, pbandk.MutableMessage<pbandk.examples.addressbook.pb.Person> {
    public override var name: String
    public override var id: Int
    public override var email: String
    public override val phones: MutableList<pbandk.examples.addressbook.pb.Person.PhoneNumber>
    public override var lastUpdated: pbandk.wkt.Timestamp?
}

public sealed interface AddressBook : pbandk.Message {
    public val people: List<pbandk.examples.addressbook.pb.Person>

    override operator fun plus(other: pbandk.Message?): pbandk.examples.addressbook.pb.AddressBook
    override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.AddressBook>

    /**
     * The [MutableAddressBook] passed as a receiver to the [builderAction] is valid only inside that function.
     * Using it outside of the function produces an unspecified behavior.
     */
    public fun copy(builderAction: pbandk.examples.addressbook.pb.MutableAddressBook.() -> Unit): pbandk.examples.addressbook.pb.AddressBook

    @Deprecated(
        message = "Use copy { } instead",
    )
    @pbandk.JsName("copyDeprecated")
    public fun copy(
        people: List<pbandk.examples.addressbook.pb.Person> = this.people,
        unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
    ): pbandk.examples.addressbook.pb.AddressBook

    @pbandk.PublicForGeneratedCode
    public object FieldDescriptors {
        public val people: pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.AddressBook, List<pbandk.examples.addressbook.pb.Person>> =
            pbandk.FieldDescriptor.ofRepeated(
                messageDescriptor = pbandk.examples.addressbook.pb.AddressBook::descriptor,
                name = "people",
                number = 1,
                type = pbandk.FieldDescriptor.Type.Repeated<pbandk.examples.addressbook.pb.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.examples.addressbook.pb.Person.Companion)),
                jsonName = "people",
                value = pbandk.examples.addressbook.pb.AddressBook::people,
                mutableValue = pbandk.examples.addressbook.pb.MutableAddressBook::people,
            )
    }

    public companion object : pbandk.Message.Companion<pbandk.examples.addressbook.pb.AddressBook> {
        public val defaultInstance: pbandk.examples.addressbook.pb.AddressBook by lazy(LazyThreadSafetyMode.PUBLICATION) {
            pbandk.examples.addressbook.pb.AddressBook {}
        }

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.AddressBook> by lazy {
            pbandk.MessageDescriptor.of(
                fullName = "tutorial.AddressBook",
                messageClass = pbandk.examples.addressbook.pb.AddressBook::class,
                messageCompanion = this,
                builder = ::AddressBook,
                fields = listOf(
                    pbandk.examples.addressbook.pb.AddressBook.FieldDescriptors.people,
                ),
            )
        }
    }
}

public sealed interface MutableAddressBook : pbandk.examples.addressbook.pb.AddressBook, pbandk.MutableMessage<pbandk.examples.addressbook.pb.AddressBook> {
    public override val people: MutableList<pbandk.examples.addressbook.pb.Person>
}

@Deprecated(
    message = "Use Person { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.examples.addressbook.pb.Person"],
        expression = "Person {\nthis.name = name\nthis.id = id\nthis.email = email\nthis.phones += phones\nthis.lastUpdated = lastUpdated\nthis.unknownFields += unknownFields\n}",
    )
)
public fun Person(
    name: String = "",
    id: Int = 0,
    email: String = "",
    phones: List<pbandk.examples.addressbook.pb.Person.PhoneNumber> = emptyList(),
    lastUpdated: pbandk.wkt.Timestamp? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.examples.addressbook.pb.Person = pbandk.examples.addressbook.pb.Person {
    this.name = name
    this.id = id
    this.email = email
    this.phones += phones
    this.lastUpdated = lastUpdated
    this.unknownFields += unknownFields
}

/**
 * The [MutablePerson] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildPerson")
public fun Person(builderAction: pbandk.examples.addressbook.pb.MutablePerson.() -> Unit): pbandk.examples.addressbook.pb.Person =
    pbandk.examples.addressbook.pb.MutablePerson_Impl(
        name = "",
        id = 0,
        email = "",
        phones = pbandk.gen.MutableListField(),
        lastUpdated = null,
    ).also(builderAction).toPerson()

@pbandk.Export
@pbandk.JsName("orDefaultForPerson")
public fun Person?.orDefault(): pbandk.examples.addressbook.pb.Person = this ?: pbandk.examples.addressbook.pb.Person.defaultInstance

private class Person_Impl(
    override val name: String,
    override val id: Int,
    override val email: String,
    override val phones: pbandk.gen.ListField<pbandk.examples.addressbook.pb.Person.PhoneNumber>,
    override val lastUpdated: pbandk.wkt.Timestamp?,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.examples.addressbook.pb.Person, pbandk.gen.GeneratedMessage<pbandk.examples.addressbook.pb.Person>(unknownFields) {
    override val descriptor get() = pbandk.examples.addressbook.pb.Person.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.addressbook.pb.MutablePerson.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        id: Int,
        email: String,
        phones: List<pbandk.examples.addressbook.pb.Person.PhoneNumber>,
        lastUpdated: pbandk.wkt.Timestamp?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.examples.addressbook.pb.Person {
        this.name = name
        this.id = id
        this.email = email
        this.phones += phones
        this.lastUpdated = lastUpdated
        this.unknownFields += unknownFields
    }
}

private class MutablePerson_Impl(
    override var name: String,
    override var id: Int,
    override var email: String,
    override val phones: pbandk.gen.MutableListField<pbandk.examples.addressbook.pb.Person.PhoneNumber>,
    override var lastUpdated: pbandk.wkt.Timestamp?,
) : pbandk.examples.addressbook.pb.MutablePerson, pbandk.gen.MutableGeneratedMessage<pbandk.examples.addressbook.pb.Person>() {
    override val descriptor get() = pbandk.examples.addressbook.pb.Person.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.addressbook.pb.MutablePerson.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        name: String,
        id: Int,
        email: String,
        phones: List<pbandk.examples.addressbook.pb.Person.PhoneNumber>,
        lastUpdated: pbandk.wkt.Timestamp?,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toPerson() = Person_Impl(
        name = name,
        id = id,
        email = email,
        phones = phones.toListField(),
        lastUpdated = lastUpdated,
        unknownFields = unknownFields.toMap()
    )
}

/**
 * The [MutablePhoneNumber] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildPersonPhoneNumber")
public fun Person.Companion.PhoneNumber(builderAction: pbandk.examples.addressbook.pb.Person.MutablePhoneNumber.() -> Unit): pbandk.examples.addressbook.pb.Person.PhoneNumber =
    pbandk.examples.addressbook.pb.Person_MutablePhoneNumber_Impl(
        number = "",
        type = pbandk.examples.addressbook.pb.Person.PhoneType.fromValue(0),
    ).also(builderAction).toPhoneNumber()

/**
 * The [MutablePhoneNumber] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
public fun MutablePerson.PhoneNumber(builderAction: pbandk.examples.addressbook.pb.Person.MutablePhoneNumber.() -> Unit): pbandk.examples.addressbook.pb.Person.PhoneNumber =
    pbandk.examples.addressbook.pb.Person.PhoneNumber(builderAction)

@pbandk.Export
@pbandk.JsName("orDefaultForPersonPhoneNumber")
public fun Person.PhoneNumber?.orDefault(): pbandk.examples.addressbook.pb.Person.PhoneNumber = this ?: pbandk.examples.addressbook.pb.Person.PhoneNumber.defaultInstance

private class Person_PhoneNumber_Impl(
    override val number: String,
    override val type: pbandk.examples.addressbook.pb.Person.PhoneType,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.examples.addressbook.pb.Person.PhoneNumber, pbandk.gen.GeneratedMessage<pbandk.examples.addressbook.pb.Person.PhoneNumber>(unknownFields) {
    override val descriptor get() = pbandk.examples.addressbook.pb.Person.PhoneNumber.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.addressbook.pb.Person.MutablePhoneNumber.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        number: String,
        type: pbandk.examples.addressbook.pb.Person.PhoneType,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.examples.addressbook.pb.Person.PhoneNumber {
        this.number = number
        this.type = type
        this.unknownFields += unknownFields
    }
}

private class Person_MutablePhoneNumber_Impl(
    override var number: String,
    override var type: pbandk.examples.addressbook.pb.Person.PhoneType,
) : pbandk.examples.addressbook.pb.Person.MutablePhoneNumber, pbandk.gen.MutableGeneratedMessage<pbandk.examples.addressbook.pb.Person.PhoneNumber>() {
    override val descriptor get() = pbandk.examples.addressbook.pb.Person.PhoneNumber.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.addressbook.pb.Person.MutablePhoneNumber.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        number: String,
        type: pbandk.examples.addressbook.pb.Person.PhoneType,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toPhoneNumber() = Person_PhoneNumber_Impl(
        number = number,
        type = type,
        unknownFields = unknownFields.toMap()
    )
}

@Deprecated(
    message = "Use AddressBook { } instead",
    replaceWith = ReplaceWith(
        imports = ["pbandk.examples.addressbook.pb.AddressBook"],
        expression = "AddressBook {\nthis.people += people\nthis.unknownFields += unknownFields\n}",
    )
)
public fun AddressBook(
    people: List<pbandk.examples.addressbook.pb.Person> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): pbandk.examples.addressbook.pb.AddressBook = pbandk.examples.addressbook.pb.AddressBook {
    this.people += people
    this.unknownFields += unknownFields
}

/**
 * The [MutableAddressBook] passed as a receiver to the [builderAction] is valid only inside that function.
 * Using it outside of the function produces an unspecified behavior.
 */
@pbandk.Export
@pbandk.JsName("buildAddressBook")
public fun AddressBook(builderAction: pbandk.examples.addressbook.pb.MutableAddressBook.() -> Unit): pbandk.examples.addressbook.pb.AddressBook =
    pbandk.examples.addressbook.pb.MutableAddressBook_Impl(
        people = pbandk.gen.MutableListField(),
    ).also(builderAction).toAddressBook()

@pbandk.Export
@pbandk.JsName("orDefaultForAddressBook")
public fun AddressBook?.orDefault(): pbandk.examples.addressbook.pb.AddressBook = this ?: pbandk.examples.addressbook.pb.AddressBook.defaultInstance

private class AddressBook_Impl(
    override val people: pbandk.gen.ListField<pbandk.examples.addressbook.pb.Person>,
    unknownFields: Map<Int, pbandk.UnknownField>
) : pbandk.examples.addressbook.pb.AddressBook, pbandk.gen.GeneratedMessage<pbandk.examples.addressbook.pb.AddressBook>(unknownFields) {
    override val descriptor get() = pbandk.examples.addressbook.pb.AddressBook.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.addressbook.pb.MutableAddressBook.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        people: List<pbandk.examples.addressbook.pb.Person>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = pbandk.examples.addressbook.pb.AddressBook {
        this.people += people
        this.unknownFields += unknownFields
    }
}

private class MutableAddressBook_Impl(
    override val people: pbandk.gen.MutableListField<pbandk.examples.addressbook.pb.Person>,
) : pbandk.examples.addressbook.pb.MutableAddressBook, pbandk.gen.MutableGeneratedMessage<pbandk.examples.addressbook.pb.AddressBook>() {
    override val descriptor get() = pbandk.examples.addressbook.pb.AddressBook.descriptor

    @Suppress("RedundantOverride")
    override fun copy(builderAction: pbandk.examples.addressbook.pb.MutableAddressBook.() -> Unit) = super.copy(builderAction)

    @Deprecated("Use copy { } instead")
    override fun copy(
        people: List<pbandk.examples.addressbook.pb.Person>,
        unknownFields: Map<Int, pbandk.UnknownField>
    ) = throw UnsupportedOperationException()

    fun toAddressBook() = AddressBook_Impl(
        people = people.toListField(),
        unknownFields = unknownFields.toMap()
    )
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.examples.addressbook.pb

@pbandk.Export
data class Person(
    val name: String = "",
    val id: Int = 0,
    val email: String = "",
    val phones: List<pbandk.examples.addressbook.pb.Person.PhoneNumber> = emptyList(),
    val lastUpdated: pbandk.wkt.Timestamp? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.examples.addressbook.pb.Person> {
        val defaultInstance by lazy { pbandk.examples.addressbook.pb.Person() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.examples.addressbook.pb.Person.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.Person> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.examples.addressbook.pb.Person::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "id",
                        value = pbandk.examples.addressbook.pb.Person::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = pbandk.examples.addressbook.pb.Person::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "phones",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.examples.addressbook.pb.Person.PhoneNumber>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.examples.addressbook.pb.Person.PhoneNumber.Companion)),
                        jsonName = "phones",
                        value = pbandk.examples.addressbook.pb.Person::phones
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_updated",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "lastUpdated",
                        value = pbandk.examples.addressbook.pb.Person::lastUpdated
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "tutorial.Person",
                messageClass = pbandk.examples.addressbook.pb.Person::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class PhoneType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is Person.PhoneType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "Person.PhoneType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object MOBILE : PhoneType(0, "MOBILE")
        object HOME : PhoneType(1, "HOME")
        object WORK : PhoneType(2, "WORK")
        class UNRECOGNIZED(value: Int) : PhoneType(value)

        companion object : pbandk.Message.Enum.Companion<Person.PhoneType> {
            val values: List<Person.PhoneType> by lazy { listOf(MOBILE, HOME, WORK) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No PhoneType with name: $name")
        }
    }

    data class PhoneNumber(
        val number: String = "",
        val type: pbandk.examples.addressbook.pb.Person.PhoneType = pbandk.examples.addressbook.pb.Person.PhoneType.fromValue(0),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<pbandk.examples.addressbook.pb.Person.PhoneNumber> {
            val defaultInstance by lazy { pbandk.examples.addressbook.pb.Person.PhoneNumber() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.examples.addressbook.pb.Person.PhoneNumber.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.Person.PhoneNumber> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.Person.PhoneNumber, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "number",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "number",
                            value = pbandk.examples.addressbook.pb.Person.PhoneNumber::number
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "type",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.examples.addressbook.pb.Person.PhoneType.Companion),
                            jsonName = "type",
                            value = pbandk.examples.addressbook.pb.Person.PhoneNumber::type
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    fullName = "tutorial.Person.PhoneNumber",
                    messageClass = pbandk.examples.addressbook.pb.Person.PhoneNumber::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

@pbandk.Export
data class AddressBook(
    val people: List<pbandk.examples.addressbook.pb.Person> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.examples.addressbook.pb.AddressBook> {
        val defaultInstance by lazy { pbandk.examples.addressbook.pb.AddressBook() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.examples.addressbook.pb.AddressBook.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.examples.addressbook.pb.AddressBook> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.examples.addressbook.pb.AddressBook, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.examples.addressbook.pb.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.examples.addressbook.pb.Person.Companion)),
                        jsonName = "people",
                        value = pbandk.examples.addressbook.pb.AddressBook::people
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "tutorial.AddressBook",
                messageClass = pbandk.examples.addressbook.pb.AddressBook::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForPerson")
fun Person?.orDefault() = this ?: Person.defaultInstance

private fun Person.protoMergeImpl(plus: pbandk.Message?): Person = (plus as? Person)?.let {
    it.copy(
        phones = phones + plus.phones,
        lastUpdated = lastUpdated?.plus(plus.lastUpdated) ?: plus.lastUpdated,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Person.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Person {
    var name = ""
    var id = 0
    var email = ""
    var phones: pbandk.ListWithSize.Builder<pbandk.examples.addressbook.pb.Person.PhoneNumber>? = null
    var lastUpdated: pbandk.wkt.Timestamp? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> id = _fieldValue as Int
            3 -> email = _fieldValue as String
            4 -> phones = (phones ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.examples.addressbook.pb.Person.PhoneNumber> }
            5 -> lastUpdated = _fieldValue as pbandk.wkt.Timestamp
        }
    }
    return Person(name, id, email, pbandk.ListWithSize.Builder.fixed(phones),
        lastUpdated, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPersonPhoneNumber")
fun Person.PhoneNumber?.orDefault() = this ?: Person.PhoneNumber.defaultInstance

private fun Person.PhoneNumber.protoMergeImpl(plus: pbandk.Message?): Person.PhoneNumber = (plus as? Person.PhoneNumber)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Person.PhoneNumber.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Person.PhoneNumber {
    var number = ""
    var type: pbandk.examples.addressbook.pb.Person.PhoneType = pbandk.examples.addressbook.pb.Person.PhoneType.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> number = _fieldValue as String
            2 -> type = _fieldValue as pbandk.examples.addressbook.pb.Person.PhoneType
        }
    }
    return Person.PhoneNumber(number, type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAddressBook")
fun AddressBook?.orDefault() = this ?: AddressBook.defaultInstance

private fun AddressBook.protoMergeImpl(plus: pbandk.Message?): AddressBook = (plus as? AddressBook)?.let {
    it.copy(
        people = people + plus.people,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AddressBook.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AddressBook {
    var people: pbandk.ListWithSize.Builder<pbandk.examples.addressbook.pb.Person>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.examples.addressbook.pb.Person> }
        }
    }
    return AddressBook(pbandk.ListWithSize.Builder.fixed(people), unknownFields)
}

package pbandk.examples.addressbook

import pbandk.examples.addressbook.pb.AddressBook
import pbandk.examples.addressbook.pb.Person
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    when (args.firstOrNull()) {
        "list-people" -> listPeople(args.getOrElse(1) { error("Filename required") })
        "add-person" -> addPerson(args.getOrElse(1) { error("Filename required") })
        else -> error("Command is either 'add-person' or 'list-people'")
    }
}

fun listPeople(fileName: String) {
    val book = readBook(fileName) ?: error("File not found")
    book.people.forEach { person ->
        println("Person ID: ${person.id}")
        println("  Name: ${person.name}")
        if (person.email.isNotEmpty()) println("  E-mail address: : ${person.email}")
        person.phones.forEach { phone ->
            when (phone.type) {
                Person.PhoneType.MOBILE -> println("  Mobile phone #: ${phone.number}")
                Person.PhoneType.HOME -> println("  Home phone #: ${phone.number}")
                Person.PhoneType.WORK -> println("  Work phone #: ${phone.number}")
                else -> println("  Unknown phone #: ${phone.number}")
            }
        }
    }
}

fun addPerson(fileName: String) {
    // Read existing book
    val book = readBook(fileName) ?: AddressBook()
    // Prompt
    fun prompt(text: String) = print(text).let { readLine() ?: error("Stdin closed") }
    val person = Person(
        id = prompt("Enter person ID: ").toInt(),
        name = prompt("Enter name: "),
        email = prompt("Enter email address (blank for none): "),
        phones = mutableListOf<Person.PhoneNumber>().also { phones ->
            while (true) phones += Person.PhoneNumber(
                number = prompt("Enter a phone number (or leave blank to finish): ").takeIf { !it.isEmpty() } ?: break,
                type = when (prompt("Is this a mobile, home, or work phone? ")) {
                    "mobile" -> Person.PhoneType.MOBILE
                    "home" -> Person.PhoneType.HOME
                    "work" -> Person.PhoneType.WORK
                    else -> println("Unknown phone type.  Using default.").let { Person.PhoneType.fromValue(0) }
                }
            )
        }
    )
    // Save it back out
    Files.write(Paths.get(fileName), book.copy(people = book.people + person).protoMarshal())
}

fun readBook(fileName: String) = Paths.get(fileName).let { filePath ->
    if (!Files.isRegularFile(filePath)) null
    else AddressBook.protoUnmarshal(Files.readAllBytes(filePath))
}
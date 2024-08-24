@file:OptIn(ExperimentalProtoJson::class)

package pbandk.examples.browserjs

import kotlinx.browser.document
import kotlinx.browser.localStorage
import kotlinx.browser.window
import org.w3c.dom.*
import pbandk.ExperimentalProtoJson
import pbandk.examples.browserjs.pb.AddressBook
import pbandk.examples.browserjs.pb.Person
import pbandk.json.JsonConfig
import pbandk.json.decodeFromJsonString
import pbandk.json.encodeToJsonString

fun main(args: Array<String>) {
    // When ready, create the DOM
    document.addEventListener("DOMContentLoaded", {
        document.getElementById("personBody")?.apply {
            insertAdjacentHTML("beforeend", "Address Book:<br />")
            insertAdjacentElement("beforeend", createTable())
        }
    })
}

val JSON_CONFIG = JsonConfig.DEFAULT.copy(
    compactOutput = true,
    ignoreUnknownFieldsInInput = true,
)

// I'm just being lazy/inefficient because I don't want to mess with IndexedDB
fun loadBook() = localStorage["addressBook"]?.let { str ->
    AddressBook.decodeFromJsonString(str, JSON_CONFIG)
} ?: AddressBook()
fun saveBook(book: AddressBook) {
    localStorage["addressBook"] = book.encodeToJsonString(JSON_CONFIG)
}

fun createTable() = createElem("table").apply {
    insertAdjacentHTML("beforeend", """
        <thead>
            <tr>
                <td rowspan="2">ID</td>
                <td rowspan="2">Name</td>
                <td rowspan="2">Email</td>
                <td colspan="2">Primary Phone</td>
                <td rowspan="2"></td>
            </tr>
            <tr>
                <td>Type</td>
                <td>Number</td>
            </tr>
        </thead>
    """.trimIndent())
    val tbody = loadInitialBody().also { appendChild(it) }
    appendChild(createFooterForm(tbody))
}

fun loadInitialBody() = createElem("tbody").also { refreshBody(it, loadBook()) }

fun refreshBody(tbody: Element, book: AddressBook) {
    // Being lazy and completely reloading
    tbody.innerHTML = ""
    book.people.forEachIndexed { index, person ->
        // Row for person
        tbody.appendChild(createElem("tr").also { tr ->
            // Create set of strings
            val typeAndNumber = person.phones.firstOrNull()?.let {
                listOf(
                    when (it.type.value) {
                        0 -> "Mobile"
                        1 -> "Home"
                        2 -> "Work"
                        else -> "Unknown"
                    },
                    it.number
                )
            } ?: listOf("(none)", "")
            val strings = listOf(person.id.toString(), person.name, person.email) + typeAndNumber
            // As cols
            var tds = strings.map { str -> createTypedElem<HTMLElement>("td").also { it.innerText = str } }
            // Delete button
            tds += createTypedElem<HTMLElement>("td").also { td ->
                td.appendChild(createTypedElem<HTMLAnchorElement>("a").also { a ->
                    a.href = "#"
                    a.innerHTML = "DELETE"
                    a.onclick = {
                        if (window.confirm("Are you sure you want to delete '${person.name}' (${person.id})?"))
                            refreshBody(tbody, removePerson(index, book))
                        false
                    }
                })
            }
            // Add to body
            tds.forEach { tr.appendChild(it) }
        })
    }
}

fun createFooterForm(tbody: Element) = createElem("tfoot").also { tfoot ->
    tfoot.setAttribute("style", "border-top: 5px solid black")
    val tr = createElem("tr").also { tfoot.appendChild(it) }
    val idText = createTypedElem<HTMLInputElement>("input").also { input ->
        input.type = "number"
        input.required = true
        tr.appendChild(createElem("td").also { it.appendChild(input) })
    }
    val nameText = createTypedElem<HTMLInputElement>("input").also { input ->
        input.type = "text"
        input.required = true
        tr.appendChild(createElem("td").also { it.appendChild(input) })
    }
    val emailText = createTypedElem<HTMLInputElement>("input").also { input ->
        input.type = "email"
        input.required = true
        tr.appendChild(createElem("td").also { it.appendChild(input) })
    }
    lateinit var phoneText: HTMLInputElement
    val phoneSelect = createTypedElem<HTMLSelectElement>("select").also { select ->
        // We increase each by one to not trigger emptyness for "0"
        select.innerHTML = """
            <option value="">None</option>
            <option value="0">Mobile</option>
            <option value="1">Home</option>
            <option value="2">Work</option>
        """.trimIndent()
        tr.appendChild(createElem("td").also { it.appendChild(select) })
        select.onchange = {
            if (select.value.isEmpty()) {
                phoneText.value = ""
                phoneText.disabled = true
                phoneText.required = false
            } else {
                phoneText.disabled = false
                phoneText.required = true
            }
        }
    }
    phoneText = createTypedElem<HTMLInputElement>("input").also { input ->
        input.type = "tel"
        tr.appendChild(createElem("td").also { it.appendChild(input) })
    }

    fun resetForm() {
        idText.value = ""
        nameText.value = ""
        emailText.value = ""
        phoneSelect.value = ""
        phoneText.value = ""
        phoneText.disabled = true
        phoneText.required = false
    }
    resetForm()

    createTypedElem<HTMLButtonElement>("button").also { button ->
        button.innerText = "Add Person"
        tr.appendChild(createElem("td").also { it.appendChild(button) })
        button.onclick = {
            val id = if (!idText.reportValidity()) null else idText.value.toIntOrNull().also { idVal ->
                if (idVal == null) {
                    idText.setCustomValidity("Not integer")
                    idText.reportValidity()
                }
            }
            val name = nameText.value.takeIf { nameText.reportValidity() }
            val email = emailText.value.takeIf { emailText.reportValidity() }
            val phoneType = phoneSelect.value.takeIf { it.isNotEmpty() }?.toInt()
            val phoneNumber = phoneText.value.takeIf { phoneSelect.value.isNotEmpty() && phoneText.reportValidity() }
            if (id != null && name != null && email != null && (phoneType == null) == (phoneNumber == null)) {
                refreshBody(tbody, addPerson(id, name, email, phoneType, phoneNumber))
                resetForm()
            }
        }
    }
}

fun addPerson(id: Int, name: String, email: String, phoneType: Int?, phoneNumber: String?) = loadBook().let { book ->
    val phone =
        if (phoneType == null || phoneNumber == null) null
        else Person.PhoneNumber(phoneNumber, Person.PhoneType.fromValue(phoneType))
    book.copy(
        people = (book.people + Person(name, id, email, listOfNotNull(phone))).sortedBy { it.id }
    ).also(::saveBook)
}

fun removePerson(index: Int, book: AddressBook) = book.copy(
    people = book.people.filterIndexed { i, _ -> i != index }
).also(::saveBook)


@Suppress("NOTHING_TO_INLINE")
inline fun createElem(name: String) = document.createElement(name)
@Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
inline fun <T : Element> createTypedElem(name: String) = document.createElement(name) as T

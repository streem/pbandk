package pbandk.gen

import kotlin.test.Test
import kotlin.test.assertEquals

class CodeGeneratorTest {
    @Test
    fun testOneOfFields_FullyQualifiedSameMessageName() {
        val stdField = { number: Int, name: String, type: File.Field.Type, fieldName: String, typeName: String ->
            File.Field.Numbered.Standard(
                number,
                name,
                type,
                null,
                false,
                fieldName,
                optional = false,
                packed = false,
                map = false,
                kotlinFieldName = fieldName,
                kotlinLocalTypeName = typeName
            )
        }

        val file = File(
            "sample.proto",
            "FooBar",
            "foobar",
            1,
            listOf(
                File.Type.Message(
                    "Person",
                    listOf(
                        File.Field.OneOf(
                            "Person", listOf(
                                stdField(1, "int_val", File.Field.Type.INT32, "intVal", "IntVal"),
                                stdField(2, "str_val", File.Field.Type.STRING, "strVal", "StrVal")
                            ),
                            mapOf(
                                "int_val" to "IntVal",
                                "str_val" to "StrVal"
                            ),
                            "person",
                            "Person"
                        )
                    ),
                    emptyList(),
                    false,
                    "Person"
                )
            )
        )

        val expected = """
            @file:OptIn(pbandk.PublicForGeneratedCode::class)

            package foobar

            data class Person(
                val person: Person<*>? = null,
                override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ) : pbandk.Message {
                sealed class Person<V>(value: V) : pbandk.Message.OneOf<V>(value) {
                    class IntVal(intVal: IntVal = 0) : Person<IntVal>(intVal)
                    class StrVal(strVal: StrVal = "") : Person<StrVal>(strVal)
                }

                val intVal: IntVal?
                    get() = (person as? Person.IntVal)?.value
                val strVal: StrVal?
                    get() = (person as? Person.StrVal)?.value

                override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
                override val descriptor get() = Companion.descriptor
                override val protoSize by lazy { super.protoSize }
                companion object : pbandk.Message.Companion<foobar.Person> {
                    val defaultInstance by lazy { foobar.Person() }
                    override fun decodeWith(u: pbandk.MessageDecoder) = foobar.Person.decodeWithImpl(u)

                    override val descriptor: pbandk.MessageDescriptor<foobar.Person> by lazy {
                        val fieldsList = ArrayList<pbandk.FieldDescriptor<foobar.Person, *>>(2).apply {
                            add(
                                pbandk.FieldDescriptor(
                                    messageDescriptor = this@Companion::descriptor,
                                    name = "int_val",
                                    number = 1,
                                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                                    oneofMember = true,
                                    jsonName = "intVal",
                                    value = foobar.Person::intVal
                                )
                            )
                            add(
                                pbandk.FieldDescriptor(
                                    messageDescriptor = this@Companion::descriptor,
                                    name = "str_val",
                                    number = 2,
                                    type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                                    oneofMember = true,
                                    jsonName = "strVal",
                                    value = foobar.Person::strVal
                                )
                            )
                        }
                        pbandk.MessageDescriptor(
                            messageClass = foobar.Person::class,
                            messageCompanion = this,
                            fields = fieldsList
                        )
                    }
                }
            }

            fun Person?.orDefault() = this ?: Person.defaultInstance

            private fun Person.protoMergeImpl(plus: pbandk.Message?): Person = (plus as? Person)?.copy(
                person = plus.person ?: person,
                unknownFields = unknownFields + plus.unknownFields
            ) ?: this

            @Suppress("UNCHECKED_CAST")
            private fun Person.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Person {
                var person: Person.Person<*>? = null

                val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
                    when (_fieldNumber) {
                        1 -> person = Person.Person.IntVal(_fieldValue as IntVal)
                        2 -> person = Person.Person.StrVal(_fieldValue as StrVal)
                    }
                }
                return Person(person, unknownFields)
            }
            
            """.trimIndent()

        val codegen = CodeGenerator(file, emptyMap(), emptyMap())
        val actual = codegen.generate()

        assertEquals(expected, actual)
    }
}
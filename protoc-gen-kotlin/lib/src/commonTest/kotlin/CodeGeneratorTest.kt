package pbandk

import pbandk.gen.CodeGenerator
import pbandk.gen.File
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
                    "Value",
                    listOf(
                        File.Field.OneOf(
                            "Value", listOf(
                                stdField(1, "int_val", File.Field.Type.INT32, "intVal", "IntVal"),
                                stdField(2, "str_val", File.Field.Type.STRING, "strVal", "StrVal")
                            ),
                            mapOf(
                                "int_val" to "IntVal",
                                "str_val" to "StrVal"
                            ),
                            "value",
                            "Value"
                        )
                    ),
                    emptyList(),
                    false,
                    "Value"
                )
            )
        )

        val expected = """
            @file:OptIn(pbandk.PublicForGeneratedCode::class)

            package foobar

            data class Value(
                val value: Value<*>? = null,
                override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ) : pbandk.Message {
                sealed class Value<V>(value: V) : pbandk.Message.OneOf<V>(value) {
                    class IntVal(intVal: IntVal = 0) : Value<IntVal>(intVal)
                    class StrVal(strVal: StrVal = "") : Value<StrVal>(strVal)
                }

                val intVal: IntVal?
                    get() = (value as? Value.IntVal)?.value
                val strVal: StrVal?
                    get() = (value as? Value.StrVal)?.value

                override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
                override val descriptor get() = Companion.descriptor
                override val protoSize by lazy { super.protoSize }
                companion object : pbandk.Message.Companion<foobar.Value> {
                    val defaultInstance by lazy { foobar.Value() }
                    override fun decodeWith(u: pbandk.MessageDecoder) = foobar.Value.decodeWithImpl(u)

                    override val descriptor: pbandk.MessageDescriptor<foobar.Value> by lazy {
                        val fieldsList = ArrayList<pbandk.FieldDescriptor<foobar.Value, *>>(2).apply {
                            add(
                                pbandk.FieldDescriptor(
                                    messageDescriptor = this@Companion::descriptor,
                                    name = "int_val",
                                    number = 1,
                                    type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                                    oneofMember = true,
                                    jsonName = "intVal",
                                    value = foobar.Value::intVal
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
                                    value = foobar.Value::strVal
                                )
                            )
                        }
                        pbandk.MessageDescriptor(
                            messageClass = foobar.Value::class,
                            messageCompanion = this,
                            fields = fieldsList
                        )
                    }
                }
            }

            fun Value?.orDefault() = this ?: Value.defaultInstance

            private fun Value.protoMergeImpl(plus: pbandk.Message?): Value = (plus as? Value)?.copy(
                value = plus.value ?: value,
                unknownFields = unknownFields + plus.unknownFields
            ) ?: this

            @Suppress("UNCHECKED_CAST")
            private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Value {
                var value: Value.Value<*>? = null

                val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
                    when (_fieldNumber) {
                        1 -> value = Value.Value.IntVal(_fieldValue as IntVal)
                        2 -> value = Value.Value.StrVal(_fieldValue as StrVal)
                    }
                }
                return Value(value, unknownFields)
            }
            
            """.trimIndent()

        val codegen = CodeGenerator(file, emptyMap(), emptyMap())
        val actual = codegen.generate()

        assertEquals(expected, actual)
    }
}

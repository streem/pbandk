package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.ListValue
import pbandk.wkt.NullValue
import pbandk.wkt.Struct
import pbandk.wkt.Value
import kotlin.test.Test
import kotlin.test.assertEquals

class StructAndValueTest {
    @Test
    fun testStructField_withStrings() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key", "value")
            })
        }.toString()
        val expectedStruct = Struct {
            fields = mapOf("key" to Value {
                stringValue = "value"
            })
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNumbers() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key", 1.0)
            })
        }.toString()
        val expectedStruct = Struct {
            fields = mapOf("key" to Value {
                numberValue = 1.0
            })
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withList() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key", buildJsonArray {
                    add("value1")
                    add("value2")
                })
            })
        }.toString()
        val expectedStruct = Struct {
            fields = mapOf(
                "key" to Value {
                    listValue = ListValue {
                        values = listOf(
                            Value { stringValue = "value1" },
                            Value { stringValue = "value2" }
                        )
                    }
                }
            )
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withStruct() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key", buildJsonObject {
                    put("innerKey", "value")
                })
            })
        }.toString()
        val expectedStruct = Struct {
            fields = mapOf(
                "key" to Value {
                    structValue = Struct {
                        fields = mapOf("innerKey" to Value { stringValue = "value" })
                    }
                }
            )
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNull() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key", JsonNull)
            })
        }.toString()
        val expectedStruct = Struct { fields = mapOf("key" to Value { nullValue = NullValue.NULL_VALUE }) }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNumberString() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key", "1.0")
            })
        }.toString()
        val expectedStruct = Struct { fields = mapOf("key" to Value { stringValue = "1.0" }) }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }


    @Test
    fun testStructField_withMix() {
        val json = buildJsonObject {
            put("optionalStruct", buildJsonObject {
                put("key1", 1.0)
                put("key2", "TWO")
                put("key3", buildJsonArray {
                    add("value1")
                    add("value2")
                })
                put("key4", true)
                put("key5", JsonNull)
            })
        }.toString()

        val expectedStruct = Struct {
            fields = mapOf(
                "key1" to Value { numberValue = 1.0 },
                "key2" to Value { stringValue = "TWO" },
                "key3" to Value {
                    listValue = ListValue {
                        values = listOf(
                            Value { stringValue = "value1" },
                            Value { stringValue = "value2" },
                        )
                    }
                },
                "key4" to Value { boolValue = true },
                "key5" to Value { nullValue = NullValue.NULL_VALUE },
            )
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testRepeatedList() {
        val json = buildJsonObject {
            put("repeatedListValue", buildJsonArray {
                add(buildJsonArray { add("a") })
            })
        }.toString()
        val expectedRepeatedList = listOf(ListValue { values = listOf(Value { stringValue = "a" }) })

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedRepeatedList, testAllTypesProto3.repeatedListValue)
    }

    @Test
    fun testValueField_null() {
        val json = buildJsonObject { put("optionalValue", JsonNull) }.toString()
        val expectedValue = Value { nullValue = NullValue.NULL_VALUE }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedValue, testAllTypesProto3.optionalValue)
    }
}
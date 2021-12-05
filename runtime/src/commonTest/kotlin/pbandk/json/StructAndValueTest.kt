package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.NullValue
import pbandk.wkt.listValue
import pbandk.wkt.struct
import pbandk.wkt.value
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
        val expectedStruct = struct {
            fields = mapOf("key" to value {
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
        val expectedStruct = struct {
            fields = mapOf("key" to value {
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
        val expectedStruct = struct {
            fields = mapOf(
                "key" to value {
                    listValue = listValue {
                        values = listOf(
                            value { stringValue = "value1" },
                            value { stringValue = "value2" }
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
        val expectedStruct = struct {
            fields = mapOf(
                "key" to value {
                    structValue = struct {
                        fields = mapOf("innerKey" to value { stringValue = "value" })
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
        val expectedStruct = struct { fields = mapOf("key" to value { nullValue = NullValue.NULL_VALUE }) }

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
        val expectedStruct = struct { fields = mapOf("key" to value { stringValue = "1.0" }) }

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

        val expectedStruct = struct {
            fields = mapOf(
                "key1" to value { numberValue = 1.0 },
                "key2" to value { stringValue = "TWO" },
                "key3" to value {
                    listValue = listValue {
                        values = listOf(
                            value { stringValue = "value1" },
                            value { stringValue = "value2" },
                        )
                    }
                },
                "key4" to value { boolValue = true },
                "key5" to value { nullValue = NullValue.NULL_VALUE },
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
        val expectedRepeatedList = listOf(listValue { values = listOf(value { stringValue = "a" }) })

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedRepeatedList, testAllTypesProto3.repeatedListValue)
    }

    @Test
    fun testValueField_null() {
        val json = buildJsonObject { put("optionalValue", JsonNull) }.toString()
        val expectedValue = value { nullValue = NullValue.NULL_VALUE }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedValue, testAllTypesProto3.optionalValue)
    }
}
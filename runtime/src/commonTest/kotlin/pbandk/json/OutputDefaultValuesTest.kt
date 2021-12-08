package pbandk.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.testAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class OutputDefaultValuesTest {
    @Test
    fun testOutputDefaultValues_false() {
        val testAllTypesProto3 = testAllTypesProto3 { optionalString = "" }

        val actualJson = Json.parseToJsonElement(testAllTypesProto3.encodeToJsonString())
        assertFalse("optionalString" in actualJson.jsonObject)
    }

    @Test
    fun testOutputDefaultValues_true() {
        val jsonString = testAllTypesProto3 {
            optionalBoolWrapper = false
        }.encodeToJsonString(JsonConfig.DEFAULT.copy(outputDefaultValues = true))
        val parsedJson = Json.parseToJsonElement(jsonString).jsonObject

        assertEquals(JsonPrimitive(false), parsedJson["optionalBool"])
        assertEquals(JsonPrimitive(0), parsedJson["optionalInt32"])
        assertEquals(JsonPrimitive(""), parsedJson["optionalString"])
        assertEquals(JsonPrimitive(""), parsedJson["optionalBytes"])
        assertEquals(JsonPrimitive(TestAllTypesProto3.NestedEnum.fromValue(0).name!!), parsedJson["optionalNestedEnum"])

        assertEquals(JsonNull, parsedJson["optionalNestedMessage"])

        assertEquals(JsonArray(emptyList()), parsedJson["repeatedString"])
        assertEquals(JsonObject(emptyMap()), parsedJson["mapBoolBool"])

        assertEquals(JsonNull, parsedJson["optionalStringWrapper"])
        assertEquals(JsonPrimitive(false), parsedJson["optionalBoolWrapper"])
    }

    @Test
    fun testDefaultStringsAsNull() {
        val jsonString = testAllTypesProto3 {
            optionalStringWrapper = ""
        }.encodeToJsonString(JsonConfig.DEFAULT.copy(outputDefaultValues = true, outputDefaultStringsAsNull = true))
        val parsedJson = Json.parseToJsonElement(jsonString).jsonObject
        assertEquals(JsonPrimitive(false), parsedJson["optionalBool"])
        assertEquals(JsonNull, parsedJson["optionalString"])
        assertEquals(JsonPrimitive(""), parsedJson["optionalStringWrapper"])
    }
}
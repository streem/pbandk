package pbandk.json

import kotlinx.serialization.json.*
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OutputDefaultValuesTest {
    @Test
    fun testOutputDefaultValues_false() {
        val testAllTypesProto3 = TestAllTypesProto3(optionalString = "")

        val actualJson = Json.parseToJsonElement(testAllTypesProto3.encodeToJsonString())
        assertFalse("optionalString" in actualJson.jsonObject)
    }

    @Test
    fun testOutputDefaultValues_true() {
        val jsonString = TestAllTypesProto3(
            optionalBoolWrapper = false
        ).encodeToJsonString(JsonConfig.DEFAULT.copy(outputDefaultValues = true))
        val parsedJson = Json.parseToJsonElement(jsonString).jsonObject

        assertEquals(JsonPrimitive(false), parsedJson["optionalBool"])
        assertEquals(JsonPrimitive(0), parsedJson["optionalInt32"])
        assertEquals(JsonPrimitive(""), parsedJson["optionalString"])
        assertEquals(JsonPrimitive(""), parsedJson["optionalBytes"])
        assertEquals(JsonPrimitive(TestAllTypesProto3.NestedEnum.fromValue(0).name!!), parsedJson["optionalNestedEnum"])

        assertFalse(parsedJson.containsKey("optionalNestedMessage"))

        assertEquals(JsonArray(emptyList()), parsedJson["repeatedString"])
        assertEquals(JsonObject(emptyMap()), parsedJson["mapBoolBool"])

        assertFalse(parsedJson.containsKey("optionalStringWrapper"))
        assertEquals(JsonPrimitive(false), parsedJson["optionalBoolWrapper"])
    }

    @Test
    fun testDefaultStringsAsNull() {
        val jsonString = TestAllTypesProto3(
            optionalStringWrapper = ""
        ).encodeToJsonString(JsonConfig.DEFAULT.copy(outputDefaultValues = true, outputDefaultStringsAsNull = true))
        val parsedJson = Json.parseToJsonElement(jsonString).jsonObject
        assertEquals(JsonPrimitive(false), parsedJson["optionalBool"])
        assertEquals(JsonNull, parsedJson["optionalString"])
        assertEquals(JsonPrimitive(""), parsedJson["optionalStringWrapper"])
    }
}
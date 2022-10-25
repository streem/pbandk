package pbandk.json

import kotlinx.serialization.json.*
import pbandk.testpb.MessageWithEnum
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OutputDefaultValuesTest {
    private val jsonConfigCompactOutput = JsonConfig.DEFAULT.copy(compactOutput = true)

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

    @Test
    fun testProto2EnumUnsetField() {
        val message = MessageWithEnum()
        assertEquals("{\"value\":null}", message.encodeToJsonString(jsonConfigCompactOutput))
    }

    @Test
    fun testProto2EnumFieldSetToDefaultValue() {
        val message = MessageWithEnum(value = MessageWithEnum.EnumType.FOO)
        assertEquals("{}", message.encodeToJsonString(jsonConfigCompactOutput))
    }

    @Test
    fun testProto2EnumFieldSetToNonDefaultValue() {
        val message = MessageWithEnum(value = MessageWithEnum.EnumType.BAR)
        assertEquals("{\"value\":\"BAR\"}", message.encodeToJsonString(jsonConfigCompactOutput))
    }

    @Test
    fun testProto3EnumUnsetField() {
        // Note that this is equivalent to 'testProto3EnumFieldSetToDefaultValue', adding for completeness.
        val message = TestAllTypesProto3()
        assertEquals("{}", message.encodeToJsonString(jsonConfigCompactOutput))
    }

    @Test
    fun testProto3EnumFieldSetToDefaultValue() {
        val message = TestAllTypesProto3(optionalNestedEnum = TestAllTypesProto3.NestedEnum.FOO)
        assertEquals("{}", message.encodeToJsonString(jsonConfigCompactOutput))
    }

    @Test
    fun testProto3EnumFieldSetToNonDefaultValue() {
        val message = TestAllTypesProto3(optionalNestedEnum = TestAllTypesProto3.NestedEnum.BAR)
        assertEquals("{\"optionalNestedEnum\":\"BAR\"}", message.encodeToJsonString(jsonConfigCompactOutput))
    }
}
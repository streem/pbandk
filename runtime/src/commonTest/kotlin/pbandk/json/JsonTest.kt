package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.buildJsonObject
import pbandk.encodeToByteArray
import pbandk.testpb.Bar
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.MessageWithEnum
import kotlin.test.*

class JsonTest {
    @Test
    fun testMessageField_null() {
        val json = "{ \"singleFoo\": null }"
        val bar = Bar.decodeFromJsonString(json)
        assertNull(bar.singleFoo)

        val barBytes = bar.encodeToByteArray()
        assertContentEquals(byteArrayOf(), barBytes, "binary serialization should be empty for null field")
    }

    @Test
    fun testMessageWithEnumProto2
        val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

        // This points to a bug in JSON serialization implementation.
        // In proto2, enum string value should be visible in JSON even if the enum value is set to 0th value.
        val message0 = MessageWithEnum(value = MessageWithEnum.EnumType.FOO)
        assertEquals(message0.encodeToJsonString(jsonConfig), "{}")

        val message1 = MessageWithEnum(value = MessageWithEnum.EnumType.BAR)
        assertEquals(message1.encodeToJsonString(jsonConfig), "{\"value\":\"BAR\"}")
    }

    @Test
    fun testNullValues() {
        val json = buildJsonObject {
            put("optionalInt32", JsonNull)
            put("mapBoolBool", JsonNull)
            put("repeatedString", JsonNull)
            put("optionalNestedMessage", JsonNull)
        }.toString()
        val expectedMessage = TestAllTypesProto3.defaultInstance

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedMessage, testAllTypesProto3)
    }

    @Test
    fun testCompactOutput() {
        val testAllTypesProto3 = TestAllTypesProto3(
            optionalInt32 = 123,
            optionalBool = true
        )
        val json = testAllTypesProto3.encodeToJsonString()
        assertEquals(4, json.lines().size)
        val compactJson = testAllTypesProto3.encodeToJsonString(JsonConfig.DEFAULT.copy(compactOutput = true))
        assertEquals(1, compactJson.lines().size)
    }
}


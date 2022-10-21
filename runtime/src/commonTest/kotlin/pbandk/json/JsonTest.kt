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
    fun testMessageWithEnumProto2() {
        val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

        // This behavior is unexpected and will be fixed in a follow-up.
        // See https://github.com/streem/pbandk/issues/235 for more details.
        val message = MessageWithEnum()
        assertEquals("{\"value\":null}", message.encodeToJsonString(jsonConfig))

        // This behavior is unexpected and will be fixed in a follow-up.
        // See https://github.com/streem/pbandk/issues/235 for more details.
        val messageWith0 = MessageWithEnum(value = MessageWithEnum.EnumType.FOO)
        assertEquals("{}", messageWith0.encodeToJsonString(jsonConfig))

        // This works as expected.
        val messageWith1 = MessageWithEnum(value = MessageWithEnum.EnumType.BAR)
        assertEquals("{\"value\":\"BAR\"}", messageWith1.encodeToJsonString(jsonConfig))
    }

    @Test
    fun testMessageWithEnumProto3() {
        val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

        val message = TestAllTypesProto3()
        assertEquals("{}", message.encodeToJsonString(jsonConfig))

        // See https://github.com/streem/pbandk/issues/235#issuecomment-1286122161 for more details.
        val messageWith0 = TestAllTypesProto3(optionalNestedEnum = TestAllTypesProto3.NestedEnum.FOO)
        assertEquals("{}", messageWith0.encodeToJsonString(jsonConfig))

        val messageWith1 = TestAllTypesProto3(optionalNestedEnum = TestAllTypesProto3.NestedEnum.BAR)
        assertEquals("{\"optionalNestedEnum\":\"BAR\"}", messageWith1.encodeToJsonString(jsonConfig))
    }

    @Test
    fun binaryJsonRoundTripDoesntLoseInformationForExplicitPresence() {
        val originalMessage = TestAllTypesProto3(optionalInt32 = 0)
        val roundTripMessage = TestAllTypesProto3.decodeFromJsonString(originalMessage.encodeToJsonString())

        assertEquals(originalMessage.encodeToByteArray(), roundTripMessage.encodeToByteArray())
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


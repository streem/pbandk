package pbandk.json

import kotlinx.serialization.json.*
import pbandk.ByteArr
import pbandk.encodeToByteArray
import pbandk.testpb.Bar
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.ListValue
import pbandk.wkt.Struct
import pbandk.wkt.Timestamp
import pbandk.wkt.Value
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class JsonTest {
    @Test
    fun testMessageField_null() {
        val json = "{ \"single_foo\": null }"
        val bar = Bar.decodeFromJsonString(json)
        assertNull(bar.singleFoo)

        val barBytes = bar.encodeToByteArray()
        assertEquals(emptyList(), barBytes.asList(), "binary serialization should be empty for null field")
    }

    @Test
    fun testNullValues() {
        val json = json {
            "optionalInt32" to JsonNull
            "mapBoolBool" to JsonNull
            "repeatedString" to JsonNull
            "optionalNestedMessage" to JsonNull
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
package pbandk.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.ByteArr
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.testAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals

class BytesTest {
    @Test
    fun testBytesField_base64() {
        val testAllTypesProto3 = testAllTypesProto3 { optionalBytes = ByteArr(byteArrayOf(1, 2)) }
        val expectedJson = buildJsonObject { put("optionalBytes", "AQI=") }

        val actualJson = Json.parseToJsonElement(testAllTypesProto3.encodeToJsonString())
        assertEquals(expectedJson, actualJson)

        val actualProto = TestAllTypesProto3.decodeFromJsonString(expectedJson.toString())
        assertEquals(testAllTypesProto3, actualProto)
    }
}
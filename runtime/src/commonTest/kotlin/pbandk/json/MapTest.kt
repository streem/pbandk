package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.buildJsonObject
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.foreignMessage
import pbandk.testpb.testAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MapTest {
    @Test
    fun testMapWithDefaultValues() {
        val json = buildJsonObject {
            put("mapStringForeignMessage", buildJsonObject {
                put("foo", buildJsonObject { })
            })
        }.toString()

        val expected = testAllTypesProto3 {
            mapStringForeignMessage = mapOf("foo" to foreignMessage {})
        }
        val parsed = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expected, parsed)
    }

    @Test
    fun testMapWithNullValues() {
        val json = buildJsonObject {
            put("mapStringForeignMessage", buildJsonObject {
                put("foo", JsonNull)
            })
        }.toString()
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }
}
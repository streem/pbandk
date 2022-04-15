package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.buildJsonObject
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.ForeignMessage
import pbandk.testpb.TestAllTypesProto3
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

        val expected = TestAllTypesProto3 {
            mapStringForeignMessage["foo"] = ForeignMessage {}
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
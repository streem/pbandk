package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.json
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.ForeignMessage
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MapTest {
    @Test
    fun testMapWithDefaultValues() {
        val json = json {
            "mapStringForeignMessage" to json {
                "foo" to json { }
            }
        }.toString()

        val expected = TestAllTypesProto3(
            mapStringForeignMessage = mapOf("foo" to ForeignMessage())
        )
        val parsed = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expected, parsed)
    }

    @Test
    fun testMapWithNullValues() {
        val json = json {
            "mapStringForeignMessage" to json {
                "foo" to JsonNull
            }
        }.toString()
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }
}
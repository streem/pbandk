package pbandk.json

import kotlinx.serialization.json.json
import kotlinx.serialization.json.jsonArray
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.Duration
import pbandk.wkt.Timestamp
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class DurationTest {
    @Test
    fun testDurationField() {
        val json = json { "optionalDuration" to "1s" }.toString()
        val expectedDuration = Duration(seconds = 1, nanos = 0)

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDuration, testAllTypesProto3.optionalDuration)
    }

    @Test
    fun testDurationField_withNanos() {
        val json = json { "optionalDuration" to "1.001s" }.toString()
        val expectedDuration = Duration(seconds = 1, nanos = 1000000)

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDuration, testAllTypesProto3.optionalDuration)
    }

    @Test
    fun testDurationField_repeated() {
        val json = json { "repeatedDuration" to jsonArray { +"1.5s"; +"-1.5s"; } }.toString()
        val expectedDurations = listOf(Duration(seconds = 1, nanos = 500000000), Duration(seconds = -1, nanos = -500000000))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDurations, testAllTypesProto3.repeatedDuration)
    }

    @Test
    fun testDurationField_maxMinParse() {
        val maxJson = json { "optionalDuration" to "315576000001s" }.toString()
        assertFails { TestAllTypesProto3.decodeFromJsonString(maxJson) }

        val minJson = json { "optionalDuration" to "-315576000001s" }.toString()
        assertFails { TestAllTypesProto3.decodeFromJsonString(minJson) }
    }

    @Test
    fun testDurationField_maxMinEncode() {
        val maxDuration = TestAllTypesProto3(optionalDuration = Duration(315576000001))
        assertFails { maxDuration.encodeToJsonString() }

        val minDuration = TestAllTypesProto3(optionalDuration = Duration(-315576000001))
        assertFails { minDuration.encodeToJsonString() }
    }
}
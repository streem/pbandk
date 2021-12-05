package pbandk.json

import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.testAllTypesProto3
import pbandk.wkt.duration
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class DurationTest {
    @Test
    fun testDurationField() {
        val json = buildJsonObject { put("optionalDuration", "1s") }.toString()
        val expectedDuration = duration {
            seconds = 1
            nanos = 0
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDuration, testAllTypesProto3.optionalDuration)
    }

    @Test
    fun testDurationField_withNanos() {
        val json = buildJsonObject { put("optionalDuration", "1.001s") }.toString()
        val expectedDuration = duration {
            seconds = 1
            nanos = 1000000
        }

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDuration, testAllTypesProto3.optionalDuration)
    }

    @Test
    fun testDurationField_repeated() {
        val json = buildJsonObject {
            put("repeatedDuration", buildJsonArray {
                add("1.5s")
                add("-1.5s")
            })
        }.toString()
        val expectedDurations =
            listOf(duration {
                seconds = 1
                nanos = 500000000
            }, duration {
                seconds = -1
                nanos = -500000000
            })

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDurations, testAllTypesProto3.repeatedDuration)
    }

    @Test
    fun testDurationField_maxMinParse() {
        val maxJson = buildJsonObject { put("optionalDuration", "315576000001s") }.toString()
        assertFails { TestAllTypesProto3.decodeFromJsonString(maxJson) }

        val minJson = buildJsonObject { put("optionalDuration", "-315576000001s") }.toString()
        assertFails { TestAllTypesProto3.decodeFromJsonString(minJson) }
    }

    @Test
    fun testDurationField_maxMinEncode() {
        val maxDuration = testAllTypesProto3 { optionalDuration = duration { seconds = 315576000001 } }
        assertFails { maxDuration.encodeToJsonString() }

        val minDuration = testAllTypesProto3 { optionalDuration = duration { seconds = -315576000001 } }
        assertFails { minDuration.encodeToJsonString() }
    }
}
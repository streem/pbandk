package pbandk.json

import kotlinx.serialization.json.json
import kotlinx.serialization.json.jsonArray
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.Duration
import pbandk.wkt.Timestamp
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class FloatTest {

    private val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

    @Test
    fun testFloatField_EncodeFinite() {
        val input = TestAllTypesProto3(optionalFloat = 1.1F)

        val expected = json { "optionalFloat" to 1.1F }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeFinite() {
        val json = json { "optionalFloat" to "1.1" }.toString()
        val expectedFloat = 1.1F

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_EncodeNaN() {
        val input = TestAllTypesProto3(optionalFloat = Float.NaN)

        val expected = json { "optionalFloat" to "NaN" }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeNaN() {
        val json = json { "optionalFloat" to "NaN" }.toString()
        val expectedFloat = Float.NaN

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_EncodePositiveInfinity() {
        val input = TestAllTypesProto3(optionalFloat = Float.POSITIVE_INFINITY)

        val expected = json { "optionalFloat" to "Infinity" }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodePositiveInfinity() {
        val json = json { "optionalFloat" to "Infinity" }.toString()
        val expectedFloat = Float.POSITIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_EncodeNegativeInfinity() {
        val input = TestAllTypesProto3(optionalFloat = Float.NEGATIVE_INFINITY)

        val expected = json { "optionalFloat" to "-Infinity" }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeNegativeInfinity() {
        val json = json { "optionalFloat" to "-Infinity" }.toString()
        val expectedFloat = Float.NEGATIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_EncodeExponentialNotation() {
        val input = TestAllTypesProto3(optionalFloat = 2e-12F)

        val expected = json { "optionalFloat" to 2e-12F }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeExponentialNotation() {
        val json = json { "optionalFloat" to "2e-12" }.toString()
        val expectedFloat = 2e-12F

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }
}
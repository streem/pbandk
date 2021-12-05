package pbandk.json

import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.testAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class DoubleTest {

    private val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

    @Test
    fun testDoubleField_EncodeFinite() {
        val input = testAllTypesProto3 { optionalDouble = 1.1 }

        val expected = buildJsonObject { put("optionalDouble", 1.1) }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeFinite() {
        val json = buildJsonObject { put("optionalDouble", "1.1") }.toString()
        val expectedDouble = 1.1

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_DecodeMinNegative() {
        val json = buildJsonObject { put("optionalDouble", "-2.22507e-308") }.toString()
        val expectedDouble = -2.22507e-308

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testOneOfDoubleField_Zero() {
        val json = buildJsonObject { put("oneofDouble", 0.0) }.toString()
        val expectedDouble = 0.0

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.oneofDouble)
    }

    @Test
    fun testDoubleField_EncodeNaN() {
        val input = testAllTypesProto3 { optionalDouble = Double.NaN }

        val expected = buildJsonObject { put("optionalDouble", "NaN") }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeNaN() {
        val json = buildJsonObject { put("optionalDouble", "NaN") }.toString()
        val expectedDouble = Double.NaN

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_EncodePositiveInfinity() {
        val input = testAllTypesProto3 { optionalDouble = Double.POSITIVE_INFINITY }

        val expected = buildJsonObject { put("optionalDouble", "Infinity") }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodePositiveInfinity() {
        val json = buildJsonObject { put("optionalDouble", "Infinity") }.toString()
        val expectedDouble = Double.POSITIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_EncodeNegativeInfinity() {
        val input = testAllTypesProto3 { optionalDouble = Double.NEGATIVE_INFINITY }

        val expected = buildJsonObject { put("optionalDouble", "-Infinity") }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeNegativeInfinity() {
        val json = buildJsonObject { put("optionalDouble", "-Infinity") }.toString()
        val expectedDouble = Double.NEGATIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_EncodeExponentialNotation() {
        val input = testAllTypesProto3 { optionalDouble = 2e-12 }

        val expected = buildJsonObject { put("optionalDouble", 2e-12) }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeExponentialNotation() {
        val json = buildJsonObject { put("optionalDouble", "2e-12") }.toString()
        val expectedDouble = 2e-12

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_DecodeAboveMaximum() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalDouble":1.89769e+308}""")
        }
    }

    @Test
    fun testDoubleField_DecodeBelowMinimum() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalDouble":-1.89769e+308}""")
        }
    }
}
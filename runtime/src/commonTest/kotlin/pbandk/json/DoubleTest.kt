package pbandk.json

import kotlinx.serialization.json.json
import kotlinx.serialization.json.jsonArray
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.Duration
import pbandk.wkt.Timestamp
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFailsWith

class DoubleTest {

    private val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

    @Test
    fun testDoubleField_EncodeFinite() {
        val input = TestAllTypesProto3(optionalDouble = 1.1)

        val expected = json { "optionalDouble" to 1.1 }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeFinite() {
        val json = json { "optionalDouble" to "1.1" }.toString()
        val expectedDouble = 1.1

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_DecodeMinNegative() {
        val json = json { "optionalDouble" to "-2.22507e-308" }.toString()
        val expectedDouble = -2.22507e-308

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testOneOfDoubleField_Zero() {
        val json = json { "oneofDouble" to 0.0 }.toString()
        val expectedDouble = 0.0

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.oneofDouble)
    }

    @Test
    fun testDoubleField_EncodeNaN() {
        val input = TestAllTypesProto3(optionalDouble = Double.NaN)

        val expected = json { "optionalDouble" to "NaN" }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeNaN() {
        val json = json { "optionalDouble" to "NaN" }.toString()
        val expectedDouble = Double.NaN

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_EncodePositiveInfinity() {
        val input = TestAllTypesProto3(optionalDouble = Double.POSITIVE_INFINITY)

        val expected = json { "optionalDouble" to "Infinity" }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodePositiveInfinity() {
        val json = json { "optionalDouble" to "Infinity" }.toString()
        val expectedDouble = Double.POSITIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_EncodeNegativeInfinity() {
        val input = TestAllTypesProto3(optionalDouble = Double.NEGATIVE_INFINITY)

        val expected = json { "optionalDouble" to "-Infinity" }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeNegativeInfinity() {
        val json = json { "optionalDouble" to "-Infinity" }.toString()
        val expectedDouble = Double.NEGATIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedDouble, testAllTypesProto3.optionalDouble)
    }

    @Test
    fun testDoubleField_EncodeExponentialNotation() {
        val input = TestAllTypesProto3(optionalDouble = 2e-12)

        val expected = json { "optionalDouble" to 2e-12 }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testDoubleField_DecodeExponentialNotation() {
        val json = json { "optionalDouble" to "2e-12" }.toString()
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
package pbandk.json

import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.testAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class FloatTest {

    private val jsonConfig = JsonConfig.DEFAULT.copy(compactOutput = true)

    @Test
    fun testFloatField_EncodeFinite() {
        val input = testAllTypesProto3 { optionalFloat = 1.1F }

        val expected = buildJsonObject { put("optionalFloat", 1.1F) }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeFinite() {
        val json = buildJsonObject { put("optionalFloat", "1.1") }.toString()
        val expectedFloat = 1.1F

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_EncodeNaN() {
        val input = testAllTypesProto3 { optionalFloat = Float.NaN }

        val expected = buildJsonObject { put("optionalFloat", "NaN") }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeNaN() {
        val json = buildJsonObject { put("optionalFloat", "NaN") }.toString()
        val expectedFloat = Float.NaN

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_DecodeNaNUnquoted() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalFloat":NaN}""")
        }
    }

    @Test
    fun testFloatField_EncodePositiveInfinity() {
        val input = testAllTypesProto3 { optionalFloat = Float.POSITIVE_INFINITY }

        val expected = buildJsonObject { put("optionalFloat", "Infinity") }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodePositiveInfinity() {
        val json = buildJsonObject { put("optionalFloat", "Infinity") }.toString()
        val expectedFloat = Float.POSITIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_DecodePositiveInfinityUnquoted() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalFloat":Infinity}""")
        }
    }

    @Test
    fun testFloatField_EncodeNegativeInfinity() {
        val input = testAllTypesProto3 { optionalFloat = Float.NEGATIVE_INFINITY }

        val expected = buildJsonObject { put("optionalFloat", "-Infinity") }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeNegativeInfinity() {
        val json = buildJsonObject { put("optionalFloat", "-Infinity") }.toString()
        val expectedFloat = Float.NEGATIVE_INFINITY

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_DecodeNegativeInfinityUnquoted() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalFloat":-Infinity}""")
        }
    }

    @Test
    fun testFloatField_EncodeExponentNotation() {
        val input = testAllTypesProto3 { optionalFloat = 2e-12F }

        val expected = buildJsonObject { put("optionalFloat", 2e-12F) }.toString()
        val actual = input.encodeToJsonString(jsonConfig)

        assertEquals(expected, actual)
    }

    @Test
    fun testFloatField_DecodeExponentNotation() {
        val json = buildJsonObject { put("optionalFloat", "2e-12") }.toString()
        val expectedFloat = 2e-12F

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedFloat, testAllTypesProto3.optionalFloat)
    }

    @Test
    fun testFloatField_DecodeAboveMaximum() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalFloat":3.502823e+38}""")
        }
    }

    @Test
    fun testFloatField_DecodeAboveMaximumString() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalFloat":"3.502823e+38"}""")
        }
    }

    @Test
    fun testFloatField_DecodeBelowMinimum() {
        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString("""{"optionalFloat":-3.502823e+38}""")
        }
    }
}
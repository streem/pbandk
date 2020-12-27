package pbandk.json

import kotlinx.serialization.json.json
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class IntTest {

    @Test
    fun testInt32Field_DecodeTrailingZero_PassesOnValidNumber() {
        val json = json { "optionalInt32" to "1.00" }.toString()
        val expectedInt = 1

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedInt, testAllTypesProto3.optionalInt32)
    }

    @Test
    fun testInt32Field_DecodeTrailingZero_FailsOnFloat() {
        val json = json { "optionalInt32" to "1.10" }.toString()

        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }

    @Test
    fun testInt32Field_DecodeTrailingZero_FailsOnInvalidNumber() {
        val json = json { "optionalInt32" to "1.00.00" }.toString()

        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }

    @Test
    fun testInt32Field_DecodeExponentNotation_PassesOnValidNumber() {
        val json = json { "optionalInt32" to "1e0" }.toString()
        val expectedInt = 1

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedInt, testAllTypesProto3.optionalInt32)
    }

    @Test
    fun testInt32Field_DecodeExponentNotation_PassesOnValidNumberCapitalized() {
        val json = json { "optionalInt32" to "1E2" }.toString()
        val expectedInt = 100

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedInt, testAllTypesProto3.optionalInt32)
    }

    @Test
    fun testInt32Field_DecodeExponentNotation_PassesOnValidFloat() {
        val json = json { "optionalInt32" to "-1.2e1" }.toString()
        val expectedInt = -12

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedInt, testAllTypesProto3.optionalInt32)
    }

    @Test
    fun testInt32Field_DecodeExponentNotation_PassesOnValidFloatTrailingZero() {
        val json = json { "optionalInt32" to "-1.200e1" }.toString()
        val expectedInt = -12

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedInt, testAllTypesProto3.optionalInt32)
    }

    @Test
    fun testInt32Field_DecodeExponentNotation_FailsOnInvalidNumber() {
        val json = json { "optionalInt32" to "1e2e2" }.toString()

        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }

    @Test
    fun testInt32Field_DecodeMinFloatValue_Success() {
        val json = json { "optionalInt32" to "-2.147483648e9" }.toString()
        val expectedInt = -2147483648

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedInt, testAllTypesProto3.optionalInt32)
    }

    @Test
    fun testInt64Field_DecodeFieldTooLarge_Fails() {
        val json = json { "optionalInt64" to "9223372036854775808" }.toString()

        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }

    @Test
    fun testUInt64Field_DecodeFieldTooLarge_Fails() {
        val json = json { "optionalUint64" to "18446744073709551616" }.toString()

        assertFailsWith<InvalidProtocolBufferException> {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }
}
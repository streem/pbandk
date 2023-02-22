package pbandk.json

import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.ForeignEnum
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class IgnoreUnknownFieldsTest {
    @Test
    fun testEnumWithUnknownValue() {
        val json = buildJsonObject {
            put("optionalForeignEnum", "XXX")
        }.toString()

        // Without [ignoreUnknownFieldsInInput], a known enum field with an unknown enum value should fail to decode.
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(json)
        }

        // With [ignoreUnknownFieldsInInput], the enum field should be parsed as an UNRECOGNIZED value during decoding
        // if it contains an unknown value.
        val expected = TestAllTypesProto3 {
            optionalForeignEnum = ForeignEnum.UNRECOGNIZED(name = "XXX")
        }
        val parsed = TestAllTypesProto3.decodeFromJsonString(
            json, JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true)
        )
        assertEquals(expected, parsed)
    }

    @Test
    fun testEnumWithUnknownNumericValue() {
        val json = buildJsonObject {
            put("optionalForeignEnum", 1234)
        }.toString()

        val expected = TestAllTypesProto3 { optionalForeignEnum = ForeignEnum.UNRECOGNIZED(1234) }

        // Without [ignoreUnknownFieldsInInput], a known enum field with an unknown numeric enum value should be parsed
        // as an UNRECOGNIZED value.
        assertEquals(expected, TestAllTypesProto3.decodeFromJsonString(json))

        // With [ignoreUnknownFieldsInInput], the enum field should likewise be parsed as an UNRECOGNIZED value.
        assertEquals(
            expected,
            TestAllTypesProto3.decodeFromJsonString(json, JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true))
        )
    }

    @Test
    fun testRepeatedEnumWithUnknownValue() {
        val json = buildJsonObject {
            put("repeatedForeignEnum", buildJsonArray {
                add("FOREIGN_FOO")
                add("XXX")
                add("FOREIGN_BAR")
            })
        }.toString()

        // Without [ignoreUnknownFieldsInInput], a repeated enum field with some known and some unknown values should
        // fail to decode.
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(json)
        }

        // With [ignoreUnknownFieldsInInput], the unknown values in a repeated enum should be parsed as UNRECOGNIZED
        // during decoding and included alongside the other values.
        val expected = TestAllTypesProto3 {
            repeatedForeignEnum += listOf(
                ForeignEnum.FOREIGN_FOO,
                ForeignEnum.UNRECOGNIZED(name = "XXX"),
                ForeignEnum.FOREIGN_BAR
            )
        }
        val parsed = TestAllTypesProto3.decodeFromJsonString(
            json, JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true)
        )
        assertEquals(expected, parsed)
    }

    @Test
    fun testMapEnumWithUnknownValue() {
        val json = buildJsonObject {
            put("mapStringForeignEnum", buildJsonObject {
                put("a", "FOREIGN_FOO")
                put("b", "XXX")
            })
        }.toString()

        // Without [ignoreUnknownFieldsInInput], a map field with some known and some unknown enum values should fail
        // to decode.
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(json)
        }

        // With [ignoreUnknownFieldsInInput], the unknown enum values in a map field should be parsed as an UNRECOGNIZED
        // value during decoding and included alongside the other values.
        val expected = TestAllTypesProto3 {
            mapStringForeignEnum["a"] = ForeignEnum.FOREIGN_FOO
            mapStringForeignEnum["b"] = ForeignEnum.UNRECOGNIZED(name = "XXX")
        }
        val parsed = TestAllTypesProto3.decodeFromJsonString(
            json, JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true)
        )
        assertEquals(expected, parsed)
    }
}
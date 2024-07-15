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

private val unknownStringJson = buildJsonObject {
    put("optionalForeignEnum", "XXX")
}.toString()

private val unknownNumberJson = buildJsonObject {
    put("optionalForeignEnum", 1234)
}.toString()

class IgnoreUnknownFieldsTest {
    @Test
    fun testEnumWithUnknownStringValue_ignoreUnknownFieldsInInput_false() {
        // Without [ignoreUnknownFieldsInInput], a known enum field with an unknown string enum value should fail to
        // decode.
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(unknownStringJson)
        }
    }

    @Test
    fun testEnumWithUnknownStringValue_ignoreUnknownFieldsInInput_true() {
        // With [ignoreUnknownFieldsInInput], a known enum field with an unknown enum string value should be ignored.
        // The field will keep its default value.
        val expected = TestAllTypesProto3.defaultInstance

        // With [ignoreUnknownFieldsInInput], the enum field should be parsed as an UNRECOGNIZED value during decoding
        // if it contains an unknown value.
        // TODO: add a test for behavior with other values of JsonConfig.unrecognizedEnumValueBehavior
//        val expected = TestAllTypesProto3 {
//            optionalForeignEnum = ForeignEnum.UNRECOGNIZED(name = "XXX")
//        }

        val parsed = TestAllTypesProto3.decodeFromJsonString(
            unknownStringJson, JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true)
        )
        assertEquals(expected, parsed)
    }

    @Test
    fun testEnumWithUnknownNumericValue_ignoreUnknownFieldsInInput_false() {
        // Without [ignoreUnknownFieldsInInput], a known enum field with an unknown numeric enum value should be parsed
        // as an UNRECOGNIZED value. See the comment in [JsonConfig] for why this is the case.
        val expected = TestAllTypesProto3 { optionalForeignEnum = ForeignEnum.UNRECOGNIZED(1234) }

        assertEquals(expected, TestAllTypesProto3.decodeFromJsonString(unknownNumberJson))
    }

    @Test
    fun testEnumWithUnknownNumericValue_ignoreUnknownFieldsInInput_true() {
        // With [ignoreUnknownFieldsInInput], the enum field should likewise be parsed as an UNRECOGNIZED value.
        val expected = TestAllTypesProto3 { optionalForeignEnum = ForeignEnum.UNRECOGNIZED(1234) }

        val parsed = TestAllTypesProto3.decodeFromJsonString(
            unknownNumberJson,
            JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true)
        )
        assertEquals(expected, parsed)
    }

    @Test
    fun testRepeatedEnumWithUnknownStringValue() {
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

        // With [ignoreUnknownFieldsInInput], the unknown values in a repeated enum should be ignored during decoding.
        // See the comment in [JsonConfig] for why this is the case.
        val expected = TestAllTypesProto3 {
            repeatedForeignEnum += listOf(ForeignEnum.FOREIGN_FOO, ForeignEnum.FOREIGN_BAR)
        }

        // With [ignoreUnknownFieldsInInput], the unknown values in a repeated enum should be parsed as UNRECOGNIZED
        // during decoding and included alongside the other values.
        // TODO: add a test for behavior with other values of JsonConfig.unrecognizedEnumValueBehavior
//        val expected = TestAllTypesProto3 {
//            repeatedForeignEnum += listOf(
//                ForeignEnum.FOREIGN_FOO,
//                ForeignEnum.UNRECOGNIZED(name = "XXX"),
//                ForeignEnum.FOREIGN_BAR
//            )
//        }
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

        // With [ignoreUnknownFieldsInInput], the unknown enum values in a map field should be ignored during
        // decoding. See the comment in [JsonConfig] for why this is the case.
        val expected = TestAllTypesProto3 {
            mapStringForeignEnum["a"] = ForeignEnum.FOREIGN_FOO
        }

        // With [ignoreUnknownFieldsInInput], the unknown enum values in a map field should be parsed as an UNRECOGNIZED
        // value during decoding and included alongside the other values.
        // TODO: add a test for behavior with other values of JsonConfig.unrecognizedEnumValueBehavior
//        val expected = TestAllTypesProto3 {
//            mapStringForeignEnum["a"] = ForeignEnum.FOREIGN_FOO
//            mapStringForeignEnum["b"] = ForeignEnum.UNRECOGNIZED(name = "XXX")
//        }

        val parsed = TestAllTypesProto3.decodeFromJsonString(
            json, JsonConfig.DEFAULT.copy(ignoreUnknownFieldsInInput = true)
        )
        assertEquals(expected, parsed)
    }
}
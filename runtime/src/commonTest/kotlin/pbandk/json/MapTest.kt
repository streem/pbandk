package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.buildJsonObject
import pbandk.InvalidProtocolBufferException
import pbandk.testpb.ForeignMessage
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class MapTest {
    @Test
    fun testMapWithDefaultValues() {
        val json = buildJsonObject {
            put("mapStringForeignMessage", buildJsonObject {
                put("foo", buildJsonObject { })
            })
        }.toString()

        val expected = TestAllTypesProto3 {
            mapStringForeignMessage["foo"] = ForeignMessage {}
        }
        val parsed = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expected, parsed)
    }

    @Test
    fun testMapWithNullValues() {
        val json = buildJsonObject {
            put("mapStringForeignMessage", buildJsonObject {
                put("foo", JsonNull)
            })
        }.toString()

        // According to https://protobuf.dev/programming-guides/proto3/#maps: "If you provide a key but no value for a
        // map field, the behavior when the field is serialized is language-dependent. In C++, Java, Kotlin, and Python
        // the default value for the type is serialized, while in other languages nothing is serialized."
        // So we can choose to handle null map values either by ignoring the map entry or by treating it as the default
        // value. Currently pbandk implements the latter approach.
        val expected = TestAllTypesProto3 {
            mapStringForeignMessage["foo"] = ForeignMessage {}
        }
        val parsed = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expected, parsed)
//        assertFailsWith(InvalidProtocolBufferException::class) {
//            TestAllTypesProto3.decodeFromJsonString(json)
//        }
    }
}
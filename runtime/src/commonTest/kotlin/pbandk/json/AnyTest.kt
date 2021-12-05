package pbandk.json

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import pbandk.InvalidProtocolBufferException
import pbandk.Message
import pbandk.add
import pbandk.pack
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.foo
import pbandk.testpb.testAllTypesProto3
import pbandk.typeRegistry
import pbandk.wkt.Any
import pbandk.wkt.int32Value
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AnyTest {
    private lateinit var jsonConfig: JsonConfig

    @Suppress("NOTHING_TO_INLINE")
    private inline fun <T : Message> assertJsonRoundTrip(message: T, expectedJson: JsonObject) {
        val actualJson = Json.parseToJsonElement(message.encodeToJsonString(jsonConfig))
        assertEquals(expectedJson, actualJson)

        val actualProto = message.descriptor.messageCompanion.decodeFromJsonString(expectedJson.toString(), jsonConfig)
        assertEquals(message, actualProto)
    }

    @BeforeTest
    fun beforeTest() {
        jsonConfig = JsonConfig.DEFAULT.copy(
            typeRegistry = typeRegistry {
                add(TestAllTypesProto3)
            }
        )
    }

    @Test
    fun testAny_field() {
        val testAllTypesProto3 = testAllTypesProto3 {
            optionalAny = Any.pack(testAllTypesProto3 { optionalInt32 = 12345 })
        }
        val expectedJson = buildJsonObject {
            put("optionalAny", buildJsonObject {
                put("@type", "type.googleapis.com/protobuf_test_messages.proto3.TestAllTypesProto3")
                put("optionalInt32", 12345)
            })
        }

        assertJsonRoundTrip(testAllTypesProto3, expectedJson)
    }

    @Test
    fun testAny_topLevel() {
        val any = Any.pack(testAllTypesProto3 { optionalBool = true })
        val expectedJson = buildJsonObject {
            put("@type", "type.googleapis.com/protobuf_test_messages.proto3.TestAllTypesProto3")
            put("optionalBool", true)
        }

        assertJsonRoundTrip(any, expectedJson)
    }

    @Test
    fun testAny_failsWithoutTypeRegistryEntry() {
        val any = Any.pack(foo { `val` = "hi there" })
        val expectedJson = buildJsonObject {
            put("@type", "type.googleapis.com/testpb.Foo")
            put("val", "hi there")
        }

        // `Foo` is not in the `jsonConfig.typeRegistry` that is configured in the `beforeTest()` method. So JSON
        // encoding/decoding `Foo` instances in an `Any` message should fail.
        assertFailsWith<InvalidProtocolBufferException> {
            any.encodeToJsonString(jsonConfig)
        }
        assertFailsWith<InvalidProtocolBufferException> {
            Any.decodeFromJsonString(expectedJson.toString(), jsonConfig)
        }
    }

    @Test
    fun test_wrapperValue() {
        val any = Any.pack(int32Value { value = 12345 })
        val expectedJson = buildJsonObject {
            put("@type", "type.googleapis.com/google.protobuf.Int32Value")
            put("value", 12345)
        }

        assertJsonRoundTrip(any, expectedJson)
    }

    @Test
    fun test_customTypeUrl() {
        val any = Any.pack(testAllTypesProto3 { optionalInt32 = 12345 }, typeUrlPrefix = "foo.test.com/types")
        val expectedJson = buildJsonObject {
            put("@type", "foo.test.com/types/protobuf_test_messages.proto3.TestAllTypesProto3")
            put("optionalInt32", 12345)
        }

        assertJsonRoundTrip(any, expectedJson)
    }
}
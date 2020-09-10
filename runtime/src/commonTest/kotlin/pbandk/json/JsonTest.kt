package pbandk.json

import kotlinx.serialization.json.*
import pbandk.ByteArr
import pbandk.encodeToByteArray
import pbandk.testpb.Bar
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.ListValue
import pbandk.wkt.Struct
import pbandk.wkt.Timestamp
import pbandk.wkt.Value
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class JsonTest {
    @Test
    fun testMessageField_null() {
        val json = "{ \"single_foo\": null }"
        val bar = Bar.decodeFromJsonString(json)
        assertNull(bar.singleFoo)

        val barBytes = bar.encodeToByteArray()
        assertEquals(emptyList(), barBytes.asList(), "binary serialization should be empty for null field")
    }

    @Test
    fun testBytesField_base64() {
        val testAllTypesProto3 = TestAllTypesProto3(optionalBytes = ByteArr(byteArrayOf(1, 2)))
        val expectedJson = json { "optionalBytes" to "AQI=" }

        val actualJson = Json(JsonConfiguration.Stable).parseJson(testAllTypesProto3.encodeToJsonString())
        assertEquals(expectedJson, actualJson)

        val actualProto = TestAllTypesProto3.decodeFromJsonString(expectedJson.toString())
        assertEquals(testAllTypesProto3, actualProto)
    }

    @Test
    fun testTimestampField() {
        val json = json { "optionalTimestamp" to "0001-01-01T00:00:00Z" }.toString()
        val expectedTimestamp = Timestamp(seconds = -62135596800, nanos = 0)

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedTimestamp, testAllTypesProto3.optionalTimestamp)
    }

    @Test
    fun testTimestampField_withNanos() {
        val json = json { "optionalTimestamp" to "1993-02-10T00:00:00.000Z" }.toString()
        val expectedTimestamp = Timestamp(seconds = 729302400, nanos = 0)

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedTimestamp, testAllTypesProto3.optionalTimestamp)
    }

    @Test
    fun testStructField_withStrings() {
        val json = json { "optionalStruct" to json { "key" to "value" } }.toString()
        val expectedStruct = Struct(mapOf( "key" to Value(Value.Kind.StringValue("value")) ))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNumbers() {
        val json = json { "optionalStruct" to json { "key" to 1.0 } }.toString()
        val expectedStruct = Struct(mapOf("key" to Value(Value.Kind.NumberValue(1.0))))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withList() {
        val json = json { "optionalStruct" to json { "key" to jsonArray { +"value1"; +"value2" }}}.toString()
        val expectedStruct = Struct(mapOf("key" to Value(Value.Kind.ListValue(ListValue(listOf(
            Value(Value.Kind.StringValue("value1")),
            Value(Value.Kind.StringValue("value2")))
        )))))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withStruct() {
        val json = json { "optionalStruct" to json { "key" to json { "innerKey" to "value" }}}.toString()
        val expectedStruct = Struct(mapOf("key" to Value(Value.Kind.StructValue(Struct(
            mapOf("innerKey" to Value(Value.Kind.StringValue("value")))
        )))))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNull() {
        val json = json { "optionalStruct" to json { "key" to JsonNull }}.toString()
        val expectedStruct = Struct(mapOf("key" to Value(Value.Kind.NullValue())))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNumberString() {
        val json = json { "optionalStruct" to json { "key" to "1.0" }}.toString()
        val expectedStruct = Struct(mapOf("key" to Value(Value.Kind.StringValue("1.0"))))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }


    @Test
    fun testStructField_withMix() {
        val json = json { "optionalStruct" to json {
            "key1" to 1.0
            "key2" to "TWO"
            "key3" to jsonArray { +"value1"; +"value2" }
            "key4" to true
            "key5" to JsonNull
        }}.toString()

        val expectedStruct = Struct(mapOf(
            "key1" to Value(Value.Kind.NumberValue(1.0)),
            "key2" to Value(Value.Kind.StringValue("TWO")),
            "key3" to Value(Value.Kind.ListValue(ListValue(listOf(
                Value(Value.Kind.StringValue("value1")),
                Value(Value.Kind.StringValue("value2")))
            ))),
            "key4" to Value(Value.Kind.BoolValue(true)),
            "key5" to Value(Value.Kind.NullValue())
        ))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testRepeatedList() {
        val json = json {
            "repeatedListValue" to jsonArray {
                +jsonArray { +"a" }
            }
        }.toString()
        val expectedRepeatedList = listOf(ListValue(listOf(Value(kind = Value.Kind.StringValue("a")))))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedRepeatedList, testAllTypesProto3.repeatedListValue)
    }

    @Test
    fun testValueField_null() {
        val json = json { "optionalValue" to JsonNull }.toString()
        val expectedValue = Value(kind = Value.Kind.NullValue())

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedValue, testAllTypesProto3.optionalValue)
    }

    @Test
    fun testWrapperValue_null() {
        val json = json {
            "optionalInt32" to JsonNull
            "mapBoolBool" to JsonNull
            "repeatedString" to JsonNull
            "optionalNestedMessage" to JsonNull
        }.toString()
        val expectedMessage = TestAllTypesProto3.defaultInstance

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedMessage, testAllTypesProto3)
    }
}
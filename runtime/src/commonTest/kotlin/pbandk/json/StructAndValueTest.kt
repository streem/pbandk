package pbandk.json

import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.json
import kotlinx.serialization.json.jsonArray
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.ListValue
import pbandk.wkt.Struct
import pbandk.wkt.Value
import kotlin.test.Test
import kotlin.test.assertEquals

class StructAndValueTest {
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
        val json = json { "optionalStruct" to json { "key" to jsonArray { +"value1"; +"value2" } } }.toString()
        val expectedStruct = Struct(mapOf("key" to Value(
            Value.Kind.ListValue(
                ListValue(listOf(
            Value(Value.Kind.StringValue("value1")),
            Value(Value.Kind.StringValue("value2"))
                )
        )
            ))
        ))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withStruct() {
        val json = json { "optionalStruct" to json { "key" to json { "innerKey" to "value" } } }.toString()
        val expectedStruct = Struct(mapOf("key" to Value(
            Value.Kind.StructValue(
                Struct(
            mapOf("innerKey" to Value(Value.Kind.StringValue("value")))
        )
            ))
        ))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNull() {
        val json = json { "optionalStruct" to json { "key" to JsonNull } }.toString()
        val expectedStruct = Struct(mapOf("key" to Value(Value.Kind.NullValue())))

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedStruct, testAllTypesProto3.optionalStruct)
    }

    @Test
    fun testStructField_withNumberString() {
        val json = json { "optionalStruct" to json { "key" to "1.0" } }.toString()
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
        }
        }.toString()

        val expectedStruct = Struct(mapOf(
            "key1" to Value(Value.Kind.NumberValue(1.0)),
            "key2" to Value(Value.Kind.StringValue("TWO")),
            "key3" to Value(
                Value.Kind.ListValue(
                    ListValue(listOf(
                Value(Value.Kind.StringValue("value1")),
                Value(Value.Kind.StringValue("value2"))
                    )
            )
                )),
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
}
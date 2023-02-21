package pbandk

import pbandk.gen.MapField
import pbandk.testpb.Foo
import pbandk.testpb.FooMap
import pbandk.testpb.FooMapEntries
import pbandk.testpb.ForeignEnum
import pbandk.testpb.ForeignMessage
import pbandk.testpb.MapEntry
import pbandk.testpb.TestAllTypesProto3
import pbandk.types.enum
import pbandk.types.message
import pbandk.types.string
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class MapTest {
    /**
     * When map fields are manually constructed they usually use Kotlin's standard `mapOf()` method. When map fields
     * are constructed from decoding a binary protobuf message, they usually use pbandk's `MapField`. The binary
     * encoding code implements some optimizations when the map field is an instance of `MapField`. We need to make
     * sure the optimized and non-optimized code paths both produce the same output.
     */
    @Test
    fun testMapEntryEquivalence() {
        val testWithMapFieldEntries = TestAllTypesProto3 {
            mapStringForeignMessage += MapField.of(
                string(),
                message(ForeignMessage),
                "a" to ForeignMessage {},
                "b" to ForeignMessage { c = 5 },
            )
            mapStringForeignEnum += MapField.of(
                string(),
                enum(ForeignEnum),
                "a" to ForeignEnum.FOREIGN_FOO,
                "b" to ForeignEnum.FOREIGN_BAR
            )
        }
        val testWithGenericMapEntries = TestAllTypesProto3 {
            mapStringForeignMessage += mapOf(
                "a" to ForeignMessage {},
                "b" to ForeignMessage { c = 5 },
            )
            mapStringForeignEnum += mapOf(
                "a" to ForeignEnum.FOREIGN_FOO,
                "b" to ForeignEnum.FOREIGN_BAR
            )
        }

        assertEquals(testWithMapFieldEntries.protoSize, testWithGenericMapEntries.protoSize)
        assertContentEquals(
            testWithMapFieldEntries.encodeToByteArray(),
            testWithGenericMapEntries.encodeToByteArray()
        )
    }

    @Test
    fun testMapsAreEqualToRepeatedMapEntries() {
        val fooMap = FooMap {
            map["a"] = Foo { `val` = "5" }
            map["b"] = Foo {}
        }
        val fooMapBytes = fooMap.encodeToByteArray()

        val fooMapEntries = FooMapEntries {
            map += listOf(
                MapEntry {
                    key = "a"
                    value = Foo { `val` = "5" }
                },
                MapEntry {
                    key = "b"
                    value = Foo {}
                },
            )
        }
        val fooMapEntriesBytes = fooMapEntries.encodeToByteArray()

        assertEquals(fooMap.protoSize, fooMapEntries.protoSize)
        assertContentEquals(fooMapBytes, fooMapEntriesBytes)

        assertEquals(fooMap, FooMap.decodeFromByteArray(fooMapEntriesBytes))
        assertEquals(fooMapEntries, FooMapEntries.decodeFromByteArray(fooMapBytes))
    }

    @Test
    fun testMapsAreEqualToRepeatedMapEntries_withNullValues() {
        val fooMap = FooMap {
            map["c"] = Foo {}
        }
        val fooMapBytes = fooMap.encodeToByteArray()

        val fooMapEntries = FooMapEntries {
            map += listOf(
                MapEntry {
                    key = "c"
                    value = null
                },
            )
        }
        val fooMapEntriesBytes = fooMapEntries.encodeToByteArray()

        val fooMapEntriesNoNulls = FooMapEntries {
            map += listOf(
                MapEntry {
                    key = "c"
                    value = Foo {}
                }
            )
        }

        // Null values won't produce exactly equal maps since we don't support protobuf maps with null values in pbandk.
        // Instead, a null value on the wire gets translated to the default value for that type (e.g. 0 for int32, or
        // the default instance for a message type). This is similar to how some of the official protobuf
        // implementations treat null map values (such as Java and C#).

        assertNotEquals(fooMap.protoSize, fooMapEntries.protoSize)

        // Decoding a manually-created map entry with a null value should produce a map entry with a default value.
        assertEquals(fooMap, FooMap.decodeFromByteArray(fooMapEntriesBytes))
        // The reverse is not true however. Decoding a map entry with a default value will produce a manually-created
        // map entry that has the default value rather than anull.
        assertNotEquals(fooMapEntries, FooMapEntries.decodeFromByteArray(fooMapBytes))
        assertEquals(fooMapEntriesNoNulls, FooMapEntries.decodeFromByteArray(fooMapBytes))
    }
}
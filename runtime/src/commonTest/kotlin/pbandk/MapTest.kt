package pbandk

import pbandk.testpb.FooMap
import pbandk.testpb.FooMapEntries
import pbandk.testpb.ForeignEnum
import pbandk.testpb.ForeignMessage
import pbandk.testpb.foo
import pbandk.testpb.fooMap
import pbandk.testpb.fooMapEntries
import pbandk.testpb.foreignMessage
import pbandk.testpb.mapEntry
import pbandk.testpb.testAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class MapTest {
    /**
     * When map fields are manually constructed they usually use Kotlin's standard `mapOf()` method. When map fields
     * are constructed from decoding a binary protobuf message, they usually use pbandk's `MessageMap`. The binary
     * encoding code implements some optimizations when the map field is an instance of `MessageMap`. We need to make
     * sure the optimized and non-optimized code paths both produce the same output.
     */
    @Test
    fun testMapEntryEquivalence() {
        val testWithMessageMapEntries = testAllTypesProto3 {
            mapStringForeignMessage = MessageMap.of(
                FieldDescriptor.Type.Primitive.String(),
                FieldDescriptor.Type.Message(ForeignMessage.Companion),
                "a" to foreignMessage {},
                "b" to foreignMessage { c = 5 },
                "c" to null
            )
            mapStringForeignEnum = MessageMap.of(
                FieldDescriptor.Type.Primitive.String(),
                FieldDescriptor.Type.Enum(ForeignEnum.Companion),
                "a" to ForeignEnum.FOREIGN_FOO,
                "b" to ForeignEnum.FOREIGN_BAR
            )
        }
        val testWithGenericMapEntries = testAllTypesProto3 {
            mapStringForeignMessage = mapOf(
                "a" to foreignMessage {},
                "b" to foreignMessage { c = 5 },
                "c" to null
            )
            mapStringForeignEnum = mapOf(
                "a" to ForeignEnum.FOREIGN_FOO,
                "b" to ForeignEnum.FOREIGN_BAR
            )
        }

        assertEquals(testWithMessageMapEntries.protoSize, testWithGenericMapEntries.protoSize)
        assertContentEquals(
            testWithMessageMapEntries.encodeToByteArray(),
            testWithGenericMapEntries.encodeToByteArray()
        )
    }

    @Test
    fun testMapsAreEqualToRepeatedMapEntries() {
        val fooMap = fooMap {
            map = mapOf(
                "a" to foo { `val` = "5" },
                "b" to foo {},
                "c" to null
            )
        }
        val fooMapBytes = fooMap.encodeToByteArray()

        val fooMapEntries = fooMapEntries {
            map = listOf(
                FooMapEntries.mapEntry {
                    key = "a"
                    value = foo { `val` = "5" }
                },
                FooMapEntries.mapEntry {
                    key = "b"
                    value = foo {}
                },
                FooMapEntries.mapEntry {
                    key = "c"
                    value = null
                }
            )
        }
        val fooMapEntriesBytes = fooMapEntries.encodeToByteArray()

        assertEquals(fooMap.protoSize, fooMapEntries.protoSize)
        assertContentEquals(fooMapBytes, fooMapEntriesBytes)

        assertEquals(fooMap, FooMap.decodeFromByteArray(fooMapEntriesBytes))
        assertEquals(fooMapEntries, FooMapEntries.decodeFromByteArray(fooMapBytes))
    }
}
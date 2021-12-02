package pbandk

import pbandk.testpb.*
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
        val testWithMessageMapEntries = TestAllTypesProto3(
            mapStringForeignMessage = MessageMap.of(
                FieldDescriptor.Type.Primitive.String(),
                FieldDescriptor.Type.Message(ForeignMessage.Companion),
                "a" to ForeignMessage(),
                "b" to ForeignMessage(c = 5),
                "c" to null
            ),
            mapStringForeignEnum = MessageMap.of(
                FieldDescriptor.Type.Primitive.String(),
                FieldDescriptor.Type.Enum(ForeignEnum.Companion),
                "a" to ForeignEnum.FOREIGN_FOO,
                "b" to ForeignEnum.FOREIGN_BAR
            )
        )
        val testWithGenericMapEntries = TestAllTypesProto3(
            mapStringForeignMessage = mapOf(
                "a" to ForeignMessage(),
                "b" to ForeignMessage(c = 5),
                "c" to null
            ),
            mapStringForeignEnum = mapOf(
                "a" to ForeignEnum.FOREIGN_FOO,
                "b" to ForeignEnum.FOREIGN_BAR
            )
        )

        assertEquals(testWithMessageMapEntries.protoSize, testWithGenericMapEntries.protoSize)
        assertContentEquals(
            testWithMessageMapEntries.encodeToByteArray(),
            testWithGenericMapEntries.encodeToByteArray()
        )
    }

    @Test
    fun testMapsAreEqualToRepeatedMapEntries() {
        val fooMap = FooMap(
            map = mapOf(
                "a" to Foo("5"),
                "b" to Foo(),
                "c" to null
            )
        )
        val fooMapBytes = fooMap.encodeToByteArray()

        val fooMapEntries = FooMapEntries(
            map = listOf(
                FooMapEntries.MapEntry("a", Foo("5")),
                FooMapEntries.MapEntry("b", Foo()),
                FooMapEntries.MapEntry("c", null)
            )
        )
        val fooMapEntriesBytes = fooMapEntries.encodeToByteArray()

        assertEquals(fooMap.protoSize, fooMapEntries.protoSize)
        assertContentEquals(fooMapBytes, fooMapEntriesBytes)

        assertEquals(fooMap, FooMap.decodeFromByteArray(fooMapEntriesBytes))
        assertEquals(fooMapEntries, FooMapEntries.decodeFromByteArray(fooMapBytes))
    }
}
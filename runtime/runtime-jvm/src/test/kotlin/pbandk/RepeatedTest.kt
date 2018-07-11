package pbandk

import pbandk.testpb.Bar
import pbandk.testpb.Foo
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RepeatedTest {
    @Test
    fun testRepeatedMessage() {
        // This used to fail because it assumed messages could be packed
        val bytes = intArrayOf(10, 6, 10, 4, 102, 111, 111, 49, 10, 6, 10, 4, 102, 111, 111, 50).map { it.toByte() }.toByteArray()
        val expected = Bar(foos = listOf(Foo(`val` = "foo1"), Foo(`val` = "foo2")))

        assertTrue(expected.protoMarshal().contentEquals(bytes))
        assertEquals(expected, Bar.protoUnmarshal(bytes))
    }
}


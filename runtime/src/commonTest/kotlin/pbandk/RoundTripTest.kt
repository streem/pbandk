package pbandk

import pbandk.testpb.Foo
import kotlin.test.Test
import kotlin.test.assertEquals

class RoundTripTest {
    @Test
    fun testFoo() {
        val foo = Foo("Hello world!")
        val bytes = foo.encodeToByteArray()
        assertEquals((byteArrayOf(10, 12) + "Hello world!".map { it.toByte() }.toByteArray()).asList(), bytes.asList())
        assertEquals(foo, Foo.decodeFromByteArray(bytes))
    }
}
package pbandk

import pbandk.testpb.Bar
import pbandk.testpb.Foo
import kotlin.test.Test
import kotlin.test.assertEquals

class GeneratedMessageTest {
    @Test
    fun test_toString() {
        val bar = Bar(singleFoo = Foo(`val` = "hi there"))

        assertEquals("Bar(foos=[], single_foo=Foo(val=hi there))", bar.toString())
    }

}
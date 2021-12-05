package pbandk

import pbandk.testpb.bar
import pbandk.testpb.foo
import kotlin.test.Test
import kotlin.test.assertEquals

class GeneratedMessageTest {
    @Test
    fun test_toString() {
        val bar = bar {
            singleFoo = foo { `val` = "hi there" }
        }

        assertEquals("Bar(foos=[], single_foo=Foo(val=hi there))", bar.toString())
    }

}
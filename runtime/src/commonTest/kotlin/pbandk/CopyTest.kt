package pbandk

import pbandk.testpb.bar
import pbandk.testpb.foo
import kotlin.test.Test
import kotlin.test.assertEquals

class CopyTest {
    @Test
    fun testCopyMethod() {
        val bar = bar {
            foos = listOf(
                foo { `val` = "hi" },
                foo { `val` = "there" }
            )
            singleFoo = foo { `val` = "bye" }
        }

        assertEquals(bar.foos, bar.copy(singleFoo = foo { `val` = "test" }).foos)
        assertEquals(bar.singleFoo, bar.copy(foos = emptyList()).singleFoo)

        assertEquals(foo { `val` = "test" }, bar.copy(singleFoo = foo { `val` = "test" }).singleFoo)
    }
}
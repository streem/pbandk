package pbandk

import pbandk.testpb.Bar
import pbandk.testpb.Foo
import pbandk.testpb.copy
import kotlin.test.Test
import kotlin.test.assertEquals

class CopyTest {
    @Test
    fun testCopyMethod() {
        val bar = Bar(
            foos = listOf(Foo("hi"), Foo("there")),
            singleFoo = Foo("bye")
        )

        assertEquals(bar.foos, bar.copy(singleFoo = Foo("test")).foos)
        assertEquals(bar.singleFoo, bar.copy(foos = emptyList()).singleFoo)

        assertEquals(Foo("test"), bar.copy(singleFoo = Foo("test")).singleFoo)
    }
}
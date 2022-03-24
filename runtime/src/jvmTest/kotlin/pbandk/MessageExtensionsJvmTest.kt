package pbandk

import pbandk.testpb.MessageWithMap
import pbandk.testpb.java.Test.Foo
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MessageExtensionsJvmTest {

    @Test
    fun testDelimited() {
        val testMap = mapOf("1" to "a", "2" to "b", "blahblahblah" to "5000")
        val orgMessage = MessageWithMap(testMap)
        val foo = Foo.getDefaultInstance()
        val output = ByteArrayOutputStream(100 * 1000)

        orgMessage.writeDelimitedTo(output)
        foo.writeDelimitedTo(output)
        orgMessage.writeDelimitedTo(output)
        foo.writeDelimitedTo(output)

        val result = output.toByteArray()
        val input = ByteArrayInputStream(result)

        val m1 = MessageWithMap.parseDelimitedFrom(input)
        assertEquals(m1, orgMessage)

        val m2 = Foo.parseDelimitedFrom(input)
        assertEquals(m2, foo)

        val m3 = MessageWithMap.parseDelimitedFrom(input)
        assertEquals(m3, orgMessage)

        val m4 = Foo.parseDelimitedFrom(input)
        assertEquals(m4, foo)

        assertNull(MessageWithMap.parseDelimitedFrom(input))
        assertNull(Foo.parseDelimitedFrom(input))
    }

}
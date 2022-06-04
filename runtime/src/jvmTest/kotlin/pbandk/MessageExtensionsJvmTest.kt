package pbandk

import pbandk.testpb.Foo
import pbandk.testpb.MessageWithMap
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class MessageExtensionsJvmTest {

    @Test
    fun testDelimited() {
        val testMap = mapOf("1" to "a", "2" to "b", "blahblahblah" to "5000")
        val orgMessage = MessageWithMap { map += testMap }
        val foo = Foo.defaultInstance
        val output = ByteArrayOutputStream(100 * 1000)

        orgMessage.encodeDelimitedToStream(output)
        foo.encodeDelimitedToStream(output)
        orgMessage.encodeDelimitedToStream(output)
        foo.encodeDelimitedToStream(output)

        val result = output.toByteArray()
        val input = ByteArrayInputStream(result)

        val m1 = MessageWithMap.decodeDelimitedFromStream(input)
        assertEquals(m1, orgMessage)

        val m2 = Foo.decodeDelimitedFromStream(input)
        assertEquals(m2, foo)

        val m3 = MessageWithMap.decodeDelimitedFromStream(input)
        assertEquals(m3, orgMessage)

        val m4 = Foo.decodeDelimitedFromStream(input)
        assertEquals(m4, foo)

        assertNull(MessageWithMap.decodeDelimitedFromStream(input))
        assertNull(Foo.decodeDelimitedFromStream(input))
    }

    @Test
    fun testReadWithJavaProtoBuf() {
        val testMap = mapOf("1" to "a", "2" to "b", "blahblahblah" to "5000")
        val pbMap = MessageWithMap { map += testMap }
        val output = ByteArrayOutputStream(100 * 1000)

        // Write pbandk `MessageWithMap` to an output stream
        pbMap.encodeDelimitedToStream(output)

        // Read protobuf-java `MessageWithMap` instance from the same stream
        val result = output.toByteArray()
        val input = ByteArrayInputStream(result)
        val javaMap = pbandk.testpb.java.Test.MessageWithMap.parseDelimitedFrom(input)

        // Ensure the two instances are equal to each other
        pbandkJavaRoundtripTest(javaMap, pbMap, MessageWithMap)
    }

    @Test
    fun testReadFromJavaProtoBuf() {
        val javaFoo = pbandk.testpb.java.Test.Foo.getDefaultInstance()
        val output = ByteArrayOutputStream(100 * 1000)

        // Write protobuf-java Foo to an output stream
        javaFoo.writeDelimitedTo(output)

        // Read pbandk Foo from the stream
        val result = output.toByteArray()
        val input = ByteArrayInputStream(result)
        val pbFoo = Foo.decodeDelimitedFromStream(input)
        assertNotNull(pbFoo)

        // Ensure the two instances are equal to each other
        pbandkJavaRoundtripTest(javaFoo, pbFoo, Foo)
    }
}
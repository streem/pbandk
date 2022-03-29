package pbandk

import pbandk.testpb.MessageWithMap
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import kotlin.test.*

class MessageExtensionsJvmTest {

    @Test
    fun testDelimited() {
        val testMap = mapOf("1" to "a", "2" to "b", "blahblahblah" to "5000")
        val orgMessage = MessageWithMap(testMap)
        val foo = pbandk.testpb.Foo.defaultInstance
        val output = ByteArrayOutputStream(100 * 1000)

        orgMessage.encodeDelimitedToStream(output)
        foo.encodeDelimitedToStream(output)
        orgMessage.encodeDelimitedToStream(output)
        foo.encodeDelimitedToStream(output)

        val result = output.toByteArray()
        val input = ByteArrayInputStream(result)

        val m1 = MessageWithMap.decodeDelimitedFromStream(input)
        assertEquals(m1, orgMessage)

        val m2 = pbandk.testpb.Foo.decodeDelimitedFromStream(input)
        assertEquals(m2, foo)

        val m3 = MessageWithMap.decodeDelimitedFromStream(input)
        assertEquals(m3, orgMessage)

        val m4 = pbandk.testpb.Foo.decodeDelimitedFromStream(input)
        assertEquals(m4, foo)

        assertNull(MessageWithMap.decodeDelimitedFromStream(input))
        assertNull(pbandk.testpb.Foo.decodeDelimitedFromStream(input))
    }

    @Test
    fun testReadWithJavaProtoBuf() {
        val testMap = mapOf("1" to "a", "2" to "b", "blahblahblah" to "5000")
        val pbMap = MessageWithMap(testMap)
        val output = ByteArrayOutputStream(100 * 1000)

        // Write pbandk `MessageWithMap` to an output stream
        pbMap.encodeDelimitedToStream(output)

        // Read protobuf-java `MessageWithMap` instance from the same stream
        val result = output.toByteArray()
        val input = ByteArrayInputStream(result)
        val javaMap = pbandk.testpb.java.Test.MessageWithMap.parseDelimitedFrom(input)

        // Ensure the two instances are equal to each other
        kotlinJavaRoundtripTest(javaMap, pbMap, pbandk.testpb.MessageWithMap)
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
        val pbFoo = pbandk.testpb.Foo.decodeDelimitedFromStream(input)
        assertNotNull(pbFoo)

        // Ensure the two instances are equal to each other
        kotlinJavaRoundtripTest(javaFoo, pbFoo, pbandk.testpb.Foo)
    }

    // TODO use runtime/src/jvmTest/kotlin/pbandk/TestUtils.kt when available
    /** Generate a Java version of the proto and deserialize Kotlin version and vice-versa */
    fun <T : Message> kotlinJavaRoundtripTest(
        builtJavaObj: com.google.protobuf.Message,
        builtKotlinObj: T,
        kotlinCompanion: Message.Companion<T>
    ) {
        assertEquals(builtJavaObj.serializedSize, builtKotlinObj.protoSize)

        val builtJavaBytes = builtJavaObj.toByteArray()
        val builtKotlinBytes = builtKotlinObj.encodeToByteArray()
        assertContentEquals(builtJavaBytes, builtKotlinBytes)

        val gendJavaObj = builtJavaObj.parserForType.parseFrom(builtKotlinBytes)
        val gendKotlinObj = kotlinCompanion.decodeFromByteArray(builtJavaBytes)
        assertEquals(builtJavaObj, gendJavaObj)
        assertEquals(builtKotlinObj, gendKotlinObj)

        assertEquals(builtKotlinObj.protoSize, gendKotlinObj.protoSize)
        assertContentEquals(builtKotlinBytes, gendKotlinObj.encodeToByteArray())
    }

}
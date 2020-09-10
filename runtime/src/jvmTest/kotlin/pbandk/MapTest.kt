package pbandk

import pbandk.testpb.MessageWithMap
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MapTest {
    @Test
    fun testMap() {
        val testMap = mapOf("1" to "a", "2" to "b", "blahblahblah" to "5000")
        // Generate a Java version of the proto and deserialize Kotlin version and vice-versa
        val builtJavaObj = pbandk.testpb.java.Test.MessageWithMap.newBuilder().putAllMap(testMap).build()
        val builtKotlinObj = MessageWithMap(testMap)
        assertEquals(builtJavaObj.serializedSize, builtKotlinObj.protoSize)

        val builtJavaBytes = builtJavaObj.toByteArray()
        val builtKotlinBytes = builtKotlinObj.encodeToByteArray()
        assertEquals(builtJavaBytes.toList(), builtKotlinBytes.toList())

        val gendJavaObj = pbandk.testpb.java.Test.MessageWithMap.parseFrom(builtKotlinBytes)
        val gendKotlinObj = MessageWithMap.decodeFromByteArray(builtJavaBytes)
        assertEquals(builtJavaObj, gendJavaObj)
        assertEquals(builtKotlinObj, gendKotlinObj)

        // Check that map-with-size
        assertTrue(gendKotlinObj.map is MessageMap)
        assertEquals(builtKotlinObj.protoSize, gendKotlinObj.protoSize)
        assertEquals(builtKotlinBytes.toList(), gendKotlinObj.encodeToByteArray().toList())
    }
}
package pbandk

import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

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
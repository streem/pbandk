package pbandk

import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

/** Generate a protobuf-java version of the proto and deserialize pbandk version and vice-versa */
fun <T : Message> pbandkJavaRoundtripTest(
    builtJavaObj: com.google.protobuf.Message,
    builtPbandkObj: T,
    pbandkCompanion: Message.Companion<T>,
    /**
     * Must the binary encodings of the protobuf-java and pbandk messages be byte-for-byte equivalent?
     * Normally this should be left at the default value of `true`.
     */
    encodingsMustBeEqual: Boolean = true,
) {
    val builtJavaBytes = builtJavaObj.toByteArray()
    val builtPbandkBytes = builtPbandkObj.encodeToByteArray()

    if (encodingsMustBeEqual) {
        assertEquals(
            builtJavaObj.serializedSize,
            builtPbandkObj.protoSize,
            "Serialized size did not match between pbandk and protobuf-java"
        )
        assertContentEquals(
            builtJavaBytes,
            builtPbandkBytes,
            "Binary encoding was not byte-for-byte equivalent between pbandk and protobuf-java"
        )
    }

    val gendJavaObj = builtJavaObj.parserForType.parseFrom(builtPbandkBytes)
    val gendPbandkObj = pbandkCompanion.decodeFromByteArray(builtJavaBytes)
    assertEquals(
        builtJavaObj,
        gendJavaObj,
        "Decoding the pbandk-encoded object with protobuf-java does not match the protobuf-java object"
    )
    assertEquals(
        builtPbandkObj,
        gendPbandkObj,
        "Decoding the protobuf-java-encoded object with pbandk does not match the pbandk object"
    )

    assertEquals(
        builtPbandkObj.protoSize,
        gendPbandkObj.protoSize,
        "After decoding the protobuf-java-encoded object with pbandk, the size does not match the pbandk object's size"
    )
    assertContentEquals(
        builtPbandkBytes,
        gendPbandkObj.encodeToByteArray(),
        "Binary encoding was not byte-for-byte equivalent between pbandk and the pbandk-decoded, protobuf-java-encoded protobuf-java object"
    )
}
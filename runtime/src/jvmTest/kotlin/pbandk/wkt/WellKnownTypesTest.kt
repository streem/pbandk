package pbandk.wkt

import com.google.protobuf.ByteString
import com.google.protobuf.MessageLite
import com.google.protobuf.UnknownFieldSet
import pbandk.*
import pbandk.testpb.Wrappers
import kotlin.test.Test
import kotlin.test.assertEquals

class WellKnownTypesTest {

    private fun <T : Message> Message.Companion<T>.assertMessageEquals(msg: T, pbMsg: MessageLite) {
        // First a simple check of their byte arrays
        val pbBytes = pbMsg.toByteArray()
        assertEquals(pbBytes.asList(), msg.encodeToByteArray().asList())
        // Now decode and check the two messages equal each other
        assertEquals(msg, decodeFromByteArray(pbBytes))
    }

    @Test
    fun testAny() {
        Any.assertMessageEquals(
                Any(
                    typeUrl = "foo",
                    value = ByteArr("bar".toByteArray())
                ),
                com.google.protobuf.Any.newBuilder()
                    .setTypeUrl("foo")
                    .setValue(ByteString.copyFromUtf8("bar"))
                    .build()
        )
        Any.assertMessageEquals(
                Any(
                    typeUrl = "foo",
                    value = ByteArr("bar".toByteArray()),
                    unknownFields = kotlinUnknownFields(35, "baz")
                ),
                com.google.protobuf.Any.newBuilder()
                    .setTypeUrl("foo")
                    .setValue(ByteString.copyFromUtf8("bar"))
                    .setUnknownFields(javaUnknownFields(35, "baz"))
                    .build()
        )
    }

    @Test
    fun testWrappers() {
        Wrappers.assertMessageEquals(
            Wrappers(stringValue = "test string"),
            pbandk.testpb.java.Test.Wrappers.newBuilder()
                .setStringValue(com.google.protobuf.StringValue.newBuilder().setValue("test string"))
                .build()
        )

        Wrappers.assertMessageEquals(
            Wrappers(),
            pbandk.testpb.java.Test.Wrappers.getDefaultInstance()
        )

        Wrappers.assertMessageEquals(
            Wrappers(stringValue = ""),
            pbandk.testpb.java.Test.Wrappers.newBuilder()
                .setStringValue(com.google.protobuf.StringValue.getDefaultInstance())
                .build()
        )
    }

    @Test
    fun testRepeatedWrappers() {
        Wrappers.assertMessageEquals(
            Wrappers(uint64Values = listOf(1, 2, 1234567890123456789)),
            pbandk.testpb.java.Test.Wrappers.newBuilder()
                .addAllUint64Values(listOf(1, 2, 1234567890123456789).map {
                    com.google.protobuf.UInt64Value.newBuilder().setValue(it).build()
                })
                .build()
        )

        Wrappers.assertMessageEquals(
            Wrappers(uint64Values = listOf(0)),
            pbandk.testpb.java.Test.Wrappers.newBuilder()
                .addUint64Values(com.google.protobuf.UInt64Value.getDefaultInstance())
                .build()
        )
    }

    companion object {
        private fun kotlinUnknownFields(fieldNum: Int, value: String) =
            mapOf(fieldNum to UnknownField(fieldNum, value))

        private fun javaUnknownFields(fieldNum: Int, value: String) =
            UnknownFieldSet.newBuilder().mergeLengthDelimitedField(fieldNum, ByteString.copyFromUtf8(value)).build()
    }
}
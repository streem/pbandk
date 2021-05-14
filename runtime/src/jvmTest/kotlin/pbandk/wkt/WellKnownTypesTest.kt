package pbandk.wkt

import com.google.protobuf.ByteString
import com.google.protobuf.MessageLite
import com.google.protobuf.UnknownFieldSet
import pbandk.ByteArr
import pbandk.Message
import pbandk.UnknownField
import pbandk.internal.binary.WireType
import pbandk.decodeFromByteArray
import pbandk.encodeToByteArray
import pbandk.testpb.Wrappers
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class WellKnownTypesTest {

    private fun <T : Message> Message.Companion<T>.assertMessageEquals(msg: T, pbMsg: MessageLite) {
        // First a simple check of their byte arrays
        val pbBytes = pbMsg.toByteArray()
        assertContentEquals(pbBytes, msg.encodeToByteArray())
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
                unknownFields = mapOf(
                    35 to UnknownField(
                        35,
                        listOf(
                            UnknownField.Value(
                                WireType.LENGTH_DELIMITED.value,
                                byteArrayOf(3) + "baz".encodeToByteArray()
                            )
                        )
                    )
                )
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
        private fun javaUnknownFields(fieldNum: Int, value: String) =
            UnknownFieldSet.newBuilder().mergeLengthDelimitedField(fieldNum, ByteString.copyFromUtf8(value)).build()
    }
}
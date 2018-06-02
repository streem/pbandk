package pbandk.wkt

import com.google.protobuf.ByteString
import com.google.protobuf.MessageLite
import com.google.protobuf.UnknownFieldSet
import pbandk.ByteArr
import pbandk.Message
import pbandk.UnknownField
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class WellKnownTypesTest {

    fun <T : Message> Message.Companion<T>.assertMessageEquals(msg: T, pbMsg: MessageLite) {
        // First a simple check of their byte arrays
        val pbBytes = pbMsg.toByteArray()
        assertTrue(pbBytes.contentEquals(msg.protoMarshal()))
        // Now unmarshal and check the two messages equal each other
        assertEquals(msg, protoUnmarshal(pbBytes))
    }

    @Test
    fun testAny() {
        pbandk.wkt.Any.assertMessageEquals(
                pbandk.wkt.Any(
                    typeUrl = "foo",
                    value = ByteArr("bar".toByteArray())
                ),
                com.google.protobuf.Any.newBuilder().
                    setTypeUrl("foo").
                    setValue(ByteString.copyFromUtf8("bar")).
                    build()
        )
        pbandk.wkt.Any.assertMessageEquals(
                pbandk.wkt.Any(
                    typeUrl = "foo",
                    value = ByteArr("bar".toByteArray()),
                    unknownFields = kotlinUnknownFields(35, "baz")
                ),
                com.google.protobuf.Any.newBuilder().
                    setTypeUrl("foo").
                    setValue(ByteString.copyFromUtf8("bar")).
                    setUnknownFields(javaUnknownFields(35, "baz")).
                    build()
        )
    }

    fun kotlinUnknownFields(fieldNum: Int, value: String) =
        mapOf(fieldNum to UnknownField(fieldNum, value))
    fun javaUnknownFields(fieldNum: Int, value: String) =
        UnknownFieldSet.newBuilder().mergeLengthDelimitedField(fieldNum, ByteString.copyFromUtf8(value)).build()
}
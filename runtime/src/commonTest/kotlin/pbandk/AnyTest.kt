package pbandk

import pbandk.testpb.Foo
import pbandk.testpb.TestAllTypesProto3
import pbandk.testpb.foo
import pbandk.testpb.testAllTypesProto3
import pbandk.wkt.Any
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnyTest {
    @Test
    fun testAny_field() {
        val message = testAllTypesProto3 {
            optionalAny = Any.pack(testAllTypesProto3 {
                optionalInt32 = 12345
            })
        }
        val encoded = message.encodeToByteArray()

        assertEquals(message, TestAllTypesProto3.decodeFromByteArray(encoded))
    }

    @Test
    fun testAny_topLevel() {
        val message = Any.pack(testAllTypesProto3 {
            optionalBool = true
        })
        val encoded = message.encodeToByteArray()

        assertEquals(message, Any.decodeFromByteArray(encoded))
    }

    @Test
    fun test_isA_positive() {
        val message = Any.pack(testAllTypesProto3 {
            optionalInt32 = 12345
        })

        assertTrue(message.isA(TestAllTypesProto3))
    }

    @Test
    fun test_isA_negative() {
        val message = Any.pack(foo {
            `val` = "hi"
        })

        assertFalse(message.isA(TestAllTypesProto3))
    }

    @Test
    fun test_isA_customTypeUrl() {
        val message = Any.pack(testAllTypesProto3 {
            optionalInt32 = 1234
        }, typeUrlPrefix = "foo.test.com/types/")

        assertTrue(message.isA(TestAllTypesProto3))
        assertEquals("foo.test.com/types/protobuf_test_messages.proto3.TestAllTypesProto3", message.typeUrl)
    }

    @Test
    fun test_isA_customTypeUrl_noSlash() {
        val message = Any.pack(TestAllTypesProto3(optionalInt32 = 12345), typeUrlPrefix = "foo.test.com/types")

        assertTrue(message.isA(TestAllTypesProto3))
        assertEquals("foo.test.com/types/protobuf_test_messages.proto3.TestAllTypesProto3", message.typeUrl)
    }

    @Test
    fun test_pack_unpack() {
        val message = TestAllTypesProto3(optionalInt32 = 12345)
        val anyMessage = Any.pack(message)

        assertTrue(anyMessage.isA(message.descriptor.messageCompanion))
        assertEquals(message, anyMessage.unpack(TestAllTypesProto3))
    }

    @Test
    fun test_unpack_wrongType() {
        val message = TestAllTypesProto3(optionalInt32 = 12345)
        val anyMessage = Any.pack(message)

        assertFailsWith<InvalidProtocolBufferException> {
            anyMessage.unpack(Foo)
        }
    }
}
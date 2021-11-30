package pbandk

import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertEquals

class MessageDescriptorTest {
    @Test
    fun testFullName() {
        assertEquals("protobuf_test_messages.proto3.TestAllTypesProto3", TestAllTypesProto3.descriptor.fullName)
    }

    @Test
    fun testFullName_Nested() {
        assertEquals(
            "protobuf_test_messages.proto3.TestAllTypesProto3.NestedMessage",
            TestAllTypesProto3.NestedMessage.descriptor.fullName
        )
    }

    @Test
    fun testName() {
        assertEquals("TestAllTypesProto3", TestAllTypesProto3.descriptor.name)
    }

    @Test
    fun testName_Nested() {
        assertEquals("NestedMessage", TestAllTypesProto3.NestedMessage.descriptor.name)
    }
}
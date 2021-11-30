package pbandk

import pbandk.testpb.Foo
import pbandk.testpb.ForeignMessage
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class TypeRegistryTest {
    private lateinit var typeRegistry: TypeRegistry

    @BeforeTest
    fun beforeTest() {
        typeRegistry = typeRegistry {
            add(TestAllTypesProto3)
        }
    }

    @Test
    fun test_contains_positive() {
        assertTrue(TestAllTypesProto3 in typeRegistry)
        assertTrue("protobuf_test_messages.proto3.TestAllTypesProto3" in typeRegistry)
    }

    @Test
    fun test_get_positive() {
        assertEquals(TestAllTypesProto3.descriptor, typeRegistry["protobuf_test_messages.proto3.TestAllTypesProto3"])
    }

    @Test
    fun test_contains_recursive() {
        assertTrue(ForeignMessage in typeRegistry)
        assertTrue(TestAllTypesProto3.NestedMessage in typeRegistry)
    }

    @Test
    fun test_get_recursive() {
        assertEquals(ForeignMessage.descriptor, typeRegistry["protobuf_test_messages.proto3.ForeignMessage"])
        assertEquals(
            TestAllTypesProto3.NestedMessage.descriptor,
            typeRegistry["protobuf_test_messages.proto3.TestAllTypesProto3.NestedMessage"]
        )
    }

    @Test
    fun test_contains_negative() {
        assertFalse(Foo in typeRegistry)
    }

    @Test
    fun test_get_negative() {
        assertNull(typeRegistry["testpb.Foo"])
    }

    @Test
    fun test_containsTypeUrl() {
        assertTrue(typeRegistry.containsTypeUrl("type.googleapis.com/protobuf_test_messages.proto3.TestAllTypesProto3"))
        assertTrue(typeRegistry.containsTypeUrl("foo.test.com/protobuf_test_messages.proto3.TestAllTypesProto3"))
    }

    @Test
    fun test_getTypeNameFromTypeUrl() {
        assertEquals(
            "protobuf_test_messages.proto3.TestAllTypesProto3",
            getTypeNameFromTypeUrl("foo.test.com/types/protobuf_test_messages.proto3.TestAllTypesProto3")
        )
    }

    @Test
    fun test_getTypePrefixFromTypeUrl() {
        assertEquals(
            "foo.test.com/types",
            getTypePrefixFromTypeUrl("foo.test.com/types/protobuf_test_messages.proto3.TestAllTypesProto3")
        )
    }
}
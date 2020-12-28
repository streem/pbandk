package pbandk

import pbandk.testpb.Value
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class OneOfTest {
    @Test
    fun testOneOf_DuplicateNameIntegerValue() {
        val actual = Value(value = Value.Value.IntegerValue(1))
        assertNull(actual.booleanValue)
        assertNull(actual.stringValue)
        assertEquals(1, actual.integerValue)
    }

    @Test
    fun testOneOf_DuplicateNameStringValue() {
        val actual = Value(value = Value.Value.StringValue("foo"))
        assertNull(actual.booleanValue)
        assertNull(actual.integerValue)
        assertEquals("foo", actual.stringValue)
    }
}

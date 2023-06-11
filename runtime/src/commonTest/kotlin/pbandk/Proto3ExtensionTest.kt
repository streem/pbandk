package pbandk

import pbandk.testpb.nonOptionalInt32
import pbandk.testpb.optionalInt32
import pbandk.testpb.repeatedInt32
import pbandk.wkt.FieldOptions
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Proto3ExtensionTest {
    @Test
    fun testExtensionsAlwaysOptional() {
        assertNull(FieldOptions.defaultInstance.optionalInt32, "optional extension fields should be nullable")
        assertNull(
            FieldOptions.defaultInstance.nonOptionalInt32,
            "even non-optional extension fields should be nullable"
        )
    }

    @Test
    fun testRepeatedUpdates() {
        val fieldOptions = FieldOptions {
            repeatedInt32.add(1)
        }
        assertEquals(listOf(1), fieldOptions.repeatedInt32)

        val fieldOptions2 = fieldOptions.copy {
            repeatedInt32.add(2)
        }
        assertEquals(listOf(1, 2), fieldOptions2.repeatedInt32)
    }
}
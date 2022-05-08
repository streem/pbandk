package pbandk

import pbandk.testpb.nonOptionalInt32
import pbandk.testpb.optionalInt32
import pbandk.wkt.FieldOptions
import kotlin.test.Test
import kotlin.test.assertNull

class Proto3ExtensionTest {
    @Test
    fun testProto3Extension_alwaysOptional() {
        assertNull(FieldOptions.defaultInstance.optionalInt32, "optional extension fields should be nullable")
        assertNull(
            FieldOptions.defaultInstance.nonOptionalInt32,
            "even non-optional extension fields should be nullable"
        )
    }
}
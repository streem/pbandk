package pbandk

import pbandk.testpb.MultipleCustomOptions
import pbandk.testpb.MultipleCustomOptionsPlusDeprecated
import pbandk.testpb.SingleRequiredCustomOption
import pbandk.testpb.rules
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CustomOptionsTest {

    @Test
    fun testSingleRequiredCustomOption() {
        assertTrue(SingleRequiredCustomOption.descriptor.fields.find { it.name == "single" }?.options?.rules?.message?.required!!)
    }

    @Test
    fun testMultipleCustomOptions() {
        val options = MultipleCustomOptions.descriptor.fields.find { it.name == "multiple" }?.options!!
        assertTrue(options.rules?.message?.required!!)
        assertEquals(10, options.rules?.string?.minLen)
    }

    @Test
    fun testMultipleCustomOptionsPlusDeprecated() {
        val options = MultipleCustomOptionsPlusDeprecated.descriptor.fields
            .find { it.name == "multiple_deprecated" }
            ?.options!!
        assertEquals(true, options.deprecated)
        assertEquals(10, options.rules?.string?.minLen)
        assertEquals(32, options.rules?.string?.maxLen)
    }
}
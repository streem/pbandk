package pbandk

import pbandk.testpb.MultipleCustomOptions
import pbandk.testpb.MultipleCustomOptionsPlusDeprecated
import pbandk.testpb.SingleRequiredCustomOption
import pbandk.testpb.rules
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class CustomOptionsTest {

    @Test
    fun testSingleRequiredCustomOption() {
        val options = SingleRequiredCustomOption().descriptor.fields.single { it.name == "single" }.options

        assertEquals(true, options.rules?.message?.required)
    }

    @Test
    fun testMultipleCustomOptions() {
        val options = MultipleCustomOptions().descriptor.fields.single { it.name == "multiple" }.options

        assertEquals(true, options.rules?.message?.required)
        assertEquals(10, options.rules?.string?.minLen)
    }

    @Test
    fun testMultipleCustomOptionsPlusDeprecated() {
        val options = MultipleCustomOptionsPlusDeprecated().descriptor.fields.single {
            it.name == "multiple_deprecated"
        }.options

        assertEquals(true, options.deprecated)
        assertEquals(10, options.rules?.string?.minLen)
        assertEquals(32, options.rules?.string?.maxLen)
    }

    @Test
    fun testOperatorGetMethod() {
        val message = SingleRequiredCustomOption().descriptor.fields.single { it.name == "single" }.options

        assertEquals(true, message[rules]?.message?.required)
    }
}
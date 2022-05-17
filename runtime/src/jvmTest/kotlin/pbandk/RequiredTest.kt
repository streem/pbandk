package pbandk

import pbandk.testpb.MessageWithRequiredField
import kotlin.test.Ignore
import kotlin.test.Test

class RequiredTest {
    @Test
    fun testRequiredFieldDefaultValue() {
        val builtJavaObj = pbandk.testpb.java.TestProto2.MessageWithRequiredField.newBuilder().setFoo(false).build()
        val builtKotlinObj = MessageWithRequiredField { foo = false }
        pbandkJavaRoundtripTest(builtJavaObj, builtKotlinObj, MessageWithRequiredField.Companion)
    }
}
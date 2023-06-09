package pbandk

import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertFailsWith

class StringTest {
    @Test
    fun testUnpairedHighSurrogateInput() {
        val invalidChar = byteArrayOf(-19, 32, 0) // UTF-8 encoding of \uD800
        val encodedMsg = byteArrayOf(114, invalidChar.size.toByte()) + invalidChar

        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromByteArray(encodedMsg)
        }
    }

    @Test
    fun testUnpairedHighSurrogateOutput() {
        val msg = TestAllTypesProto3 {
            optionalString = "\uD800"
        }
        assertFailsWith(InvalidProtocolBufferException::class) {
            msg.encodeToByteArray()
        }
    }
}
package pbandk.json

import pbandk.InvalidProtocolBufferException
import pbandk.testpb.TestAllTypesProto3
import kotlin.test.Test
import kotlin.test.assertFailsWith

class StringTest {
    @Test
    fun testUnpairedHighSurrogateInput() {
        val json = "{\"optionalString\": \"\uD800\"}"
        assertFailsWith(InvalidProtocolBufferException::class) {
            TestAllTypesProto3.decodeFromJsonString(json)
        }
    }

    @Test
    fun testUnpairedHighSurrogateOutput() {
        val msg = TestAllTypesProto3 {
            optionalString = "\uD800"
        }
        assertFailsWith(InvalidProtocolBufferException::class) {
            msg.encodeToJsonString()
        }
    }
}
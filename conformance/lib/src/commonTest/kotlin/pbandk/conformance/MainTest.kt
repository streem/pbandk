package pbandk.conformance

import pbandk.ByteArr
import pbandk.conformance.pb.ConformanceRequest
import pbandk.conformance.pb.ConformanceResponse
import pbandk.conformance.pb.TestAllTypesProto3
import pbandk.conformance.pb.TestCategory
import pbandk.conformance.pb.WireFormat
import pbandk.encodeToByteArray
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun testSimpleRequest() {
        val res = handleConformanceRequest(ConformanceRequest {
            testCategory = TestCategory.BINARY_TEST
            requestedOutputFormat = WireFormat.PROTOBUF
            messageType = TestAllTypesProto3.descriptor.fullName
            protobufPayload = ByteArr(TestAllTypesProto3 {
                optionalFixed32 = 42
            }.encodeToByteArray())
        })

        assertEquals(ConformanceResponse {
            protobufPayload = ByteArr(TestAllTypesProto3 {
                optionalFixed32 = 42
            }.encodeToByteArray())
        }, res)
    }
}
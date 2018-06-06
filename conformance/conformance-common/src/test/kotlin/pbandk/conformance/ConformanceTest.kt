package pbandk.conformance

import com.google.protobuf.TextFormat
import pbandk.conformance.pb.TestAllTypesProto2
import pbandk.conformance.pb.TestAllTypesProto3
import kotlin.test.Test

class ConformanceTest {
    @Test
    fun testScratchArea() {
        val bytes = TextFormat.unescapeBytes("\\202\\007\\000")
        val parsed = TestAllTypesProto3.protoUnmarshal(bytes.toByteArray())
        println("WUT: " + parsed.oneofField)
        println("OK: " + TextFormat.escapeBytes(parsed.protoMarshal()))
    }
}